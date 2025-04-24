package com.cloudframe.app.dispif.dto.serialize;

/**
*  The class IntXSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IntXSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IntXSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INT_X_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIntX2;
	
	/**
	* Constructor for IntXSerialized
	**/
    public IntXSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IntXSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IntXSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IntXSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this IntXSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in IntXSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INT_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIntX2 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIntX2Counter = -1;
     public boolean isIntX2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIntX2Counter != sharedCounter;
         localIntX2Counter = sharedCounter; return hasModified;
     }
	protected static final int INT_X_2_LEN = 2;
	/**
	 * 	serialize this IntX2
	 */
   protected void serializeIntX2(char[] intX2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(intX2,0,getStringValue(),beginIntX2,INT_X_2_LEN);
       localIntX2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIntX2Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIntX2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIntX2() {	 
   		return (substring(getStringValue(),beginIntX2,beginIntX2 + INT_X_2_LEN));
   	}




}
  
