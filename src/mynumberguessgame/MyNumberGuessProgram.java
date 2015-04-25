/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynumberguessgame;

import java.util.Random;

/**
 *
 * @author ryancorbin
 */
public class MyNumberGuessProgram {
    private int randomNum;
    private Random random;
    private Integer min;
    private Integer max;

    public MyNumberGuessProgram(String min, String max) {
        random = new Random();
        this.min = Integer.parseInt(min);
        this.max = Integer.parseInt(max);
        setNumber();
    }
    
    public void setNumber(){
        randomNum = random.nextInt(max-min)+1+min;
    }
    
    /**
     * DESCRIPTION: 
     * @param guess
     * @return xxxx
     * @throws IllegalArgumentException xxx
     * 
     */
    
    public NumberGuessResult checkGuess3(String guess) throws IllegalArgumentException {
        int guessTry = Integer.parseInt(guess);
        
        if(guessTry == randomNum){
            return NumberGuessResult.CORRECT;
        } else if(guessTry > randomNum) {
            return NumberGuessResult.HIGH;
        } else {
            return NumberGuessResult.LOW;
        }
    }
    
    
    
    
}
