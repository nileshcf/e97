package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WRespuRSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WRespuRSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WRespuRSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_RESPU_R_LENGTH = 42;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWRespR1;
	
	/**
	* Constructor for WRespuRSerialized
	**/
    public WRespuRSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WRespuRSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WRespuRSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WRespuRSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WRespuRSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WRespuRSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_RESPU_R_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWRespR1 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWRespR1Counter = -1;
     public boolean isWRespR1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWRespR1Counter != sharedCounter;
         localWRespR1Counter = sharedCounter; return hasModified;
     }
	protected static final int W_RESP_R_1_LEN = 40;
	/**
	 * 	serialize this WRespR1
	 */
   protected void serializeWRespR1(char[] wRespR1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wRespR1,0,getStringValue(),beginWRespR1,W_RESP_R_1_LEN);
       localWRespR1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWRespR1Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshWRespR1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWRespR1() {	 
   		return (substring(getStringValue(),beginWRespR1,beginWRespR1 + W_RESP_R_1_LEN));
   	}




}
  
