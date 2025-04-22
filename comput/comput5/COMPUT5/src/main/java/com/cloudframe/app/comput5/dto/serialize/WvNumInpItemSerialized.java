package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class WvNumInpItemSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvNumInpItemSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvNumInpItemSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_NUM_INP_ITEM_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvNumInp;
	
	/**
	* Constructor for WvNumInpItemSerialized
	**/
    public WvNumInpItemSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvNumInpItemSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvNumInpItemSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvNumInpItemSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WvNumInpItemSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WvNumInpItemSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_NUM_INP_ITEM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvNumInp = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvNumInpCounter = -1;
     public boolean isWvNumInpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvNumInpCounter != sharedCounter;
         localWvNumInpCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_NUM_INP_LEN = 1;
	/**
	 * 	serialize this WvNumInp
	 */
   protected void serializeWvNumInp(char[] wvNumInp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvNumInp,0,getStringValue(),beginWvNumInp,WV_NUM_INP_LEN);
       localWvNumInpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvNumInpConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWvNumInp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvNumInp() {	 
   		return (substring(getStringValue(),beginWvNumInp,beginWvNumInp + WV_NUM_INP_LEN));
   	}




}
  
