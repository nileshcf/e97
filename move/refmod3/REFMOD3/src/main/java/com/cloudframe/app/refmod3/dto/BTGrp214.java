package com.cloudframe.app.refmod3.dto;

/**
*  The class BTGrp214 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BTGrp214 extends BTGrp214Serialized {
   
				private BT214 bT214 = new BT214();
	
	/**
	* Constructor for BTGrp214
	**/
    public BTGrp214() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bT214.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bT214
	 *	@return bT214
	 */   
	 public BT214 getBT214() {
   	return bT214;
   }
   /**
	* 	Update BT214 with the passed value
	*   Corresponding COBOL Variable is WS-2-14B-T
	*	@param value
	*/
   public void setBT214(char[] value) {
      bT214.setString(value); 
   }   
    
     /**
	 * 	Update BT214 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT214(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT214.begin,bT214.length());
   }
   
     /**
	 * 	Update BT214 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT214(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT214.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT214 with another Field
	 *	@param value
	 */
   public void setBT214(Field source) {
   	replace(source,0,source.length(),bT214.begin,bT214.length());
   }  
   
     /**
	 * 	Update BT214 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT214(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT214.begin,bT214.length());
   }
   
     /**
	 * 	Update BT214 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT214(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT214.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBTGrp214FieldLength() {
			return B_TGRP_214_LENGTH;
		}

}
  
