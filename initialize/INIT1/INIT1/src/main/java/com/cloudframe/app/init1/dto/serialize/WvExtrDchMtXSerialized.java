package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WvExtrDchMtXSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvExtrDchMtXSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvExtrDchMtXSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_EXTR_DCH_MT_X_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvExtrDchMt;
	
	/**
	* Constructor for WvExtrDchMtXSerialized
	**/
    public WvExtrDchMtXSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvExtrDchMtXSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrDchMtXSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvExtrDchMtXSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,198); // serialize this field at offset 198 by default 
    }
    
	/**
	* sets parent for this WvExtrDchMtXSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 198 by default
    }    
	/**
	* initializes the field in WvExtrDchMtXSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_EXTR_DCH_MT_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvExtrDchMt = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvExtrDchMtCounter = -1;
     public boolean isWvExtrDchMtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrDchMtCounter != sharedCounter;
         localWvExtrDchMtCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_DCH_MT_LEN = 13;
	/**
	 * 	serialize this WvExtrDchMt
	 */
   protected void serializeWvExtrDchMt(char[] wvExtrDchMt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrDchMt,0,getStringValue(),beginWvExtrDchMt,WV_EXTR_DCH_MT_LEN);
       localWvExtrDchMtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrDchMtConstraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshWvExtrDchMt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrDchMt() {	 
   		return (substring(getStringValue(),beginWvExtrDchMt,beginWvExtrDchMt + WV_EXTR_DCH_MT_LEN));
   	}




}
  
