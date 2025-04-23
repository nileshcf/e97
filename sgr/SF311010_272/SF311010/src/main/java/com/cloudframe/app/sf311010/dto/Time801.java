package com.cloudframe.app.sf311010.dto;

/**
*  The class Time801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Time801 extends Time801Serialized {
   

						private char[] timeHours801 = new char[2];


						private char[] timeMinutes801 = new char[2];


						private char[] timeSeconds801 = new char[2];
	
	/**
	* Constructor for Time801
	**/
    public Time801() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTimeHours801(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 2
             ,1
             );
								setTimeMinutes801(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 5
             ,1
             );
								setTimeSeconds801(fillSpace(2));
    }


 

	/**
	 *	Returns the value of timeHours801
	 *	@return timeHours801
	 */
   public char[] getTimeHours801() throws CFException{
     if (isTimeHours801Modified()) { 
        timeHours801 = refreshTimeHours801();
     }
   		return timeHours801;
   }

  
	/**
	*  set variable timeHours801
	*  Corresponding COBOL Variable is 801-TIME-HOURS
	*  @param value
	**/
   public void setTimeHours801(char[] value) {
      timeHours801 = checkTimeHours801Constraints(value);
      serializeTimeHours801(timeHours801);
   } 

     /**
	 * 	Update TimeHours801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTimeHours801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTimeHours801,timeHours801.length);
   	
   }
   
   public void setTimeHours801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTimeHours801,timeHours801.length);
   	
   }
   
     /**
	 * 	Update TimeHours801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTimeHours801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimeHours801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TimeHours801 with another Field
	 *	@param value
	 */
   public void setTimeHours801(Field source) {
       replace(source,0,source.length(),beginTimeHours801,TIME_HOURS_801_LEN);
   	
   }  
   
     /**
	 * 	Update TimeHours801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTimeHours801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTimeHours801,TIME_HOURS_801_LEN);
   	
   }
   
     /**
	 * 	Update TimeHours801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTimeHours801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimeHours801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of timeMinutes801
	 *	@return timeMinutes801
	 */
   public char[] getTimeMinutes801() throws CFException{
     if (isTimeMinutes801Modified()) { 
        timeMinutes801 = refreshTimeMinutes801();
     }
   		return timeMinutes801;
   }

  
	/**
	*  set variable timeMinutes801
	*  Corresponding COBOL Variable is 801-TIME-MINUTES
	*  @param value
	**/
   public void setTimeMinutes801(char[] value) {
      timeMinutes801 = checkTimeMinutes801Constraints(value);
      serializeTimeMinutes801(timeMinutes801);
   } 

     /**
	 * 	Update TimeMinutes801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTimeMinutes801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTimeMinutes801,timeMinutes801.length);
   	
   }
   
   public void setTimeMinutes801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTimeMinutes801,timeMinutes801.length);
   	
   }
   
     /**
	 * 	Update TimeMinutes801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTimeMinutes801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimeMinutes801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TimeMinutes801 with another Field
	 *	@param value
	 */
   public void setTimeMinutes801(Field source) {
       replace(source,0,source.length(),beginTimeMinutes801,TIME_MINUTES_801_LEN);
   	
   }  
   
     /**
	 * 	Update TimeMinutes801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTimeMinutes801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTimeMinutes801,TIME_MINUTES_801_LEN);
   	
   }
   
     /**
	 * 	Update TimeMinutes801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTimeMinutes801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimeMinutes801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of timeSeconds801
	 *	@return timeSeconds801
	 */
   public char[] getTimeSeconds801() throws CFException{
     if (isTimeSeconds801Modified()) { 
        timeSeconds801 = refreshTimeSeconds801();
     }
   		return timeSeconds801;
   }

  
	/**
	*  set variable timeSeconds801
	*  Corresponding COBOL Variable is 801-TIME-SECONDS
	*  @param value
	**/
   public void setTimeSeconds801(char[] value) {
      timeSeconds801 = checkTimeSeconds801Constraints(value);
      serializeTimeSeconds801(timeSeconds801);
   } 

     /**
	 * 	Update TimeSeconds801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTimeSeconds801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTimeSeconds801,timeSeconds801.length);
   	
   }
   
   public void setTimeSeconds801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTimeSeconds801,timeSeconds801.length);
   	
   }
   
     /**
	 * 	Update TimeSeconds801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTimeSeconds801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimeSeconds801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TimeSeconds801 with another Field
	 *	@param value
	 */
   public void setTimeSeconds801(Field source) {
       replace(source,0,source.length(),beginTimeSeconds801,TIME_SECONDS_801_LEN);
   	
   }  
   
     /**
	 * 	Update TimeSeconds801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTimeSeconds801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTimeSeconds801,TIME_SECONDS_801_LEN);
   	
   }
   
     /**
	 * 	Update TimeSeconds801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTimeSeconds801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimeSeconds801+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTime801FieldLength() {
			return TIME_801_LENGTH;
		}

}
  
