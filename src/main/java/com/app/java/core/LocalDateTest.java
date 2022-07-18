package com.app.java.core;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Predicate;

public class LocalDateTest {

    public static void main(String... s){
        // Parses the first date
        LocalDate dt1 = LocalDate.parse("2018-11-27");
        // Parses the second date
        LocalDate dt2 = LocalDate.parse("2017-11-27");

        // Checks
        //System.out.println(dt1.isBefore(dt2)); // aane wale date check future date h kya
        //System.out.println(dt1.isAfter(dt2));//Piche nikal chki date past date check

        Function<Integer, Integer> function = i->i*i;
        //System.out.println(function.apply(5));

        Predicate<Integer> predicate = i->i%2==0;
        System.out.println(predicate.test(10));



    }
}
