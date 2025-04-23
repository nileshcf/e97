package com.cloudframe.app.refmod2.dto;

/**
*  The class BSGrp25 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BSGrp25 extends BSGrp25Serialized {
   
				private BS25 bS25 = new BS25();
	
	/**
	* Constructor for BSGrp25
	**/
    public BSGrp25() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bS25.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bS25
	 *	@return bS25
	 */   
	 public BS25 getBS25() {
   	return bS25;
   }
   /**
	* 	Update BS25 with the passed value
	*   Corresponding COBOL Variable is WS-2-5B-S
	*	@param value
	*/
   public void setBS25(char[] value) {
      bS25.setString(value); 
   }   
    
     /**
	 * 	Update BS25 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBS25(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bS25.begin,bS25.length());
   }
   
     /**
	 * 	Update BS25 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBS25(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bS25.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BS25 with another Field
	 *	@param value
	 */
   public void setBS25(Field source) {
   	replace(source,0,source.length(),bS25.begin,bS25.length());
   }  
   
     /**
	 * 	Update BS25 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBS25(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bS25.begin,bS25.length());
   }
   
     /**
	 * 	Update BS25 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBS25(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bS25.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBSGrp25FieldLength() {
			return B_SGRP_25_LENGTH;
		}

}
  
