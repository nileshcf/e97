package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnTimeCalcOutputAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnTimeCalcOutputAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnTimeCalcOutputAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_TIME_CALC_OUTPUT_AREA_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnTimeCalcReturnCode;
            protected  int beginCmnTimeCalcNewTime;
            protected  int beginCmnTimeCalcNumOfSecElap;
	
	/**
	* Constructor for CmnTimeCalcOutputAreaSerialized
	**/
    public CmnTimeCalcOutputAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnTimeCalcOutputAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeCalcOutputAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnTimeCalcOutputAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1046); // serialize this field at offset 1046 by default 
    }
    
	/**
	* sets parent for this CmnTimeCalcOutputAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1046 by default
    }    
	/**
	* initializes the field in CmnTimeCalcOutputAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_TIME_CALC_OUTPUT_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnTimeCalcReturnCode = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnTimeCalcNewTime = getStartOffset() + 1;	// set offset for serialization
  
  
             beginCmnTimeCalcNumOfSecElap = getStartOffset() + 7;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnTimeCalcReturnCodeCounter = -1;
     public boolean isCmnTimeCalcReturnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeCalcReturnCodeCounter != sharedCounter;
         localCmnTimeCalcReturnCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnTimeCalcReturnCode
	 *	@return cmnTimeCalcReturnCode
	 */
	public char[]  getCmnTimeCalcReturnCodeString() {
	     return getCharArray(beginCmnTimeCalcReturnCode,CMN_TIME_CALC_RETURN_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnTimeCalcReturnCodeIsNumeric() {
	    return isNumeric(beginCmnTimeCalcReturnCode
	                    ,beginCmnTimeCalcReturnCode + CMN_TIME_CALC_RETURN_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_TIME_CALC_RETURN_CODE_LEN = 1;
  	/**
	 * serializeCmnTimeCalcReturnCode
	 */
	protected void serializeCmnTimeCalcReturnCode(int cmnTimeCalcReturnCode) {
		 putNumber(beginCmnTimeCalcReturnCode,cmnTimeCalcReturnCode,CMN_TIME_CALC_RETURN_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnTimeCalcReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnTimeCalcReturnCode
	 */
   	protected  int serializeCmnTimeCalcReturnCode(char[] value) {
	    int  cmnTimeCalcReturnCode;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnTimeCalcReturnCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginCmnTimeCalcReturnCode
		       ,1
		      );
		 localCmnTimeCalcReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnTimeCalcReturnCode;
    }

   protected int checkCmnTimeCalcReturnCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnTimeCalcReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnTimeCalcReturnCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnTimeCalcReturnCode
			                 ,CMN_TIME_CALC_RETURN_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnTimeCalcReturnCode", beginCmnTimeCalcReturnCode,CMN_TIME_CALC_RETURN_CODE_LEN);
    }
   	}
     int localCmnTimeCalcNewTimeCounter = -1;
     public boolean isCmnTimeCalcNewTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeCalcNewTimeCounter != sharedCounter;
         localCmnTimeCalcNewTimeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnTimeCalcNewTime
	 *	@return cmnTimeCalcNewTime
	 */
	public char[]  getCmnTimeCalcNewTimeString() {
	     return getCharArray(beginCmnTimeCalcNewTime,CMN_TIME_CALC_NEW_TIME_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnTimeCalcNewTimeIsNumeric() {
	    return isNumeric(beginCmnTimeCalcNewTime
	                    ,beginCmnTimeCalcNewTime + CMN_TIME_CALC_NEW_TIME_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_TIME_CALC_NEW_TIME_LEN = 6;
  	/**
	 * serializeCmnTimeCalcNewTime
	 */
	protected void serializeCmnTimeCalcNewTime(long cmnTimeCalcNewTime) {
		 putNumber(beginCmnTimeCalcNewTime,cmnTimeCalcNewTime,CMN_TIME_CALC_NEW_TIME_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnTimeCalcNewTimeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnTimeCalcNewTime
	 */
   	protected  long serializeCmnTimeCalcNewTime(char[] value) {
	    long  cmnTimeCalcNewTime;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnTimeCalcNewTime = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginCmnTimeCalcNewTime
		       ,6
		      );
		 localCmnTimeCalcNewTimeCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnTimeCalcNewTime;
    }

   protected long checkCmnTimeCalcNewTimeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnTimeCalcNewTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCmnTimeCalcNewTime() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCmnTimeCalcNewTime
			                 ,CMN_TIME_CALC_NEW_TIME_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnTimeCalcNewTime", beginCmnTimeCalcNewTime,CMN_TIME_CALC_NEW_TIME_LEN);
    }
   	}
     int localCmnTimeCalcNumOfSecElapCounter = -1;
     public boolean isCmnTimeCalcNumOfSecElapModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeCalcNumOfSecElapCounter != sharedCounter;
         localCmnTimeCalcNumOfSecElapCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnTimeCalcNumOfSecElap
	 *	@return cmnTimeCalcNumOfSecElap
	 */
	public char[]  getCmnTimeCalcNumOfSecElapString() {
	     return getCharArray(beginCmnTimeCalcNumOfSecElap,CMN_TIME_CALC_NUM_OF_SEC_ELAP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnTimeCalcNumOfSecElapIsNumeric() {
	    return isNumeric(beginCmnTimeCalcNumOfSecElap
	                    ,beginCmnTimeCalcNumOfSecElap + CMN_TIME_CALC_NUM_OF_SEC_ELAP_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_TIME_CALC_NUM_OF_SEC_ELAP_LEN = 9;
  	/**
	 * serializeCmnTimeCalcNumOfSecElap
	 */
	protected void serializeCmnTimeCalcNumOfSecElap(int cmnTimeCalcNumOfSecElap) {
		 putNumber(beginCmnTimeCalcNumOfSecElap,cmnTimeCalcNumOfSecElap,CMN_TIME_CALC_NUM_OF_SEC_ELAP_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnTimeCalcNumOfSecElapCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnTimeCalcNumOfSecElap
	 */
   	protected  int serializeCmnTimeCalcNumOfSecElap(char[] value) {
	    int  cmnTimeCalcNumOfSecElap;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnTimeCalcNumOfSecElap = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginCmnTimeCalcNumOfSecElap
		       ,9
		      );
		 localCmnTimeCalcNumOfSecElapCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnTimeCalcNumOfSecElap;
    }

   protected int checkCmnTimeCalcNumOfSecElapMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshCmnTimeCalcNumOfSecElap is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnTimeCalcNumOfSecElap() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnTimeCalcNumOfSecElap
			                 ,CMN_TIME_CALC_NUM_OF_SEC_ELAP_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnTimeCalcNumOfSecElap", beginCmnTimeCalcNumOfSecElap,CMN_TIME_CALC_NUM_OF_SEC_ELAP_LEN);
    }
   	}




}
  
