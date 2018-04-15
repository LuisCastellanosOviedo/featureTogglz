package com.tooglePOC.tooglePOC.togglz;

import org.springframework.context.annotation.Bean;
import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;
import org.togglz.core.manager.EnumBasedFeatureProvider;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.mem.InMemoryStateRepository;
import org.togglz.core.spi.FeatureProvider;
import org.togglz.core.user.NoOpUserProvider;
import org.togglz.core.user.UserProvider;

public enum MyFeartures implements Feature {


    @Label("First Feature")
    FEATURE_ONE,

    @Label("Second Feature")
    FEATURE_TWO;


    @Bean
    public StateRepository getStateRepository() {
        return new InMemoryStateRepository();
    }

    @Bean
    public FeatureProvider featureProvider() {
        return new EnumBasedFeatureProvider(MyFeartures.class);
    }

    @Bean
    public UserProvider getUserProvider() {
        return new NoOpUserProvider();
    }

}
