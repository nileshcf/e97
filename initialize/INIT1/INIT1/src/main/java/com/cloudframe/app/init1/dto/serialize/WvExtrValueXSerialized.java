package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WvExtrValueXSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvExtrValueXSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvExtrValueXSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_EXTR_VALUE_X_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvExtrValue;
	
	/**
	* Constructor for WvExtrValueXSerialized
	**/
    public WvExtrValueXSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvExtrValueXSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrValueXSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvExtrValueXSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,86); // serialize this field at offset 86 by default 
    }
    
	/**
	* sets parent for this WvExtrValueXSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 86 by default
    }    
	/**
	* initializes the field in WvExtrValueXSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_EXTR_VALUE_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvExtrValue = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvExtrValueCounter = -1;
     public boolean isWvExtrValueModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrValueCounter != sharedCounter;
         localWvExtrValueCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_VALUE_LEN = 12;
	/**
	 * 	serialize this WvExtrValue
	 */
   protected void serializeWvExtrValue(char[] wvExtrValue) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrValue,0,getStringValue(),beginWvExtrValue,WV_EXTR_VALUE_LEN);
       localWvExtrValueCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrValueConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWvExtrValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrValue() {	 
   		return (substring(getStringValue(),beginWvExtrValue,beginWvExtrValue + WV_EXTR_VALUE_LEN));
   	}




}
  
