package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnTimeCalcStartRSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnTimeCalcStartRSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnTimeCalcStartRSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_TIME_CALC_START_R_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnTimeCalcStartHh;
            protected  int beginCmnTimeCalcStartMm;
            protected  int beginCmnTimeCalcStartSs;
	
	/**
	* Constructor for CmnTimeCalcStartRSerialized
	**/
    public CmnTimeCalcStartRSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnTimeCalcStartRSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeCalcStartRSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnTimeCalcStartRSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1025); // serialize this field at offset 1025 by default 
    }
    
	/**
	* sets parent for this CmnTimeCalcStartRSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1025 by default
    }    
	/**
	* initializes the field in CmnTimeCalcStartRSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_TIME_CALC_START_R_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnTimeCalcStartHh = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnTimeCalcStartMm = getStartOffset() + 2;	// set offset for serialization
  
             beginCmnTimeCalcStartSs = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnTimeCalcStartHhCounter = -1;
     public boolean isCmnTimeCalcStartHhModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeCalcStartHhCounter != sharedCounter;
         localCmnTimeCalcStartHhCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnTimeCalcStartHh
	 *	@return cmnTimeCalcStartHh
	 */
	public char[]  getCmnTimeCalcStartHhString() {
	     return getCharArray(beginCmnTimeCalcStartHh,CMN_TIME_CALC_START_HH_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnTimeCalcStartHhIsNumeric() {
	    return isNumeric(beginCmnTimeCalcStartHh
	                    ,beginCmnTimeCalcStartHh + CMN_TIME_CALC_START_HH_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_TIME_CALC_START_HH_LEN = 2;
  	/**
	 * serializeCmnTimeCalcStartHh
	 */
	protected void serializeCmnTimeCalcStartHh(int cmnTimeCalcStartHh) {
		 putNumber(beginCmnTimeCalcStartHh,cmnTimeCalcStartHh,CMN_TIME_CALC_START_HH_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnTimeCalcStartHhCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnTimeCalcStartHh
	 */
   	protected  int serializeCmnTimeCalcStartHh(char[] value) {
	    int  cmnTimeCalcStartHh;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnTimeCalcStartHh = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnTimeCalcStartHh
		       ,2
		      );
		 localCmnTimeCalcStartHhCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnTimeCalcStartHh;
    }

   protected int checkCmnTimeCalcStartHhMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnTimeCalcStartHh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnTimeCalcStartHh() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnTimeCalcStartHh
			                 ,CMN_TIME_CALC_START_HH_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnTimeCalcStartHh", beginCmnTimeCalcStartHh,CMN_TIME_CALC_START_HH_LEN);
    }
   	}
     int localCmnTimeCalcStartMmCounter = -1;
     public boolean isCmnTimeCalcStartMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeCalcStartMmCounter != sharedCounter;
         localCmnTimeCalcStartMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnTimeCalcStartMm
	 *	@return cmnTimeCalcStartMm
	 */
	public char[]  getCmnTimeCalcStartMmString() {
	     return getCharArray(beginCmnTimeCalcStartMm,CMN_TIME_CALC_START_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnTimeCalcStartMmIsNumeric() {
	    return isNumeric(beginCmnTimeCalcStartMm
	                    ,beginCmnTimeCalcStartMm + CMN_TIME_CALC_START_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_TIME_CALC_START_MM_LEN = 2;
  	/**
	 * serializeCmnTimeCalcStartMm
	 */
	protected void serializeCmnTimeCalcStartMm(int cmnTimeCalcStartMm) {
		 putNumber(beginCmnTimeCalcStartMm,cmnTimeCalcStartMm,CMN_TIME_CALC_START_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnTimeCalcStartMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnTimeCalcStartMm
	 */
   	protected  int serializeCmnTimeCalcStartMm(char[] value) {
	    int  cmnTimeCalcStartMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnTimeCalcStartMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnTimeCalcStartMm
		       ,2
		      );
		 localCmnTimeCalcStartMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnTimeCalcStartMm;
    }

   protected int checkCmnTimeCalcStartMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnTimeCalcStartMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnTimeCalcStartMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnTimeCalcStartMm
			                 ,CMN_TIME_CALC_START_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnTimeCalcStartMm", beginCmnTimeCalcStartMm,CMN_TIME_CALC_START_MM_LEN);
    }
   	}
     int localCmnTimeCalcStartSsCounter = -1;
     public boolean isCmnTimeCalcStartSsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeCalcStartSsCounter != sharedCounter;
         localCmnTimeCalcStartSsCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnTimeCalcStartSs
	 *	@return cmnTimeCalcStartSs
	 */
	public char[]  getCmnTimeCalcStartSsString() {
	     return getCharArray(beginCmnTimeCalcStartSs,CMN_TIME_CALC_START_SS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnTimeCalcStartSsIsNumeric() {
	    return isNumeric(beginCmnTimeCalcStartSs
	                    ,beginCmnTimeCalcStartSs + CMN_TIME_CALC_START_SS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_TIME_CALC_START_SS_LEN = 2;
  	/**
	 * serializeCmnTimeCalcStartSs
	 */
	protected void serializeCmnTimeCalcStartSs(int cmnTimeCalcStartSs) {
		 putNumber(beginCmnTimeCalcStartSs,cmnTimeCalcStartSs,CMN_TIME_CALC_START_SS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnTimeCalcStartSsCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnTimeCalcStartSs
	 */
   	protected  int serializeCmnTimeCalcStartSs(char[] value) {
	    int  cmnTimeCalcStartSs;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnTimeCalcStartSs = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnTimeCalcStartSs
		       ,2
		      );
		 localCmnTimeCalcStartSsCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnTimeCalcStartSs;
    }

   protected int checkCmnTimeCalcStartSsMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnTimeCalcStartSs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnTimeCalcStartSs() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnTimeCalcStartSs
			                 ,CMN_TIME_CALC_START_SS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnTimeCalcStartSs", beginCmnTimeCalcStartSs,CMN_TIME_CALC_START_SS_LEN);
    }
   	}




}
  
