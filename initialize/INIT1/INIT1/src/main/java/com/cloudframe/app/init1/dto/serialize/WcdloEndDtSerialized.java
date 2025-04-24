package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WcdloEndDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WcdloEndDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcdloEndDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WCDLO_END_DT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcdloEndDtMm;
            protected  int beginWcdloEndDtDd;
            protected  int beginWcdloEndDtYyyy;
	
	/**
	* Constructor for WcdloEndDtSerialized
	**/
    public WcdloEndDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcdloEndDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloEndDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcdloEndDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,102); // serialize this field at offset 102 by default 
    }
    
	/**
	* sets parent for this WcdloEndDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 102 by default
    }    
	/**
	* initializes the field in WcdloEndDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WCDLO_END_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWcdloEndDtMm = getStartOffset() + 0;	// set offset for serialization
  
  
             beginWcdloEndDtDd = getStartOffset() + 3;	// set offset for serialization
  
  
             beginWcdloEndDtYyyy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWcdloEndDtMmCounter = -1;
     public boolean isWcdloEndDtMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloEndDtMmCounter != sharedCounter;
         localWcdloEndDtMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloEndDtMm
	 *	@return wcdloEndDtMm
	 */
	public char[]  getWcdloEndDtMmString() {
	     return getCharArray(beginWcdloEndDtMm,WCDLO_END_DT_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloEndDtMmIsNumeric() {
	    return isNumeric(beginWcdloEndDtMm
	                    ,beginWcdloEndDtMm + WCDLO_END_DT_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_END_DT_MM_LEN = 2;
  	/**
	 * serializeWcdloEndDtMm
	 */
	protected void serializeWcdloEndDtMm(int wcdloEndDtMm) {
		 putNumber(beginWcdloEndDtMm,wcdloEndDtMm,WCDLO_END_DT_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloEndDtMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloEndDtMm
	 */
   	protected  int serializeWcdloEndDtMm(char[] value) {
	    int  wcdloEndDtMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloEndDtMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWcdloEndDtMm
		       ,2
		      );
		 localWcdloEndDtMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloEndDtMm;
    }

   protected int checkWcdloEndDtMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloEndDtMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdloEndDtMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdloEndDtMm
			                 ,WCDLO_END_DT_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloEndDtMm", beginWcdloEndDtMm,WCDLO_END_DT_MM_LEN);
    }
   	}
     int localWcdloEndDtDdCounter = -1;
     public boolean isWcdloEndDtDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloEndDtDdCounter != sharedCounter;
         localWcdloEndDtDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloEndDtDd
	 *	@return wcdloEndDtDd
	 */
	public char[]  getWcdloEndDtDdString() {
	     return getCharArray(beginWcdloEndDtDd,WCDLO_END_DT_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloEndDtDdIsNumeric() {
	    return isNumeric(beginWcdloEndDtDd
	                    ,beginWcdloEndDtDd + WCDLO_END_DT_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_END_DT_DD_LEN = 2;
  	/**
	 * serializeWcdloEndDtDd
	 */
	protected void serializeWcdloEndDtDd(int wcdloEndDtDd) {
		 putNumber(beginWcdloEndDtDd,wcdloEndDtDd,WCDLO_END_DT_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloEndDtDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloEndDtDd
	 */
   	protected  int serializeWcdloEndDtDd(char[] value) {
	    int  wcdloEndDtDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloEndDtDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWcdloEndDtDd
		       ,2
		      );
		 localWcdloEndDtDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloEndDtDd;
    }

   protected int checkWcdloEndDtDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloEndDtDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdloEndDtDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdloEndDtDd
			                 ,WCDLO_END_DT_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloEndDtDd", beginWcdloEndDtDd,WCDLO_END_DT_DD_LEN);
    }
   	}
     int localWcdloEndDtYyyyCounter = -1;
     public boolean isWcdloEndDtYyyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloEndDtYyyyCounter != sharedCounter;
         localWcdloEndDtYyyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloEndDtYyyy
	 *	@return wcdloEndDtYyyy
	 */
	public char[]  getWcdloEndDtYyyyString() {
	     return getCharArray(beginWcdloEndDtYyyy,WCDLO_END_DT_YYYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloEndDtYyyyIsNumeric() {
	    return isNumeric(beginWcdloEndDtYyyy
	                    ,beginWcdloEndDtYyyy + WCDLO_END_DT_YYYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_END_DT_YYYY_LEN = 4;
  	/**
	 * serializeWcdloEndDtYyyy
	 */
	protected void serializeWcdloEndDtYyyy(int wcdloEndDtYyyy) {
		 putNumber(beginWcdloEndDtYyyy,wcdloEndDtYyyy,WCDLO_END_DT_YYYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloEndDtYyyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloEndDtYyyy
	 */
   	protected  int serializeWcdloEndDtYyyy(char[] value) {
	    int  wcdloEndDtYyyy;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloEndDtYyyy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginWcdloEndDtYyyy
		       ,4
		      );
		 localWcdloEndDtYyyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloEndDtYyyy;
    }

   protected int checkWcdloEndDtYyyyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloEndDtYyyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdloEndDtYyyy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdloEndDtYyyy
			                 ,WCDLO_END_DT_YYYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloEndDtYyyy", beginWcdloEndDtYyyy,WCDLO_END_DT_YYYY_LEN);
    }
   	}




}
  
