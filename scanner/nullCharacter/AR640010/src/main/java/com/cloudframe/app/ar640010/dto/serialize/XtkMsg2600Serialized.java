package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class XtkMsg2600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class XtkMsg2600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(XtkMsg2600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int XTK_MSG_2600_LENGTH = 57;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFailedValidation600;
	
	/**
	* Constructor for XtkMsg2600Serialized
	**/
    public XtkMsg2600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for XtkMsg2600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XtkMsg2600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this XtkMsg2600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,184); // serialize this field at offset 184 by default 
    }
    
	/**
	* sets parent for this XtkMsg2600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 184 by default
    }    
	/**
	* initializes the field in XtkMsg2600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(XTK_MSG_2600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFailedValidation600 = getStartOffset() + 17;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFailedValidation600Counter = -1;
     public boolean isFailedValidation600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFailedValidation600Counter != sharedCounter;
         localFailedValidation600Counter = sharedCounter; return hasModified;
     }
	protected static final int FAILED_VALIDATION_600_LEN = 40;
	/**
	 * 	serialize this FailedValidation600
	 */
   protected void serializeFailedValidation600(char[] failedValidation600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(failedValidation600,0,getStringValue(),beginFailedValidation600,FAILED_VALIDATION_600_LEN);
       localFailedValidation600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFailedValidation600Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshFailedValidation600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFailedValidation600() {	 
   		return (substring(getStringValue(),beginFailedValidation600,beginFailedValidation600 + FAILED_VALIDATION_600_LEN));
   	}




}
  
