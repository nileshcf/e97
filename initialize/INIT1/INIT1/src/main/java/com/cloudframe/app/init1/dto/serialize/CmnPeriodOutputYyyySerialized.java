package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnPeriodOutputYyyySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnPeriodOutputYyyySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnPeriodOutputYyyySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_PERIOD_OUTPUT_YYYY_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnPeriodOutputYy1;
            protected  int beginCmnPeriodOutputYy2;
	
	/**
	* Constructor for CmnPeriodOutputYyyySerialized
	**/
    public CmnPeriodOutputYyyySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnPeriodOutputYyyySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPeriodOutputYyyySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnPeriodOutputYyyySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1029); // serialize this field at offset 1029 by default 
    }
    
	/**
	* sets parent for this CmnPeriodOutputYyyySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1029 by default
    }    
	/**
	* initializes the field in CmnPeriodOutputYyyySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_PERIOD_OUTPUT_YYYY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnPeriodOutputYy1 = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnPeriodOutputYy2 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnPeriodOutputYy1Counter = -1;
     public boolean isCmnPeriodOutputYy1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnPeriodOutputYy1Counter != sharedCounter;
         localCmnPeriodOutputYy1Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnPeriodOutputYy1
	 *	@return cmnPeriodOutputYy1
	 */
	public char[]  getCmnPeriodOutputYy1String() {
	     return getCharArray(beginCmnPeriodOutputYy1,CMN_PERIOD_OUTPUT_YY_1_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnPeriodOutputYy1IsNumeric() {
	    return isNumeric(beginCmnPeriodOutputYy1
	                    ,beginCmnPeriodOutputYy1 + CMN_PERIOD_OUTPUT_YY_1_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_PERIOD_OUTPUT_YY_1_LEN = 2;
  	/**
	 * serializeCmnPeriodOutputYy1
	 */
	protected void serializeCmnPeriodOutputYy1(int cmnPeriodOutputYy1) {
		 putNumber(beginCmnPeriodOutputYy1,cmnPeriodOutputYy1,CMN_PERIOD_OUTPUT_YY_1_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnPeriodOutputYy1Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnPeriodOutputYy1
	 */
   	protected  int serializeCmnPeriodOutputYy1(char[] value) {
	    int  cmnPeriodOutputYy1;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnPeriodOutputYy1 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnPeriodOutputYy1
		       ,2
		      );
		 localCmnPeriodOutputYy1Counter = shareString.getSerializedField().getModifiedCounter();
		return  cmnPeriodOutputYy1;
    }

   protected int checkCmnPeriodOutputYy1MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnPeriodOutputYy1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnPeriodOutputYy1() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnPeriodOutputYy1
			                 ,CMN_PERIOD_OUTPUT_YY_1_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnPeriodOutputYy1", beginCmnPeriodOutputYy1,CMN_PERIOD_OUTPUT_YY_1_LEN);
    }
   	}
     int localCmnPeriodOutputYy2Counter = -1;
     public boolean isCmnPeriodOutputYy2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnPeriodOutputYy2Counter != sharedCounter;
         localCmnPeriodOutputYy2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnPeriodOutputYy2
	 *	@return cmnPeriodOutputYy2
	 */
	public char[]  getCmnPeriodOutputYy2String() {
	     return getCharArray(beginCmnPeriodOutputYy2,CMN_PERIOD_OUTPUT_YY_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnPeriodOutputYy2IsNumeric() {
	    return isNumeric(beginCmnPeriodOutputYy2
	                    ,beginCmnPeriodOutputYy2 + CMN_PERIOD_OUTPUT_YY_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_PERIOD_OUTPUT_YY_2_LEN = 2;
  	/**
	 * serializeCmnPeriodOutputYy2
	 */
	protected void serializeCmnPeriodOutputYy2(int cmnPeriodOutputYy2) {
		 putNumber(beginCmnPeriodOutputYy2,cmnPeriodOutputYy2,CMN_PERIOD_OUTPUT_YY_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnPeriodOutputYy2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnPeriodOutputYy2
	 */
   	protected  int serializeCmnPeriodOutputYy2(char[] value) {
	    int  cmnPeriodOutputYy2;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnPeriodOutputYy2 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnPeriodOutputYy2
		       ,2
		      );
		 localCmnPeriodOutputYy2Counter = shareString.getSerializedField().getModifiedCounter();
		return  cmnPeriodOutputYy2;
    }

   protected int checkCmnPeriodOutputYy2MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnPeriodOutputYy2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnPeriodOutputYy2() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnPeriodOutputYy2
			                 ,CMN_PERIOD_OUTPUT_YY_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnPeriodOutputYy2", beginCmnPeriodOutputYy2,CMN_PERIOD_OUTPUT_YY_2_LEN);
    }
   	}




}
  
