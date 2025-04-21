package com.cloudframe.app.ms00d363.file.records;

/**
*  The class CurcyRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CurcyRec extends CurcyRecSerialized {
   

						private char[] curcyRecString = Field.fillLowValue(300);
	
	/**
	* Constructor for CurcyRec
	**/
    public CurcyRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of curcyRecString
	 *	@return curcyRecString
	 */
   public char[] getCurcyRecString() throws CFException{
     if (isCurcyRecStringModified()) { 
        curcyRecString = refreshCurcyRecString();
     }
   		return curcyRecString;
   }

  
	/**
	*  set variable curcyRecString
	*  Corresponding COBOL Variable is CURCY-REC-STRING
	*  @param value
	**/
   public void setCurcyRecString(char[] value) {
      curcyRecString = checkCurcyRecStringConstraints(value);
      serializeCurcyRecString(curcyRecString);
   } 

     /**
	 * 	Update CurcyRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurcyRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurcyRecString,curcyRecString.length);
   	
   }
   
   public void setCurcyRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurcyRecString,curcyRecString.length);
   	
   }
   
     /**
	 * 	Update CurcyRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurcyRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurcyRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurcyRecString with another Field
	 *	@param value
	 */
   public void setCurcyRecString(Field source) {
       replace(source,0,source.length(),beginCurcyRecString,CURCY_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update CurcyRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurcyRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurcyRecString,CURCY_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update CurcyRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurcyRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurcyRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCurcyRecFieldLength() {
			return CURCY_REC_LENGTH;
		}

}
  
