package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse9bTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse9bTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse9bTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_9B_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller011;
	
	/**
	* Constructor for Wse9bTGrpSerialized
	**/
    public Wse9bTGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse9bTGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse9bTGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse9bTGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse9bTGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse9bTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_9B_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller011 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller011Counter = -1;
     public boolean isWseFiller011Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller011Counter != sharedCounter;
         localWseFiller011Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_011_LEN = 5;
	/**
	 * 	serialize this WseFiller011
	 */
   protected void serializeWseFiller011(char[] wseFiller011) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller011,0,getStringValue(),beginWseFiller011,WSE_FILLER_011_LEN);
       localWseFiller011Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller011Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWseFiller011 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller011() {	 
   		return (substring(getStringValue(),beginWseFiller011,beginWseFiller011 + WSE_FILLER_011_LEN));
   	}




}
  
