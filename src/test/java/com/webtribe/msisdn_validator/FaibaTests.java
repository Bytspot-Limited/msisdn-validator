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
public class FaibaTests extends BaseTest {
    /**VALID NUMBERS*/

    /**
     * ===================================
     * 0747 PREFIX
     * ===================================
     */

    @Test
    void test_faiba_valid_msisdn_254747() {
        var response = this.validationRequest(FAIBA_VALID_254747112233);
        Assertions.assertEquals(response.getId(), FAIBA_ID);
        Assertions.assertEquals(response.getProviderName(), FAIBA_NAME);

    }

    @Test
    void test_faiba_valid_msisdn_0747() {
        var response = this.validationRequest(FAIBA_VALID_0747112233);
        Assertions.assertEquals(response.getId(), FAIBA_ID);
        Assertions.assertEquals(response.getProviderName(), FAIBA_NAME);
    }

    @Test
    void test_faiba_valid_msisdn_747() {
        var response = this.validationRequest(FAIBA_VALID_747112233);
        Assertions.assertEquals(response.getId(), FAIBA_ID);
        Assertions.assertEquals(response.getProviderName(), FAIBA_NAME);
    }

    /**INVALID NUMBERS*/

    /**
     * ===================================
     * 0747 PREFIX
     * ===================================
     */

    @Test
    void test_faiba_invalid_msisdn_254747() {
        var response = this.validationRequest(FAIBA_INVALID_254747112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + FAIBA_INVALID_254747112233, response.getMessage());
    }


    @Test
    void test_faiba_invalid_msisdn_0747() {
        var response = this.validationRequest(FAIBA_INVALID_0747112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + FAIBA_INVALID_0747112233, response.getMessage());
    }

    @Test
    void test_faiba_invalid_msisdn_747() {
        var response = this.validationRequest(FAIBA_INVALID_747112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + FAIBA_INVALID_747112233, response.getMessage());
    }

}
