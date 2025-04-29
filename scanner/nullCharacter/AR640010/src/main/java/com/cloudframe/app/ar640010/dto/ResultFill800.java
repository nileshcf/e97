package com.cloudframe.app.ar640010.dto;

/**
*  The class ResultFill800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ResultFill800 extends ResultFill800Serialized { 
   

								private int resultFillStart800;

								private int resultFillCount800;
	
	/**
	* Constructor for ResultFill800
	**/
    public ResultFill800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ResultFill800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ResultFill800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setResultFillStart800(0);
								setResultFillCount800(0);
    } 

	/**
	 *	Returns the value of resultFillStart800
	 *	@return resultFillStart800
	 */
	public int getResultFillStart800() throws CFException {
        if (isResultFillStart800Modified()) { 
           resultFillStart800 = refreshResultFillStart800();
        }
   		return resultFillStart800;
	}
	
	/**
	 * 	Update ResultFillStart800 with the passed value
	 *  Corresponding COBOL Variable is 800-RESULT-FILL-START
	 *	@param number
	 */
	public void setResultFillStart800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    resultFillStart800 = checkResultFillStart800MaxLimit(number); 
		serializeResultFillStart800(resultFillStart800);
	}


	public void setResultFillStart800(long number) {
	    number = checkResultFillStart800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setResultFillStart800((int)number);
	}
	
	/**
	 *	Returns the value of resultFillCount800
	 *	@return resultFillCount800
	 */
	public int getResultFillCount800() throws CFException {
        if (isResultFillCount800Modified()) { 
           resultFillCount800 = refreshResultFillCount800();
        }
   		return resultFillCount800;
	}
	
	/**
	 * 	Update ResultFillCount800 with the passed value
	 *  Corresponding COBOL Variable is 800-RESULT-FILL-COUNT
	 *	@param number
	 */
	public void setResultFillCount800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    resultFillCount800 = checkResultFillCount800MaxLimit(number); 
		serializeResultFillCount800(resultFillCount800);
	}


	public void setResultFillCount800(long number) {
	    number = checkResultFillCount800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setResultFillCount800((int)number);
	}
	

	
	
	

		public static int getResultFill800FieldLength() {
			return RESULT_FILL_800_LENGTH;
		}

}
  
