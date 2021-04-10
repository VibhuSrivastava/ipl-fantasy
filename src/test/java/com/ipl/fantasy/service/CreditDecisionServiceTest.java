package com.ipl.fantasy.service;

import com.ipl.fantasy.domain.PointsCalculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CreditDecisionServiceTest {

    @Mock
    private PointsCalculator creditDecisionMaker;

    @InjectMocks
    private CreditDecisionServiceV1 creditDecisionService;

    @Test
    public void shouldAcceptCreditRequest() {
//        CreditRequestV1 creditRequest = defaultCreditRequestOfPurchaseAmount(10);
//
//        when(customerDebtRepository.fetchCustomerDebtForEmail(creditRequest.getEmail()))
//                .thenReturn(new CustomerDebt(creditRequest.getEmail(), 7));
//        when(creditDecisionMaker.makeCreditDecision(10, 7))
//                .thenReturn(CreditDecision.ACCEPTED);
//
//        CreditRequestDecisionV1 decision = creditDecisionService.handleCreditRequestV1(creditRequest);
//        assertThat(decision.isAccepted(), is(true));
//        assertThat(decision.getReason(), is("ok"));
    }

}
