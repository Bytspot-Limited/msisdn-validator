package com.webtribe.msisdn_validator;

import com.webtribe.msisdn_validator.utils.PhoneValidationResponse;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.BeforeAll;

import javax.inject.Inject;

/**
 * Created on : 03 Nov,2020.
 * .
 *
 * @author eli
 */
@MicronautTest
public class BaseTest {

    @Inject
    @Client("/")
    RxHttpClient client;

    @BeforeAll
    public static void setUp() {
        Application.startApplication();
    }

    public static final String URL = "/api/v1/webtribe/validation-service?msisdn=";

    /**
     * ============= SAFARICOM  ===============
     */
    public static final int SAFARICOM_ID = 1;
    public static final String SAFARICOM_NAME = "SAFARICOM";


    // ============= VALID NUMBERS ===============

    // ======================== 0700 prefix =======================
    public static final String SAFARICOM_VALID_254700112233 = "254700112233";
    public static final String SAFARICOM_VALID_0700112233 = "0700112233";
    public static final String SAFARICOM_VALID_700112233 = "700112233";

    // ======================== 0712 prefix =======================
    public static final String SAFARICOM_VALID_254712112233 = "254712112233";
    public static final String SAFARICOM_VALID_0712112233 = "0712112233";
    public static final String SAFARICOM_VALID_712112233 = "712112233";

    // ======================== 0744 prefix =======================
    public static final String SAFARICOM_VALID_254744144233 = "254744144233";
    public static final String SAFARICOM_VALID_0744144233 = "0744144233";
    public static final String SAFARICOM_VALID_744144233 = "744144233";

    // ======================== 0758 prefix =======================
    public static final String SAFARICOM_VALID_254758112233 = "254758112233";
    public static final String SAFARICOM_VALID_0758112233 = "0758112233";
    public static final String SAFARICOM_VALID_758112233 = "758112233";

    // ======================== 0769 prefix =======================
    public static final String SAFARICOM_VALID_254769112233 = "254769112233";
    public static final String SAFARICOM_VALID_0769112233 = "0769112233";
    public static final String SAFARICOM_VALID_769112233 = "769112233";

    // ======================== 0791 prefix =======================
    public static final String SAFARICOM_VALID_254791112233 = "254791112233";
    public static final String SAFARICOM_VALID_0791112233 = "0791112233";
    public static final String SAFARICOM_VALID_791112233 = "791112233";

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
     * ============= AIRTEL  ===============
     */
    public static final int AIRTEL_ID = 2;
    public static final String AIRTEL_NAME = "AIRTEL";


    // ============= VALID NUMBERS ===============

    // ======================== 0731 prefix =======================
    public static final String AIRTEL_VALID_254731112233 = "254731112233";
    public static final String AIRTEL_VALID_0731112233 = "0731112233";
    public static final String AIRTEL_VALID_731112233 = "731112233";


    // ======================== 0751 prefix =======================
    public static final String AIRTEL_VALID_254751112233 = "254751112233";
    public static final String AIRTEL_VALID_0751112233 = "0751112233";
    public static final String AIRTEL_VALID_751112233 = "751112233";


    // ======================== 0786 prefix =======================
    public static final String AIRTEL_VALID_254786112233 = "254786112233";
    public static final String AIRTEL_VALID_0786112233 = "0786112233";
    public static final String AIRTEL_VALID_786112233 = "786112233";


    // ======================== 0101 prefix =======================
    public static final String AIRTEL_VALID_254101112233 = "254101112233";
    public static final String AIRTEL_VALID_0101112233 = "0101112233";
    public static final String AIRTEL_VALID_101112233 = "101112233";


    // ============= INVALID NUMBERS ===============

    // ======================== 0731 prefix =======================
    public static final String AIRTEL_INVALID_254731112233 = "2547311122334";
    public static final String AIRTEL_INVALID_0731112233 = "073111223";
    public static final String AIRTEL_INVALID_731112233 = "73111223";

    /**
     * ============= TELKOM  ===============
     */
    public static final int TELKOM_ID = 3;
    public static final String TELKOM_NAME = "TELKOM";


    // ============= VALID NUMBERS ===============

    // ======================== 0771 prefix =======================
    public static final String TELKOM_VALID_254771112233 = "254771112233";
    public static final String TELKOM_VALID_0771112233 = "0771112233";
    public static final String TELKOM_VALID_771112233 = "771112233";

    // ============= INVALID NUMBERS ===============

    // ======================== 0771 prefix =======================
    public static final String TELKOM_INVALID_254771112233 = "2547711122333";
    public static final String TELKOM_INVALID_0771112233 = "077111223";
    public static final String TELKOM_INVALID_771112233 = "77111223399";


    /**
     * ============= FAIBA  ===============
     */
    public static final int FAIBA_ID = 4;
    public static final String FAIBA_NAME = "FAIBA";


    // ============= VALID NUMBERS ===============

    // ======================== 0747 prefix =======================
    public static final String FAIBA_VALID_254747112233 = "254747112233";
    public static final String FAIBA_VALID_0747112233 = "0747112233";
    public static final String FAIBA_VALID_747112233 = "747112233";

    // ============= INVALID NUMBERS ===============

    // ======================== 0747 prefix =======================
    public static final String FAIBA_INVALID_254747112233 = "2547471122333";
    public static final String FAIBA_INVALID_0747112233 = "074711223";
    public static final String FAIBA_INVALID_747112233 = "74711223399";

    /**
     * ============= EQUITEL  ===============
     */
    public static final int EQUITEL_ID = 5;
    public static final String EQUITEL_NAME = "EQUITEL";


    // ============= VALID NUMBERS ===============

    // ======================== 0764 prefix =======================
    public static final String EQUITEL_VALID_254764112233 = "254764112233";
    public static final String EQUITEL_VALID_0764112233 = "0764112233";
    public static final String EQUITEL_VALID_764112233 = "764112233";

    // ============= INVALID NUMBERS ===============

    // ======================== 0764 prefix =======================
    public static final String EQUITEL_INVALID_254764112233 = "2547641122333";
    public static final String EQUITEL_INVALID_0764112233 = "076411223";
    public static final String EQUITEL_INVALID_764112233 = "76411223399";


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
