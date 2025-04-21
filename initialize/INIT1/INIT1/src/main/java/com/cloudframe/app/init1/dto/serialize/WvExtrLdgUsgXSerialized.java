package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WvExtrLdgUsgXSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvExtrLdgUsgXSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvExtrLdgUsgXSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_EXTR_LDG_USG_X_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvExtrLdgUsg;
	
	/**
	* Constructor for WvExtrLdgUsgXSerialized
	**/
    public WvExtrLdgUsgXSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvExtrLdgUsgXSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrLdgUsgXSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvExtrLdgUsgXSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,454); // serialize this field at offset 454 by default 
    }
    
	/**
	* sets parent for this WvExtrLdgUsgXSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 454 by default
    }    
	/**
	* initializes the field in WvExtrLdgUsgXSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_EXTR_LDG_USG_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvExtrLdgUsg = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvExtrLdgUsgCounter = -1;
     public boolean isWvExtrLdgUsgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrLdgUsgCounter != sharedCounter;
         localWvExtrLdgUsgCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_LDG_USG_LEN = 12;
	/**
	 * 	serialize this WvExtrLdgUsg
	 */
   protected void serializeWvExtrLdgUsg(char[] wvExtrLdgUsg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrLdgUsg,0,getStringValue(),beginWvExtrLdgUsg,WV_EXTR_LDG_USG_LEN);
       localWvExtrLdgUsgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrLdgUsgConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWvExtrLdgUsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrLdgUsg() {	 
   		return (substring(getStringValue(),beginWvExtrLdgUsg,beginWvExtrLdgUsg + WV_EXTR_LDG_USG_LEN));
   	}




}
  
