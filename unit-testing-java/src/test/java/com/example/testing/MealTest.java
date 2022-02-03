package com.example.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MealTest {

    @Test
    void shouldReturnDiscountedPrice() {
        //given
        Meal meal = new Meal(40);

        //when
        int discountedPrice = meal.getDiscountedPrice(7);

        //then
        assertEquals(33, discountedPrice);
    }

    @Test
    void referencesToTheSameObjectShouldBeEqual() {
        //given
        Meal meal1 = new Meal(10);
        Meal meal2 = meal1;

        //then
        assertSame(meal1, meal2);
    }

    @Test
    void referencesToDifferentObjectShouldNotBeEqual() {
        //given
        Meal meal1 = new Meal(10);
        Meal meal2 = new Meal(20);

        //then
        assertNotSame(meal1, meal2);
    }

    @Test
    void twoMealsShouldBeEqualWhenPriceAndMealAreTheSame() {

        //given
        Meal meal1 = new Meal(10, "Pizza");
        Meal meal2 = new Meal(10, "Pizza");

        //then
        assertEquals(meal1, meal2, "Checking if two meals are equal");
    }
}