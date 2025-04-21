package com.cloudframe.app.ar640010.dto;

/**
*  The class ResultReason603Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ResultReason603Redefined extends ResultReason603RedefinedSerialized { 
   

						private char[] resultBkupEndpt603 = Field.fillLowValue(7);
	
	/**
	* Constructor for ResultReason603Redefined
	**/
    public ResultReason603Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ResultReason603Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ResultReason603Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of resultBkupEndpt603
	 *	@return resultBkupEndpt603
	 */
   public char[] getResultBkupEndpt603() throws CFException{
     if (isResultBkupEndpt603Modified()) { 
        resultBkupEndpt603 = refreshResultBkupEndpt603();
     }
   		return resultBkupEndpt603;
   }

  
	/**
	*  set variable resultBkupEndpt603
	*  Corresponding COBOL Variable is 603-RESULT-BKUP-ENDPT
	*  @param value
	**/
   public void setResultBkupEndpt603(char[] value) {
      resultBkupEndpt603 = checkResultBkupEndpt603Constraints(value);
      serializeResultBkupEndpt603(resultBkupEndpt603);
   } 

     /**
	 * 	Update ResultBkupEndpt603 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultBkupEndpt603(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultBkupEndpt603,resultBkupEndpt603.length);
   	
   }
   
   public void setResultBkupEndpt603(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultBkupEndpt603,resultBkupEndpt603.length);
   	
   }
   
     /**
	 * 	Update ResultBkupEndpt603 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultBkupEndpt603(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultBkupEndpt603+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultBkupEndpt603 with another Field
	 *	@param value
	 */
   public void setResultBkupEndpt603(Field source) {
       replace(source,0,source.length(),beginResultBkupEndpt603,RESULT_BKUP_ENDPT_603_LEN);
   	
   }  
   
     /**
	 * 	Update ResultBkupEndpt603 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultBkupEndpt603(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultBkupEndpt603,RESULT_BKUP_ENDPT_603_LEN);
   	
   }
   
     /**
	 * 	Update ResultBkupEndpt603 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultBkupEndpt603(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultBkupEndpt603+targetIndex,targetLen);
    
   }

	
	
	

		public static int getResultReason603RedefinedFieldLength() {
			return RESULT_REASON_603_REDEFINED_LENGTH;
		}

}
  
