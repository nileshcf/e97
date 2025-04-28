package com.cloudframe.app.process.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.process.*;
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
  @Qualifier("ip708020")
protected Ip708020 ip708020;
@Autowired 
  @Qualifier("ip648010")
protected Ip648010 ip648010;
@Autowired 
  @Qualifier("ip599810")
protected Ip599810 ip599810;
}
