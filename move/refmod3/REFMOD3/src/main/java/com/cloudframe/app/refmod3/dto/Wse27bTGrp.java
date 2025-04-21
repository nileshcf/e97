package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse27bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse27bTGrp extends Wse27bTGrpSerialized {
   
				private Wse27bT wse27bT = new Wse27bT();
	
	/**
	* Constructor for Wse27bTGrp
	**/
    public Wse27bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse27bT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse27bT
	 *	@return wse27bT
	 */   
	 public Wse27bT getWse27bT() {
   	return wse27bT;
   }
   /**
	* 	Update Wse27bT with the passed value
	*   Corresponding COBOL Variable is WSE-2-7B-T
	*	@param value
	*/
   public void setWse27bT(char[] value) {
      wse27bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse27bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse27bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse27bT.begin,wse27bT.length());
   }
   
     /**
	 * 	Update Wse27bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse27bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse27bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse27bT with another Field
	 *	@param value
	 */
   public void setWse27bT(Field source) {
   	replace(source,0,source.length(),wse27bT.begin,wse27bT.length());
   }  
   
     /**
	 * 	Update Wse27bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse27bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse27bT.begin,wse27bT.length());
   }
   
     /**
	 * 	Update Wse27bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse27bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse27bT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse27bTGrpFieldLength() {
			return WSE_27B_TGRP_LENGTH;
		}

}
  
