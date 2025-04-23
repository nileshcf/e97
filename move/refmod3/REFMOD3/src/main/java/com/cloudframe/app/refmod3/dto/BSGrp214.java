package com.cloudframe.app.refmod3.dto;

/**
*  The class BSGrp214 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BSGrp214 extends BSGrp214Serialized {
   

						private char[] bS214 = Field.fillLowValue(70);
	
	/**
	* Constructor for BSGrp214
	**/
    public BSGrp214() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bS214
	 *	@return bS214
	 */
   public char[] getBS214() throws CFException{
     if (isBS214Modified()) { 
        bS214 = refreshBS214();
     }
   		return bS214;
   }

  
	/**
	*  set variable bS214
	*  Corresponding COBOL Variable is WS-2-14B-S
	*  @param value
	**/
   public void setBS214(char[] value) {
      bS214 = checkBS214Constraints(value);
      serializeBS214(bS214);
   } 

     /**
	 * 	Update BS214 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBS214(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBS214,bS214.length);
   	
   }
   
   public void setBS214(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBS214,bS214.length);
   	
   }
   
     /**
	 * 	Update BS214 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBS214(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBS214+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BS214 with another Field
	 *	@param value
	 */
   public void setBS214(Field source) {
       replace(source,0,source.length(),beginBS214,B_S_214_LEN);
   	
   }  
   
     /**
	 * 	Update BS214 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBS214(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBS214,B_S_214_LEN);
   	
   }
   
     /**
	 * 	Update BS214 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBS214(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBS214+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBSGrp214FieldLength() {
			return B_SGRP_214_LENGTH;
		}

}
  
