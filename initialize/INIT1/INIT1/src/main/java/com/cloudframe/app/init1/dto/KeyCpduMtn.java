package com.cloudframe.app.init1.dto;

/**
*  The class KeyCpduMtn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class KeyCpduMtn extends KeyCpduMtnSerialized { 
   

						private char[] cpduNpa = Field.fillLowValue(3);

						private char[] cpduNxx = Field.fillLowValue(3);

						private char[] cpduTln = Field.fillLowValue(4);
	
	/**
	* Constructor for KeyCpduMtn
	**/
    public KeyCpduMtn() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyCpduMtn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyCpduMtn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cpduNpa
	 *	@return cpduNpa
	 */
   public char[] getCpduNpa() throws CFException{
     if (isCpduNpaModified()) { 
        cpduNpa = refreshCpduNpa();
     }
   		return cpduNpa;
   }

  
	/**
	*  set variable cpduNpa
	*  Corresponding COBOL Variable is WS-CPDU-NPA
	*  @param value
	**/
   public void setCpduNpa(char[] value) {
      cpduNpa = checkCpduNpaConstraints(value);
      serializeCpduNpa(cpduNpa);
   } 

     /**
	 * 	Update CpduNpa 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpduNpa(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpduNpa,cpduNpa.length);
   	
   }
   
   public void setCpduNpa(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpduNpa,cpduNpa.length);
   	
   }
   
     /**
	 * 	Update CpduNpa 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpduNpa(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduNpa+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpduNpa with another Field
	 *	@param value
	 */
   public void setCpduNpa(Field source) {
       replace(source,0,source.length(),beginCpduNpa,CPDU_NPA_LEN);
   	
   }  
   
     /**
	 * 	Update CpduNpa 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpduNpa(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpduNpa,CPDU_NPA_LEN);
   	
   }
   
     /**
	 * 	Update CpduNpa 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpduNpa(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduNpa+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpduNxx
	 *	@return cpduNxx
	 */
   public char[] getCpduNxx() throws CFException{
     if (isCpduNxxModified()) { 
        cpduNxx = refreshCpduNxx();
     }
   		return cpduNxx;
   }

  
	/**
	*  set variable cpduNxx
	*  Corresponding COBOL Variable is WS-CPDU-NXX
	*  @param value
	**/
   public void setCpduNxx(char[] value) {
      cpduNxx = checkCpduNxxConstraints(value);
      serializeCpduNxx(cpduNxx);
   } 

     /**
	 * 	Update CpduNxx 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpduNxx(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpduNxx,cpduNxx.length);
   	
   }
   
   public void setCpduNxx(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpduNxx,cpduNxx.length);
   	
   }
   
     /**
	 * 	Update CpduNxx 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpduNxx(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduNxx+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpduNxx with another Field
	 *	@param value
	 */
   public void setCpduNxx(Field source) {
       replace(source,0,source.length(),beginCpduNxx,CPDU_NXX_LEN);
   	
   }  
   
     /**
	 * 	Update CpduNxx 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpduNxx(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpduNxx,CPDU_NXX_LEN);
   	
   }
   
     /**
	 * 	Update CpduNxx 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpduNxx(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduNxx+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpduTln
	 *	@return cpduTln
	 */
   public char[] getCpduTln() throws CFException{
     if (isCpduTlnModified()) { 
        cpduTln = refreshCpduTln();
     }
   		return cpduTln;
   }

  
	/**
	*  set variable cpduTln
	*  Corresponding COBOL Variable is WS-CPDU-TLN
	*  @param value
	**/
   public void setCpduTln(char[] value) {
      cpduTln = checkCpduTlnConstraints(value);
      serializeCpduTln(cpduTln);
   } 

     /**
	 * 	Update CpduTln 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpduTln(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpduTln,cpduTln.length);
   	
   }
   
   public void setCpduTln(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpduTln,cpduTln.length);
   	
   }
   
     /**
	 * 	Update CpduTln 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpduTln(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduTln+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpduTln with another Field
	 *	@param value
	 */
   public void setCpduTln(Field source) {
       replace(source,0,source.length(),beginCpduTln,CPDU_TLN_LEN);
   	
   }  
   
     /**
	 * 	Update CpduTln 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpduTln(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpduTln,CPDU_TLN_LEN);
   	
   }
   
     /**
	 * 	Update CpduTln 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpduTln(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduTln+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes KeyCpduMtn
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCpduNpa(CONSTANTS.SPACE_3);
         setCpduNxx(CONSTANTS.SPACE_3);
         setCpduTln(CONSTANTS.SPACE_4);
   }

		public static int getKeyCpduMtnFieldLength() {
			return KEY_CPDU_MTN_LENGTH;
		}

}
  
