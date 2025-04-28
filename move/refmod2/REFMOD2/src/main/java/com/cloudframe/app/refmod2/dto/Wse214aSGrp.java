package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse214aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse214aSGrp extends Wse214aSGrpSerialized { 
   

						private char[] wse214aS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse214aSGrp
	**/
    public Wse214aSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse214aS
	 *	@return wse214aS
	 */
   public char[] getWse214aS() throws CFException{
     if (isWse214aSModified()) { 
        wse214aS = refreshWse214aS();
     }
   		return wse214aS;
   }

  
	/**
	*  set variable wse214aS
	*  Corresponding COBOL Variable is WSE-2-14A-S
	*  @param value
	**/
   public void setWse214aS(char[] value) {
      wse214aS = checkWse214aSConstraints(value);
      serializeWse214aS(wse214aS);
   } 

     /**
	 * 	Update Wse214aS 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse214aS(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse214aS,wse214aS.length);
   	
   }
   
   public void setWse214aS(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse214aS,wse214aS.length);
   	
   }
   
     /**
	 * 	Update Wse214aS 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse214aS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse214aS+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse214aS with another Field
	 *	@param value
	 */
   public void setWse214aS(Field source) {
       replace(source,0,source.length(),beginWse214aS,WSE_214A_S_LEN);
   	
   }  
   
     /**
	 * 	Update Wse214aS 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse214aS(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse214aS,WSE_214A_S_LEN);
   	
   }
   
     /**
	 * 	Update Wse214aS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse214aS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse214aS+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse214aSGrpFieldLength() {
			return WSE_214A_SGRP_LENGTH;
		}

}
  
