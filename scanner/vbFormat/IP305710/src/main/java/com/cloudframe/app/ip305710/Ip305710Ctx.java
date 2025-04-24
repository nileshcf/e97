package com.cloudframe.app.ip305710;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.global.sharedvar.Ip570004TableDataInfo;
import com.cloudframe.app.ip305710.dto.Work;
import com.cloudframe.app.global.sharedvar.Ip005704EntryFoundGroup;
import com.cloudframe.app.global.sharedvar.Ip50005oTableId;
import com.cloudframe.app.global.sharedvar.Ip50004iOneDayReadStatusGroup;
import com.cloudframe.app.global.sharedvar.Ip35501RelativeRecNumGroup;
import com.cloudframe.app.global.sharedvar.Ip50005oClearingDtTm;
import com.cloudframe.app.ip305710.dto.AbendMessage900;
import com.cloudframe.app.global.sharedvar.Ip50004iOneDayRecLthGroup;
import com.cloudframe.app.ip305710.dto.Ip005704TableData;
import com.cloudframe.app.global.sharedvar.Ip50005oOneDayRec;
import com.cloudframe.app.global.sharedvar.Ip50005oOneDayReadStatusGroup;
import com.cloudframe.app.ip305710.dto.MaxRrnLimitErr620;
import com.cloudframe.app.global.sharedvar.Ip50004iReadTableIdGroup;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.global.sharedvar.Ip50004iOneDayRec;
import com.cloudframe.app.ip305710.dto.Ip005703TableData;
import com.cloudframe.app.global.sharedvar.Ip005704SrchProdClassGroup;
import com.cloudframe.app.global.sharedvar.Ip50005oOneDayRecLthGroup;
import com.cloudframe.app.ip305710.dto.AbendParaName900;


