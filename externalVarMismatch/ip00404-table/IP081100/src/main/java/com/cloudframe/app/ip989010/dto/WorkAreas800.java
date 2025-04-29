package com.cloudframe.app.ip989010.dto;

/**
*  The class WorkAreas800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class WorkAreas800 extends WorkAreas800Serialized {
   
				@Getter @Setter private Tag800 tag800 = new Tag800();

								@Getter @Setter private long trnAmt8001240;

								@Getter @Setter private long trnAmt8001740;

								@Getter @Setter private long acqAmt800;

								@Getter @Setter private long issAmt800;

								@Getter @Setter private long mcAmt800;

								@Getter @Setter private long merchAmt800;

								@Getter @Setter private long rcvr8001740;
				@Getter @Setter private De31800 de31800 = new De31800();

						@Getter @Setter private char[] de43s1800 = new char[80];

								@Getter @Setter private int de43s1Len800;

						@Getter @Setter private char[] de63s2800 = new char[15];

								@Getter @Setter private int fieldLen800;

								@Getter @Setter private int fieldPtr800;

								@Getter @Setter private long fldStrt800;

						@Getter @Setter private char[] fieldVal800 = new char[999];

						@Getter @Setter private char[] fileid800 = new char[25];

						@Getter @Setter private char[] fundOpt800 = new char[1];
				@Getter @Setter private CurrentDate800 currentDate800 = new CurrentDate800();

								@Getter @Setter private long internalMbrId800;

						@Getter @Setter private char[] indent800 = new char[12];

								@Getter @Setter private int ilvl800;

								@Getter @Setter private long julianDate800;
				@Getter @Setter private LuhnsWorkArea800 luhnsWorkArea800 = new LuhnsWorkArea800();

						@Getter @Setter private char[] mccCd800 = new char[4];

								@Getter @Setter private int mccCdLen800;

						@Getter @Setter private char[] merchId800 = new char[15];

								@Getter @Setter private int merchIdLen800;

						@Getter @Setter private char[] newElem800 = Field.fillLowValue(13);
				@Getter @Setter private NewElemData800 newElemData800 = new NewElemData800();

						@Getter @Setter private char[] pan800 = new char[16];

								@Getter @Setter private int panLen800;

								@Getter @Setter private long ptrVal800;

								@Getter @Setter private BigDecimal random800 = BigDecimal.ZERO;
				@Getter @Setter private RandomX800 randomX800 = new RandomX800();

						@Getter @Setter private char[] revInd800 = new char[1];

								@Getter @Setter private int revIndLen800;

								@Getter @Setter private long rewardAmt800;

								@Getter @Setter private long rewardPgmId800;

						@Getter @Setter private char[] saveEntry800 = new char[1015];

								@Getter @Setter private int saveTagNum800;

								@Getter @Setter private long seed800;

						@Getter @Setter private char[] sender800 = new char[11];

								@Getter @Setter private long seqNum8800;

								@Getter @Setter private long seqNumP0137800;

								@Getter @Setter private long sys101Rdw800;

								@Getter @Setter private long sys201Rdw800;

						@Getter @Setter private char[] sys001Status800 = new char[2];

						@Getter @Setter private char[] sys002Status800 = new char[2];

						@Getter @Setter private char[] sys005Status800 = new char[2];

						@Getter @Setter private char[] sys003Status800 = new char[2];

						@Getter @Setter private char[] sys004Status800 = new char[2];

						@Getter @Setter private char[] sys101Status800 = new char[2];

						@Getter @Setter private char[] sys201Status800 = new char[2];

						@Getter @Setter private char[] sys202Status800 = new char[2];

						@Getter @Setter private char[] sys204Status800 = new char[2];

						@Getter @Setter private char[] sys205Status800 = new char[2];

								@Getter @Setter private long tagTblPtr800;

						@Getter @Setter private char[] tranAmt800 = new char[12];

								@Getter @Setter private int tranAmtLen800;

						@Getter @Setter private char[] type1800 = new char[22];

								@Getter @Setter private long ica1800;

								@Getter @Setter private long bin1800;

								@Getter @Setter private long maid1800;

								@Getter @Setter private long endpoint1800;

						@Getter @Setter private char[] type2800 = new char[22];

								@Getter @Setter private long ica2800;

								@Getter @Setter private long bin2800;

								@Getter @Setter private long maid2800;

								@Getter @Setter private long endpoint2800;

								@Getter @Setter private long donationAmount800;

						@Getter @Setter private char[] ird800 = new char[2];
	
	/**
	* Constructor for WorkAreas800
	**/
    public WorkAreas800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getTag800().setParent(this,getStartOffset() + 0);
					getDe31800().setParent(this,getStartOffset() + 107);
					getCurrentDate800().setParent(this,getStartOffset() + 1264);
					getLuhnsWorkArea800().setParent(this,getStartOffset() + 1302);
					getNewElemData800().setParent(this,getStartOffset() + 1346);
					getRandomX800().setParent(this,getStartOffset() + 2375);
	   	/*  end of offset */
								setTrnAmt8001240(0L);
								setTrnAmt8001740(0L);
								setAcqAmt800(0L);
								setIssAmt800(0L);
								setMcAmt800(0L);
								setMerchAmt800(0L);
								setRcvr8001740(0L);
								setDe43s1800(pad(80," ".toCharArray(),' ',RIGHT_PAD));
								setDe43s1Len800(0);
								setDe63s2800(String.join("", java.util.Collections.nCopies(15, "9")).toCharArray());
								setFieldLen800(0);
								setFieldPtr800(0);
								setFldStrt800(0L);
								setFieldVal800(pad(999," ".toCharArray(),' ',RIGHT_PAD));
								setFileid800("0000000000000000000000000".toCharArray());
								setFundOpt800("0".toCharArray());
								setInternalMbrId800(0L);
								setIndent800(fillSpace(12));
								setIlvl800(3);
								setJulianDate800(0L);
								setMccCd800(fillSpace(4));
								setMccCdLen800(0);
								setMerchId800(fillSpace(15));
								setMerchIdLen800(0);
								setPan800(fillSpace(16));
								setPanLen800(0);
								setPtrVal800(0L);
								setRandom800(BigDecimal.ZERO);
								setRevInd800(fillSpace(1));
								setRevIndLen800(0);
								setRewardAmt800(0L);
								setRewardPgmId800(0L);
								setSaveEntry800(pad(1015," ".toCharArray(),' ',RIGHT_PAD));
								setSaveTagNum800(0);
								setSeed800(0L);
								setSender800(fillSpace(11));
								setSeqNum8800(0L);
								setSeqNumP0137800(0L);
								setSys001Status800(fillSpace(2));
								setSys002Status800(fillSpace(2));
								setSys005Status800(fillSpace(2));
								setSys003Status800(fillSpace(2));
								setSys004Status800(fillSpace(2));
								setSys101Status800(fillSpace(2));
								setSys201Status800(fillSpace(2));
								setSys202Status800(fillSpace(2));
								setSys204Status800(fillSpace(2));
								setSys205Status800(fillSpace(2));
								setTagTblPtr800(0L);
								setTranAmt800("000000000000".toCharArray());
								setTranAmtLen800(0);
								setType1800(fillSpace(22));
								setIca1800(0L);
								setBin1800(0L);
								setMaid1800(0L);
								setEndpoint1800(0L);
								setType2800(fillSpace(22));
								setIca2800(0L);
								setBin2800(0L);
								setMaid2800(0L);
								setEndpoint2800(0L);
								setDonationAmount800(0L);
								setIrd800(fillSpace(2));
    }





}
  
