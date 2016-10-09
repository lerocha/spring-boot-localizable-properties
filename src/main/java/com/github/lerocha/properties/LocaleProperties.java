package com.github.lerocha.properties;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by lerocha on 10/8/16.
 */
public class LocaleProperties<T extends LocaleProperties> {
    protected Locale locale;
    protected Map<Locale, T> locales = new HashMap<>();

    @PostConstruct
    private void postConstruct() {
        // Set the locale of each entry of the map.
        for (Map.Entry<Locale, T> entry : locales.entrySet()) {
            entry.getValue().setLocale(entry.getKey());
        }
    }

    public T fromLocale(Locale locale) {
        return locales.containsKey(locale) ? locales.get(locale) : (T) this;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Map<Locale, T> getLocales() {
        return locales;
    }

    public void setLocales(Map<Locale, T> locales) {
        this.locales = locales;
    }
}
