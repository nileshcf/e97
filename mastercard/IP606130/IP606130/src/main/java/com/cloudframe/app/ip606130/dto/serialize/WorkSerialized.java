package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginValueOne300;
            protected  int beginValue11300;
            protected  int beginRegionMax400;
            protected  int beginTable36BslSub400;
            protected  int beginBsl1BuildCounter40090;
            protected  int beginBsl2BuildCounter40090;
            protected  int beginBsl1BuildCounter40091;
            protected  int beginBsl2BuildCounter40091;
            protected  int beginDefaultsBuild400;
            protected  int beginRecordsCount400;
            protected  int beginFinalRecords400;
            protected  int beginNoOfSortedRecs400;
	
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
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginValueOne300 = getStartOffset() + 0;	// set offset for serialization
  
             beginValue11300 = getStartOffset() + 1;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginRegionMax400 = getStartOffset() + 3;	// set offset for serialization
  
             beginTable36BslSub400 = getStartOffset() + 7;	// set offset for serialization
  
             beginBsl1BuildCounter40090 = getStartOffset() + 15;	// set offset for serialization
  
             beginBsl2BuildCounter40090 = getStartOffset() + 23;	// set offset for serialization
  
             beginBsl1BuildCounter40091 = getStartOffset() + 31;	// set offset for serialization
  
             beginBsl2BuildCounter40091 = getStartOffset() + 39;	// set offset for serialization
  
             beginDefaultsBuild400 = getStartOffset() + 47;	// set offset for serialization
  
             beginRecordsCount400 = getStartOffset() + 56;	// set offset for serialization
  
             beginFinalRecords400 = getStartOffset() + 64;	// set offset for serialization
  
             beginNoOfSortedRecs400 = getStartOffset() + 72;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
         int localIp00002Table0EntriesMaxCounter = -1;
         public boolean isIp00002Table0EntriesMaxModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00002Table0EntriesMaxCounter != sharedCounter;
            localIp00002Table0EntriesMaxCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkIp00002Table0EntriesMaxMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localIp00002Table0EntriesCounter = -1;
         public boolean isIp00002Table0EntriesModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00002Table0EntriesCounter != sharedCounter;
            localIp00002Table0EntriesCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkIp00002Table0EntriesMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localIsItFirstTime100Counter = -1;
     public boolean isIsItFirstTime100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsItFirstTime100Counter != sharedCounter;
         localIsItFirstTime100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsItFirstTime100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsItFirstRead100Counter = -1;
     public boolean isIsItFirstRead100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsItFirstRead100Counter != sharedCounter;
         localIsItFirstRead100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsItFirstRead100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsDfltAgrmntTobeBuild100Counter = -1;
     public boolean isIsDfltAgrmntTobeBuild100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsDfltAgrmntTobeBuild100Counter != sharedCounter;
         localIsDfltAgrmntTobeBuild100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsDfltAgrmntTobeBuild100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWriteTheRecord100Counter = -1;
     public boolean isWriteTheRecord100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWriteTheRecord100Counter != sharedCounter;
         localWriteTheRecord100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWriteTheRecord100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localInputFileSw100Counter = -1;
     public boolean isInputFileSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputFileSw100Counter != sharedCounter;
         localInputFileSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkInputFileSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSortInpEof100Counter = -1;
     public boolean isSortInpEof100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSortInpEof100Counter != sharedCounter;
         localSortInpEof100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSortInpEof100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localInputFileStatus200Counter = -1;
     public boolean isInputFileStatus200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputFileStatus200Counter != sharedCounter;
         localInputFileStatus200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkInputFileStatus200Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localTmp90FileStatus200Counter = -1;
     public boolean isTmp90FileStatus200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmp90FileStatus200Counter != sharedCounter;
         localTmp90FileStatus200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTmp90FileStatus200Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localTmp91FileStatus200Counter = -1;
     public boolean isTmp91FileStatus200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmp91FileStatus200Counter != sharedCounter;
         localTmp91FileStatus200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTmp91FileStatus200Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localOutputFileStatus200Counter = -1;
     public boolean isOutputFileStatus200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutputFileStatus200Counter != sharedCounter;
         localOutputFileStatus200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOutputFileStatus200Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localPgmName300Counter = -1;
     public boolean isPgmName300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmName300Counter != sharedCounter;
         localPgmName300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmName300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmVersion300Counter = -1;
     public boolean isPgmVersion300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmVersion300Counter != sharedCounter;
         localPgmVersion300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmVersion300Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
     int localPgmIp670010300Counter = -1;
     public boolean isPgmIp670010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp670010300Counter != sharedCounter;
         localPgmIp670010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp670010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTableIp0036t1300Counter = -1;
     public boolean isTableIp0036t1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableIp0036t1300Counter != sharedCounter;
         localTableIp0036t1300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTableIp0036t1300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTableIp0040t1300Counter = -1;
     public boolean isTableIp0040t1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableIp0040t1300Counter != sharedCounter;
         localTableIp0040t1300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTableIp0040t1300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTableIp0041t1300Counter = -1;
     public boolean isTableIp0041t1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableIp0041t1300Counter != sharedCounter;
         localTableIp0041t1300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTableIp0041t1300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTableIp0090t1300Counter = -1;
     public boolean isTableIp0090t1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableIp0090t1300Counter != sharedCounter;
         localTableIp0090t1300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTableIp0090t1300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTableIp0091t1300Counter = -1;
     public boolean isTableIp0091t1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableIp0091t1300Counter != sharedCounter;
         localTableIp0091t1300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTableIp0091t1300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTableIp9000t1300Counter = -1;
     public boolean isTableIp9000t1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableIp9000t1300Counter != sharedCounter;
         localTableIp9000t1300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTableIp9000t1300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTrailerRecord300Counter = -1;
     public boolean isTrailerRecord300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTrailerRecord300Counter != sharedCounter;
         localTrailerRecord300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTrailerRecord300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localUpdateHdrRec300Counter = -1;
     public boolean isUpdateHdrRec300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUpdateHdrRec300Counter != sharedCounter;
         localUpdateHdrRec300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkUpdateHdrRec300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localReplacmntHdrRec300Counter = -1;
     public boolean isReplacmntHdrRec300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReplacmntHdrRec300Counter != sharedCounter;
         localReplacmntHdrRec300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkReplacmntHdrRec300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localFinalTrailer300Counter = -1;
     public boolean isFinalTrailer300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFinalTrailer300Counter != sharedCounter;
         localFinalTrailer300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFinalTrailer300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localValueOne300Counter = -1;
     public boolean isValueOne300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueOne300Counter != sharedCounter;
         localValueOne300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of valueOne300
	 *	@return valueOne300
	 */
	public char[]  getValueOne300String() {
	     return getCharArray(beginValueOne300,VALUE_ONE_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean valueOne300IsNumeric() {
	    return isNumeric(beginValueOne300
	                    ,beginValueOne300 + VALUE_ONE_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_ONE_300_LEN = 1;
  	/**
	 * serializeValueOne300
	 */
	protected void serializeValueOne300(int valueOne300) {
		 putNumber(beginValueOne300,valueOne300,VALUE_ONE_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValueOne300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValueOne300
	 */
   	protected  int serializeValueOne300(char[] value) {
	    int  valueOne300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    valueOne300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginValueOne300
		       ,1
		      );
		 localValueOne300Counter = shareString.getSerializedField().getModifiedCounter();
		return  valueOne300;
    }

   protected int checkValueOne300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValueOne300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValueOne300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValueOne300
			                 ,VALUE_ONE_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("valueOne300", beginValueOne300,VALUE_ONE_300_LEN);
    }
   	}
     int localValue11300Counter = -1;
     public boolean isValue11300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue11300Counter != sharedCounter;
         localValue11300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value11300
	 *	@return value11300
	 */
	public char[]  getValue11300String() {
	     return getCharArray(beginValue11300,VALUE_11300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value11300IsNumeric() {
	    return isNumeric(beginValue11300
	                    ,beginValue11300 + VALUE_11300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_11300_LEN = 2;
  	/**
	 * serializeValue11300
	 */
	protected void serializeValue11300(int value11300) {
		 putNumber(beginValue11300,value11300,VALUE_11300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue11300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue11300
	 */
   	protected  int serializeValue11300(char[] value) {
	    int  value11300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value11300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue11300
		       ,2
		      );
		 localValue11300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value11300;
    }

   protected int checkValue11300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue11300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue11300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue11300
			                 ,VALUE_11300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value11300", beginValue11300,VALUE_11300_LEN);
    }
   	}
     int localSys001File300Counter = -1;
     public boolean isSys001File300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001File300Counter != sharedCounter;
         localSys001File300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys001File300Constraints(char[] value) {
   			return super.checkConstraints(value , 21 ,false, false);
   }
     int localSys105File300Counter = -1;
     public boolean isSys105File300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys105File300Counter != sharedCounter;
         localSys105File300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys105File300Constraints(char[] value) {
   			return super.checkConstraints(value , 21 ,false, false);
   }
     int localSys106File300Counter = -1;
     public boolean isSys106File300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys106File300Counter != sharedCounter;
         localSys106File300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys106File300Constraints(char[] value) {
   			return super.checkConstraints(value , 21 ,false, false);
   }
     int localSys200File300Counter = -1;
     public boolean isSys200File300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys200File300Counter != sharedCounter;
         localSys200File300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys200File300Constraints(char[] value) {
   			return super.checkConstraints(value , 21 ,false, false);
   }
     int localPara1200300Counter = -1;
     public boolean isPara1200300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara1200300Counter != sharedCounter;
         localPara1200300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara1200300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara1300300Counter = -1;
     public boolean isPara1300300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara1300300Counter != sharedCounter;
         localPara1300300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara1300300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara2220300Counter = -1;
     public boolean isPara2220300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2220300Counter != sharedCounter;
         localPara2220300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2220300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara2210300Counter = -1;
     public boolean isPara2210300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2210300Counter != sharedCounter;
         localPara2210300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2210300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara2231300Counter = -1;
     public boolean isPara2231300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2231300Counter != sharedCounter;
         localPara2231300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2231300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara224110300Counter = -1;
     public boolean isPara224110300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara224110300Counter != sharedCounter;
         localPara224110300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara224110300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara8300300Counter = -1;
     public boolean isPara8300300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8300300Counter != sharedCounter;
         localPara8300300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8300300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara8350300Counter = -1;
     public boolean isPara8350300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8350300Counter != sharedCounter;
         localPara8350300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8350300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara8400300Counter = -1;
     public boolean isPara8400300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8400300Counter != sharedCounter;
         localPara8400300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8400300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara8500300Counter = -1;
     public boolean isPara8500300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8500300Counter != sharedCounter;
         localPara8500300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8500300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara8600300Counter = -1;
     public boolean isPara8600300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8600300Counter != sharedCounter;
         localPara8600300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8600300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara8700300Counter = -1;
     public boolean isPara8700300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8700300Counter != sharedCounter;
         localPara8700300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8700300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara7500300Counter = -1;
     public boolean isPara7500300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara7500300Counter != sharedCounter;
         localPara7500300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara7500300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara7600300Counter = -1;
     public boolean isPara7600300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara7600300Counter != sharedCounter;
         localPara7600300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara7600300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara8100300Counter = -1;
     public boolean isPara8100300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8100300Counter != sharedCounter;
         localPara8100300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8100300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara8200300Counter = -1;
     public boolean isPara8200300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8200300Counter != sharedCounter;
         localPara8200300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8200300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara8250300Counter = -1;
     public boolean isPara8250300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8250300Counter != sharedCounter;
         localPara8250300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8250300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara3000300Counter = -1;
     public boolean isPara3000300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara3000300Counter != sharedCounter;
         localPara3000300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara3000300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara8000300Counter = -1;
     public boolean isPara8000300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8000300Counter != sharedCounter;
         localPara8000300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8000300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localOpenSys001File300Counter = -1;
     public boolean isOpenSys001File300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOpenSys001File300Counter != sharedCounter;
         localOpenSys001File300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOpenSys001File300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localOpenSys105File300Counter = -1;
     public boolean isOpenSys105File300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOpenSys105File300Counter != sharedCounter;
         localOpenSys105File300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOpenSys105File300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localOpenSys106File300Counter = -1;
     public boolean isOpenSys106File300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOpenSys106File300Counter != sharedCounter;
         localOpenSys106File300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOpenSys106File300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localOpenSys200File300Counter = -1;
     public boolean isOpenSys200File300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOpenSys200File300Counter != sharedCounter;
         localOpenSys200File300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOpenSys200File300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localReadSys105File300Counter = -1;
     public boolean isReadSys105File300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReadSys105File300Counter != sharedCounter;
         localReadSys105File300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkReadSys105File300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localWriteSys200File300Counter = -1;
     public boolean isWriteSys200File300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWriteSys200File300Counter != sharedCounter;
         localWriteSys200File300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWriteSys200File300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localWriteSys105File300Counter = -1;
     public boolean isWriteSys105File300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWriteSys105File300Counter != sharedCounter;
         localWriteSys105File300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWriteSys105File300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localWriteSys106File300Counter = -1;
     public boolean isWriteSys106File300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWriteSys106File300Counter != sharedCounter;
         localWriteSys106File300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWriteSys106File300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localCloseSys001File300Counter = -1;
     public boolean isCloseSys001File300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCloseSys001File300Counter != sharedCounter;
         localCloseSys001File300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCloseSys001File300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localCloseSys105File300Counter = -1;
     public boolean isCloseSys105File300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCloseSys105File300Counter != sharedCounter;
         localCloseSys105File300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCloseSys105File300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localCloseSys106File300Counter = -1;
     public boolean isCloseSys106File300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCloseSys106File300Counter != sharedCounter;
         localCloseSys106File300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCloseSys106File300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localCloseSys200File300Counter = -1;
     public boolean isCloseSys200File300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCloseSys200File300Counter != sharedCounter;
         localCloseSys200File300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCloseSys200File300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localOnedayFileEmpty300Counter = -1;
     public boolean isOnedayFileEmpty300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOnedayFileEmpty300Counter != sharedCounter;
         localOnedayFileEmpty300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOnedayFileEmpty300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localTableZeroOverflow300Counter = -1;
     public boolean isTableZeroOverflow300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableZeroOverflow300Counter != sharedCounter;
         localTableZeroOverflow300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTableZeroOverflow300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localTblSubIdNotFound300Counter = -1;
     public boolean isTblSubIdNotFound300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTblSubIdNotFound300Counter != sharedCounter;
         localTblSubIdNotFound300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTblSubIdNotFound300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localHdrMissingAbendCode300Counter = -1;
     public boolean isHdrMissingAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdrMissingAbendCode300Counter != sharedCounter;
         localHdrMissingAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdrMissingAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localInvalidDate300Counter = -1;
     public boolean isInvalidDate300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInvalidDate300Counter != sharedCounter;
         localInvalidDate300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkInvalidDate300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
         int localRecsWritten400Counter = -1;
         public boolean isRecsWritten400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRecsWritten400Counter != sharedCounter;
            localRecsWritten400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkRecsWritten400MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localRecsRead400Counter = -1;
         public boolean isRecsRead400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRecsRead400Counter != sharedCounter;
            localRecsRead400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkRecsRead400MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localHoldRecsRead400Counter = -1;
         public boolean isHoldRecsRead400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHoldRecsRead400Counter != sharedCounter;
            localHoldRecsRead400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkHoldRecsRead400MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSub400Counter = -1;
         public boolean isSub400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSub400Counter != sharedCounter;
            localSub400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSub400MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSub1400Counter = -1;
         public boolean isSub1400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSub1400Counter != sharedCounter;
            localSub1400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSub1400MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localRegionMax400Counter = -1;
     public boolean isRegionMax400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRegionMax400Counter != sharedCounter;
         localRegionMax400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of regionMax400
	 *	@return regionMax400
	 */
	public char[]  getRegionMax400String() {
	     return getCharArray(beginRegionMax400,REGION_MAX_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean regionMax400IsNumeric() {
	    return isNumeric(beginRegionMax400
	                    ,beginRegionMax400 + REGION_MAX_400_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int REGION_MAX_400_LEN = 4;
  	/**
	 * serializeRegionMax400
	 */
	protected void serializeRegionMax400(int regionMax400) {
		 putNumber(beginRegionMax400,regionMax400,REGION_MAX_400_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRegionMax400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRegionMax400
	 */
   	protected  int serializeRegionMax400(char[] value) {
	    int  regionMax400;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    regionMax400 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginRegionMax400
		       ,4
		      );
		 localRegionMax400Counter = shareString.getSerializedField().getModifiedCounter();
		return  regionMax400;
    }

   protected int checkRegionMax400MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRegionMax400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRegionMax400() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRegionMax400
			                 ,REGION_MAX_400_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("regionMax400", beginRegionMax400,REGION_MAX_400_LEN);
    }
   	}
     int localTable36BslSub400Counter = -1;
     public boolean isTable36BslSub400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTable36BslSub400Counter != sharedCounter;
         localTable36BslSub400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of table36BslSub400
	 *	@return table36BslSub400
	 */
	public char[]  getTable36BslSub400String() {
	     return getCharArray(beginTable36BslSub400,TABLE_36_BSL_SUB_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean table36BslSub400IsNumeric() {
	    return isNumeric(beginTable36BslSub400
	                    ,beginTable36BslSub400 + TABLE_36_BSL_SUB_400_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TABLE_36_BSL_SUB_400_LEN = 8;
  	/**
	 * serializeTable36BslSub400
	 */
	protected void serializeTable36BslSub400(long table36BslSub400) {
		 putNumber(beginTable36BslSub400,table36BslSub400,TABLE_36_BSL_SUB_400_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTable36BslSub400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTable36BslSub400
	 */
   	protected  long serializeTable36BslSub400(char[] value) {
	    long  table36BslSub400;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    table36BslSub400 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginTable36BslSub400
		       ,8
		      );
		 localTable36BslSub400Counter = shareString.getSerializedField().getModifiedCounter();
		return  table36BslSub400;
    }

   protected long checkTable36BslSub400MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTable36BslSub400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTable36BslSub400() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTable36BslSub400
			                 ,TABLE_36_BSL_SUB_400_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("table36BslSub400", beginTable36BslSub400,TABLE_36_BSL_SUB_400_LEN);
    }
   	}
     int localBsl1BuildCounter40090Counter = -1;
     public boolean isBsl1BuildCounter40090Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBsl1BuildCounter40090Counter != sharedCounter;
         localBsl1BuildCounter40090Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bsl1BuildCounter40090
	 *	@return bsl1BuildCounter40090
	 */
	public char[]  getBsl1BuildCounter40090String() {
	     return getCharArray(beginBsl1BuildCounter40090,BSL_1_BUILD_COUNTER_40090_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bsl1BuildCounter40090IsNumeric() {
	    return isNumeric(beginBsl1BuildCounter40090
	                    ,beginBsl1BuildCounter40090 + BSL_1_BUILD_COUNTER_40090_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BSL_1_BUILD_COUNTER_40090_LEN = 8;
  	/**
	 * serializeBsl1BuildCounter40090
	 */
	protected void serializeBsl1BuildCounter40090(long bsl1BuildCounter40090) {
		 putNumber(beginBsl1BuildCounter40090,bsl1BuildCounter40090,BSL_1_BUILD_COUNTER_40090_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBsl1BuildCounter40090Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBsl1BuildCounter40090
	 */
   	protected  long serializeBsl1BuildCounter40090(char[] value) {
	    long  bsl1BuildCounter40090;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bsl1BuildCounter40090 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginBsl1BuildCounter40090
		       ,8
		      );
		 localBsl1BuildCounter40090Counter = shareString.getSerializedField().getModifiedCounter();
		return  bsl1BuildCounter40090;
    }

   protected long checkBsl1BuildCounter40090MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBsl1BuildCounter40090 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBsl1BuildCounter40090() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBsl1BuildCounter40090
			                 ,BSL_1_BUILD_COUNTER_40090_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bsl1BuildCounter40090", beginBsl1BuildCounter40090,BSL_1_BUILD_COUNTER_40090_LEN);
    }
   	}
     int localBsl2BuildCounter40090Counter = -1;
     public boolean isBsl2BuildCounter40090Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBsl2BuildCounter40090Counter != sharedCounter;
         localBsl2BuildCounter40090Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bsl2BuildCounter40090
	 *	@return bsl2BuildCounter40090
	 */
	public char[]  getBsl2BuildCounter40090String() {
	     return getCharArray(beginBsl2BuildCounter40090,BSL_2_BUILD_COUNTER_40090_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bsl2BuildCounter40090IsNumeric() {
	    return isNumeric(beginBsl2BuildCounter40090
	                    ,beginBsl2BuildCounter40090 + BSL_2_BUILD_COUNTER_40090_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BSL_2_BUILD_COUNTER_40090_LEN = 8;
  	/**
	 * serializeBsl2BuildCounter40090
	 */
	protected void serializeBsl2BuildCounter40090(long bsl2BuildCounter40090) {
		 putNumber(beginBsl2BuildCounter40090,bsl2BuildCounter40090,BSL_2_BUILD_COUNTER_40090_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBsl2BuildCounter40090Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBsl2BuildCounter40090
	 */
   	protected  long serializeBsl2BuildCounter40090(char[] value) {
	    long  bsl2BuildCounter40090;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bsl2BuildCounter40090 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginBsl2BuildCounter40090
		       ,8
		      );
		 localBsl2BuildCounter40090Counter = shareString.getSerializedField().getModifiedCounter();
		return  bsl2BuildCounter40090;
    }

   protected long checkBsl2BuildCounter40090MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBsl2BuildCounter40090 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBsl2BuildCounter40090() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBsl2BuildCounter40090
			                 ,BSL_2_BUILD_COUNTER_40090_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bsl2BuildCounter40090", beginBsl2BuildCounter40090,BSL_2_BUILD_COUNTER_40090_LEN);
    }
   	}
     int localBsl1BuildCounter40091Counter = -1;
     public boolean isBsl1BuildCounter40091Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBsl1BuildCounter40091Counter != sharedCounter;
         localBsl1BuildCounter40091Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bsl1BuildCounter40091
	 *	@return bsl1BuildCounter40091
	 */
	public char[]  getBsl1BuildCounter40091String() {
	     return getCharArray(beginBsl1BuildCounter40091,BSL_1_BUILD_COUNTER_40091_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bsl1BuildCounter40091IsNumeric() {
	    return isNumeric(beginBsl1BuildCounter40091
	                    ,beginBsl1BuildCounter40091 + BSL_1_BUILD_COUNTER_40091_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BSL_1_BUILD_COUNTER_40091_LEN = 8;
  	/**
	 * serializeBsl1BuildCounter40091
	 */
	protected void serializeBsl1BuildCounter40091(long bsl1BuildCounter40091) {
		 putNumber(beginBsl1BuildCounter40091,bsl1BuildCounter40091,BSL_1_BUILD_COUNTER_40091_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBsl1BuildCounter40091Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBsl1BuildCounter40091
	 */
   	protected  long serializeBsl1BuildCounter40091(char[] value) {
	    long  bsl1BuildCounter40091;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bsl1BuildCounter40091 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginBsl1BuildCounter40091
		       ,8
		      );
		 localBsl1BuildCounter40091Counter = shareString.getSerializedField().getModifiedCounter();
		return  bsl1BuildCounter40091;
    }

   protected long checkBsl1BuildCounter40091MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBsl1BuildCounter40091 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBsl1BuildCounter40091() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBsl1BuildCounter40091
			                 ,BSL_1_BUILD_COUNTER_40091_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bsl1BuildCounter40091", beginBsl1BuildCounter40091,BSL_1_BUILD_COUNTER_40091_LEN);
    }
   	}
     int localBsl2BuildCounter40091Counter = -1;
     public boolean isBsl2BuildCounter40091Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBsl2BuildCounter40091Counter != sharedCounter;
         localBsl2BuildCounter40091Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bsl2BuildCounter40091
	 *	@return bsl2BuildCounter40091
	 */
	public char[]  getBsl2BuildCounter40091String() {
	     return getCharArray(beginBsl2BuildCounter40091,BSL_2_BUILD_COUNTER_40091_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bsl2BuildCounter40091IsNumeric() {
	    return isNumeric(beginBsl2BuildCounter40091
	                    ,beginBsl2BuildCounter40091 + BSL_2_BUILD_COUNTER_40091_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BSL_2_BUILD_COUNTER_40091_LEN = 8;
  	/**
	 * serializeBsl2BuildCounter40091
	 */
	protected void serializeBsl2BuildCounter40091(long bsl2BuildCounter40091) {
		 putNumber(beginBsl2BuildCounter40091,bsl2BuildCounter40091,BSL_2_BUILD_COUNTER_40091_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBsl2BuildCounter40091Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBsl2BuildCounter40091
	 */
   	protected  long serializeBsl2BuildCounter40091(char[] value) {
	    long  bsl2BuildCounter40091;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bsl2BuildCounter40091 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginBsl2BuildCounter40091
		       ,8
		      );
		 localBsl2BuildCounter40091Counter = shareString.getSerializedField().getModifiedCounter();
		return  bsl2BuildCounter40091;
    }

   protected long checkBsl2BuildCounter40091MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBsl2BuildCounter40091 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBsl2BuildCounter40091() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBsl2BuildCounter40091
			                 ,BSL_2_BUILD_COUNTER_40091_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bsl2BuildCounter40091", beginBsl2BuildCounter40091,BSL_2_BUILD_COUNTER_40091_LEN);
    }
   	}
     int localDefaultsBuild400Counter = -1;
     public boolean isDefaultsBuild400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDefaultsBuild400Counter != sharedCounter;
         localDefaultsBuild400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of defaultsBuild400
	 *	@return defaultsBuild400
	 */
	public char[]  getDefaultsBuild400String() {
	     return getCharArray(beginDefaultsBuild400,DEFAULTS_BUILD_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean defaultsBuild400IsNumeric() {
	    return isNumeric(beginDefaultsBuild400
	                    ,beginDefaultsBuild400 + DEFAULTS_BUILD_400_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DEFAULTS_BUILD_400_LEN = 9;
  	/**
	 * serializeDefaultsBuild400
	 */
	protected void serializeDefaultsBuild400(long defaultsBuild400) {
		 putNumber(beginDefaultsBuild400,defaultsBuild400,DEFAULTS_BUILD_400_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDefaultsBuild400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDefaultsBuild400
	 */
   	protected  long serializeDefaultsBuild400(char[] value) {
	    long  defaultsBuild400;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    defaultsBuild400 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginDefaultsBuild400
		       ,9
		      );
		 localDefaultsBuild400Counter = shareString.getSerializedField().getModifiedCounter();
		return  defaultsBuild400;
    }

   protected long checkDefaultsBuild400MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDefaultsBuild400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDefaultsBuild400() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDefaultsBuild400
			                 ,DEFAULTS_BUILD_400_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("defaultsBuild400", beginDefaultsBuild400,DEFAULTS_BUILD_400_LEN);
    }
   	}
     int localRecordsCount400Counter = -1;
     public boolean isRecordsCount400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecordsCount400Counter != sharedCounter;
         localRecordsCount400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of recordsCount400
	 *	@return recordsCount400
	 */
	public char[]  getRecordsCount400String() {
	     return getCharArray(beginRecordsCount400,RECORDS_COUNT_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean recordsCount400IsNumeric() {
	    return isNumeric(beginRecordsCount400
	                    ,beginRecordsCount400 + RECORDS_COUNT_400_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RECORDS_COUNT_400_LEN = 8;
  	/**
	 * serializeRecordsCount400
	 */
	protected void serializeRecordsCount400(long recordsCount400) {
		 putNumber(beginRecordsCount400,recordsCount400,RECORDS_COUNT_400_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRecordsCount400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRecordsCount400
	 */
   	protected  long serializeRecordsCount400(char[] value) {
	    long  recordsCount400;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    recordsCount400 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginRecordsCount400
		       ,8
		      );
		 localRecordsCount400Counter = shareString.getSerializedField().getModifiedCounter();
		return  recordsCount400;
    }

   protected long checkRecordsCount400MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRecordsCount400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRecordsCount400() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginRecordsCount400
			                 ,RECORDS_COUNT_400_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("recordsCount400", beginRecordsCount400,RECORDS_COUNT_400_LEN);
    }
   	}
     int localFinalRecords400Counter = -1;
     public boolean isFinalRecords400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFinalRecords400Counter != sharedCounter;
         localFinalRecords400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of finalRecords400
	 *	@return finalRecords400
	 */
	public char[]  getFinalRecords400String() {
	     return getCharArray(beginFinalRecords400,FINAL_RECORDS_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean finalRecords400IsNumeric() {
	    return isNumeric(beginFinalRecords400
	                    ,beginFinalRecords400 + FINAL_RECORDS_400_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FINAL_RECORDS_400_LEN = 8;
  	/**
	 * serializeFinalRecords400
	 */
	protected void serializeFinalRecords400(long finalRecords400) {
		 putNumber(beginFinalRecords400,finalRecords400,FINAL_RECORDS_400_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFinalRecords400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFinalRecords400
	 */
   	protected  long serializeFinalRecords400(char[] value) {
	    long  finalRecords400;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    finalRecords400 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginFinalRecords400
		       ,8
		      );
		 localFinalRecords400Counter = shareString.getSerializedField().getModifiedCounter();
		return  finalRecords400;
    }

   protected long checkFinalRecords400MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFinalRecords400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshFinalRecords400() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginFinalRecords400
			                 ,FINAL_RECORDS_400_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("finalRecords400", beginFinalRecords400,FINAL_RECORDS_400_LEN);
    }
   	}
     int localNoOfSortedRecs400Counter = -1;
     public boolean isNoOfSortedRecs400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNoOfSortedRecs400Counter != sharedCounter;
         localNoOfSortedRecs400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of noOfSortedRecs400
	 *	@return noOfSortedRecs400
	 */
	public char[]  getNoOfSortedRecs400String() {
	     return getCharArray(beginNoOfSortedRecs400,NO_OF_SORTED_RECS_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean noOfSortedRecs400IsNumeric() {
	    return isNumeric(beginNoOfSortedRecs400
	                    ,beginNoOfSortedRecs400 + NO_OF_SORTED_RECS_400_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NO_OF_SORTED_RECS_400_LEN = 8;
  	/**
	 * serializeNoOfSortedRecs400
	 */
	protected void serializeNoOfSortedRecs400(long noOfSortedRecs400) {
		 putNumber(beginNoOfSortedRecs400,noOfSortedRecs400,NO_OF_SORTED_RECS_400_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNoOfSortedRecs400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNoOfSortedRecs400
	 */
   	protected  long serializeNoOfSortedRecs400(char[] value) {
	    long  noOfSortedRecs400;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    noOfSortedRecs400 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginNoOfSortedRecs400
		       ,8
		      );
		 localNoOfSortedRecs400Counter = shareString.getSerializedField().getModifiedCounter();
		return  noOfSortedRecs400;
    }

   protected long checkNoOfSortedRecs400MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNoOfSortedRecs400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshNoOfSortedRecs400() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginNoOfSortedRecs400
			                 ,NO_OF_SORTED_RECS_400_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("noOfSortedRecs400", beginNoOfSortedRecs400,NO_OF_SORTED_RECS_400_LEN);
    }
   	}
     int localIp6063007600Counter = -1;
     public boolean isIp6063007600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp6063007600Counter != sharedCounter;
         localIp6063007600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIp6063007600Constraints(char[] value) {
   			return super.checkConstraints(value , 33 ,false, false);
   }
     int localHeaderRecordMissing600Counter = -1;
     public boolean isHeaderRecordMissing600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHeaderRecordMissing600Counter != sharedCounter;
         localHeaderRecordMissing600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHeaderRecordMissing600Constraints(char[] value) {
   			return super.checkConstraints(value , 65 ,false, false);
   }
     int localSpace600Counter = -1;
     public boolean isSpace600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSpace600Counter != sharedCounter;
         localSpace600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSpace600Constraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
     int localStatsMessage600Counter = -1;
     public boolean isStatsMessage600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStatsMessage600Counter != sharedCounter;
         localStatsMessage600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkStatsMessage600Constraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
         int localSortRdwCounter = -1;
         public boolean isSortRdwModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSortRdwCounter != sharedCounter;
            localSortRdwCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSortRdwMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSys001RdwIn800Counter = -1;
         public boolean isSys001RdwIn800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSys001RdwIn800Counter != sharedCounter;
            localSys001RdwIn800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSys001RdwIn800MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSys200RdwOut800Counter = -1;
         public boolean isSys200RdwOut800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSys200RdwOut800Counter != sharedCounter;
            localSys200RdwOut800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSys200RdwOut800MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTempTbl90Rdw800Counter = -1;
         public boolean isTempTbl90Rdw800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTempTbl90Rdw800Counter != sharedCounter;
            localTempTbl90Rdw800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTempTbl90Rdw800MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTempTbl91Rdw800Counter = -1;
         public boolean isTempTbl91Rdw800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTempTbl91Rdw800Counter != sharedCounter;
            localTempTbl91Rdw800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTempTbl91Rdw800MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localExpandedLength800Counter = -1;
         public boolean isExpandedLength800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localExpandedLength800Counter != sharedCounter;
            localExpandedLength800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkExpandedLength800MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localDataLength800Counter = -1;
         public boolean isDataLength800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDataLength800Counter != sharedCounter;
            localDataLength800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkDataLength800MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTable40Length800Counter = -1;
         public boolean isTable40Length800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTable40Length800Counter != sharedCounter;
            localTable40Length800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTable40Length800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localTable90KeyLngth800Counter = -1;
         public boolean isTable90KeyLngth800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTable90KeyLngth800Counter != sharedCounter;
            localTable90KeyLngth800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTable90KeyLngth800MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTable91KeyLngth800Counter = -1;
         public boolean isTable91KeyLngth800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTable91KeyLngth800Counter != sharedCounter;
            localTable91KeyLngth800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTable91KeyLngth800MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localTblIp9000t1SubId800Counter = -1;
     public boolean isTblIp9000t1SubId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTblIp9000t1SubId800Counter != sharedCounter;
         localTblIp9000t1SubId800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTblIp9000t1SubId800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localPtrIp670010800Counter = -1;
     public boolean isPtrIp670010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp670010800Counter != sharedCounter;
         localPtrIp670010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp670010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localDisplayAbendMsgTxt900Counter = -1;
     public boolean isDisplayAbendMsgTxt900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDisplayAbendMsgTxt900Counter != sharedCounter;
         localDisplayAbendMsgTxt900Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDisplayAbendMsgTxt900Constraints(char[] value) {
   			return super.checkConstraints(value , 480 ,false, false);
   }




}
  
