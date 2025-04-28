package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnPeriodOutputMonthYyyySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnPeriodOutputMonthYyyySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnPeriodOutputMonthYyyySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_PERIOD_OUTPUT_MONTH_YYYY_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnPeriodOutputMoLit;
            protected  int beginCmnPeriodOutputYear;
	
	/**
	* Constructor for CmnPeriodOutputMonthYyyySerialized
	**/
    public CmnPeriodOutputMonthYyyySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnPeriodOutputMonthYyyySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPeriodOutputMonthYyyySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnPeriodOutputMonthYyyySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1035); // serialize this field at offset 1035 by default 
    }
    
	/**
	* sets parent for this CmnPeriodOutputMonthYyyySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1035 by default
    }    
	/**
	* initializes the field in CmnPeriodOutputMonthYyyySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_PERIOD_OUTPUT_MONTH_YYYY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnPeriodOutputMoLit = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnPeriodOutputYear = getStartOffset() + 9;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnPeriodOutputMoLitCounter = -1;
     public boolean isCmnPeriodOutputMoLitModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnPeriodOutputMoLitCounter != sharedCounter;
         localCmnPeriodOutputMoLitCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_PERIOD_OUTPUT_MO_LIT_LEN = 9;
	/**
	 * 	serialize this CmnPeriodOutputMoLit
	 */
   protected void serializeCmnPeriodOutputMoLit(char[] cmnPeriodOutputMoLit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnPeriodOutputMoLit,0,getStringValue(),beginCmnPeriodOutputMoLit,CMN_PERIOD_OUTPUT_MO_LIT_LEN);
       localCmnPeriodOutputMoLitCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnPeriodOutputMoLitConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshCmnPeriodOutputMoLit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnPeriodOutputMoLit() {	 
   		return (substring(getStringValue(),beginCmnPeriodOutputMoLit,beginCmnPeriodOutputMoLit + CMN_PERIOD_OUTPUT_MO_LIT_LEN));
   	}
     int localCmnPeriodOutputYearCounter = -1;
     public boolean isCmnPeriodOutputYearModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnPeriodOutputYearCounter != sharedCounter;
         localCmnPeriodOutputYearCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnPeriodOutputYear
	 *	@return cmnPeriodOutputYear
	 */
	public char[]  getCmnPeriodOutputYearString() {
	     return getCharArray(beginCmnPeriodOutputYear,CMN_PERIOD_OUTPUT_YEAR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnPeriodOutputYearIsNumeric() {
	    return isNumeric(beginCmnPeriodOutputYear
	                    ,beginCmnPeriodOutputYear + CMN_PERIOD_OUTPUT_YEAR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_PERIOD_OUTPUT_YEAR_LEN = 4;
  	/**
	 * serializeCmnPeriodOutputYear
	 */
	protected void serializeCmnPeriodOutputYear(int cmnPeriodOutputYear) {
		 putNumber(beginCmnPeriodOutputYear,cmnPeriodOutputYear,CMN_PERIOD_OUTPUT_YEAR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnPeriodOutputYearCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnPeriodOutputYear
	 */
   	protected  int serializeCmnPeriodOutputYear(char[] value) {
	    int  cmnPeriodOutputYear;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnPeriodOutputYear = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginCmnPeriodOutputYear
		       ,4
		      );
		 localCmnPeriodOutputYearCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnPeriodOutputYear;
    }

   protected int checkCmnPeriodOutputYearMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnPeriodOutputYear is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnPeriodOutputYear() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnPeriodOutputYear
			                 ,CMN_PERIOD_OUTPUT_YEAR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnPeriodOutputYear", beginCmnPeriodOutputYear,CMN_PERIOD_OUTPUT_YEAR_LEN);
    }
   	}




}
  
