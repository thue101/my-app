package com.thulani.fraud.controller;

import com.thulani.fraud.model.FraudCheckResponse;
import com.thulani.fraud.service.FraudCheckService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("api/v1/fraud-check")
public class FraudController {

    private final FraudCheckService fraudCheckService;


    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(
            @PathVariable("customerId") Integer customerID){
            boolean isFraudulentCustomer = fraudCheckService.
                    isFraudCustomer(customerID);
       return new FraudCheckResponse(isFraudulentCustomer);
    }
}
