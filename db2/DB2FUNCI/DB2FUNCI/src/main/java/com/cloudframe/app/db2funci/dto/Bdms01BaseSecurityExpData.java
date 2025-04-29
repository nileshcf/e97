package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01BaseSecurityExpData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01BaseSecurityExpData extends Bdms01BaseSecurityExpDataSerialized { 
   

						@Getter @Setter private char[] bdms01PutEndDt = Field.fillLowValue(10);

								@Getter @Setter private int bdms01PutNtcMinDyQty;

								@Getter @Setter private int bdms01PutNtcMaxDyQty;

						@Getter @Setter private char[] bdms01CltrlTypeCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01PutFreqCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01MtrtyTypeCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01LnkdCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01ActnRtInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01FrstVrblRstDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01RstFreqCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01Call2TmngCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01ExchgPrimeCd = Field.fillLowValue(3);

						@Getter @Setter private char[] bdms01MrktTierCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01MrktIndCd = Field.fillLowValue(4);

						@Getter @Setter private char[] bdms01NewTraceInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01QuickCd = Field.fillLowValue(6);

						@Getter @Setter private char[] bdms01LseMrktCd = Field.fillLowValue(4);

						@Getter @Setter private char[] bdms01IsinChngInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01StkIssueSttsCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01IssrTypeCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01TraceSymblTxt = Field.fillLowValue(14);

						@Getter @Setter private char[] bdms01RegsInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01PpnCd = Field.fillLowValue(3);

						@Getter @Setter private char[] bdms01PpnInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01DtcUnrtdMoodyCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01DtcUnrtdSpCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01TirsSecTypeCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01SifmaSmgInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01CalledAncmtCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01PrtlRdmptSchdCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01FdrlTaxSttsCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01CntngTaxCd = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal bdms01CntngYldRt = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01SecTypeCd = Field.fillLowValue(3);

						@Getter @Setter private char[] bdms01CltrlIssCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01RangeInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01B8CntngPymntCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01CrntCpnTypeCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01Extelc1SecTypCd = Field.fillLowValue(2);

	
	/**
	* Constructor for Bdms01BaseSecurityExpData
	**/
    public Bdms01BaseSecurityExpData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01BaseSecurityExpData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BaseSecurityExpData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01BaseSecurityExpData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBdms01PutEndDt(CONSTANTS.SPACE_10);
                     setBdms01PutNtcMinDyQty(0);
                     setBdms01PutNtcMaxDyQty(0);
         setBdms01CltrlTypeCd(CONSTANTS.SPACE_2);
         setBdms01PutFreqCd(CONSTANTS.SPACE_2);
         setBdms01MtrtyTypeCd(CONSTANTS.SPACE_2);
         setBdms01LnkdCd(CONSTANTS.SPACE);
         setBdms01ActnRtInd(CONSTANTS.SPACE);
         setBdms01FrstVrblRstDt(CONSTANTS.SPACE_10);
         setBdms01RstFreqCd(CONSTANTS.SPACE_2);
         setBdms01Call2TmngCd(CONSTANTS.SPACE_2);
         setBdms01ExchgPrimeCd(CONSTANTS.SPACE_3);
         setBdms01MrktTierCd(CONSTANTS.SPACE);
         setBdms01MrktIndCd(CONSTANTS.SPACE_4);
         setBdms01NewTraceInd(CONSTANTS.SPACE);
         setBdms01QuickCd(CONSTANTS.SPACE_6);
         setBdms01LseMrktCd(CONSTANTS.SPACE_4);
         setBdms01IsinChngInd(CONSTANTS.SPACE);
         setBdms01StkIssueSttsCd(CONSTANTS.SPACE);
         setBdms01IssrTypeCd(CONSTANTS.SPACE);
         setBdms01TraceSymblTxt(CONSTANTS.SPACE_14);
         setBdms01RegsInd(CONSTANTS.SPACE);
         setBdms01PpnCd(CONSTANTS.SPACE_3);
         setBdms01PpnInd(CONSTANTS.SPACE);
         setBdms01DtcUnrtdMoodyCd(CONSTANTS.SPACE);
         setBdms01DtcUnrtdSpCd(CONSTANTS.SPACE);
         setBdms01TirsSecTypeCd(CONSTANTS.SPACE);
         setBdms01SifmaSmgInd(CONSTANTS.SPACE);
         setBdms01CalledAncmtCd(CONSTANTS.SPACE);
         setBdms01PrtlRdmptSchdCd(CONSTANTS.SPACE);
         setBdms01FdrlTaxSttsCd(CONSTANTS.SPACE);
         setBdms01CntngTaxCd(CONSTANTS.SPACE);
			setBdms01CntngYldRt(BigDecimal.ZERO);
         setBdms01SecTypeCd(CONSTANTS.SPACE_3);
         setBdms01CltrlIssCd(CONSTANTS.SPACE_2);
         setBdms01RangeInd(CONSTANTS.SPACE);
         setBdms01B8CntngPymntCd(CONSTANTS.SPACE);
         setBdms01CrntCpnTypeCd(CONSTANTS.SPACE);
         setBdms01Extelc1SecTypCd(CONSTANTS.SPACE_2);
   }


}
  
