package com.cloudframe.app.ip666030.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:23. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginStartCf800;
            protected  int beginEndCf800;
            protected  int beginLeftCf800;
            protected  int beginRightCf800;
            protected  int beginMedianCf800;
	
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
  
  
  
  
  
  
  
             beginStartCf800 = getStartOffset() + 0;	// set offset for serialization
  
             beginEndCf800 = getStartOffset() + 4;	// set offset for serialization
  
             beginLeftCf800 = getStartOffset() + 8;	// set offset for serialization
  
             beginRightCf800 = getStartOffset() + 12;	// set offset for serialization
  
             beginMedianCf800 = getStartOffset() + 16;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIsItTheFirstTime100Counter = -1;
     public boolean isIsItTheFirstTime100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsItTheFirstTime100Counter != sharedCounter;
         localIsItTheFirstTime100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsItTheFirstTime100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localPgmIp666030300Counter = -1;
     public boolean isPgmIp666030300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp666030300Counter != sharedCounter;
         localPgmIp666030300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp666030300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
         int localStart400Counter = -1;
         public boolean isStart400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localStart400Counter != sharedCounter;
            localStart400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkStart400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localMedian400Counter = -1;
         public boolean isMedian400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMedian400Counter != sharedCounter;
            localMedian400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMedian400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localEnd400Counter = -1;
         public boolean isEnd400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEnd400Counter != sharedCounter;
            localEnd400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkEnd400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localPtrIp666030800Counter = -1;
     public boolean isPtrIp666030800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp666030800Counter != sharedCounter;
         localPtrIp666030800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp666030800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTagTemp800Counter = -1;
     public boolean isTagTemp800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagTemp800Counter != sharedCounter;
         localTagTemp800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTagTemp800Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
     int localStartCf800Counter = -1;
     public boolean isStartCf800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStartCf800Counter != sharedCounter;
         localStartCf800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of startCf800
	 *	@return startCf800
	 */
	public char[]  getStartCf800String() {
	     return getCharArray(beginStartCf800,START_CF_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean startCf800IsNumeric() {
	    return isNumeric(beginStartCf800
	                    ,beginStartCf800 + START_CF_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int START_CF_800_LEN = 4;
  	/**
	 * serializeStartCf800
	 */
	protected void serializeStartCf800(int startCf800) {
		 putNumber(beginStartCf800,startCf800,START_CF_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localStartCf800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeStartCf800
	 */
   	protected  int serializeStartCf800(char[] value) {
	    int  startCf800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    startCf800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginStartCf800
		       ,4
		      );
		 localStartCf800Counter = shareString.getSerializedField().getModifiedCounter();
		return  startCf800;
    }

   protected int checkStartCf800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshStartCf800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshStartCf800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginStartCf800
			                 ,START_CF_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("startCf800", beginStartCf800,START_CF_800_LEN);
    }
   	}
     int localEndCf800Counter = -1;
     public boolean isEndCf800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndCf800Counter != sharedCounter;
         localEndCf800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of endCf800
	 *	@return endCf800
	 */
	public char[]  getEndCf800String() {
	     return getCharArray(beginEndCf800,END_CF_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean endCf800IsNumeric() {
	    return isNumeric(beginEndCf800
	                    ,beginEndCf800 + END_CF_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int END_CF_800_LEN = 4;
  	/**
	 * serializeEndCf800
	 */
	protected void serializeEndCf800(int endCf800) {
		 putNumber(beginEndCf800,endCf800,END_CF_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEndCf800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEndCf800
	 */
   	protected  int serializeEndCf800(char[] value) {
	    int  endCf800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    endCf800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginEndCf800
		       ,4
		      );
		 localEndCf800Counter = shareString.getSerializedField().getModifiedCounter();
		return  endCf800;
    }

   protected int checkEndCf800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshEndCf800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEndCf800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginEndCf800
			                 ,END_CF_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("endCf800", beginEndCf800,END_CF_800_LEN);
    }
   	}
     int localLeftCf800Counter = -1;
     public boolean isLeftCf800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLeftCf800Counter != sharedCounter;
         localLeftCf800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of leftCf800
	 *	@return leftCf800
	 */
	public char[]  getLeftCf800String() {
	     return getCharArray(beginLeftCf800,LEFT_CF_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean leftCf800IsNumeric() {
	    return isNumeric(beginLeftCf800
	                    ,beginLeftCf800 + LEFT_CF_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LEFT_CF_800_LEN = 4;
  	/**
	 * serializeLeftCf800
	 */
	protected void serializeLeftCf800(int leftCf800) {
		 putNumber(beginLeftCf800,leftCf800,LEFT_CF_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLeftCf800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLeftCf800
	 */
   	protected  int serializeLeftCf800(char[] value) {
	    int  leftCf800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    leftCf800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginLeftCf800
		       ,4
		      );
		 localLeftCf800Counter = shareString.getSerializedField().getModifiedCounter();
		return  leftCf800;
    }

   protected int checkLeftCf800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLeftCf800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLeftCf800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginLeftCf800
			                 ,LEFT_CF_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("leftCf800", beginLeftCf800,LEFT_CF_800_LEN);
    }
   	}
     int localRightCf800Counter = -1;
     public boolean isRightCf800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRightCf800Counter != sharedCounter;
         localRightCf800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rightCf800
	 *	@return rightCf800
	 */
	public char[]  getRightCf800String() {
	     return getCharArray(beginRightCf800,RIGHT_CF_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rightCf800IsNumeric() {
	    return isNumeric(beginRightCf800
	                    ,beginRightCf800 + RIGHT_CF_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RIGHT_CF_800_LEN = 4;
  	/**
	 * serializeRightCf800
	 */
	protected void serializeRightCf800(int rightCf800) {
		 putNumber(beginRightCf800,rightCf800,RIGHT_CF_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRightCf800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRightCf800
	 */
   	protected  int serializeRightCf800(char[] value) {
	    int  rightCf800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rightCf800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginRightCf800
		       ,4
		      );
		 localRightCf800Counter = shareString.getSerializedField().getModifiedCounter();
		return  rightCf800;
    }

   protected int checkRightCf800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRightCf800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRightCf800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRightCf800
			                 ,RIGHT_CF_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rightCf800", beginRightCf800,RIGHT_CF_800_LEN);
    }
   	}
     int localMedianCf800Counter = -1;
     public boolean isMedianCf800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMedianCf800Counter != sharedCounter;
         localMedianCf800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of medianCf800
	 *	@return medianCf800
	 */
	public char[]  getMedianCf800String() {
	     return getCharArray(beginMedianCf800,MEDIAN_CF_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean medianCf800IsNumeric() {
	    return isNumeric(beginMedianCf800
	                    ,beginMedianCf800 + MEDIAN_CF_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MEDIAN_CF_800_LEN = 4;
  	/**
	 * serializeMedianCf800
	 */
	protected void serializeMedianCf800(int medianCf800) {
		 putNumber(beginMedianCf800,medianCf800,MEDIAN_CF_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMedianCf800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMedianCf800
	 */
   	protected  int serializeMedianCf800(char[] value) {
	    int  medianCf800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    medianCf800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginMedianCf800
		       ,4
		      );
		 localMedianCf800Counter = shareString.getSerializedField().getModifiedCounter();
		return  medianCf800;
    }

   protected int checkMedianCf800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMedianCf800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMedianCf800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMedianCf800
			                 ,MEDIAN_CF_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("medianCf800", beginMedianCf800,MEDIAN_CF_800_LEN);
    }
   	}




}
  
