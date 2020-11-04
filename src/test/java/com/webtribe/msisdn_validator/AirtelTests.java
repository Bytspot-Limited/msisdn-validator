package com.webtribe.msisdn_validator;

import com.webtribe.msisdn_validator.utils.AppConstants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created on : 04 Nov,2020.
 * .
 *
 * @author eli
 */
public class AirtelTests extends BaseTest {
    /**VALID NUMBERS*/

    /**
     * ===================================
     * 0731 PREFIX
     * ===================================
     */

    @Test
    void test_airtel_valid_msisdn_254731() {
        var response = this.validationRequest(AIRTEL_VALID_254731112233);
        Assertions.assertEquals(response.getId(), AIRTEL_ID);
        Assertions.assertEquals(response.getProviderName(), AIRTEL_NAME);
    }

    @Test
    void test_airtel_valid_msisdn_0731() {
        var response = this.validationRequest(AIRTEL_VALID_0731112233);
        Assertions.assertEquals(response.getId(), AIRTEL_ID);
        Assertions.assertEquals(response.getProviderName(), AIRTEL_NAME);
    }

    @Test
    void test_airtel_valid_msisdn_731() {
        var response = this.validationRequest(AIRTEL_VALID_731112233);
        Assertions.assertEquals(response.getId(), AIRTEL_ID);
        Assertions.assertEquals(response.getProviderName(), AIRTEL_NAME);
    }

    /**
     * ===================================
     * 0751 PREFIX
     * ===================================
     */

    @Test
    void test_airtel_valid_msisdn_254751() {
        var response = this.validationRequest(AIRTEL_VALID_254751112233);
        Assertions.assertEquals(response.getId(), AIRTEL_ID);
        Assertions.assertEquals(response.getProviderName(), AIRTEL_NAME);
    }

    @Test
    void test_airtel_valid_msisdn_0751() {
        var response = this.validationRequest(AIRTEL_VALID_0751112233);
        Assertions.assertEquals(response.getId(), AIRTEL_ID);
        Assertions.assertEquals(response.getProviderName(), AIRTEL_NAME);
    }

    @Test
    void test_airtel_valid_msisdn_751() {
        var response = this.validationRequest(AIRTEL_VALID_751112233);
        Assertions.assertEquals(response.getId(), AIRTEL_ID);
        Assertions.assertEquals(response.getProviderName(), AIRTEL_NAME);
    }

    /**
     * ===================================
     * 0786 PREFIX
     * ===================================
     */

    @Test
    void test_airtel_valid_msisdn_254786() {
        var response = this.validationRequest(AIRTEL_VALID_254786112233);
        Assertions.assertEquals(response.getId(), AIRTEL_ID);
        Assertions.assertEquals(response.getProviderName(), AIRTEL_NAME);
    }

    @Test
    void test_airtel_valid_msisdn_0786() {
        var response = this.validationRequest(AIRTEL_VALID_0786112233);
        Assertions.assertEquals(response.getId(), AIRTEL_ID);
        Assertions.assertEquals(response.getProviderName(), AIRTEL_NAME);
    }

    @Test
    void test_airtel_valid_msisdn_786() {
        var response = this.validationRequest(AIRTEL_VALID_786112233);
        Assertions.assertEquals(response.getId(), AIRTEL_ID);
        Assertions.assertEquals(response.getProviderName(), AIRTEL_NAME);
    }

    /**
     * ===================================
     * 0101 PREFIX
     * ===================================
     */

    @Test
    void test_airtel_valid_msisdn_254101() {
        var response = this.validationRequest(AIRTEL_VALID_254101112233);
        Assertions.assertEquals(response.getId(), AIRTEL_ID);
        Assertions.assertEquals(response.getProviderName(), AIRTEL_NAME);
    }

    @Test
    void test_airtel_valid_msisdn_0101() {
        var response = this.validationRequest(AIRTEL_VALID_0101112233);
        Assertions.assertEquals(response.getId(), AIRTEL_ID);
        Assertions.assertEquals(response.getProviderName(), AIRTEL_NAME);
    }

    @Test
    void test_airtel_valid_msisdn_101() {
        var response = this.validationRequest(AIRTEL_VALID_101112233);
        Assertions.assertEquals(response.getId(), AIRTEL_ID);
        Assertions.assertEquals(response.getProviderName(), AIRTEL_NAME);
    }
    /** INVALID NUMBERS*/

    /**
     * ===================================
     * 0731 PREFIX
     * ===================================
     */

    @Test
    void test_airtel_invalid_msisdn_254731() {
        var response = this.validationRequest(AIRTEL_INVALID_254731112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + AIRTEL_INVALID_254731112233, response.getMessage());
    }

    @Test
    void test_airtel_invalid_msisdn_0731() {
        var response = this.validationRequest(AIRTEL_INVALID_0731112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + AIRTEL_INVALID_0731112233, response.getMessage());
    }

    @Test
    void test_airtel_invalid_msisdn_731() {
        var response = this.validationRequest(AIRTEL_INVALID_731112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + AIRTEL_INVALID_731112233, response.getMessage());
    }


}
