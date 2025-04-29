package com.cloudframe.app.ip200090.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
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
            protected  int beginValue1643300;
            protected  int beginValue1659300;
            protected  int beginValue1441300;
            protected  int beginValue1811300;
            protected  int beginValue1813300;
	
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
  
  
  
  
  
  
  
  
  
  
  
             beginValue1643300 = getStartOffset() + 0;	// set offset for serialization
  
             beginValue1659300 = getStartOffset() + 4;	// set offset for serialization
  
             beginValue1441300 = getStartOffset() + 8;	// set offset for serialization
  
             beginValue1811300 = getStartOffset() + 12;	// set offset for serialization
  
             beginValue1813300 = getStartOffset() + 16;	// set offset for serialization
  
  
  
  
  
  
  
  
  
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
     int localIsCandidatePresent100Counter = -1;
     public boolean isIsCandidatePresent100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsCandidatePresent100Counter != sharedCounter;
         localIsCandidatePresent100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsCandidatePresent100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsSubfldCheckOver100Counter = -1;
     public boolean isIsSubfldCheckOver100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsSubfldCheckOver100Counter != sharedCounter;
         localIsSubfldCheckOver100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsSubfldCheckOver100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localEdit0009300Counter = -1;
     public boolean isEdit0009300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEdit0009300Counter != sharedCounter;
         localEdit0009300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkEdit0009300Constraints(char[] value) {
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
     int localAbendPgm300Counter = -1;
     public boolean isAbendPgm300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendPgm300Counter != sharedCounter;
         localAbendPgm300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendPgm300Constraints(char[] value) {
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
     int localPgmIp200100300Counter = -1;
     public boolean isPgmIp200100300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp200100300Counter != sharedCounter;
         localPgmIp200100300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp200100300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp381120300Counter = -1;
     public boolean isPgmIp381120300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp381120300Counter != sharedCounter;
         localPgmIp381120300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp381120300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localValueX300Counter = -1;
     public boolean isValueX300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueX300Counter != sharedCounter;
         localValueX300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueX300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localValueY300Counter = -1;
     public boolean isValueY300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueY300Counter != sharedCounter;
         localValueY300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueY300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localValue1643300Counter = -1;
     public boolean isValue1643300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue1643300Counter != sharedCounter;
         localValue1643300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value1643300
	 *	@return value1643300
	 */
	public char[]  getValue1643300String() {
	     return getCharArray(beginValue1643300,VALUE_1643300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1643300IsNumeric() {
	    return isNumeric(beginValue1643300
	                    ,beginValue1643300 + VALUE_1643300_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_1643300_LEN = 4;
  	/**
	 * serializeValue1643300
	 */
	protected void serializeValue1643300(short value1643300) {
		 putNumber(beginValue1643300,value1643300,VALUE_1643300_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue1643300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue1643300
	 */
   	protected  short serializeValue1643300(char[] value) {
	    short  value1643300;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value1643300 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginValue1643300
		       ,4
		      );
		 localValue1643300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value1643300;
    }

   protected short checkValue1643300MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshValue1643300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshValue1643300() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginValue1643300
			                 ,VALUE_1643300_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value1643300", beginValue1643300,VALUE_1643300_LEN);
    }
   	}
     int localValue1659300Counter = -1;
     public boolean isValue1659300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue1659300Counter != sharedCounter;
         localValue1659300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value1659300
	 *	@return value1659300
	 */
	public char[]  getValue1659300String() {
	     return getCharArray(beginValue1659300,VALUE_1659300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1659300IsNumeric() {
	    return isNumeric(beginValue1659300
	                    ,beginValue1659300 + VALUE_1659300_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_1659300_LEN = 4;
  	/**
	 * serializeValue1659300
	 */
	protected void serializeValue1659300(short value1659300) {
		 putNumber(beginValue1659300,value1659300,VALUE_1659300_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue1659300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue1659300
	 */
   	protected  short serializeValue1659300(char[] value) {
	    short  value1659300;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value1659300 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginValue1659300
		       ,4
		      );
		 localValue1659300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value1659300;
    }

   protected short checkValue1659300MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshValue1659300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshValue1659300() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginValue1659300
			                 ,VALUE_1659300_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value1659300", beginValue1659300,VALUE_1659300_LEN);
    }
   	}
     int localValue1441300Counter = -1;
     public boolean isValue1441300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue1441300Counter != sharedCounter;
         localValue1441300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value1441300
	 *	@return value1441300
	 */
	public char[]  getValue1441300String() {
	     return getCharArray(beginValue1441300,VALUE_1441300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1441300IsNumeric() {
	    return isNumeric(beginValue1441300
	                    ,beginValue1441300 + VALUE_1441300_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_1441300_LEN = 4;
  	/**
	 * serializeValue1441300
	 */
	protected void serializeValue1441300(short value1441300) {
		 putNumber(beginValue1441300,value1441300,VALUE_1441300_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue1441300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue1441300
	 */
   	protected  short serializeValue1441300(char[] value) {
	    short  value1441300;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value1441300 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginValue1441300
		       ,4
		      );
		 localValue1441300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value1441300;
    }

   protected short checkValue1441300MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshValue1441300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshValue1441300() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginValue1441300
			                 ,VALUE_1441300_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value1441300", beginValue1441300,VALUE_1441300_LEN);
    }
   	}
     int localValue1811300Counter = -1;
     public boolean isValue1811300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue1811300Counter != sharedCounter;
         localValue1811300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value1811300
	 *	@return value1811300
	 */
	public char[]  getValue1811300String() {
	     return getCharArray(beginValue1811300,VALUE_1811300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1811300IsNumeric() {
	    return isNumeric(beginValue1811300
	                    ,beginValue1811300 + VALUE_1811300_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_1811300_LEN = 4;
  	/**
	 * serializeValue1811300
	 */
	protected void serializeValue1811300(short value1811300) {
		 putNumber(beginValue1811300,value1811300,VALUE_1811300_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue1811300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue1811300
	 */
   	protected  short serializeValue1811300(char[] value) {
	    short  value1811300;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value1811300 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginValue1811300
		       ,4
		      );
		 localValue1811300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value1811300;
    }

   protected short checkValue1811300MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshValue1811300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshValue1811300() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginValue1811300
			                 ,VALUE_1811300_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value1811300", beginValue1811300,VALUE_1811300_LEN);
    }
   	}
     int localValue1813300Counter = -1;
     public boolean isValue1813300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue1813300Counter != sharedCounter;
         localValue1813300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value1813300
	 *	@return value1813300
	 */
	public char[]  getValue1813300String() {
	     return getCharArray(beginValue1813300,VALUE_1813300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1813300IsNumeric() {
	    return isNumeric(beginValue1813300
	                    ,beginValue1813300 + VALUE_1813300_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_1813300_LEN = 4;
  	/**
	 * serializeValue1813300
	 */
	protected void serializeValue1813300(short value1813300) {
		 putNumber(beginValue1813300,value1813300,VALUE_1813300_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue1813300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue1813300
	 */
   	protected  short serializeValue1813300(char[] value) {
	    short  value1813300;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value1813300 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginValue1813300
		       ,4
		      );
		 localValue1813300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value1813300;
    }

   protected short checkValue1813300MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshValue1813300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshValue1813300() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginValue1813300
			                 ,VALUE_1813300_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value1813300", beginValue1813300,VALUE_1813300_LEN);
    }
   	}
     int localPara2200300Counter = -1;
     public boolean isPara2200300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2200300Counter != sharedCounter;
         localPara2200300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2200300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localWrongEditAbendCode300Counter = -1;
     public boolean isWrongEditAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWrongEditAbendCode300Counter != sharedCounter;
         localWrongEditAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWrongEditAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
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
     int localPtrIp200100800Counter = -1;
     public boolean isPtrIp200100800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp200100800Counter != sharedCounter;
         localPtrIp200100800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp200100800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp381120800Counter = -1;
     public boolean isPtrIp381120800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp381120800Counter != sharedCounter;
         localPtrIp381120800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp381120800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
         int localCandidateTagType800Counter = -1;
         public boolean isCandidateTagType800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCandidateTagType800Counter != sharedCounter;
            localCandidateTagType800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkCandidateTagType800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localSyntaxPgmPtr800Counter = -1;
     public boolean isSyntaxPgmPtr800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSyntaxPgmPtr800Counter != sharedCounter;
         localSyntaxPgmPtr800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSyntaxPgmPtr800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
         int localHoldReturnCode800Counter = -1;
         public boolean isHoldReturnCode800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHoldReturnCode800Counter != sharedCounter;
            localHoldReturnCode800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkHoldReturnCode800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }




}
  
