package com.cloudframe.app.sf311010.dto;

/**
*  The class LogDecompressedData860 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class LogDecompressedData860 extends LogDecompressedData860Serialized {
   

						@Getter @Setter private char[] cardholderNbr860 = Field.fillLowValue(19);

								@Getter @Setter private long processingCode110860;

								@Getter @Setter private long transactionAmount860;
				@Getter @Setter private TransactionAmt1860 transactionAmt1860 = new TransactionAmt1860();

								@Getter @Setter private long setlAmount110860;
				@Getter @Setter private SetlAmt110860 setlAmt110860 = new SetlAmt110860();

								@Getter @Setter private long crdhldrBillAmt110860;

								@Getter @Setter private long dateTimeXmit110860;

								@Getter @Setter private long setlConvRte110860;

								@Getter @Setter private long crdhldrConvRte110860;

						@Getter @Setter private char[] sysTraceAudit860 = Field.fillLowValue(6);

								@Getter @Setter private int transMmdd110860;

								@Getter @Setter private int conv110Mmdd860;

								@Getter @Setter private int merchantType110860;

						@Getter @Setter private char[] countryCode110860 = Field.fillLowValue(3);

								@Getter @Setter private int posEntry110860;

								@Getter @Setter private int posPinCapture110860;

						@Getter @Setter private char[] acquirerIca860 = Field.fillLowValue(6);
				@Getter @Setter private AcquirerIca860Redefined acquirerIca860Redefined = new AcquirerIca860Redefined();

						@Getter @Setter private char[] forwardInstId860 = Field.fillLowValue(6);
				@Getter @Setter private ForwardInstId860Redefined forwardInstId860Redefined = new ForwardInstId860Redefined();

						@Getter @Setter private char[] retrievalRefno110860 = Field.fillLowValue(12);

						@Getter @Setter private char[] authNumber860 = Field.fillLowValue(6);

						@Getter @Setter private char[] authResponse860 = Field.fillLowValue(2);

						@Getter @Setter private char[] idTerminal110860 = Field.fillLowValue(8);

						@Getter @Setter private char[] cardAcceptor110860 = Field.fillLowValue(15);

						@Getter @Setter private char[] authMrchNmctst110860 = Field.fillLowValue(40);

						@Getter @Setter private char[] authAddlData860 = Field.fillLowValue(25);

						@Getter @Setter private char[] avsCurrCode110860 = Field.fillLowValue(3);

								@Getter @Setter private int crncyCdeSetl110860;

								@Getter @Setter private int crncyCrdhldr110860;
				@Getter @Setter private BkntData110860 bkntData110860 = new BkntData110860();

						@Getter @Setter private char[] de112110860 = Field.fillLowValue(103);

								@Getter @Setter private long processingCode100860;

								@Getter @Setter private long tranAmt100860;
				@Getter @Setter private TransactionAmt100860 transactionAmt100860 = new TransactionAmt100860();

								@Getter @Setter private long setlAmt100860;
				@Getter @Setter private SetlAmnt100860 setlAmnt100860 = new SetlAmnt100860();

								@Getter @Setter private long crdhldrBillAmt100860;

								@Getter @Setter private long dateTimeXmit100860;

								@Getter @Setter private long setlConvRte100860;

								@Getter @Setter private long crdhldrConvRte100860;

								@Getter @Setter private long timeLocalTrans100860;

								@Getter @Setter private int dateLocalTrans100860;

						@Getter @Setter private char[] cardholderExpdt860 = Field.fillLowValue(4);

								@Getter @Setter private int transMmdd860;

								@Getter @Setter private int conv100Mmdd860;

								@Getter @Setter private int merchantType860;

						@Getter @Setter private char[] countryCode860 = Field.fillLowValue(3);

						@Getter @Setter private char[] posDeviceType860 = Field.fillLowValue(3);

								@Getter @Setter private int posPinCapture860;

						@Getter @Setter private char[] trackTwoData860 = Field.fillLowValue(37);

						@Getter @Setter private char[] retrievalRefno860 = Field.fillLowValue(12);

						@Getter @Setter private char[] idTerminal860 = Field.fillLowValue(8);

						@Getter @Setter private char[] cardAcceptor860 = Field.fillLowValue(15);

						@Getter @Setter private char[] authMrchNmctst860 = Field.fillLowValue(40);

						@Getter @Setter private char[] trackOneData860 = Field.fillLowValue(76);

						@Getter @Setter private char[] currencyCode860 = Field.fillLowValue(3);

								@Getter @Setter private int crncyCdeSetl100860;

								@Getter @Setter private int crncyCrdhldr100860;

						@Getter @Setter private char[] posData860 = Field.fillLowValue(26);
				@Getter @Setter private BkntData860 bkntData860 = new BkntData860();

						@Getter @Setter private char[] de112100860 = Field.fillLowValue(103);

						@Getter @Setter private char[] crncyConv100860 = Field.fillLowValue(78);
	
	/**
	* Constructor for LogDecompressedData860
	**/
    public LogDecompressedData860() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getTransactionAmt1860().setParent(this,getStartOffset() + 25);
					getSetlAmt110860().setParent(this,getStartOffset() + 37);
					getAcquirerIca860Redefined().setParent(this,getStartOffset() + 113);
					getForwardInstId860Redefined().setParent(this,getStartOffset() + 119);
					getBkntData110860().setParent(this,getStartOffset() + 242);
					getTransactionAmt100860().setParent(this,getStartOffset() + 363);
					getSetlAmnt100860().setParent(this,getStartOffset() + 375);
					getBkntData860().setParent(this,getStartOffset() + 682);
	   	/*  end of offset */
    }





}
  
