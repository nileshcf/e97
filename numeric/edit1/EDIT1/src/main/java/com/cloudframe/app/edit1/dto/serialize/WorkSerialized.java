package com.cloudframe.app.edit1.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 431;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWS1;
            protected  int beginWS2;
            protected  int beginWS3;
            protected  int beginWS4;
            protected  int beginWS5;
            protected  int beginWS6;
            protected  int beginWS07;
            protected  int beginWS08;
            protected  int beginWS09;
            protected  int beginWS10;
            protected  int beginWS11;
            protected  int beginWS12;
            protected  int beginWS13;
            protected  int beginWS14;
            protected  int beginWS15;
            protected  int beginWS16;
            protected  int beginWS17;
            protected  int beginWS18;
            protected  int beginWS19;
            protected  int beginWS20;
            protected  int beginWS21;
            protected  int beginWS22;
            protected  int beginWS23;
            protected  int beginWS24;
            protected  int beginWS25;
            protected  int beginWS26;
            protected  int beginWS27;
            protected  int beginWS28;
            protected  int beginWS29;
            protected  int beginWS30;
            protected  int beginWS31;
            protected  int beginWS32;
            protected  int beginWS33;
            protected  int beginWS34;
            protected  int beginWS35;
            protected  int beginWS36;
            protected  int beginWS37;
            protected  int beginWS38;
            protected  int beginWS39;
            protected  int beginWS40;
            protected  int beginWS42;
            protected  int beginWS46;
	
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
             beginWS1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWS2 = getStartOffset() + 12;	// set offset for serialization
  
             beginWS3 = getStartOffset() + 24;	// set offset for serialization
  
             beginWS4 = getStartOffset() + 33;	// set offset for serialization
  
             beginWS5 = getStartOffset() + 41;	// set offset for serialization
  
             beginWS6 = getStartOffset() + 48;	// set offset for serialization
  
             beginWS07 = getStartOffset() + 55;	// set offset for serialization
  
             beginWS08 = getStartOffset() + 61;	// set offset for serialization
  
             beginWS09 = getStartOffset() + 67;	// set offset for serialization
  
             beginWS10 = getStartOffset() + 73;	// set offset for serialization
  
             beginWS11 = getStartOffset() + 79;	// set offset for serialization
  
             beginWS12 = getStartOffset() + 90;	// set offset for serialization
  
             beginWS13 = getStartOffset() + 97;	// set offset for serialization
  
             beginWS14 = getStartOffset() + 105;	// set offset for serialization
  
             beginWS15 = getStartOffset() + 112;	// set offset for serialization
  
             beginWS16 = getStartOffset() + 119;	// set offset for serialization
  
             beginWS17 = getStartOffset() + 127;	// set offset for serialization
  
             beginWS18 = getStartOffset() + 135;	// set offset for serialization
  
             beginWS19 = getStartOffset() + 145;	// set offset for serialization
  
             beginWS20 = getStartOffset() + 155;	// set offset for serialization
  
             beginWS21 = getStartOffset() + 162;	// set offset for serialization
  
             beginWS22 = getStartOffset() + 169;	// set offset for serialization
  
             beginWS23 = getStartOffset() + 181;	// set offset for serialization
  
             beginWS24 = getStartOffset() + 193;	// set offset for serialization
  
             beginWS25 = getStartOffset() + 208;	// set offset for serialization
  
             beginWS26 = getStartOffset() + 222;	// set offset for serialization
  
             beginWS27 = getStartOffset() + 229;	// set offset for serialization
  
             beginWS28 = getStartOffset() + 236;	// set offset for serialization
  
             beginWS29 = getStartOffset() + 243;	// set offset for serialization
  
             beginWS30 = getStartOffset() + 250;	// set offset for serialization
  
             beginWS31 = getStartOffset() + 257;	// set offset for serialization
  
             beginWS32 = getStartOffset() + 266;	// set offset for serialization
  
             beginWS33 = getStartOffset() + 275;	// set offset for serialization
  
             beginWS34 = getStartOffset() + 289;	// set offset for serialization
  
             beginWS35 = getStartOffset() + 304;	// set offset for serialization
  
             beginWS36 = getStartOffset() + 322;	// set offset for serialization
  
             beginWS37 = getStartOffset() + 332;	// set offset for serialization
  
             beginWS38 = getStartOffset() + 342;	// set offset for serialization
  
             beginWS39 = getStartOffset() + 363;	// set offset for serialization
  
             beginWS40 = getStartOffset() + 384;	// set offset for serialization
  
             beginWS42 = getStartOffset() + 405;	// set offset for serialization
  
             beginWS46 = getStartOffset() + 416;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWS1Counter = -1;
     public boolean isWS1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS1Counter != sharedCounter;
         localWS1Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_1_LEN = 12;
	/**
	 * 	serialize this WS1
	 */
   protected void serializeWS1(char[] wS1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS1,0,getStringValue(),beginWS1,W_S_1_LEN);
       localWS1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS1Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWS1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS1() {	 
   		return (substring(getStringValue(),beginWS1,beginWS1 + W_S_1_LEN));
   	}
     int localWS2Counter = -1;
     public boolean isWS2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS2Counter != sharedCounter;
         localWS2Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_2_LEN = 12;
	/**
	 * 	serialize this WS2
	 */
   protected void serializeWS2(char[] wS2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS2,0,getStringValue(),beginWS2,W_S_2_LEN);
       localWS2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS2Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWS2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS2() {	 
   		return (substring(getStringValue(),beginWS2,beginWS2 + W_S_2_LEN));
   	}
     int localWS3Counter = -1;
     public boolean isWS3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS3Counter != sharedCounter;
         localWS3Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_3_LEN = 9;
	/**
	 * 	serialize this WS3
	 */
   protected void serializeWS3(char[] wS3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS3,0,getStringValue(),beginWS3,W_S_3_LEN);
       localWS3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS3Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshWS3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS3() {	 
   		return (substring(getStringValue(),beginWS3,beginWS3 + W_S_3_LEN));
   	}
     int localWS4Counter = -1;
     public boolean isWS4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS4Counter != sharedCounter;
         localWS4Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_4_LEN = 8;
	/**
	 * 	serialize this WS4
	 */
   protected void serializeWS4(char[] wS4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS4,0,getStringValue(),beginWS4,W_S_4_LEN);
       localWS4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS4Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWS4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS4() {	 
   		return (substring(getStringValue(),beginWS4,beginWS4 + W_S_4_LEN));
   	}
     int localWS5Counter = -1;
     public boolean isWS5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS5Counter != sharedCounter;
         localWS5Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_5_LEN = 7;
	/**
	 * 	serialize this WS5
	 */
   protected void serializeWS5(char[] wS5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS5,0,getStringValue(),beginWS5,W_S_5_LEN);
       localWS5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS5Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshWS5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS5() {	 
   		return (substring(getStringValue(),beginWS5,beginWS5 + W_S_5_LEN));
   	}
     int localWS6Counter = -1;
     public boolean isWS6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS6Counter != sharedCounter;
         localWS6Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_6_LEN = 7;
	/**
	 * 	serialize this WS6
	 */
   protected void serializeWS6(char[] wS6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS6,0,getStringValue(),beginWS6,W_S_6_LEN);
       localWS6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS6Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshWS6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS6() {	 
   		return (substring(getStringValue(),beginWS6,beginWS6 + W_S_6_LEN));
   	}
     int localWS07Counter = -1;
     public boolean isWS07Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS07Counter != sharedCounter;
         localWS07Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_07_LEN = 6;
	/**
	 * 	serialize this WS07
	 */
   protected void serializeWS07(char[] wS07) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS07,0,getStringValue(),beginWS07,W_S_07_LEN);
       localWS07Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS07Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshWS07 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS07() {	 
   		return (substring(getStringValue(),beginWS07,beginWS07 + W_S_07_LEN));
   	}
     int localWS08Counter = -1;
     public boolean isWS08Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS08Counter != sharedCounter;
         localWS08Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_08_LEN = 6;
	/**
	 * 	serialize this WS08
	 */
   protected void serializeWS08(char[] wS08) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS08,0,getStringValue(),beginWS08,W_S_08_LEN);
       localWS08Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS08Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshWS08 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS08() {	 
   		return (substring(getStringValue(),beginWS08,beginWS08 + W_S_08_LEN));
   	}
     int localWS09Counter = -1;
     public boolean isWS09Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS09Counter != sharedCounter;
         localWS09Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_09_LEN = 6;
	/**
	 * 	serialize this WS09
	 */
   protected void serializeWS09(char[] wS09) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS09,0,getStringValue(),beginWS09,W_S_09_LEN);
       localWS09Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS09Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshWS09 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS09() {	 
   		return (substring(getStringValue(),beginWS09,beginWS09 + W_S_09_LEN));
   	}
     int localWS10Counter = -1;
     public boolean isWS10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS10Counter != sharedCounter;
         localWS10Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_10_LEN = 6;
	/**
	 * 	serialize this WS10
	 */
   protected void serializeWS10(char[] wS10) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS10,0,getStringValue(),beginWS10,W_S_10_LEN);
       localWS10Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS10Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshWS10 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS10() {	 
   		return (substring(getStringValue(),beginWS10,beginWS10 + W_S_10_LEN));
   	}
     int localWS11Counter = -1;
     public boolean isWS11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS11Counter != sharedCounter;
         localWS11Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_11_LEN = 11;
	/**
	 * 	serialize this WS11
	 */
   protected void serializeWS11(char[] wS11) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS11,0,getStringValue(),beginWS11,W_S_11_LEN);
       localWS11Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS11Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshWS11 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS11() {	 
   		return (substring(getStringValue(),beginWS11,beginWS11 + W_S_11_LEN));
   	}
     int localWS12Counter = -1;
     public boolean isWS12Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS12Counter != sharedCounter;
         localWS12Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_12_LEN = 7;
	/**
	 * 	serialize this WS12
	 */
   protected void serializeWS12(char[] wS12) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS12,0,getStringValue(),beginWS12,W_S_12_LEN);
       localWS12Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS12Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshWS12 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS12() {	 
   		return (substring(getStringValue(),beginWS12,beginWS12 + W_S_12_LEN));
   	}
     int localWS13Counter = -1;
     public boolean isWS13Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS13Counter != sharedCounter;
         localWS13Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_13_LEN = 8;
	/**
	 * 	serialize this WS13
	 */
   protected void serializeWS13(char[] wS13) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS13,0,getStringValue(),beginWS13,W_S_13_LEN);
       localWS13Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS13Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWS13 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS13() {	 
   		return (substring(getStringValue(),beginWS13,beginWS13 + W_S_13_LEN));
   	}
     int localWS14Counter = -1;
     public boolean isWS14Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS14Counter != sharedCounter;
         localWS14Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_14_LEN = 7;
	/**
	 * 	serialize this WS14
	 */
   protected void serializeWS14(char[] wS14) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS14,0,getStringValue(),beginWS14,W_S_14_LEN);
       localWS14Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS14Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshWS14 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS14() {	 
   		return (substring(getStringValue(),beginWS14,beginWS14 + W_S_14_LEN));
   	}
     int localWS15Counter = -1;
     public boolean isWS15Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS15Counter != sharedCounter;
         localWS15Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_15_LEN = 7;
	/**
	 * 	serialize this WS15
	 */
   protected void serializeWS15(char[] wS15) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS15,0,getStringValue(),beginWS15,W_S_15_LEN);
       localWS15Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS15Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshWS15 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS15() {	 
   		return (substring(getStringValue(),beginWS15,beginWS15 + W_S_15_LEN));
   	}
     int localWS16Counter = -1;
     public boolean isWS16Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS16Counter != sharedCounter;
         localWS16Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_16_LEN = 8;
	/**
	 * 	serialize this WS16
	 */
   protected void serializeWS16(char[] wS16) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS16,0,getStringValue(),beginWS16,W_S_16_LEN);
       localWS16Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS16Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWS16 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS16() {	 
   		return (substring(getStringValue(),beginWS16,beginWS16 + W_S_16_LEN));
   	}
     int localWS17Counter = -1;
     public boolean isWS17Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS17Counter != sharedCounter;
         localWS17Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_17_LEN = 8;
	/**
	 * 	serialize this WS17
	 */
   protected void serializeWS17(char[] wS17) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS17,0,getStringValue(),beginWS17,W_S_17_LEN);
       localWS17Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS17Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWS17 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS17() {	 
   		return (substring(getStringValue(),beginWS17,beginWS17 + W_S_17_LEN));
   	}
     int localWS18Counter = -1;
     public boolean isWS18Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS18Counter != sharedCounter;
         localWS18Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_18_LEN = 10;
	/**
	 * 	serialize this WS18
	 */
   protected void serializeWS18(char[] wS18) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS18,0,getStringValue(),beginWS18,W_S_18_LEN);
       localWS18Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS18Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWS18 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS18() {	 
   		return (substring(getStringValue(),beginWS18,beginWS18 + W_S_18_LEN));
   	}
     int localWS19Counter = -1;
     public boolean isWS19Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS19Counter != sharedCounter;
         localWS19Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_19_LEN = 10;
	/**
	 * 	serialize this WS19
	 */
   protected void serializeWS19(char[] wS19) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS19,0,getStringValue(),beginWS19,W_S_19_LEN);
       localWS19Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS19Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWS19 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS19() {	 
   		return (substring(getStringValue(),beginWS19,beginWS19 + W_S_19_LEN));
   	}
     int localWS20Counter = -1;
     public boolean isWS20Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS20Counter != sharedCounter;
         localWS20Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_20_LEN = 7;
	/**
	 * 	serialize this WS20
	 */
   protected void serializeWS20(char[] wS20) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS20,0,getStringValue(),beginWS20,W_S_20_LEN);
       localWS20Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS20Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshWS20 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS20() {	 
   		return (substring(getStringValue(),beginWS20,beginWS20 + W_S_20_LEN));
   	}
     int localWS21Counter = -1;
     public boolean isWS21Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS21Counter != sharedCounter;
         localWS21Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_21_LEN = 7;
	/**
	 * 	serialize this WS21
	 */
   protected void serializeWS21(char[] wS21) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS21,0,getStringValue(),beginWS21,W_S_21_LEN);
       localWS21Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS21Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshWS21 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS21() {	 
   		return (substring(getStringValue(),beginWS21,beginWS21 + W_S_21_LEN));
   	}
     int localWS22Counter = -1;
     public boolean isWS22Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS22Counter != sharedCounter;
         localWS22Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_22_LEN = 12;
	/**
	 * 	serialize this WS22
	 */
   protected void serializeWS22(char[] wS22) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS22,0,getStringValue(),beginWS22,W_S_22_LEN);
       localWS22Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS22Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWS22 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS22() {	 
   		return (substring(getStringValue(),beginWS22,beginWS22 + W_S_22_LEN));
   	}
     int localWS23Counter = -1;
     public boolean isWS23Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS23Counter != sharedCounter;
         localWS23Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_23_LEN = 12;
	/**
	 * 	serialize this WS23
	 */
   protected void serializeWS23(char[] wS23) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS23,0,getStringValue(),beginWS23,W_S_23_LEN);
       localWS23Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS23Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWS23 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS23() {	 
   		return (substring(getStringValue(),beginWS23,beginWS23 + W_S_23_LEN));
   	}
     int localWS24Counter = -1;
     public boolean isWS24Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS24Counter != sharedCounter;
         localWS24Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_24_LEN = 15;
	/**
	 * 	serialize this WS24
	 */
   protected void serializeWS24(char[] wS24) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS24,0,getStringValue(),beginWS24,W_S_24_LEN);
       localWS24Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS24Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshWS24 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS24() {	 
   		return (substring(getStringValue(),beginWS24,beginWS24 + W_S_24_LEN));
   	}
     int localWS25Counter = -1;
     public boolean isWS25Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS25Counter != sharedCounter;
         localWS25Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_25_LEN = 14;
	/**
	 * 	serialize this WS25
	 */
   protected void serializeWS25(char[] wS25) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS25,0,getStringValue(),beginWS25,W_S_25_LEN);
       localWS25Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS25Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshWS25 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS25() {	 
   		return (substring(getStringValue(),beginWS25,beginWS25 + W_S_25_LEN));
   	}
     int localWS26Counter = -1;
     public boolean isWS26Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS26Counter != sharedCounter;
         localWS26Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_26_LEN = 7;
	/**
	 * 	serialize this WS26
	 */
   protected void serializeWS26(char[] wS26) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS26,0,getStringValue(),beginWS26,W_S_26_LEN);
       localWS26Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS26Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshWS26 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS26() {	 
   		return (substring(getStringValue(),beginWS26,beginWS26 + W_S_26_LEN));
   	}
     int localWS27Counter = -1;
     public boolean isWS27Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS27Counter != sharedCounter;
         localWS27Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_27_LEN = 7;
	/**
	 * 	serialize this WS27
	 */
   protected void serializeWS27(char[] wS27) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS27,0,getStringValue(),beginWS27,W_S_27_LEN);
       localWS27Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS27Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshWS27 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS27() {	 
   		return (substring(getStringValue(),beginWS27,beginWS27 + W_S_27_LEN));
   	}
     int localWS28Counter = -1;
     public boolean isWS28Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS28Counter != sharedCounter;
         localWS28Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_28_LEN = 7;
	/**
	 * 	serialize this WS28
	 */
   protected void serializeWS28(char[] wS28) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS28,0,getStringValue(),beginWS28,W_S_28_LEN);
       localWS28Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS28Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshWS28 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS28() {	 
   		return (substring(getStringValue(),beginWS28,beginWS28 + W_S_28_LEN));
   	}
     int localWS29Counter = -1;
     public boolean isWS29Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS29Counter != sharedCounter;
         localWS29Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_29_LEN = 7;
	/**
	 * 	serialize this WS29
	 */
   protected void serializeWS29(char[] wS29) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS29,0,getStringValue(),beginWS29,W_S_29_LEN);
       localWS29Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS29Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshWS29 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS29() {	 
   		return (substring(getStringValue(),beginWS29,beginWS29 + W_S_29_LEN));
   	}
     int localWS30Counter = -1;
     public boolean isWS30Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS30Counter != sharedCounter;
         localWS30Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_30_LEN = 7;
	/**
	 * 	serialize this WS30
	 */
   protected void serializeWS30(char[] wS30) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS30,0,getStringValue(),beginWS30,W_S_30_LEN);
       localWS30Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS30Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshWS30 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS30() {	 
   		return (substring(getStringValue(),beginWS30,beginWS30 + W_S_30_LEN));
   	}
     int localWS31Counter = -1;
     public boolean isWS31Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS31Counter != sharedCounter;
         localWS31Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_31_LEN = 9;
	/**
	 * 	serialize this WS31
	 */
   protected void serializeWS31(char[] wS31) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS31,0,getStringValue(),beginWS31,W_S_31_LEN);
       localWS31Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS31Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshWS31 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS31() {	 
   		return (substring(getStringValue(),beginWS31,beginWS31 + W_S_31_LEN));
   	}
     int localWS32Counter = -1;
     public boolean isWS32Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS32Counter != sharedCounter;
         localWS32Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_32_LEN = 9;
	/**
	 * 	serialize this WS32
	 */
   protected void serializeWS32(char[] wS32) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS32,0,getStringValue(),beginWS32,W_S_32_LEN);
       localWS32Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS32Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshWS32 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS32() {	 
   		return (substring(getStringValue(),beginWS32,beginWS32 + W_S_32_LEN));
   	}
     int localWS33Counter = -1;
     public boolean isWS33Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS33Counter != sharedCounter;
         localWS33Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_33_LEN = 14;
	/**
	 * 	serialize this WS33
	 */
   protected void serializeWS33(char[] wS33) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS33,0,getStringValue(),beginWS33,W_S_33_LEN);
       localWS33Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS33Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshWS33 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS33() {	 
   		return (substring(getStringValue(),beginWS33,beginWS33 + W_S_33_LEN));
   	}
     int localWS34Counter = -1;
     public boolean isWS34Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS34Counter != sharedCounter;
         localWS34Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_34_LEN = 15;
	/**
	 * 	serialize this WS34
	 */
   protected void serializeWS34(char[] wS34) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS34,0,getStringValue(),beginWS34,W_S_34_LEN);
       localWS34Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS34Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshWS34 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS34() {	 
   		return (substring(getStringValue(),beginWS34,beginWS34 + W_S_34_LEN));
   	}
     int localWS35Counter = -1;
     public boolean isWS35Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS35Counter != sharedCounter;
         localWS35Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_35_LEN = 18;
	/**
	 * 	serialize this WS35
	 */
   protected void serializeWS35(char[] wS35) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS35,0,getStringValue(),beginWS35,W_S_35_LEN);
       localWS35Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS35Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshWS35 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS35() {	 
   		return (substring(getStringValue(),beginWS35,beginWS35 + W_S_35_LEN));
   	}
     int localWS36Counter = -1;
     public boolean isWS36Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS36Counter != sharedCounter;
         localWS36Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_36_LEN = 10;
	/**
	 * 	serialize this WS36
	 */
   protected void serializeWS36(char[] wS36) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS36,0,getStringValue(),beginWS36,W_S_36_LEN);
       localWS36Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS36Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWS36 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS36() {	 
   		return (substring(getStringValue(),beginWS36,beginWS36 + W_S_36_LEN));
   	}
     int localWS37Counter = -1;
     public boolean isWS37Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS37Counter != sharedCounter;
         localWS37Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_37_LEN = 10;
	/**
	 * 	serialize this WS37
	 */
   protected void serializeWS37(char[] wS37) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS37,0,getStringValue(),beginWS37,W_S_37_LEN);
       localWS37Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS37Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWS37 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS37() {	 
   		return (substring(getStringValue(),beginWS37,beginWS37 + W_S_37_LEN));
   	}
     int localWS38Counter = -1;
     public boolean isWS38Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS38Counter != sharedCounter;
         localWS38Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_38_LEN = 21;
	/**
	 * 	serialize this WS38
	 */
   protected void serializeWS38(char[] wS38) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS38,0,getStringValue(),beginWS38,W_S_38_LEN);
       localWS38Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS38Constraints(char[] value) {
   			return super.checkConstraints(value , 21 ,false, false);
   }
    /**
	 *	refreshWS38 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS38() {	 
   		return (substring(getStringValue(),beginWS38,beginWS38 + W_S_38_LEN));
   	}
     int localWS39Counter = -1;
     public boolean isWS39Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS39Counter != sharedCounter;
         localWS39Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_39_LEN = 21;
	/**
	 * 	serialize this WS39
	 */
   protected void serializeWS39(char[] wS39) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS39,0,getStringValue(),beginWS39,W_S_39_LEN);
       localWS39Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS39Constraints(char[] value) {
   			return super.checkConstraints(value , 21 ,false, false);
   }
    /**
	 *	refreshWS39 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS39() {	 
   		return (substring(getStringValue(),beginWS39,beginWS39 + W_S_39_LEN));
   	}
     int localWS40Counter = -1;
     public boolean isWS40Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS40Counter != sharedCounter;
         localWS40Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_40_LEN = 21;
	/**
	 * 	serialize this WS40
	 */
   protected void serializeWS40(char[] wS40) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS40,0,getStringValue(),beginWS40,W_S_40_LEN);
       localWS40Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS40Constraints(char[] value) {
   			return super.checkConstraints(value , 21 ,false, false);
   }
    /**
	 *	refreshWS40 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS40() {	 
   		return (substring(getStringValue(),beginWS40,beginWS40 + W_S_40_LEN));
   	}
     int localWS42Counter = -1;
     public boolean isWS42Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS42Counter != sharedCounter;
         localWS42Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_42_LEN = 11;
	/**
	 * 	serialize this WS42
	 */
   protected void serializeWS42(char[] wS42) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS42,0,getStringValue(),beginWS42,W_S_42_LEN);
       localWS42Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS42Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshWS42 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS42() {	 
   		return (substring(getStringValue(),beginWS42,beginWS42 + W_S_42_LEN));
   	}
     int localWS46Counter = -1;
     public boolean isWS46Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS46Counter != sharedCounter;
         localWS46Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_46_LEN = 15;
	/**
	 * 	serialize this WS46
	 */
   protected void serializeWS46(char[] wS46) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS46,0,getStringValue(),beginWS46,W_S_46_LEN);
       localWS46Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS46Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshWS46 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS46() {	 
   		return (substring(getStringValue(),beginWS46,beginWS46 + W_S_46_LEN));
   	}




}
  
