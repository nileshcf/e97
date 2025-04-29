package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse14aTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse14aTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse14aTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_14A_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller025;
	
	/**
	* Constructor for Wse14aTGrpSerialized
	**/
    public Wse14aTGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse14aTGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse14aTGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse14aTGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse14aTGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse14aTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_14A_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller025 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller025Counter = -1;
     public boolean isWseFiller025Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller025Counter != sharedCounter;
         localWseFiller025Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_025_LEN = 5;
	/**
	 * 	serialize this WseFiller025
	 */
   protected void serializeWseFiller025(char[] wseFiller025) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller025,0,getStringValue(),beginWseFiller025,WSE_FILLER_025_LEN);
       localWseFiller025Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller025Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWseFiller025 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller025() {	 
   		return (substring(getStringValue(),beginWseFiller025,beginWseFiller025 + WSE_FILLER_025_LEN));
   	}




}
  
