package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse19bTGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse19bTGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse19bTGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_19B_TGRP_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWseFiller037;
	
	/**
	* Constructor for Wse19bTGrpSerialized
	**/
    public Wse19bTGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse19bTGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse19bTGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse19bTGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse19bTGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse19bTGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_19B_TGRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWseFiller037 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWseFiller037Counter = -1;
     public boolean isWseFiller037Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWseFiller037Counter != sharedCounter;
         localWseFiller037Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_FILLER_037_LEN = 5;
	/**
	 * 	serialize this WseFiller037
	 */
   protected void serializeWseFiller037(char[] wseFiller037) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wseFiller037,0,getStringValue(),beginWseFiller037,WSE_FILLER_037_LEN);
       localWseFiller037Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWseFiller037Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWseFiller037 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWseFiller037() {	 
   		return (substring(getStringValue(),beginWseFiller037,beginWseFiller037 + WSE_FILLER_037_LEN));
   	}




}
  
