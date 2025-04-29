package com.cloudframe.app.ar640010.dto;

/**
*  The class Taraept is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Taraept extends TaraeptSerialized {
   

						@Getter @Setter private char[] taraeptEndptId = Field.fillLowValue(7);

						@Getter @Setter private char[] taraeptXferMthdCd = Field.fillLowValue(1);

						@Getter @Setter private char[] taraeptBusPrtnrId = Field.fillLowValue(6);

						@Getter @Setter private char[] taraeptXferLocNam = Field.fillLowValue(20);
				@Getter @Setter private TaraeptXferUserId taraeptXferUserId = new TaraeptXferUserId();
				@Getter @Setter private TaraeptXferPswdId taraeptXferPswdId = new TaraeptXferPswdId();

						@Getter @Setter private char[] taraeptUserSrvrId = Field.fillLowValue(20);

						@Getter @Setter private char[] taraeptHostTypeCd = Field.fillLowValue(1);

						@Getter @Setter private char[] taraeptUserNam = Field.fillLowValue(30);

						@Getter @Setter private char[] taraeptUserPhnNum = Field.fillLowValue(10);

						@Getter @Setter private char[] taraeptUserFaxNum = Field.fillLowValue(10);

						@Getter @Setter private char[] taraeptUserEmailAddr = Field.fillLowValue(70);

						@Getter @Setter private char[] taraeptBkupEndptId = Field.fillLowValue(7);

						@Getter @Setter private char[] taraeptBkupActvSw = Field.fillLowValue(1);

						@Getter @Setter private char[] taraeptEffFromTs = Field.fillLowValue(26);

						@Getter @Setter private char[] taraeptEffToTs = Field.fillLowValue(26);

						@Getter @Setter private char[] taraeptLstUpdtUserId = Field.fillLowValue(9);

						@Getter @Setter private char[] taraeptLstUpdtTs = Field.fillLowValue(26);

						@Getter @Setter private char[] taraeptGftSrvrNam = Field.fillLowValue(10);

						@Getter @Setter private char[] taraeptCsMipId = Field.fillLowValue(3);

						@Getter @Setter private char[] taraeptRmMipId = Field.fillLowValue(3);

						@Getter @Setter private char[] taraeptBusPrtnrNam = Field.fillLowValue(70);

						@Getter @Setter private char[] taraeptTapeMediaCd = Field.fillLowValue(1);

								@Getter @Setter private short taraeptTapeTrckNum;

						@Getter @Setter private char[] taraeptTapeLblFrmtCd = Field.fillLowValue(1);

								@Getter @Setter private short taraeptTapeAddrIndxNum;

						@Getter @Setter private char[] taraeptXferModeCd = Field.fillLowValue(4);

						@Getter @Setter private char[] taraeptAltUserSrvrId = Field.fillLowValue(20);
				@Getter @Setter private TaraeptAltXferUserId taraeptAltXferUserId = new TaraeptAltXferUserId();
				@Getter @Setter private TaraeptAltXferPswdId taraeptAltXferPswdId = new TaraeptAltXferPswdId();

						@Getter @Setter private char[] taraeptRteToHubSw = Field.fillLowValue(1);

						@Getter @Setter private char[] taraeptEndptTypCd = Field.fillLowValue(2);

						@Getter @Setter private char[] taraeptHubId = Field.fillLowValue(8);
	
	/**
	* Constructor for Taraept
	**/
    public Taraept() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getTaraeptXferUserId().setParent(this,getStartOffset() + 34);
					getTaraeptXferPswdId().setParent(this,getStartOffset() + 100);
					getTaraeptAltXferUserId().setParent(this,getStartOffset() + 518);
					getTaraeptAltXferPswdId().setParent(this,getStartOffset() + 584);
	   	/*  end of offset */
    }



	/**
	 * 	initializes Taraept
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setTaraeptEndptId(CONSTANTS.SPACE_7);
         setTaraeptXferMthdCd(CONSTANTS.SPACE);
         setTaraeptBusPrtnrId(CONSTANTS.SPACE_6);
         setTaraeptXferLocNam(CONSTANTS.SPACE_20);
          getTaraeptXferUserId().initialize();
     
          getTaraeptXferPswdId().initialize();
     
         setTaraeptUserSrvrId(CONSTANTS.SPACE_20);
         setTaraeptHostTypeCd(CONSTANTS.SPACE);
         setTaraeptUserNam(CONSTANTS.SPACE_30);
         setTaraeptUserPhnNum(CONSTANTS.SPACE_10);
         setTaraeptUserFaxNum(CONSTANTS.SPACE_10);
         setTaraeptUserEmailAddr(CONSTANTS.SPACE_70);
         setTaraeptBkupEndptId(CONSTANTS.SPACE_7);
         setTaraeptBkupActvSw(CONSTANTS.SPACE);
         setTaraeptEffFromTs(CONSTANTS.SPACE_26);
         setTaraeptEffToTs(CONSTANTS.SPACE_26);
         setTaraeptLstUpdtUserId(CONSTANTS.SPACE_9);
         setTaraeptLstUpdtTs(CONSTANTS.SPACE_26);
         setTaraeptGftSrvrNam(CONSTANTS.SPACE_10);
         setTaraeptCsMipId(CONSTANTS.SPACE_3);
         setTaraeptRmMipId(CONSTANTS.SPACE_3);
         setTaraeptBusPrtnrNam(CONSTANTS.SPACE_70);
         setTaraeptTapeMediaCd(CONSTANTS.SPACE);
         	setTaraeptTapeTrckNum((short)0);
         setTaraeptTapeLblFrmtCd(CONSTANTS.SPACE);
         	setTaraeptTapeAddrIndxNum((short)0);
         setTaraeptXferModeCd(CONSTANTS.SPACE_4);
         setTaraeptAltUserSrvrId(CONSTANTS.SPACE_20);
          getTaraeptAltXferUserId().initialize();
     
          getTaraeptAltXferPswdId().initialize();
     
         setTaraeptRteToHubSw(CONSTANTS.SPACE);
         setTaraeptEndptTypCd(CONSTANTS.SPACE_2);
         setTaraeptHubId(CONSTANTS.SPACE_8);
   }


}
  
