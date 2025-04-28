package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip43501EiData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip43501EiData extends Ip43501EiDataSerialized { 
   

						private char[] ip43501EiInvalidData = Field.fillLowValue(50);

						private char[] ip43501RejMsgData = Field.fillLowValue(949);
	
	/**
	* Constructor for Ip43501EiData
	**/
    public Ip43501EiData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip43501EiData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip43501EiData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip43501EiInvalidData
	 *	@return ip43501EiInvalidData
	 */
   public char[] getIp43501EiInvalidData() throws CFException{
     if (isIp43501EiInvalidDataModified()) { 
        ip43501EiInvalidData = refreshIp43501EiInvalidData();
     }
   		return ip43501EiInvalidData;
   }

  
	/**
	*  set variable ip43501EiInvalidData
	*  Corresponding COBOL Variable is IP43501-EI-INVALID-DATA
	*  @param value
	**/
   public void setIp43501EiInvalidData(char[] value) {
      ip43501EiInvalidData = checkIp43501EiInvalidDataConstraints(value);
      serializeIp43501EiInvalidData(ip43501EiInvalidData);
   } 

     /**
	 * 	Update Ip43501EiInvalidData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiInvalidData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501EiInvalidData,ip43501EiInvalidData.length);
   	
   }
   
   public void setIp43501EiInvalidData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiInvalidData,ip43501EiInvalidData.length);
   	
   }
   
     /**
	 * 	Update Ip43501EiInvalidData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiInvalidData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiInvalidData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501EiInvalidData with another Field
	 *	@param value
	 */
   public void setIp43501EiInvalidData(Field source) {
       replace(source,0,source.length(),beginIp43501EiInvalidData,IP_43501_EI_INVALID_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501EiInvalidData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501EiInvalidData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501EiInvalidData,IP_43501_EI_INVALID_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501EiInvalidData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiInvalidData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiInvalidData+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip43501RejMsgData
	 *	@return ip43501RejMsgData
	 */
   public char[] getIp43501RejMsgData() throws CFException{
     if (isIp43501RejMsgDataModified()) { 
        ip43501RejMsgData = refreshIp43501RejMsgData();
     }
   		return ip43501RejMsgData;
   }

  
	/**
	*  set variable ip43501RejMsgData
	*  Corresponding COBOL Variable is IP43501-REJ-MSG-DATA
	*  @param value
	**/
   public void setIp43501RejMsgData(char[] value) {
      ip43501RejMsgData = checkIp43501RejMsgDataConstraints(value);
      serializeIp43501RejMsgData(ip43501RejMsgData);
   } 

     /**
	 * 	Update Ip43501RejMsgData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501RejMsgData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501RejMsgData,ip43501RejMsgData.length);
   	
   }
   
   public void setIp43501RejMsgData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501RejMsgData,ip43501RejMsgData.length);
   	
   }
   
     /**
	 * 	Update Ip43501RejMsgData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501RejMsgData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501RejMsgData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501RejMsgData with another Field
	 *	@param value
	 */
   public void setIp43501RejMsgData(Field source) {
       replace(source,0,source.length(),beginIp43501RejMsgData,IP_43501_REJ_MSG_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501RejMsgData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501RejMsgData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501RejMsgData,IP_43501_REJ_MSG_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501RejMsgData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501RejMsgData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501RejMsgData+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip43501EiData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp43501EiInvalidData(CONSTANTS.SPACE_50);
         setIp43501RejMsgData(CONSTANTS.SPACE_949);
   }

		public static int getIp43501EiDataFieldLength() {
			return IP_43501_EI_DATA_LENGTH;
		}

}
  
