package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class RhDestination810Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RhDestination810Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RhDestination810Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RH_DESTINATION_810_LENGTH = 256;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRhDestLnth810;
            protected  int beginRhDestData810;
	
	/**
	* Constructor for RhDestination810Serialized
	**/
    public RhDestination810Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RhDestination810Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RH_DESTINATION_810_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRhDestLnth810 = getStartOffset() + 0;	// set offset for serialization
  
             beginRhDestData810 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRhDestLnth810Counter = -1;
     public boolean isRhDestLnth810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRhDestLnth810Counter != sharedCounter;
         localRhDestLnth810Counter = sharedCounter; return hasModified;
     }
	protected static final int RH_DEST_LNTH_810_LEN = 1;
	/**
	 * 	serialize this RhDestLnth810
	 */
   protected void serializeRhDestLnth810(char[] rhDestLnth810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rhDestLnth810,0,getStringValue(),beginRhDestLnth810,RH_DEST_LNTH_810_LEN);
       localRhDestLnth810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRhDestLnth810Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRhDestLnth810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRhDestLnth810() {	 
   		return (substring(getStringValue(),beginRhDestLnth810,beginRhDestLnth810 + RH_DEST_LNTH_810_LEN));
   	}
     int localRhDestData810Counter = -1;
     public boolean isRhDestData810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRhDestData810Counter != sharedCounter;
         localRhDestData810Counter = sharedCounter; return hasModified;
     }
	protected static final int RH_DEST_DATA_810_LEN = 255;
	/**
	 * 	serialize this RhDestData810
	 */
   protected void serializeRhDestData810(char[] rhDestData810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rhDestData810,0,getStringValue(),beginRhDestData810,RH_DEST_DATA_810_LEN);
       localRhDestData810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRhDestData810Constraints(char[] value) {
   			return super.checkConstraints(value , 255 ,false, false);
   }
    /**
	 *	refreshRhDestData810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRhDestData810() {	 
   		return (substring(getStringValue(),beginRhDestData810,beginRhDestData810 + RH_DEST_DATA_810_LEN));
   	}




}
  
