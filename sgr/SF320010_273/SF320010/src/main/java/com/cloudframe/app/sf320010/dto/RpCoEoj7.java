package com.cloudframe.app.sf320010.dto;

/**
*  The class RpCoEoj7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpCoEoj7 extends RpCoEoj7Serialized {
   



								private char[] rpCoEoj7TotalMip = Field.fillLowValue(6);

	
	/**
	* Constructor for RpCoEoj7
	**/
    public RpCoEoj7() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("MIP PROFILE LOG RECORDS READ             - ").toCharArray()
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
	 *	Returns the value of rpCoEoj7TotalMip
	 *	@return rpCoEoj7TotalMip
	 */
   public char[] getRpCoEoj7TotalMip() throws CFException{
     if (isRpCoEoj7TotalMipModified()) { 
        rpCoEoj7TotalMip = refreshRpCoEoj7TotalMip();
     }
   		return rpCoEoj7TotalMip;
   }

  
	/**
	*  set variable rpCoEoj7TotalMip
	*  Corresponding COBOL Variable is RP-CO-EOJ7-TOTAL-MIP
	*  @param value
	**/
   public void setRpCoEoj7TotalMip(char[] value) {
      rpCoEoj7TotalMip = checkRpCoEoj7TotalMipConstraints(value);
      serializeRpCoEoj7TotalMip(rpCoEoj7TotalMip);
   } 

     /**
	 * 	Update RpCoEoj7TotalMip 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpCoEoj7TotalMip(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpCoEoj7TotalMip,rpCoEoj7TotalMip.length);
   	
   }
   
   public void setRpCoEoj7TotalMip(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj7TotalMip,rpCoEoj7TotalMip.length);
   	
   }
   
     /**
	 * 	Update RpCoEoj7TotalMip 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj7TotalMip(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj7TotalMip+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpCoEoj7TotalMip with another Field
	 *	@param value
	 */
   public void setRpCoEoj7TotalMip(Field source) {
       replace(source,0,source.length(),beginRpCoEoj7TotalMip,RP_CO_EOJ_7_TOTAL_MIP_LEN);
   	
   }  
   
     /**
	 * 	Update RpCoEoj7TotalMip 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpCoEoj7TotalMip(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpCoEoj7TotalMip,RP_CO_EOJ_7_TOTAL_MIP_LEN);
   	
   }
   
     /**
	 * 	Update RpCoEoj7TotalMip 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj7TotalMip(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj7TotalMip+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpCoEoj7FieldLength() {
			return RP_CO_EOJ_7_LENGTH;
		}

}
  
