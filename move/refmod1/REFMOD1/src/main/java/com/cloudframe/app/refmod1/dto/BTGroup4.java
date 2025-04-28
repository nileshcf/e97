package com.cloudframe.app.refmod1.dto;

/**
*  The class BTGroup4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BTGroup4 extends BTGroup4Serialized {
   
					private BT4 bT4 = new BT4();

						private char[] bTR4 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGroup4
	**/
    public BTGroup4() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bT4.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bT4
	 *	@return bT4
	 */   
	 public BT4 getBT4() {
   	return bT4;
   }
   /**
	* 	Update BT4 with the passed value
	*   Corresponding COBOL Variable is WS-4B-T
	*	@param value
	*/
   public void setBT4(char[] value) {
      bT4.setString(value); 
   }   
    
     /**
	 * 	Update BT4 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT4(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT4.begin,bT4.length());
   }
   
     /**
	 * 	Update BT4 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT4.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT4 with another Field
	 *	@param value
	 */
   public void setBT4(Field source) {
   	replace(source,0,source.length(),bT4.begin,bT4.length());
   }  
   
     /**
	 * 	Update BT4 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT4(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT4.begin,bT4.length());
   }
   
     /**
	 * 	Update BT4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT4.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTR4
	 *	@return bTR4
	 */
   public char[] getBTR4() throws CFException{
     if (isBTR4Modified()) { 
        bTR4 = refreshBTR4();
     }
   		return bTR4;
   }

  
	/**
	*  set variable bTR4
	*  Corresponding COBOL Variable is WS-4B-T-R
	*  @param value
	**/
   public void setBTR4(char[] value) {
      bTR4 = checkBTR4Constraints(value);
      serializeBTR4(bTR4);
   } 

     /**
	 * 	Update BTR4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTR4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTR4,bTR4.length);
   	
   }
   
   public void setBTR4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTR4,bTR4.length);
   	
   }
   
     /**
	 * 	Update BTR4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTR4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTR4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTR4 with another Field
	 *	@param value
	 */
   public void setBTR4(Field source) {
       replace(source,0,source.length(),beginBTR4,B_TR_4_LEN);
   	
   }  
   
     /**
	 * 	Update BTR4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTR4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTR4,B_TR_4_LEN);
   	
   }
   
     /**
	 * 	Update BTR4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTR4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTR4+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGroup4FieldLength() {
			return B_TGROUP_4_LENGTH;
		}

}
  
