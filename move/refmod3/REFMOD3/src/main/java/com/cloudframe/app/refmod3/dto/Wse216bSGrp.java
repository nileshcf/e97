package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse216bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse216bSGrp extends Wse216bSGrpSerialized {
   

						private char[] wse216bS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse216bSGrp
	**/
    public Wse216bSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse216bS
	 *	@return wse216bS
	 */
   public char[] getWse216bS() throws CFException{
     if (isWse216bSModified()) { 
        wse216bS = refreshWse216bS();
     }
   		return wse216bS;
   }

  
	/**
	*  set variable wse216bS
	*  Corresponding COBOL Variable is WSE-2-16B-S
	*  @param value
	**/
   public void setWse216bS(char[] value) {
      wse216bS = checkWse216bSConstraints(value);
      serializeWse216bS(wse216bS);
   } 

     /**
	 * 	Update Wse216bS 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse216bS(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse216bS,wse216bS.length);
   	
   }
   
   public void setWse216bS(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse216bS,wse216bS.length);
   	
   }
   
     /**
	 * 	Update Wse216bS 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse216bS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse216bS+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse216bS with another Field
	 *	@param value
	 */
   public void setWse216bS(Field source) {
       replace(source,0,source.length(),beginWse216bS,WSE_216B_S_LEN);
   	
   }  
   
     /**
	 * 	Update Wse216bS 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse216bS(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse216bS,WSE_216B_S_LEN);
   	
   }
   
     /**
	 * 	Update Wse216bS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse216bS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse216bS+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse216bSGrpFieldLength() {
			return WSE_216B_SGRP_LENGTH;
		}

}
  
