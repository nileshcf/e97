package com.cloudframe.app.refmod2.dto;

/**
*  The class ATGrp214 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ATGrp214 extends ATGrp214Serialized {
   
				private AT214 aT214 = new AT214();
	
	/**
	* Constructor for ATGrp214
	**/
    public ATGrp214() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aT214.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aT214
	 *	@return aT214
	 */   
	 public AT214 getAT214() {
   	return aT214;
   }
   /**
	* 	Update AT214 with the passed value
	*   Corresponding COBOL Variable is WS-2-14A-T
	*	@param value
	*/
   public void setAT214(char[] value) {
      aT214.setString(value); 
   }   
    
     /**
	 * 	Update AT214 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT214(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT214.begin,aT214.length());
   }
   
     /**
	 * 	Update AT214 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT214(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT214.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT214 with another Field
	 *	@param value
	 */
   public void setAT214(Field source) {
   	replace(source,0,source.length(),aT214.begin,aT214.length());
   }  
   
     /**
	 * 	Update AT214 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT214(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT214.begin,aT214.length());
   }
   
     /**
	 * 	Update AT214 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT214(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT214.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getATGrp214FieldLength() {
			return A_TGRP_214_LENGTH;
		}

}
  
