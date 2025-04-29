package com.cloudframe.app.ip200090.dto;

/**
*  The class EditNumR800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/


import com.cloudframe.app.ip200090.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EditNumR800 extends EditNumR800Serialized { 
   

								private int editValue800;
	
	/**
	* Constructor for EditNumR800
	**/
    public EditNumR800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for EditNumR800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EditNumR800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of editValue800
	 *	@return editValue800
	 */
	public int getEditValue800() throws CFException {
       if (isEditValue800Modified()) { 
           editValue800 = refreshEditValue800();
        }
   		return editValue800;
	}
	

	
	   
	/**
	 * 	Update EditValue800 with the passed value
	 *  Corresponding COBOL Variable is 800-EDIT-VALUE
	 *	@param number
	 */
	public void setEditValue800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    editValue800 = checkEditValue800MaxLimit(number); 
		serializeEditValue800(editValue800);
	}
	

	public void setEditValue800(long number) {
	    number = checkEditValue800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEditValue800((int)number);
	}
	
	/**
	 * 	Update EditValue800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEditValue800(char[] value) throws CFException {
		 editValue800 = serializeEditValue800(value);
	}
	/**
	 * 	Update EditValue800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEditValue800String(char[] value) throws CFException {
		 setEditValue800(value);
	}

	
	
	

		public static int getEditNumR800FieldLength() {
			return EDIT_NUM_R_800_LENGTH;
		}

}
  
