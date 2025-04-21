package com.cloudframe.app.tmsmmcpy.dto.serialize;

/**
*  The class SmmRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SmmRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SmmRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SMM_REC_LENGTH = 822;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSmmSsDdrKey;
            protected  int beginSmmMatchStatus;
            protected  int beginSmmClassification;
            protected  int beginSmmField2;
            protected  int beginSmmField4;
            protected  int beginSmmField5;
            protected  int beginSmmField6;
            protected  int beginSmmField7;
            protected  int beginSmmField8;
            protected  int beginSmmField9;
            protected  int beginSmmField10;
            protected  int beginSmmField11;
            protected  int beginSmmField12;
            protected  int beginSmmField13;
            protected  int beginSmmField14;
            protected  int beginSmmField15;
            protected  int beginSmmBranch;
            protected  int beginSmmTeller;
            protected  int beginSmmHash;
            protected  int beginSmmType;
            protected  int beginSmmAppTypePsetNum;
            protected  int beginSmmPostingDate;
            protected  int beginSmmTransTime;
            protected  int beginSmmRefText1;
            protected  int beginSmmRefText2;
            protected  int beginSmmRefText3;
            protected  int beginSmmRefText4;
            protected  int beginSmmRefText5;
            protected  int beginSmmRefNum1;
            protected  int beginSmmRefNum2;
            protected  int beginSmmSubclass;
            protected  int beginSmmFlags;
            protected  int beginSmmCycleNo;
            protected  int beginSmmCycleDate;
            protected  int beginSmmEnd;
	
	/**
	* Constructor for SmmRecSerialized
	**/
    public SmmRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SmmRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SMM_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSmmSsDdrKey = getStartOffset() + 100;	// set offset for serialization
  
             beginSmmMatchStatus = getStartOffset() + 110;	// set offset for serialization
  
             beginSmmClassification = getStartOffset() + 112;	// set offset for serialization
  
             beginSmmField2 = getStartOffset() + 114;	// set offset for serialization
  
             beginSmmField4 = getStartOffset() + 144;	// set offset for serialization
  
             beginSmmField5 = getStartOffset() + 174;	// set offset for serialization
  
             beginSmmField6 = getStartOffset() + 204;	// set offset for serialization
  
             beginSmmField7 = getStartOffset() + 234;	// set offset for serialization
  
             beginSmmField8 = getStartOffset() + 264;	// set offset for serialization
  
             beginSmmField9 = getStartOffset() + 294;	// set offset for serialization
  
             beginSmmField10 = getStartOffset() + 324;	// set offset for serialization
  
             beginSmmField11 = getStartOffset() + 354;	// set offset for serialization
  
             beginSmmField12 = getStartOffset() + 384;	// set offset for serialization
  
             beginSmmField13 = getStartOffset() + 414;	// set offset for serialization
  
             beginSmmField14 = getStartOffset() + 444;	// set offset for serialization
  
             beginSmmField15 = getStartOffset() + 474;	// set offset for serialization
  
             beginSmmBranch = getStartOffset() + 504;	// set offset for serialization
  
             beginSmmTeller = getStartOffset() + 514;	// set offset for serialization
  
             beginSmmHash = getStartOffset() + 524;	// set offset for serialization
  
             beginSmmType = getStartOffset() + 554;	// set offset for serialization
  
             beginSmmAppTypePsetNum = getStartOffset() + 564;	// set offset for serialization
  
             beginSmmPostingDate = getStartOffset() + 567;	// set offset for serialization
  
             beginSmmTransTime = getStartOffset() + 577;	// set offset for serialization
  
             beginSmmRefText1 = getStartOffset() + 585;	// set offset for serialization
  
             beginSmmRefText2 = getStartOffset() + 615;	// set offset for serialization
  
             beginSmmRefText3 = getStartOffset() + 645;	// set offset for serialization
  
             beginSmmRefText4 = getStartOffset() + 675;	// set offset for serialization
  
             beginSmmRefText5 = getStartOffset() + 705;	// set offset for serialization
  
             beginSmmRefNum1 = getStartOffset() + 735;	// set offset for serialization
  
             beginSmmRefNum2 = getStartOffset() + 765;	// set offset for serialization
  
             beginSmmSubclass = getStartOffset() + 795;	// set offset for serialization
  
             beginSmmFlags = getStartOffset() + 805;	// set offset for serialization
  
             beginSmmCycleNo = getStartOffset() + 810;	// set offset for serialization
  
             beginSmmCycleDate = getStartOffset() + 811;	// set offset for serialization
  
             beginSmmEnd = getStartOffset() + 819;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSmmSsDdrKeyCounter = -1;
     public boolean isSmmSsDdrKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmSsDdrKeyCounter != sharedCounter;
         localSmmSsDdrKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_SS_DDR_KEY_LEN = 10;
	/**
	 * 	serialize this SmmSsDdrKey
	 */
   protected void serializeSmmSsDdrKey(char[] smmSsDdrKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmSsDdrKey,0,getStringValue(),beginSmmSsDdrKey,SMM_SS_DDR_KEY_LEN);
       localSmmSsDdrKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmSsDdrKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSmmSsDdrKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmSsDdrKey() {	 
   		return (substring(getStringValue(),beginSmmSsDdrKey,beginSmmSsDdrKey + SMM_SS_DDR_KEY_LEN));
   	}
     int localSmmMatchStatusCounter = -1;
     public boolean isSmmMatchStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmMatchStatusCounter != sharedCounter;
         localSmmMatchStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_MATCH_STATUS_LEN = 2;
	/**
	 * 	serialize this SmmMatchStatus
	 */
   protected void serializeSmmMatchStatus(char[] smmMatchStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmMatchStatus,0,getStringValue(),beginSmmMatchStatus,SMM_MATCH_STATUS_LEN);
       localSmmMatchStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmMatchStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSmmMatchStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmMatchStatus() {	 
   		return (substring(getStringValue(),beginSmmMatchStatus,beginSmmMatchStatus + SMM_MATCH_STATUS_LEN));
   	}
     int localSmmClassificationCounter = -1;
     public boolean isSmmClassificationModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmClassificationCounter != sharedCounter;
         localSmmClassificationCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_CLASSIFICATION_LEN = 2;
	/**
	 * 	serialize this SmmClassification
	 */
   protected void serializeSmmClassification(char[] smmClassification) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmClassification,0,getStringValue(),beginSmmClassification,SMM_CLASSIFICATION_LEN);
       localSmmClassificationCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmClassificationConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSmmClassification is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmClassification() {	 
   		return (substring(getStringValue(),beginSmmClassification,beginSmmClassification + SMM_CLASSIFICATION_LEN));
   	}
     int localSmmField2Counter = -1;
     public boolean isSmmField2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmField2Counter != sharedCounter;
         localSmmField2Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_FIELD_2_LEN = 30;
	/**
	 * 	serialize this SmmField2
	 */
   protected void serializeSmmField2(char[] smmField2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmField2,0,getStringValue(),beginSmmField2,SMM_FIELD_2_LEN);
       localSmmField2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmField2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmField2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmField2() {	 
   		return (substring(getStringValue(),beginSmmField2,beginSmmField2 + SMM_FIELD_2_LEN));
   	}
     int localSmmField4Counter = -1;
     public boolean isSmmField4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmField4Counter != sharedCounter;
         localSmmField4Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_FIELD_4_LEN = 30;
	/**
	 * 	serialize this SmmField4
	 */
   protected void serializeSmmField4(char[] smmField4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmField4,0,getStringValue(),beginSmmField4,SMM_FIELD_4_LEN);
       localSmmField4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmField4Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmField4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmField4() {	 
   		return (substring(getStringValue(),beginSmmField4,beginSmmField4 + SMM_FIELD_4_LEN));
   	}
     int localSmmField5Counter = -1;
     public boolean isSmmField5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmField5Counter != sharedCounter;
         localSmmField5Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_FIELD_5_LEN = 30;
	/**
	 * 	serialize this SmmField5
	 */
   protected void serializeSmmField5(char[] smmField5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmField5,0,getStringValue(),beginSmmField5,SMM_FIELD_5_LEN);
       localSmmField5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmField5Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmField5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmField5() {	 
   		return (substring(getStringValue(),beginSmmField5,beginSmmField5 + SMM_FIELD_5_LEN));
   	}
     int localSmmField6Counter = -1;
     public boolean isSmmField6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmField6Counter != sharedCounter;
         localSmmField6Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_FIELD_6_LEN = 30;
	/**
	 * 	serialize this SmmField6
	 */
   protected void serializeSmmField6(char[] smmField6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmField6,0,getStringValue(),beginSmmField6,SMM_FIELD_6_LEN);
       localSmmField6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmField6Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmField6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmField6() {	 
   		return (substring(getStringValue(),beginSmmField6,beginSmmField6 + SMM_FIELD_6_LEN));
   	}
     int localSmmField7Counter = -1;
     public boolean isSmmField7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmField7Counter != sharedCounter;
         localSmmField7Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_FIELD_7_LEN = 30;
	/**
	 * 	serialize this SmmField7
	 */
   protected void serializeSmmField7(char[] smmField7) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmField7,0,getStringValue(),beginSmmField7,SMM_FIELD_7_LEN);
       localSmmField7Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmField7Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmField7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmField7() {	 
   		return (substring(getStringValue(),beginSmmField7,beginSmmField7 + SMM_FIELD_7_LEN));
   	}
     int localSmmField8Counter = -1;
     public boolean isSmmField8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmField8Counter != sharedCounter;
         localSmmField8Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_FIELD_8_LEN = 30;
	/**
	 * 	serialize this SmmField8
	 */
   protected void serializeSmmField8(char[] smmField8) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmField8,0,getStringValue(),beginSmmField8,SMM_FIELD_8_LEN);
       localSmmField8Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmField8Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmField8 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmField8() {	 
   		return (substring(getStringValue(),beginSmmField8,beginSmmField8 + SMM_FIELD_8_LEN));
   	}
     int localSmmField9Counter = -1;
     public boolean isSmmField9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmField9Counter != sharedCounter;
         localSmmField9Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_FIELD_9_LEN = 30;
	/**
	 * 	serialize this SmmField9
	 */
   protected void serializeSmmField9(char[] smmField9) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmField9,0,getStringValue(),beginSmmField9,SMM_FIELD_9_LEN);
       localSmmField9Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmField9Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmField9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmField9() {	 
   		return (substring(getStringValue(),beginSmmField9,beginSmmField9 + SMM_FIELD_9_LEN));
   	}
     int localSmmField10Counter = -1;
     public boolean isSmmField10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmField10Counter != sharedCounter;
         localSmmField10Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_FIELD_10_LEN = 30;
	/**
	 * 	serialize this SmmField10
	 */
   protected void serializeSmmField10(char[] smmField10) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmField10,0,getStringValue(),beginSmmField10,SMM_FIELD_10_LEN);
       localSmmField10Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmField10Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmField10 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmField10() {	 
   		return (substring(getStringValue(),beginSmmField10,beginSmmField10 + SMM_FIELD_10_LEN));
   	}
     int localSmmField11Counter = -1;
     public boolean isSmmField11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmField11Counter != sharedCounter;
         localSmmField11Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_FIELD_11_LEN = 30;
	/**
	 * 	serialize this SmmField11
	 */
   protected void serializeSmmField11(char[] smmField11) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmField11,0,getStringValue(),beginSmmField11,SMM_FIELD_11_LEN);
       localSmmField11Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmField11Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmField11 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmField11() {	 
   		return (substring(getStringValue(),beginSmmField11,beginSmmField11 + SMM_FIELD_11_LEN));
   	}
     int localSmmField12Counter = -1;
     public boolean isSmmField12Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmField12Counter != sharedCounter;
         localSmmField12Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_FIELD_12_LEN = 30;
	/**
	 * 	serialize this SmmField12
	 */
   protected void serializeSmmField12(char[] smmField12) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmField12,0,getStringValue(),beginSmmField12,SMM_FIELD_12_LEN);
       localSmmField12Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmField12Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmField12 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmField12() {	 
   		return (substring(getStringValue(),beginSmmField12,beginSmmField12 + SMM_FIELD_12_LEN));
   	}
     int localSmmField13Counter = -1;
     public boolean isSmmField13Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmField13Counter != sharedCounter;
         localSmmField13Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_FIELD_13_LEN = 30;
	/**
	 * 	serialize this SmmField13
	 */
   protected void serializeSmmField13(char[] smmField13) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmField13,0,getStringValue(),beginSmmField13,SMM_FIELD_13_LEN);
       localSmmField13Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmField13Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmField13 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmField13() {	 
   		return (substring(getStringValue(),beginSmmField13,beginSmmField13 + SMM_FIELD_13_LEN));
   	}
     int localSmmField14Counter = -1;
     public boolean isSmmField14Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmField14Counter != sharedCounter;
         localSmmField14Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_FIELD_14_LEN = 30;
	/**
	 * 	serialize this SmmField14
	 */
   protected void serializeSmmField14(char[] smmField14) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmField14,0,getStringValue(),beginSmmField14,SMM_FIELD_14_LEN);
       localSmmField14Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmField14Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmField14 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmField14() {	 
   		return (substring(getStringValue(),beginSmmField14,beginSmmField14 + SMM_FIELD_14_LEN));
   	}
     int localSmmField15Counter = -1;
     public boolean isSmmField15Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmField15Counter != sharedCounter;
         localSmmField15Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_FIELD_15_LEN = 30;
	/**
	 * 	serialize this SmmField15
	 */
   protected void serializeSmmField15(char[] smmField15) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmField15,0,getStringValue(),beginSmmField15,SMM_FIELD_15_LEN);
       localSmmField15Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmField15Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmField15 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmField15() {	 
   		return (substring(getStringValue(),beginSmmField15,beginSmmField15 + SMM_FIELD_15_LEN));
   	}
     int localSmmBranchCounter = -1;
     public boolean isSmmBranchModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmBranchCounter != sharedCounter;
         localSmmBranchCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_BRANCH_LEN = 10;
	/**
	 * 	serialize this SmmBranch
	 */
   protected void serializeSmmBranch(char[] smmBranch) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmBranch,0,getStringValue(),beginSmmBranch,SMM_BRANCH_LEN);
       localSmmBranchCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmBranchConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSmmBranch is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmBranch() {	 
   		return (substring(getStringValue(),beginSmmBranch,beginSmmBranch + SMM_BRANCH_LEN));
   	}
     int localSmmTellerCounter = -1;
     public boolean isSmmTellerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmTellerCounter != sharedCounter;
         localSmmTellerCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_TELLER_LEN = 10;
	/**
	 * 	serialize this SmmTeller
	 */
   protected void serializeSmmTeller(char[] smmTeller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmTeller,0,getStringValue(),beginSmmTeller,SMM_TELLER_LEN);
       localSmmTellerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmTellerConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSmmTeller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmTeller() {	 
   		return (substring(getStringValue(),beginSmmTeller,beginSmmTeller + SMM_TELLER_LEN));
   	}
     int localSmmHashCounter = -1;
     public boolean isSmmHashModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmHashCounter != sharedCounter;
         localSmmHashCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_HASH_LEN = 30;
	/**
	 * 	serialize this SmmHash
	 */
   protected void serializeSmmHash(char[] smmHash) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmHash,0,getStringValue(),beginSmmHash,SMM_HASH_LEN);
       localSmmHashCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmHashConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmHash is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmHash() {	 
   		return (substring(getStringValue(),beginSmmHash,beginSmmHash + SMM_HASH_LEN));
   	}
     int localSmmTypeCounter = -1;
     public boolean isSmmTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmTypeCounter != sharedCounter;
         localSmmTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_TYPE_LEN = 10;
	/**
	 * 	serialize this SmmType
	 */
   protected void serializeSmmType(char[] smmType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmType,0,getStringValue(),beginSmmType,SMM_TYPE_LEN);
       localSmmTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSmmType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmType() {	 
   		return (substring(getStringValue(),beginSmmType,beginSmmType + SMM_TYPE_LEN));
   	}
     int localSmmAppTypePsetNumCounter = -1;
     public boolean isSmmAppTypePsetNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmAppTypePsetNumCounter != sharedCounter;
         localSmmAppTypePsetNumCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_APP_TYPE_PSET_NUM_LEN = 3;
	/**
	 * 	serialize this SmmAppTypePsetNum
	 */
   protected void serializeSmmAppTypePsetNum(char[] smmAppTypePsetNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmAppTypePsetNum,0,getStringValue(),beginSmmAppTypePsetNum,SMM_APP_TYPE_PSET_NUM_LEN);
       localSmmAppTypePsetNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmAppTypePsetNumConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSmmAppTypePsetNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmAppTypePsetNum() {	 
   		return (substring(getStringValue(),beginSmmAppTypePsetNum,beginSmmAppTypePsetNum + SMM_APP_TYPE_PSET_NUM_LEN));
   	}
     int localSmmPostingDateCounter = -1;
     public boolean isSmmPostingDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmPostingDateCounter != sharedCounter;
         localSmmPostingDateCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_POSTING_DATE_LEN = 10;
	/**
	 * 	serialize this SmmPostingDate
	 */
   protected void serializeSmmPostingDate(char[] smmPostingDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmPostingDate,0,getStringValue(),beginSmmPostingDate,SMM_POSTING_DATE_LEN);
       localSmmPostingDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmPostingDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSmmPostingDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmPostingDate() {	 
   		return (substring(getStringValue(),beginSmmPostingDate,beginSmmPostingDate + SMM_POSTING_DATE_LEN));
   	}
     int localSmmTransTimeCounter = -1;
     public boolean isSmmTransTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmTransTimeCounter != sharedCounter;
         localSmmTransTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_TRANS_TIME_LEN = 8;
	/**
	 * 	serialize this SmmTransTime
	 */
   protected void serializeSmmTransTime(char[] smmTransTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmTransTime,0,getStringValue(),beginSmmTransTime,SMM_TRANS_TIME_LEN);
       localSmmTransTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmTransTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSmmTransTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmTransTime() {	 
   		return (substring(getStringValue(),beginSmmTransTime,beginSmmTransTime + SMM_TRANS_TIME_LEN));
   	}
     int localSmmRefText1Counter = -1;
     public boolean isSmmRefText1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmRefText1Counter != sharedCounter;
         localSmmRefText1Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_REF_TEXT_1_LEN = 30;
	/**
	 * 	serialize this SmmRefText1
	 */
   protected void serializeSmmRefText1(char[] smmRefText1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmRefText1,0,getStringValue(),beginSmmRefText1,SMM_REF_TEXT_1_LEN);
       localSmmRefText1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmRefText1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmRefText1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmRefText1() {	 
   		return (substring(getStringValue(),beginSmmRefText1,beginSmmRefText1 + SMM_REF_TEXT_1_LEN));
   	}
     int localSmmRefText2Counter = -1;
     public boolean isSmmRefText2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmRefText2Counter != sharedCounter;
         localSmmRefText2Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_REF_TEXT_2_LEN = 30;
	/**
	 * 	serialize this SmmRefText2
	 */
   protected void serializeSmmRefText2(char[] smmRefText2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmRefText2,0,getStringValue(),beginSmmRefText2,SMM_REF_TEXT_2_LEN);
       localSmmRefText2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmRefText2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmRefText2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmRefText2() {	 
   		return (substring(getStringValue(),beginSmmRefText2,beginSmmRefText2 + SMM_REF_TEXT_2_LEN));
   	}
     int localSmmRefText3Counter = -1;
     public boolean isSmmRefText3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmRefText3Counter != sharedCounter;
         localSmmRefText3Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_REF_TEXT_3_LEN = 30;
	/**
	 * 	serialize this SmmRefText3
	 */
   protected void serializeSmmRefText3(char[] smmRefText3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmRefText3,0,getStringValue(),beginSmmRefText3,SMM_REF_TEXT_3_LEN);
       localSmmRefText3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmRefText3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmRefText3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmRefText3() {	 
   		return (substring(getStringValue(),beginSmmRefText3,beginSmmRefText3 + SMM_REF_TEXT_3_LEN));
   	}
     int localSmmRefText4Counter = -1;
     public boolean isSmmRefText4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmRefText4Counter != sharedCounter;
         localSmmRefText4Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_REF_TEXT_4_LEN = 30;
	/**
	 * 	serialize this SmmRefText4
	 */
   protected void serializeSmmRefText4(char[] smmRefText4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmRefText4,0,getStringValue(),beginSmmRefText4,SMM_REF_TEXT_4_LEN);
       localSmmRefText4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmRefText4Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmRefText4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmRefText4() {	 
   		return (substring(getStringValue(),beginSmmRefText4,beginSmmRefText4 + SMM_REF_TEXT_4_LEN));
   	}
     int localSmmRefText5Counter = -1;
     public boolean isSmmRefText5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmRefText5Counter != sharedCounter;
         localSmmRefText5Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_REF_TEXT_5_LEN = 30;
	/**
	 * 	serialize this SmmRefText5
	 */
   protected void serializeSmmRefText5(char[] smmRefText5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmRefText5,0,getStringValue(),beginSmmRefText5,SMM_REF_TEXT_5_LEN);
       localSmmRefText5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmRefText5Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmRefText5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmRefText5() {	 
   		return (substring(getStringValue(),beginSmmRefText5,beginSmmRefText5 + SMM_REF_TEXT_5_LEN));
   	}
     int localSmmRefNum1Counter = -1;
     public boolean isSmmRefNum1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmRefNum1Counter != sharedCounter;
         localSmmRefNum1Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_REF_NUM_1_LEN = 30;
	/**
	 * 	serialize this SmmRefNum1
	 */
   protected void serializeSmmRefNum1(char[] smmRefNum1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmRefNum1,0,getStringValue(),beginSmmRefNum1,SMM_REF_NUM_1_LEN);
       localSmmRefNum1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmRefNum1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmRefNum1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmRefNum1() {	 
   		return (substring(getStringValue(),beginSmmRefNum1,beginSmmRefNum1 + SMM_REF_NUM_1_LEN));
   	}
     int localSmmRefNum2Counter = -1;
     public boolean isSmmRefNum2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmRefNum2Counter != sharedCounter;
         localSmmRefNum2Counter = sharedCounter; return hasModified;
     }
	protected static final int SMM_REF_NUM_2_LEN = 30;
	/**
	 * 	serialize this SmmRefNum2
	 */
   protected void serializeSmmRefNum2(char[] smmRefNum2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmRefNum2,0,getStringValue(),beginSmmRefNum2,SMM_REF_NUM_2_LEN);
       localSmmRefNum2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmRefNum2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSmmRefNum2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmRefNum2() {	 
   		return (substring(getStringValue(),beginSmmRefNum2,beginSmmRefNum2 + SMM_REF_NUM_2_LEN));
   	}
     int localSmmSubclassCounter = -1;
     public boolean isSmmSubclassModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmSubclassCounter != sharedCounter;
         localSmmSubclassCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_SUBCLASS_LEN = 10;
	/**
	 * 	serialize this SmmSubclass
	 */
   protected void serializeSmmSubclass(char[] smmSubclass) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmSubclass,0,getStringValue(),beginSmmSubclass,SMM_SUBCLASS_LEN);
       localSmmSubclassCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmSubclassConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSmmSubclass is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmSubclass() {	 
   		return (substring(getStringValue(),beginSmmSubclass,beginSmmSubclass + SMM_SUBCLASS_LEN));
   	}
     int localSmmFlagsCounter = -1;
     public boolean isSmmFlagsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmFlagsCounter != sharedCounter;
         localSmmFlagsCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_FLAGS_LEN = 5;
	/**
	 * 	serialize this SmmFlags
	 */
   protected void serializeSmmFlags(char[] smmFlags) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmFlags,0,getStringValue(),beginSmmFlags,SMM_FLAGS_LEN);
       localSmmFlagsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmFlagsConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshSmmFlags is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmFlags() {	 
   		return (substring(getStringValue(),beginSmmFlags,beginSmmFlags + SMM_FLAGS_LEN));
   	}
     int localSmmCycleNoCounter = -1;
     public boolean isSmmCycleNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmCycleNoCounter != sharedCounter;
         localSmmCycleNoCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_CYCLE_NO_LEN = 1;
	/**
	 * 	serialize this SmmCycleNo
	 */
   protected void serializeSmmCycleNo(char[] smmCycleNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmCycleNo,0,getStringValue(),beginSmmCycleNo,SMM_CYCLE_NO_LEN);
       localSmmCycleNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmCycleNoConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSmmCycleNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmCycleNo() {	 
   		return (substring(getStringValue(),beginSmmCycleNo,beginSmmCycleNo + SMM_CYCLE_NO_LEN));
   	}
     int localSmmCycleDateCounter = -1;
     public boolean isSmmCycleDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmCycleDateCounter != sharedCounter;
         localSmmCycleDateCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_CYCLE_DATE_LEN = 8;
	/**
	 * 	serialize this SmmCycleDate
	 */
   protected void serializeSmmCycleDate(char[] smmCycleDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmCycleDate,0,getStringValue(),beginSmmCycleDate,SMM_CYCLE_DATE_LEN);
       localSmmCycleDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmCycleDateConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSmmCycleDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmCycleDate() {	 
   		return (substring(getStringValue(),beginSmmCycleDate,beginSmmCycleDate + SMM_CYCLE_DATE_LEN));
   	}
     int localSmmEndCounter = -1;
     public boolean isSmmEndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSmmEndCounter != sharedCounter;
         localSmmEndCounter = sharedCounter; return hasModified;
     }
	protected static final int SMM_END_LEN = 3;
	/**
	 * 	serialize this SmmEnd
	 */
   protected void serializeSmmEnd(char[] smmEnd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(smmEnd,0,getStringValue(),beginSmmEnd,SMM_END_LEN);
       localSmmEndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSmmEndConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSmmEnd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSmmEnd() {	 
   		return (substring(getStringValue(),beginSmmEnd,beginSmmEnd + SMM_END_LEN));
   	}




}
  
