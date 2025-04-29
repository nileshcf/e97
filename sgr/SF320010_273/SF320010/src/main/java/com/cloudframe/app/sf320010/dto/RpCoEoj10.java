package com.cloudframe.app.sf320010.dto;

/**
*  The class RpCoEoj10 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpCoEoj10 extends RpCoEoj10Serialized {
   



								private char[] rpCoEoj10TotalX92 = Field.fillLowValue(6);

	
	/**
	* Constructor for RpCoEoj10
	**/
    public RpCoEoj10() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("X9.2 ACTIVITY LOG RECORD READ            - ").toCharArray()
             , getStartOffset() + 1
             ,43
             );
       replaceValue( // serialize and save the value
             pad(84," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 50
             ,84
             );
    }


 

	/**
	 *	Returns the value of rpCoEoj10TotalX92
	 *	@return rpCoEoj10TotalX92
	 */
   public char[] getRpCoEoj10TotalX92() throws CFException{
     if (isRpCoEoj10TotalX92Modified()) { 
        rpCoEoj10TotalX92 = refreshRpCoEoj10TotalX92();
     }
   		return rpCoEoj10TotalX92;
   }

  
	/**
	*  set variable rpCoEoj10TotalX92
	*  Corresponding COBOL Variable is RP-CO-EOJ10-TOTAL-X92
	*  @param value
	**/
   public void setRpCoEoj10TotalX92(char[] value) {
      rpCoEoj10TotalX92 = checkRpCoEoj10TotalX92Constraints(value);
      serializeRpCoEoj10TotalX92(rpCoEoj10TotalX92);
   } 

     /**
	 * 	Update RpCoEoj10TotalX92 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpCoEoj10TotalX92(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpCoEoj10TotalX92,rpCoEoj10TotalX92.length);
   	
   }
   
   public void setRpCoEoj10TotalX92(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj10TotalX92,rpCoEoj10TotalX92.length);
   	
   }
   
     /**
	 * 	Update RpCoEoj10TotalX92 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj10TotalX92(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj10TotalX92+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpCoEoj10TotalX92 with another Field
	 *	@param value
	 */
   public void setRpCoEoj10TotalX92(Field source) {
       replace(source,0,source.length(),beginRpCoEoj10TotalX92,RP_CO_EOJ_10_TOTAL_X_92_LEN);
   	
   }  
   
     /**
	 * 	Update RpCoEoj10TotalX92 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpCoEoj10TotalX92(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpCoEoj10TotalX92,RP_CO_EOJ_10_TOTAL_X_92_LEN);
   	
   }
   
     /**
	 * 	Update RpCoEoj10TotalX92 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj10TotalX92(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj10TotalX92+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpCoEoj10FieldLength() {
			return RP_CO_EOJ_10_LENGTH;
		}

}
  
