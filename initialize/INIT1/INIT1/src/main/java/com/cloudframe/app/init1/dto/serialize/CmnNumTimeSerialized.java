package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnNumTimeSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnNumTimeSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnNumTimeSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_NUM_TIME_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnNumTimeHh;
            protected  int beginCmnNumTimeMm;
            protected  int beginCmnNumTimeSs;
	
	/**
	* Constructor for CmnNumTimeSerialized
	**/
    public CmnNumTimeSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnNumTimeSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnNumTimeSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnNumTimeSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1041); // serialize this field at offset 1041 by default 
    }
    
	/**
	* sets parent for this CmnNumTimeSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1041 by default
    }    
	/**
	* initializes the field in CmnNumTimeSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_NUM_TIME_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnNumTimeHh = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnNumTimeMm = getStartOffset() + 2;	// set offset for serialization
  
             beginCmnNumTimeSs = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnNumTimeHhCounter = -1;
     public boolean isCmnNumTimeHhModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnNumTimeHhCounter != sharedCounter;
         localCmnNumTimeHhCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnNumTimeHh
	 *	@return cmnNumTimeHh
	 */
	public char[]  getCmnNumTimeHhString() {
	     return getCharArray(beginCmnNumTimeHh,CMN_NUM_TIME_HH_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnNumTimeHhIsNumeric() {
	    return isNumeric(beginCmnNumTimeHh
	                    ,beginCmnNumTimeHh + CMN_NUM_TIME_HH_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_NUM_TIME_HH_LEN = 2;
  	/**
	 * serializeCmnNumTimeHh
	 */
	protected void serializeCmnNumTimeHh(int cmnNumTimeHh) {
		 putNumber(beginCmnNumTimeHh,cmnNumTimeHh,CMN_NUM_TIME_HH_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnNumTimeHhCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnNumTimeHh
	 */
   	protected  int serializeCmnNumTimeHh(char[] value) {
	    int  cmnNumTimeHh;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnNumTimeHh = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnNumTimeHh
		       ,2
		      );
		 localCmnNumTimeHhCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnNumTimeHh;
    }

   protected int checkCmnNumTimeHhMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnNumTimeHh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnNumTimeHh() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnNumTimeHh
			                 ,CMN_NUM_TIME_HH_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnNumTimeHh", beginCmnNumTimeHh,CMN_NUM_TIME_HH_LEN);
    }
   	}
     int localCmnNumTimeMmCounter = -1;
     public boolean isCmnNumTimeMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnNumTimeMmCounter != sharedCounter;
         localCmnNumTimeMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnNumTimeMm
	 *	@return cmnNumTimeMm
	 */
	public char[]  getCmnNumTimeMmString() {
	     return getCharArray(beginCmnNumTimeMm,CMN_NUM_TIME_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnNumTimeMmIsNumeric() {
	    return isNumeric(beginCmnNumTimeMm
	                    ,beginCmnNumTimeMm + CMN_NUM_TIME_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_NUM_TIME_MM_LEN = 2;
  	/**
	 * serializeCmnNumTimeMm
	 */
	protected void serializeCmnNumTimeMm(int cmnNumTimeMm) {
		 putNumber(beginCmnNumTimeMm,cmnNumTimeMm,CMN_NUM_TIME_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnNumTimeMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnNumTimeMm
	 */
   	protected  int serializeCmnNumTimeMm(char[] value) {
	    int  cmnNumTimeMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnNumTimeMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnNumTimeMm
		       ,2
		      );
		 localCmnNumTimeMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnNumTimeMm;
    }

   protected int checkCmnNumTimeMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnNumTimeMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnNumTimeMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnNumTimeMm
			                 ,CMN_NUM_TIME_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnNumTimeMm", beginCmnNumTimeMm,CMN_NUM_TIME_MM_LEN);
    }
   	}
     int localCmnNumTimeSsCounter = -1;
     public boolean isCmnNumTimeSsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnNumTimeSsCounter != sharedCounter;
         localCmnNumTimeSsCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnNumTimeSs
	 *	@return cmnNumTimeSs
	 */
	public char[]  getCmnNumTimeSsString() {
	     return getCharArray(beginCmnNumTimeSs,CMN_NUM_TIME_SS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnNumTimeSsIsNumeric() {
	    return isNumeric(beginCmnNumTimeSs
	                    ,beginCmnNumTimeSs + CMN_NUM_TIME_SS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_NUM_TIME_SS_LEN = 2;
  	/**
	 * serializeCmnNumTimeSs
	 */
	protected void serializeCmnNumTimeSs(int cmnNumTimeSs) {
		 putNumber(beginCmnNumTimeSs,cmnNumTimeSs,CMN_NUM_TIME_SS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnNumTimeSsCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnNumTimeSs
	 */
   	protected  int serializeCmnNumTimeSs(char[] value) {
	    int  cmnNumTimeSs;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnNumTimeSs = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnNumTimeSs
		       ,2
		      );
		 localCmnNumTimeSsCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnNumTimeSs;
    }

   protected int checkCmnNumTimeSsMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnNumTimeSs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnNumTimeSs() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnNumTimeSs
			                 ,CMN_NUM_TIME_SS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnNumTimeSs", beginCmnNumTimeSs,CMN_NUM_TIME_SS_LEN);
    }
   	}




}
  
