package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse210bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse210bSGrp extends Wse210bSGrpSerialized {
   

						private char[] wse210bS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse210bSGrp
	**/
    public Wse210bSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse210bS
	 *	@return wse210bS
	 */
   public char[] getWse210bS() throws CFException{
     if (isWse210bSModified()) { 
        wse210bS = refreshWse210bS();
     }
   		return wse210bS;
   }

  
	/**
	*  set variable wse210bS
	*  Corresponding COBOL Variable is WSE-2-10B-S
	*  @param value
	**/
   public void setWse210bS(char[] value) {
      wse210bS = checkWse210bSConstraints(value);
      serializeWse210bS(wse210bS);
   } 

     /**
	 * 	Update Wse210bS 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse210bS(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse210bS,wse210bS.length);
   	
   }
   
   public void setWse210bS(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse210bS,wse210bS.length);
   	
   }
   
     /**
	 * 	Update Wse210bS 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse210bS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse210bS+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse210bS with another Field
	 *	@param value
	 */
   public void setWse210bS(Field source) {
       replace(source,0,source.length(),beginWse210bS,WSE_210B_S_LEN);
   	
   }  
   
     /**
	 * 	Update Wse210bS 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse210bS(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse210bS,WSE_210B_S_LEN);
   	
   }
   
     /**
	 * 	Update Wse210bS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse210bS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse210bS+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse210bSGrpFieldLength() {
			return WSE_210B_SGRP_LENGTH;
		}

}
  
