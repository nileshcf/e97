package com.cloudframe.app.refmod3.dto;

/**
*  The class ASGrp25 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ASGrp25 extends ASGrp25Serialized {
   
				private AS25 aS25 = new AS25();
	
	/**
	* Constructor for ASGrp25
	**/
    public ASGrp25() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aS25.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aS25
	 *	@return aS25
	 */   
	 public AS25 getAS25() {
   	return aS25;
   }
   /**
	* 	Update AS25 with the passed value
	*   Corresponding COBOL Variable is WS-2-5A-S
	*	@param value
	*/
   public void setAS25(char[] value) {
      aS25.setString(value); 
   }   
    
     /**
	 * 	Update AS25 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAS25(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aS25.begin,aS25.length());
   }
   
     /**
	 * 	Update AS25 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAS25(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aS25.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AS25 with another Field
	 *	@param value
	 */
   public void setAS25(Field source) {
   	replace(source,0,source.length(),aS25.begin,aS25.length());
   }  
   
     /**
	 * 	Update AS25 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAS25(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aS25.begin,aS25.length());
   }
   
     /**
	 * 	Update AS25 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAS25(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aS25.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getASGrp25FieldLength() {
			return A_SGRP_25_LENGTH;
		}

}
  
