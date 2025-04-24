package com.cloudframe.app.ip989010.dto;

/**
*  The class Ip98901ClearingDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip98901ClearingDate extends Ip98901ClearingDateSerialized { 
   

						private char[] ip98901ClrDateYy = Field.fillLowValue(2);

						private char[] ip98901ClrDateMm = Field.fillLowValue(2);

						private char[] ip98901ClrDateDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip98901ClearingDate
	**/
    public Ip98901ClearingDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip98901ClearingDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip98901ClearingDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip98901ClrDateYy
	 *	@return ip98901ClrDateYy
	 */
   public char[] getIp98901ClrDateYy() throws CFException{
     if (isIp98901ClrDateYyModified()) { 
        ip98901ClrDateYy = refreshIp98901ClrDateYy();
     }
   		return ip98901ClrDateYy;
   }

  
	/**
	*  set variable ip98901ClrDateYy
	*  Corresponding COBOL Variable is IP98901-CLR-DATE-YY
	*  @param value
	**/
   public void setIp98901ClrDateYy(char[] value) {
      ip98901ClrDateYy = checkIp98901ClrDateYyConstraints(value);
      serializeIp98901ClrDateYy(ip98901ClrDateYy);
   } 

     /**
	 * 	Update Ip98901ClrDateYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98901ClrDateYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98901ClrDateYy,ip98901ClrDateYy.length);
   	
   }
   
   public void setIp98901ClrDateYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901ClrDateYy,ip98901ClrDateYy.length);
   	
   }
   
     /**
	 * 	Update Ip98901ClrDateYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98901ClrDateYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901ClrDateYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98901ClrDateYy with another Field
	 *	@param value
	 */
   public void setIp98901ClrDateYy(Field source) {
       replace(source,0,source.length(),beginIp98901ClrDateYy,IP_98901_CLR_DATE_YY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98901ClrDateYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98901ClrDateYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98901ClrDateYy,IP_98901_CLR_DATE_YY_LEN);
   	
   }
   
     /**
	 * 	Update Ip98901ClrDateYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98901ClrDateYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901ClrDateYy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip98901ClrDateMm
	 *	@return ip98901ClrDateMm
	 */
   public char[] getIp98901ClrDateMm() throws CFException{
     if (isIp98901ClrDateMmModified()) { 
        ip98901ClrDateMm = refreshIp98901ClrDateMm();
     }
   		return ip98901ClrDateMm;
   }

  
	/**
	*  set variable ip98901ClrDateMm
	*  Corresponding COBOL Variable is IP98901-CLR-DATE-MM
	*  @param value
	**/
   public void setIp98901ClrDateMm(char[] value) {
      ip98901ClrDateMm = checkIp98901ClrDateMmConstraints(value);
      serializeIp98901ClrDateMm(ip98901ClrDateMm);
   } 

     /**
	 * 	Update Ip98901ClrDateMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98901ClrDateMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98901ClrDateMm,ip98901ClrDateMm.length);
   	
   }
   
   public void setIp98901ClrDateMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901ClrDateMm,ip98901ClrDateMm.length);
   	
   }
   
     /**
	 * 	Update Ip98901ClrDateMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98901ClrDateMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901ClrDateMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98901ClrDateMm with another Field
	 *	@param value
	 */
   public void setIp98901ClrDateMm(Field source) {
       replace(source,0,source.length(),beginIp98901ClrDateMm,IP_98901_CLR_DATE_MM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98901ClrDateMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98901ClrDateMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98901ClrDateMm,IP_98901_CLR_DATE_MM_LEN);
   	
   }
   
     /**
	 * 	Update Ip98901ClrDateMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98901ClrDateMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901ClrDateMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip98901ClrDateDd
	 *	@return ip98901ClrDateDd
	 */
   public char[] getIp98901ClrDateDd() throws CFException{
     if (isIp98901ClrDateDdModified()) { 
        ip98901ClrDateDd = refreshIp98901ClrDateDd();
     }
   		return ip98901ClrDateDd;
   }

  
	/**
	*  set variable ip98901ClrDateDd
	*  Corresponding COBOL Variable is IP98901-CLR-DATE-DD
	*  @param value
	**/
   public void setIp98901ClrDateDd(char[] value) {
      ip98901ClrDateDd = checkIp98901ClrDateDdConstraints(value);
      serializeIp98901ClrDateDd(ip98901ClrDateDd);
   } 

     /**
	 * 	Update Ip98901ClrDateDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98901ClrDateDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98901ClrDateDd,ip98901ClrDateDd.length);
   	
   }
   
   public void setIp98901ClrDateDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901ClrDateDd,ip98901ClrDateDd.length);
   	
   }
   
     /**
	 * 	Update Ip98901ClrDateDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98901ClrDateDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901ClrDateDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98901ClrDateDd with another Field
	 *	@param value
	 */
   public void setIp98901ClrDateDd(Field source) {
       replace(source,0,source.length(),beginIp98901ClrDateDd,IP_98901_CLR_DATE_DD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98901ClrDateDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98901ClrDateDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98901ClrDateDd,IP_98901_CLR_DATE_DD_LEN);
   	
   }
   
     /**
	 * 	Update Ip98901ClrDateDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98901ClrDateDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901ClrDateDd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip98901ClearingDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp98901ClrDateYy(CONSTANTS.SPACE_2);
         setIp98901ClrDateMm(CONSTANTS.SPACE_2);
         setIp98901ClrDateDd(CONSTANTS.SPACE_2);
   }

		public static int getIp98901ClearingDateFieldLength() {
			return IP_98901_CLEARING_DATE_LENGTH;
		}

}
  
