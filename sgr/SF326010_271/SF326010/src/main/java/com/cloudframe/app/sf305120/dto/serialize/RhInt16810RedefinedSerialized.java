package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class RhInt16810RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RhInt16810RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RhInt16810RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RH_INT_16810_REDEFINED_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRhInt8810;
	
	/**
	* Constructor for RhInt16810RedefinedSerialized
	**/
    public RhInt16810RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RhInt16810RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RhInt16810RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RhInt16810RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RhInt16810RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RhInt16810RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RH_INT_16810_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRhInt8810 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRhInt8810Counter = -1;
     public boolean isRhInt8810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRhInt8810Counter != sharedCounter;
         localRhInt8810Counter = sharedCounter; return hasModified;
     }
	protected static final int RH_INT_8810_LEN = 1;
	/**
	 * 	serialize this RhInt8810
	 */
   protected void serializeRhInt8810(char[] rhInt8810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rhInt8810,0,getStringValue(),beginRhInt8810,RH_INT_8810_LEN);
       localRhInt8810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRhInt8810Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRhInt8810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRhInt8810() {	 
   		return (substring(getStringValue(),beginRhInt8810,beginRhInt8810 + RH_INT_8810_LEN));
   	}




}
  
