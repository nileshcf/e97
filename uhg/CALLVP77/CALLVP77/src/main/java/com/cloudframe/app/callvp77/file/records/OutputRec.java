package com.cloudframe.app.callvp77.file.records;

/**
*  The class OutputRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:58. using version 5.0.0.254
**/


import com.cloudframe.app.callvp77.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OutputRec extends OutputRecSerialized {
   

						private char[] outputRecString = Field.fillLowValue(132);
	
	/**
	* Constructor for OutputRec
	**/
    public OutputRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of outputRecString
	 *	@return outputRecString
	 */
   public char[] getOutputRecString() throws CFException{
     if (isOutputRecStringModified()) { 
        outputRecString = refreshOutputRecString();
     }
   		return outputRecString;
   }

  
	/**
	*  set variable outputRecString
	*  Corresponding COBOL Variable is OUTPUT-REC-STRING
	*  @param value
	**/
   public void setOutputRecString(char[] value) {
      outputRecString = checkOutputRecStringConstraints(value);
      serializeOutputRecString(outputRecString);
   } 

     /**
	 * 	Update OutputRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOutputRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOutputRecString,outputRecString.length);
   	
   }
   
   public void setOutputRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOutputRecString,outputRecString.length);
   	
   }
   
     /**
	 * 	Update OutputRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOutputRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOutputRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OutputRecString with another Field
	 *	@param value
	 */
   public void setOutputRecString(Field source) {
       replace(source,0,source.length(),beginOutputRecString,OUTPUT_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update OutputRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOutputRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOutputRecString,OUTPUT_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update OutputRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOutputRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOutputRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getOutputRecFieldLength() {
			return OUTPUT_REC_LENGTH;
		}

}
  
