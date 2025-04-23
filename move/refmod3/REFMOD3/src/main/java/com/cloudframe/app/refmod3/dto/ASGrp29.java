package com.cloudframe.app.refmod3.dto;

/**
*  The class ASGrp29 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ASGrp29 extends ASGrp29Serialized {
   
				private AS29 aS29 = new AS29();
	
	/**
	* Constructor for ASGrp29
	**/
    public ASGrp29() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aS29.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aS29
	 *	@return aS29
	 */   
	 public AS29 getAS29() {
   	return aS29;
   }
   /**
	* 	Update AS29 with the passed value
	*   Corresponding COBOL Variable is WS-2-9A-S
	*	@param value
	*/
   public void setAS29(char[] value) {
      aS29.setString(value); 
   }   
    
     /**
	 * 	Update AS29 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAS29(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aS29.begin,aS29.length());
   }
   
     /**
	 * 	Update AS29 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAS29(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aS29.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AS29 with another Field
	 *	@param value
	 */
   public void setAS29(Field source) {
   	replace(source,0,source.length(),aS29.begin,aS29.length());
   }  
   
     /**
	 * 	Update AS29 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAS29(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aS29.begin,aS29.length());
   }
   
     /**
	 * 	Update AS29 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAS29(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aS29.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getASGrp29FieldLength() {
			return A_SGRP_29_LENGTH;
		}

}
  
