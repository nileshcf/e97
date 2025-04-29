package com.cloudframe.app.comput.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 249;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginW03a1DiComp3;
            protected  int beginW03a1DiDecimal;
            protected  int beginW03a1DiReal;
            protected  int beginW03a1DiDouble;
            protected  int beginW03a1DoComp3;
            protected  int beginW03a1DoDecimal;
            protected  int beginW03a1DoReal;
            protected  int beginW03a1DoDouble;
            protected  int beginHvStartDt81d;
            protected  int beginIntOfDt1;
            protected  int beginTb11148AdminAmt;
            protected  int beginRlu3aMtnAcAcctChgsCredits;
            protected  int beginChrgCreditTotNotax;
            protected  int beginW5v5A;
            protected  int beginW5v5;
            protected  int beginW3v2A;
            protected  int beginW3v2;
            protected  int beginW3v2Result;
            protected  int beginPmslk402ListPrice;
            protected  int beginWFeePromoxAmt;
            protected  int beginWChgAmtDec5;
            protected  int beginWcdloLeapYear;
            protected  int beginWcdliCurYyyy;
            protected  int beginPctWoPrice;
            protected  int beginPctWithNoPrice;
            protected  int beginRecsWithoutPrice;
            protected  int beginDetailRecs;
            protected  int beginF;
            protected  int beginA;
            protected  int beginB;
            protected  int beginC;
            protected  int beginD;
            protected  int beginE;
            protected  int beginCoordinatedGeneration;
            protected  int beginReportGen;
            protected  int beginCbsumGen;
            protected  int beginOmsumpvGen;
            protected  int beginOmauditGen;
            protected  int beginOmencfGen;
            protected  int beginDecimalNo300;
	
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
             beginW03a1DiComp3 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginW03a1DiDecimal = getStartOffset() + 8;	// set offset for serialization
  
  
  
  
             beginW03a1DiReal = getStartOffset() + 13;	// set offset for serialization
  
             beginW03a1DiDouble = getStartOffset() + 17;	// set offset for serialization
  
             beginW03a1DoComp3 = getStartOffset() + 25;	// set offset for serialization
  
  
             beginW03a1DoDecimal = getStartOffset() + 33;	// set offset for serialization
  
  
  
  
             beginW03a1DoReal = getStartOffset() + 38;	// set offset for serialization
  
             beginW03a1DoDouble = getStartOffset() + 42;	// set offset for serialization
  
             beginHvStartDt81d = getStartOffset() + 50;	// set offset for serialization
  
             beginIntOfDt1 = getStartOffset() + 58;	// set offset for serialization
  
             beginTb11148AdminAmt = getStartOffset() + 63;	// set offset for serialization
  
  
             beginRlu3aMtnAcAcctChgsCredits = getStartOffset() + 68;	// set offset for serialization
  
             beginChrgCreditTotNotax = getStartOffset() + 74;	// set offset for serialization
  
             beginW5v5A = getStartOffset() + 80;	// set offset for serialization
  
             beginW5v5 = getStartOffset() + 90;	// set offset for serialization
  
             beginW3v2A = getStartOffset() + 100;	// set offset for serialization
  
             beginW3v2 = getStartOffset() + 105;	// set offset for serialization
  
             beginW3v2Result = getStartOffset() + 110;	// set offset for serialization
  
             beginPmslk402ListPrice = getStartOffset() + 115;	// set offset for serialization
  
             beginWFeePromoxAmt = getStartOffset() + 121;	// set offset for serialization
  
             beginWChgAmtDec5 = getStartOffset() + 125;	// set offset for serialization
  
             beginWcdloLeapYear = getStartOffset() + 132;	// set offset for serialization
  
             beginWcdliCurYyyy = getStartOffset() + 138;	// set offset for serialization
  
  
  
  
  
  
  
  
             beginPctWoPrice = getStartOffset() + 142;	// set offset for serialization
  
             beginPctWithNoPrice = getStartOffset() + 153;	// set offset for serialization
  
             beginRecsWithoutPrice = getStartOffset() + 156;	// set offset for serialization
  
             beginDetailRecs = getStartOffset() + 162;	// set offset for serialization
  
             beginF = getStartOffset() + 168;	// set offset for serialization
  
             beginA = getStartOffset() + 179;	// set offset for serialization
  
             beginB = getStartOffset() + 188;	// set offset for serialization
  
             beginC = getStartOffset() + 194;	// set offset for serialization
  
             beginD = getStartOffset() + 200;	// set offset for serialization
  
             beginE = getStartOffset() + 209;	// set offset for serialization
  
             beginCoordinatedGeneration = getStartOffset() + 220;	// set offset for serialization
  
             beginReportGen = getStartOffset() + 223;	// set offset for serialization
  
             beginCbsumGen = getStartOffset() + 226;	// set offset for serialization
  
             beginOmsumpvGen = getStartOffset() + 229;	// set offset for serialization
  
             beginOmauditGen = getStartOffset() + 232;	// set offset for serialization
  
             beginOmencfGen = getStartOffset() + 235;	// set offset for serialization
  
             beginDecimalNo300 = getStartOffset() + 238;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localW03a1DiComp3Counter = -1;
        public boolean isW03a1DiComp3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localW03a1DiComp3Counter != sharedCounter;
           localW03a1DiComp3Counter = sharedCounter; return hasModified; 
        }
	    public boolean w03a1DiComp3IsNumeric() {
	      return decimalIsNumeric(beginW03a1DiComp3,W_03A_1_DI_COMP_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int W_03A_1_DI_COMP_3_LEN = 8;
  	/**
	 * 	serializeW03a1DiComp3
	 */
	protected void serializeW03a1DiComp3(long w03a1DiComp3) {
		   putDecimal(beginW03a1DiComp3,w03a1DiComp3,W_03A_1_DI_COMP_3_LEN,true);
   }
   

   protected long checkW03a1DiComp3MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshW03a1DiComp3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshW03a1DiComp3() throws CFException {	
   	try { 
		 return (getLongDecimal(beginW03a1DiComp3,W_03A_1_DI_COMP_3_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("w03a1DiComp3", beginW03a1DiComp3,W_03A_1_DI_COMP_3_LEN);
     }
   	}
         int localW03a1DiCompCounter = -1;
         public boolean isW03a1DiCompModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localW03a1DiCompCounter != sharedCounter;
            localW03a1DiCompCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkW03a1DiCompMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
        int localW03a1DiDecimalCounter = -1;
        public boolean isW03a1DiDecimalModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localW03a1DiDecimalCounter != sharedCounter;
           localW03a1DiDecimalCounter = sharedCounter; return hasModified; 
        }
	    public boolean w03a1DiDecimalIsNumeric() {
	      return decimalIsNumeric(beginW03a1DiDecimal,W_03A_1_DI_DECIMAL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] w03a1DiDecimalString() {
            return getPackedString(beginW03a1DiDecimal,W_03A_1_DI_DECIMAL_LEN);
         }
   protected static final int W_03A_1_DI_DECIMAL_LEN = 5;
   protected static final int W_03A_1_DI_DECIMAL_SCALE = 2;
  	/**
	 * 	serializeW03a1DiDecimal
	 */
	protected void serializeW03a1DiDecimal(BigDecimal w03a1DiDecimal) {
		   putDecimal(beginW03a1DiDecimal,w03a1DiDecimal,W_03A_1_DI_DECIMAL_LEN,W_03A_1_DI_DECIMAL_SCALE,true);
		 localW03a1DiDecimalCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkW03a1DiDecimalMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshW03a1DiDecimal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshW03a1DiDecimal() throws CFException {	
   	try { 
		 return (getDecimal(beginW03a1DiDecimal,W_03A_1_DI_DECIMAL_LEN,W_03A_1_DI_DECIMAL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("w03a1DiDecimal", beginW03a1DiDecimal,W_03A_1_DI_DECIMAL_LEN);
     }
   	}
         int localW03a1DiSmallintCounter = -1;
         public boolean isW03a1DiSmallintModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localW03a1DiSmallintCounter != sharedCounter;
            localW03a1DiSmallintCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkW03a1DiSmallintMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localW03a1DiIntCounter = -1;
         public boolean isW03a1DiIntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localW03a1DiIntCounter != sharedCounter;
            localW03a1DiIntCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkW03a1DiIntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localW03a1DiBigintCounter = -1;
         public boolean isW03a1DiBigintModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localW03a1DiBigintCounter != sharedCounter;
            localW03a1DiBigintCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkW03a1DiBigintMaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     int localW03a1DiRealCounter = -1;
     public boolean isW03a1DiRealModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW03a1DiRealCounter != sharedCounter;
         localW03a1DiRealCounter = sharedCounter; return hasModified; 
     }
	/**
	 * 	serialize this W03a1DiReal
	 */
   protected void serializeW03a1DiReal(BigDecimal w03a1DiReal) {	
		shareString.getSerializedField().incrementCounter();
		putComp1(beginW03a1DiReal, w03a1DiReal);
		localW03a1DiRealCounter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshW03a1DiReal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serilization as well
	 */ 
   	protected BigDecimal refreshW03a1DiReal() {
		return getComp1(beginW03a1DiReal);
	}
     int localW03a1DiDoubleCounter = -1;
     public boolean isW03a1DiDoubleModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW03a1DiDoubleCounter != sharedCounter;
         localW03a1DiDoubleCounter = sharedCounter; return hasModified;          
     }
	/**
	 * 	serialize this W03a1DiDouble
	 */
   protected void serializeW03a1DiDouble(BigDecimal w03a1DiDouble) {	
		shareString.getSerializedField().incrementCounter();
	 	putComp2(beginW03a1DiDouble, w03a1DiDouble);
		localW03a1DiDoubleCounter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshW03a1DiDouble is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serilization as well
	 */ 
   	protected BigDecimal refreshW03a1DiDouble() {
	 	return getComp2(beginW03a1DiDouble);
	}
        int localW03a1DoComp3Counter = -1;
        public boolean isW03a1DoComp3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localW03a1DoComp3Counter != sharedCounter;
           localW03a1DoComp3Counter = sharedCounter; return hasModified; 
        }
	    public boolean w03a1DoComp3IsNumeric() {
	      return decimalIsNumeric(beginW03a1DoComp3,W_03A_1_DO_COMP_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int W_03A_1_DO_COMP_3_LEN = 8;
  	/**
	 * 	serializeW03a1DoComp3
	 */
	protected void serializeW03a1DoComp3(long w03a1DoComp3) {
		   putDecimal(beginW03a1DoComp3,w03a1DoComp3,W_03A_1_DO_COMP_3_LEN,true);
   }
   

   protected long checkW03a1DoComp3MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshW03a1DoComp3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshW03a1DoComp3() throws CFException {	
   	try { 
		 return (getLongDecimal(beginW03a1DoComp3,W_03A_1_DO_COMP_3_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("w03a1DoComp3", beginW03a1DoComp3,W_03A_1_DO_COMP_3_LEN);
     }
   	}
         int localW03a1DoCompCounter = -1;
         public boolean isW03a1DoCompModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localW03a1DoCompCounter != sharedCounter;
            localW03a1DoCompCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkW03a1DoCompMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
        int localW03a1DoDecimalCounter = -1;
        public boolean isW03a1DoDecimalModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localW03a1DoDecimalCounter != sharedCounter;
           localW03a1DoDecimalCounter = sharedCounter; return hasModified; 
        }
	    public boolean w03a1DoDecimalIsNumeric() {
	      return decimalIsNumeric(beginW03a1DoDecimal,W_03A_1_DO_DECIMAL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] w03a1DoDecimalString() {
            return getPackedString(beginW03a1DoDecimal,W_03A_1_DO_DECIMAL_LEN);
         }
   protected static final int W_03A_1_DO_DECIMAL_LEN = 5;
   protected static final int W_03A_1_DO_DECIMAL_SCALE = 2;
  	/**
	 * 	serializeW03a1DoDecimal
	 */
	protected void serializeW03a1DoDecimal(BigDecimal w03a1DoDecimal) {
		   putDecimal(beginW03a1DoDecimal,w03a1DoDecimal,W_03A_1_DO_DECIMAL_LEN,W_03A_1_DO_DECIMAL_SCALE,true);
		 localW03a1DoDecimalCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkW03a1DoDecimalMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshW03a1DoDecimal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshW03a1DoDecimal() throws CFException {	
   	try { 
		 return (getDecimal(beginW03a1DoDecimal,W_03A_1_DO_DECIMAL_LEN,W_03A_1_DO_DECIMAL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("w03a1DoDecimal", beginW03a1DoDecimal,W_03A_1_DO_DECIMAL_LEN);
     }
   	}
         int localW03a1DoSmallintCounter = -1;
         public boolean isW03a1DoSmallintModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localW03a1DoSmallintCounter != sharedCounter;
            localW03a1DoSmallintCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkW03a1DoSmallintMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localW03a1DoIntCounter = -1;
         public boolean isW03a1DoIntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localW03a1DoIntCounter != sharedCounter;
            localW03a1DoIntCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkW03a1DoIntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localW03a1DoBigintCounter = -1;
         public boolean isW03a1DoBigintModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localW03a1DoBigintCounter != sharedCounter;
            localW03a1DoBigintCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkW03a1DoBigintMaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     int localW03a1DoRealCounter = -1;
     public boolean isW03a1DoRealModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW03a1DoRealCounter != sharedCounter;
         localW03a1DoRealCounter = sharedCounter; return hasModified; 
     }
	/**
	 * 	serialize this W03a1DoReal
	 */
   protected void serializeW03a1DoReal(BigDecimal w03a1DoReal) {	
		shareString.getSerializedField().incrementCounter();
		putComp1(beginW03a1DoReal, w03a1DoReal);
		localW03a1DoRealCounter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshW03a1DoReal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serilization as well
	 */ 
   	protected BigDecimal refreshW03a1DoReal() {
		return getComp1(beginW03a1DoReal);
	}
     int localW03a1DoDoubleCounter = -1;
     public boolean isW03a1DoDoubleModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW03a1DoDoubleCounter != sharedCounter;
         localW03a1DoDoubleCounter = sharedCounter; return hasModified;          
     }
	/**
	 * 	serialize this W03a1DoDouble
	 */
   protected void serializeW03a1DoDouble(BigDecimal w03a1DoDouble) {	
		shareString.getSerializedField().incrementCounter();
	 	putComp2(beginW03a1DoDouble, w03a1DoDouble);
		localW03a1DoDoubleCounter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshW03a1DoDouble is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serilization as well
	 */ 
   	protected BigDecimal refreshW03a1DoDouble() {
	 	return getComp2(beginW03a1DoDouble);
	}
     int localHvStartDt81dCounter = -1;
     public boolean isHvStartDt81dModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvStartDt81dCounter != sharedCounter;
         localHvStartDt81dCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of hvStartDt81d
	 *	@return hvStartDt81d
	 */
	public char[]  getHvStartDt81dString() {
	     return getCharArray(beginHvStartDt81d,HV_START_DT_81D_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean hvStartDt81dIsNumeric() {
	    return isNumeric(beginHvStartDt81d
	                    ,beginHvStartDt81d + HV_START_DT_81D_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int HV_START_DT_81D_LEN = 8;
  	/**
	 * serializeHvStartDt81d
	 */
	protected void serializeHvStartDt81d(long hvStartDt81d) {
		 putNumber(beginHvStartDt81d,hvStartDt81d,HV_START_DT_81D_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localHvStartDt81dCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeHvStartDt81d
	 */
   	protected  long serializeHvStartDt81d(char[] value) {
	    long  hvStartDt81d;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    hvStartDt81d = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginHvStartDt81d
		       ,8
		      );
		 localHvStartDt81dCounter = shareString.getSerializedField().getModifiedCounter();
		return  hvStartDt81d;
    }

   protected long checkHvStartDt81dMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshHvStartDt81d is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshHvStartDt81d() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginHvStartDt81d
			                 ,HV_START_DT_81D_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("hvStartDt81d", beginHvStartDt81d,HV_START_DT_81D_LEN);
    }
   	}
        int localIntOfDt1Counter = -1;
        public boolean isIntOfDt1Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIntOfDt1Counter != sharedCounter;
           localIntOfDt1Counter = sharedCounter; return hasModified; 
        }
	    public boolean intOfDt1IsNumeric() {
	      return decimalIsNumeric(beginIntOfDt1,INT_OF_DT_1_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int INT_OF_DT_1_LEN = 5;
  	/**
	 * 	serializeIntOfDt1
	 */
	protected void serializeIntOfDt1(int intOfDt1) {
		   putDecimal(beginIntOfDt1,intOfDt1,INT_OF_DT_1_LEN,true);
   }
   

   protected int checkIntOfDt1MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshIntOfDt1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIntOfDt1() throws CFException {	
   	try { 
		 return (getIntDecimal(beginIntOfDt1,INT_OF_DT_1_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("intOfDt1", beginIntOfDt1,INT_OF_DT_1_LEN);
     }
   	}
        int localTb11148AdminAmtCounter = -1;
        public boolean isTb11148AdminAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb11148AdminAmtCounter != sharedCounter;
           localTb11148AdminAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb11148AdminAmtIsNumeric() {
	      return decimalIsNumeric(beginTb11148AdminAmt,TB_11148_ADMIN_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tb11148AdminAmtString() {
            return getPackedString(beginTb11148AdminAmt,TB_11148_ADMIN_AMT_LEN);
         }
   protected static final int TB_11148_ADMIN_AMT_LEN = 5;
   protected static final int TB_11148_ADMIN_AMT_SCALE = 2;
  	/**
	 * 	serializeTb11148AdminAmt
	 */
	protected void serializeTb11148AdminAmt(BigDecimal tb11148AdminAmt) {
		   putDecimal(beginTb11148AdminAmt,tb11148AdminAmt,TB_11148_ADMIN_AMT_LEN,TB_11148_ADMIN_AMT_SCALE,true);
		 localTb11148AdminAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTb11148AdminAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshTb11148AdminAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTb11148AdminAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginTb11148AdminAmt,TB_11148_ADMIN_AMT_LEN,TB_11148_ADMIN_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb11148AdminAmt", beginTb11148AdminAmt,TB_11148_ADMIN_AMT_LEN);
     }
   	}
         int localTotAmtCounter = -1;
         public boolean isTotAmtModified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localTotAmtCounter != sharedCounter;
             localTotAmtCounter = sharedCounter; return hasModified;
         }
        int localRlu3aMtnAcAcctChgsCreditsCounter = -1;
        public boolean isRlu3aMtnAcAcctChgsCreditsModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu3aMtnAcAcctChgsCreditsCounter != sharedCounter;
           localRlu3aMtnAcAcctChgsCreditsCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu3aMtnAcAcctChgsCreditsIsNumeric() {
	      return decimalIsNumeric(beginRlu3aMtnAcAcctChgsCredits,RLU_3A_MTN_AC_ACCT_CHGS_CREDITS_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu3aMtnAcAcctChgsCreditsString() {
            return getPackedString(beginRlu3aMtnAcAcctChgsCredits,RLU_3A_MTN_AC_ACCT_CHGS_CREDITS_LEN);
         }
   protected static final int RLU_3A_MTN_AC_ACCT_CHGS_CREDITS_LEN = 6;
   protected static final int RLU_3A_MTN_AC_ACCT_CHGS_CREDITS_SCALE = 2;
  	/**
	 * 	serializeRlu3aMtnAcAcctChgsCredits
	 */
	protected void serializeRlu3aMtnAcAcctChgsCredits(BigDecimal rlu3aMtnAcAcctChgsCredits) {
		   putDecimal(beginRlu3aMtnAcAcctChgsCredits,rlu3aMtnAcAcctChgsCredits,RLU_3A_MTN_AC_ACCT_CHGS_CREDITS_LEN,RLU_3A_MTN_AC_ACCT_CHGS_CREDITS_SCALE,true);
		 localRlu3aMtnAcAcctChgsCreditsCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu3aMtnAcAcctChgsCreditsMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu3aMtnAcAcctChgsCredits is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu3aMtnAcAcctChgsCredits() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu3aMtnAcAcctChgsCredits,RLU_3A_MTN_AC_ACCT_CHGS_CREDITS_LEN,RLU_3A_MTN_AC_ACCT_CHGS_CREDITS_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu3aMtnAcAcctChgsCredits", beginRlu3aMtnAcAcctChgsCredits,RLU_3A_MTN_AC_ACCT_CHGS_CREDITS_LEN);
     }
   	}
        int localChrgCreditTotNotaxCounter = -1;
        public boolean isChrgCreditTotNotaxModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localChrgCreditTotNotaxCounter != sharedCounter;
           localChrgCreditTotNotaxCounter = sharedCounter; return hasModified; 
        }
	    public boolean chrgCreditTotNotaxIsNumeric() {
	      return decimalIsNumeric(beginChrgCreditTotNotax,CHRG_CREDIT_TOT_NOTAX_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] chrgCreditTotNotaxString() {
            return getPackedString(beginChrgCreditTotNotax,CHRG_CREDIT_TOT_NOTAX_LEN);
         }
   protected static final int CHRG_CREDIT_TOT_NOTAX_LEN = 6;
   protected static final int CHRG_CREDIT_TOT_NOTAX_SCALE = 2;
  	/**
	 * 	serializeChrgCreditTotNotax
	 */
	protected void serializeChrgCreditTotNotax(BigDecimal chrgCreditTotNotax) {
		   putDecimal(beginChrgCreditTotNotax,chrgCreditTotNotax,CHRG_CREDIT_TOT_NOTAX_LEN,CHRG_CREDIT_TOT_NOTAX_SCALE,true);
		 localChrgCreditTotNotaxCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkChrgCreditTotNotaxMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshChrgCreditTotNotax is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshChrgCreditTotNotax() throws CFException {	
   	try { 
		 return (getDecimal(beginChrgCreditTotNotax,CHRG_CREDIT_TOT_NOTAX_LEN,CHRG_CREDIT_TOT_NOTAX_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("chrgCreditTotNotax", beginChrgCreditTotNotax,CHRG_CREDIT_TOT_NOTAX_LEN);
     }
   	}
     int localW5v5ACounter = -1;
     
     public boolean isW5v5AModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW5v5ACounter != sharedCounter;
         localW5v5ACounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of w5v5A
	 *	@return w5v5A
	 */
	public char[]  getW5v5AString() {
	    return getCharArray(beginW5v5A,W_5V_5_A_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean w5v5AIsNumeric() {
		    return isNumeric(beginW5v5A
	                    ,beginW5v5A + W_5V_5_A_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int W_5V_5_A_LEN = 10;
  protected  static final int W_5V_5_A_SCALE = 5;

   protected BigDecimal checkW5v5AMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,5/*scale*/,10/*precision*/);
   }

  	/**
	 * serializeW5v5A
	 */
	protected void serializeW5v5A(BigDecimal w5v5A) {
	       putNumber(beginW5v5A,w5v5A,W_5V_5_A_LEN,W_5V_5_A_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localW5v5ACounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeW5v5A
	 */
   	protected  BigDecimal serializeW5v5A(char[] value) throws CFException {
        if (value.length < 10) value = pad(10, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginW5v5A
		       ,10
		      );		 localW5v5ACounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,W_5V_5_A_LEN,W_5V_5_A_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("w5v5A", beginW5v5A,W_5V_5_A_LEN);
    	}
    }
    /**
	 *	refreshW5v5A is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshW5v5A() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginW5v5A
			            ,W_5V_5_A_LEN
			            ,W_5V_5_A_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("w5v5A", beginW5v5A,W_5V_5_A_LEN);
    }
   	}
     int localW5v5Counter = -1;
     
     public boolean isW5v5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW5v5Counter != sharedCounter;
         localW5v5Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of w5v5
	 *	@return w5v5
	 */
	public char[]  getW5v5String() {
	    return getCharArray(beginW5v5,W_5V_5_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean w5v5IsNumeric() {
		    return isNumeric(beginW5v5
	                    ,beginW5v5 + W_5V_5_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int W_5V_5_LEN = 10;
  protected  static final int W_5V_5_SCALE = 5;

   protected BigDecimal checkW5v5MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,5/*scale*/,10/*precision*/);
   }

  	/**
	 * serializeW5v5
	 */
	protected void serializeW5v5(BigDecimal w5v5) {
	       putNumber(beginW5v5,w5v5,W_5V_5_LEN,W_5V_5_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localW5v5Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeW5v5
	 */
   	protected  BigDecimal serializeW5v5(char[] value) throws CFException {
        if (value.length < 10) value = pad(10, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginW5v5
		       ,10
		      );		 localW5v5Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,W_5V_5_LEN,W_5V_5_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("w5v5", beginW5v5,W_5V_5_LEN);
    	}
    }
    /**
	 *	refreshW5v5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshW5v5() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginW5v5
			            ,W_5V_5_LEN
			            ,W_5V_5_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("w5v5", beginW5v5,W_5V_5_LEN);
    }
   	}
     int localW3v2ACounter = -1;
     
     public boolean isW3v2AModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW3v2ACounter != sharedCounter;
         localW3v2ACounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of w3v2A
	 *	@return w3v2A
	 */
	public char[]  getW3v2AString() {
	    return getCharArray(beginW3v2A,W_3V_2_A_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean w3v2AIsNumeric() {
		    return isNumeric(beginW3v2A
	                    ,beginW3v2A + W_3V_2_A_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int W_3V_2_A_LEN = 5;
  protected  static final int W_3V_2_A_SCALE = 2;

   protected BigDecimal checkW3v2AMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }

  	/**
	 * serializeW3v2A
	 */
	protected void serializeW3v2A(BigDecimal w3v2A) {
	       putNumber(beginW3v2A,w3v2A,W_3V_2_A_LEN,W_3V_2_A_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localW3v2ACounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeW3v2A
	 */
   	protected  BigDecimal serializeW3v2A(char[] value) throws CFException {
        if (value.length < 5) value = pad(5, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginW3v2A
		       ,5
		      );		 localW3v2ACounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,W_3V_2_A_LEN,W_3V_2_A_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("w3v2A", beginW3v2A,W_3V_2_A_LEN);
    	}
    }
    /**
	 *	refreshW3v2A is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshW3v2A() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginW3v2A
			            ,W_3V_2_A_LEN
			            ,W_3V_2_A_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("w3v2A", beginW3v2A,W_3V_2_A_LEN);
    }
   	}
     int localW3v2Counter = -1;
     
     public boolean isW3v2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW3v2Counter != sharedCounter;
         localW3v2Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of w3v2
	 *	@return w3v2
	 */
	public char[]  getW3v2String() {
	    return getCharArray(beginW3v2,W_3V_2_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean w3v2IsNumeric() {
		    return isNumeric(beginW3v2
	                    ,beginW3v2 + W_3V_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int W_3V_2_LEN = 5;
  protected  static final int W_3V_2_SCALE = 2;

   protected BigDecimal checkW3v2MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }

  	/**
	 * serializeW3v2
	 */
	protected void serializeW3v2(BigDecimal w3v2) {
	       putNumber(beginW3v2,w3v2,W_3V_2_LEN,W_3V_2_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localW3v2Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeW3v2
	 */
   	protected  BigDecimal serializeW3v2(char[] value) throws CFException {
        if (value.length < 5) value = pad(5, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginW3v2
		       ,5
		      );		 localW3v2Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,W_3V_2_LEN,W_3V_2_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("w3v2", beginW3v2,W_3V_2_LEN);
    	}
    }
    /**
	 *	refreshW3v2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshW3v2() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginW3v2
			            ,W_3V_2_LEN
			            ,W_3V_2_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("w3v2", beginW3v2,W_3V_2_LEN);
    }
   	}
     int localW3v2ResultCounter = -1;
     
     public boolean isW3v2ResultModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW3v2ResultCounter != sharedCounter;
         localW3v2ResultCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of w3v2Result
	 *	@return w3v2Result
	 */
	public char[]  getW3v2ResultString() {
	    return getCharArray(beginW3v2Result,W_3V_2_RESULT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean w3v2ResultIsNumeric() {
		    return isNumeric(beginW3v2Result
	                    ,beginW3v2Result + W_3V_2_RESULT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int W_3V_2_RESULT_LEN = 5;
  protected  static final int W_3V_2_RESULT_SCALE = 2;

   protected BigDecimal checkW3v2ResultMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }

  	/**
	 * serializeW3v2Result
	 */
	protected void serializeW3v2Result(BigDecimal w3v2Result) {
	       putNumber(beginW3v2Result,w3v2Result,W_3V_2_RESULT_LEN,W_3V_2_RESULT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localW3v2ResultCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeW3v2Result
	 */
   	protected  BigDecimal serializeW3v2Result(char[] value) throws CFException {
        if (value.length < 5) value = pad(5, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginW3v2Result
		       ,5
		      );		 localW3v2ResultCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,W_3V_2_RESULT_LEN,W_3V_2_RESULT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("w3v2Result", beginW3v2Result,W_3V_2_RESULT_LEN);
    	}
    }
    /**
	 *	refreshW3v2Result is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshW3v2Result() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginW3v2Result
			            ,W_3V_2_RESULT_LEN
			            ,W_3V_2_RESULT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("w3v2Result", beginW3v2Result,W_3V_2_RESULT_LEN);
    }
   	}
        int localPmslk402ListPriceCounter = -1;
        public boolean isPmslk402ListPriceModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPmslk402ListPriceCounter != sharedCounter;
           localPmslk402ListPriceCounter = sharedCounter; return hasModified; 
        }
	    public boolean pmslk402ListPriceIsNumeric() {
	      return decimalIsNumeric(beginPmslk402ListPrice,PMSLK_402_LIST_PRICE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] pmslk402ListPriceString() {
            return getPackedString(beginPmslk402ListPrice,PMSLK_402_LIST_PRICE_LEN);
         }
   protected static final int PMSLK_402_LIST_PRICE_LEN = 6;
   protected static final int PMSLK_402_LIST_PRICE_SCALE = 4;
  	/**
	 * 	serializePmslk402ListPrice
	 */
	protected void serializePmslk402ListPrice(BigDecimal pmslk402ListPrice) {
		   putDecimal(beginPmslk402ListPrice,pmslk402ListPrice,PMSLK_402_LIST_PRICE_LEN,PMSLK_402_LIST_PRICE_SCALE,true);
		 localPmslk402ListPriceCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkPmslk402ListPriceMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshPmslk402ListPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshPmslk402ListPrice() throws CFException {	
   	try { 
		 return (getDecimal(beginPmslk402ListPrice,PMSLK_402_LIST_PRICE_LEN,PMSLK_402_LIST_PRICE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("pmslk402ListPrice", beginPmslk402ListPrice,PMSLK_402_LIST_PRICE_LEN);
     }
   	}
        int localWFeePromoxAmtCounter = -1;
        public boolean isWFeePromoxAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWFeePromoxAmtCounter != sharedCounter;
           localWFeePromoxAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean wFeePromoxAmtIsNumeric() {
	      return decimalIsNumeric(beginWFeePromoxAmt,W_FEE_PROMOX_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wFeePromoxAmtString() {
            return getPackedString(beginWFeePromoxAmt,W_FEE_PROMOX_AMT_LEN);
         }
   protected static final int W_FEE_PROMOX_AMT_LEN = 4;
   protected static final int W_FEE_PROMOX_AMT_SCALE = 2;
  	/**
	 * 	serializeWFeePromoxAmt
	 */
	protected void serializeWFeePromoxAmt(BigDecimal wFeePromoxAmt) {
		   putDecimal(beginWFeePromoxAmt,wFeePromoxAmt,W_FEE_PROMOX_AMT_LEN,W_FEE_PROMOX_AMT_SCALE,true);
		 localWFeePromoxAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWFeePromoxAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,7/*precision*/);
   }
     /**
	 *	refreshWFeePromoxAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWFeePromoxAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginWFeePromoxAmt,W_FEE_PROMOX_AMT_LEN,W_FEE_PROMOX_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wFeePromoxAmt", beginWFeePromoxAmt,W_FEE_PROMOX_AMT_LEN);
     }
   	}
        int localWChgAmtDec5Counter = -1;
        public boolean isWChgAmtDec5Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWChgAmtDec5Counter != sharedCounter;
           localWChgAmtDec5Counter = sharedCounter; return hasModified; 
        }
	    public boolean wChgAmtDec5IsNumeric() {
	      return decimalIsNumeric(beginWChgAmtDec5,W_CHG_AMT_DEC_5_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wChgAmtDec5String() {
            return getPackedString(beginWChgAmtDec5,W_CHG_AMT_DEC_5_LEN);
         }
   protected static final int W_CHG_AMT_DEC_5_LEN = 7;
   protected static final int W_CHG_AMT_DEC_5_SCALE = 5;
  	/**
	 * 	serializeWChgAmtDec5
	 */
	protected void serializeWChgAmtDec5(BigDecimal wChgAmtDec5) {
		   putDecimal(beginWChgAmtDec5,wChgAmtDec5,W_CHG_AMT_DEC_5_LEN,W_CHG_AMT_DEC_5_SCALE,true);
		 localWChgAmtDec5Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWChgAmtDec5MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,5/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshWChgAmtDec5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWChgAmtDec5() throws CFException {	
   	try { 
		 return (getDecimal(beginWChgAmtDec5,W_CHG_AMT_DEC_5_LEN,W_CHG_AMT_DEC_5_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wChgAmtDec5", beginWChgAmtDec5,W_CHG_AMT_DEC_5_LEN);
     }
   	}
     int localWcdloLeapYearCounter = -1;
     
     public boolean isWcdloLeapYearModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloLeapYearCounter != sharedCounter;
         localWcdloLeapYearCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of wcdloLeapYear
	 *	@return wcdloLeapYear
	 */
	public char[]  getWcdloLeapYearString() {
	    return getCharArray(beginWcdloLeapYear,WCDLO_LEAP_YEAR_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloLeapYearIsNumeric() {
		    return isNumeric(beginWcdloLeapYear
	                    ,beginWcdloLeapYear + WCDLO_LEAP_YEAR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int WCDLO_LEAP_YEAR_LEN = 6;
  protected  static final int WCDLO_LEAP_YEAR_SCALE = 2;

   protected BigDecimal checkWcdloLeapYearMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,6/*precision*/);
   }

  	/**
	 * serializeWcdloLeapYear
	 */
	protected void serializeWcdloLeapYear(BigDecimal wcdloLeapYear) {
	       putNumber(beginWcdloLeapYear,wcdloLeapYear,WCDLO_LEAP_YEAR_LEN,WCDLO_LEAP_YEAR_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloLeapYearCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeWcdloLeapYear
	 */
   	protected  BigDecimal serializeWcdloLeapYear(char[] value) throws CFException {
        if (value.length < 6) value = pad(6, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginWcdloLeapYear
		       ,6
		      );		 localWcdloLeapYearCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,WCDLO_LEAP_YEAR_LEN,WCDLO_LEAP_YEAR_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("wcdloLeapYear", beginWcdloLeapYear,WCDLO_LEAP_YEAR_LEN);
    	}
    }
    /**
	 *	refreshWcdloLeapYear is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcdloLeapYear() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginWcdloLeapYear
			            ,WCDLO_LEAP_YEAR_LEN
			            ,WCDLO_LEAP_YEAR_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloLeapYear", beginWcdloLeapYear,WCDLO_LEAP_YEAR_LEN);
    }
   	}
     int localWcdliCurYyyyCounter = -1;
     public boolean isWcdliCurYyyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdliCurYyyyCounter != sharedCounter;
         localWcdliCurYyyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdliCurYyyy
	 *	@return wcdliCurYyyy
	 */
	public char[]  getWcdliCurYyyyString() {
	     return getCharArray(beginWcdliCurYyyy,WCDLI_CUR_YYYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdliCurYyyyIsNumeric() {
	    return isNumeric(beginWcdliCurYyyy
	                    ,beginWcdliCurYyyy + WCDLI_CUR_YYYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLI_CUR_YYYY_LEN = 4;
  	/**
	 * serializeWcdliCurYyyy
	 */
	protected void serializeWcdliCurYyyy(int wcdliCurYyyy) {
		 putNumber(beginWcdliCurYyyy,wcdliCurYyyy,WCDLI_CUR_YYYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdliCurYyyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdliCurYyyy
	 */
   	protected  int serializeWcdliCurYyyy(char[] value) {
	    int  wcdliCurYyyy;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdliCurYyyy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginWcdliCurYyyy
		       ,4
		      );
		 localWcdliCurYyyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdliCurYyyy;
    }

   protected int checkWcdliCurYyyyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdliCurYyyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdliCurYyyy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdliCurYyyy
			                 ,WCDLI_CUR_YYYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdliCurYyyy", beginWcdliCurYyyy,WCDLI_CUR_YYYY_LEN);
    }
   	}
         int localW1Counter = -1;
         public boolean isW1Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localW1Counter != sharedCounter;
             localW1Counter = sharedCounter; return hasModified;
         }
         int localW2Counter = -1;
         public boolean isW2Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localW2Counter != sharedCounter;
             localW2Counter = sharedCounter; return hasModified;
         }
         int localW3Counter = -1;
         public boolean isW3Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localW3Counter != sharedCounter;
             localW3Counter = sharedCounter; return hasModified;
         }
         int localW4Counter = -1;
         public boolean isW4Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localW4Counter != sharedCounter;
             localW4Counter = sharedCounter; return hasModified;
         }
         int localW5Counter = -1;
         public boolean isW5Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localW5Counter != sharedCounter;
            localW5Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkW5MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localCcatTitleSizeCounter = -1;
         public boolean isCcatTitleSizeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCcatTitleSizeCounter != sharedCounter;
            localCcatTitleSizeCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCcatTitleSizeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localCcatCombinedSizeCounter = -1;
         public boolean isCcatCombinedSizeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCcatCombinedSizeCounter != sharedCounter;
            localCcatCombinedSizeCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCcatCombinedSizeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localPctWoPriceCounter = -1;
     public boolean isPctWoPriceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPctWoPriceCounter != sharedCounter;
         localPctWoPriceCounter = sharedCounter; return hasModified;
     }
	protected static final int PCT_WO_PRICE_LEN = 11;
	/**
	 * 	serialize this PctWoPrice
	 */
   protected void serializePctWoPrice(char[] pctWoPrice) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pctWoPrice,0,getStringValue(),beginPctWoPrice,PCT_WO_PRICE_LEN);
       localPctWoPriceCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPctWoPriceConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshPctWoPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPctWoPrice() {	 
   		return (substring(getStringValue(),beginPctWoPrice,beginPctWoPrice + PCT_WO_PRICE_LEN));
   	}
        int localPctWithNoPriceCounter = -1;
        public boolean isPctWithNoPriceModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPctWithNoPriceCounter != sharedCounter;
           localPctWithNoPriceCounter = sharedCounter; return hasModified; 
        }
	    public boolean pctWithNoPriceIsNumeric() {
	      return decimalIsNumeric(beginPctWithNoPrice,PCT_WITH_NO_PRICE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] pctWithNoPriceString() {
            return getPackedString(beginPctWithNoPrice,PCT_WITH_NO_PRICE_LEN);
         }
   protected static final int PCT_WITH_NO_PRICE_LEN = 3;
   protected static final int PCT_WITH_NO_PRICE_SCALE = 2;
  	/**
	 * 	serializePctWithNoPrice
	 */
	protected void serializePctWithNoPrice(BigDecimal pctWithNoPrice) {
		   putDecimal(beginPctWithNoPrice,pctWithNoPrice,PCT_WITH_NO_PRICE_LEN,PCT_WITH_NO_PRICE_SCALE,true);
		 localPctWithNoPriceCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkPctWithNoPriceMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }
     /**
	 *	refreshPctWithNoPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshPctWithNoPrice() throws CFException {	
   	try { 
		 return (getDecimal(beginPctWithNoPrice,PCT_WITH_NO_PRICE_LEN,PCT_WITH_NO_PRICE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("pctWithNoPrice", beginPctWithNoPrice,PCT_WITH_NO_PRICE_LEN);
     }
   	}
        int localRecsWithoutPriceCounter = -1;
        public boolean isRecsWithoutPriceModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRecsWithoutPriceCounter != sharedCounter;
           localRecsWithoutPriceCounter = sharedCounter; return hasModified; 
        }
	    public boolean recsWithoutPriceIsNumeric() {
	      return decimalIsNumeric(beginRecsWithoutPrice,RECS_WITHOUT_PRICE_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int RECS_WITHOUT_PRICE_LEN = 6;
  	/**
	 * 	serializeRecsWithoutPrice
	 */
	protected void serializeRecsWithoutPrice(long recsWithoutPrice) {
		   putDecimal(beginRecsWithoutPrice,recsWithoutPrice,RECS_WITHOUT_PRICE_LEN,true);
   }
   

   protected long checkRecsWithoutPriceMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshRecsWithoutPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRecsWithoutPrice() throws CFException {	
   	try { 
		 return (getLongDecimal(beginRecsWithoutPrice,RECS_WITHOUT_PRICE_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("recsWithoutPrice", beginRecsWithoutPrice,RECS_WITHOUT_PRICE_LEN);
     }
   	}
        int localDetailRecsCounter = -1;
        public boolean isDetailRecsModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDetailRecsCounter != sharedCounter;
           localDetailRecsCounter = sharedCounter; return hasModified; 
        }
	    public boolean detailRecsIsNumeric() {
	      return decimalIsNumeric(beginDetailRecs,DETAIL_RECS_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int DETAIL_RECS_LEN = 6;
  	/**
	 * 	serializeDetailRecs
	 */
	protected void serializeDetailRecs(long detailRecs) {
		   putDecimal(beginDetailRecs,detailRecs,DETAIL_RECS_LEN,true);
   }
   

   protected long checkDetailRecsMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshDetailRecs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDetailRecs() throws CFException {	
   	try { 
		 return (getLongDecimal(beginDetailRecs,DETAIL_RECS_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("detailRecs", beginDetailRecs,DETAIL_RECS_LEN);
     }
   	}
     int localFCounter = -1;
     
     public boolean isFModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFCounter != sharedCounter;
         localFCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of f
	 *	@return f
	 */
	public char[]  getFString() {
	    return getCharArray(beginF,F_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fIsNumeric() {
		    return isNumeric(beginF
	                    ,beginF + F_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int F_LEN = 11;
  protected  static final int F_SCALE = 2;

   protected BigDecimal checkFMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }

  	/**
	 * serializeF
	 */
	protected void serializeF(BigDecimal f) {
	       putNumber(beginF,f,F_LEN,F_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeF
	 */
   	protected  BigDecimal serializeF(char[] value) throws CFException {
        if (value.length < 11) value = pad(11, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginF
		       ,11
		      );		 localFCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,F_LEN,F_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("f", beginF,F_LEN);
    	}
    }
    /**
	 *	refreshF is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshF() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginF
			            ,F_LEN
			            ,F_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("f", beginF,F_LEN);
    }
   	}
     int localACounter = -1;
     
     public boolean isAModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localACounter != sharedCounter;
         localACounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of a
	 *	@return a
	 */
	public char[]  getAString() {
	    return getCharArray(beginA,A_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean aIsNumeric() {
		    return isNumeric(beginA
	                    ,beginA + A_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int A_LEN = 9;
  protected  static final int A_SCALE = 2;

   protected BigDecimal checkAMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,9/*precision*/);
   }

  	/**
	 * serializeA
	 */
	protected void serializeA(BigDecimal a) {
	       putNumber(beginA,a,A_LEN,A_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localACounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeA
	 */
   	protected  BigDecimal serializeA(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginA
		       ,9
		      );		 localACounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,A_LEN,A_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("a", beginA,A_LEN);
    	}
    }
    /**
	 *	refreshA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshA() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginA
			            ,A_LEN
			            ,A_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("a", beginA,A_LEN);
    }
   	}
        int localBCounter = -1;
        public boolean isBModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localBCounter != sharedCounter;
           localBCounter = sharedCounter; return hasModified; 
        }
	    public boolean bIsNumeric() {
	      return decimalIsNumeric(beginB,B_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] bString() {
            return getPackedString(beginB,B_LEN);
         }
   protected static final int B_LEN = 6;
   protected static final int B_SCALE = 3;
  	/**
	 * 	serializeB
	 */
	protected void serializeB(BigDecimal b) {
		   putDecimal(beginB,b,B_LEN,B_SCALE,true);
		 localBCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkBMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshB is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshB() throws CFException {	
   	try { 
		 return (getDecimal(beginB,B_LEN,B_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("b", beginB,B_LEN);
     }
   	}
        int localCCounter = -1;
        public boolean isCModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCCounter != sharedCounter;
           localCCounter = sharedCounter; return hasModified; 
        }
	    public boolean cIsNumeric() {
	      return decimalIsNumeric(beginC,C_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] cString() {
            return getPackedString(beginC,C_LEN);
         }
   protected static final int C_LEN = 6;
   protected static final int C_SCALE = 3;
  	/**
	 * 	serializeC
	 */
	protected void serializeC(BigDecimal c) {
		   putDecimal(beginC,c,C_LEN,C_SCALE,true);
		 localCCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkCMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshC is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC() throws CFException {	
   	try { 
		 return (getDecimal(beginC,C_LEN,C_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("c", beginC,C_LEN);
     }
   	}
     int localDCounter = -1;
     
     public boolean isDModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDCounter != sharedCounter;
         localDCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of d
	 *	@return d
	 */
	public char[]  getDString() {
	    return getCharArray(beginD,D_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dIsNumeric() {
		    return isNumeric(beginD
	                    ,beginD + D_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int D_LEN = 9;
  protected  static final int D_SCALE = 2;

   protected BigDecimal checkDMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,9/*precision*/);
   }

  	/**
	 * serializeD
	 */
	protected void serializeD(BigDecimal d) {
	       putNumber(beginD,d,D_LEN,D_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeD
	 */
   	protected  BigDecimal serializeD(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginD
		       ,9
		      );		 localDCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,D_LEN,D_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("d", beginD,D_LEN);
    	}
    }
    /**
	 *	refreshD is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshD() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginD
			            ,D_LEN
			            ,D_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("d", beginD,D_LEN);
    }
   	}
     int localECounter = -1;
     
     public boolean isEModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localECounter != sharedCounter;
         localECounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of e
	 *	@return e
	 */
	public char[]  getEString() {
	    return getCharArray(beginE,E_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean eIsNumeric() {
		    return isNumeric(beginE
	                    ,beginE + E_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int E_LEN = 11;
  protected  static final int E_SCALE = 2;

   protected BigDecimal checkEMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }

  	/**
	 * serializeE
	 */
	protected void serializeE(BigDecimal e) {
	       putNumber(beginE,e,E_LEN,E_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localECounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeE
	 */
   	protected  BigDecimal serializeE(char[] value) throws CFException {
        if (value.length < 11) value = pad(11, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginE
		       ,11
		      );		 localECounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,E_LEN,E_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("e", beginE,E_LEN);
    	}
    }
    /**
	 *	refreshE is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshE() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginE
			            ,E_LEN
			            ,E_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("e", beginE,E_LEN);
    }
   	}
     int localCoordinatedGenerationCounter = -1;
     public boolean isCoordinatedGenerationModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCoordinatedGenerationCounter != sharedCounter;
         localCoordinatedGenerationCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of coordinatedGeneration
	 *	@return coordinatedGeneration
	 */
	public char[]  getCoordinatedGenerationString() {
	     return getCharArray(beginCoordinatedGeneration,COORDINATED_GENERATION_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean coordinatedGenerationIsNumeric() {
	    return isNumeric(beginCoordinatedGeneration
	                    ,beginCoordinatedGeneration + COORDINATED_GENERATION_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int COORDINATED_GENERATION_LEN = 3;
  	/**
	 * serializeCoordinatedGeneration
	 */
	protected void serializeCoordinatedGeneration(int coordinatedGeneration) {
		 putNumber(beginCoordinatedGeneration,coordinatedGeneration,COORDINATED_GENERATION_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCoordinatedGenerationCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCoordinatedGeneration
	 */
   	protected  int serializeCoordinatedGeneration(char[] value) {
	    int  coordinatedGeneration;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    coordinatedGeneration = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginCoordinatedGeneration
		       ,3
		      );
		 localCoordinatedGenerationCounter = shareString.getSerializedField().getModifiedCounter();
		return  coordinatedGeneration;
    }

   protected int checkCoordinatedGenerationMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCoordinatedGeneration is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCoordinatedGeneration() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCoordinatedGeneration
			                 ,COORDINATED_GENERATION_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("coordinatedGeneration", beginCoordinatedGeneration,COORDINATED_GENERATION_LEN);
    }
   	}
     int localReportGenCounter = -1;
     public boolean isReportGenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReportGenCounter != sharedCounter;
         localReportGenCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of reportGen
	 *	@return reportGen
	 */
	public char[]  getReportGenString() {
	     return getCharArray(beginReportGen,REPORT_GEN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean reportGenIsNumeric() {
	    return isNumeric(beginReportGen
	                    ,beginReportGen + REPORT_GEN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int REPORT_GEN_LEN = 3;
  	/**
	 * serializeReportGen
	 */
	protected void serializeReportGen(int reportGen) {
		 putNumber(beginReportGen,reportGen,REPORT_GEN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localReportGenCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeReportGen
	 */
   	protected  int serializeReportGen(char[] value) {
	    int  reportGen;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    reportGen = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginReportGen
		       ,3
		      );
		 localReportGenCounter = shareString.getSerializedField().getModifiedCounter();
		return  reportGen;
    }

   protected int checkReportGenMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshReportGen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshReportGen() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginReportGen
			                 ,REPORT_GEN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("reportGen", beginReportGen,REPORT_GEN_LEN);
    }
   	}
     int localCbsumGenCounter = -1;
     public boolean isCbsumGenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCbsumGenCounter != sharedCounter;
         localCbsumGenCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cbsumGen
	 *	@return cbsumGen
	 */
	public char[]  getCbsumGenString() {
	     return getCharArray(beginCbsumGen,CBSUM_GEN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cbsumGenIsNumeric() {
	    return isNumeric(beginCbsumGen
	                    ,beginCbsumGen + CBSUM_GEN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CBSUM_GEN_LEN = 3;
  	/**
	 * serializeCbsumGen
	 */
	protected void serializeCbsumGen(int cbsumGen) {
		 putNumber(beginCbsumGen,cbsumGen,CBSUM_GEN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCbsumGenCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCbsumGen
	 */
   	protected  int serializeCbsumGen(char[] value) {
	    int  cbsumGen;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cbsumGen = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginCbsumGen
		       ,3
		      );
		 localCbsumGenCounter = shareString.getSerializedField().getModifiedCounter();
		return  cbsumGen;
    }

   protected int checkCbsumGenMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCbsumGen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCbsumGen() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCbsumGen
			                 ,CBSUM_GEN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cbsumGen", beginCbsumGen,CBSUM_GEN_LEN);
    }
   	}
     int localOmsumpvGenCounter = -1;
     public boolean isOmsumpvGenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOmsumpvGenCounter != sharedCounter;
         localOmsumpvGenCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of omsumpvGen
	 *	@return omsumpvGen
	 */
	public char[]  getOmsumpvGenString() {
	     return getCharArray(beginOmsumpvGen,OMSUMPV_GEN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean omsumpvGenIsNumeric() {
	    return isNumeric(beginOmsumpvGen
	                    ,beginOmsumpvGen + OMSUMPV_GEN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OMSUMPV_GEN_LEN = 3;
  	/**
	 * serializeOmsumpvGen
	 */
	protected void serializeOmsumpvGen(int omsumpvGen) {
		 putNumber(beginOmsumpvGen,omsumpvGen,OMSUMPV_GEN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOmsumpvGenCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOmsumpvGen
	 */
   	protected  int serializeOmsumpvGen(char[] value) {
	    int  omsumpvGen;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    omsumpvGen = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginOmsumpvGen
		       ,3
		      );
		 localOmsumpvGenCounter = shareString.getSerializedField().getModifiedCounter();
		return  omsumpvGen;
    }

   protected int checkOmsumpvGenMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOmsumpvGen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOmsumpvGen() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOmsumpvGen
			                 ,OMSUMPV_GEN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("omsumpvGen", beginOmsumpvGen,OMSUMPV_GEN_LEN);
    }
   	}
     int localOmauditGenCounter = -1;
     public boolean isOmauditGenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOmauditGenCounter != sharedCounter;
         localOmauditGenCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of omauditGen
	 *	@return omauditGen
	 */
	public char[]  getOmauditGenString() {
	     return getCharArray(beginOmauditGen,OMAUDIT_GEN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean omauditGenIsNumeric() {
	    return isNumeric(beginOmauditGen
	                    ,beginOmauditGen + OMAUDIT_GEN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OMAUDIT_GEN_LEN = 3;
  	/**
	 * serializeOmauditGen
	 */
	protected void serializeOmauditGen(int omauditGen) {
		 putNumber(beginOmauditGen,omauditGen,OMAUDIT_GEN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOmauditGenCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOmauditGen
	 */
   	protected  int serializeOmauditGen(char[] value) {
	    int  omauditGen;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    omauditGen = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginOmauditGen
		       ,3
		      );
		 localOmauditGenCounter = shareString.getSerializedField().getModifiedCounter();
		return  omauditGen;
    }

   protected int checkOmauditGenMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOmauditGen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOmauditGen() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOmauditGen
			                 ,OMAUDIT_GEN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("omauditGen", beginOmauditGen,OMAUDIT_GEN_LEN);
    }
   	}
     int localOmencfGenCounter = -1;
     public boolean isOmencfGenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOmencfGenCounter != sharedCounter;
         localOmencfGenCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of omencfGen
	 *	@return omencfGen
	 */
	public char[]  getOmencfGenString() {
	     return getCharArray(beginOmencfGen,OMENCF_GEN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean omencfGenIsNumeric() {
	    return isNumeric(beginOmencfGen
	                    ,beginOmencfGen + OMENCF_GEN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OMENCF_GEN_LEN = 3;
  	/**
	 * serializeOmencfGen
	 */
	protected void serializeOmencfGen(int omencfGen) {
		 putNumber(beginOmencfGen,omencfGen,OMENCF_GEN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOmencfGenCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOmencfGen
	 */
   	protected  int serializeOmencfGen(char[] value) {
	    int  omencfGen;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    omencfGen = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginOmencfGen
		       ,3
		      );
		 localOmencfGenCounter = shareString.getSerializedField().getModifiedCounter();
		return  omencfGen;
    }

   protected int checkOmencfGenMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOmencfGen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOmencfGen() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOmencfGen
			                 ,OMENCF_GEN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("omencfGen", beginOmencfGen,OMENCF_GEN_LEN);
    }
   	}
     int localDecimalNo300Counter = -1;
     public boolean isDecimalNo300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDecimalNo300Counter != sharedCounter;
         localDecimalNo300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of decimalNo300
	 *	@return decimalNo300
	 */
	public char[]  getDecimalNo300String() {
	     return getCharArray(beginDecimalNo300,DECIMAL_NO_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean decimalNo300IsNumeric() {
	    return isNumeric(beginDecimalNo300
	                    ,beginDecimalNo300 + DECIMAL_NO_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DECIMAL_NO_300_LEN = 11;
  	/**
	 * serializeDecimalNo300
	 */
	protected void serializeDecimalNo300(long decimalNo300) {
		 putNumber(beginDecimalNo300,decimalNo300,DECIMAL_NO_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDecimalNo300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDecimalNo300
	 */
   	protected  long serializeDecimalNo300(char[] value) {
	    long  decimalNo300;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    decimalNo300 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginDecimalNo300
		       ,11
		      );
		 localDecimalNo300Counter = shareString.getSerializedField().getModifiedCounter();
		return  decimalNo300;
    }

   protected long checkDecimalNo300MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDecimalNo300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDecimalNo300() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDecimalNo300
			                 ,DECIMAL_NO_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("decimalNo300", beginDecimalNo300,DECIMAL_NO_300_LEN);
    }
   	}




}
  
