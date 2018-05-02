package com.tooglePOC.tooglePOC.togglz.toggleConf;


import com.tooglePOC.tooglePOC.togglz.MyFeatures;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.manager.EnumBasedFeatureProvider;
import org.togglz.core.spi.FeatureProvider;

@Configuration
public class ToggleConfiguration {


    @Bean
    public FeatureProvider featureProvider(){
        return new EnumBasedFeatureProvider(MyFeatures.class);
    }
}
