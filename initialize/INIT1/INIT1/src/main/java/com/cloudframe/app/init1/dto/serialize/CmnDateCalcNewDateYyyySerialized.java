package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateCalcNewDateYyyySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateCalcNewDateYyyySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateCalcNewDateYyyySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_CALC_NEW_DATE_YYYY_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateCalcNewDateCc;
            protected  int beginCmnDateCalcNewDateYy;
	
	/**
	* Constructor for CmnDateCalcNewDateYyyySerialized
	**/
    public CmnDateCalcNewDateYyyySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateCalcNewDateYyyySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcNewDateYyyySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateCalcNewDateYyyySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1064); // serialize this field at offset 1064 by default 
    }
    
	/**
	* sets parent for this CmnDateCalcNewDateYyyySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1064 by default
    }    
	/**
	* initializes the field in CmnDateCalcNewDateYyyySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_CALC_NEW_DATE_YYYY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateCalcNewDateCc = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnDateCalcNewDateYy = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnDateCalcNewDateCcCounter = -1;
     public boolean isCmnDateCalcNewDateCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcNewDateCcCounter != sharedCounter;
         localCmnDateCalcNewDateCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateCalcNewDateCc
	 *	@return cmnDateCalcNewDateCc
	 */
	public char[]  getCmnDateCalcNewDateCcString() {
	     return getCharArray(beginCmnDateCalcNewDateCc,CMN_DATE_CALC_NEW_DATE_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateCalcNewDateCcIsNumeric() {
	    return isNumeric(beginCmnDateCalcNewDateCc
	                    ,beginCmnDateCalcNewDateCc + CMN_DATE_CALC_NEW_DATE_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CALC_NEW_DATE_CC_LEN = 2;
  	/**
	 * serializeCmnDateCalcNewDateCc
	 */
	protected void serializeCmnDateCalcNewDateCc(int cmnDateCalcNewDateCc) {
		 putNumber(beginCmnDateCalcNewDateCc,cmnDateCalcNewDateCc,CMN_DATE_CALC_NEW_DATE_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateCalcNewDateCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateCalcNewDateCc
	 */
   	protected  int serializeCmnDateCalcNewDateCc(char[] value) {
	    int  cmnDateCalcNewDateCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateCalcNewDateCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnDateCalcNewDateCc
		       ,2
		      );
		 localCmnDateCalcNewDateCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateCalcNewDateCc;
    }

   protected int checkCmnDateCalcNewDateCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateCalcNewDateCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateCalcNewDateCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateCalcNewDateCc
			                 ,CMN_DATE_CALC_NEW_DATE_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateCalcNewDateCc", beginCmnDateCalcNewDateCc,CMN_DATE_CALC_NEW_DATE_CC_LEN);
    }
   	}
     int localCmnDateCalcNewDateYyCounter = -1;
     public boolean isCmnDateCalcNewDateYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcNewDateYyCounter != sharedCounter;
         localCmnDateCalcNewDateYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateCalcNewDateYy
	 *	@return cmnDateCalcNewDateYy
	 */
	public char[]  getCmnDateCalcNewDateYyString() {
	     return getCharArray(beginCmnDateCalcNewDateYy,CMN_DATE_CALC_NEW_DATE_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateCalcNewDateYyIsNumeric() {
	    return isNumeric(beginCmnDateCalcNewDateYy
	                    ,beginCmnDateCalcNewDateYy + CMN_DATE_CALC_NEW_DATE_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CALC_NEW_DATE_YY_LEN = 2;
  	/**
	 * serializeCmnDateCalcNewDateYy
	 */
	protected void serializeCmnDateCalcNewDateYy(int cmnDateCalcNewDateYy) {
		 putNumber(beginCmnDateCalcNewDateYy,cmnDateCalcNewDateYy,CMN_DATE_CALC_NEW_DATE_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateCalcNewDateYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateCalcNewDateYy
	 */
   	protected  int serializeCmnDateCalcNewDateYy(char[] value) {
	    int  cmnDateCalcNewDateYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateCalcNewDateYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnDateCalcNewDateYy
		       ,2
		      );
		 localCmnDateCalcNewDateYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateCalcNewDateYy;
    }

   protected int checkCmnDateCalcNewDateYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateCalcNewDateYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateCalcNewDateYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateCalcNewDateYy
			                 ,CMN_DATE_CALC_NEW_DATE_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateCalcNewDateYy", beginCmnDateCalcNewDateYy,CMN_DATE_CALC_NEW_DATE_YY_LEN);
    }
   	}




}
  
