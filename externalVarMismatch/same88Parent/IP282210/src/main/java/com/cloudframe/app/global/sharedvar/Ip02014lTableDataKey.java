package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014lTableDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:33. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip02014lTableDataKey extends Ip02014lTableDataKeySerialized { 
   

						private char[] ip02014lPrcssAgrmtId = Field.fillLowValue(11);
	
	/**
	* Constructor for Ip02014lTableDataKey
	**/
    public Ip02014lTableDataKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip02014lTableDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014lTableDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip02014lPrcssAgrmtId
	 *	@return ip02014lPrcssAgrmtId
	 */
   public char[] getIp02014lPrcssAgrmtId() throws CFException{
     if (isIp02014lPrcssAgrmtIdModified()) { 
        ip02014lPrcssAgrmtId = refreshIp02014lPrcssAgrmtId();
     }
   		return ip02014lPrcssAgrmtId;
   }

  
	/**
	*  set variable ip02014lPrcssAgrmtId
	*  Corresponding COBOL Variable is IP02014L-PRCSS-AGRMT-ID
	*  @param value
	**/
   public void setIp02014lPrcssAgrmtId(char[] value) {
      ip02014lPrcssAgrmtId = checkIp02014lPrcssAgrmtIdConstraints(value);
      serializeIp02014lPrcssAgrmtId(ip02014lPrcssAgrmtId);
   } 

     /**
	 * 	Update Ip02014lPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014lPrcssAgrmtId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014lPrcssAgrmtId,ip02014lPrcssAgrmtId.length);
   	
   }
   
   public void setIp02014lPrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lPrcssAgrmtId,ip02014lPrcssAgrmtId.length);
   	
   }
   
     /**
	 * 	Update Ip02014lPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lPrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lPrcssAgrmtId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014lPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02014lPrcssAgrmtId(Field source) {
       replace(source,0,source.length(),beginIp02014lPrcssAgrmtId,IP_02014L_PRCSS_AGRMT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014lPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014lPrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014lPrcssAgrmtId,IP_02014L_PRCSS_AGRMT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014lPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014lPrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014lPrcssAgrmtId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip02014lTableDataKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02014lPrcssAgrmtId(CONSTANTS.SPACE_11);
   }

		public static int getIp02014lTableDataKeyFieldLength() {
			return IP_02014L_TABLE_DATA_KEY_LENGTH;
		}

}
  
