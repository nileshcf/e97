package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class Ar629ParmAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ar629ParmAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ar629ParmAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AR_629_PARM_AREA_LENGTH = 124;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAr629ProgramId;
	
	/**
	* Constructor for Ar629ParmAreaSerialized
	**/
    public Ar629ParmAreaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ar629ParmAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AR_629_PARM_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAr629ProgramId = getStartOffset() + 0;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localAr629ProgramIdCounter = -1;
     public boolean isAr629ProgramIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr629ProgramIdCounter != sharedCounter;
         localAr629ProgramIdCounter = sharedCounter; return hasModified;
     }
	protected static final int AR_629_PROGRAM_ID_LEN = 8;
	/**
	 * 	serialize this Ar629ProgramId
	 */
   protected void serializeAr629ProgramId(char[] ar629ProgramId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar629ProgramId,0,getStringValue(),beginAr629ProgramId,AR_629_PROGRAM_ID_LEN);
       localAr629ProgramIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr629ProgramIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshAr629ProgramId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr629ProgramId() {	 
   		return (substring(getStringValue(),beginAr629ProgramId,beginAr629ProgramId + AR_629_PROGRAM_ID_LEN));
   	}




}
  
