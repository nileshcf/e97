package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse20aTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse20aTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse20aTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_20A_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller038;
	
	/**
	* Constructor for Wse20aTGrpSerialized
	**/
    public Wse20aTGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse20aTGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse20aTGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse20aTGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse20aTGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse20aTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_20A_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller038 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller038Counter = -1;
     public boolean isWseFiller038Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller038Counter != sharedCounter;
         localWseFiller038Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_038_LEN = 5;
	/**
	 * 	serialize this WseFiller038
	 */
   protected void serializeWseFiller038(char[] wseFiller038) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller038,0,getStringValue(),beginWseFiller038,WSE_FILLER_038_LEN);
       localWseFiller038Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller038Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWseFiller038 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller038() {	 
   		return (substring(getStringValue(),beginWseFiller038,beginWseFiller038 + WSE_FILLER_038_LEN));
   	}




}
  
