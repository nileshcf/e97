package com.cloudframe.app.ip202330;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.global.sharedvar.Ip65504PdsMapGroup;
import com.cloudframe.app.global.sharedvar.Ip000604DeAttrTable;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.global.sharedvar.AdditionalSyntaxChecksGroup100;
import com.cloudframe.app.global.sharedvar.Ip65504SelElemEntriesAll;
import com.cloudframe.app.global.sharedvar.Ip66102IpmMsg;
import com.cloudframe.app.ip202330.dto.Work;
import com.cloudframe.app.ip202330.dto.AbendMessage900;
import com.cloudframe.app.global.sharedvar.StrtLngth800;
import com.cloudframe.app.global.sharedvar.Ip00321EditListRec;
import com.cloudframe.app.ip202330.dto.FormatTypeErrorMessage600;
import com.cloudframe.app.global.sharedvar.Ip65504TcntGroup;
import com.cloudframe.app.global.sharedvar.Ip65504DeMapGroup;
import com.cloudframe.app.global.sharedvar.Ip65504CurrentTagTable;
import com.cloudframe.app.global.sharedvar.Ip65504SelPdsEntriesAll;
import com.cloudframe.app.global.sharedvar.Ip66102IpmFileInformation;
import com.cloudframe.app.global.sharedvar.Ip65504TaggedRecordInfo;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.global.sharedvar.Ip65504MessageStatusGroup;
import com.cloudframe.app.global.sharedvar.Ip000804PdsAttributes;
import com.cloudframe.app.ip202330.dto.AbendParaName900;


