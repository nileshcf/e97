package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RlhzaFiller02Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlhzaFiller02Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlhzaFiller02Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLHZA_FILLER_02_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlhzaRcBlAsOfDay;
	
	/**
	* Constructor for RlhzaFiller02Serialized
	**/
    public RlhzaFiller02Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RlhzaFiller02Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlhzaFiller02Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RlhzaFiller02Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,12); // serialize this field at offset 12 by default 
    }
    
	/**
	* sets parent for this RlhzaFiller02Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 12 by default
    }    
	/**
	* initializes the field in RlhzaFiller02Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLHZA_FILLER_02_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlhzaRcBlAsOfDay = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlhzaRcBlAsOfDayCounter = -1;
     public boolean isRlhzaRcBlAsOfDayModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlhzaRcBlAsOfDayCounter != sharedCounter;
         localRlhzaRcBlAsOfDayCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlhzaRcBlAsOfDay
	 *	@return rlhzaRcBlAsOfDay
	 */
	public char[]  getRlhzaRcBlAsOfDayString() {
	     return getCharArray(beginRlhzaRcBlAsOfDay,RLHZA_RC_BL_AS_OF_DAY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlhzaRcBlAsOfDayIsNumeric() {
	    return isNumeric(beginRlhzaRcBlAsOfDay
	                    ,beginRlhzaRcBlAsOfDay + RLHZA_RC_BL_AS_OF_DAY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLHZA_RC_BL_AS_OF_DAY_LEN = 2;
  	/**
	 * serializeRlhzaRcBlAsOfDay
	 */
	protected void serializeRlhzaRcBlAsOfDay(int rlhzaRcBlAsOfDay) {
		 putNumber(beginRlhzaRcBlAsOfDay,rlhzaRcBlAsOfDay,RLHZA_RC_BL_AS_OF_DAY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlhzaRcBlAsOfDayCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlhzaRcBlAsOfDay
	 */
   	protected  int serializeRlhzaRcBlAsOfDay(char[] value) {
	    int  rlhzaRcBlAsOfDay;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlhzaRcBlAsOfDay = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlhzaRcBlAsOfDay
		       ,2
		      );
		 localRlhzaRcBlAsOfDayCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlhzaRcBlAsOfDay;
    }

   protected int checkRlhzaRcBlAsOfDayMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlhzaRcBlAsOfDay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlhzaRcBlAsOfDay() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlhzaRcBlAsOfDay
			                 ,RLHZA_RC_BL_AS_OF_DAY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlhzaRcBlAsOfDay", beginRlhzaRcBlAsOfDay,RLHZA_RC_BL_AS_OF_DAY_LEN);
    }
   	}




}
  
