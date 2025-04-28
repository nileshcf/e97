package com.cloudframe.app.global.sharedvar;

/**
*  The class BSGrp14 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class BSGrp14 extends BSGrp14Serialized { 
   

						private char[] fillerWs026 = Field.fillLowValue(3);

						private char[] bS14 = Field.fillLowValue(70);
	
	/**
	* Constructor for BSGrp14
	**/
    public BSGrp14() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fillerWs026
	 *	@return fillerWs026
	 */
   public char[] getFillerWs026() throws CFException{
     if (isFillerWs026Modified()) { 
        fillerWs026 = refreshFillerWs026();
     }
   		return fillerWs026;
   }

  
	/**
	*  set variable fillerWs026
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs026(char[] value) {
      fillerWs026 = checkFillerWs026Constraints(value);
      serializeFillerWs026(fillerWs026);
   } 

     /**
	 * 	Update FillerWs026 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs026(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs026,fillerWs026.length);
   	
   }
   
   public void setFillerWs026(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs026,fillerWs026.length);
   	
   }
   
     /**
	 * 	Update FillerWs026 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs026(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs026+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs026 with another Field
	 *	@param value
	 */
   public void setFillerWs026(Field source) {
       replace(source,0,source.length(),beginFillerWs026,FILLER_WS_026_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs026 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs026(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs026,FILLER_WS_026_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs026 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs026(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs026+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bS14
	 *	@return bS14
	 */
   public char[] getBS14() throws CFException{
     if (isBS14Modified()) { 
        bS14 = refreshBS14();
     }
   		return bS14;
   }

  
	/**
	*  set variable bS14
	*  Corresponding COBOL Variable is WS-14B-S
	*  @param value
	**/
   public void setBS14(char[] value) {
      bS14 = checkBS14Constraints(value);
      serializeBS14(bS14);
   } 

     /**
	 * 	Update BS14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBS14(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBS14,bS14.length);
   	
   }
   
   public void setBS14(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBS14,bS14.length);
   	
   }
   
     /**
	 * 	Update BS14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBS14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBS14+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BS14 with another Field
	 *	@param value
	 */
   public void setBS14(Field source) {
       replace(source,0,source.length(),beginBS14,B_S_14_LEN);
   	
   }  
   
     /**
	 * 	Update BS14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBS14(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBS14,B_S_14_LEN);
   	
   }
   
     /**
	 * 	Update BS14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBS14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBS14+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BSGrp14
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs026(CONSTANTS.SPACE_3);
         setBS14(CONSTANTS.SPACE_70);
   }

		public static int getBSGrp14FieldLength() {
			return B_SGRP_14_LENGTH;
		}

}
  
