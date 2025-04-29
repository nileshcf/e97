package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class GeneralSortAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class GeneralSortAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(GeneralSortAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GENERAL_SORT_AREA_LENGTH = 8194;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginGeneralSortId;
            protected  int beginGeneralSortCc;
            protected  int beginGeneralSortDate;
            protected  int beginGeneralSortTime;
            protected  int beginGeneralSortClass;
            protected  int beginGeneralSortRest;
	
	/**
	* Constructor for GeneralSortAreaSerialized
	**/
    public GeneralSortAreaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in GeneralSortAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GENERAL_SORT_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginGeneralSortId = getStartOffset() + 0;	// set offset for serialization
  
             beginGeneralSortCc = getStartOffset() + 3;	// set offset for serialization
  
             beginGeneralSortDate = getStartOffset() + 5;	// set offset for serialization
  
             beginGeneralSortTime = getStartOffset() + 11;	// set offset for serialization
  
             beginGeneralSortClass = getStartOffset() + 17;	// set offset for serialization
  
             beginGeneralSortRest = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localGeneralSortIdCounter = -1;
     public boolean isGeneralSortIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGeneralSortIdCounter != sharedCounter;
         localGeneralSortIdCounter = sharedCounter; return hasModified;
     }
	protected static final int GENERAL_SORT_ID_LEN = 3;
	/**
	 * 	serialize this GeneralSortId
	 */
   protected void serializeGeneralSortId(char[] generalSortId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(generalSortId,0,getStringValue(),beginGeneralSortId,GENERAL_SORT_ID_LEN);
       localGeneralSortIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGeneralSortIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshGeneralSortId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGeneralSortId() {	 
   		return (substring(getStringValue(),beginGeneralSortId,beginGeneralSortId + GENERAL_SORT_ID_LEN));
   	}
     int localGeneralSortCcCounter = -1;
     public boolean isGeneralSortCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGeneralSortCcCounter != sharedCounter;
         localGeneralSortCcCounter = sharedCounter; return hasModified;
     }
	protected static final int GENERAL_SORT_CC_LEN = 2;
	/**
	 * 	serialize this GeneralSortCc
	 */
   protected void serializeGeneralSortCc(char[] generalSortCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(generalSortCc,0,getStringValue(),beginGeneralSortCc,GENERAL_SORT_CC_LEN);
       localGeneralSortCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGeneralSortCcConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshGeneralSortCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGeneralSortCc() {	 
   		return (substring(getStringValue(),beginGeneralSortCc,beginGeneralSortCc + GENERAL_SORT_CC_LEN));
   	}
     int localGeneralSortDateCounter = -1;
     public boolean isGeneralSortDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGeneralSortDateCounter != sharedCounter;
         localGeneralSortDateCounter = sharedCounter; return hasModified;
     }
	protected static final int GENERAL_SORT_DATE_LEN = 6;
	/**
	 * 	serialize this GeneralSortDate
	 */
   protected void serializeGeneralSortDate(char[] generalSortDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(generalSortDate,0,getStringValue(),beginGeneralSortDate,GENERAL_SORT_DATE_LEN);
       localGeneralSortDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGeneralSortDateConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshGeneralSortDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGeneralSortDate() {	 
   		return (substring(getStringValue(),beginGeneralSortDate,beginGeneralSortDate + GENERAL_SORT_DATE_LEN));
   	}
     int localGeneralSortTimeCounter = -1;
     public boolean isGeneralSortTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGeneralSortTimeCounter != sharedCounter;
         localGeneralSortTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int GENERAL_SORT_TIME_LEN = 6;
	/**
	 * 	serialize this GeneralSortTime
	 */
   protected void serializeGeneralSortTime(char[] generalSortTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(generalSortTime,0,getStringValue(),beginGeneralSortTime,GENERAL_SORT_TIME_LEN);
       localGeneralSortTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGeneralSortTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshGeneralSortTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGeneralSortTime() {	 
   		return (substring(getStringValue(),beginGeneralSortTime,beginGeneralSortTime + GENERAL_SORT_TIME_LEN));
   	}
     int localGeneralSortClassCounter = -1;
     public boolean isGeneralSortClassModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGeneralSortClassCounter != sharedCounter;
         localGeneralSortClassCounter = sharedCounter; return hasModified;
     }
	protected static final int GENERAL_SORT_CLASS_LEN = 1;
	/**
	 * 	serialize this GeneralSortClass
	 */
   protected void serializeGeneralSortClass(char[] generalSortClass) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(generalSortClass,0,getStringValue(),beginGeneralSortClass,GENERAL_SORT_CLASS_LEN);
       localGeneralSortClassCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGeneralSortClassConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshGeneralSortClass is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGeneralSortClass() {	 
   		return (substring(getStringValue(),beginGeneralSortClass,beginGeneralSortClass + GENERAL_SORT_CLASS_LEN));
   	}
     int localGeneralSortRestCounter = -1;
     public boolean isGeneralSortRestModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGeneralSortRestCounter != sharedCounter;
         localGeneralSortRestCounter = sharedCounter; return hasModified;
     }
	protected static final int GENERAL_SORT_REST_LEN = 8176;
	/**
	 * 	serialize this GeneralSortRest
	 */
   protected void serializeGeneralSortRest(char[] generalSortRest) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(generalSortRest,0,getStringValue(),beginGeneralSortRest,GENERAL_SORT_REST_LEN);
       localGeneralSortRestCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGeneralSortRestConstraints(char[] value) {
   			return super.checkConstraints(value , 8176 ,false, false);
   }
    /**
	 *	refreshGeneralSortRest is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGeneralSortRest() {	 
   		return (substring(getStringValue(),beginGeneralSortRest,beginGeneralSortRest + GENERAL_SORT_REST_LEN));
   	}




}
  
