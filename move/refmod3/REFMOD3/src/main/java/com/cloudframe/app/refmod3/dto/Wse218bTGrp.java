package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse218bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse218bTGrp extends Wse218bTGrpSerialized {
   
				private Wse218bT wse218bT = new Wse218bT();
	
	/**
	* Constructor for Wse218bTGrp
	**/
    public Wse218bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse218bT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse218bT
	 *	@return wse218bT
	 */   
	 public Wse218bT getWse218bT() {
   	return wse218bT;
   }
   /**
	* 	Update Wse218bT with the passed value
	*   Corresponding COBOL Variable is WSE-2-18B-T
	*	@param value
	*/
   public void setWse218bT(char[] value) {
      wse218bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse218bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse218bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse218bT.begin,wse218bT.length());
   }
   
     /**
	 * 	Update Wse218bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse218bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse218bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse218bT with another Field
	 *	@param value
	 */
   public void setWse218bT(Field source) {
   	replace(source,0,source.length(),wse218bT.begin,wse218bT.length());
   }  
   
     /**
	 * 	Update Wse218bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse218bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse218bT.begin,wse218bT.length());
   }
   
     /**
	 * 	Update Wse218bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse218bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse218bT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse218bTGrpFieldLength() {
			return WSE_218B_TGRP_LENGTH;
		}

}
  
