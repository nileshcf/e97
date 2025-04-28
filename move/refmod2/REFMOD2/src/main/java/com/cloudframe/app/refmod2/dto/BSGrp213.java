package com.cloudframe.app.refmod2.dto;

/**
*  The class BSGrp213 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BSGrp213 extends BSGrp213Serialized {
   
				private BS213 bS213 = new BS213();
	
	/**
	* Constructor for BSGrp213
	**/
    public BSGrp213() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bS213.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bS213
	 *	@return bS213
	 */   
	 public BS213 getBS213() {
   	return bS213;
   }
   /**
	* 	Update BS213 with the passed value
	*   Corresponding COBOL Variable is WS-2-13B-S
	*	@param value
	*/
   public void setBS213(char[] value) {
      bS213.setString(value); 
   }   
    
     /**
	 * 	Update BS213 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBS213(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bS213.begin,bS213.length());
   }
   
     /**
	 * 	Update BS213 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBS213(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bS213.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BS213 with another Field
	 *	@param value
	 */
   public void setBS213(Field source) {
   	replace(source,0,source.length(),bS213.begin,bS213.length());
   }  
   
     /**
	 * 	Update BS213 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBS213(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bS213.begin,bS213.length());
   }
   
     /**
	 * 	Update BS213 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBS213(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bS213.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBSGrp213FieldLength() {
			return B_SGRP_213_LENGTH;
		}

}
  
