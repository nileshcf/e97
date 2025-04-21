package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse28aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse28aTGrp extends Wse28aTGrpSerialized {
   
				private Wse28aT wse28aT = new Wse28aT();
	
	/**
	* Constructor for Wse28aTGrp
	**/
    public Wse28aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse28aT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse28aT
	 *	@return wse28aT
	 */   
	 public Wse28aT getWse28aT() {
   	return wse28aT;
   }
   /**
	* 	Update Wse28aT with the passed value
	*   Corresponding COBOL Variable is WSE-2-8A-T
	*	@param value
	*/
   public void setWse28aT(char[] value) {
      wse28aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse28aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse28aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse28aT.begin,wse28aT.length());
   }
   
     /**
	 * 	Update Wse28aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse28aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse28aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse28aT with another Field
	 *	@param value
	 */
   public void setWse28aT(Field source) {
   	replace(source,0,source.length(),wse28aT.begin,wse28aT.length());
   }  
   
     /**
	 * 	Update Wse28aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse28aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse28aT.begin,wse28aT.length());
   }
   
     /**
	 * 	Update Wse28aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse28aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse28aT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse28aTGrpFieldLength() {
			return WSE_28A_TGRP_LENGTH;
		}

}
  
