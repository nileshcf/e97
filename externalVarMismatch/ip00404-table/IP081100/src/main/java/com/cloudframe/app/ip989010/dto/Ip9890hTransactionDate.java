package com.cloudframe.app.ip989010.dto;

/**
*  The class Ip9890hTransactionDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip9890hTransactionDate extends Ip9890hTransactionDateSerialized { 
   

						private char[] ip9890hTxnDateYy = Field.fillLowValue(2);

						private char[] ip9890hTxnDateMm = Field.fillLowValue(2);

						private char[] ip9890hTxnDateDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip9890hTransactionDate
	**/
    public Ip9890hTransactionDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip9890hTransactionDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip9890hTransactionDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip9890hTxnDateYy
	 *	@return ip9890hTxnDateYy
	 */
   public char[] getIp9890hTxnDateYy() throws CFException{
     if (isIp9890hTxnDateYyModified()) { 
        ip9890hTxnDateYy = refreshIp9890hTxnDateYy();
     }
   		return ip9890hTxnDateYy;
   }

  
	/**
	*  set variable ip9890hTxnDateYy
	*  Corresponding COBOL Variable is IP9890H-TXN-DATE-YY
	*  @param value
	**/
   public void setIp9890hTxnDateYy(char[] value) {
      ip9890hTxnDateYy = checkIp9890hTxnDateYyConstraints(value);
      serializeIp9890hTxnDateYy(ip9890hTxnDateYy);
   } 

     /**
	 * 	Update Ip9890hTxnDateYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp9890hTxnDateYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp9890hTxnDateYy,ip9890hTxnDateYy.length);
   	
   }
   
   public void setIp9890hTxnDateYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hTxnDateYy,ip9890hTxnDateYy.length);
   	
   }
   
     /**
	 * 	Update Ip9890hTxnDateYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hTxnDateYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hTxnDateYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip9890hTxnDateYy with another Field
	 *	@param value
	 */
   public void setIp9890hTxnDateYy(Field source) {
       replace(source,0,source.length(),beginIp9890hTxnDateYy,IP_9890H_TXN_DATE_YY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip9890hTxnDateYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp9890hTxnDateYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp9890hTxnDateYy,IP_9890H_TXN_DATE_YY_LEN);
   	
   }
   
     /**
	 * 	Update Ip9890hTxnDateYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hTxnDateYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hTxnDateYy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip9890hTxnDateMm
	 *	@return ip9890hTxnDateMm
	 */
   public char[] getIp9890hTxnDateMm() throws CFException{
     if (isIp9890hTxnDateMmModified()) { 
        ip9890hTxnDateMm = refreshIp9890hTxnDateMm();
     }
   		return ip9890hTxnDateMm;
   }

  
	/**
	*  set variable ip9890hTxnDateMm
	*  Corresponding COBOL Variable is IP9890H-TXN-DATE-MM
	*  @param value
	**/
   public void setIp9890hTxnDateMm(char[] value) {
      ip9890hTxnDateMm = checkIp9890hTxnDateMmConstraints(value);
      serializeIp9890hTxnDateMm(ip9890hTxnDateMm);
   } 

     /**
	 * 	Update Ip9890hTxnDateMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp9890hTxnDateMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp9890hTxnDateMm,ip9890hTxnDateMm.length);
   	
   }
   
   public void setIp9890hTxnDateMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hTxnDateMm,ip9890hTxnDateMm.length);
   	
   }
   
     /**
	 * 	Update Ip9890hTxnDateMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hTxnDateMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hTxnDateMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip9890hTxnDateMm with another Field
	 *	@param value
	 */
   public void setIp9890hTxnDateMm(Field source) {
       replace(source,0,source.length(),beginIp9890hTxnDateMm,IP_9890H_TXN_DATE_MM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip9890hTxnDateMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp9890hTxnDateMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp9890hTxnDateMm,IP_9890H_TXN_DATE_MM_LEN);
   	
   }
   
     /**
	 * 	Update Ip9890hTxnDateMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hTxnDateMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hTxnDateMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip9890hTxnDateDd
	 *	@return ip9890hTxnDateDd
	 */
   public char[] getIp9890hTxnDateDd() throws CFException{
     if (isIp9890hTxnDateDdModified()) { 
        ip9890hTxnDateDd = refreshIp9890hTxnDateDd();
     }
   		return ip9890hTxnDateDd;
   }

  
	/**
	*  set variable ip9890hTxnDateDd
	*  Corresponding COBOL Variable is IP9890H-TXN-DATE-DD
	*  @param value
	**/
   public void setIp9890hTxnDateDd(char[] value) {
      ip9890hTxnDateDd = checkIp9890hTxnDateDdConstraints(value);
      serializeIp9890hTxnDateDd(ip9890hTxnDateDd);
   } 

     /**
	 * 	Update Ip9890hTxnDateDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp9890hTxnDateDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp9890hTxnDateDd,ip9890hTxnDateDd.length);
   	
   }
   
   public void setIp9890hTxnDateDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hTxnDateDd,ip9890hTxnDateDd.length);
   	
   }
   
     /**
	 * 	Update Ip9890hTxnDateDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hTxnDateDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hTxnDateDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip9890hTxnDateDd with another Field
	 *	@param value
	 */
   public void setIp9890hTxnDateDd(Field source) {
       replace(source,0,source.length(),beginIp9890hTxnDateDd,IP_9890H_TXN_DATE_DD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip9890hTxnDateDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp9890hTxnDateDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp9890hTxnDateDd,IP_9890H_TXN_DATE_DD_LEN);
   	
   }
   
     /**
	 * 	Update Ip9890hTxnDateDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hTxnDateDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hTxnDateDd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip9890hTransactionDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp9890hTxnDateYy(CONSTANTS.SPACE_2);
         setIp9890hTxnDateMm(CONSTANTS.SPACE_2);
         setIp9890hTxnDateDd(CONSTANTS.SPACE_2);
   }

		public static int getIp9890hTransactionDateFieldLength() {
			return IP_9890H_TRANSACTION_DATE_LENGTH;
		}

}
  
