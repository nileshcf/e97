package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 128;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPackedOne300;
            protected  int beginOne300;
            protected  int beginTwo300;
            protected  int beginThree300;
            protected  int beginFour300;
            protected  int beginFive300;
            protected  int beginSix300;
            protected  int beginSeven300;
            protected  int beginEight300;
            protected  int beginNine300;
            protected  int beginTwelve300;
            protected  int beginMax300;
            protected  int beginMti0110300;
            protected  int beginMti0100300;
            protected  int beginMaxLines400;
            protected  int beginPageCount400;
            protected  int beginLineCount400;
            protected  int beginTotalRecs400;
            protected  int beginTotalParseErrors400;
            protected  int beginTotalIsoAuth400;
            protected  int beginTotalIaDropped400;
            protected  int beginTotalType2400;
            protected  int beginTotalType3400;
            protected  int beginTotal0120Adv400;
            protected  int beginTotalRevAdv400;
            protected  int beginTotalVer2400;
            protected  int beginTotalBadPan400;
            protected  int beginSe42Lnth400;
            protected  int beginSe42Pos400;
            protected  int beginSe33Pos400;
            protected  int beginSe24Pos400;
            protected  int beginSe66Pos400;
            protected  int beginDe48Se33SfLen500;
            protected  int beginDe48Se42SfLen500;
            protected  int beginDe48Se42SfLen1500;
            protected  int beginHoldCurrCc800;
            protected  int beginObscurePos800;
            protected  int beginObscurePos2800;
            protected  int beginObscureStartPos800;
            protected  int beginObscureEndPos800;
            protected  int beginObscureLgth800;
            protected  int beginHour800;
            protected  int beginMin800;
            protected  int beginSec800;
            protected  int beginIsoBlResponse1800;
            protected  int beginIsoBlResponse2800;
            protected  int beginIsoBlDown1800;
            protected  int beginIsoBlDown2800;
            protected  int beginIsoBlMoto1800;
            protected  int beginMciwinReturnCode;
	
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
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginPackedOne300 = getStartOffset() + 0;	// set offset for serialization
  
             beginOne300 = getStartOffset() + 2;	// set offset for serialization
  
             beginTwo300 = getStartOffset() + 3;	// set offset for serialization
  
             beginThree300 = getStartOffset() + 4;	// set offset for serialization
  
             beginFour300 = getStartOffset() + 5;	// set offset for serialization
  
             beginFive300 = getStartOffset() + 6;	// set offset for serialization
  
             beginSix300 = getStartOffset() + 7;	// set offset for serialization
  
             beginSeven300 = getStartOffset() + 8;	// set offset for serialization
  
             beginEight300 = getStartOffset() + 9;	// set offset for serialization
  
             beginNine300 = getStartOffset() + 10;	// set offset for serialization
  
             beginTwelve300 = getStartOffset() + 11;	// set offset for serialization
  
             beginMax300 = getStartOffset() + 13;	// set offset for serialization
  
             beginMti0110300 = getStartOffset() + 16;	// set offset for serialization
  
             beginMti0100300 = getStartOffset() + 20;	// set offset for serialization
  
  
  
  
  
             beginMaxLines400 = getStartOffset() + 24;	// set offset for serialization
  
             beginPageCount400 = getStartOffset() + 26;	// set offset for serialization
  
             beginLineCount400 = getStartOffset() + 28;	// set offset for serialization
  
             beginTotalRecs400 = getStartOffset() + 30;	// set offset for serialization
  
             beginTotalParseErrors400 = getStartOffset() + 35;	// set offset for serialization
  
             beginTotalIsoAuth400 = getStartOffset() + 40;	// set offset for serialization
  
             beginTotalIaDropped400 = getStartOffset() + 45;	// set offset for serialization
  
             beginTotalType2400 = getStartOffset() + 50;	// set offset for serialization
  
             beginTotalType3400 = getStartOffset() + 55;	// set offset for serialization
  
             beginTotal0120Adv400 = getStartOffset() + 60;	// set offset for serialization
  
             beginTotalRevAdv400 = getStartOffset() + 65;	// set offset for serialization
  
             beginTotalVer2400 = getStartOffset() + 70;	// set offset for serialization
  
             beginTotalBadPan400 = getStartOffset() + 75;	// set offset for serialization
  
  
             beginSe42Lnth400 = getStartOffset() + 80;	// set offset for serialization
  
             beginSe42Pos400 = getStartOffset() + 82;	// set offset for serialization
  
             beginSe33Pos400 = getStartOffset() + 84;	// set offset for serialization
  
             beginSe24Pos400 = getStartOffset() + 86;	// set offset for serialization
  
             beginSe66Pos400 = getStartOffset() + 88;	// set offset for serialization
  
  
  
  
             beginDe48Se33SfLen500 = getStartOffset() + 90;	// set offset for serialization
  
             beginDe48Se42SfLen500 = getStartOffset() + 92;	// set offset for serialization
  
             beginDe48Se42SfLen1500 = getStartOffset() + 94;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginHoldCurrCc800 = getStartOffset() + 96;	// set offset for serialization
  
  
             beginObscurePos800 = getStartOffset() + 98;	// set offset for serialization
  
             beginObscurePos2800 = getStartOffset() + 101;	// set offset for serialization
  
             beginObscureStartPos800 = getStartOffset() + 104;	// set offset for serialization
  
             beginObscureEndPos800 = getStartOffset() + 107;	// set offset for serialization
  
             beginObscureLgth800 = getStartOffset() + 110;	// set offset for serialization
  
             beginHour800 = getStartOffset() + 113;	// set offset for serialization
  
             beginMin800 = getStartOffset() + 115;	// set offset for serialization
  
             beginSec800 = getStartOffset() + 117;	// set offset for serialization
  
             beginIsoBlResponse1800 = getStartOffset() + 119;	// set offset for serialization
  
             beginIsoBlResponse2800 = getStartOffset() + 120;	// set offset for serialization
  
             beginIsoBlDown1800 = getStartOffset() + 121;	// set offset for serialization
  
             beginIsoBlDown2800 = getStartOffset() + 122;	// set offset for serialization
  
             beginIsoBlMoto1800 = getStartOffset() + 123;	// set offset for serialization
  
             beginMciwinReturnCode = getStartOffset() + 124;	// set offset for serialization
  
  
  
  
  
	   /*  end of offset */
	}
     int localParseSw100Counter = -1;
     public boolean isParseSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParseSw100Counter != sharedCounter;
         localParseSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkParseSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localCentralSiteEofSw100Counter = -1;
     public boolean isCentralSiteEofSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCentralSiteEofSw100Counter != sharedCounter;
         localCentralSiteEofSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCentralSiteEofSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localCycleId100Counter = -1;
     public boolean isCycleId100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCycleId100Counter != sharedCounter;
         localCycleId100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCycleId100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localLogClass100Counter = -1;
     public boolean isLogClass100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogClass100Counter != sharedCounter;
         localLogClass100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLogClass100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localLogType100Counter = -1;
     public boolean isLogType100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogType100Counter != sharedCounter;
         localLogType100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLogType100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localMessageType100Counter = -1;
     public boolean isMessageType100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMessageType100Counter != sharedCounter;
         localMessageType100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMessageType100Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localLitA300Counter = -1;
     public boolean isLitA300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLitA300Counter != sharedCounter;
         localLitA300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLitA300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localLitB300Counter = -1;
     public boolean isLitB300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLitB300Counter != sharedCounter;
         localLitB300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLitB300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
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
     int localLitN300Counter = -1;
     public boolean isLitN300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLitN300Counter != sharedCounter;
         localLitN300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLitN300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localLitY300Counter = -1;
     public boolean isLitY300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLitY300Counter != sharedCounter;
         localLitY300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLitY300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localLitIa300Counter = -1;
     public boolean isLitIa300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLitIa300Counter != sharedCounter;
         localLitIa300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLitIa300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLit01300Counter = -1;
     public boolean isLit01300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit01300Counter != sharedCounter;
         localLit01300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit01300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLit02300Counter = -1;
     public boolean isLit02300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit02300Counter != sharedCounter;
         localLit02300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit02300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLit03300Counter = -1;
     public boolean isLit03300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit03300Counter != sharedCounter;
         localLit03300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit03300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLit05300Counter = -1;
     public boolean isLit05300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit05300Counter != sharedCounter;
         localLit05300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit05300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLit06300Counter = -1;
     public boolean isLit06300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit06300Counter != sharedCounter;
         localLit06300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit06300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLit09300Counter = -1;
     public boolean isLit09300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit09300Counter != sharedCounter;
         localLit09300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit09300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLit10300Counter = -1;
     public boolean isLit10300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit10300Counter != sharedCounter;
         localLit10300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit10300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLit16300Counter = -1;
     public boolean isLit16300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit16300Counter != sharedCounter;
         localLit16300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit16300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLit30300Counter = -1;
     public boolean isLit30300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit30300Counter != sharedCounter;
         localLit30300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit30300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLit50300Counter = -1;
     public boolean isLit50300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit50300Counter != sharedCounter;
         localLit50300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit50300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLit51300Counter = -1;
     public boolean isLit51300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit51300Counter != sharedCounter;
         localLit51300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit51300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLit52300Counter = -1;
     public boolean isLit52300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit52300Counter != sharedCounter;
         localLit52300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit52300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLit82300Counter = -1;
     public boolean isLit82300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit82300Counter != sharedCounter;
         localLit82300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit82300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLit83300Counter = -1;
     public boolean isLit83300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit83300Counter != sharedCounter;
         localLit83300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit83300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLit85300Counter = -1;
     public boolean isLit85300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit85300Counter != sharedCounter;
         localLit85300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit85300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localLit002300Counter = -1;
     public boolean isLit002300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit002300Counter != sharedCounter;
         localLit002300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit002300Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localLit0120300Counter = -1;
     public boolean isLit0120300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit0120300Counter != sharedCounter;
         localLit0120300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit0120300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localLit0130300Counter = -1;
     public boolean isLit0130300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit0130300Counter != sharedCounter;
         localLit0130300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit0130300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localLit0420300Counter = -1;
     public boolean isLit0420300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit0420300Counter != sharedCounter;
         localLit0420300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit0420300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localLit0430300Counter = -1;
     public boolean isLit0430300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit0430300Counter != sharedCounter;
         localLit0430300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit0430300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localLit380000300Counter = -1;
     public boolean isLit380000300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLit380000300Counter != sharedCounter;
         localLit380000300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLit380000300Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localDoubleSpace300Counter = -1;
     public boolean isDoubleSpace300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDoubleSpace300Counter != sharedCounter;
         localDoubleSpace300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDoubleSpace300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localTripleSpace300Counter = -1;
     public boolean isTripleSpace300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTripleSpace300Counter != sharedCounter;
         localTripleSpace300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTripleSpace300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localNewPage300Counter = -1;
     public boolean isNewPage300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNewPage300Counter != sharedCounter;
         localNewPage300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkNewPage300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
        int localPackedOne300Counter = -1;
        public boolean isPackedOne300Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPackedOne300Counter != sharedCounter;
           localPackedOne300Counter = sharedCounter; return hasModified; 
        }
	    public boolean packedOne300IsNumeric() {
	      return decimalIsNumeric(beginPackedOne300,PACKED_ONE_300_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PACKED_ONE_300_LEN = 2;
  	/**
	 * 	serializePackedOne300
	 */
	protected void serializePackedOne300(short packedOne300) {
		   putDecimal(beginPackedOne300,packedOne300,PACKED_ONE_300_LEN,true);
   }
   

   protected short checkPackedOne300MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshPackedOne300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPackedOne300() throws CFException {	
   	try { 
		 return (getShortDecimal(beginPackedOne300,PACKED_ONE_300_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("packedOne300", beginPackedOne300,PACKED_ONE_300_LEN);
     }
   	}
     int localOne300Counter = -1;
     public boolean isOne300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOne300Counter != sharedCounter;
         localOne300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of one300
	 *	@return one300
	 */
	public char[]  getOne300String() {
	     return getCharArray(beginOne300,ONE_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean one300IsNumeric() {
	    return isNumeric(beginOne300
	                    ,beginOne300 + ONE_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ONE_300_LEN = 1;
  	/**
	 * serializeOne300
	 */
	protected void serializeOne300(int one300) {
		 putNumber(beginOne300,one300,ONE_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOne300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOne300
	 */
   	protected  int serializeOne300(char[] value) {
	    int  one300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    one300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginOne300
		       ,1
		      );
		 localOne300Counter = shareString.getSerializedField().getModifiedCounter();
		return  one300;
    }

   protected int checkOne300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOne300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOne300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOne300
			                 ,ONE_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("one300", beginOne300,ONE_300_LEN);
    }
   	}
     int localTwo300Counter = -1;
     public boolean isTwo300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTwo300Counter != sharedCounter;
         localTwo300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of two300
	 *	@return two300
	 */
	public char[]  getTwo300String() {
	     return getCharArray(beginTwo300,TWO_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean two300IsNumeric() {
	    return isNumeric(beginTwo300
	                    ,beginTwo300 + TWO_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TWO_300_LEN = 1;
  	/**
	 * serializeTwo300
	 */
	protected void serializeTwo300(int two300) {
		 putNumber(beginTwo300,two300,TWO_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTwo300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTwo300
	 */
   	protected  int serializeTwo300(char[] value) {
	    int  two300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    two300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginTwo300
		       ,1
		      );
		 localTwo300Counter = shareString.getSerializedField().getModifiedCounter();
		return  two300;
    }

   protected int checkTwo300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTwo300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTwo300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTwo300
			                 ,TWO_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("two300", beginTwo300,TWO_300_LEN);
    }
   	}
     int localThree300Counter = -1;
     public boolean isThree300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localThree300Counter != sharedCounter;
         localThree300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of three300
	 *	@return three300
	 */
	public char[]  getThree300String() {
	     return getCharArray(beginThree300,THREE_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean three300IsNumeric() {
	    return isNumeric(beginThree300
	                    ,beginThree300 + THREE_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int THREE_300_LEN = 1;
  	/**
	 * serializeThree300
	 */
	protected void serializeThree300(int three300) {
		 putNumber(beginThree300,three300,THREE_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localThree300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeThree300
	 */
   	protected  int serializeThree300(char[] value) {
	    int  three300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    three300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginThree300
		       ,1
		      );
		 localThree300Counter = shareString.getSerializedField().getModifiedCounter();
		return  three300;
    }

   protected int checkThree300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshThree300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshThree300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginThree300
			                 ,THREE_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("three300", beginThree300,THREE_300_LEN);
    }
   	}
     int localFour300Counter = -1;
     public boolean isFour300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFour300Counter != sharedCounter;
         localFour300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of four300
	 *	@return four300
	 */
	public char[]  getFour300String() {
	     return getCharArray(beginFour300,FOUR_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean four300IsNumeric() {
	    return isNumeric(beginFour300
	                    ,beginFour300 + FOUR_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FOUR_300_LEN = 1;
  	/**
	 * serializeFour300
	 */
	protected void serializeFour300(int four300) {
		 putNumber(beginFour300,four300,FOUR_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFour300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFour300
	 */
   	protected  int serializeFour300(char[] value) {
	    int  four300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    four300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginFour300
		       ,1
		      );
		 localFour300Counter = shareString.getSerializedField().getModifiedCounter();
		return  four300;
    }

   protected int checkFour300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFour300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFour300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFour300
			                 ,FOUR_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("four300", beginFour300,FOUR_300_LEN);
    }
   	}
     int localFive300Counter = -1;
     public boolean isFive300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFive300Counter != sharedCounter;
         localFive300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of five300
	 *	@return five300
	 */
	public char[]  getFive300String() {
	     return getCharArray(beginFive300,FIVE_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean five300IsNumeric() {
	    return isNumeric(beginFive300
	                    ,beginFive300 + FIVE_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FIVE_300_LEN = 1;
  	/**
	 * serializeFive300
	 */
	protected void serializeFive300(int five300) {
		 putNumber(beginFive300,five300,FIVE_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFive300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFive300
	 */
   	protected  int serializeFive300(char[] value) {
	    int  five300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    five300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginFive300
		       ,1
		      );
		 localFive300Counter = shareString.getSerializedField().getModifiedCounter();
		return  five300;
    }

   protected int checkFive300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFive300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFive300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFive300
			                 ,FIVE_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("five300", beginFive300,FIVE_300_LEN);
    }
   	}
     int localSix300Counter = -1;
     public boolean isSix300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSix300Counter != sharedCounter;
         localSix300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of six300
	 *	@return six300
	 */
	public char[]  getSix300String() {
	     return getCharArray(beginSix300,SIX_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean six300IsNumeric() {
	    return isNumeric(beginSix300
	                    ,beginSix300 + SIX_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SIX_300_LEN = 1;
  	/**
	 * serializeSix300
	 */
	protected void serializeSix300(int six300) {
		 putNumber(beginSix300,six300,SIX_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSix300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSix300
	 */
   	protected  int serializeSix300(char[] value) {
	    int  six300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    six300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginSix300
		       ,1
		      );
		 localSix300Counter = shareString.getSerializedField().getModifiedCounter();
		return  six300;
    }

   protected int checkSix300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSix300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSix300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSix300
			                 ,SIX_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("six300", beginSix300,SIX_300_LEN);
    }
   	}
     int localSeven300Counter = -1;
     public boolean isSeven300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeven300Counter != sharedCounter;
         localSeven300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of seven300
	 *	@return seven300
	 */
	public char[]  getSeven300String() {
	     return getCharArray(beginSeven300,SEVEN_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean seven300IsNumeric() {
	    return isNumeric(beginSeven300
	                    ,beginSeven300 + SEVEN_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SEVEN_300_LEN = 1;
  	/**
	 * serializeSeven300
	 */
	protected void serializeSeven300(int seven300) {
		 putNumber(beginSeven300,seven300,SEVEN_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSeven300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSeven300
	 */
   	protected  int serializeSeven300(char[] value) {
	    int  seven300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    seven300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginSeven300
		       ,1
		      );
		 localSeven300Counter = shareString.getSerializedField().getModifiedCounter();
		return  seven300;
    }

   protected int checkSeven300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSeven300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSeven300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSeven300
			                 ,SEVEN_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("seven300", beginSeven300,SEVEN_300_LEN);
    }
   	}
     int localEight300Counter = -1;
     public boolean isEight300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEight300Counter != sharedCounter;
         localEight300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of eight300
	 *	@return eight300
	 */
	public char[]  getEight300String() {
	     return getCharArray(beginEight300,EIGHT_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean eight300IsNumeric() {
	    return isNumeric(beginEight300
	                    ,beginEight300 + EIGHT_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EIGHT_300_LEN = 1;
  	/**
	 * serializeEight300
	 */
	protected void serializeEight300(int eight300) {
		 putNumber(beginEight300,eight300,EIGHT_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEight300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEight300
	 */
   	protected  int serializeEight300(char[] value) {
	    int  eight300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    eight300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginEight300
		       ,1
		      );
		 localEight300Counter = shareString.getSerializedField().getModifiedCounter();
		return  eight300;
    }

   protected int checkEight300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshEight300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEight300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginEight300
			                 ,EIGHT_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("eight300", beginEight300,EIGHT_300_LEN);
    }
   	}
     int localNine300Counter = -1;
     public boolean isNine300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNine300Counter != sharedCounter;
         localNine300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of nine300
	 *	@return nine300
	 */
	public char[]  getNine300String() {
	     return getCharArray(beginNine300,NINE_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean nine300IsNumeric() {
	    return isNumeric(beginNine300
	                    ,beginNine300 + NINE_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NINE_300_LEN = 1;
  	/**
	 * serializeNine300
	 */
	protected void serializeNine300(int nine300) {
		 putNumber(beginNine300,nine300,NINE_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNine300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNine300
	 */
   	protected  int serializeNine300(char[] value) {
	    int  nine300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    nine300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginNine300
		       ,1
		      );
		 localNine300Counter = shareString.getSerializedField().getModifiedCounter();
		return  nine300;
    }

   protected int checkNine300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNine300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNine300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNine300
			                 ,NINE_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("nine300", beginNine300,NINE_300_LEN);
    }
   	}
     int localTwelve300Counter = -1;
     public boolean isTwelve300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTwelve300Counter != sharedCounter;
         localTwelve300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of twelve300
	 *	@return twelve300
	 */
	public char[]  getTwelve300String() {
	     return getCharArray(beginTwelve300,TWELVE_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean twelve300IsNumeric() {
	    return isNumeric(beginTwelve300
	                    ,beginTwelve300 + TWELVE_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TWELVE_300_LEN = 2;
  	/**
	 * serializeTwelve300
	 */
	protected void serializeTwelve300(int twelve300) {
		 putNumber(beginTwelve300,twelve300,TWELVE_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTwelve300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTwelve300
	 */
   	protected  int serializeTwelve300(char[] value) {
	    int  twelve300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    twelve300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginTwelve300
		       ,2
		      );
		 localTwelve300Counter = shareString.getSerializedField().getModifiedCounter();
		return  twelve300;
    }

   protected int checkTwelve300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTwelve300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTwelve300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTwelve300
			                 ,TWELVE_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("twelve300", beginTwelve300,TWELVE_300_LEN);
    }
   	}
     int localMax300Counter = -1;
     public boolean isMax300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMax300Counter != sharedCounter;
         localMax300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of max300
	 *	@return max300
	 */
	public char[]  getMax300String() {
	     return getCharArray(beginMax300,MAX_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean max300IsNumeric() {
	    return isNumeric(beginMax300
	                    ,beginMax300 + MAX_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MAX_300_LEN = 3;
  	/**
	 * serializeMax300
	 */
	protected void serializeMax300(int max300) {
		 putNumber(beginMax300,max300,MAX_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMax300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMax300
	 */
   	protected  int serializeMax300(char[] value) {
	    int  max300;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    max300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginMax300
		       ,3
		      );
		 localMax300Counter = shareString.getSerializedField().getModifiedCounter();
		return  max300;
    }

   protected int checkMax300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMax300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMax300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMax300
			                 ,MAX_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("max300", beginMax300,MAX_300_LEN);
    }
   	}
     int localMti0110300Counter = -1;
     public boolean isMti0110300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMti0110300Counter != sharedCounter;
         localMti0110300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mti0110300
	 *	@return mti0110300
	 */
	public char[]  getMti0110300String() {
	     return getCharArray(beginMti0110300,MTI_0110300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mti0110300IsNumeric() {
	    return isNumeric(beginMti0110300
	                    ,beginMti0110300 + MTI_0110300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MTI_0110300_LEN = 4;
  	/**
	 * serializeMti0110300
	 */
	protected void serializeMti0110300(int mti0110300) {
		 putNumber(beginMti0110300,mti0110300,MTI_0110300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMti0110300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMti0110300
	 */
   	protected  int serializeMti0110300(char[] value) {
	    int  mti0110300;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mti0110300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginMti0110300
		       ,4
		      );
		 localMti0110300Counter = shareString.getSerializedField().getModifiedCounter();
		return  mti0110300;
    }

   protected int checkMti0110300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMti0110300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMti0110300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMti0110300
			                 ,MTI_0110300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mti0110300", beginMti0110300,MTI_0110300_LEN);
    }
   	}
     int localMti0100300Counter = -1;
     public boolean isMti0100300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMti0100300Counter != sharedCounter;
         localMti0100300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mti0100300
	 *	@return mti0100300
	 */
	public char[]  getMti0100300String() {
	     return getCharArray(beginMti0100300,MTI_0100300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mti0100300IsNumeric() {
	    return isNumeric(beginMti0100300
	                    ,beginMti0100300 + MTI_0100300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MTI_0100300_LEN = 4;
  	/**
	 * serializeMti0100300
	 */
	protected void serializeMti0100300(int mti0100300) {
		 putNumber(beginMti0100300,mti0100300,MTI_0100300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMti0100300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMti0100300
	 */
   	protected  int serializeMti0100300(char[] value) {
	    int  mti0100300;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mti0100300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginMti0100300
		       ,4
		      );
		 localMti0100300Counter = shareString.getSerializedField().getModifiedCounter();
		return  mti0100300;
    }

   protected int checkMti0100300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMti0100300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMti0100300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMti0100300
			                 ,MTI_0100300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mti0100300", beginMti0100300,MTI_0100300_LEN);
    }
   	}
     int localSf910020300Counter = -1;
     public boolean isSf910020300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf910020300Counter != sharedCounter;
         localSf910020300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSf910020300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localSi994010300Counter = -1;
     public boolean isSi994010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSi994010300Counter != sharedCounter;
         localSi994010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSi994010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
         int localBinary61300Counter = -1;
         public boolean isBinary61300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary61300Counter != sharedCounter;
            localBinary61300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary61300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinary88300Counter = -1;
         public boolean isBinary88300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinary88300Counter != sharedCounter;
            localBinary88300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinary88300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
        int localMaxLines400Counter = -1;
        public boolean isMaxLines400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localMaxLines400Counter != sharedCounter;
           localMaxLines400Counter = sharedCounter; return hasModified; 
        }
	    public boolean maxLines400IsNumeric() {
	      return decimalIsNumeric(beginMaxLines400,MAX_LINES_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int MAX_LINES_400_LEN = 2;
  	/**
	 * 	serializeMaxLines400
	 */
	protected void serializeMaxLines400(int maxLines400) {
		   putDecimal(beginMaxLines400,maxLines400,MAX_LINES_400_LEN,false);
   }
   

   protected int checkMaxLines400MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1000 /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshMaxLines400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMaxLines400() throws CFException {	
   	try { 
		 return (getIntDecimal(beginMaxLines400,MAX_LINES_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("maxLines400", beginMaxLines400,MAX_LINES_400_LEN);
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
   protected static final int PAGE_COUNT_400_LEN = 2;
  	/**
	 * 	serializePageCount400
	 */
	protected void serializePageCount400(int pageCount400) {
		   putDecimal(beginPageCount400,pageCount400,PAGE_COUNT_400_LEN,false);
   }
   

   protected int checkPageCount400MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1000 /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshPageCount400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPageCount400() throws CFException {	
   	try { 
		 return (getIntDecimal(beginPageCount400,PAGE_COUNT_400_LEN));
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
   protected static final int LINE_COUNT_400_LEN = 2;
  	/**
	 * 	serializeLineCount400
	 */
	protected void serializeLineCount400(int lineCount400) {
		   putDecimal(beginLineCount400,lineCount400,LINE_COUNT_400_LEN,false);
   }
   

   protected int checkLineCount400MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1000 /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshLineCount400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLineCount400() throws CFException {	
   	try { 
		 return (getIntDecimal(beginLineCount400,LINE_COUNT_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("lineCount400", beginLineCount400,LINE_COUNT_400_LEN);
     }
   	}
        int localTotalRecs400Counter = -1;
        public boolean isTotalRecs400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTotalRecs400Counter != sharedCounter;
           localTotalRecs400Counter = sharedCounter; return hasModified; 
        }
	    public boolean totalRecs400IsNumeric() {
	      return decimalIsNumeric(beginTotalRecs400,TOTAL_RECS_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TOTAL_RECS_400_LEN = 5;
  	/**
	 * 	serializeTotalRecs400
	 */
	protected void serializeTotalRecs400(long totalRecs400) {
		   putDecimal(beginTotalRecs400,totalRecs400,TOTAL_RECS_400_LEN,false);
   }
   

   protected long checkTotalRecs400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshTotalRecs400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTotalRecs400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTotalRecs400,TOTAL_RECS_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("totalRecs400", beginTotalRecs400,TOTAL_RECS_400_LEN);
     }
   	}
        int localTotalParseErrors400Counter = -1;
        public boolean isTotalParseErrors400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTotalParseErrors400Counter != sharedCounter;
           localTotalParseErrors400Counter = sharedCounter; return hasModified; 
        }
	    public boolean totalParseErrors400IsNumeric() {
	      return decimalIsNumeric(beginTotalParseErrors400,TOTAL_PARSE_ERRORS_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TOTAL_PARSE_ERRORS_400_LEN = 5;
  	/**
	 * 	serializeTotalParseErrors400
	 */
	protected void serializeTotalParseErrors400(long totalParseErrors400) {
		   putDecimal(beginTotalParseErrors400,totalParseErrors400,TOTAL_PARSE_ERRORS_400_LEN,false);
   }
   

   protected long checkTotalParseErrors400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshTotalParseErrors400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTotalParseErrors400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTotalParseErrors400,TOTAL_PARSE_ERRORS_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("totalParseErrors400", beginTotalParseErrors400,TOTAL_PARSE_ERRORS_400_LEN);
     }
   	}
        int localTotalIsoAuth400Counter = -1;
        public boolean isTotalIsoAuth400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTotalIsoAuth400Counter != sharedCounter;
           localTotalIsoAuth400Counter = sharedCounter; return hasModified; 
        }
	    public boolean totalIsoAuth400IsNumeric() {
	      return decimalIsNumeric(beginTotalIsoAuth400,TOTAL_ISO_AUTH_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TOTAL_ISO_AUTH_400_LEN = 5;
  	/**
	 * 	serializeTotalIsoAuth400
	 */
	protected void serializeTotalIsoAuth400(long totalIsoAuth400) {
		   putDecimal(beginTotalIsoAuth400,totalIsoAuth400,TOTAL_ISO_AUTH_400_LEN,false);
   }
   

   protected long checkTotalIsoAuth400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshTotalIsoAuth400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTotalIsoAuth400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTotalIsoAuth400,TOTAL_ISO_AUTH_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("totalIsoAuth400", beginTotalIsoAuth400,TOTAL_ISO_AUTH_400_LEN);
     }
   	}
        int localTotalIaDropped400Counter = -1;
        public boolean isTotalIaDropped400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTotalIaDropped400Counter != sharedCounter;
           localTotalIaDropped400Counter = sharedCounter; return hasModified; 
        }
	    public boolean totalIaDropped400IsNumeric() {
	      return decimalIsNumeric(beginTotalIaDropped400,TOTAL_IA_DROPPED_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TOTAL_IA_DROPPED_400_LEN = 5;
  	/**
	 * 	serializeTotalIaDropped400
	 */
	protected void serializeTotalIaDropped400(long totalIaDropped400) {
		   putDecimal(beginTotalIaDropped400,totalIaDropped400,TOTAL_IA_DROPPED_400_LEN,false);
   }
   

   protected long checkTotalIaDropped400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshTotalIaDropped400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTotalIaDropped400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTotalIaDropped400,TOTAL_IA_DROPPED_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("totalIaDropped400", beginTotalIaDropped400,TOTAL_IA_DROPPED_400_LEN);
     }
   	}
        int localTotalType2400Counter = -1;
        public boolean isTotalType2400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTotalType2400Counter != sharedCounter;
           localTotalType2400Counter = sharedCounter; return hasModified; 
        }
	    public boolean totalType2400IsNumeric() {
	      return decimalIsNumeric(beginTotalType2400,TOTAL_TYPE_2400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TOTAL_TYPE_2400_LEN = 5;
  	/**
	 * 	serializeTotalType2400
	 */
	protected void serializeTotalType2400(long totalType2400) {
		   putDecimal(beginTotalType2400,totalType2400,TOTAL_TYPE_2400_LEN,false);
   }
   

   protected long checkTotalType2400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshTotalType2400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTotalType2400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTotalType2400,TOTAL_TYPE_2400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("totalType2400", beginTotalType2400,TOTAL_TYPE_2400_LEN);
     }
   	}
        int localTotalType3400Counter = -1;
        public boolean isTotalType3400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTotalType3400Counter != sharedCounter;
           localTotalType3400Counter = sharedCounter; return hasModified; 
        }
	    public boolean totalType3400IsNumeric() {
	      return decimalIsNumeric(beginTotalType3400,TOTAL_TYPE_3400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TOTAL_TYPE_3400_LEN = 5;
  	/**
	 * 	serializeTotalType3400
	 */
	protected void serializeTotalType3400(long totalType3400) {
		   putDecimal(beginTotalType3400,totalType3400,TOTAL_TYPE_3400_LEN,false);
   }
   

   protected long checkTotalType3400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshTotalType3400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTotalType3400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTotalType3400,TOTAL_TYPE_3400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("totalType3400", beginTotalType3400,TOTAL_TYPE_3400_LEN);
     }
   	}
        int localTotal0120Adv400Counter = -1;
        public boolean isTotal0120Adv400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTotal0120Adv400Counter != sharedCounter;
           localTotal0120Adv400Counter = sharedCounter; return hasModified; 
        }
	    public boolean total0120Adv400IsNumeric() {
	      return decimalIsNumeric(beginTotal0120Adv400,TOTAL_0120_ADV_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TOTAL_0120_ADV_400_LEN = 5;
  	/**
	 * 	serializeTotal0120Adv400
	 */
	protected void serializeTotal0120Adv400(long total0120Adv400) {
		   putDecimal(beginTotal0120Adv400,total0120Adv400,TOTAL_0120_ADV_400_LEN,false);
   }
   

   protected long checkTotal0120Adv400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshTotal0120Adv400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTotal0120Adv400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTotal0120Adv400,TOTAL_0120_ADV_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("total0120Adv400", beginTotal0120Adv400,TOTAL_0120_ADV_400_LEN);
     }
   	}
        int localTotalRevAdv400Counter = -1;
        public boolean isTotalRevAdv400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTotalRevAdv400Counter != sharedCounter;
           localTotalRevAdv400Counter = sharedCounter; return hasModified; 
        }
	    public boolean totalRevAdv400IsNumeric() {
	      return decimalIsNumeric(beginTotalRevAdv400,TOTAL_REV_ADV_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TOTAL_REV_ADV_400_LEN = 5;
  	/**
	 * 	serializeTotalRevAdv400
	 */
	protected void serializeTotalRevAdv400(long totalRevAdv400) {
		   putDecimal(beginTotalRevAdv400,totalRevAdv400,TOTAL_REV_ADV_400_LEN,false);
   }
   

   protected long checkTotalRevAdv400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshTotalRevAdv400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTotalRevAdv400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTotalRevAdv400,TOTAL_REV_ADV_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("totalRevAdv400", beginTotalRevAdv400,TOTAL_REV_ADV_400_LEN);
     }
   	}
        int localTotalVer2400Counter = -1;
        public boolean isTotalVer2400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTotalVer2400Counter != sharedCounter;
           localTotalVer2400Counter = sharedCounter; return hasModified; 
        }
	    public boolean totalVer2400IsNumeric() {
	      return decimalIsNumeric(beginTotalVer2400,TOTAL_VER_2400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TOTAL_VER_2400_LEN = 5;
  	/**
	 * 	serializeTotalVer2400
	 */
	protected void serializeTotalVer2400(long totalVer2400) {
		   putDecimal(beginTotalVer2400,totalVer2400,TOTAL_VER_2400_LEN,false);
   }
   

   protected long checkTotalVer2400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshTotalVer2400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTotalVer2400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTotalVer2400,TOTAL_VER_2400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("totalVer2400", beginTotalVer2400,TOTAL_VER_2400_LEN);
     }
   	}
        int localTotalBadPan400Counter = -1;
        public boolean isTotalBadPan400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTotalBadPan400Counter != sharedCounter;
           localTotalBadPan400Counter = sharedCounter; return hasModified; 
        }
	    public boolean totalBadPan400IsNumeric() {
	      return decimalIsNumeric(beginTotalBadPan400,TOTAL_BAD_PAN_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TOTAL_BAD_PAN_400_LEN = 5;
  	/**
	 * 	serializeTotalBadPan400
	 */
	protected void serializeTotalBadPan400(long totalBadPan400) {
		   putDecimal(beginTotalBadPan400,totalBadPan400,TOTAL_BAD_PAN_400_LEN,false);
   }
   

   protected long checkTotalBadPan400MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshTotalBadPan400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTotalBadPan400() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTotalBadPan400,TOTAL_BAD_PAN_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("totalBadPan400", beginTotalBadPan400,TOTAL_BAD_PAN_400_LEN);
     }
   	}
         int localAvs2RecCount400Counter = -1;
         public boolean isAvs2RecCount400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAvs2RecCount400Counter != sharedCounter;
            localAvs2RecCount400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkAvs2RecCount400MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
        int localSe42Lnth400Counter = -1;
        public boolean isSe42Lnth400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSe42Lnth400Counter != sharedCounter;
           localSe42Lnth400Counter = sharedCounter; return hasModified; 
        }
	    public boolean se42Lnth400IsNumeric() {
	      return decimalIsNumeric(beginSe42Lnth400,SE_42_LNTH_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SE_42_LNTH_400_LEN = 2;
  	/**
	 * 	serializeSe42Lnth400
	 */
	protected void serializeSe42Lnth400(int se42Lnth400) {
		   putDecimal(beginSe42Lnth400,se42Lnth400,SE_42_LNTH_400_LEN,false);
   }
   

   protected int checkSe42Lnth400MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1000 /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshSe42Lnth400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSe42Lnth400() throws CFException {	
   	try { 
		 return (getIntDecimal(beginSe42Lnth400,SE_42_LNTH_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("se42Lnth400", beginSe42Lnth400,SE_42_LNTH_400_LEN);
     }
   	}
        int localSe42Pos400Counter = -1;
        public boolean isSe42Pos400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSe42Pos400Counter != sharedCounter;
           localSe42Pos400Counter = sharedCounter; return hasModified; 
        }
	    public boolean se42Pos400IsNumeric() {
	      return decimalIsNumeric(beginSe42Pos400,SE_42_POS_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SE_42_POS_400_LEN = 2;
  	/**
	 * 	serializeSe42Pos400
	 */
	protected void serializeSe42Pos400(int se42Pos400) {
		   putDecimal(beginSe42Pos400,se42Pos400,SE_42_POS_400_LEN,false);
   }
   

   protected int checkSe42Pos400MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1000 /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshSe42Pos400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSe42Pos400() throws CFException {	
   	try { 
		 return (getIntDecimal(beginSe42Pos400,SE_42_POS_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("se42Pos400", beginSe42Pos400,SE_42_POS_400_LEN);
     }
   	}
        int localSe33Pos400Counter = -1;
        public boolean isSe33Pos400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSe33Pos400Counter != sharedCounter;
           localSe33Pos400Counter = sharedCounter; return hasModified; 
        }
	    public boolean se33Pos400IsNumeric() {
	      return decimalIsNumeric(beginSe33Pos400,SE_33_POS_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SE_33_POS_400_LEN = 2;
  	/**
	 * 	serializeSe33Pos400
	 */
	protected void serializeSe33Pos400(int se33Pos400) {
		   putDecimal(beginSe33Pos400,se33Pos400,SE_33_POS_400_LEN,false);
   }
   

   protected int checkSe33Pos400MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1000 /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshSe33Pos400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSe33Pos400() throws CFException {	
   	try { 
		 return (getIntDecimal(beginSe33Pos400,SE_33_POS_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("se33Pos400", beginSe33Pos400,SE_33_POS_400_LEN);
     }
   	}
        int localSe24Pos400Counter = -1;
        public boolean isSe24Pos400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSe24Pos400Counter != sharedCounter;
           localSe24Pos400Counter = sharedCounter; return hasModified; 
        }
	    public boolean se24Pos400IsNumeric() {
	      return decimalIsNumeric(beginSe24Pos400,SE_24_POS_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SE_24_POS_400_LEN = 2;
  	/**
	 * 	serializeSe24Pos400
	 */
	protected void serializeSe24Pos400(short se24Pos400) {
		   putDecimal(beginSe24Pos400,se24Pos400,SE_24_POS_400_LEN,true);
   }
   

   protected short checkSe24Pos400MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshSe24Pos400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSe24Pos400() throws CFException {	
   	try { 
		 return (getShortDecimal(beginSe24Pos400,SE_24_POS_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("se24Pos400", beginSe24Pos400,SE_24_POS_400_LEN);
     }
   	}
        int localSe66Pos400Counter = -1;
        public boolean isSe66Pos400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSe66Pos400Counter != sharedCounter;
           localSe66Pos400Counter = sharedCounter; return hasModified; 
        }
	    public boolean se66Pos400IsNumeric() {
	      return decimalIsNumeric(beginSe66Pos400,SE_66_POS_400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SE_66_POS_400_LEN = 2;
  	/**
	 * 	serializeSe66Pos400
	 */
	protected void serializeSe66Pos400(short se66Pos400) {
		   putDecimal(beginSe66Pos400,se66Pos400,SE_66_POS_400_LEN,true);
   }
   

   protected short checkSe66Pos400MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshSe66Pos400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSe66Pos400() throws CFException {	
   	try { 
		 return (getShortDecimal(beginSe66Pos400,SE_66_POS_400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("se66Pos400", beginSe66Pos400,SE_66_POS_400_LEN);
     }
   	}
     int localDe48Se42Sf2Sf3500Counter = -1;
     public boolean isDe48Se42Sf2Sf3500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe48Se42Sf2Sf3500Counter != sharedCounter;
         localDe48Se42Sf2Sf3500Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDe48Se42Sf2Sf3500Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localDe48Se89500Counter = -1;
     public boolean isDe48Se89500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe48Se89500Counter != sharedCounter;
         localDe48Se89500Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDe48Se89500Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localDe48Se33SfId500Counter = -1;
     public boolean isDe48Se33SfId500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe48Se33SfId500Counter != sharedCounter;
         localDe48Se33SfId500Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDe48Se33SfId500Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localDe48Se33SfLen500Counter = -1;
     public boolean isDe48Se33SfLen500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe48Se33SfLen500Counter != sharedCounter;
         localDe48Se33SfLen500Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of de48Se33SfLen500
	 *	@return de48Se33SfLen500
	 */
	public char[]  getDe48Se33SfLen500String() {
	     return getCharArray(beginDe48Se33SfLen500,DE_48_SE_33_SF_LEN_500_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean de48Se33SfLen500IsNumeric() {
	    return isNumeric(beginDe48Se33SfLen500
	                    ,beginDe48Se33SfLen500 + DE_48_SE_33_SF_LEN_500_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DE_48_SE_33_SF_LEN_500_LEN = 2;
  	/**
	 * serializeDe48Se33SfLen500
	 */
	protected void serializeDe48Se33SfLen500(int de48Se33SfLen500) {
		 putNumber(beginDe48Se33SfLen500,de48Se33SfLen500,DE_48_SE_33_SF_LEN_500_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDe48Se33SfLen500Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDe48Se33SfLen500
	 */
   	protected  int serializeDe48Se33SfLen500(char[] value) {
	    int  de48Se33SfLen500;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    de48Se33SfLen500 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginDe48Se33SfLen500
		       ,2
		      );
		 localDe48Se33SfLen500Counter = shareString.getSerializedField().getModifiedCounter();
		return  de48Se33SfLen500;
    }

   protected int checkDe48Se33SfLen500MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDe48Se33SfLen500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDe48Se33SfLen500() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDe48Se33SfLen500
			                 ,DE_48_SE_33_SF_LEN_500_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("de48Se33SfLen500", beginDe48Se33SfLen500,DE_48_SE_33_SF_LEN_500_LEN);
    }
   	}
     int localDe48Se42SfLen500Counter = -1;
     public boolean isDe48Se42SfLen500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe48Se42SfLen500Counter != sharedCounter;
         localDe48Se42SfLen500Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of de48Se42SfLen500
	 *	@return de48Se42SfLen500
	 */
	public char[]  getDe48Se42SfLen500String() {
	     return getCharArray(beginDe48Se42SfLen500,DE_48_SE_42_SF_LEN_500_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean de48Se42SfLen500IsNumeric() {
	    return isNumeric(beginDe48Se42SfLen500
	                    ,beginDe48Se42SfLen500 + DE_48_SE_42_SF_LEN_500_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DE_48_SE_42_SF_LEN_500_LEN = 2;
  	/**
	 * serializeDe48Se42SfLen500
	 */
	protected void serializeDe48Se42SfLen500(int de48Se42SfLen500) {
		 putNumber(beginDe48Se42SfLen500,de48Se42SfLen500,DE_48_SE_42_SF_LEN_500_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDe48Se42SfLen500Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDe48Se42SfLen500
	 */
   	protected  int serializeDe48Se42SfLen500(char[] value) {
	    int  de48Se42SfLen500;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    de48Se42SfLen500 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginDe48Se42SfLen500
		       ,2
		      );
		 localDe48Se42SfLen500Counter = shareString.getSerializedField().getModifiedCounter();
		return  de48Se42SfLen500;
    }

   protected int checkDe48Se42SfLen500MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDe48Se42SfLen500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDe48Se42SfLen500() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDe48Se42SfLen500
			                 ,DE_48_SE_42_SF_LEN_500_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("de48Se42SfLen500", beginDe48Se42SfLen500,DE_48_SE_42_SF_LEN_500_LEN);
    }
   	}
     int localDe48Se42SfLen1500Counter = -1;
     public boolean isDe48Se42SfLen1500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe48Se42SfLen1500Counter != sharedCounter;
         localDe48Se42SfLen1500Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of de48Se42SfLen1500
	 *	@return de48Se42SfLen1500
	 */
	public char[]  getDe48Se42SfLen1500String() {
	     return getCharArray(beginDe48Se42SfLen1500,DE_48_SE_42_SF_LEN_1500_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean de48Se42SfLen1500IsNumeric() {
	    return isNumeric(beginDe48Se42SfLen1500
	                    ,beginDe48Se42SfLen1500 + DE_48_SE_42_SF_LEN_1500_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DE_48_SE_42_SF_LEN_1500_LEN = 2;
  	/**
	 * serializeDe48Se42SfLen1500
	 */
	protected void serializeDe48Se42SfLen1500(int de48Se42SfLen1500) {
		 putNumber(beginDe48Se42SfLen1500,de48Se42SfLen1500,DE_48_SE_42_SF_LEN_1500_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDe48Se42SfLen1500Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDe48Se42SfLen1500
	 */
   	protected  int serializeDe48Se42SfLen1500(char[] value) {
	    int  de48Se42SfLen1500;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    de48Se42SfLen1500 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginDe48Se42SfLen1500
		       ,2
		      );
		 localDe48Se42SfLen1500Counter = shareString.getSerializedField().getModifiedCounter();
		return  de48Se42SfLen1500;
    }

   protected int checkDe48Se42SfLen1500MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDe48Se42SfLen1500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDe48Se42SfLen1500() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDe48Se42SfLen1500
			                 ,DE_48_SE_42_SF_LEN_1500_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("de48Se42SfLen1500", beginDe48Se42SfLen1500,DE_48_SE_42_SF_LEN_1500_LEN);
    }
   	}
     int localDe48Se66SfId500Counter = -1;
     public boolean isDe48Se66SfId500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe48Se66SfId500Counter != sharedCounter;
         localDe48Se66SfId500Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDe48Se66SfId500Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localDe48Se24SfId500Counter = -1;
     public boolean isDe48Se24SfId500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe48Se24SfId500Counter != sharedCounter;
         localDe48Se24SfId500Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDe48Se24SfId500Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localBilllogMsg1600Counter = -1;
     public boolean isBilllogMsg1600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBilllogMsg1600Counter != sharedCounter;
         localBilllogMsg1600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBilllogMsg1600Constraints(char[] value) {
   			return super.checkConstraints(value , 27 ,false, false);
   }
     int localBilllogMsg2600Counter = -1;
     public boolean isBilllogMsg2600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBilllogMsg2600Counter != sharedCounter;
         localBilllogMsg2600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBilllogMsg2600Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
     int localBilllogMsg3600Counter = -1;
     public boolean isBilllogMsg3600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBilllogMsg3600Counter != sharedCounter;
         localBilllogMsg3600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBilllogMsg3600Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
     int localBilllogMsg4600Counter = -1;
     public boolean isBilllogMsg4600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBilllogMsg4600Counter != sharedCounter;
         localBilllogMsg4600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBilllogMsg4600Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
     int localVoiceMsg600Counter = -1;
     public boolean isVoiceMsg600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVoiceMsg600Counter != sharedCounter;
         localVoiceMsg600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkVoiceMsg600Constraints(char[] value) {
   			return super.checkConstraints(value , 39 ,false, false);
   }
     int localParmsMsg600Counter = -1;
     public boolean isParmsMsg600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmsMsg600Counter != sharedCounter;
         localParmsMsg600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkParmsMsg600Constraints(char[] value) {
   			return super.checkConstraints(value , 36 ,false, false);
   }
     int localCycleMsg600Counter = -1;
     public boolean isCycleMsg600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCycleMsg600Counter != sharedCounter;
         localCycleMsg600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCycleMsg600Constraints(char[] value) {
   			return super.checkConstraints(value , 38 ,false, false);
   }
     int localMcwinMsg1600Counter = -1;
     public boolean isMcwinMsg1600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcwinMsg1600Counter != sharedCounter;
         localMcwinMsg1600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMcwinMsg1600Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localMcwinMsg2600Counter = -1;
     public boolean isMcwinMsg2600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcwinMsg2600Counter != sharedCounter;
         localMcwinMsg2600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMcwinMsg2600Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
     int localEojMessage650Counter = -1;
     public boolean isEojMessage650Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEojMessage650Counter != sharedCounter;
         localEojMessage650Counter = sharedCounter; return hasModified;
     }

   protected char[] checkEojMessage650Constraints(char[] value) {
   			return super.checkConstraints(value , 64 ,false, false);
   }
         int localLogLen800Counter = -1;
         public boolean isLogLen800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLogLen800Counter != sharedCounter;
            localLogLen800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkLogLen800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localMti800Counter = -1;
     public boolean isMti800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMti800Counter != sharedCounter;
         localMti800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMti800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localHoldCurrCc800Counter = -1;
     public boolean isHoldCurrCc800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHoldCurrCc800Counter != sharedCounter;
         localHoldCurrCc800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of holdCurrCc800
	 *	@return holdCurrCc800
	 */
	public char[]  getHoldCurrCc800String() {
	     return getCharArray(beginHoldCurrCc800,HOLD_CURR_CC_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean holdCurrCc800IsNumeric() {
	    return isNumeric(beginHoldCurrCc800
	                    ,beginHoldCurrCc800 + HOLD_CURR_CC_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int HOLD_CURR_CC_800_LEN = 2;
  	/**
	 * serializeHoldCurrCc800
	 */
	protected void serializeHoldCurrCc800(int holdCurrCc800) {
		 putNumber(beginHoldCurrCc800,holdCurrCc800,HOLD_CURR_CC_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localHoldCurrCc800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeHoldCurrCc800
	 */
   	protected  int serializeHoldCurrCc800(char[] value) {
	    int  holdCurrCc800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    holdCurrCc800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginHoldCurrCc800
		       ,2
		      );
		 localHoldCurrCc800Counter = shareString.getSerializedField().getModifiedCounter();
		return  holdCurrCc800;
    }

   protected int checkHoldCurrCc800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshHoldCurrCc800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshHoldCurrCc800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginHoldCurrCc800
			                 ,HOLD_CURR_CC_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("holdCurrCc800", beginHoldCurrCc800,HOLD_CURR_CC_800_LEN);
    }
   	}
     int localObscureData800Counter = -1;
     public boolean isObscureData800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localObscureData800Counter != sharedCounter;
         localObscureData800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkObscureData800Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
     int localObscurePos800Counter = -1;
     public boolean isObscurePos800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localObscurePos800Counter != sharedCounter;
         localObscurePos800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of obscurePos800
	 *	@return obscurePos800
	 */
	public char[]  getObscurePos800String() {
	     return getCharArray(beginObscurePos800,OBSCURE_POS_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean obscurePos800IsNumeric() {
	    return isNumeric(beginObscurePos800
	                    ,beginObscurePos800 + OBSCURE_POS_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OBSCURE_POS_800_LEN = 3;
  	/**
	 * serializeObscurePos800
	 */
	protected void serializeObscurePos800(int obscurePos800) {
		 putNumber(beginObscurePos800,obscurePos800,OBSCURE_POS_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localObscurePos800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeObscurePos800
	 */
   	protected  int serializeObscurePos800(char[] value) {
	    int  obscurePos800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    obscurePos800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginObscurePos800
		       ,3
		      );
		 localObscurePos800Counter = shareString.getSerializedField().getModifiedCounter();
		return  obscurePos800;
    }

   protected int checkObscurePos800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshObscurePos800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshObscurePos800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginObscurePos800
			                 ,OBSCURE_POS_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("obscurePos800", beginObscurePos800,OBSCURE_POS_800_LEN);
    }
   	}
     int localObscurePos2800Counter = -1;
     public boolean isObscurePos2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localObscurePos2800Counter != sharedCounter;
         localObscurePos2800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of obscurePos2800
	 *	@return obscurePos2800
	 */
	public char[]  getObscurePos2800String() {
	     return getCharArray(beginObscurePos2800,OBSCURE_POS_2800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean obscurePos2800IsNumeric() {
	    return isNumeric(beginObscurePos2800
	                    ,beginObscurePos2800 + OBSCURE_POS_2800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OBSCURE_POS_2800_LEN = 3;
  	/**
	 * serializeObscurePos2800
	 */
	protected void serializeObscurePos2800(int obscurePos2800) {
		 putNumber(beginObscurePos2800,obscurePos2800,OBSCURE_POS_2800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localObscurePos2800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeObscurePos2800
	 */
   	protected  int serializeObscurePos2800(char[] value) {
	    int  obscurePos2800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    obscurePos2800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginObscurePos2800
		       ,3
		      );
		 localObscurePos2800Counter = shareString.getSerializedField().getModifiedCounter();
		return  obscurePos2800;
    }

   protected int checkObscurePos2800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshObscurePos2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshObscurePos2800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginObscurePos2800
			                 ,OBSCURE_POS_2800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("obscurePos2800", beginObscurePos2800,OBSCURE_POS_2800_LEN);
    }
   	}
     int localObscureStartPos800Counter = -1;
     public boolean isObscureStartPos800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localObscureStartPos800Counter != sharedCounter;
         localObscureStartPos800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of obscureStartPos800
	 *	@return obscureStartPos800
	 */
	public char[]  getObscureStartPos800String() {
	     return getCharArray(beginObscureStartPos800,OBSCURE_START_POS_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean obscureStartPos800IsNumeric() {
	    return isNumeric(beginObscureStartPos800
	                    ,beginObscureStartPos800 + OBSCURE_START_POS_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OBSCURE_START_POS_800_LEN = 3;
  	/**
	 * serializeObscureStartPos800
	 */
	protected void serializeObscureStartPos800(int obscureStartPos800) {
		 putNumber(beginObscureStartPos800,obscureStartPos800,OBSCURE_START_POS_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localObscureStartPos800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeObscureStartPos800
	 */
   	protected  int serializeObscureStartPos800(char[] value) {
	    int  obscureStartPos800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    obscureStartPos800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginObscureStartPos800
		       ,3
		      );
		 localObscureStartPos800Counter = shareString.getSerializedField().getModifiedCounter();
		return  obscureStartPos800;
    }

   protected int checkObscureStartPos800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshObscureStartPos800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshObscureStartPos800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginObscureStartPos800
			                 ,OBSCURE_START_POS_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("obscureStartPos800", beginObscureStartPos800,OBSCURE_START_POS_800_LEN);
    }
   	}
     int localObscureEndPos800Counter = -1;
     public boolean isObscureEndPos800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localObscureEndPos800Counter != sharedCounter;
         localObscureEndPos800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of obscureEndPos800
	 *	@return obscureEndPos800
	 */
	public char[]  getObscureEndPos800String() {
	     return getCharArray(beginObscureEndPos800,OBSCURE_END_POS_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean obscureEndPos800IsNumeric() {
	    return isNumeric(beginObscureEndPos800
	                    ,beginObscureEndPos800 + OBSCURE_END_POS_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OBSCURE_END_POS_800_LEN = 3;
  	/**
	 * serializeObscureEndPos800
	 */
	protected void serializeObscureEndPos800(int obscureEndPos800) {
		 putNumber(beginObscureEndPos800,obscureEndPos800,OBSCURE_END_POS_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localObscureEndPos800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeObscureEndPos800
	 */
   	protected  int serializeObscureEndPos800(char[] value) {
	    int  obscureEndPos800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    obscureEndPos800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginObscureEndPos800
		       ,3
		      );
		 localObscureEndPos800Counter = shareString.getSerializedField().getModifiedCounter();
		return  obscureEndPos800;
    }

   protected int checkObscureEndPos800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshObscureEndPos800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshObscureEndPos800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginObscureEndPos800
			                 ,OBSCURE_END_POS_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("obscureEndPos800", beginObscureEndPos800,OBSCURE_END_POS_800_LEN);
    }
   	}
     int localObscureLgth800Counter = -1;
     public boolean isObscureLgth800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localObscureLgth800Counter != sharedCounter;
         localObscureLgth800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of obscureLgth800
	 *	@return obscureLgth800
	 */
	public char[]  getObscureLgth800String() {
	     return getCharArray(beginObscureLgth800,OBSCURE_LGTH_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean obscureLgth800IsNumeric() {
	    return isNumeric(beginObscureLgth800
	                    ,beginObscureLgth800 + OBSCURE_LGTH_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OBSCURE_LGTH_800_LEN = 3;
  	/**
	 * serializeObscureLgth800
	 */
	protected void serializeObscureLgth800(int obscureLgth800) {
		 putNumber(beginObscureLgth800,obscureLgth800,OBSCURE_LGTH_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localObscureLgth800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeObscureLgth800
	 */
   	protected  int serializeObscureLgth800(char[] value) {
	    int  obscureLgth800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    obscureLgth800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginObscureLgth800
		       ,3
		      );
		 localObscureLgth800Counter = shareString.getSerializedField().getModifiedCounter();
		return  obscureLgth800;
    }

   protected int checkObscureLgth800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshObscureLgth800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshObscureLgth800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginObscureLgth800
			                 ,OBSCURE_LGTH_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("obscureLgth800", beginObscureLgth800,OBSCURE_LGTH_800_LEN);
    }
   	}
     int localHour800Counter = -1;
     public boolean isHour800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHour800Counter != sharedCounter;
         localHour800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of hour800
	 *	@return hour800
	 */
	public char[]  getHour800String() {
	     return getCharArray(beginHour800,HOUR_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean hour800IsNumeric() {
	    return isNumeric(beginHour800
	                    ,beginHour800 + HOUR_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int HOUR_800_LEN = 2;
  	/**
	 * serializeHour800
	 */
	protected void serializeHour800(int hour800) {
		 putNumber(beginHour800,hour800,HOUR_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localHour800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeHour800
	 */
   	protected  int serializeHour800(char[] value) {
	    int  hour800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    hour800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginHour800
		       ,2
		      );
		 localHour800Counter = shareString.getSerializedField().getModifiedCounter();
		return  hour800;
    }

   protected int checkHour800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshHour800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshHour800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginHour800
			                 ,HOUR_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("hour800", beginHour800,HOUR_800_LEN);
    }
   	}
     int localMin800Counter = -1;
     public boolean isMin800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMin800Counter != sharedCounter;
         localMin800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of min800
	 *	@return min800
	 */
	public char[]  getMin800String() {
	     return getCharArray(beginMin800,MIN_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean min800IsNumeric() {
	    return isNumeric(beginMin800
	                    ,beginMin800 + MIN_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MIN_800_LEN = 2;
  	/**
	 * serializeMin800
	 */
	protected void serializeMin800(int min800) {
		 putNumber(beginMin800,min800,MIN_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMin800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMin800
	 */
   	protected  int serializeMin800(char[] value) {
	    int  min800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    min800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMin800
		       ,2
		      );
		 localMin800Counter = shareString.getSerializedField().getModifiedCounter();
		return  min800;
    }

   protected int checkMin800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMin800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMin800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMin800
			                 ,MIN_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("min800", beginMin800,MIN_800_LEN);
    }
   	}
     int localSec800Counter = -1;
     public boolean isSec800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSec800Counter != sharedCounter;
         localSec800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sec800
	 *	@return sec800
	 */
	public char[]  getSec800String() {
	     return getCharArray(beginSec800,SEC_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sec800IsNumeric() {
	    return isNumeric(beginSec800
	                    ,beginSec800 + SEC_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SEC_800_LEN = 2;
  	/**
	 * serializeSec800
	 */
	protected void serializeSec800(int sec800) {
		 putNumber(beginSec800,sec800,SEC_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSec800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSec800
	 */
   	protected  int serializeSec800(char[] value) {
	    int  sec800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sec800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginSec800
		       ,2
		      );
		 localSec800Counter = shareString.getSerializedField().getModifiedCounter();
		return  sec800;
    }

   protected int checkSec800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSec800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSec800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSec800
			                 ,SEC_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sec800", beginSec800,SEC_800_LEN);
    }
   	}
     int localIsoBlResponse1800Counter = -1;
     public boolean isIsoBlResponse1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsoBlResponse1800Counter != sharedCounter;
         localIsoBlResponse1800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of isoBlResponse1800
	 *	@return isoBlResponse1800
	 */
	public char[]  getIsoBlResponse1800String() {
	     return getCharArray(beginIsoBlResponse1800,ISO_BL_RESPONSE_1800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean isoBlResponse1800IsNumeric() {
	    return isNumeric(beginIsoBlResponse1800
	                    ,beginIsoBlResponse1800 + ISO_BL_RESPONSE_1800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ISO_BL_RESPONSE_1800_LEN = 1;
  	/**
	 * serializeIsoBlResponse1800
	 */
	protected void serializeIsoBlResponse1800(int isoBlResponse1800) {
		 putNumber(beginIsoBlResponse1800,isoBlResponse1800,ISO_BL_RESPONSE_1800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIsoBlResponse1800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIsoBlResponse1800
	 */
   	protected  int serializeIsoBlResponse1800(char[] value) {
	    int  isoBlResponse1800;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    isoBlResponse1800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIsoBlResponse1800
		       ,1
		      );
		 localIsoBlResponse1800Counter = shareString.getSerializedField().getModifiedCounter();
		return  isoBlResponse1800;
    }

   protected int checkIsoBlResponse1800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIsoBlResponse1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIsoBlResponse1800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIsoBlResponse1800
			                 ,ISO_BL_RESPONSE_1800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("isoBlResponse1800", beginIsoBlResponse1800,ISO_BL_RESPONSE_1800_LEN);
    }
   	}
     int localIsoBlResponse2800Counter = -1;
     public boolean isIsoBlResponse2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsoBlResponse2800Counter != sharedCounter;
         localIsoBlResponse2800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of isoBlResponse2800
	 *	@return isoBlResponse2800
	 */
	public char[]  getIsoBlResponse2800String() {
	     return getCharArray(beginIsoBlResponse2800,ISO_BL_RESPONSE_2800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean isoBlResponse2800IsNumeric() {
	    return isNumeric(beginIsoBlResponse2800
	                    ,beginIsoBlResponse2800 + ISO_BL_RESPONSE_2800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ISO_BL_RESPONSE_2800_LEN = 1;
  	/**
	 * serializeIsoBlResponse2800
	 */
	protected void serializeIsoBlResponse2800(int isoBlResponse2800) {
		 putNumber(beginIsoBlResponse2800,isoBlResponse2800,ISO_BL_RESPONSE_2800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIsoBlResponse2800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIsoBlResponse2800
	 */
   	protected  int serializeIsoBlResponse2800(char[] value) {
	    int  isoBlResponse2800;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    isoBlResponse2800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIsoBlResponse2800
		       ,1
		      );
		 localIsoBlResponse2800Counter = shareString.getSerializedField().getModifiedCounter();
		return  isoBlResponse2800;
    }

   protected int checkIsoBlResponse2800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIsoBlResponse2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIsoBlResponse2800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIsoBlResponse2800
			                 ,ISO_BL_RESPONSE_2800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("isoBlResponse2800", beginIsoBlResponse2800,ISO_BL_RESPONSE_2800_LEN);
    }
   	}
     int localIsoBlDown1800Counter = -1;
     public boolean isIsoBlDown1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsoBlDown1800Counter != sharedCounter;
         localIsoBlDown1800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of isoBlDown1800
	 *	@return isoBlDown1800
	 */
	public char[]  getIsoBlDown1800String() {
	     return getCharArray(beginIsoBlDown1800,ISO_BL_DOWN_1800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean isoBlDown1800IsNumeric() {
	    return isNumeric(beginIsoBlDown1800
	                    ,beginIsoBlDown1800 + ISO_BL_DOWN_1800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ISO_BL_DOWN_1800_LEN = 1;
  	/**
	 * serializeIsoBlDown1800
	 */
	protected void serializeIsoBlDown1800(int isoBlDown1800) {
		 putNumber(beginIsoBlDown1800,isoBlDown1800,ISO_BL_DOWN_1800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIsoBlDown1800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIsoBlDown1800
	 */
   	protected  int serializeIsoBlDown1800(char[] value) {
	    int  isoBlDown1800;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    isoBlDown1800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIsoBlDown1800
		       ,1
		      );
		 localIsoBlDown1800Counter = shareString.getSerializedField().getModifiedCounter();
		return  isoBlDown1800;
    }

   protected int checkIsoBlDown1800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIsoBlDown1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIsoBlDown1800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIsoBlDown1800
			                 ,ISO_BL_DOWN_1800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("isoBlDown1800", beginIsoBlDown1800,ISO_BL_DOWN_1800_LEN);
    }
   	}
     int localIsoBlDown2800Counter = -1;
     public boolean isIsoBlDown2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsoBlDown2800Counter != sharedCounter;
         localIsoBlDown2800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of isoBlDown2800
	 *	@return isoBlDown2800
	 */
	public char[]  getIsoBlDown2800String() {
	     return getCharArray(beginIsoBlDown2800,ISO_BL_DOWN_2800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean isoBlDown2800IsNumeric() {
	    return isNumeric(beginIsoBlDown2800
	                    ,beginIsoBlDown2800 + ISO_BL_DOWN_2800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ISO_BL_DOWN_2800_LEN = 1;
  	/**
	 * serializeIsoBlDown2800
	 */
	protected void serializeIsoBlDown2800(int isoBlDown2800) {
		 putNumber(beginIsoBlDown2800,isoBlDown2800,ISO_BL_DOWN_2800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIsoBlDown2800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIsoBlDown2800
	 */
   	protected  int serializeIsoBlDown2800(char[] value) {
	    int  isoBlDown2800;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    isoBlDown2800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIsoBlDown2800
		       ,1
		      );
		 localIsoBlDown2800Counter = shareString.getSerializedField().getModifiedCounter();
		return  isoBlDown2800;
    }

   protected int checkIsoBlDown2800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIsoBlDown2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIsoBlDown2800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIsoBlDown2800
			                 ,ISO_BL_DOWN_2800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("isoBlDown2800", beginIsoBlDown2800,ISO_BL_DOWN_2800_LEN);
    }
   	}
     int localIsoBlMoto1800Counter = -1;
     public boolean isIsoBlMoto1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsoBlMoto1800Counter != sharedCounter;
         localIsoBlMoto1800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of isoBlMoto1800
	 *	@return isoBlMoto1800
	 */
	public char[]  getIsoBlMoto1800String() {
	     return getCharArray(beginIsoBlMoto1800,ISO_BL_MOTO_1800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean isoBlMoto1800IsNumeric() {
	    return isNumeric(beginIsoBlMoto1800
	                    ,beginIsoBlMoto1800 + ISO_BL_MOTO_1800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ISO_BL_MOTO_1800_LEN = 1;
  	/**
	 * serializeIsoBlMoto1800
	 */
	protected void serializeIsoBlMoto1800(int isoBlMoto1800) {
		 putNumber(beginIsoBlMoto1800,isoBlMoto1800,ISO_BL_MOTO_1800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIsoBlMoto1800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIsoBlMoto1800
	 */
   	protected  int serializeIsoBlMoto1800(char[] value) {
	    int  isoBlMoto1800;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    isoBlMoto1800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIsoBlMoto1800
		       ,1
		      );
		 localIsoBlMoto1800Counter = shareString.getSerializedField().getModifiedCounter();
		return  isoBlMoto1800;
    }

   protected int checkIsoBlMoto1800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIsoBlMoto1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIsoBlMoto1800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIsoBlMoto1800
			                 ,ISO_BL_MOTO_1800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("isoBlMoto1800", beginIsoBlMoto1800,ISO_BL_MOTO_1800_LEN);
    }
   	}
     int localMciwinReturnCodeCounter = -1;
     public boolean isMciwinReturnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciwinReturnCodeCounter != sharedCounter;
         localMciwinReturnCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mciwinReturnCode
	 *	@return mciwinReturnCode
	 */
	public char[]  getMciwinReturnCodeString() {
	     return getCharArray(beginMciwinReturnCode,MCIWIN_RETURN_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mciwinReturnCodeIsNumeric() {
	    return isNumeric(beginMciwinReturnCode
	                    ,beginMciwinReturnCode + MCIWIN_RETURN_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MCIWIN_RETURN_CODE_LEN = 4;
  	/**
	 * serializeMciwinReturnCode
	 */
	protected void serializeMciwinReturnCode(int mciwinReturnCode) {
		 putNumber(beginMciwinReturnCode,mciwinReturnCode,MCIWIN_RETURN_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMciwinReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMciwinReturnCode
	 */
   	protected  int serializeMciwinReturnCode(char[] value) {
	    int  mciwinReturnCode;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mciwinReturnCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginMciwinReturnCode
		       ,4
		      );
		 localMciwinReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  mciwinReturnCode;
    }

   protected int checkMciwinReturnCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMciwinReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMciwinReturnCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMciwinReturnCode
			                 ,MCIWIN_RETURN_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mciwinReturnCode", beginMciwinReturnCode,MCIWIN_RETURN_CODE_LEN);
    }
   	}
     int localMcwinProgramCounter = -1;
     public boolean isMcwinProgramModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcwinProgramCounter != sharedCounter;
         localMcwinProgramCounter = sharedCounter; return hasModified;
     }

   protected char[] checkMcwinProgramConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localMciabendNodumpCounter = -1;
     public boolean isMciabendNodumpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciabendNodumpCounter != sharedCounter;
         localMciabendNodumpCounter = sharedCounter; return hasModified;
     }

   protected char[] checkMciabendNodumpConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSeprPtrSi994020Counter = -1;
     public boolean isSeprPtrSi994020Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeprPtrSi994020Counter != sharedCounter;
         localSeprPtrSi994020Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSeprPtrSi994020Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localSeprCallSi994020Counter = -1;
     public boolean isSeprCallSi994020Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeprCallSi994020Counter != sharedCounter;
         localSeprCallSi994020Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSeprCallSi994020Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }




}
  
