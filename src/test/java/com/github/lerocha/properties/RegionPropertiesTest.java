package com.github.lerocha.properties;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegionPropertiesTest {

    @Autowired
    private RegionProperties regionProperties;

    @Test
    public void contextLoads() {
        Assert.assertNotNull(regionProperties);
    }

}
