package com.cloudframe.app.calldrvr.dto.serialize;

/**
*  The class ByContentSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ByContentSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ByContentSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BY_CONTENT_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParm1;
	
	/**
	* Constructor for ByContentSerialized
	**/
    public ByContentSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ByContentSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ByContentSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ByContentSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ByContentSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ByContentSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BY_CONTENT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParm1 = getStartOffset() + 0;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localParm1Counter = -1;
     public boolean isParm1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParm1Counter != sharedCounter;
         localParm1Counter = sharedCounter; return hasModified;
     }
	protected static final int PARM_1_LEN = 8;
	/**
	 * 	serialize this Parm1
	 */
   protected void serializeParm1(char[] parm1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parm1,0,getStringValue(),beginParm1,PARM_1_LEN);
       localParm1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParm1Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshParm1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParm1() {	 
   		return (substring(getStringValue(),beginParm1,beginParm1 + PARM_1_LEN));
   	}




}
  
