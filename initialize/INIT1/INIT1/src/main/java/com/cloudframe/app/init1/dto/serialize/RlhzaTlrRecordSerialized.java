package com.cloudframe.app.init1.dto.serialize;

/**
*  The class RlhzaTlrRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlhzaTlrRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlhzaTlrRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLHZA_TLR_RECORD_LENGTH = 1700;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlhzaFiller03;
	
	/**
	* Constructor for RlhzaTlrRecordSerialized
	**/
    public RlhzaTlrRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RlhzaTlrRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlhzaTlrRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RlhzaTlrRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RlhzaTlrRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RlhzaTlrRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLHZA_TLR_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlhzaFiller03 = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlhzaFiller03Counter = -1;
     public boolean isRlhzaFiller03Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlhzaFiller03Counter != sharedCounter;
         localRlhzaFiller03Counter = sharedCounter; return hasModified;
     }
	protected static final int RLHZA_FILLER_03_LEN = 1689;
	/**
	 * 	serialize this RlhzaFiller03
	 */
   protected void serializeRlhzaFiller03(char[] rlhzaFiller03) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlhzaFiller03,0,getStringValue(),beginRlhzaFiller03,RLHZA_FILLER_03_LEN);
       localRlhzaFiller03Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlhzaFiller03Constraints(char[] value) {
   			return super.checkConstraints(value , 1689 ,false, false);
   }
    /**
	 *	refreshRlhzaFiller03 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlhzaFiller03() {	 
   		return (substring(getStringValue(),beginRlhzaFiller03,beginRlhzaFiller03 + RLHZA_FILLER_03_LEN));
   	}




}
  
