package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf501HdrDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf501HdrDate extends Sf501HdrDateSerialized { 
   

						private char[] sf501HdrMon = Field.fillLowValue(1);

						private char[] sf501HdrDay = Field.fillLowValue(1);

						private char[] sf501HdrYear = Field.fillLowValue(1);
	
	/**
	* Constructor for Sf501HdrDate
	**/
    public Sf501HdrDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf501HdrDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501HdrDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf501HdrMon
	 *	@return sf501HdrMon
	 */
   public char[] getSf501HdrMon() throws CFException{
     if (isSf501HdrMonModified()) { 
        sf501HdrMon = refreshSf501HdrMon();
     }
   		return sf501HdrMon;
   }

  
	/**
	*  set variable sf501HdrMon
	*  Corresponding COBOL Variable is SF501-HDR-MON
	*  @param value
	**/
   public void setSf501HdrMon(char[] value) {
      sf501HdrMon = checkSf501HdrMonConstraints(value);
      serializeSf501HdrMon(sf501HdrMon);
   } 

     /**
	 * 	Update Sf501HdrMon 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501HdrMon(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501HdrMon,sf501HdrMon.length);
   	
   }
   
   public void setSf501HdrMon(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501HdrMon,sf501HdrMon.length);
   	
   }
   
     /**
	 * 	Update Sf501HdrMon 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501HdrMon(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501HdrMon+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501HdrMon with another Field
	 *	@param value
	 */
   public void setSf501HdrMon(Field source) {
       replace(source,0,source.length(),beginSf501HdrMon,SF_501_HDR_MON_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501HdrMon 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501HdrMon(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501HdrMon,SF_501_HDR_MON_LEN);
   	
   }
   
     /**
	 * 	Update Sf501HdrMon 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501HdrMon(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501HdrMon+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf501HdrDay
	 *	@return sf501HdrDay
	 */
   public char[] getSf501HdrDay() throws CFException{
     if (isSf501HdrDayModified()) { 
        sf501HdrDay = refreshSf501HdrDay();
     }
   		return sf501HdrDay;
   }

  
	/**
	*  set variable sf501HdrDay
	*  Corresponding COBOL Variable is SF501-HDR-DAY
	*  @param value
	**/
   public void setSf501HdrDay(char[] value) {
      sf501HdrDay = checkSf501HdrDayConstraints(value);
      serializeSf501HdrDay(sf501HdrDay);
   } 

     /**
	 * 	Update Sf501HdrDay 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501HdrDay(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501HdrDay,sf501HdrDay.length);
   	
   }
   
   public void setSf501HdrDay(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501HdrDay,sf501HdrDay.length);
   	
   }
   
     /**
	 * 	Update Sf501HdrDay 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501HdrDay(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501HdrDay+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501HdrDay with another Field
	 *	@param value
	 */
   public void setSf501HdrDay(Field source) {
       replace(source,0,source.length(),beginSf501HdrDay,SF_501_HDR_DAY_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501HdrDay 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501HdrDay(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501HdrDay,SF_501_HDR_DAY_LEN);
   	
   }
   
     /**
	 * 	Update Sf501HdrDay 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501HdrDay(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501HdrDay+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf501HdrYear
	 *	@return sf501HdrYear
	 */
   public char[] getSf501HdrYear() throws CFException{
     if (isSf501HdrYearModified()) { 
        sf501HdrYear = refreshSf501HdrYear();
     }
   		return sf501HdrYear;
   }

  
	/**
	*  set variable sf501HdrYear
	*  Corresponding COBOL Variable is SF501-HDR-YEAR
	*  @param value
	**/
   public void setSf501HdrYear(char[] value) {
      sf501HdrYear = checkSf501HdrYearConstraints(value);
      serializeSf501HdrYear(sf501HdrYear);
   } 

     /**
	 * 	Update Sf501HdrYear 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501HdrYear(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501HdrYear,sf501HdrYear.length);
   	
   }
   
   public void setSf501HdrYear(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501HdrYear,sf501HdrYear.length);
   	
   }
   
     /**
	 * 	Update Sf501HdrYear 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501HdrYear(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501HdrYear+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501HdrYear with another Field
	 *	@param value
	 */
   public void setSf501HdrYear(Field source) {
       replace(source,0,source.length(),beginSf501HdrYear,SF_501_HDR_YEAR_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501HdrYear 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501HdrYear(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501HdrYear,SF_501_HDR_YEAR_LEN);
   	
   }
   
     /**
	 * 	Update Sf501HdrYear 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501HdrYear(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501HdrYear+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf501HdrDateFieldLength() {
			return SF_501_HDR_DATE_LENGTH;
		}

}
  
