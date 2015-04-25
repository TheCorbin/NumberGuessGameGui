package validation;

import javax.swing.JTextField;

/**
 * This class represents a custom JTextField and Validateable implementation 
 * providing a Strategy component (Validator) to perform various 
 * validation functions. Although this high-level class is based on a 
 * JTextField, any high-level class that implements Validateable and 
 * uses a Validator strategy component will work.
 * 
 * @author ryanCorbin
 */
public class JTextFieldValidateable extends JTextField implements Validateable {
	private Validator validator;
	private String errorMsg;
	
	public JTextFieldValidateable(int cols) {
		super(cols);
	}

        public JTextFieldValidateable(Validator validator) {
            setValidator(validator);
        }
        
        @Override
        public void setErrorMsg(String errorMsg) throws IllegalArgumentException{
            if(errorMsg == null || errorMsg.length() == 0){
                throw new IllegalArgumentException();
            }
            this.errorMsg = errorMsg;
        }

        @Override
        public void setValidator(Validator validator)throws IllegalArgumentException {
            if(validator == null){
                throw new IllegalArgumentException();
            }
            this.validator = validator;
        }
        
	
	public Validator getValidator() {
		return validator;
	}

	/**
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}
        
        public boolean isFieldValid() throws NumberFormatException{
            String text = getText();
            validator.setTestValue(text);
            boolean results = validator.isValid(); 
            return results;
        }

	
	
}
