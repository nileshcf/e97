package com.cloudframe.app.refmod3.dto;

/**
*  The class BTGrp218 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BTGrp218 extends BTGrp218Serialized {
   
				private BT218 bT218 = new BT218();
	
	/**
	* Constructor for BTGrp218
	**/
    public BTGrp218() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bT218.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bT218
	 *	@return bT218
	 */   
	 public BT218 getBT218() {
   	return bT218;
   }
   /**
	* 	Update BT218 with the passed value
	*   Corresponding COBOL Variable is WS-2-18B-T
	*	@param value
	*/
   public void setBT218(char[] value) {
      bT218.setString(value); 
   }   
    
     /**
	 * 	Update BT218 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT218(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT218.begin,bT218.length());
   }
   
     /**
	 * 	Update BT218 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT218(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT218.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT218 with another Field
	 *	@param value
	 */
   public void setBT218(Field source) {
   	replace(source,0,source.length(),bT218.begin,bT218.length());
   }  
   
     /**
	 * 	Update BT218 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT218(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT218.begin,bT218.length());
   }
   
     /**
	 * 	Update BT218 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT218(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT218.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBTGrp218FieldLength() {
			return B_TGRP_218_LENGTH;
		}

}
  
