package validation;

/**
 * The general contract for all Validators.
 * 
 * @author ryancorbin
 */
public interface Validator {

	/** Test a form field for validity based on the <code>Validator</code> subtype. */
	public abstract boolean isValid();
	
	/** The value to test. */
	public void setTestValue(String value);
}
