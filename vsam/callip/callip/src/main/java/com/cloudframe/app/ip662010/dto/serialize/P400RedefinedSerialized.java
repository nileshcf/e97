package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class P400RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class P400RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(P400RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int P_400_REDEFINED_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPX400;
	
	/**
	* Constructor for P400RedefinedSerialized
	**/
    public P400RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for P400RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public P400RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this P400RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this P400RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in P400RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(P_400_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPX400 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPX400Counter = -1;
     public boolean isPX400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPX400Counter != sharedCounter;
         localPX400Counter = sharedCounter; return hasModified;
     }
	protected static final int P_X_400_LEN = 1;
	/**
	 * 	serialize this PX400
	 */
   protected void serializePX400(char[] pX400) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pX400,0,getStringValue(),beginPX400,P_X_400_LEN);
       localPX400Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPX400Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshPX400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPX400() {	 
   		return (substring(getStringValue(),beginPX400,beginPX400 + P_X_400_LEN));
   	}




}
  
