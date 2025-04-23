package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WPartsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WPartsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WPartsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_PARTS_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWPart2;
	
	/**
	* Constructor for WPartsSerialized
	**/
    public WPartsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WPartsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WPartsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WPartsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WPartsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WPartsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_PARTS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWPart2 = getStartOffset() + 16;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWPart2Counter = -1;
     public boolean isWPart2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWPart2Counter != sharedCounter;
         localWPart2Counter = sharedCounter; return hasModified;
     }
	protected static final int W_PART_2_LEN = 6;
	/**
	 * 	serialize this WPart2
	 */
   protected void serializeWPart2(char[] wPart2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wPart2,0,getStringValue(),beginWPart2,W_PART_2_LEN);
       localWPart2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWPart2Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshWPart2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWPart2() {	 
   		return (substring(getStringValue(),beginWPart2,beginWPart2 + W_PART_2_LEN));
   	}




}
  
