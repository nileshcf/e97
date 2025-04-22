package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf501HdrTime is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf501HdrTime extends Sf501HdrTimeSerialized { 
   

						private char[] sf501HdrHour = Field.fillLowValue(1);

						private char[] sf501HdrMin = Field.fillLowValue(1);

						private char[] sf501HdrSec = Field.fillLowValue(1);
	
	/**
	* Constructor for Sf501HdrTime
	**/
    public Sf501HdrTime() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf501HdrTime. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501HdrTime(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf501HdrHour
	 *	@return sf501HdrHour
	 */
   public char[] getSf501HdrHour() throws CFException{
     if (isSf501HdrHourModified()) { 
        sf501HdrHour = refreshSf501HdrHour();
     }
   		return sf501HdrHour;
   }

  
	/**
	*  set variable sf501HdrHour
	*  Corresponding COBOL Variable is SF501-HDR-HOUR
	*  @param value
	**/
   public void setSf501HdrHour(char[] value) {
      sf501HdrHour = checkSf501HdrHourConstraints(value);
      serializeSf501HdrHour(sf501HdrHour);
   } 

     /**
	 * 	Update Sf501HdrHour 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501HdrHour(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501HdrHour,sf501HdrHour.length);
   	
   }
   
   public void setSf501HdrHour(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501HdrHour,sf501HdrHour.length);
   	
   }
   
     /**
	 * 	Update Sf501HdrHour 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501HdrHour(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501HdrHour+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501HdrHour with another Field
	 *	@param value
	 */
   public void setSf501HdrHour(Field source) {
       replace(source,0,source.length(),beginSf501HdrHour,SF_501_HDR_HOUR_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501HdrHour 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501HdrHour(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501HdrHour,SF_501_HDR_HOUR_LEN);
   	
   }
   
     /**
	 * 	Update Sf501HdrHour 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501HdrHour(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501HdrHour+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf501HdrMin
	 *	@return sf501HdrMin
	 */
   public char[] getSf501HdrMin() throws CFException{
     if (isSf501HdrMinModified()) { 
        sf501HdrMin = refreshSf501HdrMin();
     }
   		return sf501HdrMin;
   }

  
	/**
	*  set variable sf501HdrMin
	*  Corresponding COBOL Variable is SF501-HDR-MIN
	*  @param value
	**/
   public void setSf501HdrMin(char[] value) {
      sf501HdrMin = checkSf501HdrMinConstraints(value);
      serializeSf501HdrMin(sf501HdrMin);
   } 

     /**
	 * 	Update Sf501HdrMin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501HdrMin(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501HdrMin,sf501HdrMin.length);
   	
   }
   
   public void setSf501HdrMin(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501HdrMin,sf501HdrMin.length);
   	
   }
   
     /**
	 * 	Update Sf501HdrMin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501HdrMin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501HdrMin+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501HdrMin with another Field
	 *	@param value
	 */
   public void setSf501HdrMin(Field source) {
       replace(source,0,source.length(),beginSf501HdrMin,SF_501_HDR_MIN_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501HdrMin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501HdrMin(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501HdrMin,SF_501_HDR_MIN_LEN);
   	
   }
   
     /**
	 * 	Update Sf501HdrMin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501HdrMin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501HdrMin+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf501HdrSec
	 *	@return sf501HdrSec
	 */
   public char[] getSf501HdrSec() throws CFException{
     if (isSf501HdrSecModified()) { 
        sf501HdrSec = refreshSf501HdrSec();
     }
   		return sf501HdrSec;
   }

  
	/**
	*  set variable sf501HdrSec
	*  Corresponding COBOL Variable is SF501-HDR-SEC
	*  @param value
	**/
   public void setSf501HdrSec(char[] value) {
      sf501HdrSec = checkSf501HdrSecConstraints(value);
      serializeSf501HdrSec(sf501HdrSec);
   } 

     /**
	 * 	Update Sf501HdrSec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501HdrSec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501HdrSec,sf501HdrSec.length);
   	
   }
   
   public void setSf501HdrSec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501HdrSec,sf501HdrSec.length);
   	
   }
   
     /**
	 * 	Update Sf501HdrSec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501HdrSec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501HdrSec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501HdrSec with another Field
	 *	@param value
	 */
   public void setSf501HdrSec(Field source) {
       replace(source,0,source.length(),beginSf501HdrSec,SF_501_HDR_SEC_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501HdrSec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501HdrSec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501HdrSec,SF_501_HDR_SEC_LEN);
   	
   }
   
     /**
	 * 	Update Sf501HdrSec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501HdrSec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501HdrSec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf501HdrTimeFieldLength() {
			return SF_501_HDR_TIME_LENGTH;
		}

}
  
