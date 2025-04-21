package com.cloudframe.app.ip670010.dto;

/**
*  The class DaysOfMonthsGroup300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/


import com.cloudframe.app.ip670010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DaysOfMonthsGroup300 extends DaysOfMonthsGroup300Serialized {
   

						private char[] daysOfMonths300 = new char[24];
					private MaxDaysOfMonth300 maxDaysOfMonth300 = new MaxDaysOfMonth300();
	
	/**
	* Constructor for DaysOfMonthsGroup300
	**/
    public DaysOfMonthsGroup300() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			maxDaysOfMonth300.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setDaysOfMonths300(("312831303130313130313031").toCharArray());
    }


 

	/**
	 *	Returns the value of daysOfMonths300
	 *	@return daysOfMonths300
	 */
   public char[] getDaysOfMonths300() throws CFException{
     if (isDaysOfMonths300Modified()) { 
        daysOfMonths300 = refreshDaysOfMonths300();
     }
   		return daysOfMonths300;
   }

  
	/**
	*  set variable daysOfMonths300
	*  Corresponding COBOL Variable is 300-DAYS-OF-MONTHS
	*  @param value
	**/
   public void setDaysOfMonths300(char[] value) {
      daysOfMonths300 = checkDaysOfMonths300Constraints(value);
      serializeDaysOfMonths300(daysOfMonths300);
   } 

     /**
	 * 	Update DaysOfMonths300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDaysOfMonths300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDaysOfMonths300,daysOfMonths300.length);
   	
   }
   
   public void setDaysOfMonths300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDaysOfMonths300,daysOfMonths300.length);
   	
   }
   
     /**
	 * 	Update DaysOfMonths300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDaysOfMonths300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDaysOfMonths300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DaysOfMonths300 with another Field
	 *	@param value
	 */
   public void setDaysOfMonths300(Field source) {
       replace(source,0,source.length(),beginDaysOfMonths300,DAYS_OF_MONTHS_300_LEN);
   	
   }  
   
     /**
	 * 	Update DaysOfMonths300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDaysOfMonths300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDaysOfMonths300,DAYS_OF_MONTHS_300_LEN);
   	
   }
   
     /**
	 * 	Update DaysOfMonths300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDaysOfMonths300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDaysOfMonths300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of maxDaysOfMonth300
	 *	@return maxDaysOfMonth300
	 */   
	 public MaxDaysOfMonth300 getMaxDaysOfMonth300() {
   	return maxDaysOfMonth300;
   }
   /**
	* 	Update MaxDaysOfMonth300 with the passed value
	*   Corresponding COBOL Variable is 300-MAX-DAYS-OF-MONTH
	*	@param value
	*/
   public void setMaxDaysOfMonth300(char[] value) {
      maxDaysOfMonth300.setString(value); 
   }   
    
     /**
	 * 	Update MaxDaysOfMonth300 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMaxDaysOfMonth300(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,maxDaysOfMonth300.begin,maxDaysOfMonth300.length());
   }
   
     /**
	 * 	Update MaxDaysOfMonth300 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMaxDaysOfMonth300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,maxDaysOfMonth300.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MaxDaysOfMonth300 with another Field
	 *	@param value
	 */
   public void setMaxDaysOfMonth300(Field source) {
   	replace(source,0,source.length(),maxDaysOfMonth300.begin,maxDaysOfMonth300.length());
   }  
   
     /**
	 * 	Update MaxDaysOfMonth300 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMaxDaysOfMonth300(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,maxDaysOfMonth300.begin,maxDaysOfMonth300.length());
   }
   
     /**
	 * 	Update MaxDaysOfMonth300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMaxDaysOfMonth300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,maxDaysOfMonth300.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDaysOfMonthsGroup300FieldLength() {
			return DAYS_OF_MONTHS_GROUP_300_LENGTH;
		}

}
  
