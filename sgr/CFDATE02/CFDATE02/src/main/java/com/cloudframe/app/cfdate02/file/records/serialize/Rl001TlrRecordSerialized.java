package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class Rl001TlrRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:43. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rl001TlrRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rl001TlrRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RL_001_TLR_RECORD_LENGTH = 700;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRl001CustomerTrailerRec;
	
	/**
	* Constructor for Rl001TlrRecordSerialized
	**/
    public Rl001TlrRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rl001TlrRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rl001TlrRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rl001TlrRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Rl001TlrRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Rl001TlrRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RL_001_TLR_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRl001CustomerTrailerRec = getStartOffset() + 19;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRl001CustomerTrailerRecCounter = -1;
     public boolean isRl001CustomerTrailerRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRl001CustomerTrailerRecCounter != sharedCounter;
         localRl001CustomerTrailerRecCounter = sharedCounter; return hasModified;
     }
	protected static final int RL_001_CUSTOMER_TRAILER_REC_LEN = 681;
	/**
	 * 	serialize this Rl001CustomerTrailerRec
	 */
   protected void serializeRl001CustomerTrailerRec(char[] rl001CustomerTrailerRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rl001CustomerTrailerRec,0,getStringValue(),beginRl001CustomerTrailerRec,RL_001_CUSTOMER_TRAILER_REC_LEN);
       localRl001CustomerTrailerRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRl001CustomerTrailerRecConstraints(char[] value) {
   			return super.checkConstraints(value , 681 ,false, false);
   }
    /**
	 *	refreshRl001CustomerTrailerRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRl001CustomerTrailerRec() {	 
   		return (substring(getStringValue(),beginRl001CustomerTrailerRec,beginRl001CustomerTrailerRec + RL_001_CUSTOMER_TRAILER_REC_LEN));
   	}




}
  
