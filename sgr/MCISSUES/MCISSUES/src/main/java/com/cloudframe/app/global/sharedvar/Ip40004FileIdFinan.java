package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004FileIdFinan is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip40004FileIdFinan extends Ip40004FileIdFinanSerialized { 
   

						private char[] ip40004FinFileType = Field.fillLowValue(3);

								private long ip40004FinFileRefDate;

						private char[] ip40004FinProcessorId = Field.fillLowValue(11);

								private long ip40004FinFileSeqNum;
	
	/**
	* Constructor for Ip40004FileIdFinan
	**/
    public Ip40004FileIdFinan() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip40004FileIdFinan. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004FileIdFinan(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip40004FinFileType
	 *	@return ip40004FinFileType
	 */
   public char[] getIp40004FinFileType() throws CFException{
     if (isIp40004FinFileTypeModified()) { 
        ip40004FinFileType = refreshIp40004FinFileType();
     }
   		return ip40004FinFileType;
   }

  
	/**
	*  set variable ip40004FinFileType
	*  Corresponding COBOL Variable is IP40004-FIN-FILE-TYPE
	*  @param value
	**/
   public void setIp40004FinFileType(char[] value) {
      ip40004FinFileType = checkIp40004FinFileTypeConstraints(value);
      serializeIp40004FinFileType(ip40004FinFileType);
   } 

     /**
	 * 	Update Ip40004FinFileType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004FinFileType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004FinFileType,ip40004FinFileType.length);
   	
   }
   
   public void setIp40004FinFileType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FinFileType,ip40004FinFileType.length);
   	
   }
   
     /**
	 * 	Update Ip40004FinFileType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FinFileType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FinFileType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004FinFileType with another Field
	 *	@param value
	 */
   public void setIp40004FinFileType(Field source) {
       replace(source,0,source.length(),beginIp40004FinFileType,IP_40004_FIN_FILE_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004FinFileType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004FinFileType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004FinFileType,IP_40004_FIN_FILE_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004FinFileType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FinFileType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FinFileType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip40004FinFileRefDate
	 *	@return ip40004FinFileRefDate
	 */
	public long getIp40004FinFileRefDate() throws CFException {
       if (isIp40004FinFileRefDateModified()) { 
           ip40004FinFileRefDate = refreshIp40004FinFileRefDate();
        }
   		return ip40004FinFileRefDate;
	}
	

	
	   
	/**
	 * 	Update Ip40004FinFileRefDate with the passed value
	 *  Corresponding COBOL Variable is IP40004-FIN-FILE-REF-DATE
	 *	@param number
	 */
	public void setIp40004FinFileRefDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004FinFileRefDate = checkIp40004FinFileRefDateMaxLimit(number); 
		serializeIp40004FinFileRefDate(ip40004FinFileRefDate);
	}
	

	/**
	 * 	Update Ip40004FinFileRefDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004FinFileRefDate(char[] value) throws CFException {
		 ip40004FinFileRefDate = serializeIp40004FinFileRefDate(value);
	}
	/**
	 * 	Update Ip40004FinFileRefDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004FinFileRefDateString(char[] value) throws CFException {
		 setIp40004FinFileRefDate(value);
	}
	/**
	 *	Returns the value of ip40004FinProcessorId
	 *	@return ip40004FinProcessorId
	 */
   public char[] getIp40004FinProcessorId() throws CFException{
     if (isIp40004FinProcessorIdModified()) { 
        ip40004FinProcessorId = refreshIp40004FinProcessorId();
     }
   		return ip40004FinProcessorId;
   }

  
	/**
	*  set variable ip40004FinProcessorId
	*  Corresponding COBOL Variable is IP40004-FIN-PROCESSOR-ID
	*  @param value
	**/
   public void setIp40004FinProcessorId(char[] value) {
      ip40004FinProcessorId = checkIp40004FinProcessorIdConstraints(value);
      serializeIp40004FinProcessorId(ip40004FinProcessorId);
   } 

     /**
	 * 	Update Ip40004FinProcessorId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004FinProcessorId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004FinProcessorId,ip40004FinProcessorId.length);
   	
   }
   
   public void setIp40004FinProcessorId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FinProcessorId,ip40004FinProcessorId.length);
   	
   }
   
     /**
	 * 	Update Ip40004FinProcessorId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FinProcessorId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FinProcessorId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004FinProcessorId with another Field
	 *	@param value
	 */
   public void setIp40004FinProcessorId(Field source) {
       replace(source,0,source.length(),beginIp40004FinProcessorId,IP_40004_FIN_PROCESSOR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004FinProcessorId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004FinProcessorId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004FinProcessorId,IP_40004_FIN_PROCESSOR_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004FinProcessorId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FinProcessorId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FinProcessorId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip40004FinFileSeqNum
	 *	@return ip40004FinFileSeqNum
	 */
	public long getIp40004FinFileSeqNum() throws CFException {
       if (isIp40004FinFileSeqNumModified()) { 
           ip40004FinFileSeqNum = refreshIp40004FinFileSeqNum();
        }
   		return ip40004FinFileSeqNum;
	}
	

	
	   
	/**
	 * 	Update Ip40004FinFileSeqNum with the passed value
	 *  Corresponding COBOL Variable is IP40004-FIN-FILE-SEQ-NUM
	 *	@param number
	 */
	public void setIp40004FinFileSeqNum(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004FinFileSeqNum = checkIp40004FinFileSeqNumMaxLimit(number); 
		serializeIp40004FinFileSeqNum(ip40004FinFileSeqNum);
	}
	

	/**
	 * 	Update Ip40004FinFileSeqNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004FinFileSeqNum(char[] value) throws CFException {
		 ip40004FinFileSeqNum = serializeIp40004FinFileSeqNum(value);
	}
	/**
	 * 	Update Ip40004FinFileSeqNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004FinFileSeqNumString(char[] value) throws CFException {
		 setIp40004FinFileSeqNum(value);
	}

	
	
	
	/**
	 * 	initializes Ip40004FileIdFinan
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp40004FinFileType(CONSTANTS.SPACE_3);
                     setIp40004FinFileRefDate(0);
         setIp40004FinProcessorId(CONSTANTS.SPACE_11);
                     setIp40004FinFileSeqNum(0);
   }

		public static int getIp40004FileIdFinanFieldLength() {
			return IP_40004_FILE_ID_FINAN_LENGTH;
		}

}
  
