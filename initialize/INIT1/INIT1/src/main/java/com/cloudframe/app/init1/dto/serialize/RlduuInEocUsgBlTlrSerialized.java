package com.cloudframe.app.init1.dto.serialize;

/**
*  The class RlduuInEocUsgBlTlrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlduuInEocUsgBlTlrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlduuInEocUsgBlTlrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLDUU_IN_EOC_USG_BL_TLR_LENGTH = 1010;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlduuFiller;
	
	/**
	* Constructor for RlduuInEocUsgBlTlrSerialized
	**/
    public RlduuInEocUsgBlTlrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RlduuInEocUsgBlTlrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlduuInEocUsgBlTlrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RlduuInEocUsgBlTlrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RlduuInEocUsgBlTlrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RlduuInEocUsgBlTlrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLDUU_IN_EOC_USG_BL_TLR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlduuFiller = getStartOffset() + 39;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlduuFillerCounter = -1;
     public boolean isRlduuFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlduuFillerCounter != sharedCounter;
         localRlduuFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int RLDUU_FILLER_LEN = 971;
	/**
	 * 	serialize this RlduuFiller
	 */
   protected void serializeRlduuFiller(char[] rlduuFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlduuFiller,0,getStringValue(),beginRlduuFiller,RLDUU_FILLER_LEN);
       localRlduuFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlduuFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 971 ,false, false);
   }
    /**
	 *	refreshRlduuFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlduuFiller() {	 
   		return (substring(getStringValue(),beginRlduuFiller,beginRlduuFiller + RLDUU_FILLER_LEN));
   	}




}
  
