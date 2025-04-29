package com.cloudframe.app.init1.dto.serialize;

/**
*  The class Rlu5fChrgCrdDtlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Rlu5fChrgCrdDtlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rlu5fChrgCrdDtlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLU_5F_CHRG_CRD_DTL_LENGTH = 1411;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlu5fRecId;
            protected  int beginRlu5fPgmId;
            protected  int beginRlu5fAccDesc;
            protected  int beginRlu5fAccAmount;
            protected  int beginRlu5fAccTypeInd;
            protected  int beginRlu5fAccessUsageDesc;
            protected  int beginRlu5fPlanChngCode;
            protected  int beginRlu5fPlanChgPerMonth;
            protected  int beginRlu5fPlanDays;
            protected  int beginRlu5fPlanChgInadvInd;
            protected  int beginRlu5fDiscountInd;
            protected  int beginRlu5fPlanType;
            protected  int beginRlu5fUnitType;
            protected  int beginRlu5fPlanId;
            protected  int beginRlu5fCurDelayInd;
            protected  int beginRlu5fDelayShareUsed;
            protected  int beginRlu5fDelayShareOvrage;
            protected  int beginRlu5fDiscAmount1;
            protected  int beginRlu5fDiscAmount2;
            protected  int beginRlu5fBoboVenderName;
            protected  int beginRlu5fBoboVenderNumber;
            protected  int beginRlu5fBoboServDesc;
            protected  int beginRlu5fBoboTaxAmt;
            protected  int beginRlu5fBoboSurAmt;
            protected  int beginRlu5fMsoNumOfPurchases;
            protected  int beginRlu5fMsoPurchaseDesc;
            protected  int beginRlu5fMsoDomainName;
            protected  int beginRlu5fDipLateFee;
            protected  int beginRlu5fDipFinChgDue;
            protected  int beginRlu5fDipFinChgPaid;
            protected  int beginRlu5fDipFinChgPastDue;
            protected  int beginRlu5fDipBalance;
            protected  int beginRlu5fDipFinChgBalance;
            protected  int beginRlu5fInstallPaymentNum;
            protected  int beginRlu5fTotInstallPayments;
            protected  int beginRlu5fDipLoanNumber;
            protected  int beginRlu5fAlpDelayedCapSw;
            protected  int beginRlu5fAlpUnitType;
            protected  int beginRlu5fDipSubTotal;
            protected  int beginRlu5fVzedgeInd;
            protected  int beginRlu5fVzedgeMsgInd;
           protected int beginRlu5fVzedgePaymtSched;
           protected static final int RLU_5F_VZEDGE_PAYMT_SCHED_SIZE = 24;
            protected  int beginRlu5fCellcryptRenewalDate;
            protected  int beginRlu5fCellcryptActionCode;
            protected  int beginRlu5fCellcryptUnitCost;
            protected  int beginRlu5fCellcryptTransactionDt;
            protected  int beginRlu5fCellcryptProrateInd;
            protected  int beginRlu5fSharedInd;
            protected  int beginRlu5fShareSet;
            protected  int beginRlu5fDevicePrice;
           protected int beginRlu5fDeviceTax;
           protected static final int RLU_5F_DEVICE_TAX_SIZE = 5;
            protected  int beginRlu5fCellcryptDiscAmt;
            protected  int beginRlu5fPlanAmountAfterDisc;
            protected  int beginRlu5fOnetimeNewInd;
            protected  int beginRlu5fOverageBillableQty;
            protected  int beginRlu5fOverageRate;
            protected  int beginRlu5fInstallLoanAmount;
            protected  int beginRlu5fVzedgePaymentInd;
            protected  int beginRlu5fAccntUsageAllow;
            protected  int beginRlu5fTaxSurchrgRecInd;
            protected  int beginRlu5fOnetimeEventType;
            protected  int beginRlu5fTaxSurchargeInd;
            protected  int beginRlu5fAcctPlanDetailDesc;
            protected  int beginRlu5fSplanCatCd;
            protected  int beginRlu5fServiceId;
            protected  int beginRlu5fBuyoutPaymentAmt;
            protected  int beginRlu5fSciProdId;
            protected  int beginRlu5fSubscriptionInd;
            protected  int beginRlu5fStateCd;
            protected  int beginRlu5fFootnoteCd;
	
	/**
	* Constructor for Rlu5fChrgCrdDtlSerialized
	**/
    public Rlu5fChrgCrdDtlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rlu5fChrgCrdDtlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fChrgCrdDtlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rlu5fChrgCrdDtlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Rlu5fChrgCrdDtlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Rlu5fChrgCrdDtlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLU_5F_CHRG_CRD_DTL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlu5fRecId = getStartOffset() + 0;	// set offset for serialization
  
             beginRlu5fPgmId = getStartOffset() + 2;	// set offset for serialization
  
  
  
             beginRlu5fAccDesc = getStartOffset() + 31;	// set offset for serialization
  
             beginRlu5fAccAmount = getStartOffset() + 81;	// set offset for serialization
  
             beginRlu5fAccTypeInd = getStartOffset() + 87;	// set offset for serialization
  
  
  
             beginRlu5fAccessUsageDesc = getStartOffset() + 105;	// set offset for serialization
  
             beginRlu5fPlanChngCode = getStartOffset() + 185;	// set offset for serialization
  
             beginRlu5fPlanChgPerMonth = getStartOffset() + 186;	// set offset for serialization
  
             beginRlu5fPlanDays = getStartOffset() + 192;	// set offset for serialization
  
             beginRlu5fPlanChgInadvInd = getStartOffset() + 194;	// set offset for serialization
  
             beginRlu5fDiscountInd = getStartOffset() + 195;	// set offset for serialization
  
             beginRlu5fPlanType = getStartOffset() + 196;	// set offset for serialization
  
             beginRlu5fUnitType = getStartOffset() + 198;	// set offset for serialization
  
             beginRlu5fPlanId = getStartOffset() + 200;	// set offset for serialization
  
             beginRlu5fCurDelayInd = getStartOffset() + 206;	// set offset for serialization
  
             beginRlu5fDelayShareUsed = getStartOffset() + 207;	// set offset for serialization
  
             beginRlu5fDelayShareOvrage = getStartOffset() + 213;	// set offset for serialization
  
             beginRlu5fDiscAmount1 = getStartOffset() + 219;	// set offset for serialization
  
             beginRlu5fDiscAmount2 = getStartOffset() + 225;	// set offset for serialization
  
             beginRlu5fBoboVenderName = getStartOffset() + 231;	// set offset for serialization
  
             beginRlu5fBoboVenderNumber = getStartOffset() + 241;	// set offset for serialization
  
             beginRlu5fBoboServDesc = getStartOffset() + 251;	// set offset for serialization
  
             beginRlu5fBoboTaxAmt = getStartOffset() + 291;	// set offset for serialization
  
             beginRlu5fBoboSurAmt = getStartOffset() + 297;	// set offset for serialization
  
             beginRlu5fMsoNumOfPurchases = getStartOffset() + 303;	// set offset for serialization
  
             beginRlu5fMsoPurchaseDesc = getStartOffset() + 307;	// set offset for serialization
  
  
             beginRlu5fMsoDomainName = getStartOffset() + 332;	// set offset for serialization
  
             beginRlu5fDipLateFee = getStartOffset() + 397;	// set offset for serialization
  
             beginRlu5fDipFinChgDue = getStartOffset() + 403;	// set offset for serialization
  
             beginRlu5fDipFinChgPaid = getStartOffset() + 409;	// set offset for serialization
  
             beginRlu5fDipFinChgPastDue = getStartOffset() + 415;	// set offset for serialization
  
             beginRlu5fDipBalance = getStartOffset() + 421;	// set offset for serialization
  
             beginRlu5fDipFinChgBalance = getStartOffset() + 427;	// set offset for serialization
  
             beginRlu5fInstallPaymentNum = getStartOffset() + 433;	// set offset for serialization
  
             beginRlu5fTotInstallPayments = getStartOffset() + 435;	// set offset for serialization
  
             beginRlu5fDipLoanNumber = getStartOffset() + 437;	// set offset for serialization
  
             beginRlu5fAlpDelayedCapSw = getStartOffset() + 447;	// set offset for serialization
  
             beginRlu5fAlpUnitType = getStartOffset() + 448;	// set offset for serialization
  
             beginRlu5fDipSubTotal = getStartOffset() + 450;	// set offset for serialization
  
             beginRlu5fVzedgeInd = getStartOffset() + 456;	// set offset for serialization
  
             beginRlu5fVzedgeMsgInd = getStartOffset() + 457;	// set offset for serialization
  
	        beginRlu5fVzedgePaymtSched = getStartOffset() + 458; // set offset for serialization
  
             beginRlu5fCellcryptRenewalDate = getStartOffset() + 650;	// set offset for serialization
  
  
             beginRlu5fCellcryptActionCode = getStartOffset() + 658;	// set offset for serialization
  
             beginRlu5fCellcryptUnitCost = getStartOffset() + 659;	// set offset for serialization
  
             beginRlu5fCellcryptTransactionDt = getStartOffset() + 665;	// set offset for serialization
  
  
             beginRlu5fCellcryptProrateInd = getStartOffset() + 673;	// set offset for serialization
  
             beginRlu5fSharedInd = getStartOffset() + 674;	// set offset for serialization
  
             beginRlu5fShareSet = getStartOffset() + 675;	// set offset for serialization
  
             beginRlu5fDevicePrice = getStartOffset() + 680;	// set offset for serialization
  
	        beginRlu5fDeviceTax = getStartOffset() + 686; // set offset for serialization
  
             beginRlu5fCellcryptDiscAmt = getStartOffset() + 966;	// set offset for serialization
  
             beginRlu5fPlanAmountAfterDisc = getStartOffset() + 979;	// set offset for serialization
  
             beginRlu5fOnetimeNewInd = getStartOffset() + 985;	// set offset for serialization
  
             beginRlu5fOverageBillableQty = getStartOffset() + 986;	// set offset for serialization
  
             beginRlu5fOverageRate = getStartOffset() + 993;	// set offset for serialization
  
             beginRlu5fInstallLoanAmount = getStartOffset() + 996;	// set offset for serialization
  
             beginRlu5fVzedgePaymentInd = getStartOffset() + 1002;	// set offset for serialization
  
             beginRlu5fAccntUsageAllow = getStartOffset() + 1003;	// set offset for serialization
  
             beginRlu5fTaxSurchrgRecInd = getStartOffset() + 1010;	// set offset for serialization
  
  
             beginRlu5fOnetimeEventType = getStartOffset() + 1019;	// set offset for serialization
  
             beginRlu5fTaxSurchargeInd = getStartOffset() + 1023;	// set offset for serialization
  
             beginRlu5fAcctPlanDetailDesc = getStartOffset() + 1024;	// set offset for serialization
  
  
  
             beginRlu5fSplanCatCd = getStartOffset() + 1294;	// set offset for serialization
  
             beginRlu5fServiceId = getStartOffset() + 1296;	// set offset for serialization
  
  
             beginRlu5fBuyoutPaymentAmt = getStartOffset() + 1319;	// set offset for serialization
  
             beginRlu5fSciProdId = getStartOffset() + 1325;	// set offset for serialization
  
             beginRlu5fSubscriptionInd = getStartOffset() + 1330;	// set offset for serialization
  
             beginRlu5fStateCd = getStartOffset() + 1331;	// set offset for serialization
  
             beginRlu5fFootnoteCd = getStartOffset() + 1333;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRlu5fRecIdCounter = -1;
     public boolean isRlu5fRecIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fRecIdCounter != sharedCounter;
         localRlu5fRecIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_REC_ID_LEN = 2;
	/**
	 * 	serialize this Rlu5fRecId
	 */
   protected void serializeRlu5fRecId(char[] rlu5fRecId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fRecId,0,getStringValue(),beginRlu5fRecId,RLU_5F_REC_ID_LEN);
       localRlu5fRecIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fRecIdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlu5fRecId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fRecId() {	 
   		return (substring(getStringValue(),beginRlu5fRecId,beginRlu5fRecId + RLU_5F_REC_ID_LEN));
   	}
     int localRlu5fPgmIdCounter = -1;
     public boolean isRlu5fPgmIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fPgmIdCounter != sharedCounter;
         localRlu5fPgmIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_PGM_ID_LEN = 10;
	/**
	 * 	serialize this Rlu5fPgmId
	 */
   protected void serializeRlu5fPgmId(char[] rlu5fPgmId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fPgmId,0,getStringValue(),beginRlu5fPgmId,RLU_5F_PGM_ID_LEN);
       localRlu5fPgmIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fPgmIdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshRlu5fPgmId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fPgmId() {	 
   		return (substring(getStringValue(),beginRlu5fPgmId,beginRlu5fPgmId + RLU_5F_PGM_ID_LEN));
   	}
     int localRlu5fAccDescCounter = -1;
     public boolean isRlu5fAccDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fAccDescCounter != sharedCounter;
         localRlu5fAccDescCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_ACC_DESC_LEN = 50;
	/**
	 * 	serialize this Rlu5fAccDesc
	 */
   protected void serializeRlu5fAccDesc(char[] rlu5fAccDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fAccDesc,0,getStringValue(),beginRlu5fAccDesc,RLU_5F_ACC_DESC_LEN);
       localRlu5fAccDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fAccDescConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshRlu5fAccDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fAccDesc() {	 
   		return (substring(getStringValue(),beginRlu5fAccDesc,beginRlu5fAccDesc + RLU_5F_ACC_DESC_LEN));
   	}
        int localRlu5fAccAmountCounter = -1;
        public boolean isRlu5fAccAmountModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fAccAmountCounter != sharedCounter;
           localRlu5fAccAmountCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fAccAmountIsNumeric() {
	      return decimalIsNumeric(beginRlu5fAccAmount,RLU_5F_ACC_AMOUNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fAccAmountString() {
            return getPackedString(beginRlu5fAccAmount,RLU_5F_ACC_AMOUNT_LEN);
         }
   protected static final int RLU_5F_ACC_AMOUNT_LEN = 6;
   protected static final int RLU_5F_ACC_AMOUNT_SCALE = 2;
  	/**
	 * 	serializeRlu5fAccAmount
	 */
	protected void serializeRlu5fAccAmount(BigDecimal rlu5fAccAmount) {
		   putDecimal(beginRlu5fAccAmount,rlu5fAccAmount,RLU_5F_ACC_AMOUNT_LEN,RLU_5F_ACC_AMOUNT_SCALE,true);
		 localRlu5fAccAmountCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fAccAmountMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu5fAccAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fAccAmount() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fAccAmount,RLU_5F_ACC_AMOUNT_LEN,RLU_5F_ACC_AMOUNT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fAccAmount", beginRlu5fAccAmount,RLU_5F_ACC_AMOUNT_LEN);
     }
   	}
     int localRlu5fAccTypeIndCounter = -1;
     public boolean isRlu5fAccTypeIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fAccTypeIndCounter != sharedCounter;
         localRlu5fAccTypeIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_ACC_TYPE_IND_LEN = 2;
	/**
	 * 	serialize this Rlu5fAccTypeInd
	 */
   protected void serializeRlu5fAccTypeInd(char[] rlu5fAccTypeInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fAccTypeInd,0,getStringValue(),beginRlu5fAccTypeInd,RLU_5F_ACC_TYPE_IND_LEN);
       localRlu5fAccTypeIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fAccTypeIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlu5fAccTypeInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fAccTypeInd() {	 
   		return (substring(getStringValue(),beginRlu5fAccTypeInd,beginRlu5fAccTypeInd + RLU_5F_ACC_TYPE_IND_LEN));
   	}
     int localRlu5fAccessUsageDescCounter = -1;
     public boolean isRlu5fAccessUsageDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fAccessUsageDescCounter != sharedCounter;
         localRlu5fAccessUsageDescCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_ACCESS_USAGE_DESC_LEN = 80;
	/**
	 * 	serialize this Rlu5fAccessUsageDesc
	 */
   protected void serializeRlu5fAccessUsageDesc(char[] rlu5fAccessUsageDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fAccessUsageDesc,0,getStringValue(),beginRlu5fAccessUsageDesc,RLU_5F_ACCESS_USAGE_DESC_LEN);
       localRlu5fAccessUsageDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fAccessUsageDescConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshRlu5fAccessUsageDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fAccessUsageDesc() {	 
   		return (substring(getStringValue(),beginRlu5fAccessUsageDesc,beginRlu5fAccessUsageDesc + RLU_5F_ACCESS_USAGE_DESC_LEN));
   	}
     int localRlu5fPlanChngCodeCounter = -1;
     public boolean isRlu5fPlanChngCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fPlanChngCodeCounter != sharedCounter;
         localRlu5fPlanChngCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_PLAN_CHNG_CODE_LEN = 1;
	/**
	 * 	serialize this Rlu5fPlanChngCode
	 */
   protected void serializeRlu5fPlanChngCode(char[] rlu5fPlanChngCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fPlanChngCode,0,getStringValue(),beginRlu5fPlanChngCode,RLU_5F_PLAN_CHNG_CODE_LEN);
       localRlu5fPlanChngCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fPlanChngCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRlu5fPlanChngCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fPlanChngCode() {	 
   		return (substring(getStringValue(),beginRlu5fPlanChngCode,beginRlu5fPlanChngCode + RLU_5F_PLAN_CHNG_CODE_LEN));
   	}
        int localRlu5fPlanChgPerMonthCounter = -1;
        public boolean isRlu5fPlanChgPerMonthModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fPlanChgPerMonthCounter != sharedCounter;
           localRlu5fPlanChgPerMonthCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fPlanChgPerMonthIsNumeric() {
	      return decimalIsNumeric(beginRlu5fPlanChgPerMonth,RLU_5F_PLAN_CHG_PER_MONTH_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fPlanChgPerMonthString() {
            return getPackedString(beginRlu5fPlanChgPerMonth,RLU_5F_PLAN_CHG_PER_MONTH_LEN);
         }
   protected static final int RLU_5F_PLAN_CHG_PER_MONTH_LEN = 6;
   protected static final int RLU_5F_PLAN_CHG_PER_MONTH_SCALE = 2;
  	/**
	 * 	serializeRlu5fPlanChgPerMonth
	 */
	protected void serializeRlu5fPlanChgPerMonth(BigDecimal rlu5fPlanChgPerMonth) {
		   putDecimal(beginRlu5fPlanChgPerMonth,rlu5fPlanChgPerMonth,RLU_5F_PLAN_CHG_PER_MONTH_LEN,RLU_5F_PLAN_CHG_PER_MONTH_SCALE,true);
		 localRlu5fPlanChgPerMonthCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fPlanChgPerMonthMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu5fPlanChgPerMonth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fPlanChgPerMonth() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fPlanChgPerMonth,RLU_5F_PLAN_CHG_PER_MONTH_LEN,RLU_5F_PLAN_CHG_PER_MONTH_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fPlanChgPerMonth", beginRlu5fPlanChgPerMonth,RLU_5F_PLAN_CHG_PER_MONTH_LEN);
     }
   	}
     int localRlu5fPlanDaysCounter = -1;
     public boolean isRlu5fPlanDaysModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fPlanDaysCounter != sharedCounter;
         localRlu5fPlanDaysCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fPlanDays
	 *	@return rlu5fPlanDays
	 */
	public char[]  getRlu5fPlanDaysString() {
	     return getCharArray(beginRlu5fPlanDays,RLU_5F_PLAN_DAYS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fPlanDaysIsNumeric() {
	    return isNumeric(beginRlu5fPlanDays
	                    ,beginRlu5fPlanDays + RLU_5F_PLAN_DAYS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_PLAN_DAYS_LEN = 2;
  	/**
	 * serializeRlu5fPlanDays
	 */
	protected void serializeRlu5fPlanDays(int rlu5fPlanDays) {
		 putNumber(beginRlu5fPlanDays,rlu5fPlanDays,RLU_5F_PLAN_DAYS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fPlanDaysCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fPlanDays
	 */
   	protected  int serializeRlu5fPlanDays(char[] value) {
	    int  rlu5fPlanDays;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fPlanDays = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fPlanDays
		       ,2
		      );
		 localRlu5fPlanDaysCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fPlanDays;
    }

   protected int checkRlu5fPlanDaysMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fPlanDays is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fPlanDays() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fPlanDays
			                 ,RLU_5F_PLAN_DAYS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fPlanDays", beginRlu5fPlanDays,RLU_5F_PLAN_DAYS_LEN);
    }
   	}
     int localRlu5fPlanChgInadvIndCounter = -1;
     public boolean isRlu5fPlanChgInadvIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fPlanChgInadvIndCounter != sharedCounter;
         localRlu5fPlanChgInadvIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_PLAN_CHG_INADV_IND_LEN = 1;
	/**
	 * 	serialize this Rlu5fPlanChgInadvInd
	 */
   protected void serializeRlu5fPlanChgInadvInd(char[] rlu5fPlanChgInadvInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fPlanChgInadvInd,0,getStringValue(),beginRlu5fPlanChgInadvInd,RLU_5F_PLAN_CHG_INADV_IND_LEN);
       localRlu5fPlanChgInadvIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fPlanChgInadvIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRlu5fPlanChgInadvInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fPlanChgInadvInd() {	 
   		return (substring(getStringValue(),beginRlu5fPlanChgInadvInd,beginRlu5fPlanChgInadvInd + RLU_5F_PLAN_CHG_INADV_IND_LEN));
   	}
     int localRlu5fDiscountIndCounter = -1;
     public boolean isRlu5fDiscountIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fDiscountIndCounter != sharedCounter;
         localRlu5fDiscountIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_DISCOUNT_IND_LEN = 1;
	/**
	 * 	serialize this Rlu5fDiscountInd
	 */
   protected void serializeRlu5fDiscountInd(char[] rlu5fDiscountInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fDiscountInd,0,getStringValue(),beginRlu5fDiscountInd,RLU_5F_DISCOUNT_IND_LEN);
       localRlu5fDiscountIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fDiscountIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRlu5fDiscountInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fDiscountInd() {	 
   		return (substring(getStringValue(),beginRlu5fDiscountInd,beginRlu5fDiscountInd + RLU_5F_DISCOUNT_IND_LEN));
   	}
     int localRlu5fPlanTypeCounter = -1;
     public boolean isRlu5fPlanTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fPlanTypeCounter != sharedCounter;
         localRlu5fPlanTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_PLAN_TYPE_LEN = 2;
	/**
	 * 	serialize this Rlu5fPlanType
	 */
   protected void serializeRlu5fPlanType(char[] rlu5fPlanType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fPlanType,0,getStringValue(),beginRlu5fPlanType,RLU_5F_PLAN_TYPE_LEN);
       localRlu5fPlanTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fPlanTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlu5fPlanType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fPlanType() {	 
   		return (substring(getStringValue(),beginRlu5fPlanType,beginRlu5fPlanType + RLU_5F_PLAN_TYPE_LEN));
   	}
     int localRlu5fUnitTypeCounter = -1;
     public boolean isRlu5fUnitTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fUnitTypeCounter != sharedCounter;
         localRlu5fUnitTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_UNIT_TYPE_LEN = 2;
	/**
	 * 	serialize this Rlu5fUnitType
	 */
   protected void serializeRlu5fUnitType(char[] rlu5fUnitType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fUnitType,0,getStringValue(),beginRlu5fUnitType,RLU_5F_UNIT_TYPE_LEN);
       localRlu5fUnitTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fUnitTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlu5fUnitType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fUnitType() {	 
   		return (substring(getStringValue(),beginRlu5fUnitType,beginRlu5fUnitType + RLU_5F_UNIT_TYPE_LEN));
   	}
     int localRlu5fPlanIdCounter = -1;
     public boolean isRlu5fPlanIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fPlanIdCounter != sharedCounter;
         localRlu5fPlanIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_PLAN_ID_LEN = 6;
	/**
	 * 	serialize this Rlu5fPlanId
	 */
   protected void serializeRlu5fPlanId(char[] rlu5fPlanId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fPlanId,0,getStringValue(),beginRlu5fPlanId,RLU_5F_PLAN_ID_LEN);
       localRlu5fPlanIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fPlanIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRlu5fPlanId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fPlanId() {	 
   		return (substring(getStringValue(),beginRlu5fPlanId,beginRlu5fPlanId + RLU_5F_PLAN_ID_LEN));
   	}
     int localRlu5fCurDelayIndCounter = -1;
     public boolean isRlu5fCurDelayIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fCurDelayIndCounter != sharedCounter;
         localRlu5fCurDelayIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_CUR_DELAY_IND_LEN = 1;
	/**
	 * 	serialize this Rlu5fCurDelayInd
	 */
   protected void serializeRlu5fCurDelayInd(char[] rlu5fCurDelayInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fCurDelayInd,0,getStringValue(),beginRlu5fCurDelayInd,RLU_5F_CUR_DELAY_IND_LEN);
       localRlu5fCurDelayIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fCurDelayIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRlu5fCurDelayInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fCurDelayInd() {	 
   		return (substring(getStringValue(),beginRlu5fCurDelayInd,beginRlu5fCurDelayInd + RLU_5F_CUR_DELAY_IND_LEN));
   	}
        int localRlu5fDelayShareUsedCounter = -1;
        public boolean isRlu5fDelayShareUsedModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fDelayShareUsedCounter != sharedCounter;
           localRlu5fDelayShareUsedCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fDelayShareUsedIsNumeric() {
	      return decimalIsNumeric(beginRlu5fDelayShareUsed,RLU_5F_DELAY_SHARE_USED_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fDelayShareUsedString() {
            return getPackedString(beginRlu5fDelayShareUsed,RLU_5F_DELAY_SHARE_USED_LEN);
         }
   protected static final int RLU_5F_DELAY_SHARE_USED_LEN = 6;
   protected static final int RLU_5F_DELAY_SHARE_USED_SCALE = 3;
  	/**
	 * 	serializeRlu5fDelayShareUsed
	 */
	protected void serializeRlu5fDelayShareUsed(BigDecimal rlu5fDelayShareUsed) {
		   putDecimal(beginRlu5fDelayShareUsed,rlu5fDelayShareUsed,RLU_5F_DELAY_SHARE_USED_LEN,RLU_5F_DELAY_SHARE_USED_SCALE,true);
		 localRlu5fDelayShareUsedCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fDelayShareUsedMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,10/*precision*/);
   }
     /**
	 *	refreshRlu5fDelayShareUsed is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fDelayShareUsed() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fDelayShareUsed,RLU_5F_DELAY_SHARE_USED_LEN,RLU_5F_DELAY_SHARE_USED_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDelayShareUsed", beginRlu5fDelayShareUsed,RLU_5F_DELAY_SHARE_USED_LEN);
     }
   	}
        int localRlu5fDelayShareOvrageCounter = -1;
        public boolean isRlu5fDelayShareOvrageModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fDelayShareOvrageCounter != sharedCounter;
           localRlu5fDelayShareOvrageCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fDelayShareOvrageIsNumeric() {
	      return decimalIsNumeric(beginRlu5fDelayShareOvrage,RLU_5F_DELAY_SHARE_OVRAGE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fDelayShareOvrageString() {
            return getPackedString(beginRlu5fDelayShareOvrage,RLU_5F_DELAY_SHARE_OVRAGE_LEN);
         }
   protected static final int RLU_5F_DELAY_SHARE_OVRAGE_LEN = 6;
   protected static final int RLU_5F_DELAY_SHARE_OVRAGE_SCALE = 3;
  	/**
	 * 	serializeRlu5fDelayShareOvrage
	 */
	protected void serializeRlu5fDelayShareOvrage(BigDecimal rlu5fDelayShareOvrage) {
		   putDecimal(beginRlu5fDelayShareOvrage,rlu5fDelayShareOvrage,RLU_5F_DELAY_SHARE_OVRAGE_LEN,RLU_5F_DELAY_SHARE_OVRAGE_SCALE,true);
		 localRlu5fDelayShareOvrageCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fDelayShareOvrageMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,10/*precision*/);
   }
     /**
	 *	refreshRlu5fDelayShareOvrage is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fDelayShareOvrage() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fDelayShareOvrage,RLU_5F_DELAY_SHARE_OVRAGE_LEN,RLU_5F_DELAY_SHARE_OVRAGE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDelayShareOvrage", beginRlu5fDelayShareOvrage,RLU_5F_DELAY_SHARE_OVRAGE_LEN);
     }
   	}
        int localRlu5fDiscAmount1Counter = -1;
        public boolean isRlu5fDiscAmount1Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fDiscAmount1Counter != sharedCounter;
           localRlu5fDiscAmount1Counter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fDiscAmount1IsNumeric() {
	      return decimalIsNumeric(beginRlu5fDiscAmount1,RLU_5F_DISC_AMOUNT_1_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fDiscAmount1String() {
            return getPackedString(beginRlu5fDiscAmount1,RLU_5F_DISC_AMOUNT_1_LEN);
         }
   protected static final int RLU_5F_DISC_AMOUNT_1_LEN = 6;
   protected static final int RLU_5F_DISC_AMOUNT_1_SCALE = 2;
  	/**
	 * 	serializeRlu5fDiscAmount1
	 */
	protected void serializeRlu5fDiscAmount1(BigDecimal rlu5fDiscAmount1) {
		   putDecimal(beginRlu5fDiscAmount1,rlu5fDiscAmount1,RLU_5F_DISC_AMOUNT_1_LEN,RLU_5F_DISC_AMOUNT_1_SCALE,true);
		 localRlu5fDiscAmount1Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fDiscAmount1MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu5fDiscAmount1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fDiscAmount1() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fDiscAmount1,RLU_5F_DISC_AMOUNT_1_LEN,RLU_5F_DISC_AMOUNT_1_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDiscAmount1", beginRlu5fDiscAmount1,RLU_5F_DISC_AMOUNT_1_LEN);
     }
   	}
        int localRlu5fDiscAmount2Counter = -1;
        public boolean isRlu5fDiscAmount2Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fDiscAmount2Counter != sharedCounter;
           localRlu5fDiscAmount2Counter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fDiscAmount2IsNumeric() {
	      return decimalIsNumeric(beginRlu5fDiscAmount2,RLU_5F_DISC_AMOUNT_2_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fDiscAmount2String() {
            return getPackedString(beginRlu5fDiscAmount2,RLU_5F_DISC_AMOUNT_2_LEN);
         }
   protected static final int RLU_5F_DISC_AMOUNT_2_LEN = 6;
   protected static final int RLU_5F_DISC_AMOUNT_2_SCALE = 2;
  	/**
	 * 	serializeRlu5fDiscAmount2
	 */
	protected void serializeRlu5fDiscAmount2(BigDecimal rlu5fDiscAmount2) {
		   putDecimal(beginRlu5fDiscAmount2,rlu5fDiscAmount2,RLU_5F_DISC_AMOUNT_2_LEN,RLU_5F_DISC_AMOUNT_2_SCALE,true);
		 localRlu5fDiscAmount2Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fDiscAmount2MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu5fDiscAmount2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fDiscAmount2() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fDiscAmount2,RLU_5F_DISC_AMOUNT_2_LEN,RLU_5F_DISC_AMOUNT_2_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDiscAmount2", beginRlu5fDiscAmount2,RLU_5F_DISC_AMOUNT_2_LEN);
     }
   	}
     int localRlu5fBoboVenderNameCounter = -1;
     public boolean isRlu5fBoboVenderNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fBoboVenderNameCounter != sharedCounter;
         localRlu5fBoboVenderNameCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_BOBO_VENDER_NAME_LEN = 10;
	/**
	 * 	serialize this Rlu5fBoboVenderName
	 */
   protected void serializeRlu5fBoboVenderName(char[] rlu5fBoboVenderName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fBoboVenderName,0,getStringValue(),beginRlu5fBoboVenderName,RLU_5F_BOBO_VENDER_NAME_LEN);
       localRlu5fBoboVenderNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fBoboVenderNameConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshRlu5fBoboVenderName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fBoboVenderName() {	 
   		return (substring(getStringValue(),beginRlu5fBoboVenderName,beginRlu5fBoboVenderName + RLU_5F_BOBO_VENDER_NAME_LEN));
   	}
     int localRlu5fBoboVenderNumberCounter = -1;
     public boolean isRlu5fBoboVenderNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fBoboVenderNumberCounter != sharedCounter;
         localRlu5fBoboVenderNumberCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_BOBO_VENDER_NUMBER_LEN = 10;
	/**
	 * 	serialize this Rlu5fBoboVenderNumber
	 */
   protected void serializeRlu5fBoboVenderNumber(char[] rlu5fBoboVenderNumber) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fBoboVenderNumber,0,getStringValue(),beginRlu5fBoboVenderNumber,RLU_5F_BOBO_VENDER_NUMBER_LEN);
       localRlu5fBoboVenderNumberCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fBoboVenderNumberConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshRlu5fBoboVenderNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fBoboVenderNumber() {	 
   		return (substring(getStringValue(),beginRlu5fBoboVenderNumber,beginRlu5fBoboVenderNumber + RLU_5F_BOBO_VENDER_NUMBER_LEN));
   	}
     int localRlu5fBoboServDescCounter = -1;
     public boolean isRlu5fBoboServDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fBoboServDescCounter != sharedCounter;
         localRlu5fBoboServDescCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_BOBO_SERV_DESC_LEN = 40;
	/**
	 * 	serialize this Rlu5fBoboServDesc
	 */
   protected void serializeRlu5fBoboServDesc(char[] rlu5fBoboServDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fBoboServDesc,0,getStringValue(),beginRlu5fBoboServDesc,RLU_5F_BOBO_SERV_DESC_LEN);
       localRlu5fBoboServDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fBoboServDescConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshRlu5fBoboServDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fBoboServDesc() {	 
   		return (substring(getStringValue(),beginRlu5fBoboServDesc,beginRlu5fBoboServDesc + RLU_5F_BOBO_SERV_DESC_LEN));
   	}
        int localRlu5fBoboTaxAmtCounter = -1;
        public boolean isRlu5fBoboTaxAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fBoboTaxAmtCounter != sharedCounter;
           localRlu5fBoboTaxAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fBoboTaxAmtIsNumeric() {
	      return decimalIsNumeric(beginRlu5fBoboTaxAmt,RLU_5F_BOBO_TAX_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fBoboTaxAmtString() {
            return getPackedString(beginRlu5fBoboTaxAmt,RLU_5F_BOBO_TAX_AMT_LEN);
         }
   protected static final int RLU_5F_BOBO_TAX_AMT_LEN = 6;
   protected static final int RLU_5F_BOBO_TAX_AMT_SCALE = 2;
  	/**
	 * 	serializeRlu5fBoboTaxAmt
	 */
	protected void serializeRlu5fBoboTaxAmt(BigDecimal rlu5fBoboTaxAmt) {
		   putDecimal(beginRlu5fBoboTaxAmt,rlu5fBoboTaxAmt,RLU_5F_BOBO_TAX_AMT_LEN,RLU_5F_BOBO_TAX_AMT_SCALE,true);
		 localRlu5fBoboTaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fBoboTaxAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu5fBoboTaxAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fBoboTaxAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fBoboTaxAmt,RLU_5F_BOBO_TAX_AMT_LEN,RLU_5F_BOBO_TAX_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fBoboTaxAmt", beginRlu5fBoboTaxAmt,RLU_5F_BOBO_TAX_AMT_LEN);
     }
   	}
        int localRlu5fBoboSurAmtCounter = -1;
        public boolean isRlu5fBoboSurAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fBoboSurAmtCounter != sharedCounter;
           localRlu5fBoboSurAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fBoboSurAmtIsNumeric() {
	      return decimalIsNumeric(beginRlu5fBoboSurAmt,RLU_5F_BOBO_SUR_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fBoboSurAmtString() {
            return getPackedString(beginRlu5fBoboSurAmt,RLU_5F_BOBO_SUR_AMT_LEN);
         }
   protected static final int RLU_5F_BOBO_SUR_AMT_LEN = 6;
   protected static final int RLU_5F_BOBO_SUR_AMT_SCALE = 2;
  	/**
	 * 	serializeRlu5fBoboSurAmt
	 */
	protected void serializeRlu5fBoboSurAmt(BigDecimal rlu5fBoboSurAmt) {
		   putDecimal(beginRlu5fBoboSurAmt,rlu5fBoboSurAmt,RLU_5F_BOBO_SUR_AMT_LEN,RLU_5F_BOBO_SUR_AMT_SCALE,true);
		 localRlu5fBoboSurAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fBoboSurAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu5fBoboSurAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fBoboSurAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fBoboSurAmt,RLU_5F_BOBO_SUR_AMT_LEN,RLU_5F_BOBO_SUR_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fBoboSurAmt", beginRlu5fBoboSurAmt,RLU_5F_BOBO_SUR_AMT_LEN);
     }
   	}
        int localRlu5fMsoNumOfPurchasesCounter = -1;
        public boolean isRlu5fMsoNumOfPurchasesModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fMsoNumOfPurchasesCounter != sharedCounter;
           localRlu5fMsoNumOfPurchasesCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fMsoNumOfPurchasesIsNumeric() {
	      return decimalIsNumeric(beginRlu5fMsoNumOfPurchases,RLU_5F_MSO_NUM_OF_PURCHASES_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int RLU_5F_MSO_NUM_OF_PURCHASES_LEN = 4;
  	/**
	 * 	serializeRlu5fMsoNumOfPurchases
	 */
	protected void serializeRlu5fMsoNumOfPurchases(long rlu5fMsoNumOfPurchases) {
		   putDecimal(beginRlu5fMsoNumOfPurchases,rlu5fMsoNumOfPurchases,RLU_5F_MSO_NUM_OF_PURCHASES_LEN,false);
   }
   

   protected long checkRlu5fMsoNumOfPurchasesMaxLimit(long number) {
        return checkMaxLimit(number , MAX_10M /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshRlu5fMsoNumOfPurchases is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRlu5fMsoNumOfPurchases() throws CFException {	
   	try { 
		 return (getLongDecimal(beginRlu5fMsoNumOfPurchases,RLU_5F_MSO_NUM_OF_PURCHASES_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fMsoNumOfPurchases", beginRlu5fMsoNumOfPurchases,RLU_5F_MSO_NUM_OF_PURCHASES_LEN);
     }
   	}
     int localRlu5fMsoPurchaseDescCounter = -1;
     public boolean isRlu5fMsoPurchaseDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fMsoPurchaseDescCounter != sharedCounter;
         localRlu5fMsoPurchaseDescCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_MSO_PURCHASE_DESC_LEN = 15;
	/**
	 * 	serialize this Rlu5fMsoPurchaseDesc
	 */
   protected void serializeRlu5fMsoPurchaseDesc(char[] rlu5fMsoPurchaseDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fMsoPurchaseDesc,0,getStringValue(),beginRlu5fMsoPurchaseDesc,RLU_5F_MSO_PURCHASE_DESC_LEN);
       localRlu5fMsoPurchaseDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fMsoPurchaseDescConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshRlu5fMsoPurchaseDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fMsoPurchaseDesc() {	 
   		return (substring(getStringValue(),beginRlu5fMsoPurchaseDesc,beginRlu5fMsoPurchaseDesc + RLU_5F_MSO_PURCHASE_DESC_LEN));
   	}
     int localRlu5fMsoDomainNameCounter = -1;
     public boolean isRlu5fMsoDomainNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fMsoDomainNameCounter != sharedCounter;
         localRlu5fMsoDomainNameCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_MSO_DOMAIN_NAME_LEN = 65;
	/**
	 * 	serialize this Rlu5fMsoDomainName
	 */
   protected void serializeRlu5fMsoDomainName(char[] rlu5fMsoDomainName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fMsoDomainName,0,getStringValue(),beginRlu5fMsoDomainName,RLU_5F_MSO_DOMAIN_NAME_LEN);
       localRlu5fMsoDomainNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fMsoDomainNameConstraints(char[] value) {
   			return super.checkConstraints(value , 65 ,false, false);
   }
    /**
	 *	refreshRlu5fMsoDomainName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fMsoDomainName() {	 
   		return (substring(getStringValue(),beginRlu5fMsoDomainName,beginRlu5fMsoDomainName + RLU_5F_MSO_DOMAIN_NAME_LEN));
   	}
        int localRlu5fDipLateFeeCounter = -1;
        public boolean isRlu5fDipLateFeeModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fDipLateFeeCounter != sharedCounter;
           localRlu5fDipLateFeeCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fDipLateFeeIsNumeric() {
	      return decimalIsNumeric(beginRlu5fDipLateFee,RLU_5F_DIP_LATE_FEE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fDipLateFeeString() {
            return getPackedString(beginRlu5fDipLateFee,RLU_5F_DIP_LATE_FEE_LEN);
         }
   protected static final int RLU_5F_DIP_LATE_FEE_LEN = 6;
   protected static final int RLU_5F_DIP_LATE_FEE_SCALE = 2;
  	/**
	 * 	serializeRlu5fDipLateFee
	 */
	protected void serializeRlu5fDipLateFee(BigDecimal rlu5fDipLateFee) {
		   putDecimal(beginRlu5fDipLateFee,rlu5fDipLateFee,RLU_5F_DIP_LATE_FEE_LEN,RLU_5F_DIP_LATE_FEE_SCALE,true);
		 localRlu5fDipLateFeeCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fDipLateFeeMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu5fDipLateFee is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fDipLateFee() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fDipLateFee,RLU_5F_DIP_LATE_FEE_LEN,RLU_5F_DIP_LATE_FEE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDipLateFee", beginRlu5fDipLateFee,RLU_5F_DIP_LATE_FEE_LEN);
     }
   	}
        int localRlu5fDipFinChgDueCounter = -1;
        public boolean isRlu5fDipFinChgDueModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fDipFinChgDueCounter != sharedCounter;
           localRlu5fDipFinChgDueCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fDipFinChgDueIsNumeric() {
	      return decimalIsNumeric(beginRlu5fDipFinChgDue,RLU_5F_DIP_FIN_CHG_DUE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fDipFinChgDueString() {
            return getPackedString(beginRlu5fDipFinChgDue,RLU_5F_DIP_FIN_CHG_DUE_LEN);
         }
   protected static final int RLU_5F_DIP_FIN_CHG_DUE_LEN = 6;
   protected static final int RLU_5F_DIP_FIN_CHG_DUE_SCALE = 2;
  	/**
	 * 	serializeRlu5fDipFinChgDue
	 */
	protected void serializeRlu5fDipFinChgDue(BigDecimal rlu5fDipFinChgDue) {
		   putDecimal(beginRlu5fDipFinChgDue,rlu5fDipFinChgDue,RLU_5F_DIP_FIN_CHG_DUE_LEN,RLU_5F_DIP_FIN_CHG_DUE_SCALE,true);
		 localRlu5fDipFinChgDueCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fDipFinChgDueMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu5fDipFinChgDue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fDipFinChgDue() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fDipFinChgDue,RLU_5F_DIP_FIN_CHG_DUE_LEN,RLU_5F_DIP_FIN_CHG_DUE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDipFinChgDue", beginRlu5fDipFinChgDue,RLU_5F_DIP_FIN_CHG_DUE_LEN);
     }
   	}
        int localRlu5fDipFinChgPaidCounter = -1;
        public boolean isRlu5fDipFinChgPaidModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fDipFinChgPaidCounter != sharedCounter;
           localRlu5fDipFinChgPaidCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fDipFinChgPaidIsNumeric() {
	      return decimalIsNumeric(beginRlu5fDipFinChgPaid,RLU_5F_DIP_FIN_CHG_PAID_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fDipFinChgPaidString() {
            return getPackedString(beginRlu5fDipFinChgPaid,RLU_5F_DIP_FIN_CHG_PAID_LEN);
         }
   protected static final int RLU_5F_DIP_FIN_CHG_PAID_LEN = 6;
   protected static final int RLU_5F_DIP_FIN_CHG_PAID_SCALE = 2;
  	/**
	 * 	serializeRlu5fDipFinChgPaid
	 */
	protected void serializeRlu5fDipFinChgPaid(BigDecimal rlu5fDipFinChgPaid) {
		   putDecimal(beginRlu5fDipFinChgPaid,rlu5fDipFinChgPaid,RLU_5F_DIP_FIN_CHG_PAID_LEN,RLU_5F_DIP_FIN_CHG_PAID_SCALE,true);
		 localRlu5fDipFinChgPaidCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fDipFinChgPaidMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu5fDipFinChgPaid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fDipFinChgPaid() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fDipFinChgPaid,RLU_5F_DIP_FIN_CHG_PAID_LEN,RLU_5F_DIP_FIN_CHG_PAID_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDipFinChgPaid", beginRlu5fDipFinChgPaid,RLU_5F_DIP_FIN_CHG_PAID_LEN);
     }
   	}
        int localRlu5fDipFinChgPastDueCounter = -1;
        public boolean isRlu5fDipFinChgPastDueModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fDipFinChgPastDueCounter != sharedCounter;
           localRlu5fDipFinChgPastDueCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fDipFinChgPastDueIsNumeric() {
	      return decimalIsNumeric(beginRlu5fDipFinChgPastDue,RLU_5F_DIP_FIN_CHG_PAST_DUE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fDipFinChgPastDueString() {
            return getPackedString(beginRlu5fDipFinChgPastDue,RLU_5F_DIP_FIN_CHG_PAST_DUE_LEN);
         }
   protected static final int RLU_5F_DIP_FIN_CHG_PAST_DUE_LEN = 6;
   protected static final int RLU_5F_DIP_FIN_CHG_PAST_DUE_SCALE = 2;
  	/**
	 * 	serializeRlu5fDipFinChgPastDue
	 */
	protected void serializeRlu5fDipFinChgPastDue(BigDecimal rlu5fDipFinChgPastDue) {
		   putDecimal(beginRlu5fDipFinChgPastDue,rlu5fDipFinChgPastDue,RLU_5F_DIP_FIN_CHG_PAST_DUE_LEN,RLU_5F_DIP_FIN_CHG_PAST_DUE_SCALE,true);
		 localRlu5fDipFinChgPastDueCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fDipFinChgPastDueMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu5fDipFinChgPastDue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fDipFinChgPastDue() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fDipFinChgPastDue,RLU_5F_DIP_FIN_CHG_PAST_DUE_LEN,RLU_5F_DIP_FIN_CHG_PAST_DUE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDipFinChgPastDue", beginRlu5fDipFinChgPastDue,RLU_5F_DIP_FIN_CHG_PAST_DUE_LEN);
     }
   	}
        int localRlu5fDipBalanceCounter = -1;
        public boolean isRlu5fDipBalanceModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fDipBalanceCounter != sharedCounter;
           localRlu5fDipBalanceCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fDipBalanceIsNumeric() {
	      return decimalIsNumeric(beginRlu5fDipBalance,RLU_5F_DIP_BALANCE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fDipBalanceString() {
            return getPackedString(beginRlu5fDipBalance,RLU_5F_DIP_BALANCE_LEN);
         }
   protected static final int RLU_5F_DIP_BALANCE_LEN = 6;
   protected static final int RLU_5F_DIP_BALANCE_SCALE = 2;
  	/**
	 * 	serializeRlu5fDipBalance
	 */
	protected void serializeRlu5fDipBalance(BigDecimal rlu5fDipBalance) {
		   putDecimal(beginRlu5fDipBalance,rlu5fDipBalance,RLU_5F_DIP_BALANCE_LEN,RLU_5F_DIP_BALANCE_SCALE,true);
		 localRlu5fDipBalanceCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fDipBalanceMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu5fDipBalance is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fDipBalance() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fDipBalance,RLU_5F_DIP_BALANCE_LEN,RLU_5F_DIP_BALANCE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDipBalance", beginRlu5fDipBalance,RLU_5F_DIP_BALANCE_LEN);
     }
   	}
        int localRlu5fDipFinChgBalanceCounter = -1;
        public boolean isRlu5fDipFinChgBalanceModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fDipFinChgBalanceCounter != sharedCounter;
           localRlu5fDipFinChgBalanceCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fDipFinChgBalanceIsNumeric() {
	      return decimalIsNumeric(beginRlu5fDipFinChgBalance,RLU_5F_DIP_FIN_CHG_BALANCE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fDipFinChgBalanceString() {
            return getPackedString(beginRlu5fDipFinChgBalance,RLU_5F_DIP_FIN_CHG_BALANCE_LEN);
         }
   protected static final int RLU_5F_DIP_FIN_CHG_BALANCE_LEN = 6;
   protected static final int RLU_5F_DIP_FIN_CHG_BALANCE_SCALE = 2;
  	/**
	 * 	serializeRlu5fDipFinChgBalance
	 */
	protected void serializeRlu5fDipFinChgBalance(BigDecimal rlu5fDipFinChgBalance) {
		   putDecimal(beginRlu5fDipFinChgBalance,rlu5fDipFinChgBalance,RLU_5F_DIP_FIN_CHG_BALANCE_LEN,RLU_5F_DIP_FIN_CHG_BALANCE_SCALE,true);
		 localRlu5fDipFinChgBalanceCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fDipFinChgBalanceMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu5fDipFinChgBalance is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fDipFinChgBalance() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fDipFinChgBalance,RLU_5F_DIP_FIN_CHG_BALANCE_LEN,RLU_5F_DIP_FIN_CHG_BALANCE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDipFinChgBalance", beginRlu5fDipFinChgBalance,RLU_5F_DIP_FIN_CHG_BALANCE_LEN);
     }
   	}
     int localRlu5fInstallPaymentNumCounter = -1;
     public boolean isRlu5fInstallPaymentNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fInstallPaymentNumCounter != sharedCounter;
         localRlu5fInstallPaymentNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fInstallPaymentNum
	 *	@return rlu5fInstallPaymentNum
	 */
	public char[]  getRlu5fInstallPaymentNumString() {
	     return getCharArray(beginRlu5fInstallPaymentNum,RLU_5F_INSTALL_PAYMENT_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fInstallPaymentNumIsNumeric() {
	    return isNumeric(beginRlu5fInstallPaymentNum
	                    ,beginRlu5fInstallPaymentNum + RLU_5F_INSTALL_PAYMENT_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_INSTALL_PAYMENT_NUM_LEN = 2;
  	/**
	 * serializeRlu5fInstallPaymentNum
	 */
	protected void serializeRlu5fInstallPaymentNum(int rlu5fInstallPaymentNum) {
		 putNumber(beginRlu5fInstallPaymentNum,rlu5fInstallPaymentNum,RLU_5F_INSTALL_PAYMENT_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fInstallPaymentNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fInstallPaymentNum
	 */
   	protected  int serializeRlu5fInstallPaymentNum(char[] value) {
	    int  rlu5fInstallPaymentNum;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fInstallPaymentNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fInstallPaymentNum
		       ,2
		      );
		 localRlu5fInstallPaymentNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fInstallPaymentNum;
    }

   protected int checkRlu5fInstallPaymentNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fInstallPaymentNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fInstallPaymentNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fInstallPaymentNum
			                 ,RLU_5F_INSTALL_PAYMENT_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fInstallPaymentNum", beginRlu5fInstallPaymentNum,RLU_5F_INSTALL_PAYMENT_NUM_LEN);
    }
   	}
     int localRlu5fTotInstallPaymentsCounter = -1;
     public boolean isRlu5fTotInstallPaymentsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fTotInstallPaymentsCounter != sharedCounter;
         localRlu5fTotInstallPaymentsCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fTotInstallPayments
	 *	@return rlu5fTotInstallPayments
	 */
	public char[]  getRlu5fTotInstallPaymentsString() {
	     return getCharArray(beginRlu5fTotInstallPayments,RLU_5F_TOT_INSTALL_PAYMENTS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fTotInstallPaymentsIsNumeric() {
	    return isNumeric(beginRlu5fTotInstallPayments
	                    ,beginRlu5fTotInstallPayments + RLU_5F_TOT_INSTALL_PAYMENTS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_TOT_INSTALL_PAYMENTS_LEN = 2;
  	/**
	 * serializeRlu5fTotInstallPayments
	 */
	protected void serializeRlu5fTotInstallPayments(int rlu5fTotInstallPayments) {
		 putNumber(beginRlu5fTotInstallPayments,rlu5fTotInstallPayments,RLU_5F_TOT_INSTALL_PAYMENTS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fTotInstallPaymentsCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fTotInstallPayments
	 */
   	protected  int serializeRlu5fTotInstallPayments(char[] value) {
	    int  rlu5fTotInstallPayments;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fTotInstallPayments = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRlu5fTotInstallPayments
		       ,2
		      );
		 localRlu5fTotInstallPaymentsCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fTotInstallPayments;
    }

   protected int checkRlu5fTotInstallPaymentsMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fTotInstallPayments is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fTotInstallPayments() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRlu5fTotInstallPayments
			                 ,RLU_5F_TOT_INSTALL_PAYMENTS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fTotInstallPayments", beginRlu5fTotInstallPayments,RLU_5F_TOT_INSTALL_PAYMENTS_LEN);
    }
   	}
     int localRlu5fDipLoanNumberCounter = -1;
     public boolean isRlu5fDipLoanNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fDipLoanNumberCounter != sharedCounter;
         localRlu5fDipLoanNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rlu5fDipLoanNumber
	 *	@return rlu5fDipLoanNumber
	 */
	public char[]  getRlu5fDipLoanNumberString() {
	     return getCharArray(beginRlu5fDipLoanNumber,RLU_5F_DIP_LOAN_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rlu5fDipLoanNumberIsNumeric() {
	    return isNumeric(beginRlu5fDipLoanNumber
	                    ,beginRlu5fDipLoanNumber + RLU_5F_DIP_LOAN_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RLU_5F_DIP_LOAN_NUMBER_LEN = 10;
  	/**
	 * serializeRlu5fDipLoanNumber
	 */
	protected void serializeRlu5fDipLoanNumber(long rlu5fDipLoanNumber) {
		 putNumber(beginRlu5fDipLoanNumber,rlu5fDipLoanNumber,RLU_5F_DIP_LOAN_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRlu5fDipLoanNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRlu5fDipLoanNumber
	 */
   	protected  long serializeRlu5fDipLoanNumber(char[] value) {
	    long  rlu5fDipLoanNumber;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rlu5fDipLoanNumber = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginRlu5fDipLoanNumber
		       ,10
		      );
		 localRlu5fDipLoanNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  rlu5fDipLoanNumber;
    }

   protected long checkRlu5fDipLoanNumberMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRlu5fDipLoanNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRlu5fDipLoanNumber() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginRlu5fDipLoanNumber
			                 ,RLU_5F_DIP_LOAN_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDipLoanNumber", beginRlu5fDipLoanNumber,RLU_5F_DIP_LOAN_NUMBER_LEN);
    }
   	}
     int localRlu5fAlpDelayedCapSwCounter = -1;
     public boolean isRlu5fAlpDelayedCapSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fAlpDelayedCapSwCounter != sharedCounter;
         localRlu5fAlpDelayedCapSwCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_ALP_DELAYED_CAP_SW_LEN = 1;
	/**
	 * 	serialize this Rlu5fAlpDelayedCapSw
	 */
   protected void serializeRlu5fAlpDelayedCapSw(char[] rlu5fAlpDelayedCapSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fAlpDelayedCapSw,0,getStringValue(),beginRlu5fAlpDelayedCapSw,RLU_5F_ALP_DELAYED_CAP_SW_LEN);
       localRlu5fAlpDelayedCapSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fAlpDelayedCapSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRlu5fAlpDelayedCapSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fAlpDelayedCapSw() {	 
   		return (substring(getStringValue(),beginRlu5fAlpDelayedCapSw,beginRlu5fAlpDelayedCapSw + RLU_5F_ALP_DELAYED_CAP_SW_LEN));
   	}
     int localRlu5fAlpUnitTypeCounter = -1;
     public boolean isRlu5fAlpUnitTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fAlpUnitTypeCounter != sharedCounter;
         localRlu5fAlpUnitTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_ALP_UNIT_TYPE_LEN = 2;
	/**
	 * 	serialize this Rlu5fAlpUnitType
	 */
   protected void serializeRlu5fAlpUnitType(char[] rlu5fAlpUnitType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fAlpUnitType,0,getStringValue(),beginRlu5fAlpUnitType,RLU_5F_ALP_UNIT_TYPE_LEN);
       localRlu5fAlpUnitTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fAlpUnitTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlu5fAlpUnitType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fAlpUnitType() {	 
   		return (substring(getStringValue(),beginRlu5fAlpUnitType,beginRlu5fAlpUnitType + RLU_5F_ALP_UNIT_TYPE_LEN));
   	}
        int localRlu5fDipSubTotalCounter = -1;
        public boolean isRlu5fDipSubTotalModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fDipSubTotalCounter != sharedCounter;
           localRlu5fDipSubTotalCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fDipSubTotalIsNumeric() {
	      return decimalIsNumeric(beginRlu5fDipSubTotal,RLU_5F_DIP_SUB_TOTAL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fDipSubTotalString() {
            return getPackedString(beginRlu5fDipSubTotal,RLU_5F_DIP_SUB_TOTAL_LEN);
         }
   protected static final int RLU_5F_DIP_SUB_TOTAL_LEN = 6;
   protected static final int RLU_5F_DIP_SUB_TOTAL_SCALE = 2;
  	/**
	 * 	serializeRlu5fDipSubTotal
	 */
	protected void serializeRlu5fDipSubTotal(BigDecimal rlu5fDipSubTotal) {
		   putDecimal(beginRlu5fDipSubTotal,rlu5fDipSubTotal,RLU_5F_DIP_SUB_TOTAL_LEN,RLU_5F_DIP_SUB_TOTAL_SCALE,true);
		 localRlu5fDipSubTotalCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fDipSubTotalMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu5fDipSubTotal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fDipSubTotal() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fDipSubTotal,RLU_5F_DIP_SUB_TOTAL_LEN,RLU_5F_DIP_SUB_TOTAL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDipSubTotal", beginRlu5fDipSubTotal,RLU_5F_DIP_SUB_TOTAL_LEN);
     }
   	}
     int localRlu5fVzedgeIndCounter = -1;
     public boolean isRlu5fVzedgeIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fVzedgeIndCounter != sharedCounter;
         localRlu5fVzedgeIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_VZEDGE_IND_LEN = 1;
	/**
	 * 	serialize this Rlu5fVzedgeInd
	 */
   protected void serializeRlu5fVzedgeInd(char[] rlu5fVzedgeInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fVzedgeInd,0,getStringValue(),beginRlu5fVzedgeInd,RLU_5F_VZEDGE_IND_LEN);
       localRlu5fVzedgeIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fVzedgeIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRlu5fVzedgeInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fVzedgeInd() {	 
   		return (substring(getStringValue(),beginRlu5fVzedgeInd,beginRlu5fVzedgeInd + RLU_5F_VZEDGE_IND_LEN));
   	}
     int localRlu5fVzedgeMsgIndCounter = -1;
     public boolean isRlu5fVzedgeMsgIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fVzedgeMsgIndCounter != sharedCounter;
         localRlu5fVzedgeMsgIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_VZEDGE_MSG_IND_LEN = 1;
	/**
	 * 	serialize this Rlu5fVzedgeMsgInd
	 */
   protected void serializeRlu5fVzedgeMsgInd(char[] rlu5fVzedgeMsgInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fVzedgeMsgInd,0,getStringValue(),beginRlu5fVzedgeMsgInd,RLU_5F_VZEDGE_MSG_IND_LEN);
       localRlu5fVzedgeMsgIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fVzedgeMsgIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRlu5fVzedgeMsgInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fVzedgeMsgInd() {	 
   		return (substring(getStringValue(),beginRlu5fVzedgeMsgInd,beginRlu5fVzedgeMsgInd + RLU_5F_VZEDGE_MSG_IND_LEN));
   	}
     int localRlu5fCellcryptRenewalDateCounter = -1;
     public boolean isRlu5fCellcryptRenewalDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fCellcryptRenewalDateCounter != sharedCounter;
         localRlu5fCellcryptRenewalDateCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_CELLCRYPT_RENEWAL_DATE_LEN = 8;
	/**
	 * 	serialize this Rlu5fCellcryptRenewalDate
	 */
   protected void serializeRlu5fCellcryptRenewalDate(char[] rlu5fCellcryptRenewalDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fCellcryptRenewalDate,0,getStringValue(),beginRlu5fCellcryptRenewalDate,RLU_5F_CELLCRYPT_RENEWAL_DATE_LEN);
       localRlu5fCellcryptRenewalDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fCellcryptRenewalDateConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRlu5fCellcryptRenewalDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fCellcryptRenewalDate() {	 
   		return (substring(getStringValue(),beginRlu5fCellcryptRenewalDate,beginRlu5fCellcryptRenewalDate + RLU_5F_CELLCRYPT_RENEWAL_DATE_LEN));
   	}
     int localRlu5fCellcryptActionCodeCounter = -1;
     public boolean isRlu5fCellcryptActionCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fCellcryptActionCodeCounter != sharedCounter;
         localRlu5fCellcryptActionCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_CELLCRYPT_ACTION_CODE_LEN = 1;
	/**
	 * 	serialize this Rlu5fCellcryptActionCode
	 */
   protected void serializeRlu5fCellcryptActionCode(char[] rlu5fCellcryptActionCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fCellcryptActionCode,0,getStringValue(),beginRlu5fCellcryptActionCode,RLU_5F_CELLCRYPT_ACTION_CODE_LEN);
       localRlu5fCellcryptActionCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fCellcryptActionCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRlu5fCellcryptActionCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fCellcryptActionCode() {	 
   		return (substring(getStringValue(),beginRlu5fCellcryptActionCode,beginRlu5fCellcryptActionCode + RLU_5F_CELLCRYPT_ACTION_CODE_LEN));
   	}
        int localRlu5fCellcryptUnitCostCounter = -1;
        public boolean isRlu5fCellcryptUnitCostModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fCellcryptUnitCostCounter != sharedCounter;
           localRlu5fCellcryptUnitCostCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fCellcryptUnitCostIsNumeric() {
	      return decimalIsNumeric(beginRlu5fCellcryptUnitCost,RLU_5F_CELLCRYPT_UNIT_COST_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fCellcryptUnitCostString() {
            return getPackedString(beginRlu5fCellcryptUnitCost,RLU_5F_CELLCRYPT_UNIT_COST_LEN);
         }
   protected static final int RLU_5F_CELLCRYPT_UNIT_COST_LEN = 6;
   protected static final int RLU_5F_CELLCRYPT_UNIT_COST_SCALE = 2;
  	/**
	 * 	serializeRlu5fCellcryptUnitCost
	 */
	protected void serializeRlu5fCellcryptUnitCost(BigDecimal rlu5fCellcryptUnitCost) {
		   putDecimal(beginRlu5fCellcryptUnitCost,rlu5fCellcryptUnitCost,RLU_5F_CELLCRYPT_UNIT_COST_LEN,RLU_5F_CELLCRYPT_UNIT_COST_SCALE,true);
		 localRlu5fCellcryptUnitCostCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fCellcryptUnitCostMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu5fCellcryptUnitCost is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fCellcryptUnitCost() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fCellcryptUnitCost,RLU_5F_CELLCRYPT_UNIT_COST_LEN,RLU_5F_CELLCRYPT_UNIT_COST_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fCellcryptUnitCost", beginRlu5fCellcryptUnitCost,RLU_5F_CELLCRYPT_UNIT_COST_LEN);
     }
   	}
     int localRlu5fCellcryptTransactionDtCounter = -1;
     public boolean isRlu5fCellcryptTransactionDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fCellcryptTransactionDtCounter != sharedCounter;
         localRlu5fCellcryptTransactionDtCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_CELLCRYPT_TRANSACTION_DT_LEN = 8;
	/**
	 * 	serialize this Rlu5fCellcryptTransactionDt
	 */
   protected void serializeRlu5fCellcryptTransactionDt(char[] rlu5fCellcryptTransactionDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fCellcryptTransactionDt,0,getStringValue(),beginRlu5fCellcryptTransactionDt,RLU_5F_CELLCRYPT_TRANSACTION_DT_LEN);
       localRlu5fCellcryptTransactionDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fCellcryptTransactionDtConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRlu5fCellcryptTransactionDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fCellcryptTransactionDt() {	 
   		return (substring(getStringValue(),beginRlu5fCellcryptTransactionDt,beginRlu5fCellcryptTransactionDt + RLU_5F_CELLCRYPT_TRANSACTION_DT_LEN));
   	}
     int localRlu5fCellcryptProrateIndCounter = -1;
     public boolean isRlu5fCellcryptProrateIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fCellcryptProrateIndCounter != sharedCounter;
         localRlu5fCellcryptProrateIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_CELLCRYPT_PRORATE_IND_LEN = 1;
	/**
	 * 	serialize this Rlu5fCellcryptProrateInd
	 */
   protected void serializeRlu5fCellcryptProrateInd(char[] rlu5fCellcryptProrateInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fCellcryptProrateInd,0,getStringValue(),beginRlu5fCellcryptProrateInd,RLU_5F_CELLCRYPT_PRORATE_IND_LEN);
       localRlu5fCellcryptProrateIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fCellcryptProrateIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRlu5fCellcryptProrateInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fCellcryptProrateInd() {	 
   		return (substring(getStringValue(),beginRlu5fCellcryptProrateInd,beginRlu5fCellcryptProrateInd + RLU_5F_CELLCRYPT_PRORATE_IND_LEN));
   	}
     int localRlu5fSharedIndCounter = -1;
     public boolean isRlu5fSharedIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fSharedIndCounter != sharedCounter;
         localRlu5fSharedIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_SHARED_IND_LEN = 1;
	/**
	 * 	serialize this Rlu5fSharedInd
	 */
   protected void serializeRlu5fSharedInd(char[] rlu5fSharedInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fSharedInd,0,getStringValue(),beginRlu5fSharedInd,RLU_5F_SHARED_IND_LEN);
       localRlu5fSharedIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fSharedIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRlu5fSharedInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fSharedInd() {	 
   		return (substring(getStringValue(),beginRlu5fSharedInd,beginRlu5fSharedInd + RLU_5F_SHARED_IND_LEN));
   	}
        int localRlu5fShareSetCounter = -1;
        public boolean isRlu5fShareSetModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fShareSetCounter != sharedCounter;
           localRlu5fShareSetCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fShareSetIsNumeric() {
	      return decimalIsNumeric(beginRlu5fShareSet,RLU_5F_SHARE_SET_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int RLU_5F_SHARE_SET_LEN = 5;
  	/**
	 * 	serializeRlu5fShareSet
	 */
	protected void serializeRlu5fShareSet(int rlu5fShareSet) {
		   putDecimal(beginRlu5fShareSet,rlu5fShareSet,RLU_5F_SHARE_SET_LEN,true);
   }
   

   protected int checkRlu5fShareSetMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshRlu5fShareSet is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fShareSet() throws CFException {	
   	try { 
		 return (getIntDecimal(beginRlu5fShareSet,RLU_5F_SHARE_SET_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fShareSet", beginRlu5fShareSet,RLU_5F_SHARE_SET_LEN);
     }
   	}
        int localRlu5fDevicePriceCounter = -1;
        public boolean isRlu5fDevicePriceModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fDevicePriceCounter != sharedCounter;
           localRlu5fDevicePriceCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fDevicePriceIsNumeric() {
	      return decimalIsNumeric(beginRlu5fDevicePrice,RLU_5F_DEVICE_PRICE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fDevicePriceString() {
            return getPackedString(beginRlu5fDevicePrice,RLU_5F_DEVICE_PRICE_LEN);
         }
   protected static final int RLU_5F_DEVICE_PRICE_LEN = 6;
   protected static final int RLU_5F_DEVICE_PRICE_SCALE = 2;
  	/**
	 * 	serializeRlu5fDevicePrice
	 */
	protected void serializeRlu5fDevicePrice(BigDecimal rlu5fDevicePrice) {
		   putDecimal(beginRlu5fDevicePrice,rlu5fDevicePrice,RLU_5F_DEVICE_PRICE_LEN,RLU_5F_DEVICE_PRICE_SCALE,true);
		 localRlu5fDevicePriceCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fDevicePriceMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu5fDevicePrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fDevicePrice() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fDevicePrice,RLU_5F_DEVICE_PRICE_LEN,RLU_5F_DEVICE_PRICE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDevicePrice", beginRlu5fDevicePrice,RLU_5F_DEVICE_PRICE_LEN);
     }
   	}
     int localRlu5fCellcryptDiscAmtCounter = -1;
     public boolean isRlu5fCellcryptDiscAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fCellcryptDiscAmtCounter != sharedCounter;
         localRlu5fCellcryptDiscAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_CELLCRYPT_DISC_AMT_LEN = 13;
	/**
	 * 	serialize this Rlu5fCellcryptDiscAmt
	 */
   protected void serializeRlu5fCellcryptDiscAmt(char[] rlu5fCellcryptDiscAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fCellcryptDiscAmt,0,getStringValue(),beginRlu5fCellcryptDiscAmt,RLU_5F_CELLCRYPT_DISC_AMT_LEN);
       localRlu5fCellcryptDiscAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fCellcryptDiscAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshRlu5fCellcryptDiscAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fCellcryptDiscAmt() {	 
   		return (substring(getStringValue(),beginRlu5fCellcryptDiscAmt,beginRlu5fCellcryptDiscAmt + RLU_5F_CELLCRYPT_DISC_AMT_LEN));
   	}
        int localRlu5fPlanAmountAfterDiscCounter = -1;
        public boolean isRlu5fPlanAmountAfterDiscModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fPlanAmountAfterDiscCounter != sharedCounter;
           localRlu5fPlanAmountAfterDiscCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fPlanAmountAfterDiscIsNumeric() {
	      return decimalIsNumeric(beginRlu5fPlanAmountAfterDisc,RLU_5F_PLAN_AMOUNT_AFTER_DISC_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fPlanAmountAfterDiscString() {
            return getPackedString(beginRlu5fPlanAmountAfterDisc,RLU_5F_PLAN_AMOUNT_AFTER_DISC_LEN);
         }
   protected static final int RLU_5F_PLAN_AMOUNT_AFTER_DISC_LEN = 6;
   protected static final int RLU_5F_PLAN_AMOUNT_AFTER_DISC_SCALE = 2;
  	/**
	 * 	serializeRlu5fPlanAmountAfterDisc
	 */
	protected void serializeRlu5fPlanAmountAfterDisc(BigDecimal rlu5fPlanAmountAfterDisc) {
		   putDecimal(beginRlu5fPlanAmountAfterDisc,rlu5fPlanAmountAfterDisc,RLU_5F_PLAN_AMOUNT_AFTER_DISC_LEN,RLU_5F_PLAN_AMOUNT_AFTER_DISC_SCALE,true);
		 localRlu5fPlanAmountAfterDiscCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fPlanAmountAfterDiscMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu5fPlanAmountAfterDisc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fPlanAmountAfterDisc() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fPlanAmountAfterDisc,RLU_5F_PLAN_AMOUNT_AFTER_DISC_LEN,RLU_5F_PLAN_AMOUNT_AFTER_DISC_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fPlanAmountAfterDisc", beginRlu5fPlanAmountAfterDisc,RLU_5F_PLAN_AMOUNT_AFTER_DISC_LEN);
     }
   	}
     int localRlu5fOnetimeNewIndCounter = -1;
     public boolean isRlu5fOnetimeNewIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fOnetimeNewIndCounter != sharedCounter;
         localRlu5fOnetimeNewIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_ONETIME_NEW_IND_LEN = 1;
	/**
	 * 	serialize this Rlu5fOnetimeNewInd
	 */
   protected void serializeRlu5fOnetimeNewInd(char[] rlu5fOnetimeNewInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fOnetimeNewInd,0,getStringValue(),beginRlu5fOnetimeNewInd,RLU_5F_ONETIME_NEW_IND_LEN);
       localRlu5fOnetimeNewIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fOnetimeNewIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRlu5fOnetimeNewInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fOnetimeNewInd() {	 
   		return (substring(getStringValue(),beginRlu5fOnetimeNewInd,beginRlu5fOnetimeNewInd + RLU_5F_ONETIME_NEW_IND_LEN));
   	}
        int localRlu5fOverageBillableQtyCounter = -1;
        public boolean isRlu5fOverageBillableQtyModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fOverageBillableQtyCounter != sharedCounter;
           localRlu5fOverageBillableQtyCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fOverageBillableQtyIsNumeric() {
	      return decimalIsNumeric(beginRlu5fOverageBillableQty,RLU_5F_OVERAGE_BILLABLE_QTY_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fOverageBillableQtyString() {
            return getPackedString(beginRlu5fOverageBillableQty,RLU_5F_OVERAGE_BILLABLE_QTY_LEN);
         }
   protected static final int RLU_5F_OVERAGE_BILLABLE_QTY_LEN = 7;
   protected static final int RLU_5F_OVERAGE_BILLABLE_QTY_SCALE = 3;
  	/**
	 * 	serializeRlu5fOverageBillableQty
	 */
	protected void serializeRlu5fOverageBillableQty(BigDecimal rlu5fOverageBillableQty) {
		   putDecimal(beginRlu5fOverageBillableQty,rlu5fOverageBillableQty,RLU_5F_OVERAGE_BILLABLE_QTY_LEN,RLU_5F_OVERAGE_BILLABLE_QTY_SCALE,true);
		 localRlu5fOverageBillableQtyCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fOverageBillableQtyMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshRlu5fOverageBillableQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fOverageBillableQty() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fOverageBillableQty,RLU_5F_OVERAGE_BILLABLE_QTY_LEN,RLU_5F_OVERAGE_BILLABLE_QTY_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fOverageBillableQty", beginRlu5fOverageBillableQty,RLU_5F_OVERAGE_BILLABLE_QTY_LEN);
     }
   	}
        int localRlu5fOverageRateCounter = -1;
        public boolean isRlu5fOverageRateModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fOverageRateCounter != sharedCounter;
           localRlu5fOverageRateCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fOverageRateIsNumeric() {
	      return decimalIsNumeric(beginRlu5fOverageRate,RLU_5F_OVERAGE_RATE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fOverageRateString() {
            return getPackedString(beginRlu5fOverageRate,RLU_5F_OVERAGE_RATE_LEN);
         }
   protected static final int RLU_5F_OVERAGE_RATE_LEN = 3;
   protected static final int RLU_5F_OVERAGE_RATE_SCALE = 2;
  	/**
	 * 	serializeRlu5fOverageRate
	 */
	protected void serializeRlu5fOverageRate(BigDecimal rlu5fOverageRate) {
		   putDecimal(beginRlu5fOverageRate,rlu5fOverageRate,RLU_5F_OVERAGE_RATE_LEN,RLU_5F_OVERAGE_RATE_SCALE,true);
		 localRlu5fOverageRateCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fOverageRateMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }
     /**
	 *	refreshRlu5fOverageRate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fOverageRate() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fOverageRate,RLU_5F_OVERAGE_RATE_LEN,RLU_5F_OVERAGE_RATE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fOverageRate", beginRlu5fOverageRate,RLU_5F_OVERAGE_RATE_LEN);
     }
   	}
        int localRlu5fInstallLoanAmountCounter = -1;
        public boolean isRlu5fInstallLoanAmountModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fInstallLoanAmountCounter != sharedCounter;
           localRlu5fInstallLoanAmountCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fInstallLoanAmountIsNumeric() {
	      return decimalIsNumeric(beginRlu5fInstallLoanAmount,RLU_5F_INSTALL_LOAN_AMOUNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fInstallLoanAmountString() {
            return getPackedString(beginRlu5fInstallLoanAmount,RLU_5F_INSTALL_LOAN_AMOUNT_LEN);
         }
   protected static final int RLU_5F_INSTALL_LOAN_AMOUNT_LEN = 6;
   protected static final int RLU_5F_INSTALL_LOAN_AMOUNT_SCALE = 2;
  	/**
	 * 	serializeRlu5fInstallLoanAmount
	 */
	protected void serializeRlu5fInstallLoanAmount(BigDecimal rlu5fInstallLoanAmount) {
		   putDecimal(beginRlu5fInstallLoanAmount,rlu5fInstallLoanAmount,RLU_5F_INSTALL_LOAN_AMOUNT_LEN,RLU_5F_INSTALL_LOAN_AMOUNT_SCALE,true);
		 localRlu5fInstallLoanAmountCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fInstallLoanAmountMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu5fInstallLoanAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fInstallLoanAmount() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fInstallLoanAmount,RLU_5F_INSTALL_LOAN_AMOUNT_LEN,RLU_5F_INSTALL_LOAN_AMOUNT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fInstallLoanAmount", beginRlu5fInstallLoanAmount,RLU_5F_INSTALL_LOAN_AMOUNT_LEN);
     }
   	}
     int localRlu5fVzedgePaymentIndCounter = -1;
     public boolean isRlu5fVzedgePaymentIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fVzedgePaymentIndCounter != sharedCounter;
         localRlu5fVzedgePaymentIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_VZEDGE_PAYMENT_IND_LEN = 1;
	/**
	 * 	serialize this Rlu5fVzedgePaymentInd
	 */
   protected void serializeRlu5fVzedgePaymentInd(char[] rlu5fVzedgePaymentInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fVzedgePaymentInd,0,getStringValue(),beginRlu5fVzedgePaymentInd,RLU_5F_VZEDGE_PAYMENT_IND_LEN);
       localRlu5fVzedgePaymentIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fVzedgePaymentIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRlu5fVzedgePaymentInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fVzedgePaymentInd() {	 
   		return (substring(getStringValue(),beginRlu5fVzedgePaymentInd,beginRlu5fVzedgePaymentInd + RLU_5F_VZEDGE_PAYMENT_IND_LEN));
   	}
        int localRlu5fAccntUsageAllowCounter = -1;
        public boolean isRlu5fAccntUsageAllowModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fAccntUsageAllowCounter != sharedCounter;
           localRlu5fAccntUsageAllowCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fAccntUsageAllowIsNumeric() {
	      return decimalIsNumeric(beginRlu5fAccntUsageAllow,RLU_5F_ACCNT_USAGE_ALLOW_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fAccntUsageAllowString() {
            return getPackedString(beginRlu5fAccntUsageAllow,RLU_5F_ACCNT_USAGE_ALLOW_LEN);
         }
   protected static final int RLU_5F_ACCNT_USAGE_ALLOW_LEN = 7;
   protected static final int RLU_5F_ACCNT_USAGE_ALLOW_SCALE = 3;
  	/**
	 * 	serializeRlu5fAccntUsageAllow
	 */
	protected void serializeRlu5fAccntUsageAllow(BigDecimal rlu5fAccntUsageAllow) {
		   putDecimal(beginRlu5fAccntUsageAllow,rlu5fAccntUsageAllow,RLU_5F_ACCNT_USAGE_ALLOW_LEN,RLU_5F_ACCNT_USAGE_ALLOW_SCALE,true);
		 localRlu5fAccntUsageAllowCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fAccntUsageAllowMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshRlu5fAccntUsageAllow is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fAccntUsageAllow() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fAccntUsageAllow,RLU_5F_ACCNT_USAGE_ALLOW_LEN,RLU_5F_ACCNT_USAGE_ALLOW_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fAccntUsageAllow", beginRlu5fAccntUsageAllow,RLU_5F_ACCNT_USAGE_ALLOW_LEN);
     }
   	}
     int localRlu5fTaxSurchrgRecIndCounter = -1;
     public boolean isRlu5fTaxSurchrgRecIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fTaxSurchrgRecIndCounter != sharedCounter;
         localRlu5fTaxSurchrgRecIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_TAX_SURCHRG_REC_IND_LEN = 1;
	/**
	 * 	serialize this Rlu5fTaxSurchrgRecInd
	 */
   protected void serializeRlu5fTaxSurchrgRecInd(char[] rlu5fTaxSurchrgRecInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fTaxSurchrgRecInd,0,getStringValue(),beginRlu5fTaxSurchrgRecInd,RLU_5F_TAX_SURCHRG_REC_IND_LEN);
       localRlu5fTaxSurchrgRecIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fTaxSurchrgRecIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRlu5fTaxSurchrgRecInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fTaxSurchrgRecInd() {	 
   		return (substring(getStringValue(),beginRlu5fTaxSurchrgRecInd,beginRlu5fTaxSurchrgRecInd + RLU_5F_TAX_SURCHRG_REC_IND_LEN));
   	}
     int localRlu5fOnetimeEventTypeCounter = -1;
     public boolean isRlu5fOnetimeEventTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fOnetimeEventTypeCounter != sharedCounter;
         localRlu5fOnetimeEventTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_ONETIME_EVENT_TYPE_LEN = 4;
	/**
	 * 	serialize this Rlu5fOnetimeEventType
	 */
   protected void serializeRlu5fOnetimeEventType(char[] rlu5fOnetimeEventType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fOnetimeEventType,0,getStringValue(),beginRlu5fOnetimeEventType,RLU_5F_ONETIME_EVENT_TYPE_LEN);
       localRlu5fOnetimeEventTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fOnetimeEventTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRlu5fOnetimeEventType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fOnetimeEventType() {	 
   		return (substring(getStringValue(),beginRlu5fOnetimeEventType,beginRlu5fOnetimeEventType + RLU_5F_ONETIME_EVENT_TYPE_LEN));
   	}
     int localRlu5fTaxSurchargeIndCounter = -1;
     public boolean isRlu5fTaxSurchargeIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fTaxSurchargeIndCounter != sharedCounter;
         localRlu5fTaxSurchargeIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_TAX_SURCHARGE_IND_LEN = 1;
	/**
	 * 	serialize this Rlu5fTaxSurchargeInd
	 */
   protected void serializeRlu5fTaxSurchargeInd(char[] rlu5fTaxSurchargeInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fTaxSurchargeInd,0,getStringValue(),beginRlu5fTaxSurchargeInd,RLU_5F_TAX_SURCHARGE_IND_LEN);
       localRlu5fTaxSurchargeIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fTaxSurchargeIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRlu5fTaxSurchargeInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fTaxSurchargeInd() {	 
   		return (substring(getStringValue(),beginRlu5fTaxSurchargeInd,beginRlu5fTaxSurchargeInd + RLU_5F_TAX_SURCHARGE_IND_LEN));
   	}
     int localRlu5fAcctPlanDetailDescCounter = -1;
     public boolean isRlu5fAcctPlanDetailDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fAcctPlanDetailDescCounter != sharedCounter;
         localRlu5fAcctPlanDetailDescCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_ACCT_PLAN_DETAIL_DESC_LEN = 254;
	/**
	 * 	serialize this Rlu5fAcctPlanDetailDesc
	 */
   protected void serializeRlu5fAcctPlanDetailDesc(char[] rlu5fAcctPlanDetailDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fAcctPlanDetailDesc,0,getStringValue(),beginRlu5fAcctPlanDetailDesc,RLU_5F_ACCT_PLAN_DETAIL_DESC_LEN);
       localRlu5fAcctPlanDetailDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fAcctPlanDetailDescConstraints(char[] value) {
   			return super.checkConstraints(value , 254 ,false, false);
   }
    /**
	 *	refreshRlu5fAcctPlanDetailDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fAcctPlanDetailDesc() {	 
   		return (substring(getStringValue(),beginRlu5fAcctPlanDetailDesc,beginRlu5fAcctPlanDetailDesc + RLU_5F_ACCT_PLAN_DETAIL_DESC_LEN));
   	}
     int localRlu5fSplanCatCdCounter = -1;
     public boolean isRlu5fSplanCatCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fSplanCatCdCounter != sharedCounter;
         localRlu5fSplanCatCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_SPLAN_CAT_CD_LEN = 2;
	/**
	 * 	serialize this Rlu5fSplanCatCd
	 */
   protected void serializeRlu5fSplanCatCd(char[] rlu5fSplanCatCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fSplanCatCd,0,getStringValue(),beginRlu5fSplanCatCd,RLU_5F_SPLAN_CAT_CD_LEN);
       localRlu5fSplanCatCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fSplanCatCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlu5fSplanCatCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fSplanCatCd() {	 
   		return (substring(getStringValue(),beginRlu5fSplanCatCd,beginRlu5fSplanCatCd + RLU_5F_SPLAN_CAT_CD_LEN));
   	}
     int localRlu5fServiceIdCounter = -1;
     public boolean isRlu5fServiceIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fServiceIdCounter != sharedCounter;
         localRlu5fServiceIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_SERVICE_ID_LEN = 15;
	/**
	 * 	serialize this Rlu5fServiceId
	 */
   protected void serializeRlu5fServiceId(char[] rlu5fServiceId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fServiceId,0,getStringValue(),beginRlu5fServiceId,RLU_5F_SERVICE_ID_LEN);
       localRlu5fServiceIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fServiceIdConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshRlu5fServiceId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fServiceId() {	 
   		return (substring(getStringValue(),beginRlu5fServiceId,beginRlu5fServiceId + RLU_5F_SERVICE_ID_LEN));
   	}
        int localRlu5fBuyoutPaymentAmtCounter = -1;
        public boolean isRlu5fBuyoutPaymentAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fBuyoutPaymentAmtCounter != sharedCounter;
           localRlu5fBuyoutPaymentAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fBuyoutPaymentAmtIsNumeric() {
	      return decimalIsNumeric(beginRlu5fBuyoutPaymentAmt,RLU_5F_BUYOUT_PAYMENT_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fBuyoutPaymentAmtString() {
            return getPackedString(beginRlu5fBuyoutPaymentAmt,RLU_5F_BUYOUT_PAYMENT_AMT_LEN);
         }
   protected static final int RLU_5F_BUYOUT_PAYMENT_AMT_LEN = 6;
   protected static final int RLU_5F_BUYOUT_PAYMENT_AMT_SCALE = 2;
  	/**
	 * 	serializeRlu5fBuyoutPaymentAmt
	 */
	protected void serializeRlu5fBuyoutPaymentAmt(BigDecimal rlu5fBuyoutPaymentAmt) {
		   putDecimal(beginRlu5fBuyoutPaymentAmt,rlu5fBuyoutPaymentAmt,RLU_5F_BUYOUT_PAYMENT_AMT_LEN,RLU_5F_BUYOUT_PAYMENT_AMT_SCALE,true);
		 localRlu5fBuyoutPaymentAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fBuyoutPaymentAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu5fBuyoutPaymentAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fBuyoutPaymentAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fBuyoutPaymentAmt,RLU_5F_BUYOUT_PAYMENT_AMT_LEN,RLU_5F_BUYOUT_PAYMENT_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fBuyoutPaymentAmt", beginRlu5fBuyoutPaymentAmt,RLU_5F_BUYOUT_PAYMENT_AMT_LEN);
     }
   	}
        int localRlu5fSciProdIdCounter = -1;
        public boolean isRlu5fSciProdIdModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fSciProdIdCounter != sharedCounter;
           localRlu5fSciProdIdCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fSciProdIdIsNumeric() {
	      return decimalIsNumeric(beginRlu5fSciProdId,RLU_5F_SCI_PROD_ID_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int RLU_5F_SCI_PROD_ID_LEN = 5;
  	/**
	 * 	serializeRlu5fSciProdId
	 */
	protected void serializeRlu5fSciProdId(int rlu5fSciProdId) {
		   putDecimal(beginRlu5fSciProdId,rlu5fSciProdId,RLU_5F_SCI_PROD_ID_LEN,true);
   }
   

   protected int checkRlu5fSciProdIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshRlu5fSciProdId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlu5fSciProdId() throws CFException {	
   	try { 
		 return (getIntDecimal(beginRlu5fSciProdId,RLU_5F_SCI_PROD_ID_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fSciProdId", beginRlu5fSciProdId,RLU_5F_SCI_PROD_ID_LEN);
     }
   	}
     int localRlu5fSubscriptionIndCounter = -1;
     public boolean isRlu5fSubscriptionIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fSubscriptionIndCounter != sharedCounter;
         localRlu5fSubscriptionIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_SUBSCRIPTION_IND_LEN = 1;
	/**
	 * 	serialize this Rlu5fSubscriptionInd
	 */
   protected void serializeRlu5fSubscriptionInd(char[] rlu5fSubscriptionInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fSubscriptionInd,0,getStringValue(),beginRlu5fSubscriptionInd,RLU_5F_SUBSCRIPTION_IND_LEN);
       localRlu5fSubscriptionIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fSubscriptionIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRlu5fSubscriptionInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fSubscriptionInd() {	 
   		return (substring(getStringValue(),beginRlu5fSubscriptionInd,beginRlu5fSubscriptionInd + RLU_5F_SUBSCRIPTION_IND_LEN));
   	}
     int localRlu5fStateCdCounter = -1;
     public boolean isRlu5fStateCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fStateCdCounter != sharedCounter;
         localRlu5fStateCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_STATE_CD_LEN = 2;
	/**
	 * 	serialize this Rlu5fStateCd
	 */
   protected void serializeRlu5fStateCd(char[] rlu5fStateCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fStateCd,0,getStringValue(),beginRlu5fStateCd,RLU_5F_STATE_CD_LEN);
       localRlu5fStateCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fStateCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlu5fStateCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fStateCd() {	 
   		return (substring(getStringValue(),beginRlu5fStateCd,beginRlu5fStateCd + RLU_5F_STATE_CD_LEN));
   	}
     int localRlu5fFootnoteCdCounter = -1;
     public boolean isRlu5fFootnoteCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fFootnoteCdCounter != sharedCounter;
         localRlu5fFootnoteCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_FOOTNOTE_CD_LEN = 1;
	/**
	 * 	serialize this Rlu5fFootnoteCd
	 */
   protected void serializeRlu5fFootnoteCd(char[] rlu5fFootnoteCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fFootnoteCd,0,getStringValue(),beginRlu5fFootnoteCd,RLU_5F_FOOTNOTE_CD_LEN);
       localRlu5fFootnoteCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fFootnoteCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRlu5fFootnoteCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fFootnoteCd() {	 
   		return (substring(getStringValue(),beginRlu5fFootnoteCd,beginRlu5fFootnoteCd + RLU_5F_FOOTNOTE_CD_LEN));
   	}

		public int rlu5fVzedgePaymtSchedSize() {
			return RLU_5F_VZEDGE_PAYMT_SCHED_SIZE;
		}
		public int rlu5fDeviceTaxSize() {
			return RLU_5F_DEVICE_TAX_SIZE;
		}



}
  
