package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnPeriodOutputAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnPeriodOutputAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnPeriodOutputAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_PERIOD_OUTPUT_AREA_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnPeriodReturnCode;
	
	/**
	* Constructor for CmnPeriodOutputAreaSerialized
	**/
    public CmnPeriodOutputAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnPeriodOutputAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPeriodOutputAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnPeriodOutputAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1028); // serialize this field at offset 1028 by default 
    }
    
	/**
	* sets parent for this CmnPeriodOutputAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1028 by default
    }    
	/**
	* initializes the field in CmnPeriodOutputAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_PERIOD_OUTPUT_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnPeriodReturnCode = getStartOffset() + 0;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localCmnPeriodReturnCodeCounter = -1;
     public boolean isCmnPeriodReturnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnPeriodReturnCodeCounter != sharedCounter;
         localCmnPeriodReturnCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnPeriodReturnCode
	 *	@return cmnPeriodReturnCode
	 */
	public char[]  getCmnPeriodReturnCodeString() {
	     return getCharArray(beginCmnPeriodReturnCode,CMN_PERIOD_RETURN_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnPeriodReturnCodeIsNumeric() {
	    return isNumeric(beginCmnPeriodReturnCode
	                    ,beginCmnPeriodReturnCode + CMN_PERIOD_RETURN_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_PERIOD_RETURN_CODE_LEN = 1;
  	/**
	 * serializeCmnPeriodReturnCode
	 */
	protected void serializeCmnPeriodReturnCode(int cmnPeriodReturnCode) {
		 putNumber(beginCmnPeriodReturnCode,cmnPeriodReturnCode,CMN_PERIOD_RETURN_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnPeriodReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnPeriodReturnCode
	 */
   	protected  int serializeCmnPeriodReturnCode(char[] value) {
	    int  cmnPeriodReturnCode;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnPeriodReturnCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginCmnPeriodReturnCode
		       ,1
		      );
		 localCmnPeriodReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnPeriodReturnCode;
    }

   protected int checkCmnPeriodReturnCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnPeriodReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnPeriodReturnCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnPeriodReturnCode
			                 ,CMN_PERIOD_RETURN_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnPeriodReturnCode", beginCmnPeriodReturnCode,CMN_PERIOD_RETURN_CODE_LEN);
    }
   	}




}
  
