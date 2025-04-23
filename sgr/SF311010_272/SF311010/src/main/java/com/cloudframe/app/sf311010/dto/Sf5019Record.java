package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf5019Record is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf5019Record extends Sf5019RecordSerialized { 
   

						private char[] sf5019Data = Field.fillLowValue(7997);

						private char[] sf5019DataRedefined01 = Field.fillLowValue(7997);

						private char[] sf5019DataRedefined02 = Field.fillLowValue(7997);

						private char[] sf5019DataRedefined = Field.fillLowValue(7997);
	
	/**
	* Constructor for Sf5019Record
	**/
    public Sf5019Record() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf5019Record. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf5019Record(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf5019Data
	 *	@return sf5019Data
	 */
   public char[] getSf5019Data() throws CFException{
     if (isSf5019DataModified()) { 
        sf5019Data = refreshSf5019Data();
     }
   		return sf5019Data;
   }

  
	/**
	*  set variable sf5019Data
	*  Corresponding COBOL Variable is SF501-9-DATA
	*  @param value
	**/
   public void setSf5019Data(char[] value) {
      sf5019Data = checkSf5019DataConstraints(value);
      serializeSf5019Data(sf5019Data);
   } 

     /**
	 * 	Update Sf5019Data 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf5019Data(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf5019Data,sf5019Data.length);
   	
   }
   
   public void setSf5019Data(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf5019Data,sf5019Data.length);
   	
   }
   
     /**
	 * 	Update Sf5019Data 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf5019Data(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf5019Data+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf5019Data with another Field
	 *	@param value
	 */
   public void setSf5019Data(Field source) {
       replace(source,0,source.length(),beginSf5019Data,SF_5019_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf5019Data 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf5019Data(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf5019Data,SF_5019_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Sf5019Data 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf5019Data(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf5019Data+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf5019DataRedefined01
	 *	@return sf5019DataRedefined01
	 */
   public char[] getSf5019DataRedefined01() throws CFException{
     if (isSf5019DataRedefined01Modified()) { 
        sf5019DataRedefined01 = refreshSf5019DataRedefined01();
     }
   		return sf5019DataRedefined01;
   }

  
	/**
	*  set variable sf5019DataRedefined01
	*  Corresponding COBOL Variable is SF501-9-DATA-REDEFINED
	*  @param value
	**/
   public void setSf5019DataRedefined01(char[] value) {
      sf5019DataRedefined01 = checkSf5019DataRedefined01Constraints(value);
      serializeSf5019DataRedefined01(sf5019DataRedefined01);
   } 

     /**
	 * 	Update Sf5019DataRedefined01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf5019DataRedefined01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf5019DataRedefined01,sf5019DataRedefined01.length);
   	
   }
   
   public void setSf5019DataRedefined01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf5019DataRedefined01,sf5019DataRedefined01.length);
   	
   }
   
     /**
	 * 	Update Sf5019DataRedefined01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf5019DataRedefined01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf5019DataRedefined01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf5019DataRedefined01 with another Field
	 *	@param value
	 */
   public void setSf5019DataRedefined01(Field source) {
       replace(source,0,source.length(),beginSf5019DataRedefined01,SF_5019_DATA_REDEFINED_01_LEN);
   	
   }  
   
     /**
	 * 	Update Sf5019DataRedefined01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf5019DataRedefined01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf5019DataRedefined01,SF_5019_DATA_REDEFINED_01_LEN);
   	
   }
   
     /**
	 * 	Update Sf5019DataRedefined01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf5019DataRedefined01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf5019DataRedefined01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf5019DataRedefined02
	 *	@return sf5019DataRedefined02
	 */
   public char[] getSf5019DataRedefined02() throws CFException{
     if (isSf5019DataRedefined02Modified()) { 
        sf5019DataRedefined02 = refreshSf5019DataRedefined02();
     }
   		return sf5019DataRedefined02;
   }

  
	/**
	*  set variable sf5019DataRedefined02
	*  Corresponding COBOL Variable is SF501-9-DATA-REDEFINED
	*  @param value
	**/
   public void setSf5019DataRedefined02(char[] value) {
      sf5019DataRedefined02 = checkSf5019DataRedefined02Constraints(value);
      serializeSf5019DataRedefined02(sf5019DataRedefined02);
   } 

     /**
	 * 	Update Sf5019DataRedefined02 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf5019DataRedefined02(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf5019DataRedefined02,sf5019DataRedefined02.length);
   	
   }
   
   public void setSf5019DataRedefined02(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf5019DataRedefined02,sf5019DataRedefined02.length);
   	
   }
   
     /**
	 * 	Update Sf5019DataRedefined02 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf5019DataRedefined02(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf5019DataRedefined02+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf5019DataRedefined02 with another Field
	 *	@param value
	 */
   public void setSf5019DataRedefined02(Field source) {
       replace(source,0,source.length(),beginSf5019DataRedefined02,SF_5019_DATA_REDEFINED_02_LEN);
   	
   }  
   
     /**
	 * 	Update Sf5019DataRedefined02 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf5019DataRedefined02(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf5019DataRedefined02,SF_5019_DATA_REDEFINED_02_LEN);
   	
   }
   
     /**
	 * 	Update Sf5019DataRedefined02 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf5019DataRedefined02(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf5019DataRedefined02+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf5019DataRedefined
	 *	@return sf5019DataRedefined
	 */
   public char[] getSf5019DataRedefined() throws CFException{
     if (isSf5019DataRedefinedModified()) { 
        sf5019DataRedefined = refreshSf5019DataRedefined();
     }
   		return sf5019DataRedefined;
   }

  
	/**
	*  set variable sf5019DataRedefined
	*  Corresponding COBOL Variable is SF501-9-DATA-REDEFINED
	*  @param value
	**/
   public void setSf5019DataRedefined(char[] value) {
      sf5019DataRedefined = checkSf5019DataRedefinedConstraints(value);
      serializeSf5019DataRedefined(sf5019DataRedefined);
   } 

     /**
	 * 	Update Sf5019DataRedefined 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf5019DataRedefined(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf5019DataRedefined,sf5019DataRedefined.length);
   	
   }
   
   public void setSf5019DataRedefined(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf5019DataRedefined,sf5019DataRedefined.length);
   	
   }
   
     /**
	 * 	Update Sf5019DataRedefined 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf5019DataRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf5019DataRedefined+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf5019DataRedefined with another Field
	 *	@param value
	 */
   public void setSf5019DataRedefined(Field source) {
       replace(source,0,source.length(),beginSf5019DataRedefined,SF_5019_DATA_REDEFINED_LEN);
   	
   }  
   
     /**
	 * 	Update Sf5019DataRedefined 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf5019DataRedefined(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf5019DataRedefined,SF_5019_DATA_REDEFINED_LEN);
   	
   }
   
     /**
	 * 	Update Sf5019DataRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf5019DataRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf5019DataRedefined+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf5019RecordFieldLength() {
			return SF_5019_RECORD_LENGTH;
		}

}
  
