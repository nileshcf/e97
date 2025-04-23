package com.cloudframe.app.init1.dto.serialize;

/**
*  The class StartDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class StartDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(StartDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int START_DT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginStartDtMm;
            protected  int beginStartDtYyyy;
	
	/**
	* Constructor for StartDtSerialized
	**/
    public StartDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for StartDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StartDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this StartDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,18); // serialize this field at offset 18 by default 
    }
    
	/**
	* sets parent for this StartDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 18 by default
    }    
	/**
	* initializes the field in StartDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(START_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginStartDtMm = getStartOffset() + 0;	// set offset for serialization
  
  
             beginStartDtYyyy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localStartDtMmCounter = -1;
     public boolean isStartDtMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStartDtMmCounter != sharedCounter;
         localStartDtMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of startDtMm
	 *	@return startDtMm
	 */
	public char[]  getStartDtMmString() {
	     return getCharArray(beginStartDtMm,START_DT_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean startDtMmIsNumeric() {
	    return isNumeric(beginStartDtMm
	                    ,beginStartDtMm + START_DT_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int START_DT_MM_LEN = 2;
  	/**
	 * serializeStartDtMm
	 */
	protected void serializeStartDtMm(int startDtMm) {
		 putNumber(beginStartDtMm,startDtMm,START_DT_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localStartDtMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeStartDtMm
	 */
   	protected  int serializeStartDtMm(char[] value) {
	    int  startDtMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    startDtMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginStartDtMm
		       ,2
		      );
		 localStartDtMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  startDtMm;
    }

   protected int checkStartDtMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshStartDtMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshStartDtMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginStartDtMm
			                 ,START_DT_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("startDtMm", beginStartDtMm,START_DT_MM_LEN);
    }
   	}
     int localStartDtYyyyCounter = -1;
     public boolean isStartDtYyyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStartDtYyyyCounter != sharedCounter;
         localStartDtYyyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of startDtYyyy
	 *	@return startDtYyyy
	 */
	public char[]  getStartDtYyyyString() {
	     return getCharArray(beginStartDtYyyy,START_DT_YYYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean startDtYyyyIsNumeric() {
	    return isNumeric(beginStartDtYyyy
	                    ,beginStartDtYyyy + START_DT_YYYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int START_DT_YYYY_LEN = 4;
  	/**
	 * serializeStartDtYyyy
	 */
	protected void serializeStartDtYyyy(int startDtYyyy) {
		 putNumber(beginStartDtYyyy,startDtYyyy,START_DT_YYYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localStartDtYyyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeStartDtYyyy
	 */
   	protected  int serializeStartDtYyyy(char[] value) {
	    int  startDtYyyy;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    startDtYyyy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginStartDtYyyy
		       ,4
		      );
		 localStartDtYyyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  startDtYyyy;
    }

   protected int checkStartDtYyyyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshStartDtYyyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshStartDtYyyy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginStartDtYyyy
			                 ,START_DT_YYYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("startDtYyyy", beginStartDtYyyy,START_DT_YYYY_LEN);
    }
   	}




}
  
