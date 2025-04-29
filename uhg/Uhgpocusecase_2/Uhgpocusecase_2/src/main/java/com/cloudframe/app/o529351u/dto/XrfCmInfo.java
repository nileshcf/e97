package com.cloudframe.app.o529351u.dto;

/**
*  The class XrfCmInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class XrfCmInfo extends XrfCmInfoSerialized { 
   

						@Getter @Setter private char[] xrfPlcyCm = Field.fillLowValue(6);

								@Getter @Setter private short xrfDivCm;

								@Getter @Setter private short xrfClsCm;

						@Getter @Setter private char[] xrfCancCdCm = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfTefraApply = Field.fillLowValue(1);

								@Getter @Setter private int xrfEffDtCm;

								@Getter @Setter private int xrfCancDtCm;

						@Getter @Setter private char[] xrfLglEntyCd = Field.fillLowValue(5);

						@Getter @Setter private char[] xrfAcisEnrpInd = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal xrfEnrpDefPct = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal xrfMnrpDefPct = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal xrfMnrpPtPct = BigDecimal.ZERO;

						@Getter @Setter private char[] xrfSurprsMedBilCd = Field.fillLowValue(1);


						@Getter @Setter private char[] xrfEbdsSetId2 = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfAcnInd = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfUhpInd = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfAiInd = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfEnrpErFacInd = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfErWrapInd = Field.fillLowValue(1);

								@Getter @Setter private short xrfLabPct;

								@Getter @Setter private short xrfDmePct;

						@Getter @Setter private char[] xrfBusSegPltfm = Field.fillLowValue(3);


						@Getter @Setter private char[] xrfNmaddrCdCm = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfMcSel = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfPlcyAutpayInd = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfRptCdCm = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfMailCdCm = Field.fillLowValue(4);
				@Getter @Setter private XrfRpData xrfRpData = new XrfRpData();

								@Getter @Setter private int xrfFranchCd;

								@Getter @Setter private short xrfEbdsCovBase;

								@Getter @Setter private short xrfEbdsCovMme;

								@Getter @Setter private short xrfEbdsCovMcr;

						@Getter @Setter private char[] xrfEbdsSetId = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfAaCm = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfRxCm = Field.fillLowValue(6);

						@Getter @Setter private char[] xrfModCm = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfPcsCm = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfCchCm = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfCapInd = Field.fillLowValue(1);

								@Getter @Setter private short xrfApportionmentPct;

								@Getter @Setter private short xrfPayloc1;

								@Getter @Setter private short xrfPayloc2;

						@Getter @Setter private char[] xrfMnnrpInd = Field.fillLowValue(1);

								@Getter @Setter private short xrfMnnrpPct;

						@Getter @Setter private char[] xrfIplan = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfObligorInd = Field.fillLowValue(2);

						@Getter @Setter private char[] xrfSharedArg = Field.fillLowValue(2);

						@Getter @Setter private char[] xrfMeInd = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfPteInd = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfProductInd = Field.fillLowValue(3);

						@Getter @Setter private char[] xrfFreelookInd = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfEbrInd = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfLimSvcInd = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfOptOutUbhTier = Field.fillLowValue(1);

								@Getter @Setter private int xrfHraApIndLmt;

								@Getter @Setter private int xrfHraApFamLmt;

								@Getter @Setter private int xrfDefaultPoc;

								@Getter @Setter private int xrfPcntRateJqCodesFound;

						@Getter @Setter private char[] xrfAppealLangInd = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfProrateIntrvl = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfNbSuppressInd = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfProrateEvent = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfCoreMedPrrAuthCd = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfEnrpErInd = Field.fillLowValue(1);

						@Getter @Setter private char[] xrfEnrpNonErInd = Field.fillLowValue(1);

								@Getter @Setter private int xrfEnrpNonErPct;

						@Getter @Setter private char[] xrfEhbInd = Field.fillLowValue(1);

						@Getter @Setter private char[] filler01 = Field.fillLowValue(1);
	
	/**
	* Constructor for XrfCmInfo
	**/
    public XrfCmInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for XrfCmInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XrfCmInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getXrfRpData().setParent(this,getStartOffset() + 172);
    } 



}
  
