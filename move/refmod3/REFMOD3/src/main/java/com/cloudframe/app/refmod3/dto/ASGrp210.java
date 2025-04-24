package com.cloudframe.app.refmod3.dto;

/**
*  The class ASGrp210 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:34. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ASGrp210 extends ASGrp210Serialized { 
   

						private char[] aS210 = Field.fillLowValue(70);
	
	/**
	* Constructor for ASGrp210
	**/
    public ASGrp210() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aS210
	 *	@return aS210
	 */
   public char[] getAS210() throws CFException{
     if (isAS210Modified()) { 
        aS210 = refreshAS210();
     }
   		return aS210;
   }

  
	/**
	*  set variable aS210
	*  Corresponding COBOL Variable is WS-2-10A-S
	*  @param value
	**/
   public void setAS210(char[] value) {
      aS210 = checkAS210Constraints(value);
      serializeAS210(aS210);
   } 

     /**
	 * 	Update AS210 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAS210(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAS210,aS210.length);
   	
   }
   
   public void setAS210(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAS210,aS210.length);
   	
   }
   
     /**
	 * 	Update AS210 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAS210(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAS210+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AS210 with another Field
	 *	@param value
	 */
   public void setAS210(Field source) {
       replace(source,0,source.length(),beginAS210,A_S_210_LEN);
   	
   }  
   
     /**
	 * 	Update AS210 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAS210(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAS210,A_S_210_LEN);
   	
   }
   
     /**
	 * 	Update AS210 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAS210(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAS210+targetIndex,targetLen);
    
   }

	
	
	

		public static int getASGrp210FieldLength() {
			return A_SGRP_210_LENGTH;
		}

}
  
