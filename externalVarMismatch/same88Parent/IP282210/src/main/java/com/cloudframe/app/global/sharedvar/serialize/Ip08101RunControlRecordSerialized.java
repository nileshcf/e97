package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip08101RunControlRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip08101RunControlRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip08101RunControlRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_08101_RUN_CONTROL_RECORD_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp08101RunOption;
            protected  int beginIp08101ProcessDate;
           protected int beginIp08101RptIndValues;
           protected static final int IP_08101_RPT_IND_VALUES_SIZE = 15;
           protected int beginIp08101MsgThreshValues;
           protected static final int IP_08101_MSG_THRESH_VALUES_SIZE = 5;
            protected  int beginIp08101RptUtcSign;
            protected  int beginIp08101RptUtcOffset;
            protected  int beginIp08101RptProcessTime;
            protected  int beginIp08101MaxNumCycles;
            protected  int beginIp08101Filler;
	
	/**
	* Constructor for Ip08101RunControlRecordSerialized
	**/
    public Ip08101RunControlRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip08101RunControlRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_08101_RUN_CONTROL_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp08101RunOption = getStartOffset() + 0;	// set offset for serialization
  
             beginIp08101ProcessDate = getStartOffset() + 1;	// set offset for serialization
  
  
	        beginIp08101RptIndValues = getStartOffset() + 9; // set offset for serialization
  
  
	        beginIp08101MsgThreshValues = getStartOffset() + 24; // set offset for serialization
  
             beginIp08101RptUtcSign = getStartOffset() + 39;	// set offset for serialization
  
             beginIp08101RptUtcOffset = getStartOffset() + 40;	// set offset for serialization
  
             beginIp08101RptProcessTime = getStartOffset() + 44;	// set offset for serialization
  
             beginIp08101MaxNumCycles = getStartOffset() + 48;	// set offset for serialization
  
             beginIp08101Filler = getStartOffset() + 51;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp08101RunOptionCounter = -1;
     public boolean isIp08101RunOptionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101RunOptionCounter != sharedCounter;
         localIp08101RunOptionCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_RUN_OPTION_LEN = 1;
	/**
	 * 	serialize this Ip08101RunOption
	 */
   protected void serializeIp08101RunOption(char[] ip08101RunOption) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101RunOption,0,getStringValue(),beginIp08101RunOption,IP_08101_RUN_OPTION_LEN);
       localIp08101RunOptionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101RunOptionConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp08101RunOption is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101RunOption() {	 
   		return (substring(getStringValue(),beginIp08101RunOption,beginIp08101RunOption + IP_08101_RUN_OPTION_LEN));
   	}
     int localIp08101ProcessDateCounter = -1;
     public boolean isIp08101ProcessDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101ProcessDateCounter != sharedCounter;
         localIp08101ProcessDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip08101ProcessDate
	 *	@return ip08101ProcessDate
	 */
	public char[]  getIp08101ProcessDateString() {
	     return getCharArray(beginIp08101ProcessDate,IP_08101_PROCESS_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip08101ProcessDateIsNumeric() {
	    return isNumeric(beginIp08101ProcessDate
	                    ,beginIp08101ProcessDate + IP_08101_PROCESS_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_08101_PROCESS_DATE_LEN = 8;
  	/**
	 * serializeIp08101ProcessDate
	 */
	protected void serializeIp08101ProcessDate(long ip08101ProcessDate) {
		 putNumber(beginIp08101ProcessDate,ip08101ProcessDate,IP_08101_PROCESS_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp08101ProcessDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp08101ProcessDate
	 */
   	protected  long serializeIp08101ProcessDate(char[] value) {
	    long  ip08101ProcessDate;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip08101ProcessDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginIp08101ProcessDate
		       ,8
		      );
		 localIp08101ProcessDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip08101ProcessDate;
    }

   protected long checkIp08101ProcessDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp08101ProcessDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp08101ProcessDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp08101ProcessDate
			                 ,IP_08101_PROCESS_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip08101ProcessDate", beginIp08101ProcessDate,IP_08101_PROCESS_DATE_LEN);
    }
   	}
 
   
  protected  static final int IP_08101_RPT_IND_VALUES_LEN = 1;
   /**
	 *	serializeIp08101RptIndValues as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeIp08101RptIndValues(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginIp08101RptIndValues + index*IP_08101_RPT_IND_VALUES_LEN)
   	          , IP_08101_RPT_IND_VALUES_LEN 
   	          );
   }
 
   
  protected  static final int IP_08101_MSG_THRESH_VALUES_LEN = 3;
   /**
	 *	serializeIp08101MsgThreshValues as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeIp08101MsgThreshValues(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginIp08101MsgThreshValues + index*IP_08101_MSG_THRESH_VALUES_LEN)
   	          , IP_08101_MSG_THRESH_VALUES_LEN 
   	          );
   }
     int localIp08101RptUtcSignCounter = -1;
     public boolean isIp08101RptUtcSignModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101RptUtcSignCounter != sharedCounter;
         localIp08101RptUtcSignCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_RPT_UTC_SIGN_LEN = 1;
	/**
	 * 	serialize this Ip08101RptUtcSign
	 */
   protected void serializeIp08101RptUtcSign(char[] ip08101RptUtcSign) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101RptUtcSign,0,getStringValue(),beginIp08101RptUtcSign,IP_08101_RPT_UTC_SIGN_LEN);
       localIp08101RptUtcSignCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101RptUtcSignConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp08101RptUtcSign is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101RptUtcSign() {	 
   		return (substring(getStringValue(),beginIp08101RptUtcSign,beginIp08101RptUtcSign + IP_08101_RPT_UTC_SIGN_LEN));
   	}
     int localIp08101RptUtcOffsetCounter = -1;
     public boolean isIp08101RptUtcOffsetModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101RptUtcOffsetCounter != sharedCounter;
         localIp08101RptUtcOffsetCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_RPT_UTC_OFFSET_LEN = 4;
	/**
	 * 	serialize this Ip08101RptUtcOffset
	 */
   protected void serializeIp08101RptUtcOffset(char[] ip08101RptUtcOffset) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101RptUtcOffset,0,getStringValue(),beginIp08101RptUtcOffset,IP_08101_RPT_UTC_OFFSET_LEN);
       localIp08101RptUtcOffsetCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101RptUtcOffsetConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp08101RptUtcOffset is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101RptUtcOffset() {	 
   		return (substring(getStringValue(),beginIp08101RptUtcOffset,beginIp08101RptUtcOffset + IP_08101_RPT_UTC_OFFSET_LEN));
   	}
     int localIp08101RptProcessTimeCounter = -1;
     public boolean isIp08101RptProcessTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101RptProcessTimeCounter != sharedCounter;
         localIp08101RptProcessTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_RPT_PROCESS_TIME_LEN = 4;
	/**
	 * 	serialize this Ip08101RptProcessTime
	 */
   protected void serializeIp08101RptProcessTime(char[] ip08101RptProcessTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101RptProcessTime,0,getStringValue(),beginIp08101RptProcessTime,IP_08101_RPT_PROCESS_TIME_LEN);
       localIp08101RptProcessTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101RptProcessTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp08101RptProcessTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101RptProcessTime() {	 
   		return (substring(getStringValue(),beginIp08101RptProcessTime,beginIp08101RptProcessTime + IP_08101_RPT_PROCESS_TIME_LEN));
   	}
     int localIp08101MaxNumCyclesCounter = -1;
     public boolean isIp08101MaxNumCyclesModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101MaxNumCyclesCounter != sharedCounter;
         localIp08101MaxNumCyclesCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip08101MaxNumCycles
	 *	@return ip08101MaxNumCycles
	 */
	public char[]  getIp08101MaxNumCyclesString() {
	     return getCharArray(beginIp08101MaxNumCycles,IP_08101_MAX_NUM_CYCLES_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip08101MaxNumCyclesIsNumeric() {
	    return isNumeric(beginIp08101MaxNumCycles
	                    ,beginIp08101MaxNumCycles + IP_08101_MAX_NUM_CYCLES_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_08101_MAX_NUM_CYCLES_LEN = 3;
  	/**
	 * serializeIp08101MaxNumCycles
	 */
	protected void serializeIp08101MaxNumCycles(int ip08101MaxNumCycles) {
		 putNumber(beginIp08101MaxNumCycles,ip08101MaxNumCycles,IP_08101_MAX_NUM_CYCLES_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp08101MaxNumCyclesCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp08101MaxNumCycles
	 */
   	protected  int serializeIp08101MaxNumCycles(char[] value) {
	    int  ip08101MaxNumCycles;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip08101MaxNumCycles = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp08101MaxNumCycles
		       ,3
		      );
		 localIp08101MaxNumCyclesCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip08101MaxNumCycles;
    }

   protected int checkIp08101MaxNumCyclesMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp08101MaxNumCycles is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp08101MaxNumCycles() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp08101MaxNumCycles
			                 ,IP_08101_MAX_NUM_CYCLES_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip08101MaxNumCycles", beginIp08101MaxNumCycles,IP_08101_MAX_NUM_CYCLES_LEN);
    }
   	}
     int localIp08101FillerCounter = -1;
     public boolean isIp08101FillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101FillerCounter != sharedCounter;
         localIp08101FillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_FILLER_LEN = 29;
	/**
	 * 	serialize this Ip08101Filler
	 */
   protected void serializeIp08101Filler(char[] ip08101Filler) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101Filler,0,getStringValue(),beginIp08101Filler,IP_08101_FILLER_LEN);
       localIp08101FillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101FillerConstraints(char[] value) {
   			return super.checkConstraints(value , 29 ,false, false);
   }
    /**
	 *	refreshIp08101Filler is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101Filler() {	 
   		return (substring(getStringValue(),beginIp08101Filler,beginIp08101Filler + IP_08101_FILLER_LEN));
   	}

		public int ip08101RptIndValuesSize() {
			return IP_08101_RPT_IND_VALUES_SIZE;
		}
		public int ip08101MsgThreshValuesSize() {
			return IP_08101_MSG_THRESH_VALUES_SIZE;
		}



}
  
