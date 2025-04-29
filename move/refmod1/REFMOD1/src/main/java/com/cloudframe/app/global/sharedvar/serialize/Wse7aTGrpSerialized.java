package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse7aTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse7aTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse7aTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_7A_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller04;
	
	/**
	* Constructor for Wse7aTGrpSerialized
	**/
    public Wse7aTGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse7aTGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse7aTGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse7aTGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse7aTGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse7aTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_7A_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller04 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller04Counter = -1;
     public boolean isWseFiller04Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller04Counter != sharedCounter;
         localWseFiller04Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_04_LEN = 5;
	/**
	 * 	serialize this WseFiller04
	 */
   protected void serializeWseFiller04(char[] wseFiller04) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller04,0,getStringValue(),beginWseFiller04,WSE_FILLER_04_LEN);
       localWseFiller04Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller04Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWseFiller04 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller04() {	 
   		return (substring(getStringValue(),beginWseFiller04,beginWseFiller04 + WSE_FILLER_04_LEN));
   	}




}
  
