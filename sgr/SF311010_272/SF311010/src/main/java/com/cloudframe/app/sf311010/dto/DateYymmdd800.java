package com.cloudframe.app.sf311010.dto;

/**
*  The class DateYymmdd800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DateYymmdd800 extends DateYymmdd800Serialized {
   

						private char[] dateYy800 = Field.fillLowValue(2);

						private char[] dateMm800 = Field.fillLowValue(2);

						private char[] dateDd800 = Field.fillLowValue(2);
	
	/**
	* Constructor for DateYymmdd800
	**/
    public DateYymmdd800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of dateYy800
	 *	@return dateYy800
	 */
   public char[] getDateYy800() throws CFException{
     if (isDateYy800Modified()) { 
        dateYy800 = refreshDateYy800();
     }
   		return dateYy800;
   }

  
	/**
	*  set variable dateYy800
	*  Corresponding COBOL Variable is 800-DATE-YY
	*  @param value
	**/
   public void setDateYy800(char[] value) {
      dateYy800 = checkDateYy800Constraints(value);
      serializeDateYy800(dateYy800);
   } 

     /**
	 * 	Update DateYy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDateYy800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDateYy800,dateYy800.length);
   	
   }
   
   public void setDateYy800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDateYy800,dateYy800.length);
   	
   }
   
     /**
	 * 	Update DateYy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDateYy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateYy800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DateYy800 with another Field
	 *	@param value
	 */
   public void setDateYy800(Field source) {
       replace(source,0,source.length(),beginDateYy800,DATE_YY_800_LEN);
   	
   }  
   
     /**
	 * 	Update DateYy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDateYy800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDateYy800,DATE_YY_800_LEN);
   	
   }
   
     /**
	 * 	Update DateYy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDateYy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateYy800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dateMm800
	 *	@return dateMm800
	 */
   public char[] getDateMm800() throws CFException{
     if (isDateMm800Modified()) { 
        dateMm800 = refreshDateMm800();
     }
   		return dateMm800;
   }

  
	/**
	*  set variable dateMm800
	*  Corresponding COBOL Variable is 800-DATE-MM
	*  @param value
	**/
   public void setDateMm800(char[] value) {
      dateMm800 = checkDateMm800Constraints(value);
      serializeDateMm800(dateMm800);
   } 

     /**
	 * 	Update DateMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDateMm800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDateMm800,dateMm800.length);
   	
   }
   
   public void setDateMm800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDateMm800,dateMm800.length);
   	
   }
   
     /**
	 * 	Update DateMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDateMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateMm800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DateMm800 with another Field
	 *	@param value
	 */
   public void setDateMm800(Field source) {
       replace(source,0,source.length(),beginDateMm800,DATE_MM_800_LEN);
   	
   }  
   
     /**
	 * 	Update DateMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDateMm800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDateMm800,DATE_MM_800_LEN);
   	
   }
   
     /**
	 * 	Update DateMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDateMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateMm800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dateDd800
	 *	@return dateDd800
	 */
   public char[] getDateDd800() throws CFException{
     if (isDateDd800Modified()) { 
        dateDd800 = refreshDateDd800();
     }
   		return dateDd800;
   }

  
	/**
	*  set variable dateDd800
	*  Corresponding COBOL Variable is 800-DATE-DD
	*  @param value
	**/
   public void setDateDd800(char[] value) {
      dateDd800 = checkDateDd800Constraints(value);
      serializeDateDd800(dateDd800);
   } 

     /**
	 * 	Update DateDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDateDd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDateDd800,dateDd800.length);
   	
   }
   
   public void setDateDd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDateDd800,dateDd800.length);
   	
   }
   
     /**
	 * 	Update DateDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDateDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateDd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DateDd800 with another Field
	 *	@param value
	 */
   public void setDateDd800(Field source) {
       replace(source,0,source.length(),beginDateDd800,DATE_DD_800_LEN);
   	
   }  
   
     /**
	 * 	Update DateDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDateDd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDateDd800,DATE_DD_800_LEN);
   	
   }
   
     /**
	 * 	Update DateDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDateDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateDd800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDateYymmdd800FieldLength() {
			return DATE_YYMMDD_800_LENGTH;
		}

}
  
