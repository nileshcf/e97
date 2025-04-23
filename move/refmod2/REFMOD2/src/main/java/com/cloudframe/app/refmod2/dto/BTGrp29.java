package com.cloudframe.app.refmod2.dto;

/**
*  The class BTGrp29 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BTGrp29 extends BTGrp29Serialized {
   
				private BT29 bT29 = new BT29();
	
	/**
	* Constructor for BTGrp29
	**/
    public BTGrp29() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bT29.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bT29
	 *	@return bT29
	 */   
	 public BT29 getBT29() {
   	return bT29;
   }
   /**
	* 	Update BT29 with the passed value
	*   Corresponding COBOL Variable is WS-2-9B-T
	*	@param value
	*/
   public void setBT29(char[] value) {
      bT29.setString(value); 
   }   
    
     /**
	 * 	Update BT29 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT29(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT29.begin,bT29.length());
   }
   
     /**
	 * 	Update BT29 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT29(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT29.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT29 with another Field
	 *	@param value
	 */
   public void setBT29(Field source) {
   	replace(source,0,source.length(),bT29.begin,bT29.length());
   }  
   
     /**
	 * 	Update BT29 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT29(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT29.begin,bT29.length());
   }
   
     /**
	 * 	Update BT29 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT29(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT29.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBTGrp29FieldLength() {
			return B_TGRP_29_LENGTH;
		}

}
  
