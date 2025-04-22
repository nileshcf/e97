package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip43501SortSolution is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class Ip43501SortSolution extends Ip43501SortSolutionSerialized { 
   

						private char[] ip43501EiRecType = Field.fillLowValue(2);

						private char[] ip43501EiTransmissionId = Field.fillLowValue(25);

						private char[] ip43501EiFileId = Field.fillLowValue(25);

								private int ip43501EiFileSeqNbr;

								private long ip43501EiInstitutionId;

								private long ip43501EiBin;

						private char[] ip43501EiCardAcceptor = Field.fillLowValue(15);

								private long ip43501EiSourceMsgNum;

						private char[] ip43501EiErrorType = Field.fillLowValue(1);

						private char[] ip43501EiErrorCode = Field.fillLowValue(4);

						private char[] ip43501EiErrorMsgNbr = Field.fillLowValue(4);
      private List<char[]> ip43501EiReplText; 

				private Ip43501EiErrorInfo ip43501EiErrorInfo = new Ip43501EiErrorInfo();

						private char[] ip43501EiFieldErrorInd = Field.fillLowValue(1);

						private char[] ip43501EiAmtCntAccumInd = Field.fillLowValue(1);


								private int ip43501EiDataLength;
	
	/**
	* Constructor for Ip43501SortSolution
	**/
    public Ip43501SortSolution() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip43501SortSolution. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip43501SortSolution(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip43501EiErrorInfo.setParent(this,getStartOffset() + 256);
    } 

	/**
	 *	Returns the value of ip43501EiRecType
	 *	@return ip43501EiRecType
	 */
   public char[] getIp43501EiRecType() throws CFException{
     if (isIp43501EiRecTypeModified()) { 
        ip43501EiRecType = refreshIp43501EiRecType();
     }
   		return ip43501EiRecType;
   }

  
	/**
	*  set variable ip43501EiRecType
	*  Corresponding COBOL Variable is IP43501-EI-REC-TYPE
	*  @param value
	**/
   public void setIp43501EiRecType(char[] value) {
      ip43501EiRecType = checkIp43501EiRecTypeConstraints(value);
      serializeIp43501EiRecType(ip43501EiRecType);
   } 

     /**
	 * 	Update Ip43501EiRecType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiRecType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501EiRecType,ip43501EiRecType.length);
   	
   }
   
   public void setIp43501EiRecType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiRecType,ip43501EiRecType.length);
   	
   }
   
     /**
	 * 	Update Ip43501EiRecType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiRecType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiRecType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501EiRecType with another Field
	 *	@param value
	 */
   public void setIp43501EiRecType(Field source) {
       replace(source,0,source.length(),beginIp43501EiRecType,IP_43501_EI_REC_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501EiRecType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501EiRecType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501EiRecType,IP_43501_EI_REC_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501EiRecType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiRecType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiRecType+targetIndex,targetLen);
    
   }
	char[] ip43501EiRegularProc8888Value = "E1".toCharArray();
	/**
	 *	Test condition "E1" for isIp43501EiRegularProc88()
	 *	@return  Returns true if isIp43501EiRegularProc88() is "E1"
	 */
   public boolean isIp43501EiRegularProc88() throws CFException {
      return (  compareChars( getIp43501EiRecType() , ip43501EiRegularProc8888Value)  == 0  );
   }


	/**
	*  set values "E1"
	*/
   	public void setIp43501EiRegularProc88True() {  			
    	setIp43501EiRecType( ip43501EiRegularProc8888Value);
   	}
	char[] ip43501EiCollOnlyProc8888Value = "E2".toCharArray();
	/**
	 *	Test condition "E2" for isIp43501EiCollOnlyProc88()
	 *	@return  Returns true if isIp43501EiCollOnlyProc88() is "E2"
	 */
   public boolean isIp43501EiCollOnlyProc88() throws CFException {
      return (  compareChars( getIp43501EiRecType() , ip43501EiCollOnlyProc8888Value)  == 0  );
   }


	/**
	*  set values "E2"
	*/
   	public void setIp43501EiCollOnlyProc88True() {  			
    	setIp43501EiRecType( ip43501EiCollOnlyProc8888Value);
   	}
	/**
	 *	Returns the value of ip43501EiTransmissionId
	 *	@return ip43501EiTransmissionId
	 */
   public char[] getIp43501EiTransmissionId() throws CFException{
     if (isIp43501EiTransmissionIdModified()) { 
        ip43501EiTransmissionId = refreshIp43501EiTransmissionId();
     }
   		return ip43501EiTransmissionId;
   }

  
	/**
	*  set variable ip43501EiTransmissionId
	*  Corresponding COBOL Variable is IP43501-EI-TRANSMISSION-ID
	*  @param value
	**/
   public void setIp43501EiTransmissionId(char[] value) {
      ip43501EiTransmissionId = checkIp43501EiTransmissionIdConstraints(value);
      serializeIp43501EiTransmissionId(ip43501EiTransmissionId);
   } 

     /**
	 * 	Update Ip43501EiTransmissionId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiTransmissionId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501EiTransmissionId,ip43501EiTransmissionId.length);
   	
   }
   
   public void setIp43501EiTransmissionId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiTransmissionId,ip43501EiTransmissionId.length);
   	
   }
   
     /**
	 * 	Update Ip43501EiTransmissionId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiTransmissionId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiTransmissionId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501EiTransmissionId with another Field
	 *	@param value
	 */
   public void setIp43501EiTransmissionId(Field source) {
       replace(source,0,source.length(),beginIp43501EiTransmissionId,IP_43501_EI_TRANSMISSION_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501EiTransmissionId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501EiTransmissionId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501EiTransmissionId,IP_43501_EI_TRANSMISSION_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501EiTransmissionId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiTransmissionId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiTransmissionId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip43501EiFileId
	 *	@return ip43501EiFileId
	 */
   public char[] getIp43501EiFileId() throws CFException{
     if (isIp43501EiFileIdModified()) { 
        ip43501EiFileId = refreshIp43501EiFileId();
     }
   		return ip43501EiFileId;
   }

  
	/**
	*  set variable ip43501EiFileId
	*  Corresponding COBOL Variable is IP43501-EI-FILE-ID
	*  @param value
	**/
   public void setIp43501EiFileId(char[] value) {
      ip43501EiFileId = checkIp43501EiFileIdConstraints(value);
      serializeIp43501EiFileId(ip43501EiFileId);
   } 

     /**
	 * 	Update Ip43501EiFileId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiFileId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501EiFileId,ip43501EiFileId.length);
   	
   }
   
   public void setIp43501EiFileId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiFileId,ip43501EiFileId.length);
   	
   }
   
     /**
	 * 	Update Ip43501EiFileId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiFileId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiFileId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501EiFileId with another Field
	 *	@param value
	 */
   public void setIp43501EiFileId(Field source) {
       replace(source,0,source.length(),beginIp43501EiFileId,IP_43501_EI_FILE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501EiFileId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501EiFileId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501EiFileId,IP_43501_EI_FILE_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501EiFileId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiFileId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiFileId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip43501EiFileSeqNbr
	 *	@return ip43501EiFileSeqNbr
	 */
	public int getIp43501EiFileSeqNbr() throws CFException {
       if (isIp43501EiFileSeqNbrModified()) { 
           ip43501EiFileSeqNbr = refreshIp43501EiFileSeqNbr();
        }
   		return ip43501EiFileSeqNbr;
	}
	

	
	   
	/**
	 * 	Update Ip43501EiFileSeqNbr with the passed value
	 *  Corresponding COBOL Variable is IP43501-EI-FILE-SEQ-NBR
	 *	@param number
	 */
	public void setIp43501EiFileSeqNbr(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip43501EiFileSeqNbr = checkIp43501EiFileSeqNbrMaxLimit(number); 
		serializeIp43501EiFileSeqNbr(ip43501EiFileSeqNbr);
	}
	

	public void setIp43501EiFileSeqNbr(long number) {
	    number = checkIp43501EiFileSeqNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp43501EiFileSeqNbr((int)number);
	}
	
	/**
	 * 	Update Ip43501EiFileSeqNbr with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp43501EiFileSeqNbr(char[] value) throws CFException {
		 ip43501EiFileSeqNbr = serializeIp43501EiFileSeqNbr(value);
	}
	/**
	 * 	Update Ip43501EiFileSeqNbr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp43501EiFileSeqNbrString(char[] value) throws CFException {
		 setIp43501EiFileSeqNbr(value);
	}
	/**
	 *	Returns the value of ip43501EiInstitutionId
	 *	@return ip43501EiInstitutionId
	 */
	public long getIp43501EiInstitutionId() throws CFException {
       if (isIp43501EiInstitutionIdModified()) { 
           ip43501EiInstitutionId = refreshIp43501EiInstitutionId();
        }
   		return ip43501EiInstitutionId;
	}
	

	
	   
	/**
	 * 	Update Ip43501EiInstitutionId with the passed value
	 *  Corresponding COBOL Variable is IP43501-EI-INSTITUTION-ID
	 *	@param number
	 */
	public void setIp43501EiInstitutionId(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip43501EiInstitutionId = checkIp43501EiInstitutionIdMaxLimit(number); 
		serializeIp43501EiInstitutionId(ip43501EiInstitutionId);
	}
	

	/**
	 * 	Update Ip43501EiInstitutionId with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp43501EiInstitutionId(char[] value) throws CFException {
		 ip43501EiInstitutionId = serializeIp43501EiInstitutionId(value);
	}
	/**
	 * 	Update Ip43501EiInstitutionId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp43501EiInstitutionIdString(char[] value) throws CFException {
		 setIp43501EiInstitutionId(value);
	}
	/**
	 *	Returns the value of ip43501EiBin
	 *	@return ip43501EiBin
	 */
	public long getIp43501EiBin() throws CFException {
       if (isIp43501EiBinModified()) { 
           ip43501EiBin = refreshIp43501EiBin();
        }
   		return ip43501EiBin;
	}
	

	
	   
	/**
	 * 	Update Ip43501EiBin with the passed value
	 *  Corresponding COBOL Variable is IP43501-EI-BIN
	 *	@param number
	 */
	public void setIp43501EiBin(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip43501EiBin = checkIp43501EiBinMaxLimit(number); 
		serializeIp43501EiBin(ip43501EiBin);
	}
	

	/**
	 * 	Update Ip43501EiBin with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp43501EiBin(char[] value) throws CFException {
		 ip43501EiBin = serializeIp43501EiBin(value);
	}
	/**
	 * 	Update Ip43501EiBin with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp43501EiBinString(char[] value) throws CFException {
		 setIp43501EiBin(value);
	}
	/**
	 *	Returns the value of ip43501EiCardAcceptor
	 *	@return ip43501EiCardAcceptor
	 */
   public char[] getIp43501EiCardAcceptor() throws CFException{
     if (isIp43501EiCardAcceptorModified()) { 
        ip43501EiCardAcceptor = refreshIp43501EiCardAcceptor();
     }
   		return ip43501EiCardAcceptor;
   }

  
	/**
	*  set variable ip43501EiCardAcceptor
	*  Corresponding COBOL Variable is IP43501-EI-CARD-ACCEPTOR
	*  @param value
	**/
   public void setIp43501EiCardAcceptor(char[] value) {
      ip43501EiCardAcceptor = checkIp43501EiCardAcceptorConstraints(value);
      serializeIp43501EiCardAcceptor(ip43501EiCardAcceptor);
   } 

     /**
	 * 	Update Ip43501EiCardAcceptor 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiCardAcceptor(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501EiCardAcceptor,ip43501EiCardAcceptor.length);
   	
   }
   
   public void setIp43501EiCardAcceptor(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiCardAcceptor,ip43501EiCardAcceptor.length);
   	
   }
   
     /**
	 * 	Update Ip43501EiCardAcceptor 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiCardAcceptor(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiCardAcceptor+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501EiCardAcceptor with another Field
	 *	@param value
	 */
   public void setIp43501EiCardAcceptor(Field source) {
       replace(source,0,source.length(),beginIp43501EiCardAcceptor,IP_43501_EI_CARD_ACCEPTOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501EiCardAcceptor 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501EiCardAcceptor(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501EiCardAcceptor,IP_43501_EI_CARD_ACCEPTOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501EiCardAcceptor 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiCardAcceptor(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiCardAcceptor+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip43501EiSourceMsgNum
	 *	@return ip43501EiSourceMsgNum
	 */
	public long getIp43501EiSourceMsgNum() throws CFException {
       if (isIp43501EiSourceMsgNumModified()) { 
           ip43501EiSourceMsgNum = refreshIp43501EiSourceMsgNum();
        }
   		return ip43501EiSourceMsgNum;
	}
	

	
	   
	/**
	 * 	Update Ip43501EiSourceMsgNum with the passed value
	 *  Corresponding COBOL Variable is IP43501-EI-SOURCE-MSG-NUM
	 *	@param number
	 */
	public void setIp43501EiSourceMsgNum(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip43501EiSourceMsgNum = checkIp43501EiSourceMsgNumMaxLimit(number); 
		serializeIp43501EiSourceMsgNum(ip43501EiSourceMsgNum);
	}
	

	/**
	 * 	Update Ip43501EiSourceMsgNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp43501EiSourceMsgNum(char[] value) throws CFException {
		 ip43501EiSourceMsgNum = serializeIp43501EiSourceMsgNum(value);
	}
	/**
	 * 	Update Ip43501EiSourceMsgNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp43501EiSourceMsgNumString(char[] value) throws CFException {
		 setIp43501EiSourceMsgNum(value);
	}
	/**
	 *	Returns the value of ip43501EiErrorType
	 *	@return ip43501EiErrorType
	 */
   public char[] getIp43501EiErrorType() throws CFException{
     if (isIp43501EiErrorTypeModified()) { 
        ip43501EiErrorType = refreshIp43501EiErrorType();
     }
   		return ip43501EiErrorType;
   }

  
	/**
	*  set variable ip43501EiErrorType
	*  Corresponding COBOL Variable is IP43501-EI-ERROR-TYPE
	*  @param value
	**/
   public void setIp43501EiErrorType(char[] value) {
      ip43501EiErrorType = checkIp43501EiErrorTypeConstraints(value);
      serializeIp43501EiErrorType(ip43501EiErrorType);
   } 

     /**
	 * 	Update Ip43501EiErrorType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiErrorType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501EiErrorType,ip43501EiErrorType.length);
   	
   }
   
   public void setIp43501EiErrorType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiErrorType,ip43501EiErrorType.length);
   	
   }
   
     /**
	 * 	Update Ip43501EiErrorType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiErrorType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiErrorType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501EiErrorType with another Field
	 *	@param value
	 */
   public void setIp43501EiErrorType(Field source) {
       replace(source,0,source.length(),beginIp43501EiErrorType,IP_43501_EI_ERROR_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501EiErrorType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501EiErrorType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501EiErrorType,IP_43501_EI_ERROR_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501EiErrorType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiErrorType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiErrorType+targetIndex,targetLen);
    
   }
	char[] ip43501FileError8888Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isIp43501FileError88()
	 *	@return  Returns true if isIp43501FileError88() is "F"
	 */
   public boolean isIp43501FileError88() throws CFException {
      return (  compareChars( getIp43501EiErrorType() , ip43501FileError8888Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setIp43501FileError88True() {  			
    	setIp43501EiErrorType( ip43501FileError8888Value);
   	}
	char[] ip43501MsgError8888Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isIp43501MsgError88()
	 *	@return  Returns true if isIp43501MsgError88() is "M"
	 */
   public boolean isIp43501MsgError88() throws CFException {
      return (  compareChars( getIp43501EiErrorType() , ip43501MsgError8888Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setIp43501MsgError88True() {  			
    	setIp43501EiErrorType( ip43501MsgError8888Value);
   	}
	char[] ip43501UnkError8888Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isIp43501UnkError88()
	 *	@return  Returns true if isIp43501UnkError88() is "U"
	 */
   public boolean isIp43501UnkError88() throws CFException {
      return (  compareChars( getIp43501EiErrorType() , ip43501UnkError8888Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setIp43501UnkError88True() {  			
    	setIp43501EiErrorType( ip43501UnkError8888Value);
   	}
	/**
	 *	Returns the value of ip43501EiErrorCode
	 *	@return ip43501EiErrorCode
	 */
   public char[] getIp43501EiErrorCode() throws CFException{
     if (isIp43501EiErrorCodeModified()) { 
        ip43501EiErrorCode = refreshIp43501EiErrorCode();
     }
   		return ip43501EiErrorCode;
   }

  
	/**
	*  set variable ip43501EiErrorCode
	*  Corresponding COBOL Variable is IP43501-EI-ERROR-CODE
	*  @param value
	**/
   public void setIp43501EiErrorCode(char[] value) {
      ip43501EiErrorCode = checkIp43501EiErrorCodeConstraints(value);
      serializeIp43501EiErrorCode(ip43501EiErrorCode);
   } 

     /**
	 * 	Update Ip43501EiErrorCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiErrorCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501EiErrorCode,ip43501EiErrorCode.length);
   	
   }
   
   public void setIp43501EiErrorCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiErrorCode,ip43501EiErrorCode.length);
   	
   }
   
     /**
	 * 	Update Ip43501EiErrorCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiErrorCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiErrorCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501EiErrorCode with another Field
	 *	@param value
	 */
   public void setIp43501EiErrorCode(Field source) {
       replace(source,0,source.length(),beginIp43501EiErrorCode,IP_43501_EI_ERROR_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501EiErrorCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501EiErrorCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501EiErrorCode,IP_43501_EI_ERROR_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501EiErrorCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiErrorCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiErrorCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip43501EiErrorMsgNbr
	 *	@return ip43501EiErrorMsgNbr
	 */
   public char[] getIp43501EiErrorMsgNbr() throws CFException{
     if (isIp43501EiErrorMsgNbrModified()) { 
        ip43501EiErrorMsgNbr = refreshIp43501EiErrorMsgNbr();
     }
   		return ip43501EiErrorMsgNbr;
   }

  
	/**
	*  set variable ip43501EiErrorMsgNbr
	*  Corresponding COBOL Variable is IP43501-EI-ERROR-MSG-NBR
	*  @param value
	**/
   public void setIp43501EiErrorMsgNbr(char[] value) {
      ip43501EiErrorMsgNbr = checkIp43501EiErrorMsgNbrConstraints(value);
      serializeIp43501EiErrorMsgNbr(ip43501EiErrorMsgNbr);
   } 

     /**
	 * 	Update Ip43501EiErrorMsgNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiErrorMsgNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501EiErrorMsgNbr,ip43501EiErrorMsgNbr.length);
   	
   }
   
   public void setIp43501EiErrorMsgNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiErrorMsgNbr,ip43501EiErrorMsgNbr.length);
   	
   }
   
     /**
	 * 	Update Ip43501EiErrorMsgNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiErrorMsgNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiErrorMsgNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501EiErrorMsgNbr with another Field
	 *	@param value
	 */
   public void setIp43501EiErrorMsgNbr(Field source) {
       replace(source,0,source.length(),beginIp43501EiErrorMsgNbr,IP_43501_EI_ERROR_MSG_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501EiErrorMsgNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501EiErrorMsgNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501EiErrorMsgNbr,IP_43501_EI_ERROR_MSG_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501EiErrorMsgNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiErrorMsgNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiErrorMsgNbr+targetIndex,targetLen);
    
   }
    /**
	 *	Returns the value of ip43501EiReplText
	 *  Corresponding COBOL Variable is IP43501-EI-REPL-TEXT
	 *	@return ip43501EiReplText
	 */
	public List<char[]> getIp43501EiReplText() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < IP_43501_EI_REPL_TEXT_SIZE;index++) {
        	list.add( getIp43501EiReplText( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ip43501EiReplText
	 */
	public char[] getIp43501EiReplText(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getIp43501EiReplText(), resetting it to 0",index);
		    index = 0;
        } else if (index >= IP_43501_EI_REPL_TEXT_SIZE) {
             	index = IP_43501_EI_REPL_TEXT_SIZE -1; // can't exceed max array size
             	logger.trace("ip43501EiReplText - Array index exceeded max Size {}, resetting it to max allowed",IP_43501_EI_REPL_TEXT_SIZE); 
	    }
   	      return getCharArray( (beginIp43501EiReplText + index*IP_43501_EI_REPL_TEXT_LEN) , IP_43501_EI_REPL_TEXT_LEN );
    }
    
    
   public int  ip43501EiReplTextFieldLength() {
   	return IP_43501_EI_REPL_TEXT_LEN;
   }
   
	

  
  	/**
	 *	Update Ip43501EiReplText with the passed value at a given index
	 *  Corresponding COBOL Variable is IP43501-EI-REPL-TEXT
	 *  @param index
	 *	@param value
	 */
  public void setIp43501EiReplText(int index,char[] value) {
   	setIp43501EiReplText(index,value,true);
   }
   
   
   /**
	 *	Update Ip43501EiReplText with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setIp43501EiReplText(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setIp43501EiReplText(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 50)  {     
		       value = substring(value,0,50);
           }  else if (value.length < 50) {
		       value = pad(50, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(50).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeIp43501EiReplText(index,value);		
       }
   }
   
	/**
	 *	Returns the value of ip43501EiErrorInfo
	 *	@return ip43501EiErrorInfo
	 */   
	 public Ip43501EiErrorInfo getIp43501EiErrorInfo() {
   	return ip43501EiErrorInfo;
   }
   /**
	* 	Update Ip43501EiErrorInfo with the passed value
	*   Corresponding COBOL Variable is IP43501-EI-ERROR-INFO
	*	@param value
	*/
   public void setIp43501EiErrorInfo(char[] value) {
      ip43501EiErrorInfo.setString(value); 
   }   
    
     /**
	 * 	Update Ip43501EiErrorInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiErrorInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip43501EiErrorInfo.begin,ip43501EiErrorInfo.length());
   }
   
     /**
	 * 	Update Ip43501EiErrorInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiErrorInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip43501EiErrorInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip43501EiErrorInfo with another Field
	 *	@param value
	 */
   public void setIp43501EiErrorInfo(Field source) {
   	replace(source,0,source.length(),ip43501EiErrorInfo.begin,ip43501EiErrorInfo.length());
   }  
   
     /**
	 * 	Update Ip43501EiErrorInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiErrorInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip43501EiErrorInfo.begin,ip43501EiErrorInfo.length());
   }
   
     /**
	 * 	Update Ip43501EiErrorInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiErrorInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip43501EiErrorInfo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip43501EiFieldErrorInd
	 *	@return ip43501EiFieldErrorInd
	 */
   public char[] getIp43501EiFieldErrorInd() throws CFException{
     if (isIp43501EiFieldErrorIndModified()) { 
        ip43501EiFieldErrorInd = refreshIp43501EiFieldErrorInd();
     }
   		return ip43501EiFieldErrorInd;
   }

  
	/**
	*  set variable ip43501EiFieldErrorInd
	*  Corresponding COBOL Variable is IP43501-EI-FIELD-ERROR-IND
	*  @param value
	**/
   public void setIp43501EiFieldErrorInd(char[] value) {
      ip43501EiFieldErrorInd = checkIp43501EiFieldErrorIndConstraints(value);
      serializeIp43501EiFieldErrorInd(ip43501EiFieldErrorInd);
   } 

     /**
	 * 	Update Ip43501EiFieldErrorInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiFieldErrorInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501EiFieldErrorInd,ip43501EiFieldErrorInd.length);
   	
   }
   
   public void setIp43501EiFieldErrorInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiFieldErrorInd,ip43501EiFieldErrorInd.length);
   	
   }
   
     /**
	 * 	Update Ip43501EiFieldErrorInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiFieldErrorInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiFieldErrorInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501EiFieldErrorInd with another Field
	 *	@param value
	 */
   public void setIp43501EiFieldErrorInd(Field source) {
       replace(source,0,source.length(),beginIp43501EiFieldErrorInd,IP_43501_EI_FIELD_ERROR_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501EiFieldErrorInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501EiFieldErrorInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501EiFieldErrorInd,IP_43501_EI_FIELD_ERROR_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501EiFieldErrorInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiFieldErrorInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiFieldErrorInd+targetIndex,targetLen);
    
   }
	char[] ip43501FieldInError8888Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isIp43501FieldInError88()
	 *	@return  Returns true if isIp43501FieldInError88() is "E"
	 */
   public boolean isIp43501FieldInError88() throws CFException {
      return (  compareChars( getIp43501EiFieldErrorInd() , ip43501FieldInError8888Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setIp43501FieldInError88True() {  			
    	setIp43501EiFieldErrorInd( ip43501FieldInError8888Value);
   	}
	char[] ip43501NoError8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp43501NoError88()
	 *	@return  Returns true if isIp43501NoError88() is "N"
	 */
   public boolean isIp43501NoError88() throws CFException {
      return (  compareChars( getIp43501EiFieldErrorInd() , ip43501NoError8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp43501NoError88True() {  			
    	setIp43501EiFieldErrorInd( ip43501NoError8888Value);
   	}
	/**
	 *	Returns the value of ip43501EiAmtCntAccumInd
	 *	@return ip43501EiAmtCntAccumInd
	 */
   public char[] getIp43501EiAmtCntAccumInd() throws CFException{
     if (isIp43501EiAmtCntAccumIndModified()) { 
        ip43501EiAmtCntAccumInd = refreshIp43501EiAmtCntAccumInd();
     }
   		return ip43501EiAmtCntAccumInd;
   }

  
	/**
	*  set variable ip43501EiAmtCntAccumInd
	*  Corresponding COBOL Variable is IP43501-EI-AMT-CNT-ACCUM-IND
	*  @param value
	**/
   public void setIp43501EiAmtCntAccumInd(char[] value) {
      ip43501EiAmtCntAccumInd = checkIp43501EiAmtCntAccumIndConstraints(value);
      serializeIp43501EiAmtCntAccumInd(ip43501EiAmtCntAccumInd);
   } 

     /**
	 * 	Update Ip43501EiAmtCntAccumInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiAmtCntAccumInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501EiAmtCntAccumInd,ip43501EiAmtCntAccumInd.length);
   	
   }
   
   public void setIp43501EiAmtCntAccumInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiAmtCntAccumInd,ip43501EiAmtCntAccumInd.length);
   	
   }
   
     /**
	 * 	Update Ip43501EiAmtCntAccumInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiAmtCntAccumInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiAmtCntAccumInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501EiAmtCntAccumInd with another Field
	 *	@param value
	 */
   public void setIp43501EiAmtCntAccumInd(Field source) {
       replace(source,0,source.length(),beginIp43501EiAmtCntAccumInd,IP_43501_EI_AMT_CNT_ACCUM_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501EiAmtCntAccumInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501EiAmtCntAccumInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501EiAmtCntAccumInd,IP_43501_EI_AMT_CNT_ACCUM_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501EiAmtCntAccumInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiAmtCntAccumInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiAmtCntAccumInd+targetIndex,targetLen);
    
   }
	char[] ip43501AmtCntNeedAccum8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isIp43501AmtCntNeedAccum88()
	 *	@return  Returns true if isIp43501AmtCntNeedAccum88() is "A"
	 */
   public boolean isIp43501AmtCntNeedAccum88() throws CFException {
      return (  compareChars( getIp43501EiAmtCntAccumInd() , ip43501AmtCntNeedAccum8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setIp43501AmtCntNeedAccum88True() {  			
    	setIp43501EiAmtCntAccumInd( ip43501AmtCntNeedAccum8888Value);
   	}
	char[] ip43501NoAccum8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp43501NoAccum88()
	 *	@return  Returns true if isIp43501NoAccum88() is "N"
	 */
   public boolean isIp43501NoAccum88() throws CFException {
      return (  compareChars( getIp43501EiAmtCntAccumInd() , ip43501NoAccum8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp43501NoAccum88True() {  			
    	setIp43501EiAmtCntAccumInd( ip43501NoAccum8888Value);
   	}
	/**
	 *	Returns the value of ip43501EiDataLength
	 *	@return ip43501EiDataLength
	 */
	public int getIp43501EiDataLength() throws CFException {
       if (isIp43501EiDataLengthModified()) { 
           ip43501EiDataLength = refreshIp43501EiDataLength();
        }
   		return ip43501EiDataLength;
	}
	

	
	   
	/**
	 * 	Update Ip43501EiDataLength with the passed value
	 *  Corresponding COBOL Variable is IP43501-EI-DATA-LENGTH
	 *	@param number
	 */
	public void setIp43501EiDataLength(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip43501EiDataLength = checkIp43501EiDataLengthMaxLimit(number); 
		serializeIp43501EiDataLength(ip43501EiDataLength);
	}
	

	public void setIp43501EiDataLength(long number) {
	    number = checkIp43501EiDataLengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp43501EiDataLength((int)number);
	}
	
	/**
	 * 	Update Ip43501EiDataLength with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp43501EiDataLength(char[] value) throws CFException {
		 ip43501EiDataLength = serializeIp43501EiDataLength(value);
	}
	/**
	 * 	Update Ip43501EiDataLength with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp43501EiDataLengthString(char[] value) throws CFException {
		 setIp43501EiDataLength(value);
	}

	
	
	
	/**
	 * 	initializes Ip43501SortSolution
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp43501EiRecType(CONSTANTS.SPACE_2);
         setIp43501EiTransmissionId(CONSTANTS.SPACE_25);
         setIp43501EiFileId(CONSTANTS.SPACE_25);
                     setIp43501EiFileSeqNbr(0);
                     setIp43501EiInstitutionId(0);
                     setIp43501EiBin(0);
         setIp43501EiCardAcceptor(CONSTANTS.SPACE_15);
                     setIp43501EiSourceMsgNum(0);
         setIp43501EiErrorType(CONSTANTS.SPACE);
         setIp43501EiErrorCode(CONSTANTS.SPACE_4);
         setIp43501EiErrorMsgNbr(CONSTANTS.SPACE_4);
         for (int index =0; index < IP_43501_EI_REPL_TEXT_SIZE;index++) {
             setIp43501EiReplText(index, CONSTANTS.SPACE_50);
         }
          ip43501EiErrorInfo.initialize();
     
         setIp43501EiFieldErrorInd(CONSTANTS.SPACE);
         setIp43501EiAmtCntAccumInd(CONSTANTS.SPACE);
                     setIp43501EiDataLength(0);
   }

		public static int getIp43501SortSolutionFieldLength() {
			return IP_43501_SORT_SOLUTION_LENGTH;
		}

}
  
