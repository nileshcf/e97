package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse212bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:34. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse212bTGrp extends Wse212bTGrpSerialized { 
   
				private Wse212bT wse212bT = new Wse212bT();
	
	/**
	* Constructor for Wse212bTGrp
	**/
    public Wse212bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse212bT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse212bT
	 *	@return wse212bT
	 */   
	 public Wse212bT getWse212bT() {
   	return wse212bT;
   }
   /**
	* 	Update Wse212bT with the passed value
	*   Corresponding COBOL Variable is WSE-2-12B-T
	*	@param value
	*/
   public void setWse212bT(char[] value) {
      wse212bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse212bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse212bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse212bT.begin,wse212bT.length());
   }
   
     /**
	 * 	Update Wse212bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse212bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse212bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse212bT with another Field
	 *	@param value
	 */
   public void setWse212bT(Field source) {
   	replace(source,0,source.length(),wse212bT.begin,wse212bT.length());
   }  
   
     /**
	 * 	Update Wse212bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse212bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse212bT.begin,wse212bT.length());
   }
   
     /**
	 * 	Update Wse212bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse212bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse212bT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse212bTGrpFieldLength() {
			return WSE_212B_TGRP_LENGTH;
		}

}
  
