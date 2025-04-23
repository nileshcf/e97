package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 508;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAxisWpCoiAccum;
            protected  int beginAxisWpCoiRound;
            protected  int beginAxisWpCoiRoundDisp;
            protected  int beginWlilhI;
            protected  int beginWlilhAccLoanAmt;
            protected  int beginWlilhAccLoanAndIntAmt;
            protected  int beginWlilhPrvRt;
            protected  int beginL1680TotalDays;
            protected  int beginW6530PvIntPmtAmt;
            protected  int beginW6530CfAdjustedAmt;
            protected  int beginW6530CfIntRt;
            protected  int beginW6530MktvalIntRt;
            protected  int beginW6530MktvalAdjYears;
            protected  int beginW6530PvMatPmtAmt;
            protected  int beginW6530PvIntPmtAmtDis;
            protected  int beginW6530PvMatPmtAmtDis;
            protected  int beginWvSumSettlValue;
            protected  int beginWvSumDexValue;
            protected  int beginWvCostValue;
            protected  int beginPrclcstLatestCostValue;
            protected  int beginPrclfcstFnceActualsUsdA;
            protected  int beginWvPrtQuantity;
            protected  int beginWpCurrUnitDayN;
            protected  int beginWpUsdValue;
            protected  int beginWvNumericOutput;
            protected  int beginWvMaxIntDigits;
            protected  int beginWvMaxDecDigits;
            protected  int beginWvIntCtr;
            protected  int beginWvDecCtr;
            protected  int beginWvSignCtr;
            protected  int beginWvCommaCtr;
            protected  int beginWvFldsFilled;
            protected  int beginWvStartPosn;
            protected  int beginWvCommaNdx;
            protected  int beginWvToNdx;
            protected  int beginWvFromNdx;
            protected  int beginWvKbblVol;
            protected  int beginPrclexpKbblVol;
            protected  int beginWxUserQuantity;
            protected  int beginWpFmseLmtKtN;
            protected  int beginTrdgauthQuantityAuthA;
            protected  int beginWvBtfFactor;
            protected  int beginWvDBblVol;
            protected  int beginWvDBarrels;
            protected  int beginWpDBarrels;
            protected  int beginWvDMtAmt;
            protected  int beginWvEffWeightPc;
            protected  int beginDealgpalAllocWgtnNum;
            protected  int beginParcelBblVol;
            protected  int beginWvDQty;
            protected  int beginWpDQty;
            protected  int beginWvMmbConv;
            protected  int beginWvDTonnes;
            protected  int beginWvExposureInt;
            protected  int beginWvExposureAmt;
            protected  int beginWvUsdBblVariance;
            protected  int beginWvOrigCost;
            protected  int beginWvLtstCost;
            protected  int beginWvExtrBblVar;
            protected  int beginWvUsdVariance;
            protected  int beginWvExtrUsdVar;
            protected  int beginIdx;
	
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
  
  
             beginAxisWpCoiAccum = getStartOffset() + 0;	// set offset for serialization
  
             beginAxisWpCoiRound = getStartOffset() + 15;	// set offset for serialization
  
             beginAxisWpCoiRoundDisp = getStartOffset() + 24;	// set offset for serialization
  
             beginWlilhI = getStartOffset() + 34;	// set offset for serialization
  
             beginWlilhAccLoanAmt = getStartOffset() + 38;	// set offset for serialization
  
             beginWlilhAccLoanAndIntAmt = getStartOffset() + 44;	// set offset for serialization
  
             beginWlilhPrvRt = getStartOffset() + 50;	// set offset for serialization
  
             beginL1680TotalDays = getStartOffset() + 55;	// set offset for serialization
  
             beginW6530PvIntPmtAmt = getStartOffset() + 59;	// set offset for serialization
  
             beginW6530CfAdjustedAmt = getStartOffset() + 69;	// set offset for serialization
  
             beginW6530CfIntRt = getStartOffset() + 77;	// set offset for serialization
  
             beginW6530MktvalIntRt = getStartOffset() + 84;	// set offset for serialization
  
             beginW6530MktvalAdjYears = getStartOffset() + 91;	// set offset for serialization
  
             beginW6530PvMatPmtAmt = getStartOffset() + 94;	// set offset for serialization
  
             beginW6530PvIntPmtAmtDis = getStartOffset() + 104;	// set offset for serialization
  
             beginW6530PvMatPmtAmtDis = getStartOffset() + 124;	// set offset for serialization
  
             beginWvSumSettlValue = getStartOffset() + 144;	// set offset for serialization
  
             beginWvSumDexValue = getStartOffset() + 152;	// set offset for serialization
  
             beginWvCostValue = getStartOffset() + 160;	// set offset for serialization
  
             beginPrclcstLatestCostValue = getStartOffset() + 168;	// set offset for serialization
  
             beginPrclfcstFnceActualsUsdA = getStartOffset() + 175;	// set offset for serialization
  
             beginWvPrtQuantity = getStartOffset() + 182;	// set offset for serialization
  
             beginWpCurrUnitDayN = getStartOffset() + 197;	// set offset for serialization
  
             beginWpUsdValue = getStartOffset() + 209;	// set offset for serialization
  
             beginWvNumericOutput = getStartOffset() + 221;	// set offset for serialization
  
             beginWvMaxIntDigits = getStartOffset() + 238;	// set offset for serialization
  
             beginWvMaxDecDigits = getStartOffset() + 241;	// set offset for serialization
  
             beginWvIntCtr = getStartOffset() + 244;	// set offset for serialization
  
             beginWvDecCtr = getStartOffset() + 247;	// set offset for serialization
  
             beginWvSignCtr = getStartOffset() + 250;	// set offset for serialization
  
             beginWvCommaCtr = getStartOffset() + 253;	// set offset for serialization
  
             beginWvFldsFilled = getStartOffset() + 256;	// set offset for serialization
  
             beginWvStartPosn = getStartOffset() + 259;	// set offset for serialization
  
             beginWvCommaNdx = getStartOffset() + 262;	// set offset for serialization
  
             beginWvToNdx = getStartOffset() + 265;	// set offset for serialization
  
             beginWvFromNdx = getStartOffset() + 268;	// set offset for serialization
  
  
  
  
  
  
  
  
             beginWvKbblVol = getStartOffset() + 271;	// set offset for serialization
  
             beginPrclexpKbblVol = getStartOffset() + 285;	// set offset for serialization
  
             beginWxUserQuantity = getStartOffset() + 292;	// set offset for serialization
  
             beginWpFmseLmtKtN = getStartOffset() + 311;	// set offset for serialization
  
             beginTrdgauthQuantityAuthA = getStartOffset() + 321;	// set offset for serialization
  
             beginWvBtfFactor = getStartOffset() + 328;	// set offset for serialization
  
             beginWvDBblVol = getStartOffset() + 335;	// set offset for serialization
  
             beginWvDBarrels = getStartOffset() + 345;	// set offset for serialization
  
             beginWpDBarrels = getStartOffset() + 355;	// set offset for serialization
  
             beginWvDMtAmt = getStartOffset() + 375;	// set offset for serialization
  
             beginWvEffWeightPc = getStartOffset() + 384;	// set offset for serialization
  
             beginDealgpalAllocWgtnNum = getStartOffset() + 389;	// set offset for serialization
  
             beginParcelBblVol = getStartOffset() + 394;	// set offset for serialization
  
             beginWvDQty = getStartOffset() + 401;	// set offset for serialization
  
             beginWpDQty = getStartOffset() + 410;	// set offset for serialization
  
             beginWvMmbConv = getStartOffset() + 429;	// set offset for serialization
  
             beginWvDTonnes = getStartOffset() + 432;	// set offset for serialization
  
             beginWvExposureInt = getStartOffset() + 441;	// set offset for serialization
  
             beginWvExposureAmt = getStartOffset() + 446;	// set offset for serialization
  
             beginWvUsdBblVariance = getStartOffset() + 453;	// set offset for serialization
  
             beginWvOrigCost = getStartOffset() + 460;	// set offset for serialization
  
             beginWvLtstCost = getStartOffset() + 467;	// set offset for serialization
  
             beginWvExtrBblVar = getStartOffset() + 474;	// set offset for serialization
  
             beginWvUsdVariance = getStartOffset() + 488;	// set offset for serialization
  
             beginWvExtrUsdVar = getStartOffset() + 495;	// set offset for serialization
  
             beginIdx = getStartOffset() + 505;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localBiorptvlBatParmValNumCounter = -1;
         public boolean isBiorptvlBatParmValNumModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBiorptvlBatParmValNumCounter != sharedCounter;
            localBiorptvlBatParmValNumCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkBiorptvlBatParmValNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localWvGeneralParmCounter = -1;
     public boolean isWvGeneralParmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvGeneralParmCounter != sharedCounter;
         localWvGeneralParmCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWvGeneralParmConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localAxisWpCoiAccumCounter = -1;
     
     public boolean isAxisWpCoiAccumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAxisWpCoiAccumCounter != sharedCounter;
         localAxisWpCoiAccumCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of axisWpCoiAccum
	 *	@return axisWpCoiAccum
	 */
	public char[]  getAxisWpCoiAccumString() {
	    return getCharArray(beginAxisWpCoiAccum,AXIS_WP_COI_ACCUM_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean axisWpCoiAccumIsNumeric() {
		    return isNumeric(beginAxisWpCoiAccum
	                    ,beginAxisWpCoiAccum + AXIS_WP_COI_ACCUM_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int AXIS_WP_COI_ACCUM_LEN = 15;
  protected  static final int AXIS_WP_COI_ACCUM_SCALE = 2;

   protected BigDecimal checkAxisWpCoiAccumMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeAxisWpCoiAccum
	 */
	protected void serializeAxisWpCoiAccum(BigDecimal axisWpCoiAccum) {
	       putNumber(beginAxisWpCoiAccum,axisWpCoiAccum,AXIS_WP_COI_ACCUM_LEN,AXIS_WP_COI_ACCUM_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAxisWpCoiAccumCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeAxisWpCoiAccum
	 */
   	protected  BigDecimal serializeAxisWpCoiAccum(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginAxisWpCoiAccum
		       ,15
		      );		 localAxisWpCoiAccumCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,AXIS_WP_COI_ACCUM_LEN,AXIS_WP_COI_ACCUM_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("axisWpCoiAccum", beginAxisWpCoiAccum,AXIS_WP_COI_ACCUM_LEN);
    	}
    }
    /**
	 *	refreshAxisWpCoiAccum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshAxisWpCoiAccum() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginAxisWpCoiAccum
			            ,AXIS_WP_COI_ACCUM_LEN
			            ,AXIS_WP_COI_ACCUM_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("axisWpCoiAccum", beginAxisWpCoiAccum,AXIS_WP_COI_ACCUM_LEN);
    }
   	}
     int localAxisWpCoiRoundCounter = -1;
     public boolean isAxisWpCoiRoundModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAxisWpCoiRoundCounter != sharedCounter;
         localAxisWpCoiRoundCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of axisWpCoiRound
	 *	@return axisWpCoiRound
	 */
	public char[]  getAxisWpCoiRoundString() {
	     return getCharArray(beginAxisWpCoiRound,AXIS_WP_COI_ROUND_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean axisWpCoiRoundIsNumeric() {
	    return isNumeric(beginAxisWpCoiRound
	                    ,beginAxisWpCoiRound + AXIS_WP_COI_ROUND_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AXIS_WP_COI_ROUND_LEN = 9;
  	/**
	 * serializeAxisWpCoiRound
	 */
	protected void serializeAxisWpCoiRound(int axisWpCoiRound) {
		 putNumber(beginAxisWpCoiRound,axisWpCoiRound,AXIS_WP_COI_ROUND_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAxisWpCoiRoundCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAxisWpCoiRound
	 */
   	protected  int serializeAxisWpCoiRound(char[] value) {
	    int  axisWpCoiRound;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    axisWpCoiRound = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginAxisWpCoiRound
		       ,9
		      );
		 localAxisWpCoiRoundCounter = shareString.getSerializedField().getModifiedCounter();
		return  axisWpCoiRound;
    }

   protected int checkAxisWpCoiRoundMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshAxisWpCoiRound is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAxisWpCoiRound() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAxisWpCoiRound
			                 ,AXIS_WP_COI_ROUND_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("axisWpCoiRound", beginAxisWpCoiRound,AXIS_WP_COI_ROUND_LEN);
    }
   	}
     int localAxisWpCoiRoundDispCounter = -1;
     public boolean isAxisWpCoiRoundDispModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAxisWpCoiRoundDispCounter != sharedCounter;
         localAxisWpCoiRoundDispCounter = sharedCounter; return hasModified;
     }
	protected static final int AXIS_WP_COI_ROUND_DISP_LEN = 10;
	/**
	 * 	serialize this AxisWpCoiRoundDisp
	 */
   protected void serializeAxisWpCoiRoundDisp(char[] axisWpCoiRoundDisp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(axisWpCoiRoundDisp,0,getStringValue(),beginAxisWpCoiRoundDisp,AXIS_WP_COI_ROUND_DISP_LEN);
       localAxisWpCoiRoundDispCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAxisWpCoiRoundDispConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshAxisWpCoiRoundDisp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAxisWpCoiRoundDisp() {	 
   		return (substring(getStringValue(),beginAxisWpCoiRoundDisp,beginAxisWpCoiRoundDisp + AXIS_WP_COI_ROUND_DISP_LEN));
   	}
     int localWlilhICounter = -1;
     public boolean isWlilhIModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWlilhICounter != sharedCounter;
         localWlilhICounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wlilhI
	 *	@return wlilhI
	 */
	public char[]  getWlilhIString() {
	     return getCharArray(beginWlilhI,WLILH_I_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wlilhIIsNumeric() {
	    return isNumeric(beginWlilhI
	                    ,beginWlilhI + WLILH_I_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WLILH_I_LEN = 4;
  	/**
	 * serializeWlilhI
	 */
	protected void serializeWlilhI(short wlilhI) {
		 putNumber(beginWlilhI,wlilhI,WLILH_I_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWlilhICounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWlilhI
	 */
   	protected  short serializeWlilhI(char[] value) {
	    short  wlilhI;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wlilhI = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginWlilhI
		       ,4
		      );
		 localWlilhICounter = shareString.getSerializedField().getModifiedCounter();
		return  wlilhI;
    }

   protected short checkWlilhIMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshWlilhI is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshWlilhI() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginWlilhI
			                 ,WLILH_I_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wlilhI", beginWlilhI,WLILH_I_LEN);
    }
   	}
        int localWlilhAccLoanAmtCounter = -1;
        public boolean isWlilhAccLoanAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWlilhAccLoanAmtCounter != sharedCounter;
           localWlilhAccLoanAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean wlilhAccLoanAmtIsNumeric() {
	      return decimalIsNumeric(beginWlilhAccLoanAmt,WLILH_ACC_LOAN_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wlilhAccLoanAmtString() {
            return getPackedString(beginWlilhAccLoanAmt,WLILH_ACC_LOAN_AMT_LEN);
         }
   protected static final int WLILH_ACC_LOAN_AMT_LEN = 6;
   protected static final int WLILH_ACC_LOAN_AMT_SCALE = 2;
  	/**
	 * 	serializeWlilhAccLoanAmt
	 */
	protected void serializeWlilhAccLoanAmt(BigDecimal wlilhAccLoanAmt) {
		   putDecimal(beginWlilhAccLoanAmt,wlilhAccLoanAmt,WLILH_ACC_LOAN_AMT_LEN,WLILH_ACC_LOAN_AMT_SCALE,true);
		 localWlilhAccLoanAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWlilhAccLoanAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshWlilhAccLoanAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWlilhAccLoanAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginWlilhAccLoanAmt,WLILH_ACC_LOAN_AMT_LEN,WLILH_ACC_LOAN_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wlilhAccLoanAmt", beginWlilhAccLoanAmt,WLILH_ACC_LOAN_AMT_LEN);
     }
   	}
        int localWlilhAccLoanAndIntAmtCounter = -1;
        public boolean isWlilhAccLoanAndIntAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWlilhAccLoanAndIntAmtCounter != sharedCounter;
           localWlilhAccLoanAndIntAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean wlilhAccLoanAndIntAmtIsNumeric() {
	      return decimalIsNumeric(beginWlilhAccLoanAndIntAmt,WLILH_ACC_LOAN_AND_INT_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wlilhAccLoanAndIntAmtString() {
            return getPackedString(beginWlilhAccLoanAndIntAmt,WLILH_ACC_LOAN_AND_INT_AMT_LEN);
         }
   protected static final int WLILH_ACC_LOAN_AND_INT_AMT_LEN = 6;
   protected static final int WLILH_ACC_LOAN_AND_INT_AMT_SCALE = 2;
  	/**
	 * 	serializeWlilhAccLoanAndIntAmt
	 */
	protected void serializeWlilhAccLoanAndIntAmt(BigDecimal wlilhAccLoanAndIntAmt) {
		   putDecimal(beginWlilhAccLoanAndIntAmt,wlilhAccLoanAndIntAmt,WLILH_ACC_LOAN_AND_INT_AMT_LEN,WLILH_ACC_LOAN_AND_INT_AMT_SCALE,true);
		 localWlilhAccLoanAndIntAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWlilhAccLoanAndIntAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshWlilhAccLoanAndIntAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWlilhAccLoanAndIntAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginWlilhAccLoanAndIntAmt,WLILH_ACC_LOAN_AND_INT_AMT_LEN,WLILH_ACC_LOAN_AND_INT_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wlilhAccLoanAndIntAmt", beginWlilhAccLoanAndIntAmt,WLILH_ACC_LOAN_AND_INT_AMT_LEN);
     }
   	}
        int localWlilhPrvRtCounter = -1;
        public boolean isWlilhPrvRtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWlilhPrvRtCounter != sharedCounter;
           localWlilhPrvRtCounter = sharedCounter; return hasModified; 
        }
	    public boolean wlilhPrvRtIsNumeric() {
	      return decimalIsNumeric(beginWlilhPrvRt,WLILH_PRV_RT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wlilhPrvRtString() {
            return getPackedString(beginWlilhPrvRt,WLILH_PRV_RT_LEN);
         }
   protected static final int WLILH_PRV_RT_LEN = 5;
   protected static final int WLILH_PRV_RT_SCALE = 6;
  	/**
	 * 	serializeWlilhPrvRt
	 */
	protected void serializeWlilhPrvRt(BigDecimal wlilhPrvRt) {
		   putDecimal(beginWlilhPrvRt,wlilhPrvRt,WLILH_PRV_RT_LEN,WLILH_PRV_RT_SCALE,true);
		 localWlilhPrvRtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWlilhPrvRtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,6/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshWlilhPrvRt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWlilhPrvRt() throws CFException {	
   	try { 
		 return (getDecimal(beginWlilhPrvRt,WLILH_PRV_RT_LEN,WLILH_PRV_RT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wlilhPrvRt", beginWlilhPrvRt,WLILH_PRV_RT_LEN);
     }
   	}
        int localL1680TotalDaysCounter = -1;
        public boolean isL1680TotalDaysModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localL1680TotalDaysCounter != sharedCounter;
           localL1680TotalDaysCounter = sharedCounter; return hasModified; 
        }
	    public boolean l1680TotalDaysIsNumeric() {
	      return decimalIsNumeric(beginL1680TotalDays,L_1680_TOTAL_DAYS_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int L_1680_TOTAL_DAYS_LEN = 4;
  	/**
	 * 	serializeL1680TotalDays
	 */
	protected void serializeL1680TotalDays(int l1680TotalDays) {
		   putDecimal(beginL1680TotalDays,l1680TotalDays,L_1680_TOTAL_DAYS_LEN,true);
   }
   

   protected int checkL1680TotalDaysMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshL1680TotalDays is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshL1680TotalDays() throws CFException {	
   	try { 
		 return (getIntDecimal(beginL1680TotalDays,L_1680_TOTAL_DAYS_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("l1680TotalDays", beginL1680TotalDays,L_1680_TOTAL_DAYS_LEN);
     }
   	}
        int localW6530PvIntPmtAmtCounter = -1;
        public boolean isW6530PvIntPmtAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localW6530PvIntPmtAmtCounter != sharedCounter;
           localW6530PvIntPmtAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean w6530PvIntPmtAmtIsNumeric() {
	      return decimalIsNumeric(beginW6530PvIntPmtAmt,W_6530_PV_INT_PMT_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] w6530PvIntPmtAmtString() {
            return getPackedString(beginW6530PvIntPmtAmt,W_6530_PV_INT_PMT_AMT_LEN);
         }
   protected static final int W_6530_PV_INT_PMT_AMT_LEN = 10;
   protected static final int W_6530_PV_INT_PMT_AMT_SCALE = 5;
  	/**
	 * 	serializeW6530PvIntPmtAmt
	 */
	protected void serializeW6530PvIntPmtAmt(BigDecimal w6530PvIntPmtAmt) {
		   putDecimal(beginW6530PvIntPmtAmt,w6530PvIntPmtAmt,W_6530_PV_INT_PMT_AMT_LEN,W_6530_PV_INT_PMT_AMT_SCALE,true);
		 localW6530PvIntPmtAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkW6530PvIntPmtAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,5/*scale*/,18/*precision*/);
   }
     /**
	 *	refreshW6530PvIntPmtAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshW6530PvIntPmtAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginW6530PvIntPmtAmt,W_6530_PV_INT_PMT_AMT_LEN,W_6530_PV_INT_PMT_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("w6530PvIntPmtAmt", beginW6530PvIntPmtAmt,W_6530_PV_INT_PMT_AMT_LEN);
     }
   	}
        int localW6530CfAdjustedAmtCounter = -1;
        public boolean isW6530CfAdjustedAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localW6530CfAdjustedAmtCounter != sharedCounter;
           localW6530CfAdjustedAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean w6530CfAdjustedAmtIsNumeric() {
	      return decimalIsNumeric(beginW6530CfAdjustedAmt,W_6530_CF_ADJUSTED_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] w6530CfAdjustedAmtString() {
            return getPackedString(beginW6530CfAdjustedAmt,W_6530_CF_ADJUSTED_AMT_LEN);
         }
   protected static final int W_6530_CF_ADJUSTED_AMT_LEN = 8;
   protected static final int W_6530_CF_ADJUSTED_AMT_SCALE = 2;
  	/**
	 * 	serializeW6530CfAdjustedAmt
	 */
	protected void serializeW6530CfAdjustedAmt(BigDecimal w6530CfAdjustedAmt) {
		   putDecimal(beginW6530CfAdjustedAmt,w6530CfAdjustedAmt,W_6530_CF_ADJUSTED_AMT_LEN,W_6530_CF_ADJUSTED_AMT_SCALE,true);
		 localW6530CfAdjustedAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkW6530CfAdjustedAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshW6530CfAdjustedAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshW6530CfAdjustedAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginW6530CfAdjustedAmt,W_6530_CF_ADJUSTED_AMT_LEN,W_6530_CF_ADJUSTED_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("w6530CfAdjustedAmt", beginW6530CfAdjustedAmt,W_6530_CF_ADJUSTED_AMT_LEN);
     }
   	}
        int localW6530CfIntRtCounter = -1;
        public boolean isW6530CfIntRtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localW6530CfIntRtCounter != sharedCounter;
           localW6530CfIntRtCounter = sharedCounter; return hasModified; 
        }
	    public boolean w6530CfIntRtIsNumeric() {
	      return decimalIsNumeric(beginW6530CfIntRt,W_6530_CF_INT_RT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] w6530CfIntRtString() {
            return getPackedString(beginW6530CfIntRt,W_6530_CF_INT_RT_LEN);
         }
   protected static final int W_6530_CF_INT_RT_LEN = 7;
   protected static final int W_6530_CF_INT_RT_SCALE = 8;
  	/**
	 * 	serializeW6530CfIntRt
	 */
	protected void serializeW6530CfIntRt(BigDecimal w6530CfIntRt) {
		   putDecimal(beginW6530CfIntRt,w6530CfIntRt,W_6530_CF_INT_RT_LEN,W_6530_CF_INT_RT_SCALE,true);
		 localW6530CfIntRtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkW6530CfIntRtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,8/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshW6530CfIntRt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshW6530CfIntRt() throws CFException {	
   	try { 
		 return (getDecimal(beginW6530CfIntRt,W_6530_CF_INT_RT_LEN,W_6530_CF_INT_RT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("w6530CfIntRt", beginW6530CfIntRt,W_6530_CF_INT_RT_LEN);
     }
   	}
        int localW6530MktvalIntRtCounter = -1;
        public boolean isW6530MktvalIntRtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localW6530MktvalIntRtCounter != sharedCounter;
           localW6530MktvalIntRtCounter = sharedCounter; return hasModified; 
        }
	    public boolean w6530MktvalIntRtIsNumeric() {
	      return decimalIsNumeric(beginW6530MktvalIntRt,W_6530_MKTVAL_INT_RT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] w6530MktvalIntRtString() {
            return getPackedString(beginW6530MktvalIntRt,W_6530_MKTVAL_INT_RT_LEN);
         }
   protected static final int W_6530_MKTVAL_INT_RT_LEN = 7;
   protected static final int W_6530_MKTVAL_INT_RT_SCALE = 8;
  	/**
	 * 	serializeW6530MktvalIntRt
	 */
	protected void serializeW6530MktvalIntRt(BigDecimal w6530MktvalIntRt) {
		   putDecimal(beginW6530MktvalIntRt,w6530MktvalIntRt,W_6530_MKTVAL_INT_RT_LEN,W_6530_MKTVAL_INT_RT_SCALE,true);
		 localW6530MktvalIntRtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkW6530MktvalIntRtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,8/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshW6530MktvalIntRt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshW6530MktvalIntRt() throws CFException {	
   	try { 
		 return (getDecimal(beginW6530MktvalIntRt,W_6530_MKTVAL_INT_RT_LEN,W_6530_MKTVAL_INT_RT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("w6530MktvalIntRt", beginW6530MktvalIntRt,W_6530_MKTVAL_INT_RT_LEN);
     }
   	}
        int localW6530MktvalAdjYearsCounter = -1;
        public boolean isW6530MktvalAdjYearsModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localW6530MktvalAdjYearsCounter != sharedCounter;
           localW6530MktvalAdjYearsCounter = sharedCounter; return hasModified; 
        }
	    public boolean w6530MktvalAdjYearsIsNumeric() {
	      return decimalIsNumeric(beginW6530MktvalAdjYears,W_6530_MKTVAL_ADJ_YEARS_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int W_6530_MKTVAL_ADJ_YEARS_LEN = 3;
  	/**
	 * 	serializeW6530MktvalAdjYears
	 */
	protected void serializeW6530MktvalAdjYears(int w6530MktvalAdjYears) {
		   putDecimal(beginW6530MktvalAdjYears,w6530MktvalAdjYears,W_6530_MKTVAL_ADJ_YEARS_LEN,true);
   }
   

   protected int checkW6530MktvalAdjYearsMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshW6530MktvalAdjYears is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshW6530MktvalAdjYears() throws CFException {	
   	try { 
		 return (getIntDecimal(beginW6530MktvalAdjYears,W_6530_MKTVAL_ADJ_YEARS_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("w6530MktvalAdjYears", beginW6530MktvalAdjYears,W_6530_MKTVAL_ADJ_YEARS_LEN);
     }
   	}
        int localW6530PvMatPmtAmtCounter = -1;
        public boolean isW6530PvMatPmtAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localW6530PvMatPmtAmtCounter != sharedCounter;
           localW6530PvMatPmtAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean w6530PvMatPmtAmtIsNumeric() {
	      return decimalIsNumeric(beginW6530PvMatPmtAmt,W_6530_PV_MAT_PMT_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] w6530PvMatPmtAmtString() {
            return getPackedString(beginW6530PvMatPmtAmt,W_6530_PV_MAT_PMT_AMT_LEN);
         }
   protected static final int W_6530_PV_MAT_PMT_AMT_LEN = 10;
   protected static final int W_6530_PV_MAT_PMT_AMT_SCALE = 5;
  	/**
	 * 	serializeW6530PvMatPmtAmt
	 */
	protected void serializeW6530PvMatPmtAmt(BigDecimal w6530PvMatPmtAmt) {
		   putDecimal(beginW6530PvMatPmtAmt,w6530PvMatPmtAmt,W_6530_PV_MAT_PMT_AMT_LEN,W_6530_PV_MAT_PMT_AMT_SCALE,true);
		 localW6530PvMatPmtAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkW6530PvMatPmtAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,5/*scale*/,18/*precision*/);
   }
     /**
	 *	refreshW6530PvMatPmtAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshW6530PvMatPmtAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginW6530PvMatPmtAmt,W_6530_PV_MAT_PMT_AMT_LEN,W_6530_PV_MAT_PMT_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("w6530PvMatPmtAmt", beginW6530PvMatPmtAmt,W_6530_PV_MAT_PMT_AMT_LEN);
     }
   	}
     int localW6530PvIntPmtAmtDisCounter = -1;
     public boolean isW6530PvIntPmtAmtDisModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW6530PvIntPmtAmtDisCounter != sharedCounter;
         localW6530PvIntPmtAmtDisCounter = sharedCounter; return hasModified;
     }
	protected static final int W_6530_PV_INT_PMT_AMT_DIS_LEN = 20;
	/**
	 * 	serialize this W6530PvIntPmtAmtDis
	 */
   protected void serializeW6530PvIntPmtAmtDis(char[] w6530PvIntPmtAmtDis) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(w6530PvIntPmtAmtDis,0,getStringValue(),beginW6530PvIntPmtAmtDis,W_6530_PV_INT_PMT_AMT_DIS_LEN);
       localW6530PvIntPmtAmtDisCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkW6530PvIntPmtAmtDisConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshW6530PvIntPmtAmtDis is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshW6530PvIntPmtAmtDis() {	 
   		return (substring(getStringValue(),beginW6530PvIntPmtAmtDis,beginW6530PvIntPmtAmtDis + W_6530_PV_INT_PMT_AMT_DIS_LEN));
   	}
     int localW6530PvMatPmtAmtDisCounter = -1;
     public boolean isW6530PvMatPmtAmtDisModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW6530PvMatPmtAmtDisCounter != sharedCounter;
         localW6530PvMatPmtAmtDisCounter = sharedCounter; return hasModified;
     }
	protected static final int W_6530_PV_MAT_PMT_AMT_DIS_LEN = 20;
	/**
	 * 	serialize this W6530PvMatPmtAmtDis
	 */
   protected void serializeW6530PvMatPmtAmtDis(char[] w6530PvMatPmtAmtDis) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(w6530PvMatPmtAmtDis,0,getStringValue(),beginW6530PvMatPmtAmtDis,W_6530_PV_MAT_PMT_AMT_DIS_LEN);
       localW6530PvMatPmtAmtDisCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkW6530PvMatPmtAmtDisConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshW6530PvMatPmtAmtDis is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshW6530PvMatPmtAmtDis() {	 
   		return (substring(getStringValue(),beginW6530PvMatPmtAmtDis,beginW6530PvMatPmtAmtDis + W_6530_PV_MAT_PMT_AMT_DIS_LEN));
   	}
        int localWvSumSettlValueCounter = -1;
        public boolean isWvSumSettlValueModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvSumSettlValueCounter != sharedCounter;
           localWvSumSettlValueCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvSumSettlValueIsNumeric() {
	      return decimalIsNumeric(beginWvSumSettlValue,WV_SUM_SETTL_VALUE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wvSumSettlValueString() {
            return getPackedString(beginWvSumSettlValue,WV_SUM_SETTL_VALUE_LEN);
         }
   protected static final int WV_SUM_SETTL_VALUE_LEN = 8;
   protected static final int WV_SUM_SETTL_VALUE_SCALE = 4;
  	/**
	 * 	serializeWvSumSettlValue
	 */
	protected void serializeWvSumSettlValue(BigDecimal wvSumSettlValue) {
		   putDecimal(beginWvSumSettlValue,wvSumSettlValue,WV_SUM_SETTL_VALUE_LEN,WV_SUM_SETTL_VALUE_SCALE,true);
		 localWvSumSettlValueCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWvSumSettlValueMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshWvSumSettlValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvSumSettlValue() throws CFException {	
   	try { 
		 return (getDecimal(beginWvSumSettlValue,WV_SUM_SETTL_VALUE_LEN,WV_SUM_SETTL_VALUE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvSumSettlValue", beginWvSumSettlValue,WV_SUM_SETTL_VALUE_LEN);
     }
   	}
        int localWvSumDexValueCounter = -1;
        public boolean isWvSumDexValueModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvSumDexValueCounter != sharedCounter;
           localWvSumDexValueCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvSumDexValueIsNumeric() {
	      return decimalIsNumeric(beginWvSumDexValue,WV_SUM_DEX_VALUE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wvSumDexValueString() {
            return getPackedString(beginWvSumDexValue,WV_SUM_DEX_VALUE_LEN);
         }
   protected static final int WV_SUM_DEX_VALUE_LEN = 8;
   protected static final int WV_SUM_DEX_VALUE_SCALE = 4;
  	/**
	 * 	serializeWvSumDexValue
	 */
	protected void serializeWvSumDexValue(BigDecimal wvSumDexValue) {
		   putDecimal(beginWvSumDexValue,wvSumDexValue,WV_SUM_DEX_VALUE_LEN,WV_SUM_DEX_VALUE_SCALE,true);
		 localWvSumDexValueCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWvSumDexValueMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshWvSumDexValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvSumDexValue() throws CFException {	
   	try { 
		 return (getDecimal(beginWvSumDexValue,WV_SUM_DEX_VALUE_LEN,WV_SUM_DEX_VALUE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvSumDexValue", beginWvSumDexValue,WV_SUM_DEX_VALUE_LEN);
     }
   	}
        int localWvCostValueCounter = -1;
        public boolean isWvCostValueModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvCostValueCounter != sharedCounter;
           localWvCostValueCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvCostValueIsNumeric() {
	      return decimalIsNumeric(beginWvCostValue,WV_COST_VALUE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wvCostValueString() {
            return getPackedString(beginWvCostValue,WV_COST_VALUE_LEN);
         }
   protected static final int WV_COST_VALUE_LEN = 8;
   protected static final int WV_COST_VALUE_SCALE = 4;
  	/**
	 * 	serializeWvCostValue
	 */
	protected void serializeWvCostValue(BigDecimal wvCostValue) {
		   putDecimal(beginWvCostValue,wvCostValue,WV_COST_VALUE_LEN,WV_COST_VALUE_SCALE,true);
		 localWvCostValueCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWvCostValueMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshWvCostValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvCostValue() throws CFException {	
   	try { 
		 return (getDecimal(beginWvCostValue,WV_COST_VALUE_LEN,WV_COST_VALUE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvCostValue", beginWvCostValue,WV_COST_VALUE_LEN);
     }
   	}
        int localPrclcstLatestCostValueCounter = -1;
        public boolean isPrclcstLatestCostValueModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPrclcstLatestCostValueCounter != sharedCounter;
           localPrclcstLatestCostValueCounter = sharedCounter; return hasModified; 
        }
	    public boolean prclcstLatestCostValueIsNumeric() {
	      return decimalIsNumeric(beginPrclcstLatestCostValue,PRCLCST_LATEST_COST_VALUE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] prclcstLatestCostValueString() {
            return getPackedString(beginPrclcstLatestCostValue,PRCLCST_LATEST_COST_VALUE_LEN);
         }
   protected static final int PRCLCST_LATEST_COST_VALUE_LEN = 7;
   protected static final int PRCLCST_LATEST_COST_VALUE_SCALE = 4;
  	/**
	 * 	serializePrclcstLatestCostValue
	 */
	protected void serializePrclcstLatestCostValue(BigDecimal prclcstLatestCostValue) {
		   putDecimal(beginPrclcstLatestCostValue,prclcstLatestCostValue,PRCLCST_LATEST_COST_VALUE_LEN,PRCLCST_LATEST_COST_VALUE_SCALE,true);
		 localPrclcstLatestCostValueCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkPrclcstLatestCostValueMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshPrclcstLatestCostValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshPrclcstLatestCostValue() throws CFException {	
   	try { 
		 return (getDecimal(beginPrclcstLatestCostValue,PRCLCST_LATEST_COST_VALUE_LEN,PRCLCST_LATEST_COST_VALUE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("prclcstLatestCostValue", beginPrclcstLatestCostValue,PRCLCST_LATEST_COST_VALUE_LEN);
     }
   	}
        int localPrclfcstFnceActualsUsdACounter = -1;
        public boolean isPrclfcstFnceActualsUsdAModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPrclfcstFnceActualsUsdACounter != sharedCounter;
           localPrclfcstFnceActualsUsdACounter = sharedCounter; return hasModified; 
        }
	    public boolean prclfcstFnceActualsUsdAIsNumeric() {
	      return decimalIsNumeric(beginPrclfcstFnceActualsUsdA,PRCLFCST_FNCE_ACTUALS_USD_A_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] prclfcstFnceActualsUsdAString() {
            return getPackedString(beginPrclfcstFnceActualsUsdA,PRCLFCST_FNCE_ACTUALS_USD_A_LEN);
         }
   protected static final int PRCLFCST_FNCE_ACTUALS_USD_A_LEN = 7;
   protected static final int PRCLFCST_FNCE_ACTUALS_USD_A_SCALE = 4;
  	/**
	 * 	serializePrclfcstFnceActualsUsdA
	 */
	protected void serializePrclfcstFnceActualsUsdA(BigDecimal prclfcstFnceActualsUsdA) {
		   putDecimal(beginPrclfcstFnceActualsUsdA,prclfcstFnceActualsUsdA,PRCLFCST_FNCE_ACTUALS_USD_A_LEN,PRCLFCST_FNCE_ACTUALS_USD_A_SCALE,true);
		 localPrclfcstFnceActualsUsdACounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkPrclfcstFnceActualsUsdAMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshPrclfcstFnceActualsUsdA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshPrclfcstFnceActualsUsdA() throws CFException {	
   	try { 
		 return (getDecimal(beginPrclfcstFnceActualsUsdA,PRCLFCST_FNCE_ACTUALS_USD_A_LEN,PRCLFCST_FNCE_ACTUALS_USD_A_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("prclfcstFnceActualsUsdA", beginPrclfcstFnceActualsUsdA,PRCLFCST_FNCE_ACTUALS_USD_A_LEN);
     }
   	}
     int localWvPrtQuantityCounter = -1;
     
     public boolean isWvPrtQuantityModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvPrtQuantityCounter != sharedCounter;
         localWvPrtQuantityCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of wvPrtQuantity
	 *	@return wvPrtQuantity
	 */
	public char[]  getWvPrtQuantityString() {
	    return getCharArray(beginWvPrtQuantity,WV_PRT_QUANTITY_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvPrtQuantityIsNumeric() {
		    return isNumeric(beginWvPrtQuantity
	                    ,beginWvPrtQuantity + WV_PRT_QUANTITY_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int WV_PRT_QUANTITY_LEN = 15;
  protected  static final int WV_PRT_QUANTITY_SCALE = 4;

   protected BigDecimal checkWvPrtQuantityMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeWvPrtQuantity
	 */
	protected void serializeWvPrtQuantity(BigDecimal wvPrtQuantity) {
	       putNumber(beginWvPrtQuantity,wvPrtQuantity,WV_PRT_QUANTITY_LEN,WV_PRT_QUANTITY_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWvPrtQuantityCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeWvPrtQuantity
	 */
   	protected  BigDecimal serializeWvPrtQuantity(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginWvPrtQuantity
		       ,15
		      );		 localWvPrtQuantityCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,WV_PRT_QUANTITY_LEN,WV_PRT_QUANTITY_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("wvPrtQuantity", beginWvPrtQuantity,WV_PRT_QUANTITY_LEN);
    	}
    }
    /**
	 *	refreshWvPrtQuantity is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvPrtQuantity() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginWvPrtQuantity
			            ,WV_PRT_QUANTITY_LEN
			            ,WV_PRT_QUANTITY_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("wvPrtQuantity", beginWvPrtQuantity,WV_PRT_QUANTITY_LEN);
    }
   	}
     int localWpCurrUnitDayNCounter = -1;
     public boolean isWpCurrUnitDayNModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWpCurrUnitDayNCounter != sharedCounter;
         localWpCurrUnitDayNCounter = sharedCounter; return hasModified;
     }
	protected static final int WP_CURR_UNIT_DAY_N_LEN = 12;
	/**
	 * 	serialize this WpCurrUnitDayN
	 */
   protected void serializeWpCurrUnitDayN(char[] wpCurrUnitDayN) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wpCurrUnitDayN,0,getStringValue(),beginWpCurrUnitDayN,WP_CURR_UNIT_DAY_N_LEN);
       localWpCurrUnitDayNCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWpCurrUnitDayNConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWpCurrUnitDayN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWpCurrUnitDayN() {	 
   		return (substring(getStringValue(),beginWpCurrUnitDayN,beginWpCurrUnitDayN + WP_CURR_UNIT_DAY_N_LEN));
   	}
     int localWpUsdValueCounter = -1;
     public boolean isWpUsdValueModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWpUsdValueCounter != sharedCounter;
         localWpUsdValueCounter = sharedCounter; return hasModified;
     }
	protected static final int WP_USD_VALUE_LEN = 12;
	/**
	 * 	serialize this WpUsdValue
	 */
   protected void serializeWpUsdValue(char[] wpUsdValue) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wpUsdValue,0,getStringValue(),beginWpUsdValue,WP_USD_VALUE_LEN);
       localWpUsdValueCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWpUsdValueConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWpUsdValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWpUsdValue() {	 
   		return (substring(getStringValue(),beginWpUsdValue,beginWpUsdValue + WP_USD_VALUE_LEN));
   	}
     int localWvNumericOutputCounter = -1;
     
     public boolean isWvNumericOutputModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvNumericOutputCounter != sharedCounter;
         localWvNumericOutputCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of wvNumericOutput
	 *	@return wvNumericOutput
	 */
	public char[]  getWvNumericOutputString() {
	    return getCharArray(beginWvNumericOutput,WV_NUMERIC_OUTPUT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvNumericOutputIsNumeric() {
		    return isNumeric(beginWvNumericOutput
	                    ,beginWvNumericOutput + WV_NUMERIC_OUTPUT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int WV_NUMERIC_OUTPUT_LEN = 17;
  protected  static final int WV_NUMERIC_OUTPUT_SCALE = 7;

   protected BigDecimal checkWvNumericOutputMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,17/*precision*/);
   }

  	/**
	 * serializeWvNumericOutput
	 */
	protected void serializeWvNumericOutput(BigDecimal wvNumericOutput) {
	       putNumber(beginWvNumericOutput,wvNumericOutput,WV_NUMERIC_OUTPUT_LEN,WV_NUMERIC_OUTPUT_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWvNumericOutputCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeWvNumericOutput
	 */
   	protected  BigDecimal serializeWvNumericOutput(char[] value) throws CFException {
        if (value.length < 17) value = pad(17, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(17,value,true/*isSigned?*/)
		       ,beginWvNumericOutput
		       ,17
		      );		 localWvNumericOutputCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,WV_NUMERIC_OUTPUT_LEN,WV_NUMERIC_OUTPUT_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("wvNumericOutput", beginWvNumericOutput,WV_NUMERIC_OUTPUT_LEN);
    	}
    }
    /**
	 *	refreshWvNumericOutput is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvNumericOutput() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginWvNumericOutput
			            ,WV_NUMERIC_OUTPUT_LEN
			            ,WV_NUMERIC_OUTPUT_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("wvNumericOutput", beginWvNumericOutput,WV_NUMERIC_OUTPUT_LEN);
    }
   	}
     int localWvMaxIntDigitsCounter = -1;
     public boolean isWvMaxIntDigitsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvMaxIntDigitsCounter != sharedCounter;
         localWvMaxIntDigitsCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wvMaxIntDigits
	 *	@return wvMaxIntDigits
	 */
	public char[]  getWvMaxIntDigitsString() {
	     return getCharArray(beginWvMaxIntDigits,WV_MAX_INT_DIGITS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvMaxIntDigitsIsNumeric() {
	    return isNumeric(beginWvMaxIntDigits
	                    ,beginWvMaxIntDigits + WV_MAX_INT_DIGITS_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WV_MAX_INT_DIGITS_LEN = 3;
  	/**
	 * serializeWvMaxIntDigits
	 */
	protected void serializeWvMaxIntDigits(short wvMaxIntDigits) {
		 putNumber(beginWvMaxIntDigits,wvMaxIntDigits,WV_MAX_INT_DIGITS_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWvMaxIntDigitsCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWvMaxIntDigits
	 */
   	protected  short serializeWvMaxIntDigits(char[] value) {
	    short  wvMaxIntDigits;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wvMaxIntDigits = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,true/*isSigned?*/)
		       ,beginWvMaxIntDigits
		       ,3
		      );
		 localWvMaxIntDigitsCounter = shareString.getSerializedField().getModifiedCounter();
		return  wvMaxIntDigits;
    }

   protected short checkWvMaxIntDigitsMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_1000/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshWvMaxIntDigits is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshWvMaxIntDigits() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginWvMaxIntDigits
			                 ,WV_MAX_INT_DIGITS_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wvMaxIntDigits", beginWvMaxIntDigits,WV_MAX_INT_DIGITS_LEN);
    }
   	}
     int localWvMaxDecDigitsCounter = -1;
     public boolean isWvMaxDecDigitsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvMaxDecDigitsCounter != sharedCounter;
         localWvMaxDecDigitsCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wvMaxDecDigits
	 *	@return wvMaxDecDigits
	 */
	public char[]  getWvMaxDecDigitsString() {
	     return getCharArray(beginWvMaxDecDigits,WV_MAX_DEC_DIGITS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvMaxDecDigitsIsNumeric() {
	    return isNumeric(beginWvMaxDecDigits
	                    ,beginWvMaxDecDigits + WV_MAX_DEC_DIGITS_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WV_MAX_DEC_DIGITS_LEN = 3;
  	/**
	 * serializeWvMaxDecDigits
	 */
	protected void serializeWvMaxDecDigits(short wvMaxDecDigits) {
		 putNumber(beginWvMaxDecDigits,wvMaxDecDigits,WV_MAX_DEC_DIGITS_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWvMaxDecDigitsCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWvMaxDecDigits
	 */
   	protected  short serializeWvMaxDecDigits(char[] value) {
	    short  wvMaxDecDigits;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wvMaxDecDigits = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,true/*isSigned?*/)
		       ,beginWvMaxDecDigits
		       ,3
		      );
		 localWvMaxDecDigitsCounter = shareString.getSerializedField().getModifiedCounter();
		return  wvMaxDecDigits;
    }

   protected short checkWvMaxDecDigitsMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_1000/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshWvMaxDecDigits is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshWvMaxDecDigits() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginWvMaxDecDigits
			                 ,WV_MAX_DEC_DIGITS_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wvMaxDecDigits", beginWvMaxDecDigits,WV_MAX_DEC_DIGITS_LEN);
    }
   	}
     int localWvIntCtrCounter = -1;
     public boolean isWvIntCtrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvIntCtrCounter != sharedCounter;
         localWvIntCtrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wvIntCtr
	 *	@return wvIntCtr
	 */
	public char[]  getWvIntCtrString() {
	     return getCharArray(beginWvIntCtr,WV_INT_CTR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvIntCtrIsNumeric() {
	    return isNumeric(beginWvIntCtr
	                    ,beginWvIntCtr + WV_INT_CTR_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WV_INT_CTR_LEN = 3;
  	/**
	 * serializeWvIntCtr
	 */
	protected void serializeWvIntCtr(short wvIntCtr) {
		 putNumber(beginWvIntCtr,wvIntCtr,WV_INT_CTR_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWvIntCtrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWvIntCtr
	 */
   	protected  short serializeWvIntCtr(char[] value) {
	    short  wvIntCtr;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wvIntCtr = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,true/*isSigned?*/)
		       ,beginWvIntCtr
		       ,3
		      );
		 localWvIntCtrCounter = shareString.getSerializedField().getModifiedCounter();
		return  wvIntCtr;
    }

   protected short checkWvIntCtrMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_1000/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshWvIntCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshWvIntCtr() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginWvIntCtr
			                 ,WV_INT_CTR_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wvIntCtr", beginWvIntCtr,WV_INT_CTR_LEN);
    }
   	}
     int localWvDecCtrCounter = -1;
     public boolean isWvDecCtrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvDecCtrCounter != sharedCounter;
         localWvDecCtrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wvDecCtr
	 *	@return wvDecCtr
	 */
	public char[]  getWvDecCtrString() {
	     return getCharArray(beginWvDecCtr,WV_DEC_CTR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvDecCtrIsNumeric() {
	    return isNumeric(beginWvDecCtr
	                    ,beginWvDecCtr + WV_DEC_CTR_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WV_DEC_CTR_LEN = 3;
  	/**
	 * serializeWvDecCtr
	 */
	protected void serializeWvDecCtr(short wvDecCtr) {
		 putNumber(beginWvDecCtr,wvDecCtr,WV_DEC_CTR_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWvDecCtrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWvDecCtr
	 */
   	protected  short serializeWvDecCtr(char[] value) {
	    short  wvDecCtr;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wvDecCtr = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,true/*isSigned?*/)
		       ,beginWvDecCtr
		       ,3
		      );
		 localWvDecCtrCounter = shareString.getSerializedField().getModifiedCounter();
		return  wvDecCtr;
    }

   protected short checkWvDecCtrMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_1000/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshWvDecCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshWvDecCtr() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginWvDecCtr
			                 ,WV_DEC_CTR_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wvDecCtr", beginWvDecCtr,WV_DEC_CTR_LEN);
    }
   	}
     int localWvSignCtrCounter = -1;
     public boolean isWvSignCtrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvSignCtrCounter != sharedCounter;
         localWvSignCtrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wvSignCtr
	 *	@return wvSignCtr
	 */
	public char[]  getWvSignCtrString() {
	     return getCharArray(beginWvSignCtr,WV_SIGN_CTR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvSignCtrIsNumeric() {
	    return isNumeric(beginWvSignCtr
	                    ,beginWvSignCtr + WV_SIGN_CTR_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WV_SIGN_CTR_LEN = 3;
  	/**
	 * serializeWvSignCtr
	 */
	protected void serializeWvSignCtr(short wvSignCtr) {
		 putNumber(beginWvSignCtr,wvSignCtr,WV_SIGN_CTR_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWvSignCtrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWvSignCtr
	 */
   	protected  short serializeWvSignCtr(char[] value) {
	    short  wvSignCtr;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wvSignCtr = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,true/*isSigned?*/)
		       ,beginWvSignCtr
		       ,3
		      );
		 localWvSignCtrCounter = shareString.getSerializedField().getModifiedCounter();
		return  wvSignCtr;
    }

   protected short checkWvSignCtrMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_1000/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshWvSignCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshWvSignCtr() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginWvSignCtr
			                 ,WV_SIGN_CTR_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wvSignCtr", beginWvSignCtr,WV_SIGN_CTR_LEN);
    }
   	}
     int localWvCommaCtrCounter = -1;
     public boolean isWvCommaCtrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvCommaCtrCounter != sharedCounter;
         localWvCommaCtrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wvCommaCtr
	 *	@return wvCommaCtr
	 */
	public char[]  getWvCommaCtrString() {
	     return getCharArray(beginWvCommaCtr,WV_COMMA_CTR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvCommaCtrIsNumeric() {
	    return isNumeric(beginWvCommaCtr
	                    ,beginWvCommaCtr + WV_COMMA_CTR_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WV_COMMA_CTR_LEN = 3;
  	/**
	 * serializeWvCommaCtr
	 */
	protected void serializeWvCommaCtr(short wvCommaCtr) {
		 putNumber(beginWvCommaCtr,wvCommaCtr,WV_COMMA_CTR_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWvCommaCtrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWvCommaCtr
	 */
   	protected  short serializeWvCommaCtr(char[] value) {
	    short  wvCommaCtr;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wvCommaCtr = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,true/*isSigned?*/)
		       ,beginWvCommaCtr
		       ,3
		      );
		 localWvCommaCtrCounter = shareString.getSerializedField().getModifiedCounter();
		return  wvCommaCtr;
    }

   protected short checkWvCommaCtrMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_1000/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshWvCommaCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshWvCommaCtr() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginWvCommaCtr
			                 ,WV_COMMA_CTR_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wvCommaCtr", beginWvCommaCtr,WV_COMMA_CTR_LEN);
    }
   	}
     int localWvFldsFilledCounter = -1;
     public boolean isWvFldsFilledModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvFldsFilledCounter != sharedCounter;
         localWvFldsFilledCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wvFldsFilled
	 *	@return wvFldsFilled
	 */
	public char[]  getWvFldsFilledString() {
	     return getCharArray(beginWvFldsFilled,WV_FLDS_FILLED_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvFldsFilledIsNumeric() {
	    return isNumeric(beginWvFldsFilled
	                    ,beginWvFldsFilled + WV_FLDS_FILLED_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WV_FLDS_FILLED_LEN = 3;
  	/**
	 * serializeWvFldsFilled
	 */
	protected void serializeWvFldsFilled(short wvFldsFilled) {
		 putNumber(beginWvFldsFilled,wvFldsFilled,WV_FLDS_FILLED_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWvFldsFilledCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWvFldsFilled
	 */
   	protected  short serializeWvFldsFilled(char[] value) {
	    short  wvFldsFilled;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wvFldsFilled = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,true/*isSigned?*/)
		       ,beginWvFldsFilled
		       ,3
		      );
		 localWvFldsFilledCounter = shareString.getSerializedField().getModifiedCounter();
		return  wvFldsFilled;
    }

   protected short checkWvFldsFilledMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_1000/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshWvFldsFilled is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshWvFldsFilled() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginWvFldsFilled
			                 ,WV_FLDS_FILLED_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wvFldsFilled", beginWvFldsFilled,WV_FLDS_FILLED_LEN);
    }
   	}
     int localWvStartPosnCounter = -1;
     public boolean isWvStartPosnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvStartPosnCounter != sharedCounter;
         localWvStartPosnCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wvStartPosn
	 *	@return wvStartPosn
	 */
	public char[]  getWvStartPosnString() {
	     return getCharArray(beginWvStartPosn,WV_START_POSN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvStartPosnIsNumeric() {
	    return isNumeric(beginWvStartPosn
	                    ,beginWvStartPosn + WV_START_POSN_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WV_START_POSN_LEN = 3;
  	/**
	 * serializeWvStartPosn
	 */
	protected void serializeWvStartPosn(short wvStartPosn) {
		 putNumber(beginWvStartPosn,wvStartPosn,WV_START_POSN_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWvStartPosnCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWvStartPosn
	 */
   	protected  short serializeWvStartPosn(char[] value) {
	    short  wvStartPosn;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wvStartPosn = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,true/*isSigned?*/)
		       ,beginWvStartPosn
		       ,3
		      );
		 localWvStartPosnCounter = shareString.getSerializedField().getModifiedCounter();
		return  wvStartPosn;
    }

   protected short checkWvStartPosnMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_1000/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshWvStartPosn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshWvStartPosn() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginWvStartPosn
			                 ,WV_START_POSN_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wvStartPosn", beginWvStartPosn,WV_START_POSN_LEN);
    }
   	}
     int localWvCommaNdxCounter = -1;
     public boolean isWvCommaNdxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvCommaNdxCounter != sharedCounter;
         localWvCommaNdxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wvCommaNdx
	 *	@return wvCommaNdx
	 */
	public char[]  getWvCommaNdxString() {
	     return getCharArray(beginWvCommaNdx,WV_COMMA_NDX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvCommaNdxIsNumeric() {
	    return isNumeric(beginWvCommaNdx
	                    ,beginWvCommaNdx + WV_COMMA_NDX_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WV_COMMA_NDX_LEN = 3;
  	/**
	 * serializeWvCommaNdx
	 */
	protected void serializeWvCommaNdx(short wvCommaNdx) {
		 putNumber(beginWvCommaNdx,wvCommaNdx,WV_COMMA_NDX_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWvCommaNdxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWvCommaNdx
	 */
   	protected  short serializeWvCommaNdx(char[] value) {
	    short  wvCommaNdx;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wvCommaNdx = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,true/*isSigned?*/)
		       ,beginWvCommaNdx
		       ,3
		      );
		 localWvCommaNdxCounter = shareString.getSerializedField().getModifiedCounter();
		return  wvCommaNdx;
    }

   protected short checkWvCommaNdxMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_1000/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshWvCommaNdx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshWvCommaNdx() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginWvCommaNdx
			                 ,WV_COMMA_NDX_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wvCommaNdx", beginWvCommaNdx,WV_COMMA_NDX_LEN);
    }
   	}
     int localWvToNdxCounter = -1;
     public boolean isWvToNdxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvToNdxCounter != sharedCounter;
         localWvToNdxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wvToNdx
	 *	@return wvToNdx
	 */
	public char[]  getWvToNdxString() {
	     return getCharArray(beginWvToNdx,WV_TO_NDX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvToNdxIsNumeric() {
	    return isNumeric(beginWvToNdx
	                    ,beginWvToNdx + WV_TO_NDX_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WV_TO_NDX_LEN = 3;
  	/**
	 * serializeWvToNdx
	 */
	protected void serializeWvToNdx(short wvToNdx) {
		 putNumber(beginWvToNdx,wvToNdx,WV_TO_NDX_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWvToNdxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWvToNdx
	 */
   	protected  short serializeWvToNdx(char[] value) {
	    short  wvToNdx;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wvToNdx = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,true/*isSigned?*/)
		       ,beginWvToNdx
		       ,3
		      );
		 localWvToNdxCounter = shareString.getSerializedField().getModifiedCounter();
		return  wvToNdx;
    }

   protected short checkWvToNdxMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_1000/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshWvToNdx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshWvToNdx() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginWvToNdx
			                 ,WV_TO_NDX_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wvToNdx", beginWvToNdx,WV_TO_NDX_LEN);
    }
   	}
     int localWvFromNdxCounter = -1;
     public boolean isWvFromNdxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvFromNdxCounter != sharedCounter;
         localWvFromNdxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wvFromNdx
	 *	@return wvFromNdx
	 */
	public char[]  getWvFromNdxString() {
	     return getCharArray(beginWvFromNdx,WV_FROM_NDX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvFromNdxIsNumeric() {
	    return isNumeric(beginWvFromNdx
	                    ,beginWvFromNdx + WV_FROM_NDX_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WV_FROM_NDX_LEN = 3;
  	/**
	 * serializeWvFromNdx
	 */
	protected void serializeWvFromNdx(short wvFromNdx) {
		 putNumber(beginWvFromNdx,wvFromNdx,WV_FROM_NDX_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWvFromNdxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWvFromNdx
	 */
   	protected  short serializeWvFromNdx(char[] value) {
	    short  wvFromNdx;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wvFromNdx = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,true/*isSigned?*/)
		       ,beginWvFromNdx
		       ,3
		      );
		 localWvFromNdxCounter = shareString.getSerializedField().getModifiedCounter();
		return  wvFromNdx;
    }

   protected short checkWvFromNdxMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_1000/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshWvFromNdx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshWvFromNdx() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginWvFromNdx
			                 ,WV_FROM_NDX_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wvFromNdx", beginWvFromNdx,WV_FROM_NDX_LEN);
    }
   	}
     int localWvDltr1Counter = -1;
     public boolean isWvDltr1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvDltr1Counter != sharedCounter;
         localWvDltr1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWvDltr1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localFillerCounter = -1;
     public boolean isFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerCounter != sharedCounter;
         localFillerCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localFiller01Counter = -1;
     public boolean isFiller01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller01Counter != sharedCounter;
         localFiller01Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFiller01Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localFiller02Counter = -1;
     public boolean isFiller02Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller02Counter != sharedCounter;
         localFiller02Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFiller02Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localFiller03Counter = -1;
     public boolean isFiller03Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller03Counter != sharedCounter;
         localFiller03Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFiller03Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
         int localWvExposureCountCounter = -1;
         public boolean isWvExposureCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWvExposureCountCounter != sharedCounter;
            localWvExposureCountCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkWvExposureCountMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localWvSeqNumCounter = -1;
         public boolean isWvSeqNumModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWvSeqNumCounter != sharedCounter;
            localWvSeqNumCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkWvSeqNumMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localWvKbblVolCounter = -1;
     public boolean isWvKbblVolModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvKbblVolCounter != sharedCounter;
         localWvKbblVolCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_KBBL_VOL_LEN = 14;
	/**
	 * 	serialize this WvKbblVol
	 */
   protected void serializeWvKbblVol(char[] wvKbblVol) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvKbblVol,0,getStringValue(),beginWvKbblVol,WV_KBBL_VOL_LEN);
       localWvKbblVolCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvKbblVolConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshWvKbblVol is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvKbblVol() {	 
   		return (substring(getStringValue(),beginWvKbblVol,beginWvKbblVol + WV_KBBL_VOL_LEN));
   	}
        int localPrclexpKbblVolCounter = -1;
        public boolean isPrclexpKbblVolModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPrclexpKbblVolCounter != sharedCounter;
           localPrclexpKbblVolCounter = sharedCounter; return hasModified; 
        }
	    public boolean prclexpKbblVolIsNumeric() {
	      return decimalIsNumeric(beginPrclexpKbblVol,PRCLEXP_KBBL_VOL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] prclexpKbblVolString() {
            return getPackedString(beginPrclexpKbblVol,PRCLEXP_KBBL_VOL_LEN);
         }
   protected static final int PRCLEXP_KBBL_VOL_LEN = 7;
   protected static final int PRCLEXP_KBBL_VOL_SCALE = 4;
  	/**
	 * 	serializePrclexpKbblVol
	 */
	protected void serializePrclexpKbblVol(BigDecimal prclexpKbblVol) {
		   putDecimal(beginPrclexpKbblVol,prclexpKbblVol,PRCLEXP_KBBL_VOL_LEN,PRCLEXP_KBBL_VOL_SCALE,true);
		 localPrclexpKbblVolCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkPrclexpKbblVolMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshPrclexpKbblVol is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshPrclexpKbblVol() throws CFException {	
   	try { 
		 return (getDecimal(beginPrclexpKbblVol,PRCLEXP_KBBL_VOL_LEN,PRCLEXP_KBBL_VOL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("prclexpKbblVol", beginPrclexpKbblVol,PRCLEXP_KBBL_VOL_LEN);
     }
   	}
     int localWxUserQuantityCounter = -1;
     public boolean isWxUserQuantityModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxUserQuantityCounter != sharedCounter;
         localWxUserQuantityCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_USER_QUANTITY_LEN = 19;
	/**
	 * 	serialize this WxUserQuantity
	 */
   protected void serializeWxUserQuantity(char[] wxUserQuantity) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxUserQuantity,0,getStringValue(),beginWxUserQuantity,WX_USER_QUANTITY_LEN);
       localWxUserQuantityCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxUserQuantityConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshWxUserQuantity is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxUserQuantity() {	 
   		return (substring(getStringValue(),beginWxUserQuantity,beginWxUserQuantity + WX_USER_QUANTITY_LEN));
   	}
     int localWpFmseLmtKtNCounter = -1;
     public boolean isWpFmseLmtKtNModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWpFmseLmtKtNCounter != sharedCounter;
         localWpFmseLmtKtNCounter = sharedCounter; return hasModified;
     }
	protected static final int WP_FMSE_LMT_KT_N_LEN = 10;
	/**
	 * 	serialize this WpFmseLmtKtN
	 */
   protected void serializeWpFmseLmtKtN(char[] wpFmseLmtKtN) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wpFmseLmtKtN,0,getStringValue(),beginWpFmseLmtKtN,WP_FMSE_LMT_KT_N_LEN);
       localWpFmseLmtKtNCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWpFmseLmtKtNConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWpFmseLmtKtN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWpFmseLmtKtN() {	 
   		return (substring(getStringValue(),beginWpFmseLmtKtN,beginWpFmseLmtKtN + WP_FMSE_LMT_KT_N_LEN));
   	}
        int localTrdgauthQuantityAuthACounter = -1;
        public boolean isTrdgauthQuantityAuthAModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTrdgauthQuantityAuthACounter != sharedCounter;
           localTrdgauthQuantityAuthACounter = sharedCounter; return hasModified; 
        }
	    public boolean trdgauthQuantityAuthAIsNumeric() {
	      return decimalIsNumeric(beginTrdgauthQuantityAuthA,TRDGAUTH_QUANTITY_AUTH_A_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] trdgauthQuantityAuthAString() {
            return getPackedString(beginTrdgauthQuantityAuthA,TRDGAUTH_QUANTITY_AUTH_A_LEN);
         }
   protected static final int TRDGAUTH_QUANTITY_AUTH_A_LEN = 7;
   protected static final int TRDGAUTH_QUANTITY_AUTH_A_SCALE = 4;
  	/**
	 * 	serializeTrdgauthQuantityAuthA
	 */
	protected void serializeTrdgauthQuantityAuthA(BigDecimal trdgauthQuantityAuthA) {
		   putDecimal(beginTrdgauthQuantityAuthA,trdgauthQuantityAuthA,TRDGAUTH_QUANTITY_AUTH_A_LEN,TRDGAUTH_QUANTITY_AUTH_A_SCALE,true);
		 localTrdgauthQuantityAuthACounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTrdgauthQuantityAuthAMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshTrdgauthQuantityAuthA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTrdgauthQuantityAuthA() throws CFException {	
   	try { 
		 return (getDecimal(beginTrdgauthQuantityAuthA,TRDGAUTH_QUANTITY_AUTH_A_LEN,TRDGAUTH_QUANTITY_AUTH_A_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("trdgauthQuantityAuthA", beginTrdgauthQuantityAuthA,TRDGAUTH_QUANTITY_AUTH_A_LEN);
     }
   	}
     int localWvBtfFactorCounter = -1;
     
     public boolean isWvBtfFactorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvBtfFactorCounter != sharedCounter;
         localWvBtfFactorCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of wvBtfFactor
	 *	@return wvBtfFactor
	 */
	public char[]  getWvBtfFactorString() {
	    return getCharArray(beginWvBtfFactor,WV_BTF_FACTOR_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvBtfFactorIsNumeric() {
		    return isNumeric(beginWvBtfFactor
	                    ,beginWvBtfFactor + WV_BTF_FACTOR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int WV_BTF_FACTOR_LEN = 7;
  protected  static final int WV_BTF_FACTOR_SCALE = 4;

   protected BigDecimal checkWvBtfFactorMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,7/*precision*/);
   }

  	/**
	 * serializeWvBtfFactor
	 */
	protected void serializeWvBtfFactor(BigDecimal wvBtfFactor) {
	       putNumber(beginWvBtfFactor,wvBtfFactor,WV_BTF_FACTOR_LEN,WV_BTF_FACTOR_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWvBtfFactorCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeWvBtfFactor
	 */
   	protected  BigDecimal serializeWvBtfFactor(char[] value) throws CFException {
        if (value.length < 7) value = pad(7, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginWvBtfFactor
		       ,7
		      );		 localWvBtfFactorCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,WV_BTF_FACTOR_LEN,WV_BTF_FACTOR_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("wvBtfFactor", beginWvBtfFactor,WV_BTF_FACTOR_LEN);
    	}
    }
    /**
	 *	refreshWvBtfFactor is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvBtfFactor() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginWvBtfFactor
			            ,WV_BTF_FACTOR_LEN
			            ,WV_BTF_FACTOR_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("wvBtfFactor", beginWvBtfFactor,WV_BTF_FACTOR_LEN);
    }
   	}
        int localWvDBblVolCounter = -1;
        public boolean isWvDBblVolModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvDBblVolCounter != sharedCounter;
           localWvDBblVolCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvDBblVolIsNumeric() {
	      return decimalIsNumeric(beginWvDBblVol,WV_DBBL_VOL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wvDBblVolString() {
            return getPackedString(beginWvDBblVol,WV_DBBL_VOL_LEN);
         }
   protected static final int WV_DBBL_VOL_LEN = 10;
   protected static final int WV_DBBL_VOL_SCALE = 4;
  	/**
	 * 	serializeWvDBblVol
	 */
	protected void serializeWvDBblVol(BigDecimal wvDBblVol) {
		   putDecimal(beginWvDBblVol,wvDBblVol,WV_DBBL_VOL_LEN,WV_DBBL_VOL_SCALE,true);
		 localWvDBblVolCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWvDBblVolMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,18/*precision*/);
   }
     /**
	 *	refreshWvDBblVol is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvDBblVol() throws CFException {	
   	try { 
		 return (getDecimal(beginWvDBblVol,WV_DBBL_VOL_LEN,WV_DBBL_VOL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvDBblVol", beginWvDBblVol,WV_DBBL_VOL_LEN);
     }
   	}
        int localWvDBarrelsCounter = -1;
        public boolean isWvDBarrelsModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvDBarrelsCounter != sharedCounter;
           localWvDBarrelsCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvDBarrelsIsNumeric() {
	      return decimalIsNumeric(beginWvDBarrels,WV_DBARRELS_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wvDBarrelsString() {
            return getPackedString(beginWvDBarrels,WV_DBARRELS_LEN);
         }
   protected static final int WV_DBARRELS_LEN = 10;
   protected static final int WV_DBARRELS_SCALE = 4;
  	/**
	 * 	serializeWvDBarrels
	 */
	protected void serializeWvDBarrels(BigDecimal wvDBarrels) {
		   putDecimal(beginWvDBarrels,wvDBarrels,WV_DBARRELS_LEN,WV_DBARRELS_SCALE,true);
		 localWvDBarrelsCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWvDBarrelsMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,18/*precision*/);
   }
     /**
	 *	refreshWvDBarrels is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvDBarrels() throws CFException {	
   	try { 
		 return (getDecimal(beginWvDBarrels,WV_DBARRELS_LEN,WV_DBARRELS_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvDBarrels", beginWvDBarrels,WV_DBARRELS_LEN);
     }
   	}
     int localWpDBarrelsCounter = -1;
     public boolean isWpDBarrelsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWpDBarrelsCounter != sharedCounter;
         localWpDBarrelsCounter = sharedCounter; return hasModified;
     }
	protected static final int WP_DBARRELS_LEN = 20;
	/**
	 * 	serialize this WpDBarrels
	 */
   protected void serializeWpDBarrels(char[] wpDBarrels) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wpDBarrels,0,getStringValue(),beginWpDBarrels,WP_DBARRELS_LEN);
       localWpDBarrelsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWpDBarrelsConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWpDBarrels is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWpDBarrels() {	 
   		return (substring(getStringValue(),beginWpDBarrels,beginWpDBarrels + WP_DBARRELS_LEN));
   	}
        int localWvDMtAmtCounter = -1;
        public boolean isWvDMtAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvDMtAmtCounter != sharedCounter;
           localWvDMtAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvDMtAmtIsNumeric() {
	      return decimalIsNumeric(beginWvDMtAmt,WV_DMT_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wvDMtAmtString() {
            return getPackedString(beginWvDMtAmt,WV_DMT_AMT_LEN);
         }
   protected static final int WV_DMT_AMT_LEN = 9;
   protected static final int WV_DMT_AMT_SCALE = 4;
  	/**
	 * 	serializeWvDMtAmt
	 */
	protected void serializeWvDMtAmt(BigDecimal wvDMtAmt) {
		   putDecimal(beginWvDMtAmt,wvDMtAmt,WV_DMT_AMT_LEN,WV_DMT_AMT_SCALE,true);
		 localWvDMtAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWvDMtAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,16/*precision*/);
   }
     /**
	 *	refreshWvDMtAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvDMtAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginWvDMtAmt,WV_DMT_AMT_LEN,WV_DMT_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvDMtAmt", beginWvDMtAmt,WV_DMT_AMT_LEN);
     }
   	}
        int localWvEffWeightPcCounter = -1;
        public boolean isWvEffWeightPcModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvEffWeightPcCounter != sharedCounter;
           localWvEffWeightPcCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvEffWeightPcIsNumeric() {
	      return decimalIsNumeric(beginWvEffWeightPc,WV_EFF_WEIGHT_PC_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wvEffWeightPcString() {
            return getPackedString(beginWvEffWeightPc,WV_EFF_WEIGHT_PC_LEN);
         }
   protected static final int WV_EFF_WEIGHT_PC_LEN = 5;
   protected static final int WV_EFF_WEIGHT_PC_SCALE = 6;
  	/**
	 * 	serializeWvEffWeightPc
	 */
	protected void serializeWvEffWeightPc(BigDecimal wvEffWeightPc) {
		   putDecimal(beginWvEffWeightPc,wvEffWeightPc,WV_EFF_WEIGHT_PC_LEN,WV_EFF_WEIGHT_PC_SCALE,true);
		 localWvEffWeightPcCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWvEffWeightPcMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,6/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshWvEffWeightPc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvEffWeightPc() throws CFException {	
   	try { 
		 return (getDecimal(beginWvEffWeightPc,WV_EFF_WEIGHT_PC_LEN,WV_EFF_WEIGHT_PC_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvEffWeightPc", beginWvEffWeightPc,WV_EFF_WEIGHT_PC_LEN);
     }
   	}
        int localDealgpalAllocWgtnNumCounter = -1;
        public boolean isDealgpalAllocWgtnNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDealgpalAllocWgtnNumCounter != sharedCounter;
           localDealgpalAllocWgtnNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean dealgpalAllocWgtnNumIsNumeric() {
	      return decimalIsNumeric(beginDealgpalAllocWgtnNum,DEALGPAL_ALLOC_WGTN_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] dealgpalAllocWgtnNumString() {
            return getPackedString(beginDealgpalAllocWgtnNum,DEALGPAL_ALLOC_WGTN_NUM_LEN);
         }
   protected static final int DEALGPAL_ALLOC_WGTN_NUM_LEN = 5;
   protected static final int DEALGPAL_ALLOC_WGTN_NUM_SCALE = 4;
  	/**
	 * 	serializeDealgpalAllocWgtnNum
	 */
	protected void serializeDealgpalAllocWgtnNum(BigDecimal dealgpalAllocWgtnNum) {
		   putDecimal(beginDealgpalAllocWgtnNum,dealgpalAllocWgtnNum,DEALGPAL_ALLOC_WGTN_NUM_LEN,DEALGPAL_ALLOC_WGTN_NUM_SCALE,true);
		 localDealgpalAllocWgtnNumCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkDealgpalAllocWgtnNumMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshDealgpalAllocWgtnNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDealgpalAllocWgtnNum() throws CFException {	
   	try { 
		 return (getDecimal(beginDealgpalAllocWgtnNum,DEALGPAL_ALLOC_WGTN_NUM_LEN,DEALGPAL_ALLOC_WGTN_NUM_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("dealgpalAllocWgtnNum", beginDealgpalAllocWgtnNum,DEALGPAL_ALLOC_WGTN_NUM_LEN);
     }
   	}
        int localParcelBblVolCounter = -1;
        public boolean isParcelBblVolModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localParcelBblVolCounter != sharedCounter;
           localParcelBblVolCounter = sharedCounter; return hasModified; 
        }
	    public boolean parcelBblVolIsNumeric() {
	      return decimalIsNumeric(beginParcelBblVol,PARCEL_BBL_VOL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] parcelBblVolString() {
            return getPackedString(beginParcelBblVol,PARCEL_BBL_VOL_LEN);
         }
   protected static final int PARCEL_BBL_VOL_LEN = 7;
   protected static final int PARCEL_BBL_VOL_SCALE = 4;
  	/**
	 * 	serializeParcelBblVol
	 */
	protected void serializeParcelBblVol(BigDecimal parcelBblVol) {
		   putDecimal(beginParcelBblVol,parcelBblVol,PARCEL_BBL_VOL_LEN,PARCEL_BBL_VOL_SCALE,true);
		 localParcelBblVolCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkParcelBblVolMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshParcelBblVol is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshParcelBblVol() throws CFException {	
   	try { 
		 return (getDecimal(beginParcelBblVol,PARCEL_BBL_VOL_LEN,PARCEL_BBL_VOL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("parcelBblVol", beginParcelBblVol,PARCEL_BBL_VOL_LEN);
     }
   	}
        int localWvDQtyCounter = -1;
        public boolean isWvDQtyModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvDQtyCounter != sharedCounter;
           localWvDQtyCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvDQtyIsNumeric() {
	      return decimalIsNumeric(beginWvDQty,WV_DQTY_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wvDQtyString() {
            return getPackedString(beginWvDQty,WV_DQTY_LEN);
         }
   protected static final int WV_DQTY_LEN = 9;
   protected static final int WV_DQTY_SCALE = 4;
  	/**
	 * 	serializeWvDQty
	 */
	protected void serializeWvDQty(BigDecimal wvDQty) {
		   putDecimal(beginWvDQty,wvDQty,WV_DQTY_LEN,WV_DQTY_SCALE,true);
		 localWvDQtyCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWvDQtyMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWvDQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvDQty() throws CFException {	
   	try { 
		 return (getDecimal(beginWvDQty,WV_DQTY_LEN,WV_DQTY_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvDQty", beginWvDQty,WV_DQTY_LEN);
     }
   	}
     int localWpDQtyCounter = -1;
     public boolean isWpDQtyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWpDQtyCounter != sharedCounter;
         localWpDQtyCounter = sharedCounter; return hasModified;
     }
	protected static final int WP_DQTY_LEN = 19;
	/**
	 * 	serialize this WpDQty
	 */
   protected void serializeWpDQty(char[] wpDQty) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wpDQty,0,getStringValue(),beginWpDQty,WP_DQTY_LEN);
       localWpDQtyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWpDQtyConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshWpDQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWpDQty() {	 
   		return (substring(getStringValue(),beginWpDQty,beginWpDQty + WP_DQTY_LEN));
   	}
        int localWvMmbConvCounter = -1;
        public boolean isWvMmbConvModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvMmbConvCounter != sharedCounter;
           localWvMmbConvCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvMmbConvIsNumeric() {
	      return decimalIsNumeric(beginWvMmbConv,WV_MMB_CONV_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wvMmbConvString() {
            return getPackedString(beginWvMmbConv,WV_MMB_CONV_LEN);
         }
   protected static final int WV_MMB_CONV_LEN = 3;
   protected static final int WV_MMB_CONV_SCALE = 1;
  	/**
	 * 	serializeWvMmbConv
	 */
	protected void serializeWvMmbConv(BigDecimal wvMmbConv) {
		   putDecimal(beginWvMmbConv,wvMmbConv,WV_MMB_CONV_LEN,WV_MMB_CONV_SCALE,true);
		 localWvMmbConvCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWvMmbConvMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,1/*scale*/,4/*precision*/);
   }
     /**
	 *	refreshWvMmbConv is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvMmbConv() throws CFException {	
   	try { 
		 return (getDecimal(beginWvMmbConv,WV_MMB_CONV_LEN,WV_MMB_CONV_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvMmbConv", beginWvMmbConv,WV_MMB_CONV_LEN);
     }
   	}
        int localWvDTonnesCounter = -1;
        public boolean isWvDTonnesModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvDTonnesCounter != sharedCounter;
           localWvDTonnesCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvDTonnesIsNumeric() {
	      return decimalIsNumeric(beginWvDTonnes,WV_DTONNES_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wvDTonnesString() {
            return getPackedString(beginWvDTonnes,WV_DTONNES_LEN);
         }
   protected static final int WV_DTONNES_LEN = 9;
   protected static final int WV_DTONNES_SCALE = 4;
  	/**
	 * 	serializeWvDTonnes
	 */
	protected void serializeWvDTonnes(BigDecimal wvDTonnes) {
		   putDecimal(beginWvDTonnes,wvDTonnes,WV_DTONNES_LEN,WV_DTONNES_SCALE,true);
		 localWvDTonnesCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWvDTonnesMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,16/*precision*/);
   }
     /**
	 *	refreshWvDTonnes is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvDTonnes() throws CFException {	
   	try { 
		 return (getDecimal(beginWvDTonnes,WV_DTONNES_LEN,WV_DTONNES_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvDTonnes", beginWvDTonnes,WV_DTONNES_LEN);
     }
   	}
        int localWvExposureIntCounter = -1;
        public boolean isWvExposureIntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvExposureIntCounter != sharedCounter;
           localWvExposureIntCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvExposureIntIsNumeric() {
	      return decimalIsNumeric(beginWvExposureInt,WV_EXPOSURE_INT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int WV_EXPOSURE_INT_LEN = 5;
  	/**
	 * 	serializeWvExposureInt
	 */
	protected void serializeWvExposureInt(int wvExposureInt) {
		   putDecimal(beginWvExposureInt,wvExposureInt,WV_EXPOSURE_INT_LEN,true);
   }
   

   protected int checkWvExposureIntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshWvExposureInt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWvExposureInt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginWvExposureInt,WV_EXPOSURE_INT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvExposureInt", beginWvExposureInt,WV_EXPOSURE_INT_LEN);
     }
   	}
        int localWvExposureAmtCounter = -1;
        public boolean isWvExposureAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvExposureAmtCounter != sharedCounter;
           localWvExposureAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvExposureAmtIsNumeric() {
	      return decimalIsNumeric(beginWvExposureAmt,WV_EXPOSURE_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wvExposureAmtString() {
            return getPackedString(beginWvExposureAmt,WV_EXPOSURE_AMT_LEN);
         }
   protected static final int WV_EXPOSURE_AMT_LEN = 7;
   protected static final int WV_EXPOSURE_AMT_SCALE = 4;
  	/**
	 * 	serializeWvExposureAmt
	 */
	protected void serializeWvExposureAmt(BigDecimal wvExposureAmt) {
		   putDecimal(beginWvExposureAmt,wvExposureAmt,WV_EXPOSURE_AMT_LEN,WV_EXPOSURE_AMT_SCALE,true);
		 localWvExposureAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWvExposureAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshWvExposureAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvExposureAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginWvExposureAmt,WV_EXPOSURE_AMT_LEN,WV_EXPOSURE_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvExposureAmt", beginWvExposureAmt,WV_EXPOSURE_AMT_LEN);
     }
   	}
        int localWvUsdBblVarianceCounter = -1;
        public boolean isWvUsdBblVarianceModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvUsdBblVarianceCounter != sharedCounter;
           localWvUsdBblVarianceCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvUsdBblVarianceIsNumeric() {
	      return decimalIsNumeric(beginWvUsdBblVariance,WV_USD_BBL_VARIANCE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wvUsdBblVarianceString() {
            return getPackedString(beginWvUsdBblVariance,WV_USD_BBL_VARIANCE_LEN);
         }
   protected static final int WV_USD_BBL_VARIANCE_LEN = 7;
   protected static final int WV_USD_BBL_VARIANCE_SCALE = 4;
  	/**
	 * 	serializeWvUsdBblVariance
	 */
	protected void serializeWvUsdBblVariance(BigDecimal wvUsdBblVariance) {
		   putDecimal(beginWvUsdBblVariance,wvUsdBblVariance,WV_USD_BBL_VARIANCE_LEN,WV_USD_BBL_VARIANCE_SCALE,true);
		 localWvUsdBblVarianceCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWvUsdBblVarianceMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshWvUsdBblVariance is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvUsdBblVariance() throws CFException {	
   	try { 
		 return (getDecimal(beginWvUsdBblVariance,WV_USD_BBL_VARIANCE_LEN,WV_USD_BBL_VARIANCE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvUsdBblVariance", beginWvUsdBblVariance,WV_USD_BBL_VARIANCE_LEN);
     }
   	}
        int localWvOrigCostCounter = -1;
        public boolean isWvOrigCostModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvOrigCostCounter != sharedCounter;
           localWvOrigCostCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvOrigCostIsNumeric() {
	      return decimalIsNumeric(beginWvOrigCost,WV_ORIG_COST_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wvOrigCostString() {
            return getPackedString(beginWvOrigCost,WV_ORIG_COST_LEN);
         }
   protected static final int WV_ORIG_COST_LEN = 7;
   protected static final int WV_ORIG_COST_SCALE = 4;
  	/**
	 * 	serializeWvOrigCost
	 */
	protected void serializeWvOrigCost(BigDecimal wvOrigCost) {
		   putDecimal(beginWvOrigCost,wvOrigCost,WV_ORIG_COST_LEN,WV_ORIG_COST_SCALE,true);
		 localWvOrigCostCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWvOrigCostMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshWvOrigCost is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvOrigCost() throws CFException {	
   	try { 
		 return (getDecimal(beginWvOrigCost,WV_ORIG_COST_LEN,WV_ORIG_COST_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvOrigCost", beginWvOrigCost,WV_ORIG_COST_LEN);
     }
   	}
        int localWvLtstCostCounter = -1;
        public boolean isWvLtstCostModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvLtstCostCounter != sharedCounter;
           localWvLtstCostCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvLtstCostIsNumeric() {
	      return decimalIsNumeric(beginWvLtstCost,WV_LTST_COST_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wvLtstCostString() {
            return getPackedString(beginWvLtstCost,WV_LTST_COST_LEN);
         }
   protected static final int WV_LTST_COST_LEN = 7;
   protected static final int WV_LTST_COST_SCALE = 4;
  	/**
	 * 	serializeWvLtstCost
	 */
	protected void serializeWvLtstCost(BigDecimal wvLtstCost) {
		   putDecimal(beginWvLtstCost,wvLtstCost,WV_LTST_COST_LEN,WV_LTST_COST_SCALE,true);
		 localWvLtstCostCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWvLtstCostMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshWvLtstCost is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvLtstCost() throws CFException {	
   	try { 
		 return (getDecimal(beginWvLtstCost,WV_LTST_COST_LEN,WV_LTST_COST_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvLtstCost", beginWvLtstCost,WV_LTST_COST_LEN);
     }
   	}
     int localWvExtrBblVarCounter = -1;
     public boolean isWvExtrBblVarModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrBblVarCounter != sharedCounter;
         localWvExtrBblVarCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_BBL_VAR_LEN = 14;
	/**
	 * 	serialize this WvExtrBblVar
	 */
   protected void serializeWvExtrBblVar(char[] wvExtrBblVar) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrBblVar,0,getStringValue(),beginWvExtrBblVar,WV_EXTR_BBL_VAR_LEN);
       localWvExtrBblVarCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrBblVarConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshWvExtrBblVar is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrBblVar() {	 
   		return (substring(getStringValue(),beginWvExtrBblVar,beginWvExtrBblVar + WV_EXTR_BBL_VAR_LEN));
   	}
        int localWvUsdVarianceCounter = -1;
        public boolean isWvUsdVarianceModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvUsdVarianceCounter != sharedCounter;
           localWvUsdVarianceCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvUsdVarianceIsNumeric() {
	      return decimalIsNumeric(beginWvUsdVariance,WV_USD_VARIANCE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wvUsdVarianceString() {
            return getPackedString(beginWvUsdVariance,WV_USD_VARIANCE_LEN);
         }
   protected static final int WV_USD_VARIANCE_LEN = 7;
   protected static final int WV_USD_VARIANCE_SCALE = 4;
  	/**
	 * 	serializeWvUsdVariance
	 */
	protected void serializeWvUsdVariance(BigDecimal wvUsdVariance) {
		   putDecimal(beginWvUsdVariance,wvUsdVariance,WV_USD_VARIANCE_LEN,WV_USD_VARIANCE_SCALE,true);
		 localWvUsdVarianceCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWvUsdVarianceMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshWvUsdVariance is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvUsdVariance() throws CFException {	
   	try { 
		 return (getDecimal(beginWvUsdVariance,WV_USD_VARIANCE_LEN,WV_USD_VARIANCE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvUsdVariance", beginWvUsdVariance,WV_USD_VARIANCE_LEN);
     }
   	}
     int localWvExtrUsdVarCounter = -1;
     public boolean isWvExtrUsdVarModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrUsdVarCounter != sharedCounter;
         localWvExtrUsdVarCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_USD_VAR_LEN = 10;
	/**
	 * 	serialize this WvExtrUsdVar
	 */
   protected void serializeWvExtrUsdVar(char[] wvExtrUsdVar) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrUsdVar,0,getStringValue(),beginWvExtrUsdVar,WV_EXTR_USD_VAR_LEN);
       localWvExtrUsdVarCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrUsdVarConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWvExtrUsdVar is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrUsdVar() {	 
   		return (substring(getStringValue(),beginWvExtrUsdVar,beginWvExtrUsdVar + WV_EXTR_USD_VAR_LEN));
   	}
     int localIdxCounter = -1;
     public boolean isIdxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIdxCounter != sharedCounter;
         localIdxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of idx
	 *	@return idx
	 */
	public char[]  getIdxString() {
	     return getCharArray(beginIdx,IDX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean idxIsNumeric() {
	    return isNumeric(beginIdx
	                    ,beginIdx + IDX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IDX_LEN = 3;
  	/**
	 * serializeIdx
	 */
	protected void serializeIdx(int idx) {
		 putNumber(beginIdx,idx,IDX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIdxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIdx
	 */
   	protected  int serializeIdx(char[] value) {
	    int  idx;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    idx = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIdx
		       ,3
		      );
		 localIdxCounter = shareString.getSerializedField().getModifiedCounter();
		return  idx;
    }

   protected int checkIdxMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIdx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIdx() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIdx
			                 ,IDX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("idx", beginIdx,IDX_LEN);
    }
   	}




}
  
