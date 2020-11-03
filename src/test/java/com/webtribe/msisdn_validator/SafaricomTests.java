package com.webtribe.msisdn_validator;

import com.webtribe.msisdn_validator.services.MsisdnValidationFacade;
import com.webtribe.msisdn_validator.utils.AppConstants;
import com.webtribe.msisdn_validator.utils.PhoneValidationResponse;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.runtime.Micronaut;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.inject.Inject;

@MicronautTest
public class SafaricomTests extends BaseTest{

    /**VALID NUMBERS*/

    /**
     * ===================================
     * 0700 PREFIX
     * ===================================
     */

    @Test
    void test_safaricom_valid_msisdn_254700() {
        var response = this.validationRequest(SAFARICOM_VALID_254700112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);

    }

    @Test
    void test_safaricom_valid_msisdn_0700() {
        var response = this.validationRequest(SAFARICOM_VALID_0700112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);
    }

    @Test
    void test_safaricom_valid_msisdn_700() {
        var response = this.validationRequest(SAFARICOM_VALID_700112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);
    }

    /**
     * ===================================
     * 0110 PREFIX
     * ===================================
     */
    @Test
    void test_safaricom_valid_msisdn_254110() {
        var response = this.validationRequest(SAFARICOM_VALID_254110112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);
    }

    @Test
    void test_safaricom_valid_msisdn_0110() {
        var response = this.validationRequest(SAFARICOM_VALID_0110112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);
    }

    @Test
    void test_safaricom_valid_msisdn_110() {
        var response = this.validationRequest(SAFARICOM_VALID_110112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);
    }

    /**
     * ===================================
     * 0111 PREFIX
     * ===================================
     */

    @Test
    void test_safaricom_valid_msisdn_254111() {
        var response = this.validationRequest(SAFARICOM_VALID_254111112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);
    }

    @Test
    void test_safaricom_valid_msisdn_0111() {
        var response = this.validationRequest(SAFARICOM_VALID_0111112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);
    }

    @Test
    void test_safaricom_valid_msisdn_111() {
        var response = this.validationRequest(SAFARICOM_VALID_111112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);
    }

    /**
     * ===================================
     * INVALID NUMBERS
     * ===================================
     */

    /**
     * ===================================
     * 0700 PREFIX
     * ===================================
     */
    @Test
    void test_safaricom_invalid_msisdn_254700() {
        var response = this.validationRequest(SAFARICOM_INVALID_254700112233);
//        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + SAFARICOM_INVALID_254700112233, response.getMessage());


    }

    @Test
    void test_safaricom_invalid_msisdn_0700() {
        var response = this.validationRequest(SAFARICOM_INVALID_0700112233);
        Assertions.assertEquals(response.getCode(), HttpStatus.BAD_REQUEST);
    }

    @Test
    void test_safaricom_invalid_msisdn_700() {
        var response = this.validationRequest(SAFARICOM_INVALID_700112233);
        Assertions.assertEquals(response.getCode(), HttpStatus.BAD_REQUEST);
    }


    /**
     * ===================================
     * 0110 PREFIX
     * ===================================
     */
    @Test
    void test_safaricom_invalid_msisdn_254110() {
        var response = this.validationRequest(SAFARICOM_INVALID_254110112233);
        Assertions.assertEquals(response.getCode(), HttpStatus.BAD_REQUEST.getCode());
    }

    @Test
    void test_safaricom_invalid_msisdn_0110() {
        var response = this.validationRequest(SAFARICOM_INVALID_0110112233);
        Assertions.assertEquals(response.getCode(), HttpStatus.BAD_REQUEST.getCode());
    }

    @Test
    void test_safaricom_invalid_msisdn_110() {
        var response = this.validationRequest(SAFARICOM_INVALID_110112233);
        Assertions.assertEquals(response.getCode(), HttpStatus.BAD_REQUEST);
    }

    /**
     * ===================================
     * 0111 PREFIX
     * ===================================
     */
    @Test
    void test_safaricom_invalid_msisdn_254111() {
        var response = this.validationRequest(SAFARICOM_INVALID_254111112233);
        Assertions.assertEquals(response.getCode(), HttpStatus.BAD_REQUEST);
    }

    @Test
    void test_safaricom_invalid_msisdn_0111() {
        var response = this.validationRequest(SAFARICOM_INVALID_0111112233);
        Assertions.assertEquals(response.getCode(), HttpStatus.BAD_REQUEST);
    }

    @Test
    void test_safaricom_invalid_msisdn_111() {
        var response = this.validationRequest(SAFARICOM_INVALID_111112233);
        Assertions.assertEquals(response.getCode(), HttpStatus.BAD_REQUEST);
    }

}
