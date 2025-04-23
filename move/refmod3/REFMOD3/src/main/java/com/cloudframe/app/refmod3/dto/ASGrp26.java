package com.cloudframe.app.refmod3.dto;

/**
*  The class ASGrp26 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ASGrp26 extends ASGrp26Serialized {
   

						private char[] aS26 = Field.fillLowValue(70);
	
	/**
	* Constructor for ASGrp26
	**/
    public ASGrp26() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aS26
	 *	@return aS26
	 */
   public char[] getAS26() throws CFException{
     if (isAS26Modified()) { 
        aS26 = refreshAS26();
     }
   		return aS26;
   }

  
	/**
	*  set variable aS26
	*  Corresponding COBOL Variable is WS-2-6A-S
	*  @param value
	**/
   public void setAS26(char[] value) {
      aS26 = checkAS26Constraints(value);
      serializeAS26(aS26);
   } 

     /**
	 * 	Update AS26 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAS26(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAS26,aS26.length);
   	
   }
   
   public void setAS26(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAS26,aS26.length);
   	
   }
   
     /**
	 * 	Update AS26 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAS26(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAS26+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AS26 with another Field
	 *	@param value
	 */
   public void setAS26(Field source) {
       replace(source,0,source.length(),beginAS26,A_S_26_LEN);
   	
   }  
   
     /**
	 * 	Update AS26 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAS26(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAS26,A_S_26_LEN);
   	
   }
   
     /**
	 * 	Update AS26 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAS26(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAS26+targetIndex,targetLen);
    
   }

	
	
	

		public static int getASGrp26FieldLength() {
			return A_SGRP_26_LENGTH;
		}

}
  
