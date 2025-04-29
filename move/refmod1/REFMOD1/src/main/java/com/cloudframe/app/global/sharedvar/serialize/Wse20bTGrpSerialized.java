package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse20bTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse20bTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse20bTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_20B_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller039;
	
	/**
	* Constructor for Wse20bTGrpSerialized
	**/
    public Wse20bTGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse20bTGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse20bTGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse20bTGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse20bTGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse20bTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_20B_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller039 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller039Counter = -1;
     public boolean isWseFiller039Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller039Counter != sharedCounter;
         localWseFiller039Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_039_LEN = 5;
	/**
	 * 	serialize this WseFiller039
	 */
   protected void serializeWseFiller039(char[] wseFiller039) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller039,0,getStringValue(),beginWseFiller039,WSE_FILLER_039_LEN);
       localWseFiller039Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller039Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWseFiller039 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller039() {	 
   		return (substring(getStringValue(),beginWseFiller039,beginWseFiller039 + WSE_FILLER_039_LEN));
   	}




}
  
