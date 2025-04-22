package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse25bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse25bSGrp extends Wse25bSGrpSerialized {
   
				private Wse25bS wse25bS = new Wse25bS();
	
	/**
	* Constructor for Wse25bSGrp
	**/
    public Wse25bSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse25bS.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse25bS
	 *	@return wse25bS
	 */   
	 public Wse25bS getWse25bS() {
   	return wse25bS;
   }
   /**
	* 	Update Wse25bS with the passed value
	*   Corresponding COBOL Variable is WSE-2-5B-S
	*	@param value
	*/
   public void setWse25bS(char[] value) {
      wse25bS.setString(value); 
   }   
    
     /**
	 * 	Update Wse25bS 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse25bS(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse25bS.begin,wse25bS.length());
   }
   
     /**
	 * 	Update Wse25bS 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse25bS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse25bS.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse25bS with another Field
	 *	@param value
	 */
   public void setWse25bS(Field source) {
   	replace(source,0,source.length(),wse25bS.begin,wse25bS.length());
   }  
   
     /**
	 * 	Update Wse25bS 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse25bS(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse25bS.begin,wse25bS.length());
   }
   
     /**
	 * 	Update Wse25bS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse25bS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse25bS.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse25bSGrpFieldLength() {
			return WSE_25B_SGRP_LENGTH;
		}

}
  
