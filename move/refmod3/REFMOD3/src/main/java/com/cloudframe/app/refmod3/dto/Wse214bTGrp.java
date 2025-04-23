package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse214bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse214bTGrp extends Wse214bTGrpSerialized {
   
				private Wse214bT wse214bT = new Wse214bT();
	
	/**
	* Constructor for Wse214bTGrp
	**/
    public Wse214bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse214bT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse214bT
	 *	@return wse214bT
	 */   
	 public Wse214bT getWse214bT() {
   	return wse214bT;
   }
   /**
	* 	Update Wse214bT with the passed value
	*   Corresponding COBOL Variable is WSE-2-14B-T
	*	@param value
	*/
   public void setWse214bT(char[] value) {
      wse214bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse214bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse214bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse214bT.begin,wse214bT.length());
   }
   
     /**
	 * 	Update Wse214bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse214bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse214bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse214bT with another Field
	 *	@param value
	 */
   public void setWse214bT(Field source) {
   	replace(source,0,source.length(),wse214bT.begin,wse214bT.length());
   }  
   
     /**
	 * 	Update Wse214bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse214bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse214bT.begin,wse214bT.length());
   }
   
     /**
	 * 	Update Wse214bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse214bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse214bT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse214bTGrpFieldLength() {
			return WSE_214B_TGRP_LENGTH;
		}

}
  
