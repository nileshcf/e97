package com.cloudframe.app.move0.dto.serialize;

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
	protected static final int WORK_LENGTH = 267;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSub1;
            protected  int beginNumDisp1;
            protected  int beginNumDec1;
            protected  int beginNumDisp2;
            protected  int beginNumDec2;
            protected  int beginEdit;
            protected  int beginNumDisp3;
            protected  int beginNumDec3;
            protected  int beginNumDisp4;
            protected  int beginNumDec4;
            protected  int beginD10;
            protected  int beginD20;
            protected  int beginD30;
            protected  int beginD40;
            protected  int beginD50;
            protected  int beginD60;
            protected  int beginD70;
            protected  int beginD80;
            protected  int beginD11;
            protected  int beginD21;
            protected  int beginD31;
            protected  int beginD41;
            protected  int beginD51;
            protected  int beginD61;
            protected  int beginD71;
            protected  int beginD81;
            protected  int beginP10;
            protected  int beginP20;
            protected  int beginP30;
            protected  int beginP40;
            protected  int beginP50;
            protected  int beginP60;
            protected  int beginP70;
            protected  int beginP80;
            protected  int beginP11;
            protected  int beginP21;
            protected  int beginP31;
            protected  int beginP41;
            protected  int beginP51;
            protected  int beginP61;
            protected  int beginP71;
            protected  int beginP81;
	
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
             beginSub1 = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
             beginNumDisp1 = getStartOffset() + 2;	// set offset for serialization
  
             beginNumDec1 = getStartOffset() + 11;	// set offset for serialization
  
  
  
  
             beginNumDisp2 = getStartOffset() + 16;	// set offset for serialization
  
             beginNumDec2 = getStartOffset() + 25;	// set offset for serialization
  
  
  
  
             beginEdit = getStartOffset() + 30;	// set offset for serialization
  
             beginNumDisp3 = getStartOffset() + 51;	// set offset for serialization
  
             beginNumDec3 = getStartOffset() + 60;	// set offset for serialization
  
  
  
  
             beginNumDisp4 = getStartOffset() + 65;	// set offset for serialization
  
             beginNumDec4 = getStartOffset() + 74;	// set offset for serialization
  
  
  
  
  
  
             beginD10 = getStartOffset() + 79;	// set offset for serialization
  
             beginD20 = getStartOffset() + 88;	// set offset for serialization
  
             beginD30 = getStartOffset() + 93;	// set offset for serialization
  
             beginD40 = getStartOffset() + 103;	// set offset for serialization
  
             beginD50 = getStartOffset() + 115;	// set offset for serialization
  
             beginD60 = getStartOffset() + 123;	// set offset for serialization
  
             beginD70 = getStartOffset() + 130;	// set offset for serialization
  
             beginD80 = getStartOffset() + 135;	// set offset for serialization
  
             beginD11 = getStartOffset() + 138;	// set offset for serialization
  
             beginD21 = getStartOffset() + 147;	// set offset for serialization
  
             beginD31 = getStartOffset() + 152;	// set offset for serialization
  
             beginD41 = getStartOffset() + 162;	// set offset for serialization
  
             beginD51 = getStartOffset() + 174;	// set offset for serialization
  
             beginD61 = getStartOffset() + 182;	// set offset for serialization
  
             beginD71 = getStartOffset() + 189;	// set offset for serialization
  
             beginD81 = getStartOffset() + 194;	// set offset for serialization
  
             beginP10 = getStartOffset() + 197;	// set offset for serialization
  
             beginP20 = getStartOffset() + 202;	// set offset for serialization
  
             beginP30 = getStartOffset() + 205;	// set offset for serialization
  
             beginP40 = getStartOffset() + 211;	// set offset for serialization
  
             beginP50 = getStartOffset() + 218;	// set offset for serialization
  
             beginP60 = getStartOffset() + 223;	// set offset for serialization
  
             beginP70 = getStartOffset() + 227;	// set offset for serialization
  
             beginP80 = getStartOffset() + 230;	// set offset for serialization
  
             beginP11 = getStartOffset() + 232;	// set offset for serialization
  
             beginP21 = getStartOffset() + 237;	// set offset for serialization
  
             beginP31 = getStartOffset() + 240;	// set offset for serialization
  
             beginP41 = getStartOffset() + 246;	// set offset for serialization
  
             beginP51 = getStartOffset() + 253;	// set offset for serialization
  
             beginP61 = getStartOffset() + 258;	// set offset for serialization
  
             beginP71 = getStartOffset() + 262;	// set offset for serialization
  
             beginP81 = getStartOffset() + 265;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSub1Counter = -1;
     public boolean isSub1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1Counter != sharedCounter;
         localSub1Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sub1
	 *	@return sub1
	 */
	public char[]  getSub1String() {
	     return getCharArray(beginSub1,SUB_1_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sub1IsNumeric() {
	    return isNumeric(beginSub1
	                    ,beginSub1 + SUB_1_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SUB_1_LEN = 2;
  	/**
	 * serializeSub1
	 */
	protected void serializeSub1(int sub1) {
		 putNumber(beginSub1,sub1,SUB_1_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSub1Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSub1
	 */
   	protected  int serializeSub1(char[] value) {
	    int  sub1;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sub1 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginSub1
		       ,2
		      );
		 localSub1Counter = shareString.getSerializedField().getModifiedCounter();
		return  sub1;
    }

   protected int checkSub1MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSub1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSub1() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSub1
			                 ,SUB_1_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sub1", beginSub1,SUB_1_LEN);
    }
   	}
     int localLabelCounter = -1;
     public boolean isLabelModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLabelCounter != sharedCounter;
         localLabelCounter = sharedCounter; return hasModified;
     }

   protected char[] checkLabelConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
     int localWrkaApplicationCounter = -1;
     public boolean isWrkaApplicationModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWrkaApplicationCounter != sharedCounter;
         localWrkaApplicationCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWrkaApplicationConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localRl6bfMonthlyAllowText1Counter = -1;
     public boolean isRl6bfMonthlyAllowText1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRl6bfMonthlyAllowText1Counter != sharedCounter;
         localRl6bfMonthlyAllowText1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRl6bfMonthlyAllowText1Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
     int localLkplanDataAllowUomCounter = -1;
     public boolean isLkplanDataAllowUomModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLkplanDataAllowUomCounter != sharedCounter;
         localLkplanDataAllowUomCounter = sharedCounter; return hasModified;
     }

   protected char[] checkLkplanDataAllowUomConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localNumDisp1Counter = -1;
     
     public boolean isNumDisp1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNumDisp1Counter != sharedCounter;
         localNumDisp1Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of numDisp1
	 *	@return numDisp1
	 */
	public char[]  getNumDisp1String() {
	    return getCharArray(beginNumDisp1,NUM_DISP_1_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean numDisp1IsNumeric() {
		    return isNumeric(beginNumDisp1
	                    ,beginNumDisp1 + NUM_DISP_1_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int NUM_DISP_1_LEN = 9;
  protected  static final int NUM_DISP_1_SCALE = 4;

   protected BigDecimal checkNumDisp1MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,9/*precision*/);
   }

  	/**
	 * serializeNumDisp1
	 */
	protected void serializeNumDisp1(BigDecimal numDisp1) {
	       putNumber(beginNumDisp1,numDisp1,NUM_DISP_1_LEN,NUM_DISP_1_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNumDisp1Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeNumDisp1
	 */
   	protected  BigDecimal serializeNumDisp1(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginNumDisp1
		       ,9
		      );		 localNumDisp1Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,NUM_DISP_1_LEN,NUM_DISP_1_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("numDisp1", beginNumDisp1,NUM_DISP_1_LEN);
    	}
    }
    /**
	 *	refreshNumDisp1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshNumDisp1() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginNumDisp1
			            ,NUM_DISP_1_LEN
			            ,NUM_DISP_1_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("numDisp1", beginNumDisp1,NUM_DISP_1_LEN);
    }
   	}
        int localNumDec1Counter = -1;
        public boolean isNumDec1Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localNumDec1Counter != sharedCounter;
           localNumDec1Counter = sharedCounter; return hasModified; 
        }
	    public boolean numDec1IsNumeric() {
	      return decimalIsNumeric(beginNumDec1,NUM_DEC_1_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] numDec1String() {
            return getPackedString(beginNumDec1,NUM_DEC_1_LEN);
         }
   protected static final int NUM_DEC_1_LEN = 5;
   protected static final int NUM_DEC_1_SCALE = 4;
  	/**
	 * 	serializeNumDec1
	 */
	protected void serializeNumDec1(BigDecimal numDec1) {
		   putDecimal(beginNumDec1,numDec1,NUM_DEC_1_LEN,NUM_DEC_1_SCALE,false);
		 localNumDec1Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkNumDec1MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshNumDec1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshNumDec1() throws CFException {	
   	try { 
		 return (getDecimal(beginNumDec1,NUM_DEC_1_LEN,NUM_DEC_1_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("numDec1", beginNumDec1,NUM_DEC_1_LEN);
     }
   	}
         int localInt1Counter = -1;
         public boolean isInt1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localInt1Counter != sharedCounter;
            localInt1Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkInt1MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localShort1Counter = -1;
         public boolean isShort1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localShort1Counter != sharedCounter;
            localShort1Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkShort1MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localLong1Counter = -1;
         public boolean isLong1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLong1Counter != sharedCounter;
            localLong1Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkLong1MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localNumDisp2Counter = -1;
     
     public boolean isNumDisp2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNumDisp2Counter != sharedCounter;
         localNumDisp2Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of numDisp2
	 *	@return numDisp2
	 */
	public char[]  getNumDisp2String() {
	    return getCharArray(beginNumDisp2,NUM_DISP_2_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean numDisp2IsNumeric() {
		    return isNumeric(beginNumDisp2
	                    ,beginNumDisp2 + NUM_DISP_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int NUM_DISP_2_LEN = 9;
  protected  static final int NUM_DISP_2_SCALE = 4;

   protected BigDecimal checkNumDisp2MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,9/*precision*/);
   }

  	/**
	 * serializeNumDisp2
	 */
	protected void serializeNumDisp2(BigDecimal numDisp2) {
	       putNumber(beginNumDisp2,numDisp2,NUM_DISP_2_LEN,NUM_DISP_2_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNumDisp2Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeNumDisp2
	 */
   	protected  BigDecimal serializeNumDisp2(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginNumDisp2
		       ,9
		      );		 localNumDisp2Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,NUM_DISP_2_LEN,NUM_DISP_2_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("numDisp2", beginNumDisp2,NUM_DISP_2_LEN);
    	}
    }
    /**
	 *	refreshNumDisp2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshNumDisp2() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginNumDisp2
			            ,NUM_DISP_2_LEN
			            ,NUM_DISP_2_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("numDisp2", beginNumDisp2,NUM_DISP_2_LEN);
    }
   	}
        int localNumDec2Counter = -1;
        public boolean isNumDec2Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localNumDec2Counter != sharedCounter;
           localNumDec2Counter = sharedCounter; return hasModified; 
        }
	    public boolean numDec2IsNumeric() {
	      return decimalIsNumeric(beginNumDec2,NUM_DEC_2_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] numDec2String() {
            return getPackedString(beginNumDec2,NUM_DEC_2_LEN);
         }
   protected static final int NUM_DEC_2_LEN = 5;
   protected static final int NUM_DEC_2_SCALE = 4;
  	/**
	 * 	serializeNumDec2
	 */
	protected void serializeNumDec2(BigDecimal numDec2) {
		   putDecimal(beginNumDec2,numDec2,NUM_DEC_2_LEN,NUM_DEC_2_SCALE,false);
		 localNumDec2Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkNumDec2MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshNumDec2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshNumDec2() throws CFException {	
   	try { 
		 return (getDecimal(beginNumDec2,NUM_DEC_2_LEN,NUM_DEC_2_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("numDec2", beginNumDec2,NUM_DEC_2_LEN);
     }
   	}
         int localInt2Counter = -1;
         public boolean isInt2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localInt2Counter != sharedCounter;
            localInt2Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkInt2MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localShort2Counter = -1;
         public boolean isShort2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localShort2Counter != sharedCounter;
            localShort2Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkShort2MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localLong2Counter = -1;
         public boolean isLong2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLong2Counter != sharedCounter;
            localLong2Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkLong2MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localEditCounter = -1;
     public boolean isEditModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEditCounter != sharedCounter;
         localEditCounter = sharedCounter; return hasModified;
     }
	protected static final int EDIT_LEN = 21;
	/**
	 * 	serialize this Edit
	 */
   protected void serializeEdit(char[] edit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(edit,0,getStringValue(),beginEdit,EDIT_LEN);
       localEditCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEditConstraints(char[] value) {
   			return super.checkConstraints(value , 21 ,false, false);
   }
    /**
	 *	refreshEdit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEdit() {	 
   		return (substring(getStringValue(),beginEdit,beginEdit + EDIT_LEN));
   	}
     int localNumDisp3Counter = -1;
     
     public boolean isNumDisp3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNumDisp3Counter != sharedCounter;
         localNumDisp3Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of numDisp3
	 *	@return numDisp3
	 */
	public char[]  getNumDisp3String() {
	    return getCharArray(beginNumDisp3,NUM_DISP_3_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean numDisp3IsNumeric() {
		    return isNumeric(beginNumDisp3
	                    ,beginNumDisp3 + NUM_DISP_3_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int NUM_DISP_3_LEN = 9;
  protected  static final int NUM_DISP_3_SCALE = 4;

   protected BigDecimal checkNumDisp3MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,9/*precision*/);
   }

  	/**
	 * serializeNumDisp3
	 */
	protected void serializeNumDisp3(BigDecimal numDisp3) {
	       putNumber(beginNumDisp3,numDisp3,NUM_DISP_3_LEN,NUM_DISP_3_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNumDisp3Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeNumDisp3
	 */
   	protected  BigDecimal serializeNumDisp3(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginNumDisp3
		       ,9
		      );		 localNumDisp3Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,NUM_DISP_3_LEN,NUM_DISP_3_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("numDisp3", beginNumDisp3,NUM_DISP_3_LEN);
    	}
    }
    /**
	 *	refreshNumDisp3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshNumDisp3() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginNumDisp3
			            ,NUM_DISP_3_LEN
			            ,NUM_DISP_3_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("numDisp3", beginNumDisp3,NUM_DISP_3_LEN);
    }
   	}
        int localNumDec3Counter = -1;
        public boolean isNumDec3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localNumDec3Counter != sharedCounter;
           localNumDec3Counter = sharedCounter; return hasModified; 
        }
	    public boolean numDec3IsNumeric() {
	      return decimalIsNumeric(beginNumDec3,NUM_DEC_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] numDec3String() {
            return getPackedString(beginNumDec3,NUM_DEC_3_LEN);
         }
   protected static final int NUM_DEC_3_LEN = 5;
   protected static final int NUM_DEC_3_SCALE = 4;
  	/**
	 * 	serializeNumDec3
	 */
	protected void serializeNumDec3(BigDecimal numDec3) {
		   putDecimal(beginNumDec3,numDec3,NUM_DEC_3_LEN,NUM_DEC_3_SCALE,true);
		 localNumDec3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkNumDec3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshNumDec3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshNumDec3() throws CFException {	
   	try { 
		 return (getDecimal(beginNumDec3,NUM_DEC_3_LEN,NUM_DEC_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("numDec3", beginNumDec3,NUM_DEC_3_LEN);
     }
   	}
         int localInt3Counter = -1;
         public boolean isInt3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localInt3Counter != sharedCounter;
            localInt3Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkInt3MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localShort3Counter = -1;
         public boolean isShort3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localShort3Counter != sharedCounter;
            localShort3Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkShort3MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localLong3Counter = -1;
         public boolean isLong3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLong3Counter != sharedCounter;
            localLong3Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkLong3MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     int localNumDisp4Counter = -1;
     
     public boolean isNumDisp4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNumDisp4Counter != sharedCounter;
         localNumDisp4Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of numDisp4
	 *	@return numDisp4
	 */
	public char[]  getNumDisp4String() {
	    return getCharArray(beginNumDisp4,NUM_DISP_4_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean numDisp4IsNumeric() {
		    return isNumeric(beginNumDisp4
	                    ,beginNumDisp4 + NUM_DISP_4_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int NUM_DISP_4_LEN = 9;
  protected  static final int NUM_DISP_4_SCALE = 4;

   protected BigDecimal checkNumDisp4MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,9/*precision*/);
   }

  	/**
	 * serializeNumDisp4
	 */
	protected void serializeNumDisp4(BigDecimal numDisp4) {
	       putNumber(beginNumDisp4,numDisp4,NUM_DISP_4_LEN,NUM_DISP_4_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNumDisp4Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeNumDisp4
	 */
   	protected  BigDecimal serializeNumDisp4(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginNumDisp4
		       ,9
		      );		 localNumDisp4Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,NUM_DISP_4_LEN,NUM_DISP_4_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("numDisp4", beginNumDisp4,NUM_DISP_4_LEN);
    	}
    }
    /**
	 *	refreshNumDisp4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshNumDisp4() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginNumDisp4
			            ,NUM_DISP_4_LEN
			            ,NUM_DISP_4_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("numDisp4", beginNumDisp4,NUM_DISP_4_LEN);
    }
   	}
        int localNumDec4Counter = -1;
        public boolean isNumDec4Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localNumDec4Counter != sharedCounter;
           localNumDec4Counter = sharedCounter; return hasModified; 
        }
	    public boolean numDec4IsNumeric() {
	      return decimalIsNumeric(beginNumDec4,NUM_DEC_4_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] numDec4String() {
            return getPackedString(beginNumDec4,NUM_DEC_4_LEN);
         }
   protected static final int NUM_DEC_4_LEN = 5;
   protected static final int NUM_DEC_4_SCALE = 4;
  	/**
	 * 	serializeNumDec4
	 */
	protected void serializeNumDec4(BigDecimal numDec4) {
		   putDecimal(beginNumDec4,numDec4,NUM_DEC_4_LEN,NUM_DEC_4_SCALE,true);
		 localNumDec4Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkNumDec4MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshNumDec4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshNumDec4() throws CFException {	
   	try { 
		 return (getDecimal(beginNumDec4,NUM_DEC_4_LEN,NUM_DEC_4_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("numDec4", beginNumDec4,NUM_DEC_4_LEN);
     }
   	}
         int localInt4Counter = -1;
         public boolean isInt4Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localInt4Counter != sharedCounter;
            localInt4Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkInt4MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localShort4Counter = -1;
         public boolean isShort4Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localShort4Counter != sharedCounter;
            localShort4Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkShort4MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localLong4Counter = -1;
         public boolean isLong4Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLong4Counter != sharedCounter;
            localLong4Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkLong4MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     int localBeginningCounter = -1;
     public boolean isBeginningModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBeginningCounter != sharedCounter;
         localBeginningCounter = sharedCounter; return hasModified;
     }

   protected char[] checkBeginningConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localEndingCounter = -1;
     public boolean isEndingModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndingCounter != sharedCounter;
         localEndingCounter = sharedCounter; return hasModified;
     }

   protected char[] checkEndingConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localD10Counter = -1;
     
     public boolean isD10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD10Counter != sharedCounter;
         localD10Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of d10
	 *	@return d10
	 */
	public char[]  getD10String() {
	    return getCharArray(beginD10,D_10_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d10IsNumeric() {
		    return isNumeric(beginD10
	                    ,beginD10 + D_10_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int D_10_LEN = 9;
  protected  static final int D_10_SCALE = 5;

   protected BigDecimal checkD10MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,5/*scale*/,9/*precision*/);
   }

  	/**
	 * serializeD10
	 */
	protected void serializeD10(BigDecimal d10) {
	       putNumber(beginD10,d10,D_10_LEN,D_10_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD10Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeD10
	 */
   	protected  BigDecimal serializeD10(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginD10
		       ,9
		      );		 localD10Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,D_10_LEN,D_10_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("d10", beginD10,D_10_LEN);
    	}
    }
    /**
	 *	refreshD10 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshD10() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginD10
			            ,D_10_LEN
			            ,D_10_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("d10", beginD10,D_10_LEN);
    }
   	}
     int localD20Counter = -1;
     
     public boolean isD20Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD20Counter != sharedCounter;
         localD20Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of d20
	 *	@return d20
	 */
	public char[]  getD20String() {
	    return getCharArray(beginD20,D_20_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d20IsNumeric() {
		    return isNumeric(beginD20
	                    ,beginD20 + D_20_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int D_20_LEN = 5;
  protected  static final int D_20_SCALE = 1;

   protected BigDecimal checkD20MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,1/*scale*/,5/*precision*/);
   }

  	/**
	 * serializeD20
	 */
	protected void serializeD20(BigDecimal d20) {
	       putNumber(beginD20,d20,D_20_LEN,D_20_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD20Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeD20
	 */
   	protected  BigDecimal serializeD20(char[] value) throws CFException {
        if (value.length < 5) value = pad(5, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(5,value,true/*isSigned?*/)
		       ,beginD20
		       ,5
		      );		 localD20Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,D_20_LEN,D_20_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("d20", beginD20,D_20_LEN);
    	}
    }
    /**
	 *	refreshD20 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshD20() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginD20
			            ,D_20_LEN
			            ,D_20_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("d20", beginD20,D_20_LEN);
    }
   	}
     int localD30Counter = -1;
     
     public boolean isD30Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD30Counter != sharedCounter;
         localD30Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of d30
	 *	@return d30
	 */
	public char[]  getD30String() {
	    return getCharArray(beginD30,D_30_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d30IsNumeric() {
		    return isNumeric(beginD30
	                    ,beginD30 + D_30_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int D_30_LEN = 10;
  protected  static final int D_30_SCALE = 3;

   protected BigDecimal checkD30MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,10/*precision*/);
   }

  	/**
	 * serializeD30
	 */
	protected void serializeD30(BigDecimal d30) {
	       putNumber(beginD30,d30,D_30_LEN,D_30_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD30Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeD30
	 */
   	protected  BigDecimal serializeD30(char[] value) throws CFException {
        if (value.length < 10) value = pad(10, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginD30
		       ,10
		      );		 localD30Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,D_30_LEN,D_30_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("d30", beginD30,D_30_LEN);
    	}
    }
    /**
	 *	refreshD30 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshD30() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginD30
			            ,D_30_LEN
			            ,D_30_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("d30", beginD30,D_30_LEN);
    }
   	}
     int localD40Counter = -1;
     
     public boolean isD40Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD40Counter != sharedCounter;
         localD40Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of d40
	 *	@return d40
	 */
	public char[]  getD40String() {
	    return getCharArray(beginD40,D_40_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d40IsNumeric() {
		    return isNumeric(beginD40
	                    ,beginD40 + D_40_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int D_40_LEN = 12;
  protected  static final int D_40_SCALE = 5;

   protected BigDecimal checkD40MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,5/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeD40
	 */
	protected void serializeD40(BigDecimal d40) {
	       putNumber(beginD40,d40,D_40_LEN,D_40_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD40Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeD40
	 */
   	protected  BigDecimal serializeD40(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,true/*isSigned?*/)
		       ,beginD40
		       ,12
		      );		 localD40Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,D_40_LEN,D_40_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("d40", beginD40,D_40_LEN);
    	}
    }
    /**
	 *	refreshD40 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshD40() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginD40
			            ,D_40_LEN
			            ,D_40_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("d40", beginD40,D_40_LEN);
    }
   	}
     int localD50Counter = -1;
     
     public boolean isD50Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD50Counter != sharedCounter;
         localD50Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of d50
	 *	@return d50
	 */
	public char[]  getD50String() {
	    return getCharArray(beginD50,D_50_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d50IsNumeric() {
		    return isNumeric(beginD50
	                    ,beginD50 + D_50_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int D_50_LEN = 8;
  protected  static final int D_50_SCALE = 1;

   protected BigDecimal checkD50MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,1/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeD50
	 */
	protected void serializeD50(BigDecimal d50) {
	       putNumber(beginD50,d50,D_50_LEN,D_50_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD50Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeD50
	 */
   	protected  BigDecimal serializeD50(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginD50
		       ,8
		      );		 localD50Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,D_50_LEN,D_50_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("d50", beginD50,D_50_LEN);
    	}
    }
    /**
	 *	refreshD50 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshD50() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginD50
			            ,D_50_LEN
			            ,D_50_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("d50", beginD50,D_50_LEN);
    }
   	}
     int localD60Counter = -1;
     
     public boolean isD60Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD60Counter != sharedCounter;
         localD60Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of d60
	 *	@return d60
	 */
	public char[]  getD60String() {
	    return getCharArray(beginD60,D_60_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d60IsNumeric() {
		    return isNumeric(beginD60
	                    ,beginD60 + D_60_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int D_60_LEN = 7;
  protected  static final int D_60_SCALE = 5;

   protected BigDecimal checkD60MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,5/*scale*/,7/*precision*/);
   }

  	/**
	 * serializeD60
	 */
	protected void serializeD60(BigDecimal d60) {
	       putNumber(beginD60,d60,D_60_LEN,D_60_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD60Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeD60
	 */
   	protected  BigDecimal serializeD60(char[] value) throws CFException {
        if (value.length < 7) value = pad(7, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(7,value,true/*isSigned?*/)
		       ,beginD60
		       ,7
		      );		 localD60Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,D_60_LEN,D_60_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("d60", beginD60,D_60_LEN);
    	}
    }
    /**
	 *	refreshD60 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshD60() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginD60
			            ,D_60_LEN
			            ,D_60_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("d60", beginD60,D_60_LEN);
    }
   	}
     int localD70Counter = -1;
     
     public boolean isD70Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD70Counter != sharedCounter;
         localD70Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of d70
	 *	@return d70
	 */
	public char[]  getD70String() {
	    return getCharArray(beginD70,D_70_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d70IsNumeric() {
		    return isNumeric(beginD70
	                    ,beginD70 + D_70_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int D_70_LEN = 5;
  protected  static final int D_70_SCALE = 3;

   protected BigDecimal checkD70MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,5/*precision*/);
   }

  	/**
	 * serializeD70
	 */
	protected void serializeD70(BigDecimal d70) {
	       putNumber(beginD70,d70,D_70_LEN,D_70_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD70Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeD70
	 */
   	protected  BigDecimal serializeD70(char[] value) throws CFException {
        if (value.length < 5) value = pad(5, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(5,value,true/*isSigned?*/)
		       ,beginD70
		       ,5
		      );		 localD70Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,D_70_LEN,D_70_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("d70", beginD70,D_70_LEN);
    	}
    }
    /**
	 *	refreshD70 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshD70() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginD70
			            ,D_70_LEN
			            ,D_70_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("d70", beginD70,D_70_LEN);
    }
   	}
     int localD80Counter = -1;
     
     public boolean isD80Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD80Counter != sharedCounter;
         localD80Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of d80
	 *	@return d80
	 */
	public char[]  getD80String() {
	    return getCharArray(beginD80,D_80_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d80IsNumeric() {
		    return isNumeric(beginD80
	                    ,beginD80 + D_80_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int D_80_LEN = 3;
  protected  static final int D_80_SCALE = 1;

   protected BigDecimal checkD80MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,1/*scale*/,3/*precision*/);
   }

  	/**
	 * serializeD80
	 */
	protected void serializeD80(BigDecimal d80) {
	       putNumber(beginD80,d80,D_80_LEN,D_80_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD80Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeD80
	 */
   	protected  BigDecimal serializeD80(char[] value) throws CFException {
        if (value.length < 3) value = pad(3, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(3,value,true/*isSigned?*/)
		       ,beginD80
		       ,3
		      );		 localD80Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,D_80_LEN,D_80_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("d80", beginD80,D_80_LEN);
    	}
    }
    /**
	 *	refreshD80 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshD80() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginD80
			            ,D_80_LEN
			            ,D_80_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("d80", beginD80,D_80_LEN);
    }
   	}
     int localD11Counter = -1;
     
     public boolean isD11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD11Counter != sharedCounter;
         localD11Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of d11
	 *	@return d11
	 */
	public char[]  getD11String() {
	    return getCharArray(beginD11,D_11_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d11IsNumeric() {
		    return isNumeric(beginD11
	                    ,beginD11 + D_11_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int D_11_LEN = 9;
  protected  static final int D_11_SCALE = 5;

   protected BigDecimal checkD11MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,5/*scale*/,9/*precision*/);
   }

  	/**
	 * serializeD11
	 */
	protected void serializeD11(BigDecimal d11) {
	       putNumber(beginD11,d11,D_11_LEN,D_11_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD11Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeD11
	 */
   	protected  BigDecimal serializeD11(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginD11
		       ,9
		      );		 localD11Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,D_11_LEN,D_11_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("d11", beginD11,D_11_LEN);
    	}
    }
    /**
	 *	refreshD11 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshD11() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginD11
			            ,D_11_LEN
			            ,D_11_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("d11", beginD11,D_11_LEN);
    }
   	}
     int localD21Counter = -1;
     
     public boolean isD21Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD21Counter != sharedCounter;
         localD21Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of d21
	 *	@return d21
	 */
	public char[]  getD21String() {
	    return getCharArray(beginD21,D_21_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d21IsNumeric() {
		    return isNumeric(beginD21
	                    ,beginD21 + D_21_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int D_21_LEN = 5;
  protected  static final int D_21_SCALE = 1;

   protected BigDecimal checkD21MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,1/*scale*/,5/*precision*/);
   }

  	/**
	 * serializeD21
	 */
	protected void serializeD21(BigDecimal d21) {
	       putNumber(beginD21,d21,D_21_LEN,D_21_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD21Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeD21
	 */
   	protected  BigDecimal serializeD21(char[] value) throws CFException {
        if (value.length < 5) value = pad(5, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginD21
		       ,5
		      );		 localD21Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,D_21_LEN,D_21_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("d21", beginD21,D_21_LEN);
    	}
    }
    /**
	 *	refreshD21 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshD21() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginD21
			            ,D_21_LEN
			            ,D_21_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("d21", beginD21,D_21_LEN);
    }
   	}
     int localD31Counter = -1;
     
     public boolean isD31Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD31Counter != sharedCounter;
         localD31Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of d31
	 *	@return d31
	 */
	public char[]  getD31String() {
	    return getCharArray(beginD31,D_31_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d31IsNumeric() {
		    return isNumeric(beginD31
	                    ,beginD31 + D_31_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int D_31_LEN = 10;
  protected  static final int D_31_SCALE = 3;

   protected BigDecimal checkD31MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,10/*precision*/);
   }

  	/**
	 * serializeD31
	 */
	protected void serializeD31(BigDecimal d31) {
	       putNumber(beginD31,d31,D_31_LEN,D_31_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD31Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeD31
	 */
   	protected  BigDecimal serializeD31(char[] value) throws CFException {
        if (value.length < 10) value = pad(10, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginD31
		       ,10
		      );		 localD31Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,D_31_LEN,D_31_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("d31", beginD31,D_31_LEN);
    	}
    }
    /**
	 *	refreshD31 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshD31() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginD31
			            ,D_31_LEN
			            ,D_31_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("d31", beginD31,D_31_LEN);
    }
   	}
     int localD41Counter = -1;
     
     public boolean isD41Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD41Counter != sharedCounter;
         localD41Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of d41
	 *	@return d41
	 */
	public char[]  getD41String() {
	    return getCharArray(beginD41,D_41_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d41IsNumeric() {
		    return isNumeric(beginD41
	                    ,beginD41 + D_41_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int D_41_LEN = 12;
  protected  static final int D_41_SCALE = 5;

   protected BigDecimal checkD41MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,5/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeD41
	 */
	protected void serializeD41(BigDecimal d41) {
	       putNumber(beginD41,d41,D_41_LEN,D_41_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD41Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeD41
	 */
   	protected  BigDecimal serializeD41(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginD41
		       ,12
		      );		 localD41Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,D_41_LEN,D_41_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("d41", beginD41,D_41_LEN);
    	}
    }
    /**
	 *	refreshD41 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshD41() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginD41
			            ,D_41_LEN
			            ,D_41_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("d41", beginD41,D_41_LEN);
    }
   	}
     int localD51Counter = -1;
     
     public boolean isD51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51Counter != sharedCounter;
         localD51Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of d51
	 *	@return d51
	 */
	public char[]  getD51String() {
	    return getCharArray(beginD51,D_51_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d51IsNumeric() {
		    return isNumeric(beginD51
	                    ,beginD51 + D_51_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int D_51_LEN = 8;
  protected  static final int D_51_SCALE = 1;

   protected BigDecimal checkD51MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,1/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeD51
	 */
	protected void serializeD51(BigDecimal d51) {
	       putNumber(beginD51,d51,D_51_LEN,D_51_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD51Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeD51
	 */
   	protected  BigDecimal serializeD51(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginD51
		       ,8
		      );		 localD51Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,D_51_LEN,D_51_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("d51", beginD51,D_51_LEN);
    	}
    }
    /**
	 *	refreshD51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshD51() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginD51
			            ,D_51_LEN
			            ,D_51_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("d51", beginD51,D_51_LEN);
    }
   	}
     int localD61Counter = -1;
     
     public boolean isD61Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD61Counter != sharedCounter;
         localD61Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of d61
	 *	@return d61
	 */
	public char[]  getD61String() {
	    return getCharArray(beginD61,D_61_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d61IsNumeric() {
		    return isNumeric(beginD61
	                    ,beginD61 + D_61_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int D_61_LEN = 7;
  protected  static final int D_61_SCALE = 5;

   protected BigDecimal checkD61MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,5/*scale*/,7/*precision*/);
   }

  	/**
	 * serializeD61
	 */
	protected void serializeD61(BigDecimal d61) {
	       putNumber(beginD61,d61,D_61_LEN,D_61_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD61Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeD61
	 */
   	protected  BigDecimal serializeD61(char[] value) throws CFException {
        if (value.length < 7) value = pad(7, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginD61
		       ,7
		      );		 localD61Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,D_61_LEN,D_61_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("d61", beginD61,D_61_LEN);
    	}
    }
    /**
	 *	refreshD61 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshD61() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginD61
			            ,D_61_LEN
			            ,D_61_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("d61", beginD61,D_61_LEN);
    }
   	}
     int localD71Counter = -1;
     
     public boolean isD71Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD71Counter != sharedCounter;
         localD71Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of d71
	 *	@return d71
	 */
	public char[]  getD71String() {
	    return getCharArray(beginD71,D_71_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d71IsNumeric() {
		    return isNumeric(beginD71
	                    ,beginD71 + D_71_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int D_71_LEN = 5;
  protected  static final int D_71_SCALE = 3;

   protected BigDecimal checkD71MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,5/*precision*/);
   }

  	/**
	 * serializeD71
	 */
	protected void serializeD71(BigDecimal d71) {
	       putNumber(beginD71,d71,D_71_LEN,D_71_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD71Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeD71
	 */
   	protected  BigDecimal serializeD71(char[] value) throws CFException {
        if (value.length < 5) value = pad(5, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginD71
		       ,5
		      );		 localD71Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,D_71_LEN,D_71_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("d71", beginD71,D_71_LEN);
    	}
    }
    /**
	 *	refreshD71 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshD71() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginD71
			            ,D_71_LEN
			            ,D_71_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("d71", beginD71,D_71_LEN);
    }
   	}
     int localD81Counter = -1;
     
     public boolean isD81Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD81Counter != sharedCounter;
         localD81Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of d81
	 *	@return d81
	 */
	public char[]  getD81String() {
	    return getCharArray(beginD81,D_81_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d81IsNumeric() {
		    return isNumeric(beginD81
	                    ,beginD81 + D_81_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int D_81_LEN = 3;
  protected  static final int D_81_SCALE = 1;

   protected BigDecimal checkD81MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,1/*scale*/,3/*precision*/);
   }

  	/**
	 * serializeD81
	 */
	protected void serializeD81(BigDecimal d81) {
	       putNumber(beginD81,d81,D_81_LEN,D_81_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD81Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeD81
	 */
   	protected  BigDecimal serializeD81(char[] value) throws CFException {
        if (value.length < 3) value = pad(3, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginD81
		       ,3
		      );		 localD81Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,D_81_LEN,D_81_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("d81", beginD81,D_81_LEN);
    	}
    }
    /**
	 *	refreshD81 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshD81() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginD81
			            ,D_81_LEN
			            ,D_81_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("d81", beginD81,D_81_LEN);
    }
   	}
        int localP10Counter = -1;
        public boolean isP10Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localP10Counter != sharedCounter;
           localP10Counter = sharedCounter; return hasModified; 
        }
	    public boolean p10IsNumeric() {
	      return decimalIsNumeric(beginP10,P_10_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] p10String() {
            return getPackedString(beginP10,P_10_LEN);
         }
   protected static final int P_10_LEN = 5;
   protected static final int P_10_SCALE = 5;
  	/**
	 * 	serializeP10
	 */
	protected void serializeP10(BigDecimal p10) {
		   putDecimal(beginP10,p10,P_10_LEN,P_10_SCALE,true);
		 localP10Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkP10MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,5/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshP10 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshP10() throws CFException {	
   	try { 
		 return (getDecimal(beginP10,P_10_LEN,P_10_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("p10", beginP10,P_10_LEN);
     }
   	}
        int localP20Counter = -1;
        public boolean isP20Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localP20Counter != sharedCounter;
           localP20Counter = sharedCounter; return hasModified; 
        }
	    public boolean p20IsNumeric() {
	      return decimalIsNumeric(beginP20,P_20_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] p20String() {
            return getPackedString(beginP20,P_20_LEN);
         }
   protected static final int P_20_LEN = 3;
   protected static final int P_20_SCALE = 1;
  	/**
	 * 	serializeP20
	 */
	protected void serializeP20(BigDecimal p20) {
		   putDecimal(beginP20,p20,P_20_LEN,P_20_SCALE,true);
		 localP20Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkP20MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,1/*scale*/,5/*precision*/);
   }
     /**
	 *	refreshP20 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshP20() throws CFException {	
   	try { 
		 return (getDecimal(beginP20,P_20_LEN,P_20_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("p20", beginP20,P_20_LEN);
     }
   	}
        int localP30Counter = -1;
        public boolean isP30Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localP30Counter != sharedCounter;
           localP30Counter = sharedCounter; return hasModified; 
        }
	    public boolean p30IsNumeric() {
	      return decimalIsNumeric(beginP30,P_30_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] p30String() {
            return getPackedString(beginP30,P_30_LEN);
         }
   protected static final int P_30_LEN = 6;
   protected static final int P_30_SCALE = 3;
  	/**
	 * 	serializeP30
	 */
	protected void serializeP30(BigDecimal p30) {
		   putDecimal(beginP30,p30,P_30_LEN,P_30_SCALE,true);
		 localP30Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkP30MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,10/*precision*/);
   }
     /**
	 *	refreshP30 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshP30() throws CFException {	
   	try { 
		 return (getDecimal(beginP30,P_30_LEN,P_30_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("p30", beginP30,P_30_LEN);
     }
   	}
        int localP40Counter = -1;
        public boolean isP40Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localP40Counter != sharedCounter;
           localP40Counter = sharedCounter; return hasModified; 
        }
	    public boolean p40IsNumeric() {
	      return decimalIsNumeric(beginP40,P_40_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] p40String() {
            return getPackedString(beginP40,P_40_LEN);
         }
   protected static final int P_40_LEN = 7;
   protected static final int P_40_SCALE = 5;
  	/**
	 * 	serializeP40
	 */
	protected void serializeP40(BigDecimal p40) {
		   putDecimal(beginP40,p40,P_40_LEN,P_40_SCALE,true);
		 localP40Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkP40MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,5/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshP40 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshP40() throws CFException {	
   	try { 
		 return (getDecimal(beginP40,P_40_LEN,P_40_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("p40", beginP40,P_40_LEN);
     }
   	}
        int localP50Counter = -1;
        public boolean isP50Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localP50Counter != sharedCounter;
           localP50Counter = sharedCounter; return hasModified; 
        }
	    public boolean p50IsNumeric() {
	      return decimalIsNumeric(beginP50,P_50_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] p50String() {
            return getPackedString(beginP50,P_50_LEN);
         }
   protected static final int P_50_LEN = 5;
   protected static final int P_50_SCALE = 1;
  	/**
	 * 	serializeP50
	 */
	protected void serializeP50(BigDecimal p50) {
		   putDecimal(beginP50,p50,P_50_LEN,P_50_SCALE,true);
		 localP50Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkP50MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,1/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshP50 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshP50() throws CFException {	
   	try { 
		 return (getDecimal(beginP50,P_50_LEN,P_50_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("p50", beginP50,P_50_LEN);
     }
   	}
        int localP60Counter = -1;
        public boolean isP60Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localP60Counter != sharedCounter;
           localP60Counter = sharedCounter; return hasModified; 
        }
	    public boolean p60IsNumeric() {
	      return decimalIsNumeric(beginP60,P_60_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] p60String() {
            return getPackedString(beginP60,P_60_LEN);
         }
   protected static final int P_60_LEN = 4;
   protected static final int P_60_SCALE = 5;
  	/**
	 * 	serializeP60
	 */
	protected void serializeP60(BigDecimal p60) {
		   putDecimal(beginP60,p60,P_60_LEN,P_60_SCALE,true);
		 localP60Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkP60MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,5/*scale*/,7/*precision*/);
   }
     /**
	 *	refreshP60 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshP60() throws CFException {	
   	try { 
		 return (getDecimal(beginP60,P_60_LEN,P_60_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("p60", beginP60,P_60_LEN);
     }
   	}
        int localP70Counter = -1;
        public boolean isP70Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localP70Counter != sharedCounter;
           localP70Counter = sharedCounter; return hasModified; 
        }
	    public boolean p70IsNumeric() {
	      return decimalIsNumeric(beginP70,P_70_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] p70String() {
            return getPackedString(beginP70,P_70_LEN);
         }
   protected static final int P_70_LEN = 3;
   protected static final int P_70_SCALE = 3;
  	/**
	 * 	serializeP70
	 */
	protected void serializeP70(BigDecimal p70) {
		   putDecimal(beginP70,p70,P_70_LEN,P_70_SCALE,true);
		 localP70Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkP70MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,5/*precision*/);
   }
     /**
	 *	refreshP70 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshP70() throws CFException {	
   	try { 
		 return (getDecimal(beginP70,P_70_LEN,P_70_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("p70", beginP70,P_70_LEN);
     }
   	}
        int localP80Counter = -1;
        public boolean isP80Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localP80Counter != sharedCounter;
           localP80Counter = sharedCounter; return hasModified; 
        }
	    public boolean p80IsNumeric() {
	      return decimalIsNumeric(beginP80,P_80_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] p80String() {
            return getPackedString(beginP80,P_80_LEN);
         }
   protected static final int P_80_LEN = 2;
   protected static final int P_80_SCALE = 1;
  	/**
	 * 	serializeP80
	 */
	protected void serializeP80(BigDecimal p80) {
		   putDecimal(beginP80,p80,P_80_LEN,P_80_SCALE,true);
		 localP80Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkP80MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,1/*scale*/,3/*precision*/);
   }
     /**
	 *	refreshP80 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshP80() throws CFException {	
   	try { 
		 return (getDecimal(beginP80,P_80_LEN,P_80_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("p80", beginP80,P_80_LEN);
     }
   	}
        int localP11Counter = -1;
        public boolean isP11Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localP11Counter != sharedCounter;
           localP11Counter = sharedCounter; return hasModified; 
        }
	    public boolean p11IsNumeric() {
	      return decimalIsNumeric(beginP11,P_11_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] p11String() {
            return getPackedString(beginP11,P_11_LEN);
         }
   protected static final int P_11_LEN = 5;
   protected static final int P_11_SCALE = 5;
  	/**
	 * 	serializeP11
	 */
	protected void serializeP11(BigDecimal p11) {
		   putDecimal(beginP11,p11,P_11_LEN,P_11_SCALE,false);
		 localP11Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkP11MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,5/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshP11 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshP11() throws CFException {	
   	try { 
		 return (getDecimal(beginP11,P_11_LEN,P_11_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("p11", beginP11,P_11_LEN);
     }
   	}
        int localP21Counter = -1;
        public boolean isP21Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localP21Counter != sharedCounter;
           localP21Counter = sharedCounter; return hasModified; 
        }
	    public boolean p21IsNumeric() {
	      return decimalIsNumeric(beginP21,P_21_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] p21String() {
            return getPackedString(beginP21,P_21_LEN);
         }
   protected static final int P_21_LEN = 3;
   protected static final int P_21_SCALE = 1;
  	/**
	 * 	serializeP21
	 */
	protected void serializeP21(BigDecimal p21) {
		   putDecimal(beginP21,p21,P_21_LEN,P_21_SCALE,false);
		 localP21Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkP21MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,1/*scale*/,5/*precision*/);
   }
     /**
	 *	refreshP21 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshP21() throws CFException {	
   	try { 
		 return (getDecimal(beginP21,P_21_LEN,P_21_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("p21", beginP21,P_21_LEN);
     }
   	}
        int localP31Counter = -1;
        public boolean isP31Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localP31Counter != sharedCounter;
           localP31Counter = sharedCounter; return hasModified; 
        }
	    public boolean p31IsNumeric() {
	      return decimalIsNumeric(beginP31,P_31_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] p31String() {
            return getPackedString(beginP31,P_31_LEN);
         }
   protected static final int P_31_LEN = 6;
   protected static final int P_31_SCALE = 3;
  	/**
	 * 	serializeP31
	 */
	protected void serializeP31(BigDecimal p31) {
		   putDecimal(beginP31,p31,P_31_LEN,P_31_SCALE,false);
		 localP31Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkP31MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,10/*precision*/);
   }
     /**
	 *	refreshP31 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshP31() throws CFException {	
   	try { 
		 return (getDecimal(beginP31,P_31_LEN,P_31_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("p31", beginP31,P_31_LEN);
     }
   	}
        int localP41Counter = -1;
        public boolean isP41Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localP41Counter != sharedCounter;
           localP41Counter = sharedCounter; return hasModified; 
        }
	    public boolean p41IsNumeric() {
	      return decimalIsNumeric(beginP41,P_41_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] p41String() {
            return getPackedString(beginP41,P_41_LEN);
         }
   protected static final int P_41_LEN = 7;
   protected static final int P_41_SCALE = 5;
  	/**
	 * 	serializeP41
	 */
	protected void serializeP41(BigDecimal p41) {
		   putDecimal(beginP41,p41,P_41_LEN,P_41_SCALE,false);
		 localP41Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkP41MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,5/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshP41 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshP41() throws CFException {	
   	try { 
		 return (getDecimal(beginP41,P_41_LEN,P_41_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("p41", beginP41,P_41_LEN);
     }
   	}
        int localP51Counter = -1;
        public boolean isP51Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localP51Counter != sharedCounter;
           localP51Counter = sharedCounter; return hasModified; 
        }
	    public boolean p51IsNumeric() {
	      return decimalIsNumeric(beginP51,P_51_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] p51String() {
            return getPackedString(beginP51,P_51_LEN);
         }
   protected static final int P_51_LEN = 5;
   protected static final int P_51_SCALE = 1;
  	/**
	 * 	serializeP51
	 */
	protected void serializeP51(BigDecimal p51) {
		   putDecimal(beginP51,p51,P_51_LEN,P_51_SCALE,false);
		 localP51Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkP51MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,1/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshP51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshP51() throws CFException {	
   	try { 
		 return (getDecimal(beginP51,P_51_LEN,P_51_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("p51", beginP51,P_51_LEN);
     }
   	}
        int localP61Counter = -1;
        public boolean isP61Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localP61Counter != sharedCounter;
           localP61Counter = sharedCounter; return hasModified; 
        }
	    public boolean p61IsNumeric() {
	      return decimalIsNumeric(beginP61,P_61_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] p61String() {
            return getPackedString(beginP61,P_61_LEN);
         }
   protected static final int P_61_LEN = 4;
   protected static final int P_61_SCALE = 5;
  	/**
	 * 	serializeP61
	 */
	protected void serializeP61(BigDecimal p61) {
		   putDecimal(beginP61,p61,P_61_LEN,P_61_SCALE,false);
		 localP61Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkP61MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,5/*scale*/,7/*precision*/);
   }
     /**
	 *	refreshP61 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshP61() throws CFException {	
   	try { 
		 return (getDecimal(beginP61,P_61_LEN,P_61_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("p61", beginP61,P_61_LEN);
     }
   	}
        int localP71Counter = -1;
        public boolean isP71Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localP71Counter != sharedCounter;
           localP71Counter = sharedCounter; return hasModified; 
        }
	    public boolean p71IsNumeric() {
	      return decimalIsNumeric(beginP71,P_71_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] p71String() {
            return getPackedString(beginP71,P_71_LEN);
         }
   protected static final int P_71_LEN = 3;
   protected static final int P_71_SCALE = 3;
  	/**
	 * 	serializeP71
	 */
	protected void serializeP71(BigDecimal p71) {
		   putDecimal(beginP71,p71,P_71_LEN,P_71_SCALE,false);
		 localP71Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkP71MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,5/*precision*/);
   }
     /**
	 *	refreshP71 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshP71() throws CFException {	
   	try { 
		 return (getDecimal(beginP71,P_71_LEN,P_71_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("p71", beginP71,P_71_LEN);
     }
   	}
        int localP81Counter = -1;
        public boolean isP81Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localP81Counter != sharedCounter;
           localP81Counter = sharedCounter; return hasModified; 
        }
	    public boolean p81IsNumeric() {
	      return decimalIsNumeric(beginP81,P_81_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] p81String() {
            return getPackedString(beginP81,P_81_LEN);
         }
   protected static final int P_81_LEN = 2;
   protected static final int P_81_SCALE = 1;
  	/**
	 * 	serializeP81
	 */
	protected void serializeP81(BigDecimal p81) {
		   putDecimal(beginP81,p81,P_81_LEN,P_81_SCALE,false);
		 localP81Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkP81MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,1/*scale*/,3/*precision*/);
   }
     /**
	 *	refreshP81 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshP81() throws CFException {	
   	try { 
		 return (getDecimal(beginP81,P_81_LEN,P_81_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("p81", beginP81,P_81_LEN);
     }
   	}




}
  
