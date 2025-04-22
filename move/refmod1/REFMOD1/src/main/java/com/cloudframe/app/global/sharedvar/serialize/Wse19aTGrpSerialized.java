package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse19aTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse19aTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse19aTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_19A_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller036;
	
	/**
	* Constructor for Wse19aTGrpSerialized
	**/
    public Wse19aTGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse19aTGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse19aTGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse19aTGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse19aTGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse19aTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_19A_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller036 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller036Counter = -1;
     public boolean isWseFiller036Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller036Counter != sharedCounter;
         localWseFiller036Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_036_LEN = 5;
	/**
	 * 	serialize this WseFiller036
	 */
   protected void serializeWseFiller036(char[] wseFiller036) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller036,0,getStringValue(),beginWseFiller036,WSE_FILLER_036_LEN);
       localWseFiller036Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller036Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWseFiller036 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller036() {	 
   		return (substring(getStringValue(),beginWseFiller036,beginWseFiller036 + WSE_FILLER_036_LEN));
   	}




}
  
