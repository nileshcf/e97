package com.cloudframe.app.special2.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEdit;
            protected  int beginCnt2r;
            protected  int beginEdit2;
            protected  int beginCnt3r;
            protected  int beginEdit3;
            protected  int beginBhDisplay;
            protected  int beginBodyHeight;
            protected  int beginNumericFlag;
	
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
  
             beginEdit = getStartOffset() + 0;	// set offset for serialization
  
             beginCnt2r = getStartOffset() + 11;	// set offset for serialization
  
             beginEdit2 = getStartOffset() + 18;	// set offset for serialization
  
             beginCnt3r = getStartOffset() + 30;	// set offset for serialization
  
             beginEdit3 = getStartOffset() + 36;	// set offset for serialization
  
             beginBhDisplay = getStartOffset() + 44;	// set offset for serialization
  
             beginBodyHeight = getStartOffset() + 55;	// set offset for serialization
  
             beginNumericFlag = getStartOffset() + 64;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localCnt1rCounter = -1;
         public boolean isCnt1rModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCnt1rCounter != sharedCounter;
            localCnt1rCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCnt1rMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localEditCounter = -1;
     public boolean isEditModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEditCounter != sharedCounter;
         localEditCounter = sharedCounter; return hasModified;
     }
	protected static final int EDIT_LEN = 11;
	/**
	 * 	serialize this Edit
	 */
   protected void serializeEdit(char[] edit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(edit,0,getStringValue(),beginEdit,EDIT_LEN);
       localEditCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEditConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshEdit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEdit() {	 
   		return (substring(getStringValue(),beginEdit,beginEdit + EDIT_LEN));
   	}
        int localCnt2rCounter = -1;
        public boolean isCnt2rModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCnt2rCounter != sharedCounter;
           localCnt2rCounter = sharedCounter; return hasModified; 
        }
	    public boolean cnt2rIsNumeric() {
	      return decimalIsNumeric(beginCnt2r,CNT_2R_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] cnt2rString() {
            return getPackedString(beginCnt2r,CNT_2R_LEN);
         }
   protected static final int CNT_2R_LEN = 7;
   protected static final int CNT_2R_SCALE = 3;
  	/**
	 * 	serializeCnt2r
	 */
	protected void serializeCnt2r(BigDecimal cnt2r) {
		   putDecimal(beginCnt2r,cnt2r,CNT_2R_LEN,CNT_2R_SCALE,true);
		 localCnt2rCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkCnt2rMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshCnt2r is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshCnt2r() throws CFException {	
   	try { 
		 return (getDecimal(beginCnt2r,CNT_2R_LEN,CNT_2R_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("cnt2r", beginCnt2r,CNT_2R_LEN);
     }
   	}
     int localEdit2Counter = -1;
     public boolean isEdit2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEdit2Counter != sharedCounter;
         localEdit2Counter = sharedCounter; return hasModified;
     }
	protected static final int EDIT_2_LEN = 12;
	/**
	 * 	serialize this Edit2
	 */
   protected void serializeEdit2(char[] edit2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(edit2,0,getStringValue(),beginEdit2,EDIT_2_LEN);
       localEdit2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEdit2Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshEdit2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEdit2() {	 
   		return (substring(getStringValue(),beginEdit2,beginEdit2 + EDIT_2_LEN));
   	}
     int localCnt3rCounter = -1;
     
     public boolean isCnt3rModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCnt3rCounter != sharedCounter;
         localCnt3rCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of cnt3r
	 *	@return cnt3r
	 */
	public char[]  getCnt3rString() {
	    return getCharArray(beginCnt3r,CNT_3R_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cnt3rIsNumeric() {
		    return isNumeric(beginCnt3r
	                    ,beginCnt3r + CNT_3R_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int CNT_3R_LEN = 6;
  protected  static final int CNT_3R_SCALE = 2;

   protected BigDecimal checkCnt3rMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,6/*precision*/);
   }

  	/**
	 * serializeCnt3r
	 */
	protected void serializeCnt3r(BigDecimal cnt3r) {
	       putNumber(beginCnt3r,cnt3r,CNT_3R_LEN,CNT_3R_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCnt3rCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeCnt3r
	 */
   	protected  BigDecimal serializeCnt3r(char[] value) throws CFException {
        if (value.length < 6) value = pad(6, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginCnt3r
		       ,6
		      );		 localCnt3rCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,CNT_3R_LEN,CNT_3R_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("cnt3r", beginCnt3r,CNT_3R_LEN);
    	}
    }
    /**
	 *	refreshCnt3r is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshCnt3r() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginCnt3r
			            ,CNT_3R_LEN
			            ,CNT_3R_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("cnt3r", beginCnt3r,CNT_3R_LEN);
    }
   	}
     int localEdit3Counter = -1;
     public boolean isEdit3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEdit3Counter != sharedCounter;
         localEdit3Counter = sharedCounter; return hasModified;
     }
	protected static final int EDIT_3_LEN = 8;
	/**
	 * 	serialize this Edit3
	 */
   protected void serializeEdit3(char[] edit3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(edit3,0,getStringValue(),beginEdit3,EDIT_3_LEN);
       localEdit3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEdit3Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshEdit3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEdit3() {	 
   		return (substring(getStringValue(),beginEdit3,beginEdit3 + EDIT_3_LEN));
   	}
     int localBhDisplayCounter = -1;
     public boolean isBhDisplayModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBhDisplayCounter != sharedCounter;
         localBhDisplayCounter = sharedCounter; return hasModified;
     }
	protected static final int BH_DISPLAY_LEN = 11;
	/**
	 * 	serialize this BhDisplay
	 */
   protected void serializeBhDisplay(char[] bhDisplay) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bhDisplay,0,getStringValue(),beginBhDisplay,BH_DISPLAY_LEN);
       localBhDisplayCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBhDisplayConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshBhDisplay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBhDisplay() {	 
   		return (substring(getStringValue(),beginBhDisplay,beginBhDisplay + BH_DISPLAY_LEN));
   	}
     int localBodyHeightCounter = -1;
     
     public boolean isBodyHeightModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBodyHeightCounter != sharedCounter;
         localBodyHeightCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bodyHeight
	 *	@return bodyHeight
	 */
	public char[]  getBodyHeightString() {
	    return getCharArray(beginBodyHeight,BODY_HEIGHT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bodyHeightIsNumeric() {
		    return isNumeric(beginBodyHeight
	                    ,beginBodyHeight + BODY_HEIGHT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BODY_HEIGHT_LEN = 9;
  protected  static final int BODY_HEIGHT_SCALE = 4;

   protected BigDecimal checkBodyHeightMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,9/*precision*/);
   }

  	/**
	 * serializeBodyHeight
	 */
	protected void serializeBodyHeight(BigDecimal bodyHeight) {
	       putNumber(beginBodyHeight,bodyHeight,BODY_HEIGHT_LEN,BODY_HEIGHT_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBodyHeightCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBodyHeight
	 */
   	protected  BigDecimal serializeBodyHeight(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginBodyHeight
		       ,9
		      );		 localBodyHeightCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BODY_HEIGHT_LEN,BODY_HEIGHT_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bodyHeight", beginBodyHeight,BODY_HEIGHT_LEN);
    	}
    }
    /**
	 *	refreshBodyHeight is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBodyHeight() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBodyHeight
			            ,BODY_HEIGHT_LEN
			            ,BODY_HEIGHT_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bodyHeight", beginBodyHeight,BODY_HEIGHT_LEN);
    }
   	}
     int localNumericFlagCounter = -1;
     
     public boolean isNumericFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNumericFlagCounter != sharedCounter;
         localNumericFlagCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of numericFlag
	 *	@return numericFlag
	 */
	public char[]  getNumericFlagString() {
	    return getCharArray(beginNumericFlag,NUMERIC_FLAG_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean numericFlagIsNumeric() {
		    return isNumeric(beginNumericFlag
	                    ,beginNumericFlag + NUMERIC_FLAG_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int NUMERIC_FLAG_LEN = 6;
  protected  static final int NUMERIC_FLAG_SCALE = 2;

   protected BigDecimal checkNumericFlagMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,6/*precision*/);
   }

  	/**
	 * serializeNumericFlag
	 */
	protected void serializeNumericFlag(BigDecimal numericFlag) {
	       putNumber(beginNumericFlag,numericFlag,NUMERIC_FLAG_LEN,NUMERIC_FLAG_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNumericFlagCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeNumericFlag
	 */
   	protected  BigDecimal serializeNumericFlag(char[] value) throws CFException {
        if (value.length < 6) value = pad(6, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginNumericFlag
		       ,6
		      );		 localNumericFlagCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,NUMERIC_FLAG_LEN,NUMERIC_FLAG_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("numericFlag", beginNumericFlag,NUMERIC_FLAG_LEN);
    	}
    }
    /**
	 *	refreshNumericFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshNumericFlag() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginNumericFlag
			            ,NUMERIC_FLAG_LEN
			            ,NUMERIC_FLAG_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("numericFlag", beginNumericFlag,NUMERIC_FLAG_LEN);
    }
   	}




}
  
