package com.cloudframe.app.process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.global.sharedvar.Ip00404Table;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.global.sharedvar.Ip08101RunControlRecord;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
public class CommonProcess extends BaseProcess {
@Autowired 
  @Qualifier("ip996010")
protected Ip996010 ip996010;
@Autowired 
  @Qualifier("ip280010")
protected Ip280010 ip280010;
@Autowired 
  @Qualifier("global_ip00404Table")
protected Ip00404Table ip00404Table;
@Autowired 
  @Qualifier("global_ip60001EventLogWorkArea")
protected Ip60001EventLogWorkArea ip60001EventLogWorkArea;
@Autowired 
  @Qualifier("global_ip996011ProgramStartMessage")
protected Ip996011ProgramStartMessage ip996011ProgramStartMessage;
@Autowired 
  @Qualifier("ip081110")
protected Ip081110 ip081110;
@Autowired 
  @Qualifier("ip610010")
protected Ip610010 ip610010;
@Autowired 
  @Qualifier("global_ip08101RunControlRecord")
protected Ip08101RunControlRecord ip08101RunControlRecord;
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
}
