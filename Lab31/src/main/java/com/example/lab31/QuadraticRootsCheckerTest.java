package com.example.lab31;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

public class QuadraticRootsCheckerTest {

    private final QuadraticRootsChecker checker = new QuadraticRootsChecker();


    // Тест рівняння, яке має два різних дійсних корені 1
        @Test
        public void testHasTwoDistinctRealRoots() {
            //(a=1, b=-3, c=2)
            assertEquals(1, checker.checkRoots(1, -2, 2), "Рівняння повинно мати два різних дійсних корені.");
        }

    // Тест рівняння, яке не має двох різних коренів 0
        @Test
        public void testDoesNotHaveTwoDistinctRealRoots() {
            //(a=1, b=-2, c=2)
            assertEquals(0, checker.checkRoots(1, -3, 2), "Рівняння не повинно мати два різних дійсних корені.");
    }
}

