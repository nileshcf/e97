package com.cloudframe.app.sf320010.dto;

/**
*  The class RpCoEoj15 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpCoEoj15 extends RpCoEoj15Serialized {
   



								private char[] rpCoEoj15TtlOther = Field.fillLowValue(6);

	
	/**
	* Constructor for RpCoEoj15
	**/
    public RpCoEoj15() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("OTHER LOG TYPE RECORDS READ              - ").toCharArray()
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
	 *	Returns the value of rpCoEoj15TtlOther
	 *	@return rpCoEoj15TtlOther
	 */
   public char[] getRpCoEoj15TtlOther() throws CFException{
     if (isRpCoEoj15TtlOtherModified()) { 
        rpCoEoj15TtlOther = refreshRpCoEoj15TtlOther();
     }
   		return rpCoEoj15TtlOther;
   }

  
	/**
	*  set variable rpCoEoj15TtlOther
	*  Corresponding COBOL Variable is RP-CO-EOJ15-TTL-OTHER
	*  @param value
	**/
   public void setRpCoEoj15TtlOther(char[] value) {
      rpCoEoj15TtlOther = checkRpCoEoj15TtlOtherConstraints(value);
      serializeRpCoEoj15TtlOther(rpCoEoj15TtlOther);
   } 

     /**
	 * 	Update RpCoEoj15TtlOther 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpCoEoj15TtlOther(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpCoEoj15TtlOther,rpCoEoj15TtlOther.length);
   	
   }
   
   public void setRpCoEoj15TtlOther(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj15TtlOther,rpCoEoj15TtlOther.length);
   	
   }
   
     /**
	 * 	Update RpCoEoj15TtlOther 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj15TtlOther(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj15TtlOther+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpCoEoj15TtlOther with another Field
	 *	@param value
	 */
   public void setRpCoEoj15TtlOther(Field source) {
       replace(source,0,source.length(),beginRpCoEoj15TtlOther,RP_CO_EOJ_15_TTL_OTHER_LEN);
   	
   }  
   
     /**
	 * 	Update RpCoEoj15TtlOther 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpCoEoj15TtlOther(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpCoEoj15TtlOther,RP_CO_EOJ_15_TTL_OTHER_LEN);
   	
   }
   
     /**
	 * 	Update RpCoEoj15TtlOther 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj15TtlOther(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj15TtlOther+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpCoEoj15FieldLength() {
			return RP_CO_EOJ_15_LENGTH;
		}

}
  
