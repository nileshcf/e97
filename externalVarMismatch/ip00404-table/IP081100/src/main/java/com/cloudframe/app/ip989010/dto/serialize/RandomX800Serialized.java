package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class RandomX800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RandomX800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RandomX800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RANDOM_X_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRandomP4P8800;
	
	/**
	* Constructor for RandomX800Serialized
	**/
    public RandomX800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RandomX800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RandomX800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RandomX800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2375); // serialize this field at offset 2375 by default 
    }
    
	/**
	* sets parent for this RandomX800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2375 by default
    }    
	/**
	* initializes the field in RandomX800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RANDOM_X_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRandomP4P8800 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRandomP4P8800Counter = -1;
     public boolean isRandomP4P8800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRandomP4P8800Counter != sharedCounter;
         localRandomP4P8800Counter = sharedCounter; return hasModified;
     }
	protected static final int RANDOM_P_4_P_8800_LEN = 5;
	/**
	 * 	serialize this RandomP4P8800
	 */
   protected void serializeRandomP4P8800(char[] randomP4P8800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(randomP4P8800,0,getStringValue(),beginRandomP4P8800,RANDOM_P_4_P_8800_LEN);
       localRandomP4P8800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRandomP4P8800Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshRandomP4P8800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRandomP4P8800() {	 
   		return (substring(getStringValue(),beginRandomP4P8800,beginRandomP4P8800 + RANDOM_P_4_P_8800_LEN));
   	}




}
  
