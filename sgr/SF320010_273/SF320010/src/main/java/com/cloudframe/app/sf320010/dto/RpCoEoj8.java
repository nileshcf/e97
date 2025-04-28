package com.cloudframe.app.sf320010.dto;

/**
*  The class RpCoEoj8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpCoEoj8 extends RpCoEoj8Serialized {
   



								private char[] rpCoEoj8TotalTypeii = Field.fillLowValue(6);

	
	/**
	* Constructor for RpCoEoj8
	**/
    public RpCoEoj8() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("TYPE II PASS-THRU LOG RECORDS READ       - ").toCharArray()
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
	 *	Returns the value of rpCoEoj8TotalTypeii
	 *	@return rpCoEoj8TotalTypeii
	 */
   public char[] getRpCoEoj8TotalTypeii() throws CFException{
     if (isRpCoEoj8TotalTypeiiModified()) { 
        rpCoEoj8TotalTypeii = refreshRpCoEoj8TotalTypeii();
     }
   		return rpCoEoj8TotalTypeii;
   }

  
	/**
	*  set variable rpCoEoj8TotalTypeii
	*  Corresponding COBOL Variable is RP-CO-EOJ8-TOTAL-TYPEII
	*  @param value
	**/
   public void setRpCoEoj8TotalTypeii(char[] value) {
      rpCoEoj8TotalTypeii = checkRpCoEoj8TotalTypeiiConstraints(value);
      serializeRpCoEoj8TotalTypeii(rpCoEoj8TotalTypeii);
   } 

     /**
	 * 	Update RpCoEoj8TotalTypeii 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpCoEoj8TotalTypeii(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpCoEoj8TotalTypeii,rpCoEoj8TotalTypeii.length);
   	
   }
   
   public void setRpCoEoj8TotalTypeii(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj8TotalTypeii,rpCoEoj8TotalTypeii.length);
   	
   }
   
     /**
	 * 	Update RpCoEoj8TotalTypeii 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj8TotalTypeii(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj8TotalTypeii+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpCoEoj8TotalTypeii with another Field
	 *	@param value
	 */
   public void setRpCoEoj8TotalTypeii(Field source) {
       replace(source,0,source.length(),beginRpCoEoj8TotalTypeii,RP_CO_EOJ_8_TOTAL_TYPEII_LEN);
   	
   }  
   
     /**
	 * 	Update RpCoEoj8TotalTypeii 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpCoEoj8TotalTypeii(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpCoEoj8TotalTypeii,RP_CO_EOJ_8_TOTAL_TYPEII_LEN);
   	
   }
   
     /**
	 * 	Update RpCoEoj8TotalTypeii 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj8TotalTypeii(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj8TotalTypeii+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpCoEoj8FieldLength() {
			return RP_CO_EOJ_8_LENGTH;
		}

}
  
