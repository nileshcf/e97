package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WRespuSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WRespuSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WRespuSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_RESPU_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWResp1;
	
	/**
	* Constructor for WRespuSerialized
	**/
    public WRespuSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WRespuSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WRespuSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WRespuSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WRespuSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WRespuSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_RESPU_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWResp1 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWResp1Counter = -1;
     public boolean isWResp1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWResp1Counter != sharedCounter;
         localWResp1Counter = sharedCounter; return hasModified;
     }
	protected static final int W_RESP_1_LEN = 60;
	/**
	 * 	serialize this WResp1
	 */
   protected void serializeWResp1(char[] wResp1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wResp1,0,getStringValue(),beginWResp1,W_RESP_1_LEN);
       localWResp1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWResp1Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWResp1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWResp1() {	 
   		return (substring(getStringValue(),beginWResp1,beginWResp1 + W_RESP_1_LEN));
   	}




}
  
