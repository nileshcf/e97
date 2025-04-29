package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503IsoJDataRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503IsoJDataRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503IsoJDataRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_ISO_JDATA_REDEFINED_LENGTH = 32677;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf503J3JData;
	
	/**
	* Constructor for Sf503IsoJDataRedefinedSerialized
	**/
    public Sf503IsoJDataRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503IsoJDataRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503IsoJDataRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503IsoJDataRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,75); // serialize this field at offset 75 by default 
    }
    
	/**
	* sets parent for this Sf503IsoJDataRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 75 by default
    }    
	/**
	* initializes the field in Sf503IsoJDataRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_ISO_JDATA_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf503J3JData = getStartOffset() + 27;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf503J3JDataCounter = -1;
     public boolean isSf503J3JDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503J3JDataCounter != sharedCounter;
         localSf503J3JDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_J_3_JDATA_LEN = 32650;
	/**
	 * 	serialize this Sf503J3JData
	 */
   protected void serializeSf503J3JData(char[] sf503J3JData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503J3JData,0,getStringValue(),beginSf503J3JData,SF_503_J_3_JDATA_LEN);
       localSf503J3JDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503J3JDataConstraints(char[] value) {
   			return super.checkConstraints(value , 32650 ,false, false);
   }
    /**
	 *	refreshSf503J3JData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503J3JData() {	 
   		return (substring(getStringValue(),beginSf503J3JData,beginSf503J3JData + SF_503_J_3_JDATA_LEN));
   	}




}
  
