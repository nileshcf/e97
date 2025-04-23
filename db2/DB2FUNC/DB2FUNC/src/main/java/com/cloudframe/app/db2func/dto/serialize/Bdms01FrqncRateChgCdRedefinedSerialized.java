package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01FrqncRateChgCdRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01FrqncRateChgCdRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01FrqncRateChgCdRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_FRQNC_RATE_CHG_CD_REDEFINED_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdFloatingRateInd;
	
	/**
	* Constructor for Bdms01FrqncRateChgCdRedefinedSerialized
	**/
    public Bdms01FrqncRateChgCdRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01FrqncRateChgCdRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01FrqncRateChgCdRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01FrqncRateChgCdRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2606); // serialize this field at offset 2606 by default 
    }
    
	/**
	* sets parent for this Bdms01FrqncRateChgCdRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2606 by default
    }    
	/**
	* initializes the field in Bdms01FrqncRateChgCdRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_FRQNC_RATE_CHG_CD_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdFloatingRateInd = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdFloatingRateIndCounter = -1;
     public boolean isMsdFloatingRateIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdFloatingRateIndCounter != sharedCounter;
         localMsdFloatingRateIndCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_FLOATING_RATE_IND_LEN = 1;
	/**
	 * 	serialize this MsdFloatingRateInd
	 */
   protected void serializeMsdFloatingRateInd(char[] msdFloatingRateInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdFloatingRateInd,0,getStringValue(),beginMsdFloatingRateInd,MSD_FLOATING_RATE_IND_LEN);
       localMsdFloatingRateIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdFloatingRateIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdFloatingRateInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdFloatingRateInd() {	 
   		return (substring(getStringValue(),beginMsdFloatingRateInd,beginMsdFloatingRateInd + MSD_FLOATING_RATE_IND_LEN));
   	}




}
  
