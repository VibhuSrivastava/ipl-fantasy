package com.ipl.fantasy.service;


import com.ipl.fantasy.api.PointsRequest;
import com.ipl.fantasy.api.PointsResponse;
import com.ipl.fantasy.domain.PointsCalculator;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Singleton
public class CreditDecisionServiceV1 {
    @Inject
    private PointsCalculator pointsCalculator;

    @POST
    @Path("/v1/points")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public PointsResponse handleCreditRequestV1(PointsRequest pointsRequest) {
        int points = 0;
        points = pointsCalculator.makeBatsmanDecision(pointsRequest.getRunsScored())
            + pointsCalculator.makeBowlerDecision(pointsRequest.getBallsBowled(), pointsRequest.getWickets(), pointsRequest.getRunsLeaked());
        return new PointsResponse(points);
    }
}
