package ru.savinova.java.basic.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.savinova.java.basic.homework.homework22.ActionsWithArrays;

public class ActionsWithArraysTests {
    private ActionsWithArrays actions;

    @BeforeEach
    public void prepare() {
        actions = new ActionsWithArrays();
    }

    @Test
    public void getAllAfterLastOneTest() {
        Assertions.assertAll(
                () -> {
                    Assertions.assertArrayEquals(new int[]{4, 5}, actions.getAllAfterLastOne(new int[]{1, 2, 1, 4, 5}));
                },
                () -> {
                    Assertions.assertArrayEquals(new int[]{2, 3, 4, 5}, actions.getAllAfterLastOne(new int[]{1, 2, 3, 4, 5}));
                },
                () -> {
                    Assertions.assertArrayEquals(null, actions.getAllAfterLastOne(new int[]{2, 3, 4, 1}));
                }
        );
    }

    @Test
    public void noDigitOneInArrayTest() {
        Assertions.assertThrowsExactly(RuntimeException.class, () -> {
            actions.getAllAfterLastOne(new int[]{2, 4, 5});
        });
    }

    @Test
    public void containsOnlyOneAndTwoTest() {
        Assertions.assertTrue(actions.containsOnlyOneAndTwo(new int[]{1, 2, 1, 2}));
    }

    @Test
    public void containsNotOnlyOneAndTwoTest() {
        Assertions.assertAll(
                () -> {
                    Assertions.assertFalse(actions.containsOnlyOneAndTwo(new int[]{1, 2, 1, 2, 0}));
                },
                () -> {
                    Assertions.assertFalse(actions.containsOnlyOneAndTwo(new int[]{4, 6, 0}));
                },
                () -> {
                    Assertions.assertFalse(actions.containsOnlyOneAndTwo(new int[]{1, 1}));
                },
                () -> {
                    Assertions.assertFalse(actions.containsOnlyOneAndTwo(new int[]{2}));
                }
        );
    }
}