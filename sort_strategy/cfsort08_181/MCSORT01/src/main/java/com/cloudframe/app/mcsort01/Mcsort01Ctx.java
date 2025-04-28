package com.cloudframe.app.mcsort01;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.mcsort01.file.records.SortRec;
import com.cloudframe.app.global.sharedvar.Ip500041ReadTableIdGroup;
import com.cloudframe.app.mcsort01.dto.SortKeyLthTable700;
import com.cloudframe.app.mcsort01.file.records.InRecord;
import com.cloudframe.app.mcsort01.dto.Work;
import com.cloudframe.app.global.sharedvar.Ip500041OneDayRecLthGroup;
import com.cloudframe.app.mcsort01.file.records.OutRecord;
import com.cloudframe.app.global.sharedvar.Ip500041OneDayRec;
import com.cloudframe.app.global.sharedvar.Ip500041OneDayReadStatusGroup;


@Context
public class Mcsort01Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    InRecord inRecord;
    Ip500041ReadTableIdGroup ip500041ReadTableIdGroup;
    OutRecord outRecord;
    SortRec sortRec;
    Ip500041OneDayRec ip500041OneDayRec;
    Ip500041OneDayReadStatusGroup ip500041OneDayReadStatusGroup;
    Work work;
    Ip500041OneDayRecLthGroup ip500041OneDayRecLthGroup;
    SortKeyLthTable700 sortKeyLthTable700;


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


    public InRecord getInRecord() {
        if (inRecord == null) {
            inRecord = new InRecord();
        }

        return inRecord;
    }

    public void setInRecord(InRecord inRecord) {
        this.inRecord = inRecord;
    }
    public Ip500041ReadTableIdGroup getIp500041ReadTableIdGroup() {
        if (ip500041ReadTableIdGroup == null) {
            ip500041ReadTableIdGroup = globalCtx.getGlobalDto(Ip500041ReadTableIdGroup.class);
        }

        return ip500041ReadTableIdGroup;
    }

    public OutRecord getOutRecord() {
        if (outRecord == null) {
            outRecord = new OutRecord();
        }

        return outRecord;
    }

    public void setOutRecord(OutRecord outRecord) {
        this.outRecord = outRecord;
    }
    public SortRec getSortRec() {
        if (sortRec == null) {
            sortRec = new SortRec();
        }

        return sortRec;
    }

    public void setSortRec(SortRec sortRec) {
        this.sortRec = sortRec;
    }
    public Ip500041OneDayRec getIp500041OneDayRec() {
        if (ip500041OneDayRec == null) {
            ip500041OneDayRec = globalCtx.getGlobalDto(Ip500041OneDayRec.class);
        }

        return ip500041OneDayRec;
    }

    public Ip500041OneDayReadStatusGroup getIp500041OneDayReadStatusGroup() {
        if (ip500041OneDayReadStatusGroup == null) {
            ip500041OneDayReadStatusGroup = globalCtx.getGlobalDto(Ip500041OneDayReadStatusGroup.class);
        }

        return ip500041OneDayReadStatusGroup;
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
    public Ip500041OneDayRecLthGroup getIp500041OneDayRecLthGroup() {
        if (ip500041OneDayRecLthGroup == null) {
            ip500041OneDayRecLthGroup = globalCtx.getGlobalDto(Ip500041OneDayRecLthGroup.class);
        }

        return ip500041OneDayRecLthGroup;
    }

    public SortKeyLthTable700 getSortKeyLthTable700() {
        if (sortKeyLthTable700 == null) {
            sortKeyLthTable700 = new SortKeyLthTable700();
        }

        return sortKeyLthTable700;
    }

    public void setSortKeyLthTable700(SortKeyLthTable700 sortKeyLthTable700) {
        this.sortKeyLthTable700 = sortKeyLthTable700;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += inRecord.hashCode();
        str += ip500041ReadTableIdGroup.hashCode();
        str += outRecord.hashCode();
        str += sortRec.hashCode();
        str += ip500041OneDayRec.hashCode();
        str += ip500041OneDayReadStatusGroup.hashCode();
        str += work.hashCode();
        str += ip500041OneDayRecLthGroup.hashCode();
        str += sortKeyLthTable700.hashCode();
       return str.hashCode();
    }

    public Mcsort01Ctx clone() {
        Mcsort01Ctx cloneObj = new Mcsort01Ctx();
        cloneObj.inRecord = new InRecord();
        cloneObj.inRecord.set(inRecord.getClonedField());
        cloneObj.ip500041ReadTableIdGroup = new Ip500041ReadTableIdGroup();
        cloneObj.ip500041ReadTableIdGroup.set(ip500041ReadTableIdGroup.getClonedField());
        cloneObj.outRecord = new OutRecord();
        cloneObj.outRecord.set(outRecord.getClonedField());
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.ip500041OneDayRec = new Ip500041OneDayRec();
        cloneObj.ip500041OneDayRec.set(ip500041OneDayRec.getClonedField());
        cloneObj.ip500041OneDayReadStatusGroup = new Ip500041OneDayReadStatusGroup();
        cloneObj.ip500041OneDayReadStatusGroup.set(ip500041OneDayReadStatusGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip500041OneDayRecLthGroup = new Ip500041OneDayRecLthGroup();
        cloneObj.ip500041OneDayRecLthGroup.set(ip500041OneDayRecLthGroup.getClonedField());
        cloneObj.sortKeyLthTable700 = new SortKeyLthTable700();
        cloneObj.sortKeyLthTable700.set(sortKeyLthTable700.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     InRecord inRecord = Mcsort01Ctx.this.getInRecord();
     OutRecord outRecord = Mcsort01Ctx.this.getOutRecord();
     SortRec sortRec = Mcsort01Ctx.this.getSortRec();
     Work work = Mcsort01Ctx.this.getWork();

	/**
	 *	Returns the value of inRecord
	 *	@return inRecord
	 */   
	 public InRecord getInRecord() {
   	return inRecord;
   }


	/**
	 *	Returns the value of sort5TableId
	 *	@return sort5TableId
	 */
   public char[] getSort5TableId() throws CFException  {              
   		return sortRec.getSortRec5().getSort5TableId();
   }

  
	/**
	*  set variable sort5TableId
	*  @param value
	**/
   public void setSort5TableId(char[] value) throws CFException {
      sortRec.getSortRec5().setSort5TableId(value);
   } 

     /**
	 * 	Update Sort5TableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSort5TableId(char[] source, int sourceIndex) throws CFException {
      sortRec.getSortRec5().setSort5TableId(source, sourceIndex);
   	
   }
   
   public void setSort5TableId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortRec.getSortRec5().setSort5TableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sort5TableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSort5TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRec.getSortRec5().setSort5TableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sort5TableId with another Field
	 *	@param value
	 */
   public void setSort5TableId(Field source) {
      sortRec.getSortRec5().setSort5TableId(source);
   }  
   
     /**
	 * 	Update Sort5TableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSort5TableId(Field source, int sourceIndex,int sourceLen) {
      sortRec.getSortRec5().setSort5TableId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sort5TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSort5TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRec.getSortRec5().setSort5TableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of outRecord
	 *	@return outRecord
	 */   
	 public OutRecord getOutRecord() {
   	return outRecord;
   }


	/**
	 *	Returns the value of sortRec
	 *	@return sortRec
	 */   
	 public SortRec getSortRec() {
   	return sortRec;
   }


	/**
	 *	Returns the value of sort5TableEffDate
	 *	@return sort5TableEffDate
	 */
   public char[] getSort5TableEffDate() throws CFException  {              
   		return sortRec.getSortRec5().getSort5TableEffDate();
   }

  
	/**
	*  set variable sort5TableEffDate
	*  @param value
	**/
   public void setSort5TableEffDate(char[] value) throws CFException {
      sortRec.getSortRec5().setSort5TableEffDate(value);
   } 

     /**
	 * 	Update Sort5TableEffDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSort5TableEffDate(char[] source, int sourceIndex) throws CFException {
      sortRec.getSortRec5().setSort5TableEffDate(source, sourceIndex);
   	
   }
   
   public void setSort5TableEffDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortRec.getSortRec5().setSort5TableEffDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sort5TableEffDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSort5TableEffDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRec.getSortRec5().setSort5TableEffDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sort5TableEffDate with another Field
	 *	@param value
	 */
   public void setSort5TableEffDate(Field source) {
      sortRec.getSortRec5().setSort5TableEffDate(source);
   }  
   
     /**
	 * 	Update Sort5TableEffDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSort5TableEffDate(Field source, int sourceIndex,int sourceLen) {
      sortRec.getSortRec5().setSort5TableEffDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sort5TableEffDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSort5TableEffDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRec.getSortRec5().setSort5TableEffDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sort5Key
	 *	@return sort5Key
	 */
   public char[] getSort5Key() throws CFException  {              
   		return sortRec.getSortRec5().getSort5Key();
   }

  
	/**
	*  set variable sort5Key
	*  @param value
	**/
   public void setSort5Key(char[] value) throws CFException {
      sortRec.getSortRec5().setSort5Key(value);
   } 

     /**
	 * 	Update Sort5Key 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSort5Key(char[] source, int sourceIndex) throws CFException {
      sortRec.getSortRec5().setSort5Key(source, sourceIndex);
   	
   }
   
   public void setSort5Key(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortRec.getSortRec5().setSort5Key(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sort5Key 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSort5Key(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRec.getSortRec5().setSort5Key(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sort5Key with another Field
	 *	@param value
	 */
   public void setSort5Key(Field source) {
      sortRec.getSortRec5().setSort5Key(source);
   }  
   
     /**
	 * 	Update Sort5Key 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSort5Key(Field source, int sourceIndex,int sourceLen) {
      sortRec.getSortRec5().setSort5Key(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sort5Key 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSort5Key(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRec.getSortRec5().setSort5Key(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Mcsort01Ctx getMcsort01Ctx() {
            return Mcsort01Ctx.this;
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
        str += inRecord.hashCode();
        str += outRecord.hashCode();
        str += sortRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.inRecord = new InRecord();
        cloneObj.inRecord.set(inRecord.getClonedField());
        cloneObj.outRecord = new OutRecord();
        cloneObj.outRecord.set(outRecord.getClonedField());
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     InRecord inRecord = Mcsort01Ctx.this.getInRecord();
     OutRecord outRecord = Mcsort01Ctx.this.getOutRecord();
     SortRec sortRec = Mcsort01Ctx.this.getSortRec();
     Work work = Mcsort01Ctx.this.getWork();

	/**
	 *	Returns the value of sortInStatus
	 *	@return sortInStatus
	 */
   public char[] getSortInStatus() throws CFException  {              
   		return work.getSortInStatus();
   }

  
	/**
	*  set variable sortInStatus
	*  @param value
	**/
   public void setSortInStatus(char[] value) throws CFException {
      work.setSortInStatus(value);
   } 

	/**
	 *	Returns the value of sortOutStatus
	 *	@return sortOutStatus
	 */
   public char[] getSortOutStatus() throws CFException  {              
   		return work.getSortOutStatus();
   }

  
	/**
	*  set variable sortOutStatus
	*  @param value
	**/
   public void setSortOutStatus(char[] value) throws CFException {
      work.setSortOutStatus(value);
   } 


        public Mcsort01Ctx getMcsort01Ctx() {
            return Mcsort01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += inRecord.hashCode();
        str += outRecord.hashCode();
        str += sortRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.inRecord = new InRecord();
        cloneObj.inRecord.set(inRecord.getClonedField());
        cloneObj.outRecord = new OutRecord();
        cloneObj.outRecord.set(outRecord.getClonedField());
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
     public class FormatSortRecInCtx implements Cloneable {
     InRecord inRecord = Mcsort01Ctx.this.getInRecord();
     SortRec sortRec = Mcsort01Ctx.this.getSortRec();
     Work work = Mcsort01Ctx.this.getWork();

	/**
	 *	Returns the value of inRecord
	 *	@return inRecord
	 */   
	 public InRecord getInRecord() {
   	return inRecord;
   }


	/**
	 *	Returns the value of sortRec
	 *	@return sortRec
	 */   
	 public SortRec getSortRec() {
   	return sortRec;
   }


	/**
	 *	Returns the value of sortRdw
	 *	@return sortRdw
	 */
	public long getSortRdw() throws CFException {        
   		return work.getSortRdw();
	}
	
	/**
	 * 	Update SortRdw with the passed value
	 *	@param number
	 */
	public void setSortRdw(long number)  throws CFException{
		work.setSortRdw(number);
	}



	/**
	 *	Returns the value of sortInRecLen
	 *	@return sortInRecLen
	 */
	public long getSortInRecLen() throws CFException {        
   		return work.getSortInRecLen();
	}
	
	/**
	 * 	Update SortInRecLen with the passed value
	 *	@param number
	 */
	public void setSortInRecLen(long number)  throws CFException{
		work.setSortInRecLen(number);
	}




        public Mcsort01Ctx getMcsort01Ctx() {
            return Mcsort01Ctx.this;
        }

        public FormatSortRecOutCtx getFormatSortRecOutCtx() {
            return new FormatSortRecOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += inRecord.hashCode();
        str += sortRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FormatSortRecInCtx clone() {
        FormatSortRecInCtx cloneObj = new FormatSortRecInCtx();
        cloneObj.inRecord = new InRecord();
        cloneObj.inRecord.set(inRecord.getClonedField());
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FormatSortRecInCtx getFormatSortRecInCtx() {
            return new FormatSortRecInCtx();
    }
     public class FormatSortRecOutCtx implements Cloneable {
     InRecord inRecord = Mcsort01Ctx.this.getInRecord();
     SortRec sortRec = Mcsort01Ctx.this.getSortRec();
     Work work = Mcsort01Ctx.this.getWork();

	/**
	 *	Returns the value of sortInStatus
	 *	@return sortInStatus
	 */
   public char[] getSortInStatus() throws CFException  {              
   		return work.getSortInStatus();
   }

  
	/**
	*  set variable sortInStatus
	*  @param value
	**/
   public void setSortInStatus(char[] value) throws CFException {
      work.setSortInStatus(value);
   } 

	/**
	 *	Test condition "Y" for isEofInput()
	 *	@return  Returns true if isEofInput() is "Y"
	 */
   public boolean isEofInput() throws CFException {
      return work.isEofInput();
   }

	/**
	*  set values "Y"
	*/
   	public void setEofInputTrue()  throws CFException{  			
    	work.setEofInputTrue();
   	}
	/**
	 *	Returns the value of inRecord
	 *	@return inRecord
	 */   
	 public InRecord getInRecord() {
   	return inRecord;
   }


	/**
	 *	Returns the value of sortRec
	 *	@return sortRec
	 */   
	 public SortRec getSortRec() {
   	return sortRec;
   }


	/**
	 *	Returns the value of sortRdw
	 *	@return sortRdw
	 */
	public long getSortRdw() throws CFException {        
   		return work.getSortRdw();
	}
	
	/**
	 * 	Update SortRdw with the passed value
	 *	@param number
	 */
	public void setSortRdw(long number)  throws CFException{
		work.setSortRdw(number);
	}



	/**
	 *	Returns the value of eofFlag
	 *	@return eofFlag
	 */
   public char[] getEofFlag() throws CFException  {              
   		return work.getEofFlag();
   }

  
	/**
	*  set variable eofFlag
	*  @param value
	**/
   public void setEofFlag(char[] value) throws CFException {
      work.setEofFlag(value);
   } 

	/**
	 *	Returns the value of sortInRecLen
	 *	@return sortInRecLen
	 */
	public long getSortInRecLen() throws CFException {        
   		return work.getSortInRecLen();
	}
	
	/**
	 * 	Update SortInRecLen with the passed value
	 *	@param number
	 */
	public void setSortInRecLen(long number)  throws CFException{
		work.setSortInRecLen(number);
	}




        public Mcsort01Ctx getMcsort01Ctx() {
            return Mcsort01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += inRecord.hashCode();
        str += sortRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FormatSortRecOutCtx clone() {
        FormatSortRecOutCtx cloneObj = new FormatSortRecOutCtx();
        cloneObj.inRecord = new InRecord();
        cloneObj.inRecord.set(inRecord.getClonedField());
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FormatSortRecOutCtx getFormatSortRecOutCtx() {
            return new FormatSortRecOutCtx();
    }
     public class FormatOpRecInCtx implements Cloneable {
     OutRecord outRecord = Mcsort01Ctx.this.getOutRecord();
     SortRec sortRec = Mcsort01Ctx.this.getSortRec();
     Work work = Mcsort01Ctx.this.getWork();

	/**
	 *	Returns the value of sortOutRecLen
	 *	@return sortOutRecLen
	 */
	public long getSortOutRecLen() throws CFException {        
   		return work.getSortOutRecLen();
	}
	
	/**
	 * 	Update SortOutRecLen with the passed value
	 *	@param number
	 */
	public void setSortOutRecLen(long number)  throws CFException{
		work.setSortOutRecLen(number);
	}



	/**
	 *	Returns the value of outRecord
	 *	@return outRecord
	 */   
	 public OutRecord getOutRecord() {
   	return outRecord;
   }


	/**
	 *	Returns the value of sortRec
	 *	@return sortRec
	 */   
	 public SortRec getSortRec() {
   	return sortRec;
   }


	/**
	 *	Returns the value of sortRdw
	 *	@return sortRdw
	 */
	public long getSortRdw() throws CFException {        
   		return work.getSortRdw();
	}
	
	/**
	 * 	Update SortRdw with the passed value
	 *	@param number
	 */
	public void setSortRdw(long number)  throws CFException{
		work.setSortRdw(number);
	}




        public Mcsort01Ctx getMcsort01Ctx() {
            return Mcsort01Ctx.this;
        }

        public FormatOpRecOutCtx getFormatOpRecOutCtx() {
            return new FormatOpRecOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += outRecord.hashCode();
        str += sortRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FormatOpRecInCtx clone() {
        FormatOpRecInCtx cloneObj = new FormatOpRecInCtx();
        cloneObj.outRecord = new OutRecord();
        cloneObj.outRecord.set(outRecord.getClonedField());
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FormatOpRecInCtx getFormatOpRecInCtx() {
            return new FormatOpRecInCtx();
    }
     public class FormatOpRecOutCtx implements Cloneable {
     OutRecord outRecord = Mcsort01Ctx.this.getOutRecord();
     SortRec sortRec = Mcsort01Ctx.this.getSortRec();
     Work work = Mcsort01Ctx.this.getWork();

	/**
	 *	Returns the value of sortOutRecLen
	 *	@return sortOutRecLen
	 */
	public long getSortOutRecLen() throws CFException {        
   		return work.getSortOutRecLen();
	}
	
	/**
	 * 	Update SortOutRecLen with the passed value
	 *	@param number
	 */
	public void setSortOutRecLen(long number)  throws CFException{
		work.setSortOutRecLen(number);
	}



	/**
	 *	Returns the value of sortOutStatus
	 *	@return sortOutStatus
	 */
   public char[] getSortOutStatus() throws CFException  {              
   		return work.getSortOutStatus();
   }

  
	/**
	*  set variable sortOutStatus
	*  @param value
	**/
   public void setSortOutStatus(char[] value) throws CFException {
      work.setSortOutStatus(value);
   } 

	/**
	 *	Returns the value of noRecords
	 *	@return noRecords
	 */
   public char[] getNoRecords() throws CFException  {              
   		return work.getNoRecords();
   }

  
	/**
	*  set variable noRecords
	*  @param value
	**/
   public void setNoRecords(char[] value) throws CFException {
      work.setNoRecords(value);
   } 

	/**
	 *	Returns the value of outRecord
	 *	@return outRecord
	 */   
	 public OutRecord getOutRecord() {
   	return outRecord;
   }


	/**
	 *	Returns the value of sortRec
	 *	@return sortRec
	 */   
	 public SortRec getSortRec() {
   	return sortRec;
   }


	/**
	 *	Test condition "Y" for isRecordsEnded()
	 *	@return  Returns true if isRecordsEnded() is "Y"
	 */
   public boolean isRecordsEnded() throws CFException {
      return work.isRecordsEnded();
   }

	/**
	*  set values "Y"
	*/
   	public void setRecordsEndedTrue()  throws CFException{  			
    	work.setRecordsEndedTrue();
   	}
	/**
	 *	Returns the value of sortRdw
	 *	@return sortRdw
	 */
	public long getSortRdw() throws CFException {        
   		return work.getSortRdw();
	}
	
	/**
	 * 	Update SortRdw with the passed value
	 *	@param number
	 */
	public void setSortRdw(long number)  throws CFException{
		work.setSortRdw(number);
	}




        public Mcsort01Ctx getMcsort01Ctx() {
            return Mcsort01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += outRecord.hashCode();
        str += sortRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FormatOpRecOutCtx clone() {
        FormatOpRecOutCtx cloneObj = new FormatOpRecOutCtx();
        cloneObj.outRecord = new OutRecord();
        cloneObj.outRecord.set(outRecord.getClonedField());
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FormatOpRecOutCtx getFormatOpRecOutCtx() {
            return new FormatOpRecOutCtx();
    }
}
