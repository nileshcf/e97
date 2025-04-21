package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WvExtrLdgM315XSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvExtrLdgM315XSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvExtrLdgM315XSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_EXTR_LDG_M_315_X_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvExtrLdgM315;
	
	/**
	* Constructor for WvExtrLdgM315XSerialized
	**/
    public WvExtrLdgM315XSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvExtrLdgM315XSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrLdgM315XSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvExtrLdgM315XSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,467); // serialize this field at offset 467 by default 
    }
    
	/**
	* sets parent for this WvExtrLdgM315XSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 467 by default
    }    
	/**
	* initializes the field in WvExtrLdgM315XSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_EXTR_LDG_M_315_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvExtrLdgM315 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvExtrLdgM315Counter = -1;
     public boolean isWvExtrLdgM315Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrLdgM315Counter != sharedCounter;
         localWvExtrLdgM315Counter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_LDG_M_315_LEN = 12;
	/**
	 * 	serialize this WvExtrLdgM315
	 */
   protected void serializeWvExtrLdgM315(char[] wvExtrLdgM315) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrLdgM315,0,getStringValue(),beginWvExtrLdgM315,WV_EXTR_LDG_M_315_LEN);
       localWvExtrLdgM315Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrLdgM315Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWvExtrLdgM315 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrLdgM315() {	 
   		return (substring(getStringValue(),beginWvExtrLdgM315,beginWvExtrLdgM315 + WV_EXTR_LDG_M_315_LEN));
   	}




}
  
