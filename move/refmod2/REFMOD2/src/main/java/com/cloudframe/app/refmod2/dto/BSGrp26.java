package com.cloudframe.app.refmod2.dto;

/**
*  The class BSGrp26 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BSGrp26 extends BSGrp26Serialized { 
   

						private char[] bS26 = Field.fillLowValue(70);
	
	/**
	* Constructor for BSGrp26
	**/
    public BSGrp26() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bS26
	 *	@return bS26
	 */
   public char[] getBS26() throws CFException{
     if (isBS26Modified()) { 
        bS26 = refreshBS26();
     }
   		return bS26;
   }

  
	/**
	*  set variable bS26
	*  Corresponding COBOL Variable is WS-2-6B-S
	*  @param value
	**/
   public void setBS26(char[] value) {
      bS26 = checkBS26Constraints(value);
      serializeBS26(bS26);
   } 

     /**
	 * 	Update BS26 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBS26(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBS26,bS26.length);
   	
   }
   
   public void setBS26(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBS26,bS26.length);
   	
   }
   
     /**
	 * 	Update BS26 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBS26(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBS26+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BS26 with another Field
	 *	@param value
	 */
   public void setBS26(Field source) {
       replace(source,0,source.length(),beginBS26,B_S_26_LEN);
   	
   }  
   
     /**
	 * 	Update BS26 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBS26(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBS26,B_S_26_LEN);
   	
   }
   
     /**
	 * 	Update BS26 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBS26(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBS26+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBSGrp26FieldLength() {
			return B_SGRP_26_LENGTH;
		}

}
  
