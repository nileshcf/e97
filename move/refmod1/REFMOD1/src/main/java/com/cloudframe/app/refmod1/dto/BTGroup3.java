package com.cloudframe.app.refmod1.dto;

/**
*  The class BTGroup3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BTGroup3 extends BTGroup3Serialized { 
   
					private BT3 bT3 = new BT3();

						private char[] bTR3 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGroup3
	**/
    public BTGroup3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bT3.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bT3
	 *	@return bT3
	 */   
	 public BT3 getBT3() {
   	return bT3;
   }
   /**
	* 	Update BT3 with the passed value
	*   Corresponding COBOL Variable is WS-3B-T
	*	@param value
	*/
   public void setBT3(char[] value) {
      bT3.setString(value); 
   }   
    
     /**
	 * 	Update BT3 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT3(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT3.begin,bT3.length());
   }
   
     /**
	 * 	Update BT3 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT3.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT3 with another Field
	 *	@param value
	 */
   public void setBT3(Field source) {
   	replace(source,0,source.length(),bT3.begin,bT3.length());
   }  
   
     /**
	 * 	Update BT3 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT3(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT3.begin,bT3.length());
   }
   
     /**
	 * 	Update BT3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT3.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTR3
	 *	@return bTR3
	 */
   public char[] getBTR3() throws CFException{
     if (isBTR3Modified()) { 
        bTR3 = refreshBTR3();
     }
   		return bTR3;
   }

  
	/**
	*  set variable bTR3
	*  Corresponding COBOL Variable is WS-3B-T-R
	*  @param value
	**/
   public void setBTR3(char[] value) {
      bTR3 = checkBTR3Constraints(value);
      serializeBTR3(bTR3);
   } 

     /**
	 * 	Update BTR3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTR3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTR3,bTR3.length);
   	
   }
   
   public void setBTR3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTR3,bTR3.length);
   	
   }
   
     /**
	 * 	Update BTR3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTR3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTR3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTR3 with another Field
	 *	@param value
	 */
   public void setBTR3(Field source) {
       replace(source,0,source.length(),beginBTR3,B_TR_3_LEN);
   	
   }  
   
     /**
	 * 	Update BTR3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTR3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTR3,B_TR_3_LEN);
   	
   }
   
     /**
	 * 	Update BTR3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTR3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTR3+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGroup3FieldLength() {
			return B_TGROUP_3_LENGTH;
		}

}
  
