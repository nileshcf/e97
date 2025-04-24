package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip43501FileStatusRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip43501FileStatusRec extends Ip43501FileStatusRecSerialized { 
   

						private char[] ip43501FsRecType = Field.fillLowValue(2);

						private char[] ip43501FsTransmissionId = Field.fillLowValue(25);

						private char[] ip43501FsFileId = Field.fillLowValue(25);

								private int ip43501FsFileSeqNbr;

								private long ip43501FsInstitutionId;

								private long ip43501FsBin;

						private char[] ip43501FsCardAcceptor = Field.fillLowValue(15);

								private long ip43501FsSourceMsgNum;

						private char[] ip43501FsFiller = Field.fillLowValue(1);
				private Ip43501FsFileStatusInfo ip43501FsFileStatusInfo = new Ip43501FsFileStatusInfo();

	
	/**
	* Constructor for Ip43501FileStatusRec
	**/
    public Ip43501FileStatusRec() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip43501FileStatusRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip43501FileStatusRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip43501FsFileStatusInfo.setParent(this,getStartOffset() + 98);
    } 

	/**
	 *	Returns the value of ip43501FsRecType
	 *	@return ip43501FsRecType
	 */
   public char[] getIp43501FsRecType() throws CFException{
     if (isIp43501FsRecTypeModified()) { 
        ip43501FsRecType = refreshIp43501FsRecType();
     }
   		return ip43501FsRecType;
   }

  
	/**
	*  set variable ip43501FsRecType
	*  Corresponding COBOL Variable is IP43501-FS-REC-TYPE
	*  @param value
	**/
   public void setIp43501FsRecType(char[] value) {
      ip43501FsRecType = checkIp43501FsRecTypeConstraints(value);
      serializeIp43501FsRecType(ip43501FsRecType);
   } 

     /**
	 * 	Update Ip43501FsRecType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501FsRecType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501FsRecType,ip43501FsRecType.length);
   	
   }
   
   public void setIp43501FsRecType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsRecType,ip43501FsRecType.length);
   	
   }
   
     /**
	 * 	Update Ip43501FsRecType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501FsRecType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsRecType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501FsRecType with another Field
	 *	@param value
	 */
   public void setIp43501FsRecType(Field source) {
       replace(source,0,source.length(),beginIp43501FsRecType,IP_43501_FS_REC_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501FsRecType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501FsRecType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501FsRecType,IP_43501_FS_REC_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501FsRecType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501FsRecType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsRecType+targetIndex,targetLen);
    
   }
	char[] ip43501FsRegularProc8888Value = "E1".toCharArray();
	/**
	 *	Test condition "E1" for isIp43501FsRegularProc88()
	 *	@return  Returns true if isIp43501FsRegularProc88() is "E1"
	 */
   public boolean isIp43501FsRegularProc88() throws CFException {
      return (  compareChars( getIp43501FsRecType() , ip43501FsRegularProc8888Value)  == 0  );
   }


	/**
	*  set values "E1"
	*/
   	public void setIp43501FsRegularProc88True() {  			
    	setIp43501FsRecType( ip43501FsRegularProc8888Value);
   	}
	/**
	 *	Returns the value of ip43501FsTransmissionId
	 *	@return ip43501FsTransmissionId
	 */
   public char[] getIp43501FsTransmissionId() throws CFException{
     if (isIp43501FsTransmissionIdModified()) { 
        ip43501FsTransmissionId = refreshIp43501FsTransmissionId();
     }
   		return ip43501FsTransmissionId;
   }

  
	/**
	*  set variable ip43501FsTransmissionId
	*  Corresponding COBOL Variable is IP43501-FS-TRANSMISSION-ID
	*  @param value
	**/
   public void setIp43501FsTransmissionId(char[] value) {
      ip43501FsTransmissionId = checkIp43501FsTransmissionIdConstraints(value);
      serializeIp43501FsTransmissionId(ip43501FsTransmissionId);
   } 

     /**
	 * 	Update Ip43501FsTransmissionId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501FsTransmissionId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501FsTransmissionId,ip43501FsTransmissionId.length);
   	
   }
   
   public void setIp43501FsTransmissionId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsTransmissionId,ip43501FsTransmissionId.length);
   	
   }
   
     /**
	 * 	Update Ip43501FsTransmissionId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501FsTransmissionId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsTransmissionId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501FsTransmissionId with another Field
	 *	@param value
	 */
   public void setIp43501FsTransmissionId(Field source) {
       replace(source,0,source.length(),beginIp43501FsTransmissionId,IP_43501_FS_TRANSMISSION_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501FsTransmissionId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501FsTransmissionId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501FsTransmissionId,IP_43501_FS_TRANSMISSION_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501FsTransmissionId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501FsTransmissionId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsTransmissionId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip43501FsFileId
	 *	@return ip43501FsFileId
	 */
   public char[] getIp43501FsFileId() throws CFException{
     if (isIp43501FsFileIdModified()) { 
        ip43501FsFileId = refreshIp43501FsFileId();
     }
   		return ip43501FsFileId;
   }

  
	/**
	*  set variable ip43501FsFileId
	*  Corresponding COBOL Variable is IP43501-FS-FILE-ID
	*  @param value
	**/
   public void setIp43501FsFileId(char[] value) {
      ip43501FsFileId = checkIp43501FsFileIdConstraints(value);
      serializeIp43501FsFileId(ip43501FsFileId);
   } 

     /**
	 * 	Update Ip43501FsFileId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501FsFileId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501FsFileId,ip43501FsFileId.length);
   	
   }
   
   public void setIp43501FsFileId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsFileId,ip43501FsFileId.length);
   	
   }
   
     /**
	 * 	Update Ip43501FsFileId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501FsFileId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsFileId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501FsFileId with another Field
	 *	@param value
	 */
   public void setIp43501FsFileId(Field source) {
       replace(source,0,source.length(),beginIp43501FsFileId,IP_43501_FS_FILE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501FsFileId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501FsFileId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501FsFileId,IP_43501_FS_FILE_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501FsFileId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501FsFileId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsFileId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip43501FsFileSeqNbr
	 *	@return ip43501FsFileSeqNbr
	 */
	public int getIp43501FsFileSeqNbr() throws CFException {
       if (isIp43501FsFileSeqNbrModified()) { 
           ip43501FsFileSeqNbr = refreshIp43501FsFileSeqNbr();
        }
   		return ip43501FsFileSeqNbr;
	}
	

	
	   
	/**
	 * 	Update Ip43501FsFileSeqNbr with the passed value
	 *  Corresponding COBOL Variable is IP43501-FS-FILE-SEQ-NBR
	 *	@param number
	 */
	public void setIp43501FsFileSeqNbr(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip43501FsFileSeqNbr = checkIp43501FsFileSeqNbrMaxLimit(number); 
		serializeIp43501FsFileSeqNbr(ip43501FsFileSeqNbr);
	}
	

	public void setIp43501FsFileSeqNbr(long number) {
	    number = checkIp43501FsFileSeqNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp43501FsFileSeqNbr((int)number);
	}
	
	/**
	 * 	Update Ip43501FsFileSeqNbr with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp43501FsFileSeqNbr(char[] value) throws CFException {
		 ip43501FsFileSeqNbr = serializeIp43501FsFileSeqNbr(value);
	}
	/**
	 * 	Update Ip43501FsFileSeqNbr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp43501FsFileSeqNbrString(char[] value) throws CFException {
		 setIp43501FsFileSeqNbr(value);
	}
	/**
	 *	Returns the value of ip43501FsInstitutionId
	 *	@return ip43501FsInstitutionId
	 */
	public long getIp43501FsInstitutionId() throws CFException {
       if (isIp43501FsInstitutionIdModified()) { 
           ip43501FsInstitutionId = refreshIp43501FsInstitutionId();
        }
   		return ip43501FsInstitutionId;
	}
	

	
	   
	/**
	 * 	Update Ip43501FsInstitutionId with the passed value
	 *  Corresponding COBOL Variable is IP43501-FS-INSTITUTION-ID
	 *	@param number
	 */
	public void setIp43501FsInstitutionId(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip43501FsInstitutionId = checkIp43501FsInstitutionIdMaxLimit(number); 
		serializeIp43501FsInstitutionId(ip43501FsInstitutionId);
	}
	

	/**
	 * 	Update Ip43501FsInstitutionId with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp43501FsInstitutionId(char[] value) throws CFException {
		 ip43501FsInstitutionId = serializeIp43501FsInstitutionId(value);
	}
	/**
	 * 	Update Ip43501FsInstitutionId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp43501FsInstitutionIdString(char[] value) throws CFException {
		 setIp43501FsInstitutionId(value);
	}
	/**
	 *	Returns the value of ip43501FsBin
	 *	@return ip43501FsBin
	 */
	public long getIp43501FsBin() throws CFException {
       if (isIp43501FsBinModified()) { 
           ip43501FsBin = refreshIp43501FsBin();
        }
   		return ip43501FsBin;
	}
	

	
	   
	/**
	 * 	Update Ip43501FsBin with the passed value
	 *  Corresponding COBOL Variable is IP43501-FS-BIN
	 *	@param number
	 */
	public void setIp43501FsBin(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip43501FsBin = checkIp43501FsBinMaxLimit(number); 
		serializeIp43501FsBin(ip43501FsBin);
	}
	

	/**
	 * 	Update Ip43501FsBin with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp43501FsBin(char[] value) throws CFException {
		 ip43501FsBin = serializeIp43501FsBin(value);
	}
	/**
	 * 	Update Ip43501FsBin with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp43501FsBinString(char[] value) throws CFException {
		 setIp43501FsBin(value);
	}
	/**
	 *	Returns the value of ip43501FsCardAcceptor
	 *	@return ip43501FsCardAcceptor
	 */
   public char[] getIp43501FsCardAcceptor() throws CFException{
     if (isIp43501FsCardAcceptorModified()) { 
        ip43501FsCardAcceptor = refreshIp43501FsCardAcceptor();
     }
   		return ip43501FsCardAcceptor;
   }

  
	/**
	*  set variable ip43501FsCardAcceptor
	*  Corresponding COBOL Variable is IP43501-FS-CARD-ACCEPTOR
	*  @param value
	**/
   public void setIp43501FsCardAcceptor(char[] value) {
      ip43501FsCardAcceptor = checkIp43501FsCardAcceptorConstraints(value);
      serializeIp43501FsCardAcceptor(ip43501FsCardAcceptor);
   } 

     /**
	 * 	Update Ip43501FsCardAcceptor 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501FsCardAcceptor(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501FsCardAcceptor,ip43501FsCardAcceptor.length);
   	
   }
   
   public void setIp43501FsCardAcceptor(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsCardAcceptor,ip43501FsCardAcceptor.length);
   	
   }
   
     /**
	 * 	Update Ip43501FsCardAcceptor 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501FsCardAcceptor(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsCardAcceptor+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501FsCardAcceptor with another Field
	 *	@param value
	 */
   public void setIp43501FsCardAcceptor(Field source) {
       replace(source,0,source.length(),beginIp43501FsCardAcceptor,IP_43501_FS_CARD_ACCEPTOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501FsCardAcceptor 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501FsCardAcceptor(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501FsCardAcceptor,IP_43501_FS_CARD_ACCEPTOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501FsCardAcceptor 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501FsCardAcceptor(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsCardAcceptor+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip43501FsSourceMsgNum
	 *	@return ip43501FsSourceMsgNum
	 */
	public long getIp43501FsSourceMsgNum() throws CFException {
       if (isIp43501FsSourceMsgNumModified()) { 
           ip43501FsSourceMsgNum = refreshIp43501FsSourceMsgNum();
        }
   		return ip43501FsSourceMsgNum;
	}
	

	
	   
	/**
	 * 	Update Ip43501FsSourceMsgNum with the passed value
	 *  Corresponding COBOL Variable is IP43501-FS-SOURCE-MSG-NUM
	 *	@param number
	 */
	public void setIp43501FsSourceMsgNum(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip43501FsSourceMsgNum = checkIp43501FsSourceMsgNumMaxLimit(number); 
		serializeIp43501FsSourceMsgNum(ip43501FsSourceMsgNum);
	}
	

	/**
	 * 	Update Ip43501FsSourceMsgNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp43501FsSourceMsgNum(char[] value) throws CFException {
		 ip43501FsSourceMsgNum = serializeIp43501FsSourceMsgNum(value);
	}
	/**
	 * 	Update Ip43501FsSourceMsgNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp43501FsSourceMsgNumString(char[] value) throws CFException {
		 setIp43501FsSourceMsgNum(value);
	}
	/**
	 *	Returns the value of ip43501FsFiller
	 *	@return ip43501FsFiller
	 */
   public char[] getIp43501FsFiller() throws CFException{
     if (isIp43501FsFillerModified()) { 
        ip43501FsFiller = refreshIp43501FsFiller();
     }
   		return ip43501FsFiller;
   }

  
	/**
	*  set variable ip43501FsFiller
	*  Corresponding COBOL Variable is IP43501-FS-FILLER
	*  @param value
	**/
   public void setIp43501FsFiller(char[] value) {
      ip43501FsFiller = checkIp43501FsFillerConstraints(value);
      serializeIp43501FsFiller(ip43501FsFiller);
   } 

     /**
	 * 	Update Ip43501FsFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501FsFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501FsFiller,ip43501FsFiller.length);
   	
   }
   
   public void setIp43501FsFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsFiller,ip43501FsFiller.length);
   	
   }
   
     /**
	 * 	Update Ip43501FsFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501FsFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501FsFiller with another Field
	 *	@param value
	 */
   public void setIp43501FsFiller(Field source) {
       replace(source,0,source.length(),beginIp43501FsFiller,IP_43501_FS_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501FsFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501FsFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501FsFiller,IP_43501_FS_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501FsFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501FsFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsFiller+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip43501FsFileStatusInfo
	 *	@return ip43501FsFileStatusInfo
	 */   
	 public Ip43501FsFileStatusInfo getIp43501FsFileStatusInfo() {
   	return ip43501FsFileStatusInfo;
   }
   /**
	* 	Update Ip43501FsFileStatusInfo with the passed value
	*   Corresponding COBOL Variable is IP43501-FS-FILE-STATUS-INFO
	*	@param value
	*/
   public void setIp43501FsFileStatusInfo(char[] value) {
      ip43501FsFileStatusInfo.setString(value); 
   }   
    
     /**
	 * 	Update Ip43501FsFileStatusInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp43501FsFileStatusInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip43501FsFileStatusInfo.begin,ip43501FsFileStatusInfo.length());
   }
   
     /**
	 * 	Update Ip43501FsFileStatusInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501FsFileStatusInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip43501FsFileStatusInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip43501FsFileStatusInfo with another Field
	 *	@param value
	 */
   public void setIp43501FsFileStatusInfo(Field source) {
   	replace(source,0,source.length(),ip43501FsFileStatusInfo.begin,ip43501FsFileStatusInfo.length());
   }  
   
     /**
	 * 	Update Ip43501FsFileStatusInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp43501FsFileStatusInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip43501FsFileStatusInfo.begin,ip43501FsFileStatusInfo.length());
   }
   
     /**
	 * 	Update Ip43501FsFileStatusInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501FsFileStatusInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip43501FsFileStatusInfo.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIp43501FileStatusRecFieldLength() {
			return IP_43501_FILE_STATUS_REC_LENGTH;
		}

}
  
