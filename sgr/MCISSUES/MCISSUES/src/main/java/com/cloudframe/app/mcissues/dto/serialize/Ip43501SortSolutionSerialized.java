package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Ip43501SortSolutionSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip43501SortSolutionSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip43501SortSolutionSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_43501_SORT_SOLUTION_LENGTH = 1358;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp43501EiRecType;
            protected  int beginIp43501EiTransmissionId;
            protected  int beginIp43501EiFileId;
            protected  int beginIp43501EiFileSeqNbr;
            protected  int beginIp43501EiInstitutionId;
            protected  int beginIp43501EiBin;
            protected  int beginIp43501EiCardAcceptor;
            protected  int beginIp43501EiSourceMsgNum;
            protected  int beginIp43501EiErrorType;
            protected  int beginIp43501EiErrorCode;
            protected  int beginIp43501EiErrorMsgNbr;
           protected int beginIp43501EiReplText;
           protected static final int IP_43501_EI_REPL_TEXT_SIZE = 3;
            protected  int beginIp43501EiFieldErrorInd;
            protected  int beginIp43501EiAmtCntAccumInd;
            protected  int beginIp43501EiDataLength;
	
	/**
	* Constructor for Ip43501SortSolutionSerialized
	**/
    public Ip43501SortSolutionSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip43501SortSolutionSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip43501SortSolutionSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip43501SortSolutionSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip43501SortSolutionSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip43501SortSolutionSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_43501_SORT_SOLUTION_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp43501EiRecType = getStartOffset() + 0;	// set offset for serialization
  
             beginIp43501EiTransmissionId = getStartOffset() + 2;	// set offset for serialization
  
             beginIp43501EiFileId = getStartOffset() + 27;	// set offset for serialization
  
             beginIp43501EiFileSeqNbr = getStartOffset() + 52;	// set offset for serialization
  
             beginIp43501EiInstitutionId = getStartOffset() + 55;	// set offset for serialization
  
             beginIp43501EiBin = getStartOffset() + 66;	// set offset for serialization
  
             beginIp43501EiCardAcceptor = getStartOffset() + 72;	// set offset for serialization
  
             beginIp43501EiSourceMsgNum = getStartOffset() + 87;	// set offset for serialization
  
             beginIp43501EiErrorType = getStartOffset() + 97;	// set offset for serialization
  
             beginIp43501EiErrorCode = getStartOffset() + 98;	// set offset for serialization
  
             beginIp43501EiErrorMsgNbr = getStartOffset() + 102;	// set offset for serialization
  
	        beginIp43501EiReplText = getStartOffset() + 106; // set offset for serialization
  
  
             beginIp43501EiFieldErrorInd = getStartOffset() + 1295;	// set offset for serialization
  
             beginIp43501EiAmtCntAccumInd = getStartOffset() + 1296;	// set offset for serialization
  
  
             beginIp43501EiDataLength = getStartOffset() + 1354;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp43501EiRecTypeCounter = -1;
     public boolean isIp43501EiRecTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501EiRecTypeCounter != sharedCounter;
         localIp43501EiRecTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_EI_REC_TYPE_LEN = 2;
	/**
	 * 	serialize this Ip43501EiRecType
	 */
   protected void serializeIp43501EiRecType(char[] ip43501EiRecType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501EiRecType,0,getStringValue(),beginIp43501EiRecType,IP_43501_EI_REC_TYPE_LEN);
       localIp43501EiRecTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501EiRecTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp43501EiRecType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501EiRecType() {	 
   		return (substring(getStringValue(),beginIp43501EiRecType,beginIp43501EiRecType + IP_43501_EI_REC_TYPE_LEN));
   	}
     int localIp43501EiTransmissionIdCounter = -1;
     public boolean isIp43501EiTransmissionIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501EiTransmissionIdCounter != sharedCounter;
         localIp43501EiTransmissionIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_EI_TRANSMISSION_ID_LEN = 25;
	/**
	 * 	serialize this Ip43501EiTransmissionId
	 */
   protected void serializeIp43501EiTransmissionId(char[] ip43501EiTransmissionId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501EiTransmissionId,0,getStringValue(),beginIp43501EiTransmissionId,IP_43501_EI_TRANSMISSION_ID_LEN);
       localIp43501EiTransmissionIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501EiTransmissionIdConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshIp43501EiTransmissionId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501EiTransmissionId() {	 
   		return (substring(getStringValue(),beginIp43501EiTransmissionId,beginIp43501EiTransmissionId + IP_43501_EI_TRANSMISSION_ID_LEN));
   	}
     int localIp43501EiFileIdCounter = -1;
     public boolean isIp43501EiFileIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501EiFileIdCounter != sharedCounter;
         localIp43501EiFileIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_EI_FILE_ID_LEN = 25;
	/**
	 * 	serialize this Ip43501EiFileId
	 */
   protected void serializeIp43501EiFileId(char[] ip43501EiFileId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501EiFileId,0,getStringValue(),beginIp43501EiFileId,IP_43501_EI_FILE_ID_LEN);
       localIp43501EiFileIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501EiFileIdConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshIp43501EiFileId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501EiFileId() {	 
   		return (substring(getStringValue(),beginIp43501EiFileId,beginIp43501EiFileId + IP_43501_EI_FILE_ID_LEN));
   	}
     int localIp43501EiFileSeqNbrCounter = -1;
     public boolean isIp43501EiFileSeqNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501EiFileSeqNbrCounter != sharedCounter;
         localIp43501EiFileSeqNbrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip43501EiFileSeqNbr
	 *	@return ip43501EiFileSeqNbr
	 */
	public char[]  getIp43501EiFileSeqNbrString() {
	     return getCharArray(beginIp43501EiFileSeqNbr,IP_43501_EI_FILE_SEQ_NBR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip43501EiFileSeqNbrIsNumeric() {
	    return isNumeric(beginIp43501EiFileSeqNbr
	                    ,beginIp43501EiFileSeqNbr + IP_43501_EI_FILE_SEQ_NBR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_43501_EI_FILE_SEQ_NBR_LEN = 3;
  	/**
	 * serializeIp43501EiFileSeqNbr
	 */
	protected void serializeIp43501EiFileSeqNbr(int ip43501EiFileSeqNbr) {
		 putNumber(beginIp43501EiFileSeqNbr,ip43501EiFileSeqNbr,IP_43501_EI_FILE_SEQ_NBR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp43501EiFileSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp43501EiFileSeqNbr
	 */
   	protected  int serializeIp43501EiFileSeqNbr(char[] value) {
	    int  ip43501EiFileSeqNbr;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip43501EiFileSeqNbr = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp43501EiFileSeqNbr
		       ,3
		      );
		 localIp43501EiFileSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip43501EiFileSeqNbr;
    }

   protected int checkIp43501EiFileSeqNbrMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp43501EiFileSeqNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp43501EiFileSeqNbr() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp43501EiFileSeqNbr
			                 ,IP_43501_EI_FILE_SEQ_NBR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip43501EiFileSeqNbr", beginIp43501EiFileSeqNbr,IP_43501_EI_FILE_SEQ_NBR_LEN);
    }
   	}
     int localIp43501EiInstitutionIdCounter = -1;
     public boolean isIp43501EiInstitutionIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501EiInstitutionIdCounter != sharedCounter;
         localIp43501EiInstitutionIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip43501EiInstitutionId
	 *	@return ip43501EiInstitutionId
	 */
	public char[]  getIp43501EiInstitutionIdString() {
	     return getCharArray(beginIp43501EiInstitutionId,IP_43501_EI_INSTITUTION_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip43501EiInstitutionIdIsNumeric() {
	    return isNumeric(beginIp43501EiInstitutionId
	                    ,beginIp43501EiInstitutionId + IP_43501_EI_INSTITUTION_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_43501_EI_INSTITUTION_ID_LEN = 11;
  	/**
	 * serializeIp43501EiInstitutionId
	 */
	protected void serializeIp43501EiInstitutionId(long ip43501EiInstitutionId) {
		 putNumber(beginIp43501EiInstitutionId,ip43501EiInstitutionId,IP_43501_EI_INSTITUTION_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp43501EiInstitutionIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp43501EiInstitutionId
	 */
   	protected  long serializeIp43501EiInstitutionId(char[] value) {
	    long  ip43501EiInstitutionId;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip43501EiInstitutionId = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginIp43501EiInstitutionId
		       ,11
		      );
		 localIp43501EiInstitutionIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip43501EiInstitutionId;
    }

   protected long checkIp43501EiInstitutionIdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp43501EiInstitutionId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp43501EiInstitutionId() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp43501EiInstitutionId
			                 ,IP_43501_EI_INSTITUTION_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip43501EiInstitutionId", beginIp43501EiInstitutionId,IP_43501_EI_INSTITUTION_ID_LEN);
    }
   	}
     int localIp43501EiBinCounter = -1;
     public boolean isIp43501EiBinModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501EiBinCounter != sharedCounter;
         localIp43501EiBinCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip43501EiBin
	 *	@return ip43501EiBin
	 */
	public char[]  getIp43501EiBinString() {
	     return getCharArray(beginIp43501EiBin,IP_43501_EI_BIN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip43501EiBinIsNumeric() {
	    return isNumeric(beginIp43501EiBin
	                    ,beginIp43501EiBin + IP_43501_EI_BIN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_43501_EI_BIN_LEN = 6;
  	/**
	 * serializeIp43501EiBin
	 */
	protected void serializeIp43501EiBin(long ip43501EiBin) {
		 putNumber(beginIp43501EiBin,ip43501EiBin,IP_43501_EI_BIN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp43501EiBinCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp43501EiBin
	 */
   	protected  long serializeIp43501EiBin(char[] value) {
	    long  ip43501EiBin;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip43501EiBin = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp43501EiBin
		       ,6
		      );
		 localIp43501EiBinCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip43501EiBin;
    }

   protected long checkIp43501EiBinMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp43501EiBin is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp43501EiBin() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp43501EiBin
			                 ,IP_43501_EI_BIN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip43501EiBin", beginIp43501EiBin,IP_43501_EI_BIN_LEN);
    }
   	}
     int localIp43501EiCardAcceptorCounter = -1;
     public boolean isIp43501EiCardAcceptorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501EiCardAcceptorCounter != sharedCounter;
         localIp43501EiCardAcceptorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_EI_CARD_ACCEPTOR_LEN = 15;
	/**
	 * 	serialize this Ip43501EiCardAcceptor
	 */
   protected void serializeIp43501EiCardAcceptor(char[] ip43501EiCardAcceptor) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501EiCardAcceptor,0,getStringValue(),beginIp43501EiCardAcceptor,IP_43501_EI_CARD_ACCEPTOR_LEN);
       localIp43501EiCardAcceptorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501EiCardAcceptorConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshIp43501EiCardAcceptor is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501EiCardAcceptor() {	 
   		return (substring(getStringValue(),beginIp43501EiCardAcceptor,beginIp43501EiCardAcceptor + IP_43501_EI_CARD_ACCEPTOR_LEN));
   	}
     int localIp43501EiSourceMsgNumCounter = -1;
     public boolean isIp43501EiSourceMsgNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501EiSourceMsgNumCounter != sharedCounter;
         localIp43501EiSourceMsgNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip43501EiSourceMsgNum
	 *	@return ip43501EiSourceMsgNum
	 */
	public char[]  getIp43501EiSourceMsgNumString() {
	     return getCharArray(beginIp43501EiSourceMsgNum,IP_43501_EI_SOURCE_MSG_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip43501EiSourceMsgNumIsNumeric() {
	    return isNumeric(beginIp43501EiSourceMsgNum
	                    ,beginIp43501EiSourceMsgNum + IP_43501_EI_SOURCE_MSG_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_43501_EI_SOURCE_MSG_NUM_LEN = 10;
  	/**
	 * serializeIp43501EiSourceMsgNum
	 */
	protected void serializeIp43501EiSourceMsgNum(long ip43501EiSourceMsgNum) {
		 putNumber(beginIp43501EiSourceMsgNum,ip43501EiSourceMsgNum,IP_43501_EI_SOURCE_MSG_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp43501EiSourceMsgNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp43501EiSourceMsgNum
	 */
   	protected  long serializeIp43501EiSourceMsgNum(char[] value) {
	    long  ip43501EiSourceMsgNum;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip43501EiSourceMsgNum = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginIp43501EiSourceMsgNum
		       ,10
		      );
		 localIp43501EiSourceMsgNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip43501EiSourceMsgNum;
    }

   protected long checkIp43501EiSourceMsgNumMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp43501EiSourceMsgNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp43501EiSourceMsgNum() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp43501EiSourceMsgNum
			                 ,IP_43501_EI_SOURCE_MSG_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip43501EiSourceMsgNum", beginIp43501EiSourceMsgNum,IP_43501_EI_SOURCE_MSG_NUM_LEN);
    }
   	}
     int localIp43501EiErrorTypeCounter = -1;
     public boolean isIp43501EiErrorTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501EiErrorTypeCounter != sharedCounter;
         localIp43501EiErrorTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_EI_ERROR_TYPE_LEN = 1;
	/**
	 * 	serialize this Ip43501EiErrorType
	 */
   protected void serializeIp43501EiErrorType(char[] ip43501EiErrorType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501EiErrorType,0,getStringValue(),beginIp43501EiErrorType,IP_43501_EI_ERROR_TYPE_LEN);
       localIp43501EiErrorTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501EiErrorTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp43501EiErrorType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501EiErrorType() {	 
   		return (substring(getStringValue(),beginIp43501EiErrorType,beginIp43501EiErrorType + IP_43501_EI_ERROR_TYPE_LEN));
   	}
     int localIp43501EiErrorCodeCounter = -1;
     public boolean isIp43501EiErrorCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501EiErrorCodeCounter != sharedCounter;
         localIp43501EiErrorCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_EI_ERROR_CODE_LEN = 4;
	/**
	 * 	serialize this Ip43501EiErrorCode
	 */
   protected void serializeIp43501EiErrorCode(char[] ip43501EiErrorCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501EiErrorCode,0,getStringValue(),beginIp43501EiErrorCode,IP_43501_EI_ERROR_CODE_LEN);
       localIp43501EiErrorCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501EiErrorCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp43501EiErrorCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501EiErrorCode() {	 
   		return (substring(getStringValue(),beginIp43501EiErrorCode,beginIp43501EiErrorCode + IP_43501_EI_ERROR_CODE_LEN));
   	}
     int localIp43501EiErrorMsgNbrCounter = -1;
     public boolean isIp43501EiErrorMsgNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501EiErrorMsgNbrCounter != sharedCounter;
         localIp43501EiErrorMsgNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_EI_ERROR_MSG_NBR_LEN = 4;
	/**
	 * 	serialize this Ip43501EiErrorMsgNbr
	 */
   protected void serializeIp43501EiErrorMsgNbr(char[] ip43501EiErrorMsgNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501EiErrorMsgNbr,0,getStringValue(),beginIp43501EiErrorMsgNbr,IP_43501_EI_ERROR_MSG_NBR_LEN);
       localIp43501EiErrorMsgNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501EiErrorMsgNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp43501EiErrorMsgNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501EiErrorMsgNbr() {	 
   		return (substring(getStringValue(),beginIp43501EiErrorMsgNbr,beginIp43501EiErrorMsgNbr + IP_43501_EI_ERROR_MSG_NBR_LEN));
   	}
 
   
  protected  static final int IP_43501_EI_REPL_TEXT_LEN = 50;
   /**
	 *	serializeIp43501EiReplText as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeIp43501EiReplText(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginIp43501EiReplText + index*IP_43501_EI_REPL_TEXT_LEN)
   	          , IP_43501_EI_REPL_TEXT_LEN 
   	          );
   }
     int localIp43501EiFieldErrorIndCounter = -1;
     public boolean isIp43501EiFieldErrorIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501EiFieldErrorIndCounter != sharedCounter;
         localIp43501EiFieldErrorIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_EI_FIELD_ERROR_IND_LEN = 1;
	/**
	 * 	serialize this Ip43501EiFieldErrorInd
	 */
   protected void serializeIp43501EiFieldErrorInd(char[] ip43501EiFieldErrorInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501EiFieldErrorInd,0,getStringValue(),beginIp43501EiFieldErrorInd,IP_43501_EI_FIELD_ERROR_IND_LEN);
       localIp43501EiFieldErrorIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501EiFieldErrorIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp43501EiFieldErrorInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501EiFieldErrorInd() {	 
   		return (substring(getStringValue(),beginIp43501EiFieldErrorInd,beginIp43501EiFieldErrorInd + IP_43501_EI_FIELD_ERROR_IND_LEN));
   	}
     int localIp43501EiAmtCntAccumIndCounter = -1;
     public boolean isIp43501EiAmtCntAccumIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501EiAmtCntAccumIndCounter != sharedCounter;
         localIp43501EiAmtCntAccumIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_EI_AMT_CNT_ACCUM_IND_LEN = 1;
	/**
	 * 	serialize this Ip43501EiAmtCntAccumInd
	 */
   protected void serializeIp43501EiAmtCntAccumInd(char[] ip43501EiAmtCntAccumInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501EiAmtCntAccumInd,0,getStringValue(),beginIp43501EiAmtCntAccumInd,IP_43501_EI_AMT_CNT_ACCUM_IND_LEN);
       localIp43501EiAmtCntAccumIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501EiAmtCntAccumIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp43501EiAmtCntAccumInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501EiAmtCntAccumInd() {	 
   		return (substring(getStringValue(),beginIp43501EiAmtCntAccumInd,beginIp43501EiAmtCntAccumInd + IP_43501_EI_AMT_CNT_ACCUM_IND_LEN));
   	}
     int localIp43501EiDataLengthCounter = -1;
     public boolean isIp43501EiDataLengthModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501EiDataLengthCounter != sharedCounter;
         localIp43501EiDataLengthCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip43501EiDataLength
	 *	@return ip43501EiDataLength
	 */
	public char[]  getIp43501EiDataLengthString() {
	     return getCharArray(beginIp43501EiDataLength,IP_43501_EI_DATA_LENGTH_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip43501EiDataLengthIsNumeric() {
	    return isNumeric(beginIp43501EiDataLength
	                    ,beginIp43501EiDataLength + IP_43501_EI_DATA_LENGTH_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_43501_EI_DATA_LENGTH_LEN = 4;
  	/**
	 * serializeIp43501EiDataLength
	 */
	protected void serializeIp43501EiDataLength(int ip43501EiDataLength) {
		 putNumber(beginIp43501EiDataLength,ip43501EiDataLength,IP_43501_EI_DATA_LENGTH_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp43501EiDataLengthCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp43501EiDataLength
	 */
   	protected  int serializeIp43501EiDataLength(char[] value) {
	    int  ip43501EiDataLength;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip43501EiDataLength = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp43501EiDataLength
		       ,4
		      );
		 localIp43501EiDataLengthCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip43501EiDataLength;
    }

   protected int checkIp43501EiDataLengthMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp43501EiDataLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp43501EiDataLength() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp43501EiDataLength
			                 ,IP_43501_EI_DATA_LENGTH_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip43501EiDataLength", beginIp43501EiDataLength,IP_43501_EI_DATA_LENGTH_LEN);
    }
   	}

		public int ip43501EiReplTextSize() {
			return IP_43501_EI_REPL_TEXT_SIZE;
		}



}
  
