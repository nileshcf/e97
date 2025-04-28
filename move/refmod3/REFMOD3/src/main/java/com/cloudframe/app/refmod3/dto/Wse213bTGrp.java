package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse213bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse213bTGrp extends Wse213bTGrpSerialized {
   
				private Wse213bT wse213bT = new Wse213bT();
	
	/**
	* Constructor for Wse213bTGrp
	**/
    public Wse213bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse213bT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse213bT
	 *	@return wse213bT
	 */   
	 public Wse213bT getWse213bT() {
   	return wse213bT;
   }
   /**
	* 	Update Wse213bT with the passed value
	*   Corresponding COBOL Variable is WSE-2-13B-T
	*	@param value
	*/
   public void setWse213bT(char[] value) {
      wse213bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse213bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse213bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse213bT.begin,wse213bT.length());
   }
   
     /**
	 * 	Update Wse213bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse213bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse213bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse213bT with another Field
	 *	@param value
	 */
   public void setWse213bT(Field source) {
   	replace(source,0,source.length(),wse213bT.begin,wse213bT.length());
   }  
   
     /**
	 * 	Update Wse213bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse213bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse213bT.begin,wse213bT.length());
   }
   
     /**
	 * 	Update Wse213bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse213bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse213bT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse213bTGrpFieldLength() {
			return WSE_213B_TGRP_LENGTH;
		}

}
  
