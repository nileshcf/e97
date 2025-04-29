package com.cloudframe.app.refmod3.dto;

/**
*  The class BTGrp220 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BTGrp220 extends BTGrp220Serialized {
   
				private BT220 bT220 = new BT220();
	
	/**
	* Constructor for BTGrp220
	**/
    public BTGrp220() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bT220.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bT220
	 *	@return bT220
	 */   
	 public BT220 getBT220() {
   	return bT220;
   }
   /**
	* 	Update BT220 with the passed value
	*   Corresponding COBOL Variable is WS-2-20B-T
	*	@param value
	*/
   public void setBT220(char[] value) {
      bT220.setString(value); 
   }   
    
     /**
	 * 	Update BT220 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT220(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT220.begin,bT220.length());
   }
   
     /**
	 * 	Update BT220 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT220(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT220.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT220 with another Field
	 *	@param value
	 */
   public void setBT220(Field source) {
   	replace(source,0,source.length(),bT220.begin,bT220.length());
   }  
   
     /**
	 * 	Update BT220 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT220(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT220.begin,bT220.length());
   }
   
     /**
	 * 	Update BT220 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT220(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT220.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBTGrp220FieldLength() {
			return B_TGRP_220_LENGTH;
		}

}
  
