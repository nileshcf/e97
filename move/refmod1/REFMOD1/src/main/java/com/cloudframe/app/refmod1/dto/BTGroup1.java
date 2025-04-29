package com.cloudframe.app.refmod1.dto;

/**
*  The class BTGroup1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BTGroup1 extends BTGroup1Serialized {
   
					private BT1 bT1 = new BT1();

						private char[] bTR1 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGroup1
	**/
    public BTGroup1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bT1.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bT1
	 *	@return bT1
	 */   
	 public BT1 getBT1() {
   	return bT1;
   }
   /**
	* 	Update BT1 with the passed value
	*   Corresponding COBOL Variable is WS-1B-T
	*	@param value
	*/
   public void setBT1(char[] value) {
      bT1.setString(value); 
   }   
    
     /**
	 * 	Update BT1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT1(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT1.begin,bT1.length());
   }
   
     /**
	 * 	Update BT1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT1.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT1 with another Field
	 *	@param value
	 */
   public void setBT1(Field source) {
   	replace(source,0,source.length(),bT1.begin,bT1.length());
   }  
   
     /**
	 * 	Update BT1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT1(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT1.begin,bT1.length());
   }
   
     /**
	 * 	Update BT1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT1.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTR1
	 *	@return bTR1
	 */
   public char[] getBTR1() throws CFException{
     if (isBTR1Modified()) { 
        bTR1 = refreshBTR1();
     }
   		return bTR1;
   }

  
	/**
	*  set variable bTR1
	*  Corresponding COBOL Variable is WS-1B-T-R
	*  @param value
	**/
   public void setBTR1(char[] value) {
      bTR1 = checkBTR1Constraints(value);
      serializeBTR1(bTR1);
   } 

     /**
	 * 	Update BTR1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTR1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTR1,bTR1.length);
   	
   }
   
   public void setBTR1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTR1,bTR1.length);
   	
   }
   
     /**
	 * 	Update BTR1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTR1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTR1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTR1 with another Field
	 *	@param value
	 */
   public void setBTR1(Field source) {
       replace(source,0,source.length(),beginBTR1,B_TR_1_LEN);
   	
   }  
   
     /**
	 * 	Update BTR1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTR1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTR1,B_TR_1_LEN);
   	
   }
   
     /**
	 * 	Update BTR1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTR1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTR1+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGroup1FieldLength() {
			return B_TGROUP_1_LENGTH;
		}

}
  
