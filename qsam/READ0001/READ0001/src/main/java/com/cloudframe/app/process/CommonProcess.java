package com.cloudframe.app.process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.global.shared.file.XmlIn;
import com.cloudframe.app.global.shared.file.records.XmlRecord;
import com.cloudframe.app.global.sharedvar.MiscData;
public class CommonProcess extends BaseProcess {
@Autowired 
  @Qualifier("global_xmlIn")
protected XmlIn xmlIn;
@Autowired 
  @Qualifier("global_xmlRecord")
protected XmlRecord xmlRecord;
@Autowired 
  @Qualifier("global_miscData")
protected MiscData miscData;
}
