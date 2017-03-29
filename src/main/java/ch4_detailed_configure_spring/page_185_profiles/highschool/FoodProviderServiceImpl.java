package ch4_detailed_configure_spring.page_185_profiles.highschool;

import ch4_detailed_configure_spring.page_185_profiles.Food;
import ch4_detailed_configure_spring.page_185_profiles.FoodProviderService;

import java.util.ArrayList;
import java.util.List;

public class FoodProviderServiceImpl implements FoodProviderService
{
    @Override
    public List<Food> provideLunchSet() {
        List<Food> lunchSet = new ArrayList<Food>();
        lunchSet.add(new Food("Coke"));
        lunchSet.add(new Food("Hamburger"));
        lunchSet.add(new Food("French Fries"));

        return lunchSet;
    }
}
