package com.cybertek.tests.day09_explict_wait_singleton_properties;

import com.cybertek.utility.Driver;
import org.junit.jupiter.api.Test;

public class SingletonPractice {

    @Test
    public void testOutDriverUtilityClass() {

        Driver.getDriver();
//        Driver.getDriver();
//        Driver.getDriver();
//        Driver.getDriver();


    }

    @Test
    public void testSingleton(){


//        Singleton s1 = new Singleton();
//        s1.word = "abc" ;
//
//        Singleton s2 = new Singleton();
//        s2.word = "efg" ;

        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
        /**
         * This is the output we got
         * Object has not been created yet, creating one now
         * You already have object , use that existing object
         * You already have object , use that existing object
         * You already have object , use that existing object
         * You already have object , use that existing object
         */



    }

}




