package com.webtribe.msisdn_validator.configs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Created on : 03 Nov,2020.
 * .
 *
 * @author eli
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mno {
    private String name;
    private int code;
    private List<String> prefixes;
}
