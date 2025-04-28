package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class ErrorDesc800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorDesc800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorDesc800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_DESC_800_LENGTH = 206;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrDesc1800;
            protected  int beginErrDesc2800;
	
	/**
	* Constructor for ErrorDesc800Serialized
	**/
    public ErrorDesc800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ErrorDesc800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrorDesc800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ErrorDesc800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,88); // serialize this field at offset 88 by default 
    }
    
	/**
	* sets parent for this ErrorDesc800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 88 by default
    }    
	/**
	* initializes the field in ErrorDesc800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_DESC_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginErrDesc1800 = getStartOffset() + 0;	// set offset for serialization
  
             beginErrDesc2800 = getStartOffset() + 106;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localErrDesc1800Counter = -1;
     public boolean isErrDesc1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrDesc1800Counter != sharedCounter;
         localErrDesc1800Counter = sharedCounter; return hasModified;
     }
	protected static final int ERR_DESC_1800_LEN = 106;
	/**
	 * 	serialize this ErrDesc1800
	 */
   protected void serializeErrDesc1800(char[] errDesc1800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errDesc1800,0,getStringValue(),beginErrDesc1800,ERR_DESC_1800_LEN);
       localErrDesc1800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrDesc1800Constraints(char[] value) {
   			return super.checkConstraints(value , 106 ,false, false);
   }
    /**
	 *	refreshErrDesc1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrDesc1800() {	 
   		return (substring(getStringValue(),beginErrDesc1800,beginErrDesc1800 + ERR_DESC_1800_LEN));
   	}
     int localErrDesc2800Counter = -1;
     public boolean isErrDesc2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrDesc2800Counter != sharedCounter;
         localErrDesc2800Counter = sharedCounter; return hasModified;
     }
	protected static final int ERR_DESC_2800_LEN = 100;
	/**
	 * 	serialize this ErrDesc2800
	 */
   protected void serializeErrDesc2800(char[] errDesc2800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errDesc2800,0,getStringValue(),beginErrDesc2800,ERR_DESC_2800_LEN);
       localErrDesc2800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrDesc2800Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
    /**
	 *	refreshErrDesc2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrDesc2800() {	 
   		return (substring(getStringValue(),beginErrDesc2800,beginErrDesc2800 + ERR_DESC_2800_LEN));
   	}




}
  
