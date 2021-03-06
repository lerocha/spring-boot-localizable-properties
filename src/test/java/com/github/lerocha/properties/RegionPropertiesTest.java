package com.github.lerocha.properties;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Locale;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegionPropertiesTest {

    @Autowired
    private RegionProperties regionProperties;

    @Test
    public void fromLocaleShouldReturnDefaultLocaleWhenLocaleNotFound() {
        Assert.assertNotNull(regionProperties);
        Assert.assertEquals(regionProperties.fromLocale(Locale.ITALY), regionProperties);
    }

    @Test
    public void fromLocaleShouldReturntLocaleWhenLocaleIsFound() {
        Assert.assertNotNull(regionProperties);
        Assert.assertEquals(regionProperties.fromLocale(Locale.US).getHostSuffix(), ".com");
        Assert.assertEquals(regionProperties.fromLocale(Locale.CANADA).getHostSuffix(), ".ca");
        Assert.assertEquals(regionProperties.fromLocale(Locale.UK).getHostSuffix(), ".co.uk");
    }
}
