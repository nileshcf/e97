package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGroup6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGroup6")

public class BTGroup6 extends BTGroup6Serialized  implements InitializingBean {
   
					private BT6 bT6 = new BT6();

						private char[] bTR6 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGroup6
	**/
    public BTGroup6() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			bT6.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of bT6
	 *	@return bT6
	 */   
	 public BT6 getBT6() {
   	return bT6;
   }
   /**
	* 	Update BT6 with the passed value
	*   Corresponding COBOL Variable is WS-6B-T
	*	@param value
	*/
   public void setBT6(char[] value) {
      bT6.setString(value); 
   }   
    
     /**
	 * 	Update BT6 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT6(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT6.begin,bT6.length());
   }
   
     /**
	 * 	Update BT6 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT6.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT6 with another Field
	 *	@param value
	 */
   public void setBT6(Field source) {
   	replace(source,0,source.length(),bT6.begin,bT6.length());
   }  
   
     /**
	 * 	Update BT6 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT6(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT6.begin,bT6.length());
   }
   
     /**
	 * 	Update BT6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT6.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTR6
	 *	@return bTR6
	 */
   public char[] getBTR6() throws CFException{
     if (isBTR6Modified()) { 
        bTR6 = refreshBTR6();
     }
   		return bTR6;
   }

  
	/**
	*  set variable bTR6
	*  Corresponding COBOL Variable is WS-6B-T-R
	*  @param value
	**/
   public void setBTR6(char[] value) {
      bTR6 = checkBTR6Constraints(value);
      serializeBTR6(bTR6);
   } 

     /**
	 * 	Update BTR6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTR6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTR6,bTR6.length);
   	
   }
   
   public void setBTR6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTR6,bTR6.length);
   	
   }
   
     /**
	 * 	Update BTR6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTR6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTR6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTR6 with another Field
	 *	@param value
	 */
   public void setBTR6(Field source) {
       replace(source,0,source.length(),beginBTR6,B_TR_6_LEN);
   	
   }  
   
     /**
	 * 	Update BTR6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTR6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTR6,B_TR_6_LEN);
   	
   }
   
     /**
	 * 	Update BTR6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTR6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTR6+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGroup6FieldLength() {
			return B_TGROUP_6_LENGTH;
		}

}
  
