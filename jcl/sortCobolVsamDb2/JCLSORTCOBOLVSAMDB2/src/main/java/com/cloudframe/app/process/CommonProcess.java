package com.cloudframe.app.process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.global.sharedvar.HoldIrdTable500;
import com.cloudframe.app.global.sharedvar.IrdExtrFileRec800;
public class CommonProcess extends BaseProcess {
@Autowired 
  @Qualifier("global_holdIrdTable500")
protected HoldIrdTable500 holdIrdTable500;
@Autowired 
  @Qualifier("global_irdExtrFileRec800")
protected IrdExtrFileRec800 irdExtrFileRec800;
}
