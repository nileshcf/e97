package com.cloudframe.app.ip200090;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.global.sharedvar.Ip65504SelElemEntriesAll;
import com.cloudframe.app.ip200090.dto.Work;
import com.cloudframe.app.ip200090.dto.EditNumGroup800;
import com.cloudframe.app.ip200090.dto.BslIdGroup800;
import com.cloudframe.app.global.sharedvar.Ip65504CurrentTagTable;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.ip200090.dto.AbendParaName900;
import com.cloudframe.app.ip200090.dto.EditNumR800;
import com.cloudframe.app.ip200090.dto.AbendMessage900;
import com.cloudframe.app.global.sharedvar.Ip00702CaStringGroup;
import com.cloudframe.app.global.sharedvar.Ip65504PdsMapGroup;
import com.cloudframe.app.global.sharedvar.Ip90134EntryFoundGroup800;
import com.cloudframe.app.global.sharedvar.AdditionalSyntaxChecksGroup100;
import com.cloudframe.app.global.sharedvar.Ip00321EditListRec;
import com.cloudframe.app.global.sharedvar.Ip65504TcntGroup;
import com.cloudframe.app.global.sharedvar.Ip65504DeMapGroup;
import com.cloudframe.app.ip200090.dto.EditType23InfoTableGroup500;
import com.cloudframe.app.global.sharedvar.Ip65504SelPdsEntriesAll;
import com.cloudframe.app.global.sharedvar.IsSoftSyntaxAppliedGroup100;
import com.cloudframe.app.ip200090.dto.SyntaxPgmTableGroup500;
import com.cloudframe.app.global.sharedvar.Ip65504TaggedRecordInfo;
import com.cloudframe.app.global.sharedvar.Ip90134TableEntry;
import com.cloudframe.app.global.sharedvar.Ip65504MessageStatusGroup;
import com.cloudframe.app.ip200090.dto.ErrorMessage610;
import com.cloudframe.app.global.sharedvar.Ip00702CaTable;
import com.cloudframe.app.ip200090.dto.BslId800;


