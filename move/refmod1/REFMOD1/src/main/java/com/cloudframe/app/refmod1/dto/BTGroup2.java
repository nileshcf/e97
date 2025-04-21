package com.cloudframe.app.refmod1.dto;

/**
*  The class BTGroup2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BTGroup2 extends BTGroup2Serialized {
   
					private BT2 bT2 = new BT2();

						private char[] bTR2 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGroup2
	**/
    public BTGroup2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bT2.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bT2
	 *	@return bT2
	 */   
	 public BT2 getBT2() {
   	return bT2;
   }
   /**
	* 	Update BT2 with the passed value
	*   Corresponding COBOL Variable is WS-2B-T
	*	@param value
	*/
   public void setBT2(char[] value) {
      bT2.setString(value); 
   }   
    
     /**
	 * 	Update BT2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT2(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT2.begin,bT2.length());
   }
   
     /**
	 * 	Update BT2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT2.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT2 with another Field
	 *	@param value
	 */
   public void setBT2(Field source) {
   	replace(source,0,source.length(),bT2.begin,bT2.length());
   }  
   
     /**
	 * 	Update BT2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT2(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT2.begin,bT2.length());
   }
   
     /**
	 * 	Update BT2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT2.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTR2
	 *	@return bTR2
	 */
   public char[] getBTR2() throws CFException{
     if (isBTR2Modified()) { 
        bTR2 = refreshBTR2();
     }
   		return bTR2;
   }

  
	/**
	*  set variable bTR2
	*  Corresponding COBOL Variable is WS-2B-T-R
	*  @param value
	**/
   public void setBTR2(char[] value) {
      bTR2 = checkBTR2Constraints(value);
      serializeBTR2(bTR2);
   } 

     /**
	 * 	Update BTR2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTR2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTR2,bTR2.length);
   	
   }
   
   public void setBTR2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTR2,bTR2.length);
   	
   }
   
     /**
	 * 	Update BTR2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTR2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTR2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTR2 with another Field
	 *	@param value
	 */
   public void setBTR2(Field source) {
       replace(source,0,source.length(),beginBTR2,B_TR_2_LEN);
   	
   }  
   
     /**
	 * 	Update BTR2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTR2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTR2,B_TR_2_LEN);
   	
   }
   
     /**
	 * 	Update BTR2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTR2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTR2+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGroup2FieldLength() {
			return B_TGROUP_2_LENGTH;
		}

}
  
