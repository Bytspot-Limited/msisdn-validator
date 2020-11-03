package com.webtribe.msisdn_validator.services;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.webtribe.msisdn_validator.configs.MnoListing;
import com.webtribe.msisdn_validator.utils.AppConstants;
import com.webtribe.msisdn_validator.utils.PhoneValidationResponse;
import io.micronaut.http.HttpStatus;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Class contains all the validation logic for the provided phone numbers before the pattern-matching is done.
 * Created on : 02 Nov,2020.
 *
 * @author eli
 */
@Singleton
public class ValidationService {
    @Inject
    MnoListing mnoListing;

    public static final String COUNTRY_KE = "KE";

    /**
     * Validate the provided phone number is a valid phone number.
     *
     * @param msisdn
     * @return
     */
    PhoneValidationResponse validateMsisdn(String msisdn) {
        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();

        PhoneValidationResponse response = new PhoneValidationResponse();
        try {
            var phoneValidated = phoneUtil.parse(msisdn, COUNTRY_KE);

            HttpStatus status;
            String message;
            if (phoneUtil.isValidNumber(phoneValidated)) {
                status = HttpStatus.ACCEPTED;
                message = String.valueOf(phoneValidated.getNationalNumber());
            } else {
                status = HttpStatus.BAD_REQUEST;
                message = AppConstants.INVALID_MSISDN + msisdn;
            }


            response.setCode(status.getCode());
            response.setMessage(message);

            System.out.println(phoneValidated.getNationalNumber());
            System.out.println("Is number valid: " + status);

        } catch (NumberParseException e) {
            //e.printStackTrace();
            response.setCode(HttpStatus.BAD_REQUEST.getCode());
            response.setMessage(AppConstants.INVALID_MSISDN + e.getMessage());
        }
        return response;

    }
}
