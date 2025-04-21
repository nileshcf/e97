package com.cloudframe.app.dispif.dto.serialize;

/**
*  The class ShortXSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ShortXSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ShortXSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SHORT_X_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginShortX2;
	
	/**
	* Constructor for ShortXSerialized
	**/
    public ShortXSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ShortXSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ShortXSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ShortXSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ShortXSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ShortXSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SHORT_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginShortX2 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localShortX2Counter = -1;
     public boolean isShortX2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localShortX2Counter != sharedCounter;
         localShortX2Counter = sharedCounter; return hasModified;
     }
	protected static final int SHORT_X_2_LEN = 1;
	/**
	 * 	serialize this ShortX2
	 */
   protected void serializeShortX2(char[] shortX2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(shortX2,0,getStringValue(),beginShortX2,SHORT_X_2_LEN);
       localShortX2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkShortX2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshShortX2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshShortX2() {	 
   		return (substring(getStringValue(),beginShortX2,beginShortX2 + SHORT_X_2_LEN));
   	}




}
  
