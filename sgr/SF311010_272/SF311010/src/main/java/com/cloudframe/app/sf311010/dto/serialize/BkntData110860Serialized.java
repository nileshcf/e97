package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class BkntData110860Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BkntData110860Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BkntData110860Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BKNT_DATA_110860_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFinNetwork110860;
	
	/**
	* Constructor for BkntData110860Serialized
	**/
    public BkntData110860Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BkntData110860Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BkntData110860Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BkntData110860Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,242); // serialize this field at offset 242 by default 
    }
    
	/**
	* sets parent for this BkntData110860Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 242 by default
    }    
	/**
	* initializes the field in BkntData110860Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BKNT_DATA_110860_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFinNetwork110860 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFinNetwork110860Counter = -1;
     public boolean isFinNetwork110860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFinNetwork110860Counter != sharedCounter;
         localFinNetwork110860Counter = sharedCounter; return hasModified;
     }
	protected static final int FIN_NETWORK_110860_LEN = 3;
	/**
	 * 	serialize this FinNetwork110860
	 */
   protected void serializeFinNetwork110860(char[] finNetwork110860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(finNetwork110860,0,getStringValue(),beginFinNetwork110860,FIN_NETWORK_110860_LEN);
       localFinNetwork110860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFinNetwork110860Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFinNetwork110860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFinNetwork110860() {	 
   		return (substring(getStringValue(),beginFinNetwork110860,beginFinNetwork110860 + FIN_NETWORK_110860_LEN));
   	}




}
  
