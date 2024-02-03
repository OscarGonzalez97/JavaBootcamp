package com.roshka.bootcamp;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;


public class BalanceadorParentesisTest {

    @Test
    public void testCadenasBalanceadas() {
        assertTrue(BalanceadorParentesis.isBalanced("{}"));
        assertTrue(BalanceadorParentesis.isBalanced("()"));
        assertTrue(BalanceadorParentesis.isBalanced("[]"));
        assertTrue(BalanceadorParentesis.isBalanced("{()}"));
        assertTrue(BalanceadorParentesis.isBalanced("({[]})"));
        assertTrue(BalanceadorParentesis.isBalanced("{{[()]}}"));
        assertTrue(BalanceadorParentesis.isBalanced("({[()]()})"));
    }

    @Test
    public void testCadenasNoBalanceadas() {
        assertFalse(BalanceadorParentesis.isBalanced("{"));
        assertFalse(BalanceadorParentesis.isBalanced("}"));
        assertFalse(BalanceadorParentesis.isBalanced("()[]{}{"));
        assertFalse(BalanceadorParentesis.isBalanced("({[()]})}"));
        assertFalse(BalanceadorParentesis.isBalanced("({[()]()})}"));
        assertFalse(BalanceadorParentesis.isBalanced("({[()]()})]"));
    }
}
