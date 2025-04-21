package com.cloudframe.app.process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.global.sharedvar.Ip30331FinAddndmEntries;
import com.cloudframe.app.global.sharedvar.McIpmMsg;
public class CommonProcess extends BaseProcess {
@Autowired 
  @Qualifier("global_ip30331FinAddndmEntries")
protected Ip30331FinAddndmEntries ip30331FinAddndmEntries;
@Autowired 
  @Qualifier("global_mcIpmMsg")
protected McIpmMsg mcIpmMsg;
}
