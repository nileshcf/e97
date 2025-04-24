package com.cloudframe.app.comput3;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.comput3.dto.WcStandardVolumesGroup;
import com.cloudframe.app.comput3.dto.Work;


@Context
public class Comput3Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    WcStandardVolumesGroup wcStandardVolumesGroup;


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
    public WcStandardVolumesGroup getWcStandardVolumesGroup() {
        if (wcStandardVolumesGroup == null) {
            wcStandardVolumesGroup = new WcStandardVolumesGroup();
        }

        return wcStandardVolumesGroup;
    }

    public void setWcStandardVolumesGroup(WcStandardVolumesGroup wcStandardVolumesGroup) {
        this.wcStandardVolumesGroup = wcStandardVolumesGroup;
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
        str += wcStandardVolumesGroup.hashCode();
       return str.hashCode();
    }

    public Comput3Ctx clone() {
        Comput3Ctx cloneObj = new Comput3Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wcStandardVolumesGroup = new WcStandardVolumesGroup();
        cloneObj.wcStandardVolumesGroup.set(wcStandardVolumesGroup.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Work work = Comput3Ctx.this.getWork();
     WcStandardVolumesGroup wcStandardVolumesGroup = Comput3Ctx.this.getWcStandardVolumesGroup();

	/**
	 *	Returns the value of wvTargetSub
	 *	@return wvTargetSub
	 */
	public short getWvTargetSub() throws CFException {        
   		return work.getWvTargetSub();
	}
	
	/**
	 * 	Update WvTargetSub with the passed value
	 *	@param number
	 */
	public void setWvTargetSub(short number)  throws CFException{
		work.setWvTargetSub(number);
	}

	public void setWvTargetSub(int number)  throws CFException{
		work.setWvTargetSub((short)number);
	}

	public void setWvTargetSub(long number)  throws CFException{
		work.setWvTargetSub((short)number);
	}



	/**
	 *	Returns the value of wvSourceSub
	 *	@return wvSourceSub
	 */
	public short getWvSourceSub() throws CFException {        
   		return work.getWvSourceSub();
	}
	
	/**
	 * 	Update WvSourceSub with the passed value
	 *	@param number
	 */
	public void setWvSourceSub(short number)  throws CFException{
		work.setWvSourceSub(number);
	}

	public void setWvSourceSub(int number)  throws CFException{
		work.setWvSourceSub((short)number);
	}

	public void setWvSourceSub(long number)  throws CFException{
		work.setWvSourceSub((short)number);
	}



	public BigDecimal getWcVolumes(int index,int index2) throws CFException{      
   		return wcStandardVolumesGroup.getWcVolumeTable().getWcVolumeGroup(index).getWcVolumes((index2));
	}

    public char[] getWcVolumesString(int index,int index2) throws CFException {
          return  wcStandardVolumesGroup.getWcVolumeTable().getWcVolumeGroup(index).getWcVolumes((index2)).toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WcVolumes with the passed number
	 *	@param number
	 */
	public void setWcVolumes(int index,int index2,BigDecimal number)  throws CFException{
		wcStandardVolumesGroup.getWcVolumeTable().getWcVolumeGroup(index).setWcVolumes((index2),number);
   }


        public Comput3Ctx getComput3Ctx() {
            return Comput3Ctx.this;
        }

        public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
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
        str += wcStandardVolumesGroup.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wcStandardVolumesGroup = new WcStandardVolumesGroup();
        cloneObj.wcStandardVolumesGroup.set(wcStandardVolumesGroup.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     Work work = Comput3Ctx.this.getWork();
     WcStandardVolumesGroup wcStandardVolumesGroup = Comput3Ctx.this.getWcStandardVolumesGroup();

	public BigDecimal getDexr001TargetQty() throws CFException{      
   		return work.getDexr001TargetQty();
	}

    public char[] getDexr001TargetQtyString() throws CFException {
          return  work.getDexr001TargetQty().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Dexr001TargetQty with the passed number
	 *	@param number
	 */
	public void setDexr001TargetQty(BigDecimal number)  throws CFException{
		work.setDexr001TargetQty(number);
   }

	public BigDecimal getDexr001SourceQty() throws CFException{      
   		return work.getDexr001SourceQty();
	}

    public char[] getDexr001SourceQtyString() throws CFException {
          return  work.getDexr001SourceQty().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Dexr001SourceQty with the passed number
	 *	@param number
	 */
	public void setDexr001SourceQty(BigDecimal number)  throws CFException{
		work.setDexr001SourceQty(number);
   }

	/**
	 *	Returns the value of wvTempVolume
	 *	@return wvTempVolume
	 */
   public BigDecimal getWvTempVolume() throws CFException {
   	return work.getWvTempVolume();
   }

  
	/**
	*  set variable wvTempVolume
	*  @param value
	**/
   public void setWvTempVolume(BigDecimal value)  throws CFException{
	work.setWvTempVolume(value);
   } 
	
	

	/**
	 *	Returns the value of wvTargetSub
	 *	@return wvTargetSub
	 */
	public short getWvTargetSub() throws CFException {        
   		return work.getWvTargetSub();
	}
	
	/**
	 * 	Update WvTargetSub with the passed value
	 *	@param number
	 */
	public void setWvTargetSub(short number)  throws CFException{
		work.setWvTargetSub(number);
	}

	public void setWvTargetSub(int number)  throws CFException{
		work.setWvTargetSub((short)number);
	}

	public void setWvTargetSub(long number)  throws CFException{
		work.setWvTargetSub((short)number);
	}



public long getWvSourceScale() throws CFException {  
        return work.getWvSourceScale();
}
	/**
	 * 	Update WvSourceScale with the passed value
	 *	@param number
	 */
	public void setWvSourceScale(long number)  throws CFException{
		work.setWvSourceScale(number);
	}



	/**
	 *	Returns the value of wvSourceSub
	 *	@return wvSourceSub
	 */
	public short getWvSourceSub() throws CFException {        
   		return work.getWvSourceSub();
	}
	
	/**
	 * 	Update WvSourceSub with the passed value
	 *	@param number
	 */
	public void setWvSourceSub(short number)  throws CFException{
		work.setWvSourceSub(number);
	}

	public void setWvSourceSub(int number)  throws CFException{
		work.setWvSourceSub((short)number);
	}

	public void setWvSourceSub(long number)  throws CFException{
		work.setWvSourceSub((short)number);
	}



	/**
	 *	Returns the value of wvUnsignedVolume
	 *	@return wvUnsignedVolume
	 */
	public BigDecimal getWvUnsignedVolume() throws CFException {
   		return work.getWvUnsignedVolume();
	}


	 /**
     *	Returns String value of wvUnsignedVolume
     *	@return wvUnsignedVolume
     */
    public char[]  getWvUnsignedVolumeString() throws CFException {
         return work.getWvUnsignedVolumeString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean wvUnsignedVolumeIsNumeric() {
        return work.wvUnsignedVolumeIsNumeric();
    }
	/**
	 * 	Update WvUnsignedVolume with the passed number
	 *	@param number
	 */
	public void setWvUnsignedVolume(BigDecimal number)  throws CFException{
		work.setWvUnsignedVolume(number);
   }

	/**
	 * 	Update WvUnsignedVolume with the passed value
	 *	@param value (String or char[]);
	 */
	public void setWvUnsignedVolume(char[] value)  throws CFException{
		work.setWvUnsignedVolume(value);
	}   

	/**
	 *	Returns the value of wvWorkingQty
	 *	@return wvWorkingQty
	 */
   public BigDecimal getWvWorkingQty() throws CFException {
   	return work.getWvWorkingQty();
   }

  
	/**
	*  set variable wvWorkingQty
	*  @param value
	**/
   public void setWvWorkingQty(BigDecimal value)  throws CFException{
	work.setWvWorkingQty(value);
   } 
	
	


        public Comput3Ctx getComput3Ctx() {
            return Comput3Ctx.this;
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
        str += wcStandardVolumesGroup.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wcStandardVolumesGroup = new WcStandardVolumesGroup();
        cloneObj.wcStandardVolumesGroup.set(wcStandardVolumesGroup.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
}
