package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip67002DateParmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip67002DateParmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip67002DateParmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_67002_DATE_PARM_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp67002Cntl;
            protected  int beginIp67002Date;
            protected  int beginIp67002Date2;
            protected  int beginIp67002DayOfWeek;
            protected  int beginIp67002UtcOffsetSign;
            protected  int beginIp67002JulianDaysSpan;
	
	/**
	* Constructor for Ip67002DateParmSerialized
	**/
    public Ip67002DateParmSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip67002DateParmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_67002_DATE_PARM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp67002Cntl = getStartOffset() + 0;	// set offset for serialization
  
             beginIp67002Date = getStartOffset() + 1;	// set offset for serialization
  
  
  
  
             beginIp67002Date2 = getStartOffset() + 9;	// set offset for serialization
  
  
  
             beginIp67002DayOfWeek = getStartOffset() + 17;	// set offset for serialization
  
             beginIp67002UtcOffsetSign = getStartOffset() + 17;	// set offset for serialization
  
             beginIp67002JulianDaysSpan = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp67002CntlCounter = -1;
     public boolean isIp67002CntlModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002CntlCounter != sharedCounter;
         localIp67002CntlCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_67002_CNTL_LEN = 1;
	/**
	 * 	serialize this Ip67002Cntl
	 */
   protected void serializeIp67002Cntl(char[] ip67002Cntl) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip67002Cntl,0,getStringValue(),beginIp67002Cntl,IP_67002_CNTL_LEN);
       localIp67002CntlCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp67002CntlConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp67002Cntl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp67002Cntl() {	 
   		return (substring(getStringValue(),beginIp67002Cntl,beginIp67002Cntl + IP_67002_CNTL_LEN));
   	}
     int localIp67002DateCounter = -1;
     public boolean isIp67002DateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002DateCounter != sharedCounter;
         localIp67002DateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() {
	     return getCharArray(beginIp67002Date,IP_67002_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric() {
	    return isNumeric(beginIp67002Date
	                    ,beginIp67002Date + IP_67002_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_67002_DATE_LEN = 8;
  	/**
	 * serializeIp67002Date
	 */
	protected void serializeIp67002Date(long ip67002Date) {
		 putNumber(beginIp67002Date,ip67002Date,IP_67002_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp67002DateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp67002Date
	 */
   	protected  long serializeIp67002Date(char[] value) {
	    long  ip67002Date;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip67002Date = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginIp67002Date
		       ,8
		      );
		 localIp67002DateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip67002Date;
    }

   protected long checkIp67002DateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp67002Date is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp67002Date() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp67002Date
			                 ,IP_67002_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip67002Date", beginIp67002Date,IP_67002_DATE_LEN);
    }
   	}
     int localIp67002Date2Counter = -1;
     public boolean isIp67002Date2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002Date2Counter != sharedCounter;
         localIp67002Date2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip67002Date2
	 *	@return ip67002Date2
	 */
	public char[]  getIp67002Date2String() {
	     return getCharArray(beginIp67002Date2,IP_67002_DATE_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002Date2IsNumeric() {
	    return isNumeric(beginIp67002Date2
	                    ,beginIp67002Date2 + IP_67002_DATE_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_67002_DATE_2_LEN = 8;
  	/**
	 * serializeIp67002Date2
	 */
	protected void serializeIp67002Date2(long ip67002Date2) {
		 putNumber(beginIp67002Date2,ip67002Date2,IP_67002_DATE_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp67002Date2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp67002Date2
	 */
   	protected  long serializeIp67002Date2(char[] value) {
	    long  ip67002Date2;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip67002Date2 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginIp67002Date2
		       ,8
		      );
		 localIp67002Date2Counter = shareString.getSerializedField().getModifiedCounter();
		return  ip67002Date2;
    }

   protected long checkIp67002Date2MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp67002Date2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp67002Date2() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp67002Date2
			                 ,IP_67002_DATE_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip67002Date2", beginIp67002Date2,IP_67002_DATE_2_LEN);
    }
   	}
     int localIp67002DayOfWeekCounter = -1;
     public boolean isIp67002DayOfWeekModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002DayOfWeekCounter != sharedCounter;
         localIp67002DayOfWeekCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip67002DayOfWeek
	 *	@return ip67002DayOfWeek
	 */
	public char[]  getIp67002DayOfWeekString() {
	     return getCharArray(beginIp67002DayOfWeek,IP_67002_DAY_OF_WEEK_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DayOfWeekIsNumeric() {
	    return isNumeric(beginIp67002DayOfWeek
	                    ,beginIp67002DayOfWeek + IP_67002_DAY_OF_WEEK_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_67002_DAY_OF_WEEK_LEN = 1;
  	/**
	 * serializeIp67002DayOfWeek
	 */
	protected void serializeIp67002DayOfWeek(int ip67002DayOfWeek) {
		 putNumber(beginIp67002DayOfWeek,ip67002DayOfWeek,IP_67002_DAY_OF_WEEK_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp67002DayOfWeekCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp67002DayOfWeek
	 */
   	protected  int serializeIp67002DayOfWeek(char[] value) {
	    int  ip67002DayOfWeek;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip67002DayOfWeek = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp67002DayOfWeek
		       ,1
		      );
		 localIp67002DayOfWeekCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip67002DayOfWeek;
    }

   protected int checkIp67002DayOfWeekMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp67002DayOfWeek is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp67002DayOfWeek() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp67002DayOfWeek
			                 ,IP_67002_DAY_OF_WEEK_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip67002DayOfWeek", beginIp67002DayOfWeek,IP_67002_DAY_OF_WEEK_LEN);
    }
   	}
     int localIp67002UtcOffsetSignCounter = -1;
     public boolean isIp67002UtcOffsetSignModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002UtcOffsetSignCounter != sharedCounter;
         localIp67002UtcOffsetSignCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_67002_UTC_OFFSET_SIGN_LEN = 1;
	/**
	 * 	serialize this Ip67002UtcOffsetSign
	 */
   protected void serializeIp67002UtcOffsetSign(char[] ip67002UtcOffsetSign) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip67002UtcOffsetSign,0,getStringValue(),beginIp67002UtcOffsetSign,IP_67002_UTC_OFFSET_SIGN_LEN);
       localIp67002UtcOffsetSignCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp67002UtcOffsetSignConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp67002UtcOffsetSign is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp67002UtcOffsetSign() {	 
   		return (substring(getStringValue(),beginIp67002UtcOffsetSign,beginIp67002UtcOffsetSign + IP_67002_UTC_OFFSET_SIGN_LEN));
   	}
         int localIp67002JulianDaysSpanCounter = -1;
         public boolean isIp67002JulianDaysSpanModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp67002JulianDaysSpanCounter != sharedCounter;
            localIp67002JulianDaysSpanCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_67002_JULIAN_DAYS_SPAN_LEN = 2;
  	/**
	 * serializeIp67002JulianDaysSpan
	 */
	protected void serializeIp67002JulianDaysSpan(short ip67002JulianDaysSpan) {
           replaceValue( //  save the value as string
                   getBinaryString( ip67002JulianDaysSpan,IP_67002_JULIAN_DAYS_SPAN_LEN)
                  ,beginIp67002JulianDaysSpan
                  ,IP_67002_JULIAN_DAYS_SPAN_LEN
                 );
            localIp67002JulianDaysSpanCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp67002JulianDaysSpanMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp67002JulianDaysSpan is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp67002JulianDaysSpan() {	 
			return (getShort(beginIp67002JulianDaysSpan));
   	}




}
  
