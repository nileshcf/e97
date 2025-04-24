package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class GeneralWorkAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:45. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class GeneralWorkAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(GeneralWorkAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GENERAL_WORK_AREA_LENGTH = 8192;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginGeneralWorkId;
            protected  int beginGeneralWorkDate;
            protected  int beginGeneralWorkTime;
            protected  int beginGeneralWorkClass;
            protected  int beginGeneralWorkRest;
	
	/**
	* Constructor for GeneralWorkAreaSerialized
	**/
    public GeneralWorkAreaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in GeneralWorkAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GENERAL_WORK_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginGeneralWorkId = getStartOffset() + 0;	// set offset for serialization
  
             beginGeneralWorkDate = getStartOffset() + 3;	// set offset for serialization
  
             beginGeneralWorkTime = getStartOffset() + 9;	// set offset for serialization
  
             beginGeneralWorkClass = getStartOffset() + 15;	// set offset for serialization
  
             beginGeneralWorkRest = getStartOffset() + 16;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localGeneralWorkIdCounter = -1;
     public boolean isGeneralWorkIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGeneralWorkIdCounter != sharedCounter;
         localGeneralWorkIdCounter = sharedCounter; return hasModified;
     }
	protected static final int GENERAL_WORK_ID_LEN = 3;
	/**
	 * 	serialize this GeneralWorkId
	 */
   protected void serializeGeneralWorkId(char[] generalWorkId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(generalWorkId,0,getStringValue(),beginGeneralWorkId,GENERAL_WORK_ID_LEN);
       localGeneralWorkIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGeneralWorkIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshGeneralWorkId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGeneralWorkId() {	 
   		return (substring(getStringValue(),beginGeneralWorkId,beginGeneralWorkId + GENERAL_WORK_ID_LEN));
   	}
     int localGeneralWorkDateCounter = -1;
     public boolean isGeneralWorkDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGeneralWorkDateCounter != sharedCounter;
         localGeneralWorkDateCounter = sharedCounter; return hasModified;
     }
	protected static final int GENERAL_WORK_DATE_LEN = 6;
	/**
	 * 	serialize this GeneralWorkDate
	 */
   protected void serializeGeneralWorkDate(char[] generalWorkDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(generalWorkDate,0,getStringValue(),beginGeneralWorkDate,GENERAL_WORK_DATE_LEN);
       localGeneralWorkDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGeneralWorkDateConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshGeneralWorkDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGeneralWorkDate() {	 
   		return (substring(getStringValue(),beginGeneralWorkDate,beginGeneralWorkDate + GENERAL_WORK_DATE_LEN));
   	}
     int localGeneralWorkTimeCounter = -1;
     public boolean isGeneralWorkTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGeneralWorkTimeCounter != sharedCounter;
         localGeneralWorkTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int GENERAL_WORK_TIME_LEN = 6;
	/**
	 * 	serialize this GeneralWorkTime
	 */
   protected void serializeGeneralWorkTime(char[] generalWorkTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(generalWorkTime,0,getStringValue(),beginGeneralWorkTime,GENERAL_WORK_TIME_LEN);
       localGeneralWorkTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGeneralWorkTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshGeneralWorkTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGeneralWorkTime() {	 
   		return (substring(getStringValue(),beginGeneralWorkTime,beginGeneralWorkTime + GENERAL_WORK_TIME_LEN));
   	}
     int localGeneralWorkClassCounter = -1;
     public boolean isGeneralWorkClassModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGeneralWorkClassCounter != sharedCounter;
         localGeneralWorkClassCounter = sharedCounter; return hasModified;
     }
	protected static final int GENERAL_WORK_CLASS_LEN = 1;
	/**
	 * 	serialize this GeneralWorkClass
	 */
   protected void serializeGeneralWorkClass(char[] generalWorkClass) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(generalWorkClass,0,getStringValue(),beginGeneralWorkClass,GENERAL_WORK_CLASS_LEN);
       localGeneralWorkClassCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGeneralWorkClassConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshGeneralWorkClass is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGeneralWorkClass() {	 
   		return (substring(getStringValue(),beginGeneralWorkClass,beginGeneralWorkClass + GENERAL_WORK_CLASS_LEN));
   	}
     int localGeneralWorkRestCounter = -1;
     public boolean isGeneralWorkRestModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGeneralWorkRestCounter != sharedCounter;
         localGeneralWorkRestCounter = sharedCounter; return hasModified;
     }
	protected static final int GENERAL_WORK_REST_LEN = 8176;
	/**
	 * 	serialize this GeneralWorkRest
	 */
   protected void serializeGeneralWorkRest(char[] generalWorkRest) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(generalWorkRest,0,getStringValue(),beginGeneralWorkRest,GENERAL_WORK_REST_LEN);
       localGeneralWorkRestCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGeneralWorkRestConstraints(char[] value) {
   			return super.checkConstraints(value , 8176 ,false, false);
   }
    /**
	 *	refreshGeneralWorkRest is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGeneralWorkRest() {	 
   		return (substring(getStringValue(),beginGeneralWorkRest,beginGeneralWorkRest + GENERAL_WORK_REST_LEN));
   	}




}
  
