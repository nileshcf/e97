package com.cloudframe.app.process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.global.sharedvar.Ip65504CurrentTagTable;
import com.cloudframe.app.global.sharedvar.Ip65504TcntGroup;
import com.cloudframe.app.global.sharedvar.Ip65504MessageStatusGroup;
import com.cloudframe.app.global.sharedvar.Ip65504SelElemEntriesAll;
import com.cloudframe.app.global.sharedvar.Ip65504TaggedRecordInfo;
import com.cloudframe.app.global.sharedvar.Ip65504DeMapGroup;
import com.cloudframe.app.global.sharedvar.Ip65504SelPdsEntriesAll;
import com.cloudframe.app.global.sharedvar.Ip65504PdsMapGroup;
import com.cloudframe.app.global.sharedvar.AdditionalSyntaxChecksGroup100;
import com.cloudframe.app.global.sharedvar.Ip00321EditListRec;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
public class CommonProcess extends BaseProcess {
@Autowired 
  @Qualifier("ip996010")
protected Ip996010 ip996010;
@Autowired 
  @Qualifier("ip610010")
protected Ip610010 ip610010;
@Autowired 
  @Qualifier("global_ip60001EventLogWorkArea")
protected Ip60001EventLogWorkArea ip60001EventLogWorkArea;
@Autowired 
  @Qualifier("global_ip65504CurrentTagTable")
protected Ip65504CurrentTagTable ip65504CurrentTagTable;
@Autowired 
  @Qualifier("global_ip65504TcntGroup")
protected Ip65504TcntGroup ip65504TcntGroup;
@Autowired 
  @Qualifier("global_ip65504MessageStatusGroup")
protected Ip65504MessageStatusGroup ip65504MessageStatusGroup;
@Autowired 
  @Qualifier("global_ip65504SelElemEntriesAll")
protected Ip65504SelElemEntriesAll ip65504SelElemEntriesAll;
@Autowired 
  @Qualifier("global_ip65504TaggedRecordInfo")
protected Ip65504TaggedRecordInfo ip65504TaggedRecordInfo;
@Autowired 
  @Qualifier("global_ip65504DeMapGroup")
protected Ip65504DeMapGroup ip65504DeMapGroup;
@Autowired 
  @Qualifier("global_ip65504SelPdsEntriesAll")
protected Ip65504SelPdsEntriesAll ip65504SelPdsEntriesAll;
@Autowired 
  @Qualifier("global_ip65504PdsMapGroup")
protected Ip65504PdsMapGroup ip65504PdsMapGroup;
@Autowired 
  @Qualifier("global_additionalSyntaxChecksGroup100")
protected AdditionalSyntaxChecksGroup100 additionalSyntaxChecksGroup100;
@Autowired 
  @Qualifier("global_ip00321EditListRec")
protected Ip00321EditListRec ip00321EditListRec;
@Autowired 
  @Qualifier("global_ip996011ProgramStartMessage")
protected Ip996011ProgramStartMessage ip996011ProgramStartMessage;
}
