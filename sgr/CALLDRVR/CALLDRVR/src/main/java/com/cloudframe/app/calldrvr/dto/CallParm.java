package com.cloudframe.app.calldrvr.dto;

/**
*  The class CallParm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:09. using version 5.0.0.256
**/


import com.cloudframe.app.calldrvr.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CallParm extends CallParmSerialized {
   
				private ByContent byContent = new ByContent();
				private ByReference byReference = new ByReference();
	
	/**
	* Constructor for CallParm
	**/
    public CallParm() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			byContent.setParent(this,getStartOffset() + 0);
	       			byReference.setParent(this,getStartOffset() + 13);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of byContent
	 *	@return byContent
	 */   
	 public ByContent getByContent() {
   	return byContent;
   }
   /**
	* 	Update ByContent with the passed value
	*   Corresponding COBOL Variable is WS-BY-CONTENT
	*	@param value
	*/
   public void setByContent(char[] value) {
      byContent.setString(value); 
   }   
    
     /**
	 * 	Update ByContent 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setByContent(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,byContent.begin,byContent.length());
   }
   
     /**
	 * 	Update ByContent 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setByContent(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,byContent.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ByContent with another Field
	 *	@param value
	 */
   public void setByContent(Field source) {
   	replace(source,0,source.length(),byContent.begin,byContent.length());
   }  
   
     /**
	 * 	Update ByContent 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setByContent(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,byContent.begin,byContent.length());
   }
   
     /**
	 * 	Update ByContent 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setByContent(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,byContent.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of byReference
	 *	@return byReference
	 */   
	 public ByReference getByReference() {
   	return byReference;
   }
   /**
	* 	Update ByReference with the passed value
	*   Corresponding COBOL Variable is WS-BY-REFERENCE
	*	@param value
	*/
   public void setByReference(char[] value) {
      byReference.setString(value); 
   }   
    
     /**
	 * 	Update ByReference 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setByReference(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,byReference.begin,byReference.length());
   }
   
     /**
	 * 	Update ByReference 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setByReference(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,byReference.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ByReference with another Field
	 *	@param value
	 */
   public void setByReference(Field source) {
   	replace(source,0,source.length(),byReference.begin,byReference.length());
   }  
   
     /**
	 * 	Update ByReference 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setByReference(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,byReference.begin,byReference.length());
   }
   
     /**
	 * 	Update ByReference 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setByReference(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,byReference.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCallParmFieldLength() {
			return CALL_PARM_LENGTH;
		}

}
  
