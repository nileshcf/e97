package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 341;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDateWs;
            protected  int beginValue1300;
            protected  int beginValue10300;
            protected  int beginValue100300;
            protected  int beginIp00321ReplTextCount;
            protected  int beginI;
            protected  int beginDate3;
            protected  int beginIdx;
            protected  int beginIp33701RateSrcToTrg;
           protected int beginSubValueCount400;
           protected static final int SUB_VALUE_COUNT_400_SIZE = 100;
            protected  int beginNumSpaces;
            protected  int beginEcbRateDiff800;
            protected  int beginClearingDtTm9800;
            protected  int beginClearingDtTm9700;
            protected  int beginClearingDtTm9Short800;
            protected  int beginVar1N;
            protected  int beginVar1Ed;
            protected  int beginVar2Ed;
            protected  int beginIp00104Elsub;
	
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
  
             beginDateWs = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginValue1300 = getStartOffset() + 8;	// set offset for serialization
  
             beginValue10300 = getStartOffset() + 9;	// set offset for serialization
  
             beginValue100300 = getStartOffset() + 11;	// set offset for serialization
  
  
             beginIp00321ReplTextCount = getStartOffset() + 14;	// set offset for serialization
  
  
  
  
             beginI = getStartOffset() + 15;	// set offset for serialization
  
             beginDate3 = getStartOffset() + 16;	// set offset for serialization
  
  
  
             beginIdx = getStartOffset() + 28;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
             beginIp33701RateSrcToTrg = getStartOffset() + 31;	// set offset for serialization
  
	        beginSubValueCount400 = getStartOffset() + 46; // set offset for serialization
  
  
  
             beginNumSpaces = getStartOffset() + 246;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginEcbRateDiff800 = getStartOffset() + 255;	// set offset for serialization
  
             beginClearingDtTm9800 = getStartOffset() + 267;	// set offset for serialization
  
             beginClearingDtTm9700 = getStartOffset() + 279;	// set offset for serialization
  
  
             beginClearingDtTm9Short800 = getStartOffset() + 291;	// set offset for serialization
  
  
  
             beginVar1N = getStartOffset() + 299;	// set offset for serialization
  
             beginVar1Ed = getStartOffset() + 310;	// set offset for serialization
  
             beginVar2Ed = getStartOffset() + 324;	// set offset for serialization
  
  
             beginIp00104Elsub = getStartOffset() + 338;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMcissuesWhenCompiledCounter = -1;
     public boolean isMcissuesWhenCompiledModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcissuesWhenCompiledCounter != sharedCounter;
         localMcissuesWhenCompiledCounter = sharedCounter; return hasModified;
     }

   protected char[] checkMcissuesWhenCompiledConstraints(char[] value) {
   			return super.checkConstraints(value , 17 ,false, false);
   }
     int localDateWsCounter = -1;
     public boolean isDateWsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDateWsCounter != sharedCounter;
         localDateWsCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dateWs
	 *	@return dateWs
	 */
	public char[]  getDateWsString() {
	     return getCharArray(beginDateWs,DATE_WS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dateWsIsNumeric() {
	    return isNumeric(beginDateWs
	                    ,beginDateWs + DATE_WS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DATE_WS_LEN = 8;
  	/**
	 * serializeDateWs
	 */
	protected void serializeDateWs(long dateWs) {
		 putNumber(beginDateWs,dateWs,DATE_WS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDateWsCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDateWs
	 */
   	protected  long serializeDateWs(char[] value) {
	    long  dateWs;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dateWs = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginDateWs
		       ,8
		      );
		 localDateWsCounter = shareString.getSerializedField().getModifiedCounter();
		return  dateWs;
    }

   protected long checkDateWsMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDateWs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDateWs() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDateWs
			                 ,DATE_WS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dateWs", beginDateWs,DATE_WS_LEN);
    }
   	}
         int localIp20004ItemLengthCounter = -1;
         public boolean isIp20004ItemLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp20004ItemLengthCounter != sharedCounter;
            localIp20004ItemLengthCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkIp20004ItemLengthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localTmpLth800Counter = -1;
         public boolean isTmpLth800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTmpLth800Counter != sharedCounter;
            localTmpLth800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTmpLth800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
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
     int localValue10300Counter = -1;
     public boolean isValue10300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue10300Counter != sharedCounter;
         localValue10300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value10300
	 *	@return value10300
	 */
	public char[]  getValue10300String() {
	     return getCharArray(beginValue10300,VALUE_10300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value10300IsNumeric() {
	    return isNumeric(beginValue10300
	                    ,beginValue10300 + VALUE_10300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_10300_LEN = 2;
  	/**
	 * serializeValue10300
	 */
	protected void serializeValue10300(int value10300) {
		 putNumber(beginValue10300,value10300,VALUE_10300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue10300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue10300
	 */
   	protected  int serializeValue10300(char[] value) {
	    int  value10300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value10300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue10300
		       ,2
		      );
		 localValue10300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value10300;
    }

   protected int checkValue10300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue10300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue10300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue10300
			                 ,VALUE_10300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value10300", beginValue10300,VALUE_10300_LEN);
    }
   	}
     int localValue100300Counter = -1;
     public boolean isValue100300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue100300Counter != sharedCounter;
         localValue100300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value100300
	 *	@return value100300
	 */
	public char[]  getValue100300String() {
	     return getCharArray(beginValue100300,VALUE_100300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value100300IsNumeric() {
	    return isNumeric(beginValue100300
	                    ,beginValue100300 + VALUE_100300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_100300_LEN = 3;
  	/**
	 * serializeValue100300
	 */
	protected void serializeValue100300(int value100300) {
		 putNumber(beginValue100300,value100300,VALUE_100300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue100300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue100300
	 */
   	protected  int serializeValue100300(char[] value) {
	    int  value100300;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value100300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginValue100300
		       ,3
		      );
		 localValue100300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value100300;
    }

   protected int checkValue100300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue100300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue100300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue100300
			                 ,VALUE_100300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value100300", beginValue100300,VALUE_100300_LEN);
    }
   	}
         int localICtr400Counter = -1;
         public boolean isICtr400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localICtr400Counter != sharedCounter;
            localICtr400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkICtr400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localIp00321ReplTextCountCounter = -1;
     public boolean isIp00321ReplTextCountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00321ReplTextCountCounter != sharedCounter;
         localIp00321ReplTextCountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00321ReplTextCount
	 *	@return ip00321ReplTextCount
	 */
	public char[]  getIp00321ReplTextCountString() {
	     return getCharArray(beginIp00321ReplTextCount,IP_00321_REPL_TEXT_COUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00321ReplTextCountIsNumeric() {
	    return isNumeric(beginIp00321ReplTextCount
	                    ,beginIp00321ReplTextCount + IP_00321_REPL_TEXT_COUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00321_REPL_TEXT_COUNT_LEN = 1;
  	/**
	 * serializeIp00321ReplTextCount
	 */
	protected void serializeIp00321ReplTextCount(int ip00321ReplTextCount) {
		 putNumber(beginIp00321ReplTextCount,ip00321ReplTextCount,IP_00321_REPL_TEXT_COUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00321ReplTextCountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00321ReplTextCount
	 */
   	protected  int serializeIp00321ReplTextCount(char[] value) {
	    int  ip00321ReplTextCount;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00321ReplTextCount = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp00321ReplTextCount
		       ,1
		      );
		 localIp00321ReplTextCountCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00321ReplTextCount;
    }

   protected int checkIp00321ReplTextCountMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00321ReplTextCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00321ReplTextCount() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00321ReplTextCount
			                 ,IP_00321_REPL_TEXT_COUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00321ReplTextCount", beginIp00321ReplTextCount,IP_00321_REPL_TEXT_COUNT_LEN);
    }
   	}
         int localEditNumber800Counter = -1;
         public boolean isEditNumber800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEditNumber800Counter != sharedCounter;
            localEditNumber800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkEditNumber800MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localValueOfPds158s3800Counter = -1;
     public boolean isValueOfPds158s3800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueOfPds158s3800Counter != sharedCounter;
         localValueOfPds158s3800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueOfPds158s3800Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localValueOfPds158s2800Counter = -1;
     public boolean isValueOfPds158s2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueOfPds158s2800Counter != sharedCounter;
         localValueOfPds158s2800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueOfPds158s2800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localICounter = -1;
     public boolean isIModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localICounter != sharedCounter;
         localICounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of i
	 *	@return i
	 */
	public char[]  getIString() {
	     return getCharArray(beginI,I_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iIsNumeric() {
	    return isNumeric(beginI
	                    ,beginI + I_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int I_LEN = 1;
  	/**
	 * serializeI
	 */
	protected void serializeI(int i) {
		 putNumber(beginI,i,I_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localICounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeI
	 */
   	protected  int serializeI(char[] value) {
	    int  i;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    i = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginI
		       ,1
		      );
		 localICounter = shareString.getSerializedField().getModifiedCounter();
		return  i;
    }

   protected int checkIMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshI is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshI() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginI
			                 ,I_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("i", beginI,I_LEN);
    }
   	}
     int localDate3Counter = -1;
     public boolean isDate3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDate3Counter != sharedCounter;
         localDate3Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of date3
	 *	@return date3
	 */
	public char[]  getDate3String() {
	     return getCharArray(beginDate3,DATE_3_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean date3IsNumeric() {
	    return isNumeric(beginDate3
	                    ,beginDate3 + DATE_3_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DATE_3_LEN = 12;
  	/**
	 * serializeDate3
	 */
	protected void serializeDate3(long date3) {
		 putNumber(beginDate3,date3,DATE_3_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDate3Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDate3
	 */
   	protected  long serializeDate3(char[] value) {
	    long  date3;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    date3 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginDate3
		       ,12
		      );
		 localDate3Counter = shareString.getSerializedField().getModifiedCounter();
		return  date3;
    }

   protected long checkDate3MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDate3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDate3() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDate3
			                 ,DATE_3_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("date3", beginDate3,DATE_3_LEN);
    }
   	}
     int localSys295EffDate2Counter = -1;
     public boolean isSys295EffDate2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys295EffDate2Counter != sharedCounter;
         localSys295EffDate2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys295EffDate2Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localDisplayCounter = -1;
     public boolean isDisplayModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDisplayCounter != sharedCounter;
         localDisplayCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDisplayConstraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
     int localIdxCounter = -1;
     public boolean isIdxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIdxCounter != sharedCounter;
         localIdxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of idx
	 *	@return idx
	 */
	public char[]  getIdxString() {
	     return getCharArray(beginIdx,IDX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean idxIsNumeric() {
	    return isNumeric(beginIdx
	                    ,beginIdx + IDX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IDX_LEN = 3;
  	/**
	 * serializeIdx
	 */
	protected void serializeIdx(int idx) {
		 putNumber(beginIdx,idx,IDX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIdxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIdx
	 */
   	protected  int serializeIdx(char[] value) {
	    int  idx;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    idx = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIdx
		       ,3
		      );
		 localIdxCounter = shareString.getSerializedField().getModifiedCounter();
		return  idx;
    }

   protected int checkIdxMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIdx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIdx() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIdx
			                 ,IDX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("idx", beginIdx,IDX_LEN);
    }
   	}
         int localOneCounter = -1;
         public boolean isOneModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOneCounter != sharedCounter;
            localOneCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkOneMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localFourCounter = -1;
         public boolean isFourModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFourCounter != sharedCounter;
            localFourCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkFourMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localTwoCounter = -1;
         public boolean isTwoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTwoCounter != sharedCounter;
            localTwoCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTwoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localCondCounter = -1;
     public boolean isCondModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCondCounter != sharedCounter;
         localCondCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCondConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localXmlTag300Counter = -1;
     public boolean isXmlTag300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXmlTag300Counter != sharedCounter;
         localXmlTag300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkXmlTag300Constraints(char[] value) {
   			return super.checkConstraints(value , 43 ,false, false);
   }
     int localXmlData300Counter = -1;
     public boolean isXmlData300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXmlData300Counter != sharedCounter;
         localXmlData300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkXmlData300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localXmlTag2300Counter = -1;
     public boolean isXmlTag2300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXmlTag2300Counter != sharedCounter;
         localXmlTag2300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkXmlTag2300Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
     int localXmlTag3300Counter = -1;
     public boolean isXmlTag3300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXmlTag3300Counter != sharedCounter;
         localXmlTag3300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkXmlTag3300Constraints(char[] value) {
   			return super.checkConstraints(value , 42 ,false, false);
   }
     int localXmlTag4300Counter = -1;
     public boolean isXmlTag4300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXmlTag4300Counter != sharedCounter;
         localXmlTag4300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkXmlTag4300Constraints(char[] value) {
   			return super.checkConstraints(value , 43 ,false, false);
   }
     int localXmlStr300Counter = -1;
     public boolean isXmlStr300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXmlStr300Counter != sharedCounter;
         localXmlStr300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkXmlStr300Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localIp33701RateSrcToTrgCounter = -1;
     
     public boolean isIp33701RateSrcToTrgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701RateSrcToTrgCounter != sharedCounter;
         localIp33701RateSrcToTrgCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ip33701RateSrcToTrg
	 *	@return ip33701RateSrcToTrg
	 */
	public char[]  getIp33701RateSrcToTrgString() {
	    return getCharArray(beginIp33701RateSrcToTrg,IP_33701_RATE_SRC_TO_TRG_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701RateSrcToTrgIsNumeric() {
		    return isNumeric(beginIp33701RateSrcToTrg
	                    ,beginIp33701RateSrcToTrg + IP_33701_RATE_SRC_TO_TRG_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int IP_33701_RATE_SRC_TO_TRG_LEN = 15;
  protected  static final int IP_33701_RATE_SRC_TO_TRG_SCALE = 7;

   protected BigDecimal checkIp33701RateSrcToTrgMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeIp33701RateSrcToTrg
	 */
	protected void serializeIp33701RateSrcToTrg(BigDecimal ip33701RateSrcToTrg) {
	       putNumber(beginIp33701RateSrcToTrg,ip33701RateSrcToTrg,IP_33701_RATE_SRC_TO_TRG_LEN,IP_33701_RATE_SRC_TO_TRG_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701RateSrcToTrgCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeIp33701RateSrcToTrg
	 */
   	protected  BigDecimal serializeIp33701RateSrcToTrg(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginIp33701RateSrcToTrg
		       ,15
		      );		 localIp33701RateSrcToTrgCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,IP_33701_RATE_SRC_TO_TRG_LEN,IP_33701_RATE_SRC_TO_TRG_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ip33701RateSrcToTrg", beginIp33701RateSrcToTrg,IP_33701_RATE_SRC_TO_TRG_LEN);
    	}
    }
    /**
	 *	refreshIp33701RateSrcToTrg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIp33701RateSrcToTrg() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginIp33701RateSrcToTrg
			            ,IP_33701_RATE_SRC_TO_TRG_LEN
			            ,IP_33701_RATE_SRC_TO_TRG_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701RateSrcToTrg", beginIp33701RateSrcToTrg,IP_33701_RATE_SRC_TO_TRG_LEN);
    }
   	}

	protected static final int SUB_VALUE_COUNT_400_LEN = 2;
    /**
	 * 	serialize this SubValueCount400 as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeSubValueCount400(int index, short value) {
           short number = (short) value;
           replaceValue( getBinaryString(number) , (beginSubValueCount400 + index*SUB_VALUE_COUNT_400_LEN), SUB_VALUE_COUNT_400_LEN);
   }
         int localTotalSubCount400Counter = -1;
         public boolean isTotalSubCount400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTotalSubCount400Counter != sharedCounter;
            localTotalSubCount400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTotalSubCount400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localStrt800Counter = -1;
         public boolean isStrt800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localStrt800Counter != sharedCounter;
            localStrt800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkStrt800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localNumSpacesCounter = -1;
     public boolean isNumSpacesModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNumSpacesCounter != sharedCounter;
         localNumSpacesCounter = sharedCounter; return hasModified;
     }
	protected static final int NUM_SPACES_LEN = 9;
	/**
	 * 	serialize this NumSpaces
	 */
   protected void serializeNumSpaces(char[] numSpaces) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(numSpaces,0,getStringValue(),beginNumSpaces,NUM_SPACES_LEN);
       localNumSpacesCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNumSpacesConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, true);
   }
    /**
	 *	refreshNumSpaces is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNumSpaces() {	 
   		return (substring(getStringValue(),beginNumSpaces,beginNumSpaces + NUM_SPACES_LEN));
   	}
     int localCharWsCounter = -1;
     public boolean isCharWsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharWsCounter != sharedCounter;
         localCharWsCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCharWsConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
     int localXmlTextCounter = -1;
     public boolean isXmlTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXmlTextCounter != sharedCounter;
         localXmlTextCounter = sharedCounter; return hasModified;
     }

   protected char[] checkXmlTextConstraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
     int localXmlData805Counter = -1;
     public boolean isXmlData805Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXmlData805Counter != sharedCounter;
         localXmlData805Counter = sharedCounter; return hasModified;
     }

   protected char[] checkXmlData805Constraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
     int localLowValue300Counter = -1;
     public boolean isLowValue300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLowValue300Counter != sharedCounter;
         localLowValue300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLowValue300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localHighValue300Counter = -1;
     public boolean isHighValue300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHighValue300Counter != sharedCounter;
         localHighValue300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHighValue300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localAmpersand300Counter = -1;
     public boolean isAmpersand300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmpersand300Counter != sharedCounter;
         localAmpersand300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAmpersand300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSpace300Counter = -1;
     public boolean isSpace300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSpace300Counter != sharedCounter;
         localSpace300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSpace300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localPrevTransType801Counter = -1;
     public boolean isPrevTransType801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrevTransType801Counter != sharedCounter;
         localPrevTransType801Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPrevTransType801Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localPrevMccCode801Counter = -1;
     public boolean isPrevMccCode801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrevMccCode801Counter != sharedCounter;
         localPrevMccCode801Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPrevMccCode801Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTransType701Counter = -1;
     public boolean isTransType701Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTransType701Counter != sharedCounter;
         localTransType701Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTransType701Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localExclusionFlag100Counter = -1;
     public boolean isExclusionFlag100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExclusionFlag100Counter != sharedCounter;
         localExclusionFlag100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkExclusionFlag100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localVarCounter = -1;
     public boolean isVarModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVarCounter != sharedCounter;
         localVarCounter = sharedCounter; return hasModified;
     }

   protected char[] checkVarConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localBCounter = -1;
     public boolean isBModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBCounter != sharedCounter;
         localBCounter = sharedCounter; return hasModified;
     }

   protected char[] checkBConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
     int localDCounter = -1;
     public boolean isDModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDCounter != sharedCounter;
         localDCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
         int localALenCounter = -1;
         public boolean isALenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localALenCounter != sharedCounter;
            localALenCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkALenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBLenCounter = -1;
         public boolean isBLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBLenCounter != sharedCounter;
            localBLenCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localCLenCounter = -1;
         public boolean isCLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCLenCounter != sharedCounter;
            localCLenCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkCLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localDLenCounter = -1;
         public boolean isDLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDLenCounter != sharedCounter;
            localDLenCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkDLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localEcbRateDiff800Counter = -1;
     
     public boolean isEcbRateDiff800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEcbRateDiff800Counter != sharedCounter;
         localEcbRateDiff800Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ecbRateDiff800
	 *	@return ecbRateDiff800
	 */
	public char[]  getEcbRateDiff800String() {
	    return getCharArray(beginEcbRateDiff800,ECB_RATE_DIFF_800_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ecbRateDiff800IsNumeric() {
		    return isNumeric(beginEcbRateDiff800
	                    ,beginEcbRateDiff800 + ECB_RATE_DIFF_800_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int ECB_RATE_DIFF_800_LEN = 12;
  protected  static final int ECB_RATE_DIFF_800_SCALE = 6;

   protected BigDecimal checkEcbRateDiff800MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeEcbRateDiff800
	 */
	protected void serializeEcbRateDiff800(BigDecimal ecbRateDiff800) {
	       putNumber(beginEcbRateDiff800,ecbRateDiff800,ECB_RATE_DIFF_800_LEN,ECB_RATE_DIFF_800_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEcbRateDiff800Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeEcbRateDiff800
	 */
   	protected  BigDecimal serializeEcbRateDiff800(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,true/*isSigned?*/)
		       ,beginEcbRateDiff800
		       ,12
		      );		 localEcbRateDiff800Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,ECB_RATE_DIFF_800_LEN,ECB_RATE_DIFF_800_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ecbRateDiff800", beginEcbRateDiff800,ECB_RATE_DIFF_800_LEN);
    	}
    }
    /**
	 *	refreshEcbRateDiff800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshEcbRateDiff800() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginEcbRateDiff800
			            ,ECB_RATE_DIFF_800_LEN
			            ,ECB_RATE_DIFF_800_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ecbRateDiff800", beginEcbRateDiff800,ECB_RATE_DIFF_800_LEN);
    }
   	}
     int localClearingDtTm9800Counter = -1;
     public boolean isClearingDtTm9800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClearingDtTm9800Counter != sharedCounter;
         localClearingDtTm9800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of clearingDtTm9800
	 *	@return clearingDtTm9800
	 */
	public char[]  getClearingDtTm9800String() {
	     return getCharArray(beginClearingDtTm9800,CLEARING_DT_TM_9800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean clearingDtTm9800IsNumeric() {
	    return isNumeric(beginClearingDtTm9800
	                    ,beginClearingDtTm9800 + CLEARING_DT_TM_9800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CLEARING_DT_TM_9800_LEN = 12;
  	/**
	 * serializeClearingDtTm9800
	 */
	protected void serializeClearingDtTm9800(long clearingDtTm9800) {
		 putNumber(beginClearingDtTm9800,clearingDtTm9800,CLEARING_DT_TM_9800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localClearingDtTm9800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeClearingDtTm9800
	 */
   	protected  long serializeClearingDtTm9800(char[] value) {
	    long  clearingDtTm9800;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    clearingDtTm9800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginClearingDtTm9800
		       ,12
		      );
		 localClearingDtTm9800Counter = shareString.getSerializedField().getModifiedCounter();
		return  clearingDtTm9800;
    }

   protected long checkClearingDtTm9800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshClearingDtTm9800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshClearingDtTm9800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginClearingDtTm9800
			                 ,CLEARING_DT_TM_9800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("clearingDtTm9800", beginClearingDtTm9800,CLEARING_DT_TM_9800_LEN);
    }
   	}
     int localClearingDtTm9700Counter = -1;
     public boolean isClearingDtTm9700Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClearingDtTm9700Counter != sharedCounter;
         localClearingDtTm9700Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of clearingDtTm9700
	 *	@return clearingDtTm9700
	 */
	public char[]  getClearingDtTm9700String() {
	     return getCharArray(beginClearingDtTm9700,CLEARING_DT_TM_9700_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean clearingDtTm9700IsNumeric() {
	    return isNumeric(beginClearingDtTm9700
	                    ,beginClearingDtTm9700 + CLEARING_DT_TM_9700_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CLEARING_DT_TM_9700_LEN = 12;
  	/**
	 * serializeClearingDtTm9700
	 */
	protected void serializeClearingDtTm9700(long clearingDtTm9700) {
		 putNumber(beginClearingDtTm9700,clearingDtTm9700,CLEARING_DT_TM_9700_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localClearingDtTm9700Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeClearingDtTm9700
	 */
   	protected  long serializeClearingDtTm9700(char[] value) {
	    long  clearingDtTm9700;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    clearingDtTm9700 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginClearingDtTm9700
		       ,12
		      );
		 localClearingDtTm9700Counter = shareString.getSerializedField().getModifiedCounter();
		return  clearingDtTm9700;
    }

   protected long checkClearingDtTm9700MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshClearingDtTm9700 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshClearingDtTm9700() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginClearingDtTm9700
			                 ,CLEARING_DT_TM_9700_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("clearingDtTm9700", beginClearingDtTm9700,CLEARING_DT_TM_9700_LEN);
    }
   	}
     int localClearingDtTm9X700Counter = -1;
     public boolean isClearingDtTm9X700Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClearingDtTm9X700Counter != sharedCounter;
         localClearingDtTm9X700Counter = sharedCounter; return hasModified;
     }

   protected char[] checkClearingDtTm9X700Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
     int localClearingDtTm9Short800Counter = -1;
     public boolean isClearingDtTm9Short800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClearingDtTm9Short800Counter != sharedCounter;
         localClearingDtTm9Short800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of clearingDtTm9Short800
	 *	@return clearingDtTm9Short800
	 */
	public char[]  getClearingDtTm9Short800String() {
	     return getCharArray(beginClearingDtTm9Short800,CLEARING_DT_TM_9_SHORT_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean clearingDtTm9Short800IsNumeric() {
	    return isNumeric(beginClearingDtTm9Short800
	                    ,beginClearingDtTm9Short800 + CLEARING_DT_TM_9_SHORT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CLEARING_DT_TM_9_SHORT_800_LEN = 8;
  	/**
	 * serializeClearingDtTm9Short800
	 */
	protected void serializeClearingDtTm9Short800(long clearingDtTm9Short800) {
		 putNumber(beginClearingDtTm9Short800,clearingDtTm9Short800,CLEARING_DT_TM_9_SHORT_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localClearingDtTm9Short800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeClearingDtTm9Short800
	 */
   	protected  long serializeClearingDtTm9Short800(char[] value) {
	    long  clearingDtTm9Short800;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    clearingDtTm9Short800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginClearingDtTm9Short800
		       ,8
		      );
		 localClearingDtTm9Short800Counter = shareString.getSerializedField().getModifiedCounter();
		return  clearingDtTm9Short800;
    }

   protected long checkClearingDtTm9Short800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshClearingDtTm9Short800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshClearingDtTm9Short800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginClearingDtTm9Short800
			                 ,CLEARING_DT_TM_9_SHORT_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("clearingDtTm9Short800", beginClearingDtTm9Short800,CLEARING_DT_TM_9_SHORT_800_LEN);
    }
   	}
     int localCf20004TableEntsCounter = -1;
     public boolean isCf20004TableEntsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCf20004TableEntsCounter != sharedCounter;
         localCf20004TableEntsCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCf20004TableEntsConstraints(char[] value) {
   			return super.checkConstraints(value , 460 ,false, false);
   }
     int localDtlRecord1800Counter = -1;
     public boolean isDtlRecord1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDtlRecord1800Counter != sharedCounter;
         localDtlRecord1800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDtlRecord1800Constraints(char[] value) {
   			return super.checkConstraints(value , 69 ,false, false);
   }
     int localVar1NCounter = -1;
     
     public boolean isVar1NModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVar1NCounter != sharedCounter;
         localVar1NCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of var1N
	 *	@return var1N
	 */
	public char[]  getVar1NString() {
	    return getCharArray(beginVar1N,VAR_1_N_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean var1NIsNumeric() {
		    return isNumeric(beginVar1N
	                    ,beginVar1N + VAR_1_N_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int VAR_1_N_LEN = 11;
  protected  static final int VAR_1_N_SCALE = 2;

   protected BigDecimal checkVar1NMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }

  	/**
	 * serializeVar1N
	 */
	protected void serializeVar1N(BigDecimal var1N) {
	       putNumber(beginVar1N,var1N,VAR_1_N_LEN,VAR_1_N_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localVar1NCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeVar1N
	 */
   	protected  BigDecimal serializeVar1N(char[] value) throws CFException {
        if (value.length < 11) value = pad(11, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginVar1N
		       ,11
		      );		 localVar1NCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,VAR_1_N_LEN,VAR_1_N_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("var1N", beginVar1N,VAR_1_N_LEN);
    	}
    }
    /**
	 *	refreshVar1N is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshVar1N() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginVar1N
			            ,VAR_1_N_LEN
			            ,VAR_1_N_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("var1N", beginVar1N,VAR_1_N_LEN);
    }
   	}
     int localVar1EdCounter = -1;
     public boolean isVar1EdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVar1EdCounter != sharedCounter;
         localVar1EdCounter = sharedCounter; return hasModified;
     }
	protected static final int VAR_1_ED_LEN = 14;
	/**
	 * 	serialize this Var1Ed
	 */
   protected void serializeVar1Ed(char[] var1Ed) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(var1Ed,0,getStringValue(),beginVar1Ed,VAR_1_ED_LEN);
       localVar1EdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkVar1EdConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshVar1Ed is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshVar1Ed() {	 
   		return (substring(getStringValue(),beginVar1Ed,beginVar1Ed + VAR_1_ED_LEN));
   	}
     int localVar2EdCounter = -1;
     public boolean isVar2EdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVar2EdCounter != sharedCounter;
         localVar2EdCounter = sharedCounter; return hasModified;
     }
	protected static final int VAR_2_ED_LEN = 14;
	/**
	 * 	serialize this Var2Ed
	 */
   protected void serializeVar2Ed(char[] var2Ed) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(var2Ed,0,getStringValue(),beginVar2Ed,VAR_2_ED_LEN);
       localVar2EdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkVar2EdConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshVar2Ed is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshVar2Ed() {	 
   		return (substring(getStringValue(),beginVar2Ed,beginVar2Ed + VAR_2_ED_LEN));
   	}
     int localC0071300Counter = -1;
     public boolean isC0071300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC0071300Counter != sharedCounter;
         localC0071300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkC0071300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localIp00104ElsubCounter = -1;
     public boolean isIp00104ElsubModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00104ElsubCounter != sharedCounter;
         localIp00104ElsubCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00104Elsub
	 *	@return ip00104Elsub
	 */
	public char[]  getIp00104ElsubString() {
	     return getCharArray(beginIp00104Elsub,IP_00104_ELSUB_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00104ElsubIsNumeric() {
	    return isNumeric(beginIp00104Elsub
	                    ,beginIp00104Elsub + IP_00104_ELSUB_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00104_ELSUB_LEN = 3;
  	/**
	 * serializeIp00104Elsub
	 */
	protected void serializeIp00104Elsub(int ip00104Elsub) {
		 putNumber(beginIp00104Elsub,ip00104Elsub,IP_00104_ELSUB_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00104ElsubCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00104Elsub
	 */
   	protected  int serializeIp00104Elsub(char[] value) {
	    int  ip00104Elsub;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00104Elsub = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp00104Elsub
		       ,3
		      );
		 localIp00104ElsubCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00104Elsub;
    }

   protected int checkIp00104ElsubMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00104Elsub is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00104Elsub() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00104Elsub
			                 ,IP_00104_ELSUB_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00104Elsub", beginIp00104Elsub,IP_00104_ELSUB_LEN);
    }
   	}

		public int subValueCount400Size() {
			return SUB_VALUE_COUNT_400_SIZE;
		}



}
  
