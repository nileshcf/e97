package com.cloudframe.app.ip989010.file.records.serialize;

/**
*  The class Sys003InRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys003InRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys003InRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_003_IN_REC_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys003Field;
            protected  int beginSys003FieldLen;
            protected  int beginSys003FieldVal;
	
	/**
	* Constructor for Sys003InRecSerialized
	**/
    public Sys003InRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys003InRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_003_IN_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys003Field = getStartOffset() + 0;	// set offset for serialization
  
             beginSys003FieldLen = getStartOffset() + 11;	// set offset for serialization
  
             beginSys003FieldVal = getStartOffset() + 15;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys003FieldCounter = -1;
     public boolean isSys003FieldModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys003FieldCounter != sharedCounter;
         localSys003FieldCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_003_FIELD_LEN = 10;
	/**
	 * 	serialize this Sys003Field
	 */
   protected void serializeSys003Field(char[] sys003Field) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys003Field,0,getStringValue(),beginSys003Field,SYS_003_FIELD_LEN);
       localSys003FieldCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys003FieldConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSys003Field is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys003Field() {	 
   		return (substring(getStringValue(),beginSys003Field,beginSys003Field + SYS_003_FIELD_LEN));
   	}
     int localSys003FieldLenCounter = -1;
     public boolean isSys003FieldLenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys003FieldLenCounter != sharedCounter;
         localSys003FieldLenCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_003_FIELD_LEN_LEN = 3;
	/**
	 * 	serialize this Sys003FieldLen
	 */
   protected void serializeSys003FieldLen(char[] sys003FieldLen) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys003FieldLen,0,getStringValue(),beginSys003FieldLen,SYS_003_FIELD_LEN_LEN);
       localSys003FieldLenCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys003FieldLenConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSys003FieldLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys003FieldLen() {	 
   		return (substring(getStringValue(),beginSys003FieldLen,beginSys003FieldLen + SYS_003_FIELD_LEN_LEN));
   	}
     int localSys003FieldValCounter = -1;
     public boolean isSys003FieldValModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys003FieldValCounter != sharedCounter;
         localSys003FieldValCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_003_FIELD_VAL_LEN = 65;
	/**
	 * 	serialize this Sys003FieldVal
	 */
   protected void serializeSys003FieldVal(char[] sys003FieldVal) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys003FieldVal,0,getStringValue(),beginSys003FieldVal,SYS_003_FIELD_VAL_LEN);
       localSys003FieldValCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys003FieldValConstraints(char[] value) {
   			return super.checkConstraints(value , 65 ,false, false);
   }
    /**
	 *	refreshSys003FieldVal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys003FieldVal() {	 
   		return (substring(getStringValue(),beginSys003FieldVal,beginSys003FieldVal + SYS_003_FIELD_VAL_LEN));
   	}




}
  
