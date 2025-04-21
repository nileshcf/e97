package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WvExtrQuantityXSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvExtrQuantityXSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvExtrQuantityXSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_EXTR_QUANTITY_X_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvExtrQuantity;
	
	/**
	* Constructor for WvExtrQuantityXSerialized
	**/
    public WvExtrQuantityXSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvExtrQuantityXSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrQuantityXSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvExtrQuantityXSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,142); // serialize this field at offset 142 by default 
    }
    
	/**
	* sets parent for this WvExtrQuantityXSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 142 by default
    }    
	/**
	* initializes the field in WvExtrQuantityXSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_EXTR_QUANTITY_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvExtrQuantity = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvExtrQuantityCounter = -1;
     public boolean isWvExtrQuantityModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrQuantityCounter != sharedCounter;
         localWvExtrQuantityCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_QUANTITY_LEN = 9;
	/**
	 * 	serialize this WvExtrQuantity
	 */
   protected void serializeWvExtrQuantity(char[] wvExtrQuantity) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrQuantity,0,getStringValue(),beginWvExtrQuantity,WV_EXTR_QUANTITY_LEN);
       localWvExtrQuantityCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrQuantityConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshWvExtrQuantity is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrQuantity() {	 
   		return (substring(getStringValue(),beginWvExtrQuantity,beginWvExtrQuantity + WV_EXTR_QUANTITY_LEN));
   	}




}
  
