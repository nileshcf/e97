package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse214aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse214aTGrp extends Wse214aTGrpSerialized { 
   
				private Wse214aT wse214aT = new Wse214aT();
	
	/**
	* Constructor for Wse214aTGrp
	**/
    public Wse214aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse214aT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse214aT
	 *	@return wse214aT
	 */   
	 public Wse214aT getWse214aT() {
   	return wse214aT;
   }
   /**
	* 	Update Wse214aT with the passed value
	*   Corresponding COBOL Variable is WSE-2-14A-T
	*	@param value
	*/
   public void setWse214aT(char[] value) {
      wse214aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse214aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse214aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse214aT.begin,wse214aT.length());
   }
   
     /**
	 * 	Update Wse214aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse214aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse214aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse214aT with another Field
	 *	@param value
	 */
   public void setWse214aT(Field source) {
   	replace(source,0,source.length(),wse214aT.begin,wse214aT.length());
   }  
   
     /**
	 * 	Update Wse214aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse214aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse214aT.begin,wse214aT.length());
   }
   
     /**
	 * 	Update Wse214aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse214aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse214aT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse214aTGrpFieldLength() {
			return WSE_214A_TGRP_LENGTH;
		}

}
  
