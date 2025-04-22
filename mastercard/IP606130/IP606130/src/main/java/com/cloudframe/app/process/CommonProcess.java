package com.cloudframe.app.process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.global.sharedvar.Ip67002DateParm;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
public class CommonProcess extends BaseProcess {
@Autowired 
  @Qualifier("global_ip67002DateParm")
protected Ip67002DateParm ip67002DateParm;
@Autowired 
  @Qualifier("global_ip996011ProgramStartMessage")
protected Ip996011ProgramStartMessage ip996011ProgramStartMessage;
}
