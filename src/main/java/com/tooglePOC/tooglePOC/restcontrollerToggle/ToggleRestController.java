package com.tooglePOC.tooglePOC.restcontrollerToggle;


import com.tooglePOC.tooglePOC.togglz.Aspect.FeatureAssociation;
import com.tooglePOC.tooglePOC.togglz.MyFeatures;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.manager.FeatureManager;

@RestController
public class ToggleRestController {




    private FeatureManager manager ;

    public ToggleRestController(FeatureManager manager) {
        this.manager = manager;
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloWord(){
        String text ="";

            featureOne(text);
            text+=featureTwo(text);

        return text;
    }


    @FeatureAssociation(value = MyFeatures.FEATURE_ONE)
    public String featureOne(String text){
        return text+="paso por 1";
    }

    @FeatureAssociation(value = MyFeatures.FEATURE_TWO)
    public String featureTwo(String text){
        return text+="paso por 2";
    }



}
