package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360AMcsIssSetl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360AMcsIssSetl extends X360AMcsIssSetlSerialized { 
   

								@Getter @Setter private int x360AMcsIssApprovedCntCr;

								@Getter @Setter private int x360AMcsIssApprovedCntDb;

								@Getter @Setter private int x360AMcsIssDeniedCntCr;

								@Getter @Setter private int x360AMcsIssDeniedCntDb;

								@Getter @Setter private long x360AMcsIssAmtCr;

								@Getter @Setter private long x360AMcsIssAmtDb;

								@Getter @Setter private long x360AMcsIssCnvRteBse;

								@Getter @Setter private int x360AMcsIssCurrCde;

								@Getter @Setter private long x360AMcsIssCnvRteLoc;


								@Getter @Setter private long x360AMcsIssSetlIca;

								@Getter @Setter private int x360AIssFinIfeeCnt;

								@Getter @Setter private int x360AIssNfIfeeCnt;

								@Getter @Setter private int x360AIssPctIfeeCnt;

								@Getter @Setter private int x360AIssNobillIfeeCnt;

								@Getter @Setter private long x360AIssIfeeAmtCr;

								@Getter @Setter private long x360AIssIfeeAmtDb;

								@Getter @Setter private long x360AIssOrigAmtCr;

								@Getter @Setter private long x360AIssOrigAmtDb;

								@Getter @Setter private long x360AIssNewAmtCr;

								@Getter @Setter private long x360AIssNewAmtDb;

								@Getter @Setter private long x360AIssAdjAmtCr;

								@Getter @Setter private long x360AIssAdjAmtDb;

								@Getter @Setter private long x360AIssbMccrAmtCr;

								@Getter @Setter private long x360AIssbMccrAmtDb;

								@Getter @Setter private long x360AIssbIccrAmtCr;

								@Getter @Setter private long x360AIssbIccrAmtDb;

								@Getter @Setter private int x360AIssA09ApprovedCntCr;

								@Getter @Setter private int x360AIssA09ApprovedCntDb;

								@Getter @Setter private long x360AIssA09ApprovedAmtCr;

								@Getter @Setter private long x360AIssA09ApprovedAmtDb;

								@Getter @Setter private long x360AIssBaseSetlAmtCr;

								@Getter @Setter private long x360AIssBaseSetlAmtDb;

								@Getter @Setter private long x360AIssbMccrA09Cr;

								@Getter @Setter private long x360AIssbMccrA09Db;

								@Getter @Setter private int x360FaVatIssNfCnt;

								@Getter @Setter private long x360FaVatIssFinAmt;

								@Getter @Setter private long x360FaVatIssNfAmt;

								@Getter @Setter private long x360FaVatIssFinVat;

								@Getter @Setter private long x360FaVatIssNfVat;
	
	/**
	* Constructor for X360AMcsIssSetl
	**/
    public X360AMcsIssSetl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360AMcsIssSetl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AMcsIssSetl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
