package com.cloudframe.app.sf320010.dto;

/**
*  The class RpPsDetail is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpPsDetail extends RpPsDetailSerialized {
   

						@Getter @Setter private char[] rpPsDCc = Field.fillLowValue(1);

						@Getter @Setter private char[] rpPsRecordType = Field.fillLowValue(1);


						@Getter @Setter private char[] rpPsReferenceNbr = Field.fillLowValue(6);


						@Getter @Setter private char[] rpPsTime = Field.fillLowValue(6);


						@Getter @Setter private char[] rpPsTransDate = Field.fillLowValue(6);


						@Getter @Setter private char[] rpPsFloorLimInd = Field.fillLowValue(1);


								@Getter @Setter private long rpPsFloorLimAmt;


						@Getter @Setter private char[] rpPsPosResponse = Field.fillLowValue(1);


						@Getter @Setter private char[] rpPsRejectReason = Field.fillLowValue(1);


						@Getter @Setter private char[] rpPsInasTransCode = Field.fillLowValue(3);


						@Getter @Setter private char[] rpPsInasResponse = Field.fillLowValue(1);


						@Getter @Setter private char[] rpPsAuthorizationCode = Field.fillLowValue(6);


						@Getter @Setter private char[] rpPsIcaNumber = Field.fillLowValue(6);


						@Getter @Setter private char[] rpPsTerminalId = Field.fillLowValue(18);


						@Getter @Setter private char[] rpPsCardholderNbr = Field.fillLowValue(19);


						@Getter @Setter private char[] rpPsExpirationDate = Field.fillLowValue(4);

				@Getter @Setter private RpPsTransAmountX rpPsTransAmountX = new RpPsTransAmountX();


						@Getter @Setter private char[] rpPsMagneticStripeInd = Field.fillLowValue(1);


						@Getter @Setter private char[] rpPsMessageStatus = Field.fillLowValue(1);


						@Getter @Setter private char[] rpPsNetworkType = Field.fillLowValue(1);


								@Getter @Setter private int rpPsQueueIdInputPort;


								@Getter @Setter private int rpPsTimeInSystemHh;

								@Getter @Setter private int rpPsTimeInSystemMm;

								@Getter @Setter private int rpPsTimeInSystemSs;


						@Getter @Setter private char[] rpPsTerminalAuthCode = Field.fillLowValue(6);
	
	/**
	* Constructor for RpPsDetail
	**/
    public RpPsDetail() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getRpPsTransAmountX().setParent(this,getStartOffset() + 100);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 2
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 9
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 16
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 23
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 25
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 31
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 33
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 35
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 39
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 41
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 48
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 55
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 74
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 94
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 99
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 108
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 110
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 112
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 114
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 119
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 126
             ,1
             );
    }





}
  
