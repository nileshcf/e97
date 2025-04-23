package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WvExtrDchM3AmbXSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvExtrDchM3AmbXSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvExtrDchM3AmbXSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_EXTR_DCH_M_3_AMB_X_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvExtrDchM3Amb;
	
	/**
	* Constructor for WvExtrDchM3AmbXSerialized
	**/
    public WvExtrDchM3AmbXSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvExtrDchM3AmbXSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrDchM3AmbXSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvExtrDchM3AmbXSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,571); // serialize this field at offset 571 by default 
    }
    
	/**
	* sets parent for this WvExtrDchM3AmbXSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 571 by default
    }    
	/**
	* initializes the field in WvExtrDchM3AmbXSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_EXTR_DCH_M_3_AMB_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvExtrDchM3Amb = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvExtrDchM3AmbCounter = -1;
     public boolean isWvExtrDchM3AmbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrDchM3AmbCounter != sharedCounter;
         localWvExtrDchM3AmbCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_DCH_M_3_AMB_LEN = 12;
	/**
	 * 	serialize this WvExtrDchM3Amb
	 */
   protected void serializeWvExtrDchM3Amb(char[] wvExtrDchM3Amb) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrDchM3Amb,0,getStringValue(),beginWvExtrDchM3Amb,WV_EXTR_DCH_M_3_AMB_LEN);
       localWvExtrDchM3AmbCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrDchM3AmbConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWvExtrDchM3Amb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrDchM3Amb() {	 
   		return (substring(getStringValue(),beginWvExtrDchM3Amb,beginWvExtrDchM3Amb + WV_EXTR_DCH_M_3_AMB_LEN));
   	}




}
  
