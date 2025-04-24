package com.cloudframe.app.unstrng0.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 42;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCount2;
            protected  int beginCount3;
            protected  int beginCount4;
            protected  int beginCount5;
            protected  int beginTally;
            protected  int beginPointer;
	
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
  
  
  
  
  
  
  
  
             beginCount2 = getStartOffset() + 0;	// set offset for serialization
  
             beginCount3 = getStartOffset() + 9;	// set offset for serialization
  
             beginCount4 = getStartOffset() + 12;	// set offset for serialization
  
             beginCount5 = getStartOffset() + 21;	// set offset for serialization
  
             beginTally = getStartOffset() + 24;	// set offset for serialization
  
             beginPointer = getStartOffset() + 33;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
         int localData0LenCounter = -1;
         public boolean isData0LenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localData0LenCounter != sharedCounter;
            localData0LenCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkData0LenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localData0Counter = -1;
     public boolean isData0Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localData0Counter != sharedCounter;
         localData0Counter = sharedCounter; return hasModified;
     }

   protected char[] checkData0Constraints(char[] value) {
   			return super.checkConstraints(value , 98 ,false, false);
   }
     int localDataCounter = -1;
     public boolean isDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDataCounter != sharedCounter;
         localDataCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDataConstraints(char[] value) {
   			return super.checkConstraints(value , 150 ,false, false);
   }
     int localDelim1Counter = -1;
     public boolean isDelim1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDelim1Counter != sharedCounter;
         localDelim1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDelim1Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localDelim3Counter = -1;
     public boolean isDelim3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDelim3Counter != sharedCounter;
         localDelim3Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDelim3Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localDelim4Counter = -1;
     public boolean isDelim4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDelim4Counter != sharedCounter;
         localDelim4Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDelim4Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
         int localCountCounter = -1;
         public boolean isCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCountCounter != sharedCounter;
            localCountCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCountMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localCount1Counter = -1;
         public boolean isCount1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCount1Counter != sharedCounter;
            localCount1Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCount1MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localCount2Counter = -1;
     public boolean isCount2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCount2Counter != sharedCounter;
         localCount2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of count2
	 *	@return count2
	 */
	public char[]  getCount2String() {
	     return getCharArray(beginCount2,COUNT_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean count2IsNumeric() {
	    return isNumeric(beginCount2
	                    ,beginCount2 + COUNT_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int COUNT_2_LEN = 9;
  	/**
	 * serializeCount2
	 */
	protected void serializeCount2(long count2) {
		 putNumber(beginCount2,count2,COUNT_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCount2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCount2
	 */
   	protected  long serializeCount2(char[] value) {
	    long  count2;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    count2 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginCount2
		       ,9
		      );
		 localCount2Counter = shareString.getSerializedField().getModifiedCounter();
		return  count2;
    }

   protected long checkCount2MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCount2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCount2() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCount2
			                 ,COUNT_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("count2", beginCount2,COUNT_2_LEN);
    }
   	}
        int localCount3Counter = -1;
        public boolean isCount3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCount3Counter != sharedCounter;
           localCount3Counter = sharedCounter; return hasModified; 
        }
	    public boolean count3IsNumeric() {
	      return decimalIsNumeric(beginCount3,COUNT_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int COUNT_3_LEN = 3;
  	/**
	 * 	serializeCount3
	 */
	protected void serializeCount3(int count3) {
		   putDecimal(beginCount3,count3,COUNT_3_LEN,true);
   }
   

   protected int checkCount3MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshCount3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCount3() throws CFException {	
   	try { 
		 return (getIntDecimal(beginCount3,COUNT_3_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("count3", beginCount3,COUNT_3_LEN);
     }
   	}
     int localCount4Counter = -1;
     public boolean isCount4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCount4Counter != sharedCounter;
         localCount4Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of count4
	 *	@return count4
	 */
	public char[]  getCount4String() {
	     return getCharArray(beginCount4,COUNT_4_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean count4IsNumeric() {
	    return isNumeric(beginCount4
	                    ,beginCount4 + COUNT_4_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int COUNT_4_LEN = 9;
  	/**
	 * serializeCount4
	 */
	protected void serializeCount4(long count4) {
		 putNumber(beginCount4,count4,COUNT_4_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCount4Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCount4
	 */
   	protected  long serializeCount4(char[] value) {
	    long  count4;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    count4 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginCount4
		       ,9
		      );
		 localCount4Counter = shareString.getSerializedField().getModifiedCounter();
		return  count4;
    }

   protected long checkCount4MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCount4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCount4() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCount4
			                 ,COUNT_4_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("count4", beginCount4,COUNT_4_LEN);
    }
   	}
        int localCount5Counter = -1;
        public boolean isCount5Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCount5Counter != sharedCounter;
           localCount5Counter = sharedCounter; return hasModified; 
        }
	    public boolean count5IsNumeric() {
	      return decimalIsNumeric(beginCount5,COUNT_5_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int COUNT_5_LEN = 3;
  	/**
	 * 	serializeCount5
	 */
	protected void serializeCount5(int count5) {
		   putDecimal(beginCount5,count5,COUNT_5_LEN,true);
   }
   

   protected int checkCount5MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshCount5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCount5() throws CFException {	
   	try { 
		 return (getIntDecimal(beginCount5,COUNT_5_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("count5", beginCount5,COUNT_5_LEN);
     }
   	}
     int localTallyCounter = -1;
     public boolean isTallyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTallyCounter != sharedCounter;
         localTallyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tally
	 *	@return tally
	 */
	public char[]  getTallyString() {
	     return getCharArray(beginTally,TALLY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tallyIsNumeric() {
	    return isNumeric(beginTally
	                    ,beginTally + TALLY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TALLY_LEN = 9;
  	/**
	 * serializeTally
	 */
	protected void serializeTally(long tally) {
		 putNumber(beginTally,tally,TALLY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTallyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTally
	 */
   	protected  long serializeTally(char[] value) {
	    long  tally;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tally = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginTally
		       ,9
		      );
		 localTallyCounter = shareString.getSerializedField().getModifiedCounter();
		return  tally;
    }

   protected long checkTallyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTally is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTally() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTally
			                 ,TALLY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tally", beginTally,TALLY_LEN);
    }
   	}
     int localPointerCounter = -1;
     public boolean isPointerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPointerCounter != sharedCounter;
         localPointerCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of pointer
	 *	@return pointer
	 */
	public char[]  getPointerString() {
	     return getCharArray(beginPointer,POINTER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pointerIsNumeric() {
	    return isNumeric(beginPointer
	                    ,beginPointer + POINTER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int POINTER_LEN = 9;
  	/**
	 * serializePointer
	 */
	protected void serializePointer(long pointer) {
		 putNumber(beginPointer,pointer,POINTER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPointerCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePointer
	 */
   	protected  long serializePointer(char[] value) {
	    long  pointer;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    pointer = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginPointer
		       ,9
		      );
		 localPointerCounter = shareString.getSerializedField().getModifiedCounter();
		return  pointer;
    }

   protected long checkPointerMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPointer is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPointer() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPointer
			                 ,POINTER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("pointer", beginPointer,POINTER_LEN);
    }
   	}
     int localField1Counter = -1;
     public boolean isField1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localField1Counter != sharedCounter;
         localField1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkField1Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
     int localField2Counter = -1;
     public boolean isField2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localField2Counter != sharedCounter;
         localField2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkField2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localField3Counter = -1;
     public boolean isField3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localField3Counter != sharedCounter;
         localField3Counter = sharedCounter; return hasModified;
     }

   protected char[] checkField3Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
     int localField4Counter = -1;
     public boolean isField4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localField4Counter != sharedCounter;
         localField4Counter = sharedCounter; return hasModified;
     }

   protected char[] checkField4Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
     int localField5Counter = -1;
     public boolean isField5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localField5Counter != sharedCounter;
         localField5Counter = sharedCounter; return hasModified;
     }

   protected char[] checkField5Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localInputRecCounter = -1;
     public boolean isInputRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputRecCounter != sharedCounter;
         localInputRecCounter = sharedCounter; return hasModified;
     }

   protected char[] checkInputRecConstraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
     int localInputRecOverflw1Counter = -1;
     public boolean isInputRecOverflw1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputRecOverflw1Counter != sharedCounter;
         localInputRecOverflw1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkInputRecOverflw1Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
     int localInputRecOverflw2Counter = -1;
     public boolean isInputRecOverflw2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputRecOverflw2Counter != sharedCounter;
         localInputRecOverflw2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkInputRecOverflw2Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
     int localInputRecOverflw3Counter = -1;
     public boolean isInputRecOverflw3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputRecOverflw3Counter != sharedCounter;
         localInputRecOverflw3Counter = sharedCounter; return hasModified;
     }

   protected char[] checkInputRecOverflw3Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
     int localVal1Counter = -1;
     public boolean isVal1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVal1Counter != sharedCounter;
         localVal1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkVal1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localVal2Counter = -1;
     public boolean isVal2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVal2Counter != sharedCounter;
         localVal2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkVal2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localVal3Counter = -1;
     public boolean isVal3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVal3Counter != sharedCounter;
         localVal3Counter = sharedCounter; return hasModified;
     }

   protected char[] checkVal3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localVal4Counter = -1;
     public boolean isVal4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVal4Counter != sharedCounter;
         localVal4Counter = sharedCounter; return hasModified;
     }

   protected char[] checkVal4Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localVal5Counter = -1;
     public boolean isVal5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVal5Counter != sharedCounter;
         localVal5Counter = sharedCounter; return hasModified;
     }

   protected char[] checkVal5Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localVal6Counter = -1;
     public boolean isVal6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVal6Counter != sharedCounter;
         localVal6Counter = sharedCounter; return hasModified;
     }

   protected char[] checkVal6Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localVal7Counter = -1;
     public boolean isVal7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVal7Counter != sharedCounter;
         localVal7Counter = sharedCounter; return hasModified;
     }

   protected char[] checkVal7Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localVal8Counter = -1;
     public boolean isVal8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVal8Counter != sharedCounter;
         localVal8Counter = sharedCounter; return hasModified;
     }

   protected char[] checkVal8Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localVal9Counter = -1;
     public boolean isVal9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVal9Counter != sharedCounter;
         localVal9Counter = sharedCounter; return hasModified;
     }

   protected char[] checkVal9Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localValaCounter = -1;
     public boolean isValaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValaCounter != sharedCounter;
         localValaCounter = sharedCounter; return hasModified;
     }

   protected char[] checkValaConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localValbCounter = -1;
     public boolean isValbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValbCounter != sharedCounter;
         localValbCounter = sharedCounter; return hasModified;
     }

   protected char[] checkValbConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localValcCounter = -1;
     public boolean isValcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValcCounter != sharedCounter;
         localValcCounter = sharedCounter; return hasModified;
     }

   protected char[] checkValcConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localRetainCounter = -1;
     public boolean isRetainModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRetainCounter != sharedCounter;
         localRetainCounter = sharedCounter; return hasModified;
     }

   protected char[] checkRetainConstraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }




}
  
