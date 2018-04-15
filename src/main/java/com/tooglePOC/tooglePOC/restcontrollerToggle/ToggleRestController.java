package com.tooglePOC.tooglePOC.restcontrollerToggle;


import com.tooglePOC.tooglePOC.togglz.MyFeartures;
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

        if(manager.isActive(MyFeartures.FEATURE_ONE)){
            text+="paso por 1";
        }
        if (manager.isActive(MyFeartures.FEATURE_TWO)){
            text+="paso por 2";
        }

        return text;
    }


}
