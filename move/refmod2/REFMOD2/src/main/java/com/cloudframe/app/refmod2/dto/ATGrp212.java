package com.cloudframe.app.refmod2.dto;

/**
*  The class ATGrp212 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ATGrp212 extends ATGrp212Serialized {
   
				private AT212 aT212 = new AT212();
	
	/**
	* Constructor for ATGrp212
	**/
    public ATGrp212() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aT212.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aT212
	 *	@return aT212
	 */   
	 public AT212 getAT212() {
   	return aT212;
   }
   /**
	* 	Update AT212 with the passed value
	*   Corresponding COBOL Variable is WS-2-12A-T
	*	@param value
	*/
   public void setAT212(char[] value) {
      aT212.setString(value); 
   }   
    
     /**
	 * 	Update AT212 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT212(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT212.begin,aT212.length());
   }
   
     /**
	 * 	Update AT212 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT212(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT212.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT212 with another Field
	 *	@param value
	 */
   public void setAT212(Field source) {
   	replace(source,0,source.length(),aT212.begin,aT212.length());
   }  
   
     /**
	 * 	Update AT212 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT212(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT212.begin,aT212.length());
   }
   
     /**
	 * 	Update AT212 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT212(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT212.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getATGrp212FieldLength() {
			return A_TGRP_212_LENGTH;
		}

}
  
