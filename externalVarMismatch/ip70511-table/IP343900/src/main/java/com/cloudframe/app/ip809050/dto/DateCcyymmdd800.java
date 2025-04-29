package com.cloudframe.app.ip809050.dto;

/**
*  The class DateCcyymmdd800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DateCcyymmdd800 extends DateCcyymmdd800Serialized {
   

						private char[] dateYymmdd800 = Field.fillLowValue(6);
	
	/**
	* Constructor for DateCcyymmdd800
	**/
    public DateCcyymmdd800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of dateYymmdd800
	 *	@return dateYymmdd800
	 */
   public char[] getDateYymmdd800() throws CFException{
     if (isDateYymmdd800Modified()) { 
        dateYymmdd800 = refreshDateYymmdd800();
     }
   		return dateYymmdd800;
   }

  
	/**
	*  set variable dateYymmdd800
	*  Corresponding COBOL Variable is 800-DATE-YYMMDD
	*  @param value
	**/
   public void setDateYymmdd800(char[] value) {
      dateYymmdd800 = checkDateYymmdd800Constraints(value);
      serializeDateYymmdd800(dateYymmdd800);
   } 

     /**
	 * 	Update DateYymmdd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDateYymmdd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDateYymmdd800,dateYymmdd800.length);
   	
   }
   
   public void setDateYymmdd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDateYymmdd800,dateYymmdd800.length);
   	
   }
   
     /**
	 * 	Update DateYymmdd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDateYymmdd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateYymmdd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DateYymmdd800 with another Field
	 *	@param value
	 */
   public void setDateYymmdd800(Field source) {
       replace(source,0,source.length(),beginDateYymmdd800,DATE_YYMMDD_800_LEN);
   	
   }  
   
     /**
	 * 	Update DateYymmdd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDateYymmdd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDateYymmdd800,DATE_YYMMDD_800_LEN);
   	
   }
   
     /**
	 * 	Update DateYymmdd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDateYymmdd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateYymmdd800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDateCcyymmdd800FieldLength() {
			return DATE_CCYYMMDD_800_LENGTH;
		}

}
  
