package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02044TableDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip02044TableDataKey extends Ip02044TableDataKeySerialized { 
   

						private char[] ip02044RngStrtNum = Field.fillLowValue(19);
	
	/**
	* Constructor for Ip02044TableDataKey
	**/
    public Ip02044TableDataKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip02044TableDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02044TableDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip02044RngStrtNum
	 *	@return ip02044RngStrtNum
	 */
   public char[] getIp02044RngStrtNum() throws CFException{
     if (isIp02044RngStrtNumModified()) { 
        ip02044RngStrtNum = refreshIp02044RngStrtNum();
     }
   		return ip02044RngStrtNum;
   }

  
	/**
	*  set variable ip02044RngStrtNum
	*  Corresponding COBOL Variable is IP02044-RNG-STRT-NUM
	*  @param value
	**/
   public void setIp02044RngStrtNum(char[] value) {
      ip02044RngStrtNum = checkIp02044RngStrtNumConstraints(value);
      serializeIp02044RngStrtNum(ip02044RngStrtNum);
   } 

     /**
	 * 	Update Ip02044RngStrtNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02044RngStrtNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02044RngStrtNum,ip02044RngStrtNum.length);
   	
   }
   
   public void setIp02044RngStrtNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02044RngStrtNum,ip02044RngStrtNum.length);
   	
   }
   
     /**
	 * 	Update Ip02044RngStrtNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02044RngStrtNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02044RngStrtNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02044RngStrtNum with another Field
	 *	@param value
	 */
   public void setIp02044RngStrtNum(Field source) {
       replace(source,0,source.length(),beginIp02044RngStrtNum,IP_02044_RNG_STRT_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02044RngStrtNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02044RngStrtNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02044RngStrtNum,IP_02044_RNG_STRT_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Ip02044RngStrtNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02044RngStrtNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02044RngStrtNum+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip02044TableDataKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02044RngStrtNum(CONSTANTS.SPACE_19);
   }

		public static int getIp02044TableDataKeyFieldLength() {
			return IP_02044_TABLE_DATA_KEY_LENGTH;
		}

}
  
