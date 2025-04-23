package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse219bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse219bTGrp extends Wse219bTGrpSerialized {
   
				private Wse219bT wse219bT = new Wse219bT();
	
	/**
	* Constructor for Wse219bTGrp
	**/
    public Wse219bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse219bT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse219bT
	 *	@return wse219bT
	 */   
	 public Wse219bT getWse219bT() {
   	return wse219bT;
   }
   /**
	* 	Update Wse219bT with the passed value
	*   Corresponding COBOL Variable is WSE-2-19B-T
	*	@param value
	*/
   public void setWse219bT(char[] value) {
      wse219bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse219bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse219bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse219bT.begin,wse219bT.length());
   }
   
     /**
	 * 	Update Wse219bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse219bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse219bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse219bT with another Field
	 *	@param value
	 */
   public void setWse219bT(Field source) {
   	replace(source,0,source.length(),wse219bT.begin,wse219bT.length());
   }  
   
     /**
	 * 	Update Wse219bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse219bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse219bT.begin,wse219bT.length());
   }
   
     /**
	 * 	Update Wse219bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse219bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse219bT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse219bTGrpFieldLength() {
			return WSE_219B_TGRP_LENGTH;
		}

}
  
