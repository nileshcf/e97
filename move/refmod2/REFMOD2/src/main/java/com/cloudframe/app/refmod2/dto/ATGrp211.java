package com.cloudframe.app.refmod2.dto;

/**
*  The class ATGrp211 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ATGrp211 extends ATGrp211Serialized {
   
				private AT211 aT211 = new AT211();
	
	/**
	* Constructor for ATGrp211
	**/
    public ATGrp211() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aT211.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aT211
	 *	@return aT211
	 */   
	 public AT211 getAT211() {
   	return aT211;
   }
   /**
	* 	Update AT211 with the passed value
	*   Corresponding COBOL Variable is WS-2-11A-T
	*	@param value
	*/
   public void setAT211(char[] value) {
      aT211.setString(value); 
   }   
    
     /**
	 * 	Update AT211 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT211(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT211.begin,aT211.length());
   }
   
     /**
	 * 	Update AT211 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT211(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT211.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT211 with another Field
	 *	@param value
	 */
   public void setAT211(Field source) {
   	replace(source,0,source.length(),aT211.begin,aT211.length());
   }  
   
     /**
	 * 	Update AT211 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT211(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT211.begin,aT211.length());
   }
   
     /**
	 * 	Update AT211 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT211(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT211.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getATGrp211FieldLength() {
			return A_TGRP_211_LENGTH;
		}

}
  
