package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class CmnTimeCalcInputAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnTimeCalcInputAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnTimeCalcInputAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_TIME_CALC_INPUT_AREA_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnTimeCalcStart;
            protected  int beginCmnTimeCalcEnd;
	
	/**
	* Constructor for CmnTimeCalcInputAreaSerialized
	**/
    public CmnTimeCalcInputAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnTimeCalcInputAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeCalcInputAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnTimeCalcInputAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1024); // serialize this field at offset 1024 by default 
    }
    
	/**
	* sets parent for this CmnTimeCalcInputAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1024 by default
    }    
	/**
	* initializes the field in CmnTimeCalcInputAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_TIME_CALC_INPUT_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnTimeCalcStart = getStartOffset() + 1;	// set offset for serialization
  
  
             beginCmnTimeCalcEnd = getStartOffset() + 7;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCmnTimeCalcStartCounter = -1;
     public boolean isCmnTimeCalcStartModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeCalcStartCounter != sharedCounter;
         localCmnTimeCalcStartCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnTimeCalcStart
	 *	@return cmnTimeCalcStart
	 */
	public char[]  getCmnTimeCalcStartString() {
	     return getCharArray(beginCmnTimeCalcStart,CMN_TIME_CALC_START_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnTimeCalcStartIsNumeric() {
	    return isNumeric(beginCmnTimeCalcStart
	                    ,beginCmnTimeCalcStart + CMN_TIME_CALC_START_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_TIME_CALC_START_LEN = 6;
  	/**
	 * serializeCmnTimeCalcStart
	 */
	protected void serializeCmnTimeCalcStart(long cmnTimeCalcStart) {
		 putNumber(beginCmnTimeCalcStart,cmnTimeCalcStart,CMN_TIME_CALC_START_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnTimeCalcStartCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnTimeCalcStart
	 */
   	protected  long serializeCmnTimeCalcStart(char[] value) {
	    long  cmnTimeCalcStart;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnTimeCalcStart = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginCmnTimeCalcStart
		       ,6
		      );
		 localCmnTimeCalcStartCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnTimeCalcStart;
    }

   protected long checkCmnTimeCalcStartMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnTimeCalcStart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCmnTimeCalcStart() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCmnTimeCalcStart
			                 ,CMN_TIME_CALC_START_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnTimeCalcStart", beginCmnTimeCalcStart,CMN_TIME_CALC_START_LEN);
    }
   	}
     int localCmnTimeCalcEndCounter = -1;
     public boolean isCmnTimeCalcEndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeCalcEndCounter != sharedCounter;
         localCmnTimeCalcEndCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnTimeCalcEnd
	 *	@return cmnTimeCalcEnd
	 */
	public char[]  getCmnTimeCalcEndString() {
	     return getCharArray(beginCmnTimeCalcEnd,CMN_TIME_CALC_END_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnTimeCalcEndIsNumeric() {
	    return isNumeric(beginCmnTimeCalcEnd
	                    ,beginCmnTimeCalcEnd + CMN_TIME_CALC_END_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_TIME_CALC_END_LEN = 6;
  	/**
	 * serializeCmnTimeCalcEnd
	 */
	protected void serializeCmnTimeCalcEnd(long cmnTimeCalcEnd) {
		 putNumber(beginCmnTimeCalcEnd,cmnTimeCalcEnd,CMN_TIME_CALC_END_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnTimeCalcEndCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnTimeCalcEnd
	 */
   	protected  long serializeCmnTimeCalcEnd(char[] value) {
	    long  cmnTimeCalcEnd;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnTimeCalcEnd = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginCmnTimeCalcEnd
		       ,6
		      );
		 localCmnTimeCalcEndCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnTimeCalcEnd;
    }

   protected long checkCmnTimeCalcEndMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnTimeCalcEnd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCmnTimeCalcEnd() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCmnTimeCalcEnd
			                 ,CMN_TIME_CALC_END_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnTimeCalcEnd", beginCmnTimeCalcEnd,CMN_TIME_CALC_END_LEN);
    }
   	}




}
  
