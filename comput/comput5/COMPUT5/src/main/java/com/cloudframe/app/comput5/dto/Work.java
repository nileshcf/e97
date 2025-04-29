package com.cloudframe.app.comput5.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class Work extends WorkSerialized {
   

								private int biorptvlBatParmValNum;

						private char[] wvGeneralParm = Field.fillLowValue(80);

								private BigDecimal axisWpCoiAccum = BigDecimal.ZERO;

								private int axisWpCoiRound;

								private char[] axisWpCoiRoundDisp = Field.fillLowValue(10);

								private short wlilhI;

								private BigDecimal wlilhAccLoanAmt = BigDecimal.ZERO;

								private BigDecimal wlilhAccLoanAndIntAmt = BigDecimal.ZERO;

								private BigDecimal wlilhPrvRt = BigDecimal.ZERO;

								private int l1680TotalDays;

								private BigDecimal w6530PvIntPmtAmt = BigDecimal.ZERO;

								private BigDecimal w6530CfAdjustedAmt = BigDecimal.ZERO;

								private BigDecimal w6530CfIntRt = BigDecimal.ZERO;

								private BigDecimal w6530MktvalIntRt = BigDecimal.ZERO;

								private int w6530MktvalAdjYears;

								private BigDecimal w6530PvMatPmtAmt = BigDecimal.ZERO;

								private char[] w6530PvIntPmtAmtDis = Field.fillLowValue(20);

								private char[] w6530PvMatPmtAmtDis = Field.fillLowValue(20);

								private BigDecimal wvSumSettlValue = BigDecimal.ZERO;

								private BigDecimal wvSumDexValue = BigDecimal.ZERO;

								private BigDecimal wvCostValue = BigDecimal.ZERO;

								private BigDecimal prclcstLatestCostValue = BigDecimal.ZERO;

								private BigDecimal prclfcstFnceActualsUsdA = BigDecimal.ZERO;

								private BigDecimal wvPrtQuantity = BigDecimal.ZERO;

								private char[] wpCurrUnitDayN = Field.fillLowValue(12);

								private char[] wpUsdValue = Field.fillLowValue(12);

								private BigDecimal wvNumericOutput = BigDecimal.ZERO;

								private short wvMaxIntDigits;

								private short wvMaxDecDigits;

								private short wvIntCtr;

								private short wvDecCtr;

								private short wvSignCtr;

								private short wvCommaCtr;

								private short wvFldsFilled;

								private short wvStartPosn;

								private short wvCommaNdx;

								private short wvToNdx;

								private short wvFromNdx;

						private char[] wvDltr1 = Field.fillLowValue(1);

							private char[] filler = fillLowValue(1);

							private char[] filler01 = fillLowValue(1);

							private char[] filler02 = fillLowValue(1);

							private char[] filler03 = fillLowValue(1);

								private short wvExposureCount;

								private short wvSeqNum;

								private char[] wvKbblVol = Field.fillLowValue(14);

								private BigDecimal prclexpKbblVol = BigDecimal.ZERO;

								private char[] wxUserQuantity = Field.fillLowValue(19);

								private char[] wpFmseLmtKtN = Field.fillLowValue(10);

								private BigDecimal trdgauthQuantityAuthA = BigDecimal.ZERO;

								private BigDecimal wvBtfFactor = BigDecimal.ZERO;

								private BigDecimal wvDBblVol = BigDecimal.ZERO;

								private BigDecimal wvDBarrels = BigDecimal.ZERO;

								private char[] wpDBarrels = Field.fillLowValue(20);

								private BigDecimal wvDMtAmt = BigDecimal.ZERO;

								private BigDecimal wvEffWeightPc = BigDecimal.ZERO;

								private BigDecimal dealgpalAllocWgtnNum = BigDecimal.ZERO;

								private BigDecimal parcelBblVol = BigDecimal.ZERO;

								private BigDecimal wvDQty = BigDecimal.ZERO;

								private char[] wpDQty = Field.fillLowValue(19);

								private BigDecimal wvMmbConv = BigDecimal.ZERO;

								private BigDecimal wvDTonnes = BigDecimal.ZERO;

								private int wvExposureInt;

								private BigDecimal wvExposureAmt = BigDecimal.ZERO;

								private BigDecimal wvUsdBblVariance = BigDecimal.ZERO;

								private BigDecimal wvOrigCost = BigDecimal.ZERO;

								private BigDecimal wvLtstCost = BigDecimal.ZERO;

								private char[] wvExtrBblVar = Field.fillLowValue(14);

								private BigDecimal wvUsdVariance = BigDecimal.ZERO;

								private char[] wvExtrUsdVar = Field.fillLowValue(10);

								private int idx;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of biorptvlBatParmValNum
	 *	@return biorptvlBatParmValNum
	 */
	public int getBiorptvlBatParmValNum() throws CFException {
   		return biorptvlBatParmValNum;
	}
	
	/**
	 * 	Update BiorptvlBatParmValNum with the passed value
	 *  Corresponding COBOL Variable is BIORPTVL-BAT-PARM-VAL-NUM
	 *	@param number
	 */
	public void setBiorptvlBatParmValNum(int number) {
	     // Truncate if the number is beyond +/- Max range
	    biorptvlBatParmValNum = checkBiorptvlBatParmValNumMaxLimit(number); 
	}


	public void setBiorptvlBatParmValNum(long number) {
	    number = checkBiorptvlBatParmValNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBiorptvlBatParmValNum((int)number);
	}
	
	/**
	 *	Returns the value of wvGeneralParm
	 *	@return wvGeneralParm
	 */
   public char[] getWvGeneralParm() throws CFException{
   		return wvGeneralParm;
   }

  
	/**
	*  set variable wvGeneralParm
	*  Corresponding COBOL Variable is WV-GENERAL-PARM
	*  @param value
	**/
   public void setWvGeneralParm(char[] value) {
       value = checkWvGeneralParmConstraints(value);
       arraycopy(value,0,wvGeneralParm,0,value.length);
   } 
	public void setWvGeneralParm(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wvGeneralParm,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of axisWpCoiAccum
	 *	@return axisWpCoiAccum
	 */
	public BigDecimal getAxisWpCoiAccum() throws CFException {
       if (isAxisWpCoiAccumModified()) { 
           axisWpCoiAccum = refreshAxisWpCoiAccum();
        }
   		return axisWpCoiAccum;
	}
	

    /**
	 *	Returns the String value of axisWpCoiAccum
	 *	@return axisWpCoiAccum
	 */
	public char[]  getAxisWpCoiAccumActualString() {
	    String value = String.valueOf(axisWpCoiAccum).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update AxisWpCoiAccum with the passed number
	 *  Corresponding COBOL Variable is AXIS-WP-COI-ACCUM
	 *	@param number
	 */
	public void setAxisWpCoiAccum(BigDecimal number) {
       axisWpCoiAccum = checkAxisWpCoiAccumMaxLimit(number);
	    serializeAxisWpCoiAccum(axisWpCoiAccum);
   }
	/**
	 * 	Update AxisWpCoiAccum with the passed value
	 *	@param value (String or char[])
	 */
	public void setAxisWpCoiAccum(char[] value) throws CFException {
		 axisWpCoiAccum = serializeAxisWpCoiAccum(value);
	}   
	/**
	 *	Returns the value of axisWpCoiRound
	 *	@return axisWpCoiRound
	 */
	public int getAxisWpCoiRound() throws CFException {
       if (isAxisWpCoiRoundModified()) { 
           axisWpCoiRound = refreshAxisWpCoiRound();
        }
   		return axisWpCoiRound;
	}
	

    /**
	 *	Returns the String value of axisWpCoiRound
	 *	@return axisWpCoiRound
	 */
	public char[]  getAxisWpCoiRoundActualString() {
	    String value = String.valueOf(axisWpCoiRound).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update AxisWpCoiRound with the passed value
	 *  Corresponding COBOL Variable is AXIS-WP-COI-ROUND
	 *	@param number
	 */
	public void setAxisWpCoiRound(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    axisWpCoiRound = checkAxisWpCoiRoundMaxLimit(number); 
		serializeAxisWpCoiRound(axisWpCoiRound);
	}
	

	public void setAxisWpCoiRound(long number) {
	    number = checkAxisWpCoiRoundMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAxisWpCoiRound((int)number);
	}
	
	/**
	 * 	Update AxisWpCoiRound with the passed value
	 *	@param value (String or char[])
	 */
	public void setAxisWpCoiRound(char[] value) throws CFException {
		 axisWpCoiRound = serializeAxisWpCoiRound(value);
	}
	/**
	 * 	Update AxisWpCoiRound with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAxisWpCoiRoundString(char[] value) throws CFException {
		 setAxisWpCoiRound(value);
	}
	/**
	 *	Returns the value of axisWpCoiRoundDisp
	 *	@return axisWpCoiRoundDisp
	 */
   public char[] getAxisWpCoiRoundDisp() throws CFException{
     if (isAxisWpCoiRoundDispModified()) { 
        axisWpCoiRoundDisp = refreshAxisWpCoiRoundDisp();
     }
   		return axisWpCoiRoundDisp;
   }

  
	/**
	*  set variable axisWpCoiRoundDisp
	*  Corresponding COBOL Variable is AXIS-WP-COI-ROUND-DISP
	*  @param value
	**/
   public void setAxisWpCoiRoundDisp(char[] value) {
      axisWpCoiRoundDisp = checkAxisWpCoiRoundDispConstraints(value);
      serializeAxisWpCoiRoundDisp(axisWpCoiRoundDisp);
   } 

     /**
	 * 	Update AxisWpCoiRoundDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAxisWpCoiRoundDisp,axisWpCoiRoundDisp.length);
   	
   }
   
   public void setAxisWpCoiRoundDisp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAxisWpCoiRoundDisp,axisWpCoiRoundDisp.length);
   	
   }
   
     /**
	 * 	Update AxisWpCoiRoundDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAxisWpCoiRoundDisp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AxisWpCoiRoundDisp with another Field
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(Field source) {
       replace(source,0,source.length(),beginAxisWpCoiRoundDisp,AXIS_WP_COI_ROUND_DISP_LEN);
   	
   }  
   
     /**
	 * 	Update AxisWpCoiRoundDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAxisWpCoiRoundDisp,AXIS_WP_COI_ROUND_DISP_LEN);
   	
   }
   
     /**
	 * 	Update AxisWpCoiRoundDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAxisWpCoiRoundDisp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wlilhI
	 *	@return wlilhI
	 */
	public short getWlilhI() throws CFException {
       if (isWlilhIModified()) { 
           wlilhI = refreshWlilhI();
        }
   		return wlilhI;
	}
	

    /**
	 *	Returns the String value of wlilhI
	 *	@return wlilhI
	 */
	public char[]  getWlilhIActualString() {
	    String value = String.valueOf(wlilhI).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update WlilhI with the passed value
	 *  Corresponding COBOL Variable is WLILH-I
	 *	@param number
	 */
	public void setWlilhI(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    wlilhI = checkWlilhIMaxLimit(number); 
		serializeWlilhI(wlilhI);
	}
	
	public void setWlilhI(int number) {
	    number = checkWlilhIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWlilhI((short)number);
	}
	public void setWlilhI(long number) {
	    number = checkWlilhIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWlilhI((short)number);
	}
	

	/**
	 * 	Update WlilhI with the passed value
	 *	@param value (String or char[])
	 */
	public void setWlilhI(char[] value) throws CFException {
		 wlilhI = serializeWlilhI(value);
	}
	/**
	 * 	Update WlilhI with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWlilhIString(char[] value) throws CFException {
		 setWlilhI(value);
	}
	public BigDecimal getWlilhAccLoanAmt() throws CFException {
        if (isWlilhAccLoanAmtModified()) { 
           wlilhAccLoanAmt = refreshWlilhAccLoanAmt();
        }
   		return wlilhAccLoanAmt;
	}

    public char[] getWlilhAccLoanAmtString() {
          return  wlilhAccLoanAmtString();
    }
	
	/**
	 * 	Update WlilhAccLoanAmt with the passed number
	 *  Corresponding COBOL Variable is WLILH-ACC-LOAN-AMT
	 *	@param number
	 */
	public void setWlilhAccLoanAmt(BigDecimal number) {	
     wlilhAccLoanAmt = checkWlilhAccLoanAmtMaxLimit(number);
	    serializeWlilhAccLoanAmt(wlilhAccLoanAmt);
   }
	public BigDecimal getWlilhAccLoanAndIntAmt() throws CFException {
        if (isWlilhAccLoanAndIntAmtModified()) { 
           wlilhAccLoanAndIntAmt = refreshWlilhAccLoanAndIntAmt();
        }
   		return wlilhAccLoanAndIntAmt;
	}

    public char[] getWlilhAccLoanAndIntAmtString() {
          return  wlilhAccLoanAndIntAmtString();
    }
	
	/**
	 * 	Update WlilhAccLoanAndIntAmt with the passed number
	 *  Corresponding COBOL Variable is WLILH-ACC-LOAN-AND-INT-AMT
	 *	@param number
	 */
	public void setWlilhAccLoanAndIntAmt(BigDecimal number) {	
     wlilhAccLoanAndIntAmt = checkWlilhAccLoanAndIntAmtMaxLimit(number);
	    serializeWlilhAccLoanAndIntAmt(wlilhAccLoanAndIntAmt);
   }
	public BigDecimal getWlilhPrvRt() throws CFException {
        if (isWlilhPrvRtModified()) { 
           wlilhPrvRt = refreshWlilhPrvRt();
        }
   		return wlilhPrvRt;
	}

    public char[] getWlilhPrvRtString() {
          return  wlilhPrvRtString();
    }
	
	/**
	 * 	Update WlilhPrvRt with the passed number
	 *  Corresponding COBOL Variable is WLILH-PRV-RT
	 *	@param number
	 */
	public void setWlilhPrvRt(BigDecimal number) {	
     wlilhPrvRt = checkWlilhPrvRtMaxLimit(number);
	    serializeWlilhPrvRt(wlilhPrvRt);
   }
	public int getL1680TotalDays() throws CFException {
        if (isL1680TotalDaysModified()) { 
           l1680TotalDays = refreshL1680TotalDays();
        }
   		return l1680TotalDays;
	}
	
	/**
	 * 	Update L1680TotalDays with the passed value
	 *  Corresponding COBOL Variable is L1680-TOTAL-DAYS
	 *	@param number
	 */
	public void setL1680TotalDays(int number) {
			l1680TotalDays = checkL1680TotalDaysMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeL1680TotalDays(l1680TotalDays);
	}


	public void setL1680TotalDays(long number) {
	    number = checkL1680TotalDaysMaxLimit(number); // Truncate if value is beyond +/- Max range
		setL1680TotalDays((int)number);
	}
	
	public BigDecimal getW6530PvIntPmtAmt() throws CFException {
        if (isW6530PvIntPmtAmtModified()) { 
           w6530PvIntPmtAmt = refreshW6530PvIntPmtAmt();
        }
   		return w6530PvIntPmtAmt;
	}

    public char[] getW6530PvIntPmtAmtString() {
          return  w6530PvIntPmtAmtString();
    }
	
	/**
	 * 	Update W6530PvIntPmtAmt with the passed number
	 *  Corresponding COBOL Variable is W6530-PV-INT-PMT-AMT
	 *	@param number
	 */
	public void setW6530PvIntPmtAmt(BigDecimal number) {	
     w6530PvIntPmtAmt = checkW6530PvIntPmtAmtMaxLimit(number);
	    serializeW6530PvIntPmtAmt(w6530PvIntPmtAmt);
   }
	public BigDecimal getW6530CfAdjustedAmt() throws CFException {
        if (isW6530CfAdjustedAmtModified()) { 
           w6530CfAdjustedAmt = refreshW6530CfAdjustedAmt();
        }
   		return w6530CfAdjustedAmt;
	}

    public char[] getW6530CfAdjustedAmtString() {
          return  w6530CfAdjustedAmtString();
    }
	
	/**
	 * 	Update W6530CfAdjustedAmt with the passed number
	 *  Corresponding COBOL Variable is W6530-CF-ADJUSTED-AMT
	 *	@param number
	 */
	public void setW6530CfAdjustedAmt(BigDecimal number) {	
     w6530CfAdjustedAmt = checkW6530CfAdjustedAmtMaxLimit(number);
	    serializeW6530CfAdjustedAmt(w6530CfAdjustedAmt);
   }
	public BigDecimal getW6530CfIntRt() throws CFException {
        if (isW6530CfIntRtModified()) { 
           w6530CfIntRt = refreshW6530CfIntRt();
        }
   		return w6530CfIntRt;
	}

    public char[] getW6530CfIntRtString() {
          return  w6530CfIntRtString();
    }
	
	/**
	 * 	Update W6530CfIntRt with the passed number
	 *  Corresponding COBOL Variable is W6530-CF-INT-RT
	 *	@param number
	 */
	public void setW6530CfIntRt(BigDecimal number) {	
     w6530CfIntRt = checkW6530CfIntRtMaxLimit(number);
	    serializeW6530CfIntRt(w6530CfIntRt);
   }
	public BigDecimal getW6530MktvalIntRt() throws CFException {
        if (isW6530MktvalIntRtModified()) { 
           w6530MktvalIntRt = refreshW6530MktvalIntRt();
        }
   		return w6530MktvalIntRt;
	}

    public char[] getW6530MktvalIntRtString() {
          return  w6530MktvalIntRtString();
    }
	
	/**
	 * 	Update W6530MktvalIntRt with the passed number
	 *  Corresponding COBOL Variable is W6530-MKTVAL-INT-RT
	 *	@param number
	 */
	public void setW6530MktvalIntRt(BigDecimal number) {	
     w6530MktvalIntRt = checkW6530MktvalIntRtMaxLimit(number);
	    serializeW6530MktvalIntRt(w6530MktvalIntRt);
   }
	public int getW6530MktvalAdjYears() throws CFException {
        if (isW6530MktvalAdjYearsModified()) { 
           w6530MktvalAdjYears = refreshW6530MktvalAdjYears();
        }
   		return w6530MktvalAdjYears;
	}
	
	/**
	 * 	Update W6530MktvalAdjYears with the passed value
	 *  Corresponding COBOL Variable is W6530-MKTVAL-ADJ-YEARS
	 *	@param number
	 */
	public void setW6530MktvalAdjYears(int number) {
			w6530MktvalAdjYears = checkW6530MktvalAdjYearsMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeW6530MktvalAdjYears(w6530MktvalAdjYears);
	}


	public void setW6530MktvalAdjYears(long number) {
	    number = checkW6530MktvalAdjYearsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setW6530MktvalAdjYears((int)number);
	}
	
	public BigDecimal getW6530PvMatPmtAmt() throws CFException {
        if (isW6530PvMatPmtAmtModified()) { 
           w6530PvMatPmtAmt = refreshW6530PvMatPmtAmt();
        }
   		return w6530PvMatPmtAmt;
	}

    public char[] getW6530PvMatPmtAmtString() {
          return  w6530PvMatPmtAmtString();
    }
	
	/**
	 * 	Update W6530PvMatPmtAmt with the passed number
	 *  Corresponding COBOL Variable is W6530-PV-MAT-PMT-AMT
	 *	@param number
	 */
	public void setW6530PvMatPmtAmt(BigDecimal number) {	
     w6530PvMatPmtAmt = checkW6530PvMatPmtAmtMaxLimit(number);
	    serializeW6530PvMatPmtAmt(w6530PvMatPmtAmt);
   }
	/**
	 *	Returns the value of w6530PvIntPmtAmtDis
	 *	@return w6530PvIntPmtAmtDis
	 */
   public char[] getW6530PvIntPmtAmtDis() throws CFException{
     if (isW6530PvIntPmtAmtDisModified()) { 
        w6530PvIntPmtAmtDis = refreshW6530PvIntPmtAmtDis();
     }
   		return w6530PvIntPmtAmtDis;
   }

  
	/**
	*  set variable w6530PvIntPmtAmtDis
	*  Corresponding COBOL Variable is W6530-PV-INT-PMT-AMT-DIS
	*  @param value
	**/
   public void setW6530PvIntPmtAmtDis(char[] value) {
      w6530PvIntPmtAmtDis = checkW6530PvIntPmtAmtDisConstraints(value);
      serializeW6530PvIntPmtAmtDis(w6530PvIntPmtAmtDis);
   } 

     /**
	 * 	Update W6530PvIntPmtAmtDis 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setW6530PvIntPmtAmtDis(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginW6530PvIntPmtAmtDis,w6530PvIntPmtAmtDis.length);
   	
   }
   
   public void setW6530PvIntPmtAmtDis(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginW6530PvIntPmtAmtDis,w6530PvIntPmtAmtDis.length);
   	
   }
   
     /**
	 * 	Update W6530PvIntPmtAmtDis 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW6530PvIntPmtAmtDis(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW6530PvIntPmtAmtDis+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update W6530PvIntPmtAmtDis with another Field
	 *	@param value
	 */
   public void setW6530PvIntPmtAmtDis(Field source) {
       replace(source,0,source.length(),beginW6530PvIntPmtAmtDis,W_6530_PV_INT_PMT_AMT_DIS_LEN);
   	
   }  
   
     /**
	 * 	Update W6530PvIntPmtAmtDis 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setW6530PvIntPmtAmtDis(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginW6530PvIntPmtAmtDis,W_6530_PV_INT_PMT_AMT_DIS_LEN);
   	
   }
   
     /**
	 * 	Update W6530PvIntPmtAmtDis 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW6530PvIntPmtAmtDis(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW6530PvIntPmtAmtDis+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of w6530PvMatPmtAmtDis
	 *	@return w6530PvMatPmtAmtDis
	 */
   public char[] getW6530PvMatPmtAmtDis() throws CFException{
     if (isW6530PvMatPmtAmtDisModified()) { 
        w6530PvMatPmtAmtDis = refreshW6530PvMatPmtAmtDis();
     }
   		return w6530PvMatPmtAmtDis;
   }

  
	/**
	*  set variable w6530PvMatPmtAmtDis
	*  Corresponding COBOL Variable is W6530-PV-MAT-PMT-AMT-DIS
	*  @param value
	**/
   public void setW6530PvMatPmtAmtDis(char[] value) {
      w6530PvMatPmtAmtDis = checkW6530PvMatPmtAmtDisConstraints(value);
      serializeW6530PvMatPmtAmtDis(w6530PvMatPmtAmtDis);
   } 

     /**
	 * 	Update W6530PvMatPmtAmtDis 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setW6530PvMatPmtAmtDis(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginW6530PvMatPmtAmtDis,w6530PvMatPmtAmtDis.length);
   	
   }
   
   public void setW6530PvMatPmtAmtDis(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginW6530PvMatPmtAmtDis,w6530PvMatPmtAmtDis.length);
   	
   }
   
     /**
	 * 	Update W6530PvMatPmtAmtDis 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW6530PvMatPmtAmtDis(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW6530PvMatPmtAmtDis+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update W6530PvMatPmtAmtDis with another Field
	 *	@param value
	 */
   public void setW6530PvMatPmtAmtDis(Field source) {
       replace(source,0,source.length(),beginW6530PvMatPmtAmtDis,W_6530_PV_MAT_PMT_AMT_DIS_LEN);
   	
   }  
   
     /**
	 * 	Update W6530PvMatPmtAmtDis 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setW6530PvMatPmtAmtDis(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginW6530PvMatPmtAmtDis,W_6530_PV_MAT_PMT_AMT_DIS_LEN);
   	
   }
   
     /**
	 * 	Update W6530PvMatPmtAmtDis 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW6530PvMatPmtAmtDis(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginW6530PvMatPmtAmtDis+targetIndex,targetLen);
    
   }
	public BigDecimal getWvSumSettlValue() throws CFException {
        if (isWvSumSettlValueModified()) { 
           wvSumSettlValue = refreshWvSumSettlValue();
        }
   		return wvSumSettlValue;
	}

    public char[] getWvSumSettlValueString() {
          return  wvSumSettlValueString();
    }
	
	/**
	 * 	Update WvSumSettlValue with the passed number
	 *  Corresponding COBOL Variable is WV-SUM-SETTL-VALUE
	 *	@param number
	 */
	public void setWvSumSettlValue(BigDecimal number) {	
     wvSumSettlValue = checkWvSumSettlValueMaxLimit(number);
	    serializeWvSumSettlValue(wvSumSettlValue);
   }
	public BigDecimal getWvSumDexValue() throws CFException {
        if (isWvSumDexValueModified()) { 
           wvSumDexValue = refreshWvSumDexValue();
        }
   		return wvSumDexValue;
	}

    public char[] getWvSumDexValueString() {
          return  wvSumDexValueString();
    }
	
	/**
	 * 	Update WvSumDexValue with the passed number
	 *  Corresponding COBOL Variable is WV-SUM-DEX-VALUE
	 *	@param number
	 */
	public void setWvSumDexValue(BigDecimal number) {	
     wvSumDexValue = checkWvSumDexValueMaxLimit(number);
	    serializeWvSumDexValue(wvSumDexValue);
   }
	public BigDecimal getWvCostValue() throws CFException {
        if (isWvCostValueModified()) { 
           wvCostValue = refreshWvCostValue();
        }
   		return wvCostValue;
	}

    public char[] getWvCostValueString() {
          return  wvCostValueString();
    }
	
	/**
	 * 	Update WvCostValue with the passed number
	 *  Corresponding COBOL Variable is WV-COST-VALUE
	 *	@param number
	 */
	public void setWvCostValue(BigDecimal number) {	
     wvCostValue = checkWvCostValueMaxLimit(number);
	    serializeWvCostValue(wvCostValue);
   }
	public BigDecimal getPrclcstLatestCostValue() throws CFException {
        if (isPrclcstLatestCostValueModified()) { 
           prclcstLatestCostValue = refreshPrclcstLatestCostValue();
        }
   		return prclcstLatestCostValue;
	}

    public char[] getPrclcstLatestCostValueString() {
          return  prclcstLatestCostValueString();
    }
	
	/**
	 * 	Update PrclcstLatestCostValue with the passed number
	 *  Corresponding COBOL Variable is PRCLCST-LATEST-COST-VALUE
	 *	@param number
	 */
	public void setPrclcstLatestCostValue(BigDecimal number) {	
     prclcstLatestCostValue = checkPrclcstLatestCostValueMaxLimit(number);
	    serializePrclcstLatestCostValue(prclcstLatestCostValue);
   }
	public BigDecimal getPrclfcstFnceActualsUsdA() throws CFException {
        if (isPrclfcstFnceActualsUsdAModified()) { 
           prclfcstFnceActualsUsdA = refreshPrclfcstFnceActualsUsdA();
        }
   		return prclfcstFnceActualsUsdA;
	}

    public char[] getPrclfcstFnceActualsUsdAString() {
          return  prclfcstFnceActualsUsdAString();
    }
	
	/**
	 * 	Update PrclfcstFnceActualsUsdA with the passed number
	 *  Corresponding COBOL Variable is PRCLFCST-FNCE-ACTUALS-USD-A
	 *	@param number
	 */
	public void setPrclfcstFnceActualsUsdA(BigDecimal number) {	
     prclfcstFnceActualsUsdA = checkPrclfcstFnceActualsUsdAMaxLimit(number);
	    serializePrclfcstFnceActualsUsdA(prclfcstFnceActualsUsdA);
   }
	/**
	 *	Returns the value of wvPrtQuantity
	 *	@return wvPrtQuantity
	 */
	public BigDecimal getWvPrtQuantity() throws CFException {
       if (isWvPrtQuantityModified()) { 
           wvPrtQuantity = refreshWvPrtQuantity();
        }
   		return wvPrtQuantity;
	}
	

    /**
	 *	Returns the String value of wvPrtQuantity
	 *	@return wvPrtQuantity
	 */
	public char[]  getWvPrtQuantityActualString() {
	    String value = String.valueOf(wvPrtQuantity).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update WvPrtQuantity with the passed number
	 *  Corresponding COBOL Variable is WV-PRT-QUANTITY
	 *	@param number
	 */
	public void setWvPrtQuantity(BigDecimal number) {
       wvPrtQuantity = checkWvPrtQuantityMaxLimit(number);
	    serializeWvPrtQuantity(wvPrtQuantity);
   }
	/**
	 * 	Update WvPrtQuantity with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvPrtQuantity(char[] value) throws CFException {
		 wvPrtQuantity = serializeWvPrtQuantity(value);
	}   
	/**
	 *	Returns the value of wpCurrUnitDayN
	 *	@return wpCurrUnitDayN
	 */
   public char[] getWpCurrUnitDayN() throws CFException{
     if (isWpCurrUnitDayNModified()) { 
        wpCurrUnitDayN = refreshWpCurrUnitDayN();
     }
   		return wpCurrUnitDayN;
   }

  
	/**
	*  set variable wpCurrUnitDayN
	*  Corresponding COBOL Variable is WP-CURR-UNIT-DAY-N
	*  @param value
	**/
   public void setWpCurrUnitDayN(char[] value) {
      wpCurrUnitDayN = checkWpCurrUnitDayNConstraints(value);
      serializeWpCurrUnitDayN(wpCurrUnitDayN);
   } 

     /**
	 * 	Update WpCurrUnitDayN 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpCurrUnitDayN(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWpCurrUnitDayN,wpCurrUnitDayN.length);
   	
   }
   
   public void setWpCurrUnitDayN(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWpCurrUnitDayN,wpCurrUnitDayN.length);
   	
   }
   
     /**
	 * 	Update WpCurrUnitDayN 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpCurrUnitDayN(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpCurrUnitDayN+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WpCurrUnitDayN with another Field
	 *	@param value
	 */
   public void setWpCurrUnitDayN(Field source) {
       replace(source,0,source.length(),beginWpCurrUnitDayN,WP_CURR_UNIT_DAY_N_LEN);
   	
   }  
   
     /**
	 * 	Update WpCurrUnitDayN 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpCurrUnitDayN(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWpCurrUnitDayN,WP_CURR_UNIT_DAY_N_LEN);
   	
   }
   
     /**
	 * 	Update WpCurrUnitDayN 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpCurrUnitDayN(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpCurrUnitDayN+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wpUsdValue
	 *	@return wpUsdValue
	 */
   public char[] getWpUsdValue() throws CFException{
     if (isWpUsdValueModified()) { 
        wpUsdValue = refreshWpUsdValue();
     }
   		return wpUsdValue;
   }

  
	/**
	*  set variable wpUsdValue
	*  Corresponding COBOL Variable is WP-USD-VALUE
	*  @param value
	**/
   public void setWpUsdValue(char[] value) {
      wpUsdValue = checkWpUsdValueConstraints(value);
      serializeWpUsdValue(wpUsdValue);
   } 

     /**
	 * 	Update WpUsdValue 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpUsdValue(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWpUsdValue,wpUsdValue.length);
   	
   }
   
   public void setWpUsdValue(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWpUsdValue,wpUsdValue.length);
   	
   }
   
     /**
	 * 	Update WpUsdValue 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpUsdValue(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpUsdValue+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WpUsdValue with another Field
	 *	@param value
	 */
   public void setWpUsdValue(Field source) {
       replace(source,0,source.length(),beginWpUsdValue,WP_USD_VALUE_LEN);
   	
   }  
   
     /**
	 * 	Update WpUsdValue 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpUsdValue(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWpUsdValue,WP_USD_VALUE_LEN);
   	
   }
   
     /**
	 * 	Update WpUsdValue 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpUsdValue(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpUsdValue+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvNumericOutput
	 *	@return wvNumericOutput
	 */
	public BigDecimal getWvNumericOutput() throws CFException {
       if (isWvNumericOutputModified()) { 
           wvNumericOutput = refreshWvNumericOutput();
        }
   		return wvNumericOutput;
	}
	

    /**
	 *	Returns the String value of wvNumericOutput
	 *	@return wvNumericOutput
	 */
	public char[]  getWvNumericOutputActualString() {
	    String value = String.valueOf(wvNumericOutput).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update WvNumericOutput with the passed number
	 *  Corresponding COBOL Variable is WV-NUMERIC-OUTPUT
	 *	@param number
	 */
	public void setWvNumericOutput(BigDecimal number) {
       wvNumericOutput = checkWvNumericOutputMaxLimit(number);
	    serializeWvNumericOutput(wvNumericOutput);
   }
	/**
	 * 	Update WvNumericOutput with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvNumericOutput(char[] value) throws CFException {
		 wvNumericOutput = serializeWvNumericOutput(value);
	}   
	/**
	 *	Returns the value of wvMaxIntDigits
	 *	@return wvMaxIntDigits
	 */
	public short getWvMaxIntDigits() throws CFException {
       if (isWvMaxIntDigitsModified()) { 
           wvMaxIntDigits = refreshWvMaxIntDigits();
        }
   		return wvMaxIntDigits;
	}
	

    /**
	 *	Returns the String value of wvMaxIntDigits
	 *	@return wvMaxIntDigits
	 */
	public char[]  getWvMaxIntDigitsActualString() {
	    String value = String.valueOf(wvMaxIntDigits).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update WvMaxIntDigits with the passed value
	 *  Corresponding COBOL Variable is WV-MAX-INT-DIGITS
	 *	@param number
	 */
	public void setWvMaxIntDigits(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    wvMaxIntDigits = checkWvMaxIntDigitsMaxLimit(number); 
		serializeWvMaxIntDigits(wvMaxIntDigits);
	}
	
	public void setWvMaxIntDigits(int number) {
	    number = checkWvMaxIntDigitsMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvMaxIntDigits((short)number);
	}
	public void setWvMaxIntDigits(long number) {
	    number = checkWvMaxIntDigitsMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvMaxIntDigits((short)number);
	}
	

	/**
	 * 	Update WvMaxIntDigits with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvMaxIntDigits(char[] value) throws CFException {
		 wvMaxIntDigits = serializeWvMaxIntDigits(value);
	}
	/**
	 * 	Update WvMaxIntDigits with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvMaxIntDigitsString(char[] value) throws CFException {
		 setWvMaxIntDigits(value);
	}
	/**
	 *	Returns the value of wvMaxDecDigits
	 *	@return wvMaxDecDigits
	 */
	public short getWvMaxDecDigits() throws CFException {
       if (isWvMaxDecDigitsModified()) { 
           wvMaxDecDigits = refreshWvMaxDecDigits();
        }
   		return wvMaxDecDigits;
	}
	

    /**
	 *	Returns the String value of wvMaxDecDigits
	 *	@return wvMaxDecDigits
	 */
	public char[]  getWvMaxDecDigitsActualString() {
	    String value = String.valueOf(wvMaxDecDigits).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update WvMaxDecDigits with the passed value
	 *  Corresponding COBOL Variable is WV-MAX-DEC-DIGITS
	 *	@param number
	 */
	public void setWvMaxDecDigits(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    wvMaxDecDigits = checkWvMaxDecDigitsMaxLimit(number); 
		serializeWvMaxDecDigits(wvMaxDecDigits);
	}
	
	public void setWvMaxDecDigits(int number) {
	    number = checkWvMaxDecDigitsMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvMaxDecDigits((short)number);
	}
	public void setWvMaxDecDigits(long number) {
	    number = checkWvMaxDecDigitsMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvMaxDecDigits((short)number);
	}
	

	/**
	 * 	Update WvMaxDecDigits with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvMaxDecDigits(char[] value) throws CFException {
		 wvMaxDecDigits = serializeWvMaxDecDigits(value);
	}
	/**
	 * 	Update WvMaxDecDigits with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvMaxDecDigitsString(char[] value) throws CFException {
		 setWvMaxDecDigits(value);
	}
	/**
	 *	Returns the value of wvIntCtr
	 *	@return wvIntCtr
	 */
	public short getWvIntCtr() throws CFException {
       if (isWvIntCtrModified()) { 
           wvIntCtr = refreshWvIntCtr();
        }
   		return wvIntCtr;
	}
	

    /**
	 *	Returns the String value of wvIntCtr
	 *	@return wvIntCtr
	 */
	public char[]  getWvIntCtrActualString() {
	    String value = String.valueOf(wvIntCtr).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update WvIntCtr with the passed value
	 *  Corresponding COBOL Variable is WV-INT-CTR
	 *	@param number
	 */
	public void setWvIntCtr(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    wvIntCtr = checkWvIntCtrMaxLimit(number); 
		serializeWvIntCtr(wvIntCtr);
	}
	
	public void setWvIntCtr(int number) {
	    number = checkWvIntCtrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvIntCtr((short)number);
	}
	public void setWvIntCtr(long number) {
	    number = checkWvIntCtrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvIntCtr((short)number);
	}
	

	/**
	 * 	Update WvIntCtr with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvIntCtr(char[] value) throws CFException {
		 wvIntCtr = serializeWvIntCtr(value);
	}
	/**
	 * 	Update WvIntCtr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvIntCtrString(char[] value) throws CFException {
		 setWvIntCtr(value);
	}
	/**
	 *	Returns the value of wvDecCtr
	 *	@return wvDecCtr
	 */
	public short getWvDecCtr() throws CFException {
       if (isWvDecCtrModified()) { 
           wvDecCtr = refreshWvDecCtr();
        }
   		return wvDecCtr;
	}
	

    /**
	 *	Returns the String value of wvDecCtr
	 *	@return wvDecCtr
	 */
	public char[]  getWvDecCtrActualString() {
	    String value = String.valueOf(wvDecCtr).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update WvDecCtr with the passed value
	 *  Corresponding COBOL Variable is WV-DEC-CTR
	 *	@param number
	 */
	public void setWvDecCtr(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    wvDecCtr = checkWvDecCtrMaxLimit(number); 
		serializeWvDecCtr(wvDecCtr);
	}
	
	public void setWvDecCtr(int number) {
	    number = checkWvDecCtrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvDecCtr((short)number);
	}
	public void setWvDecCtr(long number) {
	    number = checkWvDecCtrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvDecCtr((short)number);
	}
	

	/**
	 * 	Update WvDecCtr with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvDecCtr(char[] value) throws CFException {
		 wvDecCtr = serializeWvDecCtr(value);
	}
	/**
	 * 	Update WvDecCtr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvDecCtrString(char[] value) throws CFException {
		 setWvDecCtr(value);
	}
	/**
	 *	Returns the value of wvSignCtr
	 *	@return wvSignCtr
	 */
	public short getWvSignCtr() throws CFException {
       if (isWvSignCtrModified()) { 
           wvSignCtr = refreshWvSignCtr();
        }
   		return wvSignCtr;
	}
	

    /**
	 *	Returns the String value of wvSignCtr
	 *	@return wvSignCtr
	 */
	public char[]  getWvSignCtrActualString() {
	    String value = String.valueOf(wvSignCtr).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update WvSignCtr with the passed value
	 *  Corresponding COBOL Variable is WV-SIGN-CTR
	 *	@param number
	 */
	public void setWvSignCtr(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    wvSignCtr = checkWvSignCtrMaxLimit(number); 
		serializeWvSignCtr(wvSignCtr);
	}
	
	public void setWvSignCtr(int number) {
	    number = checkWvSignCtrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvSignCtr((short)number);
	}
	public void setWvSignCtr(long number) {
	    number = checkWvSignCtrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvSignCtr((short)number);
	}
	

	/**
	 * 	Update WvSignCtr with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvSignCtr(char[] value) throws CFException {
		 wvSignCtr = serializeWvSignCtr(value);
	}
	/**
	 * 	Update WvSignCtr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvSignCtrString(char[] value) throws CFException {
		 setWvSignCtr(value);
	}
	/**
	 *	Returns the value of wvCommaCtr
	 *	@return wvCommaCtr
	 */
	public short getWvCommaCtr() throws CFException {
       if (isWvCommaCtrModified()) { 
           wvCommaCtr = refreshWvCommaCtr();
        }
   		return wvCommaCtr;
	}
	

    /**
	 *	Returns the String value of wvCommaCtr
	 *	@return wvCommaCtr
	 */
	public char[]  getWvCommaCtrActualString() {
	    String value = String.valueOf(wvCommaCtr).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update WvCommaCtr with the passed value
	 *  Corresponding COBOL Variable is WV-COMMA-CTR
	 *	@param number
	 */
	public void setWvCommaCtr(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    wvCommaCtr = checkWvCommaCtrMaxLimit(number); 
		serializeWvCommaCtr(wvCommaCtr);
	}
	
	public void setWvCommaCtr(int number) {
	    number = checkWvCommaCtrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvCommaCtr((short)number);
	}
	public void setWvCommaCtr(long number) {
	    number = checkWvCommaCtrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvCommaCtr((short)number);
	}
	

	/**
	 * 	Update WvCommaCtr with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvCommaCtr(char[] value) throws CFException {
		 wvCommaCtr = serializeWvCommaCtr(value);
	}
	/**
	 * 	Update WvCommaCtr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvCommaCtrString(char[] value) throws CFException {
		 setWvCommaCtr(value);
	}
	/**
	 *	Returns the value of wvFldsFilled
	 *	@return wvFldsFilled
	 */
	public short getWvFldsFilled() throws CFException {
       if (isWvFldsFilledModified()) { 
           wvFldsFilled = refreshWvFldsFilled();
        }
   		return wvFldsFilled;
	}
	

    /**
	 *	Returns the String value of wvFldsFilled
	 *	@return wvFldsFilled
	 */
	public char[]  getWvFldsFilledActualString() {
	    String value = String.valueOf(wvFldsFilled).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update WvFldsFilled with the passed value
	 *  Corresponding COBOL Variable is WV-FLDS-FILLED
	 *	@param number
	 */
	public void setWvFldsFilled(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    wvFldsFilled = checkWvFldsFilledMaxLimit(number); 
		serializeWvFldsFilled(wvFldsFilled);
	}
	
	public void setWvFldsFilled(int number) {
	    number = checkWvFldsFilledMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvFldsFilled((short)number);
	}
	public void setWvFldsFilled(long number) {
	    number = checkWvFldsFilledMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvFldsFilled((short)number);
	}
	

	/**
	 * 	Update WvFldsFilled with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvFldsFilled(char[] value) throws CFException {
		 wvFldsFilled = serializeWvFldsFilled(value);
	}
	/**
	 * 	Update WvFldsFilled with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvFldsFilledString(char[] value) throws CFException {
		 setWvFldsFilled(value);
	}
	/**
	 *	Returns the value of wvStartPosn
	 *	@return wvStartPosn
	 */
	public short getWvStartPosn() throws CFException {
       if (isWvStartPosnModified()) { 
           wvStartPosn = refreshWvStartPosn();
        }
   		return wvStartPosn;
	}
	

    /**
	 *	Returns the String value of wvStartPosn
	 *	@return wvStartPosn
	 */
	public char[]  getWvStartPosnActualString() {
	    String value = String.valueOf(wvStartPosn).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update WvStartPosn with the passed value
	 *  Corresponding COBOL Variable is WV-START-POSN
	 *	@param number
	 */
	public void setWvStartPosn(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    wvStartPosn = checkWvStartPosnMaxLimit(number); 
		serializeWvStartPosn(wvStartPosn);
	}
	
	public void setWvStartPosn(int number) {
	    number = checkWvStartPosnMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvStartPosn((short)number);
	}
	public void setWvStartPosn(long number) {
	    number = checkWvStartPosnMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvStartPosn((short)number);
	}
	

	/**
	 * 	Update WvStartPosn with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvStartPosn(char[] value) throws CFException {
		 wvStartPosn = serializeWvStartPosn(value);
	}
	/**
	 * 	Update WvStartPosn with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvStartPosnString(char[] value) throws CFException {
		 setWvStartPosn(value);
	}
	/**
	 *	Returns the value of wvCommaNdx
	 *	@return wvCommaNdx
	 */
	public short getWvCommaNdx() throws CFException {
       if (isWvCommaNdxModified()) { 
           wvCommaNdx = refreshWvCommaNdx();
        }
   		return wvCommaNdx;
	}
	

    /**
	 *	Returns the String value of wvCommaNdx
	 *	@return wvCommaNdx
	 */
	public char[]  getWvCommaNdxActualString() {
	    String value = String.valueOf(wvCommaNdx).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update WvCommaNdx with the passed value
	 *  Corresponding COBOL Variable is WV-COMMA-NDX
	 *	@param number
	 */
	public void setWvCommaNdx(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    wvCommaNdx = checkWvCommaNdxMaxLimit(number); 
		serializeWvCommaNdx(wvCommaNdx);
	}
	
	public void setWvCommaNdx(int number) {
	    number = checkWvCommaNdxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvCommaNdx((short)number);
	}
	public void setWvCommaNdx(long number) {
	    number = checkWvCommaNdxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvCommaNdx((short)number);
	}
	

	/**
	 * 	Update WvCommaNdx with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvCommaNdx(char[] value) throws CFException {
		 wvCommaNdx = serializeWvCommaNdx(value);
	}
	/**
	 * 	Update WvCommaNdx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvCommaNdxString(char[] value) throws CFException {
		 setWvCommaNdx(value);
	}
	/**
	 *	Returns the value of wvToNdx
	 *	@return wvToNdx
	 */
	public short getWvToNdx() throws CFException {
       if (isWvToNdxModified()) { 
           wvToNdx = refreshWvToNdx();
        }
   		return wvToNdx;
	}
	

    /**
	 *	Returns the String value of wvToNdx
	 *	@return wvToNdx
	 */
	public char[]  getWvToNdxActualString() {
	    String value = String.valueOf(wvToNdx).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update WvToNdx with the passed value
	 *  Corresponding COBOL Variable is WV-TO-NDX
	 *	@param number
	 */
	public void setWvToNdx(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    wvToNdx = checkWvToNdxMaxLimit(number); 
		serializeWvToNdx(wvToNdx);
	}
	
	public void setWvToNdx(int number) {
	    number = checkWvToNdxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvToNdx((short)number);
	}
	public void setWvToNdx(long number) {
	    number = checkWvToNdxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvToNdx((short)number);
	}
	

	/**
	 * 	Update WvToNdx with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvToNdx(char[] value) throws CFException {
		 wvToNdx = serializeWvToNdx(value);
	}
	/**
	 * 	Update WvToNdx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvToNdxString(char[] value) throws CFException {
		 setWvToNdx(value);
	}
	/**
	 *	Returns the value of wvFromNdx
	 *	@return wvFromNdx
	 */
	public short getWvFromNdx() throws CFException {
       if (isWvFromNdxModified()) { 
           wvFromNdx = refreshWvFromNdx();
        }
   		return wvFromNdx;
	}
	

    /**
	 *	Returns the String value of wvFromNdx
	 *	@return wvFromNdx
	 */
	public char[]  getWvFromNdxActualString() {
	    String value = String.valueOf(wvFromNdx).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update WvFromNdx with the passed value
	 *  Corresponding COBOL Variable is WV-FROM-NDX
	 *	@param number
	 */
	public void setWvFromNdx(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    wvFromNdx = checkWvFromNdxMaxLimit(number); 
		serializeWvFromNdx(wvFromNdx);
	}
	
	public void setWvFromNdx(int number) {
	    number = checkWvFromNdxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvFromNdx((short)number);
	}
	public void setWvFromNdx(long number) {
	    number = checkWvFromNdxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvFromNdx((short)number);
	}
	

	/**
	 * 	Update WvFromNdx with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvFromNdx(char[] value) throws CFException {
		 wvFromNdx = serializeWvFromNdx(value);
	}
	/**
	 * 	Update WvFromNdx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvFromNdxString(char[] value) throws CFException {
		 setWvFromNdx(value);
	}
	/**
	 *	Returns the value of wvDltr1
	 *	@return wvDltr1
	 */
   public char[] getWvDltr1() throws CFException{
   		return wvDltr1;
   }

  
	/**
	*  set variable wvDltr1
	*  Corresponding COBOL Variable is WV-DLTR-1
	*  @param value
	**/
   public void setWvDltr1(char[] value) {
       value = checkWvDltr1Constraints(value);
       arraycopy(value,0,wvDltr1,0,value.length);
   } 
	public void setWvDltr1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wvDltr1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of filler
	 *	@return filler
	 */
   public char[] getFiller() throws CFException{
   		return filler;
   }

  
	/**
	*  set variable filler
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setFiller(char[] value) {
       value = checkFillerConstraints(value);
       arraycopy(value,0,filler,0,value.length);
   } 
	public void setFiller(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,filler,0,beginIndex + endIndex);
   }
	char[] wvNumericOk88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isWvNumericOk()
	 *	@return  Returns true if isWvNumericOk() is " "
	 */
   public boolean isWvNumericOk() throws CFException {
      return (  compareChars( getFiller() , wvNumericOk88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setWvNumericOkTrue() {  			
    	setFiller( wvNumericOk88Value);
   	}
	char[] wvNumericNotOk88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isWvNumericNotOk()
	 *	@return  Returns true if isWvNumericNotOk() is "N"
	 */
   public boolean isWvNumericNotOk() throws CFException {
      return (  compareChars( getFiller() , wvNumericNotOk88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setWvNumericNotOkTrue() {  			
    	setFiller( wvNumericNotOk88Value);
   	}
	/**
	 *	Returns the value of filler01
	 *	@return filler01
	 */
   public char[] getFiller01() throws CFException{
   		return filler01;
   }

  
	/**
	*  set variable filler01
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setFiller01(char[] value) {
       value = checkFiller01Constraints(value);
       arraycopy(value,0,filler01,0,value.length);
   } 
	public void setFiller01(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,filler01,0,beginIndex + endIndex);
   }
	char[] wvIntPartOk88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isWvIntPartOk()
	 *	@return  Returns true if isWvIntPartOk() is " "
	 */
   public boolean isWvIntPartOk() throws CFException {
      return (  compareChars( getFiller01() , wvIntPartOk88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setWvIntPartOkTrue() {  			
    	setFiller01( wvIntPartOk88Value);
   	}
	char[] wvIntPartNotOk88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isWvIntPartNotOk()
	 *	@return  Returns true if isWvIntPartNotOk() is "N"
	 */
   public boolean isWvIntPartNotOk() throws CFException {
      return (  compareChars( getFiller01() , wvIntPartNotOk88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setWvIntPartNotOkTrue() {  			
    	setFiller01( wvIntPartNotOk88Value);
   	}
	/**
	 *	Returns the value of filler02
	 *	@return filler02
	 */
   public char[] getFiller02() throws CFException{
   		return filler02;
   }

  
	/**
	*  set variable filler02
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setFiller02(char[] value) {
       value = checkFiller02Constraints(value);
       arraycopy(value,0,filler02,0,value.length);
   } 
	public void setFiller02(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,filler02,0,beginIndex + endIndex);
   }
	char[] wvDecPartOk88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isWvDecPartOk()
	 *	@return  Returns true if isWvDecPartOk() is " "
	 */
   public boolean isWvDecPartOk() throws CFException {
      return (  compareChars( getFiller02() , wvDecPartOk88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setWvDecPartOkTrue() {  			
    	setFiller02( wvDecPartOk88Value);
   	}
	char[] wvDecPartNotOk88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isWvDecPartNotOk()
	 *	@return  Returns true if isWvDecPartNotOk() is "N"
	 */
   public boolean isWvDecPartNotOk() throws CFException {
      return (  compareChars( getFiller02() , wvDecPartNotOk88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setWvDecPartNotOkTrue() {  			
    	setFiller02( wvDecPartNotOk88Value);
   	}
	/**
	 *	Returns the value of filler03
	 *	@return filler03
	 */
   public char[] getFiller03() throws CFException{
   		return filler03;
   }

  
	/**
	*  set variable filler03
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setFiller03(char[] value) {
       value = checkFiller03Constraints(value);
       arraycopy(value,0,filler03,0,value.length);
   } 
	public void setFiller03(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,filler03,0,beginIndex + endIndex);
   }
	char[] wvPositive88Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isWvPositive()
	 *	@return  Returns true if isWvPositive() is "P"
	 */
   public boolean isWvPositive() throws CFException {
      return (  compareChars( getFiller03() , wvPositive88Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setWvPositiveTrue() {  			
    	setFiller03( wvPositive88Value);
   	}
	char[] wvNegative88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isWvNegative()
	 *	@return  Returns true if isWvNegative() is "N"
	 */
   public boolean isWvNegative() throws CFException {
      return (  compareChars( getFiller03() , wvNegative88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setWvNegativeTrue() {  			
    	setFiller03( wvNegative88Value);
   	}
	/**
	 *	Returns the value of wvExposureCount
	 *	@return wvExposureCount
	 */
	public short getWvExposureCount() throws CFException {
   		return wvExposureCount;
	}
	
	/**
	 * 	Update WvExposureCount with the passed value
	 *  Corresponding COBOL Variable is WV-EXPOSURE-COUNT
	 *	@param number
	 */
	public void setWvExposureCount(short number) {
	     // Truncate if the number is beyond +/- Max range
	    wvExposureCount = checkWvExposureCountMaxLimit(number); 
	}

	public void setWvExposureCount(int number) {
	    number = checkWvExposureCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvExposureCount((short)number);
	}
	public void setWvExposureCount(long number) {
	    number = checkWvExposureCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvExposureCount((short)number);
	}
	

	/**
	 *	Returns the value of wvSeqNum
	 *	@return wvSeqNum
	 */
	public short getWvSeqNum() throws CFException {
   		return wvSeqNum;
	}
	
	/**
	 * 	Update WvSeqNum with the passed value
	 *  Corresponding COBOL Variable is WV-SEQ-NUM
	 *	@param number
	 */
	public void setWvSeqNum(short number) {
	     // Truncate if the number is beyond +/- Max range
	    wvSeqNum = checkWvSeqNumMaxLimit(number); 
	}

	public void setWvSeqNum(int number) {
	    number = checkWvSeqNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvSeqNum((short)number);
	}
	public void setWvSeqNum(long number) {
	    number = checkWvSeqNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWvSeqNum((short)number);
	}
	

	/**
	 *	Returns the value of wvKbblVol
	 *	@return wvKbblVol
	 */
   public char[] getWvKbblVol() throws CFException{
     if (isWvKbblVolModified()) { 
        wvKbblVol = refreshWvKbblVol();
     }
   		return wvKbblVol;
   }

  
	/**
	*  set variable wvKbblVol
	*  Corresponding COBOL Variable is WV-KBBL-VOL
	*  @param value
	**/
   public void setWvKbblVol(char[] value) {
      wvKbblVol = checkWvKbblVolConstraints(value);
      serializeWvKbblVol(wvKbblVol);
   } 

     /**
	 * 	Update WvKbblVol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvKbblVol(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvKbblVol,wvKbblVol.length);
   	
   }
   
   public void setWvKbblVol(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvKbblVol,wvKbblVol.length);
   	
   }
   
     /**
	 * 	Update WvKbblVol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvKbblVol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvKbblVol+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvKbblVol with another Field
	 *	@param value
	 */
   public void setWvKbblVol(Field source) {
       replace(source,0,source.length(),beginWvKbblVol,WV_KBBL_VOL_LEN);
   	
   }  
   
     /**
	 * 	Update WvKbblVol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvKbblVol(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvKbblVol,WV_KBBL_VOL_LEN);
   	
   }
   
     /**
	 * 	Update WvKbblVol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvKbblVol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvKbblVol+targetIndex,targetLen);
    
   }
	public BigDecimal getPrclexpKbblVol() throws CFException {
        if (isPrclexpKbblVolModified()) { 
           prclexpKbblVol = refreshPrclexpKbblVol();
        }
   		return prclexpKbblVol;
	}

    public char[] getPrclexpKbblVolString() {
          return  prclexpKbblVolString();
    }
	
	/**
	 * 	Update PrclexpKbblVol with the passed number
	 *  Corresponding COBOL Variable is PRCLEXP-KBBL-VOL
	 *	@param number
	 */
	public void setPrclexpKbblVol(BigDecimal number) {	
     prclexpKbblVol = checkPrclexpKbblVolMaxLimit(number);
	    serializePrclexpKbblVol(prclexpKbblVol);
   }
	/**
	 *	Returns the value of wxUserQuantity
	 *	@return wxUserQuantity
	 */
   public char[] getWxUserQuantity() throws CFException{
     if (isWxUserQuantityModified()) { 
        wxUserQuantity = refreshWxUserQuantity();
     }
   		return wxUserQuantity;
   }

  
	/**
	*  set variable wxUserQuantity
	*  Corresponding COBOL Variable is WX-USER-QUANTITY
	*  @param value
	**/
   public void setWxUserQuantity(char[] value) {
      wxUserQuantity = checkWxUserQuantityConstraints(value);
      serializeWxUserQuantity(wxUserQuantity);
   } 

     /**
	 * 	Update WxUserQuantity 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxUserQuantity(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxUserQuantity,wxUserQuantity.length);
   	
   }
   
   public void setWxUserQuantity(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxUserQuantity,wxUserQuantity.length);
   	
   }
   
     /**
	 * 	Update WxUserQuantity 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxUserQuantity(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxUserQuantity+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxUserQuantity with another Field
	 *	@param value
	 */
   public void setWxUserQuantity(Field source) {
       replace(source,0,source.length(),beginWxUserQuantity,WX_USER_QUANTITY_LEN);
   	
   }  
   
     /**
	 * 	Update WxUserQuantity 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxUserQuantity(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxUserQuantity,WX_USER_QUANTITY_LEN);
   	
   }
   
     /**
	 * 	Update WxUserQuantity 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxUserQuantity(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxUserQuantity+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wpFmseLmtKtN
	 *	@return wpFmseLmtKtN
	 */
   public char[] getWpFmseLmtKtN() throws CFException{
     if (isWpFmseLmtKtNModified()) { 
        wpFmseLmtKtN = refreshWpFmseLmtKtN();
     }
   		return wpFmseLmtKtN;
   }

  
	/**
	*  set variable wpFmseLmtKtN
	*  Corresponding COBOL Variable is WP-FMSE-LMT-KT-N
	*  @param value
	**/
   public void setWpFmseLmtKtN(char[] value) {
      wpFmseLmtKtN = checkWpFmseLmtKtNConstraints(value);
      serializeWpFmseLmtKtN(wpFmseLmtKtN);
   } 

     /**
	 * 	Update WpFmseLmtKtN 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpFmseLmtKtN(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWpFmseLmtKtN,wpFmseLmtKtN.length);
   	
   }
   
   public void setWpFmseLmtKtN(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWpFmseLmtKtN,wpFmseLmtKtN.length);
   	
   }
   
     /**
	 * 	Update WpFmseLmtKtN 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpFmseLmtKtN(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpFmseLmtKtN+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WpFmseLmtKtN with another Field
	 *	@param value
	 */
   public void setWpFmseLmtKtN(Field source) {
       replace(source,0,source.length(),beginWpFmseLmtKtN,WP_FMSE_LMT_KT_N_LEN);
   	
   }  
   
     /**
	 * 	Update WpFmseLmtKtN 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpFmseLmtKtN(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWpFmseLmtKtN,WP_FMSE_LMT_KT_N_LEN);
   	
   }
   
     /**
	 * 	Update WpFmseLmtKtN 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpFmseLmtKtN(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpFmseLmtKtN+targetIndex,targetLen);
    
   }
	public BigDecimal getTrdgauthQuantityAuthA() throws CFException {
        if (isTrdgauthQuantityAuthAModified()) { 
           trdgauthQuantityAuthA = refreshTrdgauthQuantityAuthA();
        }
   		return trdgauthQuantityAuthA;
	}

    public char[] getTrdgauthQuantityAuthAString() {
          return  trdgauthQuantityAuthAString();
    }
	
	/**
	 * 	Update TrdgauthQuantityAuthA with the passed number
	 *  Corresponding COBOL Variable is TRDGAUTH-QUANTITY-AUTH-A
	 *	@param number
	 */
	public void setTrdgauthQuantityAuthA(BigDecimal number) {	
     trdgauthQuantityAuthA = checkTrdgauthQuantityAuthAMaxLimit(number);
	    serializeTrdgauthQuantityAuthA(trdgauthQuantityAuthA);
   }
	/**
	 *	Returns the value of wvBtfFactor
	 *	@return wvBtfFactor
	 */
	public BigDecimal getWvBtfFactor() throws CFException {
       if (isWvBtfFactorModified()) { 
           wvBtfFactor = refreshWvBtfFactor();
        }
   		return wvBtfFactor;
	}
	

	
	   
	/**
	 * 	Update WvBtfFactor with the passed number
	 *  Corresponding COBOL Variable is WV-BTF-FACTOR
	 *	@param number
	 */
	public void setWvBtfFactor(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       wvBtfFactor = checkWvBtfFactorMaxLimit(number);
	    serializeWvBtfFactor(wvBtfFactor);
   }
	/**
	 * 	Update WvBtfFactor with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvBtfFactor(char[] value) throws CFException {
		 wvBtfFactor = serializeWvBtfFactor(value);
	}   
	public BigDecimal getWvDBblVol() throws CFException {
        if (isWvDBblVolModified()) { 
           wvDBblVol = refreshWvDBblVol();
        }
   		return wvDBblVol;
	}

    public char[] getWvDBblVolString() {
          return  wvDBblVolString();
    }
	
	/**
	 * 	Update WvDBblVol with the passed number
	 *  Corresponding COBOL Variable is WV-D-BBL-VOL
	 *	@param number
	 */
	public void setWvDBblVol(BigDecimal number) {	
     wvDBblVol = checkWvDBblVolMaxLimit(number);
	    serializeWvDBblVol(wvDBblVol);
   }
	public BigDecimal getWvDBarrels() throws CFException {
        if (isWvDBarrelsModified()) { 
           wvDBarrels = refreshWvDBarrels();
        }
   		return wvDBarrels;
	}

    public char[] getWvDBarrelsString() {
          return  wvDBarrelsString();
    }
	
	/**
	 * 	Update WvDBarrels with the passed number
	 *  Corresponding COBOL Variable is WV-D-BARRELS
	 *	@param number
	 */
	public void setWvDBarrels(BigDecimal number) {	
     wvDBarrels = checkWvDBarrelsMaxLimit(number);
	    serializeWvDBarrels(wvDBarrels);
   }
	/**
	 *	Returns the value of wpDBarrels
	 *	@return wpDBarrels
	 */
   public char[] getWpDBarrels() throws CFException{
     if (isWpDBarrelsModified()) { 
        wpDBarrels = refreshWpDBarrels();
     }
   		return wpDBarrels;
   }

  
	/**
	*  set variable wpDBarrels
	*  Corresponding COBOL Variable is WP-D-BARRELS
	*  @param value
	**/
   public void setWpDBarrels(char[] value) {
      wpDBarrels = checkWpDBarrelsConstraints(value);
      serializeWpDBarrels(wpDBarrels);
   } 

     /**
	 * 	Update WpDBarrels 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpDBarrels(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWpDBarrels,wpDBarrels.length);
   	
   }
   
   public void setWpDBarrels(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWpDBarrels,wpDBarrels.length);
   	
   }
   
     /**
	 * 	Update WpDBarrels 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpDBarrels(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpDBarrels+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WpDBarrels with another Field
	 *	@param value
	 */
   public void setWpDBarrels(Field source) {
       replace(source,0,source.length(),beginWpDBarrels,WP_DBARRELS_LEN);
   	
   }  
   
     /**
	 * 	Update WpDBarrels 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpDBarrels(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWpDBarrels,WP_DBARRELS_LEN);
   	
   }
   
     /**
	 * 	Update WpDBarrels 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpDBarrels(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpDBarrels+targetIndex,targetLen);
    
   }
	public BigDecimal getWvDMtAmt() throws CFException {
        if (isWvDMtAmtModified()) { 
           wvDMtAmt = refreshWvDMtAmt();
        }
   		return wvDMtAmt;
	}

    public char[] getWvDMtAmtString() {
          return  wvDMtAmtString();
    }
	
	/**
	 * 	Update WvDMtAmt with the passed number
	 *  Corresponding COBOL Variable is WV-D-MT-AMT
	 *	@param number
	 */
	public void setWvDMtAmt(BigDecimal number) {	
     wvDMtAmt = checkWvDMtAmtMaxLimit(number);
	    serializeWvDMtAmt(wvDMtAmt);
   }
	public BigDecimal getWvEffWeightPc() throws CFException {
        if (isWvEffWeightPcModified()) { 
           wvEffWeightPc = refreshWvEffWeightPc();
        }
   		return wvEffWeightPc;
	}

    public char[] getWvEffWeightPcString() {
          return  wvEffWeightPcString();
    }
	
	/**
	 * 	Update WvEffWeightPc with the passed number
	 *  Corresponding COBOL Variable is WV-EFF-WEIGHT-PC
	 *	@param number
	 */
	public void setWvEffWeightPc(BigDecimal number) {	
     wvEffWeightPc = checkWvEffWeightPcMaxLimit(number);
	    serializeWvEffWeightPc(wvEffWeightPc);
   }
	public BigDecimal getDealgpalAllocWgtnNum() throws CFException {
        if (isDealgpalAllocWgtnNumModified()) { 
           dealgpalAllocWgtnNum = refreshDealgpalAllocWgtnNum();
        }
   		return dealgpalAllocWgtnNum;
	}

    public char[] getDealgpalAllocWgtnNumString() {
          return  dealgpalAllocWgtnNumString();
    }
	
	/**
	 * 	Update DealgpalAllocWgtnNum with the passed number
	 *  Corresponding COBOL Variable is DEALGPAL-ALLOC-WGTN-NUM
	 *	@param number
	 */
	public void setDealgpalAllocWgtnNum(BigDecimal number) {	
     dealgpalAllocWgtnNum = checkDealgpalAllocWgtnNumMaxLimit(number);
	    serializeDealgpalAllocWgtnNum(dealgpalAllocWgtnNum);
   }
	public BigDecimal getParcelBblVol() throws CFException {
        if (isParcelBblVolModified()) { 
           parcelBblVol = refreshParcelBblVol();
        }
   		return parcelBblVol;
	}

    public char[] getParcelBblVolString() {
          return  parcelBblVolString();
    }
	
	/**
	 * 	Update ParcelBblVol with the passed number
	 *  Corresponding COBOL Variable is PARCEL-BBL-VOL
	 *	@param number
	 */
	public void setParcelBblVol(BigDecimal number) {	
     parcelBblVol = checkParcelBblVolMaxLimit(number);
	    serializeParcelBblVol(parcelBblVol);
   }
	public BigDecimal getWvDQty() throws CFException {
        if (isWvDQtyModified()) { 
           wvDQty = refreshWvDQty();
        }
   		return wvDQty;
	}

    public char[] getWvDQtyString() {
          return  wvDQtyString();
    }
	
	/**
	 * 	Update WvDQty with the passed number
	 *  Corresponding COBOL Variable is WV-D-QTY
	 *	@param number
	 */
	public void setWvDQty(BigDecimal number) {	
     wvDQty = checkWvDQtyMaxLimit(number);
	    serializeWvDQty(wvDQty);
   }
	/**
	 *	Returns the value of wpDQty
	 *	@return wpDQty
	 */
   public char[] getWpDQty() throws CFException{
     if (isWpDQtyModified()) { 
        wpDQty = refreshWpDQty();
     }
   		return wpDQty;
   }

  
	/**
	*  set variable wpDQty
	*  Corresponding COBOL Variable is WP-D-QTY
	*  @param value
	**/
   public void setWpDQty(char[] value) {
      wpDQty = checkWpDQtyConstraints(value);
      serializeWpDQty(wpDQty);
   } 

     /**
	 * 	Update WpDQty 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpDQty(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWpDQty,wpDQty.length);
   	
   }
   
   public void setWpDQty(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWpDQty,wpDQty.length);
   	
   }
   
     /**
	 * 	Update WpDQty 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpDQty(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpDQty+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WpDQty with another Field
	 *	@param value
	 */
   public void setWpDQty(Field source) {
       replace(source,0,source.length(),beginWpDQty,WP_DQTY_LEN);
   	
   }  
   
     /**
	 * 	Update WpDQty 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpDQty(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWpDQty,WP_DQTY_LEN);
   	
   }
   
     /**
	 * 	Update WpDQty 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpDQty(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWpDQty+targetIndex,targetLen);
    
   }
	public BigDecimal getWvMmbConv() throws CFException {
        if (isWvMmbConvModified()) { 
           wvMmbConv = refreshWvMmbConv();
        }
   		return wvMmbConv;
	}

    public char[] getWvMmbConvString() {
          return  wvMmbConvString();
    }
	
	/**
	 * 	Update WvMmbConv with the passed number
	 *  Corresponding COBOL Variable is WV-MMB-CONV
	 *	@param number
	 */
	public void setWvMmbConv(BigDecimal number) {	
     wvMmbConv = checkWvMmbConvMaxLimit(number);
	    serializeWvMmbConv(wvMmbConv);
   }
	public BigDecimal getWvDTonnes() throws CFException {
        if (isWvDTonnesModified()) { 
           wvDTonnes = refreshWvDTonnes();
        }
   		return wvDTonnes;
	}

    public char[] getWvDTonnesString() {
          return  wvDTonnesString();
    }
	
	/**
	 * 	Update WvDTonnes with the passed number
	 *  Corresponding COBOL Variable is WV-D-TONNES
	 *	@param number
	 */
	public void setWvDTonnes(BigDecimal number) {	
     wvDTonnes = checkWvDTonnesMaxLimit(number);
	    serializeWvDTonnes(wvDTonnes);
   }
	public int getWvExposureInt() throws CFException {
        if (isWvExposureIntModified()) { 
           wvExposureInt = refreshWvExposureInt();
        }
   		return wvExposureInt;
	}
	
	/**
	 * 	Update WvExposureInt with the passed value
	 *  Corresponding COBOL Variable is WV-EXPOSURE-INT
	 *	@param number
	 */
	public void setWvExposureInt(int number) {
			wvExposureInt = checkWvExposureIntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeWvExposureInt(wvExposureInt);
	}


	public void setWvExposureInt(long number) {
	    number = checkWvExposureIntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWvExposureInt((int)number);
	}
	
	public BigDecimal getWvExposureAmt() throws CFException {
        if (isWvExposureAmtModified()) { 
           wvExposureAmt = refreshWvExposureAmt();
        }
   		return wvExposureAmt;
	}

    public char[] getWvExposureAmtString() {
          return  wvExposureAmtString();
    }
	
	/**
	 * 	Update WvExposureAmt with the passed number
	 *  Corresponding COBOL Variable is WV-EXPOSURE-AMT
	 *	@param number
	 */
	public void setWvExposureAmt(BigDecimal number) {	
     wvExposureAmt = checkWvExposureAmtMaxLimit(number);
	    serializeWvExposureAmt(wvExposureAmt);
   }
	public BigDecimal getWvUsdBblVariance() throws CFException {
        if (isWvUsdBblVarianceModified()) { 
           wvUsdBblVariance = refreshWvUsdBblVariance();
        }
   		return wvUsdBblVariance;
	}

    public char[] getWvUsdBblVarianceString() {
          return  wvUsdBblVarianceString();
    }
	
	/**
	 * 	Update WvUsdBblVariance with the passed number
	 *  Corresponding COBOL Variable is WV-USD-BBL-VARIANCE
	 *	@param number
	 */
	public void setWvUsdBblVariance(BigDecimal number) {	
     wvUsdBblVariance = checkWvUsdBblVarianceMaxLimit(number);
	    serializeWvUsdBblVariance(wvUsdBblVariance);
   }
	public BigDecimal getWvOrigCost() throws CFException {
        if (isWvOrigCostModified()) { 
           wvOrigCost = refreshWvOrigCost();
        }
   		return wvOrigCost;
	}

    public char[] getWvOrigCostString() {
          return  wvOrigCostString();
    }
	
	/**
	 * 	Update WvOrigCost with the passed number
	 *  Corresponding COBOL Variable is WV-ORIG-COST
	 *	@param number
	 */
	public void setWvOrigCost(BigDecimal number) {	
     wvOrigCost = checkWvOrigCostMaxLimit(number);
	    serializeWvOrigCost(wvOrigCost);
   }
	public BigDecimal getWvLtstCost() throws CFException {
        if (isWvLtstCostModified()) { 
           wvLtstCost = refreshWvLtstCost();
        }
   		return wvLtstCost;
	}

    public char[] getWvLtstCostString() {
          return  wvLtstCostString();
    }
	
	/**
	 * 	Update WvLtstCost with the passed number
	 *  Corresponding COBOL Variable is WV-LTST-COST
	 *	@param number
	 */
	public void setWvLtstCost(BigDecimal number) {	
     wvLtstCost = checkWvLtstCostMaxLimit(number);
	    serializeWvLtstCost(wvLtstCost);
   }
	/**
	 *	Returns the value of wvExtrBblVar
	 *	@return wvExtrBblVar
	 */
   public char[] getWvExtrBblVar() throws CFException{
     if (isWvExtrBblVarModified()) { 
        wvExtrBblVar = refreshWvExtrBblVar();
     }
   		return wvExtrBblVar;
   }

  
	/**
	*  set variable wvExtrBblVar
	*  Corresponding COBOL Variable is WV-EXTR-BBL-VAR
	*  @param value
	**/
   public void setWvExtrBblVar(char[] value) {
      wvExtrBblVar = checkWvExtrBblVarConstraints(value);
      serializeWvExtrBblVar(wvExtrBblVar);
   } 

     /**
	 * 	Update WvExtrBblVar 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrBblVar(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrBblVar,wvExtrBblVar.length);
   	
   }
   
   public void setWvExtrBblVar(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrBblVar,wvExtrBblVar.length);
   	
   }
   
     /**
	 * 	Update WvExtrBblVar 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrBblVar(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrBblVar+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrBblVar with another Field
	 *	@param value
	 */
   public void setWvExtrBblVar(Field source) {
       replace(source,0,source.length(),beginWvExtrBblVar,WV_EXTR_BBL_VAR_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrBblVar 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrBblVar(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrBblVar,WV_EXTR_BBL_VAR_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrBblVar 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrBblVar(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrBblVar+targetIndex,targetLen);
    
   }
	public BigDecimal getWvUsdVariance() throws CFException {
        if (isWvUsdVarianceModified()) { 
           wvUsdVariance = refreshWvUsdVariance();
        }
   		return wvUsdVariance;
	}

    public char[] getWvUsdVarianceString() {
          return  wvUsdVarianceString();
    }
	
	/**
	 * 	Update WvUsdVariance with the passed number
	 *  Corresponding COBOL Variable is WV-USD-VARIANCE
	 *	@param number
	 */
	public void setWvUsdVariance(BigDecimal number) {	
     wvUsdVariance = checkWvUsdVarianceMaxLimit(number);
	    serializeWvUsdVariance(wvUsdVariance);
   }
	/**
	 *	Returns the value of wvExtrUsdVar
	 *	@return wvExtrUsdVar
	 */
   public char[] getWvExtrUsdVar() throws CFException{
     if (isWvExtrUsdVarModified()) { 
        wvExtrUsdVar = refreshWvExtrUsdVar();
     }
   		return wvExtrUsdVar;
   }

  
	/**
	*  set variable wvExtrUsdVar
	*  Corresponding COBOL Variable is WV-EXTR-USD-VAR
	*  @param value
	**/
   public void setWvExtrUsdVar(char[] value) {
      wvExtrUsdVar = checkWvExtrUsdVarConstraints(value);
      serializeWvExtrUsdVar(wvExtrUsdVar);
   } 

     /**
	 * 	Update WvExtrUsdVar 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrUsdVar(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrUsdVar,wvExtrUsdVar.length);
   	
   }
   
   public void setWvExtrUsdVar(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrUsdVar,wvExtrUsdVar.length);
   	
   }
   
     /**
	 * 	Update WvExtrUsdVar 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrUsdVar(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrUsdVar+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrUsdVar with another Field
	 *	@param value
	 */
   public void setWvExtrUsdVar(Field source) {
       replace(source,0,source.length(),beginWvExtrUsdVar,WV_EXTR_USD_VAR_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrUsdVar 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrUsdVar(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrUsdVar,WV_EXTR_USD_VAR_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrUsdVar 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrUsdVar(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrUsdVar+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public int getIdx() throws CFException {
       if (isIdxModified()) { 
           idx = refreshIdx();
        }
   		return idx;
	}
	

	
	   
	/**
	 * 	Update Idx with the passed value
	 *  Corresponding COBOL Variable is WS-IDX
	 *	@param number
	 */
	public void setIdx(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    idx = checkIdxMaxLimit(number); 
		serializeIdx(idx);
	}
	

	public void setIdx(long number) {
	    number = checkIdxMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIdx((int)number);
	}
	
	/**
	 * 	Update Idx with the passed value
	 *	@param value (String or char[])
	 */
	public void setIdx(char[] value) throws CFException {
		 idx = serializeIdx(value);
	}
	/**
	 * 	Update Idx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIdxString(char[] value) throws CFException {
		 setIdx(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
