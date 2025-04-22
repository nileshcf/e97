package com.cloudframe.app.move0.dto;

/**
*  The class AidUserByteGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.move0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AidUserByteGroup extends AidUserByteGroupSerialized {
   

						private char[] aidUserByte = new char[2];
					private AidUserByteRedefined01 aidUserByteRedefined01 = new AidUserByteRedefined01();
					private AidUserByteRedefined aidUserByteRedefined = new AidUserByteRedefined();
	
	/**
	* Constructor for AidUserByteGroup
	**/
    public AidUserByteGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aidUserByteRedefined01.setParent(this,getStartOffset() + 0);
	       			aidUserByteRedefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setAidUserByte(fillSpace(2));
    }


 

	/**
	 *	Returns the value of aidUserByte
	 *	@return aidUserByte
	 */
   public char[] getAidUserByte() throws CFException{
     if (isAidUserByteModified()) { 
        aidUserByte = refreshAidUserByte();
     }
   		return aidUserByte;
   }

  
	/**
	*  set variable aidUserByte
	*  Corresponding COBOL Variable is AID-USER-BYTE
	*  @param value
	**/
   public void setAidUserByte(char[] value) {
      aidUserByte = checkAidUserByteConstraints(value);
      serializeAidUserByte(aidUserByte);
   } 

     /**
	 * 	Update AidUserByte 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAidUserByte(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAidUserByte,aidUserByte.length);
   	
   }
   
   public void setAidUserByte(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAidUserByte,aidUserByte.length);
   	
   }
   
     /**
	 * 	Update AidUserByte 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAidUserByte(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAidUserByte+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AidUserByte with another Field
	 *	@param value
	 */
   public void setAidUserByte(Field source) {
       replace(source,0,source.length(),beginAidUserByte,AID_USER_BYTE_LEN);
   	
   }  
   
     /**
	 * 	Update AidUserByte 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAidUserByte(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAidUserByte,AID_USER_BYTE_LEN);
   	
   }
   
     /**
	 * 	Update AidUserByte 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAidUserByte(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAidUserByte+targetIndex,targetLen);
    
   }
	char[] dollarCutItem88Value = "92".toCharArray();
	/**
	 *	Test condition "92" for isDollarCutItem()
	 *	@return  Returns true if isDollarCutItem() is "92"
	 */
   public boolean isDollarCutItem() throws CFException {
      return (  compareChars( getAidUserByte() , dollarCutItem88Value)  == 0  );
   }


	/**
	*  set values "92"
	*/
   	public void setDollarCutItemTrue() {  			
    	setAidUserByte( dollarCutItem88Value);
   	}
	/**
	 *	Returns the value of aidUserByteRedefined01
	 *	@return aidUserByteRedefined01
	 */   
	 public AidUserByteRedefined01 getAidUserByteRedefined01() {
   	return aidUserByteRedefined01;
   }
   /**
	* 	Update AidUserByteRedefined01 with the passed value
	*   Corresponding COBOL Variable is AID-USER-BYTE-REDEFINED
	*	@param value
	*/
   public void setAidUserByteRedefined01(char[] value) {
      aidUserByteRedefined01.setString(value); 
   }   
    
     /**
	 * 	Update AidUserByteRedefined01 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAidUserByteRedefined01(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aidUserByteRedefined01.begin,aidUserByteRedefined01.length());
   }
   
     /**
	 * 	Update AidUserByteRedefined01 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAidUserByteRedefined01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aidUserByteRedefined01.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AidUserByteRedefined01 with another Field
	 *	@param value
	 */
   public void setAidUserByteRedefined01(Field source) {
   	replace(source,0,source.length(),aidUserByteRedefined01.begin,aidUserByteRedefined01.length());
   }  
   
     /**
	 * 	Update AidUserByteRedefined01 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAidUserByteRedefined01(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aidUserByteRedefined01.begin,aidUserByteRedefined01.length());
   }
   
     /**
	 * 	Update AidUserByteRedefined01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAidUserByteRedefined01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aidUserByteRedefined01.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aidUserByteRedefined
	 *	@return aidUserByteRedefined
	 */   
	 public AidUserByteRedefined getAidUserByteRedefined() {
   	return aidUserByteRedefined;
   }
   /**
	* 	Update AidUserByteRedefined with the passed value
	*   Corresponding COBOL Variable is AID-USER-BYTE-REDEFINED
	*	@param value
	*/
   public void setAidUserByteRedefined(char[] value) {
      aidUserByteRedefined.setString(value); 
   }   
    
     /**
	 * 	Update AidUserByteRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAidUserByteRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aidUserByteRedefined.begin,aidUserByteRedefined.length());
   }
   
     /**
	 * 	Update AidUserByteRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAidUserByteRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aidUserByteRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AidUserByteRedefined with another Field
	 *	@param value
	 */
   public void setAidUserByteRedefined(Field source) {
   	replace(source,0,source.length(),aidUserByteRedefined.begin,aidUserByteRedefined.length());
   }  
   
     /**
	 * 	Update AidUserByteRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAidUserByteRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aidUserByteRedefined.begin,aidUserByteRedefined.length());
   }
   
     /**
	 * 	Update AidUserByteRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAidUserByteRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aidUserByteRedefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getAidUserByteGroupFieldLength() {
			return AID_USER_BYTE_GROUP_LENGTH;
		}

}
  
