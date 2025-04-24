package com.cloudframe.app.ip606130.dto;

/**
*  The class InavalidDateMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InavalidDateMsg600 extends InavalidDateMsg600Serialized { 
   


						private char[] invalidJulianDate600 = new char[5];
	
	/**
	* Constructor for InavalidDateMsg600
	**/
    public InavalidDateMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("INVALID DATE FOUND - ").toCharArray()
             , getStartOffset() + 0
             ,21
             );
								setInvalidJulianDate600(fillSpace(5));
    }


 

	/**
	 *	Returns the value of invalidJulianDate600
	 *	@return invalidJulianDate600
	 */
   public char[] getInvalidJulianDate600() throws CFException{
     if (isInvalidJulianDate600Modified()) { 
        invalidJulianDate600 = refreshInvalidJulianDate600();
     }
   		return invalidJulianDate600;
   }

  
	/**
	*  set variable invalidJulianDate600
	*  Corresponding COBOL Variable is 600-INVALID-JULIAN-DATE
	*  @param value
	**/
   public void setInvalidJulianDate600(char[] value) {
      invalidJulianDate600 = checkInvalidJulianDate600Constraints(value);
      serializeInvalidJulianDate600(invalidJulianDate600);
   } 

     /**
	 * 	Update InvalidJulianDate600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInvalidJulianDate600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInvalidJulianDate600,invalidJulianDate600.length);
   	
   }
   
   public void setInvalidJulianDate600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInvalidJulianDate600,invalidJulianDate600.length);
   	
   }
   
     /**
	 * 	Update InvalidJulianDate600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInvalidJulianDate600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInvalidJulianDate600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InvalidJulianDate600 with another Field
	 *	@param value
	 */
   public void setInvalidJulianDate600(Field source) {
       replace(source,0,source.length(),beginInvalidJulianDate600,INVALID_JULIAN_DATE_600_LEN);
   	
   }  
   
     /**
	 * 	Update InvalidJulianDate600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInvalidJulianDate600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInvalidJulianDate600,INVALID_JULIAN_DATE_600_LEN);
   	
   }
   
     /**
	 * 	Update InvalidJulianDate600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInvalidJulianDate600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInvalidJulianDate600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getInavalidDateMsg600FieldLength() {
			return INAVALID_DATE_MSG_600_LENGTH;
		}

}
  
