package com.cloudframe.app.sf328010.dto;

/**
*  The class Sf528ExtractZLogRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf528ExtractZLogRec extends Sf528ExtractZLogRecSerialized {
   

						private char[] sf528ServiceId = Field.fillLowValue(4);

						private char[] sf528ServiceStatus = Field.fillLowValue(1);

								private int sf528ElapsedTime;

						private char[] sf528ServiceDateTime = Field.fillLowValue(14);
	
	/**
	* Constructor for Sf528ExtractZLogRec
	**/
    public Sf528ExtractZLogRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sf528ServiceId
	 *	@return sf528ServiceId
	 */
   public char[] getSf528ServiceId() throws CFException{
     if (isSf528ServiceIdModified()) { 
        sf528ServiceId = refreshSf528ServiceId();
     }
   		return sf528ServiceId;
   }

  
	/**
	*  set variable sf528ServiceId
	*  Corresponding COBOL Variable is SF528-SERVICE-ID
	*  @param value
	**/
   public void setSf528ServiceId(char[] value) {
      sf528ServiceId = checkSf528ServiceIdConstraints(value);
      serializeSf528ServiceId(sf528ServiceId);
   } 

     /**
	 * 	Update Sf528ServiceId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf528ServiceId,sf528ServiceId.length);
   	
   }
   
   public void setSf528ServiceId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceId,sf528ServiceId.length);
   	
   }
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf528ServiceId with another Field
	 *	@param value
	 */
   public void setSf528ServiceId(Field source) {
       replace(source,0,source.length(),beginSf528ServiceId,SF_528_SERVICE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf528ServiceId,SF_528_SERVICE_ID_LEN);
   	
   }
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf528ServiceStatus
	 *	@return sf528ServiceStatus
	 */
   public char[] getSf528ServiceStatus() throws CFException{
     if (isSf528ServiceStatusModified()) { 
        sf528ServiceStatus = refreshSf528ServiceStatus();
     }
   		return sf528ServiceStatus;
   }

  
	/**
	*  set variable sf528ServiceStatus
	*  Corresponding COBOL Variable is SF528-SERVICE-STATUS
	*  @param value
	**/
   public void setSf528ServiceStatus(char[] value) {
      sf528ServiceStatus = checkSf528ServiceStatusConstraints(value);
      serializeSf528ServiceStatus(sf528ServiceStatus);
   } 

     /**
	 * 	Update Sf528ServiceStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf528ServiceStatus,sf528ServiceStatus.length);
   	
   }
   
   public void setSf528ServiceStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceStatus,sf528ServiceStatus.length);
   	
   }
   
     /**
	 * 	Update Sf528ServiceStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf528ServiceStatus with another Field
	 *	@param value
	 */
   public void setSf528ServiceStatus(Field source) {
       replace(source,0,source.length(),beginSf528ServiceStatus,SF_528_SERVICE_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Sf528ServiceStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf528ServiceStatus,SF_528_SERVICE_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Sf528ServiceStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceStatus+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf528ElapsedTime
	 *	@return sf528ElapsedTime
	 */
	public int getSf528ElapsedTime() throws CFException {
        if (isSf528ElapsedTimeModified()) { 
           sf528ElapsedTime = refreshSf528ElapsedTime();
        }
   		return sf528ElapsedTime;
	}
	
	/**
	 * 	Update Sf528ElapsedTime with the passed value
	 *  Corresponding COBOL Variable is SF528-ELAPSED-TIME
	 *	@param number
	 */
	public void setSf528ElapsedTime(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf528ElapsedTime = checkSf528ElapsedTimeMaxLimit(number); 
		serializeSf528ElapsedTime(sf528ElapsedTime);
	}


	public void setSf528ElapsedTime(long number) {
	    number = checkSf528ElapsedTimeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf528ElapsedTime((int)number);
	}
	
	/**
	 *	Returns the value of sf528ServiceDateTime
	 *	@return sf528ServiceDateTime
	 */
   public char[] getSf528ServiceDateTime() throws CFException{
     if (isSf528ServiceDateTimeModified()) { 
        sf528ServiceDateTime = refreshSf528ServiceDateTime();
     }
   		return sf528ServiceDateTime;
   }

  
	/**
	*  set variable sf528ServiceDateTime
	*  Corresponding COBOL Variable is SF528-SERVICE-DATE-TIME
	*  @param value
	**/
   public void setSf528ServiceDateTime(char[] value) {
      sf528ServiceDateTime = checkSf528ServiceDateTimeConstraints(value);
      serializeSf528ServiceDateTime(sf528ServiceDateTime);
   } 

     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceDateTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf528ServiceDateTime,sf528ServiceDateTime.length);
   	
   }
   
   public void setSf528ServiceDateTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceDateTime,sf528ServiceDateTime.length);
   	
   }
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceDateTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf528ServiceDateTime with another Field
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source) {
       replace(source,0,source.length(),beginSf528ServiceDateTime,SF_528_SERVICE_DATE_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf528ServiceDateTime,SF_528_SERVICE_DATE_TIME_LEN);
   	
   }
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf528ServiceDateTime+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf528ExtractZLogRecFieldLength() {
			return SF_528_EXTRACT_ZLOG_REC_LENGTH;
		}

}
  
