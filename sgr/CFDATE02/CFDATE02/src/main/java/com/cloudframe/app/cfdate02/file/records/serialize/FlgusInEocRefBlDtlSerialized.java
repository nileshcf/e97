package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class FlgusInEocRefBlDtlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FlgusInEocRefBlDtlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FlgusInEocRefBlDtlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FLGUS_IN_EOC_REF_BL_DTL_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFlgusCpduRec;
	
	/**
	* Constructor for FlgusInEocRefBlDtlSerialized
	**/
    public FlgusInEocRefBlDtlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FlgusInEocRefBlDtlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FlgusInEocRefBlDtlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FlgusInEocRefBlDtlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this FlgusInEocRefBlDtlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in FlgusInEocRefBlDtlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FLGUS_IN_EOC_REF_BL_DTL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFlgusCpduRec = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFlgusCpduRecCounter = -1;
     public boolean isFlgusCpduRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFlgusCpduRecCounter != sharedCounter;
         localFlgusCpduRecCounter = sharedCounter; return hasModified;
     }
	protected static final int FLGUS_CPDU_REC_LEN = 161;
	/**
	 * 	serialize this FlgusCpduRec
	 */
   protected void serializeFlgusCpduRec(char[] flgusCpduRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(flgusCpduRec,0,getStringValue(),beginFlgusCpduRec,FLGUS_CPDU_REC_LEN);
       localFlgusCpduRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFlgusCpduRecConstraints(char[] value) {
   			return super.checkConstraints(value , 161 ,false, false);
   }
    /**
	 *	refreshFlgusCpduRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFlgusCpduRec() {	 
   		return (substring(getStringValue(),beginFlgusCpduRec,beginFlgusCpduRec + FLGUS_CPDU_REC_LEN));
   	}




}
  
