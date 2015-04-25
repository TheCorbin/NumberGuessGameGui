package validation;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 * This class is a <code>Validator</code> component used to test the value of 
 * a field against a specified range of values (inclusive).
 * 
 * @author ryancorbin
 */
public class NumericRangeValidator implements Validator {
    /** Type safe options */
    

    private static final String NULL_EMPTY_STR_MSG =
            "String parameters cannot be null or zero length";
    private int minimumValue;
    private int maxValue;
    private int testValue;

    /** Default constructor */
    public NumericRangeValidator() {}

    /**
     * Convenience overload allows initializing all properties.
     * @param type - a type safe enumerated constant indicating the type of
     * values to test.
     * @param minimumValue - the current field value to test. If fieldValue
     * does not match the data type being tested, isValid() will be false.
     * @param maxValue - the current field value to test. If fieldValue
     * does not match the data type being tested, isValid() will be false.
     */
    public NumericRangeValidator(String minimumValue, String maxValue) {
        this.minimumValue = Integer.parseInt(minimumValue);
        this.maxValue = Integer.parseInt(maxValue);
    }

    /**
     * Use to store the current value of the field for testing.
     * @param value - the field value to be tested
     */
    public void setTestValue(String value) {
         try{
            testValue = Integer.parseInt(value);
        }catch(NumberFormatException nfe){
             throw nfe;
        }
    }

    /**
     * Tests whether the current field value is within a specified range (inclusive).
     * All comparisons are based on Java natural order specifications.
     * @return result of test
     */
    public boolean isValid() {
        if(testValue < minimumValue || testValue > maxValue){
            return false;
        }
        return true;
    }
}
