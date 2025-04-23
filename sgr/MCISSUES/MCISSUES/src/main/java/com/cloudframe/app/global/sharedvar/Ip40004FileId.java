package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004FileId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip40004FileId extends Ip40004FileIdSerialized { 
   

						private char[] ip40004FileType = Field.fillLowValue(3);

								private long ip40004FileRefDate;

						private char[] ip40004ProcessorId = Field.fillLowValue(11);

								private long ip40004FileSeqNum;
	
	/**
	* Constructor for Ip40004FileId
	**/
    public Ip40004FileId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip40004FileId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004FileId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip40004FileType
	 *	@return ip40004FileType
	 */
   public char[] getIp40004FileType() throws CFException{
     if (isIp40004FileTypeModified()) { 
        ip40004FileType = refreshIp40004FileType();
     }
   		return ip40004FileType;
   }

  
	/**
	*  set variable ip40004FileType
	*  Corresponding COBOL Variable is IP40004-FILE-TYPE
	*  @param value
	**/
   public void setIp40004FileType(char[] value) {
      ip40004FileType = checkIp40004FileTypeConstraints(value);
      serializeIp40004FileType(ip40004FileType);
   } 

     /**
	 * 	Update Ip40004FileType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004FileType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004FileType,ip40004FileType.length);
   	
   }
   
   public void setIp40004FileType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FileType,ip40004FileType.length);
   	
   }
   
     /**
	 * 	Update Ip40004FileType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FileType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FileType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004FileType with another Field
	 *	@param value
	 */
   public void setIp40004FileType(Field source) {
       replace(source,0,source.length(),beginIp40004FileType,IP_40004_FILE_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004FileType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004FileType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004FileType,IP_40004_FILE_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004FileType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FileType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FileType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip40004FileRefDate
	 *	@return ip40004FileRefDate
	 */
	public long getIp40004FileRefDate() throws CFException {
       if (isIp40004FileRefDateModified()) { 
           ip40004FileRefDate = refreshIp40004FileRefDate();
        }
   		return ip40004FileRefDate;
	}
	

	
	   
	/**
	 * 	Update Ip40004FileRefDate with the passed value
	 *  Corresponding COBOL Variable is IP40004-FILE-REF-DATE
	 *	@param number
	 */
	public void setIp40004FileRefDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004FileRefDate = checkIp40004FileRefDateMaxLimit(number); 
		serializeIp40004FileRefDate(ip40004FileRefDate);
	}
	

	/**
	 * 	Update Ip40004FileRefDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004FileRefDate(char[] value) throws CFException {
		 ip40004FileRefDate = serializeIp40004FileRefDate(value);
	}
	/**
	 * 	Update Ip40004FileRefDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004FileRefDateString(char[] value) throws CFException {
		 setIp40004FileRefDate(value);
	}
	/**
	 *	Returns the value of ip40004ProcessorId
	 *	@return ip40004ProcessorId
	 */
   public char[] getIp40004ProcessorId() throws CFException{
     if (isIp40004ProcessorIdModified()) { 
        ip40004ProcessorId = refreshIp40004ProcessorId();
     }
   		return ip40004ProcessorId;
   }

  
	/**
	*  set variable ip40004ProcessorId
	*  Corresponding COBOL Variable is IP40004-PROCESSOR-ID
	*  @param value
	**/
   public void setIp40004ProcessorId(char[] value) {
      ip40004ProcessorId = checkIp40004ProcessorIdConstraints(value);
      serializeIp40004ProcessorId(ip40004ProcessorId);
   } 

     /**
	 * 	Update Ip40004ProcessorId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004ProcessorId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004ProcessorId,ip40004ProcessorId.length);
   	
   }
   
   public void setIp40004ProcessorId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004ProcessorId,ip40004ProcessorId.length);
   	
   }
   
     /**
	 * 	Update Ip40004ProcessorId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004ProcessorId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004ProcessorId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004ProcessorId with another Field
	 *	@param value
	 */
   public void setIp40004ProcessorId(Field source) {
       replace(source,0,source.length(),beginIp40004ProcessorId,IP_40004_PROCESSOR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004ProcessorId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004ProcessorId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004ProcessorId,IP_40004_PROCESSOR_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004ProcessorId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004ProcessorId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004ProcessorId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip40004FileSeqNum
	 *	@return ip40004FileSeqNum
	 */
	public long getIp40004FileSeqNum() throws CFException {
       if (isIp40004FileSeqNumModified()) { 
           ip40004FileSeqNum = refreshIp40004FileSeqNum();
        }
   		return ip40004FileSeqNum;
	}
	

	
	   
	/**
	 * 	Update Ip40004FileSeqNum with the passed value
	 *  Corresponding COBOL Variable is IP40004-FILE-SEQ-NUM
	 *	@param number
	 */
	public void setIp40004FileSeqNum(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004FileSeqNum = checkIp40004FileSeqNumMaxLimit(number); 
		serializeIp40004FileSeqNum(ip40004FileSeqNum);
	}
	

	/**
	 * 	Update Ip40004FileSeqNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004FileSeqNum(char[] value) throws CFException {
		 ip40004FileSeqNum = serializeIp40004FileSeqNum(value);
	}
	/**
	 * 	Update Ip40004FileSeqNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004FileSeqNumString(char[] value) throws CFException {
		 setIp40004FileSeqNum(value);
	}

	
	
	
	/**
	 * 	initializes Ip40004FileId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp40004FileType(CONSTANTS.SPACE_3);
                     setIp40004FileRefDate(0);
         setIp40004ProcessorId(CONSTANTS.SPACE_11);
                     setIp40004FileSeqNum(0);
   }

		public static int getIp40004FileIdFieldLength() {
			return IP_40004_FILE_ID_LENGTH;
		}

}
  
