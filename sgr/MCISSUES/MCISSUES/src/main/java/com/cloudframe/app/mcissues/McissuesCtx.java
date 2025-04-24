package com.cloudframe.app.mcissues;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.global.sharedvar.Ip31021SummaryControlCard;
import com.cloudframe.app.global.sharedvar.Ip2ooo1EditWorkRecord;
import com.cloudframe.app.mcissues.dto.MapRow1ValGroup800;
import com.cloudframe.app.mcissues.dto.A;
import com.cloudframe.app.mcissues.dto.Ip500041Rec;
import com.cloudframe.app.global.sharedvar.Ip2ooo1ErrorIndex;
import com.cloudframe.app.mcissues.dto.C;
import com.cloudframe.app.mcissues.dto.Ip00485MemberEntry;
import com.cloudframe.app.global.sharedvar.Ip66102IpmMsg;
import com.cloudframe.app.mcissues.dto.InxBGroup;
import com.cloudframe.app.mcissues.dto.Report1HeadingLine11701;
import com.cloudframe.app.mcissues.dto.PreEditVersionGroup300;
import com.cloudframe.app.global.sharedvar.Ip40004IntMsgHdrRecGroup;
import com.cloudframe.app.mcissues.dto.Ip33701TargetCurExp9Group;
import com.cloudframe.app.global.sharedvar.Ip3oo8o1EditsPerfTbl;
import com.cloudframe.app.mcissues.dto.Grp1;
import com.cloudframe.app.mcissues.dto.Holidays500;
import com.cloudframe.app.mcissues.dto.Ip43501ErrorInfoRec;
import com.cloudframe.app.mcissues.dto.Ip90354MasterRec;
import com.cloudframe.app.mcissues.dto.Sys295EffDateGroup;
import com.cloudframe.app.mcissues.dto.ErrorInfoTableDefault315;
import com.cloudframe.app.mcissues.dto.SortKeyLthTable700;
import com.cloudframe.app.global.sharedvar.Cf20004TableData;
import com.cloudframe.app.mcissues.dto.PeVersionNumMsg600;
import com.cloudframe.app.mcissues.dto.DtlRecord3800;
import com.cloudframe.app.mcissues.dto.Ip66601UserTagInformation;
import com.cloudframe.app.mcissues.dto.InputVars800;
import com.cloudframe.app.mcissues.dto.ClearingDtTm9ShortGrp900;
import com.cloudframe.app.global.sharedvar.Ip40004FileIdFinan;
import com.cloudframe.app.global.sharedvar.Cf50005ClearingGrp;
import com.cloudframe.app.mcissues.dto.EmptyIndexGroup800;
import com.cloudframe.app.mcissues.dto.Group;
import com.cloudframe.app.mcissues.dto.DtlCnt800;
import com.cloudframe.app.mcissues.dto.TableArray;
import com.cloudframe.app.global.sharedvar.Ip655o4TcntGroup;
import com.cloudframe.app.mcissues.dto.AbBusslBussiValues800;
import com.cloudframe.app.global.sharedvar.Ip2ooo1ErrorInfoTable;
import com.cloudframe.app.mcissues.dto.Ip66601UserTag;
import com.cloudframe.app.mcissues.dto.Date2;
import com.cloudframe.app.global.sharedvar.Ip655o4CurrentTagTable;
import com.cloudframe.app.mcissues.dto.DtlRecord4800;
import com.cloudframe.app.mcissues.dto.ClearingDtTm9Grp900;
import com.cloudframe.app.mcissues.dto.Ip00485MemberEntryInfo;
import com.cloudframe.app.mcissues.dto.InterimDateXGroup800;
import com.cloudframe.app.mcissues.dto.Ip503011TblEffDateRecord;
import com.cloudframe.app.mcissues.dto.Work;


