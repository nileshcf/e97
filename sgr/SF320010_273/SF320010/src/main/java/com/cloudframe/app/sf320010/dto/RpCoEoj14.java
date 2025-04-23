package com.cloudframe.app.sf320010.dto;

/**
*  The class RpCoEoj14 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpCoEoj14 extends RpCoEoj14Serialized {
   



								private char[] rpCoEoj14TtlBulk32 = Field.fillLowValue(6);

	
	/**
	* Constructor for RpCoEoj14
	**/
    public RpCoEoj14() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("NBR BULK DATA TRANS WITH 32 BYTE BULK ID - ").toCharArray()
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
	 *	Returns the value of rpCoEoj14TtlBulk32
	 *	@return rpCoEoj14TtlBulk32
	 */
   public char[] getRpCoEoj14TtlBulk32() throws CFException{
     if (isRpCoEoj14TtlBulk32Modified()) { 
        rpCoEoj14TtlBulk32 = refreshRpCoEoj14TtlBulk32();
     }
   		return rpCoEoj14TtlBulk32;
   }

  
	/**
	*  set variable rpCoEoj14TtlBulk32
	*  Corresponding COBOL Variable is RP-CO-EOJ14-TTL-BULK32
	*  @param value
	**/
   public void setRpCoEoj14TtlBulk32(char[] value) {
      rpCoEoj14TtlBulk32 = checkRpCoEoj14TtlBulk32Constraints(value);
      serializeRpCoEoj14TtlBulk32(rpCoEoj14TtlBulk32);
   } 

     /**
	 * 	Update RpCoEoj14TtlBulk32 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpCoEoj14TtlBulk32(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpCoEoj14TtlBulk32,rpCoEoj14TtlBulk32.length);
   	
   }
   
   public void setRpCoEoj14TtlBulk32(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj14TtlBulk32,rpCoEoj14TtlBulk32.length);
   	
   }
   
     /**
	 * 	Update RpCoEoj14TtlBulk32 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj14TtlBulk32(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj14TtlBulk32+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpCoEoj14TtlBulk32 with another Field
	 *	@param value
	 */
   public void setRpCoEoj14TtlBulk32(Field source) {
       replace(source,0,source.length(),beginRpCoEoj14TtlBulk32,RP_CO_EOJ_14_TTL_BULK_32_LEN);
   	
   }  
   
     /**
	 * 	Update RpCoEoj14TtlBulk32 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpCoEoj14TtlBulk32(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpCoEoj14TtlBulk32,RP_CO_EOJ_14_TTL_BULK_32_LEN);
   	
   }
   
     /**
	 * 	Update RpCoEoj14TtlBulk32 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj14TtlBulk32(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj14TtlBulk32+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpCoEoj14FieldLength() {
			return RP_CO_EOJ_14_LENGTH;
		}

}
  
