package com.cloudframe.app.ip088030.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAbendCode300;
            protected  int beginReadCnt400;
            protected  int beginWriteCnt400;
	
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
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginAbendCode300 = getStartOffset() + 0;	// set offset for serialization
  
             beginReadCnt400 = getStartOffset() + 4;	// set offset for serialization
  
             beginWriteCnt400 = getStartOffset() + 14;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localIsTxnQualify100Counter = -1;
     public boolean isIsTxnQualify100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsTxnQualify100Counter != sharedCounter;
         localIsTxnQualify100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsTxnQualify100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsMccFound100Counter = -1;
     public boolean isIsMccFound100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsMccFound100Counter != sharedCounter;
         localIsMccFound100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsMccFound100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsMaidFound100Counter = -1;
     public boolean isIsMaidFound100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsMaidFound100Counter != sharedCounter;
         localIsMaidFound100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsMaidFound100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsArRecFound100Counter = -1;
     public boolean isIsArRecFound100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsArRecFound100Counter != sharedCounter;
         localIsArRecFound100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsArRecFound100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsEndOfLoop100Counter = -1;
     public boolean isIsEndOfLoop100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsEndOfLoop100Counter != sharedCounter;
         localIsEndOfLoop100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsEndOfLoop100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsIchgCalculated100Counter = -1;
     public boolean isIsIchgCalculated100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsIchgCalculated100Counter != sharedCounter;
         localIsIchgCalculated100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsIchgCalculated100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys001FileStatus200Counter = -1;
     public boolean isSys001FileStatus200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001FileStatus200Counter != sharedCounter;
         localSys001FileStatus200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys001FileStatus200Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localSys002FileStatus200Counter = -1;
     public boolean isSys002FileStatus200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys002FileStatus200Counter != sharedCounter;
         localSys002FileStatus200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys002FileStatus200Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localSys201FileStatus200Counter = -1;
     public boolean isSys201FileStatus200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201FileStatus200Counter != sharedCounter;
         localSys201FileStatus200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys201FileStatus200Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localPgmId300Counter = -1;
     public boolean isPgmId300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmId300Counter != sharedCounter;
         localPgmId300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmId300Constraints(char[] value) {
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
     int localPgmIp610010300Counter = -1;
     public boolean isPgmIp610010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp610010300Counter != sharedCounter;
         localPgmIp610010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp610010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp081110300Counter = -1;
     public boolean isPgmIp081110300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp081110300Counter != sharedCounter;
         localPgmIp081110300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp081110300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp280010300Counter = -1;
     public boolean isPgmIp280010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp280010300Counter != sharedCounter;
         localPgmIp280010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp280010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp280510300Counter = -1;
     public boolean isPgmIp280510300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp280510300Counter != sharedCounter;
         localPgmIp280510300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp280510300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp282010300Counter = -1;
     public boolean isPgmIp282010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp282010300Counter != sharedCounter;
         localPgmIp282010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp282010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp288010300Counter = -1;
     public boolean isPgmIp288010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp288010300Counter != sharedCounter;
         localPgmIp288010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp288010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp783510300Counter = -1;
     public boolean isPgmIp783510300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp783510300Counter != sharedCounter;
         localPgmIp783510300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp783510300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp996010300Counter = -1;
     public boolean isPgmIp996010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp996010300Counter != sharedCounter;
         localPgmIp996010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp996010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localValueC300Counter = -1;
     public boolean isValueC300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueC300Counter != sharedCounter;
         localValueC300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueC300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localValueD300Counter = -1;
     public boolean isValueD300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueD300Counter != sharedCounter;
         localValueD300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueD300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
         int localVal1300Counter = -1;
         public boolean isVal1300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localVal1300Counter != sharedCounter;
            localVal1300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkVal1300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localMinus1300Counter = -1;
         public boolean isMinus1300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMinus1300Counter != sharedCounter;
            localMinus1300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkMinus1300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localAbendParaName300Counter = -1;
     public boolean isAbendParaName300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendParaName300Counter != sharedCounter;
         localAbendParaName300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendParaName300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localAbendCode300Counter = -1;
     public boolean isAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode300Counter != sharedCounter;
         localAbendCode300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of abendCode300
	 *	@return abendCode300
	 */
	public char[]  getAbendCode300String() {
	     return getCharArray(beginAbendCode300,ABEND_CODE_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode300IsNumeric() {
	    return isNumeric(beginAbendCode300
	                    ,beginAbendCode300 + ABEND_CODE_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ABEND_CODE_300_LEN = 4;
  	/**
	 * serializeAbendCode300
	 */
	protected void serializeAbendCode300(int abendCode300) {
		 putNumber(beginAbendCode300,abendCode300,ABEND_CODE_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAbendCode300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAbendCode300
	 */
   	protected  int serializeAbendCode300(char[] value) {
	    int  abendCode300;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    abendCode300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAbendCode300
		       ,4
		      );
		 localAbendCode300Counter = shareString.getSerializedField().getModifiedCounter();
		return  abendCode300;
    }

   protected int checkAbendCode300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAbendCode300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAbendCode300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAbendCode300
			                 ,ABEND_CODE_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("abendCode300", beginAbendCode300,ABEND_CODE_300_LEN);
    }
   	}
     int localReadCnt400Counter = -1;
     public boolean isReadCnt400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReadCnt400Counter != sharedCounter;
         localReadCnt400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of readCnt400
	 *	@return readCnt400
	 */
	public char[]  getReadCnt400String() {
	     return getCharArray(beginReadCnt400,READ_CNT_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean readCnt400IsNumeric() {
	    return isNumeric(beginReadCnt400
	                    ,beginReadCnt400 + READ_CNT_400_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int READ_CNT_400_LEN = 10;
  	/**
	 * serializeReadCnt400
	 */
	protected void serializeReadCnt400(long readCnt400) {
		 putNumber(beginReadCnt400,readCnt400,READ_CNT_400_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localReadCnt400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeReadCnt400
	 */
   	protected  long serializeReadCnt400(char[] value) {
	    long  readCnt400;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    readCnt400 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginReadCnt400
		       ,10
		      );
		 localReadCnt400Counter = shareString.getSerializedField().getModifiedCounter();
		return  readCnt400;
    }

   protected long checkReadCnt400MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshReadCnt400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshReadCnt400() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginReadCnt400
			                 ,READ_CNT_400_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("readCnt400", beginReadCnt400,READ_CNT_400_LEN);
    }
   	}
     int localWriteCnt400Counter = -1;
     public boolean isWriteCnt400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWriteCnt400Counter != sharedCounter;
         localWriteCnt400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of writeCnt400
	 *	@return writeCnt400
	 */
	public char[]  getWriteCnt400String() {
	     return getCharArray(beginWriteCnt400,WRITE_CNT_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean writeCnt400IsNumeric() {
	    return isNumeric(beginWriteCnt400
	                    ,beginWriteCnt400 + WRITE_CNT_400_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WRITE_CNT_400_LEN = 10;
  	/**
	 * serializeWriteCnt400
	 */
	protected void serializeWriteCnt400(long writeCnt400) {
		 putNumber(beginWriteCnt400,writeCnt400,WRITE_CNT_400_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWriteCnt400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWriteCnt400
	 */
   	protected  long serializeWriteCnt400(char[] value) {
	    long  writeCnt400;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    writeCnt400 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginWriteCnt400
		       ,10
		      );
		 localWriteCnt400Counter = shareString.getSerializedField().getModifiedCounter();
		return  writeCnt400;
    }

   protected long checkWriteCnt400MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWriteCnt400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWriteCnt400() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginWriteCnt400
			                 ,WRITE_CNT_400_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("writeCnt400", beginWriteCnt400,WRITE_CNT_400_LEN);
    }
   	}
     int localAbendMsgTblErr600Counter = -1;
     public boolean isAbendMsgTblErr600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendMsgTblErr600Counter != sharedCounter;
         localAbendMsgTblErr600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendMsgTblErr600Constraints(char[] value) {
   			return super.checkConstraints(value , 42 ,false, false);
   }
     int localPtrIp610010800Counter = -1;
     public boolean isPtrIp610010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp610010800Counter != sharedCounter;
         localPtrIp610010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp610010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp081110800Counter = -1;
     public boolean isPtrIp081110800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp081110800Counter != sharedCounter;
         localPtrIp081110800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp081110800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp280010800Counter = -1;
     public boolean isPtrIp280010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp280010800Counter != sharedCounter;
         localPtrIp280010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp280010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp280510800Counter = -1;
     public boolean isPtrIp280510800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp280510800Counter != sharedCounter;
         localPtrIp280510800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp280510800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp282010800Counter = -1;
     public boolean isPtrIp282010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp282010800Counter != sharedCounter;
         localPtrIp282010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp282010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp288010800Counter = -1;
     public boolean isPtrIp288010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp288010800Counter != sharedCounter;
         localPtrIp288010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp288010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp783510800Counter = -1;
     public boolean isPtrIp783510800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp783510800Counter != sharedCounter;
         localPtrIp783510800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp783510800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp996010800Counter = -1;
     public boolean isPtrIp996010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp996010800Counter != sharedCounter;
         localPtrIp996010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp996010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }




}
  
