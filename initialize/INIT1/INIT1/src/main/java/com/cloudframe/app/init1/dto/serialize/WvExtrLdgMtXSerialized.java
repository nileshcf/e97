package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WvExtrLdgMtXSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvExtrLdgMtXSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvExtrLdgMtXSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_EXTR_LDG_MT_X_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvExtrLdgMt;
	
	/**
	* Constructor for WvExtrLdgMtXSerialized
	**/
    public WvExtrLdgMtXSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvExtrLdgMtXSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrLdgMtXSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvExtrLdgMtXSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,170); // serialize this field at offset 170 by default 
    }
    
	/**
	* sets parent for this WvExtrLdgMtXSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 170 by default
    }    
	/**
	* initializes the field in WvExtrLdgMtXSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_EXTR_LDG_MT_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvExtrLdgMt = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvExtrLdgMtCounter = -1;
     public boolean isWvExtrLdgMtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrLdgMtCounter != sharedCounter;
         localWvExtrLdgMtCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_LDG_MT_LEN = 13;
	/**
	 * 	serialize this WvExtrLdgMt
	 */
   protected void serializeWvExtrLdgMt(char[] wvExtrLdgMt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrLdgMt,0,getStringValue(),beginWvExtrLdgMt,WV_EXTR_LDG_MT_LEN);
       localWvExtrLdgMtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrLdgMtConstraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshWvExtrLdgMt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrLdgMt() {	 
   		return (substring(getStringValue(),beginWvExtrLdgMt,beginWvExtrLdgMt + WV_EXTR_LDG_MT_LEN));
   	}




}
  
