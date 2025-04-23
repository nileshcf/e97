package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WvExtrDchM330XSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvExtrDchM330XSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvExtrDchM330XSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_EXTR_DCH_M_330_X_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvExtrDchM330;
	
	/**
	* Constructor for WvExtrDchM330XSerialized
	**/
    public WvExtrDchM330XSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvExtrDchM330XSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrDchM330XSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvExtrDchM330XSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,558); // serialize this field at offset 558 by default 
    }
    
	/**
	* sets parent for this WvExtrDchM330XSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 558 by default
    }    
	/**
	* initializes the field in WvExtrDchM330XSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_EXTR_DCH_M_330_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvExtrDchM330 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvExtrDchM330Counter = -1;
     public boolean isWvExtrDchM330Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrDchM330Counter != sharedCounter;
         localWvExtrDchM330Counter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_DCH_M_330_LEN = 12;
	/**
	 * 	serialize this WvExtrDchM330
	 */
   protected void serializeWvExtrDchM330(char[] wvExtrDchM330) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrDchM330,0,getStringValue(),beginWvExtrDchM330,WV_EXTR_DCH_M_330_LEN);
       localWvExtrDchM330Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrDchM330Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWvExtrDchM330 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrDchM330() {	 
   		return (substring(getStringValue(),beginWvExtrDchM330,beginWvExtrDchM330 + WV_EXTR_DCH_M_330_LEN));
   	}




}
  
