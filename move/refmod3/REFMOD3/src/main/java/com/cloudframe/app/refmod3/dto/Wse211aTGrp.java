package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse211aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse211aTGrp extends Wse211aTGrpSerialized { 
   
				private Wse211aT wse211aT = new Wse211aT();
	
	/**
	* Constructor for Wse211aTGrp
	**/
    public Wse211aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse211aT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse211aT
	 *	@return wse211aT
	 */   
	 public Wse211aT getWse211aT() {
   	return wse211aT;
   }
   /**
	* 	Update Wse211aT with the passed value
	*   Corresponding COBOL Variable is WSE-2-11A-T
	*	@param value
	*/
   public void setWse211aT(char[] value) {
      wse211aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse211aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse211aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse211aT.begin,wse211aT.length());
   }
   
     /**
	 * 	Update Wse211aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse211aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse211aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse211aT with another Field
	 *	@param value
	 */
   public void setWse211aT(Field source) {
   	replace(source,0,source.length(),wse211aT.begin,wse211aT.length());
   }  
   
     /**
	 * 	Update Wse211aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse211aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse211aT.begin,wse211aT.length());
   }
   
     /**
	 * 	Update Wse211aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse211aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse211aT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse211aTGrpFieldLength() {
			return WSE_211A_TGRP_LENGTH;
		}

}
  
