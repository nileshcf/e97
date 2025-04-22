package com.cloudframe.app.search2.dto;

/**
*  The class CodeCtrl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/


import com.cloudframe.app.search2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CodeCtrl extends CodeCtrlSerialized { 
   

								private long codeValue;

								private int codeToggle;

								private long codeMarker;
	
	/**
	* Constructor for CodeCtrl
	**/
    public CodeCtrl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CodeCtrl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CodeCtrl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of codeValue
	 *	@return codeValue
	 */
	public long getCodeValue() throws CFException {
        if (isCodeValueModified()) { 
           codeValue = refreshCodeValue();
        }
   		return codeValue;
	}
	
	/**
	 * 	Update CodeValue with the passed value
	 *  Corresponding COBOL Variable is WS-CODE-VALUE
	 *	@param number
	 */
	public void setCodeValue(long number) {
	     // Truncate if the number is beyond +/- Max range
	    codeValue = checkCodeValueMaxLimit(number); 
		serializeCodeValue(codeValue);
	}


	/**
	 *	Returns the value of codeToggle
	 *	@return codeToggle
	 */
	public int getCodeToggle() throws CFException {
        if (isCodeToggleModified()) { 
           codeToggle = refreshCodeToggle();
        }
   		return codeToggle;
	}
	
	/**
	 * 	Update CodeToggle with the passed value
	 *  Corresponding COBOL Variable is WS-CODE-TOGGLE
	 *	@param number
	 */
	public void setCodeToggle(int number) {
	     // Truncate if the number is beyond +/- Max range
	    codeToggle = checkCodeToggleMaxLimit(number); 
		serializeCodeToggle(codeToggle);
	}


	public void setCodeToggle(long number) {
	    number = checkCodeToggleMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCodeToggle((int)number);
	}
	
	/**
	 *	Returns the value of codeMarker
	 *	@return codeMarker
	 */
	public long getCodeMarker() throws CFException {
       if (isCodeMarkerModified()) { 
           codeMarker = refreshCodeMarker();
        }
   		return codeMarker;
	}
	

	
	   
	/**
	 * 	Update CodeMarker with the passed value
	 *  Corresponding COBOL Variable is WS-CODE-MARKER
	 *	@param number
	 */
	public void setCodeMarker(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    codeMarker = checkCodeMarkerMaxLimit(number); 
		serializeCodeMarker(codeMarker);
	}
	

	/**
	 * 	Update CodeMarker with the passed value
	 *	@param value (String or char[])
	 */
	public void setCodeMarker(char[] value) throws CFException {
		 codeMarker = serializeCodeMarker(value);
	}
	/**
	 * 	Update CodeMarker with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCodeMarkerString(char[] value) throws CFException {
		 setCodeMarker(value);
	}

	
	
	

		public static int getCodeCtrlFieldLength() {
			return CODE_CTRL_LENGTH;
		}

}
  
