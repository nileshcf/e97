package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateCalcCalculationsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateCalcCalculationsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateCalcCalculationsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_CALC_CALCULATIONS_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateCalcNewDateCalc;
            protected  int beginCmnDateCalcNumOfDaysCalc;
            protected  int beginCmnDateCalcDayOfWeekLit;
            protected  int beginCmnDateCalcDayOfWeekNum;
	
	/**
	* Constructor for CmnDateCalcCalculationsSerialized
	**/
    public CmnDateCalcCalculationsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateCalcCalculationsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcCalculationsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateCalcCalculationsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1058); // serialize this field at offset 1058 by default 
    }
    
	/**
	* sets parent for this CmnDateCalcCalculationsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1058 by default
    }    
	/**
	* initializes the field in CmnDateCalcCalculationsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_CALC_CALCULATIONS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateCalcNewDateCalc = getStartOffset() + 0;	// set offset for serialization
  
  
             beginCmnDateCalcNumOfDaysCalc = getStartOffset() + 10;	// set offset for serialization
  
             beginCmnDateCalcDayOfWeekLit = getStartOffset() + 15;	// set offset for serialization
  
             beginCmnDateCalcDayOfWeekNum = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnDateCalcNewDateCalcCounter = -1;
     public boolean isCmnDateCalcNewDateCalcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcNewDateCalcCounter != sharedCounter;
         localCmnDateCalcNewDateCalcCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_NEW_DATE_CALC_LEN = 10;
	/**
	 * 	serialize this CmnDateCalcNewDateCalc
	 */
   protected void serializeCmnDateCalcNewDateCalc(char[] cmnDateCalcNewDateCalc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcNewDateCalc,0,getStringValue(),beginCmnDateCalcNewDateCalc,CMN_DATE_CALC_NEW_DATE_CALC_LEN);
       localCmnDateCalcNewDateCalcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcNewDateCalcConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcNewDateCalc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcNewDateCalc() {	 
   		return (substring(getStringValue(),beginCmnDateCalcNewDateCalc,beginCmnDateCalcNewDateCalc + CMN_DATE_CALC_NEW_DATE_CALC_LEN));
   	}
     int localCmnDateCalcNumOfDaysCalcCounter = -1;
     public boolean isCmnDateCalcNumOfDaysCalcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcNumOfDaysCalcCounter != sharedCounter;
         localCmnDateCalcNumOfDaysCalcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateCalcNumOfDaysCalc
	 *	@return cmnDateCalcNumOfDaysCalc
	 */
	public char[]  getCmnDateCalcNumOfDaysCalcString() {
	     return getCharArray(beginCmnDateCalcNumOfDaysCalc,CMN_DATE_CALC_NUM_OF_DAYS_CALC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateCalcNumOfDaysCalcIsNumeric() {
	    return isNumeric(beginCmnDateCalcNumOfDaysCalc
	                    ,beginCmnDateCalcNumOfDaysCalc + CMN_DATE_CALC_NUM_OF_DAYS_CALC_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CALC_NUM_OF_DAYS_CALC_LEN = 5;
  	/**
	 * serializeCmnDateCalcNumOfDaysCalc
	 */
	protected void serializeCmnDateCalcNumOfDaysCalc(int cmnDateCalcNumOfDaysCalc) {
		 putNumber(beginCmnDateCalcNumOfDaysCalc,cmnDateCalcNumOfDaysCalc,CMN_DATE_CALC_NUM_OF_DAYS_CALC_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateCalcNumOfDaysCalcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateCalcNumOfDaysCalc
	 */
   	protected  int serializeCmnDateCalcNumOfDaysCalc(char[] value) {
	    int  cmnDateCalcNumOfDaysCalc;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateCalcNumOfDaysCalc = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,true/*isSigned?*/)
		       ,beginCmnDateCalcNumOfDaysCalc
		       ,5
		      );
		 localCmnDateCalcNumOfDaysCalcCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateCalcNumOfDaysCalc;
    }

   protected int checkCmnDateCalcNumOfDaysCalcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshCmnDateCalcNumOfDaysCalc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateCalcNumOfDaysCalc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateCalcNumOfDaysCalc
			                 ,CMN_DATE_CALC_NUM_OF_DAYS_CALC_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateCalcNumOfDaysCalc", beginCmnDateCalcNumOfDaysCalc,CMN_DATE_CALC_NUM_OF_DAYS_CALC_LEN);
    }
   	}
     int localCmnDateCalcDayOfWeekLitCounter = -1;
     public boolean isCmnDateCalcDayOfWeekLitModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcDayOfWeekLitCounter != sharedCounter;
         localCmnDateCalcDayOfWeekLitCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_DAY_OF_WEEK_LIT_LEN = 3;
	/**
	 * 	serialize this CmnDateCalcDayOfWeekLit
	 */
   protected void serializeCmnDateCalcDayOfWeekLit(char[] cmnDateCalcDayOfWeekLit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcDayOfWeekLit,0,getStringValue(),beginCmnDateCalcDayOfWeekLit,CMN_DATE_CALC_DAY_OF_WEEK_LIT_LEN);
       localCmnDateCalcDayOfWeekLitCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcDayOfWeekLitConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcDayOfWeekLit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcDayOfWeekLit() {	 
   		return (substring(getStringValue(),beginCmnDateCalcDayOfWeekLit,beginCmnDateCalcDayOfWeekLit + CMN_DATE_CALC_DAY_OF_WEEK_LIT_LEN));
   	}
     int localCmnDateCalcDayOfWeekNumCounter = -1;
     public boolean isCmnDateCalcDayOfWeekNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcDayOfWeekNumCounter != sharedCounter;
         localCmnDateCalcDayOfWeekNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateCalcDayOfWeekNum
	 *	@return cmnDateCalcDayOfWeekNum
	 */
	public char[]  getCmnDateCalcDayOfWeekNumString() {
	     return getCharArray(beginCmnDateCalcDayOfWeekNum,CMN_DATE_CALC_DAY_OF_WEEK_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateCalcDayOfWeekNumIsNumeric() {
	    return isNumeric(beginCmnDateCalcDayOfWeekNum
	                    ,beginCmnDateCalcDayOfWeekNum + CMN_DATE_CALC_DAY_OF_WEEK_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CALC_DAY_OF_WEEK_NUM_LEN = 2;
  	/**
	 * serializeCmnDateCalcDayOfWeekNum
	 */
	protected void serializeCmnDateCalcDayOfWeekNum(int cmnDateCalcDayOfWeekNum) {
		 putNumber(beginCmnDateCalcDayOfWeekNum,cmnDateCalcDayOfWeekNum,CMN_DATE_CALC_DAY_OF_WEEK_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateCalcDayOfWeekNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateCalcDayOfWeekNum
	 */
   	protected  int serializeCmnDateCalcDayOfWeekNum(char[] value) {
	    int  cmnDateCalcDayOfWeekNum;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateCalcDayOfWeekNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnDateCalcDayOfWeekNum
		       ,2
		      );
		 localCmnDateCalcDayOfWeekNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateCalcDayOfWeekNum;
    }

   protected int checkCmnDateCalcDayOfWeekNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateCalcDayOfWeekNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateCalcDayOfWeekNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateCalcDayOfWeekNum
			                 ,CMN_DATE_CALC_DAY_OF_WEEK_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateCalcDayOfWeekNum", beginCmnDateCalcDayOfWeekNum,CMN_DATE_CALC_DAY_OF_WEEK_NUM_LEN);
    }
   	}




}
  
