package com.cloudframe.app.refmod3.dto;

/**
*  The class BTGrp210 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BTGrp210 extends BTGrp210Serialized {
   
				private BT210 bT210 = new BT210();
	
	/**
	* Constructor for BTGrp210
	**/
    public BTGrp210() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bT210.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bT210
	 *	@return bT210
	 */   
	 public BT210 getBT210() {
   	return bT210;
   }
   /**
	* 	Update BT210 with the passed value
	*   Corresponding COBOL Variable is WS-2-10B-T
	*	@param value
	*/
   public void setBT210(char[] value) {
      bT210.setString(value); 
   }   
    
     /**
	 * 	Update BT210 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT210(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT210.begin,bT210.length());
   }
   
     /**
	 * 	Update BT210 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT210(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT210.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT210 with another Field
	 *	@param value
	 */
   public void setBT210(Field source) {
   	replace(source,0,source.length(),bT210.begin,bT210.length());
   }  
   
     /**
	 * 	Update BT210 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT210(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT210.begin,bT210.length());
   }
   
     /**
	 * 	Update BT210 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT210(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT210.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBTGrp210FieldLength() {
			return B_TGRP_210_LENGTH;
		}

}
  
