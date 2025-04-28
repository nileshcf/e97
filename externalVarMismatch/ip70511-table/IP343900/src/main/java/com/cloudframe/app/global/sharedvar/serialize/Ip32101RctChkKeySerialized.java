package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip32101RctChkKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip32101RctChkKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip32101RctChkKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_32101_RCT_CHK_KEY_LENGTH = 49;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp32101RctGftDasetNam;
            protected  int beginIp32101RctSeqNum;
	
	/**
	* Constructor for Ip32101RctChkKeySerialized
	**/
    public Ip32101RctChkKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip32101RctChkKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101RctChkKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip32101RctChkKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,28); // serialize this field at offset 28 by default 
    }
    
	/**
	* sets parent for this Ip32101RctChkKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 28 by default
    }    
	/**
	* initializes the field in Ip32101RctChkKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_32101_RCT_CHK_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp32101RctGftDasetNam = getStartOffset() + 0;	// set offset for serialization
  
             beginIp32101RctSeqNum = getStartOffset() + 44;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp32101RctGftDasetNamCounter = -1;
     public boolean isIp32101RctGftDasetNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101RctGftDasetNamCounter != sharedCounter;
         localIp32101RctGftDasetNamCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_32101_RCT_GFT_DASET_NAM_LEN = 44;
	/**
	 * 	serialize this Ip32101RctGftDasetNam
	 */
   protected void serializeIp32101RctGftDasetNam(char[] ip32101RctGftDasetNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip32101RctGftDasetNam,0,getStringValue(),beginIp32101RctGftDasetNam,IP_32101_RCT_GFT_DASET_NAM_LEN);
       localIp32101RctGftDasetNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp32101RctGftDasetNamConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshIp32101RctGftDasetNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp32101RctGftDasetNam() {	 
   		return (substring(getStringValue(),beginIp32101RctGftDasetNam,beginIp32101RctGftDasetNam + IP_32101_RCT_GFT_DASET_NAM_LEN));
   	}
     int localIp32101RctSeqNumCounter = -1;
     public boolean isIp32101RctSeqNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101RctSeqNumCounter != sharedCounter;
         localIp32101RctSeqNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip32101RctSeqNum
	 *	@return ip32101RctSeqNum
	 */
	public char[]  getIp32101RctSeqNumString() {
	     return getCharArray(beginIp32101RctSeqNum,IP_32101_RCT_SEQ_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip32101RctSeqNumIsNumeric() {
	    return isNumeric(beginIp32101RctSeqNum
	                    ,beginIp32101RctSeqNum + IP_32101_RCT_SEQ_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_32101_RCT_SEQ_NUM_LEN = 5;
  	/**
	 * serializeIp32101RctSeqNum
	 */
	protected void serializeIp32101RctSeqNum(long ip32101RctSeqNum) {
		 putNumber(beginIp32101RctSeqNum,ip32101RctSeqNum,IP_32101_RCT_SEQ_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp32101RctSeqNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp32101RctSeqNum
	 */
   	protected  long serializeIp32101RctSeqNum(char[] value) {
	    long  ip32101RctSeqNum;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip32101RctSeqNum = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIp32101RctSeqNum
		       ,5
		      );
		 localIp32101RctSeqNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip32101RctSeqNum;
    }

   protected long checkIp32101RctSeqNumMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp32101RctSeqNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp32101RctSeqNum() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp32101RctSeqNum
			                 ,IP_32101_RCT_SEQ_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip32101RctSeqNum", beginIp32101RctSeqNum,IP_32101_RCT_SEQ_NUM_LEN);
    }
   	}




}
  
