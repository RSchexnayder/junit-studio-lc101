package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    BalancedBrackets test_Class;
    @Before
    public void createCarObject() {
        BalancedBrackets test_Class = new BalancedBrackets();
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }
    @Test
    public void aBracketAroundAWordReturnsTrue(){
        assertTrue(test_Class.hasBalancedBrackets("[code]"));
    }
    @Test
    public void bracketsAroundOneOfTwoWordsReturnsTrue(){
        assertTrue(test_Class.hasBalancedBrackets("Launch[code]"));
    }
    @Test
    public void bracketsAfterWordReturnsTrue(){
        assertTrue(test_Class.hasBalancedBrackets("LaunchCode[]"));
    }
    @Test
    public void returnsTrueWithSpecialCharacters(){assertTrue(test_Class.hasBalancedBrackets("[@]"));}
    @Test
    public void aWordWithoutBracketsReturnsFalse() { assertFalse(test_Class.hasBalancedBrackets("launchcode")); }
    @Test
    public void returnsFalseWithOneClosingBracket(){assertFalse(test_Class.hasBalancedBrackets("]"));}
    @Test
    public void returnsFalseWithOneOpenBracket(){assertFalse(test_Class.hasBalancedBrackets("["));}
    @Test
    public void returnsFalseIfOpeningBracketComesAfterClosingBracket(){assertFalse(test_Class.hasBalancedBrackets("]["));}
    @Test
    public void returnsFalseIfPassedANumber(){assertFalse(test_Class.hasBalancedBrackets("1"));}
    @Test
    public void returnsTrueIfGivenMultipleSetsOfValidBrackets(){assertTrue(test_Class.hasBalancedBrackets("[][]"));}
    @Test
    public void returnsFalseIfGivenMultipleSetsOfBracketsWithOneExtraBracket(){assertFalse(test_Class.hasBalancedBrackets("[]["));}




}
