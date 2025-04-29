package com.cloudframe.app.init1.dto;

/**
*  The class KeyMtnMtn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class KeyMtnMtn extends KeyMtnMtnSerialized { 
   

						private char[] keyMtnNpa = new char[3];

						private char[] keyMtnNxx = new char[3];

						private char[] keyMtnTln = new char[4];
	
	/**
	* Constructor for KeyMtnMtn
	**/
    public KeyMtnMtn() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyMtnMtn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyMtnMtn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setKeyMtnNpa(fillSpace(3));
								setKeyMtnNxx(fillSpace(3));
								setKeyMtnTln(fillSpace(4));
    } 

	/**
	 *	Returns the value of keyMtnNpa
	 *	@return keyMtnNpa
	 */
   public char[] getKeyMtnNpa() throws CFException{
     if (isKeyMtnNpaModified()) { 
        keyMtnNpa = refreshKeyMtnNpa();
     }
   		return keyMtnNpa;
   }

  
	/**
	*  set variable keyMtnNpa
	*  Corresponding COBOL Variable is WS-KEY-MTN-NPA
	*  @param value
	**/
   public void setKeyMtnNpa(char[] value) {
      keyMtnNpa = checkKeyMtnNpaConstraints(value);
      serializeKeyMtnNpa(keyMtnNpa);
   } 

     /**
	 * 	Update KeyMtnNpa 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setKeyMtnNpa(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginKeyMtnNpa,keyMtnNpa.length);
   	
   }
   
   public void setKeyMtnNpa(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginKeyMtnNpa,keyMtnNpa.length);
   	
   }
   
     /**
	 * 	Update KeyMtnNpa 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyMtnNpa(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginKeyMtnNpa+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update KeyMtnNpa with another Field
	 *	@param value
	 */
   public void setKeyMtnNpa(Field source) {
       replace(source,0,source.length(),beginKeyMtnNpa,KEY_MTN_NPA_LEN);
   	
   }  
   
     /**
	 * 	Update KeyMtnNpa 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setKeyMtnNpa(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginKeyMtnNpa,KEY_MTN_NPA_LEN);
   	
   }
   
     /**
	 * 	Update KeyMtnNpa 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyMtnNpa(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginKeyMtnNpa+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of keyMtnNxx
	 *	@return keyMtnNxx
	 */
   public char[] getKeyMtnNxx() throws CFException{
     if (isKeyMtnNxxModified()) { 
        keyMtnNxx = refreshKeyMtnNxx();
     }
   		return keyMtnNxx;
   }

  
	/**
	*  set variable keyMtnNxx
	*  Corresponding COBOL Variable is WS-KEY-MTN-NXX
	*  @param value
	**/
   public void setKeyMtnNxx(char[] value) {
      keyMtnNxx = checkKeyMtnNxxConstraints(value);
      serializeKeyMtnNxx(keyMtnNxx);
   } 

     /**
	 * 	Update KeyMtnNxx 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setKeyMtnNxx(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginKeyMtnNxx,keyMtnNxx.length);
   	
   }
   
   public void setKeyMtnNxx(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginKeyMtnNxx,keyMtnNxx.length);
   	
   }
   
     /**
	 * 	Update KeyMtnNxx 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyMtnNxx(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginKeyMtnNxx+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update KeyMtnNxx with another Field
	 *	@param value
	 */
   public void setKeyMtnNxx(Field source) {
       replace(source,0,source.length(),beginKeyMtnNxx,KEY_MTN_NXX_LEN);
   	
   }  
   
     /**
	 * 	Update KeyMtnNxx 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setKeyMtnNxx(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginKeyMtnNxx,KEY_MTN_NXX_LEN);
   	
   }
   
     /**
	 * 	Update KeyMtnNxx 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyMtnNxx(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginKeyMtnNxx+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of keyMtnTln
	 *	@return keyMtnTln
	 */
   public char[] getKeyMtnTln() throws CFException{
     if (isKeyMtnTlnModified()) { 
        keyMtnTln = refreshKeyMtnTln();
     }
   		return keyMtnTln;
   }

  
	/**
	*  set variable keyMtnTln
	*  Corresponding COBOL Variable is WS-KEY-MTN-TLN
	*  @param value
	**/
   public void setKeyMtnTln(char[] value) {
      keyMtnTln = checkKeyMtnTlnConstraints(value);
      serializeKeyMtnTln(keyMtnTln);
   } 

     /**
	 * 	Update KeyMtnTln 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setKeyMtnTln(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginKeyMtnTln,keyMtnTln.length);
   	
   }
   
   public void setKeyMtnTln(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginKeyMtnTln,keyMtnTln.length);
   	
   }
   
     /**
	 * 	Update KeyMtnTln 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyMtnTln(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginKeyMtnTln+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update KeyMtnTln with another Field
	 *	@param value
	 */
   public void setKeyMtnTln(Field source) {
       replace(source,0,source.length(),beginKeyMtnTln,KEY_MTN_TLN_LEN);
   	
   }  
   
     /**
	 * 	Update KeyMtnTln 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setKeyMtnTln(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginKeyMtnTln,KEY_MTN_TLN_LEN);
   	
   }
   
     /**
	 * 	Update KeyMtnTln 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyMtnTln(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginKeyMtnTln+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes KeyMtnMtn
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setKeyMtnNpa(CONSTANTS.SPACE_3);
         setKeyMtnNxx(CONSTANTS.SPACE_3);
         setKeyMtnTln(CONSTANTS.SPACE_4);
   }

		public static int getKeyMtnMtnFieldLength() {
			return KEY_MTN_MTN_LENGTH;
		}

}
  
