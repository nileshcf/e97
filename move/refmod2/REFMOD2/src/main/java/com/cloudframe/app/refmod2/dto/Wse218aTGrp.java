package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse218aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse218aTGrp extends Wse218aTGrpSerialized { 
   
				private Wse218aT wse218aT = new Wse218aT();
	
	/**
	* Constructor for Wse218aTGrp
	**/
    public Wse218aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse218aT.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse218aT
	 *	@return wse218aT
	 */   
	 public Wse218aT getWse218aT() {
   	return wse218aT;
   }
   /**
	* 	Update Wse218aT with the passed value
	*   Corresponding COBOL Variable is WSE-2-18A-T
	*	@param value
	*/
   public void setWse218aT(char[] value) {
      wse218aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse218aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse218aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse218aT.begin,wse218aT.length());
   }
   
     /**
	 * 	Update Wse218aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse218aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse218aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse218aT with another Field
	 *	@param value
	 */
   public void setWse218aT(Field source) {
   	replace(source,0,source.length(),wse218aT.begin,wse218aT.length());
   }  
   
     /**
	 * 	Update Wse218aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse218aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse218aT.begin,wse218aT.length());
   }
   
     /**
	 * 	Update Wse218aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse218aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse218aT.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse218aTGrpFieldLength() {
			return WSE_218A_TGRP_LENGTH;
		}

}
  
