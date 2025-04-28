package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse210aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse210aTGrp extends Wse210aTGrpSerialized { 
   
				private Wse210aT wse210aT = new Wse210aT();
	
	/**
	* Constructor for Wse210aTGrp
	**/
    public Wse210aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse210aT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse210aT
	 *	@return wse210aT
	 */   
	 public Wse210aT getWse210aT() {
   	return wse210aT;
   }
   /**
	* 	Update Wse210aT with the passed value
	*   Corresponding COBOL Variable is WSE-2-10A-T
	*	@param value
	*/
   public void setWse210aT(char[] value) {
      wse210aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse210aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse210aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse210aT.begin,wse210aT.length());
   }
   
     /**
	 * 	Update Wse210aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse210aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse210aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse210aT with another Field
	 *	@param value
	 */
   public void setWse210aT(Field source) {
   	replace(source,0,source.length(),wse210aT.begin,wse210aT.length());
   }  
   
     /**
	 * 	Update Wse210aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse210aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse210aT.begin,wse210aT.length());
   }
   
     /**
	 * 	Update Wse210aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse210aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse210aT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse210aTGrpFieldLength() {
			return WSE_210A_TGRP_LENGTH;
		}

}
  
