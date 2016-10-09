package com.github.lerocha.converter;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by lerocha on 10/8/16.
 */
@Component
@ConfigurationPropertiesBinding
public class LocaleConverter implements Converter<String, Locale> {

    private static final Map<String, Locale> LOCALE_MAP = new HashMap<>(Locale.getAvailableLocales().length);

    static {
        for (Locale locale : Locale.getAvailableLocales()) {
            LOCALE_MAP.put(locale.toString(), locale);
        }
    }

    @Override
    public Locale convert(String s) {
        return LOCALE_MAP.get(s);
    }
}
