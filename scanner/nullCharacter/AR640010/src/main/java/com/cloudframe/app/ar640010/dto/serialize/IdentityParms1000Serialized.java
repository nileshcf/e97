package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class IdentityParms1000Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IdentityParms1000Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IdentityParms1000Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IDENTITY_PARMS_1000_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginProgramId1000;
	
	/**
	* Constructor for IdentityParms1000Serialized
	**/
    public IdentityParms1000Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IdentityParms1000Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IDENTITY_PARMS_1000_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginProgramId1000 = getStartOffset() + 0;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localProgramId1000Counter = -1;
     public boolean isProgramId1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProgramId1000Counter != sharedCounter;
         localProgramId1000Counter = sharedCounter; return hasModified;
     }
	protected static final int PROGRAM_ID_1000_LEN = 8;
	/**
	 * 	serialize this ProgramId1000
	 */
   protected void serializeProgramId1000(char[] programId1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(programId1000,0,getStringValue(),beginProgramId1000,PROGRAM_ID_1000_LEN);
       localProgramId1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProgramId1000Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshProgramId1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProgramId1000() {	 
   		return (substring(getStringValue(),beginProgramId1000,beginProgramId1000 + PROGRAM_ID_1000_LEN));
   	}




}
  
