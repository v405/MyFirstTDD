package hbcu.stay.ready;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Mammal;
import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;

import java.util.Date;


public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog= new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest(){
        String givenName = "Zula";
        Date givenBirthdate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthdate, givenId);

        dog.setName("Wutang");

        String expected = "Wutang";
        String actual = dog.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dogSpeakTest(){
        //given cat data
        String givenName = "x";
        Date givenBirthdate = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(givenName, givenBirthdate, givenId);

        String expected = "bark!";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthdateTest(){
        //necessary variables for functions
        String givenName = "y";
        Date givenBirthdate = new Date();
        Integer givenId = 0;

        //creating cat object
        Dog dog = new Dog(givenName, givenBirthdate, givenId);

        Date valBD = new Date(); //createADate(dateInString);

        //comparing to see if test runs correctly
        String expectedBirthdate = valBD.toString();
        String actualBirthdate = dog.getBirthDate().toString();

        Assert.assertEquals(actualBirthdate, expectedBirthdate);
    }
//need to do
    @Test
    public void eatTest(){
        String givenName = "x";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Integer mealsEaten = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        dog.eat(new Food());
        Integer expected = 1;
        Assert.assertEquals(expected, dog.getNumberOfMealsEaten());
        }

    @Test
    public void getIdTest(){
        String givenName = "y";
        Date givenBirthdate = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(givenName, givenBirthdate, givenId);

        Integer retrievedId = dog.getId();

        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void checkAnimalInheritanceTest(){
        String givenName = "y";
        Date givenBirthdate = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(givenName, givenBirthdate, givenId);
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void checkMammalInheritanceTest(){
        String givenName = "y";
        Date givenBirthdate = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(givenName, givenBirthdate, givenId);
        Assert.assertTrue(dog instanceof Mammal);
    }
}
