package com.cloudframe.app.refmod3.dto;

/**
*  The class BTGrp28 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BTGrp28 extends BTGrp28Serialized {
   
				private BT28 bT28 = new BT28();
	
	/**
	* Constructor for BTGrp28
	**/
    public BTGrp28() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bT28.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bT28
	 *	@return bT28
	 */   
	 public BT28 getBT28() {
   	return bT28;
   }
   /**
	* 	Update BT28 with the passed value
	*   Corresponding COBOL Variable is WS-2-8B-T
	*	@param value
	*/
   public void setBT28(char[] value) {
      bT28.setString(value); 
   }   
    
     /**
	 * 	Update BT28 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT28(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT28.begin,bT28.length());
   }
   
     /**
	 * 	Update BT28 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT28(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT28.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT28 with another Field
	 *	@param value
	 */
   public void setBT28(Field source) {
   	replace(source,0,source.length(),bT28.begin,bT28.length());
   }  
   
     /**
	 * 	Update BT28 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT28(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT28.begin,bT28.length());
   }
   
     /**
	 * 	Update BT28 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT28(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT28.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBTGrp28FieldLength() {
			return B_TGRP_28_LENGTH;
		}

}
  
