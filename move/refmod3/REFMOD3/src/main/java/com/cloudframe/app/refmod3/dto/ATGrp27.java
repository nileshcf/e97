package com.cloudframe.app.refmod3.dto;

/**
*  The class ATGrp27 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ATGrp27 extends ATGrp27Serialized { 
   
				private AT27 aT27 = new AT27();
	
	/**
	* Constructor for ATGrp27
	**/
    public ATGrp27() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aT27.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aT27
	 *	@return aT27
	 */   
	 public AT27 getAT27() {
   	return aT27;
   }
   /**
	* 	Update AT27 with the passed value
	*   Corresponding COBOL Variable is WS-2-7A-T
	*	@param value
	*/
   public void setAT27(char[] value) {
      aT27.setString(value); 
   }   
    
     /**
	 * 	Update AT27 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT27(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT27.begin,aT27.length());
   }
   
     /**
	 * 	Update AT27 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT27(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT27.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT27 with another Field
	 *	@param value
	 */
   public void setAT27(Field source) {
   	replace(source,0,source.length(),aT27.begin,aT27.length());
   }  
   
     /**
	 * 	Update AT27 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT27(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT27.begin,aT27.length());
   }
   
     /**
	 * 	Update AT27 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT27(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT27.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getATGrp27FieldLength() {
			return A_TGRP_27_LENGTH;
		}

}
  
