package com.cloudframe.app.sf320010.dto;

/**
*  The class RpCoEoj12 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpCoEoj12 extends RpCoEoj12Serialized {
   



								private char[] rpCoEoj12TotalEdc = Field.fillLowValue(6);

	
	/**
	* Constructor for RpCoEoj12
	**/
    public RpCoEoj12() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("EDC LOG RECORDS READ                     - ").toCharArray()
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
	 *	Returns the value of rpCoEoj12TotalEdc
	 *	@return rpCoEoj12TotalEdc
	 */
   public char[] getRpCoEoj12TotalEdc() throws CFException{
     if (isRpCoEoj12TotalEdcModified()) { 
        rpCoEoj12TotalEdc = refreshRpCoEoj12TotalEdc();
     }
   		return rpCoEoj12TotalEdc;
   }

  
	/**
	*  set variable rpCoEoj12TotalEdc
	*  Corresponding COBOL Variable is RP-CO-EOJ12-TOTAL-EDC
	*  @param value
	**/
   public void setRpCoEoj12TotalEdc(char[] value) {
      rpCoEoj12TotalEdc = checkRpCoEoj12TotalEdcConstraints(value);
      serializeRpCoEoj12TotalEdc(rpCoEoj12TotalEdc);
   } 

     /**
	 * 	Update RpCoEoj12TotalEdc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpCoEoj12TotalEdc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpCoEoj12TotalEdc,rpCoEoj12TotalEdc.length);
   	
   }
   
   public void setRpCoEoj12TotalEdc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj12TotalEdc,rpCoEoj12TotalEdc.length);
   	
   }
   
     /**
	 * 	Update RpCoEoj12TotalEdc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj12TotalEdc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj12TotalEdc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpCoEoj12TotalEdc with another Field
	 *	@param value
	 */
   public void setRpCoEoj12TotalEdc(Field source) {
       replace(source,0,source.length(),beginRpCoEoj12TotalEdc,RP_CO_EOJ_12_TOTAL_EDC_LEN);
   	
   }  
   
     /**
	 * 	Update RpCoEoj12TotalEdc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpCoEoj12TotalEdc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpCoEoj12TotalEdc,RP_CO_EOJ_12_TOTAL_EDC_LEN);
   	
   }
   
     /**
	 * 	Update RpCoEoj12TotalEdc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj12TotalEdc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj12TotalEdc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpCoEoj12FieldLength() {
			return RP_CO_EOJ_12_LENGTH;
		}

}
  
