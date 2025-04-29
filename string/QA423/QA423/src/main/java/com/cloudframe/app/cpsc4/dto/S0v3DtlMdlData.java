package com.cloudframe.app.cpsc4.dto;

/**
*  The class S0v3DtlMdlData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class S0v3DtlMdlData extends S0v3DtlMdlDataSerialized {
   

						@Getter @Setter private char[] advsryMdlId = new char[6];


						@Getter @Setter private char[] mdlTmpltTyCd = new char[3];


						@Getter @Setter private char[] acctSvcTyCd = new char[2];


						@Getter @Setter private char[] advsryRsrchTyCd = new char[1];


						@Getter @Setter private char[] portObjCd = new char[2];


								@Getter @Setter private long minInvstAmt;


						@Getter @Setter private char[] begEffDate = new char[10];


						@Getter @Setter private char[] clsNewMnyInd = new char[1];


						@Getter @Setter private char[] rebalAtmptCnt = new char[4];


						@Getter @Setter private char[] advsryMdlNa = new char[80];


						@Getter @Setter private char[] advsrySubAdviseCd = new char[1];


						@Getter @Setter private char[] taxSnstvInd = new char[1];


						@Getter @Setter private char[] mdlSerTyCd = new char[4];


						@Getter @Setter private char[] advsryMdlVerCd = new char[5];


						@Getter @Setter private char[] advsryMdlBnchmkCd = new char[5];


						@Getter @Setter private char[] mdlThresTyCd = new char[1];


						@Getter @Setter private char[] endEffDa = new char[10];


						@Getter @Setter private char[] advsryMdlTyCd = new char[3];

	
	/**
	* Constructor for S0v3DtlMdlData
	**/
    public S0v3DtlMdlData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setAdvsryMdlId(fillSpace(6));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 6
             ,1
             );
								setMdlTmpltTyCd(fillSpace(3));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 10
             ,1
             );
								setAcctSvcTyCd(fillSpace(2));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 13
             ,1
             );
								setAdvsryRsrchTyCd(fillSpace(1));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 15
             ,1
             );
								setPortObjCd(fillSpace(2));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 18
             ,1
             );
								setMinInvstAmt(0L);
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 29
             ,1
             );
								setBegEffDate("0000000000".toCharArray());
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 40
             ,1
             );
								setClsNewMnyInd(fillSpace(1));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 42
             ,1
             );
								setRebalAtmptCnt("0000".toCharArray());
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 47
             ,1
             );
								setAdvsryMdlNa(pad(80," ".toCharArray(),' ',RIGHT_PAD));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 128
             ,1
             );
								setAdvsrySubAdviseCd(fillSpace(1));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 130
             ,1
             );
								setTaxSnstvInd(fillSpace(1));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 132
             ,1
             );
								setMdlSerTyCd(fillSpace(4));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 137
             ,1
             );
								setAdvsryMdlVerCd(fillSpace(5));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 143
             ,1
             );
								setAdvsryMdlBnchmkCd(fillSpace(5));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 149
             ,1
             );
								setMdlThresTyCd(fillSpace(1));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 151
             ,1
             );
								setEndEffDa(fillSpace(10));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 162
             ,1
             );
								setAdvsryMdlTyCd(fillSpace(3));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 166
             ,1
             );
    }





}
  
