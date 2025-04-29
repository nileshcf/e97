package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse13aTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse13aTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse13aTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_13A_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller021;
	
	/**
	* Constructor for Wse13aTGrpSerialized
	**/
    public Wse13aTGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse13aTGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse13aTGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse13aTGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse13aTGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse13aTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_13A_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller021 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller021Counter = -1;
     public boolean isWseFiller021Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller021Counter != sharedCounter;
         localWseFiller021Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_021_LEN = 5;
	/**
	 * 	serialize this WseFiller021
	 */
   protected void serializeWseFiller021(char[] wseFiller021) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller021,0,getStringValue(),beginWseFiller021,WSE_FILLER_021_LEN);
       localWseFiller021Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller021Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWseFiller021 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller021() {	 
   		return (substring(getStringValue(),beginWseFiller021,beginWseFiller021 + WSE_FILLER_021_LEN));
   	}




}
  
