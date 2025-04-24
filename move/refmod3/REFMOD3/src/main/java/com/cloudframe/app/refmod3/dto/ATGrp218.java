package com.cloudframe.app.refmod3.dto;

/**
*  The class ATGrp218 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:34. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ATGrp218 extends ATGrp218Serialized { 
   
				private AT218 aT218 = new AT218();
	
	/**
	* Constructor for ATGrp218
	**/
    public ATGrp218() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aT218.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aT218
	 *	@return aT218
	 */   
	 public AT218 getAT218() {
   	return aT218;
   }
   /**
	* 	Update AT218 with the passed value
	*   Corresponding COBOL Variable is WS-2-18A-T
	*	@param value
	*/
   public void setAT218(char[] value) {
      aT218.setString(value); 
   }   
    
     /**
	 * 	Update AT218 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT218(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT218.begin,aT218.length());
   }
   
     /**
	 * 	Update AT218 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT218(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT218.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT218 with another Field
	 *	@param value
	 */
   public void setAT218(Field source) {
   	replace(source,0,source.length(),aT218.begin,aT218.length());
   }  
   
     /**
	 * 	Update AT218 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT218(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT218.begin,aT218.length());
   }
   
     /**
	 * 	Update AT218 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT218(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT218.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getATGrp218FieldLength() {
			return A_TGRP_218_LENGTH;
		}

}
  
