package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse215aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse215aSGrp extends Wse215aSGrpSerialized {
   
				private Wse215aS wse215aS = new Wse215aS();
	
	/**
	* Constructor for Wse215aSGrp
	**/
    public Wse215aSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse215aS.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse215aS
	 *	@return wse215aS
	 */   
	 public Wse215aS getWse215aS() {
   	return wse215aS;
   }
   /**
	* 	Update Wse215aS with the passed value
	*   Corresponding COBOL Variable is WSE-2-15A-S
	*	@param value
	*/
   public void setWse215aS(char[] value) {
      wse215aS.setString(value); 
   }   
    
     /**
	 * 	Update Wse215aS 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse215aS(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse215aS.begin,wse215aS.length());
   }
   
     /**
	 * 	Update Wse215aS 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse215aS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse215aS.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse215aS with another Field
	 *	@param value
	 */
   public void setWse215aS(Field source) {
   	replace(source,0,source.length(),wse215aS.begin,wse215aS.length());
   }  
   
     /**
	 * 	Update Wse215aS 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse215aS(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse215aS.begin,wse215aS.length());
   }
   
     /**
	 * 	Update Wse215aS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse215aS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse215aS.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse215aSGrpFieldLength() {
			return WSE_215A_SGRP_LENGTH;
		}

}
  
