package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class Rl001HdrRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rl001HdrRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rl001HdrRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RL_001_HDR_RECORD_LENGTH = 700;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRl001CustomerHeaderRec;
	
	/**
	* Constructor for Rl001HdrRecordSerialized
	**/
    public Rl001HdrRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rl001HdrRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rl001HdrRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rl001HdrRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Rl001HdrRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Rl001HdrRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RL_001_HDR_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRl001CustomerHeaderRec = getStartOffset() + 19;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRl001CustomerHeaderRecCounter = -1;
     public boolean isRl001CustomerHeaderRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRl001CustomerHeaderRecCounter != sharedCounter;
         localRl001CustomerHeaderRecCounter = sharedCounter; return hasModified;
     }
	protected static final int RL_001_CUSTOMER_HEADER_REC_LEN = 681;
	/**
	 * 	serialize this Rl001CustomerHeaderRec
	 */
   protected void serializeRl001CustomerHeaderRec(char[] rl001CustomerHeaderRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rl001CustomerHeaderRec,0,getStringValue(),beginRl001CustomerHeaderRec,RL_001_CUSTOMER_HEADER_REC_LEN);
       localRl001CustomerHeaderRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRl001CustomerHeaderRecConstraints(char[] value) {
   			return super.checkConstraints(value , 681 ,false, false);
   }
    /**
	 *	refreshRl001CustomerHeaderRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRl001CustomerHeaderRec() {	 
   		return (substring(getStringValue(),beginRl001CustomerHeaderRec,beginRl001CustomerHeaderRec + RL_001_CUSTOMER_HEADER_REC_LEN));
   	}




}
  
