package com.cloudframe.app.process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.global.sharedvar.Si583ParserArea;
public class CommonProcess extends BaseProcess {
@Autowired 
  @Qualifier("global_si583ParserArea")
protected Si583ParserArea si583ParserArea;
}
