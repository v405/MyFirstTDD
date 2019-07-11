package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;

import java.util.ArrayList;
import java.util.Date;


public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void addTest(){

        String givenName = "Zula";
        Date givenBirthdate = new Date();
        Integer givenId = 0;

        Dog testDog = new Dog(givenName, givenBirthdate, givenId);

        ArrayList<Dog> DogHouse = new ArrayList<>();

        DogHouse.add(testDog);

        Assert.assertTrue(DogHouse.contains(testDog));
    }

    @Test
    public void removeTest(){
        Dog animal = AnimalFactory.createDog("Zula",new Date()); //Creating cat object "animal"

        DogHouse.clear(); //empties list so list = 0 at the start
        DogHouse.add(animal); //CatHouse list +1
        DogHouse.remove(animal);
        Integer expected = 0; //should be zero
        Integer actual = DogHouse.getNumberOfDogs(); //actual should equal 0

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatByIdTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();

        Dog animal = AnimalFactory.createDog("Zula", new Date());
        DogHouse.add(animal);
        Dog animal2 = AnimalFactory.createDog("Zul", new Date());
        DogHouse.add(animal2);

        DogHouse.remove(1);
        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogbyIdTest(){
        String givenName = "Zula";
        Date givenBirthdate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthdate, givenId);
        DogHouse.add(dog);

        String expected = "Zula";
        String actual = DogHouse.getDogById(0).getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNumberOfDogs() {
        String name = "Milo";
        Date birthDate = new Date();

        Dog animal = AnimalFactory.createDog(name, birthDate);

        DogHouse.clear();
        DogHouse.add(animal);
        DogHouse.getNumberOfDogs();

    }
}
