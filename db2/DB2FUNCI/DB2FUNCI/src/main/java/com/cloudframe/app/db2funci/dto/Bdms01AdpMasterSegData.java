package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01AdpMasterSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01AdpMasterSegData extends Bdms01AdpMasterSegDataSerialized { 
   

								@Getter @Setter private int bdms01AdpMasterSegSqlcd;

						@Getter @Setter private char[] msdCountryCode = Field.fillLowValue(2);

						@Getter @Setter private char[] msdCountryOfOrigin = Field.fillLowValue(2);
				@Getter @Setter private MsdAddedCcyymmdd msdAddedCcyymmdd = new MsdAddedCcyymmdd();
				@Getter @Setter private MsdSecurityDesc1 msdSecurityDesc1 = new MsdSecurityDesc1();

								@Getter @Setter private long msdDontUseAddDt;

						@Getter @Setter private char[] msdDontUseInd = Field.fillLowValue(1);

						@Getter @Setter private char[] msdDnuReason = Field.fillLowValue(30);

						@Getter @Setter private char[] msdReferToSec = Field.fillLowValue(7);

						@Getter @Setter private char[] msdSourceCodeNewSetup = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01AddedTmstp = Field.fillLowValue(26);

						@Getter @Setter private char[] bdms01DoNotUseDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01TrmlCd = Field.fillLowValue(8);

						@Getter @Setter private char[] bdms01TranCd = Field.fillLowValue(8);

						@Getter @Setter private char[] bdms01SecurityIdaCd = Field.fillLowValue(4);

						@Getter @Setter private char[] bdms01TypeSecurityCd = Field.fillLowValue(3);

						@Getter @Setter private char[] bdms01CntryIssueCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01CntryOrgnCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01ClientNbr = Field.fillLowValue(4);

								@Getter @Setter private long bdms01McgillCd;

						@Getter @Setter private char[] bdms01CusipCntraNbr = Field.fillLowValue(8);

						@Getter @Setter private char[] msdTradingSymbol = Field.fillLowValue(20);

						@Getter @Setter private char[] msdClassInd = Field.fillLowValue(1);

	
	/**
	* Constructor for Bdms01AdpMasterSegData
	**/
    public Bdms01AdpMasterSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01AdpMasterSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01AdpMasterSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMsdAddedCcyymmdd().setParent(this,getStartOffset() + 8);
					getMsdSecurityDesc1().setParent(this,getStartOffset() + 16);
    } 

	/**
	 * 	initializes Bdms01AdpMasterSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01AdpMasterSegSqlcd(0);
         setMsdCountryCode(CONSTANTS.SPACE_2);
         setMsdCountryOfOrigin(CONSTANTS.SPACE_2);
          getMsdAddedCcyymmdd().initialize();
     
          getMsdSecurityDesc1().initialize();
     
                     setMsdDontUseAddDt(0);
         setMsdDontUseInd(CONSTANTS.SPACE);
         setMsdDnuReason(CONSTANTS.SPACE_30);
         setMsdReferToSec(CONSTANTS.SPACE_7);
         setMsdSourceCodeNewSetup(CONSTANTS.SPACE_2);
         setBdms01AddedTmstp(CONSTANTS.SPACE_26);
         setBdms01DoNotUseDt(CONSTANTS.SPACE_10);
         setBdms01TrmlCd(CONSTANTS.SPACE_8);
         setBdms01TranCd(CONSTANTS.SPACE_8);
         setBdms01SecurityIdaCd(CONSTANTS.SPACE_4);
         setBdms01TypeSecurityCd(CONSTANTS.SPACE_3);
         setBdms01CntryIssueCd(CONSTANTS.SPACE_2);
         setBdms01CntryOrgnCd(CONSTANTS.SPACE_2);
         setBdms01ClientNbr(CONSTANTS.SPACE_4);
                     setBdms01McgillCd(0);
         setBdms01CusipCntraNbr(CONSTANTS.SPACE_8);
         setMsdTradingSymbol(CONSTANTS.SPACE_20);
         setMsdClassInd(CONSTANTS.SPACE);
   }


}
  
