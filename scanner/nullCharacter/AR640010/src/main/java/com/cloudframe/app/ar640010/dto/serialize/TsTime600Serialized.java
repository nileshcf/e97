package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TsTime600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TsTime600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TsTime600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TS_TIME_600_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTsHour600;
            protected  int beginTsMinute600;
            protected  int beginTsSecond600;
	
	/**
	* Constructor for TsTime600Serialized
	**/
    public TsTime600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TsTime600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TsTime600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TsTime600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,394); // serialize this field at offset 394 by default 
    }
    
	/**
	* sets parent for this TsTime600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 394 by default
    }    
	/**
	* initializes the field in TsTime600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TS_TIME_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTsHour600 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginTsMinute600 = getStartOffset() + 3;	// set offset for serialization
  
  
             beginTsSecond600 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTsHour600Counter = -1;
     public boolean isTsHour600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTsHour600Counter != sharedCounter;
         localTsHour600Counter = sharedCounter; return hasModified;
     }
	protected static final int TS_HOUR_600_LEN = 2;
	/**
	 * 	serialize this TsHour600
	 */
   protected void serializeTsHour600(char[] tsHour600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tsHour600,0,getStringValue(),beginTsHour600,TS_HOUR_600_LEN);
       localTsHour600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTsHour600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTsHour600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTsHour600() {	 
   		return (substring(getStringValue(),beginTsHour600,beginTsHour600 + TS_HOUR_600_LEN));
   	}
     int localTsMinute600Counter = -1;
     public boolean isTsMinute600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTsMinute600Counter != sharedCounter;
         localTsMinute600Counter = sharedCounter; return hasModified;
     }
	protected static final int TS_MINUTE_600_LEN = 2;
	/**
	 * 	serialize this TsMinute600
	 */
   protected void serializeTsMinute600(char[] tsMinute600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tsMinute600,0,getStringValue(),beginTsMinute600,TS_MINUTE_600_LEN);
       localTsMinute600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTsMinute600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTsMinute600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTsMinute600() {	 
   		return (substring(getStringValue(),beginTsMinute600,beginTsMinute600 + TS_MINUTE_600_LEN));
   	}
     int localTsSecond600Counter = -1;
     public boolean isTsSecond600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTsSecond600Counter != sharedCounter;
         localTsSecond600Counter = sharedCounter; return hasModified;
     }
	protected static final int TS_SECOND_600_LEN = 2;
	/**
	 * 	serialize this TsSecond600
	 */
   protected void serializeTsSecond600(char[] tsSecond600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tsSecond600,0,getStringValue(),beginTsSecond600,TS_SECOND_600_LEN);
       localTsSecond600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTsSecond600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTsSecond600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTsSecond600() {	 
   		return (substring(getStringValue(),beginTsSecond600,beginTsSecond600 + TS_SECOND_600_LEN));
   	}




}
  
