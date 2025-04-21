package com.cloudframe.app.ip343900.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
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
            protected  int beginSys001Status200;
            protected  int beginValue4300;
            protected  int beginValue1300;
            protected  int beginInsRecCnt400;
            protected  int beginInsCmtCnt400;
	
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
  
             beginSys001Status200 = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
             beginValue4300 = getStartOffset() + 2;	// set offset for serialization
  
             beginValue1300 = getStartOffset() + 3;	// set offset for serialization
  
  
  
  
  
  
  
             beginInsRecCnt400 = getStartOffset() + 4;	// set offset for serialization
  
             beginInsCmtCnt400 = getStartOffset() + 16;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localCheckIsItGlobal100Counter = -1;
     public boolean isCheckIsItGlobal100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCheckIsItGlobal100Counter != sharedCounter;
         localCheckIsItGlobal100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCheckIsItGlobal100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys001Status200Counter = -1;
     public boolean isSys001Status200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001Status200Counter != sharedCounter;
         localSys001Status200Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sys001Status200
	 *	@return sys001Status200
	 */
	public char[]  getSys001Status200String() {
	     return getCharArray(beginSys001Status200,SYS_001_STATUS_200_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys001Status200IsNumeric() {
	    return isNumeric(beginSys001Status200
	                    ,beginSys001Status200 + SYS_001_STATUS_200_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SYS_001_STATUS_200_LEN = 2;
  	/**
	 * serializeSys001Status200
	 */
	protected void serializeSys001Status200(int sys001Status200) {
		 putNumber(beginSys001Status200,sys001Status200,SYS_001_STATUS_200_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSys001Status200Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSys001Status200
	 */
   	protected  int serializeSys001Status200(char[] value) {
	    int  sys001Status200;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sys001Status200 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginSys001Status200
		       ,2
		      );
		 localSys001Status200Counter = shareString.getSerializedField().getModifiedCounter();
		return  sys001Status200;
    }

   protected int checkSys001Status200MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSys001Status200 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSys001Status200() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSys001Status200
			                 ,SYS_001_STATUS_200_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sys001Status200", beginSys001Status200,SYS_001_STATUS_200_LEN);
    }
   	}
     int localSys067Status200Counter = -1;
     public boolean isSys067Status200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys067Status200Counter != sharedCounter;
         localSys067Status200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys067Status200Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
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
     int localPgmIp532010300Counter = -1;
     public boolean isPgmIp532010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp532010300Counter != sharedCounter;
         localPgmIp532010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp532010300Constraints(char[] value) {
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
     int localPgmIp282210300Counter = -1;
     public boolean isPgmIp282210300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp282210300Counter != sharedCounter;
         localPgmIp282210300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp282210300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp703020300Counter = -1;
     public boolean isPgmIp703020300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp703020300Counter != sharedCounter;
         localPgmIp703020300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp703020300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp750080300Counter = -1;
     public boolean isPgmIp750080300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp750080300Counter != sharedCounter;
         localPgmIp750080300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp750080300Constraints(char[] value) {
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
     int localPgmIp996020300Counter = -1;
     public boolean isPgmIp996020300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp996020300Counter != sharedCounter;
         localPgmIp996020300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp996020300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localProgramId300Counter = -1;
     public boolean isProgramId300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProgramId300Counter != sharedCounter;
         localProgramId300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkProgramId300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localAbendPgm300Counter = -1;
     public boolean isAbendPgm300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendPgm300Counter != sharedCounter;
         localAbendPgm300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendPgm300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localValue4300Counter = -1;
     public boolean isValue4300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue4300Counter != sharedCounter;
         localValue4300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value4300
	 *	@return value4300
	 */
	public char[]  getValue4300String() {
	     return getCharArray(beginValue4300,VALUE_4300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value4300IsNumeric() {
	    return isNumeric(beginValue4300
	                    ,beginValue4300 + VALUE_4300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_4300_LEN = 1;
  	/**
	 * serializeValue4300
	 */
	protected void serializeValue4300(int value4300) {
		 putNumber(beginValue4300,value4300,VALUE_4300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue4300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue4300
	 */
   	protected  int serializeValue4300(char[] value) {
	    int  value4300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value4300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginValue4300
		       ,1
		      );
		 localValue4300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value4300;
    }

   protected int checkValue4300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue4300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue4300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue4300
			                 ,VALUE_4300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value4300", beginValue4300,VALUE_4300_LEN);
    }
   	}
     int localValue1300Counter = -1;
     public boolean isValue1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue1300Counter != sharedCounter;
         localValue1300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value1300
	 *	@return value1300
	 */
	public char[]  getValue1300String() {
	     return getCharArray(beginValue1300,VALUE_1300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1300IsNumeric() {
	    return isNumeric(beginValue1300
	                    ,beginValue1300 + VALUE_1300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_1300_LEN = 1;
  	/**
	 * serializeValue1300
	 */
	protected void serializeValue1300(int value1300) {
		 putNumber(beginValue1300,value1300,VALUE_1300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue1300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue1300
	 */
   	protected  int serializeValue1300(char[] value) {
	    int  value1300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value1300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginValue1300
		       ,1
		      );
		 localValue1300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value1300;
    }

   protected int checkValue1300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue1300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue1300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue1300
			                 ,VALUE_1300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value1300", beginValue1300,VALUE_1300_LEN);
    }
   	}
     int localValueGlobal300Counter = -1;
     public boolean isValueGlobal300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueGlobal300Counter != sharedCounter;
         localValueGlobal300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueGlobal300Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
     int localValueLpidn300Counter = -1;
     public boolean isValueLpidn300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueLpidn300Counter != sharedCounter;
         localValueLpidn300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueLpidn300Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
     int localOpenAbendCode300Counter = -1;
     public boolean isOpenAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOpenAbendCode300Counter != sharedCounter;
         localOpenAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOpenAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localReadAbendCode300Counter = -1;
     public boolean isReadAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReadAbendCode300Counter != sharedCounter;
         localReadAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkReadAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localCloseAbendCode300Counter = -1;
     public boolean isCloseAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCloseAbendCode300Counter != sharedCounter;
         localCloseAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCloseAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localParaName300Counter = -1;
     public boolean isParaName300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParaName300Counter != sharedCounter;
         localParaName300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkParaName300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localInsRecCnt400Counter = -1;
     public boolean isInsRecCnt400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInsRecCnt400Counter != sharedCounter;
         localInsRecCnt400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of insRecCnt400
	 *	@return insRecCnt400
	 */
	public char[]  getInsRecCnt400String() {
	     return getCharArray(beginInsRecCnt400,INS_REC_CNT_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean insRecCnt400IsNumeric() {
	    return isNumeric(beginInsRecCnt400
	                    ,beginInsRecCnt400 + INS_REC_CNT_400_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int INS_REC_CNT_400_LEN = 12;
  	/**
	 * serializeInsRecCnt400
	 */
	protected void serializeInsRecCnt400(long insRecCnt400) {
		 putNumber(beginInsRecCnt400,insRecCnt400,INS_REC_CNT_400_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInsRecCnt400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeInsRecCnt400
	 */
   	protected  long serializeInsRecCnt400(char[] value) {
	    long  insRecCnt400;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    insRecCnt400 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginInsRecCnt400
		       ,12
		      );
		 localInsRecCnt400Counter = shareString.getSerializedField().getModifiedCounter();
		return  insRecCnt400;
    }

   protected long checkInsRecCnt400MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshInsRecCnt400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshInsRecCnt400() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginInsRecCnt400
			                 ,INS_REC_CNT_400_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("insRecCnt400", beginInsRecCnt400,INS_REC_CNT_400_LEN);
    }
   	}
     int localInsCmtCnt400Counter = -1;
     public boolean isInsCmtCnt400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInsCmtCnt400Counter != sharedCounter;
         localInsCmtCnt400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of insCmtCnt400
	 *	@return insCmtCnt400
	 */
	public char[]  getInsCmtCnt400String() {
	     return getCharArray(beginInsCmtCnt400,INS_CMT_CNT_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean insCmtCnt400IsNumeric() {
	    return isNumeric(beginInsCmtCnt400
	                    ,beginInsCmtCnt400 + INS_CMT_CNT_400_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int INS_CMT_CNT_400_LEN = 4;
  	/**
	 * serializeInsCmtCnt400
	 */
	protected void serializeInsCmtCnt400(int insCmtCnt400) {
		 putNumber(beginInsCmtCnt400,insCmtCnt400,INS_CMT_CNT_400_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInsCmtCnt400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeInsCmtCnt400
	 */
   	protected  int serializeInsCmtCnt400(char[] value) {
	    int  insCmtCnt400;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    insCmtCnt400 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginInsCmtCnt400
		       ,4
		      );
		 localInsCmtCnt400Counter = shareString.getSerializedField().getModifiedCounter();
		return  insCmtCnt400;
    }

   protected int checkInsCmtCnt400MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshInsCmtCnt400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshInsCmtCnt400() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginInsCmtCnt400
			                 ,INS_CMT_CNT_400_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("insCmtCnt400", beginInsCmtCnt400,INS_CMT_CNT_400_LEN);
    }
   	}
     int localAmsOnsoilSw800Counter = -1;
     public boolean isAmsOnsoilSw800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmsOnsoilSw800Counter != sharedCounter;
         localAmsOnsoilSw800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAmsOnsoilSw800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localPtrIp532010800Counter = -1;
     public boolean isPtrIp532010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp532010800Counter != sharedCounter;
         localPtrIp532010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp532010800Constraints(char[] value) {
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
     int localPtrIp282210800Counter = -1;
     public boolean isPtrIp282210800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp282210800Counter != sharedCounter;
         localPtrIp282210800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp282210800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp703020800Counter = -1;
     public boolean isPtrIp703020800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp703020800Counter != sharedCounter;
         localPtrIp703020800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp703020800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp750080800Counter = -1;
     public boolean isPtrIp750080800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp750080800Counter != sharedCounter;
         localPtrIp750080800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp750080800Constraints(char[] value) {
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
     int localPtrIp996020800Counter = -1;
     public boolean isPtrIp996020800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp996020800Counter != sharedCounter;
         localPtrIp996020800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp996020800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localAbendPtr800Counter = -1;
     public boolean isAbendPtr800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendPtr800Counter != sharedCounter;
         localAbendPtr800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendPtr800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localAstriskLine900Counter = -1;
     public boolean isAstriskLine900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAstriskLine900Counter != sharedCounter;
         localAstriskLine900Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAstriskLine900Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
     int localAbendAbend900Counter = -1;
     public boolean isAbendAbend900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendAbend900Counter != sharedCounter;
         localAbendAbend900Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendAbend900Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
     int localAbendAbendPgm900Counter = -1;
     public boolean isAbendAbendPgm900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendAbendPgm900Counter != sharedCounter;
         localAbendAbendPgm900Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendAbendPgm900Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }




}
  
