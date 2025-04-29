package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WvExtrLdgBblXSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvExtrLdgBblXSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvExtrLdgBblXSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_EXTR_LDG_BBL_X_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvExtrLdgBbl;
	
	/**
	* Constructor for WvExtrLdgBblXSerialized
	**/
    public WvExtrLdgBblXSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvExtrLdgBblXSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrLdgBblXSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvExtrLdgBblXSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,156); // serialize this field at offset 156 by default 
    }
    
	/**
	* sets parent for this WvExtrLdgBblXSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 156 by default
    }    
	/**
	* initializes the field in WvExtrLdgBblXSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_EXTR_LDG_BBL_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvExtrLdgBbl = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvExtrLdgBblCounter = -1;
     public boolean isWvExtrLdgBblModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrLdgBblCounter != sharedCounter;
         localWvExtrLdgBblCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_LDG_BBL_LEN = 13;
	/**
	 * 	serialize this WvExtrLdgBbl
	 */
   protected void serializeWvExtrLdgBbl(char[] wvExtrLdgBbl) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrLdgBbl,0,getStringValue(),beginWvExtrLdgBbl,WV_EXTR_LDG_BBL_LEN);
       localWvExtrLdgBblCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrLdgBblConstraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshWvExtrLdgBbl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrLdgBbl() {	 
   		return (substring(getStringValue(),beginWvExtrLdgBbl,beginWvExtrLdgBbl + WV_EXTR_LDG_BBL_LEN));
   	}




}
  
