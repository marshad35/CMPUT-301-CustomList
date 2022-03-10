package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @BeforeEach
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize =  list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(listSize + 1, list.getCount());
    }

    @Test
    public void hasCityTest(){
        City newCity = new City("vancouver", "bc");
        list.addCity(newCity);
        assertEquals(true,list.hasCity(newCity));
    }

    @Test
    public void deleteCityTest(){
        City city = new City("vancouver", "BC");
        list.addCity(city);

        list.deleteCity(city);

        assertEquals(0,list.getCount());


        assertThrows(IllegalArgumentException.class, () -> {

            list.deleteCity(city);

        });


    }





}
