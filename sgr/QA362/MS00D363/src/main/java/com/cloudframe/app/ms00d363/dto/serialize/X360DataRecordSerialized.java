package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360DataRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X360DataRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360DataRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_DATA_RECORD_LENGTH = 1399;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360FBatchIchngSw;
	
	/**
	* Constructor for X360DataRecordSerialized
	**/
    public X360DataRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360DataRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360DataRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360DataRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1); // serialize this field at offset 1 by default 
    }
    
	/**
	* sets parent for this X360DataRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1 by default
    }    
	/**
	* initializes the field in X360DataRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_DATA_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginX360FBatchIchngSw = getStartOffset() + 1231;	// set offset for serialization
  
  
  
  
	   /*  end of offset */
	}
     int localX360FBatchIchngSwCounter = -1;
     public boolean isX360FBatchIchngSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FBatchIchngSwCounter != sharedCounter;
         localX360FBatchIchngSwCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_FBATCH_ICHNG_SW_LEN = 1;
	/**
	 * 	serialize this X360FBatchIchngSw
	 */
   protected void serializeX360FBatchIchngSw(char[] x360FBatchIchngSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360FBatchIchngSw,0,getStringValue(),beginX360FBatchIchngSw,X_360_FBATCH_ICHNG_SW_LEN);
       localX360FBatchIchngSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360FBatchIchngSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshX360FBatchIchngSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360FBatchIchngSw() {	 
   		return (substring(getStringValue(),beginX360FBatchIchngSw,beginX360FBatchIchngSw + X_360_FBATCH_ICHNG_SW_LEN));
   	}




}
  
