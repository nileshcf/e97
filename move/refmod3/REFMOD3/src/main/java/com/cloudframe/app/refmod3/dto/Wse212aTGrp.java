package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse212aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse212aTGrp extends Wse212aTGrpSerialized {
   
				private Wse212aT wse212aT = new Wse212aT();
	
	/**
	* Constructor for Wse212aTGrp
	**/
    public Wse212aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse212aT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse212aT
	 *	@return wse212aT
	 */   
	 public Wse212aT getWse212aT() {
   	return wse212aT;
   }
   /**
	* 	Update Wse212aT with the passed value
	*   Corresponding COBOL Variable is WSE-2-12A-T
	*	@param value
	*/
   public void setWse212aT(char[] value) {
      wse212aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse212aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse212aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse212aT.begin,wse212aT.length());
   }
   
     /**
	 * 	Update Wse212aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse212aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse212aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse212aT with another Field
	 *	@param value
	 */
   public void setWse212aT(Field source) {
   	replace(source,0,source.length(),wse212aT.begin,wse212aT.length());
   }  
   
     /**
	 * 	Update Wse212aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse212aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse212aT.begin,wse212aT.length());
   }
   
     /**
	 * 	Update Wse212aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse212aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse212aT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse212aTGrpFieldLength() {
			return WSE_212A_TGRP_LENGTH;
		}

}
  
