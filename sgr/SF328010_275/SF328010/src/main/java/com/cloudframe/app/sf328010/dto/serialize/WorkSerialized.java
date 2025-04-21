package com.cloudframe.app.sf328010.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMaxLinesPerPage300;
            protected  int beginPlus1300;
            protected  int beginPlus4300;
            protected  int beginPlus7300;
            protected  int beginNum1300;
            protected  int beginNum2300;
            protected  int beginNum4300;
            protected  int beginZLogCnt400;
            protected  int beginRpt1LineCount400;
            protected  int beginPageCount400;
            protected  int beginTotServiceCnt400;
            protected  int beginTotRecWritten400;
            protected  int beginSuccessCnt400;
            protected  int beginErrorCnt400;
            protected  int beginHighElapseTime400;
            protected  int beginLowElapseTime400;
            protected  int beginSumElapsedTime400;
            protected  int beginSuccessPercent400;
            protected  int beginErrPercent400;
            protected  int beginAvgElapsed400;
            protected  int beginSuccessCnt800;
            protected  int beginSuccessPercent800;
            protected  int beginErrorCnt800;
            protected  int beginUnsuccessPercent800;
            protected  int beginAvgElapsed800;
            protected  int beginHighElapseTime800;
            protected  int beginLowElapseTime800;
            protected  int beginTotServiceCnt800;
	
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
  
  
  
             beginMaxLinesPerPage300 = getStartOffset() + 0;	// set offset for serialization
  
             beginPlus1300 = getStartOffset() + 2;	// set offset for serialization
  
             beginPlus4300 = getStartOffset() + 3;	// set offset for serialization
  
             beginPlus7300 = getStartOffset() + 4;	// set offset for serialization
  
             beginNum1300 = getStartOffset() + 5;	// set offset for serialization
  
             beginNum2300 = getStartOffset() + 6;	// set offset for serialization
  
             beginNum4300 = getStartOffset() + 7;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginZLogCnt400 = getStartOffset() + 8;	// set offset for serialization
  
             beginRpt1LineCount400 = getStartOffset() + 14;	// set offset for serialization
  
             beginPageCount400 = getStartOffset() + 20;	// set offset for serialization
  
             beginTotServiceCnt400 = getStartOffset() + 26;	// set offset for serialization
  
             beginTotRecWritten400 = getStartOffset() + 32;	// set offset for serialization
  
             beginSuccessCnt400 = getStartOffset() + 38;	// set offset for serialization
  
             beginErrorCnt400 = getStartOffset() + 44;	// set offset for serialization
  
             beginHighElapseTime400 = getStartOffset() + 50;	// set offset for serialization
  
             beginLowElapseTime400 = getStartOffset() + 55;	// set offset for serialization
  
             beginSumElapsedTime400 = getStartOffset() + 60;	// set offset for serialization
  
             beginSuccessPercent400 = getStartOffset() + 67;	// set offset for serialization
  
             beginErrPercent400 = getStartOffset() + 70;	// set offset for serialization
  
             beginAvgElapsed400 = getStartOffset() + 73;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
             beginSuccessCnt800 = getStartOffset() + 81;	// set offset for serialization
  
             beginSuccessPercent800 = getStartOffset() + 92;	// set offset for serialization
  
             beginErrorCnt800 = getStartOffset() + 98;	// set offset for serialization
  
             beginUnsuccessPercent800 = getStartOffset() + 109;	// set offset for serialization
  
             beginAvgElapsed800 = getStartOffset() + 115;	// set offset for serialization
  
             beginHighElapseTime800 = getStartOffset() + 129;	// set offset for serialization
  
             beginLowElapseTime800 = getStartOffset() + 140;	// set offset for serialization
  
             beginTotServiceCnt800 = getStartOffset() + 151;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localZLogEofSw100Counter = -1;
     public boolean isZLogEofSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZLogEofSw100Counter != sharedCounter;
         localZLogEofSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkZLogEofSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localZLogFirstRead100Counter = -1;
     public boolean isZLogFirstRead100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZLogFirstRead100Counter != sharedCounter;
         localZLogFirstRead100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkZLogFirstRead100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localMnthMmNum100Counter = -1;
     public boolean isMnthMmNum100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMnthMmNum100Counter != sharedCounter;
         localMnthMmNum100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMnthMmNum100Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
        int localMaxLinesPerPage300Counter = -1;
        public boolean isMaxLinesPerPage300Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localMaxLinesPerPage300Counter != sharedCounter;
           localMaxLinesPerPage300Counter = sharedCounter; return hasModified; 
        }
	    public boolean maxLinesPerPage300IsNumeric() {
	      return decimalIsNumeric(beginMaxLinesPerPage300,MAX_LINES_PER_PAGE_300_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int MAX_LINES_PER_PAGE_300_LEN = 2;
  	/**
	 * 	serializeMaxLinesPerPage300
	 */
	protected void serializeMaxLinesPerPage300(short maxLinesPerPage300) {
		   putDecimal(beginMaxLinesPerPage300,maxLinesPerPage300,MAX_LINES_PER_PAGE_300_LEN,true);
   }
   

   protected short checkMaxLinesPerPage300MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_100 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshMaxLinesPerPage300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMaxLinesPerPage300() throws CFException {	
   	try { 
		 return (getShortDecimal(beginMaxLinesPerPage300,MAX_LINES_PER_PAGE_300_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("maxLinesPerPage300", beginMaxLinesPerPage300,MAX_LINES_PER_PAGE_300_LEN);
     }
   	}
     int localPlus1300Counter = -1;
     public boolean isPlus1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlus1300Counter != sharedCounter;
         localPlus1300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of plus1300
	 *	@return plus1300
	 */
	public char[]  getPlus1300String() {
	     return getCharArray(beginPlus1300,PLUS_1300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus1300IsNumeric() {
	    return isNumeric(beginPlus1300
	                    ,beginPlus1300 + PLUS_1300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLUS_1300_LEN = 1;
  	/**
	 * serializePlus1300
	 */
	protected void serializePlus1300(int plus1300) {
		 putNumber(beginPlus1300,plus1300,PLUS_1300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlus1300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlus1300
	 */
   	protected  int serializePlus1300(char[] value) {
	    int  plus1300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    plus1300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginPlus1300
		       ,1
		      );
		 localPlus1300Counter = shareString.getSerializedField().getModifiedCounter();
		return  plus1300;
    }

   protected int checkPlus1300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlus1300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPlus1300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPlus1300
			                 ,PLUS_1300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("plus1300", beginPlus1300,PLUS_1300_LEN);
    }
   	}
     int localPlus4300Counter = -1;
     public boolean isPlus4300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlus4300Counter != sharedCounter;
         localPlus4300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of plus4300
	 *	@return plus4300
	 */
	public char[]  getPlus4300String() {
	     return getCharArray(beginPlus4300,PLUS_4300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus4300IsNumeric() {
	    return isNumeric(beginPlus4300
	                    ,beginPlus4300 + PLUS_4300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLUS_4300_LEN = 1;
  	/**
	 * serializePlus4300
	 */
	protected void serializePlus4300(int plus4300) {
		 putNumber(beginPlus4300,plus4300,PLUS_4300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlus4300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlus4300
	 */
   	protected  int serializePlus4300(char[] value) {
	    int  plus4300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    plus4300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginPlus4300
		       ,1
		      );
		 localPlus4300Counter = shareString.getSerializedField().getModifiedCounter();
		return  plus4300;
    }

   protected int checkPlus4300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlus4300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPlus4300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPlus4300
			                 ,PLUS_4300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("plus4300", beginPlus4300,PLUS_4300_LEN);
    }
   	}
     int localPlus7300Counter = -1;
     public boolean isPlus7300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlus7300Counter != sharedCounter;
         localPlus7300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of plus7300
	 *	@return plus7300
	 */
	public char[]  getPlus7300String() {
	     return getCharArray(beginPlus7300,PLUS_7300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus7300IsNumeric() {
	    return isNumeric(beginPlus7300
	                    ,beginPlus7300 + PLUS_7300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLUS_7300_LEN = 1;
  	/**
	 * serializePlus7300
	 */
	protected void serializePlus7300(int plus7300) {
		 putNumber(beginPlus7300,plus7300,PLUS_7300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlus7300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlus7300
	 */
   	protected  int serializePlus7300(char[] value) {
	    int  plus7300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    plus7300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginPlus7300
		       ,1
		      );
		 localPlus7300Counter = shareString.getSerializedField().getModifiedCounter();
		return  plus7300;
    }

   protected int checkPlus7300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlus7300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPlus7300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPlus7300
			                 ,PLUS_7300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("plus7300", beginPlus7300,PLUS_7300_LEN);
    }
   	}
     int localNum1300Counter = -1;
     public boolean isNum1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNum1300Counter != sharedCounter;
         localNum1300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of num1300
	 *	@return num1300
	 */
	public char[]  getNum1300String() {
	     return getCharArray(beginNum1300,NUM_1300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num1300IsNumeric() {
	    return isNumeric(beginNum1300
	                    ,beginNum1300 + NUM_1300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUM_1300_LEN = 1;
  	/**
	 * serializeNum1300
	 */
	protected void serializeNum1300(int num1300) {
		 putNumber(beginNum1300,num1300,NUM_1300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNum1300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNum1300
	 */
   	protected  int serializeNum1300(char[] value) {
	    int  num1300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    num1300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginNum1300
		       ,1
		      );
		 localNum1300Counter = shareString.getSerializedField().getModifiedCounter();
		return  num1300;
    }

   protected int checkNum1300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNum1300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNum1300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNum1300
			                 ,NUM_1300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("num1300", beginNum1300,NUM_1300_LEN);
    }
   	}
     int localNum2300Counter = -1;
     public boolean isNum2300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNum2300Counter != sharedCounter;
         localNum2300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of num2300
	 *	@return num2300
	 */
	public char[]  getNum2300String() {
	     return getCharArray(beginNum2300,NUM_2300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num2300IsNumeric() {
	    return isNumeric(beginNum2300
	                    ,beginNum2300 + NUM_2300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUM_2300_LEN = 1;
  	/**
	 * serializeNum2300
	 */
	protected void serializeNum2300(int num2300) {
		 putNumber(beginNum2300,num2300,NUM_2300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNum2300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNum2300
	 */
   	protected  int serializeNum2300(char[] value) {
	    int  num2300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    num2300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginNum2300
		       ,1
		      );
		 localNum2300Counter = shareString.getSerializedField().getModifiedCounter();
		return  num2300;
    }

   protected int checkNum2300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNum2300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNum2300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNum2300
			                 ,NUM_2300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("num2300", beginNum2300,NUM_2300_LEN);
    }
   	}
     int localNum4300Counter = -1;
     public boolean isNum4300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNum4300Counter != sharedCounter;
         localNum4300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of num4300
	 *	@return num4300
	 */
	public char[]  getNum4300String() {
	     return getCharArray(beginNum4300,NUM_4300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num4300IsNumeric() {
	    return isNumeric(beginNum4300
	                    ,beginNum4300 + NUM_4300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUM_4300_LEN = 1;
  	/**
	 * serializeNum4300
	 */
	protected void serializeNum4300(int num4300) {
		 putNumber(beginNum4300,num4300,NUM_4300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNum4300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNum4300
	 */
   	protected  int serializeNum4300(char[] value) {
	    int  num4300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    num4300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginNum4300
		       ,1
		      );
		 localNum4300Counter = shareString.getSerializedField().getModifiedCounter();
		return  num4300;
    }

   protected int checkNum4300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNum4300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNum4300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNum4300
			                 ,NUM_4300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("num4300", beginNum4300,NUM_4300_LEN);
    }
   	}
     int localLitC300Counter = -1;
     public boolean isLitC300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLitC300Counter != sharedCounter;
         localLitC300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLitC300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localLitUnknwn300Counter = -1;
     public boolean isLitUnknwn300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLitUnknwn300Counter != sharedCounter;
         localLitUnknwn300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLitUnknwn300Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
         int localNum100300Counter = -1;
         public boolean isNum100300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNum100300Counter != sharedCounter;
            localNum100300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkNum100300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localMonthJan300Counter = -1;
     public boolean isMonthJan300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonthJan300Counter != sharedCounter;
         localMonthJan300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMonthJan300Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localMonthFeb300Counter = -1;
     public boolean isMonthFeb300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonthFeb300Counter != sharedCounter;
         localMonthFeb300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMonthFeb300Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localMonthMar300Counter = -1;
     public boolean isMonthMar300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonthMar300Counter != sharedCounter;
         localMonthMar300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMonthMar300Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localMonthApr300Counter = -1;
     public boolean isMonthApr300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonthApr300Counter != sharedCounter;
         localMonthApr300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMonthApr300Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localMonthMay300Counter = -1;
     public boolean isMonthMay300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonthMay300Counter != sharedCounter;
         localMonthMay300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMonthMay300Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localMonthJun300Counter = -1;
     public boolean isMonthJun300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonthJun300Counter != sharedCounter;
         localMonthJun300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMonthJun300Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localMonthJul300Counter = -1;
     public boolean isMonthJul300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonthJul300Counter != sharedCounter;
         localMonthJul300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMonthJul300Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localMonthAug300Counter = -1;
     public boolean isMonthAug300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonthAug300Counter != sharedCounter;
         localMonthAug300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMonthAug300Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localMonthSep300Counter = -1;
     public boolean isMonthSep300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonthSep300Counter != sharedCounter;
         localMonthSep300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMonthSep300Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localMonthOct300Counter = -1;
     public boolean isMonthOct300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonthOct300Counter != sharedCounter;
         localMonthOct300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMonthOct300Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localMonthNov300Counter = -1;
     public boolean isMonthNov300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonthNov300Counter != sharedCounter;
         localMonthNov300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMonthNov300Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localMonthDec300Counter = -1;
     public boolean isMonthDec300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonthDec300Counter != sharedCounter;
         localMonthDec300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMonthDec300Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
        int localZLogCnt400Counter = -1;
        public boolean isZLogCnt400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localZLogCnt400Counter != sharedCounter;
           localZLogCnt400Counter = sharedCounter; return hasModified; 
        }
	    public boolean zLogCnt400IsNumeric() {
	      return decimalIsNumeric(beginZLogCnt400,Z_LOG_CNT_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int Z_LOG_CNT_400_LEN = 6;
  	/**
	 * 	serializeZLogCnt400
	 */
	protected void serializeZLogCnt400(long zLogCnt400) {
		   putDecimal(beginZLogCnt400,zLogCnt400,Z_LOG_CNT_400_LEN,true);
   }
   

   protected long checkZLogCnt400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshZLogCnt400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshZLogCnt400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginZLogCnt400,Z_LOG_CNT_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("zLogCnt400", beginZLogCnt400,Z_LOG_CNT_400_LEN);
     }
   	}
        int localRpt1LineCount400Counter = -1;
        public boolean isRpt1LineCount400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRpt1LineCount400Counter != sharedCounter;
           localRpt1LineCount400Counter = sharedCounter; return hasModified; 
        }
	    public boolean rpt1LineCount400IsNumeric() {
	      return decimalIsNumeric(beginRpt1LineCount400,RPT_1_LINE_COUNT_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int RPT_1_LINE_COUNT_400_LEN = 6;
  	/**
	 * 	serializeRpt1LineCount400
	 */
	protected void serializeRpt1LineCount400(long rpt1LineCount400) {
		   putDecimal(beginRpt1LineCount400,rpt1LineCount400,RPT_1_LINE_COUNT_400_LEN,true);
   }
   

   protected long checkRpt1LineCount400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshRpt1LineCount400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRpt1LineCount400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginRpt1LineCount400,RPT_1_LINE_COUNT_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("rpt1LineCount400", beginRpt1LineCount400,RPT_1_LINE_COUNT_400_LEN);
     }
   	}
        int localPageCount400Counter = -1;
        public boolean isPageCount400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPageCount400Counter != sharedCounter;
           localPageCount400Counter = sharedCounter; return hasModified; 
        }
	    public boolean pageCount400IsNumeric() {
	      return decimalIsNumeric(beginPageCount400,PAGE_COUNT_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PAGE_COUNT_400_LEN = 6;
  	/**
	 * 	serializePageCount400
	 */
	protected void serializePageCount400(long pageCount400) {
		   putDecimal(beginPageCount400,pageCount400,PAGE_COUNT_400_LEN,true);
   }
   

   protected long checkPageCount400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshPageCount400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPageCount400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginPageCount400,PAGE_COUNT_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("pageCount400", beginPageCount400,PAGE_COUNT_400_LEN);
     }
   	}
        int localTotServiceCnt400Counter = -1;
        public boolean isTotServiceCnt400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTotServiceCnt400Counter != sharedCounter;
           localTotServiceCnt400Counter = sharedCounter; return hasModified; 
        }
	    public boolean totServiceCnt400IsNumeric() {
	      return decimalIsNumeric(beginTotServiceCnt400,TOT_SERVICE_CNT_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TOT_SERVICE_CNT_400_LEN = 6;
  	/**
	 * 	serializeTotServiceCnt400
	 */
	protected void serializeTotServiceCnt400(long totServiceCnt400) {
		   putDecimal(beginTotServiceCnt400,totServiceCnt400,TOT_SERVICE_CNT_400_LEN,true);
   }
   

   protected long checkTotServiceCnt400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTotServiceCnt400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTotServiceCnt400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTotServiceCnt400,TOT_SERVICE_CNT_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("totServiceCnt400", beginTotServiceCnt400,TOT_SERVICE_CNT_400_LEN);
     }
   	}
        int localTotRecWritten400Counter = -1;
        public boolean isTotRecWritten400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTotRecWritten400Counter != sharedCounter;
           localTotRecWritten400Counter = sharedCounter; return hasModified; 
        }
	    public boolean totRecWritten400IsNumeric() {
	      return decimalIsNumeric(beginTotRecWritten400,TOT_REC_WRITTEN_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TOT_REC_WRITTEN_400_LEN = 6;
  	/**
	 * 	serializeTotRecWritten400
	 */
	protected void serializeTotRecWritten400(long totRecWritten400) {
		   putDecimal(beginTotRecWritten400,totRecWritten400,TOT_REC_WRITTEN_400_LEN,true);
   }
   

   protected long checkTotRecWritten400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTotRecWritten400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTotRecWritten400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTotRecWritten400,TOT_REC_WRITTEN_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("totRecWritten400", beginTotRecWritten400,TOT_REC_WRITTEN_400_LEN);
     }
   	}
        int localSuccessCnt400Counter = -1;
        public boolean isSuccessCnt400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSuccessCnt400Counter != sharedCounter;
           localSuccessCnt400Counter = sharedCounter; return hasModified; 
        }
	    public boolean successCnt400IsNumeric() {
	      return decimalIsNumeric(beginSuccessCnt400,SUCCESS_CNT_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SUCCESS_CNT_400_LEN = 6;
  	/**
	 * 	serializeSuccessCnt400
	 */
	protected void serializeSuccessCnt400(long successCnt400) {
		   putDecimal(beginSuccessCnt400,successCnt400,SUCCESS_CNT_400_LEN,true);
   }
   

   protected long checkSuccessCnt400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSuccessCnt400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSuccessCnt400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginSuccessCnt400,SUCCESS_CNT_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("successCnt400", beginSuccessCnt400,SUCCESS_CNT_400_LEN);
     }
   	}
        int localErrorCnt400Counter = -1;
        public boolean isErrorCnt400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localErrorCnt400Counter != sharedCounter;
           localErrorCnt400Counter = sharedCounter; return hasModified; 
        }
	    public boolean errorCnt400IsNumeric() {
	      return decimalIsNumeric(beginErrorCnt400,ERROR_CNT_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int ERROR_CNT_400_LEN = 6;
  	/**
	 * 	serializeErrorCnt400
	 */
	protected void serializeErrorCnt400(long errorCnt400) {
		   putDecimal(beginErrorCnt400,errorCnt400,ERROR_CNT_400_LEN,true);
   }
   

   protected long checkErrorCnt400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshErrorCnt400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshErrorCnt400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginErrorCnt400,ERROR_CNT_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("errorCnt400", beginErrorCnt400,ERROR_CNT_400_LEN);
     }
   	}
        int localHighElapseTime400Counter = -1;
        public boolean isHighElapseTime400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localHighElapseTime400Counter != sharedCounter;
           localHighElapseTime400Counter = sharedCounter; return hasModified; 
        }
	    public boolean highElapseTime400IsNumeric() {
	      return decimalIsNumeric(beginHighElapseTime400,HIGH_ELAPSE_TIME_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int HIGH_ELAPSE_TIME_400_LEN = 5;
  	/**
	 * 	serializeHighElapseTime400
	 */
	protected void serializeHighElapseTime400(int highElapseTime400) {
		   putDecimal(beginHighElapseTime400,highElapseTime400,HIGH_ELAPSE_TIME_400_LEN,true);
   }
   

   protected int checkHighElapseTime400MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshHighElapseTime400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshHighElapseTime400() throws CFException {	
   	try { 
		 return (getIntDecimal(beginHighElapseTime400,HIGH_ELAPSE_TIME_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("highElapseTime400", beginHighElapseTime400,HIGH_ELAPSE_TIME_400_LEN);
     }
   	}
        int localLowElapseTime400Counter = -1;
        public boolean isLowElapseTime400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localLowElapseTime400Counter != sharedCounter;
           localLowElapseTime400Counter = sharedCounter; return hasModified; 
        }
	    public boolean lowElapseTime400IsNumeric() {
	      return decimalIsNumeric(beginLowElapseTime400,LOW_ELAPSE_TIME_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int LOW_ELAPSE_TIME_400_LEN = 5;
  	/**
	 * 	serializeLowElapseTime400
	 */
	protected void serializeLowElapseTime400(int lowElapseTime400) {
		   putDecimal(beginLowElapseTime400,lowElapseTime400,LOW_ELAPSE_TIME_400_LEN,true);
   }
   

   protected int checkLowElapseTime400MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshLowElapseTime400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLowElapseTime400() throws CFException {	
   	try { 
		 return (getIntDecimal(beginLowElapseTime400,LOW_ELAPSE_TIME_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("lowElapseTime400", beginLowElapseTime400,LOW_ELAPSE_TIME_400_LEN);
     }
   	}
        int localSumElapsedTime400Counter = -1;
        public boolean isSumElapsedTime400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSumElapsedTime400Counter != sharedCounter;
           localSumElapsedTime400Counter = sharedCounter; return hasModified; 
        }
	    public boolean sumElapsedTime400IsNumeric() {
	      return decimalIsNumeric(beginSumElapsedTime400,SUM_ELAPSED_TIME_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SUM_ELAPSED_TIME_400_LEN = 7;
  	/**
	 * 	serializeSumElapsedTime400
	 */
	protected void serializeSumElapsedTime400(long sumElapsedTime400) {
		   putDecimal(beginSumElapsedTime400,sumElapsedTime400,SUM_ELAPSED_TIME_400_LEN,true);
   }
   

   protected long checkSumElapsedTime400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1T /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSumElapsedTime400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSumElapsedTime400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginSumElapsedTime400,SUM_ELAPSED_TIME_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("sumElapsedTime400", beginSumElapsedTime400,SUM_ELAPSED_TIME_400_LEN);
     }
   	}
        int localSuccessPercent400Counter = -1;
        public boolean isSuccessPercent400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSuccessPercent400Counter != sharedCounter;
           localSuccessPercent400Counter = sharedCounter; return hasModified; 
        }
	    public boolean successPercent400IsNumeric() {
	      return decimalIsNumeric(beginSuccessPercent400,SUCCESS_PERCENT_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] successPercent400String() {
            return getPackedString(beginSuccessPercent400,SUCCESS_PERCENT_400_LEN);
         }
   protected static final int SUCCESS_PERCENT_400_LEN = 3;
   protected static final int SUCCESS_PERCENT_400_SCALE = 2;
  	/**
	 * 	serializeSuccessPercent400
	 */
	protected void serializeSuccessPercent400(BigDecimal successPercent400) {
		   putDecimal(beginSuccessPercent400,successPercent400,SUCCESS_PERCENT_400_LEN,SUCCESS_PERCENT_400_SCALE,false);
		 localSuccessPercent400Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSuccessPercent400MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }
     /**
	 *	refreshSuccessPercent400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSuccessPercent400() throws CFException {	
   	try { 
		 return (getDecimal(beginSuccessPercent400,SUCCESS_PERCENT_400_LEN,SUCCESS_PERCENT_400_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("successPercent400", beginSuccessPercent400,SUCCESS_PERCENT_400_LEN);
     }
   	}
        int localErrPercent400Counter = -1;
        public boolean isErrPercent400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localErrPercent400Counter != sharedCounter;
           localErrPercent400Counter = sharedCounter; return hasModified; 
        }
	    public boolean errPercent400IsNumeric() {
	      return decimalIsNumeric(beginErrPercent400,ERR_PERCENT_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] errPercent400String() {
            return getPackedString(beginErrPercent400,ERR_PERCENT_400_LEN);
         }
   protected static final int ERR_PERCENT_400_LEN = 3;
   protected static final int ERR_PERCENT_400_SCALE = 2;
  	/**
	 * 	serializeErrPercent400
	 */
	protected void serializeErrPercent400(BigDecimal errPercent400) {
		   putDecimal(beginErrPercent400,errPercent400,ERR_PERCENT_400_LEN,ERR_PERCENT_400_SCALE,false);
		 localErrPercent400Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkErrPercent400MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }
     /**
	 *	refreshErrPercent400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshErrPercent400() throws CFException {	
   	try { 
		 return (getDecimal(beginErrPercent400,ERR_PERCENT_400_LEN,ERR_PERCENT_400_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("errPercent400", beginErrPercent400,ERR_PERCENT_400_LEN);
     }
   	}
        int localAvgElapsed400Counter = -1;
        public boolean isAvgElapsed400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localAvgElapsed400Counter != sharedCounter;
           localAvgElapsed400Counter = sharedCounter; return hasModified; 
        }
	    public boolean avgElapsed400IsNumeric() {
	      return decimalIsNumeric(beginAvgElapsed400,AVG_ELAPSED_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] avgElapsed400String() {
            return getPackedString(beginAvgElapsed400,AVG_ELAPSED_400_LEN);
         }
   protected static final int AVG_ELAPSED_400_LEN = 8;
   protected static final int AVG_ELAPSED_400_SCALE = 2;
  	/**
	 * 	serializeAvgElapsed400
	 */
	protected void serializeAvgElapsed400(BigDecimal avgElapsed400) {
		   putDecimal(beginAvgElapsed400,avgElapsed400,AVG_ELAPSED_400_LEN,AVG_ELAPSED_400_SCALE,false);
		 localAvgElapsed400Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkAvgElapsed400MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshAvgElapsed400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshAvgElapsed400() throws CFException {	
   	try { 
		 return (getDecimal(beginAvgElapsed400,AVG_ELAPSED_400_LEN,AVG_ELAPSED_400_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("avgElapsed400", beginAvgElapsed400,AVG_ELAPSED_400_LEN);
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
     int localNoInputData6000001Counter = -1;
     public boolean isNoInputData6000001Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNoInputData6000001Counter != sharedCounter;
         localNoInputData6000001Counter = sharedCounter; return hasModified;
     }

   protected char[] checkNoInputData6000001Constraints(char[] value) {
   			return super.checkConstraints(value , 55 ,false, false);
   }
     int localEojMessage6009500Counter = -1;
     public boolean isEojMessage6009500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEojMessage6009500Counter != sharedCounter;
         localEojMessage6009500Counter = sharedCounter; return hasModified;
     }

   protected char[] checkEojMessage6009500Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
     int localHeaderLine3703Counter = -1;
     public boolean isHeaderLine3703Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHeaderLine3703Counter != sharedCounter;
         localHeaderLine3703Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHeaderLine3703Constraints(char[] value) {
   			return super.checkConstraints(value , 137 ,false, false);
   }
     int localHeaderLine4704Counter = -1;
     public boolean isHeaderLine4704Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHeaderLine4704Counter != sharedCounter;
         localHeaderLine4704Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHeaderLine4704Constraints(char[] value) {
   			return super.checkConstraints(value , 149 ,false, false);
   }
     int localEmptyReport706Counter = -1;
     public boolean isEmptyReport706Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEmptyReport706Counter != sharedCounter;
         localEmptyReport706Counter = sharedCounter; return hasModified;
     }

   protected char[] checkEmptyReport706Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localHoldServiceId800Counter = -1;
     public boolean isHoldServiceId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHoldServiceId800Counter != sharedCounter;
         localHoldServiceId800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHoldServiceId800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localRunMonth800Counter = -1;
     public boolean isRunMonth800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRunMonth800Counter != sharedCounter;
         localRunMonth800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRunMonth800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localSuccessCnt800Counter = -1;
     public boolean isSuccessCnt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSuccessCnt800Counter != sharedCounter;
         localSuccessCnt800Counter = sharedCounter; return hasModified;
     }
	protected static final int SUCCESS_CNT_800_LEN = 11;
	/**
	 * 	serialize this SuccessCnt800
	 */
   protected void serializeSuccessCnt800(char[] successCnt800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(successCnt800,0,getStringValue(),beginSuccessCnt800,SUCCESS_CNT_800_LEN);
       localSuccessCnt800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSuccessCnt800Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshSuccessCnt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSuccessCnt800() {	 
   		return (substring(getStringValue(),beginSuccessCnt800,beginSuccessCnt800 + SUCCESS_CNT_800_LEN));
   	}
     int localSuccessPercent800Counter = -1;
     public boolean isSuccessPercent800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSuccessPercent800Counter != sharedCounter;
         localSuccessPercent800Counter = sharedCounter; return hasModified;
     }
	protected static final int SUCCESS_PERCENT_800_LEN = 6;
	/**
	 * 	serialize this SuccessPercent800
	 */
   protected void serializeSuccessPercent800(char[] successPercent800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(successPercent800,0,getStringValue(),beginSuccessPercent800,SUCCESS_PERCENT_800_LEN);
       localSuccessPercent800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSuccessPercent800Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSuccessPercent800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSuccessPercent800() {	 
   		return (substring(getStringValue(),beginSuccessPercent800,beginSuccessPercent800 + SUCCESS_PERCENT_800_LEN));
   	}
     int localErrorCnt800Counter = -1;
     public boolean isErrorCnt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorCnt800Counter != sharedCounter;
         localErrorCnt800Counter = sharedCounter; return hasModified;
     }
	protected static final int ERROR_CNT_800_LEN = 11;
	/**
	 * 	serialize this ErrorCnt800
	 */
   protected void serializeErrorCnt800(char[] errorCnt800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errorCnt800,0,getStringValue(),beginErrorCnt800,ERROR_CNT_800_LEN);
       localErrorCnt800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrorCnt800Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshErrorCnt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrorCnt800() {	 
   		return (substring(getStringValue(),beginErrorCnt800,beginErrorCnt800 + ERROR_CNT_800_LEN));
   	}
     int localUnsuccessPercent800Counter = -1;
     public boolean isUnsuccessPercent800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUnsuccessPercent800Counter != sharedCounter;
         localUnsuccessPercent800Counter = sharedCounter; return hasModified;
     }
	protected static final int UNSUCCESS_PERCENT_800_LEN = 6;
	/**
	 * 	serialize this UnsuccessPercent800
	 */
   protected void serializeUnsuccessPercent800(char[] unsuccessPercent800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(unsuccessPercent800,0,getStringValue(),beginUnsuccessPercent800,UNSUCCESS_PERCENT_800_LEN);
       localUnsuccessPercent800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUnsuccessPercent800Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshUnsuccessPercent800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUnsuccessPercent800() {	 
   		return (substring(getStringValue(),beginUnsuccessPercent800,beginUnsuccessPercent800 + UNSUCCESS_PERCENT_800_LEN));
   	}
     int localAvgElapsed800Counter = -1;
     public boolean isAvgElapsed800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAvgElapsed800Counter != sharedCounter;
         localAvgElapsed800Counter = sharedCounter; return hasModified;
     }
	protected static final int AVG_ELAPSED_800_LEN = 14;
	/**
	 * 	serialize this AvgElapsed800
	 */
   protected void serializeAvgElapsed800(char[] avgElapsed800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(avgElapsed800,0,getStringValue(),beginAvgElapsed800,AVG_ELAPSED_800_LEN);
       localAvgElapsed800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAvgElapsed800Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshAvgElapsed800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAvgElapsed800() {	 
   		return (substring(getStringValue(),beginAvgElapsed800,beginAvgElapsed800 + AVG_ELAPSED_800_LEN));
   	}
     int localHighElapseTime800Counter = -1;
     public boolean isHighElapseTime800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHighElapseTime800Counter != sharedCounter;
         localHighElapseTime800Counter = sharedCounter; return hasModified;
     }
	protected static final int HIGH_ELAPSE_TIME_800_LEN = 11;
	/**
	 * 	serialize this HighElapseTime800
	 */
   protected void serializeHighElapseTime800(char[] highElapseTime800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(highElapseTime800,0,getStringValue(),beginHighElapseTime800,HIGH_ELAPSE_TIME_800_LEN);
       localHighElapseTime800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHighElapseTime800Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshHighElapseTime800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHighElapseTime800() {	 
   		return (substring(getStringValue(),beginHighElapseTime800,beginHighElapseTime800 + HIGH_ELAPSE_TIME_800_LEN));
   	}
     int localLowElapseTime800Counter = -1;
     public boolean isLowElapseTime800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLowElapseTime800Counter != sharedCounter;
         localLowElapseTime800Counter = sharedCounter; return hasModified;
     }
	protected static final int LOW_ELAPSE_TIME_800_LEN = 11;
	/**
	 * 	serialize this LowElapseTime800
	 */
   protected void serializeLowElapseTime800(char[] lowElapseTime800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lowElapseTime800,0,getStringValue(),beginLowElapseTime800,LOW_ELAPSE_TIME_800_LEN);
       localLowElapseTime800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLowElapseTime800Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshLowElapseTime800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLowElapseTime800() {	 
   		return (substring(getStringValue(),beginLowElapseTime800,beginLowElapseTime800 + LOW_ELAPSE_TIME_800_LEN));
   	}
     int localTotServiceCnt800Counter = -1;
     public boolean isTotServiceCnt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTotServiceCnt800Counter != sharedCounter;
         localTotServiceCnt800Counter = sharedCounter; return hasModified;
     }
	protected static final int TOT_SERVICE_CNT_800_LEN = 11;
	/**
	 * 	serialize this TotServiceCnt800
	 */
   protected void serializeTotServiceCnt800(char[] totServiceCnt800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(totServiceCnt800,0,getStringValue(),beginTotServiceCnt800,TOT_SERVICE_CNT_800_LEN);
       localTotServiceCnt800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTotServiceCnt800Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshTotServiceCnt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTotServiceCnt800() {	 
   		return (substring(getStringValue(),beginTotServiceCnt800,beginTotServiceCnt800 + TOT_SERVICE_CNT_800_LEN));
   	}




}
  
