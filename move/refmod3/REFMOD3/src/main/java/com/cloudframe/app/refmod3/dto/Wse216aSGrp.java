package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse216aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse216aSGrp extends Wse216aSGrpSerialized {
   

						private char[] wse216aS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse216aSGrp
	**/
    public Wse216aSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse216aS
	 *	@return wse216aS
	 */
   public char[] getWse216aS() throws CFException{
     if (isWse216aSModified()) { 
        wse216aS = refreshWse216aS();
     }
   		return wse216aS;
   }

  
	/**
	*  set variable wse216aS
	*  Corresponding COBOL Variable is WSE-2-16A-S
	*  @param value
	**/
   public void setWse216aS(char[] value) {
      wse216aS = checkWse216aSConstraints(value);
      serializeWse216aS(wse216aS);
   } 

     /**
	 * 	Update Wse216aS 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse216aS(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse216aS,wse216aS.length);
   	
   }
   
   public void setWse216aS(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse216aS,wse216aS.length);
   	
   }
   
     /**
	 * 	Update Wse216aS 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse216aS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse216aS+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse216aS with another Field
	 *	@param value
	 */
   public void setWse216aS(Field source) {
       replace(source,0,source.length(),beginWse216aS,WSE_216A_S_LEN);
   	
   }  
   
     /**
	 * 	Update Wse216aS 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse216aS(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse216aS,WSE_216A_S_LEN);
   	
   }
   
     /**
	 * 	Update Wse216aS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse216aS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse216aS+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse216aSGrpFieldLength() {
			return WSE_216A_SGRP_LENGTH;
		}

}
  
