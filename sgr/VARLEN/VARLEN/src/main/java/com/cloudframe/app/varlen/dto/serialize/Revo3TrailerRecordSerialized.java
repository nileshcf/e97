package com.cloudframe.app.varlen.dto.serialize;

/**
*  The class Revo3TrailerRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:42. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Revo3TrailerRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Revo3TrailerRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REVO_3_TRAILER_RECORD_LENGTH = 32;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRevo3TrlrRecordCount;
	
	/**
	* Constructor for Revo3TrailerRecordSerialized
	**/
    public Revo3TrailerRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Revo3TrailerRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Revo3TrailerRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Revo3TrailerRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this Revo3TrailerRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in Revo3TrailerRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REVO_3_TRAILER_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRevo3TrlrRecordCount = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRevo3TrlrRecordCountCounter = -1;
     public boolean isRevo3TrlrRecordCountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRevo3TrlrRecordCountCounter != sharedCounter;
         localRevo3TrlrRecordCountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of revo3TrlrRecordCount
	 *	@return revo3TrlrRecordCount
	 */
	public char[]  getRevo3TrlrRecordCountString() {
	     return getCharArray(beginRevo3TrlrRecordCount,REVO_3_TRLR_RECORD_COUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean revo3TrlrRecordCountIsNumeric() {
	    return isNumeric(beginRevo3TrlrRecordCount
	                    ,beginRevo3TrlrRecordCount + REVO_3_TRLR_RECORD_COUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int REVO_3_TRLR_RECORD_COUNT_LEN = 12;
  	/**
	 * serializeRevo3TrlrRecordCount
	 */
	protected void serializeRevo3TrlrRecordCount(long revo3TrlrRecordCount) {
		 putNumber(beginRevo3TrlrRecordCount,revo3TrlrRecordCount,REVO_3_TRLR_RECORD_COUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRevo3TrlrRecordCountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRevo3TrlrRecordCount
	 */
   	protected  long serializeRevo3TrlrRecordCount(char[] value) {
	    long  revo3TrlrRecordCount;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    revo3TrlrRecordCount = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginRevo3TrlrRecordCount
		       ,12
		      );
		 localRevo3TrlrRecordCountCounter = shareString.getSerializedField().getModifiedCounter();
		return  revo3TrlrRecordCount;
    }

   protected long checkRevo3TrlrRecordCountMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRevo3TrlrRecordCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRevo3TrlrRecordCount() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginRevo3TrlrRecordCount
			                 ,REVO_3_TRLR_RECORD_COUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("revo3TrlrRecordCount", beginRevo3TrlrRecordCount,REVO_3_TRLR_RECORD_COUNT_LEN);
    }
   	}




}
  
