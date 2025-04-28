package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnPeriodInputSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnPeriodInputSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnPeriodInputSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_PERIOD_INPUT_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnPeriodInputMm;
            protected  int beginCmnPeriodInputYy;
	
	/**
	* Constructor for CmnPeriodInputSerialized
	**/
    public CmnPeriodInputSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnPeriodInputSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPeriodInputSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnPeriodInputSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1024); // serialize this field at offset 1024 by default 
    }
    
	/**
	* sets parent for this CmnPeriodInputSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1024 by default
    }    
	/**
	* initializes the field in CmnPeriodInputSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_PERIOD_INPUT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnPeriodInputMm = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnPeriodInputYy = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnPeriodInputMmCounter = -1;
     public boolean isCmnPeriodInputMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnPeriodInputMmCounter != sharedCounter;
         localCmnPeriodInputMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnPeriodInputMm
	 *	@return cmnPeriodInputMm
	 */
	public char[]  getCmnPeriodInputMmString() {
	     return getCharArray(beginCmnPeriodInputMm,CMN_PERIOD_INPUT_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnPeriodInputMmIsNumeric() {
	    return isNumeric(beginCmnPeriodInputMm
	                    ,beginCmnPeriodInputMm + CMN_PERIOD_INPUT_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_PERIOD_INPUT_MM_LEN = 2;
  	/**
	 * serializeCmnPeriodInputMm
	 */
	protected void serializeCmnPeriodInputMm(int cmnPeriodInputMm) {
		 putNumber(beginCmnPeriodInputMm,cmnPeriodInputMm,CMN_PERIOD_INPUT_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnPeriodInputMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnPeriodInputMm
	 */
   	protected  int serializeCmnPeriodInputMm(char[] value) {
	    int  cmnPeriodInputMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnPeriodInputMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnPeriodInputMm
		       ,2
		      );
		 localCmnPeriodInputMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnPeriodInputMm;
    }

   protected int checkCmnPeriodInputMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnPeriodInputMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnPeriodInputMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnPeriodInputMm
			                 ,CMN_PERIOD_INPUT_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnPeriodInputMm", beginCmnPeriodInputMm,CMN_PERIOD_INPUT_MM_LEN);
    }
   	}
     int localCmnPeriodInputYyCounter = -1;
     public boolean isCmnPeriodInputYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnPeriodInputYyCounter != sharedCounter;
         localCmnPeriodInputYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnPeriodInputYy
	 *	@return cmnPeriodInputYy
	 */
	public char[]  getCmnPeriodInputYyString() {
	     return getCharArray(beginCmnPeriodInputYy,CMN_PERIOD_INPUT_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnPeriodInputYyIsNumeric() {
	    return isNumeric(beginCmnPeriodInputYy
	                    ,beginCmnPeriodInputYy + CMN_PERIOD_INPUT_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_PERIOD_INPUT_YY_LEN = 2;
  	/**
	 * serializeCmnPeriodInputYy
	 */
	protected void serializeCmnPeriodInputYy(int cmnPeriodInputYy) {
		 putNumber(beginCmnPeriodInputYy,cmnPeriodInputYy,CMN_PERIOD_INPUT_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnPeriodInputYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnPeriodInputYy
	 */
   	protected  int serializeCmnPeriodInputYy(char[] value) {
	    int  cmnPeriodInputYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnPeriodInputYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnPeriodInputYy
		       ,2
		      );
		 localCmnPeriodInputYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnPeriodInputYy;
    }

   protected int checkCmnPeriodInputYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnPeriodInputYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnPeriodInputYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnPeriodInputYy
			                 ,CMN_PERIOD_INPUT_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnPeriodInputYy", beginCmnPeriodInputYy,CMN_PERIOD_INPUT_YY_LEN);
    }
   	}




}
  
