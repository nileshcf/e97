package com.cloudframe.app.refmod3.dto;

/**
*  The class ASGrp215 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ASGrp215 extends ASGrp215Serialized {
   
				private AS215 aS215 = new AS215();
	
	/**
	* Constructor for ASGrp215
	**/
    public ASGrp215() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aS215.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aS215
	 *	@return aS215
	 */   
	 public AS215 getAS215() {
   	return aS215;
   }
   /**
	* 	Update AS215 with the passed value
	*   Corresponding COBOL Variable is WS-2-15A-S
	*	@param value
	*/
   public void setAS215(char[] value) {
      aS215.setString(value); 
   }   
    
     /**
	 * 	Update AS215 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAS215(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aS215.begin,aS215.length());
   }
   
     /**
	 * 	Update AS215 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAS215(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aS215.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AS215 with another Field
	 *	@param value
	 */
   public void setAS215(Field source) {
   	replace(source,0,source.length(),aS215.begin,aS215.length());
   }  
   
     /**
	 * 	Update AS215 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAS215(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aS215.begin,aS215.length());
   }
   
     /**
	 * 	Update AS215 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAS215(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aS215.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getASGrp215FieldLength() {
			return A_SGRP_215_LENGTH;
		}

}
  
