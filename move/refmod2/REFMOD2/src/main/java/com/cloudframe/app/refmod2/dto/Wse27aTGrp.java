package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse27aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse27aTGrp extends Wse27aTGrpSerialized {
   
				private Wse27aT wse27aT = new Wse27aT();
	
	/**
	* Constructor for Wse27aTGrp
	**/
    public Wse27aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse27aT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse27aT
	 *	@return wse27aT
	 */   
	 public Wse27aT getWse27aT() {
   	return wse27aT;
   }
   /**
	* 	Update Wse27aT with the passed value
	*   Corresponding COBOL Variable is WSE-2-7A-T
	*	@param value
	*/
   public void setWse27aT(char[] value) {
      wse27aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse27aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse27aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse27aT.begin,wse27aT.length());
   }
   
     /**
	 * 	Update Wse27aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse27aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse27aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse27aT with another Field
	 *	@param value
	 */
   public void setWse27aT(Field source) {
   	replace(source,0,source.length(),wse27aT.begin,wse27aT.length());
   }  
   
     /**
	 * 	Update Wse27aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse27aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse27aT.begin,wse27aT.length());
   }
   
     /**
	 * 	Update Wse27aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse27aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse27aT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse27aTGrpFieldLength() {
			return WSE_27A_TGRP_LENGTH;
		}

}
  
