package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse25aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse25aSGrp extends Wse25aSGrpSerialized {
   
				private Wse25aS wse25aS = new Wse25aS();
	
	/**
	* Constructor for Wse25aSGrp
	**/
    public Wse25aSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse25aS.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse25aS
	 *	@return wse25aS
	 */   
	 public Wse25aS getWse25aS() {
   	return wse25aS;
   }
   /**
	* 	Update Wse25aS with the passed value
	*   Corresponding COBOL Variable is WSE-2-5A-S
	*	@param value
	*/
   public void setWse25aS(char[] value) {
      wse25aS.setString(value); 
   }   
    
     /**
	 * 	Update Wse25aS 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse25aS(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse25aS.begin,wse25aS.length());
   }
   
     /**
	 * 	Update Wse25aS 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse25aS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse25aS.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse25aS with another Field
	 *	@param value
	 */
   public void setWse25aS(Field source) {
   	replace(source,0,source.length(),wse25aS.begin,wse25aS.length());
   }  
   
     /**
	 * 	Update Wse25aS 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse25aS(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse25aS.begin,wse25aS.length());
   }
   
     /**
	 * 	Update Wse25aS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse25aS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse25aS.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse25aSGrpFieldLength() {
			return WSE_25A_SGRP_LENGTH;
		}

}
  
