package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse17aTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse17aTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse17aTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_17A_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller032;
	
	/**
	* Constructor for Wse17aTGrpSerialized
	**/
    public Wse17aTGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse17aTGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse17aTGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse17aTGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse17aTGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse17aTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_17A_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller032 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller032Counter = -1;
     public boolean isWseFiller032Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller032Counter != sharedCounter;
         localWseFiller032Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_032_LEN = 5;
	/**
	 * 	serialize this WseFiller032
	 */
   protected void serializeWseFiller032(char[] wseFiller032) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller032,0,getStringValue(),beginWseFiller032,WSE_FILLER_032_LEN);
       localWseFiller032Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller032Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWseFiller032 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller032() {	 
   		return (substring(getStringValue(),beginWseFiller032,beginWseFiller032 + WSE_FILLER_032_LEN));
   	}




}
  
