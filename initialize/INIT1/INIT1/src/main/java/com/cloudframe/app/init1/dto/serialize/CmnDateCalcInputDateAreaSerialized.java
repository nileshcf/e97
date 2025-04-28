package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateCalcInputDateAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateCalcInputDateAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateCalcInputDateAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_CALC_INPUT_DATE_AREA_LENGTH = 27;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateCalcStartDate;
            protected  int beginCmnDateCalcEndDate;
            protected  int beginCmnDateCalcNumOfDaysIn;
            protected  int beginCmnDateCalcNumOfMonthsIn;
	
	/**
	* Constructor for CmnDateCalcInputDateAreaSerialized
	**/
    public CmnDateCalcInputDateAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateCalcInputDateAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcInputDateAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateCalcInputDateAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1029); // serialize this field at offset 1029 by default 
    }
    
	/**
	* sets parent for this CmnDateCalcInputDateAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1029 by default
    }    
	/**
	* initializes the field in CmnDateCalcInputDateAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_CALC_INPUT_DATE_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateCalcStartDate = getStartOffset() + 0;	// set offset for serialization
  
  
             beginCmnDateCalcEndDate = getStartOffset() + 10;	// set offset for serialization
  
  
             beginCmnDateCalcNumOfDaysIn = getStartOffset() + 20;	// set offset for serialization
  
             beginCmnDateCalcNumOfMonthsIn = getStartOffset() + 25;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnDateCalcStartDateCounter = -1;
     public boolean isCmnDateCalcStartDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcStartDateCounter != sharedCounter;
         localCmnDateCalcStartDateCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_START_DATE_LEN = 10;
	/**
	 * 	serialize this CmnDateCalcStartDate
	 */
   protected void serializeCmnDateCalcStartDate(char[] cmnDateCalcStartDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcStartDate,0,getStringValue(),beginCmnDateCalcStartDate,CMN_DATE_CALC_START_DATE_LEN);
       localCmnDateCalcStartDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcStartDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcStartDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcStartDate() {	 
   		return (substring(getStringValue(),beginCmnDateCalcStartDate,beginCmnDateCalcStartDate + CMN_DATE_CALC_START_DATE_LEN));
   	}
     int localCmnDateCalcEndDateCounter = -1;
     public boolean isCmnDateCalcEndDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcEndDateCounter != sharedCounter;
         localCmnDateCalcEndDateCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_END_DATE_LEN = 10;
	/**
	 * 	serialize this CmnDateCalcEndDate
	 */
   protected void serializeCmnDateCalcEndDate(char[] cmnDateCalcEndDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcEndDate,0,getStringValue(),beginCmnDateCalcEndDate,CMN_DATE_CALC_END_DATE_LEN);
       localCmnDateCalcEndDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcEndDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcEndDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcEndDate() {	 
   		return (substring(getStringValue(),beginCmnDateCalcEndDate,beginCmnDateCalcEndDate + CMN_DATE_CALC_END_DATE_LEN));
   	}
     int localCmnDateCalcNumOfDaysInCounter = -1;
     public boolean isCmnDateCalcNumOfDaysInModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcNumOfDaysInCounter != sharedCounter;
         localCmnDateCalcNumOfDaysInCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateCalcNumOfDaysIn
	 *	@return cmnDateCalcNumOfDaysIn
	 */
	public char[]  getCmnDateCalcNumOfDaysInString() {
	     return getCharArray(beginCmnDateCalcNumOfDaysIn,CMN_DATE_CALC_NUM_OF_DAYS_IN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateCalcNumOfDaysInIsNumeric() {
	    return isNumeric(beginCmnDateCalcNumOfDaysIn
	                    ,beginCmnDateCalcNumOfDaysIn + CMN_DATE_CALC_NUM_OF_DAYS_IN_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CALC_NUM_OF_DAYS_IN_LEN = 5;
  	/**
	 * serializeCmnDateCalcNumOfDaysIn
	 */
	protected void serializeCmnDateCalcNumOfDaysIn(int cmnDateCalcNumOfDaysIn) {
		 putNumber(beginCmnDateCalcNumOfDaysIn,cmnDateCalcNumOfDaysIn,CMN_DATE_CALC_NUM_OF_DAYS_IN_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateCalcNumOfDaysInCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateCalcNumOfDaysIn
	 */
   	protected  int serializeCmnDateCalcNumOfDaysIn(char[] value) {
	    int  cmnDateCalcNumOfDaysIn;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateCalcNumOfDaysIn = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,true/*isSigned?*/)
		       ,beginCmnDateCalcNumOfDaysIn
		       ,5
		      );
		 localCmnDateCalcNumOfDaysInCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateCalcNumOfDaysIn;
    }

   protected int checkCmnDateCalcNumOfDaysInMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshCmnDateCalcNumOfDaysIn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateCalcNumOfDaysIn() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateCalcNumOfDaysIn
			                 ,CMN_DATE_CALC_NUM_OF_DAYS_IN_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateCalcNumOfDaysIn", beginCmnDateCalcNumOfDaysIn,CMN_DATE_CALC_NUM_OF_DAYS_IN_LEN);
    }
   	}
     int localCmnDateCalcNumOfMonthsInCounter = -1;
     public boolean isCmnDateCalcNumOfMonthsInModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcNumOfMonthsInCounter != sharedCounter;
         localCmnDateCalcNumOfMonthsInCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateCalcNumOfMonthsIn
	 *	@return cmnDateCalcNumOfMonthsIn
	 */
	public char[]  getCmnDateCalcNumOfMonthsInString() {
	     return getCharArray(beginCmnDateCalcNumOfMonthsIn,CMN_DATE_CALC_NUM_OF_MONTHS_IN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateCalcNumOfMonthsInIsNumeric() {
	    return isNumeric(beginCmnDateCalcNumOfMonthsIn
	                    ,beginCmnDateCalcNumOfMonthsIn + CMN_DATE_CALC_NUM_OF_MONTHS_IN_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CALC_NUM_OF_MONTHS_IN_LEN = 2;
  	/**
	 * serializeCmnDateCalcNumOfMonthsIn
	 */
	protected void serializeCmnDateCalcNumOfMonthsIn(short cmnDateCalcNumOfMonthsIn) {
		 putNumber(beginCmnDateCalcNumOfMonthsIn,cmnDateCalcNumOfMonthsIn,CMN_DATE_CALC_NUM_OF_MONTHS_IN_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateCalcNumOfMonthsInCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateCalcNumOfMonthsIn
	 */
   	protected  short serializeCmnDateCalcNumOfMonthsIn(char[] value) {
	    short  cmnDateCalcNumOfMonthsIn;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateCalcNumOfMonthsIn = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,true/*isSigned?*/)
		       ,beginCmnDateCalcNumOfMonthsIn
		       ,2
		      );
		 localCmnDateCalcNumOfMonthsInCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateCalcNumOfMonthsIn;
    }

   protected short checkCmnDateCalcNumOfMonthsInMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_100/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshCmnDateCalcNumOfMonthsIn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCmnDateCalcNumOfMonthsIn() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginCmnDateCalcNumOfMonthsIn
			                 ,CMN_DATE_CALC_NUM_OF_MONTHS_IN_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateCalcNumOfMonthsIn", beginCmnDateCalcNumOfMonthsIn,CMN_DATE_CALC_NUM_OF_MONTHS_IN_LEN);
    }
   	}




}
  
