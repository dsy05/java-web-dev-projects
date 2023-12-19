package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void bracketsAroundLaunchCodeReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void bracketsAroundLaunchReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch]Code"));
    }
    @Test
    public void bracketsAroundCodeReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void onlyBracketsBeforeLaunchCodeReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void openBracketOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void closingBracketsOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void onlyOpenBracketBeforeLaunchCodeReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void closeBracketBeforeLaunchOpenBracketBeforeCodeReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launch[Code"));
    }
    @Test
    public void closeBracketAfterLaunchOpenBracketAfterCodeReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void closingBracketOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
}