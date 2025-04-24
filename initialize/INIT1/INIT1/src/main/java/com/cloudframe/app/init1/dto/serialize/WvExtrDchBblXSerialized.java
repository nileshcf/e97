package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WvExtrDchBblXSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvExtrDchBblXSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvExtrDchBblXSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_EXTR_DCH_BBL_X_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvExtrDchBbl;
	
	/**
	* Constructor for WvExtrDchBblXSerialized
	**/
    public WvExtrDchBblXSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvExtrDchBblXSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrDchBblXSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvExtrDchBblXSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,184); // serialize this field at offset 184 by default 
    }
    
	/**
	* sets parent for this WvExtrDchBblXSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 184 by default
    }    
	/**
	* initializes the field in WvExtrDchBblXSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_EXTR_DCH_BBL_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvExtrDchBbl = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvExtrDchBblCounter = -1;
     public boolean isWvExtrDchBblModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrDchBblCounter != sharedCounter;
         localWvExtrDchBblCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_DCH_BBL_LEN = 13;
	/**
	 * 	serialize this WvExtrDchBbl
	 */
   protected void serializeWvExtrDchBbl(char[] wvExtrDchBbl) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrDchBbl,0,getStringValue(),beginWvExtrDchBbl,WV_EXTR_DCH_BBL_LEN);
       localWvExtrDchBblCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrDchBblConstraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshWvExtrDchBbl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrDchBbl() {	 
   		return (substring(getStringValue(),beginWvExtrDchBbl,beginWvExtrDchBbl + WV_EXTR_DCH_BBL_LEN));
   	}




}
  
