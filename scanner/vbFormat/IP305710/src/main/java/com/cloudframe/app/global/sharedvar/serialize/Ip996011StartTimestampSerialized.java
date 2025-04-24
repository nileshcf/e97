package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip996011StartTimestampSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:47. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip996011StartTimestampSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip996011StartTimestampSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_996011_START_TIMESTAMP_LENGTH = 19;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp996011StartMonth;
            protected  int beginIp996011StartDay;
            protected  int beginIp996011StartYear;
            protected  int beginIp996011StartHour;
            protected  int beginIp996011Dot1;
            protected  int beginIp996011StartMinute;
            protected  int beginIp996011Dot2;
            protected  int beginIp996011StartSecond;
	
	/**
	* Constructor for Ip996011StartTimestampSerialized
	**/
    public Ip996011StartTimestampSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip996011StartTimestampSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip996011StartTimestampSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip996011StartTimestampSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,24); // serialize this field at offset 24 by default 
    }
    
	/**
	* sets parent for this Ip996011StartTimestampSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 24 by default
    }    
	/**
	* initializes the field in Ip996011StartTimestampSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_996011_START_TIMESTAMP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp996011StartMonth = getStartOffset() + 0;	// set offset for serialization
  
             beginIp996011StartDay = getStartOffset() + 3;	// set offset for serialization
  
             beginIp996011StartYear = getStartOffset() + 6;	// set offset for serialization
  
             beginIp996011StartHour = getStartOffset() + 9;	// set offset for serialization
  
             beginIp996011Dot1 = getStartOffset() + 11;	// set offset for serialization
  
             beginIp996011StartMinute = getStartOffset() + 12;	// set offset for serialization
  
             beginIp996011Dot2 = getStartOffset() + 14;	// set offset for serialization
  
             beginIp996011StartSecond = getStartOffset() + 15;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp996011StartMonthCounter = -1;
     public boolean isIp996011StartMonthModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp996011StartMonthCounter != sharedCounter;
         localIp996011StartMonthCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_996011_START_MONTH_LEN = 3;
	/**
	 * 	serialize this Ip996011StartMonth
	 */
   protected void serializeIp996011StartMonth(char[] ip996011StartMonth) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip996011StartMonth,0,getStringValue(),beginIp996011StartMonth,IP_996011_START_MONTH_LEN);
       localIp996011StartMonthCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp996011StartMonthConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp996011StartMonth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp996011StartMonth() {	 
   		return (substring(getStringValue(),beginIp996011StartMonth,beginIp996011StartMonth + IP_996011_START_MONTH_LEN));
   	}
     int localIp996011StartDayCounter = -1;
     public boolean isIp996011StartDayModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp996011StartDayCounter != sharedCounter;
         localIp996011StartDayCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_996011_START_DAY_LEN = 3;
	/**
	 * 	serialize this Ip996011StartDay
	 */
   protected void serializeIp996011StartDay(char[] ip996011StartDay) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip996011StartDay,0,getStringValue(),beginIp996011StartDay,IP_996011_START_DAY_LEN);
       localIp996011StartDayCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp996011StartDayConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp996011StartDay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp996011StartDay() {	 
   		return (substring(getStringValue(),beginIp996011StartDay,beginIp996011StartDay + IP_996011_START_DAY_LEN));
   	}
     int localIp996011StartYearCounter = -1;
     public boolean isIp996011StartYearModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp996011StartYearCounter != sharedCounter;
         localIp996011StartYearCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_996011_START_YEAR_LEN = 3;
	/**
	 * 	serialize this Ip996011StartYear
	 */
   protected void serializeIp996011StartYear(char[] ip996011StartYear) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip996011StartYear,0,getStringValue(),beginIp996011StartYear,IP_996011_START_YEAR_LEN);
       localIp996011StartYearCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp996011StartYearConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp996011StartYear is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp996011StartYear() {	 
   		return (substring(getStringValue(),beginIp996011StartYear,beginIp996011StartYear + IP_996011_START_YEAR_LEN));
   	}
     int localIp996011StartHourCounter = -1;
     public boolean isIp996011StartHourModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp996011StartHourCounter != sharedCounter;
         localIp996011StartHourCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip996011StartHour
	 *	@return ip996011StartHour
	 */
	public char[]  getIp996011StartHourString() {
	     return getCharArray(beginIp996011StartHour,IP_996011_START_HOUR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip996011StartHourIsNumeric() {
	    return isNumeric(beginIp996011StartHour
	                    ,beginIp996011StartHour + IP_996011_START_HOUR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_996011_START_HOUR_LEN = 2;
  	/**
	 * serializeIp996011StartHour
	 */
	protected void serializeIp996011StartHour(int ip996011StartHour) {
		 putNumber(beginIp996011StartHour,ip996011StartHour,IP_996011_START_HOUR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp996011StartHourCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp996011StartHour
	 */
   	protected  int serializeIp996011StartHour(char[] value) {
	    int  ip996011StartHour;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip996011StartHour = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp996011StartHour
		       ,2
		      );
		 localIp996011StartHourCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip996011StartHour;
    }

   protected int checkIp996011StartHourMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp996011StartHour is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp996011StartHour() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp996011StartHour
			                 ,IP_996011_START_HOUR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip996011StartHour", beginIp996011StartHour,IP_996011_START_HOUR_LEN);
    }
   	}
     int localIp996011Dot1Counter = -1;
     public boolean isIp996011Dot1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp996011Dot1Counter != sharedCounter;
         localIp996011Dot1Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_996011_DOT_1_LEN = 1;
	/**
	 * 	serialize this Ip996011Dot1
	 */
   protected void serializeIp996011Dot1(char[] ip996011Dot1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip996011Dot1,0,getStringValue(),beginIp996011Dot1,IP_996011_DOT_1_LEN);
       localIp996011Dot1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp996011Dot1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp996011Dot1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp996011Dot1() {	 
   		return (substring(getStringValue(),beginIp996011Dot1,beginIp996011Dot1 + IP_996011_DOT_1_LEN));
   	}
     int localIp996011StartMinuteCounter = -1;
     public boolean isIp996011StartMinuteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp996011StartMinuteCounter != sharedCounter;
         localIp996011StartMinuteCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip996011StartMinute
	 *	@return ip996011StartMinute
	 */
	public char[]  getIp996011StartMinuteString() {
	     return getCharArray(beginIp996011StartMinute,IP_996011_START_MINUTE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip996011StartMinuteIsNumeric() {
	    return isNumeric(beginIp996011StartMinute
	                    ,beginIp996011StartMinute + IP_996011_START_MINUTE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_996011_START_MINUTE_LEN = 2;
  	/**
	 * serializeIp996011StartMinute
	 */
	protected void serializeIp996011StartMinute(int ip996011StartMinute) {
		 putNumber(beginIp996011StartMinute,ip996011StartMinute,IP_996011_START_MINUTE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp996011StartMinuteCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp996011StartMinute
	 */
   	protected  int serializeIp996011StartMinute(char[] value) {
	    int  ip996011StartMinute;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip996011StartMinute = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp996011StartMinute
		       ,2
		      );
		 localIp996011StartMinuteCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip996011StartMinute;
    }

   protected int checkIp996011StartMinuteMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp996011StartMinute is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp996011StartMinute() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp996011StartMinute
			                 ,IP_996011_START_MINUTE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip996011StartMinute", beginIp996011StartMinute,IP_996011_START_MINUTE_LEN);
    }
   	}
     int localIp996011Dot2Counter = -1;
     public boolean isIp996011Dot2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp996011Dot2Counter != sharedCounter;
         localIp996011Dot2Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_996011_DOT_2_LEN = 1;
	/**
	 * 	serialize this Ip996011Dot2
	 */
   protected void serializeIp996011Dot2(char[] ip996011Dot2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip996011Dot2,0,getStringValue(),beginIp996011Dot2,IP_996011_DOT_2_LEN);
       localIp996011Dot2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp996011Dot2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp996011Dot2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp996011Dot2() {	 
   		return (substring(getStringValue(),beginIp996011Dot2,beginIp996011Dot2 + IP_996011_DOT_2_LEN));
   	}
     int localIp996011StartSecondCounter = -1;
     public boolean isIp996011StartSecondModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp996011StartSecondCounter != sharedCounter;
         localIp996011StartSecondCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_996011_START_SECOND_LEN = 4;
	/**
	 * 	serialize this Ip996011StartSecond
	 */
   protected void serializeIp996011StartSecond(char[] ip996011StartSecond) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip996011StartSecond,0,getStringValue(),beginIp996011StartSecond,IP_996011_START_SECOND_LEN);
       localIp996011StartSecondCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp996011StartSecondConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp996011StartSecond is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp996011StartSecond() {	 
   		return (substring(getStringValue(),beginIp996011StartSecond,beginIp996011StartSecond + IP_996011_START_SECOND_LEN));
   	}




}
  
