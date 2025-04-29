package com.cloudframe.app.refmod2.dto;

/**
*  The class BTGrp27 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BTGrp27 extends BTGrp27Serialized {
   
				private BT27 bT27 = new BT27();
	
	/**
	* Constructor for BTGrp27
	**/
    public BTGrp27() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bT27.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bT27
	 *	@return bT27
	 */   
	 public BT27 getBT27() {
   	return bT27;
   }
   /**
	* 	Update BT27 with the passed value
	*   Corresponding COBOL Variable is WS-2-7B-T
	*	@param value
	*/
   public void setBT27(char[] value) {
      bT27.setString(value); 
   }   
    
     /**
	 * 	Update BT27 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT27(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT27.begin,bT27.length());
   }
   
     /**
	 * 	Update BT27 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT27(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT27.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT27 with another Field
	 *	@param value
	 */
   public void setBT27(Field source) {
   	replace(source,0,source.length(),bT27.begin,bT27.length());
   }  
   
     /**
	 * 	Update BT27 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT27(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT27.begin,bT27.length());
   }
   
     /**
	 * 	Update BT27 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT27(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT27.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBTGrp27FieldLength() {
			return B_TGRP_27_LENGTH;
		}

}
  
