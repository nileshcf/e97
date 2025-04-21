package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse214bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse214bSGrp extends Wse214bSGrpSerialized {
   

						private char[] wse214bS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse214bSGrp
	**/
    public Wse214bSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse214bS
	 *	@return wse214bS
	 */
   public char[] getWse214bS() throws CFException{
     if (isWse214bSModified()) { 
        wse214bS = refreshWse214bS();
     }
   		return wse214bS;
   }

  
	/**
	*  set variable wse214bS
	*  Corresponding COBOL Variable is WSE-2-14B-S
	*  @param value
	**/
   public void setWse214bS(char[] value) {
      wse214bS = checkWse214bSConstraints(value);
      serializeWse214bS(wse214bS);
   } 

     /**
	 * 	Update Wse214bS 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse214bS(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse214bS,wse214bS.length);
   	
   }
   
   public void setWse214bS(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse214bS,wse214bS.length);
   	
   }
   
     /**
	 * 	Update Wse214bS 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse214bS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse214bS+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse214bS with another Field
	 *	@param value
	 */
   public void setWse214bS(Field source) {
       replace(source,0,source.length(),beginWse214bS,WSE_214B_S_LEN);
   	
   }  
   
     /**
	 * 	Update Wse214bS 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse214bS(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse214bS,WSE_214B_S_LEN);
   	
   }
   
     /**
	 * 	Update Wse214bS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse214bS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse214bS+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse214bSGrpFieldLength() {
			return WSE_214B_SGRP_LENGTH;
		}

}
  
