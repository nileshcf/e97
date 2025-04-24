package com.cloudframe.app.refmod2.dto;

/**
*  The class BSGrp29 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BSGrp29 extends BSGrp29Serialized { 
   
				private BS29 bS29 = new BS29();
	
	/**
	* Constructor for BSGrp29
	**/
    public BSGrp29() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bS29.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bS29
	 *	@return bS29
	 */   
	 public BS29 getBS29() {
   	return bS29;
   }
   /**
	* 	Update BS29 with the passed value
	*   Corresponding COBOL Variable is WS-2-9B-S
	*	@param value
	*/
   public void setBS29(char[] value) {
      bS29.setString(value); 
   }   
    
     /**
	 * 	Update BS29 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBS29(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bS29.begin,bS29.length());
   }
   
     /**
	 * 	Update BS29 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBS29(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bS29.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BS29 with another Field
	 *	@param value
	 */
   public void setBS29(Field source) {
   	replace(source,0,source.length(),bS29.begin,bS29.length());
   }  
   
     /**
	 * 	Update BS29 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBS29(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bS29.begin,bS29.length());
   }
   
     /**
	 * 	Update BS29 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBS29(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bS29.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBSGrp29FieldLength() {
			return B_SGRP_29_LENGTH;
		}

}
  
