package com.cloudframe.app.init1.dto.serialize;

/**
*  The class FlguuInEocUsgBlTlrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FlguuInEocUsgBlTlrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FlguuInEocUsgBlTlrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FLGUU_IN_EOC_USG_BL_TLR_LENGTH = 1010;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFlguuFiller;
	
	/**
	* Constructor for FlguuInEocUsgBlTlrSerialized
	**/
    public FlguuInEocUsgBlTlrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FlguuInEocUsgBlTlrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FlguuInEocUsgBlTlrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FlguuInEocUsgBlTlrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this FlguuInEocUsgBlTlrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in FlguuInEocUsgBlTlrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FLGUU_IN_EOC_USG_BL_TLR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFlguuFiller = getStartOffset() + 39;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFlguuFillerCounter = -1;
     public boolean isFlguuFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFlguuFillerCounter != sharedCounter;
         localFlguuFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int FLGUU_FILLER_LEN = 971;
	/**
	 * 	serialize this FlguuFiller
	 */
   protected void serializeFlguuFiller(char[] flguuFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(flguuFiller,0,getStringValue(),beginFlguuFiller,FLGUU_FILLER_LEN);
       localFlguuFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFlguuFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 971 ,false, false);
   }
    /**
	 *	refreshFlguuFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFlguuFiller() {	 
   		return (substring(getStringValue(),beginFlguuFiller,beginFlguuFiller + FLGUU_FILLER_LEN));
   	}




}
  
