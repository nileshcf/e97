package com.cloudframe.app.refmod2.dto;

/**
*  The class BTGrp212 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BTGrp212 extends BTGrp212Serialized {
   
				private BT212 bT212 = new BT212();
	
	/**
	* Constructor for BTGrp212
	**/
    public BTGrp212() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bT212.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bT212
	 *	@return bT212
	 */   
	 public BT212 getBT212() {
   	return bT212;
   }
   /**
	* 	Update BT212 with the passed value
	*   Corresponding COBOL Variable is WS-2-12B-T
	*	@param value
	*/
   public void setBT212(char[] value) {
      bT212.setString(value); 
   }   
    
     /**
	 * 	Update BT212 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT212(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT212.begin,bT212.length());
   }
   
     /**
	 * 	Update BT212 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT212(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT212.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT212 with another Field
	 *	@param value
	 */
   public void setBT212(Field source) {
   	replace(source,0,source.length(),bT212.begin,bT212.length());
   }  
   
     /**
	 * 	Update BT212 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT212(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT212.begin,bT212.length());
   }
   
     /**
	 * 	Update BT212 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT212(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT212.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBTGrp212FieldLength() {
			return B_TGRP_212_LENGTH;
		}

}
  
