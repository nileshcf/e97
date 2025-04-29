package com.cloudframe.app.refmod2.dto;

/**
*  The class BTGrp213 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BTGrp213 extends BTGrp213Serialized {
   
				private BT213 bT213 = new BT213();
	
	/**
	* Constructor for BTGrp213
	**/
    public BTGrp213() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bT213.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bT213
	 *	@return bT213
	 */   
	 public BT213 getBT213() {
   	return bT213;
   }
   /**
	* 	Update BT213 with the passed value
	*   Corresponding COBOL Variable is WS-2-13B-T
	*	@param value
	*/
   public void setBT213(char[] value) {
      bT213.setString(value); 
   }   
    
     /**
	 * 	Update BT213 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT213(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT213.begin,bT213.length());
   }
   
     /**
	 * 	Update BT213 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT213(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT213.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT213 with another Field
	 *	@param value
	 */
   public void setBT213(Field source) {
   	replace(source,0,source.length(),bT213.begin,bT213.length());
   }  
   
     /**
	 * 	Update BT213 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT213(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT213.begin,bT213.length());
   }
   
     /**
	 * 	Update BT213 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT213(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT213.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBTGrp213FieldLength() {
			return B_TGRP_213_LENGTH;
		}

}
  
