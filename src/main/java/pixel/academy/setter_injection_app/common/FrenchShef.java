package pixel.academy.setter_injection_app.common;

import org.springframework.stereotype.Component;

@Component
public class FrenchShef implements Chef{


    @Override
    public String getDailyRecipe() {
        return "Preparez un beouf bourguignon avec vin rouge et herbes";
    }
}
