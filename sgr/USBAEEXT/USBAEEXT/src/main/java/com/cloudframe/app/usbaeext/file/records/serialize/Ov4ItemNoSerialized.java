package com.cloudframe.app.usbaeext.file.records.serialize;

/**
*  The class Ov4ItemNoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ov4ItemNoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ov4ItemNoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OV_4_ITEM_NO_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOv4InJulYear;
            protected  int beginOv4InJulDay;
            protected  int beginOv4InBatch;
            protected  int beginOv4InSeqInBat;
	
	/**
	* Constructor for Ov4ItemNoSerialized
	**/
    public Ov4ItemNoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ov4ItemNoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4ItemNoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ov4ItemNoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Ov4ItemNoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Ov4ItemNoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OV_4_ITEM_NO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOv4InJulYear = getStartOffset() + 0;	// set offset for serialization
  
             beginOv4InJulDay = getStartOffset() + 1;	// set offset for serialization
  
             beginOv4InBatch = getStartOffset() + 4;	// set offset for serialization
  
             beginOv4InSeqInBat = getStartOffset() + 7;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOv4InJulYearCounter = -1;
     public boolean isOv4InJulYearModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4InJulYearCounter != sharedCounter;
         localOv4InJulYearCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4InJulYear
	 *	@return ov4InJulYear
	 */
	public char[]  getOv4InJulYearString() {
	     return getCharArray(beginOv4InJulYear,OV_4_IN_JUL_YEAR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4InJulYearIsNumeric() {
	    return isNumeric(beginOv4InJulYear
	                    ,beginOv4InJulYear + OV_4_IN_JUL_YEAR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_IN_JUL_YEAR_LEN = 1;
  	/**
	 * serializeOv4InJulYear
	 */
	protected void serializeOv4InJulYear(int ov4InJulYear) {
		 putNumber(beginOv4InJulYear,ov4InJulYear,OV_4_IN_JUL_YEAR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4InJulYearCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4InJulYear
	 */
   	protected  int serializeOv4InJulYear(char[] value) {
	    int  ov4InJulYear;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4InJulYear = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginOv4InJulYear
		       ,1
		      );
		 localOv4InJulYearCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4InJulYear;
    }

   protected int checkOv4InJulYearMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4InJulYear is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOv4InJulYear() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOv4InJulYear
			                 ,OV_4_IN_JUL_YEAR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4InJulYear", beginOv4InJulYear,OV_4_IN_JUL_YEAR_LEN);
    }
   	}
     int localOv4InJulDayCounter = -1;
     public boolean isOv4InJulDayModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4InJulDayCounter != sharedCounter;
         localOv4InJulDayCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4InJulDay
	 *	@return ov4InJulDay
	 */
	public char[]  getOv4InJulDayString() {
	     return getCharArray(beginOv4InJulDay,OV_4_IN_JUL_DAY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4InJulDayIsNumeric() {
	    return isNumeric(beginOv4InJulDay
	                    ,beginOv4InJulDay + OV_4_IN_JUL_DAY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_IN_JUL_DAY_LEN = 3;
  	/**
	 * serializeOv4InJulDay
	 */
	protected void serializeOv4InJulDay(int ov4InJulDay) {
		 putNumber(beginOv4InJulDay,ov4InJulDay,OV_4_IN_JUL_DAY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4InJulDayCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4InJulDay
	 */
   	protected  int serializeOv4InJulDay(char[] value) {
	    int  ov4InJulDay;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4InJulDay = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginOv4InJulDay
		       ,3
		      );
		 localOv4InJulDayCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4InJulDay;
    }

   protected int checkOv4InJulDayMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4InJulDay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOv4InJulDay() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOv4InJulDay
			                 ,OV_4_IN_JUL_DAY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4InJulDay", beginOv4InJulDay,OV_4_IN_JUL_DAY_LEN);
    }
   	}
     int localOv4InBatchCounter = -1;
     public boolean isOv4InBatchModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4InBatchCounter != sharedCounter;
         localOv4InBatchCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4InBatch
	 *	@return ov4InBatch
	 */
	public char[]  getOv4InBatchString() {
	     return getCharArray(beginOv4InBatch,OV_4_IN_BATCH_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4InBatchIsNumeric() {
	    return isNumeric(beginOv4InBatch
	                    ,beginOv4InBatch + OV_4_IN_BATCH_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_IN_BATCH_LEN = 3;
  	/**
	 * serializeOv4InBatch
	 */
	protected void serializeOv4InBatch(int ov4InBatch) {
		 putNumber(beginOv4InBatch,ov4InBatch,OV_4_IN_BATCH_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4InBatchCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4InBatch
	 */
   	protected  int serializeOv4InBatch(char[] value) {
	    int  ov4InBatch;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4InBatch = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginOv4InBatch
		       ,3
		      );
		 localOv4InBatchCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4InBatch;
    }

   protected int checkOv4InBatchMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4InBatch is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOv4InBatch() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOv4InBatch
			                 ,OV_4_IN_BATCH_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4InBatch", beginOv4InBatch,OV_4_IN_BATCH_LEN);
    }
   	}
     int localOv4InSeqInBatCounter = -1;
     public boolean isOv4InSeqInBatModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4InSeqInBatCounter != sharedCounter;
         localOv4InSeqInBatCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4InSeqInBat
	 *	@return ov4InSeqInBat
	 */
	public char[]  getOv4InSeqInBatString() {
	     return getCharArray(beginOv4InSeqInBat,OV_4_IN_SEQ_IN_BAT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4InSeqInBatIsNumeric() {
	    return isNumeric(beginOv4InSeqInBat
	                    ,beginOv4InSeqInBat + OV_4_IN_SEQ_IN_BAT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_IN_SEQ_IN_BAT_LEN = 3;
  	/**
	 * serializeOv4InSeqInBat
	 */
	protected void serializeOv4InSeqInBat(int ov4InSeqInBat) {
		 putNumber(beginOv4InSeqInBat,ov4InSeqInBat,OV_4_IN_SEQ_IN_BAT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4InSeqInBatCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4InSeqInBat
	 */
   	protected  int serializeOv4InSeqInBat(char[] value) {
	    int  ov4InSeqInBat;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4InSeqInBat = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginOv4InSeqInBat
		       ,3
		      );
		 localOv4InSeqInBatCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4InSeqInBat;
    }

   protected int checkOv4InSeqInBatMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4InSeqInBat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOv4InSeqInBat() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOv4InSeqInBat
			                 ,OV_4_IN_SEQ_IN_BAT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4InSeqInBat", beginOv4InSeqInBat,OV_4_IN_SEQ_IN_BAT_LEN);
    }
   	}




}
  
