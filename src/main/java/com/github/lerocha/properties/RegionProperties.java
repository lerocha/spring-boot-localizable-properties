package com.github.lerocha.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by lerocha on 10/8/16.
 */
@Component
@ConfigurationProperties(prefix = "region")
public class RegionProperties {

    private Locale locale;
    private String hostSuffix;
    private String currencyCode;
    private String patternShortDate;

    private Map<Locale, RegionProperties> locales = new HashMap<>();

    public RegionProperties fromLocale(Locale locale) {
        return this.locales.containsKey(locale) ? this.locales.get(locale) : this;
    }

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

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Map<Locale, RegionProperties> getLocales() {
        return locales;
    }

    public void setLocales(Map<Locale, RegionProperties> locale) {
        this.locales = locale;
    }
}
