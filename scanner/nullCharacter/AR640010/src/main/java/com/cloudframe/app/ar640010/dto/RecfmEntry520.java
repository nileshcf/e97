package com.cloudframe.app.ar640010.dto;

/**
*  The class RecfmEntry520 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RecfmEntry520 extends RecfmEntry520Serialized { 
   

						private char[] recfm2520 = Field.fillLowValue(2);

						private char[] recfm3520 = Field.fillLowValue(3);
	
	/**
	* Constructor for RecfmEntry520
	**/
    public RecfmEntry520() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RecfmEntry520. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RecfmEntry520(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of recfm2520
	 *	@return recfm2520
	 */
   public char[] getRecfm2520() throws CFException{
     if (isRecfm2520Modified()) { 
        recfm2520 = refreshRecfm2520();
     }
   		return recfm2520;
   }

  
	/**
	*  set variable recfm2520
	*  Corresponding COBOL Variable is 520-RECFM-2
	*  @param value
	**/
   public void setRecfm2520(char[] value) {
      recfm2520 = checkRecfm2520Constraints(value);
      serializeRecfm2520(recfm2520);
   } 

     /**
	 * 	Update Recfm2520 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecfm2520(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecfm2520,recfm2520.length);
   	
   }
   
   public void setRecfm2520(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecfm2520,recfm2520.length);
   	
   }
   
     /**
	 * 	Update Recfm2520 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecfm2520(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecfm2520+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Recfm2520 with another Field
	 *	@param value
	 */
   public void setRecfm2520(Field source) {
       replace(source,0,source.length(),beginRecfm2520,RECFM_2520_LEN);
   	
   }  
   
     /**
	 * 	Update Recfm2520 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecfm2520(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecfm2520,RECFM_2520_LEN);
   	
   }
   
     /**
	 * 	Update Recfm2520 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecfm2520(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecfm2520+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of recfm3520
	 *	@return recfm3520
	 */
   public char[] getRecfm3520() throws CFException{
     if (isRecfm3520Modified()) { 
        recfm3520 = refreshRecfm3520();
     }
   		return recfm3520;
   }

  
	/**
	*  set variable recfm3520
	*  Corresponding COBOL Variable is 520-RECFM-3
	*  @param value
	**/
   public void setRecfm3520(char[] value) {
      recfm3520 = checkRecfm3520Constraints(value);
      serializeRecfm3520(recfm3520);
   } 

     /**
	 * 	Update Recfm3520 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecfm3520(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecfm3520,recfm3520.length);
   	
   }
   
   public void setRecfm3520(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecfm3520,recfm3520.length);
   	
   }
   
     /**
	 * 	Update Recfm3520 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecfm3520(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecfm3520+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Recfm3520 with another Field
	 *	@param value
	 */
   public void setRecfm3520(Field source) {
       replace(source,0,source.length(),beginRecfm3520,RECFM_3520_LEN);
   	
   }  
   
     /**
	 * 	Update Recfm3520 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecfm3520(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecfm3520,RECFM_3520_LEN);
   	
   }
   
     /**
	 * 	Update Recfm3520 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecfm3520(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecfm3520+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRecfmEntry520FieldLength() {
			return RECFM_ENTRY_520_LENGTH;
		}

}
  
