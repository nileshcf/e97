package com.cloudframe.app.dispif.dto.serialize;

/**
*  The class LongXSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LongXSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LongXSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LONG_X_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLongX2;
	
	/**
	* Constructor for LongXSerialized
	**/
    public LongXSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for LongXSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LongXSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this LongXSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this LongXSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in LongXSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LONG_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLongX2 = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLongX2Counter = -1;
     public boolean isLongX2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLongX2Counter != sharedCounter;
         localLongX2Counter = sharedCounter; return hasModified;
     }
	protected static final int LONG_X_2_LEN = 4;
	/**
	 * 	serialize this LongX2
	 */
   protected void serializeLongX2(char[] longX2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(longX2,0,getStringValue(),beginLongX2,LONG_X_2_LEN);
       localLongX2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLongX2Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshLongX2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLongX2() {	 
   		return (substring(getStringValue(),beginLongX2,beginLongX2 + LONG_X_2_LEN));
   	}




}
  
