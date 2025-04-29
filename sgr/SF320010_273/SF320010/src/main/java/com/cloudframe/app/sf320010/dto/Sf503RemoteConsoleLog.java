package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503RemoteConsoleLog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503RemoteConsoleLog extends Sf503RemoteConsoleLogSerialized { 
   

						private char[] sf503RcRecordType = Field.fillLowValue(1);

						private char[] sf503RcLocalMipId = Field.fillLowValue(3);

						private char[] sf503RcRemoteMipId = Field.fillLowValue(3);

						private char[] sf503RcOperatorId = Field.fillLowValue(7);
				private Sf503RcTime sf503RcTime = new Sf503RcTime();
				private Sf503RcDate sf503RcDate = new Sf503RcDate();

						private char[] sf503RcMessageArea = Field.fillLowValue(80);
	
	/**
	* Constructor for Sf503RemoteConsoleLog
	**/
    public Sf503RemoteConsoleLog() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503RemoteConsoleLog. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503RemoteConsoleLog(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			sf503RcTime.setParent(this,getStartOffset() + 15);
	       			sf503RcDate.setParent(this,getStartOffset() + 21);
    } 

	/**
	 *	Returns the value of sf503RcRecordType
	 *	@return sf503RcRecordType
	 */
   public char[] getSf503RcRecordType() throws CFException{
     if (isSf503RcRecordTypeModified()) { 
        sf503RcRecordType = refreshSf503RcRecordType();
     }
   		return sf503RcRecordType;
   }

  
	/**
	*  set variable sf503RcRecordType
	*  Corresponding COBOL Variable is SF503-RC-RECORD-TYPE
	*  @param value
	**/
   public void setSf503RcRecordType(char[] value) {
      sf503RcRecordType = checkSf503RcRecordTypeConstraints(value);
      serializeSf503RcRecordType(sf503RcRecordType);
   } 

     /**
	 * 	Update Sf503RcRecordType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503RcRecordType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503RcRecordType,sf503RcRecordType.length);
   	
   }
   
   public void setSf503RcRecordType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503RcRecordType,sf503RcRecordType.length);
   	
   }
   
     /**
	 * 	Update Sf503RcRecordType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503RcRecordType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503RcRecordType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503RcRecordType with another Field
	 *	@param value
	 */
   public void setSf503RcRecordType(Field source) {
       replace(source,0,source.length(),beginSf503RcRecordType,SF_503_RC_RECORD_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503RcRecordType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503RcRecordType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503RcRecordType,SF_503_RC_RECORD_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Sf503RcRecordType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503RcRecordType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503RcRecordType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503RcLocalMipId
	 *	@return sf503RcLocalMipId
	 */
   public char[] getSf503RcLocalMipId() throws CFException{
     if (isSf503RcLocalMipIdModified()) { 
        sf503RcLocalMipId = refreshSf503RcLocalMipId();
     }
   		return sf503RcLocalMipId;
   }

  
	/**
	*  set variable sf503RcLocalMipId
	*  Corresponding COBOL Variable is SF503-RC-LOCAL-MIP-ID
	*  @param value
	**/
   public void setSf503RcLocalMipId(char[] value) {
      sf503RcLocalMipId = checkSf503RcLocalMipIdConstraints(value);
      serializeSf503RcLocalMipId(sf503RcLocalMipId);
   } 

     /**
	 * 	Update Sf503RcLocalMipId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503RcLocalMipId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503RcLocalMipId,sf503RcLocalMipId.length);
   	
   }
   
   public void setSf503RcLocalMipId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503RcLocalMipId,sf503RcLocalMipId.length);
   	
   }
   
     /**
	 * 	Update Sf503RcLocalMipId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503RcLocalMipId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503RcLocalMipId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503RcLocalMipId with another Field
	 *	@param value
	 */
   public void setSf503RcLocalMipId(Field source) {
       replace(source,0,source.length(),beginSf503RcLocalMipId,SF_503_RC_LOCAL_MIP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503RcLocalMipId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503RcLocalMipId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503RcLocalMipId,SF_503_RC_LOCAL_MIP_ID_LEN);
   	
   }
   
     /**
	 * 	Update Sf503RcLocalMipId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503RcLocalMipId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503RcLocalMipId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503RcRemoteMipId
	 *	@return sf503RcRemoteMipId
	 */
   public char[] getSf503RcRemoteMipId() throws CFException{
     if (isSf503RcRemoteMipIdModified()) { 
        sf503RcRemoteMipId = refreshSf503RcRemoteMipId();
     }
   		return sf503RcRemoteMipId;
   }

  
	/**
	*  set variable sf503RcRemoteMipId
	*  Corresponding COBOL Variable is SF503-RC-REMOTE-MIP-ID
	*  @param value
	**/
   public void setSf503RcRemoteMipId(char[] value) {
      sf503RcRemoteMipId = checkSf503RcRemoteMipIdConstraints(value);
      serializeSf503RcRemoteMipId(sf503RcRemoteMipId);
   } 

     /**
	 * 	Update Sf503RcRemoteMipId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503RcRemoteMipId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503RcRemoteMipId,sf503RcRemoteMipId.length);
   	
   }
   
   public void setSf503RcRemoteMipId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503RcRemoteMipId,sf503RcRemoteMipId.length);
   	
   }
   
     /**
	 * 	Update Sf503RcRemoteMipId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503RcRemoteMipId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503RcRemoteMipId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503RcRemoteMipId with another Field
	 *	@param value
	 */
   public void setSf503RcRemoteMipId(Field source) {
       replace(source,0,source.length(),beginSf503RcRemoteMipId,SF_503_RC_REMOTE_MIP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503RcRemoteMipId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503RcRemoteMipId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503RcRemoteMipId,SF_503_RC_REMOTE_MIP_ID_LEN);
   	
   }
   
     /**
	 * 	Update Sf503RcRemoteMipId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503RcRemoteMipId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503RcRemoteMipId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503RcOperatorId
	 *	@return sf503RcOperatorId
	 */
   public char[] getSf503RcOperatorId() throws CFException{
     if (isSf503RcOperatorIdModified()) { 
        sf503RcOperatorId = refreshSf503RcOperatorId();
     }
   		return sf503RcOperatorId;
   }

  
	/**
	*  set variable sf503RcOperatorId
	*  Corresponding COBOL Variable is SF503-RC-OPERATOR-ID
	*  @param value
	**/
   public void setSf503RcOperatorId(char[] value) {
      sf503RcOperatorId = checkSf503RcOperatorIdConstraints(value);
      serializeSf503RcOperatorId(sf503RcOperatorId);
   } 

     /**
	 * 	Update Sf503RcOperatorId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503RcOperatorId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503RcOperatorId,sf503RcOperatorId.length);
   	
   }
   
   public void setSf503RcOperatorId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503RcOperatorId,sf503RcOperatorId.length);
   	
   }
   
     /**
	 * 	Update Sf503RcOperatorId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503RcOperatorId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503RcOperatorId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503RcOperatorId with another Field
	 *	@param value
	 */
   public void setSf503RcOperatorId(Field source) {
       replace(source,0,source.length(),beginSf503RcOperatorId,SF_503_RC_OPERATOR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503RcOperatorId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503RcOperatorId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503RcOperatorId,SF_503_RC_OPERATOR_ID_LEN);
   	
   }
   
     /**
	 * 	Update Sf503RcOperatorId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503RcOperatorId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503RcOperatorId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503RcTime
	 *	@return sf503RcTime
	 */   
	 public Sf503RcTime getSf503RcTime() {
   	return sf503RcTime;
   }
   /**
	* 	Update Sf503RcTime with the passed value
	*   Corresponding COBOL Variable is SF503-RC-TIME
	*	@param value
	*/
   public void setSf503RcTime(char[] value) {
      sf503RcTime.setString(value); 
   }   
    
     /**
	 * 	Update Sf503RcTime 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503RcTime(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503RcTime.begin,sf503RcTime.length());
   }
   
     /**
	 * 	Update Sf503RcTime 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503RcTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503RcTime.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503RcTime with another Field
	 *	@param value
	 */
   public void setSf503RcTime(Field source) {
   	replace(source,0,source.length(),sf503RcTime.begin,sf503RcTime.length());
   }  
   
     /**
	 * 	Update Sf503RcTime 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503RcTime(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503RcTime.begin,sf503RcTime.length());
   }
   
     /**
	 * 	Update Sf503RcTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503RcTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503RcTime.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503RcDate
	 *	@return sf503RcDate
	 */   
	 public Sf503RcDate getSf503RcDate() {
   	return sf503RcDate;
   }
   /**
	* 	Update Sf503RcDate with the passed value
	*   Corresponding COBOL Variable is SF503-RC-DATE
	*	@param value
	*/
   public void setSf503RcDate(char[] value) {
      sf503RcDate.setString(value); 
   }   
    
     /**
	 * 	Update Sf503RcDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503RcDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503RcDate.begin,sf503RcDate.length());
   }
   
     /**
	 * 	Update Sf503RcDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503RcDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503RcDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503RcDate with another Field
	 *	@param value
	 */
   public void setSf503RcDate(Field source) {
   	replace(source,0,source.length(),sf503RcDate.begin,sf503RcDate.length());
   }  
   
     /**
	 * 	Update Sf503RcDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503RcDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503RcDate.begin,sf503RcDate.length());
   }
   
     /**
	 * 	Update Sf503RcDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503RcDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503RcDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503RcMessageArea
	 *	@return sf503RcMessageArea
	 */
   public char[] getSf503RcMessageArea() throws CFException{
     if (isSf503RcMessageAreaModified()) { 
        sf503RcMessageArea = refreshSf503RcMessageArea();
     }
   		return sf503RcMessageArea;
   }

  
	/**
	*  set variable sf503RcMessageArea
	*  Corresponding COBOL Variable is SF503-RC-MESSAGE-AREA
	*  @param value
	**/
   public void setSf503RcMessageArea(char[] value) {
      sf503RcMessageArea = checkSf503RcMessageAreaConstraints(value);
      serializeSf503RcMessageArea(sf503RcMessageArea);
   } 

     /**
	 * 	Update Sf503RcMessageArea 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503RcMessageArea(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503RcMessageArea,sf503RcMessageArea.length);
   	
   }
   
   public void setSf503RcMessageArea(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503RcMessageArea,sf503RcMessageArea.length);
   	
   }
   
     /**
	 * 	Update Sf503RcMessageArea 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503RcMessageArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503RcMessageArea+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503RcMessageArea with another Field
	 *	@param value
	 */
   public void setSf503RcMessageArea(Field source) {
       replace(source,0,source.length(),beginSf503RcMessageArea,SF_503_RC_MESSAGE_AREA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503RcMessageArea 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503RcMessageArea(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503RcMessageArea,SF_503_RC_MESSAGE_AREA_LEN);
   	
   }
   
     /**
	 * 	Update Sf503RcMessageArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503RcMessageArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503RcMessageArea+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf503RemoteConsoleLogFieldLength() {
			return SF_503_REMOTE_CONSOLE_LOG_LENGTH;
		}

}
  
