package com.cloudframe.app.move0.dto;

/**
*  The class CurrentDateGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/


import com.cloudframe.app.move0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CurrentDateGroup extends CurrentDateGroupSerialized {
   
					private CurrentDate currentDate = new CurrentDate();

						private char[] runDate = Field.fillLowValue(10);
	
	/**
	* Constructor for CurrentDateGroup
	**/
    public CurrentDateGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			currentDate.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of currentDate
	 *	@return currentDate
	 */   
	 public CurrentDate getCurrentDate() {
   	return currentDate;
   }
   /**
	* 	Update CurrentDate with the passed value
	*   Corresponding COBOL Variable is WS-CURRENT-DATE
	*	@param value
	*/
   public void setCurrentDate(char[] value) {
      currentDate.setString(value); 
   }   
    
     /**
	 * 	Update CurrentDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCurrentDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,currentDate.begin,currentDate.length());
   }
   
     /**
	 * 	Update CurrentDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,currentDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CurrentDate with another Field
	 *	@param value
	 */
   public void setCurrentDate(Field source) {
   	replace(source,0,source.length(),currentDate.begin,currentDate.length());
   }  
   
     /**
	 * 	Update CurrentDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCurrentDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,currentDate.begin,currentDate.length());
   }
   
     /**
	 * 	Update CurrentDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,currentDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of runDate
	 *	@return runDate
	 */
   public char[] getRunDate() throws CFException{
     if (isRunDateModified()) { 
        runDate = refreshRunDate();
     }
   		return runDate;
   }

  
	/**
	*  set variable runDate
	*  Corresponding COBOL Variable is WS-RUN-DATE
	*  @param value
	**/
   public void setRunDate(char[] value) {
      runDate = checkRunDateConstraints(value);
      serializeRunDate(runDate);
   } 

     /**
	 * 	Update RunDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRunDate,runDate.length);
   	
   }
   
   public void setRunDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRunDate,runDate.length);
   	
   }
   
     /**
	 * 	Update RunDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RunDate with another Field
	 *	@param value
	 */
   public void setRunDate(Field source) {
       replace(source,0,source.length(),beginRunDate,RUN_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update RunDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRunDate,RUN_DATE_LEN);
   	
   }
   
     /**
	 * 	Update RunDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunDate+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCurrentDateGroupFieldLength() {
			return CURRENT_DATE_GROUP_LENGTH;
		}

}
  
