package com.cloudframe.app.process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.global.shared.file.IpmFile;
import com.cloudframe.app.global.shared.file.records.IpmMessage;
import com.cloudframe.app.global.sharedvar.Ip66102IpmFileInformation;
import com.cloudframe.app.global.sharedvar.Ip66102IpmMsg;
public class CommonProcess extends BaseProcess {
@Autowired 
  @Qualifier("global_ipmFile")
protected IpmFile ipmFile;
@Autowired 
  @Qualifier("global_ipmMessage")
protected IpmMessage ipmMessage;
@Autowired 
  @Qualifier("global_ip66102IpmFileInformation")
protected Ip66102IpmFileInformation ip66102IpmFileInformation;
@Autowired 
  @Qualifier("global_ip66102IpmMsg")
protected Ip66102IpmMsg ip66102IpmMsg;
}
