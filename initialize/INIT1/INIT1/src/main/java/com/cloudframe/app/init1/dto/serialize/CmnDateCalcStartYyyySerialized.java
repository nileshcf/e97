package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateCalcStartYyyySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateCalcStartYyyySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateCalcStartYyyySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_CALC_START_YYYY_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateCalcStartCc;
            protected  int beginCmnDateCalcStartYy;
	
	/**
	* Constructor for CmnDateCalcStartYyyySerialized
	**/
    public CmnDateCalcStartYyyySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateCalcStartYyyySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcStartYyyySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateCalcStartYyyySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1035); // serialize this field at offset 1035 by default 
    }
    
	/**
	* sets parent for this CmnDateCalcStartYyyySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1035 by default
    }    
	/**
	* initializes the field in CmnDateCalcStartYyyySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_CALC_START_YYYY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateCalcStartCc = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnDateCalcStartYy = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnDateCalcStartCcCounter = -1;
     public boolean isCmnDateCalcStartCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcStartCcCounter != sharedCounter;
         localCmnDateCalcStartCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateCalcStartCc
	 *	@return cmnDateCalcStartCc
	 */
	public char[]  getCmnDateCalcStartCcString() {
	     return getCharArray(beginCmnDateCalcStartCc,CMN_DATE_CALC_START_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateCalcStartCcIsNumeric() {
	    return isNumeric(beginCmnDateCalcStartCc
	                    ,beginCmnDateCalcStartCc + CMN_DATE_CALC_START_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CALC_START_CC_LEN = 2;
  	/**
	 * serializeCmnDateCalcStartCc
	 */
	protected void serializeCmnDateCalcStartCc(int cmnDateCalcStartCc) {
		 putNumber(beginCmnDateCalcStartCc,cmnDateCalcStartCc,CMN_DATE_CALC_START_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateCalcStartCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateCalcStartCc
	 */
   	protected  int serializeCmnDateCalcStartCc(char[] value) {
	    int  cmnDateCalcStartCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateCalcStartCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnDateCalcStartCc
		       ,2
		      );
		 localCmnDateCalcStartCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateCalcStartCc;
    }

   protected int checkCmnDateCalcStartCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateCalcStartCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateCalcStartCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateCalcStartCc
			                 ,CMN_DATE_CALC_START_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateCalcStartCc", beginCmnDateCalcStartCc,CMN_DATE_CALC_START_CC_LEN);
    }
   	}
     int localCmnDateCalcStartYyCounter = -1;
     public boolean isCmnDateCalcStartYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcStartYyCounter != sharedCounter;
         localCmnDateCalcStartYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateCalcStartYy
	 *	@return cmnDateCalcStartYy
	 */
	public char[]  getCmnDateCalcStartYyString() {
	     return getCharArray(beginCmnDateCalcStartYy,CMN_DATE_CALC_START_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateCalcStartYyIsNumeric() {
	    return isNumeric(beginCmnDateCalcStartYy
	                    ,beginCmnDateCalcStartYy + CMN_DATE_CALC_START_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CALC_START_YY_LEN = 2;
  	/**
	 * serializeCmnDateCalcStartYy
	 */
	protected void serializeCmnDateCalcStartYy(int cmnDateCalcStartYy) {
		 putNumber(beginCmnDateCalcStartYy,cmnDateCalcStartYy,CMN_DATE_CALC_START_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateCalcStartYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateCalcStartYy
	 */
   	protected  int serializeCmnDateCalcStartYy(char[] value) {
	    int  cmnDateCalcStartYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateCalcStartYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnDateCalcStartYy
		       ,2
		      );
		 localCmnDateCalcStartYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateCalcStartYy;
    }

   protected int checkCmnDateCalcStartYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateCalcStartYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateCalcStartYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateCalcStartYy
			                 ,CMN_DATE_CALC_START_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateCalcStartYy", beginCmnDateCalcStartYy,CMN_DATE_CALC_START_YY_LEN);
    }
   	}




}
  
