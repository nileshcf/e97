package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class McinfoParmsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class McinfoParmsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(McinfoParmsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCINFO_PARMS_LENGTH = 66;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMcinfoCopybookDate;
            protected  int beginMcinfoDdName;
            protected  int beginMcinfoJobName;
            protected  int beginMcinfoProcStep;
            protected  int beginMcinfoStepName;
            protected  int beginMcinfoJobNumber;
            protected  int beginMcinfoUserId;
            protected  int beginMcinfoCpuId;
	
	/**
	* Constructor for McinfoParmsSerialized
	**/
    public McinfoParmsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in McinfoParmsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCINFO_PARMS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMcinfoCopybookDate = getStartOffset() + 0;	// set offset for serialization
  
             beginMcinfoDdName = getStartOffset() + 10;	// set offset for serialization
  
             beginMcinfoJobName = getStartOffset() + 18;	// set offset for serialization
  
             beginMcinfoProcStep = getStartOffset() + 26;	// set offset for serialization
  
             beginMcinfoStepName = getStartOffset() + 34;	// set offset for serialization
  
             beginMcinfoJobNumber = getStartOffset() + 42;	// set offset for serialization
  
             beginMcinfoUserId = getStartOffset() + 50;	// set offset for serialization
  
             beginMcinfoCpuId = getStartOffset() + 58;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMcinfoCopybookDateCounter = -1;
     public boolean isMcinfoCopybookDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcinfoCopybookDateCounter != sharedCounter;
         localMcinfoCopybookDateCounter = sharedCounter; return hasModified;
     }
	protected static final int MCINFO_COPYBOOK_DATE_LEN = 10;
	/**
	 * 	serialize this McinfoCopybookDate
	 */
   protected void serializeMcinfoCopybookDate(char[] mcinfoCopybookDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mcinfoCopybookDate,0,getStringValue(),beginMcinfoCopybookDate,MCINFO_COPYBOOK_DATE_LEN);
       localMcinfoCopybookDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMcinfoCopybookDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshMcinfoCopybookDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMcinfoCopybookDate() {	 
   		return (substring(getStringValue(),beginMcinfoCopybookDate,beginMcinfoCopybookDate + MCINFO_COPYBOOK_DATE_LEN));
   	}
     int localMcinfoDdNameCounter = -1;
     public boolean isMcinfoDdNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcinfoDdNameCounter != sharedCounter;
         localMcinfoDdNameCounter = sharedCounter; return hasModified;
     }
	protected static final int MCINFO_DD_NAME_LEN = 8;
	/**
	 * 	serialize this McinfoDdName
	 */
   protected void serializeMcinfoDdName(char[] mcinfoDdName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mcinfoDdName,0,getStringValue(),beginMcinfoDdName,MCINFO_DD_NAME_LEN);
       localMcinfoDdNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMcinfoDdNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMcinfoDdName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMcinfoDdName() {	 
   		return (substring(getStringValue(),beginMcinfoDdName,beginMcinfoDdName + MCINFO_DD_NAME_LEN));
   	}
     int localMcinfoJobNameCounter = -1;
     public boolean isMcinfoJobNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcinfoJobNameCounter != sharedCounter;
         localMcinfoJobNameCounter = sharedCounter; return hasModified;
     }
	protected static final int MCINFO_JOB_NAME_LEN = 8;
	/**
	 * 	serialize this McinfoJobName
	 */
   protected void serializeMcinfoJobName(char[] mcinfoJobName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mcinfoJobName,0,getStringValue(),beginMcinfoJobName,MCINFO_JOB_NAME_LEN);
       localMcinfoJobNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMcinfoJobNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMcinfoJobName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMcinfoJobName() {	 
   		return (substring(getStringValue(),beginMcinfoJobName,beginMcinfoJobName + MCINFO_JOB_NAME_LEN));
   	}
     int localMcinfoProcStepCounter = -1;
     public boolean isMcinfoProcStepModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcinfoProcStepCounter != sharedCounter;
         localMcinfoProcStepCounter = sharedCounter; return hasModified;
     }
	protected static final int MCINFO_PROC_STEP_LEN = 8;
	/**
	 * 	serialize this McinfoProcStep
	 */
   protected void serializeMcinfoProcStep(char[] mcinfoProcStep) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mcinfoProcStep,0,getStringValue(),beginMcinfoProcStep,MCINFO_PROC_STEP_LEN);
       localMcinfoProcStepCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMcinfoProcStepConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMcinfoProcStep is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMcinfoProcStep() {	 
   		return (substring(getStringValue(),beginMcinfoProcStep,beginMcinfoProcStep + MCINFO_PROC_STEP_LEN));
   	}
     int localMcinfoStepNameCounter = -1;
     public boolean isMcinfoStepNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcinfoStepNameCounter != sharedCounter;
         localMcinfoStepNameCounter = sharedCounter; return hasModified;
     }
	protected static final int MCINFO_STEP_NAME_LEN = 8;
	/**
	 * 	serialize this McinfoStepName
	 */
   protected void serializeMcinfoStepName(char[] mcinfoStepName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mcinfoStepName,0,getStringValue(),beginMcinfoStepName,MCINFO_STEP_NAME_LEN);
       localMcinfoStepNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMcinfoStepNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMcinfoStepName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMcinfoStepName() {	 
   		return (substring(getStringValue(),beginMcinfoStepName,beginMcinfoStepName + MCINFO_STEP_NAME_LEN));
   	}
     int localMcinfoJobNumberCounter = -1;
     public boolean isMcinfoJobNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcinfoJobNumberCounter != sharedCounter;
         localMcinfoJobNumberCounter = sharedCounter; return hasModified;
     }
	protected static final int MCINFO_JOB_NUMBER_LEN = 8;
	/**
	 * 	serialize this McinfoJobNumber
	 */
   protected void serializeMcinfoJobNumber(char[] mcinfoJobNumber) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mcinfoJobNumber,0,getStringValue(),beginMcinfoJobNumber,MCINFO_JOB_NUMBER_LEN);
       localMcinfoJobNumberCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMcinfoJobNumberConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMcinfoJobNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMcinfoJobNumber() {	 
   		return (substring(getStringValue(),beginMcinfoJobNumber,beginMcinfoJobNumber + MCINFO_JOB_NUMBER_LEN));
   	}
     int localMcinfoUserIdCounter = -1;
     public boolean isMcinfoUserIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcinfoUserIdCounter != sharedCounter;
         localMcinfoUserIdCounter = sharedCounter; return hasModified;
     }
	protected static final int MCINFO_USER_ID_LEN = 8;
	/**
	 * 	serialize this McinfoUserId
	 */
   protected void serializeMcinfoUserId(char[] mcinfoUserId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mcinfoUserId,0,getStringValue(),beginMcinfoUserId,MCINFO_USER_ID_LEN);
       localMcinfoUserIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMcinfoUserIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMcinfoUserId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMcinfoUserId() {	 
   		return (substring(getStringValue(),beginMcinfoUserId,beginMcinfoUserId + MCINFO_USER_ID_LEN));
   	}
     int localMcinfoCpuIdCounter = -1;
     public boolean isMcinfoCpuIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcinfoCpuIdCounter != sharedCounter;
         localMcinfoCpuIdCounter = sharedCounter; return hasModified;
     }
	protected static final int MCINFO_CPU_ID_LEN = 8;
	/**
	 * 	serialize this McinfoCpuId
	 */
   protected void serializeMcinfoCpuId(char[] mcinfoCpuId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mcinfoCpuId,0,getStringValue(),beginMcinfoCpuId,MCINFO_CPU_ID_LEN);
       localMcinfoCpuIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMcinfoCpuIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMcinfoCpuId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMcinfoCpuId() {	 
   		return (substring(getStringValue(),beginMcinfoCpuId,beginMcinfoCpuId + MCINFO_CPU_ID_LEN));
   	}




}
  
