package com.webtribe.msisdn_validator;

import com.webtribe.msisdn_validator.utils.PhoneValidationResponse;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
import org.junit.jupiter.api.BeforeAll;

import javax.inject.Inject;

/**
 * Created on : 03 Nov,2020.
 * .
 *
 * @author eli
 */
public class BaseTest {

    @Inject
    @Client("/")
    RxHttpClient client;

    @BeforeAll
    public static void setUp() {
        Application.startApplication();
    }

    public static final String URL = "/api/v1/webtribe/validation-service?msisdn=";

    // ============= SAFARICOM  ===============
    public static final int SAFARICOM_ID = 1;
    public static final String SAFARICOM_NAME = "SAFARICOM";


    // ============= VALID NUMBERS ===============

    // ======================== 0700 prefix =======================
    public static final String SAFARICOM_VALID_254700112233 = "254700112233";
    public static final String SAFARICOM_VALID_0700112233 = "0700112233";
    public static final String SAFARICOM_VALID_700112233 = "700112233";

    // ======================== 0110 prefix =======================
    public static final String SAFARICOM_VALID_254110112233 = "254110112233";
    public static final String SAFARICOM_VALID_0110112233 = "0110112233";
    public static final String SAFARICOM_VALID_110112233 = "110112233";

    // ======================== 0111 prefix =======================
    public static final String SAFARICOM_VALID_254111112233 = "254111112233";
    public static final String SAFARICOM_VALID_0111112233 = "0111112233";
    public static final String SAFARICOM_VALID_111112233 = "111112233";

    // ============= IN-VALID NUMBERS ===============

    // ======================== 0700 prefix =======================
    public static final String SAFARICOM_INVALID_254700112233 = "2547001122333";
    public static final String SAFARICOM_INVALID_0700112233 = "07001122333";
    public static final String SAFARICOM_INVALID_700112233 = "7001122333";

    // ======================== 0110 prefix =======================
    public static final String SAFARICOM_INVALID_254110112233 = "2541101122333";
    public static final String SAFARICOM_INVALID_0110112233 = "01101122333";
    public static final String SAFARICOM_INVALID_110112233 = "1101122333";

    // ======================== 0111 prefix =======================
    public static final String SAFARICOM_INVALID_254111112233 = "2541111122333";
    public static final String SAFARICOM_INVALID_0111112233 = "01111122333";
    public static final String SAFARICOM_INVALID_111112233 = "1111122333";


    /**
     * HTTP call to the validation endpoint.
     *
     * @param msisdn
     * @return
     */
    public PhoneValidationResponse validationRequest(String msisdn) {
        PhoneValidationResponse result = new PhoneValidationResponse();
        try {
            result = client
                    .toBlocking()
                    .retrieve(HttpRequest.GET(URL + msisdn), PhoneValidationResponse.class);
        } catch (
                HttpClientResponseException ex) {
            result.setCode(400);
            result.setMessage(ex.getMessage());


        }

        return result;
    }

}
