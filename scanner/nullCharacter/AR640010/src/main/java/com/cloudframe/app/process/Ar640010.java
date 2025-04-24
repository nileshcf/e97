package com.cloudframe.app.process;

import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTaraefpSelectInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupResetInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RejectAllocTypeOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTarafxsInsertInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetTarafxsErrorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyDcbVarInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupUpdateTargetInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayAppEndptTaraeptInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTarafxsUpdateInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ComputeJulianDayInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyAllocTypeOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SelectCountTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CloseControlInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.IssueWarningInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InitializeConnectivityInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DeleteCloseOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyResetFileOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyBroadcastSyslstInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InstallBroadcastInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportCompletionInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyAllocTypeInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupPostExitTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CaptureResultOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrInstInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupUpdateTargetOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.UpdateRetrieveInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RetrieveSpecificFileInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupFunctionInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SelectAppEndptIdInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyAddApplFileOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportAr649ErrorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupTypeDsPsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportAllocateErrorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.AssignStatCdOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.FetchInstallTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CloseFileOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupCompleteDsnOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyListBroadcastOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrSendInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetFunctionTimestampInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.IssueWarningOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReturnResponseOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckListConfictsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ExecuteAddApplFileInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.LocateOutboundTaraefpInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyApplicationDsnOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrRetrApplInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CloseInstallCursorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportListddErrorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InitializeConnectivityOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ConnectGftDatabaseInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.GetStatusDescriptionInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RejectSendTaraeptInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyListDdDcbOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.GetTaraeptInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ExecuteCountFilesInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InitializeColumnsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.PostAddTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReadSourceRecordInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.FetchInstallTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.WriteFileInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.BuildFtssFileNameInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupListTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetSignificantNumericOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupInstallBroadcastInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportAr647ErrorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupControlDcbInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReadListOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyControlInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenRetrieveCursorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTaraeptNotfndInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportParmErrorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCtrlConfictsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SelectTaraefpInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReadFileOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckApplConfictsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckFtssFileDisplayInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReadFileInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrBulkGftOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyCountsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.PostBulkTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CloseInstallCursorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReadListInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InstallEndpointInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.GetAddTaraefpOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.AssignConfigValuesOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTarafxsCloseInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyRetrieveFileInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SendOmnibusAlertInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DeleteFileInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetTarafxsErrorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrRetrInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifySendFileInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportSqlErrorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ParseValidateOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CloseListOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupGftTargetStampInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyListBroadcastDdInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SelectPreExitTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupCompleteDsnInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrAddGftOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReadControlOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InitializeAccumulatorsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RejectListTaraeptOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.WriteResultRecordOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReturnCopybookVers010OutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.WriteFileOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyInstallExitInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrListInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupTargetPerSourceOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.AssignConfigValuesInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyBroadcastSyslstOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupTargetPerProfileOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupValidRowInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyDcbFixInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrInstApplInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupBroadcastGftTrgtOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupInstallGftTrgtInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.UnallocateFileOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CloseResultSyslstInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.FetchResetRowOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrListGftOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SelectPreExitTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupStandardGftTrgtOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrBulkGftInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenResultSysnnnOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InitializeAllocationOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTaraeptBackupInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RejectListTaraefpInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SelectSpecificTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RejectSendTaraefpOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyDeleteIndOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ParseValidateInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DefaultApplDsnOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupSeqioParmsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.BuildResultRecordInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportAr649ErrorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyBroadcastResultOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTarafxsSelectInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyCopybookInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CreateCopyInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayFileInfoInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InstallEndpointOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReadControlInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetCurrentTimestampOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyEndptIdInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTarafxaNotfndInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CallAr649010OutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SelectSpecificTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckFileTypeInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InquireFileInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportSetupProblemInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupTypeSysoutOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SelectTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReturnCopybookVers040OutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.AllocateSourceOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DeleteFileOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ExtractTaraxtkInfoInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.UpdatePreExitTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SelectTaraeptInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InitializeProcessingInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupProblemRowInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InitializeColumnsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SelectTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyFileStatsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CloseFileInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RetrieveProcDateInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetGftDbpkgOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckFileTypeOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyBroadcastSysnnnOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SelectTarafxsRowOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CommitDatabaseOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenResetCursorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupTargetPerSourceInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckSqlRetryInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyCountsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrBulkApplOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportSeqioErrorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.GetStatusDescriptionOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportAr642ErrorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.UpdateTarafxsRowOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RejectSendTaraefpInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupAddTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.PostSendTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportCopyCountsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTaraefpBackupInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupApplicationExitOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupTypeSysrdrOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplaySeqioParmsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RestoreUserConnectionInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InsertPostExitTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenResultSyslstInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupInsertSourceOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.GetRetrieveTaraeptOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupDcbValuesOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportResultErrorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DefaultConfigValuesInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CallAr630010OutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyInstallExitOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyResetAcceptableOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReloadTarafxaRowInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InsertPostExitTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.LookupBackupEndpointOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrAddApplOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifySourceDdNameInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.AllocateTargetOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ExtractTaraxtkInfoOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifySourceSupplyDdnInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InitializeResponseOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.UpdateTarafxsRowInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CallAr648010OutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReleaseGftConnectionInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CommitActivityInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrRetrGftInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyBulkBroadcastInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.QueueInboundReadyMsgInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReadSourceRecordOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCtrlConfictsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetFunctionTimestampOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CloseRetrieveCursorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InsertTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenResultInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.UpdatePreExitTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.AllocateApplAsTargetOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RejectListTaraefpOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportControlParmErrorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenResetCursorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyProcdateInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportAr642ErrorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.AllocateTargetInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTaraefpFetchInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ExecuteCountFilesOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckTargetSpaceUnitOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetCurrentTimestampInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportControlParmErrorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportSeqioErrorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrAddInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckApplConfictsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ExecuteBulkBroadcastOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ExecuteResetFileOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReturnCopybookVers050OutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupNewTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupTypeDsPoInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.UnallocateFileInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupBroadcastGftTrgtInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CloseResetCursorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyCyclNumInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CloseResetCursorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InstallAllEndpointsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CallMcinfoInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyPreExitStatusInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupPostExitTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ValidateXtkFieldInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.EndAllocationOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.AssignStatCdInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportApplParmErrorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RetrieveProcDateOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.QueueInboundReadyMsgOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CloseResultSysnnnOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ExecuteListBroadcastInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.PostListedEndpointsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckFtssRepeatOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetTarafxsRetrieveStatInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ExecuteSendFileInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyCyclNumOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.GetSendTaraefpOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ExecuteBulkBroadcastInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyBulkIdOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupTargetAllocStatsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupTypeSysrdrInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportCopyErrorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SearchTaraefpInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupPostExitDsnOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RejectBulkTaraefpInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupNewFileSpecsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CloseListInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.PostListedEndpointsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTarafxsNotfndInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupDcbValuesInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTarafxaOpenInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.LocateOutboundTaraeptOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupBulkTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyDcbOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RouteTargetInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.StoreUserDbpkgInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.LogFtssRepeatedOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportGftParmErrorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CompleteGftTargetDsnInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyListBroadcastDdOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetUserPackagesetOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupTargetAllocStatsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.PostSendTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CallMcinfoOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SelectTarafplOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupListTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyCountFilesOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ComputeJulianDayOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.LocateOutboundTaraefpOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyBulkBroadcastOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrInstGftInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupInstallStandardInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenBulkCursorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.WriteLogMessageInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DefaultConfigValuesOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupInsertSourceInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CallDynamOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckSqlRetryOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupAddTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RejectBulkTaraeptInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTarastsSelectOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportErrorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReturnCopybookVers010InCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RouteFilesInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyBroadcastResultInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifySourceDemandDdnOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupFunctionOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupTypeDsPsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportAr648ErrorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RetrieveEligibleFileOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.AllocateFileOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTarafxaCloseInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.AllocateSourceInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RejectBulkTaraeptOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyBulkIdInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetTarafxsRetrieveStatOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifySourceDemandDdnInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.AllocateApplAsTargetInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyCopybookOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ExecuteListBroadcastOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.IdentifyRequestOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenFileInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DeleteOpenOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupXferFileSzNumOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CallSeqioOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CopySourceToTargetOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupGftTargetStampOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupProblemRowOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.FetchResetRowInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.BuildStartMessagesOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CloseControlOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupSpecNamesInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ExecuteFunctionOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrAddApplInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SelectAppEndptIdOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenControlOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.FinishFunctionOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SendOmnibusAlertOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InitializeDbWorkOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.PostListTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.AllocateGftAsSourceOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CallAr649010InCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.FetchBulkTaraefpOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenRetrieveCursorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InquireFileOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyListBroadcastInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.AllocateGftAsTargetInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DetermineTargetAllocOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportSetupProblemOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupBulkTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ExecuteFunctionInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InitializeWorkAreasOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InitializeSwitchesOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CopySourceToTargetInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.IdentifyRequestInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyJclDdNameOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CloseBulkCursorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportAllocateErrorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReturnCopybookVers020OutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.StoreUserDbidOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTarafplNotfndInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTarafxsCountInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.FinishFunctionInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupSeqioParmsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CallDynamInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyProcdateOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrSendApplInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetGftDbpkgInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RetrieveSpecificFileOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenFilesOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupInstallBroadcastOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.FetchEligibleTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrBulkApplInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.EndAllocationInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupSysdsnInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SearchTaraefpOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.UpdateRetrieveOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckFtssRepeatInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InitializeControlInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportLreclErrorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupReasonMsgOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CloseResultInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetTarafxsCompleteInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyResetAcceptableInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupTypeSysoutInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RouteSourceInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupTargetPerProfileInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReturnCopybookVers080InCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.LocateBackupProfilesInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RouteSourceOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportAr647ErrorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.PullCurrentDateTimeOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CallAr642010OutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.BuildResultRecordOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrAddGftInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportLreclErrorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RejectSendTaraeptOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.AllocateApplAsSourceInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InitializeTableIndexesOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrRetrApplOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenFileOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CloseBulkCursorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckGftDsnAvailOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RenameSourceToTargetInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.PostBulkEndpointsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportErrorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.GetResetTaraefpInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTarafxsOpenInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ExecuteRetrieveFileInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ExecuteResetFileInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrBulkInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportGftParmErrorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportConnectErrorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenResultSyslstOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.WriteResultRecordInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrSendGftOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RouteTargetOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ValidateXtkFieldOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ParseXtkValuesOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTaraefpNotfndInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupInstallStandardOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RetrieveEligibleFileInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InitializeWorkAreasInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReleaseGftConnectionOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyDeleteIndInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.AllocateGftAsTargetOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ConnectGftDatabaseOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenBulkCursorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTarafxaFetchInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.GetAddTaraefpInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckConflictsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrInstApplOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrListGftInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenListOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupValidRowOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RejectBulkTaraefpOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ConnectUserDatabaseOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrSendApplOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrListApplInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyCountFilesInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ResetTarafxsRowOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReloadTarafxaRowOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifySendFileOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTarafxsNostatInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.LocateOutboundTaraeptInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportAr648ErrorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetSignificantNumericInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTarafplSelectInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CaptureResultInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RenameSourceToTargetOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RollbackActivityInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyProfileOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CloseRetrieveCursorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportSqlErrorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportConnectErrorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTarafxsFetchInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CallAr642010InCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.LogFtssRepeatedInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyRetrieveFileOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupStandardGftTrgtInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.WriteTargetRecordInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReturnCopybookVers040InCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifySourceSupplyDdnOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.LookupBackupEndpointInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.StoreUserDbidInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupSpecNamesOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CallSeqioInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckTargetSpaceUnitInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.GetResetTaraefpOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyCopyCountsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupPreExitTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.FetchBulkTaraefpInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.BuildFtssFileNameOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyApplicationDsnInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.PostListTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyDcbUndInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ConnectUserDatabaseInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CallAr630010InCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetTarafxsCompleteOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyEndptIdOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyOmnibusAlertOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupSysdsnOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.FetchEligibleTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportCopyCountsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrListApplOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InstallAllEndpointsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportCopybookErrorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupNewFileSpecsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenListInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyProfileInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.GetSendTaraefpInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyOmnibusAlertInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupControlDcbOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrInstGftOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckListConfictsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RollbackActivityOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DeleteCloseInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.GetTaraeptOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InstallBroadcastOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InsertTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InitializeResponseInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupMipIdsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenInstallCursorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportListddErrorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.AllocateGftAsSourceInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyBroadcastSysnnnInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportResultErrorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DetermineTargetAllocInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayFileInfoOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.WriteTargetRecordOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SelectTarafplInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupNewTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CommitActivityOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyPreExitStatusOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayStartMessagesInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupTypeDsPoOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.StoreUserDbpkgOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTarastsSelectInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReturnCopybookVers080OutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RejectListTaraeptInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrSendGftInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckGftDsnAvailInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InitializeProcessingOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyJclDdNameInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTarafxsSelect9429InCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupInstallGftTrgtOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyListDdDcbInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupXferFileSzNumInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RejectAllocTypeInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ResetTarafxsRowInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.BuildStartMessagesInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenInstallCursorInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTaraeptSelectInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportTarafxsExiterrInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReturnCopybookVers050InCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyDcbInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SelectTaraefpOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupMipIdsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckCopyErrRetrGftOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTaraefpOpenInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CallAr648010InCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.InitializeAllocationInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplaySeqioParmsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupPreExitTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SelectTarafxsRowInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DefaultApplDsnInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupApplicationExitInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenControlInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.AllocateApplAsSourceOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenFilesInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.UpdateTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DisplayTaraefpCloseInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyDcbUndOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ExecuteInstallExitInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReturnCopybookVers020InCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SelectCountTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupPostExitDsnInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CloseResultSyslstOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupReasonMsgInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.PostBulkEndpointsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CompleteGftTargetDsnOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyResetFileInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportApplParmErrorOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.PostBulkTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckGftConfictsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.DeleteOpenInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CheckGftConfictsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SelectTaraeptOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.PostAddTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyControlOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.VerifyAddApplFileInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReturnResponseInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.WriteLogMessageOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.RestoreUserConnectionOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.OpenResultSysnnnInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupSendTarafxsInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CreateCopyOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.CloseResultSysnnnInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.GetRetrieveTaraeptInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetUserPackagesetInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.UpdateTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.SetupSendTarafxsOutCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.AllocateDataFilesInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.ar640010.Ar640010Ctx.ParseXtkValuesInCtx;
import com.cloudframe.app.ar640010.Ar640010Ctx.ReportCompletionOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Ar640010 {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Ar640010Ctx programCtx, String parm, String parm2, String parm3, String parm4) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Ar640010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(Ar640010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INITIALIZE-PROCESSING
     *
     * @return 
     */
    public InitializeProcessingOutCtx initializeProcessing(InitializeProcessingInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1100-INITIALIZE-PROGRAM
     *
     */
    public void initializeProgram(Ar640010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1120-BUILD-START-MESSAGES
     *
     * @return 
     */
    public BuildStartMessagesOutCtx buildStartMessages(BuildStartMessagesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1130-DISPLAY-START-MESSAGES
     *
     */
    public void displayStartMessages(DisplayStartMessagesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1140-INITIALIZE-TABLE-INDEXES
     *
     * @return 
     */
    public InitializeTableIndexesOutCtx initializeTableIndexes(Ar640010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1200-INITIALIZE-REQUEST
     *
     */
    public void initializeRequest(Ar640010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1210-INITIALIZE-SWITCHES
     *
     * @return 
     */
    public InitializeSwitchesOutCtx initializeSwitches(Ar640010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1220-INITIALIZE-DB-WORK
     *
     * @return 
     */
    public InitializeDbWorkOutCtx initializeDbWork(Ar640010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1230-INITIALIZE-ACCUMULATORS
     *
     * @return 
     */
    public InitializeAccumulatorsOutCtx initializeAccumulators(Ar640010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1240-INITIALIZE-WORK-AREAS
     *
     * @return 
     */
    public InitializeWorkAreasOutCtx initializeWorkAreas(InitializeWorkAreasInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1250-INITIALIZE-RESPONSE
     *
     * @return 
     */
    public InitializeResponseOutCtx initializeResponse(InitializeResponseInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1260-IDENTIFY-REQUEST
     *
     * @return 
     */
    public IdentifyRequestOutCtx identifyRequest(IdentifyRequestInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1300-INITIALIZE-CONTROL
     *
     */
    public void initializeControl(InitializeControlInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1310-SETUP-CONTROL-DCB
     *
     * @return 
     */
    public SetupControlDcbOutCtx setupControlDcb(SetupControlDcbInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1320-OPEN-CONTROL
     *
     * @return 
     */
    public OpenControlOutCtx openControl(OpenControlInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1330-READ-CONTROL
     *
     * @return 
     */
    public ReadControlOutCtx readControl(ReadControlInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1331-VERIFY-CONTROL
     *
     * @return 
     */
    public VerifyControlOutCtx verifyControl(VerifyControlInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1340-CLOSE-CONTROL
     *
     * @return 
     */
    public CloseControlOutCtx closeControl(CloseControlInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1400-INITIALIZE-CONNECTIVITY
     *
     * @return 
     */
    public InitializeConnectivityOutCtx initializeConnectivity(InitializeConnectivityInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1410-STORE-USER-DBID
     *
     * @return 
     */
    public StoreUserDbidOutCtx storeUserDbid(StoreUserDbidInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1420-STORE-USER-DBPKG
     *
     * @return 
     */
    public StoreUserDbpkgOutCtx storeUserDbpkg(StoreUserDbpkgInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1430-SET-GFT-DBPKG
     *
     * @return 
     */
    public SetGftDbpkgOutCtx setGftDbpkg(SetGftDbpkgInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1440-CONNECT-GFT-DATABASE
     *
     * @return 
     */
    public ConnectGftDatabaseOutCtx connectGftDatabase(ConnectGftDatabaseInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1500-INITIALIZE-ALLOCATION
     *
     * @return 
     */
    public InitializeAllocationOutCtx initializeAllocation(InitializeAllocationInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1600-EXTRACT-TARAXTK-INFO
     *
     * @return 
     */
    public ExtractTaraxtkInfoOutCtx extractTaraxtkInfo(ExtractTaraxtkInfoInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1700-DEFAULT-CONFIG-VALUES
     *
     * @return 
     */
    public DefaultConfigValuesOutCtx defaultConfigValues(DefaultConfigValuesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1800-VALIDATE-XTK-FIELD
     *
     * @return 
     */
    public ValidateXtkFieldOutCtx validateXtkField(ValidateXtkFieldInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1810-PARSE-XTK-VALUES
     *
     * @return 
     */
    public ParseXtkValuesOutCtx parseXtkValues(ParseXtkValuesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1820-PARSE-VALIDATE
     *
     * @return 
     */
    public ParseValidateOutCtx parseValidate(ParseValidateInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1830-ASSIGN-CONFIG-VALUES
     *
     * @return 
     */
    public AssignConfigValuesOutCtx assignConfigValues(AssignConfigValuesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-SETUP-FUNCTION
     *
     * @return 
     */
    public SetupFunctionOutCtx setupFunction(SetupFunctionInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-VERIFY-ADD-APPL-FILE
     *
     * @return 
     */
    public VerifyAddApplFileOutCtx verifyAddApplFile(VerifyAddApplFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2110-GET-ADD-TARAEFP
     *
     * @return 
     */
    public GetAddTaraefpOutCtx getAddTaraefp(GetAddTaraefpInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2200-VERIFY-BULK-BROADCAST
     *
     * @return 
     */
    public VerifyBulkBroadcastOutCtx verifyBulkBroadcast(VerifyBulkBroadcastInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2300-VERIFY-COUNT-FILES
     *
     * @return 
     */
    public VerifyCountFilesOutCtx verifyCountFiles(VerifyCountFilesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2400-VERIFY-LIST-BROADCAST
     *
     * @return 
     */
    public VerifyListBroadcastOutCtx verifyListBroadcast(VerifyListBroadcastInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2410-VERIFY-LIST-BROADCAST-DD
     *
     * @return 
     */
    public VerifyListBroadcastDdOutCtx verifyListBroadcastDd(VerifyListBroadcastDdInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2411-VERIFY-LIST-DD-DCB
     *
     * @return 
     */
    public VerifyListDdDcbOutCtx verifyListDdDcb(VerifyListDdDcbInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2500-VERIFY-RETRIEVE-FILE
     *
     * @return 
     */
    public VerifyRetrieveFileOutCtx verifyRetrieveFile(VerifyRetrieveFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2510-RETRIEVE-ELIGIBLE-FILE
     *
     * @return 
     */
    public RetrieveEligibleFileOutCtx retrieveEligibleFile(RetrieveEligibleFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2511-OPEN-RETRIEVE-CURSOR
     *
     * @return 
     */
    public OpenRetrieveCursorOutCtx openRetrieveCursor(OpenRetrieveCursorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2512-FETCH-ELIGIBLE-TARAFXS
     *
     * @return 
     */
    public FetchEligibleTarafxsOutCtx fetchEligibleTarafxs(FetchEligibleTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2513-CLOSE-RETRIEVE-CURSOR
     *
     * @return 
     */
    public CloseRetrieveCursorOutCtx closeRetrieveCursor(CloseRetrieveCursorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2514-GET-RETRIEVE-TARAEPT
     *
     * @return 
     */
    public GetRetrieveTaraeptOutCtx getRetrieveTaraept(GetRetrieveTaraeptInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2520-RETRIEVE-SPECIFIC-FILE
     *
     * @return 
     */
    public RetrieveSpecificFileOutCtx retrieveSpecificFile(RetrieveSpecificFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2521-SELECT-SPECIFIC-TARAFXS
     *
     * @return 
     */
    public SelectSpecificTarafxsOutCtx selectSpecificTarafxs(SelectSpecificTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2522-SELECT-TARAFXS
     *
     * @return 
     */
    public SelectTarafxsOutCtx selectTarafxs(SelectTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2530-RETRIEVE-PROC-DATE
     *
     * @return 
     */
    public RetrieveProcDateOutCtx retrieveProcDate(RetrieveProcDateInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2540-SET-TARAFXS-RETRIEVE-STAT
     *
     * @return 
     */
    public SetTarafxsRetrieveStatOutCtx setTarafxsRetrieveStat(SetTarafxsRetrieveStatInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2541-SETUP-UPDATE-TARGET
     *
     * @return 
     */
    public SetupUpdateTargetOutCtx setupUpdateTarget(SetupUpdateTargetInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2542-UPDATE-RETRIEVE
     *
     * @return 
     */
    public UpdateRetrieveOutCtx updateRetrieve(UpdateRetrieveInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2600-VERIFY-SEND-FILE
     *
     * @return 
     */
    public VerifySendFileOutCtx verifySendFile(VerifySendFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2610-GET-SEND-TARAEFP
     *
     * @return 
     */
    public GetSendTaraefpOutCtx getSendTaraefp(GetSendTaraefpInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2620-LOCATE-BACKUP-PROFILES
     *
     */
    public void locateBackupProfiles(LocateBackupProfilesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2700-VERIFY-RESET-FILE
     *
     * @return 
     */
    public VerifyResetFileOutCtx verifyResetFile(VerifyResetFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2800-VERIFY-INSTALL-EXIT
     *
     * @return 
     */
    public VerifyInstallExitOutCtx verifyInstallExit(VerifyInstallExitInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2810-VERIFY-PRE-EXIT-STATUS
     *
     * @return 
     */
    public VerifyPreExitStatusOutCtx verifyPreExitStatus(VerifyPreExitStatusInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2811-SELECT-PRE-EXIT-TARAFXS
     *
     * @return 
     */
    public SelectPreExitTarafxsOutCtx selectPreExitTarafxs(SelectPreExitTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2812-REPORT-TARAFXS-EXITERR
     *
     */
    public void reportTarafxsExiterr(ReportTarafxsExiterrInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2820-SETUP-POST-EXIT-DSN
     *
     * @return 
     */
    public SetupPostExitDsnOutCtx setupPostExitDsn(SetupPostExitDsnInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2821-SETUP-INSTALL-BROADCAST
     *
     * @return 
     */
    public SetupInstallBroadcastOutCtx setupInstallBroadcast(SetupInstallBroadcastInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2822-SETUP-INSTALL-STANDARD
     *
     * @return 
     */
    public SetupInstallStandardOutCtx setupInstallStandard(SetupInstallStandardInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-CHECK-CONFLICTS
     *
     */
    public void checkConflicts(CheckConflictsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3100-CHECK-CTRL-CONFICTS
     *
     * @return 
     */
    public CheckCtrlConfictsOutCtx checkCtrlConficts(CheckCtrlConfictsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3200-CHECK-APPL-CONFICTS
     *
     * @return 
     */
    public CheckApplConfictsOutCtx checkApplConficts(CheckApplConfictsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3300-CHECK-GFT-CONFICTS
     *
     * @return 
     */
    public CheckGftConfictsOutCtx checkGftConficts(CheckGftConfictsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3400-CHECK-LIST-CONFICTS
     *
     * @return 
     */
    public CheckListConfictsOutCtx checkListConficts(CheckListConfictsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4000-EXECUTE-FUNCTION
     *
     * @return 
     */
    public ExecuteFunctionOutCtx executeFunction(ExecuteFunctionInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4100-EXECUTE-ADD-APPL-FILE
     *
     */
    public void executeAddApplFile(ExecuteAddApplFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4110-SETUP-ADD-TARAFXS
     *
     * @return 
     */
    public SetupAddTarafxsOutCtx setupAddTarafxs(SetupAddTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4120-POST-ADD-TARAFXS
     *
     * @return 
     */
    public PostAddTarafxsOutCtx postAddTarafxs(PostAddTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4200-EXECUTE-BULK-BROADCAST
     *
     * @return 
     */
    public ExecuteBulkBroadcastOutCtx executeBulkBroadcast(ExecuteBulkBroadcastInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4210-OPEN-BULK-CURSOR
     *
     * @return 
     */
    public OpenBulkCursorOutCtx openBulkCursor(OpenBulkCursorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4220-POST-BULK-ENDPOINTS
     *
     * @return 
     */
    public PostBulkEndpointsOutCtx postBulkEndpoints(PostBulkEndpointsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4221-SETUP-BULK-TARAFXS
     *
     * @return 
     */
    public SetupBulkTarafxsOutCtx setupBulkTarafxs(SetupBulkTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4222-POST-BULK-TARAFXS
     *
     * @return 
     */
    public PostBulkTarafxsOutCtx postBulkTarafxs(PostBulkTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4230-CLOSE-BULK-CURSOR
     *
     * @return 
     */
    public CloseBulkCursorOutCtx closeBulkCursor(CloseBulkCursorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4300-EXECUTE-COUNT-FILES
     *
     * @return 
     */
    public ExecuteCountFilesOutCtx executeCountFiles(ExecuteCountFilesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4310-SELECT-COUNT-TARAFXS
     *
     * @return 
     */
    public SelectCountTarafxsOutCtx selectCountTarafxs(SelectCountTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4400-EXECUTE-LIST-BROADCAST
     *
     * @return 
     */
    public ExecuteListBroadcastOutCtx executeListBroadcast(ExecuteListBroadcastInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4410-OPEN-LIST
     *
     * @return 
     */
    public OpenListOutCtx openList(OpenListInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4420-POST-LISTED-ENDPOINTS
     *
     * @return 
     */
    public PostListedEndpointsOutCtx postListedEndpoints(PostListedEndpointsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4421-SETUP-LIST-TARAFXS
     *
     * @return 
     */
    public SetupListTarafxsOutCtx setupListTarafxs(SetupListTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4423-POST-LIST-TARAFXS
     *
     * @return 
     */
    public PostListTarafxsOutCtx postListTarafxs(PostListTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4430-CLOSE-LIST
     *
     * @return 
     */
    public CloseListOutCtx closeList(CloseListInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4500-EXECUTE-RETRIEVE-FILE
     *
     */
    public void executeRetrieveFile(ExecuteRetrieveFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4510-SET-TARAFXS-COMPLETE
     *
     * @return 
     */
    public SetTarafxsCompleteOutCtx setTarafxsComplete(SetTarafxsCompleteInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4520-SET-TARAFXS-ERROR
     *
     * @return 
     */
    public SetTarafxsErrorOutCtx setTarafxsError(SetTarafxsErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4600-EXECUTE-SEND-FILE
     *
     */
    public void executeSendFile(ExecuteSendFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4610-SETUP-SEND-TARAFXS
     *
     * @return 
     */
    public SetupSendTarafxsOutCtx setupSendTarafxs(SetupSendTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4620-POST-SEND-TARAFXS
     *
     * @return 
     */
    public PostSendTarafxsOutCtx postSendTarafxs(PostSendTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4700-EXECUTE-RESET-FILE
     *
     * @return 
     */
    public ExecuteResetFileOutCtx executeResetFile(ExecuteResetFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4710-SELECT-TARAFXS-ROW
     *
     * @return 
     */
    public SelectTarafxsRowOutCtx selectTarafxsRow(SelectTarafxsRowInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4720-RESET-TARAFXS-ROW
     *
     * @return 
     */
    public ResetTarafxsRowOutCtx resetTarafxsRow(ResetTarafxsRowInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4721-UPDATE-TARAFXS-ROW
     *
     * @return 
     */
    public UpdateTarafxsRowOutCtx updateTarafxsRow(UpdateTarafxsRowInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4730-OPEN-RESET-CURSOR
     *
     * @return 
     */
    public OpenResetCursorOutCtx openResetCursor(OpenResetCursorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4740-FETCH-RESET-ROW
     *
     * @return 
     */
    public FetchResetRowOutCtx fetchResetRow(FetchResetRowInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4750-CLOSE-RESET-CURSOR
     *
     * @return 
     */
    public CloseResetCursorOutCtx closeResetCursor(CloseResetCursorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4760-RELOAD-TARAFXA-ROW
     *
     * @return 
     */
    public ReloadTarafxaRowOutCtx reloadTarafxaRow(ReloadTarafxaRowInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4800-EXECUTE-INSTALL-EXIT
     *
     */
    public void executeInstallExit(ExecuteInstallExitInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4810-INSTALL-BROADCAST
     *
     * @return 
     */
    public InstallBroadcastOutCtx installBroadcast(InstallBroadcastInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4811-OPEN-INSTALL-CURSOR
     *
     * @return 
     */
    public OpenInstallCursorOutCtx openInstallCursor(OpenInstallCursorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4812-INSTALL-ALL-ENDPOINTS
     *
     * @return 
     */
    public InstallAllEndpointsOutCtx installAllEndpoints(InstallAllEndpointsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4813-FETCH-INSTALL-TARAFXS
     *
     * @return 
     */
    public FetchInstallTarafxsOutCtx fetchInstallTarafxs(FetchInstallTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4814-CLOSE-INSTALL-CURSOR
     *
     * @return 
     */
    public CloseInstallCursorOutCtx closeInstallCursor(CloseInstallCursorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4820-INSTALL-ENDPOINT
     *
     * @return 
     */
    public InstallEndpointOutCtx installEndpoint(InstallEndpointInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4821-SETUP-PRE-EXIT-TARAFXS
     *
     * @return 
     */
    public SetupPreExitTarafxsOutCtx setupPreExitTarafxs(SetupPreExitTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4822-SETUP-POST-EXIT-TARAFXS
     *
     * @return 
     */
    public SetupPostExitTarafxsOutCtx setupPostExitTarafxs(SetupPostExitTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4823-INSERT-POST-EXIT-TARAFXS
     *
     * @return 
     */
    public InsertPostExitTarafxsOutCtx insertPostExitTarafxs(InsertPostExitTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4824-UPDATE-PRE-EXIT-TARAFXS
     *
     * @return 
     */
    public UpdatePreExitTarafxsOutCtx updatePreExitTarafxs(UpdatePreExitTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5000-FINISH-FUNCTION
     *
     * @return 
     */
    public FinishFunctionOutCtx finishFunction(FinishFunctionInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5100-ROUTE-FILES
     *
     */
    public void routeFiles(RouteFilesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5110-ROUTE-SOURCE
     *
     * @return 
     */
    public RouteSourceOutCtx routeSource(RouteSourceInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5120-ROUTE-TARGET
     *
     * @return 
     */
    public RouteTargetOutCtx routeTarget(RouteTargetInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5130-RENAME-SOURCE-TO-TARGET
     *
     * @return 
     */
    public RenameSourceToTargetOutCtx renameSourceToTarget(RenameSourceToTargetInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5200-COMMIT-ACTIVITY
     *
     * @return 
     */
    public CommitActivityOutCtx commitActivity(CommitActivityInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5300-ROLLBACK-ACTIVITY
     *
     * @return 
     */
    public RollbackActivityOutCtx rollbackActivity(RollbackActivityInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5400-RELEASE-GFT-CONNECTION
     *
     * @return 
     */
    public ReleaseGftConnectionOutCtx releaseGftConnection(ReleaseGftConnectionInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5500-RESTORE-USER-CONNECTION
     *
     * @return 
     */
    public RestoreUserConnectionOutCtx restoreUserConnection(RestoreUserConnectionInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5510-SET-USER-PACKAGESET
     *
     * @return 
     */
    public SetUserPackagesetOutCtx setUserPackageset(SetUserPackagesetInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5520-CONNECT-USER-DATABASE
     *
     * @return 
     */
    public ConnectUserDatabaseOutCtx connectUserDatabase(ConnectUserDatabaseInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5600-END-ALLOCATION
     *
     * @return 
     */
    public EndAllocationOutCtx endAllocation(EndAllocationInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 6000-RETURN-RESPONSE
     *
     * @return 
     */
    public ReturnResponseOutCtx returnResponse(ReturnResponseInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 6100-RETURN-COPYBOOK-VERS-01-0
     *
     * @return 
     */
    public ReturnCopybookVers010OutCtx returnCopybookVers010(ReturnCopybookVers010InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 6200-RETURN-COPYBOOK-VERS-02-0
     *
     * @return 
     */
    public ReturnCopybookVers020OutCtx returnCopybookVers020(ReturnCopybookVers020InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 6300-RETURN-COPYBOOK-VERS-04-0
     *
     * @return 
     */
    public ReturnCopybookVers040OutCtx returnCopybookVers040(ReturnCopybookVers040InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 6400-RETURN-COPYBOOK-VERS-05-0
     *
     * @return 
     */
    public ReturnCopybookVers050OutCtx returnCopybookVers050(ReturnCopybookVers050InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 6500-RETURN-COPYBOOK-VERS-08-0
     *
     * @return 
     */
    public ReturnCopybookVers080OutCtx returnCopybookVers080(ReturnCopybookVers080InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 7000-REPORT-COMPLETION
     *
     * @return 
     */
    public ReportCompletionOutCtx reportCompletion(ReportCompletionInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-VERIFY-COPYBOOK
     *
     * @return 
     */
    public VerifyCopybookOutCtx verifyCopybook(VerifyCopybookInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8010-VERIFY-BULK-ID
     *
     * @return 
     */
    public VerifyBulkIdOutCtx verifyBulkId(VerifyBulkIdInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8011-SELECT-TARAFPL
     *
     * @return 
     */
    public SelectTarafplOutCtx selectTarafpl(SelectTarafplInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8013-VERIFY-PROFILE
     *
     * @return 
     */
    public VerifyProfileOutCtx verifyProfile(VerifyProfileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8020-VERIFY-ENDPT-ID
     *
     * @return 
     */
    public VerifyEndptIdOutCtx verifyEndptId(VerifyEndptIdInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8021-GET-TARAEPT
     *
     * @return 
     */
    public GetTaraeptOutCtx getTaraept(GetTaraeptInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8030-VERIFY-DELETE-IND
     *
     * @return 
     */
    public VerifyDeleteIndOutCtx verifyDeleteInd(VerifyDeleteIndInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8040-VERIFY-CYCL-NUM
     *
     * @return 
     */
    public VerifyCyclNumOutCtx verifyCyclNum(VerifyCyclNumInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8050-VERIFY-APPLICATION-DSN
     *
     * @return 
     */
    public VerifyApplicationDsnOutCtx verifyApplicationDsn(VerifyApplicationDsnInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8060-VERIFY-BROADCAST-RESULT
     *
     * @return 
     */
    public VerifyBroadcastResultOutCtx verifyBroadcastResult(VerifyBroadcastResultInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8061-VERIFY-BROADCAST-SYSLST
     *
     * @return 
     */
    public VerifyBroadcastSyslstOutCtx verifyBroadcastSyslst(VerifyBroadcastSyslstInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8062-VERIFY-BROADCAST-SYSNNN
     *
     * @return 
     */
    public VerifyBroadcastSysnnnOutCtx verifyBroadcastSysnnn(VerifyBroadcastSysnnnInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8063-REPORT-RESULT-ERROR
     *
     * @return 
     */
    public ReportResultErrorOutCtx reportResultError(ReportResultErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8070-VERIFY-PROCDATE
     *
     * @return 
     */
    public VerifyProcdateOutCtx verifyProcdate(VerifyProcdateInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8071-COMPUTE-JULIAN-DAY
     *
     * @return 
     */
    public ComputeJulianDayOutCtx computeJulianDay(ComputeJulianDayInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8100-ALLOCATE-DATA-FILES
     *
     */
    public void allocateDataFiles(AllocateDataFilesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8110-ALLOCATE-GFT-AS-SOURCE
     *
     * @return 
     */
    public AllocateGftAsSourceOutCtx allocateGftAsSource(AllocateGftAsSourceInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8120-ALLOCATE-APPL-AS-TARGET
     *
     * @return 
     */
    public AllocateApplAsTargetOutCtx allocateApplAsTarget(AllocateApplAsTargetInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8121-DEFAULT-APPL-DSN
     *
     * @return 
     */
    public DefaultApplDsnOutCtx defaultApplDsn(DefaultApplDsnInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8122-CHECK-TARGET-SPACE-UNIT
     *
     * @return 
     */
    public CheckTargetSpaceUnitOutCtx checkTargetSpaceUnit(CheckTargetSpaceUnitInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8124-DETERMINE-TARGET-ALLOC
     *
     * @return 
     */
    public DetermineTargetAllocOutCtx determineTargetAlloc(DetermineTargetAllocInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8130-ALLOCATE-APPL-AS-SOURCE
     *
     * @return 
     */
    public AllocateApplAsSourceOutCtx allocateApplAsSource(AllocateApplAsSourceInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8140-ALLOCATE-GFT-AS-TARGET
     *
     * @return 
     */
    public AllocateGftAsTargetOutCtx allocateGftAsTarget(AllocateGftAsTargetInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8141-SETUP-INSTALL-GFT-TRGT
     *
     * @return 
     */
    public SetupInstallGftTrgtOutCtx setupInstallGftTrgt(SetupInstallGftTrgtInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8142-SETUP-BROADCAST-GFT-TRGT
     *
     * @return 
     */
    public SetupBroadcastGftTrgtOutCtx setupBroadcastGftTrgt(SetupBroadcastGftTrgtInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8143-SETUP-STANDARD-GFT-TRGT
     *
     * @return 
     */
    public SetupStandardGftTrgtOutCtx setupStandardGftTrgt(SetupStandardGftTrgtInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8144-SETUP-TARGET-PER-SOURCE
     *
     * @return 
     */
    public SetupTargetPerSourceOutCtx setupTargetPerSource(SetupTargetPerSourceInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8145-SETUP-TARGET-PER-PROFILE
     *
     * @return 
     */
    public SetupTargetPerProfileOutCtx setupTargetPerProfile(SetupTargetPerProfileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8146-SETUP-TARGET-ALLOC-STATS
     *
     * @return 
     */
    public SetupTargetAllocStatsOutCtx setupTargetAllocStats(SetupTargetAllocStatsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8147-SETUP-GFT-TARGET-STAMP
     *
     * @return 
     */
    public SetupGftTargetStampOutCtx setupGftTargetStamp(SetupGftTargetStampInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8148-COMPLETE-GFT-TARGET-DSN
     *
     * @return 
     */
    public CompleteGftTargetDsnOutCtx completeGftTargetDsn(CompleteGftTargetDsnInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8149-CHECK-GFT-DSN-AVAIL
     *
     * @return 
     */
    public CheckGftDsnAvailOutCtx checkGftDsnAvail(CheckGftDsnAvailInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8150-ALLOCATE-SOURCE
     *
     * @return 
     */
    public AllocateSourceOutCtx allocateSource(AllocateSourceInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8160-ALLOCATE-TARGET
     *
     * @return 
     */
    public AllocateTargetOutCtx allocateTarget(AllocateTargetInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8210-FETCH-BULK-TARAEFP
     *
     * @return 
     */
    public FetchBulkTaraefpOutCtx fetchBulkTaraefp(FetchBulkTaraefpInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8220-READ-LIST
     *
     * @return 
     */
    public ReadListOutCtx readList(ReadListInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8230-SETUP-RESET
     *
     */
    public void setupReset(SetupResetInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8231-GET-RESET-TARAEFP
     *
     * @return 
     */
    public GetResetTaraefpOutCtx getResetTaraefp(GetResetTaraefpInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8232-VERIFY-RESET-ACCEPTABLE
     *
     * @return 
     */
    public VerifyResetAcceptableOutCtx verifyResetAcceptable(VerifyResetAcceptableInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8300-SETUP-NEW-TARAFXS
     *
     * @return 
     */
    public SetupNewTarafxsOutCtx setupNewTarafxs(SetupNewTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8310-INITIALIZE-COLUMNS
     *
     * @return 
     */
    public InitializeColumnsOutCtx initializeColumns(InitializeColumnsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8320-SETUP-XFER-FILE-SZ-NUM
     *
     * @return 
     */
    public SetupXferFileSzNumOutCtx setupXferFileSzNum(SetupXferFileSzNumInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8330-UPDATE-TARAFXS
     *
     * @return 
     */
    public UpdateTarafxsOutCtx updateTarafxs(UpdateTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8340-ASSIGN-STAT-CD
     *
     * @return 
     */
    public AssignStatCdOutCtx assignStatCd(AssignStatCdInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8341-QUEUE-INBOUND-READY-MSG
     *
     * @return 
     */
    public QueueInboundReadyMsgOutCtx queueInboundReadyMsg(QueueInboundReadyMsgInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8350-SETUP-VALID-ROW
     *
     * @return 
     */
    public SetupValidRowOutCtx setupValidRow(SetupValidRowInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8351-SETUP-APPLICATION-EXIT
     *
     * @return 
     */
    public SetupApplicationExitOutCtx setupApplicationExit(SetupApplicationExitInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8352-BUILD-FTSS-FILE-NAME
     *
     * @return 
     */
    public BuildFtssFileNameOutCtx buildFtssFileName(BuildFtssFileNameInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8360-SETUP-PROBLEM-ROW
     *
     * @return 
     */
    public SetupProblemRowOutCtx setupProblemRow(SetupProblemRowInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8361-SETUP-MIP-IDS
     *
     * @return 
     */
    public SetupMipIdsOutCtx setupMipIds(SetupMipIdsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8390-INSERT-TARAFXS
     *
     * @return 
     */
    public InsertTarafxsOutCtx insertTarafxs(InsertTarafxsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8391-SETUP-INSERT-SOURCE
     *
     * @return 
     */
    public SetupInsertSourceOutCtx setupInsertSource(SetupInsertSourceInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8400-LOCATE-OUTBOUND-TARAEFP
     *
     * @return 
     */
    public LocateOutboundTaraefpOutCtx locateOutboundTaraefp(LocateOutboundTaraefpInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8410-SEARCH-TARAEFP
     *
     * @return 
     */
    public SearchTaraefpOutCtx searchTaraefp(SearchTaraefpInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8411-CALL-AR649010
     *
     * @return 
     */
    public CallAr649010OutCtx callAr649010(CallAr649010InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8412-SELECT-TARAEFP
     *
     * @return 
     */
    public SelectTaraefpOutCtx selectTaraefp(SelectTaraefpInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8420-LOCATE-OUTBOUND-TARAEPT
     *
     * @return 
     */
    public LocateOutboundTaraeptOutCtx locateOutboundTaraept(LocateOutboundTaraeptInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8421-LOOKUP-BACKUP-ENDPOINT
     *
     * @return 
     */
    public LookupBackupEndpointOutCtx lookupBackupEndpoint(LookupBackupEndpointInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8422-SELECT-TARAEPT
     *
     * @return 
     */
    public SelectTaraeptOutCtx selectTaraept(SelectTaraeptInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8440-SELECT-APP-ENDPT-ID
     *
     * @return 
     */
    public SelectAppEndptIdOutCtx selectAppEndptId(SelectAppEndptIdInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8450-CHECK-FTSS-REPEAT
     *
     * @return 
     */
    public CheckFtssRepeatOutCtx checkFtssRepeat(CheckFtssRepeatInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8460-LOG-FTSS-REPEATED
     *
     * @return 
     */
    public LogFtssRepeatedOutCtx logFtssRepeated(LogFtssRepeatedInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8470-CHECK-FILE-TYPE
     *
     * @return 
     */
    public CheckFileTypeOutCtx checkFileType(CheckFileTypeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8471-SETUP-TYPE-SYSRDR
     *
     * @return 
     */
    public SetupTypeSysrdrOutCtx setupTypeSysrdr(SetupTypeSysrdrInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8472-SETUP-TYPE-SYSOUT
     *
     * @return 
     */
    public SetupTypeSysoutOutCtx setupTypeSysout(SetupTypeSysoutInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8473-SETUP-TYPE-DS-PS
     *
     * @return 
     */
    public SetupTypeDsPsOutCtx setupTypeDsPs(SetupTypeDsPsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8474-SETUP-TYPE-DS-PO
     *
     * @return 
     */
    public SetupTypeDsPoOutCtx setupTypeDsPo(SetupTypeDsPoInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8479-SETUP-SYSDSN
     *
     * @return 
     */
    public SetupSysdsnOutCtx setupSysdsn(SetupSysdsnInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8480-VERIFY-JCL-DD-NAME
     *
     * @return 
     */
    public VerifyJclDdNameOutCtx verifyJclDdName(VerifyJclDdNameInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8481-CALL-MCINFO
     *
     * @return 
     */
    public CallMcinfoOutCtx callMcinfo(CallMcinfoInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8500-CREATE-COPY
     *
     * @return 
     */
    public CreateCopyOutCtx createCopy(CreateCopyInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8510-DISPLAY-FILE-INFO
     *
     * @return 
     */
    public DisplayFileInfoOutCtx displayFileInfo(DisplayFileInfoInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8520-OPEN-FILES
     *
     * @return 
     */
    public OpenFilesOutCtx openFiles(OpenFilesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8521-SETUP-SEQIO-PARMS
     *
     * @return 
     */
    public SetupSeqioParmsOutCtx setupSeqioParms(SetupSeqioParmsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8530-COPY-SOURCE-TO-TARGET
     *
     * @return 
     */
    public CopySourceToTargetOutCtx copySourceToTarget(CopySourceToTargetInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8531-WRITE-TARGET-RECORD
     *
     * @return 
     */
    public WriteTargetRecordOutCtx writeTargetRecord(WriteTargetRecordInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8532-READ-SOURCE-RECORD
     *
     * @return 
     */
    public ReadSourceRecordOutCtx readSourceRecord(ReadSourceRecordInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8540-VERIFY-COPY-COUNTS
     *
     */
    public void verifyCopyCounts(VerifyCopyCountsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8541-CHECK-COPY-COUNTS
     *
     * @return 
     */
    public CheckCopyCountsOutCtx checkCopyCounts(CheckCopyCountsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8542-REPORT-COPY-COUNTS
     *
     * @return 
     */
    public ReportCopyCountsOutCtx reportCopyCounts(ReportCopyCountsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8600-OPEN-RESULT
     *
     */
    public void openResult(OpenResultInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8601-OPEN-RESULT-SYSLST
     *
     * @return 
     */
    public OpenResultSyslstOutCtx openResultSyslst(OpenResultSyslstInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8602-OPEN-RESULT-SYSNNN
     *
     * @return 
     */
    public OpenResultSysnnnOutCtx openResultSysnnn(OpenResultSysnnnInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8610-CAPTURE-RESULT
     *
     * @return 
     */
    public CaptureResultOutCtx captureResult(CaptureResultInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8611-SETUP-REASON-MSG
     *
     * @return 
     */
    public SetupReasonMsgOutCtx setupReasonMsg(SetupReasonMsgInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8612-BUILD-RESULT-RECORD
     *
     * @return 
     */
    public BuildResultRecordOutCtx buildResultRecord(BuildResultRecordInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8613-WRITE-RESULT-RECORD
     *
     * @return 
     */
    public WriteResultRecordOutCtx writeResultRecord(WriteResultRecordInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8620-CLOSE-RESULT
     *
     */
    public void closeResult(CloseResultInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8621-CLOSE-RESULT-SYSLST
     *
     * @return 
     */
    public CloseResultSyslstOutCtx closeResultSyslst(CloseResultSyslstInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8622-CLOSE-RESULT-SYSNNN
     *
     * @return 
     */
    public CloseResultSysnnnOutCtx closeResultSysnnn(CloseResultSysnnnInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8630-CALL-AR648010
     *
     * @return 
     */
    public CallAr648010OutCtx callAr648010(CallAr648010InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8700-VERIFY-FILE-STATS
     *
     */
    public void verifyFileStats(VerifyFileStatsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8710-SETUP-DCB-VALUES
     *
     * @return 
     */
    public SetupDcbValuesOutCtx setupDcbValues(SetupDcbValuesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8711-CALL-AR642010
     *
     * @return 
     */
    public CallAr642010OutCtx callAr642010(CallAr642010InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8712-SETUP-SPEC-NAMES
     *
     * @return 
     */
    public SetupSpecNamesOutCtx setupSpecNames(SetupSpecNamesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8720-VERIFY-SOURCE-DD-NAME
     *
     */
    public void verifySourceDdName(VerifySourceDdNameInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8721-VERIFY-SOURCE-SUPPLY-DDN
     *
     * @return 
     */
    public VerifySourceSupplyDdnOutCtx verifySourceSupplyDdn(VerifySourceSupplyDdnInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8722-VERIFY-SOURCE-DEMAND-DDN
     *
     * @return 
     */
    public VerifySourceDemandDdnOutCtx verifySourceDemandDdn(VerifySourceDemandDdnInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8730-VERIFY-ALLOC-TYPE
     *
     * @return 
     */
    public VerifyAllocTypeOutCtx verifyAllocType(VerifyAllocTypeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8731-REJECT-ALLOC-TYPE
     *
     * @return 
     */
    public RejectAllocTypeOutCtx rejectAllocType(RejectAllocTypeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8740-VERIFY-DCB
     *
     * @return 
     */
    public VerifyDcbOutCtx verifyDcb(VerifyDcbInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8741-VERIFY-DCB-FIX
     *
     */
    public void verifyDcbFix(VerifyDcbFixInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8742-VERIFY-DCB-VAR
     *
     */
    public void verifyDcbVar(VerifyDcbVarInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8743-VERIFY-DCB-UND
     *
     * @return 
     */
    public VerifyDcbUndOutCtx verifyDcbUnd(VerifyDcbUndInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8748-REPORT-LRECL-ERROR
     *
     * @return 
     */
    public ReportLreclErrorOutCtx reportLreclError(ReportLreclErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8749-SET-SIGNIFICANT-NUMERIC
     *
     * @return 
     */
    public SetSignificantNumericOutCtx setSignificantNumeric(SetSignificantNumericInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8750-SETUP-NEW-FILE-SPECS
     *
     * @return 
     */
    public SetupNewFileSpecsOutCtx setupNewFileSpecs(SetupNewFileSpecsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8760-REPORT-APPL-PARM-ERROR
     *
     * @return 
     */
    public ReportApplParmErrorOutCtx reportApplParmError(ReportApplParmErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8770-REPORT-GFT-PARM-ERROR
     *
     * @return 
     */
    public ReportGftParmErrorOutCtx reportGftParmError(ReportGftParmErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8780-ISSUE-WARNING
     *
     * @return 
     */
    public IssueWarningOutCtx issueWarning(IssueWarningInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8790-CHECK-FTSS-FILE-DISPLAY
     *
     */
    public void checkFtssFileDisplay(CheckFtssFileDisplayInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8800-OPEN-FILE
     *
     * @return 
     */
    public OpenFileOutCtx openFile(OpenFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8810-READ-FILE
     *
     * @return 
     */
    public ReadFileOutCtx readFile(ReadFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8820-WRITE-FILE
     *
     * @return 
     */
    public WriteFileOutCtx writeFile(WriteFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8830-CLOSE-FILE
     *
     * @return 
     */
    public CloseFileOutCtx closeFile(CloseFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8840-DELETE-FILE
     *
     * @return 
     */
    public DeleteFileOutCtx deleteFile(DeleteFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8841-DELETE-OPEN
     *
     * @return 
     */
    public DeleteOpenOutCtx deleteOpen(DeleteOpenInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8842-DELETE-CLOSE
     *
     * @return 
     */
    public DeleteCloseOutCtx deleteClose(DeleteCloseInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8890-CALL-SEQIO
     *
     * @return 
     */
    public CallSeqioOutCtx callSeqio(CallSeqioInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8900-ALLOCATE-FILE
     *
     * @return 
     */
    public AllocateFileOutCtx allocateFile(Ar640010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8910-UNALLOCATE-FILE
     *
     * @return 
     */
    public UnallocateFileOutCtx unallocateFile(UnallocateFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8920-INQUIRE-FILE
     *
     * @return 
     */
    public InquireFileOutCtx inquireFile(InquireFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8930-CALL-DYNAM
     *
     * @return 
     */
    public CallDynamOutCtx callDynam(CallDynamInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8940-VERIFY-OMNIBUS-ALERT
     *
     * @return 
     */
    public VerifyOmnibusAlertOutCtx verifyOmnibusAlert(VerifyOmnibusAlertInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8941-SEND-OMNIBUS-ALERT
     *
     * @return 
     */
    public SendOmnibusAlertOutCtx sendOmnibusAlert(SendOmnibusAlertInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8942-GET-STATUS-DESCRIPTION
     *
     * @return 
     */
    public GetStatusDescriptionOutCtx getStatusDescription(GetStatusDescriptionInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8943-CALL-AR630010
     *
     * @return 
     */
    public CallAr630010OutCtx callAr630010(CallAr630010InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8960-SETUP-COMPLETE-DSN
     *
     * @return 
     */
    public SetupCompleteDsnOutCtx setupCompleteDsn(SetupCompleteDsnInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8980-SET-CURRENT-TIMESTAMP
     *
     * @return 
     */
    public SetCurrentTimestampOutCtx setCurrentTimestamp(SetCurrentTimestampInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8990-COMMIT-DATABASE
     *
     * @return 
     */
    public CommitDatabaseOutCtx commitDatabase(Ar640010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8999-CHECK-SQL-RETRY
     *
     * @return 
     */
    public CheckSqlRetryOutCtx checkSqlRetry(CheckSqlRetryInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-REPORT-COPY-ERROR
     *
     */
    public void reportCopyError(ReportCopyErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9010-CHECK-COPY-ERR-ADD
     *
     */
    public void checkCopyErrAdd(CheckCopyErrAddInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9011-CHECK-COPY-ERR-ADD-APPL
     *
     * @return 
     */
    public CheckCopyErrAddApplOutCtx checkCopyErrAddAppl(CheckCopyErrAddApplInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9012-CHECK-COPY-ERR-ADD-GFT
     *
     * @return 
     */
    public CheckCopyErrAddGftOutCtx checkCopyErrAddGft(CheckCopyErrAddGftInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9020-CHECK-COPY-ERR-BULK
     *
     */
    public void checkCopyErrBulk(CheckCopyErrBulkInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9021-CHECK-COPY-ERR-BULK-APPL
     *
     * @return 
     */
    public CheckCopyErrBulkApplOutCtx checkCopyErrBulkAppl(CheckCopyErrBulkApplInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9022-CHECK-COPY-ERR-BULK-GFT
     *
     * @return 
     */
    public CheckCopyErrBulkGftOutCtx checkCopyErrBulkGft(CheckCopyErrBulkGftInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9023-REJECT-BULK-TARAEPT
     *
     * @return 
     */
    public RejectBulkTaraeptOutCtx rejectBulkTaraept(RejectBulkTaraeptInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9024-REJECT-BULK-TARAEFP
     *
     * @return 
     */
    public RejectBulkTaraefpOutCtx rejectBulkTaraefp(RejectBulkTaraefpInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9040-CHECK-COPY-ERR-LIST
     *
     */
    public void checkCopyErrList(CheckCopyErrListInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9041-CHECK-COPY-ERR-LIST-APPL
     *
     * @return 
     */
    public CheckCopyErrListApplOutCtx checkCopyErrListAppl(CheckCopyErrListApplInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9042-CHECK-COPY-ERR-LIST-GFT
     *
     * @return 
     */
    public CheckCopyErrListGftOutCtx checkCopyErrListGft(CheckCopyErrListGftInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9043-REJECT-LIST-TARAEPT
     *
     * @return 
     */
    public RejectListTaraeptOutCtx rejectListTaraept(RejectListTaraeptInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9044-REJECT-LIST-TARAEFP
     *
     * @return 
     */
    public RejectListTaraefpOutCtx rejectListTaraefp(RejectListTaraefpInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9045-REPORT-LISTDD-ERROR
     *
     * @return 
     */
    public ReportListddErrorOutCtx reportListddError(ReportListddErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9050-CHECK-COPY-ERR-RETR
     *
     */
    public void checkCopyErrRetr(CheckCopyErrRetrInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9051-CHECK-COPY-ERR-RETR-APPL
     *
     * @return 
     */
    public CheckCopyErrRetrApplOutCtx checkCopyErrRetrAppl(CheckCopyErrRetrApplInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9052-CHECK-COPY-ERR-RETR-GFT
     *
     * @return 
     */
    public CheckCopyErrRetrGftOutCtx checkCopyErrRetrGft(CheckCopyErrRetrGftInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9060-CHECK-COPY-ERR-SEND
     *
     */
    public void checkCopyErrSend(CheckCopyErrSendInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9061-CHECK-COPY-ERR-SEND-APPL
     *
     * @return 
     */
    public CheckCopyErrSendApplOutCtx checkCopyErrSendAppl(CheckCopyErrSendApplInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9062-CHECK-COPY-ERR-SEND-GFT
     *
     * @return 
     */
    public CheckCopyErrSendGftOutCtx checkCopyErrSendGft(CheckCopyErrSendGftInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9063-REJECT-SEND-TARAEPT
     *
     * @return 
     */
    public RejectSendTaraeptOutCtx rejectSendTaraept(RejectSendTaraeptInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9064-REJECT-SEND-TARAEFP
     *
     * @return 
     */
    public RejectSendTaraefpOutCtx rejectSendTaraefp(RejectSendTaraefpInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9080-CHECK-COPY-ERR-INST
     *
     */
    public void checkCopyErrInst(CheckCopyErrInstInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9081-CHECK-COPY-ERR-INST-APPL
     *
     * @return 
     */
    public CheckCopyErrInstApplOutCtx checkCopyErrInstAppl(CheckCopyErrInstApplInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9082-CHECK-COPY-ERR-INST-GFT
     *
     * @return 
     */
    public CheckCopyErrInstGftOutCtx checkCopyErrInstGft(CheckCopyErrInstGftInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9100-REPORT-COPYBOOK-ERROR
     *
     */
    public void reportCopybookError(ReportCopybookErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9110-REPORT-PARM-ERROR
     *
     */
    public void reportParmError(ReportParmErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9200-REPORT-CONTROL-PARM-ERROR
     *
     * @return 
     */
    public ReportControlParmErrorOutCtx reportControlParmError(ReportControlParmErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9300-REPORT-CONNECT-ERROR
     *
     * @return 
     */
    public ReportConnectErrorOutCtx reportConnectError(ReportConnectErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9400-REPORT-SQL-ERROR
     *
     * @return 
     */
    public ReportSqlErrorOutCtx reportSqlError(ReportSqlErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9410-DISPLAY-TARAFPL-NOTFND
     *
     */
    public void displayTarafplNotfnd(DisplayTarafplNotfndInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9414-DISPLAY-TARAFPL-SELECT
     *
     */
    public void displayTarafplSelect(DisplayTarafplSelectInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9420-DISPLAY-TARAFXS-NOTFND
     *
     */
    public void displayTarafxsNotfnd(DisplayTarafxsNotfndInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9421-DISPLAY-TARAFXS-OPEN
     *
     */
    public void displayTarafxsOpen(DisplayTarafxsOpenInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9422-DISPLAY-TARAFXS-FETCH
     *
     */
    public void displayTarafxsFetch(DisplayTarafxsFetchInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9423-DISPLAY-TARAFXS-CLOSE
     *
     */
    public void displayTarafxsClose(DisplayTarafxsCloseInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9424-DISPLAY-TARAFXS-SELECT
     *
     */
    public void displayTarafxsSelect(DisplayTarafxsSelectInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9425-DISPLAY-TARAFXS-UPDATE
     *
     */
    public void displayTarafxsUpdate(DisplayTarafxsUpdateInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9426-DISPLAY-TARAFXS-INSERT
     *
     */
    public void displayTarafxsInsert(DisplayTarafxsInsertInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9427-DISPLAY-TARAFXS-NOSTAT
     *
     */
    public void displayTarafxsNostat(DisplayTarafxsNostatInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9428-DISPLAY-TARAFXS-COUNT
     *
     */
    public void displayTarafxsCount(DisplayTarafxsCountInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9429-DISPLAY-TARAFXS-SELECT
     *
     */
    public void displayTarafxsSelect9429(DisplayTarafxsSelect9429InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9430-DISPLAY-TARAEFP-NOTFND
     *
     */
    public void displayTaraefpNotfnd(DisplayTaraefpNotfndInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9431-DISPLAY-TARAEFP-OPEN
     *
     */
    public void displayTaraefpOpen(DisplayTaraefpOpenInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9432-DISPLAY-TARAEFP-FETCH
     *
     */
    public void displayTaraefpFetch(DisplayTaraefpFetchInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9433-DISPLAY-TARAEFP-CLOSE
     *
     */
    public void displayTaraefpClose(DisplayTaraefpCloseInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9434-DISPLAY-TARAEFP-SELECT
     *
     */
    public void displayTaraefpSelect(DisplayTaraefpSelectInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9435-DISPLAY-TARAEFP-BACKUP
     *
     */
    public void displayTaraefpBackup(DisplayTaraefpBackupInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9440-DISPLAY-TARAEPT-NOTFND
     *
     */
    public void displayTaraeptNotfnd(DisplayTaraeptNotfndInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9444-DISPLAY-TARAEPT-SELECT
     *
     */
    public void displayTaraeptSelect(DisplayTaraeptSelectInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9445-DISPLAY-TARAEPT-BACKUP
     *
     */
    public void displayTaraeptBackup(DisplayTaraeptBackupInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9448-DISPLAY-APP-ENDPT-TARAEPT
     *
     */
    public void displayAppEndptTaraept(DisplayAppEndptTaraeptInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9450-DISPLAY-TARAFXA-NOTFND
     *
     */
    public void displayTarafxaNotfnd(DisplayTarafxaNotfndInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9451-DISPLAY-TARAFXA-OPEN
     *
     */
    public void displayTarafxaOpen(DisplayTarafxaOpenInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9452-DISPLAY-TARAFXA-FETCH
     *
     */
    public void displayTarafxaFetch(DisplayTarafxaFetchInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9453-DISPLAY-TARAFXA-CLOSE
     *
     */
    public void displayTarafxaClose(DisplayTarafxaCloseInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9454-DISPLAY-TARASTS-SELECT
     *
     * @return 
     */
    public DisplayTarastsSelectOutCtx displayTarastsSelect(DisplayTarastsSelectInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9500-REPORT-ALLOCATE-ERROR
     *
     * @return 
     */
    public ReportAllocateErrorOutCtx reportAllocateError(ReportAllocateErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9600-REPORT-AR642-ERROR
     *
     * @return 
     */
    public ReportAr642ErrorOutCtx reportAr642Error(ReportAr642ErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9610-REPORT-AR647-ERROR
     *
     * @return 
     */
    public ReportAr647ErrorOutCtx reportAr647Error(ReportAr647ErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9620-REPORT-AR648-ERROR
     *
     * @return 
     */
    public ReportAr648ErrorOutCtx reportAr648Error(ReportAr648ErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9630-REPORT-AR649-ERROR
     *
     * @return 
     */
    public ReportAr649ErrorOutCtx reportAr649Error(ReportAr649ErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9700-REPORT-SEQIO-ERROR
     *
     * @return 
     */
    public ReportSeqioErrorOutCtx reportSeqioError(ReportSeqioErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9710-DISPLAY-SEQIO-PARMS
     *
     * @return 
     */
    public DisplaySeqioParmsOutCtx displaySeqioParms(DisplaySeqioParmsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9800-REPORT-SETUP-PROBLEM
     *
     * @return 
     */
    public ReportSetupProblemOutCtx reportSetupProblem(ReportSetupProblemInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9900-REPORT-ERROR
     *
     * @return 
     */
    public ReportErrorOutCtx reportError(ReportErrorInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9910-SET-FUNCTION-TIMESTAMP
     *
     * @return 
     */
    public SetFunctionTimestampOutCtx setFunctionTimestamp(SetFunctionTimestampInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9911-PULL-CURRENT-DATE-TIME
     *
     * @return 
     */
    public PullCurrentDateTimeOutCtx pullCurrentDateTime(Ar640010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9999-WRITE-LOG-MESSAGE
     *
     * @return 
     */
    public WriteLogMessageOutCtx writeLogMessage(WriteLogMessageInCtx methodIn) throws Exception;


     /**
	 * This will invoke the program given parameters from the
      * caller program.
	 *
	 * @return return code of the program
	 */
     public int call(ProgramContext programCtx, Object[] parameters) throws Exception;

     /**
	 * This will invoke the program given Field parameters from
      * the caller program.
	 *
	 * @return return code of the program
	 */
     public int call(ProgramContext programCtx, Field... parameters) throws Exception;
}
