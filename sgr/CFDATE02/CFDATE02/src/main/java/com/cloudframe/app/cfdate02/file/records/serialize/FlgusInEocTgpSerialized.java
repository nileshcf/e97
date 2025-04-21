package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class FlgusInEocTgpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FlgusInEocTgpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FlgusInEocTgpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FLGUS_IN_EOC_TGP_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFlgusTgpRec;
	
	/**
	* Constructor for FlgusInEocTgpSerialized
	**/
    public FlgusInEocTgpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FlgusInEocTgpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FlgusInEocTgpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FlgusInEocTgpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this FlgusInEocTgpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in FlgusInEocTgpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FLGUS_IN_EOC_TGP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFlgusTgpRec = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFlgusTgpRecCounter = -1;
     public boolean isFlgusTgpRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFlgusTgpRecCounter != sharedCounter;
         localFlgusTgpRecCounter = sharedCounter; return hasModified;
     }
	protected static final int FLGUS_TGP_REC_LEN = 161;
	/**
	 * 	serialize this FlgusTgpRec
	 */
   protected void serializeFlgusTgpRec(char[] flgusTgpRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(flgusTgpRec,0,getStringValue(),beginFlgusTgpRec,FLGUS_TGP_REC_LEN);
       localFlgusTgpRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFlgusTgpRecConstraints(char[] value) {
   			return super.checkConstraints(value , 161 ,false, false);
   }
    /**
	 *	refreshFlgusTgpRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFlgusTgpRec() {	 
   		return (substring(getStringValue(),beginFlgusTgpRec,beginFlgusTgpRec + FLGUS_TGP_REC_LEN));
   	}




}
  
