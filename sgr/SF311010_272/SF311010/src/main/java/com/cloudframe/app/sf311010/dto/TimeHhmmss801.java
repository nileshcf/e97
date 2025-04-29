package com.cloudframe.app.sf311010.dto;

/**
*  The class TimeHhmmss801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TimeHhmmss801 extends TimeHhmmss801Serialized {
   

						private char[] timeHh801 = new char[2];

						private char[] timeMm801 = new char[2];

						private char[] timeSs801 = new char[2];

	
	/**
	* Constructor for TimeHhmmss801
	**/
    public TimeHhmmss801() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTimeHh801(("00").toCharArray());
								setTimeMm801(("00").toCharArray());
								setTimeSs801(("00").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 6
             ,2
             );
    }


 

	/**
	 *	Returns the value of timeHh801
	 *	@return timeHh801
	 */
   public char[] getTimeHh801() throws CFException{
     if (isTimeHh801Modified()) { 
        timeHh801 = refreshTimeHh801();
     }
   		return timeHh801;
   }

  
	/**
	*  set variable timeHh801
	*  Corresponding COBOL Variable is 801-TIME-HH
	*  @param value
	**/
   public void setTimeHh801(char[] value) {
      timeHh801 = checkTimeHh801Constraints(value);
      serializeTimeHh801(timeHh801);
   } 

     /**
	 * 	Update TimeHh801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTimeHh801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTimeHh801,timeHh801.length);
   	
   }
   
   public void setTimeHh801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTimeHh801,timeHh801.length);
   	
   }
   
     /**
	 * 	Update TimeHh801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTimeHh801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimeHh801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TimeHh801 with another Field
	 *	@param value
	 */
   public void setTimeHh801(Field source) {
       replace(source,0,source.length(),beginTimeHh801,TIME_HH_801_LEN);
   	
   }  
   
     /**
	 * 	Update TimeHh801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTimeHh801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTimeHh801,TIME_HH_801_LEN);
   	
   }
   
     /**
	 * 	Update TimeHh801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTimeHh801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimeHh801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of timeMm801
	 *	@return timeMm801
	 */
   public char[] getTimeMm801() throws CFException{
     if (isTimeMm801Modified()) { 
        timeMm801 = refreshTimeMm801();
     }
   		return timeMm801;
   }

  
	/**
	*  set variable timeMm801
	*  Corresponding COBOL Variable is 801-TIME-MM
	*  @param value
	**/
   public void setTimeMm801(char[] value) {
      timeMm801 = checkTimeMm801Constraints(value);
      serializeTimeMm801(timeMm801);
   } 

     /**
	 * 	Update TimeMm801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTimeMm801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTimeMm801,timeMm801.length);
   	
   }
   
   public void setTimeMm801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTimeMm801,timeMm801.length);
   	
   }
   
     /**
	 * 	Update TimeMm801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTimeMm801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimeMm801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TimeMm801 with another Field
	 *	@param value
	 */
   public void setTimeMm801(Field source) {
       replace(source,0,source.length(),beginTimeMm801,TIME_MM_801_LEN);
   	
   }  
   
     /**
	 * 	Update TimeMm801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTimeMm801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTimeMm801,TIME_MM_801_LEN);
   	
   }
   
     /**
	 * 	Update TimeMm801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTimeMm801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimeMm801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of timeSs801
	 *	@return timeSs801
	 */
   public char[] getTimeSs801() throws CFException{
     if (isTimeSs801Modified()) { 
        timeSs801 = refreshTimeSs801();
     }
   		return timeSs801;
   }

  
	/**
	*  set variable timeSs801
	*  Corresponding COBOL Variable is 801-TIME-SS
	*  @param value
	**/
   public void setTimeSs801(char[] value) {
      timeSs801 = checkTimeSs801Constraints(value);
      serializeTimeSs801(timeSs801);
   } 

     /**
	 * 	Update TimeSs801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTimeSs801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTimeSs801,timeSs801.length);
   	
   }
   
   public void setTimeSs801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTimeSs801,timeSs801.length);
   	
   }
   
     /**
	 * 	Update TimeSs801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTimeSs801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimeSs801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TimeSs801 with another Field
	 *	@param value
	 */
   public void setTimeSs801(Field source) {
       replace(source,0,source.length(),beginTimeSs801,TIME_SS_801_LEN);
   	
   }  
   
     /**
	 * 	Update TimeSs801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTimeSs801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTimeSs801,TIME_SS_801_LEN);
   	
   }
   
     /**
	 * 	Update TimeSs801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTimeSs801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimeSs801+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTimeHhmmss801FieldLength() {
			return TIME_HHMMSS_801_LENGTH;
		}

}
  
