package com.cloudframe.app.refmod2.dto;

/**
*  The class ATGrp219 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ATGrp219 extends ATGrp219Serialized {
   
				private AT219 aT219 = new AT219();
	
	/**
	* Constructor for ATGrp219
	**/
    public ATGrp219() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aT219.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aT219
	 *	@return aT219
	 */   
	 public AT219 getAT219() {
   	return aT219;
   }
   /**
	* 	Update AT219 with the passed value
	*   Corresponding COBOL Variable is WS-2-19A-T
	*	@param value
	*/
   public void setAT219(char[] value) {
      aT219.setString(value); 
   }   
    
     /**
	 * 	Update AT219 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT219(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT219.begin,aT219.length());
   }
   
     /**
	 * 	Update AT219 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT219(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT219.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT219 with another Field
	 *	@param value
	 */
   public void setAT219(Field source) {
   	replace(source,0,source.length(),aT219.begin,aT219.length());
   }  
   
     /**
	 * 	Update AT219 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT219(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT219.begin,aT219.length());
   }
   
     /**
	 * 	Update AT219 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT219(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT219.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getATGrp219FieldLength() {
			return A_TGRP_219_LENGTH;
		}

}
  
