package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGroup15 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGroup15")

public class BTGroup15 extends BTGroup15Serialized  implements InitializingBean {
   
					private BT15 bT15 = new BT15();

						private char[] bTR15 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGroup15
	**/
    public BTGroup15() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			bT15.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of bT15
	 *	@return bT15
	 */   
	 public BT15 getBT15() {
   	return bT15;
   }
   /**
	* 	Update BT15 with the passed value
	*   Corresponding COBOL Variable is WS-15B-T
	*	@param value
	*/
   public void setBT15(char[] value) {
      bT15.setString(value); 
   }   
    
     /**
	 * 	Update BT15 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT15(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT15.begin,bT15.length());
   }
   
     /**
	 * 	Update BT15 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT15.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT15 with another Field
	 *	@param value
	 */
   public void setBT15(Field source) {
   	replace(source,0,source.length(),bT15.begin,bT15.length());
   }  
   
     /**
	 * 	Update BT15 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT15(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT15.begin,bT15.length());
   }
   
     /**
	 * 	Update BT15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT15.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTR15
	 *	@return bTR15
	 */
   public char[] getBTR15() throws CFException{
     if (isBTR15Modified()) { 
        bTR15 = refreshBTR15();
     }
   		return bTR15;
   }

  
	/**
	*  set variable bTR15
	*  Corresponding COBOL Variable is WS-15B-T-R
	*  @param value
	**/
   public void setBTR15(char[] value) {
      bTR15 = checkBTR15Constraints(value);
      serializeBTR15(bTR15);
   } 

     /**
	 * 	Update BTR15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTR15(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTR15,bTR15.length);
   	
   }
   
   public void setBTR15(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTR15,bTR15.length);
   	
   }
   
     /**
	 * 	Update BTR15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTR15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTR15+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTR15 with another Field
	 *	@param value
	 */
   public void setBTR15(Field source) {
       replace(source,0,source.length(),beginBTR15,B_TR_15_LEN);
   	
   }  
   
     /**
	 * 	Update BTR15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTR15(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTR15,B_TR_15_LEN);
   	
   }
   
     /**
	 * 	Update BTR15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTR15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTR15+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGroup15FieldLength() {
			return B_TGROUP_15_LENGTH;
		}

}
  
