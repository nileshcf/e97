package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse11aTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse11aTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse11aTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_11A_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller016;
	
	/**
	* Constructor for Wse11aTGrpSerialized
	**/
    public Wse11aTGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse11aTGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse11aTGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse11aTGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse11aTGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse11aTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_11A_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller016 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller016Counter = -1;
     public boolean isWseFiller016Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller016Counter != sharedCounter;
         localWseFiller016Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_016_LEN = 5;
	/**
	 * 	serialize this WseFiller016
	 */
   protected void serializeWseFiller016(char[] wseFiller016) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller016,0,getStringValue(),beginWseFiller016,WSE_FILLER_016_LEN);
       localWseFiller016Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller016Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWseFiller016 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller016() {	 
   		return (substring(getStringValue(),beginWseFiller016,beginWseFiller016 + WSE_FILLER_016_LEN));
   	}




}
  
