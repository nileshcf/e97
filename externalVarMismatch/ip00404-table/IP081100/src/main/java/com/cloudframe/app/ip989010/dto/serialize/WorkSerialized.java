package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 107;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAbendCode3003002;
            protected  int beginAbendCode3003003;
            protected  int beginAbendCode3003004;
            protected  int beginAbendCode3003005;
            protected  int beginAbendCode3003006;
            protected  int beginAbendCode3003008;
            protected  int beginAbendCode3003009;
            protected  int beginAbendCode3003014;
            protected  int beginAbendCode3003015;
            protected  int beginAbendCode3003016;
            protected  int beginAbendCode3003017;
            protected  int beginDfltMaxLen300;
            protected  int beginSys001RecsRead400;
            protected  int beginSys003RecsRead400;
            protected  int beginSys004RecsRead400;
            protected  int beginSys101RecsWrit400;
            protected  int beginSys201RecsWrit400;
            protected  int beginSys202RecsWrit400;
            protected  int beginSys204RecsWrit400;
            protected  int beginSys205RecsWrit400;
            protected  int beginLoopCntr400;
            protected  int beginErrorCode600;
            protected  int beginFldNameLen800;
            protected  int beginFldLen800;
            protected  int beginOldFldLen800;
            protected  int beginPadLen800;
	
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
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginAbendCode3003002 = getStartOffset() + 0;	// set offset for serialization
  
             beginAbendCode3003003 = getStartOffset() + 4;	// set offset for serialization
  
             beginAbendCode3003004 = getStartOffset() + 8;	// set offset for serialization
  
             beginAbendCode3003005 = getStartOffset() + 12;	// set offset for serialization
  
             beginAbendCode3003006 = getStartOffset() + 16;	// set offset for serialization
  
             beginAbendCode3003008 = getStartOffset() + 20;	// set offset for serialization
  
             beginAbendCode3003009 = getStartOffset() + 24;	// set offset for serialization
  
             beginAbendCode3003014 = getStartOffset() + 28;	// set offset for serialization
  
             beginAbendCode3003015 = getStartOffset() + 32;	// set offset for serialization
  
             beginAbendCode3003016 = getStartOffset() + 36;	// set offset for serialization
  
             beginAbendCode3003017 = getStartOffset() + 40;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginDfltMaxLen300 = getStartOffset() + 44;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginSys001RecsRead400 = getStartOffset() + 46;	// set offset for serialization
  
             beginSys003RecsRead400 = getStartOffset() + 51;	// set offset for serialization
  
             beginSys004RecsRead400 = getStartOffset() + 56;	// set offset for serialization
  
             beginSys101RecsWrit400 = getStartOffset() + 61;	// set offset for serialization
  
             beginSys201RecsWrit400 = getStartOffset() + 66;	// set offset for serialization
  
             beginSys202RecsWrit400 = getStartOffset() + 71;	// set offset for serialization
  
             beginSys204RecsWrit400 = getStartOffset() + 76;	// set offset for serialization
  
             beginSys205RecsWrit400 = getStartOffset() + 81;	// set offset for serialization
  
             beginLoopCntr400 = getStartOffset() + 86;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginErrorCode600 = getStartOffset() + 91;	// set offset for serialization
  
  
  
             beginFldNameLen800 = getStartOffset() + 95;	// set offset for serialization
  
  
  
             beginFldLen800 = getStartOffset() + 98;	// set offset for serialization
  
             beginOldFldLen800 = getStartOffset() + 101;	// set offset for serialization
  
             beginPadLen800 = getStartOffset() + 104;	// set offset for serialization
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localFirstTimeSw100Counter = -1;
     public boolean isFirstTimeSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFirstTimeSw100Counter != sharedCounter;
         localFirstTimeSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFirstTimeSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys001FirstRecSw100Counter = -1;
     public boolean isSys001FirstRecSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001FirstRecSw100Counter != sharedCounter;
         localSys001FirstRecSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys001FirstRecSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys002FirstRecSw100Counter = -1;
     public boolean isSys002FirstRecSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys002FirstRecSw100Counter != sharedCounter;
         localSys002FirstRecSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys002FirstRecSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys003FirstRecSw100Counter = -1;
     public boolean isSys003FirstRecSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys003FirstRecSw100Counter != sharedCounter;
         localSys003FirstRecSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys003FirstRecSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys004FirstRecSw100Counter = -1;
     public boolean isSys004FirstRecSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys004FirstRecSw100Counter != sharedCounter;
         localSys004FirstRecSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys004FirstRecSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localEofSys001Sw100Counter = -1;
     public boolean isEofSys001Sw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEofSys001Sw100Counter != sharedCounter;
         localEofSys001Sw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkEofSys001Sw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localEofSys003Sw100Counter = -1;
     public boolean isEofSys003Sw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEofSys003Sw100Counter != sharedCounter;
         localEofSys003Sw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkEofSys003Sw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localEofSys004Sw100Counter = -1;
     public boolean isEofSys004Sw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEofSys004Sw100Counter != sharedCounter;
         localEofSys004Sw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkEofSys004Sw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys001StatusSw100Counter = -1;
     public boolean isSys001StatusSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001StatusSw100Counter != sharedCounter;
         localSys001StatusSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys001StatusSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys002StatusSw100Counter = -1;
     public boolean isSys002StatusSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys002StatusSw100Counter != sharedCounter;
         localSys002StatusSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys002StatusSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys003StatusSw100Counter = -1;
     public boolean isSys003StatusSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys003StatusSw100Counter != sharedCounter;
         localSys003StatusSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys003StatusSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys004StatusSw100Counter = -1;
     public boolean isSys004StatusSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys004StatusSw100Counter != sharedCounter;
         localSys004StatusSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys004StatusSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys005StatusSw100Counter = -1;
     public boolean isSys005StatusSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys005StatusSw100Counter != sharedCounter;
         localSys005StatusSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys005StatusSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys101StatusSw100Counter = -1;
     public boolean isSys101StatusSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys101StatusSw100Counter != sharedCounter;
         localSys101StatusSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys101StatusSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys201StatusSw100Counter = -1;
     public boolean isSys201StatusSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201StatusSw100Counter != sharedCounter;
         localSys201StatusSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys201StatusSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys202StatusSw100Counter = -1;
     public boolean isSys202StatusSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys202StatusSw100Counter != sharedCounter;
         localSys202StatusSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys202StatusSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys204StatusSw100Counter = -1;
     public boolean isSys204StatusSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys204StatusSw100Counter != sharedCounter;
         localSys204StatusSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys204StatusSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys205StatusSw100Counter = -1;
     public boolean isSys205StatusSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys205StatusSw100Counter != sharedCounter;
         localSys205StatusSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys205StatusSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsItOddOrEvenByte100Counter = -1;
     public boolean isIsItOddOrEvenByte100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsItOddOrEvenByte100Counter != sharedCounter;
         localIsItOddOrEvenByte100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsItOddOrEvenByte100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localAllRecordsPrcd100Counter = -1;
     public boolean isAllRecordsPrcd100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAllRecordsPrcd100Counter != sharedCounter;
         localAllRecordsPrcd100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAllRecordsPrcd100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIrdSelected100Counter = -1;
     public boolean isIrdSelected100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIrdSelected100Counter != sharedCounter;
         localIrdSelected100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIrdSelected100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localC300Counter = -1;
     public boolean isC300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC300Counter != sharedCounter;
         localC300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkC300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localD300Counter = -1;
     public boolean isD300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD300Counter != sharedCounter;
         localD300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkD300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localM300Counter = -1;
     public boolean isM300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localM300Counter != sharedCounter;
         localM300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkM300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localP300Counter = -1;
     public boolean isP300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localP300Counter != sharedCounter;
         localP300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkP300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localPgmIp989010300Counter = -1;
     public boolean isPgmIp989010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp989010300Counter != sharedCounter;
         localPgmIp989010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp989010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp169410300Counter = -1;
     public boolean isPgmIp169410300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp169410300Counter != sharedCounter;
         localPgmIp169410300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp169410300Constraints(char[] value) {
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
     int localPgmIp610010300Counter = -1;
     public boolean isPgmIp610010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp610010300Counter != sharedCounter;
         localPgmIp610010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp610010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp666010300Counter = -1;
     public boolean isPgmIp666010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp666010300Counter != sharedCounter;
         localPgmIp666010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp666010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp666030300Counter = -1;
     public boolean isPgmIp666030300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp666030300Counter != sharedCounter;
         localPgmIp666030300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp666030300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp670010300Counter = -1;
     public boolean isPgmIp670010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp670010300Counter != sharedCounter;
         localPgmIp670010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp670010300Constraints(char[] value) {
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
     int localPgmVersion300Counter = -1;
     public boolean isPgmVersion300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmVersion300Counter != sharedCounter;
         localPgmVersion300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmVersion300Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
     int localMsgEndTag300Counter = -1;
     public boolean isMsgEndTag300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgEndTag300Counter != sharedCounter;
         localMsgEndTag300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMsgEndTag300Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localPdsEndTag300Counter = -1;
     public boolean isPdsEndTag300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPdsEndTag300Counter != sharedCounter;
         localPdsEndTag300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPdsEndTag300Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localDeEndTag300Counter = -1;
     public boolean isDeEndTag300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDeEndTag300Counter != sharedCounter;
         localDeEndTag300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDeEndTag300Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
     int localSubfldTagStr300Counter = -1;
     public boolean isSubfldTagStr300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSubfldTagStr300Counter != sharedCounter;
         localSubfldTagStr300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSubfldTagStr300Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localSubfldTagEnd300Counter = -1;
     public boolean isSubfldTagEnd300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSubfldTagEnd300Counter != sharedCounter;
         localSubfldTagEnd300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSubfldTagEnd300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localAbendCode3003002Counter = -1;
     public boolean isAbendCode3003002Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode3003002Counter != sharedCounter;
         localAbendCode3003002Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of abendCode3003002
	 *	@return abendCode3003002
	 */
	public char[]  getAbendCode3003002String() {
	     return getCharArray(beginAbendCode3003002,ABEND_CODE_3003002_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode3003002IsNumeric() {
	    return isNumeric(beginAbendCode3003002
	                    ,beginAbendCode3003002 + ABEND_CODE_3003002_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ABEND_CODE_3003002_LEN = 4;
  	/**
	 * serializeAbendCode3003002
	 */
	protected void serializeAbendCode3003002(int abendCode3003002) {
		 putNumber(beginAbendCode3003002,abendCode3003002,ABEND_CODE_3003002_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAbendCode3003002Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAbendCode3003002
	 */
   	protected  int serializeAbendCode3003002(char[] value) {
	    int  abendCode3003002;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    abendCode3003002 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAbendCode3003002
		       ,4
		      );
		 localAbendCode3003002Counter = shareString.getSerializedField().getModifiedCounter();
		return  abendCode3003002;
    }

   protected int checkAbendCode3003002MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAbendCode3003002 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAbendCode3003002() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAbendCode3003002
			                 ,ABEND_CODE_3003002_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("abendCode3003002", beginAbendCode3003002,ABEND_CODE_3003002_LEN);
    }
   	}
     int localAbendCode3003003Counter = -1;
     public boolean isAbendCode3003003Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode3003003Counter != sharedCounter;
         localAbendCode3003003Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of abendCode3003003
	 *	@return abendCode3003003
	 */
	public char[]  getAbendCode3003003String() {
	     return getCharArray(beginAbendCode3003003,ABEND_CODE_3003003_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode3003003IsNumeric() {
	    return isNumeric(beginAbendCode3003003
	                    ,beginAbendCode3003003 + ABEND_CODE_3003003_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ABEND_CODE_3003003_LEN = 4;
  	/**
	 * serializeAbendCode3003003
	 */
	protected void serializeAbendCode3003003(int abendCode3003003) {
		 putNumber(beginAbendCode3003003,abendCode3003003,ABEND_CODE_3003003_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAbendCode3003003Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAbendCode3003003
	 */
   	protected  int serializeAbendCode3003003(char[] value) {
	    int  abendCode3003003;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    abendCode3003003 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAbendCode3003003
		       ,4
		      );
		 localAbendCode3003003Counter = shareString.getSerializedField().getModifiedCounter();
		return  abendCode3003003;
    }

   protected int checkAbendCode3003003MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAbendCode3003003 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAbendCode3003003() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAbendCode3003003
			                 ,ABEND_CODE_3003003_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("abendCode3003003", beginAbendCode3003003,ABEND_CODE_3003003_LEN);
    }
   	}
     int localAbendCode3003004Counter = -1;
     public boolean isAbendCode3003004Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode3003004Counter != sharedCounter;
         localAbendCode3003004Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of abendCode3003004
	 *	@return abendCode3003004
	 */
	public char[]  getAbendCode3003004String() {
	     return getCharArray(beginAbendCode3003004,ABEND_CODE_3003004_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode3003004IsNumeric() {
	    return isNumeric(beginAbendCode3003004
	                    ,beginAbendCode3003004 + ABEND_CODE_3003004_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ABEND_CODE_3003004_LEN = 4;
  	/**
	 * serializeAbendCode3003004
	 */
	protected void serializeAbendCode3003004(int abendCode3003004) {
		 putNumber(beginAbendCode3003004,abendCode3003004,ABEND_CODE_3003004_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAbendCode3003004Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAbendCode3003004
	 */
   	protected  int serializeAbendCode3003004(char[] value) {
	    int  abendCode3003004;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    abendCode3003004 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAbendCode3003004
		       ,4
		      );
		 localAbendCode3003004Counter = shareString.getSerializedField().getModifiedCounter();
		return  abendCode3003004;
    }

   protected int checkAbendCode3003004MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAbendCode3003004 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAbendCode3003004() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAbendCode3003004
			                 ,ABEND_CODE_3003004_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("abendCode3003004", beginAbendCode3003004,ABEND_CODE_3003004_LEN);
    }
   	}
     int localAbendCode3003005Counter = -1;
     public boolean isAbendCode3003005Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode3003005Counter != sharedCounter;
         localAbendCode3003005Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of abendCode3003005
	 *	@return abendCode3003005
	 */
	public char[]  getAbendCode3003005String() {
	     return getCharArray(beginAbendCode3003005,ABEND_CODE_3003005_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode3003005IsNumeric() {
	    return isNumeric(beginAbendCode3003005
	                    ,beginAbendCode3003005 + ABEND_CODE_3003005_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ABEND_CODE_3003005_LEN = 4;
  	/**
	 * serializeAbendCode3003005
	 */
	protected void serializeAbendCode3003005(int abendCode3003005) {
		 putNumber(beginAbendCode3003005,abendCode3003005,ABEND_CODE_3003005_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAbendCode3003005Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAbendCode3003005
	 */
   	protected  int serializeAbendCode3003005(char[] value) {
	    int  abendCode3003005;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    abendCode3003005 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAbendCode3003005
		       ,4
		      );
		 localAbendCode3003005Counter = shareString.getSerializedField().getModifiedCounter();
		return  abendCode3003005;
    }

   protected int checkAbendCode3003005MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAbendCode3003005 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAbendCode3003005() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAbendCode3003005
			                 ,ABEND_CODE_3003005_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("abendCode3003005", beginAbendCode3003005,ABEND_CODE_3003005_LEN);
    }
   	}
     int localAbendCode3003006Counter = -1;
     public boolean isAbendCode3003006Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode3003006Counter != sharedCounter;
         localAbendCode3003006Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of abendCode3003006
	 *	@return abendCode3003006
	 */
	public char[]  getAbendCode3003006String() {
	     return getCharArray(beginAbendCode3003006,ABEND_CODE_3003006_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode3003006IsNumeric() {
	    return isNumeric(beginAbendCode3003006
	                    ,beginAbendCode3003006 + ABEND_CODE_3003006_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ABEND_CODE_3003006_LEN = 4;
  	/**
	 * serializeAbendCode3003006
	 */
	protected void serializeAbendCode3003006(int abendCode3003006) {
		 putNumber(beginAbendCode3003006,abendCode3003006,ABEND_CODE_3003006_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAbendCode3003006Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAbendCode3003006
	 */
   	protected  int serializeAbendCode3003006(char[] value) {
	    int  abendCode3003006;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    abendCode3003006 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAbendCode3003006
		       ,4
		      );
		 localAbendCode3003006Counter = shareString.getSerializedField().getModifiedCounter();
		return  abendCode3003006;
    }

   protected int checkAbendCode3003006MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAbendCode3003006 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAbendCode3003006() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAbendCode3003006
			                 ,ABEND_CODE_3003006_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("abendCode3003006", beginAbendCode3003006,ABEND_CODE_3003006_LEN);
    }
   	}
     int localAbendCode3003008Counter = -1;
     public boolean isAbendCode3003008Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode3003008Counter != sharedCounter;
         localAbendCode3003008Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of abendCode3003008
	 *	@return abendCode3003008
	 */
	public char[]  getAbendCode3003008String() {
	     return getCharArray(beginAbendCode3003008,ABEND_CODE_3003008_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode3003008IsNumeric() {
	    return isNumeric(beginAbendCode3003008
	                    ,beginAbendCode3003008 + ABEND_CODE_3003008_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ABEND_CODE_3003008_LEN = 4;
  	/**
	 * serializeAbendCode3003008
	 */
	protected void serializeAbendCode3003008(int abendCode3003008) {
		 putNumber(beginAbendCode3003008,abendCode3003008,ABEND_CODE_3003008_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAbendCode3003008Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAbendCode3003008
	 */
   	protected  int serializeAbendCode3003008(char[] value) {
	    int  abendCode3003008;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    abendCode3003008 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAbendCode3003008
		       ,4
		      );
		 localAbendCode3003008Counter = shareString.getSerializedField().getModifiedCounter();
		return  abendCode3003008;
    }

   protected int checkAbendCode3003008MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAbendCode3003008 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAbendCode3003008() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAbendCode3003008
			                 ,ABEND_CODE_3003008_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("abendCode3003008", beginAbendCode3003008,ABEND_CODE_3003008_LEN);
    }
   	}
     int localAbendCode3003009Counter = -1;
     public boolean isAbendCode3003009Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode3003009Counter != sharedCounter;
         localAbendCode3003009Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of abendCode3003009
	 *	@return abendCode3003009
	 */
	public char[]  getAbendCode3003009String() {
	     return getCharArray(beginAbendCode3003009,ABEND_CODE_3003009_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode3003009IsNumeric() {
	    return isNumeric(beginAbendCode3003009
	                    ,beginAbendCode3003009 + ABEND_CODE_3003009_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ABEND_CODE_3003009_LEN = 4;
  	/**
	 * serializeAbendCode3003009
	 */
	protected void serializeAbendCode3003009(int abendCode3003009) {
		 putNumber(beginAbendCode3003009,abendCode3003009,ABEND_CODE_3003009_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAbendCode3003009Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAbendCode3003009
	 */
   	protected  int serializeAbendCode3003009(char[] value) {
	    int  abendCode3003009;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    abendCode3003009 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAbendCode3003009
		       ,4
		      );
		 localAbendCode3003009Counter = shareString.getSerializedField().getModifiedCounter();
		return  abendCode3003009;
    }

   protected int checkAbendCode3003009MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAbendCode3003009 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAbendCode3003009() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAbendCode3003009
			                 ,ABEND_CODE_3003009_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("abendCode3003009", beginAbendCode3003009,ABEND_CODE_3003009_LEN);
    }
   	}
     int localAbendCode3003014Counter = -1;
     public boolean isAbendCode3003014Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode3003014Counter != sharedCounter;
         localAbendCode3003014Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of abendCode3003014
	 *	@return abendCode3003014
	 */
	public char[]  getAbendCode3003014String() {
	     return getCharArray(beginAbendCode3003014,ABEND_CODE_3003014_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode3003014IsNumeric() {
	    return isNumeric(beginAbendCode3003014
	                    ,beginAbendCode3003014 + ABEND_CODE_3003014_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ABEND_CODE_3003014_LEN = 4;
  	/**
	 * serializeAbendCode3003014
	 */
	protected void serializeAbendCode3003014(int abendCode3003014) {
		 putNumber(beginAbendCode3003014,abendCode3003014,ABEND_CODE_3003014_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAbendCode3003014Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAbendCode3003014
	 */
   	protected  int serializeAbendCode3003014(char[] value) {
	    int  abendCode3003014;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    abendCode3003014 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAbendCode3003014
		       ,4
		      );
		 localAbendCode3003014Counter = shareString.getSerializedField().getModifiedCounter();
		return  abendCode3003014;
    }

   protected int checkAbendCode3003014MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAbendCode3003014 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAbendCode3003014() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAbendCode3003014
			                 ,ABEND_CODE_3003014_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("abendCode3003014", beginAbendCode3003014,ABEND_CODE_3003014_LEN);
    }
   	}
     int localAbendCode3003015Counter = -1;
     public boolean isAbendCode3003015Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode3003015Counter != sharedCounter;
         localAbendCode3003015Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of abendCode3003015
	 *	@return abendCode3003015
	 */
	public char[]  getAbendCode3003015String() {
	     return getCharArray(beginAbendCode3003015,ABEND_CODE_3003015_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode3003015IsNumeric() {
	    return isNumeric(beginAbendCode3003015
	                    ,beginAbendCode3003015 + ABEND_CODE_3003015_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ABEND_CODE_3003015_LEN = 4;
  	/**
	 * serializeAbendCode3003015
	 */
	protected void serializeAbendCode3003015(int abendCode3003015) {
		 putNumber(beginAbendCode3003015,abendCode3003015,ABEND_CODE_3003015_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAbendCode3003015Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAbendCode3003015
	 */
   	protected  int serializeAbendCode3003015(char[] value) {
	    int  abendCode3003015;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    abendCode3003015 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAbendCode3003015
		       ,4
		      );
		 localAbendCode3003015Counter = shareString.getSerializedField().getModifiedCounter();
		return  abendCode3003015;
    }

   protected int checkAbendCode3003015MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAbendCode3003015 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAbendCode3003015() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAbendCode3003015
			                 ,ABEND_CODE_3003015_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("abendCode3003015", beginAbendCode3003015,ABEND_CODE_3003015_LEN);
    }
   	}
     int localAbendCode3003016Counter = -1;
     public boolean isAbendCode3003016Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode3003016Counter != sharedCounter;
         localAbendCode3003016Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of abendCode3003016
	 *	@return abendCode3003016
	 */
	public char[]  getAbendCode3003016String() {
	     return getCharArray(beginAbendCode3003016,ABEND_CODE_3003016_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode3003016IsNumeric() {
	    return isNumeric(beginAbendCode3003016
	                    ,beginAbendCode3003016 + ABEND_CODE_3003016_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ABEND_CODE_3003016_LEN = 4;
  	/**
	 * serializeAbendCode3003016
	 */
	protected void serializeAbendCode3003016(int abendCode3003016) {
		 putNumber(beginAbendCode3003016,abendCode3003016,ABEND_CODE_3003016_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAbendCode3003016Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAbendCode3003016
	 */
   	protected  int serializeAbendCode3003016(char[] value) {
	    int  abendCode3003016;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    abendCode3003016 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAbendCode3003016
		       ,4
		      );
		 localAbendCode3003016Counter = shareString.getSerializedField().getModifiedCounter();
		return  abendCode3003016;
    }

   protected int checkAbendCode3003016MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAbendCode3003016 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAbendCode3003016() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAbendCode3003016
			                 ,ABEND_CODE_3003016_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("abendCode3003016", beginAbendCode3003016,ABEND_CODE_3003016_LEN);
    }
   	}
     int localAbendCode3003017Counter = -1;
     public boolean isAbendCode3003017Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode3003017Counter != sharedCounter;
         localAbendCode3003017Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of abendCode3003017
	 *	@return abendCode3003017
	 */
	public char[]  getAbendCode3003017String() {
	     return getCharArray(beginAbendCode3003017,ABEND_CODE_3003017_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode3003017IsNumeric() {
	    return isNumeric(beginAbendCode3003017
	                    ,beginAbendCode3003017 + ABEND_CODE_3003017_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ABEND_CODE_3003017_LEN = 4;
  	/**
	 * serializeAbendCode3003017
	 */
	protected void serializeAbendCode3003017(int abendCode3003017) {
		 putNumber(beginAbendCode3003017,abendCode3003017,ABEND_CODE_3003017_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAbendCode3003017Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAbendCode3003017
	 */
   	protected  int serializeAbendCode3003017(char[] value) {
	    int  abendCode3003017;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    abendCode3003017 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAbendCode3003017
		       ,4
		      );
		 localAbendCode3003017Counter = shareString.getSerializedField().getModifiedCounter();
		return  abendCode3003017;
    }

   protected int checkAbendCode3003017MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAbendCode3003017 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAbendCode3003017() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAbendCode3003017
			                 ,ABEND_CODE_3003017_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("abendCode3003017", beginAbendCode3003017,ABEND_CODE_3003017_LEN);
    }
   	}
     int localSys001300Counter = -1;
     public boolean isSys001300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001300Counter != sharedCounter;
         localSys001300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys001300Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localSys002300Counter = -1;
     public boolean isSys002300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys002300Counter != sharedCounter;
         localSys002300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys002300Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localSys003300Counter = -1;
     public boolean isSys003300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys003300Counter != sharedCounter;
         localSys003300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys003300Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localSys004300Counter = -1;
     public boolean isSys004300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys004300Counter != sharedCounter;
         localSys004300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys004300Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localSys005300Counter = -1;
     public boolean isSys005300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys005300Counter != sharedCounter;
         localSys005300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys005300Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localSys101300Counter = -1;
     public boolean isSys101300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys101300Counter != sharedCounter;
         localSys101300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys101300Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localSys201300Counter = -1;
     public boolean isSys201300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201300Counter != sharedCounter;
         localSys201300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys201300Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localSys202300Counter = -1;
     public boolean isSys202300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys202300Counter != sharedCounter;
         localSys202300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys202300Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localSys204300Counter = -1;
     public boolean isSys204300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys204300Counter != sharedCounter;
         localSys204300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys204300Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localSys205300Counter = -1;
     public boolean isSys205300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys205300Counter != sharedCounter;
         localSys205300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys205300Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localPds0023300Counter = -1;
     public boolean isPds0023300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPds0023300Counter != sharedCounter;
         localPds0023300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPds0023300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localPds0148300Counter = -1;
     public boolean isPds0148300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPds0148300Counter != sharedCounter;
         localPds0148300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPds0148300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localPds0122300Counter = -1;
     public boolean isPds0122300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPds0122300Counter != sharedCounter;
         localPds0122300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPds0122300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localDe3s1300Counter = -1;
     public boolean isDe3s1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe3s1300Counter != sharedCounter;
         localDe3s1300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDe3s1300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localDe22300Counter = -1;
     public boolean isDe22300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe22300Counter != sharedCounter;
         localDe22300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDe22300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localDe26300Counter = -1;
     public boolean isDe26300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe26300Counter != sharedCounter;
         localDe26300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDe26300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localDe42300Counter = -1;
     public boolean isDe42300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe42300Counter != sharedCounter;
         localDe42300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDe42300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localDe43s2300Counter = -1;
     public boolean isDe43s2300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe43s2300Counter != sharedCounter;
         localDe43s2300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDe43s2300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localDe43s3300Counter = -1;
     public boolean isDe43s3300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe43s3300Counter != sharedCounter;
         localDe43s3300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDe43s3300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localDe43s4300Counter = -1;
     public boolean isDe43s4300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe43s4300Counter != sharedCounter;
         localDe43s4300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDe43s4300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localDe43s5300Counter = -1;
     public boolean isDe43s5300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe43s5300Counter != sharedCounter;
         localDe43s5300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDe43s5300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localDe43s6300Counter = -1;
     public boolean isDe43s6300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe43s6300Counter != sharedCounter;
         localDe43s6300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDe43s6300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localDe49300Counter = -1;
     public boolean isDe49300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe49300Counter != sharedCounter;
         localDe49300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDe49300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localDate300Counter = -1;
     public boolean isDate300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDate300Counter != sharedCounter;
         localDate300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDate300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localType1300Counter = -1;
     public boolean isType1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localType1300Counter != sharedCounter;
         localType1300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkType1300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localIca1300Counter = -1;
     public boolean isIca1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIca1300Counter != sharedCounter;
         localIca1300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIca1300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localBin1300Counter = -1;
     public boolean isBin1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBin1300Counter != sharedCounter;
         localBin1300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBin1300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localMaid1300Counter = -1;
     public boolean isMaid1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaid1300Counter != sharedCounter;
         localMaid1300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMaid1300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localEndpoint1300Counter = -1;
     public boolean isEndpoint1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndpoint1300Counter != sharedCounter;
         localEndpoint1300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkEndpoint1300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localType2300Counter = -1;
     public boolean isType2300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localType2300Counter != sharedCounter;
         localType2300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkType2300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localIca2300Counter = -1;
     public boolean isIca2300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIca2300Counter != sharedCounter;
         localIca2300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIca2300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localBin2300Counter = -1;
     public boolean isBin2300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBin2300Counter != sharedCounter;
         localBin2300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBin2300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localMaid2300Counter = -1;
     public boolean isMaid2300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaid2300Counter != sharedCounter;
         localMaid2300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMaid2300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localEndpoint2300Counter = -1;
     public boolean isEndpoint2300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndpoint2300Counter != sharedCounter;
         localEndpoint2300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkEndpoint2300Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localValue75300Counter = -1;
     public boolean isValue75300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue75300Counter != sharedCounter;
         localValue75300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValue75300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localValue01300Counter = -1;
     public boolean isValue01300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue01300Counter != sharedCounter;
         localValue01300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValue01300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localValueWa300Counter = -1;
     public boolean isValueWa300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueWa300Counter != sharedCounter;
         localValueWa300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueWa300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localValue65300Counter = -1;
     public boolean isValue65300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue65300Counter != sharedCounter;
         localValue65300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValue65300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localDfltMaxLen300Counter = -1;
     public boolean isDfltMaxLen300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDfltMaxLen300Counter != sharedCounter;
         localDfltMaxLen300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dfltMaxLen300
	 *	@return dfltMaxLen300
	 */
	public char[]  getDfltMaxLen300String() {
	     return getCharArray(beginDfltMaxLen300,DFLT_MAX_LEN_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dfltMaxLen300IsNumeric() {
	    return isNumeric(beginDfltMaxLen300
	                    ,beginDfltMaxLen300 + DFLT_MAX_LEN_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DFLT_MAX_LEN_300_LEN = 2;
  	/**
	 * serializeDfltMaxLen300
	 */
	protected void serializeDfltMaxLen300(int dfltMaxLen300) {
		 putNumber(beginDfltMaxLen300,dfltMaxLen300,DFLT_MAX_LEN_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDfltMaxLen300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDfltMaxLen300
	 */
   	protected  int serializeDfltMaxLen300(char[] value) {
	    int  dfltMaxLen300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dfltMaxLen300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginDfltMaxLen300
		       ,2
		      );
		 localDfltMaxLen300Counter = shareString.getSerializedField().getModifiedCounter();
		return  dfltMaxLen300;
    }

   protected int checkDfltMaxLen300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDfltMaxLen300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDfltMaxLen300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDfltMaxLen300
			                 ,DFLT_MAX_LEN_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dfltMaxLen300", beginDfltMaxLen300,DFLT_MAX_LEN_300_LEN);
    }
   	}
     int localPara1150300Counter = -1;
     public boolean isPara1150300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara1150300Counter != sharedCounter;
         localPara1150300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara1150300Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localPara1200300Counter = -1;
     public boolean isPara1200300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara1200300Counter != sharedCounter;
         localPara1200300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara1200300Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localPara1510300Counter = -1;
     public boolean isPara1510300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara1510300Counter != sharedCounter;
         localPara1510300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara1510300Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localPara1610300Counter = -1;
     public boolean isPara1610300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara1610300Counter != sharedCounter;
         localPara1610300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara1610300Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localPara2100300Counter = -1;
     public boolean isPara2100300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2100300Counter != sharedCounter;
         localPara2100300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2100300Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localPara2200300Counter = -1;
     public boolean isPara2200300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2200300Counter != sharedCounter;
         localPara2200300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2200300Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localPara2310300Counter = -1;
     public boolean isPara2310300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2310300Counter != sharedCounter;
         localPara2310300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2310300Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localPara2512300Counter = -1;
     public boolean isPara2512300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2512300Counter != sharedCounter;
         localPara2512300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2512300Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localPara3110300Counter = -1;
     public boolean isPara3110300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara3110300Counter != sharedCounter;
         localPara3110300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara3110300Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localPara3120300Counter = -1;
     public boolean isPara3120300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara3120300Counter != sharedCounter;
         localPara3120300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara3120300Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localPara8600300Counter = -1;
     public boolean isPara8600300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8600300Counter != sharedCounter;
         localPara8600300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8600300Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localPara80001240200300Counter = -1;
     public boolean isPara80001240200300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara80001240200300Counter != sharedCounter;
         localPara80001240200300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara80001240200300Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localPara80001644695300Counter = -1;
     public boolean isPara80001644695300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara80001644695300Counter != sharedCounter;
         localPara80001644695300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara80001644695300Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localPara80001644697300Counter = -1;
     public boolean isPara80001644697300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara80001644697300Counter != sharedCounter;
         localPara80001644697300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara80001644697300Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localPara8000Comn300Counter = -1;
     public boolean isPara8000Comn300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8000Comn300Counter != sharedCounter;
         localPara8000Comn300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8000Comn300Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localPara8800300Counter = -1;
     public boolean isPara8800300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8800300Counter != sharedCounter;
         localPara8800300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8800300Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localPara8000300Counter = -1;
     public boolean isPara8000300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8000300Counter != sharedCounter;
         localPara8000300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8000300Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
        int localSys001RecsRead400Counter = -1;
        public boolean isSys001RecsRead400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSys001RecsRead400Counter != sharedCounter;
           localSys001RecsRead400Counter = sharedCounter; return hasModified; 
        }
	    public boolean sys001RecsRead400IsNumeric() {
	      return decimalIsNumeric(beginSys001RecsRead400,SYS_001_RECS_READ_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SYS_001_RECS_READ_400_LEN = 5;
  	/**
	 * 	serializeSys001RecsRead400
	 */
	protected void serializeSys001RecsRead400(int sys001RecsRead400) {
		   putDecimal(beginSys001RecsRead400,sys001RecsRead400,SYS_001_RECS_READ_400_LEN,true);
   }
   

   protected int checkSys001RecsRead400MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSys001RecsRead400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSys001RecsRead400() throws CFException {	
   	try { 
		 return (getIntDecimal(beginSys001RecsRead400,SYS_001_RECS_READ_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("sys001RecsRead400", beginSys001RecsRead400,SYS_001_RECS_READ_400_LEN);
     }
   	}
        int localSys003RecsRead400Counter = -1;
        public boolean isSys003RecsRead400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSys003RecsRead400Counter != sharedCounter;
           localSys003RecsRead400Counter = sharedCounter; return hasModified; 
        }
	    public boolean sys003RecsRead400IsNumeric() {
	      return decimalIsNumeric(beginSys003RecsRead400,SYS_003_RECS_READ_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SYS_003_RECS_READ_400_LEN = 5;
  	/**
	 * 	serializeSys003RecsRead400
	 */
	protected void serializeSys003RecsRead400(int sys003RecsRead400) {
		   putDecimal(beginSys003RecsRead400,sys003RecsRead400,SYS_003_RECS_READ_400_LEN,true);
   }
   

   protected int checkSys003RecsRead400MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSys003RecsRead400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSys003RecsRead400() throws CFException {	
   	try { 
		 return (getIntDecimal(beginSys003RecsRead400,SYS_003_RECS_READ_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("sys003RecsRead400", beginSys003RecsRead400,SYS_003_RECS_READ_400_LEN);
     }
   	}
        int localSys004RecsRead400Counter = -1;
        public boolean isSys004RecsRead400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSys004RecsRead400Counter != sharedCounter;
           localSys004RecsRead400Counter = sharedCounter; return hasModified; 
        }
	    public boolean sys004RecsRead400IsNumeric() {
	      return decimalIsNumeric(beginSys004RecsRead400,SYS_004_RECS_READ_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SYS_004_RECS_READ_400_LEN = 5;
  	/**
	 * 	serializeSys004RecsRead400
	 */
	protected void serializeSys004RecsRead400(int sys004RecsRead400) {
		   putDecimal(beginSys004RecsRead400,sys004RecsRead400,SYS_004_RECS_READ_400_LEN,true);
   }
   

   protected int checkSys004RecsRead400MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSys004RecsRead400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSys004RecsRead400() throws CFException {	
   	try { 
		 return (getIntDecimal(beginSys004RecsRead400,SYS_004_RECS_READ_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("sys004RecsRead400", beginSys004RecsRead400,SYS_004_RECS_READ_400_LEN);
     }
   	}
        int localSys101RecsWrit400Counter = -1;
        public boolean isSys101RecsWrit400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSys101RecsWrit400Counter != sharedCounter;
           localSys101RecsWrit400Counter = sharedCounter; return hasModified; 
        }
	    public boolean sys101RecsWrit400IsNumeric() {
	      return decimalIsNumeric(beginSys101RecsWrit400,SYS_101_RECS_WRIT_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SYS_101_RECS_WRIT_400_LEN = 5;
  	/**
	 * 	serializeSys101RecsWrit400
	 */
	protected void serializeSys101RecsWrit400(int sys101RecsWrit400) {
		   putDecimal(beginSys101RecsWrit400,sys101RecsWrit400,SYS_101_RECS_WRIT_400_LEN,true);
   }
   

   protected int checkSys101RecsWrit400MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSys101RecsWrit400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSys101RecsWrit400() throws CFException {	
   	try { 
		 return (getIntDecimal(beginSys101RecsWrit400,SYS_101_RECS_WRIT_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("sys101RecsWrit400", beginSys101RecsWrit400,SYS_101_RECS_WRIT_400_LEN);
     }
   	}
        int localSys201RecsWrit400Counter = -1;
        public boolean isSys201RecsWrit400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSys201RecsWrit400Counter != sharedCounter;
           localSys201RecsWrit400Counter = sharedCounter; return hasModified; 
        }
	    public boolean sys201RecsWrit400IsNumeric() {
	      return decimalIsNumeric(beginSys201RecsWrit400,SYS_201_RECS_WRIT_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SYS_201_RECS_WRIT_400_LEN = 5;
  	/**
	 * 	serializeSys201RecsWrit400
	 */
	protected void serializeSys201RecsWrit400(int sys201RecsWrit400) {
		   putDecimal(beginSys201RecsWrit400,sys201RecsWrit400,SYS_201_RECS_WRIT_400_LEN,true);
   }
   

   protected int checkSys201RecsWrit400MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSys201RecsWrit400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSys201RecsWrit400() throws CFException {	
   	try { 
		 return (getIntDecimal(beginSys201RecsWrit400,SYS_201_RECS_WRIT_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("sys201RecsWrit400", beginSys201RecsWrit400,SYS_201_RECS_WRIT_400_LEN);
     }
   	}
        int localSys202RecsWrit400Counter = -1;
        public boolean isSys202RecsWrit400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSys202RecsWrit400Counter != sharedCounter;
           localSys202RecsWrit400Counter = sharedCounter; return hasModified; 
        }
	    public boolean sys202RecsWrit400IsNumeric() {
	      return decimalIsNumeric(beginSys202RecsWrit400,SYS_202_RECS_WRIT_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SYS_202_RECS_WRIT_400_LEN = 5;
  	/**
	 * 	serializeSys202RecsWrit400
	 */
	protected void serializeSys202RecsWrit400(int sys202RecsWrit400) {
		   putDecimal(beginSys202RecsWrit400,sys202RecsWrit400,SYS_202_RECS_WRIT_400_LEN,true);
   }
   

   protected int checkSys202RecsWrit400MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSys202RecsWrit400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSys202RecsWrit400() throws CFException {	
   	try { 
		 return (getIntDecimal(beginSys202RecsWrit400,SYS_202_RECS_WRIT_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("sys202RecsWrit400", beginSys202RecsWrit400,SYS_202_RECS_WRIT_400_LEN);
     }
   	}
        int localSys204RecsWrit400Counter = -1;
        public boolean isSys204RecsWrit400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSys204RecsWrit400Counter != sharedCounter;
           localSys204RecsWrit400Counter = sharedCounter; return hasModified; 
        }
	    public boolean sys204RecsWrit400IsNumeric() {
	      return decimalIsNumeric(beginSys204RecsWrit400,SYS_204_RECS_WRIT_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SYS_204_RECS_WRIT_400_LEN = 5;
  	/**
	 * 	serializeSys204RecsWrit400
	 */
	protected void serializeSys204RecsWrit400(int sys204RecsWrit400) {
		   putDecimal(beginSys204RecsWrit400,sys204RecsWrit400,SYS_204_RECS_WRIT_400_LEN,true);
   }
   

   protected int checkSys204RecsWrit400MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSys204RecsWrit400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSys204RecsWrit400() throws CFException {	
   	try { 
		 return (getIntDecimal(beginSys204RecsWrit400,SYS_204_RECS_WRIT_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("sys204RecsWrit400", beginSys204RecsWrit400,SYS_204_RECS_WRIT_400_LEN);
     }
   	}
        int localSys205RecsWrit400Counter = -1;
        public boolean isSys205RecsWrit400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSys205RecsWrit400Counter != sharedCounter;
           localSys205RecsWrit400Counter = sharedCounter; return hasModified; 
        }
	    public boolean sys205RecsWrit400IsNumeric() {
	      return decimalIsNumeric(beginSys205RecsWrit400,SYS_205_RECS_WRIT_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SYS_205_RECS_WRIT_400_LEN = 5;
  	/**
	 * 	serializeSys205RecsWrit400
	 */
	protected void serializeSys205RecsWrit400(int sys205RecsWrit400) {
		   putDecimal(beginSys205RecsWrit400,sys205RecsWrit400,SYS_205_RECS_WRIT_400_LEN,true);
   }
   

   protected int checkSys205RecsWrit400MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSys205RecsWrit400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSys205RecsWrit400() throws CFException {	
   	try { 
		 return (getIntDecimal(beginSys205RecsWrit400,SYS_205_RECS_WRIT_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("sys205RecsWrit400", beginSys205RecsWrit400,SYS_205_RECS_WRIT_400_LEN);
     }
   	}
        int localLoopCntr400Counter = -1;
        public boolean isLoopCntr400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localLoopCntr400Counter != sharedCounter;
           localLoopCntr400Counter = sharedCounter; return hasModified; 
        }
	    public boolean loopCntr400IsNumeric() {
	      return decimalIsNumeric(beginLoopCntr400,LOOP_CNTR_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int LOOP_CNTR_400_LEN = 5;
  	/**
	 * 	serializeLoopCntr400
	 */
	protected void serializeLoopCntr400(int loopCntr400) {
		   putDecimal(beginLoopCntr400,loopCntr400,LOOP_CNTR_400_LEN,true);
   }
   

   protected int checkLoopCntr400MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshLoopCntr400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLoopCntr400() throws CFException {	
   	try { 
		 return (getIntDecimal(beginLoopCntr400,LOOP_CNTR_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("loopCntr400", beginLoopCntr400,LOOP_CNTR_400_LEN);
     }
   	}
         int localComnTblItems500Counter = -1;
         public boolean isComnTblItems500Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localComnTblItems500Counter != sharedCounter;
            localComnTblItems500Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkComnTblItems500MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localComnTblMax500Counter = -1;
         public boolean isComnTblMax500Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localComnTblMax500Counter != sharedCounter;
            localComnTblMax500Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkComnTblMax500MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localComnTblSrchKey500Counter = -1;
     public boolean isComnTblSrchKey500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localComnTblSrchKey500Counter != sharedCounter;
         localComnTblSrchKey500Counter = sharedCounter; return hasModified;
     }

   protected char[] checkComnTblSrchKey500Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
     int localComnSrchKeyFndSw500Counter = -1;
     public boolean isComnSrchKeyFndSw500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localComnSrchKeyFndSw500Counter != sharedCounter;
         localComnSrchKeyFndSw500Counter = sharedCounter; return hasModified;
     }

   protected char[] checkComnSrchKeyFndSw500Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
         int localTblItems5001240200Counter = -1;
         public boolean isTblItems5001240200Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTblItems5001240200Counter != sharedCounter;
            localTblItems5001240200Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTblItems5001240200MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTblMax5001240200Counter = -1;
         public boolean isTblMax5001240200Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTblMax5001240200Counter != sharedCounter;
            localTblMax5001240200Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTblMax5001240200MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localTblSrchKey5001240200Counter = -1;
     public boolean isTblSrchKey5001240200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTblSrchKey5001240200Counter != sharedCounter;
         localTblSrchKey5001240200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTblSrchKey5001240200Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
     int localSrchKeyFndSw5001240200Counter = -1;
     public boolean isSrchKeyFndSw5001240200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrchKeyFndSw5001240200Counter != sharedCounter;
         localSrchKeyFndSw5001240200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSrchKeyFndSw5001240200Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
         int localTblItems5001644695Counter = -1;
         public boolean isTblItems5001644695Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTblItems5001644695Counter != sharedCounter;
            localTblItems5001644695Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTblItems5001644695MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTblMax5001644695Counter = -1;
         public boolean isTblMax5001644695Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTblMax5001644695Counter != sharedCounter;
            localTblMax5001644695Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTblMax5001644695MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localTblSrchKey5001644695Counter = -1;
     public boolean isTblSrchKey5001644695Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTblSrchKey5001644695Counter != sharedCounter;
         localTblSrchKey5001644695Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTblSrchKey5001644695Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
     int localSrchKeyFndSw5001644695Counter = -1;
     public boolean isSrchKeyFndSw5001644695Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrchKeyFndSw5001644695Counter != sharedCounter;
         localSrchKeyFndSw5001644695Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSrchKeyFndSw5001644695Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
         int localTblItems5001644697Counter = -1;
         public boolean isTblItems5001644697Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTblItems5001644697Counter != sharedCounter;
            localTblItems5001644697Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTblItems5001644697MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTblMax5001644697Counter = -1;
         public boolean isTblMax5001644697Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTblMax5001644697Counter != sharedCounter;
            localTblMax5001644697Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTblMax5001644697MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localTblSrchKey5001644697Counter = -1;
     public boolean isTblSrchKey5001644697Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTblSrchKey5001644697Counter != sharedCounter;
         localTblSrchKey5001644697Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTblSrchKey5001644697Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
     int localSrchKeyFndSw5001644697Counter = -1;
     public boolean isSrchKeyFndSw5001644697Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrchKeyFndSw5001644697Counter != sharedCounter;
         localSrchKeyFndSw5001644697Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSrchKeyFndSw5001644697Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
         int localRowCount500Counter = -1;
         public boolean isRowCount500Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRowCount500Counter != sharedCounter;
            localRowCount500Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkRowCount500MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localRowCount502Counter = -1;
         public boolean isRowCount502Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRowCount502Counter != sharedCounter;
            localRowCount502Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkRowCount502MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localRowCount501Counter = -1;
         public boolean isRowCount501Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRowCount501Counter != sharedCounter;
            localRowCount501Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkRowCount501MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localAllLineText600Counter = -1;
     public boolean isAllLineText600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAllLineText600Counter != sharedCounter;
         localAllLineText600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAllLineText600Constraints(char[] value) {
   			return super.checkConstraints(value , 99 ,false, false);
   }
     int localHeaderText600Counter = -1;
     public boolean isHeaderText600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHeaderText600Counter != sharedCounter;
         localHeaderText600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHeaderText600Constraints(char[] value) {
   			return super.checkConstraints(value , 101 ,false, false);
   }
     int localLineText600Counter = -1;
     public boolean isLineText600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLineText600Counter != sharedCounter;
         localLineText600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLineText600Constraints(char[] value) {
   			return super.checkConstraints(value , 99 ,false, false);
   }
     int localErrorMsg6003015Counter = -1;
     public boolean isErrorMsg6003015Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorMsg6003015Counter != sharedCounter;
         localErrorMsg6003015Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrorMsg6003015Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localErrorMsg6003016Counter = -1;
     public boolean isErrorMsg6003016Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorMsg6003016Counter != sharedCounter;
         localErrorMsg6003016Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrorMsg6003016Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localErrorMsg6003017Counter = -1;
     public boolean isErrorMsg6003017Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorMsg6003017Counter != sharedCounter;
         localErrorMsg6003017Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrorMsg6003017Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localErrorCode600Counter = -1;
     public boolean isErrorCode600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorCode600Counter != sharedCounter;
         localErrorCode600Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of errorCode600
	 *	@return errorCode600
	 */
	public char[]  getErrorCode600String() {
	     return getCharArray(beginErrorCode600,ERROR_CODE_600_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorCode600IsNumeric() {
	    return isNumeric(beginErrorCode600
	                    ,beginErrorCode600 + ERROR_CODE_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ERROR_CODE_600_LEN = 4;
  	/**
	 * serializeErrorCode600
	 */
	protected void serializeErrorCode600(int errorCode600) {
		 putNumber(beginErrorCode600,errorCode600,ERROR_CODE_600_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localErrorCode600Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeErrorCode600
	 */
   	protected  int serializeErrorCode600(char[] value) {
	    int  errorCode600;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    errorCode600 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginErrorCode600
		       ,4
		      );
		 localErrorCode600Counter = shareString.getSerializedField().getModifiedCounter();
		return  errorCode600;
    }

   protected int checkErrorCode600MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshErrorCode600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshErrorCode600() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginErrorCode600
			                 ,ERROR_CODE_600_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("errorCode600", beginErrorCode600,ERROR_CODE_600_LEN);
    }
   	}
     int localErrorText600Counter = -1;
     public boolean isErrorText600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorText600Counter != sharedCounter;
         localErrorText600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrorText600Constraints(char[] value) {
   			return super.checkConstraints(value , 99 ,false, false);
   }
     int localBrandProduct800Counter = -1;
     public boolean isBrandProduct800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBrandProduct800Counter != sharedCounter;
         localBrandProduct800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBrandProduct800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localFldNameLen800Counter = -1;
     public boolean isFldNameLen800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFldNameLen800Counter != sharedCounter;
         localFldNameLen800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fldNameLen800
	 *	@return fldNameLen800
	 */
	public char[]  getFldNameLen800String() {
	     return getCharArray(beginFldNameLen800,FLD_NAME_LEN_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fldNameLen800IsNumeric() {
	    return isNumeric(beginFldNameLen800
	                    ,beginFldNameLen800 + FLD_NAME_LEN_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FLD_NAME_LEN_800_LEN = 3;
  	/**
	 * serializeFldNameLen800
	 */
	protected void serializeFldNameLen800(int fldNameLen800) {
		 putNumber(beginFldNameLen800,fldNameLen800,FLD_NAME_LEN_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFldNameLen800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFldNameLen800
	 */
   	protected  int serializeFldNameLen800(char[] value) {
	    int  fldNameLen800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fldNameLen800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginFldNameLen800
		       ,3
		      );
		 localFldNameLen800Counter = shareString.getSerializedField().getModifiedCounter();
		return  fldNameLen800;
    }

   protected int checkFldNameLen800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFldNameLen800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFldNameLen800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFldNameLen800
			                 ,FLD_NAME_LEN_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fldNameLen800", beginFldNameLen800,FLD_NAME_LEN_800_LEN);
    }
   	}
     int localFldName800Counter = -1;
     public boolean isFldName800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFldName800Counter != sharedCounter;
         localFldName800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFldName800Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localFldValue800Counter = -1;
     public boolean isFldValue800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFldValue800Counter != sharedCounter;
         localFldValue800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFldValue800Constraints(char[] value) {
   			return super.checkConstraints(value , 65 ,false, false);
   }
     int localFldLen800Counter = -1;
     public boolean isFldLen800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFldLen800Counter != sharedCounter;
         localFldLen800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fldLen800
	 *	@return fldLen800
	 */
	public char[]  getFldLen800String() {
	     return getCharArray(beginFldLen800,FLD_LEN_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fldLen800IsNumeric() {
	    return isNumeric(beginFldLen800
	                    ,beginFldLen800 + FLD_LEN_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FLD_LEN_800_LEN = 3;
  	/**
	 * serializeFldLen800
	 */
	protected void serializeFldLen800(int fldLen800) {
		 putNumber(beginFldLen800,fldLen800,FLD_LEN_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFldLen800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFldLen800
	 */
   	protected  int serializeFldLen800(char[] value) {
	    int  fldLen800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fldLen800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginFldLen800
		       ,3
		      );
		 localFldLen800Counter = shareString.getSerializedField().getModifiedCounter();
		return  fldLen800;
    }

   protected int checkFldLen800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFldLen800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFldLen800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFldLen800
			                 ,FLD_LEN_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fldLen800", beginFldLen800,FLD_LEN_800_LEN);
    }
   	}
     int localOldFldLen800Counter = -1;
     public boolean isOldFldLen800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOldFldLen800Counter != sharedCounter;
         localOldFldLen800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of oldFldLen800
	 *	@return oldFldLen800
	 */
	public char[]  getOldFldLen800String() {
	     return getCharArray(beginOldFldLen800,OLD_FLD_LEN_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean oldFldLen800IsNumeric() {
	    return isNumeric(beginOldFldLen800
	                    ,beginOldFldLen800 + OLD_FLD_LEN_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OLD_FLD_LEN_800_LEN = 3;
  	/**
	 * serializeOldFldLen800
	 */
	protected void serializeOldFldLen800(int oldFldLen800) {
		 putNumber(beginOldFldLen800,oldFldLen800,OLD_FLD_LEN_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOldFldLen800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOldFldLen800
	 */
   	protected  int serializeOldFldLen800(char[] value) {
	    int  oldFldLen800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    oldFldLen800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginOldFldLen800
		       ,3
		      );
		 localOldFldLen800Counter = shareString.getSerializedField().getModifiedCounter();
		return  oldFldLen800;
    }

   protected int checkOldFldLen800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOldFldLen800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOldFldLen800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOldFldLen800
			                 ,OLD_FLD_LEN_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("oldFldLen800", beginOldFldLen800,OLD_FLD_LEN_800_LEN);
    }
   	}
     int localPadLen800Counter = -1;
     public boolean isPadLen800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPadLen800Counter != sharedCounter;
         localPadLen800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of padLen800
	 *	@return padLen800
	 */
	public char[]  getPadLen800String() {
	     return getCharArray(beginPadLen800,PAD_LEN_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean padLen800IsNumeric() {
	    return isNumeric(beginPadLen800
	                    ,beginPadLen800 + PAD_LEN_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAD_LEN_800_LEN = 3;
  	/**
	 * serializePadLen800
	 */
	protected void serializePadLen800(int padLen800) {
		 putNumber(beginPadLen800,padLen800,PAD_LEN_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPadLen800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePadLen800
	 */
   	protected  int serializePadLen800(char[] value) {
	    int  padLen800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    padLen800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginPadLen800
		       ,3
		      );
		 localPadLen800Counter = shareString.getSerializedField().getModifiedCounter();
		return  padLen800;
    }

   protected int checkPadLen800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPadLen800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPadLen800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPadLen800
			                 ,PAD_LEN_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("padLen800", beginPadLen800,PAD_LEN_800_LEN);
    }
   	}
     int localPtrAbend800Counter = -1;
     public boolean isPtrAbend800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrAbend800Counter != sharedCounter;
         localPtrAbend800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrAbend800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp169410800Counter = -1;
     public boolean isPtrIp169410800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp169410800Counter != sharedCounter;
         localPtrIp169410800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp169410800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp666010800Counter = -1;
     public boolean isPtrIp666010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp666010800Counter != sharedCounter;
         localPtrIp666010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp666010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp666030800Counter = -1;
     public boolean isPtrIp666030800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp666030800Counter != sharedCounter;
         localPtrIp666030800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp666030800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp670010800Counter = -1;
     public boolean isPtrIp670010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp670010800Counter != sharedCounter;
         localPtrIp670010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp670010800Constraints(char[] value) {
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
  
