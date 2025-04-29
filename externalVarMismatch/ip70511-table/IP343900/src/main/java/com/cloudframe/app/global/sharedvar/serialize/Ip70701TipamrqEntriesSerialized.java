package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70701TipamrqEntriesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70701TipamrqEntriesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70701TipamrqEntriesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70701_TIPAMRQ_ENTRIES_LENGTH = 2102;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70701JobGrpId;
            protected  int beginIp70701JobGrpNum;
	
	/**
	* Constructor for Ip70701TipamrqEntriesSerialized
	**/
    public Ip70701TipamrqEntriesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip70701TipamrqEntriesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70701_TIPAMRQ_ENTRIES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginIp70701JobGrpId = getStartOffset() + 2094;	// set offset for serialization
  
             beginIp70701JobGrpNum = getStartOffset() + 2100;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70701JobGrpIdCounter = -1;
     public boolean isIp70701JobGrpIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70701JobGrpIdCounter != sharedCounter;
         localIp70701JobGrpIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70701_JOB_GRP_ID_LEN = 6;
	/**
	 * 	serialize this Ip70701JobGrpId
	 */
   protected void serializeIp70701JobGrpId(char[] ip70701JobGrpId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70701JobGrpId,0,getStringValue(),beginIp70701JobGrpId,IP_70701_JOB_GRP_ID_LEN);
       localIp70701JobGrpIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70701JobGrpIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshIp70701JobGrpId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70701JobGrpId() {	 
   		return (substring(getStringValue(),beginIp70701JobGrpId,beginIp70701JobGrpId + IP_70701_JOB_GRP_ID_LEN));
   	}
     int localIp70701JobGrpNumCounter = -1;
     public boolean isIp70701JobGrpNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70701JobGrpNumCounter != sharedCounter;
         localIp70701JobGrpNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip70701JobGrpNum
	 *	@return ip70701JobGrpNum
	 */
	public char[]  getIp70701JobGrpNumString() {
	     return getCharArray(beginIp70701JobGrpNum,IP_70701_JOB_GRP_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip70701JobGrpNumIsNumeric() {
	    return isNumeric(beginIp70701JobGrpNum
	                    ,beginIp70701JobGrpNum + IP_70701_JOB_GRP_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_70701_JOB_GRP_NUM_LEN = 2;
  	/**
	 * serializeIp70701JobGrpNum
	 */
	protected void serializeIp70701JobGrpNum(int ip70701JobGrpNum) {
		 putNumber(beginIp70701JobGrpNum,ip70701JobGrpNum,IP_70701_JOB_GRP_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp70701JobGrpNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp70701JobGrpNum
	 */
   	protected  int serializeIp70701JobGrpNum(char[] value) {
	    int  ip70701JobGrpNum;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip70701JobGrpNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp70701JobGrpNum
		       ,2
		      );
		 localIp70701JobGrpNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip70701JobGrpNum;
    }

   protected int checkIp70701JobGrpNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp70701JobGrpNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp70701JobGrpNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp70701JobGrpNum
			                 ,IP_70701_JOB_GRP_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip70701JobGrpNum", beginIp70701JobGrpNum,IP_70701_JOB_GRP_NUM_LEN);
    }
   	}




}
  
