package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Dt1ClmClaimItem is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.utility.CFUtil;


@Data
public class Dt1ClmClaimItem extends Dt1ClmClaimItemSerialized { 
   

								@Getter @Setter private int dt1ClmFilmOffice;

								@Getter @Setter private long dt1ClmFln;

						@Getter @Setter private char[] dt1ClmIcn = Field.fillLowValue(10);

								@Getter @Setter private int dt1ClmSuffixCd;

						@Getter @Setter private char[] dt1ClmProcDt = Field.fillLowValue(10);

						@Getter @Setter private char[] dt1ClmProcTm = Field.fillLowValue(8);

						@Getter @Setter private char[] dt1ClmFlnFormatDt = Field.fillLowValue(10);

								@Getter @Setter private int dt1ClmHeaderCt;

								@Getter @Setter private long dt1ClmDraftNo;

								@Getter @Setter private long dt1ClmFirstServiceDate;

								@Getter @Setter private long dt1ClmLastServiceDate;

						@Getter @Setter private char[] dt1ClmProviderName = Field.fillLowValue(40);
				@Getter @Setter private Dt1ClmProviderId dt1ClmProviderId = new Dt1ClmProviderId();

								@Getter @Setter private char[] dt1ClmChargeAmount = Field.fillLowValue(10);

								@Getter @Setter private char[] dt1ClmPaidAmount = Field.fillLowValue(10);

								@Getter @Setter private char[] dt1ClmDeductibleAmount = Field.fillLowValue(10);
				@Getter @Setter private Dt1ClmClaimStatus dt1ClmClaimStatus = new Dt1ClmClaimStatus();

						@Getter @Setter private char[] dt1ClmClmLevelRc = Field.fillLowValue(2);

								@Getter @Setter private int dt1ClmAdjNbr;

						@Getter @Setter private char[] dt1ClmAdjInd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1ClmPpoInd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1ClmClmPhiInd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1ClmT1ProcessInd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1ClmDlgteInd = Field.fillLowValue(2);

						@Getter @Setter private char[] dt1ClmAuthNbr = Field.fillLowValue(50);

						@Getter @Setter private char[] dt1ClmAuthSrcId = Field.fillLowValue(3);

						@Getter @Setter private char[] dt1ClmAuthProcCd = Field.fillLowValue(5);

						@Getter @Setter private char[] dt1ClmAuthClmLevelInd = Field.fillLowValue(1);

								@Getter @Setter private int dt1ClmAuthUniqueCnt;

						@Getter @Setter private char[] dt1ClmPrimaryDiagnosis = Field.fillLowValue(7);

						@Getter @Setter private char[] dt1ClmParsWaivInd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1ClmParInd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1ClmNonParInd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1ClmProviderTier = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1ClmTpsmCd = Field.fillLowValue(3);

						@Getter @Setter private char[] dt1ClmMskInd = Field.fillLowValue(1);

								@Getter @Setter private char[] dt1ClmPtntRespAmt = Field.fillLowValue(10);

						@Getter @Setter private char[] dt1ClmProvSpclCd = Field.fillLowValue(3);

						@Getter @Setter private char[] dt1ClmNdbContrId = Field.fillLowValue(9);

						@Getter @Setter private char[] dt1ClmDrgNbr = Field.fillLowValue(5);

						@Getter @Setter private char[] dt1ClmProvMedcdReclmInd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1ClmHospProfInd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1ClmSmbAppCd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1ClmSmbStCd = Field.fillLowValue(2);

						@Getter @Setter private char[] dt1ClmItemFillerArea = Field.fillLowValue(117);
	
	/**
	* Constructor for Dt1ClmClaimItem
	**/
    public Dt1ClmClaimItem() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dt1ClmClaimItem. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1ClmClaimItem(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getDt1ClmProviderId().setParent(this,getStartOffset() + 123);
					getDt1ClmClaimStatus().setParent(this,getStartOffset() + 168);
    } 

	/**
	 * 	initializes Dt1ClmClaimItem
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setDt1ClmFilmOffice(0);
                     setDt1ClmFln(0);
         setDt1ClmIcn(CONSTANTS.SPACE_10);
                     setDt1ClmSuffixCd(0);
         setDt1ClmProcDt(CONSTANTS.SPACE_10);
         setDt1ClmProcTm(CONSTANTS.SPACE_8);
         setDt1ClmFlnFormatDt(CONSTANTS.SPACE_10);
                     setDt1ClmHeaderCt(0);
                     setDt1ClmDraftNo(0);
                     setDt1ClmFirstServiceDate(0);
                     setDt1ClmLastServiceDate(0);
         setDt1ClmProviderName(CONSTANTS.SPACE_40);
          getDt1ClmProviderId().initialize();
     
                    setDt1ClmChargeAmount(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_484884966,CONSTANTS.ZERO_10));
                    setDt1ClmPaidAmount(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_484884966,CONSTANTS.ZERO_10));
                    setDt1ClmDeductibleAmount(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_484884966,CONSTANTS.ZERO_10));
          getDt1ClmClaimStatus().initialize();
     
         setDt1ClmClmLevelRc(CONSTANTS.SPACE_2);
                     setDt1ClmAdjNbr(0);
         setDt1ClmAdjInd(CONSTANTS.SPACE);
         setDt1ClmPpoInd(CONSTANTS.SPACE);
         setDt1ClmClmPhiInd(CONSTANTS.SPACE);
         setDt1ClmT1ProcessInd(CONSTANTS.SPACE);
         setDt1ClmDlgteInd(CONSTANTS.SPACE_2);
         setDt1ClmAuthNbr(CONSTANTS.SPACE_50);
         setDt1ClmAuthSrcId(CONSTANTS.SPACE_3);
         setDt1ClmAuthProcCd(CONSTANTS.SPACE_5);
         setDt1ClmAuthClmLevelInd(CONSTANTS.SPACE);
                     setDt1ClmAuthUniqueCnt(0);
         setDt1ClmPrimaryDiagnosis(CONSTANTS.SPACE_7);
         setDt1ClmParsWaivInd(CONSTANTS.SPACE);
         setDt1ClmParInd(CONSTANTS.SPACE);
         setDt1ClmNonParInd(CONSTANTS.SPACE);
         setDt1ClmProviderTier(CONSTANTS.SPACE);
         setDt1ClmTpsmCd(CONSTANTS.SPACE_3);
         setDt1ClmMskInd(CONSTANTS.SPACE);
                    setDt1ClmPtntRespAmt(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_484884966,CONSTANTS.ZERO_10));
         setDt1ClmProvSpclCd(CONSTANTS.SPACE_3);
         setDt1ClmNdbContrId(CONSTANTS.SPACE_9);
         setDt1ClmDrgNbr(CONSTANTS.SPACE_5);
         setDt1ClmProvMedcdReclmInd(CONSTANTS.SPACE);
         setDt1ClmHospProfInd(CONSTANTS.SPACE);
         setDt1ClmSmbAppCd(CONSTANTS.SPACE);
         setDt1ClmSmbStCd(CONSTANTS.SPACE_2);
         setDt1ClmItemFillerArea(CONSTANTS.SPACE_117);
   }


}
  
