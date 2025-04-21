package com.cloudframe.app.process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
import com.cloudframe.app.global.sharedvar.Ip02014PrcssAgrmtTable;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.global.sharedvar.Ip02015PrcssAgrmtTable;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
public class CommonProcess extends BaseProcess {
@Autowired 
  @Qualifier("ip996010")
protected Ip996010 ip996010;
@Autowired 
  @Qualifier("ip610010")
protected Ip610010 ip610010;
@Autowired 
  @Qualifier("global_ip50005ClearingDtTm")
protected Ip50005ClearingDtTm ip50005ClearingDtTm;
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
  @Qualifier("global_ip60001EventLogWorkArea")
protected Ip60001EventLogWorkArea ip60001EventLogWorkArea;
@Autowired 
  @Qualifier("global_ip02015PrcssAgrmtTable")
protected Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable;
@Autowired 
  @Qualifier("global_ip996011ProgramStartMessage")
protected Ip996011ProgramStartMessage ip996011ProgramStartMessage;
@Autowired 
  @Qualifier("ip282210")
protected Ip282210 ip282210;
}
