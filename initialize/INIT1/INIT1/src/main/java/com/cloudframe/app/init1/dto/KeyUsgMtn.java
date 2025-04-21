package com.cloudframe.app.init1.dto;

/**
*  The class KeyUsgMtn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class KeyUsgMtn extends KeyUsgMtnSerialized { 
   

						private char[] usgNpa = Field.fillLowValue(3);

						private char[] usgNxx = Field.fillLowValue(3);

						private char[] usgTln = Field.fillLowValue(4);
	
	/**
	* Constructor for KeyUsgMtn
	**/
    public KeyUsgMtn() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyUsgMtn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyUsgMtn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of usgNpa
	 *	@return usgNpa
	 */
   public char[] getUsgNpa() throws CFException{
     if (isUsgNpaModified()) { 
        usgNpa = refreshUsgNpa();
     }
   		return usgNpa;
   }

  
	/**
	*  set variable usgNpa
	*  Corresponding COBOL Variable is WS-USG-NPA
	*  @param value
	**/
   public void setUsgNpa(char[] value) {
      usgNpa = checkUsgNpaConstraints(value);
      serializeUsgNpa(usgNpa);
   } 

     /**
	 * 	Update UsgNpa 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUsgNpa(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUsgNpa,usgNpa.length);
   	
   }
   
   public void setUsgNpa(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUsgNpa,usgNpa.length);
   	
   }
   
     /**
	 * 	Update UsgNpa 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUsgNpa(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgNpa+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UsgNpa with another Field
	 *	@param value
	 */
   public void setUsgNpa(Field source) {
       replace(source,0,source.length(),beginUsgNpa,USG_NPA_LEN);
   	
   }  
   
     /**
	 * 	Update UsgNpa 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUsgNpa(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUsgNpa,USG_NPA_LEN);
   	
   }
   
     /**
	 * 	Update UsgNpa 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUsgNpa(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgNpa+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of usgNxx
	 *	@return usgNxx
	 */
   public char[] getUsgNxx() throws CFException{
     if (isUsgNxxModified()) { 
        usgNxx = refreshUsgNxx();
     }
   		return usgNxx;
   }

  
	/**
	*  set variable usgNxx
	*  Corresponding COBOL Variable is WS-USG-NXX
	*  @param value
	**/
   public void setUsgNxx(char[] value) {
      usgNxx = checkUsgNxxConstraints(value);
      serializeUsgNxx(usgNxx);
   } 

     /**
	 * 	Update UsgNxx 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUsgNxx(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUsgNxx,usgNxx.length);
   	
   }
   
   public void setUsgNxx(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUsgNxx,usgNxx.length);
   	
   }
   
     /**
	 * 	Update UsgNxx 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUsgNxx(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgNxx+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UsgNxx with another Field
	 *	@param value
	 */
   public void setUsgNxx(Field source) {
       replace(source,0,source.length(),beginUsgNxx,USG_NXX_LEN);
   	
   }  
   
     /**
	 * 	Update UsgNxx 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUsgNxx(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUsgNxx,USG_NXX_LEN);
   	
   }
   
     /**
	 * 	Update UsgNxx 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUsgNxx(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgNxx+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of usgTln
	 *	@return usgTln
	 */
   public char[] getUsgTln() throws CFException{
     if (isUsgTlnModified()) { 
        usgTln = refreshUsgTln();
     }
   		return usgTln;
   }

  
	/**
	*  set variable usgTln
	*  Corresponding COBOL Variable is WS-USG-TLN
	*  @param value
	**/
   public void setUsgTln(char[] value) {
      usgTln = checkUsgTlnConstraints(value);
      serializeUsgTln(usgTln);
   } 

     /**
	 * 	Update UsgTln 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUsgTln(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUsgTln,usgTln.length);
   	
   }
   
   public void setUsgTln(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUsgTln,usgTln.length);
   	
   }
   
     /**
	 * 	Update UsgTln 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUsgTln(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgTln+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UsgTln with another Field
	 *	@param value
	 */
   public void setUsgTln(Field source) {
       replace(source,0,source.length(),beginUsgTln,USG_TLN_LEN);
   	
   }  
   
     /**
	 * 	Update UsgTln 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUsgTln(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUsgTln,USG_TLN_LEN);
   	
   }
   
     /**
	 * 	Update UsgTln 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUsgTln(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgTln+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes KeyUsgMtn
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setUsgNpa(CONSTANTS.SPACE_3);
         setUsgNxx(CONSTANTS.SPACE_3);
         setUsgTln(CONSTANTS.SPACE_4);
   }

		public static int getKeyUsgMtnFieldLength() {
			return KEY_USG_MTN_LENGTH;
		}

}
  
