package com.cloudframe.app.ip343690.dto;

/**
*  The class AbendCode800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/


import com.cloudframe.app.ip343690.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AbendCode800 extends AbendCode800Serialized { 
   


								private short abend800;
	
	/**
	* Constructor for AbendCode800
	**/
    public AbendCode800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AbendCode800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AbendCode800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 0
             ,2
             );
								setAbend800((short)0);
    } 

	/**
	 *	Returns the value of abend800
	 *	@return abend800
	 */
	public short getAbend800() throws CFException {
        if (isAbend800Modified()) { 
           abend800 = refreshAbend800();
        }
   		return abend800;
	}
	
	/**
	 * 	Update Abend800 with the passed value
	 *  Corresponding COBOL Variable is 800-ABEND
	 *	@param number
	 */
	public void setAbend800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    abend800 = checkAbend800MaxLimit(number); 
		serializeAbend800(abend800);
	}

	public void setAbend800(int number) {
	    number = checkAbend800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAbend800((short)number);
	}
	public void setAbend800(long number) {
	    number = checkAbend800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAbend800((short)number);
	}
	


	
	
	

		public static int getAbendCode800FieldLength() {
			return ABEND_CODE_800_LENGTH;
		}

}
  
