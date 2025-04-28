package com.cloudframe.app.refmod2.dto;

/**
*  The class ATGrp29 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ATGrp29 extends ATGrp29Serialized { 
   
				private AT29 aT29 = new AT29();
	
	/**
	* Constructor for ATGrp29
	**/
    public ATGrp29() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aT29.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aT29
	 *	@return aT29
	 */   
	 public AT29 getAT29() {
   	return aT29;
   }
   /**
	* 	Update AT29 with the passed value
	*   Corresponding COBOL Variable is WS-2-9A-T
	*	@param value
	*/
   public void setAT29(char[] value) {
      aT29.setString(value); 
   }   
    
     /**
	 * 	Update AT29 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT29(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT29.begin,aT29.length());
   }
   
     /**
	 * 	Update AT29 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT29(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT29.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT29 with another Field
	 *	@param value
	 */
   public void setAT29(Field source) {
   	replace(source,0,source.length(),aT29.begin,aT29.length());
   }  
   
     /**
	 * 	Update AT29 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT29(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT29.begin,aT29.length());
   }
   
     /**
	 * 	Update AT29 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT29(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT29.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getATGrp29FieldLength() {
			return A_TGRP_29_LENGTH;
		}

}
  
