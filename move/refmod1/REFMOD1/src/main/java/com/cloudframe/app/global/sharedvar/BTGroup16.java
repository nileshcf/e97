package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGroup16 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGroup16")

public class BTGroup16 extends BTGroup16Serialized  implements InitializingBean {
   
					private BT16 bT16 = new BT16();

						private char[] bTR16 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGroup16
	**/
    public BTGroup16() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			bT16.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of bT16
	 *	@return bT16
	 */   
	 public BT16 getBT16() {
   	return bT16;
   }
   /**
	* 	Update BT16 with the passed value
	*   Corresponding COBOL Variable is WS-16B-T
	*	@param value
	*/
   public void setBT16(char[] value) {
      bT16.setString(value); 
   }   
    
     /**
	 * 	Update BT16 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT16(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT16.begin,bT16.length());
   }
   
     /**
	 * 	Update BT16 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT16(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT16.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT16 with another Field
	 *	@param value
	 */
   public void setBT16(Field source) {
   	replace(source,0,source.length(),bT16.begin,bT16.length());
   }  
   
     /**
	 * 	Update BT16 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT16(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT16.begin,bT16.length());
   }
   
     /**
	 * 	Update BT16 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT16(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT16.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTR16
	 *	@return bTR16
	 */
   public char[] getBTR16() throws CFException{
     if (isBTR16Modified()) { 
        bTR16 = refreshBTR16();
     }
   		return bTR16;
   }

  
	/**
	*  set variable bTR16
	*  Corresponding COBOL Variable is WS-16B-T-R
	*  @param value
	**/
   public void setBTR16(char[] value) {
      bTR16 = checkBTR16Constraints(value);
      serializeBTR16(bTR16);
   } 

     /**
	 * 	Update BTR16 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTR16(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTR16,bTR16.length);
   	
   }
   
   public void setBTR16(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTR16,bTR16.length);
   	
   }
   
     /**
	 * 	Update BTR16 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTR16(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTR16+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTR16 with another Field
	 *	@param value
	 */
   public void setBTR16(Field source) {
       replace(source,0,source.length(),beginBTR16,B_TR_16_LEN);
   	
   }  
   
     /**
	 * 	Update BTR16 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTR16(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTR16,B_TR_16_LEN);
   	
   }
   
     /**
	 * 	Update BTR16 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTR16(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTR16+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGroup16FieldLength() {
			return B_TGROUP_16_LENGTH;
		}

}
  
