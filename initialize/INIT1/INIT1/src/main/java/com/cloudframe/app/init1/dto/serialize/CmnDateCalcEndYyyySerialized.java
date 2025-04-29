package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateCalcEndYyyySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateCalcEndYyyySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateCalcEndYyyySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_CALC_END_YYYY_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateCalcEndCc;
            protected  int beginCmnDateCalcEndYy;
	
	/**
	* Constructor for CmnDateCalcEndYyyySerialized
	**/
    public CmnDateCalcEndYyyySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateCalcEndYyyySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcEndYyyySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateCalcEndYyyySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1045); // serialize this field at offset 1045 by default 
    }
    
	/**
	* sets parent for this CmnDateCalcEndYyyySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1045 by default
    }    
	/**
	* initializes the field in CmnDateCalcEndYyyySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_CALC_END_YYYY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateCalcEndCc = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnDateCalcEndYy = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnDateCalcEndCcCounter = -1;
     public boolean isCmnDateCalcEndCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcEndCcCounter != sharedCounter;
         localCmnDateCalcEndCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateCalcEndCc
	 *	@return cmnDateCalcEndCc
	 */
	public char[]  getCmnDateCalcEndCcString() {
	     return getCharArray(beginCmnDateCalcEndCc,CMN_DATE_CALC_END_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateCalcEndCcIsNumeric() {
	    return isNumeric(beginCmnDateCalcEndCc
	                    ,beginCmnDateCalcEndCc + CMN_DATE_CALC_END_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CALC_END_CC_LEN = 2;
  	/**
	 * serializeCmnDateCalcEndCc
	 */
	protected void serializeCmnDateCalcEndCc(int cmnDateCalcEndCc) {
		 putNumber(beginCmnDateCalcEndCc,cmnDateCalcEndCc,CMN_DATE_CALC_END_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateCalcEndCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateCalcEndCc
	 */
   	protected  int serializeCmnDateCalcEndCc(char[] value) {
	    int  cmnDateCalcEndCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateCalcEndCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnDateCalcEndCc
		       ,2
		      );
		 localCmnDateCalcEndCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateCalcEndCc;
    }

   protected int checkCmnDateCalcEndCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateCalcEndCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateCalcEndCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateCalcEndCc
			                 ,CMN_DATE_CALC_END_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateCalcEndCc", beginCmnDateCalcEndCc,CMN_DATE_CALC_END_CC_LEN);
    }
   	}
     int localCmnDateCalcEndYyCounter = -1;
     public boolean isCmnDateCalcEndYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcEndYyCounter != sharedCounter;
         localCmnDateCalcEndYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateCalcEndYy
	 *	@return cmnDateCalcEndYy
	 */
	public char[]  getCmnDateCalcEndYyString() {
	     return getCharArray(beginCmnDateCalcEndYy,CMN_DATE_CALC_END_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateCalcEndYyIsNumeric() {
	    return isNumeric(beginCmnDateCalcEndYy
	                    ,beginCmnDateCalcEndYy + CMN_DATE_CALC_END_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CALC_END_YY_LEN = 2;
  	/**
	 * serializeCmnDateCalcEndYy
	 */
	protected void serializeCmnDateCalcEndYy(int cmnDateCalcEndYy) {
		 putNumber(beginCmnDateCalcEndYy,cmnDateCalcEndYy,CMN_DATE_CALC_END_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateCalcEndYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateCalcEndYy
	 */
   	protected  int serializeCmnDateCalcEndYy(char[] value) {
	    int  cmnDateCalcEndYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateCalcEndYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnDateCalcEndYy
		       ,2
		      );
		 localCmnDateCalcEndYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateCalcEndYy;
    }

   protected int checkCmnDateCalcEndYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateCalcEndYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateCalcEndYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateCalcEndYy
			                 ,CMN_DATE_CALC_END_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateCalcEndYy", beginCmnDateCalcEndYy,CMN_DATE_CALC_END_YY_LEN);
    }
   	}




}
  
