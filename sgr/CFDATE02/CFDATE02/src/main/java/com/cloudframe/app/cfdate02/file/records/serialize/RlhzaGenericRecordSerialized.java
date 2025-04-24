package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RlhzaGenericRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:43. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlhzaGenericRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlhzaGenericRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLHZA_GENERIC_RECORD_LENGTH = 1700;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlhzaFiller;
	
	/**
	* Constructor for RlhzaGenericRecordSerialized
	**/
    public RlhzaGenericRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RlhzaGenericRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlhzaGenericRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RlhzaGenericRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RlhzaGenericRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RlhzaGenericRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLHZA_GENERIC_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlhzaFiller = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlhzaFillerCounter = -1;
     public boolean isRlhzaFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlhzaFillerCounter != sharedCounter;
         localRlhzaFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int RLHZA_FILLER_LEN = 1698;
	/**
	 * 	serialize this RlhzaFiller
	 */
   protected void serializeRlhzaFiller(char[] rlhzaFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlhzaFiller,0,getStringValue(),beginRlhzaFiller,RLHZA_FILLER_LEN);
       localRlhzaFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlhzaFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 1698 ,false, false);
   }
    /**
	 *	refreshRlhzaFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlhzaFiller() {	 
   		return (substring(getStringValue(),beginRlhzaFiller,beginRlhzaFiller + RLHZA_FILLER_LEN));
   	}




}
  
