package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnConvertedTimeFormatsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnConvertedTimeFormatsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnConvertedTimeFormatsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_CONVERTED_TIME_FORMATS_LENGTH = 29;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnConvNumTime;
            protected  int beginCmnConvAmPmTime;
            protected  int beginCmnConvJisTime;
            protected  int beginCmnConvIsoTime;
	
	/**
	* Constructor for CmnConvertedTimeFormatsSerialized
	**/
    public CmnConvertedTimeFormatsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnConvertedTimeFormatsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnConvertedTimeFormatsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnConvertedTimeFormatsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1048); // serialize this field at offset 1048 by default 
    }
    
	/**
	* sets parent for this CmnConvertedTimeFormatsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1048 by default
    }    
	/**
	* initializes the field in CmnConvertedTimeFormatsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_CONVERTED_TIME_FORMATS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnConvNumTime = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnConvAmPmTime = getStartOffset() + 6;	// set offset for serialization
  
             beginCmnConvJisTime = getStartOffset() + 13;	// set offset for serialization
  
             beginCmnConvIsoTime = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnConvNumTimeCounter = -1;
     public boolean isCmnConvNumTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnConvNumTimeCounter != sharedCounter;
         localCmnConvNumTimeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnConvNumTime
	 *	@return cmnConvNumTime
	 */
	public char[]  getCmnConvNumTimeString() {
	     return getCharArray(beginCmnConvNumTime,CMN_CONV_NUM_TIME_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnConvNumTimeIsNumeric() {
	    return isNumeric(beginCmnConvNumTime
	                    ,beginCmnConvNumTime + CMN_CONV_NUM_TIME_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_CONV_NUM_TIME_LEN = 6;
  	/**
	 * serializeCmnConvNumTime
	 */
	protected void serializeCmnConvNumTime(long cmnConvNumTime) {
		 putNumber(beginCmnConvNumTime,cmnConvNumTime,CMN_CONV_NUM_TIME_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnConvNumTimeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnConvNumTime
	 */
   	protected  long serializeCmnConvNumTime(char[] value) {
	    long  cmnConvNumTime;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnConvNumTime = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginCmnConvNumTime
		       ,6
		      );
		 localCmnConvNumTimeCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnConvNumTime;
    }

   protected long checkCmnConvNumTimeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnConvNumTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCmnConvNumTime() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCmnConvNumTime
			                 ,CMN_CONV_NUM_TIME_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnConvNumTime", beginCmnConvNumTime,CMN_CONV_NUM_TIME_LEN);
    }
   	}
     int localCmnConvAmPmTimeCounter = -1;
     public boolean isCmnConvAmPmTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnConvAmPmTimeCounter != sharedCounter;
         localCmnConvAmPmTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_CONV_AM_PM_TIME_LEN = 7;
	/**
	 * 	serialize this CmnConvAmPmTime
	 */
   protected void serializeCmnConvAmPmTime(char[] cmnConvAmPmTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnConvAmPmTime,0,getStringValue(),beginCmnConvAmPmTime,CMN_CONV_AM_PM_TIME_LEN);
       localCmnConvAmPmTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnConvAmPmTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshCmnConvAmPmTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnConvAmPmTime() {	 
   		return (substring(getStringValue(),beginCmnConvAmPmTime,beginCmnConvAmPmTime + CMN_CONV_AM_PM_TIME_LEN));
   	}
     int localCmnConvJisTimeCounter = -1;
     public boolean isCmnConvJisTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnConvJisTimeCounter != sharedCounter;
         localCmnConvJisTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_CONV_JIS_TIME_LEN = 8;
	/**
	 * 	serialize this CmnConvJisTime
	 */
   protected void serializeCmnConvJisTime(char[] cmnConvJisTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnConvJisTime,0,getStringValue(),beginCmnConvJisTime,CMN_CONV_JIS_TIME_LEN);
       localCmnConvJisTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnConvJisTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCmnConvJisTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnConvJisTime() {	 
   		return (substring(getStringValue(),beginCmnConvJisTime,beginCmnConvJisTime + CMN_CONV_JIS_TIME_LEN));
   	}
     int localCmnConvIsoTimeCounter = -1;
     public boolean isCmnConvIsoTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnConvIsoTimeCounter != sharedCounter;
         localCmnConvIsoTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_CONV_ISO_TIME_LEN = 8;
	/**
	 * 	serialize this CmnConvIsoTime
	 */
   protected void serializeCmnConvIsoTime(char[] cmnConvIsoTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnConvIsoTime,0,getStringValue(),beginCmnConvIsoTime,CMN_CONV_ISO_TIME_LEN);
       localCmnConvIsoTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnConvIsoTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCmnConvIsoTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnConvIsoTime() {	 
   		return (substring(getStringValue(),beginCmnConvIsoTime,beginCmnConvIsoTime + CMN_CONV_ISO_TIME_LEN));
   	}




}
  