@Context
public class Ip305710Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Ip005704EntryFoundGroup ip005704EntryFoundGroup;
    Ip005704SrchProdClassGroup ip005704SrchProdClassGroup;
    Ip50004iOneDayRecLthGroup ip50004iOneDayRecLthGroup;
    Ip50005oOneDayReadStatusGroup ip50005oOneDayReadStatusGroup;
    Ip50005oClearingDtTm ip50005oClearingDtTm;
    AbendParaName900 abendParaName900;
    Ip005704TableData ip005704TableData;
    MaxRrnLimitErr620 maxRrnLimitErr620;
    AbendMessage900 abendMessage900;
    Ip50004iOneDayReadStatusGroup ip50004iOneDayReadStatusGroup;
    Ip50004iOneDayRec ip50004iOneDayRec;
    Ip50005oOneDayRec ip50005oOneDayRec;
    Ip60001EventLogWorkArea ip60001EventLogWorkArea;
    Ip996011ProgramStartMessage ip996011ProgramStartMessage;
    Ip50005oOneDayRecLthGroup ip50005oOneDayRecLthGroup;
    Ip005703TableData ip005703TableData;
    Ip35501RelativeRecNumGroup ip35501RelativeRecNumGroup;
    Ip570004TableDataInfo ip570004TableDataInfo;
    Work work;
    Ip50004iReadTableIdGroup ip50004iReadTableIdGroup;


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


    public Ip005704EntryFoundGroup getIp005704EntryFoundGroup() {
        if (ip005704EntryFoundGroup == null) {
            ip005704EntryFoundGroup = globalCtx.getGlobalDto(Ip005704EntryFoundGroup.class);
        }

        return ip005704EntryFoundGroup;
    }

    public Ip005704SrchProdClassGroup getIp005704SrchProdClassGroup() {
        if (ip005704SrchProdClassGroup == null) {
            ip005704SrchProdClassGroup = globalCtx.getGlobalDto(Ip005704SrchProdClassGroup.class);
        }

        return ip005704SrchProdClassGroup;
    }

    public Ip50004iOneDayRecLthGroup getIp50004iOneDayRecLthGroup() {
        if (ip50004iOneDayRecLthGroup == null) {
            ip50004iOneDayRecLthGroup = globalCtx.getGlobalDto(Ip50004iOneDayRecLthGroup.class);
        }

        return ip50004iOneDayRecLthGroup;
    }

    public Ip50005oOneDayReadStatusGroup getIp50005oOneDayReadStatusGroup() {
        if (ip50005oOneDayReadStatusGroup == null) {
            ip50005oOneDayReadStatusGroup = globalCtx.getGlobalDto(Ip50005oOneDayReadStatusGroup.class);
        }

        return ip50005oOneDayReadStatusGroup;
    }

    public Ip50005oClearingDtTm getIp50005oClearingDtTm() {
        if (ip50005oClearingDtTm == null) {
            ip50005oClearingDtTm = globalCtx.getGlobalDto(Ip50005oClearingDtTm.class);
        }

        return ip50005oClearingDtTm;
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
    public Ip005704TableData getIp005704TableData() {
        if (ip005704TableData == null) {
            ip005704TableData = new Ip005704TableData();
        }

        return ip005704TableData;
    }

    public void setIp005704TableData(Ip005704TableData ip005704TableData) {
        this.ip005704TableData = ip005704TableData;
    }
    public MaxRrnLimitErr620 getMaxRrnLimitErr620() {
        if (maxRrnLimitErr620 == null) {
            maxRrnLimitErr620 = new MaxRrnLimitErr620();
        }

        return maxRrnLimitErr620;
    }

    public void setMaxRrnLimitErr620(MaxRrnLimitErr620 maxRrnLimitErr620) {
        this.maxRrnLimitErr620 = maxRrnLimitErr620;
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
    public Ip50004iOneDayReadStatusGroup getIp50004iOneDayReadStatusGroup() {
        if (ip50004iOneDayReadStatusGroup == null) {
            ip50004iOneDayReadStatusGroup = globalCtx.getGlobalDto(Ip50004iOneDayReadStatusGroup.class);
        }

        return ip50004iOneDayReadStatusGroup;
    }

    public Ip50004iOneDayRec getIp50004iOneDayRec() {
        if (ip50004iOneDayRec == null) {
            ip50004iOneDayRec = globalCtx.getGlobalDto(Ip50004iOneDayRec.class);
        }

        return ip50004iOneDayRec;
    }

    public Ip50005oOneDayRec getIp50005oOneDayRec() {
        if (ip50005oOneDayRec == null) {
            ip50005oOneDayRec = globalCtx.getGlobalDto(Ip50005oOneDayRec.class);
        }

        return ip50005oOneDayRec;
    }

    public Ip60001EventLogWorkArea getIp60001EventLogWorkArea() {
        if (ip60001EventLogWorkArea == null) {
            ip60001EventLogWorkArea = globalCtx.getGlobalDto(Ip60001EventLogWorkArea.class);
        }

        return ip60001EventLogWorkArea;
    }

    public Ip996011ProgramStartMessage getIp996011ProgramStartMessage() {
        if (ip996011ProgramStartMessage == null) {
            ip996011ProgramStartMessage = globalCtx.getGlobalDto(Ip996011ProgramStartMessage.class);
        }

        return ip996011ProgramStartMessage;
    }

    public Ip50005oOneDayRecLthGroup getIp50005oOneDayRecLthGroup() {
        if (ip50005oOneDayRecLthGroup == null) {
            ip50005oOneDayRecLthGroup = globalCtx.getGlobalDto(Ip50005oOneDayRecLthGroup.class);
        }

        return ip50005oOneDayRecLthGroup;
    }

    public Ip005703TableData getIp005703TableData() {
        if (ip005703TableData == null) {
            ip005703TableData = new Ip005703TableData();
        }

        return ip005703TableData;
    }

    public void setIp005703TableData(Ip005703TableData ip005703TableData) {
        this.ip005703TableData = ip005703TableData;
    }
    public Ip35501RelativeRecNumGroup getIp35501RelativeRecNumGroup() {
        if (ip35501RelativeRecNumGroup == null) {
            ip35501RelativeRecNumGroup = globalCtx.getGlobalDto(Ip35501RelativeRecNumGroup.class);
        }

        return ip35501RelativeRecNumGroup;
    }

    public Ip570004TableDataInfo getIp570004TableDataInfo() {
        if (ip570004TableDataInfo == null) {
            ip570004TableDataInfo = globalCtx.getGlobalDto(Ip570004TableDataInfo.class);
        }

        return ip570004TableDataInfo;
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
    public Ip50004iReadTableIdGroup getIp50004iReadTableIdGroup() {
        if (ip50004iReadTableIdGroup == null) {
            ip50004iReadTableIdGroup = globalCtx.getGlobalDto(Ip50004iReadTableIdGroup.class);
        }

        return ip50004iReadTableIdGroup;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip005704EntryFoundGroup.hashCode();
        str += ip005704SrchProdClassGroup.hashCode();
        str += ip50004iOneDayRecLthGroup.hashCode();
        str += ip50005oOneDayReadStatusGroup.hashCode();
        str += ip50005oClearingDtTm.hashCode();
        str += abendParaName900.hashCode();
        str += ip005704TableData.hashCode();
        str += maxRrnLimitErr620.hashCode();
        str += abendMessage900.hashCode();
        str += ip50004iOneDayReadStatusGroup.hashCode();
        str += ip50004iOneDayRec.hashCode();
        str += ip50005oOneDayRec.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
        str += ip50005oOneDayRecLthGroup.hashCode();
        str += ip005703TableData.hashCode();
        str += ip35501RelativeRecNumGroup.hashCode();
        str += ip570004TableDataInfo.hashCode();
        str += work.hashCode();
        str += ip50004iReadTableIdGroup.hashCode();
       return str.hashCode();
    }

    public Ip305710Ctx clone() {
        Ip305710Ctx cloneObj = new Ip305710Ctx();
        cloneObj.ip005704EntryFoundGroup = new Ip005704EntryFoundGroup();
        cloneObj.ip005704EntryFoundGroup.set(ip005704EntryFoundGroup.getClonedField());
        cloneObj.ip005704SrchProdClassGroup = new Ip005704SrchProdClassGroup();
        cloneObj.ip005704SrchProdClassGroup.set(ip005704SrchProdClassGroup.getClonedField());
        cloneObj.ip50004iOneDayRecLthGroup = new Ip50004iOneDayRecLthGroup();
        cloneObj.ip50004iOneDayRecLthGroup.set(ip50004iOneDayRecLthGroup.getClonedField());
        cloneObj.ip50005oOneDayReadStatusGroup = new Ip50005oOneDayReadStatusGroup();
        cloneObj.ip50005oOneDayReadStatusGroup.set(ip50005oOneDayReadStatusGroup.getClonedField());
        cloneObj.ip50005oClearingDtTm = new Ip50005oClearingDtTm();
        cloneObj.ip50005oClearingDtTm.set(ip50005oClearingDtTm.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip005704TableData = new Ip005704TableData();
        cloneObj.ip005704TableData.set(ip005704TableData.getClonedField());
        cloneObj.maxRrnLimitErr620 = new MaxRrnLimitErr620();
        cloneObj.maxRrnLimitErr620.set(maxRrnLimitErr620.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip50004iOneDayReadStatusGroup = new Ip50004iOneDayReadStatusGroup();
        cloneObj.ip50004iOneDayReadStatusGroup.set(ip50004iOneDayReadStatusGroup.getClonedField());
        cloneObj.ip50004iOneDayRec = new Ip50004iOneDayRec();
        cloneObj.ip50004iOneDayRec.set(ip50004iOneDayRec.getClonedField());
        cloneObj.ip50005oOneDayRec = new Ip50005oOneDayRec();
        cloneObj.ip50005oOneDayRec.set(ip50005oOneDayRec.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.ip50005oOneDayRecLthGroup = new Ip50005oOneDayRecLthGroup();
        cloneObj.ip50005oOneDayRecLthGroup.set(ip50005oOneDayRecLthGroup.getClonedField());
        cloneObj.ip005703TableData = new Ip005703TableData();
        cloneObj.ip005703TableData.set(ip005703TableData.getClonedField());
        cloneObj.ip35501RelativeRecNumGroup = new Ip35501RelativeRecNumGroup();
        cloneObj.ip35501RelativeRecNumGroup.set(ip35501RelativeRecNumGroup.getClonedField());
        cloneObj.ip570004TableDataInfo = new Ip570004TableDataInfo();
        cloneObj.ip570004TableDataInfo.set(ip570004TableDataInfo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50004iReadTableIdGroup = new Ip50004iReadTableIdGroup();
        cloneObj.ip50004iReadTableIdGroup.set(ip50004iReadTableIdGroup.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class DisplayExecMsgsInCtx implements Cloneable {
     Work work = Ip305710Ctx.this.getWork();
     Ip570004TableDataInfo ip570004TableDataInfo = Ip305710Ctx.this.getIp570004TableDataInfo();
     Ip005704TableData ip005704TableData = Ip305710Ctx.this.getIp005704TableData();
     Ip50004iOneDayRec ip50004iOneDayRec = Ip305710Ctx.this.getIp50004iOneDayRec();
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip305710Ctx.this.getIp996011ProgramStartMessage();

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
	 *	Returns the value of ip305710300
	 *	@return ip305710300
	 */
   public char[] getIp305710300() throws CFException  {              
   		return work.getIp305710300();
   }

  
	/**
	*  set variable ip305710300
	*  @param value
	**/
   public void setIp305710300(char[] value) throws CFException {
      work.setIp305710300(value);
   } 

	/**
	 *	Returns the value of ip005704TableData
	 *	@return ip005704TableData
	 */   
	 public Ip005704TableData getIp005704TableData() {
   	return ip005704TableData;
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
	 *	Returns the value of ip50004iEffDate
	 *	@return ip50004iEffDate
	 */
   public char[] getIp50004iEffDate() throws CFException  {              
   		return ip50004iOneDayRec.getIp50004iTableKey().getIp50004iEffDate();
   }

  
	/**
	*  set variable ip50004iEffDate
	*  @param value
	**/
   public void setIp50004iEffDate(char[] value) throws CFException {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(value);
   } 

     /**
	 * 	Update Ip50004iEffDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50004iEffDate(char[] source, int sourceIndex) throws CFException {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex);
   	
   }
   
   public void setIp50004iEffDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50004iEffDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iEffDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50004iEffDate with another Field
	 *	@param value
	 */
   public void setIp50004iEffDate(Field source) {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source);
   }  
   
     /**
	 * 	Update Ip50004iEffDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50004iEffDate(Field source, int sourceIndex,int sourceLen) {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50004iEffDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iEffDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip305710Ctx getIp305710Ctx() {
            return Ip305710Ctx.this;
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
        str += ip570004TableDataInfo.hashCode();
        str += ip005704TableData.hashCode();
        str += ip50004iOneDayRec.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
       return str.hashCode();
    }

    public DisplayExecMsgsInCtx clone() {
        DisplayExecMsgsInCtx cloneObj = new DisplayExecMsgsInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip570004TableDataInfo = new Ip570004TableDataInfo();
        cloneObj.ip570004TableDataInfo.set(ip570004TableDataInfo.getClonedField());
        cloneObj.ip005704TableData = new Ip005704TableData();
        cloneObj.ip005704TableData.set(ip005704TableData.getClonedField());
        cloneObj.ip50004iOneDayRec = new Ip50004iOneDayRec();
        cloneObj.ip50004iOneDayRec.set(ip50004iOneDayRec.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        return cloneObj;
    }

    }

    public DisplayExecMsgsInCtx getDisplayExecMsgsInCtx() {
            return new DisplayExecMsgsInCtx();
    }
     public class DisplayExecMsgsOutCtx implements Cloneable {
     Work work = Ip305710Ctx.this.getWork();
     Ip570004TableDataInfo ip570004TableDataInfo = Ip305710Ctx.this.getIp570004TableDataInfo();
     Ip50004iOneDayRec ip50004iOneDayRec = Ip305710Ctx.this.getIp50004iOneDayRec();
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip305710Ctx.this.getIp996011ProgramStartMessage();

	/**
	 *	Returns the value of ip305710300
	 *	@return ip305710300
	 */
   public char[] getIp305710300() throws CFException  {              
   		return work.getIp305710300();
   }

  
	/**
	*  set variable ip305710300
	*  @param value
	**/
   public void setIp305710300(char[] value) throws CFException {
      work.setIp305710300(value);
   } 

	/**
	 *	Returns the value of ip570004EffdtTm
	 *	@return ip570004EffdtTm
	 */
   public char[] getIp570004EffdtTm() throws CFException  {              
   		return ip570004TableDataInfo.getIp570004EffdtTm();
   }

  
	/**
	*  set variable ip570004EffdtTm
	*  @param value
	**/
   public void setIp570004EffdtTm(char[] value) throws CFException {
      ip570004TableDataInfo.setIp570004EffdtTm(value);
   } 

     /**
	 * 	Update Ip570004EffdtTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp570004EffdtTm(char[] source, int sourceIndex) throws CFException {
      ip570004TableDataInfo.setIp570004EffdtTm(source, sourceIndex);
   	
   }
   
   public void setIp570004EffdtTm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip570004TableDataInfo.setIp570004EffdtTm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip570004EffdtTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp570004EffdtTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip570004TableDataInfo.setIp570004EffdtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip570004EffdtTm with another Field
	 *	@param value
	 */
   public void setIp570004EffdtTm(Field source) {
      ip570004TableDataInfo.setIp570004EffdtTm(source);
   }  
   
     /**
	 * 	Update Ip570004EffdtTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp570004EffdtTm(Field source, int sourceIndex,int sourceLen) {
      ip570004TableDataInfo.setIp570004EffdtTm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip570004EffdtTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp570004EffdtTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip570004TableDataInfo.setIp570004EffdtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of entryLength800
	 *	@return entryLength800
	 */
	public int getEntryLength800() throws CFException {        
   		return work.getEntryLength800();
	}
	
	/**
	 * 	Update EntryLength800 with the passed value
	 *	@param number
	 */
	public void setEntryLength800(int number)  throws CFException{
		work.setEntryLength800(number);
	}


	public void setEntryLength800(long number)  throws CFException{
		work.setEntryLength800((int)number);
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
	 *	Returns the value of ip50004iEffDate
	 *	@return ip50004iEffDate
	 */
   public char[] getIp50004iEffDate() throws CFException  {              
   		return ip50004iOneDayRec.getIp50004iTableKey().getIp50004iEffDate();
   }

  
	/**
	*  set variable ip50004iEffDate
	*  @param value
	**/
   public void setIp50004iEffDate(char[] value) throws CFException {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(value);
   } 

     /**
	 * 	Update Ip50004iEffDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50004iEffDate(char[] source, int sourceIndex) throws CFException {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex);
   	
   }
   
   public void setIp50004iEffDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50004iEffDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iEffDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50004iEffDate with another Field
	 *	@param value
	 */
   public void setIp50004iEffDate(Field source) {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source);
   }  
   
     /**
	 * 	Update Ip50004iEffDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50004iEffDate(Field source, int sourceIndex,int sourceLen) {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50004iEffDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iEffDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of length800
	 *	@return length800
	 */
	public int getLength800() throws CFException {        
   		return work.getLength800();
	}
	
	/**
	 * 	Update Length800 with the passed value
	 *	@param number
	 */
	public void setLength800(int number)  throws CFException{
		work.setLength800(number);
	}


	public void setLength800(long number)  throws CFException{
		work.setLength800((int)number);
	}


	/**
	 *	Returns the value of ip570004Idx
	 *	@return ip570004Idx
	 */
	public long getIp570004Idx() throws CFException {        
   		return ip570004TableDataInfo.getIp570004Idx();
	}
	
	/**
	 * 	Update Ip570004Idx with the passed value
	 *	@param number
	 */
	public void setIp570004Idx(long number)  throws CFException{
		ip570004TableDataInfo.setIp570004Idx(number);
	}




        public Ip305710Ctx getIp305710Ctx() {
            return Ip305710Ctx.this;
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
        str += ip570004TableDataInfo.hashCode();
        str += ip50004iOneDayRec.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
       return str.hashCode();
    }

    public DisplayExecMsgsOutCtx clone() {
        DisplayExecMsgsOutCtx cloneObj = new DisplayExecMsgsOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip570004TableDataInfo = new Ip570004TableDataInfo();
        cloneObj.ip570004TableDataInfo.set(ip570004TableDataInfo.getClonedField());
        cloneObj.ip50004iOneDayRec = new Ip50004iOneDayRec();
        cloneObj.ip50004iOneDayRec.set(ip50004iOneDayRec.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        return cloneObj;
    }

    }

    public DisplayExecMsgsOutCtx getDisplayExecMsgsOutCtx() {
            return new DisplayExecMsgsOutCtx();
    }
     public class Process0057EntriesInCtx implements Cloneable {
     Ip50004iOneDayRecLthGroup ip50004iOneDayRecLthGroup = Ip305710Ctx.this.getIp50004iOneDayRecLthGroup();
     Ip005703TableData ip005703TableData = Ip305710Ctx.this.getIp005703TableData();
     Work work = Ip305710Ctx.this.getWork();
     Ip570004TableDataInfo ip570004TableDataInfo = Ip305710Ctx.this.getIp570004TableDataInfo();
     Ip35501RelativeRecNumGroup ip35501RelativeRecNumGroup = Ip305710Ctx.this.getIp35501RelativeRecNumGroup();
     Ip005704TableData ip005704TableData = Ip305710Ctx.this.getIp005704TableData();
     Ip50004iOneDayRec ip50004iOneDayRec = Ip305710Ctx.this.getIp50004iOneDayRec();

	/**
	 *	Returns the value of ip35501RelativeRecNum
	 *	@return ip35501RelativeRecNum
	 */
	public int getIp35501RelativeRecNum() throws CFException {        
   		return ip35501RelativeRecNumGroup.getIp35501RelativeRecNum();
	}
	
	/**
	 * 	Update Ip35501RelativeRecNum with the passed value
	 *	@param number
	 */
	public void setIp35501RelativeRecNum(int number)  throws CFException{
		ip35501RelativeRecNumGroup.setIp35501RelativeRecNum(number);
	}


	public void setIp35501RelativeRecNum(long number)  throws CFException{
		ip35501RelativeRecNumGroup.setIp35501RelativeRecNum((int)number);
	}


	/**
	 *	Returns the value of start800
	 *	@return start800
	 */
	public long getStart800() throws CFException {        
   		return work.getStart800();
	}
	
	/**
	 * 	Update Start800 with the passed value
	 *	@param number
	 */
	public void setStart800(long number)  throws CFException{
		work.setStart800(number);
	}



	/**
	 *	Returns the value of ip50004iOneDayRecLth
	 *	@return ip50004iOneDayRecLth
	 */
	public long getIp50004iOneDayRecLth() throws CFException {        
   		return ip50004iOneDayRecLthGroup.getIp50004iOneDayRecLth();
	}
	
	/**
	 * 	Update Ip50004iOneDayRecLth with the passed value
	 *	@param number
	 */
	public void setIp50004iOneDayRecLth(long number)  throws CFException{
		ip50004iOneDayRecLthGroup.setIp50004iOneDayRecLth(number);
	}



	/**
	 *	Returns the value of ip50004iTableData
	 *	@return ip50004iTableData
	 */
   public char[] getIp50004iTableData() throws CFException  {              
   		return ip50004iOneDayRec.getIp50004iTableData();
   }

  
	/**
	*  set variable ip50004iTableData
	*  @param value
	**/
   public void setIp50004iTableData(char[] value) throws CFException {
      ip50004iOneDayRec.setIp50004iTableData(value);
   } 

     /**
	 * 	Update Ip50004iTableData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50004iTableData(char[] source, int sourceIndex) throws CFException {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex);
   	
   }
   
   public void setIp50004iTableData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50004iTableData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50004iTableData with another Field
	 *	@param value
	 */
   public void setIp50004iTableData(Field source) {
      ip50004iOneDayRec.setIp50004iTableData(source);
   }  
   
     /**
	 * 	Update Ip50004iTableData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50004iTableData(Field source, int sourceIndex,int sourceLen) {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50004iTableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip570004Idx
	 *	@return ip570004Idx
	 */
	public long getIp570004Idx() throws CFException {        
   		return ip570004TableDataInfo.getIp570004Idx();
	}
	
	/**
	 * 	Update Ip570004Idx with the passed value
	 *	@param number
	 */
	public void setIp570004Idx(long number)  throws CFException{
		ip570004TableDataInfo.setIp570004Idx(number);
	}



	/**
	 *	Returns the value of length800
	 *	@return length800
	 */
	public int getLength800() throws CFException {        
   		return work.getLength800();
	}
	
	/**
	 * 	Update Length800 with the passed value
	 *	@param number
	 */
	public void setLength800(int number)  throws CFException{
		work.setLength800(number);
	}


	public void setLength800(long number)  throws CFException{
		work.setLength800((int)number);
	}


	/**
	 *	Returns the value of currPtrLngth800
	 *	@return currPtrLngth800
	 */
	public long getCurrPtrLngth800() throws CFException {        
   		return work.getCurrPtrLngth800();
	}
	
	/**
	 * 	Update CurrPtrLngth800 with the passed value
	 *	@param number
	 */
	public void setCurrPtrLngth800(long number)  throws CFException{
		work.setCurrPtrLngth800(number);
	}




        public Ip305710Ctx getIp305710Ctx() {
            return Ip305710Ctx.this;
        }

        public Process0057EntriesOutCtx getProcess0057EntriesOutCtx() {
            return new Process0057EntriesOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip50004iOneDayRecLthGroup.hashCode();
        str += ip005703TableData.hashCode();
        str += work.hashCode();
        str += ip570004TableDataInfo.hashCode();
        str += ip35501RelativeRecNumGroup.hashCode();
        str += ip005704TableData.hashCode();
        str += ip50004iOneDayRec.hashCode();
       return str.hashCode();
    }

    public Process0057EntriesInCtx clone() {
        Process0057EntriesInCtx cloneObj = new Process0057EntriesInCtx();
        cloneObj.ip50004iOneDayRecLthGroup = new Ip50004iOneDayRecLthGroup();
        cloneObj.ip50004iOneDayRecLthGroup.set(ip50004iOneDayRecLthGroup.getClonedField());
        cloneObj.ip005703TableData = new Ip005703TableData();
        cloneObj.ip005703TableData.set(ip005703TableData.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip570004TableDataInfo = new Ip570004TableDataInfo();
        cloneObj.ip570004TableDataInfo.set(ip570004TableDataInfo.getClonedField());
        cloneObj.ip35501RelativeRecNumGroup = new Ip35501RelativeRecNumGroup();
        cloneObj.ip35501RelativeRecNumGroup.set(ip35501RelativeRecNumGroup.getClonedField());
        cloneObj.ip005704TableData = new Ip005704TableData();
        cloneObj.ip005704TableData.set(ip005704TableData.getClonedField());
        cloneObj.ip50004iOneDayRec = new Ip50004iOneDayRec();
        cloneObj.ip50004iOneDayRec.set(ip50004iOneDayRec.getClonedField());
        return cloneObj;
    }

    }

    public Process0057EntriesInCtx getProcess0057EntriesInCtx() {
            return new Process0057EntriesInCtx();
    }
     public class Process0057EntriesOutCtx implements Cloneable {
     Ip50004iOneDayRecLthGroup ip50004iOneDayRecLthGroup = Ip305710Ctx.this.getIp50004iOneDayRecLthGroup();
     Ip005703TableData ip005703TableData = Ip305710Ctx.this.getIp005703TableData();
     Work work = Ip305710Ctx.this.getWork();
     Ip570004TableDataInfo ip570004TableDataInfo = Ip305710Ctx.this.getIp570004TableDataInfo();
     Ip35501RelativeRecNumGroup ip35501RelativeRecNumGroup = Ip305710Ctx.this.getIp35501RelativeRecNumGroup();
     Ip005704TableData ip005704TableData = Ip305710Ctx.this.getIp005704TableData();
     Ip50004iOneDayRec ip50004iOneDayRec = Ip305710Ctx.this.getIp50004iOneDayRec();

	/**
	 *	Returns the value of ip005703OvrdePrtyNum
	 *	@return ip005703OvrdePrtyNum
	 */
	public int getIp005703OvrdePrtyNum() throws CFException {
   		return ip005703TableData.getIp005703Tbl57Data().getIp005703OvrdePrtyNum();
	}


	/**
	 *	Returns String value of ip005703OvrdePrtyNum
	 *	@return ip005703OvrdePrtyNum
	 */
	public char[]  getIp005703OvrdePrtyNumString() throws CFException {
	     return String.valueOf(ip005703TableData.getIp005703Tbl57Data().getIp005703OvrdePrtyNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip005703OvrdePrtyNumIsNumeric()  throws CFException{
	    return ip005703TableData.getIp005703Tbl57Data().ip005703OvrdePrtyNumIsNumeric();
	}

	/**
	 * 	Update Ip005703OvrdePrtyNum with the passed value
	 *	@param number
	 */
	public void setIp005703OvrdePrtyNum(int number)  throws CFException{
		ip005703TableData.getIp005703Tbl57Data().setIp005703OvrdePrtyNum(number);
	}
	

	public void setIp005703OvrdePrtyNum(long number)  throws CFException{
	    ip005703TableData.getIp005703Tbl57Data().setIp005703OvrdePrtyNum(number);
	}
	
	
	/**
	 * 	Update Ip005703OvrdePrtyNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp005703OvrdePrtyNum(char[] value)  throws CFException {
		ip005703TableData.getIp005703Tbl57Data().setIp005703OvrdePrtyNum(value);
	}
	
	/**
	 * 	Update Ip005703OvrdePrtyNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp005703OvrdePrtyNumString(char[] value)  throws CFException{
		ip005703TableData.getIp005703Tbl57Data().setIp005703OvrdePrtyNum(value);
	}	

	/**
	 *	Returns the value of ip005704OvrdePrtyNum
	 *	@return ip005704OvrdePrtyNum
	 */
	public int getIp005704OvrdePrtyNum() throws CFException {
   		return ip005704TableData.getIp005704Tbl57Data().getIp005704OvrdePrtyNum();
	}


	/**
	 *	Returns String value of ip005704OvrdePrtyNum
	 *	@return ip005704OvrdePrtyNum
	 */
	public char[]  getIp005704OvrdePrtyNumString() throws CFException {
	     return String.valueOf(ip005704TableData.getIp005704Tbl57Data().getIp005704OvrdePrtyNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip005704OvrdePrtyNumIsNumeric()  throws CFException{
	    return ip005704TableData.getIp005704Tbl57Data().ip005704OvrdePrtyNumIsNumeric();
	}

	/**
	 * 	Update Ip005704OvrdePrtyNum with the passed value
	 *	@param number
	 */
	public void setIp005704OvrdePrtyNum(int number)  throws CFException{
		ip005704TableData.getIp005704Tbl57Data().setIp005704OvrdePrtyNum(number);
	}
	

	public void setIp005704OvrdePrtyNum(long number)  throws CFException{
	    ip005704TableData.getIp005704Tbl57Data().setIp005704OvrdePrtyNum(number);
	}
	
	
	/**
	 * 	Update Ip005704OvrdePrtyNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp005704OvrdePrtyNum(char[] value)  throws CFException {
		ip005704TableData.getIp005704Tbl57Data().setIp005704OvrdePrtyNum(value);
	}
	
	/**
	 * 	Update Ip005704OvrdePrtyNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp005704OvrdePrtyNumString(char[] value)  throws CFException{
		ip005704TableData.getIp005704Tbl57Data().setIp005704OvrdePrtyNum(value);
	}	

	/**
	 *	Returns the value of start800
	 *	@return start800
	 */
	public long getStart800() throws CFException {        
   		return work.getStart800();
	}
	
	/**
	 * 	Update Start800 with the passed value
	 *	@param number
	 */
	public void setStart800(long number)  throws CFException{
		work.setStart800(number);
	}



	/**
	 *	Returns the value of ip005704McAssgnId
	 *	@return ip005704McAssgnId
	 */
   public char[] getIp005704McAssgnId() throws CFException  {              
   		return ip005704TableData.getIp005704Tbl57Data().getIp005704McAssgnId();
   }

  
	/**
	*  set variable ip005704McAssgnId
	*  @param value
	**/
   public void setIp005704McAssgnId(char[] value) throws CFException {
      ip005704TableData.getIp005704Tbl57Data().setIp005704McAssgnId(value);
   } 

     /**
	 * 	Update Ip005704McAssgnId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp005704McAssgnId(char[] source, int sourceIndex) throws CFException {
      ip005704TableData.getIp005704Tbl57Data().setIp005704McAssgnId(source, sourceIndex);
   	
   }
   
   public void setIp005704McAssgnId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip005704TableData.getIp005704Tbl57Data().setIp005704McAssgnId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip005704McAssgnId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp005704McAssgnId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip005704TableData.getIp005704Tbl57Data().setIp005704McAssgnId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip005704McAssgnId with another Field
	 *	@param value
	 */
   public void setIp005704McAssgnId(Field source) {
      ip005704TableData.getIp005704Tbl57Data().setIp005704McAssgnId(source);
   }  
   
     /**
	 * 	Update Ip005704McAssgnId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp005704McAssgnId(Field source, int sourceIndex,int sourceLen) {
      ip005704TableData.getIp005704Tbl57Data().setIp005704McAssgnId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip005704McAssgnId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp005704McAssgnId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip005704TableData.getIp005704Tbl57Data().setIp005704McAssgnId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip005703ProdClass
	 *	@return ip005703ProdClass
	 */
   public char[] getIp005703ProdClass() throws CFException  {              
   		return ip005703TableData.getIp005703Tbl57Data().getIp005703ProdClass();
   }

  
	/**
	*  set variable ip005703ProdClass
	*  @param value
	**/
   public void setIp005703ProdClass(char[] value) throws CFException {
      ip005703TableData.getIp005703Tbl57Data().setIp005703ProdClass(value);
   } 

     /**
	 * 	Update Ip005703ProdClass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp005703ProdClass(char[] source, int sourceIndex) throws CFException {
      ip005703TableData.getIp005703Tbl57Data().setIp005703ProdClass(source, sourceIndex);
   	
   }
   
   public void setIp005703ProdClass(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip005703TableData.getIp005703Tbl57Data().setIp005703ProdClass(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip005703ProdClass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp005703ProdClass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip005703TableData.getIp005703Tbl57Data().setIp005703ProdClass(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip005703ProdClass with another Field
	 *	@param value
	 */
   public void setIp005703ProdClass(Field source) {
      ip005703TableData.getIp005703Tbl57Data().setIp005703ProdClass(source);
   }  
   
     /**
	 * 	Update Ip005703ProdClass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp005703ProdClass(Field source, int sourceIndex,int sourceLen) {
      ip005703TableData.getIp005703Tbl57Data().setIp005703ProdClass(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip005703ProdClass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp005703ProdClass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip005703TableData.getIp005703Tbl57Data().setIp005703ProdClass(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip005704ProdClass
	 *	@return ip005704ProdClass
	 */
   public char[] getIp005704ProdClass() throws CFException  {              
   		return ip005704TableData.getIp005704Tbl57Data().getIp005704ProdClass();
   }

  
	/**
	*  set variable ip005704ProdClass
	*  @param value
	**/
   public void setIp005704ProdClass(char[] value) throws CFException {
      ip005704TableData.getIp005704Tbl57Data().setIp005704ProdClass(value);
   } 

     /**
	 * 	Update Ip005704ProdClass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp005704ProdClass(char[] source, int sourceIndex) throws CFException {
      ip005704TableData.getIp005704Tbl57Data().setIp005704ProdClass(source, sourceIndex);
   	
   }
   
   public void setIp005704ProdClass(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip005704TableData.getIp005704Tbl57Data().setIp005704ProdClass(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip005704ProdClass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp005704ProdClass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip005704TableData.getIp005704Tbl57Data().setIp005704ProdClass(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip005704ProdClass with another Field
	 *	@param value
	 */
   public void setIp005704ProdClass(Field source) {
      ip005704TableData.getIp005704Tbl57Data().setIp005704ProdClass(source);
   }  
   
     /**
	 * 	Update Ip005704ProdClass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp005704ProdClass(Field source, int sourceIndex,int sourceLen) {
      ip005704TableData.getIp005704Tbl57Data().setIp005704ProdClass(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip005704ProdClass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp005704ProdClass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip005704TableData.getIp005704Tbl57Data().setIp005704ProdClass(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip005704CabCode
	 *	@return ip005704CabCode
	 */
   public char[] getIp005704CabCode() throws CFException  {              
   		return ip005704TableData.getIp005704Tbl57Data().getIp005704CabCode();
   }

  
	/**
	*  set variable ip005704CabCode
	*  @param value
	**/
   public void setIp005704CabCode(char[] value) throws CFException {
      ip005704TableData.getIp005704Tbl57Data().setIp005704CabCode(value);
   } 

     /**
	 * 	Update Ip005704CabCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp005704CabCode(char[] source, int sourceIndex) throws CFException {
      ip005704TableData.getIp005704Tbl57Data().setIp005704CabCode(source, sourceIndex);
   	
   }
   
   public void setIp005704CabCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip005704TableData.getIp005704Tbl57Data().setIp005704CabCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip005704CabCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp005704CabCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip005704TableData.getIp005704Tbl57Data().setIp005704CabCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip005704CabCode with another Field
	 *	@param value
	 */
   public void setIp005704CabCode(Field source) {
      ip005704TableData.getIp005704Tbl57Data().setIp005704CabCode(source);
   }  
   
     /**
	 * 	Update Ip005704CabCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp005704CabCode(Field source, int sourceIndex,int sourceLen) {
      ip005704TableData.getIp005704Tbl57Data().setIp005704CabCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip005704CabCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp005704CabCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip005704TableData.getIp005704Tbl57Data().setIp005704CabCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip570004Idx
	 *	@return ip570004Idx
	 */
	public long getIp570004Idx() throws CFException {        
   		return ip570004TableDataInfo.getIp570004Idx();
	}
	
	/**
	 * 	Update Ip570004Idx with the passed value
	 *	@param number
	 */
	public void setIp570004Idx(long number)  throws CFException{
		ip570004TableDataInfo.setIp570004Idx(number);
	}



	/**
	 *	Returns the value of ip005703CabCode
	 *	@return ip005703CabCode
	 */
   public char[] getIp005703CabCode() throws CFException  {              
   		return ip005703TableData.getIp005703Tbl57Data().getIp005703CabCode();
   }

  
	/**
	*  set variable ip005703CabCode
	*  @param value
	**/
   public void setIp005703CabCode(char[] value) throws CFException {
      ip005703TableData.getIp005703Tbl57Data().setIp005703CabCode(value);
   } 

     /**
	 * 	Update Ip005703CabCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp005703CabCode(char[] source, int sourceIndex) throws CFException {
      ip005703TableData.getIp005703Tbl57Data().setIp005703CabCode(source, sourceIndex);
   	
   }
   
   public void setIp005703CabCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip005703TableData.getIp005703Tbl57Data().setIp005703CabCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip005703CabCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp005703CabCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip005703TableData.getIp005703Tbl57Data().setIp005703CabCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip005703CabCode with another Field
	 *	@param value
	 */
   public void setIp005703CabCode(Field source) {
      ip005703TableData.getIp005703Tbl57Data().setIp005703CabCode(source);
   }  
   
     /**
	 * 	Update Ip005703CabCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp005703CabCode(Field source, int sourceIndex,int sourceLen) {
      ip005703TableData.getIp005703Tbl57Data().setIp005703CabCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip005703CabCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp005703CabCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip005703TableData.getIp005703Tbl57Data().setIp005703CabCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public long getIp005704FeeCodePtr() throws CFException {  
        return ip005704TableData.getIp005704Tbl57Data().getIp005704FeeCodePtr();
}
	/**
	 * 	Update Ip005704FeeCodePtr with the passed value
	 *	@param number
	 */
	public void setIp005704FeeCodePtr(long number)  throws CFException{
		ip005704TableData.getIp005704Tbl57Data().setIp005704FeeCodePtr(number);
	}



	/**
	 *	Returns the value of ip35501RelativeRecNum
	 *	@return ip35501RelativeRecNum
	 */
	public int getIp35501RelativeRecNum() throws CFException {        
   		return ip35501RelativeRecNumGroup.getIp35501RelativeRecNum();
	}
	
	/**
	 * 	Update Ip35501RelativeRecNum with the passed value
	 *	@param number
	 */
	public void setIp35501RelativeRecNum(int number)  throws CFException{
		ip35501RelativeRecNumGroup.setIp35501RelativeRecNum(number);
	}


	public void setIp35501RelativeRecNum(long number)  throws CFException{
		ip35501RelativeRecNumGroup.setIp35501RelativeRecNum((int)number);
	}


	/**
	 *	Returns the value of ip005703FeeCodePtr
	 *	@return ip005703FeeCodePtr
	 */
	public long getIp005703FeeCodePtr() throws CFException {
   		return ip005703TableData.getIp005703Tbl57Data().getIp005703FeeCodePtr();
	}


	/**
	 *	Returns String value of ip005703FeeCodePtr
	 *	@return ip005703FeeCodePtr
	 */
	public char[]  getIp005703FeeCodePtrString() throws CFException {
	     return String.valueOf(ip005703TableData.getIp005703Tbl57Data().getIp005703FeeCodePtrString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip005703FeeCodePtrIsNumeric()  throws CFException{
	    return ip005703TableData.getIp005703Tbl57Data().ip005703FeeCodePtrIsNumeric();
	}

	/**
	 * 	Update Ip005703FeeCodePtr with the passed value
	 *	@param number
	 */
	public void setIp005703FeeCodePtr(long number)  throws CFException{
		ip005703TableData.getIp005703Tbl57Data().setIp005703FeeCodePtr(number);
	}
	

	
	/**
	 * 	Update Ip005703FeeCodePtr with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp005703FeeCodePtr(char[] value)  throws CFException {
		ip005703TableData.getIp005703Tbl57Data().setIp005703FeeCodePtr(value);
	}
	
	/**
	 * 	Update Ip005703FeeCodePtr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp005703FeeCodePtrString(char[] value)  throws CFException{
		ip005703TableData.getIp005703Tbl57Data().setIp005703FeeCodePtr(value);
	}	

	/**
	 *	Returns the value of ip005703McAssgnId
	 *	@return ip005703McAssgnId
	 */
   public char[] getIp005703McAssgnId() throws CFException  {              
   		return ip005703TableData.getIp005703Tbl57Data().getIp005703McAssgnId();
   }

  
	/**
	*  set variable ip005703McAssgnId
	*  @param value
	**/
   public void setIp005703McAssgnId(char[] value) throws CFException {
      ip005703TableData.getIp005703Tbl57Data().setIp005703McAssgnId(value);
   } 

     /**
	 * 	Update Ip005703McAssgnId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp005703McAssgnId(char[] source, int sourceIndex) throws CFException {
      ip005703TableData.getIp005703Tbl57Data().setIp005703McAssgnId(source, sourceIndex);
   	
   }
   
   public void setIp005703McAssgnId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip005703TableData.getIp005703Tbl57Data().setIp005703McAssgnId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip005703McAssgnId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp005703McAssgnId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip005703TableData.getIp005703Tbl57Data().setIp005703McAssgnId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip005703McAssgnId with another Field
	 *	@param value
	 */
   public void setIp005703McAssgnId(Field source) {
      ip005703TableData.getIp005703Tbl57Data().setIp005703McAssgnId(source);
   }  
   
     /**
	 * 	Update Ip005703McAssgnId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp005703McAssgnId(Field source, int sourceIndex,int sourceLen) {
      ip005703TableData.getIp005703Tbl57Data().setIp005703McAssgnId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip005703McAssgnId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp005703McAssgnId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip005703TableData.getIp005703Tbl57Data().setIp005703McAssgnId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip005703TableData
	 *	@return ip005703TableData
	 */   
	 public Ip005703TableData getIp005703TableData() {
   	return ip005703TableData;
   }


	/**
	 *	Returns the value of ip570004IdxMax
	 *	@return ip570004IdxMax
	 */
	public long getIp570004IdxMax() throws CFException {        
   		return ip570004TableDataInfo.getIp570004IdxMax();
	}
	
	/**
	 * 	Update Ip570004IdxMax with the passed value
	 *	@param number
	 */
	public void setIp570004IdxMax(long number)  throws CFException{
		ip570004TableDataInfo.setIp570004IdxMax(number);
	}



	/**
	 *	Returns the value of ip50004iTableData
	 *	@return ip50004iTableData
	 */
   public char[] getIp50004iTableData() throws CFException  {              
   		return ip50004iOneDayRec.getIp50004iTableData();
   }

  
	/**
	*  set variable ip50004iTableData
	*  @param value
	**/
   public void setIp50004iTableData(char[] value) throws CFException {
      ip50004iOneDayRec.setIp50004iTableData(value);
   } 

     /**
	 * 	Update Ip50004iTableData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50004iTableData(char[] source, int sourceIndex) throws CFException {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex);
   	
   }
   
   public void setIp50004iTableData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50004iTableData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50004iTableData with another Field
	 *	@param value
	 */
   public void setIp50004iTableData(Field source) {
      ip50004iOneDayRec.setIp50004iTableData(source);
   }  
   
     /**
	 * 	Update Ip50004iTableData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50004iTableData(Field source, int sourceIndex,int sourceLen) {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50004iTableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip570004Tbl57CabGpEntryLt
	 *	@return ip570004Tbl57CabGpEntryLt
	 */
	public long getIp570004Tbl57CabGpEntryLt(int index) throws CFException {        
   		return ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().getIp570004Tbl57CabGpEntryLt();
	}
	
	/**
	 * 	Update Ip570004Tbl57CabGpEntryLt with the passed value
	 *	@param number
	 */
	public void setIp570004Tbl57CabGpEntryLt(int index,long number)  throws CFException{
		ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().setIp570004Tbl57CabGpEntryLt(number);
	}



	/**
	 *	Returns the value of ip570004Tbl57RelRecNumEnd
	 *	@return ip570004Tbl57RelRecNumEnd
	 */
	public int getIp570004Tbl57RelRecNumEnd(int index) throws CFException {        
   		return ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().getIp570004Tbl57RelRecNumEnd();
	}
	
	/**
	 * 	Update Ip570004Tbl57RelRecNumEnd with the passed value
	 *	@param number
	 */
	public void setIp570004Tbl57RelRecNumEnd(int index,int number)  throws CFException{
		ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().setIp570004Tbl57RelRecNumEnd(number);
	}


	public void setIp570004Tbl57RelRecNumEnd(int index,long number)  throws CFException{
		ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().setIp570004Tbl57RelRecNumEnd((int)number);
	}


	/**
	 *	Returns the value of currPtrLngth800
	 *	@return currPtrLngth800
	 */
	public long getCurrPtrLngth800() throws CFException {        
   		return work.getCurrPtrLngth800();
	}
	
	/**
	 * 	Update CurrPtrLngth800 with the passed value
	 *	@param number
	 */
	public void setCurrPtrLngth800(long number)  throws CFException{
		work.setCurrPtrLngth800(number);
	}




        public Ip305710Ctx getIp305710Ctx() {
            return Ip305710Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip50004iOneDayRecLthGroup.hashCode();
        str += ip005703TableData.hashCode();
        str += work.hashCode();
        str += ip570004TableDataInfo.hashCode();
        str += ip35501RelativeRecNumGroup.hashCode();
        str += ip005704TableData.hashCode();
        str += ip50004iOneDayRec.hashCode();
       return str.hashCode();
    }

    public Process0057EntriesOutCtx clone() {
        Process0057EntriesOutCtx cloneObj = new Process0057EntriesOutCtx();
        cloneObj.ip50004iOneDayRecLthGroup = new Ip50004iOneDayRecLthGroup();
        cloneObj.ip50004iOneDayRecLthGroup.set(ip50004iOneDayRecLthGroup.getClonedField());
        cloneObj.ip005703TableData = new Ip005703TableData();
        cloneObj.ip005703TableData.set(ip005703TableData.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip570004TableDataInfo = new Ip570004TableDataInfo();
        cloneObj.ip570004TableDataInfo.set(ip570004TableDataInfo.getClonedField());
        cloneObj.ip35501RelativeRecNumGroup = new Ip35501RelativeRecNumGroup();
        cloneObj.ip35501RelativeRecNumGroup.set(ip35501RelativeRecNumGroup.getClonedField());
        cloneObj.ip005704TableData = new Ip005704TableData();
        cloneObj.ip005704TableData.set(ip005704TableData.getClonedField());
        cloneObj.ip50004iOneDayRec = new Ip50004iOneDayRec();
        cloneObj.ip50004iOneDayRec.set(ip50004iOneDayRec.getClonedField());
        return cloneObj;
    }

    }

    public Process0057EntriesOutCtx getProcess0057EntriesOutCtx() {
            return new Process0057EntriesOutCtx();
    }
     public class SaveTableEntryInCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip305710Ctx.this.getAbendParaName900();
     Work work = Ip305710Ctx.this.getWork();
     Ip570004TableDataInfo ip570004TableDataInfo = Ip305710Ctx.this.getIp570004TableDataInfo();
     Ip005703TableData ip005703TableData = Ip305710Ctx.this.getIp005703TableData();
     Ip35501RelativeRecNumGroup ip35501RelativeRecNumGroup = Ip305710Ctx.this.getIp35501RelativeRecNumGroup();
     Ip005704TableData ip005704TableData = Ip305710Ctx.this.getIp005704TableData();
     MaxRrnLimitErr620 maxRrnLimitErr620 = Ip305710Ctx.this.getMaxRrnLimitErr620();
     AbendMessage900 abendMessage900 = Ip305710Ctx.this.getAbendMessage900();
     Ip50005oOneDayRec ip50005oOneDayRec = Ip305710Ctx.this.getIp50005oOneDayRec();

	/**
	 *	Returns the value of uniqMaxCabPtrErrorMsg610
	 *	@return uniqMaxCabPtrErrorMsg610
	 */
   public char[] getUniqMaxCabPtrErrorMsg610() throws CFException  {              
   		return work.getUniqMaxCabPtrErrorMsg610();
   }

  
	/**
	*  set variable uniqMaxCabPtrErrorMsg610
	*  @param value
	**/
   public void setUniqMaxCabPtrErrorMsg610(char[] value) throws CFException {
      work.setUniqMaxCabPtrErrorMsg610(value);
   } 

	/**
	 *	Returns the value of ip570004Tbl57RelRecNumSt
	 *	@return ip570004Tbl57RelRecNumSt
	 */
	public int getIp570004Tbl57RelRecNumSt(int index) throws CFException {        
   		return ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().getIp570004Tbl57RelRecNumSt();
	}
	
	/**
	 * 	Update Ip570004Tbl57RelRecNumSt with the passed value
	 *	@param number
	 */
	public void setIp570004Tbl57RelRecNumSt(int index,int number)  throws CFException{
		ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().setIp570004Tbl57RelRecNumSt(number);
	}


	public void setIp570004Tbl57RelRecNumSt(int index,long number)  throws CFException{
		ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().setIp570004Tbl57RelRecNumSt((int)number);
	}


	/**
	 *	Returns the value of ip005704TableData
	 *	@return ip005704TableData
	 */   
	 public Ip005704TableData getIp005704TableData() {
   	return ip005704TableData;
   }


	/**
	 *	Returns the value of start800
	 *	@return start800
	 */
	public long getStart800() throws CFException {        
   		return work.getStart800();
	}
	
	/**
	 * 	Update Start800 with the passed value
	 *	@param number
	 */
	public void setStart800(long number)  throws CFException{
		work.setStart800(number);
	}



	/**
	 *	Returns the value of maxRrnLimitErr620
	 *	@return maxRrnLimitErr620
	 */   
	 public MaxRrnLimitErr620 getMaxRrnLimitErr620() {
   	return maxRrnLimitErr620;
   }


	/**
	 *	Returns the value of length800
	 *	@return length800
	 */
	public int getLength800() throws CFException {        
   		return work.getLength800();
	}
	
	/**
	 * 	Update Length800 with the passed value
	 *	@param number
	 */
	public void setLength800(int number)  throws CFException{
		work.setLength800(number);
	}


	public void setLength800(long number)  throws CFException{
		work.setLength800((int)number);
	}


	/**
	 *	Returns the value of ip570004Idx
	 *	@return ip570004Idx
	 */
	public long getIp570004Idx() throws CFException {        
   		return ip570004TableDataInfo.getIp570004Idx();
	}
	
	/**
	 * 	Update Ip570004Idx with the passed value
	 *	@param number
	 */
	public void setIp570004Idx(long number)  throws CFException{
		ip570004TableDataInfo.setIp570004Idx(number);
	}



	/**
	 *	Returns the value of abendCd3003300
	 *	@return abendCd3003300
	 */
   public char[] getAbendCd3003300() throws CFException  {              
   		return work.getAbendCd3003300();
   }

  
	/**
	*  set variable abendCd3003300
	*  @param value
	**/
   public void setAbendCd3003300(char[] value) throws CFException {
      work.setAbendCd3003300(value);
   } 

	/**
	 *	Returns the value of ip35501RelativeRecNum
	 *	@return ip35501RelativeRecNum
	 */
	public int getIp35501RelativeRecNum() throws CFException {        
   		return ip35501RelativeRecNumGroup.getIp35501RelativeRecNum();
	}
	
	/**
	 * 	Update Ip35501RelativeRecNum with the passed value
	 *	@param number
	 */
	public void setIp35501RelativeRecNum(int number)  throws CFException{
		ip35501RelativeRecNumGroup.setIp35501RelativeRecNum(number);
	}


	public void setIp35501RelativeRecNum(long number)  throws CFException{
		ip35501RelativeRecNumGroup.setIp35501RelativeRecNum((int)number);
	}


	/**
	 *	Returns the value of ip005703Tbl57PcCabGrpPtr
	 *	@return ip005703Tbl57PcCabGrpPtr
	 */
	public long getIp005703Tbl57PcCabGrpPtr() throws CFException {
   		return ip005703TableData.getIp005703Tbl57PcCabGrpPtr();
	}


	/**
	 *	Returns String value of ip005703Tbl57PcCabGrpPtr
	 *	@return ip005703Tbl57PcCabGrpPtr
	 */
	public char[]  getIp005703Tbl57PcCabGrpPtrString() throws CFException {
	     return String.valueOf(ip005703TableData.getIp005703Tbl57PcCabGrpPtrString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip005703Tbl57PcCabGrpPtrIsNumeric()  throws CFException{
	    return ip005703TableData.ip005703Tbl57PcCabGrpPtrIsNumeric();
	}

	/**
	 * 	Update Ip005703Tbl57PcCabGrpPtr with the passed value
	 *	@param number
	 */
	public void setIp005703Tbl57PcCabGrpPtr(long number)  throws CFException{
		ip005703TableData.setIp005703Tbl57PcCabGrpPtr(number);
	}
	

	
	/**
	 * 	Update Ip005703Tbl57PcCabGrpPtr with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp005703Tbl57PcCabGrpPtr(char[] value)  throws CFException {
		ip005703TableData.setIp005703Tbl57PcCabGrpPtr(value);
	}
	
	/**
	 * 	Update Ip005703Tbl57PcCabGrpPtr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp005703Tbl57PcCabGrpPtrString(char[] value)  throws CFException{
		ip005703TableData.setIp005703Tbl57PcCabGrpPtr(value);
	}	

	/**
	 *	Returns the value of maxLength300
	 *	@return maxLength300
	 */
	public long getMaxLength300() throws CFException {        
   		return work.getMaxLength300();
	}
	
	/**
	 * 	Update MaxLength300 with the passed value
	 *	@param number
	 */
	public void setMaxLength300(long number)  throws CFException{
		work.setMaxLength300(number);
	}



	/**
	 *	Returns the value of uniqMaxCabPtrErrorCd610
	 *	@return uniqMaxCabPtrErrorCd610
	 */
   public char[] getUniqMaxCabPtrErrorCd610() throws CFException  {              
   		return work.getUniqMaxCabPtrErrorCd610();
   }

  
	/**
	*  set variable uniqMaxCabPtrErrorCd610
	*  @param value
	**/
   public void setUniqMaxCabPtrErrorCd610(char[] value) throws CFException {
      work.setUniqMaxCabPtrErrorCd610(value);
   } 

	/**
	 *	Returns the value of para2100300
	 *	@return para2100300
	 */
   public char[] getPara2100300() throws CFException  {              
   		return work.getPara2100300();
   }

  
	/**
	*  set variable para2100300
	*  @param value
	**/
   public void setPara2100300(char[] value) throws CFException {
      work.setPara2100300(value);
   } 

	/**
	 *	Returns the value of entryLength800
	 *	@return entryLength800
	 */
	public int getEntryLength800() throws CFException {        
   		return work.getEntryLength800();
	}
	
	/**
	 * 	Update EntryLength800 with the passed value
	 *	@param number
	 */
	public void setEntryLength800(int number)  throws CFException{
		work.setEntryLength800(number);
	}


	public void setEntryLength800(long number)  throws CFException{
		work.setEntryLength800((int)number);
	}


	/**
	 *	Returns the value of maxRrnLimit300
	 *	@return maxRrnLimit300
	 */
	public int getMaxRrnLimit300() throws CFException {
   		return work.getMaxRrnLimit300();
	}


	/**
	 *	Returns String value of maxRrnLimit300
	 *	@return maxRrnLimit300
	 */
	public char[]  getMaxRrnLimit300String() throws CFException {
	     return String.valueOf(work.getMaxRrnLimit300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maxRrnLimit300IsNumeric()  throws CFException{
	    return work.maxRrnLimit300IsNumeric();
	}

	/**
	 * 	Update MaxRrnLimit300 with the passed value
	 *	@param number
	 */
	public void setMaxRrnLimit300(int number)  throws CFException{
		work.setMaxRrnLimit300(number);
	}
	

	public void setMaxRrnLimit300(long number)  throws CFException{
	    work.setMaxRrnLimit300(number);
	}
	
	
	/**
	 * 	Update MaxRrnLimit300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaxRrnLimit300(char[] value)  throws CFException {
		work.setMaxRrnLimit300(value);
	}
	
	/**
	 * 	Update MaxRrnLimit300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaxRrnLimit300String(char[] value)  throws CFException{
		work.setMaxRrnLimit300(value);
	}	

	/**
	 *	Returns the value of ip570004Tbl57RelRecNumEnd
	 *	@return ip570004Tbl57RelRecNumEnd
	 */
	public int getIp570004Tbl57RelRecNumEnd(int index) throws CFException {        
   		return ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().getIp570004Tbl57RelRecNumEnd();
	}
	
	/**
	 * 	Update Ip570004Tbl57RelRecNumEnd with the passed value
	 *	@param number
	 */
	public void setIp570004Tbl57RelRecNumEnd(int index,int number)  throws CFException{
		ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().setIp570004Tbl57RelRecNumEnd(number);
	}


	public void setIp570004Tbl57RelRecNumEnd(int index,long number)  throws CFException{
		ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().setIp570004Tbl57RelRecNumEnd((int)number);
	}


	/**
	 *	Returns the value of rrnNbr800
	 *	@return rrnNbr800
	 */
	public int getRrnNbr800() throws CFException {        
   		return work.getRrnNbr800();
	}
	
	/**
	 * 	Update RrnNbr800 with the passed value
	 *	@param number
	 */
	public void setRrnNbr800(int number)  throws CFException{
		work.setRrnNbr800(number);
	}


	public void setRrnNbr800(long number)  throws CFException{
		work.setRrnNbr800((int)number);
	}


public long getIp570004Tbl57PcCabGrpPtr(int index) throws CFException {  
        return ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PcCabGrpPtr();
}
	/**
	 * 	Update Ip570004Tbl57PcCabGrpPtr with the passed value
	 *	@param number
	 */
	public void setIp570004Tbl57PcCabGrpPtr(int index,long number)  throws CFException{
		ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).setIp570004Tbl57PcCabGrpPtr(number);
	}



	/**
	 *	Returns the value of currPtrLngth800
	 *	@return currPtrLngth800
	 */
	public long getCurrPtrLngth800() throws CFException {        
   		return work.getCurrPtrLngth800();
	}
	
	/**
	 * 	Update CurrPtrLngth800 with the passed value
	 *	@param number
	 */
	public void setCurrPtrLngth800(long number)  throws CFException{
		work.setCurrPtrLngth800(number);
	}




        public Ip305710Ctx getIp305710Ctx() {
            return Ip305710Ctx.this;
        }

        public SaveTableEntryOutCtx getSaveTableEntryOutCtx() {
            return new SaveTableEntryOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendParaName900.hashCode();
        str += work.hashCode();
        str += ip570004TableDataInfo.hashCode();
        str += ip005703TableData.hashCode();
        str += ip35501RelativeRecNumGroup.hashCode();
        str += ip005704TableData.hashCode();
        str += maxRrnLimitErr620.hashCode();
        str += abendMessage900.hashCode();
        str += ip50005oOneDayRec.hashCode();
       return str.hashCode();
    }

    public SaveTableEntryInCtx clone() {
        SaveTableEntryInCtx cloneObj = new SaveTableEntryInCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip570004TableDataInfo = new Ip570004TableDataInfo();
        cloneObj.ip570004TableDataInfo.set(ip570004TableDataInfo.getClonedField());
        cloneObj.ip005703TableData = new Ip005703TableData();
        cloneObj.ip005703TableData.set(ip005703TableData.getClonedField());
        cloneObj.ip35501RelativeRecNumGroup = new Ip35501RelativeRecNumGroup();
        cloneObj.ip35501RelativeRecNumGroup.set(ip35501RelativeRecNumGroup.getClonedField());
        cloneObj.ip005704TableData = new Ip005704TableData();
        cloneObj.ip005704TableData.set(ip005704TableData.getClonedField());
        cloneObj.maxRrnLimitErr620 = new MaxRrnLimitErr620();
        cloneObj.maxRrnLimitErr620.set(maxRrnLimitErr620.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip50005oOneDayRec = new Ip50005oOneDayRec();
        cloneObj.ip50005oOneDayRec.set(ip50005oOneDayRec.getClonedField());
        return cloneObj;
    }

    }

    public SaveTableEntryInCtx getSaveTableEntryInCtx() {
            return new SaveTableEntryInCtx();
    }
     public class SaveTableEntryOutCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip305710Ctx.this.getAbendParaName900();
     Work work = Ip305710Ctx.this.getWork();
     Ip570004TableDataInfo ip570004TableDataInfo = Ip305710Ctx.this.getIp570004TableDataInfo();
     Ip005703TableData ip005703TableData = Ip305710Ctx.this.getIp005703TableData();
     Ip35501RelativeRecNumGroup ip35501RelativeRecNumGroup = Ip305710Ctx.this.getIp35501RelativeRecNumGroup();
     Ip005704TableData ip005704TableData = Ip305710Ctx.this.getIp005704TableData();
     MaxRrnLimitErr620 maxRrnLimitErr620 = Ip305710Ctx.this.getMaxRrnLimitErr620();
     AbendMessage900 abendMessage900 = Ip305710Ctx.this.getAbendMessage900();
     Ip50005oOneDayRec ip50005oOneDayRec = Ip305710Ctx.this.getIp50005oOneDayRec();

	/**
	 *	Returns the value of ip50005oTableData
	 *	@return ip50005oTableData
	 */
   public char[] getIp50005oTableData() throws CFException  {              
   		return ip50005oOneDayRec.getIp50005oTableData();
   }

  
	/**
	*  set variable ip50005oTableData
	*  @param value
	**/
   public void setIp50005oTableData(char[] value) throws CFException {
      ip50005oOneDayRec.setIp50005oTableData(value);
   } 

     /**
	 * 	Update Ip50005oTableData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005oTableData(char[] source, int sourceIndex) throws CFException {
      ip50005oOneDayRec.setIp50005oTableData(source, sourceIndex);
   	
   }
   
   public void setIp50005oTableData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50005oOneDayRec.setIp50005oTableData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005oTableData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50005oOneDayRec.setIp50005oTableData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50005oTableData with another Field
	 *	@param value
	 */
   public void setIp50005oTableData(Field source) {
      ip50005oOneDayRec.setIp50005oTableData(source);
   }  
   
     /**
	 * 	Update Ip50005oTableData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005oTableData(Field source, int sourceIndex,int sourceLen) {
      ip50005oOneDayRec.setIp50005oTableData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50005oTableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50005oOneDayRec.setIp50005oTableData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip570004Tbl57RelRecNumSt
	 *	@return ip570004Tbl57RelRecNumSt
	 */
	public int getIp570004Tbl57RelRecNumSt(int index) throws CFException {        
   		return ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().getIp570004Tbl57RelRecNumSt();
	}
	
	/**
	 * 	Update Ip570004Tbl57RelRecNumSt with the passed value
	 *	@param number
	 */
	public void setIp570004Tbl57RelRecNumSt(int index,int number)  throws CFException{
		ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().setIp570004Tbl57RelRecNumSt(number);
	}


	public void setIp570004Tbl57RelRecNumSt(int index,long number)  throws CFException{
		ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().setIp570004Tbl57RelRecNumSt((int)number);
	}


	/**
	 *	Returns the value of ip005704TableData
	 *	@return ip005704TableData
	 */   
	 public Ip005704TableData getIp005704TableData() {
   	return ip005704TableData;
   }


	/**
	 *	Returns the value of maxRrnLimit620
	 *	@return maxRrnLimit620
	 */
	public int getMaxRrnLimit620() throws CFException {
   		return maxRrnLimitErr620.getMaxRrnLimit620();
	}


	/**
	 *	Returns String value of maxRrnLimit620
	 *	@return maxRrnLimit620
	 */
	public char[]  getMaxRrnLimit620String() throws CFException {
	     return String.valueOf(maxRrnLimitErr620.getMaxRrnLimit620String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maxRrnLimit620IsNumeric()  throws CFException{
	    return maxRrnLimitErr620.maxRrnLimit620IsNumeric();
	}

	/**
	 * 	Update MaxRrnLimit620 with the passed value
	 *	@param number
	 */
	public void setMaxRrnLimit620(int number)  throws CFException{
		maxRrnLimitErr620.setMaxRrnLimit620(number);
	}
	

	public void setMaxRrnLimit620(long number)  throws CFException{
	    maxRrnLimitErr620.setMaxRrnLimit620(number);
	}
	
	
	/**
	 * 	Update MaxRrnLimit620 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaxRrnLimit620(char[] value)  throws CFException {
		maxRrnLimitErr620.setMaxRrnLimit620(value);
	}
	
	/**
	 * 	Update MaxRrnLimit620 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaxRrnLimit620String(char[] value)  throws CFException{
		maxRrnLimitErr620.setMaxRrnLimit620(value);
	}	

	/**
	 *	Returns the value of maxRrnLimitErr620
	 *	@return maxRrnLimitErr620
	 */   
	 public MaxRrnLimitErr620 getMaxRrnLimitErr620() {
   	return maxRrnLimitErr620;
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
	 *	Returns the value of ip570004Idx
	 *	@return ip570004Idx
	 */
	public long getIp570004Idx() throws CFException {        
   		return ip570004TableDataInfo.getIp570004Idx();
	}
	
	/**
	 * 	Update Ip570004Idx with the passed value
	 *	@param number
	 */
	public void setIp570004Idx(long number)  throws CFException{
		ip570004TableDataInfo.setIp570004Idx(number);
	}



	/**
	 *	Returns the value of pcCapGrpPtr620
	 *	@return pcCapGrpPtr620
	 */
	public long getPcCapGrpPtr620() throws CFException {
   		return maxRrnLimitErr620.getPcCapGrpPtr620();
	}


	/**
	 *	Returns String value of pcCapGrpPtr620
	 *	@return pcCapGrpPtr620
	 */
	public char[]  getPcCapGrpPtr620String() throws CFException {
	     return String.valueOf(maxRrnLimitErr620.getPcCapGrpPtr620String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pcCapGrpPtr620IsNumeric()  throws CFException{
	    return maxRrnLimitErr620.pcCapGrpPtr620IsNumeric();
	}

	/**
	 * 	Update PcCapGrpPtr620 with the passed value
	 *	@param number
	 */
	public void setPcCapGrpPtr620(long number)  throws CFException{
		maxRrnLimitErr620.setPcCapGrpPtr620(number);
	}
	

	
	/**
	 * 	Update PcCapGrpPtr620 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPcCapGrpPtr620(char[] value)  throws CFException {
		maxRrnLimitErr620.setPcCapGrpPtr620(value);
	}
	
	/**
	 * 	Update PcCapGrpPtr620 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPcCapGrpPtr620String(char[] value)  throws CFException{
		maxRrnLimitErr620.setPcCapGrpPtr620(value);
	}	

	/**
	 *	Returns the value of abendCd3003300
	 *	@return abendCd3003300
	 */
   public char[] getAbendCd3003300() throws CFException  {              
   		return work.getAbendCd3003300();
   }

  
	/**
	*  set variable abendCd3003300
	*  @param value
	**/
   public void setAbendCd3003300(char[] value) throws CFException {
      work.setAbendCd3003300(value);
   } 

	/**
	 *	Returns the value of ip005703Tbl57PcCabGrpPtr
	 *	@return ip005703Tbl57PcCabGrpPtr
	 */
	public long getIp005703Tbl57PcCabGrpPtr() throws CFException {
   		return ip005703TableData.getIp005703Tbl57PcCabGrpPtr();
	}


	/**
	 *	Returns String value of ip005703Tbl57PcCabGrpPtr
	 *	@return ip005703Tbl57PcCabGrpPtr
	 */
	public char[]  getIp005703Tbl57PcCabGrpPtrString() throws CFException {
	     return String.valueOf(ip005703TableData.getIp005703Tbl57PcCabGrpPtrString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip005703Tbl57PcCabGrpPtrIsNumeric()  throws CFException{
	    return ip005703TableData.ip005703Tbl57PcCabGrpPtrIsNumeric();
	}

	/**
	 * 	Update Ip005703Tbl57PcCabGrpPtr with the passed value
	 *	@param number
	 */
	public void setIp005703Tbl57PcCabGrpPtr(long number)  throws CFException{
		ip005703TableData.setIp005703Tbl57PcCabGrpPtr(number);
	}
	

	
	/**
	 * 	Update Ip005703Tbl57PcCabGrpPtr with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp005703Tbl57PcCabGrpPtr(char[] value)  throws CFException {
		ip005703TableData.setIp005703Tbl57PcCabGrpPtr(value);
	}
	
	/**
	 * 	Update Ip005703Tbl57PcCabGrpPtr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp005703Tbl57PcCabGrpPtrString(char[] value)  throws CFException{
		ip005703TableData.setIp005703Tbl57PcCabGrpPtr(value);
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
	 *	Returns the value of uniqMaxCabPtrErrorCd610
	 *	@return uniqMaxCabPtrErrorCd610
	 */
   public char[] getUniqMaxCabPtrErrorCd610() throws CFException  {              
   		return work.getUniqMaxCabPtrErrorCd610();
   }

  
	/**
	*  set variable uniqMaxCabPtrErrorCd610
	*  @param value
	**/
   public void setUniqMaxCabPtrErrorCd610(char[] value) throws CFException {
      work.setUniqMaxCabPtrErrorCd610(value);
   } 

	/**
	 *	Returns the value of para2100300
	 *	@return para2100300
	 */
   public char[] getPara2100300() throws CFException  {              
   		return work.getPara2100300();
   }

  
	/**
	*  set variable para2100300
	*  @param value
	**/
   public void setPara2100300(char[] value) throws CFException {
      work.setPara2100300(value);
   } 

	/**
	 *	Returns the value of entryLength800
	 *	@return entryLength800
	 */
	public int getEntryLength800() throws CFException {        
   		return work.getEntryLength800();
	}
	
	/**
	 * 	Update EntryLength800 with the passed value
	 *	@param number
	 */
	public void setEntryLength800(int number)  throws CFException{
		work.setEntryLength800(number);
	}


	public void setEntryLength800(long number)  throws CFException{
		work.setEntryLength800((int)number);
	}


	/**
	 *	Returns the value of ip570004Tbl57CabGpEntryLt
	 *	@return ip570004Tbl57CabGpEntryLt
	 */
	public long getIp570004Tbl57CabGpEntryLt(int index) throws CFException {        
   		return ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().getIp570004Tbl57CabGpEntryLt();
	}
	
	/**
	 * 	Update Ip570004Tbl57CabGpEntryLt with the passed value
	 *	@param number
	 */
	public void setIp570004Tbl57CabGpEntryLt(int index,long number)  throws CFException{
		ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().setIp570004Tbl57CabGpEntryLt(number);
	}



	/**
	 *	Returns the value of currPtrLngth800
	 *	@return currPtrLngth800
	 */
	public long getCurrPtrLngth800() throws CFException {        
   		return work.getCurrPtrLngth800();
	}
	
	/**
	 * 	Update CurrPtrLngth800 with the passed value
	 *	@param number
	 */
	public void setCurrPtrLngth800(long number)  throws CFException{
		work.setCurrPtrLngth800(number);
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
	 *	Returns the value of uniqMaxCabPtrErrorMsg610
	 *	@return uniqMaxCabPtrErrorMsg610
	 */
   public char[] getUniqMaxCabPtrErrorMsg610() throws CFException  {              
   		return work.getUniqMaxCabPtrErrorMsg610();
   }

  
	/**
	*  set variable uniqMaxCabPtrErrorMsg610
	*  @param value
	**/
   public void setUniqMaxCabPtrErrorMsg610(char[] value) throws CFException {
      work.setUniqMaxCabPtrErrorMsg610(value);
   } 

	/**
	 *	Returns the value of start800
	 *	@return start800
	 */
	public long getStart800() throws CFException {        
   		return work.getStart800();
	}
	
	/**
	 * 	Update Start800 with the passed value
	 *	@param number
	 */
	public void setStart800(long number)  throws CFException{
		work.setStart800(number);
	}



	/**
	 *	Returns the value of actualRrnLimit620
	 *	@return actualRrnLimit620
	 */
	public int getActualRrnLimit620() throws CFException {
   		return maxRrnLimitErr620.getActualRrnLimit620();
	}


	/**
	 *	Returns String value of actualRrnLimit620
	 *	@return actualRrnLimit620
	 */
	public char[]  getActualRrnLimit620String() throws CFException {
	     return String.valueOf(maxRrnLimitErr620.getActualRrnLimit620String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean actualRrnLimit620IsNumeric()  throws CFException{
	    return maxRrnLimitErr620.actualRrnLimit620IsNumeric();
	}

	/**
	 * 	Update ActualRrnLimit620 with the passed value
	 *	@param number
	 */
	public void setActualRrnLimit620(int number)  throws CFException{
		maxRrnLimitErr620.setActualRrnLimit620(number);
	}
	

	public void setActualRrnLimit620(long number)  throws CFException{
	    maxRrnLimitErr620.setActualRrnLimit620(number);
	}
	
	
	/**
	 * 	Update ActualRrnLimit620 with the passed value
	 *	@param value (String or char[])
	 */
	public void setActualRrnLimit620(char[] value)  throws CFException {
		maxRrnLimitErr620.setActualRrnLimit620(value);
	}
	
	/**
	 * 	Update ActualRrnLimit620 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setActualRrnLimit620String(char[] value)  throws CFException{
		maxRrnLimitErr620.setActualRrnLimit620(value);
	}	

	/**
	 *	Returns the value of length800
	 *	@return length800
	 */
	public int getLength800() throws CFException {        
   		return work.getLength800();
	}
	
	/**
	 * 	Update Length800 with the passed value
	 *	@param number
	 */
	public void setLength800(int number)  throws CFException{
		work.setLength800(number);
	}


	public void setLength800(long number)  throws CFException{
		work.setLength800((int)number);
	}


	/**
	 *	Returns the value of ip35501RelativeRecNum
	 *	@return ip35501RelativeRecNum
	 */
	public int getIp35501RelativeRecNum() throws CFException {        
   		return ip35501RelativeRecNumGroup.getIp35501RelativeRecNum();
	}
	
	/**
	 * 	Update Ip35501RelativeRecNum with the passed value
	 *	@param number
	 */
	public void setIp35501RelativeRecNum(int number)  throws CFException{
		ip35501RelativeRecNumGroup.setIp35501RelativeRecNum(number);
	}


	public void setIp35501RelativeRecNum(long number)  throws CFException{
		ip35501RelativeRecNumGroup.setIp35501RelativeRecNum((int)number);
	}


	/**
	 *	Returns the value of ip570004Tbl57CabGpEntrySt
	 *	@return ip570004Tbl57CabGpEntrySt
	 */
	public long getIp570004Tbl57CabGpEntrySt(int index) throws CFException {        
   		return ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().getIp570004Tbl57CabGpEntrySt();
	}
	
	/**
	 * 	Update Ip570004Tbl57CabGpEntrySt with the passed value
	 *	@param number
	 */
	public void setIp570004Tbl57CabGpEntrySt(int index,long number)  throws CFException{
		ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().setIp570004Tbl57CabGpEntrySt(number);
	}



	/**
	 *	Returns the value of maxRrnLimit300
	 *	@return maxRrnLimit300
	 */
	public int getMaxRrnLimit300() throws CFException {
   		return work.getMaxRrnLimit300();
	}


	/**
	 *	Returns String value of maxRrnLimit300
	 *	@return maxRrnLimit300
	 */
	public char[]  getMaxRrnLimit300String() throws CFException {
	     return String.valueOf(work.getMaxRrnLimit300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maxRrnLimit300IsNumeric()  throws CFException{
	    return work.maxRrnLimit300IsNumeric();
	}

	/**
	 * 	Update MaxRrnLimit300 with the passed value
	 *	@param number
	 */
	public void setMaxRrnLimit300(int number)  throws CFException{
		work.setMaxRrnLimit300(number);
	}
	

	public void setMaxRrnLimit300(long number)  throws CFException{
	    work.setMaxRrnLimit300(number);
	}
	
	
	/**
	 * 	Update MaxRrnLimit300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaxRrnLimit300(char[] value)  throws CFException {
		work.setMaxRrnLimit300(value);
	}
	
	/**
	 * 	Update MaxRrnLimit300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaxRrnLimit300String(char[] value)  throws CFException{
		work.setMaxRrnLimit300(value);
	}	

	/**
	 *	Returns the value of ip570004Tbl57RelRecNumEnd
	 *	@return ip570004Tbl57RelRecNumEnd
	 */
	public int getIp570004Tbl57RelRecNumEnd(int index) throws CFException {        
   		return ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().getIp570004Tbl57RelRecNumEnd();
	}
	
	/**
	 * 	Update Ip570004Tbl57RelRecNumEnd with the passed value
	 *	@param number
	 */
	public void setIp570004Tbl57RelRecNumEnd(int index,int number)  throws CFException{
		ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().setIp570004Tbl57RelRecNumEnd(number);
	}


	public void setIp570004Tbl57RelRecNumEnd(int index,long number)  throws CFException{
		ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PointerData().setIp570004Tbl57RelRecNumEnd((int)number);
	}


	/**
	 *	Returns the value of rrnNbr800
	 *	@return rrnNbr800
	 */
	public int getRrnNbr800() throws CFException {        
   		return work.getRrnNbr800();
	}
	
	/**
	 * 	Update RrnNbr800 with the passed value
	 *	@param number
	 */
	public void setRrnNbr800(int number)  throws CFException{
		work.setRrnNbr800(number);
	}


	public void setRrnNbr800(long number)  throws CFException{
		work.setRrnNbr800((int)number);
	}


public long getIp570004Tbl57PcCabGrpPtr(int index) throws CFException {  
        return ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).getIp570004Tbl57PcCabGrpPtr();
}
	/**
	 * 	Update Ip570004Tbl57PcCabGrpPtr with the passed value
	 *	@param number
	 */
	public void setIp570004Tbl57PcCabGrpPtr(int index,long number)  throws CFException{
		ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry(index).setIp570004Tbl57PcCabGrpPtr(number);
	}




        public Ip305710Ctx getIp305710Ctx() {
            return Ip305710Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendParaName900.hashCode();
        str += work.hashCode();
        str += ip570004TableDataInfo.hashCode();
        str += ip005703TableData.hashCode();
        str += ip35501RelativeRecNumGroup.hashCode();
        str += ip005704TableData.hashCode();
        str += maxRrnLimitErr620.hashCode();
        str += abendMessage900.hashCode();
        str += ip50005oOneDayRec.hashCode();
       return str.hashCode();
    }

    public SaveTableEntryOutCtx clone() {
        SaveTableEntryOutCtx cloneObj = new SaveTableEntryOutCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip570004TableDataInfo = new Ip570004TableDataInfo();
        cloneObj.ip570004TableDataInfo.set(ip570004TableDataInfo.getClonedField());
        cloneObj.ip005703TableData = new Ip005703TableData();
        cloneObj.ip005703TableData.set(ip005703TableData.getClonedField());
        cloneObj.ip35501RelativeRecNumGroup = new Ip35501RelativeRecNumGroup();
        cloneObj.ip35501RelativeRecNumGroup.set(ip35501RelativeRecNumGroup.getClonedField());
        cloneObj.ip005704TableData = new Ip005704TableData();
        cloneObj.ip005704TableData.set(ip005704TableData.getClonedField());
        cloneObj.maxRrnLimitErr620 = new MaxRrnLimitErr620();
        cloneObj.maxRrnLimitErr620.set(maxRrnLimitErr620.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip50005oOneDayRec = new Ip50005oOneDayRec();
        cloneObj.ip50005oOneDayRec.set(ip50005oOneDayRec.getClonedField());
        return cloneObj;
    }

    }

    public SaveTableEntryOutCtx getSaveTableEntryOutCtx() {
            return new SaveTableEntryOutCtx();
    }
     public class PopulateOutputDataBlkInCtx implements Cloneable {
     Ip50005oOneDayRecLthGroup ip50005oOneDayRecLthGroup = Ip305710Ctx.this.getIp50005oOneDayRecLthGroup();
     Work work = Ip305710Ctx.this.getWork();
     Ip570004TableDataInfo ip570004TableDataInfo = Ip305710Ctx.this.getIp570004TableDataInfo();
     Ip35501RelativeRecNumGroup ip35501RelativeRecNumGroup = Ip305710Ctx.this.getIp35501RelativeRecNumGroup();
     Ip50005oOneDayRec ip50005oOneDayRec = Ip305710Ctx.this.getIp50005oOneDayRec();

	/**
	 *	Returns the value of ip35501RelativeRecNum
	 *	@return ip35501RelativeRecNum
	 */
	public int getIp35501RelativeRecNum() throws CFException {        
   		return ip35501RelativeRecNumGroup.getIp35501RelativeRecNum();
	}
	
	/**
	 * 	Update Ip35501RelativeRecNum with the passed value
	 *	@param number
	 */
	public void setIp35501RelativeRecNum(int number)  throws CFException{
		ip35501RelativeRecNumGroup.setIp35501RelativeRecNum(number);
	}


	public void setIp35501RelativeRecNum(long number)  throws CFException{
		ip35501RelativeRecNumGroup.setIp35501RelativeRecNum((int)number);
	}


	/**
	 *	Returns the value of tableId300
	 *	@return tableId300
	 */
   public char[] getTableId300() throws CFException  {              
   		return work.getTableId300();
   }

  
	/**
	*  set variable tableId300
	*  @param value
	**/
   public void setTableId300(char[] value) throws CFException {
      work.setTableId300(value);
   } 

	/**
	 *	Returns the value of start800
	 *	@return start800
	 */
	public long getStart800() throws CFException {        
   		return work.getStart800();
	}
	
	/**
	 * 	Update Start800 with the passed value
	 *	@param number
	 */
	public void setStart800(long number)  throws CFException{
		work.setStart800(number);
	}



	/**
	 *	Returns the value of ip570004EffdtTm
	 *	@return ip570004EffdtTm
	 */
   public char[] getIp570004EffdtTm() throws CFException  {              
   		return ip570004TableDataInfo.getIp570004EffdtTm();
   }

  
	/**
	*  set variable ip570004EffdtTm
	*  @param value
	**/
   public void setIp570004EffdtTm(char[] value) throws CFException {
      ip570004TableDataInfo.setIp570004EffdtTm(value);
   } 

     /**
	 * 	Update Ip570004EffdtTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp570004EffdtTm(char[] source, int sourceIndex) throws CFException {
      ip570004TableDataInfo.setIp570004EffdtTm(source, sourceIndex);
   	
   }
   
   public void setIp570004EffdtTm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip570004TableDataInfo.setIp570004EffdtTm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip570004EffdtTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp570004EffdtTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip570004TableDataInfo.setIp570004EffdtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip570004EffdtTm with another Field
	 *	@param value
	 */
   public void setIp570004EffdtTm(Field source) {
      ip570004TableDataInfo.setIp570004EffdtTm(source);
   }  
   
     /**
	 * 	Update Ip570004EffdtTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp570004EffdtTm(Field source, int sourceIndex,int sourceLen) {
      ip570004TableDataInfo.setIp570004EffdtTm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip570004EffdtTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp570004EffdtTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip570004TableDataInfo.setIp570004EffdtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip305710Ctx getIp305710Ctx() {
            return Ip305710Ctx.this;
        }

        public PopulateOutputDataBlkOutCtx getPopulateOutputDataBlkOutCtx() {
            return new PopulateOutputDataBlkOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip50005oOneDayRecLthGroup.hashCode();
        str += work.hashCode();
        str += ip570004TableDataInfo.hashCode();
        str += ip35501RelativeRecNumGroup.hashCode();
        str += ip50005oOneDayRec.hashCode();
       return str.hashCode();
    }

    public PopulateOutputDataBlkInCtx clone() {
        PopulateOutputDataBlkInCtx cloneObj = new PopulateOutputDataBlkInCtx();
        cloneObj.ip50005oOneDayRecLthGroup = new Ip50005oOneDayRecLthGroup();
        cloneObj.ip50005oOneDayRecLthGroup.set(ip50005oOneDayRecLthGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip570004TableDataInfo = new Ip570004TableDataInfo();
        cloneObj.ip570004TableDataInfo.set(ip570004TableDataInfo.getClonedField());
        cloneObj.ip35501RelativeRecNumGroup = new Ip35501RelativeRecNumGroup();
        cloneObj.ip35501RelativeRecNumGroup.set(ip35501RelativeRecNumGroup.getClonedField());
        cloneObj.ip50005oOneDayRec = new Ip50005oOneDayRec();
        cloneObj.ip50005oOneDayRec.set(ip50005oOneDayRec.getClonedField());
        return cloneObj;
    }

    }

    public PopulateOutputDataBlkInCtx getPopulateOutputDataBlkInCtx() {
            return new PopulateOutputDataBlkInCtx();
    }
     public class PopulateOutputDataBlkOutCtx implements Cloneable {
     Ip50005oOneDayRecLthGroup ip50005oOneDayRecLthGroup = Ip305710Ctx.this.getIp50005oOneDayRecLthGroup();
     Work work = Ip305710Ctx.this.getWork();
     Ip570004TableDataInfo ip570004TableDataInfo = Ip305710Ctx.this.getIp570004TableDataInfo();
     Ip35501RelativeRecNumGroup ip35501RelativeRecNumGroup = Ip305710Ctx.this.getIp35501RelativeRecNumGroup();
     Ip50005oOneDayRec ip50005oOneDayRec = Ip305710Ctx.this.getIp50005oOneDayRec();

	/**
	 *	Returns the value of ip50005oTableId
	 *	@return ip50005oTableId
	 */   
	 public Ip50005oTableId getIp50005oTableId() {
   	return ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().getIp50005oTableId();
   }

   /**
	* 	Update Ip50005oTableId with the passed value
	*	@param value
	*/
   public void setIp50005oTableId(char[] value) throws CFException {
      ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().setIp50005oTableId(value);
   }   

     /**
	 * 	Update Ip50005oTableId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50005oTableId(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().setIp50005oTableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005oTableId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().setIp50005oTableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50005oTableId with another Field
	 *	@param value
	 */
   public void setIp50005oTableId(Field source) {
   	ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().setIp50005oTableId(source);
   }  
   
     /**
	 * 	Update Ip50005oTableId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50005oTableId(Field source, int sourceIndex,int sourceLen) {
   	ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().setIp50005oTableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005oTableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().setIp50005oTableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip50005oEffDate
	 *	@return ip50005oEffDate
	 */
	public long getIp50005oEffDate() throws CFException {
   		return ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().getIp50005oEffDate();
	}


	/**
	 *	Returns String value of ip50005oEffDate
	 *	@return ip50005oEffDate
	 */
	public char[]  getIp50005oEffDateString() throws CFException {
	     return String.valueOf(ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().getIp50005oEffDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip50005oEffDateIsNumeric()  throws CFException{
	    return ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().ip50005oEffDateIsNumeric();
	}

	/**
	 * 	Update Ip50005oEffDate with the passed value
	 *	@param number
	 */
	public void setIp50005oEffDate(long number)  throws CFException{
		ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().setIp50005oEffDate(number);
	}
	

	
	/**
	 * 	Update Ip50005oEffDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp50005oEffDate(char[] value)  throws CFException {
		ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().setIp50005oEffDate(value);
	}
	
	/**
	 * 	Update Ip50005oEffDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp50005oEffDateString(char[] value)  throws CFException{
		ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().setIp50005oEffDate(value);
	}	

	/**
	 *	Returns the value of ip35501RelativeRecNum
	 *	@return ip35501RelativeRecNum
	 */
	public int getIp35501RelativeRecNum() throws CFException {        
   		return ip35501RelativeRecNumGroup.getIp35501RelativeRecNum();
	}
	
	/**
	 * 	Update Ip35501RelativeRecNum with the passed value
	 *	@param number
	 */
	public void setIp35501RelativeRecNum(int number)  throws CFException{
		ip35501RelativeRecNumGroup.setIp35501RelativeRecNum(number);
	}


	public void setIp35501RelativeRecNum(long number)  throws CFException{
		ip35501RelativeRecNumGroup.setIp35501RelativeRecNum((int)number);
	}


	/**
	 *	Returns the value of tableId300
	 *	@return tableId300
	 */
   public char[] getTableId300() throws CFException  {              
   		return work.getTableId300();
   }

  
	/**
	*  set variable tableId300
	*  @param value
	**/
   public void setTableId300(char[] value) throws CFException {
      work.setTableId300(value);
   } 

	/**
	 *	Returns the value of start800
	 *	@return start800
	 */
	public long getStart800() throws CFException {        
   		return work.getStart800();
	}
	
	/**
	 * 	Update Start800 with the passed value
	 *	@param number
	 */
	public void setStart800(long number)  throws CFException{
		work.setStart800(number);
	}



	/**
	 *	Returns the value of ip570004EffdtTm
	 *	@return ip570004EffdtTm
	 */
   public char[] getIp570004EffdtTm() throws CFException  {              
   		return ip570004TableDataInfo.getIp570004EffdtTm();
   }

  
	/**
	*  set variable ip570004EffdtTm
	*  @param value
	**/
   public void setIp570004EffdtTm(char[] value) throws CFException {
      ip570004TableDataInfo.setIp570004EffdtTm(value);
   } 

     /**
	 * 	Update Ip570004EffdtTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp570004EffdtTm(char[] source, int sourceIndex) throws CFException {
      ip570004TableDataInfo.setIp570004EffdtTm(source, sourceIndex);
   	
   }
   
   public void setIp570004EffdtTm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip570004TableDataInfo.setIp570004EffdtTm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip570004EffdtTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp570004EffdtTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip570004TableDataInfo.setIp570004EffdtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip570004EffdtTm with another Field
	 *	@param value
	 */
   public void setIp570004EffdtTm(Field source) {
      ip570004TableDataInfo.setIp570004EffdtTm(source);
   }  
   
     /**
	 * 	Update Ip570004EffdtTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp570004EffdtTm(Field source, int sourceIndex,int sourceLen) {
      ip570004TableDataInfo.setIp570004EffdtTm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip570004EffdtTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp570004EffdtTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip570004TableDataInfo.setIp570004EffdtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip50005oOneDayRecLth
	 *	@return ip50005oOneDayRecLth
	 */
	public long getIp50005oOneDayRecLth() throws CFException {        
   		return ip50005oOneDayRecLthGroup.getIp50005oOneDayRecLth();
	}
	
	/**
	 * 	Update Ip50005oOneDayRecLth with the passed value
	 *	@param number
	 */
	public void setIp50005oOneDayRecLth(long number)  throws CFException{
		ip50005oOneDayRecLthGroup.setIp50005oOneDayRecLth(number);
	}




        public Ip305710Ctx getIp305710Ctx() {
            return Ip305710Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip50005oOneDayRecLthGroup.hashCode();
        str += work.hashCode();
        str += ip570004TableDataInfo.hashCode();
        str += ip35501RelativeRecNumGroup.hashCode();
        str += ip50005oOneDayRec.hashCode();
       return str.hashCode();
    }

    public PopulateOutputDataBlkOutCtx clone() {
        PopulateOutputDataBlkOutCtx cloneObj = new PopulateOutputDataBlkOutCtx();
        cloneObj.ip50005oOneDayRecLthGroup = new Ip50005oOneDayRecLthGroup();
        cloneObj.ip50005oOneDayRecLthGroup.set(ip50005oOneDayRecLthGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip570004TableDataInfo = new Ip570004TableDataInfo();
        cloneObj.ip570004TableDataInfo.set(ip570004TableDataInfo.getClonedField());
        cloneObj.ip35501RelativeRecNumGroup = new Ip35501RelativeRecNumGroup();
        cloneObj.ip35501RelativeRecNumGroup.set(ip35501RelativeRecNumGroup.getClonedField());
        cloneObj.ip50005oOneDayRec = new Ip50005oOneDayRec();
        cloneObj.ip50005oOneDayRec.set(ip50005oOneDayRec.getClonedField());
        return cloneObj;
    }

    }

    public PopulateOutputDataBlkOutCtx getPopulateOutputDataBlkOutCtx() {
            return new PopulateOutputDataBlkOutCtx();
    }
     public class DisplayAbendMessageInCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip305710Ctx.this.getAbendParaName900();
     Work work = Ip305710Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip305710Ctx.this.getAbendMessage900();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip305710Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of pgmIp610010300
	 *	@return pgmIp610010300
	 */
   public char[] getPgmIp610010300() throws CFException  {              
   		return work.getPgmIp610010300();
   }

  
	/**
	*  set variable pgmIp610010300
	*  @param value
	**/
   public void setPgmIp610010300(char[] value) throws CFException {
      work.setPgmIp610010300(value);
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
	 *	Returns the value of abendMessage900
	 *	@return abendMessage900
	 */   
	 public AbendMessage900 getAbendMessage900() {
   	return abendMessage900;
   }



        public Ip305710Ctx getIp305710Ctx() {
            return Ip305710Ctx.this;
        }

        public DisplayAbendMessageOutCtx getDisplayAbendMessageOutCtx() {
            return new DisplayAbendMessageOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendParaName900.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public DisplayAbendMessageInCtx clone() {
        DisplayAbendMessageInCtx cloneObj = new DisplayAbendMessageInCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public DisplayAbendMessageInCtx getDisplayAbendMessageInCtx() {
            return new DisplayAbendMessageInCtx();
    }
     public class DisplayAbendMessageOutCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip305710Ctx.this.getAbendParaName900();
     Work work = Ip305710Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip305710Ctx.this.getAbendMessage900();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip305710Ctx.this.getIp60001EventLogWorkArea();

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


        public Ip305710Ctx getIp305710Ctx() {
            return Ip305710Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendParaName900.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public DisplayAbendMessageOutCtx clone() {
        DisplayAbendMessageOutCtx cloneObj = new DisplayAbendMessageOutCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public DisplayAbendMessageOutCtx getDisplayAbendMessageOutCtx() {
            return new DisplayAbendMessageOutCtx();
    }
}
