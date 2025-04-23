package com.cloudframe.app.vsammon4.dto.serialize;

/**
*  The class ReadallDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:01. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ReadallDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ReadallDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int READALL_DATA_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRKey;
	
	/**
	* Constructor for ReadallDataSerialized
	**/
    public ReadallDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ReadallDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ReadallDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ReadallDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7); // serialize this field at offset 7 by default 
    }
    
	/**
	* sets parent for this ReadallDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7 by default
    }    
	/**
	* initializes the field in ReadallDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(READALL_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRKey = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRKeyCounter = -1;
     public boolean isRKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRKeyCounter != sharedCounter;
         localRKeyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rKey
	 *	@return rKey
	 */
	public char[]  getRKeyString() {
	     return getCharArray(beginRKey,R_KEY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rKeyIsNumeric() {
	    return isNumeric(beginRKey
	                    ,beginRKey + R_KEY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int R_KEY_LEN = 9;
  	/**
	 * serializeRKey
	 */
	protected void serializeRKey(long rKey) {
		 putNumber(beginRKey,rKey,R_KEY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRKeyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRKey
	 */
   	protected  long serializeRKey(char[] value) {
	    long  rKey;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rKey = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginRKey
		       ,9
		      );
		 localRKeyCounter = shareString.getSerializedField().getModifiedCounter();
		return  rKey;
    }

   protected long checkRKeyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRKey() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginRKey
			                 ,R_KEY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rKey", beginRKey,R_KEY_LEN);
    }
   	}




}
  
