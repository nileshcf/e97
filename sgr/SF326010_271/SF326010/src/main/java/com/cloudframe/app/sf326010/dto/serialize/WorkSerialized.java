package com.cloudframe.app.sf326010.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 53;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOne300;
            protected  int beginTwenty300;
            protected  int beginAssert1400;
            protected  int beginMipLogCnt400;
            protected  int beginZLogCnt400;
            protected  int beginZLogBypass400;
            protected  int beginTranlogTimeHh800;
            protected  int beginTranlogTimeMm800;
            protected  int beginTranlogTimeSs800;
            protected  int beginTranlogDateMm800;
            protected  int beginTranlogDateDd800;
            protected  int beginTranlogDateYy800;
            protected  int beginTranlogDateCc800;
	
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
  
  
  
             beginOne300 = getStartOffset() + 0;	// set offset for serialization
  
             beginTwenty300 = getStartOffset() + 1;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
             beginAssert1400 = getStartOffset() + 3;	// set offset for serialization
  
             beginMipLogCnt400 = getStartOffset() + 12;	// set offset for serialization
  
             beginZLogCnt400 = getStartOffset() + 21;	// set offset for serialization
  
             beginZLogBypass400 = getStartOffset() + 30;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
             beginTranlogTimeHh800 = getStartOffset() + 39;	// set offset for serialization
  
             beginTranlogTimeMm800 = getStartOffset() + 41;	// set offset for serialization
  
             beginTranlogTimeSs800 = getStartOffset() + 43;	// set offset for serialization
  
             beginTranlogDateMm800 = getStartOffset() + 45;	// set offset for serialization
  
             beginTranlogDateDd800 = getStartOffset() + 47;	// set offset for serialization
  
             beginTranlogDateYy800 = getStartOffset() + 49;	// set offset for serialization
  
             beginTranlogDateCc800 = getStartOffset() + 51;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMipLogEofSw100Counter = -1;
     public boolean isMipLogEofSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMipLogEofSw100Counter != sharedCounter;
         localMipLogEofSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMipLogEofSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
         int localHalfword8300Counter = -1;
         public boolean isHalfword8300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHalfword8300Counter != sharedCounter;
            localHalfword8300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkHalfword8300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localHalfword13300Counter = -1;
         public boolean isHalfword13300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHalfword13300Counter != sharedCounter;
            localHalfword13300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkHalfword13300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localOne300Counter = -1;
     public boolean isOne300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOne300Counter != sharedCounter;
         localOne300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of one300
	 *	@return one300
	 */
	public char[]  getOne300String() {
	     return getCharArray(beginOne300,ONE_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean one300IsNumeric() {
	    return isNumeric(beginOne300
	                    ,beginOne300 + ONE_300_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ONE_300_LEN = 1;
  	/**
	 * serializeOne300
	 */
	protected void serializeOne300(short one300) {
		 putNumber(beginOne300,one300,ONE_300_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOne300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOne300
	 */
   	protected  short serializeOne300(char[] value) {
	    short  one300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    one300 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,true/*isSigned?*/)
		       ,beginOne300
		       ,1
		      );
		 localOne300Counter = shareString.getSerializedField().getModifiedCounter();
		return  one300;
    }

   protected short checkOne300MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshOne300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshOne300() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginOne300
			                 ,ONE_300_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("one300", beginOne300,ONE_300_LEN);
    }
   	}
     int localTwenty300Counter = -1;
     public boolean isTwenty300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTwenty300Counter != sharedCounter;
         localTwenty300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of twenty300
	 *	@return twenty300
	 */
	public char[]  getTwenty300String() {
	     return getCharArray(beginTwenty300,TWENTY_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean twenty300IsNumeric() {
	    return isNumeric(beginTwenty300
	                    ,beginTwenty300 + TWENTY_300_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TWENTY_300_LEN = 2;
  	/**
	 * serializeTwenty300
	 */
	protected void serializeTwenty300(short twenty300) {
		 putNumber(beginTwenty300,twenty300,TWENTY_300_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTwenty300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTwenty300
	 */
   	protected  short serializeTwenty300(char[] value) {
	    short  twenty300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    twenty300 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,true/*isSigned?*/)
		       ,beginTwenty300
		       ,2
		      );
		 localTwenty300Counter = shareString.getSerializedField().getModifiedCounter();
		return  twenty300;
    }

   protected short checkTwenty300MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_100/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshTwenty300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTwenty300() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginTwenty300
			                 ,TWENTY_300_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("twenty300", beginTwenty300,TWENTY_300_LEN);
    }
   	}
     int localSf305120300Counter = -1;
     public boolean isSf305120300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf305120300Counter != sharedCounter;
         localSf305120300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSf305120300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localZLog300Counter = -1;
     public boolean isZLog300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZLog300Counter != sharedCounter;
         localZLog300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkZLog300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localCharC300Counter = -1;
     public boolean isCharC300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharC300Counter != sharedCounter;
         localCharC300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCharC300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localCharE300Counter = -1;
     public boolean isCharE300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharE300Counter != sharedCounter;
         localCharE300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCharE300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localCharA300Counter = -1;
     public boolean isCharA300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharA300Counter != sharedCounter;
         localCharA300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCharA300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localCharB300Counter = -1;
     public boolean isCharB300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharB300Counter != sharedCounter;
         localCharB300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCharB300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localCharN300Counter = -1;
     public boolean isCharN300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharN300Counter != sharedCounter;
         localCharN300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCharN300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
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
         int localSub400Counter = -1;
         public boolean isSub400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSub400Counter != sharedCounter;
            localSub400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSub400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localAssert1400Counter = -1;
     public boolean isAssert1400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAssert1400Counter != sharedCounter;
         localAssert1400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of assert1400
	 *	@return assert1400
	 */
	public char[]  getAssert1400String() {
	     return getCharArray(beginAssert1400,ASSERT_1400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean assert1400IsNumeric() {
	    return isNumeric(beginAssert1400
	                    ,beginAssert1400 + ASSERT_1400_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ASSERT_1400_LEN = 9;
  	/**
	 * serializeAssert1400
	 */
	protected void serializeAssert1400(int assert1400) {
		 putNumber(beginAssert1400,assert1400,ASSERT_1400_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAssert1400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAssert1400
	 */
   	protected  int serializeAssert1400(char[] value) {
	    int  assert1400;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    assert1400 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginAssert1400
		       ,9
		      );
		 localAssert1400Counter = shareString.getSerializedField().getModifiedCounter();
		return  assert1400;
    }

   protected int checkAssert1400MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshAssert1400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAssert1400() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAssert1400
			                 ,ASSERT_1400_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("assert1400", beginAssert1400,ASSERT_1400_LEN);
    }
   	}
     int localMipLogCnt400Counter = -1;
     public boolean isMipLogCnt400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMipLogCnt400Counter != sharedCounter;
         localMipLogCnt400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mipLogCnt400
	 *	@return mipLogCnt400
	 */
	public char[]  getMipLogCnt400String() {
	     return getCharArray(beginMipLogCnt400,MIP_LOG_CNT_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mipLogCnt400IsNumeric() {
	    return isNumeric(beginMipLogCnt400
	                    ,beginMipLogCnt400 + MIP_LOG_CNT_400_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MIP_LOG_CNT_400_LEN = 9;
  	/**
	 * serializeMipLogCnt400
	 */
	protected void serializeMipLogCnt400(int mipLogCnt400) {
		 putNumber(beginMipLogCnt400,mipLogCnt400,MIP_LOG_CNT_400_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMipLogCnt400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMipLogCnt400
	 */
   	protected  int serializeMipLogCnt400(char[] value) {
	    int  mipLogCnt400;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mipLogCnt400 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginMipLogCnt400
		       ,9
		      );
		 localMipLogCnt400Counter = shareString.getSerializedField().getModifiedCounter();
		return  mipLogCnt400;
    }

   protected int checkMipLogCnt400MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshMipLogCnt400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMipLogCnt400() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMipLogCnt400
			                 ,MIP_LOG_CNT_400_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mipLogCnt400", beginMipLogCnt400,MIP_LOG_CNT_400_LEN);
    }
   	}
     int localZLogCnt400Counter = -1;
     public boolean isZLogCnt400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZLogCnt400Counter != sharedCounter;
         localZLogCnt400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of zLogCnt400
	 *	@return zLogCnt400
	 */
	public char[]  getZLogCnt400String() {
	     return getCharArray(beginZLogCnt400,Z_LOG_CNT_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean zLogCnt400IsNumeric() {
	    return isNumeric(beginZLogCnt400
	                    ,beginZLogCnt400 + Z_LOG_CNT_400_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int Z_LOG_CNT_400_LEN = 9;
  	/**
	 * serializeZLogCnt400
	 */
	protected void serializeZLogCnt400(int zLogCnt400) {
		 putNumber(beginZLogCnt400,zLogCnt400,Z_LOG_CNT_400_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localZLogCnt400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeZLogCnt400
	 */
   	protected  int serializeZLogCnt400(char[] value) {
	    int  zLogCnt400;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    zLogCnt400 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginZLogCnt400
		       ,9
		      );
		 localZLogCnt400Counter = shareString.getSerializedField().getModifiedCounter();
		return  zLogCnt400;
    }

   protected int checkZLogCnt400MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshZLogCnt400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshZLogCnt400() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginZLogCnt400
			                 ,Z_LOG_CNT_400_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("zLogCnt400", beginZLogCnt400,Z_LOG_CNT_400_LEN);
    }
   	}
     int localZLogBypass400Counter = -1;
     public boolean isZLogBypass400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZLogBypass400Counter != sharedCounter;
         localZLogBypass400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of zLogBypass400
	 *	@return zLogBypass400
	 */
	public char[]  getZLogBypass400String() {
	     return getCharArray(beginZLogBypass400,Z_LOG_BYPASS_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean zLogBypass400IsNumeric() {
	    return isNumeric(beginZLogBypass400
	                    ,beginZLogBypass400 + Z_LOG_BYPASS_400_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int Z_LOG_BYPASS_400_LEN = 9;
  	/**
	 * serializeZLogBypass400
	 */
	protected void serializeZLogBypass400(int zLogBypass400) {
		 putNumber(beginZLogBypass400,zLogBypass400,Z_LOG_BYPASS_400_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localZLogBypass400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeZLogBypass400
	 */
   	protected  int serializeZLogBypass400(char[] value) {
	    int  zLogBypass400;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    zLogBypass400 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginZLogBypass400
		       ,9
		      );
		 localZLogBypass400Counter = shareString.getSerializedField().getModifiedCounter();
		return  zLogBypass400;
    }

   protected int checkZLogBypass400MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshZLogBypass400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshZLogBypass400() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginZLogBypass400
			                 ,Z_LOG_BYPASS_400_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("zLogBypass400", beginZLogBypass400,Z_LOG_BYPASS_400_LEN);
    }
   	}
     int localExecStartMsg600Counter = -1;
     public boolean isExecStartMsg600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExecStartMsg600Counter != sharedCounter;
         localExecStartMsg600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkExecStartMsg600Constraints(char[] value) {
   			return super.checkConstraints(value , 64 ,false, false);
   }
     int localCurrDateYyyy600Counter = -1;
     public boolean isCurrDateYyyy600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrDateYyyy600Counter != sharedCounter;
         localCurrDateYyyy600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCurrDateYyyy600Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localCurrDateMm600Counter = -1;
     public boolean isCurrDateMm600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrDateMm600Counter != sharedCounter;
         localCurrDateMm600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCurrDateMm600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localCurrDateDd600Counter = -1;
     public boolean isCurrDateDd600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrDateDd600Counter != sharedCounter;
         localCurrDateDd600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCurrDateDd600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localCurrTimeHh600Counter = -1;
     public boolean isCurrTimeHh600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrTimeHh600Counter != sharedCounter;
         localCurrTimeHh600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCurrTimeHh600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localCurrTimeMm600Counter = -1;
     public boolean isCurrTimeMm600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrTimeMm600Counter != sharedCounter;
         localCurrTimeMm600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCurrTimeMm600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localCurrTimeSs600Counter = -1;
     public boolean isCurrTimeSs600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrTimeSs600Counter != sharedCounter;
         localCurrTimeSs600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCurrTimeSs600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localMessage6008000Counter = -1;
     public boolean isMessage6008000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMessage6008000Counter != sharedCounter;
         localMessage6008000Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMessage6008000Constraints(char[] value) {
   			return super.checkConstraints(value , 62 ,false, false);
   }
     int localMessage6008999Counter = -1;
     public boolean isMessage6008999Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMessage6008999Counter != sharedCounter;
         localMessage6008999Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMessage6008999Constraints(char[] value) {
   			return super.checkConstraints(value , 62 ,false, false);
   }
     int localEojMessage6009400Counter = -1;
     public boolean isEojMessage6009400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEojMessage6009400Counter != sharedCounter;
         localEojMessage6009400Counter = sharedCounter; return hasModified;
     }

   protected char[] checkEojMessage6009400Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
     int localTranlogTimeHh800Counter = -1;
     public boolean isTranlogTimeHh800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranlogTimeHh800Counter != sharedCounter;
         localTranlogTimeHh800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tranlogTimeHh800
	 *	@return tranlogTimeHh800
	 */
	public char[]  getTranlogTimeHh800String() {
	     return getCharArray(beginTranlogTimeHh800,TRANLOG_TIME_HH_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranlogTimeHh800IsNumeric() {
	    return isNumeric(beginTranlogTimeHh800
	                    ,beginTranlogTimeHh800 + TRANLOG_TIME_HH_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRANLOG_TIME_HH_800_LEN = 2;
  	/**
	 * serializeTranlogTimeHh800
	 */
	protected void serializeTranlogTimeHh800(int tranlogTimeHh800) {
		 putNumber(beginTranlogTimeHh800,tranlogTimeHh800,TRANLOG_TIME_HH_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTranlogTimeHh800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTranlogTimeHh800
	 */
   	protected  int serializeTranlogTimeHh800(char[] value) {
	    int  tranlogTimeHh800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tranlogTimeHh800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginTranlogTimeHh800
		       ,2
		      );
		 localTranlogTimeHh800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tranlogTimeHh800;
    }

   protected int checkTranlogTimeHh800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTranlogTimeHh800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTranlogTimeHh800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTranlogTimeHh800
			                 ,TRANLOG_TIME_HH_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tranlogTimeHh800", beginTranlogTimeHh800,TRANLOG_TIME_HH_800_LEN);
    }
   	}
     int localTranlogTimeMm800Counter = -1;
     public boolean isTranlogTimeMm800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranlogTimeMm800Counter != sharedCounter;
         localTranlogTimeMm800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tranlogTimeMm800
	 *	@return tranlogTimeMm800
	 */
	public char[]  getTranlogTimeMm800String() {
	     return getCharArray(beginTranlogTimeMm800,TRANLOG_TIME_MM_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranlogTimeMm800IsNumeric() {
	    return isNumeric(beginTranlogTimeMm800
	                    ,beginTranlogTimeMm800 + TRANLOG_TIME_MM_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRANLOG_TIME_MM_800_LEN = 2;
  	/**
	 * serializeTranlogTimeMm800
	 */
	protected void serializeTranlogTimeMm800(int tranlogTimeMm800) {
		 putNumber(beginTranlogTimeMm800,tranlogTimeMm800,TRANLOG_TIME_MM_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTranlogTimeMm800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTranlogTimeMm800
	 */
   	protected  int serializeTranlogTimeMm800(char[] value) {
	    int  tranlogTimeMm800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tranlogTimeMm800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginTranlogTimeMm800
		       ,2
		      );
		 localTranlogTimeMm800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tranlogTimeMm800;
    }

   protected int checkTranlogTimeMm800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTranlogTimeMm800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTranlogTimeMm800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTranlogTimeMm800
			                 ,TRANLOG_TIME_MM_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tranlogTimeMm800", beginTranlogTimeMm800,TRANLOG_TIME_MM_800_LEN);
    }
   	}
     int localTranlogTimeSs800Counter = -1;
     public boolean isTranlogTimeSs800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranlogTimeSs800Counter != sharedCounter;
         localTranlogTimeSs800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tranlogTimeSs800
	 *	@return tranlogTimeSs800
	 */
	public char[]  getTranlogTimeSs800String() {
	     return getCharArray(beginTranlogTimeSs800,TRANLOG_TIME_SS_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranlogTimeSs800IsNumeric() {
	    return isNumeric(beginTranlogTimeSs800
	                    ,beginTranlogTimeSs800 + TRANLOG_TIME_SS_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRANLOG_TIME_SS_800_LEN = 2;
  	/**
	 * serializeTranlogTimeSs800
	 */
	protected void serializeTranlogTimeSs800(int tranlogTimeSs800) {
		 putNumber(beginTranlogTimeSs800,tranlogTimeSs800,TRANLOG_TIME_SS_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTranlogTimeSs800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTranlogTimeSs800
	 */
   	protected  int serializeTranlogTimeSs800(char[] value) {
	    int  tranlogTimeSs800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tranlogTimeSs800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginTranlogTimeSs800
		       ,2
		      );
		 localTranlogTimeSs800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tranlogTimeSs800;
    }

   protected int checkTranlogTimeSs800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTranlogTimeSs800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTranlogTimeSs800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTranlogTimeSs800
			                 ,TRANLOG_TIME_SS_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tranlogTimeSs800", beginTranlogTimeSs800,TRANLOG_TIME_SS_800_LEN);
    }
   	}
     int localTranlogDateMm800Counter = -1;
     public boolean isTranlogDateMm800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranlogDateMm800Counter != sharedCounter;
         localTranlogDateMm800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tranlogDateMm800
	 *	@return tranlogDateMm800
	 */
	public char[]  getTranlogDateMm800String() {
	     return getCharArray(beginTranlogDateMm800,TRANLOG_DATE_MM_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranlogDateMm800IsNumeric() {
	    return isNumeric(beginTranlogDateMm800
	                    ,beginTranlogDateMm800 + TRANLOG_DATE_MM_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRANLOG_DATE_MM_800_LEN = 2;
  	/**
	 * serializeTranlogDateMm800
	 */
	protected void serializeTranlogDateMm800(int tranlogDateMm800) {
		 putNumber(beginTranlogDateMm800,tranlogDateMm800,TRANLOG_DATE_MM_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTranlogDateMm800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTranlogDateMm800
	 */
   	protected  int serializeTranlogDateMm800(char[] value) {
	    int  tranlogDateMm800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tranlogDateMm800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginTranlogDateMm800
		       ,2
		      );
		 localTranlogDateMm800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tranlogDateMm800;
    }

   protected int checkTranlogDateMm800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTranlogDateMm800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTranlogDateMm800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTranlogDateMm800
			                 ,TRANLOG_DATE_MM_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tranlogDateMm800", beginTranlogDateMm800,TRANLOG_DATE_MM_800_LEN);
    }
   	}
     int localTranlogDateDd800Counter = -1;
     public boolean isTranlogDateDd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranlogDateDd800Counter != sharedCounter;
         localTranlogDateDd800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tranlogDateDd800
	 *	@return tranlogDateDd800
	 */
	public char[]  getTranlogDateDd800String() {
	     return getCharArray(beginTranlogDateDd800,TRANLOG_DATE_DD_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranlogDateDd800IsNumeric() {
	    return isNumeric(beginTranlogDateDd800
	                    ,beginTranlogDateDd800 + TRANLOG_DATE_DD_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRANLOG_DATE_DD_800_LEN = 2;
  	/**
	 * serializeTranlogDateDd800
	 */
	protected void serializeTranlogDateDd800(int tranlogDateDd800) {
		 putNumber(beginTranlogDateDd800,tranlogDateDd800,TRANLOG_DATE_DD_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTranlogDateDd800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTranlogDateDd800
	 */
   	protected  int serializeTranlogDateDd800(char[] value) {
	    int  tranlogDateDd800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tranlogDateDd800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginTranlogDateDd800
		       ,2
		      );
		 localTranlogDateDd800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tranlogDateDd800;
    }

   protected int checkTranlogDateDd800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTranlogDateDd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTranlogDateDd800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTranlogDateDd800
			                 ,TRANLOG_DATE_DD_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tranlogDateDd800", beginTranlogDateDd800,TRANLOG_DATE_DD_800_LEN);
    }
   	}
     int localTranlogDateYy800Counter = -1;
     public boolean isTranlogDateYy800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranlogDateYy800Counter != sharedCounter;
         localTranlogDateYy800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tranlogDateYy800
	 *	@return tranlogDateYy800
	 */
	public char[]  getTranlogDateYy800String() {
	     return getCharArray(beginTranlogDateYy800,TRANLOG_DATE_YY_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranlogDateYy800IsNumeric() {
	    return isNumeric(beginTranlogDateYy800
	                    ,beginTranlogDateYy800 + TRANLOG_DATE_YY_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRANLOG_DATE_YY_800_LEN = 2;
  	/**
	 * serializeTranlogDateYy800
	 */
	protected void serializeTranlogDateYy800(int tranlogDateYy800) {
		 putNumber(beginTranlogDateYy800,tranlogDateYy800,TRANLOG_DATE_YY_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTranlogDateYy800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTranlogDateYy800
	 */
   	protected  int serializeTranlogDateYy800(char[] value) {
	    int  tranlogDateYy800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tranlogDateYy800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginTranlogDateYy800
		       ,2
		      );
		 localTranlogDateYy800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tranlogDateYy800;
    }

   protected int checkTranlogDateYy800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTranlogDateYy800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTranlogDateYy800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTranlogDateYy800
			                 ,TRANLOG_DATE_YY_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tranlogDateYy800", beginTranlogDateYy800,TRANLOG_DATE_YY_800_LEN);
    }
   	}
     int localTranlogDateCc800Counter = -1;
     public boolean isTranlogDateCc800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranlogDateCc800Counter != sharedCounter;
         localTranlogDateCc800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tranlogDateCc800
	 *	@return tranlogDateCc800
	 */
	public char[]  getTranlogDateCc800String() {
	     return getCharArray(beginTranlogDateCc800,TRANLOG_DATE_CC_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranlogDateCc800IsNumeric() {
	    return isNumeric(beginTranlogDateCc800
	                    ,beginTranlogDateCc800 + TRANLOG_DATE_CC_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRANLOG_DATE_CC_800_LEN = 2;
  	/**
	 * serializeTranlogDateCc800
	 */
	protected void serializeTranlogDateCc800(int tranlogDateCc800) {
		 putNumber(beginTranlogDateCc800,tranlogDateCc800,TRANLOG_DATE_CC_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTranlogDateCc800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTranlogDateCc800
	 */
   	protected  int serializeTranlogDateCc800(char[] value) {
	    int  tranlogDateCc800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tranlogDateCc800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginTranlogDateCc800
		       ,2
		      );
		 localTranlogDateCc800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tranlogDateCc800;
    }

   protected int checkTranlogDateCc800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTranlogDateCc800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTranlogDateCc800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTranlogDateCc800
			                 ,TRANLOG_DATE_CC_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tranlogDateCc800", beginTranlogDateCc800,TRANLOG_DATE_CC_800_LEN);
    }
   	}




}
  
