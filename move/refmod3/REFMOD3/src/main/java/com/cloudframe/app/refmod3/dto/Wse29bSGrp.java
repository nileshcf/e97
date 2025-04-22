package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse29bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse29bSGrp extends Wse29bSGrpSerialized {
   
				private Wse29bS wse29bS = new Wse29bS();
	
	/**
	* Constructor for Wse29bSGrp
	**/
    public Wse29bSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse29bS.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse29bS
	 *	@return wse29bS
	 */   
	 public Wse29bS getWse29bS() {
   	return wse29bS;
   }
   /**
	* 	Update Wse29bS with the passed value
	*   Corresponding COBOL Variable is WSE-2-9B-S
	*	@param value
	*/
   public void setWse29bS(char[] value) {
      wse29bS.setString(value); 
   }   
    
     /**
	 * 	Update Wse29bS 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse29bS(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse29bS.begin,wse29bS.length());
   }
   
     /**
	 * 	Update Wse29bS 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse29bS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse29bS.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse29bS with another Field
	 *	@param value
	 */
   public void setWse29bS(Field source) {
   	replace(source,0,source.length(),wse29bS.begin,wse29bS.length());
   }  
   
     /**
	 * 	Update Wse29bS 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse29bS(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse29bS.begin,wse29bS.length());
   }
   
     /**
	 * 	Update Wse29bS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse29bS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse29bS.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse29bSGrpFieldLength() {
			return WSE_29B_SGRP_LENGTH;
		}

}
  
