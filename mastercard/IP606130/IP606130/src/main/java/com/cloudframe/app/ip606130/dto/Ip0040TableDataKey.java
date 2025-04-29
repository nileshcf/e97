package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040TableDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip0040TableDataKey extends Ip0040TableDataKeySerialized { 
   

						private char[] ip0040AccRangeL = Field.fillLowValue(19);

						private char[] ip0040ProdId = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip0040TableDataKey
	**/
    public Ip0040TableDataKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0040TableDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040TableDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip0040AccRangeL
	 *	@return ip0040AccRangeL
	 */
   public char[] getIp0040AccRangeL() throws CFException{
     if (isIp0040AccRangeLModified()) { 
        ip0040AccRangeL = refreshIp0040AccRangeL();
     }
   		return ip0040AccRangeL;
   }

  
	/**
	*  set variable ip0040AccRangeL
	*  Corresponding COBOL Variable is IP0040-ACC-RANGE-L
	*  @param value
	**/
   public void setIp0040AccRangeL(char[] value) {
      ip0040AccRangeL = checkIp0040AccRangeLConstraints(value);
      serializeIp0040AccRangeL(ip0040AccRangeL);
   } 

     /**
	 * 	Update Ip0040AccRangeL 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040AccRangeL(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040AccRangeL,ip0040AccRangeL.length);
   	
   }
   
   public void setIp0040AccRangeL(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040AccRangeL,ip0040AccRangeL.length);
   	
   }
   
     /**
	 * 	Update Ip0040AccRangeL 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040AccRangeL(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040AccRangeL+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040AccRangeL with another Field
	 *	@param value
	 */
   public void setIp0040AccRangeL(Field source) {
       replace(source,0,source.length(),beginIp0040AccRangeL,IP_0040_ACC_RANGE_L_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040AccRangeL 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040AccRangeL(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040AccRangeL,IP_0040_ACC_RANGE_L_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040AccRangeL 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040AccRangeL(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040AccRangeL+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040ProdId
	 *	@return ip0040ProdId
	 */
   public char[] getIp0040ProdId() throws CFException{
     if (isIp0040ProdIdModified()) { 
        ip0040ProdId = refreshIp0040ProdId();
     }
   		return ip0040ProdId;
   }

  
	/**
	*  set variable ip0040ProdId
	*  Corresponding COBOL Variable is IP0040-PROD-ID
	*  @param value
	**/
   public void setIp0040ProdId(char[] value) {
      ip0040ProdId = checkIp0040ProdIdConstraints(value);
      serializeIp0040ProdId(ip0040ProdId);
   } 

     /**
	 * 	Update Ip0040ProdId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040ProdId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040ProdId,ip0040ProdId.length);
   	
   }
   
   public void setIp0040ProdId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ProdId,ip0040ProdId.length);
   	
   }
   
     /**
	 * 	Update Ip0040ProdId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040ProdId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ProdId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040ProdId with another Field
	 *	@param value
	 */
   public void setIp0040ProdId(Field source) {
       replace(source,0,source.length(),beginIp0040ProdId,IP_0040_PROD_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040ProdId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040ProdId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040ProdId,IP_0040_PROD_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040ProdId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040ProdId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ProdId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip0040TableDataKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0040AccRangeL(CONSTANTS.SPACE_19);
         setIp0040ProdId(CONSTANTS.SPACE_3);
   }

		public static int getIp0040TableDataKeyFieldLength() {
			return IP_0040_TABLE_DATA_KEY_LENGTH;
		}

}
  
