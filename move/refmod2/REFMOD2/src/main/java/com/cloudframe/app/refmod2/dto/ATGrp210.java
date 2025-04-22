package com.cloudframe.app.refmod2.dto;

/**
*  The class ATGrp210 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ATGrp210 extends ATGrp210Serialized {
   
				private AT210 aT210 = new AT210();
	
	/**
	* Constructor for ATGrp210
	**/
    public ATGrp210() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aT210.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aT210
	 *	@return aT210
	 */   
	 public AT210 getAT210() {
   	return aT210;
   }
   /**
	* 	Update AT210 with the passed value
	*   Corresponding COBOL Variable is WS-2-10A-T
	*	@param value
	*/
   public void setAT210(char[] value) {
      aT210.setString(value); 
   }   
    
     /**
	 * 	Update AT210 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT210(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT210.begin,aT210.length());
   }
   
     /**
	 * 	Update AT210 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT210(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT210.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT210 with another Field
	 *	@param value
	 */
   public void setAT210(Field source) {
   	replace(source,0,source.length(),aT210.begin,aT210.length());
   }  
   
     /**
	 * 	Update AT210 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT210(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT210.begin,aT210.length());
   }
   
     /**
	 * 	Update AT210 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT210(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT210.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getATGrp210FieldLength() {
			return A_TGRP_210_LENGTH;
		}

}
  
