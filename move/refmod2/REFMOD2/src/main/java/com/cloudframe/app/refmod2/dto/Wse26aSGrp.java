package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse26aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse26aSGrp extends Wse26aSGrpSerialized {
   

						private char[] wse26aS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse26aSGrp
	**/
    public Wse26aSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse26aS
	 *	@return wse26aS
	 */
   public char[] getWse26aS() throws CFException{
     if (isWse26aSModified()) { 
        wse26aS = refreshWse26aS();
     }
   		return wse26aS;
   }

  
	/**
	*  set variable wse26aS
	*  Corresponding COBOL Variable is WSE-2-6A-S
	*  @param value
	**/
   public void setWse26aS(char[] value) {
      wse26aS = checkWse26aSConstraints(value);
      serializeWse26aS(wse26aS);
   } 

     /**
	 * 	Update Wse26aS 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse26aS(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse26aS,wse26aS.length);
   	
   }
   
   public void setWse26aS(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse26aS,wse26aS.length);
   	
   }
   
     /**
	 * 	Update Wse26aS 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse26aS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse26aS+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse26aS with another Field
	 *	@param value
	 */
   public void setWse26aS(Field source) {
       replace(source,0,source.length(),beginWse26aS,WSE_26A_S_LEN);
   	
   }  
   
     /**
	 * 	Update Wse26aS 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse26aS(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse26aS,WSE_26A_S_LEN);
   	
   }
   
     /**
	 * 	Update Wse26aS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse26aS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse26aS+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse26aSGrpFieldLength() {
			return WSE_26A_SGRP_LENGTH;
		}

}
  
