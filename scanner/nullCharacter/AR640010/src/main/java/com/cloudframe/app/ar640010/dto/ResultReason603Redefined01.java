package com.cloudframe.app.ar640010.dto;

/**
*  The class ResultReason603Redefined01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ResultReason603Redefined01 extends ResultReason603Redefined01Serialized { 
   

						private char[] resultApplExit603 = Field.fillLowValue(8);
	
	/**
	* Constructor for ResultReason603Redefined01
	**/
    public ResultReason603Redefined01() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ResultReason603Redefined01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ResultReason603Redefined01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of resultApplExit603
	 *	@return resultApplExit603
	 */
   public char[] getResultApplExit603() throws CFException{
     if (isResultApplExit603Modified()) { 
        resultApplExit603 = refreshResultApplExit603();
     }
   		return resultApplExit603;
   }

  
	/**
	*  set variable resultApplExit603
	*  Corresponding COBOL Variable is 603-RESULT-APPL-EXIT
	*  @param value
	**/
   public void setResultApplExit603(char[] value) {
      resultApplExit603 = checkResultApplExit603Constraints(value);
      serializeResultApplExit603(resultApplExit603);
   } 

     /**
	 * 	Update ResultApplExit603 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultApplExit603(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultApplExit603,resultApplExit603.length);
   	
   }
   
   public void setResultApplExit603(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultApplExit603,resultApplExit603.length);
   	
   }
   
     /**
	 * 	Update ResultApplExit603 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultApplExit603(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultApplExit603+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultApplExit603 with another Field
	 *	@param value
	 */
   public void setResultApplExit603(Field source) {
       replace(source,0,source.length(),beginResultApplExit603,RESULT_APPL_EXIT_603_LEN);
   	
   }  
   
     /**
	 * 	Update ResultApplExit603 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultApplExit603(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultApplExit603,RESULT_APPL_EXIT_603_LEN);
   	
   }
   
     /**
	 * 	Update ResultApplExit603 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultApplExit603(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultApplExit603+targetIndex,targetLen);
    
   }

	
	
	

		public static int getResultReason603Redefined01FieldLength() {
			return RESULT_REASON_603_REDEFINED_01_LENGTH;
		}

}
  
