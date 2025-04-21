package com.cloudframe.app.wm002.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCallCount;
            protected  int beginLoopCount;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCallCount = getStartOffset() + 0;	// set offset for serialization
  
             beginLoopCount = getStartOffset() + 4;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCallCountCounter = -1;
     public boolean isCallCountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCallCountCounter != sharedCounter;
         localCallCountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of callCount
	 *	@return callCount
	 */
	public char[]  getCallCountString() {
	     return getCharArray(beginCallCount,CALL_COUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean callCountIsNumeric() {
	    return isNumeric(beginCallCount
	                    ,beginCallCount + CALL_COUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CALL_COUNT_LEN = 4;
  	/**
	 * serializeCallCount
	 */
	protected void serializeCallCount(int callCount) {
		 putNumber(beginCallCount,callCount,CALL_COUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCallCountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCallCount
	 */
   	protected  int serializeCallCount(char[] value) {
	    int  callCount;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    callCount = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginCallCount
		       ,4
		      );
		 localCallCountCounter = shareString.getSerializedField().getModifiedCounter();
		return  callCount;
    }

   protected int checkCallCountMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCallCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCallCount() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCallCount
			                 ,CALL_COUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("callCount", beginCallCount,CALL_COUNT_LEN);
    }
   	}
     int localLoopCountCounter = -1;
     public boolean isLoopCountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLoopCountCounter != sharedCounter;
         localLoopCountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of loopCount
	 *	@return loopCount
	 */
	public char[]  getLoopCountString() {
	     return getCharArray(beginLoopCount,LOOP_COUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean loopCountIsNumeric() {
	    return isNumeric(beginLoopCount
	                    ,beginLoopCount + LOOP_COUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LOOP_COUNT_LEN = 2;
  	/**
	 * serializeLoopCount
	 */
	protected void serializeLoopCount(int loopCount) {
		 putNumber(beginLoopCount,loopCount,LOOP_COUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLoopCountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLoopCount
	 */
   	protected  int serializeLoopCount(char[] value) {
	    int  loopCount;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    loopCount = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginLoopCount
		       ,2
		      );
		 localLoopCountCounter = shareString.getSerializedField().getModifiedCounter();
		return  loopCount;
    }

   protected int checkLoopCountMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLoopCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLoopCount() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginLoopCount
			                 ,LOOP_COUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("loopCount", beginLoopCount,LOOP_COUNT_LEN);
    }
   	}
     int localSwitchWsCounter = -1;
     public boolean isSwitchWsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSwitchWsCounter != sharedCounter;
         localSwitchWsCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSwitchWsConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }




}
  
