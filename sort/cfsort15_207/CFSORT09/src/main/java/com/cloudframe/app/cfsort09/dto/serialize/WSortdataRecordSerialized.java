package com.cloudframe.app.cfsort09.dto.serialize;

/**
*  The class WSortdataRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WSortdataRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WSortdataRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_SORTDATA_RECORD_LENGTH = 59;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWSortdataKeyZoneDec;
	
	/**
	* Constructor for WSortdataRecordSerialized
	**/
    public WSortdataRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WSortdataRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_SORTDATA_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWSortdataKeyZoneDec = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWSortdataKeyZoneDecCounter = -1;
     public boolean isWSortdataKeyZoneDecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWSortdataKeyZoneDecCounter != sharedCounter;
         localWSortdataKeyZoneDecCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wSortdataKeyZoneDec
	 *	@return wSortdataKeyZoneDec
	 */
	public char[]  getWSortdataKeyZoneDecString() {
	     return getCharArray(beginWSortdataKeyZoneDec,W_SORTDATA_KEY_ZONE_DEC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wSortdataKeyZoneDecIsNumeric() {
	    return isNumeric(beginWSortdataKeyZoneDec
	                    ,beginWSortdataKeyZoneDec + W_SORTDATA_KEY_ZONE_DEC_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int W_SORTDATA_KEY_ZONE_DEC_LEN = 18;
  	/**
	 * serializeWSortdataKeyZoneDec
	 */
	protected void serializeWSortdataKeyZoneDec(long wSortdataKeyZoneDec) {
		 putNumber(beginWSortdataKeyZoneDec,wSortdataKeyZoneDec,W_SORTDATA_KEY_ZONE_DEC_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWSortdataKeyZoneDecCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWSortdataKeyZoneDec
	 */
   	protected  long serializeWSortdataKeyZoneDec(char[] value) {
	    long  wSortdataKeyZoneDec;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wSortdataKeyZoneDec = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginWSortdataKeyZoneDec
		       ,18
		      );
		 localWSortdataKeyZoneDecCounter = shareString.getSerializedField().getModifiedCounter();
		return  wSortdataKeyZoneDec;
    }

   protected long checkWSortdataKeyZoneDecMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshWSortdataKeyZoneDec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWSortdataKeyZoneDec() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginWSortdataKeyZoneDec
			                 ,W_SORTDATA_KEY_ZONE_DEC_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wSortdataKeyZoneDec", beginWSortdataKeyZoneDec,W_SORTDATA_KEY_ZONE_DEC_LEN);
    }
   	}




}
  
