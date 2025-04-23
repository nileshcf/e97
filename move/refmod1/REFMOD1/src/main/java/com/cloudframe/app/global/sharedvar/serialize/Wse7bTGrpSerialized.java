package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse7bTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse7bTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse7bTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_7B_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller05;
	
	/**
	* Constructor for Wse7bTGrpSerialized
	**/
    public Wse7bTGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse7bTGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse7bTGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse7bTGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse7bTGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse7bTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_7B_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller05 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller05Counter = -1;
     public boolean isWseFiller05Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller05Counter != sharedCounter;
         localWseFiller05Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_05_LEN = 5;
	/**
	 * 	serialize this WseFiller05
	 */
   protected void serializeWseFiller05(char[] wseFiller05) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller05,0,getStringValue(),beginWseFiller05,WSE_FILLER_05_LEN);
       localWseFiller05Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller05Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWseFiller05 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller05() {	 
   		return (substring(getStringValue(),beginWseFiller05,beginWseFiller05 + WSE_FILLER_05_LEN));
   	}




}
  
