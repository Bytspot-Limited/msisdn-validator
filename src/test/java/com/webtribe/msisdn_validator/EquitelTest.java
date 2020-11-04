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
public class EquitelTest extends BaseTest {
    /**VALID NUMBERS*/

    /**
     * ===================================
     * 0764 PREFIX
     * ===================================
     */

    @Test
    void test_equitel_valid_msisdn_254764() {
        var response = this.validationRequest(EQUITEL_VALID_254764112233);
        Assertions.assertEquals(response.getId(), EQUITEL_ID);
        Assertions.assertEquals(response.getProviderName(), EQUITEL_NAME);

    }

    @Test
    void test_equitel_valid_msisdn_0764() {
        var response = this.validationRequest(EQUITEL_VALID_0764112233);
        Assertions.assertEquals(response.getId(), EQUITEL_ID);
        Assertions.assertEquals(response.getProviderName(), EQUITEL_NAME);
    }

    @Test
    void test_equitel_valid_msisdn_764() {
        var response = this.validationRequest(EQUITEL_VALID_764112233);
        Assertions.assertEquals(response.getId(), EQUITEL_ID);
        Assertions.assertEquals(response.getProviderName(), EQUITEL_NAME);
    }

    /**INVALID NUMBERS*/

    /**
     * ===================================
     * 0764 PREFIX
     * ===================================
     */

    @Test
    void test_equitel_invalid_msisdn_254764() {
        var response = this.validationRequest(EQUITEL_INVALID_254764112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + EQUITEL_INVALID_254764112233, response.getMessage());
    }


    @Test
    void test_equitel_invalid_msisdn_0764() {
        var response = this.validationRequest(EQUITEL_INVALID_0764112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + EQUITEL_INVALID_0764112233, response.getMessage());
    }

    @Test
    void test_equitel_invalid_msisdn_764() {
        var response = this.validationRequest(EQUITEL_INVALID_764112233);
        Assertions.assertEquals(400, response.getCode());
        Assertions.assertEquals(AppConstants.INVALID_MSISDN + EQUITEL_INVALID_764112233, response.getMessage());
    }

}
