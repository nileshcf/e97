package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class CmnTimeCalcOutputAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
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
            protected  int beginCmnTimeCalcNewTime;
	
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
             beginCmnTimeCalcNewTime = getStartOffset() + 1;	// set offset for serialization
  
  
	   /*  end of offset */
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




}
  
