package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66102IpmFileInformation is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:52. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip66102IpmFileInformation")

public class Ip66102IpmFileInformation extends Ip66102IpmFileInformationSerialized  implements InitializingBean {
   

								private long ip66102IpmMsgLngth;

								private int ip66102IpmMsgsRead;

								private int ip66102IpmMsgsWritten;

						private char[] ip66102IpmFileStatus = Field.fillLowValue(2);

						private char[] ip66102IsIpmFileFinished = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip66102IpmFileInformation
	**/
    public Ip66102IpmFileInformation() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip66102IpmMsgLngth
	 *	@return ip66102IpmMsgLngth
	 */
	public long getIp66102IpmMsgLngth() throws CFException {
        if (isIp66102IpmMsgLngthModified()) { 
           ip66102IpmMsgLngth = refreshIp66102IpmMsgLngth();
        }
   		return ip66102IpmMsgLngth;
	}
	
	/**
	 * 	Update Ip66102IpmMsgLngth with the passed value
	 *  Corresponding COBOL Variable is IP66102-IPM-MSG-LNGTH
	 *	@param number
	 */
	public void setIp66102IpmMsgLngth(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66102IpmMsgLngth = checkIp66102IpmMsgLngthMaxLimit(number); 
		serializeIp66102IpmMsgLngth(ip66102IpmMsgLngth);
	}


	/**
	 *	Returns the value of ip66102IpmMsgsRead
	 *	@return ip66102IpmMsgsRead
	 */
	public int getIp66102IpmMsgsRead() throws CFException {
        if (isIp66102IpmMsgsReadModified()) { 
           ip66102IpmMsgsRead = refreshIp66102IpmMsgsRead();
        }
   		return ip66102IpmMsgsRead;
	}
	
	/**
	 * 	Update Ip66102IpmMsgsRead with the passed value
	 *  Corresponding COBOL Variable is IP66102-IPM-MSGS-READ
	 *	@param number
	 */
	public void setIp66102IpmMsgsRead(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66102IpmMsgsRead = checkIp66102IpmMsgsReadMaxLimit(number); 
		serializeIp66102IpmMsgsRead(ip66102IpmMsgsRead);
	}


	public void setIp66102IpmMsgsRead(long number) {
	    number = checkIp66102IpmMsgsReadMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp66102IpmMsgsRead((int)number);
	}
	
	/**
	 *	Returns the value of ip66102IpmMsgsWritten
	 *	@return ip66102IpmMsgsWritten
	 */
	public int getIp66102IpmMsgsWritten() throws CFException {
        if (isIp66102IpmMsgsWrittenModified()) { 
           ip66102IpmMsgsWritten = refreshIp66102IpmMsgsWritten();
        }
   		return ip66102IpmMsgsWritten;
	}
	
	/**
	 * 	Update Ip66102IpmMsgsWritten with the passed value
	 *  Corresponding COBOL Variable is IP66102-IPM-MSGS-WRITTEN
	 *	@param number
	 */
	public void setIp66102IpmMsgsWritten(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66102IpmMsgsWritten = checkIp66102IpmMsgsWrittenMaxLimit(number); 
		serializeIp66102IpmMsgsWritten(ip66102IpmMsgsWritten);
	}


	public void setIp66102IpmMsgsWritten(long number) {
	    number = checkIp66102IpmMsgsWrittenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp66102IpmMsgsWritten((int)number);
	}
	
