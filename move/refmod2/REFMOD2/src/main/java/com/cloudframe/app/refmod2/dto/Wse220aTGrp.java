package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse220aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse220aTGrp extends Wse220aTGrpSerialized { 
   
				private Wse220aT wse220aT = new Wse220aT();
	
	/**
	* Constructor for Wse220aTGrp
	**/
    public Wse220aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse220aT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse220aT
	 *	@return wse220aT
	 */   
	 public Wse220aT getWse220aT() {
   	return wse220aT;
   }
   /**
	* 	Update Wse220aT with the passed value
	*   Corresponding COBOL Variable is WSE-2-20A-T
	*	@param value
	*/
   public void setWse220aT(char[] value) {
      wse220aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse220aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse220aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse220aT.begin,wse220aT.length());
   }
   
     /**
	 * 	Update Wse220aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse220aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse220aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse220aT with another Field
	 *	@param value
	 */
   public void setWse220aT(Field source) {
   	replace(source,0,source.length(),wse220aT.begin,wse220aT.length());
   }  
   
     /**
	 * 	Update Wse220aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse220aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse220aT.begin,wse220aT.length());
   }
   
     /**
	 * 	Update Wse220aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse220aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse220aT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse220aTGrpFieldLength() {
			return WSE_220A_TGRP_LENGTH;
		}

}
  
