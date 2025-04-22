package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004MsgData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip40004MsgData extends Ip40004MsgDataSerialized { 
   

								private int ip40004MsgLen;

						private char[] ip40004MsgDetail = Field.fillLowValue(27383);
	
	/**
	* Constructor for Ip40004MsgData
	**/
    public Ip40004MsgData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip40004MsgData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004MsgData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip40004MsgLen
	 *	@return ip40004MsgLen
	 */
	public int getIp40004MsgLen() throws CFException {
        if (isIp40004MsgLenModified()) { 
           ip40004MsgLen = refreshIp40004MsgLen();
        }
   		return ip40004MsgLen;
	}
	
	/**
	 * 	Update Ip40004MsgLen with the passed value
	 *  Corresponding COBOL Variable is IP40004-MSG-LEN
	 *	@param number
	 */
	public void setIp40004MsgLen(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip40004MsgLen = checkIp40004MsgLenMaxLimit(number); 
		serializeIp40004MsgLen(ip40004MsgLen);
	}


	public void setIp40004MsgLen(long number) {
	    number = checkIp40004MsgLenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp40004MsgLen((int)number);
	}
	
	/**
	 *	Returns the value of ip40004MsgDetail
	 *	@return ip40004MsgDetail
	 */
   public char[] getIp40004MsgDetail() throws CFException{
     if (isIp40004MsgDetailModified()) { 
        ip40004MsgDetail = refreshIp40004MsgDetail();
     }
   		return ip40004MsgDetail;
   }

  
	/**
	*  set variable ip40004MsgDetail
	*  Corresponding COBOL Variable is IP40004-MSG-DETAIL
	*  @param value
	**/
   public void setIp40004MsgDetail(char[] value) {
      ip40004MsgDetail = checkIp40004MsgDetailConstraints(value);
      serializeIp40004MsgDetail(ip40004MsgDetail);
   } 

     /**
	 * 	Update Ip40004MsgDetail 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004MsgDetail(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004MsgDetail,ip40004MsgDetail.length);
   	
   }
   
   public void setIp40004MsgDetail(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004MsgDetail,ip40004MsgDetail.length);
   	
   }
   
     /**
	 * 	Update Ip40004MsgDetail 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004MsgDetail(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004MsgDetail+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004MsgDetail with another Field
	 *	@param value
	 */
   public void setIp40004MsgDetail(Field source) {
       replace(source,0,source.length(),beginIp40004MsgDetail,IP_40004_MSG_DETAIL_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004MsgDetail 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004MsgDetail(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004MsgDetail,IP_40004_MSG_DETAIL_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004MsgDetail 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004MsgDetail(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004MsgDetail+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip40004MsgData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp40004MsgLen(0);
         setIp40004MsgDetail(CONSTANTS.SPACE_27383);
   }

		public static int getIp40004MsgDataFieldLength() {
			return IP_40004_MSG_DATA_LENGTH;
		}

}
  
