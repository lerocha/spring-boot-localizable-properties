package com.github.lerocha.controller;

import com.github.lerocha.properties.RegionProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * Created by lerocha on 10/8/16.
 */
@RestController
public class PropertiesController {

    @Autowired
    RegionProperties regionProperties;

    @RequestMapping(value = "properties", method = RequestMethod.GET)
    public RegionProperties getProperties() {
        return regionProperties;
    }

    @RequestMapping(value = "properties/{locale}", method = RequestMethod.GET)
    public RegionProperties getProperties(@PathVariable Locale locale) {
        return regionProperties.fromLocale(locale);
    }
}
