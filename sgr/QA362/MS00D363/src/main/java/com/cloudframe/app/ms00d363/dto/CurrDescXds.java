package com.cloudframe.app.ms00d363.dto;

/**
*  The class CurrDescXds is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CurrDescXds extends CurrDescXdsSerialized { 
   

						private char[] swchCerRecType = Field.fillLowValue(2);

						private char[] swchCerNumKey = Field.fillLowValue(3);
	
	/**
	* Constructor for CurrDescXds
	**/
    public CurrDescXds() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CurrDescXds. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrDescXds(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of swchCerRecType
	 *	@return swchCerRecType
	 */
   public char[] getSwchCerRecType() throws CFException{
     if (isSwchCerRecTypeModified()) { 
        swchCerRecType = refreshSwchCerRecType();
     }
   		return swchCerRecType;
   }

  
	/**
	*  set variable swchCerRecType
	*  Corresponding COBOL Variable is SWCH-CER-REC-TYPE
	*  @param value
	**/
   public void setSwchCerRecType(char[] value) {
      swchCerRecType = checkSwchCerRecTypeConstraints(value);
      serializeSwchCerRecType(swchCerRecType);
   } 

     /**
	 * 	Update SwchCerRecType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSwchCerRecType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSwchCerRecType,swchCerRecType.length);
   	
   }
   
   public void setSwchCerRecType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSwchCerRecType,swchCerRecType.length);
   	
   }
   
     /**
	 * 	Update SwchCerRecType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSwchCerRecType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSwchCerRecType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SwchCerRecType with another Field
	 *	@param value
	 */
   public void setSwchCerRecType(Field source) {
       replace(source,0,source.length(),beginSwchCerRecType,SWCH_CER_REC_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update SwchCerRecType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSwchCerRecType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSwchCerRecType,SWCH_CER_REC_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update SwchCerRecType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSwchCerRecType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSwchCerRecType+targetIndex,targetLen);
    
   }
	char[] cerRecType88Value = "84".toCharArray();
	/**
	 *	Test condition "84" for isCerRecType()
	 *	@return  Returns true if isCerRecType() is "84"
	 */
   public boolean isCerRecType() throws CFException {
      return (  compareChars( getSwchCerRecType() , cerRecType88Value)  == 0  );
   }


	/**
	*  set values "84"
	*/
   	public void setCerRecTypeTrue() {  			
    	setSwchCerRecType( cerRecType88Value);
   	}
	/**
	 *	Returns the value of swchCerNumKey
	 *	@return swchCerNumKey
	 */
   public char[] getSwchCerNumKey() throws CFException{
     if (isSwchCerNumKeyModified()) { 
        swchCerNumKey = refreshSwchCerNumKey();
     }
   		return swchCerNumKey;
   }

  
	/**
	*  set variable swchCerNumKey
	*  Corresponding COBOL Variable is SWCH-CER-NUM-KEY
	*  @param value
	**/
   public void setSwchCerNumKey(char[] value) {
      swchCerNumKey = checkSwchCerNumKeyConstraints(value);
      serializeSwchCerNumKey(swchCerNumKey);
   } 

     /**
	 * 	Update SwchCerNumKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSwchCerNumKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSwchCerNumKey,swchCerNumKey.length);
   	
   }
   
   public void setSwchCerNumKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSwchCerNumKey,swchCerNumKey.length);
   	
   }
   
     /**
	 * 	Update SwchCerNumKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSwchCerNumKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSwchCerNumKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SwchCerNumKey with another Field
	 *	@param value
	 */
   public void setSwchCerNumKey(Field source) {
       replace(source,0,source.length(),beginSwchCerNumKey,SWCH_CER_NUM_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update SwchCerNumKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSwchCerNumKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSwchCerNumKey,SWCH_CER_NUM_KEY_LEN);
   	
   }
   
     /**
	 * 	Update SwchCerNumKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSwchCerNumKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSwchCerNumKey+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCurrDescXdsFieldLength() {
			return CURR_DESC_XDS_LENGTH;
		}

}
  
