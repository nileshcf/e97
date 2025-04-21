package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse213aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse213aTGrp extends Wse213aTGrpSerialized {
   
				private Wse213aT wse213aT = new Wse213aT();
	
	/**
	* Constructor for Wse213aTGrp
	**/
    public Wse213aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse213aT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse213aT
	 *	@return wse213aT
	 */   
	 public Wse213aT getWse213aT() {
   	return wse213aT;
   }
   /**
	* 	Update Wse213aT with the passed value
	*   Corresponding COBOL Variable is WSE-2-13A-T
	*	@param value
	*/
   public void setWse213aT(char[] value) {
      wse213aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse213aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse213aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse213aT.begin,wse213aT.length());
   }
   
     /**
	 * 	Update Wse213aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse213aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse213aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse213aT with another Field
	 *	@param value
	 */
   public void setWse213aT(Field source) {
   	replace(source,0,source.length(),wse213aT.begin,wse213aT.length());
   }  
   
     /**
	 * 	Update Wse213aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse213aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse213aT.begin,wse213aT.length());
   }
   
     /**
	 * 	Update Wse213aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse213aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse213aT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse213aTGrpFieldLength() {
			return WSE_213A_TGRP_LENGTH;
		}

}
  
