package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip0201ReducedFileFormatSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0201ReducedFileFormatSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0201ReducedFileFormatSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0201_REDUCED_FILE_FORMAT_LENGTH = 32756;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0201EffectiveDate;
            protected  int beginIp0201EffectiveHour;
            protected  int beginIp0201ActionCode;
            protected  int beginIp0201TblSubId;
            protected  int beginIp0201TableData;
	
	/**
	* Constructor for Ip0201ReducedFileFormatSerialized
	**/
    public Ip0201ReducedFileFormatSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip0201ReducedFileFormatSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0201_REDUCED_FILE_FORMAT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0201EffectiveDate = getStartOffset() + 0;	// set offset for serialization
  
             beginIp0201EffectiveHour = getStartOffset() + 5;	// set offset for serialization
  
             beginIp0201ActionCode = getStartOffset() + 7;	// set offset for serialization
  
             beginIp0201TblSubId = getStartOffset() + 8;	// set offset for serialization
  
             beginIp0201TableData = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp0201EffectiveDateCounter = -1;
     public boolean isIp0201EffectiveDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0201EffectiveDateCounter != sharedCounter;
         localIp0201EffectiveDateCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0201_EFFECTIVE_DATE_LEN = 5;
	/**
	 * 	serialize this Ip0201EffectiveDate
	 */
   protected void serializeIp0201EffectiveDate(char[] ip0201EffectiveDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0201EffectiveDate,0,getStringValue(),beginIp0201EffectiveDate,IP_0201_EFFECTIVE_DATE_LEN);
       localIp0201EffectiveDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0201EffectiveDateConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshIp0201EffectiveDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0201EffectiveDate() {	 
   		return (substring(getStringValue(),beginIp0201EffectiveDate,beginIp0201EffectiveDate + IP_0201_EFFECTIVE_DATE_LEN));
   	}
     int localIp0201EffectiveHourCounter = -1;
     public boolean isIp0201EffectiveHourModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0201EffectiveHourCounter != sharedCounter;
         localIp0201EffectiveHourCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0201_EFFECTIVE_HOUR_LEN = 2;
	/**
	 * 	serialize this Ip0201EffectiveHour
	 */
   protected void serializeIp0201EffectiveHour(char[] ip0201EffectiveHour) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0201EffectiveHour,0,getStringValue(),beginIp0201EffectiveHour,IP_0201_EFFECTIVE_HOUR_LEN);
       localIp0201EffectiveHourCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0201EffectiveHourConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp0201EffectiveHour is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0201EffectiveHour() {	 
   		return (substring(getStringValue(),beginIp0201EffectiveHour,beginIp0201EffectiveHour + IP_0201_EFFECTIVE_HOUR_LEN));
   	}
     int localIp0201ActionCodeCounter = -1;
     public boolean isIp0201ActionCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0201ActionCodeCounter != sharedCounter;
         localIp0201ActionCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0201_ACTION_CODE_LEN = 1;
	/**
	 * 	serialize this Ip0201ActionCode
	 */
   protected void serializeIp0201ActionCode(char[] ip0201ActionCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0201ActionCode,0,getStringValue(),beginIp0201ActionCode,IP_0201_ACTION_CODE_LEN);
       localIp0201ActionCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0201ActionCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0201ActionCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0201ActionCode() {	 
   		return (substring(getStringValue(),beginIp0201ActionCode,beginIp0201ActionCode + IP_0201_ACTION_CODE_LEN));
   	}
     int localIp0201TblSubIdCounter = -1;
     public boolean isIp0201TblSubIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0201TblSubIdCounter != sharedCounter;
         localIp0201TblSubIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0201_TBL_SUB_ID_LEN = 3;
	/**
	 * 	serialize this Ip0201TblSubId
	 */
   protected void serializeIp0201TblSubId(char[] ip0201TblSubId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0201TblSubId,0,getStringValue(),beginIp0201TblSubId,IP_0201_TBL_SUB_ID_LEN);
       localIp0201TblSubIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0201TblSubIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp0201TblSubId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0201TblSubId() {	 
   		return (substring(getStringValue(),beginIp0201TblSubId,beginIp0201TblSubId + IP_0201_TBL_SUB_ID_LEN));
   	}
     int localIp0201TableDataCounter = -1;
     public boolean isIp0201TableDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0201TableDataCounter != sharedCounter;
         localIp0201TableDataCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0201_TABLE_DATA_LEN = 32745;
	/**
	 * 	serialize this Ip0201TableData
	 */
   protected void serializeIp0201TableData(char[] ip0201TableData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0201TableData,0,getStringValue(),beginIp0201TableData,IP_0201_TABLE_DATA_LEN);
       localIp0201TableDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0201TableDataConstraints(char[] value) {
   			return super.checkConstraints(value , 32745 ,false, false);
   }
    /**
	 *	refreshIp0201TableData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0201TableData() {	 
   		return (substring(getStringValue(),beginIp0201TableData,beginIp0201TableData + IP_0201_TABLE_DATA_LEN));
   	}




}
  
