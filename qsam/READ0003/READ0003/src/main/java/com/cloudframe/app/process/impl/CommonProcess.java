package com.cloudframe.app.process.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.process.*;
import com.cloudframe.app.global.shared.file.IpmFile;
public class CommonProcess extends BaseProcess {
@Autowired 
  @Qualifier("global_ipmFile")
protected IpmFile ipmFile;
}
