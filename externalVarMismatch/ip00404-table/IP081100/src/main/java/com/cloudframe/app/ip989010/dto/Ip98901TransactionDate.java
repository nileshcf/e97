package com.cloudframe.app.ip989010.dto;

/**
*  The class Ip98901TransactionDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip98901TransactionDate extends Ip98901TransactionDateSerialized { 
   

						private char[] ip98901TxnDateYy = Field.fillLowValue(2);

						private char[] ip98901TxnDateMm = Field.fillLowValue(2);

						private char[] ip98901TxnDateDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip98901TransactionDate
	**/
    public Ip98901TransactionDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip98901TransactionDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip98901TransactionDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip98901TxnDateYy
	 *	@return ip98901TxnDateYy
	 */
   public char[] getIp98901TxnDateYy() throws CFException{
     if (isIp98901TxnDateYyModified()) { 
        ip98901TxnDateYy = refreshIp98901TxnDateYy();
     }
   		return ip98901TxnDateYy;
   }

  
	/**
	*  set variable ip98901TxnDateYy
	*  Corresponding COBOL Variable is IP98901-TXN-DATE-YY
	*  @param value
	**/
   public void setIp98901TxnDateYy(char[] value) {
      ip98901TxnDateYy = checkIp98901TxnDateYyConstraints(value);
      serializeIp98901TxnDateYy(ip98901TxnDateYy);
   } 

     /**
	 * 	Update Ip98901TxnDateYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98901TxnDateYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98901TxnDateYy,ip98901TxnDateYy.length);
   	
   }
   
   public void setIp98901TxnDateYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901TxnDateYy,ip98901TxnDateYy.length);
   	
   }
   
     /**
	 * 	Update Ip98901TxnDateYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98901TxnDateYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901TxnDateYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98901TxnDateYy with another Field
	 *	@param value
	 */
   public void setIp98901TxnDateYy(Field source) {
       replace(source,0,source.length(),beginIp98901TxnDateYy,IP_98901_TXN_DATE_YY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98901TxnDateYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98901TxnDateYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98901TxnDateYy,IP_98901_TXN_DATE_YY_LEN);
   	
   }
   
     /**
	 * 	Update Ip98901TxnDateYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98901TxnDateYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901TxnDateYy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip98901TxnDateMm
	 *	@return ip98901TxnDateMm
	 */
   public char[] getIp98901TxnDateMm() throws CFException{
     if (isIp98901TxnDateMmModified()) { 
        ip98901TxnDateMm = refreshIp98901TxnDateMm();
     }
   		return ip98901TxnDateMm;
   }

  
	/**
	*  set variable ip98901TxnDateMm
	*  Corresponding COBOL Variable is IP98901-TXN-DATE-MM
	*  @param value
	**/
   public void setIp98901TxnDateMm(char[] value) {
      ip98901TxnDateMm = checkIp98901TxnDateMmConstraints(value);
      serializeIp98901TxnDateMm(ip98901TxnDateMm);
   } 

     /**
	 * 	Update Ip98901TxnDateMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98901TxnDateMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98901TxnDateMm,ip98901TxnDateMm.length);
   	
   }
   
   public void setIp98901TxnDateMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901TxnDateMm,ip98901TxnDateMm.length);
   	
   }
   
     /**
	 * 	Update Ip98901TxnDateMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98901TxnDateMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901TxnDateMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98901TxnDateMm with another Field
	 *	@param value
	 */
   public void setIp98901TxnDateMm(Field source) {
       replace(source,0,source.length(),beginIp98901TxnDateMm,IP_98901_TXN_DATE_MM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98901TxnDateMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98901TxnDateMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98901TxnDateMm,IP_98901_TXN_DATE_MM_LEN);
   	
   }
   
     /**
	 * 	Update Ip98901TxnDateMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98901TxnDateMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901TxnDateMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip98901TxnDateDd
	 *	@return ip98901TxnDateDd
	 */
   public char[] getIp98901TxnDateDd() throws CFException{
     if (isIp98901TxnDateDdModified()) { 
        ip98901TxnDateDd = refreshIp98901TxnDateDd();
     }
   		return ip98901TxnDateDd;
   }

  
	/**
	*  set variable ip98901TxnDateDd
	*  Corresponding COBOL Variable is IP98901-TXN-DATE-DD
	*  @param value
	**/
   public void setIp98901TxnDateDd(char[] value) {
      ip98901TxnDateDd = checkIp98901TxnDateDdConstraints(value);
      serializeIp98901TxnDateDd(ip98901TxnDateDd);
   } 

     /**
	 * 	Update Ip98901TxnDateDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98901TxnDateDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98901TxnDateDd,ip98901TxnDateDd.length);
   	
   }
   
   public void setIp98901TxnDateDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901TxnDateDd,ip98901TxnDateDd.length);
   	
   }
   
     /**
	 * 	Update Ip98901TxnDateDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98901TxnDateDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901TxnDateDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98901TxnDateDd with another Field
	 *	@param value
	 */
   public void setIp98901TxnDateDd(Field source) {
       replace(source,0,source.length(),beginIp98901TxnDateDd,IP_98901_TXN_DATE_DD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98901TxnDateDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98901TxnDateDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98901TxnDateDd,IP_98901_TXN_DATE_DD_LEN);
   	
   }
   
     /**
	 * 	Update Ip98901TxnDateDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98901TxnDateDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901TxnDateDd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip98901TransactionDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp98901TxnDateYy(CONSTANTS.SPACE_2);
         setIp98901TxnDateMm(CONSTANTS.SPACE_2);
         setIp98901TxnDateDd(CONSTANTS.SPACE_2);
   }

		public static int getIp98901TransactionDateFieldLength() {
			return IP_98901_TRANSACTION_DATE_LENGTH;
		}

}
  
