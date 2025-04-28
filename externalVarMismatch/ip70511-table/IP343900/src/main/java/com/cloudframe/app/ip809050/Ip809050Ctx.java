package com.cloudframe.app.ip809050;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.ip809050.dto.Sys201RecordCount600;
import com.cloudframe.app.ip809050.dto.Sys206RecordCount600;
import com.cloudframe.app.global.sharedvar.Ip66102IpmMsg;
import com.cloudframe.app.ip809050.dto.ReadParserErrMsgTxt600;
import com.cloudframe.app.ip809050.dto.Sys214RecordCount600;
import com.cloudframe.app.ip809050.dto.RunControlErrMsgTxt600;
import com.cloudframe.app.global.sharedvar.Ip66102NormalIpmMsg;
import com.cloudframe.app.global.sharedvar.Ip65504CurrentTagTable;
import com.cloudframe.app.ip809050.file.records.Sys001InputIpmOutboundRec;
import com.cloudframe.app.global.sharedvar.Ip00174EntryFoundGroup;
import com.cloudframe.app.global.sharedvar.Ip66102IpmFileInformation;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.ip809050.dto.Sys205RecordCount600;
import com.cloudframe.app.ip809050.file.records.Sys202OutputIpmOtbndRec;
import com.cloudframe.app.global.sharedvar.Ip65504PdsMapGroup;
import com.cloudframe.app.ip809050.dto.Sys207RecordCount600;
import com.cloudframe.app.global.sharedvar.Ip00694EntryFoundGroup;
import com.cloudframe.app.global.sharedvar.Ip33701CurrConvInterface;
import com.cloudframe.app.ip809050.dto.Sys202RecordCount600;
import com.cloudframe.app.ip809050.dto.Pds841ValuesGroup800;
import com.cloudframe.app.ip809050.dto.Work;
import com.cloudframe.app.global.sharedvar.Ip00694TableEntry;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
import com.cloudframe.app.global.sharedvar.Ip0040iAccountRangeInfo;
import com.cloudframe.app.global.sharedvar.Ip08101RunControlRecord;
import com.cloudframe.app.ip809050.dto.Sys213RecordCount600;
import com.cloudframe.app.global.sharedvar.Ip65504TaggedRecordInfo;
import com.cloudframe.app.global.sharedvar.Ip65504MessageStatusGroup;
import com.cloudframe.app.ip809050.dto.Sys212RecordCount600;
import com.cloudframe.app.global.sharedvar.Ip00724TableEntry;
import com.cloudframe.app.ip809050.dto.L1CtlValues800;
import com.cloudframe.app.ip809050.dto.Pds05DataGroup800;
import com.cloudframe.app.ip809050.file.records.Sys205OutputIpmOtbndRec;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
import com.cloudframe.app.ip809050.dto.AbendMessage900;
import com.cloudframe.app.global.sharedvar.SortKey800;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.ip809050.dto.AmtE1754TemGroup800;
import com.cloudframe.app.global.sharedvar.Ip65504SelElemEntriesAll;
import com.cloudframe.app.global.sharedvar.Ip30671OutboundMessageArea;
import com.cloudframe.app.global.sharedvar.Ip00404Table;
import com.cloudframe.app.ip809050.dto.Sys216RecordCount600;
import com.cloudframe.app.ip809050.file.records.Sys204OutputIpmOtbndRec;
import com.cloudframe.app.global.sharedvar.Ip00724EntryFoundYGroup;
import com.cloudframe.app.ip809050.dto.AmtE1848TemGroup800;
import com.cloudframe.app.global.sharedvar.Ip67002Yyddd;
import com.cloudframe.app.ip809050.dto.Sys001RecordCount600;
import com.cloudframe.app.ip809050.dto.Sys211RecordCount600;
import com.cloudframe.app.ip809050.file.records.Sys203OutputIpmOtbndRec;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
import com.cloudframe.app.global.sharedvar.Ip00702CaStringGroup;
import com.cloudframe.app.ip809050.dto.Sys203RecordCount600;
import com.cloudframe.app.ip809050.dto.OutputOtbndErrMsgTxt600;
import com.cloudframe.app.ip809050.dto.Sys215RecordCount600;
import com.cloudframe.app.ip809050.file.records.Sys207OutputIpmOtbndRec;
import com.cloudframe.app.ip809050.dto.ChipLiabVariables800;
import com.cloudframe.app.ip809050.dto.AmtE1852TemGroup800;
import com.cloudframe.app.ip809050.file.records.Sys012RunControlRec;
import com.cloudframe.app.global.sharedvar.Ip65504TcntGroup;
import com.cloudframe.app.ip809050.file.records.Sys206OutputIpmOtbndRec;
import com.cloudframe.app.global.sharedvar.Ip65504DeMapGroup;
import com.cloudframe.app.ip809050.dto.Sys209RecordCount600;
import com.cloudframe.app.global.sharedvar.Ip65504SelPdsEntriesAll;
import com.cloudframe.app.ip809050.dto.AmtE1850TemGroup800;
import com.cloudframe.app.ip809050.dto.AmtE1750TemGroup800;
import com.cloudframe.app.ip809050.dto.AbendParaName900;
import com.cloudframe.app.global.sharedvar.Ip00702CaTable;
import com.cloudframe.app.ip809050.file.records.Sys201OutputIpmOtbndRec;
import com.cloudframe.app.ip809050.dto.InputOutboundErrMsgTxt600;
import com.cloudframe.app.global.sharedvar.Ip00174TableEntry;
import com.cloudframe.app.ip809050.dto.AmtE1849TemGroup800;
import com.cloudframe.app.ip809050.dto.AmtE1851TemGroup800;
import com.cloudframe.app.ip809050.dto.DateCcyymmdd800;
import com.cloudframe.app.global.sharedvar.Ip67002DateParm;
import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
import com.cloudframe.app.ip809050.dto.Sys210RecordCount600;
import com.cloudframe.app.ip809050.dto.Sys204RecordCount600;


@Context
public class Ip809050Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup;
    Ip00724TableEntry ip00724TableEntry;
    Ip00174EntryFoundGroup ip00174EntryFoundGroup;
    Sys206OutputIpmOtbndRec sys206OutputIpmOtbndRec;
    Ip00694EntryFoundGroup ip00694EntryFoundGroup;
    Sys001RecordCount600 sys001RecordCount600;
    Sys209RecordCount600 sys209RecordCount600;
    Ip00694TableEntry ip00694TableEntry;
    Sys210RecordCount600 sys210RecordCount600;
    Ip65504CurrentTagTable ip65504CurrentTagTable;
    Ip08101RunControlRecord ip08101RunControlRecord;
    InputOutboundErrMsgTxt600 inputOutboundErrMsgTxt600;
    Ip65504TaggedRecordInfo ip65504TaggedRecordInfo;
    Ip996011ProgramStartMessage ip996011ProgramStartMessage;
    Ip30671OutboundMessageArea ip30671OutboundMessageArea;
    AmtE1849TemGroup800 amtE1849TemGroup800;
    Ip00724EntryFoundYGroup ip00724EntryFoundYGroup;
    Ip00702CaStringGroup ip00702CaStringGroup;
    Sys214RecordCount600 sys214RecordCount600;
    AmtE1754TemGroup800 amtE1754TemGroup800;
    Sys202OutputIpmOtbndRec sys202OutputIpmOtbndRec;
    AbendMessage900 abendMessage900;
    Ip65504DeMapGroup ip65504DeMapGroup;
    RunControlErrMsgTxt600 runControlErrMsgTxt600;
    Sys206RecordCount600 sys206RecordCount600;
    Ip00702CaTable ip00702CaTable;
    Sys216RecordCount600 sys216RecordCount600;
    Sys001InputIpmOutboundRec sys001InputIpmOutboundRec;
    Ip65504PdsMapGroup ip65504PdsMapGroup;
    Ip66102IpmFileInformation ip66102IpmFileInformation;
    SortKey800 sortKey800;
    Ip66102IpmMsg ip66102IpmMsg;
    Sys204RecordCount600 sys204RecordCount600;
    AmtE1848TemGroup800 amtE1848TemGroup800;
    AmtE1851TemGroup800 amtE1851TemGroup800;
    DateCcyymmdd800 dateCcyymmdd800;
    Sys213RecordCount600 sys213RecordCount600;
    Ip65504SelPdsEntriesAll ip65504SelPdsEntriesAll;
    Sys201RecordCount600 sys201RecordCount600;
    Ip67002DateParm ip67002DateParm;
    AmtE1850TemGroup800 amtE1850TemGroup800;
    Pds841ValuesGroup800 pds841ValuesGroup800;
    Sys203RecordCount600 sys203RecordCount600;
    Ip65504MessageStatusGroup ip65504MessageStatusGroup;
    Ip00404Table ip00404Table;
    Ip60001EventLogWorkArea ip60001EventLogWorkArea;
    Sys215RecordCount600 sys215RecordCount600;
    Ip50005ClearingDtTm ip50005ClearingDtTm;
    Ip33701CurrConvInterface ip33701CurrConvInterface;
    Sys211RecordCount600 sys211RecordCount600;
    OutputOtbndErrMsgTxt600 outputOtbndErrMsgTxt600;
    L1CtlValues800 l1CtlValues800;
    Work work;
    Sys203OutputIpmOtbndRec sys203OutputIpmOtbndRec;
    ChipLiabVariables800 chipLiabVariables800;
    Sys201OutputIpmOtbndRec sys201OutputIpmOtbndRec;
    Sys205OutputIpmOtbndRec sys205OutputIpmOtbndRec;
    Ip65504SelElemEntriesAll ip65504SelElemEntriesAll;
    Pds05DataGroup800 pds05DataGroup800;
    Sys205RecordCount600 sys205RecordCount600;
    Sys207RecordCount600 sys207RecordCount600;
    Sys212RecordCount600 sys212RecordCount600;
    AmtE1852TemGroup800 amtE1852TemGroup800;
    Sys012RunControlRec sys012RunControlRec;
    Ip0040iAccountRangeInfo ip0040iAccountRangeInfo;
    Sys202RecordCount600 sys202RecordCount600;
    Ip65504TcntGroup ip65504TcntGroup;
    Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup;
    Sys207OutputIpmOtbndRec sys207OutputIpmOtbndRec;
    Ip50005OneDayRec ip50005OneDayRec;
    AbendParaName900 abendParaName900;
    Sys204OutputIpmOtbndRec sys204OutputIpmOtbndRec;
    Ip00174TableEntry ip00174TableEntry;
    AmtE1750TemGroup800 amtE1750TemGroup800;
    ReadParserErrMsgTxt600 readParserErrMsgTxt600;


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


    public Ip50005OneDayReadStatusGroup getIp50005OneDayReadStatusGroup() {
        if (ip50005OneDayReadStatusGroup == null) {
            ip50005OneDayReadStatusGroup = globalCtx.getGlobalDto(Ip50005OneDayReadStatusGroup.class);
        }

        return ip50005OneDayReadStatusGroup;
    }

    public Ip00724TableEntry getIp00724TableEntry() {
        if (ip00724TableEntry == null) {
            ip00724TableEntry = globalCtx.getGlobalDto(Ip00724TableEntry.class);
        }

        return ip00724TableEntry;
    }

    public Ip00174EntryFoundGroup getIp00174EntryFoundGroup() {
        if (ip00174EntryFoundGroup == null) {
            ip00174EntryFoundGroup = globalCtx.getGlobalDto(Ip00174EntryFoundGroup.class);
        }

        return ip00174EntryFoundGroup;
    }

    public Sys206OutputIpmOtbndRec getSys206OutputIpmOtbndRec() {
        if (sys206OutputIpmOtbndRec == null) {
            sys206OutputIpmOtbndRec = new Sys206OutputIpmOtbndRec();
        }

        return sys206OutputIpmOtbndRec;
    }

    public void setSys206OutputIpmOtbndRec(Sys206OutputIpmOtbndRec sys206OutputIpmOtbndRec) {
        this.sys206OutputIpmOtbndRec = sys206OutputIpmOtbndRec;
    }
    public Ip00694EntryFoundGroup getIp00694EntryFoundGroup() {
        if (ip00694EntryFoundGroup == null) {
            ip00694EntryFoundGroup = globalCtx.getGlobalDto(Ip00694EntryFoundGroup.class);
        }

        return ip00694EntryFoundGroup;
    }

    public Sys001RecordCount600 getSys001RecordCount600() {
        if (sys001RecordCount600 == null) {
            sys001RecordCount600 = new Sys001RecordCount600();
        }

        return sys001RecordCount600;
    }

    public void setSys001RecordCount600(Sys001RecordCount600 sys001RecordCount600) {
        this.sys001RecordCount600 = sys001RecordCount600;
    }
    public Sys209RecordCount600 getSys209RecordCount600() {
        if (sys209RecordCount600 == null) {
            sys209RecordCount600 = new Sys209RecordCount600();
        }

        return sys209RecordCount600;
    }

    public void setSys209RecordCount600(Sys209RecordCount600 sys209RecordCount600) {
        this.sys209RecordCount600 = sys209RecordCount600;
    }
    public Ip00694TableEntry getIp00694TableEntry() {
        if (ip00694TableEntry == null) {
            ip00694TableEntry = globalCtx.getGlobalDto(Ip00694TableEntry.class);
        }

        return ip00694TableEntry;
    }

    public Sys210RecordCount600 getSys210RecordCount600() {
        if (sys210RecordCount600 == null) {
            sys210RecordCount600 = new Sys210RecordCount600();
        }

        return sys210RecordCount600;
    }

    public void setSys210RecordCount600(Sys210RecordCount600 sys210RecordCount600) {
        this.sys210RecordCount600 = sys210RecordCount600;
    }
    public Ip65504CurrentTagTable getIp65504CurrentTagTable() {
        if (ip65504CurrentTagTable == null) {
            ip65504CurrentTagTable = globalCtx.getGlobalDto(Ip65504CurrentTagTable.class);
        }

        return ip65504CurrentTagTable;
    }

    public Ip08101RunControlRecord getIp08101RunControlRecord() {
        if (ip08101RunControlRecord == null) {
            ip08101RunControlRecord = globalCtx.getGlobalDto(Ip08101RunControlRecord.class);
        }

        return ip08101RunControlRecord;
    }

    public InputOutboundErrMsgTxt600 getInputOutboundErrMsgTxt600() {
        if (inputOutboundErrMsgTxt600 == null) {
            inputOutboundErrMsgTxt600 = new InputOutboundErrMsgTxt600();
        }

        return inputOutboundErrMsgTxt600;
    }

    public void setInputOutboundErrMsgTxt600(InputOutboundErrMsgTxt600 inputOutboundErrMsgTxt600) {
        this.inputOutboundErrMsgTxt600 = inputOutboundErrMsgTxt600;
    }
    public Ip65504TaggedRecordInfo getIp65504TaggedRecordInfo() {
        if (ip65504TaggedRecordInfo == null) {
            ip65504TaggedRecordInfo = globalCtx.getGlobalDto(Ip65504TaggedRecordInfo.class);
        }

        return ip65504TaggedRecordInfo;
    }

    public Ip996011ProgramStartMessage getIp996011ProgramStartMessage() {
        if (ip996011ProgramStartMessage == null) {
            ip996011ProgramStartMessage = globalCtx.getGlobalDto(Ip996011ProgramStartMessage.class);
        }

        return ip996011ProgramStartMessage;
    }

    public Ip30671OutboundMessageArea getIp30671OutboundMessageArea() {
        if (ip30671OutboundMessageArea == null) {
            ip30671OutboundMessageArea = globalCtx.getGlobalDto(Ip30671OutboundMessageArea.class);
        }

        return ip30671OutboundMessageArea;
    }

    public AmtE1849TemGroup800 getAmtE1849TemGroup800() {
        if (amtE1849TemGroup800 == null) {
            amtE1849TemGroup800 = new AmtE1849TemGroup800();
        }

        return amtE1849TemGroup800;
    }

    public void setAmtE1849TemGroup800(AmtE1849TemGroup800 amtE1849TemGroup800) {
        this.amtE1849TemGroup800 = amtE1849TemGroup800;
    }
    public Ip00724EntryFoundYGroup getIp00724EntryFoundYGroup() {
        if (ip00724EntryFoundYGroup == null) {
            ip00724EntryFoundYGroup = globalCtx.getGlobalDto(Ip00724EntryFoundYGroup.class);
        }

        return ip00724EntryFoundYGroup;
    }

    public Ip00702CaStringGroup getIp00702CaStringGroup() {
        if (ip00702CaStringGroup == null) {
            ip00702CaStringGroup = globalCtx.getGlobalDto(Ip00702CaStringGroup.class);
        }

        return ip00702CaStringGroup;
    }

    public Sys214RecordCount600 getSys214RecordCount600() {
        if (sys214RecordCount600 == null) {
            sys214RecordCount600 = new Sys214RecordCount600();
        }

        return sys214RecordCount600;
    }

    public void setSys214RecordCount600(Sys214RecordCount600 sys214RecordCount600) {
        this.sys214RecordCount600 = sys214RecordCount600;
    }
    public AmtE1754TemGroup800 getAmtE1754TemGroup800() {
        if (amtE1754TemGroup800 == null) {
            amtE1754TemGroup800 = new AmtE1754TemGroup800();
        }

        return amtE1754TemGroup800;
    }

    public void setAmtE1754TemGroup800(AmtE1754TemGroup800 amtE1754TemGroup800) {
        this.amtE1754TemGroup800 = amtE1754TemGroup800;
    }
    public Sys202OutputIpmOtbndRec getSys202OutputIpmOtbndRec() {
        if (sys202OutputIpmOtbndRec == null) {
            sys202OutputIpmOtbndRec = new Sys202OutputIpmOtbndRec();
        }

        return sys202OutputIpmOtbndRec;
    }

    public void setSys202OutputIpmOtbndRec(Sys202OutputIpmOtbndRec sys202OutputIpmOtbndRec) {
        this.sys202OutputIpmOtbndRec = sys202OutputIpmOtbndRec;
    }
    public AbendMessage900 getAbendMessage900() {
        if (abendMessage900 == null) {
            abendMessage900 = new AbendMessage900();
        }

        return abendMessage900;
    }

    public void setAbendMessage900(AbendMessage900 abendMessage900) {
        this.abendMessage900 = abendMessage900;
    }
    public Ip65504DeMapGroup getIp65504DeMapGroup() {
        if (ip65504DeMapGroup == null) {
            ip65504DeMapGroup = globalCtx.getGlobalDto(Ip65504DeMapGroup.class);
        }

        return ip65504DeMapGroup;
    }

    public RunControlErrMsgTxt600 getRunControlErrMsgTxt600() {
        if (runControlErrMsgTxt600 == null) {
            runControlErrMsgTxt600 = new RunControlErrMsgTxt600();
        }

        return runControlErrMsgTxt600;
    }

    public void setRunControlErrMsgTxt600(RunControlErrMsgTxt600 runControlErrMsgTxt600) {
        this.runControlErrMsgTxt600 = runControlErrMsgTxt600;
    }
    public Sys206RecordCount600 getSys206RecordCount600() {
        if (sys206RecordCount600 == null) {
            sys206RecordCount600 = new Sys206RecordCount600();
        }

        return sys206RecordCount600;
    }

    public void setSys206RecordCount600(Sys206RecordCount600 sys206RecordCount600) {
        this.sys206RecordCount600 = sys206RecordCount600;
    }
    public Ip00702CaTable getIp00702CaTable() {
        if (ip00702CaTable == null) {
            ip00702CaTable = globalCtx.getGlobalDto(Ip00702CaTable.class);
        }

        return ip00702CaTable;
    }

    public Sys216RecordCount600 getSys216RecordCount600() {
        if (sys216RecordCount600 == null) {
            sys216RecordCount600 = new Sys216RecordCount600();
        }

        return sys216RecordCount600;
    }

    public void setSys216RecordCount600(Sys216RecordCount600 sys216RecordCount600) {
        this.sys216RecordCount600 = sys216RecordCount600;
    }
    public Sys001InputIpmOutboundRec getSys001InputIpmOutboundRec() {
        if (sys001InputIpmOutboundRec == null) {
            sys001InputIpmOutboundRec = new Sys001InputIpmOutboundRec();
        }

        return sys001InputIpmOutboundRec;
    }

    public void setSys001InputIpmOutboundRec(Sys001InputIpmOutboundRec sys001InputIpmOutboundRec) {
        this.sys001InputIpmOutboundRec = sys001InputIpmOutboundRec;
    }
    public Ip65504PdsMapGroup getIp65504PdsMapGroup() {
        if (ip65504PdsMapGroup == null) {
            ip65504PdsMapGroup = globalCtx.getGlobalDto(Ip65504PdsMapGroup.class);
        }

        return ip65504PdsMapGroup;
    }

    public Ip66102IpmFileInformation getIp66102IpmFileInformation() {
        if (ip66102IpmFileInformation == null) {
            ip66102IpmFileInformation = globalCtx.getGlobalDto(Ip66102IpmFileInformation.class);
        }

        return ip66102IpmFileInformation;
    }

    public SortKey800 getSortKey800() {
        if (sortKey800 == null) {
            sortKey800 = globalCtx.getGlobalDto(SortKey800.class);
        }

        return sortKey800;
    }

    public Ip66102IpmMsg getIp66102IpmMsg() {
        if (ip66102IpmMsg == null) {
            ip66102IpmMsg = globalCtx.getGlobalDto(Ip66102IpmMsg.class);
        }

        return ip66102IpmMsg;
    }

    public Sys204RecordCount600 getSys204RecordCount600() {
        if (sys204RecordCount600 == null) {
            sys204RecordCount600 = new Sys204RecordCount600();
        }

        return sys204RecordCount600;
    }

    public void setSys204RecordCount600(Sys204RecordCount600 sys204RecordCount600) {
        this.sys204RecordCount600 = sys204RecordCount600;
    }
    public AmtE1848TemGroup800 getAmtE1848TemGroup800() {
        if (amtE1848TemGroup800 == null) {
            amtE1848TemGroup800 = new AmtE1848TemGroup800();
        }

        return amtE1848TemGroup800;
    }

    public void setAmtE1848TemGroup800(AmtE1848TemGroup800 amtE1848TemGroup800) {
        this.amtE1848TemGroup800 = amtE1848TemGroup800;
    }
    public AmtE1851TemGroup800 getAmtE1851TemGroup800() {
        if (amtE1851TemGroup800 == null) {
            amtE1851TemGroup800 = new AmtE1851TemGroup800();
        }

        return amtE1851TemGroup800;
    }

    public void setAmtE1851TemGroup800(AmtE1851TemGroup800 amtE1851TemGroup800) {
        this.amtE1851TemGroup800 = amtE1851TemGroup800;
    }
    public DateCcyymmdd800 getDateCcyymmdd800() {
        if (dateCcyymmdd800 == null) {
            dateCcyymmdd800 = new DateCcyymmdd800();
        }

        return dateCcyymmdd800;
    }

    public void setDateCcyymmdd800(DateCcyymmdd800 dateCcyymmdd800) {
        this.dateCcyymmdd800 = dateCcyymmdd800;
    }
    public Sys213RecordCount600 getSys213RecordCount600() {
        if (sys213RecordCount600 == null) {
            sys213RecordCount600 = new Sys213RecordCount600();
        }

        return sys213RecordCount600;
    }

    public void setSys213RecordCount600(Sys213RecordCount600 sys213RecordCount600) {
        this.sys213RecordCount600 = sys213RecordCount600;
    }
    public Ip65504SelPdsEntriesAll getIp65504SelPdsEntriesAll() {
        if (ip65504SelPdsEntriesAll == null) {
            ip65504SelPdsEntriesAll = globalCtx.getGlobalDto(Ip65504SelPdsEntriesAll.class);
        }

        return ip65504SelPdsEntriesAll;
    }

    public Sys201RecordCount600 getSys201RecordCount600() {
        if (sys201RecordCount600 == null) {
            sys201RecordCount600 = new Sys201RecordCount600();
        }

        return sys201RecordCount600;
    }

    public void setSys201RecordCount600(Sys201RecordCount600 sys201RecordCount600) {
        this.sys201RecordCount600 = sys201RecordCount600;
    }
    public Ip67002DateParm getIp67002DateParm() {
        if (ip67002DateParm == null) {
            ip67002DateParm = globalCtx.getGlobalDto(Ip67002DateParm.class);
        }

        return ip67002DateParm;
    }

    public AmtE1850TemGroup800 getAmtE1850TemGroup800() {
        if (amtE1850TemGroup800 == null) {
            amtE1850TemGroup800 = new AmtE1850TemGroup800();
        }

        return amtE1850TemGroup800;
    }

    public void setAmtE1850TemGroup800(AmtE1850TemGroup800 amtE1850TemGroup800) {
        this.amtE1850TemGroup800 = amtE1850TemGroup800;
    }
    public Pds841ValuesGroup800 getPds841ValuesGroup800() {
        if (pds841ValuesGroup800 == null) {
            pds841ValuesGroup800 = new Pds841ValuesGroup800();
        }

        return pds841ValuesGroup800;
    }

    public void setPds841ValuesGroup800(Pds841ValuesGroup800 pds841ValuesGroup800) {
        this.pds841ValuesGroup800 = pds841ValuesGroup800;
    }
    public Sys203RecordCount600 getSys203RecordCount600() {
        if (sys203RecordCount600 == null) {
            sys203RecordCount600 = new Sys203RecordCount600();
        }

        return sys203RecordCount600;
    }

    public void setSys203RecordCount600(Sys203RecordCount600 sys203RecordCount600) {
        this.sys203RecordCount600 = sys203RecordCount600;
    }
    public Ip65504MessageStatusGroup getIp65504MessageStatusGroup() {
        if (ip65504MessageStatusGroup == null) {
            ip65504MessageStatusGroup = globalCtx.getGlobalDto(Ip65504MessageStatusGroup.class);
        }

        return ip65504MessageStatusGroup;
    }

    public Ip00404Table getIp00404Table() {
        if (ip00404Table == null) {
            ip00404Table = globalCtx.getGlobalDto(Ip00404Table.class);
        }

        return ip00404Table;
    }

    public Ip60001EventLogWorkArea getIp60001EventLogWorkArea() {
        if (ip60001EventLogWorkArea == null) {
            ip60001EventLogWorkArea = globalCtx.getGlobalDto(Ip60001EventLogWorkArea.class);
        }

        return ip60001EventLogWorkArea;
    }

    public Sys215RecordCount600 getSys215RecordCount600() {
        if (sys215RecordCount600 == null) {
            sys215RecordCount600 = new Sys215RecordCount600();
        }

        return sys215RecordCount600;
    }

    public void setSys215RecordCount600(Sys215RecordCount600 sys215RecordCount600) {
        this.sys215RecordCount600 = sys215RecordCount600;
    }
    public Ip50005ClearingDtTm getIp50005ClearingDtTm() {
        if (ip50005ClearingDtTm == null) {
            ip50005ClearingDtTm = globalCtx.getGlobalDto(Ip50005ClearingDtTm.class);
        }

        return ip50005ClearingDtTm;
    }

    public Ip33701CurrConvInterface getIp33701CurrConvInterface() {
        if (ip33701CurrConvInterface == null) {
            ip33701CurrConvInterface = globalCtx.getGlobalDto(Ip33701CurrConvInterface.class);
        }

        return ip33701CurrConvInterface;
    }

    public Sys211RecordCount600 getSys211RecordCount600() {
        if (sys211RecordCount600 == null) {
            sys211RecordCount600 = new Sys211RecordCount600();
        }

        return sys211RecordCount600;
    }

    public void setSys211RecordCount600(Sys211RecordCount600 sys211RecordCount600) {
        this.sys211RecordCount600 = sys211RecordCount600;
    }
    public OutputOtbndErrMsgTxt600 getOutputOtbndErrMsgTxt600() {
        if (outputOtbndErrMsgTxt600 == null) {
            outputOtbndErrMsgTxt600 = new OutputOtbndErrMsgTxt600();
        }

        return outputOtbndErrMsgTxt600;
    }

    public void setOutputOtbndErrMsgTxt600(OutputOtbndErrMsgTxt600 outputOtbndErrMsgTxt600) {
        this.outputOtbndErrMsgTxt600 = outputOtbndErrMsgTxt600;
    }
    public L1CtlValues800 getL1CtlValues800() {
        if (l1CtlValues800 == null) {
            l1CtlValues800 = new L1CtlValues800();
        }

        return l1CtlValues800;
    }

    public void setL1CtlValues800(L1CtlValues800 l1CtlValues800) {
        this.l1CtlValues800 = l1CtlValues800;
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
    public Sys203OutputIpmOtbndRec getSys203OutputIpmOtbndRec() {
        if (sys203OutputIpmOtbndRec == null) {
            sys203OutputIpmOtbndRec = new Sys203OutputIpmOtbndRec();
        }

        return sys203OutputIpmOtbndRec;
    }

    public void setSys203OutputIpmOtbndRec(Sys203OutputIpmOtbndRec sys203OutputIpmOtbndRec) {
        this.sys203OutputIpmOtbndRec = sys203OutputIpmOtbndRec;
    }
    public ChipLiabVariables800 getChipLiabVariables800() {
        if (chipLiabVariables800 == null) {
            chipLiabVariables800 = new ChipLiabVariables800();
        }

        return chipLiabVariables800;
    }

    public void setChipLiabVariables800(ChipLiabVariables800 chipLiabVariables800) {
        this.chipLiabVariables800 = chipLiabVariables800;
    }
    public Sys201OutputIpmOtbndRec getSys201OutputIpmOtbndRec() {
        if (sys201OutputIpmOtbndRec == null) {
            sys201OutputIpmOtbndRec = new Sys201OutputIpmOtbndRec();
        }

        return sys201OutputIpmOtbndRec;
    }

    public void setSys201OutputIpmOtbndRec(Sys201OutputIpmOtbndRec sys201OutputIpmOtbndRec) {
        this.sys201OutputIpmOtbndRec = sys201OutputIpmOtbndRec;
    }
    public Sys205OutputIpmOtbndRec getSys205OutputIpmOtbndRec() {
        if (sys205OutputIpmOtbndRec == null) {
            sys205OutputIpmOtbndRec = new Sys205OutputIpmOtbndRec();
        }

        return sys205OutputIpmOtbndRec;
    }

    public void setSys205OutputIpmOtbndRec(Sys205OutputIpmOtbndRec sys205OutputIpmOtbndRec) {
        this.sys205OutputIpmOtbndRec = sys205OutputIpmOtbndRec;
    }
    public Ip65504SelElemEntriesAll getIp65504SelElemEntriesAll() {
        if (ip65504SelElemEntriesAll == null) {
            ip65504SelElemEntriesAll = globalCtx.getGlobalDto(Ip65504SelElemEntriesAll.class);
        }

        return ip65504SelElemEntriesAll;
    }

    public Pds05DataGroup800 getPds05DataGroup800() {
        if (pds05DataGroup800 == null) {
            pds05DataGroup800 = new Pds05DataGroup800();
        }

        return pds05DataGroup800;
    }

    public void setPds05DataGroup800(Pds05DataGroup800 pds05DataGroup800) {
        this.pds05DataGroup800 = pds05DataGroup800;
    }
    public Sys205RecordCount600 getSys205RecordCount600() {
        if (sys205RecordCount600 == null) {
            sys205RecordCount600 = new Sys205RecordCount600();
        }

        return sys205RecordCount600;
    }

    public void setSys205RecordCount600(Sys205RecordCount600 sys205RecordCount600) {
        this.sys205RecordCount600 = sys205RecordCount600;
    }
    public Sys207RecordCount600 getSys207RecordCount600() {
        if (sys207RecordCount600 == null) {
            sys207RecordCount600 = new Sys207RecordCount600();
        }

        return sys207RecordCount600;
    }

    public void setSys207RecordCount600(Sys207RecordCount600 sys207RecordCount600) {
        this.sys207RecordCount600 = sys207RecordCount600;
    }
    public Sys212RecordCount600 getSys212RecordCount600() {
        if (sys212RecordCount600 == null) {
            sys212RecordCount600 = new Sys212RecordCount600();
        }

        return sys212RecordCount600;
    }

    public void setSys212RecordCount600(Sys212RecordCount600 sys212RecordCount600) {
        this.sys212RecordCount600 = sys212RecordCount600;
    }
    public AmtE1852TemGroup800 getAmtE1852TemGroup800() {
        if (amtE1852TemGroup800 == null) {
            amtE1852TemGroup800 = new AmtE1852TemGroup800();
        }

        return amtE1852TemGroup800;
    }

    public void setAmtE1852TemGroup800(AmtE1852TemGroup800 amtE1852TemGroup800) {
        this.amtE1852TemGroup800 = amtE1852TemGroup800;
    }
    public Sys012RunControlRec getSys012RunControlRec() {
        if (sys012RunControlRec == null) {
            sys012RunControlRec = new Sys012RunControlRec();
        }

        return sys012RunControlRec;
    }

    public void setSys012RunControlRec(Sys012RunControlRec sys012RunControlRec) {
        this.sys012RunControlRec = sys012RunControlRec;
    }
    public Ip0040iAccountRangeInfo getIp0040iAccountRangeInfo() {
        if (ip0040iAccountRangeInfo == null) {
            ip0040iAccountRangeInfo = globalCtx.getGlobalDto(Ip0040iAccountRangeInfo.class);
        }

        return ip0040iAccountRangeInfo;
    }

    public Sys202RecordCount600 getSys202RecordCount600() {
        if (sys202RecordCount600 == null) {
            sys202RecordCount600 = new Sys202RecordCount600();
        }

        return sys202RecordCount600;
    }

    public void setSys202RecordCount600(Sys202RecordCount600 sys202RecordCount600) {
        this.sys202RecordCount600 = sys202RecordCount600;
    }
    public Ip65504TcntGroup getIp65504TcntGroup() {
        if (ip65504TcntGroup == null) {
            ip65504TcntGroup = globalCtx.getGlobalDto(Ip65504TcntGroup.class);
        }

        return ip65504TcntGroup;
    }

    public Ip50005OneDayRecLthGroup getIp50005OneDayRecLthGroup() {
        if (ip50005OneDayRecLthGroup == null) {
            ip50005OneDayRecLthGroup = globalCtx.getGlobalDto(Ip50005OneDayRecLthGroup.class);
        }

        return ip50005OneDayRecLthGroup;
    }

    public Sys207OutputIpmOtbndRec getSys207OutputIpmOtbndRec() {
        if (sys207OutputIpmOtbndRec == null) {
            sys207OutputIpmOtbndRec = new Sys207OutputIpmOtbndRec();
        }

        return sys207OutputIpmOtbndRec;
    }

    public void setSys207OutputIpmOtbndRec(Sys207OutputIpmOtbndRec sys207OutputIpmOtbndRec) {
        this.sys207OutputIpmOtbndRec = sys207OutputIpmOtbndRec;
    }
    public Ip50005OneDayRec getIp50005OneDayRec() {
        if (ip50005OneDayRec == null) {
            ip50005OneDayRec = globalCtx.getGlobalDto(Ip50005OneDayRec.class);
        }

        return ip50005OneDayRec;
    }

    public AbendParaName900 getAbendParaName900() {
        if (abendParaName900 == null) {
            abendParaName900 = new AbendParaName900();
        }

        return abendParaName900;
    }

    public void setAbendParaName900(AbendParaName900 abendParaName900) {
        this.abendParaName900 = abendParaName900;
    }
    public Sys204OutputIpmOtbndRec getSys204OutputIpmOtbndRec() {
        if (sys204OutputIpmOtbndRec == null) {
            sys204OutputIpmOtbndRec = new Sys204OutputIpmOtbndRec();
        }

        return sys204OutputIpmOtbndRec;
    }

    public void setSys204OutputIpmOtbndRec(Sys204OutputIpmOtbndRec sys204OutputIpmOtbndRec) {
        this.sys204OutputIpmOtbndRec = sys204OutputIpmOtbndRec;
    }
    public Ip00174TableEntry getIp00174TableEntry() {
        if (ip00174TableEntry == null) {
            ip00174TableEntry = globalCtx.getGlobalDto(Ip00174TableEntry.class);
        }

        return ip00174TableEntry;
    }

    public AmtE1750TemGroup800 getAmtE1750TemGroup800() {
        if (amtE1750TemGroup800 == null) {
            amtE1750TemGroup800 = new AmtE1750TemGroup800();
        }

        return amtE1750TemGroup800;
    }

    public void setAmtE1750TemGroup800(AmtE1750TemGroup800 amtE1750TemGroup800) {
        this.amtE1750TemGroup800 = amtE1750TemGroup800;
    }
    public ReadParserErrMsgTxt600 getReadParserErrMsgTxt600() {
        if (readParserErrMsgTxt600 == null) {
            readParserErrMsgTxt600 = new ReadParserErrMsgTxt600();
        }

        return readParserErrMsgTxt600;
    }

    public void setReadParserErrMsgTxt600(ReadParserErrMsgTxt600 readParserErrMsgTxt600) {
        this.readParserErrMsgTxt600 = readParserErrMsgTxt600;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += ip00724TableEntry.hashCode();
        str += ip00174EntryFoundGroup.hashCode();
        str += sys206OutputIpmOtbndRec.hashCode();
        str += ip00694EntryFoundGroup.hashCode();
        str += sys001RecordCount600.hashCode();
        str += sys209RecordCount600.hashCode();
        str += ip00694TableEntry.hashCode();
        str += sys210RecordCount600.hashCode();
        str += ip65504CurrentTagTable.hashCode();
        str += ip08101RunControlRecord.hashCode();
        str += inputOutboundErrMsgTxt600.hashCode();
        str += ip65504TaggedRecordInfo.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
        str += ip30671OutboundMessageArea.hashCode();
        str += amtE1849TemGroup800.hashCode();
        str += ip00724EntryFoundYGroup.hashCode();
        str += ip00702CaStringGroup.hashCode();
        str += sys214RecordCount600.hashCode();
        str += amtE1754TemGroup800.hashCode();
        str += sys202OutputIpmOtbndRec.hashCode();
        str += abendMessage900.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += runControlErrMsgTxt600.hashCode();
        str += sys206RecordCount600.hashCode();
        str += ip00702CaTable.hashCode();
        str += sys216RecordCount600.hashCode();
        str += sys001InputIpmOutboundRec.hashCode();
        str += ip65504PdsMapGroup.hashCode();
        str += ip66102IpmFileInformation.hashCode();
        str += sortKey800.hashCode();
        str += ip66102IpmMsg.hashCode();
        str += sys204RecordCount600.hashCode();
        str += amtE1848TemGroup800.hashCode();
        str += amtE1851TemGroup800.hashCode();
        str += dateCcyymmdd800.hashCode();
        str += sys213RecordCount600.hashCode();
        str += ip65504SelPdsEntriesAll.hashCode();
        str += sys201RecordCount600.hashCode();
        str += ip67002DateParm.hashCode();
        str += amtE1850TemGroup800.hashCode();
        str += pds841ValuesGroup800.hashCode();
        str += sys203RecordCount600.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ip00404Table.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += sys215RecordCount600.hashCode();
        str += ip50005ClearingDtTm.hashCode();
        str += ip33701CurrConvInterface.hashCode();
        str += sys211RecordCount600.hashCode();
        str += outputOtbndErrMsgTxt600.hashCode();
        str += l1CtlValues800.hashCode();
        str += work.hashCode();
        str += sys203OutputIpmOtbndRec.hashCode();
        str += chipLiabVariables800.hashCode();
        str += sys201OutputIpmOtbndRec.hashCode();
        str += sys205OutputIpmOtbndRec.hashCode();
        str += ip65504SelElemEntriesAll.hashCode();
        str += pds05DataGroup800.hashCode();
        str += sys205RecordCount600.hashCode();
        str += sys207RecordCount600.hashCode();
        str += sys212RecordCount600.hashCode();
        str += amtE1852TemGroup800.hashCode();
        str += sys012RunControlRec.hashCode();
        str += ip0040iAccountRangeInfo.hashCode();
        str += sys202RecordCount600.hashCode();
        str += ip65504TcntGroup.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += sys207OutputIpmOtbndRec.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += abendParaName900.hashCode();
        str += sys204OutputIpmOtbndRec.hashCode();
        str += ip00174TableEntry.hashCode();
        str += amtE1750TemGroup800.hashCode();
        str += readParserErrMsgTxt600.hashCode();
       return str.hashCode();
    }

    public Ip809050Ctx clone() {
        Ip809050Ctx cloneObj = new Ip809050Ctx();
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.ip00724TableEntry = new Ip00724TableEntry();
        cloneObj.ip00724TableEntry.set(ip00724TableEntry.getClonedField());
        cloneObj.ip00174EntryFoundGroup = new Ip00174EntryFoundGroup();
        cloneObj.ip00174EntryFoundGroup.set(ip00174EntryFoundGroup.getClonedField());
        cloneObj.sys206OutputIpmOtbndRec = new Sys206OutputIpmOtbndRec();
        cloneObj.sys206OutputIpmOtbndRec.set(sys206OutputIpmOtbndRec.getClonedField());
        cloneObj.ip00694EntryFoundGroup = new Ip00694EntryFoundGroup();
        cloneObj.ip00694EntryFoundGroup.set(ip00694EntryFoundGroup.getClonedField());
        cloneObj.sys001RecordCount600 = new Sys001RecordCount600();
        cloneObj.sys001RecordCount600.set(sys001RecordCount600.getClonedField());
        cloneObj.sys209RecordCount600 = new Sys209RecordCount600();
        cloneObj.sys209RecordCount600.set(sys209RecordCount600.getClonedField());
        cloneObj.ip00694TableEntry = new Ip00694TableEntry();
        cloneObj.ip00694TableEntry.set(ip00694TableEntry.getClonedField());
        cloneObj.sys210RecordCount600 = new Sys210RecordCount600();
        cloneObj.sys210RecordCount600.set(sys210RecordCount600.getClonedField());
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        cloneObj.inputOutboundErrMsgTxt600 = new InputOutboundErrMsgTxt600();
        cloneObj.inputOutboundErrMsgTxt600.set(inputOutboundErrMsgTxt600.getClonedField());
        cloneObj.ip65504TaggedRecordInfo = new Ip65504TaggedRecordInfo();
        cloneObj.ip65504TaggedRecordInfo.set(ip65504TaggedRecordInfo.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.ip30671OutboundMessageArea = new Ip30671OutboundMessageArea();
        cloneObj.ip30671OutboundMessageArea.set(ip30671OutboundMessageArea.getClonedField());
        cloneObj.amtE1849TemGroup800 = new AmtE1849TemGroup800();
        cloneObj.amtE1849TemGroup800.set(amtE1849TemGroup800.getClonedField());
        cloneObj.ip00724EntryFoundYGroup = new Ip00724EntryFoundYGroup();
        cloneObj.ip00724EntryFoundYGroup.set(ip00724EntryFoundYGroup.getClonedField());
        cloneObj.ip00702CaStringGroup = new Ip00702CaStringGroup();
        cloneObj.ip00702CaStringGroup.set(ip00702CaStringGroup.getClonedField());
        cloneObj.sys214RecordCount600 = new Sys214RecordCount600();
        cloneObj.sys214RecordCount600.set(sys214RecordCount600.getClonedField());
        cloneObj.amtE1754TemGroup800 = new AmtE1754TemGroup800();
        cloneObj.amtE1754TemGroup800.set(amtE1754TemGroup800.getClonedField());
        cloneObj.sys202OutputIpmOtbndRec = new Sys202OutputIpmOtbndRec();
        cloneObj.sys202OutputIpmOtbndRec.set(sys202OutputIpmOtbndRec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.runControlErrMsgTxt600 = new RunControlErrMsgTxt600();
        cloneObj.runControlErrMsgTxt600.set(runControlErrMsgTxt600.getClonedField());
        cloneObj.sys206RecordCount600 = new Sys206RecordCount600();
        cloneObj.sys206RecordCount600.set(sys206RecordCount600.getClonedField());
        cloneObj.ip00702CaTable = new Ip00702CaTable();
        cloneObj.ip00702CaTable.set(ip00702CaTable.getClonedField());
        cloneObj.sys216RecordCount600 = new Sys216RecordCount600();
        cloneObj.sys216RecordCount600.set(sys216RecordCount600.getClonedField());
        cloneObj.sys001InputIpmOutboundRec = new Sys001InputIpmOutboundRec();
        cloneObj.sys001InputIpmOutboundRec.set(sys001InputIpmOutboundRec.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.sortKey800 = new SortKey800();
        cloneObj.sortKey800.set(sortKey800.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.sys204RecordCount600 = new Sys204RecordCount600();
        cloneObj.sys204RecordCount600.set(sys204RecordCount600.getClonedField());
        cloneObj.amtE1848TemGroup800 = new AmtE1848TemGroup800();
        cloneObj.amtE1848TemGroup800.set(amtE1848TemGroup800.getClonedField());
        cloneObj.amtE1851TemGroup800 = new AmtE1851TemGroup800();
        cloneObj.amtE1851TemGroup800.set(amtE1851TemGroup800.getClonedField());
        cloneObj.dateCcyymmdd800 = new DateCcyymmdd800();
        cloneObj.dateCcyymmdd800.set(dateCcyymmdd800.getClonedField());
        cloneObj.sys213RecordCount600 = new Sys213RecordCount600();
        cloneObj.sys213RecordCount600.set(sys213RecordCount600.getClonedField());
        cloneObj.ip65504SelPdsEntriesAll = new Ip65504SelPdsEntriesAll();
        cloneObj.ip65504SelPdsEntriesAll.set(ip65504SelPdsEntriesAll.getClonedField());
        cloneObj.sys201RecordCount600 = new Sys201RecordCount600();
        cloneObj.sys201RecordCount600.set(sys201RecordCount600.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        cloneObj.amtE1850TemGroup800 = new AmtE1850TemGroup800();
        cloneObj.amtE1850TemGroup800.set(amtE1850TemGroup800.getClonedField());
        cloneObj.pds841ValuesGroup800 = new Pds841ValuesGroup800();
        cloneObj.pds841ValuesGroup800.set(pds841ValuesGroup800.getClonedField());
        cloneObj.sys203RecordCount600 = new Sys203RecordCount600();
        cloneObj.sys203RecordCount600.set(sys203RecordCount600.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ip00404Table = new Ip00404Table();
        cloneObj.ip00404Table.set(ip00404Table.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.sys215RecordCount600 = new Sys215RecordCount600();
        cloneObj.sys215RecordCount600.set(sys215RecordCount600.getClonedField());
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        cloneObj.ip33701CurrConvInterface = new Ip33701CurrConvInterface();
        cloneObj.ip33701CurrConvInterface.set(ip33701CurrConvInterface.getClonedField());
        cloneObj.sys211RecordCount600 = new Sys211RecordCount600();
        cloneObj.sys211RecordCount600.set(sys211RecordCount600.getClonedField());
        cloneObj.outputOtbndErrMsgTxt600 = new OutputOtbndErrMsgTxt600();
        cloneObj.outputOtbndErrMsgTxt600.set(outputOtbndErrMsgTxt600.getClonedField());
        cloneObj.l1CtlValues800 = new L1CtlValues800();
        cloneObj.l1CtlValues800.set(l1CtlValues800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys203OutputIpmOtbndRec = new Sys203OutputIpmOtbndRec();
        cloneObj.sys203OutputIpmOtbndRec.set(sys203OutputIpmOtbndRec.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        cloneObj.sys201OutputIpmOtbndRec = new Sys201OutputIpmOtbndRec();
        cloneObj.sys201OutputIpmOtbndRec.set(sys201OutputIpmOtbndRec.getClonedField());
        cloneObj.sys205OutputIpmOtbndRec = new Sys205OutputIpmOtbndRec();
        cloneObj.sys205OutputIpmOtbndRec.set(sys205OutputIpmOtbndRec.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        cloneObj.pds05DataGroup800 = new Pds05DataGroup800();
        cloneObj.pds05DataGroup800.set(pds05DataGroup800.getClonedField());
        cloneObj.sys205RecordCount600 = new Sys205RecordCount600();
        cloneObj.sys205RecordCount600.set(sys205RecordCount600.getClonedField());
        cloneObj.sys207RecordCount600 = new Sys207RecordCount600();
        cloneObj.sys207RecordCount600.set(sys207RecordCount600.getClonedField());
        cloneObj.sys212RecordCount600 = new Sys212RecordCount600();
        cloneObj.sys212RecordCount600.set(sys212RecordCount600.getClonedField());
        cloneObj.amtE1852TemGroup800 = new AmtE1852TemGroup800();
        cloneObj.amtE1852TemGroup800.set(amtE1852TemGroup800.getClonedField());
        cloneObj.sys012RunControlRec = new Sys012RunControlRec();
        cloneObj.sys012RunControlRec.set(sys012RunControlRec.getClonedField());
        cloneObj.ip0040iAccountRangeInfo = new Ip0040iAccountRangeInfo();
        cloneObj.ip0040iAccountRangeInfo.set(ip0040iAccountRangeInfo.getClonedField());
        cloneObj.sys202RecordCount600 = new Sys202RecordCount600();
        cloneObj.sys202RecordCount600.set(sys202RecordCount600.getClonedField());
        cloneObj.ip65504TcntGroup = new Ip65504TcntGroup();
        cloneObj.ip65504TcntGroup.set(ip65504TcntGroup.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.sys207OutputIpmOtbndRec = new Sys207OutputIpmOtbndRec();
        cloneObj.sys207OutputIpmOtbndRec.set(sys207OutputIpmOtbndRec.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.sys204OutputIpmOtbndRec = new Sys204OutputIpmOtbndRec();
        cloneObj.sys204OutputIpmOtbndRec.set(sys204OutputIpmOtbndRec.getClonedField());
        cloneObj.ip00174TableEntry = new Ip00174TableEntry();
        cloneObj.ip00174TableEntry.set(ip00174TableEntry.getClonedField());
        cloneObj.amtE1750TemGroup800 = new AmtE1750TemGroup800();
        cloneObj.amtE1750TemGroup800.set(amtE1750TemGroup800.getClonedField());
        cloneObj.readParserErrMsgTxt600 = new ReadParserErrMsgTxt600();
        cloneObj.readParserErrMsgTxt600.set(readParserErrMsgTxt600.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class DoInitializationInCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();

	/**
	 *	Returns the value of pgmIp281010300
	 *	@return pgmIp281010300
	 */
   public char[] getPgmIp281010300() throws CFException  {              
   		return work.getPgmIp281010300();
   }

  
	/**
	*  set variable pgmIp281010300
	*  @param value
	**/
   public void setPgmIp281010300(char[] value) throws CFException {
      work.setPgmIp281010300(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public DoInitializationOutCtx getDoInitializationOutCtx() {
            return new DoInitializationOutCtx();
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

    public DoInitializationInCtx clone() {
        DoInitializationInCtx cloneObj = new DoInitializationInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DoInitializationInCtx getDoInitializationInCtx() {
            return new DoInitializationInCtx();
    }
     public class DoInitializationOutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();

	/**
	 *	Returns the value of ptrIp281010800
	 *	@return ptrIp281010800
	 */
   public char[] getPtrIp281010800() throws CFException  {              
   		return work.getPtrIp281010800();
   }

  
	/**
	*  set variable ptrIp281010800
	*  @param value
	**/
   public void setPtrIp281010800(char[] value) throws CFException {
      work.setPtrIp281010800(value);
   } 

	/**
	 *	Test condition "N" for isItIsNotFirstTime88100()
	 *	@return  Returns true if isItIsNotFirstTime88100() is "N"
	 */
   public boolean isItIsNotFirstTime88100() throws CFException {
      return work.isItIsNotFirstTime88100();
   }

	/**
	*  set values "N"
	*/
   	public void setItIsNotFirstTime88100True()  throws CFException{  			
    	work.setItIsNotFirstTime88100True();
   	}

        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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

    public DoInitializationOutCtx clone() {
        DoInitializationOutCtx cloneObj = new DoInitializationOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DoInitializationOutCtx getDoInitializationOutCtx() {
            return new DoInitializationOutCtx();
    }
     public class DisplayExecMsgsInCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip809050Ctx.this.getIp996011ProgramStartMessage();

	/**
	 *	Returns the value of pgmIp996010300
	 *	@return pgmIp996010300
	 */
   public char[] getPgmIp996010300() throws CFException  {              
   		return work.getPgmIp996010300();
   }

  
	/**
	*  set variable pgmIp996010300
	*  @param value
	**/
   public void setPgmIp996010300(char[] value) throws CFException {
      work.setPgmIp996010300(value);
   } 

	/**
	 *	Returns the value of pgmId300
	 *	@return pgmId300
	 */
   public char[] getPgmId300() throws CFException  {              
   		return work.getPgmId300();
   }

  
	/**
	*  set variable pgmId300
	*  @param value
	**/
   public void setPgmId300(char[] value) throws CFException {
      work.setPgmId300(value);
   } 

	/**
	 *	Returns the value of pgmVersion300
	 *	@return pgmVersion300
	 */
   public char[] getPgmVersion300() throws CFException  {              
   		return work.getPgmVersion300();
   }

  
	/**
	*  set variable pgmVersion300
	*  @param value
	**/
   public void setPgmVersion300(char[] value) throws CFException {
      work.setPgmVersion300(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public DisplayExecMsgsOutCtx getDisplayExecMsgsOutCtx() {
            return new DisplayExecMsgsOutCtx();
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
        str += ip996011ProgramStartMessage.hashCode();
       return str.hashCode();
    }

    public DisplayExecMsgsInCtx clone() {
        DisplayExecMsgsInCtx cloneObj = new DisplayExecMsgsInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        return cloneObj;
    }

    }

    public DisplayExecMsgsInCtx getDisplayExecMsgsInCtx() {
            return new DisplayExecMsgsInCtx();
    }
     public class DisplayExecMsgsOutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip809050Ctx.this.getIp996011ProgramStartMessage();

	/**
	 *	Returns the value of pgmId300
	 *	@return pgmId300
	 */
   public char[] getPgmId300() throws CFException  {              
   		return work.getPgmId300();
   }

  
	/**
	*  set variable pgmId300
	*  @param value
	**/
   public void setPgmId300(char[] value) throws CFException {
      work.setPgmId300(value);
   } 

	/**
	 *	Returns the value of ip996011PgmId
	 *	@return ip996011PgmId
	 */
   public char[] getIp996011PgmId() throws CFException  {              
   		return ip996011ProgramStartMessage.getIp996011PgmId();
   }

  
	/**
	*  set variable ip996011PgmId
	*  @param value
	**/
   public void setIp996011PgmId(char[] value) throws CFException {
      ip996011ProgramStartMessage.setIp996011PgmId(value);
   } 

     /**
	 * 	Update Ip996011PgmId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011PgmId(char[] source, int sourceIndex) throws CFException {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex);
   	
   }
   
   public void setIp996011PgmId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip996011PgmId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip996011PgmId with another Field
	 *	@param value
	 */
   public void setIp996011PgmId(Field source) {
      ip996011ProgramStartMessage.setIp996011PgmId(source);
   }  
   
     /**
	 * 	Update Ip996011PgmId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011PgmId(Field source, int sourceIndex,int sourceLen) {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip996011PgmId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip996011WhenCompiled
	 *	@return ip996011WhenCompiled
	 */
   public char[] getIp996011WhenCompiled() throws CFException  {              
   		return ip996011ProgramStartMessage.getIp996011WhenCompiled();
   }

  
	/**
	*  set variable ip996011WhenCompiled
	*  @param value
	**/
   public void setIp996011WhenCompiled(char[] value) throws CFException {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(value);
   } 

     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011WhenCompiled(char[] source, int sourceIndex) throws CFException {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex);
   	
   }
   
   public void setIp996011WhenCompiled(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011WhenCompiled(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip996011WhenCompiled with another Field
	 *	@param value
	 */
   public void setIp996011WhenCompiled(Field source) {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source);
   }  
   
     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011WhenCompiled(Field source, int sourceIndex,int sourceLen) {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011WhenCompiled(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pgmVersion300
	 *	@return pgmVersion300
	 */
   public char[] getPgmVersion300() throws CFException  {              
   		return work.getPgmVersion300();
   }

  
	/**
	*  set variable pgmVersion300
	*  @param value
	**/
   public void setPgmVersion300(char[] value) throws CFException {
      work.setPgmVersion300(value);
   } 

	/**
	 *	Returns the value of ptrIp996010800
	 *	@return ptrIp996010800
	 */
   public char[] getPtrIp996010800() throws CFException  {              
   		return work.getPtrIp996010800();
   }

  
	/**
	*  set variable ptrIp996010800
	*  @param value
	**/
   public void setPtrIp996010800(char[] value) throws CFException {
      work.setPtrIp996010800(value);
   } 

	/**
	 *	Returns the value of ip996011PgmVersion
	 *	@return ip996011PgmVersion
	 */
   public char[] getIp996011PgmVersion() throws CFException  {              
   		return ip996011ProgramStartMessage.getIp996011PgmVersion();
   }

  
	/**
	*  set variable ip996011PgmVersion
	*  @param value
	**/
   public void setIp996011PgmVersion(char[] value) throws CFException {
      ip996011ProgramStartMessage.setIp996011PgmVersion(value);
   } 

     /**
	 * 	Update Ip996011PgmVersion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011PgmVersion(char[] source, int sourceIndex) throws CFException {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex);
   	
   }
   
   public void setIp996011PgmVersion(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip996011PgmVersion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmVersion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip996011PgmVersion with another Field
	 *	@param value
	 */
   public void setIp996011PgmVersion(Field source) {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source);
   }  
   
     /**
	 * 	Update Ip996011PgmVersion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011PgmVersion(Field source, int sourceIndex,int sourceLen) {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip996011PgmVersion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmVersion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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
        str += ip996011ProgramStartMessage.hashCode();
       return str.hashCode();
    }

    public DisplayExecMsgsOutCtx clone() {
        DisplayExecMsgsOutCtx cloneObj = new DisplayExecMsgsOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        return cloneObj;
    }

    }

    public DisplayExecMsgsOutCtx getDisplayExecMsgsOutCtx() {
            return new DisplayExecMsgsOutCtx();
    }
     public class SetProcedurePointersInCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();

	/**
	 *	Returns the value of abendRoutine300
	 *	@return abendRoutine300
	 */
   public char[] getAbendRoutine300() throws CFException  {              
   		return work.getAbendRoutine300();
   }

  
	/**
	*  set variable abendRoutine300
	*  @param value
	**/
   public void setAbendRoutine300(char[] value) throws CFException {
      work.setAbendRoutine300(value);
   } 

	/**
	 *	Returns the value of pgmIp752010300
	 *	@return pgmIp752010300
	 */
   public char[] getPgmIp752010300() throws CFException  {              
   		return work.getPgmIp752010300();
   }

  
	/**
	*  set variable pgmIp752010300
	*  @param value
	**/
   public void setPgmIp752010300(char[] value) throws CFException {
      work.setPgmIp752010300(value);
   } 

	/**
	 *	Returns the value of pgmIp218510300
	 *	@return pgmIp218510300
	 */
   public char[] getPgmIp218510300() throws CFException  {              
   		return work.getPgmIp218510300();
   }

  
	/**
	*  set variable pgmIp218510300
	*  @param value
	**/
   public void setPgmIp218510300(char[] value) throws CFException {
      work.setPgmIp218510300(value);
   } 

	/**
	 *	Returns the value of pgmIp343230300
	 *	@return pgmIp343230300
	 */
   public char[] getPgmIp343230300() throws CFException  {              
   		return work.getPgmIp343230300();
   }

  
	/**
	*  set variable pgmIp343230300
	*  @param value
	**/
   public void setPgmIp343230300(char[] value) throws CFException {
      work.setPgmIp343230300(value);
   } 

	/**
	 *	Returns the value of pgmIp280010300
	 *	@return pgmIp280010300
	 */
   public char[] getPgmIp280010300() throws CFException  {              
   		return work.getPgmIp280010300();
   }

  
	/**
	*  set variable pgmIp280010300
	*  @param value
	**/
   public void setPgmIp280010300(char[] value) throws CFException {
      work.setPgmIp280010300(value);
   } 

	/**
	 *	Returns the value of pgmIp218520300
	 *	@return pgmIp218520300
	 */
   public char[] getPgmIp218520300() throws CFException  {              
   		return work.getPgmIp218520300();
   }

  
	/**
	*  set variable pgmIp218520300
	*  @param value
	**/
   public void setPgmIp218520300(char[] value) throws CFException {
      work.setPgmIp218520300(value);
   } 

	/**
	 *	Returns the value of pgmIp217540300
	 *	@return pgmIp217540300
	 */
   public char[] getPgmIp217540300() throws CFException  {              
   		return work.getPgmIp217540300();
   }

  
	/**
	*  set variable pgmIp217540300
	*  @param value
	**/
   public void setPgmIp217540300(char[] value) throws CFException {
      work.setPgmIp217540300(value);
   } 

	/**
	 *	Returns the value of pgmIp783510300
	 *	@return pgmIp783510300
	 */
   public char[] getPgmIp783510300() throws CFException  {              
   		return work.getPgmIp783510300();
   }

  
	/**
	*  set variable pgmIp783510300
	*  @param value
	**/
   public void setPgmIp783510300(char[] value) throws CFException {
      work.setPgmIp783510300(value);
   } 

	/**
	 *	Returns the value of readParser300
	 *	@return readParser300
	 */
   public char[] getReadParser300() throws CFException  {              
   		return work.getReadParser300();
   }

  
	/**
	*  set variable readParser300
	*  @param value
	**/
   public void setReadParser300(char[] value) throws CFException {
      work.setReadParser300(value);
   } 

	/**
	 *	Returns the value of pgmIp218480300
	 *	@return pgmIp218480300
	 */
   public char[] getPgmIp218480300() throws CFException  {              
   		return work.getPgmIp218480300();
   }

  
	/**
	*  set variable pgmIp218480300
	*  @param value
	**/
   public void setPgmIp218480300(char[] value) throws CFException {
      work.setPgmIp218480300(value);
   } 

	/**
	 *	Returns the value of pgmIp280310300
	 *	@return pgmIp280310300
	 */
   public char[] getPgmIp280310300() throws CFException  {              
   		return work.getPgmIp280310300();
   }

  
	/**
	*  set variable pgmIp280310300
	*  @param value
	**/
   public void setPgmIp280310300(char[] value) throws CFException {
      work.setPgmIp280310300(value);
   } 

	/**
	 *	Returns the value of pgmIp218500300
	 *	@return pgmIp218500300
	 */
   public char[] getPgmIp218500300() throws CFException  {              
   		return work.getPgmIp218500300();
   }

  
	/**
	*  set variable pgmIp218500300
	*  @param value
	**/
   public void setPgmIp218500300(char[] value) throws CFException {
      work.setPgmIp218500300(value);
   } 

	/**
	 *	Returns the value of pgmIp218490300
	 *	@return pgmIp218490300
	 */
   public char[] getPgmIp218490300() throws CFException  {              
   		return work.getPgmIp218490300();
   }

  
	/**
	*  set variable pgmIp218490300
	*  @param value
	**/
   public void setPgmIp218490300(char[] value) throws CFException {
      work.setPgmIp218490300(value);
   } 

	/**
	 *	Returns the value of pgmIp288010300
	 *	@return pgmIp288010300
	 */
   public char[] getPgmIp288010300() throws CFException  {              
   		return work.getPgmIp288010300();
   }

  
	/**
	*  set variable pgmIp288010300
	*  @param value
	**/
   public void setPgmIp288010300(char[] value) throws CFException {
      work.setPgmIp288010300(value);
   } 

	/**
	 *	Returns the value of pgmIp670010300
	 *	@return pgmIp670010300
	 */
   public char[] getPgmIp670010300() throws CFException  {              
   		return work.getPgmIp670010300();
   }

  
	/**
	*  set variable pgmIp670010300
	*  @param value
	**/
   public void setPgmIp670010300(char[] value) throws CFException {
      work.setPgmIp670010300(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public SetProcedurePointersOutCtx getSetProcedurePointersOutCtx() {
            return new SetProcedurePointersOutCtx();
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

    public SetProcedurePointersInCtx clone() {
        SetProcedurePointersInCtx cloneObj = new SetProcedurePointersInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SetProcedurePointersInCtx getSetProcedurePointersInCtx() {
            return new SetProcedurePointersInCtx();
    }
     public class SetProcedurePointersOutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();

	/**
	 *	Returns the value of ptrIp218510800
	 *	@return ptrIp218510800
	 */
   public char[] getPtrIp218510800() throws CFException  {              
   		return work.getPtrIp218510800();
   }

  
	/**
	*  set variable ptrIp218510800
	*  @param value
	**/
   public void setPtrIp218510800(char[] value) throws CFException {
      work.setPtrIp218510800(value);
   } 

	/**
	 *	Returns the value of ptrIp662010800
	 *	@return ptrIp662010800
	 */
   public char[] getPtrIp662010800() throws CFException  {              
   		return work.getPtrIp662010800();
   }

  
	/**
	*  set variable ptrIp662010800
	*  @param value
	**/
   public void setPtrIp662010800(char[] value) throws CFException {
      work.setPtrIp662010800(value);
   } 

	/**
	 *	Returns the value of ptrIp670010800
	 *	@return ptrIp670010800
	 */
   public char[] getPtrIp670010800() throws CFException  {              
   		return work.getPtrIp670010800();
   }

  
	/**
	*  set variable ptrIp670010800
	*  @param value
	**/
   public void setPtrIp670010800(char[] value) throws CFException {
      work.setPtrIp670010800(value);
   } 

	/**
	 *	Returns the value of ptrIp783510800
	 *	@return ptrIp783510800
	 */
   public char[] getPtrIp783510800() throws CFException  {              
   		return work.getPtrIp783510800();
   }

  
	/**
	*  set variable ptrIp783510800
	*  @param value
	**/
   public void setPtrIp783510800(char[] value) throws CFException {
      work.setPtrIp783510800(value);
   } 

	/**
	 *	Returns the value of ptrIp280310800
	 *	@return ptrIp280310800
	 */
   public char[] getPtrIp280310800() throws CFException  {              
   		return work.getPtrIp280310800();
   }

  
	/**
	*  set variable ptrIp280310800
	*  @param value
	**/
   public void setPtrIp280310800(char[] value) throws CFException {
      work.setPtrIp280310800(value);
   } 

	/**
	 *	Returns the value of ptrIp218520800
	 *	@return ptrIp218520800
	 */
   public char[] getPtrIp218520800() throws CFException  {              
   		return work.getPtrIp218520800();
   }

  
	/**
	*  set variable ptrIp218520800
	*  @param value
	**/
   public void setPtrIp218520800(char[] value) throws CFException {
      work.setPtrIp218520800(value);
   } 

	/**
	 *	Returns the value of abendPtr800
	 *	@return abendPtr800
	 */
   public char[] getAbendPtr800() throws CFException  {              
   		return work.getAbendPtr800();
   }

  
	/**
	*  set variable abendPtr800
	*  @param value
	**/
   public void setAbendPtr800(char[] value) throws CFException {
      work.setAbendPtr800(value);
   } 

	/**
	 *	Returns the value of ptrIp280010800
	 *	@return ptrIp280010800
	 */
   public char[] getPtrIp280010800() throws CFException  {              
   		return work.getPtrIp280010800();
   }

  
	/**
	*  set variable ptrIp280010800
	*  @param value
	**/
   public void setPtrIp280010800(char[] value) throws CFException {
      work.setPtrIp280010800(value);
   } 

	/**
	 *	Returns the value of ptrIp218490800
	 *	@return ptrIp218490800
	 */
   public char[] getPtrIp218490800() throws CFException  {              
   		return work.getPtrIp218490800();
   }

  
	/**
	*  set variable ptrIp218490800
	*  @param value
	**/
   public void setPtrIp218490800(char[] value) throws CFException {
      work.setPtrIp218490800(value);
   } 

	/**
	 *	Returns the value of ptrIp288010800
	 *	@return ptrIp288010800
	 */
   public char[] getPtrIp288010800() throws CFException  {              
   		return work.getPtrIp288010800();
   }

  
	/**
	*  set variable ptrIp288010800
	*  @param value
	**/
   public void setPtrIp288010800(char[] value) throws CFException {
      work.setPtrIp288010800(value);
   } 

	/**
	 *	Returns the value of ptrIp217540800
	 *	@return ptrIp217540800
	 */
   public char[] getPtrIp217540800() throws CFException  {              
   		return work.getPtrIp217540800();
   }

  
	/**
	*  set variable ptrIp217540800
	*  @param value
	**/
   public void setPtrIp217540800(char[] value) throws CFException {
      work.setPtrIp217540800(value);
   } 

	/**
	 *	Returns the value of ptrIp218500800
	 *	@return ptrIp218500800
	 */
   public char[] getPtrIp218500800() throws CFException  {              
   		return work.getPtrIp218500800();
   }

  
	/**
	*  set variable ptrIp218500800
	*  @param value
	**/
   public void setPtrIp218500800(char[] value) throws CFException {
      work.setPtrIp218500800(value);
   } 

	/**
	 *	Returns the value of ptrIp218480800
	 *	@return ptrIp218480800
	 */
   public char[] getPtrIp218480800() throws CFException  {              
   		return work.getPtrIp218480800();
   }

  
	/**
	*  set variable ptrIp218480800
	*  @param value
	**/
   public void setPtrIp218480800(char[] value) throws CFException {
      work.setPtrIp218480800(value);
   } 

	/**
	 *	Returns the value of ptrIp343230800
	 *	@return ptrIp343230800
	 */
   public char[] getPtrIp343230800() throws CFException  {              
   		return work.getPtrIp343230800();
   }

  
	/**
	*  set variable ptrIp343230800
	*  @param value
	**/
   public void setPtrIp343230800(char[] value) throws CFException {
      work.setPtrIp343230800(value);
   } 

	/**
	 *	Returns the value of ptrIp752010800
	 *	@return ptrIp752010800
	 */
   public char[] getPtrIp752010800() throws CFException  {              
   		return work.getPtrIp752010800();
   }

  
	/**
	*  set variable ptrIp752010800
	*  @param value
	**/
   public void setPtrIp752010800(char[] value) throws CFException {
      work.setPtrIp752010800(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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

    public SetProcedurePointersOutCtx clone() {
        SetProcedurePointersOutCtx cloneObj = new SetProcedurePointersOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SetProcedurePointersOutCtx getSetProcedurePointersOutCtx() {
            return new SetProcedurePointersOutCtx();
    }
     public class OpenRunControlFileInCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     RunControlErrMsgTxt600 runControlErrMsgTxt600 = Ip809050Ctx.this.getRunControlErrMsgTxt600();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();
     Sys012RunControlRec sys012RunControlRec = Ip809050Ctx.this.getSys012RunControlRec();

	/**
	 *	Returns the value of para1310300
	 *	@return para1310300
	 */
   public char[] getPara1310300() throws CFException  {              
   		return work.getPara1310300();
   }

  
	/**
	*  set variable para1310300
	*  @param value
	**/
   public void setPara1310300(char[] value) throws CFException {
      work.setPara1310300(value);
   } 

	/**
	 *	Returns the value of runControlErrMsgTxt600
	 *	@return runControlErrMsgTxt600
	 */   
	 public RunControlErrMsgTxt600 getRunControlErrMsgTxt600() {
   	return runControlErrMsgTxt600;
   }


	/**
	 *	Returns the value of sys012OpenAbendCode300
	 *	@return sys012OpenAbendCode300
	 */
   public char[] getSys012OpenAbendCode300() throws CFException  {              
   		return work.getSys012OpenAbendCode300();
   }

  
	/**
	*  set variable sys012OpenAbendCode300
	*  @param value
	**/
   public void setSys012OpenAbendCode300(char[] value) throws CFException {
      work.setSys012OpenAbendCode300(value);
   } 

	/**
	 *	Returns the value of sys012RunControlRec
	 *	@return sys012RunControlRec
	 */   
	 public Sys012RunControlRec getSys012RunControlRec() {
   	return sys012RunControlRec;
   }



        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public OpenRunControlFileOutCtx getOpenRunControlFileOutCtx() {
            return new OpenRunControlFileOutCtx();
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
        str += abendMessage900.hashCode();
        str += runControlErrMsgTxt600.hashCode();
        str += abendParaName900.hashCode();
        str += sys012RunControlRec.hashCode();
       return str.hashCode();
    }

    public OpenRunControlFileInCtx clone() {
        OpenRunControlFileInCtx cloneObj = new OpenRunControlFileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.runControlErrMsgTxt600 = new RunControlErrMsgTxt600();
        cloneObj.runControlErrMsgTxt600.set(runControlErrMsgTxt600.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.sys012RunControlRec = new Sys012RunControlRec();
        cloneObj.sys012RunControlRec.set(sys012RunControlRec.getClonedField());
        return cloneObj;
    }

    }

    public OpenRunControlFileInCtx getOpenRunControlFileInCtx() {
            return new OpenRunControlFileInCtx();
    }
     public class OpenRunControlFileOutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     RunControlErrMsgTxt600 runControlErrMsgTxt600 = Ip809050Ctx.this.getRunControlErrMsgTxt600();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();
     Sys012RunControlRec sys012RunControlRec = Ip809050Ctx.this.getSys012RunControlRec();

	/**
	 *	Returns the value of para1310300
	 *	@return para1310300
	 */
   public char[] getPara1310300() throws CFException  {              
   		return work.getPara1310300();
   }

  
	/**
	*  set variable para1310300
	*  @param value
	**/
   public void setPara1310300(char[] value) throws CFException {
      work.setPara1310300(value);
   } 

	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of runControlErrMsgTxt600
	 *	@return runControlErrMsgTxt600
	 */   
	 public RunControlErrMsgTxt600 getRunControlErrMsgTxt600() {
   	return runControlErrMsgTxt600;
   }


	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "ERROR OPENING RUN CONTROL FILE" for isRunCtrlOpenErrTxt88600()
	 *	@return  Returns true if isRunCtrlOpenErrTxt88600() is "ERROR OPENING RUN CONTROL FILE"
	 */
   public boolean isRunCtrlOpenErrTxt88600() throws CFException {
      return runControlErrMsgTxt600.isRunCtrlOpenErrTxt88600();
   }

	/**
	*  set values "ERROR OPENING RUN CONTROL FILE"
	*/
   	public void setRunCtrlOpenErrTxt88600True()  throws CFException{  			
    	runControlErrMsgTxt600.setRunCtrlOpenErrTxt88600True();
   	}
	/**
	 *	Returns the value of sys012OpenAbendCode300
	 *	@return sys012OpenAbendCode300
	 */
   public char[] getSys012OpenAbendCode300() throws CFException  {              
   		return work.getSys012OpenAbendCode300();
   }

  
	/**
	*  set variable sys012OpenAbendCode300
	*  @param value
	**/
   public void setSys012OpenAbendCode300(char[] value) throws CFException {
      work.setSys012OpenAbendCode300(value);
   } 

	/**
	 *	Returns the value of sys012FileStatus200
	 *	@return sys012FileStatus200
	 */
   public char[] getSys012FileStatus200() throws CFException  {              
   		return work.getSys012FileStatus200();
   }

  
	/**
	*  set variable sys012FileStatus200
	*  @param value
	**/
   public void setSys012FileStatus200(char[] value) throws CFException {
      work.setSys012FileStatus200(value);
   } 

	/**
	 *	Returns the value of runCtrlFileStatus600
	 *	@return runCtrlFileStatus600
	 */
   public char[] getRunCtrlFileStatus600() throws CFException  {              
   		return runControlErrMsgTxt600.getRunCtrlFileStatus600();
   }

  
	/**
	*  set variable runCtrlFileStatus600
	*  @param value
	**/
   public void setRunCtrlFileStatus600(char[] value) throws CFException {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(value);
   } 

     /**
	 * 	Update RunCtrlFileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(char[] source, int sourceIndex) throws CFException {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(source, sourceIndex);
   	
   }
   
   public void setRunCtrlFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RunCtrlFileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RunCtrlFileStatus600 with another Field
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(Field source) {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(source);
   }  
   
     /**
	 * 	Update RunCtrlFileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(Field source, int sourceIndex,int sourceLen) {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RunCtrlFileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of outputOtbndFileStatus207
	 *	@return outputOtbndFileStatus207
	 */
   public char[] getOutputOtbndFileStatus207() throws CFException  {              
   		return work.getOutputOtbndFileStatus207();
   }

  
	/**
	*  set variable outputOtbndFileStatus207
	*  @param value
	**/
   public void setOutputOtbndFileStatus207(char[] value) throws CFException {
      work.setOutputOtbndFileStatus207(value);
   } 

	/**
	 *	Test condition "00" for isSys012StatusGood88200()
	 *	@return  Returns true if isSys012StatusGood88200() is "00"
	 */
   public boolean isSys012StatusGood88200() throws CFException {
      return work.isSys012StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys012StatusGood88200True()  throws CFException{  			
    	work.setSys012StatusGood88200True();
   	}

        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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
        str += abendMessage900.hashCode();
        str += runControlErrMsgTxt600.hashCode();
        str += abendParaName900.hashCode();
        str += sys012RunControlRec.hashCode();
       return str.hashCode();
    }

    public OpenRunControlFileOutCtx clone() {
        OpenRunControlFileOutCtx cloneObj = new OpenRunControlFileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.runControlErrMsgTxt600 = new RunControlErrMsgTxt600();
        cloneObj.runControlErrMsgTxt600.set(runControlErrMsgTxt600.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.sys012RunControlRec = new Sys012RunControlRec();
        cloneObj.sys012RunControlRec.set(sys012RunControlRec.getClonedField());
        return cloneObj;
    }

    }

    public OpenRunControlFileOutCtx getOpenRunControlFileOutCtx() {
            return new OpenRunControlFileOutCtx();
    }
     public class ReadRunControlFileInCtx implements Cloneable {
     OutputOtbndErrMsgTxt600 outputOtbndErrMsgTxt600 = Ip809050Ctx.this.getOutputOtbndErrMsgTxt600();
     Ip08101RunControlRecord ip08101RunControlRecord = Ip809050Ctx.this.getIp08101RunControlRecord();
     Work work = Ip809050Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     RunControlErrMsgTxt600 runControlErrMsgTxt600 = Ip809050Ctx.this.getRunControlErrMsgTxt600();
     DateCcyymmdd800 dateCcyymmdd800 = Ip809050Ctx.this.getDateCcyymmdd800();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();
     Ip67002DateParm ip67002DateParm = Ip809050Ctx.this.getIp67002DateParm();
     Sys012RunControlRec sys012RunControlRec = Ip809050Ctx.this.getSys012RunControlRec();
     Ip50005ClearingDtTm ip50005ClearingDtTm = Ip809050Ctx.this.getIp50005ClearingDtTm();

	/**
	 *	Returns the value of sys012EmptyAbendCode300
	 *	@return sys012EmptyAbendCode300
	 */
   public char[] getSys012EmptyAbendCode300() throws CFException  {              
   		return work.getSys012EmptyAbendCode300();
   }

  
	/**
	*  set variable sys012EmptyAbendCode300
	*  @param value
	**/
   public void setSys012EmptyAbendCode300(char[] value) throws CFException {
      work.setSys012EmptyAbendCode300(value);
   } 

	/**
	 *	Returns the value of outputOtbndErrMsgTxt600
	 *	@return outputOtbndErrMsgTxt600
	 */   
	 public OutputOtbndErrMsgTxt600 getOutputOtbndErrMsgTxt600() {
   	return outputOtbndErrMsgTxt600;
   }


	/**
	 *	Returns the value of ip08101RunControlRecord
	 *	@return ip08101RunControlRecord
	 */   
	 public Ip08101RunControlRecord getIp08101RunControlRecord() {
   	return ip08101RunControlRecord;
   }


	/**
	 *	Returns the value of ptrIp670010800
	 *	@return ptrIp670010800
	 */
   public char[] getPtrIp670010800() throws CFException  {              
   		return work.getPtrIp670010800();
   }

  
	/**
	*  set variable ptrIp670010800
	*  @param value
	**/
   public void setPtrIp670010800(char[] value) throws CFException {
      work.setPtrIp670010800(value);
   } 

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	

	/**
	 *	Returns the value of ip08101ProcessDate
	 *	@return ip08101ProcessDate
	 */
	public long getIp08101ProcessDate() throws CFException {
   		return ip08101RunControlRecord.getIp08101ProcessDate();
	}


	/**
	 *	Returns String value of ip08101ProcessDate
	 *	@return ip08101ProcessDate
	 */
	public char[]  getIp08101ProcessDateString() throws CFException {
	     return String.valueOf(ip08101RunControlRecord.getIp08101ProcessDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip08101ProcessDateIsNumeric()  throws CFException{
	    return ip08101RunControlRecord.ip08101ProcessDateIsNumeric();
	}

	/**
	 * 	Update Ip08101ProcessDate with the passed value
	 *	@param number
	 */
	public void setIp08101ProcessDate(long number)  throws CFException{
		ip08101RunControlRecord.setIp08101ProcessDate(number);
	}
	

	
	/**
	 * 	Update Ip08101ProcessDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp08101ProcessDate(char[] value)  throws CFException {
		ip08101RunControlRecord.setIp08101ProcessDate(value);
	}
	
	/**
	 * 	Update Ip08101ProcessDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp08101ProcessDateString(char[] value)  throws CFException{
		ip08101RunControlRecord.setIp08101ProcessDate(value);
	}	

	/**
	 *	Returns the value of ip08101RptProcessTime
	 *	@return ip08101RptProcessTime
	 */
   public char[] getIp08101RptProcessTime() throws CFException  {              
   		return ip08101RunControlRecord.getIp08101RptProcessTime();
   }

  
	/**
	*  set variable ip08101RptProcessTime
	*  @param value
	**/
   public void setIp08101RptProcessTime(char[] value) throws CFException {
      ip08101RunControlRecord.setIp08101RptProcessTime(value);
   } 

     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101RptProcessTime(char[] source, int sourceIndex) throws CFException {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex);
   	
   }
   
   public void setIp08101RptProcessTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RptProcessTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip08101RptProcessTime with another Field
	 *	@param value
	 */
   public void setIp08101RptProcessTime(Field source) {
      ip08101RunControlRecord.setIp08101RptProcessTime(source);
   }  
   
     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101RptProcessTime(Field source, int sourceIndex,int sourceLen) {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RptProcessTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip67002Yyddd
	 *	@return ip67002Yyddd
	 */   
	 public Ip67002Yyddd getIp67002Yyddd() {
   	return ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd();
   }

   /**
	* 	Update Ip67002Yyddd with the passed value
	*	@param value
	*/
   public void setIp67002Yyddd(char[] value) throws CFException {
      ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().setIp67002Yyddd(value);
   }   

     /**
	 * 	Update Ip67002Yyddd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002Yyddd(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().setIp67002Yyddd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip67002Yyddd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Yyddd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().setIp67002Yyddd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip67002Yyddd with another Field
	 *	@param value
	 */
   public void setIp67002Yyddd(Field source) {
   	ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().setIp67002Yyddd(source);
   }  
   
     /**
	 * 	Update Ip67002Yyddd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002Yyddd(Field source, int sourceIndex,int sourceLen) {
   	ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().setIp67002Yyddd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip67002Yyddd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Yyddd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().setIp67002Yyddd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ptrIp752010800
	 *	@return ptrIp752010800
	 */
   public char[] getPtrIp752010800() throws CFException  {              
   		return work.getPtrIp752010800();
   }

  
	/**
	*  set variable ptrIp752010800
	*  @param value
	**/
   public void setPtrIp752010800(char[] value) throws CFException {
      work.setPtrIp752010800(value);
   } 

	/**
	 *	Returns the value of para1320300
	 *	@return para1320300
	 */
   public char[] getPara1320300() throws CFException  {              
   		return work.getPara1320300();
   }

  
	/**
	*  set variable para1320300
	*  @param value
	**/
   public void setPara1320300(char[] value) throws CFException {
      work.setPara1320300(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public ReadRunControlFileOutCtx getReadRunControlFileOutCtx() {
            return new ReadRunControlFileOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += outputOtbndErrMsgTxt600.hashCode();
        str += ip08101RunControlRecord.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
        str += runControlErrMsgTxt600.hashCode();
        str += dateCcyymmdd800.hashCode();
        str += abendParaName900.hashCode();
        str += ip67002DateParm.hashCode();
        str += sys012RunControlRec.hashCode();
        str += ip50005ClearingDtTm.hashCode();
       return str.hashCode();
    }

    public ReadRunControlFileInCtx clone() {
        ReadRunControlFileInCtx cloneObj = new ReadRunControlFileInCtx();
        cloneObj.outputOtbndErrMsgTxt600 = new OutputOtbndErrMsgTxt600();
        cloneObj.outputOtbndErrMsgTxt600.set(outputOtbndErrMsgTxt600.getClonedField());
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.runControlErrMsgTxt600 = new RunControlErrMsgTxt600();
        cloneObj.runControlErrMsgTxt600.set(runControlErrMsgTxt600.getClonedField());
        cloneObj.dateCcyymmdd800 = new DateCcyymmdd800();
        cloneObj.dateCcyymmdd800.set(dateCcyymmdd800.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        cloneObj.sys012RunControlRec = new Sys012RunControlRec();
        cloneObj.sys012RunControlRec.set(sys012RunControlRec.getClonedField());
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        return cloneObj;
    }

    }

    public ReadRunControlFileInCtx getReadRunControlFileInCtx() {
            return new ReadRunControlFileInCtx();
    }
     public class ReadRunControlFileOutCtx implements Cloneable {
     OutputOtbndErrMsgTxt600 outputOtbndErrMsgTxt600 = Ip809050Ctx.this.getOutputOtbndErrMsgTxt600();
     Ip08101RunControlRecord ip08101RunControlRecord = Ip809050Ctx.this.getIp08101RunControlRecord();
     Work work = Ip809050Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     RunControlErrMsgTxt600 runControlErrMsgTxt600 = Ip809050Ctx.this.getRunControlErrMsgTxt600();
     DateCcyymmdd800 dateCcyymmdd800 = Ip809050Ctx.this.getDateCcyymmdd800();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();
     Ip67002DateParm ip67002DateParm = Ip809050Ctx.this.getIp67002DateParm();
     Sys012RunControlRec sys012RunControlRec = Ip809050Ctx.this.getSys012RunControlRec();
     Ip50005ClearingDtTm ip50005ClearingDtTm = Ip809050Ctx.this.getIp50005ClearingDtTm();

	/**
	 *	Test condition "A" for isIp67002GetAbsOfGregDt88()
	 *	@return  Returns true if isIp67002GetAbsOfGregDt88() is "A"
	 */
   public boolean isIp67002GetAbsOfGregDt88() throws CFException {
      return ip67002DateParm.isIp67002GetAbsOfGregDt88();
   }

	/**
	*  set values "A"
	*/
   	public void setIp67002GetAbsOfGregDt88True()  throws CFException{  			
    	ip67002DateParm.setIp67002GetAbsOfGregDt88True();
   	}
	/**
	 *	Returns the value of ip50005ClearingTm
	 *	@return ip50005ClearingTm
	 */
   public char[] getIp50005ClearingTm() throws CFException  {              
   		return ip50005ClearingDtTm.getIp50005ClearingTm();
   }

  
	/**
	*  set variable ip50005ClearingTm
	*  @param value
	**/
   public void setIp50005ClearingTm(char[] value) throws CFException {
      ip50005ClearingDtTm.setIp50005ClearingTm(value);
   } 

     /**
	 * 	Update Ip50005ClearingTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005ClearingTm(char[] source, int sourceIndex) throws CFException {
      ip50005ClearingDtTm.setIp50005ClearingTm(source, sourceIndex);
   	
   }
   
   public void setIp50005ClearingTm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50005ClearingDtTm.setIp50005ClearingTm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005ClearingTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005ClearingTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50005ClearingDtTm.setIp50005ClearingTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50005ClearingTm with another Field
	 *	@param value
	 */
   public void setIp50005ClearingTm(Field source) {
      ip50005ClearingDtTm.setIp50005ClearingTm(source);
   }  
   
     /**
	 * 	Update Ip50005ClearingTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005ClearingTm(Field source, int sourceIndex,int sourceLen) {
      ip50005ClearingDtTm.setIp50005ClearingTm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50005ClearingTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005ClearingTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50005ClearingDtTm.setIp50005ClearingTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip08101RptProcessTime
	 *	@return ip08101RptProcessTime
	 */
   public char[] getIp08101RptProcessTime() throws CFException  {              
   		return ip08101RunControlRecord.getIp08101RptProcessTime();
   }

  
	/**
	*  set variable ip08101RptProcessTime
	*  @param value
	**/
   public void setIp08101RptProcessTime(char[] value) throws CFException {
      ip08101RunControlRecord.setIp08101RptProcessTime(value);
   } 

     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101RptProcessTime(char[] source, int sourceIndex) throws CFException {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex);
   	
   }
   
   public void setIp08101RptProcessTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RptProcessTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip08101RptProcessTime with another Field
	 *	@param value
	 */
   public void setIp08101RptProcessTime(Field source) {
      ip08101RunControlRecord.setIp08101RptProcessTime(source);
   }  
   
     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101RptProcessTime(Field source, int sourceIndex,int sourceLen) {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RptProcessTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip67002Yyddd
	 *	@return ip67002Yyddd
	 */   
	 public Ip67002Yyddd getIp67002Yyddd() {
   	return ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd();
   }

   /**
	* 	Update Ip67002Yyddd with the passed value
	*	@param value
	*/
   public void setIp67002Yyddd(char[] value) throws CFException {
      ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().setIp67002Yyddd(value);
   }   

     /**
	 * 	Update Ip67002Yyddd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002Yyddd(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().setIp67002Yyddd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip67002Yyddd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Yyddd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().setIp67002Yyddd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip67002Yyddd with another Field
	 *	@param value
	 */
   public void setIp67002Yyddd(Field source) {
   	ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().setIp67002Yyddd(source);
   }  
   
     /**
	 * 	Update Ip67002Yyddd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002Yyddd(Field source, int sourceIndex,int sourceLen) {
   	ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().setIp67002Yyddd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip67002Yyddd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Yyddd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().setIp67002Yyddd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dateYymmdd800
	 *	@return dateYymmdd800
	 */
   public char[] getDateYymmdd800() throws CFException  {              
   		return dateCcyymmdd800.getDateYymmdd800();
   }

  
	/**
	*  set variable dateYymmdd800
	*  @param value
	**/
   public void setDateYymmdd800(char[] value) throws CFException {
      dateCcyymmdd800.setDateYymmdd800(value);
   } 

     /**
	 * 	Update DateYymmdd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDateYymmdd800(char[] source, int sourceIndex) throws CFException {
      dateCcyymmdd800.setDateYymmdd800(source, sourceIndex);
   	
   }
   
   public void setDateYymmdd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dateCcyymmdd800.setDateYymmdd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DateYymmdd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDateYymmdd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dateCcyymmdd800.setDateYymmdd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DateYymmdd800 with another Field
	 *	@param value
	 */
   public void setDateYymmdd800(Field source) {
      dateCcyymmdd800.setDateYymmdd800(source);
   }  
   
     /**
	 * 	Update DateYymmdd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDateYymmdd800(Field source, int sourceIndex,int sourceLen) {
      dateCcyymmdd800.setDateYymmdd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DateYymmdd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDateYymmdd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dateCcyymmdd800.setDateYymmdd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys012RunControlRec
	 *	@return sys012RunControlRec
	 */   
	 public Sys012RunControlRec getSys012RunControlRec() {
   	return sys012RunControlRec;
   }


	/**
	 *	Test condition "00" for isSys012StatusGood88200()
	 *	@return  Returns true if isSys012StatusGood88200() is "00"
	 */
   public boolean isSys012StatusGood88200() throws CFException {
      return work.isSys012StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys012StatusGood88200True()  throws CFException{  			
    	work.setSys012StatusGood88200True();
   	}
	/**
	 *	Returns the value of ip67002Yymmdd
	 *	@return ip67002Yymmdd
	 */
   public char[] getIp67002Yymmdd() throws CFException  {              
   		return ip67002DateParm.getIp67002DateRedefined02().getIp67002Yymmdd();
   }

  
	/**
	*  set variable ip67002Yymmdd
	*  @param value
	**/
   public void setIp67002Yymmdd(char[] value) throws CFException {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(value);
   } 

     /**
	 * 	Update Ip67002Yymmdd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp67002Yymmdd(char[] source, int sourceIndex) throws CFException {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(source, sourceIndex);
   	
   }
   
   public void setIp67002Yymmdd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip67002Yymmdd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Yymmdd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip67002Yymmdd with another Field
	 *	@param value
	 */
   public void setIp67002Yymmdd(Field source) {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(source);
   }  
   
     /**
	 * 	Update Ip67002Yymmdd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp67002Yymmdd(Field source, int sourceIndex,int sourceLen) {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip67002Yymmdd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Yymmdd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fxDateYyddd800
	 *	@return fxDateYyddd800
	 */
	public long getFxDateYyddd800() throws CFException {
   		return work.getFxDateYyddd800();
	}


	/**
	 *	Returns String value of fxDateYyddd800
	 *	@return fxDateYyddd800
	 */
	public char[]  getFxDateYyddd800String() throws CFException {
	     return String.valueOf(work.getFxDateYyddd800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fxDateYyddd800IsNumeric()  throws CFException{
	    return work.fxDateYyddd800IsNumeric();
	}

	/**
	 * 	Update FxDateYyddd800 with the passed value
	 *	@param number
	 */
	public void setFxDateYyddd800(long number)  throws CFException{
		work.setFxDateYyddd800(number);
	}
	

	
	/**
	 * 	Update FxDateYyddd800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFxDateYyddd800(char[] value)  throws CFException {
		work.setFxDateYyddd800(value);
	}
	
	/**
	 * 	Update FxDateYyddd800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFxDateYyddd800String(char[] value)  throws CFException{
		work.setFxDateYyddd800(value);
	}	

	/**
	 *	Returns the value of sys012EmptyAbendCode300
	 *	@return sys012EmptyAbendCode300
	 */
   public char[] getSys012EmptyAbendCode300() throws CFException  {              
   		return work.getSys012EmptyAbendCode300();
   }

  
	/**
	*  set variable sys012EmptyAbendCode300
	*  @param value
	**/
   public void setSys012EmptyAbendCode300(char[] value) throws CFException {
      work.setSys012EmptyAbendCode300(value);
   } 

	/**
	 *	Returns the value of outputOtbndErrMsgTxt600
	 *	@return outputOtbndErrMsgTxt600
	 */   
	 public OutputOtbndErrMsgTxt600 getOutputOtbndErrMsgTxt600() {
   	return outputOtbndErrMsgTxt600;
   }


	/**
	 *	Returns the value of ip50005ClearingDt
	 *	@return ip50005ClearingDt
	 */
   public char[] getIp50005ClearingDt() throws CFException  {              
   		return ip50005ClearingDtTm.getIp50005ClearingDt();
   }

  
	/**
	*  set variable ip50005ClearingDt
	*  @param value
	**/
   public void setIp50005ClearingDt(char[] value) throws CFException {
      ip50005ClearingDtTm.setIp50005ClearingDt(value);
   } 

     /**
	 * 	Update Ip50005ClearingDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005ClearingDt(char[] source, int sourceIndex) throws CFException {
      ip50005ClearingDtTm.setIp50005ClearingDt(source, sourceIndex);
   	
   }
   
   public void setIp50005ClearingDt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50005ClearingDtTm.setIp50005ClearingDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005ClearingDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005ClearingDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50005ClearingDtTm.setIp50005ClearingDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50005ClearingDt with another Field
	 *	@param value
	 */
   public void setIp50005ClearingDt(Field source) {
      ip50005ClearingDtTm.setIp50005ClearingDt(source);
   }  
   
     /**
	 * 	Update Ip50005ClearingDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005ClearingDt(Field source, int sourceIndex,int sourceLen) {
      ip50005ClearingDtTm.setIp50005ClearingDt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50005ClearingDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005ClearingDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50005ClearingDtTm.setIp50005ClearingDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Test condition "EMPTY RUN CONTROL FILE" for isRunCtrlEmtyErrTxt88600()
	 *	@return  Returns true if isRunCtrlEmtyErrTxt88600() is "EMPTY RUN CONTROL FILE"
	 */
   public boolean isRunCtrlEmtyErrTxt88600() throws CFException {
      return runControlErrMsgTxt600.isRunCtrlEmtyErrTxt88600();
   }

	/**
	*  set values "EMPTY RUN CONTROL FILE"
	*/
   	public void setRunCtrlEmtyErrTxt88600True()  throws CFException{  			
    	runControlErrMsgTxt600.setRunCtrlEmtyErrTxt88600True();
   	}
	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	

	/**
	 *	Returns the value of dateCcyymmdd800
	 *	@return dateCcyymmdd800
	 */   
	 public DateCcyymmdd800 getDateCcyymmdd800() {
   	return dateCcyymmdd800;
   }


	/**
	 *	Returns the value of ip08101ProcessDate
	 *	@return ip08101ProcessDate
	 */
	public long getIp08101ProcessDate() throws CFException {
   		return ip08101RunControlRecord.getIp08101ProcessDate();
	}


	/**
	 *	Returns String value of ip08101ProcessDate
	 *	@return ip08101ProcessDate
	 */
	public char[]  getIp08101ProcessDateString() throws CFException {
	     return String.valueOf(ip08101RunControlRecord.getIp08101ProcessDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip08101ProcessDateIsNumeric()  throws CFException{
	    return ip08101RunControlRecord.ip08101ProcessDateIsNumeric();
	}

	/**
	 * 	Update Ip08101ProcessDate with the passed value
	 *	@param number
	 */
	public void setIp08101ProcessDate(long number)  throws CFException{
		ip08101RunControlRecord.setIp08101ProcessDate(number);
	}
	

	
	/**
	 * 	Update Ip08101ProcessDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp08101ProcessDate(char[] value)  throws CFException {
		ip08101RunControlRecord.setIp08101ProcessDate(value);
	}
	
	/**
	 * 	Update Ip08101ProcessDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp08101ProcessDateString(char[] value)  throws CFException{
		ip08101RunControlRecord.setIp08101ProcessDate(value);
	}	

	/**
	 *	Returns the value of sys012FileStatus200
	 *	@return sys012FileStatus200
	 */
   public char[] getSys012FileStatus200() throws CFException  {              
   		return work.getSys012FileStatus200();
   }

  
	/**
	*  set variable sys012FileStatus200
	*  @param value
	**/
   public void setSys012FileStatus200(char[] value) throws CFException {
      work.setSys012FileStatus200(value);
   } 

	/**
	 *	Test condition "E" for isIp67002GetJulOfAbsDt88()
	 *	@return  Returns true if isIp67002GetJulOfAbsDt88() is "E"
	 */
   public boolean isIp67002GetJulOfAbsDt88() throws CFException {
      return ip67002DateParm.isIp67002GetJulOfAbsDt88();
   }

	/**
	*  set values "E"
	*/
   	public void setIp67002GetJulOfAbsDt88True()  throws CFException{  			
    	ip67002DateParm.setIp67002GetJulOfAbsDt88True();
   	}
	/**
	 *	Returns the value of runCtrlFileStatus600
	 *	@return runCtrlFileStatus600
	 */
   public char[] getRunCtrlFileStatus600() throws CFException  {              
   		return runControlErrMsgTxt600.getRunCtrlFileStatus600();
   }

  
	/**
	*  set variable runCtrlFileStatus600
	*  @param value
	**/
   public void setRunCtrlFileStatus600(char[] value) throws CFException {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(value);
   } 

     /**
	 * 	Update RunCtrlFileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(char[] source, int sourceIndex) throws CFException {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(source, sourceIndex);
   	
   }
   
   public void setRunCtrlFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RunCtrlFileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RunCtrlFileStatus600 with another Field
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(Field source) {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(source);
   }  
   
     /**
	 * 	Update RunCtrlFileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(Field source, int sourceIndex,int sourceLen) {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RunCtrlFileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of para1320300
	 *	@return para1320300
	 */
   public char[] getPara1320300() throws CFException  {              
   		return work.getPara1320300();
   }

  
	/**
	*  set variable para1320300
	*  @param value
	**/
   public void setPara1320300(char[] value) throws CFException {
      work.setPara1320300(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += outputOtbndErrMsgTxt600.hashCode();
        str += ip08101RunControlRecord.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
        str += runControlErrMsgTxt600.hashCode();
        str += dateCcyymmdd800.hashCode();
        str += abendParaName900.hashCode();
        str += ip67002DateParm.hashCode();
        str += sys012RunControlRec.hashCode();
        str += ip50005ClearingDtTm.hashCode();
       return str.hashCode();
    }

    public ReadRunControlFileOutCtx clone() {
        ReadRunControlFileOutCtx cloneObj = new ReadRunControlFileOutCtx();
        cloneObj.outputOtbndErrMsgTxt600 = new OutputOtbndErrMsgTxt600();
        cloneObj.outputOtbndErrMsgTxt600.set(outputOtbndErrMsgTxt600.getClonedField());
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.runControlErrMsgTxt600 = new RunControlErrMsgTxt600();
        cloneObj.runControlErrMsgTxt600.set(runControlErrMsgTxt600.getClonedField());
        cloneObj.dateCcyymmdd800 = new DateCcyymmdd800();
        cloneObj.dateCcyymmdd800.set(dateCcyymmdd800.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        cloneObj.sys012RunControlRec = new Sys012RunControlRec();
        cloneObj.sys012RunControlRec.set(sys012RunControlRec.getClonedField());
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        return cloneObj;
    }

    }

    public ReadRunControlFileOutCtx getReadRunControlFileOutCtx() {
            return new ReadRunControlFileOutCtx();
    }
     public class CheckEventLogSwInCtx implements Cloneable {
     Ip08101RunControlRecord ip08101RunControlRecord = Ip809050Ctx.this.getIp08101RunControlRecord();
     Work work = Ip809050Ctx.this.getWork();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip809050Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of ip08101RunIndicator
	 *	@return ip08101RunIndicator
	 */
   public char[] getIp08101RunIndicator() throws CFException  {              
   		return ip08101RunControlRecord.getIp08101RptInds().getIp08101RunIndicator();
   }

  
	/**
	*  set variable ip08101RunIndicator
	*  @param value
	**/
   public void setIp08101RunIndicator(char[] value) throws CFException {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(value);
   } 

     /**
	 * 	Update Ip08101RunIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101RunIndicator(char[] source, int sourceIndex) throws CFException {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex);
   	
   }
   
   public void setIp08101RunIndicator(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip08101RunIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RunIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip08101RunIndicator with another Field
	 *	@param value
	 */
   public void setIp08101RunIndicator(Field source) {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source);
   }  
   
     /**
	 * 	Update Ip08101RunIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101RunIndicator(Field source, int sourceIndex,int sourceLen) {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip08101RunIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RunIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of valueTest300
	 *	@return valueTest300
	 */
   public char[] getValueTest300() throws CFException  {              
   		return work.getValueTest300();
   }

  
	/**
	*  set variable valueTest300
	*  @param value
	**/
   public void setValueTest300(char[] value) throws CFException {
      work.setValueTest300(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public CheckEventLogSwOutCtx getCheckEventLogSwOutCtx() {
            return new CheckEventLogSwOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip08101RunControlRecord.hashCode();
        str += work.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public CheckEventLogSwInCtx clone() {
        CheckEventLogSwInCtx cloneObj = new CheckEventLogSwInCtx();
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public CheckEventLogSwInCtx getCheckEventLogSwInCtx() {
            return new CheckEventLogSwInCtx();
    }
     public class CheckEventLogSwOutCtx implements Cloneable {
     Ip08101RunControlRecord ip08101RunControlRecord = Ip809050Ctx.this.getIp08101RunControlRecord();
     Work work = Ip809050Ctx.this.getWork();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip809050Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Test condition "T" for isIp60001LogEvent88()
	 *	@return  Returns true if isIp60001LogEvent88() is "T"
	 */
   public boolean isIp60001LogEvent88() throws CFException {
      return ip60001EventLogWorkArea.isIp60001LogEvent88();
   }

	/**
	*  set values "T"
	*/
   	public void setIp60001LogEvent88True()  throws CFException{  			
    	ip60001EventLogWorkArea.setIp60001LogEvent88True();
   	}

        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip08101RunControlRecord.hashCode();
        str += work.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public CheckEventLogSwOutCtx clone() {
        CheckEventLogSwOutCtx cloneObj = new CheckEventLogSwOutCtx();
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public CheckEventLogSwOutCtx getCheckEventLogSwOutCtx() {
            return new CheckEventLogSwOutCtx();
    }
     public class CloseRunControlFileInCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     RunControlErrMsgTxt600 runControlErrMsgTxt600 = Ip809050Ctx.this.getRunControlErrMsgTxt600();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();

	/**
	 *	Returns the value of sys012CloseAbendCode300
	 *	@return sys012CloseAbendCode300
	 */
   public char[] getSys012CloseAbendCode300() throws CFException  {              
   		return work.getSys012CloseAbendCode300();
   }

  
	/**
	*  set variable sys012CloseAbendCode300
	*  @param value
	**/
   public void setSys012CloseAbendCode300(char[] value) throws CFException {
      work.setSys012CloseAbendCode300(value);
   } 

	/**
	 *	Returns the value of para1330300
	 *	@return para1330300
	 */
   public char[] getPara1330300() throws CFException  {              
   		return work.getPara1330300();
   }

  
	/**
	*  set variable para1330300
	*  @param value
	**/
   public void setPara1330300(char[] value) throws CFException {
      work.setPara1330300(value);
   } 

	/**
	 *	Returns the value of runControlErrMsgTxt600
	 *	@return runControlErrMsgTxt600
	 */   
	 public RunControlErrMsgTxt600 getRunControlErrMsgTxt600() {
   	return runControlErrMsgTxt600;
   }


	/**
	 *	Returns the value of sys012FileStatus200
	 *	@return sys012FileStatus200
	 */
   public char[] getSys012FileStatus200() throws CFException  {              
   		return work.getSys012FileStatus200();
   }

  
	/**
	*  set variable sys012FileStatus200
	*  @param value
	**/
   public void setSys012FileStatus200(char[] value) throws CFException {
      work.setSys012FileStatus200(value);
   } 

	/**
	 *	Test condition "00" for isSys012StatusGood88200()
	 *	@return  Returns true if isSys012StatusGood88200() is "00"
	 */
   public boolean isSys012StatusGood88200() throws CFException {
      return work.isSys012StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys012StatusGood88200True()  throws CFException{  			
    	work.setSys012StatusGood88200True();
   	}

        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public CloseRunControlFileOutCtx getCloseRunControlFileOutCtx() {
            return new CloseRunControlFileOutCtx();
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
        str += abendMessage900.hashCode();
        str += runControlErrMsgTxt600.hashCode();
        str += abendParaName900.hashCode();
       return str.hashCode();
    }

    public CloseRunControlFileInCtx clone() {
        CloseRunControlFileInCtx cloneObj = new CloseRunControlFileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.runControlErrMsgTxt600 = new RunControlErrMsgTxt600();
        cloneObj.runControlErrMsgTxt600.set(runControlErrMsgTxt600.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        return cloneObj;
    }

    }

    public CloseRunControlFileInCtx getCloseRunControlFileInCtx() {
            return new CloseRunControlFileInCtx();
    }
     public class CloseRunControlFileOutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     RunControlErrMsgTxt600 runControlErrMsgTxt600 = Ip809050Ctx.this.getRunControlErrMsgTxt600();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();

	/**
	 *	Returns the value of sys012CloseAbendCode300
	 *	@return sys012CloseAbendCode300
	 */
   public char[] getSys012CloseAbendCode300() throws CFException  {              
   		return work.getSys012CloseAbendCode300();
   }

  
	/**
	*  set variable sys012CloseAbendCode300
	*  @param value
	**/
   public void setSys012CloseAbendCode300(char[] value) throws CFException {
      work.setSys012CloseAbendCode300(value);
   } 

	/**
	 *	Returns the value of para1330300
	 *	@return para1330300
	 */
   public char[] getPara1330300() throws CFException  {              
   		return work.getPara1330300();
   }

  
	/**
	*  set variable para1330300
	*  @param value
	**/
   public void setPara1330300(char[] value) throws CFException {
      work.setPara1330300(value);
   } 

	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of runControlErrMsgTxt600
	 *	@return runControlErrMsgTxt600
	 */   
	 public RunControlErrMsgTxt600 getRunControlErrMsgTxt600() {
   	return runControlErrMsgTxt600;
   }


	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of runCtrlFileStatus600
	 *	@return runCtrlFileStatus600
	 */
   public char[] getRunCtrlFileStatus600() throws CFException  {              
   		return runControlErrMsgTxt600.getRunCtrlFileStatus600();
   }

  
	/**
	*  set variable runCtrlFileStatus600
	*  @param value
	**/
   public void setRunCtrlFileStatus600(char[] value) throws CFException {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(value);
   } 

     /**
	 * 	Update RunCtrlFileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(char[] source, int sourceIndex) throws CFException {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(source, sourceIndex);
   	
   }
   
   public void setRunCtrlFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RunCtrlFileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RunCtrlFileStatus600 with another Field
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(Field source) {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(source);
   }  
   
     /**
	 * 	Update RunCtrlFileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(Field source, int sourceIndex,int sourceLen) {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RunCtrlFileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      runControlErrMsgTxt600.setRunCtrlFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys012FileStatus200
	 *	@return sys012FileStatus200
	 */
   public char[] getSys012FileStatus200() throws CFException  {              
   		return work.getSys012FileStatus200();
   }

  
	/**
	*  set variable sys012FileStatus200
	*  @param value
	**/
   public void setSys012FileStatus200(char[] value) throws CFException {
      work.setSys012FileStatus200(value);
   } 

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "ERROR CLOSING RUN CONTROL FILE" for isRunCtrlCloseErrTxt88600()
	 *	@return  Returns true if isRunCtrlCloseErrTxt88600() is "ERROR CLOSING RUN CONTROL FILE"
	 */
   public boolean isRunCtrlCloseErrTxt88600() throws CFException {
      return runControlErrMsgTxt600.isRunCtrlCloseErrTxt88600();
   }

	/**
	*  set values "ERROR CLOSING RUN CONTROL FILE"
	*/
   	public void setRunCtrlCloseErrTxt88600True()  throws CFException{  			
    	runControlErrMsgTxt600.setRunCtrlCloseErrTxt88600True();
   	}

        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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
        str += abendMessage900.hashCode();
        str += runControlErrMsgTxt600.hashCode();
        str += abendParaName900.hashCode();
       return str.hashCode();
    }

    public CloseRunControlFileOutCtx clone() {
        CloseRunControlFileOutCtx cloneObj = new CloseRunControlFileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.runControlErrMsgTxt600 = new RunControlErrMsgTxt600();
        cloneObj.runControlErrMsgTxt600.set(runControlErrMsgTxt600.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        return cloneObj;
    }

    }

    public CloseRunControlFileOutCtx getCloseRunControlFileOutCtx() {
            return new CloseRunControlFileOutCtx();
    }
     public class OpenUscrbIpmOtbndFileInCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();
     InputOutboundErrMsgTxt600 inputOutboundErrMsgTxt600 = Ip809050Ctx.this.getInputOutboundErrMsgTxt600();
     Sys001InputIpmOutboundRec sys001InputIpmOutboundRec = Ip809050Ctx.this.getSys001InputIpmOutboundRec();

	/**
	 *	Returns the value of para1410300
	 *	@return para1410300
	 */
   public char[] getPara1410300() throws CFException  {              
   		return work.getPara1410300();
   }

  
	/**
	*  set variable para1410300
	*  @param value
	**/
   public void setPara1410300(char[] value) throws CFException {
      work.setPara1410300(value);
   } 

	/**
	 *	Returns the value of inputOutboundErrMsgTxt600
	 *	@return inputOutboundErrMsgTxt600
	 */   
	 public InputOutboundErrMsgTxt600 getInputOutboundErrMsgTxt600() {
   	return inputOutboundErrMsgTxt600;
   }


	/**
	 *	Returns the value of sys001InputIpmOutboundRec
	 *	@return sys001InputIpmOutboundRec
	 */   
	 public Sys001InputIpmOutboundRec getSys001InputIpmOutboundRec() {
   	return sys001InputIpmOutboundRec;
   }


	/**
	 *	Returns the value of sys001OpenAbendCode300
	 *	@return sys001OpenAbendCode300
	 */
   public char[] getSys001OpenAbendCode300() throws CFException  {              
   		return work.getSys001OpenAbendCode300();
   }

  
	/**
	*  set variable sys001OpenAbendCode300
	*  @param value
	**/
   public void setSys001OpenAbendCode300(char[] value) throws CFException {
      work.setSys001OpenAbendCode300(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public OpenUscrbIpmOtbndFileOutCtx getOpenUscrbIpmOtbndFileOutCtx() {
            return new OpenUscrbIpmOtbndFileOutCtx();
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
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += inputOutboundErrMsgTxt600.hashCode();
        str += sys001InputIpmOutboundRec.hashCode();
       return str.hashCode();
    }

    public OpenUscrbIpmOtbndFileInCtx clone() {
        OpenUscrbIpmOtbndFileInCtx cloneObj = new OpenUscrbIpmOtbndFileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.inputOutboundErrMsgTxt600 = new InputOutboundErrMsgTxt600();
        cloneObj.inputOutboundErrMsgTxt600.set(inputOutboundErrMsgTxt600.getClonedField());
        cloneObj.sys001InputIpmOutboundRec = new Sys001InputIpmOutboundRec();
        cloneObj.sys001InputIpmOutboundRec.set(sys001InputIpmOutboundRec.getClonedField());
        return cloneObj;
    }

    }

    public OpenUscrbIpmOtbndFileInCtx getOpenUscrbIpmOtbndFileInCtx() {
            return new OpenUscrbIpmOtbndFileInCtx();
    }
     public class OpenUscrbIpmOtbndFileOutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();
     InputOutboundErrMsgTxt600 inputOutboundErrMsgTxt600 = Ip809050Ctx.this.getInputOutboundErrMsgTxt600();
     Sys001InputIpmOutboundRec sys001InputIpmOutboundRec = Ip809050Ctx.this.getSys001InputIpmOutboundRec();

	/**
	 *	Returns the value of sys001FileStatus200
	 *	@return sys001FileStatus200
	 */
   public char[] getSys001FileStatus200() throws CFException  {              
   		return work.getSys001FileStatus200();
   }

  
	/**
	*  set variable sys001FileStatus200
	*  @param value
	**/
   public void setSys001FileStatus200(char[] value) throws CFException {
      work.setSys001FileStatus200(value);
   } 

	/**
	 *	Test condition "ERROR OPENING INPUT IPM OUTBOUND FILE" for isInputFileOpenErrTxt88600()
	 *	@return  Returns true if isInputFileOpenErrTxt88600() is "ERROR OPENING INPUT IPM OUTBOUND FILE"
	 */
   public boolean isInputFileOpenErrTxt88600() throws CFException {
      return inputOutboundErrMsgTxt600.isInputFileOpenErrTxt88600();
   }

	/**
	*  set values "ERROR OPENING INPUT IPM OUTBOUND FILE"
	*/
   	public void setInputFileOpenErrTxt88600True()  throws CFException{  			
    	inputOutboundErrMsgTxt600.setInputFileOpenErrTxt88600True();
   	}
	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of para1410300
	 *	@return para1410300
	 */
   public char[] getPara1410300() throws CFException  {              
   		return work.getPara1410300();
   }

  
	/**
	*  set variable para1410300
	*  @param value
	**/
   public void setPara1410300(char[] value) throws CFException {
      work.setPara1410300(value);
   } 

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of inputOtbndFileStatus600
	 *	@return inputOtbndFileStatus600
	 */
   public char[] getInputOtbndFileStatus600() throws CFException  {              
   		return inputOutboundErrMsgTxt600.getInputOtbndFileStatus600();
   }

  
	/**
	*  set variable inputOtbndFileStatus600
	*  @param value
	**/
   public void setInputOtbndFileStatus600(char[] value) throws CFException {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(value);
   } 

     /**
	 * 	Update InputOtbndFileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(char[] source, int sourceIndex) throws CFException {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(source, sourceIndex);
   	
   }
   
   public void setInputOtbndFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update InputOtbndFileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update InputOtbndFileStatus600 with another Field
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(Field source) {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(source);
   }  
   
     /**
	 * 	Update InputOtbndFileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(Field source, int sourceIndex,int sourceLen) {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update InputOtbndFileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of inputOutboundErrMsgTxt600
	 *	@return inputOutboundErrMsgTxt600
	 */   
	 public InputOutboundErrMsgTxt600 getInputOutboundErrMsgTxt600() {
   	return inputOutboundErrMsgTxt600;
   }


	/**
	 *	Test condition "00" for isSys001StatusGood88200()
	 *	@return  Returns true if isSys001StatusGood88200() is "00"
	 */
   public boolean isSys001StatusGood88200() throws CFException {
      return work.isSys001StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys001StatusGood88200True()  throws CFException{  			
    	work.setSys001StatusGood88200True();
   	}
	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of outputOtbndFileStatus207
	 *	@return outputOtbndFileStatus207
	 */
   public char[] getOutputOtbndFileStatus207() throws CFException  {              
   		return work.getOutputOtbndFileStatus207();
   }

  
	/**
	*  set variable outputOtbndFileStatus207
	*  @param value
	**/
   public void setOutputOtbndFileStatus207(char[] value) throws CFException {
      work.setOutputOtbndFileStatus207(value);
   } 

	/**
	 *	Returns the value of sys001OpenAbendCode300
	 *	@return sys001OpenAbendCode300
	 */
   public char[] getSys001OpenAbendCode300() throws CFException  {              
   		return work.getSys001OpenAbendCode300();
   }

  
	/**
	*  set variable sys001OpenAbendCode300
	*  @param value
	**/
   public void setSys001OpenAbendCode300(char[] value) throws CFException {
      work.setSys001OpenAbendCode300(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += inputOutboundErrMsgTxt600.hashCode();
        str += sys001InputIpmOutboundRec.hashCode();
       return str.hashCode();
    }

    public OpenUscrbIpmOtbndFileOutCtx clone() {
        OpenUscrbIpmOtbndFileOutCtx cloneObj = new OpenUscrbIpmOtbndFileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.inputOutboundErrMsgTxt600 = new InputOutboundErrMsgTxt600();
        cloneObj.inputOutboundErrMsgTxt600.set(inputOutboundErrMsgTxt600.getClonedField());
        cloneObj.sys001InputIpmOutboundRec = new Sys001InputIpmOutboundRec();
        cloneObj.sys001InputIpmOutboundRec.set(sys001InputIpmOutboundRec.getClonedField());
        return cloneObj;
    }

    }

    public OpenUscrbIpmOtbndFileOutCtx getOpenUscrbIpmOtbndFileOutCtx() {
            return new OpenUscrbIpmOtbndFileOutCtx();
    }
     public class OpenScrbOtbndFileInCtx implements Cloneable {
     OutputOtbndErrMsgTxt600 outputOtbndErrMsgTxt600 = Ip809050Ctx.this.getOutputOtbndErrMsgTxt600();
     Sys207OutputIpmOtbndRec sys207OutputIpmOtbndRec = Ip809050Ctx.this.getSys207OutputIpmOtbndRec();
     Sys202OutputIpmOtbndRec sys202OutputIpmOtbndRec = Ip809050Ctx.this.getSys202OutputIpmOtbndRec();
     Work work = Ip809050Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     Sys201OutputIpmOtbndRec sys201OutputIpmOtbndRec = Ip809050Ctx.this.getSys201OutputIpmOtbndRec();
     Sys203OutputIpmOtbndRec sys203OutputIpmOtbndRec = Ip809050Ctx.this.getSys203OutputIpmOtbndRec();
     Sys205OutputIpmOtbndRec sys205OutputIpmOtbndRec = Ip809050Ctx.this.getSys205OutputIpmOtbndRec();
     Sys206OutputIpmOtbndRec sys206OutputIpmOtbndRec = Ip809050Ctx.this.getSys206OutputIpmOtbndRec();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();
     Sys204OutputIpmOtbndRec sys204OutputIpmOtbndRec = Ip809050Ctx.this.getSys204OutputIpmOtbndRec();

	/**
	 *	Returns the value of outputOtbndErrMsgTxt600
	 *	@return outputOtbndErrMsgTxt600
	 */   
	 public OutputOtbndErrMsgTxt600 getOutputOtbndErrMsgTxt600() {
   	return outputOtbndErrMsgTxt600;
   }


	/**
	 *	Returns the value of sys207OutputIpmOtbndRec
	 *	@return sys207OutputIpmOtbndRec
	 */   
	 public Sys207OutputIpmOtbndRec getSys207OutputIpmOtbndRec() {
   	return sys207OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of sys202OutputIpmOtbndRec
	 *	@return sys202OutputIpmOtbndRec
	 */   
	 public Sys202OutputIpmOtbndRec getSys202OutputIpmOtbndRec() {
   	return sys202OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of sys201OpenAbendCode300
	 *	@return sys201OpenAbendCode300
	 */
   public char[] getSys201OpenAbendCode300() throws CFException  {              
   		return work.getSys201OpenAbendCode300();
   }

  
	/**
	*  set variable sys201OpenAbendCode300
	*  @param value
	**/
   public void setSys201OpenAbendCode300(char[] value) throws CFException {
      work.setSys201OpenAbendCode300(value);
   } 

	/**
	 *	Returns the value of sys201OutputIpmOtbndRec
	 *	@return sys201OutputIpmOtbndRec
	 */   
	 public Sys201OutputIpmOtbndRec getSys201OutputIpmOtbndRec() {
   	return sys201OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of sys203OutputIpmOtbndRec
	 *	@return sys203OutputIpmOtbndRec
	 */   
	 public Sys203OutputIpmOtbndRec getSys203OutputIpmOtbndRec() {
   	return sys203OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of sys205OutputIpmOtbndRec
	 *	@return sys205OutputIpmOtbndRec
	 */   
	 public Sys205OutputIpmOtbndRec getSys205OutputIpmOtbndRec() {
   	return sys205OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of sys206OutputIpmOtbndRec
	 *	@return sys206OutputIpmOtbndRec
	 */   
	 public Sys206OutputIpmOtbndRec getSys206OutputIpmOtbndRec() {
   	return sys206OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of sys204OutputIpmOtbndRec
	 *	@return sys204OutputIpmOtbndRec
	 */   
	 public Sys204OutputIpmOtbndRec getSys204OutputIpmOtbndRec() {
   	return sys204OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of para1420300
	 *	@return para1420300
	 */
   public char[] getPara1420300() throws CFException  {              
   		return work.getPara1420300();
   }

  
	/**
	*  set variable para1420300
	*  @param value
	**/
   public void setPara1420300(char[] value) throws CFException {
      work.setPara1420300(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public OpenScrbOtbndFileOutCtx getOpenScrbOtbndFileOutCtx() {
            return new OpenScrbOtbndFileOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += outputOtbndErrMsgTxt600.hashCode();
        str += sys207OutputIpmOtbndRec.hashCode();
        str += sys202OutputIpmOtbndRec.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
        str += sys201OutputIpmOtbndRec.hashCode();
        str += sys203OutputIpmOtbndRec.hashCode();
        str += sys205OutputIpmOtbndRec.hashCode();
        str += sys206OutputIpmOtbndRec.hashCode();
        str += abendParaName900.hashCode();
        str += sys204OutputIpmOtbndRec.hashCode();
       return str.hashCode();
    }

    public OpenScrbOtbndFileInCtx clone() {
        OpenScrbOtbndFileInCtx cloneObj = new OpenScrbOtbndFileInCtx();
        cloneObj.outputOtbndErrMsgTxt600 = new OutputOtbndErrMsgTxt600();
        cloneObj.outputOtbndErrMsgTxt600.set(outputOtbndErrMsgTxt600.getClonedField());
        cloneObj.sys207OutputIpmOtbndRec = new Sys207OutputIpmOtbndRec();
        cloneObj.sys207OutputIpmOtbndRec.set(sys207OutputIpmOtbndRec.getClonedField());
        cloneObj.sys202OutputIpmOtbndRec = new Sys202OutputIpmOtbndRec();
        cloneObj.sys202OutputIpmOtbndRec.set(sys202OutputIpmOtbndRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.sys201OutputIpmOtbndRec = new Sys201OutputIpmOtbndRec();
        cloneObj.sys201OutputIpmOtbndRec.set(sys201OutputIpmOtbndRec.getClonedField());
        cloneObj.sys203OutputIpmOtbndRec = new Sys203OutputIpmOtbndRec();
        cloneObj.sys203OutputIpmOtbndRec.set(sys203OutputIpmOtbndRec.getClonedField());
        cloneObj.sys205OutputIpmOtbndRec = new Sys205OutputIpmOtbndRec();
        cloneObj.sys205OutputIpmOtbndRec.set(sys205OutputIpmOtbndRec.getClonedField());
        cloneObj.sys206OutputIpmOtbndRec = new Sys206OutputIpmOtbndRec();
        cloneObj.sys206OutputIpmOtbndRec.set(sys206OutputIpmOtbndRec.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.sys204OutputIpmOtbndRec = new Sys204OutputIpmOtbndRec();
        cloneObj.sys204OutputIpmOtbndRec.set(sys204OutputIpmOtbndRec.getClonedField());
        return cloneObj;
    }

    }

    public OpenScrbOtbndFileInCtx getOpenScrbOtbndFileInCtx() {
            return new OpenScrbOtbndFileInCtx();
    }
     public class OpenScrbOtbndFileOutCtx implements Cloneable {
     OutputOtbndErrMsgTxt600 outputOtbndErrMsgTxt600 = Ip809050Ctx.this.getOutputOtbndErrMsgTxt600();
     Sys207OutputIpmOtbndRec sys207OutputIpmOtbndRec = Ip809050Ctx.this.getSys207OutputIpmOtbndRec();
     Work work = Ip809050Ctx.this.getWork();
     Sys202OutputIpmOtbndRec sys202OutputIpmOtbndRec = Ip809050Ctx.this.getSys202OutputIpmOtbndRec();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     Sys201OutputIpmOtbndRec sys201OutputIpmOtbndRec = Ip809050Ctx.this.getSys201OutputIpmOtbndRec();
     Sys203OutputIpmOtbndRec sys203OutputIpmOtbndRec = Ip809050Ctx.this.getSys203OutputIpmOtbndRec();
     Sys205OutputIpmOtbndRec sys205OutputIpmOtbndRec = Ip809050Ctx.this.getSys205OutputIpmOtbndRec();
     Sys206OutputIpmOtbndRec sys206OutputIpmOtbndRec = Ip809050Ctx.this.getSys206OutputIpmOtbndRec();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();
     Sys204OutputIpmOtbndRec sys204OutputIpmOtbndRec = Ip809050Ctx.this.getSys204OutputIpmOtbndRec();

	/**
	 *	Test condition "00" for isSys201StatusGood88200()
	 *	@return  Returns true if isSys201StatusGood88200() is "00"
	 */
   public boolean isSys201StatusGood88200() throws CFException {
      return work.isSys201StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys201StatusGood88200True()  throws CFException{  			
    	work.setSys201StatusGood88200True();
   	}
	/**
	 *	Returns the value of outputOtbndFileStatus600
	 *	@return outputOtbndFileStatus600
	 */
   public char[] getOutputOtbndFileStatus600() throws CFException  {              
   		return outputOtbndErrMsgTxt600.getOutputOtbndFileStatus600();
   }

  
	/**
	*  set variable outputOtbndFileStatus600
	*  @param value
	**/
   public void setOutputOtbndFileStatus600(char[] value) throws CFException {
      outputOtbndErrMsgTxt600.setOutputOtbndFileStatus600(value);
   } 

     /**
	 * 	Update OutputOtbndFileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOutputOtbndFileStatus600(char[] source, int sourceIndex) throws CFException {
      outputOtbndErrMsgTxt600.setOutputOtbndFileStatus600(source, sourceIndex);
   	
   }
   
   public void setOutputOtbndFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      outputOtbndErrMsgTxt600.setOutputOtbndFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OutputOtbndFileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOutputOtbndFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      outputOtbndErrMsgTxt600.setOutputOtbndFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OutputOtbndFileStatus600 with another Field
	 *	@param value
	 */
   public void setOutputOtbndFileStatus600(Field source) {
      outputOtbndErrMsgTxt600.setOutputOtbndFileStatus600(source);
   }  
   
     /**
	 * 	Update OutputOtbndFileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOutputOtbndFileStatus600(Field source, int sourceIndex,int sourceLen) {
      outputOtbndErrMsgTxt600.setOutputOtbndFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OutputOtbndFileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOutputOtbndFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      outputOtbndErrMsgTxt600.setOutputOtbndFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isSys201IsOpen88100()
	 *	@return  Returns true if isSys201IsOpen88100() is "Y"
	 */
   public boolean isSys201IsOpen88100() throws CFException {
      return work.isSys201IsOpen88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setSys201IsOpen88100True()  throws CFException{  			
    	work.setSys201IsOpen88100True();
   	}
	/**
	 *	Test condition "00" for isSys204StatusGood88200()
	 *	@return  Returns true if isSys204StatusGood88200() is "00"
	 */
   public boolean isSys204StatusGood88200() throws CFException {
      return work.isSys204StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys204StatusGood88200True()  throws CFException{  			
    	work.setSys204StatusGood88200True();
   	}
	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of para1420300
	 *	@return para1420300
	 */
   public char[] getPara1420300() throws CFException  {              
   		return work.getPara1420300();
   }

  
	/**
	*  set variable para1420300
	*  @param value
	**/
   public void setPara1420300(char[] value) throws CFException {
      work.setPara1420300(value);
   } 

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of outputOtbndFileStatus207
	 *	@return outputOtbndFileStatus207
	 */
   public char[] getOutputOtbndFileStatus207() throws CFException  {              
   		return work.getOutputOtbndFileStatus207();
   }

  
	/**
	*  set variable outputOtbndFileStatus207
	*  @param value
	**/
   public void setOutputOtbndFileStatus207(char[] value) throws CFException {
      work.setOutputOtbndFileStatus207(value);
   } 

	/**
	 *	Test condition "00" for isSys206StatusGood88200()
	 *	@return  Returns true if isSys206StatusGood88200() is "00"
	 */
   public boolean isSys206StatusGood88200() throws CFException {
      return work.isSys206StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys206StatusGood88200True()  throws CFException{  			
    	work.setSys206StatusGood88200True();
   	}
	/**
	 *	Test condition "00" for isSys205StatusGood88200()
	 *	@return  Returns true if isSys205StatusGood88200() is "00"
	 */
   public boolean isSys205StatusGood88200() throws CFException {
      return work.isSys205StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys205StatusGood88200True()  throws CFException{  			
    	work.setSys205StatusGood88200True();
   	}
	/**
	 *	Test condition "ERROR OPENING OUTPUT IPM OUTBOUND FILE" for isOutputOpenErrTxt88600()
	 *	@return  Returns true if isOutputOpenErrTxt88600() is "ERROR OPENING OUTPUT IPM OUTBOUND FILE"
	 */
   public boolean isOutputOpenErrTxt88600() throws CFException {
      return outputOtbndErrMsgTxt600.isOutputOpenErrTxt88600();
   }

	/**
	*  set values "ERROR OPENING OUTPUT IPM OUTBOUND FILE"
	*/
   	public void setOutputOpenErrTxt88600True()  throws CFException{  			
    	outputOtbndErrMsgTxt600.setOutputOpenErrTxt88600True();
   	}
	/**
	 *	Test condition "00" for isSys202StatusGood88200()
	 *	@return  Returns true if isSys202StatusGood88200() is "00"
	 */
   public boolean isSys202StatusGood88200() throws CFException {
      return work.isSys202StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys202StatusGood88200True()  throws CFException{  			
    	work.setSys202StatusGood88200True();
   	}
	/**
	 *	Returns the value of outputOtbndErrMsgTxt600
	 *	@return outputOtbndErrMsgTxt600
	 */   
	 public OutputOtbndErrMsgTxt600 getOutputOtbndErrMsgTxt600() {
   	return outputOtbndErrMsgTxt600;
   }


	/**
	 *	Returns the value of outputOtbndFileStatus202
	 *	@return outputOtbndFileStatus202
	 */
   public char[] getOutputOtbndFileStatus202() throws CFException  {              
   		return work.getOutputOtbndFileStatus202();
   }

  
	/**
	*  set variable outputOtbndFileStatus202
	*  @param value
	**/
   public void setOutputOtbndFileStatus202(char[] value) throws CFException {
      work.setOutputOtbndFileStatus202(value);
   } 

	/**
	 *	Returns the value of outputOtbndFileStatus203
	 *	@return outputOtbndFileStatus203
	 */
   public char[] getOutputOtbndFileStatus203() throws CFException  {              
   		return work.getOutputOtbndFileStatus203();
   }

  
	/**
	*  set variable outputOtbndFileStatus203
	*  @param value
	**/
   public void setOutputOtbndFileStatus203(char[] value) throws CFException {
      work.setOutputOtbndFileStatus203(value);
   } 

	/**
	 *	Returns the value of sys201OpenAbendCode300
	 *	@return sys201OpenAbendCode300
	 */
   public char[] getSys201OpenAbendCode300() throws CFException  {              
   		return work.getSys201OpenAbendCode300();
   }

  
	/**
	*  set variable sys201OpenAbendCode300
	*  @param value
	**/
   public void setSys201OpenAbendCode300(char[] value) throws CFException {
      work.setSys201OpenAbendCode300(value);
   } 

	/**
	 *	Returns the value of outputOtbndFileStatus205
	 *	@return outputOtbndFileStatus205
	 */
   public char[] getOutputOtbndFileStatus205() throws CFException  {              
   		return work.getOutputOtbndFileStatus205();
   }

  
	/**
	*  set variable outputOtbndFileStatus205
	*  @param value
	**/
   public void setOutputOtbndFileStatus205(char[] value) throws CFException {
      work.setOutputOtbndFileStatus205(value);
   } 

	/**
	 *	Test condition "00" for isSys203StatusGood88200()
	 *	@return  Returns true if isSys203StatusGood88200() is "00"
	 */
   public boolean isSys203StatusGood88200() throws CFException {
      return work.isSys203StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys203StatusGood88200True()  throws CFException{  			
    	work.setSys203StatusGood88200True();
   	}
	/**
	 *	Returns the value of outputOtbndFileStatus206
	 *	@return outputOtbndFileStatus206
	 */
   public char[] getOutputOtbndFileStatus206() throws CFException  {              
   		return work.getOutputOtbndFileStatus206();
   }

  
	/**
	*  set variable outputOtbndFileStatus206
	*  @param value
	**/
   public void setOutputOtbndFileStatus206(char[] value) throws CFException {
      work.setOutputOtbndFileStatus206(value);
   } 

	/**
	 *	Returns the value of outputOtbndFileStatus204
	 *	@return outputOtbndFileStatus204
	 */
   public char[] getOutputOtbndFileStatus204() throws CFException  {              
   		return work.getOutputOtbndFileStatus204();
   }

  
	/**
	*  set variable outputOtbndFileStatus204
	*  @param value
	**/
   public void setOutputOtbndFileStatus204(char[] value) throws CFException {
      work.setOutputOtbndFileStatus204(value);
   } 

	/**
	 *	Test condition "00" for isSys207StatusGood88200()
	 *	@return  Returns true if isSys207StatusGood88200() is "00"
	 */
   public boolean isSys207StatusGood88200() throws CFException {
      return work.isSys207StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys207StatusGood88200True()  throws CFException{  			
    	work.setSys207StatusGood88200True();
   	}
	/**
	 *	Returns the value of outputOtbndFileStatus201
	 *	@return outputOtbndFileStatus201
	 */
   public char[] getOutputOtbndFileStatus201() throws CFException  {              
   		return work.getOutputOtbndFileStatus201();
   }

  
	/**
	*  set variable outputOtbndFileStatus201
	*  @param value
	**/
   public void setOutputOtbndFileStatus201(char[] value) throws CFException {
      work.setOutputOtbndFileStatus201(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += outputOtbndErrMsgTxt600.hashCode();
        str += sys207OutputIpmOtbndRec.hashCode();
        str += work.hashCode();
        str += sys202OutputIpmOtbndRec.hashCode();
        str += abendMessage900.hashCode();
        str += sys201OutputIpmOtbndRec.hashCode();
        str += sys203OutputIpmOtbndRec.hashCode();
        str += sys205OutputIpmOtbndRec.hashCode();
        str += sys206OutputIpmOtbndRec.hashCode();
        str += abendParaName900.hashCode();
        str += sys204OutputIpmOtbndRec.hashCode();
       return str.hashCode();
    }

    public OpenScrbOtbndFileOutCtx clone() {
        OpenScrbOtbndFileOutCtx cloneObj = new OpenScrbOtbndFileOutCtx();
        cloneObj.outputOtbndErrMsgTxt600 = new OutputOtbndErrMsgTxt600();
        cloneObj.outputOtbndErrMsgTxt600.set(outputOtbndErrMsgTxt600.getClonedField());
        cloneObj.sys207OutputIpmOtbndRec = new Sys207OutputIpmOtbndRec();
        cloneObj.sys207OutputIpmOtbndRec.set(sys207OutputIpmOtbndRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys202OutputIpmOtbndRec = new Sys202OutputIpmOtbndRec();
        cloneObj.sys202OutputIpmOtbndRec.set(sys202OutputIpmOtbndRec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.sys201OutputIpmOtbndRec = new Sys201OutputIpmOtbndRec();
        cloneObj.sys201OutputIpmOtbndRec.set(sys201OutputIpmOtbndRec.getClonedField());
        cloneObj.sys203OutputIpmOtbndRec = new Sys203OutputIpmOtbndRec();
        cloneObj.sys203OutputIpmOtbndRec.set(sys203OutputIpmOtbndRec.getClonedField());
        cloneObj.sys205OutputIpmOtbndRec = new Sys205OutputIpmOtbndRec();
        cloneObj.sys205OutputIpmOtbndRec.set(sys205OutputIpmOtbndRec.getClonedField());
        cloneObj.sys206OutputIpmOtbndRec = new Sys206OutputIpmOtbndRec();
        cloneObj.sys206OutputIpmOtbndRec.set(sys206OutputIpmOtbndRec.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.sys204OutputIpmOtbndRec = new Sys204OutputIpmOtbndRec();
        cloneObj.sys204OutputIpmOtbndRec.set(sys204OutputIpmOtbndRec.getClonedField());
        return cloneObj;
    }

    }

    public OpenScrbOtbndFileOutCtx getOpenScrbOtbndFileOutCtx() {
            return new OpenScrbOtbndFileOutCtx();
    }
     public class ProcessInputFileInCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();

	/**
	 *	Test condition "10" for isSys001EndOfFile88200()
	 *	@return  Returns true if isSys001EndOfFile88200() is "10"
	 */
   public boolean isSys001EndOfFile88200() throws CFException {
      return work.isSys001EndOfFile88200();
   }

	/**
	*  set values "10"
	*/
   	public void setSys001EndOfFile88200True()  throws CFException{  			
    	work.setSys001EndOfFile88200True();
   	}

        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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

    public ProcessInputFileInCtx clone() {
        ProcessInputFileInCtx cloneObj = new ProcessInputFileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInputFileInCtx getProcessInputFileInCtx() {
            return new ProcessInputFileInCtx();
    }
     public class CallReadParserInCtx implements Cloneable {
     SortKey800 sortKey800 = Ip809050Ctx.this.getSortKey800();
     Ip66102IpmMsg ip66102IpmMsg = Ip809050Ctx.this.getIp66102IpmMsg();
     Work work = Ip809050Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();
     Ip30671OutboundMessageArea ip30671OutboundMessageArea = Ip809050Ctx.this.getIp30671OutboundMessageArea();
     ReadParserErrMsgTxt600 readParserErrMsgTxt600 = Ip809050Ctx.this.getReadParserErrMsgTxt600();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip809050Ctx.this.getIp66102IpmFileInformation();

	/**
	 *	Returns the value of sortKey800
	 *	@return sortKey800
	 */   
	 public SortKey800 getSortKey800() {
   	return sortKey800;
   }


	/**
	 *	Returns the value of para2110300
	 *	@return para2110300
	 */
   public char[] getPara2110300() throws CFException  {              
   		return work.getPara2110300();
   }

  
	/**
	*  set variable para2110300
	*  @param value
	**/
   public void setPara2110300(char[] value) throws CFException {
      work.setPara2110300(value);
   } 

	/**
	 *	Returns the value of readParserAbendCode300
	 *	@return readParserAbendCode300
	 */
   public char[] getReadParserAbendCode300() throws CFException  {              
   		return work.getReadParserAbendCode300();
   }

  
	/**
	*  set variable readParserAbendCode300
	*  @param value
	**/
   public void setReadParserAbendCode300(char[] value) throws CFException {
      work.setReadParserAbendCode300(value);
   } 

	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of ptrIp662010800
	 *	@return ptrIp662010800
	 */
   public char[] getPtrIp662010800() throws CFException  {              
   		return work.getPtrIp662010800();
   }

  
	/**
	*  set variable ptrIp662010800
	*  @param value
	**/
   public void setPtrIp662010800(char[] value) throws CFException {
      work.setPtrIp662010800(value);
   } 

	/**
	 *	Returns the value of ip66102IpmMsgLngth
	 *	@return ip66102IpmMsgLngth
	 */
	public long getIp66102IpmMsgLngth() throws CFException {        
   		return ip66102IpmFileInformation.getIp66102IpmMsgLngth();
	}
	
	/**
	 * 	Update Ip66102IpmMsgLngth with the passed value
	 *	@param number
	 */
	public void setIp66102IpmMsgLngth(long number)  throws CFException{
		ip66102IpmFileInformation.setIp66102IpmMsgLngth(number);
	}



	/**
	 *	Returns the value of ip30671OutboundMessageArea
	 *	@return ip30671OutboundMessageArea
	 */   
	 public Ip30671OutboundMessageArea getIp30671OutboundMessageArea() {
   	return ip30671OutboundMessageArea;
   }


	/**
	 *	Returns the value of readParserErrMsgTxt600
	 *	@return readParserErrMsgTxt600
	 */   
	 public ReadParserErrMsgTxt600 getReadParserErrMsgTxt600() {
   	return readParserErrMsgTxt600;
   }


	/**
	 *	Returns the value of ipmOutbndUnscrubRdw400
	 *	@return ipmOutbndUnscrubRdw400
	 */
	public int getIpmOutbndUnscrubRdw400() throws CFException {        
   		return work.getIpmOutbndUnscrubRdw400();
	}
	
	/**
	 * 	Update IpmOutbndUnscrubRdw400 with the passed value
	 *	@param number
	 */
	public void setIpmOutbndUnscrubRdw400(int number)  throws CFException{
		work.setIpmOutbndUnscrubRdw400(number);
	}


	public void setIpmOutbndUnscrubRdw400(long number)  throws CFException{
		work.setIpmOutbndUnscrubRdw400((int)number);
	}


	/**
	 *	Returns the value of ip30671MessageArea
	 *	@return ip30671MessageArea
	 */
   public char[] getIp30671MessageArea() throws CFException  {              
   		return ip30671OutboundMessageArea.getIp30671MessageArea();
   }

  
	/**
	*  set variable ip30671MessageArea
	*  @param value
	**/
   public void setIp30671MessageArea(char[] value) throws CFException {
      ip30671OutboundMessageArea.setIp30671MessageArea(value);
   } 

     /**
	 * 	Update Ip30671MessageArea 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30671MessageArea(char[] source, int sourceIndex) throws CFException {
      ip30671OutboundMessageArea.setIp30671MessageArea(source, sourceIndex);
   	
   }
   
   public void setIp30671MessageArea(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip30671OutboundMessageArea.setIp30671MessageArea(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip30671MessageArea 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30671MessageArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip30671OutboundMessageArea.setIp30671MessageArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip30671MessageArea with another Field
	 *	@param value
	 */
   public void setIp30671MessageArea(Field source) {
      ip30671OutboundMessageArea.setIp30671MessageArea(source);
   }  
   
     /**
	 * 	Update Ip30671MessageArea 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30671MessageArea(Field source, int sourceIndex,int sourceLen) {
      ip30671OutboundMessageArea.setIp30671MessageArea(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip30671MessageArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30671MessageArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip30671OutboundMessageArea.setIp30671MessageArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public CallReadParserOutCtx getCallReadParserOutCtx() {
            return new CallReadParserOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sortKey800.hashCode();
        str += ip66102IpmMsg.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += ip30671OutboundMessageArea.hashCode();
        str += readParserErrMsgTxt600.hashCode();
        str += ip66102IpmFileInformation.hashCode();
       return str.hashCode();
    }

    public CallReadParserInCtx clone() {
        CallReadParserInCtx cloneObj = new CallReadParserInCtx();
        cloneObj.sortKey800 = new SortKey800();
        cloneObj.sortKey800.set(sortKey800.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip30671OutboundMessageArea = new Ip30671OutboundMessageArea();
        cloneObj.ip30671OutboundMessageArea.set(ip30671OutboundMessageArea.getClonedField());
        cloneObj.readParserErrMsgTxt600 = new ReadParserErrMsgTxt600();
        cloneObj.readParserErrMsgTxt600.set(readParserErrMsgTxt600.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        return cloneObj;
    }

    }

    public CallReadParserInCtx getCallReadParserInCtx() {
            return new CallReadParserInCtx();
    }
     public class CallReadParserOutCtx implements Cloneable {
     Ip66102IpmMsg ip66102IpmMsg = Ip809050Ctx.this.getIp66102IpmMsg();
     Work work = Ip809050Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();
     Ip30671OutboundMessageArea ip30671OutboundMessageArea = Ip809050Ctx.this.getIp30671OutboundMessageArea();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip809050Ctx.this.getIp66102IpmFileInformation();
     ReadParserErrMsgTxt600 readParserErrMsgTxt600 = Ip809050Ctx.this.getReadParserErrMsgTxt600();

	/**
	 *	Returns the value of readParserAbendCode300
	 *	@return readParserAbendCode300
	 */
   public char[] getReadParserAbendCode300() throws CFException  {              
   		return work.getReadParserAbendCode300();
   }

  
	/**
	*  set variable readParserAbendCode300
	*  @param value
	**/
   public void setReadParserAbendCode300(char[] value) throws CFException {
      work.setReadParserAbendCode300(value);
   } 

	/**
	 *	Test condition "RR" for isIp66102RecordAlreadyRead()
	 *	@return  Returns true if isIp66102RecordAlreadyRead() is "RR"
	 */
   public boolean isIp66102RecordAlreadyRead() throws CFException {
      return ip66102IpmFileInformation.isIp66102RecordAlreadyRead();
   }

	/**
	*  set values "RR"
	*/
   	public void setIp66102RecordAlreadyReadTrue()  throws CFException{  			
    	ip66102IpmFileInformation.setIp66102RecordAlreadyReadTrue();
   	}
	/**
	 *	Returns the value of ip66102NormalIpmMsg
	 *	@return ip66102NormalIpmMsg
	 */   
	 public Ip66102NormalIpmMsg getIp66102NormalIpmMsg() {
   	return ip66102IpmMsg.getIp66102NormalIpmMsg();
   }

   /**
	* 	Update Ip66102NormalIpmMsg with the passed value
	*	@param value
	*/
   public void setIp66102NormalIpmMsg(char[] value) throws CFException {
      ip66102IpmMsg.setIp66102NormalIpmMsg(value);
   }   

     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102NormalIpmMsg with another Field
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(Field source) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source);
   }  
   
     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(Field source, int sourceIndex,int sourceLen) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "ERROR IN PARSING IPM MESSAGE USING READ PARSER" for isReadParserErrTxt88600()
	 *	@return  Returns true if isReadParserErrTxt88600() is "ERROR IN PARSING IPM MESSAGE USING READ PARSER"
	 */
   public boolean isReadParserErrTxt88600() throws CFException {
      return readParserErrMsgTxt600.isReadParserErrTxt88600();
   }

	/**
	*  set values "ERROR IN PARSING IPM MESSAGE USING READ PARSER"
	*/
   	public void setReadParserErrTxt88600True()  throws CFException{  			
    	readParserErrMsgTxt600.setReadParserErrTxt88600True();
   	}
	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of readParserReturnCode600
	 *	@return readParserReturnCode600
	 */
   public char[] getReadParserReturnCode600() throws CFException  {              
   		return readParserErrMsgTxt600.getReadParserReturnCode600();
   }

  
	/**
	*  set variable readParserReturnCode600
	*  @param value
	**/
   public void setReadParserReturnCode600(char[] value) throws CFException {
      readParserErrMsgTxt600.setReadParserReturnCode600(value);
   } 

     /**
	 * 	Update ReadParserReturnCode600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReadParserReturnCode600(char[] source, int sourceIndex) throws CFException {
      readParserErrMsgTxt600.setReadParserReturnCode600(source, sourceIndex);
   	
   }
   
   public void setReadParserReturnCode600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      readParserErrMsgTxt600.setReadParserReturnCode600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ReadParserReturnCode600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReadParserReturnCode600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      readParserErrMsgTxt600.setReadParserReturnCode600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ReadParserReturnCode600 with another Field
	 *	@param value
	 */
   public void setReadParserReturnCode600(Field source) {
      readParserErrMsgTxt600.setReadParserReturnCode600(source);
   }  
   
     /**
	 * 	Update ReadParserReturnCode600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReadParserReturnCode600(Field source, int sourceIndex,int sourceLen) {
      readParserErrMsgTxt600.setReadParserReturnCode600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ReadParserReturnCode600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReadParserReturnCode600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      readParserErrMsgTxt600.setReadParserReturnCode600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip30671MessageArea
	 *	@return ip30671MessageArea
	 */
   public char[] getIp30671MessageArea() throws CFException  {              
   		return ip30671OutboundMessageArea.getIp30671MessageArea();
   }

  
	/**
	*  set variable ip30671MessageArea
	*  @param value
	**/
   public void setIp30671MessageArea(char[] value) throws CFException {
      ip30671OutboundMessageArea.setIp30671MessageArea(value);
   } 

     /**
	 * 	Update Ip30671MessageArea 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30671MessageArea(char[] source, int sourceIndex) throws CFException {
      ip30671OutboundMessageArea.setIp30671MessageArea(source, sourceIndex);
   	
   }
   
   public void setIp30671MessageArea(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip30671OutboundMessageArea.setIp30671MessageArea(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip30671MessageArea 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30671MessageArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip30671OutboundMessageArea.setIp30671MessageArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip30671MessageArea with another Field
	 *	@param value
	 */
   public void setIp30671MessageArea(Field source) {
      ip30671OutboundMessageArea.setIp30671MessageArea(source);
   }  
   
     /**
	 * 	Update Ip30671MessageArea 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30671MessageArea(Field source, int sourceIndex,int sourceLen) {
      ip30671OutboundMessageArea.setIp30671MessageArea(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip30671MessageArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30671MessageArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip30671OutboundMessageArea.setIp30671MessageArea(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of para2110300
	 *	@return para2110300
	 */
   public char[] getPara2110300() throws CFException  {              
   		return work.getPara2110300();
   }

  
	/**
	*  set variable para2110300
	*  @param value
	**/
   public void setPara2110300(char[] value) throws CFException {
      work.setPara2110300(value);
   } 

	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of ip66102IpmMsgLngth
	 *	@return ip66102IpmMsgLngth
	 */
	public long getIp66102IpmMsgLngth() throws CFException {        
   		return ip66102IpmFileInformation.getIp66102IpmMsgLngth();
	}
	
	/**
	 * 	Update Ip66102IpmMsgLngth with the passed value
	 *	@param number
	 */
	public void setIp66102IpmMsgLngth(long number)  throws CFException{
		ip66102IpmFileInformation.setIp66102IpmMsgLngth(number);
	}



	/**
	 *	Returns the value of readParserErrMsgTxt600
	 *	@return readParserErrMsgTxt600
	 */   
	 public ReadParserErrMsgTxt600 getReadParserErrMsgTxt600() {
   	return readParserErrMsgTxt600;
   }


	/**
	 *	Returns the value of sortKeyLength800
	 *	@return sortKeyLength800
	 */
	public int getSortKeyLength800() throws CFException {
   		return work.getSortKeyLength800();
	}


	/**
	 *	Returns String value of sortKeyLength800
	 *	@return sortKeyLength800
	 */
	public char[]  getSortKeyLength800String() throws CFException {
	     return String.valueOf(work.getSortKeyLength800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sortKeyLength800IsNumeric()  throws CFException{
	    return work.sortKeyLength800IsNumeric();
	}

	/**
	 * 	Update SortKeyLength800 with the passed value
	 *	@param number
	 */
	public void setSortKeyLength800(int number)  throws CFException{
		work.setSortKeyLength800(number);
	}
	

	public void setSortKeyLength800(long number)  throws CFException{
	    work.setSortKeyLength800(number);
	}
	
	
	/**
	 * 	Update SortKeyLength800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSortKeyLength800(char[] value)  throws CFException {
		work.setSortKeyLength800(value);
	}
	
	/**
	 * 	Update SortKeyLength800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSortKeyLength800String(char[] value)  throws CFException{
		work.setSortKeyLength800(value);
	}	


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmMsg.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += ip30671OutboundMessageArea.hashCode();
        str += ip66102IpmFileInformation.hashCode();
        str += readParserErrMsgTxt600.hashCode();
       return str.hashCode();
    }

    public CallReadParserOutCtx clone() {
        CallReadParserOutCtx cloneObj = new CallReadParserOutCtx();
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip30671OutboundMessageArea = new Ip30671OutboundMessageArea();
        cloneObj.ip30671OutboundMessageArea.set(ip30671OutboundMessageArea.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.readParserErrMsgTxt600 = new ReadParserErrMsgTxt600();
        cloneObj.readParserErrMsgTxt600.set(readParserErrMsgTxt600.getClonedField());
        return cloneObj;
    }

    }

    public CallReadParserOutCtx getCallReadParserOutCtx() {
            return new CallReadParserOutCtx();
    }
     public class ProcessOutputOtbndFileInCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();

	/**
	 *	Test condition "Y" for isWrite5Y88800()
	 *	@return  Returns true if isWrite5Y88800() is "Y"
	 */
   public boolean isWrite5Y88800() throws CFException {
      return work.isWrite5Y88800();
   }

	/**
	*  set values "Y"
	*/
   	public void setWrite5Y88800True()  throws CFException{  			
    	work.setWrite5Y88800True();
   	}
	/**
	 *	Test condition "Y" for isWrite7Y88800()
	 *	@return  Returns true if isWrite7Y88800() is "Y"
	 */
   public boolean isWrite7Y88800() throws CFException {
      return work.isWrite7Y88800();
   }

	/**
	*  set values "Y"
	*/
   	public void setWrite7Y88800True()  throws CFException{  			
    	work.setWrite7Y88800True();
   	}
	/**
	 *	Test condition "Y" for isWrite1Y88800()
	 *	@return  Returns true if isWrite1Y88800() is "Y"
	 */
   public boolean isWrite1Y88800() throws CFException {
      return work.isWrite1Y88800();
   }

	/**
	*  set values "Y"
	*/
   	public void setWrite1Y88800True()  throws CFException{  			
    	work.setWrite1Y88800True();
   	}
	/**
	 *	Test condition "Y" for isWrite6Y88800()
	 *	@return  Returns true if isWrite6Y88800() is "Y"
	 */
   public boolean isWrite6Y88800() throws CFException {
      return work.isWrite6Y88800();
   }

	/**
	*  set values "Y"
	*/
   	public void setWrite6Y88800True()  throws CFException{  			
    	work.setWrite6Y88800True();
   	}
	/**
	 *	Test condition "Y" for isWrite3Y88800()
	 *	@return  Returns true if isWrite3Y88800() is "Y"
	 */
   public boolean isWrite3Y88800() throws CFException {
      return work.isWrite3Y88800();
   }

	/**
	*  set values "Y"
	*/
   	public void setWrite3Y88800True()  throws CFException{  			
    	work.setWrite3Y88800True();
   	}
	/**
	 *	Test condition "Y" for isWrite2Y88800()
	 *	@return  Returns true if isWrite2Y88800() is "Y"
	 */
   public boolean isWrite2Y88800() throws CFException {
      return work.isWrite2Y88800();
   }

	/**
	*  set values "Y"
	*/
   	public void setWrite2Y88800True()  throws CFException{  			
    	work.setWrite2Y88800True();
   	}
	/**
	 *	Test condition "Y" for isWrite4Y88800()
	 *	@return  Returns true if isWrite4Y88800() is "Y"
	 */
   public boolean isWrite4Y88800() throws CFException {
      return work.isWrite4Y88800();
   }

	/**
	*  set values "Y"
	*/
   	public void setWrite4Y88800True()  throws CFException{  			
    	work.setWrite4Y88800True();
   	}

        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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

    public ProcessOutputOtbndFileInCtx clone() {
        ProcessOutputOtbndFileInCtx cloneObj = new ProcessOutputOtbndFileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutputOtbndFileInCtx getProcessOutputOtbndFileInCtx() {
            return new ProcessOutputOtbndFileInCtx();
    }
     public class CheckActivityInCtx implements Cloneable {
     AmtE1754TemGroup800 amtE1754TemGroup800 = Ip809050Ctx.this.getAmtE1754TemGroup800();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip809050Ctx.this.getIp65504DeMapGroup();
     Pds05DataGroup800 pds05DataGroup800 = Ip809050Ctx.this.getPds05DataGroup800();
     AmtE1852TemGroup800 amtE1852TemGroup800 = Ip809050Ctx.this.getAmtE1852TemGroup800();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip809050Ctx.this.getIp65504PdsMapGroup();
     Ip66102IpmMsg ip66102IpmMsg = Ip809050Ctx.this.getIp66102IpmMsg();
     L1CtlValues800 l1CtlValues800 = Ip809050Ctx.this.getL1CtlValues800();
     Work work = Ip809050Ctx.this.getWork();
     AmtE1848TemGroup800 amtE1848TemGroup800 = Ip809050Ctx.this.getAmtE1848TemGroup800();
     AmtE1851TemGroup800 amtE1851TemGroup800 = Ip809050Ctx.this.getAmtE1851TemGroup800();
     Ip65504SelPdsEntriesAll ip65504SelPdsEntriesAll = Ip809050Ctx.this.getIp65504SelPdsEntriesAll();
     AmtE1850TemGroup800 amtE1850TemGroup800 = Ip809050Ctx.this.getAmtE1850TemGroup800();
     AmtE1750TemGroup800 amtE1750TemGroup800 = Ip809050Ctx.this.getAmtE1750TemGroup800();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();
     AmtE1849TemGroup800 amtE1849TemGroup800 = Ip809050Ctx.this.getAmtE1849TemGroup800();
     Pds841ValuesGroup800 pds841ValuesGroup800 = Ip809050Ctx.this.getPds841ValuesGroup800();

	/**
	 *	Returns the value of ip65504P005MsgeridS
	 *	@return ip65504P005MsgeridS
	 */
	public short getIp65504P005MsgeridS() throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup1().getIp65504P005MsgeridS();
	}
	
	/**
	 * 	Update Ip65504P005MsgeridS with the passed value
	 *	@param number
	 */
	public void setIp65504P005MsgeridS(short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup1().setIp65504P005MsgeridS(number);
	}

	public void setIp65504P005MsgeridS(int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup1().setIp65504P005MsgeridS((short)number);
	}

	public void setIp65504P005MsgeridS(long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup1().setIp65504P005MsgeridS((short)number);
	}



	/**
	 *	Returns the value of desc28001754
	 *	@return desc28001754
	 */
   public char[] getDesc28001754() throws CFException  {              
   		return work.getDesc28001754();
   }

  
	/**
	*  set variable desc28001754
	*  @param value
	**/
   public void setDesc28001754(char[] value) throws CFException {
      work.setDesc28001754(value);
   } 

	/**
	 *	Returns the value of amtE1852800
	 *	@return amtE1852800
	 */
	public long getAmtE1852800() throws CFException {
   		return work.getAmtE1852800();
	}


	/**
	 *	Returns String value of amtE1852800
	 *	@return amtE1852800
	 */
	public char[]  getAmtE1852800String() throws CFException {
	     return String.valueOf(work.getAmtE1852800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1852800IsNumeric()  throws CFException{
	    return work.amtE1852800IsNumeric();
	}

	/**
	 * 	Update AmtE1852800 with the passed value
	 *	@param number
	 */
	public void setAmtE1852800(long number)  throws CFException{
		work.setAmtE1852800(number);
	}
	

	
	/**
	 * 	Update AmtE1852800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1852800(char[] value)  throws CFException {
		work.setAmtE1852800(value);
	}
	
	/**
	 * 	Update AmtE1852800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1852800String(char[] value)  throws CFException{
		work.setAmtE1852800(value);
	}	

	/**
	 *	Returns the value of ip65504P165SetlIdL
	 *	@return ip65504P165SetlIdL
	 */
	public short getIp65504P165SetlIdL() throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup6().getIp65504P165SetlIdL();
	}
	
	/**
	 * 	Update Ip65504P165SetlIdL with the passed value
	 *	@param number
	 */
	public void setIp65504P165SetlIdL(short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup6().setIp65504P165SetlIdL(number);
	}

	public void setIp65504P165SetlIdL(int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup6().setIp65504P165SetlIdL((short)number);
	}

	public void setIp65504P165SetlIdL(long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup6().setIp65504P165SetlIdL((short)number);
	}



	/**
	 *	Returns the value of ip66102NormalIpmMsg
	 *	@return ip66102NormalIpmMsg
	 */   
	 public Ip66102NormalIpmMsg getIp66102NormalIpmMsg() {
   	return ip66102IpmMsg.getIp66102NormalIpmMsg();
   }

   /**
	* 	Update Ip66102NormalIpmMsg with the passed value
	*	@param value
	*/
   public void setIp66102NormalIpmMsg(char[] value) throws CFException {
      ip66102IpmMsg.setIp66102NormalIpmMsg(value);
   }   

     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102NormalIpmMsg with another Field
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(Field source) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source);
   }  
   
     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(Field source, int sourceIndex,int sourceLen) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504D24FuncCdL
	 *	@return ip65504D24FuncCdL
	 */
	public short getIp65504D24FuncCdL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D24FuncCdL();
	}
	
	/**
	 * 	Update Ip65504D24FuncCdL with the passed value
	 *	@param number
	 */
	public void setIp65504D24FuncCdL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D24FuncCdL(number);
	}

	public void setIp65504D24FuncCdL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D24FuncCdL((short)number);
	}

	public void setIp65504D24FuncCdL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D24FuncCdL((short)number);
	}



	/**
	 *	Returns the value of desc18001848
	 *	@return desc18001848
	 */
   public char[] getDesc18001848() throws CFException  {              
   		return work.getDesc18001848();
   }

  
	/**
	*  set variable desc18001848
	*  @param value
	**/
   public void setDesc18001848(char[] value) throws CFException {
      work.setDesc18001848(value);
   } 

	/**
	 *	Returns the value of transAmount800
	 *	@return transAmount800
	 */
	public long getTransAmount800() throws CFException {
   		return work.getTransAmount800();
	}


	/**
	 *	Returns String value of transAmount800
	 *	@return transAmount800
	 */
	public char[]  getTransAmount800String() throws CFException {
	     return String.valueOf(work.getTransAmount800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean transAmount800IsNumeric()  throws CFException{
	    return work.transAmount800IsNumeric();
	}

	/**
	 * 	Update TransAmount800 with the passed value
	 *	@param number
	 */
	public void setTransAmount800(long number)  throws CFException{
		work.setTransAmount800(number);
	}
	

	
	/**
	 * 	Update TransAmount800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTransAmount800(char[] value)  throws CFException {
		work.setTransAmount800(value);
	}
	
	/**
	 * 	Update TransAmount800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTransAmount800String(char[] value)  throws CFException{
		work.setTransAmount800(value);
	}	

	/**
	 *	Returns the value of desc18001851
	 *	@return desc18001851
	 */
   public char[] getDesc18001851() throws CFException  {              
   		return work.getDesc18001851();
   }

  
	/**
	*  set variable desc18001851
	*  @param value
	**/
   public void setDesc18001851(char[] value) throws CFException {
      work.setDesc18001851(value);
   } 

	/**
	 *	Returns the value of amtE1848800
	 *	@return amtE1848800
	 */
	public long getAmtE1848800() throws CFException {
   		return work.getAmtE1848800();
	}


	/**
	 *	Returns String value of amtE1848800
	 *	@return amtE1848800
	 */
	public char[]  getAmtE1848800String() throws CFException {
	     return String.valueOf(work.getAmtE1848800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1848800IsNumeric()  throws CFException{
	    return work.amtE1848800IsNumeric();
	}

	/**
	 * 	Update AmtE1848800 with the passed value
	 *	@param number
	 */
	public void setAmtE1848800(long number)  throws CFException{
		work.setAmtE1848800(number);
	}
	

	
	/**
	 * 	Update AmtE1848800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1848800(char[] value)  throws CFException {
		work.setAmtE1848800(value);
	}
	
	/**
	 * 	Update AmtE1848800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1848800String(char[] value)  throws CFException{
		work.setAmtE1848800(value);
	}	

	/**
	 *	Returns the value of valueX300
	 *	@return valueX300
	 */
   public char[] getValueX300() throws CFException  {              
   		return work.getValueX300();
   }

  
	/**
	*  set variable valueX300
	*  @param value
	**/
   public void setValueX300(char[] value) throws CFException {
      work.setValueX300(value);
   } 

	/**
	 *	Returns the value of desc18001850
	 *	@return desc18001850
	 */
   public char[] getDesc18001850() throws CFException  {              
   		return work.getDesc18001850();
   }

  
	/**
	*  set variable desc18001850
	*  @param value
	**/
   public void setDesc18001850(char[] value) throws CFException {
      work.setDesc18001850(value);
   } 

	/**
	 *	Returns the value of l1CtlValues800
	 *	@return l1CtlValues800
	 */   
	 public L1CtlValues800 getL1CtlValues800() {
   	return l1CtlValues800;
   }


	/**
	 *	Test condition "1851" for isPds8411851Y88800()
	 *	@return  Returns true if isPds8411851Y88800() is "1851"
	 */
   public boolean isPds8411851Y88800() throws CFException {
      return pds841ValuesGroup800.getPds841800().isPds8411851Y88800();
   }

	/**
	*  set values "1851"
	*/
   	public void setPds8411851Y88800True()  throws CFException{  			
    	pds841ValuesGroup800.getPds841800().setPds8411851Y88800True();
   	}
	/**
	 *	Test condition "1850" for isPds8411850Y88800()
	 *	@return  Returns true if isPds8411850Y88800() is "1850"
	 */
   public boolean isPds8411850Y88800() throws CFException {
      return pds841ValuesGroup800.getPds841800().isPds8411850Y88800();
   }

	/**
	*  set values "1850"
	*/
   	public void setPds8411850Y88800True()  throws CFException{  			
    	pds841ValuesGroup800.getPds841800().setPds8411850Y88800True();
   	}
	/**
	 *	Returns the value of ip65504P841ReservdS
	 *	@return ip65504P841ReservdS
	 */
	public short getIp65504P841ReservdS() throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup28().getIp65504P841ReservdS();
	}
	
	/**
	 * 	Update Ip65504P841ReservdS with the passed value
	 *	@param number
	 */
	public void setIp65504P841ReservdS(short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup28().setIp65504P841ReservdS(number);
	}

	public void setIp65504P841ReservdS(int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup28().setIp65504P841ReservdS((short)number);
	}

	public void setIp65504P841ReservdS(long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup28().setIp65504P841ReservdS((short)number);
	}



	/**
	 *	Returns the value of desc28001850
	 *	@return desc28001850
	 */
   public char[] getDesc28001850() throws CFException  {              
   		return work.getDesc28001850();
   }

  
	/**
	*  set variable desc28001850
	*  @param value
	**/
   public void setDesc28001850(char[] value) throws CFException {
      work.setDesc28001850(value);
   } 

	/**
	 *	Test condition "1750" for isPds8411750Y88800()
	 *	@return  Returns true if isPds8411750Y88800() is "1750"
	 */
   public boolean isPds8411750Y88800() throws CFException {
      return pds841ValuesGroup800.getPds841800().isPds8411750Y88800();
   }

	/**
	*  set values "1750"
	*/
   	public void setPds8411750Y88800True()  throws CFException{  			
    	pds841ValuesGroup800.getPds841800().setPds8411750Y88800True();
   	}
	/**
	 *	Returns the value of ip65504D24FuncCdS
	 *	@return ip65504D24FuncCdS
	 */
	public short getIp65504D24FuncCdS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D24FuncCdS();
	}
	
	/**
	 * 	Update Ip65504D24FuncCdS with the passed value
	 *	@param number
	 */
	public void setIp65504D24FuncCdS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D24FuncCdS(number);
	}

	public void setIp65504D24FuncCdS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D24FuncCdS((short)number);
	}

	public void setIp65504D24FuncCdS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D24FuncCdS((short)number);
	}



	/**
	 *	Returns the value of desc18001852
	 *	@return desc18001852
	 */
   public char[] getDesc18001852() throws CFException  {              
   		return work.getDesc18001852();
   }

  
	/**
	*  set variable desc18001852
	*  @param value
	**/
   public void setDesc18001852(char[] value) throws CFException {
      work.setDesc18001852(value);
   } 

	/**
	 *	Returns the value of desc18001754
	 *	@return desc18001754
	 */
   public char[] getDesc18001754() throws CFException  {              
   		return work.getDesc18001754();
   }

  
	/**
	*  set variable desc18001754
	*  @param value
	**/
   public void setDesc18001754(char[] value) throws CFException {
      work.setDesc18001754(value);
   } 

	/**
	 *	Returns the value of tranAmt800
	 *	@return tranAmt800
	 */
	public long getTranAmt800() throws CFException {
   		return work.getTranAmt800();
	}


	/**
	 *	Returns String value of tranAmt800
	 *	@return tranAmt800
	 */
	public char[]  getTranAmt800String() throws CFException {
	     return String.valueOf(work.getTranAmt800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranAmt800IsNumeric()  throws CFException{
	    return work.tranAmt800IsNumeric();
	}

	/**
	 * 	Update TranAmt800 with the passed value
	 *	@param number
	 */
	public void setTranAmt800(long number)  throws CFException{
		work.setTranAmt800(number);
	}
	

	
	/**
	 * 	Update TranAmt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranAmt800(char[] value)  throws CFException {
		work.setTranAmt800(value);
	}
	
	/**
	 * 	Update TranAmt800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranAmt800String(char[] value)  throws CFException{
		work.setTranAmt800(value);
	}	

	/**
	 *	Test condition "1848" for isPds8411848Y88800()
	 *	@return  Returns true if isPds8411848Y88800() is "1848"
	 */
   public boolean isPds8411848Y88800() throws CFException {
      return pds841ValuesGroup800.getPds841800().isPds8411848Y88800();
   }

	/**
	*  set values "1848"
	*/
   	public void setPds8411848Y88800True()  throws CFException{  			
    	pds841ValuesGroup800.getPds841800().setPds8411848Y88800True();
   	}
	/**
	 *	Returns the value of desc28001750
	 *	@return desc28001750
	 */
   public char[] getDesc28001750() throws CFException  {              
   		return work.getDesc28001750();
   }

  
	/**
	*  set variable desc28001750
	*  @param value
	**/
   public void setDesc28001750(char[] value) throws CFException {
      work.setDesc28001750(value);
   } 

	/**
	 *	Returns the value of ip65504P165SetlIdS
	 *	@return ip65504P165SetlIdS
	 */
	public short getIp65504P165SetlIdS() throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup6().getIp65504P165SetlIdS();
	}
	
	/**
	 * 	Update Ip65504P165SetlIdS with the passed value
	 *	@param number
	 */
	public void setIp65504P165SetlIdS(short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup6().setIp65504P165SetlIdS(number);
	}

	public void setIp65504P165SetlIdS(int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup6().setIp65504P165SetlIdS((short)number);
	}

	public void setIp65504P165SetlIdS(long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup6().setIp65504P165SetlIdS((short)number);
	}



	/**
	 *	Returns the value of pds005S3ErrCde800
	 *	@return pds005S3ErrCde800
	 */
   public char[] getPds005S3ErrCde800(int index) throws CFException  {              
   		return pds05DataGroup800.getPds05800(index).getPds005S3ErrCde800();
   }

  
	/**
	*  set variable pds005S3ErrCde800
	*  @param value
	**/
   public void setPds005S3ErrCde800(int index,char[] value) throws CFException {
      pds05DataGroup800.getPds05800(index).setPds005S3ErrCde800(value);
   } 

     /**
	 * 	Update Pds005S3ErrCde800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds005S3ErrCde800(int index,char[] source, int sourceIndex) throws CFException {
      pds05DataGroup800.getPds05800(index).setPds005S3ErrCde800(source, sourceIndex);
   	
   }
   
   public void setPds005S3ErrCde800(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds05DataGroup800.getPds05800(index).setPds005S3ErrCde800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Pds005S3ErrCde800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds005S3ErrCde800(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds05DataGroup800.getPds05800(index).setPds005S3ErrCde800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Pds005S3ErrCde800 with another Field
	 *	@param value
	 */
   public void setPds005S3ErrCde800(int index,Field source) {
      pds05DataGroup800.getPds05800(index).setPds005S3ErrCde800(source);
   }  
   
     /**
	 * 	Update Pds005S3ErrCde800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds005S3ErrCde800(int index,Field source, int sourceIndex,int sourceLen) {
      pds05DataGroup800.getPds05800(index).setPds005S3ErrCde800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Pds005S3ErrCde800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds005S3ErrCde800(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds05DataGroup800.getPds05800(index).setPds005S3ErrCde800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504P005MsgeridL
	 *	@return ip65504P005MsgeridL
	 */
	public short getIp65504P005MsgeridL() throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup1().getIp65504P005MsgeridL();
	}
	
	/**
	 * 	Update Ip65504P005MsgeridL with the passed value
	 *	@param number
	 */
	public void setIp65504P005MsgeridL(short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup1().setIp65504P005MsgeridL(number);
	}

	public void setIp65504P005MsgeridL(int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup1().setIp65504P005MsgeridL((short)number);
	}

	public void setIp65504P005MsgeridL(long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup1().setIp65504P005MsgeridL((short)number);
	}



	/**
	 *	Test condition "1754" for isPds8411754Y88800()
	 *	@return  Returns true if isPds8411754Y88800() is "1754"
	 */
   public boolean isPds8411754Y88800() throws CFException {
      return pds841ValuesGroup800.getPds841800().isPds8411754Y88800();
   }

	/**
	*  set values "1754"
	*/
   	public void setPds8411754Y88800True()  throws CFException{  			
    	pds841ValuesGroup800.getPds841800().setPds8411754Y88800True();
   	}
	/**
	 *	Test condition "1849" for isPds8411849Y88800()
	 *	@return  Returns true if isPds8411849Y88800() is "1849"
	 */
   public boolean isPds8411849Y88800() throws CFException {
      return pds841ValuesGroup800.getPds841800().isPds8411849Y88800();
   }

	/**
	*  set values "1849"
	*/
   	public void setPds8411849Y88800True()  throws CFException{  			
    	pds841ValuesGroup800.getPds841800().setPds8411849Y88800True();
   	}
	/**
	 *	Returns the value of pds05DataGroup800
	 *	@return pds05DataGroup800
	 */   
	 public Pds05DataGroup800 getPds05DataGroup800() {
   	return pds05DataGroup800;
   }


	/**
	 *	Returns the value of ip65504SelPdsEnt
	 *	@return ip65504SelPdsEnt
	 */
   public char[] getIp65504SelPdsEnt(int index) throws CFException  {              
   		return ip65504SelPdsEntriesAll.getIp65504SelPdsEnt(index);
   }

  
	/**
	*  set variable ip65504SelPdsEnt
	*  @param value
	**/
   public void setIp65504SelPdsEnt(int index,char[] value) throws CFException {
      ip65504SelPdsEntriesAll.setIp65504SelPdsEnt((index),value);
   } 

	/**
	 *	Returns the value of amtE1750800
	 *	@return amtE1750800
	 */
	public long getAmtE1750800() throws CFException {
   		return work.getAmtE1750800();
	}


	/**
	 *	Returns String value of amtE1750800
	 *	@return amtE1750800
	 */
	public char[]  getAmtE1750800String() throws CFException {
	     return String.valueOf(work.getAmtE1750800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1750800IsNumeric()  throws CFException{
	    return work.amtE1750800IsNumeric();
	}

	/**
	 * 	Update AmtE1750800 with the passed value
	 *	@param number
	 */
	public void setAmtE1750800(long number)  throws CFException{
		work.setAmtE1750800(number);
	}
	

	
	/**
	 * 	Update AmtE1750800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1750800(char[] value)  throws CFException {
		work.setAmtE1750800(value);
	}
	
	/**
	 * 	Update AmtE1750800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1750800String(char[] value)  throws CFException{
		work.setAmtE1750800(value);
	}	

	/**
	 *	Returns the value of desc18001849
	 *	@return desc18001849
	 */
   public char[] getDesc18001849() throws CFException  {              
   		return work.getDesc18001849();
   }

  
	/**
	*  set variable desc18001849
	*  @param value
	**/
   public void setDesc18001849(char[] value) throws CFException {
      work.setDesc18001849(value);
   } 

	/**
	 *	Returns the value of amtE1849800
	 *	@return amtE1849800
	 */
	public long getAmtE1849800() throws CFException {
   		return work.getAmtE1849800();
	}


	/**
	 *	Returns String value of amtE1849800
	 *	@return amtE1849800
	 */
	public char[]  getAmtE1849800String() throws CFException {
	     return String.valueOf(work.getAmtE1849800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1849800IsNumeric()  throws CFException{
	    return work.amtE1849800IsNumeric();
	}

	/**
	 * 	Update AmtE1849800 with the passed value
	 *	@param number
	 */
	public void setAmtE1849800(long number)  throws CFException{
		work.setAmtE1849800(number);
	}
	

	
	/**
	 * 	Update AmtE1849800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1849800(char[] value)  throws CFException {
		work.setAmtE1849800(value);
	}
	
	/**
	 * 	Update AmtE1849800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1849800String(char[] value)  throws CFException{
		work.setAmtE1849800(value);
	}	

	/**
	 *	Returns the value of desc28001849
	 *	@return desc28001849
	 */
   public char[] getDesc28001849() throws CFException  {              
   		return work.getDesc28001849();
   }

  
	/**
	*  set variable desc28001849
	*  @param value
	**/
   public void setDesc28001849(char[] value) throws CFException {
      work.setDesc28001849(value);
   } 

	/**
	 *	Returns the value of amtE1754800
	 *	@return amtE1754800
	 */
	public long getAmtE1754800() throws CFException {
   		return work.getAmtE1754800();
	}


	/**
	 *	Returns String value of amtE1754800
	 *	@return amtE1754800
	 */
	public char[]  getAmtE1754800String() throws CFException {
	     return String.valueOf(work.getAmtE1754800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1754800IsNumeric()  throws CFException{
	    return work.amtE1754800IsNumeric();
	}

	/**
	 * 	Update AmtE1754800 with the passed value
	 *	@param number
	 */
	public void setAmtE1754800(long number)  throws CFException{
		work.setAmtE1754800(number);
	}
	

	
	/**
	 * 	Update AmtE1754800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1754800(char[] value)  throws CFException {
		work.setAmtE1754800(value);
	}
	
	/**
	 * 	Update AmtE1754800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1754800String(char[] value)  throws CFException{
		work.setAmtE1754800(value);
	}	

	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of amtE1850800
	 *	@return amtE1850800
	 */
	public long getAmtE1850800() throws CFException {
   		return work.getAmtE1850800();
	}


	/**
	 *	Returns String value of amtE1850800
	 *	@return amtE1850800
	 */
	public char[]  getAmtE1850800String() throws CFException {
	     return String.valueOf(work.getAmtE1850800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1850800IsNumeric()  throws CFException{
	    return work.amtE1850800IsNumeric();
	}

	/**
	 * 	Update AmtE1850800 with the passed value
	 *	@param number
	 */
	public void setAmtE1850800(long number)  throws CFException{
		work.setAmtE1850800(number);
	}
	

	
	/**
	 * 	Update AmtE1850800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1850800(char[] value)  throws CFException {
		work.setAmtE1850800(value);
	}
	
	/**
	 * 	Update AmtE1850800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1850800String(char[] value)  throws CFException{
		work.setAmtE1850800(value);
	}	

	/**
	 *	Test condition "1852" for isPds8411852Y88800()
	 *	@return  Returns true if isPds8411852Y88800() is "1852"
	 */
   public boolean isPds8411852Y88800() throws CFException {
      return pds841ValuesGroup800.getPds841800().isPds8411852Y88800();
   }

	/**
	*  set values "1852"
	*/
   	public void setPds8411852Y88800True()  throws CFException{  			
    	pds841ValuesGroup800.getPds841800().setPds8411852Y88800True();
   	}
	/**
	 *	Returns the value of desc18001750
	 *	@return desc18001750
	 */
   public char[] getDesc18001750() throws CFException  {              
   		return work.getDesc18001750();
   }

  
	/**
	*  set variable desc18001750
	*  @param value
	**/
   public void setDesc18001750(char[] value) throws CFException {
      work.setDesc18001750(value);
   } 

	/**
	 *	Returns the value of amtE1851800
	 *	@return amtE1851800
	 */
	public long getAmtE1851800() throws CFException {
   		return work.getAmtE1851800();
	}


	/**
	 *	Returns String value of amtE1851800
	 *	@return amtE1851800
	 */
	public char[]  getAmtE1851800String() throws CFException {
	     return String.valueOf(work.getAmtE1851800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1851800IsNumeric()  throws CFException{
	    return work.amtE1851800IsNumeric();
	}

	/**
	 * 	Update AmtE1851800 with the passed value
	 *	@param number
	 */
	public void setAmtE1851800(long number)  throws CFException{
		work.setAmtE1851800(number);
	}
	

	
	/**
	 * 	Update AmtE1851800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1851800(char[] value)  throws CFException {
		work.setAmtE1851800(value);
	}
	
	/**
	 * 	Update AmtE1851800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1851800String(char[] value)  throws CFException{
		work.setAmtE1851800(value);
	}	

	/**
	 *	Returns the value of ip65504P830ReservdL
	 *	@return ip65504P830ReservdL
	 */
	public short getIp65504P830ReservdL() throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup27().getIp65504P830ReservdL();
	}
	
	/**
	 * 	Update Ip65504P830ReservdL with the passed value
	 *	@param number
	 */
	public void setIp65504P830ReservdL(short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup27().setIp65504P830ReservdL(number);
	}

	public void setIp65504P830ReservdL(int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup27().setIp65504P830ReservdL((short)number);
	}

	public void setIp65504P830ReservdL(long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup27().setIp65504P830ReservdL((short)number);
	}



	/**
	 *	Returns the value of desc28001848
	 *	@return desc28001848
	 */
   public char[] getDesc28001848() throws CFException  {              
   		return work.getDesc28001848();
   }

  
	/**
	*  set variable desc28001848
	*  @param value
	**/
   public void setDesc28001848(char[] value) throws CFException {
      work.setDesc28001848(value);
   } 

	/**
	 *	Returns the value of ip65504P830ReservdS
	 *	@return ip65504P830ReservdS
	 */
	public short getIp65504P830ReservdS() throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup27().getIp65504P830ReservdS();
	}
	
	/**
	 * 	Update Ip65504P830ReservdS with the passed value
	 *	@param number
	 */
	public void setIp65504P830ReservdS(short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup27().setIp65504P830ReservdS(number);
	}

	public void setIp65504P830ReservdS(int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup27().setIp65504P830ReservdS((short)number);
	}

	public void setIp65504P830ReservdS(long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup27().setIp65504P830ReservdS((short)number);
	}



	/**
	 *	Returns the value of pds841ValuesGroup800
	 *	@return pds841ValuesGroup800
	 */   
	 public Pds841ValuesGroup800 getPds841ValuesGroup800() {
   	return pds841ValuesGroup800;
   }



        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public CheckActivityOutCtx getCheckActivityOutCtx() {
            return new CheckActivityOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += amtE1754TemGroup800.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += pds05DataGroup800.hashCode();
        str += amtE1852TemGroup800.hashCode();
        str += ip65504PdsMapGroup.hashCode();
        str += ip66102IpmMsg.hashCode();
        str += l1CtlValues800.hashCode();
        str += work.hashCode();
        str += amtE1848TemGroup800.hashCode();
        str += amtE1851TemGroup800.hashCode();
        str += ip65504SelPdsEntriesAll.hashCode();
        str += amtE1850TemGroup800.hashCode();
        str += amtE1750TemGroup800.hashCode();
        str += chipLiabVariables800.hashCode();
        str += amtE1849TemGroup800.hashCode();
        str += pds841ValuesGroup800.hashCode();
       return str.hashCode();
    }

    public CheckActivityInCtx clone() {
        CheckActivityInCtx cloneObj = new CheckActivityInCtx();
        cloneObj.amtE1754TemGroup800 = new AmtE1754TemGroup800();
        cloneObj.amtE1754TemGroup800.set(amtE1754TemGroup800.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.pds05DataGroup800 = new Pds05DataGroup800();
        cloneObj.pds05DataGroup800.set(pds05DataGroup800.getClonedField());
        cloneObj.amtE1852TemGroup800 = new AmtE1852TemGroup800();
        cloneObj.amtE1852TemGroup800.set(amtE1852TemGroup800.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.l1CtlValues800 = new L1CtlValues800();
        cloneObj.l1CtlValues800.set(l1CtlValues800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.amtE1848TemGroup800 = new AmtE1848TemGroup800();
        cloneObj.amtE1848TemGroup800.set(amtE1848TemGroup800.getClonedField());
        cloneObj.amtE1851TemGroup800 = new AmtE1851TemGroup800();
        cloneObj.amtE1851TemGroup800.set(amtE1851TemGroup800.getClonedField());
        cloneObj.ip65504SelPdsEntriesAll = new Ip65504SelPdsEntriesAll();
        cloneObj.ip65504SelPdsEntriesAll.set(ip65504SelPdsEntriesAll.getClonedField());
        cloneObj.amtE1850TemGroup800 = new AmtE1850TemGroup800();
        cloneObj.amtE1850TemGroup800.set(amtE1850TemGroup800.getClonedField());
        cloneObj.amtE1750TemGroup800 = new AmtE1750TemGroup800();
        cloneObj.amtE1750TemGroup800.set(amtE1750TemGroup800.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        cloneObj.amtE1849TemGroup800 = new AmtE1849TemGroup800();
        cloneObj.amtE1849TemGroup800.set(amtE1849TemGroup800.getClonedField());
        cloneObj.pds841ValuesGroup800 = new Pds841ValuesGroup800();
        cloneObj.pds841ValuesGroup800.set(pds841ValuesGroup800.getClonedField());
        return cloneObj;
    }

    }

    public CheckActivityInCtx getCheckActivityInCtx() {
            return new CheckActivityInCtx();
    }
     public class CheckActivityOutCtx implements Cloneable {
     AmtE1754TemGroup800 amtE1754TemGroup800 = Ip809050Ctx.this.getAmtE1754TemGroup800();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip809050Ctx.this.getIp65504DeMapGroup();
     Pds05DataGroup800 pds05DataGroup800 = Ip809050Ctx.this.getPds05DataGroup800();
     AmtE1852TemGroup800 amtE1852TemGroup800 = Ip809050Ctx.this.getAmtE1852TemGroup800();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip809050Ctx.this.getIp65504PdsMapGroup();
     Ip66102IpmMsg ip66102IpmMsg = Ip809050Ctx.this.getIp66102IpmMsg();
     L1CtlValues800 l1CtlValues800 = Ip809050Ctx.this.getL1CtlValues800();
     Work work = Ip809050Ctx.this.getWork();
     AmtE1848TemGroup800 amtE1848TemGroup800 = Ip809050Ctx.this.getAmtE1848TemGroup800();
     AmtE1851TemGroup800 amtE1851TemGroup800 = Ip809050Ctx.this.getAmtE1851TemGroup800();
     Ip65504SelPdsEntriesAll ip65504SelPdsEntriesAll = Ip809050Ctx.this.getIp65504SelPdsEntriesAll();
     AmtE1850TemGroup800 amtE1850TemGroup800 = Ip809050Ctx.this.getAmtE1850TemGroup800();
     AmtE1750TemGroup800 amtE1750TemGroup800 = Ip809050Ctx.this.getAmtE1750TemGroup800();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();
     AmtE1849TemGroup800 amtE1849TemGroup800 = Ip809050Ctx.this.getAmtE1849TemGroup800();
     Pds841ValuesGroup800 pds841ValuesGroup800 = Ip809050Ctx.this.getPds841ValuesGroup800();

	/**
	 *	Returns the value of amtE1852800
	 *	@return amtE1852800
	 */
	public long getAmtE1852800() throws CFException {
   		return work.getAmtE1852800();
	}


	/**
	 *	Returns String value of amtE1852800
	 *	@return amtE1852800
	 */
	public char[]  getAmtE1852800String() throws CFException {
	     return String.valueOf(work.getAmtE1852800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1852800IsNumeric()  throws CFException{
	    return work.amtE1852800IsNumeric();
	}

	/**
	 * 	Update AmtE1852800 with the passed value
	 *	@param number
	 */
	public void setAmtE1852800(long number)  throws CFException{
		work.setAmtE1852800(number);
	}
	

	
	/**
	 * 	Update AmtE1852800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1852800(char[] value)  throws CFException {
		work.setAmtE1852800(value);
	}
	
	/**
	 * 	Update AmtE1852800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1852800String(char[] value)  throws CFException{
		work.setAmtE1852800(value);
	}	

	/**
	 *	Returns the value of ip65504P165SetlIdL
	 *	@return ip65504P165SetlIdL
	 */
	public short getIp65504P165SetlIdL() throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup6().getIp65504P165SetlIdL();
	}
	
	/**
	 * 	Update Ip65504P165SetlIdL with the passed value
	 *	@param number
	 */
	public void setIp65504P165SetlIdL(short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup6().setIp65504P165SetlIdL(number);
	}

	public void setIp65504P165SetlIdL(int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup6().setIp65504P165SetlIdL((short)number);
	}

	public void setIp65504P165SetlIdL(long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup6().setIp65504P165SetlIdL((short)number);
	}



	/**
	 *	Test condition "Y" for isWrite7Y88800()
	 *	@return  Returns true if isWrite7Y88800() is "Y"
	 */
   public boolean isWrite7Y88800() throws CFException {
      return work.isWrite7Y88800();
   }

	/**
	*  set values "Y"
	*/
   	public void setWrite7Y88800True()  throws CFException{  			
    	work.setWrite7Y88800True();
   	}
	/**
	 *	Returns the value of usdAmt800
	 *	@return usdAmt800
	 */
   public char[] getUsdAmt800() throws CFException  {              
   		return chipLiabVariables800.getUsdAmt1800().getUsdAmt800();
   }

  
	/**
	*  set variable usdAmt800
	*  @param value
	**/
   public void setUsdAmt800(char[] value) throws CFException {
      chipLiabVariables800.getUsdAmt1800().setUsdAmt800(value);
   } 

     /**
	 * 	Update UsdAmt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUsdAmt800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.getUsdAmt1800().setUsdAmt800(source, sourceIndex);
   	
   }
   
   public void setUsdAmt800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.getUsdAmt1800().setUsdAmt800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update UsdAmt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUsdAmt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getUsdAmt1800().setUsdAmt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update UsdAmt800 with another Field
	 *	@param value
	 */
   public void setUsdAmt800(Field source) {
      chipLiabVariables800.getUsdAmt1800().setUsdAmt800(source);
   }  
   
     /**
	 * 	Update UsdAmt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUsdAmt800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.getUsdAmt1800().setUsdAmt800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update UsdAmt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUsdAmt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getUsdAmt1800().setUsdAmt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of desc18001848
	 *	@return desc18001848
	 */
   public char[] getDesc18001848() throws CFException  {              
   		return work.getDesc18001848();
   }

  
	/**
	*  set variable desc18001848
	*  @param value
	**/
   public void setDesc18001848(char[] value) throws CFException {
      work.setDesc18001848(value);
   } 

	/**
	 *	Returns the value of errorNum800
	 *	@return errorNum800
	 */
   public char[] getErrorNum800() throws CFException  {              
   		return chipLiabVariables800.getErrorNum800();
   }

  
	/**
	*  set variable errorNum800
	*  @param value
	**/
   public void setErrorNum800(char[] value) throws CFException {
      chipLiabVariables800.setErrorNum800(value);
   } 

     /**
	 * 	Update ErrorNum800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorNum800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.setErrorNum800(source, sourceIndex);
   	
   }
   
   public void setErrorNum800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.setErrorNum800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrorNum800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorNum800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.setErrorNum800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrorNum800 with another Field
	 *	@param value
	 */
   public void setErrorNum800(Field source) {
      chipLiabVariables800.setErrorNum800(source);
   }  
   
     /**
	 * 	Update ErrorNum800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorNum800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.setErrorNum800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ErrorNum800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorNum800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.setErrorNum800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of transAmount800
	 *	@return transAmount800
	 */
	public long getTransAmount800() throws CFException {
   		return work.getTransAmount800();
	}


	/**
	 *	Returns String value of transAmount800
	 *	@return transAmount800
	 */
	public char[]  getTransAmount800String() throws CFException {
	     return String.valueOf(work.getTransAmount800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean transAmount800IsNumeric()  throws CFException{
	    return work.transAmount800IsNumeric();
	}

	/**
	 * 	Update TransAmount800 with the passed value
	 *	@param number
	 */
	public void setTransAmount800(long number)  throws CFException{
		work.setTransAmount800(number);
	}
	

	
	/**
	 * 	Update TransAmount800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTransAmount800(char[] value)  throws CFException {
		work.setTransAmount800(value);
	}
	
	/**
	 * 	Update TransAmount800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTransAmount800String(char[] value)  throws CFException{
		work.setTransAmount800(value);
	}	

	/**
	 *	Returns the value of desc18001851
	 *	@return desc18001851
	 */
   public char[] getDesc18001851() throws CFException  {              
   		return work.getDesc18001851();
   }

  
	/**
	*  set variable desc18001851
	*  @param value
	**/
   public void setDesc18001851(char[] value) throws CFException {
      work.setDesc18001851(value);
   } 

	/**
	 *	Returns the value of amtE1848800
	 *	@return amtE1848800
	 */
	public long getAmtE1848800() throws CFException {
   		return work.getAmtE1848800();
	}


	/**
	 *	Returns String value of amtE1848800
	 *	@return amtE1848800
	 */
	public char[]  getAmtE1848800String() throws CFException {
	     return String.valueOf(work.getAmtE1848800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1848800IsNumeric()  throws CFException{
	    return work.amtE1848800IsNumeric();
	}

	/**
	 * 	Update AmtE1848800 with the passed value
	 *	@param number
	 */
	public void setAmtE1848800(long number)  throws CFException{
		work.setAmtE1848800(number);
	}
	

	
	/**
	 * 	Update AmtE1848800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1848800(char[] value)  throws CFException {
		work.setAmtE1848800(value);
	}
	
	/**
	 * 	Update AmtE1848800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1848800String(char[] value)  throws CFException{
		work.setAmtE1848800(value);
	}	

	/**
	 *	Returns the value of tranCurExp800
	 *	@return tranCurExp800
	 */
	public int getTranCurExp800() throws CFException {
   		return work.getTranCurExp800();
	}


	/**
	 *	Returns String value of tranCurExp800
	 *	@return tranCurExp800
	 */
	public char[]  getTranCurExp800String() throws CFException {
	     return String.valueOf(work.getTranCurExp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranCurExp800IsNumeric()  throws CFException{
	    return work.tranCurExp800IsNumeric();
	}

	/**
	 * 	Update TranCurExp800 with the passed value
	 *	@param number
	 */
	public void setTranCurExp800(int number)  throws CFException{
		work.setTranCurExp800(number);
	}
	

	public void setTranCurExp800(long number)  throws CFException{
	    work.setTranCurExp800(number);
	}
	
	
	/**
	 * 	Update TranCurExp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranCurExp800(char[] value)  throws CFException {
		work.setTranCurExp800(value);
	}
	
	/**
	 * 	Update TranCurExp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranCurExp800String(char[] value)  throws CFException{
		work.setTranCurExp800(value);
	}	

	/**
	 *	Returns the value of desc18001850
	 *	@return desc18001850
	 */
   public char[] getDesc18001850() throws CFException  {              
   		return work.getDesc18001850();
   }

  
	/**
	*  set variable desc18001850
	*  @param value
	**/
   public void setDesc18001850(char[] value) throws CFException {
      work.setDesc18001850(value);
   } 

	/**
	 *	Returns the value of pds05Data800
	 *	@return pds05Data800
	 */
   public char[] getPds05Data800() throws CFException  {              
   		return pds05DataGroup800.getPds05Data800();
   }

  
	/**
	*  set variable pds05Data800
	*  @param value
	**/
   public void setPds05Data800(char[] value) throws CFException {
      pds05DataGroup800.setPds05Data800(value);
   } 

     /**
	 * 	Update Pds05Data800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds05Data800(char[] source, int sourceIndex) throws CFException {
      pds05DataGroup800.setPds05Data800(source, sourceIndex);
   	
   }
   
   public void setPds05Data800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds05DataGroup800.setPds05Data800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Pds05Data800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds05Data800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds05DataGroup800.setPds05Data800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Pds05Data800 with another Field
	 *	@param value
	 */
   public void setPds05Data800(Field source) {
      pds05DataGroup800.setPds05Data800(source);
   }  
   
     /**
	 * 	Update Pds05Data800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds05Data800(Field source, int sourceIndex,int sourceLen) {
      pds05DataGroup800.setPds05Data800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Pds05Data800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds05Data800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds05DataGroup800.setPds05Data800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of usdAmtDec800
	 *	@return usdAmtDec800
	 */
   public char[] getUsdAmtDec800() throws CFException  {              
   		return chipLiabVariables800.getUsdAmt1800().getUsdAmtDec800();
   }

  
	/**
	*  set variable usdAmtDec800
	*  @param value
	**/
   public void setUsdAmtDec800(char[] value) throws CFException {
      chipLiabVariables800.getUsdAmt1800().setUsdAmtDec800(value);
   } 

     /**
	 * 	Update UsdAmtDec800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUsdAmtDec800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.getUsdAmt1800().setUsdAmtDec800(source, sourceIndex);
   	
   }
   
   public void setUsdAmtDec800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.getUsdAmt1800().setUsdAmtDec800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update UsdAmtDec800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUsdAmtDec800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getUsdAmt1800().setUsdAmtDec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update UsdAmtDec800 with another Field
	 *	@param value
	 */
   public void setUsdAmtDec800(Field source) {
      chipLiabVariables800.getUsdAmt1800().setUsdAmtDec800(source);
   }  
   
     /**
	 * 	Update UsdAmtDec800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUsdAmtDec800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.getUsdAmt1800().setUsdAmtDec800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update UsdAmtDec800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUsdAmtDec800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getUsdAmt1800().setUsdAmtDec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504P841ReservdS
	 *	@return ip65504P841ReservdS
	 */
	public short getIp65504P841ReservdS() throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup28().getIp65504P841ReservdS();
	}
	
	/**
	 * 	Update Ip65504P841ReservdS with the passed value
	 *	@param number
	 */
	public void setIp65504P841ReservdS(short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup28().setIp65504P841ReservdS(number);
	}

	public void setIp65504P841ReservdS(int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup28().setIp65504P841ReservdS((short)number);
	}

	public void setIp65504P841ReservdS(long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup28().setIp65504P841ReservdS((short)number);
	}



	/**
	 *	Test condition "N" for isWrite1N88800()
	 *	@return  Returns true if isWrite1N88800() is "N"
	 */
   public boolean isWrite1N88800() throws CFException {
      return work.isWrite1N88800();
   }

	/**
	*  set values "N"
	*/
   	public void setWrite1N88800True()  throws CFException{  			
    	work.setWrite1N88800True();
   	}
	/**
	 *	Test condition "Y" for isWrite6Y88800()
	 *	@return  Returns true if isWrite6Y88800() is "Y"
	 */
   public boolean isWrite6Y88800() throws CFException {
      return work.isWrite6Y88800();
   }

	/**
	*  set values "Y"
	*/
   	public void setWrite6Y88800True()  throws CFException{  			
    	work.setWrite6Y88800True();
   	}
	/**
	 *	Returns the value of desc18001754
	 *	@return desc18001754
	 */
   public char[] getDesc18001754() throws CFException  {              
   		return work.getDesc18001754();
   }

  
	/**
	*  set variable desc18001754
	*  @param value
	**/
   public void setDesc18001754(char[] value) throws CFException {
      work.setDesc18001754(value);
   } 

	/**
	 *	Test condition "N" for isWrite6N88800()
	 *	@return  Returns true if isWrite6N88800() is "N"
	 */
   public boolean isWrite6N88800() throws CFException {
      return work.isWrite6N88800();
   }

	/**
	*  set values "N"
	*/
   	public void setWrite6N88800True()  throws CFException{  			
    	work.setWrite6N88800True();
   	}
	/**
	 *	Returns the value of tranAmt800
	 *	@return tranAmt800
	 */
	public long getTranAmt800() throws CFException {
   		return work.getTranAmt800();
	}


	/**
	 *	Returns String value of tranAmt800
	 *	@return tranAmt800
	 */
	public char[]  getTranAmt800String() throws CFException {
	     return String.valueOf(work.getTranAmt800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranAmt800IsNumeric()  throws CFException{
	    return work.tranAmt800IsNumeric();
	}

	/**
	 * 	Update TranAmt800 with the passed value
	 *	@param number
	 */
	public void setTranAmt800(long number)  throws CFException{
		work.setTranAmt800(number);
	}
	

	
	/**
	 * 	Update TranAmt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranAmt800(char[] value)  throws CFException {
		work.setTranAmt800(value);
	}
	
	/**
	 * 	Update TranAmt800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranAmt800String(char[] value)  throws CFException{
		work.setTranAmt800(value);
	}	

	/**
	 *	Returns the value of errDesc2800
	 *	@return errDesc2800
	 */
   public char[] getErrDesc2800() throws CFException  {              
   		return chipLiabVariables800.getErrorDesc800().getErrDesc2800();
   }

  
	/**
	*  set variable errDesc2800
	*  @param value
	**/
   public void setErrDesc2800(char[] value) throws CFException {
      chipLiabVariables800.getErrorDesc800().setErrDesc2800(value);
   } 

     /**
	 * 	Update ErrDesc2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrDesc2800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.getErrorDesc800().setErrDesc2800(source, sourceIndex);
   	
   }
   
   public void setErrDesc2800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.getErrorDesc800().setErrDesc2800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrDesc2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrDesc2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getErrorDesc800().setErrDesc2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrDesc2800 with another Field
	 *	@param value
	 */
   public void setErrDesc2800(Field source) {
      chipLiabVariables800.getErrorDesc800().setErrDesc2800(source);
   }  
   
     /**
	 * 	Update ErrDesc2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrDesc2800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.getErrorDesc800().setErrDesc2800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ErrDesc2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrDesc2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getErrorDesc800().setErrDesc2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isWrite4N88800()
	 *	@return  Returns true if isWrite4N88800() is "N"
	 */
   public boolean isWrite4N88800() throws CFException {
      return work.isWrite4N88800();
   }

	/**
	*  set values "N"
	*/
   	public void setWrite4N88800True()  throws CFException{  			
    	work.setWrite4N88800True();
   	}
	/**
	 *	Returns the value of amtE1851Tem800
	 *	@return amtE1851Tem800
	 */
	public long getAmtE1851Tem800() throws CFException {
   		return amtE1851TemGroup800.getAmtE1851Tem800();
	}


	/**
	 *	Returns String value of amtE1851Tem800
	 *	@return amtE1851Tem800
	 */
	public char[]  getAmtE1851Tem800String() throws CFException {
	     return String.valueOf(amtE1851TemGroup800.getAmtE1851Tem800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1851Tem800IsNumeric()  throws CFException{
	    return amtE1851TemGroup800.amtE1851Tem800IsNumeric();
	}

	/**
	 * 	Update AmtE1851Tem800 with the passed value
	 *	@param number
	 */
	public void setAmtE1851Tem800(long number)  throws CFException{
		amtE1851TemGroup800.setAmtE1851Tem800(number);
	}
	

	
	/**
	 * 	Update AmtE1851Tem800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1851Tem800(char[] value)  throws CFException {
		amtE1851TemGroup800.setAmtE1851Tem800(value);
	}
	
	/**
	 * 	Update AmtE1851Tem800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1851Tem800String(char[] value)  throws CFException{
		amtE1851TemGroup800.setAmtE1851Tem800(value);
	}	

	/**
	 *	Returns the value of ip65504P165SetlIdS
	 *	@return ip65504P165SetlIdS
	 */
	public short getIp65504P165SetlIdS() throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup6().getIp65504P165SetlIdS();
	}
	
	/**
	 * 	Update Ip65504P165SetlIdS with the passed value
	 *	@param number
	 */
	public void setIp65504P165SetlIdS(short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup6().setIp65504P165SetlIdS(number);
	}

	public void setIp65504P165SetlIdS(int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup6().setIp65504P165SetlIdS((short)number);
	}

	public void setIp65504P165SetlIdS(long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup6().setIp65504P165SetlIdS((short)number);
	}



	/**
	 *	Test condition "Y" for isWrite5Y88800()
	 *	@return  Returns true if isWrite5Y88800() is "Y"
	 */
   public boolean isWrite5Y88800() throws CFException {
      return work.isWrite5Y88800();
   }

	/**
	*  set values "Y"
	*/
   	public void setWrite5Y88800True()  throws CFException{  			
    	work.setWrite5Y88800True();
   	}
	/**
	 *	Test condition "N" for isWrite7N88800()
	 *	@return  Returns true if isWrite7N88800() is "N"
	 */
   public boolean isWrite7N88800() throws CFException {
      return work.isWrite7N88800();
   }

	/**
	*  set values "N"
	*/
   	public void setWrite7N88800True()  throws CFException{  			
    	work.setWrite7N88800True();
   	}
	/**
	 *	Returns the value of l1CtlMti800
	 *	@return l1CtlMti800
	 */
	public int getL1CtlMti800() throws CFException {
   		return l1CtlValues800.getL1CtlMti800();
	}


	/**
	 *	Returns String value of l1CtlMti800
	 *	@return l1CtlMti800
	 */
	public char[]  getL1CtlMti800String() throws CFException {
	     return String.valueOf(l1CtlValues800.getL1CtlMti800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean l1CtlMti800IsNumeric()  throws CFException{
	    return l1CtlValues800.l1CtlMti800IsNumeric();
	}

	/**
	 * 	Update L1CtlMti800 with the passed value
	 *	@param number
	 */
	public void setL1CtlMti800(int number)  throws CFException{
		l1CtlValues800.setL1CtlMti800(number);
	}
	

	public void setL1CtlMti800(long number)  throws CFException{
	    l1CtlValues800.setL1CtlMti800(number);
	}
	
	
	/**
	 * 	Update L1CtlMti800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setL1CtlMti800(char[] value)  throws CFException {
		l1CtlValues800.setL1CtlMti800(value);
	}
	
	/**
	 * 	Update L1CtlMti800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setL1CtlMti800String(char[] value)  throws CFException{
		l1CtlValues800.setL1CtlMti800(value);
	}	

	/**
	 *	Returns the value of amtE1750800
	 *	@return amtE1750800
	 */
	public long getAmtE1750800() throws CFException {
   		return work.getAmtE1750800();
	}


	/**
	 *	Returns String value of amtE1750800
	 *	@return amtE1750800
	 */
	public char[]  getAmtE1750800String() throws CFException {
	     return String.valueOf(work.getAmtE1750800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1750800IsNumeric()  throws CFException{
	    return work.amtE1750800IsNumeric();
	}

	/**
	 * 	Update AmtE1750800 with the passed value
	 *	@param number
	 */
	public void setAmtE1750800(long number)  throws CFException{
		work.setAmtE1750800(number);
	}
	

	
	/**
	 * 	Update AmtE1750800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1750800(char[] value)  throws CFException {
		work.setAmtE1750800(value);
	}
	
	/**
	 * 	Update AmtE1750800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1750800String(char[] value)  throws CFException{
		work.setAmtE1750800(value);
	}	

	/**
	 *	Returns the value of amtE1754Tem800
	 *	@return amtE1754Tem800
	 */
	public long getAmtE1754Tem800() throws CFException {
   		return amtE1754TemGroup800.getAmtE1754Tem800();
	}


	/**
	 *	Returns String value of amtE1754Tem800
	 *	@return amtE1754Tem800
	 */
	public char[]  getAmtE1754Tem800String() throws CFException {
	     return String.valueOf(amtE1754TemGroup800.getAmtE1754Tem800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1754Tem800IsNumeric()  throws CFException{
	    return amtE1754TemGroup800.amtE1754Tem800IsNumeric();
	}

	/**
	 * 	Update AmtE1754Tem800 with the passed value
	 *	@param number
	 */
	public void setAmtE1754Tem800(long number)  throws CFException{
		amtE1754TemGroup800.setAmtE1754Tem800(number);
	}
	

	
	/**
	 * 	Update AmtE1754Tem800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1754Tem800(char[] value)  throws CFException {
		amtE1754TemGroup800.setAmtE1754Tem800(value);
	}
	
	/**
	 * 	Update AmtE1754Tem800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1754Tem800String(char[] value)  throws CFException{
		amtE1754TemGroup800.setAmtE1754Tem800(value);
	}	

	/**
	 *	Returns the value of amtE1754800
	 *	@return amtE1754800
	 */
	public long getAmtE1754800() throws CFException {
   		return work.getAmtE1754800();
	}


	/**
	 *	Returns String value of amtE1754800
	 *	@return amtE1754800
	 */
	public char[]  getAmtE1754800String() throws CFException {
	     return String.valueOf(work.getAmtE1754800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1754800IsNumeric()  throws CFException{
	    return work.amtE1754800IsNumeric();
	}

	/**
	 * 	Update AmtE1754800 with the passed value
	 *	@param number
	 */
	public void setAmtE1754800(long number)  throws CFException{
		work.setAmtE1754800(number);
	}
	

	
	/**
	 * 	Update AmtE1754800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1754800(char[] value)  throws CFException {
		work.setAmtE1754800(value);
	}
	
	/**
	 * 	Update AmtE1754800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1754800String(char[] value)  throws CFException{
		work.setAmtE1754800(value);
	}	

	/**
	 *	Returns the value of amtE1850Tem800
	 *	@return amtE1850Tem800
	 */
	public long getAmtE1850Tem800() throws CFException {
   		return amtE1850TemGroup800.getAmtE1850Tem800();
	}


	/**
	 *	Returns String value of amtE1850Tem800
	 *	@return amtE1850Tem800
	 */
	public char[]  getAmtE1850Tem800String() throws CFException {
	     return String.valueOf(amtE1850TemGroup800.getAmtE1850Tem800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1850Tem800IsNumeric()  throws CFException{
	    return amtE1850TemGroup800.amtE1850Tem800IsNumeric();
	}

	/**
	 * 	Update AmtE1850Tem800 with the passed value
	 *	@param number
	 */
	public void setAmtE1850Tem800(long number)  throws CFException{
		amtE1850TemGroup800.setAmtE1850Tem800(number);
	}
	

	
	/**
	 * 	Update AmtE1850Tem800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1850Tem800(char[] value)  throws CFException {
		amtE1850TemGroup800.setAmtE1850Tem800(value);
	}
	
	/**
	 * 	Update AmtE1850Tem800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1850Tem800String(char[] value)  throws CFException{
		amtE1850TemGroup800.setAmtE1850Tem800(value);
	}	

	/**
	 *	Returns the value of amtE1848Tem800
	 *	@return amtE1848Tem800
	 */
	public long getAmtE1848Tem800() throws CFException {
   		return amtE1848TemGroup800.getAmtE1848Tem800();
	}


	/**
	 *	Returns String value of amtE1848Tem800
	 *	@return amtE1848Tem800
	 */
	public char[]  getAmtE1848Tem800String() throws CFException {
	     return String.valueOf(amtE1848TemGroup800.getAmtE1848Tem800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1848Tem800IsNumeric()  throws CFException{
	    return amtE1848TemGroup800.amtE1848Tem800IsNumeric();
	}

	/**
	 * 	Update AmtE1848Tem800 with the passed value
	 *	@param number
	 */
	public void setAmtE1848Tem800(long number)  throws CFException{
		amtE1848TemGroup800.setAmtE1848Tem800(number);
	}
	

	
	/**
	 * 	Update AmtE1848Tem800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1848Tem800(char[] value)  throws CFException {
		amtE1848TemGroup800.setAmtE1848Tem800(value);
	}
	
	/**
	 * 	Update AmtE1848Tem800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1848Tem800String(char[] value)  throws CFException{
		amtE1848TemGroup800.setAmtE1848Tem800(value);
	}	

	/**
	 *	Returns the value of amtE1850800
	 *	@return amtE1850800
	 */
	public long getAmtE1850800() throws CFException {
   		return work.getAmtE1850800();
	}


	/**
	 *	Returns String value of amtE1850800
	 *	@return amtE1850800
	 */
	public char[]  getAmtE1850800String() throws CFException {
	     return String.valueOf(work.getAmtE1850800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1850800IsNumeric()  throws CFException{
	    return work.amtE1850800IsNumeric();
	}

	/**
	 * 	Update AmtE1850800 with the passed value
	 *	@param number
	 */
	public void setAmtE1850800(long number)  throws CFException{
		work.setAmtE1850800(number);
	}
	

	
	/**
	 * 	Update AmtE1850800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1850800(char[] value)  throws CFException {
		work.setAmtE1850800(value);
	}
	
	/**
	 * 	Update AmtE1850800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1850800String(char[] value)  throws CFException{
		work.setAmtE1850800(value);
	}	

	/**
	 *	Test condition "N" for isWrite5N88800()
	 *	@return  Returns true if isWrite5N88800() is "N"
	 */
   public boolean isWrite5N88800() throws CFException {
      return work.isWrite5N88800();
   }

	/**
	*  set values "N"
	*/
   	public void setWrite5N88800True()  throws CFException{  			
    	work.setWrite5N88800True();
   	}
	/**
	 *	Returns the value of ip65504P830ReservdL
	 *	@return ip65504P830ReservdL
	 */
	public short getIp65504P830ReservdL() throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup27().getIp65504P830ReservdL();
	}
	
	/**
	 * 	Update Ip65504P830ReservdL with the passed value
	 *	@param number
	 */
	public void setIp65504P830ReservdL(short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup27().setIp65504P830ReservdL(number);
	}

	public void setIp65504P830ReservdL(int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup27().setIp65504P830ReservdL((short)number);
	}

	public void setIp65504P830ReservdL(long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup27().setIp65504P830ReservdL((short)number);
	}



	/**
	 *	Returns the value of pds165s1800
	 *	@return pds165s1800
	 */
   public char[] getPds165s1800() throws CFException  {              
   		return work.getPds165s1800();
   }

  
	/**
	*  set variable pds165s1800
	*  @param value
	**/
   public void setPds165s1800(char[] value) throws CFException {
      work.setPds165s1800(value);
   } 

	/**
	 *	Returns the value of ip65504P830ReservdS
	 *	@return ip65504P830ReservdS
	 */
	public short getIp65504P830ReservdS() throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup27().getIp65504P830ReservdS();
	}
	
	/**
	 * 	Update Ip65504P830ReservdS with the passed value
	 *	@param number
	 */
	public void setIp65504P830ReservdS(short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup27().setIp65504P830ReservdS(number);
	}

	public void setIp65504P830ReservdS(int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup27().setIp65504P830ReservdS((short)number);
	}

	public void setIp65504P830ReservdS(long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup27().setIp65504P830ReservdS((short)number);
	}



	/**
	 *	Returns the value of ip65504P005MsgeridS
	 *	@return ip65504P005MsgeridS
	 */
	public short getIp65504P005MsgeridS() throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup1().getIp65504P005MsgeridS();
	}
	
	/**
	 * 	Update Ip65504P005MsgeridS with the passed value
	 *	@param number
	 */
	public void setIp65504P005MsgeridS(short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup1().setIp65504P005MsgeridS(number);
	}

	public void setIp65504P005MsgeridS(int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup1().setIp65504P005MsgeridS((short)number);
	}

	public void setIp65504P005MsgeridS(long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup1().setIp65504P005MsgeridS((short)number);
	}



	/**
	 *	Returns the value of desc28001754
	 *	@return desc28001754
	 */
   public char[] getDesc28001754() throws CFException  {              
   		return work.getDesc28001754();
   }

  
	/**
	*  set variable desc28001754
	*  @param value
	**/
   public void setDesc28001754(char[] value) throws CFException {
      work.setDesc28001754(value);
   } 

	/**
	 *	Returns the value of amtE1852Tem800
	 *	@return amtE1852Tem800
	 */
	public long getAmtE1852Tem800() throws CFException {
   		return amtE1852TemGroup800.getAmtE1852Tem800();
	}


	/**
	 *	Returns String value of amtE1852Tem800
	 *	@return amtE1852Tem800
	 */
	public char[]  getAmtE1852Tem800String() throws CFException {
	     return String.valueOf(amtE1852TemGroup800.getAmtE1852Tem800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1852Tem800IsNumeric()  throws CFException{
	    return amtE1852TemGroup800.amtE1852Tem800IsNumeric();
	}

	/**
	 * 	Update AmtE1852Tem800 with the passed value
	 *	@param number
	 */
	public void setAmtE1852Tem800(long number)  throws CFException{
		amtE1852TemGroup800.setAmtE1852Tem800(number);
	}
	

	
	/**
	 * 	Update AmtE1852Tem800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1852Tem800(char[] value)  throws CFException {
		amtE1852TemGroup800.setAmtE1852Tem800(value);
	}
	
	/**
	 * 	Update AmtE1852Tem800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1852Tem800String(char[] value)  throws CFException{
		amtE1852TemGroup800.setAmtE1852Tem800(value);
	}	

	/**
	 *	Returns the value of ip66102NormalIpmMsg
	 *	@return ip66102NormalIpmMsg
	 */   
	 public Ip66102NormalIpmMsg getIp66102NormalIpmMsg() {
   	return ip66102IpmMsg.getIp66102NormalIpmMsg();
   }

   /**
	* 	Update Ip66102NormalIpmMsg with the passed value
	*	@param value
	*/
   public void setIp66102NormalIpmMsg(char[] value) throws CFException {
      ip66102IpmMsg.setIp66102NormalIpmMsg(value);
   }   

     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102NormalIpmMsg with another Field
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(Field source) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source);
   }  
   
     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(Field source, int sourceIndex,int sourceLen) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504D24FuncCdL
	 *	@return ip65504D24FuncCdL
	 */
	public short getIp65504D24FuncCdL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D24FuncCdL();
	}
	
	/**
	 * 	Update Ip65504D24FuncCdL with the passed value
	 *	@param number
	 */
	public void setIp65504D24FuncCdL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D24FuncCdL(number);
	}

	public void setIp65504D24FuncCdL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D24FuncCdL((short)number);
	}

	public void setIp65504D24FuncCdL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D24FuncCdL((short)number);
	}



	/**
	 *	Returns the value of pds841Values800
	 *	@return pds841Values800
	 */
   public char[] getPds841Values800() throws CFException  {              
   		return pds841ValuesGroup800.getPds841Values800();
   }

  
	/**
	*  set variable pds841Values800
	*  @param value
	**/
   public void setPds841Values800(char[] value) throws CFException {
      pds841ValuesGroup800.setPds841Values800(value);
   } 

     /**
	 * 	Update Pds841Values800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds841Values800(char[] source, int sourceIndex) throws CFException {
      pds841ValuesGroup800.setPds841Values800(source, sourceIndex);
   	
   }
   
   public void setPds841Values800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds841ValuesGroup800.setPds841Values800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Pds841Values800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds841Values800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds841ValuesGroup800.setPds841Values800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Pds841Values800 with another Field
	 *	@param value
	 */
   public void setPds841Values800(Field source) {
      pds841ValuesGroup800.setPds841Values800(source);
   }  
   
     /**
	 * 	Update Pds841Values800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds841Values800(Field source, int sourceIndex,int sourceLen) {
      pds841ValuesGroup800.setPds841Values800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Pds841Values800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds841Values800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds841ValuesGroup800.setPds841Values800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isWrite2N88800()
	 *	@return  Returns true if isWrite2N88800() is "N"
	 */
   public boolean isWrite2N88800() throws CFException {
      return work.isWrite2N88800();
   }

	/**
	*  set values "N"
	*/
   	public void setWrite2N88800True()  throws CFException{  			
    	work.setWrite2N88800True();
   	}
	/**
	 *	Test condition "N" for isWrite3N88800()
	 *	@return  Returns true if isWrite3N88800() is "N"
	 */
   public boolean isWrite3N88800() throws CFException {
      return work.isWrite3N88800();
   }

	/**
	*  set values "N"
	*/
   	public void setWrite3N88800True()  throws CFException{  			
    	work.setWrite3N88800True();
   	}
	/**
	 *	Returns the value of l1CtlValues800
	 *	@return l1CtlValues800
	 */   
	 public L1CtlValues800 getL1CtlValues800() {
   	return l1CtlValues800;
   }


	/**
	 *	Returns the value of tranCur800
	 *	@return tranCur800
	 */
	public int getTranCur800() throws CFException {
   		return work.getTranCur800();
	}


	/**
	 *	Returns String value of tranCur800
	 *	@return tranCur800
	 */
	public char[]  getTranCur800String() throws CFException {
	     return String.valueOf(work.getTranCur800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranCur800IsNumeric()  throws CFException{
	    return work.tranCur800IsNumeric();
	}

	/**
	 * 	Update TranCur800 with the passed value
	 *	@param number
	 */
	public void setTranCur800(int number)  throws CFException{
		work.setTranCur800(number);
	}
	

	public void setTranCur800(long number)  throws CFException{
	    work.setTranCur800(number);
	}
	
	
	/**
	 * 	Update TranCur800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranCur800(char[] value)  throws CFException {
		work.setTranCur800(value);
	}
	
	/**
	 * 	Update TranCur800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranCur800String(char[] value)  throws CFException{
		work.setTranCur800(value);
	}	

	/**
	 *	Returns the value of desc28001850
	 *	@return desc28001850
	 */
   public char[] getDesc28001850() throws CFException  {              
   		return work.getDesc28001850();
   }

  
	/**
	*  set variable desc28001850
	*  @param value
	**/
   public void setDesc28001850(char[] value) throws CFException {
      work.setDesc28001850(value);
   } 

	/**
	 *	Test condition "Y" for isWrite1Y88800()
	 *	@return  Returns true if isWrite1Y88800() is "Y"
	 */
   public boolean isWrite1Y88800() throws CFException {
      return work.isWrite1Y88800();
   }

	/**
	*  set values "Y"
	*/
   	public void setWrite1Y88800True()  throws CFException{  			
    	work.setWrite1Y88800True();
   	}
	/**
	 *	Returns the value of p0165800
	 *	@return p0165800
	 */
   public char[] getP0165800() throws CFException  {              
   		return work.getP0165800();
   }

  
	/**
	*  set variable p0165800
	*  @param value
	**/
   public void setP0165800(char[] value) throws CFException {
      work.setP0165800(value);
   } 

	/**
	 *	Returns the value of ip65504D24FuncCdS
	 *	@return ip65504D24FuncCdS
	 */
	public short getIp65504D24FuncCdS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D24FuncCdS();
	}
	
	/**
	 * 	Update Ip65504D24FuncCdS with the passed value
	 *	@param number
	 */
	public void setIp65504D24FuncCdS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D24FuncCdS(number);
	}

	public void setIp65504D24FuncCdS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D24FuncCdS((short)number);
	}

	public void setIp65504D24FuncCdS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D24FuncCdS((short)number);
	}



	/**
	 *	Returns the value of desc18001852
	 *	@return desc18001852
	 */
   public char[] getDesc18001852() throws CFException  {              
   		return work.getDesc18001852();
   }

  
	/**
	*  set variable desc18001852
	*  @param value
	**/
   public void setDesc18001852(char[] value) throws CFException {
      work.setDesc18001852(value);
   } 

	/**
	 *	Returns the value of desc28001750
	 *	@return desc28001750
	 */
   public char[] getDesc28001750() throws CFException  {              
   		return work.getDesc28001750();
   }

  
	/**
	*  set variable desc28001750
	*  @param value
	**/
   public void setDesc28001750(char[] value) throws CFException {
      work.setDesc28001750(value);
   } 

	/**
	 *	Returns the value of ip66102Mti
	 *	@return ip66102Mti
	 */
   public char[] getIp66102Mti() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102Mti();
   }

  
	/**
	*  set variable ip66102Mti
	*  @param value
	**/
   public void setIp66102Mti(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102Mti(value);
   } 

     /**
	 * 	Update Ip66102Mti 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102Mti(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102Mti(source, sourceIndex);
   	
   }
   
   public void setIp66102Mti(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102Mti(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102Mti 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102Mti(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102Mti(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102Mti with another Field
	 *	@param value
	 */
   public void setIp66102Mti(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102Mti(source);
   }  
   
     /**
	 * 	Update Ip66102Mti 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102Mti(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102Mti(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102Mti 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102Mti(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().setIp66102Mti(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of editNum800
	 *	@return editNum800
	 */
   public char[] getEditNum800() throws CFException  {              
   		return chipLiabVariables800.getEditNum800();
   }

  
	/**
	*  set variable editNum800
	*  @param value
	**/
   public void setEditNum800(char[] value) throws CFException {
      chipLiabVariables800.setEditNum800(value);
   } 

     /**
	 * 	Update EditNum800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEditNum800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.setEditNum800(source, sourceIndex);
   	
   }
   
   public void setEditNum800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.setEditNum800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EditNum800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEditNum800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.setEditNum800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EditNum800 with another Field
	 *	@param value
	 */
   public void setEditNum800(Field source) {
      chipLiabVariables800.setEditNum800(source);
   }  
   
     /**
	 * 	Update EditNum800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEditNum800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.setEditNum800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EditNum800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEditNum800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.setEditNum800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504P005MsgeridL
	 *	@return ip65504P005MsgeridL
	 */
	public short getIp65504P005MsgeridL() throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup1().getIp65504P005MsgeridL();
	}
	
	/**
	 * 	Update Ip65504P005MsgeridL with the passed value
	 *	@param number
	 */
	public void setIp65504P005MsgeridL(short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup1().setIp65504P005MsgeridL(number);
	}

	public void setIp65504P005MsgeridL(int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup1().setIp65504P005MsgeridL((short)number);
	}

	public void setIp65504P005MsgeridL(long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup1().setIp65504P005MsgeridL((short)number);
	}



	/**
	 *	Returns the value of amtE1750Tem800
	 *	@return amtE1750Tem800
	 */
	public long getAmtE1750Tem800() throws CFException {
   		return amtE1750TemGroup800.getAmtE1750Tem800();
	}


	/**
	 *	Returns String value of amtE1750Tem800
	 *	@return amtE1750Tem800
	 */
	public char[]  getAmtE1750Tem800String() throws CFException {
	     return String.valueOf(amtE1750TemGroup800.getAmtE1750Tem800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1750Tem800IsNumeric()  throws CFException{
	    return amtE1750TemGroup800.amtE1750Tem800IsNumeric();
	}

	/**
	 * 	Update AmtE1750Tem800 with the passed value
	 *	@param number
	 */
	public void setAmtE1750Tem800(long number)  throws CFException{
		amtE1750TemGroup800.setAmtE1750Tem800(number);
	}
	

	
	/**
	 * 	Update AmtE1750Tem800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1750Tem800(char[] value)  throws CFException {
		amtE1750TemGroup800.setAmtE1750Tem800(value);
	}
	
	/**
	 * 	Update AmtE1750Tem800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1750Tem800String(char[] value)  throws CFException{
		amtE1750TemGroup800.setAmtE1750Tem800(value);
	}	

	/**
	 *	Returns the value of tranCurTmp800
	 *	@return tranCurTmp800
	 */
	public int getTranCurTmp800() throws CFException {
   		return work.getTranCurTmp800();
	}


	/**
	 *	Returns String value of tranCurTmp800
	 *	@return tranCurTmp800
	 */
	public char[]  getTranCurTmp800String() throws CFException {
	     return String.valueOf(work.getTranCurTmp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranCurTmp800IsNumeric()  throws CFException{
	    return work.tranCurTmp800IsNumeric();
	}

	/**
	 * 	Update TranCurTmp800 with the passed value
	 *	@param number
	 */
	public void setTranCurTmp800(int number)  throws CFException{
		work.setTranCurTmp800(number);
	}
	

	public void setTranCurTmp800(long number)  throws CFException{
	    work.setTranCurTmp800(number);
	}
	
	
	/**
	 * 	Update TranCurTmp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranCurTmp800(char[] value)  throws CFException {
		work.setTranCurTmp800(value);
	}
	
	/**
	 * 	Update TranCurTmp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranCurTmp800String(char[] value)  throws CFException{
		work.setTranCurTmp800(value);
	}	

	/**
	 *	Returns the value of tranAmtTmp800
	 *	@return tranAmtTmp800
	 */
	public long getTranAmtTmp800() throws CFException {
   		return work.getTranAmtTmp800();
	}


	/**
	 *	Returns String value of tranAmtTmp800
	 *	@return tranAmtTmp800
	 */
	public char[]  getTranAmtTmp800String() throws CFException {
	     return String.valueOf(work.getTranAmtTmp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranAmtTmp800IsNumeric()  throws CFException{
	    return work.tranAmtTmp800IsNumeric();
	}

	/**
	 * 	Update TranAmtTmp800 with the passed value
	 *	@param number
	 */
	public void setTranAmtTmp800(long number)  throws CFException{
		work.setTranAmtTmp800(number);
	}
	

	
	/**
	 * 	Update TranAmtTmp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranAmtTmp800(char[] value)  throws CFException {
		work.setTranAmtTmp800(value);
	}
	
	/**
	 * 	Update TranAmtTmp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranAmtTmp800String(char[] value)  throws CFException{
		work.setTranAmtTmp800(value);
	}	

	/**
	 *	Returns the value of amtE1849Tem800
	 *	@return amtE1849Tem800
	 */
	public long getAmtE1849Tem800() throws CFException {
   		return amtE1849TemGroup800.getAmtE1849Tem800();
	}


	/**
	 *	Returns String value of amtE1849Tem800
	 *	@return amtE1849Tem800
	 */
	public char[]  getAmtE1849Tem800String() throws CFException {
	     return String.valueOf(amtE1849TemGroup800.getAmtE1849Tem800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1849Tem800IsNumeric()  throws CFException{
	    return amtE1849TemGroup800.amtE1849Tem800IsNumeric();
	}

	/**
	 * 	Update AmtE1849Tem800 with the passed value
	 *	@param number
	 */
	public void setAmtE1849Tem800(long number)  throws CFException{
		amtE1849TemGroup800.setAmtE1849Tem800(number);
	}
	

	
	/**
	 * 	Update AmtE1849Tem800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1849Tem800(char[] value)  throws CFException {
		amtE1849TemGroup800.setAmtE1849Tem800(value);
	}
	
	/**
	 * 	Update AmtE1849Tem800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1849Tem800String(char[] value)  throws CFException{
		amtE1849TemGroup800.setAmtE1849Tem800(value);
	}	

	/**
	 *	Returns the value of desc18001849
	 *	@return desc18001849
	 */
   public char[] getDesc18001849() throws CFException  {              
   		return work.getDesc18001849();
   }

  
	/**
	*  set variable desc18001849
	*  @param value
	**/
   public void setDesc18001849(char[] value) throws CFException {
      work.setDesc18001849(value);
   } 

	/**
	 *	Returns the value of amtE1849800
	 *	@return amtE1849800
	 */
	public long getAmtE1849800() throws CFException {
   		return work.getAmtE1849800();
	}


	/**
	 *	Returns String value of amtE1849800
	 *	@return amtE1849800
	 */
	public char[]  getAmtE1849800String() throws CFException {
	     return String.valueOf(work.getAmtE1849800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1849800IsNumeric()  throws CFException{
	    return work.amtE1849800IsNumeric();
	}

	/**
	 * 	Update AmtE1849800 with the passed value
	 *	@param number
	 */
	public void setAmtE1849800(long number)  throws CFException{
		work.setAmtE1849800(number);
	}
	

	
	/**
	 * 	Update AmtE1849800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1849800(char[] value)  throws CFException {
		work.setAmtE1849800(value);
	}
	
	/**
	 * 	Update AmtE1849800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1849800String(char[] value)  throws CFException{
		work.setAmtE1849800(value);
	}	

	/**
	 *	Test condition "Y" for isWrite3Y88800()
	 *	@return  Returns true if isWrite3Y88800() is "Y"
	 */
   public boolean isWrite3Y88800() throws CFException {
      return work.isWrite3Y88800();
   }

	/**
	*  set values "Y"
	*/
   	public void setWrite3Y88800True()  throws CFException{  			
    	work.setWrite3Y88800True();
   	}
	/**
	 *	Test condition "Y" for isWrite2Y88800()
	 *	@return  Returns true if isWrite2Y88800() is "Y"
	 */
   public boolean isWrite2Y88800() throws CFException {
      return work.isWrite2Y88800();
   }

	/**
	*  set values "Y"
	*/
   	public void setWrite2Y88800True()  throws CFException{  			
    	work.setWrite2Y88800True();
   	}
	/**
	 *	Returns the value of desc28001849
	 *	@return desc28001849
	 */
   public char[] getDesc28001849() throws CFException  {              
   		return work.getDesc28001849();
   }

  
	/**
	*  set variable desc28001849
	*  @param value
	**/
   public void setDesc28001849(char[] value) throws CFException {
      work.setDesc28001849(value);
   } 

	/**
	 *	Test condition "Y" for isWrite4Y88800()
	 *	@return  Returns true if isWrite4Y88800() is "Y"
	 */
   public boolean isWrite4Y88800() throws CFException {
      return work.isWrite4Y88800();
   }

	/**
	*  set values "Y"
	*/
   	public void setWrite4Y88800True()  throws CFException{  			
    	work.setWrite4Y88800True();
   	}
	/**
	 *	Returns the value of desc18001750
	 *	@return desc18001750
	 */
   public char[] getDesc18001750() throws CFException  {              
   		return work.getDesc18001750();
   }

  
	/**
	*  set variable desc18001750
	*  @param value
	**/
   public void setDesc18001750(char[] value) throws CFException {
      work.setDesc18001750(value);
   } 

	/**
	 *	Returns the value of amtE1851800
	 *	@return amtE1851800
	 */
	public long getAmtE1851800() throws CFException {
   		return work.getAmtE1851800();
	}


	/**
	 *	Returns String value of amtE1851800
	 *	@return amtE1851800
	 */
	public char[]  getAmtE1851800String() throws CFException {
	     return String.valueOf(work.getAmtE1851800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1851800IsNumeric()  throws CFException{
	    return work.amtE1851800IsNumeric();
	}

	/**
	 * 	Update AmtE1851800 with the passed value
	 *	@param number
	 */
	public void setAmtE1851800(long number)  throws CFException{
		work.setAmtE1851800(number);
	}
	

	
	/**
	 * 	Update AmtE1851800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1851800(char[] value)  throws CFException {
		work.setAmtE1851800(value);
	}
	
	/**
	 * 	Update AmtE1851800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1851800String(char[] value)  throws CFException{
		work.setAmtE1851800(value);
	}	

	/**
	 *	Returns the value of errDesc1800
	 *	@return errDesc1800
	 */
   public char[] getErrDesc1800() throws CFException  {              
   		return chipLiabVariables800.getErrorDesc800().getErrDesc1800();
   }

  
	/**
	*  set variable errDesc1800
	*  @param value
	**/
   public void setErrDesc1800(char[] value) throws CFException {
      chipLiabVariables800.getErrorDesc800().setErrDesc1800(value);
   } 

     /**
	 * 	Update ErrDesc1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrDesc1800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.getErrorDesc800().setErrDesc1800(source, sourceIndex);
   	
   }
   
   public void setErrDesc1800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.getErrorDesc800().setErrDesc1800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrDesc1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrDesc1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getErrorDesc800().setErrDesc1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrDesc1800 with another Field
	 *	@param value
	 */
   public void setErrDesc1800(Field source) {
      chipLiabVariables800.getErrorDesc800().setErrDesc1800(source);
   }  
   
     /**
	 * 	Update ErrDesc1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrDesc1800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.getErrorDesc800().setErrDesc1800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ErrDesc1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrDesc1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getErrorDesc800().setErrDesc1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of desc28001848
	 *	@return desc28001848
	 */
   public char[] getDesc28001848() throws CFException  {              
   		return work.getDesc28001848();
   }

  
	/**
	*  set variable desc28001848
	*  @param value
	**/
   public void setDesc28001848(char[] value) throws CFException {
      work.setDesc28001848(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += amtE1754TemGroup800.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += pds05DataGroup800.hashCode();
        str += amtE1852TemGroup800.hashCode();
        str += ip65504PdsMapGroup.hashCode();
        str += ip66102IpmMsg.hashCode();
        str += l1CtlValues800.hashCode();
        str += work.hashCode();
        str += amtE1848TemGroup800.hashCode();
        str += amtE1851TemGroup800.hashCode();
        str += ip65504SelPdsEntriesAll.hashCode();
        str += amtE1850TemGroup800.hashCode();
        str += amtE1750TemGroup800.hashCode();
        str += chipLiabVariables800.hashCode();
        str += amtE1849TemGroup800.hashCode();
        str += pds841ValuesGroup800.hashCode();
       return str.hashCode();
    }

    public CheckActivityOutCtx clone() {
        CheckActivityOutCtx cloneObj = new CheckActivityOutCtx();
        cloneObj.amtE1754TemGroup800 = new AmtE1754TemGroup800();
        cloneObj.amtE1754TemGroup800.set(amtE1754TemGroup800.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.pds05DataGroup800 = new Pds05DataGroup800();
        cloneObj.pds05DataGroup800.set(pds05DataGroup800.getClonedField());
        cloneObj.amtE1852TemGroup800 = new AmtE1852TemGroup800();
        cloneObj.amtE1852TemGroup800.set(amtE1852TemGroup800.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.l1CtlValues800 = new L1CtlValues800();
        cloneObj.l1CtlValues800.set(l1CtlValues800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.amtE1848TemGroup800 = new AmtE1848TemGroup800();
        cloneObj.amtE1848TemGroup800.set(amtE1848TemGroup800.getClonedField());
        cloneObj.amtE1851TemGroup800 = new AmtE1851TemGroup800();
        cloneObj.amtE1851TemGroup800.set(amtE1851TemGroup800.getClonedField());
        cloneObj.ip65504SelPdsEntriesAll = new Ip65504SelPdsEntriesAll();
        cloneObj.ip65504SelPdsEntriesAll.set(ip65504SelPdsEntriesAll.getClonedField());
        cloneObj.amtE1850TemGroup800 = new AmtE1850TemGroup800();
        cloneObj.amtE1850TemGroup800.set(amtE1850TemGroup800.getClonedField());
        cloneObj.amtE1750TemGroup800 = new AmtE1750TemGroup800();
        cloneObj.amtE1750TemGroup800.set(amtE1750TemGroup800.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        cloneObj.amtE1849TemGroup800 = new AmtE1849TemGroup800();
        cloneObj.amtE1849TemGroup800.set(amtE1849TemGroup800.getClonedField());
        cloneObj.pds841ValuesGroup800 = new Pds841ValuesGroup800();
        cloneObj.pds841ValuesGroup800.set(pds841ValuesGroup800.getClonedField());
        return cloneObj;
    }

    }

    public CheckActivityOutCtx getCheckActivityOutCtx() {
            return new CheckActivityOutCtx();
    }
     public class GetTranAmtInCtx implements Cloneable {
     Ip66102IpmMsg ip66102IpmMsg = Ip809050Ctx.this.getIp66102IpmMsg();
     Work work = Ip809050Ctx.this.getWork();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip809050Ctx.this.getIp65504DeMapGroup();
     Ip65504SelElemEntriesAll ip65504SelElemEntriesAll = Ip809050Ctx.this.getIp65504SelElemEntriesAll();

	/**
	 *	Returns the value of ip65504D04TrxAmtL
	 *	@return ip65504D04TrxAmtL
	 */
	public short getIp65504D04TrxAmtL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D04TrxAmtL();
	}
	
	/**
	 * 	Update Ip65504D04TrxAmtL with the passed value
	 *	@param number
	 */
	public void setIp65504D04TrxAmtL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtL(number);
	}

	public void setIp65504D04TrxAmtL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtL((short)number);
	}

	public void setIp65504D04TrxAmtL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtL((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of ip65504D49TrxCurS
	 *	@return ip65504D49TrxCurS
	 */
	public short getIp65504D49TrxCurS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().getIp65504D49TrxCurS();
	}
	
	/**
	 * 	Update Ip65504D49TrxCurS with the passed value
	 *	@param number
	 */
	public void setIp65504D49TrxCurS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurS(number);
	}

	public void setIp65504D49TrxCurS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurS((short)number);
	}

	public void setIp65504D49TrxCurS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurS((short)number);
	}



	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of ip65504SelElemEnt
	 *	@return ip65504SelElemEnt
	 */
   public char[] getIp65504SelElemEnt(int index) throws CFException  {              
   		return ip65504SelElemEntriesAll.getIp65504SelElemEnt(index);
   }

  
	/**
	*  set variable ip65504SelElemEnt
	*  @param value
	**/
   public void setIp65504SelElemEnt(int index,char[] value) throws CFException {
      ip65504SelElemEntriesAll.setIp65504SelElemEnt((index),value);
   } 

	/**
	 *	Returns the value of valueX300
	 *	@return valueX300
	 */
   public char[] getValueX300() throws CFException  {              
   		return work.getValueX300();
   }

  
	/**
	*  set variable valueX300
	*  @param value
	**/
   public void setValueX300(char[] value) throws CFException {
      work.setValueX300(value);
   } 

	/**
	 *	Returns the value of tranAmtTmp800
	 *	@return tranAmtTmp800
	 */
	public long getTranAmtTmp800() throws CFException {
   		return work.getTranAmtTmp800();
	}


	/**
	 *	Returns String value of tranAmtTmp800
	 *	@return tranAmtTmp800
	 */
	public char[]  getTranAmtTmp800String() throws CFException {
	     return String.valueOf(work.getTranAmtTmp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranAmtTmp800IsNumeric()  throws CFException{
	    return work.tranAmtTmp800IsNumeric();
	}

	/**
	 * 	Update TranAmtTmp800 with the passed value
	 *	@param number
	 */
	public void setTranAmtTmp800(long number)  throws CFException{
		work.setTranAmtTmp800(number);
	}
	

	
	/**
	 * 	Update TranAmtTmp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranAmtTmp800(char[] value)  throws CFException {
		work.setTranAmtTmp800(value);
	}
	
	/**
	 * 	Update TranAmtTmp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranAmtTmp800String(char[] value)  throws CFException{
		work.setTranAmtTmp800(value);
	}	

	/**
	 *	Returns the value of ip65504D04TrxAmtS
	 *	@return ip65504D04TrxAmtS
	 */
	public short getIp65504D04TrxAmtS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D04TrxAmtS();
	}
	
	/**
	 * 	Update Ip65504D04TrxAmtS with the passed value
	 *	@param number
	 */
	public void setIp65504D04TrxAmtS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtS(number);
	}

	public void setIp65504D04TrxAmtS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtS((short)number);
	}

	public void setIp65504D04TrxAmtS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtS((short)number);
	}



	/**
	 *	Returns the value of ip65504D49TrxCurL
	 *	@return ip65504D49TrxCurL
	 */
	public short getIp65504D49TrxCurL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().getIp65504D49TrxCurL();
	}
	
	/**
	 * 	Update Ip65504D49TrxCurL with the passed value
	 *	@param number
	 */
	public void setIp65504D49TrxCurL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurL(number);
	}

	public void setIp65504D49TrxCurL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurL((short)number);
	}

	public void setIp65504D49TrxCurL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurL((short)number);
	}




        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public GetTranAmtOutCtx getGetTranAmtOutCtx() {
            return new GetTranAmtOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmMsg.hashCode();
        str += work.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip65504SelElemEntriesAll.hashCode();
       return str.hashCode();
    }

    public GetTranAmtInCtx clone() {
        GetTranAmtInCtx cloneObj = new GetTranAmtInCtx();
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        return cloneObj;
    }

    }

    public GetTranAmtInCtx getGetTranAmtInCtx() {
            return new GetTranAmtInCtx();
    }
     public class GetTranAmtOutCtx implements Cloneable {
     Ip66102IpmMsg ip66102IpmMsg = Ip809050Ctx.this.getIp66102IpmMsg();
     Work work = Ip809050Ctx.this.getWork();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip809050Ctx.this.getIp65504DeMapGroup();
     Ip65504SelElemEntriesAll ip65504SelElemEntriesAll = Ip809050Ctx.this.getIp65504SelElemEntriesAll();

	/**
	 *	Returns the value of ip65504D04TrxAmtL
	 *	@return ip65504D04TrxAmtL
	 */
	public short getIp65504D04TrxAmtL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D04TrxAmtL();
	}
	
	/**
	 * 	Update Ip65504D04TrxAmtL with the passed value
	 *	@param number
	 */
	public void setIp65504D04TrxAmtL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtL(number);
	}

	public void setIp65504D04TrxAmtL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtL((short)number);
	}

	public void setIp65504D04TrxAmtL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtL((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of ip65504D49TrxCurS
	 *	@return ip65504D49TrxCurS
	 */
	public short getIp65504D49TrxCurS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().getIp65504D49TrxCurS();
	}
	
	/**
	 * 	Update Ip65504D49TrxCurS with the passed value
	 *	@param number
	 */
	public void setIp65504D49TrxCurS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurS(number);
	}

	public void setIp65504D49TrxCurS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurS((short)number);
	}

	public void setIp65504D49TrxCurS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurS((short)number);
	}



	/**
	 *	Returns the value of tranCurTmp800
	 *	@return tranCurTmp800
	 */
	public int getTranCurTmp800() throws CFException {
   		return work.getTranCurTmp800();
	}


	/**
	 *	Returns String value of tranCurTmp800
	 *	@return tranCurTmp800
	 */
	public char[]  getTranCurTmp800String() throws CFException {
	     return String.valueOf(work.getTranCurTmp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranCurTmp800IsNumeric()  throws CFException{
	    return work.tranCurTmp800IsNumeric();
	}

	/**
	 * 	Update TranCurTmp800 with the passed value
	 *	@param number
	 */
	public void setTranCurTmp800(int number)  throws CFException{
		work.setTranCurTmp800(number);
	}
	

	public void setTranCurTmp800(long number)  throws CFException{
	    work.setTranCurTmp800(number);
	}
	
	
	/**
	 * 	Update TranCurTmp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranCurTmp800(char[] value)  throws CFException {
		work.setTranCurTmp800(value);
	}
	
	/**
	 * 	Update TranCurTmp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranCurTmp800String(char[] value)  throws CFException{
		work.setTranCurTmp800(value);
	}	

	/**
	 *	Returns the value of tranCur800
	 *	@return tranCur800
	 */
	public int getTranCur800() throws CFException {
   		return work.getTranCur800();
	}


	/**
	 *	Returns String value of tranCur800
	 *	@return tranCur800
	 */
	public char[]  getTranCur800String() throws CFException {
	     return String.valueOf(work.getTranCur800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranCur800IsNumeric()  throws CFException{
	    return work.tranCur800IsNumeric();
	}

	/**
	 * 	Update TranCur800 with the passed value
	 *	@param number
	 */
	public void setTranCur800(int number)  throws CFException{
		work.setTranCur800(number);
	}
	

	public void setTranCur800(long number)  throws CFException{
	    work.setTranCur800(number);
	}
	
	
	/**
	 * 	Update TranCur800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranCur800(char[] value)  throws CFException {
		work.setTranCur800(value);
	}
	
	/**
	 * 	Update TranCur800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranCur800String(char[] value)  throws CFException{
		work.setTranCur800(value);
	}	

	/**
	 *	Returns the value of tranAmtTmp800
	 *	@return tranAmtTmp800
	 */
	public long getTranAmtTmp800() throws CFException {
   		return work.getTranAmtTmp800();
	}


	/**
	 *	Returns String value of tranAmtTmp800
	 *	@return tranAmtTmp800
	 */
	public char[]  getTranAmtTmp800String() throws CFException {
	     return String.valueOf(work.getTranAmtTmp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranAmtTmp800IsNumeric()  throws CFException{
	    return work.tranAmtTmp800IsNumeric();
	}

	/**
	 * 	Update TranAmtTmp800 with the passed value
	 *	@param number
	 */
	public void setTranAmtTmp800(long number)  throws CFException{
		work.setTranAmtTmp800(number);
	}
	

	
	/**
	 * 	Update TranAmtTmp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranAmtTmp800(char[] value)  throws CFException {
		work.setTranAmtTmp800(value);
	}
	
	/**
	 * 	Update TranAmtTmp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranAmtTmp800String(char[] value)  throws CFException{
		work.setTranAmtTmp800(value);
	}	

	/**
	 *	Returns the value of ip65504D04TrxAmtS
	 *	@return ip65504D04TrxAmtS
	 */
	public short getIp65504D04TrxAmtS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D04TrxAmtS();
	}
	
	/**
	 * 	Update Ip65504D04TrxAmtS with the passed value
	 *	@param number
	 */
	public void setIp65504D04TrxAmtS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtS(number);
	}

	public void setIp65504D04TrxAmtS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtS((short)number);
	}

	public void setIp65504D04TrxAmtS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtS((short)number);
	}



	/**
	 *	Returns the value of tranAmt800
	 *	@return tranAmt800
	 */
	public long getTranAmt800() throws CFException {
   		return work.getTranAmt800();
	}


	/**
	 *	Returns String value of tranAmt800
	 *	@return tranAmt800
	 */
	public char[]  getTranAmt800String() throws CFException {
	     return String.valueOf(work.getTranAmt800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranAmt800IsNumeric()  throws CFException{
	    return work.tranAmt800IsNumeric();
	}

	/**
	 * 	Update TranAmt800 with the passed value
	 *	@param number
	 */
	public void setTranAmt800(long number)  throws CFException{
		work.setTranAmt800(number);
	}
	

	
	/**
	 * 	Update TranAmt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranAmt800(char[] value)  throws CFException {
		work.setTranAmt800(value);
	}
	
	/**
	 * 	Update TranAmt800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranAmt800String(char[] value)  throws CFException{
		work.setTranAmt800(value);
	}	

	/**
	 *	Returns the value of ip65504D49TrxCurL
	 *	@return ip65504D49TrxCurL
	 */
	public short getIp65504D49TrxCurL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().getIp65504D49TrxCurL();
	}
	
	/**
	 * 	Update Ip65504D49TrxCurL with the passed value
	 *	@param number
	 */
	public void setIp65504D49TrxCurL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurL(number);
	}

	public void setIp65504D49TrxCurL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurL((short)number);
	}

	public void setIp65504D49TrxCurL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurL((short)number);
	}




        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmMsg.hashCode();
        str += work.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip65504SelElemEntriesAll.hashCode();
       return str.hashCode();
    }

    public GetTranAmtOutCtx clone() {
        GetTranAmtOutCtx cloneObj = new GetTranAmtOutCtx();
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        return cloneObj;
    }

    }

    public GetTranAmtOutCtx getGetTranAmtOutCtx() {
            return new GetTranAmtOutCtx();
    }
     public class GetCurExpInCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Ip00174EntryFoundGroup ip00174EntryFoundGroup = Ip809050Ctx.this.getIp00174EntryFoundGroup();
     Ip00174TableEntry ip00174TableEntry = Ip809050Ctx.this.getIp00174TableEntry();

	/**
	 *	Returns the value of ptrIp288010800
	 *	@return ptrIp288010800
	 */
   public char[] getPtrIp288010800() throws CFException  {              
   		return work.getPtrIp288010800();
   }

  
	/**
	*  set variable ptrIp288010800
	*  @param value
	**/
   public void setPtrIp288010800(char[] value) throws CFException {
      work.setPtrIp288010800(value);
   } 

	/**
	 *	Returns the value of tranCurTmp800
	 *	@return tranCurTmp800
	 */
	public int getTranCurTmp800() throws CFException {
   		return work.getTranCurTmp800();
	}


	/**
	 *	Returns String value of tranCurTmp800
	 *	@return tranCurTmp800
	 */
	public char[]  getTranCurTmp800String() throws CFException {
	     return String.valueOf(work.getTranCurTmp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranCurTmp800IsNumeric()  throws CFException{
	    return work.tranCurTmp800IsNumeric();
	}

	/**
	 * 	Update TranCurTmp800 with the passed value
	 *	@param number
	 */
	public void setTranCurTmp800(int number)  throws CFException{
		work.setTranCurTmp800(number);
	}
	

	public void setTranCurTmp800(long number)  throws CFException{
	    work.setTranCurTmp800(number);
	}
	
	
	/**
	 * 	Update TranCurTmp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranCurTmp800(char[] value)  throws CFException {
		work.setTranCurTmp800(value);
	}
	
	/**
	 * 	Update TranCurTmp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranCurTmp800String(char[] value)  throws CFException{
		work.setTranCurTmp800(value);
	}	

	/**
	 *	Test condition "Y" for isIp00174EntryFoundY88()
	 *	@return  Returns true if isIp00174EntryFoundY88() is "Y"
	 */
   public boolean isIp00174EntryFoundY88() throws CFException {
      return ip00174EntryFoundGroup.isIp00174EntryFoundY88();
   }

	/**
	*  set values "Y"
	*/
   	public void setIp00174EntryFoundY88True()  throws CFException{  			
    	ip00174EntryFoundGroup.setIp00174EntryFoundY88True();
   	}
	/**
	 *	Returns the value of ip00174CurExpCode
	 *	@return ip00174CurExpCode
	 */
	public int getIp00174CurExpCode() throws CFException {
   		return ip00174TableEntry.getIp00174CurExpCode();
	}


	/**
	 *	Returns String value of ip00174CurExpCode
	 *	@return ip00174CurExpCode
	 */
	public char[]  getIp00174CurExpCodeString() throws CFException {
	     return String.valueOf(ip00174TableEntry.getIp00174CurExpCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00174CurExpCodeIsNumeric()  throws CFException{
	    return ip00174TableEntry.ip00174CurExpCodeIsNumeric();
	}

	/**
	 * 	Update Ip00174CurExpCode with the passed value
	 *	@param number
	 */
	public void setIp00174CurExpCode(int number)  throws CFException{
		ip00174TableEntry.setIp00174CurExpCode(number);
	}
	

	public void setIp00174CurExpCode(long number)  throws CFException{
	    ip00174TableEntry.setIp00174CurExpCode(number);
	}
	
	
	/**
	 * 	Update Ip00174CurExpCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00174CurExpCode(char[] value)  throws CFException {
		ip00174TableEntry.setIp00174CurExpCode(value);
	}
	
	/**
	 * 	Update Ip00174CurExpCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00174CurExpCodeString(char[] value)  throws CFException{
		ip00174TableEntry.setIp00174CurExpCode(value);
	}	

	/**
	 *	Returns the value of tranAmtTmp800
	 *	@return tranAmtTmp800
	 */
	public long getTranAmtTmp800() throws CFException {
   		return work.getTranAmtTmp800();
	}


	/**
	 *	Returns String value of tranAmtTmp800
	 *	@return tranAmtTmp800
	 */
	public char[]  getTranAmtTmp800String() throws CFException {
	     return String.valueOf(work.getTranAmtTmp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranAmtTmp800IsNumeric()  throws CFException{
	    return work.tranAmtTmp800IsNumeric();
	}

	/**
	 * 	Update TranAmtTmp800 with the passed value
	 *	@param number
	 */
	public void setTranAmtTmp800(long number)  throws CFException{
		work.setTranAmtTmp800(number);
	}
	

	
	/**
	 * 	Update TranAmtTmp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranAmtTmp800(char[] value)  throws CFException {
		work.setTranAmtTmp800(value);
	}
	
	/**
	 * 	Update TranAmtTmp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranAmtTmp800String(char[] value)  throws CFException{
		work.setTranAmtTmp800(value);
	}	


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public GetCurExpOutCtx getGetCurExpOutCtx() {
            return new GetCurExpOutCtx();
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
        str += ip00174EntryFoundGroup.hashCode();
        str += ip00174TableEntry.hashCode();
       return str.hashCode();
    }

    public GetCurExpInCtx clone() {
        GetCurExpInCtx cloneObj = new GetCurExpInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip00174EntryFoundGroup = new Ip00174EntryFoundGroup();
        cloneObj.ip00174EntryFoundGroup.set(ip00174EntryFoundGroup.getClonedField());
        cloneObj.ip00174TableEntry = new Ip00174TableEntry();
        cloneObj.ip00174TableEntry.set(ip00174TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public GetCurExpInCtx getGetCurExpInCtx() {
            return new GetCurExpInCtx();
    }
     public class GetCurExpOutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Ip00174EntryFoundGroup ip00174EntryFoundGroup = Ip809050Ctx.this.getIp00174EntryFoundGroup();
     Ip00174TableEntry ip00174TableEntry = Ip809050Ctx.this.getIp00174TableEntry();

	/**
	 *	Returns the value of ip00174CurrCdCode
	 *	@return ip00174CurrCdCode
	 */
	public int getIp00174CurrCdCode() throws CFException {
   		return ip00174TableEntry.getIp00174CurrCdKey().getIp00174CurrCdCode();
	}


	/**
	 *	Returns String value of ip00174CurrCdCode
	 *	@return ip00174CurrCdCode
	 */
	public char[]  getIp00174CurrCdCodeString() throws CFException {
	     return String.valueOf(ip00174TableEntry.getIp00174CurrCdKey().getIp00174CurrCdCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00174CurrCdCodeIsNumeric()  throws CFException{
	    return ip00174TableEntry.getIp00174CurrCdKey().ip00174CurrCdCodeIsNumeric();
	}

	/**
	 * 	Update Ip00174CurrCdCode with the passed value
	 *	@param number
	 */
	public void setIp00174CurrCdCode(int number)  throws CFException{
		ip00174TableEntry.getIp00174CurrCdKey().setIp00174CurrCdCode(number);
	}
	

	public void setIp00174CurrCdCode(long number)  throws CFException{
	    ip00174TableEntry.getIp00174CurrCdKey().setIp00174CurrCdCode(number);
	}
	
	
	/**
	 * 	Update Ip00174CurrCdCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00174CurrCdCode(char[] value)  throws CFException {
		ip00174TableEntry.getIp00174CurrCdKey().setIp00174CurrCdCode(value);
	}
	
	/**
	 * 	Update Ip00174CurrCdCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00174CurrCdCodeString(char[] value)  throws CFException{
		ip00174TableEntry.getIp00174CurrCdKey().setIp00174CurrCdCode(value);
	}	

	/**
	 *	Returns the value of tranCurTmp800
	 *	@return tranCurTmp800
	 */
	public int getTranCurTmp800() throws CFException {
   		return work.getTranCurTmp800();
	}


	/**
	 *	Returns String value of tranCurTmp800
	 *	@return tranCurTmp800
	 */
	public char[]  getTranCurTmp800String() throws CFException {
	     return String.valueOf(work.getTranCurTmp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranCurTmp800IsNumeric()  throws CFException{
	    return work.tranCurTmp800IsNumeric();
	}

	/**
	 * 	Update TranCurTmp800 with the passed value
	 *	@param number
	 */
	public void setTranCurTmp800(int number)  throws CFException{
		work.setTranCurTmp800(number);
	}
	

	public void setTranCurTmp800(long number)  throws CFException{
	    work.setTranCurTmp800(number);
	}
	
	
	/**
	 * 	Update TranCurTmp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranCurTmp800(char[] value)  throws CFException {
		work.setTranCurTmp800(value);
	}
	
	/**
	 * 	Update TranCurTmp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranCurTmp800String(char[] value)  throws CFException{
		work.setTranCurTmp800(value);
	}	

	/**
	 *	Returns the value of tranCur800
	 *	@return tranCur800
	 */
	public int getTranCur800() throws CFException {
   		return work.getTranCur800();
	}


	/**
	 *	Returns String value of tranCur800
	 *	@return tranCur800
	 */
	public char[]  getTranCur800String() throws CFException {
	     return String.valueOf(work.getTranCur800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranCur800IsNumeric()  throws CFException{
	    return work.tranCur800IsNumeric();
	}

	/**
	 * 	Update TranCur800 with the passed value
	 *	@param number
	 */
	public void setTranCur800(int number)  throws CFException{
		work.setTranCur800(number);
	}
	

	public void setTranCur800(long number)  throws CFException{
	    work.setTranCur800(number);
	}
	
	
	/**
	 * 	Update TranCur800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranCur800(char[] value)  throws CFException {
		work.setTranCur800(value);
	}
	
	/**
	 * 	Update TranCur800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranCur800String(char[] value)  throws CFException{
		work.setTranCur800(value);
	}	

	/**
	 *	Returns the value of tranCurExp800
	 *	@return tranCurExp800
	 */
	public int getTranCurExp800() throws CFException {
   		return work.getTranCurExp800();
	}


	/**
	 *	Returns String value of tranCurExp800
	 *	@return tranCurExp800
	 */
	public char[]  getTranCurExp800String() throws CFException {
	     return String.valueOf(work.getTranCurExp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranCurExp800IsNumeric()  throws CFException{
	    return work.tranCurExp800IsNumeric();
	}

	/**
	 * 	Update TranCurExp800 with the passed value
	 *	@param number
	 */
	public void setTranCurExp800(int number)  throws CFException{
		work.setTranCurExp800(number);
	}
	

	public void setTranCurExp800(long number)  throws CFException{
	    work.setTranCurExp800(number);
	}
	
	
	/**
	 * 	Update TranCurExp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranCurExp800(char[] value)  throws CFException {
		work.setTranCurExp800(value);
	}
	
	/**
	 * 	Update TranCurExp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranCurExp800String(char[] value)  throws CFException{
		work.setTranCurExp800(value);
	}	

	/**
	 *	Returns the value of ip00174CurExpCode
	 *	@return ip00174CurExpCode
	 */
	public int getIp00174CurExpCode() throws CFException {
   		return ip00174TableEntry.getIp00174CurExpCode();
	}


	/**
	 *	Returns String value of ip00174CurExpCode
	 *	@return ip00174CurExpCode
	 */
	public char[]  getIp00174CurExpCodeString() throws CFException {
	     return String.valueOf(ip00174TableEntry.getIp00174CurExpCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00174CurExpCodeIsNumeric()  throws CFException{
	    return ip00174TableEntry.ip00174CurExpCodeIsNumeric();
	}

	/**
	 * 	Update Ip00174CurExpCode with the passed value
	 *	@param number
	 */
	public void setIp00174CurExpCode(int number)  throws CFException{
		ip00174TableEntry.setIp00174CurExpCode(number);
	}
	

	public void setIp00174CurExpCode(long number)  throws CFException{
	    ip00174TableEntry.setIp00174CurExpCode(number);
	}
	
	
	/**
	 * 	Update Ip00174CurExpCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00174CurExpCode(char[] value)  throws CFException {
		ip00174TableEntry.setIp00174CurExpCode(value);
	}
	
	/**
	 * 	Update Ip00174CurExpCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00174CurExpCodeString(char[] value)  throws CFException{
		ip00174TableEntry.setIp00174CurExpCode(value);
	}	

	/**
	 *	Returns the value of tranAmtTmp800
	 *	@return tranAmtTmp800
	 */
	public long getTranAmtTmp800() throws CFException {
   		return work.getTranAmtTmp800();
	}


	/**
	 *	Returns String value of tranAmtTmp800
	 *	@return tranAmtTmp800
	 */
	public char[]  getTranAmtTmp800String() throws CFException {
	     return String.valueOf(work.getTranAmtTmp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranAmtTmp800IsNumeric()  throws CFException{
	    return work.tranAmtTmp800IsNumeric();
	}

	/**
	 * 	Update TranAmtTmp800 with the passed value
	 *	@param number
	 */
	public void setTranAmtTmp800(long number)  throws CFException{
		work.setTranAmtTmp800(number);
	}
	

	
	/**
	 * 	Update TranAmtTmp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranAmtTmp800(char[] value)  throws CFException {
		work.setTranAmtTmp800(value);
	}
	
	/**
	 * 	Update TranAmtTmp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranAmtTmp800String(char[] value)  throws CFException{
		work.setTranAmtTmp800(value);
	}	

	/**
	 *	Returns the value of tranAmt800
	 *	@return tranAmt800
	 */
	public long getTranAmt800() throws CFException {
   		return work.getTranAmt800();
	}


	/**
	 *	Returns String value of tranAmt800
	 *	@return tranAmt800
	 */
	public char[]  getTranAmt800String() throws CFException {
	     return String.valueOf(work.getTranAmt800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranAmt800IsNumeric()  throws CFException{
	    return work.tranAmt800IsNumeric();
	}

	/**
	 * 	Update TranAmt800 with the passed value
	 *	@param number
	 */
	public void setTranAmt800(long number)  throws CFException{
		work.setTranAmt800(number);
	}
	

	
	/**
	 * 	Update TranAmt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranAmt800(char[] value)  throws CFException {
		work.setTranAmt800(value);
	}
	
	/**
	 * 	Update TranAmt800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranAmt800String(char[] value)  throws CFException{
		work.setTranAmt800(value);
	}	


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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
        str += ip00174EntryFoundGroup.hashCode();
        str += ip00174TableEntry.hashCode();
       return str.hashCode();
    }

    public GetCurExpOutCtx clone() {
        GetCurExpOutCtx cloneObj = new GetCurExpOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip00174EntryFoundGroup = new Ip00174EntryFoundGroup();
        cloneObj.ip00174EntryFoundGroup.set(ip00174EntryFoundGroup.getClonedField());
        cloneObj.ip00174TableEntry = new Ip00174TableEntry();
        cloneObj.ip00174TableEntry.set(ip00174TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public GetCurExpOutCtx getGetCurExpOutCtx() {
            return new GetCurExpOutCtx();
    }
     public class CurConvLogicInCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Ip33701CurrConvInterface ip33701CurrConvInterface = Ip809050Ctx.this.getIp33701CurrConvInterface();
     Ip00694TableEntry ip00694TableEntry = Ip809050Ctx.this.getIp00694TableEntry();

	/**
	 *	Returns the value of fxDateYyddd800
	 *	@return fxDateYyddd800
	 */
	public long getFxDateYyddd800() throws CFException {
   		return work.getFxDateYyddd800();
	}


	/**
	 *	Returns String value of fxDateYyddd800
	 *	@return fxDateYyddd800
	 */
	public char[]  getFxDateYyddd800String() throws CFException {
	     return String.valueOf(work.getFxDateYyddd800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fxDateYyddd800IsNumeric()  throws CFException{
	    return work.fxDateYyddd800IsNumeric();
	}

	/**
	 * 	Update FxDateYyddd800 with the passed value
	 *	@param number
	 */
	public void setFxDateYyddd800(long number)  throws CFException{
		work.setFxDateYyddd800(number);
	}
	

	
	/**
	 * 	Update FxDateYyddd800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFxDateYyddd800(char[] value)  throws CFException {
		work.setFxDateYyddd800(value);
	}
	
	/**
	 * 	Update FxDateYyddd800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFxDateYyddd800String(char[] value)  throws CFException{
		work.setFxDateYyddd800(value);
	}	

	/**
	 *	Returns the value of ip00694GlobalCurrCode
	 *	@return ip00694GlobalCurrCode
	 */
	public int getIp00694GlobalCurrCode() throws CFException {
   		return ip00694TableEntry.getIp00694TableData().getIp00694GlobalCurrCode();
	}


	/**
	 *	Returns String value of ip00694GlobalCurrCode
	 *	@return ip00694GlobalCurrCode
	 */
	public char[]  getIp00694GlobalCurrCodeString() throws CFException {
	     return String.valueOf(ip00694TableEntry.getIp00694TableData().getIp00694GlobalCurrCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00694GlobalCurrCodeIsNumeric()  throws CFException{
	    return ip00694TableEntry.getIp00694TableData().ip00694GlobalCurrCodeIsNumeric();
	}

	/**
	 * 	Update Ip00694GlobalCurrCode with the passed value
	 *	@param number
	 */
	public void setIp00694GlobalCurrCode(int number)  throws CFException{
		ip00694TableEntry.getIp00694TableData().setIp00694GlobalCurrCode(number);
	}
	

	public void setIp00694GlobalCurrCode(long number)  throws CFException{
	    ip00694TableEntry.getIp00694TableData().setIp00694GlobalCurrCode(number);
	}
	
	
	/**
	 * 	Update Ip00694GlobalCurrCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00694GlobalCurrCode(char[] value)  throws CFException {
		ip00694TableEntry.getIp00694TableData().setIp00694GlobalCurrCode(value);
	}
	
	/**
	 * 	Update Ip00694GlobalCurrCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00694GlobalCurrCodeString(char[] value)  throws CFException{
		ip00694TableEntry.getIp00694TableData().setIp00694GlobalCurrCode(value);
	}	

	/**
	 *	Returns the value of tranCurTmp800
	 *	@return tranCurTmp800
	 */
	public int getTranCurTmp800() throws CFException {
   		return work.getTranCurTmp800();
	}


	/**
	 *	Returns String value of tranCurTmp800
	 *	@return tranCurTmp800
	 */
	public char[]  getTranCurTmp800String() throws CFException {
	     return String.valueOf(work.getTranCurTmp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranCurTmp800IsNumeric()  throws CFException{
	    return work.tranCurTmp800IsNumeric();
	}

	/**
	 * 	Update TranCurTmp800 with the passed value
	 *	@param number
	 */
	public void setTranCurTmp800(int number)  throws CFException{
		work.setTranCurTmp800(number);
	}
	

	public void setTranCurTmp800(long number)  throws CFException{
	    work.setTranCurTmp800(number);
	}
	
	
	/**
	 * 	Update TranCurTmp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranCurTmp800(char[] value)  throws CFException {
		work.setTranCurTmp800(value);
	}
	
	/**
	 * 	Update TranCurTmp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranCurTmp800String(char[] value)  throws CFException{
		work.setTranCurTmp800(value);
	}	

	/**
	 *	Returns the value of ip00694GlobalCurrExp
	 *	@return ip00694GlobalCurrExp
	 */
	public int getIp00694GlobalCurrExp() throws CFException {
   		return ip00694TableEntry.getIp00694TableData().getIp00694GlobalCurrExp();
	}


	/**
	 *	Returns String value of ip00694GlobalCurrExp
	 *	@return ip00694GlobalCurrExp
	 */
	public char[]  getIp00694GlobalCurrExpString() throws CFException {
	     return String.valueOf(ip00694TableEntry.getIp00694TableData().getIp00694GlobalCurrExpString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00694GlobalCurrExpIsNumeric()  throws CFException{
	    return ip00694TableEntry.getIp00694TableData().ip00694GlobalCurrExpIsNumeric();
	}

	/**
	 * 	Update Ip00694GlobalCurrExp with the passed value
	 *	@param number
	 */
	public void setIp00694GlobalCurrExp(int number)  throws CFException{
		ip00694TableEntry.getIp00694TableData().setIp00694GlobalCurrExp(number);
	}
	

	public void setIp00694GlobalCurrExp(long number)  throws CFException{
	    ip00694TableEntry.getIp00694TableData().setIp00694GlobalCurrExp(number);
	}
	
	
	/**
	 * 	Update Ip00694GlobalCurrExp with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00694GlobalCurrExp(char[] value)  throws CFException {
		ip00694TableEntry.getIp00694TableData().setIp00694GlobalCurrExp(value);
	}
	
	/**
	 * 	Update Ip00694GlobalCurrExp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00694GlobalCurrExpString(char[] value)  throws CFException{
		ip00694TableEntry.getIp00694TableData().setIp00694GlobalCurrExp(value);
	}	

	/**
	 *	Returns the value of tranAmtTmp800
	 *	@return tranAmtTmp800
	 */
	public long getTranAmtTmp800() throws CFException {
   		return work.getTranAmtTmp800();
	}


	/**
	 *	Returns String value of tranAmtTmp800
	 *	@return tranAmtTmp800
	 */
	public char[]  getTranAmtTmp800String() throws CFException {
	     return String.valueOf(work.getTranAmtTmp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranAmtTmp800IsNumeric()  throws CFException{
	    return work.tranAmtTmp800IsNumeric();
	}

	/**
	 * 	Update TranAmtTmp800 with the passed value
	 *	@param number
	 */
	public void setTranAmtTmp800(long number)  throws CFException{
		work.setTranAmtTmp800(number);
	}
	

	
	/**
	 * 	Update TranAmtTmp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranAmtTmp800(char[] value)  throws CFException {
		work.setTranAmtTmp800(value);
	}
	
	/**
	 * 	Update TranAmtTmp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranAmtTmp800String(char[] value)  throws CFException{
		work.setTranAmtTmp800(value);
	}	

	/**
	 *	Returns the value of tranCurExp800
	 *	@return tranCurExp800
	 */
	public int getTranCurExp800() throws CFException {
   		return work.getTranCurExp800();
	}


	/**
	 *	Returns String value of tranCurExp800
	 *	@return tranCurExp800
	 */
	public char[]  getTranCurExp800String() throws CFException {
	     return String.valueOf(work.getTranCurExp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranCurExp800IsNumeric()  throws CFException{
	    return work.tranCurExp800IsNumeric();
	}

	/**
	 * 	Update TranCurExp800 with the passed value
	 *	@param number
	 */
	public void setTranCurExp800(int number)  throws CFException{
		work.setTranCurExp800(number);
	}
	

	public void setTranCurExp800(long number)  throws CFException{
	    work.setTranCurExp800(number);
	}
	
	
	/**
	 * 	Update TranCurExp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranCurExp800(char[] value)  throws CFException {
		work.setTranCurExp800(value);
	}
	
	/**
	 * 	Update TranCurExp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranCurExp800String(char[] value)  throws CFException{
		work.setTranCurExp800(value);
	}	


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public CurConvLogicOutCtx getCurConvLogicOutCtx() {
            return new CurConvLogicOutCtx();
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
        str += ip33701CurrConvInterface.hashCode();
        str += ip00694TableEntry.hashCode();
       return str.hashCode();
    }

    public CurConvLogicInCtx clone() {
        CurConvLogicInCtx cloneObj = new CurConvLogicInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip33701CurrConvInterface = new Ip33701CurrConvInterface();
        cloneObj.ip33701CurrConvInterface.set(ip33701CurrConvInterface.getClonedField());
        cloneObj.ip00694TableEntry = new Ip00694TableEntry();
        cloneObj.ip00694TableEntry.set(ip00694TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public CurConvLogicInCtx getCurConvLogicInCtx() {
            return new CurConvLogicInCtx();
    }
     public class CurConvLogicOutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Ip33701CurrConvInterface ip33701CurrConvInterface = Ip809050Ctx.this.getIp33701CurrConvInterface();
     Ip00694TableEntry ip00694TableEntry = Ip809050Ctx.this.getIp00694TableEntry();

	/**
	 *	Returns the value of ip33701TargetCurExp
	 *	@return ip33701TargetCurExp
	 */
   public char[] getIp33701TargetCurExp() throws CFException  {              
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurExp();
   }

  
	/**
	*  set variable ip33701TargetCurExp
	*  @param value
	**/
   public void setIp33701TargetCurExp(char[] value) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(value);
   } 

     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701TargetCurExp(char[] source, int sourceIndex) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex);
   	
   }
   
   public void setIp33701TargetCurExp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701TargetCurExp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip33701TargetCurExp with another Field
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source);
   }  
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source, int sourceIndex,int sourceLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "D" for isIp33701DivideByRate88()
	 *	@return  Returns true if isIp33701DivideByRate88() is "D"
	 */
   public boolean isIp33701DivideByRate88() throws CFException {
      return ip33701CurrConvInterface.getIp33701CurrConvInput().isIp33701DivideByRate88();
   }

	/**
	*  set values "D"
	*/
   	public void setIp33701DivideByRate88True()  throws CFException{  			
    	ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701DivideByRate88True();
   	}
	/**
	 *	Returns the value of ip00694GlobalCurrCode
	 *	@return ip00694GlobalCurrCode
	 */
	public int getIp00694GlobalCurrCode() throws CFException {
   		return ip00694TableEntry.getIp00694TableData().getIp00694GlobalCurrCode();
	}


	/**
	 *	Returns String value of ip00694GlobalCurrCode
	 *	@return ip00694GlobalCurrCode
	 */
	public char[]  getIp00694GlobalCurrCodeString() throws CFException {
	     return String.valueOf(ip00694TableEntry.getIp00694TableData().getIp00694GlobalCurrCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00694GlobalCurrCodeIsNumeric()  throws CFException{
	    return ip00694TableEntry.getIp00694TableData().ip00694GlobalCurrCodeIsNumeric();
	}

	/**
	 * 	Update Ip00694GlobalCurrCode with the passed value
	 *	@param number
	 */
	public void setIp00694GlobalCurrCode(int number)  throws CFException{
		ip00694TableEntry.getIp00694TableData().setIp00694GlobalCurrCode(number);
	}
	

	public void setIp00694GlobalCurrCode(long number)  throws CFException{
	    ip00694TableEntry.getIp00694TableData().setIp00694GlobalCurrCode(number);
	}
	
	
	/**
	 * 	Update Ip00694GlobalCurrCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00694GlobalCurrCode(char[] value)  throws CFException {
		ip00694TableEntry.getIp00694TableData().setIp00694GlobalCurrCode(value);
	}
	
	/**
	 * 	Update Ip00694GlobalCurrCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00694GlobalCurrCodeString(char[] value)  throws CFException{
		ip00694TableEntry.getIp00694TableData().setIp00694GlobalCurrCode(value);
	}	

	/**
	 *	Returns the value of ip33701SourceCurCode
	 *	@return ip33701SourceCurCode
	 */
	public int getIp33701SourceCurCode() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceCurCode();
	}


	/**
	 *	Returns String value of ip33701SourceCurCode
	 *	@return ip33701SourceCurCode
	 */
	public char[]  getIp33701SourceCurCodeString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceCurCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701SourceCurCodeIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvInput().ip33701SourceCurCodeIsNumeric();
	}

	/**
	 * 	Update Ip33701SourceCurCode with the passed value
	 *	@param number
	 */
	public void setIp33701SourceCurCode(int number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(number);
	}
	

	public void setIp33701SourceCurCode(long number)  throws CFException{
	    ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(number);
	}
	
	
	/**
	 * 	Update Ip33701SourceCurCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceCurCode(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(value);
	}
	
	/**
	 * 	Update Ip33701SourceCurCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceCurCodeString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(value);
	}	

	/**
	 *	Test condition "N" for isIp33701NoCrossRate88()
	 *	@return  Returns true if isIp33701NoCrossRate88() is "N"
	 */
   public boolean isIp33701NoCrossRate88() throws CFException {
      return ip33701CurrConvInterface.getIp33701CurrConvInput().isIp33701NoCrossRate88();
   }

	/**
	*  set values "N"
	*/
   	public void setIp33701NoCrossRate88True()  throws CFException{  			
    	ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701NoCrossRate88True();
   	}
	/**
	 *	Returns the value of tranCurTmp800
	 *	@return tranCurTmp800
	 */
	public int getTranCurTmp800() throws CFException {
   		return work.getTranCurTmp800();
	}


	/**
	 *	Returns String value of tranCurTmp800
	 *	@return tranCurTmp800
	 */
	public char[]  getTranCurTmp800String() throws CFException {
	     return String.valueOf(work.getTranCurTmp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranCurTmp800IsNumeric()  throws CFException{
	    return work.tranCurTmp800IsNumeric();
	}

	/**
	 * 	Update TranCurTmp800 with the passed value
	 *	@param number
	 */
	public void setTranCurTmp800(int number)  throws CFException{
		work.setTranCurTmp800(number);
	}
	

	public void setTranCurTmp800(long number)  throws CFException{
	    work.setTranCurTmp800(number);
	}
	
	
	/**
	 * 	Update TranCurTmp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranCurTmp800(char[] value)  throws CFException {
		work.setTranCurTmp800(value);
	}
	
	/**
	 * 	Update TranCurTmp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranCurTmp800String(char[] value)  throws CFException{
		work.setTranCurTmp800(value);
	}	

	/**
	 *	Returns the value of ip00694GlobalCurrExp
	 *	@return ip00694GlobalCurrExp
	 */
	public int getIp00694GlobalCurrExp() throws CFException {
   		return ip00694TableEntry.getIp00694TableData().getIp00694GlobalCurrExp();
	}


	/**
	 *	Returns String value of ip00694GlobalCurrExp
	 *	@return ip00694GlobalCurrExp
	 */
	public char[]  getIp00694GlobalCurrExpString() throws CFException {
	     return String.valueOf(ip00694TableEntry.getIp00694TableData().getIp00694GlobalCurrExpString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00694GlobalCurrExpIsNumeric()  throws CFException{
	    return ip00694TableEntry.getIp00694TableData().ip00694GlobalCurrExpIsNumeric();
	}

	/**
	 * 	Update Ip00694GlobalCurrExp with the passed value
	 *	@param number
	 */
	public void setIp00694GlobalCurrExp(int number)  throws CFException{
		ip00694TableEntry.getIp00694TableData().setIp00694GlobalCurrExp(number);
	}
	

	public void setIp00694GlobalCurrExp(long number)  throws CFException{
	    ip00694TableEntry.getIp00694TableData().setIp00694GlobalCurrExp(number);
	}
	
	
	/**
	 * 	Update Ip00694GlobalCurrExp with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00694GlobalCurrExp(char[] value)  throws CFException {
		ip00694TableEntry.getIp00694TableData().setIp00694GlobalCurrExp(value);
	}
	
	/**
	 * 	Update Ip00694GlobalCurrExp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00694GlobalCurrExpString(char[] value)  throws CFException{
		ip00694TableEntry.getIp00694TableData().setIp00694GlobalCurrExp(value);
	}	

	/**
	 *	Returns the value of tranAmtTmp800
	 *	@return tranAmtTmp800
	 */
	public long getTranAmtTmp800() throws CFException {
   		return work.getTranAmtTmp800();
	}


	/**
	 *	Returns String value of tranAmtTmp800
	 *	@return tranAmtTmp800
	 */
	public char[]  getTranAmtTmp800String() throws CFException {
	     return String.valueOf(work.getTranAmtTmp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranAmtTmp800IsNumeric()  throws CFException{
	    return work.tranAmtTmp800IsNumeric();
	}

	/**
	 * 	Update TranAmtTmp800 with the passed value
	 *	@param number
	 */
	public void setTranAmtTmp800(long number)  throws CFException{
		work.setTranAmtTmp800(number);
	}
	

	
	/**
	 * 	Update TranAmtTmp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranAmtTmp800(char[] value)  throws CFException {
		work.setTranAmtTmp800(value);
	}
	
	/**
	 * 	Update TranAmtTmp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranAmtTmp800String(char[] value)  throws CFException{
		work.setTranAmtTmp800(value);
	}	

	/**
	 *	Returns the value of tranCurExp800
	 *	@return tranCurExp800
	 */
	public int getTranCurExp800() throws CFException {
   		return work.getTranCurExp800();
	}


	/**
	 *	Returns String value of tranCurExp800
	 *	@return tranCurExp800
	 */
	public char[]  getTranCurExp800String() throws CFException {
	     return String.valueOf(work.getTranCurExp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranCurExp800IsNumeric()  throws CFException{
	    return work.tranCurExp800IsNumeric();
	}

	/**
	 * 	Update TranCurExp800 with the passed value
	 *	@param number
	 */
	public void setTranCurExp800(int number)  throws CFException{
		work.setTranCurExp800(number);
	}
	

	public void setTranCurExp800(long number)  throws CFException{
	    work.setTranCurExp800(number);
	}
	
	
	/**
	 * 	Update TranCurExp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranCurExp800(char[] value)  throws CFException {
		work.setTranCurExp800(value);
	}
	
	/**
	 * 	Update TranCurExp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranCurExp800String(char[] value)  throws CFException{
		work.setTranCurExp800(value);
	}	

	/**
	 *	Returns the value of ip33701FxDateYyddd
	 *	@return ip33701FxDateYyddd
	 */
	public long getIp33701FxDateYyddd() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701FxDateYyddd();
	}


	/**
	 *	Returns String value of ip33701FxDateYyddd
	 *	@return ip33701FxDateYyddd
	 */
	public char[]  getIp33701FxDateYydddString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701FxDateYydddString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701FxDateYydddIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvInput().ip33701FxDateYydddIsNumeric();
	}

	/**
	 * 	Update Ip33701FxDateYyddd with the passed value
	 *	@param number
	 */
	public void setIp33701FxDateYyddd(long number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701FxDateYyddd(number);
	}
	

	
	/**
	 * 	Update Ip33701FxDateYyddd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701FxDateYyddd(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701FxDateYyddd(value);
	}
	
	/**
	 * 	Update Ip33701FxDateYyddd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701FxDateYydddString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701FxDateYyddd(value);
	}	

	/**
	 *	Returns the value of ip33701SourceAmount
	 *	@return ip33701SourceAmount
	 */
	public long getIp33701SourceAmount() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceAmount();
	}

    /**
	 *	Returns the String value of ip33701SourceAmount
	 *	@return ip33701SourceAmount
	 */
	public char[]  getIp33701SourceAmountActualString() {
		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceAmountActualString();
	}

	/**
	 *	Returns String value of ip33701SourceAmount
	 *	@return ip33701SourceAmount
	 */
	public char[]  getIp33701SourceAmountString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceAmountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701SourceAmountIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvInput().ip33701SourceAmountIsNumeric();
	}

	/**
	 * 	Update Ip33701SourceAmount with the passed value
	 *	@param number
	 */
	public void setIp33701SourceAmount(long number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceAmount(number);
	}
	

	
	/**
	 * 	Update Ip33701SourceAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceAmount(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceAmount(value);
	}
	
	/**
	 * 	Update Ip33701SourceAmount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceAmountString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceAmount(value);
	}	

	/**
	 *	Test condition "3" for isIp33701Xrate1MidRt88()
	 *	@return  Returns true if isIp33701Xrate1MidRt88() is "3"
	 */
   public boolean isIp33701Xrate1MidRt88() throws CFException {
      return ip33701CurrConvInterface.getIp33701CurrConvInput().isIp33701Xrate1MidRt88();
   }

	/**
	*  set values "3"
	*/
   	public void setIp33701Xrate1MidRt88True()  throws CFException{  			
    	ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701Xrate1MidRt88True();
   	}
	/**
	 *	Returns the value of fxDateYyddd800
	 *	@return fxDateYyddd800
	 */
	public long getFxDateYyddd800() throws CFException {
   		return work.getFxDateYyddd800();
	}


	/**
	 *	Returns String value of fxDateYyddd800
	 *	@return fxDateYyddd800
	 */
	public char[]  getFxDateYyddd800String() throws CFException {
	     return String.valueOf(work.getFxDateYyddd800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fxDateYyddd800IsNumeric()  throws CFException{
	    return work.fxDateYyddd800IsNumeric();
	}

	/**
	 * 	Update FxDateYyddd800 with the passed value
	 *	@param number
	 */
	public void setFxDateYyddd800(long number)  throws CFException{
		work.setFxDateYyddd800(number);
	}
	

	
	/**
	 * 	Update FxDateYyddd800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFxDateYyddd800(char[] value)  throws CFException {
		work.setFxDateYyddd800(value);
	}
	
	/**
	 * 	Update FxDateYyddd800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFxDateYyddd800String(char[] value)  throws CFException{
		work.setFxDateYyddd800(value);
	}	

	/**
	 *	Returns the value of ip33701TargetCurCode
	 *	@return ip33701TargetCurCode
	 */
	public int getIp33701TargetCurCode() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurCode();
	}


	/**
	 *	Returns String value of ip33701TargetCurCode
	 *	@return ip33701TargetCurCode
	 */
	public char[]  getIp33701TargetCurCodeString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetCurCodeIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvInput().ip33701TargetCurCodeIsNumeric();
	}

	/**
	 * 	Update Ip33701TargetCurCode with the passed value
	 *	@param number
	 */
	public void setIp33701TargetCurCode(int number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(number);
	}
	

	public void setIp33701TargetCurCode(long number)  throws CFException{
	    ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(number);
	}
	
	
	/**
	 * 	Update Ip33701TargetCurCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetCurCode(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(value);
	}
	
	/**
	 * 	Update Ip33701TargetCurCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetCurCodeString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(value);
	}	

	/**
	 *	Returns the value of ip33701SourceCurExp
	 *	@return ip33701SourceCurExp
	 */
   public char[] getIp33701SourceCurExp() throws CFException  {              
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceCurExp();
   }

  
	/**
	*  set variable ip33701SourceCurExp
	*  @param value
	**/
   public void setIp33701SourceCurExp(char[] value) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(value);
   } 

     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701SourceCurExp(char[] source, int sourceIndex) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex);
   	
   }
   
   public void setIp33701SourceCurExp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701SourceCurExp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip33701SourceCurExp with another Field
	 *	@param value
	 */
   public void setIp33701SourceCurExp(Field source) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source);
   }  
   
     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701SourceCurExp(Field source, int sourceIndex,int sourceLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701SourceCurExp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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
        str += ip33701CurrConvInterface.hashCode();
        str += ip00694TableEntry.hashCode();
       return str.hashCode();
    }

    public CurConvLogicOutCtx clone() {
        CurConvLogicOutCtx cloneObj = new CurConvLogicOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip33701CurrConvInterface = new Ip33701CurrConvInterface();
        cloneObj.ip33701CurrConvInterface.set(ip33701CurrConvInterface.getClonedField());
        cloneObj.ip00694TableEntry = new Ip00694TableEntry();
        cloneObj.ip00694TableEntry.set(ip00694TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public CurConvLogicOutCtx getCurConvLogicOutCtx() {
            return new CurConvLogicOutCtx();
    }
     public class DoCurrencyConversionInCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Ip33701CurrConvInterface ip33701CurrConvInterface = Ip809050Ctx.this.getIp33701CurrConvInterface();

	/**
	 *	Returns the value of ip33701TargetCurCode
	 *	@return ip33701TargetCurCode
	 */
	public int getIp33701TargetCurCode() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurCode();
	}


	/**
	 *	Returns String value of ip33701TargetCurCode
	 *	@return ip33701TargetCurCode
	 */
	public char[]  getIp33701TargetCurCodeString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetCurCodeIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvInput().ip33701TargetCurCodeIsNumeric();
	}

	/**
	 * 	Update Ip33701TargetCurCode with the passed value
	 *	@param number
	 */
	public void setIp33701TargetCurCode(int number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(number);
	}
	

	public void setIp33701TargetCurCode(long number)  throws CFException{
	    ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(number);
	}
	
	
	/**
	 * 	Update Ip33701TargetCurCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetCurCode(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(value);
	}
	
	/**
	 * 	Update Ip33701TargetCurCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetCurCodeString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(value);
	}	

	/**
	 *	Returns the value of ptrIp783510800
	 *	@return ptrIp783510800
	 */
   public char[] getPtrIp783510800() throws CFException  {              
   		return work.getPtrIp783510800();
   }

  
	/**
	*  set variable ptrIp783510800
	*  @param value
	**/
   public void setPtrIp783510800(char[] value) throws CFException {
      work.setPtrIp783510800(value);
   } 

	/**
	 *	Returns the value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public long getIp33701TargetAmount() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount();
	}

    /**
	 *	Returns the String value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public char[]  getIp33701TargetAmountActualString() {
		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmountActualString();
	}

	/**
	 *	Returns String value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public char[]  getIp33701TargetAmountString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetAmountIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvOutput().ip33701TargetAmountIsNumeric();
	}

	/**
	 * 	Update Ip33701TargetAmount with the passed value
	 *	@param number
	 */
	public void setIp33701TargetAmount(long number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(number);
	}
	

	
	/**
	 * 	Update Ip33701TargetAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmount(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(value);
	}
	
	/**
	 * 	Update Ip33701TargetAmount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmountString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(value);
	}	

	/**
	 *	Returns the value of tranCurTmp800
	 *	@return tranCurTmp800
	 */
	public int getTranCurTmp800() throws CFException {
   		return work.getTranCurTmp800();
	}


	/**
	 *	Returns String value of tranCurTmp800
	 *	@return tranCurTmp800
	 */
	public char[]  getTranCurTmp800String() throws CFException {
	     return String.valueOf(work.getTranCurTmp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranCurTmp800IsNumeric()  throws CFException{
	    return work.tranCurTmp800IsNumeric();
	}

	/**
	 * 	Update TranCurTmp800 with the passed value
	 *	@param number
	 */
	public void setTranCurTmp800(int number)  throws CFException{
		work.setTranCurTmp800(number);
	}
	

	public void setTranCurTmp800(long number)  throws CFException{
	    work.setTranCurTmp800(number);
	}
	
	
	/**
	 * 	Update TranCurTmp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranCurTmp800(char[] value)  throws CFException {
		work.setTranCurTmp800(value);
	}
	
	/**
	 * 	Update TranCurTmp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranCurTmp800String(char[] value)  throws CFException{
		work.setTranCurTmp800(value);
	}	

	/**
	 *	Returns the value of tranAmtTmp800
	 *	@return tranAmtTmp800
	 */
	public long getTranAmtTmp800() throws CFException {
   		return work.getTranAmtTmp800();
	}


	/**
	 *	Returns String value of tranAmtTmp800
	 *	@return tranAmtTmp800
	 */
	public char[]  getTranAmtTmp800String() throws CFException {
	     return String.valueOf(work.getTranAmtTmp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranAmtTmp800IsNumeric()  throws CFException{
	    return work.tranAmtTmp800IsNumeric();
	}

	/**
	 * 	Update TranAmtTmp800 with the passed value
	 *	@param number
	 */
	public void setTranAmtTmp800(long number)  throws CFException{
		work.setTranAmtTmp800(number);
	}
	

	
	/**
	 * 	Update TranAmtTmp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranAmtTmp800(char[] value)  throws CFException {
		work.setTranAmtTmp800(value);
	}
	
	/**
	 * 	Update TranAmtTmp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranAmtTmp800String(char[] value)  throws CFException{
		work.setTranAmtTmp800(value);
	}	

	/**
	 *	Returns the value of ip33701ReturnCode
	 *	@return ip33701ReturnCode
	 */
	public short getIp33701ReturnCode() throws CFException {        
   		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701ReturnCode();
	}
	
	/**
	 * 	Update Ip33701ReturnCode with the passed value
	 *	@param number
	 */
	public void setIp33701ReturnCode(short number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701ReturnCode(number);
	}

	public void setIp33701ReturnCode(int number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701ReturnCode((short)number);
	}

	public void setIp33701ReturnCode(long number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701ReturnCode((short)number);
	}




        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public DoCurrencyConversionOutCtx getDoCurrencyConversionOutCtx() {
            return new DoCurrencyConversionOutCtx();
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
        str += ip33701CurrConvInterface.hashCode();
       return str.hashCode();
    }

    public DoCurrencyConversionInCtx clone() {
        DoCurrencyConversionInCtx cloneObj = new DoCurrencyConversionInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip33701CurrConvInterface = new Ip33701CurrConvInterface();
        cloneObj.ip33701CurrConvInterface.set(ip33701CurrConvInterface.getClonedField());
        return cloneObj;
    }

    }

    public DoCurrencyConversionInCtx getDoCurrencyConversionInCtx() {
            return new DoCurrencyConversionInCtx();
    }
     public class DoCurrencyConversionOutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Ip33701CurrConvInterface ip33701CurrConvInterface = Ip809050Ctx.this.getIp33701CurrConvInterface();

	/**
	 *	Returns the value of ip33701TargetCurCode
	 *	@return ip33701TargetCurCode
	 */
	public int getIp33701TargetCurCode() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurCode();
	}


	/**
	 *	Returns String value of ip33701TargetCurCode
	 *	@return ip33701TargetCurCode
	 */
	public char[]  getIp33701TargetCurCodeString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetCurCodeIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvInput().ip33701TargetCurCodeIsNumeric();
	}

	/**
	 * 	Update Ip33701TargetCurCode with the passed value
	 *	@param number
	 */
	public void setIp33701TargetCurCode(int number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(number);
	}
	

	public void setIp33701TargetCurCode(long number)  throws CFException{
	    ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(number);
	}
	
	
	/**
	 * 	Update Ip33701TargetCurCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetCurCode(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(value);
	}
	
	/**
	 * 	Update Ip33701TargetCurCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetCurCodeString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(value);
	}	

	/**
	 *	Returns the value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public long getIp33701TargetAmount() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount();
	}

    /**
	 *	Returns the String value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public char[]  getIp33701TargetAmountActualString() {
		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmountActualString();
	}

	/**
	 *	Returns String value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public char[]  getIp33701TargetAmountString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetAmountIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvOutput().ip33701TargetAmountIsNumeric();
	}

	/**
	 * 	Update Ip33701TargetAmount with the passed value
	 *	@param number
	 */
	public void setIp33701TargetAmount(long number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(number);
	}
	

	
	/**
	 * 	Update Ip33701TargetAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmount(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(value);
	}
	
	/**
	 * 	Update Ip33701TargetAmount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmountString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(value);
	}	

	/**
	 *	Returns the value of tranCur800
	 *	@return tranCur800
	 */
	public int getTranCur800() throws CFException {
   		return work.getTranCur800();
	}


	/**
	 *	Returns String value of tranCur800
	 *	@return tranCur800
	 */
	public char[]  getTranCur800String() throws CFException {
	     return String.valueOf(work.getTranCur800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranCur800IsNumeric()  throws CFException{
	    return work.tranCur800IsNumeric();
	}

	/**
	 * 	Update TranCur800 with the passed value
	 *	@param number
	 */
	public void setTranCur800(int number)  throws CFException{
		work.setTranCur800(number);
	}
	

	public void setTranCur800(long number)  throws CFException{
	    work.setTranCur800(number);
	}
	
	
	/**
	 * 	Update TranCur800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranCur800(char[] value)  throws CFException {
		work.setTranCur800(value);
	}
	
	/**
	 * 	Update TranCur800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranCur800String(char[] value)  throws CFException{
		work.setTranCur800(value);
	}	

	/**
	 *	Returns the value of tranCurTmp800
	 *	@return tranCurTmp800
	 */
	public int getTranCurTmp800() throws CFException {
   		return work.getTranCurTmp800();
	}


	/**
	 *	Returns String value of tranCurTmp800
	 *	@return tranCurTmp800
	 */
	public char[]  getTranCurTmp800String() throws CFException {
	     return String.valueOf(work.getTranCurTmp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranCurTmp800IsNumeric()  throws CFException{
	    return work.tranCurTmp800IsNumeric();
	}

	/**
	 * 	Update TranCurTmp800 with the passed value
	 *	@param number
	 */
	public void setTranCurTmp800(int number)  throws CFException{
		work.setTranCurTmp800(number);
	}
	

	public void setTranCurTmp800(long number)  throws CFException{
	    work.setTranCurTmp800(number);
	}
	
	
	/**
	 * 	Update TranCurTmp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranCurTmp800(char[] value)  throws CFException {
		work.setTranCurTmp800(value);
	}
	
	/**
	 * 	Update TranCurTmp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranCurTmp800String(char[] value)  throws CFException{
		work.setTranCurTmp800(value);
	}	

	/**
	 *	Returns the value of tranAmt800
	 *	@return tranAmt800
	 */
	public long getTranAmt800() throws CFException {
   		return work.getTranAmt800();
	}


	/**
	 *	Returns String value of tranAmt800
	 *	@return tranAmt800
	 */
	public char[]  getTranAmt800String() throws CFException {
	     return String.valueOf(work.getTranAmt800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranAmt800IsNumeric()  throws CFException{
	    return work.tranAmt800IsNumeric();
	}

	/**
	 * 	Update TranAmt800 with the passed value
	 *	@param number
	 */
	public void setTranAmt800(long number)  throws CFException{
		work.setTranAmt800(number);
	}
	

	
	/**
	 * 	Update TranAmt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranAmt800(char[] value)  throws CFException {
		work.setTranAmt800(value);
	}
	
	/**
	 * 	Update TranAmt800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranAmt800String(char[] value)  throws CFException{
		work.setTranAmt800(value);
	}	

	/**
	 *	Returns the value of tranAmtTmp800
	 *	@return tranAmtTmp800
	 */
	public long getTranAmtTmp800() throws CFException {
   		return work.getTranAmtTmp800();
	}


	/**
	 *	Returns String value of tranAmtTmp800
	 *	@return tranAmtTmp800
	 */
	public char[]  getTranAmtTmp800String() throws CFException {
	     return String.valueOf(work.getTranAmtTmp800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranAmtTmp800IsNumeric()  throws CFException{
	    return work.tranAmtTmp800IsNumeric();
	}

	/**
	 * 	Update TranAmtTmp800 with the passed value
	 *	@param number
	 */
	public void setTranAmtTmp800(long number)  throws CFException{
		work.setTranAmtTmp800(number);
	}
	

	
	/**
	 * 	Update TranAmtTmp800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranAmtTmp800(char[] value)  throws CFException {
		work.setTranAmtTmp800(value);
	}
	
	/**
	 * 	Update TranAmtTmp800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranAmtTmp800String(char[] value)  throws CFException{
		work.setTranAmtTmp800(value);
	}	


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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
        str += ip33701CurrConvInterface.hashCode();
       return str.hashCode();
    }

    public DoCurrencyConversionOutCtx clone() {
        DoCurrencyConversionOutCtx cloneObj = new DoCurrencyConversionOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip33701CurrConvInterface = new Ip33701CurrConvInterface();
        cloneObj.ip33701CurrConvInterface.set(ip33701CurrConvInterface.getClonedField());
        return cloneObj;
    }

    }

    public DoCurrencyConversionOutCtx getDoCurrencyConversionOutCtx() {
            return new DoCurrencyConversionOutCtx();
    }
     public class WriteOutboundFile1InCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Sys201OutputIpmOtbndRec sys201OutputIpmOtbndRec = Ip809050Ctx.this.getSys201OutputIpmOtbndRec();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();

	/**
	 *	Returns the value of sys201OutputIpmOtbndRec
	 *	@return sys201OutputIpmOtbndRec
	 */   
	 public Sys201OutputIpmOtbndRec getSys201OutputIpmOtbndRec() {
   	return sys201OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of chipLiabVariables800
	 *	@return chipLiabVariables800
	 */   
	 public ChipLiabVariables800 getChipLiabVariables800() {
   	return chipLiabVariables800;
   }


	/**
	 *	Returns the value of ipmRecordsPds1400
	 *	@return ipmRecordsPds1400
	 */
	public int getIpmRecordsPds1400() throws CFException {        
   		return work.getIpmRecordsPds1400();
	}
	
	/**
	 * 	Update IpmRecordsPds1400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds1400(int number)  throws CFException{
		work.setIpmRecordsPds1400(number);
	}


	public void setIpmRecordsPds1400(long number)  throws CFException{
		work.setIpmRecordsPds1400((int)number);
	}



        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public WriteOutboundFile1OutCtx getWriteOutboundFile1OutCtx() {
            return new WriteOutboundFile1OutCtx();
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
        str += sys201OutputIpmOtbndRec.hashCode();
        str += chipLiabVariables800.hashCode();
       return str.hashCode();
    }

    public WriteOutboundFile1InCtx clone() {
        WriteOutboundFile1InCtx cloneObj = new WriteOutboundFile1InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201OutputIpmOtbndRec = new Sys201OutputIpmOtbndRec();
        cloneObj.sys201OutputIpmOtbndRec.set(sys201OutputIpmOtbndRec.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutboundFile1InCtx getWriteOutboundFile1InCtx() {
            return new WriteOutboundFile1InCtx();
    }
     public class WriteOutboundFile1OutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Sys201OutputIpmOtbndRec sys201OutputIpmOtbndRec = Ip809050Ctx.this.getSys201OutputIpmOtbndRec();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();

	/**
	 *	Test condition "00" for isSys201StatusGood88200()
	 *	@return  Returns true if isSys201StatusGood88200() is "00"
	 */
   public boolean isSys201StatusGood88200() throws CFException {
      return work.isSys201StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys201StatusGood88200True()  throws CFException{  			
    	work.setSys201StatusGood88200True();
   	}
	/**
	 *	Returns the value of sys201OutputIpmOtbndRec
	 *	@return sys201OutputIpmOtbndRec
	 */   
	 public Sys201OutputIpmOtbndRec getSys201OutputIpmOtbndRec() {
   	return sys201OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of outputOtbndFileStatus201
	 *	@return outputOtbndFileStatus201
	 */
   public char[] getOutputOtbndFileStatus201() throws CFException  {              
   		return work.getOutputOtbndFileStatus201();
   }

  
	/**
	*  set variable outputOtbndFileStatus201
	*  @param value
	**/
   public void setOutputOtbndFileStatus201(char[] value) throws CFException {
      work.setOutputOtbndFileStatus201(value);
   } 

	/**
	 *	Returns the value of ipmRecordsPds1400
	 *	@return ipmRecordsPds1400
	 */
	public int getIpmRecordsPds1400() throws CFException {        
   		return work.getIpmRecordsPds1400();
	}
	
	/**
	 * 	Update IpmRecordsPds1400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds1400(int number)  throws CFException{
		work.setIpmRecordsPds1400(number);
	}


	public void setIpmRecordsPds1400(long number)  throws CFException{
		work.setIpmRecordsPds1400((int)number);
	}



        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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
        str += sys201OutputIpmOtbndRec.hashCode();
        str += chipLiabVariables800.hashCode();
       return str.hashCode();
    }

    public WriteOutboundFile1OutCtx clone() {
        WriteOutboundFile1OutCtx cloneObj = new WriteOutboundFile1OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201OutputIpmOtbndRec = new Sys201OutputIpmOtbndRec();
        cloneObj.sys201OutputIpmOtbndRec.set(sys201OutputIpmOtbndRec.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutboundFile1OutCtx getWriteOutboundFile1OutCtx() {
            return new WriteOutboundFile1OutCtx();
    }
     public class WriteOutboundFile2InCtx implements Cloneable {
     Sys202OutputIpmOtbndRec sys202OutputIpmOtbndRec = Ip809050Ctx.this.getSys202OutputIpmOtbndRec();
     Work work = Ip809050Ctx.this.getWork();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();

	/**
	 *	Returns the value of sys202OutputIpmOtbndRec
	 *	@return sys202OutputIpmOtbndRec
	 */   
	 public Sys202OutputIpmOtbndRec getSys202OutputIpmOtbndRec() {
   	return sys202OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of ipmRecordsPds2400
	 *	@return ipmRecordsPds2400
	 */
	public int getIpmRecordsPds2400() throws CFException {        
   		return work.getIpmRecordsPds2400();
	}
	
	/**
	 * 	Update IpmRecordsPds2400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds2400(int number)  throws CFException{
		work.setIpmRecordsPds2400(number);
	}


	public void setIpmRecordsPds2400(long number)  throws CFException{
		work.setIpmRecordsPds2400((int)number);
	}


	/**
	 *	Returns the value of chipLiabVariables800
	 *	@return chipLiabVariables800
	 */   
	 public ChipLiabVariables800 getChipLiabVariables800() {
   	return chipLiabVariables800;
   }



        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public WriteOutboundFile2OutCtx getWriteOutboundFile2OutCtx() {
            return new WriteOutboundFile2OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys202OutputIpmOtbndRec.hashCode();
        str += work.hashCode();
        str += chipLiabVariables800.hashCode();
       return str.hashCode();
    }

    public WriteOutboundFile2InCtx clone() {
        WriteOutboundFile2InCtx cloneObj = new WriteOutboundFile2InCtx();
        cloneObj.sys202OutputIpmOtbndRec = new Sys202OutputIpmOtbndRec();
        cloneObj.sys202OutputIpmOtbndRec.set(sys202OutputIpmOtbndRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutboundFile2InCtx getWriteOutboundFile2InCtx() {
            return new WriteOutboundFile2InCtx();
    }
     public class WriteOutboundFile2OutCtx implements Cloneable {
     Sys202OutputIpmOtbndRec sys202OutputIpmOtbndRec = Ip809050Ctx.this.getSys202OutputIpmOtbndRec();
     Work work = Ip809050Ctx.this.getWork();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();

	/**
	 *	Returns the value of sys202OutputIpmOtbndRec
	 *	@return sys202OutputIpmOtbndRec
	 */   
	 public Sys202OutputIpmOtbndRec getSys202OutputIpmOtbndRec() {
   	return sys202OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of outputOtbndFileStatus202
	 *	@return outputOtbndFileStatus202
	 */
   public char[] getOutputOtbndFileStatus202() throws CFException  {              
   		return work.getOutputOtbndFileStatus202();
   }

  
	/**
	*  set variable outputOtbndFileStatus202
	*  @param value
	**/
   public void setOutputOtbndFileStatus202(char[] value) throws CFException {
      work.setOutputOtbndFileStatus202(value);
   } 

	/**
	 *	Returns the value of ipmRecordsPds2400
	 *	@return ipmRecordsPds2400
	 */
	public int getIpmRecordsPds2400() throws CFException {        
   		return work.getIpmRecordsPds2400();
	}
	
	/**
	 * 	Update IpmRecordsPds2400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds2400(int number)  throws CFException{
		work.setIpmRecordsPds2400(number);
	}


	public void setIpmRecordsPds2400(long number)  throws CFException{
		work.setIpmRecordsPds2400((int)number);
	}


	/**
	 *	Test condition "00" for isSys202StatusGood88200()
	 *	@return  Returns true if isSys202StatusGood88200() is "00"
	 */
   public boolean isSys202StatusGood88200() throws CFException {
      return work.isSys202StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys202StatusGood88200True()  throws CFException{  			
    	work.setSys202StatusGood88200True();
   	}

        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys202OutputIpmOtbndRec.hashCode();
        str += work.hashCode();
        str += chipLiabVariables800.hashCode();
       return str.hashCode();
    }

    public WriteOutboundFile2OutCtx clone() {
        WriteOutboundFile2OutCtx cloneObj = new WriteOutboundFile2OutCtx();
        cloneObj.sys202OutputIpmOtbndRec = new Sys202OutputIpmOtbndRec();
        cloneObj.sys202OutputIpmOtbndRec.set(sys202OutputIpmOtbndRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutboundFile2OutCtx getWriteOutboundFile2OutCtx() {
            return new WriteOutboundFile2OutCtx();
    }
     public class WriteOutboundFile3InCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Sys203OutputIpmOtbndRec sys203OutputIpmOtbndRec = Ip809050Ctx.this.getSys203OutputIpmOtbndRec();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();

	/**
	 *	Returns the value of sys203OutputIpmOtbndRec
	 *	@return sys203OutputIpmOtbndRec
	 */   
	 public Sys203OutputIpmOtbndRec getSys203OutputIpmOtbndRec() {
   	return sys203OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of chipLiabVariables800
	 *	@return chipLiabVariables800
	 */   
	 public ChipLiabVariables800 getChipLiabVariables800() {
   	return chipLiabVariables800;
   }


	/**
	 *	Returns the value of ipmRecordsPds3400
	 *	@return ipmRecordsPds3400
	 */
	public int getIpmRecordsPds3400() throws CFException {        
   		return work.getIpmRecordsPds3400();
	}
	
	/**
	 * 	Update IpmRecordsPds3400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds3400(int number)  throws CFException{
		work.setIpmRecordsPds3400(number);
	}


	public void setIpmRecordsPds3400(long number)  throws CFException{
		work.setIpmRecordsPds3400((int)number);
	}



        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public WriteOutboundFile3OutCtx getWriteOutboundFile3OutCtx() {
            return new WriteOutboundFile3OutCtx();
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
        str += sys203OutputIpmOtbndRec.hashCode();
        str += chipLiabVariables800.hashCode();
       return str.hashCode();
    }

    public WriteOutboundFile3InCtx clone() {
        WriteOutboundFile3InCtx cloneObj = new WriteOutboundFile3InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys203OutputIpmOtbndRec = new Sys203OutputIpmOtbndRec();
        cloneObj.sys203OutputIpmOtbndRec.set(sys203OutputIpmOtbndRec.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutboundFile3InCtx getWriteOutboundFile3InCtx() {
            return new WriteOutboundFile3InCtx();
    }
     public class WriteOutboundFile3OutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Sys203OutputIpmOtbndRec sys203OutputIpmOtbndRec = Ip809050Ctx.this.getSys203OutputIpmOtbndRec();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();

	/**
	 *	Returns the value of outputOtbndFileStatus203
	 *	@return outputOtbndFileStatus203
	 */
   public char[] getOutputOtbndFileStatus203() throws CFException  {              
   		return work.getOutputOtbndFileStatus203();
   }

  
	/**
	*  set variable outputOtbndFileStatus203
	*  @param value
	**/
   public void setOutputOtbndFileStatus203(char[] value) throws CFException {
      work.setOutputOtbndFileStatus203(value);
   } 

	/**
	 *	Returns the value of sys203OutputIpmOtbndRec
	 *	@return sys203OutputIpmOtbndRec
	 */   
	 public Sys203OutputIpmOtbndRec getSys203OutputIpmOtbndRec() {
   	return sys203OutputIpmOtbndRec;
   }


	/**
	 *	Test condition "00" for isSys203StatusGood88200()
	 *	@return  Returns true if isSys203StatusGood88200() is "00"
	 */
   public boolean isSys203StatusGood88200() throws CFException {
      return work.isSys203StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys203StatusGood88200True()  throws CFException{  			
    	work.setSys203StatusGood88200True();
   	}
	/**
	 *	Returns the value of ipmRecordsPds3400
	 *	@return ipmRecordsPds3400
	 */
	public int getIpmRecordsPds3400() throws CFException {        
   		return work.getIpmRecordsPds3400();
	}
	
	/**
	 * 	Update IpmRecordsPds3400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds3400(int number)  throws CFException{
		work.setIpmRecordsPds3400(number);
	}


	public void setIpmRecordsPds3400(long number)  throws CFException{
		work.setIpmRecordsPds3400((int)number);
	}



        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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
        str += sys203OutputIpmOtbndRec.hashCode();
        str += chipLiabVariables800.hashCode();
       return str.hashCode();
    }

    public WriteOutboundFile3OutCtx clone() {
        WriteOutboundFile3OutCtx cloneObj = new WriteOutboundFile3OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys203OutputIpmOtbndRec = new Sys203OutputIpmOtbndRec();
        cloneObj.sys203OutputIpmOtbndRec.set(sys203OutputIpmOtbndRec.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutboundFile3OutCtx getWriteOutboundFile3OutCtx() {
            return new WriteOutboundFile3OutCtx();
    }
     public class WriteOutboundFile4InCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Sys204OutputIpmOtbndRec sys204OutputIpmOtbndRec = Ip809050Ctx.this.getSys204OutputIpmOtbndRec();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();

	/**
	 *	Returns the value of sys204OutputIpmOtbndRec
	 *	@return sys204OutputIpmOtbndRec
	 */   
	 public Sys204OutputIpmOtbndRec getSys204OutputIpmOtbndRec() {
   	return sys204OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of chipLiabVariables800
	 *	@return chipLiabVariables800
	 */   
	 public ChipLiabVariables800 getChipLiabVariables800() {
   	return chipLiabVariables800;
   }


	/**
	 *	Returns the value of ipmRecordsPds4400
	 *	@return ipmRecordsPds4400
	 */
	public int getIpmRecordsPds4400() throws CFException {        
   		return work.getIpmRecordsPds4400();
	}
	
	/**
	 * 	Update IpmRecordsPds4400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds4400(int number)  throws CFException{
		work.setIpmRecordsPds4400(number);
	}


	public void setIpmRecordsPds4400(long number)  throws CFException{
		work.setIpmRecordsPds4400((int)number);
	}



        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public WriteOutboundFile4OutCtx getWriteOutboundFile4OutCtx() {
            return new WriteOutboundFile4OutCtx();
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
        str += sys204OutputIpmOtbndRec.hashCode();
        str += chipLiabVariables800.hashCode();
       return str.hashCode();
    }

    public WriteOutboundFile4InCtx clone() {
        WriteOutboundFile4InCtx cloneObj = new WriteOutboundFile4InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys204OutputIpmOtbndRec = new Sys204OutputIpmOtbndRec();
        cloneObj.sys204OutputIpmOtbndRec.set(sys204OutputIpmOtbndRec.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutboundFile4InCtx getWriteOutboundFile4InCtx() {
            return new WriteOutboundFile4InCtx();
    }
     public class WriteOutboundFile4OutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Sys204OutputIpmOtbndRec sys204OutputIpmOtbndRec = Ip809050Ctx.this.getSys204OutputIpmOtbndRec();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();

	/**
	 *	Test condition "00" for isSys204StatusGood88200()
	 *	@return  Returns true if isSys204StatusGood88200() is "00"
	 */
   public boolean isSys204StatusGood88200() throws CFException {
      return work.isSys204StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys204StatusGood88200True()  throws CFException{  			
    	work.setSys204StatusGood88200True();
   	}
	/**
	 *	Returns the value of sys204OutputIpmOtbndRec
	 *	@return sys204OutputIpmOtbndRec
	 */   
	 public Sys204OutputIpmOtbndRec getSys204OutputIpmOtbndRec() {
   	return sys204OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of outputOtbndFileStatus204
	 *	@return outputOtbndFileStatus204
	 */
   public char[] getOutputOtbndFileStatus204() throws CFException  {              
   		return work.getOutputOtbndFileStatus204();
   }

  
	/**
	*  set variable outputOtbndFileStatus204
	*  @param value
	**/
   public void setOutputOtbndFileStatus204(char[] value) throws CFException {
      work.setOutputOtbndFileStatus204(value);
   } 

	/**
	 *	Returns the value of ipmRecordsPds4400
	 *	@return ipmRecordsPds4400
	 */
	public int getIpmRecordsPds4400() throws CFException {        
   		return work.getIpmRecordsPds4400();
	}
	
	/**
	 * 	Update IpmRecordsPds4400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds4400(int number)  throws CFException{
		work.setIpmRecordsPds4400(number);
	}


	public void setIpmRecordsPds4400(long number)  throws CFException{
		work.setIpmRecordsPds4400((int)number);
	}



        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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
        str += sys204OutputIpmOtbndRec.hashCode();
        str += chipLiabVariables800.hashCode();
       return str.hashCode();
    }

    public WriteOutboundFile4OutCtx clone() {
        WriteOutboundFile4OutCtx cloneObj = new WriteOutboundFile4OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys204OutputIpmOtbndRec = new Sys204OutputIpmOtbndRec();
        cloneObj.sys204OutputIpmOtbndRec.set(sys204OutputIpmOtbndRec.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutboundFile4OutCtx getWriteOutboundFile4OutCtx() {
            return new WriteOutboundFile4OutCtx();
    }
     public class WriteOutboundFile5InCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Sys205OutputIpmOtbndRec sys205OutputIpmOtbndRec = Ip809050Ctx.this.getSys205OutputIpmOtbndRec();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();

	/**
	 *	Returns the value of sys205OutputIpmOtbndRec
	 *	@return sys205OutputIpmOtbndRec
	 */   
	 public Sys205OutputIpmOtbndRec getSys205OutputIpmOtbndRec() {
   	return sys205OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of ipmRecordsPds5400
	 *	@return ipmRecordsPds5400
	 */
	public int getIpmRecordsPds5400() throws CFException {        
   		return work.getIpmRecordsPds5400();
	}
	
	/**
	 * 	Update IpmRecordsPds5400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds5400(int number)  throws CFException{
		work.setIpmRecordsPds5400(number);
	}


	public void setIpmRecordsPds5400(long number)  throws CFException{
		work.setIpmRecordsPds5400((int)number);
	}


	/**
	 *	Returns the value of chipLiabVariables800
	 *	@return chipLiabVariables800
	 */   
	 public ChipLiabVariables800 getChipLiabVariables800() {
   	return chipLiabVariables800;
   }



        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public WriteOutboundFile5OutCtx getWriteOutboundFile5OutCtx() {
            return new WriteOutboundFile5OutCtx();
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
        str += sys205OutputIpmOtbndRec.hashCode();
        str += chipLiabVariables800.hashCode();
       return str.hashCode();
    }

    public WriteOutboundFile5InCtx clone() {
        WriteOutboundFile5InCtx cloneObj = new WriteOutboundFile5InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys205OutputIpmOtbndRec = new Sys205OutputIpmOtbndRec();
        cloneObj.sys205OutputIpmOtbndRec.set(sys205OutputIpmOtbndRec.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutboundFile5InCtx getWriteOutboundFile5InCtx() {
            return new WriteOutboundFile5InCtx();
    }
     public class WriteOutboundFile5OutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Sys205OutputIpmOtbndRec sys205OutputIpmOtbndRec = Ip809050Ctx.this.getSys205OutputIpmOtbndRec();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();

	/**
	 *	Returns the value of sys205OutputIpmOtbndRec
	 *	@return sys205OutputIpmOtbndRec
	 */   
	 public Sys205OutputIpmOtbndRec getSys205OutputIpmOtbndRec() {
   	return sys205OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of outputOtbndFileStatus205
	 *	@return outputOtbndFileStatus205
	 */
   public char[] getOutputOtbndFileStatus205() throws CFException  {              
   		return work.getOutputOtbndFileStatus205();
   }

  
	/**
	*  set variable outputOtbndFileStatus205
	*  @param value
	**/
   public void setOutputOtbndFileStatus205(char[] value) throws CFException {
      work.setOutputOtbndFileStatus205(value);
   } 

	/**
	 *	Returns the value of ipmRecordsPds5400
	 *	@return ipmRecordsPds5400
	 */
	public int getIpmRecordsPds5400() throws CFException {        
   		return work.getIpmRecordsPds5400();
	}
	
	/**
	 * 	Update IpmRecordsPds5400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds5400(int number)  throws CFException{
		work.setIpmRecordsPds5400(number);
	}


	public void setIpmRecordsPds5400(long number)  throws CFException{
		work.setIpmRecordsPds5400((int)number);
	}


	/**
	 *	Test condition "00" for isSys205StatusGood88200()
	 *	@return  Returns true if isSys205StatusGood88200() is "00"
	 */
   public boolean isSys205StatusGood88200() throws CFException {
      return work.isSys205StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys205StatusGood88200True()  throws CFException{  			
    	work.setSys205StatusGood88200True();
   	}

        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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
        str += sys205OutputIpmOtbndRec.hashCode();
        str += chipLiabVariables800.hashCode();
       return str.hashCode();
    }

    public WriteOutboundFile5OutCtx clone() {
        WriteOutboundFile5OutCtx cloneObj = new WriteOutboundFile5OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys205OutputIpmOtbndRec = new Sys205OutputIpmOtbndRec();
        cloneObj.sys205OutputIpmOtbndRec.set(sys205OutputIpmOtbndRec.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutboundFile5OutCtx getWriteOutboundFile5OutCtx() {
            return new WriteOutboundFile5OutCtx();
    }
     public class WriteOutboundFile6InCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Sys206OutputIpmOtbndRec sys206OutputIpmOtbndRec = Ip809050Ctx.this.getSys206OutputIpmOtbndRec();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();

	/**
	 *	Returns the value of sys206OutputIpmOtbndRec
	 *	@return sys206OutputIpmOtbndRec
	 */   
	 public Sys206OutputIpmOtbndRec getSys206OutputIpmOtbndRec() {
   	return sys206OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of ipmRecordsPds6400
	 *	@return ipmRecordsPds6400
	 */
	public int getIpmRecordsPds6400() throws CFException {        
   		return work.getIpmRecordsPds6400();
	}
	
	/**
	 * 	Update IpmRecordsPds6400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds6400(int number)  throws CFException{
		work.setIpmRecordsPds6400(number);
	}


	public void setIpmRecordsPds6400(long number)  throws CFException{
		work.setIpmRecordsPds6400((int)number);
	}


	/**
	 *	Returns the value of chipLiabVariables800
	 *	@return chipLiabVariables800
	 */   
	 public ChipLiabVariables800 getChipLiabVariables800() {
   	return chipLiabVariables800;
   }



        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public WriteOutboundFile6OutCtx getWriteOutboundFile6OutCtx() {
            return new WriteOutboundFile6OutCtx();
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
        str += sys206OutputIpmOtbndRec.hashCode();
        str += chipLiabVariables800.hashCode();
       return str.hashCode();
    }

    public WriteOutboundFile6InCtx clone() {
        WriteOutboundFile6InCtx cloneObj = new WriteOutboundFile6InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys206OutputIpmOtbndRec = new Sys206OutputIpmOtbndRec();
        cloneObj.sys206OutputIpmOtbndRec.set(sys206OutputIpmOtbndRec.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutboundFile6InCtx getWriteOutboundFile6InCtx() {
            return new WriteOutboundFile6InCtx();
    }
     public class WriteOutboundFile6OutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Sys206OutputIpmOtbndRec sys206OutputIpmOtbndRec = Ip809050Ctx.this.getSys206OutputIpmOtbndRec();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();

	/**
	 *	Returns the value of sys206OutputIpmOtbndRec
	 *	@return sys206OutputIpmOtbndRec
	 */   
	 public Sys206OutputIpmOtbndRec getSys206OutputIpmOtbndRec() {
   	return sys206OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of outputOtbndFileStatus206
	 *	@return outputOtbndFileStatus206
	 */
   public char[] getOutputOtbndFileStatus206() throws CFException  {              
   		return work.getOutputOtbndFileStatus206();
   }

  
	/**
	*  set variable outputOtbndFileStatus206
	*  @param value
	**/
   public void setOutputOtbndFileStatus206(char[] value) throws CFException {
      work.setOutputOtbndFileStatus206(value);
   } 

	/**
	 *	Returns the value of ipmRecordsPds6400
	 *	@return ipmRecordsPds6400
	 */
	public int getIpmRecordsPds6400() throws CFException {        
   		return work.getIpmRecordsPds6400();
	}
	
	/**
	 * 	Update IpmRecordsPds6400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds6400(int number)  throws CFException{
		work.setIpmRecordsPds6400(number);
	}


	public void setIpmRecordsPds6400(long number)  throws CFException{
		work.setIpmRecordsPds6400((int)number);
	}


	/**
	 *	Test condition "00" for isSys206StatusGood88200()
	 *	@return  Returns true if isSys206StatusGood88200() is "00"
	 */
   public boolean isSys206StatusGood88200() throws CFException {
      return work.isSys206StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys206StatusGood88200True()  throws CFException{  			
    	work.setSys206StatusGood88200True();
   	}

        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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
        str += sys206OutputIpmOtbndRec.hashCode();
        str += chipLiabVariables800.hashCode();
       return str.hashCode();
    }

    public WriteOutboundFile6OutCtx clone() {
        WriteOutboundFile6OutCtx cloneObj = new WriteOutboundFile6OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys206OutputIpmOtbndRec = new Sys206OutputIpmOtbndRec();
        cloneObj.sys206OutputIpmOtbndRec.set(sys206OutputIpmOtbndRec.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutboundFile6OutCtx getWriteOutboundFile6OutCtx() {
            return new WriteOutboundFile6OutCtx();
    }
     public class WriteOutboundFile7InCtx implements Cloneable {
     Sys207OutputIpmOtbndRec sys207OutputIpmOtbndRec = Ip809050Ctx.this.getSys207OutputIpmOtbndRec();
     L1CtlValues800 l1CtlValues800 = Ip809050Ctx.this.getL1CtlValues800();
     Work work = Ip809050Ctx.this.getWork();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();
     Pds841ValuesGroup800 pds841ValuesGroup800 = Ip809050Ctx.this.getPds841ValuesGroup800();

	/**
	 *	Returns the value of l1CtlValues800
	 *	@return l1CtlValues800
	 */   
	 public L1CtlValues800 getL1CtlValues800() {
   	return l1CtlValues800;
   }


	/**
	 *	Returns the value of sys207OutputIpmOtbndRec
	 *	@return sys207OutputIpmOtbndRec
	 */   
	 public Sys207OutputIpmOtbndRec getSys207OutputIpmOtbndRec() {
   	return sys207OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of ipmRecordsPds7400
	 *	@return ipmRecordsPds7400
	 */
	public int getIpmRecordsPds7400() throws CFException {        
   		return work.getIpmRecordsPds7400();
	}
	
	/**
	 * 	Update IpmRecordsPds7400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds7400(int number)  throws CFException{
		work.setIpmRecordsPds7400(number);
	}


	public void setIpmRecordsPds7400(long number)  throws CFException{
		work.setIpmRecordsPds7400((int)number);
	}


	/**
	 *	Test condition "1750" for isPds8411750Y88800()
	 *	@return  Returns true if isPds8411750Y88800() is "1750"
	 */
   public boolean isPds8411750Y88800() throws CFException {
      return pds841ValuesGroup800.getPds841800().isPds8411750Y88800();
   }

	/**
	*  set values "1750"
	*/
   	public void setPds8411750Y88800True()  throws CFException{  			
    	pds841ValuesGroup800.getPds841800().setPds8411750Y88800True();
   	}
	/**
	 *	Returns the value of l1CtlMti800
	 *	@return l1CtlMti800
	 */
	public int getL1CtlMti800() throws CFException {
   		return l1CtlValues800.getL1CtlMti800();
	}


	/**
	 *	Returns String value of l1CtlMti800
	 *	@return l1CtlMti800
	 */
	public char[]  getL1CtlMti800String() throws CFException {
	     return String.valueOf(l1CtlValues800.getL1CtlMti800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean l1CtlMti800IsNumeric()  throws CFException{
	    return l1CtlValues800.l1CtlMti800IsNumeric();
	}

	/**
	 * 	Update L1CtlMti800 with the passed value
	 *	@param number
	 */
	public void setL1CtlMti800(int number)  throws CFException{
		l1CtlValues800.setL1CtlMti800(number);
	}
	

	public void setL1CtlMti800(long number)  throws CFException{
	    l1CtlValues800.setL1CtlMti800(number);
	}
	
	
	/**
	 * 	Update L1CtlMti800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setL1CtlMti800(char[] value)  throws CFException {
		l1CtlValues800.setL1CtlMti800(value);
	}
	
	/**
	 * 	Update L1CtlMti800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setL1CtlMti800String(char[] value)  throws CFException{
		l1CtlValues800.setL1CtlMti800(value);
	}	

	/**
	 *	Returns the value of chipLiabVariables800
	 *	@return chipLiabVariables800
	 */   
	 public ChipLiabVariables800 getChipLiabVariables800() {
   	return chipLiabVariables800;
   }



        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public WriteOutboundFile7OutCtx getWriteOutboundFile7OutCtx() {
            return new WriteOutboundFile7OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys207OutputIpmOtbndRec.hashCode();
        str += l1CtlValues800.hashCode();
        str += work.hashCode();
        str += chipLiabVariables800.hashCode();
        str += pds841ValuesGroup800.hashCode();
       return str.hashCode();
    }

    public WriteOutboundFile7InCtx clone() {
        WriteOutboundFile7InCtx cloneObj = new WriteOutboundFile7InCtx();
        cloneObj.sys207OutputIpmOtbndRec = new Sys207OutputIpmOtbndRec();
        cloneObj.sys207OutputIpmOtbndRec.set(sys207OutputIpmOtbndRec.getClonedField());
        cloneObj.l1CtlValues800 = new L1CtlValues800();
        cloneObj.l1CtlValues800.set(l1CtlValues800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        cloneObj.pds841ValuesGroup800 = new Pds841ValuesGroup800();
        cloneObj.pds841ValuesGroup800.set(pds841ValuesGroup800.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutboundFile7InCtx getWriteOutboundFile7InCtx() {
            return new WriteOutboundFile7InCtx();
    }
     public class WriteOutboundFile7OutCtx implements Cloneable {
     Sys207OutputIpmOtbndRec sys207OutputIpmOtbndRec = Ip809050Ctx.this.getSys207OutputIpmOtbndRec();
     L1CtlValues800 l1CtlValues800 = Ip809050Ctx.this.getL1CtlValues800();
     Work work = Ip809050Ctx.this.getWork();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();
     Pds841ValuesGroup800 pds841ValuesGroup800 = Ip809050Ctx.this.getPds841ValuesGroup800();

	/**
	 *	Returns the value of sys207OutputIpmOtbndRec
	 *	@return sys207OutputIpmOtbndRec
	 */   
	 public Sys207OutputIpmOtbndRec getSys207OutputIpmOtbndRec() {
   	return sys207OutputIpmOtbndRec;
   }


	/**
	 *	Returns the value of ipmRecordsPds7400
	 *	@return ipmRecordsPds7400
	 */
	public int getIpmRecordsPds7400() throws CFException {        
   		return work.getIpmRecordsPds7400();
	}
	
	/**
	 * 	Update IpmRecordsPds7400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds7400(int number)  throws CFException{
		work.setIpmRecordsPds7400(number);
	}


	public void setIpmRecordsPds7400(long number)  throws CFException{
		work.setIpmRecordsPds7400((int)number);
	}


	/**
	 *	Returns the value of outputOtbndFileStatus207
	 *	@return outputOtbndFileStatus207
	 */
   public char[] getOutputOtbndFileStatus207() throws CFException  {              
   		return work.getOutputOtbndFileStatus207();
   }

  
	/**
	*  set variable outputOtbndFileStatus207
	*  @param value
	**/
   public void setOutputOtbndFileStatus207(char[] value) throws CFException {
      work.setOutputOtbndFileStatus207(value);
   } 

	/**
	 *	Test condition "00" for isSys207StatusGood88200()
	 *	@return  Returns true if isSys207StatusGood88200() is "00"
	 */
   public boolean isSys207StatusGood88200() throws CFException {
      return work.isSys207StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys207StatusGood88200True()  throws CFException{  			
    	work.setSys207StatusGood88200True();
   	}

        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys207OutputIpmOtbndRec.hashCode();
        str += l1CtlValues800.hashCode();
        str += work.hashCode();
        str += chipLiabVariables800.hashCode();
        str += pds841ValuesGroup800.hashCode();
       return str.hashCode();
    }

    public WriteOutboundFile7OutCtx clone() {
        WriteOutboundFile7OutCtx cloneObj = new WriteOutboundFile7OutCtx();
        cloneObj.sys207OutputIpmOtbndRec = new Sys207OutputIpmOtbndRec();
        cloneObj.sys207OutputIpmOtbndRec.set(sys207OutputIpmOtbndRec.getClonedField());
        cloneObj.l1CtlValues800 = new L1CtlValues800();
        cloneObj.l1CtlValues800.set(l1CtlValues800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        cloneObj.pds841ValuesGroup800 = new Pds841ValuesGroup800();
        cloneObj.pds841ValuesGroup800.set(pds841ValuesGroup800.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutboundFile7OutCtx getWriteOutboundFile7OutCtx() {
            return new WriteOutboundFile7OutCtx();
    }
     public class ExtractFieldsInCtx implements Cloneable {
     Ip66102IpmMsg ip66102IpmMsg = Ip809050Ctx.this.getIp66102IpmMsg();
     Ip08101RunControlRecord ip08101RunControlRecord = Ip809050Ctx.this.getIp08101RunControlRecord();
     Work work = Ip809050Ctx.this.getWork();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip809050Ctx.this.getIp65504DeMapGroup();
     Ip00724TableEntry ip00724TableEntry = Ip809050Ctx.this.getIp00724TableEntry();
     Ip65504SelElemEntriesAll ip65504SelElemEntriesAll = Ip809050Ctx.this.getIp65504SelElemEntriesAll();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();
     Ip00724EntryFoundYGroup ip00724EntryFoundYGroup = Ip809050Ctx.this.getIp00724EntryFoundYGroup();

	/**
	 *	Returns the value of ip65504D04TrxAmtL
	 *	@return ip65504D04TrxAmtL
	 */
	public short getIp65504D04TrxAmtL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D04TrxAmtL();
	}
	
	/**
	 * 	Update Ip65504D04TrxAmtL with the passed value
	 *	@param number
	 */
	public void setIp65504D04TrxAmtL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtL(number);
	}

	public void setIp65504D04TrxAmtL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtL((short)number);
	}

	public void setIp65504D04TrxAmtL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtL((short)number);
	}



	/**
	 *	Returns the value of ip66102NormalIpmMsg
	 *	@return ip66102NormalIpmMsg
	 */   
	 public Ip66102NormalIpmMsg getIp66102NormalIpmMsg() {
   	return ip66102IpmMsg.getIp66102NormalIpmMsg();
   }

   /**
	* 	Update Ip66102NormalIpmMsg with the passed value
	*	@param value
	*/
   public void setIp66102NormalIpmMsg(char[] value) throws CFException {
      ip66102IpmMsg.setIp66102NormalIpmMsg(value);
   }   

     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102NormalIpmMsg with another Field
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(Field source) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source);
   }  
   
     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(Field source, int sourceIndex,int sourceLen) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504SelElemEnt
	 *	@return ip65504SelElemEnt
	 */
   public char[] getIp65504SelElemEnt(int index) throws CFException  {              
   		return ip65504SelElemEntriesAll.getIp65504SelElemEnt(index);
   }

  
	/**
	*  set variable ip65504SelElemEnt
	*  @param value
	**/
   public void setIp65504SelElemEnt(int index,char[] value) throws CFException {
      ip65504SelElemEntriesAll.setIp65504SelElemEnt((index),value);
   } 

	/**
	 *	Returns the value of valueX300
	 *	@return valueX300
	 */
   public char[] getValueX300() throws CFException  {              
   		return work.getValueX300();
   }

  
	/**
	*  set variable valueX300
	*  @param value
	**/
   public void setValueX300(char[] value) throws CFException {
      work.setValueX300(value);
   } 

	/**
	 *	Returns the value of ip65504D02PanNbrS
	 *	@return ip65504D02PanNbrS
	 */
	public short getIp65504D02PanNbrS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D02PanNbrS();
	}
	
	/**
	 * 	Update Ip65504D02PanNbrS with the passed value
	 *	@param number
	 */
	public void setIp65504D02PanNbrS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D02PanNbrS(number);
	}

	public void setIp65504D02PanNbrS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D02PanNbrS((short)number);
	}

	public void setIp65504D02PanNbrS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D02PanNbrS((short)number);
	}



	/**
	 *	Returns the value of ip65504D95CardIsL
	 *	@return ip65504D95CardIsL
	 */
	public short getIp65504D95CardIsL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().getIp65504D95CardIsL();
	}
	
	/**
	 * 	Update Ip65504D95CardIsL with the passed value
	 *	@param number
	 */
	public void setIp65504D95CardIsL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D95CardIsL(number);
	}

	public void setIp65504D95CardIsL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D95CardIsL((short)number);
	}

	public void setIp65504D95CardIsL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D95CardIsL((short)number);
	}



	/**
	 *	Returns the value of ip65504D22PoiDcdL
	 *	@return ip65504D22PoiDcdL
	 */
	public short getIp65504D22PoiDcdL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D22PoiDcdL();
	}
	
	/**
	 * 	Update Ip65504D22PoiDcdL with the passed value
	 *	@param number
	 */
	public void setIp65504D22PoiDcdL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D22PoiDcdL(number);
	}

	public void setIp65504D22PoiDcdL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D22PoiDcdL((short)number);
	}

	public void setIp65504D22PoiDcdL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D22PoiDcdL((short)number);
	}



	/**
	 *	Returns the value of txnAmt800
	 *	@return txnAmt800
	 */
   public char[] getTxnAmt800() throws CFException  {              
   		return chipLiabVariables800.getTxnAmt1800().getTxnAmt800();
   }

  
	/**
	*  set variable txnAmt800
	*  @param value
	**/
   public void setTxnAmt800(char[] value) throws CFException {
      chipLiabVariables800.getTxnAmt1800().setTxnAmt800(value);
   } 

     /**
	 * 	Update TxnAmt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTxnAmt800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.getTxnAmt1800().setTxnAmt800(source, sourceIndex);
   	
   }
   
   public void setTxnAmt800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.getTxnAmt1800().setTxnAmt800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TxnAmt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTxnAmt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getTxnAmt1800().setTxnAmt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TxnAmt800 with another Field
	 *	@param value
	 */
   public void setTxnAmt800(Field source) {
      chipLiabVariables800.getTxnAmt1800().setTxnAmt800(source);
   }  
   
     /**
	 * 	Update TxnAmt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTxnAmt800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.getTxnAmt1800().setTxnAmt800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TxnAmt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTxnAmt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getTxnAmt1800().setTxnAmt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip08101ProcessDate
	 *	@return ip08101ProcessDate
	 */
	public long getIp08101ProcessDate() throws CFException {
   		return ip08101RunControlRecord.getIp08101ProcessDate();
	}


	/**
	 *	Returns String value of ip08101ProcessDate
	 *	@return ip08101ProcessDate
	 */
	public char[]  getIp08101ProcessDateString() throws CFException {
	     return String.valueOf(ip08101RunControlRecord.getIp08101ProcessDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip08101ProcessDateIsNumeric()  throws CFException{
	    return ip08101RunControlRecord.ip08101ProcessDateIsNumeric();
	}

	/**
	 * 	Update Ip08101ProcessDate with the passed value
	 *	@param number
	 */
	public void setIp08101ProcessDate(long number)  throws CFException{
		ip08101RunControlRecord.setIp08101ProcessDate(number);
	}
	

	
	/**
	 * 	Update Ip08101ProcessDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp08101ProcessDate(char[] value)  throws CFException {
		ip08101RunControlRecord.setIp08101ProcessDate(value);
	}
	
	/**
	 * 	Update Ip08101ProcessDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp08101ProcessDateString(char[] value)  throws CFException{
		ip08101RunControlRecord.setIp08101ProcessDate(value);
	}	

	/**
	 *	Returns the value of txnAmtDec800
	 *	@return txnAmtDec800
	 */
   public char[] getTxnAmtDec800() throws CFException  {              
   		return chipLiabVariables800.getTxnAmt1800().getTxnAmtDec800();
   }

  
	/**
	*  set variable txnAmtDec800
	*  @param value
	**/
   public void setTxnAmtDec800(char[] value) throws CFException {
      chipLiabVariables800.getTxnAmt1800().setTxnAmtDec800(value);
   } 

     /**
	 * 	Update TxnAmtDec800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTxnAmtDec800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.getTxnAmt1800().setTxnAmtDec800(source, sourceIndex);
   	
   }
   
   public void setTxnAmtDec800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.getTxnAmt1800().setTxnAmtDec800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TxnAmtDec800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTxnAmtDec800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getTxnAmt1800().setTxnAmtDec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TxnAmtDec800 with another Field
	 *	@param value
	 */
   public void setTxnAmtDec800(Field source) {
      chipLiabVariables800.getTxnAmt1800().setTxnAmtDec800(source);
   }  
   
     /**
	 * 	Update TxnAmtDec800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTxnAmtDec800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.getTxnAmt1800().setTxnAmtDec800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TxnAmtDec800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTxnAmtDec800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getTxnAmt1800().setTxnAmtDec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of chipLiabVariables800
	 *	@return chipLiabVariables800
	 */   
	 public ChipLiabVariables800 getChipLiabVariables800() {
   	return chipLiabVariables800;
   }


	/**
	 *	Returns the value of ip65504D04TrxAmtS
	 *	@return ip65504D04TrxAmtS
	 */
	public short getIp65504D04TrxAmtS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D04TrxAmtS();
	}
	
	/**
	 * 	Update Ip65504D04TrxAmtS with the passed value
	 *	@param number
	 */
	public void setIp65504D04TrxAmtS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtS(number);
	}

	public void setIp65504D04TrxAmtS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtS((short)number);
	}

	public void setIp65504D04TrxAmtS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtS((short)number);
	}



	/**
	 *	Returns the value of ip65504D49TrxCurL
	 *	@return ip65504D49TrxCurL
	 */
	public short getIp65504D49TrxCurL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().getIp65504D49TrxCurL();
	}
	
	/**
	 * 	Update Ip65504D49TrxCurL with the passed value
	 *	@param number
	 */
	public void setIp65504D49TrxCurL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurL(number);
	}

	public void setIp65504D49TrxCurL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurL((short)number);
	}

	public void setIp65504D49TrxCurL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurL((short)number);
	}



	/**
	 *	Returns the value of ip65504D49TrxCurS
	 *	@return ip65504D49TrxCurS
	 */
	public short getIp65504D49TrxCurS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().getIp65504D49TrxCurS();
	}
	
	/**
	 * 	Update Ip65504D49TrxCurS with the passed value
	 *	@param number
	 */
	public void setIp65504D49TrxCurS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurS(number);
	}

	public void setIp65504D49TrxCurS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurS((short)number);
	}

	public void setIp65504D49TrxCurS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurS((short)number);
	}



	/**
	 *	Returns the value of ptrIp281010800
	 *	@return ptrIp281010800
	 */
   public char[] getPtrIp281010800() throws CFException  {              
   		return work.getPtrIp281010800();
   }

  
	/**
	*  set variable ptrIp281010800
	*  @param value
	**/
   public void setPtrIp281010800(char[] value) throws CFException {
      work.setPtrIp281010800(value);
   } 

	/**
	 *	Returns the value of ip65504D94TrxOidS
	 *	@return ip65504D94TrxOidS
	 */
	public short getIp65504D94TrxOidS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().getIp65504D94TrxOidS();
	}
	
	/**
	 * 	Update Ip65504D94TrxOidS with the passed value
	 *	@param number
	 */
	public void setIp65504D94TrxOidS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D94TrxOidS(number);
	}

	public void setIp65504D94TrxOidS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D94TrxOidS((short)number);
	}

	public void setIp65504D94TrxOidS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D94TrxOidS((short)number);
	}



	/**
	 *	Returns the value of ip00724MemberName
	 *	@return ip00724MemberName
	 */
   public char[] getIp00724MemberName() throws CFException  {              
   		return ip00724TableEntry.getIp00724MemberName();
   }

  
	/**
	*  set variable ip00724MemberName
	*  @param value
	**/
   public void setIp00724MemberName(char[] value) throws CFException {
      ip00724TableEntry.setIp00724MemberName(value);
   } 

     /**
	 * 	Update Ip00724MemberName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724MemberName(char[] source, int sourceIndex) throws CFException {
      ip00724TableEntry.setIp00724MemberName(source, sourceIndex);
   	
   }
   
   public void setIp00724MemberName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00724TableEntry.setIp00724MemberName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00724MemberName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724MemberName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00724TableEntry.setIp00724MemberName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00724MemberName with another Field
	 *	@param value
	 */
   public void setIp00724MemberName(Field source) {
      ip00724TableEntry.setIp00724MemberName(source);
   }  
   
     /**
	 * 	Update Ip00724MemberName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724MemberName(Field source, int sourceIndex,int sourceLen) {
      ip00724TableEntry.setIp00724MemberName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00724MemberName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724MemberName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00724TableEntry.setIp00724MemberName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of txnAmt2800
	 *	@return txnAmt2800
	 */
   public char[] getTxnAmt2800() throws CFException  {              
   		return work.getTxnAmt2800();
   }

  
	/**
	*  set variable txnAmt2800
	*  @param value
	**/
   public void setTxnAmt2800(char[] value) throws CFException {
      work.setTxnAmt2800(value);
   } 

	/**
	 *	Returns the value of ip65504D95CardIsS
	 *	@return ip65504D95CardIsS
	 */
	public short getIp65504D95CardIsS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().getIp65504D95CardIsS();
	}
	
	/**
	 * 	Update Ip65504D95CardIsS with the passed value
	 *	@param number
	 */
	public void setIp65504D95CardIsS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D95CardIsS(number);
	}

	public void setIp65504D95CardIsS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D95CardIsS((short)number);
	}

	public void setIp65504D95CardIsS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D95CardIsS((short)number);
	}



	/**
	 *	Returns the value of ip65504D02PanNbrL
	 *	@return ip65504D02PanNbrL
	 */
	public short getIp65504D02PanNbrL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D02PanNbrL();
	}
	
	/**
	 * 	Update Ip65504D02PanNbrL with the passed value
	 *	@param number
	 */
	public void setIp65504D02PanNbrL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D02PanNbrL(number);
	}

	public void setIp65504D02PanNbrL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D02PanNbrL((short)number);
	}

	public void setIp65504D02PanNbrL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D02PanNbrL((short)number);
	}



	/**
	 *	Returns the value of ip65504D22PoiDcdS
	 *	@return ip65504D22PoiDcdS
	 */
	public short getIp65504D22PoiDcdS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D22PoiDcdS();
	}
	
	/**
	 * 	Update Ip65504D22PoiDcdS with the passed value
	 *	@param number
	 */
	public void setIp65504D22PoiDcdS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D22PoiDcdS(number);
	}

	public void setIp65504D22PoiDcdS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D22PoiDcdS((short)number);
	}

	public void setIp65504D22PoiDcdS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D22PoiDcdS((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of ip00724CountryCode
	 *	@return ip00724CountryCode
	 */
   public char[] getIp00724CountryCode() throws CFException  {              
   		return ip00724TableEntry.getIp00724CountryCode();
   }

  
	/**
	*  set variable ip00724CountryCode
	*  @param value
	**/
   public void setIp00724CountryCode(char[] value) throws CFException {
      ip00724TableEntry.setIp00724CountryCode(value);
   } 

     /**
	 * 	Update Ip00724CountryCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724CountryCode(char[] source, int sourceIndex) throws CFException {
      ip00724TableEntry.setIp00724CountryCode(source, sourceIndex);
   	
   }
   
   public void setIp00724CountryCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00724TableEntry.setIp00724CountryCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00724CountryCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724CountryCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00724TableEntry.setIp00724CountryCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00724CountryCode with another Field
	 *	@param value
	 */
   public void setIp00724CountryCode(Field source) {
      ip00724TableEntry.setIp00724CountryCode(source);
   }  
   
     /**
	 * 	Update Ip00724CountryCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724CountryCode(Field source, int sourceIndex,int sourceLen) {
      ip00724TableEntry.setIp00724CountryCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00724CountryCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724CountryCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00724TableEntry.setIp00724CountryCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504D31AcqRefL
	 *	@return ip65504D31AcqRefL
	 */
	public short getIp65504D31AcqRefL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D31AcqRefL();
	}
	
	/**
	 * 	Update Ip65504D31AcqRefL with the passed value
	 *	@param number
	 */
	public void setIp65504D31AcqRefL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D31AcqRefL(number);
	}

	public void setIp65504D31AcqRefL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D31AcqRefL((short)number);
	}

	public void setIp65504D31AcqRefL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D31AcqRefL((short)number);
	}



	/**
	 *	Returns the value of ip65504D94TrxOidL
	 *	@return ip65504D94TrxOidL
	 */
	public short getIp65504D94TrxOidL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().getIp65504D94TrxOidL();
	}
	
	/**
	 * 	Update Ip65504D94TrxOidL with the passed value
	 *	@param number
	 */
	public void setIp65504D94TrxOidL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D94TrxOidL(number);
	}

	public void setIp65504D94TrxOidL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D94TrxOidL((short)number);
	}

	public void setIp65504D94TrxOidL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D94TrxOidL((short)number);
	}



	/**
	 *	Test condition "Y" for isIp00724EntryFoundY88()
	 *	@return  Returns true if isIp00724EntryFoundY88() is "Y"
	 */
   public boolean isIp00724EntryFoundY88() throws CFException {
      return ip00724EntryFoundYGroup.isIp00724EntryFoundY88();
   }

	/**
	*  set values "Y"
	*/
   	public void setIp00724EntryFoundY88True()  throws CFException{  			
    	ip00724EntryFoundYGroup.setIp00724EntryFoundY88True();
   	}
	/**
	 *	Returns the value of ip65504D31AcqRefS
	 *	@return ip65504D31AcqRefS
	 */
	public short getIp65504D31AcqRefS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D31AcqRefS();
	}
	
	/**
	 * 	Update Ip65504D31AcqRefS with the passed value
	 *	@param number
	 */
	public void setIp65504D31AcqRefS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D31AcqRefS(number);
	}

	public void setIp65504D31AcqRefS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D31AcqRefS((short)number);
	}

	public void setIp65504D31AcqRefS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D31AcqRefS((short)number);
	}




        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public ExtractFieldsOutCtx getExtractFieldsOutCtx() {
            return new ExtractFieldsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmMsg.hashCode();
        str += ip08101RunControlRecord.hashCode();
        str += work.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip00724TableEntry.hashCode();
        str += ip65504SelElemEntriesAll.hashCode();
        str += chipLiabVariables800.hashCode();
        str += ip00724EntryFoundYGroup.hashCode();
       return str.hashCode();
    }

    public ExtractFieldsInCtx clone() {
        ExtractFieldsInCtx cloneObj = new ExtractFieldsInCtx();
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip00724TableEntry = new Ip00724TableEntry();
        cloneObj.ip00724TableEntry.set(ip00724TableEntry.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        cloneObj.ip00724EntryFoundYGroup = new Ip00724EntryFoundYGroup();
        cloneObj.ip00724EntryFoundYGroup.set(ip00724EntryFoundYGroup.getClonedField());
        return cloneObj;
    }

    }

    public ExtractFieldsInCtx getExtractFieldsInCtx() {
            return new ExtractFieldsInCtx();
    }
     public class ExtractFieldsOutCtx implements Cloneable {
     Ip66102IpmMsg ip66102IpmMsg = Ip809050Ctx.this.getIp66102IpmMsg();
     Ip08101RunControlRecord ip08101RunControlRecord = Ip809050Ctx.this.getIp08101RunControlRecord();
     Work work = Ip809050Ctx.this.getWork();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip809050Ctx.this.getIp65504DeMapGroup();
     Ip00724TableEntry ip00724TableEntry = Ip809050Ctx.this.getIp00724TableEntry();
     Ip65504SelElemEntriesAll ip65504SelElemEntriesAll = Ip809050Ctx.this.getIp65504SelElemEntriesAll();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();
     Ip00724EntryFoundYGroup ip00724EntryFoundYGroup = Ip809050Ctx.this.getIp00724EntryFoundYGroup();

	/**
	 *	Returns the value of ip65504D04TrxAmtL
	 *	@return ip65504D04TrxAmtL
	 */
	public short getIp65504D04TrxAmtL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D04TrxAmtL();
	}
	
	/**
	 * 	Update Ip65504D04TrxAmtL with the passed value
	 *	@param number
	 */
	public void setIp65504D04TrxAmtL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtL(number);
	}

	public void setIp65504D04TrxAmtL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtL((short)number);
	}

	public void setIp65504D04TrxAmtL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtL((short)number);
	}



	/**
	 *	Returns the value of cbhDate800
	 *	@return cbhDate800
	 */
   public char[] getCbhDate800() throws CFException  {              
   		return chipLiabVariables800.getCbhDate800();
   }

  
	/**
	*  set variable cbhDate800
	*  @param value
	**/
   public void setCbhDate800(char[] value) throws CFException {
      chipLiabVariables800.setCbhDate800(value);
   } 

     /**
	 * 	Update CbhDate800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCbhDate800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.setCbhDate800(source, sourceIndex);
   	
   }
   
   public void setCbhDate800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.setCbhDate800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CbhDate800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCbhDate800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.setCbhDate800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CbhDate800 with another Field
	 *	@param value
	 */
   public void setCbhDate800(Field source) {
      chipLiabVariables800.setCbhDate800(source);
   }  
   
     /**
	 * 	Update CbhDate800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCbhDate800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.setCbhDate800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CbhDate800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCbhDate800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.setCbhDate800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102NormalIpmMsg
	 *	@return ip66102NormalIpmMsg
	 */   
	 public Ip66102NormalIpmMsg getIp66102NormalIpmMsg() {
   	return ip66102IpmMsg.getIp66102NormalIpmMsg();
   }

   /**
	* 	Update Ip66102NormalIpmMsg with the passed value
	*	@param value
	*/
   public void setIp66102NormalIpmMsg(char[] value) throws CFException {
      ip66102IpmMsg.setIp66102NormalIpmMsg(value);
   }   

     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102NormalIpmMsg with another Field
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(Field source) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source);
   }  
   
     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(Field source, int sourceIndex,int sourceLen) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66102IpmMsg.setIp66102NormalIpmMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of de031800
	 *	@return de031800
	 */
   public char[] getDe031800() throws CFException  {              
   		return chipLiabVariables800.getDe0311800().getDe031800();
   }

  
	/**
	*  set variable de031800
	*  @param value
	**/
   public void setDe031800(char[] value) throws CFException {
      chipLiabVariables800.getDe0311800().setDe031800(value);
   } 

     /**
	 * 	Update De031800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDe031800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.getDe0311800().setDe031800(source, sourceIndex);
   	
   }
   
   public void setDe031800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.getDe0311800().setDe031800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update De031800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDe031800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getDe0311800().setDe031800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update De031800 with another Field
	 *	@param value
	 */
   public void setDe031800(Field source) {
      chipLiabVariables800.getDe0311800().setDe031800(source);
   }  
   
     /**
	 * 	Update De031800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDe031800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.getDe0311800().setDe031800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update De031800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDe031800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getDe0311800().setDe031800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504D02PanNbrS
	 *	@return ip65504D02PanNbrS
	 */
	public short getIp65504D02PanNbrS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D02PanNbrS();
	}
	
	/**
	 * 	Update Ip65504D02PanNbrS with the passed value
	 *	@param number
	 */
	public void setIp65504D02PanNbrS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D02PanNbrS(number);
	}

	public void setIp65504D02PanNbrS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D02PanNbrS((short)number);
	}

	public void setIp65504D02PanNbrS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D02PanNbrS((short)number);
	}



	/**
	 *	Returns the value of ip65504D95CardIsL
	 *	@return ip65504D95CardIsL
	 */
	public short getIp65504D95CardIsL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().getIp65504D95CardIsL();
	}
	
	/**
	 * 	Update Ip65504D95CardIsL with the passed value
	 *	@param number
	 */
	public void setIp65504D95CardIsL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D95CardIsL(number);
	}

	public void setIp65504D95CardIsL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D95CardIsL((short)number);
	}

	public void setIp65504D95CardIsL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D95CardIsL((short)number);
	}



	/**
	 *	Returns the value of ip65504D22PoiDcdL
	 *	@return ip65504D22PoiDcdL
	 */
	public short getIp65504D22PoiDcdL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D22PoiDcdL();
	}
	
	/**
	 * 	Update Ip65504D22PoiDcdL with the passed value
	 *	@param number
	 */
	public void setIp65504D22PoiDcdL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D22PoiDcdL(number);
	}

	public void setIp65504D22PoiDcdL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D22PoiDcdL((short)number);
	}

	public void setIp65504D22PoiDcdL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D22PoiDcdL((short)number);
	}



	/**
	 *	Returns the value of txnAmt800
	 *	@return txnAmt800
	 */
   public char[] getTxnAmt800() throws CFException  {              
   		return chipLiabVariables800.getTxnAmt1800().getTxnAmt800();
   }

  
	/**
	*  set variable txnAmt800
	*  @param value
	**/
   public void setTxnAmt800(char[] value) throws CFException {
      chipLiabVariables800.getTxnAmt1800().setTxnAmt800(value);
   } 

     /**
	 * 	Update TxnAmt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTxnAmt800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.getTxnAmt1800().setTxnAmt800(source, sourceIndex);
   	
   }
   
   public void setTxnAmt800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.getTxnAmt1800().setTxnAmt800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TxnAmt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTxnAmt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getTxnAmt1800().setTxnAmt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TxnAmt800 with another Field
	 *	@param value
	 */
   public void setTxnAmt800(Field source) {
      chipLiabVariables800.getTxnAmt1800().setTxnAmt800(source);
   }  
   
     /**
	 * 	Update TxnAmt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTxnAmt800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.getTxnAmt1800().setTxnAmt800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TxnAmt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTxnAmt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getTxnAmt1800().setTxnAmt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip08101ProcessDate
	 *	@return ip08101ProcessDate
	 */
	public long getIp08101ProcessDate() throws CFException {
   		return ip08101RunControlRecord.getIp08101ProcessDate();
	}


	/**
	 *	Returns String value of ip08101ProcessDate
	 *	@return ip08101ProcessDate
	 */
	public char[]  getIp08101ProcessDateString() throws CFException {
	     return String.valueOf(ip08101RunControlRecord.getIp08101ProcessDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip08101ProcessDateIsNumeric()  throws CFException{
	    return ip08101RunControlRecord.ip08101ProcessDateIsNumeric();
	}

	/**
	 * 	Update Ip08101ProcessDate with the passed value
	 *	@param number
	 */
	public void setIp08101ProcessDate(long number)  throws CFException{
		ip08101RunControlRecord.setIp08101ProcessDate(number);
	}
	

	
	/**
	 * 	Update Ip08101ProcessDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp08101ProcessDate(char[] value)  throws CFException {
		ip08101RunControlRecord.setIp08101ProcessDate(value);
	}
	
	/**
	 * 	Update Ip08101ProcessDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp08101ProcessDateString(char[] value)  throws CFException{
		ip08101RunControlRecord.setIp08101ProcessDate(value);
	}	

	/**
	 *	Returns the value of txnAmtDec800
	 *	@return txnAmtDec800
	 */
   public char[] getTxnAmtDec800() throws CFException  {              
   		return chipLiabVariables800.getTxnAmt1800().getTxnAmtDec800();
   }

  
	/**
	*  set variable txnAmtDec800
	*  @param value
	**/
   public void setTxnAmtDec800(char[] value) throws CFException {
      chipLiabVariables800.getTxnAmt1800().setTxnAmtDec800(value);
   } 

     /**
	 * 	Update TxnAmtDec800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTxnAmtDec800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.getTxnAmt1800().setTxnAmtDec800(source, sourceIndex);
   	
   }
   
   public void setTxnAmtDec800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.getTxnAmt1800().setTxnAmtDec800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TxnAmtDec800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTxnAmtDec800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getTxnAmt1800().setTxnAmtDec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TxnAmtDec800 with another Field
	 *	@param value
	 */
   public void setTxnAmtDec800(Field source) {
      chipLiabVariables800.getTxnAmt1800().setTxnAmtDec800(source);
   }  
   
     /**
	 * 	Update TxnAmtDec800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTxnAmtDec800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.getTxnAmt1800().setTxnAmtDec800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TxnAmtDec800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTxnAmtDec800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getTxnAmt1800().setTxnAmtDec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of countryCode800
	 *	@return countryCode800
	 */
   public char[] getCountryCode800() throws CFException  {              
   		return chipLiabVariables800.getCountryCode800();
   }

  
	/**
	*  set variable countryCode800
	*  @param value
	**/
   public void setCountryCode800(char[] value) throws CFException {
      chipLiabVariables800.setCountryCode800(value);
   } 

     /**
	 * 	Update CountryCode800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountryCode800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.setCountryCode800(source, sourceIndex);
   	
   }
   
   public void setCountryCode800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.setCountryCode800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CountryCode800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountryCode800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.setCountryCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CountryCode800 with another Field
	 *	@param value
	 */
   public void setCountryCode800(Field source) {
      chipLiabVariables800.setCountryCode800(source);
   }  
   
     /**
	 * 	Update CountryCode800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountryCode800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.setCountryCode800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CountryCode800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountryCode800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.setCountryCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504D04TrxAmtS
	 *	@return ip65504D04TrxAmtS
	 */
	public short getIp65504D04TrxAmtS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D04TrxAmtS();
	}
	
	/**
	 * 	Update Ip65504D04TrxAmtS with the passed value
	 *	@param number
	 */
	public void setIp65504D04TrxAmtS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtS(number);
	}

	public void setIp65504D04TrxAmtS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtS((short)number);
	}

	public void setIp65504D04TrxAmtS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D04TrxAmtS((short)number);
	}



	/**
	 *	Returns the value of ip65504D49TrxCurL
	 *	@return ip65504D49TrxCurL
	 */
	public short getIp65504D49TrxCurL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().getIp65504D49TrxCurL();
	}
	
	/**
	 * 	Update Ip65504D49TrxCurL with the passed value
	 *	@param number
	 */
	public void setIp65504D49TrxCurL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurL(number);
	}

	public void setIp65504D49TrxCurL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurL((short)number);
	}

	public void setIp65504D49TrxCurL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurL((short)number);
	}



	/**
	 *	Returns the value of ip65504D49TrxCurS
	 *	@return ip65504D49TrxCurS
	 */
	public short getIp65504D49TrxCurS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().getIp65504D49TrxCurS();
	}
	
	/**
	 * 	Update Ip65504D49TrxCurS with the passed value
	 *	@param number
	 */
	public void setIp65504D49TrxCurS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurS(number);
	}

	public void setIp65504D49TrxCurS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurS((short)number);
	}

	public void setIp65504D49TrxCurS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().setIp65504D49TrxCurS((short)number);
	}



	/**
	 *	Returns the value of txnCurr800
	 *	@return txnCurr800
	 */
   public char[] getTxnCurr800() throws CFException  {              
   		return chipLiabVariables800.getTxnCurr800();
   }

  
	/**
	*  set variable txnCurr800
	*  @param value
	**/
   public void setTxnCurr800(char[] value) throws CFException {
      chipLiabVariables800.setTxnCurr800(value);
   } 

     /**
	 * 	Update TxnCurr800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTxnCurr800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.setTxnCurr800(source, sourceIndex);
   	
   }
   
   public void setTxnCurr800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.setTxnCurr800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TxnCurr800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTxnCurr800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.setTxnCurr800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TxnCurr800 with another Field
	 *	@param value
	 */
   public void setTxnCurr800(Field source) {
      chipLiabVariables800.setTxnCurr800(source);
   }  
   
     /**
	 * 	Update TxnCurr800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTxnCurr800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.setTxnCurr800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TxnCurr800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTxnCurr800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.setTxnCurr800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504D94TrxOidS
	 *	@return ip65504D94TrxOidS
	 */
	public short getIp65504D94TrxOidS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().getIp65504D94TrxOidS();
	}
	
	/**
	 * 	Update Ip65504D94TrxOidS with the passed value
	 *	@param number
	 */
	public void setIp65504D94TrxOidS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D94TrxOidS(number);
	}

	public void setIp65504D94TrxOidS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D94TrxOidS((short)number);
	}

	public void setIp65504D94TrxOidS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D94TrxOidS((short)number);
	}



	/**
	 *	Returns the value of ip00724MemberName
	 *	@return ip00724MemberName
	 */
   public char[] getIp00724MemberName() throws CFException  {              
   		return ip00724TableEntry.getIp00724MemberName();
   }

  
	/**
	*  set variable ip00724MemberName
	*  @param value
	**/
   public void setIp00724MemberName(char[] value) throws CFException {
      ip00724TableEntry.setIp00724MemberName(value);
   } 

     /**
	 * 	Update Ip00724MemberName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724MemberName(char[] source, int sourceIndex) throws CFException {
      ip00724TableEntry.setIp00724MemberName(source, sourceIndex);
   	
   }
   
   public void setIp00724MemberName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00724TableEntry.setIp00724MemberName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00724MemberName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724MemberName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00724TableEntry.setIp00724MemberName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00724MemberName with another Field
	 *	@param value
	 */
   public void setIp00724MemberName(Field source) {
      ip00724TableEntry.setIp00724MemberName(source);
   }  
   
     /**
	 * 	Update Ip00724MemberName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724MemberName(Field source, int sourceIndex,int sourceLen) {
      ip00724TableEntry.setIp00724MemberName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00724MemberName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724MemberName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00724TableEntry.setIp00724MemberName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of txnPrimAcctNbr800
	 *	@return txnPrimAcctNbr800
	 */
   public char[] getTxnPrimAcctNbr800() throws CFException  {              
   		return chipLiabVariables800.getTxnPrimAcctNbr800();
   }

  
	/**
	*  set variable txnPrimAcctNbr800
	*  @param value
	**/
   public void setTxnPrimAcctNbr800(char[] value) throws CFException {
      chipLiabVariables800.setTxnPrimAcctNbr800(value);
   } 

     /**
	 * 	Update TxnPrimAcctNbr800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTxnPrimAcctNbr800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.setTxnPrimAcctNbr800(source, sourceIndex);
   	
   }
   
   public void setTxnPrimAcctNbr800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.setTxnPrimAcctNbr800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TxnPrimAcctNbr800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTxnPrimAcctNbr800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.setTxnPrimAcctNbr800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TxnPrimAcctNbr800 with another Field
	 *	@param value
	 */
   public void setTxnPrimAcctNbr800(Field source) {
      chipLiabVariables800.setTxnPrimAcctNbr800(source);
   }  
   
     /**
	 * 	Update TxnPrimAcctNbr800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTxnPrimAcctNbr800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.setTxnPrimAcctNbr800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TxnPrimAcctNbr800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTxnPrimAcctNbr800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.setTxnPrimAcctNbr800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of txnAmt2800
	 *	@return txnAmt2800
	 */
   public char[] getTxnAmt2800() throws CFException  {              
   		return work.getTxnAmt2800();
   }

  
	/**
	*  set variable txnAmt2800
	*  @param value
	**/
   public void setTxnAmt2800(char[] value) throws CFException {
      work.setTxnAmt2800(value);
   } 

	/**
	 *	Returns the value of ip65504D95CardIsS
	 *	@return ip65504D95CardIsS
	 */
	public short getIp65504D95CardIsS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().getIp65504D95CardIsS();
	}
	
	/**
	 * 	Update Ip65504D95CardIsS with the passed value
	 *	@param number
	 */
	public void setIp65504D95CardIsS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D95CardIsS(number);
	}

	public void setIp65504D95CardIsS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D95CardIsS((short)number);
	}

	public void setIp65504D95CardIsS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D95CardIsS((short)number);
	}



	/**
	 *	Returns the value of sndrMbrId800
	 *	@return sndrMbrId800
	 */
   public char[] getSndrMbrId800() throws CFException  {              
   		return chipLiabVariables800.getSndrMbrId800();
   }

  
	/**
	*  set variable sndrMbrId800
	*  @param value
	**/
   public void setSndrMbrId800(char[] value) throws CFException {
      chipLiabVariables800.setSndrMbrId800(value);
   } 

     /**
	 * 	Update SndrMbrId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSndrMbrId800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.setSndrMbrId800(source, sourceIndex);
   	
   }
   
   public void setSndrMbrId800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.setSndrMbrId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SndrMbrId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSndrMbrId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.setSndrMbrId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SndrMbrId800 with another Field
	 *	@param value
	 */
   public void setSndrMbrId800(Field source) {
      chipLiabVariables800.setSndrMbrId800(source);
   }  
   
     /**
	 * 	Update SndrMbrId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSndrMbrId800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.setSndrMbrId800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SndrMbrId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSndrMbrId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.setSndrMbrId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504D02PanNbrL
	 *	@return ip65504D02PanNbrL
	 */
	public short getIp65504D02PanNbrL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D02PanNbrL();
	}
	
	/**
	 * 	Update Ip65504D02PanNbrL with the passed value
	 *	@param number
	 */
	public void setIp65504D02PanNbrL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D02PanNbrL(number);
	}

	public void setIp65504D02PanNbrL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D02PanNbrL((short)number);
	}

	public void setIp65504D02PanNbrL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D02PanNbrL((short)number);
	}



	/**
	 *	Returns the value of ip65504D22PoiDcdS
	 *	@return ip65504D22PoiDcdS
	 */
	public short getIp65504D22PoiDcdS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D22PoiDcdS();
	}
	
	/**
	 * 	Update Ip65504D22PoiDcdS with the passed value
	 *	@param number
	 */
	public void setIp65504D22PoiDcdS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D22PoiDcdS(number);
	}

	public void setIp65504D22PoiDcdS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D22PoiDcdS((short)number);
	}

	public void setIp65504D22PoiDcdS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D22PoiDcdS((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of ip00724CountryCode
	 *	@return ip00724CountryCode
	 */
   public char[] getIp00724CountryCode() throws CFException  {              
   		return ip00724TableEntry.getIp00724CountryCode();
   }

  
	/**
	*  set variable ip00724CountryCode
	*  @param value
	**/
   public void setIp00724CountryCode(char[] value) throws CFException {
      ip00724TableEntry.setIp00724CountryCode(value);
   } 

     /**
	 * 	Update Ip00724CountryCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724CountryCode(char[] source, int sourceIndex) throws CFException {
      ip00724TableEntry.setIp00724CountryCode(source, sourceIndex);
   	
   }
   
   public void setIp00724CountryCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00724TableEntry.setIp00724CountryCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00724CountryCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724CountryCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00724TableEntry.setIp00724CountryCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00724CountryCode with another Field
	 *	@param value
	 */
   public void setIp00724CountryCode(Field source) {
      ip00724TableEntry.setIp00724CountryCode(source);
   }  
   
     /**
	 * 	Update Ip00724CountryCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724CountryCode(Field source, int sourceIndex,int sourceLen) {
      ip00724TableEntry.setIp00724CountryCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00724CountryCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724CountryCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00724TableEntry.setIp00724CountryCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00724Ica
	 *	@return ip00724Ica
	 */
	public long getIp00724Ica() throws CFException {
   		return ip00724TableEntry.getIp00724Key().getIp00724Ica();
	}


	/**
	 *	Returns String value of ip00724Ica
	 *	@return ip00724Ica
	 */
	public char[]  getIp00724IcaString() throws CFException {
	     return String.valueOf(ip00724TableEntry.getIp00724Key().getIp00724IcaString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00724IcaIsNumeric()  throws CFException{
	    return ip00724TableEntry.getIp00724Key().ip00724IcaIsNumeric();
	}

	/**
	 * 	Update Ip00724Ica with the passed value
	 *	@param number
	 */
	public void setIp00724Ica(long number)  throws CFException{
		ip00724TableEntry.getIp00724Key().setIp00724Ica(number);
	}
	

	
	/**
	 * 	Update Ip00724Ica with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00724Ica(char[] value)  throws CFException {
		ip00724TableEntry.getIp00724Key().setIp00724Ica(value);
	}
	
	/**
	 * 	Update Ip00724Ica with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00724IcaString(char[] value)  throws CFException{
		ip00724TableEntry.getIp00724Key().setIp00724Ica(value);
	}	

	/**
	 *	Returns the value of de022800
	 *	@return de022800
	 */
   public char[] getDe022800() throws CFException  {              
   		return chipLiabVariables800.getDe0221800().getDe022800();
   }

  
	/**
	*  set variable de022800
	*  @param value
	**/
   public void setDe022800(char[] value) throws CFException {
      chipLiabVariables800.getDe0221800().setDe022800(value);
   } 

     /**
	 * 	Update De022800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDe022800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.getDe0221800().setDe022800(source, sourceIndex);
   	
   }
   
   public void setDe022800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.getDe0221800().setDe022800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update De022800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDe022800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getDe0221800().setDe022800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update De022800 with another Field
	 *	@param value
	 */
   public void setDe022800(Field source) {
      chipLiabVariables800.getDe0221800().setDe022800(source);
   }  
   
     /**
	 * 	Update De022800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDe022800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.getDe0221800().setDe022800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update De022800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDe022800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getDe0221800().setDe022800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504D31AcqRefL
	 *	@return ip65504D31AcqRefL
	 */
	public short getIp65504D31AcqRefL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D31AcqRefL();
	}
	
	/**
	 * 	Update Ip65504D31AcqRefL with the passed value
	 *	@param number
	 */
	public void setIp65504D31AcqRefL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D31AcqRefL(number);
	}

	public void setIp65504D31AcqRefL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D31AcqRefL((short)number);
	}

	public void setIp65504D31AcqRefL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D31AcqRefL((short)number);
	}



	/**
	 *	Returns the value of ip65504D94TrxOidL
	 *	@return ip65504D94TrxOidL
	 */
	public short getIp65504D94TrxOidL() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().getIp65504D94TrxOidL();
	}
	
	/**
	 * 	Update Ip65504D94TrxOidL with the passed value
	 *	@param number
	 */
	public void setIp65504D94TrxOidL(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D94TrxOidL(number);
	}

	public void setIp65504D94TrxOidL(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D94TrxOidL((short)number);
	}

	public void setIp65504D94TrxOidL(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().setIp65504D94TrxOidL((short)number);
	}



	/**
	 *	Returns the value of custName800
	 *	@return custName800
	 */
   public char[] getCustName800() throws CFException  {              
   		return chipLiabVariables800.getCustName800();
   }

  
	/**
	*  set variable custName800
	*  @param value
	**/
   public void setCustName800(char[] value) throws CFException {
      chipLiabVariables800.setCustName800(value);
   } 

     /**
	 * 	Update CustName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCustName800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.setCustName800(source, sourceIndex);
   	
   }
   
   public void setCustName800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.setCustName800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CustName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCustName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.setCustName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CustName800 with another Field
	 *	@param value
	 */
   public void setCustName800(Field source) {
      chipLiabVariables800.setCustName800(source);
   }  
   
     /**
	 * 	Update CustName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCustName800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.setCustName800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CustName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCustName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.setCustName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of cbhRefNum800
	 *	@return cbhRefNum800
	 */
   public char[] getCbhRefNum800() throws CFException  {              
   		return chipLiabVariables800.getCbhRefNum1800().getCbhRefNum800();
   }

  
	/**
	*  set variable cbhRefNum800
	*  @param value
	**/
   public void setCbhRefNum800(char[] value) throws CFException {
      chipLiabVariables800.getCbhRefNum1800().setCbhRefNum800(value);
   } 

     /**
	 * 	Update CbhRefNum800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCbhRefNum800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.getCbhRefNum1800().setCbhRefNum800(source, sourceIndex);
   	
   }
   
   public void setCbhRefNum800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.getCbhRefNum1800().setCbhRefNum800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CbhRefNum800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCbhRefNum800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getCbhRefNum1800().setCbhRefNum800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CbhRefNum800 with another Field
	 *	@param value
	 */
   public void setCbhRefNum800(Field source) {
      chipLiabVariables800.getCbhRefNum1800().setCbhRefNum800(source);
   }  
   
     /**
	 * 	Update CbhRefNum800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCbhRefNum800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.getCbhRefNum1800().setCbhRefNum800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CbhRefNum800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCbhRefNum800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.getCbhRefNum1800().setCbhRefNum800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504D31AcqRefS
	 *	@return ip65504D31AcqRefS
	 */
	public short getIp65504D31AcqRefS() throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D31AcqRefS();
	}
	
	/**
	 * 	Update Ip65504D31AcqRefS with the passed value
	 *	@param number
	 */
	public void setIp65504D31AcqRefS(short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D31AcqRefS(number);
	}

	public void setIp65504D31AcqRefS(int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D31AcqRefS((short)number);
	}

	public void setIp65504D31AcqRefS(long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().setIp65504D31AcqRefS((short)number);
	}




        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmMsg.hashCode();
        str += ip08101RunControlRecord.hashCode();
        str += work.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip00724TableEntry.hashCode();
        str += ip65504SelElemEntriesAll.hashCode();
        str += chipLiabVariables800.hashCode();
        str += ip00724EntryFoundYGroup.hashCode();
       return str.hashCode();
    }

    public ExtractFieldsOutCtx clone() {
        ExtractFieldsOutCtx cloneObj = new ExtractFieldsOutCtx();
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip00724TableEntry = new Ip00724TableEntry();
        cloneObj.ip00724TableEntry.set(ip00724TableEntry.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        cloneObj.ip00724EntryFoundYGroup = new Ip00724EntryFoundYGroup();
        cloneObj.ip00724EntryFoundYGroup.set(ip00724EntryFoundYGroup.getClonedField());
        return cloneObj;
    }

    }

    public ExtractFieldsOutCtx getExtractFieldsOutCtx() {
            return new ExtractFieldsOutCtx();
    }
     public class CloseFilesInCtx implements Cloneable {
     Sys203RecordCount600 sys203RecordCount600 = Ip809050Ctx.this.getSys203RecordCount600();
     Sys206RecordCount600 sys206RecordCount600 = Ip809050Ctx.this.getSys206RecordCount600();
     Sys001RecordCount600 sys001RecordCount600 = Ip809050Ctx.this.getSys001RecordCount600();
     Sys205RecordCount600 sys205RecordCount600 = Ip809050Ctx.this.getSys205RecordCount600();
     Sys207RecordCount600 sys207RecordCount600 = Ip809050Ctx.this.getSys207RecordCount600();
     Sys212RecordCount600 sys212RecordCount600 = Ip809050Ctx.this.getSys212RecordCount600();
     Sys216RecordCount600 sys216RecordCount600 = Ip809050Ctx.this.getSys216RecordCount600();
     Sys215RecordCount600 sys215RecordCount600 = Ip809050Ctx.this.getSys215RecordCount600();
     Sys209RecordCount600 sys209RecordCount600 = Ip809050Ctx.this.getSys209RecordCount600();
     Sys202RecordCount600 sys202RecordCount600 = Ip809050Ctx.this.getSys202RecordCount600();
     Sys211RecordCount600 sys211RecordCount600 = Ip809050Ctx.this.getSys211RecordCount600();
     Sys210RecordCount600 sys210RecordCount600 = Ip809050Ctx.this.getSys210RecordCount600();
     Work work = Ip809050Ctx.this.getWork();
     Sys204RecordCount600 sys204RecordCount600 = Ip809050Ctx.this.getSys204RecordCount600();
     Sys213RecordCount600 sys213RecordCount600 = Ip809050Ctx.this.getSys213RecordCount600();
     Sys201RecordCount600 sys201RecordCount600 = Ip809050Ctx.this.getSys201RecordCount600();
     Sys214RecordCount600 sys214RecordCount600 = Ip809050Ctx.this.getSys214RecordCount600();

	/**
	 *	Returns the value of amtE1852800
	 *	@return amtE1852800
	 */
	public long getAmtE1852800() throws CFException {
   		return work.getAmtE1852800();
	}


	/**
	 *	Returns String value of amtE1852800
	 *	@return amtE1852800
	 */
	public char[]  getAmtE1852800String() throws CFException {
	     return String.valueOf(work.getAmtE1852800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1852800IsNumeric()  throws CFException{
	    return work.amtE1852800IsNumeric();
	}

	/**
	 * 	Update AmtE1852800 with the passed value
	 *	@param number
	 */
	public void setAmtE1852800(long number)  throws CFException{
		work.setAmtE1852800(number);
	}
	

	
	/**
	 * 	Update AmtE1852800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1852800(char[] value)  throws CFException {
		work.setAmtE1852800(value);
	}
	
	/**
	 * 	Update AmtE1852800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1852800String(char[] value)  throws CFException{
		work.setAmtE1852800(value);
	}	

	/**
	 *	Returns the value of sys203RecordCount600
	 *	@return sys203RecordCount600
	 */   
	 public Sys203RecordCount600 getSys203RecordCount600() {
   	return sys203RecordCount600;
   }


	/**
	 *	Returns the value of transAmount800
	 *	@return transAmount800
	 */
	public long getTransAmount800() throws CFException {
   		return work.getTransAmount800();
	}


	/**
	 *	Returns String value of transAmount800
	 *	@return transAmount800
	 */
	public char[]  getTransAmount800String() throws CFException {
	     return String.valueOf(work.getTransAmount800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean transAmount800IsNumeric()  throws CFException{
	    return work.transAmount800IsNumeric();
	}

	/**
	 * 	Update TransAmount800 with the passed value
	 *	@param number
	 */
	public void setTransAmount800(long number)  throws CFException{
		work.setTransAmount800(number);
	}
	

	
	/**
	 * 	Update TransAmount800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTransAmount800(char[] value)  throws CFException {
		work.setTransAmount800(value);
	}
	
	/**
	 * 	Update TransAmount800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTransAmount800String(char[] value)  throws CFException{
		work.setTransAmount800(value);
	}	

	/**
	 *	Returns the value of amtE1848800
	 *	@return amtE1848800
	 */
	public long getAmtE1848800() throws CFException {
   		return work.getAmtE1848800();
	}


	/**
	 *	Returns String value of amtE1848800
	 *	@return amtE1848800
	 */
	public char[]  getAmtE1848800String() throws CFException {
	     return String.valueOf(work.getAmtE1848800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1848800IsNumeric()  throws CFException{
	    return work.amtE1848800IsNumeric();
	}

	/**
	 * 	Update AmtE1848800 with the passed value
	 *	@param number
	 */
	public void setAmtE1848800(long number)  throws CFException{
		work.setAmtE1848800(number);
	}
	

	
	/**
	 * 	Update AmtE1848800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1848800(char[] value)  throws CFException {
		work.setAmtE1848800(value);
	}
	
	/**
	 * 	Update AmtE1848800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1848800String(char[] value)  throws CFException{
		work.setAmtE1848800(value);
	}	

	/**
	 *	Returns the value of sys001RecordCount600
	 *	@return sys001RecordCount600
	 */   
	 public Sys001RecordCount600 getSys001RecordCount600() {
   	return sys001RecordCount600;
   }


	/**
	 *	Returns the value of sys215RecordCount600
	 *	@return sys215RecordCount600
	 */   
	 public Sys215RecordCount600 getSys215RecordCount600() {
   	return sys215RecordCount600;
   }


	/**
	 *	Returns the value of sys209RecordCount600
	 *	@return sys209RecordCount600
	 */   
	 public Sys209RecordCount600 getSys209RecordCount600() {
   	return sys209RecordCount600;
   }


	/**
	 *	Returns the value of ipmRecordsPds4400
	 *	@return ipmRecordsPds4400
	 */
	public int getIpmRecordsPds4400() throws CFException {        
   		return work.getIpmRecordsPds4400();
	}
	
	/**
	 * 	Update IpmRecordsPds4400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds4400(int number)  throws CFException{
		work.setIpmRecordsPds4400(number);
	}


	public void setIpmRecordsPds4400(long number)  throws CFException{
		work.setIpmRecordsPds4400((int)number);
	}


	/**
	 *	Returns the value of ipmRecordsPds1400
	 *	@return ipmRecordsPds1400
	 */
	public int getIpmRecordsPds1400() throws CFException {        
   		return work.getIpmRecordsPds1400();
	}
	
	/**
	 * 	Update IpmRecordsPds1400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds1400(int number)  throws CFException{
		work.setIpmRecordsPds1400(number);
	}


	public void setIpmRecordsPds1400(long number)  throws CFException{
		work.setIpmRecordsPds1400((int)number);
	}


	/**
	 *	Returns the value of sys211RecordCount600
	 *	@return sys211RecordCount600
	 */   
	 public Sys211RecordCount600 getSys211RecordCount600() {
   	return sys211RecordCount600;
   }


	/**
	 *	Returns the value of sys210RecordCount600
	 *	@return sys210RecordCount600
	 */   
	 public Sys210RecordCount600 getSys210RecordCount600() {
   	return sys210RecordCount600;
   }


	/**
	 *	Returns the value of ipmRecordsPds7400
	 *	@return ipmRecordsPds7400
	 */
	public int getIpmRecordsPds7400() throws CFException {        
   		return work.getIpmRecordsPds7400();
	}
	
	/**
	 * 	Update IpmRecordsPds7400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds7400(int number)  throws CFException{
		work.setIpmRecordsPds7400(number);
	}


	public void setIpmRecordsPds7400(long number)  throws CFException{
		work.setIpmRecordsPds7400((int)number);
	}


	/**
	 *	Returns the value of ipmCountReadCnt400
	 *	@return ipmCountReadCnt400
	 */
	public int getIpmCountReadCnt400() throws CFException {        
   		return work.getIpmCountReadCnt400();
	}
	
	/**
	 * 	Update IpmCountReadCnt400 with the passed value
	 *	@param number
	 */
	public void setIpmCountReadCnt400(int number)  throws CFException{
		work.setIpmCountReadCnt400(number);
	}


	public void setIpmCountReadCnt400(long number)  throws CFException{
		work.setIpmCountReadCnt400((int)number);
	}


	/**
	 *	Returns the value of ipmRecordsPds3400
	 *	@return ipmRecordsPds3400
	 */
	public int getIpmRecordsPds3400() throws CFException {        
   		return work.getIpmRecordsPds3400();
	}
	
	/**
	 * 	Update IpmRecordsPds3400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds3400(int number)  throws CFException{
		work.setIpmRecordsPds3400(number);
	}


	public void setIpmRecordsPds3400(long number)  throws CFException{
		work.setIpmRecordsPds3400((int)number);
	}


	/**
	 *	Returns the value of sys214RecordCount600
	 *	@return sys214RecordCount600
	 */   
	 public Sys214RecordCount600 getSys214RecordCount600() {
   	return sys214RecordCount600;
   }


	/**
	 *	Returns the value of sys206RecordCount600
	 *	@return sys206RecordCount600
	 */   
	 public Sys206RecordCount600 getSys206RecordCount600() {
   	return sys206RecordCount600;
   }


	/**
	 *	Returns the value of ipmRecordsPds6400
	 *	@return ipmRecordsPds6400
	 */
	public int getIpmRecordsPds6400() throws CFException {        
   		return work.getIpmRecordsPds6400();
	}
	
	/**
	 * 	Update IpmRecordsPds6400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds6400(int number)  throws CFException{
		work.setIpmRecordsPds6400(number);
	}


	public void setIpmRecordsPds6400(long number)  throws CFException{
		work.setIpmRecordsPds6400((int)number);
	}


	/**
	 *	Returns the value of sys205RecordCount600
	 *	@return sys205RecordCount600
	 */   
	 public Sys205RecordCount600 getSys205RecordCount600() {
   	return sys205RecordCount600;
   }


	/**
	 *	Returns the value of sys207RecordCount600
	 *	@return sys207RecordCount600
	 */   
	 public Sys207RecordCount600 getSys207RecordCount600() {
   	return sys207RecordCount600;
   }


	/**
	 *	Returns the value of sys212RecordCount600
	 *	@return sys212RecordCount600
	 */   
	 public Sys212RecordCount600 getSys212RecordCount600() {
   	return sys212RecordCount600;
   }


	/**
	 *	Returns the value of sys216RecordCount600
	 *	@return sys216RecordCount600
	 */   
	 public Sys216RecordCount600 getSys216RecordCount600() {
   	return sys216RecordCount600;
   }


	/**
	 *	Returns the value of amtE1750800
	 *	@return amtE1750800
	 */
	public long getAmtE1750800() throws CFException {
   		return work.getAmtE1750800();
	}


	/**
	 *	Returns String value of amtE1750800
	 *	@return amtE1750800
	 */
	public char[]  getAmtE1750800String() throws CFException {
	     return String.valueOf(work.getAmtE1750800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1750800IsNumeric()  throws CFException{
	    return work.amtE1750800IsNumeric();
	}

	/**
	 * 	Update AmtE1750800 with the passed value
	 *	@param number
	 */
	public void setAmtE1750800(long number)  throws CFException{
		work.setAmtE1750800(number);
	}
	

	
	/**
	 * 	Update AmtE1750800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1750800(char[] value)  throws CFException {
		work.setAmtE1750800(value);
	}
	
	/**
	 * 	Update AmtE1750800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1750800String(char[] value)  throws CFException{
		work.setAmtE1750800(value);
	}	

	/**
	 *	Returns the value of amtE1849800
	 *	@return amtE1849800
	 */
	public long getAmtE1849800() throws CFException {
   		return work.getAmtE1849800();
	}


	/**
	 *	Returns String value of amtE1849800
	 *	@return amtE1849800
	 */
	public char[]  getAmtE1849800String() throws CFException {
	     return String.valueOf(work.getAmtE1849800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1849800IsNumeric()  throws CFException{
	    return work.amtE1849800IsNumeric();
	}

	/**
	 * 	Update AmtE1849800 with the passed value
	 *	@param number
	 */
	public void setAmtE1849800(long number)  throws CFException{
		work.setAmtE1849800(number);
	}
	

	
	/**
	 * 	Update AmtE1849800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1849800(char[] value)  throws CFException {
		work.setAmtE1849800(value);
	}
	
	/**
	 * 	Update AmtE1849800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1849800String(char[] value)  throws CFException{
		work.setAmtE1849800(value);
	}	

	/**
	 *	Returns the value of sys202RecordCount600
	 *	@return sys202RecordCount600
	 */   
	 public Sys202RecordCount600 getSys202RecordCount600() {
   	return sys202RecordCount600;
   }


	/**
	 *	Returns the value of amtE1754800
	 *	@return amtE1754800
	 */
	public long getAmtE1754800() throws CFException {
   		return work.getAmtE1754800();
	}


	/**
	 *	Returns String value of amtE1754800
	 *	@return amtE1754800
	 */
	public char[]  getAmtE1754800String() throws CFException {
	     return String.valueOf(work.getAmtE1754800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1754800IsNumeric()  throws CFException{
	    return work.amtE1754800IsNumeric();
	}

	/**
	 * 	Update AmtE1754800 with the passed value
	 *	@param number
	 */
	public void setAmtE1754800(long number)  throws CFException{
		work.setAmtE1754800(number);
	}
	

	
	/**
	 * 	Update AmtE1754800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1754800(char[] value)  throws CFException {
		work.setAmtE1754800(value);
	}
	
	/**
	 * 	Update AmtE1754800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1754800String(char[] value)  throws CFException{
		work.setAmtE1754800(value);
	}	

	/**
	 *	Returns the value of ipmRecordsPds2400
	 *	@return ipmRecordsPds2400
	 */
	public int getIpmRecordsPds2400() throws CFException {        
   		return work.getIpmRecordsPds2400();
	}
	
	/**
	 * 	Update IpmRecordsPds2400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds2400(int number)  throws CFException{
		work.setIpmRecordsPds2400(number);
	}


	public void setIpmRecordsPds2400(long number)  throws CFException{
		work.setIpmRecordsPds2400((int)number);
	}


	/**
	 *	Returns the value of sys204RecordCount600
	 *	@return sys204RecordCount600
	 */   
	 public Sys204RecordCount600 getSys204RecordCount600() {
   	return sys204RecordCount600;
   }


	/**
	 *	Returns the value of amtE1850800
	 *	@return amtE1850800
	 */
	public long getAmtE1850800() throws CFException {
   		return work.getAmtE1850800();
	}


	/**
	 *	Returns String value of amtE1850800
	 *	@return amtE1850800
	 */
	public char[]  getAmtE1850800String() throws CFException {
	     return String.valueOf(work.getAmtE1850800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1850800IsNumeric()  throws CFException{
	    return work.amtE1850800IsNumeric();
	}

	/**
	 * 	Update AmtE1850800 with the passed value
	 *	@param number
	 */
	public void setAmtE1850800(long number)  throws CFException{
		work.setAmtE1850800(number);
	}
	

	
	/**
	 * 	Update AmtE1850800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1850800(char[] value)  throws CFException {
		work.setAmtE1850800(value);
	}
	
	/**
	 * 	Update AmtE1850800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1850800String(char[] value)  throws CFException{
		work.setAmtE1850800(value);
	}	

	/**
	 *	Returns the value of sys213RecordCount600
	 *	@return sys213RecordCount600
	 */   
	 public Sys213RecordCount600 getSys213RecordCount600() {
   	return sys213RecordCount600;
   }


	/**
	 *	Returns the value of ipmRecordsPds5400
	 *	@return ipmRecordsPds5400
	 */
	public int getIpmRecordsPds5400() throws CFException {        
   		return work.getIpmRecordsPds5400();
	}
	
	/**
	 * 	Update IpmRecordsPds5400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds5400(int number)  throws CFException{
		work.setIpmRecordsPds5400(number);
	}


	public void setIpmRecordsPds5400(long number)  throws CFException{
		work.setIpmRecordsPds5400((int)number);
	}


	/**
	 *	Returns the value of amtE1851800
	 *	@return amtE1851800
	 */
	public long getAmtE1851800() throws CFException {
   		return work.getAmtE1851800();
	}


	/**
	 *	Returns String value of amtE1851800
	 *	@return amtE1851800
	 */
	public char[]  getAmtE1851800String() throws CFException {
	     return String.valueOf(work.getAmtE1851800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1851800IsNumeric()  throws CFException{
	    return work.amtE1851800IsNumeric();
	}

	/**
	 * 	Update AmtE1851800 with the passed value
	 *	@param number
	 */
	public void setAmtE1851800(long number)  throws CFException{
		work.setAmtE1851800(number);
	}
	

	
	/**
	 * 	Update AmtE1851800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1851800(char[] value)  throws CFException {
		work.setAmtE1851800(value);
	}
	
	/**
	 * 	Update AmtE1851800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1851800String(char[] value)  throws CFException{
		work.setAmtE1851800(value);
	}	

	/**
	 *	Returns the value of sys201RecordCount600
	 *	@return sys201RecordCount600
	 */   
	 public Sys201RecordCount600 getSys201RecordCount600() {
   	return sys201RecordCount600;
   }



        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public CloseFilesOutCtx getCloseFilesOutCtx() {
            return new CloseFilesOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys203RecordCount600.hashCode();
        str += sys206RecordCount600.hashCode();
        str += sys001RecordCount600.hashCode();
        str += sys205RecordCount600.hashCode();
        str += sys207RecordCount600.hashCode();
        str += sys212RecordCount600.hashCode();
        str += sys216RecordCount600.hashCode();
        str += sys215RecordCount600.hashCode();
        str += sys209RecordCount600.hashCode();
        str += sys202RecordCount600.hashCode();
        str += sys211RecordCount600.hashCode();
        str += sys210RecordCount600.hashCode();
        str += work.hashCode();
        str += sys204RecordCount600.hashCode();
        str += sys213RecordCount600.hashCode();
        str += sys201RecordCount600.hashCode();
        str += sys214RecordCount600.hashCode();
       return str.hashCode();
    }

    public CloseFilesInCtx clone() {
        CloseFilesInCtx cloneObj = new CloseFilesInCtx();
        cloneObj.sys203RecordCount600 = new Sys203RecordCount600();
        cloneObj.sys203RecordCount600.set(sys203RecordCount600.getClonedField());
        cloneObj.sys206RecordCount600 = new Sys206RecordCount600();
        cloneObj.sys206RecordCount600.set(sys206RecordCount600.getClonedField());
        cloneObj.sys001RecordCount600 = new Sys001RecordCount600();
        cloneObj.sys001RecordCount600.set(sys001RecordCount600.getClonedField());
        cloneObj.sys205RecordCount600 = new Sys205RecordCount600();
        cloneObj.sys205RecordCount600.set(sys205RecordCount600.getClonedField());
        cloneObj.sys207RecordCount600 = new Sys207RecordCount600();
        cloneObj.sys207RecordCount600.set(sys207RecordCount600.getClonedField());
        cloneObj.sys212RecordCount600 = new Sys212RecordCount600();
        cloneObj.sys212RecordCount600.set(sys212RecordCount600.getClonedField());
        cloneObj.sys216RecordCount600 = new Sys216RecordCount600();
        cloneObj.sys216RecordCount600.set(sys216RecordCount600.getClonedField());
        cloneObj.sys215RecordCount600 = new Sys215RecordCount600();
        cloneObj.sys215RecordCount600.set(sys215RecordCount600.getClonedField());
        cloneObj.sys209RecordCount600 = new Sys209RecordCount600();
        cloneObj.sys209RecordCount600.set(sys209RecordCount600.getClonedField());
        cloneObj.sys202RecordCount600 = new Sys202RecordCount600();
        cloneObj.sys202RecordCount600.set(sys202RecordCount600.getClonedField());
        cloneObj.sys211RecordCount600 = new Sys211RecordCount600();
        cloneObj.sys211RecordCount600.set(sys211RecordCount600.getClonedField());
        cloneObj.sys210RecordCount600 = new Sys210RecordCount600();
        cloneObj.sys210RecordCount600.set(sys210RecordCount600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys204RecordCount600 = new Sys204RecordCount600();
        cloneObj.sys204RecordCount600.set(sys204RecordCount600.getClonedField());
        cloneObj.sys213RecordCount600 = new Sys213RecordCount600();
        cloneObj.sys213RecordCount600.set(sys213RecordCount600.getClonedField());
        cloneObj.sys201RecordCount600 = new Sys201RecordCount600();
        cloneObj.sys201RecordCount600.set(sys201RecordCount600.getClonedField());
        cloneObj.sys214RecordCount600 = new Sys214RecordCount600();
        cloneObj.sys214RecordCount600.set(sys214RecordCount600.getClonedField());
        return cloneObj;
    }

    }

    public CloseFilesInCtx getCloseFilesInCtx() {
            return new CloseFilesInCtx();
    }
     public class CloseFilesOutCtx implements Cloneable {
     Sys203RecordCount600 sys203RecordCount600 = Ip809050Ctx.this.getSys203RecordCount600();
     Sys206RecordCount600 sys206RecordCount600 = Ip809050Ctx.this.getSys206RecordCount600();
     Sys001RecordCount600 sys001RecordCount600 = Ip809050Ctx.this.getSys001RecordCount600();
     Sys205RecordCount600 sys205RecordCount600 = Ip809050Ctx.this.getSys205RecordCount600();
     Sys207RecordCount600 sys207RecordCount600 = Ip809050Ctx.this.getSys207RecordCount600();
     Sys212RecordCount600 sys212RecordCount600 = Ip809050Ctx.this.getSys212RecordCount600();
     Sys216RecordCount600 sys216RecordCount600 = Ip809050Ctx.this.getSys216RecordCount600();
     Sys215RecordCount600 sys215RecordCount600 = Ip809050Ctx.this.getSys215RecordCount600();
     Sys209RecordCount600 sys209RecordCount600 = Ip809050Ctx.this.getSys209RecordCount600();
     Sys202RecordCount600 sys202RecordCount600 = Ip809050Ctx.this.getSys202RecordCount600();
     Sys211RecordCount600 sys211RecordCount600 = Ip809050Ctx.this.getSys211RecordCount600();
     Sys210RecordCount600 sys210RecordCount600 = Ip809050Ctx.this.getSys210RecordCount600();
     Work work = Ip809050Ctx.this.getWork();
     Sys204RecordCount600 sys204RecordCount600 = Ip809050Ctx.this.getSys204RecordCount600();
     Sys213RecordCount600 sys213RecordCount600 = Ip809050Ctx.this.getSys213RecordCount600();
     Sys201RecordCount600 sys201RecordCount600 = Ip809050Ctx.this.getSys201RecordCount600();
     Sys214RecordCount600 sys214RecordCount600 = Ip809050Ctx.this.getSys214RecordCount600();

	/**
	 *	Returns the value of sys209Count600
	 *	@return sys209Count600
	 */
	public BigDecimal getSys209Count600() throws CFException {
   		return work.getSys209Count600();
	}


	 /**
     *	Returns String value of sys209Count600
     *	@return sys209Count600
     */
    public char[]  getSys209Count600String() throws CFException {
         return work.getSys209Count600String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean sys209Count600IsNumeric() {
        return work.sys209Count600IsNumeric();
    }
	/**
	 * 	Update Sys209Count600 with the passed number
	 *	@param number
	 */
	public void setSys209Count600(BigDecimal number)  throws CFException{
		work.setSys209Count600(number);
   }

	/**
	 * 	Update Sys209Count600 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSys209Count600(char[] value)  throws CFException{
		work.setSys209Count600(value);
	}   

	/**
	 *	Returns the value of amtE1852800
	 *	@return amtE1852800
	 */
	public long getAmtE1852800() throws CFException {
   		return work.getAmtE1852800();
	}


	/**
	 *	Returns String value of amtE1852800
	 *	@return amtE1852800
	 */
	public char[]  getAmtE1852800String() throws CFException {
	     return String.valueOf(work.getAmtE1852800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1852800IsNumeric()  throws CFException{
	    return work.amtE1852800IsNumeric();
	}

	/**
	 * 	Update AmtE1852800 with the passed value
	 *	@param number
	 */
	public void setAmtE1852800(long number)  throws CFException{
		work.setAmtE1852800(number);
	}
	

	
	/**
	 * 	Update AmtE1852800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1852800(char[] value)  throws CFException {
		work.setAmtE1852800(value);
	}
	
	/**
	 * 	Update AmtE1852800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1852800String(char[] value)  throws CFException{
		work.setAmtE1852800(value);
	}	

	/**
	 *	Returns the value of transAmount800
	 *	@return transAmount800
	 */
	public long getTransAmount800() throws CFException {
   		return work.getTransAmount800();
	}


	/**
	 *	Returns String value of transAmount800
	 *	@return transAmount800
	 */
	public char[]  getTransAmount800String() throws CFException {
	     return String.valueOf(work.getTransAmount800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean transAmount800IsNumeric()  throws CFException{
	    return work.transAmount800IsNumeric();
	}

	/**
	 * 	Update TransAmount800 with the passed value
	 *	@param number
	 */
	public void setTransAmount800(long number)  throws CFException{
		work.setTransAmount800(number);
	}
	

	
	/**
	 * 	Update TransAmount800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTransAmount800(char[] value)  throws CFException {
		work.setTransAmount800(value);
	}
	
	/**
	 * 	Update TransAmount800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTransAmount800String(char[] value)  throws CFException{
		work.setTransAmount800(value);
	}	

	/**
	 *	Returns the value of sys209Count1600
	 *	@return sys209Count1600
	 */
   public char[] getSys209Count1600() throws CFException  {              
   		return sys209RecordCount600.getSys209Count1600();
   }

  
	/**
	*  set variable sys209Count1600
	*  @param value
	**/
   public void setSys209Count1600(char[] value) throws CFException {
      sys209RecordCount600.setSys209Count1600(value);
   } 

     /**
	 * 	Update Sys209Count1600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys209Count1600(char[] source, int sourceIndex) throws CFException {
      sys209RecordCount600.setSys209Count1600(source, sourceIndex);
   	
   }
   
   public void setSys209Count1600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys209RecordCount600.setSys209Count1600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys209Count1600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys209Count1600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys209RecordCount600.setSys209Count1600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys209Count1600 with another Field
	 *	@param value
	 */
   public void setSys209Count1600(Field source) {
      sys209RecordCount600.setSys209Count1600(source);
   }  
   
     /**
	 * 	Update Sys209Count1600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys209Count1600(Field source, int sourceIndex,int sourceLen) {
      sys209RecordCount600.setSys209Count1600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys209Count1600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys209Count1600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys209RecordCount600.setSys209Count1600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys206Count600
	 *	@return sys206Count600
	 */
   public char[] getSys206Count600() throws CFException  {              
   		return sys206RecordCount600.getSys206Count600();
   }

  
	/**
	*  set variable sys206Count600
	*  @param value
	**/
   public void setSys206Count600(char[] value) throws CFException {
      sys206RecordCount600.setSys206Count600(value);
   } 

     /**
	 * 	Update Sys206Count600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys206Count600(char[] source, int sourceIndex) throws CFException {
      sys206RecordCount600.setSys206Count600(source, sourceIndex);
   	
   }
   
   public void setSys206Count600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys206RecordCount600.setSys206Count600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys206Count600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys206Count600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys206RecordCount600.setSys206Count600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys206Count600 with another Field
	 *	@param value
	 */
   public void setSys206Count600(Field source) {
      sys206RecordCount600.setSys206Count600(source);
   }  
   
     /**
	 * 	Update Sys206Count600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys206Count600(Field source, int sourceIndex,int sourceLen) {
      sys206RecordCount600.setSys206Count600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys206Count600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys206Count600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys206RecordCount600.setSys206Count600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of amtE1848800
	 *	@return amtE1848800
	 */
	public long getAmtE1848800() throws CFException {
   		return work.getAmtE1848800();
	}


	/**
	 *	Returns String value of amtE1848800
	 *	@return amtE1848800
	 */
	public char[]  getAmtE1848800String() throws CFException {
	     return String.valueOf(work.getAmtE1848800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1848800IsNumeric()  throws CFException{
	    return work.amtE1848800IsNumeric();
	}

	/**
	 * 	Update AmtE1848800 with the passed value
	 *	@param number
	 */
	public void setAmtE1848800(long number)  throws CFException{
		work.setAmtE1848800(number);
	}
	

	
	/**
	 * 	Update AmtE1848800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1848800(char[] value)  throws CFException {
		work.setAmtE1848800(value);
	}
	
	/**
	 * 	Update AmtE1848800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1848800String(char[] value)  throws CFException{
		work.setAmtE1848800(value);
	}	

	/**
	 *	Returns the value of sys216Count600
	 *	@return sys216Count600
	 */
	public BigDecimal getSys216Count600() throws CFException {
   		return work.getSys216Count600();
	}


	 /**
     *	Returns String value of sys216Count600
     *	@return sys216Count600
     */
    public char[]  getSys216Count600String() throws CFException {
         return work.getSys216Count600String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean sys216Count600IsNumeric() {
        return work.sys216Count600IsNumeric();
    }
	/**
	 * 	Update Sys216Count600 with the passed number
	 *	@param number
	 */
	public void setSys216Count600(BigDecimal number)  throws CFException{
		work.setSys216Count600(number);
   }

	/**
	 * 	Update Sys216Count600 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSys216Count600(char[] value)  throws CFException{
		work.setSys216Count600(value);
	}   

	/**
	 *	Returns the value of sys207Count600
	 *	@return sys207Count600
	 */
   public char[] getSys207Count600() throws CFException  {              
   		return sys207RecordCount600.getSys207Count600();
   }

  
	/**
	*  set variable sys207Count600
	*  @param value
	**/
   public void setSys207Count600(char[] value) throws CFException {
      sys207RecordCount600.setSys207Count600(value);
   } 

     /**
	 * 	Update Sys207Count600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys207Count600(char[] source, int sourceIndex) throws CFException {
      sys207RecordCount600.setSys207Count600(source, sourceIndex);
   	
   }
   
   public void setSys207Count600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys207RecordCount600.setSys207Count600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys207Count600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys207Count600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys207RecordCount600.setSys207Count600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys207Count600 with another Field
	 *	@param value
	 */
   public void setSys207Count600(Field source) {
      sys207RecordCount600.setSys207Count600(source);
   }  
   
     /**
	 * 	Update Sys207Count600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys207Count600(Field source, int sourceIndex,int sourceLen) {
      sys207RecordCount600.setSys207Count600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys207Count600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys207Count600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys207RecordCount600.setSys207Count600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ipmRecordsPds4400
	 *	@return ipmRecordsPds4400
	 */
	public int getIpmRecordsPds4400() throws CFException {        
   		return work.getIpmRecordsPds4400();
	}
	
	/**
	 * 	Update IpmRecordsPds4400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds4400(int number)  throws CFException{
		work.setIpmRecordsPds4400(number);
	}


	public void setIpmRecordsPds4400(long number)  throws CFException{
		work.setIpmRecordsPds4400((int)number);
	}


	/**
	 *	Returns the value of sys211Count600
	 *	@return sys211Count600
	 */
	public BigDecimal getSys211Count600() throws CFException {
   		return work.getSys211Count600();
	}


	 /**
     *	Returns String value of sys211Count600
     *	@return sys211Count600
     */
    public char[]  getSys211Count600String() throws CFException {
         return work.getSys211Count600String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean sys211Count600IsNumeric() {
        return work.sys211Count600IsNumeric();
    }
	/**
	 * 	Update Sys211Count600 with the passed number
	 *	@param number
	 */
	public void setSys211Count600(BigDecimal number)  throws CFException{
		work.setSys211Count600(number);
   }

	/**
	 * 	Update Sys211Count600 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSys211Count600(char[] value)  throws CFException{
		work.setSys211Count600(value);
	}   

	/**
	 *	Returns the value of ipmRecordsPds1400
	 *	@return ipmRecordsPds1400
	 */
	public int getIpmRecordsPds1400() throws CFException {        
   		return work.getIpmRecordsPds1400();
	}
	
	/**
	 * 	Update IpmRecordsPds1400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds1400(int number)  throws CFException{
		work.setIpmRecordsPds1400(number);
	}


	public void setIpmRecordsPds1400(long number)  throws CFException{
		work.setIpmRecordsPds1400((int)number);
	}


	/**
	 *	Returns the value of sys211Count1600
	 *	@return sys211Count1600
	 */
   public char[] getSys211Count1600() throws CFException  {              
   		return sys211RecordCount600.getSys211Count1600();
   }

  
	/**
	*  set variable sys211Count1600
	*  @param value
	**/
   public void setSys211Count1600(char[] value) throws CFException {
      sys211RecordCount600.setSys211Count1600(value);
   } 

     /**
	 * 	Update Sys211Count1600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys211Count1600(char[] source, int sourceIndex) throws CFException {
      sys211RecordCount600.setSys211Count1600(source, sourceIndex);
   	
   }
   
   public void setSys211Count1600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys211RecordCount600.setSys211Count1600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys211Count1600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys211Count1600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys211RecordCount600.setSys211Count1600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys211Count1600 with another Field
	 *	@param value
	 */
   public void setSys211Count1600(Field source) {
      sys211RecordCount600.setSys211Count1600(source);
   }  
   
     /**
	 * 	Update Sys211Count1600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys211Count1600(Field source, int sourceIndex,int sourceLen) {
      sys211RecordCount600.setSys211Count1600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys211Count1600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys211Count1600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys211RecordCount600.setSys211Count1600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ipmRecordsPds7400
	 *	@return ipmRecordsPds7400
	 */
	public int getIpmRecordsPds7400() throws CFException {        
   		return work.getIpmRecordsPds7400();
	}
	
	/**
	 * 	Update IpmRecordsPds7400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds7400(int number)  throws CFException{
		work.setIpmRecordsPds7400(number);
	}


	public void setIpmRecordsPds7400(long number)  throws CFException{
		work.setIpmRecordsPds7400((int)number);
	}


	/**
	 *	Returns the value of sys201Count600
	 *	@return sys201Count600
	 */
   public char[] getSys201Count600() throws CFException  {              
   		return sys201RecordCount600.getSys201Count600();
   }

  
	/**
	*  set variable sys201Count600
	*  @param value
	**/
   public void setSys201Count600(char[] value) throws CFException {
      sys201RecordCount600.setSys201Count600(value);
   } 

     /**
	 * 	Update Sys201Count600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201Count600(char[] source, int sourceIndex) throws CFException {
      sys201RecordCount600.setSys201Count600(source, sourceIndex);
   	
   }
   
   public void setSys201Count600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys201RecordCount600.setSys201Count600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys201Count600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201Count600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys201RecordCount600.setSys201Count600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys201Count600 with another Field
	 *	@param value
	 */
   public void setSys201Count600(Field source) {
      sys201RecordCount600.setSys201Count600(source);
   }  
   
     /**
	 * 	Update Sys201Count600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201Count600(Field source, int sourceIndex,int sourceLen) {
      sys201RecordCount600.setSys201Count600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys201Count600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201Count600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys201RecordCount600.setSys201Count600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ipmCountReadCnt400
	 *	@return ipmCountReadCnt400
	 */
	public int getIpmCountReadCnt400() throws CFException {        
   		return work.getIpmCountReadCnt400();
	}
	
	/**
	 * 	Update IpmCountReadCnt400 with the passed value
	 *	@param number
	 */
	public void setIpmCountReadCnt400(int number)  throws CFException{
		work.setIpmCountReadCnt400(number);
	}


	public void setIpmCountReadCnt400(long number)  throws CFException{
		work.setIpmCountReadCnt400((int)number);
	}


	/**
	 *	Returns the value of sys210Count1600
	 *	@return sys210Count1600
	 */
   public char[] getSys210Count1600() throws CFException  {              
   		return sys210RecordCount600.getSys210Count1600();
   }

  
	/**
	*  set variable sys210Count1600
	*  @param value
	**/
   public void setSys210Count1600(char[] value) throws CFException {
      sys210RecordCount600.setSys210Count1600(value);
   } 

     /**
	 * 	Update Sys210Count1600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys210Count1600(char[] source, int sourceIndex) throws CFException {
      sys210RecordCount600.setSys210Count1600(source, sourceIndex);
   	
   }
   
   public void setSys210Count1600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys210RecordCount600.setSys210Count1600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys210Count1600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys210Count1600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys210RecordCount600.setSys210Count1600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys210Count1600 with another Field
	 *	@param value
	 */
   public void setSys210Count1600(Field source) {
      sys210RecordCount600.setSys210Count1600(source);
   }  
   
     /**
	 * 	Update Sys210Count1600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys210Count1600(Field source, int sourceIndex,int sourceLen) {
      sys210RecordCount600.setSys210Count1600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys210Count1600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys210Count1600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys210RecordCount600.setSys210Count1600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys216Count1600
	 *	@return sys216Count1600
	 */
   public char[] getSys216Count1600() throws CFException  {              
   		return sys216RecordCount600.getSys216Count1600();
   }

  
	/**
	*  set variable sys216Count1600
	*  @param value
	**/
   public void setSys216Count1600(char[] value) throws CFException {
      sys216RecordCount600.setSys216Count1600(value);
   } 

     /**
	 * 	Update Sys216Count1600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys216Count1600(char[] source, int sourceIndex) throws CFException {
      sys216RecordCount600.setSys216Count1600(source, sourceIndex);
   	
   }
   
   public void setSys216Count1600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys216RecordCount600.setSys216Count1600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys216Count1600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys216Count1600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys216RecordCount600.setSys216Count1600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys216Count1600 with another Field
	 *	@param value
	 */
   public void setSys216Count1600(Field source) {
      sys216RecordCount600.setSys216Count1600(source);
   }  
   
     /**
	 * 	Update Sys216Count1600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys216Count1600(Field source, int sourceIndex,int sourceLen) {
      sys216RecordCount600.setSys216Count1600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys216Count1600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys216Count1600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys216RecordCount600.setSys216Count1600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ipmRecordsPds3400
	 *	@return ipmRecordsPds3400
	 */
	public int getIpmRecordsPds3400() throws CFException {        
   		return work.getIpmRecordsPds3400();
	}
	
	/**
	 * 	Update IpmRecordsPds3400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds3400(int number)  throws CFException{
		work.setIpmRecordsPds3400(number);
	}


	public void setIpmRecordsPds3400(long number)  throws CFException{
		work.setIpmRecordsPds3400((int)number);
	}


	/**
	 *	Returns the value of sys204Count600
	 *	@return sys204Count600
	 */
   public char[] getSys204Count600() throws CFException  {              
   		return sys204RecordCount600.getSys204Count600();
   }

  
	/**
	*  set variable sys204Count600
	*  @param value
	**/
   public void setSys204Count600(char[] value) throws CFException {
      sys204RecordCount600.setSys204Count600(value);
   } 

     /**
	 * 	Update Sys204Count600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys204Count600(char[] source, int sourceIndex) throws CFException {
      sys204RecordCount600.setSys204Count600(source, sourceIndex);
   	
   }
   
   public void setSys204Count600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys204RecordCount600.setSys204Count600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys204Count600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys204Count600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys204RecordCount600.setSys204Count600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys204Count600 with another Field
	 *	@param value
	 */
   public void setSys204Count600(Field source) {
      sys204RecordCount600.setSys204Count600(source);
   }  
   
     /**
	 * 	Update Sys204Count600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys204Count600(Field source, int sourceIndex,int sourceLen) {
      sys204RecordCount600.setSys204Count600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys204Count600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys204Count600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys204RecordCount600.setSys204Count600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys213Count600
	 *	@return sys213Count600
	 */
	public BigDecimal getSys213Count600() throws CFException {
   		return work.getSys213Count600();
	}


	 /**
     *	Returns String value of sys213Count600
     *	@return sys213Count600
     */
    public char[]  getSys213Count600String() throws CFException {
         return work.getSys213Count600String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean sys213Count600IsNumeric() {
        return work.sys213Count600IsNumeric();
    }
	/**
	 * 	Update Sys213Count600 with the passed number
	 *	@param number
	 */
	public void setSys213Count600(BigDecimal number)  throws CFException{
		work.setSys213Count600(number);
   }

	/**
	 * 	Update Sys213Count600 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSys213Count600(char[] value)  throws CFException{
		work.setSys213Count600(value);
	}   

	/**
	 *	Returns the value of sys212Count1600
	 *	@return sys212Count1600
	 */
   public char[] getSys212Count1600() throws CFException  {              
   		return sys212RecordCount600.getSys212Count1600();
   }

  
	/**
	*  set variable sys212Count1600
	*  @param value
	**/
   public void setSys212Count1600(char[] value) throws CFException {
      sys212RecordCount600.setSys212Count1600(value);
   } 

     /**
	 * 	Update Sys212Count1600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys212Count1600(char[] source, int sourceIndex) throws CFException {
      sys212RecordCount600.setSys212Count1600(source, sourceIndex);
   	
   }
   
   public void setSys212Count1600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys212RecordCount600.setSys212Count1600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys212Count1600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys212Count1600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys212RecordCount600.setSys212Count1600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys212Count1600 with another Field
	 *	@param value
	 */
   public void setSys212Count1600(Field source) {
      sys212RecordCount600.setSys212Count1600(source);
   }  
   
     /**
	 * 	Update Sys212Count1600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys212Count1600(Field source, int sourceIndex,int sourceLen) {
      sys212RecordCount600.setSys212Count1600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys212Count1600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys212Count1600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys212RecordCount600.setSys212Count1600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys205Count600
	 *	@return sys205Count600
	 */
   public char[] getSys205Count600() throws CFException  {              
   		return sys205RecordCount600.getSys205Count600();
   }

  
	/**
	*  set variable sys205Count600
	*  @param value
	**/
   public void setSys205Count600(char[] value) throws CFException {
      sys205RecordCount600.setSys205Count600(value);
   } 

     /**
	 * 	Update Sys205Count600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys205Count600(char[] source, int sourceIndex) throws CFException {
      sys205RecordCount600.setSys205Count600(source, sourceIndex);
   	
   }
   
   public void setSys205Count600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys205RecordCount600.setSys205Count600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys205Count600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys205Count600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys205RecordCount600.setSys205Count600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys205Count600 with another Field
	 *	@param value
	 */
   public void setSys205Count600(Field source) {
      sys205RecordCount600.setSys205Count600(source);
   }  
   
     /**
	 * 	Update Sys205Count600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys205Count600(Field source, int sourceIndex,int sourceLen) {
      sys205RecordCount600.setSys205Count600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys205Count600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys205Count600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys205RecordCount600.setSys205Count600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ipmRecordsPds6400
	 *	@return ipmRecordsPds6400
	 */
	public int getIpmRecordsPds6400() throws CFException {        
   		return work.getIpmRecordsPds6400();
	}
	
	/**
	 * 	Update IpmRecordsPds6400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds6400(int number)  throws CFException{
		work.setIpmRecordsPds6400(number);
	}


	public void setIpmRecordsPds6400(long number)  throws CFException{
		work.setIpmRecordsPds6400((int)number);
	}


	/**
	 *	Returns the value of sys213Count1600
	 *	@return sys213Count1600
	 */
   public char[] getSys213Count1600() throws CFException  {              
   		return sys213RecordCount600.getSys213Count1600();
   }

  
	/**
	*  set variable sys213Count1600
	*  @param value
	**/
   public void setSys213Count1600(char[] value) throws CFException {
      sys213RecordCount600.setSys213Count1600(value);
   } 

     /**
	 * 	Update Sys213Count1600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys213Count1600(char[] source, int sourceIndex) throws CFException {
      sys213RecordCount600.setSys213Count1600(source, sourceIndex);
   	
   }
   
   public void setSys213Count1600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys213RecordCount600.setSys213Count1600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys213Count1600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys213Count1600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys213RecordCount600.setSys213Count1600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys213Count1600 with another Field
	 *	@param value
	 */
   public void setSys213Count1600(Field source) {
      sys213RecordCount600.setSys213Count1600(source);
   }  
   
     /**
	 * 	Update Sys213Count1600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys213Count1600(Field source, int sourceIndex,int sourceLen) {
      sys213RecordCount600.setSys213Count1600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys213Count1600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys213Count1600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys213RecordCount600.setSys213Count1600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001Count600
	 *	@return sys001Count600
	 */
   public char[] getSys001Count600() throws CFException  {              
   		return sys001RecordCount600.getSys001Count600();
   }

  
	/**
	*  set variable sys001Count600
	*  @param value
	**/
   public void setSys001Count600(char[] value) throws CFException {
      sys001RecordCount600.setSys001Count600(value);
   } 

     /**
	 * 	Update Sys001Count600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001Count600(char[] source, int sourceIndex) throws CFException {
      sys001RecordCount600.setSys001Count600(source, sourceIndex);
   	
   }
   
   public void setSys001Count600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001RecordCount600.setSys001Count600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001Count600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001Count600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001RecordCount600.setSys001Count600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001Count600 with another Field
	 *	@param value
	 */
   public void setSys001Count600(Field source) {
      sys001RecordCount600.setSys001Count600(source);
   }  
   
     /**
	 * 	Update Sys001Count600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001Count600(Field source, int sourceIndex,int sourceLen) {
      sys001RecordCount600.setSys001Count600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001Count600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001Count600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001RecordCount600.setSys001Count600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys215Count600
	 *	@return sys215Count600
	 */
	public BigDecimal getSys215Count600() throws CFException {
   		return work.getSys215Count600();
	}


	 /**
     *	Returns String value of sys215Count600
     *	@return sys215Count600
     */
    public char[]  getSys215Count600String() throws CFException {
         return work.getSys215Count600String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean sys215Count600IsNumeric() {
        return work.sys215Count600IsNumeric();
    }
	/**
	 * 	Update Sys215Count600 with the passed number
	 *	@param number
	 */
	public void setSys215Count600(BigDecimal number)  throws CFException{
		work.setSys215Count600(number);
   }

	/**
	 * 	Update Sys215Count600 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSys215Count600(char[] value)  throws CFException{
		work.setSys215Count600(value);
	}   

	/**
	 *	Returns the value of amtE1750800
	 *	@return amtE1750800
	 */
	public long getAmtE1750800() throws CFException {
   		return work.getAmtE1750800();
	}


	/**
	 *	Returns String value of amtE1750800
	 *	@return amtE1750800
	 */
	public char[]  getAmtE1750800String() throws CFException {
	     return String.valueOf(work.getAmtE1750800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1750800IsNumeric()  throws CFException{
	    return work.amtE1750800IsNumeric();
	}

	/**
	 * 	Update AmtE1750800 with the passed value
	 *	@param number
	 */
	public void setAmtE1750800(long number)  throws CFException{
		work.setAmtE1750800(number);
	}
	

	
	/**
	 * 	Update AmtE1750800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1750800(char[] value)  throws CFException {
		work.setAmtE1750800(value);
	}
	
	/**
	 * 	Update AmtE1750800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1750800String(char[] value)  throws CFException{
		work.setAmtE1750800(value);
	}	

	/**
	 *	Returns the value of amtE1849800
	 *	@return amtE1849800
	 */
	public long getAmtE1849800() throws CFException {
   		return work.getAmtE1849800();
	}


	/**
	 *	Returns String value of amtE1849800
	 *	@return amtE1849800
	 */
	public char[]  getAmtE1849800String() throws CFException {
	     return String.valueOf(work.getAmtE1849800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1849800IsNumeric()  throws CFException{
	    return work.amtE1849800IsNumeric();
	}

	/**
	 * 	Update AmtE1849800 with the passed value
	 *	@param number
	 */
	public void setAmtE1849800(long number)  throws CFException{
		work.setAmtE1849800(number);
	}
	

	
	/**
	 * 	Update AmtE1849800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1849800(char[] value)  throws CFException {
		work.setAmtE1849800(value);
	}
	
	/**
	 * 	Update AmtE1849800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1849800String(char[] value)  throws CFException{
		work.setAmtE1849800(value);
	}	

	/**
	 *	Returns the value of sys215Count1600
	 *	@return sys215Count1600
	 */
   public char[] getSys215Count1600() throws CFException  {              
   		return sys215RecordCount600.getSys215Count1600();
   }

  
	/**
	*  set variable sys215Count1600
	*  @param value
	**/
   public void setSys215Count1600(char[] value) throws CFException {
      sys215RecordCount600.setSys215Count1600(value);
   } 

     /**
	 * 	Update Sys215Count1600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys215Count1600(char[] source, int sourceIndex) throws CFException {
      sys215RecordCount600.setSys215Count1600(source, sourceIndex);
   	
   }
   
   public void setSys215Count1600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys215RecordCount600.setSys215Count1600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys215Count1600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys215Count1600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys215RecordCount600.setSys215Count1600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys215Count1600 with another Field
	 *	@param value
	 */
   public void setSys215Count1600(Field source) {
      sys215RecordCount600.setSys215Count1600(source);
   }  
   
     /**
	 * 	Update Sys215Count1600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys215Count1600(Field source, int sourceIndex,int sourceLen) {
      sys215RecordCount600.setSys215Count1600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys215Count1600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys215Count1600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys215RecordCount600.setSys215Count1600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of amtE1754800
	 *	@return amtE1754800
	 */
	public long getAmtE1754800() throws CFException {
   		return work.getAmtE1754800();
	}


	/**
	 *	Returns String value of amtE1754800
	 *	@return amtE1754800
	 */
	public char[]  getAmtE1754800String() throws CFException {
	     return String.valueOf(work.getAmtE1754800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1754800IsNumeric()  throws CFException{
	    return work.amtE1754800IsNumeric();
	}

	/**
	 * 	Update AmtE1754800 with the passed value
	 *	@param number
	 */
	public void setAmtE1754800(long number)  throws CFException{
		work.setAmtE1754800(number);
	}
	

	
	/**
	 * 	Update AmtE1754800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1754800(char[] value)  throws CFException {
		work.setAmtE1754800(value);
	}
	
	/**
	 * 	Update AmtE1754800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1754800String(char[] value)  throws CFException{
		work.setAmtE1754800(value);
	}	

	/**
	 *	Returns the value of ipmRecordsPds2400
	 *	@return ipmRecordsPds2400
	 */
	public int getIpmRecordsPds2400() throws CFException {        
   		return work.getIpmRecordsPds2400();
	}
	
	/**
	 * 	Update IpmRecordsPds2400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds2400(int number)  throws CFException{
		work.setIpmRecordsPds2400(number);
	}


	public void setIpmRecordsPds2400(long number)  throws CFException{
		work.setIpmRecordsPds2400((int)number);
	}


	/**
	 *	Returns the value of sys203Count600
	 *	@return sys203Count600
	 */
   public char[] getSys203Count600() throws CFException  {              
   		return sys203RecordCount600.getSys203Count600();
   }

  
	/**
	*  set variable sys203Count600
	*  @param value
	**/
   public void setSys203Count600(char[] value) throws CFException {
      sys203RecordCount600.setSys203Count600(value);
   } 

     /**
	 * 	Update Sys203Count600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys203Count600(char[] source, int sourceIndex) throws CFException {
      sys203RecordCount600.setSys203Count600(source, sourceIndex);
   	
   }
   
   public void setSys203Count600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys203RecordCount600.setSys203Count600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys203Count600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys203Count600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys203RecordCount600.setSys203Count600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys203Count600 with another Field
	 *	@param value
	 */
   public void setSys203Count600(Field source) {
      sys203RecordCount600.setSys203Count600(source);
   }  
   
     /**
	 * 	Update Sys203Count600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys203Count600(Field source, int sourceIndex,int sourceLen) {
      sys203RecordCount600.setSys203Count600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys203Count600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys203Count600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys203RecordCount600.setSys203Count600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of amtE1850800
	 *	@return amtE1850800
	 */
	public long getAmtE1850800() throws CFException {
   		return work.getAmtE1850800();
	}


	/**
	 *	Returns String value of amtE1850800
	 *	@return amtE1850800
	 */
	public char[]  getAmtE1850800String() throws CFException {
	     return String.valueOf(work.getAmtE1850800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1850800IsNumeric()  throws CFException{
	    return work.amtE1850800IsNumeric();
	}

	/**
	 * 	Update AmtE1850800 with the passed value
	 *	@param number
	 */
	public void setAmtE1850800(long number)  throws CFException{
		work.setAmtE1850800(number);
	}
	

	
	/**
	 * 	Update AmtE1850800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1850800(char[] value)  throws CFException {
		work.setAmtE1850800(value);
	}
	
	/**
	 * 	Update AmtE1850800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1850800String(char[] value)  throws CFException{
		work.setAmtE1850800(value);
	}	

	/**
	 *	Returns the value of sys214Count1600
	 *	@return sys214Count1600
	 */
   public char[] getSys214Count1600() throws CFException  {              
   		return sys214RecordCount600.getSys214Count1600();
   }

  
	/**
	*  set variable sys214Count1600
	*  @param value
	**/
   public void setSys214Count1600(char[] value) throws CFException {
      sys214RecordCount600.setSys214Count1600(value);
   } 

     /**
	 * 	Update Sys214Count1600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys214Count1600(char[] source, int sourceIndex) throws CFException {
      sys214RecordCount600.setSys214Count1600(source, sourceIndex);
   	
   }
   
   public void setSys214Count1600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys214RecordCount600.setSys214Count1600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys214Count1600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys214Count1600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys214RecordCount600.setSys214Count1600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys214Count1600 with another Field
	 *	@param value
	 */
   public void setSys214Count1600(Field source) {
      sys214RecordCount600.setSys214Count1600(source);
   }  
   
     /**
	 * 	Update Sys214Count1600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys214Count1600(Field source, int sourceIndex,int sourceLen) {
      sys214RecordCount600.setSys214Count1600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys214Count1600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys214Count1600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys214RecordCount600.setSys214Count1600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys202Count600
	 *	@return sys202Count600
	 */
   public char[] getSys202Count600() throws CFException  {              
   		return sys202RecordCount600.getSys202Count600();
   }

  
	/**
	*  set variable sys202Count600
	*  @param value
	**/
   public void setSys202Count600(char[] value) throws CFException {
      sys202RecordCount600.setSys202Count600(value);
   } 

     /**
	 * 	Update Sys202Count600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys202Count600(char[] source, int sourceIndex) throws CFException {
      sys202RecordCount600.setSys202Count600(source, sourceIndex);
   	
   }
   
   public void setSys202Count600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys202RecordCount600.setSys202Count600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys202Count600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys202Count600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys202RecordCount600.setSys202Count600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys202Count600 with another Field
	 *	@param value
	 */
   public void setSys202Count600(Field source) {
      sys202RecordCount600.setSys202Count600(source);
   }  
   
     /**
	 * 	Update Sys202Count600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys202Count600(Field source, int sourceIndex,int sourceLen) {
      sys202RecordCount600.setSys202Count600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys202Count600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys202Count600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys202RecordCount600.setSys202Count600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys214Count600
	 *	@return sys214Count600
	 */
	public BigDecimal getSys214Count600() throws CFException {
   		return work.getSys214Count600();
	}


	 /**
     *	Returns String value of sys214Count600
     *	@return sys214Count600
     */
    public char[]  getSys214Count600String() throws CFException {
         return work.getSys214Count600String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean sys214Count600IsNumeric() {
        return work.sys214Count600IsNumeric();
    }
	/**
	 * 	Update Sys214Count600 with the passed number
	 *	@param number
	 */
	public void setSys214Count600(BigDecimal number)  throws CFException{
		work.setSys214Count600(number);
   }

	/**
	 * 	Update Sys214Count600 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSys214Count600(char[] value)  throws CFException{
		work.setSys214Count600(value);
	}   

	/**
	 *	Returns the value of ipmRecordsPds5400
	 *	@return ipmRecordsPds5400
	 */
	public int getIpmRecordsPds5400() throws CFException {        
   		return work.getIpmRecordsPds5400();
	}
	
	/**
	 * 	Update IpmRecordsPds5400 with the passed value
	 *	@param number
	 */
	public void setIpmRecordsPds5400(int number)  throws CFException{
		work.setIpmRecordsPds5400(number);
	}


	public void setIpmRecordsPds5400(long number)  throws CFException{
		work.setIpmRecordsPds5400((int)number);
	}


	/**
	 *	Returns the value of sys210Count600
	 *	@return sys210Count600
	 */
	public BigDecimal getSys210Count600() throws CFException {
   		return work.getSys210Count600();
	}


	 /**
     *	Returns String value of sys210Count600
     *	@return sys210Count600
     */
    public char[]  getSys210Count600String() throws CFException {
         return work.getSys210Count600String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean sys210Count600IsNumeric() {
        return work.sys210Count600IsNumeric();
    }
	/**
	 * 	Update Sys210Count600 with the passed number
	 *	@param number
	 */
	public void setSys210Count600(BigDecimal number)  throws CFException{
		work.setSys210Count600(number);
   }

	/**
	 * 	Update Sys210Count600 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSys210Count600(char[] value)  throws CFException{
		work.setSys210Count600(value);
	}   

	/**
	 *	Returns the value of sys212Count600
	 *	@return sys212Count600
	 */
	public BigDecimal getSys212Count600() throws CFException {
   		return work.getSys212Count600();
	}


	 /**
     *	Returns String value of sys212Count600
     *	@return sys212Count600
     */
    public char[]  getSys212Count600String() throws CFException {
         return work.getSys212Count600String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean sys212Count600IsNumeric() {
        return work.sys212Count600IsNumeric();
    }
	/**
	 * 	Update Sys212Count600 with the passed number
	 *	@param number
	 */
	public void setSys212Count600(BigDecimal number)  throws CFException{
		work.setSys212Count600(number);
   }

	/**
	 * 	Update Sys212Count600 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSys212Count600(char[] value)  throws CFException{
		work.setSys212Count600(value);
	}   

	/**
	 *	Returns the value of amtE1851800
	 *	@return amtE1851800
	 */
	public long getAmtE1851800() throws CFException {
   		return work.getAmtE1851800();
	}


	/**
	 *	Returns String value of amtE1851800
	 *	@return amtE1851800
	 */
	public char[]  getAmtE1851800String() throws CFException {
	     return String.valueOf(work.getAmtE1851800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1851800IsNumeric()  throws CFException{
	    return work.amtE1851800IsNumeric();
	}

	/**
	 * 	Update AmtE1851800 with the passed value
	 *	@param number
	 */
	public void setAmtE1851800(long number)  throws CFException{
		work.setAmtE1851800(number);
	}
	

	
	/**
	 * 	Update AmtE1851800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtE1851800(char[] value)  throws CFException {
		work.setAmtE1851800(value);
	}
	
	/**
	 * 	Update AmtE1851800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtE1851800String(char[] value)  throws CFException{
		work.setAmtE1851800(value);
	}	


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys203RecordCount600.hashCode();
        str += sys206RecordCount600.hashCode();
        str += sys001RecordCount600.hashCode();
        str += sys205RecordCount600.hashCode();
        str += sys207RecordCount600.hashCode();
        str += sys212RecordCount600.hashCode();
        str += sys216RecordCount600.hashCode();
        str += sys215RecordCount600.hashCode();
        str += sys209RecordCount600.hashCode();
        str += sys202RecordCount600.hashCode();
        str += sys211RecordCount600.hashCode();
        str += sys210RecordCount600.hashCode();
        str += work.hashCode();
        str += sys204RecordCount600.hashCode();
        str += sys213RecordCount600.hashCode();
        str += sys201RecordCount600.hashCode();
        str += sys214RecordCount600.hashCode();
       return str.hashCode();
    }

    public CloseFilesOutCtx clone() {
        CloseFilesOutCtx cloneObj = new CloseFilesOutCtx();
        cloneObj.sys203RecordCount600 = new Sys203RecordCount600();
        cloneObj.sys203RecordCount600.set(sys203RecordCount600.getClonedField());
        cloneObj.sys206RecordCount600 = new Sys206RecordCount600();
        cloneObj.sys206RecordCount600.set(sys206RecordCount600.getClonedField());
        cloneObj.sys001RecordCount600 = new Sys001RecordCount600();
        cloneObj.sys001RecordCount600.set(sys001RecordCount600.getClonedField());
        cloneObj.sys205RecordCount600 = new Sys205RecordCount600();
        cloneObj.sys205RecordCount600.set(sys205RecordCount600.getClonedField());
        cloneObj.sys207RecordCount600 = new Sys207RecordCount600();
        cloneObj.sys207RecordCount600.set(sys207RecordCount600.getClonedField());
        cloneObj.sys212RecordCount600 = new Sys212RecordCount600();
        cloneObj.sys212RecordCount600.set(sys212RecordCount600.getClonedField());
        cloneObj.sys216RecordCount600 = new Sys216RecordCount600();
        cloneObj.sys216RecordCount600.set(sys216RecordCount600.getClonedField());
        cloneObj.sys215RecordCount600 = new Sys215RecordCount600();
        cloneObj.sys215RecordCount600.set(sys215RecordCount600.getClonedField());
        cloneObj.sys209RecordCount600 = new Sys209RecordCount600();
        cloneObj.sys209RecordCount600.set(sys209RecordCount600.getClonedField());
        cloneObj.sys202RecordCount600 = new Sys202RecordCount600();
        cloneObj.sys202RecordCount600.set(sys202RecordCount600.getClonedField());
        cloneObj.sys211RecordCount600 = new Sys211RecordCount600();
        cloneObj.sys211RecordCount600.set(sys211RecordCount600.getClonedField());
        cloneObj.sys210RecordCount600 = new Sys210RecordCount600();
        cloneObj.sys210RecordCount600.set(sys210RecordCount600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys204RecordCount600 = new Sys204RecordCount600();
        cloneObj.sys204RecordCount600.set(sys204RecordCount600.getClonedField());
        cloneObj.sys213RecordCount600 = new Sys213RecordCount600();
        cloneObj.sys213RecordCount600.set(sys213RecordCount600.getClonedField());
        cloneObj.sys201RecordCount600 = new Sys201RecordCount600();
        cloneObj.sys201RecordCount600.set(sys201RecordCount600.getClonedField());
        cloneObj.sys214RecordCount600 = new Sys214RecordCount600();
        cloneObj.sys214RecordCount600.set(sys214RecordCount600.getClonedField());
        return cloneObj;
    }

    }

    public CloseFilesOutCtx getCloseFilesOutCtx() {
            return new CloseFilesOutCtx();
    }
     public class CloseInputIpmOutboundInCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();
     InputOutboundErrMsgTxt600 inputOutboundErrMsgTxt600 = Ip809050Ctx.this.getInputOutboundErrMsgTxt600();

	/**
	 *	Returns the value of sys001FileStatus200
	 *	@return sys001FileStatus200
	 */
   public char[] getSys001FileStatus200() throws CFException  {              
   		return work.getSys001FileStatus200();
   }

  
	/**
	*  set variable sys001FileStatus200
	*  @param value
	**/
   public void setSys001FileStatus200(char[] value) throws CFException {
      work.setSys001FileStatus200(value);
   } 

	/**
	 *	Returns the value of para3100300
	 *	@return para3100300
	 */
   public char[] getPara3100300() throws CFException  {              
   		return work.getPara3100300();
   }

  
	/**
	*  set variable para3100300
	*  @param value
	**/
   public void setPara3100300(char[] value) throws CFException {
      work.setPara3100300(value);
   } 

	/**
	 *	Returns the value of sys001CloseAbendCode300
	 *	@return sys001CloseAbendCode300
	 */
   public char[] getSys001CloseAbendCode300() throws CFException  {              
   		return work.getSys001CloseAbendCode300();
   }

  
	/**
	*  set variable sys001CloseAbendCode300
	*  @param value
	**/
   public void setSys001CloseAbendCode300(char[] value) throws CFException {
      work.setSys001CloseAbendCode300(value);
   } 

	/**
	 *	Returns the value of inputOutboundErrMsgTxt600
	 *	@return inputOutboundErrMsgTxt600
	 */   
	 public InputOutboundErrMsgTxt600 getInputOutboundErrMsgTxt600() {
   	return inputOutboundErrMsgTxt600;
   }


	/**
	 *	Test condition "00" for isSys001StatusGood88200()
	 *	@return  Returns true if isSys001StatusGood88200() is "00"
	 */
   public boolean isSys001StatusGood88200() throws CFException {
      return work.isSys001StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys001StatusGood88200True()  throws CFException{  			
    	work.setSys001StatusGood88200True();
   	}

        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public CloseInputIpmOutboundOutCtx getCloseInputIpmOutboundOutCtx() {
            return new CloseInputIpmOutboundOutCtx();
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
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += inputOutboundErrMsgTxt600.hashCode();
       return str.hashCode();
    }

    public CloseInputIpmOutboundInCtx clone() {
        CloseInputIpmOutboundInCtx cloneObj = new CloseInputIpmOutboundInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.inputOutboundErrMsgTxt600 = new InputOutboundErrMsgTxt600();
        cloneObj.inputOutboundErrMsgTxt600.set(inputOutboundErrMsgTxt600.getClonedField());
        return cloneObj;
    }

    }

    public CloseInputIpmOutboundInCtx getCloseInputIpmOutboundInCtx() {
            return new CloseInputIpmOutboundInCtx();
    }
     public class CloseInputIpmOutboundOutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();
     InputOutboundErrMsgTxt600 inputOutboundErrMsgTxt600 = Ip809050Ctx.this.getInputOutboundErrMsgTxt600();

	/**
	 *	Returns the value of sys001FileStatus200
	 *	@return sys001FileStatus200
	 */
   public char[] getSys001FileStatus200() throws CFException  {              
   		return work.getSys001FileStatus200();
   }

  
	/**
	*  set variable sys001FileStatus200
	*  @param value
	**/
   public void setSys001FileStatus200(char[] value) throws CFException {
      work.setSys001FileStatus200(value);
   } 

	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of para3100300
	 *	@return para3100300
	 */
   public char[] getPara3100300() throws CFException  {              
   		return work.getPara3100300();
   }

  
	/**
	*  set variable para3100300
	*  @param value
	**/
   public void setPara3100300(char[] value) throws CFException {
      work.setPara3100300(value);
   } 

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of inputOtbndFileStatus600
	 *	@return inputOtbndFileStatus600
	 */
   public char[] getInputOtbndFileStatus600() throws CFException  {              
   		return inputOutboundErrMsgTxt600.getInputOtbndFileStatus600();
   }

  
	/**
	*  set variable inputOtbndFileStatus600
	*  @param value
	**/
   public void setInputOtbndFileStatus600(char[] value) throws CFException {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(value);
   } 

     /**
	 * 	Update InputOtbndFileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(char[] source, int sourceIndex) throws CFException {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(source, sourceIndex);
   	
   }
   
   public void setInputOtbndFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update InputOtbndFileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update InputOtbndFileStatus600 with another Field
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(Field source) {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(source);
   }  
   
     /**
	 * 	Update InputOtbndFileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(Field source, int sourceIndex,int sourceLen) {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update InputOtbndFileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001CloseAbendCode300
	 *	@return sys001CloseAbendCode300
	 */
   public char[] getSys001CloseAbendCode300() throws CFException  {              
   		return work.getSys001CloseAbendCode300();
   }

  
	/**
	*  set variable sys001CloseAbendCode300
	*  @param value
	**/
   public void setSys001CloseAbendCode300(char[] value) throws CFException {
      work.setSys001CloseAbendCode300(value);
   } 

	/**
	 *	Returns the value of inputOutboundErrMsgTxt600
	 *	@return inputOutboundErrMsgTxt600
	 */   
	 public InputOutboundErrMsgTxt600 getInputOutboundErrMsgTxt600() {
   	return inputOutboundErrMsgTxt600;
   }


	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "ERROR CLOSING INPUT IPM OUTBOUND FILE" for isInputFileClosErrTxt88600()
	 *	@return  Returns true if isInputFileClosErrTxt88600() is "ERROR CLOSING INPUT IPM OUTBOUND FILE"
	 */
   public boolean isInputFileClosErrTxt88600() throws CFException {
      return inputOutboundErrMsgTxt600.isInputFileClosErrTxt88600();
   }

	/**
	*  set values "ERROR CLOSING INPUT IPM OUTBOUND FILE"
	*/
   	public void setInputFileClosErrTxt88600True()  throws CFException{  			
    	inputOutboundErrMsgTxt600.setInputFileClosErrTxt88600True();
   	}

        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += inputOutboundErrMsgTxt600.hashCode();
       return str.hashCode();
    }

    public CloseInputIpmOutboundOutCtx clone() {
        CloseInputIpmOutboundOutCtx cloneObj = new CloseInputIpmOutboundOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.inputOutboundErrMsgTxt600 = new InputOutboundErrMsgTxt600();
        cloneObj.inputOutboundErrMsgTxt600.set(inputOutboundErrMsgTxt600.getClonedField());
        return cloneObj;
    }

    }

    public CloseInputIpmOutboundOutCtx getCloseInputIpmOutboundOutCtx() {
            return new CloseInputIpmOutboundOutCtx();
    }
     public class CloseOutputIpmOutboundInCtx implements Cloneable {
     OutputOtbndErrMsgTxt600 outputOtbndErrMsgTxt600 = Ip809050Ctx.this.getOutputOtbndErrMsgTxt600();
     Work work = Ip809050Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();

	/**
	 *	Returns the value of outputOtbndErrMsgTxt600
	 *	@return outputOtbndErrMsgTxt600
	 */   
	 public OutputOtbndErrMsgTxt600 getOutputOtbndErrMsgTxt600() {
   	return outputOtbndErrMsgTxt600;
   }


	/**
	 *	Test condition "00" for isSys201StatusGood88200()
	 *	@return  Returns true if isSys201StatusGood88200() is "00"
	 */
   public boolean isSys201StatusGood88200() throws CFException {
      return work.isSys201StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys201StatusGood88200True()  throws CFException{  			
    	work.setSys201StatusGood88200True();
   	}
	/**
	 *	Returns the value of sys201CloseAbendCode300
	 *	@return sys201CloseAbendCode300
	 */
   public char[] getSys201CloseAbendCode300() throws CFException  {              
   		return work.getSys201CloseAbendCode300();
   }

  
	/**
	*  set variable sys201CloseAbendCode300
	*  @param value
	**/
   public void setSys201CloseAbendCode300(char[] value) throws CFException {
      work.setSys201CloseAbendCode300(value);
   } 

	/**
	 *	Returns the value of outputOtbndFileStatus201
	 *	@return outputOtbndFileStatus201
	 */
   public char[] getOutputOtbndFileStatus201() throws CFException  {              
   		return work.getOutputOtbndFileStatus201();
   }

  
	/**
	*  set variable outputOtbndFileStatus201
	*  @param value
	**/
   public void setOutputOtbndFileStatus201(char[] value) throws CFException {
      work.setOutputOtbndFileStatus201(value);
   } 

	/**
	 *	Returns the value of para3200300
	 *	@return para3200300
	 */
   public char[] getPara3200300() throws CFException  {              
   		return work.getPara3200300();
   }

  
	/**
	*  set variable para3200300
	*  @param value
	**/
   public void setPara3200300(char[] value) throws CFException {
      work.setPara3200300(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public CloseOutputIpmOutboundOutCtx getCloseOutputIpmOutboundOutCtx() {
            return new CloseOutputIpmOutboundOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += outputOtbndErrMsgTxt600.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
       return str.hashCode();
    }

    public CloseOutputIpmOutboundInCtx clone() {
        CloseOutputIpmOutboundInCtx cloneObj = new CloseOutputIpmOutboundInCtx();
        cloneObj.outputOtbndErrMsgTxt600 = new OutputOtbndErrMsgTxt600();
        cloneObj.outputOtbndErrMsgTxt600.set(outputOtbndErrMsgTxt600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        return cloneObj;
    }

    }

    public CloseOutputIpmOutboundInCtx getCloseOutputIpmOutboundInCtx() {
            return new CloseOutputIpmOutboundInCtx();
    }
     public class CloseOutputIpmOutboundOutCtx implements Cloneable {
     OutputOtbndErrMsgTxt600 outputOtbndErrMsgTxt600 = Ip809050Ctx.this.getOutputOtbndErrMsgTxt600();
     Work work = Ip809050Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();

	/**
	 *	Returns the value of outputOtbndErrMsgTxt600
	 *	@return outputOtbndErrMsgTxt600
	 */   
	 public OutputOtbndErrMsgTxt600 getOutputOtbndErrMsgTxt600() {
   	return outputOtbndErrMsgTxt600;
   }


	/**
	 *	Returns the value of outputOtbndFileStatus600
	 *	@return outputOtbndFileStatus600
	 */
   public char[] getOutputOtbndFileStatus600() throws CFException  {              
   		return outputOtbndErrMsgTxt600.getOutputOtbndFileStatus600();
   }

  
	/**
	*  set variable outputOtbndFileStatus600
	*  @param value
	**/
   public void setOutputOtbndFileStatus600(char[] value) throws CFException {
      outputOtbndErrMsgTxt600.setOutputOtbndFileStatus600(value);
   } 

     /**
	 * 	Update OutputOtbndFileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOutputOtbndFileStatus600(char[] source, int sourceIndex) throws CFException {
      outputOtbndErrMsgTxt600.setOutputOtbndFileStatus600(source, sourceIndex);
   	
   }
   
   public void setOutputOtbndFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      outputOtbndErrMsgTxt600.setOutputOtbndFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OutputOtbndFileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOutputOtbndFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      outputOtbndErrMsgTxt600.setOutputOtbndFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OutputOtbndFileStatus600 with another Field
	 *	@param value
	 */
   public void setOutputOtbndFileStatus600(Field source) {
      outputOtbndErrMsgTxt600.setOutputOtbndFileStatus600(source);
   }  
   
     /**
	 * 	Update OutputOtbndFileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOutputOtbndFileStatus600(Field source, int sourceIndex,int sourceLen) {
      outputOtbndErrMsgTxt600.setOutputOtbndFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OutputOtbndFileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOutputOtbndFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      outputOtbndErrMsgTxt600.setOutputOtbndFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "ERROR CLOSING OUTPUT IPM OUTBOUND FILE" for isOutputCloseErrTxt88600()
	 *	@return  Returns true if isOutputCloseErrTxt88600() is "ERROR CLOSING OUTPUT IPM OUTBOUND FILE"
	 */
   public boolean isOutputCloseErrTxt88600() throws CFException {
      return outputOtbndErrMsgTxt600.isOutputCloseErrTxt88600();
   }

	/**
	*  set values "ERROR CLOSING OUTPUT IPM OUTBOUND FILE"
	*/
   	public void setOutputCloseErrTxt88600True()  throws CFException{  			
    	outputOtbndErrMsgTxt600.setOutputCloseErrTxt88600True();
   	}
	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys201CloseAbendCode300
	 *	@return sys201CloseAbendCode300
	 */
   public char[] getSys201CloseAbendCode300() throws CFException  {              
   		return work.getSys201CloseAbendCode300();
   }

  
	/**
	*  set variable sys201CloseAbendCode300
	*  @param value
	**/
   public void setSys201CloseAbendCode300(char[] value) throws CFException {
      work.setSys201CloseAbendCode300(value);
   } 

	/**
	 *	Returns the value of outputOtbndFileStatus201
	 *	@return outputOtbndFileStatus201
	 */
   public char[] getOutputOtbndFileStatus201() throws CFException  {              
   		return work.getOutputOtbndFileStatus201();
   }

  
	/**
	*  set variable outputOtbndFileStatus201
	*  @param value
	**/
   public void setOutputOtbndFileStatus201(char[] value) throws CFException {
      work.setOutputOtbndFileStatus201(value);
   } 

	/**
	 *	Returns the value of para3200300
	 *	@return para3200300
	 */
   public char[] getPara3200300() throws CFException  {              
   		return work.getPara3200300();
   }

  
	/**
	*  set variable para3200300
	*  @param value
	**/
   public void setPara3200300(char[] value) throws CFException {
      work.setPara3200300(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += outputOtbndErrMsgTxt600.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
       return str.hashCode();
    }

    public CloseOutputIpmOutboundOutCtx clone() {
        CloseOutputIpmOutboundOutCtx cloneObj = new CloseOutputIpmOutboundOutCtx();
        cloneObj.outputOtbndErrMsgTxt600 = new OutputOtbndErrMsgTxt600();
        cloneObj.outputOtbndErrMsgTxt600.set(outputOtbndErrMsgTxt600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        return cloneObj;
    }

    }

    public CloseOutputIpmOutboundOutCtx getCloseOutputIpmOutboundOutCtx() {
            return new CloseOutputIpmOutboundOutCtx();
    }
     public class GetRegionNameInCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Ip00724TableEntry ip00724TableEntry = Ip809050Ctx.this.getIp00724TableEntry();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();

	/**
	 *	Returns the value of regionE600
	 *	@return regionE600
	 */
   public char[] getRegionE600() throws CFException  {              
   		return work.getRegionE600();
   }

  
	/**
	*  set variable regionE600
	*  @param value
	**/
   public void setRegionE600(char[] value) throws CFException {
      work.setRegionE600(value);
   } 

	/**
	 *	Returns the value of region1600
	 *	@return region1600
	 */
   public char[] getRegion1600() throws CFException  {              
   		return work.getRegion1600();
   }

  
	/**
	*  set variable region1600
	*  @param value
	**/
   public void setRegion1600(char[] value) throws CFException {
      work.setRegion1600(value);
   } 

	/**
	 *	Returns the value of regionA600
	 *	@return regionA600
	 */
   public char[] getRegionA600() throws CFException  {              
   		return work.getRegionA600();
   }

  
	/**
	*  set variable regionA600
	*  @param value
	**/
   public void setRegionA600(char[] value) throws CFException {
      work.setRegionA600(value);
   } 

	/**
	 *	Returns the value of regionB600
	 *	@return regionB600
	 */
   public char[] getRegionB600() throws CFException  {              
   		return work.getRegionB600();
   }

  
	/**
	*  set variable regionB600
	*  @param value
	**/
   public void setRegionB600(char[] value) throws CFException {
      work.setRegionB600(value);
   } 

	/**
	 *	Returns the value of ip00724IchgRegion
	 *	@return ip00724IchgRegion
	 */
   public char[] getIp00724IchgRegion() throws CFException  {              
   		return ip00724TableEntry.getIp00724Ichg().getIp00724IchgRegion();
   }

  
	/**
	*  set variable ip00724IchgRegion
	*  @param value
	**/
   public void setIp00724IchgRegion(char[] value) throws CFException {
      ip00724TableEntry.getIp00724Ichg().setIp00724IchgRegion(value);
   } 

     /**
	 * 	Update Ip00724IchgRegion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724IchgRegion(char[] source, int sourceIndex) throws CFException {
      ip00724TableEntry.getIp00724Ichg().setIp00724IchgRegion(source, sourceIndex);
   	
   }
   
   public void setIp00724IchgRegion(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00724TableEntry.getIp00724Ichg().setIp00724IchgRegion(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00724IchgRegion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724IchgRegion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00724TableEntry.getIp00724Ichg().setIp00724IchgRegion(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00724IchgRegion with another Field
	 *	@param value
	 */
   public void setIp00724IchgRegion(Field source) {
      ip00724TableEntry.getIp00724Ichg().setIp00724IchgRegion(source);
   }  
   
     /**
	 * 	Update Ip00724IchgRegion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724IchgRegion(Field source, int sourceIndex,int sourceLen) {
      ip00724TableEntry.getIp00724Ichg().setIp00724IchgRegion(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00724IchgRegion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724IchgRegion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00724TableEntry.getIp00724Ichg().setIp00724IchgRegion(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of regionC600
	 *	@return regionC600
	 */
   public char[] getRegionC600() throws CFException  {              
   		return work.getRegionC600();
   }

  
	/**
	*  set variable regionC600
	*  @param value
	**/
   public void setRegionC600(char[] value) throws CFException {
      work.setRegionC600(value);
   } 

	/**
	 *	Returns the value of regionD600
	 *	@return regionD600
	 */
   public char[] getRegionD600() throws CFException  {              
   		return work.getRegionD600();
   }

  
	/**
	*  set variable regionD600
	*  @param value
	**/
   public void setRegionD600(char[] value) throws CFException {
      work.setRegionD600(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public GetRegionNameOutCtx getGetRegionNameOutCtx() {
            return new GetRegionNameOutCtx();
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
        str += ip00724TableEntry.hashCode();
        str += chipLiabVariables800.hashCode();
       return str.hashCode();
    }

    public GetRegionNameInCtx clone() {
        GetRegionNameInCtx cloneObj = new GetRegionNameInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip00724TableEntry = new Ip00724TableEntry();
        cloneObj.ip00724TableEntry.set(ip00724TableEntry.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        return cloneObj;
    }

    }

    public GetRegionNameInCtx getGetRegionNameInCtx() {
            return new GetRegionNameInCtx();
    }
     public class GetRegionNameOutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     Ip00724TableEntry ip00724TableEntry = Ip809050Ctx.this.getIp00724TableEntry();
     ChipLiabVariables800 chipLiabVariables800 = Ip809050Ctx.this.getChipLiabVariables800();

	/**
	 *	Returns the value of regionE600
	 *	@return regionE600
	 */
   public char[] getRegionE600() throws CFException  {              
   		return work.getRegionE600();
   }

  
	/**
	*  set variable regionE600
	*  @param value
	**/
   public void setRegionE600(char[] value) throws CFException {
      work.setRegionE600(value);
   } 

	/**
	 *	Returns the value of region1600
	 *	@return region1600
	 */
   public char[] getRegion1600() throws CFException  {              
   		return work.getRegion1600();
   }

  
	/**
	*  set variable region1600
	*  @param value
	**/
   public void setRegion1600(char[] value) throws CFException {
      work.setRegion1600(value);
   } 

	/**
	 *	Returns the value of regionA600
	 *	@return regionA600
	 */
   public char[] getRegionA600() throws CFException  {              
   		return work.getRegionA600();
   }

  
	/**
	*  set variable regionA600
	*  @param value
	**/
   public void setRegionA600(char[] value) throws CFException {
      work.setRegionA600(value);
   } 

	/**
	 *	Returns the value of regionB600
	 *	@return regionB600
	 */
   public char[] getRegionB600() throws CFException  {              
   		return work.getRegionB600();
   }

  
	/**
	*  set variable regionB600
	*  @param value
	**/
   public void setRegionB600(char[] value) throws CFException {
      work.setRegionB600(value);
   } 

	/**
	 *	Returns the value of region800
	 *	@return region800
	 */
   public char[] getRegion800() throws CFException  {              
   		return chipLiabVariables800.getRegion800();
   }

  
	/**
	*  set variable region800
	*  @param value
	**/
   public void setRegion800(char[] value) throws CFException {
      chipLiabVariables800.setRegion800(value);
   } 

     /**
	 * 	Update Region800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRegion800(char[] source, int sourceIndex) throws CFException {
      chipLiabVariables800.setRegion800(source, sourceIndex);
   	
   }
   
   public void setRegion800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      chipLiabVariables800.setRegion800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Region800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRegion800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.setRegion800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Region800 with another Field
	 *	@param value
	 */
   public void setRegion800(Field source) {
      chipLiabVariables800.setRegion800(source);
   }  
   
     /**
	 * 	Update Region800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRegion800(Field source, int sourceIndex,int sourceLen) {
      chipLiabVariables800.setRegion800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Region800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRegion800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      chipLiabVariables800.setRegion800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of regionC600
	 *	@return regionC600
	 */
   public char[] getRegionC600() throws CFException  {              
   		return work.getRegionC600();
   }

  
	/**
	*  set variable regionC600
	*  @param value
	**/
   public void setRegionC600(char[] value) throws CFException {
      work.setRegionC600(value);
   } 

	/**
	 *	Returns the value of regionD600
	 *	@return regionD600
	 */
   public char[] getRegionD600() throws CFException  {              
   		return work.getRegionD600();
   }

  
	/**
	*  set variable regionD600
	*  @param value
	**/
   public void setRegionD600(char[] value) throws CFException {
      work.setRegionD600(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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
        str += ip00724TableEntry.hashCode();
        str += chipLiabVariables800.hashCode();
       return str.hashCode();
    }

    public GetRegionNameOutCtx clone() {
        GetRegionNameOutCtx cloneObj = new GetRegionNameOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip00724TableEntry = new Ip00724TableEntry();
        cloneObj.ip00724TableEntry.set(ip00724TableEntry.getClonedField());
        cloneObj.chipLiabVariables800 = new ChipLiabVariables800();
        cloneObj.chipLiabVariables800.set(chipLiabVariables800.getClonedField());
        return cloneObj;
    }

    }

    public GetRegionNameOutCtx getGetRegionNameOutCtx() {
            return new GetRegionNameOutCtx();
    }
     public class ReadInputOutboundFileInCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();
     InputOutboundErrMsgTxt600 inputOutboundErrMsgTxt600 = Ip809050Ctx.this.getInputOutboundErrMsgTxt600();
     Sys001InputIpmOutboundRec sys001InputIpmOutboundRec = Ip809050Ctx.this.getSys001InputIpmOutboundRec();
     Ip30671OutboundMessageArea ip30671OutboundMessageArea = Ip809050Ctx.this.getIp30671OutboundMessageArea();

	/**
	 *	Test condition "Y" for isSys201IsOpen88100()
	 *	@return  Returns true if isSys201IsOpen88100() is "Y"
	 */
   public boolean isSys201IsOpen88100() throws CFException {
      return work.isSys201IsOpen88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setSys201IsOpen88100True()  throws CFException{  			
    	work.setSys201IsOpen88100True();
   	}
	/**
	 *	Returns the value of para8100300
	 *	@return para8100300
	 */
   public char[] getPara8100300() throws CFException  {              
   		return work.getPara8100300();
   }

  
	/**
	*  set variable para8100300
	*  @param value
	**/
   public void setPara8100300(char[] value) throws CFException {
      work.setPara8100300(value);
   } 

	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public int getValueOne300() throws CFException {
   		return work.getValueOne300();
	}


	/**
	 *	Returns String value of valueOne300
	 *	@return valueOne300
	 */
	public char[]  getValueOne300String() throws CFException {
	     return String.valueOf(work.getValueOne300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean valueOne300IsNumeric()  throws CFException{
	    return work.valueOne300IsNumeric();
	}

	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300(number);
	}
	

	public void setValueOne300(long number)  throws CFException{
	    work.setValueOne300(number);
	}
	
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValueOne300(char[] value)  throws CFException {
		work.setValueOne300(value);
	}
	
	/**
	 * 	Update ValueOne300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValueOne300String(char[] value)  throws CFException{
		work.setValueOne300(value);
	}	

	/**
	 *	Returns the value of sys001ReadAbendCode300
	 *	@return sys001ReadAbendCode300
	 */
   public char[] getSys001ReadAbendCode300() throws CFException  {              
   		return work.getSys001ReadAbendCode300();
   }

  
	/**
	*  set variable sys001ReadAbendCode300
	*  @param value
	**/
   public void setSys001ReadAbendCode300(char[] value) throws CFException {
      work.setSys001ReadAbendCode300(value);
   } 

	/**
	 *	Returns the value of inputOutboundErrMsgTxt600
	 *	@return inputOutboundErrMsgTxt600
	 */   
	 public InputOutboundErrMsgTxt600 getInputOutboundErrMsgTxt600() {
   	return inputOutboundErrMsgTxt600;
   }


	/**
	 *	Returns the value of ipmCountReadCnt400
	 *	@return ipmCountReadCnt400
	 */
	public int getIpmCountReadCnt400() throws CFException {        
   		return work.getIpmCountReadCnt400();
	}
	
	/**
	 * 	Update IpmCountReadCnt400 with the passed value
	 *	@param number
	 */
	public void setIpmCountReadCnt400(int number)  throws CFException{
		work.setIpmCountReadCnt400(number);
	}


	public void setIpmCountReadCnt400(long number)  throws CFException{
		work.setIpmCountReadCnt400((int)number);
	}


	/**
	 *	Returns the value of ip30671OutboundMessageArea
	 *	@return ip30671OutboundMessageArea
	 */   
	 public Ip30671OutboundMessageArea getIp30671OutboundMessageArea() {
   	return ip30671OutboundMessageArea;
   }


	/**
	 *	Returns the value of ipmOutbndUnscrubRdw400
	 *	@return ipmOutbndUnscrubRdw400
	 */
	public int getIpmOutbndUnscrubRdw400() throws CFException {        
   		return work.getIpmOutbndUnscrubRdw400();
	}
	
	/**
	 * 	Update IpmOutbndUnscrubRdw400 with the passed value
	 *	@param number
	 */
	public void setIpmOutbndUnscrubRdw400(int number)  throws CFException{
		work.setIpmOutbndUnscrubRdw400(number);
	}


	public void setIpmOutbndUnscrubRdw400(long number)  throws CFException{
		work.setIpmOutbndUnscrubRdw400((int)number);
	}



        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public ReadInputOutboundFileOutCtx getReadInputOutboundFileOutCtx() {
            return new ReadInputOutboundFileOutCtx();
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
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += inputOutboundErrMsgTxt600.hashCode();
        str += sys001InputIpmOutboundRec.hashCode();
        str += ip30671OutboundMessageArea.hashCode();
       return str.hashCode();
    }

    public ReadInputOutboundFileInCtx clone() {
        ReadInputOutboundFileInCtx cloneObj = new ReadInputOutboundFileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.inputOutboundErrMsgTxt600 = new InputOutboundErrMsgTxt600();
        cloneObj.inputOutboundErrMsgTxt600.set(inputOutboundErrMsgTxt600.getClonedField());
        cloneObj.sys001InputIpmOutboundRec = new Sys001InputIpmOutboundRec();
        cloneObj.sys001InputIpmOutboundRec.set(sys001InputIpmOutboundRec.getClonedField());
        cloneObj.ip30671OutboundMessageArea = new Ip30671OutboundMessageArea();
        cloneObj.ip30671OutboundMessageArea.set(ip30671OutboundMessageArea.getClonedField());
        return cloneObj;
    }

    }

    public ReadInputOutboundFileInCtx getReadInputOutboundFileInCtx() {
            return new ReadInputOutboundFileInCtx();
    }
     public class ReadInputOutboundFileOutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();
     InputOutboundErrMsgTxt600 inputOutboundErrMsgTxt600 = Ip809050Ctx.this.getInputOutboundErrMsgTxt600();
     Sys001InputIpmOutboundRec sys001InputIpmOutboundRec = Ip809050Ctx.this.getSys001InputIpmOutboundRec();
     Ip30671OutboundMessageArea ip30671OutboundMessageArea = Ip809050Ctx.this.getIp30671OutboundMessageArea();

	/**
	 *	Returns the value of sys001FileStatus200
	 *	@return sys001FileStatus200
	 */
   public char[] getSys001FileStatus200() throws CFException  {              
   		return work.getSys001FileStatus200();
   }

  
	/**
	*  set variable sys001FileStatus200
	*  @param value
	**/
   public void setSys001FileStatus200(char[] value) throws CFException {
      work.setSys001FileStatus200(value);
   } 

	/**
	 *	Test condition "EMPTY UNSCRUBBED IPM OUTBOUND FILE" for isInputFileEmtyErrTxt88600()
	 *	@return  Returns true if isInputFileEmtyErrTxt88600() is "EMPTY UNSCRUBBED IPM OUTBOUND FILE"
	 */
   public boolean isInputFileEmtyErrTxt88600() throws CFException {
      return inputOutboundErrMsgTxt600.isInputFileEmtyErrTxt88600();
   }

	/**
	*  set values "EMPTY UNSCRUBBED IPM OUTBOUND FILE"
	*/
   	public void setInputFileEmtyErrTxt88600True()  throws CFException{  			
    	inputOutboundErrMsgTxt600.setInputFileEmtyErrTxt88600True();
   	}
	/**
	 *	Test condition "ERROR READING INPUT IPM OUTBOUND FILE" for isInputFileReadErrTxt88600()
	 *	@return  Returns true if isInputFileReadErrTxt88600() is "ERROR READING INPUT IPM OUTBOUND FILE"
	 */
   public boolean isInputFileReadErrTxt88600() throws CFException {
      return inputOutboundErrMsgTxt600.isInputFileReadErrTxt88600();
   }

	/**
	*  set values "ERROR READING INPUT IPM OUTBOUND FILE"
	*/
   	public void setInputFileReadErrTxt88600True()  throws CFException{  			
    	inputOutboundErrMsgTxt600.setInputFileReadErrTxt88600True();
   	}
	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isItIsFirstTime88100()
	 *	@return  Returns true if isItIsFirstTime88100() is "Y"
	 */
   public boolean isItIsFirstTime88100() throws CFException {
      return work.isItIsFirstTime88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsFirstTime88100True()  throws CFException{  			
    	work.setItIsFirstTime88100True();
   	}
	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "00" for isSys001StatusGood88200()
	 *	@return  Returns true if isSys001StatusGood88200() is "00"
	 */
   public boolean isSys001StatusGood88200() throws CFException {
      return work.isSys001StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys001StatusGood88200True()  throws CFException{  			
    	work.setSys001StatusGood88200True();
   	}
	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001InputIpmOutboundRec
	 *	@return sys001InputIpmOutboundRec
	 */   
	 public Sys001InputIpmOutboundRec getSys001InputIpmOutboundRec() {
   	return sys001InputIpmOutboundRec;
   }


	/**
	 *	Test condition "N" for isItIsNotFirstTime88100()
	 *	@return  Returns true if isItIsNotFirstTime88100() is "N"
	 */
   public boolean isItIsNotFirstTime88100() throws CFException {
      return work.isItIsNotFirstTime88100();
   }

	/**
	*  set values "N"
	*/
   	public void setItIsNotFirstTime88100True()  throws CFException{  			
    	work.setItIsNotFirstTime88100True();
   	}
	/**
	 *	Returns the value of ipmOutbndUnscrubRdw400
	 *	@return ipmOutbndUnscrubRdw400
	 */
	public int getIpmOutbndUnscrubRdw400() throws CFException {        
   		return work.getIpmOutbndUnscrubRdw400();
	}
	
	/**
	 * 	Update IpmOutbndUnscrubRdw400 with the passed value
	 *	@param number
	 */
	public void setIpmOutbndUnscrubRdw400(int number)  throws CFException{
		work.setIpmOutbndUnscrubRdw400(number);
	}


	public void setIpmOutbndUnscrubRdw400(long number)  throws CFException{
		work.setIpmOutbndUnscrubRdw400((int)number);
	}


	/**
	 *	Test condition "10" for isSys001EndOfFile88200()
	 *	@return  Returns true if isSys001EndOfFile88200() is "10"
	 */
   public boolean isSys001EndOfFile88200() throws CFException {
      return work.isSys001EndOfFile88200();
   }

	/**
	*  set values "10"
	*/
   	public void setSys001EndOfFile88200True()  throws CFException{  			
    	work.setSys001EndOfFile88200True();
   	}
	/**
	 *	Returns the value of para8100300
	 *	@return para8100300
	 */
   public char[] getPara8100300() throws CFException  {              
   		return work.getPara8100300();
   }

  
	/**
	*  set variable para8100300
	*  @param value
	**/
   public void setPara8100300(char[] value) throws CFException {
      work.setPara8100300(value);
   } 

	/**
	 *	Returns the value of sys001ReadAbendCode300
	 *	@return sys001ReadAbendCode300
	 */
   public char[] getSys001ReadAbendCode300() throws CFException  {              
   		return work.getSys001ReadAbendCode300();
   }

  
	/**
	*  set variable sys001ReadAbendCode300
	*  @param value
	**/
   public void setSys001ReadAbendCode300(char[] value) throws CFException {
      work.setSys001ReadAbendCode300(value);
   } 

	/**
	 *	Returns the value of inputOtbndFileStatus600
	 *	@return inputOtbndFileStatus600
	 */
   public char[] getInputOtbndFileStatus600() throws CFException  {              
   		return inputOutboundErrMsgTxt600.getInputOtbndFileStatus600();
   }

  
	/**
	*  set variable inputOtbndFileStatus600
	*  @param value
	**/
   public void setInputOtbndFileStatus600(char[] value) throws CFException {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(value);
   } 

     /**
	 * 	Update InputOtbndFileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(char[] source, int sourceIndex) throws CFException {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(source, sourceIndex);
   	
   }
   
   public void setInputOtbndFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update InputOtbndFileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update InputOtbndFileStatus600 with another Field
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(Field source) {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(source);
   }  
   
     /**
	 * 	Update InputOtbndFileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(Field source, int sourceIndex,int sourceLen) {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update InputOtbndFileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of inputOutboundErrMsgTxt600
	 *	@return inputOutboundErrMsgTxt600
	 */   
	 public InputOutboundErrMsgTxt600 getInputOutboundErrMsgTxt600() {
   	return inputOutboundErrMsgTxt600;
   }


	/**
	 *	Returns the value of ipmCountReadCnt400
	 *	@return ipmCountReadCnt400
	 */
	public int getIpmCountReadCnt400() throws CFException {        
   		return work.getIpmCountReadCnt400();
	}
	
	/**
	 * 	Update IpmCountReadCnt400 with the passed value
	 *	@param number
	 */
	public void setIpmCountReadCnt400(int number)  throws CFException{
		work.setIpmCountReadCnt400(number);
	}


	public void setIpmCountReadCnt400(long number)  throws CFException{
		work.setIpmCountReadCnt400((int)number);
	}


	/**
	 *	Returns the value of ip30671OutboundMessageArea
	 *	@return ip30671OutboundMessageArea
	 */   
	 public Ip30671OutboundMessageArea getIp30671OutboundMessageArea() {
   	return ip30671OutboundMessageArea;
   }



        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += inputOutboundErrMsgTxt600.hashCode();
        str += sys001InputIpmOutboundRec.hashCode();
        str += ip30671OutboundMessageArea.hashCode();
       return str.hashCode();
    }

    public ReadInputOutboundFileOutCtx clone() {
        ReadInputOutboundFileOutCtx cloneObj = new ReadInputOutboundFileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.inputOutboundErrMsgTxt600 = new InputOutboundErrMsgTxt600();
        cloneObj.inputOutboundErrMsgTxt600.set(inputOutboundErrMsgTxt600.getClonedField());
        cloneObj.sys001InputIpmOutboundRec = new Sys001InputIpmOutboundRec();
        cloneObj.sys001InputIpmOutboundRec.set(sys001InputIpmOutboundRec.getClonedField());
        cloneObj.ip30671OutboundMessageArea = new Ip30671OutboundMessageArea();
        cloneObj.ip30671OutboundMessageArea.set(ip30671OutboundMessageArea.getClonedField());
        return cloneObj;
    }

    }

    public ReadInputOutboundFileOutCtx getReadInputOutboundFileOutCtx() {
            return new ReadInputOutboundFileOutCtx();
    }
     public class CloseSys001OutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();

	/**
	 *	Returns the value of sys001FileStatus200
	 *	@return sys001FileStatus200
	 */
   public char[] getSys001FileStatus200() throws CFException  {              
   		return work.getSys001FileStatus200();
   }

  
	/**
	*  set variable sys001FileStatus200
	*  @param value
	**/
   public void setSys001FileStatus200(char[] value) throws CFException {
      work.setSys001FileStatus200(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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

    public CloseSys001OutCtx clone() {
        CloseSys001OutCtx cloneObj = new CloseSys001OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseSys001OutCtx getCloseSys001OutCtx() {
            return new CloseSys001OutCtx();
    }
     public class CloseSys201OutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();

	/**
	 *	Returns the value of outputOtbndFileStatus202
	 *	@return outputOtbndFileStatus202
	 */
   public char[] getOutputOtbndFileStatus202() throws CFException  {              
   		return work.getOutputOtbndFileStatus202();
   }

  
	/**
	*  set variable outputOtbndFileStatus202
	*  @param value
	**/
   public void setOutputOtbndFileStatus202(char[] value) throws CFException {
      work.setOutputOtbndFileStatus202(value);
   } 

	/**
	 *	Returns the value of outputOtbndFileStatus203
	 *	@return outputOtbndFileStatus203
	 */
   public char[] getOutputOtbndFileStatus203() throws CFException  {              
   		return work.getOutputOtbndFileStatus203();
   }

  
	/**
	*  set variable outputOtbndFileStatus203
	*  @param value
	**/
   public void setOutputOtbndFileStatus203(char[] value) throws CFException {
      work.setOutputOtbndFileStatus203(value);
   } 

	/**
	 *	Returns the value of outputOtbndFileStatus205
	 *	@return outputOtbndFileStatus205
	 */
   public char[] getOutputOtbndFileStatus205() throws CFException  {              
   		return work.getOutputOtbndFileStatus205();
   }

  
	/**
	*  set variable outputOtbndFileStatus205
	*  @param value
	**/
   public void setOutputOtbndFileStatus205(char[] value) throws CFException {
      work.setOutputOtbndFileStatus205(value);
   } 

	/**
	 *	Returns the value of outputOtbndFileStatus206
	 *	@return outputOtbndFileStatus206
	 */
   public char[] getOutputOtbndFileStatus206() throws CFException  {              
   		return work.getOutputOtbndFileStatus206();
   }

  
	/**
	*  set variable outputOtbndFileStatus206
	*  @param value
	**/
   public void setOutputOtbndFileStatus206(char[] value) throws CFException {
      work.setOutputOtbndFileStatus206(value);
   } 

	/**
	 *	Returns the value of outputOtbndFileStatus204
	 *	@return outputOtbndFileStatus204
	 */
   public char[] getOutputOtbndFileStatus204() throws CFException  {              
   		return work.getOutputOtbndFileStatus204();
   }

  
	/**
	*  set variable outputOtbndFileStatus204
	*  @param value
	**/
   public void setOutputOtbndFileStatus204(char[] value) throws CFException {
      work.setOutputOtbndFileStatus204(value);
   } 

	/**
	 *	Returns the value of outputOtbndFileStatus207
	 *	@return outputOtbndFileStatus207
	 */
   public char[] getOutputOtbndFileStatus207() throws CFException  {              
   		return work.getOutputOtbndFileStatus207();
   }

  
	/**
	*  set variable outputOtbndFileStatus207
	*  @param value
	**/
   public void setOutputOtbndFileStatus207(char[] value) throws CFException {
      work.setOutputOtbndFileStatus207(value);
   } 

	/**
	 *	Returns the value of outputOtbndFileStatus201
	 *	@return outputOtbndFileStatus201
	 */
   public char[] getOutputOtbndFileStatus201() throws CFException  {              
   		return work.getOutputOtbndFileStatus201();
   }

  
	/**
	*  set variable outputOtbndFileStatus201
	*  @param value
	**/
   public void setOutputOtbndFileStatus201(char[] value) throws CFException {
      work.setOutputOtbndFileStatus201(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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

    public CloseSys201OutCtx clone() {
        CloseSys201OutCtx cloneObj = new CloseSys201OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseSys201OutCtx getCloseSys201OutCtx() {
            return new CloseSys201OutCtx();
    }
     public class CloseSys012OutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();

	/**
	 *	Returns the value of sys012FileStatus200
	 *	@return sys012FileStatus200
	 */
   public char[] getSys012FileStatus200() throws CFException  {              
   		return work.getSys012FileStatus200();
   }

  
	/**
	*  set variable sys012FileStatus200
	*  @param value
	**/
   public void setSys012FileStatus200(char[] value) throws CFException {
      work.setSys012FileStatus200(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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

    public CloseSys012OutCtx clone() {
        CloseSys012OutCtx cloneObj = new CloseSys012OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseSys012OutCtx getCloseSys012OutCtx() {
            return new CloseSys012OutCtx();
    }
     public class TerminateProcessInCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip809050Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of pgmId300
	 *	@return pgmId300
	 */
   public char[] getPgmId300() throws CFException  {              
   		return work.getPgmId300();
   }

  
	/**
	*  set variable pgmId300
	*  @param value
	**/
   public void setPgmId300(char[] value) throws CFException {
      work.setPgmId300(value);
   } 

	/**
	 *	Returns the value of abendMessage900
	 *	@return abendMessage900
	 */   
	 public AbendMessage900 getAbendMessage900() {
   	return abendMessage900;
   }


	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendParaName900
	 *	@return abendParaName900
	 */   
	 public AbendParaName900 getAbendParaName900() {
   	return abendParaName900;
   }


	/**
	 *	Returns the value of outputOutboundExtrCount400
	 *	@return outputOutboundExtrCount400
	 */
	public int getOutputOutboundExtrCount400() throws CFException {        
   		return work.getOutputOutboundExtrCount400();
	}
	
	/**
	 * 	Update OutputOutboundExtrCount400 with the passed value
	 *	@param number
	 */
	public void setOutputOutboundExtrCount400(int number)  throws CFException{
		work.setOutputOutboundExtrCount400(number);
	}


	public void setOutputOutboundExtrCount400(long number)  throws CFException{
		work.setOutputOutboundExtrCount400((int)number);
	}


	/**
	 *	Returns the value of outputOutboundExtrCnt2400
	 *	@return outputOutboundExtrCnt2400
	 */
	public int getOutputOutboundExtrCnt2400() throws CFException {        
   		return work.getOutputOutboundExtrCnt2400();
	}
	
	/**
	 * 	Update OutputOutboundExtrCnt2400 with the passed value
	 *	@param number
	 */
	public void setOutputOutboundExtrCnt2400(int number)  throws CFException{
		work.setOutputOutboundExtrCnt2400(number);
	}


	public void setOutputOutboundExtrCnt2400(long number)  throws CFException{
		work.setOutputOutboundExtrCnt2400((int)number);
	}


	/**
	 *	Returns the value of displayAbendMsgTxt600
	 *	@return displayAbendMsgTxt600
	 */
   public char[] getDisplayAbendMsgTxt600() throws CFException  {              
   		return work.getDisplayAbendMsgTxt600();
   }

  
	/**
	*  set variable displayAbendMsgTxt600
	*  @param value
	**/
   public void setDisplayAbendMsgTxt600(char[] value) throws CFException {
      work.setDisplayAbendMsgTxt600(value);
   } 

	/**
	 *	Returns the value of abendPtr800
	 *	@return abendPtr800
	 */
   public char[] getAbendPtr800() throws CFException  {              
   		return work.getAbendPtr800();
   }

  
	/**
	*  set variable abendPtr800
	*  @param value
	**/
   public void setAbendPtr800(char[] value) throws CFException {
      work.setAbendPtr800(value);
   } 


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public TerminateProcessOutCtx getTerminateProcessOutCtx() {
            return new TerminateProcessOutCtx();
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
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public TerminateProcessInCtx clone() {
        TerminateProcessInCtx cloneObj = new TerminateProcessInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public TerminateProcessInCtx getTerminateProcessInCtx() {
            return new TerminateProcessInCtx();
    }
     public class TerminateProcessOutCtx implements Cloneable {
     Work work = Ip809050Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip809050Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip809050Ctx.this.getAbendParaName900();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip809050Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of pgmId300
	 *	@return pgmId300
	 */
   public char[] getPgmId300() throws CFException  {              
   		return work.getPgmId300();
   }

  
	/**
	*  set variable pgmId300
	*  @param value
	**/
   public void setPgmId300(char[] value) throws CFException {
      work.setPgmId300(value);
   } 

	/**
	 *	Returns the value of abendMessage900
	 *	@return abendMessage900
	 */   
	 public AbendMessage900 getAbendMessage900() {
   	return abendMessage900;
   }


	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip60001EventErrorCode
	 *	@return ip60001EventErrorCode
	 */
   public char[] getIp60001EventErrorCode() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001EventErrorCode();
   }

  
	/**
	*  set variable ip60001EventErrorCode
	*  @param value
	**/
   public void setIp60001EventErrorCode(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(value);
   } 

     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001EventErrorCode(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex);
   	
   }
   
   public void setIp60001EventErrorCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001EventErrorCode with another Field
	 *	@param value
	 */
   public void setIp60001EventErrorCode(Field source) {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source);
   }  
   
     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001EventErrorCode(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip60001EventErrorMsg
	 *	@return ip60001EventErrorMsg
	 */
   public char[] getIp60001EventErrorMsg() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001EventErrorMsg();
   }

  
	/**
	*  set variable ip60001EventErrorMsg
	*  @param value
	**/
   public void setIp60001EventErrorMsg(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(value);
   } 

     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex);
   	
   }
   
   public void setIp60001EventErrorMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001EventErrorMsg with another Field
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(Field source) {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source);
   }  
   
     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip60001HoldPgmName
	 *	@return ip60001HoldPgmName
	 */
   public char[] getIp60001HoldPgmName() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001HoldPgmName();
   }

  
	/**
	*  set variable ip60001HoldPgmName
	*  @param value
	**/
   public void setIp60001HoldPgmName(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(value);
   } 

     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex);
   	
   }
   
   public void setIp60001HoldPgmName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001HoldPgmName with another Field
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source);
   }  
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
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
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public TerminateProcessOutCtx clone() {
        TerminateProcessOutCtx cloneObj = new TerminateProcessOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public TerminateProcessOutCtx getTerminateProcessOutCtx() {
            return new TerminateProcessOutCtx();
    }
     public class UpdateEventLogInCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip809050Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Test condition "T" for isIp60001LogEvent88()
	 *	@return  Returns true if isIp60001LogEvent88() is "T"
	 */
   public boolean isIp60001LogEvent88() throws CFException {
      return ip60001EventLogWorkArea.isIp60001LogEvent88();
   }

	/**
	*  set values "T"
	*/
   	public void setIp60001LogEvent88True()  throws CFException{  			
    	ip60001EventLogWorkArea.setIp60001LogEvent88True();
   	}
	/**
	 *	Returns the value of ip60001Subscript
	 *	@return ip60001Subscript
	 */
	public long getIp60001Subscript() throws CFException {        
   		return ip60001EventLogWorkArea.getIp60001Subscript();
	}
	
	/**
	 * 	Update Ip60001Subscript with the passed value
	 *	@param number
	 */
	public void setIp60001Subscript(long number)  throws CFException{
		ip60001EventLogWorkArea.setIp60001Subscript(number);
	}



	/**
	 *	Returns the value of ip60001HoldPgmName
	 *	@return ip60001HoldPgmName
	 */
   public char[] getIp60001HoldPgmName() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001HoldPgmName();
   }

  
	/**
	*  set variable ip60001HoldPgmName
	*  @param value
	**/
   public void setIp60001HoldPgmName(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(value);
   } 

     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex);
   	
   }
   
   public void setIp60001HoldPgmName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001HoldPgmName with another Field
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source);
   }  
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }

        public UpdateEventLogOutCtx getUpdateEventLogOutCtx() {
            return new UpdateEventLogOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public UpdateEventLogInCtx clone() {
        UpdateEventLogInCtx cloneObj = new UpdateEventLogInCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public UpdateEventLogInCtx getUpdateEventLogInCtx() {
            return new UpdateEventLogInCtx();
    }
     public class UpdateEventLogOutCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip809050Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of ip60001PgmName
	 *	@return ip60001PgmName
	 */
   public char[] getIp60001PgmName(int index) throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001EventEntry(index).getIp60001PgmName();
   }

  
	/**
	*  set variable ip60001PgmName
	*  @param value
	**/
   public void setIp60001PgmName(int index,char[] value) throws CFException {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(value);
   } 

     /**
	 * 	Update Ip60001PgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001PgmName(int index,char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex);
   	
   }
   
   public void setIp60001PgmName(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001PgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001PgmName(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001PgmName with another Field
	 *	@param value
	 */
   public void setIp60001PgmName(int index,Field source) {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source);
   }  
   
     /**
	 * 	Update Ip60001PgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001PgmName(int index,Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001PgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001PgmName(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip60001Subscript
	 *	@return ip60001Subscript
	 */
	public long getIp60001Subscript() throws CFException {        
   		return ip60001EventLogWorkArea.getIp60001Subscript();
	}
	
	/**
	 * 	Update Ip60001Subscript with the passed value
	 *	@param number
	 */
	public void setIp60001Subscript(long number)  throws CFException{
		ip60001EventLogWorkArea.setIp60001Subscript(number);
	}



	/**
	 *	Returns the value of ip60001HoldPgmName
	 *	@return ip60001HoldPgmName
	 */
   public char[] getIp60001HoldPgmName() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001HoldPgmName();
   }

  
	/**
	*  set variable ip60001HoldPgmName
	*  @param value
	**/
   public void setIp60001HoldPgmName(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(value);
   } 

     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex);
   	
   }
   
   public void setIp60001HoldPgmName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001HoldPgmName with another Field
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source);
   }  
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip809050Ctx getIp809050Ctx() {
            return Ip809050Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public UpdateEventLogOutCtx clone() {
        UpdateEventLogOutCtx cloneObj = new UpdateEventLogOutCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public UpdateEventLogOutCtx getUpdateEventLogOutCtx() {
            return new UpdateEventLogOutCtx();
    }
}
