package com.cloudframe.app.numeric0.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:28. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 88;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginNumDisp1;
            protected  int beginNumDec1;
            protected  int beginNumDisp2;
            protected  int beginNumDec2;
            protected  int beginV9297;
            protected  int beginV9299;
            protected  int beginComp3918;
            protected  int beginV93Comp399;
            protected  int beginDispPerUnitRate;
            protected  int beginV9399;
            protected  int beginV93915;
	
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
  
             beginNumDisp1 = getStartOffset() + 0;	// set offset for serialization
  
             beginNumDec1 = getStartOffset() + 9;	// set offset for serialization
  
  
  
  
             beginNumDisp2 = getStartOffset() + 14;	// set offset for serialization
  
             beginNumDec2 = getStartOffset() + 23;	// set offset for serialization
  
  
  
  
  
             beginV9297 = getStartOffset() + 28;	// set offset for serialization
  
             beginV9299 = getStartOffset() + 33;	// set offset for serialization
  
  
             beginComp3918 = getStartOffset() + 39;	// set offset for serialization
  
             beginV93Comp399 = getStartOffset() + 49;	// set offset for serialization
  
             beginDispPerUnitRate = getStartOffset() + 56;	// set offset for serialization
  
  
             beginV9399 = getStartOffset() + 71;	// set offset for serialization
  
             beginV93915 = getStartOffset() + 78;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localAcctHbEqupSurchageOcc06Counter = -1;
     public boolean isAcctHbEqupSurchageOcc06Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcctHbEqupSurchageOcc06Counter != sharedCounter;
         localAcctHbEqupSurchageOcc06Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAcctHbEqupSurchageOcc06Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
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
         int localTotAmtCounter = -1;
         public boolean isTotAmtModified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localTotAmtCounter != sharedCounter;
             localTotAmtCounter = sharedCounter; return hasModified;
         }
        int localV9297Counter = -1;
        public boolean isV9297Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localV9297Counter != sharedCounter;
           localV9297Counter = sharedCounter; return hasModified; 
        }
	    public boolean v9297IsNumeric() {
	      return decimalIsNumeric(beginV9297,V_9297_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] v9297String() {
            return getPackedString(beginV9297,V_9297_LEN);
         }
   protected static final int V_9297_LEN = 5;
   protected static final int V_9297_SCALE = 2;
  	/**
	 * 	serializeV9297
	 */
	protected void serializeV9297(BigDecimal v9297) {
		   putDecimal(beginV9297,v9297,V_9297_LEN,V_9297_SCALE,true);
		 localV9297Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkV9297MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshV9297 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshV9297() throws CFException {	
   	try { 
		 return (getDecimal(beginV9297,V_9297_LEN,V_9297_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("v9297", beginV9297,V_9297_LEN);
     }
   	}
        int localV9299Counter = -1;
        public boolean isV9299Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localV9299Counter != sharedCounter;
           localV9299Counter = sharedCounter; return hasModified; 
        }
	    public boolean v9299IsNumeric() {
	      return decimalIsNumeric(beginV9299,V_9299_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] v9299String() {
            return getPackedString(beginV9299,V_9299_LEN);
         }
   protected static final int V_9299_LEN = 6;
   protected static final int V_9299_SCALE = 2;
  	/**
	 * 	serializeV9299
	 */
	protected void serializeV9299(BigDecimal v9299) {
		   putDecimal(beginV9299,v9299,V_9299_LEN,V_9299_SCALE,true);
		 localV9299Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkV9299MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshV9299 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshV9299() throws CFException {	
   	try { 
		 return (getDecimal(beginV9299,V_9299_LEN,V_9299_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("v9299", beginV9299,V_9299_LEN);
     }
   	}
         int localComp918Counter = -1;
         public boolean isComp918Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localComp918Counter != sharedCounter;
            localComp918Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkComp918MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
        int localComp3918Counter = -1;
        public boolean isComp3918Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localComp3918Counter != sharedCounter;
           localComp3918Counter = sharedCounter; return hasModified; 
        }
	    public boolean comp3918IsNumeric() {
	      return decimalIsNumeric(beginComp3918,COMP_3918_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int COMP_3918_LEN = 10;
  	/**
	 * 	serializeComp3918
	 */
	protected void serializeComp3918(long comp3918) {
		   putDecimal(beginComp3918,comp3918,COMP_3918_LEN,true);
   }
   

   protected long checkComp3918MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1E /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshComp3918 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshComp3918() throws CFException {	
   	try { 
		 return (getLongDecimal(beginComp3918,COMP_3918_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("comp3918", beginComp3918,COMP_3918_LEN);
     }
   	}
        int localV93Comp399Counter = -1;
        public boolean isV93Comp399Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localV93Comp399Counter != sharedCounter;
           localV93Comp399Counter = sharedCounter; return hasModified; 
        }
	    public boolean v93Comp399IsNumeric() {
	      return decimalIsNumeric(beginV93Comp399,V_93_COMP_399_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] v93Comp399String() {
            return getPackedString(beginV93Comp399,V_93_COMP_399_LEN);
         }
   protected static final int V_93_COMP_399_LEN = 7;
   protected static final int V_93_COMP_399_SCALE = 3;
  	/**
	 * 	serializeV93Comp399
	 */
	protected void serializeV93Comp399(BigDecimal v93Comp399) {
		   putDecimal(beginV93Comp399,v93Comp399,V_93_COMP_399_LEN,V_93_COMP_399_SCALE,true);
		 localV93Comp399Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkV93Comp399MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshV93Comp399 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshV93Comp399() throws CFException {	
   	try { 
		 return (getDecimal(beginV93Comp399,V_93_COMP_399_LEN,V_93_COMP_399_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("v93Comp399", beginV93Comp399,V_93_COMP_399_LEN);
     }
   	}
     int localDispPerUnitRateCounter = -1;
     public boolean isDispPerUnitRateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDispPerUnitRateCounter != sharedCounter;
         localDispPerUnitRateCounter = sharedCounter; return hasModified;
     }
	protected static final int DISP_PER_UNIT_RATE_LEN = 15;
	/**
	 * 	serialize this DispPerUnitRate
	 */
   protected void serializeDispPerUnitRate(char[] dispPerUnitRate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dispPerUnitRate,0,getStringValue(),beginDispPerUnitRate,DISP_PER_UNIT_RATE_LEN);
       localDispPerUnitRateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDispPerUnitRateConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDispPerUnitRate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDispPerUnitRate() {	 
   		return (substring(getStringValue(),beginDispPerUnitRate,beginDispPerUnitRate + DISP_PER_UNIT_RATE_LEN));
   	}
     int localRlu7jPerUnitRateCounter = -1;
     public boolean isRlu7jPerUnitRateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu7jPerUnitRateCounter != sharedCounter;
         localRlu7jPerUnitRateCounter = sharedCounter; return hasModified;
     }

   protected char[] checkRlu7jPerUnitRateConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
        int localV9399Counter = -1;
        public boolean isV9399Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localV9399Counter != sharedCounter;
           localV9399Counter = sharedCounter; return hasModified; 
        }
	    public boolean v9399IsNumeric() {
	      return decimalIsNumeric(beginV9399,V_9399_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] v9399String() {
            return getPackedString(beginV9399,V_9399_LEN);
         }
   protected static final int V_9399_LEN = 7;
   protected static final int V_9399_SCALE = 3;
  	/**
	 * 	serializeV9399
	 */
	protected void serializeV9399(BigDecimal v9399) {
		   putDecimal(beginV9399,v9399,V_9399_LEN,V_9399_SCALE,true);
		 localV9399Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkV9399MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshV9399 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshV9399() throws CFException {	
   	try { 
		 return (getDecimal(beginV9399,V_9399_LEN,V_9399_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("v9399", beginV9399,V_9399_LEN);
     }
   	}
        int localV93915Counter = -1;
        public boolean isV93915Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localV93915Counter != sharedCounter;
           localV93915Counter = sharedCounter; return hasModified; 
        }
	    public boolean v93915IsNumeric() {
	      return decimalIsNumeric(beginV93915,V_93915_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] v93915String() {
            return getPackedString(beginV93915,V_93915_LEN);
         }
   protected static final int V_93915_LEN = 10;
   protected static final int V_93915_SCALE = 3;
  	/**
	 * 	serializeV93915
	 */
	protected void serializeV93915(BigDecimal v93915) {
		   putDecimal(beginV93915,v93915,V_93915_LEN,V_93915_SCALE,true);
		 localV93915Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkV93915MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,18/*precision*/);
   }
     /**
	 *	refreshV93915 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshV93915() throws CFException {	
   	try { 
		 return (getDecimal(beginV93915,V_93915_LEN,V_93915_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("v93915", beginV93915,V_93915_LEN);
     }
   	}
         int localCountCounter = -1;
         public boolean isCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCountCounter != sharedCounter;
            localCountCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkCountMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }




}
  
