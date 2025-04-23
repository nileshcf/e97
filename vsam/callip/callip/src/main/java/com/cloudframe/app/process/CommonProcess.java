package com.cloudframe.app.process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.global.sharedvar.CurrentTableKey800;
import com.cloudframe.app.global.sharedvar.Ip65504CurrentTagTable;
import com.cloudframe.app.global.sharedvar.Ip65504TcntGroup;
import com.cloudframe.app.global.sharedvar.Ip65504MessageStatusGroup;
import com.cloudframe.app.global.sharedvar.Ip65504SelElemEntriesAll;
import com.cloudframe.app.global.sharedvar.Ip65504TaggedRecordInfo;
import com.cloudframe.app.global.sharedvar.Ip66102IpmFileInformation;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
import com.cloudframe.app.global.sharedvar.Ip00054TableEntry;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.global.sharedvar.Ip66102IpmMsg;
import com.cloudframe.app.global.sharedvar.Ip000604DeAttrTable;
import com.cloudframe.app.global.sharedvar.Ip000704DeSubAttrTable;
import com.cloudframe.app.global.sharedvar.Ip000804PdsAttributes;
import com.cloudframe.app.global.sharedvar.Ip000904PdsSubAttrTable;
import com.cloudframe.app.global.sharedvar.Ip000608ProcessingDateTimeGroup;
public class CommonProcess extends BaseProcess {
@Autowired 
  @Qualifier("ip650010")
protected Ip650010 ip650010;
@Autowired 
  @Qualifier("global_currentTableKey800")
protected CurrentTableKey800 currentTableKey800;
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
  @Qualifier("global_ip66102IpmFileInformation")
protected Ip66102IpmFileInformation ip66102IpmFileInformation;
@Autowired 
  @Qualifier("global_ip50005OneDayRecLthGroup")
protected Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup;
@Autowired 
  @Qualifier("global_ip50005OneDayRec")
protected Ip50005OneDayRec ip50005OneDayRec;
@Autowired 
  @Qualifier("global_ip50005OneDayReadStatusGroup")
protected Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup;
@Autowired 
  @Qualifier("global_ip50005ClearingDtTm")
protected Ip50005ClearingDtTm ip50005ClearingDtTm;
@Autowired 
  @Qualifier("global_ip00054TableEntry")
protected Ip00054TableEntry ip00054TableEntry;
@Autowired 
  @Qualifier("global_ip60001EventLogWorkArea")
protected Ip60001EventLogWorkArea ip60001EventLogWorkArea;
@Autowired 
  @Qualifier("global_ip996011ProgramStartMessage")
protected Ip996011ProgramStartMessage ip996011ProgramStartMessage;
@Autowired 
  @Qualifier("global_ip66102IpmMsg")
protected Ip66102IpmMsg ip66102IpmMsg;
@Autowired 
  @Qualifier("global_ip000604DeAttrTable")
protected Ip000604DeAttrTable ip000604DeAttrTable;
@Autowired 
  @Qualifier("global_ip000704DeSubAttrTable")
protected Ip000704DeSubAttrTable ip000704DeSubAttrTable;
@Autowired 
  @Qualifier("global_ip000804PdsAttributes")
protected Ip000804PdsAttributes ip000804PdsAttributes;
@Autowired 
  @Qualifier("global_ip000904PdsSubAttrTable")
protected Ip000904PdsSubAttrTable ip000904PdsSubAttrTable;
@Autowired 
  @Qualifier("global_ip000608ProcessingDateTimeGroup")
protected Ip000608ProcessingDateTimeGroup ip000608ProcessingDateTimeGroup;
@Autowired 
  @Qualifier("ip299010")
protected Ip299010 ip299010;
}
