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
        Assertions.assertArrayEquals(new int[]{4, 5}, actions.getAllAfterLastOne(new int[]{1, 2, 1, 4, 5}));
    }

    @Test
    public void noDigitOneInArray() {
        Assertions.assertThrowsExactly(RuntimeException.class, () -> {
            actions.getAllAfterLastOne(new int[]{2, 4, 5});
        });
    }
}