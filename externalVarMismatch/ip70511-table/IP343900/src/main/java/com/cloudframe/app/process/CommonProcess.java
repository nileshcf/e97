package com.cloudframe.app.process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.global.sharedvar.Ip08101RunControlRecord;
import com.cloudframe.app.global.sharedvar.Ip02015PrcssAgrmtTable;
import com.cloudframe.app.global.sharedvar.Ip34631Tipapim;
import com.cloudframe.app.global.sharedvar.ApiLayout;
import com.cloudframe.app.global.sharedvar.Ip34051MqProcessParameters;
import com.cloudframe.app.global.sharedvar.Ip57901Tipaqpr;
import com.cloudframe.app.global.sharedvar.Ip02014PrcssAgrmtTable;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
import com.cloudframe.app.global.sharedvar.Ip75081MqSwitches;
import com.cloudframe.app.global.sharedvar.Ip70511Table;
import com.cloudframe.app.global.sharedvar.Ip70511EntryFoundGroup;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.global.sharedvar.Ip996021JobInformation;
import com.cloudframe.app.global.sharedvar.CheckFirstPutPimGroup100;
import com.cloudframe.app.global.sharedvar.Ip30771TipacliTable;
import com.cloudframe.app.global.sharedvar.Ip30881Db2McwaitInputValue;
import com.cloudframe.app.global.sharedvar.Ip64801LrmCommBlock;
import com.cloudframe.app.global.sharedvar.Ip70521MqApiLayout;
import com.cloudframe.app.global.sharedvar.Ip70301IsItCallFromWlmGroup;
import com.cloudframe.app.global.sharedvar.Ip70301IsItCallFromNspkGroup;
import com.cloudframe.app.global.sharedvar.Ip70301IsMqReqSentSwGroup;
import com.cloudframe.app.global.sharedvar.Ip70301IsFraudMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301IsCemreqMqSrvActveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301IsCemresMqSrvActveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301CemauthMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301CemnspkMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301FastpayMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301InstallMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301QrRfndMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301MpAchMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301PmaIdnMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301PmaRusMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.ArePhysicalFilesOverGroup100;
import com.cloudframe.app.global.sharedvar.CheckCloseQueueGroup100;
import com.cloudframe.app.global.sharedvar.CheckGetQueueGroup100;
import com.cloudframe.app.global.sharedvar.CheckPutQueueGroup100;
import com.cloudframe.app.global.sharedvar.Ip70301LnCloneOwnerIdGroup;
import com.cloudframe.app.global.sharedvar.Ip70301LnCommitCntGroup;
import com.cloudframe.app.global.sharedvar.Ip70301OrigMsgLenGroup;
import com.cloudframe.app.global.sharedvar.GetBrowseCallsGroup100;
public class CommonProcess extends BaseProcess {
@Autowired 
  @Qualifier("ip750080")
protected Ip750080 ip750080;
@Autowired 
  @Qualifier("ip996010")
protected Ip996010 ip996010;
@Autowired 
  @Qualifier("ip081110")
protected Ip081110 ip081110;
@Autowired 
  @Qualifier("ip282210")
protected Ip282210 ip282210;
@Autowired 
  @Qualifier("ip996020")
protected Ip996020 ip996020;
@Autowired 
  @Qualifier("ip703020")
protected Ip703020 ip703020;
@Autowired 
  @Qualifier("ip532010")
protected Ip532010 ip532010;
@Autowired 
  @Qualifier("ip610010")
protected Ip610010 ip610010;
@Autowired 
  @Qualifier("global_ip08101RunControlRecord")
protected Ip08101RunControlRecord ip08101RunControlRecord;
@Autowired 
  @Qualifier("global_ip02015PrcssAgrmtTable")
protected Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable;
@Autowired 
  @Qualifier("global_ip34631Tipapim")
protected Ip34631Tipapim ip34631Tipapim;
@Autowired 
  @Qualifier("global_apiLayout")
protected ApiLayout apiLayout;
@Autowired 
  @Qualifier("global_ip34051MqProcessParameters")
protected Ip34051MqProcessParameters ip34051MqProcessParameters;
@Autowired 
  @Qualifier("global_ip57901Tipaqpr")
protected Ip57901Tipaqpr ip57901Tipaqpr;
@Autowired 
  @Qualifier("global_ip02014PrcssAgrmtTable")
protected Ip02014PrcssAgrmtTable ip02014PrcssAgrmtTable;
@Autowired 
  @Qualifier("global_ip50005OneDayRecLthGroup")
protected Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup;
@Autowired 
  @Qualifier("global_ip50005OneDayRec")
protected Ip50005OneDayRec ip50005OneDayRec;
@Autowired 
  @Qualifier("global_ip50005OneDayReadStatusGroup")
protected Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup;
@Autowired 
  @Qualifier("global_ip50005ClearingDtTm")
protected Ip50005ClearingDtTm ip50005ClearingDtTm;
@Autowired 
  @Qualifier("global_ip75081MqSwitches")
protected Ip75081MqSwitches ip75081MqSwitches;
@Autowired 
  @Qualifier("global_ip70511Table")
protected Ip70511Table ip70511Table;
@Autowired 
  @Qualifier("global_ip70511EntryFoundGroup")
protected Ip70511EntryFoundGroup ip70511EntryFoundGroup;
@Autowired 
  @Qualifier("global_ip60001EventLogWorkArea")
protected Ip60001EventLogWorkArea ip60001EventLogWorkArea;
@Autowired 
  @Qualifier("global_ip996011ProgramStartMessage")
protected Ip996011ProgramStartMessage ip996011ProgramStartMessage;
@Autowired 
  @Qualifier("global_ip996021JobInformation")
protected Ip996021JobInformation ip996021JobInformation;
@Autowired 
  @Qualifier("global_checkFirstPutPimGroup100")
protected CheckFirstPutPimGroup100 checkFirstPutPimGroup100;
@Autowired 
  @Qualifier("ip708020")
protected Ip708020 ip708020;
@Autowired 
  @Qualifier("ip648010")
protected Ip648010 ip648010;
@Autowired 
  @Qualifier("ip599810")
protected Ip599810 ip599810;
@Autowired 
  @Qualifier("global_ip30771TipacliTable")
protected Ip30771TipacliTable ip30771TipacliTable;
@Autowired 
  @Qualifier("global_ip30881Db2McwaitInputValue")
protected Ip30881Db2McwaitInputValue ip30881Db2McwaitInputValue;
@Autowired 
  @Qualifier("global_ip64801LrmCommBlock")
protected Ip64801LrmCommBlock ip64801LrmCommBlock;
@Autowired 
  @Qualifier("global_ip70521MqApiLayout")
protected Ip70521MqApiLayout ip70521MqApiLayout;
@Autowired 
  @Qualifier("global_ip70301IsItCallFromWlmGroup")
protected Ip70301IsItCallFromWlmGroup ip70301IsItCallFromWlmGroup;
@Autowired 
  @Qualifier("global_ip70301IsItCallFromNspkGroup")
protected Ip70301IsItCallFromNspkGroup ip70301IsItCallFromNspkGroup;
@Autowired 
  @Qualifier("global_ip70301IsMqReqSentSwGroup")
protected Ip70301IsMqReqSentSwGroup ip70301IsMqReqSentSwGroup;
@Autowired 
  @Qualifier("global_ip70301IsFraudMqSrvActiveGroup")
protected Ip70301IsFraudMqSrvActiveGroup ip70301IsFraudMqSrvActiveGroup;
@Autowired 
  @Qualifier("global_ip70301IsCemreqMqSrvActveGroup")
protected Ip70301IsCemreqMqSrvActveGroup ip70301IsCemreqMqSrvActveGroup;
@Autowired 
  @Qualifier("global_ip70301IsCemresMqSrvActveGroup")
protected Ip70301IsCemresMqSrvActveGroup ip70301IsCemresMqSrvActveGroup;
@Autowired 
  @Qualifier("global_ip70301CemauthMqSrvActiveGroup")
protected Ip70301CemauthMqSrvActiveGroup ip70301CemauthMqSrvActiveGroup;
@Autowired 
  @Qualifier("global_ip70301CemnspkMqSrvActiveGroup")
protected Ip70301CemnspkMqSrvActiveGroup ip70301CemnspkMqSrvActiveGroup;
@Autowired 
  @Qualifier("global_ip70301FastpayMqSrvActiveGroup")
protected Ip70301FastpayMqSrvActiveGroup ip70301FastpayMqSrvActiveGroup;
@Autowired 
  @Qualifier("global_ip70301InstallMqSrvActiveGroup")
protected Ip70301InstallMqSrvActiveGroup ip70301InstallMqSrvActiveGroup;
@Autowired 
  @Qualifier("global_ip70301QrRfndMqSrvActiveGroup")
protected Ip70301QrRfndMqSrvActiveGroup ip70301QrRfndMqSrvActiveGroup;
@Autowired 
  @Qualifier("global_ip70301MpAchMqSrvActiveGroup")
protected Ip70301MpAchMqSrvActiveGroup ip70301MpAchMqSrvActiveGroup;
@Autowired 
  @Qualifier("global_ip70301PmaIdnMqSrvActiveGroup")
protected Ip70301PmaIdnMqSrvActiveGroup ip70301PmaIdnMqSrvActiveGroup;
@Autowired 
  @Qualifier("global_ip70301PmaRusMqSrvActiveGroup")
protected Ip70301PmaRusMqSrvActiveGroup ip70301PmaRusMqSrvActiveGroup;
@Autowired 
  @Qualifier("global_arePhysicalFilesOverGroup100")
protected ArePhysicalFilesOverGroup100 arePhysicalFilesOverGroup100;
@Autowired 
  @Qualifier("global_checkCloseQueueGroup100")
protected CheckCloseQueueGroup100 checkCloseQueueGroup100;
@Autowired 
  @Qualifier("global_checkGetQueueGroup100")
protected CheckGetQueueGroup100 checkGetQueueGroup100;
@Autowired 
  @Qualifier("global_checkPutQueueGroup100")
protected CheckPutQueueGroup100 checkPutQueueGroup100;
@Autowired 
  @Qualifier("global_ip70301LnCloneOwnerIdGroup")
protected Ip70301LnCloneOwnerIdGroup ip70301LnCloneOwnerIdGroup;
@Autowired 
  @Qualifier("global_ip70301LnCommitCntGroup")
protected Ip70301LnCommitCntGroup ip70301LnCommitCntGroup;
@Autowired 
  @Qualifier("global_ip70301OrigMsgLenGroup")
protected Ip70301OrigMsgLenGroup ip70301OrigMsgLenGroup;
@Autowired 
  @Qualifier("global_getBrowseCallsGroup100")
protected GetBrowseCallsGroup100 getBrowseCallsGroup100;
}
