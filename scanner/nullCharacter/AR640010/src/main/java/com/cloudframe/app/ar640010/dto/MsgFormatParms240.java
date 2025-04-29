package com.cloudframe.app.ar640010.dto;

/**
*  The class MsgFormatParms240 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class MsgFormatParms240 extends MsgFormatParms240Serialized {
   

						@Getter @Setter private char[] gftSubsystemId240 = new char[4];

						@Getter @Setter private char[] msgNum240 = new char[3];

						@Getter @Setter private char[] msgSeverityInd240 = new char[1];

						@Getter @Setter private char[] msgTypeInd240 = new char[4];

						@Getter @Setter private char[] msgBulkid240 = new char[4];

						@Getter @Setter private char[] msgEndpt240 = new char[7];

								@Getter @Setter private short msgCyclNum240;

						@Getter @Setter private char[] msgFilename240 = new char[44];

						@Getter @Setter private char[] xferMthd240 = new char[3];

						@Getter @Setter private char[] xferMthdNode240 = new char[20];

						@Getter @Setter private char[] xferProcId240 = new char[20];

						@Getter @Setter private char[] xferMthdMsgId240 = new char[20];

						@Getter @Setter private char[] msgErrCd240 = new char[4];

						@Getter @Setter private char[] msgStatRefId240 = new char[4];

						@Getter @Setter private char[] msgStatRefDesc240 = new char[80];

						@Getter @Setter private char[] msgErrorDescription240 = new char[400];
			@Getter @Setter private List<MsgErr240> msgErr240 = new ArrayList<>();
    	

						@Getter @Setter private char[] msgProgName240 = new char[8];

						@Getter @Setter private char[] msgParaName240 = new char[30];

						@Getter @Setter private char[] msgBusPrtnrId240 = new char[6];

						@Getter @Setter private char[] msgAbendCd240 = new char[5];
	
	/**
	* Constructor for MsgFormatParms240
	**/
    public MsgFormatParms240() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < MSG_ERR_240_SIZE;arrayIndex++) {
						getMsgErr240().add(new MsgErr240(this, beginMsgErr240 + 
						arrayIndex * MsgErr240.getMsgErr240FieldLength()));
				}
	   	/*  end of offset */
								setGftSubsystemId240(fillSpace(4));
								setMsgNum240(fillSpace(3));
								setMsgSeverityInd240(fillSpace(1));
								setMsgTypeInd240(fillSpace(4));
								setMsgBulkid240(fillSpace(4));
								setMsgEndpt240(fillSpace(7));
								setMsgCyclNum240((short)0);
								setMsgFilename240(fillSpace(44));
								setXferMthd240(fillSpace(3));
								setXferMthdNode240(fillSpace(20));
								setXferProcId240(fillSpace(20));
								setXferMthdMsgId240(fillSpace(20));
								setMsgErrCd240(fillSpace(4));
								setMsgStatRefId240(fillSpace(4));
								setMsgStatRefDesc240(pad(80," ".toCharArray(),' ',RIGHT_PAD));
								setMsgErrorDescription240(pad(400," ".toCharArray(),' ',RIGHT_PAD));
								setMsgProgName240(fillSpace(8));
								setMsgParaName240(fillSpace(30));
								setMsgBusPrtnrId240(fillSpace(6));
								setMsgAbendCd240(fillSpace(5));
    }



	/**
	 * 	initializes MsgFormatParms240
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setGftSubsystemId240(CONSTANTS.SPACE_4);
         setMsgNum240(CONSTANTS.SPACE_3);
         setMsgSeverityInd240(CONSTANTS.SPACE);
         setMsgTypeInd240(CONSTANTS.SPACE_4);
         setMsgBulkid240(CONSTANTS.SPACE_4);
         setMsgEndpt240(CONSTANTS.SPACE_7);
         	setMsgCyclNum240((short)0);
         setMsgFilename240(CONSTANTS.SPACE_44);
         setXferMthd240(CONSTANTS.SPACE_3);
         setXferMthdNode240(CONSTANTS.SPACE_20);
         setXferProcId240(CONSTANTS.SPACE_20);
         setXferMthdMsgId240(CONSTANTS.SPACE_20);
         setMsgErrCd240(CONSTANTS.SPACE_4);
         setMsgStatRefId240(CONSTANTS.SPACE_4);
         setMsgStatRefDesc240(CONSTANTS.SPACE_80);
         setMsgErrorDescription240(CONSTANTS.SPACE_400);
         setMsgProgName240(CONSTANTS.SPACE_8);
         setMsgParaName240(CONSTANTS.SPACE_30);
         setMsgBusPrtnrId240(CONSTANTS.SPACE_6);
         setMsgAbendCd240(CONSTANTS.SPACE_5);
   }


}
  
