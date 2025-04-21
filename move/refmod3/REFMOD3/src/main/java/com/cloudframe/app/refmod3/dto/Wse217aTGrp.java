package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse217aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse217aTGrp extends Wse217aTGrpSerialized {
   
				private Wse217aT wse217aT = new Wse217aT();
	
	/**
	* Constructor for Wse217aTGrp
	**/
    public Wse217aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse217aT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse217aT
	 *	@return wse217aT
	 */   
	 public Wse217aT getWse217aT() {
   	return wse217aT;
   }
   /**
	* 	Update Wse217aT with the passed value
	*   Corresponding COBOL Variable is WSE-2-17A-T
	*	@param value
	*/
   public void setWse217aT(char[] value) {
      wse217aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse217aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse217aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse217aT.begin,wse217aT.length());
   }
   
     /**
	 * 	Update Wse217aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse217aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse217aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse217aT with another Field
	 *	@param value
	 */
   public void setWse217aT(Field source) {
   	replace(source,0,source.length(),wse217aT.begin,wse217aT.length());
   }  
   
     /**
	 * 	Update Wse217aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse217aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse217aT.begin,wse217aT.length());
   }
   
     /**
	 * 	Update Wse217aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse217aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse217aT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse217aTGrpFieldLength() {
			return WSE_217A_TGRP_LENGTH;
		}

}
  
