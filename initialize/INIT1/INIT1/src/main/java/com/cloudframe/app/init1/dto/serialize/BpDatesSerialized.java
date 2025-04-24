package com.cloudframe.app.init1.dto.serialize;

/**
*  The class BpDatesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BpDatesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BpDatesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BP_DATES_LENGTH = 36;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginStartDtIso;
            protected  int beginEndDtIso;
	
	/**
	* Constructor for BpDatesSerialized
	**/
    public BpDatesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BpDatesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BpDatesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BpDatesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,18); // serialize this field at offset 18 by default 
    }
    
	/**
	* sets parent for this BpDatesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 18 by default
    }    
	/**
	* initializes the field in BpDatesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BP_DATES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginStartDtIso = getStartOffset() + 20;	// set offset for serialization
  
             beginEndDtIso = getStartOffset() + 28;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localStartDtIsoCounter = -1;
     public boolean isStartDtIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStartDtIsoCounter != sharedCounter;
         localStartDtIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of startDtIso
	 *	@return startDtIso
	 */
	public char[]  getStartDtIsoString() {
	     return getCharArray(beginStartDtIso,START_DT_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean startDtIsoIsNumeric() {
	    return isNumeric(beginStartDtIso
	                    ,beginStartDtIso + START_DT_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int START_DT_ISO_LEN = 8;
  	/**
	 * serializeStartDtIso
	 */
	protected void serializeStartDtIso(long startDtIso) {
		 putNumber(beginStartDtIso,startDtIso,START_DT_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localStartDtIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeStartDtIso
	 */
   	protected  long serializeStartDtIso(char[] value) {
	    long  startDtIso;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    startDtIso = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginStartDtIso
		       ,8
		      );
		 localStartDtIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  startDtIso;
    }

   protected long checkStartDtIsoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshStartDtIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshStartDtIso() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginStartDtIso
			                 ,START_DT_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("startDtIso", beginStartDtIso,START_DT_ISO_LEN);
    }
   	}
     int localEndDtIsoCounter = -1;
     public boolean isEndDtIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndDtIsoCounter != sharedCounter;
         localEndDtIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of endDtIso
	 *	@return endDtIso
	 */
	public char[]  getEndDtIsoString() {
	     return getCharArray(beginEndDtIso,END_DT_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean endDtIsoIsNumeric() {
	    return isNumeric(beginEndDtIso
	                    ,beginEndDtIso + END_DT_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int END_DT_ISO_LEN = 8;
  	/**
	 * serializeEndDtIso
	 */
	protected void serializeEndDtIso(long endDtIso) {
		 putNumber(beginEndDtIso,endDtIso,END_DT_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEndDtIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEndDtIso
	 */
   	protected  long serializeEndDtIso(char[] value) {
	    long  endDtIso;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    endDtIso = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginEndDtIso
		       ,8
		      );
		 localEndDtIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  endDtIso;
    }

   protected long checkEndDtIsoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshEndDtIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshEndDtIso() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginEndDtIso
			                 ,END_DT_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("endDtIso", beginEndDtIso,END_DT_ISO_LEN);
    }
   	}




}
  
