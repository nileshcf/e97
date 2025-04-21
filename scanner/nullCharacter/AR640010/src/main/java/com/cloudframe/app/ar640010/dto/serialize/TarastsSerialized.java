package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TarastsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TarastsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TarastsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARASTS_LENGTH = 138;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTarastsStatRefId;
            protected  int beginTarastsStatRefDesc;
	
	/**
	* Constructor for TarastsSerialized
	**/
    public TarastsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TarastsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARASTS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTarastsStatRefId = getStartOffset() + 0;	// set offset for serialization
  
             beginTarastsStatRefDesc = getStartOffset() + 23;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTarastsStatRefIdCounter = -1;
     public boolean isTarastsStatRefIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarastsStatRefIdCounter != sharedCounter;
         localTarastsStatRefIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TARASTS_STAT_REF_ID_LEN = 4;
	/**
	 * 	serialize this TarastsStatRefId
	 */
   protected void serializeTarastsStatRefId(char[] tarastsStatRefId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarastsStatRefId,0,getStringValue(),beginTarastsStatRefId,TARASTS_STAT_REF_ID_LEN);
       localTarastsStatRefIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarastsStatRefIdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshTarastsStatRefId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarastsStatRefId() {	 
   		return (substring(getStringValue(),beginTarastsStatRefId,beginTarastsStatRefId + TARASTS_STAT_REF_ID_LEN));
   	}
     int localTarastsStatRefDescCounter = -1;
     public boolean isTarastsStatRefDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarastsStatRefDescCounter != sharedCounter;
         localTarastsStatRefDescCounter = sharedCounter; return hasModified;
     }
	protected static final int TARASTS_STAT_REF_DESC_LEN = 80;
	/**
	 * 	serialize this TarastsStatRefDesc
	 */
   protected void serializeTarastsStatRefDesc(char[] tarastsStatRefDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarastsStatRefDesc,0,getStringValue(),beginTarastsStatRefDesc,TARASTS_STAT_REF_DESC_LEN);
       localTarastsStatRefDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarastsStatRefDescConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshTarastsStatRefDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarastsStatRefDesc() {	 
   		return (substring(getStringValue(),beginTarastsStatRefDesc,beginTarastsStatRefDesc + TARASTS_STAT_REF_DESC_LEN));
   	}




}
  
