package com.cloudframe.app.refmod2.dto;

/**
*  The class ATGrp28 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ATGrp28 extends ATGrp28Serialized {
   
				private AT28 aT28 = new AT28();
	
	/**
	* Constructor for ATGrp28
	**/
    public ATGrp28() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aT28.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aT28
	 *	@return aT28
	 */   
	 public AT28 getAT28() {
   	return aT28;
   }
   /**
	* 	Update AT28 with the passed value
	*   Corresponding COBOL Variable is WS-2-8A-T
	*	@param value
	*/
   public void setAT28(char[] value) {
      aT28.setString(value); 
   }   
    
     /**
	 * 	Update AT28 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT28(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT28.begin,aT28.length());
   }
   
     /**
	 * 	Update AT28 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT28(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT28.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT28 with another Field
	 *	@param value
	 */
   public void setAT28(Field source) {
   	replace(source,0,source.length(),aT28.begin,aT28.length());
   }  
   
     /**
	 * 	Update AT28 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT28(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT28.begin,aT28.length());
   }
   
     /**
	 * 	Update AT28 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT28(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT28.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getATGrp28FieldLength() {
			return A_TGRP_28_LENGTH;
		}

}
  
