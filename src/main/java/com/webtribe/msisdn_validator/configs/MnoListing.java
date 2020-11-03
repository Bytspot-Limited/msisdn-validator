package com.webtribe.msisdn_validator.configs;

/**
 * Created on : 03 Nov,2020.
 * .
 *
 * @author eli
 */

import io.micronaut.context.annotation.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties("operators")
public class MnoListing {
    private List<Mno> mnos;

    public List<Mno> getMnos() {
        return mnos;
    }

    public void setMnos(List<Mno> mnos) {
        this.mnos = mnos;
    }
}
