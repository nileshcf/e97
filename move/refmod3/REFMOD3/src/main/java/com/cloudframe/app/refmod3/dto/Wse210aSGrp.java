package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse210aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse210aSGrp extends Wse210aSGrpSerialized {
   

						private char[] wse210aS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse210aSGrp
	**/
    public Wse210aSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse210aS
	 *	@return wse210aS
	 */
   public char[] getWse210aS() throws CFException{
     if (isWse210aSModified()) { 
        wse210aS = refreshWse210aS();
     }
   		return wse210aS;
   }

  
	/**
	*  set variable wse210aS
	*  Corresponding COBOL Variable is WSE-2-10A-S
	*  @param value
	**/
   public void setWse210aS(char[] value) {
      wse210aS = checkWse210aSConstraints(value);
      serializeWse210aS(wse210aS);
   } 

     /**
	 * 	Update Wse210aS 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse210aS(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse210aS,wse210aS.length);
   	
   }
   
   public void setWse210aS(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse210aS,wse210aS.length);
   	
   }
   
     /**
	 * 	Update Wse210aS 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse210aS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse210aS+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse210aS with another Field
	 *	@param value
	 */
   public void setWse210aS(Field source) {
       replace(source,0,source.length(),beginWse210aS,WSE_210A_S_LEN);
   	
   }  
   
     /**
	 * 	Update Wse210aS 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse210aS(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse210aS,WSE_210A_S_LEN);
   	
   }
   
     /**
	 * 	Update Wse210aS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse210aS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse210aS+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse210aSGrpFieldLength() {
			return WSE_210A_SGRP_LENGTH;
		}

}
  
