package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Ip43501FileStatusRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip43501FileStatusRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip43501FileStatusRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_43501_FILE_STATUS_REC_LENGTH = 1358;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp43501FsRecType;
            protected  int beginIp43501FsTransmissionId;
            protected  int beginIp43501FsFileId;
            protected  int beginIp43501FsFileSeqNbr;
            protected  int beginIp43501FsInstitutionId;
            protected  int beginIp43501FsBin;
            protected  int beginIp43501FsCardAcceptor;
            protected  int beginIp43501FsSourceMsgNum;
            protected  int beginIp43501FsFiller;
	
	/**
	* Constructor for Ip43501FileStatusRecSerialized
	**/
    public Ip43501FileStatusRecSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip43501FileStatusRecSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip43501FileStatusRecSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip43501FileStatusRecSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip43501FileStatusRecSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip43501FileStatusRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_43501_FILE_STATUS_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp43501FsRecType = getStartOffset() + 0;	// set offset for serialization
  
             beginIp43501FsTransmissionId = getStartOffset() + 2;	// set offset for serialization
  
             beginIp43501FsFileId = getStartOffset() + 27;	// set offset for serialization
  
             beginIp43501FsFileSeqNbr = getStartOffset() + 52;	// set offset for serialization
  
             beginIp43501FsInstitutionId = getStartOffset() + 55;	// set offset for serialization
  
             beginIp43501FsBin = getStartOffset() + 66;	// set offset for serialization
  
             beginIp43501FsCardAcceptor = getStartOffset() + 72;	// set offset for serialization
  
             beginIp43501FsSourceMsgNum = getStartOffset() + 87;	// set offset for serialization
  
             beginIp43501FsFiller = getStartOffset() + 97;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localIp43501FsRecTypeCounter = -1;
     public boolean isIp43501FsRecTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501FsRecTypeCounter != sharedCounter;
         localIp43501FsRecTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_FS_REC_TYPE_LEN = 2;
	/**
	 * 	serialize this Ip43501FsRecType
	 */
   protected void serializeIp43501FsRecType(char[] ip43501FsRecType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501FsRecType,0,getStringValue(),beginIp43501FsRecType,IP_43501_FS_REC_TYPE_LEN);
       localIp43501FsRecTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501FsRecTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp43501FsRecType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501FsRecType() {	 
   		return (substring(getStringValue(),beginIp43501FsRecType,beginIp43501FsRecType + IP_43501_FS_REC_TYPE_LEN));
   	}
     int localIp43501FsTransmissionIdCounter = -1;
     public boolean isIp43501FsTransmissionIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501FsTransmissionIdCounter != sharedCounter;
         localIp43501FsTransmissionIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_FS_TRANSMISSION_ID_LEN = 25;
	/**
	 * 	serialize this Ip43501FsTransmissionId
	 */
   protected void serializeIp43501FsTransmissionId(char[] ip43501FsTransmissionId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501FsTransmissionId,0,getStringValue(),beginIp43501FsTransmissionId,IP_43501_FS_TRANSMISSION_ID_LEN);
       localIp43501FsTransmissionIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501FsTransmissionIdConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshIp43501FsTransmissionId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501FsTransmissionId() {	 
   		return (substring(getStringValue(),beginIp43501FsTransmissionId,beginIp43501FsTransmissionId + IP_43501_FS_TRANSMISSION_ID_LEN));
   	}
     int localIp43501FsFileIdCounter = -1;
     public boolean isIp43501FsFileIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501FsFileIdCounter != sharedCounter;
         localIp43501FsFileIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_FS_FILE_ID_LEN = 25;
	/**
	 * 	serialize this Ip43501FsFileId
	 */
   protected void serializeIp43501FsFileId(char[] ip43501FsFileId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501FsFileId,0,getStringValue(),beginIp43501FsFileId,IP_43501_FS_FILE_ID_LEN);
       localIp43501FsFileIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501FsFileIdConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshIp43501FsFileId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501FsFileId() {	 
   		return (substring(getStringValue(),beginIp43501FsFileId,beginIp43501FsFileId + IP_43501_FS_FILE_ID_LEN));
   	}
     int localIp43501FsFileSeqNbrCounter = -1;
     public boolean isIp43501FsFileSeqNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501FsFileSeqNbrCounter != sharedCounter;
         localIp43501FsFileSeqNbrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip43501FsFileSeqNbr
	 *	@return ip43501FsFileSeqNbr
	 */
	public char[]  getIp43501FsFileSeqNbrString() {
	     return getCharArray(beginIp43501FsFileSeqNbr,IP_43501_FS_FILE_SEQ_NBR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip43501FsFileSeqNbrIsNumeric() {
	    return isNumeric(beginIp43501FsFileSeqNbr
	                    ,beginIp43501FsFileSeqNbr + IP_43501_FS_FILE_SEQ_NBR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_43501_FS_FILE_SEQ_NBR_LEN = 3;
  	/**
	 * serializeIp43501FsFileSeqNbr
	 */
	protected void serializeIp43501FsFileSeqNbr(int ip43501FsFileSeqNbr) {
		 putNumber(beginIp43501FsFileSeqNbr,ip43501FsFileSeqNbr,IP_43501_FS_FILE_SEQ_NBR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp43501FsFileSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp43501FsFileSeqNbr
	 */
   	protected  int serializeIp43501FsFileSeqNbr(char[] value) {
	    int  ip43501FsFileSeqNbr;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip43501FsFileSeqNbr = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp43501FsFileSeqNbr
		       ,3
		      );
		 localIp43501FsFileSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip43501FsFileSeqNbr;
    }

   protected int checkIp43501FsFileSeqNbrMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp43501FsFileSeqNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp43501FsFileSeqNbr() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp43501FsFileSeqNbr
			                 ,IP_43501_FS_FILE_SEQ_NBR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip43501FsFileSeqNbr", beginIp43501FsFileSeqNbr,IP_43501_FS_FILE_SEQ_NBR_LEN);
    }
   	}
     int localIp43501FsInstitutionIdCounter = -1;
     public boolean isIp43501FsInstitutionIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501FsInstitutionIdCounter != sharedCounter;
         localIp43501FsInstitutionIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip43501FsInstitutionId
	 *	@return ip43501FsInstitutionId
	 */
	public char[]  getIp43501FsInstitutionIdString() {
	     return getCharArray(beginIp43501FsInstitutionId,IP_43501_FS_INSTITUTION_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip43501FsInstitutionIdIsNumeric() {
	    return isNumeric(beginIp43501FsInstitutionId
	                    ,beginIp43501FsInstitutionId + IP_43501_FS_INSTITUTION_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_43501_FS_INSTITUTION_ID_LEN = 11;
  	/**
	 * serializeIp43501FsInstitutionId
	 */
	protected void serializeIp43501FsInstitutionId(long ip43501FsInstitutionId) {
		 putNumber(beginIp43501FsInstitutionId,ip43501FsInstitutionId,IP_43501_FS_INSTITUTION_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp43501FsInstitutionIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp43501FsInstitutionId
	 */
   	protected  long serializeIp43501FsInstitutionId(char[] value) {
	    long  ip43501FsInstitutionId;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip43501FsInstitutionId = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginIp43501FsInstitutionId
		       ,11
		      );
		 localIp43501FsInstitutionIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip43501FsInstitutionId;
    }

   protected long checkIp43501FsInstitutionIdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp43501FsInstitutionId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp43501FsInstitutionId() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp43501FsInstitutionId
			                 ,IP_43501_FS_INSTITUTION_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip43501FsInstitutionId", beginIp43501FsInstitutionId,IP_43501_FS_INSTITUTION_ID_LEN);
    }
   	}
     int localIp43501FsBinCounter = -1;
     public boolean isIp43501FsBinModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501FsBinCounter != sharedCounter;
         localIp43501FsBinCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip43501FsBin
	 *	@return ip43501FsBin
	 */
	public char[]  getIp43501FsBinString() {
	     return getCharArray(beginIp43501FsBin,IP_43501_FS_BIN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip43501FsBinIsNumeric() {
	    return isNumeric(beginIp43501FsBin
	                    ,beginIp43501FsBin + IP_43501_FS_BIN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_43501_FS_BIN_LEN = 6;
  	/**
	 * serializeIp43501FsBin
	 */
	protected void serializeIp43501FsBin(long ip43501FsBin) {
		 putNumber(beginIp43501FsBin,ip43501FsBin,IP_43501_FS_BIN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp43501FsBinCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp43501FsBin
	 */
   	protected  long serializeIp43501FsBin(char[] value) {
	    long  ip43501FsBin;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip43501FsBin = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp43501FsBin
		       ,6
		      );
		 localIp43501FsBinCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip43501FsBin;
    }

   protected long checkIp43501FsBinMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp43501FsBin is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp43501FsBin() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp43501FsBin
			                 ,IP_43501_FS_BIN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip43501FsBin", beginIp43501FsBin,IP_43501_FS_BIN_LEN);
    }
   	}
     int localIp43501FsCardAcceptorCounter = -1;
     public boolean isIp43501FsCardAcceptorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501FsCardAcceptorCounter != sharedCounter;
         localIp43501FsCardAcceptorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_FS_CARD_ACCEPTOR_LEN = 15;
	/**
	 * 	serialize this Ip43501FsCardAcceptor
	 */
   protected void serializeIp43501FsCardAcceptor(char[] ip43501FsCardAcceptor) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501FsCardAcceptor,0,getStringValue(),beginIp43501FsCardAcceptor,IP_43501_FS_CARD_ACCEPTOR_LEN);
       localIp43501FsCardAcceptorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501FsCardAcceptorConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshIp43501FsCardAcceptor is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501FsCardAcceptor() {	 
   		return (substring(getStringValue(),beginIp43501FsCardAcceptor,beginIp43501FsCardAcceptor + IP_43501_FS_CARD_ACCEPTOR_LEN));
   	}
     int localIp43501FsSourceMsgNumCounter = -1;
     public boolean isIp43501FsSourceMsgNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501FsSourceMsgNumCounter != sharedCounter;
         localIp43501FsSourceMsgNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip43501FsSourceMsgNum
	 *	@return ip43501FsSourceMsgNum
	 */
	public char[]  getIp43501FsSourceMsgNumString() {
	     return getCharArray(beginIp43501FsSourceMsgNum,IP_43501_FS_SOURCE_MSG_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip43501FsSourceMsgNumIsNumeric() {
	    return isNumeric(beginIp43501FsSourceMsgNum
	                    ,beginIp43501FsSourceMsgNum + IP_43501_FS_SOURCE_MSG_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_43501_FS_SOURCE_MSG_NUM_LEN = 10;
  	/**
	 * serializeIp43501FsSourceMsgNum
	 */
	protected void serializeIp43501FsSourceMsgNum(long ip43501FsSourceMsgNum) {
		 putNumber(beginIp43501FsSourceMsgNum,ip43501FsSourceMsgNum,IP_43501_FS_SOURCE_MSG_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp43501FsSourceMsgNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp43501FsSourceMsgNum
	 */
   	protected  long serializeIp43501FsSourceMsgNum(char[] value) {
	    long  ip43501FsSourceMsgNum;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip43501FsSourceMsgNum = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginIp43501FsSourceMsgNum
		       ,10
		      );
		 localIp43501FsSourceMsgNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip43501FsSourceMsgNum;
    }

   protected long checkIp43501FsSourceMsgNumMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp43501FsSourceMsgNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp43501FsSourceMsgNum() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp43501FsSourceMsgNum
			                 ,IP_43501_FS_SOURCE_MSG_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip43501FsSourceMsgNum", beginIp43501FsSourceMsgNum,IP_43501_FS_SOURCE_MSG_NUM_LEN);
    }
   	}
     int localIp43501FsFillerCounter = -1;
     public boolean isIp43501FsFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501FsFillerCounter != sharedCounter;
         localIp43501FsFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_FS_FILLER_LEN = 1;
	/**
	 * 	serialize this Ip43501FsFiller
	 */
   protected void serializeIp43501FsFiller(char[] ip43501FsFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501FsFiller,0,getStringValue(),beginIp43501FsFiller,IP_43501_FS_FILLER_LEN);
       localIp43501FsFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501FsFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp43501FsFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501FsFiller() {	 
   		return (substring(getStringValue(),beginIp43501FsFiller,beginIp43501FsFiller + IP_43501_FS_FILLER_LEN));
   	}




}
  
