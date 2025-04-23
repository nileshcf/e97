package com.cloudframe.app.ar640010.dto;

/**
*  The class PgmMillisecond800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PgmMillisecond800 extends PgmMillisecond800Serialized { 
   

								private int pgmHundredth800;

	
	/**
	* Constructor for PgmMillisecond800
	**/
    public PgmMillisecond800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for PgmMillisecond800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PgmMillisecond800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setPgmHundredth800(0);
       replaceValue(pad(4,"0","0",LEFT_PAD),getStartOffset() + 2,4);
    } 

	/**
	 *	Returns the value of pgmHundredth800
	 *	@return pgmHundredth800
	 */
	public int getPgmHundredth800() throws CFException {
       if (isPgmHundredth800Modified()) { 
           pgmHundredth800 = refreshPgmHundredth800();
        }
   		return pgmHundredth800;
	}
	

	
	   
	/**
	 * 	Update PgmHundredth800 with the passed value
	 *  Corresponding COBOL Variable is 800-PGM-HUNDREDTH
	 *	@param number
	 */
	public void setPgmHundredth800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    pgmHundredth800 = checkPgmHundredth800MaxLimit(number); 
		serializePgmHundredth800(pgmHundredth800);
	}
	

	public void setPgmHundredth800(long number) {
	    number = checkPgmHundredth800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPgmHundredth800((int)number);
	}
	
	/**
	 * 	Update PgmHundredth800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPgmHundredth800(char[] value) throws CFException {
		 pgmHundredth800 = serializePgmHundredth800(value);
	}
	/**
	 * 	Update PgmHundredth800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPgmHundredth800String(char[] value) throws CFException {
		 setPgmHundredth800(value);
	}

	
	
	

		public static int getPgmMillisecond800FieldLength() {
			return PGM_MILLISECOND_800_LENGTH;
		}

}
  
