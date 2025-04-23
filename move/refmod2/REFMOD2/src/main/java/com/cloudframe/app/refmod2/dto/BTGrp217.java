package com.cloudframe.app.refmod2.dto;

/**
*  The class BTGrp217 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BTGrp217 extends BTGrp217Serialized {
   
				private BT217 bT217 = new BT217();
	
	/**
	* Constructor for BTGrp217
	**/
    public BTGrp217() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bT217.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bT217
	 *	@return bT217
	 */   
	 public BT217 getBT217() {
   	return bT217;
   }
   /**
	* 	Update BT217 with the passed value
	*   Corresponding COBOL Variable is WS-2-17B-T
	*	@param value
	*/
   public void setBT217(char[] value) {
      bT217.setString(value); 
   }   
    
     /**
	 * 	Update BT217 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT217(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT217.begin,bT217.length());
   }
   
     /**
	 * 	Update BT217 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT217(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT217.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT217 with another Field
	 *	@param value
	 */
   public void setBT217(Field source) {
   	replace(source,0,source.length(),bT217.begin,bT217.length());
   }  
   
     /**
	 * 	Update BT217 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT217(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT217.begin,bT217.length());
   }
   
     /**
	 * 	Update BT217 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT217(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT217.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBTGrp217FieldLength() {
			return B_TGRP_217_LENGTH;
		}

}
  
