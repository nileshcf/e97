package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse13bTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse13bTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse13bTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_13B_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller023;
	
	/**
	* Constructor for Wse13bTGrpSerialized
	**/
    public Wse13bTGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse13bTGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse13bTGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse13bTGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse13bTGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse13bTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_13B_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller023 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller023Counter = -1;
     public boolean isWseFiller023Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller023Counter != sharedCounter;
         localWseFiller023Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_023_LEN = 5;
	/**
	 * 	serialize this WseFiller023
	 */
   protected void serializeWseFiller023(char[] wseFiller023) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller023,0,getStringValue(),beginWseFiller023,WSE_FILLER_023_LEN);
       localWseFiller023Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller023Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWseFiller023 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller023() {	 
   		return (substring(getStringValue(),beginWseFiller023,beginWseFiller023 + WSE_FILLER_023_LEN));
   	}




}
  
