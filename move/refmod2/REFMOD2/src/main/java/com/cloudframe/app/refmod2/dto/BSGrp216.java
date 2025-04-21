package com.cloudframe.app.refmod2.dto;

/**
*  The class BSGrp216 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BSGrp216 extends BSGrp216Serialized {
   

						private char[] bS216 = Field.fillLowValue(70);
	
	/**
	* Constructor for BSGrp216
	**/
    public BSGrp216() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bS216
	 *	@return bS216
	 */
   public char[] getBS216() throws CFException{
     if (isBS216Modified()) { 
        bS216 = refreshBS216();
     }
   		return bS216;
   }

  
	/**
	*  set variable bS216
	*  Corresponding COBOL Variable is WS-2-16B-S
	*  @param value
	**/
   public void setBS216(char[] value) {
      bS216 = checkBS216Constraints(value);
      serializeBS216(bS216);
   } 

     /**
	 * 	Update BS216 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBS216(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBS216,bS216.length);
   	
   }
   
   public void setBS216(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBS216,bS216.length);
   	
   }
   
     /**
	 * 	Update BS216 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBS216(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBS216+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BS216 with another Field
	 *	@param value
	 */
   public void setBS216(Field source) {
       replace(source,0,source.length(),beginBS216,B_S_216_LEN);
   	
   }  
   
     /**
	 * 	Update BS216 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBS216(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBS216,B_S_216_LEN);
   	
   }
   
     /**
	 * 	Update BS216 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBS216(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBS216+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBSGrp216FieldLength() {
			return B_SGRP_216_LENGTH;
		}

}
  
