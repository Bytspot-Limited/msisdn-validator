package com.webtribe.msisdn_validator.services;

import com.webtribe.msisdn_validator.configs.Mno;
import com.webtribe.msisdn_validator.configs.MnoListing;
import com.webtribe.msisdn_validator.utils.PhoneValidationResponse;
import io.micronaut.http.HttpStatus;
import org.w3c.dom.ranges.Range;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class contains all the pattern-matching functionality  for different providers.
 * Created on : 02 Nov,2020.
 *
 * @author eli
 */
@Singleton
public class MatcherService {
    @Inject
    MnoListing mnoListing;

    /**
     * Function matches the phone number againist the loaded prefixes from the . properties file.
     *
     * @param number
     * @return
     */
    public PhoneValidationResponse match(String number) {
        PhoneValidationResponse response = new PhoneValidationResponse();
        response.setCode(HttpStatus.NOT_FOUND.getCode());
        for (Mno mno : mnoListing.getMnos()) {
            boolean breakk = false;

            for (String prefix : mno.getPrefixes()) {
                var match = this.isWithinRange(number, prefix);

                if (match) {
                    // Match is found
                    System.out.println("Match found: [" + prefix + " -> " + number + "]");
                    response.setId(mno.getCode());
                    response.setProviderName(mno.getName());
                    response.setCode(HttpStatus.ACCEPTED.getCode());
                    breakk = true;
                    break;
                }

            }
            if (breakk) {
                break;
            }
        }
        if (response.getCode() == HttpStatus.NOT_FOUND.getCode()) {
            response.setMessage("Phone number provider could not be found: " + number);
        }
        return response;
    }

    /**
     * check if number falls within the range.
     *
     * @param msisdn
     * @param prefix
     * @return
     */
    private boolean isWithinRange(String msisdn, String prefix) {
        var range = calculateRange(prefix);

        var substringToNumber = Long.valueOf(msisdn.substring(0, 3));
        var start = Long.valueOf(range[0]);
        var end = Long.valueOf(range[1]);

        if (substringToNumber >= start && substringToNumber <= end) {
            return true;
        }
        return false;
    }


    private String[] calculateRange(String range) {
        var response = range.split("-");
        return response;

    }
}
