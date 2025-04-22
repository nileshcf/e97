package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WvExtrLdgM330XSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvExtrLdgM330XSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvExtrLdgM330XSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_EXTR_LDG_M_330_X_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvExtrLdgM330;
	
	/**
	* Constructor for WvExtrLdgM330XSerialized
	**/
    public WvExtrLdgM330XSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvExtrLdgM330XSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrLdgM330XSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvExtrLdgM330XSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,493); // serialize this field at offset 493 by default 
    }
    
	/**
	* sets parent for this WvExtrLdgM330XSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 493 by default
    }    
	/**
	* initializes the field in WvExtrLdgM330XSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_EXTR_LDG_M_330_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvExtrLdgM330 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvExtrLdgM330Counter = -1;
     public boolean isWvExtrLdgM330Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrLdgM330Counter != sharedCounter;
         localWvExtrLdgM330Counter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_LDG_M_330_LEN = 12;
	/**
	 * 	serialize this WvExtrLdgM330
	 */
   protected void serializeWvExtrLdgM330(char[] wvExtrLdgM330) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrLdgM330,0,getStringValue(),beginWvExtrLdgM330,WV_EXTR_LDG_M_330_LEN);
       localWvExtrLdgM330Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrLdgM330Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWvExtrLdgM330 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrLdgM330() {	 
   		return (substring(getStringValue(),beginWvExtrLdgM330,beginWvExtrLdgM330 + WV_EXTR_LDG_M_330_LEN));
   	}




}
  
