package com.cloudframe.app.sf326010.dto;

/**
*  The class Sf528ServiceDateTime is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.sf326010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf528ServiceDateTime extends Sf528ServiceDateTimeSerialized { 
   
				private Sf528ServiceDate sf528ServiceDate = new Sf528ServiceDate();
				private Sf528ServiceTime sf528ServiceTime = new Sf528ServiceTime();
	
	/**
	* Constructor for Sf528ServiceDateTime
	**/
    public Sf528ServiceDateTime() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf528ServiceDateTime. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf528ServiceDateTime(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			sf528ServiceDate.setParent(this,getStartOffset() + 0);
	       			sf528ServiceTime.setParent(this,getStartOffset() + 8);
    } 

	/**
	 *	Returns the value of sf528ServiceDate
	 *	@return sf528ServiceDate
	 */   
	 public Sf528ServiceDate getSf528ServiceDate() {
   	return sf528ServiceDate;
   }
   /**
	* 	Update Sf528ServiceDate with the passed value
	*   Corresponding COBOL Variable is SF528-SERVICE-DATE
	*	@param value
	*/
   public void setSf528ServiceDate(char[] value) {
      sf528ServiceDate.setString(value); 
   }   
    
     /**
	 * 	Update Sf528ServiceDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf528ServiceDate.begin,sf528ServiceDate.length());
   }
   
     /**
	 * 	Update Sf528ServiceDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf528ServiceDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceDate with another Field
	 *	@param value
	 */
   public void setSf528ServiceDate(Field source) {
   	replace(source,0,source.length(),sf528ServiceDate.begin,sf528ServiceDate.length());
   }  
   
     /**
	 * 	Update Sf528ServiceDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf528ServiceDate.begin,sf528ServiceDate.length());
   }
   
     /**
	 * 	Update Sf528ServiceDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf528ServiceDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf528ServiceTime
	 *	@return sf528ServiceTime
	 */   
	 public Sf528ServiceTime getSf528ServiceTime() {
   	return sf528ServiceTime;
   }
   /**
	* 	Update Sf528ServiceTime with the passed value
	*   Corresponding COBOL Variable is SF528-SERVICE-TIME
	*	@param value
	*/
   public void setSf528ServiceTime(char[] value) {
      sf528ServiceTime.setString(value); 
   }   
    
     /**
	 * 	Update Sf528ServiceTime 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceTime(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf528ServiceTime.begin,sf528ServiceTime.length());
   }
   
     /**
	 * 	Update Sf528ServiceTime 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf528ServiceTime.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceTime with another Field
	 *	@param value
	 */
   public void setSf528ServiceTime(Field source) {
   	replace(source,0,source.length(),sf528ServiceTime.begin,sf528ServiceTime.length());
   }  
   
     /**
	 * 	Update Sf528ServiceTime 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceTime(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf528ServiceTime.begin,sf528ServiceTime.length());
   }
   
     /**
	 * 	Update Sf528ServiceTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf528ServiceTime.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSf528ServiceDateTimeFieldLength() {
			return SF_528_SERVICE_DATE_TIME_LENGTH;
		}

}
  
