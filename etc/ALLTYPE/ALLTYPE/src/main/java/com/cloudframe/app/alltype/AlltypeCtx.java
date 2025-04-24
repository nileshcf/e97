package com.cloudframe.app.alltype;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.alltype.dto.Work;
import com.cloudframe.app.alltype.dto.Group;


@Context
public class AlltypeCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Group group;
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


    public Group getGroup() {
        if (group == null) {
            group = new Group();
        }

        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
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
        str += group.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public AlltypeCtx clone() {
        AlltypeCtx cloneObj = new AlltypeCtx();
        cloneObj.group = new Group();
        cloneObj.group.set(group.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessOutCtx implements Cloneable {
     Group group = AlltypeCtx.this.getGroup();

	/**
	 *	Returns the value of group
	 *	@return group
	 */   
	 public Group getGroup() {
   	return group;
   }



        public AlltypeCtx getAlltypeCtx() {
            return AlltypeCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += group.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.group = new Group();
        cloneObj.group.set(group.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
}
