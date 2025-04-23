package com.cloudframe.app.ar640010.dto;

/**
*  The class CurrentTs840Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CurrentTs840Redefined extends CurrentTs840RedefinedSerialized { 
   

						private char[] currentYear840 = Field.fillLowValue(4);

						private char[] currentMonth840 = Field.fillLowValue(2);

						private char[] currentDay840 = Field.fillLowValue(2);

						private char[] currentHour840 = Field.fillLowValue(2);

						private char[] currentMinute840 = Field.fillLowValue(2);

						private char[] currentSecond840 = Field.fillLowValue(2);
	
	/**
	* Constructor for CurrentTs840Redefined
	**/
    public CurrentTs840Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CurrentTs840Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentTs840Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of currentYear840
	 *	@return currentYear840
	 */
   public char[] getCurrentYear840() throws CFException{
     if (isCurrentYear840Modified()) { 
        currentYear840 = refreshCurrentYear840();
     }
   		return currentYear840;
   }

  
	/**
	*  set variable currentYear840
	*  Corresponding COBOL Variable is 840-CURRENT-YEAR
	*  @param value
	**/
   public void setCurrentYear840(char[] value) {
      currentYear840 = checkCurrentYear840Constraints(value);
      serializeCurrentYear840(currentYear840);
   } 

     /**
	 * 	Update CurrentYear840 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrentYear840(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrentYear840,currentYear840.length);
   	
   }
   
   public void setCurrentYear840(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentYear840,currentYear840.length);
   	
   }
   
     /**
	 * 	Update CurrentYear840 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentYear840(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentYear840+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrentYear840 with another Field
	 *	@param value
	 */
   public void setCurrentYear840(Field source) {
       replace(source,0,source.length(),beginCurrentYear840,CURRENT_YEAR_840_LEN);
   	
   }  
   
     /**
	 * 	Update CurrentYear840 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrentYear840(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrentYear840,CURRENT_YEAR_840_LEN);
   	
   }
   
     /**
	 * 	Update CurrentYear840 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentYear840(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentYear840+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currentMonth840
	 *	@return currentMonth840
	 */
   public char[] getCurrentMonth840() throws CFException{
     if (isCurrentMonth840Modified()) { 
        currentMonth840 = refreshCurrentMonth840();
     }
   		return currentMonth840;
   }

  
	/**
	*  set variable currentMonth840
	*  Corresponding COBOL Variable is 840-CURRENT-MONTH
	*  @param value
	**/
   public void setCurrentMonth840(char[] value) {
      currentMonth840 = checkCurrentMonth840Constraints(value);
      serializeCurrentMonth840(currentMonth840);
   } 

     /**
	 * 	Update CurrentMonth840 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrentMonth840(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrentMonth840,currentMonth840.length);
   	
   }
   
   public void setCurrentMonth840(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentMonth840,currentMonth840.length);
   	
   }
   
     /**
	 * 	Update CurrentMonth840 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentMonth840(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentMonth840+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrentMonth840 with another Field
	 *	@param value
	 */
   public void setCurrentMonth840(Field source) {
       replace(source,0,source.length(),beginCurrentMonth840,CURRENT_MONTH_840_LEN);
   	
   }  
   
     /**
	 * 	Update CurrentMonth840 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrentMonth840(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrentMonth840,CURRENT_MONTH_840_LEN);
   	
   }
   
     /**
	 * 	Update CurrentMonth840 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentMonth840(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentMonth840+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currentDay840
	 *	@return currentDay840
	 */
   public char[] getCurrentDay840() throws CFException{
     if (isCurrentDay840Modified()) { 
        currentDay840 = refreshCurrentDay840();
     }
   		return currentDay840;
   }

  
	/**
	*  set variable currentDay840
	*  Corresponding COBOL Variable is 840-CURRENT-DAY
	*  @param value
	**/
   public void setCurrentDay840(char[] value) {
      currentDay840 = checkCurrentDay840Constraints(value);
      serializeCurrentDay840(currentDay840);
   } 

     /**
	 * 	Update CurrentDay840 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrentDay840(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrentDay840,currentDay840.length);
   	
   }
   
   public void setCurrentDay840(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentDay840,currentDay840.length);
   	
   }
   
     /**
	 * 	Update CurrentDay840 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentDay840(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentDay840+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrentDay840 with another Field
	 *	@param value
	 */
   public void setCurrentDay840(Field source) {
       replace(source,0,source.length(),beginCurrentDay840,CURRENT_DAY_840_LEN);
   	
   }  
   
     /**
	 * 	Update CurrentDay840 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrentDay840(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrentDay840,CURRENT_DAY_840_LEN);
   	
   }
   
     /**
	 * 	Update CurrentDay840 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentDay840(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentDay840+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currentHour840
	 *	@return currentHour840
	 */
   public char[] getCurrentHour840() throws CFException{
     if (isCurrentHour840Modified()) { 
        currentHour840 = refreshCurrentHour840();
     }
   		return currentHour840;
   }

  
	/**
	*  set variable currentHour840
	*  Corresponding COBOL Variable is 840-CURRENT-HOUR
	*  @param value
	**/
   public void setCurrentHour840(char[] value) {
      currentHour840 = checkCurrentHour840Constraints(value);
      serializeCurrentHour840(currentHour840);
   } 

     /**
	 * 	Update CurrentHour840 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrentHour840(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrentHour840,currentHour840.length);
   	
   }
   
   public void setCurrentHour840(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentHour840,currentHour840.length);
   	
   }
   
     /**
	 * 	Update CurrentHour840 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentHour840(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentHour840+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrentHour840 with another Field
	 *	@param value
	 */
   public void setCurrentHour840(Field source) {
       replace(source,0,source.length(),beginCurrentHour840,CURRENT_HOUR_840_LEN);
   	
   }  
   
     /**
	 * 	Update CurrentHour840 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrentHour840(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrentHour840,CURRENT_HOUR_840_LEN);
   	
   }
   
     /**
	 * 	Update CurrentHour840 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentHour840(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentHour840+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currentMinute840
	 *	@return currentMinute840
	 */
   public char[] getCurrentMinute840() throws CFException{
     if (isCurrentMinute840Modified()) { 
        currentMinute840 = refreshCurrentMinute840();
     }
   		return currentMinute840;
   }

  
	/**
	*  set variable currentMinute840
	*  Corresponding COBOL Variable is 840-CURRENT-MINUTE
	*  @param value
	**/
   public void setCurrentMinute840(char[] value) {
      currentMinute840 = checkCurrentMinute840Constraints(value);
      serializeCurrentMinute840(currentMinute840);
   } 

     /**
	 * 	Update CurrentMinute840 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrentMinute840(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrentMinute840,currentMinute840.length);
   	
   }
   
   public void setCurrentMinute840(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentMinute840,currentMinute840.length);
   	
   }
   
     /**
	 * 	Update CurrentMinute840 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentMinute840(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentMinute840+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrentMinute840 with another Field
	 *	@param value
	 */
   public void setCurrentMinute840(Field source) {
       replace(source,0,source.length(),beginCurrentMinute840,CURRENT_MINUTE_840_LEN);
   	
   }  
   
     /**
	 * 	Update CurrentMinute840 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrentMinute840(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrentMinute840,CURRENT_MINUTE_840_LEN);
   	
   }
   
     /**
	 * 	Update CurrentMinute840 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentMinute840(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentMinute840+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currentSecond840
	 *	@return currentSecond840
	 */
   public char[] getCurrentSecond840() throws CFException{
     if (isCurrentSecond840Modified()) { 
        currentSecond840 = refreshCurrentSecond840();
     }
   		return currentSecond840;
   }

  
	/**
	*  set variable currentSecond840
	*  Corresponding COBOL Variable is 840-CURRENT-SECOND
	*  @param value
	**/
   public void setCurrentSecond840(char[] value) {
      currentSecond840 = checkCurrentSecond840Constraints(value);
      serializeCurrentSecond840(currentSecond840);
   } 

     /**
	 * 	Update CurrentSecond840 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrentSecond840(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrentSecond840,currentSecond840.length);
   	
   }
   
   public void setCurrentSecond840(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentSecond840,currentSecond840.length);
   	
   }
   
     /**
	 * 	Update CurrentSecond840 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentSecond840(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentSecond840+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrentSecond840 with another Field
	 *	@param value
	 */
   public void setCurrentSecond840(Field source) {
       replace(source,0,source.length(),beginCurrentSecond840,CURRENT_SECOND_840_LEN);
   	
   }  
   
     /**
	 * 	Update CurrentSecond840 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrentSecond840(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrentSecond840,CURRENT_SECOND_840_LEN);
   	
   }
   
     /**
	 * 	Update CurrentSecond840 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentSecond840(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentSecond840+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCurrentTs840RedefinedFieldLength() {
			return CURRENT_TS_840_REDEFINED_LENGTH;
		}

}
  
