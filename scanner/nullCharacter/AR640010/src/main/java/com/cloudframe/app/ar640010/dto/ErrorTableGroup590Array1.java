package com.cloudframe.app.ar640010.dto;

/**
*  The class ErrorTableGroup590Array1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorTableGroup590Array1 extends ErrorTableGroup590Array1Serialized { 
   

						private char[] errorId590 = Field.fillLowValue(4);

						private char[] errorText590 = Field.fillLowValue(50);
	
	/**
	* Constructor for ErrorTableGroup590Array1
	**/
    public ErrorTableGroup590Array1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ErrorTableGroup590Array1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrorTableGroup590Array1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of errorId590
	 *	@return errorId590
	 */
   public char[] getErrorId590() throws CFException{
     if (isErrorId590Modified()) { 
        errorId590 = refreshErrorId590();
     }
   		return errorId590;
   }

  
	/**
	*  set variable errorId590
	*  Corresponding COBOL Variable is 590-ERROR-ID
	*  @param value
	**/
   public void setErrorId590(char[] value) {
      errorId590 = checkErrorId590Constraints(value);
      serializeErrorId590(errorId590);
   } 

     /**
	 * 	Update ErrorId590 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorId590(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrorId590,errorId590.length);
   	
   }
   
   public void setErrorId590(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrorId590,errorId590.length);
   	
   }
   
     /**
	 * 	Update ErrorId590 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorId590(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorId590+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrorId590 with another Field
	 *	@param value
	 */
   public void setErrorId590(Field source) {
       replace(source,0,source.length(),beginErrorId590,ERROR_ID_590_LEN);
   	
   }  
   
     /**
	 * 	Update ErrorId590 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorId590(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrorId590,ERROR_ID_590_LEN);
   	
   }
   
     /**
	 * 	Update ErrorId590 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorId590(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorId590+targetIndex,targetLen);
    
   }
	char[] errorEot8859088Value = "....".toCharArray();
	/**
	 *	Test condition "...." for isErrorEot88590()
	 *	@return  Returns true if isErrorEot88590() is "...."
	 */
   public boolean isErrorEot88590() throws CFException {
      return (  compareChars( getErrorId590() , errorEot8859088Value)  == 0  );
   }


	/**
	*  set values "...."
	*/
   	public void setErrorEot88590True() {  			
    	setErrorId590( errorEot8859088Value);
   	}
	/**
	 *	Returns the value of errorText590
	 *	@return errorText590
	 */
   public char[] getErrorText590() throws CFException{
     if (isErrorText590Modified()) { 
        errorText590 = refreshErrorText590();
     }
   		return errorText590;
   }

  
	/**
	*  set variable errorText590
	*  Corresponding COBOL Variable is 590-ERROR-TEXT
	*  @param value
	**/
   public void setErrorText590(char[] value) {
      errorText590 = checkErrorText590Constraints(value);
      serializeErrorText590(errorText590);
   } 

     /**
	 * 	Update ErrorText590 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorText590(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrorText590,errorText590.length);
   	
   }
   
   public void setErrorText590(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrorText590,errorText590.length);
   	
   }
   
     /**
	 * 	Update ErrorText590 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorText590(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorText590+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrorText590 with another Field
	 *	@param value
	 */
   public void setErrorText590(Field source) {
       replace(source,0,source.length(),beginErrorText590,ERROR_TEXT_590_LEN);
   	
   }  
   
     /**
	 * 	Update ErrorText590 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorText590(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrorText590,ERROR_TEXT_590_LEN);
   	
   }
   
     /**
	 * 	Update ErrorText590 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorText590(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorText590+targetIndex,targetLen);
    
   }

	
	
	

		public static int getErrorTableGroup590Array1FieldLength() {
			return ERROR_TABLE_GROUP_590_ARRAY_1_LENGTH;
		}

}
  
