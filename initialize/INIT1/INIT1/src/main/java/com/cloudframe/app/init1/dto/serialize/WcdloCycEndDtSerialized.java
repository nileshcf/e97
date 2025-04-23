package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WcdloCycEndDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WcdloCycEndDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcdloCycEndDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WCDLO_CYC_END_DT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcdloCycEndDtMm;
            protected  int beginWcdloCycEndDtDd;
            protected  int beginWcdloCycEndDtYyyy;
	
	/**
	* Constructor for WcdloCycEndDtSerialized
	**/
    public WcdloCycEndDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcdloCycEndDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloCycEndDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcdloCycEndDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,20); // serialize this field at offset 20 by default 
    }
    
	/**
	* sets parent for this WcdloCycEndDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 20 by default
    }    
	/**
	* initializes the field in WcdloCycEndDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WCDLO_CYC_END_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWcdloCycEndDtMm = getStartOffset() + 0;	// set offset for serialization
  
  
             beginWcdloCycEndDtDd = getStartOffset() + 3;	// set offset for serialization
  
  
             beginWcdloCycEndDtYyyy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWcdloCycEndDtMmCounter = -1;
     public boolean isWcdloCycEndDtMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloCycEndDtMmCounter != sharedCounter;
         localWcdloCycEndDtMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloCycEndDtMm
	 *	@return wcdloCycEndDtMm
	 */
	public char[]  getWcdloCycEndDtMmString() {
	     return getCharArray(beginWcdloCycEndDtMm,WCDLO_CYC_END_DT_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloCycEndDtMmIsNumeric() {
	    return isNumeric(beginWcdloCycEndDtMm
	                    ,beginWcdloCycEndDtMm + WCDLO_CYC_END_DT_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_CYC_END_DT_MM_LEN = 2;
  	/**
	 * serializeWcdloCycEndDtMm
	 */
	protected void serializeWcdloCycEndDtMm(int wcdloCycEndDtMm) {
		 putNumber(beginWcdloCycEndDtMm,wcdloCycEndDtMm,WCDLO_CYC_END_DT_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloCycEndDtMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloCycEndDtMm
	 */
   	protected  int serializeWcdloCycEndDtMm(char[] value) {
	    int  wcdloCycEndDtMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloCycEndDtMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWcdloCycEndDtMm
		       ,2
		      );
		 localWcdloCycEndDtMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloCycEndDtMm;
    }

   protected int checkWcdloCycEndDtMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloCycEndDtMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdloCycEndDtMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdloCycEndDtMm
			                 ,WCDLO_CYC_END_DT_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloCycEndDtMm", beginWcdloCycEndDtMm,WCDLO_CYC_END_DT_MM_LEN);
    }
   	}
     int localWcdloCycEndDtDdCounter = -1;
     public boolean isWcdloCycEndDtDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloCycEndDtDdCounter != sharedCounter;
         localWcdloCycEndDtDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloCycEndDtDd
	 *	@return wcdloCycEndDtDd
	 */
	public char[]  getWcdloCycEndDtDdString() {
	     return getCharArray(beginWcdloCycEndDtDd,WCDLO_CYC_END_DT_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloCycEndDtDdIsNumeric() {
	    return isNumeric(beginWcdloCycEndDtDd
	                    ,beginWcdloCycEndDtDd + WCDLO_CYC_END_DT_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_CYC_END_DT_DD_LEN = 2;
  	/**
	 * serializeWcdloCycEndDtDd
	 */
	protected void serializeWcdloCycEndDtDd(int wcdloCycEndDtDd) {
		 putNumber(beginWcdloCycEndDtDd,wcdloCycEndDtDd,WCDLO_CYC_END_DT_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloCycEndDtDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloCycEndDtDd
	 */
   	protected  int serializeWcdloCycEndDtDd(char[] value) {
	    int  wcdloCycEndDtDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloCycEndDtDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWcdloCycEndDtDd
		       ,2
		      );
		 localWcdloCycEndDtDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloCycEndDtDd;
    }

   protected int checkWcdloCycEndDtDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloCycEndDtDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdloCycEndDtDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdloCycEndDtDd
			                 ,WCDLO_CYC_END_DT_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloCycEndDtDd", beginWcdloCycEndDtDd,WCDLO_CYC_END_DT_DD_LEN);
    }
   	}
     int localWcdloCycEndDtYyyyCounter = -1;
     public boolean isWcdloCycEndDtYyyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloCycEndDtYyyyCounter != sharedCounter;
         localWcdloCycEndDtYyyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloCycEndDtYyyy
	 *	@return wcdloCycEndDtYyyy
	 */
	public char[]  getWcdloCycEndDtYyyyString() {
	     return getCharArray(beginWcdloCycEndDtYyyy,WCDLO_CYC_END_DT_YYYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloCycEndDtYyyyIsNumeric() {
	    return isNumeric(beginWcdloCycEndDtYyyy
	                    ,beginWcdloCycEndDtYyyy + WCDLO_CYC_END_DT_YYYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_CYC_END_DT_YYYY_LEN = 4;
  	/**
	 * serializeWcdloCycEndDtYyyy
	 */
	protected void serializeWcdloCycEndDtYyyy(int wcdloCycEndDtYyyy) {
		 putNumber(beginWcdloCycEndDtYyyy,wcdloCycEndDtYyyy,WCDLO_CYC_END_DT_YYYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloCycEndDtYyyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloCycEndDtYyyy
	 */
   	protected  int serializeWcdloCycEndDtYyyy(char[] value) {
	    int  wcdloCycEndDtYyyy;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloCycEndDtYyyy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginWcdloCycEndDtYyyy
		       ,4
		      );
		 localWcdloCycEndDtYyyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloCycEndDtYyyy;
    }

   protected int checkWcdloCycEndDtYyyyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloCycEndDtYyyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdloCycEndDtYyyy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdloCycEndDtYyyy
			                 ,WCDLO_CYC_END_DT_YYYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloCycEndDtYyyy", beginWcdloCycEndDtYyyy,WCDLO_CYC_END_DT_YYYY_LEN);
    }
   	}




}
  
