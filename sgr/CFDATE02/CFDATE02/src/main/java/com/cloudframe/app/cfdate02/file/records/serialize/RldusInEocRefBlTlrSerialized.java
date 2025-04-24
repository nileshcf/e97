package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RldusInEocRefBlTlrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:43. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RldusInEocRefBlTlrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RldusInEocRefBlTlrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLDUS_IN_EOC_REF_BL_TLR_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRldusFiller;
	
	/**
	* Constructor for RldusInEocRefBlTlrSerialized
	**/
    public RldusInEocRefBlTlrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RldusInEocRefBlTlrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RldusInEocRefBlTlrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RldusInEocRefBlTlrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RldusInEocRefBlTlrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RldusInEocRefBlTlrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLDUS_IN_EOC_REF_BL_TLR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRldusFiller = getStartOffset() + 39;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRldusFillerCounter = -1;
     public boolean isRldusFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRldusFillerCounter != sharedCounter;
         localRldusFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int RLDUS_FILLER_LEN = 123;
	/**
	 * 	serialize this RldusFiller
	 */
   protected void serializeRldusFiller(char[] rldusFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rldusFiller,0,getStringValue(),beginRldusFiller,RLDUS_FILLER_LEN);
       localRldusFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRldusFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 123 ,false, false);
   }
    /**
	 *	refreshRldusFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRldusFiller() {	 
   		return (substring(getStringValue(),beginRldusFiller,beginRldusFiller + RLDUS_FILLER_LEN));
   	}




}
  
