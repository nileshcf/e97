package com.cloudframe.app.callfd02.dto.serialize;

/**
*  The class ParmDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ParmDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ParmDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARM_DATA_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParmMarker;
	
	/**
	* Constructor for ParmDataSerialized
	**/
    public ParmDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ParmDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARM_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParmMarker = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localParmMarkerCounter = -1;
     public boolean isParmMarkerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmMarkerCounter != sharedCounter;
         localParmMarkerCounter = sharedCounter; return hasModified;
     }
	protected static final int PARM_MARKER_LEN = 8;
	/**
	 * 	serialize this ParmMarker
	 */
   protected void serializeParmMarker(char[] parmMarker) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parmMarker,0,getStringValue(),beginParmMarker,PARM_MARKER_LEN);
       localParmMarkerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParmMarkerConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshParmMarker is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParmMarker() {	 
   		return (substring(getStringValue(),beginParmMarker,beginParmMarker + PARM_MARKER_LEN));
   	}




}
  