@Context
public class Ip200090Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Ip65504TaggedRecordInfo ip65504TaggedRecordInfo;
    ErrorMessage610 errorMessage610;
    EditType23InfoTableGroup500 editType23InfoTableGroup500;
    Ip00702CaStringGroup ip00702CaStringGroup;
    IsSoftSyntaxAppliedGroup100 isSoftSyntaxAppliedGroup100;
    SyntaxPgmTableGroup500 syntaxPgmTableGroup500;
    Ip65504TcntGroup ip65504TcntGroup;
    BslIdGroup800 bslIdGroup800;
    AbendParaName900 abendParaName900;
    Ip65504DeMapGroup ip65504DeMapGroup;
    Work work;
    AdditionalSyntaxChecksGroup100 additionalSyntaxChecksGroup100;
    EditNumGroup800 editNumGroup800;
    Ip00321EditListRec ip00321EditListRec;
    Ip996011ProgramStartMessage ip996011ProgramStartMessage;
    Ip90134EntryFoundGroup800 ip90134EntryFoundGroup800;
    Ip90134TableEntry ip90134TableEntry;
    Ip65504SelElemEntriesAll ip65504SelElemEntriesAll;
    Ip65504PdsMapGroup ip65504PdsMapGroup;
    Ip65504SelPdsEntriesAll ip65504SelPdsEntriesAll;
    Ip65504CurrentTagTable ip65504CurrentTagTable;
    Ip00702CaTable ip00702CaTable;
    Ip60001EventLogWorkArea ip60001EventLogWorkArea;
    AbendMessage900 abendMessage900;
    Ip65504MessageStatusGroup ip65504MessageStatusGroup;

    int syntaxIdx500;
    int ip65504D;
    int ip65504P;
    int pgmIdx500;
    int ip65504T;

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


    public Ip65504TaggedRecordInfo getIp65504TaggedRecordInfo() {
        if (ip65504TaggedRecordInfo == null) {
            ip65504TaggedRecordInfo = globalCtx.getGlobalDto(Ip65504TaggedRecordInfo.class);
        }

        return ip65504TaggedRecordInfo;
    }

    public ErrorMessage610 getErrorMessage610() {
        if (errorMessage610 == null) {
            errorMessage610 = new ErrorMessage610();
        }

        return errorMessage610;
    }

    public void setErrorMessage610(ErrorMessage610 errorMessage610) {
        this.errorMessage610 = errorMessage610;
    }
    public EditType23InfoTableGroup500 getEditType23InfoTableGroup500() {
        if (editType23InfoTableGroup500 == null) {
            editType23InfoTableGroup500 = new EditType23InfoTableGroup500();
        }

        return editType23InfoTableGroup500;
    }

    public void setEditType23InfoTableGroup500(EditType23InfoTableGroup500 editType23InfoTableGroup500) {
        this.editType23InfoTableGroup500 = editType23InfoTableGroup500;
    }
    public Ip00702CaStringGroup getIp00702CaStringGroup() {
        if (ip00702CaStringGroup == null) {
            ip00702CaStringGroup = globalCtx.getGlobalDto(Ip00702CaStringGroup.class);
        }

        return ip00702CaStringGroup;
    }

    public IsSoftSyntaxAppliedGroup100 getIsSoftSyntaxAppliedGroup100() {
        if (isSoftSyntaxAppliedGroup100 == null) {
            isSoftSyntaxAppliedGroup100 = globalCtx.getGlobalDto(IsSoftSyntaxAppliedGroup100.class);
        }

        return isSoftSyntaxAppliedGroup100;
    }

    public SyntaxPgmTableGroup500 getSyntaxPgmTableGroup500() {
        if (syntaxPgmTableGroup500 == null) {
            syntaxPgmTableGroup500 = new SyntaxPgmTableGroup500();
        }

        return syntaxPgmTableGroup500;
    }

    public void setSyntaxPgmTableGroup500(SyntaxPgmTableGroup500 syntaxPgmTableGroup500) {
        this.syntaxPgmTableGroup500 = syntaxPgmTableGroup500;
    }
    public Ip65504TcntGroup getIp65504TcntGroup() {
        if (ip65504TcntGroup == null) {
            ip65504TcntGroup = globalCtx.getGlobalDto(Ip65504TcntGroup.class);
        }

        return ip65504TcntGroup;
    }

    public BslIdGroup800 getBslIdGroup800() {
        if (bslIdGroup800 == null) {
            bslIdGroup800 = new BslIdGroup800();
        }

        return bslIdGroup800;
    }

    public void setBslIdGroup800(BslIdGroup800 bslIdGroup800) {
        this.bslIdGroup800 = bslIdGroup800;
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
    public Ip65504DeMapGroup getIp65504DeMapGroup() {
        if (ip65504DeMapGroup == null) {
            ip65504DeMapGroup = globalCtx.getGlobalDto(Ip65504DeMapGroup.class);
        }

        return ip65504DeMapGroup;
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
    public AdditionalSyntaxChecksGroup100 getAdditionalSyntaxChecksGroup100() {
        if (additionalSyntaxChecksGroup100 == null) {
            additionalSyntaxChecksGroup100 = globalCtx.getGlobalDto(AdditionalSyntaxChecksGroup100.class);
        }

        return additionalSyntaxChecksGroup100;
    }

    public EditNumGroup800 getEditNumGroup800() {
        if (editNumGroup800 == null) {
            editNumGroup800 = new EditNumGroup800();
        }

        return editNumGroup800;
    }

    public void setEditNumGroup800(EditNumGroup800 editNumGroup800) {
        this.editNumGroup800 = editNumGroup800;
    }
    public Ip00321EditListRec getIp00321EditListRec() {
        if (ip00321EditListRec == null) {
            ip00321EditListRec = globalCtx.getGlobalDto(Ip00321EditListRec.class);
        }

        return ip00321EditListRec;
    }

    public Ip996011ProgramStartMessage getIp996011ProgramStartMessage() {
        if (ip996011ProgramStartMessage == null) {
            ip996011ProgramStartMessage = globalCtx.getGlobalDto(Ip996011ProgramStartMessage.class);
        }

        return ip996011ProgramStartMessage;
    }

    public Ip90134EntryFoundGroup800 getIp90134EntryFoundGroup800() {
        if (ip90134EntryFoundGroup800 == null) {
            ip90134EntryFoundGroup800 = globalCtx.getGlobalDto(Ip90134EntryFoundGroup800.class);
        }

        return ip90134EntryFoundGroup800;
    }

    public Ip90134TableEntry getIp90134TableEntry() {
        if (ip90134TableEntry == null) {
            ip90134TableEntry = globalCtx.getGlobalDto(Ip90134TableEntry.class);
        }

        return ip90134TableEntry;
    }

    public Ip65504SelElemEntriesAll getIp65504SelElemEntriesAll() {
        if (ip65504SelElemEntriesAll == null) {
            ip65504SelElemEntriesAll = globalCtx.getGlobalDto(Ip65504SelElemEntriesAll.class);
        }

        return ip65504SelElemEntriesAll;
    }

    public Ip65504PdsMapGroup getIp65504PdsMapGroup() {
        if (ip65504PdsMapGroup == null) {
            ip65504PdsMapGroup = globalCtx.getGlobalDto(Ip65504PdsMapGroup.class);
        }

        return ip65504PdsMapGroup;
    }

    public Ip65504SelPdsEntriesAll getIp65504SelPdsEntriesAll() {
        if (ip65504SelPdsEntriesAll == null) {
            ip65504SelPdsEntriesAll = globalCtx.getGlobalDto(Ip65504SelPdsEntriesAll.class);
        }

        return ip65504SelPdsEntriesAll;
    }

    public Ip65504CurrentTagTable getIp65504CurrentTagTable() {
        if (ip65504CurrentTagTable == null) {
            ip65504CurrentTagTable = globalCtx.getGlobalDto(Ip65504CurrentTagTable.class);
        }

        return ip65504CurrentTagTable;
    }

    public Ip00702CaTable getIp00702CaTable() {
        if (ip00702CaTable == null) {
            ip00702CaTable = globalCtx.getGlobalDto(Ip00702CaTable.class);
        }

        return ip00702CaTable;
    }

    public Ip60001EventLogWorkArea getIp60001EventLogWorkArea() {
        if (ip60001EventLogWorkArea == null) {
            ip60001EventLogWorkArea = globalCtx.getGlobalDto(Ip60001EventLogWorkArea.class);
        }

        return ip60001EventLogWorkArea;
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
    public Ip65504MessageStatusGroup getIp65504MessageStatusGroup() {
        if (ip65504MessageStatusGroup == null) {
            ip65504MessageStatusGroup = globalCtx.getGlobalDto(Ip65504MessageStatusGroup.class);
        }

        return ip65504MessageStatusGroup;
    }


    public int getSyntaxIdx500() {
        return syntaxIdx500;
    }

    public void setSyntaxIdx500(int syntaxIdx500) {
        this.syntaxIdx500 = syntaxIdx500;
    }
    public int getIp65504D() {
        return ip65504D;
    }

    public void setIp65504D(int ip65504D) {
        this.ip65504D = ip65504D;
    }
    public int getIp65504P() {
        return ip65504P;
    }

    public void setIp65504P(int ip65504P) {
        this.ip65504P = ip65504P;
    }
    public int getPgmIdx500() {
        return pgmIdx500;
    }

    public void setPgmIdx500(int pgmIdx500) {
        this.pgmIdx500 = pgmIdx500;
    }
    public int getIp65504T() {
        return ip65504T;
    }

    public void setIp65504T(int ip65504T) {
        this.ip65504T = ip65504T;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504TaggedRecordInfo.hashCode();
        str += errorMessage610.hashCode();
        str += editType23InfoTableGroup500.hashCode();
        str += ip00702CaStringGroup.hashCode();
        str += isSoftSyntaxAppliedGroup100.hashCode();
        str += syntaxPgmTableGroup500.hashCode();
        str += ip65504TcntGroup.hashCode();
        str += bslIdGroup800.hashCode();
        str += abendParaName900.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += work.hashCode();
        str += additionalSyntaxChecksGroup100.hashCode();
        str += editNumGroup800.hashCode();
        str += ip00321EditListRec.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
        str += ip90134EntryFoundGroup800.hashCode();
        str += ip90134TableEntry.hashCode();
        str += ip65504SelElemEntriesAll.hashCode();
        str += ip65504PdsMapGroup.hashCode();
        str += ip65504SelPdsEntriesAll.hashCode();
        str += ip65504CurrentTagTable.hashCode();
        str += ip00702CaTable.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += abendMessage900.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
       return str.hashCode();
    }

    public Ip200090Ctx clone() {
        Ip200090Ctx cloneObj = new Ip200090Ctx();
        cloneObj.ip65504TaggedRecordInfo = new Ip65504TaggedRecordInfo();
        cloneObj.ip65504TaggedRecordInfo.set(ip65504TaggedRecordInfo.getClonedField());
        cloneObj.errorMessage610 = new ErrorMessage610();
        cloneObj.errorMessage610.set(errorMessage610.getClonedField());
        cloneObj.editType23InfoTableGroup500 = new EditType23InfoTableGroup500();
        cloneObj.editType23InfoTableGroup500.set(editType23InfoTableGroup500.getClonedField());
        cloneObj.ip00702CaStringGroup = new Ip00702CaStringGroup();
        cloneObj.ip00702CaStringGroup.set(ip00702CaStringGroup.getClonedField());
        cloneObj.isSoftSyntaxAppliedGroup100 = new IsSoftSyntaxAppliedGroup100();
        cloneObj.isSoftSyntaxAppliedGroup100.set(isSoftSyntaxAppliedGroup100.getClonedField());
        cloneObj.syntaxPgmTableGroup500 = new SyntaxPgmTableGroup500();
        cloneObj.syntaxPgmTableGroup500.set(syntaxPgmTableGroup500.getClonedField());
        cloneObj.ip65504TcntGroup = new Ip65504TcntGroup();
        cloneObj.ip65504TcntGroup.set(ip65504TcntGroup.getClonedField());
        cloneObj.bslIdGroup800 = new BslIdGroup800();
        cloneObj.bslIdGroup800.set(bslIdGroup800.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.additionalSyntaxChecksGroup100 = new AdditionalSyntaxChecksGroup100();
        cloneObj.additionalSyntaxChecksGroup100.set(additionalSyntaxChecksGroup100.getClonedField());
        cloneObj.editNumGroup800 = new EditNumGroup800();
        cloneObj.editNumGroup800.set(editNumGroup800.getClonedField());
        cloneObj.ip00321EditListRec = new Ip00321EditListRec();
        cloneObj.ip00321EditListRec.set(ip00321EditListRec.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.ip90134EntryFoundGroup800 = new Ip90134EntryFoundGroup800();
        cloneObj.ip90134EntryFoundGroup800.set(ip90134EntryFoundGroup800.getClonedField());
        cloneObj.ip90134TableEntry = new Ip90134TableEntry();
        cloneObj.ip90134TableEntry.set(ip90134TableEntry.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        cloneObj.ip65504SelPdsEntriesAll = new Ip65504SelPdsEntriesAll();
        cloneObj.ip65504SelPdsEntriesAll.set(ip65504SelPdsEntriesAll.getClonedField());
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip00702CaTable = new Ip00702CaTable();
        cloneObj.ip00702CaTable.set(ip00702CaTable.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class PerformInitializationInCtx implements Cloneable {
     Work work = Ip200090Ctx.this.getWork();

	/**
	 *	Test condition "Y" for isItIsTheFirstTime88100()
	 *	@return  Returns true if isItIsTheFirstTime88100() is "Y"
	 */
   public boolean isItIsTheFirstTime88100() throws CFException {
      return work.isItIsTheFirstTime88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsTheFirstTime88100True()  throws CFException{  			
    	work.setItIsTheFirstTime88100True();
   	}

        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
        }

        public PerformInitializationOutCtx getPerformInitializationOutCtx() {
            return new PerformInitializationOutCtx();
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

    public PerformInitializationInCtx clone() {
        PerformInitializationInCtx cloneObj = new PerformInitializationInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PerformInitializationInCtx getPerformInitializationInCtx() {
            return new PerformInitializationInCtx();
    }
     public class PerformInitializationOutCtx implements Cloneable {
     Work work = Ip200090Ctx.this.getWork();

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

        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
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

    public PerformInitializationOutCtx clone() {
        PerformInitializationOutCtx cloneObj = new PerformInitializationOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PerformInitializationOutCtx getPerformInitializationOutCtx() {
            return new PerformInitializationOutCtx();
    }
     public class DisplayExecMsgsInCtx implements Cloneable {
     Work work = Ip200090Ctx.this.getWork();
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip200090Ctx.this.getIp996011ProgramStartMessage();

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
	 *	Returns the value of edit0009300
	 *	@return edit0009300
	 */
   public char[] getEdit0009300() throws CFException  {              
   		return work.getEdit0009300();
   }

  
	/**
	*  set variable edit0009300
	*  @param value
	**/
   public void setEdit0009300(char[] value) throws CFException {
      work.setEdit0009300(value);
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


        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
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
     Work work = Ip200090Ctx.this.getWork();
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip200090Ctx.this.getIp996011ProgramStartMessage();

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
	 *	Returns the value of edit0009300
	 *	@return edit0009300
	 */
   public char[] getEdit0009300() throws CFException  {              
   		return work.getEdit0009300();
   }

  
	/**
	*  set variable edit0009300
	*  @param value
	**/
   public void setEdit0009300(char[] value) throws CFException {
      work.setEdit0009300(value);
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


        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
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
     SyntaxPgmTableGroup500 syntaxPgmTableGroup500 = Ip200090Ctx.this.getSyntaxPgmTableGroup500();
     Work work = Ip200090Ctx.this.getWork();

	/**
	 *	Returns the value of syntaxIp200690Name500
	 *	@return syntaxIp200690Name500
	 */
   public char[] getSyntaxIp200690Name500() throws CFException  {              
   		return syntaxPgmTableGroup500.getSyntaxPgmTable500().getSyntaxIp200690Name500();
   }

  
	/**
	*  set variable syntaxIp200690Name500
	*  @param value
	**/
   public void setSyntaxIp200690Name500(char[] value) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp200690Name500(value);
   } 

     /**
	 * 	Update SyntaxIp200690Name500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxIp200690Name500(char[] source, int sourceIndex) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp200690Name500(source, sourceIndex);
   	
   }
   
   public void setSyntaxIp200690Name500(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp200690Name500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SyntaxIp200690Name500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp200690Name500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp200690Name500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SyntaxIp200690Name500 with another Field
	 *	@param value
	 */
   public void setSyntaxIp200690Name500(Field source) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp200690Name500(source);
   }  
   
     /**
	 * 	Update SyntaxIp200690Name500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxIp200690Name500(Field source, int sourceIndex,int sourceLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp200690Name500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SyntaxIp200690Name500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp200690Name500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp200690Name500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pgmIp381120300
	 *	@return pgmIp381120300
	 */
   public char[] getPgmIp381120300() throws CFException  {              
   		return work.getPgmIp381120300();
   }

  
	/**
	*  set variable pgmIp381120300
	*  @param value
	**/
   public void setPgmIp381120300(char[] value) throws CFException {
      work.setPgmIp381120300(value);
   } 

	/**
	 *	Returns the value of syntaxIp209720Name500
	 *	@return syntaxIp209720Name500
	 */
   public char[] getSyntaxIp209720Name500() throws CFException  {              
   		return syntaxPgmTableGroup500.getSyntaxPgmTable500().getSyntaxIp209720Name500();
   }

  
	/**
	*  set variable syntaxIp209720Name500
	*  @param value
	**/
   public void setSyntaxIp209720Name500(char[] value) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp209720Name500(value);
   } 

     /**
	 * 	Update SyntaxIp209720Name500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxIp209720Name500(char[] source, int sourceIndex) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp209720Name500(source, sourceIndex);
   	
   }
   
   public void setSyntaxIp209720Name500(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp209720Name500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SyntaxIp209720Name500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp209720Name500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp209720Name500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SyntaxIp209720Name500 with another Field
	 *	@param value
	 */
   public void setSyntaxIp209720Name500(Field source) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp209720Name500(source);
   }  
   
     /**
	 * 	Update SyntaxIp209720Name500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxIp209720Name500(Field source, int sourceIndex,int sourceLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp209720Name500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SyntaxIp209720Name500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp209720Name500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp209720Name500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of syntaxIp223190Name500
	 *	@return syntaxIp223190Name500
	 */
   public char[] getSyntaxIp223190Name500() throws CFException  {              
   		return syntaxPgmTableGroup500.getSyntaxPgmTable500().getSyntaxIp223190Name500();
   }

  
	/**
	*  set variable syntaxIp223190Name500
	*  @param value
	**/
   public void setSyntaxIp223190Name500(char[] value) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp223190Name500(value);
   } 

     /**
	 * 	Update SyntaxIp223190Name500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxIp223190Name500(char[] source, int sourceIndex) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp223190Name500(source, sourceIndex);
   	
   }
   
   public void setSyntaxIp223190Name500(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp223190Name500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SyntaxIp223190Name500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp223190Name500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp223190Name500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SyntaxIp223190Name500 with another Field
	 *	@param value
	 */
   public void setSyntaxIp223190Name500(Field source) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp223190Name500(source);
   }  
   
     /**
	 * 	Update SyntaxIp223190Name500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxIp223190Name500(Field source, int sourceIndex,int sourceLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp223190Name500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SyntaxIp223190Name500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp223190Name500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp223190Name500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of syntaxIp209700Name500
	 *	@return syntaxIp209700Name500
	 */
   public char[] getSyntaxIp209700Name500() throws CFException  {              
   		return syntaxPgmTableGroup500.getSyntaxPgmTable500().getSyntaxIp209700Name500();
   }

  
	/**
	*  set variable syntaxIp209700Name500
	*  @param value
	**/
   public void setSyntaxIp209700Name500(char[] value) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp209700Name500(value);
   } 

     /**
	 * 	Update SyntaxIp209700Name500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxIp209700Name500(char[] source, int sourceIndex) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp209700Name500(source, sourceIndex);
   	
   }
   
   public void setSyntaxIp209700Name500(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp209700Name500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SyntaxIp209700Name500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp209700Name500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp209700Name500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SyntaxIp209700Name500 with another Field
	 *	@param value
	 */
   public void setSyntaxIp209700Name500(Field source) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp209700Name500(source);
   }  
   
     /**
	 * 	Update SyntaxIp209700Name500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxIp209700Name500(Field source, int sourceIndex,int sourceLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp209700Name500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SyntaxIp209700Name500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp209700Name500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp209700Name500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of syntaxIp223870Name500
	 *	@return syntaxIp223870Name500
	 */
   public char[] getSyntaxIp223870Name500() throws CFException  {              
   		return syntaxPgmTableGroup500.getSyntaxPgmTable500().getSyntaxIp223870Name500();
   }

  
	/**
	*  set variable syntaxIp223870Name500
	*  @param value
	**/
   public void setSyntaxIp223870Name500(char[] value) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp223870Name500(value);
   } 

     /**
	 * 	Update SyntaxIp223870Name500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxIp223870Name500(char[] source, int sourceIndex) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp223870Name500(source, sourceIndex);
   	
   }
   
   public void setSyntaxIp223870Name500(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp223870Name500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SyntaxIp223870Name500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp223870Name500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp223870Name500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SyntaxIp223870Name500 with another Field
	 *	@param value
	 */
   public void setSyntaxIp223870Name500(Field source) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp223870Name500(source);
   }  
   
     /**
	 * 	Update SyntaxIp223870Name500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxIp223870Name500(Field source, int sourceIndex,int sourceLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp223870Name500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SyntaxIp223870Name500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp223870Name500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp223870Name500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pgmIp200100300
	 *	@return pgmIp200100300
	 */
   public char[] getPgmIp200100300() throws CFException  {              
   		return work.getPgmIp200100300();
   }

  
	/**
	*  set variable pgmIp200100300
	*  @param value
	**/
   public void setPgmIp200100300(char[] value) throws CFException {
      work.setPgmIp200100300(value);
   } 

	/**
	 *	Returns the value of syntaxIp221080Name500
	 *	@return syntaxIp221080Name500
	 */
   public char[] getSyntaxIp221080Name500() throws CFException  {              
   		return syntaxPgmTableGroup500.getSyntaxPgmTable500().getSyntaxIp221080Name500();
   }

  
	/**
	*  set variable syntaxIp221080Name500
	*  @param value
	**/
   public void setSyntaxIp221080Name500(char[] value) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp221080Name500(value);
   } 

     /**
	 * 	Update SyntaxIp221080Name500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxIp221080Name500(char[] source, int sourceIndex) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp221080Name500(source, sourceIndex);
   	
   }
   
   public void setSyntaxIp221080Name500(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp221080Name500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SyntaxIp221080Name500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp221080Name500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp221080Name500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SyntaxIp221080Name500 with another Field
	 *	@param value
	 */
   public void setSyntaxIp221080Name500(Field source) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp221080Name500(source);
   }  
   
     /**
	 * 	Update SyntaxIp221080Name500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxIp221080Name500(Field source, int sourceIndex,int sourceLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp221080Name500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SyntaxIp221080Name500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp221080Name500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp221080Name500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of syntaxIp202990Name500
	 *	@return syntaxIp202990Name500
	 */
   public char[] getSyntaxIp202990Name500() throws CFException  {              
   		return syntaxPgmTableGroup500.getSyntaxPgmTable500().getSyntaxIp202990Name500();
   }

  
	/**
	*  set variable syntaxIp202990Name500
	*  @param value
	**/
   public void setSyntaxIp202990Name500(char[] value) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp202990Name500(value);
   } 

     /**
	 * 	Update SyntaxIp202990Name500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxIp202990Name500(char[] source, int sourceIndex) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp202990Name500(source, sourceIndex);
   	
   }
   
   public void setSyntaxIp202990Name500(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp202990Name500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SyntaxIp202990Name500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp202990Name500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp202990Name500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SyntaxIp202990Name500 with another Field
	 *	@param value
	 */
   public void setSyntaxIp202990Name500(Field source) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp202990Name500(source);
   }  
   
     /**
	 * 	Update SyntaxIp202990Name500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxIp202990Name500(Field source, int sourceIndex,int sourceLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp202990Name500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SyntaxIp202990Name500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp202990Name500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp202990Name500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of syntaxIp202330Name500
	 *	@return syntaxIp202330Name500
	 */
   public char[] getSyntaxIp202330Name500() throws CFException  {              
   		return syntaxPgmTableGroup500.getSyntaxPgmTable500().getSyntaxIp202330Name500();
   }

  
	/**
	*  set variable syntaxIp202330Name500
	*  @param value
	**/
   public void setSyntaxIp202330Name500(char[] value) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp202330Name500(value);
   } 

     /**
	 * 	Update SyntaxIp202330Name500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxIp202330Name500(char[] source, int sourceIndex) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp202330Name500(source, sourceIndex);
   	
   }
   
   public void setSyntaxIp202330Name500(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp202330Name500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SyntaxIp202330Name500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp202330Name500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp202330Name500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SyntaxIp202330Name500 with another Field
	 *	@param value
	 */
   public void setSyntaxIp202330Name500(Field source) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp202330Name500(source);
   }  
   
     /**
	 * 	Update SyntaxIp202330Name500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxIp202330Name500(Field source, int sourceIndex,int sourceLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp202330Name500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SyntaxIp202330Name500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp202330Name500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp202330Name500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of syntaxIp218620Name500
	 *	@return syntaxIp218620Name500
	 */
   public char[] getSyntaxIp218620Name500() throws CFException  {              
   		return syntaxPgmTableGroup500.getSyntaxPgmTable500().getSyntaxIp218620Name500();
   }

  
	/**
	*  set variable syntaxIp218620Name500
	*  @param value
	**/
   public void setSyntaxIp218620Name500(char[] value) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp218620Name500(value);
   } 

     /**
	 * 	Update SyntaxIp218620Name500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxIp218620Name500(char[] source, int sourceIndex) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp218620Name500(source, sourceIndex);
   	
   }
   
   public void setSyntaxIp218620Name500(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp218620Name500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SyntaxIp218620Name500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp218620Name500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp218620Name500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SyntaxIp218620Name500 with another Field
	 *	@param value
	 */
   public void setSyntaxIp218620Name500(Field source) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp218620Name500(source);
   }  
   
     /**
	 * 	Update SyntaxIp218620Name500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxIp218620Name500(Field source, int sourceIndex,int sourceLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp218620Name500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SyntaxIp218620Name500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp218620Name500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setSyntaxIp218620Name500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
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
        str += syntaxPgmTableGroup500.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SetProcedurePointersInCtx clone() {
        SetProcedurePointersInCtx cloneObj = new SetProcedurePointersInCtx();
        cloneObj.syntaxPgmTableGroup500 = new SyntaxPgmTableGroup500();
        cloneObj.syntaxPgmTableGroup500.set(syntaxPgmTableGroup500.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SetProcedurePointersInCtx getSetProcedurePointersInCtx() {
            return new SetProcedurePointersInCtx();
    }
     public class SetProcedurePointersOutCtx implements Cloneable {
     SyntaxPgmTableGroup500 syntaxPgmTableGroup500 = Ip200090Ctx.this.getSyntaxPgmTableGroup500();
     Work work = Ip200090Ctx.this.getWork();

	/**
	 *	Returns the value of ptrIp223190500
	 *	@return ptrIp223190500
	 */
   public char[] getPtrIp223190500() throws CFException  {              
   		return syntaxPgmTableGroup500.getSyntaxPgmTable500().getPtrIp223190500();
   }

  
	/**
	*  set variable ptrIp223190500
	*  @param value
	**/
   public void setPtrIp223190500(char[] value) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp223190500(value);
   } 

     /**
	 * 	Update PtrIp223190500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrIp223190500(char[] source, int sourceIndex) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp223190500(source, sourceIndex);
   	
   }
   
   public void setPtrIp223190500(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp223190500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PtrIp223190500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp223190500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp223190500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PtrIp223190500 with another Field
	 *	@param value
	 */
   public void setPtrIp223190500(Field source) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp223190500(source);
   }  
   
     /**
	 * 	Update PtrIp223190500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrIp223190500(Field source, int sourceIndex,int sourceLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp223190500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PtrIp223190500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp223190500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp223190500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ptrIp381120800
	 *	@return ptrIp381120800
	 */
   public char[] getPtrIp381120800() throws CFException  {              
   		return work.getPtrIp381120800();
   }

  
	/**
	*  set variable ptrIp381120800
	*  @param value
	**/
   public void setPtrIp381120800(char[] value) throws CFException {
      work.setPtrIp381120800(value);
   } 

	/**
	 *	Returns the value of ptrIp209720500
	 *	@return ptrIp209720500
	 */
   public char[] getPtrIp209720500() throws CFException  {              
   		return syntaxPgmTableGroup500.getSyntaxPgmTable500().getPtrIp209720500();
   }

  
	/**
	*  set variable ptrIp209720500
	*  @param value
	**/
   public void setPtrIp209720500(char[] value) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp209720500(value);
   } 

     /**
	 * 	Update PtrIp209720500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrIp209720500(char[] source, int sourceIndex) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp209720500(source, sourceIndex);
   	
   }
   
   public void setPtrIp209720500(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp209720500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PtrIp209720500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp209720500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp209720500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PtrIp209720500 with another Field
	 *	@param value
	 */
   public void setPtrIp209720500(Field source) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp209720500(source);
   }  
   
     /**
	 * 	Update PtrIp209720500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrIp209720500(Field source, int sourceIndex,int sourceLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp209720500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PtrIp209720500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp209720500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp209720500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ptrIp202330500
	 *	@return ptrIp202330500
	 */
   public char[] getPtrIp202330500() throws CFException  {              
   		return syntaxPgmTableGroup500.getSyntaxPgmTable500().getPtrIp202330500();
   }

  
	/**
	*  set variable ptrIp202330500
	*  @param value
	**/
   public void setPtrIp202330500(char[] value) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp202330500(value);
   } 

     /**
	 * 	Update PtrIp202330500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrIp202330500(char[] source, int sourceIndex) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp202330500(source, sourceIndex);
   	
   }
   
   public void setPtrIp202330500(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp202330500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PtrIp202330500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp202330500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp202330500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PtrIp202330500 with another Field
	 *	@param value
	 */
   public void setPtrIp202330500(Field source) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp202330500(source);
   }  
   
     /**
	 * 	Update PtrIp202330500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrIp202330500(Field source, int sourceIndex,int sourceLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp202330500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PtrIp202330500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp202330500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp202330500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ptrIp223870500
	 *	@return ptrIp223870500
	 */
   public char[] getPtrIp223870500() throws CFException  {              
   		return syntaxPgmTableGroup500.getSyntaxPgmTable500().getPtrIp223870500();
   }

  
	/**
	*  set variable ptrIp223870500
	*  @param value
	**/
   public void setPtrIp223870500(char[] value) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp223870500(value);
   } 

     /**
	 * 	Update PtrIp223870500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrIp223870500(char[] source, int sourceIndex) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp223870500(source, sourceIndex);
   	
   }
   
   public void setPtrIp223870500(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp223870500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PtrIp223870500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp223870500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp223870500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PtrIp223870500 with another Field
	 *	@param value
	 */
   public void setPtrIp223870500(Field source) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp223870500(source);
   }  
   
     /**
	 * 	Update PtrIp223870500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrIp223870500(Field source, int sourceIndex,int sourceLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp223870500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PtrIp223870500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp223870500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp223870500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ptrIp221080500
	 *	@return ptrIp221080500
	 */
   public char[] getPtrIp221080500() throws CFException  {              
   		return syntaxPgmTableGroup500.getSyntaxPgmTable500().getPtrIp221080500();
   }

  
	/**
	*  set variable ptrIp221080500
	*  @param value
	**/
   public void setPtrIp221080500(char[] value) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp221080500(value);
   } 

     /**
	 * 	Update PtrIp221080500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrIp221080500(char[] source, int sourceIndex) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp221080500(source, sourceIndex);
   	
   }
   
   public void setPtrIp221080500(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp221080500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PtrIp221080500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp221080500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp221080500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PtrIp221080500 with another Field
	 *	@param value
	 */
   public void setPtrIp221080500(Field source) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp221080500(source);
   }  
   
     /**
	 * 	Update PtrIp221080500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrIp221080500(Field source, int sourceIndex,int sourceLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp221080500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PtrIp221080500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp221080500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp221080500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ptrIp200690500
	 *	@return ptrIp200690500
	 */
   public char[] getPtrIp200690500() throws CFException  {              
   		return syntaxPgmTableGroup500.getSyntaxPgmTable500().getPtrIp200690500();
   }

  
	/**
	*  set variable ptrIp200690500
	*  @param value
	**/
   public void setPtrIp200690500(char[] value) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp200690500(value);
   } 

     /**
	 * 	Update PtrIp200690500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrIp200690500(char[] source, int sourceIndex) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp200690500(source, sourceIndex);
   	
   }
   
   public void setPtrIp200690500(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp200690500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PtrIp200690500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp200690500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp200690500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PtrIp200690500 with another Field
	 *	@param value
	 */
   public void setPtrIp200690500(Field source) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp200690500(source);
   }  
   
     /**
	 * 	Update PtrIp200690500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrIp200690500(Field source, int sourceIndex,int sourceLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp200690500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PtrIp200690500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp200690500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp200690500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ptrIp218620500
	 *	@return ptrIp218620500
	 */
   public char[] getPtrIp218620500() throws CFException  {              
   		return syntaxPgmTableGroup500.getSyntaxPgmTable500().getPtrIp218620500();
   }

  
	/**
	*  set variable ptrIp218620500
	*  @param value
	**/
   public void setPtrIp218620500(char[] value) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp218620500(value);
   } 

     /**
	 * 	Update PtrIp218620500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrIp218620500(char[] source, int sourceIndex) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp218620500(source, sourceIndex);
   	
   }
   
   public void setPtrIp218620500(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp218620500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PtrIp218620500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp218620500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp218620500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PtrIp218620500 with another Field
	 *	@param value
	 */
   public void setPtrIp218620500(Field source) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp218620500(source);
   }  
   
     /**
	 * 	Update PtrIp218620500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrIp218620500(Field source, int sourceIndex,int sourceLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp218620500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PtrIp218620500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp218620500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp218620500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ptrIp200100800
	 *	@return ptrIp200100800
	 */
   public char[] getPtrIp200100800() throws CFException  {              
   		return work.getPtrIp200100800();
   }

  
	/**
	*  set variable ptrIp200100800
	*  @param value
	**/
   public void setPtrIp200100800(char[] value) throws CFException {
      work.setPtrIp200100800(value);
   } 

	/**
	 *	Returns the value of ptrIp209700500
	 *	@return ptrIp209700500
	 */
   public char[] getPtrIp209700500() throws CFException  {              
   		return syntaxPgmTableGroup500.getSyntaxPgmTable500().getPtrIp209700500();
   }

  
	/**
	*  set variable ptrIp209700500
	*  @param value
	**/
   public void setPtrIp209700500(char[] value) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp209700500(value);
   } 

     /**
	 * 	Update PtrIp209700500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrIp209700500(char[] source, int sourceIndex) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp209700500(source, sourceIndex);
   	
   }
   
   public void setPtrIp209700500(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp209700500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PtrIp209700500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp209700500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp209700500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PtrIp209700500 with another Field
	 *	@param value
	 */
   public void setPtrIp209700500(Field source) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp209700500(source);
   }  
   
     /**
	 * 	Update PtrIp209700500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrIp209700500(Field source, int sourceIndex,int sourceLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp209700500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PtrIp209700500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp209700500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp209700500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ptrIp202990500
	 *	@return ptrIp202990500
	 */
   public char[] getPtrIp202990500() throws CFException  {              
   		return syntaxPgmTableGroup500.getSyntaxPgmTable500().getPtrIp202990500();
   }

  
	/**
	*  set variable ptrIp202990500
	*  @param value
	**/
   public void setPtrIp202990500(char[] value) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp202990500(value);
   } 

     /**
	 * 	Update PtrIp202990500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrIp202990500(char[] source, int sourceIndex) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp202990500(source, sourceIndex);
   	
   }
   
   public void setPtrIp202990500(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp202990500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PtrIp202990500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp202990500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp202990500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PtrIp202990500 with another Field
	 *	@param value
	 */
   public void setPtrIp202990500(Field source) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp202990500(source);
   }  
   
     /**
	 * 	Update PtrIp202990500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrIp202990500(Field source, int sourceIndex,int sourceLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp202990500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PtrIp202990500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp202990500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp202990500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += syntaxPgmTableGroup500.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SetProcedurePointersOutCtx clone() {
        SetProcedurePointersOutCtx cloneObj = new SetProcedurePointersOutCtx();
        cloneObj.syntaxPgmTableGroup500 = new SyntaxPgmTableGroup500();
        cloneObj.syntaxPgmTableGroup500.set(syntaxPgmTableGroup500.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SetProcedurePointersOutCtx getSetProcedurePointersOutCtx() {
            return new SetProcedurePointersOutCtx();
    }
     public class InitializeVariablesOutCtx implements Cloneable {
     Work work = Ip200090Ctx.this.getWork();
     AdditionalSyntaxChecksGroup100 additionalSyntaxChecksGroup100 = Ip200090Ctx.this.getAdditionalSyntaxChecksGroup100();

	/**
	 *	Test condition "N" for isCandidateAbsent88100()
	 *	@return  Returns true if isCandidateAbsent88100() is "N"
	 */
   public boolean isCandidateAbsent88100() throws CFException {
      return work.isCandidateAbsent88100();
   }

	/**
	*  set values "N"
	*/
   	public void setCandidateAbsent88100True()  throws CFException{  			
    	work.setCandidateAbsent88100True();
   	}
	/**
	 *	Test condition "N" for isSubfldCheckNotOver88100()
	 *	@return  Returns true if isSubfldCheckNotOver88100() is "N"
	 */
   public boolean isSubfldCheckNotOver88100() throws CFException {
      return work.isSubfldCheckNotOver88100();
   }

	/**
	*  set values "N"
	*/
   	public void setSubfldCheckNotOver88100True()  throws CFException{  			
    	work.setSubfldCheckNotOver88100True();
   	}
	/**
	 *	Test condition "0" "1" "M" for isNoAdditionalChecks88100()
	 *	@return  Returns true if isNoAdditionalChecks88100() is "0" "1" "M"
	 */
   public boolean isNoAdditionalChecks88100() throws CFException {
      return additionalSyntaxChecksGroup100.isNoAdditionalChecks88100();
   }

	/**
	*  set values "0" "1" "M"
	*/
   	public void setNoAdditionalChecks88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setNoAdditionalChecks88100True();
   	}

        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
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
        str += additionalSyntaxChecksGroup100.hashCode();
       return str.hashCode();
    }

    public InitializeVariablesOutCtx clone() {
        InitializeVariablesOutCtx cloneObj = new InitializeVariablesOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.additionalSyntaxChecksGroup100 = new AdditionalSyntaxChecksGroup100();
        cloneObj.additionalSyntaxChecksGroup100.set(additionalSyntaxChecksGroup100.getClonedField());
        return cloneObj;
    }

    }

    public InitializeVariablesOutCtx getInitializeVariablesOutCtx() {
            return new InitializeVariablesOutCtx();
    }
     public class ChooseEditProgramInCtx implements Cloneable {
     EditType23InfoTableGroup500 editType23InfoTableGroup500 = Ip200090Ctx.this.getEditType23InfoTableGroup500();
     Ip90134TableEntry ip90134TableEntry = Ip200090Ctx.this.getIp90134TableEntry();
     Ip00702CaStringGroup ip00702CaStringGroup = Ip200090Ctx.this.getIp00702CaStringGroup();
     IsSoftSyntaxAppliedGroup100 isSoftSyntaxAppliedGroup100 = Ip200090Ctx.this.getIsSoftSyntaxAppliedGroup100();
     BslIdGroup800 bslIdGroup800 = Ip200090Ctx.this.getBslIdGroup800();
     Work work = Ip200090Ctx.this.getWork();
     Ip00702CaTable ip00702CaTable = Ip200090Ctx.this.getIp00702CaTable();
     EditNumGroup800 editNumGroup800 = Ip200090Ctx.this.getEditNumGroup800();
     Ip90134EntryFoundGroup800 ip90134EntryFoundGroup800 = Ip200090Ctx.this.getIp90134EntryFoundGroup800();
     Ip00321EditListRec ip00321EditListRec = Ip200090Ctx.this.getIp00321EditListRec();

	/**
	 *	Returns the value of ip00702CaStringGroup
	 *	@return ip00702CaStringGroup
	 */   
	 public Ip00702CaStringGroup getIp00702CaStringGroup() {
   	return ip00702CaStringGroup;
   }


	/**
	 *	Test condition "N" for isIp90134EntryFoundN88800()
	 *	@return  Returns true if isIp90134EntryFoundN88800() is "N"
	 */
   public boolean isIp90134EntryFoundN88800() throws CFException {
      return ip90134EntryFoundGroup800.isIp90134EntryFoundN88800();
   }

	/**
	*  set values "N"
	*/
   	public void setIp90134EntryFoundN88800True()  throws CFException{  			
    	ip90134EntryFoundGroup800.setIp90134EntryFoundN88800True();
   	}
	/**
	 *	Returns the value of value1441300
	 *	@return value1441300
	 */
	public short getValue1441300() throws CFException {
   		return work.getValue1441300();
	}

    /**
	 *	Returns the String value of value1441300
	 *	@return value1441300
	 */
	public char[]  getValue1441300ActualString() {
		return work.getValue1441300ActualString();
	}

	/**
	 *	Returns String value of value1441300
	 *	@return value1441300
	 */
	public char[]  getValue1441300String() throws CFException {
	     return String.valueOf(work.getValue1441300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1441300IsNumeric()  throws CFException{
	    return work.value1441300IsNumeric();
	}

	/**
	 * 	Update Value1441300 with the passed value
	 *	@param number
	 */
	public void setValue1441300(short number)  throws CFException{
		work.setValue1441300(number);
	}
	
	public void setValue1441300(int number)  throws CFException{
	    work.setValue1441300(number);
	}
	public void setValue1441300(long number)  throws CFException{
	    work.setValue1441300(number);
	}
	

	
	/**
	 * 	Update Value1441300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1441300(char[] value)  throws CFException {
		work.setValue1441300(value);
	}
	
	/**
	 * 	Update Value1441300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1441300String(char[] value)  throws CFException{
		work.setValue1441300(value);
	}	

	/**
	 *	Returns the value of bslIdGroup800
	 *	@return bslIdGroup800
	 */   
	 public BslIdGroup800 getBslIdGroup800() {
   	return bslIdGroup800;
   }


	/**
	 *	Test condition "Y" for isSoftSyntaxAppliedY88100()
	 *	@return  Returns true if isSoftSyntaxAppliedY88100() is "Y"
	 */
   public boolean isSoftSyntaxAppliedY88100() throws CFException {
      return isSoftSyntaxAppliedGroup100.isSoftSyntaxAppliedY88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setSoftSyntaxAppliedY88100True()  throws CFException{  			
    	isSoftSyntaxAppliedGroup100.setSoftSyntaxAppliedY88100True();
   	}

public void setSyntaxIdx500(int syntaxIdx500) { 
    Ip200090Ctx.this.syntaxIdx500 = syntaxIdx500;
}

public int getSyntaxIdx500() { 
    return Ip200090Ctx.this.syntaxIdx500;
}
	/**
	 *	Returns the value of ip00702CaString
	 *	@return ip00702CaString
	 */
   public char[] getIp00702CaString() throws CFException  {              
   		return ip00702CaStringGroup.getIp00702CaString();
   }

  
	/**
	*  set variable ip00702CaString
	*  @param value
	**/
   public void setIp00702CaString(char[] value) throws CFException {
      ip00702CaStringGroup.setIp00702CaString(value);
   } 

     /**
	 * 	Update Ip00702CaString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00702CaString(char[] source, int sourceIndex) throws CFException {
      ip00702CaStringGroup.setIp00702CaString(source, sourceIndex);
   	
   }
   
   public void setIp00702CaString(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00702CaStringGroup.setIp00702CaString(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00702CaString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00702CaString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00702CaStringGroup.setIp00702CaString(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00702CaString with another Field
	 *	@param value
	 */
   public void setIp00702CaString(Field source) {
      ip00702CaStringGroup.setIp00702CaString(source);
   }  
   
     /**
	 * 	Update Ip00702CaString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00702CaString(Field source, int sourceIndex,int sourceLen) {
      ip00702CaStringGroup.setIp00702CaString(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00702CaString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00702CaString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00702CaStringGroup.setIp00702CaString(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ptrIp200100800
	 *	@return ptrIp200100800
	 */
   public char[] getPtrIp200100800() throws CFException  {              
   		return work.getPtrIp200100800();
   }

  
	/**
	*  set variable ptrIp200100800
	*  @param value
	**/
   public void setPtrIp200100800(char[] value) throws CFException {
      work.setPtrIp200100800(value);
   } 

	/**
	 *	Returns the value of value1813300
	 *	@return value1813300
	 */
	public short getValue1813300() throws CFException {
   		return work.getValue1813300();
	}

    /**
	 *	Returns the String value of value1813300
	 *	@return value1813300
	 */
	public char[]  getValue1813300ActualString() {
		return work.getValue1813300ActualString();
	}

	/**
	 *	Returns String value of value1813300
	 *	@return value1813300
	 */
	public char[]  getValue1813300String() throws CFException {
	     return String.valueOf(work.getValue1813300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1813300IsNumeric()  throws CFException{
	    return work.value1813300IsNumeric();
	}

	/**
	 * 	Update Value1813300 with the passed value
	 *	@param number
	 */
	public void setValue1813300(short number)  throws CFException{
		work.setValue1813300(number);
	}
	
	public void setValue1813300(int number)  throws CFException{
	    work.setValue1813300(number);
	}
	public void setValue1813300(long number)  throws CFException{
	    work.setValue1813300(number);
	}
	

	
	/**
	 * 	Update Value1813300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1813300(char[] value)  throws CFException {
		work.setValue1813300(value);
	}
	
	/**
	 * 	Update Value1813300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1813300String(char[] value)  throws CFException{
		work.setValue1813300(value);
	}	

	/**
	 *	Returns the value of ip00702CaStart
	 *	@return ip00702CaStart
	 */
	public short getIp00702CaStart(int index) throws CFException {        
   		return ip00702CaTable.getIp00702CaEntry(index).getIp00702CaStart();
	}
	
	/**
	 * 	Update Ip00702CaStart with the passed value
	 *	@param number
	 */
	public void setIp00702CaStart(int index,short number)  throws CFException{
		ip00702CaTable.getIp00702CaEntry(index).setIp00702CaStart(number);
	}

	public void setIp00702CaStart(int index,int number)  throws CFException{
		ip00702CaTable.getIp00702CaEntry(index).setIp00702CaStart((short)number);
	}

	public void setIp00702CaStart(int index,long number)  throws CFException{
		ip00702CaTable.getIp00702CaEntry(index).setIp00702CaStart((short)number);
	}



	/**
	 *	Returns the value of valueY300
	 *	@return valueY300
	 */
   public char[] getValueY300() throws CFException  {              
   		return work.getValueY300();
   }

  
	/**
	*  set variable valueY300
	*  @param value
	**/
   public void setValueY300(char[] value) throws CFException {
      work.setValueY300(value);
   } 

	/**
	 *	Test condition "4484001" for isMexBsa88800()
	 *	@return  Returns true if isMexBsa88800() is "4484001"
	 */
   public boolean isMexBsa88800() throws CFException {
      return bslIdGroup800.isMexBsa88800();
   }

	/**
	*  set values "4484001"
	*/
   	public void setMexBsa88800True()  throws CFException{  			
    	bslIdGroup800.setMexBsa88800True();
   	}
	/**
	 *	Returns the value of ip00702CaLength
	 *	@return ip00702CaLength
	 */
	public short getIp00702CaLength(int index) throws CFException {        
   		return ip00702CaTable.getIp00702CaEntry(index).getIp00702CaLength();
	}
	
	/**
	 * 	Update Ip00702CaLength with the passed value
	 *	@param number
	 */
	public void setIp00702CaLength(int index,short number)  throws CFException{
		ip00702CaTable.getIp00702CaEntry(index).setIp00702CaLength(number);
	}

	public void setIp00702CaLength(int index,int number)  throws CFException{
		ip00702CaTable.getIp00702CaEntry(index).setIp00702CaLength((short)number);
	}

	public void setIp00702CaLength(int index,long number)  throws CFException{
		ip00702CaTable.getIp00702CaEntry(index).setIp00702CaLength((short)number);
	}



	/**
	 *	Test condition "Y" for isFieldMustBePresent88500()
	 *	@return  Returns true if isFieldMustBePresent88500() is "Y"
	 */
   public boolean isFieldMustBePresent88500(int index) throws CFException {
      return editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).isFieldMustBePresent88500();
   }

	/**
	*  set values "Y"
	*/
   	public void setFieldMustBePresent88500True(int index)  throws CFException{  			
    	editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setFieldMustBePresent88500True();
   	}
	/**
	 *	Returns the value of value1811300
	 *	@return value1811300
	 */
	public short getValue1811300() throws CFException {
   		return work.getValue1811300();
	}

    /**
	 *	Returns the String value of value1811300
	 *	@return value1811300
	 */
	public char[]  getValue1811300ActualString() {
		return work.getValue1811300ActualString();
	}

	/**
	 *	Returns String value of value1811300
	 *	@return value1811300
	 */
	public char[]  getValue1811300String() throws CFException {
	     return String.valueOf(work.getValue1811300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1811300IsNumeric()  throws CFException{
	    return work.value1811300IsNumeric();
	}

	/**
	 * 	Update Value1811300 with the passed value
	 *	@param number
	 */
	public void setValue1811300(short number)  throws CFException{
		work.setValue1811300(number);
	}
	
	public void setValue1811300(int number)  throws CFException{
	    work.setValue1811300(number);
	}
	public void setValue1811300(long number)  throws CFException{
	    work.setValue1811300(number);
	}
	

	
	/**
	 * 	Update Value1811300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1811300(char[] value)  throws CFException {
		work.setValue1811300(value);
	}
	
	/**
	 * 	Update Value1811300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1811300String(char[] value)  throws CFException{
		work.setValue1811300(value);
	}	

	/**
	 *	Test condition "Y" for isCandidatePresent88100()
	 *	@return  Returns true if isCandidatePresent88100() is "Y"
	 */
   public boolean isCandidatePresent88100() throws CFException {
      return work.isCandidatePresent88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setCandidatePresent88100True()  throws CFException{  			
    	work.setCandidatePresent88100True();
   	}
	/**
	 *	Returns the value of ip00321EditNbr
	 *	@return ip00321EditNbr
	 */
	public long getIp00321EditNbr() throws CFException {        
   		return ip00321EditListRec.getIp00321EditNbr();
	}
	
	/**
	 * 	Update Ip00321EditNbr with the passed value
	 *	@param number
	 */
	public void setIp00321EditNbr(long number)  throws CFException{
		ip00321EditListRec.setIp00321EditNbr(number);
	}




        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
        }

        public ChooseEditProgramOutCtx getChooseEditProgramOutCtx() {
            return new ChooseEditProgramOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += editType23InfoTableGroup500.hashCode();
        str += ip90134TableEntry.hashCode();
        str += ip00702CaStringGroup.hashCode();
        str += isSoftSyntaxAppliedGroup100.hashCode();
        str += bslIdGroup800.hashCode();
        str += work.hashCode();
        str += ip00702CaTable.hashCode();
        str += editNumGroup800.hashCode();
        str += ip90134EntryFoundGroup800.hashCode();
        str += ip00321EditListRec.hashCode();
       return str.hashCode();
    }

    public ChooseEditProgramInCtx clone() {
        ChooseEditProgramInCtx cloneObj = new ChooseEditProgramInCtx();
        cloneObj.editType23InfoTableGroup500 = new EditType23InfoTableGroup500();
        cloneObj.editType23InfoTableGroup500.set(editType23InfoTableGroup500.getClonedField());
        cloneObj.ip90134TableEntry = new Ip90134TableEntry();
        cloneObj.ip90134TableEntry.set(ip90134TableEntry.getClonedField());
        cloneObj.ip00702CaStringGroup = new Ip00702CaStringGroup();
        cloneObj.ip00702CaStringGroup.set(ip00702CaStringGroup.getClonedField());
        cloneObj.isSoftSyntaxAppliedGroup100 = new IsSoftSyntaxAppliedGroup100();
        cloneObj.isSoftSyntaxAppliedGroup100.set(isSoftSyntaxAppliedGroup100.getClonedField());
        cloneObj.bslIdGroup800 = new BslIdGroup800();
        cloneObj.bslIdGroup800.set(bslIdGroup800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip00702CaTable = new Ip00702CaTable();
        cloneObj.ip00702CaTable.set(ip00702CaTable.getClonedField());
        cloneObj.editNumGroup800 = new EditNumGroup800();
        cloneObj.editNumGroup800.set(editNumGroup800.getClonedField());
        cloneObj.ip90134EntryFoundGroup800 = new Ip90134EntryFoundGroup800();
        cloneObj.ip90134EntryFoundGroup800.set(ip90134EntryFoundGroup800.getClonedField());
        cloneObj.ip00321EditListRec = new Ip00321EditListRec();
        cloneObj.ip00321EditListRec.set(ip00321EditListRec.getClonedField());
        return cloneObj;
    }

    }

    public ChooseEditProgramInCtx getChooseEditProgramInCtx() {
            return new ChooseEditProgramInCtx();
    }
     public class ChooseEditProgramOutCtx implements Cloneable {
     Ip90134TableEntry ip90134TableEntry = Ip200090Ctx.this.getIp90134TableEntry();
     EditType23InfoTableGroup500 editType23InfoTableGroup500 = Ip200090Ctx.this.getEditType23InfoTableGroup500();
     Ip00702CaStringGroup ip00702CaStringGroup = Ip200090Ctx.this.getIp00702CaStringGroup();
     IsSoftSyntaxAppliedGroup100 isSoftSyntaxAppliedGroup100 = Ip200090Ctx.this.getIsSoftSyntaxAppliedGroup100();
     BslIdGroup800 bslIdGroup800 = Ip200090Ctx.this.getBslIdGroup800();
     Work work = Ip200090Ctx.this.getWork();
     Ip00702CaTable ip00702CaTable = Ip200090Ctx.this.getIp00702CaTable();
     EditNumGroup800 editNumGroup800 = Ip200090Ctx.this.getEditNumGroup800();
     Ip00321EditListRec ip00321EditListRec = Ip200090Ctx.this.getIp00321EditListRec();
     Ip90134EntryFoundGroup800 ip90134EntryFoundGroup800 = Ip200090Ctx.this.getIp90134EntryFoundGroup800();

	/**
	 *	Returns the value of ip90134ElementNum
	 *	@return ip90134ElementNum
	 */
	public int getIp90134ElementNum() throws CFException {
   		return ip90134TableEntry.getIp90134EditGroupKey().getIp90134ElementNum();
	}


	/**
	 *	Returns String value of ip90134ElementNum
	 *	@return ip90134ElementNum
	 */
	public char[]  getIp90134ElementNumString() throws CFException {
	     return String.valueOf(ip90134TableEntry.getIp90134EditGroupKey().getIp90134ElementNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip90134ElementNumIsNumeric()  throws CFException{
	    return ip90134TableEntry.getIp90134EditGroupKey().ip90134ElementNumIsNumeric();
	}

	/**
	 * 	Update Ip90134ElementNum with the passed value
	 *	@param number
	 */
	public void setIp90134ElementNum(int number)  throws CFException{
		ip90134TableEntry.getIp90134EditGroupKey().setIp90134ElementNum(number);
	}
	

	public void setIp90134ElementNum(long number)  throws CFException{
	    ip90134TableEntry.getIp90134EditGroupKey().setIp90134ElementNum(number);
	}
	
	
	/**
	 * 	Update Ip90134ElementNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp90134ElementNum(char[] value)  throws CFException {
		ip90134TableEntry.getIp90134EditGroupKey().setIp90134ElementNum(value);
	}
	
	/**
	 * 	Update Ip90134ElementNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp90134ElementNumString(char[] value)  throws CFException{
		ip90134TableEntry.getIp90134EditGroupKey().setIp90134ElementNum(value);
	}	

	/**
	 *	Returns the value of editNumR800
	 *	@return editNumR800
	 */   
	 public EditNumR800 getEditNumR800() {
   	return editNumGroup800.getEditNumR800();
   }

   /**
	* 	Update EditNumR800 with the passed value
	*	@param value
	*/
   public void setEditNumR800(char[] value) throws CFException {
      editNumGroup800.setEditNumR800(value);
   }   

     /**
	 * 	Update EditNumR800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setEditNumR800(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	editNumGroup800.setEditNumR800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EditNumR800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEditNumR800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	editNumGroup800.setEditNumR800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EditNumR800 with another Field
	 *	@param value
	 */
   public void setEditNumR800(Field source) {
   	editNumGroup800.setEditNumR800(source);
   }  
   
     /**
	 * 	Update EditNumR800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setEditNumR800(Field source, int sourceIndex,int sourceLen) {
   	editNumGroup800.setEditNumR800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EditNumR800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEditNumR800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	editNumGroup800.setEditNumR800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setSyntaxIdx500(int syntaxIdx500) { 
    Ip200090Ctx.this.syntaxIdx500 = syntaxIdx500;
}

public int getSyntaxIdx500() { 
    return Ip200090Ctx.this.syntaxIdx500;
}
	/**
	 *	Returns the value of ip90134EditNumber
	 *	@return ip90134EditNumber
	 */
	public int getIp90134EditNumber() throws CFException {
   		return ip90134TableEntry.getIp90134EditGroupKey().getIp90134EditNumber();
	}


	/**
	 *	Returns String value of ip90134EditNumber
	 *	@return ip90134EditNumber
	 */
	public char[]  getIp90134EditNumberString() throws CFException {
	     return String.valueOf(ip90134TableEntry.getIp90134EditGroupKey().getIp90134EditNumberString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip90134EditNumberIsNumeric()  throws CFException{
	    return ip90134TableEntry.getIp90134EditGroupKey().ip90134EditNumberIsNumeric();
	}

	/**
	 * 	Update Ip90134EditNumber with the passed value
	 *	@param number
	 */
	public void setIp90134EditNumber(int number)  throws CFException{
		ip90134TableEntry.getIp90134EditGroupKey().setIp90134EditNumber(number);
	}
	

	public void setIp90134EditNumber(long number)  throws CFException{
	    ip90134TableEntry.getIp90134EditGroupKey().setIp90134EditNumber(number);
	}
	
	
	/**
	 * 	Update Ip90134EditNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp90134EditNumber(char[] value)  throws CFException {
		ip90134TableEntry.getIp90134EditGroupKey().setIp90134EditNumber(value);
	}
	
	/**
	 * 	Update Ip90134EditNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp90134EditNumberString(char[] value)  throws CFException{
		ip90134TableEntry.getIp90134EditGroupKey().setIp90134EditNumber(value);
	}	

	/**
	 *	Returns the value of ip00702CaString
	 *	@return ip00702CaString
	 */
   public char[] getIp00702CaString() throws CFException  {              
   		return ip00702CaStringGroup.getIp00702CaString();
   }

  
	/**
	*  set variable ip00702CaString
	*  @param value
	**/
   public void setIp00702CaString(char[] value) throws CFException {
      ip00702CaStringGroup.setIp00702CaString(value);
   } 

     /**
	 * 	Update Ip00702CaString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00702CaString(char[] source, int sourceIndex) throws CFException {
      ip00702CaStringGroup.setIp00702CaString(source, sourceIndex);
   	
   }
   
   public void setIp00702CaString(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00702CaStringGroup.setIp00702CaString(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00702CaString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00702CaString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00702CaStringGroup.setIp00702CaString(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00702CaString with another Field
	 *	@param value
	 */
   public void setIp00702CaString(Field source) {
      ip00702CaStringGroup.setIp00702CaString(source);
   }  
   
     /**
	 * 	Update Ip00702CaString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00702CaString(Field source, int sourceIndex,int sourceLen) {
      ip00702CaStringGroup.setIp00702CaString(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00702CaString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00702CaString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00702CaStringGroup.setIp00702CaString(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bsid800
	 *	@return bsid800
	 */
   public char[] getBsid800() throws CFException  {              
   		return bslIdGroup800.getBslId800().getBsid800();
   }

  
	/**
	*  set variable bsid800
	*  @param value
	**/
   public void setBsid800(char[] value) throws CFException {
      bslIdGroup800.getBslId800().setBsid800(value);
   } 

     /**
	 * 	Update Bsid800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBsid800(char[] source, int sourceIndex) throws CFException {
      bslIdGroup800.getBslId800().setBsid800(source, sourceIndex);
   	
   }
   
   public void setBsid800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bslIdGroup800.getBslId800().setBsid800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bsid800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBsid800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bslIdGroup800.getBslId800().setBsid800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bsid800 with another Field
	 *	@param value
	 */
   public void setBsid800(Field source) {
      bslIdGroup800.getBslId800().setBsid800(source);
   }  
   
     /**
	 * 	Update Bsid800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBsid800(Field source, int sourceIndex,int sourceLen) {
      bslIdGroup800.getBslId800().setBsid800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bsid800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBsid800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bslIdGroup800.getBslId800().setBsid800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bsl800
	 *	@return bsl800
	 */
   public char[] getBsl800() throws CFException  {              
   		return bslIdGroup800.getBslId800().getBsl800();
   }

  
	/**
	*  set variable bsl800
	*  @param value
	**/
   public void setBsl800(char[] value) throws CFException {
      bslIdGroup800.getBslId800().setBsl800(value);
   } 

     /**
	 * 	Update Bsl800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBsl800(char[] source, int sourceIndex) throws CFException {
      bslIdGroup800.getBslId800().setBsl800(source, sourceIndex);
   	
   }
   
   public void setBsl800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bslIdGroup800.getBslId800().setBsl800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bsl800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBsl800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bslIdGroup800.getBslId800().setBsl800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bsl800 with another Field
	 *	@param value
	 */
   public void setBsl800(Field source) {
      bslIdGroup800.getBslId800().setBsl800(source);
   }  
   
     /**
	 * 	Update Bsl800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBsl800(Field source, int sourceIndex,int sourceLen) {
      bslIdGroup800.getBslId800().setBsl800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bsl800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBsl800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bslIdGroup800.getBslId800().setBsl800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip90134AccBrand
	 *	@return ip90134AccBrand
	 */
   public char[] getIp90134AccBrand() throws CFException  {              
   		return ip90134TableEntry.getIp90134EditGroupKey().getIp90134AccBrand();
   }

  
	/**
	*  set variable ip90134AccBrand
	*  @param value
	**/
   public void setIp90134AccBrand(char[] value) throws CFException {
      ip90134TableEntry.getIp90134EditGroupKey().setIp90134AccBrand(value);
   } 

     /**
	 * 	Update Ip90134AccBrand 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp90134AccBrand(char[] source, int sourceIndex) throws CFException {
      ip90134TableEntry.getIp90134EditGroupKey().setIp90134AccBrand(source, sourceIndex);
   	
   }
   
   public void setIp90134AccBrand(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip90134TableEntry.getIp90134EditGroupKey().setIp90134AccBrand(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip90134AccBrand 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp90134AccBrand(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip90134TableEntry.getIp90134EditGroupKey().setIp90134AccBrand(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip90134AccBrand with another Field
	 *	@param value
	 */
   public void setIp90134AccBrand(Field source) {
      ip90134TableEntry.getIp90134EditGroupKey().setIp90134AccBrand(source);
   }  
   
     /**
	 * 	Update Ip90134AccBrand 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp90134AccBrand(Field source, int sourceIndex,int sourceLen) {
      ip90134TableEntry.getIp90134EditGroupKey().setIp90134AccBrand(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip90134AccBrand 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp90134AccBrand(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip90134TableEntry.getIp90134EditGroupKey().setIp90134AccBrand(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00702CaStart
	 *	@return ip00702CaStart
	 */
	public short getIp00702CaStart(int index) throws CFException {        
   		return ip00702CaTable.getIp00702CaEntry(index).getIp00702CaStart();
	}
	
	/**
	 * 	Update Ip00702CaStart with the passed value
	 *	@param number
	 */
	public void setIp00702CaStart(int index,short number)  throws CFException{
		ip00702CaTable.getIp00702CaEntry(index).setIp00702CaStart(number);
	}

	public void setIp00702CaStart(int index,int number)  throws CFException{
		ip00702CaTable.getIp00702CaEntry(index).setIp00702CaStart((short)number);
	}

	public void setIp00702CaStart(int index,long number)  throws CFException{
		ip00702CaTable.getIp00702CaEntry(index).setIp00702CaStart((short)number);
	}



	/**
	 *	Returns the value of editValue800
	 *	@return editValue800
	 */
	public int getEditValue800() throws CFException {
   		return editNumGroup800.getEditNumR800().getEditValue800();
	}


	/**
	 *	Returns String value of editValue800
	 *	@return editValue800
	 */
	public char[]  getEditValue800String() throws CFException {
	     return String.valueOf(editNumGroup800.getEditNumR800().getEditValue800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean editValue800IsNumeric()  throws CFException{
	    return editNumGroup800.getEditNumR800().editValue800IsNumeric();
	}

	/**
	 * 	Update EditValue800 with the passed value
	 *	@param number
	 */
	public void setEditValue800(int number)  throws CFException{
		editNumGroup800.getEditNumR800().setEditValue800(number);
	}
	

	public void setEditValue800(long number)  throws CFException{
	    editNumGroup800.getEditNumR800().setEditValue800(number);
	}
	
	
	/**
	 * 	Update EditValue800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEditValue800(char[] value)  throws CFException {
		editNumGroup800.getEditNumR800().setEditValue800(value);
	}
	
	/**
	 * 	Update EditValue800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEditValue800String(char[] value)  throws CFException{
		editNumGroup800.getEditNumR800().setEditValue800(value);
	}	

	/**
	 *	Returns the value of editNum800
	 *	@return editNum800
	 */
	public long getEditNum800() throws CFException {
   		return editNumGroup800.getEditNum800();
	}


	/**
	 *	Returns String value of editNum800
	 *	@return editNum800
	 */
	public char[]  getEditNum800String() throws CFException {
	     return String.valueOf(editNumGroup800.getEditNum800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean editNum800IsNumeric()  throws CFException{
	    return editNumGroup800.editNum800IsNumeric();
	}

	/**
	 * 	Update EditNum800 with the passed value
	 *	@param number
	 */
	public void setEditNum800(long number)  throws CFException{
		editNumGroup800.setEditNum800(number);
	}
	

	
	/**
	 * 	Update EditNum800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEditNum800(char[] value)  throws CFException {
		editNumGroup800.setEditNum800(value);
	}
	
	/**
	 * 	Update EditNum800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEditNum800String(char[] value)  throws CFException{
		editNumGroup800.setEditNum800(value);
	}	

	/**
	 *	Returns the value of ip90134ElementType
	 *	@return ip90134ElementType
	 */
	public int getIp90134ElementType() throws CFException {
   		return ip90134TableEntry.getIp90134EditGroupKey().getIp90134ElementType();
	}


	/**
	 *	Returns String value of ip90134ElementType
	 *	@return ip90134ElementType
	 */
	public char[]  getIp90134ElementTypeString() throws CFException {
	     return String.valueOf(ip90134TableEntry.getIp90134EditGroupKey().getIp90134ElementTypeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip90134ElementTypeIsNumeric()  throws CFException{
	    return ip90134TableEntry.getIp90134EditGroupKey().ip90134ElementTypeIsNumeric();
	}

	/**
	 * 	Update Ip90134ElementType with the passed value
	 *	@param number
	 */
	public void setIp90134ElementType(int number)  throws CFException{
		ip90134TableEntry.getIp90134EditGroupKey().setIp90134ElementType(number);
	}
	

	public void setIp90134ElementType(long number)  throws CFException{
	    ip90134TableEntry.getIp90134EditGroupKey().setIp90134ElementType(number);
	}
	
	
	/**
	 * 	Update Ip90134ElementType with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp90134ElementType(char[] value)  throws CFException {
		ip90134TableEntry.getIp90134EditGroupKey().setIp90134ElementType(value);
	}
	
	/**
	 * 	Update Ip90134ElementType with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp90134ElementTypeString(char[] value)  throws CFException{
		ip90134TableEntry.getIp90134EditGroupKey().setIp90134ElementType(value);
	}	

	/**
	 *	Returns the value of ip90134ElementSubNum
	 *	@return ip90134ElementSubNum
	 */
	public int getIp90134ElementSubNum() throws CFException {
   		return ip90134TableEntry.getIp90134EditGroupKey().getIp90134ElementSubNum();
	}


	/**
	 *	Returns String value of ip90134ElementSubNum
	 *	@return ip90134ElementSubNum
	 */
	public char[]  getIp90134ElementSubNumString() throws CFException {
	     return String.valueOf(ip90134TableEntry.getIp90134EditGroupKey().getIp90134ElementSubNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip90134ElementSubNumIsNumeric()  throws CFException{
	    return ip90134TableEntry.getIp90134EditGroupKey().ip90134ElementSubNumIsNumeric();
	}

	/**
	 * 	Update Ip90134ElementSubNum with the passed value
	 *	@param number
	 */
	public void setIp90134ElementSubNum(int number)  throws CFException{
		ip90134TableEntry.getIp90134EditGroupKey().setIp90134ElementSubNum(number);
	}
	

	public void setIp90134ElementSubNum(long number)  throws CFException{
	    ip90134TableEntry.getIp90134EditGroupKey().setIp90134ElementSubNum(number);
	}
	
	
	/**
	 * 	Update Ip90134ElementSubNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp90134ElementSubNum(char[] value)  throws CFException {
		ip90134TableEntry.getIp90134EditGroupKey().setIp90134ElementSubNum(value);
	}
	
	/**
	 * 	Update Ip90134ElementSubNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp90134ElementSubNumString(char[] value)  throws CFException{
		ip90134TableEntry.getIp90134EditGroupKey().setIp90134ElementSubNum(value);
	}	

	/**
	 *	Returns the value of bslId800
	 *	@return bslId800
	 */   
	 public BslId800 getBslId800() {
   	return bslIdGroup800.getBslId800();
   }

   /**
	* 	Update BslId800 with the passed value
	*	@param value
	*/
   public void setBslId800(char[] value) throws CFException {
      bslIdGroup800.setBslId800(value);
   }   

     /**
	 * 	Update BslId800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBslId800(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	bslIdGroup800.setBslId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BslId800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBslId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	bslIdGroup800.setBslId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BslId800 with another Field
	 *	@param value
	 */
   public void setBslId800(Field source) {
   	bslIdGroup800.setBslId800(source);
   }  
   
     /**
	 * 	Update BslId800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBslId800(Field source, int sourceIndex,int sourceLen) {
   	bslIdGroup800.setBslId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BslId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBslId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	bslIdGroup800.setBslId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00702CaLength
	 *	@return ip00702CaLength
	 */
	public short getIp00702CaLength(int index) throws CFException {        
   		return ip00702CaTable.getIp00702CaEntry(index).getIp00702CaLength();
	}
	
	/**
	 * 	Update Ip00702CaLength with the passed value
	 *	@param number
	 */
	public void setIp00702CaLength(int index,short number)  throws CFException{
		ip00702CaTable.getIp00702CaEntry(index).setIp00702CaLength(number);
	}

	public void setIp00702CaLength(int index,int number)  throws CFException{
		ip00702CaTable.getIp00702CaEntry(index).setIp00702CaLength((short)number);
	}

	public void setIp00702CaLength(int index,long number)  throws CFException{
		ip00702CaTable.getIp00702CaEntry(index).setIp00702CaLength((short)number);
	}



	/**
	 *	Returns the value of ip90134EditGroup
	 *	@return ip90134EditGroup
	 */
   public char[] getIp90134EditGroup() throws CFException  {              
   		return ip90134TableEntry.getIp90134EditGroupKey().getIp90134EditGroup();
   }

  
	/**
	*  set variable ip90134EditGroup
	*  @param value
	**/
   public void setIp90134EditGroup(char[] value) throws CFException {
      ip90134TableEntry.getIp90134EditGroupKey().setIp90134EditGroup(value);
   } 

     /**
	 * 	Update Ip90134EditGroup 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp90134EditGroup(char[] source, int sourceIndex) throws CFException {
      ip90134TableEntry.getIp90134EditGroupKey().setIp90134EditGroup(source, sourceIndex);
   	
   }
   
   public void setIp90134EditGroup(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip90134TableEntry.getIp90134EditGroupKey().setIp90134EditGroup(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip90134EditGroup 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp90134EditGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip90134TableEntry.getIp90134EditGroupKey().setIp90134EditGroup(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip90134EditGroup with another Field
	 *	@param value
	 */
   public void setIp90134EditGroup(Field source) {
      ip90134TableEntry.getIp90134EditGroupKey().setIp90134EditGroup(source);
   }  
   
     /**
	 * 	Update Ip90134EditGroup 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp90134EditGroup(Field source, int sourceIndex,int sourceLen) {
      ip90134TableEntry.getIp90134EditGroupKey().setIp90134EditGroup(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip90134EditGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp90134EditGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip90134TableEntry.getIp90134EditGroupKey().setIp90134EditGroup(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00321EditNbr
	 *	@return ip00321EditNbr
	 */
	public long getIp00321EditNbr() throws CFException {        
   		return ip00321EditListRec.getIp00321EditNbr();
	}
	
	/**
	 * 	Update Ip00321EditNbr with the passed value
	 *	@param number
	 */
	public void setIp00321EditNbr(long number)  throws CFException{
		ip00321EditListRec.setIp00321EditNbr(number);
	}




        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip90134TableEntry.hashCode();
        str += editType23InfoTableGroup500.hashCode();
        str += ip00702CaStringGroup.hashCode();
        str += isSoftSyntaxAppliedGroup100.hashCode();
        str += bslIdGroup800.hashCode();
        str += work.hashCode();
        str += ip00702CaTable.hashCode();
        str += editNumGroup800.hashCode();
        str += ip00321EditListRec.hashCode();
        str += ip90134EntryFoundGroup800.hashCode();
       return str.hashCode();
    }

    public ChooseEditProgramOutCtx clone() {
        ChooseEditProgramOutCtx cloneObj = new ChooseEditProgramOutCtx();
        cloneObj.ip90134TableEntry = new Ip90134TableEntry();
        cloneObj.ip90134TableEntry.set(ip90134TableEntry.getClonedField());
        cloneObj.editType23InfoTableGroup500 = new EditType23InfoTableGroup500();
        cloneObj.editType23InfoTableGroup500.set(editType23InfoTableGroup500.getClonedField());
        cloneObj.ip00702CaStringGroup = new Ip00702CaStringGroup();
        cloneObj.ip00702CaStringGroup.set(ip00702CaStringGroup.getClonedField());
        cloneObj.isSoftSyntaxAppliedGroup100 = new IsSoftSyntaxAppliedGroup100();
        cloneObj.isSoftSyntaxAppliedGroup100.set(isSoftSyntaxAppliedGroup100.getClonedField());
        cloneObj.bslIdGroup800 = new BslIdGroup800();
        cloneObj.bslIdGroup800.set(bslIdGroup800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip00702CaTable = new Ip00702CaTable();
        cloneObj.ip00702CaTable.set(ip00702CaTable.getClonedField());
        cloneObj.editNumGroup800 = new EditNumGroup800();
        cloneObj.editNumGroup800.set(editNumGroup800.getClonedField());
        cloneObj.ip00321EditListRec = new Ip00321EditListRec();
        cloneObj.ip00321EditListRec.set(ip00321EditListRec.getClonedField());
        cloneObj.ip90134EntryFoundGroup800 = new Ip90134EntryFoundGroup800();
        cloneObj.ip90134EntryFoundGroup800.set(ip90134EntryFoundGroup800.getClonedField());
        return cloneObj;
    }

    }

    public ChooseEditProgramOutCtx getChooseEditProgramOutCtx() {
            return new ChooseEditProgramOutCtx();
    }
     public class CheckPresenceOfFldInCtx implements Cloneable {
     Ip65504DeMapGroup ip65504DeMapGroup = Ip200090Ctx.this.getIp65504DeMapGroup();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip200090Ctx.this.getIp65504PdsMapGroup();
     Ip65504SelPdsEntriesAll ip65504SelPdsEntriesAll = Ip200090Ctx.this.getIp65504SelPdsEntriesAll();
     Work work = Ip200090Ctx.this.getWork();
     Ip65504SelElemEntriesAll ip65504SelElemEntriesAll = Ip200090Ctx.this.getIp65504SelElemEntriesAll();
     Ip00321EditListRec ip00321EditListRec = Ip200090Ctx.this.getIp00321EditListRec();

	/**
	 *	Returns the value of ip00321IpmSubfieldNumber
	 *	@return ip00321IpmSubfieldNumber
	 */
	public long getIp00321IpmSubfieldNumber() throws CFException {        
   		return ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo().getIp00321IpmSubfieldNumber();
	}
	
	/**
	 * 	Update Ip00321IpmSubfieldNumber with the passed value
	 *	@param number
	 */
	public void setIp00321IpmSubfieldNumber(long number)  throws CFException{
		ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo().setIp00321IpmSubfieldNumber(number);
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


	/**
	 *	Test condition "2" for isIp00321DDataElement88()
	 *	@return  Returns true if isIp00321DDataElement88() is "2"
	 */
   public boolean isIp00321DDataElement88() throws CFException {
      return ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo().isIp00321DDataElement88();
   }

	/**
	*  set values "2"
	*/
   	public void setIp00321DDataElement88True()  throws CFException{  			
    	ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo().setIp00321DDataElement88True();
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


public void setIp65504D(int ip65504D) { 
    Ip200090Ctx.this.ip65504D = ip65504D;
}

public int getIp65504D() { 
    return Ip200090Ctx.this.ip65504D;
}

public void setIp65504P(int ip65504P) { 
    Ip200090Ctx.this.ip65504P = ip65504P;
}

public int getIp65504P() { 
    return Ip200090Ctx.this.ip65504P;
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
	 *	Returns the value of ip00321IpmFieldNumber
	 *	@return ip00321IpmFieldNumber
	 */
	public long getIp00321IpmFieldNumber() throws CFException {        
   		return ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo().getIp00321IpmFieldNumber();
	}
	
	/**
	 * 	Update Ip00321IpmFieldNumber with the passed value
	 *	@param number
	 */
	public void setIp00321IpmFieldNumber(long number)  throws CFException{
		ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo().setIp00321IpmFieldNumber(number);
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



        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
        }

        public CheckPresenceOfFldOutCtx getCheckPresenceOfFldOutCtx() {
            return new CheckPresenceOfFldOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504DeMapGroup.hashCode();
        str += ip65504PdsMapGroup.hashCode();
        str += ip65504SelPdsEntriesAll.hashCode();
        str += work.hashCode();
        str += ip65504SelElemEntriesAll.hashCode();
        str += ip00321EditListRec.hashCode();
       return str.hashCode();
    }

    public CheckPresenceOfFldInCtx clone() {
        CheckPresenceOfFldInCtx cloneObj = new CheckPresenceOfFldInCtx();
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        cloneObj.ip65504SelPdsEntriesAll = new Ip65504SelPdsEntriesAll();
        cloneObj.ip65504SelPdsEntriesAll.set(ip65504SelPdsEntriesAll.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        cloneObj.ip00321EditListRec = new Ip00321EditListRec();
        cloneObj.ip00321EditListRec.set(ip00321EditListRec.getClonedField());
        return cloneObj;
    }

    }

    public CheckPresenceOfFldInCtx getCheckPresenceOfFldInCtx() {
            return new CheckPresenceOfFldInCtx();
    }
     public class CheckPresenceOfFldOutCtx implements Cloneable {
     Ip65504DeMapGroup ip65504DeMapGroup = Ip200090Ctx.this.getIp65504DeMapGroup();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip200090Ctx.this.getIp65504PdsMapGroup();
     Ip65504SelPdsEntriesAll ip65504SelPdsEntriesAll = Ip200090Ctx.this.getIp65504SelPdsEntriesAll();
     Work work = Ip200090Ctx.this.getWork();
     Ip65504SelElemEntriesAll ip65504SelElemEntriesAll = Ip200090Ctx.this.getIp65504SelElemEntriesAll();
     Ip00321EditListRec ip00321EditListRec = Ip200090Ctx.this.getIp00321EditListRec();

	/**
	 *	Returns the value of candidateTagType800
	 *	@return candidateTagType800
	 */
	public short getCandidateTagType800() throws CFException {        
   		return work.getCandidateTagType800();
	}
	
	/**
	 * 	Update CandidateTagType800 with the passed value
	 *	@param number
	 */
	public void setCandidateTagType800(short number)  throws CFException{
		work.setCandidateTagType800(number);
	}

	public void setCandidateTagType800(int number)  throws CFException{
		work.setCandidateTagType800((short)number);
	}

	public void setCandidateTagType800(long number)  throws CFException{
		work.setCandidateTagType800((short)number);
	}




public void setIp65504T(int ip65504T) { 
    Ip200090Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip200090Ctx.this.ip65504T;
}

public void setIp65504D(int ip65504D) { 
    Ip200090Ctx.this.ip65504D = ip65504D;
}

public int getIp65504D() { 
    return Ip200090Ctx.this.ip65504D;
}

public void setIp65504P(int ip65504P) { 
    Ip200090Ctx.this.ip65504P = ip65504P;
}

public int getIp65504P() { 
    return Ip200090Ctx.this.ip65504P;
}
	/**
	 *	Test condition "Y" for isCandidatePresent88100()
	 *	@return  Returns true if isCandidatePresent88100() is "Y"
	 */
   public boolean isCandidatePresent88100() throws CFException {
      return work.isCandidatePresent88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setCandidatePresent88100True()  throws CFException{  			
    	work.setCandidatePresent88100True();
   	}

        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504DeMapGroup.hashCode();
        str += ip65504PdsMapGroup.hashCode();
        str += ip65504SelPdsEntriesAll.hashCode();
        str += work.hashCode();
        str += ip65504SelElemEntriesAll.hashCode();
        str += ip00321EditListRec.hashCode();
       return str.hashCode();
    }

    public CheckPresenceOfFldOutCtx clone() {
        CheckPresenceOfFldOutCtx cloneObj = new CheckPresenceOfFldOutCtx();
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        cloneObj.ip65504SelPdsEntriesAll = new Ip65504SelPdsEntriesAll();
        cloneObj.ip65504SelPdsEntriesAll.set(ip65504SelPdsEntriesAll.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        cloneObj.ip00321EditListRec = new Ip00321EditListRec();
        cloneObj.ip00321EditListRec.set(ip00321EditListRec.getClonedField());
        return cloneObj;
    }

    }

    public CheckPresenceOfFldOutCtx getCheckPresenceOfFldOutCtx() {
            return new CheckPresenceOfFldOutCtx();
    }
     public class SetEditProgramPointerInCtx implements Cloneable {
     ErrorMessage610 errorMessage610 = Ip200090Ctx.this.getErrorMessage610();
     EditType23InfoTableGroup500 editType23InfoTableGroup500 = Ip200090Ctx.this.getEditType23InfoTableGroup500();
     SyntaxPgmTableGroup500 syntaxPgmTableGroup500 = Ip200090Ctx.this.getSyntaxPgmTableGroup500();
     Work work = Ip200090Ctx.this.getWork();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip200090Ctx.this.getIp60001EventLogWorkArea();
     AdditionalSyntaxChecksGroup100 additionalSyntaxChecksGroup100 = Ip200090Ctx.this.getAdditionalSyntaxChecksGroup100();
     AbendParaName900 abendParaName900 = Ip200090Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip200090Ctx.this.getAbendMessage900();
     Ip00321EditListRec ip00321EditListRec = Ip200090Ctx.this.getIp00321EditListRec();

	/**
	 *	Returns the value of errorMessage610
	 *	@return errorMessage610
	 */   
	 public ErrorMessage610 getErrorMessage610() {
   	return errorMessage610;
   }


	/**
	 *	Returns the value of syntaxPgmPtr500
	 *	@return syntaxPgmPtr500
	 */
   public char[] getSyntaxPgmPtr500(int index) throws CFException  {              
   		return syntaxPgmTableGroup500.getSyntaxPgmRedTable500().getSyntaxPgmTableEntry500(index).getSyntaxPgmPtr500();
   }

  
	/**
	*  set variable syntaxPgmPtr500
	*  @param value
	**/
   public void setSyntaxPgmPtr500(int index,char[] value) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmRedTable500().getSyntaxPgmTableEntry500(index).setSyntaxPgmPtr500(value);
   } 

     /**
	 * 	Update SyntaxPgmPtr500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxPgmPtr500(int index,char[] source, int sourceIndex) throws CFException {
      syntaxPgmTableGroup500.getSyntaxPgmRedTable500().getSyntaxPgmTableEntry500(index).setSyntaxPgmPtr500(source, sourceIndex);
   	
   }
   
   public void setSyntaxPgmPtr500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      syntaxPgmTableGroup500.getSyntaxPgmRedTable500().getSyntaxPgmTableEntry500(index).setSyntaxPgmPtr500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SyntaxPgmPtr500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxPgmPtr500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmRedTable500().getSyntaxPgmTableEntry500(index).setSyntaxPgmPtr500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SyntaxPgmPtr500 with another Field
	 *	@param value
	 */
   public void setSyntaxPgmPtr500(int index,Field source) {
      syntaxPgmTableGroup500.getSyntaxPgmRedTable500().getSyntaxPgmTableEntry500(index).setSyntaxPgmPtr500(source);
   }  
   
     /**
	 * 	Update SyntaxPgmPtr500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxPgmPtr500(int index,Field source, int sourceIndex,int sourceLen) {
      syntaxPgmTableGroup500.getSyntaxPgmRedTable500().getSyntaxPgmTableEntry500(index).setSyntaxPgmPtr500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SyntaxPgmPtr500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxPgmPtr500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      syntaxPgmTableGroup500.getSyntaxPgmRedTable500().getSyntaxPgmTableEntry500(index).setSyntaxPgmPtr500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition 1 THROUGH 9 for isValidPrograms88500()
	 *	@return  Returns true if isValidPrograms88500() is 1 THROUGH 9
	 */
   public boolean isValidPrograms88500(int index) throws CFException {
      return editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).isValidPrograms88500();
   }

	/**
	*  set values 1 THROUGH 9
	*/
   	public void setValidPrograms88500True(int index)  throws CFException{  			
    	editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setValidPrograms88500True();
   	}

public void setSyntaxIdx500(int syntaxIdx500) { 
    Ip200090Ctx.this.syntaxIdx500 = syntaxIdx500;
}

public int getSyntaxIdx500() { 
    return Ip200090Ctx.this.syntaxIdx500;
}
	/**
	 *	Returns the value of additionalSyntaxChkInd500
	 *	@return additionalSyntaxChkInd500
	 */
   public char[] getAdditionalSyntaxChkInd500(int index) throws CFException  {              
   		return editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).getAdditionalSyntaxChkInd500();
   }

  
	/**
	*  set variable additionalSyntaxChkInd500
	*  @param value
	**/
   public void setAdditionalSyntaxChkInd500(int index,char[] value) throws CFException {
      editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setAdditionalSyntaxChkInd500(value);
   } 

     /**
	 * 	Update AdditionalSyntaxChkInd500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdditionalSyntaxChkInd500(int index,char[] source, int sourceIndex) throws CFException {
      editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setAdditionalSyntaxChkInd500(source, sourceIndex);
   	
   }
   
   public void setAdditionalSyntaxChkInd500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setAdditionalSyntaxChkInd500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdditionalSyntaxChkInd500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdditionalSyntaxChkInd500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setAdditionalSyntaxChkInd500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdditionalSyntaxChkInd500 with another Field
	 *	@param value
	 */
   public void setAdditionalSyntaxChkInd500(int index,Field source) {
      editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setAdditionalSyntaxChkInd500(source);
   }  
   
     /**
	 * 	Update AdditionalSyntaxChkInd500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdditionalSyntaxChkInd500(int index,Field source, int sourceIndex,int sourceLen) {
      editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setAdditionalSyntaxChkInd500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdditionalSyntaxChkInd500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdditionalSyntaxChkInd500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setAdditionalSyntaxChkInd500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wrongEditAbendCode300
	 *	@return wrongEditAbendCode300
	 */
   public char[] getWrongEditAbendCode300() throws CFException  {              
   		return work.getWrongEditAbendCode300();
   }

  
	/**
	*  set variable wrongEditAbendCode300
	*  @param value
	**/
   public void setWrongEditAbendCode300(char[] value) throws CFException {
      work.setWrongEditAbendCode300(value);
   } 

	/**
	 *	Returns the value of editModuleIndex500
	 *	@return editModuleIndex500
	 */
	public int getEditModuleIndex500(int index) throws CFException {
   		return editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).getEditModuleIndex500();
	}


	/**
	 *	Returns String value of editModuleIndex500
	 *	@return editModuleIndex500
	 */
	public char[]  getEditModuleIndex500String(int index) throws CFException {
	     return String.valueOf(editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).getEditModuleIndex500String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean editModuleIndex500IsNumeric(int index)  throws CFException{
	    return editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index - 1).editModuleIndex500IsNumeric();
	}

	/**
	 * 	Update EditModuleIndex500 with the passed value
	 *	@param number
	 */
	public void setEditModuleIndex500(int index,int number)  throws CFException{
		editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setEditModuleIndex500(number);
	}
	

	public void setEditModuleIndex500(int index,long number)  throws CFException{
	    editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setEditModuleIndex500(number);
	}
	
	
	/**
	 * 	Update EditModuleIndex500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEditModuleIndex500(int index,char[] value)  throws CFException {
		editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setEditModuleIndex500(value);
	}
	
	/**
	 * 	Update EditModuleIndex500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEditModuleIndex500String(int index,char[] value)  throws CFException{
		editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setEditModuleIndex500(value);
	}	


public void setPgmIdx500(int pgmIdx500) { 
    Ip200090Ctx.this.pgmIdx500 = pgmIdx500;
}

public int getPgmIdx500() { 
    return Ip200090Ctx.this.pgmIdx500;
}
	/**
	 *	Returns the value of para2200300
	 *	@return para2200300
	 */
   public char[] getPara2200300() throws CFException  {              
   		return work.getPara2200300();
   }

  
	/**
	*  set variable para2200300
	*  @param value
	**/
   public void setPara2200300(char[] value) throws CFException {
      work.setPara2200300(value);
   } 

	/**
	 *	Returns the value of ip00321EditNbr
	 *	@return ip00321EditNbr
	 */
	public long getIp00321EditNbr() throws CFException {        
   		return ip00321EditListRec.getIp00321EditNbr();
	}
	
	/**
	 * 	Update Ip00321EditNbr with the passed value
	 *	@param number
	 */
	public void setIp00321EditNbr(long number)  throws CFException{
		ip00321EditListRec.setIp00321EditNbr(number);
	}




        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
        }

        public SetEditProgramPointerOutCtx getSetEditProgramPointerOutCtx() {
            return new SetEditProgramPointerOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += errorMessage610.hashCode();
        str += editType23InfoTableGroup500.hashCode();
        str += syntaxPgmTableGroup500.hashCode();
        str += work.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += additionalSyntaxChecksGroup100.hashCode();
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
        str += ip00321EditListRec.hashCode();
       return str.hashCode();
    }

    public SetEditProgramPointerInCtx clone() {
        SetEditProgramPointerInCtx cloneObj = new SetEditProgramPointerInCtx();
        cloneObj.errorMessage610 = new ErrorMessage610();
        cloneObj.errorMessage610.set(errorMessage610.getClonedField());
        cloneObj.editType23InfoTableGroup500 = new EditType23InfoTableGroup500();
        cloneObj.editType23InfoTableGroup500.set(editType23InfoTableGroup500.getClonedField());
        cloneObj.syntaxPgmTableGroup500 = new SyntaxPgmTableGroup500();
        cloneObj.syntaxPgmTableGroup500.set(syntaxPgmTableGroup500.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.additionalSyntaxChecksGroup100 = new AdditionalSyntaxChecksGroup100();
        cloneObj.additionalSyntaxChecksGroup100.set(additionalSyntaxChecksGroup100.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip00321EditListRec = new Ip00321EditListRec();
        cloneObj.ip00321EditListRec.set(ip00321EditListRec.getClonedField());
        return cloneObj;
    }

    }

    public SetEditProgramPointerInCtx getSetEditProgramPointerInCtx() {
            return new SetEditProgramPointerInCtx();
    }
     public class SetEditProgramPointerOutCtx implements Cloneable {
     ErrorMessage610 errorMessage610 = Ip200090Ctx.this.getErrorMessage610();
     EditType23InfoTableGroup500 editType23InfoTableGroup500 = Ip200090Ctx.this.getEditType23InfoTableGroup500();
     SyntaxPgmTableGroup500 syntaxPgmTableGroup500 = Ip200090Ctx.this.getSyntaxPgmTableGroup500();
     Work work = Ip200090Ctx.this.getWork();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip200090Ctx.this.getIp60001EventLogWorkArea();
     AdditionalSyntaxChecksGroup100 additionalSyntaxChecksGroup100 = Ip200090Ctx.this.getAdditionalSyntaxChecksGroup100();
     AbendParaName900 abendParaName900 = Ip200090Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip200090Ctx.this.getAbendMessage900();
     Ip00321EditListRec ip00321EditListRec = Ip200090Ctx.this.getIp00321EditListRec();

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
	 *	Returns the value of errorMessage610
	 *	@return errorMessage610
	 */   
	 public ErrorMessage610 getErrorMessage610() {
   	return errorMessage610;
   }


	/**
	 *	Returns the value of editNumber610
	 *	@return editNumber610
	 */
	public long getEditNumber610() throws CFException {
   		return errorMessage610.getEditNumber610();
	}


	/**
	 *	Returns String value of editNumber610
	 *	@return editNumber610
	 */
	public char[]  getEditNumber610String() throws CFException {
	     return String.valueOf(errorMessage610.getEditNumber610String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean editNumber610IsNumeric()  throws CFException{
	    return errorMessage610.editNumber610IsNumeric();
	}

	/**
	 * 	Update EditNumber610 with the passed value
	 *	@param number
	 */
	public void setEditNumber610(long number)  throws CFException{
		errorMessage610.setEditNumber610(number);
	}
	

	
	/**
	 * 	Update EditNumber610 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEditNumber610(char[] value)  throws CFException {
		errorMessage610.setEditNumber610(value);
	}
	
	/**
	 * 	Update EditNumber610 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEditNumber610String(char[] value)  throws CFException{
		errorMessage610.setEditNumber610(value);
	}	

	/**
	 *	Returns the value of additionalSyntaxChkInd500
	 *	@return additionalSyntaxChkInd500
	 */
   public char[] getAdditionalSyntaxChkInd500(int index) throws CFException  {              
   		return editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).getAdditionalSyntaxChkInd500();
   }

  
	/**
	*  set variable additionalSyntaxChkInd500
	*  @param value
	**/
   public void setAdditionalSyntaxChkInd500(int index,char[] value) throws CFException {
      editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setAdditionalSyntaxChkInd500(value);
   } 

     /**
	 * 	Update AdditionalSyntaxChkInd500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdditionalSyntaxChkInd500(int index,char[] source, int sourceIndex) throws CFException {
      editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setAdditionalSyntaxChkInd500(source, sourceIndex);
   	
   }
   
   public void setAdditionalSyntaxChkInd500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setAdditionalSyntaxChkInd500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdditionalSyntaxChkInd500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdditionalSyntaxChkInd500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setAdditionalSyntaxChkInd500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdditionalSyntaxChkInd500 with another Field
	 *	@param value
	 */
   public void setAdditionalSyntaxChkInd500(int index,Field source) {
      editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setAdditionalSyntaxChkInd500(source);
   }  
   
     /**
	 * 	Update AdditionalSyntaxChkInd500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdditionalSyntaxChkInd500(int index,Field source, int sourceIndex,int sourceLen) {
      editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setAdditionalSyntaxChkInd500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdditionalSyntaxChkInd500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdditionalSyntaxChkInd500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(index).setAdditionalSyntaxChkInd500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wrongEditAbendCode300
	 *	@return wrongEditAbendCode300
	 */
   public char[] getWrongEditAbendCode300() throws CFException  {              
   		return work.getWrongEditAbendCode300();
   }

  
	/**
	*  set variable wrongEditAbendCode300
	*  @param value
	**/
   public void setWrongEditAbendCode300(char[] value) throws CFException {
      work.setWrongEditAbendCode300(value);
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
	 *	Returns the value of additionalSyntaxChecks100
	 *	@return additionalSyntaxChecks100
	 */
   public char[] getAdditionalSyntaxChecks100() throws CFException  {              
   		return additionalSyntaxChecksGroup100.getAdditionalSyntaxChecks100();
   }

  
	/**
	*  set variable additionalSyntaxChecks100
	*  @param value
	**/
   public void setAdditionalSyntaxChecks100(char[] value) throws CFException {
      additionalSyntaxChecksGroup100.setAdditionalSyntaxChecks100(value);
   } 

     /**
	 * 	Update AdditionalSyntaxChecks100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdditionalSyntaxChecks100(char[] source, int sourceIndex) throws CFException {
      additionalSyntaxChecksGroup100.setAdditionalSyntaxChecks100(source, sourceIndex);
   	
   }
   
   public void setAdditionalSyntaxChecks100(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      additionalSyntaxChecksGroup100.setAdditionalSyntaxChecks100(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AdditionalSyntaxChecks100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdditionalSyntaxChecks100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      additionalSyntaxChecksGroup100.setAdditionalSyntaxChecks100(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AdditionalSyntaxChecks100 with another Field
	 *	@param value
	 */
   public void setAdditionalSyntaxChecks100(Field source) {
      additionalSyntaxChecksGroup100.setAdditionalSyntaxChecks100(source);
   }  
   
     /**
	 * 	Update AdditionalSyntaxChecks100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdditionalSyntaxChecks100(Field source, int sourceIndex,int sourceLen) {
      additionalSyntaxChecksGroup100.setAdditionalSyntaxChecks100(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AdditionalSyntaxChecks100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdditionalSyntaxChecks100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      additionalSyntaxChecksGroup100.setAdditionalSyntaxChecks100(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of syntaxPgmPtr800
	 *	@return syntaxPgmPtr800
	 */
   public char[] getSyntaxPgmPtr800() throws CFException  {              
   		return work.getSyntaxPgmPtr800();
   }

  
	/**
	*  set variable syntaxPgmPtr800
	*  @param value
	**/
   public void setSyntaxPgmPtr800(char[] value) throws CFException {
      work.setSyntaxPgmPtr800(value);
   } 


public void setPgmIdx500(int pgmIdx500) { 
    Ip200090Ctx.this.pgmIdx500 = pgmIdx500;
}

public int getPgmIdx500() { 
    return Ip200090Ctx.this.pgmIdx500;
}
	/**
	 *	Returns the value of para2200300
	 *	@return para2200300
	 */
   public char[] getPara2200300() throws CFException  {              
   		return work.getPara2200300();
   }

  
	/**
	*  set variable para2200300
	*  @param value
	**/
   public void setPara2200300(char[] value) throws CFException {
      work.setPara2200300(value);
   } 

	/**
	 *	Returns the value of ip00321EditNbr
	 *	@return ip00321EditNbr
	 */
	public long getIp00321EditNbr() throws CFException {        
   		return ip00321EditListRec.getIp00321EditNbr();
	}
	
	/**
	 * 	Update Ip00321EditNbr with the passed value
	 *	@param number
	 */
	public void setIp00321EditNbr(long number)  throws CFException{
		ip00321EditListRec.setIp00321EditNbr(number);
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


        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += errorMessage610.hashCode();
        str += editType23InfoTableGroup500.hashCode();
        str += syntaxPgmTableGroup500.hashCode();
        str += work.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += additionalSyntaxChecksGroup100.hashCode();
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
        str += ip00321EditListRec.hashCode();
       return str.hashCode();
    }

    public SetEditProgramPointerOutCtx clone() {
        SetEditProgramPointerOutCtx cloneObj = new SetEditProgramPointerOutCtx();
        cloneObj.errorMessage610 = new ErrorMessage610();
        cloneObj.errorMessage610.set(errorMessage610.getClonedField());
        cloneObj.editType23InfoTableGroup500 = new EditType23InfoTableGroup500();
        cloneObj.editType23InfoTableGroup500.set(editType23InfoTableGroup500.getClonedField());
        cloneObj.syntaxPgmTableGroup500 = new SyntaxPgmTableGroup500();
        cloneObj.syntaxPgmTableGroup500.set(syntaxPgmTableGroup500.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.additionalSyntaxChecksGroup100 = new AdditionalSyntaxChecksGroup100();
        cloneObj.additionalSyntaxChecksGroup100.set(additionalSyntaxChecksGroup100.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip00321EditListRec = new Ip00321EditListRec();
        cloneObj.ip00321EditListRec.set(ip00321EditListRec.getClonedField());
        return cloneObj;
    }

    }

    public SetEditProgramPointerOutCtx getSetEditProgramPointerOutCtx() {
            return new SetEditProgramPointerOutCtx();
    }
     public class CallPgmIp381120InCtx implements Cloneable {
     Ip90134TableEntry ip90134TableEntry = Ip200090Ctx.this.getIp90134TableEntry();
     Work work = Ip200090Ctx.this.getWork();

	/**
	 *	Returns the value of ptrIp381120800
	 *	@return ptrIp381120800
	 */
   public char[] getPtrIp381120800() throws CFException  {              
   		return work.getPtrIp381120800();
   }

  
	/**
	*  set variable ptrIp381120800
	*  @param value
	**/
   public void setPtrIp381120800(char[] value) throws CFException {
      work.setPtrIp381120800(value);
   } 

	/**
	 *	Returns the value of value1659300
	 *	@return value1659300
	 */
	public short getValue1659300() throws CFException {
   		return work.getValue1659300();
	}

    /**
	 *	Returns the String value of value1659300
	 *	@return value1659300
	 */
	public char[]  getValue1659300ActualString() {
		return work.getValue1659300ActualString();
	}

	/**
	 *	Returns String value of value1659300
	 *	@return value1659300
	 */
	public char[]  getValue1659300String() throws CFException {
	     return String.valueOf(work.getValue1659300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1659300IsNumeric()  throws CFException{
	    return work.value1659300IsNumeric();
	}

	/**
	 * 	Update Value1659300 with the passed value
	 *	@param number
	 */
	public void setValue1659300(short number)  throws CFException{
		work.setValue1659300(number);
	}
	
	public void setValue1659300(int number)  throws CFException{
	    work.setValue1659300(number);
	}
	public void setValue1659300(long number)  throws CFException{
	    work.setValue1659300(number);
	}
	

	
	/**
	 * 	Update Value1659300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1659300(char[] value)  throws CFException {
		work.setValue1659300(value);
	}
	
	/**
	 * 	Update Value1659300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1659300String(char[] value)  throws CFException{
		work.setValue1659300(value);
	}	

	/**
	 *	Returns the value of ip90134EditNumber
	 *	@return ip90134EditNumber
	 */
	public int getIp90134EditNumber() throws CFException {
   		return ip90134TableEntry.getIp90134EditGroupKey().getIp90134EditNumber();
	}


	/**
	 *	Returns String value of ip90134EditNumber
	 *	@return ip90134EditNumber
	 */
	public char[]  getIp90134EditNumberString() throws CFException {
	     return String.valueOf(ip90134TableEntry.getIp90134EditGroupKey().getIp90134EditNumberString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip90134EditNumberIsNumeric()  throws CFException{
	    return ip90134TableEntry.getIp90134EditGroupKey().ip90134EditNumberIsNumeric();
	}

	/**
	 * 	Update Ip90134EditNumber with the passed value
	 *	@param number
	 */
	public void setIp90134EditNumber(int number)  throws CFException{
		ip90134TableEntry.getIp90134EditGroupKey().setIp90134EditNumber(number);
	}
	

	public void setIp90134EditNumber(long number)  throws CFException{
	    ip90134TableEntry.getIp90134EditGroupKey().setIp90134EditNumber(number);
	}
	
	
	/**
	 * 	Update Ip90134EditNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp90134EditNumber(char[] value)  throws CFException {
		ip90134TableEntry.getIp90134EditGroupKey().setIp90134EditNumber(value);
	}
	
	/**
	 * 	Update Ip90134EditNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp90134EditNumberString(char[] value)  throws CFException{
		ip90134TableEntry.getIp90134EditGroupKey().setIp90134EditNumber(value);
	}	

	/**
	 *	Returns the value of value1643300
	 *	@return value1643300
	 */
	public short getValue1643300() throws CFException {
   		return work.getValue1643300();
	}

    /**
	 *	Returns the String value of value1643300
	 *	@return value1643300
	 */
	public char[]  getValue1643300ActualString() {
		return work.getValue1643300ActualString();
	}

	/**
	 *	Returns String value of value1643300
	 *	@return value1643300
	 */
	public char[]  getValue1643300String() throws CFException {
	     return String.valueOf(work.getValue1643300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1643300IsNumeric()  throws CFException{
	    return work.value1643300IsNumeric();
	}

	/**
	 * 	Update Value1643300 with the passed value
	 *	@param number
	 */
	public void setValue1643300(short number)  throws CFException{
		work.setValue1643300(number);
	}
	
	public void setValue1643300(int number)  throws CFException{
	    work.setValue1643300(number);
	}
	public void setValue1643300(long number)  throws CFException{
	    work.setValue1643300(number);
	}
	

	
	/**
	 * 	Update Value1643300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1643300(char[] value)  throws CFException {
		work.setValue1643300(value);
	}
	
	/**
	 * 	Update Value1643300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1643300String(char[] value)  throws CFException{
		work.setValue1643300(value);
	}	


        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
        }

        public CallPgmIp381120OutCtx getCallPgmIp381120OutCtx() {
            return new CallPgmIp381120OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip90134TableEntry.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CallPgmIp381120InCtx clone() {
        CallPgmIp381120InCtx cloneObj = new CallPgmIp381120InCtx();
        cloneObj.ip90134TableEntry = new Ip90134TableEntry();
        cloneObj.ip90134TableEntry.set(ip90134TableEntry.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CallPgmIp381120InCtx getCallPgmIp381120InCtx() {
            return new CallPgmIp381120InCtx();
    }
     public class CallPgmIp381120OutCtx implements Cloneable {
     Ip90134TableEntry ip90134TableEntry = Ip200090Ctx.this.getIp90134TableEntry();
     Work work = Ip200090Ctx.this.getWork();

	/**
	 *	Returns the value of holdReturnCode800
	 *	@return holdReturnCode800
	 */
	public short getHoldReturnCode800() throws CFException {        
   		return work.getHoldReturnCode800();
	}
	
	/**
	 * 	Update HoldReturnCode800 with the passed value
	 *	@param number
	 */
	public void setHoldReturnCode800(short number)  throws CFException{
		work.setHoldReturnCode800(number);
	}

	public void setHoldReturnCode800(int number)  throws CFException{
		work.setHoldReturnCode800((short)number);
	}

	public void setHoldReturnCode800(long number)  throws CFException{
		work.setHoldReturnCode800((short)number);
	}




        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip90134TableEntry.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CallPgmIp381120OutCtx clone() {
        CallPgmIp381120OutCtx cloneObj = new CallPgmIp381120OutCtx();
        cloneObj.ip90134TableEntry = new Ip90134TableEntry();
        cloneObj.ip90134TableEntry.set(ip90134TableEntry.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CallPgmIp381120OutCtx getCallPgmIp381120OutCtx() {
            return new CallPgmIp381120OutCtx();
    }
     public class CallEditModuleInCtx implements Cloneable {
     Work work = Ip200090Ctx.this.getWork();

	/**
	 *	Returns the value of syntaxPgmPtr800
	 *	@return syntaxPgmPtr800
	 */
   public char[] getSyntaxPgmPtr800() throws CFException  {              
   		return work.getSyntaxPgmPtr800();
   }

  
	/**
	*  set variable syntaxPgmPtr800
	*  @param value
	**/
   public void setSyntaxPgmPtr800(char[] value) throws CFException {
      work.setSyntaxPgmPtr800(value);
   } 


        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
        }

        public CallEditModuleOutCtx getCallEditModuleOutCtx() {
            return new CallEditModuleOutCtx();
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

    public CallEditModuleInCtx clone() {
        CallEditModuleInCtx cloneObj = new CallEditModuleInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CallEditModuleInCtx getCallEditModuleInCtx() {
            return new CallEditModuleInCtx();
    }
     public class CallEditModuleOutCtx implements Cloneable {
     Work work = Ip200090Ctx.this.getWork();


        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
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

    public CallEditModuleOutCtx clone() {
        CallEditModuleOutCtx cloneObj = new CallEditModuleOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CallEditModuleOutCtx getCallEditModuleOutCtx() {
            return new CallEditModuleOutCtx();
    }
     public class CheckSubfldPresenceInCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip200090Ctx.this.getIp65504CurrentTagTable();
     Work work = Ip200090Ctx.this.getWork();
     Ip00321EditListRec ip00321EditListRec = Ip200090Ctx.this.getIp00321EditListRec();

	/**
	 *	Returns the value of ip00321IpmSubfieldNumber
	 *	@return ip00321IpmSubfieldNumber
	 */
	public long getIp00321IpmSubfieldNumber() throws CFException {        
   		return ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo().getIp00321IpmSubfieldNumber();
	}
	
	/**
	 * 	Update Ip00321IpmSubfieldNumber with the passed value
	 *	@param number
	 */
	public void setIp00321IpmSubfieldNumber(long number)  throws CFException{
		ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo().setIp00321IpmSubfieldNumber(number);
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
	 *	Returns the value of candidateTagType800
	 *	@return candidateTagType800
	 */
	public short getCandidateTagType800() throws CFException {        
   		return work.getCandidateTagType800();
	}
	
	/**
	 * 	Update CandidateTagType800 with the passed value
	 *	@param number
	 */
	public void setCandidateTagType800(short number)  throws CFException{
		work.setCandidateTagType800(number);
	}

	public void setCandidateTagType800(int number)  throws CFException{
		work.setCandidateTagType800((short)number);
	}

	public void setCandidateTagType800(long number)  throws CFException{
		work.setCandidateTagType800((short)number);
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
	 *	Returns the value of ip00321IpmFieldNumber
	 *	@return ip00321IpmFieldNumber
	 */
	public long getIp00321IpmFieldNumber() throws CFException {        
   		return ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo().getIp00321IpmFieldNumber();
	}
	
	/**
	 * 	Update Ip00321IpmFieldNumber with the passed value
	 *	@param number
	 */
	public void setIp00321IpmFieldNumber(long number)  throws CFException{
		ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo().setIp00321IpmFieldNumber(number);
	}




        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
        }

        public CheckSubfldPresenceOutCtx getCheckSubfldPresenceOutCtx() {
            return new CheckSubfldPresenceOutCtx();
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
        str += ip00321EditListRec.hashCode();
       return str.hashCode();
    }

    public CheckSubfldPresenceInCtx clone() {
        CheckSubfldPresenceInCtx cloneObj = new CheckSubfldPresenceInCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip00321EditListRec = new Ip00321EditListRec();
        cloneObj.ip00321EditListRec.set(ip00321EditListRec.getClonedField());
        return cloneObj;
    }

    }

    public CheckSubfldPresenceInCtx getCheckSubfldPresenceInCtx() {
            return new CheckSubfldPresenceInCtx();
    }
     public class CheckSubfldPresenceOutCtx implements Cloneable {
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip200090Ctx.this.getIp65504CurrentTagTable();
     Work work = Ip200090Ctx.this.getWork();
     Ip00321EditListRec ip00321EditListRec = Ip200090Ctx.this.getIp00321EditListRec();

	/**
	 *	Test condition "Y" for isSubfldCheckOver88100()
	 *	@return  Returns true if isSubfldCheckOver88100() is "Y"
	 */
   public boolean isSubfldCheckOver88100() throws CFException {
      return work.isSubfldCheckOver88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setSubfldCheckOver88100True()  throws CFException{  			
    	work.setSubfldCheckOver88100True();
   	}

public void setIp65504T(int ip65504T) { 
    Ip200090Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip200090Ctx.this.ip65504T;
}
	/**
	 *	Test condition "Y" for isCandidatePresent88100()
	 *	@return  Returns true if isCandidatePresent88100() is "Y"
	 */
   public boolean isCandidatePresent88100() throws CFException {
      return work.isCandidatePresent88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setCandidatePresent88100True()  throws CFException{  			
    	work.setCandidatePresent88100True();
   	}

        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
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
        str += ip00321EditListRec.hashCode();
       return str.hashCode();
    }

    public CheckSubfldPresenceOutCtx clone() {
        CheckSubfldPresenceOutCtx cloneObj = new CheckSubfldPresenceOutCtx();
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip00321EditListRec = new Ip00321EditListRec();
        cloneObj.ip00321EditListRec.set(ip00321EditListRec.getClonedField());
        return cloneObj;
    }

    }

    public CheckSubfldPresenceOutCtx getCheckSubfldPresenceOutCtx() {
            return new CheckSubfldPresenceOutCtx();
    }
     public class TerminateOnErrorInCtx implements Cloneable {
     Work work = Ip200090Ctx.this.getWork();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip200090Ctx.this.getIp60001EventLogWorkArea();
     AbendParaName900 abendParaName900 = Ip200090Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip200090Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of abendParaName900
	 *	@return abendParaName900
	 */   
	 public AbendParaName900 getAbendParaName900() {
   	return abendParaName900;
   }


	/**
	 *	Returns the value of abendMessage900
	 *	@return abendMessage900
	 */   
	 public AbendMessage900 getAbendMessage900() {
   	return abendMessage900;
   }


	/**
	 *	Returns the value of edit0009300
	 *	@return edit0009300
	 */
   public char[] getEdit0009300() throws CFException  {              
   		return work.getEdit0009300();
   }

  
	/**
	*  set variable edit0009300
	*  @param value
	**/
   public void setEdit0009300(char[] value) throws CFException {
      work.setEdit0009300(value);
   } 

	/**
	 *	Returns the value of abendPgm300
	 *	@return abendPgm300
	 */
   public char[] getAbendPgm300() throws CFException  {              
   		return work.getAbendPgm300();
   }

  
	/**
	*  set variable abendPgm300
	*  @param value
	**/
   public void setAbendPgm300(char[] value) throws CFException {
      work.setAbendPgm300(value);
   } 


        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
        }

        public TerminateOnErrorOutCtx getTerminateOnErrorOutCtx() {
            return new TerminateOnErrorOutCtx();
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
        str += ip60001EventLogWorkArea.hashCode();
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public TerminateOnErrorInCtx clone() {
        TerminateOnErrorInCtx cloneObj = new TerminateOnErrorInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public TerminateOnErrorInCtx getTerminateOnErrorInCtx() {
            return new TerminateOnErrorInCtx();
    }
     public class TerminateOnErrorOutCtx implements Cloneable {
     Work work = Ip200090Ctx.this.getWork();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip200090Ctx.this.getIp60001EventLogWorkArea();
     AbendParaName900 abendParaName900 = Ip200090Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip200090Ctx.this.getAbendMessage900();

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

	/**
	 *	Returns the value of edit0009300
	 *	@return edit0009300
	 */
   public char[] getEdit0009300() throws CFException  {              
   		return work.getEdit0009300();
   }

  
	/**
	*  set variable edit0009300
	*  @param value
	**/
   public void setEdit0009300(char[] value) throws CFException {
      work.setEdit0009300(value);
   } 


        public Ip200090Ctx getIp200090Ctx() {
            return Ip200090Ctx.this;
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
        str += ip60001EventLogWorkArea.hashCode();
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public TerminateOnErrorOutCtx clone() {
        TerminateOnErrorOutCtx cloneObj = new TerminateOnErrorOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public TerminateOnErrorOutCtx getTerminateOnErrorOutCtx() {
            return new TerminateOnErrorOutCtx();
    }
}
