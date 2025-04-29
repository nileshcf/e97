package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360AMcsAcqSetl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360AMcsAcqSetl extends X360AMcsAcqSetlSerialized { 
   

								@Getter @Setter private int x360AMcsAcqApprovedCntCr;

								@Getter @Setter private int x360AMcsAcqApprovedCntDb;

								@Getter @Setter private int x360AMcsAcqDeniedCntCr;

								@Getter @Setter private int x360AMcsAcqDeniedCntDb;

								@Getter @Setter private long x360AMcsAcqAmtCr;

								@Getter @Setter private long x360AMcsAcqAmtDb;

								@Getter @Setter private long x360AMcsAcqCnvRteBse;

								@Getter @Setter private int x360AMcsAcqCurrCde;

								@Getter @Setter private long x360AMcsAcqCnvRteLoc;


								@Getter @Setter private long x360AMcsAcqSetlIca;

								@Getter @Setter private int x360AAcqFinIfeeCnt;

								@Getter @Setter private int x360AAcqNfIfeeCnt;

								@Getter @Setter private int x360AAcqPctIfeeCnt;

								@Getter @Setter private int x360AAcqNobillIfeeCnt;

								@Getter @Setter private long x360AAcqIfeeAmtCr;

								@Getter @Setter private long x360AAcqIfeeAmtDb;

								@Getter @Setter private long x360AAcqOrigAmtCr;

								@Getter @Setter private long x360AAcqOrigAmtDb;

								@Getter @Setter private long x360AAcqNewAmtCr;

								@Getter @Setter private long x360AAcqNewAmtDb;

								@Getter @Setter private long x360AAcqAdjAmtCr;

								@Getter @Setter private long x360AAcqAdjAmtDb;

								@Getter @Setter private long x360AAcqMccrAmtCrNotused;

								@Getter @Setter private long x360AAcqMccrAmtDbNotused;

								@Getter @Setter private long x360AAcqIccrAmtCrNotused;

								@Getter @Setter private long x360AAcqIccrAmtDbNotused;

								@Getter @Setter private int x360AAcqA09ApprovedCntCr;

								@Getter @Setter private int x360AAcqA09ApprovedCntDb;

								@Getter @Setter private long x360AAcqA09ApprovedAmtCr;

								@Getter @Setter private long x360AAcqA09ApprovedAmtDb;

								@Getter @Setter private long x360AAcqBaseSetlAmtCr;

								@Getter @Setter private long x360AAcqBaseSetlAmtDb;

								@Getter @Setter private long x360AAcqMccrA09CrNotused;

								@Getter @Setter private long x360AAcqMccrA09DbNotused;

								@Getter @Setter private int x360FaVatAcqNfCnt;

								@Getter @Setter private long x360FaVatAcqFinAmt;

								@Getter @Setter private long x360FaVatAcqNfAmt;

								@Getter @Setter private long x360FaVatAcqFinVat;

								@Getter @Setter private long x360FaVatAcqNfVat;
	
	/**
	* Constructor for X360AMcsAcqSetl
	**/
    public X360AMcsAcqSetl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360AMcsAcqSetl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AMcsAcqSetl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
