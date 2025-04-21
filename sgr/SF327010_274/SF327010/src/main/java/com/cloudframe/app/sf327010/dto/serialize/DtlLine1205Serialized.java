package com.cloudframe.app.sf327010.dto.serialize;

/**
*  The class DtlLine1205Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtlLine1205Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtlLine1205Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DTL_LINE_1205_LENGTH = 130;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLogType205;
            protected  int beginService205;
            protected  int beginTotMsgCount205;
            protected  int beginSuccessfulCount205;
            protected  int beginSuccessfulPercnt205;
            protected  int beginErrorCount205;
            protected  int beginErrorPercent205;
            protected  int beginAvgElapsed205;
            protected  int beginHighElapsed205;
            protected  int beginLowElapsed205;
	
	/**
	* Constructor for DtlLine1205Serialized
	**/
    public DtlLine1205Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtlLine1205Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DTL_LINE_1205_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginLogType205 = getStartOffset() + 3;	// set offset for serialization
  
  
             beginService205 = getStartOffset() + 12;	// set offset for serialization
  
  
             beginTotMsgCount205 = getStartOffset() + 26;	// set offset for serialization
  
  
             beginSuccessfulCount205 = getStartOffset() + 42;	// set offset for serialization
  
  
             beginSuccessfulPercnt205 = getStartOffset() + 54;	// set offset for serialization
  
  
  
             beginErrorCount205 = getStartOffset() + 62;	// set offset for serialization
  
  
             beginErrorPercent205 = getStartOffset() + 74;	// set offset for serialization
  
  
  
             beginAvgElapsed205 = getStartOffset() + 85;	// set offset for serialization
  
  
             beginHighElapsed205 = getStartOffset() + 104;	// set offset for serialization
  
  
             beginLowElapsed205 = getStartOffset() + 119;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLogType205Counter = -1;
     public boolean isLogType205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogType205Counter != sharedCounter;
         localLogType205Counter = sharedCounter; return hasModified;
     }
	protected static final int LOG_TYPE_205_LEN = 1;
	/**
	 * 	serialize this LogType205
	 */
   protected void serializeLogType205(char[] logType205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(logType205,0,getStringValue(),beginLogType205,LOG_TYPE_205_LEN);
       localLogType205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLogType205Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshLogType205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLogType205() {	 
   		return (substring(getStringValue(),beginLogType205,beginLogType205 + LOG_TYPE_205_LEN));
   	}
     int localService205Counter = -1;
     public boolean isService205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localService205Counter != sharedCounter;
         localService205Counter = sharedCounter; return hasModified;
     }
	protected static final int SERVICE_205_LEN = 4;
	/**
	 * 	serialize this Service205
	 */
   protected void serializeService205(char[] service205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(service205,0,getStringValue(),beginService205,SERVICE_205_LEN);
       localService205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkService205Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshService205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshService205() {	 
   		return (substring(getStringValue(),beginService205,beginService205 + SERVICE_205_LEN));
   	}
     int localTotMsgCount205Counter = -1;
     public boolean isTotMsgCount205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTotMsgCount205Counter != sharedCounter;
         localTotMsgCount205Counter = sharedCounter; return hasModified;
     }
	protected static final int TOT_MSG_COUNT_205_LEN = 11;
	/**
	 * 	serialize this TotMsgCount205
	 */
   protected void serializeTotMsgCount205(char[] totMsgCount205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(totMsgCount205,0,getStringValue(),beginTotMsgCount205,TOT_MSG_COUNT_205_LEN);
       localTotMsgCount205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTotMsgCount205Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshTotMsgCount205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTotMsgCount205() {	 
   		return (substring(getStringValue(),beginTotMsgCount205,beginTotMsgCount205 + TOT_MSG_COUNT_205_LEN));
   	}
     int localSuccessfulCount205Counter = -1;
     public boolean isSuccessfulCount205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSuccessfulCount205Counter != sharedCounter;
         localSuccessfulCount205Counter = sharedCounter; return hasModified;
     }
	protected static final int SUCCESSFUL_COUNT_205_LEN = 11;
	/**
	 * 	serialize this SuccessfulCount205
	 */
   protected void serializeSuccessfulCount205(char[] successfulCount205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(successfulCount205,0,getStringValue(),beginSuccessfulCount205,SUCCESSFUL_COUNT_205_LEN);
       localSuccessfulCount205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSuccessfulCount205Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshSuccessfulCount205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSuccessfulCount205() {	 
   		return (substring(getStringValue(),beginSuccessfulCount205,beginSuccessfulCount205 + SUCCESSFUL_COUNT_205_LEN));
   	}
     int localSuccessfulPercnt205Counter = -1;
     public boolean isSuccessfulPercnt205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSuccessfulPercnt205Counter != sharedCounter;
         localSuccessfulPercnt205Counter = sharedCounter; return hasModified;
     }
	protected static final int SUCCESSFUL_PERCNT_205_LEN = 6;
	/**
	 * 	serialize this SuccessfulPercnt205
	 */
   protected void serializeSuccessfulPercnt205(char[] successfulPercnt205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(successfulPercnt205,0,getStringValue(),beginSuccessfulPercnt205,SUCCESSFUL_PERCNT_205_LEN);
       localSuccessfulPercnt205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSuccessfulPercnt205Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSuccessfulPercnt205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSuccessfulPercnt205() {	 
   		return (substring(getStringValue(),beginSuccessfulPercnt205,beginSuccessfulPercnt205 + SUCCESSFUL_PERCNT_205_LEN));
   	}
     int localErrorCount205Counter = -1;
     public boolean isErrorCount205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorCount205Counter != sharedCounter;
         localErrorCount205Counter = sharedCounter; return hasModified;
     }
	protected static final int ERROR_COUNT_205_LEN = 11;
	/**
	 * 	serialize this ErrorCount205
	 */
   protected void serializeErrorCount205(char[] errorCount205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errorCount205,0,getStringValue(),beginErrorCount205,ERROR_COUNT_205_LEN);
       localErrorCount205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrorCount205Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshErrorCount205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrorCount205() {	 
   		return (substring(getStringValue(),beginErrorCount205,beginErrorCount205 + ERROR_COUNT_205_LEN));
   	}
     int localErrorPercent205Counter = -1;
     public boolean isErrorPercent205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorPercent205Counter != sharedCounter;
         localErrorPercent205Counter = sharedCounter; return hasModified;
     }
	protected static final int ERROR_PERCENT_205_LEN = 6;
	/**
	 * 	serialize this ErrorPercent205
	 */
   protected void serializeErrorPercent205(char[] errorPercent205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errorPercent205,0,getStringValue(),beginErrorPercent205,ERROR_PERCENT_205_LEN);
       localErrorPercent205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrorPercent205Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshErrorPercent205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrorPercent205() {	 
   		return (substring(getStringValue(),beginErrorPercent205,beginErrorPercent205 + ERROR_PERCENT_205_LEN));
   	}
     int localAvgElapsed205Counter = -1;
     public boolean isAvgElapsed205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAvgElapsed205Counter != sharedCounter;
         localAvgElapsed205Counter = sharedCounter; return hasModified;
     }
	protected static final int AVG_ELAPSED_205_LEN = 14;
	/**
	 * 	serialize this AvgElapsed205
	 */
   protected void serializeAvgElapsed205(char[] avgElapsed205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(avgElapsed205,0,getStringValue(),beginAvgElapsed205,AVG_ELAPSED_205_LEN);
       localAvgElapsed205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAvgElapsed205Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshAvgElapsed205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAvgElapsed205() {	 
   		return (substring(getStringValue(),beginAvgElapsed205,beginAvgElapsed205 + AVG_ELAPSED_205_LEN));
   	}
     int localHighElapsed205Counter = -1;
     public boolean isHighElapsed205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHighElapsed205Counter != sharedCounter;
         localHighElapsed205Counter = sharedCounter; return hasModified;
     }
	protected static final int HIGH_ELAPSED_205_LEN = 11;
	/**
	 * 	serialize this HighElapsed205
	 */
   protected void serializeHighElapsed205(char[] highElapsed205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(highElapsed205,0,getStringValue(),beginHighElapsed205,HIGH_ELAPSED_205_LEN);
       localHighElapsed205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHighElapsed205Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshHighElapsed205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHighElapsed205() {	 
   		return (substring(getStringValue(),beginHighElapsed205,beginHighElapsed205 + HIGH_ELAPSED_205_LEN));
   	}
     int localLowElapsed205Counter = -1;
     public boolean isLowElapsed205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLowElapsed205Counter != sharedCounter;
         localLowElapsed205Counter = sharedCounter; return hasModified;
     }
	protected static final int LOW_ELAPSED_205_LEN = 11;
	/**
	 * 	serialize this LowElapsed205
	 */
   protected void serializeLowElapsed205(char[] lowElapsed205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lowElapsed205,0,getStringValue(),beginLowElapsed205,LOW_ELAPSED_205_LEN);
       localLowElapsed205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLowElapsed205Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshLowElapsed205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLowElapsed205() {	 
   		return (substring(getStringValue(),beginLowElapsed205,beginLowElapsed205 + LOW_ELAPSED_205_LEN));
   	}




}
  
