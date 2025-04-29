package com.cloudframe.app.ar640010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] taraxtkFetchStatus100 = new char[1];

						private char[] taraxtkConfigValues100 = new char[15];

						private char[] firstCall100 = new char[1];

						private char[] callAttachLoad100 = new char[1];

						private char[] requestStatus110 = new char[1];

						private char[] deleteApplOption110 = new char[1];

						private char[] broadcastStatus110 = new char[1];

						private char[] installStatus110 = new char[1];

						private char[] retrieveStatus110 = new char[1];

						private char[] resendStatus110 = new char[1];

						private char[] setupStatus110 = new char[1];

						private char[] setupReported110 = new char[1];

						private char[] transferPostStatus110 = new char[1];

						private char[] copyStatus110 = new char[1];

						private char[] dynamEndStatus110 = new char[1];

						private char[] gftConnectStatus110 = new char[1];

						private char[] jclDdStatus110 = new char[1];

						private char[] resultDisp110 = new char[1];

						private char[] resultFile110 = new char[1];

						private char[] sqlExecStatus110 = new char[1];

						private char[] sqlRetryOption110 = new char[1];

						private char[] renameApplStatus110 = new char[1];

						private char[] sourceDsnSpaceInd110 = new char[1];

						private char[] statusAssignmentOption110 = new char[1];

						private char[] logQueIndicator110 = new char[1];

						private char[] skipByteCountInd110 = new char[1];

						private char[] pgmMcdynam300 = new char[8];

						private char[] pgmMcwait300 = new char[8];

						private char[] pgmAr648010300 = new char[8];

								private int spaceCount310;

								private int tildeCount310;

								private int tildeCount1310;

								private int pipeCount310;

								private int scolCount310;

								private short binaryOne310;

								private short binaryFour310;

								private short binaryFive310;

								private short binaryThirteen310;

								private short binaryEighty310;

								private short binaryLrecl133310;

								private short minusOne310;

								private int binaryControlBlksz310;

								private int binarySysoutBlksz310;

								private int binaryListddpoBlksz310;

								private int binControlBlksz310;

								private int binSysoutBlksz310;

								private int binListddpoBlksz310;

								private short binLrecl133310;

								private short packedOne310;

								private int zonedTwentyeight310;

								private int zonedTwentynine310;

								private int zoned0080310;

								private short sqlSuccess330;

								private short sqlRowNotFound330;

								private short sqlCursorNotOpen330;

								private short sqlRowDuplicate330;

								private short sqlResourceUnavail330;

								private short sqlResourceLimit330;

								private short sqlWorkunitRollback330;

								private short sqlExecUnsuccessful330;

								private short sqlColUsed330;

								private short sqlColNull330;

								private int sqlSqlerrd3Deadlock330;

								private int sqlSqlerrd3Timeout330;

								private long maximumCyl360;

								private long maximumTrk360;

								private long maximumBlk360;

								private long maximumCylDeflt360;

								private long maximumTrkDeflt360;

								private long maximumBlkDeflt360;

								private int sourceRecords400;

								private long sourceBytes400;

								private int headerRecords400;

								private int headerBytes400;

								private int targetRecords400;

								private long targetBytes400;

								private int endpointsValid400;

								private int endpointsError400;

								private int endpointsListed400;

								private int allocateAttempts400;

								private short sqlRetryAttempts400;

								private int request410;

								private short error410;

						private char[] resultStartMsg603 = new char[36];

						private char[] resultEndMsg603 = new char[34];

						private char[] pendedMsg605 = new char[18];

						private char[] setupProblemCurrMsg606 = new char[25];

						private char[] setupProblemOrigMsg606 = new char[25];

						private char[] setupProblemBkupMsg606 = new char[25];

						private char[] setupProblemSwMsg606 = new char[25];

						private char[] setupProblemBulkMsg606 = new char[25];

						private char[] setupProblemXferMsg606 = new char[25];

						private char[] setupProblemCyclMsg606 = new char[25];

						private char[] setupProblemSeqMsg606 = new char[25];

						private char[] ftssFileNameMsg607 = new char[18];

						private char[] copySuccessGft608 = new char[39];

						private char[] copySuccessAppl608 = new char[47];

						private char[] renameSuccess608 = new char[68];

						private char[] renameOldMsg608 = new char[29];

						private char[] renameNewMsg608 = new char[29];

						private char[] warningText609 = new char[54];

						private char[] copybookErrorMsg610 = new char[53];

						private char[] copybookProgramIdMsg610 = new char[17];

						private char[] copybookVersionIdMsg610 = new char[17];

						private char[] parameterErrorMsg611 = new char[54];

						private char[] functionRequestMsg611 = new char[25];

						private char[] bulkIdMsg611 = new char[25];

						private char[] endptIdMsg611 = new char[25];

						private char[] deleteIndMsg611 = new char[25];

						private char[] cyclNumMsg611 = new char[25];

						private char[] listBroadcastDdMsg611 = new char[25];

						private char[] applicationDsnMsg611 = new char[25];

						private char[] gftRetrieveDsnMsg611 = new char[25];

						private char[] broadcastResultMsg611 = new char[25];

						private char[] procDateMsg611 = new char[25];

						private char[] assignLogicError619 = new char[39];

						private char[] controlParmMsg620 = new char[24];

						private char[] controlColsMsg620 = new char[104];

						private char[] controlInfoMsg620 = new char[24];

						private char[] controlDbid620 = new char[8];

						private char[] controlDbpkg620 = new char[16];

						private char[] controlHlqid620 = new char[4];

						private char[] sqlErrorMsg640 = new char[48];

						private char[] sqlMnfrmFileNamMsg640 = new char[19];

						private char[] sqlBulkIdMsg640 = new char[9];

						private char[] sqlEndptIdMsg640 = new char[10];

						private char[] sqlStatCdMsg640 = new char[9];

						private char[] sqlApplExitNamMsg640 = new char[15];

						private char[] sqlCyclNumMsg640 = new char[10];

						private char[] sqlCyclNumLoMsg640 = new char[15];

						private char[] sqlCyclNumHiMsg640 = new char[17];

						private char[] sqlLstUpdtUserIdMsg640 = new char[18];

						private char[] sqlLstUpdtTsMsg640 = new char[13];

						private char[] sqlBdioTxtMsg640 = new char[18];

						private char[] tarafplNotfndMsg641 = new char[46];

						private char[] tarafplSelectMsg641 = new char[42];

						private char[] tarafxsNotfndMsg642 = new char[46];

						private char[] tarafxsSelectMsg642 = new char[42];

						private char[] tarafxsUpdateMsg642 = new char[36];

						private char[] tarafxsInsertMsg642 = new char[36];

						private char[] tarafxsNostatMsg642 = new char[53];

						private char[] tarafxsCountMsg642 = new char[42];

						private char[] tarafxsExitMsg642 = new char[54];

						private char[] tarafxsOpenMsg642 = new char[41];

						private char[] tarafxsFetchMsg642 = new char[42];

						private char[] tarafxsCloseMsg642 = new char[42];

						private char[] tarafxaNotfndMsg643 = new char[46];

						private char[] tarafxaOpenMsg643 = new char[41];

						private char[] tarafxaFetchMsg643 = new char[42];

						private char[] tarafxaCloseMsg643 = new char[42];

						private char[] taraefpNotfndMsg644 = new char[46];

						private char[] taraefpOpenMsg644 = new char[41];

						private char[] taraefpFetchMsg644 = new char[42];

						private char[] taraefpCloseMsg644 = new char[42];

						private char[] taraefpSelectMsg644 = new char[42];

						private char[] taraefpBackupMsg644 = new char[53];

						private char[] taraeptNotfnd645 = new char[46];

						private char[] taraeptSelectMsg645 = new char[42];

						private char[] taraeptBackupMsg645 = new char[53];

						private char[] taraeptRouteMsg645 = new char[54];

						private char[] tarastsSelectMsg646 = new char[42];

						private char[] sqlcodeMsg647 = new char[9];

						private char[] dynamParmsMsg650 = new char[22];

						private char[] ar647OldDsnMsg661 = new char[14];

						private char[] ar647NewDsnMsg661 = new char[14];

						private char[] ar648ErrorMsg662 = new char[53];

						private char[] ar649ErrorMsg663 = new char[71];

						private char[] seqioErrorMsg670 = new char[52];

						private char[] seqioDdnameMsg670 = new char[28];

						private char[] seqioRequestMsg670 = new char[28];

						private char[] seqioSysidMsg670 = new char[28];

						private char[] seqioApplidMsg670 = new char[28];

						private char[] seqioDsnMsg670 = new char[28];

						private char[] seqioTapserMsg670 = new char[28];

						private char[] seqioVolserMsg670 = new char[28];

						private char[] seqioLabelMsg670 = new char[28];

						private char[] seqioRecfmMsg670 = new char[28];

						private char[] copyFailureGft680 = new char[39];

						private char[] copyFailureAppl680 = new char[47];

						private char[] renameFailure680 = new char[54];

						private char[] copyCountsMsg680 = new char[50];

						private char[] installPostExitInfo680 = new char[44];

						private char[] errorInfoMsg690 = new char[100];

						private char[] seeSystsprtMsg690 = new char[54];

						private char[] errorConsMsg692 = new char[80];

						private char[] errorConsMsgHdr692 = new char[55];

						private char[] omnibusAlertFlag820 = new char[1];

						private char[] statRefId810 = new char[4];

						private char[] errorResponse900 = new char[4];

						private char[] errorMessage900 = new char[50];

						private char[] mcinfoProgramId = new char[8];

								private short mcinfoReturnCode;

						private char[] db85102cDb2CafLoadDsnali = new char[8];

						private char[] db85102cDb2BatchErrorRtn = new char[8];

						private char[] sqlTemp = Field.fillLowValue(128);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTaraxtkFetchStatus100(("Y").toCharArray());
								setTaraxtkConfigValues100(fillSpace(15));
								setFirstCall100(("Y").toCharArray());
								setCallAttachLoad100(("N").toCharArray());
								setRequestStatus110(("+").toCharArray());
								setDeleteApplOption110(("N").toCharArray());
								setBroadcastStatus110(("I").toCharArray());
								setInstallStatus110(("I").toCharArray());
								setRetrieveStatus110(("N").toCharArray());
								setResendStatus110(("Y").toCharArray());
								setSetupStatus110(("0").toCharArray());
								setSetupReported110(("N").toCharArray());
								setTransferPostStatus110(fillSpace(1));
								setCopyStatus110(("+").toCharArray());
								setDynamEndStatus110(("N").toCharArray());
								setGftConnectStatus110(("I").toCharArray());
								setJclDdStatus110(("M").toCharArray());
								setResultDisp110(("O").toCharArray());
								setResultFile110(("I").toCharArray());
								setSqlExecStatus110(("S").toCharArray());
								setSqlRetryOption110(("E").toCharArray());
								setRenameApplStatus110(("I").toCharArray());
								setSourceDsnSpaceInd110(("N").toCharArray());
								setStatusAssignmentOption110(("A").toCharArray());
								setLogQueIndicator110(("E").toCharArray());
								setSkipByteCountInd110(("N").toCharArray());
								setPgmMcdynam300(("MCDYNAM ").toCharArray());
								setPgmMcwait300(("MCWAIT  ").toCharArray());
								setPgmAr648010300(("AR648010").toCharArray());
								setSpaceCount310(0);
								setTildeCount310(0);
								setTildeCount1310(0);
								setPipeCount310(0);
								setScolCount310(0);
								setBinaryOne310((short)1);
								setBinaryFour310((short)4);
								setBinaryFive310((short)5);
								setBinaryThirteen310((short)13);
								setBinaryEighty310((short)80);
								setBinaryLrecl133310((short)133);
								setMinusOne310((short)-1);
								setBinaryControlBlksz310(24000);
								setBinarySysoutBlksz310(27930);
								setBinaryListddpoBlksz310(23440);
								setBinControlBlksz310(24000);
								setBinSysoutBlksz310(27930);
								setBinListddpoBlksz310(23440);
								setBinLrecl133310((short)133);
								setPackedOne310((short)1);
								setZonedTwentyeight310(28);
								setZonedTwentynine310(29);
								setZoned0080310(80);
								setSqlSuccess330((short)0);
								setSqlRowNotFound330((short)100);
								setSqlCursorNotOpen330((short)-501);
								setSqlRowDuplicate330((short)-803);
								setSqlResourceUnavail330((short)-904);
								setSqlResourceLimit330((short)-905);
								setSqlWorkunitRollback330((short)-911);
								setSqlExecUnsuccessful330((short)-913);
								setSqlColUsed330((short)0);
								setSqlColNull330((short)-1);
								setSqlSqlerrd3Deadlock330(13172872);
								setSqlSqlerrd3Timeout330(13172878);
								setMaximumCyl360(2000L);
								setMaximumTrk360(30000L);
								setMaximumBlk360(1679880000L);
								setMaximumCylDeflt360(2000L);
								setMaximumTrkDeflt360(30000L);
								setMaximumBlkDeflt360(1679880000L);
								setSourceRecords400(0);
								setSourceBytes400(0L);
								setHeaderRecords400(0);
								setHeaderBytes400(0);
								setTargetRecords400(0);
								setTargetBytes400(0L);
								setEndpointsValid400(0);
								setEndpointsError400(0);
								setEndpointsListed400(0);
								setAllocateAttempts400(0);
								setSqlRetryAttempts400((short)0);
								setRequest410(0);
								setError410((short)0);
								setResultStartMsg603(("0030-ENDPOINT STATUS DISPLAY - START").toCharArray());
								setResultEndMsg603(("0039-ENDPOINT STATUS DISPLAY - END").toCharArray());
								setPendedMsg605(("0050-FILE PENDED: ").toCharArray());
								setSetupProblemCurrMsg606(("0061-CURRENT ENDPOINT  : ").toCharArray());
								setSetupProblemOrigMsg606(("0062-ORIGINAL ENDPOINT : ").toCharArray());
								setSetupProblemBkupMsg606(("0063-BACKUP ENDPOINT   : ").toCharArray());
								setSetupProblemSwMsg606(("0064-BACKUP SWITCH     : ").toCharArray());
								setSetupProblemBulkMsg606(("0065-BULK TYPE         : ").toCharArray());
								setSetupProblemXferMsg606(("0066-TRANSFER METHOD   : ").toCharArray());
								setSetupProblemCyclMsg606(("0067-CYCLE NBR         : ").toCharArray());
								setSetupProblemSeqMsg606(("0068-FTSS SEQUENCE NBR : ").toCharArray());
								setFtssFileNameMsg607(("0070-FTSS FILEID: ").toCharArray());
								setCopySuccessGft608(("0080-COPY SUCCESSFUL - GFT FILE CREATED").toCharArray());
								setCopySuccessAppl608(("0080-COPY SUCCESSFUL - APPLICATION FILE CREATED").toCharArray());
								setRenameSuccess608("0080-RENAME SUCCESSFUL - APPLICATION FILE RENAMED TO CREATE GFT FILE".toCharArray());
								setRenameOldMsg608(("0082-SOURCE APPLICATION DSN: ").toCharArray());
								setRenameNewMsg608(("0083-TARGET GFT RENAMED DSN: ").toCharArray());
								setWarningText609(("INBOUND FILE DOES NOT NEED TO BE UNLOADED             ").toCharArray());
								setCopybookErrorMsg610(("1000-COPYBOOK ERROR DETECTED - SEE FOLLOWING MESSAGES").toCharArray());
								setCopybookProgramIdMsg610(("1001-PROGRAM-ID: ").toCharArray());
								setCopybookVersionIdMsg610(("1001-VERSION-ID: ").toCharArray());
								setParameterErrorMsg611(("1010-PARAMETER ERROR DETECTED - SEE FOLLOWING MESSAGES").toCharArray());
								setFunctionRequestMsg611(("1011-FUNCTION-REQUEST  : ").toCharArray());
								setBulkIdMsg611(("1011-BULK-ID           : ").toCharArray());
								setEndptIdMsg611(("1011-ENDPT-ID          : ").toCharArray());
								setDeleteIndMsg611(("1011-DELETE-IND        : ").toCharArray());
								setCyclNumMsg611(("1011-CYCL-NUM          : ").toCharArray());
								setListBroadcastDdMsg611(("1011-LIST-BROADCAST-DD : ").toCharArray());
								setApplicationDsnMsg611(("1011-APPLICATION-DSN   : ").toCharArray());
								setGftRetrieveDsnMsg611(("1011-GFT-RETRIEVE-DSN  : ").toCharArray());
								setBroadcastResultMsg611(("1011-BROADCAST-RESULT  : ").toCharArray());
								setProcDateMsg611(("1011-PROC-DATE         : ").toCharArray());
								setAssignLogicError619(("1019-TARAFXS STATUS VALUES UNDETERMINED").toCharArray());
								setControlParmMsg620(("2000-CONTROL PARAMETER: ").toCharArray());
								setControlColsMsg620("2001-CONTROL PARM COLS: 1...5...10...15...20...25...30...35...40...45...50...55...60...65...70...75...80".toCharArray());
								setControlInfoMsg620(("2002-CONTROL PARM INFO: ").toCharArray());
								setControlDbid620(("--DBID--").toCharArray());
								setControlDbpkg620(("---PACKAGESET---").toCharArray());
								setControlHlqid620(("-HQ-").toCharArray());
								setSqlErrorMsg640(("4000-SQL ERROR DETECTED - SEE FOLLOWING MESSAGES").toCharArray());
								setSqlMnfrmFileNamMsg640(("MC_MNFRM_FILE_NAM: ").toCharArray());
								setSqlBulkIdMsg640(("BULK_ID: ").toCharArray());
								setSqlEndptIdMsg640(("ENDPT_ID: ").toCharArray());
								setSqlStatCdMsg640(("STAT_CD: ").toCharArray());
								setSqlApplExitNamMsg640(("APPL_EXIT_NAM: ").toCharArray());
								setSqlCyclNumMsg640(("CYCL_NUM: ").toCharArray());
								setSqlCyclNumLoMsg640(("CYCL_NUM (LO): ").toCharArray());
								setSqlCyclNumHiMsg640((", CYCL_NUM (HI): ").toCharArray());
								setSqlLstUpdtUserIdMsg640(("LST_UPDT_USER_ID: ").toCharArray());
								setSqlLstUpdtTsMsg640(("LST_UPDT_TS: ").toCharArray());
								setSqlBdioTxtMsg640(("MCIBDIO_PARM_TXT: ").toCharArray());
								setTarafplNotfndMsg641(("4010-SQL TARAFPL \"SELECT NOT FOUND\" KEY DATA: ").toCharArray());
								setTarafplSelectMsg641(("4014-SQL TARAFPL \"SELECT ERROR\" KEY DATA: ").toCharArray());
								setTarafxsNotfndMsg642(("4020-SQL TARAFXS \"SELECT NOT FOUND\" KEY DATA: ").toCharArray());
								setTarafxsSelectMsg642(("4021-SQL TARAFXS \"SELECT ERROR\" KEY DATA: ").toCharArray());
								setTarafxsUpdateMsg642(("4022-SQL TARAFXS \"UPDATE\" KEY DATA: ").toCharArray());
								setTarafxsInsertMsg642(("4023-SQL TARAFXS \"INSERT\" KEY DATA: ").toCharArray());
								setTarafxsNostatMsg642(("4024-SQL TARAFXS \"SELECT STATUS NOT FOUND\" KEY DATA: ").toCharArray());
								setTarafxsCountMsg642(("4025-SQL TARAFXS \"SELECT COUNT\" KEY DATA: ").toCharArray());
								setTarafxsExitMsg642(("4026-SQL TARAFXS STATUS ROW \"EXIT\" INFO ERR KEY DATA: ").toCharArray());
								setTarafxsOpenMsg642(("4027-SQL TARAFXS \"OPEN CURSOR\" KEY DATA: ").toCharArray());
								setTarafxsFetchMsg642(("4028-SQL TARAFXS \"FETCH CURSOR\" KEY DATA: ").toCharArray());
								setTarafxsCloseMsg642(("4029-SQL TARAFXS \"CLOSE CURSOR\" KEY DATA: ").toCharArray());
								setTarafxaNotfndMsg643(("4030-SQL TARAFXA \"SELECT NOT FOUND\" KEY DATA: ").toCharArray());
								setTarafxaOpenMsg643(("4037-SQL TARAFXA \"OPEN CURSOR\" KEY DATA: ").toCharArray());
								setTarafxaFetchMsg643(("4038-SQL TARAFXA \"FETCH CURSOR\" KEY DATA: ").toCharArray());
								setTarafxaCloseMsg643(("4039-SQL TARAFXA \"CLOSE CURSOR\" KEY DATA: ").toCharArray());
								setTaraefpNotfndMsg644(("4040-SQL TARAEFP \"SELECT NOT FOUND\" KEY DATA: ").toCharArray());
								setTaraefpOpenMsg644(("4041-SQL TARAEFP \"OPEN CURSOR\" KEY DATA: ").toCharArray());
								setTaraefpFetchMsg644(("4042-SQL TARAEFP \"FETCH CURSOR\" KEY DATA: ").toCharArray());
								setTaraefpCloseMsg644(("4043-SQL TARAEPF \"CLOSE CURSOR\" KEY DATA: ").toCharArray());
								setTaraefpSelectMsg644(("4044-SQL TARAEFP \"SELECT ERROR\" KEY DATA: ").toCharArray());
								setTaraefpBackupMsg644(("4045-SQL TARAEFP BACKUP \"SELECT NOT FOUND\" KEY DATA: ").toCharArray());
								setTaraeptNotfnd645(("4050-SQL TARAEPT \"SELECT NOT FOUND\" KEY DATA: ").toCharArray());
								setTaraeptSelectMsg645(("4054-SQL TARAEPT \"SELECT ERROR\" KEY DATA: ").toCharArray());
								setTaraeptBackupMsg645(("4055-SQL TARAEPT BACKUP \"SELECT NOT FOUND\" KEY DATA: ").toCharArray());
								setTaraeptRouteMsg645(("4059-SQL TARAEPT \"SELECT\" RTE-TO-HUB ERROR, KEY DATA: ").toCharArray());
								setTarastsSelectMsg646(("4021-SQL TARASTS \"SELECT ERROR\" KEY DATA: ").toCharArray());
								setSqlcodeMsg647(("SQLCODE: ").toCharArray());
								setDynamParmsMsg650(("5002-MCDYNAM - PARMS: ").toCharArray());
								setAr647OldDsnMsg661(("6011-OLD DSN: ").toCharArray());
								setAr647NewDsnMsg661(("6012-NEW DSN: ").toCharArray());
								setAr648ErrorMsg662(("6020-ERROR ENCOUNTERED IN AR648010 REPORT SUB-PROGRAM").toCharArray());
								setAr649ErrorMsg663("6030-ERROR ENCOUNTERED IN AR649010 (TARAEFP FTSS CONFIGURATION UTILITY)".toCharArray());
								setSeqioErrorMsg670(("7000-MCSEQIO ERROR DETECTED - SEE FOLLOWING MESSAGES").toCharArray());
								setSeqioDdnameMsg670(("7002-MCISEQIO-DDNAME      : ").toCharArray());
								setSeqioRequestMsg670(("7002-MCISEQIO-REQUEST     : ").toCharArray());
								setSeqioSysidMsg670(("7002-MCISEQIO-SYSID       : ").toCharArray());
								setSeqioApplidMsg670(("7002-MCISEQIO-APPLID      : ").toCharArray());
								setSeqioDsnMsg670(("7002-MCISEQIO-DSN         : ").toCharArray());
								setSeqioTapserMsg670(("7002-MCISEQIO-TAPSER      : ").toCharArray());
								setSeqioVolserMsg670(("7002-MCISEQIO-VOLSER      : ").toCharArray());
								setSeqioLabelMsg670(("7002-MCISEQIO-LABEL       : ").toCharArray());
								setSeqioRecfmMsg670(("7002-MCISEQIO-RECFM       : ").toCharArray());
								setCopyFailureGft680(("8000-COPY TO CREATE GFT FILE HAS FAILED").toCharArray());
								setCopyFailureAppl680(("8000-COPY TO CREATE APPLICATION FILE HAS FAILED").toCharArray());
								setRenameFailure680(("8000-RENAME OF APPLICATION FILE TO GFT FILE HAS FAILED").toCharArray());
								setCopyCountsMsg680(("8001-COPY SOURCE COUNTS DO NOT MATCH TARGET COUNTS").toCharArray());
								setInstallPostExitInfo680(("8100-INSTALL POST-EXIT FILE EXISTING INFO:  ").toCharArray());
								setErrorInfoMsg690(pad(100," ".toCharArray(),' ',RIGHT_PAD));
								setSeeSystsprtMsg690(("9009-SEE SYSTSPRT SYSOUT DD FOR ADDITIONAL INFORMATION").toCharArray());
								setErrorConsMsg692(pad(80," ".toCharArray(),' ',RIGHT_PAD));
								setErrorConsMsgHdr692(fillSpace(55));
								setOmnibusAlertFlag820(("N").toCharArray());
								setStatRefId810(fillLowValue(4));
								setErrorResponse900(("0000").toCharArray());
								setErrorMessage900(fillSpace(50));
								setMcinfoProgramId(("MCINFO  ").toCharArray());
								setMcinfoReturnCode((short)0);
								setDb85102cDb2CafLoadDsnali(("DB2LDCAF").toCharArray());
								setDb85102cDb2BatchErrorRtn(("DB200020").toCharArray());
    }


 

	/**
	 *	Returns the value of taraxtkFetchStatus100
	 *	@return taraxtkFetchStatus100
	 */
   public char[] getTaraxtkFetchStatus100() throws CFException{
   		return taraxtkFetchStatus100;
   }

  
	/**
	*  set variable taraxtkFetchStatus100
	*  Corresponding COBOL Variable is 100-TARAXTK-FETCH-STATUS
	*  @param value
	**/
   public void setTaraxtkFetchStatus100(char[] value) {
       value = checkTaraxtkFetchStatus100Constraints(value);
       arraycopy(value,0,taraxtkFetchStatus100,0,value.length);
   } 
	public void setTaraxtkFetchStatus100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,taraxtkFetchStatus100,0,beginIndex + endIndex);
   }
	char[] taraxtkSuccess8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isTaraxtkSuccess88100()
	 *	@return  Returns true if isTaraxtkSuccess88100() is "Y"
	 */
   public boolean isTaraxtkSuccess88100() throws CFException {
      return (  compareChars( getTaraxtkFetchStatus100() , taraxtkSuccess8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setTaraxtkSuccess88100True() {  			
    	setTaraxtkFetchStatus100( taraxtkSuccess8810088Value);
   	}
	char[] taraxtkFailure8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isTaraxtkFailure88100()
	 *	@return  Returns true if isTaraxtkFailure88100() is "N"
	 */
   public boolean isTaraxtkFailure88100() throws CFException {
      return (  compareChars( getTaraxtkFetchStatus100() , taraxtkFailure8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setTaraxtkFailure88100True() {  			
    	setTaraxtkFetchStatus100( taraxtkFailure8810088Value);
   	}
	/**
	 *	Returns the value of taraxtkConfigValues100
	 *	@return taraxtkConfigValues100
	 */
   public char[] getTaraxtkConfigValues100() throws CFException{
   		return taraxtkConfigValues100;
   }

  
	/**
	*  set variable taraxtkConfigValues100
	*  Corresponding COBOL Variable is 100-TARAXTK-CONFIG-VALUES
	*  @param value
	**/
   public void setTaraxtkConfigValues100(char[] value) {
       value = checkTaraxtkConfigValues100Constraints(value);
       arraycopy(value,0,taraxtkConfigValues100,0,value.length);
   } 
	public void setTaraxtkConfigValues100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,taraxtkConfigValues100,0,beginIndex + endIndex);
   }
	static java.util.Set<String> configVals8810088Value = new java.util.HashSet<>();
static { 
	configVals8810088Value.add( "CTRLBLKSZ      ");
	configVals8810088Value.add( "SYSOUTBLKSZ    ");
	configVals8810088Value.add( "LISTDDBLKSZ    ");
	configVals8810088Value.add( "MAXCYL         ");
	configVals8810088Value.add( "MAXTRK         ");
	configVals8810088Value.add( "MAXBLK         ");
	configVals8810088Value.add( "CPYATTMPTS     ");
	configVals8810088Value.add( "CPYINTRVL      ");
	configVals8810088Value.add( "DLTATTMPTS     ");
	configVals8810088Value.add( "DLTINTRVL      ");
	configVals8810088Value.add( "SQLATTMPTS     ");
	configVals8810088Value.add( "SQLINTRVL      ");
	configVals8810088Value.add( "SYSOUTLRECL    ");
} 

	/**
	 *	Test condition "CTRLBLKSZ" "SYSOUTBLKSZ" "LISTDDBLKSZ" "MAXCYL" "MAXTRK" "MAXBLK" "CPYATTMPTS" "CPYINTRVL" "DLTATTMPTS" "DLTINTRVL" "SQLATTMPTS" "SQLINTRVL" "SYSOUTLRECL" for isConfigVals88100()
	 *	@return  Returns true if isConfigVals88100() is "CTRLBLKSZ" "SYSOUTBLKSZ" "LISTDDBLKSZ" "MAXCYL" "MAXTRK" "MAXBLK" "CPYATTMPTS" "CPYINTRVL" "DLTATTMPTS" "DLTINTRVL" "SQLATTMPTS" "SQLINTRVL" "SYSOUTLRECL"
	 */
   public boolean isConfigVals88100() throws CFException {
      return   configVals8810088Value.contains(String.valueOf(getTaraxtkConfigValues100()));
   }


	/**
	*  set values "CTRLBLKSZ" "SYSOUTBLKSZ" "LISTDDBLKSZ" "MAXCYL" "MAXTRK" "MAXBLK" "CPYATTMPTS" "CPYINTRVL" "DLTATTMPTS" "DLTINTRVL" "SQLATTMPTS" "SQLINTRVL" "SYSOUTLRECL"
	*/
   	public void setConfigVals88100True() {  			
    	  setTaraxtkConfigValues100(configVals8810088Value.iterator().next().toCharArray());
   	}
	char[] configCtrlblksz8810088Value = "CTRLBLKSZ      ".toCharArray();
	/**
	 *	Test condition "CTRLBLKSZ" for isConfigCtrlblksz88100()
	 *	@return  Returns true if isConfigCtrlblksz88100() is "CTRLBLKSZ"
	 */
   public boolean isConfigCtrlblksz88100() throws CFException {
      return (  compareChars( getTaraxtkConfigValues100() , configCtrlblksz8810088Value)  == 0  );
   }


	/**
	*  set values "CTRLBLKSZ"
	*/
   	public void setConfigCtrlblksz88100True() {  			
    	setTaraxtkConfigValues100( configCtrlblksz8810088Value);
   	}
	char[] configSysoutblksz8810088Value = "SYSOUTBLKSZ    ".toCharArray();
	/**
	 *	Test condition "SYSOUTBLKSZ" for isConfigSysoutblksz88100()
	 *	@return  Returns true if isConfigSysoutblksz88100() is "SYSOUTBLKSZ"
	 */
   public boolean isConfigSysoutblksz88100() throws CFException {
      return (  compareChars( getTaraxtkConfigValues100() , configSysoutblksz8810088Value)  == 0  );
   }


	/**
	*  set values "SYSOUTBLKSZ"
	*/
   	public void setConfigSysoutblksz88100True() {  			
    	setTaraxtkConfigValues100( configSysoutblksz8810088Value);
   	}
	char[] configListddblksz8810088Value = "LISTDDBLKSZ    ".toCharArray();
	/**
	 *	Test condition "LISTDDBLKSZ" for isConfigListddblksz88100()
	 *	@return  Returns true if isConfigListddblksz88100() is "LISTDDBLKSZ"
	 */
   public boolean isConfigListddblksz88100() throws CFException {
      return (  compareChars( getTaraxtkConfigValues100() , configListddblksz8810088Value)  == 0  );
   }


	/**
	*  set values "LISTDDBLKSZ"
	*/
   	public void setConfigListddblksz88100True() {  			
    	setTaraxtkConfigValues100( configListddblksz8810088Value);
   	}
	char[] configMaxcyl8810088Value = "MAXCYL         ".toCharArray();
	/**
	 *	Test condition "MAXCYL" for isConfigMaxcyl88100()
	 *	@return  Returns true if isConfigMaxcyl88100() is "MAXCYL"
	 */
   public boolean isConfigMaxcyl88100() throws CFException {
      return (  compareChars( getTaraxtkConfigValues100() , configMaxcyl8810088Value)  == 0  );
   }


	/**
	*  set values "MAXCYL"
	*/
   	public void setConfigMaxcyl88100True() {  			
    	setTaraxtkConfigValues100( configMaxcyl8810088Value);
   	}
	char[] configMaxtrk8810088Value = "MAXTRK         ".toCharArray();
	/**
	 *	Test condition "MAXTRK" for isConfigMaxtrk88100()
	 *	@return  Returns true if isConfigMaxtrk88100() is "MAXTRK"
	 */
   public boolean isConfigMaxtrk88100() throws CFException {
      return (  compareChars( getTaraxtkConfigValues100() , configMaxtrk8810088Value)  == 0  );
   }


	/**
	*  set values "MAXTRK"
	*/
   	public void setConfigMaxtrk88100True() {  			
    	setTaraxtkConfigValues100( configMaxtrk8810088Value);
   	}
	char[] configMaxblk8810088Value = "MAXBLK         ".toCharArray();
	/**
	 *	Test condition "MAXBLK" for isConfigMaxblk88100()
	 *	@return  Returns true if isConfigMaxblk88100() is "MAXBLK"
	 */
   public boolean isConfigMaxblk88100() throws CFException {
      return (  compareChars( getTaraxtkConfigValues100() , configMaxblk8810088Value)  == 0  );
   }


	/**
	*  set values "MAXBLK"
	*/
   	public void setConfigMaxblk88100True() {  			
    	setTaraxtkConfigValues100( configMaxblk8810088Value);
   	}
	char[] configCpyattmpts8810088Value = "CPYATTMPTS     ".toCharArray();
	/**
	 *	Test condition "CPYATTMPTS" for isConfigCpyattmpts88100()
	 *	@return  Returns true if isConfigCpyattmpts88100() is "CPYATTMPTS"
	 */
   public boolean isConfigCpyattmpts88100() throws CFException {
      return (  compareChars( getTaraxtkConfigValues100() , configCpyattmpts8810088Value)  == 0  );
   }


	/**
	*  set values "CPYATTMPTS"
	*/
   	public void setConfigCpyattmpts88100True() {  			
    	setTaraxtkConfigValues100( configCpyattmpts8810088Value);
   	}
	char[] configCpyintrvl8810088Value = "CPYINTRVL      ".toCharArray();
	/**
	 *	Test condition "CPYINTRVL" for isConfigCpyintrvl88100()
	 *	@return  Returns true if isConfigCpyintrvl88100() is "CPYINTRVL"
	 */
   public boolean isConfigCpyintrvl88100() throws CFException {
      return (  compareChars( getTaraxtkConfigValues100() , configCpyintrvl8810088Value)  == 0  );
   }


	/**
	*  set values "CPYINTRVL"
	*/
   	public void setConfigCpyintrvl88100True() {  			
    	setTaraxtkConfigValues100( configCpyintrvl8810088Value);
   	}
	char[] configDltattmpts8810088Value = "DLTATTMPTS     ".toCharArray();
	/**
	 *	Test condition "DLTATTMPTS" for isConfigDltattmpts88100()
	 *	@return  Returns true if isConfigDltattmpts88100() is "DLTATTMPTS"
	 */
   public boolean isConfigDltattmpts88100() throws CFException {
      return (  compareChars( getTaraxtkConfigValues100() , configDltattmpts8810088Value)  == 0  );
   }


	/**
	*  set values "DLTATTMPTS"
	*/
   	public void setConfigDltattmpts88100True() {  			
    	setTaraxtkConfigValues100( configDltattmpts8810088Value);
   	}
	char[] configDltintrvl8810088Value = "DLTINTRVL      ".toCharArray();
	/**
	 *	Test condition "DLTINTRVL" for isConfigDltintrvl88100()
	 *	@return  Returns true if isConfigDltintrvl88100() is "DLTINTRVL"
	 */
   public boolean isConfigDltintrvl88100() throws CFException {
      return (  compareChars( getTaraxtkConfigValues100() , configDltintrvl8810088Value)  == 0  );
   }


	/**
	*  set values "DLTINTRVL"
	*/
   	public void setConfigDltintrvl88100True() {  			
    	setTaraxtkConfigValues100( configDltintrvl8810088Value);
   	}
	char[] configSqlattmpts8810088Value = "SQLATTMPTS     ".toCharArray();
	/**
	 *	Test condition "SQLATTMPTS" for isConfigSqlattmpts88100()
	 *	@return  Returns true if isConfigSqlattmpts88100() is "SQLATTMPTS"
	 */
   public boolean isConfigSqlattmpts88100() throws CFException {
      return (  compareChars( getTaraxtkConfigValues100() , configSqlattmpts8810088Value)  == 0  );
   }


	/**
	*  set values "SQLATTMPTS"
	*/
   	public void setConfigSqlattmpts88100True() {  			
    	setTaraxtkConfigValues100( configSqlattmpts8810088Value);
   	}
	char[] configSqlintrvl8810088Value = "SQLINTRVL      ".toCharArray();
	/**
	 *	Test condition "SQLINTRVL" for isConfigSqlintrvl88100()
	 *	@return  Returns true if isConfigSqlintrvl88100() is "SQLINTRVL"
	 */
   public boolean isConfigSqlintrvl88100() throws CFException {
      return (  compareChars( getTaraxtkConfigValues100() , configSqlintrvl8810088Value)  == 0  );
   }


	/**
	*  set values "SQLINTRVL"
	*/
   	public void setConfigSqlintrvl88100True() {  			
    	setTaraxtkConfigValues100( configSqlintrvl8810088Value);
   	}
	char[] configSysoutlrecl8810088Value = "SYSOUTLRECL    ".toCharArray();
	/**
	 *	Test condition "SYSOUTLRECL" for isConfigSysoutlrecl88100()
	 *	@return  Returns true if isConfigSysoutlrecl88100() is "SYSOUTLRECL"
	 */
   public boolean isConfigSysoutlrecl88100() throws CFException {
      return (  compareChars( getTaraxtkConfigValues100() , configSysoutlrecl8810088Value)  == 0  );
   }


	/**
	*  set values "SYSOUTLRECL"
	*/
   	public void setConfigSysoutlrecl88100True() {  			
    	setTaraxtkConfigValues100( configSysoutlrecl8810088Value);
   	}
	/**
	 *	Returns the value of firstCall100
	 *	@return firstCall100
	 */
   public char[] getFirstCall100() throws CFException{
   		return firstCall100;
   }

  
	/**
	*  set variable firstCall100
	*  Corresponding COBOL Variable is 100-FIRST-CALL
	*  @param value
	**/
   public void setFirstCall100(char[] value) {
       value = checkFirstCall100Constraints(value);
       arraycopy(value,0,firstCall100,0,value.length);
   } 
	public void setFirstCall100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,firstCall100,0,beginIndex + endIndex);
   }
	char[] firstCallToModule8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isFirstCallToModule88100()
	 *	@return  Returns true if isFirstCallToModule88100() is "Y"
	 */
   public boolean isFirstCallToModule88100() throws CFException {
      return (  compareChars( getFirstCall100() , firstCallToModule8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setFirstCallToModule88100True() {  			
    	setFirstCall100( firstCallToModule8810088Value);
   	}
	char[] firstCallCompleted8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isFirstCallCompleted88100()
	 *	@return  Returns true if isFirstCallCompleted88100() is "N"
	 */
   public boolean isFirstCallCompleted88100() throws CFException {
      return (  compareChars( getFirstCall100() , firstCallCompleted8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setFirstCallCompleted88100True() {  			
    	setFirstCall100( firstCallCompleted8810088Value);
   	}
	/**
	 *	Returns the value of callAttachLoad100
	 *	@return callAttachLoad100
	 */
   public char[] getCallAttachLoad100() throws CFException{
   		return callAttachLoad100;
   }

  
	/**
	*  set variable callAttachLoad100
	*  Corresponding COBOL Variable is 100-CALL-ATTACH-LOAD
	*  @param value
	**/
   public void setCallAttachLoad100(char[] value) {
       value = checkCallAttachLoad100Constraints(value);
       arraycopy(value,0,callAttachLoad100,0,value.length);
   } 
	public void setCallAttachLoad100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,callAttachLoad100,0,beginIndex + endIndex);
   }
	char[] callAttachNotLoaded8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isCallAttachNotLoaded88100()
	 *	@return  Returns true if isCallAttachNotLoaded88100() is "N"
	 */
   public boolean isCallAttachNotLoaded88100() throws CFException {
      return (  compareChars( getCallAttachLoad100() , callAttachNotLoaded8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setCallAttachNotLoaded88100True() {  			
    	setCallAttachLoad100( callAttachNotLoaded8810088Value);
   	}
	char[] callAttachLoaded8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isCallAttachLoaded88100()
	 *	@return  Returns true if isCallAttachLoaded88100() is "Y"
	 */
   public boolean isCallAttachLoaded88100() throws CFException {
      return (  compareChars( getCallAttachLoad100() , callAttachLoaded8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setCallAttachLoaded88100True() {  			
    	setCallAttachLoad100( callAttachLoaded8810088Value);
   	}
	/**
	 *	Returns the value of requestStatus110
	 *	@return requestStatus110
	 */
   public char[] getRequestStatus110() throws CFException{
   		return requestStatus110;
   }

  
	/**
	*  set variable requestStatus110
	*  Corresponding COBOL Variable is 110-REQUEST-STATUS
	*  @param value
	**/
   public void setRequestStatus110(char[] value) {
       value = checkRequestStatus110Constraints(value);
       arraycopy(value,0,requestStatus110,0,value.length);
   } 
	public void setRequestStatus110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,requestStatus110,0,beginIndex + endIndex);
   }
	char[] requestSuccessful8811088Value = "+".toCharArray();
	/**
	 *	Test condition "+" for isRequestSuccessful88110()
	 *	@return  Returns true if isRequestSuccessful88110() is "+"
	 */
   public boolean isRequestSuccessful88110() throws CFException {
      return (  compareChars( getRequestStatus110() , requestSuccessful8811088Value)  == 0  );
   }


	/**
	*  set values "+"
	*/
   	public void setRequestSuccessful88110True() {  			
    	setRequestStatus110( requestSuccessful8811088Value);
   	}
	char[] requestFailed8811088Value = "-".toCharArray();
	/**
	 *	Test condition "-" for isRequestFailed88110()
	 *	@return  Returns true if isRequestFailed88110() is "-"
	 */
   public boolean isRequestFailed88110() throws CFException {
      return (  compareChars( getRequestStatus110() , requestFailed8811088Value)  == 0  );
   }


	/**
	*  set values "-"
	*/
   	public void setRequestFailed88110True() {  			
    	setRequestStatus110( requestFailed8811088Value);
   	}
	/**
	 *	Returns the value of deleteApplOption110
	 *	@return deleteApplOption110
	 */
   public char[] getDeleteApplOption110() throws CFException{
   		return deleteApplOption110;
   }

  
	/**
	*  set variable deleteApplOption110
	*  Corresponding COBOL Variable is 110-DELETE-APPL-OPTION
	*  @param value
	**/
   public void setDeleteApplOption110(char[] value) {
       value = checkDeleteApplOption110Constraints(value);
       arraycopy(value,0,deleteApplOption110,0,value.length);
   } 
	public void setDeleteApplOption110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,deleteApplOption110,0,beginIndex + endIndex);
   }
	char[] deleteApplRequested8811088Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isDeleteApplRequested88110()
	 *	@return  Returns true if isDeleteApplRequested88110() is "R"
	 */
   public boolean isDeleteApplRequested88110() throws CFException {
      return (  compareChars( getDeleteApplOption110() , deleteApplRequested8811088Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setDeleteApplRequested88110True() {  			
    	setDeleteApplOption110( deleteApplRequested8811088Value);
   	}
	char[] deleteApplBypassed8811088Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isDeleteApplBypassed88110()
	 *	@return  Returns true if isDeleteApplBypassed88110() is "B"
	 */
   public boolean isDeleteApplBypassed88110() throws CFException {
      return (  compareChars( getDeleteApplOption110() , deleteApplBypassed8811088Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setDeleteApplBypassed88110True() {  			
    	setDeleteApplOption110( deleteApplBypassed8811088Value);
   	}
	char[] deleteApplNotApplic8811088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isDeleteApplNotApplic88110()
	 *	@return  Returns true if isDeleteApplNotApplic88110() is "N"
	 */
   public boolean isDeleteApplNotApplic88110() throws CFException {
      return (  compareChars( getDeleteApplOption110() , deleteApplNotApplic8811088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setDeleteApplNotApplic88110True() {  			
    	setDeleteApplOption110( deleteApplNotApplic8811088Value);
   	}
	/**
	 *	Returns the value of broadcastStatus110
	 *	@return broadcastStatus110
	 */
   public char[] getBroadcastStatus110() throws CFException{
   		return broadcastStatus110;
   }

  
	/**
	*  set variable broadcastStatus110
	*  Corresponding COBOL Variable is 110-BROADCAST-STATUS
	*  @param value
	**/
   public void setBroadcastStatus110(char[] value) {
       value = checkBroadcastStatus110Constraints(value);
       arraycopy(value,0,broadcastStatus110,0,value.length);
   } 
	public void setBroadcastStatus110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,broadcastStatus110,0,beginIndex + endIndex);
   }
	char[] broadcastInactive8811088Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isBroadcastInactive88110()
	 *	@return  Returns true if isBroadcastInactive88110() is "I"
	 */
   public boolean isBroadcastInactive88110() throws CFException {
      return (  compareChars( getBroadcastStatus110() , broadcastInactive8811088Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setBroadcastInactive88110True() {  			
    	setBroadcastStatus110( broadcastInactive8811088Value);
   	}
	char[] broadcastNoData8811088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isBroadcastNoData88110()
	 *	@return  Returns true if isBroadcastNoData88110() is "N"
	 */
   public boolean isBroadcastNoData88110() throws CFException {
      return (  compareChars( getBroadcastStatus110() , broadcastNoData8811088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setBroadcastNoData88110True() {  			
    	setBroadcastStatus110( broadcastNoData8811088Value);
   	}
	char[] broadcastEndptAvail8811088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isBroadcastEndptAvail88110()
	 *	@return  Returns true if isBroadcastEndptAvail88110() is "E"
	 */
   public boolean isBroadcastEndptAvail88110() throws CFException {
      return (  compareChars( getBroadcastStatus110() , broadcastEndptAvail8811088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setBroadcastEndptAvail88110True() {  			
    	setBroadcastStatus110( broadcastEndptAvail8811088Value);
   	}
	char[] broadcastComplete8811088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isBroadcastComplete88110()
	 *	@return  Returns true if isBroadcastComplete88110() is "C"
	 */
   public boolean isBroadcastComplete88110() throws CFException {
      return (  compareChars( getBroadcastStatus110() , broadcastComplete8811088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setBroadcastComplete88110True() {  			
    	setBroadcastStatus110( broadcastComplete8811088Value);
   	}
	/**
	 *	Returns the value of installStatus110
	 *	@return installStatus110
	 */
   public char[] getInstallStatus110() throws CFException{
   		return installStatus110;
   }

  
	/**
	*  set variable installStatus110
	*  Corresponding COBOL Variable is 110-INSTALL-STATUS
	*  @param value
	**/
   public void setInstallStatus110(char[] value) {
       value = checkInstallStatus110Constraints(value);
       arraycopy(value,0,installStatus110,0,value.length);
   } 
	public void setInstallStatus110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,installStatus110,0,beginIndex + endIndex);
   }
	char[] installInactive8811088Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isInstallInactive88110()
	 *	@return  Returns true if isInstallInactive88110() is "I"
	 */
   public boolean isInstallInactive88110() throws CFException {
      return (  compareChars( getInstallStatus110() , installInactive8811088Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setInstallInactive88110True() {  			
    	setInstallStatus110( installInactive8811088Value);
   	}
	char[] installStandard8811088Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isInstallStandard88110()
	 *	@return  Returns true if isInstallStandard88110() is "S"
	 */
   public boolean isInstallStandard88110() throws CFException {
      return (  compareChars( getInstallStatus110() , installStandard8811088Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setInstallStandard88110True() {  			
    	setInstallStatus110( installStandard8811088Value);
   	}
	char[] installBroadcast8811088Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isInstallBroadcast88110()
	 *	@return  Returns true if isInstallBroadcast88110() is "B"
	 */
   public boolean isInstallBroadcast88110() throws CFException {
      return (  compareChars( getInstallStatus110() , installBroadcast8811088Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setInstallBroadcast88110True() {  			
    	setInstallStatus110( installBroadcast8811088Value);
   	}
	char[] installNotOpen8811088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isInstallNotOpen88110()
	 *	@return  Returns true if isInstallNotOpen88110() is "N"
	 */
   public boolean isInstallNotOpen88110() throws CFException {
      return (  compareChars( getInstallStatus110() , installNotOpen8811088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setInstallNotOpen88110True() {  			
    	setInstallStatus110( installNotOpen8811088Value);
   	}
	char[] installIsOpen8811088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isInstallIsOpen88110()
	 *	@return  Returns true if isInstallIsOpen88110() is "O"
	 */
   public boolean isInstallIsOpen88110() throws CFException {
      return (  compareChars( getInstallStatus110() , installIsOpen8811088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setInstallIsOpen88110True() {  			
    	setInstallStatus110( installIsOpen8811088Value);
   	}
	char[] installComplete8811088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isInstallComplete88110()
	 *	@return  Returns true if isInstallComplete88110() is "C"
	 */
   public boolean isInstallComplete88110() throws CFException {
      return (  compareChars( getInstallStatus110() , installComplete8811088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setInstallComplete88110True() {  			
    	setInstallStatus110( installComplete8811088Value);
   	}
	/**
	 *	Returns the value of retrieveStatus110
	 *	@return retrieveStatus110
	 */
   public char[] getRetrieveStatus110() throws CFException{
   		return retrieveStatus110;
   }

  
	/**
	*  set variable retrieveStatus110
	*  Corresponding COBOL Variable is 110-RETRIEVE-STATUS
	*  @param value
	**/
   public void setRetrieveStatus110(char[] value) {
       value = checkRetrieveStatus110Constraints(value);
       arraycopy(value,0,retrieveStatus110,0,value.length);
   } 
	public void setRetrieveStatus110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,retrieveStatus110,0,beginIndex + endIndex);
   }
	char[] retrieveReady8811088Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isRetrieveReady88110()
	 *	@return  Returns true if isRetrieveReady88110() is "R"
	 */
   public boolean isRetrieveReady88110() throws CFException {
      return (  compareChars( getRetrieveStatus110() , retrieveReady8811088Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setRetrieveReady88110True() {  			
    	setRetrieveStatus110( retrieveReady8811088Value);
   	}
	char[] retrieveNotReady8811088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isRetrieveNotReady88110()
	 *	@return  Returns true if isRetrieveNotReady88110() is "N"
	 */
   public boolean isRetrieveNotReady88110() throws CFException {
      return (  compareChars( getRetrieveStatus110() , retrieveNotReady8811088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setRetrieveNotReady88110True() {  			
    	setRetrieveStatus110( retrieveNotReady8811088Value);
   	}
	char[] retrieveQuiesced8811088Value = "Q".toCharArray();
	/**
	 *	Test condition "Q" for isRetrieveQuiesced88110()
	 *	@return  Returns true if isRetrieveQuiesced88110() is "Q"
	 */
   public boolean isRetrieveQuiesced88110() throws CFException {
      return (  compareChars( getRetrieveStatus110() , retrieveQuiesced8811088Value)  == 0  );
   }


	/**
	*  set values "Q"
	*/
   	public void setRetrieveQuiesced88110True() {  			
    	setRetrieveStatus110( retrieveQuiesced8811088Value);
   	}
	/**
	 *	Returns the value of resendStatus110
	 *	@return resendStatus110
	 */
   public char[] getResendStatus110() throws CFException{
   		return resendStatus110;
   }

  
	/**
	*  set variable resendStatus110
	*  Corresponding COBOL Variable is 110-RESEND-STATUS
	*  @param value
	**/
   public void setResendStatus110(char[] value) {
       value = checkResendStatus110Constraints(value);
       arraycopy(value,0,resendStatus110,0,value.length);
   } 
	public void setResendStatus110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,resendStatus110,0,beginIndex + endIndex);
   }
	char[] resendEnabled8811088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isResendEnabled88110()
	 *	@return  Returns true if isResendEnabled88110() is "Y"
	 */
   public boolean isResendEnabled88110() throws CFException {
      return (  compareChars( getResendStatus110() , resendEnabled8811088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setResendEnabled88110True() {  			
    	setResendStatus110( resendEnabled8811088Value);
   	}
	char[] resendDisabled8811088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isResendDisabled88110()
	 *	@return  Returns true if isResendDisabled88110() is "N"
	 */
   public boolean isResendDisabled88110() throws CFException {
      return (  compareChars( getResendStatus110() , resendDisabled8811088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setResendDisabled88110True() {  			
    	setResendStatus110( resendDisabled8811088Value);
   	}
	/**
	 *	Returns the value of setupStatus110
	 *	@return setupStatus110
	 */
   public char[] getSetupStatus110() throws CFException{
   		return setupStatus110;
   }

  
	/**
	*  set variable setupStatus110
	*  Corresponding COBOL Variable is 110-SETUP-STATUS
	*  @param value
	**/
   public void setSetupStatus110(char[] value) {
       value = checkSetupStatus110Constraints(value);
       arraycopy(value,0,setupStatus110,0,value.length);
   } 
	public void setSetupStatus110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,setupStatus110,0,beginIndex + endIndex);
   }
	char[] setupValid8811088Value = fillZeroes(1);
	/**
	 *	Test condition "0" for isSetupValid88110()
	 *	@return  Returns true if isSetupValid88110() is "0"
	 */
   public boolean isSetupValid88110() throws CFException {
      return (  compareChars( getSetupStatus110() , setupValid8811088Value)  == 0  );
   }


	/**
	*  set values "0"
	*/
   	public void setSetupValid88110True() {  			
    	setSetupStatus110( setupValid8811088Value);
   	}
	
	/**
	 *	Test condition "1" THRU "9" for isSetupProblem88110()
	 *	@return  Returns true if isSetupProblem88110() is "1" THRU "9"
	 */
   public boolean isSetupProblem88110() throws CFException {
      return (  isGreaterOrEqual(getSetupStatus110(), "1" ) &&  isLessOrEqual(getSetupStatus110(),"9" )  );
   }


	/**
	*  set values "1" THRU "9"
	*/
   	public void setSetupProblem88110True() {  			
    	setSetupStatus110( "1".toCharArray());
   	}
	
	/**
	 *	Test condition "1" THRU "5" for isSetupEptProblem88110()
	 *	@return  Returns true if isSetupEptProblem88110() is "1" THRU "5"
	 */
   public boolean isSetupEptProblem88110() throws CFException {
      return (  isGreaterOrEqual(getSetupStatus110(), "1" ) &&  isLessOrEqual(getSetupStatus110(),"5" )  );
   }


	/**
	*  set values "1" THRU "5"
	*/
   	public void setSetupEptProblem88110True() {  			
    	setSetupStatus110( "1".toCharArray());
   	}
	char[] setupEptMissing8811088Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isSetupEptMissing88110()
	 *	@return  Returns true if isSetupEptMissing88110() is "1"
	 */
   public boolean isSetupEptMissing88110() throws CFException {
      return (  compareChars( getSetupStatus110() , setupEptMissing8811088Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setSetupEptMissing88110True() {  			
    	setSetupStatus110( setupEptMissing8811088Value);
   	}
	char[] setupEptBackup8811088Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isSetupEptBackup88110()
	 *	@return  Returns true if isSetupEptBackup88110() is "2"
	 */
   public boolean isSetupEptBackup88110() throws CFException {
      return (  compareChars( getSetupStatus110() , setupEptBackup8811088Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setSetupEptBackup88110True() {  			
    	setSetupStatus110( setupEptBackup8811088Value);
   	}
	char[] setupEptBroken8811088Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isSetupEptBroken88110()
	 *	@return  Returns true if isSetupEptBroken88110() is "3"
	 */
   public boolean isSetupEptBroken88110() throws CFException {
      return (  compareChars( getSetupStatus110() , setupEptBroken8811088Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setSetupEptBroken88110True() {  			
    	setSetupStatus110( setupEptBroken8811088Value);
   	}
	char[] setupEptLoops8811088Value = "4".toCharArray();
	/**
	 *	Test condition "4" for isSetupEptLoops88110()
	 *	@return  Returns true if isSetupEptLoops88110() is "4"
	 */
   public boolean isSetupEptLoops88110() throws CFException {
      return (  compareChars( getSetupStatus110() , setupEptLoops8811088Value)  == 0  );
   }


	/**
	*  set values "4"
	*/
   	public void setSetupEptLoops88110True() {  			
    	setSetupStatus110( setupEptLoops8811088Value);
   	}
	char[] setupEptNonFtss8811088Value = "5".toCharArray();
	/**
	 *	Test condition "5" for isSetupEptNonFtss88110()
	 *	@return  Returns true if isSetupEptNonFtss88110() is "5"
	 */
   public boolean isSetupEptNonFtss88110() throws CFException {
      return (  compareChars( getSetupStatus110() , setupEptNonFtss8811088Value)  == 0  );
   }


	/**
	*  set values "5"
	*/
   	public void setSetupEptNonFtss88110True() {  			
    	setSetupStatus110( setupEptNonFtss8811088Value);
   	}
	
	/**
	 *	Test condition "6" THRU "7" for isSetupEfpProblem88110()
	 *	@return  Returns true if isSetupEfpProblem88110() is "6" THRU "7"
	 */
   public boolean isSetupEfpProblem88110() throws CFException {
      return (  isGreaterOrEqual(getSetupStatus110(), "6" ) &&  isLessOrEqual(getSetupStatus110(),"7" )  );
   }


	/**
	*  set values "6" THRU "7"
	*/
   	public void setSetupEfpProblem88110True() {  			
    	setSetupStatus110( "6".toCharArray());
   	}
	char[] setupEfpMissing8811088Value = "6".toCharArray();
	/**
	 *	Test condition "6" for isSetupEfpMissing88110()
	 *	@return  Returns true if isSetupEfpMissing88110() is "6"
	 */
   public boolean isSetupEfpMissing88110() throws CFException {
      return (  compareChars( getSetupStatus110() , setupEfpMissing8811088Value)  == 0  );
   }


	/**
	*  set values "6"
	*/
   	public void setSetupEfpMissing88110True() {  			
    	setSetupStatus110( setupEfpMissing8811088Value);
   	}
	char[] setupEfpBackup8811088Value = "7".toCharArray();
	/**
	 *	Test condition "7" for isSetupEfpBackup88110()
	 *	@return  Returns true if isSetupEfpBackup88110() is "7"
	 */
   public boolean isSetupEfpBackup88110() throws CFException {
      return (  compareChars( getSetupStatus110() , setupEfpBackup8811088Value)  == 0  );
   }


	/**
	*  set values "7"
	*/
   	public void setSetupEfpBackup88110True() {  			
    	setSetupStatus110( setupEfpBackup8811088Value);
   	}
	/**
	 *	Returns the value of setupReported110
	 *	@return setupReported110
	 */
   public char[] getSetupReported110() throws CFException{
   		return setupReported110;
   }

  
	/**
	*  set variable setupReported110
	*  Corresponding COBOL Variable is 110-SETUP-REPORTED
	*  @param value
	**/
   public void setSetupReported110(char[] value) {
       value = checkSetupReported110Constraints(value);
       arraycopy(value,0,setupReported110,0,value.length);
   } 
	public void setSetupReported110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,setupReported110,0,beginIndex + endIndex);
   }
	char[] setupReportedYes8811088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSetupReportedYes88110()
	 *	@return  Returns true if isSetupReportedYes88110() is "Y"
	 */
   public boolean isSetupReportedYes88110() throws CFException {
      return (  compareChars( getSetupReported110() , setupReportedYes8811088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSetupReportedYes88110True() {  			
    	setSetupReported110( setupReportedYes8811088Value);
   	}
	char[] setupReportedNo8811088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSetupReportedNo88110()
	 *	@return  Returns true if isSetupReportedNo88110() is "N"
	 */
   public boolean isSetupReportedNo88110() throws CFException {
      return (  compareChars( getSetupReported110() , setupReportedNo8811088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSetupReportedNo88110True() {  			
    	setSetupReported110( setupReportedNo8811088Value);
   	}
	/**
	 *	Returns the value of transferPostStatus110
	 *	@return transferPostStatus110
	 */
   public char[] getTransferPostStatus110() throws CFException{
   		return transferPostStatus110;
   }

  
	/**
	*  set variable transferPostStatus110
	*  Corresponding COBOL Variable is 110-TRANSFER-POST-STATUS
	*  @param value
	**/
   public void setTransferPostStatus110(char[] value) {
       value = checkTransferPostStatus110Constraints(value);
       arraycopy(value,0,transferPostStatus110,0,value.length);
   } 
	public void setTransferPostStatus110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,transferPostStatus110,0,beginIndex + endIndex);
   }
	char[] transferInactive8811088Value = " ".toCharArray();
	/**
	 *	Test condition " " for isTransferInactive88110()
	 *	@return  Returns true if isTransferInactive88110() is " "
	 */
   public boolean isTransferInactive88110() throws CFException {
      return (  compareChars( getTransferPostStatus110() , transferInactive8811088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setTransferInactive88110True() {  			
    	setTransferPostStatus110( transferInactive8811088Value);
   	}
	
	/**
	 *	Test condition "0" THRU "9" for isTransferAccepted88110()
	 *	@return  Returns true if isTransferAccepted88110() is "0" THRU "9"
	 */
   public boolean isTransferAccepted88110() throws CFException {
      return (  isGreaterOrEqual(getTransferPostStatus110(), "0" ) &&  isLessOrEqual(getTransferPostStatus110(),"9" )  );
   }


	/**
	*  set values "0" THRU "9"
	*/
   	public void setTransferAccepted88110True() {  			
    	setTransferPostStatus110( "0".toCharArray());
   	}
	char[] transferReady8811088Value = fillZeroes(1);
	/**
	 *	Test condition "0" for isTransferReady88110()
	 *	@return  Returns true if isTransferReady88110() is "0"
	 */
   public boolean isTransferReady88110() throws CFException {
      return (  compareChars( getTransferPostStatus110() , transferReady8811088Value)  == 0  );
   }


	/**
	*  set values "0"
	*/
   	public void setTransferReady88110True() {  			
    	setTransferPostStatus110( transferReady8811088Value);
   	}
	char[] transferPosted8811088Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isTransferPosted88110()
	 *	@return  Returns true if isTransferPosted88110() is "1"
	 */
   public boolean isTransferPosted88110() throws CFException {
      return (  compareChars( getTransferPostStatus110() , transferPosted8811088Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setTransferPosted88110True() {  			
    	setTransferPostStatus110( transferPosted8811088Value);
   	}
	char[] transferQuiesce8811088Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isTransferQuiesce88110()
	 *	@return  Returns true if isTransferQuiesce88110() is "2"
	 */
   public boolean isTransferQuiesce88110() throws CFException {
      return (  compareChars( getTransferPostStatus110() , transferQuiesce8811088Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setTransferQuiesce88110True() {  			
    	setTransferPostStatus110( transferQuiesce8811088Value);
   	}
	char[] transferWaited8811088Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isTransferWaited88110()
	 *	@return  Returns true if isTransferWaited88110() is "3"
	 */
   public boolean isTransferWaited88110() throws CFException {
      return (  compareChars( getTransferPostStatus110() , transferWaited8811088Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setTransferWaited88110True() {  			
    	setTransferPostStatus110( transferWaited8811088Value);
   	}
	char[] transferInstalled8811088Value = "4".toCharArray();
	/**
	 *	Test condition "4" for isTransferInstalled88110()
	 *	@return  Returns true if isTransferInstalled88110() is "4"
	 */
   public boolean isTransferInstalled88110() throws CFException {
      return (  compareChars( getTransferPostStatus110() , transferInstalled8811088Value)  == 0  );
   }


	/**
	*  set values "4"
	*/
   	public void setTransferInstalled88110True() {  			
    	setTransferPostStatus110( transferInstalled8811088Value);
   	}
	char[] transferRerouted8811088Value = "5".toCharArray();
	/**
	 *	Test condition "5" for isTransferRerouted88110()
	 *	@return  Returns true if isTransferRerouted88110() is "5"
	 */
   public boolean isTransferRerouted88110() throws CFException {
      return (  compareChars( getTransferPostStatus110() , transferRerouted8811088Value)  == 0  );
   }


	/**
	*  set values "5"
	*/
   	public void setTransferRerouted88110True() {  			
    	setTransferPostStatus110( transferRerouted8811088Value);
   	}
	char[] transferRepeat8811088Value = "6".toCharArray();
	/**
	 *	Test condition "6" for isTransferRepeat88110()
	 *	@return  Returns true if isTransferRepeat88110() is "6"
	 */
   public boolean isTransferRepeat88110() throws CFException {
      return (  compareChars( getTransferPostStatus110() , transferRepeat8811088Value)  == 0  );
   }


	/**
	*  set values "6"
	*/
   	public void setTransferRepeat88110True() {  			
    	setTransferPostStatus110( transferRepeat8811088Value);
   	}
	char[] transferFxsDupeWarn8811088Value = "7".toCharArray();
	/**
	 *	Test condition "7" for isTransferFxsDupeWarn88110()
	 *	@return  Returns true if isTransferFxsDupeWarn88110() is "7"
	 */
   public boolean isTransferFxsDupeWarn88110() throws CFException {
      return (  compareChars( getTransferPostStatus110() , transferFxsDupeWarn8811088Value)  == 0  );
   }


	/**
	*  set values "7"
	*/
   	public void setTransferFxsDupeWarn88110True() {  			
    	setTransferPostStatus110( transferFxsDupeWarn8811088Value);
   	}
	char[] transferSetup8811088Value = "9".toCharArray();
	/**
	 *	Test condition "9" for isTransferSetup88110()
	 *	@return  Returns true if isTransferSetup88110() is "9"
	 */
   public boolean isTransferSetup88110() throws CFException {
      return (  compareChars( getTransferPostStatus110() , transferSetup8811088Value)  == 0  );
   }


	/**
	*  set values "9"
	*/
   	public void setTransferSetup88110True() {  			
    	setTransferPostStatus110( transferSetup8811088Value);
   	}
	
	/**
	 *	Test condition "A" THRU "Z" for isTransferRejected88110()
	 *	@return  Returns true if isTransferRejected88110() is "A" THRU "Z"
	 */
   public boolean isTransferRejected88110() throws CFException {
      return (  isGreaterOrEqual(getTransferPostStatus110(), "A" ) &&  isLessOrEqual(getTransferPostStatus110(),"Z" )  );
   }


	/**
	*  set values "A" THRU "Z"
	*/
   	public void setTransferRejected88110True() {  			
    	setTransferPostStatus110( "A".toCharArray());
   	}
	char[] transferEptSelect8811088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isTransferEptSelect88110()
	 *	@return  Returns true if isTransferEptSelect88110() is "E"
	 */
   public boolean isTransferEptSelect88110() throws CFException {
      return (  compareChars( getTransferPostStatus110() , transferEptSelect8811088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setTransferEptSelect88110True() {  			
    	setTransferPostStatus110( transferEptSelect8811088Value);
   	}
	char[] transferEfpSelect8811088Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isTransferEfpSelect88110()
	 *	@return  Returns true if isTransferEfpSelect88110() is "F"
	 */
   public boolean isTransferEfpSelect88110() throws CFException {
      return (  compareChars( getTransferPostStatus110() , transferEfpSelect8811088Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setTransferEfpSelect88110True() {  			
    	setTransferPostStatus110( transferEfpSelect8811088Value);
   	}
	char[] transferFxsSelect8811088Value = "X".toCharArray();
	/**
	 *	Test condition "X" for isTransferFxsSelect88110()
	 *	@return  Returns true if isTransferFxsSelect88110() is "X"
	 */
   public boolean isTransferFxsSelect88110() throws CFException {
      return (  compareChars( getTransferPostStatus110() , transferFxsSelect8811088Value)  == 0  );
   }


	/**
	*  set values "X"
	*/
   	public void setTransferFxsSelect88110True() {  			
    	setTransferPostStatus110( transferFxsSelect8811088Value);
   	}
	char[] transferFxsInsert8811088Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isTransferFxsInsert88110()
	 *	@return  Returns true if isTransferFxsInsert88110() is "I"
	 */
   public boolean isTransferFxsInsert88110() throws CFException {
      return (  compareChars( getTransferPostStatus110() , transferFxsInsert8811088Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setTransferFxsInsert88110True() {  			
    	setTransferPostStatus110( transferFxsInsert8811088Value);
   	}
	char[] transferFxsDupeErr8811088Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isTransferFxsDupeErr88110()
	 *	@return  Returns true if isTransferFxsDupeErr88110() is "D"
	 */
   public boolean isTransferFxsDupeErr88110() throws CFException {
      return (  compareChars( getTransferPostStatus110() , transferFxsDupeErr8811088Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setTransferFxsDupeErr88110True() {  			
    	setTransferPostStatus110( transferFxsDupeErr8811088Value);
   	}
	char[] transferFxsUpdate8811088Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isTransferFxsUpdate88110()
	 *	@return  Returns true if isTransferFxsUpdate88110() is "U"
	 */
   public boolean isTransferFxsUpdate88110() throws CFException {
      return (  compareChars( getTransferPostStatus110() , transferFxsUpdate8811088Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setTransferFxsUpdate88110True() {  			
    	setTransferPostStatus110( transferFxsUpdate8811088Value);
   	}
	char[] transferResultWrite8811088Value = "W".toCharArray();
	/**
	 *	Test condition "W" for isTransferResultWrite88110()
	 *	@return  Returns true if isTransferResultWrite88110() is "W"
	 */
   public boolean isTransferResultWrite88110() throws CFException {
      return (  compareChars( getTransferPostStatus110() , transferResultWrite8811088Value)  == 0  );
   }


	/**
	*  set values "W"
	*/
   	public void setTransferResultWrite88110True() {  			
    	setTransferPostStatus110( transferResultWrite8811088Value);
   	}
	/**
	 *	Returns the value of copyStatus110
	 *	@return copyStatus110
	 */
   public char[] getCopyStatus110() throws CFException{
   		return copyStatus110;
   }

  
	/**
	*  set variable copyStatus110
	*  Corresponding COBOL Variable is 110-COPY-STATUS
	*  @param value
	**/
   public void setCopyStatus110(char[] value) {
       value = checkCopyStatus110Constraints(value);
       arraycopy(value,0,copyStatus110,0,value.length);
   } 
	public void setCopyStatus110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,copyStatus110,0,beginIndex + endIndex);
   }
	char[] copySuccessful8811088Value = "+".toCharArray();
	/**
	 *	Test condition "+" for isCopySuccessful88110()
	 *	@return  Returns true if isCopySuccessful88110() is "+"
	 */
   public boolean isCopySuccessful88110() throws CFException {
      return (  compareChars( getCopyStatus110() , copySuccessful8811088Value)  == 0  );
   }


	/**
	*  set values "+"
	*/
   	public void setCopySuccessful88110True() {  			
    	setCopyStatus110( copySuccessful8811088Value);
   	}
	
	/**
	 *	Test condition "A" THRU "Z" for isCopyFailed88110()
	 *	@return  Returns true if isCopyFailed88110() is "A" THRU "Z"
	 */
   public boolean isCopyFailed88110() throws CFException {
      return (  isGreaterOrEqual(getCopyStatus110(), "A" ) &&  isLessOrEqual(getCopyStatus110(),"Z" )  );
   }


	/**
	*  set values "A" THRU "Z"
	*/
   	public void setCopyFailed88110True() {  			
    	setCopyStatus110( "A".toCharArray());
   	}
	char[] copyFileAlloc8811088Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isCopyFileAlloc88110()
	 *	@return  Returns true if isCopyFileAlloc88110() is "A"
	 */
   public boolean isCopyFileAlloc88110() throws CFException {
      return (  compareChars( getCopyStatus110() , copyFileAlloc8811088Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setCopyFileAlloc88110True() {  			
    	setCopyStatus110( copyFileAlloc8811088Value);
   	}
	char[] copyFileInUse8811088Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isCopyFileInUse88110()
	 *	@return  Returns true if isCopyFileInUse88110() is "I"
	 */
   public boolean isCopyFileInUse88110() throws CFException {
      return (  compareChars( getCopyStatus110() , copyFileInUse8811088Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setCopyFileInUse88110True() {  			
    	setCopyStatus110( copyFileInUse8811088Value);
   	}
	char[] copyFileDupe8811088Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isCopyFileDupe88110()
	 *	@return  Returns true if isCopyFileDupe88110() is "D"
	 */
   public boolean isCopyFileDupe88110() throws CFException {
      return (  compareChars( getCopyStatus110() , copyFileDupe8811088Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setCopyFileDupe88110True() {  			
    	setCopyStatus110( copyFileDupe8811088Value);
   	}
	char[] copyFileNone8811088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isCopyFileNone88110()
	 *	@return  Returns true if isCopyFileNone88110() is "N"
	 */
   public boolean isCopyFileNone88110() throws CFException {
      return (  compareChars( getCopyStatus110() , copyFileNone8811088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setCopyFileNone88110True() {  			
    	setCopyStatus110( copyFileNone8811088Value);
   	}
	char[] copyFileOpen8811088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isCopyFileOpen88110()
	 *	@return  Returns true if isCopyFileOpen88110() is "O"
	 */
   public boolean isCopyFileOpen88110() throws CFException {
      return (  compareChars( getCopyStatus110() , copyFileOpen8811088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setCopyFileOpen88110True() {  			
    	setCopyStatus110( copyFileOpen8811088Value);
   	}
	char[] copyFileRead8811088Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isCopyFileRead88110()
	 *	@return  Returns true if isCopyFileRead88110() is "R"
	 */
   public boolean isCopyFileRead88110() throws CFException {
      return (  compareChars( getCopyStatus110() , copyFileRead8811088Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setCopyFileRead88110True() {  			
    	setCopyStatus110( copyFileRead8811088Value);
   	}
	char[] copyFileWrite8811088Value = "W".toCharArray();
	/**
	 *	Test condition "W" for isCopyFileWrite88110()
	 *	@return  Returns true if isCopyFileWrite88110() is "W"
	 */
   public boolean isCopyFileWrite88110() throws CFException {
      return (  compareChars( getCopyStatus110() , copyFileWrite8811088Value)  == 0  );
   }


	/**
	*  set values "W"
	*/
   	public void setCopyFileWrite88110True() {  			
    	setCopyStatus110( copyFileWrite8811088Value);
   	}
	char[] copyFileClose8811088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isCopyFileClose88110()
	 *	@return  Returns true if isCopyFileClose88110() is "C"
	 */
   public boolean isCopyFileClose88110() throws CFException {
      return (  compareChars( getCopyStatus110() , copyFileClose8811088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setCopyFileClose88110True() {  			
    	setCopyStatus110( copyFileClose8811088Value);
   	}
	char[] copyFileUnall8811088Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isCopyFileUnall88110()
	 *	@return  Returns true if isCopyFileUnall88110() is "U"
	 */
   public boolean isCopyFileUnall88110() throws CFException {
      return (  compareChars( getCopyStatus110() , copyFileUnall8811088Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setCopyFileUnall88110True() {  			
    	setCopyStatus110( copyFileUnall8811088Value);
   	}
	char[] copyFileDltalc8811088Value = "L".toCharArray();
	/**
	 *	Test condition "L" for isCopyFileDltalc88110()
	 *	@return  Returns true if isCopyFileDltalc88110() is "L"
	 */
   public boolean isCopyFileDltalc88110() throws CFException {
      return (  compareChars( getCopyStatus110() , copyFileDltalc8811088Value)  == 0  );
   }


	/**
	*  set values "L"
	*/
   	public void setCopyFileDltalc88110True() {  			
    	setCopyStatus110( copyFileDltalc8811088Value);
   	}
	char[] copyFileDltopn8811088Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isCopyFileDltopn88110()
	 *	@return  Returns true if isCopyFileDltopn88110() is "P"
	 */
   public boolean isCopyFileDltopn88110() throws CFException {
      return (  compareChars( getCopyStatus110() , copyFileDltopn8811088Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setCopyFileDltopn88110True() {  			
    	setCopyStatus110( copyFileDltopn8811088Value);
   	}
	char[] copyFileDltcls8811088Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isCopyFileDltcls88110()
	 *	@return  Returns true if isCopyFileDltcls88110() is "S"
	 */
   public boolean isCopyFileDltcls88110() throws CFException {
      return (  compareChars( getCopyStatus110() , copyFileDltcls8811088Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setCopyFileDltcls88110True() {  			
    	setCopyStatus110( copyFileDltcls8811088Value);
   	}
	char[] copyFileCounts8811088Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isCopyFileCounts88110()
	 *	@return  Returns true if isCopyFileCounts88110() is "T"
	 */
   public boolean isCopyFileCounts88110() throws CFException {
      return (  compareChars( getCopyStatus110() , copyFileCounts8811088Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setCopyFileCounts88110True() {  			
    	setCopyStatus110( copyFileCounts8811088Value);
   	}
	/**
	 *	Returns the value of dynamEndStatus110
	 *	@return dynamEndStatus110
	 */
   public char[] getDynamEndStatus110() throws CFException{
   		return dynamEndStatus110;
   }

  
	/**
	*  set variable dynamEndStatus110
	*  Corresponding COBOL Variable is 110-DYNAM-END-STATUS
	*  @param value
	**/
   public void setDynamEndStatus110(char[] value) {
       value = checkDynamEndStatus110Constraints(value);
       arraycopy(value,0,dynamEndStatus110,0,value.length);
   } 
	public void setDynamEndStatus110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dynamEndStatus110,0,beginIndex + endIndex);
   }
	char[] dynamEndNotNeeded8811088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isDynamEndNotNeeded88110()
	 *	@return  Returns true if isDynamEndNotNeeded88110() is "N"
	 */
   public boolean isDynamEndNotNeeded88110() throws CFException {
      return (  compareChars( getDynamEndStatus110() , dynamEndNotNeeded8811088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setDynamEndNotNeeded88110True() {  			
    	setDynamEndStatus110( dynamEndNotNeeded8811088Value);
   	}
	char[] dynamEndRequired8811088Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isDynamEndRequired88110()
	 *	@return  Returns true if isDynamEndRequired88110() is "R"
	 */
   public boolean isDynamEndRequired88110() throws CFException {
      return (  compareChars( getDynamEndStatus110() , dynamEndRequired8811088Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setDynamEndRequired88110True() {  			
    	setDynamEndStatus110( dynamEndRequired8811088Value);
   	}
	char[] dynamEndComplete8811088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isDynamEndComplete88110()
	 *	@return  Returns true if isDynamEndComplete88110() is "C"
	 */
   public boolean isDynamEndComplete88110() throws CFException {
      return (  compareChars( getDynamEndStatus110() , dynamEndComplete8811088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setDynamEndComplete88110True() {  			
    	setDynamEndStatus110( dynamEndComplete8811088Value);
   	}
	/**
	 *	Returns the value of gftConnectStatus110
	 *	@return gftConnectStatus110
	 */
   public char[] getGftConnectStatus110() throws CFException{
   		return gftConnectStatus110;
   }

  
	/**
	*  set variable gftConnectStatus110
	*  Corresponding COBOL Variable is 110-GFT-CONNECT-STATUS
	*  @param value
	**/
   public void setGftConnectStatus110(char[] value) {
       value = checkGftConnectStatus110Constraints(value);
       arraycopy(value,0,gftConnectStatus110,0,value.length);
   } 
	public void setGftConnectStatus110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,gftConnectStatus110,0,beginIndex + endIndex);
   }
	char[] gftConnectInactive8811088Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isGftConnectInactive88110()
	 *	@return  Returns true if isGftConnectInactive88110() is "I"
	 */
   public boolean isGftConnectInactive88110() throws CFException {
      return (  compareChars( getGftConnectStatus110() , gftConnectInactive8811088Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setGftConnectInactive88110True() {  			
    	setGftConnectStatus110( gftConnectInactive8811088Value);
   	}
	char[] gftConnectActive8811088Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isGftConnectActive88110()
	 *	@return  Returns true if isGftConnectActive88110() is "A"
	 */
   public boolean isGftConnectActive88110() throws CFException {
      return (  compareChars( getGftConnectStatus110() , gftConnectActive8811088Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setGftConnectActive88110True() {  			
    	setGftConnectStatus110( gftConnectActive8811088Value);
   	}
	/**
	 *	Returns the value of jclDdStatus110
	 *	@return jclDdStatus110
	 */
   public char[] getJclDdStatus110() throws CFException{
   		return jclDdStatus110;
   }

  
	/**
	*  set variable jclDdStatus110
	*  Corresponding COBOL Variable is 110-JCL-DD-STATUS
	*  @param value
	**/
   public void setJclDdStatus110(char[] value) {
       value = checkJclDdStatus110Constraints(value);
       arraycopy(value,0,jclDdStatus110,0,value.length);
   } 
	public void setJclDdStatus110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,jclDdStatus110,0,beginIndex + endIndex);
   }
	char[] jclDdMissing8811088Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isJclDdMissing88110()
	 *	@return  Returns true if isJclDdMissing88110() is "M"
	 */
   public boolean isJclDdMissing88110() throws CFException {
      return (  compareChars( getJclDdStatus110() , jclDdMissing8811088Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setJclDdMissing88110True() {  			
    	setJclDdStatus110( jclDdMissing8811088Value);
   	}
	char[] jclDdPresent8811088Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isJclDdPresent88110()
	 *	@return  Returns true if isJclDdPresent88110() is "P"
	 */
   public boolean isJclDdPresent88110() throws CFException {
      return (  compareChars( getJclDdStatus110() , jclDdPresent8811088Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setJclDdPresent88110True() {  			
    	setJclDdStatus110( jclDdPresent8811088Value);
   	}
	char[] jclDdError8811088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isJclDdError88110()
	 *	@return  Returns true if isJclDdError88110() is "E"
	 */
   public boolean isJclDdError88110() throws CFException {
      return (  compareChars( getJclDdStatus110() , jclDdError8811088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setJclDdError88110True() {  			
    	setJclDdStatus110( jclDdError8811088Value);
   	}
	/**
	 *	Returns the value of resultDisp110
	 *	@return resultDisp110
	 */
   public char[] getResultDisp110() throws CFException{
   		return resultDisp110;
   }

  
	/**
	*  set variable resultDisp110
	*  Corresponding COBOL Variable is 110-RESULT-DISP
	*  @param value
	**/
   public void setResultDisp110(char[] value) {
       value = checkResultDisp110Constraints(value);
       arraycopy(value,0,resultDisp110,0,value.length);
   } 
	public void setResultDisp110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,resultDisp110,0,beginIndex + endIndex);
   }
	char[] resultDispSysout8811088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isResultDispSysout88110()
	 *	@return  Returns true if isResultDispSysout88110() is "O"
	 */
   public boolean isResultDispSysout88110() throws CFException {
      return (  compareChars( getResultDisp110() , resultDispSysout8811088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setResultDispSysout88110True() {  			
    	setResultDisp110( resultDispSysout8811088Value);
   	}
	char[] resultDispSyslst8811088Value = "L".toCharArray();
	/**
	 *	Test condition "L" for isResultDispSyslst88110()
	 *	@return  Returns true if isResultDispSyslst88110() is "L"
	 */
   public boolean isResultDispSyslst88110() throws CFException {
      return (  compareChars( getResultDisp110() , resultDispSyslst8811088Value)  == 0  );
   }


	/**
	*  set values "L"
	*/
   	public void setResultDispSyslst88110True() {  			
    	setResultDisp110( resultDispSyslst8811088Value);
   	}
	char[] resultDispSysnnn8811088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isResultDispSysnnn88110()
	 *	@return  Returns true if isResultDispSysnnn88110() is "N"
	 */
   public boolean isResultDispSysnnn88110() throws CFException {
      return (  compareChars( getResultDisp110() , resultDispSysnnn8811088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setResultDispSysnnn88110True() {  			
    	setResultDisp110( resultDispSysnnn8811088Value);
   	}
	/**
	 *	Returns the value of resultFile110
	 *	@return resultFile110
	 */
   public char[] getResultFile110() throws CFException{
   		return resultFile110;
   }

  
	/**
	*  set variable resultFile110
	*  Corresponding COBOL Variable is 110-RESULT-FILE
	*  @param value
	**/
   public void setResultFile110(char[] value) {
       value = checkResultFile110Constraints(value);
       arraycopy(value,0,resultFile110,0,value.length);
   } 
	public void setResultFile110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,resultFile110,0,beginIndex + endIndex);
   }
	char[] resultFileInactive8811088Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isResultFileInactive88110()
	 *	@return  Returns true if isResultFileInactive88110() is "I"
	 */
   public boolean isResultFileInactive88110() throws CFException {
      return (  compareChars( getResultFile110() , resultFileInactive8811088Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setResultFileInactive88110True() {  			
    	setResultFile110( resultFileInactive8811088Value);
   	}
	char[] resultFileActive8811088Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isResultFileActive88110()
	 *	@return  Returns true if isResultFileActive88110() is "A"
	 */
   public boolean isResultFileActive88110() throws CFException {
      return (  compareChars( getResultFile110() , resultFileActive8811088Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setResultFileActive88110True() {  			
    	setResultFile110( resultFileActive8811088Value);
   	}
	/**
	 *	Returns the value of sqlExecStatus110
	 *	@return sqlExecStatus110
	 */
   public char[] getSqlExecStatus110() throws CFException{
   		return sqlExecStatus110;
   }

  
	/**
	*  set variable sqlExecStatus110
	*  Corresponding COBOL Variable is 110-SQL-EXEC-STATUS
	*  @param value
	**/
   public void setSqlExecStatus110(char[] value) {
       value = checkSqlExecStatus110Constraints(value);
       arraycopy(value,0,sqlExecStatus110,0,value.length);
   } 
	public void setSqlExecStatus110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sqlExecStatus110,0,beginIndex + endIndex);
   }
	char[] sqlExecStart8811088Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isSqlExecStart88110()
	 *	@return  Returns true if isSqlExecStart88110() is "S"
	 */
   public boolean isSqlExecStart88110() throws CFException {
      return (  compareChars( getSqlExecStatus110() , sqlExecStart8811088Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setSqlExecStart88110True() {  			
    	setSqlExecStatus110( sqlExecStart8811088Value);
   	}
	char[] sqlExecActive8811088Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isSqlExecActive88110()
	 *	@return  Returns true if isSqlExecActive88110() is "A"
	 */
   public boolean isSqlExecActive88110() throws CFException {
      return (  compareChars( getSqlExecStatus110() , sqlExecActive8811088Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setSqlExecActive88110True() {  			
    	setSqlExecStatus110( sqlExecActive8811088Value);
   	}
	char[] sqlExecEnd8811088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isSqlExecEnd88110()
	 *	@return  Returns true if isSqlExecEnd88110() is "E"
	 */
   public boolean isSqlExecEnd88110() throws CFException {
      return (  compareChars( getSqlExecStatus110() , sqlExecEnd8811088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setSqlExecEnd88110True() {  			
    	setSqlExecStatus110( sqlExecEnd8811088Value);
   	}
	/**
	 *	Returns the value of sqlRetryOption110
	 *	@return sqlRetryOption110
	 */
   public char[] getSqlRetryOption110() throws CFException{
   		return sqlRetryOption110;
   }

  
	/**
	*  set variable sqlRetryOption110
	*  Corresponding COBOL Variable is 110-SQL-RETRY-OPTION
	*  @param value
	**/
   public void setSqlRetryOption110(char[] value) {
       value = checkSqlRetryOption110Constraints(value);
       arraycopy(value,0,sqlRetryOption110,0,value.length);
   } 
	public void setSqlRetryOption110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sqlRetryOption110,0,beginIndex + endIndex);
   }
	char[] sqlRetryEnabled8811088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isSqlRetryEnabled88110()
	 *	@return  Returns true if isSqlRetryEnabled88110() is "E"
	 */
   public boolean isSqlRetryEnabled88110() throws CFException {
      return (  compareChars( getSqlRetryOption110() , sqlRetryEnabled8811088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setSqlRetryEnabled88110True() {  			
    	setSqlRetryOption110( sqlRetryEnabled8811088Value);
   	}
	char[] sqlRetryDisabled8811088Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isSqlRetryDisabled88110()
	 *	@return  Returns true if isSqlRetryDisabled88110() is "D"
	 */
   public boolean isSqlRetryDisabled88110() throws CFException {
      return (  compareChars( getSqlRetryOption110() , sqlRetryDisabled8811088Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setSqlRetryDisabled88110True() {  			
    	setSqlRetryOption110( sqlRetryDisabled8811088Value);
   	}
	/**
	 *	Returns the value of renameApplStatus110
	 *	@return renameApplStatus110
	 */
   public char[] getRenameApplStatus110() throws CFException{
   		return renameApplStatus110;
   }

  
	/**
	*  set variable renameApplStatus110
	*  Corresponding COBOL Variable is 110-RENAME-APPL-STATUS
	*  @param value
	**/
   public void setRenameApplStatus110(char[] value) {
       value = checkRenameApplStatus110Constraints(value);
       arraycopy(value,0,renameApplStatus110,0,value.length);
   } 
	public void setRenameApplStatus110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,renameApplStatus110,0,beginIndex + endIndex);
   }
	char[] renameApplInactive8811088Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isRenameApplInactive88110()
	 *	@return  Returns true if isRenameApplInactive88110() is "I"
	 */
   public boolean isRenameApplInactive88110() throws CFException {
      return (  compareChars( getRenameApplStatus110() , renameApplInactive8811088Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setRenameApplInactive88110True() {  			
    	setRenameApplStatus110( renameApplInactive8811088Value);
   	}
	char[] renameApplActive8811088Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isRenameApplActive88110()
	 *	@return  Returns true if isRenameApplActive88110() is "A"
	 */
   public boolean isRenameApplActive88110() throws CFException {
      return (  compareChars( getRenameApplStatus110() , renameApplActive8811088Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setRenameApplActive88110True() {  			
    	setRenameApplStatus110( renameApplActive8811088Value);
   	}
	/**
	 *	Returns the value of sourceDsnSpaceInd110
	 *	@return sourceDsnSpaceInd110
	 */
   public char[] getSourceDsnSpaceInd110() throws CFException{
   		return sourceDsnSpaceInd110;
   }

  
	/**
	*  set variable sourceDsnSpaceInd110
	*  Corresponding COBOL Variable is 110-SOURCE-DSN-SPACE-IND
	*  @param value
	**/
   public void setSourceDsnSpaceInd110(char[] value) {
       value = checkSourceDsnSpaceInd110Constraints(value);
       arraycopy(value,0,sourceDsnSpaceInd110,0,value.length);
   } 
	public void setSourceDsnSpaceInd110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sourceDsnSpaceInd110,0,beginIndex + endIndex);
   }
	char[] sourceDsnPsInfo8811088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSourceDsnPsInfo88110()
	 *	@return  Returns true if isSourceDsnPsInfo88110() is "Y"
	 */
   public boolean isSourceDsnPsInfo88110() throws CFException {
      return (  compareChars( getSourceDsnSpaceInd110() , sourceDsnPsInfo8811088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSourceDsnPsInfo88110True() {  			
    	setSourceDsnSpaceInd110( sourceDsnPsInfo8811088Value);
   	}
	char[] sourceDsnAllcInfo8811088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSourceDsnAllcInfo88110()
	 *	@return  Returns true if isSourceDsnAllcInfo88110() is "N"
	 */
   public boolean isSourceDsnAllcInfo88110() throws CFException {
      return (  compareChars( getSourceDsnSpaceInd110() , sourceDsnAllcInfo8811088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSourceDsnAllcInfo88110True() {  			
    	setSourceDsnSpaceInd110( sourceDsnAllcInfo8811088Value);
   	}
	/**
	 *	Returns the value of statusAssignmentOption110
	 *	@return statusAssignmentOption110
	 */
   public char[] getStatusAssignmentOption110() throws CFException{
   		return statusAssignmentOption110;
   }

  
	/**
	*  set variable statusAssignmentOption110
	*  Corresponding COBOL Variable is 110-STATUS-ASSIGNMENT-OPTION
	*  @param value
	**/
   public void setStatusAssignmentOption110(char[] value) {
       value = checkStatusAssignmentOption110Constraints(value);
       arraycopy(value,0,statusAssignmentOption110,0,value.length);
   } 
	public void setStatusAssignmentOption110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,statusAssignmentOption110,0,beginIndex + endIndex);
   }
	char[] statusAssign8811088Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isStatusAssign88110()
	 *	@return  Returns true if isStatusAssign88110() is "A"
	 */
   public boolean isStatusAssign88110() throws CFException {
      return (  compareChars( getStatusAssignmentOption110() , statusAssign8811088Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setStatusAssign88110True() {  			
    	setStatusAssignmentOption110( statusAssign8811088Value);
   	}
	char[] statusPreSet8811088Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isStatusPreSet88110()
	 *	@return  Returns true if isStatusPreSet88110() is "P"
	 */
   public boolean isStatusPreSet88110() throws CFException {
      return (  compareChars( getStatusAssignmentOption110() , statusPreSet8811088Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setStatusPreSet88110True() {  			
    	setStatusAssignmentOption110( statusPreSet8811088Value);
   	}
	/**
	 *	Returns the value of logQueIndicator110
	 *	@return logQueIndicator110
	 */
   public char[] getLogQueIndicator110() throws CFException{
   		return logQueIndicator110;
   }

  
	/**
	*  set variable logQueIndicator110
	*  Corresponding COBOL Variable is 110-LOG-QUE-INDICATOR
	*  @param value
	**/
   public void setLogQueIndicator110(char[] value) {
       value = checkLogQueIndicator110Constraints(value);
       arraycopy(value,0,logQueIndicator110,0,value.length);
   } 
	public void setLogQueIndicator110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,logQueIndicator110,0,beginIndex + endIndex);
   }
	char[] logQueEmpty8811088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isLogQueEmpty88110()
	 *	@return  Returns true if isLogQueEmpty88110() is "E"
	 */
   public boolean isLogQueEmpty88110() throws CFException {
      return (  compareChars( getLogQueIndicator110() , logQueEmpty8811088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setLogQueEmpty88110True() {  			
    	setLogQueIndicator110( logQueEmpty8811088Value);
   	}
	char[] logQuePopulated8811088Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isLogQuePopulated88110()
	 *	@return  Returns true if isLogQuePopulated88110() is "P"
	 */
   public boolean isLogQuePopulated88110() throws CFException {
      return (  compareChars( getLogQueIndicator110() , logQuePopulated8811088Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setLogQuePopulated88110True() {  			
    	setLogQueIndicator110( logQuePopulated8811088Value);
   	}
	/**
	 *	Returns the value of skipByteCountInd110
	 *	@return skipByteCountInd110
	 */
   public char[] getSkipByteCountInd110() throws CFException{
   		return skipByteCountInd110;
   }

  
	/**
	*  set variable skipByteCountInd110
	*  Corresponding COBOL Variable is 110-SKIP-BYTE-COUNT-IND
	*  @param value
	**/
   public void setSkipByteCountInd110(char[] value) {
       value = checkSkipByteCountInd110Constraints(value);
       arraycopy(value,0,skipByteCountInd110,0,value.length);
   } 
	public void setSkipByteCountInd110(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,skipByteCountInd110,0,beginIndex + endIndex);
   }
	char[] skipByteCount8811088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSkipByteCount88110()
	 *	@return  Returns true if isSkipByteCount88110() is "Y"
	 */
   public boolean isSkipByteCount88110() throws CFException {
      return (  compareChars( getSkipByteCountInd110() , skipByteCount8811088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSkipByteCount88110True() {  			
    	setSkipByteCountInd110( skipByteCount8811088Value);
   	}
	char[] performByteCount8811088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isPerformByteCount88110()
	 *	@return  Returns true if isPerformByteCount88110() is "N"
	 */
   public boolean isPerformByteCount88110() throws CFException {
      return (  compareChars( getSkipByteCountInd110() , performByteCount8811088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setPerformByteCount88110True() {  			
    	setSkipByteCountInd110( performByteCount8811088Value);
   	}
	/**
	 *	Returns the value of pgmMcdynam300
	 *	@return pgmMcdynam300
	 */
   public char[] getPgmMcdynam300() throws CFException{
   		return pgmMcdynam300;
   }

  
	/**
	*  set variable pgmMcdynam300
	*  Corresponding COBOL Variable is 300-PGM-MCDYNAM
	*  @param value
	**/
   public void setPgmMcdynam300(char[] value) {
       value = checkPgmMcdynam300Constraints(value);
       arraycopy(value,0,pgmMcdynam300,0,value.length);
   } 
	public void setPgmMcdynam300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmMcdynam300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmMcwait300
	 *	@return pgmMcwait300
	 */
   public char[] getPgmMcwait300() throws CFException{
   		return pgmMcwait300;
   }

  
	/**
	*  set variable pgmMcwait300
	*  Corresponding COBOL Variable is 300-PGM-MCWAIT
	*  @param value
	**/
   public void setPgmMcwait300(char[] value) {
       value = checkPgmMcwait300Constraints(value);
       arraycopy(value,0,pgmMcwait300,0,value.length);
   } 
	public void setPgmMcwait300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmMcwait300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmAr648010300
	 *	@return pgmAr648010300
	 */
   public char[] getPgmAr648010300() throws CFException{
   		return pgmAr648010300;
   }

  
	/**
	*  set variable pgmAr648010300
	*  Corresponding COBOL Variable is 300-PGM-AR648010
	*  @param value
	**/
   public void setPgmAr648010300(char[] value) {
       value = checkPgmAr648010300Constraints(value);
       arraycopy(value,0,pgmAr648010300,0,value.length);
   } 
	public void setPgmAr648010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmAr648010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of spaceCount310
	 *	@return spaceCount310
	 */
	public int getSpaceCount310() throws CFException {
       if (isSpaceCount310Modified()) { 
           spaceCount310 = refreshSpaceCount310();
        }
   		return spaceCount310;
	}
	

	
	   
	/**
	 * 	Update SpaceCount310 with the passed value
	 *  Corresponding COBOL Variable is 310-SPACE-COUNT
	 *	@param number
	 */
	public void setSpaceCount310(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    spaceCount310 = checkSpaceCount310MaxLimit(number); 
		serializeSpaceCount310(spaceCount310);
	}
	

	public void setSpaceCount310(long number) {
	    number = checkSpaceCount310MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSpaceCount310((int)number);
	}
	
	/**
	 * 	Update SpaceCount310 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSpaceCount310(char[] value) throws CFException {
		 spaceCount310 = serializeSpaceCount310(value);
	}
	/**
	 * 	Update SpaceCount310 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSpaceCount310String(char[] value) throws CFException {
		 setSpaceCount310(value);
	}
	/**
	 *	Returns the value of tildeCount310
	 *	@return tildeCount310
	 */
	public int getTildeCount310() throws CFException {
       if (isTildeCount310Modified()) { 
           tildeCount310 = refreshTildeCount310();
        }
   		return tildeCount310;
	}
	

	
	   
	/**
	 * 	Update TildeCount310 with the passed value
	 *  Corresponding COBOL Variable is 310-TILDE-COUNT
	 *	@param number
	 */
	public void setTildeCount310(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tildeCount310 = checkTildeCount310MaxLimit(number); 
		serializeTildeCount310(tildeCount310);
	}
	

	public void setTildeCount310(long number) {
	    number = checkTildeCount310MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTildeCount310((int)number);
	}
	
	/**
	 * 	Update TildeCount310 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTildeCount310(char[] value) throws CFException {
		 tildeCount310 = serializeTildeCount310(value);
	}
	/**
	 * 	Update TildeCount310 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTildeCount310String(char[] value) throws CFException {
		 setTildeCount310(value);
	}
	/**
	 *	Returns the value of tildeCount1310
	 *	@return tildeCount1310
	 */
	public int getTildeCount1310() throws CFException {
       if (isTildeCount1310Modified()) { 
           tildeCount1310 = refreshTildeCount1310();
        }
   		return tildeCount1310;
	}
	

	
	   
	/**
	 * 	Update TildeCount1310 with the passed value
	 *  Corresponding COBOL Variable is 310-TILDE-COUNT1
	 *	@param number
	 */
	public void setTildeCount1310(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tildeCount1310 = checkTildeCount1310MaxLimit(number); 
		serializeTildeCount1310(tildeCount1310);
	}
	

	public void setTildeCount1310(long number) {
	    number = checkTildeCount1310MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTildeCount1310((int)number);
	}
	
	/**
	 * 	Update TildeCount1310 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTildeCount1310(char[] value) throws CFException {
		 tildeCount1310 = serializeTildeCount1310(value);
	}
	/**
	 * 	Update TildeCount1310 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTildeCount1310String(char[] value) throws CFException {
		 setTildeCount1310(value);
	}
	/**
	 *	Returns the value of pipeCount310
	 *	@return pipeCount310
	 */
	public int getPipeCount310() throws CFException {
       if (isPipeCount310Modified()) { 
           pipeCount310 = refreshPipeCount310();
        }
   		return pipeCount310;
	}
	

	
	   
	/**
	 * 	Update PipeCount310 with the passed value
	 *  Corresponding COBOL Variable is 310-PIPE-COUNT
	 *	@param number
	 */
	public void setPipeCount310(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    pipeCount310 = checkPipeCount310MaxLimit(number); 
		serializePipeCount310(pipeCount310);
	}
	

	public void setPipeCount310(long number) {
	    number = checkPipeCount310MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPipeCount310((int)number);
	}
	
	/**
	 * 	Update PipeCount310 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPipeCount310(char[] value) throws CFException {
		 pipeCount310 = serializePipeCount310(value);
	}
	/**
	 * 	Update PipeCount310 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPipeCount310String(char[] value) throws CFException {
		 setPipeCount310(value);
	}
	/**
	 *	Returns the value of scolCount310
	 *	@return scolCount310
	 */
	public int getScolCount310() throws CFException {
       if (isScolCount310Modified()) { 
           scolCount310 = refreshScolCount310();
        }
   		return scolCount310;
	}
	

	
	   
	/**
	 * 	Update ScolCount310 with the passed value
	 *  Corresponding COBOL Variable is 310-SCOL-COUNT
	 *	@param number
	 */
	public void setScolCount310(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    scolCount310 = checkScolCount310MaxLimit(number); 
		serializeScolCount310(scolCount310);
	}
	

	public void setScolCount310(long number) {
	    number = checkScolCount310MaxLimit(number); // Truncate if value is beyond +/- Max range
		setScolCount310((int)number);
	}
	
	/**
	 * 	Update ScolCount310 with the passed value
	 *	@param value (String or char[])
	 */
	public void setScolCount310(char[] value) throws CFException {
		 scolCount310 = serializeScolCount310(value);
	}
	/**
	 * 	Update ScolCount310 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setScolCount310String(char[] value) throws CFException {
		 setScolCount310(value);
	}
	/**
	 *	Returns the value of binaryOne310
	 *	@return binaryOne310
	 */
	public short getBinaryOne310() throws CFException {
   		return binaryOne310;
	}
	
	/**
	 * 	Update BinaryOne310 with the passed value
	 *  Corresponding COBOL Variable is 310-BINARY-ONE
	 *	@param number
	 */
	public void setBinaryOne310(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binaryOne310 = checkBinaryOne310MaxLimit(number); 
	}

	public void setBinaryOne310(int number) {
	    number = checkBinaryOne310MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinaryOne310((short)number);
	}
	public void setBinaryOne310(long number) {
	    number = checkBinaryOne310MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinaryOne310((short)number);
	}
	

	/**
	 *	Returns the value of binaryFour310
	 *	@return binaryFour310
	 */
	public short getBinaryFour310() throws CFException {
   		return binaryFour310;
	}
	
	/**
	 * 	Update BinaryFour310 with the passed value
	 *  Corresponding COBOL Variable is 310-BINARY-FOUR
	 *	@param number
	 */
	public void setBinaryFour310(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binaryFour310 = checkBinaryFour310MaxLimit(number); 
	}

	public void setBinaryFour310(int number) {
	    number = checkBinaryFour310MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinaryFour310((short)number);
	}
	public void setBinaryFour310(long number) {
	    number = checkBinaryFour310MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinaryFour310((short)number);
	}
	

	/**
	 *	Returns the value of binaryFive310
	 *	@return binaryFive310
	 */
	public short getBinaryFive310() throws CFException {
   		return binaryFive310;
	}
	
	/**
	 * 	Update BinaryFive310 with the passed value
	 *  Corresponding COBOL Variable is 310-BINARY-FIVE
	 *	@param number
	 */
	public void setBinaryFive310(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binaryFive310 = checkBinaryFive310MaxLimit(number); 
	}

	public void setBinaryFive310(int number) {
	    number = checkBinaryFive310MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinaryFive310((short)number);
	}
	public void setBinaryFive310(long number) {
	    number = checkBinaryFive310MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinaryFive310((short)number);
	}
	

	/**
	 *	Returns the value of binaryThirteen310
	 *	@return binaryThirteen310
	 */
	public short getBinaryThirteen310() throws CFException {
   		return binaryThirteen310;
	}
	
	/**
	 * 	Update BinaryThirteen310 with the passed value
	 *  Corresponding COBOL Variable is 310-BINARY-THIRTEEN
	 *	@param number
	 */
	public void setBinaryThirteen310(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binaryThirteen310 = checkBinaryThirteen310MaxLimit(number); 
	}

	public void setBinaryThirteen310(int number) {
	    number = checkBinaryThirteen310MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinaryThirteen310((short)number);
	}
	public void setBinaryThirteen310(long number) {
	    number = checkBinaryThirteen310MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinaryThirteen310((short)number);
	}
	

	/**
	 *	Returns the value of binaryEighty310
	 *	@return binaryEighty310
	 */
	public short getBinaryEighty310() throws CFException {
   		return binaryEighty310;
	}
	
	/**
	 * 	Update BinaryEighty310 with the passed value
	 *  Corresponding COBOL Variable is 310-BINARY-EIGHTY
	 *	@param number
	 */
	public void setBinaryEighty310(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binaryEighty310 = checkBinaryEighty310MaxLimit(number); 
	}

	public void setBinaryEighty310(int number) {
	    number = checkBinaryEighty310MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinaryEighty310((short)number);
	}
	public void setBinaryEighty310(long number) {
	    number = checkBinaryEighty310MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinaryEighty310((short)number);
	}
	

	/**
	 *	Returns the value of binaryLrecl133310
	 *	@return binaryLrecl133310
	 */
	public short getBinaryLrecl133310() throws CFException {
   		return binaryLrecl133310;
	}
	
	/**
	 * 	Update BinaryLrecl133310 with the passed value
	 *  Corresponding COBOL Variable is 310-BINARY-LRECL-133
	 *	@param number
	 */
	public void setBinaryLrecl133310(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binaryLrecl133310 = checkBinaryLrecl133310MaxLimit(number); 
	}

	public void setBinaryLrecl133310(int number) {
	    number = checkBinaryLrecl133310MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinaryLrecl133310((short)number);
	}
	public void setBinaryLrecl133310(long number) {
	    number = checkBinaryLrecl133310MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinaryLrecl133310((short)number);
	}
	

	/**
	 *	Returns the value of minusOne310
	 *	@return minusOne310
	 */
	public short getMinusOne310() throws CFException {
   		return minusOne310;
	}
	
	/**
	 * 	Update MinusOne310 with the passed value
	 *  Corresponding COBOL Variable is 310-MINUS-ONE
	 *	@param number
	 */
	public void setMinusOne310(short number) {
	     // Truncate if the number is beyond +/- Max range
	    minusOne310 = checkMinusOne310MaxLimit(number); 
	}

	public void setMinusOne310(int number) {
	    number = checkMinusOne310MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMinusOne310((short)number);
	}
	public void setMinusOne310(long number) {
	    number = checkMinusOne310MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMinusOne310((short)number);
	}
	

	/**
	 *	Returns the value of binaryControlBlksz310
	 *	@return binaryControlBlksz310
	 */
	public int getBinaryControlBlksz310() throws CFException {
   		return binaryControlBlksz310;
	}
	
	/**
	 * 	Update BinaryControlBlksz310 with the passed value
	 *  Corresponding COBOL Variable is 310-BINARY-CONTROL-BLKSZ
	 *	@param number
	 */
	public void setBinaryControlBlksz310(int number) {
	     // Truncate if the number is beyond +/- Max range
	    binaryControlBlksz310 = checkBinaryControlBlksz310MaxLimit(number); 
	}


	public void setBinaryControlBlksz310(long number) {
	    number = checkBinaryControlBlksz310MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBinaryControlBlksz310((int)number);
	}
	
	/**
	 *	Returns the value of binarySysoutBlksz310
	 *	@return binarySysoutBlksz310
	 */
	public int getBinarySysoutBlksz310() throws CFException {
   		return binarySysoutBlksz310;
	}
	
	/**
	 * 	Update BinarySysoutBlksz310 with the passed value
	 *  Corresponding COBOL Variable is 310-BINARY-SYSOUT-BLKSZ
	 *	@param number
	 */
	public void setBinarySysoutBlksz310(int number) {
	     // Truncate if the number is beyond +/- Max range
	    binarySysoutBlksz310 = checkBinarySysoutBlksz310MaxLimit(number); 
	}


	public void setBinarySysoutBlksz310(long number) {
	    number = checkBinarySysoutBlksz310MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBinarySysoutBlksz310((int)number);
	}
	
	/**
	 *	Returns the value of binaryListddpoBlksz310
	 *	@return binaryListddpoBlksz310
	 */
	public int getBinaryListddpoBlksz310() throws CFException {
   		return binaryListddpoBlksz310;
	}
	
	/**
	 * 	Update BinaryListddpoBlksz310 with the passed value
	 *  Corresponding COBOL Variable is 310-BINARY-LISTDDPO-BLKSZ
	 *	@param number
	 */
	public void setBinaryListddpoBlksz310(int number) {
	     // Truncate if the number is beyond +/- Max range
	    binaryListddpoBlksz310 = checkBinaryListddpoBlksz310MaxLimit(number); 
	}


	public void setBinaryListddpoBlksz310(long number) {
	    number = checkBinaryListddpoBlksz310MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBinaryListddpoBlksz310((int)number);
	}
	
	/**
	 *	Returns the value of binControlBlksz310
	 *	@return binControlBlksz310
	 */
	public int getBinControlBlksz310() throws CFException {
   		return binControlBlksz310;
	}
	
	/**
	 * 	Update BinControlBlksz310 with the passed value
	 *  Corresponding COBOL Variable is 310-BIN-CONTROL-BLKSZ
	 *	@param number
	 */
	public void setBinControlBlksz310(int number) {
	     // Truncate if the number is beyond +/- Max range
	    binControlBlksz310 = checkBinControlBlksz310MaxLimit(number); 
	}


	public void setBinControlBlksz310(long number) {
	    number = checkBinControlBlksz310MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBinControlBlksz310((int)number);
	}
	
	/**
	 *	Returns the value of binSysoutBlksz310
	 *	@return binSysoutBlksz310
	 */
	public int getBinSysoutBlksz310() throws CFException {
   		return binSysoutBlksz310;
	}
	
	/**
	 * 	Update BinSysoutBlksz310 with the passed value
	 *  Corresponding COBOL Variable is 310-BIN-SYSOUT-BLKSZ
	 *	@param number
	 */
	public void setBinSysoutBlksz310(int number) {
	     // Truncate if the number is beyond +/- Max range
	    binSysoutBlksz310 = checkBinSysoutBlksz310MaxLimit(number); 
	}


	public void setBinSysoutBlksz310(long number) {
	    number = checkBinSysoutBlksz310MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBinSysoutBlksz310((int)number);
	}
	
	/**
	 *	Returns the value of binListddpoBlksz310
	 *	@return binListddpoBlksz310
	 */
	public int getBinListddpoBlksz310() throws CFException {
   		return binListddpoBlksz310;
	}
	
	/**
	 * 	Update BinListddpoBlksz310 with the passed value
	 *  Corresponding COBOL Variable is 310-BIN-LISTDDPO-BLKSZ
	 *	@param number
	 */
	public void setBinListddpoBlksz310(int number) {
	     // Truncate if the number is beyond +/- Max range
	    binListddpoBlksz310 = checkBinListddpoBlksz310MaxLimit(number); 
	}


	public void setBinListddpoBlksz310(long number) {
	    number = checkBinListddpoBlksz310MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBinListddpoBlksz310((int)number);
	}
	
	/**
	 *	Returns the value of binLrecl133310
	 *	@return binLrecl133310
	 */
	public short getBinLrecl133310() throws CFException {
   		return binLrecl133310;
	}
	
	/**
	 * 	Update BinLrecl133310 with the passed value
	 *  Corresponding COBOL Variable is 310-BIN-LRECL-133
	 *	@param number
	 */
	public void setBinLrecl133310(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binLrecl133310 = checkBinLrecl133310MaxLimit(number); 
	}

	public void setBinLrecl133310(int number) {
	    number = checkBinLrecl133310MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinLrecl133310((short)number);
	}
	public void setBinLrecl133310(long number) {
	    number = checkBinLrecl133310MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinLrecl133310((short)number);
	}
	

	public short getPackedOne310() throws CFException {
        if (isPackedOne310Modified()) { 
           packedOne310 = refreshPackedOne310();
        }
   		return packedOne310;
	}
	
	/**
	 * 	Update PackedOne310 with the passed value
	 *  Corresponding COBOL Variable is 310-PACKED-ONE
	 *	@param number
	 */
	public void setPackedOne310(short number) {
			packedOne310 = checkPackedOne310MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePackedOne310(packedOne310);
	}

	public void setPackedOne310(int number) {
	    number = checkPackedOne310MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPackedOne310((short)number);
	}
	public void setPackedOne310(long number) {
	    number = checkPackedOne310MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPackedOne310((short)number);
	}
	

	/**
	 *	Returns the value of zonedTwentyeight310
	 *	@return zonedTwentyeight310
	 */
	public int getZonedTwentyeight310() throws CFException {
       if (isZonedTwentyeight310Modified()) { 
           zonedTwentyeight310 = refreshZonedTwentyeight310();
        }
   		return zonedTwentyeight310;
	}
	

	
	   
	/**
	 * 	Update ZonedTwentyeight310 with the passed value
	 *  Corresponding COBOL Variable is 310-ZONED-TWENTYEIGHT
	 *	@param number
	 */
	public void setZonedTwentyeight310(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    zonedTwentyeight310 = checkZonedTwentyeight310MaxLimit(number); 
		serializeZonedTwentyeight310(zonedTwentyeight310);
	}
	

	public void setZonedTwentyeight310(long number) {
	    number = checkZonedTwentyeight310MaxLimit(number); // Truncate if value is beyond +/- Max range
		setZonedTwentyeight310((int)number);
	}
	
	/**
	 * 	Update ZonedTwentyeight310 with the passed value
	 *	@param value (String or char[])
	 */
	public void setZonedTwentyeight310(char[] value) throws CFException {
		 zonedTwentyeight310 = serializeZonedTwentyeight310(value);
	}
	/**
	 * 	Update ZonedTwentyeight310 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setZonedTwentyeight310String(char[] value) throws CFException {
		 setZonedTwentyeight310(value);
	}
	/**
	 *	Returns the value of zonedTwentynine310
	 *	@return zonedTwentynine310
	 */
	public int getZonedTwentynine310() throws CFException {
       if (isZonedTwentynine310Modified()) { 
           zonedTwentynine310 = refreshZonedTwentynine310();
        }
   		return zonedTwentynine310;
	}
	

	
	   
	/**
	 * 	Update ZonedTwentynine310 with the passed value
	 *  Corresponding COBOL Variable is 310-ZONED-TWENTYNINE
	 *	@param number
	 */
	public void setZonedTwentynine310(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    zonedTwentynine310 = checkZonedTwentynine310MaxLimit(number); 
		serializeZonedTwentynine310(zonedTwentynine310);
	}
	

	public void setZonedTwentynine310(long number) {
	    number = checkZonedTwentynine310MaxLimit(number); // Truncate if value is beyond +/- Max range
		setZonedTwentynine310((int)number);
	}
	
	/**
	 * 	Update ZonedTwentynine310 with the passed value
	 *	@param value (String or char[])
	 */
	public void setZonedTwentynine310(char[] value) throws CFException {
		 zonedTwentynine310 = serializeZonedTwentynine310(value);
	}
	/**
	 * 	Update ZonedTwentynine310 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setZonedTwentynine310String(char[] value) throws CFException {
		 setZonedTwentynine310(value);
	}
	/**
	 *	Returns the value of zoned0080310
	 *	@return zoned0080310
	 */
	public int getZoned0080310() throws CFException {
       if (isZoned0080310Modified()) { 
           zoned0080310 = refreshZoned0080310();
        }
   		return zoned0080310;
	}
	

	
	   
	/**
	 * 	Update Zoned0080310 with the passed value
	 *  Corresponding COBOL Variable is 310-ZONED-0080
	 *	@param number
	 */
	public void setZoned0080310(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    zoned0080310 = checkZoned0080310MaxLimit(number); 
		serializeZoned0080310(zoned0080310);
	}
	

	public void setZoned0080310(long number) {
	    number = checkZoned0080310MaxLimit(number); // Truncate if value is beyond +/- Max range
		setZoned0080310((int)number);
	}
	
	/**
	 * 	Update Zoned0080310 with the passed value
	 *	@param value (String or char[])
	 */
	public void setZoned0080310(char[] value) throws CFException {
		 zoned0080310 = serializeZoned0080310(value);
	}
	/**
	 * 	Update Zoned0080310 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setZoned0080310String(char[] value) throws CFException {
		 setZoned0080310(value);
	}
	/**
	 *	Returns the value of sqlSuccess330
	 *	@return sqlSuccess330
	 */
	public short getSqlSuccess330() throws CFException {
   		return sqlSuccess330;
	}
	
	/**
	 * 	Update SqlSuccess330 with the passed value
	 *  Corresponding COBOL Variable is 330-SQL-SUCCESS
	 *	@param number
	 */
	public void setSqlSuccess330(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlSuccess330 = checkSqlSuccess330MaxLimit(number); 
	}

	public void setSqlSuccess330(int number) {
	    number = checkSqlSuccess330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlSuccess330((short)number);
	}
	public void setSqlSuccess330(long number) {
	    number = checkSqlSuccess330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlSuccess330((short)number);
	}
	

	/**
	 *	Returns the value of sqlRowNotFound330
	 *	@return sqlRowNotFound330
	 */
	public short getSqlRowNotFound330() throws CFException {
   		return sqlRowNotFound330;
	}
	
	/**
	 * 	Update SqlRowNotFound330 with the passed value
	 *  Corresponding COBOL Variable is 330-SQL-ROW-NOT-FOUND
	 *	@param number
	 */
	public void setSqlRowNotFound330(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlRowNotFound330 = checkSqlRowNotFound330MaxLimit(number); 
	}

	public void setSqlRowNotFound330(int number) {
	    number = checkSqlRowNotFound330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlRowNotFound330((short)number);
	}
	public void setSqlRowNotFound330(long number) {
	    number = checkSqlRowNotFound330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlRowNotFound330((short)number);
	}
	

	/**
	 *	Returns the value of sqlCursorNotOpen330
	 *	@return sqlCursorNotOpen330
	 */
	public short getSqlCursorNotOpen330() throws CFException {
   		return sqlCursorNotOpen330;
	}
	
	/**
	 * 	Update SqlCursorNotOpen330 with the passed value
	 *  Corresponding COBOL Variable is 330-SQL-CURSOR-NOT-OPEN
	 *	@param number
	 */
	public void setSqlCursorNotOpen330(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlCursorNotOpen330 = checkSqlCursorNotOpen330MaxLimit(number); 
	}

	public void setSqlCursorNotOpen330(int number) {
	    number = checkSqlCursorNotOpen330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlCursorNotOpen330((short)number);
	}
	public void setSqlCursorNotOpen330(long number) {
	    number = checkSqlCursorNotOpen330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlCursorNotOpen330((short)number);
	}
	

	/**
	 *	Returns the value of sqlRowDuplicate330
	 *	@return sqlRowDuplicate330
	 */
	public short getSqlRowDuplicate330() throws CFException {
   		return sqlRowDuplicate330;
	}
	
	/**
	 * 	Update SqlRowDuplicate330 with the passed value
	 *  Corresponding COBOL Variable is 330-SQL-ROW-DUPLICATE
	 *	@param number
	 */
	public void setSqlRowDuplicate330(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlRowDuplicate330 = checkSqlRowDuplicate330MaxLimit(number); 
	}

	public void setSqlRowDuplicate330(int number) {
	    number = checkSqlRowDuplicate330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlRowDuplicate330((short)number);
	}
	public void setSqlRowDuplicate330(long number) {
	    number = checkSqlRowDuplicate330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlRowDuplicate330((short)number);
	}
	

	/**
	 *	Returns the value of sqlResourceUnavail330
	 *	@return sqlResourceUnavail330
	 */
	public short getSqlResourceUnavail330() throws CFException {
   		return sqlResourceUnavail330;
	}
	
	/**
	 * 	Update SqlResourceUnavail330 with the passed value
	 *  Corresponding COBOL Variable is 330-SQL-RESOURCE-UNAVAIL
	 *	@param number
	 */
	public void setSqlResourceUnavail330(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlResourceUnavail330 = checkSqlResourceUnavail330MaxLimit(number); 
	}

	public void setSqlResourceUnavail330(int number) {
	    number = checkSqlResourceUnavail330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlResourceUnavail330((short)number);
	}
	public void setSqlResourceUnavail330(long number) {
	    number = checkSqlResourceUnavail330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlResourceUnavail330((short)number);
	}
	

	/**
	 *	Returns the value of sqlResourceLimit330
	 *	@return sqlResourceLimit330
	 */
	public short getSqlResourceLimit330() throws CFException {
   		return sqlResourceLimit330;
	}
	
	/**
	 * 	Update SqlResourceLimit330 with the passed value
	 *  Corresponding COBOL Variable is 330-SQL-RESOURCE-LIMIT
	 *	@param number
	 */
	public void setSqlResourceLimit330(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlResourceLimit330 = checkSqlResourceLimit330MaxLimit(number); 
	}

	public void setSqlResourceLimit330(int number) {
	    number = checkSqlResourceLimit330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlResourceLimit330((short)number);
	}
	public void setSqlResourceLimit330(long number) {
	    number = checkSqlResourceLimit330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlResourceLimit330((short)number);
	}
	

	/**
	 *	Returns the value of sqlWorkunitRollback330
	 *	@return sqlWorkunitRollback330
	 */
	public short getSqlWorkunitRollback330() throws CFException {
   		return sqlWorkunitRollback330;
	}
	
	/**
	 * 	Update SqlWorkunitRollback330 with the passed value
	 *  Corresponding COBOL Variable is 330-SQL-WORKUNIT-ROLLBACK
	 *	@param number
	 */
	public void setSqlWorkunitRollback330(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlWorkunitRollback330 = checkSqlWorkunitRollback330MaxLimit(number); 
	}

	public void setSqlWorkunitRollback330(int number) {
	    number = checkSqlWorkunitRollback330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlWorkunitRollback330((short)number);
	}
	public void setSqlWorkunitRollback330(long number) {
	    number = checkSqlWorkunitRollback330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlWorkunitRollback330((short)number);
	}
	

	/**
	 *	Returns the value of sqlExecUnsuccessful330
	 *	@return sqlExecUnsuccessful330
	 */
	public short getSqlExecUnsuccessful330() throws CFException {
   		return sqlExecUnsuccessful330;
	}
	
	/**
	 * 	Update SqlExecUnsuccessful330 with the passed value
	 *  Corresponding COBOL Variable is 330-SQL-EXEC-UNSUCCESSFUL
	 *	@param number
	 */
	public void setSqlExecUnsuccessful330(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlExecUnsuccessful330 = checkSqlExecUnsuccessful330MaxLimit(number); 
	}

	public void setSqlExecUnsuccessful330(int number) {
	    number = checkSqlExecUnsuccessful330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlExecUnsuccessful330((short)number);
	}
	public void setSqlExecUnsuccessful330(long number) {
	    number = checkSqlExecUnsuccessful330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlExecUnsuccessful330((short)number);
	}
	

	/**
	 *	Returns the value of sqlColUsed330
	 *	@return sqlColUsed330
	 */
	public short getSqlColUsed330() throws CFException {
   		return sqlColUsed330;
	}
	
	/**
	 * 	Update SqlColUsed330 with the passed value
	 *  Corresponding COBOL Variable is 330-SQL-COL-USED
	 *	@param number
	 */
	public void setSqlColUsed330(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlColUsed330 = checkSqlColUsed330MaxLimit(number); 
	}

	public void setSqlColUsed330(int number) {
	    number = checkSqlColUsed330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlColUsed330((short)number);
	}
	public void setSqlColUsed330(long number) {
	    number = checkSqlColUsed330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlColUsed330((short)number);
	}
	

	/**
	 *	Returns the value of sqlColNull330
	 *	@return sqlColNull330
	 */
	public short getSqlColNull330() throws CFException {
   		return sqlColNull330;
	}
	
	/**
	 * 	Update SqlColNull330 with the passed value
	 *  Corresponding COBOL Variable is 330-SQL-COL-NULL
	 *	@param number
	 */
	public void setSqlColNull330(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlColNull330 = checkSqlColNull330MaxLimit(number); 
	}

	public void setSqlColNull330(int number) {
	    number = checkSqlColNull330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlColNull330((short)number);
	}
	public void setSqlColNull330(long number) {
	    number = checkSqlColNull330MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlColNull330((short)number);
	}
	

	/**
	 *	Returns the value of sqlSqlerrd3Deadlock330
	 *	@return sqlSqlerrd3Deadlock330
	 */
	public int getSqlSqlerrd3Deadlock330() throws CFException {
   		return sqlSqlerrd3Deadlock330;
	}
	
	/**
	 * 	Update SqlSqlerrd3Deadlock330 with the passed value
	 *  Corresponding COBOL Variable is 330-SQL-SQLERRD3-DEADLOCK
	 *	@param number
	 */
	public void setSqlSqlerrd3Deadlock330(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlSqlerrd3Deadlock330 = checkSqlSqlerrd3Deadlock330MaxLimit(number); 
	}


	public void setSqlSqlerrd3Deadlock330(long number) {
	    number = checkSqlSqlerrd3Deadlock330MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSqlSqlerrd3Deadlock330((int)number);
	}
	
	/**
	 *	Returns the value of sqlSqlerrd3Timeout330
	 *	@return sqlSqlerrd3Timeout330
	 */
	public int getSqlSqlerrd3Timeout330() throws CFException {
   		return sqlSqlerrd3Timeout330;
	}
	
	/**
	 * 	Update SqlSqlerrd3Timeout330 with the passed value
	 *  Corresponding COBOL Variable is 330-SQL-SQLERRD3-TIMEOUT
	 *	@param number
	 */
	public void setSqlSqlerrd3Timeout330(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlSqlerrd3Timeout330 = checkSqlSqlerrd3Timeout330MaxLimit(number); 
	}


	public void setSqlSqlerrd3Timeout330(long number) {
	    number = checkSqlSqlerrd3Timeout330MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSqlSqlerrd3Timeout330((int)number);
	}
	
	/**
	 *	Returns the value of maximumCyl360
	 *	@return maximumCyl360
	 */
	public long getMaximumCyl360() throws CFException {
       if (isMaximumCyl360Modified()) { 
           maximumCyl360 = refreshMaximumCyl360();
        }
   		return maximumCyl360;
	}
	

	
	   
	/**
	 * 	Update MaximumCyl360 with the passed value
	 *  Corresponding COBOL Variable is 360-MAXIMUM-CYL
	 *	@param number
	 */
	public void setMaximumCyl360(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    maximumCyl360 = checkMaximumCyl360MaxLimit(number); 
		serializeMaximumCyl360(maximumCyl360);
	}
	

	/**
	 * 	Update MaximumCyl360 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaximumCyl360(char[] value) throws CFException {
		 maximumCyl360 = serializeMaximumCyl360(value);
	}
	/**
	 * 	Update MaximumCyl360 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaximumCyl360String(char[] value) throws CFException {
		 setMaximumCyl360(value);
	}
	/**
	 *	Returns the value of maximumTrk360
	 *	@return maximumTrk360
	 */
	public long getMaximumTrk360() throws CFException {
       if (isMaximumTrk360Modified()) { 
           maximumTrk360 = refreshMaximumTrk360();
        }
   		return maximumTrk360;
	}
	

	
	   
	/**
	 * 	Update MaximumTrk360 with the passed value
	 *  Corresponding COBOL Variable is 360-MAXIMUM-TRK
	 *	@param number
	 */
	public void setMaximumTrk360(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    maximumTrk360 = checkMaximumTrk360MaxLimit(number); 
		serializeMaximumTrk360(maximumTrk360);
	}
	

	/**
	 * 	Update MaximumTrk360 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaximumTrk360(char[] value) throws CFException {
		 maximumTrk360 = serializeMaximumTrk360(value);
	}
	/**
	 * 	Update MaximumTrk360 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaximumTrk360String(char[] value) throws CFException {
		 setMaximumTrk360(value);
	}
	/**
	 *	Returns the value of maximumBlk360
	 *	@return maximumBlk360
	 */
	public long getMaximumBlk360() throws CFException {
       if (isMaximumBlk360Modified()) { 
           maximumBlk360 = refreshMaximumBlk360();
        }
   		return maximumBlk360;
	}
	

	
	   
	/**
	 * 	Update MaximumBlk360 with the passed value
	 *  Corresponding COBOL Variable is 360-MAXIMUM-BLK
	 *	@param number
	 */
	public void setMaximumBlk360(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    maximumBlk360 = checkMaximumBlk360MaxLimit(number); 
		serializeMaximumBlk360(maximumBlk360);
	}
	

	/**
	 * 	Update MaximumBlk360 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaximumBlk360(char[] value) throws CFException {
		 maximumBlk360 = serializeMaximumBlk360(value);
	}
	/**
	 * 	Update MaximumBlk360 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaximumBlk360String(char[] value) throws CFException {
		 setMaximumBlk360(value);
	}
	/**
	 *	Returns the value of maximumCylDeflt360
	 *	@return maximumCylDeflt360
	 */
	public long getMaximumCylDeflt360() throws CFException {
       if (isMaximumCylDeflt360Modified()) { 
           maximumCylDeflt360 = refreshMaximumCylDeflt360();
        }
   		return maximumCylDeflt360;
	}
	

	
	   
	/**
	 * 	Update MaximumCylDeflt360 with the passed value
	 *  Corresponding COBOL Variable is 360-MAXIMUM-CYL-DEFLT
	 *	@param number
	 */
	public void setMaximumCylDeflt360(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    maximumCylDeflt360 = checkMaximumCylDeflt360MaxLimit(number); 
		serializeMaximumCylDeflt360(maximumCylDeflt360);
	}
	

	/**
	 * 	Update MaximumCylDeflt360 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaximumCylDeflt360(char[] value) throws CFException {
		 maximumCylDeflt360 = serializeMaximumCylDeflt360(value);
	}
	/**
	 * 	Update MaximumCylDeflt360 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaximumCylDeflt360String(char[] value) throws CFException {
		 setMaximumCylDeflt360(value);
	}
	/**
	 *	Returns the value of maximumTrkDeflt360
	 *	@return maximumTrkDeflt360
	 */
	public long getMaximumTrkDeflt360() throws CFException {
       if (isMaximumTrkDeflt360Modified()) { 
           maximumTrkDeflt360 = refreshMaximumTrkDeflt360();
        }
   		return maximumTrkDeflt360;
	}
	

	
	   
	/**
	 * 	Update MaximumTrkDeflt360 with the passed value
	 *  Corresponding COBOL Variable is 360-MAXIMUM-TRK-DEFLT
	 *	@param number
	 */
	public void setMaximumTrkDeflt360(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    maximumTrkDeflt360 = checkMaximumTrkDeflt360MaxLimit(number); 
		serializeMaximumTrkDeflt360(maximumTrkDeflt360);
	}
	

	/**
	 * 	Update MaximumTrkDeflt360 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaximumTrkDeflt360(char[] value) throws CFException {
		 maximumTrkDeflt360 = serializeMaximumTrkDeflt360(value);
	}
	/**
	 * 	Update MaximumTrkDeflt360 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaximumTrkDeflt360String(char[] value) throws CFException {
		 setMaximumTrkDeflt360(value);
	}
	/**
	 *	Returns the value of maximumBlkDeflt360
	 *	@return maximumBlkDeflt360
	 */
	public long getMaximumBlkDeflt360() throws CFException {
       if (isMaximumBlkDeflt360Modified()) { 
           maximumBlkDeflt360 = refreshMaximumBlkDeflt360();
        }
   		return maximumBlkDeflt360;
	}
	

	
	   
	/**
	 * 	Update MaximumBlkDeflt360 with the passed value
	 *  Corresponding COBOL Variable is 360-MAXIMUM-BLK-DEFLT
	 *	@param number
	 */
	public void setMaximumBlkDeflt360(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    maximumBlkDeflt360 = checkMaximumBlkDeflt360MaxLimit(number); 
		serializeMaximumBlkDeflt360(maximumBlkDeflt360);
	}
	

	/**
	 * 	Update MaximumBlkDeflt360 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaximumBlkDeflt360(char[] value) throws CFException {
		 maximumBlkDeflt360 = serializeMaximumBlkDeflt360(value);
	}
	/**
	 * 	Update MaximumBlkDeflt360 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaximumBlkDeflt360String(char[] value) throws CFException {
		 setMaximumBlkDeflt360(value);
	}
	/**
	 *	Returns the value of sourceRecords400
	 *	@return sourceRecords400
	 */
	public int getSourceRecords400() throws CFException {
   		return sourceRecords400;
	}
	
	/**
	 * 	Update SourceRecords400 with the passed value
	 *  Corresponding COBOL Variable is 400-SOURCE-RECORDS
	 *	@param number
	 */
	public void setSourceRecords400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sourceRecords400 = checkSourceRecords400MaxLimit(number); 
	}


	public void setSourceRecords400(long number) {
	    number = checkSourceRecords400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSourceRecords400((int)number);
	}
	
	/**
	 *	Returns the value of sourceBytes400
	 *	@return sourceBytes400
	 */
	public long getSourceBytes400() throws CFException {
   		return sourceBytes400;
	}
	
	/**
	 * 	Update SourceBytes400 with the passed value
	 *  Corresponding COBOL Variable is 400-SOURCE-BYTES
	 *	@param number
	 */
	public void setSourceBytes400(long number) {
	     // Truncate if the number is beyond +/- Max range
	    sourceBytes400 = checkSourceBytes400MaxLimit(number); 
	}


	/**
	 *	Returns the value of headerRecords400
	 *	@return headerRecords400
	 */
	public int getHeaderRecords400() throws CFException {
   		return headerRecords400;
	}
	
	/**
	 * 	Update HeaderRecords400 with the passed value
	 *  Corresponding COBOL Variable is 400-HEADER-RECORDS
	 *	@param number
	 */
	public void setHeaderRecords400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    headerRecords400 = checkHeaderRecords400MaxLimit(number); 
	}


	public void setHeaderRecords400(long number) {
	    number = checkHeaderRecords400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setHeaderRecords400((int)number);
	}
	
	/**
	 *	Returns the value of headerBytes400
	 *	@return headerBytes400
	 */
	public int getHeaderBytes400() throws CFException {
   		return headerBytes400;
	}
	
	/**
	 * 	Update HeaderBytes400 with the passed value
	 *  Corresponding COBOL Variable is 400-HEADER-BYTES
	 *	@param number
	 */
	public void setHeaderBytes400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    headerBytes400 = checkHeaderBytes400MaxLimit(number); 
	}


	public void setHeaderBytes400(long number) {
	    number = checkHeaderBytes400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setHeaderBytes400((int)number);
	}
	
	/**
	 *	Returns the value of targetRecords400
	 *	@return targetRecords400
	 */
	public int getTargetRecords400() throws CFException {
   		return targetRecords400;
	}
	
	/**
	 * 	Update TargetRecords400 with the passed value
	 *  Corresponding COBOL Variable is 400-TARGET-RECORDS
	 *	@param number
	 */
	public void setTargetRecords400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    targetRecords400 = checkTargetRecords400MaxLimit(number); 
	}


	public void setTargetRecords400(long number) {
	    number = checkTargetRecords400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTargetRecords400((int)number);
	}
	
	/**
	 *	Returns the value of targetBytes400
	 *	@return targetBytes400
	 */
	public long getTargetBytes400() throws CFException {
   		return targetBytes400;
	}
	
	/**
	 * 	Update TargetBytes400 with the passed value
	 *  Corresponding COBOL Variable is 400-TARGET-BYTES
	 *	@param number
	 */
	public void setTargetBytes400(long number) {
	     // Truncate if the number is beyond +/- Max range
	    targetBytes400 = checkTargetBytes400MaxLimit(number); 
	}


	/**
	 *	Returns the value of endpointsValid400
	 *	@return endpointsValid400
	 */
	public int getEndpointsValid400() throws CFException {
   		return endpointsValid400;
	}
	
	/**
	 * 	Update EndpointsValid400 with the passed value
	 *  Corresponding COBOL Variable is 400-ENDPOINTS-VALID
	 *	@param number
	 */
	public void setEndpointsValid400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    endpointsValid400 = checkEndpointsValid400MaxLimit(number); 
	}


	public void setEndpointsValid400(long number) {
	    number = checkEndpointsValid400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEndpointsValid400((int)number);
	}
	
	/**
	 *	Returns the value of endpointsError400
	 *	@return endpointsError400
	 */
	public int getEndpointsError400() throws CFException {
   		return endpointsError400;
	}
	
	/**
	 * 	Update EndpointsError400 with the passed value
	 *  Corresponding COBOL Variable is 400-ENDPOINTS-ERROR
	 *	@param number
	 */
	public void setEndpointsError400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    endpointsError400 = checkEndpointsError400MaxLimit(number); 
	}


	public void setEndpointsError400(long number) {
	    number = checkEndpointsError400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEndpointsError400((int)number);
	}
	
	/**
	 *	Returns the value of endpointsListed400
	 *	@return endpointsListed400
	 */
	public int getEndpointsListed400() throws CFException {
   		return endpointsListed400;
	}
	
	/**
	 * 	Update EndpointsListed400 with the passed value
	 *  Corresponding COBOL Variable is 400-ENDPOINTS-LISTED
	 *	@param number
	 */
	public void setEndpointsListed400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    endpointsListed400 = checkEndpointsListed400MaxLimit(number); 
	}


	public void setEndpointsListed400(long number) {
	    number = checkEndpointsListed400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEndpointsListed400((int)number);
	}
	
	/**
	 *	Returns the value of allocateAttempts400
	 *	@return allocateAttempts400
	 */
	public int getAllocateAttempts400() throws CFException {
   		return allocateAttempts400;
	}
	
	/**
	 * 	Update AllocateAttempts400 with the passed value
	 *  Corresponding COBOL Variable is 400-ALLOCATE-ATTEMPTS
	 *	@param number
	 */
	public void setAllocateAttempts400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    allocateAttempts400 = checkAllocateAttempts400MaxLimit(number); 
	}


	public void setAllocateAttempts400(long number) {
	    number = checkAllocateAttempts400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAllocateAttempts400((int)number);
	}
	
	/**
	 *	Returns the value of sqlRetryAttempts400
	 *	@return sqlRetryAttempts400
	 */
	public short getSqlRetryAttempts400() throws CFException {
   		return sqlRetryAttempts400;
	}
	
	/**
	 * 	Update SqlRetryAttempts400 with the passed value
	 *  Corresponding COBOL Variable is 400-SQL-RETRY-ATTEMPTS
	 *	@param number
	 */
	public void setSqlRetryAttempts400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlRetryAttempts400 = checkSqlRetryAttempts400MaxLimit(number); 
	}

	public void setSqlRetryAttempts400(int number) {
	    number = checkSqlRetryAttempts400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlRetryAttempts400((short)number);
	}
	public void setSqlRetryAttempts400(long number) {
	    number = checkSqlRetryAttempts400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlRetryAttempts400((short)number);
	}
	

	public int getRequest410() throws CFException {
        if (isRequest410Modified()) { 
           request410 = refreshRequest410();
        }
   		return request410;
	}
	
	/**
	 * 	Update Request410 with the passed value
	 *  Corresponding COBOL Variable is 410-REQUEST
	 *	@param number
	 */
	public void setRequest410(int number) {
			request410 = checkRequest410MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeRequest410(request410);
	}


	public void setRequest410(long number) {
	    number = checkRequest410MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRequest410((int)number);
	}
	
	public short getError410() throws CFException {
        if (isError410Modified()) { 
           error410 = refreshError410();
        }
   		return error410;
	}
	
	/**
	 * 	Update Error410 with the passed value
	 *  Corresponding COBOL Variable is 410-ERROR
	 *	@param number
	 */
	public void setError410(short number) {
			error410 = checkError410MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeError410(error410);
	}

	public void setError410(int number) {
	    number = checkError410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError410((short)number);
	}
	public void setError410(long number) {
	    number = checkError410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError410((short)number);
	}
	

	/**
	 *	Returns the value of resultStartMsg603
	 *	@return resultStartMsg603
	 */
   public char[] getResultStartMsg603() throws CFException{
   		return resultStartMsg603;
   }

  
	/**
	*  set variable resultStartMsg603
	*  Corresponding COBOL Variable is 603-RESULT-START-MSG
	*  @param value
	**/
   public void setResultStartMsg603(char[] value) {
       value = checkResultStartMsg603Constraints(value);
       arraycopy(value,0,resultStartMsg603,0,value.length);
   } 
	public void setResultStartMsg603(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,resultStartMsg603,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of resultEndMsg603
	 *	@return resultEndMsg603
	 */
   public char[] getResultEndMsg603() throws CFException{
   		return resultEndMsg603;
   }

  
	/**
	*  set variable resultEndMsg603
	*  Corresponding COBOL Variable is 603-RESULT-END-MSG
	*  @param value
	**/
   public void setResultEndMsg603(char[] value) {
       value = checkResultEndMsg603Constraints(value);
       arraycopy(value,0,resultEndMsg603,0,value.length);
   } 
	public void setResultEndMsg603(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,resultEndMsg603,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pendedMsg605
	 *	@return pendedMsg605
	 */
   public char[] getPendedMsg605() throws CFException{
   		return pendedMsg605;
   }

  
	/**
	*  set variable pendedMsg605
	*  Corresponding COBOL Variable is 605-PENDED-MSG
	*  @param value
	**/
   public void setPendedMsg605(char[] value) {
       value = checkPendedMsg605Constraints(value);
       arraycopy(value,0,pendedMsg605,0,value.length);
   } 
	public void setPendedMsg605(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pendedMsg605,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of setupProblemCurrMsg606
	 *	@return setupProblemCurrMsg606
	 */
   public char[] getSetupProblemCurrMsg606() throws CFException{
   		return setupProblemCurrMsg606;
   }

  
	/**
	*  set variable setupProblemCurrMsg606
	*  Corresponding COBOL Variable is 606-SETUP-PROBLEM-CURR-MSG
	*  @param value
	**/
   public void setSetupProblemCurrMsg606(char[] value) {
       value = checkSetupProblemCurrMsg606Constraints(value);
       arraycopy(value,0,setupProblemCurrMsg606,0,value.length);
   } 
	public void setSetupProblemCurrMsg606(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,setupProblemCurrMsg606,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of setupProblemOrigMsg606
	 *	@return setupProblemOrigMsg606
	 */
   public char[] getSetupProblemOrigMsg606() throws CFException{
   		return setupProblemOrigMsg606;
   }

  
	/**
	*  set variable setupProblemOrigMsg606
	*  Corresponding COBOL Variable is 606-SETUP-PROBLEM-ORIG-MSG
	*  @param value
	**/
   public void setSetupProblemOrigMsg606(char[] value) {
       value = checkSetupProblemOrigMsg606Constraints(value);
       arraycopy(value,0,setupProblemOrigMsg606,0,value.length);
   } 
	public void setSetupProblemOrigMsg606(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,setupProblemOrigMsg606,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of setupProblemBkupMsg606
	 *	@return setupProblemBkupMsg606
	 */
   public char[] getSetupProblemBkupMsg606() throws CFException{
   		return setupProblemBkupMsg606;
   }

  
	/**
	*  set variable setupProblemBkupMsg606
	*  Corresponding COBOL Variable is 606-SETUP-PROBLEM-BKUP-MSG
	*  @param value
	**/
   public void setSetupProblemBkupMsg606(char[] value) {
       value = checkSetupProblemBkupMsg606Constraints(value);
       arraycopy(value,0,setupProblemBkupMsg606,0,value.length);
   } 
	public void setSetupProblemBkupMsg606(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,setupProblemBkupMsg606,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of setupProblemSwMsg606
	 *	@return setupProblemSwMsg606
	 */
   public char[] getSetupProblemSwMsg606() throws CFException{
   		return setupProblemSwMsg606;
   }

  
	/**
	*  set variable setupProblemSwMsg606
	*  Corresponding COBOL Variable is 606-SETUP-PROBLEM-SW-MSG
	*  @param value
	**/
   public void setSetupProblemSwMsg606(char[] value) {
       value = checkSetupProblemSwMsg606Constraints(value);
       arraycopy(value,0,setupProblemSwMsg606,0,value.length);
   } 
	public void setSetupProblemSwMsg606(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,setupProblemSwMsg606,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of setupProblemBulkMsg606
	 *	@return setupProblemBulkMsg606
	 */
   public char[] getSetupProblemBulkMsg606() throws CFException{
   		return setupProblemBulkMsg606;
   }

  
	/**
	*  set variable setupProblemBulkMsg606
	*  Corresponding COBOL Variable is 606-SETUP-PROBLEM-BULK-MSG
	*  @param value
	**/
   public void setSetupProblemBulkMsg606(char[] value) {
       value = checkSetupProblemBulkMsg606Constraints(value);
       arraycopy(value,0,setupProblemBulkMsg606,0,value.length);
   } 
	public void setSetupProblemBulkMsg606(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,setupProblemBulkMsg606,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of setupProblemXferMsg606
	 *	@return setupProblemXferMsg606
	 */
   public char[] getSetupProblemXferMsg606() throws CFException{
   		return setupProblemXferMsg606;
   }

  
	/**
	*  set variable setupProblemXferMsg606
	*  Corresponding COBOL Variable is 606-SETUP-PROBLEM-XFER-MSG
	*  @param value
	**/
   public void setSetupProblemXferMsg606(char[] value) {
       value = checkSetupProblemXferMsg606Constraints(value);
       arraycopy(value,0,setupProblemXferMsg606,0,value.length);
   } 
	public void setSetupProblemXferMsg606(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,setupProblemXferMsg606,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of setupProblemCyclMsg606
	 *	@return setupProblemCyclMsg606
	 */
   public char[] getSetupProblemCyclMsg606() throws CFException{
   		return setupProblemCyclMsg606;
   }

  
	/**
	*  set variable setupProblemCyclMsg606
	*  Corresponding COBOL Variable is 606-SETUP-PROBLEM-CYCL-MSG
	*  @param value
	**/
   public void setSetupProblemCyclMsg606(char[] value) {
       value = checkSetupProblemCyclMsg606Constraints(value);
       arraycopy(value,0,setupProblemCyclMsg606,0,value.length);
   } 
	public void setSetupProblemCyclMsg606(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,setupProblemCyclMsg606,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of setupProblemSeqMsg606
	 *	@return setupProblemSeqMsg606
	 */
   public char[] getSetupProblemSeqMsg606() throws CFException{
   		return setupProblemSeqMsg606;
   }

  
	/**
	*  set variable setupProblemSeqMsg606
	*  Corresponding COBOL Variable is 606-SETUP-PROBLEM-SEQ-MSG
	*  @param value
	**/
   public void setSetupProblemSeqMsg606(char[] value) {
       value = checkSetupProblemSeqMsg606Constraints(value);
       arraycopy(value,0,setupProblemSeqMsg606,0,value.length);
   } 
	public void setSetupProblemSeqMsg606(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,setupProblemSeqMsg606,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ftssFileNameMsg607
	 *	@return ftssFileNameMsg607
	 */
   public char[] getFtssFileNameMsg607() throws CFException{
   		return ftssFileNameMsg607;
   }

  
	/**
	*  set variable ftssFileNameMsg607
	*  Corresponding COBOL Variable is 607-FTSS-FILE-NAME-MSG
	*  @param value
	**/
   public void setFtssFileNameMsg607(char[] value) {
       value = checkFtssFileNameMsg607Constraints(value);
       arraycopy(value,0,ftssFileNameMsg607,0,value.length);
   } 
	public void setFtssFileNameMsg607(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ftssFileNameMsg607,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of copySuccessGft608
	 *	@return copySuccessGft608
	 */
   public char[] getCopySuccessGft608() throws CFException{
   		return copySuccessGft608;
   }

  
	/**
	*  set variable copySuccessGft608
	*  Corresponding COBOL Variable is 608-COPY-SUCCESS-GFT
	*  @param value
	**/
   public void setCopySuccessGft608(char[] value) {
       value = checkCopySuccessGft608Constraints(value);
       arraycopy(value,0,copySuccessGft608,0,value.length);
   } 
	public void setCopySuccessGft608(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,copySuccessGft608,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of copySuccessAppl608
	 *	@return copySuccessAppl608
	 */
   public char[] getCopySuccessAppl608() throws CFException{
   		return copySuccessAppl608;
   }

  
	/**
	*  set variable copySuccessAppl608
	*  Corresponding COBOL Variable is 608-COPY-SUCCESS-APPL
	*  @param value
	**/
   public void setCopySuccessAppl608(char[] value) {
       value = checkCopySuccessAppl608Constraints(value);
       arraycopy(value,0,copySuccessAppl608,0,value.length);
   } 
	public void setCopySuccessAppl608(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,copySuccessAppl608,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of renameSuccess608
	 *	@return renameSuccess608
	 */
   public char[] getRenameSuccess608() throws CFException{
   		return renameSuccess608;
   }

  
	/**
	*  set variable renameSuccess608
	*  Corresponding COBOL Variable is 608-RENAME-SUCCESS
	*  @param value
	**/
   public void setRenameSuccess608(char[] value) {
       value = checkRenameSuccess608Constraints(value);
       arraycopy(value,0,renameSuccess608,0,value.length);
   } 
	public void setRenameSuccess608(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,renameSuccess608,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of renameOldMsg608
	 *	@return renameOldMsg608
	 */
   public char[] getRenameOldMsg608() throws CFException{
   		return renameOldMsg608;
   }

  
	/**
	*  set variable renameOldMsg608
	*  Corresponding COBOL Variable is 608-RENAME-OLD-MSG
	*  @param value
	**/
   public void setRenameOldMsg608(char[] value) {
       value = checkRenameOldMsg608Constraints(value);
       arraycopy(value,0,renameOldMsg608,0,value.length);
   } 
	public void setRenameOldMsg608(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,renameOldMsg608,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of renameNewMsg608
	 *	@return renameNewMsg608
	 */
   public char[] getRenameNewMsg608() throws CFException{
   		return renameNewMsg608;
   }

  
	/**
	*  set variable renameNewMsg608
	*  Corresponding COBOL Variable is 608-RENAME-NEW-MSG
	*  @param value
	**/
   public void setRenameNewMsg608(char[] value) {
       value = checkRenameNewMsg608Constraints(value);
       arraycopy(value,0,renameNewMsg608,0,value.length);
   } 
	public void setRenameNewMsg608(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,renameNewMsg608,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of warningText609
	 *	@return warningText609
	 */
   public char[] getWarningText609() throws CFException{
   		return warningText609;
   }

  
	/**
	*  set variable warningText609
	*  Corresponding COBOL Variable is 609-WARNING-TEXT
	*  @param value
	**/
   public void setWarningText609(char[] value) {
       value = checkWarningText609Constraints(value);
       arraycopy(value,0,warningText609,0,value.length);
   } 
	public void setWarningText609(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,warningText609,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of copybookErrorMsg610
	 *	@return copybookErrorMsg610
	 */
   public char[] getCopybookErrorMsg610() throws CFException{
   		return copybookErrorMsg610;
   }

  
	/**
	*  set variable copybookErrorMsg610
	*  Corresponding COBOL Variable is 610-COPYBOOK-ERROR-MSG
	*  @param value
	**/
   public void setCopybookErrorMsg610(char[] value) {
       value = checkCopybookErrorMsg610Constraints(value);
       arraycopy(value,0,copybookErrorMsg610,0,value.length);
   } 
	public void setCopybookErrorMsg610(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,copybookErrorMsg610,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of copybookProgramIdMsg610
	 *	@return copybookProgramIdMsg610
	 */
   public char[] getCopybookProgramIdMsg610() throws CFException{
   		return copybookProgramIdMsg610;
   }

  
	/**
	*  set variable copybookProgramIdMsg610
	*  Corresponding COBOL Variable is 610-COPYBOOK-PROGRAM-ID-MSG
	*  @param value
	**/
   public void setCopybookProgramIdMsg610(char[] value) {
       value = checkCopybookProgramIdMsg610Constraints(value);
       arraycopy(value,0,copybookProgramIdMsg610,0,value.length);
   } 
	public void setCopybookProgramIdMsg610(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,copybookProgramIdMsg610,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of copybookVersionIdMsg610
	 *	@return copybookVersionIdMsg610
	 */
   public char[] getCopybookVersionIdMsg610() throws CFException{
   		return copybookVersionIdMsg610;
   }

  
	/**
	*  set variable copybookVersionIdMsg610
	*  Corresponding COBOL Variable is 610-COPYBOOK-VERSION-ID-MSG
	*  @param value
	**/
   public void setCopybookVersionIdMsg610(char[] value) {
       value = checkCopybookVersionIdMsg610Constraints(value);
       arraycopy(value,0,copybookVersionIdMsg610,0,value.length);
   } 
	public void setCopybookVersionIdMsg610(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,copybookVersionIdMsg610,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of parameterErrorMsg611
	 *	@return parameterErrorMsg611
	 */
   public char[] getParameterErrorMsg611() throws CFException{
   		return parameterErrorMsg611;
   }

  
	/**
	*  set variable parameterErrorMsg611
	*  Corresponding COBOL Variable is 611-PARAMETER-ERROR-MSG
	*  @param value
	**/
   public void setParameterErrorMsg611(char[] value) {
       value = checkParameterErrorMsg611Constraints(value);
       arraycopy(value,0,parameterErrorMsg611,0,value.length);
   } 
	public void setParameterErrorMsg611(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,parameterErrorMsg611,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of functionRequestMsg611
	 *	@return functionRequestMsg611
	 */
   public char[] getFunctionRequestMsg611() throws CFException{
   		return functionRequestMsg611;
   }

  
	/**
	*  set variable functionRequestMsg611
	*  Corresponding COBOL Variable is 611-FUNCTION-REQUEST-MSG
	*  @param value
	**/
   public void setFunctionRequestMsg611(char[] value) {
       value = checkFunctionRequestMsg611Constraints(value);
       arraycopy(value,0,functionRequestMsg611,0,value.length);
   } 
	public void setFunctionRequestMsg611(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,functionRequestMsg611,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of bulkIdMsg611
	 *	@return bulkIdMsg611
	 */
   public char[] getBulkIdMsg611() throws CFException{
   		return bulkIdMsg611;
   }

  
	/**
	*  set variable bulkIdMsg611
	*  Corresponding COBOL Variable is 611-BULK-ID-MSG
	*  @param value
	**/
   public void setBulkIdMsg611(char[] value) {
       value = checkBulkIdMsg611Constraints(value);
       arraycopy(value,0,bulkIdMsg611,0,value.length);
   } 
	public void setBulkIdMsg611(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,bulkIdMsg611,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of endptIdMsg611
	 *	@return endptIdMsg611
	 */
   public char[] getEndptIdMsg611() throws CFException{
   		return endptIdMsg611;
   }

  
	/**
	*  set variable endptIdMsg611
	*  Corresponding COBOL Variable is 611-ENDPT-ID-MSG
	*  @param value
	**/
   public void setEndptIdMsg611(char[] value) {
       value = checkEndptIdMsg611Constraints(value);
       arraycopy(value,0,endptIdMsg611,0,value.length);
   } 
	public void setEndptIdMsg611(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,endptIdMsg611,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of deleteIndMsg611
	 *	@return deleteIndMsg611
	 */
   public char[] getDeleteIndMsg611() throws CFException{
   		return deleteIndMsg611;
   }

  
	/**
	*  set variable deleteIndMsg611
	*  Corresponding COBOL Variable is 611-DELETE-IND-MSG
	*  @param value
	**/
   public void setDeleteIndMsg611(char[] value) {
       value = checkDeleteIndMsg611Constraints(value);
       arraycopy(value,0,deleteIndMsg611,0,value.length);
   } 
	public void setDeleteIndMsg611(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,deleteIndMsg611,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of cyclNumMsg611
	 *	@return cyclNumMsg611
	 */
   public char[] getCyclNumMsg611() throws CFException{
   		return cyclNumMsg611;
   }

  
	/**
	*  set variable cyclNumMsg611
	*  Corresponding COBOL Variable is 611-CYCL-NUM-MSG
	*  @param value
	**/
   public void setCyclNumMsg611(char[] value) {
       value = checkCyclNumMsg611Constraints(value);
       arraycopy(value,0,cyclNumMsg611,0,value.length);
   } 
	public void setCyclNumMsg611(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,cyclNumMsg611,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of listBroadcastDdMsg611
	 *	@return listBroadcastDdMsg611
	 */
   public char[] getListBroadcastDdMsg611() throws CFException{
   		return listBroadcastDdMsg611;
   }

  
	/**
	*  set variable listBroadcastDdMsg611
	*  Corresponding COBOL Variable is 611-LIST-BROADCAST-DD-MSG
	*  @param value
	**/
   public void setListBroadcastDdMsg611(char[] value) {
       value = checkListBroadcastDdMsg611Constraints(value);
       arraycopy(value,0,listBroadcastDdMsg611,0,value.length);
   } 
	public void setListBroadcastDdMsg611(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,listBroadcastDdMsg611,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of applicationDsnMsg611
	 *	@return applicationDsnMsg611
	 */
   public char[] getApplicationDsnMsg611() throws CFException{
   		return applicationDsnMsg611;
   }

  
	/**
	*  set variable applicationDsnMsg611
	*  Corresponding COBOL Variable is 611-APPLICATION-DSN-MSG
	*  @param value
	**/
   public void setApplicationDsnMsg611(char[] value) {
       value = checkApplicationDsnMsg611Constraints(value);
       arraycopy(value,0,applicationDsnMsg611,0,value.length);
   } 
	public void setApplicationDsnMsg611(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,applicationDsnMsg611,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of gftRetrieveDsnMsg611
	 *	@return gftRetrieveDsnMsg611
	 */
   public char[] getGftRetrieveDsnMsg611() throws CFException{
   		return gftRetrieveDsnMsg611;
   }

  
	/**
	*  set variable gftRetrieveDsnMsg611
	*  Corresponding COBOL Variable is 611-GFT-RETRIEVE-DSN-MSG
	*  @param value
	**/
   public void setGftRetrieveDsnMsg611(char[] value) {
       value = checkGftRetrieveDsnMsg611Constraints(value);
       arraycopy(value,0,gftRetrieveDsnMsg611,0,value.length);
   } 
	public void setGftRetrieveDsnMsg611(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,gftRetrieveDsnMsg611,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of broadcastResultMsg611
	 *	@return broadcastResultMsg611
	 */
   public char[] getBroadcastResultMsg611() throws CFException{
   		return broadcastResultMsg611;
   }

  
	/**
	*  set variable broadcastResultMsg611
	*  Corresponding COBOL Variable is 611-BROADCAST-RESULT-MSG
	*  @param value
	**/
   public void setBroadcastResultMsg611(char[] value) {
       value = checkBroadcastResultMsg611Constraints(value);
       arraycopy(value,0,broadcastResultMsg611,0,value.length);
   } 
	public void setBroadcastResultMsg611(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,broadcastResultMsg611,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of procDateMsg611
	 *	@return procDateMsg611
	 */
   public char[] getProcDateMsg611() throws CFException{
   		return procDateMsg611;
   }

  
	/**
	*  set variable procDateMsg611
	*  Corresponding COBOL Variable is 611-PROC-DATE-MSG
	*  @param value
	**/
   public void setProcDateMsg611(char[] value) {
       value = checkProcDateMsg611Constraints(value);
       arraycopy(value,0,procDateMsg611,0,value.length);
   } 
	public void setProcDateMsg611(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,procDateMsg611,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of assignLogicError619
	 *	@return assignLogicError619
	 */
   public char[] getAssignLogicError619() throws CFException{
   		return assignLogicError619;
   }

  
	/**
	*  set variable assignLogicError619
	*  Corresponding COBOL Variable is 619-ASSIGN-LOGIC-ERROR
	*  @param value
	**/
   public void setAssignLogicError619(char[] value) {
       value = checkAssignLogicError619Constraints(value);
       arraycopy(value,0,assignLogicError619,0,value.length);
   } 
	public void setAssignLogicError619(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,assignLogicError619,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of controlParmMsg620
	 *	@return controlParmMsg620
	 */
   public char[] getControlParmMsg620() throws CFException{
   		return controlParmMsg620;
   }

  
	/**
	*  set variable controlParmMsg620
	*  Corresponding COBOL Variable is 620-CONTROL-PARM-MSG
	*  @param value
	**/
   public void setControlParmMsg620(char[] value) {
       value = checkControlParmMsg620Constraints(value);
       arraycopy(value,0,controlParmMsg620,0,value.length);
   } 
	public void setControlParmMsg620(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,controlParmMsg620,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of controlColsMsg620
	 *	@return controlColsMsg620
	 */
   public char[] getControlColsMsg620() throws CFException{
   		return controlColsMsg620;
   }

  
	/**
	*  set variable controlColsMsg620
	*  Corresponding COBOL Variable is 620-CONTROL-COLS-MSG
	*  @param value
	**/
   public void setControlColsMsg620(char[] value) {
       value = checkControlColsMsg620Constraints(value);
       arraycopy(value,0,controlColsMsg620,0,value.length);
   } 
	public void setControlColsMsg620(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,controlColsMsg620,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of controlInfoMsg620
	 *	@return controlInfoMsg620
	 */
   public char[] getControlInfoMsg620() throws CFException{
   		return controlInfoMsg620;
   }

  
	/**
	*  set variable controlInfoMsg620
	*  Corresponding COBOL Variable is 620-CONTROL-INFO-MSG
	*  @param value
	**/
   public void setControlInfoMsg620(char[] value) {
       value = checkControlInfoMsg620Constraints(value);
       arraycopy(value,0,controlInfoMsg620,0,value.length);
   } 
	public void setControlInfoMsg620(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,controlInfoMsg620,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of controlDbid620
	 *	@return controlDbid620
	 */
   public char[] getControlDbid620() throws CFException{
   		return controlDbid620;
   }

  
	/**
	*  set variable controlDbid620
	*  Corresponding COBOL Variable is 620-CONTROL-DBID
	*  @param value
	**/
   public void setControlDbid620(char[] value) {
       value = checkControlDbid620Constraints(value);
       arraycopy(value,0,controlDbid620,0,value.length);
   } 
	public void setControlDbid620(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,controlDbid620,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of controlDbpkg620
	 *	@return controlDbpkg620
	 */
   public char[] getControlDbpkg620() throws CFException{
   		return controlDbpkg620;
   }

  
	/**
	*  set variable controlDbpkg620
	*  Corresponding COBOL Variable is 620-CONTROL-DBPKG
	*  @param value
	**/
   public void setControlDbpkg620(char[] value) {
       value = checkControlDbpkg620Constraints(value);
       arraycopy(value,0,controlDbpkg620,0,value.length);
   } 
	public void setControlDbpkg620(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,controlDbpkg620,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of controlHlqid620
	 *	@return controlHlqid620
	 */
   public char[] getControlHlqid620() throws CFException{
   		return controlHlqid620;
   }

  
	/**
	*  set variable controlHlqid620
	*  Corresponding COBOL Variable is 620-CONTROL-HLQID
	*  @param value
	**/
   public void setControlHlqid620(char[] value) {
       value = checkControlHlqid620Constraints(value);
       arraycopy(value,0,controlHlqid620,0,value.length);
   } 
	public void setControlHlqid620(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,controlHlqid620,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sqlErrorMsg640
	 *	@return sqlErrorMsg640
	 */
   public char[] getSqlErrorMsg640() throws CFException{
   		return sqlErrorMsg640;
   }

  
	/**
	*  set variable sqlErrorMsg640
	*  Corresponding COBOL Variable is 640-SQL-ERROR-MSG
	*  @param value
	**/
   public void setSqlErrorMsg640(char[] value) {
       value = checkSqlErrorMsg640Constraints(value);
       arraycopy(value,0,sqlErrorMsg640,0,value.length);
   } 
	public void setSqlErrorMsg640(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sqlErrorMsg640,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sqlMnfrmFileNamMsg640
	 *	@return sqlMnfrmFileNamMsg640
	 */
   public char[] getSqlMnfrmFileNamMsg640() throws CFException{
   		return sqlMnfrmFileNamMsg640;
   }

  
	/**
	*  set variable sqlMnfrmFileNamMsg640
	*  Corresponding COBOL Variable is 640-SQL-MNFRM-FILE-NAM-MSG
	*  @param value
	**/
   public void setSqlMnfrmFileNamMsg640(char[] value) {
       value = checkSqlMnfrmFileNamMsg640Constraints(value);
       arraycopy(value,0,sqlMnfrmFileNamMsg640,0,value.length);
   } 
	public void setSqlMnfrmFileNamMsg640(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sqlMnfrmFileNamMsg640,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sqlBulkIdMsg640
	 *	@return sqlBulkIdMsg640
	 */
   public char[] getSqlBulkIdMsg640() throws CFException{
   		return sqlBulkIdMsg640;
   }

  
	/**
	*  set variable sqlBulkIdMsg640
	*  Corresponding COBOL Variable is 640-SQL-BULK-ID-MSG
	*  @param value
	**/
   public void setSqlBulkIdMsg640(char[] value) {
       value = checkSqlBulkIdMsg640Constraints(value);
       arraycopy(value,0,sqlBulkIdMsg640,0,value.length);
   } 
	public void setSqlBulkIdMsg640(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sqlBulkIdMsg640,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sqlEndptIdMsg640
	 *	@return sqlEndptIdMsg640
	 */
   public char[] getSqlEndptIdMsg640() throws CFException{
   		return sqlEndptIdMsg640;
   }

  
	/**
	*  set variable sqlEndptIdMsg640
	*  Corresponding COBOL Variable is 640-SQL-ENDPT-ID-MSG
	*  @param value
	**/
   public void setSqlEndptIdMsg640(char[] value) {
       value = checkSqlEndptIdMsg640Constraints(value);
       arraycopy(value,0,sqlEndptIdMsg640,0,value.length);
   } 
	public void setSqlEndptIdMsg640(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sqlEndptIdMsg640,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sqlStatCdMsg640
	 *	@return sqlStatCdMsg640
	 */
   public char[] getSqlStatCdMsg640() throws CFException{
   		return sqlStatCdMsg640;
   }

  
	/**
	*  set variable sqlStatCdMsg640
	*  Corresponding COBOL Variable is 640-SQL-STAT-CD-MSG
	*  @param value
	**/
   public void setSqlStatCdMsg640(char[] value) {
       value = checkSqlStatCdMsg640Constraints(value);
       arraycopy(value,0,sqlStatCdMsg640,0,value.length);
   } 
	public void setSqlStatCdMsg640(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sqlStatCdMsg640,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sqlApplExitNamMsg640
	 *	@return sqlApplExitNamMsg640
	 */
   public char[] getSqlApplExitNamMsg640() throws CFException{
   		return sqlApplExitNamMsg640;
   }

  
	/**
	*  set variable sqlApplExitNamMsg640
	*  Corresponding COBOL Variable is 640-SQL-APPL-EXIT-NAM-MSG
	*  @param value
	**/
   public void setSqlApplExitNamMsg640(char[] value) {
       value = checkSqlApplExitNamMsg640Constraints(value);
       arraycopy(value,0,sqlApplExitNamMsg640,0,value.length);
   } 
	public void setSqlApplExitNamMsg640(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sqlApplExitNamMsg640,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sqlCyclNumMsg640
	 *	@return sqlCyclNumMsg640
	 */
   public char[] getSqlCyclNumMsg640() throws CFException{
   		return sqlCyclNumMsg640;
   }

  
	/**
	*  set variable sqlCyclNumMsg640
	*  Corresponding COBOL Variable is 640-SQL-CYCL-NUM-MSG
	*  @param value
	**/
   public void setSqlCyclNumMsg640(char[] value) {
       value = checkSqlCyclNumMsg640Constraints(value);
       arraycopy(value,0,sqlCyclNumMsg640,0,value.length);
   } 
	public void setSqlCyclNumMsg640(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sqlCyclNumMsg640,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sqlCyclNumLoMsg640
	 *	@return sqlCyclNumLoMsg640
	 */
   public char[] getSqlCyclNumLoMsg640() throws CFException{
   		return sqlCyclNumLoMsg640;
   }

  
	/**
	*  set variable sqlCyclNumLoMsg640
	*  Corresponding COBOL Variable is 640-SQL-CYCL-NUM-LO-MSG
	*  @param value
	**/
   public void setSqlCyclNumLoMsg640(char[] value) {
       value = checkSqlCyclNumLoMsg640Constraints(value);
       arraycopy(value,0,sqlCyclNumLoMsg640,0,value.length);
   } 
	public void setSqlCyclNumLoMsg640(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sqlCyclNumLoMsg640,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sqlCyclNumHiMsg640
	 *	@return sqlCyclNumHiMsg640
	 */
   public char[] getSqlCyclNumHiMsg640() throws CFException{
   		return sqlCyclNumHiMsg640;
   }

  
	/**
	*  set variable sqlCyclNumHiMsg640
	*  Corresponding COBOL Variable is 640-SQL-CYCL-NUM-HI-MSG
	*  @param value
	**/
   public void setSqlCyclNumHiMsg640(char[] value) {
       value = checkSqlCyclNumHiMsg640Constraints(value);
       arraycopy(value,0,sqlCyclNumHiMsg640,0,value.length);
   } 
	public void setSqlCyclNumHiMsg640(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sqlCyclNumHiMsg640,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sqlLstUpdtUserIdMsg640
	 *	@return sqlLstUpdtUserIdMsg640
	 */
   public char[] getSqlLstUpdtUserIdMsg640() throws CFException{
   		return sqlLstUpdtUserIdMsg640;
   }

  
	/**
	*  set variable sqlLstUpdtUserIdMsg640
	*  Corresponding COBOL Variable is 640-SQL-LST-UPDT-USER-ID-MSG
	*  @param value
	**/
   public void setSqlLstUpdtUserIdMsg640(char[] value) {
       value = checkSqlLstUpdtUserIdMsg640Constraints(value);
       arraycopy(value,0,sqlLstUpdtUserIdMsg640,0,value.length);
   } 
	public void setSqlLstUpdtUserIdMsg640(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sqlLstUpdtUserIdMsg640,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sqlLstUpdtTsMsg640
	 *	@return sqlLstUpdtTsMsg640
	 */
   public char[] getSqlLstUpdtTsMsg640() throws CFException{
   		return sqlLstUpdtTsMsg640;
   }

  
	/**
	*  set variable sqlLstUpdtTsMsg640
	*  Corresponding COBOL Variable is 640-SQL-LST-UPDT-TS-MSG
	*  @param value
	**/
   public void setSqlLstUpdtTsMsg640(char[] value) {
       value = checkSqlLstUpdtTsMsg640Constraints(value);
       arraycopy(value,0,sqlLstUpdtTsMsg640,0,value.length);
   } 
	public void setSqlLstUpdtTsMsg640(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sqlLstUpdtTsMsg640,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sqlBdioTxtMsg640
	 *	@return sqlBdioTxtMsg640
	 */
   public char[] getSqlBdioTxtMsg640() throws CFException{
   		return sqlBdioTxtMsg640;
   }

  
	/**
	*  set variable sqlBdioTxtMsg640
	*  Corresponding COBOL Variable is 640-SQL-BDIO-TXT-MSG
	*  @param value
	**/
   public void setSqlBdioTxtMsg640(char[] value) {
       value = checkSqlBdioTxtMsg640Constraints(value);
       arraycopy(value,0,sqlBdioTxtMsg640,0,value.length);
   } 
	public void setSqlBdioTxtMsg640(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sqlBdioTxtMsg640,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tarafplNotfndMsg641
	 *	@return tarafplNotfndMsg641
	 */
   public char[] getTarafplNotfndMsg641() throws CFException{
   		return tarafplNotfndMsg641;
   }

  
	/**
	*  set variable tarafplNotfndMsg641
	*  Corresponding COBOL Variable is 641-TARAFPL-NOTFND-MSG
	*  @param value
	**/
   public void setTarafplNotfndMsg641(char[] value) {
       value = checkTarafplNotfndMsg641Constraints(value);
       arraycopy(value,0,tarafplNotfndMsg641,0,value.length);
   } 
	public void setTarafplNotfndMsg641(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tarafplNotfndMsg641,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tarafplSelectMsg641
	 *	@return tarafplSelectMsg641
	 */
   public char[] getTarafplSelectMsg641() throws CFException{
   		return tarafplSelectMsg641;
   }

  
	/**
	*  set variable tarafplSelectMsg641
	*  Corresponding COBOL Variable is 641-TARAFPL-SELECT-MSG
	*  @param value
	**/
   public void setTarafplSelectMsg641(char[] value) {
       value = checkTarafplSelectMsg641Constraints(value);
       arraycopy(value,0,tarafplSelectMsg641,0,value.length);
   } 
	public void setTarafplSelectMsg641(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tarafplSelectMsg641,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tarafxsNotfndMsg642
	 *	@return tarafxsNotfndMsg642
	 */
   public char[] getTarafxsNotfndMsg642() throws CFException{
   		return tarafxsNotfndMsg642;
   }

  
	/**
	*  set variable tarafxsNotfndMsg642
	*  Corresponding COBOL Variable is 642-TARAFXS-NOTFND-MSG
	*  @param value
	**/
   public void setTarafxsNotfndMsg642(char[] value) {
       value = checkTarafxsNotfndMsg642Constraints(value);
       arraycopy(value,0,tarafxsNotfndMsg642,0,value.length);
   } 
	public void setTarafxsNotfndMsg642(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tarafxsNotfndMsg642,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tarafxsSelectMsg642
	 *	@return tarafxsSelectMsg642
	 */
   public char[] getTarafxsSelectMsg642() throws CFException{
   		return tarafxsSelectMsg642;
   }

  
	/**
	*  set variable tarafxsSelectMsg642
	*  Corresponding COBOL Variable is 642-TARAFXS-SELECT-MSG
	*  @param value
	**/
   public void setTarafxsSelectMsg642(char[] value) {
       value = checkTarafxsSelectMsg642Constraints(value);
       arraycopy(value,0,tarafxsSelectMsg642,0,value.length);
   } 
	public void setTarafxsSelectMsg642(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tarafxsSelectMsg642,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tarafxsUpdateMsg642
	 *	@return tarafxsUpdateMsg642
	 */
   public char[] getTarafxsUpdateMsg642() throws CFException{
   		return tarafxsUpdateMsg642;
   }

  
	/**
	*  set variable tarafxsUpdateMsg642
	*  Corresponding COBOL Variable is 642-TARAFXS-UPDATE-MSG
	*  @param value
	**/
   public void setTarafxsUpdateMsg642(char[] value) {
       value = checkTarafxsUpdateMsg642Constraints(value);
       arraycopy(value,0,tarafxsUpdateMsg642,0,value.length);
   } 
	public void setTarafxsUpdateMsg642(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tarafxsUpdateMsg642,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tarafxsInsertMsg642
	 *	@return tarafxsInsertMsg642
	 */
   public char[] getTarafxsInsertMsg642() throws CFException{
   		return tarafxsInsertMsg642;
   }

  
	/**
	*  set variable tarafxsInsertMsg642
	*  Corresponding COBOL Variable is 642-TARAFXS-INSERT-MSG
	*  @param value
	**/
   public void setTarafxsInsertMsg642(char[] value) {
       value = checkTarafxsInsertMsg642Constraints(value);
       arraycopy(value,0,tarafxsInsertMsg642,0,value.length);
   } 
	public void setTarafxsInsertMsg642(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tarafxsInsertMsg642,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tarafxsNostatMsg642
	 *	@return tarafxsNostatMsg642
	 */
   public char[] getTarafxsNostatMsg642() throws CFException{
   		return tarafxsNostatMsg642;
   }

  
	/**
	*  set variable tarafxsNostatMsg642
	*  Corresponding COBOL Variable is 642-TARAFXS-NOSTAT-MSG
	*  @param value
	**/
   public void setTarafxsNostatMsg642(char[] value) {
       value = checkTarafxsNostatMsg642Constraints(value);
       arraycopy(value,0,tarafxsNostatMsg642,0,value.length);
   } 
	public void setTarafxsNostatMsg642(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tarafxsNostatMsg642,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tarafxsCountMsg642
	 *	@return tarafxsCountMsg642
	 */
   public char[] getTarafxsCountMsg642() throws CFException{
   		return tarafxsCountMsg642;
   }

  
	/**
	*  set variable tarafxsCountMsg642
	*  Corresponding COBOL Variable is 642-TARAFXS-COUNT-MSG
	*  @param value
	**/
   public void setTarafxsCountMsg642(char[] value) {
       value = checkTarafxsCountMsg642Constraints(value);
       arraycopy(value,0,tarafxsCountMsg642,0,value.length);
   } 
	public void setTarafxsCountMsg642(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tarafxsCountMsg642,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tarafxsExitMsg642
	 *	@return tarafxsExitMsg642
	 */
   public char[] getTarafxsExitMsg642() throws CFException{
   		return tarafxsExitMsg642;
   }

  
	/**
	*  set variable tarafxsExitMsg642
	*  Corresponding COBOL Variable is 642-TARAFXS-EXIT-MSG
	*  @param value
	**/
   public void setTarafxsExitMsg642(char[] value) {
       value = checkTarafxsExitMsg642Constraints(value);
       arraycopy(value,0,tarafxsExitMsg642,0,value.length);
   } 
	public void setTarafxsExitMsg642(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tarafxsExitMsg642,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tarafxsOpenMsg642
	 *	@return tarafxsOpenMsg642
	 */
   public char[] getTarafxsOpenMsg642() throws CFException{
   		return tarafxsOpenMsg642;
   }

  
	/**
	*  set variable tarafxsOpenMsg642
	*  Corresponding COBOL Variable is 642-TARAFXS-OPEN-MSG
	*  @param value
	**/
   public void setTarafxsOpenMsg642(char[] value) {
       value = checkTarafxsOpenMsg642Constraints(value);
       arraycopy(value,0,tarafxsOpenMsg642,0,value.length);
   } 
	public void setTarafxsOpenMsg642(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tarafxsOpenMsg642,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tarafxsFetchMsg642
	 *	@return tarafxsFetchMsg642
	 */
   public char[] getTarafxsFetchMsg642() throws CFException{
   		return tarafxsFetchMsg642;
   }

  
	/**
	*  set variable tarafxsFetchMsg642
	*  Corresponding COBOL Variable is 642-TARAFXS-FETCH-MSG
	*  @param value
	**/
   public void setTarafxsFetchMsg642(char[] value) {
       value = checkTarafxsFetchMsg642Constraints(value);
       arraycopy(value,0,tarafxsFetchMsg642,0,value.length);
   } 
	public void setTarafxsFetchMsg642(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tarafxsFetchMsg642,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tarafxsCloseMsg642
	 *	@return tarafxsCloseMsg642
	 */
   public char[] getTarafxsCloseMsg642() throws CFException{
   		return tarafxsCloseMsg642;
   }

  
	/**
	*  set variable tarafxsCloseMsg642
	*  Corresponding COBOL Variable is 642-TARAFXS-CLOSE-MSG
	*  @param value
	**/
   public void setTarafxsCloseMsg642(char[] value) {
       value = checkTarafxsCloseMsg642Constraints(value);
       arraycopy(value,0,tarafxsCloseMsg642,0,value.length);
   } 
	public void setTarafxsCloseMsg642(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tarafxsCloseMsg642,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tarafxaNotfndMsg643
	 *	@return tarafxaNotfndMsg643
	 */
   public char[] getTarafxaNotfndMsg643() throws CFException{
   		return tarafxaNotfndMsg643;
   }

  
	/**
	*  set variable tarafxaNotfndMsg643
	*  Corresponding COBOL Variable is 643-TARAFXA-NOTFND-MSG
	*  @param value
	**/
   public void setTarafxaNotfndMsg643(char[] value) {
       value = checkTarafxaNotfndMsg643Constraints(value);
       arraycopy(value,0,tarafxaNotfndMsg643,0,value.length);
   } 
	public void setTarafxaNotfndMsg643(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tarafxaNotfndMsg643,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tarafxaOpenMsg643
	 *	@return tarafxaOpenMsg643
	 */
   public char[] getTarafxaOpenMsg643() throws CFException{
   		return tarafxaOpenMsg643;
   }

  
	/**
	*  set variable tarafxaOpenMsg643
	*  Corresponding COBOL Variable is 643-TARAFXA-OPEN-MSG
	*  @param value
	**/
   public void setTarafxaOpenMsg643(char[] value) {
       value = checkTarafxaOpenMsg643Constraints(value);
       arraycopy(value,0,tarafxaOpenMsg643,0,value.length);
   } 
	public void setTarafxaOpenMsg643(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tarafxaOpenMsg643,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tarafxaFetchMsg643
	 *	@return tarafxaFetchMsg643
	 */
   public char[] getTarafxaFetchMsg643() throws CFException{
   		return tarafxaFetchMsg643;
   }

  
	/**
	*  set variable tarafxaFetchMsg643
	*  Corresponding COBOL Variable is 643-TARAFXA-FETCH-MSG
	*  @param value
	**/
   public void setTarafxaFetchMsg643(char[] value) {
       value = checkTarafxaFetchMsg643Constraints(value);
       arraycopy(value,0,tarafxaFetchMsg643,0,value.length);
   } 
	public void setTarafxaFetchMsg643(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tarafxaFetchMsg643,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tarafxaCloseMsg643
	 *	@return tarafxaCloseMsg643
	 */
   public char[] getTarafxaCloseMsg643() throws CFException{
   		return tarafxaCloseMsg643;
   }

  
	/**
	*  set variable tarafxaCloseMsg643
	*  Corresponding COBOL Variable is 643-TARAFXA-CLOSE-MSG
	*  @param value
	**/
   public void setTarafxaCloseMsg643(char[] value) {
       value = checkTarafxaCloseMsg643Constraints(value);
       arraycopy(value,0,tarafxaCloseMsg643,0,value.length);
   } 
	public void setTarafxaCloseMsg643(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tarafxaCloseMsg643,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of taraefpNotfndMsg644
	 *	@return taraefpNotfndMsg644
	 */
   public char[] getTaraefpNotfndMsg644() throws CFException{
   		return taraefpNotfndMsg644;
   }

  
	/**
	*  set variable taraefpNotfndMsg644
	*  Corresponding COBOL Variable is 644-TARAEFP-NOTFND-MSG
	*  @param value
	**/
   public void setTaraefpNotfndMsg644(char[] value) {
       value = checkTaraefpNotfndMsg644Constraints(value);
       arraycopy(value,0,taraefpNotfndMsg644,0,value.length);
   } 
	public void setTaraefpNotfndMsg644(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,taraefpNotfndMsg644,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of taraefpOpenMsg644
	 *	@return taraefpOpenMsg644
	 */
   public char[] getTaraefpOpenMsg644() throws CFException{
   		return taraefpOpenMsg644;
   }

  
	/**
	*  set variable taraefpOpenMsg644
	*  Corresponding COBOL Variable is 644-TARAEFP-OPEN-MSG
	*  @param value
	**/
   public void setTaraefpOpenMsg644(char[] value) {
       value = checkTaraefpOpenMsg644Constraints(value);
       arraycopy(value,0,taraefpOpenMsg644,0,value.length);
   } 
	public void setTaraefpOpenMsg644(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,taraefpOpenMsg644,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of taraefpFetchMsg644
	 *	@return taraefpFetchMsg644
	 */
   public char[] getTaraefpFetchMsg644() throws CFException{
   		return taraefpFetchMsg644;
   }

  
	/**
	*  set variable taraefpFetchMsg644
	*  Corresponding COBOL Variable is 644-TARAEFP-FETCH-MSG
	*  @param value
	**/
   public void setTaraefpFetchMsg644(char[] value) {
       value = checkTaraefpFetchMsg644Constraints(value);
       arraycopy(value,0,taraefpFetchMsg644,0,value.length);
   } 
	public void setTaraefpFetchMsg644(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,taraefpFetchMsg644,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of taraefpCloseMsg644
	 *	@return taraefpCloseMsg644
	 */
   public char[] getTaraefpCloseMsg644() throws CFException{
   		return taraefpCloseMsg644;
   }

  
	/**
	*  set variable taraefpCloseMsg644
	*  Corresponding COBOL Variable is 644-TARAEFP-CLOSE-MSG
	*  @param value
	**/
   public void setTaraefpCloseMsg644(char[] value) {
       value = checkTaraefpCloseMsg644Constraints(value);
       arraycopy(value,0,taraefpCloseMsg644,0,value.length);
   } 
	public void setTaraefpCloseMsg644(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,taraefpCloseMsg644,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of taraefpSelectMsg644
	 *	@return taraefpSelectMsg644
	 */
   public char[] getTaraefpSelectMsg644() throws CFException{
   		return taraefpSelectMsg644;
   }

  
	/**
	*  set variable taraefpSelectMsg644
	*  Corresponding COBOL Variable is 644-TARAEFP-SELECT-MSG
	*  @param value
	**/
   public void setTaraefpSelectMsg644(char[] value) {
       value = checkTaraefpSelectMsg644Constraints(value);
       arraycopy(value,0,taraefpSelectMsg644,0,value.length);
   } 
	public void setTaraefpSelectMsg644(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,taraefpSelectMsg644,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of taraefpBackupMsg644
	 *	@return taraefpBackupMsg644
	 */
   public char[] getTaraefpBackupMsg644() throws CFException{
   		return taraefpBackupMsg644;
   }

  
	/**
	*  set variable taraefpBackupMsg644
	*  Corresponding COBOL Variable is 644-TARAEFP-BACKUP-MSG
	*  @param value
	**/
   public void setTaraefpBackupMsg644(char[] value) {
       value = checkTaraefpBackupMsg644Constraints(value);
       arraycopy(value,0,taraefpBackupMsg644,0,value.length);
   } 
	public void setTaraefpBackupMsg644(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,taraefpBackupMsg644,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of taraeptNotfnd645
	 *	@return taraeptNotfnd645
	 */
   public char[] getTaraeptNotfnd645() throws CFException{
   		return taraeptNotfnd645;
   }

  
	/**
	*  set variable taraeptNotfnd645
	*  Corresponding COBOL Variable is 645-TARAEPT-NOTFND
	*  @param value
	**/
   public void setTaraeptNotfnd645(char[] value) {
       value = checkTaraeptNotfnd645Constraints(value);
       arraycopy(value,0,taraeptNotfnd645,0,value.length);
   } 
	public void setTaraeptNotfnd645(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,taraeptNotfnd645,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of taraeptSelectMsg645
	 *	@return taraeptSelectMsg645
	 */
   public char[] getTaraeptSelectMsg645() throws CFException{
   		return taraeptSelectMsg645;
   }

  
	/**
	*  set variable taraeptSelectMsg645
	*  Corresponding COBOL Variable is 645-TARAEPT-SELECT-MSG
	*  @param value
	**/
   public void setTaraeptSelectMsg645(char[] value) {
       value = checkTaraeptSelectMsg645Constraints(value);
       arraycopy(value,0,taraeptSelectMsg645,0,value.length);
   } 
	public void setTaraeptSelectMsg645(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,taraeptSelectMsg645,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of taraeptBackupMsg645
	 *	@return taraeptBackupMsg645
	 */
   public char[] getTaraeptBackupMsg645() throws CFException{
   		return taraeptBackupMsg645;
   }

  
	/**
	*  set variable taraeptBackupMsg645
	*  Corresponding COBOL Variable is 645-TARAEPT-BACKUP-MSG
	*  @param value
	**/
   public void setTaraeptBackupMsg645(char[] value) {
       value = checkTaraeptBackupMsg645Constraints(value);
       arraycopy(value,0,taraeptBackupMsg645,0,value.length);
   } 
	public void setTaraeptBackupMsg645(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,taraeptBackupMsg645,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of taraeptRouteMsg645
	 *	@return taraeptRouteMsg645
	 */
   public char[] getTaraeptRouteMsg645() throws CFException{
   		return taraeptRouteMsg645;
   }

  
	/**
	*  set variable taraeptRouteMsg645
	*  Corresponding COBOL Variable is 645-TARAEPT-ROUTE-MSG
	*  @param value
	**/
   public void setTaraeptRouteMsg645(char[] value) {
       value = checkTaraeptRouteMsg645Constraints(value);
       arraycopy(value,0,taraeptRouteMsg645,0,value.length);
   } 
	public void setTaraeptRouteMsg645(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,taraeptRouteMsg645,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tarastsSelectMsg646
	 *	@return tarastsSelectMsg646
	 */
   public char[] getTarastsSelectMsg646() throws CFException{
   		return tarastsSelectMsg646;
   }

  
	/**
	*  set variable tarastsSelectMsg646
	*  Corresponding COBOL Variable is 646-TARASTS-SELECT-MSG
	*  @param value
	**/
   public void setTarastsSelectMsg646(char[] value) {
       value = checkTarastsSelectMsg646Constraints(value);
       arraycopy(value,0,tarastsSelectMsg646,0,value.length);
   } 
	public void setTarastsSelectMsg646(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tarastsSelectMsg646,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sqlcodeMsg647
	 *	@return sqlcodeMsg647
	 */
   public char[] getSqlcodeMsg647() throws CFException{
   		return sqlcodeMsg647;
   }

  
	/**
	*  set variable sqlcodeMsg647
	*  Corresponding COBOL Variable is 647-SQLCODE-MSG
	*  @param value
	**/
   public void setSqlcodeMsg647(char[] value) {
       value = checkSqlcodeMsg647Constraints(value);
       arraycopy(value,0,sqlcodeMsg647,0,value.length);
   } 
	public void setSqlcodeMsg647(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sqlcodeMsg647,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dynamParmsMsg650
	 *	@return dynamParmsMsg650
	 */
   public char[] getDynamParmsMsg650() throws CFException{
   		return dynamParmsMsg650;
   }

  
	/**
	*  set variable dynamParmsMsg650
	*  Corresponding COBOL Variable is 650-DYNAM-PARMS-MSG
	*  @param value
	**/
   public void setDynamParmsMsg650(char[] value) {
       value = checkDynamParmsMsg650Constraints(value);
       arraycopy(value,0,dynamParmsMsg650,0,value.length);
   } 
	public void setDynamParmsMsg650(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dynamParmsMsg650,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ar647OldDsnMsg661
	 *	@return ar647OldDsnMsg661
	 */
   public char[] getAr647OldDsnMsg661() throws CFException{
   		return ar647OldDsnMsg661;
   }

  
	/**
	*  set variable ar647OldDsnMsg661
	*  Corresponding COBOL Variable is 661-AR647-OLD-DSN-MSG
	*  @param value
	**/
   public void setAr647OldDsnMsg661(char[] value) {
       value = checkAr647OldDsnMsg661Constraints(value);
       arraycopy(value,0,ar647OldDsnMsg661,0,value.length);
   } 
	public void setAr647OldDsnMsg661(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ar647OldDsnMsg661,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ar647NewDsnMsg661
	 *	@return ar647NewDsnMsg661
	 */
   public char[] getAr647NewDsnMsg661() throws CFException{
   		return ar647NewDsnMsg661;
   }

  
	/**
	*  set variable ar647NewDsnMsg661
	*  Corresponding COBOL Variable is 661-AR647-NEW-DSN-MSG
	*  @param value
	**/
   public void setAr647NewDsnMsg661(char[] value) {
       value = checkAr647NewDsnMsg661Constraints(value);
       arraycopy(value,0,ar647NewDsnMsg661,0,value.length);
   } 
	public void setAr647NewDsnMsg661(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ar647NewDsnMsg661,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ar648ErrorMsg662
	 *	@return ar648ErrorMsg662
	 */
   public char[] getAr648ErrorMsg662() throws CFException{
   		return ar648ErrorMsg662;
   }

  
	/**
	*  set variable ar648ErrorMsg662
	*  Corresponding COBOL Variable is 662-AR648-ERROR-MSG
	*  @param value
	**/
   public void setAr648ErrorMsg662(char[] value) {
       value = checkAr648ErrorMsg662Constraints(value);
       arraycopy(value,0,ar648ErrorMsg662,0,value.length);
   } 
	public void setAr648ErrorMsg662(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ar648ErrorMsg662,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ar649ErrorMsg663
	 *	@return ar649ErrorMsg663
	 */
   public char[] getAr649ErrorMsg663() throws CFException{
   		return ar649ErrorMsg663;
   }

  
	/**
	*  set variable ar649ErrorMsg663
	*  Corresponding COBOL Variable is 663-AR649-ERROR-MSG
	*  @param value
	**/
   public void setAr649ErrorMsg663(char[] value) {
       value = checkAr649ErrorMsg663Constraints(value);
       arraycopy(value,0,ar649ErrorMsg663,0,value.length);
   } 
	public void setAr649ErrorMsg663(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ar649ErrorMsg663,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of seqioErrorMsg670
	 *	@return seqioErrorMsg670
	 */
   public char[] getSeqioErrorMsg670() throws CFException{
   		return seqioErrorMsg670;
   }

  
	/**
	*  set variable seqioErrorMsg670
	*  Corresponding COBOL Variable is 670-SEQIO-ERROR-MSG
	*  @param value
	**/
   public void setSeqioErrorMsg670(char[] value) {
       value = checkSeqioErrorMsg670Constraints(value);
       arraycopy(value,0,seqioErrorMsg670,0,value.length);
   } 
	public void setSeqioErrorMsg670(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,seqioErrorMsg670,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of seqioDdnameMsg670
	 *	@return seqioDdnameMsg670
	 */
   public char[] getSeqioDdnameMsg670() throws CFException{
   		return seqioDdnameMsg670;
   }

  
	/**
	*  set variable seqioDdnameMsg670
	*  Corresponding COBOL Variable is 670-SEQIO-DDNAME-MSG
	*  @param value
	**/
   public void setSeqioDdnameMsg670(char[] value) {
       value = checkSeqioDdnameMsg670Constraints(value);
       arraycopy(value,0,seqioDdnameMsg670,0,value.length);
   } 
	public void setSeqioDdnameMsg670(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,seqioDdnameMsg670,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of seqioRequestMsg670
	 *	@return seqioRequestMsg670
	 */
   public char[] getSeqioRequestMsg670() throws CFException{
   		return seqioRequestMsg670;
   }

  
	/**
	*  set variable seqioRequestMsg670
	*  Corresponding COBOL Variable is 670-SEQIO-REQUEST-MSG
	*  @param value
	**/
   public void setSeqioRequestMsg670(char[] value) {
       value = checkSeqioRequestMsg670Constraints(value);
       arraycopy(value,0,seqioRequestMsg670,0,value.length);
   } 
	public void setSeqioRequestMsg670(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,seqioRequestMsg670,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of seqioSysidMsg670
	 *	@return seqioSysidMsg670
	 */
   public char[] getSeqioSysidMsg670() throws CFException{
   		return seqioSysidMsg670;
   }

  
	/**
	*  set variable seqioSysidMsg670
	*  Corresponding COBOL Variable is 670-SEQIO-SYSID-MSG
	*  @param value
	**/
   public void setSeqioSysidMsg670(char[] value) {
       value = checkSeqioSysidMsg670Constraints(value);
       arraycopy(value,0,seqioSysidMsg670,0,value.length);
   } 
	public void setSeqioSysidMsg670(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,seqioSysidMsg670,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of seqioApplidMsg670
	 *	@return seqioApplidMsg670
	 */
   public char[] getSeqioApplidMsg670() throws CFException{
   		return seqioApplidMsg670;
   }

  
	/**
	*  set variable seqioApplidMsg670
	*  Corresponding COBOL Variable is 670-SEQIO-APPLID-MSG
	*  @param value
	**/
   public void setSeqioApplidMsg670(char[] value) {
       value = checkSeqioApplidMsg670Constraints(value);
       arraycopy(value,0,seqioApplidMsg670,0,value.length);
   } 
	public void setSeqioApplidMsg670(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,seqioApplidMsg670,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of seqioDsnMsg670
	 *	@return seqioDsnMsg670
	 */
   public char[] getSeqioDsnMsg670() throws CFException{
   		return seqioDsnMsg670;
   }

  
	/**
	*  set variable seqioDsnMsg670
	*  Corresponding COBOL Variable is 670-SEQIO-DSN-MSG
	*  @param value
	**/
   public void setSeqioDsnMsg670(char[] value) {
       value = checkSeqioDsnMsg670Constraints(value);
       arraycopy(value,0,seqioDsnMsg670,0,value.length);
   } 
	public void setSeqioDsnMsg670(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,seqioDsnMsg670,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of seqioTapserMsg670
	 *	@return seqioTapserMsg670
	 */
   public char[] getSeqioTapserMsg670() throws CFException{
   		return seqioTapserMsg670;
   }

  
	/**
	*  set variable seqioTapserMsg670
	*  Corresponding COBOL Variable is 670-SEQIO-TAPSER-MSG
	*  @param value
	**/
   public void setSeqioTapserMsg670(char[] value) {
       value = checkSeqioTapserMsg670Constraints(value);
       arraycopy(value,0,seqioTapserMsg670,0,value.length);
   } 
	public void setSeqioTapserMsg670(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,seqioTapserMsg670,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of seqioVolserMsg670
	 *	@return seqioVolserMsg670
	 */
   public char[] getSeqioVolserMsg670() throws CFException{
   		return seqioVolserMsg670;
   }

  
	/**
	*  set variable seqioVolserMsg670
	*  Corresponding COBOL Variable is 670-SEQIO-VOLSER-MSG
	*  @param value
	**/
   public void setSeqioVolserMsg670(char[] value) {
       value = checkSeqioVolserMsg670Constraints(value);
       arraycopy(value,0,seqioVolserMsg670,0,value.length);
   } 
	public void setSeqioVolserMsg670(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,seqioVolserMsg670,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of seqioLabelMsg670
	 *	@return seqioLabelMsg670
	 */
   public char[] getSeqioLabelMsg670() throws CFException{
   		return seqioLabelMsg670;
   }

  
	/**
	*  set variable seqioLabelMsg670
	*  Corresponding COBOL Variable is 670-SEQIO-LABEL-MSG
	*  @param value
	**/
   public void setSeqioLabelMsg670(char[] value) {
       value = checkSeqioLabelMsg670Constraints(value);
       arraycopy(value,0,seqioLabelMsg670,0,value.length);
   } 
	public void setSeqioLabelMsg670(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,seqioLabelMsg670,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of seqioRecfmMsg670
	 *	@return seqioRecfmMsg670
	 */
   public char[] getSeqioRecfmMsg670() throws CFException{
   		return seqioRecfmMsg670;
   }

  
	/**
	*  set variable seqioRecfmMsg670
	*  Corresponding COBOL Variable is 670-SEQIO-RECFM-MSG
	*  @param value
	**/
   public void setSeqioRecfmMsg670(char[] value) {
       value = checkSeqioRecfmMsg670Constraints(value);
       arraycopy(value,0,seqioRecfmMsg670,0,value.length);
   } 
	public void setSeqioRecfmMsg670(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,seqioRecfmMsg670,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of copyFailureGft680
	 *	@return copyFailureGft680
	 */
   public char[] getCopyFailureGft680() throws CFException{
   		return copyFailureGft680;
   }

  
	/**
	*  set variable copyFailureGft680
	*  Corresponding COBOL Variable is 680-COPY-FAILURE-GFT
	*  @param value
	**/
   public void setCopyFailureGft680(char[] value) {
       value = checkCopyFailureGft680Constraints(value);
       arraycopy(value,0,copyFailureGft680,0,value.length);
   } 
	public void setCopyFailureGft680(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,copyFailureGft680,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of copyFailureAppl680
	 *	@return copyFailureAppl680
	 */
   public char[] getCopyFailureAppl680() throws CFException{
   		return copyFailureAppl680;
   }

  
	/**
	*  set variable copyFailureAppl680
	*  Corresponding COBOL Variable is 680-COPY-FAILURE-APPL
	*  @param value
	**/
   public void setCopyFailureAppl680(char[] value) {
       value = checkCopyFailureAppl680Constraints(value);
       arraycopy(value,0,copyFailureAppl680,0,value.length);
   } 
	public void setCopyFailureAppl680(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,copyFailureAppl680,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of renameFailure680
	 *	@return renameFailure680
	 */
   public char[] getRenameFailure680() throws CFException{
   		return renameFailure680;
   }

  
	/**
	*  set variable renameFailure680
	*  Corresponding COBOL Variable is 680-RENAME-FAILURE
	*  @param value
	**/
   public void setRenameFailure680(char[] value) {
       value = checkRenameFailure680Constraints(value);
       arraycopy(value,0,renameFailure680,0,value.length);
   } 
	public void setRenameFailure680(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,renameFailure680,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of copyCountsMsg680
	 *	@return copyCountsMsg680
	 */
   public char[] getCopyCountsMsg680() throws CFException{
   		return copyCountsMsg680;
   }

  
	/**
	*  set variable copyCountsMsg680
	*  Corresponding COBOL Variable is 680-COPY-COUNTS-MSG
	*  @param value
	**/
   public void setCopyCountsMsg680(char[] value) {
       value = checkCopyCountsMsg680Constraints(value);
       arraycopy(value,0,copyCountsMsg680,0,value.length);
   } 
	public void setCopyCountsMsg680(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,copyCountsMsg680,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of installPostExitInfo680
	 *	@return installPostExitInfo680
	 */
   public char[] getInstallPostExitInfo680() throws CFException{
   		return installPostExitInfo680;
   }

  
	/**
	*  set variable installPostExitInfo680
	*  Corresponding COBOL Variable is 680-INSTALL-POST-EXIT-INFO
	*  @param value
	**/
   public void setInstallPostExitInfo680(char[] value) {
       value = checkInstallPostExitInfo680Constraints(value);
       arraycopy(value,0,installPostExitInfo680,0,value.length);
   } 
	public void setInstallPostExitInfo680(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,installPostExitInfo680,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errorInfoMsg690
	 *	@return errorInfoMsg690
	 */
   public char[] getErrorInfoMsg690() throws CFException{
   		return errorInfoMsg690;
   }

  
	/**
	*  set variable errorInfoMsg690
	*  Corresponding COBOL Variable is 690-ERROR-INFO-MSG
	*  @param value
	**/
   public void setErrorInfoMsg690(char[] value) {
       value = checkErrorInfoMsg690Constraints(value);
       arraycopy(value,0,errorInfoMsg690,0,value.length);
   } 
	public void setErrorInfoMsg690(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errorInfoMsg690,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of seeSystsprtMsg690
	 *	@return seeSystsprtMsg690
	 */
   public char[] getSeeSystsprtMsg690() throws CFException{
   		return seeSystsprtMsg690;
   }

  
	/**
	*  set variable seeSystsprtMsg690
	*  Corresponding COBOL Variable is 690-SEE-SYSTSPRT-MSG
	*  @param value
	**/
   public void setSeeSystsprtMsg690(char[] value) {
       value = checkSeeSystsprtMsg690Constraints(value);
       arraycopy(value,0,seeSystsprtMsg690,0,value.length);
   } 
	public void setSeeSystsprtMsg690(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,seeSystsprtMsg690,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errorConsMsg692
	 *	@return errorConsMsg692
	 */
   public char[] getErrorConsMsg692() throws CFException{
   		return errorConsMsg692;
   }

  
	/**
	*  set variable errorConsMsg692
	*  Corresponding COBOL Variable is 692-ERROR-CONS-MSG
	*  @param value
	**/
   public void setErrorConsMsg692(char[] value) {
       value = checkErrorConsMsg692Constraints(value);
       arraycopy(value,0,errorConsMsg692,0,value.length);
   } 
	public void setErrorConsMsg692(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errorConsMsg692,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errorConsMsgHdr692
	 *	@return errorConsMsgHdr692
	 */
   public char[] getErrorConsMsgHdr692() throws CFException{
   		return errorConsMsgHdr692;
   }

  
	/**
	*  set variable errorConsMsgHdr692
	*  Corresponding COBOL Variable is 692-ERROR-CONS-MSG-HDR
	*  @param value
	**/
   public void setErrorConsMsgHdr692(char[] value) {
       value = checkErrorConsMsgHdr692Constraints(value);
       arraycopy(value,0,errorConsMsgHdr692,0,value.length);
   } 
	public void setErrorConsMsgHdr692(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errorConsMsgHdr692,0,beginIndex + endIndex);
   }
	char[] setupEptMissing8869288Value = "ORIGINAL ENDPOINT NOT FOUND ON TARAEPT FOR #           ".toCharArray();
	/**
	 *	Test condition "ORIGINAL ENDPOINT NOT FOUND ON TARAEPT FOR #" for isSetupEptMissing88692()
	 *	@return  Returns true if isSetupEptMissing88692() is "ORIGINAL ENDPOINT NOT FOUND ON TARAEPT FOR #"
	 */
   public boolean isSetupEptMissing88692() throws CFException {
      return (  compareChars( getErrorConsMsgHdr692() , setupEptMissing8869288Value)  == 0  );
   }


	/**
	*  set values "ORIGINAL ENDPOINT NOT FOUND ON TARAEPT FOR #"
	*/
   	public void setSetupEptMissing88692True() {  			
    	setErrorConsMsgHdr692( setupEptMissing8869288Value);
   	}
	char[] setupEptBackup8869288Value = "BACKUP ENDPOINT NOT FOUND ON TARAEPT FOR #             ".toCharArray();
	/**
	 *	Test condition "BACKUP ENDPOINT NOT FOUND ON TARAEPT FOR #" for isSetupEptBackup88692()
	 *	@return  Returns true if isSetupEptBackup88692() is "BACKUP ENDPOINT NOT FOUND ON TARAEPT FOR #"
	 */
   public boolean isSetupEptBackup88692() throws CFException {
      return (  compareChars( getErrorConsMsgHdr692() , setupEptBackup8869288Value)  == 0  );
   }


	/**
	*  set values "BACKUP ENDPOINT NOT FOUND ON TARAEPT FOR #"
	*/
   	public void setSetupEptBackup88692True() {  			
    	setErrorConsMsgHdr692( setupEptBackup8869288Value);
   	}
	char[] setupEptBroken8869288Value = "BACKUP CHAIN BROKEN FOR #                              ".toCharArray();
	/**
	 *	Test condition "BACKUP CHAIN BROKEN FOR #" for isSetupEptBroken88692()
	 *	@return  Returns true if isSetupEptBroken88692() is "BACKUP CHAIN BROKEN FOR #"
	 */
   public boolean isSetupEptBroken88692() throws CFException {
      return (  compareChars( getErrorConsMsgHdr692() , setupEptBroken8869288Value)  == 0  );
   }


	/**
	*  set values "BACKUP CHAIN BROKEN FOR #"
	*/
   	public void setSetupEptBroken88692True() {  			
    	setErrorConsMsgHdr692( setupEptBroken8869288Value);
   	}
	char[] setupEptLoops8869288Value = "BACKUP ENDPOINT LOOPS BACK FOR #                       ".toCharArray();
	/**
	 *	Test condition "BACKUP ENDPOINT LOOPS BACK FOR #" for isSetupEptLoops88692()
	 *	@return  Returns true if isSetupEptLoops88692() is "BACKUP ENDPOINT LOOPS BACK FOR #"
	 */
   public boolean isSetupEptLoops88692() throws CFException {
      return (  compareChars( getErrorConsMsgHdr692() , setupEptLoops8869288Value)  == 0  );
   }


	/**
	*  set values "BACKUP ENDPOINT LOOPS BACK FOR #"
	*/
   	public void setSetupEptLoops88692True() {  			
    	setErrorConsMsgHdr692( setupEptLoops8869288Value);
   	}
	char[] setupEptNonFtss8869288Value = "ENDPOINT IS NOT AN FTSS ENDPOINT #                     ".toCharArray();
	/**
	 *	Test condition "ENDPOINT IS NOT AN FTSS ENDPOINT #" for isSetupEptNonFtss88692()
	 *	@return  Returns true if isSetupEptNonFtss88692() is "ENDPOINT IS NOT AN FTSS ENDPOINT #"
	 */
   public boolean isSetupEptNonFtss88692() throws CFException {
      return (  compareChars( getErrorConsMsgHdr692() , setupEptNonFtss8869288Value)  == 0  );
   }


	/**
	*  set values "ENDPOINT IS NOT AN FTSS ENDPOINT #"
	*/
   	public void setSetupEptNonFtss88692True() {  			
    	setErrorConsMsgHdr692( setupEptNonFtss8869288Value);
   	}
	char[] setupEfpMissing8869288Value = "ORIGINAL PROFILE NOT FOUND FOR #                       ".toCharArray();
	/**
	 *	Test condition "ORIGINAL PROFILE NOT FOUND FOR #" for isSetupEfpMissing88692()
	 *	@return  Returns true if isSetupEfpMissing88692() is "ORIGINAL PROFILE NOT FOUND FOR #"
	 */
   public boolean isSetupEfpMissing88692() throws CFException {
      return (  compareChars( getErrorConsMsgHdr692() , setupEfpMissing8869288Value)  == 0  );
   }


	/**
	*  set values "ORIGINAL PROFILE NOT FOUND FOR #"
	*/
   	public void setSetupEfpMissing88692True() {  			
    	setErrorConsMsgHdr692( setupEfpMissing8869288Value);
   	}
	char[] setupEfpBackup8869288Value = "BACKUP PROFILE NOT FOUND FOR #                         ".toCharArray();
	/**
	 *	Test condition "BACKUP PROFILE NOT FOUND FOR #" for isSetupEfpBackup88692()
	 *	@return  Returns true if isSetupEfpBackup88692() is "BACKUP PROFILE NOT FOUND FOR #"
	 */
   public boolean isSetupEfpBackup88692() throws CFException {
      return (  compareChars( getErrorConsMsgHdr692() , setupEfpBackup8869288Value)  == 0  );
   }


	/**
	*  set values "BACKUP PROFILE NOT FOUND FOR #"
	*/
   	public void setSetupEfpBackup88692True() {  			
    	setErrorConsMsgHdr692( setupEfpBackup8869288Value);
   	}
	char[] setupBulkNtFnd8869288Value = "BULK ID NOT FOUND ON TARAFPL FOR #                     ".toCharArray();
	/**
	 *	Test condition "BULK ID NOT FOUND ON TARAFPL FOR #" for isSetupBulkNtFnd88692()
	 *	@return  Returns true if isSetupBulkNtFnd88692() is "BULK ID NOT FOUND ON TARAFPL FOR #"
	 */
   public boolean isSetupBulkNtFnd88692() throws CFException {
      return (  compareChars( getErrorConsMsgHdr692() , setupBulkNtFnd8869288Value)  == 0  );
   }


	/**
	*  set values "BULK ID NOT FOUND ON TARAFPL FOR #"
	*/
   	public void setSetupBulkNtFnd88692True() {  			
    	setErrorConsMsgHdr692( setupBulkNtFnd8869288Value);
   	}
	/**
	 *	Returns the value of omnibusAlertFlag820
	 *	@return omnibusAlertFlag820
	 */
   public char[] getOmnibusAlertFlag820() throws CFException{
   		return omnibusAlertFlag820;
   }

  
	/**
	*  set variable omnibusAlertFlag820
	*  Corresponding COBOL Variable is 820-OMNIBUS-ALERT-FLAG
	*  @param value
	**/
   public void setOmnibusAlertFlag820(char[] value) {
       value = checkOmnibusAlertFlag820Constraints(value);
       arraycopy(value,0,omnibusAlertFlag820,0,value.length);
   } 
	public void setOmnibusAlertFlag820(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,omnibusAlertFlag820,0,beginIndex + endIndex);
   }
	char[] alertSent8882088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isAlertSent88820()
	 *	@return  Returns true if isAlertSent88820() is "Y"
	 */
   public boolean isAlertSent88820() throws CFException {
      return (  compareChars( getOmnibusAlertFlag820() , alertSent8882088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setAlertSent88820True() {  			
    	setOmnibusAlertFlag820( alertSent8882088Value);
   	}
	char[] alertNotSent8882088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isAlertNotSent88820()
	 *	@return  Returns true if isAlertNotSent88820() is "N"
	 */
   public boolean isAlertNotSent88820() throws CFException {
      return (  compareChars( getOmnibusAlertFlag820() , alertNotSent8882088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setAlertNotSent88820True() {  			
    	setOmnibusAlertFlag820( alertNotSent8882088Value);
   	}
	/**
	 *	Returns the value of statRefId810
	 *	@return statRefId810
	 */
   public char[] getStatRefId810() throws CFException{
   		return statRefId810;
   }

  
	/**
	*  set variable statRefId810
	*  Corresponding COBOL Variable is 810-STAT-REF-ID
	*  @param value
	**/
   public void setStatRefId810(char[] value) {
       value = checkStatRefId810Constraints(value);
       arraycopy(value,0,statRefId810,0,value.length);
   } 
	public void setStatRefId810(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,statRefId810,0,beginIndex + endIndex);
   }
	char[] srNoStatIdAssgnd8881088Value = fillLowValue(4);
	/**
	 *	Test condition new byte[] {(byte)0x00} for isSrNoStatIdAssgnd88810()
	 *	@return  Returns true if isSrNoStatIdAssgnd88810() is new byte[] {(byte)0x00}
	 */
   public boolean isSrNoStatIdAssgnd88810() throws CFException {
      return (  compareChars( getStatRefId810() , srNoStatIdAssgnd8881088Value)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00}
	*/
   	public void setSrNoStatIdAssgnd88810True() {  			
    	setStatRefId810( srNoStatIdAssgnd8881088Value);
   	}
	char[] srRecdAtDlvryEpt8881088Value = "0100".toCharArray();
	/**
	 *	Test condition "0100" for isSrRecdAtDlvryEpt88810()
	 *	@return  Returns true if isSrRecdAtDlvryEpt88810() is "0100"
	 */
   public boolean isSrRecdAtDlvryEpt88810() throws CFException {
      return (  compareChars( getStatRefId810() , srRecdAtDlvryEpt8881088Value)  == 0  );
   }


	/**
	*  set values "0100"
	*/
   	public void setSrRecdAtDlvryEpt88810True() {  			
    	setStatRefId810( srRecdAtDlvryEpt8881088Value);
   	}
	char[] srErrAtDlvryEpt8881088Value = "0110".toCharArray();
	/**
	 *	Test condition "0110" for isSrErrAtDlvryEpt88810()
	 *	@return  Returns true if isSrErrAtDlvryEpt88810() is "0110"
	 */
   public boolean isSrErrAtDlvryEpt88810() throws CFException {
      return (  compareChars( getStatRefId810() , srErrAtDlvryEpt8881088Value)  == 0  );
   }


	/**
	*  set values "0110"
	*/
   	public void setSrErrAtDlvryEpt88810True() {  			
    	setStatRefId810( srErrAtDlvryEpt8881088Value);
   	}
	char[] srXferIToDEpt8881088Value = "0120".toCharArray();
	/**
	 *	Test condition "0120" for isSrXferIToDEpt88810()
	 *	@return  Returns true if isSrXferIToDEpt88810() is "0120"
	 */
   public boolean isSrXferIToDEpt88810() throws CFException {
      return (  compareChars( getStatRefId810() , srXferIToDEpt8881088Value)  == 0  );
   }


	/**
	*  set values "0120"
	*/
   	public void setSrXferIToDEpt88810True() {  			
    	setStatRefId810( srXferIToDEpt8881088Value);
   	}
	char[] srDlvrdToDlvryEpt8881088Value = "0130".toCharArray();
	/**
	 *	Test condition "0130" for isSrDlvrdToDlvryEpt88810()
	 *	@return  Returns true if isSrDlvrdToDlvryEpt88810() is "0130"
	 */
   public boolean isSrDlvrdToDlvryEpt88810() throws CFException {
      return (  compareChars( getStatRefId810() , srDlvrdToDlvryEpt8881088Value)  == 0  );
   }


	/**
	*  set values "0130"
	*/
   	public void setSrDlvrdToDlvryEpt88810True() {  			
    	setStatRefId810( srDlvrdToDlvryEpt8881088Value);
   	}
	char[] srDlvryEptErr8881088Value = "0140".toCharArray();
	/**
	 *	Test condition "0140" for isSrDlvryEptErr88810()
	 *	@return  Returns true if isSrDlvryEptErr88810() is "0140"
	 */
   public boolean isSrDlvryEptErr88810() throws CFException {
      return (  compareChars( getStatRefId810() , srDlvryEptErr8881088Value)  == 0  );
   }


	/**
	*  set values "0140"
	*/
   	public void setSrDlvryEptErr88810True() {  			
    	setStatRefId810( srDlvryEptErr8881088Value);
   	}
	char[] srRecdAtIntEpt8881088Value = "0200".toCharArray();
	/**
	 *	Test condition "0200" for isSrRecdAtIntEpt88810()
	 *	@return  Returns true if isSrRecdAtIntEpt88810() is "0200"
	 */
   public boolean isSrRecdAtIntEpt88810() throws CFException {
      return (  compareChars( getStatRefId810() , srRecdAtIntEpt8881088Value)  == 0  );
   }


	/**
	*  set values "0200"
	*/
   	public void setSrRecdAtIntEpt88810True() {  			
    	setStatRefId810( srRecdAtIntEpt8881088Value);
   	}
	char[] srErrAtIntEpt8881088Value = "0210".toCharArray();
	/**
	 *	Test condition "0210" for isSrErrAtIntEpt88810()
	 *	@return  Returns true if isSrErrAtIntEpt88810() is "0210"
	 */
   public boolean isSrErrAtIntEpt88810() throws CFException {
      return (  compareChars( getStatRefId810() , srErrAtIntEpt8881088Value)  == 0  );
   }


	/**
	*  set values "0210"
	*/
   	public void setSrErrAtIntEpt88810True() {  			
    	setStatRefId810( srErrAtIntEpt8881088Value);
   	}
	char[] srXferHubToIe8881088Value = "0220".toCharArray();
	/**
	 *	Test condition "0220" for isSrXferHubToIe88810()
	 *	@return  Returns true if isSrXferHubToIe88810() is "0220"
	 */
   public boolean isSrXferHubToIe88810() throws CFException {
      return (  compareChars( getStatRefId810() , srXferHubToIe8881088Value)  == 0  );
   }


	/**
	*  set values "0220"
	*/
   	public void setSrXferHubToIe88810True() {  			
    	setStatRefId810( srXferHubToIe8881088Value);
   	}
	char[] srDelvrdToIe8881088Value = "0230".toCharArray();
	/**
	 *	Test condition "0230" for isSrDelvrdToIe88810()
	 *	@return  Returns true if isSrDelvrdToIe88810() is "0230"
	 */
   public boolean isSrDelvrdToIe88810() throws CFException {
      return (  compareChars( getStatRefId810() , srDelvrdToIe8881088Value)  == 0  );
   }


	/**
	*  set values "0230"
	*/
   	public void setSrDelvrdToIe88810True() {  			
    	setStatRefId810( srDelvrdToIe8881088Value);
   	}
	char[] srIntermdEptError8881088Value = "0240".toCharArray();
	/**
	 *	Test condition "0240" for isSrIntermdEptError88810()
	 *	@return  Returns true if isSrIntermdEptError88810() is "0240"
	 */
   public boolean isSrIntermdEptError88810() throws CFException {
      return (  compareChars( getStatRefId810() , srIntermdEptError8881088Value)  == 0  );
   }


	/**
	*  set values "0240"
	*/
   	public void setSrIntermdEptError88810True() {  			
    	setStatRefId810( srIntermdEptError8881088Value);
   	}
	char[] srInProgress8881088Value = "0400".toCharArray();
	/**
	 *	Test condition "0400" for isSrInProgress88810()
	 *	@return  Returns true if isSrInProgress88810() is "0400"
	 */
   public boolean isSrInProgress88810() throws CFException {
      return (  compareChars( getStatRefId810() , srInProgress8881088Value)  == 0  );
   }


	/**
	*  set values "0400"
	*/
   	public void setSrInProgress88810True() {  			
    	setStatRefId810( srInProgress8881088Value);
   	}
	char[] srAllocError8881088Value = "0410".toCharArray();
	/**
	 *	Test condition "0410" for isSrAllocError88810()
	 *	@return  Returns true if isSrAllocError88810() is "0410"
	 */
   public boolean isSrAllocError88810() throws CFException {
      return (  compareChars( getStatRefId810() , srAllocError8881088Value)  == 0  );
   }


	/**
	*  set values "0410"
	*/
   	public void setSrAllocError88810True() {  			
    	setStatRefId810( srAllocError8881088Value);
   	}
	char[] srIOError8881088Value = "0415".toCharArray();
	/**
	 *	Test condition "0415" for isSrIOError88810()
	 *	@return  Returns true if isSrIOError88810() is "0415"
	 */
   public boolean isSrIOError88810() throws CFException {
      return (  compareChars( getStatRefId810() , srIOError8881088Value)  == 0  );
   }


	/**
	*  set values "0415"
	*/
   	public void setSrIOError88810True() {  			
    	setStatRefId810( srIOError8881088Value);
   	}
	char[] srConfigError8881088Value = "0420".toCharArray();
	/**
	 *	Test condition "0420" for isSrConfigError88810()
	 *	@return  Returns true if isSrConfigError88810() is "0420"
	 */
   public boolean isSrConfigError88810() throws CFException {
      return (  compareChars( getStatRefId810() , srConfigError8881088Value)  == 0  );
   }


	/**
	*  set values "0420"
	*/
   	public void setSrConfigError88810True() {  			
    	setStatRefId810( srConfigError8881088Value);
   	}
	char[] srDuplicateFile8881088Value = "0430".toCharArray();
	/**
	 *	Test condition "0430" for isSrDuplicateFile88810()
	 *	@return  Returns true if isSrDuplicateFile88810() is "0430"
	 */
   public boolean isSrDuplicateFile88810() throws CFException {
      return (  compareChars( getStatRefId810() , srDuplicateFile8881088Value)  == 0  );
   }


	/**
	*  set values "0430"
	*/
   	public void setSrDuplicateFile88810True() {  			
    	setStatRefId810( srDuplicateFile8881088Value);
   	}
	char[] srCommError8881088Value = "0440".toCharArray();
	/**
	 *	Test condition "0440" for isSrCommError88810()
	 *	@return  Returns true if isSrCommError88810() is "0440"
	 */
   public boolean isSrCommError88810() throws CFException {
      return (  compareChars( getStatRefId810() , srCommError8881088Value)  == 0  );
   }


	/**
	*  set values "0440"
	*/
   	public void setSrCommError88810True() {  			
    	setStatRefId810( srCommError8881088Value);
   	}
	char[] srSubmitError8881088Value = "0450".toCharArray();
	/**
	 *	Test condition "0450" for isSrSubmitError88810()
	 *	@return  Returns true if isSrSubmitError88810() is "0450"
	 */
   public boolean isSrSubmitError88810() throws CFException {
      return (  compareChars( getStatRefId810() , srSubmitError8881088Value)  == 0  );
   }


	/**
	*  set values "0450"
	*/
   	public void setSrSubmitError88810True() {  			
    	setStatRefId810( srSubmitError8881088Value);
   	}
	char[] srTriggerError8881088Value = "0460".toCharArray();
	/**
	 *	Test condition "0460" for isSrTriggerError88810()
	 *	@return  Returns true if isSrTriggerError88810() is "0460"
	 */
   public boolean isSrTriggerError88810() throws CFException {
      return (  compareChars( getStatRefId810() , srTriggerError8881088Value)  == 0  );
   }


	/**
	*  set values "0460"
	*/
   	public void setSrTriggerError88810True() {  			
    	setStatRefId810( srTriggerError8881088Value);
   	}
	char[] srPrcssTermErr8881088Value = "0465".toCharArray();
	/**
	 *	Test condition "0465" for isSrPrcssTermErr88810()
	 *	@return  Returns true if isSrPrcssTermErr88810() is "0465"
	 */
   public boolean isSrPrcssTermErr88810() throws CFException {
      return (  compareChars( getStatRefId810() , srPrcssTermErr8881088Value)  == 0  );
   }


	/**
	*  set values "0465"
	*/
   	public void setSrPrcssTermErr88810True() {  			
    	setStatRefId810( srPrcssTermErr8881088Value);
   	}
	char[] srExitJobFailed8881088Value = "0470".toCharArray();
	/**
	 *	Test condition "0470" for isSrExitJobFailed88810()
	 *	@return  Returns true if isSrExitJobFailed88810() is "0470"
	 */
   public boolean isSrExitJobFailed88810() throws CFException {
      return (  compareChars( getStatRefId810() , srExitJobFailed8881088Value)  == 0  );
   }


	/**
	*  set values "0470"
	*/
   	public void setSrExitJobFailed88810True() {  			
    	setStatRefId810( srExitJobFailed8881088Value);
   	}
	char[] srExitSubmitErr8881088Value = "0475".toCharArray();
	/**
	 *	Test condition "0475" for isSrExitSubmitErr88810()
	 *	@return  Returns true if isSrExitSubmitErr88810() is "0475"
	 */
   public boolean isSrExitSubmitErr88810() throws CFException {
      return (  compareChars( getStatRefId810() , srExitSubmitErr8881088Value)  == 0  );
   }


	/**
	*  set values "0475"
	*/
   	public void setSrExitSubmitErr88810True() {  			
    	setStatRefId810( srExitSubmitErr8881088Value);
   	}
	char[] srXferMethodError8881088Value = "0480".toCharArray();
	/**
	 *	Test condition "0480" for isSrXferMethodError88810()
	 *	@return  Returns true if isSrXferMethodError88810() is "0480"
	 */
   public boolean isSrXferMethodError88810() throws CFException {
      return (  compareChars( getStatRefId810() , srXferMethodError8881088Value)  == 0  );
   }


	/**
	*  set values "0480"
	*/
   	public void setSrXferMethodError88810True() {  			
    	setStatRefId810( srXferMethodError8881088Value);
   	}
	char[] srEncryptionError8881088Value = "0481".toCharArray();
	/**
	 *	Test condition "0481" for isSrEncryptionError88810()
	 *	@return  Returns true if isSrEncryptionError88810() is "0481"
	 */
   public boolean isSrEncryptionError88810() throws CFException {
      return (  compareChars( getStatRefId810() , srEncryptionError8881088Value)  == 0  );
   }


	/**
	*  set values "0481"
	*/
   	public void setSrEncryptionError88810True() {  			
    	setStatRefId810( srEncryptionError8881088Value);
   	}
	char[] srDecryptionError8881088Value = "0482".toCharArray();
	/**
	 *	Test condition "0482" for isSrDecryptionError88810()
	 *	@return  Returns true if isSrDecryptionError88810() is "0482"
	 */
   public boolean isSrDecryptionError88810() throws CFException {
      return (  compareChars( getStatRefId810() , srDecryptionError8881088Value)  == 0  );
   }


	/**
	*  set values "0482"
	*/
   	public void setSrDecryptionError88810True() {  			
    	setStatRefId810( srDecryptionError8881088Value);
   	}
	char[] srDirectionError8881088Value = "0483".toCharArray();
	/**
	 *	Test condition "0483" for isSrDirectionError88810()
	 *	@return  Returns true if isSrDirectionError88810() is "0483"
	 */
   public boolean isSrDirectionError88810() throws CFException {
      return (  compareChars( getStatRefId810() , srDirectionError8881088Value)  == 0  );
   }


	/**
	*  set values "0483"
	*/
   	public void setSrDirectionError88810True() {  			
    	setStatRefId810( srDirectionError8881088Value);
   	}
	char[] srUnknownError8881088Value = "0490".toCharArray();
	/**
	 *	Test condition "0490" for isSrUnknownError88810()
	 *	@return  Returns true if isSrUnknownError88810() is "0490"
	 */
   public boolean isSrUnknownError88810() throws CFException {
      return (  compareChars( getStatRefId810() , srUnknownError8881088Value)  == 0  );
   }


	/**
	*  set values "0490"
	*/
   	public void setSrUnknownError88810True() {  			
    	setStatRefId810( srUnknownError8881088Value);
   	}
	char[] srMxrtryReached8881088Value = "0499".toCharArray();
	/**
	 *	Test condition "0499" for isSrMxrtryReached88810()
	 *	@return  Returns true if isSrMxrtryReached88810() is "0499"
	 */
   public boolean isSrMxrtryReached88810() throws CFException {
      return (  compareChars( getStatRefId810() , srMxrtryReached8881088Value)  == 0  );
   }


	/**
	*  set values "0499"
	*/
   	public void setSrMxrtryReached88810True() {  			
    	setStatRefId810( srMxrtryReached8881088Value);
   	}
	char[] srAvailable8881088Value = "0500".toCharArray();
	/**
	 *	Test condition "0500" for isSrAvailable88810()
	 *	@return  Returns true if isSrAvailable88810() is "0500"
	 */
   public boolean isSrAvailable88810() throws CFException {
      return (  compareChars( getStatRefId810() , srAvailable8881088Value)  == 0  );
   }


	/**
	*  set values "0500"
	*/
   	public void setSrAvailable88810True() {  			
    	setStatRefId810( srAvailable8881088Value);
   	}
	char[] srHeldByOps8881088Value = "0510".toCharArray();
	/**
	 *	Test condition "0510" for isSrHeldByOps88810()
	 *	@return  Returns true if isSrHeldByOps88810() is "0510"
	 */
   public boolean isSrHeldByOps88810() throws CFException {
      return (  compareChars( getStatRefId810() , srHeldByOps8881088Value)  == 0  );
   }


	/**
	*  set values "0510"
	*/
   	public void setSrHeldByOps88810True() {  			
    	setStatRefId810( srHeldByOps8881088Value);
   	}
	char[] srEndpointHold8881088Value = "0520".toCharArray();
	/**
	 *	Test condition "0520" for isSrEndpointHold88810()
	 *	@return  Returns true if isSrEndpointHold88810() is "0520"
	 */
   public boolean isSrEndpointHold88810() throws CFException {
      return (  compareChars( getStatRefId810() , srEndpointHold8881088Value)  == 0  );
   }


	/**
	*  set values "0520"
	*/
   	public void setSrEndpointHold88810True() {  			
    	setStatRefId810( srEndpointHold8881088Value);
   	}
	char[] srHoldFplConfig8881088Value = "0530".toCharArray();
	/**
	 *	Test condition "0530" for isSrHoldFplConfig88810()
	 *	@return  Returns true if isSrHoldFplConfig88810() is "0530"
	 */
   public boolean isSrHoldFplConfig88810() throws CFException {
      return (  compareChars( getStatRefId810() , srHoldFplConfig8881088Value)  == 0  );
   }


	/**
	*  set values "0530"
	*/
   	public void setSrHoldFplConfig88810True() {  			
    	setStatRefId810( srHoldFplConfig8881088Value);
   	}
	char[] srQuiesced8881088Value = "0540".toCharArray();
	/**
	 *	Test condition "0540" for isSrQuiesced88810()
	 *	@return  Returns true if isSrQuiesced88810() is "0540"
	 */
   public boolean isSrQuiesced88810() throws CFException {
      return (  compareChars( getStatRefId810() , srQuiesced8881088Value)  == 0  );
   }


	/**
	*  set values "0540"
	*/
   	public void setSrQuiesced88810True() {  			
    	setStatRefId810( srQuiesced8881088Value);
   	}
	char[] srSftCntlAdded8881088Value = "0550".toCharArray();
	/**
	 *	Test condition "0550" for isSrSftCntlAdded88810()
	 *	@return  Returns true if isSrSftCntlAdded88810() is "0550"
	 */
   public boolean isSrSftCntlAdded88810() throws CFException {
      return (  compareChars( getStatRefId810() , srSftCntlAdded8881088Value)  == 0  );
   }


	/**
	*  set values "0550"
	*/
   	public void setSrSftCntlAdded88810True() {  			
    	setStatRefId810( srSftCntlAdded8881088Value);
   	}
	char[] srProcessingToTape8881088Value = "0560".toCharArray();
	/**
	 *	Test condition "0560" for isSrProcessingToTape88810()
	 *	@return  Returns true if isSrProcessingToTape88810() is "0560"
	 */
   public boolean isSrProcessingToTape88810() throws CFException {
      return (  compareChars( getStatRefId810() , srProcessingToTape8881088Value)  == 0  );
   }


	/**
	*  set values "0560"
	*/
   	public void setSrProcessingToTape88810True() {  			
    	setStatRefId810( srProcessingToTape8881088Value);
   	}
	char[] srContingencyHold8881088Value = "0570".toCharArray();
	/**
	 *	Test condition "0570" for isSrContingencyHold88810()
	 *	@return  Returns true if isSrContingencyHold88810() is "0570"
	 */
   public boolean isSrContingencyHold88810() throws CFException {
      return (  compareChars( getStatRefId810() , srContingencyHold8881088Value)  == 0  );
   }


	/**
	*  set values "0570"
	*/
   	public void setSrContingencyHold88810True() {  			
    	setStatRefId810( srContingencyHold8881088Value);
   	}
	char[] srDownloading8881088Value = "0600".toCharArray();
	/**
	 *	Test condition "0600" for isSrDownloading88810()
	 *	@return  Returns true if isSrDownloading88810() is "0600"
	 */
   public boolean isSrDownloading88810() throws CFException {
      return (  compareChars( getStatRefId810() , srDownloading8881088Value)  == 0  );
   }


	/**
	*  set values "0600"
	*/
   	public void setSrDownloading88810True() {  			
    	setStatRefId810( srDownloading8881088Value);
   	}
	char[] srUploading8881088Value = "0605".toCharArray();
	/**
	 *	Test condition "0605" for isSrUploading88810()
	 *	@return  Returns true if isSrUploading88810() is "0605"
	 */
   public boolean isSrUploading88810() throws CFException {
      return (  compareChars( getStatRefId810() , srUploading8881088Value)  == 0  );
   }


	/**
	*  set values "0605"
	*/
   	public void setSrUploading88810True() {  			
    	setStatRefId810( srUploading8881088Value);
   	}
	char[] srWaitingExit8881088Value = "0610".toCharArray();
	/**
	 *	Test condition "0610" for isSrWaitingExit88810()
	 *	@return  Returns true if isSrWaitingExit88810() is "0610"
	 */
   public boolean isSrWaitingExit88810() throws CFException {
      return (  compareChars( getStatRefId810() , srWaitingExit8881088Value)  == 0  );
   }


	/**
	*  set values "0610"
	*/
   	public void setSrWaitingExit88810True() {  			
    	setStatRefId810( srWaitingExit8881088Value);
   	}
	char[] srWaitingPull8881088Value = "0620".toCharArray();
	/**
	 *	Test condition "0620" for isSrWaitingPull88810()
	 *	@return  Returns true if isSrWaitingPull88810() is "0620"
	 */
   public boolean isSrWaitingPull88810() throws CFException {
      return (  compareChars( getStatRefId810() , srWaitingPull8881088Value)  == 0  );
   }


	/**
	*  set values "0620"
	*/
   	public void setSrWaitingPull88810True() {  			
    	setStatRefId810( srWaitingPull8881088Value);
   	}
	char[] srWaitingRouting8881088Value = "0630".toCharArray();
	/**
	 *	Test condition "0630" for isSrWaitingRouting88810()
	 *	@return  Returns true if isSrWaitingRouting88810() is "0630"
	 */
   public boolean isSrWaitingRouting88810() throws CFException {
      return (  compareChars( getStatRefId810() , srWaitingRouting8881088Value)  == 0  );
   }


	/**
	*  set values "0630"
	*/
   	public void setSrWaitingRouting88810True() {  			
    	setStatRefId810( srWaitingRouting8881088Value);
   	}
	char[] srWaitingIntDlvry8881088Value = "0640".toCharArray();
	/**
	 *	Test condition "0640" for isSrWaitingIntDlvry88810()
	 *	@return  Returns true if isSrWaitingIntDlvry88810() is "0640"
	 */
   public boolean isSrWaitingIntDlvry88810() throws CFException {
      return (  compareChars( getStatRefId810() , srWaitingIntDlvry8881088Value)  == 0  );
   }


	/**
	*  set values "0640"
	*/
   	public void setSrWaitingIntDlvry88810True() {  			
    	setStatRefId810( srWaitingIntDlvry8881088Value);
   	}
	char[] srFileBeingPulled8881088Value = "0650".toCharArray();
	/**
	 *	Test condition "0650" for isSrFileBeingPulled88810()
	 *	@return  Returns true if isSrFileBeingPulled88810() is "0650"
	 */
   public boolean isSrFileBeingPulled88810() throws CFException {
      return (  compareChars( getStatRefId810() , srFileBeingPulled8881088Value)  == 0  );
   }


	/**
	*  set values "0650"
	*/
   	public void setSrFileBeingPulled88810True() {  			
    	setStatRefId810( srFileBeingPulled8881088Value);
   	}
	char[] srPushingToAppl8881088Value = "0660".toCharArray();
	/**
	 *	Test condition "0660" for isSrPushingToAppl88810()
	 *	@return  Returns true if isSrPushingToAppl88810() is "0660"
	 */
   public boolean isSrPushingToAppl88810() throws CFException {
      return (  compareChars( getStatRefId810() , srPushingToAppl8881088Value)  == 0  );
   }


	/**
	*  set values "0660"
	*/
   	public void setSrPushingToAppl88810True() {  			
    	setStatRefId810( srPushingToAppl8881088Value);
   	}
	char[] srApplPulling8881088Value = "0670".toCharArray();
	/**
	 *	Test condition "0670" for isSrApplPulling88810()
	 *	@return  Returns true if isSrApplPulling88810() is "0670"
	 */
   public boolean isSrApplPulling88810() throws CFException {
      return (  compareChars( getStatRefId810() , srApplPulling8881088Value)  == 0  );
   }


	/**
	*  set values "0670"
	*/
   	public void setSrApplPulling88810True() {  			
    	setStatRefId810( srApplPulling8881088Value);
   	}
	char[] srExitJobActive8881088Value = "0690".toCharArray();
	/**
	 *	Test condition "0690" for isSrExitJobActive88810()
	 *	@return  Returns true if isSrExitJobActive88810() is "0690"
	 */
   public boolean isSrExitJobActive88810() throws CFException {
      return (  compareChars( getStatRefId810() , srExitJobActive8881088Value)  == 0  );
   }


	/**
	*  set values "0690"
	*/
   	public void setSrExitJobActive88810True() {  			
    	setStatRefId810( srExitJobActive8881088Value);
   	}
	char[] srReadyForAppl8881088Value = "0700".toCharArray();
	/**
	 *	Test condition "0700" for isSrReadyForAppl88810()
	 *	@return  Returns true if isSrReadyForAppl88810() is "0700"
	 */
   public boolean isSrReadyForAppl88810() throws CFException {
      return (  compareChars( getStatRefId810() , srReadyForAppl8881088Value)  == 0  );
   }


	/**
	*  set values "0700"
	*/
   	public void setSrReadyForAppl88810True() {  			
    	setStatRefId810( srReadyForAppl8881088Value);
   	}
	char[] srXferTerminated8881088Value = "0710".toCharArray();
	/**
	 *	Test condition "0710" for isSrXferTerminated88810()
	 *	@return  Returns true if isSrXferTerminated88810() is "0710"
	 */
   public boolean isSrXferTerminated88810() throws CFException {
      return (  compareChars( getStatRefId810() , srXferTerminated8881088Value)  == 0  );
   }


	/**
	*  set values "0710"
	*/
   	public void setSrXferTerminated88810True() {  			
    	setStatRefId810( srXferTerminated8881088Value);
   	}
	char[] srValidating8881088Value = "0720".toCharArray();
	/**
	 *	Test condition "0720" for isSrValidating88810()
	 *	@return  Returns true if isSrValidating88810() is "0720"
	 */
   public boolean isSrValidating88810() throws CFException {
      return (  compareChars( getStatRefId810() , srValidating8881088Value)  == 0  );
   }


	/**
	*  set values "0720"
	*/
   	public void setSrValidating88810True() {  			
    	setStatRefId810( srValidating8881088Value);
   	}
	char[] srFileCreated8881088Value = "0730".toCharArray();
	/**
	 *	Test condition "0730" for isSrFileCreated88810()
	 *	@return  Returns true if isSrFileCreated88810() is "0730"
	 */
   public boolean isSrFileCreated88810() throws CFException {
      return (  compareChars( getStatRefId810() , srFileCreated8881088Value)  == 0  );
   }


	/**
	*  set values "0730"
	*/
   	public void setSrFileCreated88810True() {  			
    	setStatRefId810( srFileCreated8881088Value);
   	}
	char[] srPostXferError8881088Value = "0740".toCharArray();
	/**
	 *	Test condition "0740" for isSrPostXferError88810()
	 *	@return  Returns true if isSrPostXferError88810() is "0740"
	 */
   public boolean isSrPostXferError88810() throws CFException {
      return (  compareChars( getStatRefId810() , srPostXferError8881088Value)  == 0  );
   }


	/**
	*  set values "0740"
	*/
   	public void setSrPostXferError88810True() {  			
    	setStatRefId810( srPostXferError8881088Value);
   	}
	char[] srTerminatedByOps8881088Value = "0750".toCharArray();
	/**
	 *	Test condition "0750" for isSrTerminatedByOps88810()
	 *	@return  Returns true if isSrTerminatedByOps88810() is "0750"
	 */
   public boolean isSrTerminatedByOps88810() throws CFException {
      return (  compareChars( getStatRefId810() , srTerminatedByOps8881088Value)  == 0  );
   }


	/**
	*  set values "0750"
	*/
   	public void setSrTerminatedByOps88810True() {  			
    	setStatRefId810( srTerminatedByOps8881088Value);
   	}
	char[] srResetByAr038881088Value = "0760".toCharArray();
	/**
	 *	Test condition "0760" for isSrResetByAr0388810()
	 *	@return  Returns true if isSrResetByAr0388810() is "0760"
	 */
   public boolean isSrResetByAr0388810() throws CFException {
      return (  compareChars( getStatRefId810() , srResetByAr038881088Value)  == 0  );
   }


	/**
	*  set values "0760"
	*/
   	public void setSrResetByAr0388810True() {  			
    	setStatRefId810( srResetByAr038881088Value);
   	}
	char[] srXferSuccessful8881088Value = "0800".toCharArray();
	/**
	 *	Test condition "0800" for isSrXferSuccessful88810()
	 *	@return  Returns true if isSrXferSuccessful88810() is "0800"
	 */
   public boolean isSrXferSuccessful88810() throws CFException {
      return (  compareChars( getStatRefId810() , srXferSuccessful8881088Value)  == 0  );
   }


	/**
	*  set values "0800"
	*/
   	public void setSrXferSuccessful88810True() {  			
    	setStatRefId810( srXferSuccessful8881088Value);
   	}
	char[] srCompletedByOps8881088Value = "0810".toCharArray();
	/**
	 *	Test condition "0810" for isSrCompletedByOps88810()
	 *	@return  Returns true if isSrCompletedByOps88810() is "0810"
	 */
   public boolean isSrCompletedByOps88810() throws CFException {
      return (  compareChars( getStatRefId810() , srCompletedByOps8881088Value)  == 0  );
   }


	/**
	*  set values "0810"
	*/
   	public void setSrCompletedByOps88810True() {  			
    	setStatRefId810( srCompletedByOps8881088Value);
   	}
	char[] srRetrievedByApp8881088Value = "0820".toCharArray();
	/**
	 *	Test condition "0820" for isSrRetrievedByApp88810()
	 *	@return  Returns true if isSrRetrievedByApp88810() is "0820"
	 */
   public boolean isSrRetrievedByApp88810() throws CFException {
      return (  compareChars( getStatRefId810() , srRetrievedByApp8881088Value)  == 0  );
   }


	/**
	*  set values "0820"
	*/
   	public void setSrRetrievedByApp88810True() {  			
    	setStatRefId810( srRetrievedByApp8881088Value);
   	}
	char[] srExitCompleted8881088Value = "0830".toCharArray();
	/**
	 *	Test condition "0830" for isSrExitCompleted88810()
	 *	@return  Returns true if isSrExitCompleted88810() is "0830"
	 */
   public boolean isSrExitCompleted88810() throws CFException {
      return (  compareChars( getStatRefId810() , srExitCompleted8881088Value)  == 0  );
   }


	/**
	*  set values "0830"
	*/
   	public void setSrExitCompleted88810True() {  			
    	setStatRefId810( srExitCompleted8881088Value);
   	}
	char[] srEmptyFile8881088Value = "0840".toCharArray();
	/**
	 *	Test condition "0840" for isSrEmptyFile88810()
	 *	@return  Returns true if isSrEmptyFile88810() is "0840"
	 */
   public boolean isSrEmptyFile88810() throws CFException {
      return (  compareChars( getStatRefId810() , srEmptyFile8881088Value)  == 0  );
   }


	/**
	*  set values "0840"
	*/
   	public void setSrEmptyFile88810True() {  			
    	setStatRefId810( srEmptyFile8881088Value);
   	}
	char[] srCompltdByJob8881088Value = "0850".toCharArray();
	/**
	 *	Test condition "0850" for isSrCompltdByJob88810()
	 *	@return  Returns true if isSrCompltdByJob88810() is "0850"
	 */
   public boolean isSrCompltdByJob88810() throws CFException {
      return (  compareChars( getStatRefId810() , srCompltdByJob8881088Value)  == 0  );
   }


	/**
	*  set values "0850"
	*/
   	public void setSrCompltdByJob88810True() {  			
    	setStatRefId810( srCompltdByJob8881088Value);
   	}
	char[] srCompltdByTape8881088Value = "0860".toCharArray();
	/**
	 *	Test condition "0860" for isSrCompltdByTape88810()
	 *	@return  Returns true if isSrCompltdByTape88810() is "0860"
	 */
   public boolean isSrCompltdByTape88810() throws CFException {
      return (  compareChars( getStatRefId810() , srCompltdByTape8881088Value)  == 0  );
   }


	/**
	*  set values "0860"
	*/
   	public void setSrCompltdByTape88810True() {  			
    	setStatRefId810( srCompltdByTape8881088Value);
   	}
	char[] srBypassedByExit8881088Value = "0870".toCharArray();
	/**
	 *	Test condition "0870" for isSrBypassedByExit88810()
	 *	@return  Returns true if isSrBypassedByExit88810() is "0870"
	 */
   public boolean isSrBypassedByExit88810() throws CFException {
      return (  compareChars( getStatRefId810() , srBypassedByExit8881088Value)  == 0  );
   }


	/**
	*  set values "0870"
	*/
   	public void setSrBypassedByExit88810True() {  			
    	setStatRefId810( srBypassedByExit8881088Value);
   	}
	char[] srGftComplete8881088Value = "0900".toCharArray();
	/**
	 *	Test condition "0900" for isSrGftComplete88810()
	 *	@return  Returns true if isSrGftComplete88810() is "0900"
	 */
   public boolean isSrGftComplete88810() throws CFException {
      return (  compareChars( getStatRefId810() , srGftComplete8881088Value)  == 0  );
   }


	/**
	*  set values "0900"
	*/
   	public void setSrGftComplete88810True() {  			
    	setStatRefId810( srGftComplete8881088Value);
   	}
	char[] srFileMigrated8881088Value = "0910".toCharArray();
	/**
	 *	Test condition "0910" for isSrFileMigrated88810()
	 *	@return  Returns true if isSrFileMigrated88810() is "0910"
	 */
   public boolean isSrFileMigrated88810() throws CFException {
      return (  compareChars( getStatRefId810() , srFileMigrated8881088Value)  == 0  );
   }


	/**
	*  set values "0910"
	*/
   	public void setSrFileMigrated88810True() {  			
    	setStatRefId810( srFileMigrated8881088Value);
   	}
	char[] srFileDeleted8881088Value = "0920".toCharArray();
	/**
	 *	Test condition "0920" for isSrFileDeleted88810()
	 *	@return  Returns true if isSrFileDeleted88810() is "0920"
	 */
   public boolean isSrFileDeleted88810() throws CFException {
      return (  compareChars( getStatRefId810() , srFileDeleted8881088Value)  == 0  );
   }


	/**
	*  set values "0920"
	*/
   	public void setSrFileDeleted88810True() {  			
    	setStatRefId810( srFileDeleted8881088Value);
   	}
	char[] srDoNotDeliver8881088Value = "0930".toCharArray();
	/**
	 *	Test condition "0930" for isSrDoNotDeliver88810()
	 *	@return  Returns true if isSrDoNotDeliver88810() is "0930"
	 */
   public boolean isSrDoNotDeliver88810() throws CFException {
      return (  compareChars( getStatRefId810() , srDoNotDeliver8881088Value)  == 0  );
   }


	/**
	*  set values "0930"
	*/
   	public void setSrDoNotDeliver88810True() {  			
    	setStatRefId810( srDoNotDeliver8881088Value);
   	}
	/**
	 *	Returns the value of errorResponse900
	 *	@return errorResponse900
	 */
   public char[] getErrorResponse900() throws CFException{
   		return errorResponse900;
   }

  
	/**
	*  set variable errorResponse900
	*  Corresponding COBOL Variable is 900-ERROR-RESPONSE
	*  @param value
	**/
   public void setErrorResponse900(char[] value) {
       value = checkErrorResponse900Constraints(value);
       arraycopy(value,0,errorResponse900,0,value.length);
   } 
	public void setErrorResponse900(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errorResponse900,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errorMessage900
	 *	@return errorMessage900
	 */
   public char[] getErrorMessage900() throws CFException{
   		return errorMessage900;
   }

  
	/**
	*  set variable errorMessage900
	*  Corresponding COBOL Variable is 900-ERROR-MESSAGE
	*  @param value
	**/
   public void setErrorMessage900(char[] value) {
       value = checkErrorMessage900Constraints(value);
       arraycopy(value,0,errorMessage900,0,value.length);
   } 
	public void setErrorMessage900(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errorMessage900,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of mcinfoProgramId
	 *	@return mcinfoProgramId
	 */
   public char[] getMcinfoProgramId() throws CFException{
   		return mcinfoProgramId;
   }

  
	/**
	*  set variable mcinfoProgramId
	*  Corresponding COBOL Variable is MCINFO-PROGRAM-ID
	*  @param value
	**/
   public void setMcinfoProgramId(char[] value) {
       value = checkMcinfoProgramIdConstraints(value);
       arraycopy(value,0,mcinfoProgramId,0,value.length);
   } 
	public void setMcinfoProgramId(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mcinfoProgramId,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of mcinfoReturnCode
	 *	@return mcinfoReturnCode
	 */
	public short getMcinfoReturnCode() throws CFException {
   		return mcinfoReturnCode;
	}
	
	/**
	 * 	Update McinfoReturnCode with the passed value
	 *  Corresponding COBOL Variable is MCINFO-RETURN-CODE
	 *	@param number
	 */
	public void setMcinfoReturnCode(short number) {
	     // Truncate if the number is beyond +/- Max range
	    mcinfoReturnCode = checkMcinfoReturnCodeMaxLimit(number); 
	}

	public void setMcinfoReturnCode(int number) {
	    number = checkMcinfoReturnCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMcinfoReturnCode((short)number);
	}
	public void setMcinfoReturnCode(long number) {
	    number = checkMcinfoReturnCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMcinfoReturnCode((short)number);
	}
	

	
	/**
	 *	Test condition 0 for isMcinfoValidReturn88()
	 *	@return  Returns true if isMcinfoValidReturn88() is 0
	 */
   public boolean isMcinfoValidReturn88() throws CFException {
      return (  getMcinfoReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setMcinfoValidReturn88True() {  			
    	setMcinfoReturnCode( (short)0);
   	}
	
	/**
	 *	Test condition 4 for isMcinfoLastDdnReturned88()
	 *	@return  Returns true if isMcinfoLastDdnReturned88() is 4
	 */
   public boolean isMcinfoLastDdnReturned88() throws CFException {
      return (  getMcinfoReturnCode()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setMcinfoLastDdnReturned88True() {  			
    	setMcinfoReturnCode( (short)4);
   	}
	
	/**
	 *	Test condition 8 for isMcinfoCopybookError88()
	 *	@return  Returns true if isMcinfoCopybookError88() is 8
	 */
   public boolean isMcinfoCopybookError88() throws CFException {
      return (  getMcinfoReturnCode()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setMcinfoCopybookError88True() {  			
    	setMcinfoReturnCode( (short)8);
   	}
	/**
	 *	Returns the value of db85102cDb2CafLoadDsnali
	 *	@return db85102cDb2CafLoadDsnali
	 */
   public char[] getDb85102cDb2CafLoadDsnali() throws CFException{
   		return db85102cDb2CafLoadDsnali;
   }

  
	/**
	*  set variable db85102cDb2CafLoadDsnali
	*  Corresponding COBOL Variable is DB85102C-DB2-CAF-LOAD-DSNALI
	*  @param value
	**/
   public void setDb85102cDb2CafLoadDsnali(char[] value) {
       value = checkDb85102cDb2CafLoadDsnaliConstraints(value);
       arraycopy(value,0,db85102cDb2CafLoadDsnali,0,value.length);
   } 
	public void setDb85102cDb2CafLoadDsnali(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,db85102cDb2CafLoadDsnali,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of db85102cDb2BatchErrorRtn
	 *	@return db85102cDb2BatchErrorRtn
	 */
   public char[] getDb85102cDb2BatchErrorRtn() throws CFException{
   		return db85102cDb2BatchErrorRtn;
   }

  
	/**
	*  set variable db85102cDb2BatchErrorRtn
	*  Corresponding COBOL Variable is DB85102C-DB2-BATCH-ERROR-RTN
	*  @param value
	**/
   public void setDb85102cDb2BatchErrorRtn(char[] value) {
       value = checkDb85102cDb2BatchErrorRtnConstraints(value);
       arraycopy(value,0,db85102cDb2BatchErrorRtn,0,value.length);
   } 
	public void setDb85102cDb2BatchErrorRtn(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,db85102cDb2BatchErrorRtn,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sqlTemp
	 *	@return sqlTemp
	 */
   public char[] getSqlTemp() throws CFException{
   		return sqlTemp;
   }

  
	/**
	*  set variable sqlTemp
	*  Corresponding COBOL Variable is SQL-TEMP
	*  @param value
	**/
   public void setSqlTemp(char[] value) {
       value = checkSqlTempConstraints(value);
       arraycopy(value,0,sqlTemp,0,value.length);
   } 
	public void setSqlTemp(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sqlTemp,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
