package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse28bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse28bTGrp extends Wse28bTGrpSerialized {
   
				private Wse28bT wse28bT = new Wse28bT();
	
	/**
	* Constructor for Wse28bTGrp
	**/
    public Wse28bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse28bT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse28bT
	 *	@return wse28bT
	 */   
	 public Wse28bT getWse28bT() {
   	return wse28bT;
   }
   /**
	* 	Update Wse28bT with the passed value
	*   Corresponding COBOL Variable is WSE-2-8B-T
	*	@param value
	*/
   public void setWse28bT(char[] value) {
      wse28bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse28bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse28bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse28bT.begin,wse28bT.length());
   }
   
     /**
	 * 	Update Wse28bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse28bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse28bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse28bT with another Field
	 *	@param value
	 */
   public void setWse28bT(Field source) {
   	replace(source,0,source.length(),wse28bT.begin,wse28bT.length());
   }  
   
     /**
	 * 	Update Wse28bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse28bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse28bT.begin,wse28bT.length());
   }
   
     /**
	 * 	Update Wse28bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse28bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse28bT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse28bTGrpFieldLength() {
			return WSE_28B_TGRP_LENGTH;
		}

}
  
