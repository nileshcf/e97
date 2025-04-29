package com.cloudframe.app.vsammon4.dto.serialize;

/**
*  The class StartDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class StartDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(StartDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int START_DATA_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSOperation;
            protected  int beginSKey;
	
	/**
	* Constructor for StartDataSerialized
	**/
    public StartDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for StartDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StartDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this StartDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7); // serialize this field at offset 7 by default 
    }
    
	/**
	* sets parent for this StartDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7 by default
    }    
	/**
	* initializes the field in StartDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(START_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSOperation = getStartOffset() + 0;	// set offset for serialization
  
             beginSKey = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSOperationCounter = -1;
     public boolean isSOperationModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSOperationCounter != sharedCounter;
         localSOperationCounter = sharedCounter; return hasModified;
     }
	protected static final int S_OPERATION_LEN = 2;
	/**
	 * 	serialize this SOperation
	 */
   protected void serializeSOperation(char[] sOperation) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sOperation,0,getStringValue(),beginSOperation,S_OPERATION_LEN);
       localSOperationCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSOperationConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSOperation is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSOperation() {	 
   		return (substring(getStringValue(),beginSOperation,beginSOperation + S_OPERATION_LEN));
   	}
     int localSKeyCounter = -1;
     public boolean isSKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSKeyCounter != sharedCounter;
         localSKeyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sKey
	 *	@return sKey
	 */
	public char[]  getSKeyString() {
	     return getCharArray(beginSKey,S_KEY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sKeyIsNumeric() {
	    return isNumeric(beginSKey
	                    ,beginSKey + S_KEY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int S_KEY_LEN = 9;
  	/**
	 * serializeSKey
	 */
	protected void serializeSKey(long sKey) {
		 putNumber(beginSKey,sKey,S_KEY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSKeyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSKey
	 */
   	protected  long serializeSKey(char[] value) {
	    long  sKey;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sKey = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginSKey
		       ,9
		      );
		 localSKeyCounter = shareString.getSerializedField().getModifiedCounter();
		return  sKey;
    }

   protected long checkSKeyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSKey() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSKey
			                 ,S_KEY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sKey", beginSKey,S_KEY_LEN);
    }
   	}




}
  
