package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse213aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse213aSGrp extends Wse213aSGrpSerialized {
   
				private Wse213aS wse213aS = new Wse213aS();
	
	/**
	* Constructor for Wse213aSGrp
	**/
    public Wse213aSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse213aS.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse213aS
	 *	@return wse213aS
	 */   
	 public Wse213aS getWse213aS() {
   	return wse213aS;
   }
   /**
	* 	Update Wse213aS with the passed value
	*   Corresponding COBOL Variable is WSE-2-13A-S
	*	@param value
	*/
   public void setWse213aS(char[] value) {
      wse213aS.setString(value); 
   }   
    
     /**
	 * 	Update Wse213aS 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse213aS(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse213aS.begin,wse213aS.length());
   }
   
     /**
	 * 	Update Wse213aS 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse213aS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse213aS.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse213aS with another Field
	 *	@param value
	 */
   public void setWse213aS(Field source) {
   	replace(source,0,source.length(),wse213aS.begin,wse213aS.length());
   }  
   
     /**
	 * 	Update Wse213aS 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse213aS(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse213aS.begin,wse213aS.length());
   }
   
     /**
	 * 	Update Wse213aS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse213aS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse213aS.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse213aSGrpFieldLength() {
			return WSE_213A_SGRP_LENGTH;
		}

}
  
