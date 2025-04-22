package com.cloudframe.app.sf910020.dto.serialize;

/**
*  The class Idx800RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Idx800RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Idx800RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IDX_800_REDEFINED_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIdxX800;
	
	/**
	* Constructor for Idx800RedefinedSerialized
	**/
    public Idx800RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Idx800RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Idx800RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Idx800RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Idx800RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Idx800RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IDX_800_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIdxX800 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIdxX800Counter = -1;
     public boolean isIdxX800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIdxX800Counter != sharedCounter;
         localIdxX800Counter = sharedCounter; return hasModified;
     }
	protected static final int IDX_X_800_LEN = 1;
	/**
	 * 	serialize this IdxX800
	 */
   protected void serializeIdxX800(char[] idxX800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(idxX800,0,getStringValue(),beginIdxX800,IDX_X_800_LEN);
       localIdxX800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIdxX800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIdxX800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIdxX800() {	 
   		return (substring(getStringValue(),beginIdxX800,beginIdxX800 + IDX_X_800_LEN));
   	}




}
  
