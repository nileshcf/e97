package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014TableDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip02014TableDataKey extends Ip02014TableDataKeySerialized { 
   

						private char[] ip02014PrcssAgrmtId = Field.fillLowValue(11);
	
	/**
	* Constructor for Ip02014TableDataKey
	**/
    public Ip02014TableDataKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip02014TableDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014TableDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip02014PrcssAgrmtId
	 *	@return ip02014PrcssAgrmtId
	 */
   public char[] getIp02014PrcssAgrmtId() throws CFException{
     if (isIp02014PrcssAgrmtIdModified()) { 
        ip02014PrcssAgrmtId = refreshIp02014PrcssAgrmtId();
     }
   		return ip02014PrcssAgrmtId;
   }

  
	/**
	*  set variable ip02014PrcssAgrmtId
	*  Corresponding COBOL Variable is IP02014-PRCSS-AGRMT-ID
	*  @param value
	**/
   public void setIp02014PrcssAgrmtId(char[] value) {
      ip02014PrcssAgrmtId = checkIp02014PrcssAgrmtIdConstraints(value);
      serializeIp02014PrcssAgrmtId(ip02014PrcssAgrmtId);
   } 

     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014PrcssAgrmtId,ip02014PrcssAgrmtId.length);
   	
   }
   
   public void setIp02014PrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014PrcssAgrmtId,ip02014PrcssAgrmtId.length);
   	
   }
   
     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014PrcssAgrmtId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014PrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(Field source) {
       replace(source,0,source.length(),beginIp02014PrcssAgrmtId,IP_02014_PRCSS_AGRMT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014PrcssAgrmtId,IP_02014_PRCSS_AGRMT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014PrcssAgrmtId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip02014TableDataKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02014PrcssAgrmtId(CONSTANTS.SPACE_11);
   }

		public static int getIp02014TableDataKeyFieldLength() {
			return IP_02014_TABLE_DATA_KEY_LENGTH;
		}

}
  
