package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Sf31IsoTransDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf31IsoTransDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf31IsoTransDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_31_ISO_TRANS_DATE_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf31IsoTransMmdd;
	
	/**
	* Constructor for Sf31IsoTransDateSerialized
	**/
    public Sf31IsoTransDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf31IsoTransDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf31IsoTransDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf31IsoTransDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,325); // serialize this field at offset 325 by default 
    }
    
	/**
	* sets parent for this Sf31IsoTransDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 325 by default
    }    
	/**
	* initializes the field in Sf31IsoTransDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_31_ISO_TRANS_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf31IsoTransMmdd = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf31IsoTransMmddCounter = -1;
     public boolean isSf31IsoTransMmddModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoTransMmddCounter != sharedCounter;
         localSf31IsoTransMmddCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_TRANS_MMDD_LEN = 4;
	/**
	 * 	serialize this Sf31IsoTransMmdd
	 */
   protected void serializeSf31IsoTransMmdd(char[] sf31IsoTransMmdd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoTransMmdd,0,getStringValue(),beginSf31IsoTransMmdd,SF_31_ISO_TRANS_MMDD_LEN);
       localSf31IsoTransMmddCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoTransMmddConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSf31IsoTransMmdd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoTransMmdd() {	 
   		return (substring(getStringValue(),beginSf31IsoTransMmdd,beginSf31IsoTransMmdd + SF_31_ISO_TRANS_MMDD_LEN));
   	}




}
  
