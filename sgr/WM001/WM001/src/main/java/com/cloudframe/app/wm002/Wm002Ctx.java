package com.cloudframe.app.wm002;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.wm002.dto.Work;


@Context
public class Wm002Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;


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

    boolean doNotSkipContinue = true;

    public boolean getDoNotSkipContinue() {
        return this.doNotSkipContinue;
    }

    public void setDoNotSkipContinue(boolean doNotSkipContinue) {
            this.doNotSkipContinue = doNotSkipContinue;
        }
    boolean doNotSkipBadPlanidCheck = true;

    public boolean getDoNotSkipBadPlanidCheck() {
        return this.doNotSkipBadPlanidCheck;
    }

    public void setDoNotSkipBadPlanidCheck(boolean doNotSkipBadPlanidCheck) {
            this.doNotSkipBadPlanidCheck = doNotSkipBadPlanidCheck;
        }
    boolean doNotSkipProcessResponse = true;

    public boolean getDoNotSkipProcessResponse() {
        return this.doNotSkipProcessResponse;
    }

    public void setDoNotSkipProcessResponse(boolean doNotSkipProcessResponse) {
            this.doNotSkipProcessResponse = doNotSkipProcessResponse;
        }
    boolean doNotSkipExit = true;

    public boolean getDoNotSkipExit() {
        return this.doNotSkipExit;
    }

    public void setDoNotSkipExit(boolean doNotSkipExit) {
            this.doNotSkipExit = doNotSkipExit;
        }
    boolean doNotSkipReadMbi = true;

    public boolean getDoNotSkipReadMbi() {
        return this.doNotSkipReadMbi;
    }

    public void setDoNotSkipReadMbi(boolean doNotSkipReadMbi) {
            this.doNotSkipReadMbi = doNotSkipReadMbi;
        }
    boolean doNotSkipMbiElig = true;

    public boolean getDoNotSkipMbiElig() {
        return this.doNotSkipMbiElig;
    }

    public void setDoNotSkipMbiElig(boolean doNotSkipMbiElig) {
            this.doNotSkipMbiElig = doNotSkipMbiElig;
        }
    boolean doNotSkipConvertKey = true;

    public boolean getDoNotSkipConvertKey() {
        return this.doNotSkipConvertKey;
    }

    public void setDoNotSkipConvertKey(boolean doNotSkipConvertKey) {
            this.doNotSkipConvertKey = doNotSkipConvertKey;
        }
    boolean doNotSkipCheckForEemAndBeq = true;

    public boolean getDoNotSkipCheckForEemAndBeq() {
        return this.doNotSkipCheckForEemAndBeq;
    }

    public void setDoNotSkipCheckForEemAndBeq(boolean doNotSkipCheckForEemAndBeq) {
            this.doNotSkipCheckForEemAndBeq = doNotSkipCheckForEemAndBeq;
        }
    boolean doNotSkipGetCpm = true;

    public boolean getDoNotSkipGetCpm() {
        return this.doNotSkipGetCpm;
    }

    public void setDoNotSkipGetCpm(boolean doNotSkipGetCpm) {
            this.doNotSkipGetCpm = doNotSkipGetCpm;
        }
    boolean doNotSkipGetCutoffTime = true;

    public boolean getDoNotSkipGetCutoffTime() {
        return this.doNotSkipGetCutoffTime;
    }

    public void setDoNotSkipGetCutoffTime(boolean doNotSkipGetCutoffTime) {
            this.doNotSkipGetCutoffTime = doNotSkipGetCutoffTime;
        }
    boolean doNotSkipRejectInputFile = true;

    public boolean getDoNotSkipRejectInputFile() {
        return this.doNotSkipRejectInputFile;
    }

    public void setDoNotSkipRejectInputFile(boolean doNotSkipRejectInputFile) {
            this.doNotSkipRejectInputFile = doNotSkipRejectInputFile;
        }
    boolean doNotSkipOutputHeaderRecd = true;

    public boolean getDoNotSkipOutputHeaderRecd() {
        return this.doNotSkipOutputHeaderRecd;
    }

    public void setDoNotSkipOutputHeaderRecd(boolean doNotSkipOutputHeaderRecd) {
            this.doNotSkipOutputHeaderRecd = doNotSkipOutputHeaderRecd;
        }
    boolean doNotSkipDeleteTransRec = true;

    public boolean getDoNotSkipDeleteTransRec() {
        return this.doNotSkipDeleteTransRec;
    }

    public void setDoNotSkipDeleteTransRec(boolean doNotSkipDeleteTransRec) {
            this.doNotSkipDeleteTransRec = doNotSkipDeleteTransRec;
        }
    boolean doNotSkipProcessAccretionTrans = true;

    public boolean getDoNotSkipProcessAccretionTrans() {
        return this.doNotSkipProcessAccretionTrans;
    }

    public void setDoNotSkipProcessAccretionTrans(boolean doNotSkipProcessAccretionTrans) {
            this.doNotSkipProcessAccretionTrans = doNotSkipProcessAccretionTrans;
        }
    boolean doNotSkipProcessDeletionTrans = true;

    public boolean getDoNotSkipProcessDeletionTrans() {
        return this.doNotSkipProcessDeletionTrans;
    }

    public void setDoNotSkipProcessDeletionTrans(boolean doNotSkipProcessDeletionTrans) {
            this.doNotSkipProcessDeletionTrans = doNotSkipProcessDeletionTrans;
        }
    boolean doNotSkipProcessChangeTrans = true;

    public boolean getDoNotSkipProcessChangeTrans() {
        return this.doNotSkipProcessChangeTrans;
    }

    public void setDoNotSkipProcessChangeTrans(boolean doNotSkipProcessChangeTrans) {
            this.doNotSkipProcessChangeTrans = doNotSkipProcessChangeTrans;
        }
    boolean doNotSkipProcessCancelTrans = true;

    public boolean getDoNotSkipProcessCancelTrans() {
        return this.doNotSkipProcessCancelTrans;
    }

    public void setDoNotSkipProcessCancelTrans(boolean doNotSkipProcessCancelTrans) {
            this.doNotSkipProcessCancelTrans = doNotSkipProcessCancelTrans;
        }
    boolean doNotSkipProcessFaTrans = true;

    public boolean getDoNotSkipProcessFaTrans() {
        return this.doNotSkipProcessFaTrans;
    }

    public void setDoNotSkipProcessFaTrans(boolean doNotSkipProcessFaTrans) {
            this.doNotSkipProcessFaTrans = doNotSkipProcessFaTrans;
        }
    boolean doNotSkipProcessPosDrugEdit = true;

    public boolean getDoNotSkipProcessPosDrugEdit() {
        return this.doNotSkipProcessPosDrugEdit;
    }

    public void setDoNotSkipProcessPosDrugEdit(boolean doNotSkipProcessPosDrugEdit) {
            this.doNotSkipProcessPosDrugEdit = doNotSkipProcessPosDrugEdit;
        }
    boolean doNotSkipProcessIcmPartEdit = true;

    public boolean getDoNotSkipProcessIcmPartEdit() {
        return this.doNotSkipProcessIcmPartEdit;
    }

    public void setDoNotSkipProcessIcmPartEdit(boolean doNotSkipProcessIcmPartEdit) {
            this.doNotSkipProcessIcmPartEdit = doNotSkipProcessIcmPartEdit;
        }
    boolean doNotSkipProcessPersonalInfo = true;

    public boolean getDoNotSkipProcessPersonalInfo() {
        return this.doNotSkipProcessPersonalInfo;
    }

    public void setDoNotSkipProcessPersonalInfo(boolean doNotSkipProcessPersonalInfo) {
            this.doNotSkipProcessPersonalInfo = doNotSkipProcessPersonalInfo;
        }
    boolean doNotSkipContinue030 = true;

    public boolean getDoNotSkipContinue030() {
        return this.doNotSkipContinue030;
    }

    public void setDoNotSkipContinue030(boolean doNotSkipContinue030) {
            this.doNotSkipContinue030 = doNotSkipContinue030;
        }
    boolean doNotSkipBypassPaceDobCheck = true;

    public boolean getDoNotSkipBypassPaceDobCheck() {
        return this.doNotSkipBypassPaceDobCheck;
    }

    public void setDoNotSkipBypassPaceDobCheck(boolean doNotSkipBypassPaceDobCheck) {
            this.doNotSkipBypassPaceDobCheck = doNotSkipBypassPaceDobCheck;
        }
    boolean doNotSkipPaceHospiceCheckEnd = true;

    public boolean getDoNotSkipPaceHospiceCheckEnd() {
        return this.doNotSkipPaceHospiceCheckEnd;
    }

    public void setDoNotSkipPaceHospiceCheckEnd(boolean doNotSkipPaceHospiceCheckEnd) {
            this.doNotSkipPaceHospiceCheckEnd = doNotSkipPaceHospiceCheckEnd;
        }
    boolean doNotSkipVerifyWithMbdMaster250 = true;

    public boolean getDoNotSkipVerifyWithMbdMaster250() {
        return this.doNotSkipVerifyWithMbdMaster250;
    }

    public void setDoNotSkipVerifyWithMbdMaster250(boolean doNotSkipVerifyWithMbdMaster250) {
            this.doNotSkipVerifyWithMbdMaster250 = doNotSkipVerifyWithMbdMaster250;
        }
    boolean doNotSkipVerify71Retro = true;

    public boolean getDoNotSkipVerify71Retro() {
        return this.doNotSkipVerify71Retro;
    }

    public void setDoNotSkipVerify71Retro(boolean doNotSkipVerify71Retro) {
            this.doNotSkipVerify71Retro = doNotSkipVerify71Retro;
        }
    boolean loopProcessInputFile = true;

    public boolean getLoopProcessInputFile() {
        return this.loopProcessInputFile;
    }

    public void setLoopProcessInputFile(boolean loopProcessInputFile) {
            this.loopProcessInputFile = loopProcessInputFile;
        }
    boolean loopContinue030 = true;

    public boolean getLoopContinue030() {
        return this.loopContinue030;
    }

    public void setLoopContinue030(boolean loopContinue030) {
            this.loopContinue030 = loopContinue030;
        }
    boolean loopBadPlanidCheck = true;

    public boolean getLoopBadPlanidCheck() {
        return this.loopBadPlanidCheck;
    }

    public void setLoopBadPlanidCheck(boolean loopBadPlanidCheck) {
            this.loopBadPlanidCheck = loopBadPlanidCheck;
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

    public Wm002Ctx clone() {
        Wm002Ctx cloneObj = new Wm002Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class StartPgmInCtx implements Cloneable {
     Work work = Wm002Ctx.this.getWork();

	/**
	 *	Returns the value of callCount
	 *	@return callCount
	 */
	public int getCallCount() throws CFException {
   		return work.getCallCount();
	}


	/**
	 *	Returns String value of callCount
	 *	@return callCount
	 */
	public char[]  getCallCountString() throws CFException {
	     return String.valueOf(work.getCallCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean callCountIsNumeric()  throws CFException{
	    return work.callCountIsNumeric();
	}

	/**
	 * 	Update CallCount with the passed value
	 *	@param number
	 */
	public void setCallCount(int number)  throws CFException{
		work.setCallCount(number);
	}
	

	public void setCallCount(long number)  throws CFException{
	    work.setCallCount(number);
	}
	
	
	/**
	 * 	Update CallCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setCallCount(char[] value)  throws CFException {
		work.setCallCount(value);
	}
	
	/**
	 * 	Update CallCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCallCountString(char[] value)  throws CFException{
		work.setCallCount(value);
	}	


        public Wm002Ctx getWm002Ctx() {
            return Wm002Ctx.this;
        }

        public StartPgmOutCtx getStartPgmOutCtx() {
            return new StartPgmOutCtx();
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

    public StartPgmInCtx clone() {
        StartPgmInCtx cloneObj = new StartPgmInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public StartPgmInCtx getStartPgmInCtx() {
            return new StartPgmInCtx();
    }
     public class StartPgmOutCtx implements Cloneable {
     Work work = Wm002Ctx.this.getWork();

	/**
	 *	Returns the value of loopCount
	 *	@return loopCount
	 */
	public int getLoopCount() throws CFException {
   		return work.getLoopCount();
	}


	/**
	 *	Returns String value of loopCount
	 *	@return loopCount
	 */
	public char[]  getLoopCountString() throws CFException {
	     return String.valueOf(work.getLoopCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean loopCountIsNumeric()  throws CFException{
	    return work.loopCountIsNumeric();
	}

	/**
	 * 	Update LoopCount with the passed value
	 *	@param number
	 */
	public void setLoopCount(int number)  throws CFException{
		work.setLoopCount(number);
	}
	

	public void setLoopCount(long number)  throws CFException{
	    work.setLoopCount(number);
	}
	
	
	/**
	 * 	Update LoopCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setLoopCount(char[] value)  throws CFException {
		work.setLoopCount(value);
	}
	
	/**
	 * 	Update LoopCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLoopCountString(char[] value)  throws CFException{
		work.setLoopCount(value);
	}	

	/**
	 *	Returns the value of callCount
	 *	@return callCount
	 */
	public int getCallCount() throws CFException {
   		return work.getCallCount();
	}


	/**
	 *	Returns String value of callCount
	 *	@return callCount
	 */
	public char[]  getCallCountString() throws CFException {
	     return String.valueOf(work.getCallCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean callCountIsNumeric()  throws CFException{
	    return work.callCountIsNumeric();
	}

	/**
	 * 	Update CallCount with the passed value
	 *	@param number
	 */
	public void setCallCount(int number)  throws CFException{
		work.setCallCount(number);
	}
	

	public void setCallCount(long number)  throws CFException{
	    work.setCallCount(number);
	}
	
	
	/**
	 * 	Update CallCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setCallCount(char[] value)  throws CFException {
		work.setCallCount(value);
	}
	
	/**
	 * 	Update CallCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCallCountString(char[] value)  throws CFException{
		work.setCallCount(value);
	}	


        public Wm002Ctx getWm002Ctx() {
            return Wm002Ctx.this;
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

    public StartPgmOutCtx clone() {
        StartPgmOutCtx cloneObj = new StartPgmOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public StartPgmOutCtx getStartPgmOutCtx() {
            return new StartPgmOutCtx();
    }
     public class VerifyHeaderInCtx implements Cloneable {
     Work work = Wm002Ctx.this.getWork();

	/**
	 *	Returns the value of callCount
	 *	@return callCount
	 */
	public int getCallCount() throws CFException {
   		return work.getCallCount();
	}


	/**
	 *	Returns String value of callCount
	 *	@return callCount
	 */
	public char[]  getCallCountString() throws CFException {
	     return String.valueOf(work.getCallCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean callCountIsNumeric()  throws CFException{
	    return work.callCountIsNumeric();
	}

	/**
	 * 	Update CallCount with the passed value
	 *	@param number
	 */
	public void setCallCount(int number)  throws CFException{
		work.setCallCount(number);
	}
	

	public void setCallCount(long number)  throws CFException{
	    work.setCallCount(number);
	}
	
	
	/**
	 * 	Update CallCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setCallCount(char[] value)  throws CFException {
		work.setCallCount(value);
	}
	
	/**
	 * 	Update CallCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCallCountString(char[] value)  throws CFException{
		work.setCallCount(value);
	}	


        public Wm002Ctx getWm002Ctx() {
            return Wm002Ctx.this;
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

    public VerifyHeaderInCtx clone() {
        VerifyHeaderInCtx cloneObj = new VerifyHeaderInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public VerifyHeaderInCtx getVerifyHeaderInCtx() {
            return new VerifyHeaderInCtx();
    }
     public class ProcessInputFileInCtx implements Cloneable {
     Work work = Wm002Ctx.this.getWork();

	/**
	 *	Test condition "D" for isAddDummyGoTo()
	 *	@return  Returns true if isAddDummyGoTo() is "D"
	 */
   public boolean isAddDummyGoTo() throws CFException {
      return work.isAddDummyGoTo();
   }

	/**
	*  set values "D"
	*/
   	public void setAddDummyGoToTrue()  throws CFException{  			
    	work.setAddDummyGoToTrue();
   	}
	/**
	 *	Returns the value of loopCount
	 *	@return loopCount
	 */
	public int getLoopCount() throws CFException {
   		return work.getLoopCount();
	}


	/**
	 *	Returns String value of loopCount
	 *	@return loopCount
	 */
	public char[]  getLoopCountString() throws CFException {
	     return String.valueOf(work.getLoopCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean loopCountIsNumeric()  throws CFException{
	    return work.loopCountIsNumeric();
	}

	/**
	 * 	Update LoopCount with the passed value
	 *	@param number
	 */
	public void setLoopCount(int number)  throws CFException{
		work.setLoopCount(number);
	}
	

	public void setLoopCount(long number)  throws CFException{
	    work.setLoopCount(number);
	}
	
	
	/**
	 * 	Update LoopCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setLoopCount(char[] value)  throws CFException {
		work.setLoopCount(value);
	}
	
	/**
	 * 	Update LoopCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLoopCountString(char[] value)  throws CFException{
		work.setLoopCount(value);
	}	

	/**
	 *	Returns the value of callCount
	 *	@return callCount
	 */
	public int getCallCount() throws CFException {
   		return work.getCallCount();
	}


	/**
	 *	Returns String value of callCount
	 *	@return callCount
	 */
	public char[]  getCallCountString() throws CFException {
	     return String.valueOf(work.getCallCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean callCountIsNumeric()  throws CFException{
	    return work.callCountIsNumeric();
	}

	/**
	 * 	Update CallCount with the passed value
	 *	@param number
	 */
	public void setCallCount(int number)  throws CFException{
		work.setCallCount(number);
	}
	

	public void setCallCount(long number)  throws CFException{
	    work.setCallCount(number);
	}
	
	
	/**
	 * 	Update CallCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setCallCount(char[] value)  throws CFException {
		work.setCallCount(value);
	}
	
	/**
	 * 	Update CallCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCallCountString(char[] value)  throws CFException{
		work.setCallCount(value);
	}	


        public Wm002Ctx getWm002Ctx() {
            return Wm002Ctx.this;
        }

        public ProcessInputFileOutCtx getProcessInputFileOutCtx() {
            return new ProcessInputFileOutCtx();
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
     public class ProcessInputFileOutCtx implements Cloneable {
     Work work = Wm002Ctx.this.getWork();

	/**
	 *	Returns the value of loopCount
	 *	@return loopCount
	 */
	public int getLoopCount() throws CFException {
   		return work.getLoopCount();
	}


	/**
	 *	Returns String value of loopCount
	 *	@return loopCount
	 */
	public char[]  getLoopCountString() throws CFException {
	     return String.valueOf(work.getLoopCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean loopCountIsNumeric()  throws CFException{
	    return work.loopCountIsNumeric();
	}

	/**
	 * 	Update LoopCount with the passed value
	 *	@param number
	 */
	public void setLoopCount(int number)  throws CFException{
		work.setLoopCount(number);
	}
	

	public void setLoopCount(long number)  throws CFException{
	    work.setLoopCount(number);
	}
	
	
	/**
	 * 	Update LoopCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setLoopCount(char[] value)  throws CFException {
		work.setLoopCount(value);
	}
	
	/**
	 * 	Update LoopCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLoopCountString(char[] value)  throws CFException{
		work.setLoopCount(value);
	}	


        public Wm002Ctx getWm002Ctx() {
            return Wm002Ctx.this;
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

    public ProcessInputFileOutCtx clone() {
        ProcessInputFileOutCtx cloneObj = new ProcessInputFileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInputFileOutCtx getProcessInputFileOutCtx() {
            return new ProcessInputFileOutCtx();
    }
     public class BadPlanidCheckInCtx implements Cloneable {
     Work work = Wm002Ctx.this.getWork();

	/**
	 *	Returns the value of callCount
	 *	@return callCount
	 */
	public int getCallCount() throws CFException {
   		return work.getCallCount();
	}


	/**
	 *	Returns String value of callCount
	 *	@return callCount
	 */
	public char[]  getCallCountString() throws CFException {
	     return String.valueOf(work.getCallCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean callCountIsNumeric()  throws CFException{
	    return work.callCountIsNumeric();
	}

	/**
	 * 	Update CallCount with the passed value
	 *	@param number
	 */
	public void setCallCount(int number)  throws CFException{
		work.setCallCount(number);
	}
	

	public void setCallCount(long number)  throws CFException{
	    work.setCallCount(number);
	}
	
	
	/**
	 * 	Update CallCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setCallCount(char[] value)  throws CFException {
		work.setCallCount(value);
	}
	
	/**
	 * 	Update CallCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCallCountString(char[] value)  throws CFException{
		work.setCallCount(value);
	}	


        public Wm002Ctx getWm002Ctx() {
            return Wm002Ctx.this;
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

    public BadPlanidCheckInCtx clone() {
        BadPlanidCheckInCtx cloneObj = new BadPlanidCheckInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public BadPlanidCheckInCtx getBadPlanidCheckInCtx() {
            return new BadPlanidCheckInCtx();
    }
     public class Continue030InCtx implements Cloneable {
     Work work = Wm002Ctx.this.getWork();

	/**
	 *	Returns the value of callCount
	 *	@return callCount
	 */
	public int getCallCount() throws CFException {
   		return work.getCallCount();
	}


	/**
	 *	Returns String value of callCount
	 *	@return callCount
	 */
	public char[]  getCallCountString() throws CFException {
	     return String.valueOf(work.getCallCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean callCountIsNumeric()  throws CFException{
	    return work.callCountIsNumeric();
	}

	/**
	 * 	Update CallCount with the passed value
	 *	@param number
	 */
	public void setCallCount(int number)  throws CFException{
		work.setCallCount(number);
	}
	

	public void setCallCount(long number)  throws CFException{
	    work.setCallCount(number);
	}
	
	
	/**
	 * 	Update CallCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setCallCount(char[] value)  throws CFException {
		work.setCallCount(value);
	}
	
	/**
	 * 	Update CallCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCallCountString(char[] value)  throws CFException{
		work.setCallCount(value);
	}	


        public Wm002Ctx getWm002Ctx() {
            return Wm002Ctx.this;
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

    public Continue030InCtx clone() {
        Continue030InCtx cloneObj = new Continue030InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Continue030InCtx getContinue030InCtx() {
            return new Continue030InCtx();
    }
     public class EditAccretionTransInCtx implements Cloneable {
     Work work = Wm002Ctx.this.getWork();

	/**
	 *	Returns the value of callCount
	 *	@return callCount
	 */
	public int getCallCount() throws CFException {
   		return work.getCallCount();
	}


	/**
	 *	Returns String value of callCount
	 *	@return callCount
	 */
	public char[]  getCallCountString() throws CFException {
	     return String.valueOf(work.getCallCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean callCountIsNumeric()  throws CFException{
	    return work.callCountIsNumeric();
	}

	/**
	 * 	Update CallCount with the passed value
	 *	@param number
	 */
	public void setCallCount(int number)  throws CFException{
		work.setCallCount(number);
	}
	

	public void setCallCount(long number)  throws CFException{
	    work.setCallCount(number);
	}
	
	
	/**
	 * 	Update CallCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setCallCount(char[] value)  throws CFException {
		work.setCallCount(value);
	}
	
	/**
	 * 	Update CallCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCallCountString(char[] value)  throws CFException{
		work.setCallCount(value);
	}	


        public Wm002Ctx getWm002Ctx() {
            return Wm002Ctx.this;
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

    public EditAccretionTransInCtx clone() {
        EditAccretionTransInCtx cloneObj = new EditAccretionTransInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public EditAccretionTransInCtx getEditAccretionTransInCtx() {
            return new EditAccretionTransInCtx();
    }
     public class VerifyWithMbdMasterInCtx implements Cloneable {
     Work work = Wm002Ctx.this.getWork();

	/**
	 *	Returns the value of callCount
	 *	@return callCount
	 */
	public int getCallCount() throws CFException {
   		return work.getCallCount();
	}


	/**
	 *	Returns String value of callCount
	 *	@return callCount
	 */
	public char[]  getCallCountString() throws CFException {
	     return String.valueOf(work.getCallCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean callCountIsNumeric()  throws CFException{
	    return work.callCountIsNumeric();
	}

	/**
	 * 	Update CallCount with the passed value
	 *	@param number
	 */
	public void setCallCount(int number)  throws CFException{
		work.setCallCount(number);
	}
	

	public void setCallCount(long number)  throws CFException{
	    work.setCallCount(number);
	}
	
	
	/**
	 * 	Update CallCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setCallCount(char[] value)  throws CFException {
		work.setCallCount(value);
	}
	
	/**
	 * 	Update CallCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCallCountString(char[] value)  throws CFException{
		work.setCallCount(value);
	}	


        public Wm002Ctx getWm002Ctx() {
            return Wm002Ctx.this;
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

    public VerifyWithMbdMasterInCtx clone() {
        VerifyWithMbdMasterInCtx cloneObj = new VerifyWithMbdMasterInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public VerifyWithMbdMasterInCtx getVerifyWithMbdMasterInCtx() {
            return new VerifyWithMbdMasterInCtx();
    }
     public class BypassPaceDobCheckInCtx implements Cloneable {
     Work work = Wm002Ctx.this.getWork();

	/**
	 *	Returns the value of callCount
	 *	@return callCount
	 */
	public int getCallCount() throws CFException {
   		return work.getCallCount();
	}


	/**
	 *	Returns String value of callCount
	 *	@return callCount
	 */
	public char[]  getCallCountString() throws CFException {
	     return String.valueOf(work.getCallCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean callCountIsNumeric()  throws CFException{
	    return work.callCountIsNumeric();
	}

	/**
	 * 	Update CallCount with the passed value
	 *	@param number
	 */
	public void setCallCount(int number)  throws CFException{
		work.setCallCount(number);
	}
	

	public void setCallCount(long number)  throws CFException{
	    work.setCallCount(number);
	}
	
	
	/**
	 * 	Update CallCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setCallCount(char[] value)  throws CFException {
		work.setCallCount(value);
	}
	
	/**
	 * 	Update CallCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCallCountString(char[] value)  throws CFException{
		work.setCallCount(value);
	}	


        public Wm002Ctx getWm002Ctx() {
            return Wm002Ctx.this;
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

    public BypassPaceDobCheckInCtx clone() {
        BypassPaceDobCheckInCtx cloneObj = new BypassPaceDobCheckInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public BypassPaceDobCheckInCtx getBypassPaceDobCheckInCtx() {
            return new BypassPaceDobCheckInCtx();
    }
     public class EditEffdte310InCtx implements Cloneable {
     Work work = Wm002Ctx.this.getWork();

	/**
	 *	Returns the value of callCount
	 *	@return callCount
	 */
	public int getCallCount() throws CFException {
   		return work.getCallCount();
	}


	/**
	 *	Returns String value of callCount
	 *	@return callCount
	 */
	public char[]  getCallCountString() throws CFException {
	     return String.valueOf(work.getCallCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean callCountIsNumeric()  throws CFException{
	    return work.callCountIsNumeric();
	}

	/**
	 * 	Update CallCount with the passed value
	 *	@param number
	 */
	public void setCallCount(int number)  throws CFException{
		work.setCallCount(number);
	}
	

	public void setCallCount(long number)  throws CFException{
	    work.setCallCount(number);
	}
	
	
	/**
	 * 	Update CallCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setCallCount(char[] value)  throws CFException {
		work.setCallCount(value);
	}
	
	/**
	 * 	Update CallCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCallCountString(char[] value)  throws CFException{
		work.setCallCount(value);
	}	


        public Wm002Ctx getWm002Ctx() {
            return Wm002Ctx.this;
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

    public EditEffdte310InCtx clone() {
        EditEffdte310InCtx cloneObj = new EditEffdte310InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public EditEffdte310InCtx getEditEffdte310InCtx() {
            return new EditEffdte310InCtx();
    }
     public class HcfaFormatTestInCtx implements Cloneable {
     Work work = Wm002Ctx.this.getWork();

	/**
	 *	Returns the value of callCount
	 *	@return callCount
	 */
	public int getCallCount() throws CFException {
   		return work.getCallCount();
	}


	/**
	 *	Returns String value of callCount
	 *	@return callCount
	 */
	public char[]  getCallCountString() throws CFException {
	     return String.valueOf(work.getCallCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean callCountIsNumeric()  throws CFException{
	    return work.callCountIsNumeric();
	}

	/**
	 * 	Update CallCount with the passed value
	 *	@param number
	 */
	public void setCallCount(int number)  throws CFException{
		work.setCallCount(number);
	}
	

	public void setCallCount(long number)  throws CFException{
	    work.setCallCount(number);
	}
	
	
	/**
	 * 	Update CallCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setCallCount(char[] value)  throws CFException {
		work.setCallCount(value);
	}
	
	/**
	 * 	Update CallCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCallCountString(char[] value)  throws CFException{
		work.setCallCount(value);
	}	


        public Wm002Ctx getWm002Ctx() {
            return Wm002Ctx.this;
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

    public HcfaFormatTestInCtx clone() {
        HcfaFormatTestInCtx cloneObj = new HcfaFormatTestInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public HcfaFormatTestInCtx getHcfaFormatTestInCtx() {
            return new HcfaFormatTestInCtx();
    }
     public class CheckKeyConversionInCtx implements Cloneable {
     Work work = Wm002Ctx.this.getWork();

	/**
	 *	Returns the value of callCount
	 *	@return callCount
	 */
	public int getCallCount() throws CFException {
   		return work.getCallCount();
	}


	/**
	 *	Returns String value of callCount
	 *	@return callCount
	 */
	public char[]  getCallCountString() throws CFException {
	     return String.valueOf(work.getCallCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean callCountIsNumeric()  throws CFException{
	    return work.callCountIsNumeric();
	}

	/**
	 * 	Update CallCount with the passed value
	 *	@param number
	 */
	public void setCallCount(int number)  throws CFException{
		work.setCallCount(number);
	}
	

	public void setCallCount(long number)  throws CFException{
	    work.setCallCount(number);
	}
	
	
	/**
	 * 	Update CallCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setCallCount(char[] value)  throws CFException {
		work.setCallCount(value);
	}
	
	/**
	 * 	Update CallCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCallCountString(char[] value)  throws CFException{
		work.setCallCount(value);
	}	


        public Wm002Ctx getWm002Ctx() {
            return Wm002Ctx.this;
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

    public CheckKeyConversionInCtx clone() {
        CheckKeyConversionInCtx cloneObj = new CheckKeyConversionInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CheckKeyConversionInCtx getCheckKeyConversionInCtx() {
            return new CheckKeyConversionInCtx();
    }
     public class MbdEligInCtx implements Cloneable {
     Work work = Wm002Ctx.this.getWork();

	/**
	 *	Returns the value of callCount
	 *	@return callCount
	 */
	public int getCallCount() throws CFException {
   		return work.getCallCount();
	}


	/**
	 *	Returns String value of callCount
	 *	@return callCount
	 */
	public char[]  getCallCountString() throws CFException {
	     return String.valueOf(work.getCallCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean callCountIsNumeric()  throws CFException{
	    return work.callCountIsNumeric();
	}

	/**
	 * 	Update CallCount with the passed value
	 *	@param number
	 */
	public void setCallCount(int number)  throws CFException{
		work.setCallCount(number);
	}
	

	public void setCallCount(long number)  throws CFException{
	    work.setCallCount(number);
	}
	
	
	/**
	 * 	Update CallCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setCallCount(char[] value)  throws CFException {
		work.setCallCount(value);
	}
	
	/**
	 * 	Update CallCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCallCountString(char[] value)  throws CFException{
		work.setCallCount(value);
	}	


        public Wm002Ctx getWm002Ctx() {
            return Wm002Ctx.this;
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

    public MbdEligInCtx clone() {
        MbdEligInCtx cloneObj = new MbdEligInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MbdEligInCtx getMbdEligInCtx() {
            return new MbdEligInCtx();
    }
     public class ReadMbdO200InCtx implements Cloneable {
     Work work = Wm002Ctx.this.getWork();

	/**
	 *	Returns the value of callCount
	 *	@return callCount
	 */
	public int getCallCount() throws CFException {
   		return work.getCallCount();
	}


	/**
	 *	Returns String value of callCount
	 *	@return callCount
	 */
	public char[]  getCallCountString() throws CFException {
	     return String.valueOf(work.getCallCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean callCountIsNumeric()  throws CFException{
	    return work.callCountIsNumeric();
	}

	/**
	 * 	Update CallCount with the passed value
	 *	@param number
	 */
	public void setCallCount(int number)  throws CFException{
		work.setCallCount(number);
	}
	

	public void setCallCount(long number)  throws CFException{
	    work.setCallCount(number);
	}
	
	
	/**
	 * 	Update CallCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setCallCount(char[] value)  throws CFException {
		work.setCallCount(value);
	}
	
	/**
	 * 	Update CallCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCallCountString(char[] value)  throws CFException{
		work.setCallCount(value);
	}	


        public Wm002Ctx getWm002Ctx() {
            return Wm002Ctx.this;
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

    public ReadMbdO200InCtx clone() {
        ReadMbdO200InCtx cloneObj = new ReadMbdO200InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReadMbdO200InCtx getReadMbdO200InCtx() {
            return new ReadMbdO200InCtx();
    }
     public class ReadMbiInCtx implements Cloneable {
     Work work = Wm002Ctx.this.getWork();

	/**
	 *	Returns the value of callCount
	 *	@return callCount
	 */
	public int getCallCount() throws CFException {
   		return work.getCallCount();
	}


	/**
	 *	Returns String value of callCount
	 *	@return callCount
	 */
	public char[]  getCallCountString() throws CFException {
	     return String.valueOf(work.getCallCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean callCountIsNumeric()  throws CFException{
	    return work.callCountIsNumeric();
	}

	/**
	 * 	Update CallCount with the passed value
	 *	@param number
	 */
	public void setCallCount(int number)  throws CFException{
		work.setCallCount(number);
	}
	

	public void setCallCount(long number)  throws CFException{
	    work.setCallCount(number);
	}
	
	
	/**
	 * 	Update CallCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setCallCount(char[] value)  throws CFException {
		work.setCallCount(value);
	}
	
	/**
	 * 	Update CallCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCallCountString(char[] value)  throws CFException{
		work.setCallCount(value);
	}	


        public Wm002Ctx getWm002Ctx() {
            return Wm002Ctx.this;
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

    public ReadMbiInCtx clone() {
        ReadMbiInCtx cloneObj = new ReadMbiInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReadMbiInCtx getReadMbiInCtx() {
            return new ReadMbiInCtx();
    }
     public class BeqrEligInCtx implements Cloneable {
     Work work = Wm002Ctx.this.getWork();

	/**
	 *	Returns the value of callCount
	 *	@return callCount
	 */
	public int getCallCount() throws CFException {
   		return work.getCallCount();
	}


	/**
	 *	Returns String value of callCount
	 *	@return callCount
	 */
	public char[]  getCallCountString() throws CFException {
	     return String.valueOf(work.getCallCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean callCountIsNumeric()  throws CFException{
	    return work.callCountIsNumeric();
	}

	/**
	 * 	Update CallCount with the passed value
	 *	@param number
	 */
	public void setCallCount(int number)  throws CFException{
		work.setCallCount(number);
	}
	

	public void setCallCount(long number)  throws CFException{
	    work.setCallCount(number);
	}
	
	
	/**
	 * 	Update CallCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setCallCount(char[] value)  throws CFException {
		work.setCallCount(value);
	}
	
	/**
	 * 	Update CallCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCallCountString(char[] value)  throws CFException{
		work.setCallCount(value);
	}	


        public Wm002Ctx getWm002Ctx() {
            return Wm002Ctx.this;
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

    public BeqrEligInCtx clone() {
        BeqrEligInCtx cloneObj = new BeqrEligInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public BeqrEligInCtx getBeqrEligInCtx() {
            return new BeqrEligInCtx();
    }
}
