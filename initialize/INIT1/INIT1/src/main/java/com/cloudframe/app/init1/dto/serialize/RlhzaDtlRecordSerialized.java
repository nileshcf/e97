package com.cloudframe.app.init1.dto.serialize;

/**
*  The class RlhzaDtlRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlhzaDtlRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlhzaDtlRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLHZA_DTL_RECORD_LENGTH = 1700;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlhzaFiller01;
	
	/**
	* Constructor for RlhzaDtlRecordSerialized
	**/
    public RlhzaDtlRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RlhzaDtlRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlhzaDtlRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RlhzaDtlRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RlhzaDtlRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RlhzaDtlRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLHZA_DTL_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlhzaFiller01 = getStartOffset() + 1586;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlhzaFiller01Counter = -1;
     public boolean isRlhzaFiller01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlhzaFiller01Counter != sharedCounter;
         localRlhzaFiller01Counter = sharedCounter; return hasModified;
     }
	protected static final int RLHZA_FILLER_01_LEN = 114;
	/**
	 * 	serialize this RlhzaFiller01
	 */
   protected void serializeRlhzaFiller01(char[] rlhzaFiller01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlhzaFiller01,0,getStringValue(),beginRlhzaFiller01,RLHZA_FILLER_01_LEN);
       localRlhzaFiller01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlhzaFiller01Constraints(char[] value) {
   			return super.checkConstraints(value , 114 ,false, false);
   }
    /**
	 *	refreshRlhzaFiller01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlhzaFiller01() {	 
   		return (substring(getStringValue(),beginRlhzaFiller01,beginRlhzaFiller01 + RLHZA_FILLER_01_LEN));
   	}




}
  
