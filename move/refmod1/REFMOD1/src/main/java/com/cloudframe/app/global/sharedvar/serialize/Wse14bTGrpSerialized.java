package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse14bTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse14bTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse14bTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_14B_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller027;
	
	/**
	* Constructor for Wse14bTGrpSerialized
	**/
    public Wse14bTGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse14bTGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse14bTGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse14bTGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse14bTGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse14bTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_14B_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller027 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller027Counter = -1;
     public boolean isWseFiller027Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller027Counter != sharedCounter;
         localWseFiller027Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_027_LEN = 5;
	/**
	 * 	serialize this WseFiller027
	 */
   protected void serializeWseFiller027(char[] wseFiller027) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller027,0,getStringValue(),beginWseFiller027,WSE_FILLER_027_LEN);
       localWseFiller027Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller027Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWseFiller027 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller027() {	 
   		return (substring(getStringValue(),beginWseFiller027,beginWseFiller027 + WSE_FILLER_027_LEN));
   	}




}
  
