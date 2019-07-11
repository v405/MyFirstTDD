package hbcu.stay.ready;


import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`    `
    //using other peoples code wil
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){
            String givenName = "Rover";
            Date givenBirthDate = new Date();
            Dog dog = AnimalFactory.createDog(givenName,givenBirthDate);

            String expected = "Rover";
            String actual = dog.getName();
            Assert.assertEquals(expected, actual);
        }


    @Test
    public void createCatTest(){
        String givenName = "Fluffy";
        Date givenBirthDate = new Date();
        Cat cat = AnimalFactory.createCat(givenName,givenBirthDate);

        String expected = "Fluffy";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }
    }