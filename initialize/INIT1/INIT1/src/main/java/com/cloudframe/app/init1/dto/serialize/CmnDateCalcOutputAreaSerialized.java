package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateCalcOutputAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateCalcOutputAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateCalcOutputAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_CALC_OUTPUT_AREA_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateCalcReturnCode;
	
	/**
	* Constructor for CmnDateCalcOutputAreaSerialized
	**/
    public CmnDateCalcOutputAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateCalcOutputAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcOutputAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateCalcOutputAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1056); // serialize this field at offset 1056 by default 
    }
    
	/**
	* sets parent for this CmnDateCalcOutputAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1056 by default
    }    
	/**
	* initializes the field in CmnDateCalcOutputAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_CALC_OUTPUT_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateCalcReturnCode = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCmnDateCalcReturnCodeCounter = -1;
     public boolean isCmnDateCalcReturnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcReturnCodeCounter != sharedCounter;
         localCmnDateCalcReturnCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateCalcReturnCode
	 *	@return cmnDateCalcReturnCode
	 */
	public char[]  getCmnDateCalcReturnCodeString() {
	     return getCharArray(beginCmnDateCalcReturnCode,CMN_DATE_CALC_RETURN_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateCalcReturnCodeIsNumeric() {
	    return isNumeric(beginCmnDateCalcReturnCode
	                    ,beginCmnDateCalcReturnCode + CMN_DATE_CALC_RETURN_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CALC_RETURN_CODE_LEN = 2;
  	/**
	 * serializeCmnDateCalcReturnCode
	 */
	protected void serializeCmnDateCalcReturnCode(int cmnDateCalcReturnCode) {
		 putNumber(beginCmnDateCalcReturnCode,cmnDateCalcReturnCode,CMN_DATE_CALC_RETURN_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateCalcReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateCalcReturnCode
	 */
   	protected  int serializeCmnDateCalcReturnCode(char[] value) {
	    int  cmnDateCalcReturnCode;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateCalcReturnCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnDateCalcReturnCode
		       ,2
		      );
		 localCmnDateCalcReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateCalcReturnCode;
    }

   protected int checkCmnDateCalcReturnCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateCalcReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateCalcReturnCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateCalcReturnCode
			                 ,CMN_DATE_CALC_RETURN_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateCalcReturnCode", beginCmnDateCalcReturnCode,CMN_DATE_CALC_RETURN_CODE_LEN);
    }
   	}




}
  
