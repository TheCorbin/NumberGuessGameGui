/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynumberguessgame;

/**
 *
 * @author ryancorbin
 */
public class MyNumberGuessProgram {
    private int correctValue = 2;
    
    
    public NumberGuessResult checkGuess3(String guess) throws IllegalArgumentException {
        
        int intGuess = 0;
        
        try {
            intGuess = Integer.valueOf(guess.trim());
        } catch(NumberFormatException nfe) {
            throw new IllegalArgumentException("Only whole numbers allowed as input", nfe);
        }
        
        if(intGuess < 1 || intGuess > 10) {
            throw new IllegalArgumentException("Only Numbers from 1 to 10 allowed");
        }
        
        NumberGuessResult result = NumberGuessResult.CORRECT;
        
        if(intGuess > correctValue) {
            result = NumberGuessResult.HIGH;
        } else if(intGuess < correctValue) {
            result = NumberGuessResult.LOW;
        }
        
        return result;
    }
    
    
    
    
}
