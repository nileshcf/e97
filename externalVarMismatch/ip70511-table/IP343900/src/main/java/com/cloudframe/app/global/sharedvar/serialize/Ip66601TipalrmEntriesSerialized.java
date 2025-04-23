package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip66601TipalrmEntriesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip66601TipalrmEntriesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip66601TipalrmEntriesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_66601_TIPALRM_ENTRIES_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp66601JobGroup;
            protected  int beginIp66601JobSeqNumber;
            protected  int beginIp66601NumberOfRunning;
            protected  int beginIp66601NumberToRun;
            protected  int beginIp66601DefaultRunNumber;
            protected  int beginIp66601MaximumRunNumber;
            protected  int beginIp66601ShortSleep;
            protected  int beginIp66601LongSleep;
            protected  int beginIp66601TaskDesc;
            protected  int beginIp66601TaskTypeCd;
	
	/**
	* Constructor for Ip66601TipalrmEntriesSerialized
	**/
    public Ip66601TipalrmEntriesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip66601TipalrmEntriesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_66601_TIPALRM_ENTRIES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp66601JobGroup = getStartOffset() + 0;	// set offset for serialization
  
             beginIp66601JobSeqNumber = getStartOffset() + 6;	// set offset for serialization
  
             beginIp66601NumberOfRunning = getStartOffset() + 8;	// set offset for serialization
  
             beginIp66601NumberToRun = getStartOffset() + 10;	// set offset for serialization
  
             beginIp66601DefaultRunNumber = getStartOffset() + 12;	// set offset for serialization
  
             beginIp66601MaximumRunNumber = getStartOffset() + 14;	// set offset for serialization
  
             beginIp66601ShortSleep = getStartOffset() + 16;	// set offset for serialization
  
             beginIp66601LongSleep = getStartOffset() + 24;	// set offset for serialization
  
             beginIp66601TaskDesc = getStartOffset() + 32;	// set offset for serialization
  
             beginIp66601TaskTypeCd = getStartOffset() + 62;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp66601JobGroupCounter = -1;
     public boolean isIp66601JobGroupModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66601JobGroupCounter != sharedCounter;
         localIp66601JobGroupCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_66601_JOB_GROUP_LEN = 6;
	/**
	 * 	serialize this Ip66601JobGroup
	 */
   protected void serializeIp66601JobGroup(char[] ip66601JobGroup) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66601JobGroup,0,getStringValue(),beginIp66601JobGroup,IP_66601_JOB_GROUP_LEN);
       localIp66601JobGroupCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66601JobGroupConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshIp66601JobGroup is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66601JobGroup() {	 
   		return (substring(getStringValue(),beginIp66601JobGroup,beginIp66601JobGroup + IP_66601_JOB_GROUP_LEN));
   	}
         int localIp66601JobSeqNumberCounter = -1;
         public boolean isIp66601JobSeqNumberModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66601JobSeqNumberCounter != sharedCounter;
            localIp66601JobSeqNumberCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_66601_JOB_SEQ_NUMBER_LEN = 2;
  	/**
	 * serializeIp66601JobSeqNumber
	 */
	protected void serializeIp66601JobSeqNumber(short ip66601JobSeqNumber) {
           replaceValue( //  save the value as string
                   getBinaryString( ip66601JobSeqNumber,IP_66601_JOB_SEQ_NUMBER_LEN)
                  ,beginIp66601JobSeqNumber
                  ,IP_66601_JOB_SEQ_NUMBER_LEN
                 );
            localIp66601JobSeqNumberCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp66601JobSeqNumberMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp66601JobSeqNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp66601JobSeqNumber() {	 
			return (getShort(beginIp66601JobSeqNumber));
   	}
         int localIp66601NumberOfRunningCounter = -1;
         public boolean isIp66601NumberOfRunningModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66601NumberOfRunningCounter != sharedCounter;
            localIp66601NumberOfRunningCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_66601_NUMBER_OF_RUNNING_LEN = 2;
  	/**
	 * serializeIp66601NumberOfRunning
	 */
	protected void serializeIp66601NumberOfRunning(short ip66601NumberOfRunning) {
           replaceValue( //  save the value as string
                   getBinaryString( ip66601NumberOfRunning,IP_66601_NUMBER_OF_RUNNING_LEN)
                  ,beginIp66601NumberOfRunning
                  ,IP_66601_NUMBER_OF_RUNNING_LEN
                 );
            localIp66601NumberOfRunningCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp66601NumberOfRunningMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp66601NumberOfRunning is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp66601NumberOfRunning() {	 
			return (getShort(beginIp66601NumberOfRunning));
   	}
         int localIp66601NumberToRunCounter = -1;
         public boolean isIp66601NumberToRunModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66601NumberToRunCounter != sharedCounter;
            localIp66601NumberToRunCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_66601_NUMBER_TO_RUN_LEN = 2;
  	/**
	 * serializeIp66601NumberToRun
	 */
	protected void serializeIp66601NumberToRun(short ip66601NumberToRun) {
           replaceValue( //  save the value as string
                   getBinaryString( ip66601NumberToRun,IP_66601_NUMBER_TO_RUN_LEN)
                  ,beginIp66601NumberToRun
                  ,IP_66601_NUMBER_TO_RUN_LEN
                 );
            localIp66601NumberToRunCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp66601NumberToRunMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp66601NumberToRun is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp66601NumberToRun() {	 
			return (getShort(beginIp66601NumberToRun));
   	}
         int localIp66601DefaultRunNumberCounter = -1;
         public boolean isIp66601DefaultRunNumberModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66601DefaultRunNumberCounter != sharedCounter;
            localIp66601DefaultRunNumberCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_66601_DEFAULT_RUN_NUMBER_LEN = 2;
  	/**
	 * serializeIp66601DefaultRunNumber
	 */
	protected void serializeIp66601DefaultRunNumber(short ip66601DefaultRunNumber) {
           replaceValue( //  save the value as string
                   getBinaryString( ip66601DefaultRunNumber,IP_66601_DEFAULT_RUN_NUMBER_LEN)
                  ,beginIp66601DefaultRunNumber
                  ,IP_66601_DEFAULT_RUN_NUMBER_LEN
                 );
            localIp66601DefaultRunNumberCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp66601DefaultRunNumberMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp66601DefaultRunNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp66601DefaultRunNumber() {	 
			return (getShort(beginIp66601DefaultRunNumber));
   	}
         int localIp66601MaximumRunNumberCounter = -1;
         public boolean isIp66601MaximumRunNumberModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66601MaximumRunNumberCounter != sharedCounter;
            localIp66601MaximumRunNumberCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_66601_MAXIMUM_RUN_NUMBER_LEN = 2;
  	/**
	 * serializeIp66601MaximumRunNumber
	 */
	protected void serializeIp66601MaximumRunNumber(short ip66601MaximumRunNumber) {
           replaceValue( //  save the value as string
                   getBinaryString( ip66601MaximumRunNumber,IP_66601_MAXIMUM_RUN_NUMBER_LEN)
                  ,beginIp66601MaximumRunNumber
                  ,IP_66601_MAXIMUM_RUN_NUMBER_LEN
                 );
            localIp66601MaximumRunNumberCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp66601MaximumRunNumberMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp66601MaximumRunNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp66601MaximumRunNumber() {	 
			return (getShort(beginIp66601MaximumRunNumber));
   	}
     int localIp66601ShortSleepCounter = -1;
     public boolean isIp66601ShortSleepModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66601ShortSleepCounter != sharedCounter;
         localIp66601ShortSleepCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_66601_SHORT_SLEEP_LEN = 8;
	/**
	 * 	serialize this Ip66601ShortSleep
	 */
   protected void serializeIp66601ShortSleep(char[] ip66601ShortSleep) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66601ShortSleep,0,getStringValue(),beginIp66601ShortSleep,IP_66601_SHORT_SLEEP_LEN);
       localIp66601ShortSleepCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66601ShortSleepConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp66601ShortSleep is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66601ShortSleep() {	 
   		return (substring(getStringValue(),beginIp66601ShortSleep,beginIp66601ShortSleep + IP_66601_SHORT_SLEEP_LEN));
   	}
     int localIp66601LongSleepCounter = -1;
     public boolean isIp66601LongSleepModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66601LongSleepCounter != sharedCounter;
         localIp66601LongSleepCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_66601_LONG_SLEEP_LEN = 8;
	/**
	 * 	serialize this Ip66601LongSleep
	 */
   protected void serializeIp66601LongSleep(char[] ip66601LongSleep) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66601LongSleep,0,getStringValue(),beginIp66601LongSleep,IP_66601_LONG_SLEEP_LEN);
       localIp66601LongSleepCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66601LongSleepConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp66601LongSleep is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66601LongSleep() {	 
   		return (substring(getStringValue(),beginIp66601LongSleep,beginIp66601LongSleep + IP_66601_LONG_SLEEP_LEN));
   	}
     int localIp66601TaskDescCounter = -1;
     public boolean isIp66601TaskDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66601TaskDescCounter != sharedCounter;
         localIp66601TaskDescCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_66601_TASK_DESC_LEN = 30;
	/**
	 * 	serialize this Ip66601TaskDesc
	 */
   protected void serializeIp66601TaskDesc(char[] ip66601TaskDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66601TaskDesc,0,getStringValue(),beginIp66601TaskDesc,IP_66601_TASK_DESC_LEN);
       localIp66601TaskDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66601TaskDescConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshIp66601TaskDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66601TaskDesc() {	 
   		return (substring(getStringValue(),beginIp66601TaskDesc,beginIp66601TaskDesc + IP_66601_TASK_DESC_LEN));
   	}
     int localIp66601TaskTypeCdCounter = -1;
     public boolean isIp66601TaskTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66601TaskTypeCdCounter != sharedCounter;
         localIp66601TaskTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_66601_TASK_TYPE_CD_LEN = 1;
	/**
	 * 	serialize this Ip66601TaskTypeCd
	 */
   protected void serializeIp66601TaskTypeCd(char[] ip66601TaskTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66601TaskTypeCd,0,getStringValue(),beginIp66601TaskTypeCd,IP_66601_TASK_TYPE_CD_LEN);
       localIp66601TaskTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66601TaskTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66601TaskTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66601TaskTypeCd() {	 
   		return (substring(getStringValue(),beginIp66601TaskTypeCd,beginIp66601TaskTypeCd + IP_66601_TASK_TYPE_CD_LEN));
   	}




}
  
