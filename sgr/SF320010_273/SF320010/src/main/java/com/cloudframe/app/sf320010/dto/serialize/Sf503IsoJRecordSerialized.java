package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503IsoJRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503IsoJRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503IsoJRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_ISO_JRECORD_LENGTH = 32737;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf503IsoJData;
	
	/**
	* Constructor for Sf503IsoJRecordSerialized
	**/
    public Sf503IsoJRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503IsoJRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503IsoJRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503IsoJRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,15); // serialize this field at offset 15 by default 
    }
    
	/**
	* sets parent for this Sf503IsoJRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 15 by default
    }    
	/**
	* initializes the field in Sf503IsoJRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_ISO_JRECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf503IsoJData = getStartOffset() + 60;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localSf503IsoJDataCounter = -1;
     public boolean isSf503IsoJDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503IsoJDataCounter != sharedCounter;
         localSf503IsoJDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_ISO_JDATA_LEN = 32677;
	/**
	 * 	serialize this Sf503IsoJData
	 */
   protected void serializeSf503IsoJData(char[] sf503IsoJData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503IsoJData,0,getStringValue(),beginSf503IsoJData,SF_503_ISO_JDATA_LEN);
       localSf503IsoJDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503IsoJDataConstraints(char[] value) {
   			return super.checkConstraints(value , 32677 ,false, false);
   }
    /**
	 *	refreshSf503IsoJData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503IsoJData() {	 
   		return (substring(getStringValue(),beginSf503IsoJData,beginSf503IsoJData + SF_503_ISO_JDATA_LEN));
   	}




}
  
