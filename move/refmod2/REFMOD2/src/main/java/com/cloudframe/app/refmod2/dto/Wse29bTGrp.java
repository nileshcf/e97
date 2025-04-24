package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse29bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse29bTGrp extends Wse29bTGrpSerialized { 
   
				private Wse29bT wse29bT = new Wse29bT();
	
	/**
	* Constructor for Wse29bTGrp
	**/
    public Wse29bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse29bT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse29bT
	 *	@return wse29bT
	 */   
	 public Wse29bT getWse29bT() {
   	return wse29bT;
   }
   /**
	* 	Update Wse29bT with the passed value
	*   Corresponding COBOL Variable is WSE-2-9B-T
	*	@param value
	*/
   public void setWse29bT(char[] value) {
      wse29bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse29bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse29bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse29bT.begin,wse29bT.length());
   }
   
     /**
	 * 	Update Wse29bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse29bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse29bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse29bT with another Field
	 *	@param value
	 */
   public void setWse29bT(Field source) {
   	replace(source,0,source.length(),wse29bT.begin,wse29bT.length());
   }  
   
     /**
	 * 	Update Wse29bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse29bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse29bT.begin,wse29bT.length());
   }
   
     /**
	 * 	Update Wse29bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse29bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse29bT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse29bTGrpFieldLength() {
			return WSE_29B_TGRP_LENGTH;
		}

}
  
