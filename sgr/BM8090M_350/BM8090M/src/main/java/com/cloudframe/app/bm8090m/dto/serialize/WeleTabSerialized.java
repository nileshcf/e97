package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WeleTabSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WeleTabSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WeleTabSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WELE_TAB_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWelem;
	
	/**
	* Constructor for WeleTabSerialized
	**/
    public WeleTabSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WeleTabSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WeleTabSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WeleTabSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WeleTabSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WeleTabSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WELE_TAB_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWelem = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWelemCounter = -1;
     public boolean isWelemModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWelemCounter != sharedCounter;
         localWelemCounter = sharedCounter; return hasModified;
     }
	protected static final int WELEM_LEN = 1;
	/**
	 * 	serialize this Welem
	 */
   protected void serializeWelem(char[] welem) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(welem,0,getStringValue(),beginWelem,WELEM_LEN);
       localWelemCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWelemConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWelem is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWelem() {	 
   		return (substring(getStringValue(),beginWelem,beginWelem + WELEM_LEN));
   	}




}
  
