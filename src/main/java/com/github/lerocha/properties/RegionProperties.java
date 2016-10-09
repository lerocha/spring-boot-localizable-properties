package com.github.lerocha.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by lerocha on 10/8/16.
 */
@Component
@ConfigurationProperties(prefix = "region")
public class RegionProperties extends LocaleProperties<RegionProperties> {
    private String hostSuffix;
    private String currencyCode;
    private String patternShortDate;

    public String getHostSuffix() {
        return hostSuffix;
    }

    public void setHostSuffix(String hostSuffix) {
        this.hostSuffix = hostSuffix;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getPatternShortDate() {
        return patternShortDate;
    }

    public void setPatternShortDate(String patternShortDate) {
        this.patternShortDate = patternShortDate;
    }
}
