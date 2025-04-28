package com.cloudframe.app.process.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.process.*;
public class CommonProcess extends BaseProcess {
@Autowired 
  @Qualifier("ip996010")
protected Ip996010 ip996010;
@Autowired 
  @Qualifier("ip610010")
protected Ip610010 ip610010;
}
