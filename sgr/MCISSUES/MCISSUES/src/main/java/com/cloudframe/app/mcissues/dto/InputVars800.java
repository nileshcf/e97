package com.cloudframe.app.mcissues.dto;

/**
*  The class InputVars800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class InputVars800 extends InputVars800Serialized {
   

								private long inputTableId800;

						private char[] inputSegId800 = Field.fillLowValue(4);
	
	/**
	* Constructor for InputVars800
	**/
    public InputVars800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of inputTableId800
	 *	@return inputTableId800
	 */
	public long getInputTableId800() throws CFException {
       if (isInputTableId800Modified()) { 
           inputTableId800 = refreshInputTableId800();
        }
   		return inputTableId800;
	}
	

	
	   
	/**
	 * 	Update InputTableId800 with the passed value
	 *  Corresponding COBOL Variable is 800-INPUT-TABLE-ID
	 *	@param number
	 */
	public void setInputTableId800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    inputTableId800 = checkInputTableId800MaxLimit(number); 
		serializeInputTableId800(inputTableId800);
	}
	

	/**
	 * 	Update InputTableId800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setInputTableId800(char[] value) throws CFException {
		 inputTableId800 = serializeInputTableId800(value);
	}
	/**
	 * 	Update InputTableId800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInputTableId800String(char[] value) throws CFException {
		 setInputTableId800(value);
	}
	/**
	 *	Returns the value of inputSegId800
	 *	@return inputSegId800
	 */
   public char[] getInputSegId800() throws CFException{
     if (isInputSegId800Modified()) { 
        inputSegId800 = refreshInputSegId800();
     }
   		return inputSegId800;
   }

  
	/**
	*  set variable inputSegId800
	*  Corresponding COBOL Variable is 800-INPUT-SEG-ID
	*  @param value
	**/
   public void setInputSegId800(char[] value) {
      inputSegId800 = checkInputSegId800Constraints(value);
      serializeInputSegId800(inputSegId800);
   } 

     /**
	 * 	Update InputSegId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputSegId800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInputSegId800,inputSegId800.length);
   	
   }
   
   public void setInputSegId800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInputSegId800,inputSegId800.length);
   	
   }
   
     /**
	 * 	Update InputSegId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputSegId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputSegId800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InputSegId800 with another Field
	 *	@param value
	 */
   public void setInputSegId800(Field source) {
       replace(source,0,source.length(),beginInputSegId800,INPUT_SEG_ID_800_LEN);
   	
   }  
   
     /**
	 * 	Update InputSegId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputSegId800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInputSegId800,INPUT_SEG_ID_800_LEN);
   	
   }
   
     /**
	 * 	Update InputSegId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputSegId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputSegId800+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes InputVars800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setInputTableId800(0);
         setInputSegId800(CONSTANTS.SPACE_4);
   }

		public static int getInputVars800FieldLength() {
			return INPUT_VARS_800_LENGTH;
		}

}
  
