package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse12bTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse12bTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse12bTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_12B_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller019;
	
	/**
	* Constructor for Wse12bTGrpSerialized
	**/
    public Wse12bTGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse12bTGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse12bTGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse12bTGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse12bTGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse12bTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_12B_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller019 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller019Counter = -1;
     public boolean isWseFiller019Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller019Counter != sharedCounter;
         localWseFiller019Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_019_LEN = 5;
	/**
	 * 	serialize this WseFiller019
	 */
   protected void serializeWseFiller019(char[] wseFiller019) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller019,0,getStringValue(),beginWseFiller019,WSE_FILLER_019_LEN);
       localWseFiller019Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller019Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWseFiller019 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller019() {	 
   		return (substring(getStringValue(),beginWseFiller019,beginWseFiller019 + WSE_FILLER_019_LEN));
   	}




}
  
