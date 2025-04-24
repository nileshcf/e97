package com.cloudframe.app.vsammon4.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTaskNo;
            protected  int beginReqSize;
            protected  int beginOpenFlags;
            protected  int beginPrimaryKeyDisp;
	
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
  
  
  
             beginTaskNo = getStartOffset() + 0;	// set offset for serialization
  
             beginReqSize = getStartOffset() + 7;	// set offset for serialization
  
             beginOpenFlags = getStartOffset() + 16;	// set offset for serialization
  
             beginPrimaryKeyDisp = getStartOffset() + 17;	// set offset for serialization
  
  
  
  
  
  
	   /*  end of offset */
	}
         int localVskRecordSizeCounter = -1;
         public boolean isVskRecordSizeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localVskRecordSizeCounter != sharedCounter;
            localVskRecordSizeCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkVskRecordSizeMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localStartKeytypeCounter = -1;
     public boolean isStartKeytypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStartKeytypeCounter != sharedCounter;
         localStartKeytypeCounter = sharedCounter; return hasModified;
     }

   protected char[] checkStartKeytypeConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
         int localSub1Counter = -1;
         public boolean isSub1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSub1Counter != sharedCounter;
            localSub1Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSub1MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localTaskNoCounter = -1;
     public boolean isTaskNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaskNoCounter != sharedCounter;
         localTaskNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of taskNo
	 *	@return taskNo
	 */
	public char[]  getTaskNoString() {
	     return getCharArray(beginTaskNo,TASK_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean taskNoIsNumeric() {
	    return isNumeric(beginTaskNo
	                    ,beginTaskNo + TASK_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TASK_NO_LEN = 7;
  	/**
	 * serializeTaskNo
	 */
	protected void serializeTaskNo(long taskNo) {
		 putNumber(beginTaskNo,taskNo,TASK_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTaskNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTaskNo
	 */
   	protected  long serializeTaskNo(char[] value) {
	    long  taskNo;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    taskNo = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginTaskNo
		       ,7
		      );
		 localTaskNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  taskNo;
    }

   protected long checkTaskNoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTaskNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTaskNo() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTaskNo
			                 ,TASK_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("taskNo", beginTaskNo,TASK_NO_LEN);
    }
   	}
     int localReqSizeCounter = -1;
     public boolean isReqSizeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReqSizeCounter != sharedCounter;
         localReqSizeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of reqSize
	 *	@return reqSize
	 */
	public char[]  getReqSizeString() {
	     return getCharArray(beginReqSize,REQ_SIZE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean reqSizeIsNumeric() {
	    return isNumeric(beginReqSize
	                    ,beginReqSize + REQ_SIZE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int REQ_SIZE_LEN = 9;
  	/**
	 * serializeReqSize
	 */
	protected void serializeReqSize(long reqSize) {
		 putNumber(beginReqSize,reqSize,REQ_SIZE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localReqSizeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeReqSize
	 */
   	protected  long serializeReqSize(char[] value) {
	    long  reqSize;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    reqSize = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginReqSize
		       ,9
		      );
		 localReqSizeCounter = shareString.getSerializedField().getModifiedCounter();
		return  reqSize;
    }

   protected long checkReqSizeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshReqSize is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshReqSize() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginReqSize
			                 ,REQ_SIZE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("reqSize", beginReqSize,REQ_SIZE_LEN);
    }
   	}
     int localOpenFlagsCounter = -1;
     public boolean isOpenFlagsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOpenFlagsCounter != sharedCounter;
         localOpenFlagsCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of openFlags
	 *	@return openFlags
	 */
	public char[]  getOpenFlagsString() {
	     return getCharArray(beginOpenFlags,OPEN_FLAGS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean openFlagsIsNumeric() {
	    return isNumeric(beginOpenFlags
	                    ,beginOpenFlags + OPEN_FLAGS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OPEN_FLAGS_LEN = 1;
  	/**
	 * serializeOpenFlags
	 */
	protected void serializeOpenFlags(int openFlags) {
		 putNumber(beginOpenFlags,openFlags,OPEN_FLAGS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOpenFlagsCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOpenFlags
	 */
   	protected  int serializeOpenFlags(char[] value) {
	    int  openFlags;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    openFlags = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginOpenFlags
		       ,1
		      );
		 localOpenFlagsCounter = shareString.getSerializedField().getModifiedCounter();
		return  openFlags;
    }

   protected int checkOpenFlagsMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOpenFlags is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOpenFlags() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOpenFlags
			                 ,OPEN_FLAGS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("openFlags", beginOpenFlags,OPEN_FLAGS_LEN);
    }
   	}
     int localPrimaryKeyDispCounter = -1;
     public boolean isPrimaryKeyDispModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrimaryKeyDispCounter != sharedCounter;
         localPrimaryKeyDispCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of primaryKeyDisp
	 *	@return primaryKeyDisp
	 */
	public char[]  getPrimaryKeyDispString() {
	     return getCharArray(beginPrimaryKeyDisp,PRIMARY_KEY_DISP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean primaryKeyDispIsNumeric() {
	    return isNumeric(beginPrimaryKeyDisp
	                    ,beginPrimaryKeyDisp + PRIMARY_KEY_DISP_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PRIMARY_KEY_DISP_LEN = 9;
  	/**
	 * serializePrimaryKeyDisp
	 */
	protected void serializePrimaryKeyDisp(long primaryKeyDisp) {
		 putNumber(beginPrimaryKeyDisp,primaryKeyDisp,PRIMARY_KEY_DISP_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPrimaryKeyDispCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePrimaryKeyDisp
	 */
   	protected  long serializePrimaryKeyDisp(char[] value) {
	    long  primaryKeyDisp;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    primaryKeyDisp = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginPrimaryKeyDisp
		       ,9
		      );
		 localPrimaryKeyDispCounter = shareString.getSerializedField().getModifiedCounter();
		return  primaryKeyDisp;
    }

   protected long checkPrimaryKeyDispMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPrimaryKeyDisp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPrimaryKeyDisp() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPrimaryKeyDisp
			                 ,PRIMARY_KEY_DISP_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("primaryKeyDisp", beginPrimaryKeyDisp,PRIMARY_KEY_DISP_LEN);
    }
   	}
     int localVsamRecordDispCounter = -1;
     public boolean isVsamRecordDispModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVsamRecordDispCounter != sharedCounter;
         localVsamRecordDispCounter = sharedCounter; return hasModified;
     }

   protected char[] checkVsamRecordDispConstraints(char[] value) {
   			return super.checkConstraints(value , 221 ,false, false);
   }
     int localVsvksdsFileStatusCounter = -1;
     public boolean isVsvksdsFileStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVsvksdsFileStatusCounter != sharedCounter;
         localVsvksdsFileStatusCounter = sharedCounter; return hasModified;
     }

   protected char[] checkVsvksdsFileStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localEofSwCounter = -1;
     public boolean isEofSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEofSwCounter != sharedCounter;
         localEofSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkEofSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localCharstrCounter = -1;
     public boolean isCharstrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharstrCounter != sharedCounter;
         localCharstrCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCharstrConstraints(char[] value) {
   			return super.checkConstraints(value , 252 ,false, false);
   }
     int localNumstrCounter = -1;
     public boolean isNumstrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNumstrCounter != sharedCounter;
         localNumstrCounter = sharedCounter; return hasModified;
     }

   protected char[] checkNumstrConstraints(char[] value) {
   			return super.checkConstraints(value , 200 ,false, false);
   }




}
  
