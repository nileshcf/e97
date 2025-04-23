package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ExExternalSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:09. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ExExternalSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ExExternalSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EX_EXTERNAL_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginExProgramName;
            protected  int beginExJobName;
	
	/**
	* Constructor for ExExternalSerialized
	**/
    public ExExternalSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ExExternalSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EX_EXTERNAL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginExProgramName = getStartOffset() + 0;	// set offset for serialization
  
             beginExJobName = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localExProgramNameCounter = -1;
     public boolean isExProgramNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExProgramNameCounter != sharedCounter;
         localExProgramNameCounter = sharedCounter; return hasModified;
     }
	protected static final int EX_PROGRAM_NAME_LEN = 8;
	/**
	 * 	serialize this ExProgramName
	 */
   protected void serializeExProgramName(char[] exProgramName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(exProgramName,0,getStringValue(),beginExProgramName,EX_PROGRAM_NAME_LEN);
       localExProgramNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExProgramNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshExProgramName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExProgramName() {	 
   		return (substring(getStringValue(),beginExProgramName,beginExProgramName + EX_PROGRAM_NAME_LEN));
   	}
     int localExJobNameCounter = -1;
     public boolean isExJobNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExJobNameCounter != sharedCounter;
         localExJobNameCounter = sharedCounter; return hasModified;
     }
	protected static final int EX_JOB_NAME_LEN = 8;
	/**
	 * 	serialize this ExJobName
	 */
   protected void serializeExJobName(char[] exJobName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(exJobName,0,getStringValue(),beginExJobName,EX_JOB_NAME_LEN);
       localExJobNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExJobNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshExJobName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExJobName() {	 
   		return (substring(getStringValue(),beginExJobName,beginExJobName + EX_JOB_NAME_LEN));
   	}




}
  
