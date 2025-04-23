package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse12aTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse12aTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse12aTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_12A_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller018;
	
	/**
	* Constructor for Wse12aTGrpSerialized
	**/
    public Wse12aTGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse12aTGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse12aTGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse12aTGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse12aTGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse12aTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_12A_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller018 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller018Counter = -1;
     public boolean isWseFiller018Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller018Counter != sharedCounter;
         localWseFiller018Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_018_LEN = 5;
	/**
	 * 	serialize this WseFiller018
	 */
   protected void serializeWseFiller018(char[] wseFiller018) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller018,0,getStringValue(),beginWseFiller018,WSE_FILLER_018_LEN);
       localWseFiller018Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller018Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWseFiller018 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller018() {	 
   		return (substring(getStringValue(),beginWseFiller018,beginWseFiller018 + WSE_FILLER_018_LEN));
   	}




}
  
