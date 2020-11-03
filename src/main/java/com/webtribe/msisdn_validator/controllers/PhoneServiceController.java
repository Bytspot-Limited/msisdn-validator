package com.webtribe.msisdn_validator.controllers;

import com.webtribe.msisdn_validator.services.MsisdnValidationFacade;
import com.webtribe.msisdn_validator.utils.PhoneValidationResponse;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;

import javax.inject.Inject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Controller housing the validation endpoint.
 * Created on : 02 Nov,2020.
 *
 * @author eli
 */
@Controller("/api/v1/webtribe/validation-service")
public class PhoneServiceController {

    @Inject
    MsisdnValidationFacade validationFacade;

    @Get
    public HttpResponse<PhoneValidationResponse> validateMsisdn(@QueryValue String msisdn) {
        var response = validationFacade.validateMsisdn(msisdn);
        var status = response.getCode();
        System.out.println(response.toString());
        return HttpResponse.status(HttpStatus.valueOf(status)).body(response);
    }
}
