package com.ipl.fantasy.service;


import com.google.gson.Gson;
import com.ipl.fantasy.api.PointsRequest;
import com.ipl.fantasy.api.PointsResponse;
import com.ipl.fantasy.domain.PointsCalculator;
import com.ipl.fantasy.service.pojos.Batsman;
import com.ipl.fantasy.service.pojos.Bowler;
import com.ipl.fantasy.service.pojos.Inning;
import com.ipl.fantasy.service.pojos.ScorecardResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

@Path("/")
@Singleton
public class PointsCalculatorServiceV1 {
    @Inject
    private PointsCalculator pointsCalculator;

    @POST
    @Path("/v1/points")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public PointsResponse calculatePointsV1(PointsRequest pointsRequest) {

        int points = 0;
        points = pointsCalculator.makeBatsmanDecision(pointsRequest.getRunsScored())
            + pointsCalculator.makeBowlerDecision(pointsRequest.getBallsBowled(), pointsRequest.getWickets(), pointsRequest.getRunsLeaked());
        return null;
    }

    @GET
    @Path("/v1/scoreboard")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String scoreBoard() throws IOException {

        OkHttpClient client = getOkHttpClient();

        Request request = new Request.Builder()
            .url("https://dev132-cricket-live-scores-v1.p.rapidapi.com/scorecards.php?seriesid=2780&matchid=50809")
            .get()
            .addHeader("x-rapidapi-key", "dc1d36d44dmsh35e298098fcc16dp1317bfjsn530fdb81dab5")
            .addHeader("x-rapidapi-host", "dev132-cricket-live-scores-v1.p.rapidapi.com")
            .build();

        Response response;
            response = client.newCall(request).execute();
            System.out.println(response);

        return response.body().string();
    }

    @GET
    @Path("/v1/series")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String series() throws IOException {

        OkHttpClient client = getOkHttpClient();

        Request request = new Request.Builder()
            .url("https://dev132-cricket-live-scores-v1.p.rapidapi.com/matchseries.php?seriesid=2780")
            .get()
            .addHeader("x-rapidapi-key", "dc1d36d44dmsh35e298098fcc16dp1317bfjsn530fdb81dab5")
            .addHeader("x-rapidapi-host", "dev132-cricket-live-scores-v1.p.rapidapi.com")
            .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    @GET
    @Path("/v1/allplayerpoints")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String allPlayerPoints() throws IOException {

        OkHttpClient client = getOkHttpClient();
        Request request = new Request.Builder()
            .url("https://dev132-cricket-live-scores-v1.p.rapidapi.com/scorecards.php?seriesid=2780&matchid=50820")
            .get()
            .addHeader("x-rapidapi-key", "dc1d36d44dmsh35e298098fcc16dp1317bfjsn530fdb81dab5")
            .addHeader("x-rapidapi-host", "dev132-cricket-live-scores-v1.p.rapidapi.com")
            .build();

        Gson gson = new Gson();
        ResponseBody responseBody = client.newCall(request).execute().body();
        ScorecardResponse scorecardResponse = gson.fromJson(responseBody.string(), ScorecardResponse.class);

        //TODO : Move this somewhere else
        List<Inning> innings = scorecardResponse.getFullScorecard().getInnings();
        Map<String, Float> batsmenPoints = new HashMap<>();
        Map<String, Float> bowlerPoints = new HashMap<>();

        List<Batsman> batsmen = innings.stream().flatMap(batsman -> batsman.getBatsmen().stream()).collect(Collectors.toList());
        for (int i = 0; i < batsmen.size(); i++) {
            Float runs = !batsmen.get(i).getRuns().isEmpty() ? Float.parseFloat(batsmen.get(i).getRuns()):0;
            batsmenPoints.put(batsmen.get(i).getName(), runs);
        }

        List<Bowler> bowlers = innings.stream().flatMap(bowler -> bowler.getBowlers().stream()).collect(Collectors.toList());
        for(int i=0; i<bowlers.size();i++){
            Bowler bowler = bowlers.get(i);
            float runsConceded = !bowler.getRunsConceded().isEmpty() ? Float.parseFloat(bowler.getRunsConceded()):0;
            float wickets = !bowler.getWickets().isEmpty()? Float.parseFloat(bowler.getWickets()):0;
            float overs = (!bowler.getOvers().isEmpty() ? (Float.parseFloat(bowler.getOvers())) : 0);
            float balls = overs*6;
            float points=(wickets*25)+(balls-runsConceded);
            bowlerPoints.put(bowlers.get(i).getName(), points);
        }

        bowlerPoints.forEach(
            (key, value) -> batsmenPoints.merge( key, value, (v1, v2) -> v1+v2)
        );

        return gson.toJson(batsmenPoints);
    }

    @NotNull
    private OkHttpClient getOkHttpClient() {
        return new OkHttpClient();
    }

}
