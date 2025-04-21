package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WvExtrRefDensityXSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvExtrRefDensityXSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvExtrRefDensityXSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_EXTR_REF_DENSITY_X_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvExtrRefDensity;
	
	/**
	* Constructor for WvExtrRefDensityXSerialized
	**/
    public WvExtrRefDensityXSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvExtrRefDensityXSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrRefDensityXSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvExtrRefDensityXSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,377); // serialize this field at offset 377 by default 
    }
    
	/**
	* sets parent for this WvExtrRefDensityXSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 377 by default
    }    
	/**
	* initializes the field in WvExtrRefDensityXSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_EXTR_REF_DENSITY_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvExtrRefDensity = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWvExtrRefDensityCounter = -1;
     public boolean isWvExtrRefDensityModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrRefDensityCounter != sharedCounter;
         localWvExtrRefDensityCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_REF_DENSITY_LEN = 12;
	/**
	 * 	serialize this WvExtrRefDensity
	 */
   protected void serializeWvExtrRefDensity(char[] wvExtrRefDensity) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrRefDensity,0,getStringValue(),beginWvExtrRefDensity,WV_EXTR_REF_DENSITY_LEN);
       localWvExtrRefDensityCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrRefDensityConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWvExtrRefDensity is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrRefDensity() {	 
   		return (substring(getStringValue(),beginWvExtrRefDensity,beginWvExtrRefDensity + WV_EXTR_REF_DENSITY_LEN));
   	}




}
  
