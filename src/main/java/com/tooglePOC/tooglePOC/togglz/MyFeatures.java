package com.tooglePOC.tooglePOC.togglz;

import org.togglz.core.Feature;
import org.togglz.core.activation.SystemPropertyActivationStrategy;
import org.togglz.core.annotation.ActivationParameter;
import org.togglz.core.annotation.DefaultActivationStrategy;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum MyFeatures implements Feature {


    @Label("Feature one")
    @DefaultActivationStrategy(id = SystemPropertyActivationStrategy.ID,
            parameters = {
                    @ActivationParameter(
                            name = SystemPropertyActivationStrategy.PARAM_PROPERTY_NAME,
                            value = "feature.one"),
                    @ActivationParameter(
                            name = SystemPropertyActivationStrategy.PARAM_PROPERTY_VALUE,
                            value = "false") })
    FEATURE_ONE,



    @Label("Feature two")
    @DefaultActivationStrategy(id = SystemPropertyActivationStrategy.ID,
            parameters = {
                    @ActivationParameter(
                            name = SystemPropertyActivationStrategy.PARAM_PROPERTY_NAME,
                            value = "feature.two"),
                    @ActivationParameter(
                            name = SystemPropertyActivationStrategy.PARAM_PROPERTY_VALUE,
                            value = "false") })
    FEATURE_TWO;


    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }

}
