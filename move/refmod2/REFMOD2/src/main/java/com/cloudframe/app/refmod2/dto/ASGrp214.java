package com.cloudframe.app.refmod2.dto;

/**
*  The class ASGrp214 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ASGrp214 extends ASGrp214Serialized {
   

						private char[] aS214 = Field.fillLowValue(70);
	
	/**
	* Constructor for ASGrp214
	**/
    public ASGrp214() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aS214
	 *	@return aS214
	 */
   public char[] getAS214() throws CFException{
     if (isAS214Modified()) { 
        aS214 = refreshAS214();
     }
   		return aS214;
   }

  
	/**
	*  set variable aS214
	*  Corresponding COBOL Variable is WS-2-14A-S
	*  @param value
	**/
   public void setAS214(char[] value) {
      aS214 = checkAS214Constraints(value);
      serializeAS214(aS214);
   } 

     /**
	 * 	Update AS214 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAS214(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAS214,aS214.length);
   	
   }
   
   public void setAS214(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAS214,aS214.length);
   	
   }
   
     /**
	 * 	Update AS214 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAS214(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAS214+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AS214 with another Field
	 *	@param value
	 */
   public void setAS214(Field source) {
       replace(source,0,source.length(),beginAS214,A_S_214_LEN);
   	
   }  
   
     /**
	 * 	Update AS214 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAS214(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAS214,A_S_214_LEN);
   	
   }
   
     /**
	 * 	Update AS214 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAS214(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAS214+targetIndex,targetLen);
    
   }

	
	
	

		public static int getASGrp214FieldLength() {
			return A_SGRP_214_LENGTH;
		}

}
  
