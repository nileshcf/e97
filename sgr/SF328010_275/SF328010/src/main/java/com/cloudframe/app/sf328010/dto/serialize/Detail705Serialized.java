package com.cloudframe.app.sf328010.dto.serialize;

/**
*  The class Detail705Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Detail705Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Detail705Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DETAIL_705_LENGTH = 137;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginServiceId705;
            protected  int beginTotalCnt705;
            protected  int beginSuccessCnt705;
            protected  int beginSuccessPercent705;
            protected  int beginErrCnt705;
            protected  int beginErrPercent705;
            protected  int beginAvgTime705;
            protected  int beginHighTime705;
            protected  int beginLowTime705;
	
	/**
	* Constructor for Detail705Serialized
	**/
    public Detail705Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Detail705Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Detail705Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Detail705Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Detail705Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Detail705Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DETAIL_705_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginServiceId705 = getStartOffset() + 10;	// set offset for serialization
  
  
             beginTotalCnt705 = getStartOffset() + 18;	// set offset for serialization
  
  
             beginSuccessCnt705 = getStartOffset() + 35;	// set offset for serialization
  
  
             beginSuccessPercent705 = getStartOffset() + 48;	// set offset for serialization
  
  
  
             beginErrCnt705 = getStartOffset() + 57;	// set offset for serialization
  
  
             beginErrPercent705 = getStartOffset() + 70;	// set offset for serialization
  
  
  
             beginAvgTime705 = getStartOffset() + 81;	// set offset for serialization
  
  
             beginHighTime705 = getStartOffset() + 100;	// set offset for serialization
  
  
             beginLowTime705 = getStartOffset() + 115;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localServiceId705Counter = -1;
     public boolean isServiceId705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localServiceId705Counter != sharedCounter;
         localServiceId705Counter = sharedCounter; return hasModified;
     }
	protected static final int SERVICE_ID_705_LEN = 4;
	/**
	 * 	serialize this ServiceId705
	 */
   protected void serializeServiceId705(char[] serviceId705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(serviceId705,0,getStringValue(),beginServiceId705,SERVICE_ID_705_LEN);
       localServiceId705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkServiceId705Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshServiceId705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshServiceId705() {	 
   		return (substring(getStringValue(),beginServiceId705,beginServiceId705 + SERVICE_ID_705_LEN));
   	}
     int localTotalCnt705Counter = -1;
     public boolean isTotalCnt705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTotalCnt705Counter != sharedCounter;
         localTotalCnt705Counter = sharedCounter; return hasModified;
     }
	protected static final int TOTAL_CNT_705_LEN = 11;
	/**
	 * 	serialize this TotalCnt705
	 */
   protected void serializeTotalCnt705(char[] totalCnt705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(totalCnt705,0,getStringValue(),beginTotalCnt705,TOTAL_CNT_705_LEN);
       localTotalCnt705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTotalCnt705Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshTotalCnt705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTotalCnt705() {	 
   		return (substring(getStringValue(),beginTotalCnt705,beginTotalCnt705 + TOTAL_CNT_705_LEN));
   	}
     int localSuccessCnt705Counter = -1;
     public boolean isSuccessCnt705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSuccessCnt705Counter != sharedCounter;
         localSuccessCnt705Counter = sharedCounter; return hasModified;
     }
	protected static final int SUCCESS_CNT_705_LEN = 11;
	/**
	 * 	serialize this SuccessCnt705
	 */
   protected void serializeSuccessCnt705(char[] successCnt705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(successCnt705,0,getStringValue(),beginSuccessCnt705,SUCCESS_CNT_705_LEN);
       localSuccessCnt705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSuccessCnt705Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshSuccessCnt705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSuccessCnt705() {	 
   		return (substring(getStringValue(),beginSuccessCnt705,beginSuccessCnt705 + SUCCESS_CNT_705_LEN));
   	}
     int localSuccessPercent705Counter = -1;
     public boolean isSuccessPercent705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSuccessPercent705Counter != sharedCounter;
         localSuccessPercent705Counter = sharedCounter; return hasModified;
     }
	protected static final int SUCCESS_PERCENT_705_LEN = 6;
	/**
	 * 	serialize this SuccessPercent705
	 */
   protected void serializeSuccessPercent705(char[] successPercent705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(successPercent705,0,getStringValue(),beginSuccessPercent705,SUCCESS_PERCENT_705_LEN);
       localSuccessPercent705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSuccessPercent705Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSuccessPercent705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSuccessPercent705() {	 
   		return (substring(getStringValue(),beginSuccessPercent705,beginSuccessPercent705 + SUCCESS_PERCENT_705_LEN));
   	}
     int localErrCnt705Counter = -1;
     public boolean isErrCnt705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrCnt705Counter != sharedCounter;
         localErrCnt705Counter = sharedCounter; return hasModified;
     }
	protected static final int ERR_CNT_705_LEN = 11;
	/**
	 * 	serialize this ErrCnt705
	 */
   protected void serializeErrCnt705(char[] errCnt705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errCnt705,0,getStringValue(),beginErrCnt705,ERR_CNT_705_LEN);
       localErrCnt705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrCnt705Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshErrCnt705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrCnt705() {	 
   		return (substring(getStringValue(),beginErrCnt705,beginErrCnt705 + ERR_CNT_705_LEN));
   	}
     int localErrPercent705Counter = -1;
     public boolean isErrPercent705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrPercent705Counter != sharedCounter;
         localErrPercent705Counter = sharedCounter; return hasModified;
     }
	protected static final int ERR_PERCENT_705_LEN = 6;
	/**
	 * 	serialize this ErrPercent705
	 */
   protected void serializeErrPercent705(char[] errPercent705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errPercent705,0,getStringValue(),beginErrPercent705,ERR_PERCENT_705_LEN);
       localErrPercent705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrPercent705Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshErrPercent705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrPercent705() {	 
   		return (substring(getStringValue(),beginErrPercent705,beginErrPercent705 + ERR_PERCENT_705_LEN));
   	}
     int localAvgTime705Counter = -1;
     public boolean isAvgTime705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAvgTime705Counter != sharedCounter;
         localAvgTime705Counter = sharedCounter; return hasModified;
     }
	protected static final int AVG_TIME_705_LEN = 14;
	/**
	 * 	serialize this AvgTime705
	 */
   protected void serializeAvgTime705(char[] avgTime705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(avgTime705,0,getStringValue(),beginAvgTime705,AVG_TIME_705_LEN);
       localAvgTime705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAvgTime705Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshAvgTime705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAvgTime705() {	 
   		return (substring(getStringValue(),beginAvgTime705,beginAvgTime705 + AVG_TIME_705_LEN));
   	}
     int localHighTime705Counter = -1;
     public boolean isHighTime705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHighTime705Counter != sharedCounter;
         localHighTime705Counter = sharedCounter; return hasModified;
     }
	protected static final int HIGH_TIME_705_LEN = 11;
	/**
	 * 	serialize this HighTime705
	 */
   protected void serializeHighTime705(char[] highTime705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(highTime705,0,getStringValue(),beginHighTime705,HIGH_TIME_705_LEN);
       localHighTime705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHighTime705Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshHighTime705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHighTime705() {	 
   		return (substring(getStringValue(),beginHighTime705,beginHighTime705 + HIGH_TIME_705_LEN));
   	}
     int localLowTime705Counter = -1;
     public boolean isLowTime705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLowTime705Counter != sharedCounter;
         localLowTime705Counter = sharedCounter; return hasModified;
     }
	protected static final int LOW_TIME_705_LEN = 11;
	/**
	 * 	serialize this LowTime705
	 */
   protected void serializeLowTime705(char[] lowTime705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lowTime705,0,getStringValue(),beginLowTime705,LOW_TIME_705_LEN);
       localLowTime705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLowTime705Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshLowTime705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLowTime705() {	 
   		return (substring(getStringValue(),beginLowTime705,beginLowTime705 + LOW_TIME_705_LEN));
   	}




}
  
