package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class WaWorkOfDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WaWorkOfDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WaWorkOfDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WA_WORK_OF_DATE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWaWodYy;
            protected  int beginWaWodMm;
            protected  int beginWaWodDd;
	
	/**
	* Constructor for WaWorkOfDateSerialized
	**/
    public WaWorkOfDateSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WaWorkOfDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WA_WORK_OF_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWaWodYy = getStartOffset() + 0;	// set offset for serialization
  
             beginWaWodMm = getStartOffset() + 2;	// set offset for serialization
  
             beginWaWodDd = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWaWodYyCounter = -1;
     public boolean isWaWodYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaWodYyCounter != sharedCounter;
         localWaWodYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of waWodYy
	 *	@return waWodYy
	 */
	public char[]  getWaWodYyString() {
	     return getCharArray(beginWaWodYy,WA_WOD_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean waWodYyIsNumeric() {
	    return isNumeric(beginWaWodYy
	                    ,beginWaWodYy + WA_WOD_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WA_WOD_YY_LEN = 2;
  	/**
	 * serializeWaWodYy
	 */
	protected void serializeWaWodYy(int waWodYy) {
		 putNumber(beginWaWodYy,waWodYy,WA_WOD_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWaWodYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWaWodYy
	 */
   	protected  int serializeWaWodYy(char[] value) {
	    int  waWodYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    waWodYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWaWodYy
		       ,2
		      );
		 localWaWodYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  waWodYy;
    }

   protected int checkWaWodYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWaWodYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWaWodYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWaWodYy
			                 ,WA_WOD_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("waWodYy", beginWaWodYy,WA_WOD_YY_LEN);
    }
   	}
     int localWaWodMmCounter = -1;
     public boolean isWaWodMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaWodMmCounter != sharedCounter;
         localWaWodMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of waWodMm
	 *	@return waWodMm
	 */
	public char[]  getWaWodMmString() {
	     return getCharArray(beginWaWodMm,WA_WOD_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean waWodMmIsNumeric() {
	    return isNumeric(beginWaWodMm
	                    ,beginWaWodMm + WA_WOD_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WA_WOD_MM_LEN = 2;
  	/**
	 * serializeWaWodMm
	 */
	protected void serializeWaWodMm(int waWodMm) {
		 putNumber(beginWaWodMm,waWodMm,WA_WOD_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWaWodMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWaWodMm
	 */
   	protected  int serializeWaWodMm(char[] value) {
	    int  waWodMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    waWodMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWaWodMm
		       ,2
		      );
		 localWaWodMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  waWodMm;
    }

   protected int checkWaWodMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWaWodMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWaWodMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWaWodMm
			                 ,WA_WOD_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("waWodMm", beginWaWodMm,WA_WOD_MM_LEN);
    }
   	}
     int localWaWodDdCounter = -1;
     public boolean isWaWodDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaWodDdCounter != sharedCounter;
         localWaWodDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of waWodDd
	 *	@return waWodDd
	 */
	public char[]  getWaWodDdString() {
	     return getCharArray(beginWaWodDd,WA_WOD_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean waWodDdIsNumeric() {
	    return isNumeric(beginWaWodDd
	                    ,beginWaWodDd + WA_WOD_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WA_WOD_DD_LEN = 2;
  	/**
	 * serializeWaWodDd
	 */
	protected void serializeWaWodDd(int waWodDd) {
		 putNumber(beginWaWodDd,waWodDd,WA_WOD_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWaWodDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWaWodDd
	 */
   	protected  int serializeWaWodDd(char[] value) {
	    int  waWodDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    waWodDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWaWodDd
		       ,2
		      );
		 localWaWodDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  waWodDd;
    }

   protected int checkWaWodDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWaWodDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWaWodDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWaWodDd
			                 ,WA_WOD_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("waWodDd", beginWaWodDd,WA_WOD_DD_LEN);
    }
   	}




}
  
