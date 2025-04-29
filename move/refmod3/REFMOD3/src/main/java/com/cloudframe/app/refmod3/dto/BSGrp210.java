package com.cloudframe.app.refmod3.dto;

/**
*  The class BSGrp210 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BSGrp210 extends BSGrp210Serialized {
   

						private char[] bS210 = Field.fillLowValue(70);
	
	/**
	* Constructor for BSGrp210
	**/
    public BSGrp210() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bS210
	 *	@return bS210
	 */
   public char[] getBS210() throws CFException{
     if (isBS210Modified()) { 
        bS210 = refreshBS210();
     }
   		return bS210;
   }

  
	/**
	*  set variable bS210
	*  Corresponding COBOL Variable is WS-2-10B-S
	*  @param value
	**/
   public void setBS210(char[] value) {
      bS210 = checkBS210Constraints(value);
      serializeBS210(bS210);
   } 

     /**
	 * 	Update BS210 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBS210(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBS210,bS210.length);
   	
   }
   
   public void setBS210(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBS210,bS210.length);
   	
   }
   
     /**
	 * 	Update BS210 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBS210(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBS210+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BS210 with another Field
	 *	@param value
	 */
   public void setBS210(Field source) {
       replace(source,0,source.length(),beginBS210,B_S_210_LEN);
   	
   }  
   
     /**
	 * 	Update BS210 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBS210(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBS210,B_S_210_LEN);
   	
   }
   
     /**
	 * 	Update BS210 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBS210(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBS210+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBSGrp210FieldLength() {
			return B_SGRP_210_LENGTH;
		}

}
  
