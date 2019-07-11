package hbcu.stay.ready;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Mammal;
import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Cat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;


public class CatTest {
    // TODO - Create tests for `void setName(String name)`
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
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

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

        Cat cat = new Cat(givenName, givenBirthdate, givenId);

        cat.setName("Wutang");

        String expected = "Wutang";
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catspeakTest(){
        //given cat data
        String givenName = "x";
        Date givenBirthdate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthdate, givenId);

        String expected = "meow!";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthdateTest(){
        //necessary variables for functions
        String givenName = "y";
        Date givenBirthdate = new Date();
        Integer givenId = 0;

        //creating cat object
        Cat cat = new Cat(givenName, givenBirthdate, givenId);

        Date valBD = new Date(); //createADate(dateInString);

        //comparing to see if test runs correctly
        String expectedBirthdate = valBD.toString();
        String actualBirthdate = cat.getBirthDate().toString();

        Assert.assertEquals(actualBirthdate, expectedBirthdate);
    }

    @Test
    public void eatTest(){
        String givenName = "x";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Integer mealsEaten = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        cat.eat(new Food());
        Integer expected = 1;
        Assert.assertEquals(expected, cat.getNumberOfMealsEaten());
    }

    @Test
    public void getIdTest(){
        String givenName = "y";
        Date givenBirthdate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthdate, givenId);

        Integer retrievedId = cat.getId();

        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void checkAnimalInheritanceTest(){
        String givenName = "y";
        Date givenBirthdate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthdate, givenId);
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void checkMammalInheritanceTest(){
        String givenName = "y";
        Date givenBirthdate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthdate, givenId);
        Assert.assertTrue(cat instanceof Mammal);
    }

}