package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503IsoRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503IsoRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503IsoRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_ISO_RECORD_LENGTH = 32737;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf503IsoData;
	
	/**
	* Constructor for Sf503IsoRecordSerialized
	**/
    public Sf503IsoRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503IsoRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503IsoRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503IsoRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,15); // serialize this field at offset 15 by default 
    }
    
	/**
	* sets parent for this Sf503IsoRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 15 by default
    }    
	/**
	* initializes the field in Sf503IsoRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_ISO_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf503IsoData = getStartOffset() + 46;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localSf503IsoDataCounter = -1;
     public boolean isSf503IsoDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503IsoDataCounter != sharedCounter;
         localSf503IsoDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_ISO_DATA_LEN = 32691;
	/**
	 * 	serialize this Sf503IsoData
	 */
   protected void serializeSf503IsoData(char[] sf503IsoData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503IsoData,0,getStringValue(),beginSf503IsoData,SF_503_ISO_DATA_LEN);
       localSf503IsoDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503IsoDataConstraints(char[] value) {
   			return super.checkConstraints(value , 32691 ,false, false);
   }
    /**
	 *	refreshSf503IsoData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503IsoData() {	 
   		return (substring(getStringValue(),beginSf503IsoData,beginSf503IsoData + SF_503_ISO_DATA_LEN));
   	}




}
  
