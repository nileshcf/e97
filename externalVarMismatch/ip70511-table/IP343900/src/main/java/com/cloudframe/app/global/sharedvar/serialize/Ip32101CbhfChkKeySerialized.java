package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip32101CbhfChkKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip32101CbhfChkKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip32101CbhfChkKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_32101_CBHF_CHK_KEY_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp32101CbhfGftDasetNam;
            protected  int beginIp32101CbhfFileSeqNum;
            protected  int beginIp32101CbhfIndCd;
	
	/**
	* Constructor for Ip32101CbhfChkKeySerialized
	**/
    public Ip32101CbhfChkKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip32101CbhfChkKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101CbhfChkKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip32101CbhfChkKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,28); // serialize this field at offset 28 by default 
    }
    
	/**
	* sets parent for this Ip32101CbhfChkKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 28 by default
    }    
	/**
	* initializes the field in Ip32101CbhfChkKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_32101_CBHF_CHK_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp32101CbhfGftDasetNam = getStartOffset() + 0;	// set offset for serialization
  
             beginIp32101CbhfFileSeqNum = getStartOffset() + 44;	// set offset for serialization
  
             beginIp32101CbhfIndCd = getStartOffset() + 49;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp32101CbhfGftDasetNamCounter = -1;
     public boolean isIp32101CbhfGftDasetNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101CbhfGftDasetNamCounter != sharedCounter;
         localIp32101CbhfGftDasetNamCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_32101_CBHF_GFT_DASET_NAM_LEN = 44;
	/**
	 * 	serialize this Ip32101CbhfGftDasetNam
	 */
   protected void serializeIp32101CbhfGftDasetNam(char[] ip32101CbhfGftDasetNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip32101CbhfGftDasetNam,0,getStringValue(),beginIp32101CbhfGftDasetNam,IP_32101_CBHF_GFT_DASET_NAM_LEN);
       localIp32101CbhfGftDasetNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp32101CbhfGftDasetNamConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshIp32101CbhfGftDasetNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp32101CbhfGftDasetNam() {	 
   		return (substring(getStringValue(),beginIp32101CbhfGftDasetNam,beginIp32101CbhfGftDasetNam + IP_32101_CBHF_GFT_DASET_NAM_LEN));
   	}
     int localIp32101CbhfFileSeqNumCounter = -1;
     public boolean isIp32101CbhfFileSeqNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101CbhfFileSeqNumCounter != sharedCounter;
         localIp32101CbhfFileSeqNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip32101CbhfFileSeqNum
	 *	@return ip32101CbhfFileSeqNum
	 */
	public char[]  getIp32101CbhfFileSeqNumString() {
	     return getCharArray(beginIp32101CbhfFileSeqNum,IP_32101_CBHF_FILE_SEQ_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip32101CbhfFileSeqNumIsNumeric() {
	    return isNumeric(beginIp32101CbhfFileSeqNum
	                    ,beginIp32101CbhfFileSeqNum + IP_32101_CBHF_FILE_SEQ_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_32101_CBHF_FILE_SEQ_NUM_LEN = 5;
  	/**
	 * serializeIp32101CbhfFileSeqNum
	 */
	protected void serializeIp32101CbhfFileSeqNum(long ip32101CbhfFileSeqNum) {
		 putNumber(beginIp32101CbhfFileSeqNum,ip32101CbhfFileSeqNum,IP_32101_CBHF_FILE_SEQ_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp32101CbhfFileSeqNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp32101CbhfFileSeqNum
	 */
   	protected  long serializeIp32101CbhfFileSeqNum(char[] value) {
	    long  ip32101CbhfFileSeqNum;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip32101CbhfFileSeqNum = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIp32101CbhfFileSeqNum
		       ,5
		      );
		 localIp32101CbhfFileSeqNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip32101CbhfFileSeqNum;
    }

   protected long checkIp32101CbhfFileSeqNumMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp32101CbhfFileSeqNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp32101CbhfFileSeqNum() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp32101CbhfFileSeqNum
			                 ,IP_32101_CBHF_FILE_SEQ_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip32101CbhfFileSeqNum", beginIp32101CbhfFileSeqNum,IP_32101_CBHF_FILE_SEQ_NUM_LEN);
    }
   	}
     int localIp32101CbhfIndCdCounter = -1;
     public boolean isIp32101CbhfIndCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101CbhfIndCdCounter != sharedCounter;
         localIp32101CbhfIndCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_32101_CBHF_IND_CD_LEN = 1;
	/**
	 * 	serialize this Ip32101CbhfIndCd
	 */
   protected void serializeIp32101CbhfIndCd(char[] ip32101CbhfIndCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip32101CbhfIndCd,0,getStringValue(),beginIp32101CbhfIndCd,IP_32101_CBHF_IND_CD_LEN);
       localIp32101CbhfIndCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp32101CbhfIndCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp32101CbhfIndCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp32101CbhfIndCd() {	 
   		return (substring(getStringValue(),beginIp32101CbhfIndCd,beginIp32101CbhfIndCd + IP_32101_CBHF_IND_CD_LEN));
   	}




}
  
