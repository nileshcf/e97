package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class Ar629MsgTextGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ar629MsgTextGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ar629MsgTextGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AR_629_MSG_TEXT_GROUP_LENGTH = 115;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAr629MsgText;
	
	/**
	* Constructor for Ar629MsgTextGroupSerialized
	**/
    public Ar629MsgTextGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ar629MsgTextGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ar629MsgTextGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ar629MsgTextGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,9); // serialize this field at offset 9 by default 
    }
    
	/**
	* sets parent for this Ar629MsgTextGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 9 by default
    }    
	/**
	* initializes the field in Ar629MsgTextGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AR_629_MSG_TEXT_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAr629MsgText = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAr629MsgTextCounter = -1;
     public boolean isAr629MsgTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr629MsgTextCounter != sharedCounter;
         localAr629MsgTextCounter = sharedCounter; return hasModified;
     }
	protected static final int AR_629_MSG_TEXT_LEN = 115;
	/**
	 * 	serialize this Ar629MsgText
	 */
   protected void serializeAr629MsgText(char[] ar629MsgText) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar629MsgText,0,getStringValue(),beginAr629MsgText,AR_629_MSG_TEXT_LEN);
       localAr629MsgTextCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr629MsgTextConstraints(char[] value) {
   			return super.checkConstraints(value , 115 ,false, false);
   }
    /**
	 *	refreshAr629MsgText is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr629MsgText() {	 
   		return (substring(getStringValue(),beginAr629MsgText,beginAr629MsgText + AR_629_MSG_TEXT_LEN));
   	}




}
  
