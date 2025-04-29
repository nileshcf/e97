package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf31IsoExtractRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class Sf31IsoExtractRec extends Sf31IsoExtractRecSerialized {
   

						@Getter @Setter private char[] sf31IsoCardholderNbr = new char[19];

								@Getter @Setter private BigDecimal sf31IsoTransactionAmt = BigDecimal.ZERO;

						@Getter @Setter private char[] sf31IsoAcquirerIca = Field.fillLowValue(6);

						@Getter @Setter private char[] sf31IsoForwardInstIdOnly = new char[6];

						@Getter @Setter private char[] sf31IsoAuthNumber = Field.fillLowValue(6);

						@Getter @Setter private char[] sf31IsoAuthResponse = Field.fillLowValue(2);

						@Getter @Setter private char[] sf31IsoAuthAddlData = Field.fillLowValue(25);

						@Getter @Setter private char[] sf31IsoCardholderExpdt = new char[4];

						@Getter @Setter private char[] sf31IsoPosDeviceType = new char[3];

						@Getter @Setter private char[] sf31IsoTrackTwoData = new char[37];

						@Getter @Setter private char[] sf31IsoTrackOneData = new char[76];

						@Getter @Setter private char[] sf31IsoTransactionType = new char[1];

						@Getter @Setter private char[] sf31IsoAvsRequestTag = new char[2];

						@Getter @Setter private char[] sf31IsoAvsRequestLgth = new char[2];

						@Getter @Setter private char[] sf31IsoAvsRequestCode = new char[2];

						@Getter @Setter private char[] sf31IsoAvsResponseTag = new char[2];

						@Getter @Setter private char[] sf31IsoAvsResponseLgth = new char[2];

						@Getter @Setter private char[] sf31IsoAvsResponseCode = new char[1];

						@Getter @Setter private char[] sf31IsoPosData = new char[26];

						@Getter @Setter private char[] sf31IsoFinNetworkCode = new char[3];

						@Getter @Setter private char[] sf31IsoProcessingCode = new char[6];

						@Getter @Setter private char[] sf31IsoDateTimeXmit = new char[10];

						@Getter @Setter private char[] sf31IsoMerchantType = new char[4];

						@Getter @Setter private char[] sf31IsoCountryCode = new char[3];

						@Getter @Setter private char[] sf31IsoPosPinCapture = new char[2];

						@Getter @Setter private char[] sf31IsoRetrievalRefno = new char[12];

						@Getter @Setter private char[] sf31IsoIdTerminal = new char[8];

						@Getter @Setter private char[] sf31IsoCardAcceptor = new char[15];

						@Getter @Setter private char[] sf31IsoAddtlData = new char[3];
				@Getter @Setter private Sf31IsoBkntData sf31IsoBkntData = new Sf31IsoBkntData();

						@Getter @Setter private char[] sf31IsoMerchantId = new char[16];
				@Getter @Setter private Sf31IsoTransDate sf31IsoTransDate = new Sf31IsoTransDate();

						@Getter @Setter private char[] sf31IsoIssUpIca = new char[6];

						@Getter @Setter private char[] sf31IsoStateCode = new char[2];

						@Getter @Setter private char[] sf31IsoBlIcSeqNo = new char[8];

						@Getter @Setter private char[] sf31IsoIcMagCc = new char[1];

						@Getter @Setter private char[] sf31IsoDe48Tag87Present = new char[1];

						@Getter @Setter private char[] sf31IsoDe48Tag88Present = new char[1];

						@Getter @Setter private char[] sf31IsoDe48Tag89Value = new char[1];
				@Getter @Setter private Sf31IsoAddlAvsii sf31IsoAddlAvsii = new Sf31IsoAddlAvsii();
				@Getter @Setter private Sf31IsoCrncyConvFields sf31IsoCrncyConvFields = new Sf31IsoCrncyConvFields();

						@Getter @Setter private char[] sf31IsoMemberData = new char[99];

						@Getter @Setter private char[] sf31IsoDe48Se24Sf1 = new char[5];

						@Getter @Setter private char[] sf31IsoDe48Se24Sf2 = new char[3];

						@Getter @Setter private char[] sf31IsoDe48Se24Sf3 = new char[3];

						@Getter @Setter private char[] sf31IsoDe48Se24Sf4 = new char[3];

						@Getter @Setter private char[] sf31IsoDe48Se43Aav = new char[32];

						@Getter @Setter private char[] sf31IsoDe48Se66Sf1 = new char[1];

						@Getter @Setter private char[] sf31IsoDe48Se66Sf2 = new char[36];


								@Getter @Setter private long sf31IsoTimeLocalTrans;

								@Getter @Setter private int sf31IsoDateLocalTrans;

						@Getter @Setter private char[] sf31IsoDe48Se42Len3 = new char[3];

						@Getter @Setter private char[] sf31IsoDe48Se42Sf2Sf3 = new char[4];

						@Getter @Setter private char[] sf31IsoDe48Se33Sf1 = new char[1];

						@Getter @Setter private char[] sf31IsoDe48Se33Sf2 = new char[19];

						@Getter @Setter private char[] sf31IsoDe48Se33Sf5 = new char[2];

						@Getter @Setter private char[] sf31IsoDe48Se33Sf6 = new char[11];

						@Getter @Setter private char[] sf31IsoDe48Se52Tic = new char[2];

						@Getter @Setter private char[] sf31FutureFiller = new char[27];
	
	/**
	* Constructor for Sf31IsoExtractRec
	**/
    public Sf31IsoExtractRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSf31IsoBkntData().setParent(this,getStartOffset() + 300);
					getSf31IsoTransDate().setParent(this,getStartOffset() + 325);
					getSf31IsoAddlAvsii().setParent(this,getStartOffset() + 349);
					getSf31IsoCrncyConvFields().setParent(this,getStartOffset() + 524);
	   	/*  end of offset */
								setSf31IsoCardholderNbr(fillSpace(19));
								setSf31IsoTransactionAmt(BigDecimal.ZERO);
								setSf31IsoForwardInstIdOnly(fillSpace(6));
								setSf31IsoCardholderExpdt(fillSpace(4));
								setSf31IsoPosDeviceType(fillSpace(3));
								setSf31IsoTrackTwoData(fillSpace(37));
								setSf31IsoTrackOneData(pad(76," ".toCharArray(),' ',RIGHT_PAD));
								setSf31IsoTransactionType(fillSpace(1));
								setSf31IsoAvsRequestTag(fillSpace(2));
								setSf31IsoAvsRequestLgth(fillSpace(2));
								setSf31IsoAvsRequestCode(fillSpace(2));
								setSf31IsoAvsResponseTag(fillSpace(2));
								setSf31IsoAvsResponseLgth(fillSpace(2));
								setSf31IsoAvsResponseCode(fillSpace(1));
								setSf31IsoPosData(fillSpace(26));
								setSf31IsoFinNetworkCode(fillSpace(3));
								setSf31IsoProcessingCode(fillSpace(6));
								setSf31IsoDateTimeXmit(fillSpace(10));
								setSf31IsoMerchantType(fillSpace(4));
								setSf31IsoCountryCode(fillSpace(3));
								setSf31IsoPosPinCapture(fillSpace(2));
								setSf31IsoRetrievalRefno(fillSpace(12));
								setSf31IsoIdTerminal(fillSpace(8));
								setSf31IsoCardAcceptor(fillSpace(15));
								setSf31IsoAddtlData(fillSpace(3));
								setSf31IsoMerchantId(fillSpace(16));
								setSf31IsoIssUpIca(fillSpace(6));
								setSf31IsoStateCode(fillSpace(2));
								setSf31IsoBlIcSeqNo(fillSpace(8));
								setSf31IsoIcMagCc(fillSpace(1));
								setSf31IsoDe48Tag87Present(fillSpace(1));
								setSf31IsoDe48Tag88Present(fillSpace(1));
								setSf31IsoDe48Tag89Value(fillSpace(1));
								setSf31IsoMemberData(pad(99," ".toCharArray(),' ',RIGHT_PAD));
								setSf31IsoDe48Se24Sf1(fillSpace(5));
								setSf31IsoDe48Se24Sf2(fillSpace(3));
								setSf31IsoDe48Se24Sf3(fillSpace(3));
								setSf31IsoDe48Se24Sf4(fillSpace(3));
								setSf31IsoDe48Se43Aav(fillSpace(32));
								setSf31IsoDe48Se66Sf1(fillSpace(1));
								setSf31IsoDe48Se66Sf2(fillSpace(36));
       replaceValue( // serialize and save the value
             fillSpace(17)
             , getStartOffset() + 804
             ,17
             );
								setSf31IsoTimeLocalTrans(0L);
								setSf31IsoDateLocalTrans(0);
								setSf31IsoDe48Se42Len3(fillSpace(3));
								setSf31IsoDe48Se42Sf2Sf3(fillSpace(4));
								setSf31IsoDe48Se33Sf1(fillSpace(1));
								setSf31IsoDe48Se33Sf2(fillSpace(19));
								setSf31IsoDe48Se33Sf5(fillSpace(2));
								setSf31IsoDe48Se33Sf6(fillSpace(11));
								setSf31IsoDe48Se52Tic(fillSpace(2));
								setSf31FutureFiller(fillSpace(27));
    }





}
  
