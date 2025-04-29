package com.cloudframe.app.o529351u.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.List;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private long w02AbsoluteTime;

						@Getter @Setter private char[] ddSpirules = new char[8];

						@Getter @Setter private char[] ddPlanvara = new char[8];

								@Getter @Setter private int cicsDfhrespCode;

						@Getter @Setter private char[] firstTimeThru = Field.fillLowValue(1);

						@Getter @Setter private char[] planVarFoundSw = Field.fillLowValue(1);

						@Getter @Setter private char[] posTierFoundSw = Field.fillLowValue(1);

						@Getter @Setter private char[] newPlanVarFoundSw = Field.fillLowValue(1);

						@Getter @Setter private char[] endOfPlanAlt = Field.fillLowValue(1);

						@Getter @Setter private char[] endOfSpiRule = Field.fillLowValue(1);

						@Getter @Setter private char[] topsCnvSvc = Field.fillLowValue(1);

						@Getter @Setter private char[] nbrEqual = Field.fillLowValue(1);

						@Getter @Setter private char[] searchComplete = Field.fillLowValue(1);

						@Getter @Setter private char[] fromPsFound = Field.fillLowValue(1);

						@Getter @Setter private char[] fromSvcFound = Field.fillLowValue(1);

						@Getter @Setter private char[] fromPrvFound = Field.fillLowValue(1);

						@Getter @Setter private char[] fromIcd9Found = Field.fillLowValue(1);

						@Getter @Setter private char[] fromCauseFound = Field.fillLowValue(1);

						@Getter @Setter private char[] useDiagnosisSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ipaCodeFound = Field.fillLowValue(1);

						@Getter @Setter private char[] cpeFlgFound = Field.fillLowValue(1);

						@Getter @Setter private char[] ipaAndGtnFound = Field.fillLowValue(1);

						@Getter @Setter private char[] gtnLoaded = Field.fillLowValue(1);

						@Getter @Setter private char[] sameTable = Field.fillLowValue(1);

						@Getter @Setter private char[] keyComplete = Field.fillLowValue(1);

						@Getter @Setter private char[] withMmiSw2010 = Field.fillLowValue(1);

						@Getter @Setter private char[] mmiFoundSw = Field.fillLowValue(1);

						@Getter @Setter private char[] primDiagFound = Field.fillLowValue(1);

						@Getter @Setter private char[] d529351uDb2Dsm = new char[8];

						@Getter @Setter private char[] newSpiSw = Field.fillLowValue(1);

						@Getter @Setter private char[] primeSpiSw = Field.fillLowValue(1);

								@Getter @Setter private short medSvcNbr;

						@Getter @Setter private char[] medSvc = new char[6];

						@Getter @Setter private char[] feSpiEnableInd = new char[3];

						@Getter @Setter private char[] fePrimeSpiEnableInd = new char[3];

								@Getter @Setter private int keySub;

								@Getter @Setter private int sub;

								@Getter @Setter private int posSub;

								@Getter @Setter private int genSub;

								@Getter @Setter private int newSub;

								@Getter @Setter private int psSub;

								@Getter @Setter private int svcSub;

								@Getter @Setter private int pvSub;

								@Getter @Setter private int icd9Sub;

								@Getter @Setter private int causeSub;

								@Getter @Setter private int ipaSub;

								@Getter @Setter private int cflgSub;

								@Getter @Setter private int sub01;

								@Getter @Setter private int diagSub;

								@Getter @Setter private int s1;

								@Getter @Setter private int dSub;

								@Getter @Setter private int iSub;

								@Getter @Setter private int s2;

								@Getter @Setter private short savHpriceCount;

								@Getter @Setter private short savNbrOfOccurances2;
      private List<char[]> savHcdsChargeInfo; 


								@Getter @Setter private short savMpriceCount;

								@Getter @Setter private short savNbrOfOccurances3;

								@Getter @Setter private int sazgrpNumGrp;
      private List<char[]> sazgrpGroups; 


						@Getter @Setter private char[] functionFlag = Field.fillLowValue(2);

						@Getter @Setter private char[] illogicalCond = Field.fillLowValue(1);

						@Getter @Setter private char[] lsEqiRecord = Field.fillLowValue(48);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setW02AbsoluteTime(0L);
								setDdSpirules(("SPIRUL00").toCharArray());
								setDdPlanvara(("PLNVAR00").toCharArray());
								setD529351uDb2Dsm(("D529351U").toCharArray());
								setMedSvcNbr((short)0);
								setMedSvc(fillSpace(6));
								setFeSpiEnableInd(("ON ").toCharArray());
								setFePrimeSpiEnableInd(("ON ").toCharArray());
								setKeySub(0);
								setSub(0);
								setPosSub(0);
								setGenSub(0);
								setNewSub(0);
								setPsSub(1);
								setSvcSub(1);
								setPvSub(1);
								setIcd9Sub(1);
								setCauseSub(1);
								setIpaSub(0);
								setCflgSub(0);
								setSub01(0);
								setDiagSub(0);
								setS1(0);
								setDSub(0);
								setISub(0);
								setS2(0);
    }





}
  
