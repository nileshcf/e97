package com.cloudframe.app.process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.global.sharedvar.Ip66607SortInfo;
import com.cloudframe.app.global.sharedvar.Ip66601UserTagInformation;
public class CommonProcess extends BaseProcess {
@Autowired 
  @Qualifier("global_ip66607SortInfo")
protected Ip66607SortInfo ip66607SortInfo;
@Autowired 
  @Qualifier("global_ip66601UserTagInformation")
protected Ip66601UserTagInformation ip66601UserTagInformation;
}
