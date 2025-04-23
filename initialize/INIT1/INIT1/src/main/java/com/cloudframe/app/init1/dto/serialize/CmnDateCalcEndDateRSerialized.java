package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateCalcEndDateRSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateCalcEndDateRSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateCalcEndDateRSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_CALC_END_DATE_R_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateCalcEndMm;
            protected  int beginCmnDateCalcEndSep1;
            protected  int beginCmnDateCalcEndDd;
            protected  int beginCmnDateCalcEndSep2;
	
	/**
	* Constructor for CmnDateCalcEndDateRSerialized
	**/
    public CmnDateCalcEndDateRSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateCalcEndDateRSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcEndDateRSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateCalcEndDateRSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1039); // serialize this field at offset 1039 by default 
    }
    
	/**
	* sets parent for this CmnDateCalcEndDateRSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1039 by default
    }    
	/**
	* initializes the field in CmnDateCalcEndDateRSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_CALC_END_DATE_R_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateCalcEndMm = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnDateCalcEndSep1 = getStartOffset() + 2;	// set offset for serialization
  
             beginCmnDateCalcEndDd = getStartOffset() + 3;	// set offset for serialization
  
             beginCmnDateCalcEndSep2 = getStartOffset() + 5;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCmnDateCalcEndMmCounter = -1;
     public boolean isCmnDateCalcEndMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcEndMmCounter != sharedCounter;
         localCmnDateCalcEndMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateCalcEndMm
	 *	@return cmnDateCalcEndMm
	 */
	public char[]  getCmnDateCalcEndMmString() {
	     return getCharArray(beginCmnDateCalcEndMm,CMN_DATE_CALC_END_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateCalcEndMmIsNumeric() {
	    return isNumeric(beginCmnDateCalcEndMm
	                    ,beginCmnDateCalcEndMm + CMN_DATE_CALC_END_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CALC_END_MM_LEN = 2;
  	/**
	 * serializeCmnDateCalcEndMm
	 */
	protected void serializeCmnDateCalcEndMm(int cmnDateCalcEndMm) {
		 putNumber(beginCmnDateCalcEndMm,cmnDateCalcEndMm,CMN_DATE_CALC_END_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateCalcEndMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateCalcEndMm
	 */
   	protected  int serializeCmnDateCalcEndMm(char[] value) {
	    int  cmnDateCalcEndMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateCalcEndMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnDateCalcEndMm
		       ,2
		      );
		 localCmnDateCalcEndMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateCalcEndMm;
    }

   protected int checkCmnDateCalcEndMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateCalcEndMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateCalcEndMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateCalcEndMm
			                 ,CMN_DATE_CALC_END_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateCalcEndMm", beginCmnDateCalcEndMm,CMN_DATE_CALC_END_MM_LEN);
    }
   	}
     int localCmnDateCalcEndSep1Counter = -1;
     public boolean isCmnDateCalcEndSep1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcEndSep1Counter != sharedCounter;
         localCmnDateCalcEndSep1Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_END_SEP_1_LEN = 1;
	/**
	 * 	serialize this CmnDateCalcEndSep1
	 */
   protected void serializeCmnDateCalcEndSep1(char[] cmnDateCalcEndSep1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcEndSep1,0,getStringValue(),beginCmnDateCalcEndSep1,CMN_DATE_CALC_END_SEP_1_LEN);
       localCmnDateCalcEndSep1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcEndSep1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcEndSep1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcEndSep1() {	 
   		return (substring(getStringValue(),beginCmnDateCalcEndSep1,beginCmnDateCalcEndSep1 + CMN_DATE_CALC_END_SEP_1_LEN));
   	}
     int localCmnDateCalcEndDdCounter = -1;
     public boolean isCmnDateCalcEndDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcEndDdCounter != sharedCounter;
         localCmnDateCalcEndDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateCalcEndDd
	 *	@return cmnDateCalcEndDd
	 */
	public char[]  getCmnDateCalcEndDdString() {
	     return getCharArray(beginCmnDateCalcEndDd,CMN_DATE_CALC_END_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateCalcEndDdIsNumeric() {
	    return isNumeric(beginCmnDateCalcEndDd
	                    ,beginCmnDateCalcEndDd + CMN_DATE_CALC_END_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CALC_END_DD_LEN = 2;
  	/**
	 * serializeCmnDateCalcEndDd
	 */
	protected void serializeCmnDateCalcEndDd(int cmnDateCalcEndDd) {
		 putNumber(beginCmnDateCalcEndDd,cmnDateCalcEndDd,CMN_DATE_CALC_END_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateCalcEndDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateCalcEndDd
	 */
   	protected  int serializeCmnDateCalcEndDd(char[] value) {
	    int  cmnDateCalcEndDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateCalcEndDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnDateCalcEndDd
		       ,2
		      );
		 localCmnDateCalcEndDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateCalcEndDd;
    }

   protected int checkCmnDateCalcEndDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateCalcEndDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateCalcEndDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateCalcEndDd
			                 ,CMN_DATE_CALC_END_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateCalcEndDd", beginCmnDateCalcEndDd,CMN_DATE_CALC_END_DD_LEN);
    }
   	}
     int localCmnDateCalcEndSep2Counter = -1;
     public boolean isCmnDateCalcEndSep2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcEndSep2Counter != sharedCounter;
         localCmnDateCalcEndSep2Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_END_SEP_2_LEN = 1;
	/**
	 * 	serialize this CmnDateCalcEndSep2
	 */
   protected void serializeCmnDateCalcEndSep2(char[] cmnDateCalcEndSep2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcEndSep2,0,getStringValue(),beginCmnDateCalcEndSep2,CMN_DATE_CALC_END_SEP_2_LEN);
       localCmnDateCalcEndSep2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcEndSep2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcEndSep2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcEndSep2() {	 
   		return (substring(getStringValue(),beginCmnDateCalcEndSep2,beginCmnDateCalcEndSep2 + CMN_DATE_CALC_END_SEP_2_LEN));
   	}




}
  
