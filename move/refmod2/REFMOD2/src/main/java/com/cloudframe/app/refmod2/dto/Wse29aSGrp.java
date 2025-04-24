package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse29aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse29aSGrp extends Wse29aSGrpSerialized { 
   
				private Wse29aS wse29aS = new Wse29aS();
	
	/**
	* Constructor for Wse29aSGrp
	**/
    public Wse29aSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse29aS.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse29aS
	 *	@return wse29aS
	 */   
	 public Wse29aS getWse29aS() {
   	return wse29aS;
   }
   /**
	* 	Update Wse29aS with the passed value
	*   Corresponding COBOL Variable is WSE-2-9A-S
	*	@param value
	*/
   public void setWse29aS(char[] value) {
      wse29aS.setString(value); 
   }   
    
     /**
	 * 	Update Wse29aS 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse29aS(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse29aS.begin,wse29aS.length());
   }
   
     /**
	 * 	Update Wse29aS 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse29aS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse29aS.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse29aS with another Field
	 *	@param value
	 */
   public void setWse29aS(Field source) {
   	replace(source,0,source.length(),wse29aS.begin,wse29aS.length());
   }  
   
     /**
	 * 	Update Wse29aS 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse29aS(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse29aS.begin,wse29aS.length());
   }
   
     /**
	 * 	Update Wse29aS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse29aS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse29aS.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse29aSGrpFieldLength() {
			return WSE_29A_SGRP_LENGTH;
		}

}
  
