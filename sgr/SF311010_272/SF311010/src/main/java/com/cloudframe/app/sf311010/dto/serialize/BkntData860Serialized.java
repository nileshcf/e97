package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class BkntData860Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BkntData860Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BkntData860Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BKNT_DATA_860_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFinNetworkCode860;
	
	/**
	* Constructor for BkntData860Serialized
	**/
    public BkntData860Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BkntData860Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BkntData860Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BkntData860Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,682); // serialize this field at offset 682 by default 
    }
    
	/**
	* sets parent for this BkntData860Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 682 by default
    }    
	/**
	* initializes the field in BkntData860Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BKNT_DATA_860_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFinNetworkCode860 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFinNetworkCode860Counter = -1;
     public boolean isFinNetworkCode860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFinNetworkCode860Counter != sharedCounter;
         localFinNetworkCode860Counter = sharedCounter; return hasModified;
     }
	protected static final int FIN_NETWORK_CODE_860_LEN = 3;
	/**
	 * 	serialize this FinNetworkCode860
	 */
   protected void serializeFinNetworkCode860(char[] finNetworkCode860) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(finNetworkCode860,0,getStringValue(),beginFinNetworkCode860,FIN_NETWORK_CODE_860_LEN);
       localFinNetworkCode860Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFinNetworkCode860Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFinNetworkCode860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFinNetworkCode860() {	 
   		return (substring(getStringValue(),beginFinNetworkCode860,beginFinNetworkCode860 + FIN_NETWORK_CODE_860_LEN));
   	}




}
  
