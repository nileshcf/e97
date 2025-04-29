package com.cloudframe.app.init1.dto;

/**
*  The class WsrevRevoStatRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class WsrevRevoStatRecord extends WsrevRevoStatRecordSerialized {
   

						@Getter @Setter private char[] wsrevVisionInstanceCd = Field.fillLowValue(1);

						@Getter @Setter private char[] wsrevUbOrigInstance = Field.fillLowValue(20);

						@Getter @Setter private char[] wsrevUbOrigFileName = Field.fillLowValue(40);

						@Getter @Setter private char[] wsrevBillCycleDt = Field.fillLowValue(10);

						@Getter @Setter private char[] wsrevSwitchId = Field.fillLowValue(3);

						@Getter @Setter private char[] wsrevDataType = Field.fillLowValue(4);

						@Getter @Setter private char[] wsrevReceivedTmstamp = Field.fillLowValue(26);

						@Getter @Setter private char[] wsrevCreateTmstamp = Field.fillLowValue(26);

						@Getter @Setter private char[] wsrevFileStatus = Field.fillLowValue(10);

						@Getter @Setter private char[] wsrevReason = Field.fillLowValue(40);

								@Getter @Setter private long wsrevInputCount;

								@Getter @Setter private long wsrevFilteredCount;

								@Getter @Setter private long wsrevRejectedCount;

								@Getter @Setter private long wsrevBilledCount;

						@Getter @Setter private char[] wsrevStreamCd = Field.fillLowValue(1);

								@Getter @Setter private int wsrevIterNo;

								@Getter @Setter private int wsrevCycleNo;

								@Getter @Setter private BigDecimal wsrevDataChgAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wsrevRejDataChgAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wsrevBilledDataChgAmt = BigDecimal.ZERO;

						@Getter @Setter private char[] wsrevVersionNum = Field.fillLowValue(4);

	
	/**
	* Constructor for WsrevRevoStatRecord
	**/
    public WsrevRevoStatRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes WsrevRevoStatRecord
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWsrevVisionInstanceCd(CONSTANTS.SPACE);
         setWsrevUbOrigInstance(CONSTANTS.SPACE_20);
         setWsrevUbOrigFileName(CONSTANTS.SPACE_40);
         setWsrevBillCycleDt(CONSTANTS.SPACE_10);
         setWsrevSwitchId(CONSTANTS.SPACE_3);
         setWsrevDataType(CONSTANTS.SPACE_4);
         setWsrevReceivedTmstamp(CONSTANTS.SPACE_26);
         setWsrevCreateTmstamp(CONSTANTS.SPACE_26);
         setWsrevFileStatus(CONSTANTS.SPACE_10);
         setWsrevReason(CONSTANTS.SPACE_40);
                     setWsrevInputCount(0);
                     setWsrevFilteredCount(0);
                     setWsrevRejectedCount(0);
                     setWsrevBilledCount(0);
         setWsrevStreamCd(CONSTANTS.SPACE);
                     setWsrevIterNo(0);
                     setWsrevCycleNo(0);
			setWsrevDataChgAmt(BigDecimal.ZERO);
			setWsrevRejDataChgAmt(BigDecimal.ZERO);
			setWsrevBilledDataChgAmt(BigDecimal.ZERO);
         setWsrevVersionNum(CONSTANTS.SPACE_4);
   }


}
  
