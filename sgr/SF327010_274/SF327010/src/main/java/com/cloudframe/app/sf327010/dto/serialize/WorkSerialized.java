package com.cloudframe.app.sf327010.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:28. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 98;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMaxLinesPerPage300;
            protected  int beginNum1300;
            protected  int beginPlus1300;
            protected  int beginPlus4300;
            protected  int beginPlus7300;
            protected  int beginNum2300;
            protected  int beginNum4300;
            protected  int beginNum0300;
            protected  int beginReadCount400;
            protected  int beginWriteCount400;
            protected  int beginPageCount400;
            protected  int beginLineCount400;
            protected  int beginSuccessCount400;
            protected  int beginErrorCount400;
            protected  int beginTotMessCount400;
            protected  int beginSuccessPercent400;
            protected  int beginErrorPercent400;
            protected  int beginAvgElapsedN800;
            protected  int beginAvgElapsed800;
            protected  int beginSuccessPercent800;
            protected  int beginErrorPercent800;
	
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
  
             beginNum1300 = getStartOffset() + 2;	// set offset for serialization
  
             beginPlus1300 = getStartOffset() + 3;	// set offset for serialization
  
             beginPlus4300 = getStartOffset() + 4;	// set offset for serialization
  
             beginPlus7300 = getStartOffset() + 5;	// set offset for serialization
  
             beginNum2300 = getStartOffset() + 6;	// set offset for serialization
  
             beginNum4300 = getStartOffset() + 7;	// set offset for serialization
  
             beginNum0300 = getStartOffset() + 8;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginReadCount400 = getStartOffset() + 9;	// set offset for serialization
  
             beginWriteCount400 = getStartOffset() + 15;	// set offset for serialization
  
             beginPageCount400 = getStartOffset() + 21;	// set offset for serialization
  
             beginLineCount400 = getStartOffset() + 27;	// set offset for serialization
  
             beginSuccessCount400 = getStartOffset() + 33;	// set offset for serialization
  
             beginErrorCount400 = getStartOffset() + 39;	// set offset for serialization
  
             beginTotMessCount400 = getStartOffset() + 45;	// set offset for serialization
  
             beginSuccessPercent400 = getStartOffset() + 51;	// set offset for serialization
  
             beginErrorPercent400 = getStartOffset() + 56;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
             beginAvgElapsedN800 = getStartOffset() + 61;	// set offset for serialization
  
             beginAvgElapsed800 = getStartOffset() + 72;	// set offset for serialization
  
             beginSuccessPercent800 = getStartOffset() + 86;	// set offset for serialization
  
             beginErrorPercent800 = getStartOffset() + 92;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localExtractZLogEofSw100Counter = -1;
     public boolean isExtractZLogEofSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtractZLogEofSw100Counter != sharedCounter;
         localExtractZLogEofSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkExtractZLogEofSw100Constraints(char[] value) {
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
     int localHdrLine3203Counter = -1;
     public boolean isHdrLine3203Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdrLine3203Counter != sharedCounter;
         localHdrLine3203Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdrLine3203Constraints(char[] value) {
   			return super.checkConstraints(value , 145 ,false, false);
   }
     int localHdrLine4204Counter = -1;
     public boolean isHdrLine4204Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdrLine4204Counter != sharedCounter;
         localHdrLine4204Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdrLine4204Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localDtlLine2206Counter = -1;
     public boolean isDtlLine2206Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDtlLine2206Counter != sharedCounter;
         localDtlLine2206Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDtlLine2206Constraints(char[] value) {
   			return super.checkConstraints(value , 127 ,false, false);
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
     int localNum0300Counter = -1;
     public boolean isNum0300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNum0300Counter != sharedCounter;
         localNum0300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of num0300
	 *	@return num0300
	 */
	public char[]  getNum0300String() {
	     return getCharArray(beginNum0300,NUM_0300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num0300IsNumeric() {
	    return isNumeric(beginNum0300
	                    ,beginNum0300 + NUM_0300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUM_0300_LEN = 1;
  	/**
	 * serializeNum0300
	 */
	protected void serializeNum0300(int num0300) {
		 putNumber(beginNum0300,num0300,NUM_0300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNum0300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNum0300
	 */
   	protected  int serializeNum0300(char[] value) {
	    int  num0300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    num0300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginNum0300
		       ,1
		      );
		 localNum0300Counter = shareString.getSerializedField().getModifiedCounter();
		return  num0300;
    }

   protected int checkNum0300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNum0300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNum0300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNum0300
			                 ,NUM_0300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("num0300", beginNum0300,NUM_0300_LEN);
    }
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
        int localReadCount400Counter = -1;
        public boolean isReadCount400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localReadCount400Counter != sharedCounter;
           localReadCount400Counter = sharedCounter; return hasModified; 
        }
	    public boolean readCount400IsNumeric() {
	      return decimalIsNumeric(beginReadCount400,READ_COUNT_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int READ_COUNT_400_LEN = 6;
  	/**
	 * 	serializeReadCount400
	 */
	protected void serializeReadCount400(long readCount400) {
		   putDecimal(beginReadCount400,readCount400,READ_COUNT_400_LEN,true);
   }
   

   protected long checkReadCount400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshReadCount400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshReadCount400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginReadCount400,READ_COUNT_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("readCount400", beginReadCount400,READ_COUNT_400_LEN);
     }
   	}
        int localWriteCount400Counter = -1;
        public boolean isWriteCount400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWriteCount400Counter != sharedCounter;
           localWriteCount400Counter = sharedCounter; return hasModified; 
        }
	    public boolean writeCount400IsNumeric() {
	      return decimalIsNumeric(beginWriteCount400,WRITE_COUNT_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int WRITE_COUNT_400_LEN = 6;
  	/**
	 * 	serializeWriteCount400
	 */
	protected void serializeWriteCount400(long writeCount400) {
		   putDecimal(beginWriteCount400,writeCount400,WRITE_COUNT_400_LEN,true);
   }
   

   protected long checkWriteCount400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshWriteCount400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWriteCount400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginWriteCount400,WRITE_COUNT_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("writeCount400", beginWriteCount400,WRITE_COUNT_400_LEN);
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
        int localLineCount400Counter = -1;
        public boolean isLineCount400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localLineCount400Counter != sharedCounter;
           localLineCount400Counter = sharedCounter; return hasModified; 
        }
	    public boolean lineCount400IsNumeric() {
	      return decimalIsNumeric(beginLineCount400,LINE_COUNT_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int LINE_COUNT_400_LEN = 6;
  	/**
	 * 	serializeLineCount400
	 */
	protected void serializeLineCount400(long lineCount400) {
		   putDecimal(beginLineCount400,lineCount400,LINE_COUNT_400_LEN,true);
   }
   

   protected long checkLineCount400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshLineCount400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshLineCount400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginLineCount400,LINE_COUNT_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("lineCount400", beginLineCount400,LINE_COUNT_400_LEN);
     }
   	}
        int localSuccessCount400Counter = -1;
        public boolean isSuccessCount400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSuccessCount400Counter != sharedCounter;
           localSuccessCount400Counter = sharedCounter; return hasModified; 
        }
	    public boolean successCount400IsNumeric() {
	      return decimalIsNumeric(beginSuccessCount400,SUCCESS_COUNT_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SUCCESS_COUNT_400_LEN = 6;
  	/**
	 * 	serializeSuccessCount400
	 */
	protected void serializeSuccessCount400(long successCount400) {
		   putDecimal(beginSuccessCount400,successCount400,SUCCESS_COUNT_400_LEN,true);
   }
   

   protected long checkSuccessCount400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSuccessCount400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSuccessCount400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginSuccessCount400,SUCCESS_COUNT_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("successCount400", beginSuccessCount400,SUCCESS_COUNT_400_LEN);
     }
   	}
        int localErrorCount400Counter = -1;
        public boolean isErrorCount400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localErrorCount400Counter != sharedCounter;
           localErrorCount400Counter = sharedCounter; return hasModified; 
        }
	    public boolean errorCount400IsNumeric() {
	      return decimalIsNumeric(beginErrorCount400,ERROR_COUNT_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int ERROR_COUNT_400_LEN = 6;
  	/**
	 * 	serializeErrorCount400
	 */
	protected void serializeErrorCount400(long errorCount400) {
		   putDecimal(beginErrorCount400,errorCount400,ERROR_COUNT_400_LEN,true);
   }
   

   protected long checkErrorCount400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshErrorCount400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshErrorCount400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginErrorCount400,ERROR_COUNT_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("errorCount400", beginErrorCount400,ERROR_COUNT_400_LEN);
     }
   	}
        int localTotMessCount400Counter = -1;
        public boolean isTotMessCount400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTotMessCount400Counter != sharedCounter;
           localTotMessCount400Counter = sharedCounter; return hasModified; 
        }
	    public boolean totMessCount400IsNumeric() {
	      return decimalIsNumeric(beginTotMessCount400,TOT_MESS_COUNT_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TOT_MESS_COUNT_400_LEN = 6;
  	/**
	 * 	serializeTotMessCount400
	 */
	protected void serializeTotMessCount400(long totMessCount400) {
		   putDecimal(beginTotMessCount400,totMessCount400,TOT_MESS_COUNT_400_LEN,true);
   }
   

   protected long checkTotMessCount400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTotMessCount400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTotMessCount400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTotMessCount400,TOT_MESS_COUNT_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("totMessCount400", beginTotMessCount400,TOT_MESS_COUNT_400_LEN);
     }
   	}
     int localSuccessPercent400Counter = -1;
     
     public boolean isSuccessPercent400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSuccessPercent400Counter != sharedCounter;
         localSuccessPercent400Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of successPercent400
	 *	@return successPercent400
	 */
	public char[]  getSuccessPercent400String() {
	    return getCharArray(beginSuccessPercent400,SUCCESS_PERCENT_400_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean successPercent400IsNumeric() {
		    return isNumeric(beginSuccessPercent400
	                    ,beginSuccessPercent400 + SUCCESS_PERCENT_400_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SUCCESS_PERCENT_400_LEN = 5;
  protected  static final int SUCCESS_PERCENT_400_SCALE = 2;

   protected BigDecimal checkSuccessPercent400MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }

  	/**
	 * serializeSuccessPercent400
	 */
	protected void serializeSuccessPercent400(BigDecimal successPercent400) {
	       putNumber(beginSuccessPercent400,successPercent400,SUCCESS_PERCENT_400_LEN,SUCCESS_PERCENT_400_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSuccessPercent400Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSuccessPercent400
	 */
   	protected  BigDecimal serializeSuccessPercent400(char[] value) throws CFException {
        if (value.length < 5) value = pad(5, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginSuccessPercent400
		       ,5
		      );		 localSuccessPercent400Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SUCCESS_PERCENT_400_LEN,SUCCESS_PERCENT_400_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("successPercent400", beginSuccessPercent400,SUCCESS_PERCENT_400_LEN);
    	}
    }
    /**
	 *	refreshSuccessPercent400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSuccessPercent400() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSuccessPercent400
			            ,SUCCESS_PERCENT_400_LEN
			            ,SUCCESS_PERCENT_400_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("successPercent400", beginSuccessPercent400,SUCCESS_PERCENT_400_LEN);
    }
   	}
     int localErrorPercent400Counter = -1;
     
     public boolean isErrorPercent400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorPercent400Counter != sharedCounter;
         localErrorPercent400Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of errorPercent400
	 *	@return errorPercent400
	 */
	public char[]  getErrorPercent400String() {
	    return getCharArray(beginErrorPercent400,ERROR_PERCENT_400_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorPercent400IsNumeric() {
		    return isNumeric(beginErrorPercent400
	                    ,beginErrorPercent400 + ERROR_PERCENT_400_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int ERROR_PERCENT_400_LEN = 5;
  protected  static final int ERROR_PERCENT_400_SCALE = 2;

   protected BigDecimal checkErrorPercent400MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }

  	/**
	 * serializeErrorPercent400
	 */
	protected void serializeErrorPercent400(BigDecimal errorPercent400) {
	       putNumber(beginErrorPercent400,errorPercent400,ERROR_PERCENT_400_LEN,ERROR_PERCENT_400_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localErrorPercent400Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeErrorPercent400
	 */
   	protected  BigDecimal serializeErrorPercent400(char[] value) throws CFException {
        if (value.length < 5) value = pad(5, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginErrorPercent400
		       ,5
		      );		 localErrorPercent400Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,ERROR_PERCENT_400_LEN,ERROR_PERCENT_400_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("errorPercent400", beginErrorPercent400,ERROR_PERCENT_400_LEN);
    	}
    }
    /**
	 *	refreshErrorPercent400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshErrorPercent400() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginErrorPercent400
			            ,ERROR_PERCENT_400_LEN
			            ,ERROR_PERCENT_400_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("errorPercent400", beginErrorPercent400,ERROR_PERCENT_400_LEN);
    }
   	}
     int localStartExecMsg600Counter = -1;
     public boolean isStartExecMsg600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStartExecMsg600Counter != sharedCounter;
         localStartExecMsg600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkStartExecMsg600Constraints(char[] value) {
   			return super.checkConstraints(value , 64 ,false, false);
   }
     int localNoRecordFoundMsg600Counter = -1;
     public boolean isNoRecordFoundMsg600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNoRecordFoundMsg600Counter != sharedCounter;
         localNoRecordFoundMsg600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkNoRecordFoundMsg600Constraints(char[] value) {
   			return super.checkConstraints(value , 38 ,false, false);
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
         int localReturnCode800Counter = -1;
         public boolean isReturnCode800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localReturnCode800Counter != sharedCounter;
            localReturnCode800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkReturnCode800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localPrevServerId800Counter = -1;
     public boolean isPrevServerId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrevServerId800Counter != sharedCounter;
         localPrevServerId800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPrevServerId800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localPrevLogType800Counter = -1;
     public boolean isPrevLogType800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrevLogType800Counter != sharedCounter;
         localPrevLogType800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPrevLogType800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localPrevServiceId800Counter = -1;
     public boolean isPrevServiceId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrevServiceId800Counter != sharedCounter;
         localPrevServiceId800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPrevServiceId800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
         int localSumElapsedTime800Counter = -1;
         public boolean isSumElapsedTime800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSumElapsedTime800Counter != sharedCounter;
            localSumElapsedTime800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSumElapsedTime800MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localHighElapsed800Counter = -1;
         public boolean isHighElapsed800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHighElapsed800Counter != sharedCounter;
            localHighElapsed800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkHighElapsed800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localLowElapsed800Counter = -1;
         public boolean isLowElapsed800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLowElapsed800Counter != sharedCounter;
            localLowElapsed800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkLowElapsed800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
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
     int localAvgElapsedN800Counter = -1;
     
     public boolean isAvgElapsedN800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAvgElapsedN800Counter != sharedCounter;
         localAvgElapsedN800Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of avgElapsedN800
	 *	@return avgElapsedN800
	 */
	public char[]  getAvgElapsedN800String() {
	    return getCharArray(beginAvgElapsedN800,AVG_ELAPSED_N_800_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean avgElapsedN800IsNumeric() {
		    return isNumeric(beginAvgElapsedN800
	                    ,beginAvgElapsedN800 + AVG_ELAPSED_N_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int AVG_ELAPSED_N_800_LEN = 11;
  protected  static final int AVG_ELAPSED_N_800_SCALE = 2;

   protected BigDecimal checkAvgElapsedN800MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }

  	/**
	 * serializeAvgElapsedN800
	 */
	protected void serializeAvgElapsedN800(BigDecimal avgElapsedN800) {
	       putNumber(beginAvgElapsedN800,avgElapsedN800,AVG_ELAPSED_N_800_LEN,AVG_ELAPSED_N_800_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAvgElapsedN800Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeAvgElapsedN800
	 */
   	protected  BigDecimal serializeAvgElapsedN800(char[] value) throws CFException {
        if (value.length < 11) value = pad(11, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginAvgElapsedN800
		       ,11
		      );		 localAvgElapsedN800Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,AVG_ELAPSED_N_800_LEN,AVG_ELAPSED_N_800_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("avgElapsedN800", beginAvgElapsedN800,AVG_ELAPSED_N_800_LEN);
    	}
    }
    /**
	 *	refreshAvgElapsedN800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshAvgElapsedN800() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginAvgElapsedN800
			            ,AVG_ELAPSED_N_800_LEN
			            ,AVG_ELAPSED_N_800_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("avgElapsedN800", beginAvgElapsedN800,AVG_ELAPSED_N_800_LEN);
    }
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
     int localErrorPercent800Counter = -1;
     public boolean isErrorPercent800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorPercent800Counter != sharedCounter;
         localErrorPercent800Counter = sharedCounter; return hasModified;
     }
	protected static final int ERROR_PERCENT_800_LEN = 6;
	/**
	 * 	serialize this ErrorPercent800
	 */
   protected void serializeErrorPercent800(char[] errorPercent800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errorPercent800,0,getStringValue(),beginErrorPercent800,ERROR_PERCENT_800_LEN);
       localErrorPercent800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrorPercent800Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshErrorPercent800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrorPercent800() {	 
   		return (substring(getStringValue(),beginErrorPercent800,beginErrorPercent800 + ERROR_PERCENT_800_LEN));
   	}




}
  
