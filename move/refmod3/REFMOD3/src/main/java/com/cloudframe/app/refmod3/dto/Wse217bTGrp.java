package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse217bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:34. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse217bTGrp extends Wse217bTGrpSerialized { 
   
				private Wse217bT wse217bT = new Wse217bT();
	
	/**
	* Constructor for Wse217bTGrp
	**/
    public Wse217bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse217bT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse217bT
	 *	@return wse217bT
	 */   
	 public Wse217bT getWse217bT() {
   	return wse217bT;
   }
   /**
	* 	Update Wse217bT with the passed value
	*   Corresponding COBOL Variable is WSE-2-17B-T
	*	@param value
	*/
   public void setWse217bT(char[] value) {
      wse217bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse217bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse217bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse217bT.begin,wse217bT.length());
   }
   
     /**
	 * 	Update Wse217bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse217bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse217bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse217bT with another Field
	 *	@param value
	 */
   public void setWse217bT(Field source) {
   	replace(source,0,source.length(),wse217bT.begin,wse217bT.length());
   }  
   
     /**
	 * 	Update Wse217bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse217bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse217bT.begin,wse217bT.length());
   }
   
     /**
	 * 	Update Wse217bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse217bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse217bT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse217bTGrpFieldLength() {
			return WSE_217B_TGRP_LENGTH;
		}

}
  
