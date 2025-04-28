package com.cloudframe.app.uhissue1;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.uhissue1.dto.Work;


@Context
public class Uhissue1Ctx implements ProgramContext, Cloneable {
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

    public Uhissue1Ctx clone() {
        Uhissue1Ctx cloneObj = new Uhissue1Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class Path1OutCtx implements Cloneable {
     Work work = Uhissue1Ctx.this.getWork();

	/**
	 *	Test condition 1 for isFlag1Set()
	 *	@return  Returns true if isFlag1Set() is 1
	 */
   public boolean isFlag1Set() throws CFException {
      return work.isFlag1Set();
   }

	/**
	*  set values 1
	*/
   	public void setFlag1SetTrue()  throws CFException{  			
    	work.setFlag1SetTrue();
   	}
	/**
	 *	Test condition 0 for isFlag3Notset()
	 *	@return  Returns true if isFlag3Notset() is 0
	 */
   public boolean isFlag3Notset() throws CFException {
      return work.isFlag3Notset();
   }

	/**
	*  set values 0
	*/
   	public void setFlag3NotsetTrue()  throws CFException{  			
    	work.setFlag3NotsetTrue();
   	}
	/**
	 *	Test condition 1 for isFlag2Set()
	 *	@return  Returns true if isFlag2Set() is 1
	 */
   public boolean isFlag2Set() throws CFException {
      return work.isFlag2Set();
   }

	/**
	*  set values 1
	*/
   	public void setFlag2SetTrue()  throws CFException{  			
    	work.setFlag2SetTrue();
   	}
	/**
	 *	Test condition 0 for isFlag2Notset()
	 *	@return  Returns true if isFlag2Notset() is 0
	 */
   public boolean isFlag2Notset() throws CFException {
      return work.isFlag2Notset();
   }

	/**
	*  set values 0
	*/
   	public void setFlag2NotsetTrue()  throws CFException{  			
    	work.setFlag2NotsetTrue();
   	}
	/**
	 *	Test condition 1 for isFlag3Set()
	 *	@return  Returns true if isFlag3Set() is 1
	 */
   public boolean isFlag3Set() throws CFException {
      return work.isFlag3Set();
   }

	/**
	*  set values 1
	*/
   	public void setFlag3SetTrue()  throws CFException{  			
    	work.setFlag3SetTrue();
   	}
	/**
	 *	Test condition 0 for isFlag1Notset()
	 *	@return  Returns true if isFlag1Notset() is 0
	 */
   public boolean isFlag1Notset() throws CFException {
      return work.isFlag1Notset();
   }

	/**
	*  set values 0
	*/
   	public void setFlag1NotsetTrue()  throws CFException{  			
    	work.setFlag1NotsetTrue();
   	}

        public Uhissue1Ctx getUhissue1Ctx() {
            return Uhissue1Ctx.this;
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

    public Path1OutCtx clone() {
        Path1OutCtx cloneObj = new Path1OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Path1OutCtx getPath1OutCtx() {
            return new Path1OutCtx();
    }
     public class CheckConditionInCtx implements Cloneable {
     Work work = Uhissue1Ctx.this.getWork();

	/**
	 *	Test condition 1 for isFlag1Set()
	 *	@return  Returns true if isFlag1Set() is 1
	 */
   public boolean isFlag1Set() throws CFException {
      return work.isFlag1Set();
   }

	/**
	*  set values 1
	*/
   	public void setFlag1SetTrue()  throws CFException{  			
    	work.setFlag1SetTrue();
   	}
	/**
	 *	Test condition 0 for isFlag3Notset()
	 *	@return  Returns true if isFlag3Notset() is 0
	 */
   public boolean isFlag3Notset() throws CFException {
      return work.isFlag3Notset();
   }

	/**
	*  set values 0
	*/
   	public void setFlag3NotsetTrue()  throws CFException{  			
    	work.setFlag3NotsetTrue();
   	}
	/**
	 *	Test condition 1 for isFlag2Set()
	 *	@return  Returns true if isFlag2Set() is 1
	 */
   public boolean isFlag2Set() throws CFException {
      return work.isFlag2Set();
   }

	/**
	*  set values 1
	*/
   	public void setFlag2SetTrue()  throws CFException{  			
    	work.setFlag2SetTrue();
   	}
	/**
	 *	Test condition 0 for isFlag2Notset()
	 *	@return  Returns true if isFlag2Notset() is 0
	 */
   public boolean isFlag2Notset() throws CFException {
      return work.isFlag2Notset();
   }

	/**
	*  set values 0
	*/
   	public void setFlag2NotsetTrue()  throws CFException{  			
    	work.setFlag2NotsetTrue();
   	}
	/**
	 *	Test condition 1 for isFlag3Set()
	 *	@return  Returns true if isFlag3Set() is 1
	 */
   public boolean isFlag3Set() throws CFException {
      return work.isFlag3Set();
   }

	/**
	*  set values 1
	*/
   	public void setFlag3SetTrue()  throws CFException{  			
    	work.setFlag3SetTrue();
   	}
	/**
	 *	Test condition 0 for isFlag1Notset()
	 *	@return  Returns true if isFlag1Notset() is 0
	 */
   public boolean isFlag1Notset() throws CFException {
      return work.isFlag1Notset();
   }

	/**
	*  set values 0
	*/
   	public void setFlag1NotsetTrue()  throws CFException{  			
    	work.setFlag1NotsetTrue();
   	}

        public Uhissue1Ctx getUhissue1Ctx() {
            return Uhissue1Ctx.this;
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

    public CheckConditionInCtx clone() {
        CheckConditionInCtx cloneObj = new CheckConditionInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CheckConditionInCtx getCheckConditionInCtx() {
            return new CheckConditionInCtx();
    }
}
