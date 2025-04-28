package com.cloudframe.app.ip662010;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.ip662010.dto.Work;
import com.cloudframe.app.global.sharedvar.Ip000608ProcessingDateTimeGroup;
import com.cloudframe.app.global.sharedvar.Ip65504SelElemEntriesAll;
import com.cloudframe.app.global.sharedvar.Ip66102IpmMsg;
import com.cloudframe.app.ip662010.dto.UndefinedPds600;
import com.cloudframe.app.global.sharedvar.Ip000704DeSubAttrTable;
import com.cloudframe.app.ip662010.dto.CarrierTooShortCodes600;
import com.cloudframe.app.global.sharedvar.Ip65504CurrentTagTable;
import com.cloudframe.app.global.sharedvar.Ip65504PdsMapEntry;
import com.cloudframe.app.global.sharedvar.Ip66102IpmFileInformation;
import com.cloudframe.app.global.sharedvar.Ip65504TagArea;
import com.cloudframe.app.ip662010.dto.MessageLengthMsg600;
import com.cloudframe.app.ip662010.dto.Id800;
import com.cloudframe.app.ip662010.dto.IpmErrorMsg600;
import com.cloudframe.app.global.sharedvar.Ip65504DeMapEntry;
import com.cloudframe.app.ip662010.dto.LastSubfldTag800;
import com.cloudframe.app.ip662010.dto.Ip662011ReadParserErrMsgsGroup;
import com.cloudframe.app.ip662010.dto.IpmErrorElementId600;
import com.cloudframe.app.global.sharedvar.Ip000904PdsSubAttrTable;
import com.cloudframe.app.global.sharedvar.Ip000804PdsAttributes;
import com.cloudframe.app.global.sharedvar.Ip65504PdsMapGroup;
import com.cloudframe.app.ip662010.dto.PGroup400;
import com.cloudframe.app.global.sharedvar.Ip65504DeMap;
import com.cloudframe.app.global.sharedvar.Ip000604DeAttrTable;
import com.cloudframe.app.ip662010.dto.CarrierShortRow600;
import com.cloudframe.app.global.sharedvar.Ip65504TcntGroup;
import com.cloudframe.app.global.sharedvar.Ip65504DeMapGroup;
import com.cloudframe.app.ip662010.dto.CharMapColumns600;
import com.cloudframe.app.ip662010.dto.CarrierTooShortValuesGroup600;
import com.cloudframe.app.global.sharedvar.Ip65504SelPdsEntriesAll;
import com.cloudframe.app.global.sharedvar.Ip65504PdsMap;
import com.cloudframe.app.ip662010.dto.NewTag800;
import com.cloudframe.app.ip662010.dto.BadRecLngth600;
import com.cloudframe.app.global.sharedvar.Ip65504TaggedRecordInfo;
import com.cloudframe.app.global.sharedvar.Ip65504MessageStatusGroup;
import com.cloudframe.app.ip662010.dto.TooManyTags600;
import com.cloudframe.app.global.sharedvar.Ip662011ErrSubscriptGroup;
import com.cloudframe.app.ip662010.dto.RemainingCarrLthNumGroup400;
import com.cloudframe.app.ip662010.dto.CurrentTag800;
import com.cloudframe.app.ip662010.dto.ParsingPatternValuesGroup500;


@Context
public class Ip662010Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    TooManyTags600 tooManyTags600;
    CharMapColumns600 charMapColumns600;
    MessageLengthMsg600 messageLengthMsg600;
    LastSubfldTag800 lastSubfldTag800;
    Ip65504TaggedRecordInfo ip65504TaggedRecordInfo;
    Ip65504PdsMapGroup ip65504PdsMapGroup;
    Ip662011ReadParserErrMsgsGroup ip662011ReadParserErrMsgsGroup;
    Ip000704DeSubAttrTable ip000704DeSubAttrTable;
    Ip000608ProcessingDateTimeGroup ip000608ProcessingDateTimeGroup;
    Ip65504CurrentTagTable ip65504CurrentTagTable;
    Ip000904PdsSubAttrTable ip000904PdsSubAttrTable;
    Ip000804PdsAttributes ip000804PdsAttributes;
    Ip65504DeMapGroup ip65504DeMapGroup;
    Ip66102IpmMsg ip66102IpmMsg;
    ParsingPatternValuesGroup500 parsingPatternValuesGroup500;
    CarrierTooShortValuesGroup600 carrierTooShortValuesGroup600;
    Ip66102IpmFileInformation ip66102IpmFileInformation;
    PGroup400 pGroup400;
    Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup;
    Ip65504SelElemEntriesAll ip65504SelElemEntriesAll;
    CurrentTag800 currentTag800;
    Ip65504SelPdsEntriesAll ip65504SelPdsEntriesAll;
    RemainingCarrLthNumGroup400 remainingCarrLthNumGroup400;
    NewTag800 newTag800;
    BadRecLngth600 badRecLngth600;
    UndefinedPds600 undefinedPds600;
    Ip65504TcntGroup ip65504TcntGroup;
    Ip65504MessageStatusGroup ip65504MessageStatusGroup;
    Work work;
    IpmErrorMsg600 ipmErrorMsg600;
    Ip000604DeAttrTable ip000604DeAttrTable;

    int ip000804I;
    int ip65504P;
    int ip65504Max500;
    int ip000704I;
    int ip000904I;
    int ip65504D;
    int ip662011ErrIndex;
    int carrierShortCodeNdx600;
    int maxTagNoX800;
    int ip65504T;
    int ip000604I;

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


    public TooManyTags600 getTooManyTags600() {
        if (tooManyTags600 == null) {
            tooManyTags600 = new TooManyTags600();
        }

        return tooManyTags600;
    }

    public void setTooManyTags600(TooManyTags600 tooManyTags600) {
        this.tooManyTags600 = tooManyTags600;
    }
    public CharMapColumns600 getCharMapColumns600() {
        if (charMapColumns600 == null) {
            charMapColumns600 = new CharMapColumns600();
        }

        return charMapColumns600;
    }

    public void setCharMapColumns600(CharMapColumns600 charMapColumns600) {
        this.charMapColumns600 = charMapColumns600;
    }
    public MessageLengthMsg600 getMessageLengthMsg600() {
        if (messageLengthMsg600 == null) {
            messageLengthMsg600 = new MessageLengthMsg600();
        }

        return messageLengthMsg600;
    }

    public void setMessageLengthMsg600(MessageLengthMsg600 messageLengthMsg600) {
        this.messageLengthMsg600 = messageLengthMsg600;
    }
    public LastSubfldTag800 getLastSubfldTag800() {
        if (lastSubfldTag800 == null) {
            lastSubfldTag800 = new LastSubfldTag800();
        }

        return lastSubfldTag800;
    }

    public void setLastSubfldTag800(LastSubfldTag800 lastSubfldTag800) {
        this.lastSubfldTag800 = lastSubfldTag800;
    }
    public Ip65504TaggedRecordInfo getIp65504TaggedRecordInfo() {
        if (ip65504TaggedRecordInfo == null) {
            ip65504TaggedRecordInfo = globalCtx.getGlobalDto(Ip65504TaggedRecordInfo.class);
        }

        return ip65504TaggedRecordInfo;
    }

    public Ip65504PdsMapGroup getIp65504PdsMapGroup() {
        if (ip65504PdsMapGroup == null) {
            ip65504PdsMapGroup = globalCtx.getGlobalDto(Ip65504PdsMapGroup.class);
        }

        return ip65504PdsMapGroup;
    }

    public Ip662011ReadParserErrMsgsGroup getIp662011ReadParserErrMsgsGroup() {
        if (ip662011ReadParserErrMsgsGroup == null) {
            ip662011ReadParserErrMsgsGroup = new Ip662011ReadParserErrMsgsGroup();
        }

        return ip662011ReadParserErrMsgsGroup;
    }

    public void setIp662011ReadParserErrMsgsGroup(Ip662011ReadParserErrMsgsGroup ip662011ReadParserErrMsgsGroup) {
        this.ip662011ReadParserErrMsgsGroup = ip662011ReadParserErrMsgsGroup;
    }
    public Ip000704DeSubAttrTable getIp000704DeSubAttrTable() {
        if (ip000704DeSubAttrTable == null) {
            ip000704DeSubAttrTable = globalCtx.getGlobalDto(Ip000704DeSubAttrTable.class);
        }

        return ip000704DeSubAttrTable;
    }

    public Ip000608ProcessingDateTimeGroup getIp000608ProcessingDateTimeGroup() {
        if (ip000608ProcessingDateTimeGroup == null) {
            ip000608ProcessingDateTimeGroup = globalCtx.getGlobalDto(Ip000608ProcessingDateTimeGroup.class);
        }

        return ip000608ProcessingDateTimeGroup;
    }

    public Ip65504CurrentTagTable getIp65504CurrentTagTable() {
        if (ip65504CurrentTagTable == null) {
            ip65504CurrentTagTable = globalCtx.getGlobalDto(Ip65504CurrentTagTable.class);
        }

        return ip65504CurrentTagTable;
    }

    public Ip000904PdsSubAttrTable getIp000904PdsSubAttrTable() {
        if (ip000904PdsSubAttrTable == null) {
            ip000904PdsSubAttrTable = globalCtx.getGlobalDto(Ip000904PdsSubAttrTable.class);
        }

        return ip000904PdsSubAttrTable;
    }

    public Ip000804PdsAttributes getIp000804PdsAttributes() {
        if (ip000804PdsAttributes == null) {
            ip000804PdsAttributes = globalCtx.getGlobalDto(Ip000804PdsAttributes.class);
        }

        return ip000804PdsAttributes;
    }

    public Ip65504DeMapGroup getIp65504DeMapGroup() {
        if (ip65504DeMapGroup == null) {
            ip65504DeMapGroup = globalCtx.getGlobalDto(Ip65504DeMapGroup.class);
        }

        return ip65504DeMapGroup;
    }

    public Ip66102IpmMsg getIp66102IpmMsg() {
        if (ip66102IpmMsg == null) {
            ip66102IpmMsg = globalCtx.getGlobalDto(Ip66102IpmMsg.class);
        }

        return ip66102IpmMsg;
    }

    public ParsingPatternValuesGroup500 getParsingPatternValuesGroup500() {
        if (parsingPatternValuesGroup500 == null) {
            parsingPatternValuesGroup500 = new ParsingPatternValuesGroup500();
        }

        return parsingPatternValuesGroup500;
    }

    public void setParsingPatternValuesGroup500(ParsingPatternValuesGroup500 parsingPatternValuesGroup500) {
        this.parsingPatternValuesGroup500 = parsingPatternValuesGroup500;
    }
    public CarrierTooShortValuesGroup600 getCarrierTooShortValuesGroup600() {
        if (carrierTooShortValuesGroup600 == null) {
            carrierTooShortValuesGroup600 = new CarrierTooShortValuesGroup600();
        }

        return carrierTooShortValuesGroup600;
    }

    public void setCarrierTooShortValuesGroup600(CarrierTooShortValuesGroup600 carrierTooShortValuesGroup600) {
        this.carrierTooShortValuesGroup600 = carrierTooShortValuesGroup600;
    }
    public Ip66102IpmFileInformation getIp66102IpmFileInformation() {
        if (ip66102IpmFileInformation == null) {
            ip66102IpmFileInformation = globalCtx.getGlobalDto(Ip66102IpmFileInformation.class);
        }

        return ip66102IpmFileInformation;
    }

    public PGroup400 getPGroup400() {
        if (pGroup400 == null) {
            pGroup400 = new PGroup400();
        }

        return pGroup400;
    }

    public void setPGroup400(PGroup400 pGroup400) {
        this.pGroup400 = pGroup400;
    }
    public Ip662011ErrSubscriptGroup getIp662011ErrSubscriptGroup() {
        if (ip662011ErrSubscriptGroup == null) {
            ip662011ErrSubscriptGroup = globalCtx.getGlobalDto(Ip662011ErrSubscriptGroup.class);
        }

        return ip662011ErrSubscriptGroup;
    }

    public Ip65504SelElemEntriesAll getIp65504SelElemEntriesAll() {
        if (ip65504SelElemEntriesAll == null) {
            ip65504SelElemEntriesAll = globalCtx.getGlobalDto(Ip65504SelElemEntriesAll.class);
        }

        return ip65504SelElemEntriesAll;
    }

    public CurrentTag800 getCurrentTag800() {
        if (currentTag800 == null) {
            currentTag800 = new CurrentTag800();
        }

        return currentTag800;
    }

    public void setCurrentTag800(CurrentTag800 currentTag800) {
        this.currentTag800 = currentTag800;
    }
    public Ip65504SelPdsEntriesAll getIp65504SelPdsEntriesAll() {
        if (ip65504SelPdsEntriesAll == null) {
            ip65504SelPdsEntriesAll = globalCtx.getGlobalDto(Ip65504SelPdsEntriesAll.class);
        }

        return ip65504SelPdsEntriesAll;
    }

    public RemainingCarrLthNumGroup400 getRemainingCarrLthNumGroup400() {
        if (remainingCarrLthNumGroup400 == null) {
            remainingCarrLthNumGroup400 = new RemainingCarrLthNumGroup400();
        }

        return remainingCarrLthNumGroup400;
    }

    public void setRemainingCarrLthNumGroup400(RemainingCarrLthNumGroup400 remainingCarrLthNumGroup400) {
        this.remainingCarrLthNumGroup400 = remainingCarrLthNumGroup400;
    }
    public NewTag800 getNewTag800() {
        if (newTag800 == null) {
            newTag800 = new NewTag800();
        }

        return newTag800;
    }

    public void setNewTag800(NewTag800 newTag800) {
        this.newTag800 = newTag800;
    }
    public BadRecLngth600 getBadRecLngth600() {
        if (badRecLngth600 == null) {
            badRecLngth600 = new BadRecLngth600();
        }

        return badRecLngth600;
    }

    public void setBadRecLngth600(BadRecLngth600 badRecLngth600) {
        this.badRecLngth600 = badRecLngth600;
    }
    public UndefinedPds600 getUndefinedPds600() {
        if (undefinedPds600 == null) {
            undefinedPds600 = new UndefinedPds600();
        }

        return undefinedPds600;
    }

    public void setUndefinedPds600(UndefinedPds600 undefinedPds600) {
        this.undefinedPds600 = undefinedPds600;
    }
    public Ip65504TcntGroup getIp65504TcntGroup() {
        if (ip65504TcntGroup == null) {
            ip65504TcntGroup = globalCtx.getGlobalDto(Ip65504TcntGroup.class);
        }

        return ip65504TcntGroup;
    }

    public Ip65504MessageStatusGroup getIp65504MessageStatusGroup() {
        if (ip65504MessageStatusGroup == null) {
            ip65504MessageStatusGroup = globalCtx.getGlobalDto(Ip65504MessageStatusGroup.class);
        }

        return ip65504MessageStatusGroup;
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
    public IpmErrorMsg600 getIpmErrorMsg600() {
        if (ipmErrorMsg600 == null) {
            ipmErrorMsg600 = new IpmErrorMsg600();
        }

        return ipmErrorMsg600;
    }

    public void setIpmErrorMsg600(IpmErrorMsg600 ipmErrorMsg600) {
        this.ipmErrorMsg600 = ipmErrorMsg600;
    }
    public Ip000604DeAttrTable getIp000604DeAttrTable() {
        if (ip000604DeAttrTable == null) {
            ip000604DeAttrTable = globalCtx.getGlobalDto(Ip000604DeAttrTable.class);
        }

        return ip000604DeAttrTable;
    }


    public int getIp000804I() {
        return ip000804I;
    }

    public void setIp000804I(int ip000804I) {
        this.ip000804I = ip000804I;
    }
    public int getIp65504P() {
        return ip65504P;
    }

    public void setIp65504P(int ip65504P) {
        this.ip65504P = ip65504P;
    }
    public int getIp65504Max500() {
        return ip65504Max500;
    }

    public void setIp65504Max500(int ip65504Max500) {
        this.ip65504Max500 = ip65504Max500;
    }
    public int getIp000704I() {
        return ip000704I;
    }

    public void setIp000704I(int ip000704I) {
        this.ip000704I = ip000704I;
    }
    public int getIp000904I() {
        return ip000904I;
    }

    public void setIp000904I(int ip000904I) {
        this.ip000904I = ip000904I;
    }
    public int getIp65504D() {
        return ip65504D;
    }

    public void setIp65504D(int ip65504D) {
        this.ip65504D = ip65504D;
    }
    public int getIp662011ErrIndex() {
        return ip662011ErrIndex;
    }

    public void setIp662011ErrIndex(int ip662011ErrIndex) {
        this.ip662011ErrIndex = ip662011ErrIndex;
    }
    public int getCarrierShortCodeNdx600() {
        return carrierShortCodeNdx600;
    }

    public void setCarrierShortCodeNdx600(int carrierShortCodeNdx600) {
        this.carrierShortCodeNdx600 = carrierShortCodeNdx600;
    }
    public int getMaxTagNoX800() {
        return maxTagNoX800;
    }

    public void setMaxTagNoX800(int maxTagNoX800) {
        this.maxTagNoX800 = maxTagNoX800;
    }
    public int getIp65504T() {
        return ip65504T;
    }

    public void setIp65504T(int ip65504T) {
        this.ip65504T = ip65504T;
    }
    public int getIp000604I() {
        return ip000604I;
    }

    public void setIp000604I(int ip000604I) {
        this.ip000604I = ip000604I;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tooManyTags600.hashCode();
        str += charMapColumns600.hashCode();
        str += messageLengthMsg600.hashCode();
        str += lastSubfldTag800.hashCode();
        str += ip65504TaggedRecordInfo.hashCode();
        str += ip65504PdsMapGroup.hashCode();
        str += ip662011ReadParserErrMsgsGroup.hashCode();
        str += ip000704DeSubAttrTable.hashCode();
        str += ip000608ProcessingDateTimeGroup.hashCode();
        str += ip65504CurrentTagTable.hashCode();
        str += ip000904PdsSubAttrTable.hashCode();
        str += ip000804PdsAttributes.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip66102IpmMsg.hashCode();
        str += parsingPatternValuesGroup500.hashCode();
        str += carrierTooShortValuesGroup600.hashCode();
        str += ip66102IpmFileInformation.hashCode();
        str += pGroup400.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += ip65504SelElemEntriesAll.hashCode();
        str += currentTag800.hashCode();
        str += ip65504SelPdsEntriesAll.hashCode();
        str += remainingCarrLthNumGroup400.hashCode();
        str += newTag800.hashCode();
        str += badRecLngth600.hashCode();
        str += undefinedPds600.hashCode();
        str += ip65504TcntGroup.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += work.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += ip000604DeAttrTable.hashCode();
       return str.hashCode();
    }

    public Ip662010Ctx clone() {
        Ip662010Ctx cloneObj = new Ip662010Ctx();
        cloneObj.tooManyTags600 = new TooManyTags600();
        cloneObj.tooManyTags600.set(tooManyTags600.getClonedField());
        cloneObj.charMapColumns600 = new CharMapColumns600();
        cloneObj.charMapColumns600.set(charMapColumns600.getClonedField());
        cloneObj.messageLengthMsg600 = new MessageLengthMsg600();
        cloneObj.messageLengthMsg600.set(messageLengthMsg600.getClonedField());
        cloneObj.lastSubfldTag800 = new LastSubfldTag800();
        cloneObj.lastSubfldTag800.set(lastSubfldTag800.getClonedField());
        cloneObj.ip65504TaggedRecordInfo = new Ip65504TaggedRecordInfo();
        cloneObj.ip65504TaggedRecordInfo.set(ip65504TaggedRecordInfo.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        cloneObj.ip662011ReadParserErrMsgsGroup = new Ip662011ReadParserErrMsgsGroup();
        cloneObj.ip662011ReadParserErrMsgsGroup.set(ip662011ReadParserErrMsgsGroup.getClonedField());
        cloneObj.ip000704DeSubAttrTable = new Ip000704DeSubAttrTable();
        cloneObj.ip000704DeSubAttrTable.set(ip000704DeSubAttrTable.getClonedField());
        cloneObj.ip000608ProcessingDateTimeGroup = new Ip000608ProcessingDateTimeGroup();
        cloneObj.ip000608ProcessingDateTimeGroup.set(ip000608ProcessingDateTimeGroup.getClonedField());
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip000904PdsSubAttrTable = new Ip000904PdsSubAttrTable();
        cloneObj.ip000904PdsSubAttrTable.set(ip000904PdsSubAttrTable.getClonedField());
        cloneObj.ip000804PdsAttributes = new Ip000804PdsAttributes();
        cloneObj.ip000804PdsAttributes.set(ip000804PdsAttributes.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.parsingPatternValuesGroup500 = new ParsingPatternValuesGroup500();
        cloneObj.parsingPatternValuesGroup500.set(parsingPatternValuesGroup500.getClonedField());
        cloneObj.carrierTooShortValuesGroup600 = new CarrierTooShortValuesGroup600();
        cloneObj.carrierTooShortValuesGroup600.set(carrierTooShortValuesGroup600.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.pGroup400 = new PGroup400();
        cloneObj.pGroup400.set(pGroup400.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        cloneObj.currentTag800 = new CurrentTag800();
        cloneObj.currentTag800.set(currentTag800.getClonedField());
        cloneObj.ip65504SelPdsEntriesAll = new Ip65504SelPdsEntriesAll();
        cloneObj.ip65504SelPdsEntriesAll.set(ip65504SelPdsEntriesAll.getClonedField());
        cloneObj.remainingCarrLthNumGroup400 = new RemainingCarrLthNumGroup400();
        cloneObj.remainingCarrLthNumGroup400.set(remainingCarrLthNumGroup400.getClonedField());
        cloneObj.newTag800 = new NewTag800();
        cloneObj.newTag800.set(newTag800.getClonedField());
        cloneObj.badRecLngth600 = new BadRecLngth600();
        cloneObj.badRecLngth600.set(badRecLngth600.getClonedField());
        cloneObj.undefinedPds600 = new UndefinedPds600();
        cloneObj.undefinedPds600.set(undefinedPds600.getClonedField());
        cloneObj.ip65504TcntGroup = new Ip65504TcntGroup();
        cloneObj.ip65504TcntGroup.set(ip65504TcntGroup.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip662010Ctx.this.getIp66102IpmFileInformation();
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     Ip662011ReadParserErrMsgsGroup ip662011ReadParserErrMsgsGroup = Ip662010Ctx.this.getIp662011ReadParserErrMsgsGroup();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();

	/**
	 *	Test condition "Y" for isItIsTheFirstTime88()
	 *	@return  Returns true if isItIsTheFirstTime88() is "Y"
	 */
   public boolean isItIsTheFirstTime88() throws CFException {
      return work.isItIsTheFirstTime88();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsTheFirstTime88True()  throws CFException{  			
    	work.setItIsTheFirstTime88True();
   	}
	/**
	 *	Returns the value of eofMessage300
	 *	@return eofMessage300
	 */
   public char[] getEofMessage300() throws CFException  {              
   		return work.getEofMessage300();
   }

  
	/**
	*  set variable eofMessage300
	*  @param value
	**/
   public void setEofMessage300(char[] value) throws CFException {
      work.setEofMessage300(value);
   } 

	/**
	 *	Returns the value of readParserChop300
	 *	@return readParserChop300
	 */
   public char[] getReadParserChop300() throws CFException  {              
   		return work.getReadParserChop300();
   }

  
	/**
	*  set variable readParserChop300
	*  @param value
	**/
   public void setReadParserChop300(char[] value) throws CFException {
      work.setReadParserChop300(value);
   } 

	/**
	 *	Returns the value of writeParserChop300
	 *	@return writeParserChop300
	 */
   public char[] getWriteParserChop300() throws CFException  {              
   		return work.getWriteParserChop300();
   }

  
	/**
	*  set variable writeParserChop300
	*  @param value
	**/
   public void setWriteParserChop300(char[] value) throws CFException {
      work.setWriteParserChop300(value);
   } 


public void setIp662011ErrIndex(int ip662011ErrIndex) { 
    Ip662010Ctx.this.ip662011ErrIndex = ip662011ErrIndex;
}

public int getIp662011ErrIndex() { 
    return Ip662010Ctx.this.ip662011ErrIndex;
}
	/**
	 *	Returns the value of ip662011ErrSubscript
	 *	@return ip662011ErrSubscript
	 */
	public int getIp662011ErrSubscript() throws CFException {        
   		return ip662011ErrSubscriptGroup.getIp662011ErrSubscript();
	}
	
	/**
	 * 	Update Ip662011ErrSubscript with the passed value
	 *	@param number
	 */
	public void setIp662011ErrSubscript(int number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript(number);
	}


	public void setIp662011ErrSubscript(long number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript((int)number);
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
	 *	Returns the value of ptrIp661020800
	 *	@return ptrIp661020800
	 */
   public char[] getPtrIp661020800() throws CFException  {              
   		return work.getPtrIp661020800();
   }

  
	/**
	*  set variable ptrIp661020800
	*  @param value
	**/
   public void setPtrIp661020800(char[] value) throws CFException {
      work.setPtrIp661020800(value);
   } 

	/**
	 *	Returns the value of ip66102TagStart
	 *	@return ip66102TagStart
	 */
	public long getIp66102TagStart() throws CFException {        
   		return ip66102IpmMsg.getIp66102NormalIpmMsgRedefined().getIp66102TagStart();
	}
	
	/**
	 * 	Update Ip66102TagStart with the passed value
	 *	@param number
	 */
	public void setIp66102TagStart(long number)  throws CFException{
		ip66102IpmMsg.getIp66102NormalIpmMsgRedefined().setIp66102TagStart(number);
	}



	/**
	 *	Test condition "!" for isIp66102TagTableIsPresent()
	 *	@return  Returns true if isIp66102TagTableIsPresent() is "!"
	 */
   public boolean isIp66102TagTableIsPresent() throws CFException {
      return ip66102IpmMsg.getIp66102NormalIpmMsgRedefined().isIp66102TagTableIsPresent();
   }

	/**
	*  set values "!"
	*/
   	public void setIp66102TagTableIsPresentTrue()  throws CFException{  			
    	ip66102IpmMsg.getIp66102NormalIpmMsgRedefined().setIp66102TagTableIsPresentTrue();
   	}
	/**
	 *	Returns the value of ipmUpdaterChop300
	 *	@return ipmUpdaterChop300
	 */
   public char[] getIpmUpdaterChop300() throws CFException  {              
   		return work.getIpmUpdaterChop300();
   }

  
	/**
	*  set variable ipmUpdaterChop300
	*  @param value
	**/
   public void setIpmUpdaterChop300(char[] value) throws CFException {
      work.setIpmUpdaterChop300(value);
   } 

	/**
	 *	Returns the value of ip662011ReadParserMsg
	 *	@return ip662011ReadParserMsg
	 */
   public char[] getIp662011ReadParserMsg(int index) throws CFException  {              
   		return ip662011ReadParserErrMsgsGroup.getIp662011ReadParserErrMsgsRedefined().getIp662011ReadParserMsg(index);
   }

  
	/**
	*  set variable ip662011ReadParserMsg
	*  @param value
	**/
   public void setIp662011ReadParserMsg(int index,char[] value) throws CFException {
      ip662011ReadParserErrMsgsGroup.getIp662011ReadParserErrMsgsRedefined().setIp662011ReadParserMsg((index),value);
   } 

	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of ip65504MessageStatus
	 *	@return ip65504MessageStatus
	 */
	public short getIp65504MessageStatus() throws CFException {        
   		return ip65504MessageStatusGroup.getIp65504MessageStatus();
	}
	
	/**
	 * 	Update Ip65504MessageStatus with the passed value
	 *	@param number
	 */
	public void setIp65504MessageStatus(short number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus(number);
	}

	public void setIp65504MessageStatus(int number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}

	public void setIp65504MessageStatus(long number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmFileInformation.hashCode();
        str += ip65504CurrentTagTable.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ip662011ReadParserErrMsgsGroup.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ip662011ReadParserErrMsgsGroup = new Ip662011ReadParserErrMsgsGroup();
        cloneObj.ip662011ReadParserErrMsgsGroup.set(ip662011ReadParserErrMsgsGroup.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip662010Ctx.this.getIp66102IpmFileInformation();
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     Ip662011ReadParserErrMsgsGroup ip662011ReadParserErrMsgsGroup = Ip662010Ctx.this.getIp662011ReadParserErrMsgsGroup();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of readParserChop300
	 *	@return readParserChop300
	 */
   public char[] getReadParserChop300() throws CFException  {              
   		return work.getReadParserChop300();
   }

  
	/**
	*  set variable readParserChop300
	*  @param value
	**/
   public void setReadParserChop300(char[] value) throws CFException {
      work.setReadParserChop300(value);
   } 


public void setIp662011ErrIndex(int ip662011ErrIndex) { 
    Ip662010Ctx.this.ip662011ErrIndex = ip662011ErrIndex;
}

public int getIp662011ErrIndex() { 
    return Ip662010Ctx.this.ip662011ErrIndex;
}
	/**
	 *	Test condition "N" for isIp66102WeGotAMsg()
	 *	@return  Returns true if isIp66102WeGotAMsg() is "N"
	 */
   public boolean isIp66102WeGotAMsg() throws CFException {
      return ip66102IpmFileInformation.isIp66102WeGotAMsg();
   }

	/**
	*  set values "N"
	*/
   	public void setIp66102WeGotAMsgTrue()  throws CFException{  			
    	ip66102IpmFileInformation.setIp66102WeGotAMsgTrue();
   	}
	/**
	 *	Test condition "00" for isIp66102IpmIoWasGood()
	 *	@return  Returns true if isIp66102IpmIoWasGood() is "00"
	 */
   public boolean isIp66102IpmIoWasGood() throws CFException {
      return ip66102IpmFileInformation.isIp66102IpmIoWasGood();
   }

	/**
	*  set values "00"
	*/
   	public void setIp66102IpmIoWasGoodTrue()  throws CFException{  			
    	ip66102IpmFileInformation.setIp66102IpmIoWasGoodTrue();
   	}
	/**
	 *	Returns the value of ip65504TagStatus
	 *	@return ip65504TagStatus
	 */
   public char[] getIp65504TagStatus(int index) throws CFException  {              
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagStatus();
   }

  
	/**
	*  set variable ip65504TagStatus
	*  @param value
	**/
   public void setIp65504TagStatus(int index,char[] value) throws CFException {
      ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStatus(value);
   } 

     /**
	 * 	Update Ip65504TagStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp65504TagStatus(int index,char[] source, int sourceIndex) throws CFException {
      ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStatus(source, sourceIndex);
   	
   }
   
   public void setIp65504TagStatus(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip65504TagStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp65504TagStatus(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip65504TagStatus with another Field
	 *	@param value
	 */
   public void setIp65504TagStatus(int index,Field source) {
      ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStatus(source);
   }  
   
     /**
	 * 	Update Ip65504TagStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp65504TagStatus(int index,Field source, int sourceIndex,int sourceLen) {
      ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip65504TagStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp65504TagStatus(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmFileInformation.hashCode();
        str += ip65504CurrentTagTable.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ip662011ReadParserErrMsgsGroup.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ip662011ReadParserErrMsgsGroup = new Ip662011ReadParserErrMsgsGroup();
        cloneObj.ip662011ReadParserErrMsgsGroup.set(ip662011ReadParserErrMsgsGroup.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class DoFirstTimeSetupInCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     TooManyTags600 tooManyTags600 = Ip662010Ctx.this.getTooManyTags600();
     Ip65504TcntGroup ip65504TcntGroup = Ip662010Ctx.this.getIp65504TcntGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504TaggedRecordInfo ip65504TaggedRecordInfo = Ip662010Ctx.this.getIp65504TaggedRecordInfo();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip662010Ctx.this.getIp65504PdsMapGroup();

	/**
	 *	Returns the value of ip65504CurrentTagTable
	 *	@return ip65504CurrentTagTable
	 */   
	 public Ip65504CurrentTagTable getIp65504CurrentTagTable() {
   	return ip65504CurrentTagTable;
   }


	/**
	 *	Returns the value of loadT8T9300
	 *	@return loadT8T9300
	 */
   public char[] getLoadT8T9300() throws CFException  {              
   		return work.getLoadT8T9300();
   }

  
	/**
	*  set variable loadT8T9300
	*  @param value
	**/
   public void setLoadT8T9300(char[] value) throws CFException {
      work.setLoadT8T9300(value);
   } 

	/**
	 *	Returns the value of ip65504PdsMapEntry
	 *	@return ip65504PdsMapEntry
	 */   
	 public Ip65504PdsMapEntry getIp65504PdsMapEntry(int index) {
   	return ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index);
   }

    public List<Ip65504PdsMapEntry> getIp65504PdsMapEntry() {
        return ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry();
    }
   /**
	* 	Update Ip65504PdsMapEntry with the passed value
	*	@param value
	*/
   public void setIp65504PdsMapEntry(int index,char[] value) throws CFException {
      ip65504PdsMapGroup.getIp65504PdsMap().setIp65504PdsMapEntry((index),value);
   }   


	/**
	 *	Returns the value of loadT6T7300
	 *	@return loadT6T7300
	 */
   public char[] getLoadT6T7300() throws CFException  {              
   		return work.getLoadT6T7300();
   }

  
	/**
	*  set variable loadT6T7300
	*  @param value
	**/
   public void setLoadT6T7300(char[] value) throws CFException {
      work.setLoadT6T7300(value);
   } 

	/**
	 *	Returns the value of ip65504PdsMap
	 *	@return ip65504PdsMap
	 */   
	 public Ip65504PdsMap getIp65504PdsMap() {
   	return ip65504PdsMapGroup.getIp65504PdsMap();
   }

   /**
	* 	Update Ip65504PdsMap with the passed value
	*	@param value
	*/
   public void setIp65504PdsMap(char[] value) throws CFException {
      ip65504PdsMapGroup.setIp65504PdsMap(value);
   }   

     /**
	 * 	Update Ip65504PdsMap 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp65504PdsMap(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip65504PdsMapGroup.setIp65504PdsMap(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip65504PdsMap 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp65504PdsMap(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip65504PdsMapGroup.setIp65504PdsMap(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip65504PdsMap with another Field
	 *	@param value
	 */
   public void setIp65504PdsMap(Field source) {
   	ip65504PdsMapGroup.setIp65504PdsMap(source);
   }  
   
     /**
	 * 	Update Ip65504PdsMap 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp65504PdsMap(Field source, int sourceIndex,int sourceLen) {
   	ip65504PdsMapGroup.setIp65504PdsMap(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip65504PdsMap 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp65504PdsMap(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip65504PdsMapGroup.setIp65504PdsMap(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of readApi300
	 *	@return readApi300
	 */
   public char[] getReadApi300() throws CFException  {              
   		return work.getReadApi300();
   }

  
	/**
	*  set variable readApi300
	*  @param value
	**/
   public void setReadApi300(char[] value) throws CFException {
      work.setReadApi300(value);
   } 

	/**
	 *	Returns the value of ip65504TagArea
	 *	@return ip65504TagArea
	 */   
	 public Ip65504TagArea getIp65504TagArea(int index) {
   	return ip65504CurrentTagTable.getIp65504TagArea(index);
   }

    public List<Ip65504TagArea> getIp65504TagArea() {
        return ip65504CurrentTagTable.getIp65504TagArea();
    }
   /**
	* 	Update Ip65504TagArea with the passed value
	*	@param value
	*/
   public void setIp65504TagArea(int index,char[] value) throws CFException {
      ip65504CurrentTagTable.setIp65504TagArea((index),value);
   }   



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public DoFirstTimeSetupOutCtx getDoFirstTimeSetupOutCtx() {
            return new DoFirstTimeSetupOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += tooManyTags600.hashCode();
        str += ip65504TcntGroup.hashCode();
        str += work.hashCode();
        str += ip65504TaggedRecordInfo.hashCode();
        str += ip65504PdsMapGroup.hashCode();
       return str.hashCode();
    }

    public DoFirstTimeSetupInCtx clone() {
        DoFirstTimeSetupInCtx cloneObj = new DoFirstTimeSetupInCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.tooManyTags600 = new TooManyTags600();
        cloneObj.tooManyTags600.set(tooManyTags600.getClonedField());
        cloneObj.ip65504TcntGroup = new Ip65504TcntGroup();
        cloneObj.ip65504TcntGroup.set(ip65504TcntGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504TaggedRecordInfo = new Ip65504TaggedRecordInfo();
        cloneObj.ip65504TaggedRecordInfo.set(ip65504TaggedRecordInfo.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        return cloneObj;
    }

    }

    public DoFirstTimeSetupInCtx getDoFirstTimeSetupInCtx() {
            return new DoFirstTimeSetupInCtx();
    }
     public class DoFirstTimeSetupOutCtx implements Cloneable {
     TooManyTags600 tooManyTags600 = Ip662010Ctx.this.getTooManyTags600();
     Ip65504TcntGroup ip65504TcntGroup = Ip662010Ctx.this.getIp65504TcntGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504TaggedRecordInfo ip65504TaggedRecordInfo = Ip662010Ctx.this.getIp65504TaggedRecordInfo();

	/**
	 *	Returns the value of badMessageCount400
	 *	@return badMessageCount400
	 */
	public short getBadMessageCount400() throws CFException {        
   		return work.getBadMessageCount400();
	}
	
	/**
	 * 	Update BadMessageCount400 with the passed value
	 *	@param number
	 */
	public void setBadMessageCount400(short number)  throws CFException{
		work.setBadMessageCount400(number);
	}

	public void setBadMessageCount400(int number)  throws CFException{
		work.setBadMessageCount400((short)number);
	}

	public void setBadMessageCount400(long number)  throws CFException{
		work.setBadMessageCount400((short)number);
	}



	/**
	 *	Returns the value of ip65504IsFileTagged
	 *	@return ip65504IsFileTagged
	 */
   public char[] getIp65504IsFileTagged() throws CFException  {              
   		return ip65504TaggedRecordInfo.getIp65504IsFileTagged();
   }

  
	/**
	*  set variable ip65504IsFileTagged
	*  @param value
	**/
   public void setIp65504IsFileTagged(char[] value) throws CFException {
      ip65504TaggedRecordInfo.setIp65504IsFileTagged(value);
   } 

     /**
	 * 	Update Ip65504IsFileTagged 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp65504IsFileTagged(char[] source, int sourceIndex) throws CFException {
      ip65504TaggedRecordInfo.setIp65504IsFileTagged(source, sourceIndex);
   	
   }
   
   public void setIp65504IsFileTagged(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip65504TaggedRecordInfo.setIp65504IsFileTagged(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip65504IsFileTagged 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp65504IsFileTagged(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip65504TaggedRecordInfo.setIp65504IsFileTagged(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip65504IsFileTagged with another Field
	 *	@param value
	 */
   public void setIp65504IsFileTagged(Field source) {
      ip65504TaggedRecordInfo.setIp65504IsFileTagged(source);
   }  
   
     /**
	 * 	Update Ip65504IsFileTagged 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp65504IsFileTagged(Field source, int sourceIndex,int sourceLen) {
      ip65504TaggedRecordInfo.setIp65504IsFileTagged(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip65504IsFileTagged 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp65504IsFileTagged(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip65504TaggedRecordInfo.setIp65504IsFileTagged(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of maxTagNo600
	 *	@return maxTagNo600
	 */
	public int getMaxTagNo600() throws CFException {
   		return tooManyTags600.getMaxTagNo600();
	}


	/**
	 *	Returns String value of maxTagNo600
	 *	@return maxTagNo600
	 */
	public char[]  getMaxTagNo600String() throws CFException {
	     return String.valueOf(tooManyTags600.getMaxTagNo600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maxTagNo600IsNumeric()  throws CFException{
	    return tooManyTags600.maxTagNo600IsNumeric();
	}

	/**
	 * 	Update MaxTagNo600 with the passed value
	 *	@param number
	 */
	public void setMaxTagNo600(int number)  throws CFException{
		tooManyTags600.setMaxTagNo600(number);
	}
	

	public void setMaxTagNo600(long number)  throws CFException{
	    tooManyTags600.setMaxTagNo600(number);
	}
	
	
	/**
	 * 	Update MaxTagNo600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaxTagNo600(char[] value)  throws CFException {
		tooManyTags600.setMaxTagNo600(value);
	}
	
	/**
	 * 	Update MaxTagNo600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaxTagNo600String(char[] value)  throws CFException{
		tooManyTags600.setMaxTagNo600(value);
	}	

	/**
	 *	Returns the value of ptrIp741010800
	 *	@return ptrIp741010800
	 */
   public char[] getPtrIp741010800() throws CFException  {              
   		return work.getPtrIp741010800();
   }

  
	/**
	*  set variable ptrIp741010800
	*  @param value
	**/
   public void setPtrIp741010800(char[] value) throws CFException {
      work.setPtrIp741010800(value);
   } 

	/**
	 *	Returns the value of maxPdsNo800
	 *	@return maxPdsNo800
	 */
	public short getMaxPdsNo800() throws CFException {        
   		return work.getMaxPdsNo800();
	}
	
	/**
	 * 	Update MaxPdsNo800 with the passed value
	 *	@param number
	 */
	public void setMaxPdsNo800(short number)  throws CFException{
		work.setMaxPdsNo800(number);
	}

	public void setMaxPdsNo800(int number)  throws CFException{
		work.setMaxPdsNo800((short)number);
	}

	public void setMaxPdsNo800(long number)  throws CFException{
		work.setMaxPdsNo800((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of isItTheFirstTime100
	 *	@return isItTheFirstTime100
	 */
   public char[] getIsItTheFirstTime100() throws CFException  {              
   		return work.getIsItTheFirstTime100();
   }

  
	/**
	*  set variable isItTheFirstTime100
	*  @param value
	**/
   public void setIsItTheFirstTime100(char[] value) throws CFException {
      work.setIsItTheFirstTime100(value);
   } 

	/**
	 *	Returns the value of maxTagNo800
	 *	@return maxTagNo800
	 */
	public short getMaxTagNo800() throws CFException {        
   		return work.getMaxTagNo800();
	}
	
	/**
	 * 	Update MaxTagNo800 with the passed value
	 *	@param number
	 */
	public void setMaxTagNo800(short number)  throws CFException{
		work.setMaxTagNo800(number);
	}

	public void setMaxTagNo800(int number)  throws CFException{
		work.setMaxTagNo800((short)number);
	}

	public void setMaxTagNo800(long number)  throws CFException{
		work.setMaxTagNo800((short)number);
	}



	/**
	 *	Returns the value of ptrIp661020800
	 *	@return ptrIp661020800
	 */
   public char[] getPtrIp661020800() throws CFException  {              
   		return work.getPtrIp661020800();
   }

  
	/**
	*  set variable ptrIp661020800
	*  @param value
	**/
   public void setPtrIp661020800(char[] value) throws CFException {
      work.setPtrIp661020800(value);
   } 

	/**
	 *	Returns the value of ip65504Tcnt
	 *	@return ip65504Tcnt
	 */
	public short getIp65504Tcnt() throws CFException {        
   		return ip65504TcntGroup.getIp65504Tcnt();
	}
	
	/**
	 * 	Update Ip65504Tcnt with the passed value
	 *	@param number
	 */
	public void setIp65504Tcnt(short number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt(number);
	}

	public void setIp65504Tcnt(int number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt((short)number);
	}

	public void setIp65504Tcnt(long number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt((short)number);
	}



	/**
	 *	Returns the value of ptrIp739010800
	 *	@return ptrIp739010800
	 */
   public char[] getPtrIp739010800() throws CFException  {              
   		return work.getPtrIp739010800();
   }

  
	/**
	*  set variable ptrIp739010800
	*  @param value
	**/
   public void setPtrIp739010800(char[] value) throws CFException {
      work.setPtrIp739010800(value);
   } 

	/**
	 *	Returns the value of maxTagNoX800
	 *	@return maxTagNoX800
	 */
	public int getMaxTagNoX800() throws CFException {        
   		return maxTagNoX800;
	}
	
	/**
	 * 	Update MaxTagNoX800 with the passed value
	 *	@param number
	 */
	public void setMaxTagNoX800(int number)  throws CFException{
		Ip662010Ctx.this.setMaxTagNoX800(number);
	}


	public void setMaxTagNoX800(long number)  throws CFException{
		Ip662010Ctx.this.setMaxTagNoX800((int)number);
	}



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tooManyTags600.hashCode();
        str += ip65504TcntGroup.hashCode();
        str += work.hashCode();
        str += ip65504TaggedRecordInfo.hashCode();
       return str.hashCode();
    }

    public DoFirstTimeSetupOutCtx clone() {
        DoFirstTimeSetupOutCtx cloneObj = new DoFirstTimeSetupOutCtx();
        cloneObj.tooManyTags600 = new TooManyTags600();
        cloneObj.tooManyTags600.set(tooManyTags600.getClonedField());
        cloneObj.ip65504TcntGroup = new Ip65504TcntGroup();
        cloneObj.ip65504TcntGroup.set(ip65504TcntGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504TaggedRecordInfo = new Ip65504TaggedRecordInfo();
        cloneObj.ip65504TaggedRecordInfo.set(ip65504TaggedRecordInfo.getClonedField());
        return cloneObj;
    }

    }

    public DoFirstTimeSetupOutCtx getDoFirstTimeSetupOutCtx() {
            return new DoFirstTimeSetupOutCtx();
    }
     public class GetTimestampForTablesOutCtx implements Cloneable {
     Ip000608ProcessingDateTimeGroup ip000608ProcessingDateTimeGroup = Ip662010Ctx.this.getIp000608ProcessingDateTimeGroup();

	/**
	 *	Returns the value of ip000608ProcessingDateTime
	 *	@return ip000608ProcessingDateTime
	 */
   public char[] getIp000608ProcessingDateTime() throws CFException  {              
   		return ip000608ProcessingDateTimeGroup.getIp000608ProcessingDateTime();
   }

  
	/**
	*  set variable ip000608ProcessingDateTime
	*  @param value
	**/
   public void setIp000608ProcessingDateTime(char[] value) throws CFException {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(value);
   } 

     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex) throws CFException {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex);
   	
   }
   
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip000608ProcessingDateTime with another Field
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source);
   }  
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip000608ProcessingDateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000608ProcessingDateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip000608ProcessingDateTimeGroup.hashCode();
       return str.hashCode();
    }

    public GetTimestampForTablesOutCtx clone() {
        GetTimestampForTablesOutCtx cloneObj = new GetTimestampForTablesOutCtx();
        cloneObj.ip000608ProcessingDateTimeGroup = new Ip000608ProcessingDateTimeGroup();
        cloneObj.ip000608ProcessingDateTimeGroup.set(ip000608ProcessingDateTimeGroup.getClonedField());
        return cloneObj;
    }

    }

    public GetTimestampForTablesOutCtx getGetTimestampForTablesOutCtx() {
            return new GetTimestampForTablesOutCtx();
    }
     public class InitializeParsingAreasOutCtx implements Cloneable {
     Ip65504TcntGroup ip65504TcntGroup = Ip662010Ctx.this.getIp65504TcntGroup();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     Ip65504SelPdsEntriesAll ip65504SelPdsEntriesAll = Ip662010Ctx.this.getIp65504SelPdsEntriesAll();

	/**
	 *	Returns the value of ip65504MessageStatus
	 *	@return ip65504MessageStatus
	 */
	public short getIp65504MessageStatus() throws CFException {        
   		return ip65504MessageStatusGroup.getIp65504MessageStatus();
	}
	
	/**
	 * 	Update Ip65504MessageStatus with the passed value
	 *	@param number
	 */
	public void setIp65504MessageStatus(short number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus(number);
	}

	public void setIp65504MessageStatus(int number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}

	public void setIp65504MessageStatus(long number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}



	/**
	 *	Returns the value of ip65504SelPdsEntriesAll
	 *	@return ip65504SelPdsEntriesAll
	 */   
	 public Ip65504SelPdsEntriesAll getIp65504SelPdsEntriesAll() {
   	return ip65504SelPdsEntriesAll;
   }


	/**
	 *	Returns the value of ip65504Tcnt
	 *	@return ip65504Tcnt
	 */
	public short getIp65504Tcnt() throws CFException {        
   		return ip65504TcntGroup.getIp65504Tcnt();
	}
	
	/**
	 * 	Update Ip65504Tcnt with the passed value
	 *	@param number
	 */
	public void setIp65504Tcnt(short number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt(number);
	}

	public void setIp65504Tcnt(int number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt((short)number);
	}

	public void setIp65504Tcnt(long number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504TcntGroup.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ip65504SelPdsEntriesAll.hashCode();
       return str.hashCode();
    }

    public InitializeParsingAreasOutCtx clone() {
        InitializeParsingAreasOutCtx cloneObj = new InitializeParsingAreasOutCtx();
        cloneObj.ip65504TcntGroup = new Ip65504TcntGroup();
        cloneObj.ip65504TcntGroup.set(ip65504TcntGroup.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ip65504SelPdsEntriesAll = new Ip65504SelPdsEntriesAll();
        cloneObj.ip65504SelPdsEntriesAll.set(ip65504SelPdsEntriesAll.getClonedField());
        return cloneObj;
    }

    }

    public InitializeParsingAreasOutCtx getInitializeParsingAreasOutCtx() {
            return new InitializeParsingAreasOutCtx();
    }
     public class MoveLowValuesInCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip65504TcntGroup ip65504TcntGroup = Ip662010Ctx.this.getIp65504TcntGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();
     Ip65504TaggedRecordInfo ip65504TaggedRecordInfo = Ip662010Ctx.this.getIp65504TaggedRecordInfo();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip662010Ctx.this.getIp65504PdsMapGroup();

	/**
	 *	Returns the value of ip65504CurrentTagTable
	 *	@return ip65504CurrentTagTable
	 */   
	 public Ip65504CurrentTagTable getIp65504CurrentTagTable() {
   	return ip65504CurrentTagTable;
   }


	/**
	 *	Returns the value of ip65504Tcnt
	 *	@return ip65504Tcnt
	 */
	public short getIp65504Tcnt() throws CFException {        
   		return ip65504TcntGroup.getIp65504Tcnt();
	}
	
	/**
	 * 	Update Ip65504Tcnt with the passed value
	 *	@param number
	 */
	public void setIp65504Tcnt(short number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt(number);
	}

	public void setIp65504Tcnt(int number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt((short)number);
	}

	public void setIp65504Tcnt(long number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt((short)number);
	}



	/**
	 *	Returns the value of tableLen800
	 *	@return tableLen800
	 */
	public short getTableLen800() throws CFException {        
   		return work.getTableLen800();
	}
	
	/**
	 * 	Update TableLen800 with the passed value
	 *	@param number
	 */
	public void setTableLen800(short number)  throws CFException{
		work.setTableLen800(number);
	}

	public void setTableLen800(int number)  throws CFException{
		work.setTableLen800((short)number);
	}

	public void setTableLen800(long number)  throws CFException{
		work.setTableLen800((short)number);
	}



	/**
	 *	Returns the value of ip65504TagArea
	 *	@return ip65504TagArea
	 */   
	 public Ip65504TagArea getIp65504TagArea(int index) {
   	return ip65504CurrentTagTable.getIp65504TagArea(index);
   }

    public List<Ip65504TagArea> getIp65504TagArea() {
        return ip65504CurrentTagTable.getIp65504TagArea();
    }
   /**
	* 	Update Ip65504TagArea with the passed value
	*	@param value
	*/
   public void setIp65504TagArea(int index,char[] value) throws CFException {
      ip65504CurrentTagTable.setIp65504TagArea((index),value);
   }   



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public MoveLowValuesOutCtx getMoveLowValuesOutCtx() {
            return new MoveLowValuesOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip65504TcntGroup.hashCode();
        str += work.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip65504TaggedRecordInfo.hashCode();
        str += ip65504PdsMapGroup.hashCode();
       return str.hashCode();
    }

    public MoveLowValuesInCtx clone() {
        MoveLowValuesInCtx cloneObj = new MoveLowValuesInCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip65504TcntGroup = new Ip65504TcntGroup();
        cloneObj.ip65504TcntGroup.set(ip65504TcntGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip65504TaggedRecordInfo = new Ip65504TaggedRecordInfo();
        cloneObj.ip65504TaggedRecordInfo.set(ip65504TaggedRecordInfo.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        return cloneObj;
    }

    }

    public MoveLowValuesInCtx getMoveLowValuesInCtx() {
            return new MoveLowValuesInCtx();
    }
     public class MoveLowValuesOutCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip65504TcntGroup ip65504TcntGroup = Ip662010Ctx.this.getIp65504TcntGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();
     Ip65504TaggedRecordInfo ip65504TaggedRecordInfo = Ip662010Ctx.this.getIp65504TaggedRecordInfo();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip662010Ctx.this.getIp65504PdsMapGroup();

	/**
	 *	Returns the value of ip65504CurrentTagTable
	 *	@return ip65504CurrentTagTable
	 */   
	 public Ip65504CurrentTagTable getIp65504CurrentTagTable() {
   	return ip65504CurrentTagTable;
   }


	/**
	 *	Returns the value of ip65504PdsMap
	 *	@return ip65504PdsMap
	 */   
	 public Ip65504PdsMap getIp65504PdsMap() {
   	return ip65504PdsMapGroup.getIp65504PdsMap();
   }

   /**
	* 	Update Ip65504PdsMap with the passed value
	*	@param value
	*/
   public void setIp65504PdsMap(char[] value) throws CFException {
      ip65504PdsMapGroup.setIp65504PdsMap(value);
   }   

     /**
	 * 	Update Ip65504PdsMap 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp65504PdsMap(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip65504PdsMapGroup.setIp65504PdsMap(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip65504PdsMap 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp65504PdsMap(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip65504PdsMapGroup.setIp65504PdsMap(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip65504PdsMap with another Field
	 *	@param value
	 */
   public void setIp65504PdsMap(Field source) {
   	ip65504PdsMapGroup.setIp65504PdsMap(source);
   }  
   
     /**
	 * 	Update Ip65504PdsMap 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp65504PdsMap(Field source, int sourceIndex,int sourceLen) {
   	ip65504PdsMapGroup.setIp65504PdsMap(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip65504PdsMap 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp65504PdsMap(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip65504PdsMapGroup.setIp65504PdsMap(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504TaggedRecordInfo
	 *	@return ip65504TaggedRecordInfo
	 */   
	 public Ip65504TaggedRecordInfo getIp65504TaggedRecordInfo() {
   	return ip65504TaggedRecordInfo;
   }


	/**
	 *	Returns the value of ip65504DeMap
	 *	@return ip65504DeMap
	 */   
	 public Ip65504DeMap getIp65504DeMap() {
   	return ip65504DeMapGroup.getIp65504DeMap();
   }

   /**
	* 	Update Ip65504DeMap with the passed value
	*	@param value
	*/
   public void setIp65504DeMap(char[] value) throws CFException {
      ip65504DeMapGroup.setIp65504DeMap(value);
   }   

     /**
	 * 	Update Ip65504DeMap 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp65504DeMap(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip65504DeMapGroup.setIp65504DeMap(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip65504DeMap 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp65504DeMap(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip65504DeMapGroup.setIp65504DeMap(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip65504DeMap with another Field
	 *	@param value
	 */
   public void setIp65504DeMap(Field source) {
   	ip65504DeMapGroup.setIp65504DeMap(source);
   }  
   
     /**
	 * 	Update Ip65504DeMap 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp65504DeMap(Field source, int sourceIndex,int sourceLen) {
   	ip65504DeMapGroup.setIp65504DeMap(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip65504DeMap 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp65504DeMap(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip65504DeMapGroup.setIp65504DeMap(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tableLen800
	 *	@return tableLen800
	 */
	public short getTableLen800() throws CFException {        
   		return work.getTableLen800();
	}
	
	/**
	 * 	Update TableLen800 with the passed value
	 *	@param number
	 */
	public void setTableLen800(short number)  throws CFException{
		work.setTableLen800(number);
	}

	public void setTableLen800(int number)  throws CFException{
		work.setTableLen800((short)number);
	}

	public void setTableLen800(long number)  throws CFException{
		work.setTableLen800((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip65504TcntGroup.hashCode();
        str += work.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip65504TaggedRecordInfo.hashCode();
        str += ip65504PdsMapGroup.hashCode();
       return str.hashCode();
    }

    public MoveLowValuesOutCtx clone() {
        MoveLowValuesOutCtx cloneObj = new MoveLowValuesOutCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip65504TcntGroup = new Ip65504TcntGroup();
        cloneObj.ip65504TcntGroup.set(ip65504TcntGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip65504TaggedRecordInfo = new Ip65504TaggedRecordInfo();
        cloneObj.ip65504TaggedRecordInfo.set(ip65504TaggedRecordInfo.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        return cloneObj;
    }

    }

    public MoveLowValuesOutCtx getMoveLowValuesOutCtx() {
            return new MoveLowValuesOutCtx();
    }
     public class ParseTheMessageInCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     Ip65504TcntGroup ip65504TcntGroup = Ip662010Ctx.this.getIp65504TcntGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     Ip65504SelElemEntriesAll ip65504SelElemEntriesAll = Ip662010Ctx.this.getIp65504SelElemEntriesAll();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();

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
	 *	Returns the value of ip65504SelElemEntriesAll
	 *	@return ip65504SelElemEntriesAll
	 */   
	 public Ip65504SelElemEntriesAll getIp65504SelElemEntriesAll() {
   	return ip65504SelElemEntriesAll;
   }


	/**
	 *	Returns the value of missingBitMapNdx600
	 *	@return missingBitMapNdx600
	 */
	public int getMissingBitMapNdx600() throws CFException {        
   		return work.getMissingBitMapNdx600();
	}
	
	/**
	 * 	Update MissingBitMapNdx600 with the passed value
	 *	@param number
	 */
	public void setMissingBitMapNdx600(int number)  throws CFException{
		work.setMissingBitMapNdx600(number);
	}


	public void setMissingBitMapNdx600(long number)  throws CFException{
		work.setMissingBitMapNdx600((int)number);
	}


	/**
	 *	Returns the value of missingBitMap600
	 *	@return missingBitMap600
	 */
   public char[] getMissingBitMap600() throws CFException  {              
   		return work.getMissingBitMap600();
   }

  
	/**
	*  set variable missingBitMap600
	*  @param value
	**/
   public void setMissingBitMap600(char[] value) throws CFException {
      work.setMissingBitMap600(value);
   } 

	/**
	 *	Returns the value of ipmErrorElementId600
	 *	@return ipmErrorElementId600
	 */   
	 public IpmErrorElementId600 getIpmErrorElementId600() {
   	return ipmErrorMsg600.getIpmErrorElementId600();
   }

   /**
	* 	Update IpmErrorElementId600 with the passed value
	*	@param value
	*/
   public void setIpmErrorElementId600(char[] value) throws CFException {
      ipmErrorMsg600.setIpmErrorElementId600(value);
   }   

     /**
	 * 	Update IpmErrorElementId600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorElementId600(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorElementId600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementId600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorElementId600 with another Field
	 *	@param value
	 */
   public void setIpmErrorElementId600(Field source) {
   	ipmErrorMsg600.setIpmErrorElementId600(source);
   }  
   
     /**
	 * 	Update IpmErrorElementId600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorElementId600(Field source, int sourceIndex,int sourceLen) {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorElementId600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementId600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of missingBitMapCode600
	 *	@return missingBitMapCode600
	 */
	public int getMissingBitMapCode600() throws CFException {        
   		return work.getMissingBitMapCode600();
	}
	
	/**
	 * 	Update MissingBitMapCode600 with the passed value
	 *	@param number
	 */
	public void setMissingBitMapCode600(int number)  throws CFException{
		work.setMissingBitMapCode600(number);
	}


	public void setMissingBitMapCode600(long number)  throws CFException{
		work.setMissingBitMapCode600((int)number);
	}



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public ParseTheMessageOutCtx getParseTheMessageOutCtx() {
            return new ParseTheMessageOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += ip65504TcntGroup.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ip65504SelElemEntriesAll.hashCode();
        str += ipmErrorMsg600.hashCode();
       return str.hashCode();
    }

    public ParseTheMessageInCtx clone() {
        ParseTheMessageInCtx cloneObj = new ParseTheMessageInCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.ip65504TcntGroup = new Ip65504TcntGroup();
        cloneObj.ip65504TcntGroup.set(ip65504TcntGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        return cloneObj;
    }

    }

    public ParseTheMessageInCtx getParseTheMessageInCtx() {
            return new ParseTheMessageInCtx();
    }
     public class ParseTheMessageOutCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     Ip65504TcntGroup ip65504TcntGroup = Ip662010Ctx.this.getIp65504TcntGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     Ip65504SelElemEntriesAll ip65504SelElemEntriesAll = Ip662010Ctx.this.getIp65504SelElemEntriesAll();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();

	/**
	 *	Returns the value of ipmErrorPointerWidth600
	 *	@return ipmErrorPointerWidth600
	 */
	public short getIpmErrorPointerWidth600() throws CFException {        
   		return work.getIpmErrorPointerWidth600();
	}
	
	/**
	 * 	Update IpmErrorPointerWidth600 with the passed value
	 *	@param number
	 */
	public void setIpmErrorPointerWidth600(short number)  throws CFException{
		work.setIpmErrorPointerWidth600(number);
	}

	public void setIpmErrorPointerWidth600(int number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}

	public void setIpmErrorPointerWidth600(long number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}



	/**
	 *	Returns the value of ip65504TagNo
	 *	@return ip65504TagNo
	 */
	public short getIp65504TagNo(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagNo();
	}
	
	/**
	 * 	Update Ip65504TagNo with the passed value
	 *	@param number
	 */
	public void setIp65504TagNo(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo(number);
	}

	public void setIp65504TagNo(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}

	public void setIp65504TagNo(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of ip65504SelElemEntriesAll
	 *	@return ip65504SelElemEntriesAll
	 */   
	 public Ip65504SelElemEntriesAll getIp65504SelElemEntriesAll() {
   	return ip65504SelElemEntriesAll;
   }


	/**
	 *	Returns the value of ip662011ErrSubscript
	 *	@return ip662011ErrSubscript
	 */
	public int getIp662011ErrSubscript() throws CFException {        
   		return ip662011ErrSubscriptGroup.getIp662011ErrSubscript();
	}
	
	/**
	 * 	Update Ip662011ErrSubscript with the passed value
	 *	@param number
	 */
	public void setIp662011ErrSubscript(int number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript(number);
	}


	public void setIp662011ErrSubscript(long number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript((int)number);
	}


	/**
	 *	Returns the value of missingBitMapNdx600
	 *	@return missingBitMapNdx600
	 */
	public int getMissingBitMapNdx600() throws CFException {        
   		return work.getMissingBitMapNdx600();
	}
	
	/**
	 * 	Update MissingBitMapNdx600 with the passed value
	 *	@param number
	 */
	public void setMissingBitMapNdx600(int number)  throws CFException{
		work.setMissingBitMapNdx600(number);
	}


	public void setMissingBitMapNdx600(long number)  throws CFException{
		work.setMissingBitMapNdx600((int)number);
	}


	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of errorCode600
	 *	@return errorCode600
	 */
	public long getErrorCode600() throws CFException {
   		return ipmErrorMsg600.getErrorCode600();
	}


	/**
	 *	Returns String value of errorCode600
	 *	@return errorCode600
	 */
	public char[]  getErrorCode600String() throws CFException {
	     return String.valueOf(ipmErrorMsg600.getErrorCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorCode600IsNumeric()  throws CFException{
	    return ipmErrorMsg600.errorCode600IsNumeric();
	}

	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param number
	 */
	public void setErrorCode600(long number)  throws CFException{
		ipmErrorMsg600.setErrorCode600(number);
	}
	

	
	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorCode600(char[] value)  throws CFException {
		ipmErrorMsg600.setErrorCode600(value);
	}
	
	/**
	 * 	Update ErrorCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorCode600String(char[] value)  throws CFException{
		ipmErrorMsg600.setErrorCode600(value);
	}	

	/**
	 *	Returns the value of ip65504TagStarts
	 *	@return ip65504TagStarts
	 */
	public short getIp65504TagStarts(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagStarts();
	}
	
	/**
	 * 	Update Ip65504TagStarts with the passed value
	 *	@param number
	 */
	public void setIp65504TagStarts(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts(number);
	}

	public void setIp65504TagStarts(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}

	public void setIp65504TagStarts(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}



	/**
	 *	Returns the value of ip65504TagLngth
	 *	@return ip65504TagLngth
	 */
	public short getIp65504TagLngth(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagLngth();
	}
	
	/**
	 * 	Update Ip65504TagLngth with the passed value
	 *	@param number
	 */
	public void setIp65504TagLngth(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth(number);
	}

	public void setIp65504TagLngth(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth((short)number);
	}

	public void setIp65504TagLngth(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth((short)number);
	}



	/**
	 *	Returns the value of ip65504TagType
	 *	@return ip65504TagType
	 */
	public short getIp65504TagType(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagType();
	}
	
	/**
	 * 	Update Ip65504TagType with the passed value
	 *	@param number
	 */
	public void setIp65504TagType(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType(number);
	}

	public void setIp65504TagType(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}

	public void setIp65504TagType(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}



	/**
	 *	Returns the value of missingBitMap600
	 *	@return missingBitMap600
	 */
   public char[] getMissingBitMap600() throws CFException  {              
   		return work.getMissingBitMap600();
   }

  
	/**
	*  set variable missingBitMap600
	*  @param value
	**/
   public void setMissingBitMap600(char[] value) throws CFException {
      work.setMissingBitMap600(value);
   } 

	/**
	 *	Returns the value of ipmErrorElementId600
	 *	@return ipmErrorElementId600
	 */   
	 public IpmErrorElementId600 getIpmErrorElementId600() {
   	return ipmErrorMsg600.getIpmErrorElementId600();
   }

   /**
	* 	Update IpmErrorElementId600 with the passed value
	*	@param value
	*/
   public void setIpmErrorElementId600(char[] value) throws CFException {
      ipmErrorMsg600.setIpmErrorElementId600(value);
   }   

     /**
	 * 	Update IpmErrorElementId600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorElementId600(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorElementId600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementId600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorElementId600 with another Field
	 *	@param value
	 */
   public void setIpmErrorElementId600(Field source) {
   	ipmErrorMsg600.setIpmErrorElementId600(source);
   }  
   
     /**
	 * 	Update IpmErrorElementId600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorElementId600(Field source, int sourceIndex,int sourceLen) {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorElementId600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementId600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ipmErrorText600
	 *	@return ipmErrorText600
	 */
   public char[] getIpmErrorText600() throws CFException  {              
   		return ipmErrorMsg600.getIpmErrorText600();
   }

  
	/**
	*  set variable ipmErrorText600
	*  @param value
	**/
   public void setIpmErrorText600(char[] value) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(value);
   } 

     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex);
   	
   }
   
   public void setIpmErrorText600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorText600 with another Field
	 *	@param value
	 */
   public void setIpmErrorText600(Field source) {
      ipmErrorMsg600.setIpmErrorText600(source);
   }  
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504MessageStatus
	 *	@return ip65504MessageStatus
	 */
	public short getIp65504MessageStatus() throws CFException {        
   		return ip65504MessageStatusGroup.getIp65504MessageStatus();
	}
	
	/**
	 * 	Update Ip65504MessageStatus with the passed value
	 *	@param number
	 */
	public void setIp65504MessageStatus(short number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus(number);
	}

	public void setIp65504MessageStatus(int number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}

	public void setIp65504MessageStatus(long number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}



	/**
	 *	Returns the value of ip65504Tcnt
	 *	@return ip65504Tcnt
	 */
	public short getIp65504Tcnt() throws CFException {        
   		return ip65504TcntGroup.getIp65504Tcnt();
	}
	
	/**
	 * 	Update Ip65504Tcnt with the passed value
	 *	@param number
	 */
	public void setIp65504Tcnt(short number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt(number);
	}

	public void setIp65504Tcnt(int number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt((short)number);
	}

	public void setIp65504Tcnt(long number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt((short)number);
	}



	/**
	 *	Returns the value of missingBitMapCode600
	 *	@return missingBitMapCode600
	 */
	public int getMissingBitMapCode600() throws CFException {        
   		return work.getMissingBitMapCode600();
	}
	
	/**
	 * 	Update MissingBitMapCode600 with the passed value
	 *	@param number
	 */
	public void setMissingBitMapCode600(int number)  throws CFException{
		work.setMissingBitMapCode600(number);
	}


	public void setMissingBitMapCode600(long number)  throws CFException{
		work.setMissingBitMapCode600((int)number);
	}



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += ip65504TcntGroup.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ip65504SelElemEntriesAll.hashCode();
        str += ipmErrorMsg600.hashCode();
       return str.hashCode();
    }

    public ParseTheMessageOutCtx clone() {
        ParseTheMessageOutCtx cloneObj = new ParseTheMessageOutCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.ip65504TcntGroup = new Ip65504TcntGroup();
        cloneObj.ip65504TcntGroup.set(ip65504TcntGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        return cloneObj;
    }

    }

    public ParseTheMessageOutCtx getParseTheMessageOutCtx() {
            return new ParseTheMessageOutCtx();
    }
     public class FindElementsInCtx implements Cloneable {
     Work work = Ip662010Ctx.this.getWork();
     Ip65504SelElemEntriesAll ip65504SelElemEntriesAll = Ip662010Ctx.this.getIp65504SelElemEntriesAll();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();
     Ip000604DeAttrTable ip000604DeAttrTable = Ip662010Ctx.this.getIp000604DeAttrTable();


public void setIp65504D(int ip65504D) { 
    Ip662010Ctx.this.ip65504D = ip65504D;
}

public int getIp65504D() { 
    return Ip662010Ctx.this.ip65504D;
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
	 *	Returns the value of ip65504DeStart
	 *	@return ip65504DeStart
	 */
	public short getIp65504DeStart(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeStart();
	}
	
	/**
	 * 	Update Ip65504DeStart with the passed value
	 *	@param number
	 */
	public void setIp65504DeStart(int index,short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart(number);
	}

	public void setIp65504DeStart(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart((short)number);
	}

	public void setIp65504DeStart(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart((short)number);
	}



	/**
	 *	Returns the value of ip000604DeSubflds
	 *	@return ip000604DeSubflds
	 */
	public short getIp000604DeSubflds(int index) throws CFException {        
   		return ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeSubflds();
	}
	
	/**
	 * 	Update Ip000604DeSubflds with the passed value
	 *	@param number
	 */
	public void setIp000604DeSubflds(int index,short number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeSubflds(number);
	}

	public void setIp000604DeSubflds(int index,int number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeSubflds((short)number);
	}

	public void setIp000604DeSubflds(int index,long number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeSubflds((short)number);
	}



	/**
	 *	Returns the value of i400
	 *	@return i400
	 */
	public short getI400() throws CFException {        
   		return work.getI400();
	}
	
	/**
	 * 	Update I400 with the passed value
	 *	@param number
	 */
	public void setI400(short number)  throws CFException{
		work.setI400(number);
	}

	public void setI400(int number)  throws CFException{
		work.setI400((short)number);
	}

	public void setI400(long number)  throws CFException{
		work.setI400((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public FindElementsOutCtx getFindElementsOutCtx() {
            return new FindElementsOutCtx();
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
        str += ip65504SelElemEntriesAll.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip000604DeAttrTable.hashCode();
       return str.hashCode();
    }

    public FindElementsInCtx clone() {
        FindElementsInCtx cloneObj = new FindElementsInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        return cloneObj;
    }

    }

    public FindElementsInCtx getFindElementsInCtx() {
            return new FindElementsInCtx();
    }
     public class FindElementsOutCtx implements Cloneable {
     Work work = Ip662010Ctx.this.getWork();
     Ip65504SelElemEntriesAll ip65504SelElemEntriesAll = Ip662010Ctx.this.getIp65504SelElemEntriesAll();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();
     Ip000604DeAttrTable ip000604DeAttrTable = Ip662010Ctx.this.getIp000604DeAttrTable();


public void setIp65504D(int ip65504D) { 
    Ip662010Ctx.this.ip65504D = ip65504D;
}

public int getIp65504D() { 
    return Ip662010Ctx.this.ip65504D;
}
	/**
	 *	Returns the value of ip65504DeMapEntry
	 *	@return ip65504DeMapEntry
	 */   
	 public Ip65504DeMapEntry getIp65504DeMapEntry(int index) {
   	return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index);
   }

    public List<Ip65504DeMapEntry> getIp65504DeMapEntry() {
        return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry();
    }
   /**
	* 	Update Ip65504DeMapEntry with the passed value
	*	@param value
	*/
   public void setIp65504DeMapEntry(int index,char[] value) throws CFException {
      ip65504DeMapGroup.getIp65504DeMap().setIp65504DeMapEntry((index),value);
   }   


	/**
	 *	Returns the value of ip65504DeStart
	 *	@return ip65504DeStart
	 */
	public short getIp65504DeStart(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeStart();
	}
	
	/**
	 * 	Update Ip65504DeStart with the passed value
	 *	@param number
	 */
	public void setIp65504DeStart(int index,short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart(number);
	}

	public void setIp65504DeStart(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart((short)number);
	}

	public void setIp65504DeStart(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart((short)number);
	}



	/**
	 *	Returns the value of i400
	 *	@return i400
	 */
	public short getI400() throws CFException {        
   		return work.getI400();
	}
	
	/**
	 * 	Update I400 with the passed value
	 *	@param number
	 */
	public void setI400(short number)  throws CFException{
		work.setI400(number);
	}

	public void setI400(int number)  throws CFException{
		work.setI400((short)number);
	}

	public void setI400(long number)  throws CFException{
		work.setI400((short)number);
	}



	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}




public void setIp000604I(int ip000604I) { 
    Ip662010Ctx.this.ip000604I = ip000604I;
}

public int getIp000604I() { 
    return Ip662010Ctx.this.ip000604I;
}

        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
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
        str += ip65504SelElemEntriesAll.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip000604DeAttrTable.hashCode();
       return str.hashCode();
    }

    public FindElementsOutCtx clone() {
        FindElementsOutCtx cloneObj = new FindElementsOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        return cloneObj;
    }

    }

    public FindElementsOutCtx getFindElementsOutCtx() {
            return new FindElementsOutCtx();
    }
     public class EnterWholeDataElementInCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();


public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of i400
	 *	@return i400
	 */
	public short getI400() throws CFException {        
   		return work.getI400();
	}
	
	/**
	 * 	Update I400 with the passed value
	 *	@param number
	 */
	public void setI400(short number)  throws CFException{
		work.setI400(number);
	}

	public void setI400(int number)  throws CFException{
		work.setI400((short)number);
	}

	public void setI400(long number)  throws CFException{
		work.setI400((short)number);
	}



	/**
	 *	Returns the value of ip65504DeLngth
	 *	@return ip65504DeLngth
	 */
	public short getIp65504DeLngth(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeLngth();
	}
	
	/**
	 * 	Update Ip65504DeLngth with the passed value
	 *	@param number
	 */
	public void setIp65504DeLngth(int index,short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth(number);
	}

	public void setIp65504DeLngth(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
	}

	public void setIp65504DeLngth(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
	}



	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public EnterWholeDataElementOutCtx getEnterWholeDataElementOutCtx() {
            return new EnterWholeDataElementOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += work.hashCode();
        str += ip65504DeMapGroup.hashCode();
       return str.hashCode();
    }

    public EnterWholeDataElementInCtx clone() {
        EnterWholeDataElementInCtx cloneObj = new EnterWholeDataElementInCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        return cloneObj;
    }

    }

    public EnterWholeDataElementInCtx getEnterWholeDataElementInCtx() {
            return new EnterWholeDataElementInCtx();
    }
     public class EnterWholeDataElementOutCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();

	/**
	 *	Returns the value of ip65504TagNo
	 *	@return ip65504TagNo
	 */
	public short getIp65504TagNo(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagNo();
	}
	
	/**
	 * 	Update Ip65504TagNo with the passed value
	 *	@param number
	 */
	public void setIp65504TagNo(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo(number);
	}

	public void setIp65504TagNo(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}

	public void setIp65504TagNo(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}



	/**
	 *	Returns the value of ip65504TagStarts
	 *	@return ip65504TagStarts
	 */
	public short getIp65504TagStarts(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagStarts();
	}
	
	/**
	 * 	Update Ip65504TagStarts with the passed value
	 *	@param number
	 */
	public void setIp65504TagStarts(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts(number);
	}

	public void setIp65504TagStarts(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}

	public void setIp65504TagStarts(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of ip65504DeStart
	 *	@return ip65504DeStart
	 */
	public short getIp65504DeStart(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeStart();
	}
	
	/**
	 * 	Update Ip65504DeStart with the passed value
	 *	@param number
	 */
	public void setIp65504DeStart(int index,short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart(number);
	}

	public void setIp65504DeStart(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart((short)number);
	}

	public void setIp65504DeStart(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart((short)number);
	}



	/**
	 *	Returns the value of ip65504TagLngth
	 *	@return ip65504TagLngth
	 */
	public short getIp65504TagLngth(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagLngth();
	}
	
	/**
	 * 	Update Ip65504TagLngth with the passed value
	 *	@param number
	 */
	public void setIp65504TagLngth(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth(number);
	}

	public void setIp65504TagLngth(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth((short)number);
	}

	public void setIp65504TagLngth(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth((short)number);
	}



	/**
	 *	Returns the value of ip65504TagType
	 *	@return ip65504TagType
	 */
	public short getIp65504TagType(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagType();
	}
	
	/**
	 * 	Update Ip65504TagType with the passed value
	 *	@param number
	 */
	public void setIp65504TagType(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType(number);
	}

	public void setIp65504TagType(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}

	public void setIp65504TagType(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}



	/**
	 *	Returns the value of i400
	 *	@return i400
	 */
	public short getI400() throws CFException {        
   		return work.getI400();
	}
	
	/**
	 * 	Update I400 with the passed value
	 *	@param number
	 */
	public void setI400(short number)  throws CFException{
		work.setI400(number);
	}

	public void setI400(int number)  throws CFException{
		work.setI400((short)number);
	}

	public void setI400(long number)  throws CFException{
		work.setI400((short)number);
	}



	/**
	 *	Returns the value of ip65504DeLngth
	 *	@return ip65504DeLngth
	 */
	public short getIp65504DeLngth(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeLngth();
	}
	
	/**
	 * 	Update Ip65504DeLngth with the passed value
	 *	@param number
	 */
	public void setIp65504DeLngth(int index,short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth(number);
	}

	public void setIp65504DeLngth(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
	}

	public void setIp65504DeLngth(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
	}



	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of ip65504TagSubFldNo
	 *	@return ip65504TagSubFldNo
	 */
	public short getIp65504TagSubFldNo(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagSubFldNo();
	}
	
	/**
	 * 	Update Ip65504TagSubFldNo with the passed value
	 *	@param number
	 */
	public void setIp65504TagSubFldNo(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagSubFldNo(number);
	}

	public void setIp65504TagSubFldNo(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagSubFldNo((short)number);
	}

	public void setIp65504TagSubFldNo(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagSubFldNo((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += work.hashCode();
        str += ip65504DeMapGroup.hashCode();
       return str.hashCode();
    }

    public EnterWholeDataElementOutCtx clone() {
        EnterWholeDataElementOutCtx cloneObj = new EnterWholeDataElementOutCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        return cloneObj;
    }

    }

    public EnterWholeDataElementOutCtx getEnterWholeDataElementOutCtx() {
            return new EnterWholeDataElementOutCtx();
    }
     public class StoreDeLengthInCtx implements Cloneable {
     Work work = Ip662010Ctx.this.getWork();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();
     Ip000604DeAttrTable ip000604DeAttrTable = Ip662010Ctx.this.getIp000604DeAttrTable();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of ip000604DeLllSize
	 *	@return ip000604DeLllSize
	 */
	public short getIp000604DeLllSize(int index) throws CFException {        
   		return ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeLllSize();
	}
	
	/**
	 * 	Update Ip000604DeLllSize with the passed value
	 *	@param number
	 */
	public void setIp000604DeLllSize(int index,short number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeLllSize(number);
	}

	public void setIp000604DeLllSize(int index,int number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeLllSize((short)number);
	}

	public void setIp000604DeLllSize(int index,long number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeLllSize((short)number);
	}



	/**
	 *	Returns the value of ip000604DeMinLngth
	 *	@return ip000604DeMinLngth
	 */
	public short getIp000604DeMinLngth(int index) throws CFException {        
   		return ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeMinLngth();
	}
	
	/**
	 * 	Update Ip000604DeMinLngth with the passed value
	 *	@param number
	 */
	public void setIp000604DeMinLngth(int index,short number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeMinLngth(number);
	}

	public void setIp000604DeMinLngth(int index,int number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeMinLngth((short)number);
	}

	public void setIp000604DeMinLngth(int index,long number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeMinLngth((short)number);
	}



	/**
	 *	Returns the value of i400
	 *	@return i400
	 */
	public short getI400() throws CFException {        
   		return work.getI400();
	}
	
	/**
	 * 	Update I400 with the passed value
	 *	@param number
	 */
	public void setI400(short number)  throws CFException{
		work.setI400(number);
	}

	public void setI400(int number)  throws CFException{
		work.setI400((short)number);
	}

	public void setI400(long number)  throws CFException{
		work.setI400((short)number);
	}



	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of code661300
	 *	@return code661300
	 */
	public short getCode661300() throws CFException {        
   		return work.getCode661300();
	}
	
	/**
	 * 	Update Code661300 with the passed value
	 *	@param number
	 */
	public void setCode661300(short number)  throws CFException{
		work.setCode661300(number);
	}

	public void setCode661300(int number)  throws CFException{
		work.setCode661300((short)number);
	}

	public void setCode661300(long number)  throws CFException{
		work.setCode661300((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public StoreDeLengthOutCtx getStoreDeLengthOutCtx() {
            return new StoreDeLengthOutCtx();
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
        str += ip65504DeMapGroup.hashCode();
        str += ip000604DeAttrTable.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public StoreDeLengthInCtx clone() {
        StoreDeLengthInCtx cloneObj = new StoreDeLengthInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public StoreDeLengthInCtx getStoreDeLengthInCtx() {
            return new StoreDeLengthInCtx();
    }
     public class StoreDeLengthOutCtx implements Cloneable {
     Work work = Ip662010Ctx.this.getWork();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();
     Ip000604DeAttrTable ip000604DeAttrTable = Ip662010Ctx.this.getIp000604DeAttrTable();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of ipmErrorPointerWidth600
	 *	@return ipmErrorPointerWidth600
	 */
	public short getIpmErrorPointerWidth600() throws CFException {        
   		return work.getIpmErrorPointerWidth600();
	}
	
	/**
	 * 	Update IpmErrorPointerWidth600 with the passed value
	 *	@param number
	 */
	public void setIpmErrorPointerWidth600(short number)  throws CFException{
		work.setIpmErrorPointerWidth600(number);
	}

	public void setIpmErrorPointerWidth600(int number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}

	public void setIpmErrorPointerWidth600(long number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}



	/**
	 *	Returns the value of displayNumber600
	 *	@return displayNumber600
	 */
   public char[] getDisplayNumber600() throws CFException  {              
   		return work.getDisplayNumber600();
   }

  
	/**
	*  set variable displayNumber600
	*  @param value
	**/
   public void setDisplayNumber600(char[] value) throws CFException {
      work.setDisplayNumber600(value);
   } 

     /**
	 * 	Update DisplayNumber600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDisplayNumber600(char[] source, int sourceIndex) throws CFException {
      work.setDisplayNumber600(source, sourceIndex);
   	
   }
   
   public void setDisplayNumber600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setDisplayNumber600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DisplayNumber600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNumber600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDisplayNumber600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DisplayNumber600 with another Field
	 *	@param value
	 */
   public void setDisplayNumber600(Field source) {
      work.setDisplayNumber600(source);
   }  
   
     /**
	 * 	Update DisplayNumber600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDisplayNumber600(Field source, int sourceIndex,int sourceLen) {
      work.setDisplayNumber600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DisplayNumber600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNumber600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDisplayNumber600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
	public short getAbendCode900() throws CFException {        
   		return work.getAbendCode900();
	}
	
	/**
	 * 	Update AbendCode900 with the passed value
	 *	@param number
	 */
	public void setAbendCode900(short number)  throws CFException{
		work.setAbendCode900(number);
	}

	public void setAbendCode900(int number)  throws CFException{
		work.setAbendCode900((short)number);
	}

	public void setAbendCode900(long number)  throws CFException{
		work.setAbendCode900((short)number);
	}



	/**
	 *	Returns the value of ip000604DeLllSize
	 *	@return ip000604DeLllSize
	 */
	public short getIp000604DeLllSize(int index) throws CFException {        
   		return ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeLllSize();
	}
	
	/**
	 * 	Update Ip000604DeLllSize with the passed value
	 *	@param number
	 */
	public void setIp000604DeLllSize(int index,short number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeLllSize(number);
	}

	public void setIp000604DeLllSize(int index,int number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeLllSize((short)number);
	}

	public void setIp000604DeLllSize(int index,long number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeLllSize((short)number);
	}



	/**
	 *	Returns the value of ip000604DeMinLngth
	 *	@return ip000604DeMinLngth
	 */
	public short getIp000604DeMinLngth(int index) throws CFException {        
   		return ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeMinLngth();
	}
	
	/**
	 * 	Update Ip000604DeMinLngth with the passed value
	 *	@param number
	 */
	public void setIp000604DeMinLngth(int index,short number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeMinLngth(number);
	}

	public void setIp000604DeMinLngth(int index,int number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeMinLngth((short)number);
	}

	public void setIp000604DeMinLngth(int index,long number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeMinLngth((short)number);
	}



	/**
	 *	Returns the value of ip65504DeLngth
	 *	@return ip65504DeLngth
	 */
	public short getIp65504DeLngth(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeLngth();
	}
	
	/**
	 * 	Update Ip65504DeLngth with the passed value
	 *	@param number
	 */
	public void setIp65504DeLngth(int index,short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth(number);
	}

	public void setIp65504DeLngth(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
	}

	public void setIp65504DeLngth(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
	}



	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of code661300
	 *	@return code661300
	 */
	public short getCode661300() throws CFException {        
   		return work.getCode661300();
	}
	
	/**
	 * 	Update Code661300 with the passed value
	 *	@param number
	 */
	public void setCode661300(short number)  throws CFException{
		work.setCode661300(number);
	}

	public void setCode661300(int number)  throws CFException{
		work.setCode661300((short)number);
	}

	public void setCode661300(long number)  throws CFException{
		work.setCode661300((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
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
        str += ip65504DeMapGroup.hashCode();
        str += ip000604DeAttrTable.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public StoreDeLengthOutCtx clone() {
        StoreDeLengthOutCtx cloneObj = new StoreDeLengthOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public StoreDeLengthOutCtx getStoreDeLengthOutCtx() {
            return new StoreDeLengthOutCtx();
    }
     public class EnterDeSubfieldInfoInCtx implements Cloneable {
     NewTag800 newTag800 = Ip662010Ctx.this.getNewTag800();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip662010Ctx.this.getIp66102IpmFileInformation();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();


public void setIp65504D(int ip65504D) { 
    Ip662010Ctx.this.ip65504D = ip65504D;
}

public int getIp65504D() { 
    return Ip662010Ctx.this.ip65504D;
}
	/**
	 *	Returns the value of startOfNextElement800
	 *	@return startOfNextElement800
	 */
	public short getStartOfNextElement800() throws CFException {        
   		return work.getStartOfNextElement800();
	}
	
	/**
	 * 	Update StartOfNextElement800 with the passed value
	 *	@param number
	 */
	public void setStartOfNextElement800(short number)  throws CFException{
		work.setStartOfNextElement800(number);
	}

	public void setStartOfNextElement800(int number)  throws CFException{
		work.setStartOfNextElement800((short)number);
	}

	public void setStartOfNextElement800(long number)  throws CFException{
		work.setStartOfNextElement800((short)number);
	}



	/**
	 *	Returns the value of i400
	 *	@return i400
	 */
	public short getI400() throws CFException {        
   		return work.getI400();
	}
	
	/**
	 * 	Update I400 with the passed value
	 *	@param number
	 */
	public void setI400(short number)  throws CFException{
		work.setI400(number);
	}

	public void setI400(int number)  throws CFException{
		work.setI400((short)number);
	}

	public void setI400(long number)  throws CFException{
		work.setI400((short)number);
	}



	/**
	 *	Returns the value of ip65504DeLngth
	 *	@return ip65504DeLngth
	 */
	public short getIp65504DeLngth(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeLngth();
	}
	
	/**
	 * 	Update Ip65504DeLngth with the passed value
	 *	@param number
	 */
	public void setIp65504DeLngth(int index,short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth(number);
	}

	public void setIp65504DeLngth(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
	}

	public void setIp65504DeLngth(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
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
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public EnterDeSubfieldInfoOutCtx getEnterDeSubfieldInfoOutCtx() {
            return new EnterDeSubfieldInfoOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += newTag800.hashCode();
        str += ip66102IpmFileInformation.hashCode();
        str += work.hashCode();
        str += ip65504DeMapGroup.hashCode();
       return str.hashCode();
    }

    public EnterDeSubfieldInfoInCtx clone() {
        EnterDeSubfieldInfoInCtx cloneObj = new EnterDeSubfieldInfoInCtx();
        cloneObj.newTag800 = new NewTag800();
        cloneObj.newTag800.set(newTag800.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        return cloneObj;
    }

    }

    public EnterDeSubfieldInfoInCtx getEnterDeSubfieldInfoInCtx() {
            return new EnterDeSubfieldInfoInCtx();
    }
     public class EnterDeSubfieldInfoOutCtx implements Cloneable {
     NewTag800 newTag800 = Ip662010Ctx.this.getNewTag800();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip662010Ctx.this.getIp66102IpmFileInformation();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();


public void setIp65504D(int ip65504D) { 
    Ip662010Ctx.this.ip65504D = ip65504D;
}

public int getIp65504D() { 
    return Ip662010Ctx.this.ip65504D;
}
	/**
	 *	Returns the value of newType800
	 *	@return newType800
	 */
	public short getNewType800() throws CFException {        
   		return newTag800.getNewType800();
	}
	
	/**
	 * 	Update NewType800 with the passed value
	 *	@param number
	 */
	public void setNewType800(short number)  throws CFException{
		newTag800.setNewType800(number);
	}

	public void setNewType800(int number)  throws CFException{
		newTag800.setNewType800((short)number);
	}

	public void setNewType800(long number)  throws CFException{
		newTag800.setNewType800((short)number);
	}



	/**
	 *	Returns the value of startOfNextElement800
	 *	@return startOfNextElement800
	 */
	public short getStartOfNextElement800() throws CFException {        
   		return work.getStartOfNextElement800();
	}
	
	/**
	 * 	Update StartOfNextElement800 with the passed value
	 *	@param number
	 */
	public void setStartOfNextElement800(short number)  throws CFException{
		work.setStartOfNextElement800(number);
	}

	public void setStartOfNextElement800(int number)  throws CFException{
		work.setStartOfNextElement800((short)number);
	}

	public void setStartOfNextElement800(long number)  throws CFException{
		work.setStartOfNextElement800((short)number);
	}



	/**
	 *	Returns the value of ip65504DeStart
	 *	@return ip65504DeStart
	 */
	public short getIp65504DeStart(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeStart();
	}
	
	/**
	 * 	Update Ip65504DeStart with the passed value
	 *	@param number
	 */
	public void setIp65504DeStart(int index,short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart(number);
	}

	public void setIp65504DeStart(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart((short)number);
	}

	public void setIp65504DeStart(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of i400
	 *	@return i400
	 */
	public short getI400() throws CFException {        
   		return work.getI400();
	}
	
	/**
	 * 	Update I400 with the passed value
	 *	@param number
	 */
	public void setI400(short number)  throws CFException{
		work.setI400(number);
	}

	public void setI400(int number)  throws CFException{
		work.setI400((short)number);
	}

	public void setI400(long number)  throws CFException{
		work.setI400((short)number);
	}



	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of newNo800
	 *	@return newNo800
	 */
	public short getNewNo800() throws CFException {        
   		return newTag800.getNewNo800();
	}
	
	/**
	 * 	Update NewNo800 with the passed value
	 *	@param number
	 */
	public void setNewNo800(short number)  throws CFException{
		newTag800.setNewNo800(number);
	}

	public void setNewNo800(int number)  throws CFException{
		newTag800.setNewNo800((short)number);
	}

	public void setNewNo800(long number)  throws CFException{
		newTag800.setNewNo800((short)number);
	}



	/**
	 *	Returns the value of doesVarSubfExist100
	 *	@return doesVarSubfExist100
	 */
   public char[] getDoesVarSubfExist100() throws CFException  {              
   		return work.getDoesVarSubfExist100();
   }

  
	/**
	*  set variable doesVarSubfExist100
	*  @param value
	**/
   public void setDoesVarSubfExist100(char[] value) throws CFException {
      work.setDoesVarSubfExist100(value);
   } 

	/**
	 *	Returns the value of ip65504DeFirstSubfld
	 *	@return ip65504DeFirstSubfld
	 */
	public int getIp65504DeFirstSubfld(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeFirstSubfld();
	}
	
	/**
	 * 	Update Ip65504DeFirstSubfld with the passed value
	 *	@param number
	 */
	public void setIp65504DeFirstSubfld(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeFirstSubfld(number);
	}


	public void setIp65504DeFirstSubfld(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeFirstSubfld((int)number);
	}



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += newTag800.hashCode();
        str += ip66102IpmFileInformation.hashCode();
        str += work.hashCode();
        str += ip65504DeMapGroup.hashCode();
       return str.hashCode();
    }

    public EnterDeSubfieldInfoOutCtx clone() {
        EnterDeSubfieldInfoOutCtx cloneObj = new EnterDeSubfieldInfoOutCtx();
        cloneObj.newTag800 = new NewTag800();
        cloneObj.newTag800.set(newTag800.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        return cloneObj;
    }

    }

    public EnterDeSubfieldInfoOutCtx getEnterDeSubfieldInfoOutCtx() {
            return new EnterDeSubfieldInfoOutCtx();
    }
     public class DoADeOccurrenceGroupInCtx implements Cloneable {
     NewTag800 newTag800 = Ip662010Ctx.this.getNewTag800();
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();
     Ip000604DeAttrTable ip000604DeAttrTable = Ip662010Ctx.this.getIp000604DeAttrTable();
     Ip000704DeSubAttrTable ip000704DeSubAttrTable = Ip662010Ctx.this.getIp000704DeSubAttrTable();

	/**
	 *	Returns the value of ip000704DeSubMaxLngth
	 *	@return ip000704DeSubMaxLngth
	 */
	public short getIp000704DeSubMaxLngth(int index) throws CFException {        
   		return ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).getIp000704DeSubMaxLngth();
	}
	
	/**
	 * 	Update Ip000704DeSubMaxLngth with the passed value
	 *	@param number
	 */
	public void setIp000704DeSubMaxLngth(int index,short number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeSubMaxLngth(number);
	}

	public void setIp000704DeSubMaxLngth(int index,int number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeSubMaxLngth((short)number);
	}

	public void setIp000704DeSubMaxLngth(int index,long number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeSubMaxLngth((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of newLength800
	 *	@return newLength800
	 */
	public short getNewLength800() throws CFException {        
   		return newTag800.getNewLength800();
	}
	
	/**
	 * 	Update NewLength800 with the passed value
	 *	@param number
	 */
	public void setNewLength800(short number)  throws CFException{
		newTag800.setNewLength800(number);
	}

	public void setNewLength800(int number)  throws CFException{
		newTag800.setNewLength800((short)number);
	}

	public void setNewLength800(long number)  throws CFException{
		newTag800.setNewLength800((short)number);
	}



	/**
	 *	Returns the value of currentSubfld400
	 *	@return currentSubfld400
	 */
	public short getCurrentSubfld400() throws CFException {        
   		return work.getCurrentSubfld400();
	}
	
	/**
	 * 	Update CurrentSubfld400 with the passed value
	 *	@param number
	 */
	public void setCurrentSubfld400(short number)  throws CFException{
		work.setCurrentSubfld400(number);
	}

	public void setCurrentSubfld400(int number)  throws CFException{
		work.setCurrentSubfld400((short)number);
	}

	public void setCurrentSubfld400(long number)  throws CFException{
		work.setCurrentSubfld400((short)number);
	}



	/**
	 *	Returns the value of ip65504DeLngth
	 *	@return ip65504DeLngth
	 */
	public short getIp65504DeLngth(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeLngth();
	}
	
	/**
	 * 	Update Ip65504DeLngth with the passed value
	 *	@param number
	 */
	public void setIp65504DeLngth(int index,short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth(number);
	}

	public void setIp65504DeLngth(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
	}

	public void setIp65504DeLngth(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
	}



	/**
	 *	Returns the value of ip000604DeFirstSubfld
	 *	@return ip000604DeFirstSubfld
	 */
	public int getIp000604DeFirstSubfld(int index) throws CFException {        
   		return ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeFirstSubfld();
	}
	
	/**
	 * 	Update Ip000604DeFirstSubfld with the passed value
	 *	@param number
	 */
	public void setIp000604DeFirstSubfld(int index,int number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeFirstSubfld(number);
	}


	public void setIp000604DeFirstSubfld(int index,long number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeFirstSubfld((int)number);
	}


	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of ip000704DeSubMinLngth
	 *	@return ip000704DeSubMinLngth
	 */
	public short getIp000704DeSubMinLngth(int index) throws CFException {        
   		return ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).getIp000704DeSubMinLngth();
	}
	
	/**
	 * 	Update Ip000704DeSubMinLngth with the passed value
	 *	@param number
	 */
	public void setIp000704DeSubMinLngth(int index,short number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeSubMinLngth(number);
	}

	public void setIp000704DeSubMinLngth(int index,int number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeSubMinLngth((short)number);
	}

	public void setIp000704DeSubMinLngth(int index,long number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeSubMinLngth((short)number);
	}



	/**
	 *	Returns the value of newTag800
	 *	@return newTag800
	 */   
	 public NewTag800 getNewTag800() {
   	return newTag800;
   }


	/**
	 *	Returns the value of startOfNextElement800
	 *	@return startOfNextElement800
	 */
	public short getStartOfNextElement800() throws CFException {        
   		return work.getStartOfNextElement800();
	}
	
	/**
	 * 	Update StartOfNextElement800 with the passed value
	 *	@param number
	 */
	public void setStartOfNextElement800(short number)  throws CFException{
		work.setStartOfNextElement800(number);
	}

	public void setStartOfNextElement800(int number)  throws CFException{
		work.setStartOfNextElement800((short)number);
	}

	public void setStartOfNextElement800(long number)  throws CFException{
		work.setStartOfNextElement800((short)number);
	}



	/**
	 *	Returns the value of ip000604DeMinLngth
	 *	@return ip000604DeMinLngth
	 */
	public short getIp000604DeMinLngth(int index) throws CFException {        
   		return ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeMinLngth();
	}
	
	/**
	 * 	Update Ip000604DeMinLngth with the passed value
	 *	@param number
	 */
	public void setIp000604DeMinLngth(int index,short number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeMinLngth(number);
	}

	public void setIp000604DeMinLngth(int index,int number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeMinLngth((short)number);
	}

	public void setIp000604DeMinLngth(int index,long number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeMinLngth((short)number);
	}



	/**
	 *	Returns the value of ip000604DeSubflds
	 *	@return ip000604DeSubflds
	 */
	public short getIp000604DeSubflds(int index) throws CFException {        
   		return ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeSubflds();
	}
	
	/**
	 * 	Update Ip000604DeSubflds with the passed value
	 *	@param number
	 */
	public void setIp000604DeSubflds(int index,short number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeSubflds(number);
	}

	public void setIp000604DeSubflds(int index,int number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeSubflds((short)number);
	}

	public void setIp000604DeSubflds(int index,long number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeSubflds((short)number);
	}



	/**
	 *	Returns the value of i400
	 *	@return i400
	 */
	public short getI400() throws CFException {        
   		return work.getI400();
	}
	
	/**
	 * 	Update I400 with the passed value
	 *	@param number
	 */
	public void setI400(short number)  throws CFException{
		work.setI400(number);
	}

	public void setI400(int number)  throws CFException{
		work.setI400((short)number);
	}

	public void setI400(long number)  throws CFException{
		work.setI400((short)number);
	}



	/**
	 *	Test condition "Y" for isVarSubfExists88100()
	 *	@return  Returns true if isVarSubfExists88100() is "Y"
	 */
   public boolean isVarSubfExists88100() throws CFException {
      return work.isVarSubfExists88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setVarSubfExists88100True()  throws CFException{  			
    	work.setVarSubfExists88100True();
   	}

public void setIp000704I(int ip000704I) { 
    Ip662010Ctx.this.ip000704I = ip000704I;
}

public int getIp000704I() { 
    return Ip662010Ctx.this.ip000704I;
}

public void setIp000604I(int ip000604I) { 
    Ip662010Ctx.this.ip000604I = ip000604I;
}

public int getIp000604I() { 
    return Ip662010Ctx.this.ip000604I;
}

        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public DoADeOccurrenceGroupOutCtx getDoADeOccurrenceGroupOutCtx() {
            return new DoADeOccurrenceGroupOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += newTag800.hashCode();
        str += ip65504CurrentTagTable.hashCode();
        str += work.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip000604DeAttrTable.hashCode();
        str += ip000704DeSubAttrTable.hashCode();
       return str.hashCode();
    }

    public DoADeOccurrenceGroupInCtx clone() {
        DoADeOccurrenceGroupInCtx cloneObj = new DoADeOccurrenceGroupInCtx();
        cloneObj.newTag800 = new NewTag800();
        cloneObj.newTag800.set(newTag800.getClonedField());
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        cloneObj.ip000704DeSubAttrTable = new Ip000704DeSubAttrTable();
        cloneObj.ip000704DeSubAttrTable.set(ip000704DeSubAttrTable.getClonedField());
        return cloneObj;
    }

    }

    public DoADeOccurrenceGroupInCtx getDoADeOccurrenceGroupInCtx() {
            return new DoADeOccurrenceGroupInCtx();
    }
     public class DoADeOccurrenceGroupOutCtx implements Cloneable {
     NewTag800 newTag800 = Ip662010Ctx.this.getNewTag800();
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();
     Ip000604DeAttrTable ip000604DeAttrTable = Ip662010Ctx.this.getIp000604DeAttrTable();
     Ip000704DeSubAttrTable ip000704DeSubAttrTable = Ip662010Ctx.this.getIp000704DeSubAttrTable();

	/**
	 *	Returns the value of newTag800
	 *	@return newTag800
	 */   
	 public NewTag800 getNewTag800() {
   	return newTag800;
   }


	/**
	 *	Returns the value of newStart800
	 *	@return newStart800
	 */
	public short getNewStart800() throws CFException {        
   		return newTag800.getNewStart800();
	}
	
	/**
	 * 	Update NewStart800 with the passed value
	 *	@param number
	 */
	public void setNewStart800(short number)  throws CFException{
		newTag800.setNewStart800(number);
	}

	public void setNewStart800(int number)  throws CFException{
		newTag800.setNewStart800((short)number);
	}

	public void setNewStart800(long number)  throws CFException{
		newTag800.setNewStart800((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of newLength800
	 *	@return newLength800
	 */
	public short getNewLength800() throws CFException {        
   		return newTag800.getNewLength800();
	}
	
	/**
	 * 	Update NewLength800 with the passed value
	 *	@param number
	 */
	public void setNewLength800(short number)  throws CFException{
		newTag800.setNewLength800(number);
	}

	public void setNewLength800(int number)  throws CFException{
		newTag800.setNewLength800((short)number);
	}

	public void setNewLength800(long number)  throws CFException{
		newTag800.setNewLength800((short)number);
	}



	/**
	 *	Returns the value of currentSubfld400
	 *	@return currentSubfld400
	 */
	public short getCurrentSubfld400() throws CFException {        
   		return work.getCurrentSubfld400();
	}
	
	/**
	 * 	Update CurrentSubfld400 with the passed value
	 *	@param number
	 */
	public void setCurrentSubfld400(short number)  throws CFException{
		work.setCurrentSubfld400(number);
	}

	public void setCurrentSubfld400(int number)  throws CFException{
		work.setCurrentSubfld400((short)number);
	}

	public void setCurrentSubfld400(long number)  throws CFException{
		work.setCurrentSubfld400((short)number);
	}



	/**
	 *	Returns the value of newSubfldNo800
	 *	@return newSubfldNo800
	 */
	public short getNewSubfldNo800() throws CFException {        
   		return newTag800.getNewSubfldNo800();
	}
	
	/**
	 * 	Update NewSubfldNo800 with the passed value
	 *	@param number
	 */
	public void setNewSubfldNo800(short number)  throws CFException{
		newTag800.setNewSubfldNo800(number);
	}

	public void setNewSubfldNo800(int number)  throws CFException{
		newTag800.setNewSubfldNo800((short)number);
	}

	public void setNewSubfldNo800(long number)  throws CFException{
		newTag800.setNewSubfldNo800((short)number);
	}



	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of ip000704DeSubMinLngth
	 *	@return ip000704DeSubMinLngth
	 */
	public short getIp000704DeSubMinLngth(int index) throws CFException {        
   		return ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).getIp000704DeSubMinLngth();
	}
	
	/**
	 * 	Update Ip000704DeSubMinLngth with the passed value
	 *	@param number
	 */
	public void setIp000704DeSubMinLngth(int index,short number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeSubMinLngth(number);
	}

	public void setIp000704DeSubMinLngth(int index,int number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeSubMinLngth((short)number);
	}

	public void setIp000704DeSubMinLngth(int index,long number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeSubMinLngth((short)number);
	}




public void setIp000704I(int ip000704I) { 
    Ip662010Ctx.this.ip000704I = ip000704I;
}

public int getIp000704I() { 
    return Ip662010Ctx.this.ip000704I;
}
	/**
	 *	Returns the value of ip65504TagArea
	 *	@return ip65504TagArea
	 */   
	 public Ip65504TagArea getIp65504TagArea(int index) {
   	return ip65504CurrentTagTable.getIp65504TagArea(index);
   }

    public List<Ip65504TagArea> getIp65504TagArea() {
        return ip65504CurrentTagTable.getIp65504TagArea();
    }
   /**
	* 	Update Ip65504TagArea with the passed value
	*	@param value
	*/
   public void setIp65504TagArea(int index,char[] value) throws CFException {
      ip65504CurrentTagTable.setIp65504TagArea((index),value);
   }   


	/**
	 *	Returns the value of newStatus800
	 *	@return newStatus800
	 */
   public char[] getNewStatus800() throws CFException  {              
   		return newTag800.getNewStatus800();
   }

  
	/**
	*  set variable newStatus800
	*  @param value
	**/
   public void setNewStatus800(char[] value) throws CFException {
      newTag800.setNewStatus800(value);
   } 

     /**
	 * 	Update NewStatus800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNewStatus800(char[] source, int sourceIndex) throws CFException {
      newTag800.setNewStatus800(source, sourceIndex);
   	
   }
   
   public void setNewStatus800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      newTag800.setNewStatus800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update NewStatus800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNewStatus800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      newTag800.setNewStatus800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update NewStatus800 with another Field
	 *	@param value
	 */
   public void setNewStatus800(Field source) {
      newTag800.setNewStatus800(source);
   }  
   
     /**
	 * 	Update NewStatus800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNewStatus800(Field source, int sourceIndex,int sourceLen) {
      newTag800.setNewStatus800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update NewStatus800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNewStatus800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      newTag800.setNewStatus800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += newTag800.hashCode();
        str += ip65504CurrentTagTable.hashCode();
        str += work.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip000604DeAttrTable.hashCode();
        str += ip000704DeSubAttrTable.hashCode();
       return str.hashCode();
    }

    public DoADeOccurrenceGroupOutCtx clone() {
        DoADeOccurrenceGroupOutCtx cloneObj = new DoADeOccurrenceGroupOutCtx();
        cloneObj.newTag800 = new NewTag800();
        cloneObj.newTag800.set(newTag800.getClonedField());
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        cloneObj.ip000704DeSubAttrTable = new Ip000704DeSubAttrTable();
        cloneObj.ip000704DeSubAttrTable.set(ip000704DeSubAttrTable.getClonedField());
        return cloneObj;
    }

    }

    public DoADeOccurrenceGroupOutCtx getDoADeOccurrenceGroupOutCtx() {
            return new DoADeOccurrenceGroupOutCtx();
    }
     public class DoDelimitedSubfldInCtx implements Cloneable {
     NewTag800 newTag800 = Ip662010Ctx.this.getNewTag800();
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     Ip000704DeSubAttrTable ip000704DeSubAttrTable = Ip662010Ctx.this.getIp000704DeSubAttrTable();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of ip000704DeSubMaxLngth
	 *	@return ip000704DeSubMaxLngth
	 */
	public short getIp000704DeSubMaxLngth(int index) throws CFException {        
   		return ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).getIp000704DeSubMaxLngth();
	}
	
	/**
	 * 	Update Ip000704DeSubMaxLngth with the passed value
	 *	@param number
	 */
	public void setIp000704DeSubMaxLngth(int index,short number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeSubMaxLngth(number);
	}

	public void setIp000704DeSubMaxLngth(int index,int number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeSubMaxLngth((short)number);
	}

	public void setIp000704DeSubMaxLngth(int index,long number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeSubMaxLngth((short)number);
	}



	/**
	 *	Returns the value of noBackslash600
	 *	@return noBackslash600
	 */
   public char[] getNoBackslash600() throws CFException  {              
   		return work.getNoBackslash600();
   }

  
	/**
	*  set variable noBackslash600
	*  @param value
	**/
   public void setNoBackslash600(char[] value) throws CFException {
      work.setNoBackslash600(value);
   } 

	/**
	 *	Returns the value of newStart800
	 *	@return newStart800
	 */
	public short getNewStart800() throws CFException {        
   		return newTag800.getNewStart800();
	}
	
	/**
	 * 	Update NewStart800 with the passed value
	 *	@param number
	 */
	public void setNewStart800(short number)  throws CFException{
		newTag800.setNewStart800(number);
	}

	public void setNewStart800(int number)  throws CFException{
		newTag800.setNewStart800((short)number);
	}

	public void setNewStart800(long number)  throws CFException{
		newTag800.setNewStart800((short)number);
	}



	/**
	 *	Returns the value of newType800
	 *	@return newType800
	 */
	public short getNewType800() throws CFException {        
   		return newTag800.getNewType800();
	}
	
	/**
	 * 	Update NewType800 with the passed value
	 *	@param number
	 */
	public void setNewType800(short number)  throws CFException{
		newTag800.setNewType800(number);
	}

	public void setNewType800(int number)  throws CFException{
		newTag800.setNewType800((short)number);
	}

	public void setNewType800(long number)  throws CFException{
		newTag800.setNewType800((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of noBackslashCode600
	 *	@return noBackslashCode600
	 */
	public int getNoBackslashCode600() throws CFException {        
   		return work.getNoBackslashCode600();
	}
	
	/**
	 * 	Update NoBackslashCode600 with the passed value
	 *	@param number
	 */
	public void setNoBackslashCode600(int number)  throws CFException{
		work.setNoBackslashCode600(number);
	}


	public void setNoBackslashCode600(long number)  throws CFException{
		work.setNoBackslashCode600((int)number);
	}


	/**
	 *	Returns the value of subfldLength400
	 *	@return subfldLength400
	 */
	public short getSubfldLength400() throws CFException {        
   		return work.getSubfldLength400();
	}
	
	/**
	 * 	Update SubfldLength400 with the passed value
	 *	@param number
	 */
	public void setSubfldLength400(short number)  throws CFException{
		work.setSubfldLength400(number);
	}

	public void setSubfldLength400(int number)  throws CFException{
		work.setSubfldLength400((short)number);
	}

	public void setSubfldLength400(long number)  throws CFException{
		work.setSubfldLength400((short)number);
	}



	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of noBackslashNdx600
	 *	@return noBackslashNdx600
	 */
	public int getNoBackslashNdx600() throws CFException {        
   		return work.getNoBackslashNdx600();
	}
	
	/**
	 * 	Update NoBackslashNdx600 with the passed value
	 *	@param number
	 */
	public void setNoBackslashNdx600(int number)  throws CFException{
		work.setNoBackslashNdx600(number);
	}


	public void setNoBackslashNdx600(long number)  throws CFException{
		work.setNoBackslashNdx600((int)number);
	}


	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of newNo800
	 *	@return newNo800
	 */
	public short getNewNo800() throws CFException {        
   		return newTag800.getNewNo800();
	}
	
	/**
	 * 	Update NewNo800 with the passed value
	 *	@param number
	 */
	public void setNewNo800(short number)  throws CFException{
		newTag800.setNewNo800(number);
	}

	public void setNewNo800(int number)  throws CFException{
		newTag800.setNewNo800((short)number);
	}

	public void setNewNo800(long number)  throws CFException{
		newTag800.setNewNo800((short)number);
	}




public void setIp000704I(int ip000704I) { 
    Ip662010Ctx.this.ip000704I = ip000704I;
}

public int getIp000704I() { 
    return Ip662010Ctx.this.ip000704I;
}

        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public DoDelimitedSubfldOutCtx getDoDelimitedSubfldOutCtx() {
            return new DoDelimitedSubfldOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += newTag800.hashCode();
        str += ip65504CurrentTagTable.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += ip000704DeSubAttrTable.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public DoDelimitedSubfldInCtx clone() {
        DoDelimitedSubfldInCtx cloneObj = new DoDelimitedSubfldInCtx();
        cloneObj.newTag800 = new NewTag800();
        cloneObj.newTag800.set(newTag800.getClonedField());
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.ip000704DeSubAttrTable = new Ip000704DeSubAttrTable();
        cloneObj.ip000704DeSubAttrTable.set(ip000704DeSubAttrTable.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public DoDelimitedSubfldInCtx getDoDelimitedSubfldInCtx() {
            return new DoDelimitedSubfldInCtx();
    }
     public class DoDelimitedSubfldOutCtx implements Cloneable {
     NewTag800 newTag800 = Ip662010Ctx.this.getNewTag800();
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     Ip000704DeSubAttrTable ip000704DeSubAttrTable = Ip662010Ctx.this.getIp000704DeSubAttrTable();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of ip000704DeSubMaxLngth
	 *	@return ip000704DeSubMaxLngth
	 */
	public short getIp000704DeSubMaxLngth(int index) throws CFException {        
   		return ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).getIp000704DeSubMaxLngth();
	}
	
	/**
	 * 	Update Ip000704DeSubMaxLngth with the passed value
	 *	@param number
	 */
	public void setIp000704DeSubMaxLngth(int index,short number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeSubMaxLngth(number);
	}

	public void setIp000704DeSubMaxLngth(int index,int number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeSubMaxLngth((short)number);
	}

	public void setIp000704DeSubMaxLngth(int index,long number)  throws CFException{
		ip000704DeSubAttrTable.getIp000704DeSubAttrRow(index).setIp000704DeSubMaxLngth((short)number);
	}



	/**
	 *	Returns the value of ipmErrorPointerWidth600
	 *	@return ipmErrorPointerWidth600
	 */
	public short getIpmErrorPointerWidth600() throws CFException {        
   		return work.getIpmErrorPointerWidth600();
	}
	
	/**
	 * 	Update IpmErrorPointerWidth600 with the passed value
	 *	@param number
	 */
	public void setIpmErrorPointerWidth600(short number)  throws CFException{
		work.setIpmErrorPointerWidth600(number);
	}

	public void setIpmErrorPointerWidth600(int number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}

	public void setIpmErrorPointerWidth600(long number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}



	/**
	 *	Returns the value of ip65504TagNo
	 *	@return ip65504TagNo
	 */
	public short getIp65504TagNo(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagNo();
	}
	
	/**
	 * 	Update Ip65504TagNo with the passed value
	 *	@param number
	 */
	public void setIp65504TagNo(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo(number);
	}

	public void setIp65504TagNo(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}

	public void setIp65504TagNo(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}



	/**
	 *	Returns the value of noBackslash600
	 *	@return noBackslash600
	 */
   public char[] getNoBackslash600() throws CFException  {              
   		return work.getNoBackslash600();
   }

  
	/**
	*  set variable noBackslash600
	*  @param value
	**/
   public void setNoBackslash600(char[] value) throws CFException {
      work.setNoBackslash600(value);
   } 

	/**
	 *	Returns the value of newType800
	 *	@return newType800
	 */
	public short getNewType800() throws CFException {        
   		return newTag800.getNewType800();
	}
	
	/**
	 * 	Update NewType800 with the passed value
	 *	@param number
	 */
	public void setNewType800(short number)  throws CFException{
		newTag800.setNewType800(number);
	}

	public void setNewType800(int number)  throws CFException{
		newTag800.setNewType800((short)number);
	}

	public void setNewType800(long number)  throws CFException{
		newTag800.setNewType800((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of newLength800
	 *	@return newLength800
	 */
	public short getNewLength800() throws CFException {        
   		return newTag800.getNewLength800();
	}
	
	/**
	 * 	Update NewLength800 with the passed value
	 *	@param number
	 */
	public void setNewLength800(short number)  throws CFException{
		newTag800.setNewLength800(number);
	}

	public void setNewLength800(int number)  throws CFException{
		newTag800.setNewLength800((short)number);
	}

	public void setNewLength800(long number)  throws CFException{
		newTag800.setNewLength800((short)number);
	}



	/**
	 *	Returns the value of ip662011ErrSubscript
	 *	@return ip662011ErrSubscript
	 */
	public int getIp662011ErrSubscript() throws CFException {        
   		return ip662011ErrSubscriptGroup.getIp662011ErrSubscript();
	}
	
	/**
	 * 	Update Ip662011ErrSubscript with the passed value
	 *	@param number
	 */
	public void setIp662011ErrSubscript(int number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript(number);
	}


	public void setIp662011ErrSubscript(long number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript((int)number);
	}


	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of ipmErrorElementNo600
	 *	@return ipmErrorElementNo600
	 */
	public int getIpmErrorElementNo600() throws CFException {
   		return ipmErrorMsg600.getIpmErrorElementId600().getIpmErrorElementNo600();
	}


	/**
	 *	Returns String value of ipmErrorElementNo600
	 *	@return ipmErrorElementNo600
	 */
	public char[]  getIpmErrorElementNo600String() throws CFException {
	     return String.valueOf(ipmErrorMsg600.getIpmErrorElementId600().getIpmErrorElementNo600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ipmErrorElementNo600IsNumeric()  throws CFException{
	    return ipmErrorMsg600.getIpmErrorElementId600().ipmErrorElementNo600IsNumeric();
	}

	/**
	 * 	Update IpmErrorElementNo600 with the passed value
	 *	@param number
	 */
	public void setIpmErrorElementNo600(int number)  throws CFException{
		ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementNo600(number);
	}
	

	public void setIpmErrorElementNo600(long number)  throws CFException{
	    ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementNo600(number);
	}
	
	
	/**
	 * 	Update IpmErrorElementNo600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIpmErrorElementNo600(char[] value)  throws CFException {
		ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementNo600(value);
	}
	
	/**
	 * 	Update IpmErrorElementNo600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIpmErrorElementNo600String(char[] value)  throws CFException{
		ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementNo600(value);
	}	

	/**
	 *	Returns the value of ipmErrorElementType600
	 *	@return ipmErrorElementType600
	 */
   public char[] getIpmErrorElementType600() throws CFException  {              
   		return ipmErrorMsg600.getIpmErrorElementId600().getIpmErrorElementType600();
   }

  
	/**
	*  set variable ipmErrorElementType600
	*  @param value
	**/
   public void setIpmErrorElementType600(char[] value) throws CFException {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(value);
   } 

     /**
	 * 	Update IpmErrorElementType600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorElementType600(char[] source, int sourceIndex) throws CFException {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(source, sourceIndex);
   	
   }
   
   public void setIpmErrorElementType600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorElementType600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementType600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorElementType600 with another Field
	 *	@param value
	 */
   public void setIpmErrorElementType600(Field source) {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(source);
   }  
   
     /**
	 * 	Update IpmErrorElementType600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorElementType600(Field source, int sourceIndex,int sourceLen) {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IpmErrorElementType600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementType600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errorCode600
	 *	@return errorCode600
	 */
	public long getErrorCode600() throws CFException {
   		return ipmErrorMsg600.getErrorCode600();
	}


	/**
	 *	Returns String value of errorCode600
	 *	@return errorCode600
	 */
	public char[]  getErrorCode600String() throws CFException {
	     return String.valueOf(ipmErrorMsg600.getErrorCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorCode600IsNumeric()  throws CFException{
	    return ipmErrorMsg600.errorCode600IsNumeric();
	}

	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param number
	 */
	public void setErrorCode600(long number)  throws CFException{
		ipmErrorMsg600.setErrorCode600(number);
	}
	

	
	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorCode600(char[] value)  throws CFException {
		ipmErrorMsg600.setErrorCode600(value);
	}
	
	/**
	 * 	Update ErrorCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorCode600String(char[] value)  throws CFException{
		ipmErrorMsg600.setErrorCode600(value);
	}	

	/**
	 *	Returns the value of newNo800
	 *	@return newNo800
	 */
	public short getNewNo800() throws CFException {        
   		return newTag800.getNewNo800();
	}
	
	/**
	 * 	Update NewNo800 with the passed value
	 *	@param number
	 */
	public void setNewNo800(short number)  throws CFException{
		newTag800.setNewNo800(number);
	}

	public void setNewNo800(int number)  throws CFException{
		newTag800.setNewNo800((short)number);
	}

	public void setNewNo800(long number)  throws CFException{
		newTag800.setNewNo800((short)number);
	}



	/**
	 *	Returns the value of newStart800
	 *	@return newStart800
	 */
	public short getNewStart800() throws CFException {        
   		return newTag800.getNewStart800();
	}
	
	/**
	 * 	Update NewStart800 with the passed value
	 *	@param number
	 */
	public void setNewStart800(short number)  throws CFException{
		newTag800.setNewStart800(number);
	}

	public void setNewStart800(int number)  throws CFException{
		newTag800.setNewStart800((short)number);
	}

	public void setNewStart800(long number)  throws CFException{
		newTag800.setNewStart800((short)number);
	}



	/**
	 *	Returns the value of ip65504TagStarts
	 *	@return ip65504TagStarts
	 */
	public short getIp65504TagStarts(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagStarts();
	}
	
	/**
	 * 	Update Ip65504TagStarts with the passed value
	 *	@param number
	 */
	public void setIp65504TagStarts(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts(number);
	}

	public void setIp65504TagStarts(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}

	public void setIp65504TagStarts(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}



	/**
	 *	Returns the value of noBackslashCode600
	 *	@return noBackslashCode600
	 */
	public int getNoBackslashCode600() throws CFException {        
   		return work.getNoBackslashCode600();
	}
	
	/**
	 * 	Update NoBackslashCode600 with the passed value
	 *	@param number
	 */
	public void setNoBackslashCode600(int number)  throws CFException{
		work.setNoBackslashCode600(number);
	}


	public void setNoBackslashCode600(long number)  throws CFException{
		work.setNoBackslashCode600((int)number);
	}


	/**
	 *	Returns the value of ip65504TagLngth
	 *	@return ip65504TagLngth
	 */
	public short getIp65504TagLngth(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagLngth();
	}
	
	/**
	 * 	Update Ip65504TagLngth with the passed value
	 *	@param number
	 */
	public void setIp65504TagLngth(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth(number);
	}

	public void setIp65504TagLngth(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth((short)number);
	}

	public void setIp65504TagLngth(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth((short)number);
	}



	/**
	 *	Returns the value of subfldLength400
	 *	@return subfldLength400
	 */
	public short getSubfldLength400() throws CFException {        
   		return work.getSubfldLength400();
	}
	
	/**
	 * 	Update SubfldLength400 with the passed value
	 *	@param number
	 */
	public void setSubfldLength400(short number)  throws CFException{
		work.setSubfldLength400(number);
	}

	public void setSubfldLength400(int number)  throws CFException{
		work.setSubfldLength400((short)number);
	}

	public void setSubfldLength400(long number)  throws CFException{
		work.setSubfldLength400((short)number);
	}



	/**
	 *	Returns the value of ip65504TagType
	 *	@return ip65504TagType
	 */
	public short getIp65504TagType(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagType();
	}
	
	/**
	 * 	Update Ip65504TagType with the passed value
	 *	@param number
	 */
	public void setIp65504TagType(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType(number);
	}

	public void setIp65504TagType(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}

	public void setIp65504TagType(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}



	/**
	 *	Returns the value of ipmErrorText600
	 *	@return ipmErrorText600
	 */
   public char[] getIpmErrorText600() throws CFException  {              
   		return ipmErrorMsg600.getIpmErrorText600();
   }

  
	/**
	*  set variable ipmErrorText600
	*  @param value
	**/
   public void setIpmErrorText600(char[] value) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(value);
   } 

     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex);
   	
   }
   
   public void setIpmErrorText600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorText600 with another Field
	 *	@param value
	 */
   public void setIpmErrorText600(Field source) {
      ipmErrorMsg600.setIpmErrorText600(source);
   }  
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of noBackslashNdx600
	 *	@return noBackslashNdx600
	 */
	public int getNoBackslashNdx600() throws CFException {        
   		return work.getNoBackslashNdx600();
	}
	
	/**
	 * 	Update NoBackslashNdx600 with the passed value
	 *	@param number
	 */
	public void setNoBackslashNdx600(int number)  throws CFException{
		work.setNoBackslashNdx600(number);
	}


	public void setNoBackslashNdx600(long number)  throws CFException{
		work.setNoBackslashNdx600((int)number);
	}


	/**
	 *	Returns the value of ip65504MessageStatus
	 *	@return ip65504MessageStatus
	 */
	public short getIp65504MessageStatus() throws CFException {        
   		return ip65504MessageStatusGroup.getIp65504MessageStatus();
	}
	
	/**
	 * 	Update Ip65504MessageStatus with the passed value
	 *	@param number
	 */
	public void setIp65504MessageStatus(short number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus(number);
	}

	public void setIp65504MessageStatus(int number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}

	public void setIp65504MessageStatus(long number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}



	/**
	 *	Test condition "Y" for isVarSubfExists88100()
	 *	@return  Returns true if isVarSubfExists88100() is "Y"
	 */
   public boolean isVarSubfExists88100() throws CFException {
      return work.isVarSubfExists88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setVarSubfExists88100True()  throws CFException{  			
    	work.setVarSubfExists88100True();
   	}

        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += newTag800.hashCode();
        str += ip65504CurrentTagTable.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += ip000704DeSubAttrTable.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public DoDelimitedSubfldOutCtx clone() {
        DoDelimitedSubfldOutCtx cloneObj = new DoDelimitedSubfldOutCtx();
        cloneObj.newTag800 = new NewTag800();
        cloneObj.newTag800.set(newTag800.getClonedField());
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.ip000704DeSubAttrTable = new Ip000704DeSubAttrTable();
        cloneObj.ip000704DeSubAttrTable.set(ip000704DeSubAttrTable.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public DoDelimitedSubfldOutCtx getDoDelimitedSubfldOutCtx() {
            return new DoDelimitedSubfldOutCtx();
    }
     public class CheckTagLimitInCtx implements Cloneable {
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     TooManyTags600 tooManyTags600 = Ip662010Ctx.this.getTooManyTags600();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();

	/**
	 *	Returns the value of tooManyTagsCode600
	 *	@return tooManyTagsCode600
	 */
	public int getTooManyTagsCode600() throws CFException {        
   		return work.getTooManyTagsCode600();
	}
	
	/**
	 * 	Update TooManyTagsCode600 with the passed value
	 *	@param number
	 */
	public void setTooManyTagsCode600(int number)  throws CFException{
		work.setTooManyTagsCode600(number);
	}


	public void setTooManyTagsCode600(long number)  throws CFException{
		work.setTooManyTagsCode600((int)number);
	}


	/**
	 *	Returns the value of tooManyTags600
	 *	@return tooManyTags600
	 */   
	 public TooManyTags600 getTooManyTags600() {
   	return tooManyTags600;
   }



public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of tooManyTagsNdx600
	 *	@return tooManyTagsNdx600
	 */
	public int getTooManyTagsNdx600() throws CFException {        
   		return work.getTooManyTagsNdx600();
	}
	
	/**
	 * 	Update TooManyTagsNdx600 with the passed value
	 *	@param number
	 */
	public void setTooManyTagsNdx600(int number)  throws CFException{
		work.setTooManyTagsNdx600(number);
	}


	public void setTooManyTagsNdx600(long number)  throws CFException{
		work.setTooManyTagsNdx600((int)number);
	}


	/**
	 *	Returns the value of k400
	 *	@return k400
	 */
	public short getK400() throws CFException {        
   		return work.getK400();
	}
	
	/**
	 * 	Update K400 with the passed value
	 *	@param number
	 */
	public void setK400(short number)  throws CFException{
		work.setK400(number);
	}

	public void setK400(int number)  throws CFException{
		work.setK400((short)number);
	}

	public void setK400(long number)  throws CFException{
		work.setK400((short)number);
	}



	/**
	 *	Returns the value of maxTagNoX800
	 *	@return maxTagNoX800
	 */
	public int getMaxTagNoX800() throws CFException {        
   		return maxTagNoX800;
	}
	
	/**
	 * 	Update MaxTagNoX800 with the passed value
	 *	@param number
	 */
	public void setMaxTagNoX800(int number)  throws CFException{
		Ip662010Ctx.this.setMaxTagNoX800(number);
	}


	public void setMaxTagNoX800(long number)  throws CFException{
		Ip662010Ctx.this.setMaxTagNoX800((int)number);
	}



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public CheckTagLimitOutCtx getCheckTagLimitOutCtx() {
            return new CheckTagLimitOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip662011ErrSubscriptGroup.hashCode();
        str += tooManyTags600.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ipmErrorMsg600.hashCode();
       return str.hashCode();
    }

    public CheckTagLimitInCtx clone() {
        CheckTagLimitInCtx cloneObj = new CheckTagLimitInCtx();
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.tooManyTags600 = new TooManyTags600();
        cloneObj.tooManyTags600.set(tooManyTags600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        return cloneObj;
    }

    }

    public CheckTagLimitInCtx getCheckTagLimitInCtx() {
            return new CheckTagLimitInCtx();
    }
     public class CheckTagLimitOutCtx implements Cloneable {
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     TooManyTags600 tooManyTags600 = Ip662010Ctx.this.getTooManyTags600();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();

	/**
	 *	Returns the value of tooManyTagsCode600
	 *	@return tooManyTagsCode600
	 */
	public int getTooManyTagsCode600() throws CFException {        
   		return work.getTooManyTagsCode600();
	}
	
	/**
	 * 	Update TooManyTagsCode600 with the passed value
	 *	@param number
	 */
	public void setTooManyTagsCode600(int number)  throws CFException{
		work.setTooManyTagsCode600(number);
	}


	public void setTooManyTagsCode600(long number)  throws CFException{
		work.setTooManyTagsCode600((int)number);
	}


	/**
	 *	Returns the value of tooManyTags600
	 *	@return tooManyTags600
	 */   
	 public TooManyTags600 getTooManyTags600() {
   	return tooManyTags600;
   }


	/**
	 *	Returns the value of ip662011ErrSubscript
	 *	@return ip662011ErrSubscript
	 */
	public int getIp662011ErrSubscript() throws CFException {        
   		return ip662011ErrSubscriptGroup.getIp662011ErrSubscript();
	}
	
	/**
	 * 	Update Ip662011ErrSubscript with the passed value
	 *	@param number
	 */
	public void setIp662011ErrSubscript(int number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript(number);
	}


	public void setIp662011ErrSubscript(long number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript((int)number);
	}


	/**
	 *	Returns the value of tooManyTagsNdx600
	 *	@return tooManyTagsNdx600
	 */
	public int getTooManyTagsNdx600() throws CFException {        
   		return work.getTooManyTagsNdx600();
	}
	
	/**
	 * 	Update TooManyTagsNdx600 with the passed value
	 *	@param number
	 */
	public void setTooManyTagsNdx600(int number)  throws CFException{
		work.setTooManyTagsNdx600(number);
	}


	public void setTooManyTagsNdx600(long number)  throws CFException{
		work.setTooManyTagsNdx600((int)number);
	}


	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of ipmErrorText600
	 *	@return ipmErrorText600
	 */
   public char[] getIpmErrorText600() throws CFException  {              
   		return ipmErrorMsg600.getIpmErrorText600();
   }

  
	/**
	*  set variable ipmErrorText600
	*  @param value
	**/
   public void setIpmErrorText600(char[] value) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(value);
   } 

     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex);
   	
   }
   
   public void setIpmErrorText600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorText600 with another Field
	 *	@param value
	 */
   public void setIpmErrorText600(Field source) {
      ipmErrorMsg600.setIpmErrorText600(source);
   }  
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504MessageStatus
	 *	@return ip65504MessageStatus
	 */
	public short getIp65504MessageStatus() throws CFException {        
   		return ip65504MessageStatusGroup.getIp65504MessageStatus();
	}
	
	/**
	 * 	Update Ip65504MessageStatus with the passed value
	 *	@param number
	 */
	public void setIp65504MessageStatus(short number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus(number);
	}

	public void setIp65504MessageStatus(int number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}

	public void setIp65504MessageStatus(long number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}



	/**
	 *	Returns the value of k400
	 *	@return k400
	 */
	public short getK400() throws CFException {        
   		return work.getK400();
	}
	
	/**
	 * 	Update K400 with the passed value
	 *	@param number
	 */
	public void setK400(short number)  throws CFException{
		work.setK400(number);
	}

	public void setK400(int number)  throws CFException{
		work.setK400((short)number);
	}

	public void setK400(long number)  throws CFException{
		work.setK400((short)number);
	}



	/**
	 *	Returns the value of errorCode600
	 *	@return errorCode600
	 */
	public long getErrorCode600() throws CFException {
   		return ipmErrorMsg600.getErrorCode600();
	}


	/**
	 *	Returns String value of errorCode600
	 *	@return errorCode600
	 */
	public char[]  getErrorCode600String() throws CFException {
	     return String.valueOf(ipmErrorMsg600.getErrorCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorCode600IsNumeric()  throws CFException{
	    return ipmErrorMsg600.errorCode600IsNumeric();
	}

	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param number
	 */
	public void setErrorCode600(long number)  throws CFException{
		ipmErrorMsg600.setErrorCode600(number);
	}
	

	
	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorCode600(char[] value)  throws CFException {
		ipmErrorMsg600.setErrorCode600(value);
	}
	
	/**
	 * 	Update ErrorCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorCode600String(char[] value)  throws CFException{
		ipmErrorMsg600.setErrorCode600(value);
	}	


        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip662011ErrSubscriptGroup.hashCode();
        str += tooManyTags600.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ipmErrorMsg600.hashCode();
       return str.hashCode();
    }

    public CheckTagLimitOutCtx clone() {
        CheckTagLimitOutCtx cloneObj = new CheckTagLimitOutCtx();
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.tooManyTags600 = new TooManyTags600();
        cloneObj.tooManyTags600.set(tooManyTags600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        return cloneObj;
    }

    }

    public CheckTagLimitOutCtx getCheckTagLimitOutCtx() {
            return new CheckTagLimitOutCtx();
    }
     public class EnterPdsInfoInCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     Ip000804PdsAttributes ip000804PdsAttributes = Ip662010Ctx.this.getIp000804PdsAttributes();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip662010Ctx.this.getIp65504PdsMapGroup();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();
     RemainingCarrLthNumGroup400 remainingCarrLthNumGroup400 = Ip662010Ctx.this.getRemainingCarrLthNumGroup400();
     Ip65504SelPdsEntriesAll ip65504SelPdsEntriesAll = Ip662010Ctx.this.getIp65504SelPdsEntriesAll();


public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}

public void setIp65504P(int ip65504P) { 
    Ip662010Ctx.this.ip65504P = ip65504P;
}

public int getIp65504P() { 
    return Ip662010Ctx.this.ip65504P;
}
	/**
	 *	Returns the value of pdsTag400
	 *	@return pdsTag400
	 */
	public short getPdsTag400() throws CFException {        
   		return work.getPdsTag400();
	}
	
	/**
	 * 	Update PdsTag400 with the passed value
	 *	@param number
	 */
	public void setPdsTag400(short number)  throws CFException{
		work.setPdsTag400(number);
	}

	public void setPdsTag400(int number)  throws CFException{
		work.setPdsTag400((short)number);
	}

	public void setPdsTag400(long number)  throws CFException{
		work.setPdsTag400((short)number);
	}



	/**
	 *	Returns the value of ip65504DeLngth
	 *	@return ip65504DeLngth
	 */
	public short getIp65504DeLngth(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeLngth();
	}
	
	/**
	 * 	Update Ip65504DeLngth with the passed value
	 *	@param number
	 */
	public void setIp65504DeLngth(int index,short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth(number);
	}

	public void setIp65504DeLngth(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
	}

	public void setIp65504DeLngth(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
	}



	/**
	 *	Returns the value of remainingCarrierLth400
	 *	@return remainingCarrierLth400
	 */
	public short getRemainingCarrierLth400() throws CFException {        
   		return work.getRemainingCarrierLth400();
	}
	
	/**
	 * 	Update RemainingCarrierLth400 with the passed value
	 *	@param number
	 */
	public void setRemainingCarrierLth400(short number)  throws CFException{
		work.setRemainingCarrierLth400(number);
	}

	public void setRemainingCarrierLth400(int number)  throws CFException{
		work.setRemainingCarrierLth400((short)number);
	}

	public void setRemainingCarrierLth400(long number)  throws CFException{
		work.setRemainingCarrierLth400((short)number);
	}



	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of nonNumericPdsId600
	 *	@return nonNumericPdsId600
	 */
   public char[] getNonNumericPdsId600() throws CFException  {              
   		return work.getNonNumericPdsId600();
   }

  
	/**
	*  set variable nonNumericPdsId600
	*  @param value
	**/
   public void setNonNumericPdsId600(char[] value) throws CFException {
      work.setNonNumericPdsId600(value);
   } 

	/**
	 *	Returns the value of remainingCarrLthNumX400
	 *	@return remainingCarrLthNumX400
	 */
   public char[] getRemainingCarrLthNumX400() throws CFException  {              
   		return remainingCarrLthNumGroup400.getRemainingCarrLthNumX400();
   }

  
	/**
	*  set variable remainingCarrLthNumX400
	*  @param value
	**/
   public void setRemainingCarrLthNumX400(char[] value) throws CFException {
      remainingCarrLthNumGroup400.setRemainingCarrLthNumX400(value);
   } 

     /**
	 * 	Update RemainingCarrLthNumX400 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRemainingCarrLthNumX400(char[] source, int sourceIndex) throws CFException {
      remainingCarrLthNumGroup400.setRemainingCarrLthNumX400(source, sourceIndex);
   	
   }
   
   public void setRemainingCarrLthNumX400(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      remainingCarrLthNumGroup400.setRemainingCarrLthNumX400(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RemainingCarrLthNumX400 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRemainingCarrLthNumX400(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      remainingCarrLthNumGroup400.setRemainingCarrLthNumX400(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RemainingCarrLthNumX400 with another Field
	 *	@param value
	 */
   public void setRemainingCarrLthNumX400(Field source) {
      remainingCarrLthNumGroup400.setRemainingCarrLthNumX400(source);
   }  
   
     /**
	 * 	Update RemainingCarrLthNumX400 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRemainingCarrLthNumX400(Field source, int sourceIndex,int sourceLen) {
      remainingCarrLthNumGroup400.setRemainingCarrLthNumX400(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RemainingCarrLthNumX400 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRemainingCarrLthNumX400(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      remainingCarrLthNumGroup400.setRemainingCarrLthNumX400(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip000804PdsSubflds
	 *	@return ip000804PdsSubflds
	 */
	public short getIp000804PdsSubflds(int index) throws CFException {        
   		return ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).getIp000804PdsSubflds();
	}
	
	/**
	 * 	Update Ip000804PdsSubflds with the passed value
	 *	@param number
	 */
	public void setIp000804PdsSubflds(int index,short number)  throws CFException{
		ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsSubflds(number);
	}

	public void setIp000804PdsSubflds(int index,int number)  throws CFException{
		ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsSubflds((short)number);
	}

	public void setIp000804PdsSubflds(int index,long number)  throws CFException{
		ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsSubflds((short)number);
	}



	/**
	 *	Returns the value of nonNumericPdsCode600
	 *	@return nonNumericPdsCode600
	 */
	public int getNonNumericPdsCode600() throws CFException {        
   		return work.getNonNumericPdsCode600();
	}
	
	/**
	 * 	Update NonNumericPdsCode600 with the passed value
	 *	@param number
	 */
	public void setNonNumericPdsCode600(int number)  throws CFException{
		work.setNonNumericPdsCode600(number);
	}


	public void setNonNumericPdsCode600(long number)  throws CFException{
		work.setNonNumericPdsCode600((int)number);
	}


	/**
	 *	Returns the value of nonNumericPdsNdx600
	 *	@return nonNumericPdsNdx600
	 */
	public int getNonNumericPdsNdx600() throws CFException {        
   		return work.getNonNumericPdsNdx600();
	}
	
	/**
	 * 	Update NonNumericPdsNdx600 with the passed value
	 *	@param number
	 */
	public void setNonNumericPdsNdx600(int number)  throws CFException{
		work.setNonNumericPdsNdx600(number);
	}


	public void setNonNumericPdsNdx600(long number)  throws CFException{
		work.setNonNumericPdsNdx600((int)number);
	}


	/**
	 *	Returns the value of i400
	 *	@return i400
	 */
	public short getI400() throws CFException {        
   		return work.getI400();
	}
	
	/**
	 * 	Update I400 with the passed value
	 *	@param number
	 */
	public void setI400(short number)  throws CFException{
		work.setI400(number);
	}

	public void setI400(int number)  throws CFException{
		work.setI400((short)number);
	}

	public void setI400(long number)  throws CFException{
		work.setI400((short)number);
	}



	/**
	 *	Returns the value of k400
	 *	@return k400
	 */
	public short getK400() throws CFException {        
   		return work.getK400();
	}
	
	/**
	 * 	Update K400 with the passed value
	 *	@param number
	 */
	public void setK400(short number)  throws CFException{
		work.setK400(number);
	}

	public void setK400(int number)  throws CFException{
		work.setK400((short)number);
	}

	public void setK400(long number)  throws CFException{
		work.setK400((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public EnterPdsInfoOutCtx getEnterPdsInfoOutCtx() {
            return new EnterPdsInfoOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ip000804PdsAttributes.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip65504PdsMapGroup.hashCode();
        str += ip66102IpmMsg.hashCode();
        str += remainingCarrLthNumGroup400.hashCode();
        str += ip65504SelPdsEntriesAll.hashCode();
       return str.hashCode();
    }

    public EnterPdsInfoInCtx clone() {
        EnterPdsInfoInCtx cloneObj = new EnterPdsInfoInCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ip000804PdsAttributes = new Ip000804PdsAttributes();
        cloneObj.ip000804PdsAttributes.set(ip000804PdsAttributes.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.remainingCarrLthNumGroup400 = new RemainingCarrLthNumGroup400();
        cloneObj.remainingCarrLthNumGroup400.set(remainingCarrLthNumGroup400.getClonedField());
        cloneObj.ip65504SelPdsEntriesAll = new Ip65504SelPdsEntriesAll();
        cloneObj.ip65504SelPdsEntriesAll.set(ip65504SelPdsEntriesAll.getClonedField());
        return cloneObj;
    }

    }

    public EnterPdsInfoInCtx getEnterPdsInfoInCtx() {
            return new EnterPdsInfoInCtx();
    }
     public class EnterPdsInfoOutCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     Ip000804PdsAttributes ip000804PdsAttributes = Ip662010Ctx.this.getIp000804PdsAttributes();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip662010Ctx.this.getIp65504PdsMapGroup();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();
     RemainingCarrLthNumGroup400 remainingCarrLthNumGroup400 = Ip662010Ctx.this.getRemainingCarrLthNumGroup400();
     Ip65504SelPdsEntriesAll ip65504SelPdsEntriesAll = Ip662010Ctx.this.getIp65504SelPdsEntriesAll();

	/**
	 *	Returns the value of ipmErrorPointerWidth600
	 *	@return ipmErrorPointerWidth600
	 */
	public short getIpmErrorPointerWidth600() throws CFException {        
   		return work.getIpmErrorPointerWidth600();
	}
	
	/**
	 * 	Update IpmErrorPointerWidth600 with the passed value
	 *	@param number
	 */
	public void setIpmErrorPointerWidth600(short number)  throws CFException{
		work.setIpmErrorPointerWidth600(number);
	}

	public void setIpmErrorPointerWidth600(int number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}

	public void setIpmErrorPointerWidth600(long number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}




public void setIp000804I(int ip000804I) { 
    Ip662010Ctx.this.ip000804I = ip000804I;
}

public int getIp000804I() { 
    return Ip662010Ctx.this.ip000804I;
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
	 *	Returns the value of pdsTag400
	 *	@return pdsTag400
	 */
	public short getPdsTag400() throws CFException {        
   		return work.getPdsTag400();
	}
	
	/**
	 * 	Update PdsTag400 with the passed value
	 *	@param number
	 */
	public void setPdsTag400(short number)  throws CFException{
		work.setPdsTag400(number);
	}

	public void setPdsTag400(int number)  throws CFException{
		work.setPdsTag400((short)number);
	}

	public void setPdsTag400(long number)  throws CFException{
		work.setPdsTag400((short)number);
	}



	/**
	 *	Returns the value of ip662011ErrSubscript
	 *	@return ip662011ErrSubscript
	 */
	public int getIp662011ErrSubscript() throws CFException {        
   		return ip662011ErrSubscriptGroup.getIp662011ErrSubscript();
	}
	
	/**
	 * 	Update Ip662011ErrSubscript with the passed value
	 *	@param number
	 */
	public void setIp662011ErrSubscript(int number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript(number);
	}


	public void setIp662011ErrSubscript(long number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript((int)number);
	}


	/**
	 *	Returns the value of remainingCarrierLth400
	 *	@return remainingCarrierLth400
	 */
	public short getRemainingCarrierLth400() throws CFException {        
   		return work.getRemainingCarrierLth400();
	}
	
	/**
	 * 	Update RemainingCarrierLth400 with the passed value
	 *	@param number
	 */
	public void setRemainingCarrierLth400(short number)  throws CFException{
		work.setRemainingCarrierLth400(number);
	}

	public void setRemainingCarrierLth400(int number)  throws CFException{
		work.setRemainingCarrierLth400((short)number);
	}

	public void setRemainingCarrierLth400(long number)  throws CFException{
		work.setRemainingCarrierLth400((short)number);
	}



	/**
	 *	Returns the value of nonNumericPdsId600
	 *	@return nonNumericPdsId600
	 */
   public char[] getNonNumericPdsId600() throws CFException  {              
   		return work.getNonNumericPdsId600();
   }

  
	/**
	*  set variable nonNumericPdsId600
	*  @param value
	**/
   public void setNonNumericPdsId600(char[] value) throws CFException {
      work.setNonNumericPdsId600(value);
   } 

	/**
	 *	Returns the value of errorCode600
	 *	@return errorCode600
	 */
	public long getErrorCode600() throws CFException {
   		return ipmErrorMsg600.getErrorCode600();
	}


	/**
	 *	Returns String value of errorCode600
	 *	@return errorCode600
	 */
	public char[]  getErrorCode600String() throws CFException {
	     return String.valueOf(ipmErrorMsg600.getErrorCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorCode600IsNumeric()  throws CFException{
	    return ipmErrorMsg600.errorCode600IsNumeric();
	}

	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param number
	 */
	public void setErrorCode600(long number)  throws CFException{
		ipmErrorMsg600.setErrorCode600(number);
	}
	

	
	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorCode600(char[] value)  throws CFException {
		ipmErrorMsg600.setErrorCode600(value);
	}
	
	/**
	 * 	Update ErrorCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorCode600String(char[] value)  throws CFException{
		ipmErrorMsg600.setErrorCode600(value);
	}	

	/**
	 *	Returns the value of pdsLength400
	 *	@return pdsLength400
	 */
	public short getPdsLength400() throws CFException {        
   		return work.getPdsLength400();
	}
	
	/**
	 * 	Update PdsLength400 with the passed value
	 *	@param number
	 */
	public void setPdsLength400(short number)  throws CFException{
		work.setPdsLength400(number);
	}

	public void setPdsLength400(int number)  throws CFException{
		work.setPdsLength400((short)number);
	}

	public void setPdsLength400(long number)  throws CFException{
		work.setPdsLength400((short)number);
	}



	/**
	 *	Returns the value of nonNumericPdsCode600
	 *	@return nonNumericPdsCode600
	 */
	public int getNonNumericPdsCode600() throws CFException {        
   		return work.getNonNumericPdsCode600();
	}
	
	/**
	 * 	Update NonNumericPdsCode600 with the passed value
	 *	@param number
	 */
	public void setNonNumericPdsCode600(int number)  throws CFException{
		work.setNonNumericPdsCode600(number);
	}


	public void setNonNumericPdsCode600(long number)  throws CFException{
		work.setNonNumericPdsCode600((int)number);
	}


	/**
	 *	Returns the value of nonNumericPdsNdx600
	 *	@return nonNumericPdsNdx600
	 */
	public int getNonNumericPdsNdx600() throws CFException {        
   		return work.getNonNumericPdsNdx600();
	}
	
	/**
	 * 	Update NonNumericPdsNdx600 with the passed value
	 *	@param number
	 */
	public void setNonNumericPdsNdx600(int number)  throws CFException{
		work.setNonNumericPdsNdx600(number);
	}


	public void setNonNumericPdsNdx600(long number)  throws CFException{
		work.setNonNumericPdsNdx600((int)number);
	}


	/**
	 *	Returns the value of ip65504TagLngth
	 *	@return ip65504TagLngth
	 */
	public short getIp65504TagLngth(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagLngth();
	}
	
	/**
	 * 	Update Ip65504TagLngth with the passed value
	 *	@param number
	 */
	public void setIp65504TagLngth(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth(number);
	}

	public void setIp65504TagLngth(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth((short)number);
	}

	public void setIp65504TagLngth(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth((short)number);
	}



	/**
	 *	Returns the value of remainingCarrLthNum400
	 *	@return remainingCarrLthNum400
	 */
	public int getRemainingCarrLthNum400() throws CFException {
   		return remainingCarrLthNumGroup400.getRemainingCarrLthNum400();
	}


	/**
	 *	Returns String value of remainingCarrLthNum400
	 *	@return remainingCarrLthNum400
	 */
	public char[]  getRemainingCarrLthNum400String() throws CFException {
	     return String.valueOf(remainingCarrLthNumGroup400.getRemainingCarrLthNum400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean remainingCarrLthNum400IsNumeric()  throws CFException{
	    return remainingCarrLthNumGroup400.remainingCarrLthNum400IsNumeric();
	}

	/**
	 * 	Update RemainingCarrLthNum400 with the passed value
	 *	@param number
	 */
	public void setRemainingCarrLthNum400(int number)  throws CFException{
		remainingCarrLthNumGroup400.setRemainingCarrLthNum400(number);
	}
	

	public void setRemainingCarrLthNum400(long number)  throws CFException{
	    remainingCarrLthNumGroup400.setRemainingCarrLthNum400(number);
	}
	
	
	/**
	 * 	Update RemainingCarrLthNum400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRemainingCarrLthNum400(char[] value)  throws CFException {
		remainingCarrLthNumGroup400.setRemainingCarrLthNum400(value);
	}
	
	/**
	 * 	Update RemainingCarrLthNum400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRemainingCarrLthNum400String(char[] value)  throws CFException{
		remainingCarrLthNumGroup400.setRemainingCarrLthNum400(value);
	}	

	/**
	 *	Returns the value of k400
	 *	@return k400
	 */
	public short getK400() throws CFException {        
   		return work.getK400();
	}
	
	/**
	 * 	Update K400 with the passed value
	 *	@param number
	 */
	public void setK400(short number)  throws CFException{
		work.setK400(number);
	}

	public void setK400(int number)  throws CFException{
		work.setK400((short)number);
	}

	public void setK400(long number)  throws CFException{
		work.setK400((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of ip65504TagNo
	 *	@return ip65504TagNo
	 */
	public short getIp65504TagNo(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagNo();
	}
	
	/**
	 * 	Update Ip65504TagNo with the passed value
	 *	@param number
	 */
	public void setIp65504TagNo(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo(number);
	}

	public void setIp65504TagNo(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}

	public void setIp65504TagNo(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of ip65504PdsLngth
	 *	@return ip65504PdsLngth
	 */
	public short getIp65504PdsLngth(int index) throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).getIp65504PdsLngth();
	}
	
	/**
	 * 	Update Ip65504PdsLngth with the passed value
	 *	@param number
	 */
	public void setIp65504PdsLngth(int index,short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsLngth(number);
	}

	public void setIp65504PdsLngth(int index,int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsLngth((short)number);
	}

	public void setIp65504PdsLngth(int index,long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsLngth((short)number);
	}




public void setIp65504P(int ip65504P) { 
    Ip662010Ctx.this.ip65504P = ip65504P;
}

public int getIp65504P() { 
    return Ip662010Ctx.this.ip65504P;
}
	/**
	 *	Returns the value of ip65504PdsStart
	 *	@return ip65504PdsStart
	 */
	public short getIp65504PdsStart(int index) throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).getIp65504PdsStart();
	}
	
	/**
	 * 	Update Ip65504PdsStart with the passed value
	 *	@param number
	 */
	public void setIp65504PdsStart(int index,short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsStart(number);
	}

	public void setIp65504PdsStart(int index,int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsStart((short)number);
	}

	public void setIp65504PdsStart(int index,long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsStart((short)number);
	}



	/**
	 *	Returns the value of ip65504DeLngth
	 *	@return ip65504DeLngth
	 */
	public short getIp65504DeLngth(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeLngth();
	}
	
	/**
	 * 	Update Ip65504DeLngth with the passed value
	 *	@param number
	 */
	public void setIp65504DeLngth(int index,short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth(number);
	}

	public void setIp65504DeLngth(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
	}

	public void setIp65504DeLngth(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
	}



	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of ip65504TagStarts
	 *	@return ip65504TagStarts
	 */
	public short getIp65504TagStarts(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagStarts();
	}
	
	/**
	 * 	Update Ip65504TagStarts with the passed value
	 *	@param number
	 */
	public void setIp65504TagStarts(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts(number);
	}

	public void setIp65504TagStarts(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}

	public void setIp65504TagStarts(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}



	/**
	 *	Returns the value of ip65504PdsMapEntry
	 *	@return ip65504PdsMapEntry
	 */   
	 public Ip65504PdsMapEntry getIp65504PdsMapEntry(int index) {
   	return ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index);
   }

    public List<Ip65504PdsMapEntry> getIp65504PdsMapEntry() {
        return ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry();
    }
   /**
	* 	Update Ip65504PdsMapEntry with the passed value
	*	@param value
	*/
   public void setIp65504PdsMapEntry(int index,char[] value) throws CFException {
      ip65504PdsMapGroup.getIp65504PdsMap().setIp65504PdsMapEntry((index),value);
   }   


	/**
	 *	Returns the value of ip65504TagType
	 *	@return ip65504TagType
	 */
	public short getIp65504TagType(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagType();
	}
	
	/**
	 * 	Update Ip65504TagType with the passed value
	 *	@param number
	 */
	public void setIp65504TagType(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType(number);
	}

	public void setIp65504TagType(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}

	public void setIp65504TagType(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}



	/**
	 *	Returns the value of ipmErrorText600
	 *	@return ipmErrorText600
	 */
   public char[] getIpmErrorText600() throws CFException  {              
   		return ipmErrorMsg600.getIpmErrorText600();
   }

  
	/**
	*  set variable ipmErrorText600
	*  @param value
	**/
   public void setIpmErrorText600(char[] value) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(value);
   } 

     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex);
   	
   }
   
   public void setIpmErrorText600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorText600 with another Field
	 *	@param value
	 */
   public void setIpmErrorText600(Field source) {
      ipmErrorMsg600.setIpmErrorText600(source);
   }  
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504MessageStatus
	 *	@return ip65504MessageStatus
	 */
	public short getIp65504MessageStatus() throws CFException {        
   		return ip65504MessageStatusGroup.getIp65504MessageStatus();
	}
	
	/**
	 * 	Update Ip65504MessageStatus with the passed value
	 *	@param number
	 */
	public void setIp65504MessageStatus(short number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus(number);
	}

	public void setIp65504MessageStatus(int number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}

	public void setIp65504MessageStatus(long number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ip000804PdsAttributes.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip65504PdsMapGroup.hashCode();
        str += ip66102IpmMsg.hashCode();
        str += remainingCarrLthNumGroup400.hashCode();
        str += ip65504SelPdsEntriesAll.hashCode();
       return str.hashCode();
    }

    public EnterPdsInfoOutCtx clone() {
        EnterPdsInfoOutCtx cloneObj = new EnterPdsInfoOutCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ip000804PdsAttributes = new Ip000804PdsAttributes();
        cloneObj.ip000804PdsAttributes.set(ip000804PdsAttributes.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.remainingCarrLthNumGroup400 = new RemainingCarrLthNumGroup400();
        cloneObj.remainingCarrLthNumGroup400.set(remainingCarrLthNumGroup400.getClonedField());
        cloneObj.ip65504SelPdsEntriesAll = new Ip65504SelPdsEntriesAll();
        cloneObj.ip65504SelPdsEntriesAll.set(ip65504SelPdsEntriesAll.getClonedField());
        return cloneObj;
    }

    }

    public EnterPdsInfoOutCtx getEnterPdsInfoOutCtx() {
            return new EnterPdsInfoOutCtx();
    }
     public class _1CheckForValidPdsNoInCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     UndefinedPds600 undefinedPds600 = Ip662010Ctx.this.getUndefinedPds600();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     Ip000804PdsAttributes ip000804PdsAttributes = Ip662010Ctx.this.getIp000804PdsAttributes();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();

	/**
	 *	Returns the value of undefinedPdsNdx600
	 *	@return undefinedPdsNdx600
	 */
	public int getUndefinedPdsNdx600() throws CFException {        
   		return work.getUndefinedPdsNdx600();
	}
	
	/**
	 * 	Update UndefinedPdsNdx600 with the passed value
	 *	@param number
	 */
	public void setUndefinedPdsNdx600(int number)  throws CFException{
		work.setUndefinedPdsNdx600(number);
	}


	public void setUndefinedPdsNdx600(long number)  throws CFException{
		work.setUndefinedPdsNdx600((int)number);
	}


	/**
	 *	Returns the value of undefinedPdsCode600
	 *	@return undefinedPdsCode600
	 */
	public int getUndefinedPdsCode600() throws CFException {        
   		return work.getUndefinedPdsCode600();
	}
	
	/**
	 * 	Update UndefinedPdsCode600 with the passed value
	 *	@param number
	 */
	public void setUndefinedPdsCode600(int number)  throws CFException{
		work.setUndefinedPdsCode600(number);
	}


	public void setUndefinedPdsCode600(long number)  throws CFException{
		work.setUndefinedPdsCode600((int)number);
	}


	/**
	 *	Returns the value of undefinedPds600
	 *	@return undefinedPds600
	 */   
	 public UndefinedPds600 getUndefinedPds600() {
   	return undefinedPds600;
   }



public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of pdsTag400
	 *	@return pdsTag400
	 */
	public short getPdsTag400() throws CFException {        
   		return work.getPdsTag400();
	}
	
	/**
	 * 	Update PdsTag400 with the passed value
	 *	@param number
	 */
	public void setPdsTag400(short number)  throws CFException{
		work.setPdsTag400(number);
	}

	public void setPdsTag400(int number)  throws CFException{
		work.setPdsTag400((short)number);
	}

	public void setPdsTag400(long number)  throws CFException{
		work.setPdsTag400((short)number);
	}



	/**
	 *	Returns the value of ip000804MaxPdsNo
	 *	@return ip000804MaxPdsNo
	 */
	public short getIp000804MaxPdsNo() throws CFException {        
   		return ip000804PdsAttributes.getIp000804MaxPdsNo();
	}
	
	/**
	 * 	Update Ip000804MaxPdsNo with the passed value
	 *	@param number
	 */
	public void setIp000804MaxPdsNo(short number)  throws CFException{
		ip000804PdsAttributes.setIp000804MaxPdsNo(number);
	}

	public void setIp000804MaxPdsNo(int number)  throws CFException{
		ip000804PdsAttributes.setIp000804MaxPdsNo((short)number);
	}

	public void setIp000804MaxPdsNo(long number)  throws CFException{
		ip000804PdsAttributes.setIp000804MaxPdsNo((short)number);
	}



	/**
	 *	Returns the value of k400
	 *	@return k400
	 */
	public short getK400() throws CFException {        
   		return work.getK400();
	}
	
	/**
	 * 	Update K400 with the passed value
	 *	@param number
	 */
	public void setK400(short number)  throws CFException{
		work.setK400(number);
	}

	public void setK400(int number)  throws CFException{
		work.setK400((short)number);
	}

	public void setK400(long number)  throws CFException{
		work.setK400((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public _1CheckForValidPdsNoOutCtx get_1CheckForValidPdsNoOutCtx() {
            return new _1CheckForValidPdsNoOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += undefinedPds600.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ip000804PdsAttributes.hashCode();
        str += ipmErrorMsg600.hashCode();
       return str.hashCode();
    }

    public _1CheckForValidPdsNoInCtx clone() {
        _1CheckForValidPdsNoInCtx cloneObj = new _1CheckForValidPdsNoInCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.undefinedPds600 = new UndefinedPds600();
        cloneObj.undefinedPds600.set(undefinedPds600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ip000804PdsAttributes = new Ip000804PdsAttributes();
        cloneObj.ip000804PdsAttributes.set(ip000804PdsAttributes.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        return cloneObj;
    }

    }

    public _1CheckForValidPdsNoInCtx get_1CheckForValidPdsNoInCtx() {
            return new _1CheckForValidPdsNoInCtx();
    }
     public class _1CheckForValidPdsNoOutCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     UndefinedPds600 undefinedPds600 = Ip662010Ctx.this.getUndefinedPds600();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     Ip000804PdsAttributes ip000804PdsAttributes = Ip662010Ctx.this.getIp000804PdsAttributes();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();

	/**
	 *	Returns the value of ip65504TagNo
	 *	@return ip65504TagNo
	 */
	public short getIp65504TagNo(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagNo();
	}
	
	/**
	 * 	Update Ip65504TagNo with the passed value
	 *	@param number
	 */
	public void setIp65504TagNo(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo(number);
	}

	public void setIp65504TagNo(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}

	public void setIp65504TagNo(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}



	/**
	 *	Returns the value of undefinedPdsNdx600
	 *	@return undefinedPdsNdx600
	 */
	public int getUndefinedPdsNdx600() throws CFException {        
   		return work.getUndefinedPdsNdx600();
	}
	
	/**
	 * 	Update UndefinedPdsNdx600 with the passed value
	 *	@param number
	 */
	public void setUndefinedPdsNdx600(int number)  throws CFException{
		work.setUndefinedPdsNdx600(number);
	}


	public void setUndefinedPdsNdx600(long number)  throws CFException{
		work.setUndefinedPdsNdx600((int)number);
	}


	/**
	 *	Returns the value of pdsTag400
	 *	@return pdsTag400
	 */
	public short getPdsTag400() throws CFException {        
   		return work.getPdsTag400();
	}
	
	/**
	 * 	Update PdsTag400 with the passed value
	 *	@param number
	 */
	public void setPdsTag400(short number)  throws CFException{
		work.setPdsTag400(number);
	}

	public void setPdsTag400(int number)  throws CFException{
		work.setPdsTag400((short)number);
	}

	public void setPdsTag400(long number)  throws CFException{
		work.setPdsTag400((short)number);
	}



	/**
	 *	Returns the value of ip662011ErrSubscript
	 *	@return ip662011ErrSubscript
	 */
	public int getIp662011ErrSubscript() throws CFException {        
   		return ip662011ErrSubscriptGroup.getIp662011ErrSubscript();
	}
	
	/**
	 * 	Update Ip662011ErrSubscript with the passed value
	 *	@param number
	 */
	public void setIp662011ErrSubscript(int number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript(number);
	}


	public void setIp662011ErrSubscript(long number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript((int)number);
	}


	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of errorCode600
	 *	@return errorCode600
	 */
	public long getErrorCode600() throws CFException {
   		return ipmErrorMsg600.getErrorCode600();
	}


	/**
	 *	Returns String value of errorCode600
	 *	@return errorCode600
	 */
	public char[]  getErrorCode600String() throws CFException {
	     return String.valueOf(ipmErrorMsg600.getErrorCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorCode600IsNumeric()  throws CFException{
	    return ipmErrorMsg600.errorCode600IsNumeric();
	}

	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param number
	 */
	public void setErrorCode600(long number)  throws CFException{
		ipmErrorMsg600.setErrorCode600(number);
	}
	

	
	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorCode600(char[] value)  throws CFException {
		ipmErrorMsg600.setErrorCode600(value);
	}
	
	/**
	 * 	Update ErrorCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorCode600String(char[] value)  throws CFException{
		ipmErrorMsg600.setErrorCode600(value);
	}	

	/**
	 *	Returns the value of undefinedPdsCode600
	 *	@return undefinedPdsCode600
	 */
	public int getUndefinedPdsCode600() throws CFException {        
   		return work.getUndefinedPdsCode600();
	}
	
	/**
	 * 	Update UndefinedPdsCode600 with the passed value
	 *	@param number
	 */
	public void setUndefinedPdsCode600(int number)  throws CFException{
		work.setUndefinedPdsCode600(number);
	}


	public void setUndefinedPdsCode600(long number)  throws CFException{
		work.setUndefinedPdsCode600((int)number);
	}


	/**
	 *	Returns the value of undefinedPds600
	 *	@return undefinedPds600
	 */   
	 public UndefinedPds600 getUndefinedPds600() {
   	return undefinedPds600;
   }


	/**
	 *	Returns the value of undefinedPdsNo600
	 *	@return undefinedPdsNo600
	 */
	public int getUndefinedPdsNo600() throws CFException {
   		return undefinedPds600.getUndefinedPdsNo600();
	}


	/**
	 *	Returns String value of undefinedPdsNo600
	 *	@return undefinedPdsNo600
	 */
	public char[]  getUndefinedPdsNo600String() throws CFException {
	     return String.valueOf(undefinedPds600.getUndefinedPdsNo600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean undefinedPdsNo600IsNumeric()  throws CFException{
	    return undefinedPds600.undefinedPdsNo600IsNumeric();
	}

	/**
	 * 	Update UndefinedPdsNo600 with the passed value
	 *	@param number
	 */
	public void setUndefinedPdsNo600(int number)  throws CFException{
		undefinedPds600.setUndefinedPdsNo600(number);
	}
	

	public void setUndefinedPdsNo600(long number)  throws CFException{
	    undefinedPds600.setUndefinedPdsNo600(number);
	}
	
	
	/**
	 * 	Update UndefinedPdsNo600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setUndefinedPdsNo600(char[] value)  throws CFException {
		undefinedPds600.setUndefinedPdsNo600(value);
	}
	
	/**
	 * 	Update UndefinedPdsNo600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setUndefinedPdsNo600String(char[] value)  throws CFException{
		undefinedPds600.setUndefinedPdsNo600(value);
	}	

	/**
	 *	Returns the value of ip65504TagType
	 *	@return ip65504TagType
	 */
	public short getIp65504TagType(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagType();
	}
	
	/**
	 * 	Update Ip65504TagType with the passed value
	 *	@param number
	 */
	public void setIp65504TagType(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType(number);
	}

	public void setIp65504TagType(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}

	public void setIp65504TagType(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}



	/**
	 *	Returns the value of ipmErrorText600
	 *	@return ipmErrorText600
	 */
   public char[] getIpmErrorText600() throws CFException  {              
   		return ipmErrorMsg600.getIpmErrorText600();
   }

  
	/**
	*  set variable ipmErrorText600
	*  @param value
	**/
   public void setIpmErrorText600(char[] value) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(value);
   } 

     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex);
   	
   }
   
   public void setIpmErrorText600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorText600 with another Field
	 *	@param value
	 */
   public void setIpmErrorText600(Field source) {
      ipmErrorMsg600.setIpmErrorText600(source);
   }  
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504MessageStatus
	 *	@return ip65504MessageStatus
	 */
	public short getIp65504MessageStatus() throws CFException {        
   		return ip65504MessageStatusGroup.getIp65504MessageStatus();
	}
	
	/**
	 * 	Update Ip65504MessageStatus with the passed value
	 *	@param number
	 */
	public void setIp65504MessageStatus(short number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus(number);
	}

	public void setIp65504MessageStatus(int number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}

	public void setIp65504MessageStatus(long number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}



	/**
	 *	Returns the value of k400
	 *	@return k400
	 */
	public short getK400() throws CFException {        
   		return work.getK400();
	}
	
	/**
	 * 	Update K400 with the passed value
	 *	@param number
	 */
	public void setK400(short number)  throws CFException{
		work.setK400(number);
	}

	public void setK400(int number)  throws CFException{
		work.setK400((short)number);
	}

	public void setK400(long number)  throws CFException{
		work.setK400((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += undefinedPds600.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ip000804PdsAttributes.hashCode();
        str += ipmErrorMsg600.hashCode();
       return str.hashCode();
    }

    public _1CheckForValidPdsNoOutCtx clone() {
        _1CheckForValidPdsNoOutCtx cloneObj = new _1CheckForValidPdsNoOutCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.undefinedPds600 = new UndefinedPds600();
        cloneObj.undefinedPds600.set(undefinedPds600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ip000804PdsAttributes = new Ip000804PdsAttributes();
        cloneObj.ip000804PdsAttributes.set(ip000804PdsAttributes.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        return cloneObj;
    }

    }

    public _1CheckForValidPdsNoOutCtx get_1CheckForValidPdsNoOutCtx() {
            return new _1CheckForValidPdsNoOutCtx();
    }
     public class CheckForDuplicatePdsInCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip662010Ctx.this.getIp65504PdsMapGroup();

	/**
	 *	Returns the value of duplicatePdsNdx600
	 *	@return duplicatePdsNdx600
	 */
	public int getDuplicatePdsNdx600() throws CFException {        
   		return work.getDuplicatePdsNdx600();
	}
	
	/**
	 * 	Update DuplicatePdsNdx600 with the passed value
	 *	@param number
	 */
	public void setDuplicatePdsNdx600(int number)  throws CFException{
		work.setDuplicatePdsNdx600(number);
	}


	public void setDuplicatePdsNdx600(long number)  throws CFException{
		work.setDuplicatePdsNdx600((int)number);
	}



public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of duplicatePds600
	 *	@return duplicatePds600
	 */
   public char[] getDuplicatePds600() throws CFException  {              
   		return work.getDuplicatePds600();
   }

  
	/**
	*  set variable duplicatePds600
	*  @param value
	**/
   public void setDuplicatePds600(char[] value) throws CFException {
      work.setDuplicatePds600(value);
   } 

	/**
	 *	Returns the value of ip65504PdsStart
	 *	@return ip65504PdsStart
	 */
	public short getIp65504PdsStart(int index) throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).getIp65504PdsStart();
	}
	
	/**
	 * 	Update Ip65504PdsStart with the passed value
	 *	@param number
	 */
	public void setIp65504PdsStart(int index,short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsStart(number);
	}

	public void setIp65504PdsStart(int index,int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsStart((short)number);
	}

	public void setIp65504PdsStart(int index,long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsStart((short)number);
	}



	/**
	 *	Returns the value of pdsTag400
	 *	@return pdsTag400
	 */
	public short getPdsTag400() throws CFException {        
   		return work.getPdsTag400();
	}
	
	/**
	 * 	Update PdsTag400 with the passed value
	 *	@param number
	 */
	public void setPdsTag400(short number)  throws CFException{
		work.setPdsTag400(number);
	}

	public void setPdsTag400(int number)  throws CFException{
		work.setPdsTag400((short)number);
	}

	public void setPdsTag400(long number)  throws CFException{
		work.setPdsTag400((short)number);
	}



	/**
	 *	Returns the value of duplicatePdsCode600
	 *	@return duplicatePdsCode600
	 */
	public int getDuplicatePdsCode600() throws CFException {        
   		return work.getDuplicatePdsCode600();
	}
	
	/**
	 * 	Update DuplicatePdsCode600 with the passed value
	 *	@param number
	 */
	public void setDuplicatePdsCode600(int number)  throws CFException{
		work.setDuplicatePdsCode600(number);
	}


	public void setDuplicatePdsCode600(long number)  throws CFException{
		work.setDuplicatePdsCode600((int)number);
	}


	/**
	 *	Returns the value of k400
	 *	@return k400
	 */
	public short getK400() throws CFException {        
   		return work.getK400();
	}
	
	/**
	 * 	Update K400 with the passed value
	 *	@param number
	 */
	public void setK400(short number)  throws CFException{
		work.setK400(number);
	}

	public void setK400(int number)  throws CFException{
		work.setK400((short)number);
	}

	public void setK400(long number)  throws CFException{
		work.setK400((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public CheckForDuplicatePdsOutCtx getCheckForDuplicatePdsOutCtx() {
            return new CheckForDuplicatePdsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += ip65504PdsMapGroup.hashCode();
       return str.hashCode();
    }

    public CheckForDuplicatePdsInCtx clone() {
        CheckForDuplicatePdsInCtx cloneObj = new CheckForDuplicatePdsInCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        return cloneObj;
    }

    }

    public CheckForDuplicatePdsInCtx getCheckForDuplicatePdsInCtx() {
            return new CheckForDuplicatePdsInCtx();
    }
     public class CheckForDuplicatePdsOutCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip662010Ctx.this.getIp65504PdsMapGroup();

	/**
	 *	Returns the value of ip65504TagNo
	 *	@return ip65504TagNo
	 */
	public short getIp65504TagNo(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagNo();
	}
	
	/**
	 * 	Update Ip65504TagNo with the passed value
	 *	@param number
	 */
	public void setIp65504TagNo(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo(number);
	}

	public void setIp65504TagNo(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}

	public void setIp65504TagNo(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of pdsTag400
	 *	@return pdsTag400
	 */
	public short getPdsTag400() throws CFException {        
   		return work.getPdsTag400();
	}
	
	/**
	 * 	Update PdsTag400 with the passed value
	 *	@param number
	 */
	public void setPdsTag400(short number)  throws CFException{
		work.setPdsTag400(number);
	}

	public void setPdsTag400(int number)  throws CFException{
		work.setPdsTag400((short)number);
	}

	public void setPdsTag400(long number)  throws CFException{
		work.setPdsTag400((short)number);
	}



	/**
	 *	Returns the value of duplicatePdsCode600
	 *	@return duplicatePdsCode600
	 */
	public int getDuplicatePdsCode600() throws CFException {        
   		return work.getDuplicatePdsCode600();
	}
	
	/**
	 * 	Update DuplicatePdsCode600 with the passed value
	 *	@param number
	 */
	public void setDuplicatePdsCode600(int number)  throws CFException{
		work.setDuplicatePdsCode600(number);
	}


	public void setDuplicatePdsCode600(long number)  throws CFException{
		work.setDuplicatePdsCode600((int)number);
	}


	/**
	 *	Returns the value of ip662011ErrSubscript
	 *	@return ip662011ErrSubscript
	 */
	public int getIp662011ErrSubscript() throws CFException {        
   		return ip662011ErrSubscriptGroup.getIp662011ErrSubscript();
	}
	
	/**
	 * 	Update Ip662011ErrSubscript with the passed value
	 *	@param number
	 */
	public void setIp662011ErrSubscript(int number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript(number);
	}


	public void setIp662011ErrSubscript(long number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript((int)number);
	}


	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of errorCode600
	 *	@return errorCode600
	 */
	public long getErrorCode600() throws CFException {
   		return ipmErrorMsg600.getErrorCode600();
	}


	/**
	 *	Returns String value of errorCode600
	 *	@return errorCode600
	 */
	public char[]  getErrorCode600String() throws CFException {
	     return String.valueOf(ipmErrorMsg600.getErrorCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorCode600IsNumeric()  throws CFException{
	    return ipmErrorMsg600.errorCode600IsNumeric();
	}

	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param number
	 */
	public void setErrorCode600(long number)  throws CFException{
		ipmErrorMsg600.setErrorCode600(number);
	}
	

	
	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorCode600(char[] value)  throws CFException {
		ipmErrorMsg600.setErrorCode600(value);
	}
	
	/**
	 * 	Update ErrorCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorCode600String(char[] value)  throws CFException{
		ipmErrorMsg600.setErrorCode600(value);
	}	

	/**
	 *	Returns the value of duplicatePdsNdx600
	 *	@return duplicatePdsNdx600
	 */
	public int getDuplicatePdsNdx600() throws CFException {        
   		return work.getDuplicatePdsNdx600();
	}
	
	/**
	 * 	Update DuplicatePdsNdx600 with the passed value
	 *	@param number
	 */
	public void setDuplicatePdsNdx600(int number)  throws CFException{
		work.setDuplicatePdsNdx600(number);
	}


	public void setDuplicatePdsNdx600(long number)  throws CFException{
		work.setDuplicatePdsNdx600((int)number);
	}


	/**
	 *	Returns the value of duplicatePds600
	 *	@return duplicatePds600
	 */
   public char[] getDuplicatePds600() throws CFException  {              
   		return work.getDuplicatePds600();
   }

  
	/**
	*  set variable duplicatePds600
	*  @param value
	**/
   public void setDuplicatePds600(char[] value) throws CFException {
      work.setDuplicatePds600(value);
   } 

	/**
	 *	Returns the value of ip65504TagType
	 *	@return ip65504TagType
	 */
	public short getIp65504TagType(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagType();
	}
	
	/**
	 * 	Update Ip65504TagType with the passed value
	 *	@param number
	 */
	public void setIp65504TagType(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType(number);
	}

	public void setIp65504TagType(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}

	public void setIp65504TagType(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}



	/**
	 *	Returns the value of ipmErrorText600
	 *	@return ipmErrorText600
	 */
   public char[] getIpmErrorText600() throws CFException  {              
   		return ipmErrorMsg600.getIpmErrorText600();
   }

  
	/**
	*  set variable ipmErrorText600
	*  @param value
	**/
   public void setIpmErrorText600(char[] value) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(value);
   } 

     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex);
   	
   }
   
   public void setIpmErrorText600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorText600 with another Field
	 *	@param value
	 */
   public void setIpmErrorText600(Field source) {
      ipmErrorMsg600.setIpmErrorText600(source);
   }  
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504MessageStatus
	 *	@return ip65504MessageStatus
	 */
	public short getIp65504MessageStatus() throws CFException {        
   		return ip65504MessageStatusGroup.getIp65504MessageStatus();
	}
	
	/**
	 * 	Update Ip65504MessageStatus with the passed value
	 *	@param number
	 */
	public void setIp65504MessageStatus(short number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus(number);
	}

	public void setIp65504MessageStatus(int number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}

	public void setIp65504MessageStatus(long number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}



	/**
	 *	Returns the value of k400
	 *	@return k400
	 */
	public short getK400() throws CFException {        
   		return work.getK400();
	}
	
	/**
	 * 	Update K400 with the passed value
	 *	@param number
	 */
	public void setK400(short number)  throws CFException{
		work.setK400(number);
	}

	public void setK400(int number)  throws CFException{
		work.setK400((short)number);
	}

	public void setK400(long number)  throws CFException{
		work.setK400((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += ip65504PdsMapGroup.hashCode();
       return str.hashCode();
    }

    public CheckForDuplicatePdsOutCtx clone() {
        CheckForDuplicatePdsOutCtx cloneObj = new CheckForDuplicatePdsOutCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        return cloneObj;
    }

    }

    public CheckForDuplicatePdsOutCtx getCheckForDuplicatePdsOutCtx() {
            return new CheckForDuplicatePdsOutCtx();
    }
     public class EnterWholePdsInCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Work work = Ip662010Ctx.this.getWork();

	/**
	 *	Returns the value of pdsLength400
	 *	@return pdsLength400
	 */
	public short getPdsLength400() throws CFException {        
   		return work.getPdsLength400();
	}
	
	/**
	 * 	Update PdsLength400 with the passed value
	 *	@param number
	 */
	public void setPdsLength400(short number)  throws CFException{
		work.setPdsLength400(number);
	}

	public void setPdsLength400(int number)  throws CFException{
		work.setPdsLength400((short)number);
	}

	public void setPdsLength400(long number)  throws CFException{
		work.setPdsLength400((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of pdsTag400
	 *	@return pdsTag400
	 */
	public short getPdsTag400() throws CFException {        
   		return work.getPdsTag400();
	}
	
	/**
	 * 	Update PdsTag400 with the passed value
	 *	@param number
	 */
	public void setPdsTag400(short number)  throws CFException{
		work.setPdsTag400(number);
	}

	public void setPdsTag400(int number)  throws CFException{
		work.setPdsTag400((short)number);
	}

	public void setPdsTag400(long number)  throws CFException{
		work.setPdsTag400((short)number);
	}



	/**
	 *	Returns the value of k400
	 *	@return k400
	 */
	public short getK400() throws CFException {        
   		return work.getK400();
	}
	
	/**
	 * 	Update K400 with the passed value
	 *	@param number
	 */
	public void setK400(short number)  throws CFException{
		work.setK400(number);
	}

	public void setK400(int number)  throws CFException{
		work.setK400((short)number);
	}

	public void setK400(long number)  throws CFException{
		work.setK400((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public EnterWholePdsOutCtx getEnterWholePdsOutCtx() {
            return new EnterWholePdsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public EnterWholePdsInCtx clone() {
        EnterWholePdsInCtx cloneObj = new EnterWholePdsInCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public EnterWholePdsInCtx getEnterWholePdsInCtx() {
            return new EnterWholePdsInCtx();
    }
     public class EnterWholePdsOutCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Work work = Ip662010Ctx.this.getWork();

	/**
	 *	Returns the value of pdsLength400
	 *	@return pdsLength400
	 */
	public short getPdsLength400() throws CFException {        
   		return work.getPdsLength400();
	}
	
	/**
	 * 	Update PdsLength400 with the passed value
	 *	@param number
	 */
	public void setPdsLength400(short number)  throws CFException{
		work.setPdsLength400(number);
	}

	public void setPdsLength400(int number)  throws CFException{
		work.setPdsLength400((short)number);
	}

	public void setPdsLength400(long number)  throws CFException{
		work.setPdsLength400((short)number);
	}



	/**
	 *	Returns the value of ip65504TagNo
	 *	@return ip65504TagNo
	 */
	public short getIp65504TagNo(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagNo();
	}
	
	/**
	 * 	Update Ip65504TagNo with the passed value
	 *	@param number
	 */
	public void setIp65504TagNo(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo(number);
	}

	public void setIp65504TagNo(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}

	public void setIp65504TagNo(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}



	/**
	 *	Returns the value of ip65504TagStarts
	 *	@return ip65504TagStarts
	 */
	public short getIp65504TagStarts(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagStarts();
	}
	
	/**
	 * 	Update Ip65504TagStarts with the passed value
	 *	@param number
	 */
	public void setIp65504TagStarts(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts(number);
	}

	public void setIp65504TagStarts(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}

	public void setIp65504TagStarts(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of ip65504TagLngth
	 *	@return ip65504TagLngth
	 */
	public short getIp65504TagLngth(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagLngth();
	}
	
	/**
	 * 	Update Ip65504TagLngth with the passed value
	 *	@param number
	 */
	public void setIp65504TagLngth(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth(number);
	}

	public void setIp65504TagLngth(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth((short)number);
	}

	public void setIp65504TagLngth(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth((short)number);
	}



	/**
	 *	Returns the value of pdsTag400
	 *	@return pdsTag400
	 */
	public short getPdsTag400() throws CFException {        
   		return work.getPdsTag400();
	}
	
	/**
	 * 	Update PdsTag400 with the passed value
	 *	@param number
	 */
	public void setPdsTag400(short number)  throws CFException{
		work.setPdsTag400(number);
	}

	public void setPdsTag400(int number)  throws CFException{
		work.setPdsTag400((short)number);
	}

	public void setPdsTag400(long number)  throws CFException{
		work.setPdsTag400((short)number);
	}



	/**
	 *	Returns the value of ip65504TagType
	 *	@return ip65504TagType
	 */
	public short getIp65504TagType(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagType();
	}
	
	/**
	 * 	Update Ip65504TagType with the passed value
	 *	@param number
	 */
	public void setIp65504TagType(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType(number);
	}

	public void setIp65504TagType(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}

	public void setIp65504TagType(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}



	/**
	 *	Returns the value of ip65504TagSubFldNo
	 *	@return ip65504TagSubFldNo
	 */
	public short getIp65504TagSubFldNo(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagSubFldNo();
	}
	
	/**
	 * 	Update Ip65504TagSubFldNo with the passed value
	 *	@param number
	 */
	public void setIp65504TagSubFldNo(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagSubFldNo(number);
	}

	public void setIp65504TagSubFldNo(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagSubFldNo((short)number);
	}

	public void setIp65504TagSubFldNo(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagSubFldNo((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public EnterWholePdsOutCtx clone() {
        EnterWholePdsOutCtx cloneObj = new EnterWholePdsOutCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public EnterWholePdsOutCtx getEnterWholePdsOutCtx() {
            return new EnterWholePdsOutCtx();
    }
     public class EnterPdsSubfieldsInCtx implements Cloneable {
     NewTag800 newTag800 = Ip662010Ctx.this.getNewTag800();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip662010Ctx.this.getIp65504PdsMapGroup();

	/**
	 *	Returns the value of pdsLength400
	 *	@return pdsLength400
	 */
	public short getPdsLength400() throws CFException {        
   		return work.getPdsLength400();
	}
	
	/**
	 * 	Update PdsLength400 with the passed value
	 *	@param number
	 */
	public void setPdsLength400(short number)  throws CFException{
		work.setPdsLength400(number);
	}

	public void setPdsLength400(int number)  throws CFException{
		work.setPdsLength400((short)number);
	}

	public void setPdsLength400(long number)  throws CFException{
		work.setPdsLength400((short)number);
	}



	/**
	 *	Returns the value of startOfNextElement800
	 *	@return startOfNextElement800
	 */
	public short getStartOfNextElement800() throws CFException {        
   		return work.getStartOfNextElement800();
	}
	
	/**
	 * 	Update StartOfNextElement800 with the passed value
	 *	@param number
	 */
	public void setStartOfNextElement800(short number)  throws CFException{
		work.setStartOfNextElement800(number);
	}

	public void setStartOfNextElement800(int number)  throws CFException{
		work.setStartOfNextElement800((short)number);
	}

	public void setStartOfNextElement800(long number)  throws CFException{
		work.setStartOfNextElement800((short)number);
	}




public void setIp65504P(int ip65504P) { 
    Ip662010Ctx.this.ip65504P = ip65504P;
}

public int getIp65504P() { 
    return Ip662010Ctx.this.ip65504P;
}
	/**
	 *	Returns the value of pdsTag400
	 *	@return pdsTag400
	 */
	public short getPdsTag400() throws CFException {        
   		return work.getPdsTag400();
	}
	
	/**
	 * 	Update PdsTag400 with the passed value
	 *	@param number
	 */
	public void setPdsTag400(short number)  throws CFException{
		work.setPdsTag400(number);
	}

	public void setPdsTag400(int number)  throws CFException{
		work.setPdsTag400((short)number);
	}

	public void setPdsTag400(long number)  throws CFException{
		work.setPdsTag400((short)number);
	}



	/**
	 *	Returns the value of m400
	 *	@return m400
	 */
	public short getM400() throws CFException {        
   		return work.getM400();
	}
	
	/**
	 * 	Update M400 with the passed value
	 *	@param number
	 */
	public void setM400(short number)  throws CFException{
		work.setM400(number);
	}

	public void setM400(int number)  throws CFException{
		work.setM400((short)number);
	}

	public void setM400(long number)  throws CFException{
		work.setM400((short)number);
	}



	/**
	 *	Returns the value of k400
	 *	@return k400
	 */
	public short getK400() throws CFException {        
   		return work.getK400();
	}
	
	/**
	 * 	Update K400 with the passed value
	 *	@param number
	 */
	public void setK400(short number)  throws CFException{
		work.setK400(number);
	}

	public void setK400(int number)  throws CFException{
		work.setK400((short)number);
	}

	public void setK400(long number)  throws CFException{
		work.setK400((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public EnterPdsSubfieldsOutCtx getEnterPdsSubfieldsOutCtx() {
            return new EnterPdsSubfieldsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += newTag800.hashCode();
        str += work.hashCode();
        str += ip65504PdsMapGroup.hashCode();
       return str.hashCode();
    }

    public EnterPdsSubfieldsInCtx clone() {
        EnterPdsSubfieldsInCtx cloneObj = new EnterPdsSubfieldsInCtx();
        cloneObj.newTag800 = new NewTag800();
        cloneObj.newTag800.set(newTag800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        return cloneObj;
    }

    }

    public EnterPdsSubfieldsInCtx getEnterPdsSubfieldsInCtx() {
            return new EnterPdsSubfieldsInCtx();
    }
     public class EnterPdsSubfieldsOutCtx implements Cloneable {
     NewTag800 newTag800 = Ip662010Ctx.this.getNewTag800();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip662010Ctx.this.getIp65504PdsMapGroup();

	/**
	 *	Returns the value of newType800
	 *	@return newType800
	 */
	public short getNewType800() throws CFException {        
   		return newTag800.getNewType800();
	}
	
	/**
	 * 	Update NewType800 with the passed value
	 *	@param number
	 */
	public void setNewType800(short number)  throws CFException{
		newTag800.setNewType800(number);
	}

	public void setNewType800(int number)  throws CFException{
		newTag800.setNewType800((short)number);
	}

	public void setNewType800(long number)  throws CFException{
		newTag800.setNewType800((short)number);
	}



	/**
	 *	Returns the value of startOfNextElement800
	 *	@return startOfNextElement800
	 */
	public short getStartOfNextElement800() throws CFException {        
   		return work.getStartOfNextElement800();
	}
	
	/**
	 * 	Update StartOfNextElement800 with the passed value
	 *	@param number
	 */
	public void setStartOfNextElement800(short number)  throws CFException{
		work.setStartOfNextElement800(number);
	}

	public void setStartOfNextElement800(int number)  throws CFException{
		work.setStartOfNextElement800((short)number);
	}

	public void setStartOfNextElement800(long number)  throws CFException{
		work.setStartOfNextElement800((short)number);
	}



	/**
	 *	Returns the value of ip65504PdsFirstSubfld
	 *	@return ip65504PdsFirstSubfld
	 */
	public int getIp65504PdsFirstSubfld(int index) throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).getIp65504PdsFirstSubfld();
	}
	
	/**
	 * 	Update Ip65504PdsFirstSubfld with the passed value
	 *	@param number
	 */
	public void setIp65504PdsFirstSubfld(int index,int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsFirstSubfld(number);
	}


	public void setIp65504PdsFirstSubfld(int index,long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsFirstSubfld((int)number);
	}



public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}

public void setIp65504P(int ip65504P) { 
    Ip662010Ctx.this.ip65504P = ip65504P;
}

public int getIp65504P() { 
    return Ip662010Ctx.this.ip65504P;
}
	/**
	 *	Returns the value of pdsTag400
	 *	@return pdsTag400
	 */
	public short getPdsTag400() throws CFException {        
   		return work.getPdsTag400();
	}
	
	/**
	 * 	Update PdsTag400 with the passed value
	 *	@param number
	 */
	public void setPdsTag400(short number)  throws CFException{
		work.setPdsTag400(number);
	}

	public void setPdsTag400(int number)  throws CFException{
		work.setPdsTag400((short)number);
	}

	public void setPdsTag400(long number)  throws CFException{
		work.setPdsTag400((short)number);
	}



	/**
	 *	Returns the value of m400
	 *	@return m400
	 */
	public short getM400() throws CFException {        
   		return work.getM400();
	}
	
	/**
	 * 	Update M400 with the passed value
	 *	@param number
	 */
	public void setM400(short number)  throws CFException{
		work.setM400(number);
	}

	public void setM400(int number)  throws CFException{
		work.setM400((short)number);
	}

	public void setM400(long number)  throws CFException{
		work.setM400((short)number);
	}



	/**
	 *	Returns the value of k400
	 *	@return k400
	 */
	public short getK400() throws CFException {        
   		return work.getK400();
	}
	
	/**
	 * 	Update K400 with the passed value
	 *	@param number
	 */
	public void setK400(short number)  throws CFException{
		work.setK400(number);
	}

	public void setK400(int number)  throws CFException{
		work.setK400((short)number);
	}

	public void setK400(long number)  throws CFException{
		work.setK400((short)number);
	}



	/**
	 *	Returns the value of newNo800
	 *	@return newNo800
	 */
	public short getNewNo800() throws CFException {        
   		return newTag800.getNewNo800();
	}
	
	/**
	 * 	Update NewNo800 with the passed value
	 *	@param number
	 */
	public void setNewNo800(short number)  throws CFException{
		newTag800.setNewNo800(number);
	}

	public void setNewNo800(int number)  throws CFException{
		newTag800.setNewNo800((short)number);
	}

	public void setNewNo800(long number)  throws CFException{
		newTag800.setNewNo800((short)number);
	}



	/**
	 *	Returns the value of doesVarSubfExist100
	 *	@return doesVarSubfExist100
	 */
   public char[] getDoesVarSubfExist100() throws CFException  {              
   		return work.getDoesVarSubfExist100();
   }

  
	/**
	*  set variable doesVarSubfExist100
	*  @param value
	**/
   public void setDoesVarSubfExist100(char[] value) throws CFException {
      work.setDoesVarSubfExist100(value);
   } 


        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += newTag800.hashCode();
        str += work.hashCode();
        str += ip65504PdsMapGroup.hashCode();
       return str.hashCode();
    }

    public EnterPdsSubfieldsOutCtx clone() {
        EnterPdsSubfieldsOutCtx cloneObj = new EnterPdsSubfieldsOutCtx();
        cloneObj.newTag800 = new NewTag800();
        cloneObj.newTag800.set(newTag800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        return cloneObj;
    }

    }

    public EnterPdsSubfieldsOutCtx getEnterPdsSubfieldsOutCtx() {
            return new EnterPdsSubfieldsOutCtx();
    }
     public class DoAPdsOccurrenceGrpInCtx implements Cloneable {
     NewTag800 newTag800 = Ip662010Ctx.this.getNewTag800();
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip000904PdsSubAttrTable ip000904PdsSubAttrTable = Ip662010Ctx.this.getIp000904PdsSubAttrTable();
     Work work = Ip662010Ctx.this.getWork();
     Ip000804PdsAttributes ip000804PdsAttributes = Ip662010Ctx.this.getIp000804PdsAttributes();


public void setIp000804I(int ip000804I) { 
    Ip662010Ctx.this.ip000804I = ip000804I;
}

public int getIp000804I() { 
    return Ip662010Ctx.this.ip000804I;
}
	/**
	 *	Returns the value of ip000804PdsFirstSubfld
	 *	@return ip000804PdsFirstSubfld
	 */
	public int getIp000804PdsFirstSubfld(int index) throws CFException {        
   		return ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).getIp000804PdsFirstSubfld();
	}
	
	/**
	 * 	Update Ip000804PdsFirstSubfld with the passed value
	 *	@param number
	 */
	public void setIp000804PdsFirstSubfld(int index,int number)  throws CFException{
		ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsFirstSubfld(number);
	}


	public void setIp000804PdsFirstSubfld(int index,long number)  throws CFException{
		ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsFirstSubfld((int)number);
	}



public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of newLength800
	 *	@return newLength800
	 */
	public short getNewLength800() throws CFException {        
   		return newTag800.getNewLength800();
	}
	
	/**
	 * 	Update NewLength800 with the passed value
	 *	@param number
	 */
	public void setNewLength800(short number)  throws CFException{
		newTag800.setNewLength800(number);
	}

	public void setNewLength800(int number)  throws CFException{
		newTag800.setNewLength800((short)number);
	}

	public void setNewLength800(long number)  throws CFException{
		newTag800.setNewLength800((short)number);
	}



	/**
	 *	Returns the value of currentSubfld400
	 *	@return currentSubfld400
	 */
	public short getCurrentSubfld400() throws CFException {        
   		return work.getCurrentSubfld400();
	}
	
	/**
	 * 	Update CurrentSubfld400 with the passed value
	 *	@param number
	 */
	public void setCurrentSubfld400(short number)  throws CFException{
		work.setCurrentSubfld400(number);
	}

	public void setCurrentSubfld400(int number)  throws CFException{
		work.setCurrentSubfld400((short)number);
	}

	public void setCurrentSubfld400(long number)  throws CFException{
		work.setCurrentSubfld400((short)number);
	}



	/**
	 *	Returns the value of ip000904PdsSubMinLngth
	 *	@return ip000904PdsSubMinLngth
	 */
	public short getIp000904PdsSubMinLngth(int index) throws CFException {        
   		return ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).getIp000904PdsSubMinLngth();
	}
	
	/**
	 * 	Update Ip000904PdsSubMinLngth with the passed value
	 *	@param number
	 */
	public void setIp000904PdsSubMinLngth(int index,short number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsSubMinLngth(number);
	}

	public void setIp000904PdsSubMinLngth(int index,int number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsSubMinLngth((short)number);
	}

	public void setIp000904PdsSubMinLngth(int index,long number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsSubMinLngth((short)number);
	}



	/**
	 *	Returns the value of ip000804PdsSubflds
	 *	@return ip000804PdsSubflds
	 */
	public short getIp000804PdsSubflds(int index) throws CFException {        
   		return ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).getIp000804PdsSubflds();
	}
	
	/**
	 * 	Update Ip000804PdsSubflds with the passed value
	 *	@param number
	 */
	public void setIp000804PdsSubflds(int index,short number)  throws CFException{
		ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsSubflds(number);
	}

	public void setIp000804PdsSubflds(int index,int number)  throws CFException{
		ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsSubflds((short)number);
	}

	public void setIp000804PdsSubflds(int index,long number)  throws CFException{
		ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsSubflds((short)number);
	}



	/**
	 *	Returns the value of pdsLength400
	 *	@return pdsLength400
	 */
	public short getPdsLength400() throws CFException {        
   		return work.getPdsLength400();
	}
	
	/**
	 * 	Update PdsLength400 with the passed value
	 *	@param number
	 */
	public void setPdsLength400(short number)  throws CFException{
		work.setPdsLength400(number);
	}

	public void setPdsLength400(int number)  throws CFException{
		work.setPdsLength400((short)number);
	}

	public void setPdsLength400(long number)  throws CFException{
		work.setPdsLength400((short)number);
	}



	/**
	 *	Returns the value of newTag800
	 *	@return newTag800
	 */   
	 public NewTag800 getNewTag800() {
   	return newTag800;
   }


	/**
	 *	Returns the value of ip000904PdsSubMaxLngth
	 *	@return ip000904PdsSubMaxLngth
	 */
	public short getIp000904PdsSubMaxLngth(int index) throws CFException {        
   		return ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).getIp000904PdsSubMaxLngth();
	}
	
	/**
	 * 	Update Ip000904PdsSubMaxLngth with the passed value
	 *	@param number
	 */
	public void setIp000904PdsSubMaxLngth(int index,short number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsSubMaxLngth(number);
	}

	public void setIp000904PdsSubMaxLngth(int index,int number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsSubMaxLngth((short)number);
	}

	public void setIp000904PdsSubMaxLngth(int index,long number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsSubMaxLngth((short)number);
	}



	/**
	 *	Returns the value of ip000804PdsMinLngth
	 *	@return ip000804PdsMinLngth
	 */
	public short getIp000804PdsMinLngth(int index) throws CFException {        
   		return ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).getIp000804PdsMinLngth();
	}
	
	/**
	 * 	Update Ip000804PdsMinLngth with the passed value
	 *	@param number
	 */
	public void setIp000804PdsMinLngth(int index,short number)  throws CFException{
		ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsMinLngth(number);
	}

	public void setIp000804PdsMinLngth(int index,int number)  throws CFException{
		ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsMinLngth((short)number);
	}

	public void setIp000804PdsMinLngth(int index,long number)  throws CFException{
		ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsMinLngth((short)number);
	}



	/**
	 *	Returns the value of startOfNextElement800
	 *	@return startOfNextElement800
	 */
	public short getStartOfNextElement800() throws CFException {        
   		return work.getStartOfNextElement800();
	}
	
	/**
	 * 	Update StartOfNextElement800 with the passed value
	 *	@param number
	 */
	public void setStartOfNextElement800(short number)  throws CFException{
		work.setStartOfNextElement800(number);
	}

	public void setStartOfNextElement800(int number)  throws CFException{
		work.setStartOfNextElement800((short)number);
	}

	public void setStartOfNextElement800(long number)  throws CFException{
		work.setStartOfNextElement800((short)number);
	}



	/**
	 *	Returns the value of m400
	 *	@return m400
	 */
	public short getM400() throws CFException {        
   		return work.getM400();
	}
	
	/**
	 * 	Update M400 with the passed value
	 *	@param number
	 */
	public void setM400(short number)  throws CFException{
		work.setM400(number);
	}

	public void setM400(int number)  throws CFException{
		work.setM400((short)number);
	}

	public void setM400(long number)  throws CFException{
		work.setM400((short)number);
	}



	/**
	 *	Test condition "Y" for isVarSubfExists88100()
	 *	@return  Returns true if isVarSubfExists88100() is "Y"
	 */
   public boolean isVarSubfExists88100() throws CFException {
      return work.isVarSubfExists88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setVarSubfExists88100True()  throws CFException{  			
    	work.setVarSubfExists88100True();
   	}

public void setIp000904I(int ip000904I) { 
    Ip662010Ctx.this.ip000904I = ip000904I;
}

public int getIp000904I() { 
    return Ip662010Ctx.this.ip000904I;
}

        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public DoAPdsOccurrenceGrpOutCtx getDoAPdsOccurrenceGrpOutCtx() {
            return new DoAPdsOccurrenceGrpOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += newTag800.hashCode();
        str += ip65504CurrentTagTable.hashCode();
        str += ip000904PdsSubAttrTable.hashCode();
        str += work.hashCode();
        str += ip000804PdsAttributes.hashCode();
       return str.hashCode();
    }

    public DoAPdsOccurrenceGrpInCtx clone() {
        DoAPdsOccurrenceGrpInCtx cloneObj = new DoAPdsOccurrenceGrpInCtx();
        cloneObj.newTag800 = new NewTag800();
        cloneObj.newTag800.set(newTag800.getClonedField());
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip000904PdsSubAttrTable = new Ip000904PdsSubAttrTable();
        cloneObj.ip000904PdsSubAttrTable.set(ip000904PdsSubAttrTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip000804PdsAttributes = new Ip000804PdsAttributes();
        cloneObj.ip000804PdsAttributes.set(ip000804PdsAttributes.getClonedField());
        return cloneObj;
    }

    }

    public DoAPdsOccurrenceGrpInCtx getDoAPdsOccurrenceGrpInCtx() {
            return new DoAPdsOccurrenceGrpInCtx();
    }
     public class DoAPdsOccurrenceGrpOutCtx implements Cloneable {
     NewTag800 newTag800 = Ip662010Ctx.this.getNewTag800();
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip000904PdsSubAttrTable ip000904PdsSubAttrTable = Ip662010Ctx.this.getIp000904PdsSubAttrTable();
     Work work = Ip662010Ctx.this.getWork();
     Ip000804PdsAttributes ip000804PdsAttributes = Ip662010Ctx.this.getIp000804PdsAttributes();

	/**
	 *	Returns the value of newTag800
	 *	@return newTag800
	 */   
	 public NewTag800 getNewTag800() {
   	return newTag800;
   }


	/**
	 *	Returns the value of newStart800
	 *	@return newStart800
	 */
	public short getNewStart800() throws CFException {        
   		return newTag800.getNewStart800();
	}
	
	/**
	 * 	Update NewStart800 with the passed value
	 *	@param number
	 */
	public void setNewStart800(short number)  throws CFException{
		newTag800.setNewStart800(number);
	}

	public void setNewStart800(int number)  throws CFException{
		newTag800.setNewStart800((short)number);
	}

	public void setNewStart800(long number)  throws CFException{
		newTag800.setNewStart800((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of newLength800
	 *	@return newLength800
	 */
	public short getNewLength800() throws CFException {        
   		return newTag800.getNewLength800();
	}
	
	/**
	 * 	Update NewLength800 with the passed value
	 *	@param number
	 */
	public void setNewLength800(short number)  throws CFException{
		newTag800.setNewLength800(number);
	}

	public void setNewLength800(int number)  throws CFException{
		newTag800.setNewLength800((short)number);
	}

	public void setNewLength800(long number)  throws CFException{
		newTag800.setNewLength800((short)number);
	}



	/**
	 *	Returns the value of currentSubfld400
	 *	@return currentSubfld400
	 */
	public short getCurrentSubfld400() throws CFException {        
   		return work.getCurrentSubfld400();
	}
	
	/**
	 * 	Update CurrentSubfld400 with the passed value
	 *	@param number
	 */
	public void setCurrentSubfld400(short number)  throws CFException{
		work.setCurrentSubfld400(number);
	}

	public void setCurrentSubfld400(int number)  throws CFException{
		work.setCurrentSubfld400((short)number);
	}

	public void setCurrentSubfld400(long number)  throws CFException{
		work.setCurrentSubfld400((short)number);
	}



	/**
	 *	Returns the value of m400
	 *	@return m400
	 */
	public short getM400() throws CFException {        
   		return work.getM400();
	}
	
	/**
	 * 	Update M400 with the passed value
	 *	@param number
	 */
	public void setM400(short number)  throws CFException{
		work.setM400(number);
	}

	public void setM400(int number)  throws CFException{
		work.setM400((short)number);
	}

	public void setM400(long number)  throws CFException{
		work.setM400((short)number);
	}



	/**
	 *	Returns the value of newSubfldNo800
	 *	@return newSubfldNo800
	 */
	public short getNewSubfldNo800() throws CFException {        
   		return newTag800.getNewSubfldNo800();
	}
	
	/**
	 * 	Update NewSubfldNo800 with the passed value
	 *	@param number
	 */
	public void setNewSubfldNo800(short number)  throws CFException{
		newTag800.setNewSubfldNo800(number);
	}

	public void setNewSubfldNo800(int number)  throws CFException{
		newTag800.setNewSubfldNo800((short)number);
	}

	public void setNewSubfldNo800(long number)  throws CFException{
		newTag800.setNewSubfldNo800((short)number);
	}



	/**
	 *	Returns the value of ip000904PdsSubMinLngth
	 *	@return ip000904PdsSubMinLngth
	 */
	public short getIp000904PdsSubMinLngth(int index) throws CFException {        
   		return ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).getIp000904PdsSubMinLngth();
	}
	
	/**
	 * 	Update Ip000904PdsSubMinLngth with the passed value
	 *	@param number
	 */
	public void setIp000904PdsSubMinLngth(int index,short number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsSubMinLngth(number);
	}

	public void setIp000904PdsSubMinLngth(int index,int number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsSubMinLngth((short)number);
	}

	public void setIp000904PdsSubMinLngth(int index,long number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsSubMinLngth((short)number);
	}




public void setIp000904I(int ip000904I) { 
    Ip662010Ctx.this.ip000904I = ip000904I;
}

public int getIp000904I() { 
    return Ip662010Ctx.this.ip000904I;
}
	/**
	 *	Returns the value of ip65504TagArea
	 *	@return ip65504TagArea
	 */   
	 public Ip65504TagArea getIp65504TagArea(int index) {
   	return ip65504CurrentTagTable.getIp65504TagArea(index);
   }

    public List<Ip65504TagArea> getIp65504TagArea() {
        return ip65504CurrentTagTable.getIp65504TagArea();
    }
   /**
	* 	Update Ip65504TagArea with the passed value
	*	@param value
	*/
   public void setIp65504TagArea(int index,char[] value) throws CFException {
      ip65504CurrentTagTable.setIp65504TagArea((index),value);
   }   


	/**
	 *	Returns the value of newStatus800
	 *	@return newStatus800
	 */
   public char[] getNewStatus800() throws CFException  {              
   		return newTag800.getNewStatus800();
   }

  
	/**
	*  set variable newStatus800
	*  @param value
	**/
   public void setNewStatus800(char[] value) throws CFException {
      newTag800.setNewStatus800(value);
   } 

     /**
	 * 	Update NewStatus800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNewStatus800(char[] source, int sourceIndex) throws CFException {
      newTag800.setNewStatus800(source, sourceIndex);
   	
   }
   
   public void setNewStatus800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      newTag800.setNewStatus800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update NewStatus800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNewStatus800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      newTag800.setNewStatus800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update NewStatus800 with another Field
	 *	@param value
	 */
   public void setNewStatus800(Field source) {
      newTag800.setNewStatus800(source);
   }  
   
     /**
	 * 	Update NewStatus800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNewStatus800(Field source, int sourceIndex,int sourceLen) {
      newTag800.setNewStatus800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update NewStatus800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNewStatus800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      newTag800.setNewStatus800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += newTag800.hashCode();
        str += ip65504CurrentTagTable.hashCode();
        str += ip000904PdsSubAttrTable.hashCode();
        str += work.hashCode();
        str += ip000804PdsAttributes.hashCode();
       return str.hashCode();
    }

    public DoAPdsOccurrenceGrpOutCtx clone() {
        DoAPdsOccurrenceGrpOutCtx cloneObj = new DoAPdsOccurrenceGrpOutCtx();
        cloneObj.newTag800 = new NewTag800();
        cloneObj.newTag800.set(newTag800.getClonedField());
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip000904PdsSubAttrTable = new Ip000904PdsSubAttrTable();
        cloneObj.ip000904PdsSubAttrTable.set(ip000904PdsSubAttrTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip000804PdsAttributes = new Ip000804PdsAttributes();
        cloneObj.ip000804PdsAttributes.set(ip000804PdsAttributes.getClonedField());
        return cloneObj;
    }

    }

    public DoAPdsOccurrenceGrpOutCtx getDoAPdsOccurrenceGrpOutCtx() {
            return new DoAPdsOccurrenceGrpOutCtx();
    }
     public class DoDelimitedPdsSubfldInCtx implements Cloneable {
     NewTag800 newTag800 = Ip662010Ctx.this.getNewTag800();
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     Ip000904PdsSubAttrTable ip000904PdsSubAttrTable = Ip662010Ctx.this.getIp000904PdsSubAttrTable();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of ip000904PdsSubMaxLngth
	 *	@return ip000904PdsSubMaxLngth
	 */
	public short getIp000904PdsSubMaxLngth(int index) throws CFException {        
   		return ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).getIp000904PdsSubMaxLngth();
	}
	
	/**
	 * 	Update Ip000904PdsSubMaxLngth with the passed value
	 *	@param number
	 */
	public void setIp000904PdsSubMaxLngth(int index,short number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsSubMaxLngth(number);
	}

	public void setIp000904PdsSubMaxLngth(int index,int number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsSubMaxLngth((short)number);
	}

	public void setIp000904PdsSubMaxLngth(int index,long number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsSubMaxLngth((short)number);
	}



	/**
	 *	Returns the value of noBackslash600
	 *	@return noBackslash600
	 */
   public char[] getNoBackslash600() throws CFException  {              
   		return work.getNoBackslash600();
   }

  
	/**
	*  set variable noBackslash600
	*  @param value
	**/
   public void setNoBackslash600(char[] value) throws CFException {
      work.setNoBackslash600(value);
   } 

	/**
	 *	Returns the value of newStart800
	 *	@return newStart800
	 */
	public short getNewStart800() throws CFException {        
   		return newTag800.getNewStart800();
	}
	
	/**
	 * 	Update NewStart800 with the passed value
	 *	@param number
	 */
	public void setNewStart800(short number)  throws CFException{
		newTag800.setNewStart800(number);
	}

	public void setNewStart800(int number)  throws CFException{
		newTag800.setNewStart800((short)number);
	}

	public void setNewStart800(long number)  throws CFException{
		newTag800.setNewStart800((short)number);
	}



	/**
	 *	Returns the value of newType800
	 *	@return newType800
	 */
	public short getNewType800() throws CFException {        
   		return newTag800.getNewType800();
	}
	
	/**
	 * 	Update NewType800 with the passed value
	 *	@param number
	 */
	public void setNewType800(short number)  throws CFException{
		newTag800.setNewType800(number);
	}

	public void setNewType800(int number)  throws CFException{
		newTag800.setNewType800((short)number);
	}

	public void setNewType800(long number)  throws CFException{
		newTag800.setNewType800((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of noBackslashCode600
	 *	@return noBackslashCode600
	 */
	public int getNoBackslashCode600() throws CFException {        
   		return work.getNoBackslashCode600();
	}
	
	/**
	 * 	Update NoBackslashCode600 with the passed value
	 *	@param number
	 */
	public void setNoBackslashCode600(int number)  throws CFException{
		work.setNoBackslashCode600(number);
	}


	public void setNoBackslashCode600(long number)  throws CFException{
		work.setNoBackslashCode600((int)number);
	}


	/**
	 *	Returns the value of subfldLength400
	 *	@return subfldLength400
	 */
	public short getSubfldLength400() throws CFException {        
   		return work.getSubfldLength400();
	}
	
	/**
	 * 	Update SubfldLength400 with the passed value
	 *	@param number
	 */
	public void setSubfldLength400(short number)  throws CFException{
		work.setSubfldLength400(number);
	}

	public void setSubfldLength400(int number)  throws CFException{
		work.setSubfldLength400((short)number);
	}

	public void setSubfldLength400(long number)  throws CFException{
		work.setSubfldLength400((short)number);
	}



	/**
	 *	Returns the value of m400
	 *	@return m400
	 */
	public short getM400() throws CFException {        
   		return work.getM400();
	}
	
	/**
	 * 	Update M400 with the passed value
	 *	@param number
	 */
	public void setM400(short number)  throws CFException{
		work.setM400(number);
	}

	public void setM400(int number)  throws CFException{
		work.setM400((short)number);
	}

	public void setM400(long number)  throws CFException{
		work.setM400((short)number);
	}



	/**
	 *	Returns the value of noBackslashNdx600
	 *	@return noBackslashNdx600
	 */
	public int getNoBackslashNdx600() throws CFException {        
   		return work.getNoBackslashNdx600();
	}
	
	/**
	 * 	Update NoBackslashNdx600 with the passed value
	 *	@param number
	 */
	public void setNoBackslashNdx600(int number)  throws CFException{
		work.setNoBackslashNdx600(number);
	}


	public void setNoBackslashNdx600(long number)  throws CFException{
		work.setNoBackslashNdx600((int)number);
	}


	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of newNo800
	 *	@return newNo800
	 */
	public short getNewNo800() throws CFException {        
   		return newTag800.getNewNo800();
	}
	
	/**
	 * 	Update NewNo800 with the passed value
	 *	@param number
	 */
	public void setNewNo800(short number)  throws CFException{
		newTag800.setNewNo800(number);
	}

	public void setNewNo800(int number)  throws CFException{
		newTag800.setNewNo800((short)number);
	}

	public void setNewNo800(long number)  throws CFException{
		newTag800.setNewNo800((short)number);
	}




public void setIp000904I(int ip000904I) { 
    Ip662010Ctx.this.ip000904I = ip000904I;
}

public int getIp000904I() { 
    return Ip662010Ctx.this.ip000904I;
}

        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public DoDelimitedPdsSubfldOutCtx getDoDelimitedPdsSubfldOutCtx() {
            return new DoDelimitedPdsSubfldOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += newTag800.hashCode();
        str += ip65504CurrentTagTable.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += ip000904PdsSubAttrTable.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public DoDelimitedPdsSubfldInCtx clone() {
        DoDelimitedPdsSubfldInCtx cloneObj = new DoDelimitedPdsSubfldInCtx();
        cloneObj.newTag800 = new NewTag800();
        cloneObj.newTag800.set(newTag800.getClonedField());
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.ip000904PdsSubAttrTable = new Ip000904PdsSubAttrTable();
        cloneObj.ip000904PdsSubAttrTable.set(ip000904PdsSubAttrTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public DoDelimitedPdsSubfldInCtx getDoDelimitedPdsSubfldInCtx() {
            return new DoDelimitedPdsSubfldInCtx();
    }
     public class DoDelimitedPdsSubfldOutCtx implements Cloneable {
     NewTag800 newTag800 = Ip662010Ctx.this.getNewTag800();
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     Ip000904PdsSubAttrTable ip000904PdsSubAttrTable = Ip662010Ctx.this.getIp000904PdsSubAttrTable();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of ipmErrorPointerWidth600
	 *	@return ipmErrorPointerWidth600
	 */
	public short getIpmErrorPointerWidth600() throws CFException {        
   		return work.getIpmErrorPointerWidth600();
	}
	
	/**
	 * 	Update IpmErrorPointerWidth600 with the passed value
	 *	@param number
	 */
	public void setIpmErrorPointerWidth600(short number)  throws CFException{
		work.setIpmErrorPointerWidth600(number);
	}

	public void setIpmErrorPointerWidth600(int number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}

	public void setIpmErrorPointerWidth600(long number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}



	/**
	 *	Returns the value of ip65504TagNo
	 *	@return ip65504TagNo
	 */
	public short getIp65504TagNo(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagNo();
	}
	
	/**
	 * 	Update Ip65504TagNo with the passed value
	 *	@param number
	 */
	public void setIp65504TagNo(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo(number);
	}

	public void setIp65504TagNo(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}

	public void setIp65504TagNo(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}



	/**
	 *	Returns the value of noBackslash600
	 *	@return noBackslash600
	 */
   public char[] getNoBackslash600() throws CFException  {              
   		return work.getNoBackslash600();
   }

  
	/**
	*  set variable noBackslash600
	*  @param value
	**/
   public void setNoBackslash600(char[] value) throws CFException {
      work.setNoBackslash600(value);
   } 

	/**
	 *	Returns the value of newType800
	 *	@return newType800
	 */
	public short getNewType800() throws CFException {        
   		return newTag800.getNewType800();
	}
	
	/**
	 * 	Update NewType800 with the passed value
	 *	@param number
	 */
	public void setNewType800(short number)  throws CFException{
		newTag800.setNewType800(number);
	}

	public void setNewType800(int number)  throws CFException{
		newTag800.setNewType800((short)number);
	}

	public void setNewType800(long number)  throws CFException{
		newTag800.setNewType800((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of newLength800
	 *	@return newLength800
	 */
	public short getNewLength800() throws CFException {        
   		return newTag800.getNewLength800();
	}
	
	/**
	 * 	Update NewLength800 with the passed value
	 *	@param number
	 */
	public void setNewLength800(short number)  throws CFException{
		newTag800.setNewLength800(number);
	}

	public void setNewLength800(int number)  throws CFException{
		newTag800.setNewLength800((short)number);
	}

	public void setNewLength800(long number)  throws CFException{
		newTag800.setNewLength800((short)number);
	}



	/**
	 *	Returns the value of ip662011ErrSubscript
	 *	@return ip662011ErrSubscript
	 */
	public int getIp662011ErrSubscript() throws CFException {        
   		return ip662011ErrSubscriptGroup.getIp662011ErrSubscript();
	}
	
	/**
	 * 	Update Ip662011ErrSubscript with the passed value
	 *	@param number
	 */
	public void setIp662011ErrSubscript(int number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript(number);
	}


	public void setIp662011ErrSubscript(long number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript((int)number);
	}


	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of errorCode600
	 *	@return errorCode600
	 */
	public long getErrorCode600() throws CFException {
   		return ipmErrorMsg600.getErrorCode600();
	}


	/**
	 *	Returns String value of errorCode600
	 *	@return errorCode600
	 */
	public char[]  getErrorCode600String() throws CFException {
	     return String.valueOf(ipmErrorMsg600.getErrorCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorCode600IsNumeric()  throws CFException{
	    return ipmErrorMsg600.errorCode600IsNumeric();
	}

	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param number
	 */
	public void setErrorCode600(long number)  throws CFException{
		ipmErrorMsg600.setErrorCode600(number);
	}
	

	
	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorCode600(char[] value)  throws CFException {
		ipmErrorMsg600.setErrorCode600(value);
	}
	
	/**
	 * 	Update ErrorCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorCode600String(char[] value)  throws CFException{
		ipmErrorMsg600.setErrorCode600(value);
	}	

	/**
	 *	Returns the value of newNo800
	 *	@return newNo800
	 */
	public short getNewNo800() throws CFException {        
   		return newTag800.getNewNo800();
	}
	
	/**
	 * 	Update NewNo800 with the passed value
	 *	@param number
	 */
	public void setNewNo800(short number)  throws CFException{
		newTag800.setNewNo800(number);
	}

	public void setNewNo800(int number)  throws CFException{
		newTag800.setNewNo800((short)number);
	}

	public void setNewNo800(long number)  throws CFException{
		newTag800.setNewNo800((short)number);
	}



	/**
	 *	Returns the value of ip000904PdsSubMaxLngth
	 *	@return ip000904PdsSubMaxLngth
	 */
	public short getIp000904PdsSubMaxLngth(int index) throws CFException {        
   		return ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).getIp000904PdsSubMaxLngth();
	}
	
	/**
	 * 	Update Ip000904PdsSubMaxLngth with the passed value
	 *	@param number
	 */
	public void setIp000904PdsSubMaxLngth(int index,short number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsSubMaxLngth(number);
	}

	public void setIp000904PdsSubMaxLngth(int index,int number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsSubMaxLngth((short)number);
	}

	public void setIp000904PdsSubMaxLngth(int index,long number)  throws CFException{
		ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(index).setIp000904PdsSubMaxLngth((short)number);
	}



	/**
	 *	Returns the value of newStart800
	 *	@return newStart800
	 */
	public short getNewStart800() throws CFException {        
   		return newTag800.getNewStart800();
	}
	
	/**
	 * 	Update NewStart800 with the passed value
	 *	@param number
	 */
	public void setNewStart800(short number)  throws CFException{
		newTag800.setNewStart800(number);
	}

	public void setNewStart800(int number)  throws CFException{
		newTag800.setNewStart800((short)number);
	}

	public void setNewStart800(long number)  throws CFException{
		newTag800.setNewStart800((short)number);
	}



	/**
	 *	Returns the value of ip65504TagStarts
	 *	@return ip65504TagStarts
	 */
	public short getIp65504TagStarts(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagStarts();
	}
	
	/**
	 * 	Update Ip65504TagStarts with the passed value
	 *	@param number
	 */
	public void setIp65504TagStarts(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts(number);
	}

	public void setIp65504TagStarts(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}

	public void setIp65504TagStarts(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}



	/**
	 *	Returns the value of noBackslashCode600
	 *	@return noBackslashCode600
	 */
	public int getNoBackslashCode600() throws CFException {        
   		return work.getNoBackslashCode600();
	}
	
	/**
	 * 	Update NoBackslashCode600 with the passed value
	 *	@param number
	 */
	public void setNoBackslashCode600(int number)  throws CFException{
		work.setNoBackslashCode600(number);
	}


	public void setNoBackslashCode600(long number)  throws CFException{
		work.setNoBackslashCode600((int)number);
	}


	/**
	 *	Returns the value of subfldLength400
	 *	@return subfldLength400
	 */
	public short getSubfldLength400() throws CFException {        
   		return work.getSubfldLength400();
	}
	
	/**
	 * 	Update SubfldLength400 with the passed value
	 *	@param number
	 */
	public void setSubfldLength400(short number)  throws CFException{
		work.setSubfldLength400(number);
	}

	public void setSubfldLength400(int number)  throws CFException{
		work.setSubfldLength400((short)number);
	}

	public void setSubfldLength400(long number)  throws CFException{
		work.setSubfldLength400((short)number);
	}



	/**
	 *	Returns the value of m400
	 *	@return m400
	 */
	public short getM400() throws CFException {        
   		return work.getM400();
	}
	
	/**
	 * 	Update M400 with the passed value
	 *	@param number
	 */
	public void setM400(short number)  throws CFException{
		work.setM400(number);
	}

	public void setM400(int number)  throws CFException{
		work.setM400((short)number);
	}

	public void setM400(long number)  throws CFException{
		work.setM400((short)number);
	}



	/**
	 *	Returns the value of ip65504TagType
	 *	@return ip65504TagType
	 */
	public short getIp65504TagType(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagType();
	}
	
	/**
	 * 	Update Ip65504TagType with the passed value
	 *	@param number
	 */
	public void setIp65504TagType(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType(number);
	}

	public void setIp65504TagType(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}

	public void setIp65504TagType(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}



	/**
	 *	Returns the value of noBackslashNdx600
	 *	@return noBackslashNdx600
	 */
	public int getNoBackslashNdx600() throws CFException {        
   		return work.getNoBackslashNdx600();
	}
	
	/**
	 * 	Update NoBackslashNdx600 with the passed value
	 *	@param number
	 */
	public void setNoBackslashNdx600(int number)  throws CFException{
		work.setNoBackslashNdx600(number);
	}


	public void setNoBackslashNdx600(long number)  throws CFException{
		work.setNoBackslashNdx600((int)number);
	}


	/**
	 *	Returns the value of ipmErrorText600
	 *	@return ipmErrorText600
	 */
   public char[] getIpmErrorText600() throws CFException  {              
   		return ipmErrorMsg600.getIpmErrorText600();
   }

  
	/**
	*  set variable ipmErrorText600
	*  @param value
	**/
   public void setIpmErrorText600(char[] value) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(value);
   } 

     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex);
   	
   }
   
   public void setIpmErrorText600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorText600 with another Field
	 *	@param value
	 */
   public void setIpmErrorText600(Field source) {
      ipmErrorMsg600.setIpmErrorText600(source);
   }  
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504MessageStatus
	 *	@return ip65504MessageStatus
	 */
	public short getIp65504MessageStatus() throws CFException {        
   		return ip65504MessageStatusGroup.getIp65504MessageStatus();
	}
	
	/**
	 * 	Update Ip65504MessageStatus with the passed value
	 *	@param number
	 */
	public void setIp65504MessageStatus(short number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus(number);
	}

	public void setIp65504MessageStatus(int number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}

	public void setIp65504MessageStatus(long number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}



	/**
	 *	Test condition "Y" for isVarSubfExists88100()
	 *	@return  Returns true if isVarSubfExists88100() is "Y"
	 */
   public boolean isVarSubfExists88100() throws CFException {
      return work.isVarSubfExists88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setVarSubfExists88100True()  throws CFException{  			
    	work.setVarSubfExists88100True();
   	}

        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += newTag800.hashCode();
        str += ip65504CurrentTagTable.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += ip000904PdsSubAttrTable.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public DoDelimitedPdsSubfldOutCtx clone() {
        DoDelimitedPdsSubfldOutCtx cloneObj = new DoDelimitedPdsSubfldOutCtx();
        cloneObj.newTag800 = new NewTag800();
        cloneObj.newTag800.set(newTag800.getClonedField());
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.ip000904PdsSubAttrTable = new Ip000904PdsSubAttrTable();
        cloneObj.ip000904PdsSubAttrTable.set(ip000904PdsSubAttrTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public DoDelimitedPdsSubfldOutCtx getDoDelimitedPdsSubfldOutCtx() {
            return new DoDelimitedPdsSubfldOutCtx();
    }
     public class HandleBadPdsIdInCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Work work = Ip662010Ctx.this.getWork();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();


public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public HandleBadPdsIdOutCtx getHandleBadPdsIdOutCtx() {
            return new HandleBadPdsIdOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += work.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public HandleBadPdsIdInCtx clone() {
        HandleBadPdsIdInCtx cloneObj = new HandleBadPdsIdInCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public HandleBadPdsIdInCtx getHandleBadPdsIdInCtx() {
            return new HandleBadPdsIdInCtx();
    }
     public class HandleBadPdsIdOutCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Work work = Ip662010Ctx.this.getWork();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of ipmErrorPointerWidth600
	 *	@return ipmErrorPointerWidth600
	 */
	public short getIpmErrorPointerWidth600() throws CFException {        
   		return work.getIpmErrorPointerWidth600();
	}
	
	/**
	 * 	Update IpmErrorPointerWidth600 with the passed value
	 *	@param number
	 */
	public void setIpmErrorPointerWidth600(short number)  throws CFException{
		work.setIpmErrorPointerWidth600(number);
	}

	public void setIpmErrorPointerWidth600(int number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}

	public void setIpmErrorPointerWidth600(long number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}



	/**
	 *	Returns the value of ip65504TagNo
	 *	@return ip65504TagNo
	 */
	public short getIp65504TagNo(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagNo();
	}
	
	/**
	 * 	Update Ip65504TagNo with the passed value
	 *	@param number
	 */
	public void setIp65504TagNo(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo(number);
	}

	public void setIp65504TagNo(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}

	public void setIp65504TagNo(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}



	/**
	 *	Returns the value of ip65504TagStarts
	 *	@return ip65504TagStarts
	 */
	public short getIp65504TagStarts(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagStarts();
	}
	
	/**
	 * 	Update Ip65504TagStarts with the passed value
	 *	@param number
	 */
	public void setIp65504TagStarts(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts(number);
	}

	public void setIp65504TagStarts(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}

	public void setIp65504TagStarts(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}



	/**
	 *	Returns the value of ip65504TagLngth
	 *	@return ip65504TagLngth
	 */
	public short getIp65504TagLngth(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagLngth();
	}
	
	/**
	 * 	Update Ip65504TagLngth with the passed value
	 *	@param number
	 */
	public void setIp65504TagLngth(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth(number);
	}

	public void setIp65504TagLngth(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth((short)number);
	}

	public void setIp65504TagLngth(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth((short)number);
	}



	/**
	 *	Returns the value of ip65504TagType
	 *	@return ip65504TagType
	 */
	public short getIp65504TagType(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagType();
	}
	
	/**
	 * 	Update Ip65504TagType with the passed value
	 *	@param number
	 */
	public void setIp65504TagType(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType(number);
	}

	public void setIp65504TagType(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}

	public void setIp65504TagType(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}



	/**
	 *	Returns the value of ipmErrorElementId600
	 *	@return ipmErrorElementId600
	 */   
	 public IpmErrorElementId600 getIpmErrorElementId600() {
   	return ipmErrorMsg600.getIpmErrorElementId600();
   }

   /**
	* 	Update IpmErrorElementId600 with the passed value
	*	@param value
	*/
   public void setIpmErrorElementId600(char[] value) throws CFException {
      ipmErrorMsg600.setIpmErrorElementId600(value);
   }   

     /**
	 * 	Update IpmErrorElementId600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorElementId600(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorElementId600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementId600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorElementId600 with another Field
	 *	@param value
	 */
   public void setIpmErrorElementId600(Field source) {
   	ipmErrorMsg600.setIpmErrorElementId600(source);
   }  
   
     /**
	 * 	Update IpmErrorElementId600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorElementId600(Field source, int sourceIndex,int sourceLen) {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorElementId600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementId600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += work.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public HandleBadPdsIdOutCtx clone() {
        HandleBadPdsIdOutCtx cloneObj = new HandleBadPdsIdOutCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public HandleBadPdsIdOutCtx getHandleBadPdsIdOutCtx() {
            return new HandleBadPdsIdOutCtx();
    }
     public class CheckPdsLimitInCtx implements Cloneable {
     UndefinedPds600 undefinedPds600 = Ip662010Ctx.this.getUndefinedPds600();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();

	/**
	 *	Returns the value of undefinedPdsCode600
	 *	@return undefinedPdsCode600
	 */
	public int getUndefinedPdsCode600() throws CFException {        
   		return work.getUndefinedPdsCode600();
	}
	
	/**
	 * 	Update UndefinedPdsCode600 with the passed value
	 *	@param number
	 */
	public void setUndefinedPdsCode600(int number)  throws CFException{
		work.setUndefinedPdsCode600(number);
	}


	public void setUndefinedPdsCode600(long number)  throws CFException{
		work.setUndefinedPdsCode600((int)number);
	}


	/**
	 *	Returns the value of maxPdsNo800
	 *	@return maxPdsNo800
	 */
	public short getMaxPdsNo800() throws CFException {        
   		return work.getMaxPdsNo800();
	}
	
	/**
	 * 	Update MaxPdsNo800 with the passed value
	 *	@param number
	 */
	public void setMaxPdsNo800(short number)  throws CFException{
		work.setMaxPdsNo800(number);
	}

	public void setMaxPdsNo800(int number)  throws CFException{
		work.setMaxPdsNo800((short)number);
	}

	public void setMaxPdsNo800(long number)  throws CFException{
		work.setMaxPdsNo800((short)number);
	}



	/**
	 *	Returns the value of undefinedPds600
	 *	@return undefinedPds600
	 */   
	 public UndefinedPds600 getUndefinedPds600() {
   	return undefinedPds600;
   }


	/**
	 *	Returns the value of pdsTag400
	 *	@return pdsTag400
	 */
	public short getPdsTag400() throws CFException {        
   		return work.getPdsTag400();
	}
	
	/**
	 * 	Update PdsTag400 with the passed value
	 *	@param number
	 */
	public void setPdsTag400(short number)  throws CFException{
		work.setPdsTag400(number);
	}

	public void setPdsTag400(int number)  throws CFException{
		work.setPdsTag400((short)number);
	}

	public void setPdsTag400(long number)  throws CFException{
		work.setPdsTag400((short)number);
	}



	/**
	 *	Returns the value of k400
	 *	@return k400
	 */
	public short getK400() throws CFException {        
   		return work.getK400();
	}
	
	/**
	 * 	Update K400 with the passed value
	 *	@param number
	 */
	public void setK400(short number)  throws CFException{
		work.setK400(number);
	}

	public void setK400(int number)  throws CFException{
		work.setK400((short)number);
	}

	public void setK400(long number)  throws CFException{
		work.setK400((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public CheckPdsLimitOutCtx getCheckPdsLimitOutCtx() {
            return new CheckPdsLimitOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += undefinedPds600.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ipmErrorMsg600.hashCode();
       return str.hashCode();
    }

    public CheckPdsLimitInCtx clone() {
        CheckPdsLimitInCtx cloneObj = new CheckPdsLimitInCtx();
        cloneObj.undefinedPds600 = new UndefinedPds600();
        cloneObj.undefinedPds600.set(undefinedPds600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        return cloneObj;
    }

    }

    public CheckPdsLimitInCtx getCheckPdsLimitInCtx() {
            return new CheckPdsLimitInCtx();
    }
     public class CheckPdsLimitOutCtx implements Cloneable {
     UndefinedPds600 undefinedPds600 = Ip662010Ctx.this.getUndefinedPds600();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();

	/**
	 *	Returns the value of undefinedPdsCode600
	 *	@return undefinedPdsCode600
	 */
	public int getUndefinedPdsCode600() throws CFException {        
   		return work.getUndefinedPdsCode600();
	}
	
	/**
	 * 	Update UndefinedPdsCode600 with the passed value
	 *	@param number
	 */
	public void setUndefinedPdsCode600(int number)  throws CFException{
		work.setUndefinedPdsCode600(number);
	}


	public void setUndefinedPdsCode600(long number)  throws CFException{
		work.setUndefinedPdsCode600((int)number);
	}


	/**
	 *	Returns the value of undefinedPds600
	 *	@return undefinedPds600
	 */   
	 public UndefinedPds600 getUndefinedPds600() {
   	return undefinedPds600;
   }


	/**
	 *	Returns the value of undefinedPdsNo600
	 *	@return undefinedPdsNo600
	 */
	public int getUndefinedPdsNo600() throws CFException {
   		return undefinedPds600.getUndefinedPdsNo600();
	}


	/**
	 *	Returns String value of undefinedPdsNo600
	 *	@return undefinedPdsNo600
	 */
	public char[]  getUndefinedPdsNo600String() throws CFException {
	     return String.valueOf(undefinedPds600.getUndefinedPdsNo600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean undefinedPdsNo600IsNumeric()  throws CFException{
	    return undefinedPds600.undefinedPdsNo600IsNumeric();
	}

	/**
	 * 	Update UndefinedPdsNo600 with the passed value
	 *	@param number
	 */
	public void setUndefinedPdsNo600(int number)  throws CFException{
		undefinedPds600.setUndefinedPdsNo600(number);
	}
	

	public void setUndefinedPdsNo600(long number)  throws CFException{
	    undefinedPds600.setUndefinedPdsNo600(number);
	}
	
	
	/**
	 * 	Update UndefinedPdsNo600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setUndefinedPdsNo600(char[] value)  throws CFException {
		undefinedPds600.setUndefinedPdsNo600(value);
	}
	
	/**
	 * 	Update UndefinedPdsNo600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setUndefinedPdsNo600String(char[] value)  throws CFException{
		undefinedPds600.setUndefinedPdsNo600(value);
	}	

	/**
	 *	Returns the value of pdsTag400
	 *	@return pdsTag400
	 */
	public short getPdsTag400() throws CFException {        
   		return work.getPdsTag400();
	}
	
	/**
	 * 	Update PdsTag400 with the passed value
	 *	@param number
	 */
	public void setPdsTag400(short number)  throws CFException{
		work.setPdsTag400(number);
	}

	public void setPdsTag400(int number)  throws CFException{
		work.setPdsTag400((short)number);
	}

	public void setPdsTag400(long number)  throws CFException{
		work.setPdsTag400((short)number);
	}



	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of ipmErrorText600
	 *	@return ipmErrorText600
	 */
   public char[] getIpmErrorText600() throws CFException  {              
   		return ipmErrorMsg600.getIpmErrorText600();
   }

  
	/**
	*  set variable ipmErrorText600
	*  @param value
	**/
   public void setIpmErrorText600(char[] value) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(value);
   } 

     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex);
   	
   }
   
   public void setIpmErrorText600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorText600 with another Field
	 *	@param value
	 */
   public void setIpmErrorText600(Field source) {
      ipmErrorMsg600.setIpmErrorText600(source);
   }  
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504MessageStatus
	 *	@return ip65504MessageStatus
	 */
	public short getIp65504MessageStatus() throws CFException {        
   		return ip65504MessageStatusGroup.getIp65504MessageStatus();
	}
	
	/**
	 * 	Update Ip65504MessageStatus with the passed value
	 *	@param number
	 */
	public void setIp65504MessageStatus(short number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus(number);
	}

	public void setIp65504MessageStatus(int number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}

	public void setIp65504MessageStatus(long number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}



	/**
	 *	Returns the value of tagNo600
	 *	@return tagNo600
	 */
   public char[] getTagNo600() throws CFException  {              
   		return work.getTagNo600();
   }

  
	/**
	*  set variable tagNo600
	*  @param value
	**/
   public void setTagNo600(char[] value) throws CFException {
      work.setTagNo600(value);
   } 

     /**
	 * 	Update TagNo600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTagNo600(char[] source, int sourceIndex) throws CFException {
      work.setTagNo600(source, sourceIndex);
   	
   }
   
   public void setTagNo600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTagNo600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TagNo600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagNo600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTagNo600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TagNo600 with another Field
	 *	@param value
	 */
   public void setTagNo600(Field source) {
      work.setTagNo600(source);
   }  
   
     /**
	 * 	Update TagNo600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTagNo600(Field source, int sourceIndex,int sourceLen) {
      work.setTagNo600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TagNo600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagNo600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTagNo600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of k400
	 *	@return k400
	 */
	public short getK400() throws CFException {        
   		return work.getK400();
	}
	
	/**
	 * 	Update K400 with the passed value
	 *	@param number
	 */
	public void setK400(short number)  throws CFException{
		work.setK400(number);
	}

	public void setK400(int number)  throws CFException{
		work.setK400((short)number);
	}

	public void setK400(long number)  throws CFException{
		work.setK400((short)number);
	}



	/**
	 *	Returns the value of errorCode600
	 *	@return errorCode600
	 */
	public long getErrorCode600() throws CFException {
   		return ipmErrorMsg600.getErrorCode600();
	}


	/**
	 *	Returns String value of errorCode600
	 *	@return errorCode600
	 */
	public char[]  getErrorCode600String() throws CFException {
	     return String.valueOf(ipmErrorMsg600.getErrorCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorCode600IsNumeric()  throws CFException{
	    return ipmErrorMsg600.errorCode600IsNumeric();
	}

	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param number
	 */
	public void setErrorCode600(long number)  throws CFException{
		ipmErrorMsg600.setErrorCode600(number);
	}
	

	
	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorCode600(char[] value)  throws CFException {
		ipmErrorMsg600.setErrorCode600(value);
	}
	
	/**
	 * 	Update ErrorCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorCode600String(char[] value)  throws CFException{
		ipmErrorMsg600.setErrorCode600(value);
	}	


        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += undefinedPds600.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ipmErrorMsg600.hashCode();
       return str.hashCode();
    }

    public CheckPdsLimitOutCtx clone() {
        CheckPdsLimitOutCtx cloneObj = new CheckPdsLimitOutCtx();
        cloneObj.undefinedPds600 = new UndefinedPds600();
        cloneObj.undefinedPds600.set(undefinedPds600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        return cloneObj;
    }

    }

    public CheckPdsLimitOutCtx getCheckPdsLimitOutCtx() {
            return new CheckPdsLimitOutCtx();
    }
     public class HandleShortCarrierInCtx implements Cloneable {
     CarrierTooShortValuesGroup600 carrierTooShortValuesGroup600 = Ip662010Ctx.this.getCarrierTooShortValuesGroup600();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();

	/**
	 *	Returns the value of carrierTooShortCodes600
	 *	@return carrierTooShortCodes600
	 */   
	 public CarrierTooShortCodes600 getCarrierTooShortCodes600() {
   	return carrierTooShortValuesGroup600.getCarrierTooShortCodes600();
   }

   /**
	* 	Update CarrierTooShortCodes600 with the passed value
	*	@param value
	*/
   public void setCarrierTooShortCodes600(char[] value) throws CFException {
      carrierTooShortValuesGroup600.setCarrierTooShortCodes600(value);
   }   

     /**
	 * 	Update CarrierTooShortCodes600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCarrierTooShortCodes600(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	carrierTooShortValuesGroup600.setCarrierTooShortCodes600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CarrierTooShortCodes600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCarrierTooShortCodes600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	carrierTooShortValuesGroup600.setCarrierTooShortCodes600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CarrierTooShortCodes600 with another Field
	 *	@param value
	 */
   public void setCarrierTooShortCodes600(Field source) {
   	carrierTooShortValuesGroup600.setCarrierTooShortCodes600(source);
   }  
   
     /**
	 * 	Update CarrierTooShortCodes600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCarrierTooShortCodes600(Field source, int sourceIndex,int sourceLen) {
   	carrierTooShortValuesGroup600.setCarrierTooShortCodes600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CarrierTooShortCodes600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCarrierTooShortCodes600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	carrierTooShortValuesGroup600.setCarrierTooShortCodes600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of carrierShortRow600
	 *	@return carrierShortRow600
	 */   
	 public CarrierShortRow600 getCarrierShortRow600(int index) {
   	return carrierTooShortValuesGroup600.getCarrierTooShortCodes600().getCarrierShortRow600(index);
   }

    public List<CarrierShortRow600> getCarrierShortRow600() {
        return carrierTooShortValuesGroup600.getCarrierTooShortCodes600().getCarrierShortRow600();
    }
   /**
	* 	Update CarrierShortRow600 with the passed value
	*	@param value
	*/
   public void setCarrierShortRow600(int index,char[] value) throws CFException {
      carrierTooShortValuesGroup600.getCarrierTooShortCodes600().setCarrierShortRow600((index),value);
   }   


	/**
	 *	Returns the value of carrierTooShortCode600
	 *	@return carrierTooShortCode600
	 */
	public short getCarrierTooShortCode600(int index) throws CFException {        
   		return carrierTooShortValuesGroup600.getCarrierTooShortCodes600().getCarrierShortRow600(index).getCarrierTooShortCode600();
	}
	
	/**
	 * 	Update CarrierTooShortCode600 with the passed value
	 *	@param number
	 */
	public void setCarrierTooShortCode600(int index,short number)  throws CFException{
		carrierTooShortValuesGroup600.getCarrierTooShortCodes600().getCarrierShortRow600(index).setCarrierTooShortCode600(number);
	}

	public void setCarrierTooShortCode600(int index,int number)  throws CFException{
		carrierTooShortValuesGroup600.getCarrierTooShortCodes600().getCarrierShortRow600(index).setCarrierTooShortCode600((short)number);
	}

	public void setCarrierTooShortCode600(int index,long number)  throws CFException{
		carrierTooShortValuesGroup600.getCarrierTooShortCodes600().getCarrierShortRow600(index).setCarrierTooShortCode600((short)number);
	}



	/**
	 *	Returns the value of carrierTooShortNdx600
	 *	@return carrierTooShortNdx600
	 */
	public int getCarrierTooShortNdx600() throws CFException {        
   		return work.getCarrierTooShortNdx600();
	}
	
	/**
	 * 	Update CarrierTooShortNdx600 with the passed value
	 *	@param number
	 */
	public void setCarrierTooShortNdx600(int number)  throws CFException{
		work.setCarrierTooShortNdx600(number);
	}


	public void setCarrierTooShortNdx600(long number)  throws CFException{
		work.setCarrierTooShortNdx600((int)number);
	}


	/**
	 *	Returns the value of ip65504DeStart
	 *	@return ip65504DeStart
	 */
	public short getIp65504DeStart(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeStart();
	}
	
	/**
	 * 	Update Ip65504DeStart with the passed value
	 *	@param number
	 */
	public void setIp65504DeStart(int index,short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart(number);
	}

	public void setIp65504DeStart(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart((short)number);
	}

	public void setIp65504DeStart(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart((short)number);
	}



	/**
	 *	Returns the value of carrierTooShortDe600
	 *	@return carrierTooShortDe600
	 */
	public short getCarrierTooShortDe600(int index) throws CFException {        
   		return carrierTooShortValuesGroup600.getCarrierTooShortCodes600().getCarrierShortRow600(index).getCarrierTooShortDe600();
	}
	
	/**
	 * 	Update CarrierTooShortDe600 with the passed value
	 *	@param number
	 */
	public void setCarrierTooShortDe600(int index,short number)  throws CFException{
		carrierTooShortValuesGroup600.getCarrierTooShortCodes600().getCarrierShortRow600(index).setCarrierTooShortDe600(number);
	}

	public void setCarrierTooShortDe600(int index,int number)  throws CFException{
		carrierTooShortValuesGroup600.getCarrierTooShortCodes600().getCarrierShortRow600(index).setCarrierTooShortDe600((short)number);
	}

	public void setCarrierTooShortDe600(int index,long number)  throws CFException{
		carrierTooShortValuesGroup600.getCarrierTooShortCodes600().getCarrierShortRow600(index).setCarrierTooShortDe600((short)number);
	}



	/**
	 *	Returns the value of i400
	 *	@return i400
	 */
	public short getI400() throws CFException {        
   		return work.getI400();
	}
	
	/**
	 * 	Update I400 with the passed value
	 *	@param number
	 */
	public void setI400(short number)  throws CFException{
		work.setI400(number);
	}

	public void setI400(int number)  throws CFException{
		work.setI400((short)number);
	}

	public void setI400(long number)  throws CFException{
		work.setI400((short)number);
	}



	/**
	 *	Returns the value of carrierTooShort600
	 *	@return carrierTooShort600
	 */
   public char[] getCarrierTooShort600() throws CFException  {              
   		return work.getCarrierTooShort600();
   }

  
	/**
	*  set variable carrierTooShort600
	*  @param value
	**/
   public void setCarrierTooShort600(char[] value) throws CFException {
      work.setCarrierTooShort600(value);
   } 


public void setCarrierShortCodeNdx600(int carrierShortCodeNdx600) { 
    Ip662010Ctx.this.carrierShortCodeNdx600 = carrierShortCodeNdx600;
}

public int getCarrierShortCodeNdx600() { 
    return Ip662010Ctx.this.carrierShortCodeNdx600;
}

        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public HandleShortCarrierOutCtx getHandleShortCarrierOutCtx() {
            return new HandleShortCarrierOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += carrierTooShortValuesGroup600.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += ip65504DeMapGroup.hashCode();
       return str.hashCode();
    }

    public HandleShortCarrierInCtx clone() {
        HandleShortCarrierInCtx cloneObj = new HandleShortCarrierInCtx();
        cloneObj.carrierTooShortValuesGroup600 = new CarrierTooShortValuesGroup600();
        cloneObj.carrierTooShortValuesGroup600.set(carrierTooShortValuesGroup600.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        return cloneObj;
    }

    }

    public HandleShortCarrierInCtx getHandleShortCarrierInCtx() {
            return new HandleShortCarrierInCtx();
    }
     public class HandleShortCarrierOutCtx implements Cloneable {
     CarrierTooShortValuesGroup600 carrierTooShortValuesGroup600 = Ip662010Ctx.this.getCarrierTooShortValuesGroup600();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();

	/**
	 *	Returns the value of ipmErrorPointerWidth600
	 *	@return ipmErrorPointerWidth600
	 */
	public short getIpmErrorPointerWidth600() throws CFException {        
   		return work.getIpmErrorPointerWidth600();
	}
	
	/**
	 * 	Update IpmErrorPointerWidth600 with the passed value
	 *	@param number
	 */
	public void setIpmErrorPointerWidth600(short number)  throws CFException{
		work.setIpmErrorPointerWidth600(number);
	}

	public void setIpmErrorPointerWidth600(int number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}

	public void setIpmErrorPointerWidth600(long number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}



	/**
	 *	Returns the value of ip662011ErrSubscript
	 *	@return ip662011ErrSubscript
	 */
	public int getIp662011ErrSubscript() throws CFException {        
   		return ip662011ErrSubscriptGroup.getIp662011ErrSubscript();
	}
	
	/**
	 * 	Update Ip662011ErrSubscript with the passed value
	 *	@param number
	 */
	public void setIp662011ErrSubscript(int number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript(number);
	}


	public void setIp662011ErrSubscript(long number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript((int)number);
	}


	/**
	 *	Returns the value of carrierTooShort600
	 *	@return carrierTooShort600
	 */
   public char[] getCarrierTooShort600() throws CFException  {              
   		return work.getCarrierTooShort600();
   }

  
	/**
	*  set variable carrierTooShort600
	*  @param value
	**/
   public void setCarrierTooShort600(char[] value) throws CFException {
      work.setCarrierTooShort600(value);
   } 

	/**
	 *	Returns the value of ipmErrorElementNo600
	 *	@return ipmErrorElementNo600
	 */
	public int getIpmErrorElementNo600() throws CFException {
   		return ipmErrorMsg600.getIpmErrorElementId600().getIpmErrorElementNo600();
	}


	/**
	 *	Returns String value of ipmErrorElementNo600
	 *	@return ipmErrorElementNo600
	 */
	public char[]  getIpmErrorElementNo600String() throws CFException {
	     return String.valueOf(ipmErrorMsg600.getIpmErrorElementId600().getIpmErrorElementNo600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ipmErrorElementNo600IsNumeric()  throws CFException{
	    return ipmErrorMsg600.getIpmErrorElementId600().ipmErrorElementNo600IsNumeric();
	}

	/**
	 * 	Update IpmErrorElementNo600 with the passed value
	 *	@param number
	 */
	public void setIpmErrorElementNo600(int number)  throws CFException{
		ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementNo600(number);
	}
	

	public void setIpmErrorElementNo600(long number)  throws CFException{
	    ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementNo600(number);
	}
	
	
	/**
	 * 	Update IpmErrorElementNo600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIpmErrorElementNo600(char[] value)  throws CFException {
		ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementNo600(value);
	}
	
	/**
	 * 	Update IpmErrorElementNo600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIpmErrorElementNo600String(char[] value)  throws CFException{
		ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementNo600(value);
	}	

	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of ipmErrorElementType600
	 *	@return ipmErrorElementType600
	 */
   public char[] getIpmErrorElementType600() throws CFException  {              
   		return ipmErrorMsg600.getIpmErrorElementId600().getIpmErrorElementType600();
   }

  
	/**
	*  set variable ipmErrorElementType600
	*  @param value
	**/
   public void setIpmErrorElementType600(char[] value) throws CFException {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(value);
   } 

     /**
	 * 	Update IpmErrorElementType600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorElementType600(char[] source, int sourceIndex) throws CFException {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(source, sourceIndex);
   	
   }
   
   public void setIpmErrorElementType600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorElementType600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementType600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorElementType600 with another Field
	 *	@param value
	 */
   public void setIpmErrorElementType600(Field source) {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(source);
   }  
   
     /**
	 * 	Update IpmErrorElementType600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorElementType600(Field source, int sourceIndex,int sourceLen) {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IpmErrorElementType600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementType600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errorCode600
	 *	@return errorCode600
	 */
	public long getErrorCode600() throws CFException {
   		return ipmErrorMsg600.getErrorCode600();
	}


	/**
	 *	Returns String value of errorCode600
	 *	@return errorCode600
	 */
	public char[]  getErrorCode600String() throws CFException {
	     return String.valueOf(ipmErrorMsg600.getErrorCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorCode600IsNumeric()  throws CFException{
	    return ipmErrorMsg600.errorCode600IsNumeric();
	}

	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param number
	 */
	public void setErrorCode600(long number)  throws CFException{
		ipmErrorMsg600.setErrorCode600(number);
	}
	

	
	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorCode600(char[] value)  throws CFException {
		ipmErrorMsg600.setErrorCode600(value);
	}
	
	/**
	 * 	Update ErrorCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorCode600String(char[] value)  throws CFException{
		ipmErrorMsg600.setErrorCode600(value);
	}	


public void setCarrierShortCodeNdx600(int carrierShortCodeNdx600) { 
    Ip662010Ctx.this.carrierShortCodeNdx600 = carrierShortCodeNdx600;
}

public int getCarrierShortCodeNdx600() { 
    return Ip662010Ctx.this.carrierShortCodeNdx600;
}
	/**
	 *	Returns the value of carrierTooShortCode600
	 *	@return carrierTooShortCode600
	 */
	public short getCarrierTooShortCode600(int index) throws CFException {        
   		return carrierTooShortValuesGroup600.getCarrierTooShortCodes600().getCarrierShortRow600(index).getCarrierTooShortCode600();
	}
	
	/**
	 * 	Update CarrierTooShortCode600 with the passed value
	 *	@param number
	 */
	public void setCarrierTooShortCode600(int index,short number)  throws CFException{
		carrierTooShortValuesGroup600.getCarrierTooShortCodes600().getCarrierShortRow600(index).setCarrierTooShortCode600(number);
	}

	public void setCarrierTooShortCode600(int index,int number)  throws CFException{
		carrierTooShortValuesGroup600.getCarrierTooShortCodes600().getCarrierShortRow600(index).setCarrierTooShortCode600((short)number);
	}

	public void setCarrierTooShortCode600(int index,long number)  throws CFException{
		carrierTooShortValuesGroup600.getCarrierTooShortCodes600().getCarrierShortRow600(index).setCarrierTooShortCode600((short)number);
	}



	/**
	 *	Returns the value of carrierTooShortNdx600
	 *	@return carrierTooShortNdx600
	 */
	public int getCarrierTooShortNdx600() throws CFException {        
   		return work.getCarrierTooShortNdx600();
	}
	
	/**
	 * 	Update CarrierTooShortNdx600 with the passed value
	 *	@param number
	 */
	public void setCarrierTooShortNdx600(int number)  throws CFException{
		work.setCarrierTooShortNdx600(number);
	}


	public void setCarrierTooShortNdx600(long number)  throws CFException{
		work.setCarrierTooShortNdx600((int)number);
	}


	/**
	 *	Returns the value of i400
	 *	@return i400
	 */
	public short getI400() throws CFException {        
   		return work.getI400();
	}
	
	/**
	 * 	Update I400 with the passed value
	 *	@param number
	 */
	public void setI400(short number)  throws CFException{
		work.setI400(number);
	}

	public void setI400(int number)  throws CFException{
		work.setI400((short)number);
	}

	public void setI400(long number)  throws CFException{
		work.setI400((short)number);
	}



	/**
	 *	Returns the value of ipmErrorText600
	 *	@return ipmErrorText600
	 */
   public char[] getIpmErrorText600() throws CFException  {              
   		return ipmErrorMsg600.getIpmErrorText600();
   }

  
	/**
	*  set variable ipmErrorText600
	*  @param value
	**/
   public void setIpmErrorText600(char[] value) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(value);
   } 

     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex);
   	
   }
   
   public void setIpmErrorText600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorText600 with another Field
	 *	@param value
	 */
   public void setIpmErrorText600(Field source) {
      ipmErrorMsg600.setIpmErrorText600(source);
   }  
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504MessageStatus
	 *	@return ip65504MessageStatus
	 */
	public short getIp65504MessageStatus() throws CFException {        
   		return ip65504MessageStatusGroup.getIp65504MessageStatus();
	}
	
	/**
	 * 	Update Ip65504MessageStatus with the passed value
	 *	@param number
	 */
	public void setIp65504MessageStatus(short number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus(number);
	}

	public void setIp65504MessageStatus(int number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}

	public void setIp65504MessageStatus(long number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += carrierTooShortValuesGroup600.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += ip65504DeMapGroup.hashCode();
       return str.hashCode();
    }

    public HandleShortCarrierOutCtx clone() {
        HandleShortCarrierOutCtx cloneObj = new HandleShortCarrierOutCtx();
        cloneObj.carrierTooShortValuesGroup600 = new CarrierTooShortValuesGroup600();
        cloneObj.carrierTooShortValuesGroup600.set(carrierTooShortValuesGroup600.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        return cloneObj;
    }

    }

    public HandleShortCarrierOutCtx getHandleShortCarrierOutCtx() {
            return new HandleShortCarrierOutCtx();
    }
     public class ParseViaTagTableInCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip662010Ctx.this.getIp66102IpmFileInformation();
     Ip65504TcntGroup ip65504TcntGroup = Ip662010Ctx.this.getIp65504TcntGroup();
     Work work = Ip662010Ctx.this.getWork();
     LastSubfldTag800 lastSubfldTag800 = Ip662010Ctx.this.getLastSubfldTag800();
     Ip65504TaggedRecordInfo ip65504TaggedRecordInfo = Ip662010Ctx.this.getIp65504TaggedRecordInfo();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();

	/**
	 *	Test condition "D" "P" for isMapEntryPending88100()
	 *	@return  Returns true if isMapEntryPending88100() is "D" "P"
	 */
   public boolean isMapEntryPending88100() throws CFException {
      return work.isMapEntryPending88100();
   }

	/**
	*  set values "D" "P"
	*/
   	public void setMapEntryPending88100True()  throws CFException{  			
    	work.setMapEntryPending88100True();
   	}
	/**
	 *	Returns the value of tagTableLength400
	 *	@return tagTableLength400
	 */
	public short getTagTableLength400() throws CFException {        
   		return work.getTagTableLength400();
	}
	
	/**
	 * 	Update TagTableLength400 with the passed value
	 *	@param number
	 */
	public void setTagTableLength400(short number)  throws CFException{
		work.setTagTableLength400(number);
	}

	public void setTagTableLength400(int number)  throws CFException{
		work.setTagTableLength400((short)number);
	}

	public void setTagTableLength400(long number)  throws CFException{
		work.setTagTableLength400((short)number);
	}



	/**
	 *	Returns the value of ip65504Max500
	 *	@return ip65504Max500
	 */
	public int getIp65504Max500() throws CFException {        
   		return ip65504Max500;
	}
	
	/**
	 * 	Update Ip65504Max500 with the passed value
	 *	@param number
	 */
	public void setIp65504Max500(int number)  throws CFException{
		Ip662010Ctx.this.setIp65504Max500(number);
	}


	public void setIp65504Max500(long number)  throws CFException{
		Ip662010Ctx.this.setIp65504Max500((int)number);
	}



public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of lastSubfldNo800
	 *	@return lastSubfldNo800
	 */
	public short getLastSubfldNo800() throws CFException {        
   		return lastSubfldTag800.getLastSubfldNo800();
	}
	
	/**
	 * 	Update LastSubfldNo800 with the passed value
	 *	@param number
	 */
	public void setLastSubfldNo800(short number)  throws CFException{
		lastSubfldTag800.setLastSubfldNo800(number);
	}

	public void setLastSubfldNo800(int number)  throws CFException{
		lastSubfldTag800.setLastSubfldNo800((short)number);
	}

	public void setLastSubfldNo800(long number)  throws CFException{
		lastSubfldTag800.setLastSubfldNo800((short)number);
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
	 *	Returns the value of ip66102TagStart
	 *	@return ip66102TagStart
	 */
	public long getIp66102TagStart() throws CFException {        
   		return ip66102IpmMsg.getIp66102NormalIpmMsgRedefined().getIp66102TagStart();
	}
	
	/**
	 * 	Update Ip66102TagStart with the passed value
	 *	@param number
	 */
	public void setIp66102TagStart(long number)  throws CFException{
		ip66102IpmMsg.getIp66102NormalIpmMsgRedefined().setIp66102TagStart(number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of ip65504TagArea
	 *	@return ip65504TagArea
	 */   
	 public Ip65504TagArea getIp65504TagArea(int index) {
   	return ip65504CurrentTagTable.getIp65504TagArea(index);
   }

    public List<Ip65504TagArea> getIp65504TagArea() {
        return ip65504CurrentTagTable.getIp65504TagArea();
    }
   /**
	* 	Update Ip65504TagArea with the passed value
	*	@param value
	*/
   public void setIp65504TagArea(int index,char[] value) throws CFException {
      ip65504CurrentTagTable.setIp65504TagArea((index),value);
   }   



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public ParseViaTagTableOutCtx getParseViaTagTableOutCtx() {
            return new ParseViaTagTableOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip66102IpmFileInformation.hashCode();
        str += ip65504TcntGroup.hashCode();
        str += work.hashCode();
        str += lastSubfldTag800.hashCode();
        str += ip65504TaggedRecordInfo.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public ParseViaTagTableInCtx clone() {
        ParseViaTagTableInCtx cloneObj = new ParseViaTagTableInCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.ip65504TcntGroup = new Ip65504TcntGroup();
        cloneObj.ip65504TcntGroup.set(ip65504TcntGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lastSubfldTag800 = new LastSubfldTag800();
        cloneObj.lastSubfldTag800.set(lastSubfldTag800.getClonedField());
        cloneObj.ip65504TaggedRecordInfo = new Ip65504TaggedRecordInfo();
        cloneObj.ip65504TaggedRecordInfo.set(ip65504TaggedRecordInfo.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public ParseViaTagTableInCtx getParseViaTagTableInCtx() {
            return new ParseViaTagTableInCtx();
    }
     public class ParseViaTagTableOutCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip662010Ctx.this.getIp66102IpmFileInformation();
     Ip65504TcntGroup ip65504TcntGroup = Ip662010Ctx.this.getIp65504TcntGroup();
     Work work = Ip662010Ctx.this.getWork();
     LastSubfldTag800 lastSubfldTag800 = Ip662010Ctx.this.getLastSubfldTag800();
     Ip65504TaggedRecordInfo ip65504TaggedRecordInfo = Ip662010Ctx.this.getIp65504TaggedRecordInfo();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of ip65504CurrentTagTable
	 *	@return ip65504CurrentTagTable
	 */   
	 public Ip65504CurrentTagTable getIp65504CurrentTagTable() {
   	return ip65504CurrentTagTable;
   }


	/**
	 *	Returns the value of tagTableLength400
	 *	@return tagTableLength400
	 */
	public short getTagTableLength400() throws CFException {        
   		return work.getTagTableLength400();
	}
	
	/**
	 * 	Update TagTableLength400 with the passed value
	 *	@param number
	 */
	public void setTagTableLength400(short number)  throws CFException{
		work.setTagTableLength400(number);
	}

	public void setTagTableLength400(int number)  throws CFException{
		work.setTagTableLength400((short)number);
	}

	public void setTagTableLength400(long number)  throws CFException{
		work.setTagTableLength400((short)number);
	}



	/**
	 *	Returns the value of ip65504Max500
	 *	@return ip65504Max500
	 */
	public int getIp65504Max500() throws CFException {        
   		return ip65504Max500;
	}
	
	/**
	 * 	Update Ip65504Max500 with the passed value
	 *	@param number
	 */
	public void setIp65504Max500(int number)  throws CFException{
		Ip662010Ctx.this.setIp65504Max500(number);
	}


	public void setIp65504Max500(long number)  throws CFException{
		Ip662010Ctx.this.setIp65504Max500((int)number);
	}



public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of ip65504TaggedRecordInfo
	 *	@return ip65504TaggedRecordInfo
	 */   
	 public Ip65504TaggedRecordInfo getIp65504TaggedRecordInfo() {
   	return ip65504TaggedRecordInfo;
   }


	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of ip66102TagStart
	 *	@return ip66102TagStart
	 */
	public long getIp66102TagStart() throws CFException {        
   		return ip66102IpmMsg.getIp66102NormalIpmMsgRedefined().getIp66102TagStart();
	}
	
	/**
	 * 	Update Ip66102TagStart with the passed value
	 *	@param number
	 */
	public void setIp66102TagStart(long number)  throws CFException{
		ip66102IpmMsg.getIp66102NormalIpmMsgRedefined().setIp66102TagStart(number);
	}



	/**
	 *	Returns the value of ip65504Tcnt
	 *	@return ip65504Tcnt
	 */
	public short getIp65504Tcnt() throws CFException {        
   		return ip65504TcntGroup.getIp65504Tcnt();
	}
	
	/**
	 * 	Update Ip65504Tcnt with the passed value
	 *	@param number
	 */
	public void setIp65504Tcnt(short number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt(number);
	}

	public void setIp65504Tcnt(int number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt((short)number);
	}

	public void setIp65504Tcnt(long number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip66102IpmFileInformation.hashCode();
        str += ip65504TcntGroup.hashCode();
        str += work.hashCode();
        str += lastSubfldTag800.hashCode();
        str += ip65504TaggedRecordInfo.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public ParseViaTagTableOutCtx clone() {
        ParseViaTagTableOutCtx cloneObj = new ParseViaTagTableOutCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.ip65504TcntGroup = new Ip65504TcntGroup();
        cloneObj.ip65504TcntGroup.set(ip65504TcntGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lastSubfldTag800 = new LastSubfldTag800();
        cloneObj.lastSubfldTag800.set(lastSubfldTag800.getClonedField());
        cloneObj.ip65504TaggedRecordInfo = new Ip65504TaggedRecordInfo();
        cloneObj.ip65504TaggedRecordInfo.set(ip65504TaggedRecordInfo.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public ParseViaTagTableOutCtx getParseViaTagTableOutCtx() {
            return new ParseViaTagTableOutCtx();
    }
     public class MoveMsgToStdAreaInCtx implements Cloneable {
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip662010Ctx.this.getIp66102IpmFileInformation();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();

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
	 *	Returns the value of ip66102TagStart
	 *	@return ip66102TagStart
	 */
	public long getIp66102TagStart() throws CFException {        
   		return ip66102IpmMsg.getIp66102NormalIpmMsgRedefined().getIp66102TagStart();
	}
	
	/**
	 * 	Update Ip66102TagStart with the passed value
	 *	@param number
	 */
	public void setIp66102TagStart(long number)  throws CFException{
		ip66102IpmMsg.getIp66102NormalIpmMsgRedefined().setIp66102TagStart(number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public MoveMsgToStdAreaOutCtx getMoveMsgToStdAreaOutCtx() {
            return new MoveMsgToStdAreaOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmFileInformation.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public MoveMsgToStdAreaInCtx clone() {
        MoveMsgToStdAreaInCtx cloneObj = new MoveMsgToStdAreaInCtx();
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public MoveMsgToStdAreaInCtx getMoveMsgToStdAreaInCtx() {
            return new MoveMsgToStdAreaInCtx();
    }
     public class MoveMsgToStdAreaOutCtx implements Cloneable {
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip662010Ctx.this.getIp66102IpmFileInformation();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();

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
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmFileInformation.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public MoveMsgToStdAreaOutCtx clone() {
        MoveMsgToStdAreaOutCtx cloneObj = new MoveMsgToStdAreaOutCtx();
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public MoveMsgToStdAreaOutCtx getMoveMsgToStdAreaOutCtx() {
            return new MoveMsgToStdAreaOutCtx();
    }
     public class ProcessATagInCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     Work work = Ip662010Ctx.this.getWork();
     LastSubfldTag800 lastSubfldTag800 = Ip662010Ctx.this.getLastSubfldTag800();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     CurrentTag800 currentTag800 = Ip662010Ctx.this.getCurrentTag800();

	/**
	 *	Test condition "D" "P" for isMapEntryPending88100()
	 *	@return  Returns true if isMapEntryPending88100() is "D" "P"
	 */
   public boolean isMapEntryPending88100() throws CFException {
      return work.isMapEntryPending88100();
   }

	/**
	*  set values "D" "P"
	*/
   	public void setMapEntryPending88100True()  throws CFException{  			
    	work.setMapEntryPending88100True();
   	}
	/**
	 *	Returns the value of invalidTagTypeNdx600
	 *	@return invalidTagTypeNdx600
	 */
	public int getInvalidTagTypeNdx600() throws CFException {        
   		return work.getInvalidTagTypeNdx600();
	}
	
	/**
	 * 	Update InvalidTagTypeNdx600 with the passed value
	 *	@param number
	 */
	public void setInvalidTagTypeNdx600(int number)  throws CFException{
		work.setInvalidTagTypeNdx600(number);
	}


	public void setInvalidTagTypeNdx600(long number)  throws CFException{
		work.setInvalidTagTypeNdx600((int)number);
	}



public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of invalidTagTypeCode600
	 *	@return invalidTagTypeCode600
	 */
	public int getInvalidTagTypeCode600() throws CFException {        
   		return work.getInvalidTagTypeCode600();
	}
	
	/**
	 * 	Update InvalidTagTypeCode600 with the passed value
	 *	@param number
	 */
	public void setInvalidTagTypeCode600(int number)  throws CFException{
		work.setInvalidTagTypeCode600(number);
	}


	public void setInvalidTagTypeCode600(long number)  throws CFException{
		work.setInvalidTagTypeCode600((int)number);
	}


	/**
	 *	Returns the value of invalidTagType600
	 *	@return invalidTagType600
	 */
   public char[] getInvalidTagType600() throws CFException  {              
   		return work.getInvalidTagType600();
   }

  
	/**
	*  set variable invalidTagType600
	*  @param value
	**/
   public void setInvalidTagType600(char[] value) throws CFException {
      work.setInvalidTagType600(value);
   } 

	/**
	 *	Returns the value of lastSubId800
	 *	@return lastSubId800
	 */
   public char[] getLastSubId800() throws CFException  {              
   		return lastSubfldTag800.getLastSubId800();
   }

  
	/**
	*  set variable lastSubId800
	*  @param value
	**/
   public void setLastSubId800(char[] value) throws CFException {
      lastSubfldTag800.setLastSubId800(value);
   } 

     /**
	 * 	Update LastSubId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLastSubId800(char[] source, int sourceIndex) throws CFException {
      lastSubfldTag800.setLastSubId800(source, sourceIndex);
   	
   }
   
   public void setLastSubId800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lastSubfldTag800.setLastSubId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LastSubId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLastSubId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lastSubfldTag800.setLastSubId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LastSubId800 with another Field
	 *	@param value
	 */
   public void setLastSubId800(Field source) {
      lastSubfldTag800.setLastSubId800(source);
   }  
   
     /**
	 * 	Update LastSubId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLastSubId800(Field source, int sourceIndex,int sourceLen) {
      lastSubfldTag800.setLastSubId800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LastSubId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLastSubId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lastSubfldTag800.setLastSubId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504TagArea
	 *	@return ip65504TagArea
	 */   
	 public Ip65504TagArea getIp65504TagArea(int index) {
   	return ip65504CurrentTagTable.getIp65504TagArea(index);
   }

    public List<Ip65504TagArea> getIp65504TagArea() {
        return ip65504CurrentTagTable.getIp65504TagArea();
    }
   /**
	* 	Update Ip65504TagArea with the passed value
	*	@param value
	*/
   public void setIp65504TagArea(int index,char[] value) throws CFException {
      ip65504CurrentTagTable.setIp65504TagArea((index),value);
   }   



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public ProcessATagOutCtx getProcessATagOutCtx() {
            return new ProcessATagOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += work.hashCode();
        str += lastSubfldTag800.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += currentTag800.hashCode();
       return str.hashCode();
    }

    public ProcessATagInCtx clone() {
        ProcessATagInCtx cloneObj = new ProcessATagInCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lastSubfldTag800 = new LastSubfldTag800();
        cloneObj.lastSubfldTag800.set(lastSubfldTag800.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.currentTag800 = new CurrentTag800();
        cloneObj.currentTag800.set(currentTag800.getClonedField());
        return cloneObj;
    }

    }

    public ProcessATagInCtx getProcessATagInCtx() {
            return new ProcessATagInCtx();
    }
     public class ProcessATagOutCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     LastSubfldTag800 lastSubfldTag800 = Ip662010Ctx.this.getLastSubfldTag800();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     CurrentTag800 currentTag800 = Ip662010Ctx.this.getCurrentTag800();

	/**
	 *	Returns the value of id800
	 *	@return id800
	 */   
	 public Id800 getId800() {
   	return currentTag800.getId800();
   }

   /**
	* 	Update Id800 with the passed value
	*	@param value
	*/
   public void setId800(char[] value) throws CFException {
      currentTag800.setId800(value);
   }   

     /**
	 * 	Update Id800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setId800(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	currentTag800.setId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Id800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	currentTag800.setId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Id800 with another Field
	 *	@param value
	 */
   public void setId800(Field source) {
   	currentTag800.setId800(source);
   }  
   
     /**
	 * 	Update Id800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setId800(Field source, int sourceIndex,int sourceLen) {
   	currentTag800.setId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Id800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	currentTag800.setId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of invalidTagTypeNdx600
	 *	@return invalidTagTypeNdx600
	 */
	public int getInvalidTagTypeNdx600() throws CFException {        
   		return work.getInvalidTagTypeNdx600();
	}
	
	/**
	 * 	Update InvalidTagTypeNdx600 with the passed value
	 *	@param number
	 */
	public void setInvalidTagTypeNdx600(int number)  throws CFException{
		work.setInvalidTagTypeNdx600(number);
	}


	public void setInvalidTagTypeNdx600(long number)  throws CFException{
		work.setInvalidTagTypeNdx600((int)number);
	}


	/**
	 *	Test condition 0 for isTagHasBeenDeleted800()
	 *	@return  Returns true if isTagHasBeenDeleted800() is 0
	 */
   public boolean isTagHasBeenDeleted800() throws CFException {
      return currentTag800.getId800().isTagHasBeenDeleted800();
   }

	/**
	*  set values 0
	*/
   	public void setTagHasBeenDeleted800True()  throws CFException{  			
    	currentTag800.getId800().setTagHasBeenDeleted800True();
   	}
	/**
	 *	Test condition 3 for isItsAPds800()
	 *	@return  Returns true if isItsAPds800() is 3
	 */
   public boolean isItsAPds800() throws CFException {
      return currentTag800.getId800().isItsAPds800();
   }

	/**
	*  set values 3
	*/
   	public void setItsAPds800True()  throws CFException{  			
    	currentTag800.getId800().setItsAPds800True();
   	}
	/**
	 *	Returns the value of invalidTagTypeCode600
	 *	@return invalidTagTypeCode600
	 */
	public int getInvalidTagTypeCode600() throws CFException {        
   		return work.getInvalidTagTypeCode600();
	}
	
	/**
	 * 	Update InvalidTagTypeCode600 with the passed value
	 *	@param number
	 */
	public void setInvalidTagTypeCode600(int number)  throws CFException{
		work.setInvalidTagTypeCode600(number);
	}


	public void setInvalidTagTypeCode600(long number)  throws CFException{
		work.setInvalidTagTypeCode600((int)number);
	}


	/**
	 *	Test condition 2 for isItsADataElement800()
	 *	@return  Returns true if isItsADataElement800() is 2
	 */
   public boolean isItsADataElement800() throws CFException {
      return currentTag800.getId800().isItsADataElement800();
   }

	/**
	*  set values 2
	*/
   	public void setItsADataElement800True()  throws CFException{  			
    	currentTag800.getId800().setItsADataElement800True();
   	}
	/**
	 *	Test condition 2 THRU 128 for isDeNoIsValid800()
	 *	@return  Returns true if isDeNoIsValid800() is 2 THRU 128
	 */
   public boolean isDeNoIsValid800() throws CFException {
      return currentTag800.getId800().isDeNoIsValid800();
   }

	/**
	*  set values 2 THRU 128
	*/
   	public void setDeNoIsValid800True()  throws CFException{  			
    	currentTag800.getId800().setDeNoIsValid800True();
   	}
	/**
	 *	Returns the value of ip662011ErrSubscript
	 *	@return ip662011ErrSubscript
	 */
	public int getIp662011ErrSubscript() throws CFException {        
   		return ip662011ErrSubscriptGroup.getIp662011ErrSubscript();
	}
	
	/**
	 * 	Update Ip662011ErrSubscript with the passed value
	 *	@param number
	 */
	public void setIp662011ErrSubscript(int number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript(number);
	}


	public void setIp662011ErrSubscript(long number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript((int)number);
	}


	/**
	 *	Returns the value of invalidTagType600
	 *	@return invalidTagType600
	 */
   public char[] getInvalidTagType600() throws CFException  {              
   		return work.getInvalidTagType600();
   }

  
	/**
	*  set variable invalidTagType600
	*  @param value
	**/
   public void setInvalidTagType600(char[] value) throws CFException {
      work.setInvalidTagType600(value);
   } 

	/**
	 *	Returns the value of currentTag800
	 *	@return currentTag800
	 */   
	 public CurrentTag800 getCurrentTag800() {
   	return currentTag800;
   }


	/**
	 *	Returns the value of errorCode600
	 *	@return errorCode600
	 */
	public long getErrorCode600() throws CFException {
   		return ipmErrorMsg600.getErrorCode600();
	}


	/**
	 *	Returns String value of errorCode600
	 *	@return errorCode600
	 */
	public char[]  getErrorCode600String() throws CFException {
	     return String.valueOf(ipmErrorMsg600.getErrorCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorCode600IsNumeric()  throws CFException{
	    return ipmErrorMsg600.errorCode600IsNumeric();
	}

	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param number
	 */
	public void setErrorCode600(long number)  throws CFException{
		ipmErrorMsg600.setErrorCode600(number);
	}
	

	
	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorCode600(char[] value)  throws CFException {
		ipmErrorMsg600.setErrorCode600(value);
	}
	
	/**
	 * 	Update ErrorCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorCode600String(char[] value)  throws CFException{
		ipmErrorMsg600.setErrorCode600(value);
	}	

	/**
	 *	Test condition 1 for isItsAnMti800()
	 *	@return  Returns true if isItsAnMti800() is 1
	 */
   public boolean isItsAnMti800() throws CFException {
      return currentTag800.getId800().isItsAnMti800();
   }

	/**
	*  set values 1
	*/
   	public void setItsAnMti800True()  throws CFException{  			
    	currentTag800.getId800().setItsAnMti800True();
   	}
	/**
	 *	Returns the value of ipmErrorText600
	 *	@return ipmErrorText600
	 */
   public char[] getIpmErrorText600() throws CFException  {              
   		return ipmErrorMsg600.getIpmErrorText600();
   }

  
	/**
	*  set variable ipmErrorText600
	*  @param value
	**/
   public void setIpmErrorText600(char[] value) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(value);
   } 

     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex);
   	
   }
   
   public void setIpmErrorText600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorText600 with another Field
	 *	@param value
	 */
   public void setIpmErrorText600(Field source) {
      ipmErrorMsg600.setIpmErrorText600(source);
   }  
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504MessageStatus
	 *	@return ip65504MessageStatus
	 */
	public short getIp65504MessageStatus() throws CFException {        
   		return ip65504MessageStatusGroup.getIp65504MessageStatus();
	}
	
	/**
	 * 	Update Ip65504MessageStatus with the passed value
	 *	@param number
	 */
	public void setIp65504MessageStatus(short number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus(number);
	}

	public void setIp65504MessageStatus(int number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}

	public void setIp65504MessageStatus(long number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}



	/**
	 *	Returns the value of ip65504TagArea
	 *	@return ip65504TagArea
	 */   
	 public Ip65504TagArea getIp65504TagArea(int index) {
   	return ip65504CurrentTagTable.getIp65504TagArea(index);
   }

    public List<Ip65504TagArea> getIp65504TagArea() {
        return ip65504CurrentTagTable.getIp65504TagArea();
    }
   /**
	* 	Update Ip65504TagArea with the passed value
	*	@param value
	*/
   public void setIp65504TagArea(int index,char[] value) throws CFException {
      ip65504CurrentTagTable.setIp65504TagArea((index),value);
   }   



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += lastSubfldTag800.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += currentTag800.hashCode();
       return str.hashCode();
    }

    public ProcessATagOutCtx clone() {
        ProcessATagOutCtx cloneObj = new ProcessATagOutCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.lastSubfldTag800 = new LastSubfldTag800();
        cloneObj.lastSubfldTag800.set(lastSubfldTag800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.currentTag800 = new CurrentTag800();
        cloneObj.currentTag800.set(currentTag800.getClonedField());
        return cloneObj;
    }

    }

    public ProcessATagOutCtx getProcessATagOutCtx() {
            return new ProcessATagOutCtx();
    }
     public class FinishPendingEntryInCtx implements Cloneable {
     Work work = Ip662010Ctx.this.getWork();
     LastSubfldTag800 lastSubfldTag800 = Ip662010Ctx.this.getLastSubfldTag800();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip662010Ctx.this.getIp65504PdsMapGroup();


public void setIp65504D(int ip65504D) { 
    Ip662010Ctx.this.ip65504D = ip65504D;
}

public int getIp65504D() { 
    return Ip662010Ctx.this.ip65504D;
}
	/**
	 *	Returns the value of ip65504DeStart
	 *	@return ip65504DeStart
	 */
	public short getIp65504DeStart(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeStart();
	}
	
	/**
	 * 	Update Ip65504DeStart with the passed value
	 *	@param number
	 */
	public void setIp65504DeStart(int index,short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart(number);
	}

	public void setIp65504DeStart(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart((short)number);
	}

	public void setIp65504DeStart(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart((short)number);
	}




public void setIp65504P(int ip65504P) { 
    Ip662010Ctx.this.ip65504P = ip65504P;
}

public int getIp65504P() { 
    return Ip662010Ctx.this.ip65504P;
}
	/**
	 *	Returns the value of ip65504PdsStart
	 *	@return ip65504PdsStart
	 */
	public short getIp65504PdsStart(int index) throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).getIp65504PdsStart();
	}
	
	/**
	 * 	Update Ip65504PdsStart with the passed value
	 *	@param number
	 */
	public void setIp65504PdsStart(int index,short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsStart(number);
	}

	public void setIp65504PdsStart(int index,int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsStart((short)number);
	}

	public void setIp65504PdsStart(int index,long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsStart((short)number);
	}



	/**
	 *	Returns the value of lastSubStart800
	 *	@return lastSubStart800
	 */
	public short getLastSubStart800() throws CFException {        
   		return lastSubfldTag800.getLastSubStart800();
	}
	
	/**
	 * 	Update LastSubStart800 with the passed value
	 *	@param number
	 */
	public void setLastSubStart800(short number)  throws CFException{
		lastSubfldTag800.setLastSubStart800(number);
	}

	public void setLastSubStart800(int number)  throws CFException{
		lastSubfldTag800.setLastSubStart800((short)number);
	}

	public void setLastSubStart800(long number)  throws CFException{
		lastSubfldTag800.setLastSubStart800((short)number);
	}



	/**
	 *	Test condition "P" for isPdsEntryPending88100()
	 *	@return  Returns true if isPdsEntryPending88100() is "P"
	 */
   public boolean isPdsEntryPending88100() throws CFException {
      return work.isPdsEntryPending88100();
   }

	/**
	*  set values "P"
	*/
   	public void setPdsEntryPending88100True()  throws CFException{  			
    	work.setPdsEntryPending88100True();
   	}
	/**
	 *	Returns the value of lastSubLngth800
	 *	@return lastSubLngth800
	 */
	public short getLastSubLngth800() throws CFException {        
   		return lastSubfldTag800.getLastSubLngth800();
	}
	
	/**
	 * 	Update LastSubLngth800 with the passed value
	 *	@param number
	 */
	public void setLastSubLngth800(short number)  throws CFException{
		lastSubfldTag800.setLastSubLngth800(number);
	}

	public void setLastSubLngth800(int number)  throws CFException{
		lastSubfldTag800.setLastSubLngth800((short)number);
	}

	public void setLastSubLngth800(long number)  throws CFException{
		lastSubfldTag800.setLastSubLngth800((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public FinishPendingEntryOutCtx getFinishPendingEntryOutCtx() {
            return new FinishPendingEntryOutCtx();
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
        str += lastSubfldTag800.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip65504PdsMapGroup.hashCode();
       return str.hashCode();
    }

    public FinishPendingEntryInCtx clone() {
        FinishPendingEntryInCtx cloneObj = new FinishPendingEntryInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lastSubfldTag800 = new LastSubfldTag800();
        cloneObj.lastSubfldTag800.set(lastSubfldTag800.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        return cloneObj;
    }

    }

    public FinishPendingEntryInCtx getFinishPendingEntryInCtx() {
            return new FinishPendingEntryInCtx();
    }
     public class FinishPendingEntryOutCtx implements Cloneable {
     Work work = Ip662010Ctx.this.getWork();
     LastSubfldTag800 lastSubfldTag800 = Ip662010Ctx.this.getLastSubfldTag800();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip662010Ctx.this.getIp65504PdsMapGroup();

	/**
	 *	Test condition "N" for isNoMapEntryPending88100()
	 *	@return  Returns true if isNoMapEntryPending88100() is "N"
	 */
   public boolean isNoMapEntryPending88100() throws CFException {
      return work.isNoMapEntryPending88100();
   }

	/**
	*  set values "N"
	*/
   	public void setNoMapEntryPending88100True()  throws CFException{  			
    	work.setNoMapEntryPending88100True();
   	}
	/**
	 *	Returns the value of ip65504PdsLngth
	 *	@return ip65504PdsLngth
	 */
	public short getIp65504PdsLngth(int index) throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).getIp65504PdsLngth();
	}
	
	/**
	 * 	Update Ip65504PdsLngth with the passed value
	 *	@param number
	 */
	public void setIp65504PdsLngth(int index,short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsLngth(number);
	}

	public void setIp65504PdsLngth(int index,int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsLngth((short)number);
	}

	public void setIp65504PdsLngth(int index,long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsLngth((short)number);
	}



	/**
	 *	Returns the value of ip65504DeLngth
	 *	@return ip65504DeLngth
	 */
	public short getIp65504DeLngth(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeLngth();
	}
	
	/**
	 * 	Update Ip65504DeLngth with the passed value
	 *	@param number
	 */
	public void setIp65504DeLngth(int index,short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth(number);
	}

	public void setIp65504DeLngth(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
	}

	public void setIp65504DeLngth(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
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
        str += lastSubfldTag800.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip65504PdsMapGroup.hashCode();
       return str.hashCode();
    }

    public FinishPendingEntryOutCtx clone() {
        FinishPendingEntryOutCtx cloneObj = new FinishPendingEntryOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lastSubfldTag800 = new LastSubfldTag800();
        cloneObj.lastSubfldTag800.set(lastSubfldTag800.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        return cloneObj;
    }

    }

    public FinishPendingEntryOutCtx getFinishPendingEntryOutCtx() {
            return new FinishPendingEntryOutCtx();
    }
     public class DoPdsTagInCtx implements Cloneable {
     Work work = Ip662010Ctx.this.getWork();
     LastSubfldTag800 lastSubfldTag800 = Ip662010Ctx.this.getLastSubfldTag800();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip662010Ctx.this.getIp65504PdsMapGroup();
     CurrentTag800 currentTag800 = Ip662010Ctx.this.getCurrentTag800();
     Ip65504SelPdsEntriesAll ip65504SelPdsEntriesAll = Ip662010Ctx.this.getIp65504SelPdsEntriesAll();

	/**
	 *	Test condition "N" for isNoMapEntryPending88100()
	 *	@return  Returns true if isNoMapEntryPending88100() is "N"
	 */
   public boolean isNoMapEntryPending88100() throws CFException {
      return work.isNoMapEntryPending88100();
   }

	/**
	*  set values "N"
	*/
   	public void setNoMapEntryPending88100True()  throws CFException{  			
    	work.setNoMapEntryPending88100True();
   	}
	/**
	 *	Returns the value of start800
	 *	@return start800
	 */
	public short getStart800() throws CFException {        
   		return currentTag800.getStart800();
	}
	
	/**
	 * 	Update Start800 with the passed value
	 *	@param number
	 */
	public void setStart800(short number)  throws CFException{
		currentTag800.setStart800(number);
	}

	public void setStart800(int number)  throws CFException{
		currentTag800.setStart800((short)number);
	}

	public void setStart800(long number)  throws CFException{
		currentTag800.setStart800((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of lastSubfldTag800
	 *	@return lastSubfldTag800
	 */   
	 public LastSubfldTag800 getLastSubfldTag800() {
   	return lastSubfldTag800;
   }



public void setIp65504P(int ip65504P) { 
    Ip662010Ctx.this.ip65504P = ip65504P;
}

public int getIp65504P() { 
    return Ip662010Ctx.this.ip65504P;
}
	/**
	 *	Returns the value of length800
	 *	@return length800
	 */
	public short getLength800() throws CFException {        
   		return currentTag800.getLength800();
	}
	
	/**
	 * 	Update Length800 with the passed value
	 *	@param number
	 */
	public void setLength800(short number)  throws CFException{
		currentTag800.setLength800(number);
	}

	public void setLength800(int number)  throws CFException{
		currentTag800.setLength800((short)number);
	}

	public void setLength800(long number)  throws CFException{
		currentTag800.setLength800((short)number);
	}



	/**
	 *	Returns the value of no800
	 *	@return no800
	 */
	public short getNo800() throws CFException {        
   		return currentTag800.getId800().getNo800();
	}
	
	/**
	 * 	Update No800 with the passed value
	 *	@param number
	 */
	public void setNo800(short number)  throws CFException{
		currentTag800.getId800().setNo800(number);
	}

	public void setNo800(int number)  throws CFException{
		currentTag800.getId800().setNo800((short)number);
	}

	public void setNo800(long number)  throws CFException{
		currentTag800.getId800().setNo800((short)number);
	}



	/**
	 *	Returns the value of currentTag800
	 *	@return currentTag800
	 */   
	 public CurrentTag800 getCurrentTag800() {
   	return currentTag800;
   }


	/**
	 *	Returns the value of subfldNo800
	 *	@return subfldNo800
	 */
	public short getSubfldNo800() throws CFException {        
   		return currentTag800.getSubfldNo800();
	}
	
	/**
	 * 	Update SubfldNo800 with the passed value
	 *	@param number
	 */
	public void setSubfldNo800(short number)  throws CFException{
		currentTag800.setSubfldNo800(number);
	}

	public void setSubfldNo800(int number)  throws CFException{
		currentTag800.setSubfldNo800((short)number);
	}

	public void setSubfldNo800(long number)  throws CFException{
		currentTag800.setSubfldNo800((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public DoPdsTagOutCtx getDoPdsTagOutCtx() {
            return new DoPdsTagOutCtx();
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
        str += lastSubfldTag800.hashCode();
        str += ip65504PdsMapGroup.hashCode();
        str += currentTag800.hashCode();
        str += ip65504SelPdsEntriesAll.hashCode();
       return str.hashCode();
    }

    public DoPdsTagInCtx clone() {
        DoPdsTagInCtx cloneObj = new DoPdsTagInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lastSubfldTag800 = new LastSubfldTag800();
        cloneObj.lastSubfldTag800.set(lastSubfldTag800.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        cloneObj.currentTag800 = new CurrentTag800();
        cloneObj.currentTag800.set(currentTag800.getClonedField());
        cloneObj.ip65504SelPdsEntriesAll = new Ip65504SelPdsEntriesAll();
        cloneObj.ip65504SelPdsEntriesAll.set(ip65504SelPdsEntriesAll.getClonedField());
        return cloneObj;
    }

    }

    public DoPdsTagInCtx getDoPdsTagInCtx() {
            return new DoPdsTagInCtx();
    }
     public class DoPdsTagOutCtx implements Cloneable {
     LastSubfldTag800 lastSubfldTag800 = Ip662010Ctx.this.getLastSubfldTag800();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip662010Ctx.this.getIp65504PdsMapGroup();
     CurrentTag800 currentTag800 = Ip662010Ctx.this.getCurrentTag800();
     Ip65504SelPdsEntriesAll ip65504SelPdsEntriesAll = Ip662010Ctx.this.getIp65504SelPdsEntriesAll();

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
	 *	Returns the value of ip65504PdsFirstSubfld
	 *	@return ip65504PdsFirstSubfld
	 */
	public int getIp65504PdsFirstSubfld(int index) throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).getIp65504PdsFirstSubfld();
	}
	
	/**
	 * 	Update Ip65504PdsFirstSubfld with the passed value
	 *	@param number
	 */
	public void setIp65504PdsFirstSubfld(int index,int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsFirstSubfld(number);
	}


	public void setIp65504PdsFirstSubfld(int index,long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsFirstSubfld((int)number);
	}


	/**
	 *	Returns the value of ip65504PdsMapEntry
	 *	@return ip65504PdsMapEntry
	 */   
	 public Ip65504PdsMapEntry getIp65504PdsMapEntry(int index) {
   	return ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index);
   }

    public List<Ip65504PdsMapEntry> getIp65504PdsMapEntry() {
        return ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry();
    }
   /**
	* 	Update Ip65504PdsMapEntry with the passed value
	*	@param value
	*/
   public void setIp65504PdsMapEntry(int index,char[] value) throws CFException {
      ip65504PdsMapGroup.getIp65504PdsMap().setIp65504PdsMapEntry((index),value);
   }   


	/**
	 *	Returns the value of start800
	 *	@return start800
	 */
	public short getStart800() throws CFException {        
   		return currentTag800.getStart800();
	}
	
	/**
	 * 	Update Start800 with the passed value
	 *	@param number
	 */
	public void setStart800(short number)  throws CFException{
		currentTag800.setStart800(number);
	}

	public void setStart800(int number)  throws CFException{
		currentTag800.setStart800((short)number);
	}

	public void setStart800(long number)  throws CFException{
		currentTag800.setStart800((short)number);
	}



	/**
	 *	Returns the value of lastSubfldTag800
	 *	@return lastSubfldTag800
	 */   
	 public LastSubfldTag800 getLastSubfldTag800() {
   	return lastSubfldTag800;
   }


	/**
	 *	Returns the value of ip65504PdsLngth
	 *	@return ip65504PdsLngth
	 */
	public short getIp65504PdsLngth(int index) throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).getIp65504PdsLngth();
	}
	
	/**
	 * 	Update Ip65504PdsLngth with the passed value
	 *	@param number
	 */
	public void setIp65504PdsLngth(int index,short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsLngth(number);
	}

	public void setIp65504PdsLngth(int index,int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsLngth((short)number);
	}

	public void setIp65504PdsLngth(int index,long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsLngth((short)number);
	}




public void setIp65504P(int ip65504P) { 
    Ip662010Ctx.this.ip65504P = ip65504P;
}

public int getIp65504P() { 
    return Ip662010Ctx.this.ip65504P;
}
	/**
	 *	Returns the value of ip65504PdsStart
	 *	@return ip65504PdsStart
	 */
	public short getIp65504PdsStart(int index) throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).getIp65504PdsStart();
	}
	
	/**
	 * 	Update Ip65504PdsStart with the passed value
	 *	@param number
	 */
	public void setIp65504PdsStart(int index,short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsStart(number);
	}

	public void setIp65504PdsStart(int index,int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsStart((short)number);
	}

	public void setIp65504PdsStart(int index,long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsStart((short)number);
	}



	/**
	 *	Returns the value of length800
	 *	@return length800
	 */
	public short getLength800() throws CFException {        
   		return currentTag800.getLength800();
	}
	
	/**
	 * 	Update Length800 with the passed value
	 *	@param number
	 */
	public void setLength800(short number)  throws CFException{
		currentTag800.setLength800(number);
	}

	public void setLength800(int number)  throws CFException{
		currentTag800.setLength800((short)number);
	}

	public void setLength800(long number)  throws CFException{
		currentTag800.setLength800((short)number);
	}



	/**
	 *	Test condition "P" for isPdsEntryPending88100()
	 *	@return  Returns true if isPdsEntryPending88100() is "P"
	 */
   public boolean isPdsEntryPending88100() throws CFException {
      return work.isPdsEntryPending88100();
   }

	/**
	*  set values "P"
	*/
   	public void setPdsEntryPending88100True()  throws CFException{  			
    	work.setPdsEntryPending88100True();
   	}
	/**
	 *	Returns the value of currentTag800
	 *	@return currentTag800
	 */   
	 public CurrentTag800 getCurrentTag800() {
   	return currentTag800;
   }



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += lastSubfldTag800.hashCode();
        str += work.hashCode();
        str += ip65504PdsMapGroup.hashCode();
        str += currentTag800.hashCode();
        str += ip65504SelPdsEntriesAll.hashCode();
       return str.hashCode();
    }

    public DoPdsTagOutCtx clone() {
        DoPdsTagOutCtx cloneObj = new DoPdsTagOutCtx();
        cloneObj.lastSubfldTag800 = new LastSubfldTag800();
        cloneObj.lastSubfldTag800.set(lastSubfldTag800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        cloneObj.currentTag800 = new CurrentTag800();
        cloneObj.currentTag800.set(currentTag800.getClonedField());
        cloneObj.ip65504SelPdsEntriesAll = new Ip65504SelPdsEntriesAll();
        cloneObj.ip65504SelPdsEntriesAll.set(ip65504SelPdsEntriesAll.getClonedField());
        return cloneObj;
    }

    }

    public DoPdsTagOutCtx getDoPdsTagOutCtx() {
            return new DoPdsTagOutCtx();
    }
     public class DoDeTagInCtx implements Cloneable {
     Work work = Ip662010Ctx.this.getWork();
     LastSubfldTag800 lastSubfldTag800 = Ip662010Ctx.this.getLastSubfldTag800();
     Ip65504SelElemEntriesAll ip65504SelElemEntriesAll = Ip662010Ctx.this.getIp65504SelElemEntriesAll();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();
     CurrentTag800 currentTag800 = Ip662010Ctx.this.getCurrentTag800();


public void setIp65504D(int ip65504D) { 
    Ip662010Ctx.this.ip65504D = ip65504D;
}

public int getIp65504D() { 
    return Ip662010Ctx.this.ip65504D;
}
	/**
	 *	Test condition "N" for isNoMapEntryPending88100()
	 *	@return  Returns true if isNoMapEntryPending88100() is "N"
	 */
   public boolean isNoMapEntryPending88100() throws CFException {
      return work.isNoMapEntryPending88100();
   }

	/**
	*  set values "N"
	*/
   	public void setNoMapEntryPending88100True()  throws CFException{  			
    	work.setNoMapEntryPending88100True();
   	}
	/**
	 *	Returns the value of start800
	 *	@return start800
	 */
	public short getStart800() throws CFException {        
   		return currentTag800.getStart800();
	}
	
	/**
	 * 	Update Start800 with the passed value
	 *	@param number
	 */
	public void setStart800(short number)  throws CFException{
		currentTag800.setStart800(number);
	}

	public void setStart800(int number)  throws CFException{
		currentTag800.setStart800((short)number);
	}

	public void setStart800(long number)  throws CFException{
		currentTag800.setStart800((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of lastSubfldTag800
	 *	@return lastSubfldTag800
	 */   
	 public LastSubfldTag800 getLastSubfldTag800() {
   	return lastSubfldTag800;
   }


	/**
	 *	Returns the value of length800
	 *	@return length800
	 */
	public short getLength800() throws CFException {        
   		return currentTag800.getLength800();
	}
	
	/**
	 * 	Update Length800 with the passed value
	 *	@param number
	 */
	public void setLength800(short number)  throws CFException{
		currentTag800.setLength800(number);
	}

	public void setLength800(int number)  throws CFException{
		currentTag800.setLength800((short)number);
	}

	public void setLength800(long number)  throws CFException{
		currentTag800.setLength800((short)number);
	}



	/**
	 *	Returns the value of no800
	 *	@return no800
	 */
	public short getNo800() throws CFException {        
   		return currentTag800.getId800().getNo800();
	}
	
	/**
	 * 	Update No800 with the passed value
	 *	@param number
	 */
	public void setNo800(short number)  throws CFException{
		currentTag800.getId800().setNo800(number);
	}

	public void setNo800(int number)  throws CFException{
		currentTag800.getId800().setNo800((short)number);
	}

	public void setNo800(long number)  throws CFException{
		currentTag800.getId800().setNo800((short)number);
	}



	/**
	 *	Returns the value of currentTag800
	 *	@return currentTag800
	 */   
	 public CurrentTag800 getCurrentTag800() {
   	return currentTag800;
   }


	/**
	 *	Returns the value of subfldNo800
	 *	@return subfldNo800
	 */
	public short getSubfldNo800() throws CFException {        
   		return currentTag800.getSubfldNo800();
	}
	
	/**
	 * 	Update SubfldNo800 with the passed value
	 *	@param number
	 */
	public void setSubfldNo800(short number)  throws CFException{
		currentTag800.setSubfldNo800(number);
	}

	public void setSubfldNo800(int number)  throws CFException{
		currentTag800.setSubfldNo800((short)number);
	}

	public void setSubfldNo800(long number)  throws CFException{
		currentTag800.setSubfldNo800((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public DoDeTagOutCtx getDoDeTagOutCtx() {
            return new DoDeTagOutCtx();
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
        str += lastSubfldTag800.hashCode();
        str += ip65504SelElemEntriesAll.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += currentTag800.hashCode();
       return str.hashCode();
    }

    public DoDeTagInCtx clone() {
        DoDeTagInCtx cloneObj = new DoDeTagInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lastSubfldTag800 = new LastSubfldTag800();
        cloneObj.lastSubfldTag800.set(lastSubfldTag800.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.currentTag800 = new CurrentTag800();
        cloneObj.currentTag800.set(currentTag800.getClonedField());
        return cloneObj;
    }

    }

    public DoDeTagInCtx getDoDeTagInCtx() {
            return new DoDeTagInCtx();
    }
     public class DoDeTagOutCtx implements Cloneable {
     LastSubfldTag800 lastSubfldTag800 = Ip662010Ctx.this.getLastSubfldTag800();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504SelElemEntriesAll ip65504SelElemEntriesAll = Ip662010Ctx.this.getIp65504SelElemEntriesAll();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();
     CurrentTag800 currentTag800 = Ip662010Ctx.this.getCurrentTag800();


public void setIp65504D(int ip65504D) { 
    Ip662010Ctx.this.ip65504D = ip65504D;
}

public int getIp65504D() { 
    return Ip662010Ctx.this.ip65504D;
}
	/**
	 *	Returns the value of ip65504DeMapEntry
	 *	@return ip65504DeMapEntry
	 */   
	 public Ip65504DeMapEntry getIp65504DeMapEntry(int index) {
   	return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index);
   }

    public List<Ip65504DeMapEntry> getIp65504DeMapEntry() {
        return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry();
    }
   /**
	* 	Update Ip65504DeMapEntry with the passed value
	*	@param value
	*/
   public void setIp65504DeMapEntry(int index,char[] value) throws CFException {
      ip65504DeMapGroup.getIp65504DeMap().setIp65504DeMapEntry((index),value);
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
	 *	Returns the value of ip65504DeStart
	 *	@return ip65504DeStart
	 */
	public short getIp65504DeStart(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeStart();
	}
	
	/**
	 * 	Update Ip65504DeStart with the passed value
	 *	@param number
	 */
	public void setIp65504DeStart(int index,short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart(number);
	}

	public void setIp65504DeStart(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart((short)number);
	}

	public void setIp65504DeStart(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart((short)number);
	}



	/**
	 *	Returns the value of start800
	 *	@return start800
	 */
	public short getStart800() throws CFException {        
   		return currentTag800.getStart800();
	}
	
	/**
	 * 	Update Start800 with the passed value
	 *	@param number
	 */
	public void setStart800(short number)  throws CFException{
		currentTag800.setStart800(number);
	}

	public void setStart800(int number)  throws CFException{
		currentTag800.setStart800((short)number);
	}

	public void setStart800(long number)  throws CFException{
		currentTag800.setStart800((short)number);
	}



	/**
	 *	Returns the value of lastSubfldTag800
	 *	@return lastSubfldTag800
	 */   
	 public LastSubfldTag800 getLastSubfldTag800() {
   	return lastSubfldTag800;
   }


	/**
	 *	Returns the value of ip65504DeLngth
	 *	@return ip65504DeLngth
	 */
	public short getIp65504DeLngth(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeLngth();
	}
	
	/**
	 * 	Update Ip65504DeLngth with the passed value
	 *	@param number
	 */
	public void setIp65504DeLngth(int index,short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth(number);
	}

	public void setIp65504DeLngth(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
	}

	public void setIp65504DeLngth(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
	}



	/**
	 *	Returns the value of length800
	 *	@return length800
	 */
	public short getLength800() throws CFException {        
   		return currentTag800.getLength800();
	}
	
	/**
	 * 	Update Length800 with the passed value
	 *	@param number
	 */
	public void setLength800(short number)  throws CFException{
		currentTag800.setLength800(number);
	}

	public void setLength800(int number)  throws CFException{
		currentTag800.setLength800((short)number);
	}

	public void setLength800(long number)  throws CFException{
		currentTag800.setLength800((short)number);
	}



	/**
	 *	Test condition "D" for isDeEntryPending88100()
	 *	@return  Returns true if isDeEntryPending88100() is "D"
	 */
   public boolean isDeEntryPending88100() throws CFException {
      return work.isDeEntryPending88100();
   }

	/**
	*  set values "D"
	*/
   	public void setDeEntryPending88100True()  throws CFException{  			
    	work.setDeEntryPending88100True();
   	}
	/**
	 *	Returns the value of currentTag800
	 *	@return currentTag800
	 */   
	 public CurrentTag800 getCurrentTag800() {
   	return currentTag800;
   }


	/**
	 *	Returns the value of ip65504DeFirstSubfld
	 *	@return ip65504DeFirstSubfld
	 */
	public int getIp65504DeFirstSubfld(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeFirstSubfld();
	}
	
	/**
	 * 	Update Ip65504DeFirstSubfld with the passed value
	 *	@param number
	 */
	public void setIp65504DeFirstSubfld(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeFirstSubfld(number);
	}


	public void setIp65504DeFirstSubfld(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeFirstSubfld((int)number);
	}



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += lastSubfldTag800.hashCode();
        str += work.hashCode();
        str += ip65504SelElemEntriesAll.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += currentTag800.hashCode();
       return str.hashCode();
    }

    public DoDeTagOutCtx clone() {
        DoDeTagOutCtx cloneObj = new DoDeTagOutCtx();
        cloneObj.lastSubfldTag800 = new LastSubfldTag800();
        cloneObj.lastSubfldTag800.set(lastSubfldTag800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.currentTag800 = new CurrentTag800();
        cloneObj.currentTag800.set(currentTag800.getClonedField());
        return cloneObj;
    }

    }

    public DoDeTagOutCtx getDoDeTagOutCtx() {
            return new DoDeTagOutCtx();
    }
     public class HandleBadTagInCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip662010Ctx.this.getIp66102IpmFileInformation();
     Work work = Ip662010Ctx.this.getWork();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of ip65504CurrentTagTable
	 *	@return ip65504CurrentTagTable
	 */   
	 public Ip65504CurrentTagTable getIp65504CurrentTagTable() {
   	return ip65504CurrentTagTable;
   }


	/**
	 *	Returns the value of tagTableLength400
	 *	@return tagTableLength400
	 */
	public short getTagTableLength400() throws CFException {        
   		return work.getTagTableLength400();
	}
	
	/**
	 * 	Update TagTableLength400 with the passed value
	 *	@param number
	 */
	public void setTagTableLength400(short number)  throws CFException{
		work.setTagTableLength400(number);
	}

	public void setTagTableLength400(int number)  throws CFException{
		work.setTagTableLength400((short)number);
	}

	public void setTagTableLength400(long number)  throws CFException{
		work.setTagTableLength400((short)number);
	}



	/**
	 *	Returns the value of i400
	 *	@return i400
	 */
	public short getI400() throws CFException {        
   		return work.getI400();
	}
	
	/**
	 * 	Update I400 with the passed value
	 *	@param number
	 */
	public void setI400(short number)  throws CFException{
		work.setI400(number);
	}

	public void setI400(int number)  throws CFException{
		work.setI400((short)number);
	}

	public void setI400(long number)  throws CFException{
		work.setI400((short)number);
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
	 *	Returns the value of ipmErrorElementId600
	 *	@return ipmErrorElementId600
	 */   
	 public IpmErrorElementId600 getIpmErrorElementId600() {
   	return ipmErrorMsg600.getIpmErrorElementId600();
   }

   /**
	* 	Update IpmErrorElementId600 with the passed value
	*	@param value
	*/
   public void setIpmErrorElementId600(char[] value) throws CFException {
      ipmErrorMsg600.setIpmErrorElementId600(value);
   }   

     /**
	 * 	Update IpmErrorElementId600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorElementId600(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorElementId600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementId600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorElementId600 with another Field
	 *	@param value
	 */
   public void setIpmErrorElementId600(Field source) {
   	ipmErrorMsg600.setIpmErrorElementId600(source);
   }  
   
     /**
	 * 	Update IpmErrorElementId600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorElementId600(Field source, int sourceIndex,int sourceLen) {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorElementId600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementId600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of ip65504TagArea
	 *	@return ip65504TagArea
	 */   
	 public Ip65504TagArea getIp65504TagArea(int index) {
   	return ip65504CurrentTagTable.getIp65504TagArea(index);
   }

    public List<Ip65504TagArea> getIp65504TagArea() {
        return ip65504CurrentTagTable.getIp65504TagArea();
    }
   /**
	* 	Update Ip65504TagArea with the passed value
	*	@param value
	*/
   public void setIp65504TagArea(int index,char[] value) throws CFException {
      ip65504CurrentTagTable.setIp65504TagArea((index),value);
   }   



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public HandleBadTagOutCtx getHandleBadTagOutCtx() {
            return new HandleBadTagOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip66102IpmFileInformation.hashCode();
        str += work.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public HandleBadTagInCtx clone() {
        HandleBadTagInCtx cloneObj = new HandleBadTagInCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public HandleBadTagInCtx getHandleBadTagInCtx() {
            return new HandleBadTagInCtx();
    }
     public class HandleBadTagOutCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip662010Ctx.this.getIp66102IpmFileInformation();
     Work work = Ip662010Ctx.this.getWork();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of ipmErrorPointerWidth600
	 *	@return ipmErrorPointerWidth600
	 */
	public short getIpmErrorPointerWidth600() throws CFException {        
   		return work.getIpmErrorPointerWidth600();
	}
	
	/**
	 * 	Update IpmErrorPointerWidth600 with the passed value
	 *	@param number
	 */
	public void setIpmErrorPointerWidth600(short number)  throws CFException{
		work.setIpmErrorPointerWidth600(number);
	}

	public void setIpmErrorPointerWidth600(int number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}

	public void setIpmErrorPointerWidth600(long number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}



	/**
	 *	Returns the value of ip65504CurrentTagTable
	 *	@return ip65504CurrentTagTable
	 */   
	 public Ip65504CurrentTagTable getIp65504CurrentTagTable() {
   	return ip65504CurrentTagTable;
   }


	/**
	 *	Returns the value of tagTableLength400
	 *	@return tagTableLength400
	 */
	public short getTagTableLength400() throws CFException {        
   		return work.getTagTableLength400();
	}
	
	/**
	 * 	Update TagTableLength400 with the passed value
	 *	@param number
	 */
	public void setTagTableLength400(short number)  throws CFException{
		work.setTagTableLength400(number);
	}

	public void setTagTableLength400(int number)  throws CFException{
		work.setTagTableLength400((short)number);
	}

	public void setTagTableLength400(long number)  throws CFException{
		work.setTagTableLength400((short)number);
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
	 *	Returns the value of ipmErrorElementId600
	 *	@return ipmErrorElementId600
	 */   
	 public IpmErrorElementId600 getIpmErrorElementId600() {
   	return ipmErrorMsg600.getIpmErrorElementId600();
   }

   /**
	* 	Update IpmErrorElementId600 with the passed value
	*	@param value
	*/
   public void setIpmErrorElementId600(char[] value) throws CFException {
      ipmErrorMsg600.setIpmErrorElementId600(value);
   }   

     /**
	 * 	Update IpmErrorElementId600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorElementId600(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorElementId600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementId600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorElementId600 with another Field
	 *	@param value
	 */
   public void setIpmErrorElementId600(Field source) {
   	ipmErrorMsg600.setIpmErrorElementId600(source);
   }  
   
     /**
	 * 	Update IpmErrorElementId600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorElementId600(Field source, int sourceIndex,int sourceLen) {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorElementId600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementId600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ipmErrorMsg600.setIpmErrorElementId600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip66102IpmFileInformation.hashCode();
        str += work.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public HandleBadTagOutCtx clone() {
        HandleBadTagOutCtx cloneObj = new HandleBadTagOutCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public HandleBadTagOutCtx getHandleBadTagOutCtx() {
            return new HandleBadTagOutCtx();
    }
     public class ExpandTheBitMapInCtx implements Cloneable {
     PGroup400 pGroup400 = Ip662010Ctx.this.getPGroup400();
     Ip65504SelElemEntriesAll ip65504SelElemEntriesAll = Ip662010Ctx.this.getIp65504SelElemEntriesAll();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();
     ParsingPatternValuesGroup500 parsingPatternValuesGroup500 = Ip662010Ctx.this.getParsingPatternValuesGroup500();

	/**
	 *	Returns the value of ip66102BitByte6
	 *	@return ip66102BitByte6
	 */
   public char[] getIp66102BitByte6() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte6();
   }

  
	/**
	*  set variable ip66102BitByte6
	*  @param value
	**/
   public void setIp66102BitByte6(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte6(value);
   } 

     /**
	 * 	Update Ip66102BitByte6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte6(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte6(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte6(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte6(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte6(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte6 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte6(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte6(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte6(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte6(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte6(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte7
	 *	@return ip66102BitByte7
	 */
   public char[] getIp66102BitByte7() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte7();
   }

  
	/**
	*  set variable ip66102BitByte7
	*  @param value
	**/
   public void setIp66102BitByte7(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte7(value);
   } 

     /**
	 * 	Update Ip66102BitByte7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte7(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte7(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte7(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte7(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte7(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte7 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte7(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte7(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte7(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte7(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte7(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504SelElemEntriesAll
	 *	@return ip65504SelElemEntriesAll
	 */   
	 public Ip65504SelElemEntriesAll getIp65504SelElemEntriesAll() {
   	return ip65504SelElemEntriesAll;
   }


	/**
	 *	Returns the value of ip66102BitByte15
	 *	@return ip66102BitByte15
	 */
   public char[] getIp66102BitByte15() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte15();
   }

  
	/**
	*  set variable ip66102BitByte15
	*  @param value
	**/
   public void setIp66102BitByte15(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte15(value);
   } 

     /**
	 * 	Update Ip66102BitByte15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte15(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte15(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte15(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte15(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte15(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte15 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte15(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte15(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte15(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte15(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte15(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte5
	 *	@return ip66102BitByte5
	 */
   public char[] getIp66102BitByte5() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte5();
   }

  
	/**
	*  set variable ip66102BitByte5
	*  @param value
	**/
   public void setIp66102BitByte5(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte5(value);
   } 

     /**
	 * 	Update Ip66102BitByte5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte5(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte5(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte5(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte5(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte5(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte5 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte5(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte5(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte5(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte5(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte5(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte1
	 *	@return ip66102BitByte1
	 */
   public char[] getIp66102BitByte1() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte1();
   }

  
	/**
	*  set variable ip66102BitByte1
	*  @param value
	**/
   public void setIp66102BitByte1(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte1(value);
   } 

     /**
	 * 	Update Ip66102BitByte1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte1(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte1(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte1 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte1(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte1(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte1(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte14
	 *	@return ip66102BitByte14
	 */
   public char[] getIp66102BitByte14() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte14();
   }

  
	/**
	*  set variable ip66102BitByte14
	*  @param value
	**/
   public void setIp66102BitByte14(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte14(value);
   } 

     /**
	 * 	Update Ip66102BitByte14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte14(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte14(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte14(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte14(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte14(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte14 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte14(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte14(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte14(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte14(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte14(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte12
	 *	@return ip66102BitByte12
	 */
   public char[] getIp66102BitByte12() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte12();
   }

  
	/**
	*  set variable ip66102BitByte12
	*  @param value
	**/
   public void setIp66102BitByte12(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte12(value);
   } 

     /**
	 * 	Update Ip66102BitByte12 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte12(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte12(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte12(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte12(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte12 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte12(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte12 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte12(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte12(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte12 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte12(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte12(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte12(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of p400
	 *	@return p400
	 */
	public short getP400() throws CFException {        
   		return pGroup400.getP400();
	}
	
	/**
	 * 	Update P400 with the passed value
	 *	@param number
	 */
	public void setP400(short number)  throws CFException{
		pGroup400.setP400(number);
	}

	public void setP400(int number)  throws CFException{
		pGroup400.setP400((short)number);
	}

	public void setP400(long number)  throws CFException{
		pGroup400.setP400((short)number);
	}



	/**
	 *	Returns the value of ip66102BitByte2
	 *	@return ip66102BitByte2
	 */
   public char[] getIp66102BitByte2() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte2();
   }

  
	/**
	*  set variable ip66102BitByte2
	*  @param value
	**/
   public void setIp66102BitByte2(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte2(value);
   } 

     /**
	 * 	Update Ip66102BitByte2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte2(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte2(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte2 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte2(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte2(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte2(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte11
	 *	@return ip66102BitByte11
	 */
   public char[] getIp66102BitByte11() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte11();
   }

  
	/**
	*  set variable ip66102BitByte11
	*  @param value
	**/
   public void setIp66102BitByte11(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte11(value);
   } 

     /**
	 * 	Update Ip66102BitByte11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte11(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte11(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte11(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte11(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte11(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte11 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte11(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte11(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte11(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte11(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte11(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte13
	 *	@return ip66102BitByte13
	 */
   public char[] getIp66102BitByte13() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte13();
   }

  
	/**
	*  set variable ip66102BitByte13
	*  @param value
	**/
   public void setIp66102BitByte13(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte13(value);
   } 

     /**
	 * 	Update Ip66102BitByte13 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte13(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte13(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte13(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte13(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte13 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte13(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte13 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte13(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte13(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte13 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte13(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte13(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte13(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte3
	 *	@return ip66102BitByte3
	 */
   public char[] getIp66102BitByte3() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte3();
   }

  
	/**
	*  set variable ip66102BitByte3
	*  @param value
	**/
   public void setIp66102BitByte3(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte3(value);
   } 

     /**
	 * 	Update Ip66102BitByte3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte3(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte3(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte3(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte3(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte3 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte3(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte3(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte3(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte3(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte10
	 *	@return ip66102BitByte10
	 */
   public char[] getIp66102BitByte10() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte10();
   }

  
	/**
	*  set variable ip66102BitByte10
	*  @param value
	**/
   public void setIp66102BitByte10(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte10(value);
   } 

     /**
	 * 	Update Ip66102BitByte10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte10(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte10(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte10(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte10(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte10(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte10 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte10(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte10(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte10(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte10(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte10(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte16
	 *	@return ip66102BitByte16
	 */
   public char[] getIp66102BitByte16() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte16();
   }

  
	/**
	*  set variable ip66102BitByte16
	*  @param value
	**/
   public void setIp66102BitByte16(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte16(value);
   } 

     /**
	 * 	Update Ip66102BitByte16 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte16(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte16(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte16(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte16(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte16 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte16(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte16(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte16 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte16(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte16(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte16 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte16(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte16(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte16 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte16(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte16(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte4
	 *	@return ip66102BitByte4
	 */
   public char[] getIp66102BitByte4() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte4();
   }

  
	/**
	*  set variable ip66102BitByte4
	*  @param value
	**/
   public void setIp66102BitByte4(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte4(value);
   } 

     /**
	 * 	Update Ip66102BitByte4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte4(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte4(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte4(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte4(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte4 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte4(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte4(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte4(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte4(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte8
	 *	@return ip66102BitByte8
	 */
   public char[] getIp66102BitByte8() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte8();
   }

  
	/**
	*  set variable ip66102BitByte8
	*  @param value
	**/
   public void setIp66102BitByte8(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte8(value);
   } 

     /**
	 * 	Update Ip66102BitByte8 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte8(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte8(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte8(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte8(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte8 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte8(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte8 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte8(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte8(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte8 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte8(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte8(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte8(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of parsingPattern500
	 *	@return parsingPattern500
	 */
   public char[] getParsingPattern500(int index) throws CFException  {              
   		return parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(index);
   }

  
	/**
	*  set variable parsingPattern500
	*  @param value
	**/
   public void setParsingPattern500(int index,char[] value) throws CFException {
      parsingPatternValuesGroup500.getParsingPatternValues500Redefined().setParsingPattern500((index),value);
   } 

	/**
	 *	Returns the value of ip66102BitByte9
	 *	@return ip66102BitByte9
	 */
   public char[] getIp66102BitByte9() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte9();
   }

  
	/**
	*  set variable ip66102BitByte9
	*  @param value
	**/
   public void setIp66102BitByte9(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte9(value);
   } 

     /**
	 * 	Update Ip66102BitByte9 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte9(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte9(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte9(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte9(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte9 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte9(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte9 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte9(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte9(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte9 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte9(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte9(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte9(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public ExpandTheBitMapOutCtx getExpandTheBitMapOutCtx() {
            return new ExpandTheBitMapOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += pGroup400.hashCode();
        str += ip65504SelElemEntriesAll.hashCode();
        str += ip66102IpmMsg.hashCode();
        str += parsingPatternValuesGroup500.hashCode();
       return str.hashCode();
    }

    public ExpandTheBitMapInCtx clone() {
        ExpandTheBitMapInCtx cloneObj = new ExpandTheBitMapInCtx();
        cloneObj.pGroup400 = new PGroup400();
        cloneObj.pGroup400.set(pGroup400.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.parsingPatternValuesGroup500 = new ParsingPatternValuesGroup500();
        cloneObj.parsingPatternValuesGroup500.set(parsingPatternValuesGroup500.getClonedField());
        return cloneObj;
    }

    }

    public ExpandTheBitMapInCtx getExpandTheBitMapInCtx() {
            return new ExpandTheBitMapInCtx();
    }
     public class ExpandTheBitMapOutCtx implements Cloneable {
     PGroup400 pGroup400 = Ip662010Ctx.this.getPGroup400();
     Ip65504SelElemEntriesAll ip65504SelElemEntriesAll = Ip662010Ctx.this.getIp65504SelElemEntriesAll();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();
     ParsingPatternValuesGroup500 parsingPatternValuesGroup500 = Ip662010Ctx.this.getParsingPatternValuesGroup500();

	/**
	 *	Returns the value of ip66102BitByte6
	 *	@return ip66102BitByte6
	 */
   public char[] getIp66102BitByte6() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte6();
   }

  
	/**
	*  set variable ip66102BitByte6
	*  @param value
	**/
   public void setIp66102BitByte6(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte6(value);
   } 

     /**
	 * 	Update Ip66102BitByte6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte6(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte6(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte6(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte6(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte6(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte6 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte6(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte6(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte6(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte6(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte6(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte7
	 *	@return ip66102BitByte7
	 */
   public char[] getIp66102BitByte7() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte7();
   }

  
	/**
	*  set variable ip66102BitByte7
	*  @param value
	**/
   public void setIp66102BitByte7(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte7(value);
   } 

     /**
	 * 	Update Ip66102BitByte7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte7(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte7(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte7(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte7(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte7(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte7 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte7(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte7(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte7(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte7(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte7(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pX400
	 *	@return pX400
	 */
   public char[] getPX400() throws CFException  {              
   		return pGroup400.getP400Redefined().getPX400();
   }

  
	/**
	*  set variable pX400
	*  @param value
	**/
   public void setPX400(char[] value) throws CFException {
      pGroup400.getP400Redefined().setPX400(value);
   } 

     /**
	 * 	Update PX400 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPX400(char[] source, int sourceIndex) throws CFException {
      pGroup400.getP400Redefined().setPX400(source, sourceIndex);
   	
   }
   
   public void setPX400(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pGroup400.getP400Redefined().setPX400(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PX400 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPX400(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pGroup400.getP400Redefined().setPX400(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PX400 with another Field
	 *	@param value
	 */
   public void setPX400(Field source) {
      pGroup400.getP400Redefined().setPX400(source);
   }  
   
     /**
	 * 	Update PX400 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPX400(Field source, int sourceIndex,int sourceLen) {
      pGroup400.getP400Redefined().setPX400(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PX400 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPX400(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pGroup400.getP400Redefined().setPX400(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504SelElemEntriesAll
	 *	@return ip65504SelElemEntriesAll
	 */   
	 public Ip65504SelElemEntriesAll getIp65504SelElemEntriesAll() {
   	return ip65504SelElemEntriesAll;
   }


	/**
	 *	Returns the value of ip66102BitByte15
	 *	@return ip66102BitByte15
	 */
   public char[] getIp66102BitByte15() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte15();
   }

  
	/**
	*  set variable ip66102BitByte15
	*  @param value
	**/
   public void setIp66102BitByte15(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte15(value);
   } 

     /**
	 * 	Update Ip66102BitByte15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte15(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte15(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte15(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte15(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte15(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte15 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte15(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte15(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte15(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte15(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte15(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte5
	 *	@return ip66102BitByte5
	 */
   public char[] getIp66102BitByte5() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte5();
   }

  
	/**
	*  set variable ip66102BitByte5
	*  @param value
	**/
   public void setIp66102BitByte5(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte5(value);
   } 

     /**
	 * 	Update Ip66102BitByte5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte5(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte5(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte5(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte5(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte5(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte5 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte5(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte5(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte5(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte5(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte5(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte1
	 *	@return ip66102BitByte1
	 */
   public char[] getIp66102BitByte1() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte1();
   }

  
	/**
	*  set variable ip66102BitByte1
	*  @param value
	**/
   public void setIp66102BitByte1(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte1(value);
   } 

     /**
	 * 	Update Ip66102BitByte1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte1(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte1(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte1 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte1(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte1(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte1(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte14
	 *	@return ip66102BitByte14
	 */
   public char[] getIp66102BitByte14() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte14();
   }

  
	/**
	*  set variable ip66102BitByte14
	*  @param value
	**/
   public void setIp66102BitByte14(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte14(value);
   } 

     /**
	 * 	Update Ip66102BitByte14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte14(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte14(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte14(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte14(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte14(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte14 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte14(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte14(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte14(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte14(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte14(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte12
	 *	@return ip66102BitByte12
	 */
   public char[] getIp66102BitByte12() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte12();
   }

  
	/**
	*  set variable ip66102BitByte12
	*  @param value
	**/
   public void setIp66102BitByte12(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte12(value);
   } 

     /**
	 * 	Update Ip66102BitByte12 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte12(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte12(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte12(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte12(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte12 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte12(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte12 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte12(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte12(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte12 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte12(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte12(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte12(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte2
	 *	@return ip66102BitByte2
	 */
   public char[] getIp66102BitByte2() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte2();
   }

  
	/**
	*  set variable ip66102BitByte2
	*  @param value
	**/
   public void setIp66102BitByte2(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte2(value);
   } 

     /**
	 * 	Update Ip66102BitByte2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte2(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte2(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte2 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte2(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte2(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte2(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte11
	 *	@return ip66102BitByte11
	 */
   public char[] getIp66102BitByte11() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte11();
   }

  
	/**
	*  set variable ip66102BitByte11
	*  @param value
	**/
   public void setIp66102BitByte11(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte11(value);
   } 

     /**
	 * 	Update Ip66102BitByte11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte11(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte11(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte11(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte11(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte11(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte11 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte11(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte11(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte11(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte11(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte11(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte13
	 *	@return ip66102BitByte13
	 */
   public char[] getIp66102BitByte13() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte13();
   }

  
	/**
	*  set variable ip66102BitByte13
	*  @param value
	**/
   public void setIp66102BitByte13(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte13(value);
   } 

     /**
	 * 	Update Ip66102BitByte13 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte13(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte13(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte13(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte13(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte13 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte13(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte13 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte13(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte13(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte13 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte13(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte13(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte13(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte3
	 *	@return ip66102BitByte3
	 */
   public char[] getIp66102BitByte3() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte3();
   }

  
	/**
	*  set variable ip66102BitByte3
	*  @param value
	**/
   public void setIp66102BitByte3(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte3(value);
   } 

     /**
	 * 	Update Ip66102BitByte3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte3(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte3(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte3(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte3(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte3 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte3(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte3(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte3(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte3(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte10
	 *	@return ip66102BitByte10
	 */
   public char[] getIp66102BitByte10() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte10();
   }

  
	/**
	*  set variable ip66102BitByte10
	*  @param value
	**/
   public void setIp66102BitByte10(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte10(value);
   } 

     /**
	 * 	Update Ip66102BitByte10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte10(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte10(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte10(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte10(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte10(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte10 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte10(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte10(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte10(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte10(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte10(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte16
	 *	@return ip66102BitByte16
	 */
   public char[] getIp66102BitByte16() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte16();
   }

  
	/**
	*  set variable ip66102BitByte16
	*  @param value
	**/
   public void setIp66102BitByte16(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte16(value);
   } 

     /**
	 * 	Update Ip66102BitByte16 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte16(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte16(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte16(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte16(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte16 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte16(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte16(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte16 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte16(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte16(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte16 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte16(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte16(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte16 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte16(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte16(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte4
	 *	@return ip66102BitByte4
	 */
   public char[] getIp66102BitByte4() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte4();
   }

  
	/**
	*  set variable ip66102BitByte4
	*  @param value
	**/
   public void setIp66102BitByte4(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte4(value);
   } 

     /**
	 * 	Update Ip66102BitByte4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte4(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte4(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte4(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte4(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte4 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte4(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte4(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte4(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte4(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102BitByte8
	 *	@return ip66102BitByte8
	 */
   public char[] getIp66102BitByte8() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte8();
   }

  
	/**
	*  set variable ip66102BitByte8
	*  @param value
	**/
   public void setIp66102BitByte8(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte8(value);
   } 

     /**
	 * 	Update Ip66102BitByte8 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte8(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte8(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte8(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte8(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte8 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte8(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte8 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte8(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte8(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte8 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte8(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte8(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte8(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of parsingPattern500
	 *	@return parsingPattern500
	 */
   public char[] getParsingPattern500(int index) throws CFException  {              
   		return parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(index);
   }

  
	/**
	*  set variable parsingPattern500
	*  @param value
	**/
   public void setParsingPattern500(int index,char[] value) throws CFException {
      parsingPatternValuesGroup500.getParsingPatternValues500Redefined().setParsingPattern500((index),value);
   } 

	/**
	 *	Returns the value of ip66102BitByte9
	 *	@return ip66102BitByte9
	 */
   public char[] getIp66102BitByte9() throws CFException  {              
   		return ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().getIp66102BitByte9();
   }

  
	/**
	*  set variable ip66102BitByte9
	*  @param value
	**/
   public void setIp66102BitByte9(char[] value) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte9(value);
   } 

     /**
	 * 	Update Ip66102BitByte9 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte9(char[] source, int sourceIndex) throws CFException {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte9(source, sourceIndex);
   	
   }
   
   public void setIp66102BitByte9(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte9(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66102BitByte9 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte9(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66102BitByte9 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte9(Field source) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte9(source);
   }  
   
     /**
	 * 	Update Ip66102BitByte9 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte9(Field source, int sourceIndex,int sourceLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte9(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66102BitByte9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap().setIp66102BitByte9(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += pGroup400.hashCode();
        str += ip65504SelElemEntriesAll.hashCode();
        str += ip66102IpmMsg.hashCode();
        str += parsingPatternValuesGroup500.hashCode();
       return str.hashCode();
    }

    public ExpandTheBitMapOutCtx clone() {
        ExpandTheBitMapOutCtx cloneObj = new ExpandTheBitMapOutCtx();
        cloneObj.pGroup400 = new PGroup400();
        cloneObj.pGroup400.set(pGroup400.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.parsingPatternValuesGroup500 = new ParsingPatternValuesGroup500();
        cloneObj.parsingPatternValuesGroup500.set(parsingPatternValuesGroup500.getClonedField());
        return cloneObj;
    }

    }

    public ExpandTheBitMapOutCtx getExpandTheBitMapOutCtx() {
            return new ExpandTheBitMapOutCtx();
    }
     public class CheckRecordLengthInCtx implements Cloneable {
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip662010Ctx.this.getIp66102IpmFileInformation();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();


public void setIp65504D(int ip65504D) { 
    Ip662010Ctx.this.ip65504D = ip65504D;
}

public int getIp65504D() { 
    return Ip662010Ctx.this.ip65504D;
}
	/**
	 *	Returns the value of ip65504DeStart
	 *	@return ip65504DeStart
	 */
	public short getIp65504DeStart(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeStart();
	}
	
	/**
	 * 	Update Ip65504DeStart with the passed value
	 *	@param number
	 */
	public void setIp65504DeStart(int index,short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart(number);
	}

	public void setIp65504DeStart(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart((short)number);
	}

	public void setIp65504DeStart(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart((short)number);
	}



	/**
	 *	Returns the value of parsedMsgLngth400
	 *	@return parsedMsgLngth400
	 */
	public int getParsedMsgLngth400() throws CFException {        
   		return work.getParsedMsgLngth400();
	}
	
	/**
	 * 	Update ParsedMsgLngth400 with the passed value
	 *	@param number
	 */
	public void setParsedMsgLngth400(int number)  throws CFException{
		work.setParsedMsgLngth400(number);
	}


	public void setParsedMsgLngth400(long number)  throws CFException{
		work.setParsedMsgLngth400((int)number);
	}


	/**
	 *	Returns the value of ip65504DeLngth
	 *	@return ip65504DeLngth
	 */
	public short getIp65504DeLngth(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeLngth();
	}
	
	/**
	 * 	Update Ip65504DeLngth with the passed value
	 *	@param number
	 */
	public void setIp65504DeLngth(int index,short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth(number);
	}

	public void setIp65504DeLngth(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
	}

	public void setIp65504DeLngth(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeLngth((short)number);
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




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public CheckRecordLengthOutCtx getCheckRecordLengthOutCtx() {
            return new CheckRecordLengthOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmFileInformation.hashCode();
        str += work.hashCode();
        str += ip65504DeMapGroup.hashCode();
       return str.hashCode();
    }

    public CheckRecordLengthInCtx clone() {
        CheckRecordLengthInCtx cloneObj = new CheckRecordLengthInCtx();
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        return cloneObj;
    }

    }

    public CheckRecordLengthInCtx getCheckRecordLengthInCtx() {
            return new CheckRecordLengthInCtx();
    }
     public class CheckRecordLengthOutCtx implements Cloneable {
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip662010Ctx.this.getIp66102IpmFileInformation();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();

	/**
	 *	Returns the value of parsedMsgLngth400
	 *	@return parsedMsgLngth400
	 */
	public int getParsedMsgLngth400() throws CFException {        
   		return work.getParsedMsgLngth400();
	}
	
	/**
	 * 	Update ParsedMsgLngth400 with the passed value
	 *	@param number
	 */
	public void setParsedMsgLngth400(int number)  throws CFException{
		work.setParsedMsgLngth400(number);
	}


	public void setParsedMsgLngth400(long number)  throws CFException{
		work.setParsedMsgLngth400((int)number);
	}



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmFileInformation.hashCode();
        str += work.hashCode();
        str += ip65504DeMapGroup.hashCode();
       return str.hashCode();
    }

    public CheckRecordLengthOutCtx clone() {
        CheckRecordLengthOutCtx cloneObj = new CheckRecordLengthOutCtx();
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        return cloneObj;
    }

    }

    public CheckRecordLengthOutCtx getCheckRecordLengthOutCtx() {
            return new CheckRecordLengthOutCtx();
    }
     public class HandleBadRecordLngthInCtx implements Cloneable {
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip662010Ctx.this.getIp66102IpmFileInformation();
     BadRecLngth600 badRecLngth600 = Ip662010Ctx.this.getBadRecLngth600();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();

	/**
	 *	Returns the value of badRecLngth600
	 *	@return badRecLngth600
	 */   
	 public BadRecLngth600 getBadRecLngth600() {
   	return badRecLngth600;
   }


	/**
	 *	Returns the value of parsedMsgLngth400
	 *	@return parsedMsgLngth400
	 */
	public int getParsedMsgLngth400() throws CFException {        
   		return work.getParsedMsgLngth400();
	}
	
	/**
	 * 	Update ParsedMsgLngth400 with the passed value
	 *	@param number
	 */
	public void setParsedMsgLngth400(int number)  throws CFException{
		work.setParsedMsgLngth400(number);
	}


	public void setParsedMsgLngth400(long number)  throws CFException{
		work.setParsedMsgLngth400((int)number);
	}


	/**
	 *	Returns the value of badRecLngthNdx600
	 *	@return badRecLngthNdx600
	 */
	public int getBadRecLngthNdx600() throws CFException {        
   		return work.getBadRecLngthNdx600();
	}
	
	/**
	 * 	Update BadRecLngthNdx600 with the passed value
	 *	@param number
	 */
	public void setBadRecLngthNdx600(int number)  throws CFException{
		work.setBadRecLngthNdx600(number);
	}


	public void setBadRecLngthNdx600(long number)  throws CFException{
		work.setBadRecLngthNdx600((int)number);
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
	 *	Returns the value of badRecLngthCode600
	 *	@return badRecLngthCode600
	 */
	public int getBadRecLngthCode600() throws CFException {        
   		return work.getBadRecLngthCode600();
	}
	
	/**
	 * 	Update BadRecLngthCode600 with the passed value
	 *	@param number
	 */
	public void setBadRecLngthCode600(int number)  throws CFException{
		work.setBadRecLngthCode600(number);
	}


	public void setBadRecLngthCode600(long number)  throws CFException{
		work.setBadRecLngthCode600((int)number);
	}



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public HandleBadRecordLngthOutCtx getHandleBadRecordLngthOutCtx() {
            return new HandleBadRecordLngthOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmFileInformation.hashCode();
        str += badRecLngth600.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ipmErrorMsg600.hashCode();
       return str.hashCode();
    }

    public HandleBadRecordLngthInCtx clone() {
        HandleBadRecordLngthInCtx cloneObj = new HandleBadRecordLngthInCtx();
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.badRecLngth600 = new BadRecLngth600();
        cloneObj.badRecLngth600.set(badRecLngth600.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        return cloneObj;
    }

    }

    public HandleBadRecordLngthInCtx getHandleBadRecordLngthInCtx() {
            return new HandleBadRecordLngthInCtx();
    }
     public class HandleBadRecordLngthOutCtx implements Cloneable {
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip662010Ctx.this.getIp66102IpmFileInformation();
     BadRecLngth600 badRecLngth600 = Ip662010Ctx.this.getBadRecLngth600();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();

	/**
	 *	Returns the value of ipmErrorPointerWidth600
	 *	@return ipmErrorPointerWidth600
	 */
	public short getIpmErrorPointerWidth600() throws CFException {        
   		return work.getIpmErrorPointerWidth600();
	}
	
	/**
	 * 	Update IpmErrorPointerWidth600 with the passed value
	 *	@param number
	 */
	public void setIpmErrorPointerWidth600(short number)  throws CFException{
		work.setIpmErrorPointerWidth600(number);
	}

	public void setIpmErrorPointerWidth600(int number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}

	public void setIpmErrorPointerWidth600(long number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}



	/**
	 *	Returns the value of rdwLngth600
	 *	@return rdwLngth600
	 */
   public char[] getRdwLngth600() throws CFException  {              
   		return badRecLngth600.getRdwLngth600();
   }

  
	/**
	*  set variable rdwLngth600
	*  @param value
	**/
   public void setRdwLngth600(char[] value) throws CFException {
      badRecLngth600.setRdwLngth600(value);
   } 

     /**
	 * 	Update RdwLngth600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRdwLngth600(char[] source, int sourceIndex) throws CFException {
      badRecLngth600.setRdwLngth600(source, sourceIndex);
   	
   }
   
   public void setRdwLngth600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      badRecLngth600.setRdwLngth600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RdwLngth600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRdwLngth600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      badRecLngth600.setRdwLngth600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RdwLngth600 with another Field
	 *	@param value
	 */
   public void setRdwLngth600(Field source) {
      badRecLngth600.setRdwLngth600(source);
   }  
   
     /**
	 * 	Update RdwLngth600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRdwLngth600(Field source, int sourceIndex,int sourceLen) {
      badRecLngth600.setRdwLngth600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RdwLngth600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRdwLngth600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      badRecLngth600.setRdwLngth600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of parsedMsgLngth400
	 *	@return parsedMsgLngth400
	 */
	public int getParsedMsgLngth400() throws CFException {        
   		return work.getParsedMsgLngth400();
	}
	
	/**
	 * 	Update ParsedMsgLngth400 with the passed value
	 *	@param number
	 */
	public void setParsedMsgLngth400(int number)  throws CFException{
		work.setParsedMsgLngth400(number);
	}


	public void setParsedMsgLngth400(long number)  throws CFException{
		work.setParsedMsgLngth400((int)number);
	}


	/**
	 *	Returns the value of ip662011ErrSubscript
	 *	@return ip662011ErrSubscript
	 */
	public int getIp662011ErrSubscript() throws CFException {        
   		return ip662011ErrSubscriptGroup.getIp662011ErrSubscript();
	}
	
	/**
	 * 	Update Ip662011ErrSubscript with the passed value
	 *	@param number
	 */
	public void setIp662011ErrSubscript(int number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript(number);
	}


	public void setIp662011ErrSubscript(long number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript((int)number);
	}


	/**
	 *	Returns the value of badRecLngthCode600
	 *	@return badRecLngthCode600
	 */
	public int getBadRecLngthCode600() throws CFException {        
   		return work.getBadRecLngthCode600();
	}
	
	/**
	 * 	Update BadRecLngthCode600 with the passed value
	 *	@param number
	 */
	public void setBadRecLngthCode600(int number)  throws CFException{
		work.setBadRecLngthCode600(number);
	}


	public void setBadRecLngthCode600(long number)  throws CFException{
		work.setBadRecLngthCode600((int)number);
	}


	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of parsedLngth600
	 *	@return parsedLngth600
	 */
   public char[] getParsedLngth600() throws CFException  {              
   		return badRecLngth600.getParsedLngth600();
   }

  
	/**
	*  set variable parsedLngth600
	*  @param value
	**/
   public void setParsedLngth600(char[] value) throws CFException {
      badRecLngth600.setParsedLngth600(value);
   } 

     /**
	 * 	Update ParsedLngth600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParsedLngth600(char[] source, int sourceIndex) throws CFException {
      badRecLngth600.setParsedLngth600(source, sourceIndex);
   	
   }
   
   public void setParsedLngth600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      badRecLngth600.setParsedLngth600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ParsedLngth600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParsedLngth600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      badRecLngth600.setParsedLngth600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ParsedLngth600 with another Field
	 *	@param value
	 */
   public void setParsedLngth600(Field source) {
      badRecLngth600.setParsedLngth600(source);
   }  
   
     /**
	 * 	Update ParsedLngth600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParsedLngth600(Field source, int sourceIndex,int sourceLen) {
      badRecLngth600.setParsedLngth600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ParsedLngth600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParsedLngth600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      badRecLngth600.setParsedLngth600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errorCode600
	 *	@return errorCode600
	 */
	public long getErrorCode600() throws CFException {
   		return ipmErrorMsg600.getErrorCode600();
	}


	/**
	 *	Returns String value of errorCode600
	 *	@return errorCode600
	 */
	public char[]  getErrorCode600String() throws CFException {
	     return String.valueOf(ipmErrorMsg600.getErrorCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorCode600IsNumeric()  throws CFException{
	    return ipmErrorMsg600.errorCode600IsNumeric();
	}

	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param number
	 */
	public void setErrorCode600(long number)  throws CFException{
		ipmErrorMsg600.setErrorCode600(number);
	}
	

	
	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorCode600(char[] value)  throws CFException {
		ipmErrorMsg600.setErrorCode600(value);
	}
	
	/**
	 * 	Update ErrorCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorCode600String(char[] value)  throws CFException{
		ipmErrorMsg600.setErrorCode600(value);
	}	

	/**
	 *	Returns the value of badRecLngth600
	 *	@return badRecLngth600
	 */   
	 public BadRecLngth600 getBadRecLngth600() {
   	return badRecLngth600;
   }


	/**
	 *	Returns the value of badRecLngthNdx600
	 *	@return badRecLngthNdx600
	 */
	public int getBadRecLngthNdx600() throws CFException {        
   		return work.getBadRecLngthNdx600();
	}
	
	/**
	 * 	Update BadRecLngthNdx600 with the passed value
	 *	@param number
	 */
	public void setBadRecLngthNdx600(int number)  throws CFException{
		work.setBadRecLngthNdx600(number);
	}


	public void setBadRecLngthNdx600(long number)  throws CFException{
		work.setBadRecLngthNdx600((int)number);
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
	 *	Returns the value of ipmErrorText600
	 *	@return ipmErrorText600
	 */
   public char[] getIpmErrorText600() throws CFException  {              
   		return ipmErrorMsg600.getIpmErrorText600();
   }

  
	/**
	*  set variable ipmErrorText600
	*  @param value
	**/
   public void setIpmErrorText600(char[] value) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(value);
   } 

     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex);
   	
   }
   
   public void setIpmErrorText600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorText600 with another Field
	 *	@param value
	 */
   public void setIpmErrorText600(Field source) {
      ipmErrorMsg600.setIpmErrorText600(source);
   }  
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504MessageStatus
	 *	@return ip65504MessageStatus
	 */
	public short getIp65504MessageStatus() throws CFException {        
   		return ip65504MessageStatusGroup.getIp65504MessageStatus();
	}
	
	/**
	 * 	Update Ip65504MessageStatus with the passed value
	 *	@param number
	 */
	public void setIp65504MessageStatus(short number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus(number);
	}

	public void setIp65504MessageStatus(int number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}

	public void setIp65504MessageStatus(long number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmFileInformation.hashCode();
        str += badRecLngth600.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ipmErrorMsg600.hashCode();
       return str.hashCode();
    }

    public HandleBadRecordLngthOutCtx clone() {
        HandleBadRecordLngthOutCtx cloneObj = new HandleBadRecordLngthOutCtx();
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.badRecLngth600 = new BadRecLngth600();
        cloneObj.badRecLngth600.set(badRecLngth600.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        return cloneObj;
    }

    }

    public HandleBadRecordLngthOutCtx getHandleBadRecordLngthOutCtx() {
            return new HandleBadRecordLngthOutCtx();
    }
     public class HandleBadLengthFieldInCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();
     Ip000604DeAttrTable ip000604DeAttrTable = Ip662010Ctx.this.getIp000604DeAttrTable();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip662010Ctx.this.getIp65504PdsMapGroup();

	/**
	 *	Returns the value of ipmErrorPointerWidth600
	 *	@return ipmErrorPointerWidth600
	 */
	public short getIpmErrorPointerWidth600() throws CFException {        
   		return work.getIpmErrorPointerWidth600();
	}
	
	/**
	 * 	Update IpmErrorPointerWidth600 with the passed value
	 *	@param number
	 */
	public void setIpmErrorPointerWidth600(short number)  throws CFException{
		work.setIpmErrorPointerWidth600(number);
	}

	public void setIpmErrorPointerWidth600(int number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}

	public void setIpmErrorPointerWidth600(long number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}



	/**
	 *	Returns the value of nonNumericLngthNdx600
	 *	@return nonNumericLngthNdx600
	 */
	public int getNonNumericLngthNdx600() throws CFException {        
   		return work.getNonNumericLngthNdx600();
	}
	
	/**
	 * 	Update NonNumericLngthNdx600 with the passed value
	 *	@param number
	 */
	public void setNonNumericLngthNdx600(int number)  throws CFException{
		work.setNonNumericLngthNdx600(number);
	}


	public void setNonNumericLngthNdx600(long number)  throws CFException{
		work.setNonNumericLngthNdx600((int)number);
	}



public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of nonNumericLngthCode600
	 *	@return nonNumericLngthCode600
	 */
	public int getNonNumericLngthCode600() throws CFException {        
   		return work.getNonNumericLngthCode600();
	}
	
	/**
	 * 	Update NonNumericLngthCode600 with the passed value
	 *	@param number
	 */
	public void setNonNumericLngthCode600(int number)  throws CFException{
		work.setNonNumericLngthCode600(number);
	}


	public void setNonNumericLngthCode600(long number)  throws CFException{
		work.setNonNumericLngthCode600((int)number);
	}


	/**
	 *	Returns the value of ip000604DeSubflds
	 *	@return ip000604DeSubflds
	 */
	public short getIp000604DeSubflds(int index) throws CFException {        
   		return ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeSubflds();
	}
	
	/**
	 * 	Update Ip000604DeSubflds with the passed value
	 *	@param number
	 */
	public void setIp000604DeSubflds(int index,short number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeSubflds(number);
	}

	public void setIp000604DeSubflds(int index,int number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeSubflds((short)number);
	}

	public void setIp000604DeSubflds(int index,long number)  throws CFException{
		ip000604DeAttrTable.getIp000604DeAttrRow(index).setIp000604DeSubflds((short)number);
	}



	/**
	 *	Returns the value of i400
	 *	@return i400
	 */
	public short getI400() throws CFException {        
   		return work.getI400();
	}
	
	/**
	 * 	Update I400 with the passed value
	 *	@param number
	 */
	public void setI400(short number)  throws CFException{
		work.setI400(number);
	}

	public void setI400(int number)  throws CFException{
		work.setI400((short)number);
	}

	public void setI400(long number)  throws CFException{
		work.setI400((short)number);
	}



	/**
	 *	Returns the value of nonNumericLngth600
	 *	@return nonNumericLngth600
	 */
   public char[] getNonNumericLngth600() throws CFException  {              
   		return work.getNonNumericLngth600();
   }

  
	/**
	*  set variable nonNumericLngth600
	*  @param value
	**/
   public void setNonNumericLngth600(char[] value) throws CFException {
      work.setNonNumericLngth600(value);
   } 

	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public HandleBadLengthFieldOutCtx getHandleBadLengthFieldOutCtx() {
            return new HandleBadLengthFieldOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip000604DeAttrTable.hashCode();
        str += ip65504PdsMapGroup.hashCode();
       return str.hashCode();
    }

    public HandleBadLengthFieldInCtx clone() {
        HandleBadLengthFieldInCtx cloneObj = new HandleBadLengthFieldInCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        return cloneObj;
    }

    }

    public HandleBadLengthFieldInCtx getHandleBadLengthFieldInCtx() {
            return new HandleBadLengthFieldInCtx();
    }
     public class HandleBadLengthFieldOutCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup = Ip662010Ctx.this.getIp662011ErrSubscriptGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504MessageStatusGroup ip65504MessageStatusGroup = Ip662010Ctx.this.getIp65504MessageStatusGroup();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip662010Ctx.this.getIp65504DeMapGroup();
     Ip000604DeAttrTable ip000604DeAttrTable = Ip662010Ctx.this.getIp000604DeAttrTable();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip662010Ctx.this.getIp65504PdsMapGroup();

	/**
	 *	Returns the value of ip65504TagNo
	 *	@return ip65504TagNo
	 */
	public short getIp65504TagNo(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagNo();
	}
	
	/**
	 * 	Update Ip65504TagNo with the passed value
	 *	@param number
	 */
	public void setIp65504TagNo(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo(number);
	}

	public void setIp65504TagNo(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}

	public void setIp65504TagNo(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of ip65504DeStart
	 *	@return ip65504DeStart
	 */
	public short getIp65504DeStart(int index) throws CFException {        
   		return ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).getIp65504DeStart();
	}
	
	/**
	 * 	Update Ip65504DeStart with the passed value
	 *	@param number
	 */
	public void setIp65504DeStart(int index,short number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart(number);
	}

	public void setIp65504DeStart(int index,int number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart((short)number);
	}

	public void setIp65504DeStart(int index,long number)  throws CFException{
		ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(index).setIp65504DeStart((short)number);
	}



	/**
	 *	Returns the value of ip65504PdsStart
	 *	@return ip65504PdsStart
	 */
	public short getIp65504PdsStart(int index) throws CFException {        
   		return ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).getIp65504PdsStart();
	}
	
	/**
	 * 	Update Ip65504PdsStart with the passed value
	 *	@param number
	 */
	public void setIp65504PdsStart(int index,short number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsStart(number);
	}

	public void setIp65504PdsStart(int index,int number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsStart((short)number);
	}

	public void setIp65504PdsStart(int index,long number)  throws CFException{
		ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(index).setIp65504PdsStart((short)number);
	}



	/**
	 *	Returns the value of ip662011ErrSubscript
	 *	@return ip662011ErrSubscript
	 */
	public int getIp662011ErrSubscript() throws CFException {        
   		return ip662011ErrSubscriptGroup.getIp662011ErrSubscript();
	}
	
	/**
	 * 	Update Ip662011ErrSubscript with the passed value
	 *	@param number
	 */
	public void setIp662011ErrSubscript(int number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript(number);
	}


	public void setIp662011ErrSubscript(long number)  throws CFException{
		ip662011ErrSubscriptGroup.setIp662011ErrSubscript((int)number);
	}


	/**
	 *	Returns the value of ipmErrorElementNo600
	 *	@return ipmErrorElementNo600
	 */
	public int getIpmErrorElementNo600() throws CFException {
   		return ipmErrorMsg600.getIpmErrorElementId600().getIpmErrorElementNo600();
	}


	/**
	 *	Returns String value of ipmErrorElementNo600
	 *	@return ipmErrorElementNo600
	 */
	public char[]  getIpmErrorElementNo600String() throws CFException {
	     return String.valueOf(ipmErrorMsg600.getIpmErrorElementId600().getIpmErrorElementNo600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ipmErrorElementNo600IsNumeric()  throws CFException{
	    return ipmErrorMsg600.getIpmErrorElementId600().ipmErrorElementNo600IsNumeric();
	}

	/**
	 * 	Update IpmErrorElementNo600 with the passed value
	 *	@param number
	 */
	public void setIpmErrorElementNo600(int number)  throws CFException{
		ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementNo600(number);
	}
	

	public void setIpmErrorElementNo600(long number)  throws CFException{
	    ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementNo600(number);
	}
	
	
	/**
	 * 	Update IpmErrorElementNo600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIpmErrorElementNo600(char[] value)  throws CFException {
		ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementNo600(value);
	}
	
	/**
	 * 	Update IpmErrorElementNo600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIpmErrorElementNo600String(char[] value)  throws CFException{
		ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementNo600(value);
	}	

	/**
	 *	Returns the value of ipmErrorElementType600
	 *	@return ipmErrorElementType600
	 */
   public char[] getIpmErrorElementType600() throws CFException  {              
   		return ipmErrorMsg600.getIpmErrorElementId600().getIpmErrorElementType600();
   }

  
	/**
	*  set variable ipmErrorElementType600
	*  @param value
	**/
   public void setIpmErrorElementType600(char[] value) throws CFException {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(value);
   } 

     /**
	 * 	Update IpmErrorElementType600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorElementType600(char[] source, int sourceIndex) throws CFException {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(source, sourceIndex);
   	
   }
   
   public void setIpmErrorElementType600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorElementType600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementType600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorElementType600 with another Field
	 *	@param value
	 */
   public void setIpmErrorElementType600(Field source) {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(source);
   }  
   
     /**
	 * 	Update IpmErrorElementType600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorElementType600(Field source, int sourceIndex,int sourceLen) {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IpmErrorElementType600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementType600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.getIpmErrorElementId600().setIpmErrorElementType600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errorCode600
	 *	@return errorCode600
	 */
	public long getErrorCode600() throws CFException {
   		return ipmErrorMsg600.getErrorCode600();
	}


	/**
	 *	Returns String value of errorCode600
	 *	@return errorCode600
	 */
	public char[]  getErrorCode600String() throws CFException {
	     return String.valueOf(ipmErrorMsg600.getErrorCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorCode600IsNumeric()  throws CFException{
	    return ipmErrorMsg600.errorCode600IsNumeric();
	}

	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param number
	 */
	public void setErrorCode600(long number)  throws CFException{
		ipmErrorMsg600.setErrorCode600(number);
	}
	

	
	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorCode600(char[] value)  throws CFException {
		ipmErrorMsg600.setErrorCode600(value);
	}
	
	/**
	 * 	Update ErrorCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorCode600String(char[] value)  throws CFException{
		ipmErrorMsg600.setErrorCode600(value);
	}	

	/**
	 *	Returns the value of ip65504TagStarts
	 *	@return ip65504TagStarts
	 */
	public short getIp65504TagStarts(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagStarts();
	}
	
	/**
	 * 	Update Ip65504TagStarts with the passed value
	 *	@param number
	 */
	public void setIp65504TagStarts(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts(number);
	}

	public void setIp65504TagStarts(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}

	public void setIp65504TagStarts(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}



	/**
	 *	Returns the value of nonNumericLngthNdx600
	 *	@return nonNumericLngthNdx600
	 */
	public int getNonNumericLngthNdx600() throws CFException {        
   		return work.getNonNumericLngthNdx600();
	}
	
	/**
	 * 	Update NonNumericLngthNdx600 with the passed value
	 *	@param number
	 */
	public void setNonNumericLngthNdx600(int number)  throws CFException{
		work.setNonNumericLngthNdx600(number);
	}


	public void setNonNumericLngthNdx600(long number)  throws CFException{
		work.setNonNumericLngthNdx600((int)number);
	}


	/**
	 *	Returns the value of nonNumericLngthCode600
	 *	@return nonNumericLngthCode600
	 */
	public int getNonNumericLngthCode600() throws CFException {        
   		return work.getNonNumericLngthCode600();
	}
	
	/**
	 * 	Update NonNumericLngthCode600 with the passed value
	 *	@param number
	 */
	public void setNonNumericLngthCode600(int number)  throws CFException{
		work.setNonNumericLngthCode600(number);
	}


	public void setNonNumericLngthCode600(long number)  throws CFException{
		work.setNonNumericLngthCode600((int)number);
	}


	/**
	 *	Test condition 2 for isIp6550488DeTag()
	 *	@return  Returns true if isIp6550488DeTag() is 2
	 */
   public boolean isIp6550488DeTag(int index) throws CFException {
      return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().isIp6550488DeTag();
   }

	/**
	*  set values 2
	*/
   	public void setIp6550488DeTagTrue(int index)  throws CFException{  			
    	ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp6550488DeTagTrue();
   	}
	/**
	 *	Returns the value of i400
	 *	@return i400
	 */
	public short getI400() throws CFException {        
   		return work.getI400();
	}
	
	/**
	 * 	Update I400 with the passed value
	 *	@param number
	 */
	public void setI400(short number)  throws CFException{
		work.setI400(number);
	}

	public void setI400(int number)  throws CFException{
		work.setI400((short)number);
	}

	public void setI400(long number)  throws CFException{
		work.setI400((short)number);
	}



	/**
	 *	Returns the value of ip65504TagType
	 *	@return ip65504TagType
	 */
	public short getIp65504TagType(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagType();
	}
	
	/**
	 * 	Update Ip65504TagType with the passed value
	 *	@param number
	 */
	public void setIp65504TagType(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType(number);
	}

	public void setIp65504TagType(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}

	public void setIp65504TagType(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}



	/**
	 *	Returns the value of nonNumericLngth600
	 *	@return nonNumericLngth600
	 */
   public char[] getNonNumericLngth600() throws CFException  {              
   		return work.getNonNumericLngth600();
   }

  
	/**
	*  set variable nonNumericLngth600
	*  @param value
	**/
   public void setNonNumericLngth600(char[] value) throws CFException {
      work.setNonNumericLngth600(value);
   } 

	/**
	 *	Returns the value of ipmErrorText600
	 *	@return ipmErrorText600
	 */
   public char[] getIpmErrorText600() throws CFException  {              
   		return ipmErrorMsg600.getIpmErrorText600();
   }

  
	/**
	*  set variable ipmErrorText600
	*  @param value
	**/
   public void setIpmErrorText600(char[] value) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(value);
   } 

     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex) throws CFException {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex);
   	
   }
   
   public void setIpmErrorText600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorText600 with another Field
	 *	@param value
	 */
   public void setIpmErrorText600(Field source) {
      ipmErrorMsg600.setIpmErrorText600(source);
   }  
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorText600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition 3 for isIp6550488PdsTag()
	 *	@return  Returns true if isIp6550488PdsTag() is 3
	 */
   public boolean isIp6550488PdsTag(int index) throws CFException {
      return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().isIp6550488PdsTag();
   }

	/**
	*  set values 3
	*/
   	public void setIp6550488PdsTagTrue(int index)  throws CFException{  			
    	ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp6550488PdsTagTrue();
   	}
	/**
	 *	Returns the value of ip65504MessageStatus
	 *	@return ip65504MessageStatus
	 */
	public short getIp65504MessageStatus() throws CFException {        
   		return ip65504MessageStatusGroup.getIp65504MessageStatus();
	}
	
	/**
	 * 	Update Ip65504MessageStatus with the passed value
	 *	@param number
	 */
	public void setIp65504MessageStatus(short number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus(number);
	}

	public void setIp65504MessageStatus(int number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}

	public void setIp65504MessageStatus(long number)  throws CFException{
		ip65504MessageStatusGroup.setIp65504MessageStatus((short)number);
	}




public void setIp000604I(int ip000604I) { 
    Ip662010Ctx.this.ip000604I = ip000604I;
}

public int getIp000604I() { 
    return Ip662010Ctx.this.ip000604I;
}

        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip662011ErrSubscriptGroup.hashCode();
        str += work.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip000604DeAttrTable.hashCode();
        str += ip65504PdsMapGroup.hashCode();
       return str.hashCode();
    }

    public HandleBadLengthFieldOutCtx clone() {
        HandleBadLengthFieldOutCtx cloneObj = new HandleBadLengthFieldOutCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip662011ErrSubscriptGroup = new Ip662011ErrSubscriptGroup();
        cloneObj.ip662011ErrSubscriptGroup.set(ip662011ErrSubscriptGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        return cloneObj;
    }

    }

    public HandleBadLengthFieldOutCtx getHandleBadLengthFieldOutCtx() {
            return new HandleBadLengthFieldOutCtx();
    }
     public class ProcessBadMessageInCtx implements Cloneable {
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip662010Ctx.this.getIp66102IpmFileInformation();
     Work work = Ip662010Ctx.this.getWork();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();

	/**
	 *	Returns the value of badMessageCount400
	 *	@return badMessageCount400
	 */
	public short getBadMessageCount400() throws CFException {        
   		return work.getBadMessageCount400();
	}
	
	/**
	 * 	Update BadMessageCount400 with the passed value
	 *	@param number
	 */
	public void setBadMessageCount400(short number)  throws CFException{
		work.setBadMessageCount400(number);
	}

	public void setBadMessageCount400(int number)  throws CFException{
		work.setBadMessageCount400((short)number);
	}

	public void setBadMessageCount400(long number)  throws CFException{
		work.setBadMessageCount400((short)number);
	}



	/**
	 *	Returns the value of errorMessageHeader600
	 *	@return errorMessageHeader600
	 */
   public char[] getErrorMessageHeader600() throws CFException  {              
   		return work.getErrorMessageHeader600();
   }

  
	/**
	*  set variable errorMessageHeader600
	*  @param value
	**/
   public void setErrorMessageHeader600(char[] value) throws CFException {
      work.setErrorMessageHeader600(value);
   } 

	/**
	 *	Returns the value of ip66102IpmMsgsRead
	 *	@return ip66102IpmMsgsRead
	 */
	public int getIp66102IpmMsgsRead() throws CFException {        
   		return ip66102IpmFileInformation.getIp66102IpmMsgsRead();
	}
	
	/**
	 * 	Update Ip66102IpmMsgsRead with the passed value
	 *	@param number
	 */
	public void setIp66102IpmMsgsRead(int number)  throws CFException{
		ip66102IpmFileInformation.setIp66102IpmMsgsRead(number);
	}


	public void setIp66102IpmMsgsRead(long number)  throws CFException{
		ip66102IpmFileInformation.setIp66102IpmMsgsRead((int)number);
	}


	/**
	 *	Returns the value of maxBadIpmMsgs300
	 *	@return maxBadIpmMsgs300
	 */
	public short getMaxBadIpmMsgs300() throws CFException {
   		return work.getMaxBadIpmMsgs300();
	}

    /**
	 *	Returns the String value of maxBadIpmMsgs300
	 *	@return maxBadIpmMsgs300
	 */
	public char[]  getMaxBadIpmMsgs300ActualString() {
		return work.getMaxBadIpmMsgs300ActualString();
	}

	/**
	 *	Returns String value of maxBadIpmMsgs300
	 *	@return maxBadIpmMsgs300
	 */
	public char[]  getMaxBadIpmMsgs300String() throws CFException {
	     return String.valueOf(work.getMaxBadIpmMsgs300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maxBadIpmMsgs300IsNumeric()  throws CFException{
	    return work.maxBadIpmMsgs300IsNumeric();
	}

	/**
	 * 	Update MaxBadIpmMsgs300 with the passed value
	 *	@param number
	 */
	public void setMaxBadIpmMsgs300(short number)  throws CFException{
		work.setMaxBadIpmMsgs300(number);
	}
	
	public void setMaxBadIpmMsgs300(int number)  throws CFException{
	    work.setMaxBadIpmMsgs300(number);
	}
	public void setMaxBadIpmMsgs300(long number)  throws CFException{
	    work.setMaxBadIpmMsgs300(number);
	}
	

	
	/**
	 * 	Update MaxBadIpmMsgs300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaxBadIpmMsgs300(char[] value)  throws CFException {
		work.setMaxBadIpmMsgs300(value);
	}
	
	/**
	 * 	Update MaxBadIpmMsgs300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaxBadIpmMsgs300String(char[] value)  throws CFException{
		work.setMaxBadIpmMsgs300(value);
	}	


        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public ProcessBadMessageOutCtx getProcessBadMessageOutCtx() {
            return new ProcessBadMessageOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmFileInformation.hashCode();
        str += work.hashCode();
        str += ipmErrorMsg600.hashCode();
       return str.hashCode();
    }

    public ProcessBadMessageInCtx clone() {
        ProcessBadMessageInCtx cloneObj = new ProcessBadMessageInCtx();
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        return cloneObj;
    }

    }

    public ProcessBadMessageInCtx getProcessBadMessageInCtx() {
            return new ProcessBadMessageInCtx();
    }
     public class ProcessBadMessageOutCtx implements Cloneable {
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip662010Ctx.this.getIp66102IpmFileInformation();
     Work work = Ip662010Ctx.this.getWork();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();

	/**
	 *	Returns the value of badMessageCount400
	 *	@return badMessageCount400
	 */
	public short getBadMessageCount400() throws CFException {        
   		return work.getBadMessageCount400();
	}
	
	/**
	 * 	Update BadMessageCount400 with the passed value
	 *	@param number
	 */
	public void setBadMessageCount400(short number)  throws CFException{
		work.setBadMessageCount400(number);
	}

	public void setBadMessageCount400(int number)  throws CFException{
		work.setBadMessageCount400((short)number);
	}

	public void setBadMessageCount400(long number)  throws CFException{
		work.setBadMessageCount400((short)number);
	}



	/**
	 *	Returns the value of displayNumber600
	 *	@return displayNumber600
	 */
   public char[] getDisplayNumber600() throws CFException  {              
   		return work.getDisplayNumber600();
   }

  
	/**
	*  set variable displayNumber600
	*  @param value
	**/
   public void setDisplayNumber600(char[] value) throws CFException {
      work.setDisplayNumber600(value);
   } 

     /**
	 * 	Update DisplayNumber600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDisplayNumber600(char[] source, int sourceIndex) throws CFException {
      work.setDisplayNumber600(source, sourceIndex);
   	
   }
   
   public void setDisplayNumber600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setDisplayNumber600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DisplayNumber600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNumber600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDisplayNumber600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DisplayNumber600 with another Field
	 *	@param value
	 */
   public void setDisplayNumber600(Field source) {
      work.setDisplayNumber600(source);
   }  
   
     /**
	 * 	Update DisplayNumber600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDisplayNumber600(Field source, int sourceIndex,int sourceLen) {
      work.setDisplayNumber600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DisplayNumber600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNumber600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDisplayNumber600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102IpmMsgsRead
	 *	@return ip66102IpmMsgsRead
	 */
	public int getIp66102IpmMsgsRead() throws CFException {        
   		return ip66102IpmFileInformation.getIp66102IpmMsgsRead();
	}
	
	/**
	 * 	Update Ip66102IpmMsgsRead with the passed value
	 *	@param number
	 */
	public void setIp66102IpmMsgsRead(int number)  throws CFException{
		ip66102IpmFileInformation.setIp66102IpmMsgsRead(number);
	}


	public void setIp66102IpmMsgsRead(long number)  throws CFException{
		ip66102IpmFileInformation.setIp66102IpmMsgsRead((int)number);
	}


	/**
	 *	Returns the value of ipmErrorRecordNo600
	 *	@return ipmErrorRecordNo600
	 */
   public char[] getIpmErrorRecordNo600() throws CFException  {              
   		return ipmErrorMsg600.getIpmErrorRecordNo600();
   }

  
	/**
	*  set variable ipmErrorRecordNo600
	*  @param value
	**/
   public void setIpmErrorRecordNo600(char[] value) throws CFException {
      ipmErrorMsg600.setIpmErrorRecordNo600(value);
   } 

     /**
	 * 	Update IpmErrorRecordNo600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorRecordNo600(char[] source, int sourceIndex) throws CFException {
      ipmErrorMsg600.setIpmErrorRecordNo600(source, sourceIndex);
   	
   }
   
   public void setIpmErrorRecordNo600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ipmErrorMsg600.setIpmErrorRecordNo600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorRecordNo600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorRecordNo600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorRecordNo600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorRecordNo600 with another Field
	 *	@param value
	 */
   public void setIpmErrorRecordNo600(Field source) {
      ipmErrorMsg600.setIpmErrorRecordNo600(source);
   }  
   
     /**
	 * 	Update IpmErrorRecordNo600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorRecordNo600(Field source, int sourceIndex,int sourceLen) {
      ipmErrorMsg600.setIpmErrorRecordNo600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IpmErrorRecordNo600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorRecordNo600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ipmErrorMsg600.setIpmErrorRecordNo600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of maxBadIpmMsgs300
	 *	@return maxBadIpmMsgs300
	 */
	public short getMaxBadIpmMsgs300() throws CFException {
   		return work.getMaxBadIpmMsgs300();
	}

    /**
	 *	Returns the String value of maxBadIpmMsgs300
	 *	@return maxBadIpmMsgs300
	 */
	public char[]  getMaxBadIpmMsgs300ActualString() {
		return work.getMaxBadIpmMsgs300ActualString();
	}

	/**
	 *	Returns String value of maxBadIpmMsgs300
	 *	@return maxBadIpmMsgs300
	 */
	public char[]  getMaxBadIpmMsgs300String() throws CFException {
	     return String.valueOf(work.getMaxBadIpmMsgs300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maxBadIpmMsgs300IsNumeric()  throws CFException{
	    return work.maxBadIpmMsgs300IsNumeric();
	}

	/**
	 * 	Update MaxBadIpmMsgs300 with the passed value
	 *	@param number
	 */
	public void setMaxBadIpmMsgs300(short number)  throws CFException{
		work.setMaxBadIpmMsgs300(number);
	}
	
	public void setMaxBadIpmMsgs300(int number)  throws CFException{
	    work.setMaxBadIpmMsgs300(number);
	}
	public void setMaxBadIpmMsgs300(long number)  throws CFException{
	    work.setMaxBadIpmMsgs300(number);
	}
	

	
	/**
	 * 	Update MaxBadIpmMsgs300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaxBadIpmMsgs300(char[] value)  throws CFException {
		work.setMaxBadIpmMsgs300(value);
	}
	
	/**
	 * 	Update MaxBadIpmMsgs300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaxBadIpmMsgs300String(char[] value)  throws CFException{
		work.setMaxBadIpmMsgs300(value);
	}	


        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmFileInformation.hashCode();
        str += work.hashCode();
        str += ipmErrorMsg600.hashCode();
       return str.hashCode();
    }

    public ProcessBadMessageOutCtx clone() {
        ProcessBadMessageOutCtx cloneObj = new ProcessBadMessageOutCtx();
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        return cloneObj;
    }

    }

    public ProcessBadMessageOutCtx getProcessBadMessageOutCtx() {
            return new ProcessBadMessageOutCtx();
    }
     public class DisplayBadIpmMessageInCtx implements Cloneable {
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip662010Ctx.this.getIp66102IpmFileInformation();
     CharMapColumns600 charMapColumns600 = Ip662010Ctx.this.getCharMapColumns600();
     MessageLengthMsg600 messageLengthMsg600 = Ip662010Ctx.this.getMessageLengthMsg600();
     Work work = Ip662010Ctx.this.getWork();
     Ip65504SelElemEntriesAll ip65504SelElemEntriesAll = Ip662010Ctx.this.getIp65504SelElemEntriesAll();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of ipmErrorPointerWidth600
	 *	@return ipmErrorPointerWidth600
	 */
	public short getIpmErrorPointerWidth600() throws CFException {        
   		return work.getIpmErrorPointerWidth600();
	}
	
	/**
	 * 	Update IpmErrorPointerWidth600 with the passed value
	 *	@param number
	 */
	public void setIpmErrorPointerWidth600(short number)  throws CFException{
		work.setIpmErrorPointerWidth600(number);
	}

	public void setIpmErrorPointerWidth600(int number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}

	public void setIpmErrorPointerWidth600(long number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}



	/**
	 *	Returns the value of errStart400
	 *	@return errStart400
	 */
	public short getErrStart400() throws CFException {        
   		return work.getErrStart400();
	}
	
	/**
	 * 	Update ErrStart400 with the passed value
	 *	@param number
	 */
	public void setErrStart400(short number)  throws CFException{
		work.setErrStart400(number);
	}

	public void setErrStart400(int number)  throws CFException{
		work.setErrStart400((short)number);
	}

	public void setErrStart400(long number)  throws CFException{
		work.setErrStart400((short)number);
	}



	/**
	 *	Returns the value of errLngth400
	 *	@return errLngth400
	 */
	public short getErrLngth400() throws CFException {        
   		return work.getErrLngth400();
	}
	
	/**
	 * 	Update ErrLngth400 with the passed value
	 *	@param number
	 */
	public void setErrLngth400(short number)  throws CFException{
		work.setErrLngth400(number);
	}

	public void setErrLngth400(int number)  throws CFException{
		work.setErrLngth400((short)number);
	}

	public void setErrLngth400(long number)  throws CFException{
		work.setErrLngth400((short)number);
	}



	/**
	 *	Returns the value of charMapColumns600
	 *	@return charMapColumns600
	 */   
	 public CharMapColumns600 getCharMapColumns600() {
   	return charMapColumns600;
   }


	/**
	 *	Returns the value of messageLengthMsg600
	 *	@return messageLengthMsg600
	 */   
	 public MessageLengthMsg600 getMessageLengthMsg600() {
   	return messageLengthMsg600;
   }


	/**
	 *	Returns the value of ip65504SelElemEntriesAll
	 *	@return ip65504SelElemEntriesAll
	 */   
	 public Ip65504SelElemEntriesAll getIp65504SelElemEntriesAll() {
   	return ip65504SelElemEntriesAll;
   }


	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of ipmErrorColumns600
	 *	@return ipmErrorColumns600
	 */
   public char[] getIpmErrorColumns600() throws CFException  {              
   		return charMapColumns600.getIpmErrorColumns600();
   }

  
	/**
	*  set variable ipmErrorColumns600
	*  @param value
	**/
   public void setIpmErrorColumns600(char[] value) throws CFException {
      charMapColumns600.setIpmErrorColumns600(value);
   } 

     /**
	 * 	Update IpmErrorColumns600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorColumns600(char[] source, int sourceIndex) throws CFException {
      charMapColumns600.setIpmErrorColumns600(source, sourceIndex);
   	
   }
   
   public void setIpmErrorColumns600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      charMapColumns600.setIpmErrorColumns600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IpmErrorColumns600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorColumns600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      charMapColumns600.setIpmErrorColumns600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IpmErrorColumns600 with another Field
	 *	@param value
	 */
   public void setIpmErrorColumns600(Field source) {
      charMapColumns600.setIpmErrorColumns600(source);
   }  
   
     /**
	 * 	Update IpmErrorColumns600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorColumns600(Field source, int sourceIndex,int sourceLen) {
      charMapColumns600.setIpmErrorColumns600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IpmErrorColumns600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorColumns600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      charMapColumns600.setIpmErrorColumns600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errorCode600
	 *	@return errorCode600
	 */
	public long getErrorCode600() throws CFException {
   		return ipmErrorMsg600.getErrorCode600();
	}


	/**
	 *	Returns String value of errorCode600
	 *	@return errorCode600
	 */
	public char[]  getErrorCode600String() throws CFException {
	     return String.valueOf(ipmErrorMsg600.getErrorCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorCode600IsNumeric()  throws CFException{
	    return ipmErrorMsg600.errorCode600IsNumeric();
	}

	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param number
	 */
	public void setErrorCode600(long number)  throws CFException{
		ipmErrorMsg600.setErrorCode600(number);
	}
	

	
	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorCode600(char[] value)  throws CFException {
		ipmErrorMsg600.setErrorCode600(value);
	}
	
	/**
	 * 	Update ErrorCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorCode600String(char[] value)  throws CFException{
		ipmErrorMsg600.setErrorCode600(value);
	}	

	/**
	 *	Returns the value of ipmErrorMsg600
	 *	@return ipmErrorMsg600
	 */   
	 public IpmErrorMsg600 getIpmErrorMsg600() {
   	return ipmErrorMsg600;
   }


	/**
	 *	Returns the value of l400
	 *	@return l400
	 */
	public short getL400() throws CFException {        
   		return work.getL400();
	}
	
	/**
	 * 	Update L400 with the passed value
	 *	@param number
	 */
	public void setL400(short number)  throws CFException{
		work.setL400(number);
	}

	public void setL400(int number)  throws CFException{
		work.setL400((short)number);
	}

	public void setL400(long number)  throws CFException{
		work.setL400((short)number);
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
	 *	Returns the value of errEnd400
	 *	@return errEnd400
	 */
	public short getErrEnd400() throws CFException {        
   		return work.getErrEnd400();
	}
	
	/**
	 * 	Update ErrEnd400 with the passed value
	 *	@param number
	 */
	public void setErrEnd400(short number)  throws CFException{
		work.setErrEnd400(number);
	}

	public void setErrEnd400(int number)  throws CFException{
		work.setErrEnd400((short)number);
	}

	public void setErrEnd400(long number)  throws CFException{
		work.setErrEnd400((short)number);
	}



	/**
	 *	Returns the value of k400
	 *	@return k400
	 */
	public short getK400() throws CFException {        
   		return work.getK400();
	}
	
	/**
	 * 	Update K400 with the passed value
	 *	@param number
	 */
	public void setK400(short number)  throws CFException{
		work.setK400(number);
	}

	public void setK400(int number)  throws CFException{
		work.setK400((short)number);
	}

	public void setK400(long number)  throws CFException{
		work.setK400((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public DisplayBadIpmMessageOutCtx getDisplayBadIpmMessageOutCtx() {
            return new DisplayBadIpmMessageOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmFileInformation.hashCode();
        str += charMapColumns600.hashCode();
        str += messageLengthMsg600.hashCode();
        str += work.hashCode();
        str += ip65504SelElemEntriesAll.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public DisplayBadIpmMessageInCtx clone() {
        DisplayBadIpmMessageInCtx cloneObj = new DisplayBadIpmMessageInCtx();
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.charMapColumns600 = new CharMapColumns600();
        cloneObj.charMapColumns600.set(charMapColumns600.getClonedField());
        cloneObj.messageLengthMsg600 = new MessageLengthMsg600();
        cloneObj.messageLengthMsg600.set(messageLengthMsg600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public DisplayBadIpmMessageInCtx getDisplayBadIpmMessageInCtx() {
            return new DisplayBadIpmMessageInCtx();
    }
     public class DisplayBadIpmMessageOutCtx implements Cloneable {
     Ip66102IpmFileInformation ip66102IpmFileInformation = Ip662010Ctx.this.getIp66102IpmFileInformation();
     CharMapColumns600 charMapColumns600 = Ip662010Ctx.this.getCharMapColumns600();
     Work work = Ip662010Ctx.this.getWork();
     MessageLengthMsg600 messageLengthMsg600 = Ip662010Ctx.this.getMessageLengthMsg600();
     Ip65504SelElemEntriesAll ip65504SelElemEntriesAll = Ip662010Ctx.this.getIp65504SelElemEntriesAll();
     IpmErrorMsg600 ipmErrorMsg600 = Ip662010Ctx.this.getIpmErrorMsg600();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of ipmErrorPointerWidth600
	 *	@return ipmErrorPointerWidth600
	 */
	public short getIpmErrorPointerWidth600() throws CFException {        
   		return work.getIpmErrorPointerWidth600();
	}
	
	/**
	 * 	Update IpmErrorPointerWidth600 with the passed value
	 *	@param number
	 */
	public void setIpmErrorPointerWidth600(short number)  throws CFException{
		work.setIpmErrorPointerWidth600(number);
	}

	public void setIpmErrorPointerWidth600(int number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}

	public void setIpmErrorPointerWidth600(long number)  throws CFException{
		work.setIpmErrorPointerWidth600((short)number);
	}



	/**
	 *	Returns the value of messageLength600
	 *	@return messageLength600
	 */
   public char[] getMessageLength600() throws CFException  {              
   		return messageLengthMsg600.getMessageLength600();
   }

  
	/**
	*  set variable messageLength600
	*  @param value
	**/
   public void setMessageLength600(char[] value) throws CFException {
      messageLengthMsg600.setMessageLength600(value);
   } 

     /**
	 * 	Update MessageLength600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMessageLength600(char[] source, int sourceIndex) throws CFException {
      messageLengthMsg600.setMessageLength600(source, sourceIndex);
   	
   }
   
   public void setMessageLength600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      messageLengthMsg600.setMessageLength600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MessageLength600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMessageLength600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      messageLengthMsg600.setMessageLength600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MessageLength600 with another Field
	 *	@param value
	 */
   public void setMessageLength600(Field source) {
      messageLengthMsg600.setMessageLength600(source);
   }  
   
     /**
	 * 	Update MessageLength600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMessageLength600(Field source, int sourceIndex,int sourceLen) {
      messageLengthMsg600.setMessageLength600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MessageLength600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMessageLength600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      messageLengthMsg600.setMessageLength600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errStart400
	 *	@return errStart400
	 */
	public short getErrStart400() throws CFException {        
   		return work.getErrStart400();
	}
	
	/**
	 * 	Update ErrStart400 with the passed value
	 *	@param number
	 */
	public void setErrStart400(short number)  throws CFException{
		work.setErrStart400(number);
	}

	public void setErrStart400(int number)  throws CFException{
		work.setErrStart400((short)number);
	}

	public void setErrStart400(long number)  throws CFException{
		work.setErrStart400((short)number);
	}



	/**
	 *	Returns the value of errLngth400
	 *	@return errLngth400
	 */
	public short getErrLngth400() throws CFException {        
   		return work.getErrLngth400();
	}
	
	/**
	 * 	Update ErrLngth400 with the passed value
	 *	@param number
	 */
	public void setErrLngth400(short number)  throws CFException{
		work.setErrLngth400(number);
	}

	public void setErrLngth400(int number)  throws CFException{
		work.setErrLngth400((short)number);
	}

	public void setErrLngth400(long number)  throws CFException{
		work.setErrLngth400((short)number);
	}



	/**
	 *	Returns the value of messageLengthErrCode600
	 *	@return messageLengthErrCode600
	 */
   public char[] getMessageLengthErrCode600() throws CFException  {              
   		return messageLengthMsg600.getMessageLengthErrCode600();
   }

  
	/**
	*  set variable messageLengthErrCode600
	*  @param value
	**/
   public void setMessageLengthErrCode600(char[] value) throws CFException {
      messageLengthMsg600.setMessageLengthErrCode600(value);
   } 

     /**
	 * 	Update MessageLengthErrCode600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMessageLengthErrCode600(char[] source, int sourceIndex) throws CFException {
      messageLengthMsg600.setMessageLengthErrCode600(source, sourceIndex);
   	
   }
   
   public void setMessageLengthErrCode600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      messageLengthMsg600.setMessageLengthErrCode600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MessageLengthErrCode600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMessageLengthErrCode600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      messageLengthMsg600.setMessageLengthErrCode600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MessageLengthErrCode600 with another Field
	 *	@param value
	 */
   public void setMessageLengthErrCode600(Field source) {
      messageLengthMsg600.setMessageLengthErrCode600(source);
   }  
   
     /**
	 * 	Update MessageLengthErrCode600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMessageLengthErrCode600(Field source, int sourceIndex,int sourceLen) {
      messageLengthMsg600.setMessageLengthErrCode600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MessageLengthErrCode600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMessageLengthErrCode600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      messageLengthMsg600.setMessageLengthErrCode600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of l400
	 *	@return l400
	 */
	public short getL400() throws CFException {        
   		return work.getL400();
	}
	
	/**
	 * 	Update L400 with the passed value
	 *	@param number
	 */
	public void setL400(short number)  throws CFException{
		work.setL400(number);
	}

	public void setL400(int number)  throws CFException{
		work.setL400((short)number);
	}

	public void setL400(long number)  throws CFException{
		work.setL400((short)number);
	}



	/**
	 *	Returns the value of ipmErrorPointerLine600
	 *	@return ipmErrorPointerLine600
	 */
   public char[] getIpmErrorPointerLine600() throws CFException  {              
   		return work.getIpmErrorPointerLine600();
   }

  
	/**
	*  set variable ipmErrorPointerLine600
	*  @param value
	**/
   public void setIpmErrorPointerLine600(char[] value) throws CFException {
      work.setIpmErrorPointerLine600(value);
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
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {        
   		return work.getJ400();
	}
	
	/**
	 * 	Update J400 with the passed value
	 *	@param number
	 */
	public void setJ400(short number)  throws CFException{
		work.setJ400(number);
	}

	public void setJ400(int number)  throws CFException{
		work.setJ400((short)number);
	}

	public void setJ400(long number)  throws CFException{
		work.setJ400((short)number);
	}



	/**
	 *	Returns the value of errEnd400
	 *	@return errEnd400
	 */
	public short getErrEnd400() throws CFException {        
   		return work.getErrEnd400();
	}
	
	/**
	 * 	Update ErrEnd400 with the passed value
	 *	@param number
	 */
	public void setErrEnd400(short number)  throws CFException{
		work.setErrEnd400(number);
	}

	public void setErrEnd400(int number)  throws CFException{
		work.setErrEnd400((short)number);
	}

	public void setErrEnd400(long number)  throws CFException{
		work.setErrEnd400((short)number);
	}



	/**
	 *	Returns the value of k400
	 *	@return k400
	 */
	public short getK400() throws CFException {        
   		return work.getK400();
	}
	
	/**
	 * 	Update K400 with the passed value
	 *	@param number
	 */
	public void setK400(short number)  throws CFException{
		work.setK400(number);
	}

	public void setK400(int number)  throws CFException{
		work.setK400((short)number);
	}

	public void setK400(long number)  throws CFException{
		work.setK400((short)number);
	}



	/**
	 *	Returns the value of errorCode600
	 *	@return errorCode600
	 */
	public long getErrorCode600() throws CFException {
   		return ipmErrorMsg600.getErrorCode600();
	}


	/**
	 *	Returns String value of errorCode600
	 *	@return errorCode600
	 */
	public char[]  getErrorCode600String() throws CFException {
	     return String.valueOf(ipmErrorMsg600.getErrorCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorCode600IsNumeric()  throws CFException{
	    return ipmErrorMsg600.errorCode600IsNumeric();
	}

	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param number
	 */
	public void setErrorCode600(long number)  throws CFException{
		ipmErrorMsg600.setErrorCode600(number);
	}
	

	
	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorCode600(char[] value)  throws CFException {
		ipmErrorMsg600.setErrorCode600(value);
	}
	
	/**
	 * 	Update ErrorCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorCode600String(char[] value)  throws CFException{
		ipmErrorMsg600.setErrorCode600(value);
	}	


        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmFileInformation.hashCode();
        str += charMapColumns600.hashCode();
        str += work.hashCode();
        str += messageLengthMsg600.hashCode();
        str += ip65504SelElemEntriesAll.hashCode();
        str += ipmErrorMsg600.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public DisplayBadIpmMessageOutCtx clone() {
        DisplayBadIpmMessageOutCtx cloneObj = new DisplayBadIpmMessageOutCtx();
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.charMapColumns600 = new CharMapColumns600();
        cloneObj.charMapColumns600.set(charMapColumns600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.messageLengthMsg600 = new MessageLengthMsg600();
        cloneObj.messageLengthMsg600.set(messageLengthMsg600.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        cloneObj.ipmErrorMsg600 = new IpmErrorMsg600();
        cloneObj.ipmErrorMsg600.set(ipmErrorMsg600.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public DisplayBadIpmMessageOutCtx getDisplayBadIpmMessageOutCtx() {
            return new DisplayBadIpmMessageOutCtx();
    }
     public class DisplayTagTableInCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip65504TcntGroup ip65504TcntGroup = Ip662010Ctx.this.getIp65504TcntGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of ip65504TagNo
	 *	@return ip65504TagNo
	 */
	public short getIp65504TagNo(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagNo();
	}
	
	/**
	 * 	Update Ip65504TagNo with the passed value
	 *	@param number
	 */
	public void setIp65504TagNo(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo(number);
	}

	public void setIp65504TagNo(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}

	public void setIp65504TagNo(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}



	/**
	 *	Returns the value of ip65504TagStarts
	 *	@return ip65504TagStarts
	 */
	public short getIp65504TagStarts(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagStarts();
	}
	
	/**
	 * 	Update Ip65504TagStarts with the passed value
	 *	@param number
	 */
	public void setIp65504TagStarts(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts(number);
	}

	public void setIp65504TagStarts(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}

	public void setIp65504TagStarts(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip662010Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip662010Ctx.this.ip65504T;
}
	/**
	 *	Returns the value of tagTableHeader600
	 *	@return tagTableHeader600
	 */
   public char[] getTagTableHeader600() throws CFException  {              
   		return work.getTagTableHeader600();
   }

  
	/**
	*  set variable tagTableHeader600
	*  @param value
	**/
   public void setTagTableHeader600(char[] value) throws CFException {
      work.setTagTableHeader600(value);
   } 

	/**
	 *	Returns the value of ip65504TagLngth
	 *	@return ip65504TagLngth
	 */
	public short getIp65504TagLngth(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagLngth();
	}
	
	/**
	 * 	Update Ip65504TagLngth with the passed value
	 *	@param number
	 */
	public void setIp65504TagLngth(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth(number);
	}

	public void setIp65504TagLngth(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth((short)number);
	}

	public void setIp65504TagLngth(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth((short)number);
	}



	/**
	 *	Returns the value of i800
	 *	@return i800
	 */
	public short getI800() throws CFException {        
   		return work.getI800();
	}
	
	/**
	 * 	Update I800 with the passed value
	 *	@param number
	 */
	public void setI800(short number)  throws CFException{
		work.setI800(number);
	}

	public void setI800(int number)  throws CFException{
		work.setI800((short)number);
	}

	public void setI800(long number)  throws CFException{
		work.setI800((short)number);
	}



	/**
	 *	Returns the value of ip65504TagType
	 *	@return ip65504TagType
	 */
	public short getIp65504TagType(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagType();
	}
	
	/**
	 * 	Update Ip65504TagType with the passed value
	 *	@param number
	 */
	public void setIp65504TagType(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType(number);
	}

	public void setIp65504TagType(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}

	public void setIp65504TagType(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagType((short)number);
	}



	/**
	 *	Returns the value of ip65504TagStatus
	 *	@return ip65504TagStatus
	 */
   public char[] getIp65504TagStatus(int index) throws CFException  {              
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagStatus();
   }

  
	/**
	*  set variable ip65504TagStatus
	*  @param value
	**/
   public void setIp65504TagStatus(int index,char[] value) throws CFException {
      ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStatus(value);
   } 

     /**
	 * 	Update Ip65504TagStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp65504TagStatus(int index,char[] source, int sourceIndex) throws CFException {
      ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStatus(source, sourceIndex);
   	
   }
   
   public void setIp65504TagStatus(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip65504TagStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp65504TagStatus(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip65504TagStatus with another Field
	 *	@param value
	 */
   public void setIp65504TagStatus(int index,Field source) {
      ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStatus(source);
   }  
   
     /**
	 * 	Update Ip65504TagStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp65504TagStatus(int index,Field source, int sourceIndex,int sourceLen) {
      ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip65504TagStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp65504TagStatus(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of ip65504Tcnt
	 *	@return ip65504Tcnt
	 */
	public short getIp65504Tcnt() throws CFException {        
   		return ip65504TcntGroup.getIp65504Tcnt();
	}
	
	/**
	 * 	Update Ip65504Tcnt with the passed value
	 *	@param number
	 */
	public void setIp65504Tcnt(short number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt(number);
	}

	public void setIp65504Tcnt(int number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt((short)number);
	}

	public void setIp65504Tcnt(long number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt((short)number);
	}



	/**
	 *	Returns the value of ip65504TagSubFldNo
	 *	@return ip65504TagSubFldNo
	 */
	public short getIp65504TagSubFldNo(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagSubFldNo();
	}
	
	/**
	 * 	Update Ip65504TagSubFldNo with the passed value
	 *	@param number
	 */
	public void setIp65504TagSubFldNo(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagSubFldNo(number);
	}

	public void setIp65504TagSubFldNo(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagSubFldNo((short)number);
	}

	public void setIp65504TagSubFldNo(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagSubFldNo((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }

        public DisplayTagTableOutCtx getDisplayTagTableOutCtx() {
            return new DisplayTagTableOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip65504TcntGroup.hashCode();
        str += work.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public DisplayTagTableInCtx clone() {
        DisplayTagTableInCtx cloneObj = new DisplayTagTableInCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip65504TcntGroup = new Ip65504TcntGroup();
        cloneObj.ip65504TcntGroup.set(ip65504TcntGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public DisplayTagTableInCtx getDisplayTagTableInCtx() {
            return new DisplayTagTableInCtx();
    }
     public class DisplayTagTableOutCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip662010Ctx.this.getIp65504CurrentTagTable();
     Ip65504TcntGroup ip65504TcntGroup = Ip662010Ctx.this.getIp65504TcntGroup();
     Work work = Ip662010Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip662010Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of ip65504TagNo
	 *	@return ip65504TagNo
	 */
	public short getIp65504TagNo(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().getIp65504TagNo();
	}
	
	/**
	 * 	Update Ip65504TagNo with the passed value
	 *	@param number
	 */
	public void setIp65504TagNo(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo(number);
	}

	public void setIp65504TagNo(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}

	public void setIp65504TagNo(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagId().setIp65504TagNo((short)number);
	}



	/**
	 *	Returns the value of tagContent600
	 *	@return tagContent600
	 */
   public char[] getTagContent600() throws CFException  {              
   		return work.getTagContent600();
   }

  
	/**
	*  set variable tagContent600
	*  @param value
	**/
   public void setTagContent600(char[] value) throws CFException {
      work.setTagContent600(value);
   } 

	/**
	 *	Returns the value of tagType600
	 *	@return tagType600
	 */
   public char[] getTagType600() throws CFException  {              
   		return work.getTagType600();
   }

  
	/**
	*  set variable tagType600
	*  @param value
	**/
   public void setTagType600(char[] value) throws CFException {
      work.setTagType600(value);
   } 

	/**
	 *	Returns the value of tagSubfldNo600
	 *	@return tagSubfldNo600
	 */
   public char[] getTagSubfldNo600() throws CFException  {              
   		return work.getTagSubfldNo600();
   }

  
	/**
	*  set variable tagSubfldNo600
	*  @param value
	**/
   public void setTagSubfldNo600(char[] value) throws CFException {
      work.setTagSubfldNo600(value);
   } 

     /**
	 * 	Update TagSubfldNo600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTagSubfldNo600(char[] source, int sourceIndex) throws CFException {
      work.setTagSubfldNo600(source, sourceIndex);
   	
   }
   
   public void setTagSubfldNo600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTagSubfldNo600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TagSubfldNo600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagSubfldNo600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTagSubfldNo600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TagSubfldNo600 with another Field
	 *	@param value
	 */
   public void setTagSubfldNo600(Field source) {
      work.setTagSubfldNo600(source);
   }  
   
     /**
	 * 	Update TagSubfldNo600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTagSubfldNo600(Field source, int sourceIndex,int sourceLen) {
      work.setTagSubfldNo600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TagSubfldNo600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagSubfldNo600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTagSubfldNo600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504TagStarts
	 *	@return ip65504TagStarts
	 */
	public short getIp65504TagStarts(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagStarts();
	}
	
	/**
	 * 	Update Ip65504TagStarts with the passed value
	 *	@param number
	 */
	public void setIp65504TagStarts(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts(number);
	}

	public void setIp65504TagStarts(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}

	public void setIp65504TagStarts(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagStarts((short)number);
	}



	/**
	 *	Returns the value of tagLngth600
	 *	@return tagLngth600
	 */
   public char[] getTagLngth600() throws CFException  {              
   		return work.getTagLngth600();
   }

  
	/**
	*  set variable tagLngth600
	*  @param value
	**/
   public void setTagLngth600(char[] value) throws CFException {
      work.setTagLngth600(value);
   } 

     /**
	 * 	Update TagLngth600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTagLngth600(char[] source, int sourceIndex) throws CFException {
      work.setTagLngth600(source, sourceIndex);
   	
   }
   
   public void setTagLngth600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTagLngth600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TagLngth600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagLngth600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTagLngth600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TagLngth600 with another Field
	 *	@param value
	 */
   public void setTagLngth600(Field source) {
      work.setTagLngth600(source);
   }  
   
     /**
	 * 	Update TagLngth600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTagLngth600(Field source, int sourceIndex,int sourceLen) {
      work.setTagLngth600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TagLngth600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagLngth600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTagLngth600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tagStarts600
	 *	@return tagStarts600
	 */
   public char[] getTagStarts600() throws CFException  {              
   		return work.getTagStarts600();
   }

  
	/**
	*  set variable tagStarts600
	*  @param value
	**/
   public void setTagStarts600(char[] value) throws CFException {
      work.setTagStarts600(value);
   } 

     /**
	 * 	Update TagStarts600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTagStarts600(char[] source, int sourceIndex) throws CFException {
      work.setTagStarts600(source, sourceIndex);
   	
   }
   
   public void setTagStarts600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTagStarts600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TagStarts600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagStarts600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTagStarts600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TagStarts600 with another Field
	 *	@param value
	 */
   public void setTagStarts600(Field source) {
      work.setTagStarts600(source);
   }  
   
     /**
	 * 	Update TagStarts600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTagStarts600(Field source, int sourceIndex,int sourceLen) {
      work.setTagStarts600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TagStarts600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagStarts600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTagStarts600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip65504TagLngth
	 *	@return ip65504TagLngth
	 */
	public short getIp65504TagLngth(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagLngth();
	}
	
	/**
	 * 	Update Ip65504TagLngth with the passed value
	 *	@param number
	 */
	public void setIp65504TagLngth(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth(number);
	}

	public void setIp65504TagLngth(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth((short)number);
	}

	public void setIp65504TagLngth(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagLngth((short)number);
	}



	/**
	 *	Returns the value of tagStatus600
	 *	@return tagStatus600
	 */
   public char[] getTagStatus600() throws CFException  {              
   		return work.getTagStatus600();
   }

  
	/**
	*  set variable tagStatus600
	*  @param value
	**/
   public void setTagStatus600(char[] value) throws CFException {
      work.setTagStatus600(value);
   } 

	/**
	 *	Returns the value of i800
	 *	@return i800
	 */
	public short getI800() throws CFException {        
   		return work.getI800();
	}
	
	/**
	 * 	Update I800 with the passed value
	 *	@param number
	 */
	public void setI800(short number)  throws CFException{
		work.setI800(number);
	}

	public void setI800(int number)  throws CFException{
		work.setI800((short)number);
	}

	public void setI800(long number)  throws CFException{
		work.setI800((short)number);
	}



	/**
	 *	Returns the value of tagNo600
	 *	@return tagNo600
	 */
   public char[] getTagNo600() throws CFException  {              
   		return work.getTagNo600();
   }

  
	/**
	*  set variable tagNo600
	*  @param value
	**/
   public void setTagNo600(char[] value) throws CFException {
      work.setTagNo600(value);
   } 

     /**
	 * 	Update TagNo600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTagNo600(char[] source, int sourceIndex) throws CFException {
      work.setTagNo600(source, sourceIndex);
   	
   }
   
   public void setTagNo600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTagNo600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TagNo600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagNo600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTagNo600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TagNo600 with another Field
	 *	@param value
	 */
   public void setTagNo600(Field source) {
      work.setTagNo600(source);
   }  
   
     /**
	 * 	Update TagNo600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTagNo600(Field source, int sourceIndex,int sourceLen) {
      work.setTagNo600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TagNo600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagNo600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTagNo600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }


	/**
	 *	Returns the value of ip65504Tcnt
	 *	@return ip65504Tcnt
	 */
	public short getIp65504Tcnt() throws CFException {        
   		return ip65504TcntGroup.getIp65504Tcnt();
	}
	
	/**
	 * 	Update Ip65504Tcnt with the passed value
	 *	@param number
	 */
	public void setIp65504Tcnt(short number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt(number);
	}

	public void setIp65504Tcnt(int number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt((short)number);
	}

	public void setIp65504Tcnt(long number)  throws CFException{
		ip65504TcntGroup.setIp65504Tcnt((short)number);
	}



	/**
	 *	Returns the value of ip65504TagSubFldNo
	 *	@return ip65504TagSubFldNo
	 */
	public short getIp65504TagSubFldNo(int index) throws CFException {        
   		return ip65504CurrentTagTable.getIp65504TagArea(index).getIp65504TagSubFldNo();
	}
	
	/**
	 * 	Update Ip65504TagSubFldNo with the passed value
	 *	@param number
	 */
	public void setIp65504TagSubFldNo(int index,short number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagSubFldNo(number);
	}

	public void setIp65504TagSubFldNo(int index,int number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagSubFldNo((short)number);
	}

	public void setIp65504TagSubFldNo(int index,long number)  throws CFException{
		ip65504CurrentTagTable.getIp65504TagArea(index).setIp65504TagSubFldNo((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504CurrentTagTable.hashCode();
        str += ip65504TcntGroup.hashCode();
        str += work.hashCode();
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public DisplayTagTableOutCtx clone() {
        DisplayTagTableOutCtx cloneObj = new DisplayTagTableOutCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip65504TcntGroup = new Ip65504TcntGroup();
        cloneObj.ip65504TcntGroup.set(ip65504TcntGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public DisplayTagTableOutCtx getDisplayTagTableOutCtx() {
            return new DisplayTagTableOutCtx();
    }
     public class AbendInCtx implements Cloneable {
     Work work = Ip662010Ctx.this.getWork();

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
	public short getAbendCode900() throws CFException {        
   		return work.getAbendCode900();
	}
	
	/**
	 * 	Update AbendCode900 with the passed value
	 *	@param number
	 */
	public void setAbendCode900(short number)  throws CFException{
		work.setAbendCode900(number);
	}

	public void setAbendCode900(int number)  throws CFException{
		work.setAbendCode900((short)number);
	}

	public void setAbendCode900(long number)  throws CFException{
		work.setAbendCode900((short)number);
	}




        public Ip662010Ctx getIp662010Ctx() {
            return Ip662010Ctx.this;
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

    public AbendInCtx clone() {
        AbendInCtx cloneObj = new AbendInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public AbendInCtx getAbendInCtx() {
            return new AbendInCtx();
    }
}
