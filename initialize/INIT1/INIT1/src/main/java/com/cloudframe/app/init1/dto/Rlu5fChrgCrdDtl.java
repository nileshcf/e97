package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fChrgCrdDtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;


@Data
public class Rlu5fChrgCrdDtl extends Rlu5fChrgCrdDtlSerialized { 
   

						@Getter @Setter private char[] rlu5fRecId = Field.fillLowValue(2);

						@Getter @Setter private char[] rlu5fPgmId = Field.fillLowValue(10);

				@Getter @Setter private Rlu5fSuppressInd rlu5fSuppressInd = new Rlu5fSuppressInd();

						@Getter @Setter private char[] rlu5fAccDesc = Field.fillLowValue(50);

								@Getter @Setter private BigDecimal rlu5fAccAmount = BigDecimal.ZERO;

						@Getter @Setter private char[] rlu5fAccTypeInd = Field.fillLowValue(2);
				@Getter @Setter private Rlu5fDateFrom rlu5fDateFrom = new Rlu5fDateFrom();
				@Getter @Setter private Rlu5fDateTo rlu5fDateTo = new Rlu5fDateTo();

						@Getter @Setter private char[] rlu5fAccessUsageDesc = Field.fillLowValue(80);

						@Getter @Setter private char[] rlu5fPlanChngCode = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal rlu5fPlanChgPerMonth = BigDecimal.ZERO;

								@Getter @Setter private int rlu5fPlanDays;

						@Getter @Setter private char[] rlu5fPlanChgInadvInd = Field.fillLowValue(1);

						@Getter @Setter private char[] rlu5fDiscountInd = Field.fillLowValue(1);

						@Getter @Setter private char[] rlu5fPlanType = Field.fillLowValue(2);

						@Getter @Setter private char[] rlu5fUnitType = Field.fillLowValue(2);

						@Getter @Setter private char[] rlu5fPlanId = Field.fillLowValue(6);

						@Getter @Setter private char[] rlu5fCurDelayInd = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal rlu5fDelayShareUsed = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal rlu5fDelayShareOvrage = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal rlu5fDiscAmount1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal rlu5fDiscAmount2 = BigDecimal.ZERO;

						@Getter @Setter private char[] rlu5fBoboVenderName = Field.fillLowValue(10);

						@Getter @Setter private char[] rlu5fBoboVenderNumber = Field.fillLowValue(10);

						@Getter @Setter private char[] rlu5fBoboServDesc = Field.fillLowValue(40);

								@Getter @Setter private BigDecimal rlu5fBoboTaxAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal rlu5fBoboSurAmt = BigDecimal.ZERO;

								@Getter @Setter private long rlu5fMsoNumOfPurchases;

						@Getter @Setter private char[] rlu5fMsoPurchaseDesc = Field.fillLowValue(15);


						@Getter @Setter private char[] rlu5fMsoDomainName = Field.fillLowValue(65);

								@Getter @Setter private BigDecimal rlu5fDipLateFee = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal rlu5fDipFinChgDue = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal rlu5fDipFinChgPaid = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal rlu5fDipFinChgPastDue = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal rlu5fDipBalance = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal rlu5fDipFinChgBalance = BigDecimal.ZERO;

								@Getter @Setter private int rlu5fInstallPaymentNum;

								@Getter @Setter private int rlu5fTotInstallPayments;

								@Getter @Setter private long rlu5fDipLoanNumber;

						@Getter @Setter private char[] rlu5fAlpDelayedCapSw = Field.fillLowValue(1);

						@Getter @Setter private char[] rlu5fAlpUnitType = Field.fillLowValue(2);

								@Getter @Setter private BigDecimal rlu5fDipSubTotal = BigDecimal.ZERO;

						@Getter @Setter private char[] rlu5fVzedgeInd = Field.fillLowValue(1);

						@Getter @Setter private char[] rlu5fVzedgeMsgInd = Field.fillLowValue(1);
			@Getter @Setter private List<Rlu5fVzedgePaymtSched> rlu5fVzedgePaymtSched = new ArrayList<>();
    	

						@Getter @Setter private char[] rlu5fCellcryptRenewalDate = Field.fillLowValue(8);
				@Getter @Setter private Rlu5fCellcryptRenewalRed rlu5fCellcryptRenewalRed = new Rlu5fCellcryptRenewalRed();

