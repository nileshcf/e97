package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse210bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse210bTGrp extends Wse210bTGrpSerialized {
   
				private Wse210bT wse210bT = new Wse210bT();
	
	/**
	* Constructor for Wse210bTGrp
	**/
    public Wse210bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse210bT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse210bT
	 *	@return wse210bT
	 */   
	 public Wse210bT getWse210bT() {
   	return wse210bT;
   }
   /**
	* 	Update Wse210bT with the passed value
	*   Corresponding COBOL Variable is WSE-2-10B-T
	*	@param value
	*/
   public void setWse210bT(char[] value) {
      wse210bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse210bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse210bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse210bT.begin,wse210bT.length());
   }
   
     /**
	 * 	Update Wse210bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse210bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse210bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse210bT with another Field
	 *	@param value
	 */
   public void setWse210bT(Field source) {
   	replace(source,0,source.length(),wse210bT.begin,wse210bT.length());
   }  
   
     /**
	 * 	Update Wse210bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse210bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse210bT.begin,wse210bT.length());
   }
   
     /**
	 * 	Update Wse210bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse210bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse210bT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse210bTGrpFieldLength() {
			return WSE_210B_TGRP_LENGTH;
		}

}
  
