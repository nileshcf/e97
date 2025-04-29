package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] thisProgram = new char[8];

						@Getter @Setter private char[] dt1ReqContainerName = new char[16];

								@Getter @Setter private int dt1ReqContainerLength;

						@Getter @Setter private char[] dt1RspContainerName = new char[16];

								@Getter @Setter private int dt1RspContainerLength;

						@Getter @Setter private char[] dt1RspContainerLayout = new char[8];

						@Getter @Setter private char[] dt1ClmContainerName = new char[16];

						@Getter @Setter private char[] dt1ClmContainerLayout = new char[8];

						@Getter @Setter private char[] dt1SrtContainerName = new char[16];

						@Getter @Setter private char[] dt1SrtContainerLayout = new char[8];

						@Getter @Setter private char[] stsContainerName = new char[16];

								@Getter @Setter private int stsContainerLength;

						@Getter @Setter private char[] stsContainerLayout = new char[8];

						@Getter @Setter private char[] topsIcn10 = Field.fillLowValue(10);

						@Getter @Setter private char[] defaultDate = Field.fillLowValue(80);

						@Getter @Setter private char[] defaultDateDb2 = new char[10];

						@Getter @Setter private char[] fmtYyyyMmDd = new char[10];

						@Getter @Setter private char[] fmtYyddd = new char[5];

						@Getter @Setter private char[] ceedays = new char[8];

						@Getter @Setter private char[] ceedate = new char[8];

								@Getter @Setter private long maxClaimsDefault;

								@Getter @Setter private long maxClaimsRequested;

								@Getter @Setter private int d5427dt1MaxRows;

								@Getter @Setter private int d5427dt1MaxClaims;

								@Getter @Setter private int fetchRowsetMax;

								@Getter @Setter private int fetchRowsRetrieved;

								@Getter @Setter private int totalRowsRetrieved;

								@Getter @Setter private int nbrSrtItems;

						@Getter @Setter private char[] payeeCode = Field.fillLowValue(1);

								@Getter @Setter private short headerCt;

						@Getter @Setter private char[] recType = new char[1];

						@Getter @Setter private char[] diffrntVerFoundSw = new char[1];

						@Getter @Setter private char[] claimSw = new char[1];

						@Getter @Setter private char[] infoLineInd = new char[1];

						@Getter @Setter private char[] clmHstEndOfFetchInd = new char[1];

						@Getter @Setter private char[] queryFilterInd = new char[1];

								@Getter @Setter private int dt1ClaimKeyMax;

								@Getter @Setter private int dt1ClaimKeyCnt;

								@Getter @Setter private short i;

						@Getter @Setter private char[] queryBaseCteStart = new char[376];

						@Getter @Setter private char[] queryBaseCteEnd = new char[140];

						@Getter @Setter private char[] queryFilterProviderTin = new char[55];

						@Getter @Setter private char[] queryFilterIcn = new char[46];

						@Getter @Setter private char[] queryFilterAuthStart = new char[318];

						@Getter @Setter private char[] queryFilterAuthEnd = new char[26];

						@Getter @Setter private char[] queryFilterAuthBaseEnd = new char[1];

						@Getter @Setter private char[] queryFilterDlgtStart = new char[194];

						@Getter @Setter private char[] queryFilterAuthCrit6 = new char[40];

						@Getter @Setter private char[] queryFilterDlgtCrit6 = new char[44];

						@Getter @Setter private char[] queryFilterSpiStart = new char[6];

						@Getter @Setter private char[] queryFilterSpiEnd = new char[1];

						@Getter @Setter private char[] queryFilterSpiPred1 = new char[43];

						@Getter @Setter private char[] queryFilterSpiPred2 = new char[47];

						@Getter @Setter private char[] queryFilterSpiPred3 = new char[47];

						@Getter @Setter private char[] queryFilterSpiPred4 = new char[47];

						@Getter @Setter private char[] queryFilterSpiPred5 = new char[47];

								@Getter @Setter private int sqlcode_Ws;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setThisProgram(("D5427DT1").toCharArray());
								setDt1ReqContainerName(("D5427DT1-REQ    ").toCharArray());
								setDt1RspContainerName(("D5427DT1-RSP    ").toCharArray());
								setDt1RspContainerLayout(("VYDT1RS1").toCharArray());
								setDt1ClmContainerName(("D5427DT1-CLM    ").toCharArray());
								setDt1ClmContainerLayout(("VYDT1CL1").toCharArray());
								setDt1SrtContainerName(("D5427DT1-SRT    ").toCharArray());
								setDt1SrtContainerLayout(("VYDT1SR1").toCharArray());
								setStsContainerName(("D5427DT1-STS    ").toCharArray());
								setStsContainerLayout(("VYRSPSTS").toCharArray());
								setDefaultDateDb2(("0001-01-01").toCharArray());
								setFmtYyyyMmDd(("YYYY-MM-DD").toCharArray());
								setFmtYyddd(("YYDDD").toCharArray());
								setCeedays(("CEEDAYS ").toCharArray());
								setCeedate(("CEEDATE ").toCharArray());
								setMaxClaimsDefault(108L);
								setD5427dt1MaxRows(800);
								setD5427dt1MaxClaims(0);
								setFetchRowsetMax(100);
								setFetchRowsRetrieved(0);
								setTotalRowsRetrieved(0);
								setHeaderCt((short)0);
								setRecType(fillSpace(1));
								setDiffrntVerFoundSw(fillSpace(1));
								setClaimSw(("N").toCharArray());
								setInfoLineInd(("N").toCharArray());
								setClmHstEndOfFetchInd(("N").toCharArray());
								setQueryFilterInd(("N").toCharArray());
								setDt1ClaimKeyMax(108);
								setQueryBaseCteStart(" WITH  CLM_HST_TABLE ( PARTN_ID,PARTN_VAL,PROC_DT,PROC_TM,ICN_SUFX_VERS_NBR,INVN_CTL_NBR,ICN_SUFX_CD)  AS ( SELECT DISTINCT REF.PARTN_ID,REF.PARTN_VAL,REF.PROC_DT,REF.PROC_TM,REF.ICN_SUFX_VERS_NBR,REF.INVN_CTL_NBR,REF.ICN_SUFX_CD FROM ADJD_CLMHST_DENORM_REF REF WHERE REF.POL_NBR = CAST(? AS CHAR(6))  AND REF.EE_ID = CAST(? AS CHAR(10)) AND REF.DEPN_NBR = CAST(? AS CHAR(2)) ".toCharArray());
								setQueryBaseCteEnd(" ORDER BY REF.PROC_DT DESC,REF.PROC_TM DESC,REF.ICN_SUFX_VERS_NBR DESC,REF.INVN_CTL_NBR DESC,REF.ICN_SUFX_CD DESC FETCH FIRST 500 ROWS ONLY)".toCharArray());
								setQueryFilterProviderTin((" AND SUBSTR(REF.PROV_TINSUFF,2,9) = CAST(? AS CHAR(9)) ").toCharArray());
								setQueryFilterIcn((" AND REF.INVN_CTL_NBR = CAST(? AS CHAR(10))   ").toCharArray());
								setQueryFilterAuthStart(" AND( (EXISTS (SELECT 1 FROM ADJD_CLMHST_DENORM_LN DLN1 WHERE REF.PARTN_ID = DLN1.PARTN_ID AND REF.PARTN_VAL = DLN1.PARTN_VAL AND REF.INVN_CTL_NBR = DLN1.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN1.ICN_SUFX_CD AND REF.PROC_DT = DLN1.PROC_DT AND REF.PROC_TM = DLN1.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN1.ICN_SUFX_VERS_NBR".toCharArray());
								setQueryFilterAuthEnd((" FETCH FIRST 1 ROWS ONLY))").toCharArray());
								setQueryFilterAuthBaseEnd((")").toCharArray());
								setQueryFilterDlgtStart(" OR (EXISTS (SELECT 1 FROM DE_AUTH_SRCH DLGT WHERE REF.PARTN_ID = DLGT.PARTN_ID AND REF.PARTN_VAL = DLGT.PARTN_VAL AND REF.INVN_CTL_NBR = DLGT.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLGT.ICN_SUFX_CD".toCharArray());
								setQueryFilterAuthCrit6((" AND DLN1.AUTH_NBR = CAST(? AS CHAR(10))").toCharArray());
								setQueryFilterDlgtCrit6((" AND DLGT.PRR_AUTH_NBR = CAST(? AS CHAR(50))").toCharArray());
								setQueryFilterSpiStart((" AND (").toCharArray());
								setQueryFilterSpiEnd((")").toCharArray());
								setQueryFilterSpiPred1(("UPPER(REF.SPI_CTGY_CD) = CAST(? AS CHAR(2))").toCharArray());
								setQueryFilterSpiPred2((" OR UPPER(REF.SPI_CTGY_CD) = CAST(? AS CHAR(2))").toCharArray());
								setQueryFilterSpiPred3((" OR UPPER(REF.SPI_CTGY_CD) = CAST(? AS CHAR(2))").toCharArray());
								setQueryFilterSpiPred4((" OR UPPER(REF.SPI_CTGY_CD) = CAST(? AS CHAR(2))").toCharArray());
								setQueryFilterSpiPred5((" OR UPPER(REF.SPI_CTGY_CD) = CAST(? AS CHAR(2))").toCharArray());
    }





}
  
