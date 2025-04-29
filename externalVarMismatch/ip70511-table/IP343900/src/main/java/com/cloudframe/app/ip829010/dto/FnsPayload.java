package com.cloudframe.app.ip829010.dto;

/**
*  The class FnsPayload is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class FnsPayload extends FnsPayloadSerialized {
   

								@Getter @Setter private short fnsPayloadQueryNo;

						@Getter @Setter private char[] fnsPayloadGftDsn = Field.fillLowValue(44);

								@Getter @Setter private int fnsPayloadLogicalSeq;

								@Getter @Setter private int fnsPayloadTxnNum;

								@Getter @Setter private short fnsPayloadFacCount;

						@Getter @Setter private char[] fnsPayloadFaaPanStatCd = Field.fillLowValue(1);

						@Getter @Setter private char[] fnsPayloadFaaCloseDt = Field.fillLowValue(10);
				@Getter @Setter private FnsPayloadFnsDataFields fnsPayloadFnsDataFields = new FnsPayloadFnsDataFields();
	
	/**
	* Constructor for FnsPayload
	**/
    public FnsPayload() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getFnsPayloadFnsDataFields().setParent(this,getStartOffset() + 68);
	   	/*  end of offset */
    }



	/**
	 * 	initializes FnsPayload
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setFnsPayloadQueryNo((short)0);
         setFnsPayloadGftDsn(CONSTANTS.SPACE_44);
                     setFnsPayloadLogicalSeq(0);
                     setFnsPayloadTxnNum(0);
         	setFnsPayloadFacCount((short)0);
         setFnsPayloadFaaPanStatCd(CONSTANTS.SPACE);
         setFnsPayloadFaaCloseDt(CONSTANTS.SPACE_10);
          getFnsPayloadFnsDataFields().initialize();
     
   }


}
  
