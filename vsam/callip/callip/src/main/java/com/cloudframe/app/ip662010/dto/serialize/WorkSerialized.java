package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMaxBadIpmMsgs300;
            protected  int beginDisplayNumber600;
            protected  int beginTagNo600;
            protected  int beginTagSubfldNo600;
            protected  int beginTagStarts600;
            protected  int beginTagLngth600;
	
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
  
  
  
  
  
  
             beginMaxBadIpmMsgs300 = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginDisplayNumber600 = getStartOffset() + 4;	// set offset for serialization
  
  
             beginTagNo600 = getStartOffset() + 9;	// set offset for serialization
  
             beginTagSubfldNo600 = getStartOffset() + 13;	// set offset for serialization
  
             beginTagStarts600 = getStartOffset() + 17;	// set offset for serialization
  
             beginTagLngth600 = getStartOffset() + 21;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
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
     int localDoesVarSubfExist100Counter = -1;
     public boolean isDoesVarSubfExist100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDoesVarSubfExist100Counter != sharedCounter;
         localDoesVarSubfExist100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDoesVarSubfExist100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsAMapEntryPending100Counter = -1;
     public boolean isIsAMapEntryPending100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsAMapEntryPending100Counter != sharedCounter;
         localIsAMapEntryPending100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsAMapEntryPending100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localReadApi300Counter = -1;
     public boolean isReadApi300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReadApi300Counter != sharedCounter;
         localReadApi300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkReadApi300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localLoadT6T7300Counter = -1;
     public boolean isLoadT6T7300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLoadT6T7300Counter != sharedCounter;
         localLoadT6T7300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLoadT6T7300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localLoadT8T9300Counter = -1;
     public boolean isLoadT8T9300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLoadT8T9300Counter != sharedCounter;
         localLoadT8T9300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLoadT8T9300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localMaxBadIpmMsgs300Counter = -1;
     public boolean isMaxBadIpmMsgs300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaxBadIpmMsgs300Counter != sharedCounter;
         localMaxBadIpmMsgs300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of maxBadIpmMsgs300
	 *	@return maxBadIpmMsgs300
	 */
	public char[]  getMaxBadIpmMsgs300String() {
	     return getCharArray(beginMaxBadIpmMsgs300,MAX_BAD_IPM_MSGS_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maxBadIpmMsgs300IsNumeric() {
	    return isNumeric(beginMaxBadIpmMsgs300
	                    ,beginMaxBadIpmMsgs300 + MAX_BAD_IPM_MSGS_300_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MAX_BAD_IPM_MSGS_300_LEN = 4;
  	/**
	 * serializeMaxBadIpmMsgs300
	 */
	protected void serializeMaxBadIpmMsgs300(short maxBadIpmMsgs300) {
		 putNumber(beginMaxBadIpmMsgs300,maxBadIpmMsgs300,MAX_BAD_IPM_MSGS_300_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaxBadIpmMsgs300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMaxBadIpmMsgs300
	 */
   	protected  short serializeMaxBadIpmMsgs300(char[] value) {
	    short  maxBadIpmMsgs300;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    maxBadIpmMsgs300 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginMaxBadIpmMsgs300
		       ,4
		      );
		 localMaxBadIpmMsgs300Counter = shareString.getSerializedField().getModifiedCounter();
		return  maxBadIpmMsgs300;
    }

   protected short checkMaxBadIpmMsgs300MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshMaxBadIpmMsgs300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMaxBadIpmMsgs300() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginMaxBadIpmMsgs300
			                 ,MAX_BAD_IPM_MSGS_300_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("maxBadIpmMsgs300", beginMaxBadIpmMsgs300,MAX_BAD_IPM_MSGS_300_LEN);
    }
   	}
     int localReadParserChop300Counter = -1;
     public boolean isReadParserChop300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReadParserChop300Counter != sharedCounter;
         localReadParserChop300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkReadParserChop300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWriteParserChop300Counter = -1;
     public boolean isWriteParserChop300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWriteParserChop300Counter != sharedCounter;
         localWriteParserChop300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWriteParserChop300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIpmUpdaterChop300Counter = -1;
     public boolean isIpmUpdaterChop300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIpmUpdaterChop300Counter != sharedCounter;
         localIpmUpdaterChop300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIpmUpdaterChop300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localEofMessage300Counter = -1;
     public boolean isEofMessage300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEofMessage300Counter != sharedCounter;
         localEofMessage300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkEofMessage300Constraints(char[] value) {
   			return super.checkConstraints(value , 29 ,false, false);
   }
         int localCode661300Counter = -1;
         public boolean isCode661300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCode661300Counter != sharedCounter;
            localCode661300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkCode661300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBadMessageCount400Counter = -1;
         public boolean isBadMessageCount400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBadMessageCount400Counter != sharedCounter;
            localBadMessageCount400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBadMessageCount400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localPdsTag400Counter = -1;
         public boolean isPdsTag400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPdsTag400Counter != sharedCounter;
            localPdsTag400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkPdsTag400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localTagTableLength400Counter = -1;
         public boolean isTagTableLength400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTagTableLength400Counter != sharedCounter;
            localTagTableLength400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTagTableLength400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localI400Counter = -1;
         public boolean isI400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localI400Counter != sharedCounter;
            localI400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkI400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localJ400Counter = -1;
         public boolean isJ400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localJ400Counter != sharedCounter;
            localJ400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkJ400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localK400Counter = -1;
         public boolean isK400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localK400Counter != sharedCounter;
            localK400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkK400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localL400Counter = -1;
         public boolean isL400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localL400Counter != sharedCounter;
            localL400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkL400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localM400Counter = -1;
         public boolean isM400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localM400Counter != sharedCounter;
            localM400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkM400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localCurrentSubfld400Counter = -1;
         public boolean isCurrentSubfld400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCurrentSubfld400Counter != sharedCounter;
            localCurrentSubfld400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkCurrentSubfld400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSubfldLength400Counter = -1;
         public boolean isSubfldLength400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSubfldLength400Counter != sharedCounter;
            localSubfldLength400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSubfldLength400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localPdsLength400Counter = -1;
         public boolean isPdsLength400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPdsLength400Counter != sharedCounter;
            localPdsLength400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkPdsLength400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localRemainingCarrierLth400Counter = -1;
         public boolean isRemainingCarrierLth400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRemainingCarrierLth400Counter != sharedCounter;
            localRemainingCarrierLth400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkRemainingCarrierLth400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localParsedMsgLngth400Counter = -1;
         public boolean isParsedMsgLngth400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localParsedMsgLngth400Counter != sharedCounter;
            localParsedMsgLngth400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkParsedMsgLngth400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localErrEnd400Counter = -1;
         public boolean isErrEnd400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localErrEnd400Counter != sharedCounter;
            localErrEnd400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkErrEnd400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localErrStart400Counter = -1;
         public boolean isErrStart400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localErrStart400Counter != sharedCounter;
            localErrStart400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkErrStart400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localErrLngth400Counter = -1;
         public boolean isErrLngth400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localErrLngth400Counter != sharedCounter;
            localErrLngth400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkErrLngth400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localErrorMessageHeader600Counter = -1;
     public boolean isErrorMessageHeader600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorMessageHeader600Counter != sharedCounter;
         localErrorMessageHeader600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrorMessageHeader600Constraints(char[] value) {
   			return super.checkConstraints(value , 62 ,false, false);
   }
     int localTagTableHeader600Counter = -1;
     public boolean isTagTableHeader600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagTableHeader600Counter != sharedCounter;
         localTagTableHeader600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTagTableHeader600Constraints(char[] value) {
   			return super.checkConstraints(value , 51 ,false, false);
   }
         int localMissingBitMapNdx600Counter = -1;
         public boolean isMissingBitMapNdx600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMissingBitMapNdx600Counter != sharedCounter;
            localMissingBitMapNdx600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMissingBitMapNdx600MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localMissingBitMapCode600Counter = -1;
         public boolean isMissingBitMapCode600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMissingBitMapCode600Counter != sharedCounter;
            localMissingBitMapCode600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMissingBitMapCode600MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localMissingBitMap600Counter = -1;
     public boolean isMissingBitMap600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMissingBitMap600Counter != sharedCounter;
         localMissingBitMap600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMissingBitMap600Constraints(char[] value) {
   			return super.checkConstraints(value , 22 ,false, false);
   }
         int localNonNumericLngthNdx600Counter = -1;
         public boolean isNonNumericLngthNdx600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNonNumericLngthNdx600Counter != sharedCounter;
            localNonNumericLngthNdx600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkNonNumericLngthNdx600MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localNonNumericLngthCode600Counter = -1;
         public boolean isNonNumericLngthCode600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNonNumericLngthCode600Counter != sharedCounter;
            localNonNumericLngthCode600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkNonNumericLngthCode600MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localNonNumericLngth600Counter = -1;
     public boolean isNonNumericLngth600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNonNumericLngth600Counter != sharedCounter;
         localNonNumericLngth600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkNonNumericLngth600Constraints(char[] value) {
   			return super.checkConstraints(value , 32 ,false, false);
   }
         int localTooManyTagsNdx600Counter = -1;
         public boolean isTooManyTagsNdx600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTooManyTagsNdx600Counter != sharedCounter;
            localTooManyTagsNdx600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTooManyTagsNdx600MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTooManyTagsCode600Counter = -1;
         public boolean isTooManyTagsCode600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTooManyTagsCode600Counter != sharedCounter;
            localTooManyTagsCode600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTooManyTagsCode600MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localUndefinedPdsNdx600Counter = -1;
         public boolean isUndefinedPdsNdx600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUndefinedPdsNdx600Counter != sharedCounter;
            localUndefinedPdsNdx600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkUndefinedPdsNdx600MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localUndefinedPdsCode600Counter = -1;
         public boolean isUndefinedPdsCode600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUndefinedPdsCode600Counter != sharedCounter;
            localUndefinedPdsCode600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkUndefinedPdsCode600MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localNoBackslashNdx600Counter = -1;
         public boolean isNoBackslashNdx600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNoBackslashNdx600Counter != sharedCounter;
            localNoBackslashNdx600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkNoBackslashNdx600MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localNoBackslashCode600Counter = -1;
         public boolean isNoBackslashCode600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNoBackslashCode600Counter != sharedCounter;
            localNoBackslashCode600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkNoBackslashCode600MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localNoBackslash600Counter = -1;
     public boolean isNoBackslash600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNoBackslash600Counter != sharedCounter;
         localNoBackslash600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkNoBackslash600Constraints(char[] value) {
   			return super.checkConstraints(value , 31 ,false, false);
   }
         int localCarrierTooShortNdx600Counter = -1;
         public boolean isCarrierTooShortNdx600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCarrierTooShortNdx600Counter != sharedCounter;
            localCarrierTooShortNdx600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCarrierTooShortNdx600MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localCarrierTooShort600Counter = -1;
     public boolean isCarrierTooShort600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCarrierTooShort600Counter != sharedCounter;
         localCarrierTooShort600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCarrierTooShort600Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
         int localNonNumericPdsNdx600Counter = -1;
         public boolean isNonNumericPdsNdx600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNonNumericPdsNdx600Counter != sharedCounter;
            localNonNumericPdsNdx600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkNonNumericPdsNdx600MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localNonNumericPdsCode600Counter = -1;
         public boolean isNonNumericPdsCode600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNonNumericPdsCode600Counter != sharedCounter;
            localNonNumericPdsCode600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkNonNumericPdsCode600MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localNonNumericPdsId600Counter = -1;
     public boolean isNonNumericPdsId600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNonNumericPdsId600Counter != sharedCounter;
         localNonNumericPdsId600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkNonNumericPdsId600Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
         int localDuplicatePdsNdx600Counter = -1;
         public boolean isDuplicatePdsNdx600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDuplicatePdsNdx600Counter != sharedCounter;
            localDuplicatePdsNdx600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkDuplicatePdsNdx600MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localDuplicatePdsCode600Counter = -1;
         public boolean isDuplicatePdsCode600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDuplicatePdsCode600Counter != sharedCounter;
            localDuplicatePdsCode600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkDuplicatePdsCode600MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localDuplicatePds600Counter = -1;
     public boolean isDuplicatePds600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDuplicatePds600Counter != sharedCounter;
         localDuplicatePds600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDuplicatePds600Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
         int localInvalidTagTypeNdx600Counter = -1;
         public boolean isInvalidTagTypeNdx600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localInvalidTagTypeNdx600Counter != sharedCounter;
            localInvalidTagTypeNdx600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkInvalidTagTypeNdx600MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localInvalidTagTypeCode600Counter = -1;
         public boolean isInvalidTagTypeCode600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localInvalidTagTypeCode600Counter != sharedCounter;
            localInvalidTagTypeCode600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkInvalidTagTypeCode600MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localInvalidTagType600Counter = -1;
     public boolean isInvalidTagType600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInvalidTagType600Counter != sharedCounter;
         localInvalidTagType600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkInvalidTagType600Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
         int localBadRecLngthNdx600Counter = -1;
         public boolean isBadRecLngthNdx600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBadRecLngthNdx600Counter != sharedCounter;
            localBadRecLngthNdx600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkBadRecLngthNdx600MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localBadRecLngthCode600Counter = -1;
         public boolean isBadRecLngthCode600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBadRecLngthCode600Counter != sharedCounter;
            localBadRecLngthCode600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkBadRecLngthCode600MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localIpmErrorPointerLine600Counter = -1;
     public boolean isIpmErrorPointerLine600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIpmErrorPointerLine600Counter != sharedCounter;
         localIpmErrorPointerLine600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIpmErrorPointerLine600Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
         int localIpmErrorPointerWidth600Counter = -1;
         public boolean isIpmErrorPointerWidth600Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIpmErrorPointerWidth600Counter != sharedCounter;
            localIpmErrorPointerWidth600Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkIpmErrorPointerWidth600MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localDisplayNumber600Counter = -1;
     public boolean isDisplayNumber600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDisplayNumber600Counter != sharedCounter;
         localDisplayNumber600Counter = sharedCounter; return hasModified;
     }
	protected static final int DISPLAY_NUMBER_600_LEN = 5;
	/**
	 * 	serialize this DisplayNumber600
	 */
   protected void serializeDisplayNumber600(char[] displayNumber600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(displayNumber600,0,getStringValue(),beginDisplayNumber600,DISPLAY_NUMBER_600_LEN);
       localDisplayNumber600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDisplayNumber600Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshDisplayNumber600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDisplayNumber600() {	 
   		return (substring(getStringValue(),beginDisplayNumber600,beginDisplayNumber600 + DISPLAY_NUMBER_600_LEN));
   	}
     int localTagType600Counter = -1;
     public boolean isTagType600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagType600Counter != sharedCounter;
         localTagType600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTagType600Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localTagNo600Counter = -1;
     public boolean isTagNo600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagNo600Counter != sharedCounter;
         localTagNo600Counter = sharedCounter; return hasModified;
     }
	protected static final int TAG_NO_600_LEN = 4;
	/**
	 * 	serialize this TagNo600
	 */
   protected void serializeTagNo600(char[] tagNo600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tagNo600,0,getStringValue(),beginTagNo600,TAG_NO_600_LEN);
       localTagNo600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTagNo600Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshTagNo600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTagNo600() {	 
   		return (substring(getStringValue(),beginTagNo600,beginTagNo600 + TAG_NO_600_LEN));
   	}
     int localTagSubfldNo600Counter = -1;
     public boolean isTagSubfldNo600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagSubfldNo600Counter != sharedCounter;
         localTagSubfldNo600Counter = sharedCounter; return hasModified;
     }
	protected static final int TAG_SUBFLD_NO_600_LEN = 4;
	/**
	 * 	serialize this TagSubfldNo600
	 */
   protected void serializeTagSubfldNo600(char[] tagSubfldNo600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tagSubfldNo600,0,getStringValue(),beginTagSubfldNo600,TAG_SUBFLD_NO_600_LEN);
       localTagSubfldNo600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTagSubfldNo600Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshTagSubfldNo600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTagSubfldNo600() {	 
   		return (substring(getStringValue(),beginTagSubfldNo600,beginTagSubfldNo600 + TAG_SUBFLD_NO_600_LEN));
   	}
     int localTagStarts600Counter = -1;
     public boolean isTagStarts600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagStarts600Counter != sharedCounter;
         localTagStarts600Counter = sharedCounter; return hasModified;
     }
	protected static final int TAG_STARTS_600_LEN = 4;
	/**
	 * 	serialize this TagStarts600
	 */
   protected void serializeTagStarts600(char[] tagStarts600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tagStarts600,0,getStringValue(),beginTagStarts600,TAG_STARTS_600_LEN);
       localTagStarts600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTagStarts600Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshTagStarts600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTagStarts600() {	 
   		return (substring(getStringValue(),beginTagStarts600,beginTagStarts600 + TAG_STARTS_600_LEN));
   	}
     int localTagLngth600Counter = -1;
     public boolean isTagLngth600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagLngth600Counter != sharedCounter;
         localTagLngth600Counter = sharedCounter; return hasModified;
     }
	protected static final int TAG_LNGTH_600_LEN = 4;
	/**
	 * 	serialize this TagLngth600
	 */
   protected void serializeTagLngth600(char[] tagLngth600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tagLngth600,0,getStringValue(),beginTagLngth600,TAG_LNGTH_600_LEN);
       localTagLngth600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTagLngth600Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshTagLngth600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTagLngth600() {	 
   		return (substring(getStringValue(),beginTagLngth600,beginTagLngth600 + TAG_LNGTH_600_LEN));
   	}
     int localTagStatus600Counter = -1;
     public boolean isTagStatus600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagStatus600Counter != sharedCounter;
         localTagStatus600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTagStatus600Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localTagContent600Counter = -1;
     public boolean isTagContent600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagContent600Counter != sharedCounter;
         localTagContent600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTagContent600Constraints(char[] value) {
   			return super.checkConstraints(value , 84 ,false, false);
   }
         int localI800Counter = -1;
         public boolean isI800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localI800Counter != sharedCounter;
            localI800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkI800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localTableLen800Counter = -1;
         public boolean isTableLen800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTableLen800Counter != sharedCounter;
            localTableLen800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTableLen800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localMaxTagNo800Counter = -1;
         public boolean isMaxTagNo800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMaxTagNo800Counter != sharedCounter;
            localMaxTagNo800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkMaxTagNo800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localMaxPdsNo800Counter = -1;
         public boolean isMaxPdsNo800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMaxPdsNo800Counter != sharedCounter;
            localMaxPdsNo800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkMaxPdsNo800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localStartOfNextElement800Counter = -1;
         public boolean isStartOfNextElement800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localStartOfNextElement800Counter != sharedCounter;
            localStartOfNextElement800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkStartOfNextElement800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localPtrIp739010800Counter = -1;
     public boolean isPtrIp739010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp739010800Counter != sharedCounter;
         localPtrIp739010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp739010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp741010800Counter = -1;
     public boolean isPtrIp741010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp741010800Counter != sharedCounter;
         localPtrIp741010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp741010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp661020800Counter = -1;
     public boolean isPtrIp661020800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp661020800Counter != sharedCounter;
         localPtrIp661020800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp661020800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
         int localAbendCode900Counter = -1;
         public boolean isAbendCode900Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAbendCode900Counter != sharedCounter;
            localAbendCode900Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkAbendCode900MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }




}
  
