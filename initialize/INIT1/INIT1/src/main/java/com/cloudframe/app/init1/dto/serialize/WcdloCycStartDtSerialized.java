package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WcdloCycStartDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WcdloCycStartDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcdloCycStartDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WCDLO_CYC_START_DT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcdloCycStartDtMm;
            protected  int beginWcdloCycStartDtDd;
            protected  int beginWcdloCycStartDtYyyy;
	
	/**
	* Constructor for WcdloCycStartDtSerialized
	**/
    public WcdloCycStartDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcdloCycStartDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloCycStartDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcdloCycStartDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,10); // serialize this field at offset 10 by default 
    }
    
	/**
	* sets parent for this WcdloCycStartDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 10 by default
    }    
	/**
	* initializes the field in WcdloCycStartDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WCDLO_CYC_START_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWcdloCycStartDtMm = getStartOffset() + 0;	// set offset for serialization
  
  
             beginWcdloCycStartDtDd = getStartOffset() + 3;	// set offset for serialization
  
  
             beginWcdloCycStartDtYyyy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWcdloCycStartDtMmCounter = -1;
     public boolean isWcdloCycStartDtMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloCycStartDtMmCounter != sharedCounter;
         localWcdloCycStartDtMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloCycStartDtMm
	 *	@return wcdloCycStartDtMm
	 */
	public char[]  getWcdloCycStartDtMmString() {
	     return getCharArray(beginWcdloCycStartDtMm,WCDLO_CYC_START_DT_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloCycStartDtMmIsNumeric() {
	    return isNumeric(beginWcdloCycStartDtMm
	                    ,beginWcdloCycStartDtMm + WCDLO_CYC_START_DT_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_CYC_START_DT_MM_LEN = 2;
  	/**
	 * serializeWcdloCycStartDtMm
	 */
	protected void serializeWcdloCycStartDtMm(int wcdloCycStartDtMm) {
		 putNumber(beginWcdloCycStartDtMm,wcdloCycStartDtMm,WCDLO_CYC_START_DT_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloCycStartDtMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloCycStartDtMm
	 */
   	protected  int serializeWcdloCycStartDtMm(char[] value) {
	    int  wcdloCycStartDtMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloCycStartDtMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWcdloCycStartDtMm
		       ,2
		      );
		 localWcdloCycStartDtMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloCycStartDtMm;
    }

   protected int checkWcdloCycStartDtMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloCycStartDtMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdloCycStartDtMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdloCycStartDtMm
			                 ,WCDLO_CYC_START_DT_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloCycStartDtMm", beginWcdloCycStartDtMm,WCDLO_CYC_START_DT_MM_LEN);
    }
   	}
     int localWcdloCycStartDtDdCounter = -1;
     public boolean isWcdloCycStartDtDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloCycStartDtDdCounter != sharedCounter;
         localWcdloCycStartDtDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloCycStartDtDd
	 *	@return wcdloCycStartDtDd
	 */
	public char[]  getWcdloCycStartDtDdString() {
	     return getCharArray(beginWcdloCycStartDtDd,WCDLO_CYC_START_DT_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloCycStartDtDdIsNumeric() {
	    return isNumeric(beginWcdloCycStartDtDd
	                    ,beginWcdloCycStartDtDd + WCDLO_CYC_START_DT_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_CYC_START_DT_DD_LEN = 2;
  	/**
	 * serializeWcdloCycStartDtDd
	 */
	protected void serializeWcdloCycStartDtDd(int wcdloCycStartDtDd) {
		 putNumber(beginWcdloCycStartDtDd,wcdloCycStartDtDd,WCDLO_CYC_START_DT_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloCycStartDtDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloCycStartDtDd
	 */
   	protected  int serializeWcdloCycStartDtDd(char[] value) {
	    int  wcdloCycStartDtDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloCycStartDtDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWcdloCycStartDtDd
		       ,2
		      );
		 localWcdloCycStartDtDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloCycStartDtDd;
    }

   protected int checkWcdloCycStartDtDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloCycStartDtDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdloCycStartDtDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdloCycStartDtDd
			                 ,WCDLO_CYC_START_DT_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloCycStartDtDd", beginWcdloCycStartDtDd,WCDLO_CYC_START_DT_DD_LEN);
    }
   	}
     int localWcdloCycStartDtYyyyCounter = -1;
     public boolean isWcdloCycStartDtYyyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloCycStartDtYyyyCounter != sharedCounter;
         localWcdloCycStartDtYyyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloCycStartDtYyyy
	 *	@return wcdloCycStartDtYyyy
	 */
	public char[]  getWcdloCycStartDtYyyyString() {
	     return getCharArray(beginWcdloCycStartDtYyyy,WCDLO_CYC_START_DT_YYYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloCycStartDtYyyyIsNumeric() {
	    return isNumeric(beginWcdloCycStartDtYyyy
	                    ,beginWcdloCycStartDtYyyy + WCDLO_CYC_START_DT_YYYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_CYC_START_DT_YYYY_LEN = 4;
  	/**
	 * serializeWcdloCycStartDtYyyy
	 */
	protected void serializeWcdloCycStartDtYyyy(int wcdloCycStartDtYyyy) {
		 putNumber(beginWcdloCycStartDtYyyy,wcdloCycStartDtYyyy,WCDLO_CYC_START_DT_YYYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloCycStartDtYyyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloCycStartDtYyyy
	 */
   	protected  int serializeWcdloCycStartDtYyyy(char[] value) {
	    int  wcdloCycStartDtYyyy;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloCycStartDtYyyy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginWcdloCycStartDtYyyy
		       ,4
		      );
		 localWcdloCycStartDtYyyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloCycStartDtYyyy;
    }

   protected int checkWcdloCycStartDtYyyyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloCycStartDtYyyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdloCycStartDtYyyy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdloCycStartDtYyyy
			                 ,WCDLO_CYC_START_DT_YYYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloCycStartDtYyyy", beginWcdloCycStartDtYyyy,WCDLO_CYC_START_DT_YYYY_LEN);
    }
   	}




}
  
