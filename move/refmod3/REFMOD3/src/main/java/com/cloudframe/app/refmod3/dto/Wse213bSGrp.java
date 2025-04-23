package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse213bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse213bSGrp extends Wse213bSGrpSerialized {
   
				private Wse213bS wse213bS = new Wse213bS();
	
	/**
	* Constructor for Wse213bSGrp
	**/
    public Wse213bSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse213bS.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse213bS
	 *	@return wse213bS
	 */   
	 public Wse213bS getWse213bS() {
   	return wse213bS;
   }
   /**
	* 	Update Wse213bS with the passed value
	*   Corresponding COBOL Variable is WSE-2-13B-S
	*	@param value
	*/
   public void setWse213bS(char[] value) {
      wse213bS.setString(value); 
   }   
    
     /**
	 * 	Update Wse213bS 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse213bS(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse213bS.begin,wse213bS.length());
   }
   
     /**
	 * 	Update Wse213bS 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse213bS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse213bS.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse213bS with another Field
	 *	@param value
	 */
   public void setWse213bS(Field source) {
   	replace(source,0,source.length(),wse213bS.begin,wse213bS.length());
   }  
   
     /**
	 * 	Update Wse213bS 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse213bS(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse213bS.begin,wse213bS.length());
   }
   
     /**
	 * 	Update Wse213bS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse213bS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse213bS.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse213bSGrpFieldLength() {
			return WSE_213B_SGRP_LENGTH;
		}

}
  
