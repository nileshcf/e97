package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WvExtrLdgM3AmbXSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvExtrLdgM3AmbXSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvExtrLdgM3AmbXSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_EXTR_LDG_M_3_AMB_X_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvExtrLdgM3Amb;
	
	/**
	* Constructor for WvExtrLdgM3AmbXSerialized
	**/
    public WvExtrLdgM3AmbXSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvExtrLdgM3AmbXSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrLdgM3AmbXSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvExtrLdgM3AmbXSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,506); // serialize this field at offset 506 by default 
    }
    
	/**
	* sets parent for this WvExtrLdgM3AmbXSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 506 by default
    }    
	/**
	* initializes the field in WvExtrLdgM3AmbXSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_EXTR_LDG_M_3_AMB_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvExtrLdgM3Amb = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvExtrLdgM3AmbCounter = -1;
     public boolean isWvExtrLdgM3AmbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrLdgM3AmbCounter != sharedCounter;
         localWvExtrLdgM3AmbCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_LDG_M_3_AMB_LEN = 12;
	/**
	 * 	serialize this WvExtrLdgM3Amb
	 */
   protected void serializeWvExtrLdgM3Amb(char[] wvExtrLdgM3Amb) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrLdgM3Amb,0,getStringValue(),beginWvExtrLdgM3Amb,WV_EXTR_LDG_M_3_AMB_LEN);
       localWvExtrLdgM3AmbCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrLdgM3AmbConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWvExtrLdgM3Amb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrLdgM3Amb() {	 
   		return (substring(getStringValue(),beginWvExtrLdgM3Amb,beginWvExtrLdgM3Amb + WV_EXTR_LDG_M_3_AMB_LEN));
   	}




}
  
