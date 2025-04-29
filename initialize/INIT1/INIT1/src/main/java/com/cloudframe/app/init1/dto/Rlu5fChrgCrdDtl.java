package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fChrgCrdDtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;


public class Rlu5fChrgCrdDtl extends Rlu5fChrgCrdDtlSerialized { 
   

						private char[] rlu5fRecId = Field.fillLowValue(2);

						private char[] rlu5fPgmId = Field.fillLowValue(10);

				private Rlu5fSuppressInd rlu5fSuppressInd = new Rlu5fSuppressInd();

						private char[] rlu5fAccDesc = Field.fillLowValue(50);

								private BigDecimal rlu5fAccAmount = BigDecimal.ZERO;

						private char[] rlu5fAccTypeInd = Field.fillLowValue(2);
				private Rlu5fDateFrom rlu5fDateFrom = new Rlu5fDateFrom();
				private Rlu5fDateTo rlu5fDateTo = new Rlu5fDateTo();

						private char[] rlu5fAccessUsageDesc = Field.fillLowValue(80);

						private char[] rlu5fPlanChngCode = Field.fillLowValue(1);

								private BigDecimal rlu5fPlanChgPerMonth = BigDecimal.ZERO;

								private int rlu5fPlanDays;

						private char[] rlu5fPlanChgInadvInd = Field.fillLowValue(1);

						private char[] rlu5fDiscountInd = Field.fillLowValue(1);

						private char[] rlu5fPlanType = Field.fillLowValue(2);

						private char[] rlu5fUnitType = Field.fillLowValue(2);

						private char[] rlu5fPlanId = Field.fillLowValue(6);

						private char[] rlu5fCurDelayInd = Field.fillLowValue(1);

								private BigDecimal rlu5fDelayShareUsed = BigDecimal.ZERO;

								private BigDecimal rlu5fDelayShareOvrage = BigDecimal.ZERO;

								private BigDecimal rlu5fDiscAmount1 = BigDecimal.ZERO;

								private BigDecimal rlu5fDiscAmount2 = BigDecimal.ZERO;

						private char[] rlu5fBoboVenderName = Field.fillLowValue(10);

						private char[] rlu5fBoboVenderNumber = Field.fillLowValue(10);

						private char[] rlu5fBoboServDesc = Field.fillLowValue(40);

								private BigDecimal rlu5fBoboTaxAmt = BigDecimal.ZERO;

								private BigDecimal rlu5fBoboSurAmt = BigDecimal.ZERO;

								private long rlu5fMsoNumOfPurchases;

						private char[] rlu5fMsoPurchaseDesc = Field.fillLowValue(15);


						private char[] rlu5fMsoDomainName = Field.fillLowValue(65);

								private BigDecimal rlu5fDipLateFee = BigDecimal.ZERO;

								private BigDecimal rlu5fDipFinChgDue = BigDecimal.ZERO;

								private BigDecimal rlu5fDipFinChgPaid = BigDecimal.ZERO;

								private BigDecimal rlu5fDipFinChgPastDue = BigDecimal.ZERO;

								private BigDecimal rlu5fDipBalance = BigDecimal.ZERO;

								private BigDecimal rlu5fDipFinChgBalance = BigDecimal.ZERO;

								private int rlu5fInstallPaymentNum;

								private int rlu5fTotInstallPayments;

								private long rlu5fDipLoanNumber;

						private char[] rlu5fAlpDelayedCapSw = Field.fillLowValue(1);

						private char[] rlu5fAlpUnitType = Field.fillLowValue(2);

								private BigDecimal rlu5fDipSubTotal = BigDecimal.ZERO;

						private char[] rlu5fVzedgeInd = Field.fillLowValue(1);

						private char[] rlu5fVzedgeMsgInd = Field.fillLowValue(1);
			private List<Rlu5fVzedgePaymtSched> rlu5fVzedgePaymtSched = new ArrayList<>();
    	

						private char[] rlu5fCellcryptRenewalDate = Field.fillLowValue(8);
				private Rlu5fCellcryptRenewalRed rlu5fCellcryptRenewalRed = new Rlu5fCellcryptRenewalRed();

						private char[] rlu5fCellcryptActionCode = Field.fillLowValue(1);

								private BigDecimal rlu5fCellcryptUnitCost = BigDecimal.ZERO;

						private char[] rlu5fCellcryptTransactionDt = Field.fillLowValue(8);
				private Rlu5fCellcryptTransactionRd rlu5fCellcryptTransactionRd = new Rlu5fCellcryptTransactionRd();

						private char[] rlu5fCellcryptProrateInd = Field.fillLowValue(1);

						private char[] rlu5fSharedInd = Field.fillLowValue(1);

								private int rlu5fShareSet;

								private BigDecimal rlu5fDevicePrice = BigDecimal.ZERO;
			private List<Rlu5fDeviceTax> rlu5fDeviceTax = new ArrayList<>();
    	

						private char[] rlu5fCellcryptDiscAmt = Field.fillLowValue(13);

								private BigDecimal rlu5fPlanAmountAfterDisc = BigDecimal.ZERO;

						private char[] rlu5fOnetimeNewInd = Field.fillLowValue(1);

								private BigDecimal rlu5fOverageBillableQty = BigDecimal.ZERO;

								private BigDecimal rlu5fOverageRate = BigDecimal.ZERO;

								private BigDecimal rlu5fInstallLoanAmount = BigDecimal.ZERO;

						private char[] rlu5fVzedgePaymentInd = Field.fillLowValue(1);

								private BigDecimal rlu5fAccntUsageAllow = BigDecimal.ZERO;

						private char[] rlu5fTaxSurchrgRecInd = Field.fillLowValue(1);
				private Rlu5fLateFeeDate rlu5fLateFeeDate = new Rlu5fLateFeeDate();

						private char[] rlu5fOnetimeEventType = Field.fillLowValue(4);

						private char[] rlu5fTaxSurchargeInd = Field.fillLowValue(1);

						private char[] rlu5fAcctPlanDetailDesc = Field.fillLowValue(254);
				private Rlu5fStartDate rlu5fStartDate = new Rlu5fStartDate();
				private Rlu5fEndDate rlu5fEndDate = new Rlu5fEndDate();

						private char[] rlu5fSplanCatCd = Field.fillLowValue(2);

						private char[] rlu5fServiceId = Field.fillLowValue(15);
				private Rlu5fBuyoutPaymentDate rlu5fBuyoutPaymentDate = new Rlu5fBuyoutPaymentDate();

								private BigDecimal rlu5fBuyoutPaymentAmt = BigDecimal.ZERO;

								private int rlu5fSciProdId;

						private char[] rlu5fSubscriptionInd = Field.fillLowValue(1);

						private char[] rlu5fStateCd = Field.fillLowValue(2);

