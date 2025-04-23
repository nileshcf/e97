package com.cloudframe.app.refmod2.dto;

/**
*  The class ASGrp213 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ASGrp213 extends ASGrp213Serialized {
   
				private AS213 aS213 = new AS213();
	
	/**
	* Constructor for ASGrp213
	**/
    public ASGrp213() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aS213.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aS213
	 *	@return aS213
	 */   
	 public AS213 getAS213() {
   	return aS213;
   }
   /**
	* 	Update AS213 with the passed value
	*   Corresponding COBOL Variable is WS-2-13A-S
	*	@param value
	*/
   public void setAS213(char[] value) {
      aS213.setString(value); 
   }   
    
     /**
	 * 	Update AS213 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAS213(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aS213.begin,aS213.length());
   }
   
     /**
	 * 	Update AS213 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAS213(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aS213.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AS213 with another Field
	 *	@param value
	 */
   public void setAS213(Field source) {
   	replace(source,0,source.length(),aS213.begin,aS213.length());
   }  
   
     /**
	 * 	Update AS213 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAS213(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aS213.begin,aS213.length());
   }
   
     /**
	 * 	Update AS213 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAS213(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aS213.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getASGrp213FieldLength() {
			return A_SGRP_213_LENGTH;
		}

}
  
