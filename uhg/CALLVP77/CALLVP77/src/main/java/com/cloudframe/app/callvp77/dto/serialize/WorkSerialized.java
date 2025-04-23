package com.cloudframe.app.callvp77.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:58. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInputStatus;
            protected  int beginOutputStatus;
            protected  int beginInSrtCnt;
            protected  int beginNoItemsTobeSorted;
            protected  int beginJ;
	
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
             beginInputStatus = getStartOffset() + 0;	// set offset for serialization
  
             beginOutputStatus = getStartOffset() + 2;	// set offset for serialization
  
  
  
             beginInSrtCnt = getStartOffset() + 4;	// set offset for serialization
  
             beginNoItemsTobeSorted = getStartOffset() + 7;	// set offset for serialization
  
             beginJ = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localInputStatusCounter = -1;
     public boolean isInputStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputStatusCounter != sharedCounter;
         localInputStatusCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of inputStatus
	 *	@return inputStatus
	 */
	public char[]  getInputStatusString() {
	     return getCharArray(beginInputStatus,INPUT_STATUS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inputStatusIsNumeric() {
	    return isNumeric(beginInputStatus
	                    ,beginInputStatus + INPUT_STATUS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int INPUT_STATUS_LEN = 2;
  	/**
	 * serializeInputStatus
	 */
	protected void serializeInputStatus(int inputStatus) {
		 putNumber(beginInputStatus,inputStatus,INPUT_STATUS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInputStatusCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeInputStatus
	 */
   	protected  int serializeInputStatus(char[] value) {
	    int  inputStatus;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    inputStatus = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginInputStatus
		       ,2
		      );
		 localInputStatusCounter = shareString.getSerializedField().getModifiedCounter();
		return  inputStatus;
    }

   protected int checkInputStatusMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshInputStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshInputStatus() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginInputStatus
			                 ,INPUT_STATUS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("inputStatus", beginInputStatus,INPUT_STATUS_LEN);
    }
   	}
     int localOutputStatusCounter = -1;
     public boolean isOutputStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutputStatusCounter != sharedCounter;
         localOutputStatusCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of outputStatus
	 *	@return outputStatus
	 */
	public char[]  getOutputStatusString() {
	     return getCharArray(beginOutputStatus,OUTPUT_STATUS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outputStatusIsNumeric() {
	    return isNumeric(beginOutputStatus
	                    ,beginOutputStatus + OUTPUT_STATUS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OUTPUT_STATUS_LEN = 2;
  	/**
	 * serializeOutputStatus
	 */
	protected void serializeOutputStatus(int outputStatus) {
		 putNumber(beginOutputStatus,outputStatus,OUTPUT_STATUS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOutputStatusCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOutputStatus
	 */
   	protected  int serializeOutputStatus(char[] value) {
	    int  outputStatus;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    outputStatus = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginOutputStatus
		       ,2
		      );
		 localOutputStatusCounter = shareString.getSerializedField().getModifiedCounter();
		return  outputStatus;
    }

   protected int checkOutputStatusMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOutputStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOutputStatus() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOutputStatus
			                 ,OUTPUT_STATUS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("outputStatus", beginOutputStatus,OUTPUT_STATUS_LEN);
    }
   	}
         int localEofFlagCounter = -1;
         public boolean isEofFlagModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEofFlagCounter != sharedCounter;
            localEofFlagCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkEofFlagMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localVp776a0001Counter = -1;
     public boolean isVp776a0001Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVp776a0001Counter != sharedCounter;
         localVp776a0001Counter = sharedCounter; return hasModified;
     }

   protected char[] checkVp776a0001Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localInSrtCntCounter = -1;
     public boolean isInSrtCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInSrtCntCounter != sharedCounter;
         localInSrtCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of inSrtCnt
	 *	@return inSrtCnt
	 */
	public char[]  getInSrtCntString() {
	     return getCharArray(beginInSrtCnt,IN_SRT_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inSrtCntIsNumeric() {
	    return isNumeric(beginInSrtCnt
	                    ,beginInSrtCnt + IN_SRT_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IN_SRT_CNT_LEN = 3;
  	/**
	 * serializeInSrtCnt
	 */
	protected void serializeInSrtCnt(int inSrtCnt) {
		 putNumber(beginInSrtCnt,inSrtCnt,IN_SRT_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInSrtCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeInSrtCnt
	 */
   	protected  int serializeInSrtCnt(char[] value) {
	    int  inSrtCnt;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    inSrtCnt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginInSrtCnt
		       ,3
		      );
		 localInSrtCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  inSrtCnt;
    }

   protected int checkInSrtCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshInSrtCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshInSrtCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginInSrtCnt
			                 ,IN_SRT_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("inSrtCnt", beginInSrtCnt,IN_SRT_CNT_LEN);
    }
   	}
     int localNoItemsTobeSortedCounter = -1;
     public boolean isNoItemsTobeSortedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNoItemsTobeSortedCounter != sharedCounter;
         localNoItemsTobeSortedCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of noItemsTobeSorted
	 *	@return noItemsTobeSorted
	 */
	public char[]  getNoItemsTobeSortedString() {
	     return getCharArray(beginNoItemsTobeSorted,NO_ITEMS_TOBE_SORTED_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean noItemsTobeSortedIsNumeric() {
	    return isNumeric(beginNoItemsTobeSorted
	                    ,beginNoItemsTobeSorted + NO_ITEMS_TOBE_SORTED_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NO_ITEMS_TOBE_SORTED_LEN = 3;
  	/**
	 * serializeNoItemsTobeSorted
	 */
	protected void serializeNoItemsTobeSorted(int noItemsTobeSorted) {
		 putNumber(beginNoItemsTobeSorted,noItemsTobeSorted,NO_ITEMS_TOBE_SORTED_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNoItemsTobeSortedCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNoItemsTobeSorted
	 */
   	protected  int serializeNoItemsTobeSorted(char[] value) {
	    int  noItemsTobeSorted;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    noItemsTobeSorted = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginNoItemsTobeSorted
		       ,3
		      );
		 localNoItemsTobeSortedCounter = shareString.getSerializedField().getModifiedCounter();
		return  noItemsTobeSorted;
    }

   protected int checkNoItemsTobeSortedMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNoItemsTobeSorted is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNoItemsTobeSorted() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNoItemsTobeSorted
			                 ,NO_ITEMS_TOBE_SORTED_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("noItemsTobeSorted", beginNoItemsTobeSorted,NO_ITEMS_TOBE_SORTED_LEN);
    }
   	}
     int localJCounter = -1;
     public boolean isJModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJCounter != sharedCounter;
         localJCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of j
	 *	@return j
	 */
	public char[]  getJString() {
	     return getCharArray(beginJ,J_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean jIsNumeric() {
	    return isNumeric(beginJ
	                    ,beginJ + J_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int J_LEN = 3;
  	/**
	 * serializeJ
	 */
	protected void serializeJ(int j) {
		 putNumber(beginJ,j,J_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localJCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeJ
	 */
   	protected  int serializeJ(char[] value) {
	    int  j;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    j = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginJ
		       ,3
		      );
		 localJCounter = shareString.getSerializedField().getModifiedCounter();
		return  j;
    }

   protected int checkJMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshJ is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshJ() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginJ
			                 ,J_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("j", beginJ,J_LEN);
    }
   	}




}
  
