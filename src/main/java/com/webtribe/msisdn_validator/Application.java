package com.webtribe.msisdn_validator;

import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        startApplication();
    }

    /**
     * Start application.
     */
    public static void startApplication() {
        Micronaut.run(Application.class);
    }

}
