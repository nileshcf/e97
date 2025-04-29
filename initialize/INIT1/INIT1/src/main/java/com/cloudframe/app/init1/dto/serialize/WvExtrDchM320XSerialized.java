package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WvExtrDchM320XSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvExtrDchM320XSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvExtrDchM320XSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_EXTR_DCH_M_320_X_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvExtrDchM320;
	
	/**
	* Constructor for WvExtrDchM320XSerialized
	**/
    public WvExtrDchM320XSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvExtrDchM320XSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrDchM320XSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvExtrDchM320XSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,545); // serialize this field at offset 545 by default 
    }
    
	/**
	* sets parent for this WvExtrDchM320XSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 545 by default
    }    
	/**
	* initializes the field in WvExtrDchM320XSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_EXTR_DCH_M_320_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvExtrDchM320 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvExtrDchM320Counter = -1;
     public boolean isWvExtrDchM320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrDchM320Counter != sharedCounter;
         localWvExtrDchM320Counter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_DCH_M_320_LEN = 12;
	/**
	 * 	serialize this WvExtrDchM320
	 */
   protected void serializeWvExtrDchM320(char[] wvExtrDchM320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrDchM320,0,getStringValue(),beginWvExtrDchM320,WV_EXTR_DCH_M_320_LEN);
       localWvExtrDchM320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrDchM320Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWvExtrDchM320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrDchM320() {	 
   		return (substring(getStringValue(),beginWvExtrDchM320,beginWvExtrDchM320 + WV_EXTR_DCH_M_320_LEN));
   	}




}
  
