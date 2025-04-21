package com.cloudframe.app.refmod2.dto;

/**
*  The class ASGrp216 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ASGrp216 extends ASGrp216Serialized {
   

						private char[] aS216 = Field.fillLowValue(70);
	
	/**
	* Constructor for ASGrp216
	**/
    public ASGrp216() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aS216
	 *	@return aS216
	 */
   public char[] getAS216() throws CFException{
     if (isAS216Modified()) { 
        aS216 = refreshAS216();
     }
   		return aS216;
   }

  
	/**
	*  set variable aS216
	*  Corresponding COBOL Variable is WS-2-16A-S
	*  @param value
	**/
   public void setAS216(char[] value) {
      aS216 = checkAS216Constraints(value);
      serializeAS216(aS216);
   } 

     /**
	 * 	Update AS216 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAS216(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAS216,aS216.length);
   	
   }
   
   public void setAS216(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAS216,aS216.length);
   	
   }
   
     /**
	 * 	Update AS216 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAS216(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAS216+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AS216 with another Field
	 *	@param value
	 */
   public void setAS216(Field source) {
       replace(source,0,source.length(),beginAS216,A_S_216_LEN);
   	
   }  
   
     /**
	 * 	Update AS216 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAS216(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAS216,A_S_216_LEN);
   	
   }
   
     /**
	 * 	Update AS216 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAS216(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAS216+targetIndex,targetLen);
    
   }

	
	
	

		public static int getASGrp216FieldLength() {
			return A_SGRP_216_LENGTH;
		}

}
  
