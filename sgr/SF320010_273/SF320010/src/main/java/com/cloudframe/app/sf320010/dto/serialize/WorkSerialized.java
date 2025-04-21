package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 47;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMciwinReturnCode;
            protected  int beginTempRecsWrittenCnt;
            protected  int beginWaDateMn9;
            protected  int beginWaDateDy9;
            protected  int beginWaDateYr9;
            protected  int beginWaTimeHh9;
            protected  int beginWaTimeMm9;
            protected  int beginWaTimeSs9;
            protected  int beginNumOne300;
            protected  int beginNumTwo300;
            protected  int beginNum6300;
            protected  int beginNum56300;
            protected  int beginEmailRecsWriteCnt400;
            protected  int beginEmailRptOpPageNo400;
            protected  int beginEmailRptOpLineNo400;
	
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
  
  
             beginMciwinReturnCode = getStartOffset() + 0;	// set offset for serialization
  
             beginTempRecsWrittenCnt = getStartOffset() + 4;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginWaDateMn9 = getStartOffset() + 13;	// set offset for serialization
  
             beginWaDateDy9 = getStartOffset() + 15;	// set offset for serialization
  
             beginWaDateYr9 = getStartOffset() + 17;	// set offset for serialization
  
             beginWaTimeHh9 = getStartOffset() + 19;	// set offset for serialization
  
             beginWaTimeMm9 = getStartOffset() + 21;	// set offset for serialization
  
             beginWaTimeSs9 = getStartOffset() + 23;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginNumOne300 = getStartOffset() + 25;	// set offset for serialization
  
             beginNumTwo300 = getStartOffset() + 26;	// set offset for serialization
  
             beginNum6300 = getStartOffset() + 27;	// set offset for serialization
  
             beginNum56300 = getStartOffset() + 28;	// set offset for serialization
  
  
             beginEmailRecsWriteCnt400 = getStartOffset() + 30;	// set offset for serialization
  
             beginEmailRptOpPageNo400 = getStartOffset() + 39;	// set offset for serialization
  
             beginEmailRptOpLineNo400 = getStartOffset() + 43;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localGeneralLogEofSwCounter = -1;
     public boolean isGeneralLogEofSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGeneralLogEofSwCounter != sharedCounter;
         localGeneralLogEofSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkGeneralLogEofSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localTempFileEofSwCounter = -1;
     public boolean isTempFileEofSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTempFileEofSwCounter != sharedCounter;
         localTempFileEofSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTempFileEofSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localMciwinReturnCodeCounter = -1;
     public boolean isMciwinReturnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciwinReturnCodeCounter != sharedCounter;
         localMciwinReturnCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mciwinReturnCode
	 *	@return mciwinReturnCode
	 */
	public char[]  getMciwinReturnCodeString() {
	     return getCharArray(beginMciwinReturnCode,MCIWIN_RETURN_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mciwinReturnCodeIsNumeric() {
	    return isNumeric(beginMciwinReturnCode
	                    ,beginMciwinReturnCode + MCIWIN_RETURN_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MCIWIN_RETURN_CODE_LEN = 4;
  	/**
	 * serializeMciwinReturnCode
	 */
	protected void serializeMciwinReturnCode(int mciwinReturnCode) {
		 putNumber(beginMciwinReturnCode,mciwinReturnCode,MCIWIN_RETURN_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMciwinReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMciwinReturnCode
	 */
   	protected  int serializeMciwinReturnCode(char[] value) {
	    int  mciwinReturnCode;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mciwinReturnCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginMciwinReturnCode
		       ,4
		      );
		 localMciwinReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  mciwinReturnCode;
    }

   protected int checkMciwinReturnCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMciwinReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMciwinReturnCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMciwinReturnCode
			                 ,MCIWIN_RETURN_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mciwinReturnCode", beginMciwinReturnCode,MCIWIN_RETURN_CODE_LEN);
    }
   	}
     int localTempRecsWrittenCntCounter = -1;
     public boolean isTempRecsWrittenCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTempRecsWrittenCntCounter != sharedCounter;
         localTempRecsWrittenCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tempRecsWrittenCnt
	 *	@return tempRecsWrittenCnt
	 */
	public char[]  getTempRecsWrittenCntString() {
	     return getCharArray(beginTempRecsWrittenCnt,TEMP_RECS_WRITTEN_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tempRecsWrittenCntIsNumeric() {
	    return isNumeric(beginTempRecsWrittenCnt
	                    ,beginTempRecsWrittenCnt + TEMP_RECS_WRITTEN_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TEMP_RECS_WRITTEN_CNT_LEN = 9;
  	/**
	 * serializeTempRecsWrittenCnt
	 */
	protected void serializeTempRecsWrittenCnt(long tempRecsWrittenCnt) {
		 putNumber(beginTempRecsWrittenCnt,tempRecsWrittenCnt,TEMP_RECS_WRITTEN_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTempRecsWrittenCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTempRecsWrittenCnt
	 */
   	protected  long serializeTempRecsWrittenCnt(char[] value) {
	    long  tempRecsWrittenCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tempRecsWrittenCnt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginTempRecsWrittenCnt
		       ,9
		      );
		 localTempRecsWrittenCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  tempRecsWrittenCnt;
    }

   protected long checkTempRecsWrittenCntMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTempRecsWrittenCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTempRecsWrittenCnt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTempRecsWrittenCnt
			                 ,TEMP_RECS_WRITTEN_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tempRecsWrittenCnt", beginTempRecsWrittenCnt,TEMP_RECS_WRITTEN_CNT_LEN);
    }
   	}
     int localMcwinProgramCounter = -1;
     public boolean isMcwinProgramModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcwinProgramCounter != sharedCounter;
         localMcwinProgramCounter = sharedCounter; return hasModified;
     }

   protected char[] checkMcwinProgramConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localRpC7LogDesc1Counter = -1;
     public boolean isRpC7LogDesc1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC7LogDesc1Counter != sharedCounter;
         localRpC7LogDesc1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC7LogDesc1Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC7LogDesc2Counter = -1;
     public boolean isRpC7LogDesc2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC7LogDesc2Counter != sharedCounter;
         localRpC7LogDesc2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC7LogDesc2Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC7LogDesc3Counter = -1;
     public boolean isRpC7LogDesc3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC7LogDesc3Counter != sharedCounter;
         localRpC7LogDesc3Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC7LogDesc3Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC7LogDesc4Counter = -1;
     public boolean isRpC7LogDesc4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC7LogDesc4Counter != sharedCounter;
         localRpC7LogDesc4Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC7LogDesc4Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC7LogDesc5Counter = -1;
     public boolean isRpC7LogDesc5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC7LogDesc5Counter != sharedCounter;
         localRpC7LogDesc5Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC7LogDesc5Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC7LogDesc6Counter = -1;
     public boolean isRpC7LogDesc6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC7LogDesc6Counter != sharedCounter;
         localRpC7LogDesc6Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC7LogDesc6Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC7LogDesc7Counter = -1;
     public boolean isRpC7LogDesc7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC7LogDesc7Counter != sharedCounter;
         localRpC7LogDesc7Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC7LogDesc7Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC7LogDesc8Counter = -1;
     public boolean isRpC7LogDesc8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC7LogDesc8Counter != sharedCounter;
         localRpC7LogDesc8Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC7LogDesc8Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC7LogDesc9Counter = -1;
     public boolean isRpC7LogDesc9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC7LogDesc9Counter != sharedCounter;
         localRpC7LogDesc9Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC7LogDesc9Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC7LogDescACounter = -1;
     public boolean isRpC7LogDescAModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC7LogDescACounter != sharedCounter;
         localRpC7LogDescACounter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC7LogDescAConstraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC8LogDesc1Counter = -1;
     public boolean isRpC8LogDesc1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8LogDesc1Counter != sharedCounter;
         localRpC8LogDesc1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC8LogDesc1Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC8LogDesc2Counter = -1;
     public boolean isRpC8LogDesc2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8LogDesc2Counter != sharedCounter;
         localRpC8LogDesc2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC8LogDesc2Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC8LogDesc3Counter = -1;
     public boolean isRpC8LogDesc3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8LogDesc3Counter != sharedCounter;
         localRpC8LogDesc3Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC8LogDesc3Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC8LogDesc4Counter = -1;
     public boolean isRpC8LogDesc4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8LogDesc4Counter != sharedCounter;
         localRpC8LogDesc4Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC8LogDesc4Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC8LogDesc5Counter = -1;
     public boolean isRpC8LogDesc5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8LogDesc5Counter != sharedCounter;
         localRpC8LogDesc5Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC8LogDesc5Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC8LogDesc6Counter = -1;
     public boolean isRpC8LogDesc6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8LogDesc6Counter != sharedCounter;
         localRpC8LogDesc6Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC8LogDesc6Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC8LogDesc7Counter = -1;
     public boolean isRpC8LogDesc7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8LogDesc7Counter != sharedCounter;
         localRpC8LogDesc7Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC8LogDesc7Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC8LogDesc8Counter = -1;
     public boolean isRpC8LogDesc8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8LogDesc8Counter != sharedCounter;
         localRpC8LogDesc8Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC8LogDesc8Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC8LogDescAlertCounter = -1;
     public boolean isRpC8LogDescAlertModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8LogDescAlertCounter != sharedCounter;
         localRpC8LogDescAlertCounter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC8LogDescAlertConstraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc1Counter = -1;
     public boolean isRpC9LogDesc1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc1Counter != sharedCounter;
         localRpC9LogDesc1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc1Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc2Counter = -1;
     public boolean isRpC9LogDesc2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc2Counter != sharedCounter;
         localRpC9LogDesc2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc2Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc3Counter = -1;
     public boolean isRpC9LogDesc3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc3Counter != sharedCounter;
         localRpC9LogDesc3Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc3Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc4Counter = -1;
     public boolean isRpC9LogDesc4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc4Counter != sharedCounter;
         localRpC9LogDesc4Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc4Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc5Counter = -1;
     public boolean isRpC9LogDesc5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc5Counter != sharedCounter;
         localRpC9LogDesc5Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc5Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc6Counter = -1;
     public boolean isRpC9LogDesc6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc6Counter != sharedCounter;
         localRpC9LogDesc6Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc6Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc7Counter = -1;
     public boolean isRpC9LogDesc7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc7Counter != sharedCounter;
         localRpC9LogDesc7Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc7Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc8Counter = -1;
     public boolean isRpC9LogDesc8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc8Counter != sharedCounter;
         localRpC9LogDesc8Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc8Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc9Counter = -1;
     public boolean isRpC9LogDesc9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc9Counter != sharedCounter;
         localRpC9LogDesc9Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc9Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc10Counter = -1;
     public boolean isRpC9LogDesc10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc10Counter != sharedCounter;
         localRpC9LogDesc10Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc10Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc11Counter = -1;
     public boolean isRpC9LogDesc11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc11Counter != sharedCounter;
         localRpC9LogDesc11Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc11Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc12Counter = -1;
     public boolean isRpC9LogDesc12Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc12Counter != sharedCounter;
         localRpC9LogDesc12Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc12Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc13Counter = -1;
     public boolean isRpC9LogDesc13Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc13Counter != sharedCounter;
         localRpC9LogDesc13Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc13Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc14Counter = -1;
     public boolean isRpC9LogDesc14Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc14Counter != sharedCounter;
         localRpC9LogDesc14Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc14Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc15Counter = -1;
     public boolean isRpC9LogDesc15Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc15Counter != sharedCounter;
         localRpC9LogDesc15Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc15Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc16Counter = -1;
     public boolean isRpC9LogDesc16Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc16Counter != sharedCounter;
         localRpC9LogDesc16Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc16Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc17Counter = -1;
     public boolean isRpC9LogDesc17Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc17Counter != sharedCounter;
         localRpC9LogDesc17Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc17Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc18Counter = -1;
     public boolean isRpC9LogDesc18Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc18Counter != sharedCounter;
         localRpC9LogDesc18Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc18Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc19Counter = -1;
     public boolean isRpC9LogDesc19Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc19Counter != sharedCounter;
         localRpC9LogDesc19Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc19Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc20Counter = -1;
     public boolean isRpC9LogDesc20Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc20Counter != sharedCounter;
         localRpC9LogDesc20Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc20Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc21Counter = -1;
     public boolean isRpC9LogDesc21Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc21Counter != sharedCounter;
         localRpC9LogDesc21Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc21Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc22Counter = -1;
     public boolean isRpC9LogDesc22Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc22Counter != sharedCounter;
         localRpC9LogDesc22Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc22Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc23Counter = -1;
     public boolean isRpC9LogDesc23Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc23Counter != sharedCounter;
         localRpC9LogDesc23Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc23Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc24Counter = -1;
     public boolean isRpC9LogDesc24Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc24Counter != sharedCounter;
         localRpC9LogDesc24Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc24Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc25Counter = -1;
     public boolean isRpC9LogDesc25Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc25Counter != sharedCounter;
         localRpC9LogDesc25Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc25Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpC9LogDesc26Counter = -1;
     public boolean isRpC9LogDesc26Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9LogDesc26Counter != sharedCounter;
         localRpC9LogDesc26Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9LogDesc26Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpUndefLogDescCounter = -1;
     public boolean isRpUndefLogDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpUndefLogDescCounter != sharedCounter;
         localRpUndefLogDescCounter = sharedCounter; return hasModified;
     }

   protected char[] checkRpUndefLogDescConstraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localRpEmailOpHeading3200Counter = -1;
     public boolean isRpEmailOpHeading3200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpEmailOpHeading3200Counter != sharedCounter;
         localRpEmailOpHeading3200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpEmailOpHeading3200Constraints(char[] value) {
   			return super.checkConstraints(value , 132 ,false, false);
   }
     int localRpBdHeading3Counter = -1;
     public boolean isRpBdHeading3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpBdHeading3Counter != sharedCounter;
         localRpBdHeading3Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpBdHeading3Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localRpOpHeading3Counter = -1;
     public boolean isRpOpHeading3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpOpHeading3Counter != sharedCounter;
         localRpOpHeading3Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpOpHeading3Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localRpMpDetail3Counter = -1;
     public boolean isRpMpDetail3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpDetail3Counter != sharedCounter;
         localRpMpDetail3Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpMpDetail3Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localRpPsHeading3Counter = -1;
     public boolean isRpPsHeading3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsHeading3Counter != sharedCounter;
         localRpPsHeading3Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpPsHeading3Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localRpPsHeading4Counter = -1;
     public boolean isRpPsHeading4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsHeading4Counter != sharedCounter;
         localRpPsHeading4Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpPsHeading4Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localRpC7Heading2Counter = -1;
     public boolean isRpC7Heading2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC7Heading2Counter != sharedCounter;
         localRpC7Heading2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC7Heading2Constraints(char[] value) {
   			return super.checkConstraints(value , 132 ,false, false);
   }
     int localRpC7Heading5Counter = -1;
     public boolean isRpC7Heading5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC7Heading5Counter != sharedCounter;
         localRpC7Heading5Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC7Heading5Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localRpC8Heading2Counter = -1;
     public boolean isRpC8Heading2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8Heading2Counter != sharedCounter;
         localRpC8Heading2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC8Heading2Constraints(char[] value) {
   			return super.checkConstraints(value , 132 ,false, false);
   }
     int localRpC8Heading4Counter = -1;
     public boolean isRpC8Heading4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8Heading4Counter != sharedCounter;
         localRpC8Heading4Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC8Heading4Constraints(char[] value) {
   			return super.checkConstraints(value , 97 ,false, false);
   }
     int localRpC8Heading5Counter = -1;
     public boolean isRpC8Heading5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC8Heading5Counter != sharedCounter;
         localRpC8Heading5Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC8Heading5Constraints(char[] value) {
   			return super.checkConstraints(value , 93 ,false, false);
   }
     int localRpC9Heading2Counter = -1;
     public boolean isRpC9Heading2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9Heading2Counter != sharedCounter;
         localRpC9Heading2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9Heading2Constraints(char[] value) {
   			return super.checkConstraints(value , 132 ,false, false);
   }
     int localRpC9Heading5Counter = -1;
     public boolean isRpC9Heading5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9Heading5Counter != sharedCounter;
         localRpC9Heading5Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRpC9Heading5Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
         int localCtRptBdLineNoCounter = -1;
         public boolean isCtRptBdLineNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtRptBdLineNoCounter != sharedCounter;
            localCtRptBdLineNoCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCtRptBdLineNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localCtRptBdPageNoCounter = -1;
         public boolean isCtRptBdPageNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtRptBdPageNoCounter != sharedCounter;
            localCtRptBdPageNoCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCtRptBdPageNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localCtRptOpLineNoCounter = -1;
         public boolean isCtRptOpLineNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtRptOpLineNoCounter != sharedCounter;
            localCtRptOpLineNoCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCtRptOpLineNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localCtRptOpPageNoCounter = -1;
         public boolean isCtRptOpPageNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtRptOpPageNoCounter != sharedCounter;
            localCtRptOpPageNoCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCtRptOpPageNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localCtRptMpLineNoCounter = -1;
         public boolean isCtRptMpLineNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtRptMpLineNoCounter != sharedCounter;
            localCtRptMpLineNoCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCtRptMpLineNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localCtRptMpPageNoCounter = -1;
         public boolean isCtRptMpPageNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtRptMpPageNoCounter != sharedCounter;
            localCtRptMpPageNoCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCtRptMpPageNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localCtRptPsLineNoCounter = -1;
         public boolean isCtRptPsLineNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtRptPsLineNoCounter != sharedCounter;
            localCtRptPsLineNoCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCtRptPsLineNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localCtRptPsPageNoCounter = -1;
         public boolean isCtRptPsPageNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtRptPsPageNoCounter != sharedCounter;
            localCtRptPsPageNoCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCtRptPsPageNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localCtRptT2PageNoCounter = -1;
         public boolean isCtRptT2PageNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtRptT2PageNoCounter != sharedCounter;
            localCtRptT2PageNoCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCtRptT2PageNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localCtRptRcLineNoCounter = -1;
         public boolean isCtRptRcLineNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtRptRcLineNoCounter != sharedCounter;
            localCtRptRcLineNoCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCtRptRcLineNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localCtRptRcPageNoCounter = -1;
         public boolean isCtRptRcPageNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtRptRcPageNoCounter != sharedCounter;
            localCtRptRcPageNoCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCtRptRcPageNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localCtRptC9PageNoCounter = -1;
         public boolean isCtRptC9PageNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtRptC9PageNoCounter != sharedCounter;
            localCtRptC9PageNoCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCtRptC9PageNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localCtLogStatsCounter = -1;
         public boolean isCtLogStatsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtLogStatsCounter != sharedCounter;
            localCtLogStatsCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtLogStatsMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtLogBulkDataCounter = -1;
         public boolean isCtLogBulkDataModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtLogBulkDataCounter != sharedCounter;
            localCtLogBulkDataCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtLogBulkDataMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtLogBulkData32Counter = -1;
         public boolean isCtLogBulkData32Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtLogBulkData32Counter != sharedCounter;
            localCtLogBulkData32Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtLogBulkData32MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtLogOperatorCounter = -1;
         public boolean isCtLogOperatorModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtLogOperatorCounter != sharedCounter;
            localCtLogOperatorCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtLogOperatorMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtLogMipProfileCounter = -1;
         public boolean isCtLogMipProfileModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtLogMipProfileCounter != sharedCounter;
            localCtLogMipProfileCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtLogMipProfileMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtLogPosCounter = -1;
         public boolean isCtLogPosModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtLogPosCounter != sharedCounter;
            localCtLogPosCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtLogPosMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtLogTypeiiCounter = -1;
         public boolean isCtLogTypeiiModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtLogTypeiiCounter != sharedCounter;
            localCtLogTypeiiCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtLogTypeiiMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtLogRemConsCounter = -1;
         public boolean isCtLogRemConsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtLogRemConsCounter != sharedCounter;
            localCtLogRemConsCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtLogRemConsMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtLogX92Counter = -1;
         public boolean isCtLogX92Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtLogX92Counter != sharedCounter;
            localCtLogX92Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtLogX92MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtLogEdcCounter = -1;
         public boolean isCtLogEdcModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtLogEdcCounter != sharedCounter;
            localCtLogEdcCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtLogEdcMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtLogChkCounter = -1;
         public boolean isCtLogChkModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtLogChkCounter != sharedCounter;
            localCtLogChkCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtLogChkMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtLogOtherCounter = -1;
         public boolean isCtLogOtherModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtLogOtherCounter != sharedCounter;
            localCtLogOtherCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtLogOtherMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC7LogType1Counter = -1;
         public boolean isCtC7LogType1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC7LogType1Counter != sharedCounter;
            localCtC7LogType1Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC7LogType1MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC7LogType2Counter = -1;
         public boolean isCtC7LogType2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC7LogType2Counter != sharedCounter;
            localCtC7LogType2Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC7LogType2MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC7LogType3Counter = -1;
         public boolean isCtC7LogType3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC7LogType3Counter != sharedCounter;
            localCtC7LogType3Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC7LogType3MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC7LogType4Counter = -1;
         public boolean isCtC7LogType4Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC7LogType4Counter != sharedCounter;
            localCtC7LogType4Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC7LogType4MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC7LogType5Counter = -1;
         public boolean isCtC7LogType5Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC7LogType5Counter != sharedCounter;
            localCtC7LogType5Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC7LogType5MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC7LogType6Counter = -1;
         public boolean isCtC7LogType6Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC7LogType6Counter != sharedCounter;
            localCtC7LogType6Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC7LogType6MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC7LogType7Counter = -1;
         public boolean isCtC7LogType7Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC7LogType7Counter != sharedCounter;
            localCtC7LogType7Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC7LogType7MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC7LogType8Counter = -1;
         public boolean isCtC7LogType8Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC7LogType8Counter != sharedCounter;
            localCtC7LogType8Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC7LogType8MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC7LogType9Counter = -1;
         public boolean isCtC7LogType9Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC7LogType9Counter != sharedCounter;
            localCtC7LogType9Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC7LogType9MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC7LogTypeACounter = -1;
         public boolean isCtC7LogTypeAModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC7LogTypeACounter != sharedCounter;
            localCtC7LogTypeACounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC7LogTypeAMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC7UndefLogTypeCounter = -1;
         public boolean isCtC7UndefLogTypeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC7UndefLogTypeCounter != sharedCounter;
            localCtC7UndefLogTypeCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC7UndefLogTypeMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC8LogType1Counter = -1;
         public boolean isCtC8LogType1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC8LogType1Counter != sharedCounter;
            localCtC8LogType1Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC8LogType1MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC8LogType2Counter = -1;
         public boolean isCtC8LogType2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC8LogType2Counter != sharedCounter;
            localCtC8LogType2Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC8LogType2MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC8LogType3Counter = -1;
         public boolean isCtC8LogType3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC8LogType3Counter != sharedCounter;
            localCtC8LogType3Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC8LogType3MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC8LogType4Counter = -1;
         public boolean isCtC8LogType4Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC8LogType4Counter != sharedCounter;
            localCtC8LogType4Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC8LogType4MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC8LogType5Counter = -1;
         public boolean isCtC8LogType5Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC8LogType5Counter != sharedCounter;
            localCtC8LogType5Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC8LogType5MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC8LogType6Counter = -1;
         public boolean isCtC8LogType6Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC8LogType6Counter != sharedCounter;
            localCtC8LogType6Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC8LogType6MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC8LogType7Counter = -1;
         public boolean isCtC8LogType7Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC8LogType7Counter != sharedCounter;
            localCtC8LogType7Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC8LogType7MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC8LogType8Counter = -1;
         public boolean isCtC8LogType8Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC8LogType8Counter != sharedCounter;
            localCtC8LogType8Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC8LogType8MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC8LogTypeAlertCounter = -1;
         public boolean isCtC8LogTypeAlertModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC8LogTypeAlertCounter != sharedCounter;
            localCtC8LogTypeAlertCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC8LogTypeAlertMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC8UndefLogTypeCounter = -1;
         public boolean isCtC8UndefLogTypeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC8UndefLogTypeCounter != sharedCounter;
            localCtC8UndefLogTypeCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC8UndefLogTypeMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType1Counter = -1;
         public boolean isCtC9LogType1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType1Counter != sharedCounter;
            localCtC9LogType1Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType1MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType2Counter = -1;
         public boolean isCtC9LogType2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType2Counter != sharedCounter;
            localCtC9LogType2Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType2MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType3Counter = -1;
         public boolean isCtC9LogType3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType3Counter != sharedCounter;
            localCtC9LogType3Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType3MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType4Counter = -1;
         public boolean isCtC9LogType4Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType4Counter != sharedCounter;
            localCtC9LogType4Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType4MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType5Counter = -1;
         public boolean isCtC9LogType5Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType5Counter != sharedCounter;
            localCtC9LogType5Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType5MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType6Counter = -1;
         public boolean isCtC9LogType6Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType6Counter != sharedCounter;
            localCtC9LogType6Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType6MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType7Counter = -1;
         public boolean isCtC9LogType7Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType7Counter != sharedCounter;
            localCtC9LogType7Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType7MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType8Counter = -1;
         public boolean isCtC9LogType8Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType8Counter != sharedCounter;
            localCtC9LogType8Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType8MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType9Counter = -1;
         public boolean isCtC9LogType9Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType9Counter != sharedCounter;
            localCtC9LogType9Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType9MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType10Counter = -1;
         public boolean isCtC9LogType10Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType10Counter != sharedCounter;
            localCtC9LogType10Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType10MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType11Counter = -1;
         public boolean isCtC9LogType11Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType11Counter != sharedCounter;
            localCtC9LogType11Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType11MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType12Counter = -1;
         public boolean isCtC9LogType12Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType12Counter != sharedCounter;
            localCtC9LogType12Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType12MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType13Counter = -1;
         public boolean isCtC9LogType13Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType13Counter != sharedCounter;
            localCtC9LogType13Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType13MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType14Counter = -1;
         public boolean isCtC9LogType14Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType14Counter != sharedCounter;
            localCtC9LogType14Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType14MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType15Counter = -1;
         public boolean isCtC9LogType15Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType15Counter != sharedCounter;
            localCtC9LogType15Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType15MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType16Counter = -1;
         public boolean isCtC9LogType16Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType16Counter != sharedCounter;
            localCtC9LogType16Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType16MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType17Counter = -1;
         public boolean isCtC9LogType17Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType17Counter != sharedCounter;
            localCtC9LogType17Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType17MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType18Counter = -1;
         public boolean isCtC9LogType18Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType18Counter != sharedCounter;
            localCtC9LogType18Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType18MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType19Counter = -1;
         public boolean isCtC9LogType19Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType19Counter != sharedCounter;
            localCtC9LogType19Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType19MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType20Counter = -1;
         public boolean isCtC9LogType20Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType20Counter != sharedCounter;
            localCtC9LogType20Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType20MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType21Counter = -1;
         public boolean isCtC9LogType21Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType21Counter != sharedCounter;
            localCtC9LogType21Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType21MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType22Counter = -1;
         public boolean isCtC9LogType22Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType22Counter != sharedCounter;
            localCtC9LogType22Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType22MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType23Counter = -1;
         public boolean isCtC9LogType23Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType23Counter != sharedCounter;
            localCtC9LogType23Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType23MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType24Counter = -1;
         public boolean isCtC9LogType24Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType24Counter != sharedCounter;
            localCtC9LogType24Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType24MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType25Counter = -1;
         public boolean isCtC9LogType25Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType25Counter != sharedCounter;
            localCtC9LogType25Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType25MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9LogType26Counter = -1;
         public boolean isCtC9LogType26Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9LogType26Counter != sharedCounter;
            localCtC9LogType26Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9LogType26MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCtC9UndefLogTypeCounter = -1;
         public boolean isCtC9UndefLogTypeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCtC9UndefLogTypeCounter != sharedCounter;
            localCtC9UndefLogTypeCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCtC9UndefLogTypeMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localWaDateMn9Counter = -1;
     public boolean isWaDateMn9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaDateMn9Counter != sharedCounter;
         localWaDateMn9Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of waDateMn9
	 *	@return waDateMn9
	 */
	public char[]  getWaDateMn9String() {
	     return getCharArray(beginWaDateMn9,WA_DATE_MN_9_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean waDateMn9IsNumeric() {
	    return isNumeric(beginWaDateMn9
	                    ,beginWaDateMn9 + WA_DATE_MN_9_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WA_DATE_MN_9_LEN = 2;
  	/**
	 * serializeWaDateMn9
	 */
	protected void serializeWaDateMn9(int waDateMn9) {
		 putNumber(beginWaDateMn9,waDateMn9,WA_DATE_MN_9_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWaDateMn9Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWaDateMn9
	 */
   	protected  int serializeWaDateMn9(char[] value) {
	    int  waDateMn9;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    waDateMn9 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWaDateMn9
		       ,2
		      );
		 localWaDateMn9Counter = shareString.getSerializedField().getModifiedCounter();
		return  waDateMn9;
    }

   protected int checkWaDateMn9MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWaDateMn9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWaDateMn9() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWaDateMn9
			                 ,WA_DATE_MN_9_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("waDateMn9", beginWaDateMn9,WA_DATE_MN_9_LEN);
    }
   	}
     int localWaDateDy9Counter = -1;
     public boolean isWaDateDy9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaDateDy9Counter != sharedCounter;
         localWaDateDy9Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of waDateDy9
	 *	@return waDateDy9
	 */
	public char[]  getWaDateDy9String() {
	     return getCharArray(beginWaDateDy9,WA_DATE_DY_9_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean waDateDy9IsNumeric() {
	    return isNumeric(beginWaDateDy9
	                    ,beginWaDateDy9 + WA_DATE_DY_9_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WA_DATE_DY_9_LEN = 2;
  	/**
	 * serializeWaDateDy9
	 */
	protected void serializeWaDateDy9(int waDateDy9) {
		 putNumber(beginWaDateDy9,waDateDy9,WA_DATE_DY_9_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWaDateDy9Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWaDateDy9
	 */
   	protected  int serializeWaDateDy9(char[] value) {
	    int  waDateDy9;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    waDateDy9 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWaDateDy9
		       ,2
		      );
		 localWaDateDy9Counter = shareString.getSerializedField().getModifiedCounter();
		return  waDateDy9;
    }

   protected int checkWaDateDy9MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWaDateDy9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWaDateDy9() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWaDateDy9
			                 ,WA_DATE_DY_9_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("waDateDy9", beginWaDateDy9,WA_DATE_DY_9_LEN);
    }
   	}
     int localWaDateYr9Counter = -1;
     public boolean isWaDateYr9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaDateYr9Counter != sharedCounter;
         localWaDateYr9Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of waDateYr9
	 *	@return waDateYr9
	 */
	public char[]  getWaDateYr9String() {
	     return getCharArray(beginWaDateYr9,WA_DATE_YR_9_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean waDateYr9IsNumeric() {
	    return isNumeric(beginWaDateYr9
	                    ,beginWaDateYr9 + WA_DATE_YR_9_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WA_DATE_YR_9_LEN = 2;
  	/**
	 * serializeWaDateYr9
	 */
	protected void serializeWaDateYr9(int waDateYr9) {
		 putNumber(beginWaDateYr9,waDateYr9,WA_DATE_YR_9_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWaDateYr9Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWaDateYr9
	 */
   	protected  int serializeWaDateYr9(char[] value) {
	    int  waDateYr9;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    waDateYr9 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWaDateYr9
		       ,2
		      );
		 localWaDateYr9Counter = shareString.getSerializedField().getModifiedCounter();
		return  waDateYr9;
    }

   protected int checkWaDateYr9MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWaDateYr9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWaDateYr9() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWaDateYr9
			                 ,WA_DATE_YR_9_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("waDateYr9", beginWaDateYr9,WA_DATE_YR_9_LEN);
    }
   	}
     int localWaTimeHh9Counter = -1;
     public boolean isWaTimeHh9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaTimeHh9Counter != sharedCounter;
         localWaTimeHh9Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of waTimeHh9
	 *	@return waTimeHh9
	 */
	public char[]  getWaTimeHh9String() {
	     return getCharArray(beginWaTimeHh9,WA_TIME_HH_9_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean waTimeHh9IsNumeric() {
	    return isNumeric(beginWaTimeHh9
	                    ,beginWaTimeHh9 + WA_TIME_HH_9_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WA_TIME_HH_9_LEN = 2;
  	/**
	 * serializeWaTimeHh9
	 */
	protected void serializeWaTimeHh9(int waTimeHh9) {
		 putNumber(beginWaTimeHh9,waTimeHh9,WA_TIME_HH_9_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWaTimeHh9Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWaTimeHh9
	 */
   	protected  int serializeWaTimeHh9(char[] value) {
	    int  waTimeHh9;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    waTimeHh9 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWaTimeHh9
		       ,2
		      );
		 localWaTimeHh9Counter = shareString.getSerializedField().getModifiedCounter();
		return  waTimeHh9;
    }

   protected int checkWaTimeHh9MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWaTimeHh9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWaTimeHh9() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWaTimeHh9
			                 ,WA_TIME_HH_9_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("waTimeHh9", beginWaTimeHh9,WA_TIME_HH_9_LEN);
    }
   	}
     int localWaTimeMm9Counter = -1;
     public boolean isWaTimeMm9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaTimeMm9Counter != sharedCounter;
         localWaTimeMm9Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of waTimeMm9
	 *	@return waTimeMm9
	 */
	public char[]  getWaTimeMm9String() {
	     return getCharArray(beginWaTimeMm9,WA_TIME_MM_9_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean waTimeMm9IsNumeric() {
	    return isNumeric(beginWaTimeMm9
	                    ,beginWaTimeMm9 + WA_TIME_MM_9_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WA_TIME_MM_9_LEN = 2;
  	/**
	 * serializeWaTimeMm9
	 */
	protected void serializeWaTimeMm9(int waTimeMm9) {
		 putNumber(beginWaTimeMm9,waTimeMm9,WA_TIME_MM_9_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWaTimeMm9Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWaTimeMm9
	 */
   	protected  int serializeWaTimeMm9(char[] value) {
	    int  waTimeMm9;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    waTimeMm9 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWaTimeMm9
		       ,2
		      );
		 localWaTimeMm9Counter = shareString.getSerializedField().getModifiedCounter();
		return  waTimeMm9;
    }

   protected int checkWaTimeMm9MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWaTimeMm9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWaTimeMm9() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWaTimeMm9
			                 ,WA_TIME_MM_9_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("waTimeMm9", beginWaTimeMm9,WA_TIME_MM_9_LEN);
    }
   	}
     int localWaTimeSs9Counter = -1;
     public boolean isWaTimeSs9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaTimeSs9Counter != sharedCounter;
         localWaTimeSs9Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of waTimeSs9
	 *	@return waTimeSs9
	 */
	public char[]  getWaTimeSs9String() {
	     return getCharArray(beginWaTimeSs9,WA_TIME_SS_9_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean waTimeSs9IsNumeric() {
	    return isNumeric(beginWaTimeSs9
	                    ,beginWaTimeSs9 + WA_TIME_SS_9_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WA_TIME_SS_9_LEN = 2;
  	/**
	 * serializeWaTimeSs9
	 */
	protected void serializeWaTimeSs9(int waTimeSs9) {
		 putNumber(beginWaTimeSs9,waTimeSs9,WA_TIME_SS_9_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWaTimeSs9Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWaTimeSs9
	 */
   	protected  int serializeWaTimeSs9(char[] value) {
	    int  waTimeSs9;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    waTimeSs9 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWaTimeSs9
		       ,2
		      );
		 localWaTimeSs9Counter = shareString.getSerializedField().getModifiedCounter();
		return  waTimeSs9;
    }

   protected int checkWaTimeSs9MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWaTimeSs9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWaTimeSs9() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWaTimeSs9
			                 ,WA_TIME_SS_9_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("waTimeSs9", beginWaTimeSs9,WA_TIME_SS_9_LEN);
    }
   	}
     int localFirstT2RcdIndCounter = -1;
     public boolean isFirstT2RcdIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFirstT2RcdIndCounter != sharedCounter;
         localFirstT2RcdIndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFirstT2RcdIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localFirstX92RcdIndCounter = -1;
     public boolean isFirstX92RcdIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFirstX92RcdIndCounter != sharedCounter;
         localFirstX92RcdIndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFirstX92RcdIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSecurityAlertFlagCounter = -1;
     public boolean isSecurityAlertFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSecurityAlertFlagCounter != sharedCounter;
         localSecurityAlertFlagCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSecurityAlertFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localPrevT2SortMipIdCounter = -1;
     public boolean isPrevT2SortMipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrevT2SortMipIdCounter != sharedCounter;
         localPrevT2SortMipIdCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPrevT2SortMipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localPrevRcRemoteMipIdCounter = -1;
     public boolean isPrevRcRemoteMipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrevRcRemoteMipIdCounter != sharedCounter;
         localPrevRcRemoteMipIdCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPrevRcRemoteMipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localPrevX92SortMipIdCounter = -1;
     public boolean isPrevX92SortMipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrevX92SortMipIdCounter != sharedCounter;
         localPrevX92SortMipIdCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPrevX92SortMipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localPrevT2SortDateCounter = -1;
     public boolean isPrevT2SortDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrevT2SortDateCounter != sharedCounter;
         localPrevT2SortDateCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPrevT2SortDateConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localPrevX92SortDateCounter = -1;
     public boolean isPrevX92SortDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrevX92SortDateCounter != sharedCounter;
         localPrevX92SortDateCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPrevX92SortDateConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localCompileDateCounter = -1;
     public boolean isCompileDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompileDateCounter != sharedCounter;
         localCompileDateCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCompileDateConstraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
     int localOtherGlogClass100Counter = -1;
     public boolean isOtherGlogClass100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOtherGlogClass100Counter != sharedCounter;
         localOtherGlogClass100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOtherGlogClass100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localLit8300Counter = -1;
     public boolean isLit8300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit8300Counter != sharedCounter;
         localLit8300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit8300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localLit04300Counter = -1;
     public boolean isLit04300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit04300Counter != sharedCounter;
         localLit04300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit04300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLit20300Counter = -1;
     public boolean isLit20300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit20300Counter != sharedCounter;
         localLit20300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit20300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localCharBb300Counter = -1;
     public boolean isCharBb300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharBb300Counter != sharedCounter;
         localCharBb300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCharBb300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localChar9134a300Counter = -1;
     public boolean isChar9134a300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChar9134a300Counter != sharedCounter;
         localChar9134a300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkChar9134a300Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
     int localNumOne300Counter = -1;
     public boolean isNumOne300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNumOne300Counter != sharedCounter;
         localNumOne300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of numOne300
	 *	@return numOne300
	 */
	public char[]  getNumOne300String() {
	     return getCharArray(beginNumOne300,NUM_ONE_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean numOne300IsNumeric() {
	    return isNumeric(beginNumOne300
	                    ,beginNumOne300 + NUM_ONE_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUM_ONE_300_LEN = 1;
  	/**
	 * serializeNumOne300
	 */
	protected void serializeNumOne300(int numOne300) {
		 putNumber(beginNumOne300,numOne300,NUM_ONE_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNumOne300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNumOne300
	 */
   	protected  int serializeNumOne300(char[] value) {
	    int  numOne300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    numOne300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginNumOne300
		       ,1
		      );
		 localNumOne300Counter = shareString.getSerializedField().getModifiedCounter();
		return  numOne300;
    }

   protected int checkNumOne300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNumOne300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNumOne300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNumOne300
			                 ,NUM_ONE_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("numOne300", beginNumOne300,NUM_ONE_300_LEN);
    }
   	}
     int localNumTwo300Counter = -1;
     public boolean isNumTwo300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNumTwo300Counter != sharedCounter;
         localNumTwo300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of numTwo300
	 *	@return numTwo300
	 */
	public char[]  getNumTwo300String() {
	     return getCharArray(beginNumTwo300,NUM_TWO_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean numTwo300IsNumeric() {
	    return isNumeric(beginNumTwo300
	                    ,beginNumTwo300 + NUM_TWO_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUM_TWO_300_LEN = 1;
  	/**
	 * serializeNumTwo300
	 */
	protected void serializeNumTwo300(int numTwo300) {
		 putNumber(beginNumTwo300,numTwo300,NUM_TWO_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNumTwo300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNumTwo300
	 */
   	protected  int serializeNumTwo300(char[] value) {
	    int  numTwo300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    numTwo300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginNumTwo300
		       ,1
		      );
		 localNumTwo300Counter = shareString.getSerializedField().getModifiedCounter();
		return  numTwo300;
    }

   protected int checkNumTwo300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNumTwo300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNumTwo300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNumTwo300
			                 ,NUM_TWO_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("numTwo300", beginNumTwo300,NUM_TWO_300_LEN);
    }
   	}
     int localNum6300Counter = -1;
     public boolean isNum6300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNum6300Counter != sharedCounter;
         localNum6300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of num6300
	 *	@return num6300
	 */
	public char[]  getNum6300String() {
	     return getCharArray(beginNum6300,NUM_6300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num6300IsNumeric() {
	    return isNumeric(beginNum6300
	                    ,beginNum6300 + NUM_6300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUM_6300_LEN = 1;
  	/**
	 * serializeNum6300
	 */
	protected void serializeNum6300(int num6300) {
		 putNumber(beginNum6300,num6300,NUM_6300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNum6300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNum6300
	 */
   	protected  int serializeNum6300(char[] value) {
	    int  num6300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    num6300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginNum6300
		       ,1
		      );
		 localNum6300Counter = shareString.getSerializedField().getModifiedCounter();
		return  num6300;
    }

   protected int checkNum6300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNum6300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNum6300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNum6300
			                 ,NUM_6300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("num6300", beginNum6300,NUM_6300_LEN);
    }
   	}
     int localNum56300Counter = -1;
     public boolean isNum56300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNum56300Counter != sharedCounter;
         localNum56300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of num56300
	 *	@return num56300
	 */
	public char[]  getNum56300String() {
	     return getCharArray(beginNum56300,NUM_56300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num56300IsNumeric() {
	    return isNumeric(beginNum56300
	                    ,beginNum56300 + NUM_56300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUM_56300_LEN = 2;
  	/**
	 * serializeNum56300
	 */
	protected void serializeNum56300(int num56300) {
		 putNumber(beginNum56300,num56300,NUM_56300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNum56300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNum56300
	 */
   	protected  int serializeNum56300(char[] value) {
	    int  num56300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    num56300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginNum56300
		       ,2
		      );
		 localNum56300Counter = shareString.getSerializedField().getModifiedCounter();
		return  num56300;
    }

   protected int checkNum56300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNum56300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNum56300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNum56300
			                 ,NUM_56300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("num56300", beginNum56300,NUM_56300_LEN);
    }
   	}
         int localSys001Lrecl400Counter = -1;
         public boolean isSys001Lrecl400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSys001Lrecl400Counter != sharedCounter;
            localSys001Lrecl400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSys001Lrecl400MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localEmailRecsWriteCnt400Counter = -1;
     public boolean isEmailRecsWriteCnt400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEmailRecsWriteCnt400Counter != sharedCounter;
         localEmailRecsWriteCnt400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of emailRecsWriteCnt400
	 *	@return emailRecsWriteCnt400
	 */
	public char[]  getEmailRecsWriteCnt400String() {
	     return getCharArray(beginEmailRecsWriteCnt400,EMAIL_RECS_WRITE_CNT_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean emailRecsWriteCnt400IsNumeric() {
	    return isNumeric(beginEmailRecsWriteCnt400
	                    ,beginEmailRecsWriteCnt400 + EMAIL_RECS_WRITE_CNT_400_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EMAIL_RECS_WRITE_CNT_400_LEN = 9;
  	/**
	 * serializeEmailRecsWriteCnt400
	 */
	protected void serializeEmailRecsWriteCnt400(int emailRecsWriteCnt400) {
		 putNumber(beginEmailRecsWriteCnt400,emailRecsWriteCnt400,EMAIL_RECS_WRITE_CNT_400_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEmailRecsWriteCnt400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEmailRecsWriteCnt400
	 */
   	protected  int serializeEmailRecsWriteCnt400(char[] value) {
	    int  emailRecsWriteCnt400;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    emailRecsWriteCnt400 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginEmailRecsWriteCnt400
		       ,9
		      );
		 localEmailRecsWriteCnt400Counter = shareString.getSerializedField().getModifiedCounter();
		return  emailRecsWriteCnt400;
    }

   protected int checkEmailRecsWriteCnt400MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshEmailRecsWriteCnt400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEmailRecsWriteCnt400() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginEmailRecsWriteCnt400
			                 ,EMAIL_RECS_WRITE_CNT_400_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("emailRecsWriteCnt400", beginEmailRecsWriteCnt400,EMAIL_RECS_WRITE_CNT_400_LEN);
    }
   	}
     int localEmailRptOpPageNo400Counter = -1;
     public boolean isEmailRptOpPageNo400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEmailRptOpPageNo400Counter != sharedCounter;
         localEmailRptOpPageNo400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of emailRptOpPageNo400
	 *	@return emailRptOpPageNo400
	 */
	public char[]  getEmailRptOpPageNo400String() {
	     return getCharArray(beginEmailRptOpPageNo400,EMAIL_RPT_OP_PAGE_NO_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean emailRptOpPageNo400IsNumeric() {
	    return isNumeric(beginEmailRptOpPageNo400
	                    ,beginEmailRptOpPageNo400 + EMAIL_RPT_OP_PAGE_NO_400_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EMAIL_RPT_OP_PAGE_NO_400_LEN = 4;
  	/**
	 * serializeEmailRptOpPageNo400
	 */
	protected void serializeEmailRptOpPageNo400(short emailRptOpPageNo400) {
		 putNumber(beginEmailRptOpPageNo400,emailRptOpPageNo400,EMAIL_RPT_OP_PAGE_NO_400_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEmailRptOpPageNo400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEmailRptOpPageNo400
	 */
   	protected  short serializeEmailRptOpPageNo400(char[] value) {
	    short  emailRptOpPageNo400;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    emailRptOpPageNo400 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginEmailRptOpPageNo400
		       ,4
		      );
		 localEmailRptOpPageNo400Counter = shareString.getSerializedField().getModifiedCounter();
		return  emailRptOpPageNo400;
    }

   protected short checkEmailRptOpPageNo400MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshEmailRptOpPageNo400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshEmailRptOpPageNo400() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginEmailRptOpPageNo400
			                 ,EMAIL_RPT_OP_PAGE_NO_400_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("emailRptOpPageNo400", beginEmailRptOpPageNo400,EMAIL_RPT_OP_PAGE_NO_400_LEN);
    }
   	}
     int localEmailRptOpLineNo400Counter = -1;
     public boolean isEmailRptOpLineNo400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEmailRptOpLineNo400Counter != sharedCounter;
         localEmailRptOpLineNo400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of emailRptOpLineNo400
	 *	@return emailRptOpLineNo400
	 */
	public char[]  getEmailRptOpLineNo400String() {
	     return getCharArray(beginEmailRptOpLineNo400,EMAIL_RPT_OP_LINE_NO_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean emailRptOpLineNo400IsNumeric() {
	    return isNumeric(beginEmailRptOpLineNo400
	                    ,beginEmailRptOpLineNo400 + EMAIL_RPT_OP_LINE_NO_400_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EMAIL_RPT_OP_LINE_NO_400_LEN = 4;
  	/**
	 * serializeEmailRptOpLineNo400
	 */
	protected void serializeEmailRptOpLineNo400(short emailRptOpLineNo400) {
		 putNumber(beginEmailRptOpLineNo400,emailRptOpLineNo400,EMAIL_RPT_OP_LINE_NO_400_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEmailRptOpLineNo400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEmailRptOpLineNo400
	 */
   	protected  short serializeEmailRptOpLineNo400(char[] value) {
	    short  emailRptOpLineNo400;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    emailRptOpLineNo400 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginEmailRptOpLineNo400
		       ,4
		      );
		 localEmailRptOpLineNo400Counter = shareString.getSerializedField().getModifiedCounter();
		return  emailRptOpLineNo400;
    }

   protected short checkEmailRptOpLineNo400MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshEmailRptOpLineNo400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshEmailRptOpLineNo400() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginEmailRptOpLineNo400
			                 ,EMAIL_RPT_OP_LINE_NO_400_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("emailRptOpLineNo400", beginEmailRptOpLineNo400,EMAIL_RPT_OP_LINE_NO_400_LEN);
    }
   	}




}
  
