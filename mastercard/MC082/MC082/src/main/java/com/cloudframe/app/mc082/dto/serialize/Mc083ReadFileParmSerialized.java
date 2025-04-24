package com.cloudframe.app.mc082.dto.serialize;

/**
*  The class Mc083ReadFileParmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Mc083ReadFileParmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Mc083ReadFileParmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MC_083_READ_FILE_PARM_LENGTH = 82;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMc083FileStatus;
            protected  int beginMc083Data;
	
	/**
	* Constructor for Mc083ReadFileParmSerialized
	**/
    public Mc083ReadFileParmSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Mc083ReadFileParmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MC_083_READ_FILE_PARM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMc083FileStatus = getStartOffset() + 0;	// set offset for serialization
  
             beginMc083Data = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMc083FileStatusCounter = -1;
     public boolean isMc083FileStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMc083FileStatusCounter != sharedCounter;
         localMc083FileStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int MC_083_FILE_STATUS_LEN = 2;
	/**
	 * 	serialize this Mc083FileStatus
	 */
   protected void serializeMc083FileStatus(char[] mc083FileStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mc083FileStatus,0,getStringValue(),beginMc083FileStatus,MC_083_FILE_STATUS_LEN);
       localMc083FileStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMc083FileStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMc083FileStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMc083FileStatus() {	 
   		return (substring(getStringValue(),beginMc083FileStatus,beginMc083FileStatus + MC_083_FILE_STATUS_LEN));
   	}
     int localMc083DataCounter = -1;
     public boolean isMc083DataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMc083DataCounter != sharedCounter;
         localMc083DataCounter = sharedCounter; return hasModified;
     }
	protected static final int MC_083_DATA_LEN = 80;
	/**
	 * 	serialize this Mc083Data
	 */
   protected void serializeMc083Data(char[] mc083Data) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mc083Data,0,getStringValue(),beginMc083Data,MC_083_DATA_LEN);
       localMc083DataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMc083DataConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshMc083Data is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMc083Data() {	 
   		return (substring(getStringValue(),beginMc083Data,beginMc083Data + MC_083_DATA_LEN));
   	}




}
  
