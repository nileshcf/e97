package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse26bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse26bSGrp extends Wse26bSGrpSerialized {
   

						private char[] wse26bS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse26bSGrp
	**/
    public Wse26bSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse26bS
	 *	@return wse26bS
	 */
   public char[] getWse26bS() throws CFException{
     if (isWse26bSModified()) { 
        wse26bS = refreshWse26bS();
     }
   		return wse26bS;
   }

  
	/**
	*  set variable wse26bS
	*  Corresponding COBOL Variable is WSE-2-6B-S
	*  @param value
	**/
   public void setWse26bS(char[] value) {
      wse26bS = checkWse26bSConstraints(value);
      serializeWse26bS(wse26bS);
   } 

     /**
	 * 	Update Wse26bS 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse26bS(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse26bS,wse26bS.length);
   	
   }
   
   public void setWse26bS(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse26bS,wse26bS.length);
   	
   }
   
     /**
	 * 	Update Wse26bS 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse26bS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse26bS+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse26bS with another Field
	 *	@param value
	 */
   public void setWse26bS(Field source) {
       replace(source,0,source.length(),beginWse26bS,WSE_26B_S_LEN);
   	
   }  
   
     /**
	 * 	Update Wse26bS 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse26bS(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse26bS,WSE_26B_S_LEN);
   	
   }
   
     /**
	 * 	Update Wse26bS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse26bS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse26bS+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse26bSGrpFieldLength() {
			return WSE_26B_SGRP_LENGTH;
		}

}
  
