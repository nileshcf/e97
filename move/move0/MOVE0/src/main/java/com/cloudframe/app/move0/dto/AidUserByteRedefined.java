package com.cloudframe.app.move0.dto;

/**
*  The class AidUserByteRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.move0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AidUserByteRedefined extends AidUserByteRedefinedSerialized { 
   

						private char[] aidAlphaApplNum = Field.fillLowValue(1);
	
	/**
	* Constructor for AidUserByteRedefined
	**/
    public AidUserByteRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AidUserByteRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AidUserByteRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aidAlphaApplNum
	 *	@return aidAlphaApplNum
	 */
   public char[] getAidAlphaApplNum() throws CFException{
     if (isAidAlphaApplNumModified()) { 
        aidAlphaApplNum = refreshAidAlphaApplNum();
     }
   		return aidAlphaApplNum;
   }

  
	/**
	*  set variable aidAlphaApplNum
	*  Corresponding COBOL Variable is AID-ALPHA-APPL-NUM
	*  @param value
	**/
   public void setAidAlphaApplNum(char[] value) {
      aidAlphaApplNum = checkAidAlphaApplNumConstraints(value);
      serializeAidAlphaApplNum(aidAlphaApplNum);
   } 

     /**
	 * 	Update AidAlphaApplNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAidAlphaApplNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAidAlphaApplNum,aidAlphaApplNum.length);
   	
   }
   
   public void setAidAlphaApplNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAidAlphaApplNum,aidAlphaApplNum.length);
   	
   }
   
     /**
	 * 	Update AidAlphaApplNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAidAlphaApplNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAidAlphaApplNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AidAlphaApplNum with another Field
	 *	@param value
	 */
   public void setAidAlphaApplNum(Field source) {
       replace(source,0,source.length(),beginAidAlphaApplNum,AID_ALPHA_APPL_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update AidAlphaApplNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAidAlphaApplNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAidAlphaApplNum,AID_ALPHA_APPL_NUM_LEN);
   	
   }
   
     /**
	 * 	Update AidAlphaApplNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAidAlphaApplNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAidAlphaApplNum+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAidUserByteRedefinedFieldLength() {
			return AID_USER_BYTE_REDEFINED_LENGTH;
		}

}
  
