package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WcdloMonthEndDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WcdloMonthEndDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcdloMonthEndDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WCDLO_MONTH_END_DT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcdloMonthEndDtDd;
	
	/**
	* Constructor for WcdloMonthEndDtSerialized
	**/
    public WcdloMonthEndDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcdloMonthEndDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloMonthEndDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcdloMonthEndDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,128); // serialize this field at offset 128 by default 
    }
    
	/**
	* sets parent for this WcdloMonthEndDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 128 by default
    }    
	/**
	* initializes the field in WcdloMonthEndDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WCDLO_MONTH_END_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWcdloMonthEndDtDd = getStartOffset() + 3;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWcdloMonthEndDtDdCounter = -1;
     public boolean isWcdloMonthEndDtDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloMonthEndDtDdCounter != sharedCounter;
         localWcdloMonthEndDtDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloMonthEndDtDd
	 *	@return wcdloMonthEndDtDd
	 */
	public char[]  getWcdloMonthEndDtDdString() {
	     return getCharArray(beginWcdloMonthEndDtDd,WCDLO_MONTH_END_DT_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloMonthEndDtDdIsNumeric() {
	    return isNumeric(beginWcdloMonthEndDtDd
	                    ,beginWcdloMonthEndDtDd + WCDLO_MONTH_END_DT_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_MONTH_END_DT_DD_LEN = 2;
  	/**
	 * serializeWcdloMonthEndDtDd
	 */
	protected void serializeWcdloMonthEndDtDd(int wcdloMonthEndDtDd) {
		 putNumber(beginWcdloMonthEndDtDd,wcdloMonthEndDtDd,WCDLO_MONTH_END_DT_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloMonthEndDtDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloMonthEndDtDd
	 */
   	protected  int serializeWcdloMonthEndDtDd(char[] value) {
	    int  wcdloMonthEndDtDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloMonthEndDtDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWcdloMonthEndDtDd
		       ,2
		      );
		 localWcdloMonthEndDtDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloMonthEndDtDd;
    }

   protected int checkWcdloMonthEndDtDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloMonthEndDtDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdloMonthEndDtDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdloMonthEndDtDd
			                 ,WCDLO_MONTH_END_DT_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloMonthEndDtDd", beginWcdloMonthEndDtDd,WCDLO_MONTH_END_DT_DD_LEN);
    }
   	}




}
  
