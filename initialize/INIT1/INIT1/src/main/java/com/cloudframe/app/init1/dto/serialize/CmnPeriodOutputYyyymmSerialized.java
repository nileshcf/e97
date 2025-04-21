package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnPeriodOutputYyyymmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnPeriodOutputYyyymmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnPeriodOutputYyyymmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_PERIOD_OUTPUT_YYYYMM_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnPeriodOutputMm;
	
	/**
	* Constructor for CmnPeriodOutputYyyymmSerialized
	**/
    public CmnPeriodOutputYyyymmSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnPeriodOutputYyyymmSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPeriodOutputYyyymmSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnPeriodOutputYyyymmSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1029); // serialize this field at offset 1029 by default 
    }
    
	/**
	* sets parent for this CmnPeriodOutputYyyymmSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1029 by default
    }    
	/**
	* initializes the field in CmnPeriodOutputYyyymmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_PERIOD_OUTPUT_YYYYMM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginCmnPeriodOutputMm = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnPeriodOutputMmCounter = -1;
     public boolean isCmnPeriodOutputMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnPeriodOutputMmCounter != sharedCounter;
         localCmnPeriodOutputMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnPeriodOutputMm
	 *	@return cmnPeriodOutputMm
	 */
	public char[]  getCmnPeriodOutputMmString() {
	     return getCharArray(beginCmnPeriodOutputMm,CMN_PERIOD_OUTPUT_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnPeriodOutputMmIsNumeric() {
	    return isNumeric(beginCmnPeriodOutputMm
	                    ,beginCmnPeriodOutputMm + CMN_PERIOD_OUTPUT_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_PERIOD_OUTPUT_MM_LEN = 2;
  	/**
	 * serializeCmnPeriodOutputMm
	 */
	protected void serializeCmnPeriodOutputMm(int cmnPeriodOutputMm) {
		 putNumber(beginCmnPeriodOutputMm,cmnPeriodOutputMm,CMN_PERIOD_OUTPUT_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnPeriodOutputMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnPeriodOutputMm
	 */
   	protected  int serializeCmnPeriodOutputMm(char[] value) {
	    int  cmnPeriodOutputMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnPeriodOutputMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnPeriodOutputMm
		       ,2
		      );
		 localCmnPeriodOutputMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnPeriodOutputMm;
    }

   protected int checkCmnPeriodOutputMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnPeriodOutputMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnPeriodOutputMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnPeriodOutputMm
			                 ,CMN_PERIOD_OUTPUT_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnPeriodOutputMm", beginCmnPeriodOutputMm,CMN_PERIOD_OUTPUT_MM_LEN);
    }
   	}




}
  
