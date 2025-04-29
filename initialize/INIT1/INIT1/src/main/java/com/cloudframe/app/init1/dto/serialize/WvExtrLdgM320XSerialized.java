package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WvExtrLdgM320XSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvExtrLdgM320XSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvExtrLdgM320XSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_EXTR_LDG_M_320_X_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvExtrLdgM320;
	
	/**
	* Constructor for WvExtrLdgM320XSerialized
	**/
    public WvExtrLdgM320XSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvExtrLdgM320XSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrLdgM320XSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvExtrLdgM320XSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,480); // serialize this field at offset 480 by default 
    }
    
	/**
	* sets parent for this WvExtrLdgM320XSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 480 by default
    }    
	/**
	* initializes the field in WvExtrLdgM320XSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_EXTR_LDG_M_320_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvExtrLdgM320 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvExtrLdgM320Counter = -1;
     public boolean isWvExtrLdgM320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrLdgM320Counter != sharedCounter;
         localWvExtrLdgM320Counter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_LDG_M_320_LEN = 12;
	/**
	 * 	serialize this WvExtrLdgM320
	 */
   protected void serializeWvExtrLdgM320(char[] wvExtrLdgM320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrLdgM320,0,getStringValue(),beginWvExtrLdgM320,WV_EXTR_LDG_M_320_LEN);
       localWvExtrLdgM320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrLdgM320Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWvExtrLdgM320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrLdgM320() {	 
   		return (substring(getStringValue(),beginWvExtrLdgM320,beginWvExtrLdgM320 + WV_EXTR_LDG_M_320_LEN));
   	}




}
  