@Context
public class McissuesCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Ip90354MasterRec ip90354MasterRec;
    AbBusslBussiValues800 abBusslBussiValues800;
    ErrorInfoTableDefault315 errorInfoTableDefault315;
    Ip655o4TcntGroup ip655o4TcntGroup;
    Date2 date2;
    Ip655o4CurrentTagTable ip655o4CurrentTagTable;
    InxBGroup inxBGroup;
    SortKeyLthTable700 sortKeyLthTable700;
    Ip66102IpmMsg ip66102IpmMsg;
    EmptyIndexGroup800 emptyIndexGroup800;
    Sys295EffDateGroup sys295EffDateGroup;
    Cf20004TableData cf20004TableData;
    A a;
    Holidays500 holidays500;
    Ip500041Rec ip500041Rec;
    DtlRecord3800 dtlRecord3800;
    Ip2ooo1EditWorkRecord ip2ooo1EditWorkRecord;
    C c;
    Ip31021SummaryControlCard ip31021SummaryControlCard;
    DtlCnt800 dtlCnt800;
    MapRow1ValGroup800 mapRow1ValGroup800;
    InterimDateXGroup800 interimDateXGroup800;
    Ip40004IntMsgHdrRecGroup ip40004IntMsgHdrRecGroup;
    Ip66601UserTagInformation ip66601UserTagInformation;
    Ip43501ErrorInfoRec ip43501ErrorInfoRec;
    PreEditVersionGroup300 preEditVersionGroup300;
    Ip503011TblEffDateRecord ip503011TblEffDateRecord;
    DtlRecord4800 dtlRecord4800;
    PeVersionNumMsg600 peVersionNumMsg600;
    InputVars800 inputVars800;
    Ip33701TargetCurExp9Group ip33701TargetCurExp9Group;
    ClearingDtTm9Grp900 clearingDtTm9Grp900;
    Work work;
    Grp1 grp1;
    Group group;
    Ip3oo8o1EditsPerfTbl ip3oo8o1EditsPerfTbl;
    ClearingDtTm9ShortGrp900 clearingDtTm9ShortGrp900;
    Cf50005ClearingGrp cf50005ClearingGrp;
    Ip00485MemberEntryInfo ip00485MemberEntryInfo;
    TableArray tableArray;

    int dtlIdx;
    int ip66601UserEnd;
    int ip3oo8o1Idx;
    int subIdx400;
    int ip00485MemberIdx;
    int ip655o4T;
    int ip66601UserRight;
    int inxC;
    int ip66601UserMedian;
    int inxA;
    int index800;
    int holidayIndex500;
    int ip66601UserLeft;
    int ip66601UserStart;
    int ip66601UserP;
    int ip66601UserT;
    int inxD;

    private int rc;

    public GlobalExecutorCtx getGlobalCtx() {
            return globalCtx;
    }

    public void setGlobalCtx(GlobalExecutorCtx globalCtx) {
        this.globalCtx = globalCtx;
    }

    public int getRc() {
        return this.rc;
    }

    public void setRc(int rc) {
        this.rc = rc;
    }



    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }


    public Ip90354MasterRec getIp90354MasterRec() {
        if (ip90354MasterRec == null) {
            ip90354MasterRec = new Ip90354MasterRec();
        }

        return ip90354MasterRec;
    }

    public void setIp90354MasterRec(Ip90354MasterRec ip90354MasterRec) {
        this.ip90354MasterRec = ip90354MasterRec;
    }
    public AbBusslBussiValues800 getAbBusslBussiValues800() {
        if (abBusslBussiValues800 == null) {
            abBusslBussiValues800 = new AbBusslBussiValues800();
        }

        return abBusslBussiValues800;
    }

    public void setAbBusslBussiValues800(AbBusslBussiValues800 abBusslBussiValues800) {
        this.abBusslBussiValues800 = abBusslBussiValues800;
    }
    public ErrorInfoTableDefault315 getErrorInfoTableDefault315() {
        if (errorInfoTableDefault315 == null) {
            errorInfoTableDefault315 = new ErrorInfoTableDefault315();
        }

        return errorInfoTableDefault315;
    }

    public void setErrorInfoTableDefault315(ErrorInfoTableDefault315 errorInfoTableDefault315) {
        this.errorInfoTableDefault315 = errorInfoTableDefault315;
    }
    public Ip655o4TcntGroup getIp655o4TcntGroup() {
        if (ip655o4TcntGroup == null) {
            ip655o4TcntGroup = globalCtx.getGlobalDto(Ip655o4TcntGroup.class);
        }

        return ip655o4TcntGroup;
    }

    public Date2 getDate2() {
        if (date2 == null) {
            date2 = new Date2();
        }

        return date2;
    }

    public void setDate2(Date2 date2) {
        this.date2 = date2;
    }
    public Ip655o4CurrentTagTable getIp655o4CurrentTagTable() {
        if (ip655o4CurrentTagTable == null) {
            ip655o4CurrentTagTable = globalCtx.getGlobalDto(Ip655o4CurrentTagTable.class);
        }

        return ip655o4CurrentTagTable;
    }

    public InxBGroup getInxBGroup() {
        if (inxBGroup == null) {
            inxBGroup = new InxBGroup();
        }

        return inxBGroup;
    }

    public void setInxBGroup(InxBGroup inxBGroup) {
        this.inxBGroup = inxBGroup;
    }
    public SortKeyLthTable700 getSortKeyLthTable700() {
        if (sortKeyLthTable700 == null) {
            sortKeyLthTable700 = new SortKeyLthTable700();
        }

        return sortKeyLthTable700;
    }

    public void setSortKeyLthTable700(SortKeyLthTable700 sortKeyLthTable700) {
        this.sortKeyLthTable700 = sortKeyLthTable700;
    }
    public Ip66102IpmMsg getIp66102IpmMsg() {
        if (ip66102IpmMsg == null) {
            ip66102IpmMsg = globalCtx.getGlobalDto(Ip66102IpmMsg.class);
        }

        return ip66102IpmMsg;
    }

    public EmptyIndexGroup800 getEmptyIndexGroup800() {
        if (emptyIndexGroup800 == null) {
            emptyIndexGroup800 = new EmptyIndexGroup800();
        }

        return emptyIndexGroup800;
    }

    public void setEmptyIndexGroup800(EmptyIndexGroup800 emptyIndexGroup800) {
        this.emptyIndexGroup800 = emptyIndexGroup800;
    }
    public Sys295EffDateGroup getSys295EffDateGroup() {
        if (sys295EffDateGroup == null) {
            sys295EffDateGroup = new Sys295EffDateGroup();
        }

        return sys295EffDateGroup;
    }

    public void setSys295EffDateGroup(Sys295EffDateGroup sys295EffDateGroup) {
        this.sys295EffDateGroup = sys295EffDateGroup;
    }
    public Cf20004TableData getCf20004TableData() {
        if (cf20004TableData == null) {
            cf20004TableData = globalCtx.getGlobalDto(Cf20004TableData.class);
        }

        return cf20004TableData;
    }

    public A getA() {
        if (a == null) {
            a = new A();
        }

        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
    public Holidays500 getHolidays500() {
        if (holidays500 == null) {
            holidays500 = new Holidays500();
        }

        return holidays500;
    }

    public void setHolidays500(Holidays500 holidays500) {
        this.holidays500 = holidays500;
    }
    public Ip500041Rec getIp500041Rec() {
        if (ip500041Rec == null) {
            ip500041Rec = new Ip500041Rec();
        }

        return ip500041Rec;
    }

    public void setIp500041Rec(Ip500041Rec ip500041Rec) {
        this.ip500041Rec = ip500041Rec;
    }
    public DtlRecord3800 getDtlRecord3800() {
        if (dtlRecord3800 == null) {
            dtlRecord3800 = new DtlRecord3800();
        }

        return dtlRecord3800;
    }

    public void setDtlRecord3800(DtlRecord3800 dtlRecord3800) {
        this.dtlRecord3800 = dtlRecord3800;
    }
    public Ip2ooo1EditWorkRecord getIp2ooo1EditWorkRecord() {
        if (ip2ooo1EditWorkRecord == null) {
            ip2ooo1EditWorkRecord = globalCtx.getGlobalDto(Ip2ooo1EditWorkRecord.class);
        }

        return ip2ooo1EditWorkRecord;
    }

    public C getC() {
        if (c == null) {
            c = new C();
        }

        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
    public Ip31021SummaryControlCard getIp31021SummaryControlCard() {
        if (ip31021SummaryControlCard == null) {
            ip31021SummaryControlCard = globalCtx.getGlobalDto(Ip31021SummaryControlCard.class);
        }

        return ip31021SummaryControlCard;
    }

    public DtlCnt800 getDtlCnt800() {
        if (dtlCnt800 == null) {
            dtlCnt800 = new DtlCnt800();
        }

        return dtlCnt800;
    }

    public void setDtlCnt800(DtlCnt800 dtlCnt800) {
        this.dtlCnt800 = dtlCnt800;
    }
    public MapRow1ValGroup800 getMapRow1ValGroup800() {
        if (mapRow1ValGroup800 == null) {
            mapRow1ValGroup800 = new MapRow1ValGroup800();
        }

        return mapRow1ValGroup800;
    }

    public void setMapRow1ValGroup800(MapRow1ValGroup800 mapRow1ValGroup800) {
        this.mapRow1ValGroup800 = mapRow1ValGroup800;
    }
    public InterimDateXGroup800 getInterimDateXGroup800() {
        if (interimDateXGroup800 == null) {
            interimDateXGroup800 = new InterimDateXGroup800();
        }

        return interimDateXGroup800;
    }

    public void setInterimDateXGroup800(InterimDateXGroup800 interimDateXGroup800) {
        this.interimDateXGroup800 = interimDateXGroup800;
    }
    public Ip40004IntMsgHdrRecGroup getIp40004IntMsgHdrRecGroup() {
        if (ip40004IntMsgHdrRecGroup == null) {
            ip40004IntMsgHdrRecGroup = globalCtx.getGlobalDto(Ip40004IntMsgHdrRecGroup.class);
        }

        return ip40004IntMsgHdrRecGroup;
    }

    public Ip66601UserTagInformation getIp66601UserTagInformation() {
        if (ip66601UserTagInformation == null) {
            ip66601UserTagInformation = new Ip66601UserTagInformation();
        }

        return ip66601UserTagInformation;
    }

    public void setIp66601UserTagInformation(Ip66601UserTagInformation ip66601UserTagInformation) {
        this.ip66601UserTagInformation = ip66601UserTagInformation;
    }
    public Ip43501ErrorInfoRec getIp43501ErrorInfoRec() {
        if (ip43501ErrorInfoRec == null) {
            ip43501ErrorInfoRec = new Ip43501ErrorInfoRec();
        }

        return ip43501ErrorInfoRec;
    }

    public void setIp43501ErrorInfoRec(Ip43501ErrorInfoRec ip43501ErrorInfoRec) {
        this.ip43501ErrorInfoRec = ip43501ErrorInfoRec;
    }
    public PreEditVersionGroup300 getPreEditVersionGroup300() {
        if (preEditVersionGroup300 == null) {
            preEditVersionGroup300 = new PreEditVersionGroup300();
        }

        return preEditVersionGroup300;
    }

    public void setPreEditVersionGroup300(PreEditVersionGroup300 preEditVersionGroup300) {
        this.preEditVersionGroup300 = preEditVersionGroup300;
    }
    public Ip503011TblEffDateRecord getIp503011TblEffDateRecord() {
        if (ip503011TblEffDateRecord == null) {
            ip503011TblEffDateRecord = new Ip503011TblEffDateRecord();
        }

        return ip503011TblEffDateRecord;
    }

    public void setIp503011TblEffDateRecord(Ip503011TblEffDateRecord ip503011TblEffDateRecord) {
        this.ip503011TblEffDateRecord = ip503011TblEffDateRecord;
    }
    public DtlRecord4800 getDtlRecord4800() {
        if (dtlRecord4800 == null) {
            dtlRecord4800 = new DtlRecord4800();
        }

        return dtlRecord4800;
    }

    public void setDtlRecord4800(DtlRecord4800 dtlRecord4800) {
        this.dtlRecord4800 = dtlRecord4800;
    }
    public PeVersionNumMsg600 getPeVersionNumMsg600() {
        if (peVersionNumMsg600 == null) {
            peVersionNumMsg600 = new PeVersionNumMsg600();
        }

        return peVersionNumMsg600;
    }

    public void setPeVersionNumMsg600(PeVersionNumMsg600 peVersionNumMsg600) {
        this.peVersionNumMsg600 = peVersionNumMsg600;
    }
    public InputVars800 getInputVars800() {
        if (inputVars800 == null) {
            inputVars800 = new InputVars800();
        }

        return inputVars800;
    }

    public void setInputVars800(InputVars800 inputVars800) {
        this.inputVars800 = inputVars800;
    }
    public Ip33701TargetCurExp9Group getIp33701TargetCurExp9Group() {
        if (ip33701TargetCurExp9Group == null) {
            ip33701TargetCurExp9Group = new Ip33701TargetCurExp9Group();
        }

        return ip33701TargetCurExp9Group;
    }

    public void setIp33701TargetCurExp9Group(Ip33701TargetCurExp9Group ip33701TargetCurExp9Group) {
        this.ip33701TargetCurExp9Group = ip33701TargetCurExp9Group;
    }
    public ClearingDtTm9Grp900 getClearingDtTm9Grp900() {
        if (clearingDtTm9Grp900 == null) {
            clearingDtTm9Grp900 = new ClearingDtTm9Grp900();
        }

        return clearingDtTm9Grp900;
    }

    public void setClearingDtTm9Grp900(ClearingDtTm9Grp900 clearingDtTm9Grp900) {
        this.clearingDtTm9Grp900 = clearingDtTm9Grp900;
    }
    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
    public Grp1 getGrp1() {
        if (grp1 == null) {
            grp1 = new Grp1();
        }

        return grp1;
    }

    public void setGrp1(Grp1 grp1) {
        this.grp1 = grp1;
    }
    public Group getGroup() {
        if (group == null) {
            group = new Group();
        }

        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
    public Ip3oo8o1EditsPerfTbl getIp3oo8o1EditsPerfTbl() {
        if (ip3oo8o1EditsPerfTbl == null) {
            ip3oo8o1EditsPerfTbl = globalCtx.getGlobalDto(Ip3oo8o1EditsPerfTbl.class);
        }

        return ip3oo8o1EditsPerfTbl;
    }

    public ClearingDtTm9ShortGrp900 getClearingDtTm9ShortGrp900() {
        if (clearingDtTm9ShortGrp900 == null) {
            clearingDtTm9ShortGrp900 = new ClearingDtTm9ShortGrp900();
        }

        return clearingDtTm9ShortGrp900;
    }

    public void setClearingDtTm9ShortGrp900(ClearingDtTm9ShortGrp900 clearingDtTm9ShortGrp900) {
        this.clearingDtTm9ShortGrp900 = clearingDtTm9ShortGrp900;
    }
    public Cf50005ClearingGrp getCf50005ClearingGrp() {
        if (cf50005ClearingGrp == null) {
            cf50005ClearingGrp = globalCtx.getGlobalDto(Cf50005ClearingGrp.class);
        }

        return cf50005ClearingGrp;
    }

    public Ip00485MemberEntryInfo getIp00485MemberEntryInfo() {
        if (ip00485MemberEntryInfo == null) {
            ip00485MemberEntryInfo = new Ip00485MemberEntryInfo();
        }

        return ip00485MemberEntryInfo;
    }

    public void setIp00485MemberEntryInfo(Ip00485MemberEntryInfo ip00485MemberEntryInfo) {
        this.ip00485MemberEntryInfo = ip00485MemberEntryInfo;
    }
    public TableArray getTableArray() {
        if (tableArray == null) {
            tableArray = new TableArray();
        }

        return tableArray;
    }

    public void setTableArray(TableArray tableArray) {
        this.tableArray = tableArray;
    }

    public int getDtlIdx() {
        return dtlIdx;
    }

    public void setDtlIdx(int dtlIdx) {
        this.dtlIdx = dtlIdx;
    }
    public int getIp66601UserEnd() {
        return ip66601UserEnd;
    }

    public void setIp66601UserEnd(int ip66601UserEnd) {
        this.ip66601UserEnd = ip66601UserEnd;
    }
    public int getIp3oo8o1Idx() {
        return ip3oo8o1Idx;
    }

    public void setIp3oo8o1Idx(int ip3oo8o1Idx) {
        this.ip3oo8o1Idx = ip3oo8o1Idx;
    }
    public int getSubIdx400() {
        return subIdx400;
    }

    public void setSubIdx400(int subIdx400) {
        this.subIdx400 = subIdx400;
    }
    public int getIp00485MemberIdx() {
        return ip00485MemberIdx;
    }

    public void setIp00485MemberIdx(int ip00485MemberIdx) {
        this.ip00485MemberIdx = ip00485MemberIdx;
    }
    public int getIp655o4T() {
        return ip655o4T;
    }

    public void setIp655o4T(int ip655o4T) {
        this.ip655o4T = ip655o4T;
    }
    public int getIp66601UserRight() {
        return ip66601UserRight;
    }

    public void setIp66601UserRight(int ip66601UserRight) {
        this.ip66601UserRight = ip66601UserRight;
    }
    public int getInxC() {
        return inxC;
    }

    public void setInxC(int inxC) {
        this.inxC = inxC;
    }
    public int getIp66601UserMedian() {
        return ip66601UserMedian;
    }

    public void setIp66601UserMedian(int ip66601UserMedian) {
        this.ip66601UserMedian = ip66601UserMedian;
    }
    public int getInxA() {
        return inxA;
    }

    public void setInxA(int inxA) {
        this.inxA = inxA;
    }
    public int getIndex800() {
        return index800;
    }

    public void setIndex800(int index800) {
        this.index800 = index800;
    }
    public int getHolidayIndex500() {
        return holidayIndex500;
    }

    public void setHolidayIndex500(int holidayIndex500) {
        this.holidayIndex500 = holidayIndex500;
    }
    public int getIp66601UserLeft() {
        return ip66601UserLeft;
    }

    public void setIp66601UserLeft(int ip66601UserLeft) {
        this.ip66601UserLeft = ip66601UserLeft;
    }
    public int getIp66601UserStart() {
        return ip66601UserStart;
    }

    public void setIp66601UserStart(int ip66601UserStart) {
        this.ip66601UserStart = ip66601UserStart;
    }
    public int getIp66601UserP() {
        return ip66601UserP;
    }

    public void setIp66601UserP(int ip66601UserP) {
        this.ip66601UserP = ip66601UserP;
    }
    public int getIp66601UserT() {
        return ip66601UserT;
    }

    public void setIp66601UserT(int ip66601UserT) {
        this.ip66601UserT = ip66601UserT;
    }
    public int getInxD() {
        return inxD;
    }

    public void setInxD(int inxD) {
        this.inxD = inxD;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip90354MasterRec.hashCode();
        str += abBusslBussiValues800.hashCode();
        str += errorInfoTableDefault315.hashCode();
        str += ip655o4TcntGroup.hashCode();
        str += date2.hashCode();
        str += ip655o4CurrentTagTable.hashCode();
        str += inxBGroup.hashCode();
        str += sortKeyLthTable700.hashCode();
        str += ip66102IpmMsg.hashCode();
        str += emptyIndexGroup800.hashCode();
        str += sys295EffDateGroup.hashCode();
        str += cf20004TableData.hashCode();
        str += a.hashCode();
        str += holidays500.hashCode();
        str += ip500041Rec.hashCode();
        str += dtlRecord3800.hashCode();
        str += ip2ooo1EditWorkRecord.hashCode();
        str += c.hashCode();
        str += ip31021SummaryControlCard.hashCode();
        str += dtlCnt800.hashCode();
        str += mapRow1ValGroup800.hashCode();
        str += interimDateXGroup800.hashCode();
        str += ip40004IntMsgHdrRecGroup.hashCode();
        str += ip66601UserTagInformation.hashCode();
        str += ip43501ErrorInfoRec.hashCode();
        str += preEditVersionGroup300.hashCode();
        str += ip503011TblEffDateRecord.hashCode();
        str += dtlRecord4800.hashCode();
        str += peVersionNumMsg600.hashCode();
        str += inputVars800.hashCode();
        str += ip33701TargetCurExp9Group.hashCode();
        str += clearingDtTm9Grp900.hashCode();
        str += work.hashCode();
        str += grp1.hashCode();
        str += group.hashCode();
        str += ip3oo8o1EditsPerfTbl.hashCode();
        str += clearingDtTm9ShortGrp900.hashCode();
        str += cf50005ClearingGrp.hashCode();
        str += ip00485MemberEntryInfo.hashCode();
        str += tableArray.hashCode();
       return str.hashCode();
    }

    public McissuesCtx clone() {
        McissuesCtx cloneObj = new McissuesCtx();
        cloneObj.ip90354MasterRec = new Ip90354MasterRec();
        cloneObj.ip90354MasterRec.set(ip90354MasterRec.getClonedField());
        cloneObj.abBusslBussiValues800 = new AbBusslBussiValues800();
        cloneObj.abBusslBussiValues800.set(abBusslBussiValues800.getClonedField());
        cloneObj.errorInfoTableDefault315 = new ErrorInfoTableDefault315();
        cloneObj.errorInfoTableDefault315.set(errorInfoTableDefault315.getClonedField());
        cloneObj.ip655o4TcntGroup = new Ip655o4TcntGroup();
        cloneObj.ip655o4TcntGroup.set(ip655o4TcntGroup.getClonedField());
        cloneObj.date2 = new Date2();
        cloneObj.date2.set(date2.getClonedField());
        cloneObj.ip655o4CurrentTagTable = new Ip655o4CurrentTagTable();
        cloneObj.ip655o4CurrentTagTable.set(ip655o4CurrentTagTable.getClonedField());
        cloneObj.inxBGroup = new InxBGroup();
        cloneObj.inxBGroup.set(inxBGroup.getClonedField());
        cloneObj.sortKeyLthTable700 = new SortKeyLthTable700();
        cloneObj.sortKeyLthTable700.set(sortKeyLthTable700.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.emptyIndexGroup800 = new EmptyIndexGroup800();
        cloneObj.emptyIndexGroup800.set(emptyIndexGroup800.getClonedField());
        cloneObj.sys295EffDateGroup = new Sys295EffDateGroup();
        cloneObj.sys295EffDateGroup.set(sys295EffDateGroup.getClonedField());
        cloneObj.cf20004TableData = new Cf20004TableData();
        cloneObj.cf20004TableData.set(cf20004TableData.getClonedField());
        cloneObj.a = new A();
        cloneObj.a.set(a.getClonedField());
        cloneObj.holidays500 = new Holidays500();
        cloneObj.holidays500.set(holidays500.getClonedField());
        cloneObj.ip500041Rec = new Ip500041Rec();
        cloneObj.ip500041Rec.set(ip500041Rec.getClonedField());
        cloneObj.dtlRecord3800 = new DtlRecord3800();
        cloneObj.dtlRecord3800.set(dtlRecord3800.getClonedField());
        cloneObj.ip2ooo1EditWorkRecord = new Ip2ooo1EditWorkRecord();
        cloneObj.ip2ooo1EditWorkRecord.set(ip2ooo1EditWorkRecord.getClonedField());
        cloneObj.c = new C();
        cloneObj.c.set(c.getClonedField());
        cloneObj.ip31021SummaryControlCard = new Ip31021SummaryControlCard();
        cloneObj.ip31021SummaryControlCard.set(ip31021SummaryControlCard.getClonedField());
        cloneObj.dtlCnt800 = new DtlCnt800();
        cloneObj.dtlCnt800.set(dtlCnt800.getClonedField());
        cloneObj.mapRow1ValGroup800 = new MapRow1ValGroup800();
        cloneObj.mapRow1ValGroup800.set(mapRow1ValGroup800.getClonedField());
        cloneObj.interimDateXGroup800 = new InterimDateXGroup800();
        cloneObj.interimDateXGroup800.set(interimDateXGroup800.getClonedField());
        cloneObj.ip40004IntMsgHdrRecGroup = new Ip40004IntMsgHdrRecGroup();
        cloneObj.ip40004IntMsgHdrRecGroup.set(ip40004IntMsgHdrRecGroup.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.ip43501ErrorInfoRec = new Ip43501ErrorInfoRec();
        cloneObj.ip43501ErrorInfoRec.set(ip43501ErrorInfoRec.getClonedField());
        cloneObj.preEditVersionGroup300 = new PreEditVersionGroup300();
        cloneObj.preEditVersionGroup300.set(preEditVersionGroup300.getClonedField());
        cloneObj.ip503011TblEffDateRecord = new Ip503011TblEffDateRecord();
        cloneObj.ip503011TblEffDateRecord.set(ip503011TblEffDateRecord.getClonedField());
        cloneObj.dtlRecord4800 = new DtlRecord4800();
        cloneObj.dtlRecord4800.set(dtlRecord4800.getClonedField());
        cloneObj.peVersionNumMsg600 = new PeVersionNumMsg600();
        cloneObj.peVersionNumMsg600.set(peVersionNumMsg600.getClonedField());
        cloneObj.inputVars800 = new InputVars800();
        cloneObj.inputVars800.set(inputVars800.getClonedField());
        cloneObj.ip33701TargetCurExp9Group = new Ip33701TargetCurExp9Group();
        cloneObj.ip33701TargetCurExp9Group.set(ip33701TargetCurExp9Group.getClonedField());
        cloneObj.clearingDtTm9Grp900 = new ClearingDtTm9Grp900();
        cloneObj.clearingDtTm9Grp900.set(clearingDtTm9Grp900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.grp1 = new Grp1();
        cloneObj.grp1.set(grp1.getClonedField());
        cloneObj.group = new Group();
        cloneObj.group.set(group.getClonedField());
        cloneObj.ip3oo8o1EditsPerfTbl = new Ip3oo8o1EditsPerfTbl();
        cloneObj.ip3oo8o1EditsPerfTbl.set(ip3oo8o1EditsPerfTbl.getClonedField());
        cloneObj.clearingDtTm9ShortGrp900 = new ClearingDtTm9ShortGrp900();
        cloneObj.clearingDtTm9ShortGrp900.set(clearingDtTm9ShortGrp900.getClonedField());
        cloneObj.cf50005ClearingGrp = new Cf50005ClearingGrp();
        cloneObj.cf50005ClearingGrp.set(cf50005ClearingGrp.getClonedField());
        cloneObj.ip00485MemberEntryInfo = new Ip00485MemberEntryInfo();
        cloneObj.ip00485MemberEntryInfo.set(ip00485MemberEntryInfo.getClonedField());
        cloneObj.tableArray = new TableArray();
        cloneObj.tableArray.set(tableArray.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainSplit0InCtx implements Cloneable {
     Ip90354MasterRec ip90354MasterRec = McissuesCtx.this.getIp90354MasterRec();
     Ip503011TblEffDateRecord ip503011TblEffDateRecord = McissuesCtx.this.getIp503011TblEffDateRecord();
     Sys295EffDateGroup sys295EffDateGroup = McissuesCtx.this.getSys295EffDateGroup();
     Work work = McissuesCtx.this.getWork();
     ErrorInfoTableDefault315 errorInfoTableDefault315 = McissuesCtx.this.getErrorInfoTableDefault315();
     Group group = McissuesCtx.this.getGroup();
     Ip2ooo1EditWorkRecord ip2ooo1EditWorkRecord = McissuesCtx.this.getIp2ooo1EditWorkRecord();

	/**
	 *	Returns the value of ip90354MasterRec
	 *	@return ip90354MasterRec
	 */   
	 public Ip90354MasterRec getIp90354MasterRec() {
   	return ip90354MasterRec;
   }


	/**
	 *	Returns the value of errorInfoTableDefault315
	 *	@return errorInfoTableDefault315
	 */   
	 public ErrorInfoTableDefault315 getErrorInfoTableDefault315() {
   	return errorInfoTableDefault315;
   }


	/**
	 *	Returns the value of four
	 *	@return four
	 */
	public short getFour() throws CFException {        
   		return work.getFour();
	}
	
	/**
	 * 	Update Four with the passed value
	 *	@param number
	 */
	public void setFour(short number)  throws CFException{
		work.setFour(number);
	}

	public void setFour(int number)  throws CFException{
		work.setFour((short)number);
	}

	public void setFour(long number)  throws CFException{
		work.setFour((short)number);
	}



	/**
	 *	Returns the value of sys295EffDate
	 *	@return sys295EffDate
	 */
	public long getSys295EffDate() throws CFException {
   		return sys295EffDateGroup.getSys295EffDate();
	}


	/**
	 *	Returns String value of sys295EffDate
	 *	@return sys295EffDate
	 */
	public char[]  getSys295EffDateString() throws CFException {
	     return String.valueOf(sys295EffDateGroup.getSys295EffDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys295EffDateIsNumeric()  throws CFException{
	    return sys295EffDateGroup.sys295EffDateIsNumeric();
	}

	/**
	 * 	Update Sys295EffDate with the passed value
	 *	@param number
	 */
	public void setSys295EffDate(long number)  throws CFException{
		sys295EffDateGroup.setSys295EffDate(number);
	}
	

	
	/**
	 * 	Update Sys295EffDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys295EffDate(char[] value)  throws CFException {
		sys295EffDateGroup.setSys295EffDate(value);
	}
	
	/**
	 * 	Update Sys295EffDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys295EffDateString(char[] value)  throws CFException{
		sys295EffDateGroup.setSys295EffDate(value);
	}	

	/**
	 *	Returns the value of display
	 *	@return display
	 */
   public char[] getDisplay() throws CFException  {              
   		return work.getDisplay();
   }

  
	/**
	*  set variable display
	*  @param value
	**/
   public void setDisplay(char[] value) throws CFException {
      work.setDisplay(value);
   } 

	/**
	 *	Returns the value of ip503011TblEffDateRecord
	 *	@return ip503011TblEffDateRecord
	 */   
	 public Ip503011TblEffDateRecord getIp503011TblEffDateRecord() {
   	return ip503011TblEffDateRecord;
   }


	/**
	 *	Returns the value of two
	 *	@return two
	 */
	public short getTwo() throws CFException {        
   		return work.getTwo();
	}
	
	/**
	 * 	Update Two with the passed value
	 *	@param number
	 */
	public void setTwo(short number)  throws CFException{
		work.setTwo(number);
	}

	public void setTwo(int number)  throws CFException{
		work.setTwo((short)number);
	}

	public void setTwo(long number)  throws CFException{
		work.setTwo((short)number);
	}



	/**
	 *	Returns the value of group
	 *	@return group
	 */   
	 public Group getGroup() {
   	return group;
   }


	/**
	 *	Returns the value of one
	 *	@return one
	 */
	public short getOne() throws CFException {        
   		return work.getOne();
	}
	
	/**
	 * 	Update One with the passed value
	 *	@param number
	 */
	public void setOne(short number)  throws CFException{
		work.setOne(number);
	}

	public void setOne(int number)  throws CFException{
		work.setOne((short)number);
	}

	public void setOne(long number)  throws CFException{
		work.setOne((short)number);
	}



	/**
	 *	Returns the value of dateWs
	 *	@return dateWs
	 */
	public long getDateWs() throws CFException {
   		return work.getDateWs();
	}


	/**
	 *	Returns String value of dateWs
	 *	@return dateWs
	 */
	public char[]  getDateWsString() throws CFException {
	     return String.valueOf(work.getDateWsString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dateWsIsNumeric()  throws CFException{
	    return work.dateWsIsNumeric();
	}

	/**
	 * 	Update DateWs with the passed value
	 *	@param number
	 */
	public void setDateWs(long number)  throws CFException{
		work.setDateWs(number);
	}
	

	
	/**
	 * 	Update DateWs with the passed value
	 *	@param value (String or char[])
	 */
	public void setDateWs(char[] value)  throws CFException {
		work.setDateWs(value);
	}
	
	/**
	 * 	Update DateWs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDateWsString(char[] value)  throws CFException{
		work.setDateWs(value);
	}	

	/**
	 *	Returns the value of ip2ooo1ErrorInfoTable
	 *	@return ip2ooo1ErrorInfoTable
	 */   
	 public Ip2ooo1ErrorInfoTable getIp2ooo1ErrorInfoTable() {
   	return ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable();
   }

   /**
	* 	Update Ip2ooo1ErrorInfoTable with the passed value
	*	@param value
	*/
   public void setIp2ooo1ErrorInfoTable(char[] value) throws CFException {
      ip2ooo1EditWorkRecord.setIp2ooo1ErrorInfoTable(value);
   }   

     /**
	 * 	Update Ip2ooo1ErrorInfoTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfoTable(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip2ooo1EditWorkRecord.setIp2ooo1ErrorInfoTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip2ooo1ErrorInfoTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfoTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip2ooo1EditWorkRecord.setIp2ooo1ErrorInfoTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip2ooo1ErrorInfoTable with another Field
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfoTable(Field source) {
   	ip2ooo1EditWorkRecord.setIp2ooo1ErrorInfoTable(source);
   }  
   
     /**
	 * 	Update Ip2ooo1ErrorInfoTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfoTable(Field source, int sourceIndex,int sourceLen) {
   	ip2ooo1EditWorkRecord.setIp2ooo1ErrorInfoTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip2ooo1ErrorInfoTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfoTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip2ooo1EditWorkRecord.setIp2ooo1ErrorInfoTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setDtlIdx(int dtlIdx) { 
    McissuesCtx.this.dtlIdx = dtlIdx;
}

public int getDtlIdx() { 
    return McissuesCtx.this.dtlIdx;
}
	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public int getIdx() throws CFException {
   		return work.getIdx();
	}


	/**
	 *	Returns String value of idx
	 *	@return idx
	 */
	public char[]  getIdxString() throws CFException {
	     return String.valueOf(work.getIdxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean idxIsNumeric()  throws CFException{
	    return work.idxIsNumeric();
	}

	/**
	 * 	Update Idx with the passed value
	 *	@param number
	 */
	public void setIdx(int number)  throws CFException{
		work.setIdx(number);
	}
	

	public void setIdx(long number)  throws CFException{
	    work.setIdx(number);
	}
	
	
	/**
	 * 	Update Idx with the passed value
	 *	@param value (String or char[])
	 */
	public void setIdx(char[] value)  throws CFException {
		work.setIdx(value);
	}
	
	/**
	 * 	Update Idx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIdxString(char[] value)  throws CFException{
		work.setIdx(value);
	}	


        public McissuesCtx getMcissuesCtx() {
            return McissuesCtx.this;
        }

        public MainSplit0OutCtx getMainSplit0OutCtx() {
            return new MainSplit0OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip90354MasterRec.hashCode();
        str += ip503011TblEffDateRecord.hashCode();
        str += sys295EffDateGroup.hashCode();
        str += work.hashCode();
        str += errorInfoTableDefault315.hashCode();
        str += group.hashCode();
        str += ip2ooo1EditWorkRecord.hashCode();
       return str.hashCode();
    }

    public MainSplit0InCtx clone() {
        MainSplit0InCtx cloneObj = new MainSplit0InCtx();
        cloneObj.ip90354MasterRec = new Ip90354MasterRec();
        cloneObj.ip90354MasterRec.set(ip90354MasterRec.getClonedField());
        cloneObj.ip503011TblEffDateRecord = new Ip503011TblEffDateRecord();
        cloneObj.ip503011TblEffDateRecord.set(ip503011TblEffDateRecord.getClonedField());
        cloneObj.sys295EffDateGroup = new Sys295EffDateGroup();
        cloneObj.sys295EffDateGroup.set(sys295EffDateGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.errorInfoTableDefault315 = new ErrorInfoTableDefault315();
        cloneObj.errorInfoTableDefault315.set(errorInfoTableDefault315.getClonedField());
        cloneObj.group = new Group();
        cloneObj.group.set(group.getClonedField());
        cloneObj.ip2ooo1EditWorkRecord = new Ip2ooo1EditWorkRecord();
        cloneObj.ip2ooo1EditWorkRecord.set(ip2ooo1EditWorkRecord.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit0InCtx getMainSplit0InCtx() {
            return new MainSplit0InCtx();
    }
     public class MainSplit0OutCtx implements Cloneable {
     Ip90354MasterRec ip90354MasterRec = McissuesCtx.this.getIp90354MasterRec();
     Ip503011TblEffDateRecord ip503011TblEffDateRecord = McissuesCtx.this.getIp503011TblEffDateRecord();
     Sys295EffDateGroup sys295EffDateGroup = McissuesCtx.this.getSys295EffDateGroup();
     Work work = McissuesCtx.this.getWork();
     ErrorInfoTableDefault315 errorInfoTableDefault315 = McissuesCtx.this.getErrorInfoTableDefault315();
     Group group = McissuesCtx.this.getGroup();
     Ip2ooo1EditWorkRecord ip2ooo1EditWorkRecord = McissuesCtx.this.getIp2ooo1EditWorkRecord();

	/**
	 *	Returns the value of ip90354MasterRec
	 *	@return ip90354MasterRec
	 */   
	 public Ip90354MasterRec getIp90354MasterRec() {
   	return ip90354MasterRec;
   }


	/**
	 *	Returns the value of ip90354L1Ctlexclusionind
	 *	@return ip90354L1Ctlexclusionind
	 */
   public char[] getIp90354L1Ctlexclusionind() throws CFException  {              
   		return ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlexclusionind();
   }

  
	/**
	*  set variable ip90354L1Ctlexclusionind
	*  @param value
	**/
   public void setIp90354L1Ctlexclusionind(char[] value) throws CFException {
      ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1Ctlexclusionind(value);
   } 

     /**
	 * 	Update Ip90354L1Ctlexclusionind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp90354L1Ctlexclusionind(char[] source, int sourceIndex) throws CFException {
      ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1Ctlexclusionind(source, sourceIndex);
   	
   }
   
   public void setIp90354L1Ctlexclusionind(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1Ctlexclusionind(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip90354L1Ctlexclusionind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp90354L1Ctlexclusionind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1Ctlexclusionind(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip90354L1Ctlexclusionind with another Field
	 *	@param value
	 */
   public void setIp90354L1Ctlexclusionind(Field source) {
      ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1Ctlexclusionind(source);
   }  
   
     /**
	 * 	Update Ip90354L1Ctlexclusionind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp90354L1Ctlexclusionind(Field source, int sourceIndex,int sourceLen) {
      ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1Ctlexclusionind(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip90354L1Ctlexclusionind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp90354L1Ctlexclusionind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1Ctlexclusionind(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errorInfoTableDefault315
	 *	@return errorInfoTableDefault315
	 */   
	 public ErrorInfoTableDefault315 getErrorInfoTableDefault315() {
   	return errorInfoTableDefault315;
   }


	/**
	 *	Returns the value of ip2ooo1IpmFieldType
	 *	@return ip2ooo1IpmFieldType
	 */
   public char[] getIp2ooo1IpmFieldType(int index) throws CFException  {              
   		return ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().getIp2ooo1IpmFieldType();
   }

  
	/**
	*  set variable ip2ooo1IpmFieldType
	*  @param value
	**/
   public void setIp2ooo1IpmFieldType(int index,char[] value) throws CFException {
      ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().setIp2ooo1IpmFieldType(value);
   } 

     /**
	 * 	Update Ip2ooo1IpmFieldType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp2ooo1IpmFieldType(int index,char[] source, int sourceIndex) throws CFException {
      ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().setIp2ooo1IpmFieldType(source, sourceIndex);
   	
   }
   
   public void setIp2ooo1IpmFieldType(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().setIp2ooo1IpmFieldType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip2ooo1IpmFieldType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp2ooo1IpmFieldType(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().setIp2ooo1IpmFieldType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip2ooo1IpmFieldType with another Field
	 *	@param value
	 */
   public void setIp2ooo1IpmFieldType(int index,Field source) {
      ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().setIp2ooo1IpmFieldType(source);
   }  
   
     /**
	 * 	Update Ip2ooo1IpmFieldType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp2ooo1IpmFieldType(int index,Field source, int sourceIndex,int sourceLen) {
      ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().setIp2ooo1IpmFieldType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip2ooo1IpmFieldType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp2ooo1IpmFieldType(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().setIp2ooo1IpmFieldType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip2ooo1ErrorType
	 *	@return ip2ooo1ErrorType
	 */
	public int getIp2ooo1ErrorType(int index) throws CFException {
   		return ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorType();
	}


	/**
	 *	Returns String value of ip2ooo1ErrorType
	 *	@return ip2ooo1ErrorType
	 */
	public char[]  getIp2ooo1ErrorTypeString(int index) throws CFException {
	     return String.valueOf(ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorTypeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip2ooo1ErrorTypeIsNumeric(int index)  throws CFException{
	    return ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index - 1).ip2ooo1ErrorTypeIsNumeric();
	}

	/**
	 * 	Update Ip2ooo1ErrorType with the passed value
	 *	@param number
	 */
	public void setIp2ooo1ErrorType(int index,int number)  throws CFException{
		ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).setIp2ooo1ErrorType(number);
	}
	

	public void setIp2ooo1ErrorType(int index,long number)  throws CFException{
	    ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).setIp2ooo1ErrorType(number);
	}
	
	
	/**
	 * 	Update Ip2ooo1ErrorType with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp2ooo1ErrorType(int index,char[] value)  throws CFException {
		ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).setIp2ooo1ErrorType(value);
	}
	
	/**
	 * 	Update Ip2ooo1ErrorType with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp2ooo1ErrorTypeString(int index,char[] value)  throws CFException{
		ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).setIp2ooo1ErrorType(value);
	}	

	/**
	 *	Returns the value of ip2ooo1ErrorMsgSevCd
	 *	@return ip2ooo1ErrorMsgSevCd
	 */
	public int getIp2ooo1ErrorMsgSevCd(int index) throws CFException {
   		return ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().getIp2ooo1ErrorIndex().getIp2ooo1ErrorMsgSevCd();
	}


	/**
	 *	Returns String value of ip2ooo1ErrorMsgSevCd
	 *	@return ip2ooo1ErrorMsgSevCd
	 */
	public char[]  getIp2ooo1ErrorMsgSevCdString(int index) throws CFException {
	     return String.valueOf(ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().getIp2ooo1ErrorIndex().getIp2ooo1ErrorMsgSevCdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip2ooo1ErrorMsgSevCdIsNumeric(int index)  throws CFException{
	    return ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index - 1).getIp2ooo1ErrorInfo().getIp2ooo1ErrorIndex().ip2ooo1ErrorMsgSevCdIsNumeric();
	}

	/**
	 * 	Update Ip2ooo1ErrorMsgSevCd with the passed value
	 *	@param number
	 */
	public void setIp2ooo1ErrorMsgSevCd(int index,int number)  throws CFException{
		ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().getIp2ooo1ErrorIndex().setIp2ooo1ErrorMsgSevCd(number);
	}
	

	public void setIp2ooo1ErrorMsgSevCd(int index,long number)  throws CFException{
	    ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().getIp2ooo1ErrorIndex().setIp2ooo1ErrorMsgSevCd(number);
	}
	
	
	/**
	 * 	Update Ip2ooo1ErrorMsgSevCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp2ooo1ErrorMsgSevCd(int index,char[] value)  throws CFException {
		ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().getIp2ooo1ErrorIndex().setIp2ooo1ErrorMsgSevCd(value);
	}
	
	/**
	 * 	Update Ip2ooo1ErrorMsgSevCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp2ooo1ErrorMsgSevCdString(int index,char[] value)  throws CFException{
		ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().getIp2ooo1ErrorIndex().setIp2ooo1ErrorMsgSevCd(value);
	}	

	/**
	 *	Test condition "A" for isCondA()
	 *	@return  Returns true if isCondA() is "A"
	 */
   public boolean isCondA() throws CFException {
      return work.isCondA();
   }

	/**
	*  set values "A"
	*/
   	public void setCondATrue()  throws CFException{  			
    	work.setCondATrue();
   	}
	/**
	 *	Returns the value of display
	 *	@return display
	 */
   public char[] getDisplay() throws CFException  {              
   		return work.getDisplay();
   }

  
	/**
	*  set variable display
	*  @param value
	**/
   public void setDisplay(char[] value) throws CFException {
      work.setDisplay(value);
   } 

	/**
	 *	Test condition "F" for isCondF()
	 *	@return  Returns true if isCondF() is "F"
	 */
   public boolean isCondF() throws CFException {
      return work.isCondF();
   }

	/**
	*  set values "F"
	*/
   	public void setCondFTrue()  throws CFException{  			
    	work.setCondFTrue();
   	}
	/**
	 *	Returns the value of ip90354L1Ctlfunc
	 *	@return ip90354L1Ctlfunc
	 */
	public int getIp90354L1Ctlfunc() throws CFException {
   		return ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlmtifunc().getIp90354L1Ctlfunc();
	}


	/**
	 *	Returns String value of ip90354L1Ctlfunc
	 *	@return ip90354L1Ctlfunc
	 */
	public char[]  getIp90354L1CtlfuncString() throws CFException {
	     return String.valueOf(ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlmtifunc().getIp90354L1CtlfuncString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip90354L1CtlfuncIsNumeric()  throws CFException{
	    return ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlmtifunc().ip90354L1CtlfuncIsNumeric();
	}

	/**
	 * 	Update Ip90354L1Ctlfunc with the passed value
	 *	@param number
	 */
	public void setIp90354L1Ctlfunc(int number)  throws CFException{
		ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlmtifunc().setIp90354L1Ctlfunc(number);
	}
	

	public void setIp90354L1Ctlfunc(long number)  throws CFException{
	    ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlmtifunc().setIp90354L1Ctlfunc(number);
	}
	
	
	/**
	 * 	Update Ip90354L1Ctlfunc with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp90354L1Ctlfunc(char[] value)  throws CFException {
		ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlmtifunc().setIp90354L1Ctlfunc(value);
	}
	
	/**
	 * 	Update Ip90354L1Ctlfunc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp90354L1CtlfuncString(char[] value)  throws CFException{
		ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlmtifunc().setIp90354L1Ctlfunc(value);
	}	

	/**
	 *	Test condition "G" for isCondG()
	 *	@return  Returns true if isCondG() is "G"
	 */
   public boolean isCondG() throws CFException {
      return work.isCondG();
   }

	/**
	*  set values "G"
	*/
   	public void setCondGTrue()  throws CFException{  			
    	work.setCondGTrue();
   	}
	/**
	 *	Returns the value of ip2ooo1IpmSubfldNumber
	 *	@return ip2ooo1IpmSubfldNumber
	 */
	public long getIp2ooo1IpmSubfldNumber(int index) throws CFException {        
   		return ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().getIp2ooo1IpmSubfldNumber();
	}
	
	/**
	 * 	Update Ip2ooo1IpmSubfldNumber with the passed value
	 *	@param number
	 */
	public void setIp2ooo1IpmSubfldNumber(int index,long number)  throws CFException{
		ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().setIp2ooo1IpmSubfldNumber(number);
	}



	/**
	 *	Returns the value of ip90354L1IndFld
	 *	@return ip90354L1IndFld
	 */
	public int getIp90354L1IndFld() throws CFException {        
   		return ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1CtldataInd().getIp90354L1IndFld();
	}
	
	/**
	 * 	Update Ip90354L1IndFld with the passed value
	 *	@param number
	 */
	public void setIp90354L1IndFld(int number)  throws CFException{
		ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1CtldataInd().setIp90354L1IndFld(number);
	}


	public void setIp90354L1IndFld(long number)  throws CFException{
		ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1CtldataInd().setIp90354L1IndFld((int)number);
	}


	/**
	 *	Returns the value of ip2ooo1ReplText
	 *	@return ip2ooo1ReplText
	 */
   public char[] getIp2ooo1ReplText(int index,int index2) throws CFException  {              
   		return ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ReplText(index2);
   }

  
	/**
	*  set variable ip2ooo1ReplText
	*  @param value
	**/
   public void setIp2ooo1ReplText(int index,int index2,char[] value) throws CFException {
      ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).setIp2ooo1ReplText((index2),value);
   } 

	/**
	 *	Returns the value of cond
	 *	@return cond
	 */
   public char[] getCond() throws CFException  {              
   		return work.getCond();
   }

  
	/**
	*  set variable cond
	*  @param value
	**/
   public void setCond(char[] value) throws CFException {
      work.setCond(value);
   } 

	/**
	 *	Returns the value of dateWs
	 *	@return dateWs
	 */
	public long getDateWs() throws CFException {
   		return work.getDateWs();
	}


	/**
	 *	Returns String value of dateWs
	 *	@return dateWs
	 */
	public char[]  getDateWsString() throws CFException {
	     return String.valueOf(work.getDateWsString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dateWsIsNumeric()  throws CFException{
	    return work.dateWsIsNumeric();
	}

	/**
	 * 	Update DateWs with the passed value
	 *	@param number
	 */
	public void setDateWs(long number)  throws CFException{
		work.setDateWs(number);
	}
	

	
	/**
	 * 	Update DateWs with the passed value
	 *	@param value (String or char[])
	 */
	public void setDateWs(char[] value)  throws CFException {
		work.setDateWs(value);
	}
	
	/**
	 * 	Update DateWs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDateWsString(char[] value)  throws CFException{
		work.setDateWs(value);
	}	

	/**
	 *	Returns the value of ip90354L1Ctldata
	 *	@return ip90354L1Ctldata
	 */
   public char[] getIp90354L1Ctldata() throws CFException  {              
   		return ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctldata();
   }

  
	/**
	*  set variable ip90354L1Ctldata
	*  @param value
	**/
   public void setIp90354L1Ctldata(char[] value) throws CFException {
      ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1Ctldata(value);
   } 

     /**
	 * 	Update Ip90354L1Ctldata 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp90354L1Ctldata(char[] source, int sourceIndex) throws CFException {
      ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1Ctldata(source, sourceIndex);
   	
   }
   
   public void setIp90354L1Ctldata(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1Ctldata(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip90354L1Ctldata 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp90354L1Ctldata(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1Ctldata(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip90354L1Ctldata with another Field
	 *	@param value
	 */
   public void setIp90354L1Ctldata(Field source) {
      ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1Ctldata(source);
   }  
   
     /**
	 * 	Update Ip90354L1Ctldata 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp90354L1Ctldata(Field source, int sourceIndex,int sourceLen) {
      ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1Ctldata(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip90354L1Ctldata 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp90354L1Ctldata(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1Ctldata(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "D" for isCondD()
	 *	@return  Returns true if isCondD() is "D"
	 */
   public boolean isCondD() throws CFException {
      return work.isCondD();
   }

	/**
	*  set values "D"
	*/
   	public void setCondDTrue()  throws CFException{  			
    	work.setCondDTrue();
   	}
	/**
	 *	Returns the value of data500
	 *	@return data500
	 */
   public char[] getData500(int index) throws CFException  {              
   		return group.getGroup500(index).getData500();
   }

  
	/**
	*  set variable data500
	*  @param value
	**/
   public void setData500(int index,char[] value) throws CFException {
      group.getGroup500(index).setData500(value);
   } 

     /**
	 * 	Update Data500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setData500(int index,char[] source, int sourceIndex) throws CFException {
      group.getGroup500(index).setData500(source, sourceIndex);
   	
   }
   
   public void setData500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      group.getGroup500(index).setData500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Data500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setData500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      group.getGroup500(index).setData500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Data500 with another Field
	 *	@param value
	 */
   public void setData500(int index,Field source) {
      group.getGroup500(index).setData500(source);
   }  
   
     /**
	 * 	Update Data500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setData500(int index,Field source, int sourceIndex,int sourceLen) {
      group.getGroup500(index).setData500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Data500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setData500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      group.getGroup500(index).setData500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip2ooo1ErrorInfoTable
	 *	@return ip2ooo1ErrorInfoTable
	 */   
	 public Ip2ooo1ErrorInfoTable getIp2ooo1ErrorInfoTable() {
   	return ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable();
   }

   /**
	* 	Update Ip2ooo1ErrorInfoTable with the passed value
	*	@param value
	*/
   public void setIp2ooo1ErrorInfoTable(char[] value) throws CFException {
      ip2ooo1EditWorkRecord.setIp2ooo1ErrorInfoTable(value);
   }   

     /**
	 * 	Update Ip2ooo1ErrorInfoTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfoTable(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip2ooo1EditWorkRecord.setIp2ooo1ErrorInfoTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip2ooo1ErrorInfoTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfoTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip2ooo1EditWorkRecord.setIp2ooo1ErrorInfoTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip2ooo1ErrorInfoTable with another Field
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfoTable(Field source) {
   	ip2ooo1EditWorkRecord.setIp2ooo1ErrorInfoTable(source);
   }  
   
     /**
	 * 	Update Ip2ooo1ErrorInfoTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfoTable(Field source, int sourceIndex,int sourceLen) {
   	ip2ooo1EditWorkRecord.setIp2ooo1ErrorInfoTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip2ooo1ErrorInfoTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfoTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip2ooo1EditWorkRecord.setIp2ooo1ErrorInfoTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip503011TblEffDate
	 *	@return ip503011TblEffDate
	 */
	public long getIp503011TblEffDate() throws CFException {
   		return ip503011TblEffDateRecord.getIp503011TblEffDate();
	}


	/**
	 *	Returns String value of ip503011TblEffDate
	 *	@return ip503011TblEffDate
	 */
	public char[]  getIp503011TblEffDateString() throws CFException {
	     return String.valueOf(ip503011TblEffDateRecord.getIp503011TblEffDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip503011TblEffDateIsNumeric()  throws CFException{
	    return ip503011TblEffDateRecord.ip503011TblEffDateIsNumeric();
	}

	/**
	 * 	Update Ip503011TblEffDate with the passed value
	 *	@param number
	 */
	public void setIp503011TblEffDate(long number)  throws CFException{
		ip503011TblEffDateRecord.setIp503011TblEffDate(number);
	}
	

	
	/**
	 * 	Update Ip503011TblEffDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp503011TblEffDate(char[] value)  throws CFException {
		ip503011TblEffDateRecord.setIp503011TblEffDate(value);
	}
	
	/**
	 * 	Update Ip503011TblEffDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp503011TblEffDateString(char[] value)  throws CFException{
		ip503011TblEffDateRecord.setIp503011TblEffDate(value);
	}	

	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public int getIdx() throws CFException {
   		return work.getIdx();
	}


	/**
	 *	Returns String value of idx
	 *	@return idx
	 */
	public char[]  getIdxString() throws CFException {
	     return String.valueOf(work.getIdxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean idxIsNumeric()  throws CFException{
	    return work.idxIsNumeric();
	}

	/**
	 * 	Update Idx with the passed value
	 *	@param number
	 */
	public void setIdx(int number)  throws CFException{
		work.setIdx(number);
	}
	

	public void setIdx(long number)  throws CFException{
	    work.setIdx(number);
	}
	
	
	/**
	 * 	Update Idx with the passed value
	 *	@param value (String or char[])
	 */
	public void setIdx(char[] value)  throws CFException {
		work.setIdx(value);
	}
	
	/**
	 * 	Update Idx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIdxString(char[] value)  throws CFException{
		work.setIdx(value);
	}	

	/**
	 *	Returns the value of ip90354L1Ctlmti
	 *	@return ip90354L1Ctlmti
	 */
	public int getIp90354L1Ctlmti() throws CFException {
   		return ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlmtifunc().getIp90354L1Ctlmti();
	}


	/**
	 *	Returns String value of ip90354L1Ctlmti
	 *	@return ip90354L1Ctlmti
	 */
	public char[]  getIp90354L1CtlmtiString() throws CFException {
	     return String.valueOf(ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlmtifunc().getIp90354L1CtlmtiString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip90354L1CtlmtiIsNumeric()  throws CFException{
	    return ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlmtifunc().ip90354L1CtlmtiIsNumeric();
	}

	/**
	 * 	Update Ip90354L1Ctlmti with the passed value
	 *	@param number
	 */
	public void setIp90354L1Ctlmti(int number)  throws CFException{
		ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlmtifunc().setIp90354L1Ctlmti(number);
	}
	

	public void setIp90354L1Ctlmti(long number)  throws CFException{
	    ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlmtifunc().setIp90354L1Ctlmti(number);
	}
	
	
	/**
	 * 	Update Ip90354L1Ctlmti with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp90354L1Ctlmti(char[] value)  throws CFException {
		ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlmtifunc().setIp90354L1Ctlmti(value);
	}
	
	/**
	 * 	Update Ip90354L1Ctlmti with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp90354L1CtlmtiString(char[] value)  throws CFException{
		ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlmtifunc().setIp90354L1Ctlmti(value);
	}	

	/**
	 *	Returns the value of ip2ooo1IpmFieldNumber
	 *	@return ip2ooo1IpmFieldNumber
	 */
	public long getIp2ooo1IpmFieldNumber(int index) throws CFException {        
   		return ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().getIp2ooo1IpmFieldNumber();
	}
	
	/**
	 * 	Update Ip2ooo1IpmFieldNumber with the passed value
	 *	@param number
	 */
	public void setIp2ooo1IpmFieldNumber(int index,long number)  throws CFException{
		ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().setIp2ooo1IpmFieldNumber(number);
	}



	/**
	 *	Returns the value of ip90354L1CtlTableType
	 *	@return ip90354L1CtlTableType
	 */
	public int getIp90354L1CtlTableType() throws CFException {
   		return ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1CtlTableType();
	}


	/**
	 *	Returns String value of ip90354L1CtlTableType
	 *	@return ip90354L1CtlTableType
	 */
	public char[]  getIp90354L1CtlTableTypeString() throws CFException {
	     return String.valueOf(ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1CtlTableTypeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip90354L1CtlTableTypeIsNumeric()  throws CFException{
	    return ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().ip90354L1CtlTableTypeIsNumeric();
	}

	/**
	 * 	Update Ip90354L1CtlTableType with the passed value
	 *	@param number
	 */
	public void setIp90354L1CtlTableType(int number)  throws CFException{
		ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1CtlTableType(number);
	}
	

	public void setIp90354L1CtlTableType(long number)  throws CFException{
	    ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1CtlTableType(number);
	}
	
	
	/**
	 * 	Update Ip90354L1CtlTableType with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp90354L1CtlTableType(char[] value)  throws CFException {
		ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1CtlTableType(value);
	}
	
	/**
	 * 	Update Ip90354L1CtlTableType with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp90354L1CtlTableTypeString(char[] value)  throws CFException{
		ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1CtlTableType(value);
	}	

	/**
	 *	Test condition "B" for isCondB()
	 *	@return  Returns true if isCondB() is "B"
	 */
   public boolean isCondB() throws CFException {
      return work.isCondB();
   }

	/**
	*  set values "B"
	*/
   	public void setCondBTrue()  throws CFException{  			
    	work.setCondBTrue();
   	}
	/**
	 *	Returns the value of tmpLth800
	 *	@return tmpLth800
	 */
	public short getTmpLth800() throws CFException {        
   		return work.getTmpLth800();
	}
	
	/**
	 * 	Update TmpLth800 with the passed value
	 *	@param number
	 */
	public void setTmpLth800(short number)  throws CFException{
		work.setTmpLth800(number);
	}

	public void setTmpLth800(int number)  throws CFException{
		work.setTmpLth800((short)number);
	}

	public void setTmpLth800(long number)  throws CFException{
		work.setTmpLth800((short)number);
	}



	/**
	 *	Returns the value of sys295EffDate
	 *	@return sys295EffDate
	 */
	public long getSys295EffDate() throws CFException {
   		return sys295EffDateGroup.getSys295EffDate();
	}


	/**
	 *	Returns String value of sys295EffDate
	 *	@return sys295EffDate
	 */
	public char[]  getSys295EffDateString() throws CFException {
	     return String.valueOf(sys295EffDateGroup.getSys295EffDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys295EffDateIsNumeric()  throws CFException{
	    return sys295EffDateGroup.sys295EffDateIsNumeric();
	}

	/**
	 * 	Update Sys295EffDate with the passed value
	 *	@param number
	 */
	public void setSys295EffDate(long number)  throws CFException{
		sys295EffDateGroup.setSys295EffDate(number);
	}
	

	
	/**
	 * 	Update Sys295EffDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys295EffDate(char[] value)  throws CFException {
		sys295EffDateGroup.setSys295EffDate(value);
	}
	
	/**
	 * 	Update Sys295EffDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys295EffDateString(char[] value)  throws CFException{
		sys295EffDateGroup.setSys295EffDate(value);
	}	

	/**
	 *	Test condition "C" for isCondC()
	 *	@return  Returns true if isCondC() is "C"
	 */
   public boolean isCondC() throws CFException {
      return work.isCondC();
   }

	/**
	*  set values "C"
	*/
   	public void setCondCTrue()  throws CFException{  			
    	work.setCondCTrue();
   	}
	/**
	 *	Returns the value of ip20004ItemLength
	 *	@return ip20004ItemLength
	 */
	public short getIp20004ItemLength() throws CFException {        
   		return work.getIp20004ItemLength();
	}
	
	/**
	 * 	Update Ip20004ItemLength with the passed value
	 *	@param number
	 */
	public void setIp20004ItemLength(short number)  throws CFException{
		work.setIp20004ItemLength(number);
	}

	public void setIp20004ItemLength(int number)  throws CFException{
		work.setIp20004ItemLength((short)number);
	}

	public void setIp20004ItemLength(long number)  throws CFException{
		work.setIp20004ItemLength((short)number);
	}



	/**
	 *	Returns the value of ip2ooo1ErrorNumber
	 *	@return ip2ooo1ErrorNumber
	 */
	public int getIp2ooo1ErrorNumber(int index) throws CFException {
   		return ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().getIp2ooo1ErrorIndex().getIp2ooo1ErrorNumber();
	}


	/**
	 *	Returns String value of ip2ooo1ErrorNumber
	 *	@return ip2ooo1ErrorNumber
	 */
	public char[]  getIp2ooo1ErrorNumberString(int index) throws CFException {
	     return String.valueOf(ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().getIp2ooo1ErrorIndex().getIp2ooo1ErrorNumberString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip2ooo1ErrorNumberIsNumeric(int index)  throws CFException{
	    return ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index - 1).getIp2ooo1ErrorInfo().getIp2ooo1ErrorIndex().ip2ooo1ErrorNumberIsNumeric();
	}

	/**
	 * 	Update Ip2ooo1ErrorNumber with the passed value
	 *	@param number
	 */
	public void setIp2ooo1ErrorNumber(int index,int number)  throws CFException{
		ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().getIp2ooo1ErrorIndex().setIp2ooo1ErrorNumber(number);
	}
	

	public void setIp2ooo1ErrorNumber(int index,long number)  throws CFException{
	    ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().getIp2ooo1ErrorIndex().setIp2ooo1ErrorNumber(number);
	}
	
	
	/**
	 * 	Update Ip2ooo1ErrorNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp2ooo1ErrorNumber(int index,char[] value)  throws CFException {
		ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().getIp2ooo1ErrorIndex().setIp2ooo1ErrorNumber(value);
	}
	
	/**
	 * 	Update Ip2ooo1ErrorNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp2ooo1ErrorNumberString(int index,char[] value)  throws CFException{
		ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().getIp2ooo1ErrorIndex().setIp2ooo1ErrorNumber(value);
	}	

	/**
	 *	Returns the value of group
	 *	@return group
	 */   
	 public Group getGroup() {
   	return group;
   }


	/**
	 *	Returns the value of ip2ooo1ErrorMsgNumber
	 *	@return ip2ooo1ErrorMsgNumber
	 */
	public int getIp2ooo1ErrorMsgNumber(int index) throws CFException {
   		return ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().getIp2ooo1ErrorMsgNumber();
	}


	/**
	 *	Returns String value of ip2ooo1ErrorMsgNumber
	 *	@return ip2ooo1ErrorMsgNumber
	 */
	public char[]  getIp2ooo1ErrorMsgNumberString(int index) throws CFException {
	     return String.valueOf(ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().getIp2ooo1ErrorMsgNumberString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip2ooo1ErrorMsgNumberIsNumeric(int index)  throws CFException{
	    return ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index - 1).getIp2ooo1ErrorInfo().ip2ooo1ErrorMsgNumberIsNumeric();
	}

	/**
	 * 	Update Ip2ooo1ErrorMsgNumber with the passed value
	 *	@param number
	 */
	public void setIp2ooo1ErrorMsgNumber(int index,int number)  throws CFException{
		ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().setIp2ooo1ErrorMsgNumber(number);
	}
	

	public void setIp2ooo1ErrorMsgNumber(int index,long number)  throws CFException{
	    ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().setIp2ooo1ErrorMsgNumber(number);
	}
	
	
	/**
	 * 	Update Ip2ooo1ErrorMsgNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp2ooo1ErrorMsgNumber(int index,char[] value)  throws CFException {
		ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().setIp2ooo1ErrorMsgNumber(value);
	}
	
	/**
	 * 	Update Ip2ooo1ErrorMsgNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp2ooo1ErrorMsgNumberString(int index,char[] value)  throws CFException{
		ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().setIp2ooo1ErrorMsgNumber(value);
	}	

	/**
	 *	Test condition "E" for isCondE()
	 *	@return  Returns true if isCondE() is "E"
	 */
   public boolean isCondE() throws CFException {
      return work.isCondE();
   }

	/**
	*  set values "E"
	*/
   	public void setCondETrue()  throws CFException{  			
    	work.setCondETrue();
   	}
	/**
	 *	Returns the value of ip503011TableId
	 *	@return ip503011TableId
	 */
   public char[] getIp503011TableId() throws CFException  {              
   		return ip503011TblEffDateRecord.getIp503011TableId();
   }

  
	/**
	*  set variable ip503011TableId
	*  @param value
	**/
   public void setIp503011TableId(char[] value) throws CFException {
      ip503011TblEffDateRecord.setIp503011TableId(value);
   } 

     /**
	 * 	Update Ip503011TableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp503011TableId(char[] source, int sourceIndex) throws CFException {
      ip503011TblEffDateRecord.setIp503011TableId(source, sourceIndex);
   	
   }
   
   public void setIp503011TableId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip503011TblEffDateRecord.setIp503011TableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip503011TableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp503011TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip503011TblEffDateRecord.setIp503011TableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip503011TableId with another Field
	 *	@param value
	 */
   public void setIp503011TableId(Field source) {
      ip503011TblEffDateRecord.setIp503011TableId(source);
   }  
   
     /**
	 * 	Update Ip503011TableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp503011TableId(Field source, int sourceIndex,int sourceLen) {
      ip503011TblEffDateRecord.setIp503011TableId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip503011TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp503011TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip503011TblEffDateRecord.setIp503011TableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip2ooo1ErrorIndex
	 *	@return ip2ooo1ErrorIndex
	 */   
	 public Ip2ooo1ErrorIndex getIp2ooo1ErrorIndex(int index) {
   	return ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().getIp2ooo1ErrorIndex();
   }

   /**
	* 	Update Ip2ooo1ErrorIndex with the passed value
	*	@param value
	*/
   public void setIp2ooo1ErrorIndex(int index,char[] value) throws CFException {
      ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().setIp2ooo1ErrorIndex(value);
   }   

     /**
	 * 	Update Ip2ooo1ErrorIndex 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp2ooo1ErrorIndex(int index,char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().setIp2ooo1ErrorIndex(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip2ooo1ErrorIndex 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp2ooo1ErrorIndex(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().setIp2ooo1ErrorIndex(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip2ooo1ErrorIndex with another Field
	 *	@param value
	 */
   public void setIp2ooo1ErrorIndex(int index,Field source) {
   	ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().setIp2ooo1ErrorIndex(source);
   }  
   
     /**
	 * 	Update Ip2ooo1ErrorIndex 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp2ooo1ErrorIndex(int index,Field source, int sourceIndex,int sourceLen) {
   	ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().setIp2ooo1ErrorIndex(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip2ooo1ErrorIndex 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp2ooo1ErrorIndex(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(index).getIp2ooo1ErrorInfo().setIp2ooo1ErrorIndex(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setDtlIdx(int dtlIdx) { 
    McissuesCtx.this.dtlIdx = dtlIdx;
}

public int getDtlIdx() { 
    return McissuesCtx.this.dtlIdx;
}

        public McissuesCtx getMcissuesCtx() {
            return McissuesCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip90354MasterRec.hashCode();
        str += ip503011TblEffDateRecord.hashCode();
        str += sys295EffDateGroup.hashCode();
        str += work.hashCode();
        str += errorInfoTableDefault315.hashCode();
        str += group.hashCode();
        str += ip2ooo1EditWorkRecord.hashCode();
       return str.hashCode();
    }

    public MainSplit0OutCtx clone() {
        MainSplit0OutCtx cloneObj = new MainSplit0OutCtx();
        cloneObj.ip90354MasterRec = new Ip90354MasterRec();
        cloneObj.ip90354MasterRec.set(ip90354MasterRec.getClonedField());
        cloneObj.ip503011TblEffDateRecord = new Ip503011TblEffDateRecord();
        cloneObj.ip503011TblEffDateRecord.set(ip503011TblEffDateRecord.getClonedField());
        cloneObj.sys295EffDateGroup = new Sys295EffDateGroup();
        cloneObj.sys295EffDateGroup.set(sys295EffDateGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.errorInfoTableDefault315 = new ErrorInfoTableDefault315();
        cloneObj.errorInfoTableDefault315.set(errorInfoTableDefault315.getClonedField());
        cloneObj.group = new Group();
        cloneObj.group.set(group.getClonedField());
        cloneObj.ip2ooo1EditWorkRecord = new Ip2ooo1EditWorkRecord();
        cloneObj.ip2ooo1EditWorkRecord.set(ip2ooo1EditWorkRecord.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit0OutCtx getMainSplit0OutCtx() {
            return new MainSplit0OutCtx();
    }
     public class MainSplit1InCtx implements Cloneable {
     Work work = McissuesCtx.this.getWork();
     Ip66601UserTagInformation ip66601UserTagInformation = McissuesCtx.this.getIp66601UserTagInformation();
     Ip655o4TcntGroup ip655o4TcntGroup = McissuesCtx.this.getIp655o4TcntGroup();
     Date2 date2 = McissuesCtx.this.getDate2();
     Ip3oo8o1EditsPerfTbl ip3oo8o1EditsPerfTbl = McissuesCtx.this.getIp3oo8o1EditsPerfTbl();

	/**
	 *	Test condition 12345678.1234567 for isIp33701SrcToTrgSame88()
	 *	@return  Returns true if isIp33701SrcToTrgSame88() is 12345678.1234567
	 */
   public boolean isIp33701SrcToTrgSame88() throws CFException {
      return work.isIp33701SrcToTrgSame88();
   }

	/**
	*  set values 12345678.1234567
	*/
   	public void setIp33701SrcToTrgSame88True()  throws CFException{  			
    	work.setIp33701SrcToTrgSame88True();
   	}

public void setIp66601UserT(int ip66601UserT) { 
    McissuesCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return McissuesCtx.this.ip66601UserT;
}
	/**
	 *	Returns the value of date3
	 *	@return date3
	 */
	public long getDate3() throws CFException {
   		return work.getDate3();
	}


	/**
	 *	Returns String value of date3
	 *	@return date3
	 */
	public char[]  getDate3String() throws CFException {
	     return String.valueOf(work.getDate3String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean date3IsNumeric()  throws CFException{
	    return work.date3IsNumeric();
	}

	/**
	 * 	Update Date3 with the passed value
	 *	@param number
	 */
	public void setDate3(long number)  throws CFException{
		work.setDate3(number);
	}
	

	
	/**
	 * 	Update Date3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDate3(char[] value)  throws CFException {
		work.setDate3(value);
	}
	
	/**
	 * 	Update Date3 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDate3String(char[] value)  throws CFException{
		work.setDate3(value);
	}	

	/**
	 *	Returns the value of value100300
	 *	@return value100300
	 */
	public int getValue100300() throws CFException {
   		return work.getValue100300();
	}


	/**
	 *	Returns String value of value100300
	 *	@return value100300
	 */
	public char[]  getValue100300String() throws CFException {
	     return String.valueOf(work.getValue100300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value100300IsNumeric()  throws CFException{
	    return work.value100300IsNumeric();
	}

	/**
	 * 	Update Value100300 with the passed value
	 *	@param number
	 */
	public void setValue100300(int number)  throws CFException{
		work.setValue100300(number);
	}
	

	public void setValue100300(long number)  throws CFException{
	    work.setValue100300(number);
	}
	
	
	/**
	 * 	Update Value100300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue100300(char[] value)  throws CFException {
		work.setValue100300(value);
	}
	
	/**
	 * 	Update Value100300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue100300String(char[] value)  throws CFException{
		work.setValue100300(value);
	}	


public void setIp66601UserEnd(int ip66601UserEnd) { 
    McissuesCtx.this.ip66601UserEnd = ip66601UserEnd;
}

public int getIp66601UserEnd() { 
    return McissuesCtx.this.ip66601UserEnd;
}
	/**
	 *	Returns the value of date2
	 *	@return date2
	 */   
	 public Date2 getDate2() {
   	return date2;
   }


	/**
	 *	Returns the value of xmlTag2300
	 *	@return xmlTag2300
	 */
   public char[] getXmlTag2300() throws CFException  {              
   		return work.getXmlTag2300();
   }

  
	/**
	*  set variable xmlTag2300
	*  @param value
	**/
   public void setXmlTag2300(char[] value) throws CFException {
      work.setXmlTag2300(value);
   } 

	/**
	 *	Returns the value of ip66601UserTag
	 *	@return ip66601UserTag
	 */   
	 public Ip66601UserTag getIp66601UserTag(int index) {
   	return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index);
   }

    public List<Ip66601UserTag> getIp66601UserTag() {
        return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag();
    }
   /**
	* 	Update Ip66601UserTag with the passed value
	*	@param value
	*/
   public void setIp66601UserTag(int index,char[] value) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().setIp66601UserTag((index),value);
   }   



public void setIp3oo8o1Idx(int ip3oo8o1Idx) { 
    McissuesCtx.this.ip3oo8o1Idx = ip3oo8o1Idx;
}

public int getIp3oo8o1Idx() { 
    return McissuesCtx.this.ip3oo8o1Idx;
}
	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public int getValue1300() throws CFException {
   		return work.getValue1300();
	}


	/**
	 *	Returns String value of value1300
	 *	@return value1300
	 */
	public char[]  getValue1300String() throws CFException {
	     return String.valueOf(work.getValue1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1300IsNumeric()  throws CFException{
	    return work.value1300IsNumeric();
	}

	/**
	 * 	Update Value1300 with the passed value
	 *	@param number
	 */
	public void setValue1300(int number)  throws CFException{
		work.setValue1300(number);
	}
	

	public void setValue1300(long number)  throws CFException{
	    work.setValue1300(number);
	}
	
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1300(char[] value)  throws CFException {
		work.setValue1300(value);
	}
	
	/**
	 * 	Update Value1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1300String(char[] value)  throws CFException{
		work.setValue1300(value);
	}	

	/**
	 *	Returns the value of xmlTag300
	 *	@return xmlTag300
	 */
   public char[] getXmlTag300() throws CFException  {              
   		return work.getXmlTag300();
   }

  
	/**
	*  set variable xmlTag300
	*  @param value
	**/
   public void setXmlTag300(char[] value) throws CFException {
      work.setXmlTag300(value);
   } 

	/**
	 *	Test condition " " for isIp3oo8o1EditNotPerformed88()
	 *	@return  Returns true if isIp3oo8o1EditNotPerformed88() is " "
	 */
   public boolean isIp3oo8o1EditNotPerformed88(int index) throws CFException {
      return ip3oo8o1EditsPerfTbl.getIp3oo8o1EditsPerfEntry().isIp3oo8o1EditNotPerformed88((index));
   }

	/**
	*  set values " "
	*/
   	public void setIp3oo8o1EditNotPerformed88True(int index)  throws CFException{  			
    	ip3oo8o1EditsPerfTbl.getIp3oo8o1EditsPerfEntry().setIp3oo8o1EditNotPerformed88True((index));
   	}

public void setIp66601UserP(int ip66601UserP) { 
    McissuesCtx.this.ip66601UserP = ip66601UserP;
}

public int getIp66601UserP() { 
    return McissuesCtx.this.ip66601UserP;
}
	/**
	 *	Returns the value of ip33701RateSrcToTrg
	 *	@return ip33701RateSrcToTrg
	 */
	public BigDecimal getIp33701RateSrcToTrg() throws CFException {
   		return work.getIp33701RateSrcToTrg();
	}


	 /**
     *	Returns String value of ip33701RateSrcToTrg
     *	@return ip33701RateSrcToTrg
     */
    public char[]  getIp33701RateSrcToTrgString() throws CFException {
         return work.getIp33701RateSrcToTrgString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ip33701RateSrcToTrgIsNumeric() {
        return work.ip33701RateSrcToTrgIsNumeric();
    }
	/**
	 * 	Update Ip33701RateSrcToTrg with the passed number
	 *	@param number
	 */
	public void setIp33701RateSrcToTrg(BigDecimal number)  throws CFException{
		work.setIp33701RateSrcToTrg(number);
   }

	/**
	 * 	Update Ip33701RateSrcToTrg with the passed value
	 *	@param value (String or char[]);
	 */
	public void setIp33701RateSrcToTrg(char[] value)  throws CFException{
		work.setIp33701RateSrcToTrg(value);
	}   

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of xmlTag4300
	 *	@return xmlTag4300
	 */
   public char[] getXmlTag4300() throws CFException  {              
   		return work.getXmlTag4300();
   }

  
	/**
	*  set variable xmlTag4300
	*  @param value
	**/
   public void setXmlTag4300(char[] value) throws CFException {
      work.setXmlTag4300(value);
   } 


public void setSubIdx400(int subIdx400) { 
    McissuesCtx.this.subIdx400 = subIdx400;
}

public int getSubIdx400() { 
    return McissuesCtx.this.subIdx400;
}

public void setIp66601UserLeft(int ip66601UserLeft) { 
    McissuesCtx.this.ip66601UserLeft = ip66601UserLeft;
}

public int getIp66601UserLeft() { 
    return McissuesCtx.this.ip66601UserLeft;
}
	/**
	 *	Returns the value of xmlData300
	 *	@return xmlData300
	 */
   public char[] getXmlData300() throws CFException  {              
   		return work.getXmlData300();
   }

  
	/**
	*  set variable xmlData300
	*  @param value
	**/
   public void setXmlData300(char[] value) throws CFException {
      work.setXmlData300(value);
   } 

	/**
	 *	Returns the value of xmlTag3300
	 *	@return xmlTag3300
	 */
   public char[] getXmlTag3300() throws CFException  {              
   		return work.getXmlTag3300();
   }

  
	/**
	*  set variable xmlTag3300
	*  @param value
	**/
   public void setXmlTag3300(char[] value) throws CFException {
      work.setXmlTag3300(value);
   } 

	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public int getIdx() throws CFException {
   		return work.getIdx();
	}


	/**
	 *	Returns String value of idx
	 *	@return idx
	 */
	public char[]  getIdxString() throws CFException {
	     return String.valueOf(work.getIdxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean idxIsNumeric()  throws CFException{
	    return work.idxIsNumeric();
	}

	/**
	 * 	Update Idx with the passed value
	 *	@param number
	 */
	public void setIdx(int number)  throws CFException{
		work.setIdx(number);
	}
	

	public void setIdx(long number)  throws CFException{
	    work.setIdx(number);
	}
	
	
	/**
	 * 	Update Idx with the passed value
	 *	@param value (String or char[])
	 */
	public void setIdx(char[] value)  throws CFException {
		work.setIdx(value);
	}
	
	/**
	 * 	Update Idx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIdxString(char[] value)  throws CFException{
		work.setIdx(value);
	}	


        public McissuesCtx getMcissuesCtx() {
            return McissuesCtx.this;
        }

        public MainSplit1OutCtx getMainSplit1OutCtx() {
            return new MainSplit1OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
        str += ip66601UserTagInformation.hashCode();
        str += ip655o4TcntGroup.hashCode();
        str += date2.hashCode();
        str += ip3oo8o1EditsPerfTbl.hashCode();
       return str.hashCode();
    }

    public MainSplit1InCtx clone() {
        MainSplit1InCtx cloneObj = new MainSplit1InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.ip655o4TcntGroup = new Ip655o4TcntGroup();
        cloneObj.ip655o4TcntGroup.set(ip655o4TcntGroup.getClonedField());
        cloneObj.date2 = new Date2();
        cloneObj.date2.set(date2.getClonedField());
        cloneObj.ip3oo8o1EditsPerfTbl = new Ip3oo8o1EditsPerfTbl();
        cloneObj.ip3oo8o1EditsPerfTbl.set(ip3oo8o1EditsPerfTbl.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit1InCtx getMainSplit1InCtx() {
            return new MainSplit1InCtx();
    }
     public class MainSplit1OutCtx implements Cloneable {
     Work work = McissuesCtx.this.getWork();
     Ip66601UserTagInformation ip66601UserTagInformation = McissuesCtx.this.getIp66601UserTagInformation();
     Ip655o4TcntGroup ip655o4TcntGroup = McissuesCtx.this.getIp655o4TcntGroup();
     Date2 date2 = McissuesCtx.this.getDate2();
     Ip3oo8o1EditsPerfTbl ip3oo8o1EditsPerfTbl = McissuesCtx.this.getIp3oo8o1EditsPerfTbl();

	/**
	 *	Returns the value of ip66601UserTcnt
	 *	@return ip66601UserTcnt
	 */
	public short getIp66601UserTcnt() throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTcnt();
	}
	
	/**
	 * 	Update Ip66601UserTcnt with the passed value
	 *	@param number
	 */
	public void setIp66601UserTcnt(short number)  throws CFException{
		ip66601UserTagInformation.setIp66601UserTcnt(number);
	}

	public void setIp66601UserTcnt(int number)  throws CFException{
		ip66601UserTagInformation.setIp66601UserTcnt((short)number);
	}

	public void setIp66601UserTcnt(long number)  throws CFException{
		ip66601UserTagInformation.setIp66601UserTcnt((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagLngth
	 *	@return ip66601UserTagLngth
	 */
	public short getIp66601UserTagLngth(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagLngth();
	}
	
	/**
	 * 	Update Ip66601UserTagLngth with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagLngth(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagLngth(number);
	}

	public void setIp66601UserTagLngth(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagLngth((short)number);
	}

	public void setIp66601UserTagLngth(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagLngth((short)number);
	}




public void setIp66601UserStart(int ip66601UserStart) { 
    McissuesCtx.this.ip66601UserStart = ip66601UserStart;
}

public int getIp66601UserStart() { 
    return McissuesCtx.this.ip66601UserStart;
}

public void setIp66601UserEnd(int ip66601UserEnd) { 
    McissuesCtx.this.ip66601UserEnd = ip66601UserEnd;
}

public int getIp66601UserEnd() { 
    return McissuesCtx.this.ip66601UserEnd;
}
	/**
	 *	Returns the value of date2
	 *	@return date2
	 */   
	 public Date2 getDate2() {
   	return date2;
   }


	/**
	 *	Returns the value of xmlStr300
	 *	@return xmlStr300
	 */
   public char[] getXmlStr300() throws CFException  {              
   		return work.getXmlStr300();
   }

  
	/**
	*  set variable xmlStr300
	*  @param value
	**/
   public void setXmlStr300(char[] value) throws CFException {
      work.setXmlStr300(value);
   } 


public void setIp3oo8o1Idx(int ip3oo8o1Idx) { 
    McissuesCtx.this.ip3oo8o1Idx = ip3oo8o1Idx;
}

public int getIp3oo8o1Idx() { 
    return McissuesCtx.this.ip3oo8o1Idx;
}
	/**
	 *	Returns the value of ip66601UserTagType
	 *	@return ip66601UserTagType
	 */
	public short getIp66601UserTagType(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType();
	}
	
	/**
	 * 	Update Ip66601UserTagType with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagType(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType(number);
	}

	public void setIp66601UserTagType(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)number);
	}

	public void setIp66601UserTagType(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)number);
	}



	/**
	 *	Returns the value of date22
	 *	@return date22
	 */
   public char[] getDate22() throws CFException  {              
   		return date2.getDate22();
   }

  
	/**
	*  set variable date22
	*  @param value
	**/
   public void setDate22(char[] value) throws CFException {
      date2.setDate22(value);
   } 

     /**
	 * 	Update Date22 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDate22(char[] source, int sourceIndex) throws CFException {
      date2.setDate22(source, sourceIndex);
   	
   }
   
   public void setDate22(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      date2.setDate22(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Date22 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDate22(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      date2.setDate22(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Date22 with another Field
	 *	@param value
	 */
   public void setDate22(Field source) {
      date2.setDate22(source);
   }  
   
     /**
	 * 	Update Date22 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDate22(Field source, int sourceIndex,int sourceLen) {
      date2.setDate22(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Date22 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDate22(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      date2.setDate22(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIp66601UserP(int ip66601UserP) { 
    McissuesCtx.this.ip66601UserP = ip66601UserP;
}

public int getIp66601UserP() { 
    return McissuesCtx.this.ip66601UserP;
}
	/**
	 *	Returns the value of ip3oo8o1EditsInitStr
	 *	@return ip3oo8o1EditsInitStr
	 */
   public char[] getIp3oo8o1EditsInitStr() throws CFException  {              
   		return ip3oo8o1EditsPerfTbl.getIp3oo8o1EditsInitStr();
   }

  
	/**
	*  set variable ip3oo8o1EditsInitStr
	*  @param value
	**/
   public void setIp3oo8o1EditsInitStr(char[] value) throws CFException {
      ip3oo8o1EditsPerfTbl.setIp3oo8o1EditsInitStr(value);
   } 

     /**
	 * 	Update Ip3oo8o1EditsInitStr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp3oo8o1EditsInitStr(char[] source, int sourceIndex) throws CFException {
      ip3oo8o1EditsPerfTbl.setIp3oo8o1EditsInitStr(source, sourceIndex);
   	
   }
   
   public void setIp3oo8o1EditsInitStr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip3oo8o1EditsPerfTbl.setIp3oo8o1EditsInitStr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip3oo8o1EditsInitStr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp3oo8o1EditsInitStr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip3oo8o1EditsPerfTbl.setIp3oo8o1EditsInitStr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip3oo8o1EditsInitStr with another Field
	 *	@param value
	 */
   public void setIp3oo8o1EditsInitStr(Field source) {
      ip3oo8o1EditsPerfTbl.setIp3oo8o1EditsInitStr(source);
   }  
   
     /**
	 * 	Update Ip3oo8o1EditsInitStr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp3oo8o1EditsInitStr(Field source, int sourceIndex,int sourceLen) {
      ip3oo8o1EditsPerfTbl.setIp3oo8o1EditsInitStr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip3oo8o1EditsInitStr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp3oo8o1EditsInitStr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip3oo8o1EditsPerfTbl.setIp3oo8o1EditsInitStr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip33701RateSrcToTrg
	 *	@return ip33701RateSrcToTrg
	 */
	public BigDecimal getIp33701RateSrcToTrg() throws CFException {
   		return work.getIp33701RateSrcToTrg();
	}


	 /**
     *	Returns String value of ip33701RateSrcToTrg
     *	@return ip33701RateSrcToTrg
     */
    public char[]  getIp33701RateSrcToTrgString() throws CFException {
         return work.getIp33701RateSrcToTrgString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ip33701RateSrcToTrgIsNumeric() {
        return work.ip33701RateSrcToTrgIsNumeric();
    }
	/**
	 * 	Update Ip33701RateSrcToTrg with the passed number
	 *	@param number
	 */
	public void setIp33701RateSrcToTrg(BigDecimal number)  throws CFException{
		work.setIp33701RateSrcToTrg(number);
   }

	/**
	 * 	Update Ip33701RateSrcToTrg with the passed value
	 *	@param value (String or char[]);
	 */
	public void setIp33701RateSrcToTrg(char[] value)  throws CFException{
		work.setIp33701RateSrcToTrg(value);
	}   

	/**
	 *	Returns the value of sys295EffDate2
	 *	@return sys295EffDate2
	 */
   public char[] getSys295EffDate2() throws CFException  {              
   		return work.getSys295EffDate2();
   }

  
	/**
	*  set variable sys295EffDate2
	*  @param value
	**/
   public void setSys295EffDate2(char[] value) throws CFException {
      work.setSys295EffDate2(value);
   } 

	/**
	 *	Returns the value of subValueCount400
	 *	@return subValueCount400
	 */
	public short getSubValueCount400(int index) throws CFException {        
   		return work.getSubValueCount400((index));
	}
	
	/**
	 * 	Update SubValueCount400 with the passed value
	 *	@param number
	 */
	public void setSubValueCount400(int index,short number)  throws CFException{
		work.setSubValueCount400((index),number);
	}

	public void setSubValueCount400(int index,int number)  throws CFException{
		work.setSubValueCount400((index),(short)number);
	}

	public void setSubValueCount400(int index,long number)  throws CFException{
		work.setSubValueCount400((index),(short)number);
	}



	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public int getIdx() throws CFException {
   		return work.getIdx();
	}


	/**
	 *	Returns String value of idx
	 *	@return idx
	 */
	public char[]  getIdxString() throws CFException {
	     return String.valueOf(work.getIdxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean idxIsNumeric()  throws CFException{
	    return work.idxIsNumeric();
	}

	/**
	 * 	Update Idx with the passed value
	 *	@param number
	 */
	public void setIdx(int number)  throws CFException{
		work.setIdx(number);
	}
	

	public void setIdx(long number)  throws CFException{
	    work.setIdx(number);
	}
	
	
	/**
	 * 	Update Idx with the passed value
	 *	@param value (String or char[])
	 */
	public void setIdx(char[] value)  throws CFException {
		work.setIdx(value);
	}
	
	/**
	 * 	Update Idx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIdxString(char[] value)  throws CFException{
		work.setIdx(value);
	}	


public void setIp655o4T(int ip655o4T) { 
    McissuesCtx.this.ip655o4T = ip655o4T;
}

public int getIp655o4T() { 
    return McissuesCtx.this.ip655o4T;
}
	/**
	 *	Returns the value of ip655o4Tcnt
	 *	@return ip655o4Tcnt
	 */
	public short getIp655o4Tcnt() throws CFException {        
   		return ip655o4TcntGroup.getIp655o4Tcnt();
	}
	
	/**
	 * 	Update Ip655o4Tcnt with the passed value
	 *	@param number
	 */
	public void setIp655o4Tcnt(short number)  throws CFException{
		ip655o4TcntGroup.setIp655o4Tcnt(number);
	}

	public void setIp655o4Tcnt(int number)  throws CFException{
		ip655o4TcntGroup.setIp655o4Tcnt((short)number);
	}

	public void setIp655o4Tcnt(long number)  throws CFException{
		ip655o4TcntGroup.setIp655o4Tcnt((short)number);
	}




public void setIp66601UserT(int ip66601UserT) { 
    McissuesCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return McissuesCtx.this.ip66601UserT;
}
	/**
	 *	Returns the value of date3
	 *	@return date3
	 */
	public long getDate3() throws CFException {
   		return work.getDate3();
	}


	/**
	 *	Returns String value of date3
	 *	@return date3
	 */
	public char[]  getDate3String() throws CFException {
	     return String.valueOf(work.getDate3String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean date3IsNumeric()  throws CFException{
	    return work.date3IsNumeric();
	}

	/**
	 * 	Update Date3 with the passed value
	 *	@param number
	 */
	public void setDate3(long number)  throws CFException{
		work.setDate3(number);
	}
	

	
	/**
	 * 	Update Date3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDate3(char[] value)  throws CFException {
		work.setDate3(value);
	}
	
	/**
	 * 	Update Date3 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDate3String(char[] value)  throws CFException{
		work.setDate3(value);
	}	


public void setIp66601UserRight(int ip66601UserRight) { 
    McissuesCtx.this.ip66601UserRight = ip66601UserRight;
}

public int getIp66601UserRight() { 
    return McissuesCtx.this.ip66601UserRight;
}
	/**
	 *	Returns the value of ip66601UserTag
	 *	@return ip66601UserTag
	 */   
	 public Ip66601UserTag getIp66601UserTag(int index) {
   	return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index);
   }

    public List<Ip66601UserTag> getIp66601UserTag() {
        return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag();
    }
   /**
	* 	Update Ip66601UserTag with the passed value
	*	@param value
	*/
   public void setIp66601UserTag(int index,char[] value) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().setIp66601UserTag((index),value);
   }   


	/**
	 *	Returns the value of ip3oo8o1EditsHolder
	 *	@return ip3oo8o1EditsHolder
	 */
   public char[] getIp3oo8o1EditsHolder() throws CFException  {              
   		return ip3oo8o1EditsPerfTbl.getIp3oo8o1EditsHolder();
   }

  
	/**
	*  set variable ip3oo8o1EditsHolder
	*  @param value
	**/
   public void setIp3oo8o1EditsHolder(char[] value) throws CFException {
      ip3oo8o1EditsPerfTbl.setIp3oo8o1EditsHolder(value);
   } 

     /**
	 * 	Update Ip3oo8o1EditsHolder 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp3oo8o1EditsHolder(char[] source, int sourceIndex) throws CFException {
      ip3oo8o1EditsPerfTbl.setIp3oo8o1EditsHolder(source, sourceIndex);
   	
   }
   
   public void setIp3oo8o1EditsHolder(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip3oo8o1EditsPerfTbl.setIp3oo8o1EditsHolder(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip3oo8o1EditsHolder 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp3oo8o1EditsHolder(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip3oo8o1EditsPerfTbl.setIp3oo8o1EditsHolder(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip3oo8o1EditsHolder with another Field
	 *	@param value
	 */
   public void setIp3oo8o1EditsHolder(Field source) {
      ip3oo8o1EditsPerfTbl.setIp3oo8o1EditsHolder(source);
   }  
   
     /**
	 * 	Update Ip3oo8o1EditsHolder 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp3oo8o1EditsHolder(Field source, int sourceIndex,int sourceLen) {
      ip3oo8o1EditsPerfTbl.setIp3oo8o1EditsHolder(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip3oo8o1EditsHolder 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp3oo8o1EditsHolder(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip3oo8o1EditsPerfTbl.setIp3oo8o1EditsHolder(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of totalSubCount400
	 *	@return totalSubCount400
	 */
	public short getTotalSubCount400() throws CFException {        
   		return work.getTotalSubCount400();
	}
	
	/**
	 * 	Update TotalSubCount400 with the passed value
	 *	@param number
	 */
	public void setTotalSubCount400(short number)  throws CFException{
		work.setTotalSubCount400(number);
	}

	public void setTotalSubCount400(int number)  throws CFException{
		work.setTotalSubCount400((short)number);
	}

	public void setTotalSubCount400(long number)  throws CFException{
		work.setTotalSubCount400((short)number);
	}



	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of ip66601UserTagStart
	 *	@return ip66601UserTagStart
	 */
	public short getIp66601UserTagStart(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagStart();
	}
	
	/**
	 * 	Update Ip66601UserTagStart with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagStart(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStart(number);
	}

	public void setIp66601UserTagStart(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStart((short)number);
	}

	public void setIp66601UserTagStart(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStart((short)number);
	}




public void setIp66601UserMedian(int ip66601UserMedian) { 
    McissuesCtx.this.ip66601UserMedian = ip66601UserMedian;
}

public int getIp66601UserMedian() { 
    return McissuesCtx.this.ip66601UserMedian;
}

public void setSubIdx400(int subIdx400) { 
    McissuesCtx.this.subIdx400 = subIdx400;
}

public int getSubIdx400() { 
    return McissuesCtx.this.subIdx400;
}
	/**
	 *	Returns the value of ip66601UserTagNo
	 *	@return ip66601UserTagNo
	 */
	public short getIp66601UserTagNo(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo();
	}
	
	/**
	 * 	Update Ip66601UserTagNo with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagNo(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo(number);
	}

	public void setIp66601UserTagNo(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)number);
	}

	public void setIp66601UserTagNo(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagStatus
	 *	@return ip66601UserTagStatus
	 */
   public char[] getIp66601UserTagStatus(int index) throws CFException  {              
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagStatus();
   }

  
	/**
	*  set variable ip66601UserTagStatus
	*  @param value
	**/
   public void setIp66601UserTagStatus(int index,char[] value) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(value);
   } 

     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,char[] source, int sourceIndex) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex);
   	
   }
   
   public void setIp66601UserTagStatus(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66601UserTagStatus with another Field
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,Field source) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source);
   }  
   
     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,Field source, int sourceIndex,int sourceLen) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIp66601UserLeft(int ip66601UserLeft) { 
    McissuesCtx.this.ip66601UserLeft = ip66601UserLeft;
}

public int getIp66601UserLeft() { 
    return McissuesCtx.this.ip66601UserLeft;
}
	/**
	 *	Returns the value of ip66601UserTagOccurrence
	 *	@return ip66601UserTagOccurrence
	 */
	public short getIp66601UserTagOccurrence(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserTagOccurrence();
	}
	
	/**
	 * 	Update Ip66601UserTagOccurrence with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagOccurrence(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagOccurrence(number);
	}

	public void setIp66601UserTagOccurrence(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagOccurrence((short)number);
	}

	public void setIp66601UserTagOccurrence(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagOccurrence((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagSubfldNo
	 *	@return ip66601UserTagSubfldNo
	 */
	public short getIp66601UserTagSubfldNo(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserTagSubfldNo();
	}
	
	/**
	 * 	Update Ip66601UserTagSubfldNo with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagSubfldNo(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagSubfldNo(number);
	}

	public void setIp66601UserTagSubfldNo(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)number);
	}

	public void setIp66601UserTagSubfldNo(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)number);
	}



	/**
	 *	Returns the value of date21
	 *	@return date21
	 */
   public char[] getDate21() throws CFException  {              
   		return date2.getDate21();
   }

  
	/**
	*  set variable date21
	*  @param value
	**/
   public void setDate21(char[] value) throws CFException {
      date2.setDate21(value);
   } 

     /**
	 * 	Update Date21 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDate21(char[] source, int sourceIndex) throws CFException {
      date2.setDate21(source, sourceIndex);
   	
   }
   
   public void setDate21(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      date2.setDate21(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Date21 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDate21(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      date2.setDate21(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Date21 with another Field
	 *	@param value
	 */
   public void setDate21(Field source) {
      date2.setDate21(source);
   }  
   
     /**
	 * 	Update Date21 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDate21(Field source, int sourceIndex,int sourceLen) {
      date2.setDate21(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Date21 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDate21(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      date2.setDate21(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public McissuesCtx getMcissuesCtx() {
            return McissuesCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
        str += ip66601UserTagInformation.hashCode();
        str += ip655o4TcntGroup.hashCode();
        str += date2.hashCode();
        str += ip3oo8o1EditsPerfTbl.hashCode();
       return str.hashCode();
    }

    public MainSplit1OutCtx clone() {
        MainSplit1OutCtx cloneObj = new MainSplit1OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.ip655o4TcntGroup = new Ip655o4TcntGroup();
        cloneObj.ip655o4TcntGroup.set(ip655o4TcntGroup.getClonedField());
        cloneObj.date2 = new Date2();
        cloneObj.date2.set(date2.getClonedField());
        cloneObj.ip3oo8o1EditsPerfTbl = new Ip3oo8o1EditsPerfTbl();
        cloneObj.ip3oo8o1EditsPerfTbl.set(ip3oo8o1EditsPerfTbl.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit1OutCtx getMainSplit1OutCtx() {
            return new MainSplit1OutCtx();
    }
     public class MainSplit2InCtx implements Cloneable {
     AbBusslBussiValues800 abBusslBussiValues800 = McissuesCtx.this.getAbBusslBussiValues800();
     MapRow1ValGroup800 mapRow1ValGroup800 = McissuesCtx.this.getMapRow1ValGroup800();
     EmptyIndexGroup800 emptyIndexGroup800 = McissuesCtx.this.getEmptyIndexGroup800();
     InterimDateXGroup800 interimDateXGroup800 = McissuesCtx.this.getInterimDateXGroup800();
     Ip40004IntMsgHdrRecGroup ip40004IntMsgHdrRecGroup = McissuesCtx.this.getIp40004IntMsgHdrRecGroup();
     Holidays500 holidays500 = McissuesCtx.this.getHolidays500();
     Ip33701TargetCurExp9Group ip33701TargetCurExp9Group = McissuesCtx.this.getIp33701TargetCurExp9Group();
     Work work = McissuesCtx.this.getWork();
     Ip66601UserTagInformation ip66601UserTagInformation = McissuesCtx.this.getIp66601UserTagInformation();
     Ip66102IpmMsg ip66102IpmMsg = McissuesCtx.this.getIp66102IpmMsg();
     Ip00485MemberEntryInfo ip00485MemberEntryInfo = McissuesCtx.this.getIp00485MemberEntryInfo();

	/**
	 *	Returns the value of emptyIndex800
	 *	@return emptyIndex800
	 */
	public int getEmptyIndex800() throws CFException {        
   		return emptyIndexGroup800.getEmptyIndex800();
	}
	
	/**
	 * 	Update EmptyIndex800 with the passed value
	 *	@param number
	 */
	public void setEmptyIndex800(int number)  throws CFException{
		emptyIndexGroup800.setEmptyIndex800(number);
	}


	public void setEmptyIndex800(long number)  throws CFException{
		emptyIndexGroup800.setEmptyIndex800((int)number);
	}


	/**
	 *	Returns the value of abBusslBussiValues800
	 *	@return abBusslBussiValues800
	 */   
	 public AbBusslBussiValues800 getAbBusslBussiValues800() {
   	return abBusslBussiValues800;
   }


	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public int getI() throws CFException {
   		return work.getI();
	}


	/**
	 *	Returns String value of i
	 *	@return i
	 */
	public char[]  getIString() throws CFException {
	     return String.valueOf(work.getIString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iIsNumeric()  throws CFException{
	    return work.iIsNumeric();
	}

	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(int number)  throws CFException{
		work.setI(number);
	}
	

	public void setI(long number)  throws CFException{
	    work.setI(number);
	}
	
	
	/**
	 * 	Update I with the passed value
	 *	@param value (String or char[])
	 */
	public void setI(char[] value)  throws CFException {
		work.setI(value);
	}
	
	/**
	 * 	Update I with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIString(char[] value)  throws CFException{
		work.setI(value);
	}	

	/**
	 *	Returns the value of space300
	 *	@return space300
	 */
   public char[] getSpace300() throws CFException  {              
   		return work.getSpace300();
   }

  
	/**
	*  set variable space300
	*  @param value
	**/
   public void setSpace300(char[] value) throws CFException {
      work.setSpace300(value);
   } 

	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of lowValue300
	 *	@return lowValue300
	 */
   public char[] getLowValue300() throws CFException  {              
   		return work.getLowValue300();
   }

  
	/**
	*  set variable lowValue300
	*  @param value
	**/
   public void setLowValue300(char[] value) throws CFException {
      work.setLowValue300(value);
   } 


public void setIp00485MemberIdx(int ip00485MemberIdx) { 
    McissuesCtx.this.ip00485MemberIdx = ip00485MemberIdx;
}

public int getIp00485MemberIdx() { 
    return McissuesCtx.this.ip00485MemberIdx;
}
	/**
	 *	Returns the value of highValue300
	 *	@return highValue300
	 */
   public char[] getHighValue300() throws CFException  {              
   		return work.getHighValue300();
   }

  
	/**
	*  set variable highValue300
	*  @param value
	**/
   public void setHighValue300(char[] value) throws CFException {
      work.setHighValue300(value);
   } 

	/**
	 *	Returns the value of holidays500
	 *	@return holidays500
	 */   
	 public Holidays500 getHolidays500() {
   	return holidays500;
   }


	/**
	 *	Returns the value of ip00485MemberId
	 *	@return ip00485MemberId
	 */
	public short getIp00485MemberId(int index) throws CFException {        
   		return ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().getIp00485MemberId();
	}
	
	/**
	 * 	Update Ip00485MemberId with the passed value
	 *	@param number
	 */
	public void setIp00485MemberId(int index,short number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485MemberId(number);
	}

	public void setIp00485MemberId(int index,int number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485MemberId((short)number);
	}

	public void setIp00485MemberId(int index,long number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485MemberId((short)number);
	}



	/**
	 *	Returns the value of numSpaces
	 *	@return numSpaces
	 */
   public char[] getNumSpaces() throws CFException  {              
   		return work.getNumSpaces();
   }

  
	/**
	*  set variable numSpaces
	*  @param value
	**/
   public void setNumSpaces(char[] value) throws CFException {
      work.setNumSpaces(value);
   } 

     /**
	 * 	Update NumSpaces 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNumSpaces(char[] source, int sourceIndex) throws CFException {
      work.setNumSpaces(source, sourceIndex);
   	
   }
   
   public void setNumSpaces(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setNumSpaces(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update NumSpaces 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNumSpaces(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setNumSpaces(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update NumSpaces with another Field
	 *	@param value
	 */
   public void setNumSpaces(Field source) {
      work.setNumSpaces(source);
   }  
   
     /**
	 * 	Update NumSpaces 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNumSpaces(Field source, int sourceIndex,int sourceLen) {
      work.setNumSpaces(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update NumSpaces 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNumSpaces(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setNumSpaces(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public int getIdx() throws CFException {
   		return work.getIdx();
	}


	/**
	 *	Returns String value of idx
	 *	@return idx
	 */
	public char[]  getIdxString() throws CFException {
	     return String.valueOf(work.getIdxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean idxIsNumeric()  throws CFException{
	    return work.idxIsNumeric();
	}

	/**
	 * 	Update Idx with the passed value
	 *	@param number
	 */
	public void setIdx(int number)  throws CFException{
		work.setIdx(number);
	}
	

	public void setIdx(long number)  throws CFException{
	    work.setIdx(number);
	}
	
	
	/**
	 * 	Update Idx with the passed value
	 *	@param value (String or char[])
	 */
	public void setIdx(char[] value)  throws CFException {
		work.setIdx(value);
	}
	
	/**
	 * 	Update Idx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIdxString(char[] value)  throws CFException{
		work.setIdx(value);
	}	

	/**
	 *	Returns the value of xmlText
	 *	@return xmlText
	 */
   public char[] getXmlText() throws CFException  {              
   		return work.getXmlText();
   }

  
	/**
	*  set variable xmlText
	*  @param value
	**/
   public void setXmlText(char[] value) throws CFException {
      work.setXmlText(value);
   } 


public void setIp66601UserT(int ip66601UserT) { 
    McissuesCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return McissuesCtx.this.ip66601UserT;
}
	/**
	 *	Returns the value of ip40004IntMsgHdrRecGroup
	 *	@return ip40004IntMsgHdrRecGroup
	 */   
	 public Ip40004IntMsgHdrRecGroup getIp40004IntMsgHdrRecGroup() {
   	return ip40004IntMsgHdrRecGroup;
   }


	/**
	 *	Returns the value of bussl800
	 *	@return bussl800
	 */
	public int getBussl800() throws CFException {
   		return abBusslBussiValues800.getBussl800();
	}


	/**
	 *	Returns String value of bussl800
	 *	@return bussl800
	 */
	public char[]  getBussl800String() throws CFException {
	     return String.valueOf(abBusslBussiValues800.getBussl800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bussl800IsNumeric()  throws CFException{
	    return abBusslBussiValues800.bussl800IsNumeric();
	}

	/**
	 * 	Update Bussl800 with the passed value
	 *	@param number
	 */
	public void setBussl800(int number)  throws CFException{
		abBusslBussiValues800.setBussl800(number);
	}
	

	public void setBussl800(long number)  throws CFException{
	    abBusslBussiValues800.setBussl800(number);
	}
	
	
	/**
	 * 	Update Bussl800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBussl800(char[] value)  throws CFException {
		abBusslBussiValues800.setBussl800(value);
	}
	
	/**
	 * 	Update Bussl800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBussl800String(char[] value)  throws CFException{
		abBusslBussiValues800.setBussl800(value);
	}	

	/**
	 *	Returns the value of ab800
	 *	@return ab800
	 */
   public char[] getAb800() throws CFException  {              
   		return abBusslBussiValues800.getAb800();
   }

  
	/**
	*  set variable ab800
	*  @param value
	**/
   public void setAb800(char[] value) throws CFException {
      abBusslBussiValues800.setAb800(value);
   } 

     /**
	 * 	Update Ab800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAb800(char[] source, int sourceIndex) throws CFException {
      abBusslBussiValues800.setAb800(source, sourceIndex);
   	
   }
   
   public void setAb800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abBusslBussiValues800.setAb800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ab800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAb800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abBusslBussiValues800.setAb800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ab800 with another Field
	 *	@param value
	 */
   public void setAb800(Field source) {
      abBusslBussiValues800.setAb800(source);
   }  
   
     /**
	 * 	Update Ab800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAb800(Field source, int sourceIndex,int sourceLen) {
      abBusslBussiValues800.setAb800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ab800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAb800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abBusslBussiValues800.setAb800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of strt800
	 *	@return strt800
	 */
	public short getStrt800() throws CFException {        
   		return work.getStrt800();
	}
	
	/**
	 * 	Update Strt800 with the passed value
	 *	@param number
	 */
	public void setStrt800(short number)  throws CFException{
		work.setStrt800(number);
	}

	public void setStrt800(int number)  throws CFException{
		work.setStrt800((short)number);
	}

	public void setStrt800(long number)  throws CFException{
		work.setStrt800((short)number);
	}



	/**
	 *	Returns the value of ip40004FileIdFinan
	 *	@return ip40004FileIdFinan
	 */   
	 public Ip40004FileIdFinan getIp40004FileIdFinan() {
   	return ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan();
   }

   /**
	* 	Update Ip40004FileIdFinan with the passed value
	*	@param value
	*/
   public void setIp40004FileIdFinan(char[] value) throws CFException {
      ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().setIp40004FileIdFinan(value);
   }   

     /**
	 * 	Update Ip40004FileIdFinan 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp40004FileIdFinan(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().setIp40004FileIdFinan(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip40004FileIdFinan 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FileIdFinan(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().setIp40004FileIdFinan(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip40004FileIdFinan with another Field
	 *	@param value
	 */
   public void setIp40004FileIdFinan(Field source) {
   	ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().setIp40004FileIdFinan(source);
   }  
   
     /**
	 * 	Update Ip40004FileIdFinan 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp40004FileIdFinan(Field source, int sourceIndex,int sourceLen) {
   	ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().setIp40004FileIdFinan(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip40004FileIdFinan 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FileIdFinan(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().setIp40004FileIdFinan(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00485MemberEntries
	 *	@return ip00485MemberEntries
	 */
	public long getIp00485MemberEntries() throws CFException {        
   		return ip00485MemberEntryInfo.getIp00485MemberEntries();
	}
	
	/**
	 * 	Update Ip00485MemberEntries with the passed value
	 *	@param number
	 */
	public void setIp00485MemberEntries(long number)  throws CFException{
		ip00485MemberEntryInfo.setIp00485MemberEntries(number);
	}



	/**
	 *	Returns the value of bussi800
	 *	@return bussi800
	 */
	public int getBussi800() throws CFException {
   		return abBusslBussiValues800.getBussi800();
	}


	/**
	 *	Returns String value of bussi800
	 *	@return bussi800
	 */
	public char[]  getBussi800String() throws CFException {
	     return String.valueOf(abBusslBussiValues800.getBussi800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bussi800IsNumeric()  throws CFException{
	    return abBusslBussiValues800.bussi800IsNumeric();
	}

	/**
	 * 	Update Bussi800 with the passed value
	 *	@param number
	 */
	public void setBussi800(int number)  throws CFException{
		abBusslBussiValues800.setBussi800(number);
	}
	

	public void setBussi800(long number)  throws CFException{
	    abBusslBussiValues800.setBussi800(number);
	}
	
	
	/**
	 * 	Update Bussi800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBussi800(char[] value)  throws CFException {
		abBusslBussiValues800.setBussi800(value);
	}
	
	/**
	 * 	Update Bussi800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBussi800String(char[] value)  throws CFException{
		abBusslBussiValues800.setBussi800(value);
	}	

	/**
	 *	Returns the value of mapRow1800
	 *	@return mapRow1800
	 */
	public int getMapRow1800() throws CFException {        
   		return mapRow1ValGroup800.getMapRow1800();
	}
	
	/**
	 * 	Update MapRow1800 with the passed value
	 *	@param number
	 */
	public void setMapRow1800(int number)  throws CFException{
		mapRow1ValGroup800.setMapRow1800(number);
	}


	public void setMapRow1800(long number)  throws CFException{
		mapRow1ValGroup800.setMapRow1800((int)number);
	}


	/**
	 *	Returns the value of ip00485MemberEntry
	 *	@return ip00485MemberEntry
	 */   
	 public Ip00485MemberEntry getIp00485MemberEntry(int index) {
   	return ip00485MemberEntryInfo.getIp00485MemberEntry(index);
   }

    public List<Ip00485MemberEntry> getIp00485MemberEntry() {
        return ip00485MemberEntryInfo.getIp00485MemberEntry();
    }
   /**
	* 	Update Ip00485MemberEntry with the passed value
	*	@param value
	*/
   public void setIp00485MemberEntry(int index,char[] value) throws CFException {
      ip00485MemberEntryInfo.setIp00485MemberEntry((index),value);
   }   



public void setHolidayIndex500(int holidayIndex500) { 
    McissuesCtx.this.holidayIndex500 = holidayIndex500;
}

public int getHolidayIndex500() { 
    return McissuesCtx.this.holidayIndex500;
}
	/**
	 *	Returns the value of ip66601UserTagStart
	 *	@return ip66601UserTagStart
	 */
	public short getIp66601UserTagStart(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagStart();
	}
	
	/**
	 * 	Update Ip66601UserTagStart with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagStart(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStart(number);
	}

	public void setIp66601UserTagStart(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStart((short)number);
	}

	public void setIp66601UserTagStart(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStart((short)number);
	}



	/**
	 *	Returns the value of ampersand300
	 *	@return ampersand300
	 */
   public char[] getAmpersand300() throws CFException  {              
   		return work.getAmpersand300();
   }

  
	/**
	*  set variable ampersand300
	*  @param value
	**/
   public void setAmpersand300(char[] value) throws CFException {
      work.setAmpersand300(value);
   } 

	/**
	 *	Returns the value of ip00485MemberEntryInfo
	 *	@return ip00485MemberEntryInfo
	 */   
	 public Ip00485MemberEntryInfo getIp00485MemberEntryInfo() {
   	return ip00485MemberEntryInfo;
   }



        public McissuesCtx getMcissuesCtx() {
            return McissuesCtx.this;
        }

        public MainSplit2OutCtx getMainSplit2OutCtx() {
            return new MainSplit2OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abBusslBussiValues800.hashCode();
        str += mapRow1ValGroup800.hashCode();
        str += emptyIndexGroup800.hashCode();
        str += interimDateXGroup800.hashCode();
        str += ip40004IntMsgHdrRecGroup.hashCode();
        str += holidays500.hashCode();
        str += ip33701TargetCurExp9Group.hashCode();
        str += work.hashCode();
        str += ip66601UserTagInformation.hashCode();
        str += ip66102IpmMsg.hashCode();
        str += ip00485MemberEntryInfo.hashCode();
       return str.hashCode();
    }

    public MainSplit2InCtx clone() {
        MainSplit2InCtx cloneObj = new MainSplit2InCtx();
        cloneObj.abBusslBussiValues800 = new AbBusslBussiValues800();
        cloneObj.abBusslBussiValues800.set(abBusslBussiValues800.getClonedField());
        cloneObj.mapRow1ValGroup800 = new MapRow1ValGroup800();
        cloneObj.mapRow1ValGroup800.set(mapRow1ValGroup800.getClonedField());
        cloneObj.emptyIndexGroup800 = new EmptyIndexGroup800();
        cloneObj.emptyIndexGroup800.set(emptyIndexGroup800.getClonedField());
        cloneObj.interimDateXGroup800 = new InterimDateXGroup800();
        cloneObj.interimDateXGroup800.set(interimDateXGroup800.getClonedField());
        cloneObj.ip40004IntMsgHdrRecGroup = new Ip40004IntMsgHdrRecGroup();
        cloneObj.ip40004IntMsgHdrRecGroup.set(ip40004IntMsgHdrRecGroup.getClonedField());
        cloneObj.holidays500 = new Holidays500();
        cloneObj.holidays500.set(holidays500.getClonedField());
        cloneObj.ip33701TargetCurExp9Group = new Ip33701TargetCurExp9Group();
        cloneObj.ip33701TargetCurExp9Group.set(ip33701TargetCurExp9Group.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.ip00485MemberEntryInfo = new Ip00485MemberEntryInfo();
        cloneObj.ip00485MemberEntryInfo.set(ip00485MemberEntryInfo.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit2InCtx getMainSplit2InCtx() {
            return new MainSplit2InCtx();
    }
     public class MainSplit2OutCtx implements Cloneable {
     AbBusslBussiValues800 abBusslBussiValues800 = McissuesCtx.this.getAbBusslBussiValues800();
     MapRow1ValGroup800 mapRow1ValGroup800 = McissuesCtx.this.getMapRow1ValGroup800();
     EmptyIndexGroup800 emptyIndexGroup800 = McissuesCtx.this.getEmptyIndexGroup800();
     InterimDateXGroup800 interimDateXGroup800 = McissuesCtx.this.getInterimDateXGroup800();
     Ip40004IntMsgHdrRecGroup ip40004IntMsgHdrRecGroup = McissuesCtx.this.getIp40004IntMsgHdrRecGroup();
     Holidays500 holidays500 = McissuesCtx.this.getHolidays500();
     Ip33701TargetCurExp9Group ip33701TargetCurExp9Group = McissuesCtx.this.getIp33701TargetCurExp9Group();
     Work work = McissuesCtx.this.getWork();
     Ip66601UserTagInformation ip66601UserTagInformation = McissuesCtx.this.getIp66601UserTagInformation();
     Ip66102IpmMsg ip66102IpmMsg = McissuesCtx.this.getIp66102IpmMsg();
     Ip00485MemberEntryInfo ip00485MemberEntryInfo = McissuesCtx.this.getIp00485MemberEntryInfo();

	/**
	 *	Returns the value of prevMccCode801
	 *	@return prevMccCode801
	 */
   public char[] getPrevMccCode801() throws CFException  {              
   		return work.getPrevMccCode801();
   }

  
	/**
	*  set variable prevMccCode801
	*  @param value
	**/
   public void setPrevMccCode801(char[] value) throws CFException {
      work.setPrevMccCode801(value);
   } 

	/**
	 *	Returns the value of xmlData805
	 *	@return xmlData805
	 */
   public char[] getXmlData805() throws CFException  {              
   		return work.getXmlData805();
   }

  
	/**
	*  set variable xmlData805
	*  @param value
	**/
   public void setXmlData805(char[] value) throws CFException {
      work.setXmlData805(value);
   } 

	/**
	 *	Returns the value of editNumber800
	 *	@return editNumber800
	 */
	public long getEditNumber800() throws CFException {        
   		return work.getEditNumber800();
	}
	
	/**
	 * 	Update EditNumber800 with the passed value
	 *	@param number
	 */
	public void setEditNumber800(long number)  throws CFException{
		work.setEditNumber800(number);
	}



	/**
	 *	Returns the value of abBusslBussiValues800
	 *	@return abBusslBussiValues800
	 */   
	 public AbBusslBussiValues800 getAbBusslBussiValues800() {
   	return abBusslBussiValues800;
   }


	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public int getI() throws CFException {
   		return work.getI();
	}


	/**
	 *	Returns String value of i
	 *	@return i
	 */
	public char[]  getIString() throws CFException {
	     return String.valueOf(work.getIString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iIsNumeric()  throws CFException{
	    return work.iIsNumeric();
	}

	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(int number)  throws CFException{
		work.setI(number);
	}
	

	public void setI(long number)  throws CFException{
	    work.setI(number);
	}
	
	
	/**
	 * 	Update I with the passed value
	 *	@param value (String or char[])
	 */
	public void setI(char[] value)  throws CFException {
		work.setI(value);
	}
	
	/**
	 * 	Update I with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIString(char[] value)  throws CFException{
		work.setI(value);
	}	

	/**
	 *	Returns the value of ip00485UserTagLngth
	 *	@return ip00485UserTagLngth
	 */
	public short getIp00485UserTagLngth(int index) throws CFException {        
   		return ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagLngth();
	}
	
	/**
	 * 	Update Ip00485UserTagLngth with the passed value
	 *	@param number
	 */
	public void setIp00485UserTagLngth(int index,short number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagLngth(number);
	}

	public void setIp00485UserTagLngth(int index,int number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagLngth((short)number);
	}

	public void setIp00485UserTagLngth(int index,long number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagLngth((short)number);
	}



	/**
	 *	Returns the value of ip40004FinProcessorId
	 *	@return ip40004FinProcessorId
	 */
   public char[] getIp40004FinProcessorId() throws CFException  {              
   		return ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().getIp40004FinProcessorId();
   }

  
	/**
	*  set variable ip40004FinProcessorId
	*  @param value
	**/
   public void setIp40004FinProcessorId(char[] value) throws CFException {
      ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinProcessorId(value);
   } 

     /**
	 * 	Update Ip40004FinProcessorId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004FinProcessorId(char[] source, int sourceIndex) throws CFException {
      ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinProcessorId(source, sourceIndex);
   	
   }
   
   public void setIp40004FinProcessorId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinProcessorId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip40004FinProcessorId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FinProcessorId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinProcessorId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip40004FinProcessorId with another Field
	 *	@param value
	 */
   public void setIp40004FinProcessorId(Field source) {
      ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinProcessorId(source);
   }  
   
     /**
	 * 	Update Ip40004FinProcessorId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004FinProcessorId(Field source, int sourceIndex,int sourceLen) {
      ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinProcessorId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip40004FinProcessorId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FinProcessorId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinProcessorId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00485UserTagOccurrence
	 *	@return ip00485UserTagOccurrence
	 */
	public short getIp00485UserTagOccurrence(int index) throws CFException {        
   		return ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().getIp00485UserTagOccurrence();
	}
	
	/**
	 * 	Update Ip00485UserTagOccurrence with the passed value
	 *	@param number
	 */
	public void setIp00485UserTagOccurrence(int index,short number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485UserTagOccurrence(number);
	}

	public void setIp00485UserTagOccurrence(int index,int number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485UserTagOccurrence((short)number);
	}

	public void setIp00485UserTagOccurrence(int index,long number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485UserTagOccurrence((short)number);
	}



	/**
	 *	Returns the value of ip40004FinFileType
	 *	@return ip40004FinFileType
	 */
   public char[] getIp40004FinFileType() throws CFException  {              
   		return ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().getIp40004FinFileType();
   }

  
	/**
	*  set variable ip40004FinFileType
	*  @param value
	**/
   public void setIp40004FinFileType(char[] value) throws CFException {
      ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinFileType(value);
   } 

     /**
	 * 	Update Ip40004FinFileType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004FinFileType(char[] source, int sourceIndex) throws CFException {
      ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinFileType(source, sourceIndex);
   	
   }
   
   public void setIp40004FinFileType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinFileType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip40004FinFileType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FinFileType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinFileType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip40004FinFileType with another Field
	 *	@param value
	 */
   public void setIp40004FinFileType(Field source) {
      ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinFileType(source);
   }  
   
     /**
	 * 	Update Ip40004FinFileType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004FinFileType(Field source, int sourceIndex,int sourceLen) {
      ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinFileType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip40004FinFileType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FinFileType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinFileType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of ip00485UserTagSubfldNo
	 *	@return ip00485UserTagSubfldNo
	 */
	public short getIp00485UserTagSubfldNo(int index) throws CFException {        
   		return ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().getIp00485UserTagSubfldNo();
	}
	
	/**
	 * 	Update Ip00485UserTagSubfldNo with the passed value
	 *	@param number
	 */
	public void setIp00485UserTagSubfldNo(int index,short number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485UserTagSubfldNo(number);
	}

	public void setIp00485UserTagSubfldNo(int index,int number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485UserTagSubfldNo((short)number);
	}

	public void setIp00485UserTagSubfldNo(int index,long number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485UserTagSubfldNo((short)number);
	}



	/**
	 *	Returns the value of index800
	 *	@return index800
	 */
	public int getIndex800() throws CFException {        
   		return index800;
	}
	
	/**
	 * 	Update Index800 with the passed value
	 *	@param number
	 */
	public void setIndex800(int number)  throws CFException{
		McissuesCtx.this.setIndex800(number);
	}


	public void setIndex800(long number)  throws CFException{
		McissuesCtx.this.setIndex800((int)number);
	}


	/**
	 *	Returns the value of holidays500
	 *	@return holidays500
	 */   
	 public Holidays500 getHolidays500() {
   	return holidays500;
   }


	/**
	 *	Returns the value of ip00485MemberId
	 *	@return ip00485MemberId
	 */
	public short getIp00485MemberId(int index) throws CFException {        
   		return ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().getIp00485MemberId();
	}
	
	/**
	 * 	Update Ip00485MemberId with the passed value
	 *	@param number
	 */
	public void setIp00485MemberId(int index,short number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485MemberId(number);
	}

	public void setIp00485MemberId(int index,int number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485MemberId((short)number);
	}

	public void setIp00485MemberId(int index,long number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485MemberId((short)number);
	}



	/**
	 *	Returns the value of numSpaces
	 *	@return numSpaces
	 */
   public char[] getNumSpaces() throws CFException  {              
   		return work.getNumSpaces();
   }

  
	/**
	*  set variable numSpaces
	*  @param value
	**/
   public void setNumSpaces(char[] value) throws CFException {
      work.setNumSpaces(value);
   } 

     /**
	 * 	Update NumSpaces 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNumSpaces(char[] source, int sourceIndex) throws CFException {
      work.setNumSpaces(source, sourceIndex);
   	
   }
   
   public void setNumSpaces(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setNumSpaces(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update NumSpaces 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNumSpaces(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setNumSpaces(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update NumSpaces with another Field
	 *	@param value
	 */
   public void setNumSpaces(Field source) {
      work.setNumSpaces(source);
   }  
   
     /**
	 * 	Update NumSpaces 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNumSpaces(Field source, int sourceIndex,int sourceLen) {
      work.setNumSpaces(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update NumSpaces 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNumSpaces(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setNumSpaces(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00485UserTagStatus
	 *	@return ip00485UserTagStatus
	 */
   public char[] getIp00485UserTagStatus(int index) throws CFException  {              
   		return ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagStatus();
   }

  
	/**
	*  set variable ip00485UserTagStatus
	*  @param value
	**/
   public void setIp00485UserTagStatus(int index,char[] value) throws CFException {
      ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStatus(value);
   } 

     /**
	 * 	Update Ip00485UserTagStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00485UserTagStatus(int index,char[] source, int sourceIndex) throws CFException {
      ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStatus(source, sourceIndex);
   	
   }
   
   public void setIp00485UserTagStatus(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00485UserTagStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00485UserTagStatus(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00485UserTagStatus with another Field
	 *	@param value
	 */
   public void setIp00485UserTagStatus(int index,Field source) {
      ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStatus(source);
   }  
   
     /**
	 * 	Update Ip00485UserTagStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00485UserTagStatus(int index,Field source, int sourceIndex,int sourceLen) {
      ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00485UserTagStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00485UserTagStatus(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "1" for isExclusionOff88100()
	 *	@return  Returns true if isExclusionOff88100() is "1"
	 */
   public boolean isExclusionOff88100() throws CFException {
      return work.isExclusionOff88100();
   }

	/**
	*  set values "1"
	*/
   	public void setExclusionOff88100True()  throws CFException{  			
    	work.setExclusionOff88100True();
   	}
	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public int getIdx() throws CFException {
   		return work.getIdx();
	}


	/**
	 *	Returns String value of idx
	 *	@return idx
	 */
	public char[]  getIdxString() throws CFException {
	     return String.valueOf(work.getIdxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean idxIsNumeric()  throws CFException{
	    return work.idxIsNumeric();
	}

	/**
	 * 	Update Idx with the passed value
	 *	@param number
	 */
	public void setIdx(int number)  throws CFException{
		work.setIdx(number);
	}
	

	public void setIdx(long number)  throws CFException{
	    work.setIdx(number);
	}
	
	
	/**
	 * 	Update Idx with the passed value
	 *	@param value (String or char[])
	 */
	public void setIdx(char[] value)  throws CFException {
		work.setIdx(value);
	}
	
	/**
	 * 	Update Idx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIdxString(char[] value)  throws CFException{
		work.setIdx(value);
	}	

	/**
	 *	Returns the value of xmlText
	 *	@return xmlText
	 */
   public char[] getXmlText() throws CFException  {              
   		return work.getXmlText();
   }

  
	/**
	*  set variable xmlText
	*  @param value
	**/
   public void setXmlText(char[] value) throws CFException {
      work.setXmlText(value);
   } 


public void setIp66601UserT(int ip66601UserT) { 
    McissuesCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return McissuesCtx.this.ip66601UserT;
}
	/**
	 *	Test condition "2" for isExclusionOn88100()
	 *	@return  Returns true if isExclusionOn88100() is "2"
	 */
   public boolean isExclusionOn88100() throws CFException {
      return work.isExclusionOn88100();
   }

	/**
	*  set values "2"
	*/
   	public void setExclusionOn88100True()  throws CFException{  			
    	work.setExclusionOn88100True();
   	}
	/**
	 *	Returns the value of ip40004IntMsgHdrRecGroup
	 *	@return ip40004IntMsgHdrRecGroup
	 */   
	 public Ip40004IntMsgHdrRecGroup getIp40004IntMsgHdrRecGroup() {
   	return ip40004IntMsgHdrRecGroup;
   }


	/**
	 *	Returns the value of charWs
	 *	@return charWs
	 */
   public char[] getCharWs() throws CFException  {              
   		return work.getCharWs();
   }

  
	/**
	*  set variable charWs
	*  @param value
	**/
   public void setCharWs(char[] value) throws CFException {
      work.setCharWs(value);
   } 

	/**
	 *	Returns the value of ip00485UserTagStart
	 *	@return ip00485UserTagStart
	 */
	public short getIp00485UserTagStart(int index) throws CFException {        
   		return ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagStart();
	}
	
	/**
	 * 	Update Ip00485UserTagStart with the passed value
	 *	@param number
	 */
	public void setIp00485UserTagStart(int index,short number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStart(number);
	}

	public void setIp00485UserTagStart(int index,int number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStart((short)number);
	}

	public void setIp00485UserTagStart(int index,long number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStart((short)number);
	}



	/**
	 *	Returns the value of strt800
	 *	@return strt800
	 */
	public short getStrt800() throws CFException {        
   		return work.getStrt800();
	}
	
	/**
	 * 	Update Strt800 with the passed value
	 *	@param number
	 */
	public void setStrt800(short number)  throws CFException{
		work.setStrt800(number);
	}

	public void setStrt800(int number)  throws CFException{
		work.setStrt800((short)number);
	}

	public void setStrt800(long number)  throws CFException{
		work.setStrt800((short)number);
	}



	/**
	 *	Returns the value of ip40004FileIdFinan
	 *	@return ip40004FileIdFinan
	 */   
	 public Ip40004FileIdFinan getIp40004FileIdFinan() {
   	return ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan();
   }

   /**
	* 	Update Ip40004FileIdFinan with the passed value
	*	@param value
	*/
   public void setIp40004FileIdFinan(char[] value) throws CFException {
      ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().setIp40004FileIdFinan(value);
   }   

     /**
	 * 	Update Ip40004FileIdFinan 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp40004FileIdFinan(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().setIp40004FileIdFinan(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip40004FileIdFinan 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FileIdFinan(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().setIp40004FileIdFinan(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip40004FileIdFinan with another Field
	 *	@param value
	 */
   public void setIp40004FileIdFinan(Field source) {
   	ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().setIp40004FileIdFinan(source);
   }  
   
     /**
	 * 	Update Ip40004FileIdFinan 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp40004FileIdFinan(Field source, int sourceIndex,int sourceLen) {
   	ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().setIp40004FileIdFinan(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip40004FileIdFinan 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FileIdFinan(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().setIp40004FileIdFinan(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00485MemberEntries
	 *	@return ip00485MemberEntries
	 */
	public long getIp00485MemberEntries() throws CFException {        
   		return ip00485MemberEntryInfo.getIp00485MemberEntries();
	}
	
	/**
	 * 	Update Ip00485MemberEntries with the passed value
	 *	@param number
	 */
	public void setIp00485MemberEntries(long number)  throws CFException{
		ip00485MemberEntryInfo.setIp00485MemberEntries(number);
	}



	/**
	 *	Returns the value of ip40004FinFileRefDate
	 *	@return ip40004FinFileRefDate
	 */
	public long getIp40004FinFileRefDate() throws CFException {
   		return ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().getIp40004FinFileRefDate();
	}


	/**
	 *	Returns String value of ip40004FinFileRefDate
	 *	@return ip40004FinFileRefDate
	 */
	public char[]  getIp40004FinFileRefDateString() throws CFException {
	     return String.valueOf(ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().getIp40004FinFileRefDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004FinFileRefDateIsNumeric()  throws CFException{
	    return ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().ip40004FinFileRefDateIsNumeric();
	}

	/**
	 * 	Update Ip40004FinFileRefDate with the passed value
	 *	@param number
	 */
	public void setIp40004FinFileRefDate(long number)  throws CFException{
		ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinFileRefDate(number);
	}
	

	
	/**
	 * 	Update Ip40004FinFileRefDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004FinFileRefDate(char[] value)  throws CFException {
		ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinFileRefDate(value);
	}
	
	/**
	 * 	Update Ip40004FinFileRefDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004FinFileRefDateString(char[] value)  throws CFException{
		ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinFileRefDate(value);
	}	

	/**
	 *	Returns the value of prevTransType801
	 *	@return prevTransType801
	 */
   public char[] getPrevTransType801() throws CFException  {              
   		return work.getPrevTransType801();
   }

  
	/**
	*  set variable prevTransType801
	*  @param value
	**/
   public void setPrevTransType801(char[] value) throws CFException {
      work.setPrevTransType801(value);
   } 

	/**
	 *	Returns the value of ip00321ReplTextCount
	 *	@return ip00321ReplTextCount
	 */
	public int getIp00321ReplTextCount() throws CFException {
   		return work.getIp00321ReplTextCount();
	}


	/**
	 *	Returns String value of ip00321ReplTextCount
	 *	@return ip00321ReplTextCount
	 */
	public char[]  getIp00321ReplTextCountString() throws CFException {
	     return String.valueOf(work.getIp00321ReplTextCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00321ReplTextCountIsNumeric()  throws CFException{
	    return work.ip00321ReplTextCountIsNumeric();
	}

	/**
	 * 	Update Ip00321ReplTextCount with the passed value
	 *	@param number
	 */
	public void setIp00321ReplTextCount(int number)  throws CFException{
		work.setIp00321ReplTextCount(number);
	}
	

	public void setIp00321ReplTextCount(long number)  throws CFException{
	    work.setIp00321ReplTextCount(number);
	}
	
	
	/**
	 * 	Update Ip00321ReplTextCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00321ReplTextCount(char[] value)  throws CFException {
		work.setIp00321ReplTextCount(value);
	}
	
	/**
	 * 	Update Ip00321ReplTextCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00321ReplTextCountString(char[] value)  throws CFException{
		work.setIp00321ReplTextCount(value);
	}	


public void setHolidayIndex500(int holidayIndex500) { 
    McissuesCtx.this.holidayIndex500 = holidayIndex500;
}

public int getHolidayIndex500() { 
    return McissuesCtx.this.holidayIndex500;
}
	/**
	 *	Returns the value of transType701
	 *	@return transType701
	 */
   public char[] getTransType701() throws CFException  {              
   		return work.getTransType701();
   }

  
	/**
	*  set variable transType701
	*  @param value
	**/
   public void setTransType701(char[] value) throws CFException {
      work.setTransType701(value);
   } 

	/**
	 *	Returns the value of interimDateX800
	 *	@return interimDateX800
	 */
   public char[] getInterimDateX800() throws CFException  {              
   		return interimDateXGroup800.getInterimDateX800();
   }

  
	/**
	*  set variable interimDateX800
	*  @param value
	**/
   public void setInterimDateX800(char[] value) throws CFException {
      interimDateXGroup800.setInterimDateX800(value);
   } 

     /**
	 * 	Update InterimDateX800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInterimDateX800(char[] source, int sourceIndex) throws CFException {
      interimDateXGroup800.setInterimDateX800(source, sourceIndex);
   	
   }
   
   public void setInterimDateX800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      interimDateXGroup800.setInterimDateX800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update InterimDateX800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInterimDateX800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      interimDateXGroup800.setInterimDateX800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update InterimDateX800 with another Field
	 *	@param value
	 */
   public void setInterimDateX800(Field source) {
      interimDateXGroup800.setInterimDateX800(source);
   }  
   
     /**
	 * 	Update InterimDateX800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInterimDateX800(Field source, int sourceIndex,int sourceLen) {
      interimDateXGroup800.setInterimDateX800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update InterimDateX800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInterimDateX800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      interimDateXGroup800.setInterimDateX800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip40004FinFileSeqNum
	 *	@return ip40004FinFileSeqNum
	 */
	public long getIp40004FinFileSeqNum() throws CFException {
   		return ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().getIp40004FinFileSeqNum();
	}


	/**
	 *	Returns String value of ip40004FinFileSeqNum
	 *	@return ip40004FinFileSeqNum
	 */
	public char[]  getIp40004FinFileSeqNumString() throws CFException {
	     return String.valueOf(ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().getIp40004FinFileSeqNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004FinFileSeqNumIsNumeric()  throws CFException{
	    return ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().ip40004FinFileSeqNumIsNumeric();
	}

	/**
	 * 	Update Ip40004FinFileSeqNum with the passed value
	 *	@param number
	 */
	public void setIp40004FinFileSeqNum(long number)  throws CFException{
		ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinFileSeqNum(number);
	}
	

	
	/**
	 * 	Update Ip40004FinFileSeqNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004FinFileSeqNum(char[] value)  throws CFException {
		ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinFileSeqNum(value);
	}
	
	/**
	 * 	Update Ip40004FinFileSeqNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004FinFileSeqNumString(char[] value)  throws CFException{
		ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinFileSeqNum(value);
	}	

	/**
	 *	Returns the value of ip33701TargetCurExp
	 *	@return ip33701TargetCurExp
	 */
   public char[] getIp33701TargetCurExp() throws CFException  {              
   		return ip33701TargetCurExp9Group.getIp33701TargetCurExp();
   }

  
	/**
	*  set variable ip33701TargetCurExp
	*  @param value
	**/
   public void setIp33701TargetCurExp(char[] value) throws CFException {
      ip33701TargetCurExp9Group.setIp33701TargetCurExp(value);
   } 

     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701TargetCurExp(char[] source, int sourceIndex) throws CFException {
      ip33701TargetCurExp9Group.setIp33701TargetCurExp(source, sourceIndex);
   	
   }
   
   public void setIp33701TargetCurExp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip33701TargetCurExp9Group.setIp33701TargetCurExp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701TargetCurExp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701TargetCurExp9Group.setIp33701TargetCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip33701TargetCurExp with another Field
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source) {
      ip33701TargetCurExp9Group.setIp33701TargetCurExp(source);
   }  
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source, int sourceIndex,int sourceLen) {
      ip33701TargetCurExp9Group.setIp33701TargetCurExp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701TargetCurExp9Group.setIp33701TargetCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public McissuesCtx getMcissuesCtx() {
            return McissuesCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abBusslBussiValues800.hashCode();
        str += mapRow1ValGroup800.hashCode();
        str += emptyIndexGroup800.hashCode();
        str += interimDateXGroup800.hashCode();
        str += ip40004IntMsgHdrRecGroup.hashCode();
        str += holidays500.hashCode();
        str += ip33701TargetCurExp9Group.hashCode();
        str += work.hashCode();
        str += ip66601UserTagInformation.hashCode();
        str += ip66102IpmMsg.hashCode();
        str += ip00485MemberEntryInfo.hashCode();
       return str.hashCode();
    }

    public MainSplit2OutCtx clone() {
        MainSplit2OutCtx cloneObj = new MainSplit2OutCtx();
        cloneObj.abBusslBussiValues800 = new AbBusslBussiValues800();
        cloneObj.abBusslBussiValues800.set(abBusslBussiValues800.getClonedField());
        cloneObj.mapRow1ValGroup800 = new MapRow1ValGroup800();
        cloneObj.mapRow1ValGroup800.set(mapRow1ValGroup800.getClonedField());
        cloneObj.emptyIndexGroup800 = new EmptyIndexGroup800();
        cloneObj.emptyIndexGroup800.set(emptyIndexGroup800.getClonedField());
        cloneObj.interimDateXGroup800 = new InterimDateXGroup800();
        cloneObj.interimDateXGroup800.set(interimDateXGroup800.getClonedField());
        cloneObj.ip40004IntMsgHdrRecGroup = new Ip40004IntMsgHdrRecGroup();
        cloneObj.ip40004IntMsgHdrRecGroup.set(ip40004IntMsgHdrRecGroup.getClonedField());
        cloneObj.holidays500 = new Holidays500();
        cloneObj.holidays500.set(holidays500.getClonedField());
        cloneObj.ip33701TargetCurExp9Group = new Ip33701TargetCurExp9Group();
        cloneObj.ip33701TargetCurExp9Group.set(ip33701TargetCurExp9Group.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.ip00485MemberEntryInfo = new Ip00485MemberEntryInfo();
        cloneObj.ip00485MemberEntryInfo.set(ip00485MemberEntryInfo.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit2OutCtx getMainSplit2OutCtx() {
            return new MainSplit2OutCtx();
    }
     public class MainSplit3InCtx implements Cloneable {
     A a = McissuesCtx.this.getA();
     Work work = McissuesCtx.this.getWork();
     C c = McissuesCtx.this.getC();
     Cf50005ClearingGrp cf50005ClearingGrp = McissuesCtx.this.getCf50005ClearingGrp();

	/**
	 *	Returns the value of prevMccCode801
	 *	@return prevMccCode801
	 */
   public char[] getPrevMccCode801() throws CFException  {              
   		return work.getPrevMccCode801();
   }

  
	/**
	*  set variable prevMccCode801
	*  @param value
	**/
   public void setPrevMccCode801(char[] value) throws CFException {
      work.setPrevMccCode801(value);
   } 

	/**
	 *	Test condition "2" for isExclusionOn88100()
	 *	@return  Returns true if isExclusionOn88100() is "2"
	 */
   public boolean isExclusionOn88100() throws CFException {
      return work.isExclusionOn88100();
   }

	/**
	*  set values "2"
	*/
   	public void setExclusionOn88100True()  throws CFException{  			
    	work.setExclusionOn88100True();
   	}
	/**
	 *	Returns the value of a
	 *	@return a
	 */   
	 public A getA() {
   	return a;
   }


	/**
	 *	Returns the value of ecbRateDiff800
	 *	@return ecbRateDiff800
	 */
	public BigDecimal getEcbRateDiff800() throws CFException {
   		return work.getEcbRateDiff800();
	}

    /**
	 *	Returns the String value of ecbRateDiff800
	 *	@return ecbRateDiff800
	 */
	public char[]  getEcbRateDiff800ActualString()  throws CFException{
	    return work.getEcbRateDiff800ActualString();
	}

	 /**
     *	Returns String value of ecbRateDiff800
     *	@return ecbRateDiff800
     */
    public char[]  getEcbRateDiff800String() throws CFException {
         return work.getEcbRateDiff800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ecbRateDiff800IsNumeric() {
        return work.ecbRateDiff800IsNumeric();
    }
	/**
	 * 	Update EcbRateDiff800 with the passed number
	 *	@param number
	 */
	public void setEcbRateDiff800(BigDecimal number)  throws CFException{
		work.setEcbRateDiff800(number);
   }

	/**
	 * 	Update EcbRateDiff800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setEcbRateDiff800(char[] value)  throws CFException{
		work.setEcbRateDiff800(value);
	}   

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of transType701
	 *	@return transType701
	 */
   public char[] getTransType701() throws CFException  {              
   		return work.getTransType701();
   }

  
	/**
	*  set variable transType701
	*  @param value
	**/
   public void setTransType701(char[] value) throws CFException {
      work.setTransType701(value);
   } 

	/**
	 *	Returns the value of b
	 *	@return b
	 */
   public char[] getB() throws CFException  {              
   		return work.getB();
   }

  
	/**
	*  set variable b
	*  @param value
	**/
   public void setB(char[] value) throws CFException {
      work.setB(value);
   } 

	/**
	 *	Returns the value of c
	 *	@return c
	 */   
	 public C getC() {
   	return c;
   }


	/**
	 *	Returns the value of d
	 *	@return d
	 */
   public char[] getD() throws CFException  {              
   		return work.getD();
   }

  
	/**
	*  set variable d
	*  @param value
	**/
   public void setD(char[] value) throws CFException {
      work.setD(value);
   } 

	/**
	 *	Returns the value of cf50005ClearingGrp
	 *	@return cf50005ClearingGrp
	 */   
	 public Cf50005ClearingGrp getCf50005ClearingGrp() {
   	return cf50005ClearingGrp;
   }


	/**
	 *	Returns the value of aLen
	 *	@return aLen
	 */
	public short getALen() throws CFException {        
   		return work.getALen();
	}
	
	/**
	 * 	Update ALen with the passed value
	 *	@param number
	 */
	public void setALen(short number)  throws CFException{
		work.setALen(number);
	}

	public void setALen(int number)  throws CFException{
		work.setALen((short)number);
	}

	public void setALen(long number)  throws CFException{
		work.setALen((short)number);
	}



	/**
	 *	Returns the value of dLen
	 *	@return dLen
	 */
	public short getDLen() throws CFException {        
   		return work.getDLen();
	}
	
	/**
	 * 	Update DLen with the passed value
	 *	@param number
	 */
	public void setDLen(short number)  throws CFException{
		work.setDLen(number);
	}

	public void setDLen(int number)  throws CFException{
		work.setDLen((short)number);
	}

	public void setDLen(long number)  throws CFException{
		work.setDLen((short)number);
	}




        public McissuesCtx getMcissuesCtx() {
            return McissuesCtx.this;
        }

        public MainSplit3OutCtx getMainSplit3OutCtx() {
            return new MainSplit3OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += a.hashCode();
        str += work.hashCode();
        str += c.hashCode();
        str += cf50005ClearingGrp.hashCode();
       return str.hashCode();
    }

    public MainSplit3InCtx clone() {
        MainSplit3InCtx cloneObj = new MainSplit3InCtx();
        cloneObj.a = new A();
        cloneObj.a.set(a.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.c = new C();
        cloneObj.c.set(c.getClonedField());
        cloneObj.cf50005ClearingGrp = new Cf50005ClearingGrp();
        cloneObj.cf50005ClearingGrp.set(cf50005ClearingGrp.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit3InCtx getMainSplit3InCtx() {
            return new MainSplit3InCtx();
    }
     public class MainSplit3OutCtx implements Cloneable {
     A a = McissuesCtx.this.getA();
     Work work = McissuesCtx.this.getWork();
     C c = McissuesCtx.this.getC();
     Cf50005ClearingGrp cf50005ClearingGrp = McissuesCtx.this.getCf50005ClearingGrp();

	/**
	 *	Returns the value of cLen
	 *	@return cLen
	 */
	public short getCLen() throws CFException {        
   		return work.getCLen();
	}
	
	/**
	 * 	Update CLen with the passed value
	 *	@param number
	 */
	public void setCLen(short number)  throws CFException{
		work.setCLen(number);
	}

	public void setCLen(int number)  throws CFException{
		work.setCLen((short)number);
	}

	public void setCLen(long number)  throws CFException{
		work.setCLen((short)number);
	}



	/**
	 *	Returns the value of valueOfPds158s3800
	 *	@return valueOfPds158s3800
	 */
   public char[] getValueOfPds158s3800() throws CFException  {              
   		return work.getValueOfPds158s3800();
   }

  
	/**
	*  set variable valueOfPds158s3800
	*  @param value
	**/
   public void setValueOfPds158s3800(char[] value) throws CFException {
      work.setValueOfPds158s3800(value);
   } 

	/**
	 *	Returns the value of valueOfPds158s2800
	 *	@return valueOfPds158s2800
	 */
   public char[] getValueOfPds158s2800() throws CFException  {              
   		return work.getValueOfPds158s2800();
   }

  
	/**
	*  set variable valueOfPds158s2800
	*  @param value
	**/
   public void setValueOfPds158s2800(char[] value) throws CFException {
      work.setValueOfPds158s2800(value);
   } 

	/**
	 *	Returns the value of var
	 *	@return var
	 */
   public char[] getVar() throws CFException  {              
   		return work.getVar();
   }

  
	/**
	*  set variable var
	*  @param value
	**/
   public void setVar(char[] value) throws CFException {
      work.setVar(value);
   } 

	/**
	 *	Returns the value of clearingDtTm9800
	 *	@return clearingDtTm9800
	 */
	public long getClearingDtTm9800() throws CFException {
   		return work.getClearingDtTm9800();
	}


	/**
	 *	Returns String value of clearingDtTm9800
	 *	@return clearingDtTm9800
	 */
	public char[]  getClearingDtTm9800String() throws CFException {
	     return String.valueOf(work.getClearingDtTm9800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean clearingDtTm9800IsNumeric()  throws CFException{
	    return work.clearingDtTm9800IsNumeric();
	}

	/**
	 * 	Update ClearingDtTm9800 with the passed value
	 *	@param number
	 */
	public void setClearingDtTm9800(long number)  throws CFException{
		work.setClearingDtTm9800(number);
	}
	

	
	/**
	 * 	Update ClearingDtTm9800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9800(char[] value)  throws CFException {
		work.setClearingDtTm9800(value);
	}
	
	/**
	 * 	Update ClearingDtTm9800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9800String(char[] value)  throws CFException{
		work.setClearingDtTm9800(value);
	}	

	/**
	 *	Returns the value of aVar4
	 *	@return aVar4
	 */
   public char[] getAVar4() throws CFException  {              
   		return a.getAVar4();
   }

  
	/**
	*  set variable aVar4
	*  @param value
	**/
   public void setAVar4(char[] value) throws CFException {
      a.setAVar4(value);
   } 

     /**
	 * 	Update AVar4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAVar4(char[] source, int sourceIndex) throws CFException {
      a.setAVar4(source, sourceIndex);
   	
   }
   
   public void setAVar4(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      a.setAVar4(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AVar4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAVar4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      a.setAVar4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AVar4 with another Field
	 *	@param value
	 */
   public void setAVar4(Field source) {
      a.setAVar4(source);
   }  
   
     /**
	 * 	Update AVar4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAVar4(Field source, int sourceIndex,int sourceLen) {
      a.setAVar4(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AVar4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAVar4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      a.setAVar4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of b
	 *	@return b
	 */
   public char[] getB() throws CFException  {              
   		return work.getB();
   }

  
	/**
	*  set variable b
	*  @param value
	**/
   public void setB(char[] value) throws CFException {
      work.setB(value);
   } 

	/**
	 *	Returns the value of prevTransType801
	 *	@return prevTransType801
	 */
   public char[] getPrevTransType801() throws CFException  {              
   		return work.getPrevTransType801();
   }

  
	/**
	*  set variable prevTransType801
	*  @param value
	**/
   public void setPrevTransType801(char[] value) throws CFException {
      work.setPrevTransType801(value);
   } 

	/**
	 *	Returns the value of cVar2
	 *	@return cVar2
	 */
   public char[] getCVar2() throws CFException  {              
   		return c.getCVar2();
   }

  
	/**
	*  set variable cVar2
	*  @param value
	**/
   public void setCVar2(char[] value) throws CFException {
      c.setCVar2(value);
   } 

     /**
	 * 	Update CVar2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCVar2(char[] source, int sourceIndex) throws CFException {
      c.setCVar2(source, sourceIndex);
   	
   }
   
   public void setCVar2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      c.setCVar2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CVar2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCVar2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c.setCVar2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CVar2 with another Field
	 *	@param value
	 */
   public void setCVar2(Field source) {
      c.setCVar2(source);
   }  
   
     /**
	 * 	Update CVar2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCVar2(Field source, int sourceIndex,int sourceLen) {
      c.setCVar2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CVar2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCVar2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c.setCVar2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of d
	 *	@return d
	 */
   public char[] getD() throws CFException  {              
   		return work.getD();
   }

  
	/**
	*  set variable d
	*  @param value
	**/
   public void setD(char[] value) throws CFException {
      work.setD(value);
   } 

	/**
	 *	Returns the value of aLen
	 *	@return aLen
	 */
	public short getALen() throws CFException {        
   		return work.getALen();
	}
	
	/**
	 * 	Update ALen with the passed value
	 *	@param number
	 */
	public void setALen(short number)  throws CFException{
		work.setALen(number);
	}

	public void setALen(int number)  throws CFException{
		work.setALen((short)number);
	}

	public void setALen(long number)  throws CFException{
		work.setALen((short)number);
	}



	/**
	 *	Returns the value of cVar1
	 *	@return cVar1
	 */
   public char[] getCVar1() throws CFException  {              
   		return c.getCVar1();
   }

  
	/**
	*  set variable cVar1
	*  @param value
	**/
   public void setCVar1(char[] value) throws CFException {
      c.setCVar1(value);
   } 

     /**
	 * 	Update CVar1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCVar1(char[] source, int sourceIndex) throws CFException {
      c.setCVar1(source, sourceIndex);
   	
   }
   
   public void setCVar1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      c.setCVar1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CVar1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCVar1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c.setCVar1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CVar1 with another Field
	 *	@param value
	 */
   public void setCVar1(Field source) {
      c.setCVar1(source);
   }  
   
     /**
	 * 	Update CVar1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCVar1(Field source, int sourceIndex,int sourceLen) {
      c.setCVar1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CVar1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCVar1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c.setCVar1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of a
	 *	@return a
	 */   
	 public A getA() {
   	return a;
   }


	/**
	 *	Returns the value of ecbRateDiff800
	 *	@return ecbRateDiff800
	 */
	public BigDecimal getEcbRateDiff800() throws CFException {
   		return work.getEcbRateDiff800();
	}

    /**
	 *	Returns the String value of ecbRateDiff800
	 *	@return ecbRateDiff800
	 */
	public char[]  getEcbRateDiff800ActualString()  throws CFException{
	    return work.getEcbRateDiff800ActualString();
	}

	 /**
     *	Returns String value of ecbRateDiff800
     *	@return ecbRateDiff800
     */
    public char[]  getEcbRateDiff800String() throws CFException {
         return work.getEcbRateDiff800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ecbRateDiff800IsNumeric() {
        return work.ecbRateDiff800IsNumeric();
    }
	/**
	 * 	Update EcbRateDiff800 with the passed number
	 *	@param number
	 */
	public void setEcbRateDiff800(BigDecimal number)  throws CFException{
		work.setEcbRateDiff800(number);
   }

	/**
	 * 	Update EcbRateDiff800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setEcbRateDiff800(char[] value)  throws CFException{
		work.setEcbRateDiff800(value);
	}   

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of transType701
	 *	@return transType701
	 */
   public char[] getTransType701() throws CFException  {              
   		return work.getTransType701();
   }

  
	/**
	*  set variable transType701
	*  @param value
	**/
   public void setTransType701(char[] value) throws CFException {
      work.setTransType701(value);
   } 

	/**
	 *	Returns the value of aVar2
	 *	@return aVar2
	 */
   public char[] getAVar2() throws CFException  {              
   		return a.getAVar2();
   }

  
	/**
	*  set variable aVar2
	*  @param value
	**/
   public void setAVar2(char[] value) throws CFException {
      a.setAVar2(value);
   } 

     /**
	 * 	Update AVar2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAVar2(char[] source, int sourceIndex) throws CFException {
      a.setAVar2(source, sourceIndex);
   	
   }
   
   public void setAVar2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      a.setAVar2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AVar2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAVar2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      a.setAVar2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AVar2 with another Field
	 *	@param value
	 */
   public void setAVar2(Field source) {
      a.setAVar2(source);
   }  
   
     /**
	 * 	Update AVar2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAVar2(Field source, int sourceIndex,int sourceLen) {
      a.setAVar2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AVar2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAVar2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      a.setAVar2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bLen
	 *	@return bLen
	 */
	public short getBLen() throws CFException {        
   		return work.getBLen();
	}
	
	/**
	 * 	Update BLen with the passed value
	 *	@param number
	 */
	public void setBLen(short number)  throws CFException{
		work.setBLen(number);
	}

	public void setBLen(int number)  throws CFException{
		work.setBLen((short)number);
	}

	public void setBLen(long number)  throws CFException{
		work.setBLen((short)number);
	}



	/**
	 *	Returns the value of c
	 *	@return c
	 */   
	 public C getC() {
   	return c;
   }


	/**
	 *	Returns the value of cf50005ClearingGrp
	 *	@return cf50005ClearingGrp
	 */   
	 public Cf50005ClearingGrp getCf50005ClearingGrp() {
   	return cf50005ClearingGrp;
   }


	/**
	 *	Returns the value of aVar1
	 *	@return aVar1
	 */
   public char[] getAVar1() throws CFException  {              
   		return a.getAVar1();
   }

  
	/**
	*  set variable aVar1
	*  @param value
	**/
   public void setAVar1(char[] value) throws CFException {
      a.setAVar1(value);
   } 

     /**
	 * 	Update AVar1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAVar1(char[] source, int sourceIndex) throws CFException {
      a.setAVar1(source, sourceIndex);
   	
   }
   
   public void setAVar1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      a.setAVar1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AVar1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAVar1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      a.setAVar1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AVar1 with another Field
	 *	@param value
	 */
   public void setAVar1(Field source) {
      a.setAVar1(source);
   }  
   
     /**
	 * 	Update AVar1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAVar1(Field source, int sourceIndex,int sourceLen) {
      a.setAVar1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AVar1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAVar1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      a.setAVar1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of cVar4
	 *	@return cVar4
	 */
   public char[] getCVar4() throws CFException  {              
   		return c.getCVar4();
   }

  
	/**
	*  set variable cVar4
	*  @param value
	**/
   public void setCVar4(char[] value) throws CFException {
      c.setCVar4(value);
   } 

     /**
	 * 	Update CVar4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCVar4(char[] source, int sourceIndex) throws CFException {
      c.setCVar4(source, sourceIndex);
   	
   }
   
   public void setCVar4(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      c.setCVar4(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CVar4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCVar4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c.setCVar4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CVar4 with another Field
	 *	@param value
	 */
   public void setCVar4(Field source) {
      c.setCVar4(source);
   }  
   
     /**
	 * 	Update CVar4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCVar4(Field source, int sourceIndex,int sourceLen) {
      c.setCVar4(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CVar4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCVar4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c.setCVar4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dLen
	 *	@return dLen
	 */
	public short getDLen() throws CFException {        
   		return work.getDLen();
	}
	
	/**
	 * 	Update DLen with the passed value
	 *	@param number
	 */
	public void setDLen(short number)  throws CFException{
		work.setDLen(number);
	}

	public void setDLen(int number)  throws CFException{
		work.setDLen((short)number);
	}

	public void setDLen(long number)  throws CFException{
		work.setDLen((short)number);
	}




        public McissuesCtx getMcissuesCtx() {
            return McissuesCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += a.hashCode();
        str += work.hashCode();
        str += c.hashCode();
        str += cf50005ClearingGrp.hashCode();
       return str.hashCode();
    }

    public MainSplit3OutCtx clone() {
        MainSplit3OutCtx cloneObj = new MainSplit3OutCtx();
        cloneObj.a = new A();
        cloneObj.a.set(a.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.c = new C();
        cloneObj.c.set(c.getClonedField());
        cloneObj.cf50005ClearingGrp = new Cf50005ClearingGrp();
        cloneObj.cf50005ClearingGrp.set(cf50005ClearingGrp.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit3OutCtx getMainSplit3OutCtx() {
            return new MainSplit3OutCtx();
    }
     public class MainSplit4InCtx implements Cloneable {
     InxBGroup inxBGroup = McissuesCtx.this.getInxBGroup();
     SortKeyLthTable700 sortKeyLthTable700 = McissuesCtx.this.getSortKeyLthTable700();
     PreEditVersionGroup300 preEditVersionGroup300 = McissuesCtx.this.getPreEditVersionGroup300();
     PeVersionNumMsg600 peVersionNumMsg600 = McissuesCtx.this.getPeVersionNumMsg600();
     Cf20004TableData cf20004TableData = McissuesCtx.this.getCf20004TableData();
     InputVars800 inputVars800 = McissuesCtx.this.getInputVars800();
     ClearingDtTm9Grp900 clearingDtTm9Grp900 = McissuesCtx.this.getClearingDtTm9Grp900();
     Work work = McissuesCtx.this.getWork();
     Ip500041Rec ip500041Rec = McissuesCtx.this.getIp500041Rec();
     ClearingDtTm9ShortGrp900 clearingDtTm9ShortGrp900 = McissuesCtx.this.getClearingDtTm9ShortGrp900();
     Cf50005ClearingGrp cf50005ClearingGrp = McissuesCtx.this.getCf50005ClearingGrp();
     Ip31021SummaryControlCard ip31021SummaryControlCard = McissuesCtx.this.getIp31021SummaryControlCard();
     TableArray tableArray = McissuesCtx.this.getTableArray();

	/**
	 *	Returns the value of peRelease300
	 *	@return peRelease300
	 */
   public char[] getPeRelease300() throws CFException  {              
   		return preEditVersionGroup300.getPreEditVersion300Redefined().getPeRelease300();
   }

  
	/**
	*  set variable peRelease300
	*  @param value
	**/
   public void setPeRelease300(char[] value) throws CFException {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeRelease300(value);
   } 

     /**
	 * 	Update PeRelease300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPeRelease300(char[] source, int sourceIndex) throws CFException {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeRelease300(source, sourceIndex);
   	
   }
   
   public void setPeRelease300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeRelease300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PeRelease300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPeRelease300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeRelease300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PeRelease300 with another Field
	 *	@param value
	 */
   public void setPeRelease300(Field source) {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeRelease300(source);
   }  
   
     /**
	 * 	Update PeRelease300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPeRelease300(Field source, int sourceIndex,int sourceLen) {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeRelease300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PeRelease300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPeRelease300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeRelease300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of clearingDtTm9800
	 *	@return clearingDtTm9800
	 */
	public long getClearingDtTm9800() throws CFException {
   		return work.getClearingDtTm9800();
	}


	/**
	 *	Returns String value of clearingDtTm9800
	 *	@return clearingDtTm9800
	 */
	public char[]  getClearingDtTm9800String() throws CFException {
	     return String.valueOf(work.getClearingDtTm9800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean clearingDtTm9800IsNumeric()  throws CFException{
	    return work.clearingDtTm9800IsNumeric();
	}

	/**
	 * 	Update ClearingDtTm9800 with the passed value
	 *	@param number
	 */
	public void setClearingDtTm9800(long number)  throws CFException{
		work.setClearingDtTm9800(number);
	}
	

	
	/**
	 * 	Update ClearingDtTm9800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9800(char[] value)  throws CFException {
		work.setClearingDtTm9800(value);
	}
	
	/**
	 * 	Update ClearingDtTm9800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9800String(char[] value)  throws CFException{
		work.setClearingDtTm9800(value);
	}	

	/**
	 *	Returns the value of cf50005ClearingDtN
	 *	@return cf50005ClearingDtN
	 */
	public long getCf50005ClearingDtN() throws CFException {
   		return cf50005ClearingGrp.getCf50005ClearingDtN();
	}


	/**
	 *	Returns String value of cf50005ClearingDtN
	 *	@return cf50005ClearingDtN
	 */
	public char[]  getCf50005ClearingDtNString() throws CFException {
	     return String.valueOf(cf50005ClearingGrp.getCf50005ClearingDtNString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cf50005ClearingDtNIsNumeric()  throws CFException{
	    return cf50005ClearingGrp.cf50005ClearingDtNIsNumeric();
	}

	/**
	 * 	Update Cf50005ClearingDtN with the passed value
	 *	@param number
	 */
	public void setCf50005ClearingDtN(long number)  throws CFException{
		cf50005ClearingGrp.setCf50005ClearingDtN(number);
	}
	

	
	/**
	 * 	Update Cf50005ClearingDtN with the passed value
	 *	@param value (String or char[])
	 */
	public void setCf50005ClearingDtN(char[] value)  throws CFException {
		cf50005ClearingGrp.setCf50005ClearingDtN(value);
	}
	
	/**
	 * 	Update Cf50005ClearingDtN with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCf50005ClearingDtNString(char[] value)  throws CFException{
		cf50005ClearingGrp.setCf50005ClearingDtN(value);
	}	

	/**
	 *	Returns the value of peVerYy300
	 *	@return peVerYy300
	 */
   public char[] getPeVerYy300() throws CFException  {              
   		return preEditVersionGroup300.getPreEditVersion300Redefined().getPeVerYy300();
   }

  
	/**
	*  set variable peVerYy300
	*  @param value
	**/
   public void setPeVerYy300(char[] value) throws CFException {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeVerYy300(value);
   } 

     /**
	 * 	Update PeVerYy300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPeVerYy300(char[] source, int sourceIndex) throws CFException {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeVerYy300(source, sourceIndex);
   	
   }
   
   public void setPeVerYy300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeVerYy300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PeVerYy300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPeVerYy300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeVerYy300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PeVerYy300 with another Field
	 *	@param value
	 */
   public void setPeVerYy300(Field source) {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeVerYy300(source);
   }  
   
     /**
	 * 	Update PeVerYy300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPeVerYy300(Field source, int sourceIndex,int sourceLen) {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeVerYy300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PeVerYy300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPeVerYy300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeVerYy300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public int getI() throws CFException {
   		return work.getI();
	}


	/**
	 *	Returns String value of i
	 *	@return i
	 */
	public char[]  getIString() throws CFException {
	     return String.valueOf(work.getIString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iIsNumeric()  throws CFException{
	    return work.iIsNumeric();
	}

	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(int number)  throws CFException{
		work.setI(number);
	}
	

	public void setI(long number)  throws CFException{
	    work.setI(number);
	}
	
	
	/**
	 * 	Update I with the passed value
	 *	@param value (String or char[])
	 */
	public void setI(char[] value)  throws CFException {
		work.setI(value);
	}
	
	/**
	 * 	Update I with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIString(char[] value)  throws CFException{
		work.setI(value);
	}	

	/**
	 *	Returns the value of inxBBin
	 *	@return inxBBin
	 */
	public long getInxBBin() throws CFException {        
   		return inxBGroup.getInxBBin();
	}
	
	/**
	 * 	Update InxBBin with the passed value
	 *	@param number
	 */
	public void setInxBBin(long number)  throws CFException{
		inxBGroup.setInxBBin(number);
	}




public void setInxA(int inxA) { 
    McissuesCtx.this.inxA = inxA;
}

public int getInxA() { 
    return McissuesCtx.this.inxA;
}
	/**
	 *	Returns the value of cf50005ClearingDtX
	 *	@return cf50005ClearingDtX
	 */
   public char[] getCf50005ClearingDtX() throws CFException  {              
   		return cf50005ClearingGrp.getCf50005ClearingDtX();
   }

  
	/**
	*  set variable cf50005ClearingDtX
	*  @param value
	**/
   public void setCf50005ClearingDtX(char[] value) throws CFException {
      cf50005ClearingGrp.setCf50005ClearingDtX(value);
   } 

     /**
	 * 	Update Cf50005ClearingDtX 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCf50005ClearingDtX(char[] source, int sourceIndex) throws CFException {
      cf50005ClearingGrp.setCf50005ClearingDtX(source, sourceIndex);
   	
   }
   
   public void setCf50005ClearingDtX(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      cf50005ClearingGrp.setCf50005ClearingDtX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Cf50005ClearingDtX 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCf50005ClearingDtX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      cf50005ClearingGrp.setCf50005ClearingDtX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Cf50005ClearingDtX with another Field
	 *	@param value
	 */
   public void setCf50005ClearingDtX(Field source) {
      cf50005ClearingGrp.setCf50005ClearingDtX(source);
   }  
   
     /**
	 * 	Update Cf50005ClearingDtX 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCf50005ClearingDtX(Field source, int sourceIndex,int sourceLen) {
      cf50005ClearingGrp.setCf50005ClearingDtX(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Cf50005ClearingDtX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCf50005ClearingDtX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      cf50005ClearingGrp.setCf50005ClearingDtX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of preEditVersion300
	 *	@return preEditVersion300
	 */
   public char[] getPreEditVersion300() throws CFException  {              
   		return preEditVersionGroup300.getPreEditVersion300();
   }

  
	/**
	*  set variable preEditVersion300
	*  @param value
	**/
   public void setPreEditVersion300(char[] value) throws CFException {
      preEditVersionGroup300.setPreEditVersion300(value);
   } 

     /**
	 * 	Update PreEditVersion300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPreEditVersion300(char[] source, int sourceIndex) throws CFException {
      preEditVersionGroup300.setPreEditVersion300(source, sourceIndex);
   	
   }
   
   public void setPreEditVersion300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      preEditVersionGroup300.setPreEditVersion300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PreEditVersion300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPreEditVersion300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      preEditVersionGroup300.setPreEditVersion300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PreEditVersion300 with another Field
	 *	@param value
	 */
   public void setPreEditVersion300(Field source) {
      preEditVersionGroup300.setPreEditVersion300(source);
   }  
   
     /**
	 * 	Update PreEditVersion300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPreEditVersion300(Field source, int sourceIndex,int sourceLen) {
      preEditVersionGroup300.setPreEditVersion300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PreEditVersion300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPreEditVersion300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      preEditVersionGroup300.setPreEditVersion300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of peVersionNumMsg600
	 *	@return peVersionNumMsg600
	 */   
	 public PeVersionNumMsg600 getPeVersionNumMsg600() {
   	return peVersionNumMsg600;
   }


	/**
	 *	Returns the value of ip31021InputSource
	 *	@return ip31021InputSource
	 */
   public char[] getIp31021InputSource() throws CFException  {              
   		return ip31021SummaryControlCard.getIp31021InputSource();
   }

  
	/**
	*  set variable ip31021InputSource
	*  @param value
	**/
   public void setIp31021InputSource(char[] value) throws CFException {
      ip31021SummaryControlCard.setIp31021InputSource(value);
   } 

     /**
	 * 	Update Ip31021InputSource 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp31021InputSource(char[] source, int sourceIndex) throws CFException {
      ip31021SummaryControlCard.setIp31021InputSource(source, sourceIndex);
   	
   }
   
   public void setIp31021InputSource(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip31021SummaryControlCard.setIp31021InputSource(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip31021InputSource 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp31021InputSource(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip31021SummaryControlCard.setIp31021InputSource(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip31021InputSource with another Field
	 *	@param value
	 */
   public void setIp31021InputSource(Field source) {
      ip31021SummaryControlCard.setIp31021InputSource(source);
   }  
   
     /**
	 * 	Update Ip31021InputSource 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp31021InputSource(Field source, int sourceIndex,int sourceLen) {
      ip31021SummaryControlCard.setIp31021InputSource(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip31021InputSource 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp31021InputSource(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip31021SummaryControlCard.setIp31021InputSource(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of cf20004TableData
	 *	@return cf20004TableData
	 */   
	 public Cf20004TableData getCf20004TableData() {
   	return cf20004TableData;
   }


	/**
	 *	Returns the value of inxB
	 *	@return inxB
	 */
	public int getInxB() throws CFException {        
   		return inxBGroup.getInxB();
	}
	
	/**
	 * 	Update InxB with the passed value
	 *	@param number
	 */
	public void setInxB(int number)  throws CFException{
		inxBGroup.setInxB(number);
	}


	public void setInxB(long number)  throws CFException{
		inxBGroup.setInxB((int)number);
	}


	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of clearingDtTm9900
	 *	@return clearingDtTm9900
	 */
	public long getClearingDtTm9900(int index) throws CFException {
   		return clearingDtTm9Grp900.getClearingDtTm9Ary900(index).getClearingDtTm9900();
	}


	/**
	 *	Returns String value of clearingDtTm9900
	 *	@return clearingDtTm9900
	 */
	public char[]  getClearingDtTm9900String(int index) throws CFException {
	     return String.valueOf(clearingDtTm9Grp900.getClearingDtTm9Ary900(index).getClearingDtTm9900String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean clearingDtTm9900IsNumeric(int index)  throws CFException{
	    return clearingDtTm9Grp900.getClearingDtTm9Ary900(index - 1).clearingDtTm9900IsNumeric();
	}

	/**
	 * 	Update ClearingDtTm9900 with the passed value
	 *	@param number
	 */
	public void setClearingDtTm9900(int index,long number)  throws CFException{
		clearingDtTm9Grp900.getClearingDtTm9Ary900(index).setClearingDtTm9900(number);
	}
	

	
	/**
	 * 	Update ClearingDtTm9900 with the passed value
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9900(int index,char[] value)  throws CFException {
		clearingDtTm9Grp900.getClearingDtTm9Ary900(index).setClearingDtTm9900(value);
	}
	
	/**
	 * 	Update ClearingDtTm9900 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9900String(int index,char[] value)  throws CFException{
		clearingDtTm9Grp900.getClearingDtTm9Ary900(index).setClearingDtTm9900(value);
	}	

	/**
	 *	Returns the value of peVerSequence300
	 *	@return peVerSequence300
	 */
   public char[] getPeVerSequence300() throws CFException  {              
   		return preEditVersionGroup300.getPreEditVersion300Redefined().getPeVerSequence300();
   }

  
	/**
	*  set variable peVerSequence300
	*  @param value
	**/
   public void setPeVerSequence300(char[] value) throws CFException {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeVerSequence300(value);
   } 

     /**
	 * 	Update PeVerSequence300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPeVerSequence300(char[] source, int sourceIndex) throws CFException {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeVerSequence300(source, sourceIndex);
   	
   }
   
   public void setPeVerSequence300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeVerSequence300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PeVerSequence300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPeVerSequence300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeVerSequence300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PeVerSequence300 with another Field
	 *	@param value
	 */
   public void setPeVerSequence300(Field source) {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeVerSequence300(source);
   }  
   
     /**
	 * 	Update PeVerSequence300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPeVerSequence300(Field source, int sourceIndex,int sourceLen) {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeVerSequence300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PeVerSequence300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPeVerSequence300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      preEditVersionGroup300.getPreEditVersion300Redefined().setPeVerSequence300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of cf50005ClearingGrp
	 *	@return cf50005ClearingGrp
	 */   
	 public Cf50005ClearingGrp getCf50005ClearingGrp() {
   	return cf50005ClearingGrp;
   }



        public McissuesCtx getMcissuesCtx() {
            return McissuesCtx.this;
        }

        public MainSplit4OutCtx getMainSplit4OutCtx() {
            return new MainSplit4OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += inxBGroup.hashCode();
        str += sortKeyLthTable700.hashCode();
        str += preEditVersionGroup300.hashCode();
        str += peVersionNumMsg600.hashCode();
        str += cf20004TableData.hashCode();
        str += inputVars800.hashCode();
        str += clearingDtTm9Grp900.hashCode();
        str += work.hashCode();
        str += ip500041Rec.hashCode();
        str += clearingDtTm9ShortGrp900.hashCode();
        str += cf50005ClearingGrp.hashCode();
        str += ip31021SummaryControlCard.hashCode();
        str += tableArray.hashCode();
       return str.hashCode();
    }

    public MainSplit4InCtx clone() {
        MainSplit4InCtx cloneObj = new MainSplit4InCtx();
        cloneObj.inxBGroup = new InxBGroup();
        cloneObj.inxBGroup.set(inxBGroup.getClonedField());
        cloneObj.sortKeyLthTable700 = new SortKeyLthTable700();
        cloneObj.sortKeyLthTable700.set(sortKeyLthTable700.getClonedField());
        cloneObj.preEditVersionGroup300 = new PreEditVersionGroup300();
        cloneObj.preEditVersionGroup300.set(preEditVersionGroup300.getClonedField());
        cloneObj.peVersionNumMsg600 = new PeVersionNumMsg600();
        cloneObj.peVersionNumMsg600.set(peVersionNumMsg600.getClonedField());
        cloneObj.cf20004TableData = new Cf20004TableData();
        cloneObj.cf20004TableData.set(cf20004TableData.getClonedField());
        cloneObj.inputVars800 = new InputVars800();
        cloneObj.inputVars800.set(inputVars800.getClonedField());
        cloneObj.clearingDtTm9Grp900 = new ClearingDtTm9Grp900();
        cloneObj.clearingDtTm9Grp900.set(clearingDtTm9Grp900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip500041Rec = new Ip500041Rec();
        cloneObj.ip500041Rec.set(ip500041Rec.getClonedField());
        cloneObj.clearingDtTm9ShortGrp900 = new ClearingDtTm9ShortGrp900();
        cloneObj.clearingDtTm9ShortGrp900.set(clearingDtTm9ShortGrp900.getClonedField());
        cloneObj.cf50005ClearingGrp = new Cf50005ClearingGrp();
        cloneObj.cf50005ClearingGrp.set(cf50005ClearingGrp.getClonedField());
        cloneObj.ip31021SummaryControlCard = new Ip31021SummaryControlCard();
        cloneObj.ip31021SummaryControlCard.set(ip31021SummaryControlCard.getClonedField());
        cloneObj.tableArray = new TableArray();
        cloneObj.tableArray.set(tableArray.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit4InCtx getMainSplit4InCtx() {
            return new MainSplit4InCtx();
    }
     public class MainSplit4OutCtx implements Cloneable {
     InxBGroup inxBGroup = McissuesCtx.this.getInxBGroup();
     SortKeyLthTable700 sortKeyLthTable700 = McissuesCtx.this.getSortKeyLthTable700();
     PreEditVersionGroup300 preEditVersionGroup300 = McissuesCtx.this.getPreEditVersionGroup300();
     Cf20004TableData cf20004TableData = McissuesCtx.this.getCf20004TableData();
     InputVars800 inputVars800 = McissuesCtx.this.getInputVars800();
     PeVersionNumMsg600 peVersionNumMsg600 = McissuesCtx.this.getPeVersionNumMsg600();
     ClearingDtTm9Grp900 clearingDtTm9Grp900 = McissuesCtx.this.getClearingDtTm9Grp900();
     Work work = McissuesCtx.this.getWork();
     Ip500041Rec ip500041Rec = McissuesCtx.this.getIp500041Rec();
     ClearingDtTm9ShortGrp900 clearingDtTm9ShortGrp900 = McissuesCtx.this.getClearingDtTm9ShortGrp900();
     Ip31021SummaryControlCard ip31021SummaryControlCard = McissuesCtx.this.getIp31021SummaryControlCard();
     Cf50005ClearingGrp cf50005ClearingGrp = McissuesCtx.this.getCf50005ClearingGrp();
     TableArray tableArray = McissuesCtx.this.getTableArray();

	/**
	 *	Returns the value of ip31021SummaryCycle
	 *	@return ip31021SummaryCycle
	 */
	public int getIp31021SummaryCycle() throws CFException {
   		return ip31021SummaryControlCard.getIp31021SummaryCycle();
	}


	/**
	 *	Returns String value of ip31021SummaryCycle
	 *	@return ip31021SummaryCycle
	 */
	public char[]  getIp31021SummaryCycleString() throws CFException {
	     return String.valueOf(ip31021SummaryControlCard.getIp31021SummaryCycleString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip31021SummaryCycleIsNumeric()  throws CFException{
	    return ip31021SummaryControlCard.ip31021SummaryCycleIsNumeric();
	}

	/**
	 * 	Update Ip31021SummaryCycle with the passed value
	 *	@param number
	 */
	public void setIp31021SummaryCycle(int number)  throws CFException{
		ip31021SummaryControlCard.setIp31021SummaryCycle(number);
	}
	

	public void setIp31021SummaryCycle(long number)  throws CFException{
	    ip31021SummaryControlCard.setIp31021SummaryCycle(number);
	}
	
	
	/**
	 * 	Update Ip31021SummaryCycle with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp31021SummaryCycle(char[] value)  throws CFException {
		ip31021SummaryControlCard.setIp31021SummaryCycle(value);
	}
	
	/**
	 * 	Update Ip31021SummaryCycle with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp31021SummaryCycleString(char[] value)  throws CFException{
		ip31021SummaryControlCard.setIp31021SummaryCycle(value);
	}	

	/**
	 *	Returns the value of clearingDtTm9X700
	 *	@return clearingDtTm9X700
	 */
   public char[] getClearingDtTm9X700() throws CFException  {              
   		return work.getClearingDtTm9X700();
   }

  
	/**
	*  set variable clearingDtTm9X700
	*  @param value
	**/
   public void setClearingDtTm9X700(char[] value) throws CFException {
      work.setClearingDtTm9X700(value);
   } 

	/**
	 *	Returns the value of cf50005ClearingDtN
	 *	@return cf50005ClearingDtN
	 */
	public long getCf50005ClearingDtN() throws CFException {
   		return cf50005ClearingGrp.getCf50005ClearingDtN();
	}


	/**
	 *	Returns String value of cf50005ClearingDtN
	 *	@return cf50005ClearingDtN
	 */
	public char[]  getCf50005ClearingDtNString() throws CFException {
	     return String.valueOf(cf50005ClearingGrp.getCf50005ClearingDtNString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cf50005ClearingDtNIsNumeric()  throws CFException{
	    return cf50005ClearingGrp.cf50005ClearingDtNIsNumeric();
	}

	/**
	 * 	Update Cf50005ClearingDtN with the passed value
	 *	@param number
	 */
	public void setCf50005ClearingDtN(long number)  throws CFException{
		cf50005ClearingGrp.setCf50005ClearingDtN(number);
	}
	

	
	/**
	 * 	Update Cf50005ClearingDtN with the passed value
	 *	@param value (String or char[])
	 */
	public void setCf50005ClearingDtN(char[] value)  throws CFException {
		cf50005ClearingGrp.setCf50005ClearingDtN(value);
	}
	
	/**
	 * 	Update Cf50005ClearingDtN with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCf50005ClearingDtNString(char[] value)  throws CFException{
		cf50005ClearingGrp.setCf50005ClearingDtN(value);
	}	

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public int getI() throws CFException {
   		return work.getI();
	}


	/**
	 *	Returns String value of i
	 *	@return i
	 */
	public char[]  getIString() throws CFException {
	     return String.valueOf(work.getIString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iIsNumeric()  throws CFException{
	    return work.iIsNumeric();
	}

	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(int number)  throws CFException{
		work.setI(number);
	}
	

	public void setI(long number)  throws CFException{
	    work.setI(number);
	}
	
	
	/**
	 * 	Update I with the passed value
	 *	@param value (String or char[])
	 */
	public void setI(char[] value)  throws CFException {
		work.setI(value);
	}
	
	/**
	 * 	Update I with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIString(char[] value)  throws CFException{
		work.setI(value);
	}	

	/**
	 *	Returns the value of tableId700
	 *	@return tableId700
	 */
   public char[] getTableId700(int index) throws CFException  {              
   		return sortKeyLthTable700.getSortKeyLthEntry700(index).getTableId700();
   }

  
	/**
	*  set variable tableId700
	*  @param value
	**/
   public void setTableId700(int index,char[] value) throws CFException {
      sortKeyLthTable700.getSortKeyLthEntry700(index).setTableId700(value);
   } 

     /**
	 * 	Update TableId700 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId700(int index,char[] source, int sourceIndex) throws CFException {
      sortKeyLthTable700.getSortKeyLthEntry700(index).setTableId700(source, sourceIndex);
   	
   }
   
   public void setTableId700(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortKeyLthTable700.getSortKeyLthEntry700(index).setTableId700(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TableId700 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId700(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortKeyLthTable700.getSortKeyLthEntry700(index).setTableId700(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TableId700 with another Field
	 *	@param value
	 */
   public void setTableId700(int index,Field source) {
      sortKeyLthTable700.getSortKeyLthEntry700(index).setTableId700(source);
   }  
   
     /**
	 * 	Update TableId700 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId700(int index,Field source, int sourceIndex,int sourceLen) {
      sortKeyLthTable700.getSortKeyLthEntry700(index).setTableId700(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TableId700 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId700(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortKeyLthTable700.getSortKeyLthEntry700(index).setTableId700(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sortKeyLthTable700
	 *	@return sortKeyLthTable700
	 */   
	 public SortKeyLthTable700 getSortKeyLthTable700() {
   	return sortKeyLthTable700;
   }



public void setInxA(int inxA) { 
    McissuesCtx.this.inxA = inxA;
}

public int getInxA() { 
    return McissuesCtx.this.inxA;
}
	/**
	 *	Returns the value of ip500041TableId
	 *	@return ip500041TableId
	 */
   public char[] getIp500041TableId() throws CFException  {              
   		return ip500041Rec.getIp500041TableId();
   }

  
	/**
	*  set variable ip500041TableId
	*  @param value
	**/
   public void setIp500041TableId(char[] value) throws CFException {
      ip500041Rec.setIp500041TableId(value);
   } 

     /**
	 * 	Update Ip500041TableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp500041TableId(char[] source, int sourceIndex) throws CFException {
      ip500041Rec.setIp500041TableId(source, sourceIndex);
   	
   }
   
   public void setIp500041TableId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip500041Rec.setIp500041TableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip500041TableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp500041TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip500041Rec.setIp500041TableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip500041TableId with another Field
	 *	@param value
	 */
   public void setIp500041TableId(Field source) {
      ip500041Rec.setIp500041TableId(source);
   }  
   
     /**
	 * 	Update Ip500041TableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp500041TableId(Field source, int sourceIndex,int sourceLen) {
      ip500041Rec.setIp500041TableId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip500041TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp500041TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip500041Rec.setIp500041TableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of cf50005ClearingDtX
	 *	@return cf50005ClearingDtX
	 */
   public char[] getCf50005ClearingDtX() throws CFException  {              
   		return cf50005ClearingGrp.getCf50005ClearingDtX();
   }

  
	/**
	*  set variable cf50005ClearingDtX
	*  @param value
	**/
   public void setCf50005ClearingDtX(char[] value) throws CFException {
      cf50005ClearingGrp.setCf50005ClearingDtX(value);
   } 

     /**
	 * 	Update Cf50005ClearingDtX 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCf50005ClearingDtX(char[] source, int sourceIndex) throws CFException {
      cf50005ClearingGrp.setCf50005ClearingDtX(source, sourceIndex);
   	
   }
   
   public void setCf50005ClearingDtX(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      cf50005ClearingGrp.setCf50005ClearingDtX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Cf50005ClearingDtX 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCf50005ClearingDtX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      cf50005ClearingGrp.setCf50005ClearingDtX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Cf50005ClearingDtX with another Field
	 *	@param value
	 */
   public void setCf50005ClearingDtX(Field source) {
      cf50005ClearingGrp.setCf50005ClearingDtX(source);
   }  
   
     /**
	 * 	Update Cf50005ClearingDtX 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCf50005ClearingDtX(Field source, int sourceIndex,int sourceLen) {
      cf50005ClearingGrp.setCf50005ClearingDtX(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Cf50005ClearingDtX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCf50005ClearingDtX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      cf50005ClearingGrp.setCf50005ClearingDtX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of preEditVersion300
	 *	@return preEditVersion300
	 */
   public char[] getPreEditVersion300() throws CFException  {              
   		return preEditVersionGroup300.getPreEditVersion300();
   }

  
	/**
	*  set variable preEditVersion300
	*  @param value
	**/
   public void setPreEditVersion300(char[] value) throws CFException {
      preEditVersionGroup300.setPreEditVersion300(value);
   } 

     /**
	 * 	Update PreEditVersion300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPreEditVersion300(char[] source, int sourceIndex) throws CFException {
      preEditVersionGroup300.setPreEditVersion300(source, sourceIndex);
   	
   }
   
   public void setPreEditVersion300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      preEditVersionGroup300.setPreEditVersion300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PreEditVersion300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPreEditVersion300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      preEditVersionGroup300.setPreEditVersion300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PreEditVersion300 with another Field
	 *	@param value
	 */
   public void setPreEditVersion300(Field source) {
      preEditVersionGroup300.setPreEditVersion300(source);
   }  
   
     /**
	 * 	Update PreEditVersion300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPreEditVersion300(Field source, int sourceIndex,int sourceLen) {
      preEditVersionGroup300.setPreEditVersion300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PreEditVersion300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPreEditVersion300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      preEditVersionGroup300.setPreEditVersion300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of peVersionNum600
	 *	@return peVersionNum600
	 */
   public char[] getPeVersionNum600() throws CFException  {              
   		return peVersionNumMsg600.getPeVersionNum600();
   }

  
	/**
	*  set variable peVersionNum600
	*  @param value
	**/
   public void setPeVersionNum600(char[] value) throws CFException {
      peVersionNumMsg600.setPeVersionNum600(value);
   } 

     /**
	 * 	Update PeVersionNum600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPeVersionNum600(char[] source, int sourceIndex) throws CFException {
      peVersionNumMsg600.setPeVersionNum600(source, sourceIndex);
   	
   }
   
   public void setPeVersionNum600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      peVersionNumMsg600.setPeVersionNum600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PeVersionNum600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPeVersionNum600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      peVersionNumMsg600.setPeVersionNum600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PeVersionNum600 with another Field
	 *	@param value
	 */
   public void setPeVersionNum600(Field source) {
      peVersionNumMsg600.setPeVersionNum600(source);
   }  
   
     /**
	 * 	Update PeVersionNum600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPeVersionNum600(Field source, int sourceIndex,int sourceLen) {
      peVersionNumMsg600.setPeVersionNum600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PeVersionNum600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPeVersionNum600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      peVersionNumMsg600.setPeVersionNum600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of cf20004TableData
	 *	@return cf20004TableData
	 */   
	 public Cf20004TableData getCf20004TableData() {
   	return cf20004TableData;
   }


	/**
	 *	Returns the value of inxB
	 *	@return inxB
	 */
	public int getInxB() throws CFException {        
   		return inxBGroup.getInxB();
	}
	
	/**
	 * 	Update InxB with the passed value
	 *	@param number
	 */
	public void setInxB(int number)  throws CFException{
		inxBGroup.setInxB(number);
	}


	public void setInxB(long number)  throws CFException{
		inxBGroup.setInxB((int)number);
	}


	/**
	 *	Returns the value of ip31021SummarySif
	 *	@return ip31021SummarySif
	 */
   public char[] getIp31021SummarySif() throws CFException  {              
   		return ip31021SummaryControlCard.getIp31021SummarySif();
   }

  
	/**
	*  set variable ip31021SummarySif
	*  @param value
	**/
   public void setIp31021SummarySif(char[] value) throws CFException {
      ip31021SummaryControlCard.setIp31021SummarySif(value);
   } 

     /**
	 * 	Update Ip31021SummarySif 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp31021SummarySif(char[] source, int sourceIndex) throws CFException {
      ip31021SummaryControlCard.setIp31021SummarySif(source, sourceIndex);
   	
   }
   
   public void setIp31021SummarySif(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip31021SummaryControlCard.setIp31021SummarySif(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip31021SummarySif 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp31021SummarySif(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip31021SummaryControlCard.setIp31021SummarySif(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip31021SummarySif with another Field
	 *	@param value
	 */
   public void setIp31021SummarySif(Field source) {
      ip31021SummaryControlCard.setIp31021SummarySif(source);
   }  
   
     /**
	 * 	Update Ip31021SummarySif 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp31021SummarySif(Field source, int sourceIndex,int sourceLen) {
      ip31021SummaryControlCard.setIp31021SummarySif(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip31021SummarySif 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp31021SummarySif(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip31021SummaryControlCard.setIp31021SummarySif(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of clearingDtTm9900
	 *	@return clearingDtTm9900
	 */
	public long getClearingDtTm9900(int index) throws CFException {
   		return clearingDtTm9Grp900.getClearingDtTm9Ary900(index).getClearingDtTm9900();
	}


	/**
	 *	Returns String value of clearingDtTm9900
	 *	@return clearingDtTm9900
	 */
	public char[]  getClearingDtTm9900String(int index) throws CFException {
	     return String.valueOf(clearingDtTm9Grp900.getClearingDtTm9Ary900(index).getClearingDtTm9900String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean clearingDtTm9900IsNumeric(int index)  throws CFException{
	    return clearingDtTm9Grp900.getClearingDtTm9Ary900(index - 1).clearingDtTm9900IsNumeric();
	}

	/**
	 * 	Update ClearingDtTm9900 with the passed value
	 *	@param number
	 */
	public void setClearingDtTm9900(int index,long number)  throws CFException{
		clearingDtTm9Grp900.getClearingDtTm9Ary900(index).setClearingDtTm9900(number);
	}
	

	
	/**
	 * 	Update ClearingDtTm9900 with the passed value
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9900(int index,char[] value)  throws CFException {
		clearingDtTm9Grp900.getClearingDtTm9Ary900(index).setClearingDtTm9900(value);
	}
	
	/**
	 * 	Update ClearingDtTm9900 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9900String(int index,char[] value)  throws CFException{
		clearingDtTm9Grp900.getClearingDtTm9Ary900(index).setClearingDtTm9900(value);
	}	

	/**
	 *	Returns the value of ip500041Rec
	 *	@return ip500041Rec
	 */   
	 public Ip500041Rec getIp500041Rec() {
   	return ip500041Rec;
   }


	/**
	 *	Returns the value of ip31021SummaryControlCard
	 *	@return ip31021SummaryControlCard
	 */   
	 public Ip31021SummaryControlCard getIp31021SummaryControlCard() {
   	return ip31021SummaryControlCard;
   }


	/**
	 *	Returns the value of cf20004Items
	 *	@return cf20004Items
	 */
   public char[] getCf20004Items() throws CFException  {              
   		return cf20004TableData.getCf20004ValidValuesEntry().getCf20004Data().getCf20004Items();
   }

  
	/**
	*  set variable cf20004Items
	*  @param value
	**/
   public void setCf20004Items(char[] value) throws CFException {
      cf20004TableData.getCf20004ValidValuesEntry().getCf20004Data().setCf20004Items(value);
   } 

     /**
	 * 	Update Cf20004Items 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCf20004Items(char[] source, int sourceIndex) throws CFException {
      cf20004TableData.getCf20004ValidValuesEntry().getCf20004Data().setCf20004Items(source, sourceIndex);
   	
   }
   
   public void setCf20004Items(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      cf20004TableData.getCf20004ValidValuesEntry().getCf20004Data().setCf20004Items(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Cf20004Items 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCf20004Items(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      cf20004TableData.getCf20004ValidValuesEntry().getCf20004Data().setCf20004Items(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Cf20004Items with another Field
	 *	@param value
	 */
   public void setCf20004Items(Field source) {
      cf20004TableData.getCf20004ValidValuesEntry().getCf20004Data().setCf20004Items(source);
   }  
   
     /**
	 * 	Update Cf20004Items 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCf20004Items(Field source, int sourceIndex,int sourceLen) {
      cf20004TableData.getCf20004ValidValuesEntry().getCf20004Data().setCf20004Items(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Cf20004Items 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCf20004Items(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      cf20004TableData.getCf20004ValidValuesEntry().getCf20004Data().setCf20004Items(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of clearingDtTm9Short900
	 *	@return clearingDtTm9Short900
	 */
	public long getClearingDtTm9Short900(int index) throws CFException {
   		return clearingDtTm9ShortGrp900.getClearingDtTm9ShortAry900(index).getClearingDtTm9Short900();
	}


	/**
	 *	Returns String value of clearingDtTm9Short900
	 *	@return clearingDtTm9Short900
	 */
	public char[]  getClearingDtTm9Short900String(int index) throws CFException {
	     return String.valueOf(clearingDtTm9ShortGrp900.getClearingDtTm9ShortAry900(index).getClearingDtTm9Short900String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean clearingDtTm9Short900IsNumeric(int index)  throws CFException{
	    return clearingDtTm9ShortGrp900.getClearingDtTm9ShortAry900(index - 1).clearingDtTm9Short900IsNumeric();
	}

	/**
	 * 	Update ClearingDtTm9Short900 with the passed value
	 *	@param number
	 */
	public void setClearingDtTm9Short900(int index,long number)  throws CFException{
		clearingDtTm9ShortGrp900.getClearingDtTm9ShortAry900(index).setClearingDtTm9Short900(number);
	}
	

	
	/**
	 * 	Update ClearingDtTm9Short900 with the passed value
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9Short900(int index,char[] value)  throws CFException {
		clearingDtTm9ShortGrp900.getClearingDtTm9ShortAry900(index).setClearingDtTm9Short900(value);
	}
	
	/**
	 * 	Update ClearingDtTm9Short900 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9Short900String(int index,char[] value)  throws CFException{
		clearingDtTm9ShortGrp900.getClearingDtTm9ShortAry900(index).setClearingDtTm9Short900(value);
	}	

	/**
	 *	Returns the value of clearingDtTm9800
	 *	@return clearingDtTm9800
	 */
	public long getClearingDtTm9800() throws CFException {
   		return work.getClearingDtTm9800();
	}


	/**
	 *	Returns String value of clearingDtTm9800
	 *	@return clearingDtTm9800
	 */
	public char[]  getClearingDtTm9800String() throws CFException {
	     return String.valueOf(work.getClearingDtTm9800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean clearingDtTm9800IsNumeric()  throws CFException{
	    return work.clearingDtTm9800IsNumeric();
	}

	/**
	 * 	Update ClearingDtTm9800 with the passed value
	 *	@param number
	 */
	public void setClearingDtTm9800(long number)  throws CFException{
		work.setClearingDtTm9800(number);
	}
	

	
	/**
	 * 	Update ClearingDtTm9800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9800(char[] value)  throws CFException {
		work.setClearingDtTm9800(value);
	}
	
	/**
	 * 	Update ClearingDtTm9800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9800String(char[] value)  throws CFException{
		work.setClearingDtTm9800(value);
	}	

	/**
	 *	Returns the value of inputSegId800
	 *	@return inputSegId800
	 */
   public char[] getInputSegId800() throws CFException  {              
   		return inputVars800.getInputSegId800();
   }

  
	/**
	*  set variable inputSegId800
	*  @param value
	**/
   public void setInputSegId800(char[] value) throws CFException {
      inputVars800.setInputSegId800(value);
   } 

     /**
	 * 	Update InputSegId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputSegId800(char[] source, int sourceIndex) throws CFException {
      inputVars800.setInputSegId800(source, sourceIndex);
   	
   }
   
   public void setInputSegId800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      inputVars800.setInputSegId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update InputSegId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputSegId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      inputVars800.setInputSegId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update InputSegId800 with another Field
	 *	@param value
	 */
   public void setInputSegId800(Field source) {
      inputVars800.setInputSegId800(source);
   }  
   
     /**
	 * 	Update InputSegId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputSegId800(Field source, int sourceIndex,int sourceLen) {
      inputVars800.setInputSegId800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update InputSegId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputSegId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      inputVars800.setInputSegId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tableItem
	 *	@return tableItem
	 */
   public char[] getTableItem(int index) throws CFException  {              
   		return tableArray.getTableItem(index);
   }

  
	/**
	*  set variable tableItem
	*  @param value
	**/
   public void setTableItem(int index,char[] value) throws CFException {
      tableArray.setTableItem((index),value);
   } 

	/**
	 *	Returns the value of clearingDtTm9Short800
	 *	@return clearingDtTm9Short800
	 */
	public long getClearingDtTm9Short800() throws CFException {
   		return work.getClearingDtTm9Short800();
	}


	/**
	 *	Returns String value of clearingDtTm9Short800
	 *	@return clearingDtTm9Short800
	 */
	public char[]  getClearingDtTm9Short800String() throws CFException {
	     return String.valueOf(work.getClearingDtTm9Short800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean clearingDtTm9Short800IsNumeric()  throws CFException{
	    return work.clearingDtTm9Short800IsNumeric();
	}

	/**
	 * 	Update ClearingDtTm9Short800 with the passed value
	 *	@param number
	 */
	public void setClearingDtTm9Short800(long number)  throws CFException{
		work.setClearingDtTm9Short800(number);
	}
	

	
	/**
	 * 	Update ClearingDtTm9Short800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9Short800(char[] value)  throws CFException {
		work.setClearingDtTm9Short800(value);
	}
	
	/**
	 * 	Update ClearingDtTm9Short800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9Short800String(char[] value)  throws CFException{
		work.setClearingDtTm9Short800(value);
	}	

	/**
	 *	Returns the value of ip31021InputSource
	 *	@return ip31021InputSource
	 */
   public char[] getIp31021InputSource() throws CFException  {              
   		return ip31021SummaryControlCard.getIp31021InputSource();
   }

  
	/**
	*  set variable ip31021InputSource
	*  @param value
	**/
   public void setIp31021InputSource(char[] value) throws CFException {
      ip31021SummaryControlCard.setIp31021InputSource(value);
   } 

     /**
	 * 	Update Ip31021InputSource 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp31021InputSource(char[] source, int sourceIndex) throws CFException {
      ip31021SummaryControlCard.setIp31021InputSource(source, sourceIndex);
   	
   }
   
   public void setIp31021InputSource(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip31021SummaryControlCard.setIp31021InputSource(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip31021InputSource 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp31021InputSource(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip31021SummaryControlCard.setIp31021InputSource(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip31021InputSource with another Field
	 *	@param value
	 */
   public void setIp31021InputSource(Field source) {
      ip31021SummaryControlCard.setIp31021InputSource(source);
   }  
   
     /**
	 * 	Update Ip31021InputSource 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp31021InputSource(Field source, int sourceIndex,int sourceLen) {
      ip31021SummaryControlCard.setIp31021InputSource(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip31021InputSource 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp31021InputSource(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip31021SummaryControlCard.setIp31021InputSource(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of inputVars800
	 *	@return inputVars800
	 */   
	 public InputVars800 getInputVars800() {
   	return inputVars800;
   }


	/**
	 *	Returns the value of inputTableId800
	 *	@return inputTableId800
	 */
	public long getInputTableId800() throws CFException {
   		return inputVars800.getInputTableId800();
	}


	/**
	 *	Returns String value of inputTableId800
	 *	@return inputTableId800
	 */
	public char[]  getInputTableId800String() throws CFException {
	     return String.valueOf(inputVars800.getInputTableId800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inputTableId800IsNumeric()  throws CFException{
	    return inputVars800.inputTableId800IsNumeric();
	}

	/**
	 * 	Update InputTableId800 with the passed value
	 *	@param number
	 */
	public void setInputTableId800(long number)  throws CFException{
		inputVars800.setInputTableId800(number);
	}
	

	
	/**
	 * 	Update InputTableId800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setInputTableId800(char[] value)  throws CFException {
		inputVars800.setInputTableId800(value);
	}
	
	/**
	 * 	Update InputTableId800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInputTableId800String(char[] value)  throws CFException{
		inputVars800.setInputTableId800(value);
	}	

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of clearingDtTm9700
	 *	@return clearingDtTm9700
	 */
	public long getClearingDtTm9700() throws CFException {
   		return work.getClearingDtTm9700();
	}


	/**
	 *	Returns String value of clearingDtTm9700
	 *	@return clearingDtTm9700
	 */
	public char[]  getClearingDtTm9700String() throws CFException {
	     return String.valueOf(work.getClearingDtTm9700String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean clearingDtTm9700IsNumeric()  throws CFException{
	    return work.clearingDtTm9700IsNumeric();
	}

	/**
	 * 	Update ClearingDtTm9700 with the passed value
	 *	@param number
	 */
	public void setClearingDtTm9700(long number)  throws CFException{
		work.setClearingDtTm9700(number);
	}
	

	
	/**
	 * 	Update ClearingDtTm9700 with the passed value
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9700(char[] value)  throws CFException {
		work.setClearingDtTm9700(value);
	}
	
	/**
	 * 	Update ClearingDtTm9700 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9700String(char[] value)  throws CFException{
		work.setClearingDtTm9700(value);
	}	

	/**
	 *	Returns the value of cf50005ClearingGrp
	 *	@return cf50005ClearingGrp
	 */   
	 public Cf50005ClearingGrp getCf50005ClearingGrp() {
   	return cf50005ClearingGrp;
   }


	/**
	 *	Returns the value of cf20004TableEnts
	 *	@return cf20004TableEnts
	 */
   public char[] getCf20004TableEnts() throws CFException  {              
   		return work.getCf20004TableEnts();
   }

  
	/**
	*  set variable cf20004TableEnts
	*  @param value
	**/
   public void setCf20004TableEnts(char[] value) throws CFException {
      work.setCf20004TableEnts(value);
   } 


        public McissuesCtx getMcissuesCtx() {
            return McissuesCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += inxBGroup.hashCode();
        str += sortKeyLthTable700.hashCode();
        str += preEditVersionGroup300.hashCode();
        str += cf20004TableData.hashCode();
        str += inputVars800.hashCode();
        str += peVersionNumMsg600.hashCode();
        str += clearingDtTm9Grp900.hashCode();
        str += work.hashCode();
        str += ip500041Rec.hashCode();
        str += clearingDtTm9ShortGrp900.hashCode();
        str += ip31021SummaryControlCard.hashCode();
        str += cf50005ClearingGrp.hashCode();
        str += tableArray.hashCode();
       return str.hashCode();
    }

    public MainSplit4OutCtx clone() {
        MainSplit4OutCtx cloneObj = new MainSplit4OutCtx();
        cloneObj.inxBGroup = new InxBGroup();
        cloneObj.inxBGroup.set(inxBGroup.getClonedField());
        cloneObj.sortKeyLthTable700 = new SortKeyLthTable700();
        cloneObj.sortKeyLthTable700.set(sortKeyLthTable700.getClonedField());
        cloneObj.preEditVersionGroup300 = new PreEditVersionGroup300();
        cloneObj.preEditVersionGroup300.set(preEditVersionGroup300.getClonedField());
        cloneObj.cf20004TableData = new Cf20004TableData();
        cloneObj.cf20004TableData.set(cf20004TableData.getClonedField());
        cloneObj.inputVars800 = new InputVars800();
        cloneObj.inputVars800.set(inputVars800.getClonedField());
        cloneObj.peVersionNumMsg600 = new PeVersionNumMsg600();
        cloneObj.peVersionNumMsg600.set(peVersionNumMsg600.getClonedField());
        cloneObj.clearingDtTm9Grp900 = new ClearingDtTm9Grp900();
        cloneObj.clearingDtTm9Grp900.set(clearingDtTm9Grp900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip500041Rec = new Ip500041Rec();
        cloneObj.ip500041Rec.set(ip500041Rec.getClonedField());
        cloneObj.clearingDtTm9ShortGrp900 = new ClearingDtTm9ShortGrp900();
        cloneObj.clearingDtTm9ShortGrp900.set(clearingDtTm9ShortGrp900.getClonedField());
        cloneObj.ip31021SummaryControlCard = new Ip31021SummaryControlCard();
        cloneObj.ip31021SummaryControlCard.set(ip31021SummaryControlCard.getClonedField());
        cloneObj.cf50005ClearingGrp = new Cf50005ClearingGrp();
        cloneObj.cf50005ClearingGrp.set(cf50005ClearingGrp.getClonedField());
        cloneObj.tableArray = new TableArray();
        cloneObj.tableArray.set(tableArray.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit4OutCtx getMainSplit4OutCtx() {
            return new MainSplit4OutCtx();
    }
     public class MainSplit5InCtx implements Cloneable {
     Ip43501ErrorInfoRec ip43501ErrorInfoRec = McissuesCtx.this.getIp43501ErrorInfoRec();
     DtlRecord4800 dtlRecord4800 = McissuesCtx.this.getDtlRecord4800();
     Work work = McissuesCtx.this.getWork();
     Grp1 grp1 = McissuesCtx.this.getGrp1();
     InxBGroup inxBGroup = McissuesCtx.this.getInxBGroup();
     DtlRecord3800 dtlRecord3800 = McissuesCtx.this.getDtlRecord3800();
     SortKeyLthTable700 sortKeyLthTable700 = McissuesCtx.this.getSortKeyLthTable700();
     DtlCnt800 dtlCnt800 = McissuesCtx.this.getDtlCnt800();
     TableArray tableArray = McissuesCtx.this.getTableArray();

	/**
	 *	Returns the value of dtlCntA800
	 *	@return dtlCntA800
	 */
   public char[] getDtlCntA800() throws CFException  {              
   		return dtlCnt800.getDtlCntA800();
   }

  
	/**
	*  set variable dtlCntA800
	*  @param value
	**/
   public void setDtlCntA800(char[] value) throws CFException {
      dtlCnt800.setDtlCntA800(value);
   } 

     /**
	 * 	Update DtlCntA800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDtlCntA800(char[] source, int sourceIndex) throws CFException {
      dtlCnt800.setDtlCntA800(source, sourceIndex);
   	
   }
   
   public void setDtlCntA800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dtlCnt800.setDtlCntA800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DtlCntA800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDtlCntA800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlCnt800.setDtlCntA800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DtlCntA800 with another Field
	 *	@param value
	 */
   public void setDtlCntA800(Field source) {
      dtlCnt800.setDtlCntA800(source);
   }  
   
     /**
	 * 	Update DtlCntA800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDtlCntA800(Field source, int sourceIndex,int sourceLen) {
      dtlCnt800.setDtlCntA800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DtlCntA800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDtlCntA800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlCnt800.setDtlCntA800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of c0071300
	 *	@return c0071300
	 */
   public char[] getC0071300() throws CFException  {              
   		return work.getC0071300();
   }

  
	/**
	*  set variable c0071300
	*  @param value
	**/
   public void setC0071300(char[] value) throws CFException {
      work.setC0071300(value);
   } 

	/**
	 *	Returns the value of tableId700
	 *	@return tableId700
	 */
   public char[] getTableId700(int index) throws CFException  {              
   		return sortKeyLthTable700.getSortKeyLthEntry700(index).getTableId700();
   }

  
	/**
	*  set variable tableId700
	*  @param value
	**/
   public void setTableId700(int index,char[] value) throws CFException {
      sortKeyLthTable700.getSortKeyLthEntry700(index).setTableId700(value);
   } 

     /**
	 * 	Update TableId700 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId700(int index,char[] source, int sourceIndex) throws CFException {
      sortKeyLthTable700.getSortKeyLthEntry700(index).setTableId700(source, sourceIndex);
   	
   }
   
   public void setTableId700(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortKeyLthTable700.getSortKeyLthEntry700(index).setTableId700(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TableId700 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId700(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortKeyLthTable700.getSortKeyLthEntry700(index).setTableId700(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TableId700 with another Field
	 *	@param value
	 */
   public void setTableId700(int index,Field source) {
      sortKeyLthTable700.getSortKeyLthEntry700(index).setTableId700(source);
   }  
   
     /**
	 * 	Update TableId700 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId700(int index,Field source, int sourceIndex,int sourceLen) {
      sortKeyLthTable700.getSortKeyLthEntry700(index).setTableId700(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TableId700 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId700(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortKeyLthTable700.getSortKeyLthEntry700(index).setTableId700(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tableItem
	 *	@return tableItem
	 */
   public char[] getTableItem(int index) throws CFException  {              
   		return tableArray.getTableItem(index);
   }

  
	/**
	*  set variable tableItem
	*  @param value
	**/
   public void setTableItem(int index,char[] value) throws CFException {
      tableArray.setTableItem((index),value);
   } 

	/**
	 *	Returns the value of inxBBin
	 *	@return inxBBin
	 */
	public long getInxBBin() throws CFException {        
   		return inxBGroup.getInxBBin();
	}
	
	/**
	 * 	Update InxBBin with the passed value
	 *	@param number
	 */
	public void setInxBBin(long number)  throws CFException{
		inxBGroup.setInxBBin(number);
	}



	/**
	 *	Returns the value of report1HeadingLine11701
	 *	@return report1HeadingLine11701
	 */   
	 public Report1HeadingLine11701 getReport1HeadingLine11701() {
   	return grp1.getReport1HeadingLine11701();
   }

   /**
	* 	Update Report1HeadingLine11701 with the passed value
	*	@param value
	*/
   public void setReport1HeadingLine11701(char[] value) throws CFException {
      grp1.setReport1HeadingLine11701(value);
   }   

     /**
	 * 	Update Report1HeadingLine11701 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setReport1HeadingLine11701(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	grp1.setReport1HeadingLine11701(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Report1HeadingLine11701 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReport1HeadingLine11701(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	grp1.setReport1HeadingLine11701(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Report1HeadingLine11701 with another Field
	 *	@param value
	 */
   public void setReport1HeadingLine11701(Field source) {
   	grp1.setReport1HeadingLine11701(source);
   }  
   
     /**
	 * 	Update Report1HeadingLine11701 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setReport1HeadingLine11701(Field source, int sourceIndex,int sourceLen) {
   	grp1.setReport1HeadingLine11701(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Report1HeadingLine11701 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReport1HeadingLine11701(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	grp1.setReport1HeadingLine11701(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setInxA(int inxA) { 
    McissuesCtx.this.inxA = inxA;
}

public int getInxA() { 
    return McissuesCtx.this.inxA;
}
	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public int getValue1300() throws CFException {
   		return work.getValue1300();
	}


	/**
	 *	Returns String value of value1300
	 *	@return value1300
	 */
	public char[]  getValue1300String() throws CFException {
	     return String.valueOf(work.getValue1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1300IsNumeric()  throws CFException{
	    return work.value1300IsNumeric();
	}

	/**
	 * 	Update Value1300 with the passed value
	 *	@param number
	 */
	public void setValue1300(int number)  throws CFException{
		work.setValue1300(number);
	}
	

	public void setValue1300(long number)  throws CFException{
	    work.setValue1300(number);
	}
	
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1300(char[] value)  throws CFException {
		work.setValue1300(value);
	}
	
	/**
	 * 	Update Value1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1300String(char[] value)  throws CFException{
		work.setValue1300(value);
	}	

	/**
	 *	Returns the value of value10300
	 *	@return value10300
	 */
	public int getValue10300() throws CFException {
   		return work.getValue10300();
	}


	/**
	 *	Returns String value of value10300
	 *	@return value10300
	 */
	public char[]  getValue10300String() throws CFException {
	     return String.valueOf(work.getValue10300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value10300IsNumeric()  throws CFException{
	    return work.value10300IsNumeric();
	}

	/**
	 * 	Update Value10300 with the passed value
	 *	@param number
	 */
	public void setValue10300(int number)  throws CFException{
		work.setValue10300(number);
	}
	

	public void setValue10300(long number)  throws CFException{
	    work.setValue10300(number);
	}
	
	
	/**
	 * 	Update Value10300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue10300(char[] value)  throws CFException {
		work.setValue10300(value);
	}
	
	/**
	 * 	Update Value10300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue10300String(char[] value)  throws CFException{
		work.setValue10300(value);
	}	

	/**
	 *	Returns the value of dtlCntZo800
	 *	@return dtlCntZo800
	 */
	public long getDtlCntZo800() throws CFException {
   		return dtlCnt800.getDtlCntZ800().getDtlCntZo800();
	}


	/**
	 *	Returns String value of dtlCntZo800
	 *	@return dtlCntZo800
	 */
	public char[]  getDtlCntZo800String() throws CFException {
	     return String.valueOf(dtlCnt800.getDtlCntZ800().getDtlCntZo800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dtlCntZo800IsNumeric()  throws CFException{
	    return dtlCnt800.getDtlCntZ800().dtlCntZo800IsNumeric();
	}

	/**
	 * 	Update DtlCntZo800 with the passed value
	 *	@param number
	 */
	public void setDtlCntZo800(long number)  throws CFException{
		dtlCnt800.getDtlCntZ800().setDtlCntZo800(number);
	}
	

	
	/**
	 * 	Update DtlCntZo800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDtlCntZo800(char[] value)  throws CFException {
		dtlCnt800.getDtlCntZ800().setDtlCntZo800(value);
	}
	
	/**
	 * 	Update DtlCntZo800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDtlCntZo800String(char[] value)  throws CFException{
		dtlCnt800.getDtlCntZ800().setDtlCntZo800(value);
	}	

	/**
	 *	Returns the value of inxB
	 *	@return inxB
	 */
	public int getInxB() throws CFException {        
   		return inxBGroup.getInxB();
	}
	
	/**
	 * 	Update InxB with the passed value
	 *	@param number
	 */
	public void setInxB(int number)  throws CFException{
		inxBGroup.setInxB(number);
	}


	public void setInxB(long number)  throws CFException{
		inxBGroup.setInxB((int)number);
	}



public void setInxC(int inxC) { 
    McissuesCtx.this.inxC = inxC;
}

public int getInxC() { 
    return McissuesCtx.this.inxC;
}
	/**
	 *	Returns the value of grp1
	 *	@return grp1
	 */   
	 public Grp1 getGrp1() {
   	return grp1;
   }


	/**
	 *	Returns the value of dtlRecord3800
	 *	@return dtlRecord3800
	 */   
	 public DtlRecord3800 getDtlRecord3800() {
   	return dtlRecord3800;
   }


	/**
	 *	Returns the value of dtlCnt800
	 *	@return dtlCnt800
	 */   
	 public DtlCnt800 getDtlCnt800() {
   	return dtlCnt800;
   }


	/**
	 *	Returns the value of iCtr400
	 *	@return iCtr400
	 */
	public short getICtr400() throws CFException {        
   		return work.getICtr400();
	}
	
	/**
	 * 	Update ICtr400 with the passed value
	 *	@param number
	 */
	public void setICtr400(short number)  throws CFException{
		work.setICtr400(number);
	}

	public void setICtr400(int number)  throws CFException{
		work.setICtr400((short)number);
	}

	public void setICtr400(long number)  throws CFException{
		work.setICtr400((short)number);
	}




        public McissuesCtx getMcissuesCtx() {
            return McissuesCtx.this;
        }

        public MainSplit5OutCtx getMainSplit5OutCtx() {
            return new MainSplit5OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip43501ErrorInfoRec.hashCode();
        str += dtlRecord4800.hashCode();
        str += work.hashCode();
        str += grp1.hashCode();
        str += inxBGroup.hashCode();
        str += dtlRecord3800.hashCode();
        str += sortKeyLthTable700.hashCode();
        str += dtlCnt800.hashCode();
        str += tableArray.hashCode();
       return str.hashCode();
    }

    public MainSplit5InCtx clone() {
        MainSplit5InCtx cloneObj = new MainSplit5InCtx();
        cloneObj.ip43501ErrorInfoRec = new Ip43501ErrorInfoRec();
        cloneObj.ip43501ErrorInfoRec.set(ip43501ErrorInfoRec.getClonedField());
        cloneObj.dtlRecord4800 = new DtlRecord4800();
        cloneObj.dtlRecord4800.set(dtlRecord4800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.grp1 = new Grp1();
        cloneObj.grp1.set(grp1.getClonedField());
        cloneObj.inxBGroup = new InxBGroup();
        cloneObj.inxBGroup.set(inxBGroup.getClonedField());
        cloneObj.dtlRecord3800 = new DtlRecord3800();
        cloneObj.dtlRecord3800.set(dtlRecord3800.getClonedField());
        cloneObj.sortKeyLthTable700 = new SortKeyLthTable700();
        cloneObj.sortKeyLthTable700.set(sortKeyLthTable700.getClonedField());
        cloneObj.dtlCnt800 = new DtlCnt800();
        cloneObj.dtlCnt800.set(dtlCnt800.getClonedField());
        cloneObj.tableArray = new TableArray();
        cloneObj.tableArray.set(tableArray.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit5InCtx getMainSplit5InCtx() {
            return new MainSplit5InCtx();
    }
     public class MainSplit5OutCtx implements Cloneable {
     Ip43501ErrorInfoRec ip43501ErrorInfoRec = McissuesCtx.this.getIp43501ErrorInfoRec();
     DtlRecord4800 dtlRecord4800 = McissuesCtx.this.getDtlRecord4800();
     Work work = McissuesCtx.this.getWork();
     Grp1 grp1 = McissuesCtx.this.getGrp1();
     InxBGroup inxBGroup = McissuesCtx.this.getInxBGroup();
     DtlRecord3800 dtlRecord3800 = McissuesCtx.this.getDtlRecord3800();
     SortKeyLthTable700 sortKeyLthTable700 = McissuesCtx.this.getSortKeyLthTable700();
     DtlCnt800 dtlCnt800 = McissuesCtx.this.getDtlCnt800();
     TableArray tableArray = McissuesCtx.this.getTableArray();

	/**
	 *	Returns the value of dtlCntA800
	 *	@return dtlCntA800
	 */
   public char[] getDtlCntA800() throws CFException  {              
   		return dtlCnt800.getDtlCntA800();
   }

  
	/**
	*  set variable dtlCntA800
	*  @param value
	**/
   public void setDtlCntA800(char[] value) throws CFException {
      dtlCnt800.setDtlCntA800(value);
   } 

     /**
	 * 	Update DtlCntA800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDtlCntA800(char[] source, int sourceIndex) throws CFException {
      dtlCnt800.setDtlCntA800(source, sourceIndex);
   	
   }
   
   public void setDtlCntA800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dtlCnt800.setDtlCntA800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DtlCntA800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDtlCntA800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlCnt800.setDtlCntA800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DtlCntA800 with another Field
	 *	@param value
	 */
   public void setDtlCntA800(Field source) {
      dtlCnt800.setDtlCntA800(source);
   }  
   
     /**
	 * 	Update DtlCntA800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDtlCntA800(Field source, int sourceIndex,int sourceLen) {
      dtlCnt800.setDtlCntA800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DtlCntA800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDtlCntA800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlCnt800.setDtlCntA800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of c0071300
	 *	@return c0071300
	 */
   public char[] getC0071300() throws CFException  {              
   		return work.getC0071300();
   }

  
	/**
	*  set variable c0071300
	*  @param value
	**/
   public void setC0071300(char[] value) throws CFException {
      work.setC0071300(value);
   } 

	/**
	 *	Returns the value of ip43501EiSourceMsgNum
	 *	@return ip43501EiSourceMsgNum
	 */
	public long getIp43501EiSourceMsgNum() throws CFException {
   		return ip43501ErrorInfoRec.getIp43501SortSolution().getIp43501EiSourceMsgNum();
	}


	/**
	 *	Returns String value of ip43501EiSourceMsgNum
	 *	@return ip43501EiSourceMsgNum
	 */
	public char[]  getIp43501EiSourceMsgNumString() throws CFException {
	     return String.valueOf(ip43501ErrorInfoRec.getIp43501SortSolution().getIp43501EiSourceMsgNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip43501EiSourceMsgNumIsNumeric()  throws CFException{
	    return ip43501ErrorInfoRec.getIp43501SortSolution().ip43501EiSourceMsgNumIsNumeric();
	}

	/**
	 * 	Update Ip43501EiSourceMsgNum with the passed value
	 *	@param number
	 */
	public void setIp43501EiSourceMsgNum(long number)  throws CFException{
		ip43501ErrorInfoRec.getIp43501SortSolution().setIp43501EiSourceMsgNum(number);
	}
	

	
	/**
	 * 	Update Ip43501EiSourceMsgNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp43501EiSourceMsgNum(char[] value)  throws CFException {
		ip43501ErrorInfoRec.getIp43501SortSolution().setIp43501EiSourceMsgNum(value);
	}
	
	/**
	 * 	Update Ip43501EiSourceMsgNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp43501EiSourceMsgNumString(char[] value)  throws CFException{
		ip43501ErrorInfoRec.getIp43501SortSolution().setIp43501EiSourceMsgNum(value);
	}	

	/**
	 *	Returns the value of ip00104Elsub
	 *	@return ip00104Elsub
	 */
	public int getIp00104Elsub() throws CFException {
   		return work.getIp00104Elsub();
	}


	/**
	 *	Returns String value of ip00104Elsub
	 *	@return ip00104Elsub
	 */
	public char[]  getIp00104ElsubString() throws CFException {
	     return String.valueOf(work.getIp00104ElsubString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00104ElsubIsNumeric()  throws CFException{
	    return work.ip00104ElsubIsNumeric();
	}

	/**
	 * 	Update Ip00104Elsub with the passed value
	 *	@param number
	 */
	public void setIp00104Elsub(int number)  throws CFException{
		work.setIp00104Elsub(number);
	}
	

	public void setIp00104Elsub(long number)  throws CFException{
	    work.setIp00104Elsub(number);
	}
	
	
	/**
	 * 	Update Ip00104Elsub with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00104Elsub(char[] value)  throws CFException {
		work.setIp00104Elsub(value);
	}
	
	/**
	 * 	Update Ip00104Elsub with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00104ElsubString(char[] value)  throws CFException{
		work.setIp00104Elsub(value);
	}	

	/**
	 *	Returns the value of dtlCount800
	 *	@return dtlCount800
	 */
   public char[] getDtlCount800() throws CFException  {              
   		return dtlRecord3800.getDtlCount800();
   }

  
	/**
	*  set variable dtlCount800
	*  @param value
	**/
   public void setDtlCount800(char[] value) throws CFException {
      dtlRecord3800.setDtlCount800(value);
   } 

     /**
	 * 	Update DtlCount800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDtlCount800(char[] source, int sourceIndex) throws CFException {
      dtlRecord3800.setDtlCount800(source, sourceIndex);
   	
   }
   
   public void setDtlCount800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dtlRecord3800.setDtlCount800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DtlCount800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDtlCount800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlRecord3800.setDtlCount800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DtlCount800 with another Field
	 *	@param value
	 */
   public void setDtlCount800(Field source) {
      dtlRecord3800.setDtlCount800(source);
   }  
   
     /**
	 * 	Update DtlCount800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDtlCount800(Field source, int sourceIndex,int sourceLen) {
      dtlRecord3800.setDtlCount800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DtlCount800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDtlCount800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlRecord3800.setDtlCount800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setInxA(int inxA) { 
    McissuesCtx.this.inxA = inxA;
}

public int getInxA() { 
    return McissuesCtx.this.inxA;
}
	/**
	 *	Returns the value of dtlLast800
	 *	@return dtlLast800
	 */
   public char[] getDtlLast800() throws CFException  {              
   		return dtlRecord4800.getDtlLast800();
   }

  
	/**
	*  set variable dtlLast800
	*  @param value
	**/
   public void setDtlLast800(char[] value) throws CFException {
      dtlRecord4800.setDtlLast800(value);
   } 

     /**
	 * 	Update DtlLast800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDtlLast800(char[] source, int sourceIndex) throws CFException {
      dtlRecord4800.setDtlLast800(source, sourceIndex);
   	
   }
   
   public void setDtlLast800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dtlRecord4800.setDtlLast800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DtlLast800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDtlLast800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlRecord4800.setDtlLast800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DtlLast800 with another Field
	 *	@param value
	 */
   public void setDtlLast800(Field source) {
      dtlRecord4800.setDtlLast800(source);
   }  
   
     /**
	 * 	Update DtlLast800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDtlLast800(Field source, int sourceIndex,int sourceLen) {
      dtlRecord4800.setDtlLast800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DtlLast800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDtlLast800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlRecord4800.setDtlLast800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mcissuesWhenCompiled
	 *	@return mcissuesWhenCompiled
	 */
   public char[] getMcissuesWhenCompiled() throws CFException  {              
   		return work.getMcissuesWhenCompiled();
   }

  
	/**
	*  set variable mcissuesWhenCompiled
	*  @param value
	**/
   public void setMcissuesWhenCompiled(char[] value) throws CFException {
      work.setMcissuesWhenCompiled(value);
   } 

	/**
	 *	Returns the value of inxD
	 *	@return inxD
	 */
	public int getInxD() throws CFException {        
   		return inxD;
	}
	
	/**
	 * 	Update InxD with the passed value
	 *	@param number
	 */
	public void setInxD(int number)  throws CFException{
		McissuesCtx.this.setInxD(number);
	}


	public void setInxD(long number)  throws CFException{
		McissuesCtx.this.setInxD((int)number);
	}


	/**
	 *	Returns the value of dtlCntZo800
	 *	@return dtlCntZo800
	 */
	public long getDtlCntZo800() throws CFException {
   		return dtlCnt800.getDtlCntZ800().getDtlCntZo800();
	}


	/**
	 *	Returns String value of dtlCntZo800
	 *	@return dtlCntZo800
	 */
	public char[]  getDtlCntZo800String() throws CFException {
	     return String.valueOf(dtlCnt800.getDtlCntZ800().getDtlCntZo800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dtlCntZo800IsNumeric()  throws CFException{
	    return dtlCnt800.getDtlCntZ800().dtlCntZo800IsNumeric();
	}

	/**
	 * 	Update DtlCntZo800 with the passed value
	 *	@param number
	 */
	public void setDtlCntZo800(long number)  throws CFException{
		dtlCnt800.getDtlCntZ800().setDtlCntZo800(number);
	}
	

	
	/**
	 * 	Update DtlCntZo800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDtlCntZo800(char[] value)  throws CFException {
		dtlCnt800.getDtlCntZ800().setDtlCntZo800(value);
	}
	
	/**
	 * 	Update DtlCntZo800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDtlCntZo800String(char[] value)  throws CFException{
		dtlCnt800.getDtlCntZ800().setDtlCntZo800(value);
	}	

	/**
	 *	Returns the value of ip43501ErrorInfoRec
	 *	@return ip43501ErrorInfoRec
	 */   
	 public Ip43501ErrorInfoRec getIp43501ErrorInfoRec() {
   	return ip43501ErrorInfoRec;
   }


	/**
	 *	Returns the value of dtlRecord4800
	 *	@return dtlRecord4800
	 */   
	 public DtlRecord4800 getDtlRecord4800() {
   	return dtlRecord4800;
   }



public void setInxC(int inxC) { 
    McissuesCtx.this.inxC = inxC;
}

public int getInxC() { 
    return McissuesCtx.this.inxC;
}
	/**
	 *	Returns the value of sourceMessageNo701
	 *	@return sourceMessageNo701
	 */
   public char[] getSourceMessageNo701() throws CFException  {              
   		return grp1.getReport1HeadingLine11701().getSourceMessageNo701();
   }

  
	/**
	*  set variable sourceMessageNo701
	*  @param value
	**/
   public void setSourceMessageNo701(char[] value) throws CFException {
      grp1.getReport1HeadingLine11701().setSourceMessageNo701(value);
   } 

     /**
	 * 	Update SourceMessageNo701 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSourceMessageNo701(char[] source, int sourceIndex) throws CFException {
      grp1.getReport1HeadingLine11701().setSourceMessageNo701(source, sourceIndex);
   	
   }
   
   public void setSourceMessageNo701(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      grp1.getReport1HeadingLine11701().setSourceMessageNo701(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SourceMessageNo701 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSourceMessageNo701(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      grp1.getReport1HeadingLine11701().setSourceMessageNo701(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SourceMessageNo701 with another Field
	 *	@param value
	 */
   public void setSourceMessageNo701(Field source) {
      grp1.getReport1HeadingLine11701().setSourceMessageNo701(source);
   }  
   
     /**
	 * 	Update SourceMessageNo701 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSourceMessageNo701(Field source, int sourceIndex,int sourceLen) {
      grp1.getReport1HeadingLine11701().setSourceMessageNo701(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SourceMessageNo701 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSourceMessageNo701(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      grp1.getReport1HeadingLine11701().setSourceMessageNo701(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dtlRecord3800
	 *	@return dtlRecord3800
	 */   
	 public DtlRecord3800 getDtlRecord3800() {
   	return dtlRecord3800;
   }


	/**
	 *	Test condition " 3. TRANSACTIONS QUALIFIED WITH MASTERCARD ASSIGNE D ID PDS 00176" for isSys201L0388800()
	 *	@return  Returns true if isSys201L0388800() is " 3. TRANSACTIONS QUALIFIED WITH MASTERCARD ASSIGNE D ID PDS 00176"
	 */
   public boolean isSys201L0388800() throws CFException {
      return work.isSys201L0388800();
   }

	/**
	*  set values " 3. TRANSACTIONS QUALIFIED WITH MASTERCARD ASSIGNE D ID PDS 00176"
	*/
   	public void setSys201L0388800True()  throws CFException{  			
    	work.setSys201L0388800True();
   	}
	/**
	 *	Returns the value of dtlCnt800
	 *	@return dtlCnt800
	 */   
	 public DtlCnt800 getDtlCnt800() {
   	return dtlCnt800;
   }


	/**
	 *	Returns the value of iCtr400
	 *	@return iCtr400
	 */
	public short getICtr400() throws CFException {        
   		return work.getICtr400();
	}
	
	/**
	 * 	Update ICtr400 with the passed value
	 *	@param number
	 */
	public void setICtr400(short number)  throws CFException{
		work.setICtr400(number);
	}

	public void setICtr400(int number)  throws CFException{
		work.setICtr400((short)number);
	}

	public void setICtr400(long number)  throws CFException{
		work.setICtr400((short)number);
	}




        public McissuesCtx getMcissuesCtx() {
            return McissuesCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip43501ErrorInfoRec.hashCode();
        str += dtlRecord4800.hashCode();
        str += work.hashCode();
        str += grp1.hashCode();
        str += inxBGroup.hashCode();
        str += dtlRecord3800.hashCode();
        str += sortKeyLthTable700.hashCode();
        str += dtlCnt800.hashCode();
        str += tableArray.hashCode();
       return str.hashCode();
    }

    public MainSplit5OutCtx clone() {
        MainSplit5OutCtx cloneObj = new MainSplit5OutCtx();
        cloneObj.ip43501ErrorInfoRec = new Ip43501ErrorInfoRec();
        cloneObj.ip43501ErrorInfoRec.set(ip43501ErrorInfoRec.getClonedField());
        cloneObj.dtlRecord4800 = new DtlRecord4800();
        cloneObj.dtlRecord4800.set(dtlRecord4800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.grp1 = new Grp1();
        cloneObj.grp1.set(grp1.getClonedField());
        cloneObj.inxBGroup = new InxBGroup();
        cloneObj.inxBGroup.set(inxBGroup.getClonedField());
        cloneObj.dtlRecord3800 = new DtlRecord3800();
        cloneObj.dtlRecord3800.set(dtlRecord3800.getClonedField());
        cloneObj.sortKeyLthTable700 = new SortKeyLthTable700();
        cloneObj.sortKeyLthTable700.set(sortKeyLthTable700.getClonedField());
        cloneObj.dtlCnt800 = new DtlCnt800();
        cloneObj.dtlCnt800.set(dtlCnt800.getClonedField());
        cloneObj.tableArray = new TableArray();
        cloneObj.tableArray.set(tableArray.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit5OutCtx getMainSplit5OutCtx() {
            return new MainSplit5OutCtx();
    }
     public class FindMoveReplaceTextInCtx implements Cloneable {
     Work work = McissuesCtx.this.getWork();

	/**
	 *	Returns the value of ip00321ReplTextCount
	 *	@return ip00321ReplTextCount
	 */
	public int getIp00321ReplTextCount() throws CFException {
   		return work.getIp00321ReplTextCount();
	}


	/**
	 *	Returns String value of ip00321ReplTextCount
	 *	@return ip00321ReplTextCount
	 */
	public char[]  getIp00321ReplTextCountString() throws CFException {
	     return String.valueOf(work.getIp00321ReplTextCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00321ReplTextCountIsNumeric()  throws CFException{
	    return work.ip00321ReplTextCountIsNumeric();
	}

	/**
	 * 	Update Ip00321ReplTextCount with the passed value
	 *	@param number
	 */
	public void setIp00321ReplTextCount(int number)  throws CFException{
		work.setIp00321ReplTextCount(number);
	}
	

	public void setIp00321ReplTextCount(long number)  throws CFException{
	    work.setIp00321ReplTextCount(number);
	}
	
	
	/**
	 * 	Update Ip00321ReplTextCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00321ReplTextCount(char[] value)  throws CFException {
		work.setIp00321ReplTextCount(value);
	}
	
	/**
	 * 	Update Ip00321ReplTextCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00321ReplTextCountString(char[] value)  throws CFException{
		work.setIp00321ReplTextCount(value);
	}	


        public McissuesCtx getMcissuesCtx() {
            return McissuesCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public FindMoveReplaceTextInCtx clone() {
        FindMoveReplaceTextInCtx cloneObj = new FindMoveReplaceTextInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FindMoveReplaceTextInCtx getFindMoveReplaceTextInCtx() {
            return new FindMoveReplaceTextInCtx();
    }
     public class ExitInCtx implements Cloneable {
     Work work = McissuesCtx.this.getWork();

	/**
	 *	Returns the value of ip00321ReplTextCount
	 *	@return ip00321ReplTextCount
	 */
	public int getIp00321ReplTextCount() throws CFException {
   		return work.getIp00321ReplTextCount();
	}


	/**
	 *	Returns String value of ip00321ReplTextCount
	 *	@return ip00321ReplTextCount
	 */
	public char[]  getIp00321ReplTextCountString() throws CFException {
	     return String.valueOf(work.getIp00321ReplTextCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00321ReplTextCountIsNumeric()  throws CFException{
	    return work.ip00321ReplTextCountIsNumeric();
	}

	/**
	 * 	Update Ip00321ReplTextCount with the passed value
	 *	@param number
	 */
	public void setIp00321ReplTextCount(int number)  throws CFException{
		work.setIp00321ReplTextCount(number);
	}
	

	public void setIp00321ReplTextCount(long number)  throws CFException{
	    work.setIp00321ReplTextCount(number);
	}
	
	
	/**
	 * 	Update Ip00321ReplTextCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00321ReplTextCount(char[] value)  throws CFException {
		work.setIp00321ReplTextCount(value);
	}
	
	/**
	 * 	Update Ip00321ReplTextCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00321ReplTextCountString(char[] value)  throws CFException{
		work.setIp00321ReplTextCount(value);
	}	


        public McissuesCtx getMcissuesCtx() {
            return McissuesCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public ExitInCtx clone() {
        ExitInCtx cloneObj = new ExitInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ExitInCtx getExitInCtx() {
            return new ExitInCtx();
    }
     public class SearchHolidayExclusionInCtx implements Cloneable {
     InterimDateXGroup800 interimDateXGroup800 = McissuesCtx.this.getInterimDateXGroup800();
     Holidays500 holidays500 = McissuesCtx.this.getHolidays500();
     Work work = McissuesCtx.this.getWork();


public void setHolidayIndex500(int holidayIndex500) { 
    McissuesCtx.this.holidayIndex500 = holidayIndex500;
}

public int getHolidayIndex500() { 
    return McissuesCtx.this.holidayIndex500;
}
	/**
	 *	Returns the value of holidays500
	 *	@return holidays500
	 */   
	 public Holidays500 getHolidays500() {
   	return holidays500;
   }


	/**
	 *	Returns the value of julianHolidays500
	 *	@return julianHolidays500
	 */
	public int getJulianHolidays500(int index) throws CFException {
   		return holidays500.getJulianHolidays500((index));
	}


	/**
	 *	Returns String value of julianHolidays500
	 *	@return julianHolidays500
	 */
	public char[]  getJulianHolidays500String(int index) throws CFException {
	     return String.valueOf(holidays500.getJulianHolidays500String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean julianHolidays500IsNumeric(int index)  throws CFException{
	    return holidays500.julianHolidays500IsNumeric(index);
	}

	/**
	 * 	Update JulianHolidays500 with the passed value
	 *	@param number
	 */
	public void setJulianHolidays500(int index,int number)  throws CFException{
		holidays500.setJulianHolidays500((index),number);
	}
	

	public void setJulianHolidays500(int index,long number)  throws CFException{
	    holidays500.setJulianHolidays500((index),number);
	}
	
	
	/**
	 * 	Update JulianHolidays500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setJulianHolidays500(int index,char[] value)  throws CFException {
		holidays500.setJulianHolidays500((index),value);
	}
	
	/**
	 * 	Update JulianHolidays500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJulianHolidays500String(int index,char[] value)  throws CFException{
		holidays500.setJulianHolidays500((index),value);
	}	

	/**
	 *	Returns the value of interimJulianDate800
	 *	@return interimJulianDate800
	 */
	public long getInterimJulianDate800() throws CFException {
   		return interimDateXGroup800.getInterimDate800().getInterimJulianDate800();
	}


	/**
	 *	Returns String value of interimJulianDate800
	 *	@return interimJulianDate800
	 */
	public char[]  getInterimJulianDate800String() throws CFException {
	     return String.valueOf(interimDateXGroup800.getInterimDate800().getInterimJulianDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean interimJulianDate800IsNumeric()  throws CFException{
	    return interimDateXGroup800.getInterimDate800().interimJulianDate800IsNumeric();
	}

	/**
	 * 	Update InterimJulianDate800 with the passed value
	 *	@param number
	 */
	public void setInterimJulianDate800(long number)  throws CFException{
		interimDateXGroup800.getInterimDate800().setInterimJulianDate800(number);
	}
	

	
	/**
	 * 	Update InterimJulianDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setInterimJulianDate800(char[] value)  throws CFException {
		interimDateXGroup800.getInterimDate800().setInterimJulianDate800(value);
	}
	
	/**
	 * 	Update InterimJulianDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInterimJulianDate800String(char[] value)  throws CFException{
		interimDateXGroup800.getInterimDate800().setInterimJulianDate800(value);
	}	


        public McissuesCtx getMcissuesCtx() {
            return McissuesCtx.this;
        }

        public SearchHolidayExclusionOutCtx getSearchHolidayExclusionOutCtx() {
            return new SearchHolidayExclusionOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += interimDateXGroup800.hashCode();
        str += holidays500.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SearchHolidayExclusionInCtx clone() {
        SearchHolidayExclusionInCtx cloneObj = new SearchHolidayExclusionInCtx();
        cloneObj.interimDateXGroup800 = new InterimDateXGroup800();
        cloneObj.interimDateXGroup800.set(interimDateXGroup800.getClonedField());
        cloneObj.holidays500 = new Holidays500();
        cloneObj.holidays500.set(holidays500.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SearchHolidayExclusionInCtx getSearchHolidayExclusionInCtx() {
            return new SearchHolidayExclusionInCtx();
    }
     public class SearchHolidayExclusionOutCtx implements Cloneable {
     InterimDateXGroup800 interimDateXGroup800 = McissuesCtx.this.getInterimDateXGroup800();
     Holidays500 holidays500 = McissuesCtx.this.getHolidays500();
     Work work = McissuesCtx.this.getWork();

	/**
	 *	Test condition "2" for isExclusionOn88100()
	 *	@return  Returns true if isExclusionOn88100() is "2"
	 */
   public boolean isExclusionOn88100() throws CFException {
      return work.isExclusionOn88100();
   }

	/**
	*  set values "2"
	*/
   	public void setExclusionOn88100True()  throws CFException{  			
    	work.setExclusionOn88100True();
   	}

public void setHolidayIndex500(int holidayIndex500) { 
    McissuesCtx.this.holidayIndex500 = holidayIndex500;
}

public int getHolidayIndex500() { 
    return McissuesCtx.this.holidayIndex500;
}

        public McissuesCtx getMcissuesCtx() {
            return McissuesCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += interimDateXGroup800.hashCode();
        str += holidays500.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SearchHolidayExclusionOutCtx clone() {
        SearchHolidayExclusionOutCtx cloneObj = new SearchHolidayExclusionOutCtx();
        cloneObj.interimDateXGroup800 = new InterimDateXGroup800();
        cloneObj.interimDateXGroup800.set(interimDateXGroup800.getClonedField());
        cloneObj.holidays500 = new Holidays500();
        cloneObj.holidays500.set(holidays500.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SearchHolidayExclusionOutCtx getSearchHolidayExclusionOutCtx() {
            return new SearchHolidayExclusionOutCtx();
    }
     public class MoveEditFieldsInCtx implements Cloneable {
     Work work = McissuesCtx.this.getWork();

	/**
	 *	Returns the value of var1Ed
	 *	@return var1Ed
	 */
   public char[] getVar1Ed() throws CFException  {              
   		return work.getVar1Ed();
   }

  
	/**
	*  set variable var1Ed
	*  @param value
	**/
   public void setVar1Ed(char[] value) throws CFException {
      work.setVar1Ed(value);
   } 

     /**
	 * 	Update Var1Ed 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVar1Ed(char[] source, int sourceIndex) throws CFException {
      work.setVar1Ed(source, sourceIndex);
   	
   }
   
   public void setVar1Ed(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setVar1Ed(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Var1Ed 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVar1Ed(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setVar1Ed(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Var1Ed with another Field
	 *	@param value
	 */
   public void setVar1Ed(Field source) {
      work.setVar1Ed(source);
   }  
   
     /**
	 * 	Update Var1Ed 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVar1Ed(Field source, int sourceIndex,int sourceLen) {
      work.setVar1Ed(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Var1Ed 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVar1Ed(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setVar1Ed(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public McissuesCtx getMcissuesCtx() {
            return McissuesCtx.this;
        }

        public MoveEditFieldsOutCtx getMoveEditFieldsOutCtx() {
            return new MoveEditFieldsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public MoveEditFieldsInCtx clone() {
        MoveEditFieldsInCtx cloneObj = new MoveEditFieldsInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MoveEditFieldsInCtx getMoveEditFieldsInCtx() {
            return new MoveEditFieldsInCtx();
    }
     public class MoveEditFieldsOutCtx implements Cloneable {
     Work work = McissuesCtx.this.getWork();

	/**
	 *	Returns the value of var2Ed
	 *	@return var2Ed
	 */
   public char[] getVar2Ed() throws CFException  {              
   		return work.getVar2Ed();
   }

  
	/**
	*  set variable var2Ed
	*  @param value
	**/
   public void setVar2Ed(char[] value) throws CFException {
      work.setVar2Ed(value);
   } 

     /**
	 * 	Update Var2Ed 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVar2Ed(char[] source, int sourceIndex) throws CFException {
      work.setVar2Ed(source, sourceIndex);
   	
   }
   
   public void setVar2Ed(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setVar2Ed(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Var2Ed 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVar2Ed(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setVar2Ed(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Var2Ed with another Field
	 *	@param value
	 */
   public void setVar2Ed(Field source) {
      work.setVar2Ed(source);
   }  
   
     /**
	 * 	Update Var2Ed 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVar2Ed(Field source, int sourceIndex,int sourceLen) {
      work.setVar2Ed(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Var2Ed 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVar2Ed(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setVar2Ed(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of var1Ed
	 *	@return var1Ed
	 */
   public char[] getVar1Ed() throws CFException  {              
   		return work.getVar1Ed();
   }

  
	/**
	*  set variable var1Ed
	*  @param value
	**/
   public void setVar1Ed(char[] value) throws CFException {
      work.setVar1Ed(value);
   } 

     /**
	 * 	Update Var1Ed 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVar1Ed(char[] source, int sourceIndex) throws CFException {
      work.setVar1Ed(source, sourceIndex);
   	
   }
   
   public void setVar1Ed(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setVar1Ed(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Var1Ed 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVar1Ed(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setVar1Ed(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Var1Ed with another Field
	 *	@param value
	 */
   public void setVar1Ed(Field source) {
      work.setVar1Ed(source);
   }  
   
     /**
	 * 	Update Var1Ed 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVar1Ed(Field source, int sourceIndex,int sourceLen) {
      work.setVar1Ed(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Var1Ed 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVar1Ed(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setVar1Ed(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of var1N
	 *	@return var1N
	 */
	public BigDecimal getVar1N() throws CFException {
   		return work.getVar1N();
	}


	 /**
     *	Returns String value of var1N
     *	@return var1N
     */
    public char[]  getVar1NString() throws CFException {
         return work.getVar1NString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean var1NIsNumeric() {
        return work.var1NIsNumeric();
    }
	/**
	 * 	Update Var1N with the passed number
	 *	@param number
	 */
	public void setVar1N(BigDecimal number)  throws CFException{
		work.setVar1N(number);
   }

	/**
	 * 	Update Var1N with the passed value
	 *	@param value (String or char[]);
	 */
	public void setVar1N(char[] value)  throws CFException{
		work.setVar1N(value);
	}   


        public McissuesCtx getMcissuesCtx() {
            return McissuesCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public MoveEditFieldsOutCtx clone() {
        MoveEditFieldsOutCtx cloneObj = new MoveEditFieldsOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MoveEditFieldsOutCtx getMoveEditFieldsOutCtx() {
            return new MoveEditFieldsOutCtx();
    }
}
