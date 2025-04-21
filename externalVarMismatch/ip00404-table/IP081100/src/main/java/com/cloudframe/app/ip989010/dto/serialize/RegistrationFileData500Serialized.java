package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class RegistrationFileData500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RegistrationFileData500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RegistrationFileData500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REGISTRATION_FILE_DATA_500_LENGTH = 200;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPanAlias500;
	
	/**
	* Constructor for RegistrationFileData500Serialized
	**/
    public RegistrationFileData500Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RegistrationFileData500Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RegistrationFileData500Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RegistrationFileData500Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RegistrationFileData500Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RegistrationFileData500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REGISTRATION_FILE_DATA_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPanAlias500 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPanAlias500Counter = -1;
     public boolean isPanAlias500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPanAlias500Counter != sharedCounter;
         localPanAlias500Counter = sharedCounter; return hasModified;
     }
	protected static final int PAN_ALIAS_500_LEN = 36;
	/**
	 * 	serialize this PanAlias500
	 */
   protected void serializePanAlias500(char[] panAlias500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(panAlias500,0,getStringValue(),beginPanAlias500,PAN_ALIAS_500_LEN);
       localPanAlias500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPanAlias500Constraints(char[] value) {
   			return super.checkConstraints(value , 36 ,false, false);
   }
    /**
	 *	refreshPanAlias500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPanAlias500() {	 
   		return (substring(getStringValue(),beginPanAlias500,beginPanAlias500 + PAN_ALIAS_500_LEN));
   	}




}
  
