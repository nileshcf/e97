package com.cloudframe.app.ip989010.dto;

/**
*  The class Ip9890hClearingDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip9890hClearingDate extends Ip9890hClearingDateSerialized { 
   

						private char[] ip9890hClrDateYy = Field.fillLowValue(2);

						private char[] ip9890hClrDateMm = Field.fillLowValue(2);

						private char[] ip9890hClrDateDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip9890hClearingDate
	**/
    public Ip9890hClearingDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip9890hClearingDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip9890hClearingDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip9890hClrDateYy
	 *	@return ip9890hClrDateYy
	 */
   public char[] getIp9890hClrDateYy() throws CFException{
     if (isIp9890hClrDateYyModified()) { 
        ip9890hClrDateYy = refreshIp9890hClrDateYy();
     }
   		return ip9890hClrDateYy;
   }

  
	/**
	*  set variable ip9890hClrDateYy
	*  Corresponding COBOL Variable is IP9890H-CLR-DATE-YY
	*  @param value
	**/
   public void setIp9890hClrDateYy(char[] value) {
      ip9890hClrDateYy = checkIp9890hClrDateYyConstraints(value);
      serializeIp9890hClrDateYy(ip9890hClrDateYy);
   } 

     /**
	 * 	Update Ip9890hClrDateYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp9890hClrDateYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp9890hClrDateYy,ip9890hClrDateYy.length);
   	
   }
   
   public void setIp9890hClrDateYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hClrDateYy,ip9890hClrDateYy.length);
   	
   }
   
     /**
	 * 	Update Ip9890hClrDateYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hClrDateYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hClrDateYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip9890hClrDateYy with another Field
	 *	@param value
	 */
   public void setIp9890hClrDateYy(Field source) {
       replace(source,0,source.length(),beginIp9890hClrDateYy,IP_9890H_CLR_DATE_YY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip9890hClrDateYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp9890hClrDateYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp9890hClrDateYy,IP_9890H_CLR_DATE_YY_LEN);
   	
   }
   
     /**
	 * 	Update Ip9890hClrDateYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hClrDateYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hClrDateYy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip9890hClrDateMm
	 *	@return ip9890hClrDateMm
	 */
   public char[] getIp9890hClrDateMm() throws CFException{
     if (isIp9890hClrDateMmModified()) { 
        ip9890hClrDateMm = refreshIp9890hClrDateMm();
     }
   		return ip9890hClrDateMm;
   }

  
	/**
	*  set variable ip9890hClrDateMm
	*  Corresponding COBOL Variable is IP9890H-CLR-DATE-MM
	*  @param value
	**/
   public void setIp9890hClrDateMm(char[] value) {
      ip9890hClrDateMm = checkIp9890hClrDateMmConstraints(value);
      serializeIp9890hClrDateMm(ip9890hClrDateMm);
   } 

     /**
	 * 	Update Ip9890hClrDateMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp9890hClrDateMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp9890hClrDateMm,ip9890hClrDateMm.length);
   	
   }
   
   public void setIp9890hClrDateMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hClrDateMm,ip9890hClrDateMm.length);
   	
   }
   
     /**
	 * 	Update Ip9890hClrDateMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hClrDateMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hClrDateMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip9890hClrDateMm with another Field
	 *	@param value
	 */
   public void setIp9890hClrDateMm(Field source) {
       replace(source,0,source.length(),beginIp9890hClrDateMm,IP_9890H_CLR_DATE_MM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip9890hClrDateMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp9890hClrDateMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp9890hClrDateMm,IP_9890H_CLR_DATE_MM_LEN);
   	
   }
   
     /**
	 * 	Update Ip9890hClrDateMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hClrDateMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hClrDateMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip9890hClrDateDd
	 *	@return ip9890hClrDateDd
	 */
   public char[] getIp9890hClrDateDd() throws CFException{
     if (isIp9890hClrDateDdModified()) { 
        ip9890hClrDateDd = refreshIp9890hClrDateDd();
     }
   		return ip9890hClrDateDd;
   }

  
	/**
	*  set variable ip9890hClrDateDd
	*  Corresponding COBOL Variable is IP9890H-CLR-DATE-DD
	*  @param value
	**/
   public void setIp9890hClrDateDd(char[] value) {
      ip9890hClrDateDd = checkIp9890hClrDateDdConstraints(value);
      serializeIp9890hClrDateDd(ip9890hClrDateDd);
   } 

     /**
	 * 	Update Ip9890hClrDateDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp9890hClrDateDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp9890hClrDateDd,ip9890hClrDateDd.length);
   	
   }
   
   public void setIp9890hClrDateDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hClrDateDd,ip9890hClrDateDd.length);
   	
   }
   
     /**
	 * 	Update Ip9890hClrDateDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hClrDateDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hClrDateDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip9890hClrDateDd with another Field
	 *	@param value
	 */
   public void setIp9890hClrDateDd(Field source) {
       replace(source,0,source.length(),beginIp9890hClrDateDd,IP_9890H_CLR_DATE_DD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip9890hClrDateDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp9890hClrDateDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp9890hClrDateDd,IP_9890H_CLR_DATE_DD_LEN);
   	
   }
   
     /**
	 * 	Update Ip9890hClrDateDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hClrDateDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hClrDateDd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip9890hClearingDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp9890hClrDateYy(CONSTANTS.SPACE_2);
         setIp9890hClrDateMm(CONSTANTS.SPACE_2);
         setIp9890hClrDateDd(CONSTANTS.SPACE_2);
   }

		public static int getIp9890hClearingDateFieldLength() {
			return IP_9890H_CLEARING_DATE_LENGTH;
		}

}
  
