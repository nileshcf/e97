package com.cloudframe.app.refmod3.dto;

/**
*  The class BTGrp219 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BTGrp219 extends BTGrp219Serialized {
   
				private BT219 bT219 = new BT219();
	
	/**
	* Constructor for BTGrp219
	**/
    public BTGrp219() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bT219.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bT219
	 *	@return bT219
	 */   
	 public BT219 getBT219() {
   	return bT219;
   }
   /**
	* 	Update BT219 with the passed value
	*   Corresponding COBOL Variable is WS-2-19B-T
	*	@param value
	*/
   public void setBT219(char[] value) {
      bT219.setString(value); 
   }   
    
     /**
	 * 	Update BT219 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT219(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT219.begin,bT219.length());
   }
   
     /**
	 * 	Update BT219 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT219(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT219.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT219 with another Field
	 *	@param value
	 */
   public void setBT219(Field source) {
   	replace(source,0,source.length(),bT219.begin,bT219.length());
   }  
   
     /**
	 * 	Update BT219 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT219(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT219.begin,bT219.length());
   }
   
     /**
	 * 	Update BT219 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT219(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT219.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBTGrp219FieldLength() {
			return B_TGRP_219_LENGTH;
		}

}
  
