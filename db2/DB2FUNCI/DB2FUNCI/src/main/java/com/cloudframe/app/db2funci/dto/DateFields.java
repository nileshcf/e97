package com.cloudframe.app.db2funci.dto;

/**
*  The class DateFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DateFields extends DateFieldsSerialized {
   

						private char[] currentDate = Field.fillLowValue(10);

						private char[] mthsAgoDate18 = Field.fillLowValue(10);

						private char[] lastDayDt = Field.fillLowValue(10);
	
	/**
	* Constructor for DateFields
	**/
    public DateFields() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of currentDate
	 *	@return currentDate
	 */
   public char[] getCurrentDate() throws CFException{
     if (isCurrentDateModified()) { 
        currentDate = refreshCurrentDate();
     }
   		return currentDate;
   }

  
	/**
	*  set variable currentDate
	*  Corresponding COBOL Variable is WS-CURRENT-DATE
	*  @param value
	**/
   public void setCurrentDate(char[] value) {
      currentDate = checkCurrentDateConstraints(value);
      serializeCurrentDate(currentDate);
   } 

     /**
	 * 	Update CurrentDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrentDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrentDate,currentDate.length);
   	
   }
   
   public void setCurrentDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentDate,currentDate.length);
   	
   }
   
     /**
	 * 	Update CurrentDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrentDate with another Field
	 *	@param value
	 */
   public void setCurrentDate(Field source) {
       replace(source,0,source.length(),beginCurrentDate,CURRENT_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update CurrentDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrentDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrentDate,CURRENT_DATE_LEN);
   	
   }
   
     /**
	 * 	Update CurrentDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mthsAgoDate18
	 *	@return mthsAgoDate18
	 */
   public char[] getMthsAgoDate18() throws CFException{
     if (isMthsAgoDate18Modified()) { 
        mthsAgoDate18 = refreshMthsAgoDate18();
     }
   		return mthsAgoDate18;
   }

  
	/**
	*  set variable mthsAgoDate18
	*  Corresponding COBOL Variable is WS-18MTHS-AGO-DATE
	*  @param value
	**/
   public void setMthsAgoDate18(char[] value) {
      mthsAgoDate18 = checkMthsAgoDate18Constraints(value);
      serializeMthsAgoDate18(mthsAgoDate18);
   } 

     /**
	 * 	Update MthsAgoDate18 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMthsAgoDate18(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMthsAgoDate18,mthsAgoDate18.length);
   	
   }
   
   public void setMthsAgoDate18(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMthsAgoDate18,mthsAgoDate18.length);
   	
   }
   
     /**
	 * 	Update MthsAgoDate18 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMthsAgoDate18(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMthsAgoDate18+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MthsAgoDate18 with another Field
	 *	@param value
	 */
   public void setMthsAgoDate18(Field source) {
       replace(source,0,source.length(),beginMthsAgoDate18,MTHS_AGO_DATE_18_LEN);
   	
   }  
   
     /**
	 * 	Update MthsAgoDate18 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMthsAgoDate18(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMthsAgoDate18,MTHS_AGO_DATE_18_LEN);
   	
   }
   
     /**
	 * 	Update MthsAgoDate18 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMthsAgoDate18(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMthsAgoDate18+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lastDayDt
	 *	@return lastDayDt
	 */
   public char[] getLastDayDt() throws CFException{
     if (isLastDayDtModified()) { 
        lastDayDt = refreshLastDayDt();
     }
   		return lastDayDt;
   }

  
	/**
	*  set variable lastDayDt
	*  Corresponding COBOL Variable is WS-LAST-DAY-DT
	*  @param value
	**/
   public void setLastDayDt(char[] value) {
      lastDayDt = checkLastDayDtConstraints(value);
      serializeLastDayDt(lastDayDt);
   } 

     /**
	 * 	Update LastDayDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLastDayDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLastDayDt,lastDayDt.length);
   	
   }
   
   public void setLastDayDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLastDayDt,lastDayDt.length);
   	
   }
   
     /**
	 * 	Update LastDayDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLastDayDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLastDayDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LastDayDt with another Field
	 *	@param value
	 */
   public void setLastDayDt(Field source) {
       replace(source,0,source.length(),beginLastDayDt,LAST_DAY_DT_LEN);
   	
   }  
   
     /**
	 * 	Update LastDayDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLastDayDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLastDayDt,LAST_DAY_DT_LEN);
   	
   }
   
     /**
	 * 	Update LastDayDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLastDayDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLastDayDt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDateFieldsFieldLength() {
			return DATE_FIELDS_LENGTH;
		}

}
  
