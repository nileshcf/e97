package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip40004IntMsgHdrRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip40004IntMsgHdrRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip40004IntMsgHdrRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_40004_INT_MSG_HDR_REC_LENGTH = 28000;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp40004FileRecType;
            protected  int beginIp40004FileSeqNbr;
            protected  int beginIp40004FileStatus;
            protected  int beginIp40004RejectStatus;
            protected  int beginIp40004ActualCount;
            protected  int beginIp40004ActualAmount;
            protected  int beginIp40004TrailerCount;
            protected  int beginIp40004TrailerAmount;
           protected int beginIp40004FileErrors;
           protected static final int IP_40004_FILE_ERRORS_SIZE = 10;
            protected  int beginIp40004FileData;
            protected  int beginIp40004TrlrData;
            protected  int beginIp40004TrlrDataLen;
            protected  int beginIp40004SourceMsgNbr;
	
	/**
	* Constructor for Ip40004IntMsgHdrRecSerialized
	**/
    public Ip40004IntMsgHdrRecSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip40004IntMsgHdrRecSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004IntMsgHdrRecSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip40004IntMsgHdrRecSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip40004IntMsgHdrRecSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip40004IntMsgHdrRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_40004_INT_MSG_HDR_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp40004FileRecType = getStartOffset() + 0;	// set offset for serialization
  
             beginIp40004FileSeqNbr = getStartOffset() + 1;	// set offset for serialization
  
  
  
             beginIp40004FileStatus = getStartOffset() + 54;	// set offset for serialization
  
             beginIp40004RejectStatus = getStartOffset() + 55;	// set offset for serialization
  
             beginIp40004ActualCount = getStartOffset() + 56;	// set offset for serialization
  
             beginIp40004ActualAmount = getStartOffset() + 66;	// set offset for serialization
  
             beginIp40004TrailerCount = getStartOffset() + 82;	// set offset for serialization
  
             beginIp40004TrailerAmount = getStartOffset() + 92;	// set offset for serialization
  
	        beginIp40004FileErrors = getStartOffset() + 108; // set offset for serialization
  
             beginIp40004FileData = getStartOffset() + 1818;	// set offset for serialization
  
             beginIp40004TrlrData = getStartOffset() + 2018;	// set offset for serialization
  
             beginIp40004TrlrDataLen = getStartOffset() + 2318;	// set offset for serialization
  
             beginIp40004SourceMsgNbr = getStartOffset() + 2322;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp40004FileRecTypeCounter = -1;
     public boolean isIp40004FileRecTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004FileRecTypeCounter != sharedCounter;
         localIp40004FileRecTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_FILE_REC_TYPE_LEN = 1;
	/**
	 * 	serialize this Ip40004FileRecType
	 */
   protected void serializeIp40004FileRecType(char[] ip40004FileRecType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004FileRecType,0,getStringValue(),beginIp40004FileRecType,IP_40004_FILE_REC_TYPE_LEN);
       localIp40004FileRecTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004FileRecTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp40004FileRecType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004FileRecType() {	 
   		return (substring(getStringValue(),beginIp40004FileRecType,beginIp40004FileRecType + IP_40004_FILE_REC_TYPE_LEN));
   	}
     int localIp40004FileSeqNbrCounter = -1;
     public boolean isIp40004FileSeqNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004FileSeqNbrCounter != sharedCounter;
         localIp40004FileSeqNbrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004FileSeqNbr
	 *	@return ip40004FileSeqNbr
	 */
	public char[]  getIp40004FileSeqNbrString() {
	     return getCharArray(beginIp40004FileSeqNbr,IP_40004_FILE_SEQ_NBR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004FileSeqNbrIsNumeric() {
	    return isNumeric(beginIp40004FileSeqNbr
	                    ,beginIp40004FileSeqNbr + IP_40004_FILE_SEQ_NBR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_FILE_SEQ_NBR_LEN = 3;
  	/**
	 * serializeIp40004FileSeqNbr
	 */
	protected void serializeIp40004FileSeqNbr(int ip40004FileSeqNbr) {
		 putNumber(beginIp40004FileSeqNbr,ip40004FileSeqNbr,IP_40004_FILE_SEQ_NBR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004FileSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004FileSeqNbr
	 */
   	protected  int serializeIp40004FileSeqNbr(char[] value) {
	    int  ip40004FileSeqNbr;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004FileSeqNbr = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp40004FileSeqNbr
		       ,3
		      );
		 localIp40004FileSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004FileSeqNbr;
    }

   protected int checkIp40004FileSeqNbrMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004FileSeqNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp40004FileSeqNbr() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp40004FileSeqNbr
			                 ,IP_40004_FILE_SEQ_NBR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004FileSeqNbr", beginIp40004FileSeqNbr,IP_40004_FILE_SEQ_NBR_LEN);
    }
   	}
     int localIp40004FileStatusCounter = -1;
     public boolean isIp40004FileStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004FileStatusCounter != sharedCounter;
         localIp40004FileStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_FILE_STATUS_LEN = 1;
	/**
	 * 	serialize this Ip40004FileStatus
	 */
   protected void serializeIp40004FileStatus(char[] ip40004FileStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004FileStatus,0,getStringValue(),beginIp40004FileStatus,IP_40004_FILE_STATUS_LEN);
       localIp40004FileStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004FileStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp40004FileStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004FileStatus() {	 
   		return (substring(getStringValue(),beginIp40004FileStatus,beginIp40004FileStatus + IP_40004_FILE_STATUS_LEN));
   	}
     int localIp40004RejectStatusCounter = -1;
     public boolean isIp40004RejectStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004RejectStatusCounter != sharedCounter;
         localIp40004RejectStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_REJECT_STATUS_LEN = 1;
	/**
	 * 	serialize this Ip40004RejectStatus
	 */
   protected void serializeIp40004RejectStatus(char[] ip40004RejectStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004RejectStatus,0,getStringValue(),beginIp40004RejectStatus,IP_40004_REJECT_STATUS_LEN);
       localIp40004RejectStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004RejectStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp40004RejectStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004RejectStatus() {	 
   		return (substring(getStringValue(),beginIp40004RejectStatus,beginIp40004RejectStatus + IP_40004_REJECT_STATUS_LEN));
   	}
     int localIp40004ActualCountCounter = -1;
     public boolean isIp40004ActualCountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004ActualCountCounter != sharedCounter;
         localIp40004ActualCountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004ActualCount
	 *	@return ip40004ActualCount
	 */
	public char[]  getIp40004ActualCountString() {
	     return getCharArray(beginIp40004ActualCount,IP_40004_ACTUAL_COUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004ActualCountIsNumeric() {
	    return isNumeric(beginIp40004ActualCount
	                    ,beginIp40004ActualCount + IP_40004_ACTUAL_COUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_ACTUAL_COUNT_LEN = 10;
  	/**
	 * serializeIp40004ActualCount
	 */
	protected void serializeIp40004ActualCount(long ip40004ActualCount) {
		 putNumber(beginIp40004ActualCount,ip40004ActualCount,IP_40004_ACTUAL_COUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004ActualCountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004ActualCount
	 */
   	protected  long serializeIp40004ActualCount(char[] value) {
	    long  ip40004ActualCount;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004ActualCount = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginIp40004ActualCount
		       ,10
		      );
		 localIp40004ActualCountCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004ActualCount;
    }

   protected long checkIp40004ActualCountMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004ActualCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp40004ActualCount() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp40004ActualCount
			                 ,IP_40004_ACTUAL_COUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004ActualCount", beginIp40004ActualCount,IP_40004_ACTUAL_COUNT_LEN);
    }
   	}
     int localIp40004ActualAmountCounter = -1;
     public boolean isIp40004ActualAmountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004ActualAmountCounter != sharedCounter;
         localIp40004ActualAmountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004ActualAmount
	 *	@return ip40004ActualAmount
	 */
	public char[]  getIp40004ActualAmountString() {
	     return getCharArray(beginIp40004ActualAmount,IP_40004_ACTUAL_AMOUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004ActualAmountIsNumeric() {
	    return isNumeric(beginIp40004ActualAmount
	                    ,beginIp40004ActualAmount + IP_40004_ACTUAL_AMOUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_ACTUAL_AMOUNT_LEN = 16;
  	/**
	 * serializeIp40004ActualAmount
	 */
	protected void serializeIp40004ActualAmount(long ip40004ActualAmount) {
		 putNumber(beginIp40004ActualAmount,ip40004ActualAmount,IP_40004_ACTUAL_AMOUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004ActualAmountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004ActualAmount
	 */
   	protected  long serializeIp40004ActualAmount(char[] value) {
	    long  ip40004ActualAmount;
	    if(value.length >0 && value.length!= 16)
            value = new String(value).trim().toCharArray();
	    if (value.length < 16) value = pad(16, value, ' ', LEFT_PAD);
	    else if (value.length > 16) value = substring(value,0,16);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004ActualAmount = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(16,value,false/*isSigned?*/)
		       ,beginIp40004ActualAmount
		       ,16
		      );
		 localIp40004ActualAmountCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004ActualAmount;
    }

   protected long checkIp40004ActualAmountMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10P/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004ActualAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp40004ActualAmount() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp40004ActualAmount
			                 ,IP_40004_ACTUAL_AMOUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004ActualAmount", beginIp40004ActualAmount,IP_40004_ACTUAL_AMOUNT_LEN);
    }
   	}
     int localIp40004TrailerCountCounter = -1;
     public boolean isIp40004TrailerCountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004TrailerCountCounter != sharedCounter;
         localIp40004TrailerCountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004TrailerCount
	 *	@return ip40004TrailerCount
	 */
	public char[]  getIp40004TrailerCountString() {
	     return getCharArray(beginIp40004TrailerCount,IP_40004_TRAILER_COUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004TrailerCountIsNumeric() {
	    return isNumeric(beginIp40004TrailerCount
	                    ,beginIp40004TrailerCount + IP_40004_TRAILER_COUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_TRAILER_COUNT_LEN = 10;
  	/**
	 * serializeIp40004TrailerCount
	 */
	protected void serializeIp40004TrailerCount(long ip40004TrailerCount) {
		 putNumber(beginIp40004TrailerCount,ip40004TrailerCount,IP_40004_TRAILER_COUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004TrailerCountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004TrailerCount
	 */
   	protected  long serializeIp40004TrailerCount(char[] value) {
	    long  ip40004TrailerCount;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004TrailerCount = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginIp40004TrailerCount
		       ,10
		      );
		 localIp40004TrailerCountCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004TrailerCount;
    }

   protected long checkIp40004TrailerCountMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004TrailerCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp40004TrailerCount() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp40004TrailerCount
			                 ,IP_40004_TRAILER_COUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004TrailerCount", beginIp40004TrailerCount,IP_40004_TRAILER_COUNT_LEN);
    }
   	}
     int localIp40004TrailerAmountCounter = -1;
     public boolean isIp40004TrailerAmountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004TrailerAmountCounter != sharedCounter;
         localIp40004TrailerAmountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004TrailerAmount
	 *	@return ip40004TrailerAmount
	 */
	public char[]  getIp40004TrailerAmountString() {
	     return getCharArray(beginIp40004TrailerAmount,IP_40004_TRAILER_AMOUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004TrailerAmountIsNumeric() {
	    return isNumeric(beginIp40004TrailerAmount
	                    ,beginIp40004TrailerAmount + IP_40004_TRAILER_AMOUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_TRAILER_AMOUNT_LEN = 16;
  	/**
	 * serializeIp40004TrailerAmount
	 */
	protected void serializeIp40004TrailerAmount(long ip40004TrailerAmount) {
		 putNumber(beginIp40004TrailerAmount,ip40004TrailerAmount,IP_40004_TRAILER_AMOUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004TrailerAmountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004TrailerAmount
	 */
   	protected  long serializeIp40004TrailerAmount(char[] value) {
	    long  ip40004TrailerAmount;
	    if(value.length >0 && value.length!= 16)
            value = new String(value).trim().toCharArray();
	    if (value.length < 16) value = pad(16, value, ' ', LEFT_PAD);
	    else if (value.length > 16) value = substring(value,0,16);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004TrailerAmount = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(16,value,false/*isSigned?*/)
		       ,beginIp40004TrailerAmount
		       ,16
		      );
		 localIp40004TrailerAmountCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004TrailerAmount;
    }

   protected long checkIp40004TrailerAmountMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10P/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004TrailerAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp40004TrailerAmount() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp40004TrailerAmount
			                 ,IP_40004_TRAILER_AMOUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004TrailerAmount", beginIp40004TrailerAmount,IP_40004_TRAILER_AMOUNT_LEN);
    }
   	}
     int localIp40004FileDataCounter = -1;
     public boolean isIp40004FileDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004FileDataCounter != sharedCounter;
         localIp40004FileDataCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_FILE_DATA_LEN = 200;
	/**
	 * 	serialize this Ip40004FileData
	 */
   protected void serializeIp40004FileData(char[] ip40004FileData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004FileData,0,getStringValue(),beginIp40004FileData,IP_40004_FILE_DATA_LEN);
       localIp40004FileDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004FileDataConstraints(char[] value) {
   			return super.checkConstraints(value , 200 ,false, false);
   }
    /**
	 *	refreshIp40004FileData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004FileData() {	 
   		return (substring(getStringValue(),beginIp40004FileData,beginIp40004FileData + IP_40004_FILE_DATA_LEN));
   	}
     int localIp40004TrlrDataCounter = -1;
     public boolean isIp40004TrlrDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004TrlrDataCounter != sharedCounter;
         localIp40004TrlrDataCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_TRLR_DATA_LEN = 300;
	/**
	 * 	serialize this Ip40004TrlrData
	 */
   protected void serializeIp40004TrlrData(char[] ip40004TrlrData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004TrlrData,0,getStringValue(),beginIp40004TrlrData,IP_40004_TRLR_DATA_LEN);
       localIp40004TrlrDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004TrlrDataConstraints(char[] value) {
   			return super.checkConstraints(value , 300 ,false, false);
   }
    /**
	 *	refreshIp40004TrlrData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004TrlrData() {	 
   		return (substring(getStringValue(),beginIp40004TrlrData,beginIp40004TrlrData + IP_40004_TRLR_DATA_LEN));
   	}
         int localIp40004TrlrDataLenCounter = -1;
         public boolean isIp40004TrlrDataLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp40004TrlrDataLenCounter != sharedCounter;
            localIp40004TrlrDataLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_40004_TRLR_DATA_LEN_LEN = 4;
  	/**
	 * serializeIp40004TrlrDataLen
	 */
	protected void serializeIp40004TrlrDataLen(long ip40004TrlrDataLen) {
           replaceValue( //  save the value as string
                   getBinaryString( ip40004TrlrDataLen,IP_40004_TRLR_DATA_LEN_LEN)
                  ,beginIp40004TrlrDataLen
                  ,IP_40004_TRLR_DATA_LEN_LEN
                 );
            localIp40004TrlrDataLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp40004TrlrDataLenMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp40004TrlrDataLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp40004TrlrDataLen() {	 
			return (getUnsignedInt(beginIp40004TrlrDataLen));
   	}
     int localIp40004SourceMsgNbrCounter = -1;
     public boolean isIp40004SourceMsgNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004SourceMsgNbrCounter != sharedCounter;
         localIp40004SourceMsgNbrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004SourceMsgNbr
	 *	@return ip40004SourceMsgNbr
	 */
	public char[]  getIp40004SourceMsgNbrString() {
	     return getCharArray(beginIp40004SourceMsgNbr,IP_40004_SOURCE_MSG_NBR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004SourceMsgNbrIsNumeric() {
	    return isNumeric(beginIp40004SourceMsgNbr
	                    ,beginIp40004SourceMsgNbr + IP_40004_SOURCE_MSG_NBR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_SOURCE_MSG_NBR_LEN = 8;
  	/**
	 * serializeIp40004SourceMsgNbr
	 */
	protected void serializeIp40004SourceMsgNbr(long ip40004SourceMsgNbr) {
		 putNumber(beginIp40004SourceMsgNbr,ip40004SourceMsgNbr,IP_40004_SOURCE_MSG_NBR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004SourceMsgNbrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004SourceMsgNbr
	 */
   	protected  long serializeIp40004SourceMsgNbr(char[] value) {
	    long  ip40004SourceMsgNbr;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004SourceMsgNbr = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginIp40004SourceMsgNbr
		       ,8
		      );
		 localIp40004SourceMsgNbrCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004SourceMsgNbr;
    }

   protected long checkIp40004SourceMsgNbrMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004SourceMsgNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp40004SourceMsgNbr() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp40004SourceMsgNbr
			                 ,IP_40004_SOURCE_MSG_NBR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004SourceMsgNbr", beginIp40004SourceMsgNbr,IP_40004_SOURCE_MSG_NBR_LEN);
    }
   	}

		public int ip40004FileErrorsSize() {
			return IP_40004_FILE_ERRORS_SIZE;
		}



}
  
