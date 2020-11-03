package com.webtribe.msisdn_validator.services;

import com.webtribe.msisdn_validator.utils.PhoneValidationResponse;
import io.micronaut.http.HttpStatus;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created on : 02 Nov,2020.
 * .
 *
 * @author eli
 */
@Singleton
public class MsisdnValidationFacade {
    @Inject
    ValidationService validationService;
    @Inject
    MatcherService matcherService;

    /**
     * Validate phone number provided.
     *
     * @param msisdn
     * @return
     */
    public PhoneValidationResponse validateMsisdn(String msisdn) {
        var response = validationService.validateMsisdn(msisdn);
        if (response.getCode() == HttpStatus.ACCEPTED.getCode()) {
            // phone number is valid. Attempting to match it to a MNO provider.
            response = matcherService.match(response.getMessage());
        }
        return response;
    }
}
