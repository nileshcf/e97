package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGroup5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGroup5")

public class BTGroup5 extends BTGroup5Serialized  implements InitializingBean {
   
					private BT5 bT5 = new BT5();

						private char[] bTR5 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGroup5
	**/
    public BTGroup5() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			bT5.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of bT5
	 *	@return bT5
	 */   
	 public BT5 getBT5() {
   	return bT5;
   }
   /**
	* 	Update BT5 with the passed value
	*   Corresponding COBOL Variable is WS-5B-T
	*	@param value
	*/
   public void setBT5(char[] value) {
      bT5.setString(value); 
   }   
    
     /**
	 * 	Update BT5 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT5(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT5.begin,bT5.length());
   }
   
     /**
	 * 	Update BT5 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT5.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT5 with another Field
	 *	@param value
	 */
   public void setBT5(Field source) {
   	replace(source,0,source.length(),bT5.begin,bT5.length());
   }  
   
     /**
	 * 	Update BT5 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT5(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT5.begin,bT5.length());
   }
   
     /**
	 * 	Update BT5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT5.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTR5
	 *	@return bTR5
	 */
   public char[] getBTR5() throws CFException{
     if (isBTR5Modified()) { 
        bTR5 = refreshBTR5();
     }
   		return bTR5;
   }

  
	/**
	*  set variable bTR5
	*  Corresponding COBOL Variable is WS-5B-T-R
	*  @param value
	**/
   public void setBTR5(char[] value) {
      bTR5 = checkBTR5Constraints(value);
      serializeBTR5(bTR5);
   } 

     /**
	 * 	Update BTR5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTR5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTR5,bTR5.length);
   	
   }
   
   public void setBTR5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTR5,bTR5.length);
   	
   }
   
     /**
	 * 	Update BTR5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTR5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTR5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTR5 with another Field
	 *	@param value
	 */
   public void setBTR5(Field source) {
       replace(source,0,source.length(),beginBTR5,B_TR_5_LEN);
   	
   }  
   
     /**
	 * 	Update BTR5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTR5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTR5,B_TR_5_LEN);
   	
   }
   
     /**
	 * 	Update BTR5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTR5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTR5+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGroup5FieldLength() {
			return B_TGROUP_5_LENGTH;
		}

}
  
