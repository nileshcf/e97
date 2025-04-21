package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class WarningTableGroup580Array1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WarningTableGroup580Array1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WarningTableGroup580Array1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WARNING_TABLE_GROUP_580_ARRAY_1_LENGTH = 54;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWarningId580;
            protected  int beginWarningText580;
	
	/**
	* Constructor for WarningTableGroup580Array1Serialized
	**/
    public WarningTableGroup580Array1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WarningTableGroup580Array1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WarningTableGroup580Array1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WarningTableGroup580Array1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WarningTableGroup580Array1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WarningTableGroup580Array1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WARNING_TABLE_GROUP_580_ARRAY_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWarningId580 = getStartOffset() + 0;	// set offset for serialization
  
             beginWarningText580 = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWarningId580Counter = -1;
     public boolean isWarningId580Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWarningId580Counter != sharedCounter;
         localWarningId580Counter = sharedCounter; return hasModified;
     }
	protected static final int WARNING_ID_580_LEN = 4;
	/**
	 * 	serialize this WarningId580
	 */
   protected void serializeWarningId580(char[] warningId580) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(warningId580,0,getStringValue(),beginWarningId580,WARNING_ID_580_LEN);
       localWarningId580Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWarningId580Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshWarningId580 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWarningId580() {	 
   		return (substring(getStringValue(),beginWarningId580,beginWarningId580 + WARNING_ID_580_LEN));
   	}
     int localWarningText580Counter = -1;
     public boolean isWarningText580Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWarningText580Counter != sharedCounter;
         localWarningText580Counter = sharedCounter; return hasModified;
     }
	protected static final int WARNING_TEXT_580_LEN = 50;
	/**
	 * 	serialize this WarningText580
	 */
   protected void serializeWarningText580(char[] warningText580) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(warningText580,0,getStringValue(),beginWarningText580,WARNING_TEXT_580_LEN);
       localWarningText580Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWarningText580Constraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshWarningText580 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWarningText580() {	 
   		return (substring(getStringValue(),beginWarningText580,beginWarningText580 + WARNING_TEXT_580_LEN));
   	}




}
  