@Context
public class Ip202330Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Ip65504SelElemEntriesAll ip65504SelElemEntriesAll;
    Ip996011ProgramStartMessage ip996011ProgramStartMessage;
    Ip65504TaggedRecordInfo ip65504TaggedRecordInfo;
    Ip00321EditListRec ip00321EditListRec;
    Ip000804PdsAttributes ip000804PdsAttributes;
    Ip65504DeMapGroup ip65504DeMapGroup;
    Ip66102IpmMsg ip66102IpmMsg;
    AbendParaName900 abendParaName900;
    Ip65504CurrentTagTable ip65504CurrentTagTable;
    AdditionalSyntaxChecksGroup100 additionalSyntaxChecksGroup100;
    FormatTypeErrorMessage600 formatTypeErrorMessage600;
    Ip66102IpmFileInformation ip66102IpmFileInformation;
    Ip000604DeAttrTable ip000604DeAttrTable;
    StrtLngth800 strtLngth800;
    Ip65504PdsMapGroup ip65504PdsMapGroup;
    Work work;
    Ip65504SelPdsEntriesAll ip65504SelPdsEntriesAll;
    AbendMessage900 abendMessage900;
    Ip65504TcntGroup ip65504TcntGroup;
    Ip65504MessageStatusGroup ip65504MessageStatusGroup;
    Ip60001EventLogWorkArea ip60001EventLogWorkArea;

    int ip000604I;
    int ip65504T;
    int ip65504P;
    int ip000804I;
    int ip65504D;

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


    public Ip65504SelElemEntriesAll getIp65504SelElemEntriesAll() {
        if (ip65504SelElemEntriesAll == null) {
            ip65504SelElemEntriesAll = globalCtx.getGlobalDto(Ip65504SelElemEntriesAll.class);
        }

        return ip65504SelElemEntriesAll;
    }

    public Ip996011ProgramStartMessage getIp996011ProgramStartMessage() {
        if (ip996011ProgramStartMessage == null) {
            ip996011ProgramStartMessage = globalCtx.getGlobalDto(Ip996011ProgramStartMessage.class);
        }

        return ip996011ProgramStartMessage;
    }

    public Ip65504TaggedRecordInfo getIp65504TaggedRecordInfo() {
        if (ip65504TaggedRecordInfo == null) {
            ip65504TaggedRecordInfo = globalCtx.getGlobalDto(Ip65504TaggedRecordInfo.class);
        }

        return ip65504TaggedRecordInfo;
    }

    public Ip00321EditListRec getIp00321EditListRec() {
        if (ip00321EditListRec == null) {
            ip00321EditListRec = globalCtx.getGlobalDto(Ip00321EditListRec.class);
        }

        return ip00321EditListRec;
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

    public AbendParaName900 getAbendParaName900() {
        if (abendParaName900 == null) {
            abendParaName900 = new AbendParaName900();
        }

        return abendParaName900;
    }

    public void setAbendParaName900(AbendParaName900 abendParaName900) {
        this.abendParaName900 = abendParaName900;
    }
    public Ip65504CurrentTagTable getIp65504CurrentTagTable() {
        if (ip65504CurrentTagTable == null) {
            ip65504CurrentTagTable = globalCtx.getGlobalDto(Ip65504CurrentTagTable.class);
        }

        return ip65504CurrentTagTable;
    }

    public AdditionalSyntaxChecksGroup100 getAdditionalSyntaxChecksGroup100() {
        if (additionalSyntaxChecksGroup100 == null) {
            additionalSyntaxChecksGroup100 = globalCtx.getGlobalDto(AdditionalSyntaxChecksGroup100.class);
        }

        return additionalSyntaxChecksGroup100;
    }

    public FormatTypeErrorMessage600 getFormatTypeErrorMessage600() {
        if (formatTypeErrorMessage600 == null) {
            formatTypeErrorMessage600 = new FormatTypeErrorMessage600();
        }

        return formatTypeErrorMessage600;
    }

    public void setFormatTypeErrorMessage600(FormatTypeErrorMessage600 formatTypeErrorMessage600) {
        this.formatTypeErrorMessage600 = formatTypeErrorMessage600;
    }
    public Ip66102IpmFileInformation getIp66102IpmFileInformation() {
        if (ip66102IpmFileInformation == null) {
            ip66102IpmFileInformation = globalCtx.getGlobalDto(Ip66102IpmFileInformation.class);
        }

        return ip66102IpmFileInformation;
    }

    public Ip000604DeAttrTable getIp000604DeAttrTable() {
        if (ip000604DeAttrTable == null) {
            ip000604DeAttrTable = globalCtx.getGlobalDto(Ip000604DeAttrTable.class);
        }

        return ip000604DeAttrTable;
    }

    public StrtLngth800 getStrtLngth800() {
        if (strtLngth800 == null) {
            strtLngth800 = globalCtx.getGlobalDto(StrtLngth800.class);
        }

        return strtLngth800;
    }

    public Ip65504PdsMapGroup getIp65504PdsMapGroup() {
        if (ip65504PdsMapGroup == null) {
            ip65504PdsMapGroup = globalCtx.getGlobalDto(Ip65504PdsMapGroup.class);
        }

        return ip65504PdsMapGroup;
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
    public Ip65504SelPdsEntriesAll getIp65504SelPdsEntriesAll() {
        if (ip65504SelPdsEntriesAll == null) {
            ip65504SelPdsEntriesAll = globalCtx.getGlobalDto(Ip65504SelPdsEntriesAll.class);
        }

        return ip65504SelPdsEntriesAll;
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

    public Ip60001EventLogWorkArea getIp60001EventLogWorkArea() {
        if (ip60001EventLogWorkArea == null) {
            ip60001EventLogWorkArea = globalCtx.getGlobalDto(Ip60001EventLogWorkArea.class);
        }

        return ip60001EventLogWorkArea;
    }


    public int getIp000604I() {
        return ip000604I;
    }

    public void setIp000604I(int ip000604I) {
        this.ip000604I = ip000604I;
    }
    public int getIp65504T() {
        return ip65504T;
    }

    public void setIp65504T(int ip65504T) {
        this.ip65504T = ip65504T;
    }
    public int getIp65504P() {
        return ip65504P;
    }

    public void setIp65504P(int ip65504P) {
        this.ip65504P = ip65504P;
    }
    public int getIp000804I() {
        return ip000804I;
    }

    public void setIp000804I(int ip000804I) {
        this.ip000804I = ip000804I;
    }
    public int getIp65504D() {
        return ip65504D;
    }

    public void setIp65504D(int ip65504D) {
        this.ip65504D = ip65504D;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip65504SelElemEntriesAll.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
        str += ip65504TaggedRecordInfo.hashCode();
        str += ip00321EditListRec.hashCode();
        str += ip000804PdsAttributes.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip66102IpmMsg.hashCode();
        str += abendParaName900.hashCode();
        str += ip65504CurrentTagTable.hashCode();
        str += additionalSyntaxChecksGroup100.hashCode();
        str += formatTypeErrorMessage600.hashCode();
        str += ip66102IpmFileInformation.hashCode();
        str += ip000604DeAttrTable.hashCode();
        str += strtLngth800.hashCode();
        str += ip65504PdsMapGroup.hashCode();
        str += work.hashCode();
        str += ip65504SelPdsEntriesAll.hashCode();
        str += abendMessage900.hashCode();
        str += ip65504TcntGroup.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public Ip202330Ctx clone() {
        Ip202330Ctx cloneObj = new Ip202330Ctx();
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.ip65504TaggedRecordInfo = new Ip65504TaggedRecordInfo();
        cloneObj.ip65504TaggedRecordInfo.set(ip65504TaggedRecordInfo.getClonedField());
        cloneObj.ip00321EditListRec = new Ip00321EditListRec();
        cloneObj.ip00321EditListRec.set(ip00321EditListRec.getClonedField());
        cloneObj.ip000804PdsAttributes = new Ip000804PdsAttributes();
        cloneObj.ip000804PdsAttributes.set(ip000804PdsAttributes.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.additionalSyntaxChecksGroup100 = new AdditionalSyntaxChecksGroup100();
        cloneObj.additionalSyntaxChecksGroup100.set(additionalSyntaxChecksGroup100.getClonedField());
        cloneObj.formatTypeErrorMessage600 = new FormatTypeErrorMessage600();
        cloneObj.formatTypeErrorMessage600.set(formatTypeErrorMessage600.getClonedField());
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        cloneObj.strtLngth800 = new StrtLngth800();
        cloneObj.strtLngth800.set(strtLngth800.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504SelPdsEntriesAll = new Ip65504SelPdsEntriesAll();
        cloneObj.ip65504SelPdsEntriesAll.set(ip65504SelPdsEntriesAll.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip65504TcntGroup = new Ip65504TcntGroup();
        cloneObj.ip65504TcntGroup.set(ip65504TcntGroup.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class PerformInitializationInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip202330Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of pgmIp200110300
	 *	@return pgmIp200110300
	 */
   public char[] getPgmIp200110300() throws CFException  {              
   		return work.getPgmIp200110300();
   }

  
	/**
	*  set variable pgmIp200110300
	*  @param value
	**/
   public void setPgmIp200110300(char[] value) throws CFException {
      work.setPgmIp200110300(value);
   } 

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
	/**
	 *	Returns the value of edit0233300
	 *	@return edit0233300
	 */
   public char[] getEdit0233300() throws CFException  {              
   		return work.getEdit0233300();
   }

  
	/**
	*  set variable edit0233300
	*  @param value
	**/
   public void setEdit0233300(char[] value) throws CFException {
      work.setEdit0233300(value);
   } 


        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public PerformInitializationInCtx clone() {
        PerformInitializationInCtx cloneObj = new PerformInitializationInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public PerformInitializationInCtx getPerformInitializationInCtx() {
            return new PerformInitializationInCtx();
    }
     public class PerformInitializationOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip202330Ctx.this.getIp60001EventLogWorkArea();

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
	 *	Returns the value of ptrIp200110800
	 *	@return ptrIp200110800
	 */
   public char[] getPtrIp200110800() throws CFException  {              
   		return work.getPtrIp200110800();
   }

  
	/**
	*  set variable ptrIp200110800
	*  @param value
	**/
   public void setPtrIp200110800(char[] value) throws CFException {
      work.setPtrIp200110800(value);
   } 

	/**
	 *	Returns the value of edit0233300
	 *	@return edit0233300
	 */
   public char[] getEdit0233300() throws CFException  {              
   		return work.getEdit0233300();
   }

  
	/**
	*  set variable edit0233300
	*  @param value
	**/
   public void setEdit0233300(char[] value) throws CFException {
      work.setEdit0233300(value);
   } 


        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
       return str.hashCode();
    }

    public PerformInitializationOutCtx clone() {
        PerformInitializationOutCtx cloneObj = new PerformInitializationOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public PerformInitializationOutCtx getPerformInitializationOutCtx() {
            return new PerformInitializationOutCtx();
    }
     public class DisplayExecMsgsInCtx implements Cloneable {
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip202330Ctx.this.getIp996011ProgramStartMessage();
     Work work = Ip202330Ctx.this.getWork();

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
	 *	Returns the value of edit0233300
	 *	@return edit0233300
	 */
   public char[] getEdit0233300() throws CFException  {              
   		return work.getEdit0233300();
   }

  
	/**
	*  set variable edit0233300
	*  @param value
	**/
   public void setEdit0233300(char[] value) throws CFException {
      work.setEdit0233300(value);
   } 


        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += ip996011ProgramStartMessage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayExecMsgsInCtx clone() {
        DisplayExecMsgsInCtx cloneObj = new DisplayExecMsgsInCtx();
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayExecMsgsInCtx getDisplayExecMsgsInCtx() {
            return new DisplayExecMsgsInCtx();
    }
     public class DisplayExecMsgsOutCtx implements Cloneable {
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip202330Ctx.this.getIp996011ProgramStartMessage();
     Work work = Ip202330Ctx.this.getWork();

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
	 *	Returns the value of edit0233300
	 *	@return edit0233300
	 */
   public char[] getEdit0233300() throws CFException  {              
   		return work.getEdit0233300();
   }

  
	/**
	*  set variable edit0233300
	*  @param value
	**/
   public void setEdit0233300(char[] value) throws CFException {
      work.setEdit0233300(value);
   } 


        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip996011ProgramStartMessage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayExecMsgsOutCtx clone() {
        DisplayExecMsgsOutCtx cloneObj = new DisplayExecMsgsOutCtx();
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayExecMsgsOutCtx getDisplayExecMsgsOutCtx() {
            return new DisplayExecMsgsOutCtx();
    }
     public class PerformEditInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     AdditionalSyntaxChecksGroup100 additionalSyntaxChecksGroup100 = Ip202330Ctx.this.getAdditionalSyntaxChecksGroup100();

	/**
	 *	Test condition "J" for isNoLhBasicPresence88100()
	 *	@return  Returns true if isNoLhBasicPresence88100() is "J"
	 */
   public boolean isNoLhBasicPresence88100() throws CFException {
      return additionalSyntaxChecksGroup100.isNoLhBasicPresence88100();
   }

	/**
	*  set values "J"
	*/
   	public void setNoLhBasicPresence88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setNoLhBasicPresence88100True();
   	}
	/**
	 *	Test condition "6" for isNotSpacesZerosAlpha88100()
	 *	@return  Returns true if isNotSpacesZerosAlpha88100() is "6"
	 */
   public boolean isNotSpacesZerosAlpha88100() throws CFException {
      return additionalSyntaxChecksGroup100.isNotSpacesZerosAlpha88100();
   }

	/**
	*  set values "6"
	*/
   	public void setNotSpacesZerosAlpha88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setNotSpacesZerosAlpha88100True();
   	}
	/**
	 *	Test condition "K" for isNoZeroBasicPresence88100()
	 *	@return  Returns true if isNoZeroBasicPresence88100() is "K"
	 */
   public boolean isNoZeroBasicPresence88100() throws CFException {
      return additionalSyntaxChecksGroup100.isNoZeroBasicPresence88100();
   }

	/**
	*  set values "K"
	*/
   	public void setNoZeroBasicPresence88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setNoZeroBasicPresence88100True();
   	}
	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Test condition "O" for isLeftJustifyNoSpcZer88100()
	 *	@return  Returns true if isLeftJustifyNoSpcZer88100() is "O"
	 */
   public boolean isLeftJustifyNoSpcZer88100() throws CFException {
      return additionalSyntaxChecksGroup100.isLeftJustifyNoSpcZer88100();
   }

	/**
	*  set values "O"
	*/
   	public void setLeftJustifyNoSpcZer88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setLeftJustifyNoSpcZer88100True();
   	}
	/**
	 *	Test condition "L" for isLeftJustifyNoBasic88100()
	 *	@return  Returns true if isLeftJustifyNoBasic88100() is "L"
	 */
   public boolean isLeftJustifyNoBasic88100() throws CFException {
      return additionalSyntaxChecksGroup100.isLeftJustifyNoBasic88100();
   }

	/**
	*  set values "L"
	*/
   	public void setLeftJustifyNoBasic88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setLeftJustifyNoBasic88100True();
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
	/**
	 *	Test condition "2" for isLeftJustifyNotSpace88100()
	 *	@return  Returns true if isLeftJustifyNotSpace88100() is "2"
	 */
   public boolean isLeftJustifyNotSpace88100() throws CFException {
      return additionalSyntaxChecksGroup100.isLeftJustifyNotSpace88100();
   }

	/**
	*  set values "2"
	*/
   	public void setLeftJustifyNotSpace88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setLeftJustifyNotSpace88100True();
   	}
	/**
	 *	Test condition "D" for isNotSpacesZerosNine88100()
	 *	@return  Returns true if isNotSpacesZerosNine88100() is "D"
	 */
   public boolean isNotSpacesZerosNine88100() throws CFException {
      return additionalSyntaxChecksGroup100.isNotSpacesZerosNine88100();
   }

	/**
	*  set values "D"
	*/
   	public void setNotSpacesZerosNine88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setNotSpacesZerosNine88100True();
   	}
	/**
	 *	Test condition "7" for isNotAllSpaces88100()
	 *	@return  Returns true if isNotAllSpaces88100() is "7"
	 */
   public boolean isNotAllSpaces88100() throws CFException {
      return additionalSyntaxChecksGroup100.isNotAllSpaces88100();
   }

	/**
	*  set values "7"
	*/
   	public void setNotAllSpaces88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setNotAllSpaces88100True();
   	}
	/**
	 *	Test condition "E" for isNotSpacesOrZeros88100()
	 *	@return  Returns true if isNotSpacesOrZeros88100() is "E"
	 */
   public boolean isNotSpacesOrZeros88100() throws CFException {
      return additionalSyntaxChecksGroup100.isNotSpacesOrZeros88100();
   }

	/**
	*  set values "E"
	*/
   	public void setNotSpacesOrZeros88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setNotSpacesOrZeros88100True();
   	}

        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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

    public PerformEditInCtx clone() {
        PerformEditInCtx cloneObj = new PerformEditInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.additionalSyntaxChecksGroup100 = new AdditionalSyntaxChecksGroup100();
        cloneObj.additionalSyntaxChecksGroup100.set(additionalSyntaxChecksGroup100.getClonedField());
        return cloneObj;
    }

    }

    public PerformEditInCtx getPerformEditInCtx() {
            return new PerformEditInCtx();
    }
     public class CheckForDePdsMtiInCtx implements Cloneable {
     Ip000604DeAttrTable ip000604DeAttrTable = Ip202330Ctx.this.getIp000604DeAttrTable();
     Ip00321EditListRec ip00321EditListRec = Ip202330Ctx.this.getIp00321EditListRec();
     Work work = Ip202330Ctx.this.getWork();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip202330Ctx.this.getIp65504PdsMapGroup();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip202330Ctx.this.getIp65504DeMapGroup();
     Ip000804PdsAttributes ip000804PdsAttributes = Ip202330Ctx.this.getIp000804PdsAttributes();
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip202330Ctx.this.getIp65504CurrentTagTable();

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
	 *	Returns the value of ip000804PdsFormat
	 *	@return ip000804PdsFormat
	 */
   public char[] getIp000804PdsFormat(int index) throws CFException  {              
   		return ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).getIp000804PdsFormat();
   }

  
	/**
	*  set variable ip000804PdsFormat
	*  @param value
	**/
   public void setIp000804PdsFormat(int index,char[] value) throws CFException {
      ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsFormat(value);
   } 

     /**
	 * 	Update Ip000804PdsFormat 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000804PdsFormat(int index,char[] source, int sourceIndex) throws CFException {
      ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsFormat(source, sourceIndex);
   	
   }
   
   public void setIp000804PdsFormat(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsFormat(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip000804PdsFormat 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000804PdsFormat(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsFormat(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip000804PdsFormat with another Field
	 *	@param value
	 */
   public void setIp000804PdsFormat(int index,Field source) {
      ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsFormat(source);
   }  
   
     /**
	 * 	Update Ip000804PdsFormat 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000804PdsFormat(int index,Field source, int sourceIndex,int sourceLen) {
      ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsFormat(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip000804PdsFormat 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000804PdsFormat(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsFormat(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIp65504P(int ip65504P) { 
    Ip202330Ctx.this.ip65504P = ip65504P;
}

public int getIp65504P() { 
    return Ip202330Ctx.this.ip65504P;
}
	/**
	 *	Test condition "3" for isIp00321PPds88()
	 *	@return  Returns true if isIp00321PPds88() is "3"
	 */
   public boolean isIp00321PPds88() throws CFException {
      return ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo().isIp00321PPds88();
   }

	/**
	*  set values "3"
	*/
   	public void setIp00321PPds88True()  throws CFException{  			
    	ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo().setIp00321PPds88True();
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




public void setIp000804I(int ip000804I) { 
    Ip202330Ctx.this.ip000804I = ip000804I;
}

public int getIp000804I() { 
    return Ip202330Ctx.this.ip000804I;
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
	 *	Returns the value of numericSyntax300
	 *	@return numericSyntax300
	 */
   public char[] getNumericSyntax300() throws CFException  {              
   		return work.getNumericSyntax300();
   }

  
	/**
	*  set variable numericSyntax300
	*  @param value
	**/
   public void setNumericSyntax300(char[] value) throws CFException {
      work.setNumericSyntax300(value);
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
    Ip202330Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip202330Ctx.this.ip65504T;
}

public void setIp65504D(int ip65504D) { 
    Ip202330Ctx.this.ip65504D = ip65504D;
}

public int getIp65504D() { 
    return Ip202330Ctx.this.ip65504D;
}
	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Test condition "1" for isIp00321MMti88()
	 *	@return  Returns true if isIp00321MMti88() is "1"
	 */
   public boolean isIp00321MMti88() throws CFException {
      return ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo().isIp00321MMti88();
   }

	/**
	*  set values "1"
	*/
   	public void setIp00321MMti88True()  throws CFException{  			
    	ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo().setIp00321MMti88True();
   	}
	/**
	 *	Returns the value of ip000604DeFormat
	 *	@return ip000604DeFormat
	 */
   public char[] getIp000604DeFormat(int index) throws CFException  {              
   		return ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeAttrUserRow().getIp000604DeFormat();
   }

  
	/**
	*  set variable ip000604DeFormat
	*  @param value
	**/
   public void setIp000604DeFormat(int index,char[] value) throws CFException {
      ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeAttrUserRow().setIp000604DeFormat(value);
   } 

     /**
	 * 	Update Ip000604DeFormat 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000604DeFormat(int index,char[] source, int sourceIndex) throws CFException {
      ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeAttrUserRow().setIp000604DeFormat(source, sourceIndex);
   	
   }
   
   public void setIp000604DeFormat(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeAttrUserRow().setIp000604DeFormat(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip000604DeFormat 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000604DeFormat(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeAttrUserRow().setIp000604DeFormat(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip000604DeFormat with another Field
	 *	@param value
	 */
   public void setIp000604DeFormat(int index,Field source) {
      ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeAttrUserRow().setIp000604DeFormat(source);
   }  
   
     /**
	 * 	Update Ip000604DeFormat 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000604DeFormat(int index,Field source, int sourceIndex,int sourceLen) {
      ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeAttrUserRow().setIp000604DeFormat(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip000604DeFormat 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000604DeFormat(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeAttrUserRow().setIp000604DeFormat(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIp000604I(int ip000604I) { 
    Ip202330Ctx.this.ip000604I = ip000604I;
}

public int getIp000604I() { 
    return Ip202330Ctx.this.ip000604I;
}

        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public CheckForDePdsMtiOutCtx getCheckForDePdsMtiOutCtx() {
            return new CheckForDePdsMtiOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip000604DeAttrTable.hashCode();
        str += ip00321EditListRec.hashCode();
        str += work.hashCode();
        str += ip65504PdsMapGroup.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip000804PdsAttributes.hashCode();
        str += ip65504CurrentTagTable.hashCode();
       return str.hashCode();
    }

    public CheckForDePdsMtiInCtx clone() {
        CheckForDePdsMtiInCtx cloneObj = new CheckForDePdsMtiInCtx();
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        cloneObj.ip00321EditListRec = new Ip00321EditListRec();
        cloneObj.ip00321EditListRec.set(ip00321EditListRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip000804PdsAttributes = new Ip000804PdsAttributes();
        cloneObj.ip000804PdsAttributes.set(ip000804PdsAttributes.getClonedField());
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        return cloneObj;
    }

    }

    public CheckForDePdsMtiInCtx getCheckForDePdsMtiInCtx() {
            return new CheckForDePdsMtiInCtx();
    }
     public class CheckForDePdsMtiOutCtx implements Cloneable {
     Ip000604DeAttrTable ip000604DeAttrTable = Ip202330Ctx.this.getIp000604DeAttrTable();
     Ip00321EditListRec ip00321EditListRec = Ip202330Ctx.this.getIp00321EditListRec();
     Work work = Ip202330Ctx.this.getWork();
     Ip65504PdsMapGroup ip65504PdsMapGroup = Ip202330Ctx.this.getIp65504PdsMapGroup();
     Ip65504DeMapGroup ip65504DeMapGroup = Ip202330Ctx.this.getIp65504DeMapGroup();
     Ip000804PdsAttributes ip000804PdsAttributes = Ip202330Ctx.this.getIp000804PdsAttributes();
     Ip65504CurrentTagTable ip65504CurrentTagTable = Ip202330Ctx.this.getIp65504CurrentTagTable();

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
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of ip000804PdsFormat
	 *	@return ip000804PdsFormat
	 */
   public char[] getIp000804PdsFormat(int index) throws CFException  {              
   		return ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).getIp000804PdsFormat();
   }

  
	/**
	*  set variable ip000804PdsFormat
	*  @param value
	**/
   public void setIp000804PdsFormat(int index,char[] value) throws CFException {
      ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsFormat(value);
   } 

     /**
	 * 	Update Ip000804PdsFormat 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000804PdsFormat(int index,char[] source, int sourceIndex) throws CFException {
      ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsFormat(source, sourceIndex);
   	
   }
   
   public void setIp000804PdsFormat(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsFormat(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip000804PdsFormat 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000804PdsFormat(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsFormat(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip000804PdsFormat with another Field
	 *	@param value
	 */
   public void setIp000804PdsFormat(int index,Field source) {
      ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsFormat(source);
   }  
   
     /**
	 * 	Update Ip000804PdsFormat 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000804PdsFormat(int index,Field source, int sourceIndex,int sourceLen) {
      ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsFormat(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip000804PdsFormat 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000804PdsFormat(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(index).setIp000804PdsFormat(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIp65504P(int ip65504P) { 
    Ip202330Ctx.this.ip65504P = ip65504P;
}

public int getIp65504P() { 
    return Ip202330Ctx.this.ip65504P;
}

public void setIp000804I(int ip000804I) { 
    Ip202330Ctx.this.ip000804I = ip000804I;
}

public int getIp000804I() { 
    return Ip202330Ctx.this.ip000804I;
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
	 *	Returns the value of numericSyntax300
	 *	@return numericSyntax300
	 */
   public char[] getNumericSyntax300() throws CFException  {              
   		return work.getNumericSyntax300();
   }

  
	/**
	*  set variable numericSyntax300
	*  @param value
	**/
   public void setNumericSyntax300(char[] value) throws CFException {
      work.setNumericSyntax300(value);
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
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateSyntax800
	 *	@return candidateSyntax800
	 */
   public char[] getCandidateSyntax800() throws CFException  {              
   		return work.getCandidateSyntax800();
   }

  
	/**
	*  set variable candidateSyntax800
	*  @param value
	**/
   public void setCandidateSyntax800(char[] value) throws CFException {
      work.setCandidateSyntax800(value);
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
    Ip202330Ctx.this.ip65504T = ip65504T;
}

public int getIp65504T() { 
    return Ip202330Ctx.this.ip65504T;
}

public void setIp65504D(int ip65504D) { 
    Ip202330Ctx.this.ip65504D = ip65504D;
}

public int getIp65504D() { 
    return Ip202330Ctx.this.ip65504D;
}
	/**
	 *	Returns the value of ip000604DeFormat
	 *	@return ip000604DeFormat
	 */
   public char[] getIp000604DeFormat(int index) throws CFException  {              
   		return ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeAttrUserRow().getIp000604DeFormat();
   }

  
	/**
	*  set variable ip000604DeFormat
	*  @param value
	**/
   public void setIp000604DeFormat(int index,char[] value) throws CFException {
      ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeAttrUserRow().setIp000604DeFormat(value);
   } 

     /**
	 * 	Update Ip000604DeFormat 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000604DeFormat(int index,char[] source, int sourceIndex) throws CFException {
      ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeAttrUserRow().setIp000604DeFormat(source, sourceIndex);
   	
   }
   
   public void setIp000604DeFormat(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeAttrUserRow().setIp000604DeFormat(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip000604DeFormat 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000604DeFormat(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeAttrUserRow().setIp000604DeFormat(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip000604DeFormat with another Field
	 *	@param value
	 */
   public void setIp000604DeFormat(int index,Field source) {
      ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeAttrUserRow().setIp000604DeFormat(source);
   }  
   
     /**
	 * 	Update Ip000604DeFormat 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000604DeFormat(int index,Field source, int sourceIndex,int sourceLen) {
      ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeAttrUserRow().setIp000604DeFormat(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip000604DeFormat 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000604DeFormat(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip000604DeAttrTable.getIp000604DeAttrRow(index).getIp000604DeAttrUserRow().setIp000604DeFormat(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIp000604I(int ip000604I) { 
    Ip202330Ctx.this.ip000604I = ip000604I;
}

public int getIp000604I() { 
    return Ip202330Ctx.this.ip000604I;
}

        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip000604DeAttrTable.hashCode();
        str += ip00321EditListRec.hashCode();
        str += work.hashCode();
        str += ip65504PdsMapGroup.hashCode();
        str += ip65504DeMapGroup.hashCode();
        str += ip000804PdsAttributes.hashCode();
        str += ip65504CurrentTagTable.hashCode();
       return str.hashCode();
    }

    public CheckForDePdsMtiOutCtx clone() {
        CheckForDePdsMtiOutCtx cloneObj = new CheckForDePdsMtiOutCtx();
        cloneObj.ip000604DeAttrTable = new Ip000604DeAttrTable();
        cloneObj.ip000604DeAttrTable.set(ip000604DeAttrTable.getClonedField());
        cloneObj.ip00321EditListRec = new Ip00321EditListRec();
        cloneObj.ip00321EditListRec.set(ip00321EditListRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504PdsMapGroup = new Ip65504PdsMapGroup();
        cloneObj.ip65504PdsMapGroup.set(ip65504PdsMapGroup.getClonedField());
        cloneObj.ip65504DeMapGroup = new Ip65504DeMapGroup();
        cloneObj.ip65504DeMapGroup.set(ip65504DeMapGroup.getClonedField());
        cloneObj.ip000804PdsAttributes = new Ip000804PdsAttributes();
        cloneObj.ip000804PdsAttributes.set(ip000804PdsAttributes.getClonedField());
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        return cloneObj;
    }

    }

    public CheckForDePdsMtiOutCtx getCheckForDePdsMtiOutCtx() {
            return new CheckForDePdsMtiOutCtx();
    }
     public class PerformPrimaryEditInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     AdditionalSyntaxChecksGroup100 additionalSyntaxChecksGroup100 = Ip202330Ctx.this.getAdditionalSyntaxChecksGroup100();

	/**
	 *	Test condition "AS" for isAlphabetSpace88800()
	 *	@return  Returns true if isAlphabetSpace88800() is "AS"
	 */
   public boolean isAlphabetSpace88800() throws CFException {
      return work.isAlphabetSpace88800();
   }

	/**
	*  set values "AS"
	*/
   	public void setAlphabetSpace88800True()  throws CFException{  			
    	work.setAlphabetSpace88800True();
   	}
	/**
	 *	Test condition "AN" for isAlphabetNumeric88800()
	 *	@return  Returns true if isAlphabetNumeric88800() is "AN"
	 */
   public boolean isAlphabetNumeric88800() throws CFException {
      return work.isAlphabetNumeric88800();
   }

	/**
	*  set values "AN"
	*/
   	public void setAlphabetNumeric88800True()  throws CFException{  			
    	work.setAlphabetNumeric88800True();
   	}
	/**
	 *	Test condition "ANS" for isAlphanumSpecial88800()
	 *	@return  Returns true if isAlphanumSpecial88800() is "ANS"
	 */
   public boolean isAlphanumSpecial88800() throws CFException {
      return work.isAlphanumSpecial88800();
   }

	/**
	*  set values "ANS"
	*/
   	public void setAlphanumSpecial88800True()  throws CFException{  			
    	work.setAlphanumSpecial88800True();
   	}
	/**
	 *	Test condition "A" for isAlphabet88800()
	 *	@return  Returns true if isAlphabet88800() is "A"
	 */
   public boolean isAlphabet88800() throws CFException {
      return work.isAlphabet88800();
   }

	/**
	*  set values "A"
	*/
   	public void setAlphabet88800True()  throws CFException{  			
    	work.setAlphabet88800True();
   	}
	/**
	 *	Test condition "P" for isPad88800()
	 *	@return  Returns true if isPad88800() is "P"
	 */
   public boolean isPad88800() throws CFException {
      return work.isPad88800();
   }

	/**
	*  set values "P"
	*/
   	public void setPad88800True()  throws CFException{  			
    	work.setPad88800True();
   	}
	/**
	 *	Test condition "ANP" for isAlphanumPad88800()
	 *	@return  Returns true if isAlphanumPad88800() is "ANP"
	 */
   public boolean isAlphanumPad88800() throws CFException {
      return work.isAlphanumPad88800();
   }

	/**
	*  set values "ANP"
	*/
   	public void setAlphanumPad88800True()  throws CFException{  			
    	work.setAlphanumPad88800True();
   	}
	/**
	 *	Test condition "Z" for isTrackData88800()
	 *	@return  Returns true if isTrackData88800() is "Z"
	 */
   public boolean isTrackData88800() throws CFException {
      return work.isTrackData88800();
   }

	/**
	*  set values "Z"
	*/
   	public void setTrackData88800True()  throws CFException{  			
    	work.setTrackData88800True();
   	}
	/**
	 *	Test condition "P" for isAlphanumericSpace88100()
	 *	@return  Returns true if isAlphanumericSpace88100() is "P"
	 */
   public boolean isAlphanumericSpace88100() throws CFException {
      return additionalSyntaxChecksGroup100.isAlphanumericSpace88100();
   }

	/**
	*  set values "P"
	*/
   	public void setAlphanumericSpace88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setAlphanumericSpace88100True();
   	}
	/**
	 *	Test condition "N" for isAlpnumNotSpaceZero88100()
	 *	@return  Returns true if isAlpnumNotSpaceZero88100() is "N"
	 */
   public boolean isAlpnumNotSpaceZero88100() throws CFException {
      return additionalSyntaxChecksGroup100.isAlpnumNotSpaceZero88100();
   }

	/**
	*  set values "N"
	*/
   	public void setAlpnumNotSpaceZero88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setAlpnumNotSpaceZero88100True();
   	}
	/**
	 *	Test condition "X" for isCreditOrDebit88800()
	 *	@return  Returns true if isCreditOrDebit88800() is "X"
	 */
   public boolean isCreditOrDebit88800() throws CFException {
      return work.isCreditOrDebit88800();
   }

	/**
	*  set values "X"
	*/
   	public void setCreditOrDebit88800True()  throws CFException{  			
    	work.setCreditOrDebit88800True();
   	}
	/**
	 *	Test condition "NS" for isNumericSpace88800()
	 *	@return  Returns true if isNumericSpace88800() is "NS"
	 */
   public boolean isNumericSpace88800() throws CFException {
      return work.isNumericSpace88800();
   }

	/**
	*  set values "NS"
	*/
   	public void setNumericSpace88800True()  throws CFException{  			
    	work.setNumericSpace88800True();
   	}
	/**
	 *	Test condition "B" for isBinary88800()
	 *	@return  Returns true if isBinary88800() is "B"
	 */
   public boolean isBinary88800() throws CFException {
      return work.isBinary88800();
   }

	/**
	*  set values "B"
	*/
   	public void setBinary88800True()  throws CFException{  			
    	work.setBinary88800True();
   	}
	/**
	 *	Test condition "S" for isSpecial88800()
	 *	@return  Returns true if isSpecial88800() is "S"
	 */
   public boolean isSpecial88800() throws CFException {
      return work.isSpecial88800();
   }

	/**
	*  set values "S"
	*/
   	public void setSpecial88800True()  throws CFException{  			
    	work.setSpecial88800True();
   	}
	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Test condition "N" for isNumeric88800()
	 *	@return  Returns true if isNumeric88800() is "N"
	 */
   public boolean isNumeric88800() throws CFException {
      return work.isNumeric88800();
   }

	/**
	*  set values "N"
	*/
   	public void setNumeric88800True()  throws CFException{  			
    	work.setNumeric88800True();
   	}
	/**
	 *	Test condition "M" for isAlpnumDasNtAlSpc88100()
	 *	@return  Returns true if isAlpnumDasNtAlSpc88100() is "M"
	 */
   public boolean isAlpnumDasNtAlSpc88100() throws CFException {
      return additionalSyntaxChecksGroup100.isAlpnumDasNtAlSpc88100();
   }

	/**
	*  set values "M"
	*/
   	public void setAlpnumDasNtAlSpc88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setAlpnumDasNtAlSpc88100True();
   	}

        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public PerformPrimaryEditOutCtx getPerformPrimaryEditOutCtx() {
            return new PerformPrimaryEditOutCtx();
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

    public PerformPrimaryEditInCtx clone() {
        PerformPrimaryEditInCtx cloneObj = new PerformPrimaryEditInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.additionalSyntaxChecksGroup100 = new AdditionalSyntaxChecksGroup100();
        cloneObj.additionalSyntaxChecksGroup100.set(additionalSyntaxChecksGroup100.getClonedField());
        return cloneObj;
    }

    }

    public PerformPrimaryEditInCtx getPerformPrimaryEditInCtx() {
            return new PerformPrimaryEditInCtx();
    }
     public class PerformPrimaryEditOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     AdditionalSyntaxChecksGroup100 additionalSyntaxChecksGroup100 = Ip202330Ctx.this.getAdditionalSyntaxChecksGroup100();

	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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

    public PerformPrimaryEditOutCtx clone() {
        PerformPrimaryEditOutCtx cloneObj = new PerformPrimaryEditOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.additionalSyntaxChecksGroup100 = new AdditionalSyntaxChecksGroup100();
        cloneObj.additionalSyntaxChecksGroup100.set(additionalSyntaxChecksGroup100.getClonedField());
        return cloneObj;
    }

    }

    public PerformPrimaryEditOutCtx getPerformPrimaryEditOutCtx() {
            return new PerformPrimaryEditOutCtx();
    }
     public class CheckForNumericInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public CheckForNumericOutCtx getCheckForNumericOutCtx() {
            return new CheckForNumericOutCtx();
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckForNumericInCtx clone() {
        CheckForNumericInCtx cloneObj = new CheckForNumericInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckForNumericInCtx getCheckForNumericInCtx() {
            return new CheckForNumericInCtx();
    }
     public class CheckForNumericOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckForNumericOutCtx clone() {
        CheckForNumericOutCtx cloneObj = new CheckForNumericOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckForNumericOutCtx getCheckForNumericOutCtx() {
            return new CheckForNumericOutCtx();
    }
     public class CheckForAlphabeticInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public CheckForAlphabeticOutCtx getCheckForAlphabeticOutCtx() {
            return new CheckForAlphabeticOutCtx();
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckForAlphabeticInCtx clone() {
        CheckForAlphabeticInCtx cloneObj = new CheckForAlphabeticInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckForAlphabeticInCtx getCheckForAlphabeticInCtx() {
            return new CheckForAlphabeticInCtx();
    }
     public class CheckForAlphabeticOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckForAlphabeticOutCtx clone() {
        CheckForAlphabeticOutCtx cloneObj = new CheckForAlphabeticOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckForAlphabeticOutCtx getCheckForAlphabeticOutCtx() {
            return new CheckForAlphabeticOutCtx();
    }
     public class CheckForAlphabetSpaceInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public CheckForAlphabetSpaceOutCtx getCheckForAlphabetSpaceOutCtx() {
            return new CheckForAlphabetSpaceOutCtx();
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckForAlphabetSpaceInCtx clone() {
        CheckForAlphabetSpaceInCtx cloneObj = new CheckForAlphabetSpaceInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckForAlphabetSpaceInCtx getCheckForAlphabetSpaceInCtx() {
            return new CheckForAlphabetSpaceInCtx();
    }
     public class CheckForAlphabetSpaceOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckForAlphabetSpaceOutCtx clone() {
        CheckForAlphabetSpaceOutCtx cloneObj = new CheckForAlphabetSpaceOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckForAlphabetSpaceOutCtx getCheckForAlphabetSpaceOutCtx() {
            return new CheckForAlphabetSpaceOutCtx();
    }
     public class CheckForNumericSpaceInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public CheckForNumericSpaceOutCtx getCheckForNumericSpaceOutCtx() {
            return new CheckForNumericSpaceOutCtx();
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckForNumericSpaceInCtx clone() {
        CheckForNumericSpaceInCtx cloneObj = new CheckForNumericSpaceInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckForNumericSpaceInCtx getCheckForNumericSpaceInCtx() {
            return new CheckForNumericSpaceInCtx();
    }
     public class CheckForNumericSpaceOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckForNumericSpaceOutCtx clone() {
        CheckForNumericSpaceOutCtx cloneObj = new CheckForNumericSpaceOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckForNumericSpaceOutCtx getCheckForNumericSpaceOutCtx() {
            return new CheckForNumericSpaceOutCtx();
    }
     public class CheckAlphabetNumericInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public CheckAlphabetNumericOutCtx getCheckAlphabetNumericOutCtx() {
            return new CheckAlphabetNumericOutCtx();
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckAlphabetNumericInCtx clone() {
        CheckAlphabetNumericInCtx cloneObj = new CheckAlphabetNumericInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckAlphabetNumericInCtx getCheckAlphabetNumericInCtx() {
            return new CheckAlphabetNumericInCtx();
    }
     public class CheckAlphabetNumericOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckAlphabetNumericOutCtx clone() {
        CheckAlphabetNumericOutCtx cloneObj = new CheckAlphabetNumericOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckAlphabetNumericOutCtx getCheckAlphabetNumericOutCtx() {
            return new CheckAlphabetNumericOutCtx();
    }
     public class BuildAbendDataInCtx implements Cloneable {
     FormatTypeErrorMessage600 formatTypeErrorMessage600 = Ip202330Ctx.this.getFormatTypeErrorMessage600();
     Ip00321EditListRec ip00321EditListRec = Ip202330Ctx.this.getIp00321EditListRec();
     Work work = Ip202330Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip202330Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip202330Ctx.this.getAbendParaName900();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip202330Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of formatTypeErrorMessage600
	 *	@return formatTypeErrorMessage600
	 */   
	 public FormatTypeErrorMessage600 getFormatTypeErrorMessage600() {
   	return formatTypeErrorMessage600;
   }


	/**
	 *	Returns the value of formatAbendCode300
	 *	@return formatAbendCode300
	 */
   public char[] getFormatAbendCode300() throws CFException  {              
   		return work.getFormatAbendCode300();
   }

  
	/**
	*  set variable formatAbendCode300
	*  @param value
	**/
   public void setFormatAbendCode300(char[] value) throws CFException {
      work.setFormatAbendCode300(value);
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


        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public BuildAbendDataOutCtx getBuildAbendDataOutCtx() {
            return new BuildAbendDataOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += formatTypeErrorMessage600.hashCode();
        str += ip00321EditListRec.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public BuildAbendDataInCtx clone() {
        BuildAbendDataInCtx cloneObj = new BuildAbendDataInCtx();
        cloneObj.formatTypeErrorMessage600 = new FormatTypeErrorMessage600();
        cloneObj.formatTypeErrorMessage600.set(formatTypeErrorMessage600.getClonedField());
        cloneObj.ip00321EditListRec = new Ip00321EditListRec();
        cloneObj.ip00321EditListRec.set(ip00321EditListRec.getClonedField());
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

    public BuildAbendDataInCtx getBuildAbendDataInCtx() {
            return new BuildAbendDataInCtx();
    }
     public class BuildAbendDataOutCtx implements Cloneable {
     FormatTypeErrorMessage600 formatTypeErrorMessage600 = Ip202330Ctx.this.getFormatTypeErrorMessage600();
     Ip00321EditListRec ip00321EditListRec = Ip202330Ctx.this.getIp00321EditListRec();
     Work work = Ip202330Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip202330Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip202330Ctx.this.getAbendParaName900();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip202330Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of formatTypeErrorMessage600
	 *	@return formatTypeErrorMessage600
	 */   
	 public FormatTypeErrorMessage600 getFormatTypeErrorMessage600() {
   	return formatTypeErrorMessage600;
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
	 *	Returns the value of formatAbendCode300
	 *	@return formatAbendCode300
	 */
   public char[] getFormatAbendCode300() throws CFException  {              
   		return work.getFormatAbendCode300();
   }

  
	/**
	*  set variable formatAbendCode300
	*  @param value
	**/
   public void setFormatAbendCode300(char[] value) throws CFException {
      work.setFormatAbendCode300(value);
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
	 *	Returns the value of errorFieldNumber600
	 *	@return errorFieldNumber600
	 */
	public short getErrorFieldNumber600() throws CFException {
   		return formatTypeErrorMessage600.getErrorText600().getErrorFieldNumber600();
	}

    /**
	 *	Returns the String value of errorFieldNumber600
	 *	@return errorFieldNumber600
	 */
	public char[]  getErrorFieldNumber600ActualString() {
		return formatTypeErrorMessage600.getErrorText600().getErrorFieldNumber600ActualString();
	}

	/**
	 *	Returns String value of errorFieldNumber600
	 *	@return errorFieldNumber600
	 */
	public char[]  getErrorFieldNumber600String() throws CFException {
	     return String.valueOf(formatTypeErrorMessage600.getErrorText600().getErrorFieldNumber600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorFieldNumber600IsNumeric()  throws CFException{
	    return formatTypeErrorMessage600.getErrorText600().errorFieldNumber600IsNumeric();
	}

	/**
	 * 	Update ErrorFieldNumber600 with the passed value
	 *	@param number
	 */
	public void setErrorFieldNumber600(short number)  throws CFException{
		formatTypeErrorMessage600.getErrorText600().setErrorFieldNumber600(number);
	}
	
	public void setErrorFieldNumber600(int number)  throws CFException{
	    formatTypeErrorMessage600.getErrorText600().setErrorFieldNumber600(number);
	}
	public void setErrorFieldNumber600(long number)  throws CFException{
	    formatTypeErrorMessage600.getErrorText600().setErrorFieldNumber600(number);
	}
	

	
	/**
	 * 	Update ErrorFieldNumber600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorFieldNumber600(char[] value)  throws CFException {
		formatTypeErrorMessage600.getErrorText600().setErrorFieldNumber600(value);
	}
	
	/**
	 * 	Update ErrorFieldNumber600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorFieldNumber600String(char[] value)  throws CFException{
		formatTypeErrorMessage600.getErrorText600().setErrorFieldNumber600(value);
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


        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += formatTypeErrorMessage600.hashCode();
        str += ip00321EditListRec.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public BuildAbendDataOutCtx clone() {
        BuildAbendDataOutCtx cloneObj = new BuildAbendDataOutCtx();
        cloneObj.formatTypeErrorMessage600 = new FormatTypeErrorMessage600();
        cloneObj.formatTypeErrorMessage600.set(formatTypeErrorMessage600.getClonedField());
        cloneObj.ip00321EditListRec = new Ip00321EditListRec();
        cloneObj.ip00321EditListRec.set(ip00321EditListRec.getClonedField());
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

    public BuildAbendDataOutCtx getBuildAbendDataOutCtx() {
            return new BuildAbendDataOutCtx();
    }
     public class CheckAlphanumSpaceInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public CheckAlphanumSpaceOutCtx getCheckAlphanumSpaceOutCtx() {
            return new CheckAlphanumSpaceOutCtx();
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckAlphanumSpaceInCtx clone() {
        CheckAlphanumSpaceInCtx cloneObj = new CheckAlphanumSpaceInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckAlphanumSpaceInCtx getCheckAlphanumSpaceInCtx() {
            return new CheckAlphanumSpaceInCtx();
    }
     public class CheckAlphanumSpaceOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckAlphanumSpaceOutCtx clone() {
        CheckAlphanumSpaceOutCtx cloneObj = new CheckAlphanumSpaceOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckAlphanumSpaceOutCtx getCheckAlphanumSpaceOutCtx() {
            return new CheckAlphanumSpaceOutCtx();
    }
     public class CheckAlphanumDashInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public CheckAlphanumDashOutCtx getCheckAlphanumDashOutCtx() {
            return new CheckAlphanumDashOutCtx();
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckAlphanumDashInCtx clone() {
        CheckAlphanumDashInCtx cloneObj = new CheckAlphanumDashInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckAlphanumDashInCtx getCheckAlphanumDashInCtx() {
            return new CheckAlphanumDashInCtx();
    }
     public class CheckAlphanumDashOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckAlphanumDashOutCtx clone() {
        CheckAlphanumDashOutCtx cloneObj = new CheckAlphanumDashOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckAlphanumDashOutCtx getCheckAlphanumDashOutCtx() {
            return new CheckAlphanumDashOutCtx();
    }
     public class CheckNotSpaceZeroInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public CheckNotSpaceZeroOutCtx getCheckNotSpaceZeroOutCtx() {
            return new CheckNotSpaceZeroOutCtx();
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckNotSpaceZeroInCtx clone() {
        CheckNotSpaceZeroInCtx cloneObj = new CheckNotSpaceZeroInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckNotSpaceZeroInCtx getCheckNotSpaceZeroInCtx() {
            return new CheckNotSpaceZeroInCtx();
    }
     public class CheckNotSpaceZeroOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckNotSpaceZeroOutCtx clone() {
        CheckNotSpaceZeroOutCtx cloneObj = new CheckNotSpaceZeroOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckNotSpaceZeroOutCtx getCheckNotSpaceZeroOutCtx() {
            return new CheckNotSpaceZeroOutCtx();
    }
     public class CheckAdditionalSyntaxInCtx implements Cloneable {
     AdditionalSyntaxChecksGroup100 additionalSyntaxChecksGroup100 = Ip202330Ctx.this.getAdditionalSyntaxChecksGroup100();

	/**
	 *	Test condition "U" for isLeadSpaceLjAllZeros88100()
	 *	@return  Returns true if isLeadSpaceLjAllZeros88100() is "U"
	 */
   public boolean isLeadSpaceLjAllZeros88100() throws CFException {
      return additionalSyntaxChecksGroup100.isLeadSpaceLjAllZeros88100();
   }

	/**
	*  set values "U"
	*/
   	public void setLeadSpaceLjAllZeros88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setLeadSpaceLjAllZeros88100True();
   	}
	/**
	 *	Test condition "J" for isNoLhBasicPresence88100()
	 *	@return  Returns true if isNoLhBasicPresence88100() is "J"
	 */
   public boolean isNoLhBasicPresence88100() throws CFException {
      return additionalSyntaxChecksGroup100.isNoLhBasicPresence88100();
   }

	/**
	*  set values "J"
	*/
   	public void setNoLhBasicPresence88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setNoLhBasicPresence88100True();
   	}
	/**
	 *	Test condition "6" for isNotSpacesZerosAlpha88100()
	 *	@return  Returns true if isNotSpacesZerosAlpha88100() is "6"
	 */
   public boolean isNotSpacesZerosAlpha88100() throws CFException {
      return additionalSyntaxChecksGroup100.isNotSpacesZerosAlpha88100();
   }

	/**
	*  set values "6"
	*/
   	public void setNotSpacesZerosAlpha88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setNotSpacesZerosAlpha88100True();
   	}
	/**
	 *	Test condition "K" for isNoZeroBasicPresence88100()
	 *	@return  Returns true if isNoZeroBasicPresence88100() is "K"
	 */
   public boolean isNoZeroBasicPresence88100() throws CFException {
      return additionalSyntaxChecksGroup100.isNoZeroBasicPresence88100();
   }

	/**
	*  set values "K"
	*/
   	public void setNoZeroBasicPresence88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setNoZeroBasicPresence88100True();
   	}
	/**
	 *	Test condition "3" for isNotLowHighValue88100()
	 *	@return  Returns true if isNotLowHighValue88100() is "3"
	 */
   public boolean isNotLowHighValue88100() throws CFException {
      return additionalSyntaxChecksGroup100.isNotLowHighValue88100();
   }

	/**
	*  set values "3"
	*/
   	public void setNotLowHighValue88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setNotLowHighValue88100True();
   	}
	/**
	 *	Test condition "O" for isLeftJustifyNoSpcZer88100()
	 *	@return  Returns true if isLeftJustifyNoSpcZer88100() is "O"
	 */
   public boolean isLeftJustifyNoSpcZer88100() throws CFException {
      return additionalSyntaxChecksGroup100.isLeftJustifyNoSpcZer88100();
   }

	/**
	*  set values "O"
	*/
   	public void setLeftJustifyNoSpcZer88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setLeftJustifyNoSpcZer88100True();
   	}
	/**
	 *	Test condition "L" for isLeftJustifyNoBasic88100()
	 *	@return  Returns true if isLeftJustifyNoBasic88100() is "L"
	 */
   public boolean isLeftJustifyNoBasic88100() throws CFException {
      return additionalSyntaxChecksGroup100.isLeftJustifyNoBasic88100();
   }

	/**
	*  set values "L"
	*/
   	public void setLeftJustifyNoBasic88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setLeftJustifyNoBasic88100True();
   	}
	/**
	 *	Test condition "4" for isNumericNotZero88100()
	 *	@return  Returns true if isNumericNotZero88100() is "4"
	 */
   public boolean isNumericNotZero88100() throws CFException {
      return additionalSyntaxChecksGroup100.isNumericNotZero88100();
   }

	/**
	*  set values "4"
	*/
   	public void setNumericNotZero88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setNumericNotZero88100True();
   	}
	/**
	 *	Test condition "2" for isLeftJustifyNotSpace88100()
	 *	@return  Returns true if isLeftJustifyNotSpace88100() is "2"
	 */
   public boolean isLeftJustifyNotSpace88100() throws CFException {
      return additionalSyntaxChecksGroup100.isLeftJustifyNotSpace88100();
   }

	/**
	*  set values "2"
	*/
   	public void setLeftJustifyNotSpace88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setLeftJustifyNotSpace88100True();
   	}
	/**
	 *	Test condition "D" for isNotSpacesZerosNine88100()
	 *	@return  Returns true if isNotSpacesZerosNine88100() is "D"
	 */
   public boolean isNotSpacesZerosNine88100() throws CFException {
      return additionalSyntaxChecksGroup100.isNotSpacesZerosNine88100();
   }

	/**
	*  set values "D"
	*/
   	public void setNotSpacesZerosNine88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setNotSpacesZerosNine88100True();
   	}
	/**
	 *	Test condition "7" for isNotAllSpaces88100()
	 *	@return  Returns true if isNotAllSpaces88100() is "7"
	 */
   public boolean isNotAllSpaces88100() throws CFException {
      return additionalSyntaxChecksGroup100.isNotAllSpaces88100();
   }

	/**
	*  set values "7"
	*/
   	public void setNotAllSpaces88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setNotAllSpaces88100True();
   	}
	/**
	 *	Test condition "E" for isNotSpacesOrZeros88100()
	 *	@return  Returns true if isNotSpacesOrZeros88100() is "E"
	 */
   public boolean isNotSpacesOrZeros88100() throws CFException {
      return additionalSyntaxChecksGroup100.isNotSpacesOrZeros88100();
   }

	/**
	*  set values "E"
	*/
   	public void setNotSpacesOrZeros88100True()  throws CFException{  			
    	additionalSyntaxChecksGroup100.setNotSpacesOrZeros88100True();
   	}

        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += additionalSyntaxChecksGroup100.hashCode();
       return str.hashCode();
    }

    public CheckAdditionalSyntaxInCtx clone() {
        CheckAdditionalSyntaxInCtx cloneObj = new CheckAdditionalSyntaxInCtx();
        cloneObj.additionalSyntaxChecksGroup100 = new AdditionalSyntaxChecksGroup100();
        cloneObj.additionalSyntaxChecksGroup100.set(additionalSyntaxChecksGroup100.getClonedField());
        return cloneObj;
    }

    }

    public CheckAdditionalSyntaxInCtx getCheckAdditionalSyntaxInCtx() {
            return new CheckAdditionalSyntaxInCtx();
    }
     public class CheckNumericNotZeroInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public CheckNumericNotZeroOutCtx getCheckNumericNotZeroOutCtx() {
            return new CheckNumericNotZeroOutCtx();
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckNumericNotZeroInCtx clone() {
        CheckNumericNotZeroInCtx cloneObj = new CheckNumericNotZeroInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckNumericNotZeroInCtx getCheckNumericNotZeroInCtx() {
            return new CheckNumericNotZeroInCtx();
    }
     public class CheckNumericNotZeroOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckNumericNotZeroOutCtx clone() {
        CheckNumericNotZeroOutCtx cloneObj = new CheckNumericNotZeroOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckNumericNotZeroOutCtx getCheckNumericNotZeroOutCtx() {
            return new CheckNumericNotZeroOutCtx();
    }
     public class CheckNotAllSpacesInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public CheckNotAllSpacesOutCtx getCheckNotAllSpacesOutCtx() {
            return new CheckNotAllSpacesOutCtx();
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckNotAllSpacesInCtx clone() {
        CheckNotAllSpacesInCtx cloneObj = new CheckNotAllSpacesInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckNotAllSpacesInCtx getCheckNotAllSpacesInCtx() {
            return new CheckNotAllSpacesInCtx();
    }
     public class CheckNotAllSpacesOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckNotAllSpacesOutCtx clone() {
        CheckNotAllSpacesOutCtx cloneObj = new CheckNotAllSpacesOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckNotAllSpacesOutCtx getCheckNotAllSpacesOutCtx() {
            return new CheckNotAllSpacesOutCtx();
    }
     public class CheckNotSpacesOrZerosInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public CheckNotSpacesOrZerosOutCtx getCheckNotSpacesOrZerosOutCtx() {
            return new CheckNotSpacesOrZerosOutCtx();
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckNotSpacesOrZerosInCtx clone() {
        CheckNotSpacesOrZerosInCtx cloneObj = new CheckNotSpacesOrZerosInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckNotSpacesOrZerosInCtx getCheckNotSpacesOrZerosInCtx() {
            return new CheckNotSpacesOrZerosInCtx();
    }
     public class CheckNotSpacesOrZerosOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckNotSpacesOrZerosOutCtx clone() {
        CheckNotSpacesOrZerosOutCtx cloneObj = new CheckNotSpacesOrZerosOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckNotSpacesOrZerosOutCtx getCheckNotSpacesOrZerosOutCtx() {
            return new CheckNotSpacesOrZerosOutCtx();
    }
     public class CheckNotSpaceZeroNineInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of startIndex800
	 *	@return startIndex800
	 */
	public short getStartIndex800() throws CFException {        
   		return work.getStartIndex800();
	}
	
	/**
	 * 	Update StartIndex800 with the passed value
	 *	@param number
	 */
	public void setStartIndex800(short number)  throws CFException{
		work.setStartIndex800(number);
	}

	public void setStartIndex800(int number)  throws CFException{
		work.setStartIndex800((short)number);
	}

	public void setStartIndex800(long number)  throws CFException{
		work.setStartIndex800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of value9300
	 *	@return value9300
	 */
   public char[] getValue9300() throws CFException  {              
   		return work.getValue9300();
   }

  
	/**
	*  set variable value9300
	*  @param value
	**/
   public void setValue9300(char[] value) throws CFException {
      work.setValue9300(value);
   } 

	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public CheckNotSpaceZeroNineOutCtx getCheckNotSpaceZeroNineOutCtx() {
            return new CheckNotSpaceZeroNineOutCtx();
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckNotSpaceZeroNineInCtx clone() {
        CheckNotSpaceZeroNineInCtx cloneObj = new CheckNotSpaceZeroNineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckNotSpaceZeroNineInCtx getCheckNotSpaceZeroNineInCtx() {
            return new CheckNotSpaceZeroNineInCtx();
    }
     public class CheckNotSpaceZeroNineOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of startIndex800
	 *	@return startIndex800
	 */
	public short getStartIndex800() throws CFException {        
   		return work.getStartIndex800();
	}
	
	/**
	 * 	Update StartIndex800 with the passed value
	 *	@param number
	 */
	public void setStartIndex800(short number)  throws CFException{
		work.setStartIndex800(number);
	}

	public void setStartIndex800(int number)  throws CFException{
		work.setStartIndex800((short)number);
	}

	public void setStartIndex800(long number)  throws CFException{
		work.setStartIndex800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Returns the value of elementStart800
	 *	@return elementStart800
	 */
	public short getElementStart800() throws CFException {        
   		return work.getElementStart800();
	}
	
	/**
	 * 	Update ElementStart800 with the passed value
	 *	@param number
	 */
	public void setElementStart800(short number)  throws CFException{
		work.setElementStart800(number);
	}

	public void setElementStart800(int number)  throws CFException{
		work.setElementStart800((short)number);
	}

	public void setElementStart800(long number)  throws CFException{
		work.setElementStart800((short)number);
	}




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckNotSpaceZeroNineOutCtx clone() {
        CheckNotSpaceZeroNineOutCtx cloneObj = new CheckNotSpaceZeroNineOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckNotSpaceZeroNineOutCtx getCheckNotSpaceZeroNineOutCtx() {
            return new CheckNotSpaceZeroNineOutCtx();
    }
     public class LeftJustifyNotSpaceInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public LeftJustifyNotSpaceOutCtx getLeftJustifyNotSpaceOutCtx() {
            return new LeftJustifyNotSpaceOutCtx();
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public LeftJustifyNotSpaceInCtx clone() {
        LeftJustifyNotSpaceInCtx cloneObj = new LeftJustifyNotSpaceInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public LeftJustifyNotSpaceInCtx getLeftJustifyNotSpaceInCtx() {
            return new LeftJustifyNotSpaceInCtx();
    }
     public class LeftJustifyNotSpaceOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public LeftJustifyNotSpaceOutCtx clone() {
        LeftJustifyNotSpaceOutCtx cloneObj = new LeftJustifyNotSpaceOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public LeftJustifyNotSpaceOutCtx getLeftJustifyNotSpaceOutCtx() {
            return new LeftJustifyNotSpaceOutCtx();
    }
     public class LeftJustifyNoSpcZerInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public LeftJustifyNoSpcZerOutCtx getLeftJustifyNoSpcZerOutCtx() {
            return new LeftJustifyNoSpcZerOutCtx();
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public LeftJustifyNoSpcZerInCtx clone() {
        LeftJustifyNoSpcZerInCtx cloneObj = new LeftJustifyNoSpcZerInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public LeftJustifyNoSpcZerInCtx getLeftJustifyNoSpcZerInCtx() {
            return new LeftJustifyNoSpcZerInCtx();
    }
     public class LeftJustifyNoSpcZerOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public LeftJustifyNoSpcZerOutCtx clone() {
        LeftJustifyNoSpcZerOutCtx cloneObj = new LeftJustifyNoSpcZerOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public LeftJustifyNoSpcZerOutCtx getLeftJustifyNoSpcZerOutCtx() {
            return new LeftJustifyNoSpcZerOutCtx();
    }
     public class CheckNotSpcZerAlphaInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public CheckNotSpcZerAlphaOutCtx getCheckNotSpcZerAlphaOutCtx() {
            return new CheckNotSpcZerAlphaOutCtx();
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckNotSpcZerAlphaInCtx clone() {
        CheckNotSpcZerAlphaInCtx cloneObj = new CheckNotSpcZerAlphaInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckNotSpcZerAlphaInCtx getCheckNotSpcZerAlphaInCtx() {
            return new CheckNotSpcZerAlphaInCtx();
    }
     public class CheckNotSpcZerAlphaOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckNotSpcZerAlphaOutCtx clone() {
        CheckNotSpcZerAlphaOutCtx cloneObj = new CheckNotSpcZerAlphaOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckNotSpcZerAlphaOutCtx getCheckNotSpcZerAlphaOutCtx() {
            return new CheckNotSpcZerAlphaOutCtx();
    }
     public class LeadSpaceLjAllZerosInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public LeadSpaceLjAllZerosOutCtx getLeadSpaceLjAllZerosOutCtx() {
            return new LeadSpaceLjAllZerosOutCtx();
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public LeadSpaceLjAllZerosInCtx clone() {
        LeadSpaceLjAllZerosInCtx cloneObj = new LeadSpaceLjAllZerosInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public LeadSpaceLjAllZerosInCtx getLeadSpaceLjAllZerosInCtx() {
            return new LeadSpaceLjAllZerosInCtx();
    }
     public class LeadSpaceLjAllZerosOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public LeadSpaceLjAllZerosOutCtx clone() {
        LeadSpaceLjAllZerosOutCtx cloneObj = new LeadSpaceLjAllZerosOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public LeadSpaceLjAllZerosOutCtx getLeadSpaceLjAllZerosOutCtx() {
            return new LeadSpaceLjAllZerosOutCtx();
    }
     public class CallPgmIp200110InCtx implements Cloneable {
     StrtLngth800 strtLngth800 = Ip202330Ctx.this.getStrtLngth800();
     Work work = Ip202330Ctx.this.getWork();

	/**
	 *	Returns the value of candidateLnth800
	 *	@return candidateLnth800
	 */
	public short getCandidateLnth800() throws CFException {        
   		return strtLngth800.getCandidateLnth800();
	}
	
	/**
	 * 	Update CandidateLnth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLnth800(short number)  throws CFException{
		strtLngth800.setCandidateLnth800(number);
	}

	public void setCandidateLnth800(int number)  throws CFException{
		strtLngth800.setCandidateLnth800((short)number);
	}

	public void setCandidateLnth800(long number)  throws CFException{
		strtLngth800.setCandidateLnth800((short)number);
	}



	/**
	 *	Returns the value of candidateStrt800
	 *	@return candidateStrt800
	 */
	public short getCandidateStrt800() throws CFException {        
   		return strtLngth800.getCandidateStrt800();
	}
	
	/**
	 * 	Update CandidateStrt800 with the passed value
	 *	@param number
	 */
	public void setCandidateStrt800(short number)  throws CFException{
		strtLngth800.setCandidateStrt800(number);
	}

	public void setCandidateStrt800(int number)  throws CFException{
		strtLngth800.setCandidateStrt800((short)number);
	}

	public void setCandidateStrt800(long number)  throws CFException{
		strtLngth800.setCandidateStrt800((short)number);
	}



	/**
	 *	Returns the value of ptrIp200110800
	 *	@return ptrIp200110800
	 */
   public char[] getPtrIp200110800() throws CFException  {              
   		return work.getPtrIp200110800();
   }

  
	/**
	*  set variable ptrIp200110800
	*  @param value
	**/
   public void setPtrIp200110800(char[] value) throws CFException {
      work.setPtrIp200110800(value);
   } 


        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public CallPgmIp200110OutCtx getCallPgmIp200110OutCtx() {
            return new CallPgmIp200110OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += strtLngth800.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CallPgmIp200110InCtx clone() {
        CallPgmIp200110InCtx cloneObj = new CallPgmIp200110InCtx();
        cloneObj.strtLngth800 = new StrtLngth800();
        cloneObj.strtLngth800.set(strtLngth800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CallPgmIp200110InCtx getCallPgmIp200110InCtx() {
            return new CallPgmIp200110InCtx();
    }
     public class CallPgmIp200110OutCtx implements Cloneable {
     StrtLngth800 strtLngth800 = Ip202330Ctx.this.getStrtLngth800();
     Work work = Ip202330Ctx.this.getWork();

	/**
	 *	Returns the value of candidateLnth800
	 *	@return candidateLnth800
	 */
	public short getCandidateLnth800() throws CFException {        
   		return strtLngth800.getCandidateLnth800();
	}
	
	/**
	 * 	Update CandidateLnth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLnth800(short number)  throws CFException{
		strtLngth800.setCandidateLnth800(number);
	}

	public void setCandidateLnth800(int number)  throws CFException{
		strtLngth800.setCandidateLnth800((short)number);
	}

	public void setCandidateLnth800(long number)  throws CFException{
		strtLngth800.setCandidateLnth800((short)number);
	}



	/**
	 *	Returns the value of candidateStrt800
	 *	@return candidateStrt800
	 */
	public short getCandidateStrt800() throws CFException {        
   		return strtLngth800.getCandidateStrt800();
	}
	
	/**
	 * 	Update CandidateStrt800 with the passed value
	 *	@param number
	 */
	public void setCandidateStrt800(short number)  throws CFException{
		strtLngth800.setCandidateStrt800(number);
	}

	public void setCandidateStrt800(int number)  throws CFException{
		strtLngth800.setCandidateStrt800((short)number);
	}

	public void setCandidateStrt800(long number)  throws CFException{
		strtLngth800.setCandidateStrt800((short)number);
	}



	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += strtLngth800.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CallPgmIp200110OutCtx clone() {
        CallPgmIp200110OutCtx cloneObj = new CallPgmIp200110OutCtx();
        cloneObj.strtLngth800 = new StrtLngth800();
        cloneObj.strtLngth800.set(strtLngth800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CallPgmIp200110OutCtx getCallPgmIp200110OutCtx() {
            return new CallPgmIp200110OutCtx();
    }
     public class CheckNotLowHighValueInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}



	/**
	 *	Returns the value of ip66102IpmMsg
	 *	@return ip66102IpmMsg
	 */   
	 public Ip66102IpmMsg getIp66102IpmMsg() {
   	return ip66102IpmMsg;
   }



        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
        }

        public CheckNotLowHighValueOutCtx getCheckNotLowHighValueOutCtx() {
            return new CheckNotLowHighValueOutCtx();
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckNotLowHighValueInCtx clone() {
        CheckNotLowHighValueInCtx cloneObj = new CheckNotLowHighValueInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckNotLowHighValueInCtx getCheckNotLowHighValueInCtx() {
            return new CheckNotLowHighValueInCtx();
    }
     public class CheckNotLowHighValueOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     Ip66102IpmMsg ip66102IpmMsg = Ip202330Ctx.this.getIp66102IpmMsg();

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {        
   		return work.getCandidateLngth800();
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *	@param number
	 */
	public void setCandidateLngth800(short number)  throws CFException{
		work.setCandidateLngth800(number);
	}

	public void setCandidateLngth800(int number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}

	public void setCandidateLngth800(long number)  throws CFException{
		work.setCandidateLngth800((short)number);
	}



	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {        
   		return work.getCandidateStart800();
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *	@param number
	 */
	public void setCandidateStart800(short number)  throws CFException{
		work.setCandidateStart800(number);
	}

	public void setCandidateStart800(int number)  throws CFException{
		work.setCandidateStart800((short)number);
	}

	public void setCandidateStart800(long number)  throws CFException{
		work.setCandidateStart800((short)number);
	}



	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(short number)  throws CFException{
		work.setValueOne300(number);
	}

	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300((short)number);
	}

	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((short)number);
	}




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += ip66102IpmMsg.hashCode();
       return str.hashCode();
    }

    public CheckNotLowHighValueOutCtx clone() {
        CheckNotLowHighValueOutCtx cloneObj = new CheckNotLowHighValueOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66102IpmMsg = new Ip66102IpmMsg();
        cloneObj.ip66102IpmMsg.set(ip66102IpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public CheckNotLowHighValueOutCtx getCheckNotLowHighValueOutCtx() {
            return new CheckNotLowHighValueOutCtx();
    }
     public class TerminateOnErrorInCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip202330Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip202330Ctx.this.getAbendParaName900();

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

	/**
	 *	Returns the value of abendMessage900
	 *	@return abendMessage900
	 */   
	 public AbendMessage900 getAbendMessage900() {
   	return abendMessage900;
   }


	/**
	 *	Returns the value of abendParaName900
	 *	@return abendParaName900
	 */   
	 public AbendParaName900 getAbendParaName900() {
   	return abendParaName900;
   }



        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
       return str.hashCode();
    }

    public TerminateOnErrorInCtx clone() {
        TerminateOnErrorInCtx cloneObj = new TerminateOnErrorInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        return cloneObj;
    }

    }

    public TerminateOnErrorInCtx getTerminateOnErrorInCtx() {
            return new TerminateOnErrorInCtx();
    }
     public class TerminateOnErrorOutCtx implements Cloneable {
     Work work = Ip202330Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip202330Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip202330Ctx.this.getAbendParaName900();


        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
       return str.hashCode();
    }

    public TerminateOnErrorOutCtx clone() {
        TerminateOnErrorOutCtx cloneObj = new TerminateOnErrorOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        return cloneObj;
    }

    }

    public TerminateOnErrorOutCtx getTerminateOnErrorOutCtx() {
            return new TerminateOnErrorOutCtx();
    }
     public class UpdateEventLogInCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip202330Ctx.this.getIp60001EventLogWorkArea();

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




        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip202330Ctx.this.getIp60001EventLogWorkArea();

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


        public Ip202330Ctx getIp202330Ctx() {
            return Ip202330Ctx.this;
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
