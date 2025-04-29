package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WRespuMrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WRespuMrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WRespuMrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_RESPU_MR_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWRespMr1;
	
	/**
	* Constructor for WRespuMrSerialized
	**/
    public WRespuMrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WRespuMrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WRespuMrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WRespuMrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WRespuMrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WRespuMrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_RESPU_MR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWRespMr1 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWRespMr1Counter = -1;
     public boolean isWRespMr1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWRespMr1Counter != sharedCounter;
         localWRespMr1Counter = sharedCounter; return hasModified;
     }
	protected static final int W_RESP_MR_1_LEN = 24;
	/**
	 * 	serialize this WRespMr1
	 */
   protected void serializeWRespMr1(char[] wRespMr1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wRespMr1,0,getStringValue(),beginWRespMr1,W_RESP_MR_1_LEN);
       localWRespMr1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWRespMr1Constraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshWRespMr1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWRespMr1() {	 
   		return (substring(getStringValue(),beginWRespMr1,beginWRespMr1 + W_RESP_MR_1_LEN));
   	}




}
  
