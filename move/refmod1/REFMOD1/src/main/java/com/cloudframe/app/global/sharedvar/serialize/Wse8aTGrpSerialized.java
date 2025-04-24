package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse8aTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse8aTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse8aTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_8A_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller06;
	
	/**
	* Constructor for Wse8aTGrpSerialized
	**/
    public Wse8aTGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse8aTGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse8aTGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse8aTGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse8aTGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse8aTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_8A_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller06 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller06Counter = -1;
     public boolean isWseFiller06Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller06Counter != sharedCounter;
         localWseFiller06Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_06_LEN = 5;
	/**
	 * 	serialize this WseFiller06
	 */
   protected void serializeWseFiller06(char[] wseFiller06) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller06,0,getStringValue(),beginWseFiller06,WSE_FILLER_06_LEN);
       localWseFiller06Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller06Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWseFiller06 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller06() {	 
   		return (substring(getStringValue(),beginWseFiller06,beginWseFiller06 + WSE_FILLER_06_LEN));
   	}




}
  
