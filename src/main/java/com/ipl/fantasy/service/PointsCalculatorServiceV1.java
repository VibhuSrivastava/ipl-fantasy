package com.ipl.fantasy.service;


import com.google.gson.Gson;
import com.ipl.fantasy.api.PointsRequest;
import com.ipl.fantasy.api.PointsResponse;
import com.ipl.fantasy.domain.PointsCalculator;
import java.io.IOException;
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
        return new PointsResponse(points);
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
            .url("https://dev132-cricket-live-scores-v1.p.rapidapi.com/scorecards.php?seriesid=2780&matchid=50809")
            .get()
            .addHeader("x-rapidapi-key", "dc1d36d44dmsh35e298098fcc16dp1317bfjsn530fdb81dab5")
            .addHeader("x-rapidapi-host", "dev132-cricket-live-scores-v1.p.rapidapi.com")
            .build();

        Gson gson = new Gson();
        ResponseBody responseBody = client.newCall(request).execute().body();
        //SimpleEntity entity = gson.fromJson(responseBody.string(), SimpleEntity.class);

        return responseBody.string();
    }

    @NotNull
    private OkHttpClient getOkHttpClient() {
        return new OkHttpClient();
    }

}
