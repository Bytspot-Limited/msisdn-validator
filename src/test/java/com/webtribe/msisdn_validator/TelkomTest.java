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
public class TelkomTest extends BaseTest {
    /**VALID NUMBERS*/

    /**
     * ===================================
     * 0771 PREFIX
     * ===================================
     */

    @Test
    void test_telkom_valid_msisdn_254771() {
        var response = this.validationRequest(TELKOM_VALID_254771112233);
        Assertions.assertEquals(response.getId(), TELKOM_ID);
        Assertions.assertEquals(response.getProviderName(), TELKOM_NAME);

    }

    @Test
    void test_telkom_valid_msisdn_0771() {
        var response = this.validationRequest(TELKOM_VALID_0771112233);
        Assertions.assertEquals(response.getId(), TELKOM_ID);
        Assertions.assertEquals(response.getProviderName(), TELKOM_NAME);
    }

    @Test
    void test_telkom_valid_msisdn_771() {
        var response = this.validationRequest(TELKOM_VALID_771112233);
        Assertions.assertEquals(response.getId(), TELKOM_ID);
        Assertions.assertEquals(response.getProviderName(), TELKOM_NAME);
    }

    /**INVALID NUMBERS*/

    /**
     * ===================================
     * 0771 PREFIX
     * ===================================
     */

    @Test
    void test_telkom_invalid_msisdn_254771() {
        var response = this.validationRequest(TELKOM_INVALID_254771112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + TELKOM_INVALID_254771112233, response.getMessage());
    }


    @Test
    void test_telkom_invalid_msisdn_0771() {
        var response = this.validationRequest(TELKOM_INVALID_0771112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + TELKOM_INVALID_0771112233, response.getMessage());
    }

    @Test
    void test_telkom_invalid_msisdn_771() {
        var response = this.validationRequest(TELKOM_INVALID_771112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + TELKOM_INVALID_771112233, response.getMessage());
    }

}
