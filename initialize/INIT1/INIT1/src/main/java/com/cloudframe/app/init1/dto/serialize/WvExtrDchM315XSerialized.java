package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WvExtrDchM315XSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvExtrDchM315XSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvExtrDchM315XSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_EXTR_DCH_M_315_X_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvExtrDchM315;
	
	/**
	* Constructor for WvExtrDchM315XSerialized
	**/
    public WvExtrDchM315XSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvExtrDchM315XSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrDchM315XSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvExtrDchM315XSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,532); // serialize this field at offset 532 by default 
    }
    
	/**
	* sets parent for this WvExtrDchM315XSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 532 by default
    }    
	/**
	* initializes the field in WvExtrDchM315XSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_EXTR_DCH_M_315_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvExtrDchM315 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvExtrDchM315Counter = -1;
     public boolean isWvExtrDchM315Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrDchM315Counter != sharedCounter;
         localWvExtrDchM315Counter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_DCH_M_315_LEN = 12;
	/**
	 * 	serialize this WvExtrDchM315
	 */
   protected void serializeWvExtrDchM315(char[] wvExtrDchM315) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrDchM315,0,getStringValue(),beginWvExtrDchM315,WV_EXTR_DCH_M_315_LEN);
       localWvExtrDchM315Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrDchM315Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWvExtrDchM315 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrDchM315() {	 
   		return (substring(getStringValue(),beginWvExtrDchM315,beginWvExtrDchM315 + WV_EXTR_DCH_M_315_LEN));
   	}




}
  
