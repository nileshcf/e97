package com.cloudframe.app.move0.dto.serialize;

/**
*  The class AidUserByteRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AidUserByteRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AidUserByteRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AID_USER_BYTE_REDEFINED_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAidAlphaApplNum;
	
	/**
	* Constructor for AidUserByteRedefinedSerialized
	**/
    public AidUserByteRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AidUserByteRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AidUserByteRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AidUserByteRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this AidUserByteRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in AidUserByteRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AID_USER_BYTE_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAidAlphaApplNum = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAidAlphaApplNumCounter = -1;
     public boolean isAidAlphaApplNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAidAlphaApplNumCounter != sharedCounter;
         localAidAlphaApplNumCounter = sharedCounter; return hasModified;
     }
	protected static final int AID_ALPHA_APPL_NUM_LEN = 1;
	/**
	 * 	serialize this AidAlphaApplNum
	 */
   protected void serializeAidAlphaApplNum(char[] aidAlphaApplNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aidAlphaApplNum,0,getStringValue(),beginAidAlphaApplNum,AID_ALPHA_APPL_NUM_LEN);
       localAidAlphaApplNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAidAlphaApplNumConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshAidAlphaApplNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAidAlphaApplNum() {	 
   		return (substring(getStringValue(),beginAidAlphaApplNum,beginAidAlphaApplNum + AID_ALPHA_APPL_NUM_LEN));
   	}




}
  
