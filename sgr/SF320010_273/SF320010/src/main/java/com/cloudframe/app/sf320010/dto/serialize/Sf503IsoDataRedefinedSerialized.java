package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503IsoDataRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503IsoDataRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503IsoDataRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_ISO_DATA_REDEFINED_LENGTH = 32691;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf503J3Data;
	
	/**
	* Constructor for Sf503IsoDataRedefinedSerialized
	**/
    public Sf503IsoDataRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503IsoDataRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503IsoDataRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503IsoDataRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,61); // serialize this field at offset 61 by default 
    }
    
	/**
	* sets parent for this Sf503IsoDataRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 61 by default
    }    
	/**
	* initializes the field in Sf503IsoDataRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_ISO_DATA_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf503J3Data = getStartOffset() + 27;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf503J3DataCounter = -1;
     public boolean isSf503J3DataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503J3DataCounter != sharedCounter;
         localSf503J3DataCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_J_3_DATA_LEN = 32664;
	/**
	 * 	serialize this Sf503J3Data
	 */
   protected void serializeSf503J3Data(char[] sf503J3Data) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503J3Data,0,getStringValue(),beginSf503J3Data,SF_503_J_3_DATA_LEN);
       localSf503J3DataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503J3DataConstraints(char[] value) {
   			return super.checkConstraints(value , 32664 ,false, false);
   }
    /**
	 *	refreshSf503J3Data is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503J3Data() {	 
   		return (substring(getStringValue(),beginSf503J3Data,beginSf503J3Data + SF_503_J_3_DATA_LEN));
   	}




}
  
