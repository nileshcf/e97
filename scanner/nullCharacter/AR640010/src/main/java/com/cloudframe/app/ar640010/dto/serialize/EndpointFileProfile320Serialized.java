package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class EndpointFileProfile320Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EndpointFileProfile320Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EndpointFileProfile320Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ENDPOINT_FILE_PROFILE_320_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFileProfile320;
	
	/**
	* Constructor for EndpointFileProfile320Serialized
	**/
    public EndpointFileProfile320Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for EndpointFileProfile320Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EndpointFileProfile320Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this EndpointFileProfile320Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,441); // serialize this field at offset 441 by default 
    }
    
	/**
	* sets parent for this EndpointFileProfile320Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 441 by default
    }    
	/**
	* initializes the field in EndpointFileProfile320Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ENDPOINT_FILE_PROFILE_320_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFileProfile320 = getStartOffset() + 9;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFileProfile320Counter = -1;
     public boolean isFileProfile320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileProfile320Counter != sharedCounter;
         localFileProfile320Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_PROFILE_320_LEN = 13;
	/**
	 * 	serialize this FileProfile320
	 */
   protected void serializeFileProfile320(char[] fileProfile320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileProfile320,0,getStringValue(),beginFileProfile320,FILE_PROFILE_320_LEN);
       localFileProfile320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileProfile320Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshFileProfile320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileProfile320() {	 
   		return (substring(getStringValue(),beginFileProfile320,beginFileProfile320 + FILE_PROFILE_320_LEN));
   	}




}
  
