package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse9aTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse9aTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse9aTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_9A_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller09;
	
	/**
	* Constructor for Wse9aTGrpSerialized
	**/
    public Wse9aTGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse9aTGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse9aTGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse9aTGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse9aTGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse9aTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_9A_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller09 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller09Counter = -1;
     public boolean isWseFiller09Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller09Counter != sharedCounter;
         localWseFiller09Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_09_LEN = 5;
	/**
	 * 	serialize this WseFiller09
	 */
   protected void serializeWseFiller09(char[] wseFiller09) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller09,0,getStringValue(),beginWseFiller09,WSE_FILLER_09_LEN);
       localWseFiller09Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller09Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWseFiller09 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller09() {	 
   		return (substring(getStringValue(),beginWseFiller09,beginWseFiller09 + WSE_FILLER_09_LEN));
   	}




}
  
