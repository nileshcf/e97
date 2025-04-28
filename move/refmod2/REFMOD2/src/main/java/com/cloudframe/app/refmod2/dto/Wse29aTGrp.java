package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse29aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse29aTGrp extends Wse29aTGrpSerialized {
   
				private Wse29aT wse29aT = new Wse29aT();
	
	/**
	* Constructor for Wse29aTGrp
	**/
    public Wse29aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse29aT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse29aT
	 *	@return wse29aT
	 */   
	 public Wse29aT getWse29aT() {
   	return wse29aT;
   }
   /**
	* 	Update Wse29aT with the passed value
	*   Corresponding COBOL Variable is WSE-2-9A-T
	*	@param value
	*/
   public void setWse29aT(char[] value) {
      wse29aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse29aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse29aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse29aT.begin,wse29aT.length());
   }
   
     /**
	 * 	Update Wse29aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse29aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse29aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse29aT with another Field
	 *	@param value
	 */
   public void setWse29aT(Field source) {
   	replace(source,0,source.length(),wse29aT.begin,wse29aT.length());
   }  
   
     /**
	 * 	Update Wse29aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse29aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse29aT.begin,wse29aT.length());
   }
   
     /**
	 * 	Update Wse29aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse29aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse29aT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse29aTGrpFieldLength() {
			return WSE_29A_TGRP_LENGTH;
		}

}
  
