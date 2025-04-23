package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateCalcNewDateCalcRSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateCalcNewDateCalcRSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateCalcNewDateCalcRSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_CALC_NEW_DATE_CALC_R_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateCalcNewDateMm;
            protected  int beginCmnDateCalcNewDateSep1;
            protected  int beginCmnDateCalcNewDateDd;
            protected  int beginCmnDateCalcNewDateSep2;
	
	/**
	* Constructor for CmnDateCalcNewDateCalcRSerialized
	**/
    public CmnDateCalcNewDateCalcRSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateCalcNewDateCalcRSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcNewDateCalcRSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateCalcNewDateCalcRSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1058); // serialize this field at offset 1058 by default 
    }
    
	/**
	* sets parent for this CmnDateCalcNewDateCalcRSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1058 by default
    }    
	/**
	* initializes the field in CmnDateCalcNewDateCalcRSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_CALC_NEW_DATE_CALC_R_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateCalcNewDateMm = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnDateCalcNewDateSep1 = getStartOffset() + 2;	// set offset for serialization
  
             beginCmnDateCalcNewDateDd = getStartOffset() + 3;	// set offset for serialization
  
             beginCmnDateCalcNewDateSep2 = getStartOffset() + 5;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCmnDateCalcNewDateMmCounter = -1;
     public boolean isCmnDateCalcNewDateMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcNewDateMmCounter != sharedCounter;
         localCmnDateCalcNewDateMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateCalcNewDateMm
	 *	@return cmnDateCalcNewDateMm
	 */
	public char[]  getCmnDateCalcNewDateMmString() {
	     return getCharArray(beginCmnDateCalcNewDateMm,CMN_DATE_CALC_NEW_DATE_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateCalcNewDateMmIsNumeric() {
	    return isNumeric(beginCmnDateCalcNewDateMm
	                    ,beginCmnDateCalcNewDateMm + CMN_DATE_CALC_NEW_DATE_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CALC_NEW_DATE_MM_LEN = 2;
  	/**
	 * serializeCmnDateCalcNewDateMm
	 */
	protected void serializeCmnDateCalcNewDateMm(int cmnDateCalcNewDateMm) {
		 putNumber(beginCmnDateCalcNewDateMm,cmnDateCalcNewDateMm,CMN_DATE_CALC_NEW_DATE_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateCalcNewDateMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateCalcNewDateMm
	 */
   	protected  int serializeCmnDateCalcNewDateMm(char[] value) {
	    int  cmnDateCalcNewDateMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateCalcNewDateMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnDateCalcNewDateMm
		       ,2
		      );
		 localCmnDateCalcNewDateMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateCalcNewDateMm;
    }

   protected int checkCmnDateCalcNewDateMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateCalcNewDateMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateCalcNewDateMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateCalcNewDateMm
			                 ,CMN_DATE_CALC_NEW_DATE_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateCalcNewDateMm", beginCmnDateCalcNewDateMm,CMN_DATE_CALC_NEW_DATE_MM_LEN);
    }
   	}
     int localCmnDateCalcNewDateSep1Counter = -1;
     public boolean isCmnDateCalcNewDateSep1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcNewDateSep1Counter != sharedCounter;
         localCmnDateCalcNewDateSep1Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_NEW_DATE_SEP_1_LEN = 1;
	/**
	 * 	serialize this CmnDateCalcNewDateSep1
	 */
   protected void serializeCmnDateCalcNewDateSep1(char[] cmnDateCalcNewDateSep1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcNewDateSep1,0,getStringValue(),beginCmnDateCalcNewDateSep1,CMN_DATE_CALC_NEW_DATE_SEP_1_LEN);
       localCmnDateCalcNewDateSep1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcNewDateSep1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcNewDateSep1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcNewDateSep1() {	 
   		return (substring(getStringValue(),beginCmnDateCalcNewDateSep1,beginCmnDateCalcNewDateSep1 + CMN_DATE_CALC_NEW_DATE_SEP_1_LEN));
   	}
     int localCmnDateCalcNewDateDdCounter = -1;
     public boolean isCmnDateCalcNewDateDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcNewDateDdCounter != sharedCounter;
         localCmnDateCalcNewDateDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateCalcNewDateDd
	 *	@return cmnDateCalcNewDateDd
	 */
	public char[]  getCmnDateCalcNewDateDdString() {
	     return getCharArray(beginCmnDateCalcNewDateDd,CMN_DATE_CALC_NEW_DATE_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateCalcNewDateDdIsNumeric() {
	    return isNumeric(beginCmnDateCalcNewDateDd
	                    ,beginCmnDateCalcNewDateDd + CMN_DATE_CALC_NEW_DATE_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CALC_NEW_DATE_DD_LEN = 2;
  	/**
	 * serializeCmnDateCalcNewDateDd
	 */
	protected void serializeCmnDateCalcNewDateDd(int cmnDateCalcNewDateDd) {
		 putNumber(beginCmnDateCalcNewDateDd,cmnDateCalcNewDateDd,CMN_DATE_CALC_NEW_DATE_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateCalcNewDateDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateCalcNewDateDd
	 */
   	protected  int serializeCmnDateCalcNewDateDd(char[] value) {
	    int  cmnDateCalcNewDateDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateCalcNewDateDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnDateCalcNewDateDd
		       ,2
		      );
		 localCmnDateCalcNewDateDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateCalcNewDateDd;
    }

   protected int checkCmnDateCalcNewDateDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateCalcNewDateDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateCalcNewDateDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateCalcNewDateDd
			                 ,CMN_DATE_CALC_NEW_DATE_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateCalcNewDateDd", beginCmnDateCalcNewDateDd,CMN_DATE_CALC_NEW_DATE_DD_LEN);
    }
   	}
     int localCmnDateCalcNewDateSep2Counter = -1;
     public boolean isCmnDateCalcNewDateSep2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcNewDateSep2Counter != sharedCounter;
         localCmnDateCalcNewDateSep2Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_NEW_DATE_SEP_2_LEN = 1;
	/**
	 * 	serialize this CmnDateCalcNewDateSep2
	 */
   protected void serializeCmnDateCalcNewDateSep2(char[] cmnDateCalcNewDateSep2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcNewDateSep2,0,getStringValue(),beginCmnDateCalcNewDateSep2,CMN_DATE_CALC_NEW_DATE_SEP_2_LEN);
       localCmnDateCalcNewDateSep2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcNewDateSep2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcNewDateSep2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcNewDateSep2() {	 
   		return (substring(getStringValue(),beginCmnDateCalcNewDateSep2,beginCmnDateCalcNewDateSep2 + CMN_DATE_CALC_NEW_DATE_SEP_2_LEN));
   	}




}
  
