package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip60001EventLogWorkAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip60001EventLogWorkAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip60001EventLogWorkAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_60001_EVENT_LOG_WORK_AREA_LENGTH = 4067;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp60001EventLogControl;
            protected  int beginIp60001Subscript;
           protected int beginIp60001EventEntry;
           protected static final int IP_60001_EVENT_ENTRY_SIZE = 500;
            protected  int beginIp60001HoldPgmName;
            protected  int beginIp60001EventErrorCode;
            protected  int beginIp60001EventErrorMsg;
	
	/**
	* Constructor for Ip60001EventLogWorkAreaSerialized
	**/
    public Ip60001EventLogWorkAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip60001EventLogWorkAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_60001_EVENT_LOG_WORK_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp60001EventLogControl = getStartOffset() + 0;	// set offset for serialization
  
             beginIp60001Subscript = getStartOffset() + 1;	// set offset for serialization
  
	        beginIp60001EventEntry = getStartOffset() + 5; // set offset for serialization
  
             beginIp60001HoldPgmName = getStartOffset() + 4005;	// set offset for serialization
  
             beginIp60001EventErrorCode = getStartOffset() + 4013;	// set offset for serialization
  
             beginIp60001EventErrorMsg = getStartOffset() + 4017;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp60001EventLogControlCounter = -1;
     public boolean isIp60001EventLogControlModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp60001EventLogControlCounter != sharedCounter;
         localIp60001EventLogControlCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_60001_EVENT_LOG_CONTROL_LEN = 1;
	/**
	 * 	serialize this Ip60001EventLogControl
	 */
   protected void serializeIp60001EventLogControl(char[] ip60001EventLogControl) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip60001EventLogControl,0,getStringValue(),beginIp60001EventLogControl,IP_60001_EVENT_LOG_CONTROL_LEN);
       localIp60001EventLogControlCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp60001EventLogControlConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp60001EventLogControl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp60001EventLogControl() {	 
   		return (substring(getStringValue(),beginIp60001EventLogControl,beginIp60001EventLogControl + IP_60001_EVENT_LOG_CONTROL_LEN));
   	}
         int localIp60001SubscriptCounter = -1;
         public boolean isIp60001SubscriptModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp60001SubscriptCounter != sharedCounter;
            localIp60001SubscriptCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_60001_SUBSCRIPT_LEN = 4;
  	/**
	 * serializeIp60001Subscript
	 */
	protected void serializeIp60001Subscript(long ip60001Subscript) {
           replaceValue( //  save the value as string
                   getBinaryString( ip60001Subscript,IP_60001_SUBSCRIPT_LEN)
                  ,beginIp60001Subscript
                  ,IP_60001_SUBSCRIPT_LEN
                 );
            localIp60001SubscriptCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp60001SubscriptMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp60001Subscript is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp60001Subscript() {	 
			return (getUnsignedInt(beginIp60001Subscript));
   	}
     int localIp60001HoldPgmNameCounter = -1;
     public boolean isIp60001HoldPgmNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp60001HoldPgmNameCounter != sharedCounter;
         localIp60001HoldPgmNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_60001_HOLD_PGM_NAME_LEN = 8;
	/**
	 * 	serialize this Ip60001HoldPgmName
	 */
   protected void serializeIp60001HoldPgmName(char[] ip60001HoldPgmName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip60001HoldPgmName,0,getStringValue(),beginIp60001HoldPgmName,IP_60001_HOLD_PGM_NAME_LEN);
       localIp60001HoldPgmNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp60001HoldPgmNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp60001HoldPgmName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp60001HoldPgmName() {	 
   		return (substring(getStringValue(),beginIp60001HoldPgmName,beginIp60001HoldPgmName + IP_60001_HOLD_PGM_NAME_LEN));
   	}
     int localIp60001EventErrorCodeCounter = -1;
     public boolean isIp60001EventErrorCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp60001EventErrorCodeCounter != sharedCounter;
         localIp60001EventErrorCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_60001_EVENT_ERROR_CODE_LEN = 4;
	/**
	 * 	serialize this Ip60001EventErrorCode
	 */
   protected void serializeIp60001EventErrorCode(char[] ip60001EventErrorCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip60001EventErrorCode,0,getStringValue(),beginIp60001EventErrorCode,IP_60001_EVENT_ERROR_CODE_LEN);
       localIp60001EventErrorCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp60001EventErrorCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp60001EventErrorCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp60001EventErrorCode() {	 
   		return (substring(getStringValue(),beginIp60001EventErrorCode,beginIp60001EventErrorCode + IP_60001_EVENT_ERROR_CODE_LEN));
   	}
     int localIp60001EventErrorMsgCounter = -1;
     public boolean isIp60001EventErrorMsgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp60001EventErrorMsgCounter != sharedCounter;
         localIp60001EventErrorMsgCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_60001_EVENT_ERROR_MSG_LEN = 50;
	/**
	 * 	serialize this Ip60001EventErrorMsg
	 */
   protected void serializeIp60001EventErrorMsg(char[] ip60001EventErrorMsg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip60001EventErrorMsg,0,getStringValue(),beginIp60001EventErrorMsg,IP_60001_EVENT_ERROR_MSG_LEN);
       localIp60001EventErrorMsgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp60001EventErrorMsgConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshIp60001EventErrorMsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp60001EventErrorMsg() {	 
   		return (substring(getStringValue(),beginIp60001EventErrorMsg,beginIp60001EventErrorMsg + IP_60001_EVENT_ERROR_MSG_LEN));
   	}

		public int ip60001EventEntrySize() {
			return IP_60001_EVENT_ENTRY_SIZE;
		}



}
  
