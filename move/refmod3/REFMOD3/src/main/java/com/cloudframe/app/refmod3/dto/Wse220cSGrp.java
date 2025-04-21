package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse220cSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse220cSGrp extends Wse220cSGrpSerialized {
   
				private Wse220cS wse220cS = new Wse220cS();
	
	/**
	* Constructor for Wse220cSGrp
	**/
    public Wse220cSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse220cS.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse220cS
	 *	@return wse220cS
	 */   
	 public Wse220cS getWse220cS() {
   	return wse220cS;
   }
   /**
	* 	Update Wse220cS with the passed value
	*   Corresponding COBOL Variable is WSE-2-20C-S
	*	@param value
	*/
   public void setWse220cS(char[] value) {
      wse220cS.setString(value); 
   }   
    
     /**
	 * 	Update Wse220cS 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse220cS(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse220cS.begin,wse220cS.length());
   }
   
     /**
	 * 	Update Wse220cS 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse220cS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse220cS.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse220cS with another Field
	 *	@param value
	 */
   public void setWse220cS(Field source) {
   	replace(source,0,source.length(),wse220cS.begin,wse220cS.length());
   }  
   
     /**
	 * 	Update Wse220cS 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse220cS(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse220cS.begin,wse220cS.length());
   }
   
     /**
	 * 	Update Wse220cS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse220cS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse220cS.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse220cSGrpFieldLength() {
			return WSE_220C_SGRP_LENGTH;
		}

}
  
