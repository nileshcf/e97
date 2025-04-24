package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class WoExposureDetailsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:41. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WoExposureDetailsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WoExposureDetailsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WO_EXPOSURE_DETAILS_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWoExposure;
            protected  int beginWoExposureS;
	
	/**
	* Constructor for WoExposureDetailsSerialized
	**/
    public WoExposureDetailsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WoExposureDetailsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WoExposureDetailsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WoExposureDetailsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WoExposureDetailsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WoExposureDetailsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WO_EXPOSURE_DETAILS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWoExposure = getStartOffset() + 1;	// set offset for serialization
  
             beginWoExposureS = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWoExposureCounter = -1;
     public boolean isWoExposureModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWoExposureCounter != sharedCounter;
         localWoExposureCounter = sharedCounter; return hasModified;
     }
	protected static final int WO_EXPOSURE_LEN = 9;
	/**
	 * 	serialize this WoExposure
	 */
   protected void serializeWoExposure(char[] woExposure) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(woExposure,0,getStringValue(),beginWoExposure,WO_EXPOSURE_LEN);
       localWoExposureCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWoExposureConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshWoExposure is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWoExposure() {	 
   		return (substring(getStringValue(),beginWoExposure,beginWoExposure + WO_EXPOSURE_LEN));
   	}
     int localWoExposureSCounter = -1;
     public boolean isWoExposureSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWoExposureSCounter != sharedCounter;
         localWoExposureSCounter = sharedCounter; return hasModified;
     }
	protected static final int WO_EXPOSURE_S_LEN = 9;
	/**
	 * 	serialize this WoExposureS
	 */
   protected void serializeWoExposureS(char[] woExposureS) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(woExposureS,0,getStringValue(),beginWoExposureS,WO_EXPOSURE_S_LEN);
       localWoExposureSCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWoExposureSConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshWoExposureS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWoExposureS() {	 
   		return (substring(getStringValue(),beginWoExposureS,beginWoExposureS + WO_EXPOSURE_S_LEN));
   	}




}
  
