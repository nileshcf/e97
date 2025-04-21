package com.cloudframe.app.si994010.dto.serialize;

/**
*  The class Idx400RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Idx400RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Idx400RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IDX_400_REDEFINED_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIdxX400;
	
	/**
	* Constructor for Idx400RedefinedSerialized
	**/
    public Idx400RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Idx400RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Idx400RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Idx400RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Idx400RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Idx400RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IDX_400_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIdxX400 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIdxX400Counter = -1;
     public boolean isIdxX400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIdxX400Counter != sharedCounter;
         localIdxX400Counter = sharedCounter; return hasModified;
     }
	protected static final int IDX_X_400_LEN = 1;
	/**
	 * 	serialize this IdxX400
	 */
   protected void serializeIdxX400(char[] idxX400) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(idxX400,0,getStringValue(),beginIdxX400,IDX_X_400_LEN);
       localIdxX400Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIdxX400Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIdxX400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIdxX400() {	 
   		return (substring(getStringValue(),beginIdxX400,beginIdxX400 + IDX_X_400_LEN));
   	}




}
  
