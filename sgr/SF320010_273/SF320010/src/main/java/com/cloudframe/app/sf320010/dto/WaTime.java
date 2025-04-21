package com.cloudframe.app.sf320010.dto;

/**
*  The class WaTime is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WaTime extends WaTimeSerialized {
   

						private char[] waTimeHours = Field.fillLowValue(2);


						private char[] waTimeMinutes = Field.fillLowValue(2);


						private char[] waTimeSeconds = Field.fillLowValue(2);
	
	/**
	* Constructor for WaTime
	**/
    public WaTime() {
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
	 *	Returns the value of waTimeHours
	 *	@return waTimeHours
	 */
   public char[] getWaTimeHours() throws CFException{
     if (isWaTimeHoursModified()) { 
        waTimeHours = refreshWaTimeHours();
     }
   		return waTimeHours;
   }

  
	/**
	*  set variable waTimeHours
	*  Corresponding COBOL Variable is WA-TIME-HOURS
	*  @param value
	**/
   public void setWaTimeHours(char[] value) {
      waTimeHours = checkWaTimeHoursConstraints(value);
      serializeWaTimeHours(waTimeHours);
   } 

     /**
	 * 	Update WaTimeHours 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaTimeHours(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWaTimeHours,waTimeHours.length);
   	
   }
   
   public void setWaTimeHours(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWaTimeHours,waTimeHours.length);
   	
   }
   
     /**
	 * 	Update WaTimeHours 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaTimeHours(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaTimeHours+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WaTimeHours with another Field
	 *	@param value
	 */
   public void setWaTimeHours(Field source) {
       replace(source,0,source.length(),beginWaTimeHours,WA_TIME_HOURS_LEN);
   	
   }  
   
     /**
	 * 	Update WaTimeHours 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaTimeHours(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWaTimeHours,WA_TIME_HOURS_LEN);
   	
   }
   
     /**
	 * 	Update WaTimeHours 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaTimeHours(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaTimeHours+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of waTimeMinutes
	 *	@return waTimeMinutes
	 */
   public char[] getWaTimeMinutes() throws CFException{
     if (isWaTimeMinutesModified()) { 
        waTimeMinutes = refreshWaTimeMinutes();
     }
   		return waTimeMinutes;
   }

  
	/**
	*  set variable waTimeMinutes
	*  Corresponding COBOL Variable is WA-TIME-MINUTES
	*  @param value
	**/
   public void setWaTimeMinutes(char[] value) {
      waTimeMinutes = checkWaTimeMinutesConstraints(value);
      serializeWaTimeMinutes(waTimeMinutes);
   } 

     /**
	 * 	Update WaTimeMinutes 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaTimeMinutes(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWaTimeMinutes,waTimeMinutes.length);
   	
   }
   
   public void setWaTimeMinutes(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWaTimeMinutes,waTimeMinutes.length);
   	
   }
   
     /**
	 * 	Update WaTimeMinutes 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaTimeMinutes(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaTimeMinutes+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WaTimeMinutes with another Field
	 *	@param value
	 */
   public void setWaTimeMinutes(Field source) {
       replace(source,0,source.length(),beginWaTimeMinutes,WA_TIME_MINUTES_LEN);
   	
   }  
   
     /**
	 * 	Update WaTimeMinutes 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaTimeMinutes(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWaTimeMinutes,WA_TIME_MINUTES_LEN);
   	
   }
   
     /**
	 * 	Update WaTimeMinutes 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaTimeMinutes(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaTimeMinutes+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of waTimeSeconds
	 *	@return waTimeSeconds
	 */
   public char[] getWaTimeSeconds() throws CFException{
     if (isWaTimeSecondsModified()) { 
        waTimeSeconds = refreshWaTimeSeconds();
     }
   		return waTimeSeconds;
   }

  
	/**
	*  set variable waTimeSeconds
	*  Corresponding COBOL Variable is WA-TIME-SECONDS
	*  @param value
	**/
   public void setWaTimeSeconds(char[] value) {
      waTimeSeconds = checkWaTimeSecondsConstraints(value);
      serializeWaTimeSeconds(waTimeSeconds);
   } 

     /**
	 * 	Update WaTimeSeconds 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaTimeSeconds(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWaTimeSeconds,waTimeSeconds.length);
   	
   }
   
   public void setWaTimeSeconds(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWaTimeSeconds,waTimeSeconds.length);
   	
   }
   
     /**
	 * 	Update WaTimeSeconds 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaTimeSeconds(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaTimeSeconds+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WaTimeSeconds with another Field
	 *	@param value
	 */
   public void setWaTimeSeconds(Field source) {
       replace(source,0,source.length(),beginWaTimeSeconds,WA_TIME_SECONDS_LEN);
   	
   }  
   
     /**
	 * 	Update WaTimeSeconds 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaTimeSeconds(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWaTimeSeconds,WA_TIME_SECONDS_LEN);
   	
   }
   
     /**
	 * 	Update WaTimeSeconds 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaTimeSeconds(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaTimeSeconds+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWaTimeFieldLength() {
			return WA_TIME_LENGTH;
		}

}
  
