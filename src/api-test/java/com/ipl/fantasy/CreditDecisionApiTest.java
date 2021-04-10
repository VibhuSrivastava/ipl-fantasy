package com.ipl.fantasy;

import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CreditDecisionApiTest {

    private static String SERVICE_URL = "http://localhost:8080/v1/decision";

    @Rule
    public final JettyServerResource server = new JettyServerResource();

    @Test
    public void requestUpTo10ShouldBeAccepted() {
//        CreditRequestV1 requestPayload = defaultCreditRequestOfPurchaseAmount(10);
//
//        Response response = ClientBuilder.newClient()
//                                         .target(SERVICE_URL).request()
//                                         .post(Entity.entity(requestPayload, MediaType.APPLICATION_JSON));
//
//        assertThat(response.getStatus(), is(200));
//        CreditRequestDecisionV1 creditDecision = response.readEntity(CreditRequestDecisionV1.class);
//        assertThat(creditDecision.isAccepted(), is(true));
//        assertThat(creditDecision.getReason(), is("ok"));
    }
}
