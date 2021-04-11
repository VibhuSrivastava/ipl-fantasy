package com.ipl.fantasy.service;


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
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
            .url("https://cricket-live-data.p.rapidapi.com/match/2432999")
            .get()
            .addHeader("x-rapidapi-key", "324bf8c4d5msh3773ac0c5cad4fep195032jsnc47fc03c4a37")
            .addHeader("x-rapidapi-host", "cricket-live-data.p.rapidapi.com")
            .build();
        Response response = null;
        System.out.println(request);
        try {
            response = client.newCall(request).execute();
            System.out.println(response);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response.body().string();
    }
}
