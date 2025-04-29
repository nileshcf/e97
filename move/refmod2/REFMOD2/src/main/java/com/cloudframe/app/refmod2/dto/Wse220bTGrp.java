package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse220bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse220bTGrp extends Wse220bTGrpSerialized {
   
				private Wse220bT wse220bT = new Wse220bT();
	
	/**
	* Constructor for Wse220bTGrp
	**/
    public Wse220bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse220bT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse220bT
	 *	@return wse220bT
	 */   
	 public Wse220bT getWse220bT() {
   	return wse220bT;
   }
   /**
	* 	Update Wse220bT with the passed value
	*   Corresponding COBOL Variable is WSE-2-20B-T
	*	@param value
	*/
   public void setWse220bT(char[] value) {
      wse220bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse220bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse220bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse220bT.begin,wse220bT.length());
   }
   
     /**
	 * 	Update Wse220bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse220bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse220bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse220bT with another Field
	 *	@param value
	 */
   public void setWse220bT(Field source) {
   	replace(source,0,source.length(),wse220bT.begin,wse220bT.length());
   }  
   
     /**
	 * 	Update Wse220bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse220bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse220bT.begin,wse220bT.length());
   }
   
     /**
	 * 	Update Wse220bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse220bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse220bT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse220bTGrpFieldLength() {
			return WSE_220B_TGRP_LENGTH;
		}

}
  
