package com.cloudframe.app.sf326010.dto.serialize;

/**
*  The class Sys001MiplogTime801Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys001MiplogTime801Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys001MiplogTime801Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_001_MIPLOG_TIME_801_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys001MiplogTimeHh801;
            protected  int beginSys001MiplogTimeMm801;
            protected  int beginSys001MiplogTimeSs801;
	
	/**
	* Constructor for Sys001MiplogTime801Serialized
	**/
    public Sys001MiplogTime801Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sys001MiplogTime801Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys001MiplogTime801Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sys001MiplogTime801Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,26); // serialize this field at offset 26 by default 
    }
    
	/**
	* sets parent for this Sys001MiplogTime801Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 26 by default
    }    
	/**
	* initializes the field in Sys001MiplogTime801Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_001_MIPLOG_TIME_801_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys001MiplogTimeHh801 = getStartOffset() + 0;	// set offset for serialization
  
             beginSys001MiplogTimeMm801 = getStartOffset() + 1;	// set offset for serialization
  
             beginSys001MiplogTimeSs801 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys001MiplogTimeHh801Counter = -1;
     public boolean isSys001MiplogTimeHh801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001MiplogTimeHh801Counter != sharedCounter;
         localSys001MiplogTimeHh801Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_MIPLOG_TIME_HH_801_LEN = 1;
	/**
	 * 	serialize this Sys001MiplogTimeHh801
	 */
   protected void serializeSys001MiplogTimeHh801(char[] sys001MiplogTimeHh801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001MiplogTimeHh801,0,getStringValue(),beginSys001MiplogTimeHh801,SYS_001_MIPLOG_TIME_HH_801_LEN);
       localSys001MiplogTimeHh801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001MiplogTimeHh801Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSys001MiplogTimeHh801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001MiplogTimeHh801() {	 
   		return (substring(getStringValue(),beginSys001MiplogTimeHh801,beginSys001MiplogTimeHh801 + SYS_001_MIPLOG_TIME_HH_801_LEN));
   	}
     int localSys001MiplogTimeMm801Counter = -1;
     public boolean isSys001MiplogTimeMm801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001MiplogTimeMm801Counter != sharedCounter;
         localSys001MiplogTimeMm801Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_MIPLOG_TIME_MM_801_LEN = 1;
	/**
	 * 	serialize this Sys001MiplogTimeMm801
	 */
   protected void serializeSys001MiplogTimeMm801(char[] sys001MiplogTimeMm801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001MiplogTimeMm801,0,getStringValue(),beginSys001MiplogTimeMm801,SYS_001_MIPLOG_TIME_MM_801_LEN);
       localSys001MiplogTimeMm801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001MiplogTimeMm801Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSys001MiplogTimeMm801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001MiplogTimeMm801() {	 
   		return (substring(getStringValue(),beginSys001MiplogTimeMm801,beginSys001MiplogTimeMm801 + SYS_001_MIPLOG_TIME_MM_801_LEN));
   	}
     int localSys001MiplogTimeSs801Counter = -1;
     public boolean isSys001MiplogTimeSs801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001MiplogTimeSs801Counter != sharedCounter;
         localSys001MiplogTimeSs801Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_MIPLOG_TIME_SS_801_LEN = 1;
	/**
	 * 	serialize this Sys001MiplogTimeSs801
	 */
   protected void serializeSys001MiplogTimeSs801(char[] sys001MiplogTimeSs801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001MiplogTimeSs801,0,getStringValue(),beginSys001MiplogTimeSs801,SYS_001_MIPLOG_TIME_SS_801_LEN);
       localSys001MiplogTimeSs801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001MiplogTimeSs801Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSys001MiplogTimeSs801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001MiplogTimeSs801() {	 
   		return (substring(getStringValue(),beginSys001MiplogTimeSs801,beginSys001MiplogTimeSs801 + SYS_001_MIPLOG_TIME_SS_801_LEN));
   	}




}
  