						@Getter @Setter private char[] rlu5fCellcryptActionCode = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal rlu5fCellcryptUnitCost = BigDecimal.ZERO;

						@Getter @Setter private char[] rlu5fCellcryptTransactionDt = Field.fillLowValue(8);
				@Getter @Setter private Rlu5fCellcryptTransactionRd rlu5fCellcryptTransactionRd = new Rlu5fCellcryptTransactionRd();

						@Getter @Setter private char[] rlu5fCellcryptProrateInd = Field.fillLowValue(1);

						@Getter @Setter private char[] rlu5fSharedInd = Field.fillLowValue(1);

								@Getter @Setter private int rlu5fShareSet;

								@Getter @Setter private BigDecimal rlu5fDevicePrice = BigDecimal.ZERO;
			@Getter @Setter private List<Rlu5fDeviceTax> rlu5fDeviceTax = new ArrayList<>();
    	

						@Getter @Setter private char[] rlu5fCellcryptDiscAmt = Field.fillLowValue(13);

								@Getter @Setter private BigDecimal rlu5fPlanAmountAfterDisc = BigDecimal.ZERO;

						@Getter @Setter private char[] rlu5fOnetimeNewInd = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal rlu5fOverageBillableQty = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal rlu5fOverageRate = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal rlu5fInstallLoanAmount = BigDecimal.ZERO;

						@Getter @Setter private char[] rlu5fVzedgePaymentInd = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal rlu5fAccntUsageAllow = BigDecimal.ZERO;

						@Getter @Setter private char[] rlu5fTaxSurchrgRecInd = Field.fillLowValue(1);
				@Getter @Setter private Rlu5fLateFeeDate rlu5fLateFeeDate = new Rlu5fLateFeeDate();

						@Getter @Setter private char[] rlu5fOnetimeEventType = Field.fillLowValue(4);

						@Getter @Setter private char[] rlu5fTaxSurchargeInd = Field.fillLowValue(1);

						@Getter @Setter private char[] rlu5fAcctPlanDetailDesc = Field.fillLowValue(254);
				@Getter @Setter private Rlu5fStartDate rlu5fStartDate = new Rlu5fStartDate();
				@Getter @Setter private Rlu5fEndDate rlu5fEndDate = new Rlu5fEndDate();

						@Getter @Setter private char[] rlu5fSplanCatCd = Field.fillLowValue(2);

						@Getter @Setter private char[] rlu5fServiceId = Field.fillLowValue(15);
				@Getter @Setter private Rlu5fBuyoutPaymentDate rlu5fBuyoutPaymentDate = new Rlu5fBuyoutPaymentDate();

								@Getter @Setter private BigDecimal rlu5fBuyoutPaymentAmt = BigDecimal.ZERO;

								@Getter @Setter private int rlu5fSciProdId;

						@Getter @Setter private char[] rlu5fSubscriptionInd = Field.fillLowValue(1);

						@Getter @Setter private char[] rlu5fStateCd = Field.fillLowValue(2);

						@Getter @Setter private char[] rlu5fFootnoteCd = Field.fillLowValue(1);

	
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
					getRlu5fSuppressInd().setParent(this,getStartOffset() + 28);
					getRlu5fDateFrom().setParent(this,getStartOffset() + 89);
					getRlu5fDateTo().setParent(this,getStartOffset() + 97);
				for (int arrayIndex = 0; arrayIndex < RLU_5F_VZEDGE_PAYMT_SCHED_SIZE;arrayIndex++) {
						getRlu5fVzedgePaymtSched().add(new Rlu5fVzedgePaymtSched(this, beginRlu5fVzedgePaymtSched + 
						arrayIndex * Rlu5fVzedgePaymtSched.getRlu5fVzedgePaymtSchedFieldLength()));
				}
					getRlu5fCellcryptRenewalRed().setParent(this,getStartOffset() + 650);
					getRlu5fCellcryptTransactionRd().setParent(this,getStartOffset() + 665);
				for (int arrayIndex = 0; arrayIndex < RLU_5F_DEVICE_TAX_SIZE;arrayIndex++) {
						getRlu5fDeviceTax().add(new Rlu5fDeviceTax(this, beginRlu5fDeviceTax + 
						arrayIndex * Rlu5fDeviceTax.getRlu5fDeviceTaxFieldLength()));
				}
					getRlu5fLateFeeDate().setParent(this,getStartOffset() + 1011);
					getRlu5fStartDate().setParent(this,getStartOffset() + 1278);
					getRlu5fEndDate().setParent(this,getStartOffset() + 1286);
					getRlu5fBuyoutPaymentDate().setParent(this,getStartOffset() + 1311);
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
          getRlu5fSuppressInd().initialize();
     
