package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RldusInEocRefBlDtlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RldusInEocRefBlDtlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RldusInEocRefBlDtlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLDUS_IN_EOC_REF_BL_DTL_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRldusCpduRec;
	
	/**
	* Constructor for RldusInEocRefBlDtlSerialized
	**/
    public RldusInEocRefBlDtlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RldusInEocRefBlDtlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RldusInEocRefBlDtlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RldusInEocRefBlDtlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RldusInEocRefBlDtlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RldusInEocRefBlDtlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLDUS_IN_EOC_REF_BL_DTL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRldusCpduRec = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRldusCpduRecCounter = -1;
     public boolean isRldusCpduRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRldusCpduRecCounter != sharedCounter;
         localRldusCpduRecCounter = sharedCounter; return hasModified;
     }
	protected static final int RLDUS_CPDU_REC_LEN = 161;
	/**
	 * 	serialize this RldusCpduRec
	 */
   protected void serializeRldusCpduRec(char[] rldusCpduRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rldusCpduRec,0,getStringValue(),beginRldusCpduRec,RLDUS_CPDU_REC_LEN);
       localRldusCpduRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRldusCpduRecConstraints(char[] value) {
   			return super.checkConstraints(value , 161 ,false, false);
   }
    /**
	 *	refreshRldusCpduRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRldusCpduRec() {	 
   		return (substring(getStringValue(),beginRldusCpduRec,beginRldusCpduRec + RLDUS_CPDU_REC_LEN));
   	}




}
  
