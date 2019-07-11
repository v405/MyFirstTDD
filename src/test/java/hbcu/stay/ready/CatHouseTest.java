package hbcu.stay.ready;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import hbcu.stay.ready.animals.animal_storage.CatHouse;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addTest(){

        String givenName = "Zula";
        Date givenBirthdate = new Date();
        Integer givenId = 0;

        Cat testCat = new Cat(givenName, givenBirthdate, givenId);

        ArrayList<Cat> CatHouse = new ArrayList<>();

        CatHouse.add(testCat);

        Assert.assertTrue(CatHouse.contains(testCat));


        /*Cat animal = AnimalFactory.createCat("Zula",new Date()); //Creating cat object "animal"

        CatHouse.clear(); //empties list so list = 0 at the start
        CatHouse.add(animal); //CatHouse list +1
        Integer expected = 2; //should be one
        Integer actual = CatHouse.getNumberOfCats(); //actual should equal 1

        Assert.assertEquals(expected, actual);
        */
    }

    @Test
    public void removeTest(){
        Cat animal = AnimalFactory.createCat("Zula",new Date()); //Creating cat object "animal"

        CatHouse.clear(); //empties list so list = 0 at the start
        CatHouse.add(animal); //CatHouse list +1
        CatHouse.remove(animal);
        Integer expected = 0; //should be zero
        Integer actual = CatHouse.getNumberOfCats(); //actual should equal 0

        Assert.assertEquals(expected, actual);
    }

@Test
    public void removeCatByIdTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();

        Cat animal = AnimalFactory.createCat("Zula", new Date());
        CatHouse.add(animal);
        Cat animal2 = AnimalFactory.createCat("Zul", new Date());
        CatHouse.add(animal2);

        CatHouse.remove(1);
        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);

   }
@Test
    public void getCatbyIdTest(){
        String givenName = "Zula";
        Date givenBirthdate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthdate, givenId);
        CatHouse.add(cat);

        String expected = "Zula";
        String actual = CatHouse.getCatById(0).getName();

        Assert.assertEquals(expected, actual);

    }
 @Test
    public void getNumberOfCatsTest(){
        String givenName = "Zula";
        Date givenBirthdate = new Date();
        Integer givenId = 0;

        Cat Cat1 = new Cat(givenName, givenBirthdate, givenId);
        CatHouse.add(Cat1);
        Cat Cat2 = new Cat(givenName, givenBirthdate, givenId);
        CatHouse.add(Cat2);

        Integer expected = 2;
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);

    }

}
