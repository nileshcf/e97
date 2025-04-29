package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateCalcStartDateRSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateCalcStartDateRSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateCalcStartDateRSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_CALC_START_DATE_R_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateCalcStartMm;
            protected  int beginCmnDateCalcStartSep1;
            protected  int beginCmnDateCalcStartDd;
            protected  int beginCmnDateCalcStartSep2;
	
	/**
	* Constructor for CmnDateCalcStartDateRSerialized
	**/
    public CmnDateCalcStartDateRSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateCalcStartDateRSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcStartDateRSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateCalcStartDateRSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1029); // serialize this field at offset 1029 by default 
    }
    
	/**
	* sets parent for this CmnDateCalcStartDateRSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1029 by default
    }    
	/**
	* initializes the field in CmnDateCalcStartDateRSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_CALC_START_DATE_R_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateCalcStartMm = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnDateCalcStartSep1 = getStartOffset() + 2;	// set offset for serialization
  
             beginCmnDateCalcStartDd = getStartOffset() + 3;	// set offset for serialization
  
             beginCmnDateCalcStartSep2 = getStartOffset() + 5;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCmnDateCalcStartMmCounter = -1;
     public boolean isCmnDateCalcStartMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcStartMmCounter != sharedCounter;
         localCmnDateCalcStartMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateCalcStartMm
	 *	@return cmnDateCalcStartMm
	 */
	public char[]  getCmnDateCalcStartMmString() {
	     return getCharArray(beginCmnDateCalcStartMm,CMN_DATE_CALC_START_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateCalcStartMmIsNumeric() {
	    return isNumeric(beginCmnDateCalcStartMm
	                    ,beginCmnDateCalcStartMm + CMN_DATE_CALC_START_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CALC_START_MM_LEN = 2;
  	/**
	 * serializeCmnDateCalcStartMm
	 */
	protected void serializeCmnDateCalcStartMm(int cmnDateCalcStartMm) {
		 putNumber(beginCmnDateCalcStartMm,cmnDateCalcStartMm,CMN_DATE_CALC_START_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateCalcStartMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateCalcStartMm
	 */
   	protected  int serializeCmnDateCalcStartMm(char[] value) {
	    int  cmnDateCalcStartMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateCalcStartMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnDateCalcStartMm
		       ,2
		      );
		 localCmnDateCalcStartMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateCalcStartMm;
    }

   protected int checkCmnDateCalcStartMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateCalcStartMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateCalcStartMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateCalcStartMm
			                 ,CMN_DATE_CALC_START_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateCalcStartMm", beginCmnDateCalcStartMm,CMN_DATE_CALC_START_MM_LEN);
    }
   	}
     int localCmnDateCalcStartSep1Counter = -1;
     public boolean isCmnDateCalcStartSep1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcStartSep1Counter != sharedCounter;
         localCmnDateCalcStartSep1Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_START_SEP_1_LEN = 1;
	/**
	 * 	serialize this CmnDateCalcStartSep1
	 */
   protected void serializeCmnDateCalcStartSep1(char[] cmnDateCalcStartSep1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcStartSep1,0,getStringValue(),beginCmnDateCalcStartSep1,CMN_DATE_CALC_START_SEP_1_LEN);
       localCmnDateCalcStartSep1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcStartSep1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcStartSep1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcStartSep1() {	 
   		return (substring(getStringValue(),beginCmnDateCalcStartSep1,beginCmnDateCalcStartSep1 + CMN_DATE_CALC_START_SEP_1_LEN));
   	}
     int localCmnDateCalcStartDdCounter = -1;
     public boolean isCmnDateCalcStartDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcStartDdCounter != sharedCounter;
         localCmnDateCalcStartDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateCalcStartDd
	 *	@return cmnDateCalcStartDd
	 */
	public char[]  getCmnDateCalcStartDdString() {
	     return getCharArray(beginCmnDateCalcStartDd,CMN_DATE_CALC_START_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateCalcStartDdIsNumeric() {
	    return isNumeric(beginCmnDateCalcStartDd
	                    ,beginCmnDateCalcStartDd + CMN_DATE_CALC_START_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CALC_START_DD_LEN = 2;
  	/**
	 * serializeCmnDateCalcStartDd
	 */
	protected void serializeCmnDateCalcStartDd(int cmnDateCalcStartDd) {
		 putNumber(beginCmnDateCalcStartDd,cmnDateCalcStartDd,CMN_DATE_CALC_START_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateCalcStartDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateCalcStartDd
	 */
   	protected  int serializeCmnDateCalcStartDd(char[] value) {
	    int  cmnDateCalcStartDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateCalcStartDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnDateCalcStartDd
		       ,2
		      );
		 localCmnDateCalcStartDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateCalcStartDd;
    }

   protected int checkCmnDateCalcStartDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateCalcStartDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateCalcStartDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateCalcStartDd
			                 ,CMN_DATE_CALC_START_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateCalcStartDd", beginCmnDateCalcStartDd,CMN_DATE_CALC_START_DD_LEN);
    }
   	}
     int localCmnDateCalcStartSep2Counter = -1;
     public boolean isCmnDateCalcStartSep2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcStartSep2Counter != sharedCounter;
         localCmnDateCalcStartSep2Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_START_SEP_2_LEN = 1;
	/**
	 * 	serialize this CmnDateCalcStartSep2
	 */
   protected void serializeCmnDateCalcStartSep2(char[] cmnDateCalcStartSep2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcStartSep2,0,getStringValue(),beginCmnDateCalcStartSep2,CMN_DATE_CALC_START_SEP_2_LEN);
       localCmnDateCalcStartSep2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcStartSep2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcStartSep2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcStartSep2() {	 
   		return (substring(getStringValue(),beginCmnDateCalcStartSep2,beginCmnDateCalcStartSep2 + CMN_DATE_CALC_START_SEP_2_LEN));
   	}




}
  
