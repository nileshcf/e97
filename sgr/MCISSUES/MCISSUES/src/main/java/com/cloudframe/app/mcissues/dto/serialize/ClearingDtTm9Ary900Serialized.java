package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class ClearingDtTm9Ary900Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ClearingDtTm9Ary900Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ClearingDtTm9Ary900Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CLEARING_DT_TM_9_ARY_900_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginClearingDtTm9900;
	
	/**
	* Constructor for ClearingDtTm9Ary900Serialized
	**/
    public ClearingDtTm9Ary900Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ClearingDtTm9Ary900Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ClearingDtTm9Ary900Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ClearingDtTm9Ary900Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ClearingDtTm9Ary900Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ClearingDtTm9Ary900Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CLEARING_DT_TM_9_ARY_900_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginClearingDtTm9900 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localClearingDtTm9900Counter = -1;
     public boolean isClearingDtTm9900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClearingDtTm9900Counter != sharedCounter;
         localClearingDtTm9900Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of clearingDtTm9900
	 *	@return clearingDtTm9900
	 */
	public char[]  getClearingDtTm9900String() {
	     return getCharArray(beginClearingDtTm9900,CLEARING_DT_TM_9900_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean clearingDtTm9900IsNumeric() {
	    return isNumeric(beginClearingDtTm9900
	                    ,beginClearingDtTm9900 + CLEARING_DT_TM_9900_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CLEARING_DT_TM_9900_LEN = 12;
  	/**
	 * serializeClearingDtTm9900
	 */
	protected void serializeClearingDtTm9900(long clearingDtTm9900) {
		 putNumber(beginClearingDtTm9900,clearingDtTm9900,CLEARING_DT_TM_9900_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localClearingDtTm9900Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeClearingDtTm9900
	 */
   	protected  long serializeClearingDtTm9900(char[] value) {
	    long  clearingDtTm9900;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    clearingDtTm9900 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginClearingDtTm9900
		       ,12
		      );
		 localClearingDtTm9900Counter = shareString.getSerializedField().getModifiedCounter();
		return  clearingDtTm9900;
    }

   protected long checkClearingDtTm9900MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshClearingDtTm9900 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshClearingDtTm9900() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginClearingDtTm9900
			                 ,CLEARING_DT_TM_9900_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("clearingDtTm9900", beginClearingDtTm9900,CLEARING_DT_TM_9900_LEN);
    }
   	}




}
  
