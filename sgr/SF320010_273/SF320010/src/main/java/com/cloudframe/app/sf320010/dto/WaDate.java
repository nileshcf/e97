package com.cloudframe.app.sf320010.dto;

/**
*  The class WaDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WaDate extends WaDateSerialized {
   

						private char[] waDateMonth = Field.fillLowValue(2);


						private char[] waDateDay = Field.fillLowValue(2);


						private char[] waDateYear = Field.fillLowValue(2);
	
	/**
	* Constructor for WaDate
	**/
    public WaDate() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 2
             ,1
             );
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 5
             ,1
             );
    }


 

	/**
	 *	Returns the value of waDateMonth
	 *	@return waDateMonth
	 */
   public char[] getWaDateMonth() throws CFException{
     if (isWaDateMonthModified()) { 
        waDateMonth = refreshWaDateMonth();
     }
   		return waDateMonth;
   }

  
	/**
	*  set variable waDateMonth
	*  Corresponding COBOL Variable is WA-DATE-MONTH
	*  @param value
	**/
   public void setWaDateMonth(char[] value) {
      waDateMonth = checkWaDateMonthConstraints(value);
      serializeWaDateMonth(waDateMonth);
   } 

     /**
	 * 	Update WaDateMonth 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaDateMonth(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWaDateMonth,waDateMonth.length);
   	
   }
   
   public void setWaDateMonth(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateMonth,waDateMonth.length);
   	
   }
   
     /**
	 * 	Update WaDateMonth 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaDateMonth(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateMonth+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WaDateMonth with another Field
	 *	@param value
	 */
   public void setWaDateMonth(Field source) {
       replace(source,0,source.length(),beginWaDateMonth,WA_DATE_MONTH_LEN);
   	
   }  
   
     /**
	 * 	Update WaDateMonth 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaDateMonth(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWaDateMonth,WA_DATE_MONTH_LEN);
   	
   }
   
     /**
	 * 	Update WaDateMonth 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaDateMonth(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateMonth+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of waDateDay
	 *	@return waDateDay
	 */
   public char[] getWaDateDay() throws CFException{
     if (isWaDateDayModified()) { 
        waDateDay = refreshWaDateDay();
     }
   		return waDateDay;
   }

  
	/**
	*  set variable waDateDay
	*  Corresponding COBOL Variable is WA-DATE-DAY
	*  @param value
	**/
   public void setWaDateDay(char[] value) {
      waDateDay = checkWaDateDayConstraints(value);
      serializeWaDateDay(waDateDay);
   } 

     /**
	 * 	Update WaDateDay 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaDateDay(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWaDateDay,waDateDay.length);
   	
   }
   
   public void setWaDateDay(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateDay,waDateDay.length);
   	
   }
   
     /**
	 * 	Update WaDateDay 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaDateDay(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateDay+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WaDateDay with another Field
	 *	@param value
	 */
   public void setWaDateDay(Field source) {
       replace(source,0,source.length(),beginWaDateDay,WA_DATE_DAY_LEN);
   	
   }  
   
     /**
	 * 	Update WaDateDay 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaDateDay(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWaDateDay,WA_DATE_DAY_LEN);
   	
   }
   
     /**
	 * 	Update WaDateDay 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaDateDay(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateDay+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of waDateYear
	 *	@return waDateYear
	 */
   public char[] getWaDateYear() throws CFException{
     if (isWaDateYearModified()) { 
        waDateYear = refreshWaDateYear();
     }
   		return waDateYear;
   }

  
	/**
	*  set variable waDateYear
	*  Corresponding COBOL Variable is WA-DATE-YEAR
	*  @param value
	**/
   public void setWaDateYear(char[] value) {
      waDateYear = checkWaDateYearConstraints(value);
      serializeWaDateYear(waDateYear);
   } 

     /**
	 * 	Update WaDateYear 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaDateYear(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWaDateYear,waDateYear.length);
   	
   }
   
   public void setWaDateYear(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateYear,waDateYear.length);
   	
   }
   
     /**
	 * 	Update WaDateYear 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaDateYear(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateYear+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WaDateYear with another Field
	 *	@param value
	 */
   public void setWaDateYear(Field source) {
       replace(source,0,source.length(),beginWaDateYear,WA_DATE_YEAR_LEN);
   	
   }  
   
     /**
	 * 	Update WaDateYear 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaDateYear(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWaDateYear,WA_DATE_YEAR_LEN);
   	
   }
   
     /**
	 * 	Update WaDateYear 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaDateYear(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateYear+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWaDateFieldLength() {
			return WA_DATE_LENGTH;
		}

}
  
