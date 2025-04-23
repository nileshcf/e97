package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class ForwardInstId860RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ForwardInstId860RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ForwardInstId860RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FORWARD_INST_ID_860_REDEFINED_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginForwardInstIdOnly860;
	
	/**
	* Constructor for ForwardInstId860RedefinedSerialized
	**/
    public ForwardInstId860RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ForwardInstId860RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ForwardInstId860RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ForwardInstId860RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,119); // serialize this field at offset 119 by default 
    }
    
	/**
	* sets parent for this ForwardInstId860RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 119 by default
    }    
	/**
	* initializes the field in ForwardInstId860RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FORWARD_INST_ID_860_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginForwardInstIdOnly860 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localForwardInstIdOnly860Counter = -1;
     public boolean isForwardInstIdOnly860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localForwardInstIdOnly860Counter != sharedCounter;
         localForwardInstIdOnly860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of forwardInstIdOnly860
	 *	@return forwardInstIdOnly860
	 */
	public char[]  getForwardInstIdOnly860String() {
	     return getCharArray(beginForwardInstIdOnly860,FORWARD_INST_ID_ONLY_860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean forwardInstIdOnly860IsNumeric() {
	    return isNumeric(beginForwardInstIdOnly860
	                    ,beginForwardInstIdOnly860 + FORWARD_INST_ID_ONLY_860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FORWARD_INST_ID_ONLY_860_LEN = 6;
  	/**
	 * serializeForwardInstIdOnly860
	 */
	protected void serializeForwardInstIdOnly860(long forwardInstIdOnly860) {
		 putNumber(beginForwardInstIdOnly860,forwardInstIdOnly860,FORWARD_INST_ID_ONLY_860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localForwardInstIdOnly860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeForwardInstIdOnly860
	 */
   	protected  long serializeForwardInstIdOnly860(char[] value) {
	    long  forwardInstIdOnly860;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    forwardInstIdOnly860 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginForwardInstIdOnly860
		       ,6
		      );
		 localForwardInstIdOnly860Counter = shareString.getSerializedField().getModifiedCounter();
		return  forwardInstIdOnly860;
    }

   protected long checkForwardInstIdOnly860MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshForwardInstIdOnly860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshForwardInstIdOnly860() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginForwardInstIdOnly860
			                 ,FORWARD_INST_ID_ONLY_860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("forwardInstIdOnly860", beginForwardInstIdOnly860,FORWARD_INST_ID_ONLY_860_LEN);
    }
   	}




}
  
