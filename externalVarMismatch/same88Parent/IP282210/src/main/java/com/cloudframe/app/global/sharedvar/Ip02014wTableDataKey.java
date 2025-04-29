package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014wTableDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:33. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip02014wTableDataKey extends Ip02014wTableDataKeySerialized { 
   

						private char[] ip02014wPrcssAgrmtId = Field.fillLowValue(11);
	
	/**
	* Constructor for Ip02014wTableDataKey
	**/
    public Ip02014wTableDataKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip02014wTableDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014wTableDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip02014wPrcssAgrmtId
	 *	@return ip02014wPrcssAgrmtId
	 */
   public char[] getIp02014wPrcssAgrmtId() throws CFException{
     if (isIp02014wPrcssAgrmtIdModified()) { 
        ip02014wPrcssAgrmtId = refreshIp02014wPrcssAgrmtId();
     }
   		return ip02014wPrcssAgrmtId;
   }

  
	/**
	*  set variable ip02014wPrcssAgrmtId
	*  Corresponding COBOL Variable is IP02014W-PRCSS-AGRMT-ID
	*  @param value
	**/
   public void setIp02014wPrcssAgrmtId(char[] value) {
      ip02014wPrcssAgrmtId = checkIp02014wPrcssAgrmtIdConstraints(value);
      serializeIp02014wPrcssAgrmtId(ip02014wPrcssAgrmtId);
   } 

     /**
	 * 	Update Ip02014wPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014wPrcssAgrmtId,ip02014wPrcssAgrmtId.length);
   	
   }
   
   public void setIp02014wPrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wPrcssAgrmtId,ip02014wPrcssAgrmtId.length);
   	
   }
   
     /**
	 * 	Update Ip02014wPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wPrcssAgrmtId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014wPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtId(Field source) {
       replace(source,0,source.length(),beginIp02014wPrcssAgrmtId,IP_02014W_PRCSS_AGRMT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014wPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014wPrcssAgrmtId,IP_02014W_PRCSS_AGRMT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014wPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014wPrcssAgrmtId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip02014wTableDataKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02014wPrcssAgrmtId(CONSTANTS.SPACE_11);
   }

		public static int getIp02014wTableDataKeyFieldLength() {
			return IP_02014W_TABLE_DATA_KEY_LENGTH;
		}

}
  
