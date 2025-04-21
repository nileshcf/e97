package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse211bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse211bTGrp extends Wse211bTGrpSerialized {
   
				private Wse211bT wse211bT = new Wse211bT();
	
	/**
	* Constructor for Wse211bTGrp
	**/
    public Wse211bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse211bT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse211bT
	 *	@return wse211bT
	 */   
	 public Wse211bT getWse211bT() {
   	return wse211bT;
   }
   /**
	* 	Update Wse211bT with the passed value
	*   Corresponding COBOL Variable is WSE-2-11B-T
	*	@param value
	*/
   public void setWse211bT(char[] value) {
      wse211bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse211bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse211bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse211bT.begin,wse211bT.length());
   }
   
     /**
	 * 	Update Wse211bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse211bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse211bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse211bT with another Field
	 *	@param value
	 */
   public void setWse211bT(Field source) {
   	replace(source,0,source.length(),wse211bT.begin,wse211bT.length());
   }  
   
     /**
	 * 	Update Wse211bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse211bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse211bT.begin,wse211bT.length());
   }
   
     /**
	 * 	Update Wse211bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse211bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse211bT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse211bTGrpFieldLength() {
			return WSE_211B_TGRP_LENGTH;
		}

}
  
