package com.cloudframe.app.refmod2.dto;

/**
*  The class ATGrp220 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ATGrp220 extends ATGrp220Serialized {
   
				private AT220 aT220 = new AT220();
	
	/**
	* Constructor for ATGrp220
	**/
    public ATGrp220() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aT220.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aT220
	 *	@return aT220
	 */   
	 public AT220 getAT220() {
   	return aT220;
   }
   /**
	* 	Update AT220 with the passed value
	*   Corresponding COBOL Variable is WS-2-20A-T
	*	@param value
	*/
   public void setAT220(char[] value) {
      aT220.setString(value); 
   }   
    
     /**
	 * 	Update AT220 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT220(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT220.begin,aT220.length());
   }
   
     /**
	 * 	Update AT220 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT220(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT220.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT220 with another Field
	 *	@param value
	 */
   public void setAT220(Field source) {
   	replace(source,0,source.length(),aT220.begin,aT220.length());
   }  
   
     /**
	 * 	Update AT220 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT220(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT220.begin,aT220.length());
   }
   
     /**
	 * 	Update AT220 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT220(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT220.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getATGrp220FieldLength() {
			return A_TGRP_220_LENGTH;
		}

}
  
