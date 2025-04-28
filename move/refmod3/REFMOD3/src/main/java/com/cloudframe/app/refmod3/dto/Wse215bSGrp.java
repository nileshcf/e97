package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse215bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse215bSGrp extends Wse215bSGrpSerialized { 
   
				private Wse215bS wse215bS = new Wse215bS();
	
	/**
	* Constructor for Wse215bSGrp
	**/
    public Wse215bSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse215bS.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse215bS
	 *	@return wse215bS
	 */   
	 public Wse215bS getWse215bS() {
   	return wse215bS;
   }
   /**
	* 	Update Wse215bS with the passed value
	*   Corresponding COBOL Variable is WSE-2-15B-S
	*	@param value
	*/
   public void setWse215bS(char[] value) {
      wse215bS.setString(value); 
   }   
    
     /**
	 * 	Update Wse215bS 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse215bS(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse215bS.begin,wse215bS.length());
   }
   
     /**
	 * 	Update Wse215bS 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse215bS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse215bS.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse215bS with another Field
	 *	@param value
	 */
   public void setWse215bS(Field source) {
   	replace(source,0,source.length(),wse215bS.begin,wse215bS.length());
   }  
   
     /**
	 * 	Update Wse215bS 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse215bS(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse215bS.begin,wse215bS.length());
   }
   
     /**
	 * 	Update Wse215bS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse215bS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse215bS.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWse215bSGrpFieldLength() {
			return WSE_215B_SGRP_LENGTH;
		}

}
  
