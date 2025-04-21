package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMessageMaxCnt;
	
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
  
  
  
  
  
  
             beginMessageMaxCnt = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCDisplayJobnmeCounter = -1;
     public boolean isCDisplayJobnmeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCDisplayJobnmeCounter != sharedCounter;
         localCDisplayJobnmeCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCDisplayJobnmeConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localDelayedCpduIndCounter = -1;
     public boolean isDelayedCpduIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDelayedCpduIndCounter != sharedCounter;
         localDelayedCpduIndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDelayedCpduIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localRejectCdCounter = -1;
     public boolean isRejectCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRejectCdCounter != sharedCounter;
         localRejectCdCounter = sharedCounter; return hasModified;
     }

   protected char[] checkRejectCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localBypassAcctFlagCounter = -1;
     public boolean isBypassAcctFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBypassAcctFlagCounter != sharedCounter;
         localBypassAcctFlagCounter = sharedCounter; return hasModified;
     }

   protected char[] checkBypassAcctFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localErrRejFlagCounter = -1;
     public boolean isErrRejFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrRejFlagCounter != sharedCounter;
         localErrRejFlagCounter = sharedCounter; return hasModified;
     }

   protected char[] checkErrRejFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localPaygoSplanTableXCounter = -1;
     public boolean isPaygoSplanTableXModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPaygoSplanTableXCounter != sharedCounter;
         localPaygoSplanTableXCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPaygoSplanTableXConstraints(char[] value) {
   			return super.checkConstraints(value , 52 ,false, false);
   }
        int localMessageMaxCntCounter = -1;
        public boolean isMessageMaxCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localMessageMaxCntCounter != sharedCounter;
           localMessageMaxCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean messageMaxCntIsNumeric() {
	      return decimalIsNumeric(beginMessageMaxCnt,MESSAGE_MAX_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int MESSAGE_MAX_CNT_LEN = 2;
  	/**
	 * 	serializeMessageMaxCnt
	 */
	protected void serializeMessageMaxCnt(short messageMaxCnt) {
		   putDecimal(beginMessageMaxCnt,messageMaxCnt,MESSAGE_MAX_CNT_LEN,true);
   }
   

   protected short checkMessageMaxCntMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshMessageMaxCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMessageMaxCnt() throws CFException {	
   	try { 
		 return (getShortDecimal(beginMessageMaxCnt,MESSAGE_MAX_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("messageMaxCnt", beginMessageMaxCnt,MESSAGE_MAX_CNT_LEN);
     }
   	}
         int localI1Counter = -1;
         public boolean isI1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localI1Counter != sharedCounter;
            localI1Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkI1MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }




}
  
