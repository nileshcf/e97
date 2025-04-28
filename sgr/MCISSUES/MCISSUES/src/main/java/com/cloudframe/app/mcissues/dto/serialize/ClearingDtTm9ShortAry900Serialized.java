package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class ClearingDtTm9ShortAry900Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ClearingDtTm9ShortAry900Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ClearingDtTm9ShortAry900Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CLEARING_DT_TM_9_SHORT_ARY_900_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginClearingDtTm9Short900;
	
	/**
	* Constructor for ClearingDtTm9ShortAry900Serialized
	**/
    public ClearingDtTm9ShortAry900Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ClearingDtTm9ShortAry900Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ClearingDtTm9ShortAry900Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ClearingDtTm9ShortAry900Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ClearingDtTm9ShortAry900Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ClearingDtTm9ShortAry900Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CLEARING_DT_TM_9_SHORT_ARY_900_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginClearingDtTm9Short900 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localClearingDtTm9Short900Counter = -1;
     public boolean isClearingDtTm9Short900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClearingDtTm9Short900Counter != sharedCounter;
         localClearingDtTm9Short900Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of clearingDtTm9Short900
	 *	@return clearingDtTm9Short900
	 */
	public char[]  getClearingDtTm9Short900String() {
	     return getCharArray(beginClearingDtTm9Short900,CLEARING_DT_TM_9_SHORT_900_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean clearingDtTm9Short900IsNumeric() {
	    return isNumeric(beginClearingDtTm9Short900
	                    ,beginClearingDtTm9Short900 + CLEARING_DT_TM_9_SHORT_900_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CLEARING_DT_TM_9_SHORT_900_LEN = 8;
  	/**
	 * serializeClearingDtTm9Short900
	 */
	protected void serializeClearingDtTm9Short900(long clearingDtTm9Short900) {
		 putNumber(beginClearingDtTm9Short900,clearingDtTm9Short900,CLEARING_DT_TM_9_SHORT_900_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localClearingDtTm9Short900Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeClearingDtTm9Short900
	 */
   	protected  long serializeClearingDtTm9Short900(char[] value) {
	    long  clearingDtTm9Short900;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    clearingDtTm9Short900 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginClearingDtTm9Short900
		       ,8
		      );
		 localClearingDtTm9Short900Counter = shareString.getSerializedField().getModifiedCounter();
		return  clearingDtTm9Short900;
    }

   protected long checkClearingDtTm9Short900MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshClearingDtTm9Short900 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshClearingDtTm9Short900() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginClearingDtTm9Short900
			                 ,CLEARING_DT_TM_9_SHORT_900_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("clearingDtTm9Short900", beginClearingDtTm9Short900,CLEARING_DT_TM_9_SHORT_900_LEN);
    }
   	}




}
  
