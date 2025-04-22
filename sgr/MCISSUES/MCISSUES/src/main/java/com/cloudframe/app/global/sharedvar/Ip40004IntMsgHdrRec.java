package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004IntMsgHdrRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;


public class Ip40004IntMsgHdrRec extends Ip40004IntMsgHdrRecSerialized { 
   

						private char[] ip40004FileRecType = Field.fillLowValue(1);

								private int ip40004FileSeqNbr;
				private Ip40004FileId ip40004FileId = new Ip40004FileId();
				private Ip40004TransId ip40004TransId = new Ip40004TransId();

						private char[] ip40004FileStatus = Field.fillLowValue(1);

						private char[] ip40004RejectStatus = Field.fillLowValue(1);

								private long ip40004ActualCount;

								private long ip40004ActualAmount;

								private long ip40004TrailerCount;

								private long ip40004TrailerAmount;
			private List<Ip40004FileErrors> ip40004FileErrors = new ArrayList<>();
    	

						private char[] ip40004FileData = Field.fillLowValue(200);

						private char[] ip40004TrlrData = Field.fillLowValue(300);

								private long ip40004TrlrDataLen;

								private long ip40004SourceMsgNbr;

	
	/**
	* Constructor for Ip40004IntMsgHdrRec
	**/
    public Ip40004IntMsgHdrRec() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip40004IntMsgHdrRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004IntMsgHdrRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip40004FileId.setParent(this,getStartOffset() + 4);
	       			ip40004TransId.setParent(this,getStartOffset() + 29);
				for (int arrayIndex = 0; arrayIndex < IP_40004_FILE_ERRORS_SIZE;arrayIndex++) {
						ip40004FileErrors.add(new Ip40004FileErrors(this, beginIp40004FileErrors + 
						arrayIndex * Ip40004FileErrors.getIp40004FileErrorsFieldLength()));
				}
    } 

	/**
	 *	Returns the value of ip40004FileRecType
	 *	@return ip40004FileRecType
	 */
   public char[] getIp40004FileRecType() throws CFException{
     if (isIp40004FileRecTypeModified()) { 
        ip40004FileRecType = refreshIp40004FileRecType();
     }
   		return ip40004FileRecType;
   }

  
	/**
	*  set variable ip40004FileRecType
	*  Corresponding COBOL Variable is IP40004-FILE-REC-TYPE
	*  @param value
	**/
   public void setIp40004FileRecType(char[] value) {
      ip40004FileRecType = checkIp40004FileRecTypeConstraints(value);
      serializeIp40004FileRecType(ip40004FileRecType);
   } 

     /**
	 * 	Update Ip40004FileRecType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004FileRecType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004FileRecType,ip40004FileRecType.length);
   	
   }
   
   public void setIp40004FileRecType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FileRecType,ip40004FileRecType.length);
   	
   }
   
     /**
	 * 	Update Ip40004FileRecType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FileRecType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FileRecType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004FileRecType with another Field
	 *	@param value
	 */
   public void setIp40004FileRecType(Field source) {
       replace(source,0,source.length(),beginIp40004FileRecType,IP_40004_FILE_REC_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004FileRecType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004FileRecType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004FileRecType,IP_40004_FILE_REC_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004FileRecType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FileRecType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FileRecType+targetIndex,targetLen);
    
   }
	char[] ip40004FileStatus8888Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isIp40004FileStatus88()
	 *	@return  Returns true if isIp40004FileStatus88() is "F"
	 */
   public boolean isIp40004FileStatus88() throws CFException {
      return (  compareChars( getIp40004FileRecType() , ip40004FileStatus8888Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setIp40004FileStatus88True() {  			
    	setIp40004FileRecType( ip40004FileStatus8888Value);
   	}
	/**
	 *	Returns the value of ip40004FileSeqNbr
	 *	@return ip40004FileSeqNbr
	 */
	public int getIp40004FileSeqNbr() throws CFException {
       if (isIp40004FileSeqNbrModified()) { 
           ip40004FileSeqNbr = refreshIp40004FileSeqNbr();
        }
   		return ip40004FileSeqNbr;
	}
	

	
	   
	/**
	 * 	Update Ip40004FileSeqNbr with the passed value
	 *  Corresponding COBOL Variable is IP40004-FILE-SEQ-NBR
	 *	@param number
	 */
	public void setIp40004FileSeqNbr(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004FileSeqNbr = checkIp40004FileSeqNbrMaxLimit(number); 
		serializeIp40004FileSeqNbr(ip40004FileSeqNbr);
	}
	

	public void setIp40004FileSeqNbr(long number) {
	    number = checkIp40004FileSeqNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp40004FileSeqNbr((int)number);
	}
	
	/**
	 * 	Update Ip40004FileSeqNbr with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004FileSeqNbr(char[] value) throws CFException {
		 ip40004FileSeqNbr = serializeIp40004FileSeqNbr(value);
	}
	/**
	 * 	Update Ip40004FileSeqNbr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004FileSeqNbrString(char[] value) throws CFException {
		 setIp40004FileSeqNbr(value);
	}
	/**
	 *	Returns the value of ip40004FileId
	 *	@return ip40004FileId
	 */   
	 public Ip40004FileId getIp40004FileId() {
   	return ip40004FileId;
   }
   /**
	* 	Update Ip40004FileId with the passed value
	*   Corresponding COBOL Variable is IP40004-FILE-ID
	*	@param value
	*/
   public void setIp40004FileId(char[] value) {
      ip40004FileId.setString(value); 
   }   
    
     /**
	 * 	Update Ip40004FileId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp40004FileId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip40004FileId.begin,ip40004FileId.length());
   }
   
     /**
	 * 	Update Ip40004FileId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FileId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip40004FileId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip40004FileId with another Field
	 *	@param value
	 */
   public void setIp40004FileId(Field source) {
   	replace(source,0,source.length(),ip40004FileId.begin,ip40004FileId.length());
   }  
   
     /**
	 * 	Update Ip40004FileId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp40004FileId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip40004FileId.begin,ip40004FileId.length());
   }
   
     /**
	 * 	Update Ip40004FileId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FileId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip40004FileId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip40004TransId
	 *	@return ip40004TransId
	 */   
	 public Ip40004TransId getIp40004TransId() {
   	return ip40004TransId;
   }
   /**
	* 	Update Ip40004TransId with the passed value
	*   Corresponding COBOL Variable is IP40004-TRANS-ID
	*	@param value
	*/
   public void setIp40004TransId(char[] value) {
      ip40004TransId.setString(value); 
   }   
    
     /**
	 * 	Update Ip40004TransId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp40004TransId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip40004TransId.begin,ip40004TransId.length());
   }
   
     /**
	 * 	Update Ip40004TransId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004TransId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip40004TransId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip40004TransId with another Field
	 *	@param value
	 */
   public void setIp40004TransId(Field source) {
   	replace(source,0,source.length(),ip40004TransId.begin,ip40004TransId.length());
   }  
   
     /**
	 * 	Update Ip40004TransId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp40004TransId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip40004TransId.begin,ip40004TransId.length());
   }
   
     /**
	 * 	Update Ip40004TransId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004TransId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip40004TransId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip40004FileStatus
	 *	@return ip40004FileStatus
	 */
   public char[] getIp40004FileStatus() throws CFException{
     if (isIp40004FileStatusModified()) { 
        ip40004FileStatus = refreshIp40004FileStatus();
     }
   		return ip40004FileStatus;
   }

  
	/**
	*  set variable ip40004FileStatus
	*  Corresponding COBOL Variable is IP40004-FILE-STATUS
	*  @param value
	**/
   public void setIp40004FileStatus(char[] value) {
      ip40004FileStatus = checkIp40004FileStatusConstraints(value);
      serializeIp40004FileStatus(ip40004FileStatus);
   } 

     /**
	 * 	Update Ip40004FileStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004FileStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004FileStatus,ip40004FileStatus.length);
   	
   }
   
   public void setIp40004FileStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FileStatus,ip40004FileStatus.length);
   	
   }
   
     /**
	 * 	Update Ip40004FileStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FileStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FileStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004FileStatus with another Field
	 *	@param value
	 */
   public void setIp40004FileStatus(Field source) {
       replace(source,0,source.length(),beginIp40004FileStatus,IP_40004_FILE_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004FileStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004FileStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004FileStatus,IP_40004_FILE_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004FileStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FileStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FileStatus+targetIndex,targetLen);
    
   }
	char[] ip40004FileAccepted8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isIp40004FileAccepted88()
	 *	@return  Returns true if isIp40004FileAccepted88() is "A"
	 */
   public boolean isIp40004FileAccepted88() throws CFException {
      return (  compareChars( getIp40004FileStatus() , ip40004FileAccepted8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setIp40004FileAccepted88True() {  			
    	setIp40004FileStatus( ip40004FileAccepted8888Value);
   	}
	char[] ip40004FileAccWErrs8888Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isIp40004FileAccWErrs88()
	 *	@return  Returns true if isIp40004FileAccWErrs88() is "E"
	 */
   public boolean isIp40004FileAccWErrs88() throws CFException {
      return (  compareChars( getIp40004FileStatus() , ip40004FileAccWErrs8888Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setIp40004FileAccWErrs88True() {  			
    	setIp40004FileStatus( ip40004FileAccWErrs8888Value);
   	}
	char[] ip40004FileRejected8888Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isIp40004FileRejected88()
	 *	@return  Returns true if isIp40004FileRejected88() is "R"
	 */
   public boolean isIp40004FileRejected88() throws CFException {
      return (  compareChars( getIp40004FileStatus() , ip40004FileRejected8888Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setIp40004FileRejected88True() {  			
    	setIp40004FileStatus( ip40004FileRejected8888Value);
   	}
	char[] ip40004FileRejWErrs8888Value = "W".toCharArray();
	/**
	 *	Test condition "W" for isIp40004FileRejWErrs88()
	 *	@return  Returns true if isIp40004FileRejWErrs88() is "W"
	 */
   public boolean isIp40004FileRejWErrs88() throws CFException {
      return (  compareChars( getIp40004FileStatus() , ip40004FileRejWErrs8888Value)  == 0  );
   }


	/**
	*  set values "W"
	*/
   	public void setIp40004FileRejWErrs88True() {  			
    	setIp40004FileStatus( ip40004FileRejWErrs8888Value);
   	}
	char[] ip40004FileThreshErr8888Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isIp40004FileThreshErr88()
	 *	@return  Returns true if isIp40004FileThreshErr88() is "T"
	 */
   public boolean isIp40004FileThreshErr88() throws CFException {
      return (  compareChars( getIp40004FileStatus() , ip40004FileThreshErr8888Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setIp40004FileThreshErr88True() {  			
    	setIp40004FileStatus( ip40004FileThreshErr8888Value);
   	}
	/**
	 *	Returns the value of ip40004RejectStatus
	 *	@return ip40004RejectStatus
	 */
   public char[] getIp40004RejectStatus() throws CFException{
     if (isIp40004RejectStatusModified()) { 
        ip40004RejectStatus = refreshIp40004RejectStatus();
     }
   		return ip40004RejectStatus;
   }

  
	/**
	*  set variable ip40004RejectStatus
	*  Corresponding COBOL Variable is IP40004-REJECT-STATUS
	*  @param value
	**/
   public void setIp40004RejectStatus(char[] value) {
      ip40004RejectStatus = checkIp40004RejectStatusConstraints(value);
      serializeIp40004RejectStatus(ip40004RejectStatus);
   } 

     /**
	 * 	Update Ip40004RejectStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004RejectStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004RejectStatus,ip40004RejectStatus.length);
   	
   }
   
   public void setIp40004RejectStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004RejectStatus,ip40004RejectStatus.length);
   	
   }
   
     /**
	 * 	Update Ip40004RejectStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004RejectStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004RejectStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004RejectStatus with another Field
	 *	@param value
	 */
   public void setIp40004RejectStatus(Field source) {
       replace(source,0,source.length(),beginIp40004RejectStatus,IP_40004_REJECT_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004RejectStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004RejectStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004RejectStatus,IP_40004_REJECT_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004RejectStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004RejectStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004RejectStatus+targetIndex,targetLen);
    
   }
	char[] ip40004HeaderReject8888Value = "H".toCharArray();
	/**
	 *	Test condition "H" for isIp40004HeaderReject88()
	 *	@return  Returns true if isIp40004HeaderReject88() is "H"
	 */
   public boolean isIp40004HeaderReject88() throws CFException {
      return (  compareChars( getIp40004RejectStatus() , ip40004HeaderReject8888Value)  == 0  );
   }


	/**
	*  set values "H"
	*/
   	public void setIp40004HeaderReject88True() {  			
    	setIp40004RejectStatus( ip40004HeaderReject8888Value);
   	}
	char[] ip40004TrailrReject8888Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isIp40004TrailrReject88()
	 *	@return  Returns true if isIp40004TrailrReject88() is "T"
	 */
   public boolean isIp40004TrailrReject88() throws CFException {
      return (  compareChars( getIp40004RejectStatus() , ip40004TrailrReject8888Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setIp40004TrailrReject88True() {  			
    	setIp40004RejectStatus( ip40004TrailrReject8888Value);
   	}
	/**
	 *	Returns the value of ip40004ActualCount
	 *	@return ip40004ActualCount
	 */
	public long getIp40004ActualCount() throws CFException {
       if (isIp40004ActualCountModified()) { 
           ip40004ActualCount = refreshIp40004ActualCount();
        }
   		return ip40004ActualCount;
	}
	

	
	   
	/**
	 * 	Update Ip40004ActualCount with the passed value
	 *  Corresponding COBOL Variable is IP40004-ACTUAL-COUNT
	 *	@param number
	 */
	public void setIp40004ActualCount(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004ActualCount = checkIp40004ActualCountMaxLimit(number); 
		serializeIp40004ActualCount(ip40004ActualCount);
	}
	

	/**
	 * 	Update Ip40004ActualCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004ActualCount(char[] value) throws CFException {
		 ip40004ActualCount = serializeIp40004ActualCount(value);
	}
	/**
	 * 	Update Ip40004ActualCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004ActualCountString(char[] value) throws CFException {
		 setIp40004ActualCount(value);
	}
	/**
	 *	Returns the value of ip40004ActualAmount
	 *	@return ip40004ActualAmount
	 */
	public long getIp40004ActualAmount() throws CFException {
       if (isIp40004ActualAmountModified()) { 
           ip40004ActualAmount = refreshIp40004ActualAmount();
        }
   		return ip40004ActualAmount;
	}
	

	
	   
	/**
	 * 	Update Ip40004ActualAmount with the passed value
	 *  Corresponding COBOL Variable is IP40004-ACTUAL-AMOUNT
	 *	@param number
	 */
	public void setIp40004ActualAmount(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004ActualAmount = checkIp40004ActualAmountMaxLimit(number); 
		serializeIp40004ActualAmount(ip40004ActualAmount);
	}
	

	/**
	 * 	Update Ip40004ActualAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004ActualAmount(char[] value) throws CFException {
		 ip40004ActualAmount = serializeIp40004ActualAmount(value);
	}
	/**
	 * 	Update Ip40004ActualAmount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004ActualAmountString(char[] value) throws CFException {
		 setIp40004ActualAmount(value);
	}
	/**
	 *	Returns the value of ip40004TrailerCount
	 *	@return ip40004TrailerCount
	 */
	public long getIp40004TrailerCount() throws CFException {
       if (isIp40004TrailerCountModified()) { 
           ip40004TrailerCount = refreshIp40004TrailerCount();
        }
   		return ip40004TrailerCount;
	}
	

	
	   
	/**
	 * 	Update Ip40004TrailerCount with the passed value
	 *  Corresponding COBOL Variable is IP40004-TRAILER-COUNT
	 *	@param number
	 */
	public void setIp40004TrailerCount(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004TrailerCount = checkIp40004TrailerCountMaxLimit(number); 
		serializeIp40004TrailerCount(ip40004TrailerCount);
	}
	

	/**
	 * 	Update Ip40004TrailerCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004TrailerCount(char[] value) throws CFException {
		 ip40004TrailerCount = serializeIp40004TrailerCount(value);
	}
	/**
	 * 	Update Ip40004TrailerCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004TrailerCountString(char[] value) throws CFException {
		 setIp40004TrailerCount(value);
	}
	/**
	 *	Returns the value of ip40004TrailerAmount
	 *	@return ip40004TrailerAmount
	 */
	public long getIp40004TrailerAmount() throws CFException {
       if (isIp40004TrailerAmountModified()) { 
           ip40004TrailerAmount = refreshIp40004TrailerAmount();
        }
   		return ip40004TrailerAmount;
	}
	

	
	   
	/**
	 * 	Update Ip40004TrailerAmount with the passed value
	 *  Corresponding COBOL Variable is IP40004-TRAILER-AMOUNT
	 *	@param number
	 */
	public void setIp40004TrailerAmount(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004TrailerAmount = checkIp40004TrailerAmountMaxLimit(number); 
		serializeIp40004TrailerAmount(ip40004TrailerAmount);
	}
	

	/**
	 * 	Update Ip40004TrailerAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004TrailerAmount(char[] value) throws CFException {
		 ip40004TrailerAmount = serializeIp40004TrailerAmount(value);
	}
	/**
	 * 	Update Ip40004TrailerAmount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004TrailerAmountString(char[] value) throws CFException {
		 setIp40004TrailerAmount(value);
	}
	/**
	 *	Returns the  value of ip40004FileErrors
	 *  Corresponding COBOL Variable is IP40004-FILE-ERRORS
	 *	@return ip40004FileErrors
	 */
   public List<Ip40004FileErrors> getIp40004FileErrors() {
       return ip40004FileErrors;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip40004FileErrors
	 */
	public Ip40004FileErrors getIp40004FileErrors(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp40004FileErrors(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_40004_FILE_ERRORS_SIZE) {
             	index = IP_40004_FILE_ERRORS_SIZE -1; // can't exceed max array size
             	logger.trace("ip40004FileErrors - Array index exceeded max Size {}, resetting it to max allowed",IP_40004_FILE_ERRORS_SIZE); 
	    }
		if (index >= ip40004FileErrors.size()) {
       		for (int fillIndex =  ip40004FileErrors.size() -1; fillIndex < index;fillIndex++) {
		       ip40004FileErrors.add(null);
		    }
			ip40004FileErrors.set(index,
			   	   	new Ip40004FileErrors(this,beginIp40004FileErrors + index * Ip40004FileErrors.getIp40004FileErrorsFieldLength()) 
				                        ); 	
		} 
   	   Ip40004FileErrors value = ip40004FileErrors.get(index);
   	   if (value == null) {
   	      ip40004FileErrors.set(index,
			   	   	new Ip40004FileErrors(this,beginIp40004FileErrors + index * Ip40004FileErrors.getIp40004FileErrorsFieldLength()) 
				                        ); 
		  value = ip40004FileErrors.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip40004FileErrors at index with the passed value
	 *  Corresponding COBOL Variable is IP40004-FILE-ERRORS
	 *  @param index
	 *	@param value
	 */
  public void setIp40004FileErrors(int index,char[] value) {
   	getIp40004FileErrors(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of ip40004FileData
	 *	@return ip40004FileData
	 */
   public char[] getIp40004FileData() throws CFException{
     if (isIp40004FileDataModified()) { 
        ip40004FileData = refreshIp40004FileData();
     }
   		return ip40004FileData;
   }

  
	/**
	*  set variable ip40004FileData
	*  Corresponding COBOL Variable is IP40004-FILE-DATA
	*  @param value
	**/
   public void setIp40004FileData(char[] value) {
      ip40004FileData = checkIp40004FileDataConstraints(value);
      serializeIp40004FileData(ip40004FileData);
   } 

     /**
	 * 	Update Ip40004FileData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004FileData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004FileData,ip40004FileData.length);
   	
   }
   
   public void setIp40004FileData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FileData,ip40004FileData.length);
   	
   }
   
     /**
	 * 	Update Ip40004FileData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FileData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FileData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004FileData with another Field
	 *	@param value
	 */
   public void setIp40004FileData(Field source) {
       replace(source,0,source.length(),beginIp40004FileData,IP_40004_FILE_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004FileData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004FileData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004FileData,IP_40004_FILE_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004FileData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FileData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FileData+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip40004TrlrData
	 *	@return ip40004TrlrData
	 */
   public char[] getIp40004TrlrData() throws CFException{
     if (isIp40004TrlrDataModified()) { 
        ip40004TrlrData = refreshIp40004TrlrData();
     }
   		return ip40004TrlrData;
   }

  
	/**
	*  set variable ip40004TrlrData
	*  Corresponding COBOL Variable is IP40004-TRLR-DATA
	*  @param value
	**/
   public void setIp40004TrlrData(char[] value) {
      ip40004TrlrData = checkIp40004TrlrDataConstraints(value);
      serializeIp40004TrlrData(ip40004TrlrData);
   } 

     /**
	 * 	Update Ip40004TrlrData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004TrlrData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004TrlrData,ip40004TrlrData.length);
   	
   }
   
   public void setIp40004TrlrData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004TrlrData,ip40004TrlrData.length);
   	
   }
   
     /**
	 * 	Update Ip40004TrlrData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004TrlrData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004TrlrData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004TrlrData with another Field
	 *	@param value
	 */
   public void setIp40004TrlrData(Field source) {
       replace(source,0,source.length(),beginIp40004TrlrData,IP_40004_TRLR_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004TrlrData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004TrlrData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004TrlrData,IP_40004_TRLR_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004TrlrData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004TrlrData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004TrlrData+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip40004TrlrDataLen
	 *	@return ip40004TrlrDataLen
	 */
	public long getIp40004TrlrDataLen() throws CFException {
        if (isIp40004TrlrDataLenModified()) { 
           ip40004TrlrDataLen = refreshIp40004TrlrDataLen();
        }
   		return ip40004TrlrDataLen;
	}
	
	/**
	 * 	Update Ip40004TrlrDataLen with the passed value
	 *  Corresponding COBOL Variable is IP40004-TRLR-DATA-LEN
	 *	@param number
	 */
	public void setIp40004TrlrDataLen(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip40004TrlrDataLen = checkIp40004TrlrDataLenMaxLimit(number); 
		serializeIp40004TrlrDataLen(ip40004TrlrDataLen);
	}


	/**
	 *	Returns the value of ip40004SourceMsgNbr
	 *	@return ip40004SourceMsgNbr
	 */
	public long getIp40004SourceMsgNbr() throws CFException {
       if (isIp40004SourceMsgNbrModified()) { 
           ip40004SourceMsgNbr = refreshIp40004SourceMsgNbr();
        }
   		return ip40004SourceMsgNbr;
	}
	

	
	   
	/**
	 * 	Update Ip40004SourceMsgNbr with the passed value
	 *  Corresponding COBOL Variable is IP40004-SOURCE-MSG-NBR
	 *	@param number
	 */
	public void setIp40004SourceMsgNbr(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004SourceMsgNbr = checkIp40004SourceMsgNbrMaxLimit(number); 
		serializeIp40004SourceMsgNbr(ip40004SourceMsgNbr);
	}
	

	/**
	 * 	Update Ip40004SourceMsgNbr with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004SourceMsgNbr(char[] value) throws CFException {
		 ip40004SourceMsgNbr = serializeIp40004SourceMsgNbr(value);
	}
	/**
	 * 	Update Ip40004SourceMsgNbr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004SourceMsgNbrString(char[] value) throws CFException {
		 setIp40004SourceMsgNbr(value);
	}

	
	
	
	/**
	 * 	initializes Ip40004IntMsgHdrRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp40004FileRecType(CONSTANTS.SPACE);
                     setIp40004FileSeqNbr(0);
          ip40004FileId.initialize();
     
          ip40004TransId.initialize();
     
         setIp40004FileStatus(CONSTANTS.SPACE);
         setIp40004RejectStatus(CONSTANTS.SPACE);
                     setIp40004ActualCount(0);
                     setIp40004ActualAmount(0);
                     setIp40004TrailerCount(0);
                     setIp40004TrailerAmount(0);
     if (ip40004FileErrors.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_40004_FILE_ERRORS_SIZE;index++) {
              Ip40004FileErrors  newElement = new Ip40004FileErrors(this,beginIp40004FileErrors + index * Ip40004FileErrors.getIp40004FileErrorsFieldLength());
              newElement.initialize();
               ip40004FileErrors.add(newElement);
          }
     } else {
        if (ip40004FileErrors.size() < IP_40004_FILE_ERRORS_SIZE) {
          // prefill it first
          for (int index = ip40004FileErrors.size();index <  IP_40004_FILE_ERRORS_SIZE;index++) {
              Ip40004FileErrors  newElement = new Ip40004FileErrors(this,beginIp40004FileErrors + index * Ip40004FileErrors.getIp40004FileErrorsFieldLength());
               ip40004FileErrors.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_40004_FILE_ERRORS_SIZE;index++) {
     		Ip40004FileErrors ip40004FileErrorsVar = ip40004FileErrors.get(index);
 			if (ip40004FileErrorsVar == null) {
                ip40004FileErrorsVar = new Ip40004FileErrors(this,beginIp40004FileErrors + index * Ip40004FileErrors.getIp40004FileErrorsFieldLength());
                  ip40004FileErrors.set(index, ip40004FileErrorsVar);
			} 
			ip40004FileErrorsVar.initialize();
		}
     }
         setIp40004FileData(CONSTANTS.SPACE_200);
         setIp40004TrlrData(CONSTANTS.SPACE_300);
                     setIp40004TrlrDataLen(0);
                     setIp40004SourceMsgNbr(0);
   }

		public static int getIp40004IntMsgHdrRecFieldLength() {
			return IP_40004_INT_MSG_HDR_REC_LENGTH;
		}

}
  
