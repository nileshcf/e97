package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class HdPage1Ln2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdPage1Ln2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdPage1Ln2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HD_PAGE_1_LN_2_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHd12Cc;
            protected  int beginHd12MceMsg;
            protected  int beginHd12DailyMon;
            protected  int beginHd13CntryName;
            protected  int beginHd13Country;
            protected  int beginHd1DateMsg;
            protected  int beginHd12Mm;
            protected  int beginHd12Dd;
            protected  int beginHd12Yy;
	
	/**
	* Constructor for HdPage1Ln2Serialized
	**/
    public HdPage1Ln2Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HdPage1Ln2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HD_PAGE_1_LN_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHd12Cc = getStartOffset() + 0;	// set offset for serialization
  
  
             beginHd12MceMsg = getStartOffset() + 50;	// set offset for serialization
  
             beginHd12DailyMon = getStartOffset() + 53;	// set offset for serialization
  
  
  
  
             beginHd13CntryName = getStartOffset() + 85;	// set offset for serialization
  
             beginHd13Country = getStartOffset() + 94;	// set offset for serialization
  
  
             beginHd1DateMsg = getStartOffset() + 114;	// set offset for serialization
  
             beginHd12Mm = getStartOffset() + 124;	// set offset for serialization
  
  
             beginHd12Dd = getStartOffset() + 127;	// set offset for serialization
  
  
             beginHd12Yy = getStartOffset() + 130;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localHd12CcCounter = -1;
     public boolean isHd12CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd12CcCounter != sharedCounter;
         localHd12CcCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_12_CC_LEN = 1;
	/**
	 * 	serialize this Hd12Cc
	 */
   protected void serializeHd12Cc(char[] hd12Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd12Cc,0,getStringValue(),beginHd12Cc,HD_12_CC_LEN);
       localHd12CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd12CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHd12Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd12Cc() {	 
   		return (substring(getStringValue(),beginHd12Cc,beginHd12Cc + HD_12_CC_LEN));
   	}
     int localHd12MceMsgCounter = -1;
     public boolean isHd12MceMsgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd12MceMsgCounter != sharedCounter;
         localHd12MceMsgCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_12_MCE_MSG_LEN = 3;
	/**
	 * 	serialize this Hd12MceMsg
	 */
   protected void serializeHd12MceMsg(char[] hd12MceMsg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd12MceMsg,0,getStringValue(),beginHd12MceMsg,HD_12_MCE_MSG_LEN);
       localHd12MceMsgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd12MceMsgConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshHd12MceMsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd12MceMsg() {	 
   		return (substring(getStringValue(),beginHd12MceMsg,beginHd12MceMsg + HD_12_MCE_MSG_LEN));
   	}
     int localHd12DailyMonCounter = -1;
     public boolean isHd12DailyMonModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd12DailyMonCounter != sharedCounter;
         localHd12DailyMonCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_12_DAILY_MON_LEN = 11;
	/**
	 * 	serialize this Hd12DailyMon
	 */
   protected void serializeHd12DailyMon(char[] hd12DailyMon) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd12DailyMon,0,getStringValue(),beginHd12DailyMon,HD_12_DAILY_MON_LEN);
       localHd12DailyMonCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd12DailyMonConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshHd12DailyMon is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd12DailyMon() {	 
   		return (substring(getStringValue(),beginHd12DailyMon,beginHd12DailyMon + HD_12_DAILY_MON_LEN));
   	}
     int localHd13CntryNameCounter = -1;
     public boolean isHd13CntryNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd13CntryNameCounter != sharedCounter;
         localHd13CntryNameCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_13_CNTRY_NAME_LEN = 9;
	/**
	 * 	serialize this Hd13CntryName
	 */
   protected void serializeHd13CntryName(char[] hd13CntryName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd13CntryName,0,getStringValue(),beginHd13CntryName,HD_13_CNTRY_NAME_LEN);
       localHd13CntryNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd13CntryNameConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshHd13CntryName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd13CntryName() {	 
   		return (substring(getStringValue(),beginHd13CntryName,beginHd13CntryName + HD_13_CNTRY_NAME_LEN));
   	}
     int localHd13CountryCounter = -1;
     public boolean isHd13CountryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd13CountryCounter != sharedCounter;
         localHd13CountryCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_13_COUNTRY_LEN = 3;
	/**
	 * 	serialize this Hd13Country
	 */
   protected void serializeHd13Country(char[] hd13Country) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd13Country,0,getStringValue(),beginHd13Country,HD_13_COUNTRY_LEN);
       localHd13CountryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd13CountryConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshHd13Country is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd13Country() {	 
   		return (substring(getStringValue(),beginHd13Country,beginHd13Country + HD_13_COUNTRY_LEN));
   	}
     int localHd1DateMsgCounter = -1;
     public boolean isHd1DateMsgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd1DateMsgCounter != sharedCounter;
         localHd1DateMsgCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_1_DATE_MSG_LEN = 10;
	/**
	 * 	serialize this Hd1DateMsg
	 */
   protected void serializeHd1DateMsg(char[] hd1DateMsg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd1DateMsg,0,getStringValue(),beginHd1DateMsg,HD_1_DATE_MSG_LEN);
       localHd1DateMsgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd1DateMsgConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshHd1DateMsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd1DateMsg() {	 
   		return (substring(getStringValue(),beginHd1DateMsg,beginHd1DateMsg + HD_1_DATE_MSG_LEN));
   	}
     int localHd12MmCounter = -1;
     public boolean isHd12MmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd12MmCounter != sharedCounter;
         localHd12MmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of hd12Mm
	 *	@return hd12Mm
	 */
	public char[]  getHd12MmString() {
	     return getCharArray(beginHd12Mm,HD_12_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean hd12MmIsNumeric() {
	    return isNumeric(beginHd12Mm
	                    ,beginHd12Mm + HD_12_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int HD_12_MM_LEN = 2;
  	/**
	 * serializeHd12Mm
	 */
	protected void serializeHd12Mm(int hd12Mm) {
		 putNumber(beginHd12Mm,hd12Mm,HD_12_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localHd12MmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeHd12Mm
	 */
   	protected  int serializeHd12Mm(char[] value) {
	    int  hd12Mm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    hd12Mm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginHd12Mm
		       ,2
		      );
		 localHd12MmCounter = shareString.getSerializedField().getModifiedCounter();
		return  hd12Mm;
    }

   protected int checkHd12MmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshHd12Mm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshHd12Mm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginHd12Mm
			                 ,HD_12_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("hd12Mm", beginHd12Mm,HD_12_MM_LEN);
    }
   	}
     int localHd12DdCounter = -1;
     public boolean isHd12DdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd12DdCounter != sharedCounter;
         localHd12DdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of hd12Dd
	 *	@return hd12Dd
	 */
	public char[]  getHd12DdString() {
	     return getCharArray(beginHd12Dd,HD_12_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean hd12DdIsNumeric() {
	    return isNumeric(beginHd12Dd
	                    ,beginHd12Dd + HD_12_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int HD_12_DD_LEN = 2;
  	/**
	 * serializeHd12Dd
	 */
	protected void serializeHd12Dd(int hd12Dd) {
		 putNumber(beginHd12Dd,hd12Dd,HD_12_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localHd12DdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeHd12Dd
	 */
   	protected  int serializeHd12Dd(char[] value) {
	    int  hd12Dd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    hd12Dd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginHd12Dd
		       ,2
		      );
		 localHd12DdCounter = shareString.getSerializedField().getModifiedCounter();
		return  hd12Dd;
    }

   protected int checkHd12DdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshHd12Dd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshHd12Dd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginHd12Dd
			                 ,HD_12_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("hd12Dd", beginHd12Dd,HD_12_DD_LEN);
    }
   	}
     int localHd12YyCounter = -1;
     public boolean isHd12YyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd12YyCounter != sharedCounter;
         localHd12YyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of hd12Yy
	 *	@return hd12Yy
	 */
	public char[]  getHd12YyString() {
	     return getCharArray(beginHd12Yy,HD_12_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean hd12YyIsNumeric() {
	    return isNumeric(beginHd12Yy
	                    ,beginHd12Yy + HD_12_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int HD_12_YY_LEN = 2;
  	/**
	 * serializeHd12Yy
	 */
	protected void serializeHd12Yy(int hd12Yy) {
		 putNumber(beginHd12Yy,hd12Yy,HD_12_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localHd12YyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeHd12Yy
	 */
   	protected  int serializeHd12Yy(char[] value) {
	    int  hd12Yy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    hd12Yy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginHd12Yy
		       ,2
		      );
		 localHd12YyCounter = shareString.getSerializedField().getModifiedCounter();
		return  hd12Yy;
    }

   protected int checkHd12YyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshHd12Yy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshHd12Yy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginHd12Yy
			                 ,HD_12_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("hd12Yy", beginHd12Yy,HD_12_YY_LEN);
    }
   	}




}
  
