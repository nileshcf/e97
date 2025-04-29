package com.cloudframe.app.refmod3.dto;

/**
*  The class ATGrp213 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ATGrp213 extends ATGrp213Serialized {
   
				private AT213 aT213 = new AT213();
	
	/**
	* Constructor for ATGrp213
	**/
    public ATGrp213() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aT213.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aT213
	 *	@return aT213
	 */   
	 public AT213 getAT213() {
   	return aT213;
   }
   /**
	* 	Update AT213 with the passed value
	*   Corresponding COBOL Variable is WS-2-13A-T
	*	@param value
	*/
   public void setAT213(char[] value) {
      aT213.setString(value); 
   }   
    
     /**
	 * 	Update AT213 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT213(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT213.begin,aT213.length());
   }
   
     /**
	 * 	Update AT213 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT213(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT213.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT213 with another Field
	 *	@param value
	 */
   public void setAT213(Field source) {
   	replace(source,0,source.length(),aT213.begin,aT213.length());
   }  
   
     /**
	 * 	Update AT213 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT213(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT213.begin,aT213.length());
   }
   
     /**
	 * 	Update AT213 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT213(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT213.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getATGrp213FieldLength() {
			return A_TGRP_213_LENGTH;
		}

}
  
