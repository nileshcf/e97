package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004TransId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip40004TransId extends Ip40004TransIdSerialized { 
   

						private char[] ip40004TransType = Field.fillLowValue(3);

								private long ip40004TransRefDate;

						private char[] ip40004TransProcessorId = Field.fillLowValue(11);

								private long ip40004TransSeqNum;
	
	/**
	* Constructor for Ip40004TransId
	**/
    public Ip40004TransId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip40004TransId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004TransId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip40004TransType
	 *	@return ip40004TransType
	 */
   public char[] getIp40004TransType() throws CFException{
     if (isIp40004TransTypeModified()) { 
        ip40004TransType = refreshIp40004TransType();
     }
   		return ip40004TransType;
   }

  
	/**
	*  set variable ip40004TransType
	*  Corresponding COBOL Variable is IP40004-TRANS-TYPE
	*  @param value
	**/
   public void setIp40004TransType(char[] value) {
      ip40004TransType = checkIp40004TransTypeConstraints(value);
      serializeIp40004TransType(ip40004TransType);
   } 

     /**
	 * 	Update Ip40004TransType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004TransType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004TransType,ip40004TransType.length);
   	
   }
   
   public void setIp40004TransType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004TransType,ip40004TransType.length);
   	
   }
   
     /**
	 * 	Update Ip40004TransType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004TransType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004TransType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004TransType with another Field
	 *	@param value
	 */
   public void setIp40004TransType(Field source) {
       replace(source,0,source.length(),beginIp40004TransType,IP_40004_TRANS_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004TransType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004TransType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004TransType,IP_40004_TRANS_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004TransType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004TransType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004TransType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip40004TransRefDate
	 *	@return ip40004TransRefDate
	 */
	public long getIp40004TransRefDate() throws CFException {
       if (isIp40004TransRefDateModified()) { 
           ip40004TransRefDate = refreshIp40004TransRefDate();
        }
   		return ip40004TransRefDate;
	}
	

	
	   
	/**
	 * 	Update Ip40004TransRefDate with the passed value
	 *  Corresponding COBOL Variable is IP40004-TRANS-REF-DATE
	 *	@param number
	 */
	public void setIp40004TransRefDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004TransRefDate = checkIp40004TransRefDateMaxLimit(number); 
		serializeIp40004TransRefDate(ip40004TransRefDate);
	}
	

	/**
	 * 	Update Ip40004TransRefDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004TransRefDate(char[] value) throws CFException {
		 ip40004TransRefDate = serializeIp40004TransRefDate(value);
	}
	/**
	 * 	Update Ip40004TransRefDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004TransRefDateString(char[] value) throws CFException {
		 setIp40004TransRefDate(value);
	}
	/**
	 *	Returns the value of ip40004TransProcessorId
	 *	@return ip40004TransProcessorId
	 */
   public char[] getIp40004TransProcessorId() throws CFException{
     if (isIp40004TransProcessorIdModified()) { 
        ip40004TransProcessorId = refreshIp40004TransProcessorId();
     }
   		return ip40004TransProcessorId;
   }

  
	/**
	*  set variable ip40004TransProcessorId
	*  Corresponding COBOL Variable is IP40004-TRANS-PROCESSOR-ID
	*  @param value
	**/
   public void setIp40004TransProcessorId(char[] value) {
      ip40004TransProcessorId = checkIp40004TransProcessorIdConstraints(value);
      serializeIp40004TransProcessorId(ip40004TransProcessorId);
   } 

     /**
	 * 	Update Ip40004TransProcessorId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004TransProcessorId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004TransProcessorId,ip40004TransProcessorId.length);
   	
   }
   
   public void setIp40004TransProcessorId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004TransProcessorId,ip40004TransProcessorId.length);
   	
   }
   
     /**
	 * 	Update Ip40004TransProcessorId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004TransProcessorId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004TransProcessorId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004TransProcessorId with another Field
	 *	@param value
	 */
   public void setIp40004TransProcessorId(Field source) {
       replace(source,0,source.length(),beginIp40004TransProcessorId,IP_40004_TRANS_PROCESSOR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004TransProcessorId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004TransProcessorId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004TransProcessorId,IP_40004_TRANS_PROCESSOR_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004TransProcessorId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004TransProcessorId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004TransProcessorId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip40004TransSeqNum
	 *	@return ip40004TransSeqNum
	 */
	public long getIp40004TransSeqNum() throws CFException {
       if (isIp40004TransSeqNumModified()) { 
           ip40004TransSeqNum = refreshIp40004TransSeqNum();
        }
   		return ip40004TransSeqNum;
	}
	

	
	   
	/**
	 * 	Update Ip40004TransSeqNum with the passed value
	 *  Corresponding COBOL Variable is IP40004-TRANS-SEQ-NUM
	 *	@param number
	 */
	public void setIp40004TransSeqNum(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004TransSeqNum = checkIp40004TransSeqNumMaxLimit(number); 
		serializeIp40004TransSeqNum(ip40004TransSeqNum);
	}
	

	/**
	 * 	Update Ip40004TransSeqNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004TransSeqNum(char[] value) throws CFException {
		 ip40004TransSeqNum = serializeIp40004TransSeqNum(value);
	}
	/**
	 * 	Update Ip40004TransSeqNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004TransSeqNumString(char[] value) throws CFException {
		 setIp40004TransSeqNum(value);
	}

	
	
	
	/**
	 * 	initializes Ip40004TransId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp40004TransType(CONSTANTS.SPACE_3);
                     setIp40004TransRefDate(0);
         setIp40004TransProcessorId(CONSTANTS.SPACE_11);
                     setIp40004TransSeqNum(0);
   }

		public static int getIp40004TransIdFieldLength() {
			return IP_40004_TRANS_ID_LENGTH;
		}

}
  
