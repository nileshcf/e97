package com.cloudframe.app.process.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.process.*;
public class CommonProcess extends BaseProcess {
@Autowired 
  @Qualifier("ip650010")
protected Ip650010 ip650010;
@Autowired 
  @Qualifier("ip299010")
protected Ip299010 ip299010;
}
