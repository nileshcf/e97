package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class CurrDescBatSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurrDescBatSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurrDescBatSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CURR_DESC_BAT_LENGTH = 98;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSwchCerDescription;
	
	/**
	* Constructor for CurrDescBatSerialized
	**/
    public CurrDescBatSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CurrDescBatSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrDescBatSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CurrDescBatSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,108); // serialize this field at offset 108 by default 
    }
    
	/**
	* sets parent for this CurrDescBatSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 108 by default
    }    
	/**
	* initializes the field in CurrDescBatSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CURR_DESC_BAT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSwchCerDescription = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSwchCerDescriptionCounter = -1;
     public boolean isSwchCerDescriptionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSwchCerDescriptionCounter != sharedCounter;
         localSwchCerDescriptionCounter = sharedCounter; return hasModified;
     }
	protected static final int SWCH_CER_DESCRIPTION_LEN = 30;
	/**
	 * 	serialize this SwchCerDescription
	 */
   protected void serializeSwchCerDescription(char[] swchCerDescription) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(swchCerDescription,0,getStringValue(),beginSwchCerDescription,SWCH_CER_DESCRIPTION_LEN);
       localSwchCerDescriptionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSwchCerDescriptionConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSwchCerDescription is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSwchCerDescription() {	 
   		return (substring(getStringValue(),beginSwchCerDescription,beginSwchCerDescription + SWCH_CER_DESCRIPTION_LEN));
   	}




}
  