	/**
	 *	Returns the value of ip66102IpmFileStatus
	 *	@return ip66102IpmFileStatus
	 */
   public char[] getIp66102IpmFileStatus() throws CFException{
     if (isIp66102IpmFileStatusModified()) { 
        ip66102IpmFileStatus = refreshIp66102IpmFileStatus();
     }
   		return ip66102IpmFileStatus;
   }

  
	/**
	*  set variable ip66102IpmFileStatus
	*  Corresponding COBOL Variable is IP66102-IPM-FILE-STATUS
	*  @param value
	**/
   public void setIp66102IpmFileStatus(char[] value) {
      ip66102IpmFileStatus = checkIp66102IpmFileStatusConstraints(value);
      serializeIp66102IpmFileStatus(ip66102IpmFileStatus);
   } 

     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102IpmFileStatus,ip66102IpmFileStatus.length);
   	
   }
   
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102IpmFileStatus,ip66102IpmFileStatus.length);
   	
   }
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102IpmFileStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102IpmFileStatus with another Field
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source) {
       replace(source,0,source.length(),beginIp66102IpmFileStatus,IP_66102_IPM_FILE_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102IpmFileStatus,IP_66102_IPM_FILE_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102IpmFileStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102IpmFileStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102IpmFileStatus+targetIndex,targetLen);
    
   }
	char[] ip66102IpmIoWasGood88Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isIp66102IpmIoWasGood()
	 *	@return  Returns true if isIp66102IpmIoWasGood() is "00"
	 */
   public boolean isIp66102IpmIoWasGood() throws CFException {
      return (  compareChars( getIp66102IpmFileStatus() , ip66102IpmIoWasGood88Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setIp66102IpmIoWasGoodTrue() {  			
    	setIp66102IpmFileStatus( ip66102IpmIoWasGood88Value);
   	}
	char[] ip66102WeHitEndOfFile88Value = "10".toCharArray();
	/**
	 *	Test condition "10" for isIp66102WeHitEndOfFile()
	 *	@return  Returns true if isIp66102WeHitEndOfFile() is "10"
	 */
   public boolean isIp66102WeHitEndOfFile() throws CFException {
      return (  compareChars( getIp66102IpmFileStatus() , ip66102WeHitEndOfFile88Value)  == 0  );
   }


	/**
	*  set values "10"
	*/
   	public void setIp66102WeHitEndOfFileTrue() {  			
    	setIp66102IpmFileStatus( ip66102WeHitEndOfFile88Value);
   	}
	char[] ip66102IpmFileIsAbsent88Value = "35".toCharArray();
	/**
	 *	Test condition "35" for isIp66102IpmFileIsAbsent()
	 *	@return  Returns true if isIp66102IpmFileIsAbsent() is "35"
	 */
   public boolean isIp66102IpmFileIsAbsent() throws CFException {
      return (  compareChars( getIp66102IpmFileStatus() , ip66102IpmFileIsAbsent88Value)  == 0  );
   }


	/**
	*  set values "35"
	*/
   	public void setIp66102IpmFileIsAbsentTrue() {  			
    	setIp66102IpmFileStatus( ip66102IpmFileIsAbsent88Value);
   	}
	char[] ip66102IpmFileAlreadyOpen88Value = "41".toCharArray();
	/**
	 *	Test condition "41" for isIp66102IpmFileAlreadyOpen()
	 *	@return  Returns true if isIp66102IpmFileAlreadyOpen() is "41"
	 */
   public boolean isIp66102IpmFileAlreadyOpen() throws CFException {
      return (  compareChars( getIp66102IpmFileStatus() , ip66102IpmFileAlreadyOpen88Value)  == 0  );
   }


	/**
	*  set values "41"
	*/
   	public void setIp66102IpmFileAlreadyOpenTrue() {  			
    	setIp66102IpmFileStatus( ip66102IpmFileAlreadyOpen88Value);
   	}
	char[] ip66102IpmFileIsClosed88Value1 = "42".toCharArray();
char[] ip66102IpmFileIsClosed88Value2 = "47".toCharArray();

	/**
	 *	Test condition "42" "47" for isIp66102IpmFileIsClosed()
	 *	@return  Returns true if isIp66102IpmFileIsClosed() is "42" "47"
	 */
   public boolean isIp66102IpmFileIsClosed() throws CFException {
      return (  compareChars( getIp66102IpmFileStatus() , ip66102IpmFileIsClosed88Value1)  == 0  ||  compareChars( getIp66102IpmFileStatus() , ip66102IpmFileIsClosed88Value2)  == 0  );
   }


	/**
	*  set values "42" "47"
	*/
   	public void setIp66102IpmFileIsClosedTrue() {  			
    	setIp66102IpmFileStatus( ip66102IpmFileIsClosed88Value1);
   	}
	char[] ip66102NoValidNextIpmRec88Value = "46".toCharArray();
	/**
	 *	Test condition "46" for isIp66102NoValidNextIpmRec()
	 *	@return  Returns true if isIp66102NoValidNextIpmRec() is "46"
	 */
   public boolean isIp66102NoValidNextIpmRec() throws CFException {
      return (  compareChars( getIp66102IpmFileStatus() , ip66102NoValidNextIpmRec88Value)  == 0  );
   }


	/**
	*  set values "46"
	*/
   	public void setIp66102NoValidNextIpmRecTrue() {  			
    	setIp66102IpmFileStatus( ip66102NoValidNextIpmRec88Value);
   	}
	char[] ip66102RecordAlreadyRead88Value = "RR".toCharArray();
	/**
	 *	Test condition "RR" for isIp66102RecordAlreadyRead()
	 *	@return  Returns true if isIp66102RecordAlreadyRead() is "RR"
	 */
   public boolean isIp66102RecordAlreadyRead() throws CFException {
      return (  compareChars( getIp66102IpmFileStatus() , ip66102RecordAlreadyRead88Value)  == 0  );
   }


	/**
	*  set values "RR"
	*/
   	public void setIp66102RecordAlreadyReadTrue() {  			
    	setIp66102IpmFileStatus( ip66102RecordAlreadyRead88Value);
   	}
	/**
	 *	Returns the value of ip66102IsIpmFileFinished
	 *	@return ip66102IsIpmFileFinished
	 */
   public char[] getIp66102IsIpmFileFinished() throws CFException{
     if (isIp66102IsIpmFileFinishedModified()) { 
        ip66102IsIpmFileFinished = refreshIp66102IsIpmFileFinished();
     }
   		return ip66102IsIpmFileFinished;
   }

  
	/**
	*  set variable ip66102IsIpmFileFinished
	*  Corresponding COBOL Variable is IP66102-IS-IPM-FILE-FINISHED
	*  @param value
	**/
   public void setIp66102IsIpmFileFinished(char[] value) {
      ip66102IsIpmFileFinished = checkIp66102IsIpmFileFinishedConstraints(value);
      serializeIp66102IsIpmFileFinished(ip66102IsIpmFileFinished);
   } 

     /**
	 * 	Update Ip66102IsIpmFileFinished 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102IsIpmFileFinished(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102IsIpmFileFinished,ip66102IsIpmFileFinished.length);
   	
   }
   
   public void setIp66102IsIpmFileFinished(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102IsIpmFileFinished,ip66102IsIpmFileFinished.length);
   	
   }
   
     /**
	 * 	Update Ip66102IsIpmFileFinished 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102IsIpmFileFinished(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102IsIpmFileFinished+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102IsIpmFileFinished with another Field
	 *	@param value
	 */
   public void setIp66102IsIpmFileFinished(Field source) {
       replace(source,0,source.length(),beginIp66102IsIpmFileFinished,IP_66102_IS_IPM_FILE_FINISHED_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102IsIpmFileFinished 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102IsIpmFileFinished(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102IsIpmFileFinished,IP_66102_IS_IPM_FILE_FINISHED_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102IsIpmFileFinished 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102IsIpmFileFinished(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102IsIpmFileFinished+targetIndex,targetLen);
    
   }
	char[] ip66102IpmFileIsFinished88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp66102IpmFileIsFinished()
	 *	@return  Returns true if isIp66102IpmFileIsFinished() is "Y"
	 */
   public boolean isIp66102IpmFileIsFinished() throws CFException {
      return (  compareChars( getIp66102IsIpmFileFinished() , ip66102IpmFileIsFinished88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp66102IpmFileIsFinishedTrue() {  			
    	setIp66102IsIpmFileFinished( ip66102IpmFileIsFinished88Value);
   	}
	char[] ip66102WeGotAMsg88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp66102WeGotAMsg()
	 *	@return  Returns true if isIp66102WeGotAMsg() is "N"
	 */
   public boolean isIp66102WeGotAMsg() throws CFException {
      return (  compareChars( getIp66102IsIpmFileFinished() , ip66102WeGotAMsg88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp66102WeGotAMsgTrue() {  			
    	setIp66102IsIpmFileFinished( ip66102WeGotAMsg88Value);
   	}

	
	
	
	/**
	 * 	initializes Ip66102IpmFileInformation
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp66102IpmMsgLngth(0);
                     setIp66102IpmMsgsRead(0);
                     setIp66102IpmMsgsWritten(0);
         setIp66102IpmFileStatus(CONSTANTS.SPACE_2);
         setIp66102IsIpmFileFinished(CONSTANTS.SPACE);
   }

		public static int getIp66102IpmFileInformationFieldLength() {
			return IP_66102_IPM_FILE_INFORMATION_LENGTH;
		}

}
  
