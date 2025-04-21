package com.cloudframe.app.refmod2.dto;

/**
*  The class BSGrp215 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BSGrp215 extends BSGrp215Serialized {
   
				private BS215 bS215 = new BS215();
	
	/**
	* Constructor for BSGrp215
	**/
    public BSGrp215() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bS215.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bS215
	 *	@return bS215
	 */   
	 public BS215 getBS215() {
   	return bS215;
   }
   /**
	* 	Update BS215 with the passed value
	*   Corresponding COBOL Variable is WS-2-15B-S
	*	@param value
	*/
   public void setBS215(char[] value) {
      bS215.setString(value); 
   }   
    
     /**
	 * 	Update BS215 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBS215(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bS215.begin,bS215.length());
   }
   
     /**
	 * 	Update BS215 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBS215(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bS215.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BS215 with another Field
	 *	@param value
	 */
   public void setBS215(Field source) {
   	replace(source,0,source.length(),bS215.begin,bS215.length());
   }  
   
     /**
	 * 	Update BS215 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBS215(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bS215.begin,bS215.length());
   }
   
     /**
	 * 	Update BS215 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBS215(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bS215.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBSGrp215FieldLength() {
			return B_SGRP_215_LENGTH;
		}

}
  