         setRlu5fAccDesc(CONSTANTS.SPACE_50);
			setRlu5fAccAmount(BigDecimal.ZERO);
         setRlu5fAccTypeInd(CONSTANTS.SPACE_2);
          getRlu5fDateFrom().initialize();
     
          getRlu5fDateTo().initialize();
     
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
              getRlu5fVzedgePaymtSched().add(newElement);
          }
     } else {
        if (rlu5fVzedgePaymtSched.size() < RLU_5F_VZEDGE_PAYMT_SCHED_SIZE) {
          // prefill it first
          for (int index = rlu5fVzedgePaymtSched.size();index <  RLU_5F_VZEDGE_PAYMT_SCHED_SIZE;index++) {
              Rlu5fVzedgePaymtSched  newElement = new Rlu5fVzedgePaymtSched(this,beginRlu5fVzedgePaymtSched + index * Rlu5fVzedgePaymtSched.getRlu5fVzedgePaymtSchedFieldLength());
              getRlu5fVzedgePaymtSched().add(newElement);
          }
        }
        
     	for (int index = 0;index <  RLU_5F_VZEDGE_PAYMT_SCHED_SIZE;index++) {
     		Rlu5fVzedgePaymtSched rlu5fVzedgePaymtSchedVar = rlu5fVzedgePaymtSched.get(index);
 			if (rlu5fVzedgePaymtSchedVar == null) {
                rlu5fVzedgePaymtSchedVar = new Rlu5fVzedgePaymtSched(this,beginRlu5fVzedgePaymtSched + index * Rlu5fVzedgePaymtSched.getRlu5fVzedgePaymtSchedFieldLength());
                  getRlu5fVzedgePaymtSched().set(index, rlu5fVzedgePaymtSchedVar);
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
              getRlu5fDeviceTax().add(newElement);
          }
     } else {
        if (rlu5fDeviceTax.size() < RLU_5F_DEVICE_TAX_SIZE) {
          // prefill it first
          for (int index = rlu5fDeviceTax.size();index <  RLU_5F_DEVICE_TAX_SIZE;index++) {
              Rlu5fDeviceTax  newElement = new Rlu5fDeviceTax(this,beginRlu5fDeviceTax + index * Rlu5fDeviceTax.getRlu5fDeviceTaxFieldLength());
              getRlu5fDeviceTax().add(newElement);
          }
        }
        
     	for (int index = 0;index <  RLU_5F_DEVICE_TAX_SIZE;index++) {
     		Rlu5fDeviceTax rlu5fDeviceTaxVar = rlu5fDeviceTax.get(index);
 			if (rlu5fDeviceTaxVar == null) {
                rlu5fDeviceTaxVar = new Rlu5fDeviceTax(this,beginRlu5fDeviceTax + index * Rlu5fDeviceTax.getRlu5fDeviceTaxFieldLength());
                  getRlu5fDeviceTax().set(index, rlu5fDeviceTaxVar);
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
          getRlu5fLateFeeDate().initialize();
     
         setRlu5fOnetimeEventType(CONSTANTS.SPACE_4);
         setRlu5fTaxSurchargeInd(CONSTANTS.SPACE);
         setRlu5fAcctPlanDetailDesc(CONSTANTS.SPACE_254);
          getRlu5fStartDate().initialize();
     
          getRlu5fEndDate().initialize();
     
         setRlu5fSplanCatCd(CONSTANTS.SPACE_2);
         setRlu5fServiceId(CONSTANTS.SPACE_15);
          getRlu5fBuyoutPaymentDate().initialize();
     
			setRlu5fBuyoutPaymentAmt(BigDecimal.ZERO);
                     setRlu5fSciProdId(0);
         setRlu5fSubscriptionInd(CONSTANTS.SPACE);
         setRlu5fStateCd(CONSTANTS.SPACE_2);
         setRlu5fFootnoteCd(CONSTANTS.SPACE);
   }


}
  
