package com.webtribe.msisdn_validator;

import com.webtribe.msisdn_validator.utils.AppConstants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SafaricomTests extends BaseTest {

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
     * 0712 PREFIX
     * ===================================
     */

    @Test
    void test_safaricom_valid_msisdn_254712() {
        var response = this.validationRequest(SAFARICOM_VALID_254712112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);

    }

    @Test
    void test_safaricom_valid_msisdn_0712() {
        var response = this.validationRequest(SAFARICOM_VALID_0712112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);
    }

    @Test
    void test_safaricom_valid_msisdn_712() {
        var response = this.validationRequest(SAFARICOM_VALID_712112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);
    }

    /**
     * ===================================
     * 0744 PREFIX
     * ===================================
     */

    @Test
    void test_safaricom_valid_msisdn_254744() {
        var response = this.validationRequest(SAFARICOM_VALID_254744144233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);

    }

    @Test
    void test_safaricom_valid_msisdn_0744() {
        var response = this.validationRequest(SAFARICOM_VALID_0744144233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);
    }

    @Test
    void test_safaricom_valid_msisdn_744() {
        var response = this.validationRequest(SAFARICOM_VALID_744144233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);
    }


    /**
     * ===================================
     * 0758 PREFIX
     * ===================================
     */

    @Test
    void test_safaricom_valid_msisdn_254758() {
        var response = this.validationRequest(SAFARICOM_VALID_254758112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);

    }

    @Test
    void test_safaricom_valid_msisdn_0758() {
        var response = this.validationRequest(SAFARICOM_VALID_0758112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);
    }

    @Test
    void test_safaricom_valid_msisdn_758() {
        var response = this.validationRequest(SAFARICOM_VALID_758112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);
    }

    /**
     * ===================================
     * 0769 PREFIX
     * ===================================
     */

    @Test
    void test_safaricom_valid_msisdn_254769() {
        var response = this.validationRequest(SAFARICOM_VALID_254769112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);

    }

    @Test
    void test_safaricom_valid_msisdn_0769() {
        var response = this.validationRequest(SAFARICOM_VALID_0769112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);
    }

    @Test
    void test_safaricom_valid_msisdn_769() {
        var response = this.validationRequest(SAFARICOM_VALID_769112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);
    }


    /**
     * ===================================
     * 0791 PREFIX
     * ===================================
     */

    @Test
    void test_safaricom_valid_msisdn_254791() {
        var response = this.validationRequest(SAFARICOM_VALID_254791112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);

    }

    @Test
    void test_safaricom_valid_msisdn_0791() {
        var response = this.validationRequest(SAFARICOM_VALID_0791112233);
        Assertions.assertEquals(response.getId(), SAFARICOM_ID);
        Assertions.assertEquals(response.getProviderName(), SAFARICOM_NAME);
    }

    @Test
    void test_safaricom_valid_msisdn_791() {
        var response = this.validationRequest(SAFARICOM_VALID_791112233);
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
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + SAFARICOM_INVALID_254700112233, response.getMessage());


    }

    @Test
    void test_safaricom_invalid_msisdn_0700() {
        var response = this.validationRequest(SAFARICOM_INVALID_0700112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + SAFARICOM_INVALID_0700112233, response.getMessage());
    }

    @Test
    void test_safaricom_invalid_msisdn_700() {
        var response = this.validationRequest(SAFARICOM_INVALID_700112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + SAFARICOM_INVALID_700112233, response.getMessage());
    }


    /**
     * ===================================
     * 0110 PREFIX
     * ===================================
     */
    @Test
    void test_safaricom_invalid_msisdn_254110() {
        var response = this.validationRequest(SAFARICOM_INVALID_254110112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + SAFARICOM_INVALID_254110112233, response.getMessage());
    }

    @Test
    void test_safaricom_invalid_msisdn_0110() {
        var response = this.validationRequest(SAFARICOM_INVALID_0110112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + SAFARICOM_INVALID_0110112233, response.getMessage());
    }

    @Test
    void test_safaricom_invalid_msisdn_110() {
        var response = this.validationRequest(SAFARICOM_INVALID_110112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + SAFARICOM_INVALID_110112233, response.getMessage());
    }

    /**
     * ===================================
     * 0111 PREFIX
     * ===================================
     */
    @Test
    void test_safaricom_invalid_msisdn_254111() {
        var response = this.validationRequest(SAFARICOM_INVALID_254111112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + SAFARICOM_INVALID_254111112233, response.getMessage());
    }

    @Test
    void test_safaricom_invalid_msisdn_0111() {
        var response = this.validationRequest(SAFARICOM_INVALID_0111112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + SAFARICOM_INVALID_0111112233, response.getMessage());
    }

    @Test
    void test_safaricom_invalid_msisdn_111() {
        var response = this.validationRequest(SAFARICOM_INVALID_111112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + SAFARICOM_INVALID_111112233, response.getMessage());
    }

}
