package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse219aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse219aTGrp extends Wse219aTGrpSerialized {
   
				private Wse219aT wse219aT = new Wse219aT();
	
	/**
	* Constructor for Wse219aTGrp
	**/
    public Wse219aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse219aT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse219aT
	 *	@return wse219aT
	 */   
	 public Wse219aT getWse219aT() {
   	return wse219aT;
   }
   /**
	* 	Update Wse219aT with the passed value
	*   Corresponding COBOL Variable is WSE-2-19A-T
	*	@param value
	*/
   public void setWse219aT(char[] value) {
      wse219aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse219aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse219aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse219aT.begin,wse219aT.length());
   }
   
     /**
	 * 	Update Wse219aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse219aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse219aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse219aT with another Field
	 *	@param value
	 */
   public void setWse219aT(Field source) {
   	replace(source,0,source.length(),wse219aT.begin,wse219aT.length());
   }  
   
     /**
	 * 	Update Wse219aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse219aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse219aT.begin,wse219aT.length());
   }
   
     /**
	 * 	Update Wse219aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse219aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse219aT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse219aTGrpFieldLength() {
			return WSE_219A_TGRP_LENGTH;
		}

}
  
