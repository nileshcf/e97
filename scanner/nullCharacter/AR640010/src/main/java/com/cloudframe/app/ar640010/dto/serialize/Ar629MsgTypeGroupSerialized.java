package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class Ar629MsgTypeGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ar629MsgTypeGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ar629MsgTypeGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AR_629_MSG_TYPE_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAr629MsgType;
	
	/**
	* Constructor for Ar629MsgTypeGroupSerialized
	**/
    public Ar629MsgTypeGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ar629MsgTypeGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ar629MsgTypeGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ar629MsgTypeGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8); // serialize this field at offset 8 by default 
    }
    
	/**
	* sets parent for this Ar629MsgTypeGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8 by default
    }    
	/**
	* initializes the field in Ar629MsgTypeGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AR_629_MSG_TYPE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAr629MsgType = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAr629MsgTypeCounter = -1;
     public boolean isAr629MsgTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr629MsgTypeCounter != sharedCounter;
         localAr629MsgTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int AR_629_MSG_TYPE_LEN = 1;
	/**
	 * 	serialize this Ar629MsgType
	 */
   protected void serializeAr629MsgType(char[] ar629MsgType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar629MsgType,0,getStringValue(),beginAr629MsgType,AR_629_MSG_TYPE_LEN);
       localAr629MsgTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr629MsgTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshAr629MsgType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr629MsgType() {	 
   		return (substring(getStringValue(),beginAr629MsgType,beginAr629MsgType + AR_629_MSG_TYPE_LEN));
   	}




}
  
