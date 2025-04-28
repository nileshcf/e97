package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WcdloStartDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WcdloStartDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcdloStartDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WCDLO_START_DT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcdloStartDtMm;
            protected  int beginWcdloStartDtDd;
            protected  int beginWcdloStartDtYyyy;
	
	/**
	* Constructor for WcdloStartDtSerialized
	**/
    public WcdloStartDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcdloStartDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloStartDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcdloStartDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,92); // serialize this field at offset 92 by default 
    }
    
	/**
	* sets parent for this WcdloStartDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 92 by default
    }    
	/**
	* initializes the field in WcdloStartDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WCDLO_START_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWcdloStartDtMm = getStartOffset() + 0;	// set offset for serialization
  
  
             beginWcdloStartDtDd = getStartOffset() + 3;	// set offset for serialization
  
  
             beginWcdloStartDtYyyy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWcdloStartDtMmCounter = -1;
     public boolean isWcdloStartDtMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloStartDtMmCounter != sharedCounter;
         localWcdloStartDtMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloStartDtMm
	 *	@return wcdloStartDtMm
	 */
	public char[]  getWcdloStartDtMmString() {
	     return getCharArray(beginWcdloStartDtMm,WCDLO_START_DT_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloStartDtMmIsNumeric() {
	    return isNumeric(beginWcdloStartDtMm
	                    ,beginWcdloStartDtMm + WCDLO_START_DT_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_START_DT_MM_LEN = 2;
  	/**
	 * serializeWcdloStartDtMm
	 */
	protected void serializeWcdloStartDtMm(int wcdloStartDtMm) {
		 putNumber(beginWcdloStartDtMm,wcdloStartDtMm,WCDLO_START_DT_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloStartDtMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloStartDtMm
	 */
   	protected  int serializeWcdloStartDtMm(char[] value) {
	    int  wcdloStartDtMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloStartDtMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWcdloStartDtMm
		       ,2
		      );
		 localWcdloStartDtMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloStartDtMm;
    }

   protected int checkWcdloStartDtMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloStartDtMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdloStartDtMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdloStartDtMm
			                 ,WCDLO_START_DT_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloStartDtMm", beginWcdloStartDtMm,WCDLO_START_DT_MM_LEN);
    }
   	}
     int localWcdloStartDtDdCounter = -1;
     public boolean isWcdloStartDtDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloStartDtDdCounter != sharedCounter;
         localWcdloStartDtDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloStartDtDd
	 *	@return wcdloStartDtDd
	 */
	public char[]  getWcdloStartDtDdString() {
	     return getCharArray(beginWcdloStartDtDd,WCDLO_START_DT_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloStartDtDdIsNumeric() {
	    return isNumeric(beginWcdloStartDtDd
	                    ,beginWcdloStartDtDd + WCDLO_START_DT_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_START_DT_DD_LEN = 2;
  	/**
	 * serializeWcdloStartDtDd
	 */
	protected void serializeWcdloStartDtDd(int wcdloStartDtDd) {
		 putNumber(beginWcdloStartDtDd,wcdloStartDtDd,WCDLO_START_DT_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloStartDtDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloStartDtDd
	 */
   	protected  int serializeWcdloStartDtDd(char[] value) {
	    int  wcdloStartDtDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloStartDtDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWcdloStartDtDd
		       ,2
		      );
		 localWcdloStartDtDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloStartDtDd;
    }

   protected int checkWcdloStartDtDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloStartDtDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdloStartDtDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdloStartDtDd
			                 ,WCDLO_START_DT_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloStartDtDd", beginWcdloStartDtDd,WCDLO_START_DT_DD_LEN);
    }
   	}
     int localWcdloStartDtYyyyCounter = -1;
     public boolean isWcdloStartDtYyyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloStartDtYyyyCounter != sharedCounter;
         localWcdloStartDtYyyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloStartDtYyyy
	 *	@return wcdloStartDtYyyy
	 */
	public char[]  getWcdloStartDtYyyyString() {
	     return getCharArray(beginWcdloStartDtYyyy,WCDLO_START_DT_YYYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloStartDtYyyyIsNumeric() {
	    return isNumeric(beginWcdloStartDtYyyy
	                    ,beginWcdloStartDtYyyy + WCDLO_START_DT_YYYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_START_DT_YYYY_LEN = 4;
  	/**
	 * serializeWcdloStartDtYyyy
	 */
	protected void serializeWcdloStartDtYyyy(int wcdloStartDtYyyy) {
		 putNumber(beginWcdloStartDtYyyy,wcdloStartDtYyyy,WCDLO_START_DT_YYYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloStartDtYyyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloStartDtYyyy
	 */
   	protected  int serializeWcdloStartDtYyyy(char[] value) {
	    int  wcdloStartDtYyyy;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloStartDtYyyy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginWcdloStartDtYyyy
		       ,4
		      );
		 localWcdloStartDtYyyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloStartDtYyyy;
    }

   protected int checkWcdloStartDtYyyyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloStartDtYyyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdloStartDtYyyy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdloStartDtYyyy
			                 ,WCDLO_START_DT_YYYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloStartDtYyyy", beginWcdloStartDtYyyy,WCDLO_START_DT_YYYY_LEN);
    }
   	}




}
  
