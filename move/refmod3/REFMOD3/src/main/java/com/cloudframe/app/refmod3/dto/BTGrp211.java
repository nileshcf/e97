package com.cloudframe.app.refmod3.dto;

/**
*  The class BTGrp211 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BTGrp211 extends BTGrp211Serialized {
   
				private BT211 bT211 = new BT211();
	
	/**
	* Constructor for BTGrp211
	**/
    public BTGrp211() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bT211.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bT211
	 *	@return bT211
	 */   
	 public BT211 getBT211() {
   	return bT211;
   }
   /**
	* 	Update BT211 with the passed value
	*   Corresponding COBOL Variable is WS-2-11B-T
	*	@param value
	*/
   public void setBT211(char[] value) {
      bT211.setString(value); 
   }   
    
     /**
	 * 	Update BT211 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT211(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT211.begin,bT211.length());
   }
   
     /**
	 * 	Update BT211 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT211(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT211.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT211 with another Field
	 *	@param value
	 */
   public void setBT211(Field source) {
   	replace(source,0,source.length(),bT211.begin,bT211.length());
   }  
   
     /**
	 * 	Update BT211 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT211(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT211.begin,bT211.length());
   }
   
     /**
	 * 	Update BT211 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT211(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT211.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBTGrp211FieldLength() {
			return B_TGRP_211_LENGTH;
		}

}
  