						private char[] rlu5fFootnoteCd = Field.fillLowValue(1);

	
	/**
	* Constructor for Rlu5fChrgCrdDtl
	**/
    public Rlu5fChrgCrdDtl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rlu5fChrgCrdDtl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fChrgCrdDtl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			rlu5fSuppressInd.setParent(this,getStartOffset() + 28);
	       			rlu5fDateFrom.setParent(this,getStartOffset() + 89);
	       			rlu5fDateTo.setParent(this,getStartOffset() + 97);
				for (int arrayIndex = 0; arrayIndex < RLU_5F_VZEDGE_PAYMT_SCHED_SIZE;arrayIndex++) {
						rlu5fVzedgePaymtSched.add(new Rlu5fVzedgePaymtSched(this, beginRlu5fVzedgePaymtSched + 
						arrayIndex * Rlu5fVzedgePaymtSched.getRlu5fVzedgePaymtSchedFieldLength()));
				}
	       			rlu5fCellcryptRenewalRed.setParent(this,getStartOffset() + 650);
	       			rlu5fCellcryptTransactionRd.setParent(this,getStartOffset() + 665);
				for (int arrayIndex = 0; arrayIndex < RLU_5F_DEVICE_TAX_SIZE;arrayIndex++) {
						rlu5fDeviceTax.add(new Rlu5fDeviceTax(this, beginRlu5fDeviceTax + 
						arrayIndex * Rlu5fDeviceTax.getRlu5fDeviceTaxFieldLength()));
				}
	       			rlu5fLateFeeDate.setParent(this,getStartOffset() + 1011);
	       			rlu5fStartDate.setParent(this,getStartOffset() + 1278);
	       			rlu5fEndDate.setParent(this,getStartOffset() + 1286);
	       			rlu5fBuyoutPaymentDate.setParent(this,getStartOffset() + 1311);
    } 

	/**
	 *	Returns the value of rlu5fRecId
	 *	@return rlu5fRecId
	 */
   public char[] getRlu5fRecId() throws CFException{
     if (isRlu5fRecIdModified()) { 
        rlu5fRecId = refreshRlu5fRecId();
     }
   		return rlu5fRecId;
   }

  
	/**
	*  set variable rlu5fRecId
	*  Corresponding COBOL Variable is RLU5F-REC-ID
	*  @param value
	**/
   public void setRlu5fRecId(char[] value) {
      rlu5fRecId = checkRlu5fRecIdConstraints(value);
      serializeRlu5fRecId(rlu5fRecId);
   } 

     /**
	 * 	Update Rlu5fRecId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fRecId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fRecId,rlu5fRecId.length);
   	
   }
   
   public void setRlu5fRecId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fRecId,rlu5fRecId.length);
   	
   }
   
     /**
	 * 	Update Rlu5fRecId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fRecId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fRecId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fRecId with another Field
	 *	@param value
	 */
   public void setRlu5fRecId(Field source) {
       replace(source,0,source.length(),beginRlu5fRecId,RLU_5F_REC_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fRecId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fRecId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fRecId,RLU_5F_REC_ID_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fRecId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fRecId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fRecId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fPgmId
	 *	@return rlu5fPgmId
	 */
   public char[] getRlu5fPgmId() throws CFException{
     if (isRlu5fPgmIdModified()) { 
        rlu5fPgmId = refreshRlu5fPgmId();
     }
   		return rlu5fPgmId;
   }

  
	/**
	*  set variable rlu5fPgmId
	*  Corresponding COBOL Variable is RLU5F-PGM-ID
	*  @param value
	**/
   public void setRlu5fPgmId(char[] value) {
      rlu5fPgmId = checkRlu5fPgmIdConstraints(value);
      serializeRlu5fPgmId(rlu5fPgmId);
   } 

     /**
	 * 	Update Rlu5fPgmId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fPgmId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fPgmId,rlu5fPgmId.length);
   	
   }
   
   public void setRlu5fPgmId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fPgmId,rlu5fPgmId.length);
   	
   }
   
     /**
	 * 	Update Rlu5fPgmId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fPgmId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fPgmId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fPgmId with another Field
	 *	@param value
	 */
   public void setRlu5fPgmId(Field source) {
       replace(source,0,source.length(),beginRlu5fPgmId,RLU_5F_PGM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fPgmId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fPgmId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fPgmId,RLU_5F_PGM_ID_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fPgmId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fPgmId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fPgmId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fSuppressInd
	 *	@return rlu5fSuppressInd
	 */   
	 public Rlu5fSuppressInd getRlu5fSuppressInd() {
   	return rlu5fSuppressInd;
   }
   /**
	* 	Update Rlu5fSuppressInd with the passed value
	*   Corresponding COBOL Variable is RLU5F-SUPPRESS-IND
	*	@param value
	*/
   public void setRlu5fSuppressInd(char[] value) {
      rlu5fSuppressInd.setString(value); 
   }   
    
     /**
	 * 	Update Rlu5fSuppressInd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlu5fSuppressInd(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fSuppressInd.begin,rlu5fSuppressInd.length());
   }
   
     /**
	 * 	Update Rlu5fSuppressInd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fSuppressInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fSuppressInd.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Rlu5fSuppressInd with another Field
	 *	@param value
	 */
   public void setRlu5fSuppressInd(Field source) {
   	replace(source,0,source.length(),rlu5fSuppressInd.begin,rlu5fSuppressInd.length());
   }  
   
     /**
	 * 	Update Rlu5fSuppressInd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlu5fSuppressInd(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fSuppressInd.begin,rlu5fSuppressInd.length());
   }
   
     /**
	 * 	Update Rlu5fSuppressInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fSuppressInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fSuppressInd.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rlu5fAccDesc
	 *	@return rlu5fAccDesc
	 */
   public char[] getRlu5fAccDesc() throws CFException{
     if (isRlu5fAccDescModified()) { 
        rlu5fAccDesc = refreshRlu5fAccDesc();
     }
   		return rlu5fAccDesc;
   }

  
	/**
	*  set variable rlu5fAccDesc
	*  Corresponding COBOL Variable is RLU5F-ACC-DESC
	*  @param value
	**/
   public void setRlu5fAccDesc(char[] value) {
      rlu5fAccDesc = checkRlu5fAccDescConstraints(value);
      serializeRlu5fAccDesc(rlu5fAccDesc);
   } 

     /**
	 * 	Update Rlu5fAccDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fAccDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fAccDesc,rlu5fAccDesc.length);
   	
   }
   
   public void setRlu5fAccDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fAccDesc,rlu5fAccDesc.length);
   	
   }
   
     /**
	 * 	Update Rlu5fAccDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fAccDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fAccDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fAccDesc with another Field
	 *	@param value
	 */
   public void setRlu5fAccDesc(Field source) {
       replace(source,0,source.length(),beginRlu5fAccDesc,RLU_5F_ACC_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fAccDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fAccDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fAccDesc,RLU_5F_ACC_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fAccDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fAccDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fAccDesc+targetIndex,targetLen);
    
   }
	public BigDecimal getRlu5fAccAmount() throws CFException {
        if (isRlu5fAccAmountModified()) { 
           rlu5fAccAmount = refreshRlu5fAccAmount();
        }
   		return rlu5fAccAmount;
	}

    public char[] getRlu5fAccAmountString() {
          return  rlu5fAccAmountString();
    }
	
	/**
	 * 	Update Rlu5fAccAmount with the passed number
	 *  Corresponding COBOL Variable is RLU5F-ACC-AMOUNT
	 *	@param number
	 */
	public void setRlu5fAccAmount(BigDecimal number) {	
     rlu5fAccAmount = checkRlu5fAccAmountMaxLimit(number);
	    serializeRlu5fAccAmount(rlu5fAccAmount);
   }
	/**
	 *	Returns the value of rlu5fAccTypeInd
	 *	@return rlu5fAccTypeInd
	 */
   public char[] getRlu5fAccTypeInd() throws CFException{
     if (isRlu5fAccTypeIndModified()) { 
        rlu5fAccTypeInd = refreshRlu5fAccTypeInd();
     }
   		return rlu5fAccTypeInd;
   }

  
	/**
	*  set variable rlu5fAccTypeInd
	*  Corresponding COBOL Variable is RLU5F-ACC-TYPE-IND
	*  @param value
	**/
   public void setRlu5fAccTypeInd(char[] value) {
      rlu5fAccTypeInd = checkRlu5fAccTypeIndConstraints(value);
      serializeRlu5fAccTypeInd(rlu5fAccTypeInd);
   } 

     /**
	 * 	Update Rlu5fAccTypeInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fAccTypeInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fAccTypeInd,rlu5fAccTypeInd.length);
   	
   }
   
   public void setRlu5fAccTypeInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fAccTypeInd,rlu5fAccTypeInd.length);
   	
   }
   
     /**
	 * 	Update Rlu5fAccTypeInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fAccTypeInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fAccTypeInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fAccTypeInd with another Field
	 *	@param value
	 */
   public void setRlu5fAccTypeInd(Field source) {
       replace(source,0,source.length(),beginRlu5fAccTypeInd,RLU_5F_ACC_TYPE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fAccTypeInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fAccTypeInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fAccTypeInd,RLU_5F_ACC_TYPE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fAccTypeInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fAccTypeInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fAccTypeInd+targetIndex,targetLen);
    
   }
	char[] rlu5fAcCc88Value = "CC".toCharArray();
	/**
	 *	Test condition "CC" for isRlu5fAcCc()
	 *	@return  Returns true if isRlu5fAcCc() is "CC"
	 */
   public boolean isRlu5fAcCc() throws CFException {
      return (  compareChars( getRlu5fAccTypeInd() , rlu5fAcCc88Value)  == 0  );
   }


	/**
	*  set values "CC"
	*/
   	public void setRlu5fAcCcTrue() {  			
    	setRlu5fAccTypeInd( rlu5fAcCc88Value);
   	}
	char[] rlu5fAccessCc88Value = "MC".toCharArray();
	/**
	 *	Test condition "MC" for isRlu5fAccessCc()
	 *	@return  Returns true if isRlu5fAccessCc() is "MC"
	 */
   public boolean isRlu5fAccessCc() throws CFException {
      return (  compareChars( getRlu5fAccTypeInd() , rlu5fAccessCc88Value)  == 0  );
   }


	/**
	*  set values "MC"
	*/
   	public void setRlu5fAccessCcTrue() {  			
    	setRlu5fAccTypeInd( rlu5fAccessCc88Value);
   	}
	char[] rlu5fUsgeCc88Value = "UC".toCharArray();
	/**
	 *	Test condition "UC" for isRlu5fUsgeCc()
	 *	@return  Returns true if isRlu5fUsgeCc() is "UC"
	 */
   public boolean isRlu5fUsgeCc() throws CFException {
      return (  compareChars( getRlu5fAccTypeInd() , rlu5fUsgeCc88Value)  == 0  );
   }


	/**
	*  set values "UC"
	*/
   	public void setRlu5fUsgeCcTrue() {  			
    	setRlu5fAccTypeInd( rlu5fUsgeCc88Value);
   	}
	char[] rlu5fBoboCc88Value = "BO".toCharArray();
	/**
	 *	Test condition "BO" for isRlu5fBoboCc()
	 *	@return  Returns true if isRlu5fBoboCc() is "BO"
	 */
   public boolean isRlu5fBoboCc() throws CFException {
      return (  compareChars( getRlu5fAccTypeInd() , rlu5fBoboCc88Value)  == 0  );
   }


	/**
	*  set values "BO"
	*/
   	public void setRlu5fBoboCcTrue() {  			
    	setRlu5fAccTypeInd( rlu5fBoboCc88Value);
   	}
	char[] rlu5fMsoCc88Value = "MS".toCharArray();
	/**
	 *	Test condition "MS" for isRlu5fMsoCc()
	 *	@return  Returns true if isRlu5fMsoCc() is "MS"
	 */
   public boolean isRlu5fMsoCc() throws CFException {
      return (  compareChars( getRlu5fAccTypeInd() , rlu5fMsoCc88Value)  == 0  );
   }


	/**
	*  set values "MS"
	*/
   	public void setRlu5fMsoCcTrue() {  			
    	setRlu5fAccTypeInd( rlu5fMsoCc88Value);
   	}
	char[] rlu5fGoDaddy88Value = "GD".toCharArray();
	/**
	 *	Test condition "GD" for isRlu5fGoDaddy()
	 *	@return  Returns true if isRlu5fGoDaddy() is "GD"
	 */
   public boolean isRlu5fGoDaddy() throws CFException {
      return (  compareChars( getRlu5fAccTypeInd() , rlu5fGoDaddy88Value)  == 0  );
   }


	/**
	*  set values "GD"
	*/
   	public void setRlu5fGoDaddyTrue() {  			
    	setRlu5fAccTypeInd( rlu5fGoDaddy88Value);
   	}
	char[] rlu5fUsgeDi88Value = "DI".toCharArray();
	/**
	 *	Test condition "DI" for isRlu5fUsgeDi()
	 *	@return  Returns true if isRlu5fUsgeDi() is "DI"
	 */
   public boolean isRlu5fUsgeDi() throws CFException {
      return (  compareChars( getRlu5fAccTypeInd() , rlu5fUsgeDi88Value)  == 0  );
   }


	/**
	*  set values "DI"
	*/
   	public void setRlu5fUsgeDiTrue() {  			
    	setRlu5fAccTypeInd( rlu5fUsgeDi88Value);
   	}
	char[] rlu5fVzedge88Value = "VE".toCharArray();
	/**
	 *	Test condition "VE" for isRlu5fVzedge()
	 *	@return  Returns true if isRlu5fVzedge() is "VE"
	 */
   public boolean isRlu5fVzedge() throws CFException {
      return (  compareChars( getRlu5fAccTypeInd() , rlu5fVzedge88Value)  == 0  );
   }


	/**
	*  set values "VE"
	*/
   	public void setRlu5fVzedgeTrue() {  			
    	setRlu5fAccTypeInd( rlu5fVzedge88Value);
   	}
	char[] rlu5fCellcrypt88Value = "CL".toCharArray();
	/**
	 *	Test condition "CL" for isRlu5fCellcrypt()
	 *	@return  Returns true if isRlu5fCellcrypt() is "CL"
	 */
   public boolean isRlu5fCellcrypt() throws CFException {
      return (  compareChars( getRlu5fAccTypeInd() , rlu5fCellcrypt88Value)  == 0  );
   }


	/**
	*  set values "CL"
	*/
   	public void setRlu5fCellcryptTrue() {  			
    	setRlu5fAccTypeInd( rlu5fCellcrypt88Value);
   	}
	char[] rlu5fSecureCloud88Value = "SC".toCharArray();
	/**
	 *	Test condition "SC" for isRlu5fSecureCloud()
	 *	@return  Returns true if isRlu5fSecureCloud() is "SC"
	 */
   public boolean isRlu5fSecureCloud() throws CFException {
      return (  compareChars( getRlu5fAccTypeInd() , rlu5fSecureCloud88Value)  == 0  );
   }


	/**
	*  set values "SC"
	*/
   	public void setRlu5fSecureCloudTrue() {  			
    	setRlu5fAccTypeInd( rlu5fSecureCloud88Value);
   	}
	char[] rlu5fNetwf88Value = "F1".toCharArray();
	/**
	 *	Test condition "F1" for isRlu5fNetwf()
	 *	@return  Returns true if isRlu5fNetwf() is "F1"
	 */
   public boolean isRlu5fNetwf() throws CFException {
      return (  compareChars( getRlu5fAccTypeInd() , rlu5fNetwf88Value)  == 0  );
   }


	/**
	*  set values "F1"
	*/
   	public void setRlu5fNetwfTrue() {  			
    	setRlu5fAccTypeInd( rlu5fNetwf88Value);
   	}
	char[] rlu5fFleet88Value = "F2".toCharArray();
	/**
	 *	Test condition "F2" for isRlu5fFleet()
	 *	@return  Returns true if isRlu5fFleet() is "F2"
	 */
   public boolean isRlu5fFleet() throws CFException {
      return (  compareChars( getRlu5fAccTypeInd() , rlu5fFleet88Value)  == 0  );
   }


	/**
	*  set values "F2"
	*/
   	public void setRlu5fFleetTrue() {  			
    	setRlu5fAccTypeInd( rlu5fFleet88Value);
   	}
	char[] rlu5fTelgs88Value = "F3".toCharArray();
	/**
	 *	Test condition "F3" for isRlu5fTelgs()
	 *	@return  Returns true if isRlu5fTelgs() is "F3"
	 */
   public boolean isRlu5fTelgs() throws CFException {
      return (  compareChars( getRlu5fAccTypeInd() , rlu5fTelgs88Value)  == 0  );
   }


	/**
	*  set values "F3"
	*/
   	public void setRlu5fTelgsTrue() {  			
    	setRlu5fAccTypeInd( rlu5fTelgs88Value);
   	}
	/**
	 *	Returns the value of rlu5fDateFrom
	 *	@return rlu5fDateFrom
	 */   
	 public Rlu5fDateFrom getRlu5fDateFrom() {
   	return rlu5fDateFrom;
   }
   /**
	* 	Update Rlu5fDateFrom with the passed value
	*   Corresponding COBOL Variable is RLU5F-DATE-FROM
	*	@param value
	*/
   public void setRlu5fDateFrom(char[] value) {
      rlu5fDateFrom.setString(value); 
   }   
    
     /**
	 * 	Update Rlu5fDateFrom 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlu5fDateFrom(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fDateFrom.begin,rlu5fDateFrom.length());
   }
   
     /**
	 * 	Update Rlu5fDateFrom 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fDateFrom(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fDateFrom.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Rlu5fDateFrom with another Field
	 *	@param value
	 */
   public void setRlu5fDateFrom(Field source) {
   	replace(source,0,source.length(),rlu5fDateFrom.begin,rlu5fDateFrom.length());
   }  
   
     /**
	 * 	Update Rlu5fDateFrom 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlu5fDateFrom(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fDateFrom.begin,rlu5fDateFrom.length());
   }
   
     /**
	 * 	Update Rlu5fDateFrom 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fDateFrom(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fDateFrom.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rlu5fDateTo
	 *	@return rlu5fDateTo
	 */   
	 public Rlu5fDateTo getRlu5fDateTo() {
   	return rlu5fDateTo;
   }
   /**
	* 	Update Rlu5fDateTo with the passed value
	*   Corresponding COBOL Variable is RLU5F-DATE-TO
	*	@param value
	*/
   public void setRlu5fDateTo(char[] value) {
      rlu5fDateTo.setString(value); 
   }   
    
     /**
	 * 	Update Rlu5fDateTo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlu5fDateTo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fDateTo.begin,rlu5fDateTo.length());
   }
   
     /**
	 * 	Update Rlu5fDateTo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fDateTo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fDateTo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Rlu5fDateTo with another Field
	 *	@param value
	 */
   public void setRlu5fDateTo(Field source) {
   	replace(source,0,source.length(),rlu5fDateTo.begin,rlu5fDateTo.length());
   }  
   
     /**
	 * 	Update Rlu5fDateTo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlu5fDateTo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fDateTo.begin,rlu5fDateTo.length());
   }
   
     /**
	 * 	Update Rlu5fDateTo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fDateTo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fDateTo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rlu5fAccessUsageDesc
	 *	@return rlu5fAccessUsageDesc
	 */
   public char[] getRlu5fAccessUsageDesc() throws CFException{
     if (isRlu5fAccessUsageDescModified()) { 
        rlu5fAccessUsageDesc = refreshRlu5fAccessUsageDesc();
     }
   		return rlu5fAccessUsageDesc;
   }

  
	/**
	*  set variable rlu5fAccessUsageDesc
	*  Corresponding COBOL Variable is RLU5F-ACCESS-USAGE-DESC
	*  @param value
	**/
   public void setRlu5fAccessUsageDesc(char[] value) {
      rlu5fAccessUsageDesc = checkRlu5fAccessUsageDescConstraints(value);
      serializeRlu5fAccessUsageDesc(rlu5fAccessUsageDesc);
   } 

     /**
	 * 	Update Rlu5fAccessUsageDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fAccessUsageDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fAccessUsageDesc,rlu5fAccessUsageDesc.length);
   	
   }
   
   public void setRlu5fAccessUsageDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fAccessUsageDesc,rlu5fAccessUsageDesc.length);
   	
   }
   
     /**
	 * 	Update Rlu5fAccessUsageDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fAccessUsageDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fAccessUsageDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fAccessUsageDesc with another Field
	 *	@param value
	 */
   public void setRlu5fAccessUsageDesc(Field source) {
       replace(source,0,source.length(),beginRlu5fAccessUsageDesc,RLU_5F_ACCESS_USAGE_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fAccessUsageDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fAccessUsageDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fAccessUsageDesc,RLU_5F_ACCESS_USAGE_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fAccessUsageDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fAccessUsageDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fAccessUsageDesc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fPlanChngCode
	 *	@return rlu5fPlanChngCode
	 */
   public char[] getRlu5fPlanChngCode() throws CFException{
     if (isRlu5fPlanChngCodeModified()) { 
        rlu5fPlanChngCode = refreshRlu5fPlanChngCode();
     }
   		return rlu5fPlanChngCode;
   }

  
	/**
	*  set variable rlu5fPlanChngCode
	*  Corresponding COBOL Variable is RLU5F-PLAN-CHNG-CODE
	*  @param value
	**/
   public void setRlu5fPlanChngCode(char[] value) {
      rlu5fPlanChngCode = checkRlu5fPlanChngCodeConstraints(value);
      serializeRlu5fPlanChngCode(rlu5fPlanChngCode);
   } 

     /**
	 * 	Update Rlu5fPlanChngCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fPlanChngCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fPlanChngCode,rlu5fPlanChngCode.length);
   	
   }
   
   public void setRlu5fPlanChngCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fPlanChngCode,rlu5fPlanChngCode.length);
   	
   }
   
     /**
	 * 	Update Rlu5fPlanChngCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fPlanChngCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fPlanChngCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fPlanChngCode with another Field
	 *	@param value
	 */
   public void setRlu5fPlanChngCode(Field source) {
       replace(source,0,source.length(),beginRlu5fPlanChngCode,RLU_5F_PLAN_CHNG_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fPlanChngCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fPlanChngCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fPlanChngCode,RLU_5F_PLAN_CHNG_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fPlanChngCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fPlanChngCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fPlanChngCode+targetIndex,targetLen);
    
   }
	char[] rlu5fOldPlan88Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isRlu5fOldPlan()
	 *	@return  Returns true if isRlu5fOldPlan() is "O"
	 */
   public boolean isRlu5fOldPlan() throws CFException {
      return (  compareChars( getRlu5fPlanChngCode() , rlu5fOldPlan88Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setRlu5fOldPlanTrue() {  			
    	setRlu5fPlanChngCode( rlu5fOldPlan88Value);
   	}
	char[] rlu5fCurPlan88Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isRlu5fCurPlan()
	 *	@return  Returns true if isRlu5fCurPlan() is "C"
	 */
   public boolean isRlu5fCurPlan() throws CFException {
      return (  compareChars( getRlu5fPlanChngCode() , rlu5fCurPlan88Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setRlu5fCurPlanTrue() {  			
    	setRlu5fPlanChngCode( rlu5fCurPlan88Value);
   	}
	char[] rlu5fNewPlan88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isRlu5fNewPlan()
	 *	@return  Returns true if isRlu5fNewPlan() is "N"
	 */
   public boolean isRlu5fNewPlan() throws CFException {
      return (  compareChars( getRlu5fPlanChngCode() , rlu5fNewPlan88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setRlu5fNewPlanTrue() {  			
    	setRlu5fPlanChngCode( rlu5fNewPlan88Value);
   	}
	public BigDecimal getRlu5fPlanChgPerMonth() throws CFException {
        if (isRlu5fPlanChgPerMonthModified()) { 
           rlu5fPlanChgPerMonth = refreshRlu5fPlanChgPerMonth();
        }
   		return rlu5fPlanChgPerMonth;
	}

    public char[] getRlu5fPlanChgPerMonthString() {
          return  rlu5fPlanChgPerMonthString();
    }
	
	/**
	 * 	Update Rlu5fPlanChgPerMonth with the passed number
	 *  Corresponding COBOL Variable is RLU5F-PLAN-CHG-PER-MONTH
	 *	@param number
	 */
	public void setRlu5fPlanChgPerMonth(BigDecimal number) {	
     rlu5fPlanChgPerMonth = checkRlu5fPlanChgPerMonthMaxLimit(number);
	    serializeRlu5fPlanChgPerMonth(rlu5fPlanChgPerMonth);
   }
	/**
	 *	Returns the value of rlu5fPlanDays
	 *	@return rlu5fPlanDays
	 */
	public int getRlu5fPlanDays() throws CFException {
       if (isRlu5fPlanDaysModified()) { 
           rlu5fPlanDays = refreshRlu5fPlanDays();
        }
   		return rlu5fPlanDays;
	}
	

	
	   
	/**
	 * 	Update Rlu5fPlanDays with the passed value
	 *  Corresponding COBOL Variable is RLU5F-PLAN-DAYS
	 *	@param number
	 */
	public void setRlu5fPlanDays(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fPlanDays = checkRlu5fPlanDaysMaxLimit(number); 
		serializeRlu5fPlanDays(rlu5fPlanDays);
	}
	

	public void setRlu5fPlanDays(long number) {
	    number = checkRlu5fPlanDaysMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fPlanDays((int)number);
	}
	
	/**
	 * 	Update Rlu5fPlanDays with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fPlanDays(char[] value) throws CFException {
		 rlu5fPlanDays = serializeRlu5fPlanDays(value);
	}
	/**
	 * 	Update Rlu5fPlanDays with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fPlanDaysString(char[] value) throws CFException {
		 setRlu5fPlanDays(value);
	}
	/**
	 *	Returns the value of rlu5fPlanChgInadvInd
	 *	@return rlu5fPlanChgInadvInd
	 */
   public char[] getRlu5fPlanChgInadvInd() throws CFException{
     if (isRlu5fPlanChgInadvIndModified()) { 
        rlu5fPlanChgInadvInd = refreshRlu5fPlanChgInadvInd();
     }
   		return rlu5fPlanChgInadvInd;
   }

  
	/**
	*  set variable rlu5fPlanChgInadvInd
	*  Corresponding COBOL Variable is RLU5F-PLAN-CHG-INADV-IND
	*  @param value
	**/
   public void setRlu5fPlanChgInadvInd(char[] value) {
      rlu5fPlanChgInadvInd = checkRlu5fPlanChgInadvIndConstraints(value);
      serializeRlu5fPlanChgInadvInd(rlu5fPlanChgInadvInd);
   } 

     /**
	 * 	Update Rlu5fPlanChgInadvInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fPlanChgInadvInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fPlanChgInadvInd,rlu5fPlanChgInadvInd.length);
   	
   }
   
   public void setRlu5fPlanChgInadvInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fPlanChgInadvInd,rlu5fPlanChgInadvInd.length);
   	
   }
   
     /**
	 * 	Update Rlu5fPlanChgInadvInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fPlanChgInadvInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fPlanChgInadvInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fPlanChgInadvInd with another Field
	 *	@param value
	 */
   public void setRlu5fPlanChgInadvInd(Field source) {
       replace(source,0,source.length(),beginRlu5fPlanChgInadvInd,RLU_5F_PLAN_CHG_INADV_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fPlanChgInadvInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fPlanChgInadvInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fPlanChgInadvInd,RLU_5F_PLAN_CHG_INADV_IND_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fPlanChgInadvInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fPlanChgInadvInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fPlanChgInadvInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fDiscountInd
	 *	@return rlu5fDiscountInd
	 */
   public char[] getRlu5fDiscountInd() throws CFException{
     if (isRlu5fDiscountIndModified()) { 
        rlu5fDiscountInd = refreshRlu5fDiscountInd();
     }
   		return rlu5fDiscountInd;
   }

  
	/**
	*  set variable rlu5fDiscountInd
	*  Corresponding COBOL Variable is RLU5F-DISCOUNT-IND
	*  @param value
	**/
   public void setRlu5fDiscountInd(char[] value) {
      rlu5fDiscountInd = checkRlu5fDiscountIndConstraints(value);
      serializeRlu5fDiscountInd(rlu5fDiscountInd);
   } 

     /**
	 * 	Update Rlu5fDiscountInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fDiscountInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fDiscountInd,rlu5fDiscountInd.length);
   	
   }
   
   public void setRlu5fDiscountInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fDiscountInd,rlu5fDiscountInd.length);
   	
   }
   
     /**
	 * 	Update Rlu5fDiscountInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fDiscountInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fDiscountInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fDiscountInd with another Field
	 *	@param value
	 */
   public void setRlu5fDiscountInd(Field source) {
       replace(source,0,source.length(),beginRlu5fDiscountInd,RLU_5F_DISCOUNT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fDiscountInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fDiscountInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fDiscountInd,RLU_5F_DISCOUNT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fDiscountInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fDiscountInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fDiscountInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fPlanType
	 *	@return rlu5fPlanType
	 */
   public char[] getRlu5fPlanType() throws CFException{
     if (isRlu5fPlanTypeModified()) { 
        rlu5fPlanType = refreshRlu5fPlanType();
     }
   		return rlu5fPlanType;
   }

  
	/**
	*  set variable rlu5fPlanType
	*  Corresponding COBOL Variable is RLU5F-PLAN-TYPE
	*  @param value
	**/
   public void setRlu5fPlanType(char[] value) {
      rlu5fPlanType = checkRlu5fPlanTypeConstraints(value);
      serializeRlu5fPlanType(rlu5fPlanType);
   } 

     /**
	 * 	Update Rlu5fPlanType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fPlanType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fPlanType,rlu5fPlanType.length);
   	
   }
   
   public void setRlu5fPlanType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fPlanType,rlu5fPlanType.length);
   	
   }
   
     /**
	 * 	Update Rlu5fPlanType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fPlanType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fPlanType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fPlanType with another Field
	 *	@param value
	 */
   public void setRlu5fPlanType(Field source) {
       replace(source,0,source.length(),beginRlu5fPlanType,RLU_5F_PLAN_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fPlanType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fPlanType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fPlanType,RLU_5F_PLAN_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fPlanType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fPlanType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fPlanType+targetIndex,targetLen);
    
   }
	char[] rlu5fAddtlShrSvc88Value = "AS".toCharArray();
	/**
	 *	Test condition "AS" for isRlu5fAddtlShrSvc()
	 *	@return  Returns true if isRlu5fAddtlShrSvc() is "AS"
	 */
   public boolean isRlu5fAddtlShrSvc() throws CFException {
      return (  compareChars( getRlu5fPlanType() , rlu5fAddtlShrSvc88Value)  == 0  );
   }


	/**
	*  set values "AS"
	*/
   	public void setRlu5fAddtlShrSvcTrue() {  			
    	setRlu5fPlanType( rlu5fAddtlShrSvc88Value);
   	}
	/**
	 *	Returns the value of rlu5fUnitType
	 *	@return rlu5fUnitType
	 */
   public char[] getRlu5fUnitType() throws CFException{
     if (isRlu5fUnitTypeModified()) { 
        rlu5fUnitType = refreshRlu5fUnitType();
     }
   		return rlu5fUnitType;
   }

  
	/**
	*  set variable rlu5fUnitType
	*  Corresponding COBOL Variable is RLU5F-UNIT-TYPE
	*  @param value
	**/
   public void setRlu5fUnitType(char[] value) {
      rlu5fUnitType = checkRlu5fUnitTypeConstraints(value);
      serializeRlu5fUnitType(rlu5fUnitType);
   } 

     /**
	 * 	Update Rlu5fUnitType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fUnitType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fUnitType,rlu5fUnitType.length);
   	
   }
   
   public void setRlu5fUnitType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fUnitType,rlu5fUnitType.length);
   	
   }
   
     /**
	 * 	Update Rlu5fUnitType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fUnitType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fUnitType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fUnitType with another Field
	 *	@param value
	 */
   public void setRlu5fUnitType(Field source) {
       replace(source,0,source.length(),beginRlu5fUnitType,RLU_5F_UNIT_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fUnitType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fUnitType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fUnitType,RLU_5F_UNIT_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fUnitType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fUnitType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fUnitType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fPlanId
	 *	@return rlu5fPlanId
	 */
   public char[] getRlu5fPlanId() throws CFException{
     if (isRlu5fPlanIdModified()) { 
        rlu5fPlanId = refreshRlu5fPlanId();
     }
   		return rlu5fPlanId;
   }

  
	/**
	*  set variable rlu5fPlanId
	*  Corresponding COBOL Variable is RLU5F-PLAN-ID
	*  @param value
	**/
   public void setRlu5fPlanId(char[] value) {
      rlu5fPlanId = checkRlu5fPlanIdConstraints(value);
      serializeRlu5fPlanId(rlu5fPlanId);
   } 

     /**
	 * 	Update Rlu5fPlanId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fPlanId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fPlanId,rlu5fPlanId.length);
   	
   }
   
   public void setRlu5fPlanId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fPlanId,rlu5fPlanId.length);
   	
   }
   
     /**
	 * 	Update Rlu5fPlanId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fPlanId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fPlanId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fPlanId with another Field
	 *	@param value
	 */
   public void setRlu5fPlanId(Field source) {
       replace(source,0,source.length(),beginRlu5fPlanId,RLU_5F_PLAN_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fPlanId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fPlanId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fPlanId,RLU_5F_PLAN_ID_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fPlanId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fPlanId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fPlanId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fCurDelayInd
	 *	@return rlu5fCurDelayInd
	 */
   public char[] getRlu5fCurDelayInd() throws CFException{
     if (isRlu5fCurDelayIndModified()) { 
        rlu5fCurDelayInd = refreshRlu5fCurDelayInd();
     }
   		return rlu5fCurDelayInd;
   }

  
	/**
	*  set variable rlu5fCurDelayInd
	*  Corresponding COBOL Variable is RLU5F-CUR-DELAY-IND
	*  @param value
	**/
   public void setRlu5fCurDelayInd(char[] value) {
      rlu5fCurDelayInd = checkRlu5fCurDelayIndConstraints(value);
      serializeRlu5fCurDelayInd(rlu5fCurDelayInd);
   } 

     /**
	 * 	Update Rlu5fCurDelayInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fCurDelayInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fCurDelayInd,rlu5fCurDelayInd.length);
   	
   }
   
   public void setRlu5fCurDelayInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fCurDelayInd,rlu5fCurDelayInd.length);
   	
   }
   
     /**
	 * 	Update Rlu5fCurDelayInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fCurDelayInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fCurDelayInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fCurDelayInd with another Field
	 *	@param value
	 */
   public void setRlu5fCurDelayInd(Field source) {
       replace(source,0,source.length(),beginRlu5fCurDelayInd,RLU_5F_CUR_DELAY_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fCurDelayInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fCurDelayInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fCurDelayInd,RLU_5F_CUR_DELAY_IND_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fCurDelayInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fCurDelayInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fCurDelayInd+targetIndex,targetLen);
    
   }
	public BigDecimal getRlu5fDelayShareUsed() throws CFException {
        if (isRlu5fDelayShareUsedModified()) { 
           rlu5fDelayShareUsed = refreshRlu5fDelayShareUsed();
        }
   		return rlu5fDelayShareUsed;
	}

    public char[] getRlu5fDelayShareUsedString() {
          return  rlu5fDelayShareUsedString();
    }
	
	/**
	 * 	Update Rlu5fDelayShareUsed with the passed number
	 *  Corresponding COBOL Variable is RLU5F-DELAY-SHARE-USED
	 *	@param number
	 */
	public void setRlu5fDelayShareUsed(BigDecimal number) {	
     rlu5fDelayShareUsed = checkRlu5fDelayShareUsedMaxLimit(number);
	    serializeRlu5fDelayShareUsed(rlu5fDelayShareUsed);
   }
	public BigDecimal getRlu5fDelayShareOvrage() throws CFException {
        if (isRlu5fDelayShareOvrageModified()) { 
           rlu5fDelayShareOvrage = refreshRlu5fDelayShareOvrage();
        }
   		return rlu5fDelayShareOvrage;
	}

    public char[] getRlu5fDelayShareOvrageString() {
          return  rlu5fDelayShareOvrageString();
    }
	
	/**
	 * 	Update Rlu5fDelayShareOvrage with the passed number
	 *  Corresponding COBOL Variable is RLU5F-DELAY-SHARE-OVRAGE
	 *	@param number
	 */
	public void setRlu5fDelayShareOvrage(BigDecimal number) {	
     rlu5fDelayShareOvrage = checkRlu5fDelayShareOvrageMaxLimit(number);
	    serializeRlu5fDelayShareOvrage(rlu5fDelayShareOvrage);
   }
	public BigDecimal getRlu5fDiscAmount1() throws CFException {
        if (isRlu5fDiscAmount1Modified()) { 
           rlu5fDiscAmount1 = refreshRlu5fDiscAmount1();
        }
   		return rlu5fDiscAmount1;
	}

    public char[] getRlu5fDiscAmount1String() {
          return  rlu5fDiscAmount1String();
    }
	
	/**
	 * 	Update Rlu5fDiscAmount1 with the passed number
	 *  Corresponding COBOL Variable is RLU5F-DISC-AMOUNT-1
	 *	@param number
	 */
	public void setRlu5fDiscAmount1(BigDecimal number) {	
     rlu5fDiscAmount1 = checkRlu5fDiscAmount1MaxLimit(number);
	    serializeRlu5fDiscAmount1(rlu5fDiscAmount1);
   }
	public BigDecimal getRlu5fDiscAmount2() throws CFException {
        if (isRlu5fDiscAmount2Modified()) { 
           rlu5fDiscAmount2 = refreshRlu5fDiscAmount2();
        }
   		return rlu5fDiscAmount2;
	}

    public char[] getRlu5fDiscAmount2String() {
          return  rlu5fDiscAmount2String();
    }
	
	/**
	 * 	Update Rlu5fDiscAmount2 with the passed number
	 *  Corresponding COBOL Variable is RLU5F-DISC-AMOUNT-2
	 *	@param number
	 */
	public void setRlu5fDiscAmount2(BigDecimal number) {	
     rlu5fDiscAmount2 = checkRlu5fDiscAmount2MaxLimit(number);
	    serializeRlu5fDiscAmount2(rlu5fDiscAmount2);
   }
	/**
	 *	Returns the value of rlu5fBoboVenderName
	 *	@return rlu5fBoboVenderName
	 */
   public char[] getRlu5fBoboVenderName() throws CFException{
     if (isRlu5fBoboVenderNameModified()) { 
        rlu5fBoboVenderName = refreshRlu5fBoboVenderName();
     }
   		return rlu5fBoboVenderName;
   }

  
	/**
	*  set variable rlu5fBoboVenderName
	*  Corresponding COBOL Variable is RLU5F-BOBO-VENDER-NAME
	*  @param value
	**/
   public void setRlu5fBoboVenderName(char[] value) {
      rlu5fBoboVenderName = checkRlu5fBoboVenderNameConstraints(value);
      serializeRlu5fBoboVenderName(rlu5fBoboVenderName);
   } 

     /**
	 * 	Update Rlu5fBoboVenderName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fBoboVenderName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fBoboVenderName,rlu5fBoboVenderName.length);
   	
   }
   
   public void setRlu5fBoboVenderName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fBoboVenderName,rlu5fBoboVenderName.length);
   	
   }
   
     /**
	 * 	Update Rlu5fBoboVenderName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fBoboVenderName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fBoboVenderName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fBoboVenderName with another Field
	 *	@param value
	 */
   public void setRlu5fBoboVenderName(Field source) {
       replace(source,0,source.length(),beginRlu5fBoboVenderName,RLU_5F_BOBO_VENDER_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fBoboVenderName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fBoboVenderName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fBoboVenderName,RLU_5F_BOBO_VENDER_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fBoboVenderName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fBoboVenderName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fBoboVenderName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fBoboVenderNumber
	 *	@return rlu5fBoboVenderNumber
	 */
   public char[] getRlu5fBoboVenderNumber() throws CFException{
     if (isRlu5fBoboVenderNumberModified()) { 
        rlu5fBoboVenderNumber = refreshRlu5fBoboVenderNumber();
     }
   		return rlu5fBoboVenderNumber;
   }

  
	/**
	*  set variable rlu5fBoboVenderNumber
	*  Corresponding COBOL Variable is RLU5F-BOBO-VENDER-NUMBER
	*  @param value
	**/
   public void setRlu5fBoboVenderNumber(char[] value) {
      rlu5fBoboVenderNumber = checkRlu5fBoboVenderNumberConstraints(value);
      serializeRlu5fBoboVenderNumber(rlu5fBoboVenderNumber);
   } 

     /**
	 * 	Update Rlu5fBoboVenderNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fBoboVenderNumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fBoboVenderNumber,rlu5fBoboVenderNumber.length);
   	
   }
   
   public void setRlu5fBoboVenderNumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fBoboVenderNumber,rlu5fBoboVenderNumber.length);
   	
   }
   
     /**
	 * 	Update Rlu5fBoboVenderNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fBoboVenderNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fBoboVenderNumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fBoboVenderNumber with another Field
	 *	@param value
	 */
   public void setRlu5fBoboVenderNumber(Field source) {
       replace(source,0,source.length(),beginRlu5fBoboVenderNumber,RLU_5F_BOBO_VENDER_NUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fBoboVenderNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fBoboVenderNumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fBoboVenderNumber,RLU_5F_BOBO_VENDER_NUMBER_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fBoboVenderNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fBoboVenderNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fBoboVenderNumber+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fBoboServDesc
	 *	@return rlu5fBoboServDesc
	 */
   public char[] getRlu5fBoboServDesc() throws CFException{
     if (isRlu5fBoboServDescModified()) { 
        rlu5fBoboServDesc = refreshRlu5fBoboServDesc();
     }
   		return rlu5fBoboServDesc;
   }

  
	/**
	*  set variable rlu5fBoboServDesc
	*  Corresponding COBOL Variable is RLU5F-BOBO-SERV-DESC
	*  @param value
	**/
   public void setRlu5fBoboServDesc(char[] value) {
      rlu5fBoboServDesc = checkRlu5fBoboServDescConstraints(value);
      serializeRlu5fBoboServDesc(rlu5fBoboServDesc);
   } 

     /**
	 * 	Update Rlu5fBoboServDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fBoboServDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fBoboServDesc,rlu5fBoboServDesc.length);
   	
   }
   
   public void setRlu5fBoboServDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fBoboServDesc,rlu5fBoboServDesc.length);
   	
   }
   
     /**
	 * 	Update Rlu5fBoboServDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fBoboServDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fBoboServDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fBoboServDesc with another Field
	 *	@param value
	 */
   public void setRlu5fBoboServDesc(Field source) {
       replace(source,0,source.length(),beginRlu5fBoboServDesc,RLU_5F_BOBO_SERV_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fBoboServDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fBoboServDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fBoboServDesc,RLU_5F_BOBO_SERV_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fBoboServDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fBoboServDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fBoboServDesc+targetIndex,targetLen);
    
   }
	public BigDecimal getRlu5fBoboTaxAmt() throws CFException {
        if (isRlu5fBoboTaxAmtModified()) { 
           rlu5fBoboTaxAmt = refreshRlu5fBoboTaxAmt();
        }
   		return rlu5fBoboTaxAmt;
	}

    public char[] getRlu5fBoboTaxAmtString() {
          return  rlu5fBoboTaxAmtString();
    }
	
	/**
	 * 	Update Rlu5fBoboTaxAmt with the passed number
	 *  Corresponding COBOL Variable is RLU5F-BOBO-TAX-AMT
	 *	@param number
	 */
	public void setRlu5fBoboTaxAmt(BigDecimal number) {	
     rlu5fBoboTaxAmt = checkRlu5fBoboTaxAmtMaxLimit(number);
	    serializeRlu5fBoboTaxAmt(rlu5fBoboTaxAmt);
   }
	public BigDecimal getRlu5fBoboSurAmt() throws CFException {
        if (isRlu5fBoboSurAmtModified()) { 
           rlu5fBoboSurAmt = refreshRlu5fBoboSurAmt();
        }
   		return rlu5fBoboSurAmt;
	}

    public char[] getRlu5fBoboSurAmtString() {
          return  rlu5fBoboSurAmtString();
    }
	
	/**
	 * 	Update Rlu5fBoboSurAmt with the passed number
	 *  Corresponding COBOL Variable is RLU5F-BOBO-SUR-AMT
	 *	@param number
	 */
	public void setRlu5fBoboSurAmt(BigDecimal number) {	
     rlu5fBoboSurAmt = checkRlu5fBoboSurAmtMaxLimit(number);
	    serializeRlu5fBoboSurAmt(rlu5fBoboSurAmt);
   }
	public long getRlu5fMsoNumOfPurchases() throws CFException {
        if (isRlu5fMsoNumOfPurchasesModified()) { 
           rlu5fMsoNumOfPurchases = refreshRlu5fMsoNumOfPurchases();
        }
   		return rlu5fMsoNumOfPurchases;
	}
	
	/**
	 * 	Update Rlu5fMsoNumOfPurchases with the passed value
	 *  Corresponding COBOL Variable is RLU5F-MSO-NUM-OF-PURCHASES
	 *	@param number
	 */
	public void setRlu5fMsoNumOfPurchases(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			rlu5fMsoNumOfPurchases = checkRlu5fMsoNumOfPurchasesMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeRlu5fMsoNumOfPurchases(rlu5fMsoNumOfPurchases);
	}


	/**
	 *	Returns the value of rlu5fMsoPurchaseDesc
	 *	@return rlu5fMsoPurchaseDesc
	 */
   public char[] getRlu5fMsoPurchaseDesc() throws CFException{
     if (isRlu5fMsoPurchaseDescModified()) { 
        rlu5fMsoPurchaseDesc = refreshRlu5fMsoPurchaseDesc();
     }
   		return rlu5fMsoPurchaseDesc;
   }

  
	/**
	*  set variable rlu5fMsoPurchaseDesc
	*  Corresponding COBOL Variable is RLU5F-MSO-PURCHASE-DESC
	*  @param value
	**/
   public void setRlu5fMsoPurchaseDesc(char[] value) {
      rlu5fMsoPurchaseDesc = checkRlu5fMsoPurchaseDescConstraints(value);
      serializeRlu5fMsoPurchaseDesc(rlu5fMsoPurchaseDesc);
   } 

     /**
	 * 	Update Rlu5fMsoPurchaseDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fMsoPurchaseDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fMsoPurchaseDesc,rlu5fMsoPurchaseDesc.length);
   	
   }
   
   public void setRlu5fMsoPurchaseDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fMsoPurchaseDesc,rlu5fMsoPurchaseDesc.length);
   	
   }
   
     /**
	 * 	Update Rlu5fMsoPurchaseDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fMsoPurchaseDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fMsoPurchaseDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fMsoPurchaseDesc with another Field
	 *	@param value
	 */
   public void setRlu5fMsoPurchaseDesc(Field source) {
       replace(source,0,source.length(),beginRlu5fMsoPurchaseDesc,RLU_5F_MSO_PURCHASE_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fMsoPurchaseDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fMsoPurchaseDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fMsoPurchaseDesc,RLU_5F_MSO_PURCHASE_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fMsoPurchaseDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fMsoPurchaseDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fMsoPurchaseDesc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fMsoDomainName
	 *	@return rlu5fMsoDomainName
	 */
   public char[] getRlu5fMsoDomainName() throws CFException{
     if (isRlu5fMsoDomainNameModified()) { 
        rlu5fMsoDomainName = refreshRlu5fMsoDomainName();
     }
   		return rlu5fMsoDomainName;
   }

  
	/**
	*  set variable rlu5fMsoDomainName
	*  Corresponding COBOL Variable is RLU5F-MSO-DOMAIN-NAME
	*  @param value
	**/
   public void setRlu5fMsoDomainName(char[] value) {
      rlu5fMsoDomainName = checkRlu5fMsoDomainNameConstraints(value);
      serializeRlu5fMsoDomainName(rlu5fMsoDomainName);
   } 

     /**
	 * 	Update Rlu5fMsoDomainName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fMsoDomainName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fMsoDomainName,rlu5fMsoDomainName.length);
   	
   }
   
   public void setRlu5fMsoDomainName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fMsoDomainName,rlu5fMsoDomainName.length);
   	
   }
   
     /**
	 * 	Update Rlu5fMsoDomainName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fMsoDomainName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fMsoDomainName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fMsoDomainName with another Field
	 *	@param value
	 */
   public void setRlu5fMsoDomainName(Field source) {
       replace(source,0,source.length(),beginRlu5fMsoDomainName,RLU_5F_MSO_DOMAIN_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fMsoDomainName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fMsoDomainName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fMsoDomainName,RLU_5F_MSO_DOMAIN_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fMsoDomainName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fMsoDomainName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fMsoDomainName+targetIndex,targetLen);
    
   }
	public BigDecimal getRlu5fDipLateFee() throws CFException {
        if (isRlu5fDipLateFeeModified()) { 
           rlu5fDipLateFee = refreshRlu5fDipLateFee();
        }
   		return rlu5fDipLateFee;
	}

    public char[] getRlu5fDipLateFeeString() {
          return  rlu5fDipLateFeeString();
    }
	
	/**
	 * 	Update Rlu5fDipLateFee with the passed number
	 *  Corresponding COBOL Variable is RLU5F-DIP-LATE-FEE
	 *	@param number
	 */
	public void setRlu5fDipLateFee(BigDecimal number) {	
     rlu5fDipLateFee = checkRlu5fDipLateFeeMaxLimit(number);
	    serializeRlu5fDipLateFee(rlu5fDipLateFee);
   }
	public BigDecimal getRlu5fDipFinChgDue() throws CFException {
        if (isRlu5fDipFinChgDueModified()) { 
           rlu5fDipFinChgDue = refreshRlu5fDipFinChgDue();
        }
   		return rlu5fDipFinChgDue;
	}

    public char[] getRlu5fDipFinChgDueString() {
          return  rlu5fDipFinChgDueString();
    }
	
	/**
	 * 	Update Rlu5fDipFinChgDue with the passed number
	 *  Corresponding COBOL Variable is RLU5F-DIP-FIN-CHG-DUE
	 *	@param number
	 */
	public void setRlu5fDipFinChgDue(BigDecimal number) {	
     rlu5fDipFinChgDue = checkRlu5fDipFinChgDueMaxLimit(number);
	    serializeRlu5fDipFinChgDue(rlu5fDipFinChgDue);
   }
	public BigDecimal getRlu5fDipFinChgPaid() throws CFException {
        if (isRlu5fDipFinChgPaidModified()) { 
           rlu5fDipFinChgPaid = refreshRlu5fDipFinChgPaid();
        }
   		return rlu5fDipFinChgPaid;
	}

    public char[] getRlu5fDipFinChgPaidString() {
          return  rlu5fDipFinChgPaidString();
    }
	
	/**
	 * 	Update Rlu5fDipFinChgPaid with the passed number
	 *  Corresponding COBOL Variable is RLU5F-DIP-FIN-CHG-PAID
	 *	@param number
	 */
	public void setRlu5fDipFinChgPaid(BigDecimal number) {	
     rlu5fDipFinChgPaid = checkRlu5fDipFinChgPaidMaxLimit(number);
	    serializeRlu5fDipFinChgPaid(rlu5fDipFinChgPaid);
   }
	public BigDecimal getRlu5fDipFinChgPastDue() throws CFException {
        if (isRlu5fDipFinChgPastDueModified()) { 
           rlu5fDipFinChgPastDue = refreshRlu5fDipFinChgPastDue();
        }
   		return rlu5fDipFinChgPastDue;
	}

    public char[] getRlu5fDipFinChgPastDueString() {
          return  rlu5fDipFinChgPastDueString();
    }
	
	/**
	 * 	Update Rlu5fDipFinChgPastDue with the passed number
	 *  Corresponding COBOL Variable is RLU5F-DIP-FIN-CHG-PAST-DUE
	 *	@param number
	 */
	public void setRlu5fDipFinChgPastDue(BigDecimal number) {	
     rlu5fDipFinChgPastDue = checkRlu5fDipFinChgPastDueMaxLimit(number);
	    serializeRlu5fDipFinChgPastDue(rlu5fDipFinChgPastDue);
   }
	public BigDecimal getRlu5fDipBalance() throws CFException {
        if (isRlu5fDipBalanceModified()) { 
           rlu5fDipBalance = refreshRlu5fDipBalance();
        }
   		return rlu5fDipBalance;
	}

    public char[] getRlu5fDipBalanceString() {
          return  rlu5fDipBalanceString();
    }
	
	/**
	 * 	Update Rlu5fDipBalance with the passed number
	 *  Corresponding COBOL Variable is RLU5F-DIP-BALANCE
	 *	@param number
	 */
	public void setRlu5fDipBalance(BigDecimal number) {	
     rlu5fDipBalance = checkRlu5fDipBalanceMaxLimit(number);
	    serializeRlu5fDipBalance(rlu5fDipBalance);
   }
	public BigDecimal getRlu5fDipFinChgBalance() throws CFException {
        if (isRlu5fDipFinChgBalanceModified()) { 
           rlu5fDipFinChgBalance = refreshRlu5fDipFinChgBalance();
        }
   		return rlu5fDipFinChgBalance;
	}

    public char[] getRlu5fDipFinChgBalanceString() {
          return  rlu5fDipFinChgBalanceString();
    }
	
	/**
	 * 	Update Rlu5fDipFinChgBalance with the passed number
	 *  Corresponding COBOL Variable is RLU5F-DIP-FIN-CHG-BALANCE
	 *	@param number
	 */
	public void setRlu5fDipFinChgBalance(BigDecimal number) {	
     rlu5fDipFinChgBalance = checkRlu5fDipFinChgBalanceMaxLimit(number);
	    serializeRlu5fDipFinChgBalance(rlu5fDipFinChgBalance);
   }
	/**
	 *	Returns the value of rlu5fInstallPaymentNum
	 *	@return rlu5fInstallPaymentNum
	 */
	public int getRlu5fInstallPaymentNum() throws CFException {
       if (isRlu5fInstallPaymentNumModified()) { 
           rlu5fInstallPaymentNum = refreshRlu5fInstallPaymentNum();
        }
   		return rlu5fInstallPaymentNum;
	}
	

	
	   
	/**
	 * 	Update Rlu5fInstallPaymentNum with the passed value
	 *  Corresponding COBOL Variable is RLU5F-INSTALL-PAYMENT-NUM
	 *	@param number
	 */
	public void setRlu5fInstallPaymentNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fInstallPaymentNum = checkRlu5fInstallPaymentNumMaxLimit(number); 
		serializeRlu5fInstallPaymentNum(rlu5fInstallPaymentNum);
	}
	

	public void setRlu5fInstallPaymentNum(long number) {
	    number = checkRlu5fInstallPaymentNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fInstallPaymentNum((int)number);
	}
	
	/**
	 * 	Update Rlu5fInstallPaymentNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fInstallPaymentNum(char[] value) throws CFException {
		 rlu5fInstallPaymentNum = serializeRlu5fInstallPaymentNum(value);
	}
	/**
	 * 	Update Rlu5fInstallPaymentNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fInstallPaymentNumString(char[] value) throws CFException {
		 setRlu5fInstallPaymentNum(value);
	}
	/**
	 *	Returns the value of rlu5fTotInstallPayments
	 *	@return rlu5fTotInstallPayments
	 */
	public int getRlu5fTotInstallPayments() throws CFException {
       if (isRlu5fTotInstallPaymentsModified()) { 
           rlu5fTotInstallPayments = refreshRlu5fTotInstallPayments();
        }
   		return rlu5fTotInstallPayments;
	}
	

	
	   
	/**
	 * 	Update Rlu5fTotInstallPayments with the passed value
	 *  Corresponding COBOL Variable is RLU5F-TOT-INSTALL-PAYMENTS
	 *	@param number
	 */
	public void setRlu5fTotInstallPayments(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fTotInstallPayments = checkRlu5fTotInstallPaymentsMaxLimit(number); 
		serializeRlu5fTotInstallPayments(rlu5fTotInstallPayments);
	}
	

	public void setRlu5fTotInstallPayments(long number) {
	    number = checkRlu5fTotInstallPaymentsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fTotInstallPayments((int)number);
	}
	
	/**
	 * 	Update Rlu5fTotInstallPayments with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fTotInstallPayments(char[] value) throws CFException {
		 rlu5fTotInstallPayments = serializeRlu5fTotInstallPayments(value);
	}
	/**
	 * 	Update Rlu5fTotInstallPayments with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fTotInstallPaymentsString(char[] value) throws CFException {
		 setRlu5fTotInstallPayments(value);
	}
	/**
	 *	Returns the value of rlu5fDipLoanNumber
	 *	@return rlu5fDipLoanNumber
	 */
	public long getRlu5fDipLoanNumber() throws CFException {
       if (isRlu5fDipLoanNumberModified()) { 
           rlu5fDipLoanNumber = refreshRlu5fDipLoanNumber();
        }
   		return rlu5fDipLoanNumber;
	}
	

	
	   
	/**
	 * 	Update Rlu5fDipLoanNumber with the passed value
	 *  Corresponding COBOL Variable is RLU5F-DIP-LOAN-NUMBER
	 *	@param number
	 */
	public void setRlu5fDipLoanNumber(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fDipLoanNumber = checkRlu5fDipLoanNumberMaxLimit(number); 
		serializeRlu5fDipLoanNumber(rlu5fDipLoanNumber);
	}
	

	/**
	 * 	Update Rlu5fDipLoanNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fDipLoanNumber(char[] value) throws CFException {
		 rlu5fDipLoanNumber = serializeRlu5fDipLoanNumber(value);
	}
	/**
	 * 	Update Rlu5fDipLoanNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fDipLoanNumberString(char[] value) throws CFException {
		 setRlu5fDipLoanNumber(value);
	}
	/**
	 *	Returns the value of rlu5fAlpDelayedCapSw
	 *	@return rlu5fAlpDelayedCapSw
	 */
   public char[] getRlu5fAlpDelayedCapSw() throws CFException{
     if (isRlu5fAlpDelayedCapSwModified()) { 
        rlu5fAlpDelayedCapSw = refreshRlu5fAlpDelayedCapSw();
     }
   		return rlu5fAlpDelayedCapSw;
   }

  
	/**
	*  set variable rlu5fAlpDelayedCapSw
	*  Corresponding COBOL Variable is RLU5F-ALP-DELAYED-CAP-SW
	*  @param value
	**/
   public void setRlu5fAlpDelayedCapSw(char[] value) {
      rlu5fAlpDelayedCapSw = checkRlu5fAlpDelayedCapSwConstraints(value);
      serializeRlu5fAlpDelayedCapSw(rlu5fAlpDelayedCapSw);
   } 

     /**
	 * 	Update Rlu5fAlpDelayedCapSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fAlpDelayedCapSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fAlpDelayedCapSw,rlu5fAlpDelayedCapSw.length);
   	
   }
   
   public void setRlu5fAlpDelayedCapSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fAlpDelayedCapSw,rlu5fAlpDelayedCapSw.length);
   	
   }
   
     /**
	 * 	Update Rlu5fAlpDelayedCapSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fAlpDelayedCapSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fAlpDelayedCapSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fAlpDelayedCapSw with another Field
	 *	@param value
	 */
   public void setRlu5fAlpDelayedCapSw(Field source) {
       replace(source,0,source.length(),beginRlu5fAlpDelayedCapSw,RLU_5F_ALP_DELAYED_CAP_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fAlpDelayedCapSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fAlpDelayedCapSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fAlpDelayedCapSw,RLU_5F_ALP_DELAYED_CAP_SW_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fAlpDelayedCapSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fAlpDelayedCapSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fAlpDelayedCapSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fAlpUnitType
	 *	@return rlu5fAlpUnitType
	 */
   public char[] getRlu5fAlpUnitType() throws CFException{
     if (isRlu5fAlpUnitTypeModified()) { 
        rlu5fAlpUnitType = refreshRlu5fAlpUnitType();
     }
   		return rlu5fAlpUnitType;
   }

  
	/**
	*  set variable rlu5fAlpUnitType
	*  Corresponding COBOL Variable is RLU5F-ALP-UNIT-TYPE
	*  @param value
	**/
   public void setRlu5fAlpUnitType(char[] value) {
      rlu5fAlpUnitType = checkRlu5fAlpUnitTypeConstraints(value);
      serializeRlu5fAlpUnitType(rlu5fAlpUnitType);
   } 

     /**
	 * 	Update Rlu5fAlpUnitType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fAlpUnitType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fAlpUnitType,rlu5fAlpUnitType.length);
   	
   }
   
   public void setRlu5fAlpUnitType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fAlpUnitType,rlu5fAlpUnitType.length);
   	
   }
   
     /**
	 * 	Update Rlu5fAlpUnitType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fAlpUnitType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fAlpUnitType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fAlpUnitType with another Field
	 *	@param value
	 */
   public void setRlu5fAlpUnitType(Field source) {
       replace(source,0,source.length(),beginRlu5fAlpUnitType,RLU_5F_ALP_UNIT_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fAlpUnitType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fAlpUnitType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fAlpUnitType,RLU_5F_ALP_UNIT_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fAlpUnitType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fAlpUnitType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fAlpUnitType+targetIndex,targetLen);
    
   }
	public BigDecimal getRlu5fDipSubTotal() throws CFException {
        if (isRlu5fDipSubTotalModified()) { 
           rlu5fDipSubTotal = refreshRlu5fDipSubTotal();
        }
   		return rlu5fDipSubTotal;
	}

    public char[] getRlu5fDipSubTotalString() {
          return  rlu5fDipSubTotalString();
    }
	
	/**
	 * 	Update Rlu5fDipSubTotal with the passed number
	 *  Corresponding COBOL Variable is RLU5F-DIP-SUB-TOTAL
	 *	@param number
	 */
	public void setRlu5fDipSubTotal(BigDecimal number) {	
     rlu5fDipSubTotal = checkRlu5fDipSubTotalMaxLimit(number);
	    serializeRlu5fDipSubTotal(rlu5fDipSubTotal);
   }
	/**
	 *	Returns the value of rlu5fVzedgeInd
	 *	@return rlu5fVzedgeInd
	 */
   public char[] getRlu5fVzedgeInd() throws CFException{
     if (isRlu5fVzedgeIndModified()) { 
        rlu5fVzedgeInd = refreshRlu5fVzedgeInd();
     }
   		return rlu5fVzedgeInd;
   }

  
	/**
	*  set variable rlu5fVzedgeInd
	*  Corresponding COBOL Variable is RLU5F-VZEDGE-IND
	*  @param value
	**/
   public void setRlu5fVzedgeInd(char[] value) {
      rlu5fVzedgeInd = checkRlu5fVzedgeIndConstraints(value);
      serializeRlu5fVzedgeInd(rlu5fVzedgeInd);
   } 

     /**
	 * 	Update Rlu5fVzedgeInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fVzedgeInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fVzedgeInd,rlu5fVzedgeInd.length);
   	
   }
   
   public void setRlu5fVzedgeInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fVzedgeInd,rlu5fVzedgeInd.length);
   	
   }
   
     /**
	 * 	Update Rlu5fVzedgeInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fVzedgeInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fVzedgeInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fVzedgeInd with another Field
	 *	@param value
	 */
   public void setRlu5fVzedgeInd(Field source) {
       replace(source,0,source.length(),beginRlu5fVzedgeInd,RLU_5F_VZEDGE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fVzedgeInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fVzedgeInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fVzedgeInd,RLU_5F_VZEDGE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fVzedgeInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fVzedgeInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fVzedgeInd+targetIndex,targetLen);
    
   }
	char[] rlu5fVzedgeBuyout88Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isRlu5fVzedgeBuyout()
	 *	@return  Returns true if isRlu5fVzedgeBuyout() is "B"
	 */
   public boolean isRlu5fVzedgeBuyout() throws CFException {
      return (  compareChars( getRlu5fVzedgeInd() , rlu5fVzedgeBuyout88Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setRlu5fVzedgeBuyoutTrue() {  			
    	setRlu5fVzedgeInd( rlu5fVzedgeBuyout88Value);
   	}
	char[] rlu5fVzedgePayoff88Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isRlu5fVzedgePayoff()
	 *	@return  Returns true if isRlu5fVzedgePayoff() is "O"
	 */
   public boolean isRlu5fVzedgePayoff() throws CFException {
      return (  compareChars( getRlu5fVzedgeInd() , rlu5fVzedgePayoff88Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setRlu5fVzedgePayoffTrue() {  			
    	setRlu5fVzedgeInd( rlu5fVzedgePayoff88Value);
   	}
	char[] rlu5fVzedgePayment88Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isRlu5fVzedgePayment()
	 *	@return  Returns true if isRlu5fVzedgePayment() is "P"
	 */
   public boolean isRlu5fVzedgePayment() throws CFException {
      return (  compareChars( getRlu5fVzedgeInd() , rlu5fVzedgePayment88Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setRlu5fVzedgePaymentTrue() {  			
    	setRlu5fVzedgeInd( rlu5fVzedgePayment88Value);
   	}
	char[] rlu5fVzedgeCredit88Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isRlu5fVzedgeCredit()
	 *	@return  Returns true if isRlu5fVzedgeCredit() is "C"
	 */
   public boolean isRlu5fVzedgeCredit() throws CFException {
      return (  compareChars( getRlu5fVzedgeInd() , rlu5fVzedgeCredit88Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setRlu5fVzedgeCreditTrue() {  			
    	setRlu5fVzedgeInd( rlu5fVzedgeCredit88Value);
   	}
	char[] rlu5fVzedgeDeceased88Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isRlu5fVzedgeDeceased()
	 *	@return  Returns true if isRlu5fVzedgeDeceased() is "D"
	 */
   public boolean isRlu5fVzedgeDeceased() throws CFException {
      return (  compareChars( getRlu5fVzedgeInd() , rlu5fVzedgeDeceased88Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setRlu5fVzedgeDeceasedTrue() {  			
    	setRlu5fVzedgeInd( rlu5fVzedgeDeceased88Value);
   	}
	/**
	 *	Returns the value of rlu5fVzedgeMsgInd
	 *	@return rlu5fVzedgeMsgInd
	 */
   public char[] getRlu5fVzedgeMsgInd() throws CFException{
     if (isRlu5fVzedgeMsgIndModified()) { 
        rlu5fVzedgeMsgInd = refreshRlu5fVzedgeMsgInd();
     }
   		return rlu5fVzedgeMsgInd;
   }

  
	/**
	*  set variable rlu5fVzedgeMsgInd
	*  Corresponding COBOL Variable is RLU5F-VZEDGE-MSG-IND
	*  @param value
	**/
   public void setRlu5fVzedgeMsgInd(char[] value) {
      rlu5fVzedgeMsgInd = checkRlu5fVzedgeMsgIndConstraints(value);
      serializeRlu5fVzedgeMsgInd(rlu5fVzedgeMsgInd);
   } 

     /**
	 * 	Update Rlu5fVzedgeMsgInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fVzedgeMsgInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fVzedgeMsgInd,rlu5fVzedgeMsgInd.length);
   	
   }
   
   public void setRlu5fVzedgeMsgInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fVzedgeMsgInd,rlu5fVzedgeMsgInd.length);
   	
   }
   
     /**
	 * 	Update Rlu5fVzedgeMsgInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fVzedgeMsgInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fVzedgeMsgInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fVzedgeMsgInd with another Field
	 *	@param value
	 */
   public void setRlu5fVzedgeMsgInd(Field source) {
       replace(source,0,source.length(),beginRlu5fVzedgeMsgInd,RLU_5F_VZEDGE_MSG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fVzedgeMsgInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fVzedgeMsgInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fVzedgeMsgInd,RLU_5F_VZEDGE_MSG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fVzedgeMsgInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fVzedgeMsgInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fVzedgeMsgInd+targetIndex,targetLen);
    
   }
	char[] rlu5fVzedgeNew88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isRlu5fVzedgeNew()
	 *	@return  Returns true if isRlu5fVzedgeNew() is "N"
	 */
   public boolean isRlu5fVzedgeNew() throws CFException {
      return (  compareChars( getRlu5fVzedgeMsgInd() , rlu5fVzedgeNew88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setRlu5fVzedgeNewTrue() {  			
    	setRlu5fVzedgeMsgInd( rlu5fVzedgeNew88Value);
   	}
	char[] rlu5fVzedgeNewAct88Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isRlu5fVzedgeNewAct()
	 *	@return  Returns true if isRlu5fVzedgeNewAct() is "B"
	 */
   public boolean isRlu5fVzedgeNewAct() throws CFException {
      return (  compareChars( getRlu5fVzedgeMsgInd() , rlu5fVzedgeNewAct88Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setRlu5fVzedgeNewActTrue() {  			
    	setRlu5fVzedgeMsgInd( rlu5fVzedgeNewAct88Value);
   	}
	char[] rlu5fVzedgeAct88Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isRlu5fVzedgeAct()
	 *	@return  Returns true if isRlu5fVzedgeAct() is "A"
	 */
   public boolean isRlu5fVzedgeAct() throws CFException {
      return (  compareChars( getRlu5fVzedgeMsgInd() , rlu5fVzedgeAct88Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setRlu5fVzedgeActTrue() {  			
    	setRlu5fVzedgeMsgInd( rlu5fVzedgeAct88Value);
   	}
	char[] rlu5fVzedgeAccelerate88Value = "X".toCharArray();
	/**
	 *	Test condition "X" for isRlu5fVzedgeAccelerate()
	 *	@return  Returns true if isRlu5fVzedgeAccelerate() is "X"
	 */
   public boolean isRlu5fVzedgeAccelerate() throws CFException {
      return (  compareChars( getRlu5fVzedgeMsgInd() , rlu5fVzedgeAccelerate88Value)  == 0  );
   }


	/**
	*  set values "X"
	*/
   	public void setRlu5fVzedgeAccelerateTrue() {  			
    	setRlu5fVzedgeMsgInd( rlu5fVzedgeAccelerate88Value);
   	}
	char[] rlu5fVzedgeReinstated88Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isRlu5fVzedgeReinstated()
	 *	@return  Returns true if isRlu5fVzedgeReinstated() is "R"
	 */
   public boolean isRlu5fVzedgeReinstated() throws CFException {
      return (  compareChars( getRlu5fVzedgeMsgInd() , rlu5fVzedgeReinstated88Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setRlu5fVzedgeReinstatedTrue() {  			
    	setRlu5fVzedgeMsgInd( rlu5fVzedgeReinstated88Value);
   	}
	char[] rlu5fVzedgeUpgrade88Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isRlu5fVzedgeUpgrade()
	 *	@return  Returns true if isRlu5fVzedgeUpgrade() is "U"
	 */
   public boolean isRlu5fVzedgeUpgrade() throws CFException {
      return (  compareChars( getRlu5fVzedgeMsgInd() , rlu5fVzedgeUpgrade88Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setRlu5fVzedgeUpgradeTrue() {  			
    	setRlu5fVzedgeMsgInd( rlu5fVzedgeUpgrade88Value);
   	}
	char[] rlu5fVzedgeFinal88Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isRlu5fVzedgeFinal()
	 *	@return  Returns true if isRlu5fVzedgeFinal() is "F"
	 */
   public boolean isRlu5fVzedgeFinal() throws CFException {
      return (  compareChars( getRlu5fVzedgeMsgInd() , rlu5fVzedgeFinal88Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setRlu5fVzedgeFinalTrue() {  			
    	setRlu5fVzedgeMsgInd( rlu5fVzedgeFinal88Value);
   	}
	char[] rlu5fVzedgeReactivate88Value = "V".toCharArray();
	/**
	 *	Test condition "V" for isRlu5fVzedgeReactivate()
	 *	@return  Returns true if isRlu5fVzedgeReactivate() is "V"
	 */
   public boolean isRlu5fVzedgeReactivate() throws CFException {
      return (  compareChars( getRlu5fVzedgeMsgInd() , rlu5fVzedgeReactivate88Value)  == 0  );
   }


	/**
	*  set values "V"
	*/
   	public void setRlu5fVzedgeReactivateTrue() {  			
    	setRlu5fVzedgeMsgInd( rlu5fVzedgeReactivate88Value);
   	}
	char[] rlu5fVzedgeRecreate88Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isRlu5fVzedgeRecreate()
	 *	@return  Returns true if isRlu5fVzedgeRecreate() is "C"
	 */
   public boolean isRlu5fVzedgeRecreate() throws CFException {
      return (  compareChars( getRlu5fVzedgeMsgInd() , rlu5fVzedgeRecreate88Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setRlu5fVzedgeRecreateTrue() {  			
    	setRlu5fVzedgeMsgInd( rlu5fVzedgeRecreate88Value);
   	}
	/**
	 *	Returns the  value of rlu5fVzedgePaymtSched
	 *  Corresponding COBOL Variable is RLU5F-VZEDGE-PAYMT-SCHED
	 *	@return rlu5fVzedgePaymtSched
	 */
   public List<Rlu5fVzedgePaymtSched> getRlu5fVzedgePaymtSched() {
       return rlu5fVzedgePaymtSched;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return rlu5fVzedgePaymtSched
	 */
	public Rlu5fVzedgePaymtSched getRlu5fVzedgePaymtSched(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getRlu5fVzedgePaymtSched(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= RLU_5F_VZEDGE_PAYMT_SCHED_SIZE) {
             	index = RLU_5F_VZEDGE_PAYMT_SCHED_SIZE -1; // can't exceed max array size
             	logger.trace("rlu5fVzedgePaymtSched - Array index exceeded max Size {}, resetting it to max allowed",RLU_5F_VZEDGE_PAYMT_SCHED_SIZE); 
	    }
		if (index >= rlu5fVzedgePaymtSched.size()) {
       		for (int fillIndex =  rlu5fVzedgePaymtSched.size() -1; fillIndex < index;fillIndex++) {
		       rlu5fVzedgePaymtSched.add(null);
		    }
			rlu5fVzedgePaymtSched.set(index,
			   	   	new Rlu5fVzedgePaymtSched(this,beginRlu5fVzedgePaymtSched + index * Rlu5fVzedgePaymtSched.getRlu5fVzedgePaymtSchedFieldLength()) 
				                        ); 	
		} 
   	   Rlu5fVzedgePaymtSched value = rlu5fVzedgePaymtSched.get(index);
   	   if (value == null) {
   	      rlu5fVzedgePaymtSched.set(index,
			   	   	new Rlu5fVzedgePaymtSched(this,beginRlu5fVzedgePaymtSched + index * Rlu5fVzedgePaymtSched.getRlu5fVzedgePaymtSchedFieldLength()) 
				                        ); 
		  value = rlu5fVzedgePaymtSched.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Rlu5fVzedgePaymtSched at index with the passed value
	 *  Corresponding COBOL Variable is RLU5F-VZEDGE-PAYMT-SCHED
	 *  @param index
	 *	@param value
	 */
  public void setRlu5fVzedgePaymtSched(int index,char[] value) {
   	getRlu5fVzedgePaymtSched(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of rlu5fCellcryptRenewalDate
	 *	@return rlu5fCellcryptRenewalDate
	 */
   public char[] getRlu5fCellcryptRenewalDate() throws CFException{
     if (isRlu5fCellcryptRenewalDateModified()) { 
        rlu5fCellcryptRenewalDate = refreshRlu5fCellcryptRenewalDate();
     }
   		return rlu5fCellcryptRenewalDate;
   }

  
	/**
	*  set variable rlu5fCellcryptRenewalDate
	*  Corresponding COBOL Variable is RLU5F-CELLCRYPT-RENEWAL-DATE
	*  @param value
	**/
   public void setRlu5fCellcryptRenewalDate(char[] value) {
      rlu5fCellcryptRenewalDate = checkRlu5fCellcryptRenewalDateConstraints(value);
      serializeRlu5fCellcryptRenewalDate(rlu5fCellcryptRenewalDate);
   } 

     /**
	 * 	Update Rlu5fCellcryptRenewalDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fCellcryptRenewalDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fCellcryptRenewalDate,rlu5fCellcryptRenewalDate.length);
   	
   }
   
   public void setRlu5fCellcryptRenewalDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptRenewalDate,rlu5fCellcryptRenewalDate.length);
   	
   }
   
     /**
	 * 	Update Rlu5fCellcryptRenewalDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fCellcryptRenewalDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptRenewalDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fCellcryptRenewalDate with another Field
	 *	@param value
	 */
   public void setRlu5fCellcryptRenewalDate(Field source) {
       replace(source,0,source.length(),beginRlu5fCellcryptRenewalDate,RLU_5F_CELLCRYPT_RENEWAL_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fCellcryptRenewalDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fCellcryptRenewalDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptRenewalDate,RLU_5F_CELLCRYPT_RENEWAL_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fCellcryptRenewalDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fCellcryptRenewalDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptRenewalDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fCellcryptRenewalRed
	 *	@return rlu5fCellcryptRenewalRed
	 */   
	 public Rlu5fCellcryptRenewalRed getRlu5fCellcryptRenewalRed() {
   	return rlu5fCellcryptRenewalRed;
   }
   /**
	* 	Update Rlu5fCellcryptRenewalRed with the passed value
	*   Corresponding COBOL Variable is RLU5F-CELLCRYPT-RENEWAL-RED
	*	@param value
	*/
   public void setRlu5fCellcryptRenewalRed(char[] value) {
      rlu5fCellcryptRenewalRed.setString(value); 
   }   
    
     /**
	 * 	Update Rlu5fCellcryptRenewalRed 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlu5fCellcryptRenewalRed(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fCellcryptRenewalRed.begin,rlu5fCellcryptRenewalRed.length());
   }
   
     /**
	 * 	Update Rlu5fCellcryptRenewalRed 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fCellcryptRenewalRed(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fCellcryptRenewalRed.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Rlu5fCellcryptRenewalRed with another Field
	 *	@param value
	 */
   public void setRlu5fCellcryptRenewalRed(Field source) {
   	replace(source,0,source.length(),rlu5fCellcryptRenewalRed.begin,rlu5fCellcryptRenewalRed.length());
   }  
   
     /**
	 * 	Update Rlu5fCellcryptRenewalRed 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlu5fCellcryptRenewalRed(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fCellcryptRenewalRed.begin,rlu5fCellcryptRenewalRed.length());
   }
   
     /**
	 * 	Update Rlu5fCellcryptRenewalRed 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fCellcryptRenewalRed(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fCellcryptRenewalRed.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rlu5fCellcryptActionCode
	 *	@return rlu5fCellcryptActionCode
	 */
   public char[] getRlu5fCellcryptActionCode() throws CFException{
     if (isRlu5fCellcryptActionCodeModified()) { 
        rlu5fCellcryptActionCode = refreshRlu5fCellcryptActionCode();
     }
   		return rlu5fCellcryptActionCode;
   }

  
	/**
	*  set variable rlu5fCellcryptActionCode
	*  Corresponding COBOL Variable is RLU5F-CELLCRYPT-ACTION-CODE
	*  @param value
	**/
   public void setRlu5fCellcryptActionCode(char[] value) {
      rlu5fCellcryptActionCode = checkRlu5fCellcryptActionCodeConstraints(value);
      serializeRlu5fCellcryptActionCode(rlu5fCellcryptActionCode);
   } 

     /**
	 * 	Update Rlu5fCellcryptActionCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fCellcryptActionCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fCellcryptActionCode,rlu5fCellcryptActionCode.length);
   	
   }
   
   public void setRlu5fCellcryptActionCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptActionCode,rlu5fCellcryptActionCode.length);
   	
   }
   
     /**
	 * 	Update Rlu5fCellcryptActionCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fCellcryptActionCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptActionCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fCellcryptActionCode with another Field
	 *	@param value
	 */
   public void setRlu5fCellcryptActionCode(Field source) {
       replace(source,0,source.length(),beginRlu5fCellcryptActionCode,RLU_5F_CELLCRYPT_ACTION_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fCellcryptActionCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fCellcryptActionCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptActionCode,RLU_5F_CELLCRYPT_ACTION_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fCellcryptActionCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fCellcryptActionCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptActionCode+targetIndex,targetLen);
    
   }
	char[] rlu5fCcryptAdd88Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isRlu5fCcryptAdd()
	 *	@return  Returns true if isRlu5fCcryptAdd() is "A"
	 */
   public boolean isRlu5fCcryptAdd() throws CFException {
      return (  compareChars( getRlu5fCellcryptActionCode() , rlu5fCcryptAdd88Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setRlu5fCcryptAddTrue() {  			
    	setRlu5fCellcryptActionCode( rlu5fCcryptAdd88Value);
   	}
	char[] rlu5fCcryptCancel88Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isRlu5fCcryptCancel()
	 *	@return  Returns true if isRlu5fCcryptCancel() is "C"
	 */
   public boolean isRlu5fCcryptCancel() throws CFException {
      return (  compareChars( getRlu5fCellcryptActionCode() , rlu5fCcryptCancel88Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setRlu5fCcryptCancelTrue() {  			
    	setRlu5fCellcryptActionCode( rlu5fCcryptCancel88Value);
   	}
	char[] rlu5fCcryptRemove88Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isRlu5fCcryptRemove()
	 *	@return  Returns true if isRlu5fCcryptRemove() is "R"
	 */
   public boolean isRlu5fCcryptRemove() throws CFException {
      return (  compareChars( getRlu5fCellcryptActionCode() , rlu5fCcryptRemove88Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setRlu5fCcryptRemoveTrue() {  			
    	setRlu5fCellcryptActionCode( rlu5fCcryptRemove88Value);
   	}
	char[] rlu5fCcrypt1timeChrg88Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isRlu5fCcrypt1timeChrg()
	 *	@return  Returns true if isRlu5fCcrypt1timeChrg() is "O"
	 */
   public boolean isRlu5fCcrypt1timeChrg() throws CFException {
      return (  compareChars( getRlu5fCellcryptActionCode() , rlu5fCcrypt1timeChrg88Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setRlu5fCcrypt1timeChrgTrue() {  			
    	setRlu5fCellcryptActionCode( rlu5fCcrypt1timeChrg88Value);
   	}
	public BigDecimal getRlu5fCellcryptUnitCost() throws CFException {
        if (isRlu5fCellcryptUnitCostModified()) { 
           rlu5fCellcryptUnitCost = refreshRlu5fCellcryptUnitCost();
        }
   		return rlu5fCellcryptUnitCost;
	}

    public char[] getRlu5fCellcryptUnitCostString() {
          return  rlu5fCellcryptUnitCostString();
    }
	
	/**
	 * 	Update Rlu5fCellcryptUnitCost with the passed number
	 *  Corresponding COBOL Variable is RLU5F-CELLCRYPT-UNIT-COST
	 *	@param number
	 */
	public void setRlu5fCellcryptUnitCost(BigDecimal number) {	
     rlu5fCellcryptUnitCost = checkRlu5fCellcryptUnitCostMaxLimit(number);
	    serializeRlu5fCellcryptUnitCost(rlu5fCellcryptUnitCost);
   }
	/**
	 *	Returns the value of rlu5fCellcryptTransactionDt
	 *	@return rlu5fCellcryptTransactionDt
	 */
   public char[] getRlu5fCellcryptTransactionDt() throws CFException{
     if (isRlu5fCellcryptTransactionDtModified()) { 
        rlu5fCellcryptTransactionDt = refreshRlu5fCellcryptTransactionDt();
     }
   		return rlu5fCellcryptTransactionDt;
   }

  
	/**
	*  set variable rlu5fCellcryptTransactionDt
	*  Corresponding COBOL Variable is RLU5F-CELLCRYPT-TRANSACTION-DT
	*  @param value
	**/
   public void setRlu5fCellcryptTransactionDt(char[] value) {
      rlu5fCellcryptTransactionDt = checkRlu5fCellcryptTransactionDtConstraints(value);
      serializeRlu5fCellcryptTransactionDt(rlu5fCellcryptTransactionDt);
   } 

     /**
	 * 	Update Rlu5fCellcryptTransactionDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fCellcryptTransactionDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fCellcryptTransactionDt,rlu5fCellcryptTransactionDt.length);
   	
   }
   
   public void setRlu5fCellcryptTransactionDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptTransactionDt,rlu5fCellcryptTransactionDt.length);
   	
   }
   
     /**
	 * 	Update Rlu5fCellcryptTransactionDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fCellcryptTransactionDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptTransactionDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fCellcryptTransactionDt with another Field
	 *	@param value
	 */
   public void setRlu5fCellcryptTransactionDt(Field source) {
       replace(source,0,source.length(),beginRlu5fCellcryptTransactionDt,RLU_5F_CELLCRYPT_TRANSACTION_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fCellcryptTransactionDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fCellcryptTransactionDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptTransactionDt,RLU_5F_CELLCRYPT_TRANSACTION_DT_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fCellcryptTransactionDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fCellcryptTransactionDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptTransactionDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fCellcryptTransactionRd
	 *	@return rlu5fCellcryptTransactionRd
	 */   
	 public Rlu5fCellcryptTransactionRd getRlu5fCellcryptTransactionRd() {
   	return rlu5fCellcryptTransactionRd;
   }
   /**
	* 	Update Rlu5fCellcryptTransactionRd with the passed value
	*   Corresponding COBOL Variable is RLU5F-CELLCRYPT-TRANSACTION-RD
	*	@param value
	*/
   public void setRlu5fCellcryptTransactionRd(char[] value) {
      rlu5fCellcryptTransactionRd.setString(value); 
   }   
    
     /**
	 * 	Update Rlu5fCellcryptTransactionRd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlu5fCellcryptTransactionRd(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fCellcryptTransactionRd.begin,rlu5fCellcryptTransactionRd.length());
   }
   
     /**
	 * 	Update Rlu5fCellcryptTransactionRd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fCellcryptTransactionRd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fCellcryptTransactionRd.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Rlu5fCellcryptTransactionRd with another Field
	 *	@param value
	 */
   public void setRlu5fCellcryptTransactionRd(Field source) {
   	replace(source,0,source.length(),rlu5fCellcryptTransactionRd.begin,rlu5fCellcryptTransactionRd.length());
   }  
   
     /**
	 * 	Update Rlu5fCellcryptTransactionRd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlu5fCellcryptTransactionRd(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fCellcryptTransactionRd.begin,rlu5fCellcryptTransactionRd.length());
   }
   
     /**
	 * 	Update Rlu5fCellcryptTransactionRd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fCellcryptTransactionRd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fCellcryptTransactionRd.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rlu5fCellcryptProrateInd
	 *	@return rlu5fCellcryptProrateInd
	 */
   public char[] getRlu5fCellcryptProrateInd() throws CFException{
     if (isRlu5fCellcryptProrateIndModified()) { 
        rlu5fCellcryptProrateInd = refreshRlu5fCellcryptProrateInd();
     }
   		return rlu5fCellcryptProrateInd;
   }

  
	/**
	*  set variable rlu5fCellcryptProrateInd
	*  Corresponding COBOL Variable is RLU5F-CELLCRYPT-PRORATE-IND
	*  @param value
	**/
   public void setRlu5fCellcryptProrateInd(char[] value) {
      rlu5fCellcryptProrateInd = checkRlu5fCellcryptProrateIndConstraints(value);
      serializeRlu5fCellcryptProrateInd(rlu5fCellcryptProrateInd);
   } 

     /**
	 * 	Update Rlu5fCellcryptProrateInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fCellcryptProrateInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fCellcryptProrateInd,rlu5fCellcryptProrateInd.length);
   	
   }
   
   public void setRlu5fCellcryptProrateInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptProrateInd,rlu5fCellcryptProrateInd.length);
   	
   }
   
     /**
	 * 	Update Rlu5fCellcryptProrateInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fCellcryptProrateInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptProrateInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fCellcryptProrateInd with another Field
	 *	@param value
	 */
   public void setRlu5fCellcryptProrateInd(Field source) {
       replace(source,0,source.length(),beginRlu5fCellcryptProrateInd,RLU_5F_CELLCRYPT_PRORATE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fCellcryptProrateInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fCellcryptProrateInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptProrateInd,RLU_5F_CELLCRYPT_PRORATE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fCellcryptProrateInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fCellcryptProrateInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptProrateInd+targetIndex,targetLen);
    
   }
	char[] rlu5fCellcryptProrateYes88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isRlu5fCellcryptProrateYes()
	 *	@return  Returns true if isRlu5fCellcryptProrateYes() is "Y"
	 */
   public boolean isRlu5fCellcryptProrateYes() throws CFException {
      return (  compareChars( getRlu5fCellcryptProrateInd() , rlu5fCellcryptProrateYes88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setRlu5fCellcryptProrateYesTrue() {  			
    	setRlu5fCellcryptProrateInd( rlu5fCellcryptProrateYes88Value);
   	}
	char[] rlu5fCellcryptProrateNo88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isRlu5fCellcryptProrateNo()
	 *	@return  Returns true if isRlu5fCellcryptProrateNo() is "N"
	 */
   public boolean isRlu5fCellcryptProrateNo() throws CFException {
      return (  compareChars( getRlu5fCellcryptProrateInd() , rlu5fCellcryptProrateNo88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setRlu5fCellcryptProrateNoTrue() {  			
    	setRlu5fCellcryptProrateInd( rlu5fCellcryptProrateNo88Value);
   	}
	/**
	 *	Returns the value of rlu5fSharedInd
	 *	@return rlu5fSharedInd
	 */
   public char[] getRlu5fSharedInd() throws CFException{
     if (isRlu5fSharedIndModified()) { 
        rlu5fSharedInd = refreshRlu5fSharedInd();
     }
   		return rlu5fSharedInd;
   }

  
	/**
	*  set variable rlu5fSharedInd
	*  Corresponding COBOL Variable is RLU5F-SHARED-IND
	*  @param value
	**/
   public void setRlu5fSharedInd(char[] value) {
      rlu5fSharedInd = checkRlu5fSharedIndConstraints(value);
      serializeRlu5fSharedInd(rlu5fSharedInd);
   } 

     /**
	 * 	Update Rlu5fSharedInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fSharedInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fSharedInd,rlu5fSharedInd.length);
   	
   }
   
   public void setRlu5fSharedInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fSharedInd,rlu5fSharedInd.length);
   	
   }
   
     /**
	 * 	Update Rlu5fSharedInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fSharedInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fSharedInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fSharedInd with another Field
	 *	@param value
	 */
   public void setRlu5fSharedInd(Field source) {
       replace(source,0,source.length(),beginRlu5fSharedInd,RLU_5F_SHARED_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fSharedInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fSharedInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fSharedInd,RLU_5F_SHARED_IND_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fSharedInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fSharedInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fSharedInd+targetIndex,targetLen);
    
   }
	public int getRlu5fShareSet() throws CFException {
        if (isRlu5fShareSetModified()) { 
           rlu5fShareSet = refreshRlu5fShareSet();
        }
   		return rlu5fShareSet;
	}
	
	/**
	 * 	Update Rlu5fShareSet with the passed value
	 *  Corresponding COBOL Variable is RLU5F-SHARE-SET
	 *	@param number
	 */
	public void setRlu5fShareSet(int number) {
			rlu5fShareSet = checkRlu5fShareSetMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeRlu5fShareSet(rlu5fShareSet);
	}


	public void setRlu5fShareSet(long number) {
	    number = checkRlu5fShareSetMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fShareSet((int)number);
	}
	
	public BigDecimal getRlu5fDevicePrice() throws CFException {
        if (isRlu5fDevicePriceModified()) { 
           rlu5fDevicePrice = refreshRlu5fDevicePrice();
        }
   		return rlu5fDevicePrice;
	}

    public char[] getRlu5fDevicePriceString() {
          return  rlu5fDevicePriceString();
    }
	
	/**
	 * 	Update Rlu5fDevicePrice with the passed number
	 *  Corresponding COBOL Variable is RLU5F-DEVICE-PRICE
	 *	@param number
	 */
	public void setRlu5fDevicePrice(BigDecimal number) {	
     rlu5fDevicePrice = checkRlu5fDevicePriceMaxLimit(number);
	    serializeRlu5fDevicePrice(rlu5fDevicePrice);
   }
	/**
	 *	Returns the  value of rlu5fDeviceTax
	 *  Corresponding COBOL Variable is RLU5F-DEVICE-TAX
	 *	@return rlu5fDeviceTax
	 */
   public List<Rlu5fDeviceTax> getRlu5fDeviceTax() {
       return rlu5fDeviceTax;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return rlu5fDeviceTax
	 */
	public Rlu5fDeviceTax getRlu5fDeviceTax(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getRlu5fDeviceTax(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= RLU_5F_DEVICE_TAX_SIZE) {
             	index = RLU_5F_DEVICE_TAX_SIZE -1; // can't exceed max array size
             	logger.trace("rlu5fDeviceTax - Array index exceeded max Size {}, resetting it to max allowed",RLU_5F_DEVICE_TAX_SIZE); 
	    }
		if (index >= rlu5fDeviceTax.size()) {
       		for (int fillIndex =  rlu5fDeviceTax.size() -1; fillIndex < index;fillIndex++) {
		       rlu5fDeviceTax.add(null);
		    }
			rlu5fDeviceTax.set(index,
			   	   	new Rlu5fDeviceTax(this,beginRlu5fDeviceTax + index * Rlu5fDeviceTax.getRlu5fDeviceTaxFieldLength()) 
				                        ); 	
		} 
   	   Rlu5fDeviceTax value = rlu5fDeviceTax.get(index);
   	   if (value == null) {
   	      rlu5fDeviceTax.set(index,
			   	   	new Rlu5fDeviceTax(this,beginRlu5fDeviceTax + index * Rlu5fDeviceTax.getRlu5fDeviceTaxFieldLength()) 
				                        ); 
		  value = rlu5fDeviceTax.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Rlu5fDeviceTax at index with the passed value
	 *  Corresponding COBOL Variable is RLU5F-DEVICE-TAX
	 *  @param index
	 *	@param value
	 */
  public void setRlu5fDeviceTax(int index,char[] value) {
   	getRlu5fDeviceTax(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of rlu5fCellcryptDiscAmt
	 *	@return rlu5fCellcryptDiscAmt
	 */
   public char[] getRlu5fCellcryptDiscAmt() throws CFException{
     if (isRlu5fCellcryptDiscAmtModified()) { 
        rlu5fCellcryptDiscAmt = refreshRlu5fCellcryptDiscAmt();
     }
   		return rlu5fCellcryptDiscAmt;
   }

  
	/**
	*  set variable rlu5fCellcryptDiscAmt
	*  Corresponding COBOL Variable is RLU5F-CELLCRYPT-DISC-AMT
	*  @param value
	**/
   public void setRlu5fCellcryptDiscAmt(char[] value) {
      rlu5fCellcryptDiscAmt = checkRlu5fCellcryptDiscAmtConstraints(value);
      serializeRlu5fCellcryptDiscAmt(rlu5fCellcryptDiscAmt);
   } 

     /**
	 * 	Update Rlu5fCellcryptDiscAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fCellcryptDiscAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fCellcryptDiscAmt,rlu5fCellcryptDiscAmt.length);
   	
   }
   
   public void setRlu5fCellcryptDiscAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptDiscAmt,rlu5fCellcryptDiscAmt.length);
   	
   }
   
     /**
	 * 	Update Rlu5fCellcryptDiscAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fCellcryptDiscAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptDiscAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fCellcryptDiscAmt with another Field
	 *	@param value
	 */
   public void setRlu5fCellcryptDiscAmt(Field source) {
       replace(source,0,source.length(),beginRlu5fCellcryptDiscAmt,RLU_5F_CELLCRYPT_DISC_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fCellcryptDiscAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fCellcryptDiscAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptDiscAmt,RLU_5F_CELLCRYPT_DISC_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fCellcryptDiscAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fCellcryptDiscAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fCellcryptDiscAmt+targetIndex,targetLen);
    
   }
	public BigDecimal getRlu5fPlanAmountAfterDisc() throws CFException {
        if (isRlu5fPlanAmountAfterDiscModified()) { 
           rlu5fPlanAmountAfterDisc = refreshRlu5fPlanAmountAfterDisc();
        }
   		return rlu5fPlanAmountAfterDisc;
	}

    public char[] getRlu5fPlanAmountAfterDiscString() {
          return  rlu5fPlanAmountAfterDiscString();
    }
	
	/**
	 * 	Update Rlu5fPlanAmountAfterDisc with the passed number
	 *  Corresponding COBOL Variable is RLU5F-PLAN-AMOUNT-AFTER-DISC
	 *	@param number
	 */
	public void setRlu5fPlanAmountAfterDisc(BigDecimal number) {	
     rlu5fPlanAmountAfterDisc = checkRlu5fPlanAmountAfterDiscMaxLimit(number);
	    serializeRlu5fPlanAmountAfterDisc(rlu5fPlanAmountAfterDisc);
   }
	/**
	 *	Returns the value of rlu5fOnetimeNewInd
	 *	@return rlu5fOnetimeNewInd
	 */
   public char[] getRlu5fOnetimeNewInd() throws CFException{
     if (isRlu5fOnetimeNewIndModified()) { 
        rlu5fOnetimeNewInd = refreshRlu5fOnetimeNewInd();
     }
   		return rlu5fOnetimeNewInd;
   }

  
	/**
	*  set variable rlu5fOnetimeNewInd
	*  Corresponding COBOL Variable is RLU5F-ONETIME-NEW-IND
	*  @param value
	**/
   public void setRlu5fOnetimeNewInd(char[] value) {
      rlu5fOnetimeNewInd = checkRlu5fOnetimeNewIndConstraints(value);
      serializeRlu5fOnetimeNewInd(rlu5fOnetimeNewInd);
   } 

     /**
	 * 	Update Rlu5fOnetimeNewInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fOnetimeNewInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fOnetimeNewInd,rlu5fOnetimeNewInd.length);
   	
   }
   
   public void setRlu5fOnetimeNewInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fOnetimeNewInd,rlu5fOnetimeNewInd.length);
   	
   }
   
     /**
	 * 	Update Rlu5fOnetimeNewInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fOnetimeNewInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fOnetimeNewInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fOnetimeNewInd with another Field
	 *	@param value
	 */
   public void setRlu5fOnetimeNewInd(Field source) {
       replace(source,0,source.length(),beginRlu5fOnetimeNewInd,RLU_5F_ONETIME_NEW_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fOnetimeNewInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fOnetimeNewInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fOnetimeNewInd,RLU_5F_ONETIME_NEW_IND_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fOnetimeNewInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fOnetimeNewInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fOnetimeNewInd+targetIndex,targetLen);
    
   }
	public BigDecimal getRlu5fOverageBillableQty() throws CFException {
        if (isRlu5fOverageBillableQtyModified()) { 
           rlu5fOverageBillableQty = refreshRlu5fOverageBillableQty();
        }
   		return rlu5fOverageBillableQty;
	}

    public char[] getRlu5fOverageBillableQtyString() {
          return  rlu5fOverageBillableQtyString();
    }
	
	/**
	 * 	Update Rlu5fOverageBillableQty with the passed number
	 *  Corresponding COBOL Variable is RLU5F-OVERAGE-BILLABLE-QTY
	 *	@param number
	 */
	public void setRlu5fOverageBillableQty(BigDecimal number) {	
     rlu5fOverageBillableQty = checkRlu5fOverageBillableQtyMaxLimit(number);
	    serializeRlu5fOverageBillableQty(rlu5fOverageBillableQty);
   }
	public BigDecimal getRlu5fOverageRate() throws CFException {
        if (isRlu5fOverageRateModified()) { 
           rlu5fOverageRate = refreshRlu5fOverageRate();
        }
   		return rlu5fOverageRate;
	}

    public char[] getRlu5fOverageRateString() {
          return  rlu5fOverageRateString();
    }
	
	/**
	 * 	Update Rlu5fOverageRate with the passed number
	 *  Corresponding COBOL Variable is RLU5F-OVERAGE-RATE
	 *	@param number
	 */
	public void setRlu5fOverageRate(BigDecimal number) {	
     rlu5fOverageRate = checkRlu5fOverageRateMaxLimit(number);
	    serializeRlu5fOverageRate(rlu5fOverageRate);
   }
	public BigDecimal getRlu5fInstallLoanAmount() throws CFException {
        if (isRlu5fInstallLoanAmountModified()) { 
           rlu5fInstallLoanAmount = refreshRlu5fInstallLoanAmount();
        }
   		return rlu5fInstallLoanAmount;
	}

    public char[] getRlu5fInstallLoanAmountString() {
          return  rlu5fInstallLoanAmountString();
    }
	
	/**
	 * 	Update Rlu5fInstallLoanAmount with the passed number
	 *  Corresponding COBOL Variable is RLU5F-INSTALL-LOAN-AMOUNT
	 *	@param number
	 */
	public void setRlu5fInstallLoanAmount(BigDecimal number) {	
     rlu5fInstallLoanAmount = checkRlu5fInstallLoanAmountMaxLimit(number);
	    serializeRlu5fInstallLoanAmount(rlu5fInstallLoanAmount);
   }
	/**
	 *	Returns the value of rlu5fVzedgePaymentInd
	 *	@return rlu5fVzedgePaymentInd
	 */
   public char[] getRlu5fVzedgePaymentInd() throws CFException{
     if (isRlu5fVzedgePaymentIndModified()) { 
        rlu5fVzedgePaymentInd = refreshRlu5fVzedgePaymentInd();
     }
   		return rlu5fVzedgePaymentInd;
   }

  
	/**
	*  set variable rlu5fVzedgePaymentInd
	*  Corresponding COBOL Variable is RLU5F-VZEDGE-PAYMENT-IND
	*  @param value
	**/
   public void setRlu5fVzedgePaymentInd(char[] value) {
      rlu5fVzedgePaymentInd = checkRlu5fVzedgePaymentIndConstraints(value);
      serializeRlu5fVzedgePaymentInd(rlu5fVzedgePaymentInd);
   } 

     /**
	 * 	Update Rlu5fVzedgePaymentInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fVzedgePaymentInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fVzedgePaymentInd,rlu5fVzedgePaymentInd.length);
   	
   }
   
   public void setRlu5fVzedgePaymentInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fVzedgePaymentInd,rlu5fVzedgePaymentInd.length);
   	
   }
   
     /**
	 * 	Update Rlu5fVzedgePaymentInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fVzedgePaymentInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fVzedgePaymentInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fVzedgePaymentInd with another Field
	 *	@param value
	 */
   public void setRlu5fVzedgePaymentInd(Field source) {
       replace(source,0,source.length(),beginRlu5fVzedgePaymentInd,RLU_5F_VZEDGE_PAYMENT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fVzedgePaymentInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fVzedgePaymentInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fVzedgePaymentInd,RLU_5F_VZEDGE_PAYMENT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fVzedgePaymentInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fVzedgePaymentInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fVzedgePaymentInd+targetIndex,targetLen);
    
   }
	public BigDecimal getRlu5fAccntUsageAllow() throws CFException {
        if (isRlu5fAccntUsageAllowModified()) { 
           rlu5fAccntUsageAllow = refreshRlu5fAccntUsageAllow();
        }
   		return rlu5fAccntUsageAllow;
	}

    public char[] getRlu5fAccntUsageAllowString() {
          return  rlu5fAccntUsageAllowString();
    }
	
	/**
	 * 	Update Rlu5fAccntUsageAllow with the passed number
	 *  Corresponding COBOL Variable is RLU5F-ACCNT-USAGE-ALLOW
	 *	@param number
	 */
	public void setRlu5fAccntUsageAllow(BigDecimal number) {	
     rlu5fAccntUsageAllow = checkRlu5fAccntUsageAllowMaxLimit(number);
	    serializeRlu5fAccntUsageAllow(rlu5fAccntUsageAllow);
   }
	/**
	 *	Returns the value of rlu5fTaxSurchrgRecInd
	 *	@return rlu5fTaxSurchrgRecInd
	 */
   public char[] getRlu5fTaxSurchrgRecInd() throws CFException{
     if (isRlu5fTaxSurchrgRecIndModified()) { 
        rlu5fTaxSurchrgRecInd = refreshRlu5fTaxSurchrgRecInd();
     }
   		return rlu5fTaxSurchrgRecInd;
   }

  
	/**
	*  set variable rlu5fTaxSurchrgRecInd
	*  Corresponding COBOL Variable is RLU5F-TAX-SURCHRG-REC-IND
	*  @param value
	**/
   public void setRlu5fTaxSurchrgRecInd(char[] value) {
      rlu5fTaxSurchrgRecInd = checkRlu5fTaxSurchrgRecIndConstraints(value);
      serializeRlu5fTaxSurchrgRecInd(rlu5fTaxSurchrgRecInd);
   } 

     /**
	 * 	Update Rlu5fTaxSurchrgRecInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fTaxSurchrgRecInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fTaxSurchrgRecInd,rlu5fTaxSurchrgRecInd.length);
   	
   }
   
   public void setRlu5fTaxSurchrgRecInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fTaxSurchrgRecInd,rlu5fTaxSurchrgRecInd.length);
   	
   }
   
     /**
	 * 	Update Rlu5fTaxSurchrgRecInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fTaxSurchrgRecInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fTaxSurchrgRecInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fTaxSurchrgRecInd with another Field
	 *	@param value
	 */
   public void setRlu5fTaxSurchrgRecInd(Field source) {
       replace(source,0,source.length(),beginRlu5fTaxSurchrgRecInd,RLU_5F_TAX_SURCHRG_REC_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fTaxSurchrgRecInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fTaxSurchrgRecInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fTaxSurchrgRecInd,RLU_5F_TAX_SURCHRG_REC_IND_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fTaxSurchrgRecInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fTaxSurchrgRecInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fTaxSurchrgRecInd+targetIndex,targetLen);
    
   }
	char[] rlu5fTaxInd88Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isRlu5fTaxInd()
	 *	@return  Returns true if isRlu5fTaxInd() is "T"
	 */
   public boolean isRlu5fTaxInd() throws CFException {
      return (  compareChars( getRlu5fTaxSurchrgRecInd() , rlu5fTaxInd88Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setRlu5fTaxIndTrue() {  			
    	setRlu5fTaxSurchrgRecInd( rlu5fTaxInd88Value);
   	}
	char[] rlu5fSurchrgInd88Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isRlu5fSurchrgInd()
	 *	@return  Returns true if isRlu5fSurchrgInd() is "S"
	 */
   public boolean isRlu5fSurchrgInd() throws CFException {
      return (  compareChars( getRlu5fTaxSurchrgRecInd() , rlu5fSurchrgInd88Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setRlu5fSurchrgIndTrue() {  			
    	setRlu5fTaxSurchrgRecInd( rlu5fSurchrgInd88Value);
   	}
	/**
	 *	Returns the value of rlu5fLateFeeDate
	 *	@return rlu5fLateFeeDate
	 */   
	 public Rlu5fLateFeeDate getRlu5fLateFeeDate() {
   	return rlu5fLateFeeDate;
   }
   /**
	* 	Update Rlu5fLateFeeDate with the passed value
	*   Corresponding COBOL Variable is RLU5F-LATE-FEE-DATE
	*	@param value
	*/
   public void setRlu5fLateFeeDate(char[] value) {
      rlu5fLateFeeDate.setString(value); 
   }   
    
     /**
	 * 	Update Rlu5fLateFeeDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlu5fLateFeeDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fLateFeeDate.begin,rlu5fLateFeeDate.length());
   }
   
     /**
	 * 	Update Rlu5fLateFeeDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fLateFeeDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fLateFeeDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Rlu5fLateFeeDate with another Field
	 *	@param value
	 */
   public void setRlu5fLateFeeDate(Field source) {
   	replace(source,0,source.length(),rlu5fLateFeeDate.begin,rlu5fLateFeeDate.length());
   }  
   
     /**
	 * 	Update Rlu5fLateFeeDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlu5fLateFeeDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fLateFeeDate.begin,rlu5fLateFeeDate.length());
   }
   
     /**
	 * 	Update Rlu5fLateFeeDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fLateFeeDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fLateFeeDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rlu5fOnetimeEventType
	 *	@return rlu5fOnetimeEventType
	 */
   public char[] getRlu5fOnetimeEventType() throws CFException{
     if (isRlu5fOnetimeEventTypeModified()) { 
        rlu5fOnetimeEventType = refreshRlu5fOnetimeEventType();
     }
   		return rlu5fOnetimeEventType;
   }

  
	/**
	*  set variable rlu5fOnetimeEventType
	*  Corresponding COBOL Variable is RLU5F-ONETIME-EVENT-TYPE
	*  @param value
	**/
   public void setRlu5fOnetimeEventType(char[] value) {
      rlu5fOnetimeEventType = checkRlu5fOnetimeEventTypeConstraints(value);
      serializeRlu5fOnetimeEventType(rlu5fOnetimeEventType);
   } 

     /**
	 * 	Update Rlu5fOnetimeEventType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fOnetimeEventType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fOnetimeEventType,rlu5fOnetimeEventType.length);
   	
   }
   
   public void setRlu5fOnetimeEventType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fOnetimeEventType,rlu5fOnetimeEventType.length);
   	
   }
   
     /**
	 * 	Update Rlu5fOnetimeEventType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fOnetimeEventType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fOnetimeEventType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fOnetimeEventType with another Field
	 *	@param value
	 */
   public void setRlu5fOnetimeEventType(Field source) {
       replace(source,0,source.length(),beginRlu5fOnetimeEventType,RLU_5F_ONETIME_EVENT_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fOnetimeEventType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fOnetimeEventType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fOnetimeEventType,RLU_5F_ONETIME_EVENT_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fOnetimeEventType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fOnetimeEventType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fOnetimeEventType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fTaxSurchargeInd
	 *	@return rlu5fTaxSurchargeInd
	 */
   public char[] getRlu5fTaxSurchargeInd() throws CFException{
     if (isRlu5fTaxSurchargeIndModified()) { 
        rlu5fTaxSurchargeInd = refreshRlu5fTaxSurchargeInd();
     }
   		return rlu5fTaxSurchargeInd;
   }

  
	/**
	*  set variable rlu5fTaxSurchargeInd
	*  Corresponding COBOL Variable is RLU5F-TAX-SURCHARGE-IND
	*  @param value
	**/
   public void setRlu5fTaxSurchargeInd(char[] value) {
      rlu5fTaxSurchargeInd = checkRlu5fTaxSurchargeIndConstraints(value);
      serializeRlu5fTaxSurchargeInd(rlu5fTaxSurchargeInd);
   } 

     /**
	 * 	Update Rlu5fTaxSurchargeInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fTaxSurchargeInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fTaxSurchargeInd,rlu5fTaxSurchargeInd.length);
   	
   }
   
   public void setRlu5fTaxSurchargeInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fTaxSurchargeInd,rlu5fTaxSurchargeInd.length);
   	
   }
   
     /**
	 * 	Update Rlu5fTaxSurchargeInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fTaxSurchargeInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fTaxSurchargeInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fTaxSurchargeInd with another Field
	 *	@param value
	 */
   public void setRlu5fTaxSurchargeInd(Field source) {
       replace(source,0,source.length(),beginRlu5fTaxSurchargeInd,RLU_5F_TAX_SURCHARGE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fTaxSurchargeInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fTaxSurchargeInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fTaxSurchargeInd,RLU_5F_TAX_SURCHARGE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fTaxSurchargeInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fTaxSurchargeInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fTaxSurchargeInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fAcctPlanDetailDesc
	 *	@return rlu5fAcctPlanDetailDesc
	 */
   public char[] getRlu5fAcctPlanDetailDesc() throws CFException{
     if (isRlu5fAcctPlanDetailDescModified()) { 
        rlu5fAcctPlanDetailDesc = refreshRlu5fAcctPlanDetailDesc();
     }
   		return rlu5fAcctPlanDetailDesc;
   }

  
	/**
	*  set variable rlu5fAcctPlanDetailDesc
	*  Corresponding COBOL Variable is RLU5F-ACCT-PLAN-DETAIL-DESC
	*  @param value
	**/
   public void setRlu5fAcctPlanDetailDesc(char[] value) {
      rlu5fAcctPlanDetailDesc = checkRlu5fAcctPlanDetailDescConstraints(value);
      serializeRlu5fAcctPlanDetailDesc(rlu5fAcctPlanDetailDesc);
   } 

     /**
	 * 	Update Rlu5fAcctPlanDetailDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fAcctPlanDetailDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fAcctPlanDetailDesc,rlu5fAcctPlanDetailDesc.length);
   	
   }
   
   public void setRlu5fAcctPlanDetailDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fAcctPlanDetailDesc,rlu5fAcctPlanDetailDesc.length);
   	
   }
   
     /**
	 * 	Update Rlu5fAcctPlanDetailDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fAcctPlanDetailDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fAcctPlanDetailDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fAcctPlanDetailDesc with another Field
	 *	@param value
	 */
   public void setRlu5fAcctPlanDetailDesc(Field source) {
       replace(source,0,source.length(),beginRlu5fAcctPlanDetailDesc,RLU_5F_ACCT_PLAN_DETAIL_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fAcctPlanDetailDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fAcctPlanDetailDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fAcctPlanDetailDesc,RLU_5F_ACCT_PLAN_DETAIL_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fAcctPlanDetailDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fAcctPlanDetailDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fAcctPlanDetailDesc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fStartDate
	 *	@return rlu5fStartDate
	 */   
	 public Rlu5fStartDate getRlu5fStartDate() {
   	return rlu5fStartDate;
   }
   /**
	* 	Update Rlu5fStartDate with the passed value
	*   Corresponding COBOL Variable is RLU5F-START-DATE
	*	@param value
	*/
   public void setRlu5fStartDate(char[] value) {
      rlu5fStartDate.setString(value); 
   }   
    
     /**
	 * 	Update Rlu5fStartDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlu5fStartDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fStartDate.begin,rlu5fStartDate.length());
   }
   
     /**
	 * 	Update Rlu5fStartDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fStartDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fStartDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Rlu5fStartDate with another Field
	 *	@param value
	 */
   public void setRlu5fStartDate(Field source) {
   	replace(source,0,source.length(),rlu5fStartDate.begin,rlu5fStartDate.length());
   }  
   
     /**
	 * 	Update Rlu5fStartDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlu5fStartDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fStartDate.begin,rlu5fStartDate.length());
   }
   
     /**
	 * 	Update Rlu5fStartDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fStartDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fStartDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rlu5fEndDate
	 *	@return rlu5fEndDate
	 */   
	 public Rlu5fEndDate getRlu5fEndDate() {
   	return rlu5fEndDate;
   }
   /**
	* 	Update Rlu5fEndDate with the passed value
	*   Corresponding COBOL Variable is RLU5F-END-DATE
	*	@param value
	*/
   public void setRlu5fEndDate(char[] value) {
      rlu5fEndDate.setString(value); 
   }   
    
     /**
	 * 	Update Rlu5fEndDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlu5fEndDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fEndDate.begin,rlu5fEndDate.length());
   }
   
     /**
	 * 	Update Rlu5fEndDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fEndDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fEndDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Rlu5fEndDate with another Field
	 *	@param value
	 */
   public void setRlu5fEndDate(Field source) {
   	replace(source,0,source.length(),rlu5fEndDate.begin,rlu5fEndDate.length());
   }  
   
     /**
	 * 	Update Rlu5fEndDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlu5fEndDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fEndDate.begin,rlu5fEndDate.length());
   }
   
     /**
	 * 	Update Rlu5fEndDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fEndDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fEndDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rlu5fSplanCatCd
	 *	@return rlu5fSplanCatCd
	 */
   public char[] getRlu5fSplanCatCd() throws CFException{
     if (isRlu5fSplanCatCdModified()) { 
        rlu5fSplanCatCd = refreshRlu5fSplanCatCd();
     }
   		return rlu5fSplanCatCd;
   }

  
	/**
	*  set variable rlu5fSplanCatCd
	*  Corresponding COBOL Variable is RLU5F-SPLAN-CAT-CD
	*  @param value
	**/
   public void setRlu5fSplanCatCd(char[] value) {
      rlu5fSplanCatCd = checkRlu5fSplanCatCdConstraints(value);
      serializeRlu5fSplanCatCd(rlu5fSplanCatCd);
   } 

     /**
	 * 	Update Rlu5fSplanCatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fSplanCatCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fSplanCatCd,rlu5fSplanCatCd.length);
   	
   }
   
   public void setRlu5fSplanCatCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fSplanCatCd,rlu5fSplanCatCd.length);
   	
   }
   
     /**
	 * 	Update Rlu5fSplanCatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fSplanCatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fSplanCatCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fSplanCatCd with another Field
	 *	@param value
	 */
   public void setRlu5fSplanCatCd(Field source) {
       replace(source,0,source.length(),beginRlu5fSplanCatCd,RLU_5F_SPLAN_CAT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fSplanCatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fSplanCatCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fSplanCatCd,RLU_5F_SPLAN_CAT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fSplanCatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fSplanCatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fSplanCatCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fServiceId
	 *	@return rlu5fServiceId
	 */
   public char[] getRlu5fServiceId() throws CFException{
     if (isRlu5fServiceIdModified()) { 
        rlu5fServiceId = refreshRlu5fServiceId();
     }
   		return rlu5fServiceId;
   }

  
	/**
	*  set variable rlu5fServiceId
	*  Corresponding COBOL Variable is RLU5F-SERVICE-ID
	*  @param value
	**/
   public void setRlu5fServiceId(char[] value) {
      rlu5fServiceId = checkRlu5fServiceIdConstraints(value);
      serializeRlu5fServiceId(rlu5fServiceId);
   } 

     /**
	 * 	Update Rlu5fServiceId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fServiceId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fServiceId,rlu5fServiceId.length);
   	
   }
   
   public void setRlu5fServiceId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fServiceId,rlu5fServiceId.length);
   	
   }
   
     /**
	 * 	Update Rlu5fServiceId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fServiceId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fServiceId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fServiceId with another Field
	 *	@param value
	 */
   public void setRlu5fServiceId(Field source) {
       replace(source,0,source.length(),beginRlu5fServiceId,RLU_5F_SERVICE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fServiceId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fServiceId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fServiceId,RLU_5F_SERVICE_ID_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fServiceId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fServiceId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fServiceId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fBuyoutPaymentDate
	 *	@return rlu5fBuyoutPaymentDate
	 */   
	 public Rlu5fBuyoutPaymentDate getRlu5fBuyoutPaymentDate() {
   	return rlu5fBuyoutPaymentDate;
   }
   /**
	* 	Update Rlu5fBuyoutPaymentDate with the passed value
	*   Corresponding COBOL Variable is RLU5F-BUYOUT-PAYMENT-DATE
	*	@param value
	*/
   public void setRlu5fBuyoutPaymentDate(char[] value) {
      rlu5fBuyoutPaymentDate.setString(value); 
   }   
    
     /**
	 * 	Update Rlu5fBuyoutPaymentDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlu5fBuyoutPaymentDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fBuyoutPaymentDate.begin,rlu5fBuyoutPaymentDate.length());
   }
   
     /**
	 * 	Update Rlu5fBuyoutPaymentDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fBuyoutPaymentDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fBuyoutPaymentDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Rlu5fBuyoutPaymentDate with another Field
	 *	@param value
	 */
   public void setRlu5fBuyoutPaymentDate(Field source) {
   	replace(source,0,source.length(),rlu5fBuyoutPaymentDate.begin,rlu5fBuyoutPaymentDate.length());
   }  
   
     /**
	 * 	Update Rlu5fBuyoutPaymentDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlu5fBuyoutPaymentDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fBuyoutPaymentDate.begin,rlu5fBuyoutPaymentDate.length());
   }
   
     /**
	 * 	Update Rlu5fBuyoutPaymentDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fBuyoutPaymentDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fBuyoutPaymentDate.begin+targetIndex,targetLen);
   }
	public BigDecimal getRlu5fBuyoutPaymentAmt() throws CFException {
        if (isRlu5fBuyoutPaymentAmtModified()) { 
           rlu5fBuyoutPaymentAmt = refreshRlu5fBuyoutPaymentAmt();
        }
   		return rlu5fBuyoutPaymentAmt;
	}

    public char[] getRlu5fBuyoutPaymentAmtString() {
          return  rlu5fBuyoutPaymentAmtString();
    }
	
	/**
	 * 	Update Rlu5fBuyoutPaymentAmt with the passed number
	 *  Corresponding COBOL Variable is RLU5F-BUYOUT-PAYMENT-AMT
	 *	@param number
	 */
	public void setRlu5fBuyoutPaymentAmt(BigDecimal number) {	
     rlu5fBuyoutPaymentAmt = checkRlu5fBuyoutPaymentAmtMaxLimit(number);
	    serializeRlu5fBuyoutPaymentAmt(rlu5fBuyoutPaymentAmt);
   }
	public int getRlu5fSciProdId() throws CFException {
        if (isRlu5fSciProdIdModified()) { 
           rlu5fSciProdId = refreshRlu5fSciProdId();
        }
   		return rlu5fSciProdId;
	}
	
	/**
	 * 	Update Rlu5fSciProdId with the passed value
	 *  Corresponding COBOL Variable is RLU5F-SCI-PROD-ID
	 *	@param number
	 */
	public void setRlu5fSciProdId(int number) {
			rlu5fSciProdId = checkRlu5fSciProdIdMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeRlu5fSciProdId(rlu5fSciProdId);
	}


	public void setRlu5fSciProdId(long number) {
	    number = checkRlu5fSciProdIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fSciProdId((int)number);
	}
	
	/**
	 *	Returns the value of rlu5fSubscriptionInd
	 *	@return rlu5fSubscriptionInd
	 */
   public char[] getRlu5fSubscriptionInd() throws CFException{
     if (isRlu5fSubscriptionIndModified()) { 
        rlu5fSubscriptionInd = refreshRlu5fSubscriptionInd();
     }
   		return rlu5fSubscriptionInd;
   }

  
	/**
	*  set variable rlu5fSubscriptionInd
	*  Corresponding COBOL Variable is RLU5F-SUBSCRIPTION-IND
	*  @param value
	**/
   public void setRlu5fSubscriptionInd(char[] value) {
      rlu5fSubscriptionInd = checkRlu5fSubscriptionIndConstraints(value);
      serializeRlu5fSubscriptionInd(rlu5fSubscriptionInd);
   } 

     /**
	 * 	Update Rlu5fSubscriptionInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fSubscriptionInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fSubscriptionInd,rlu5fSubscriptionInd.length);
   	
   }
   
   public void setRlu5fSubscriptionInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fSubscriptionInd,rlu5fSubscriptionInd.length);
   	
   }
   
     /**
	 * 	Update Rlu5fSubscriptionInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fSubscriptionInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fSubscriptionInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fSubscriptionInd with another Field
	 *	@param value
	 */
   public void setRlu5fSubscriptionInd(Field source) {
       replace(source,0,source.length(),beginRlu5fSubscriptionInd,RLU_5F_SUBSCRIPTION_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fSubscriptionInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fSubscriptionInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fSubscriptionInd,RLU_5F_SUBSCRIPTION_IND_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fSubscriptionInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fSubscriptionInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fSubscriptionInd+targetIndex,targetLen);
    
   }
	char[] rlu5fMonthlySubscription88Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isRlu5fMonthlySubscription()
	 *	@return  Returns true if isRlu5fMonthlySubscription() is "M"
	 */
   public boolean isRlu5fMonthlySubscription() throws CFException {
      return (  compareChars( getRlu5fSubscriptionInd() , rlu5fMonthlySubscription88Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setRlu5fMonthlySubscriptionTrue() {  			
    	setRlu5fSubscriptionInd( rlu5fMonthlySubscription88Value);
   	}
	char[] rlu5fOnetimeSubscription88Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isRlu5fOnetimeSubscription()
	 *	@return  Returns true if isRlu5fOnetimeSubscription() is "O"
	 */
   public boolean isRlu5fOnetimeSubscription() throws CFException {
      return (  compareChars( getRlu5fSubscriptionInd() , rlu5fOnetimeSubscription88Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setRlu5fOnetimeSubscriptionTrue() {  			
    	setRlu5fSubscriptionInd( rlu5fOnetimeSubscription88Value);
   	}
	char[] rlu5fNewMthlySubscription88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isRlu5fNewMthlySubscription()
	 *	@return  Returns true if isRlu5fNewMthlySubscription() is "N"
	 */
   public boolean isRlu5fNewMthlySubscription() throws CFException {
      return (  compareChars( getRlu5fSubscriptionInd() , rlu5fNewMthlySubscription88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setRlu5fNewMthlySubscriptionTrue() {  			
    	setRlu5fSubscriptionInd( rlu5fNewMthlySubscription88Value);
   	}
	/**
	 *	Returns the value of rlu5fStateCd
	 *	@return rlu5fStateCd
	 */
   public char[] getRlu5fStateCd() throws CFException{
     if (isRlu5fStateCdModified()) { 
        rlu5fStateCd = refreshRlu5fStateCd();
     }
   		return rlu5fStateCd;
   }

  
	/**
	*  set variable rlu5fStateCd
	*  Corresponding COBOL Variable is RLU5F-STATE-CD
	*  @param value
	**/
   public void setRlu5fStateCd(char[] value) {
      rlu5fStateCd = checkRlu5fStateCdConstraints(value);
      serializeRlu5fStateCd(rlu5fStateCd);
   } 

     /**
	 * 	Update Rlu5fStateCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fStateCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fStateCd,rlu5fStateCd.length);
   	
   }
   
   public void setRlu5fStateCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fStateCd,rlu5fStateCd.length);
   	
   }
   
     /**
	 * 	Update Rlu5fStateCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fStateCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fStateCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fStateCd with another Field
	 *	@param value
	 */
   public void setRlu5fStateCd(Field source) {
       replace(source,0,source.length(),beginRlu5fStateCd,RLU_5F_STATE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fStateCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fStateCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fStateCd,RLU_5F_STATE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fStateCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fStateCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fStateCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlu5fFootnoteCd
	 *	@return rlu5fFootnoteCd
	 */
   public char[] getRlu5fFootnoteCd() throws CFException{
     if (isRlu5fFootnoteCdModified()) { 
        rlu5fFootnoteCd = refreshRlu5fFootnoteCd();
     }
   		return rlu5fFootnoteCd;
   }

  
	/**
	*  set variable rlu5fFootnoteCd
	*  Corresponding COBOL Variable is RLU5F-FOOTNOTE-CD
	*  @param value
	**/
   public void setRlu5fFootnoteCd(char[] value) {
      rlu5fFootnoteCd = checkRlu5fFootnoteCdConstraints(value);
      serializeRlu5fFootnoteCd(rlu5fFootnoteCd);
   } 

     /**
	 * 	Update Rlu5fFootnoteCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fFootnoteCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fFootnoteCd,rlu5fFootnoteCd.length);
   	
   }
   
   public void setRlu5fFootnoteCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fFootnoteCd,rlu5fFootnoteCd.length);
   	
   }
   
     /**
	 * 	Update Rlu5fFootnoteCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fFootnoteCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fFootnoteCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fFootnoteCd with another Field
	 *	@param value
	 */
   public void setRlu5fFootnoteCd(Field source) {
       replace(source,0,source.length(),beginRlu5fFootnoteCd,RLU_5F_FOOTNOTE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fFootnoteCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fFootnoteCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fFootnoteCd,RLU_5F_FOOTNOTE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fFootnoteCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fFootnoteCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fFootnoteCd+targetIndex,targetLen);
    
   }
	char[] rlu5fApoPpfDtlLn88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isRlu5fApoPpfDtlLn()
	 *	@return  Returns true if isRlu5fApoPpfDtlLn() is "Y"
	 */
   public boolean isRlu5fApoPpfDtlLn() throws CFException {
      return (  compareChars( getRlu5fFootnoteCd() , rlu5fApoPpfDtlLn88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setRlu5fApoPpfDtlLnTrue() {  			
    	setRlu5fFootnoteCd( rlu5fApoPpfDtlLn88Value);
   	}
	char[] rlu5fFiosJmp88Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isRlu5fFiosJmp()
	 *	@return  Returns true if isRlu5fFiosJmp() is "F"
	 */
   public boolean isRlu5fFiosJmp() throws CFException {
      return (  compareChars( getRlu5fFootnoteCd() , rlu5fFiosJmp88Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setRlu5fFiosJmpTrue() {  			
    	setRlu5fFootnoteCd( rlu5fFiosJmp88Value);
   	}

	
	
	
	/**
	 * 	initializes Rlu5fChrgCrdDtl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRlu5fRecId(CONSTANTS.SPACE_2);
         setRlu5fPgmId(CONSTANTS.SPACE_10);
          rlu5fSuppressInd.initialize();
     
         setRlu5fAccDesc(CONSTANTS.SPACE_50);
			setRlu5fAccAmount(BigDecimal.ZERO);
         setRlu5fAccTypeInd(CONSTANTS.SPACE_2);
          rlu5fDateFrom.initialize();
     
          rlu5fDateTo.initialize();
     
         setRlu5fAccessUsageDesc(CONSTANTS.SPACE_80);
         setRlu5fPlanChngCode(CONSTANTS.SPACE);
			setRlu5fPlanChgPerMonth(BigDecimal.ZERO);
                     setRlu5fPlanDays(0);
         setRlu5fPlanChgInadvInd(CONSTANTS.SPACE);
         setRlu5fDiscountInd(CONSTANTS.SPACE);
         setRlu5fPlanType(CONSTANTS.SPACE_2);
         setRlu5fUnitType(CONSTANTS.SPACE_2);
         setRlu5fPlanId(CONSTANTS.SPACE_6);
         setRlu5fCurDelayInd(CONSTANTS.SPACE);
			setRlu5fDelayShareUsed(BigDecimal.ZERO);
			setRlu5fDelayShareOvrage(BigDecimal.ZERO);
			setRlu5fDiscAmount1(BigDecimal.ZERO);
			setRlu5fDiscAmount2(BigDecimal.ZERO);
         setRlu5fBoboVenderName(CONSTANTS.SPACE_10);
         setRlu5fBoboVenderNumber(CONSTANTS.SPACE_10);
         setRlu5fBoboServDesc(CONSTANTS.SPACE_40);
			setRlu5fBoboTaxAmt(BigDecimal.ZERO);
			setRlu5fBoboSurAmt(BigDecimal.ZERO);
                     setRlu5fMsoNumOfPurchases(0);
         setRlu5fMsoPurchaseDesc(CONSTANTS.SPACE_15);
         setRlu5fMsoDomainName(CONSTANTS.SPACE_65);
			setRlu5fDipLateFee(BigDecimal.ZERO);
			setRlu5fDipFinChgDue(BigDecimal.ZERO);
			setRlu5fDipFinChgPaid(BigDecimal.ZERO);
			setRlu5fDipFinChgPastDue(BigDecimal.ZERO);
			setRlu5fDipBalance(BigDecimal.ZERO);
			setRlu5fDipFinChgBalance(BigDecimal.ZERO);
                     setRlu5fInstallPaymentNum(0);
                     setRlu5fTotInstallPayments(0);
                     setRlu5fDipLoanNumber(0);
         setRlu5fAlpDelayedCapSw(CONSTANTS.SPACE);
         setRlu5fAlpUnitType(CONSTANTS.SPACE_2);
			setRlu5fDipSubTotal(BigDecimal.ZERO);
         setRlu5fVzedgeInd(CONSTANTS.SPACE);
         setRlu5fVzedgeMsgInd(CONSTANTS.SPACE);
     if (rlu5fVzedgePaymtSched.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  RLU_5F_VZEDGE_PAYMT_SCHED_SIZE;index++) {
              Rlu5fVzedgePaymtSched  newElement = new Rlu5fVzedgePaymtSched(this,beginRlu5fVzedgePaymtSched + index * Rlu5fVzedgePaymtSched.getRlu5fVzedgePaymtSchedFieldLength());
              newElement.initialize();
               rlu5fVzedgePaymtSched.add(newElement);
          }
     } else {
        if (rlu5fVzedgePaymtSched.size() < RLU_5F_VZEDGE_PAYMT_SCHED_SIZE) {
          // prefill it first
          for (int index = rlu5fVzedgePaymtSched.size();index <  RLU_5F_VZEDGE_PAYMT_SCHED_SIZE;index++) {
              Rlu5fVzedgePaymtSched  newElement = new Rlu5fVzedgePaymtSched(this,beginRlu5fVzedgePaymtSched + index * Rlu5fVzedgePaymtSched.getRlu5fVzedgePaymtSchedFieldLength());
               rlu5fVzedgePaymtSched.add(newElement);
          }
        }
        
     	for (int index = 0;index <  RLU_5F_VZEDGE_PAYMT_SCHED_SIZE;index++) {
     		Rlu5fVzedgePaymtSched rlu5fVzedgePaymtSchedVar = rlu5fVzedgePaymtSched.get(index);
 			if (rlu5fVzedgePaymtSchedVar == null) {
                rlu5fVzedgePaymtSchedVar = new Rlu5fVzedgePaymtSched(this,beginRlu5fVzedgePaymtSched + index * Rlu5fVzedgePaymtSched.getRlu5fVzedgePaymtSchedFieldLength());
                  rlu5fVzedgePaymtSched.set(index, rlu5fVzedgePaymtSchedVar);
			} 
			rlu5fVzedgePaymtSchedVar.initialize();
		}
     }
         setRlu5fCellcryptRenewalDate(CONSTANTS.SPACE_8);
         setRlu5fCellcryptActionCode(CONSTANTS.SPACE);
			setRlu5fCellcryptUnitCost(BigDecimal.ZERO);
         setRlu5fCellcryptTransactionDt(CONSTANTS.SPACE_8);
         setRlu5fCellcryptProrateInd(CONSTANTS.SPACE);
         setRlu5fSharedInd(CONSTANTS.SPACE);
                     setRlu5fShareSet(0);
			setRlu5fDevicePrice(BigDecimal.ZERO);
     if (rlu5fDeviceTax.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  RLU_5F_DEVICE_TAX_SIZE;index++) {
              Rlu5fDeviceTax  newElement = new Rlu5fDeviceTax(this,beginRlu5fDeviceTax + index * Rlu5fDeviceTax.getRlu5fDeviceTaxFieldLength());
              newElement.initialize();
               rlu5fDeviceTax.add(newElement);
          }
     } else {
        if (rlu5fDeviceTax.size() < RLU_5F_DEVICE_TAX_SIZE) {
          // prefill it first
          for (int index = rlu5fDeviceTax.size();index <  RLU_5F_DEVICE_TAX_SIZE;index++) {
              Rlu5fDeviceTax  newElement = new Rlu5fDeviceTax(this,beginRlu5fDeviceTax + index * Rlu5fDeviceTax.getRlu5fDeviceTaxFieldLength());
               rlu5fDeviceTax.add(newElement);
          }
        }
        
     	for (int index = 0;index <  RLU_5F_DEVICE_TAX_SIZE;index++) {
     		Rlu5fDeviceTax rlu5fDeviceTaxVar = rlu5fDeviceTax.get(index);
 			if (rlu5fDeviceTaxVar == null) {
                rlu5fDeviceTaxVar = new Rlu5fDeviceTax(this,beginRlu5fDeviceTax + index * Rlu5fDeviceTax.getRlu5fDeviceTaxFieldLength());
                  rlu5fDeviceTax.set(index, rlu5fDeviceTaxVar);
			} 
			rlu5fDeviceTaxVar.initialize();
		}
     }
         setRlu5fCellcryptDiscAmt(CONSTANTS.SPACE_13);
			setRlu5fPlanAmountAfterDisc(BigDecimal.ZERO);
         setRlu5fOnetimeNewInd(CONSTANTS.SPACE);
			setRlu5fOverageBillableQty(BigDecimal.ZERO);
			setRlu5fOverageRate(BigDecimal.ZERO);
			setRlu5fInstallLoanAmount(BigDecimal.ZERO);
         setRlu5fVzedgePaymentInd(CONSTANTS.SPACE);
			setRlu5fAccntUsageAllow(BigDecimal.ZERO);
         setRlu5fTaxSurchrgRecInd(CONSTANTS.SPACE);
          rlu5fLateFeeDate.initialize();
     
         setRlu5fOnetimeEventType(CONSTANTS.SPACE_4);
         setRlu5fTaxSurchargeInd(CONSTANTS.SPACE);
         setRlu5fAcctPlanDetailDesc(CONSTANTS.SPACE_254);
          rlu5fStartDate.initialize();
     
          rlu5fEndDate.initialize();
     
         setRlu5fSplanCatCd(CONSTANTS.SPACE_2);
         setRlu5fServiceId(CONSTANTS.SPACE_15);
          rlu5fBuyoutPaymentDate.initialize();
     
			setRlu5fBuyoutPaymentAmt(BigDecimal.ZERO);
                     setRlu5fSciProdId(0);
         setRlu5fSubscriptionInd(CONSTANTS.SPACE);
         setRlu5fStateCd(CONSTANTS.SPACE_2);
         setRlu5fFootnoteCd(CONSTANTS.SPACE);
   }

		public static int getRlu5fChrgCrdDtlFieldLength() {
			return RLU_5F_CHRG_CRD_DTL_LENGTH;
		}

}
  
