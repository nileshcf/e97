package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Ip503011TblEffDateRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip503011TblEffDateRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip503011TblEffDateRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_503011_TBL_EFF_DATE_RECORD_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp503011TableId;
            protected  int beginIp503011TblEffDate;
	
	/**
	* Constructor for Ip503011TblEffDateRecordSerialized
	**/
    public Ip503011TblEffDateRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip503011TblEffDateRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_503011_TBL_EFF_DATE_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp503011TableId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp503011TblEffDate = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp503011TableIdCounter = -1;
     public boolean isIp503011TableIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp503011TableIdCounter != sharedCounter;
         localIp503011TableIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_503011_TABLE_ID_LEN = 8;
	/**
	 * 	serialize this Ip503011TableId
	 */
   protected void serializeIp503011TableId(char[] ip503011TableId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip503011TableId,0,getStringValue(),beginIp503011TableId,IP_503011_TABLE_ID_LEN);
       localIp503011TableIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp503011TableIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp503011TableId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp503011TableId() {	 
   		return (substring(getStringValue(),beginIp503011TableId,beginIp503011TableId + IP_503011_TABLE_ID_LEN));
   	}
     int localIp503011TblEffDateCounter = -1;
     public boolean isIp503011TblEffDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp503011TblEffDateCounter != sharedCounter;
         localIp503011TblEffDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip503011TblEffDate
	 *	@return ip503011TblEffDate
	 */
	public char[]  getIp503011TblEffDateString() {
	     return getCharArray(beginIp503011TblEffDate,IP_503011_TBL_EFF_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip503011TblEffDateIsNumeric() {
	    return isNumeric(beginIp503011TblEffDate
	                    ,beginIp503011TblEffDate + IP_503011_TBL_EFF_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_503011_TBL_EFF_DATE_LEN = 10;
  	/**
	 * serializeIp503011TblEffDate
	 */
	protected void serializeIp503011TblEffDate(long ip503011TblEffDate) {
		 putNumber(beginIp503011TblEffDate,ip503011TblEffDate,IP_503011_TBL_EFF_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp503011TblEffDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp503011TblEffDate
	 */
   	protected  long serializeIp503011TblEffDate(char[] value) {
	    long  ip503011TblEffDate;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip503011TblEffDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginIp503011TblEffDate
		       ,10
		      );
		 localIp503011TblEffDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip503011TblEffDate;
    }

   protected long checkIp503011TblEffDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp503011TblEffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp503011TblEffDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp503011TblEffDate
			                 ,IP_503011_TBL_EFF_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip503011TblEffDate", beginIp503011TblEffDate,IP_503011_TBL_EFF_DATE_LEN);
    }
   	}




}
  
