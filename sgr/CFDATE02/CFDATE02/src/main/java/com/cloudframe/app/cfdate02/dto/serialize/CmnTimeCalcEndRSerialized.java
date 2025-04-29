package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class CmnTimeCalcEndRSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnTimeCalcEndRSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnTimeCalcEndRSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_TIME_CALC_END_R_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnTimeCalcEndSs;
	
	/**
	* Constructor for CmnTimeCalcEndRSerialized
	**/
    public CmnTimeCalcEndRSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnTimeCalcEndRSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeCalcEndRSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnTimeCalcEndRSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1031); // serialize this field at offset 1031 by default 
    }
    
	/**
	* sets parent for this CmnTimeCalcEndRSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1031 by default
    }    
	/**
	* initializes the field in CmnTimeCalcEndRSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_TIME_CALC_END_R_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnTimeCalcEndSs = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnTimeCalcEndSsCounter = -1;
     public boolean isCmnTimeCalcEndSsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeCalcEndSsCounter != sharedCounter;
         localCmnTimeCalcEndSsCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnTimeCalcEndSs
	 *	@return cmnTimeCalcEndSs
	 */
	public char[]  getCmnTimeCalcEndSsString() {
	     return getCharArray(beginCmnTimeCalcEndSs,CMN_TIME_CALC_END_SS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnTimeCalcEndSsIsNumeric() {
	    return isNumeric(beginCmnTimeCalcEndSs
	                    ,beginCmnTimeCalcEndSs + CMN_TIME_CALC_END_SS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_TIME_CALC_END_SS_LEN = 2;
  	/**
	 * serializeCmnTimeCalcEndSs
	 */
	protected void serializeCmnTimeCalcEndSs(int cmnTimeCalcEndSs) {
		 putNumber(beginCmnTimeCalcEndSs,cmnTimeCalcEndSs,CMN_TIME_CALC_END_SS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnTimeCalcEndSsCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnTimeCalcEndSs
	 */
   	protected  int serializeCmnTimeCalcEndSs(char[] value) {
	    int  cmnTimeCalcEndSs;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnTimeCalcEndSs = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCmnTimeCalcEndSs
		       ,2
		      );
		 localCmnTimeCalcEndSsCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnTimeCalcEndSs;
    }

   protected int checkCmnTimeCalcEndSsMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnTimeCalcEndSs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnTimeCalcEndSs() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnTimeCalcEndSs
			                 ,CMN_TIME_CALC_END_SS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnTimeCalcEndSs", beginCmnTimeCalcEndSs,CMN_TIME_CALC_END_SS_LEN);
    }
   	}




}
  
