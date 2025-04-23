package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WvExtrDchUsgXSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvExtrDchUsgXSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvExtrDchUsgXSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_EXTR_DCH_USG_X_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvExtrDchUsg;
	
	/**
	* Constructor for WvExtrDchUsgXSerialized
	**/
    public WvExtrDchUsgXSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvExtrDchUsgXSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrDchUsgXSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvExtrDchUsgXSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,519); // serialize this field at offset 519 by default 
    }
    
	/**
	* sets parent for this WvExtrDchUsgXSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 519 by default
    }    
	/**
	* initializes the field in WvExtrDchUsgXSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_EXTR_DCH_USG_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvExtrDchUsg = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvExtrDchUsgCounter = -1;
     public boolean isWvExtrDchUsgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrDchUsgCounter != sharedCounter;
         localWvExtrDchUsgCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_DCH_USG_LEN = 12;
	/**
	 * 	serialize this WvExtrDchUsg
	 */
   protected void serializeWvExtrDchUsg(char[] wvExtrDchUsg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrDchUsg,0,getStringValue(),beginWvExtrDchUsg,WV_EXTR_DCH_USG_LEN);
       localWvExtrDchUsgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrDchUsgConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWvExtrDchUsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrDchUsg() {	 
   		return (substring(getStringValue(),beginWvExtrDchUsg,beginWvExtrDchUsg + WV_EXTR_DCH_USG_LEN));
   	}




}
  
