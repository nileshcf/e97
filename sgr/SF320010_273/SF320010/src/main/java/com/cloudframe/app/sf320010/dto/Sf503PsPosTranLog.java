package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503PsPosTranLog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf503PsPosTranLog extends Sf503PsPosTranLogSerialized { 
   

						@Getter @Setter private char[] sf503PsRecordType = Field.fillLowValue(1);

						@Getter @Setter private char[] sf503PsReferenceNbr = Field.fillLowValue(6);

						@Getter @Setter private char[] sf503PsTime = Field.fillLowValue(8);

						@Getter @Setter private char[] sf503PsTransDate = Field.fillLowValue(8);

						@Getter @Setter private char[] sf503PsFloorLimInd = Field.fillLowValue(1);

								@Getter @Setter private long sf503PsFloorLimAmt;

						@Getter @Setter private char[] sf503PsPosResponse = Field.fillLowValue(1);

						@Getter @Setter private char[] sf503PsRejectReason = Field.fillLowValue(1);

						@Getter @Setter private char[] sf503PsInasTransCode = Field.fillLowValue(3);

						@Getter @Setter private char[] sf503PsInasResponse = Field.fillLowValue(1);

						@Getter @Setter private char[] sf503PsAuthorizationCode = Field.fillLowValue(6);

						@Getter @Setter private char[] sf503PsIcaNumber = Field.fillLowValue(6);

						@Getter @Setter private char[] sf503PsTerminalId = Field.fillLowValue(18);

						@Getter @Setter private char[] sf503PsCardholderNbr = Field.fillLowValue(19);

						@Getter @Setter private char[] sf503PsExpirationDate = Field.fillLowValue(4);
				@Getter @Setter private Sf503PsTransAmountX sf503PsTransAmountX = new Sf503PsTransAmountX();

						@Getter @Setter private char[] sf503PsMagneticStripeInd = Field.fillLowValue(1);

						@Getter @Setter private char[] sf503PsMessageStatus = Field.fillLowValue(1);

						@Getter @Setter private char[] sf503PsNetworkType = Field.fillLowValue(1);

								@Getter @Setter private int sf503PsQueueIdInputPort;
				@Getter @Setter private Sf503PsTimeInSystem sf503PsTimeInSystem = new Sf503PsTimeInSystem();

						@Getter @Setter private char[] sf503PsTerminalAuthCode = Field.fillLowValue(6);
	
	/**
	* Constructor for Sf503PsPosTranLog
	**/
    public Sf503PsPosTranLog() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf503PsPosTranLog. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503PsPosTranLog(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSf503PsTransAmountX().setParent(this,getStartOffset() + 95);
					getSf503PsTimeInSystem().setParent(this,getStartOffset() + 111);
    } 



}
  
