package com.cloudframe.app.abprog9;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.abprog9.dto.EndFlagGroup;
import com.cloudframe.app.abprog9.dto.Work;


@Context
public class Abprog9Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    EndFlagGroup endFlagGroup;
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


    public EndFlagGroup getEndFlagGroup() {
        if (endFlagGroup == null) {
            endFlagGroup = new EndFlagGroup();
        }

        return endFlagGroup;
    }

    public void setEndFlagGroup(EndFlagGroup endFlagGroup) {
        this.endFlagGroup = endFlagGroup;
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
        str += endFlagGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Abprog9Ctx clone() {
        Abprog9Ctx cloneObj = new Abprog9Ctx();
        cloneObj.endFlagGroup = new EndFlagGroup();
        cloneObj.endFlagGroup.set(endFlagGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     EndFlagGroup endFlagGroup = Abprog9Ctx.this.getEndFlagGroup();


        public Abprog9Ctx getAbprog9Ctx() {
            return Abprog9Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += endFlagGroup.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.endFlagGroup = new EndFlagGroup();
        cloneObj.endFlagGroup.set(endFlagGroup.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class MainlineInCtx implements Cloneable {
     EndFlagGroup endFlagGroup = Abprog9Ctx.this.getEndFlagGroup();

	/**
	 *	Test condition "A" for isAbnormalEnd()
	 *	@return  Returns true if isAbnormalEnd() is "A"
	 */
   public boolean isAbnormalEnd() throws CFException {
      return endFlagGroup.isAbnormalEnd();
   }

	/**
	*  set values "A"
	*/
   	public void setAbnormalEndTrue()  throws CFException{  			
    	endFlagGroup.setAbnormalEndTrue();
   	}

        public Abprog9Ctx getAbprog9Ctx() {
            return Abprog9Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += endFlagGroup.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.endFlagGroup = new EndFlagGroup();
        cloneObj.endFlagGroup.set(endFlagGroup.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class RaiseAbendOutCtx implements Cloneable {


        public Abprog9Ctx getAbprog9Ctx() {
            return Abprog9Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
       return str.hashCode();
    }

    public RaiseAbendOutCtx clone() {
        RaiseAbendOutCtx cloneObj = new RaiseAbendOutCtx();
        return cloneObj;
    }

    }

    public RaiseAbendOutCtx getRaiseAbendOutCtx() {
            return new RaiseAbendOutCtx();
    }
}
