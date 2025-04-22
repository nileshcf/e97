package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip40004MsgDataxSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip40004MsgDataxSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip40004MsgDataxSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_40004_MSG_DATAX_LENGTH = 613;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp40004RecType;
            protected  int beginIp40004DtlFileSeqNbr;
            protected  int beginIp40004CollOnlyInd;
            protected  int beginIp40004SourceMsgNum;
            protected  int beginIp40004TransAmount;
            protected  int beginIp40004TransDbCrInd;
            protected  int beginIp40004ErrorMsgNbr;
	
	/**
	* Constructor for Ip40004MsgDataxSerialized
	**/
    public Ip40004MsgDataxSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip40004MsgDataxSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004MsgDataxSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip40004MsgDataxSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip40004MsgDataxSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip40004MsgDataxSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_40004_MSG_DATAX_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp40004RecType = getStartOffset() + 0;	// set offset for serialization
  
             beginIp40004DtlFileSeqNbr = getStartOffset() + 1;	// set offset for serialization
  
             beginIp40004CollOnlyInd = getStartOffset() + 4;	// set offset for serialization
  
             beginIp40004SourceMsgNum = getStartOffset() + 5;	// set offset for serialization
  
             beginIp40004TransAmount = getStartOffset() + 13;	// set offset for serialization
  
             beginIp40004TransDbCrInd = getStartOffset() + 29;	// set offset for serialization
  
             beginIp40004ErrorMsgNbr = getStartOffset() + 31;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp40004RecTypeCounter = -1;
     public boolean isIp40004RecTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004RecTypeCounter != sharedCounter;
         localIp40004RecTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_REC_TYPE_LEN = 1;
	/**
	 * 	serialize this Ip40004RecType
	 */
   protected void serializeIp40004RecType(char[] ip40004RecType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004RecType,0,getStringValue(),beginIp40004RecType,IP_40004_REC_TYPE_LEN);
       localIp40004RecTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004RecTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp40004RecType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004RecType() {	 
   		return (substring(getStringValue(),beginIp40004RecType,beginIp40004RecType + IP_40004_REC_TYPE_LEN));
   	}
     int localIp40004DtlFileSeqNbrCounter = -1;
     public boolean isIp40004DtlFileSeqNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004DtlFileSeqNbrCounter != sharedCounter;
         localIp40004DtlFileSeqNbrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004DtlFileSeqNbr
	 *	@return ip40004DtlFileSeqNbr
	 */
	public char[]  getIp40004DtlFileSeqNbrString() {
	     return getCharArray(beginIp40004DtlFileSeqNbr,IP_40004_DTL_FILE_SEQ_NBR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004DtlFileSeqNbrIsNumeric() {
	    return isNumeric(beginIp40004DtlFileSeqNbr
	                    ,beginIp40004DtlFileSeqNbr + IP_40004_DTL_FILE_SEQ_NBR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_DTL_FILE_SEQ_NBR_LEN = 3;
  	/**
	 * serializeIp40004DtlFileSeqNbr
	 */
	protected void serializeIp40004DtlFileSeqNbr(int ip40004DtlFileSeqNbr) {
		 putNumber(beginIp40004DtlFileSeqNbr,ip40004DtlFileSeqNbr,IP_40004_DTL_FILE_SEQ_NBR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004DtlFileSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004DtlFileSeqNbr
	 */
   	protected  int serializeIp40004DtlFileSeqNbr(char[] value) {
	    int  ip40004DtlFileSeqNbr;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004DtlFileSeqNbr = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp40004DtlFileSeqNbr
		       ,3
		      );
		 localIp40004DtlFileSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004DtlFileSeqNbr;
    }

   protected int checkIp40004DtlFileSeqNbrMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004DtlFileSeqNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp40004DtlFileSeqNbr() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp40004DtlFileSeqNbr
			                 ,IP_40004_DTL_FILE_SEQ_NBR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004DtlFileSeqNbr", beginIp40004DtlFileSeqNbr,IP_40004_DTL_FILE_SEQ_NBR_LEN);
    }
   	}
     int localIp40004CollOnlyIndCounter = -1;
     public boolean isIp40004CollOnlyIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004CollOnlyIndCounter != sharedCounter;
         localIp40004CollOnlyIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_COLL_ONLY_IND_LEN = 1;
	/**
	 * 	serialize this Ip40004CollOnlyInd
	 */
   protected void serializeIp40004CollOnlyInd(char[] ip40004CollOnlyInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004CollOnlyInd,0,getStringValue(),beginIp40004CollOnlyInd,IP_40004_COLL_ONLY_IND_LEN);
       localIp40004CollOnlyIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004CollOnlyIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp40004CollOnlyInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004CollOnlyInd() {	 
   		return (substring(getStringValue(),beginIp40004CollOnlyInd,beginIp40004CollOnlyInd + IP_40004_COLL_ONLY_IND_LEN));
   	}
     int localIp40004SourceMsgNumCounter = -1;
     public boolean isIp40004SourceMsgNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004SourceMsgNumCounter != sharedCounter;
         localIp40004SourceMsgNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004SourceMsgNum
	 *	@return ip40004SourceMsgNum
	 */
	public char[]  getIp40004SourceMsgNumString() {
	     return getCharArray(beginIp40004SourceMsgNum,IP_40004_SOURCE_MSG_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004SourceMsgNumIsNumeric() {
	    return isNumeric(beginIp40004SourceMsgNum
	                    ,beginIp40004SourceMsgNum + IP_40004_SOURCE_MSG_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_SOURCE_MSG_NUM_LEN = 8;
  	/**
	 * serializeIp40004SourceMsgNum
	 */
	protected void serializeIp40004SourceMsgNum(long ip40004SourceMsgNum) {
		 putNumber(beginIp40004SourceMsgNum,ip40004SourceMsgNum,IP_40004_SOURCE_MSG_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004SourceMsgNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004SourceMsgNum
	 */
   	protected  long serializeIp40004SourceMsgNum(char[] value) {
	    long  ip40004SourceMsgNum;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004SourceMsgNum = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginIp40004SourceMsgNum
		       ,8
		      );
		 localIp40004SourceMsgNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004SourceMsgNum;
    }

   protected long checkIp40004SourceMsgNumMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004SourceMsgNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp40004SourceMsgNum() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp40004SourceMsgNum
			                 ,IP_40004_SOURCE_MSG_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004SourceMsgNum", beginIp40004SourceMsgNum,IP_40004_SOURCE_MSG_NUM_LEN);
    }
   	}
     int localIp40004TransAmountCounter = -1;
     public boolean isIp40004TransAmountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004TransAmountCounter != sharedCounter;
         localIp40004TransAmountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004TransAmount
	 *	@return ip40004TransAmount
	 */
	public char[]  getIp40004TransAmountString() {
	     return getCharArray(beginIp40004TransAmount,IP_40004_TRANS_AMOUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004TransAmountIsNumeric() {
	    return isNumeric(beginIp40004TransAmount
	                    ,beginIp40004TransAmount + IP_40004_TRANS_AMOUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_TRANS_AMOUNT_LEN = 16;
  	/**
	 * serializeIp40004TransAmount
	 */
	protected void serializeIp40004TransAmount(long ip40004TransAmount) {
		 putNumber(beginIp40004TransAmount,ip40004TransAmount,IP_40004_TRANS_AMOUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004TransAmountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004TransAmount
	 */
   	protected  long serializeIp40004TransAmount(char[] value) {
	    long  ip40004TransAmount;
	    if(value.length >0 && value.length!= 16)
            value = new String(value).trim().toCharArray();
	    if (value.length < 16) value = pad(16, value, ' ', LEFT_PAD);
	    else if (value.length > 16) value = substring(value,0,16);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004TransAmount = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(16,value,false/*isSigned?*/)
		       ,beginIp40004TransAmount
		       ,16
		      );
		 localIp40004TransAmountCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004TransAmount;
    }

   protected long checkIp40004TransAmountMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10P/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004TransAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp40004TransAmount() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp40004TransAmount
			                 ,IP_40004_TRANS_AMOUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004TransAmount", beginIp40004TransAmount,IP_40004_TRANS_AMOUNT_LEN);
    }
   	}
     int localIp40004TransDbCrIndCounter = -1;
     public boolean isIp40004TransDbCrIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004TransDbCrIndCounter != sharedCounter;
         localIp40004TransDbCrIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_TRANS_DB_CR_IND_LEN = 2;
	/**
	 * 	serialize this Ip40004TransDbCrInd
	 */
   protected void serializeIp40004TransDbCrInd(char[] ip40004TransDbCrInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004TransDbCrInd,0,getStringValue(),beginIp40004TransDbCrInd,IP_40004_TRANS_DB_CR_IND_LEN);
       localIp40004TransDbCrIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004TransDbCrIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp40004TransDbCrInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004TransDbCrInd() {	 
   		return (substring(getStringValue(),beginIp40004TransDbCrInd,beginIp40004TransDbCrInd + IP_40004_TRANS_DB_CR_IND_LEN));
   	}
     int localIp40004ErrorMsgNbrCounter = -1;
     public boolean isIp40004ErrorMsgNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004ErrorMsgNbrCounter != sharedCounter;
         localIp40004ErrorMsgNbrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004ErrorMsgNbr
	 *	@return ip40004ErrorMsgNbr
	 */
	public char[]  getIp40004ErrorMsgNbrString() {
	     return getCharArray(beginIp40004ErrorMsgNbr,IP_40004_ERROR_MSG_NBR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004ErrorMsgNbrIsNumeric() {
	    return isNumeric(beginIp40004ErrorMsgNbr
	                    ,beginIp40004ErrorMsgNbr + IP_40004_ERROR_MSG_NBR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_ERROR_MSG_NBR_LEN = 4;
  	/**
	 * serializeIp40004ErrorMsgNbr
	 */
	protected void serializeIp40004ErrorMsgNbr(int ip40004ErrorMsgNbr) {
		 putNumber(beginIp40004ErrorMsgNbr,ip40004ErrorMsgNbr,IP_40004_ERROR_MSG_NBR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004ErrorMsgNbrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004ErrorMsgNbr
	 */
   	protected  int serializeIp40004ErrorMsgNbr(char[] value) {
	    int  ip40004ErrorMsgNbr;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004ErrorMsgNbr = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp40004ErrorMsgNbr
		       ,4
		      );
		 localIp40004ErrorMsgNbrCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004ErrorMsgNbr;
    }

   protected int checkIp40004ErrorMsgNbrMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004ErrorMsgNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp40004ErrorMsgNbr() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp40004ErrorMsgNbr
			                 ,IP_40004_ERROR_MSG_NBR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004ErrorMsgNbr", beginIp40004ErrorMsgNbr,IP_40004_ERROR_MSG_NBR_LEN);
    }
   	}




}
  
