package com.cloudframe.app.sf320010.dto;

/**
*  The class RpOpDetail is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpOpDetail extends RpOpDetailSerialized {
   

						private char[] rpOpCc = new char[1];


						private char[] rpOpRecordType = new char[1];


						private char[] rpOpMipId = new char[3];


						private char[] rpOpLogDate = new char[6];


						private char[] rpOpLogTime = new char[6];


						private char[] rpOpHeader = new char[8];

						private char[] rpOpDelimiter = new char[1];

						private char[] rpOpOperatorMessage = new char[85];
	
	/**
	* Constructor for RpOpDetail
	**/
    public RpOpDetail() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRpOpCc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 1
             ,4
             );
								setRpOpRecordType(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 6
             ,7
             );
								setRpOpMipId(fillSpace(3));
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 16
             ,4
             );
								setRpOpLogDate(fillSpace(6));
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 26
             ,4
             );
								setRpOpLogTime(fillSpace(6));
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 36
             ,3
             );
								setRpOpHeader(fillSpace(8));
								setRpOpDelimiter(fillSpace(1));
								setRpOpOperatorMessage(pad(85," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of rpOpCc
	 *	@return rpOpCc
	 */
   public char[] getRpOpCc() throws CFException{
     if (isRpOpCcModified()) { 
        rpOpCc = refreshRpOpCc();
     }
   		return rpOpCc;
   }

  
	/**
	*  set variable rpOpCc
	*  Corresponding COBOL Variable is RP-OP-CC
	*  @param value
	**/
   public void setRpOpCc(char[] value) {
      rpOpCc = checkRpOpCcConstraints(value);
      serializeRpOpCc(rpOpCc);
   } 

     /**
	 * 	Update RpOpCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpOpCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpOpCc,rpOpCc.length);
   	
   }
   
   public void setRpOpCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpCc,rpOpCc.length);
   	
   }
   
     /**
	 * 	Update RpOpCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpOpCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpOpCc with another Field
	 *	@param value
	 */
   public void setRpOpCc(Field source) {
       replace(source,0,source.length(),beginRpOpCc,RP_OP_CC_LEN);
   	
   }  
   
     /**
	 * 	Update RpOpCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpOpCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpOpCc,RP_OP_CC_LEN);
   	
   }
   
     /**
	 * 	Update RpOpCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpOpCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpOpRecordType
	 *	@return rpOpRecordType
	 */
   public char[] getRpOpRecordType() throws CFException{
     if (isRpOpRecordTypeModified()) { 
        rpOpRecordType = refreshRpOpRecordType();
     }
   		return rpOpRecordType;
   }

  
	/**
	*  set variable rpOpRecordType
	*  Corresponding COBOL Variable is RP-OP-RECORD-TYPE
	*  @param value
	**/
   public void setRpOpRecordType(char[] value) {
      rpOpRecordType = checkRpOpRecordTypeConstraints(value);
      serializeRpOpRecordType(rpOpRecordType);
   } 

     /**
	 * 	Update RpOpRecordType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpOpRecordType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpOpRecordType,rpOpRecordType.length);
   	
   }
   
   public void setRpOpRecordType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpRecordType,rpOpRecordType.length);
   	
   }
   
     /**
	 * 	Update RpOpRecordType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpOpRecordType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpRecordType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpOpRecordType with another Field
	 *	@param value
	 */
   public void setRpOpRecordType(Field source) {
       replace(source,0,source.length(),beginRpOpRecordType,RP_OP_RECORD_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update RpOpRecordType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpOpRecordType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpOpRecordType,RP_OP_RECORD_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update RpOpRecordType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpOpRecordType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpRecordType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpOpMipId
	 *	@return rpOpMipId
	 */
   public char[] getRpOpMipId() throws CFException{
     if (isRpOpMipIdModified()) { 
        rpOpMipId = refreshRpOpMipId();
     }
   		return rpOpMipId;
   }

  
	/**
	*  set variable rpOpMipId
	*  Corresponding COBOL Variable is RP-OP-MIP-ID
	*  @param value
	**/
   public void setRpOpMipId(char[] value) {
      rpOpMipId = checkRpOpMipIdConstraints(value);
      serializeRpOpMipId(rpOpMipId);
   } 

     /**
	 * 	Update RpOpMipId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpOpMipId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpOpMipId,rpOpMipId.length);
   	
   }
   
   public void setRpOpMipId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpMipId,rpOpMipId.length);
   	
   }
   
     /**
	 * 	Update RpOpMipId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpOpMipId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpMipId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpOpMipId with another Field
	 *	@param value
	 */
   public void setRpOpMipId(Field source) {
       replace(source,0,source.length(),beginRpOpMipId,RP_OP_MIP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update RpOpMipId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpOpMipId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpOpMipId,RP_OP_MIP_ID_LEN);
   	
   }
   
     /**
	 * 	Update RpOpMipId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpOpMipId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpMipId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpOpLogDate
	 *	@return rpOpLogDate
	 */
   public char[] getRpOpLogDate() throws CFException{
     if (isRpOpLogDateModified()) { 
        rpOpLogDate = refreshRpOpLogDate();
     }
   		return rpOpLogDate;
   }

  
	/**
	*  set variable rpOpLogDate
	*  Corresponding COBOL Variable is RP-OP-LOG-DATE
	*  @param value
	**/
   public void setRpOpLogDate(char[] value) {
      rpOpLogDate = checkRpOpLogDateConstraints(value);
      serializeRpOpLogDate(rpOpLogDate);
   } 

     /**
	 * 	Update RpOpLogDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpOpLogDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpOpLogDate,rpOpLogDate.length);
   	
   }
   
   public void setRpOpLogDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpLogDate,rpOpLogDate.length);
   	
   }
   
     /**
	 * 	Update RpOpLogDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpOpLogDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpLogDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpOpLogDate with another Field
	 *	@param value
	 */
   public void setRpOpLogDate(Field source) {
       replace(source,0,source.length(),beginRpOpLogDate,RP_OP_LOG_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update RpOpLogDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpOpLogDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpOpLogDate,RP_OP_LOG_DATE_LEN);
   	
   }
   
     /**
	 * 	Update RpOpLogDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpOpLogDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpLogDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpOpLogTime
	 *	@return rpOpLogTime
	 */
   public char[] getRpOpLogTime() throws CFException{
     if (isRpOpLogTimeModified()) { 
        rpOpLogTime = refreshRpOpLogTime();
     }
   		return rpOpLogTime;
   }

  
	/**
	*  set variable rpOpLogTime
	*  Corresponding COBOL Variable is RP-OP-LOG-TIME
	*  @param value
	**/
   public void setRpOpLogTime(char[] value) {
      rpOpLogTime = checkRpOpLogTimeConstraints(value);
      serializeRpOpLogTime(rpOpLogTime);
   } 

     /**
	 * 	Update RpOpLogTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpOpLogTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpOpLogTime,rpOpLogTime.length);
   	
   }
   
   public void setRpOpLogTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpLogTime,rpOpLogTime.length);
   	
   }
   
     /**
	 * 	Update RpOpLogTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpOpLogTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpLogTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpOpLogTime with another Field
	 *	@param value
	 */
   public void setRpOpLogTime(Field source) {
       replace(source,0,source.length(),beginRpOpLogTime,RP_OP_LOG_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update RpOpLogTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpOpLogTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpOpLogTime,RP_OP_LOG_TIME_LEN);
   	
   }
   
     /**
	 * 	Update RpOpLogTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpOpLogTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpLogTime+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpOpHeader
	 *	@return rpOpHeader
	 */
   public char[] getRpOpHeader() throws CFException{
     if (isRpOpHeaderModified()) { 
        rpOpHeader = refreshRpOpHeader();
     }
   		return rpOpHeader;
   }

  
	/**
	*  set variable rpOpHeader
	*  Corresponding COBOL Variable is RP-OP-HEADER
	*  @param value
	**/
   public void setRpOpHeader(char[] value) {
      rpOpHeader = checkRpOpHeaderConstraints(value);
      serializeRpOpHeader(rpOpHeader);
   } 

     /**
	 * 	Update RpOpHeader 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpOpHeader(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpOpHeader,rpOpHeader.length);
   	
   }
   
   public void setRpOpHeader(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpHeader,rpOpHeader.length);
   	
   }
   
     /**
	 * 	Update RpOpHeader 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpOpHeader(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpHeader+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpOpHeader with another Field
	 *	@param value
	 */
   public void setRpOpHeader(Field source) {
       replace(source,0,source.length(),beginRpOpHeader,RP_OP_HEADER_LEN);
   	
   }  
   
     /**
	 * 	Update RpOpHeader 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpOpHeader(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpOpHeader,RP_OP_HEADER_LEN);
   	
   }
   
     /**
	 * 	Update RpOpHeader 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpOpHeader(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpHeader+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpOpDelimiter
	 *	@return rpOpDelimiter
	 */
   public char[] getRpOpDelimiter() throws CFException{
     if (isRpOpDelimiterModified()) { 
        rpOpDelimiter = refreshRpOpDelimiter();
     }
   		return rpOpDelimiter;
   }

  
	/**
	*  set variable rpOpDelimiter
	*  Corresponding COBOL Variable is RP-OP-DELIMITER
	*  @param value
	**/
   public void setRpOpDelimiter(char[] value) {
      rpOpDelimiter = checkRpOpDelimiterConstraints(value);
      serializeRpOpDelimiter(rpOpDelimiter);
   } 

     /**
	 * 	Update RpOpDelimiter 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpOpDelimiter(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpOpDelimiter,rpOpDelimiter.length);
   	
   }
   
   public void setRpOpDelimiter(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpDelimiter,rpOpDelimiter.length);
   	
   }
   
     /**
	 * 	Update RpOpDelimiter 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpOpDelimiter(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpDelimiter+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpOpDelimiter with another Field
	 *	@param value
	 */
   public void setRpOpDelimiter(Field source) {
       replace(source,0,source.length(),beginRpOpDelimiter,RP_OP_DELIMITER_LEN);
   	
   }  
   
     /**
	 * 	Update RpOpDelimiter 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpOpDelimiter(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpOpDelimiter,RP_OP_DELIMITER_LEN);
   	
   }
   
     /**
	 * 	Update RpOpDelimiter 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpOpDelimiter(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpDelimiter+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpOpOperatorMessage
	 *	@return rpOpOperatorMessage
	 */
   public char[] getRpOpOperatorMessage() throws CFException{
     if (isRpOpOperatorMessageModified()) { 
        rpOpOperatorMessage = refreshRpOpOperatorMessage();
     }
   		return rpOpOperatorMessage;
   }

  
	/**
	*  set variable rpOpOperatorMessage
	*  Corresponding COBOL Variable is RP-OP-OPERATOR-MESSAGE
	*  @param value
	**/
   public void setRpOpOperatorMessage(char[] value) {
      rpOpOperatorMessage = checkRpOpOperatorMessageConstraints(value);
      serializeRpOpOperatorMessage(rpOpOperatorMessage);
   } 

     /**
	 * 	Update RpOpOperatorMessage 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpOpOperatorMessage(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpOpOperatorMessage,rpOpOperatorMessage.length);
   	
   }
   
   public void setRpOpOperatorMessage(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpOperatorMessage,rpOpOperatorMessage.length);
   	
   }
   
     /**
	 * 	Update RpOpOperatorMessage 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpOpOperatorMessage(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpOperatorMessage+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpOpOperatorMessage with another Field
	 *	@param value
	 */
   public void setRpOpOperatorMessage(Field source) {
       replace(source,0,source.length(),beginRpOpOperatorMessage,RP_OP_OPERATOR_MESSAGE_LEN);
   	
   }  
   
     /**
	 * 	Update RpOpOperatorMessage 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpOpOperatorMessage(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpOpOperatorMessage,RP_OP_OPERATOR_MESSAGE_LEN);
   	
   }
   
     /**
	 * 	Update RpOpOperatorMessage 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpOpOperatorMessage(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpOpOperatorMessage+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpOpDetailFieldLength() {
			return RP_OP_DETAIL_LENGTH;
		}

}
  
