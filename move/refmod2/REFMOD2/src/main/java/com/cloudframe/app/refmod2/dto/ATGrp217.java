package com.cloudframe.app.refmod2.dto;

/**
*  The class ATGrp217 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ATGrp217 extends ATGrp217Serialized {
   
				private AT217 aT217 = new AT217();
	
	/**
	* Constructor for ATGrp217
	**/
    public ATGrp217() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aT217.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aT217
	 *	@return aT217
	 */   
	 public AT217 getAT217() {
   	return aT217;
   }
   /**
	* 	Update AT217 with the passed value
	*   Corresponding COBOL Variable is WS-2-17A-T
	*	@param value
	*/
   public void setAT217(char[] value) {
      aT217.setString(value); 
   }   
    
     /**
	 * 	Update AT217 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT217(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT217.begin,aT217.length());
   }
   
     /**
	 * 	Update AT217 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT217(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT217.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT217 with another Field
	 *	@param value
	 */
   public void setAT217(Field source) {
   	replace(source,0,source.length(),aT217.begin,aT217.length());
   }  
   
     /**
	 * 	Update AT217 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT217(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT217.begin,aT217.length());
   }
   
     /**
	 * 	Update AT217 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT217(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT217.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getATGrp217FieldLength() {
			return A_TGRP_217_LENGTH;
		}

}
  
