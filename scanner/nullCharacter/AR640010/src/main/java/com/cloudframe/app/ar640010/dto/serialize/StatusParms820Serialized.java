package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class StatusParms820Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class StatusParms820Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(StatusParms820Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int STATUS_PARMS_820_LENGTH = 83;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSetupValue820;
            protected  int beginOldStatCdInd820;
            protected  int beginNewStatCdInd820;
            protected  int beginStsMessage820;
	
	/**
	* Constructor for StatusParms820Serialized
	**/
    public StatusParms820Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in StatusParms820Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(STATUS_PARMS_820_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSetupValue820 = getStartOffset() + 0;	// set offset for serialization
  
             beginOldStatCdInd820 = getStartOffset() + 1;	// set offset for serialization
  
             beginNewStatCdInd820 = getStartOffset() + 2;	// set offset for serialization
  
             beginStsMessage820 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSetupValue820Counter = -1;
     public boolean isSetupValue820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSetupValue820Counter != sharedCounter;
         localSetupValue820Counter = sharedCounter; return hasModified;
     }
	protected static final int SETUP_VALUE_820_LEN = 1;
	/**
	 * 	serialize this SetupValue820
	 */
   protected void serializeSetupValue820(char[] setupValue820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(setupValue820,0,getStringValue(),beginSetupValue820,SETUP_VALUE_820_LEN);
       localSetupValue820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSetupValue820Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSetupValue820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSetupValue820() {	 
   		return (substring(getStringValue(),beginSetupValue820,beginSetupValue820 + SETUP_VALUE_820_LEN));
   	}
     int localOldStatCdInd820Counter = -1;
     public boolean isOldStatCdInd820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOldStatCdInd820Counter != sharedCounter;
         localOldStatCdInd820Counter = sharedCounter; return hasModified;
     }
	protected static final int OLD_STAT_CD_IND_820_LEN = 1;
	/**
	 * 	serialize this OldStatCdInd820
	 */
   protected void serializeOldStatCdInd820(char[] oldStatCdInd820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(oldStatCdInd820,0,getStringValue(),beginOldStatCdInd820,OLD_STAT_CD_IND_820_LEN);
       localOldStatCdInd820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOldStatCdInd820Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshOldStatCdInd820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOldStatCdInd820() {	 
   		return (substring(getStringValue(),beginOldStatCdInd820,beginOldStatCdInd820 + OLD_STAT_CD_IND_820_LEN));
   	}
     int localNewStatCdInd820Counter = -1;
     public boolean isNewStatCdInd820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNewStatCdInd820Counter != sharedCounter;
         localNewStatCdInd820Counter = sharedCounter; return hasModified;
     }
	protected static final int NEW_STAT_CD_IND_820_LEN = 1;
	/**
	 * 	serialize this NewStatCdInd820
	 */
   protected void serializeNewStatCdInd820(char[] newStatCdInd820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(newStatCdInd820,0,getStringValue(),beginNewStatCdInd820,NEW_STAT_CD_IND_820_LEN);
       localNewStatCdInd820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNewStatCdInd820Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshNewStatCdInd820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNewStatCdInd820() {	 
   		return (substring(getStringValue(),beginNewStatCdInd820,beginNewStatCdInd820 + NEW_STAT_CD_IND_820_LEN));
   	}
     int localStsMessage820Counter = -1;
     public boolean isStsMessage820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsMessage820Counter != sharedCounter;
         localStsMessage820Counter = sharedCounter; return hasModified;
     }
	protected static final int STS_MESSAGE_820_LEN = 80;
	/**
	 * 	serialize this StsMessage820
	 */
   protected void serializeStsMessage820(char[] stsMessage820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stsMessage820,0,getStringValue(),beginStsMessage820,STS_MESSAGE_820_LEN);
       localStsMessage820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStsMessage820Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshStsMessage820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStsMessage820() {	 
   		return (substring(getStringValue(),beginStsMessage820,beginStsMessage820 + STS_MESSAGE_820_LEN));
   	}




}
  
