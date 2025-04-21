package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip32101CptChkKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip32101CptChkKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip32101CptChkKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_32101_CPT_CHK_KEY_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp32101CptGftDasetNam;
            protected  int beginIp32101CptFileSeqNum;
            protected  int beginIp32101CptIndCd;
	
	/**
	* Constructor for Ip32101CptChkKeySerialized
	**/
    public Ip32101CptChkKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip32101CptChkKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101CptChkKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip32101CptChkKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,28); // serialize this field at offset 28 by default 
    }
    
	/**
	* sets parent for this Ip32101CptChkKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 28 by default
    }    
	/**
	* initializes the field in Ip32101CptChkKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_32101_CPT_CHK_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp32101CptGftDasetNam = getStartOffset() + 0;	// set offset for serialization
  
             beginIp32101CptFileSeqNum = getStartOffset() + 44;	// set offset for serialization
  
             beginIp32101CptIndCd = getStartOffset() + 49;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp32101CptGftDasetNamCounter = -1;
     public boolean isIp32101CptGftDasetNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101CptGftDasetNamCounter != sharedCounter;
         localIp32101CptGftDasetNamCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_32101_CPT_GFT_DASET_NAM_LEN = 44;
	/**
	 * 	serialize this Ip32101CptGftDasetNam
	 */
   protected void serializeIp32101CptGftDasetNam(char[] ip32101CptGftDasetNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip32101CptGftDasetNam,0,getStringValue(),beginIp32101CptGftDasetNam,IP_32101_CPT_GFT_DASET_NAM_LEN);
       localIp32101CptGftDasetNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp32101CptGftDasetNamConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshIp32101CptGftDasetNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp32101CptGftDasetNam() {	 
   		return (substring(getStringValue(),beginIp32101CptGftDasetNam,beginIp32101CptGftDasetNam + IP_32101_CPT_GFT_DASET_NAM_LEN));
   	}
     int localIp32101CptFileSeqNumCounter = -1;
     public boolean isIp32101CptFileSeqNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101CptFileSeqNumCounter != sharedCounter;
         localIp32101CptFileSeqNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip32101CptFileSeqNum
	 *	@return ip32101CptFileSeqNum
	 */
	public char[]  getIp32101CptFileSeqNumString() {
	     return getCharArray(beginIp32101CptFileSeqNum,IP_32101_CPT_FILE_SEQ_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip32101CptFileSeqNumIsNumeric() {
	    return isNumeric(beginIp32101CptFileSeqNum
	                    ,beginIp32101CptFileSeqNum + IP_32101_CPT_FILE_SEQ_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_32101_CPT_FILE_SEQ_NUM_LEN = 5;
  	/**
	 * serializeIp32101CptFileSeqNum
	 */
	protected void serializeIp32101CptFileSeqNum(long ip32101CptFileSeqNum) {
		 putNumber(beginIp32101CptFileSeqNum,ip32101CptFileSeqNum,IP_32101_CPT_FILE_SEQ_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp32101CptFileSeqNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp32101CptFileSeqNum
	 */
   	protected  long serializeIp32101CptFileSeqNum(char[] value) {
	    long  ip32101CptFileSeqNum;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip32101CptFileSeqNum = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIp32101CptFileSeqNum
		       ,5
		      );
		 localIp32101CptFileSeqNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip32101CptFileSeqNum;
    }

   protected long checkIp32101CptFileSeqNumMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp32101CptFileSeqNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp32101CptFileSeqNum() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp32101CptFileSeqNum
			                 ,IP_32101_CPT_FILE_SEQ_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip32101CptFileSeqNum", beginIp32101CptFileSeqNum,IP_32101_CPT_FILE_SEQ_NUM_LEN);
    }
   	}
     int localIp32101CptIndCdCounter = -1;
     public boolean isIp32101CptIndCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101CptIndCdCounter != sharedCounter;
         localIp32101CptIndCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_32101_CPT_IND_CD_LEN = 1;
	/**
	 * 	serialize this Ip32101CptIndCd
	 */
   protected void serializeIp32101CptIndCd(char[] ip32101CptIndCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip32101CptIndCd,0,getStringValue(),beginIp32101CptIndCd,IP_32101_CPT_IND_CD_LEN);
       localIp32101CptIndCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp32101CptIndCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp32101CptIndCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp32101CptIndCd() {	 
   		return (substring(getStringValue(),beginIp32101CptIndCd,beginIp32101CptIndCd + IP_32101_CPT_IND_CD_LEN));
   	}




}
  
