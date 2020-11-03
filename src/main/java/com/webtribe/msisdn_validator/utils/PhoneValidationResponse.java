package com.webtribe.msisdn_validator.utils;

import io.micronaut.http.HttpStatus;
import lombok.Data;

/**
 * Response body returned upon phone validation response.
 * Created on : 02 Nov,2020.
 *
 * @author eli
 */
@Data
public class PhoneValidationResponse {
    private int id;
    private String providerName;
    private String message;
    private int code;

}
