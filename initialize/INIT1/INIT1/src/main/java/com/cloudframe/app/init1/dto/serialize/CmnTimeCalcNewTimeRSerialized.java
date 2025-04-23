package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnTimeCalcNewTimeRSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnTimeCalcNewTimeRSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnTimeCalcNewTimeRSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_TIME_CALC_NEW_TIME_R_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnTimeCalcNewTimeHh;
            protected  int beginCmnTimeCalcNewTimeMm;
            protected  int beginCmnTimeCalcNewTimeSs;
	
	/**
	* Constructor for CmnTimeCalcNewTimeRSerialized
	**/
    public CmnTimeCalcNewTimeRSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnTimeCalcNewTimeRSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeCalcNewTimeRSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnTimeCalcNewTimeRSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1047); // serialize this field at offset 1047 by default 
    }
    
	/**
	* sets parent for this CmnTimeCalcNewTimeRSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1047 by default
    }    
	/**
	* initializes the field in CmnTimeCalcNewTimeRSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_TIME_CALC_NEW_TIME_R_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnTimeCalcNewTimeHh = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnTimeCalcNewTimeMm = getStartOffset() + 2;	// set offset for serialization
  
             beginCmnTimeCalcNewTimeSs = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnTimeCalcNewTimeHhCounter = -1;
     public boolean isCmnTimeCalcNewTimeHhModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeCalcNewTimeHhCounter != sharedCounter;
         localCmnTimeCalcNewTimeHhCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnTimeCalcNewTimeHh
	 *	@return cmnTimeCalcNewTimeHh
	 */
	public char[]  getCmnTimeCalcNewTimeHhString() {
	     return getCharArray(beginCmnTimeCalcNewTimeHh,CMN_TIME_CALC_NEW_TIME_HH_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnTimeCalcNewTimeHhIsNumeric() {
	    return isNumeric(beginCmnTimeCalcNewTimeHh
	                    ,beginCmnTimeCalcNewTimeHh + CMN_TIME_CALC_NEW_TIME_HH_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_TIME_CALC_NEW_TIME_HH_LEN = 2;
  	/**
	 * serializeCmnTimeCalcNewTimeHh
	 */
	protected void serializeCmnTimeCalcNewTimeHh(int cmnTimeCalcNewTimeHh) {
		 putNumber(beginCmnTimeCalcNewTimeHh,cmnTimeCalcNewTimeHh,CMN_TIME_CALC_NEW_TIME_HH_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnTimeCalcNewTimeHhCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnTimeCalcNewTimeHh
	 */
   	protected  int serializeCmnTimeCalcNewTimeHh(char[] value) {
	    int  cmnTimeCalcNewTimeHh;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnTimeCalcNewTimeHh = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnTimeCalcNewTimeHh
		       ,2
		      );
		 localCmnTimeCalcNewTimeHhCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnTimeCalcNewTimeHh;
    }

   protected int checkCmnTimeCalcNewTimeHhMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnTimeCalcNewTimeHh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnTimeCalcNewTimeHh() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnTimeCalcNewTimeHh
			                 ,CMN_TIME_CALC_NEW_TIME_HH_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnTimeCalcNewTimeHh", beginCmnTimeCalcNewTimeHh,CMN_TIME_CALC_NEW_TIME_HH_LEN);
    }
   	}
     int localCmnTimeCalcNewTimeMmCounter = -1;
     public boolean isCmnTimeCalcNewTimeMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeCalcNewTimeMmCounter != sharedCounter;
         localCmnTimeCalcNewTimeMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnTimeCalcNewTimeMm
	 *	@return cmnTimeCalcNewTimeMm
	 */
	public char[]  getCmnTimeCalcNewTimeMmString() {
	     return getCharArray(beginCmnTimeCalcNewTimeMm,CMN_TIME_CALC_NEW_TIME_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnTimeCalcNewTimeMmIsNumeric() {
	    return isNumeric(beginCmnTimeCalcNewTimeMm
	                    ,beginCmnTimeCalcNewTimeMm + CMN_TIME_CALC_NEW_TIME_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_TIME_CALC_NEW_TIME_MM_LEN = 2;
  	/**
	 * serializeCmnTimeCalcNewTimeMm
	 */
	protected void serializeCmnTimeCalcNewTimeMm(int cmnTimeCalcNewTimeMm) {
		 putNumber(beginCmnTimeCalcNewTimeMm,cmnTimeCalcNewTimeMm,CMN_TIME_CALC_NEW_TIME_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnTimeCalcNewTimeMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnTimeCalcNewTimeMm
	 */
   	protected  int serializeCmnTimeCalcNewTimeMm(char[] value) {
	    int  cmnTimeCalcNewTimeMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnTimeCalcNewTimeMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnTimeCalcNewTimeMm
		       ,2
		      );
		 localCmnTimeCalcNewTimeMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnTimeCalcNewTimeMm;
    }

   protected int checkCmnTimeCalcNewTimeMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnTimeCalcNewTimeMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnTimeCalcNewTimeMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnTimeCalcNewTimeMm
			                 ,CMN_TIME_CALC_NEW_TIME_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnTimeCalcNewTimeMm", beginCmnTimeCalcNewTimeMm,CMN_TIME_CALC_NEW_TIME_MM_LEN);
    }
   	}
     int localCmnTimeCalcNewTimeSsCounter = -1;
     public boolean isCmnTimeCalcNewTimeSsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeCalcNewTimeSsCounter != sharedCounter;
         localCmnTimeCalcNewTimeSsCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnTimeCalcNewTimeSs
	 *	@return cmnTimeCalcNewTimeSs
	 */
	public char[]  getCmnTimeCalcNewTimeSsString() {
	     return getCharArray(beginCmnTimeCalcNewTimeSs,CMN_TIME_CALC_NEW_TIME_SS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnTimeCalcNewTimeSsIsNumeric() {
	    return isNumeric(beginCmnTimeCalcNewTimeSs
	                    ,beginCmnTimeCalcNewTimeSs + CMN_TIME_CALC_NEW_TIME_SS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_TIME_CALC_NEW_TIME_SS_LEN = 2;
  	/**
	 * serializeCmnTimeCalcNewTimeSs
	 */
	protected void serializeCmnTimeCalcNewTimeSs(int cmnTimeCalcNewTimeSs) {
		 putNumber(beginCmnTimeCalcNewTimeSs,cmnTimeCalcNewTimeSs,CMN_TIME_CALC_NEW_TIME_SS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnTimeCalcNewTimeSsCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnTimeCalcNewTimeSs
	 */
   	protected  int serializeCmnTimeCalcNewTimeSs(char[] value) {
	    int  cmnTimeCalcNewTimeSs;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnTimeCalcNewTimeSs = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnTimeCalcNewTimeSs
		       ,2
		      );
		 localCmnTimeCalcNewTimeSsCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnTimeCalcNewTimeSs;
    }

   protected int checkCmnTimeCalcNewTimeSsMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnTimeCalcNewTimeSs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnTimeCalcNewTimeSs() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnTimeCalcNewTimeSs
			                 ,CMN_TIME_CALC_NEW_TIME_SS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnTimeCalcNewTimeSs", beginCmnTimeCalcNewTimeSs,CMN_TIME_CALC_NEW_TIME_SS_LEN);
    }
   	}




}
  
