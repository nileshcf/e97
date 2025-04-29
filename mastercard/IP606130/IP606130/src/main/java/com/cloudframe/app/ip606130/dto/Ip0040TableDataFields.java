package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040TableDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip0040TableDataFields extends Ip0040TableDataFieldsSerialized { 
   

						@Getter @Setter private char[] ip0040AccRangeH = Field.fillLowValue(19);

						@Getter @Setter private char[] ip0040Ab = Field.fillLowValue(3);

								@Getter @Setter private int ip0040PriorityCode;

								@Getter @Setter private long ip0040PrfxIca;

						@Getter @Setter private char[] ip0040ProductType = Field.fillLowValue(1);

								@Getter @Setter private long ip0040Endpoint;

						@Getter @Setter private char[] ip0040Country = Field.fillLowValue(3);

								@Getter @Setter private int ip0040CountryNum;
				@Getter @Setter private Ip0040RegionSubreg ip0040RegionSubreg = new Ip0040RegionSubreg();

						@Getter @Setter private char[] ip0040ProductClass = Field.fillLowValue(3);

						@Getter @Setter private char[] ip0040TranRoutingInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040PrsProdReassgnSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040ProdReassignmentSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040OptInFlag = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040LicensedProdId = Field.fillLowValue(3);

						@Getter @Setter private char[] ip0040VirtFundPanInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040AcctCatgPartSw = Field.fillLowValue(1);

								@Getter @Setter private long ip0040AcctCatgActvnDate;
				@Getter @Setter private Ip0040CardHldrBlngCur ip0040CardHldrBlngCur = new Ip0040CardHldrBlngCur();

						@Getter @Setter private char[] ip0040ChipConversionSw = Field.fillLowValue(1);
				@Getter @Setter private Ip0040FloorExpiryDate ip0040FloorExpiryDate = new Ip0040FloorExpiryDate();

						@Getter @Setter private char[] ip0040CoBrandSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040SpendControlRcnSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040MerchCleanServPart = Field.fillLowValue(3);

								@Getter @Setter private long ip0040MerchCleanActvDate;

						@Getter @Setter private char[] ip0040PaypassEnabledInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040RateTypeIndicator = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040RoutePsnIndicator = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040CbwpIndicator = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040FlexParticipInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040RepwrRldInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040MoneySendInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040RegulatedRateIndSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040CashAccessSw = Field.fillLowValue(1);

								@Getter @Setter private int ip0040PersonPresentInd;

						@Getter @Setter private char[] ip0040CrossBdrException = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040IssTargetMarketInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040PostDateServSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040MealVoucherInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040NonRldblPrpdSw = Field.fillLowValue(2);

						@Getter @Setter private char[] ip0040FasterFundsInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040AnonPrepaidInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040DccStatusInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040MemberFiller = Field.fillLowValue(14);
	
	/**
	* Constructor for Ip0040TableDataFields
	**/
    public Ip0040TableDataFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0040TableDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040TableDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp0040RegionSubreg().setParent(this,getStartOffset() + 49);
					getIp0040CardHldrBlngCur().setParent(this,getStartOffset() + 68);
					getIp0040FloorExpiryDate().setParent(this,getStartOffset() + 101);
    } 

	/**
	 * 	initializes Ip0040TableDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0040AccRangeH(CONSTANTS.SPACE_19);
         setIp0040Ab(CONSTANTS.SPACE_3);
                     setIp0040PriorityCode(0);
                     setIp0040PrfxIca(0);
         setIp0040ProductType(CONSTANTS.SPACE);
                     setIp0040Endpoint(0);
         setIp0040Country(CONSTANTS.SPACE_3);
                     setIp0040CountryNum(0);
          getIp0040RegionSubreg().initialize();
     
         setIp0040ProductClass(CONSTANTS.SPACE_3);
         setIp0040TranRoutingInd(CONSTANTS.SPACE);
         setIp0040PrsProdReassgnSw(CONSTANTS.SPACE);
         setIp0040ProdReassignmentSw(CONSTANTS.SPACE);
         setIp0040OptInFlag(CONSTANTS.SPACE);
         setIp0040LicensedProdId(CONSTANTS.SPACE_3);
         setIp0040VirtFundPanInd(CONSTANTS.SPACE);
         setIp0040AcctCatgPartSw(CONSTANTS.SPACE);
                     setIp0040AcctCatgActvnDate(0);
          getIp0040CardHldrBlngCur().initialize();
     
         setIp0040ChipConversionSw(CONSTANTS.SPACE);
          getIp0040FloorExpiryDate().initialize();
     
         setIp0040CoBrandSw(CONSTANTS.SPACE);
         setIp0040SpendControlRcnSw(CONSTANTS.SPACE);
         setIp0040MerchCleanServPart(CONSTANTS.SPACE_3);
                     setIp0040MerchCleanActvDate(0);
         setIp0040PaypassEnabledInd(CONSTANTS.SPACE);
         setIp0040RateTypeIndicator(CONSTANTS.SPACE);
         setIp0040RoutePsnIndicator(CONSTANTS.SPACE);
         setIp0040CbwpIndicator(CONSTANTS.SPACE);
         setIp0040FlexParticipInd(CONSTANTS.SPACE);
         setIp0040RepwrRldInd(CONSTANTS.SPACE);
         setIp0040MoneySendInd(CONSTANTS.SPACE);
         setIp0040RegulatedRateIndSw(CONSTANTS.SPACE);
         setIp0040CashAccessSw(CONSTANTS.SPACE);
                     setIp0040PersonPresentInd(0);
         setIp0040CrossBdrException(CONSTANTS.SPACE);
         setIp0040IssTargetMarketInd(CONSTANTS.SPACE);
         setIp0040PostDateServSw(CONSTANTS.SPACE);
         setIp0040MealVoucherInd(CONSTANTS.SPACE);
         setIp0040NonRldblPrpdSw(CONSTANTS.SPACE_2);
         setIp0040FasterFundsInd(CONSTANTS.SPACE);
         setIp0040AnonPrepaidInd(CONSTANTS.SPACE);
         setIp0040DccStatusInd(CONSTANTS.SPACE);
         setIp0040MemberFiller(CONSTANTS.SPACE_14);
   }


}
  
