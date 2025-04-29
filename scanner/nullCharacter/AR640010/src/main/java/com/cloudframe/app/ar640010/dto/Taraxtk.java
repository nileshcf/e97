package com.cloudframe.app.ar640010.dto;

/**
*  The class Taraxtk is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Taraxtk extends TaraxtkSerialized {
   

						@Getter @Setter private char[] taraxtkAppNam = Field.fillLowValue(8);

						@Getter @Setter private char[] taraxtkXferPrcssNam = Field.fillLowValue(8);

						@Getter @Setter private char[] taraxtkStatCd = Field.fillLowValue(1);

								@Getter @Setter private int taraxtkDlyIntvlNum;

						@Getter @Setter private char[] taraxtkHighLvlQlfrCd = Field.fillLowValue(4);
				@Getter @Setter private TaraxtkDirNodeNam taraxtkDirNodeNam = new TaraxtkDirNodeNam();

						@Getter @Setter private char[] taraxtkLstRunTs = Field.fillLowValue(26);
				@Getter @Setter private TaraxtkStatsFileNam taraxtkStatsFileNam = new TaraxtkStatsFileNam();

								@Getter @Setter private int taraxtkRunLmtNum;

						@Getter @Setter private char[] taraxtkLclRawStatsNam = Field.fillLowValue(44);

						@Getter @Setter private char[] taraxtkLclSrvrFileNam = Field.fillLowValue(44);

						@Getter @Setter private char[] taraxtkLclFmtdStatsNam = Field.fillLowValue(44);

						@Getter @Setter private char[] taraxtkLstUpdtUserId = Field.fillLowValue(9);

						@Getter @Setter private char[] taraxtkLstUpdtTs = Field.fillLowValue(26);

						@Getter @Setter private char[] taraxtkGftSrvr1Nam = Field.fillLowValue(10);

						@Getter @Setter private char[] taraxtkGftSrvr1DsnNam = Field.fillLowValue(44);

						@Getter @Setter private char[] taraxtkGftSrvr1Ts = Field.fillLowValue(26);

						@Getter @Setter private char[] taraxtkGftSrvr2Nam = Field.fillLowValue(10);

						@Getter @Setter private char[] taraxtkGftSrvr2DsnNam = Field.fillLowValue(44);

						@Getter @Setter private char[] taraxtkGftSrvr2Ts = Field.fillLowValue(26);

						@Getter @Setter private char[] taraxtkMfeSrvrNam = Field.fillLowValue(20);

						@Getter @Setter private char[] taraxtkMfeBusPrtnrId = Field.fillLowValue(6);

						@Getter @Setter private char[] taraxtkMfeEndptId = Field.fillLowValue(7);

						@Getter @Setter private char[] taraxtkMfeBulkId = Field.fillLowValue(4);

						@Getter @Setter private char[] taraxtkInbndSw = Field.fillLowValue(1);

						@Getter @Setter private char[] taraxtkOutbndSw = Field.fillLowValue(1);

						@Getter @Setter private char[] taraxtkBrdcstSw = Field.fillLowValue(1);

						@Getter @Setter private char[] taraxtkLastRunKyvlTxt = Field.fillLowValue(16);

						@Getter @Setter private char[] taraxtkSshBulkId = Field.fillLowValue(4);

						@Getter @Setter private char[] taraxtkSshEndptId = Field.fillLowValue(7);

						@Getter @Setter private char[] taraxtkSshBusPrtnrId = Field.fillLowValue(6);

						@Getter @Setter private char[] taraxtkSshSrvrNam = Field.fillLowValue(20);
				@Getter @Setter private TaraxtkTaskWorkParmTxt taraxtkTaskWorkParmTxt = new TaraxtkTaskWorkParmTxt();
	
	/**
	* Constructor for Taraxtk
	**/
    public Taraxtk() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getTaraxtkDirNodeNam().setParent(this,getStartOffset() + 25);
					getTaraxtkStatsFileNam().setParent(this,getStartOffset() + 309);
					getTaraxtkTaskWorkParmTxt().setParent(this,getStartOffset() + 991);
	   	/*  end of offset */
    }



	/**
	 * 	initializes Taraxtk
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setTaraxtkAppNam(CONSTANTS.SPACE_8);
         setTaraxtkXferPrcssNam(CONSTANTS.SPACE_8);
         setTaraxtkStatCd(CONSTANTS.SPACE);
                     setTaraxtkDlyIntvlNum(0);
         setTaraxtkHighLvlQlfrCd(CONSTANTS.SPACE_4);
          getTaraxtkDirNodeNam().initialize();
     
         setTaraxtkLstRunTs(CONSTANTS.SPACE_26);
          getTaraxtkStatsFileNam().initialize();
     
                     setTaraxtkRunLmtNum(0);
         setTaraxtkLclRawStatsNam(CONSTANTS.SPACE_44);
         setTaraxtkLclSrvrFileNam(CONSTANTS.SPACE_44);
         setTaraxtkLclFmtdStatsNam(CONSTANTS.SPACE_44);
         setTaraxtkLstUpdtUserId(CONSTANTS.SPACE_9);
         setTaraxtkLstUpdtTs(CONSTANTS.SPACE_26);
         setTaraxtkGftSrvr1Nam(CONSTANTS.SPACE_10);
         setTaraxtkGftSrvr1DsnNam(CONSTANTS.SPACE_44);
         setTaraxtkGftSrvr1Ts(CONSTANTS.SPACE_26);
         setTaraxtkGftSrvr2Nam(CONSTANTS.SPACE_10);
         setTaraxtkGftSrvr2DsnNam(CONSTANTS.SPACE_44);
         setTaraxtkGftSrvr2Ts(CONSTANTS.SPACE_26);
         setTaraxtkMfeSrvrNam(CONSTANTS.SPACE_20);
         setTaraxtkMfeBusPrtnrId(CONSTANTS.SPACE_6);
         setTaraxtkMfeEndptId(CONSTANTS.SPACE_7);
         setTaraxtkMfeBulkId(CONSTANTS.SPACE_4);
         setTaraxtkInbndSw(CONSTANTS.SPACE);
         setTaraxtkOutbndSw(CONSTANTS.SPACE);
         setTaraxtkBrdcstSw(CONSTANTS.SPACE);
         setTaraxtkLastRunKyvlTxt(CONSTANTS.SPACE_16);
         setTaraxtkSshBulkId(CONSTANTS.SPACE_4);
         setTaraxtkSshEndptId(CONSTANTS.SPACE_7);
         setTaraxtkSshBusPrtnrId(CONSTANTS.SPACE_6);
         setTaraxtkSshSrvrNam(CONSTANTS.SPACE_20);
          getTaraxtkTaskWorkParmTxt().initialize();
     
   }


}
  
