package com.cloudframe.app.mcwin.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 14;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginNum00300;
            protected  int beginNum04300;
            protected  int beginNum08300;
            protected  int beginNum16300;
            protected  int beginNum99300;
            protected  int beginNum19300;
            protected  int beginNum20300;
	
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
  
  
  
  
  
             beginNum00300 = getStartOffset() + 0;	// set offset for serialization
  
             beginNum04300 = getStartOffset() + 2;	// set offset for serialization
  
             beginNum08300 = getStartOffset() + 4;	// set offset for serialization
  
             beginNum16300 = getStartOffset() + 6;	// set offset for serialization
  
             beginNum99300 = getStartOffset() + 8;	// set offset for serialization
  
             beginNum19300 = getStartOffset() + 10;	// set offset for serialization
  
             beginNum20300 = getStartOffset() + 12;	// set offset for serialization
  
  
  
  
  
  
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
     int localMciwinReturnedYearCounter = -1;
     public boolean isMciwinReturnedYearModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciwinReturnedYearCounter != sharedCounter;
         localMciwinReturnedYearCounter = sharedCounter; return hasModified;
     }

   protected char[] checkMciwinReturnedYearConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
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
     int localPgmMcwin300Counter = -1;
     public boolean isPgmMcwin300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmMcwin300Counter != sharedCounter;
         localPgmMcwin300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmMcwin300Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
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
     int localNum00300Counter = -1;
     public boolean isNum00300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNum00300Counter != sharedCounter;
         localNum00300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of num00300
	 *	@return num00300
	 */
	public char[]  getNum00300String() {
	     return getCharArray(beginNum00300,NUM_00300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num00300IsNumeric() {
	    return isNumeric(beginNum00300
	                    ,beginNum00300 + NUM_00300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUM_00300_LEN = 2;
  	/**
	 * serializeNum00300
	 */
	protected void serializeNum00300(int num00300) {
		 putNumber(beginNum00300,num00300,NUM_00300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNum00300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNum00300
	 */
   	protected  int serializeNum00300(char[] value) {
	    int  num00300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    num00300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginNum00300
		       ,2
		      );
		 localNum00300Counter = shareString.getSerializedField().getModifiedCounter();
		return  num00300;
    }

   protected int checkNum00300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNum00300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNum00300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNum00300
			                 ,NUM_00300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("num00300", beginNum00300,NUM_00300_LEN);
    }
   	}
     int localNum04300Counter = -1;
     public boolean isNum04300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNum04300Counter != sharedCounter;
         localNum04300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of num04300
	 *	@return num04300
	 */
	public char[]  getNum04300String() {
	     return getCharArray(beginNum04300,NUM_04300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num04300IsNumeric() {
	    return isNumeric(beginNum04300
	                    ,beginNum04300 + NUM_04300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUM_04300_LEN = 2;
  	/**
	 * serializeNum04300
	 */
	protected void serializeNum04300(int num04300) {
		 putNumber(beginNum04300,num04300,NUM_04300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNum04300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNum04300
	 */
   	protected  int serializeNum04300(char[] value) {
	    int  num04300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    num04300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginNum04300
		       ,2
		      );
		 localNum04300Counter = shareString.getSerializedField().getModifiedCounter();
		return  num04300;
    }

   protected int checkNum04300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNum04300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNum04300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNum04300
			                 ,NUM_04300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("num04300", beginNum04300,NUM_04300_LEN);
    }
   	}
     int localNum08300Counter = -1;
     public boolean isNum08300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNum08300Counter != sharedCounter;
         localNum08300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of num08300
	 *	@return num08300
	 */
	public char[]  getNum08300String() {
	     return getCharArray(beginNum08300,NUM_08300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num08300IsNumeric() {
	    return isNumeric(beginNum08300
	                    ,beginNum08300 + NUM_08300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUM_08300_LEN = 2;
  	/**
	 * serializeNum08300
	 */
	protected void serializeNum08300(int num08300) {
		 putNumber(beginNum08300,num08300,NUM_08300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNum08300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNum08300
	 */
   	protected  int serializeNum08300(char[] value) {
	    int  num08300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    num08300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginNum08300
		       ,2
		      );
		 localNum08300Counter = shareString.getSerializedField().getModifiedCounter();
		return  num08300;
    }

   protected int checkNum08300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNum08300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNum08300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNum08300
			                 ,NUM_08300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("num08300", beginNum08300,NUM_08300_LEN);
    }
   	}
     int localNum16300Counter = -1;
     public boolean isNum16300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNum16300Counter != sharedCounter;
         localNum16300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of num16300
	 *	@return num16300
	 */
	public char[]  getNum16300String() {
	     return getCharArray(beginNum16300,NUM_16300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num16300IsNumeric() {
	    return isNumeric(beginNum16300
	                    ,beginNum16300 + NUM_16300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUM_16300_LEN = 2;
  	/**
	 * serializeNum16300
	 */
	protected void serializeNum16300(int num16300) {
		 putNumber(beginNum16300,num16300,NUM_16300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNum16300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNum16300
	 */
   	protected  int serializeNum16300(char[] value) {
	    int  num16300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    num16300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginNum16300
		       ,2
		      );
		 localNum16300Counter = shareString.getSerializedField().getModifiedCounter();
		return  num16300;
    }

   protected int checkNum16300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNum16300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNum16300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNum16300
			                 ,NUM_16300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("num16300", beginNum16300,NUM_16300_LEN);
    }
   	}
     int localNum99300Counter = -1;
     public boolean isNum99300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNum99300Counter != sharedCounter;
         localNum99300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of num99300
	 *	@return num99300
	 */
	public char[]  getNum99300String() {
	     return getCharArray(beginNum99300,NUM_99300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num99300IsNumeric() {
	    return isNumeric(beginNum99300
	                    ,beginNum99300 + NUM_99300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUM_99300_LEN = 2;
  	/**
	 * serializeNum99300
	 */
	protected void serializeNum99300(int num99300) {
		 putNumber(beginNum99300,num99300,NUM_99300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNum99300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNum99300
	 */
   	protected  int serializeNum99300(char[] value) {
	    int  num99300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    num99300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginNum99300
		       ,2
		      );
		 localNum99300Counter = shareString.getSerializedField().getModifiedCounter();
		return  num99300;
    }

   protected int checkNum99300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNum99300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNum99300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNum99300
			                 ,NUM_99300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("num99300", beginNum99300,NUM_99300_LEN);
    }
   	}
     int localNum19300Counter = -1;
     public boolean isNum19300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNum19300Counter != sharedCounter;
         localNum19300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of num19300
	 *	@return num19300
	 */
	public char[]  getNum19300String() {
	     return getCharArray(beginNum19300,NUM_19300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num19300IsNumeric() {
	    return isNumeric(beginNum19300
	                    ,beginNum19300 + NUM_19300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUM_19300_LEN = 2;
  	/**
	 * serializeNum19300
	 */
	protected void serializeNum19300(int num19300) {
		 putNumber(beginNum19300,num19300,NUM_19300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNum19300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNum19300
	 */
   	protected  int serializeNum19300(char[] value) {
	    int  num19300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    num19300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginNum19300
		       ,2
		      );
		 localNum19300Counter = shareString.getSerializedField().getModifiedCounter();
		return  num19300;
    }

   protected int checkNum19300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNum19300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNum19300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNum19300
			                 ,NUM_19300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("num19300", beginNum19300,NUM_19300_LEN);
    }
   	}
     int localNum20300Counter = -1;
     public boolean isNum20300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNum20300Counter != sharedCounter;
         localNum20300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of num20300
	 *	@return num20300
	 */
	public char[]  getNum20300String() {
	     return getCharArray(beginNum20300,NUM_20300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num20300IsNumeric() {
	    return isNumeric(beginNum20300
	                    ,beginNum20300 + NUM_20300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUM_20300_LEN = 2;
  	/**
	 * serializeNum20300
	 */
	protected void serializeNum20300(int num20300) {
		 putNumber(beginNum20300,num20300,NUM_20300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNum20300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNum20300
	 */
   	protected  int serializeNum20300(char[] value) {
	    int  num20300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    num20300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginNum20300
		       ,2
		      );
		 localNum20300Counter = shareString.getSerializedField().getModifiedCounter();
		return  num20300;
    }

   protected int checkNum20300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNum20300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNum20300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNum20300
			                 ,NUM_20300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("num20300", beginNum20300,NUM_20300_LEN);
    }
   	}
     int localErrMsg004600Counter = -1;
     public boolean isErrMsg004600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrMsg004600Counter != sharedCounter;
         localErrMsg004600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrMsg004600Constraints(char[] value) {
   			return super.checkConstraints(value , 32 ,false, false);
   }
     int localErrMsg008600Counter = -1;
     public boolean isErrMsg008600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrMsg008600Counter != sharedCounter;
         localErrMsg008600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrMsg008600Constraints(char[] value) {
   			return super.checkConstraints(value , 32 ,false, false);
   }
     int localErrMsg016600Counter = -1;
     public boolean isErrMsg016600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrMsg016600Counter != sharedCounter;
         localErrMsg016600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrMsg016600Constraints(char[] value) {
   			return super.checkConstraints(value , 32 ,false, false);
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
     int localAbendText900Counter = -1;
     public boolean isAbendText900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendText900Counter != sharedCounter;
         localAbendText900Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendText900Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }




}
  
